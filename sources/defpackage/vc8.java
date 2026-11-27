package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import java.util.ArrayList;
public final class vc8 extends tpa {
    public final jmb V;
    public ArrayList W;
    public boolean a0;
    public Layout b0;
    public dm c0;
    public boolean d0;
    public va6 e0;
    public Layout f0;
    public Path g0;

    public vc8(Context context, tc8 tc8Var, jmb jmbVar, final icc iccVar, final kcc kccVar) {
        super(context);
        setClearLinkOnLongPress(false);
        setDisablePaddingsOffsetY(false);
        this.G = new o66(this) {
            public final vc8 b;

            {
                this.b = this;
            }

            @Override
            public final void a(ClickableSpan clickableSpan) {
                byte b = r3;
                Object obj = iccVar;
                vc8 vc8Var = this.b;
                switch (b) {
                    case 0:
                        ((icc) obj).a(clickableSpan, vc8Var);
                        return;
                    default:
                        ((kcc) obj).a(clickableSpan, vc8Var, new x38(vc8Var, (byte) 17));
                        return;
                }
            }
        };
        this.H = new o66(this) {
            public final vc8 b;

            {
                this.b = this;
            }

            @Override
            public final void a(ClickableSpan clickableSpan) {
                byte b = r3;
                Object obj = kccVar;
                vc8 vc8Var = this.b;
                switch (b) {
                    case 0:
                        ((icc) obj).a(clickableSpan, vc8Var);
                        return;
                    default:
                        ((kcc) obj).a(clickableSpan, vc8Var, new x38(vc8Var, (byte) 17));
                        return;
                }
            }
        };
        this.V = jmbVar;
        l2f.a(this, 16.0f, 8.0f, 16.0f, 8.0f);
        setLinkTextColor(-8796932);
        setTextColor(-1);
        setHighlightColor(872415231);
        setGravity(tre.y() | 16);
        setTextSize(1, 16.0f);
        setOnClickListener(new am7(tc8Var, (byte) 16));
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r21) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vc8.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        hm.release(this, this.c0);
        this.W = r19.e(null, this.W);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        jmb jmbVar = this.V;
        if (jmbVar != null && jmbVar.w()) {
            canvas.save();
            canvas.translate(getPaddingLeft(), getPaddingTop());
            if (getStaticTextLayout() != null && jmbVar.p0 == this) {
                jmbVar.V(canvas);
            }
            canvas.restore();
        }
        super.onDraw(canvas);
        if (this.b0 != getLayout()) {
            boolean z = true;
            int i = 0;
            this.c0 = hm.update(0, this, this.c0, getLayout());
            this.W = r19.e(getLayout(), this.W);
            if (getLayout() == null || !(getLayout().getText() instanceof Spanned) || ((q19[]) ((Spanned) getLayout().getText()).getSpans(0, getLayout().getText().length(), q19.class)).length <= 0) {
                z = false;
            }
            this.a0 = z;
            if (z) {
                i = 32;
            }
            l2f.a(this, 16.0f, 8.0f, i + 16, 8.0f);
            this.b0 = getLayout();
        }
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        this.c0 = hm.update(0, this, this.c0, getLayout());
        this.W = r19.e(getLayout(), this.W);
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
