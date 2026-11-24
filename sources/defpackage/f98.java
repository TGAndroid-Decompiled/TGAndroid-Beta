package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import java.util.ArrayList;
public final class f98 extends wla {
    public final oib V;
    public ArrayList W;
    public boolean a0;
    public Layout b0;
    public cm c0;
    public boolean d0;
    public r86 e0;
    public Layout f0;
    public Path g0;

    public f98(Context context, d98 d98Var, oib oibVar, final i8c i8cVar, final k8c k8cVar) {
        super(context);
        setClearLinkOnLongPress(false);
        setDisablePaddingsOffsetY(false);
        this.G = new k46(this) {
            public final f98 b;

            {
                this.b = this;
            }

            @Override
            public final void a(ClickableSpan clickableSpan) {
                byte b = r3;
                Object obj = i8cVar;
                f98 f98Var = this.b;
                switch (b) {
                    case 0:
                        ((i8c) obj).a(clickableSpan, f98Var);
                        return;
                    default:
                        ((k8c) obj).a(clickableSpan, f98Var, new w88(f98Var, (byte) 2));
                        return;
                }
            }
        };
        this.H = new k46(this) {
            public final f98 b;

            {
                this.b = this;
            }

            @Override
            public final void a(ClickableSpan clickableSpan) {
                byte b = r3;
                Object obj = k8cVar;
                f98 f98Var = this.b;
                switch (b) {
                    case 0:
                        ((i8c) obj).a(clickableSpan, f98Var);
                        return;
                    default:
                        ((k8c) obj).a(clickableSpan, f98Var, new w88(f98Var, (byte) 2));
                        return;
                }
            }
        };
        this.V = oibVar;
        txe.a(this, 16.0f, 8.0f, 16.0f, 8.0f);
        setLinkTextColor(-8796932);
        setTextColor(-1);
        setHighlightColor(872415231);
        setGravity(nme.y() | 16);
        setTextSize(1, 16.0f);
        setOnClickListener(new fr7(d98Var, (byte) 14));
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r21) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.f98.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        gm.release(this, this.c0);
        this.W = ey8.e(null, this.W);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        oib oibVar = this.V;
        if (oibVar != null && oibVar.w()) {
            canvas.save();
            canvas.translate(getPaddingLeft(), getPaddingTop());
            if (getStaticTextLayout() != null && oibVar.p0 == this) {
                oibVar.V(canvas);
            }
            canvas.restore();
        }
        super.onDraw(canvas);
        if (this.b0 != getLayout()) {
            boolean z = true;
            int i = 0;
            this.c0 = gm.update(0, this, this.c0, getLayout());
            this.W = ey8.e(getLayout(), this.W);
            if (getLayout() == null || !(getLayout().getText() instanceof Spanned) || ((dy8[]) ((Spanned) getLayout().getText()).getSpans(0, getLayout().getText().length(), dy8.class)).length <= 0) {
                z = false;
            }
            this.a0 = z;
            if (z) {
                i = 32;
            }
            txe.a(this, 16.0f, 8.0f, i + 16, 8.0f);
            this.b0 = getLayout();
        }
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        this.c0 = gm.update(0, this, this.c0, getLayout());
        this.W = ey8.e(getLayout(), this.W);
    }

    public void setLoading(boolean z) {
        if (this.d0 == z) {
            return;
        }
        this.d0 = z;
        invalidate();
    }

    @Override
    public void setPressed(boolean z) {
        boolean z2;
        if (z != isPressed()) {
            z2 = true;
        } else {
            z2 = false;
        }
        super.setPressed(z);
        if (z2) {
            invalidate();
        }
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.e0 && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
