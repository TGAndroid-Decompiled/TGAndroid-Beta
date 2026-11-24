package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import java.util.ArrayList;
public final class gb8 extends xna {
    public final pkb V;
    public ArrayList W;
    public boolean a0;
    public Layout b0;
    public cn c0;
    public boolean d0;
    public qa6 e0;
    public Layout f0;
    public Path g0;

    public gb8(Context context, eb8 eb8Var, pkb pkbVar, final jac jacVar, final lac lacVar) {
        super(context);
        setClearLinkOnLongPress(false);
        setDisablePaddingsOffsetY(false);
        this.G = new k66(this) {
            public final gb8 b;

            {
                this.b = this;
            }

            @Override
            public final void a(ClickableSpan clickableSpan) {
                byte b = r3;
                Object obj = jacVar;
                gb8 gb8Var = this.b;
                switch (b) {
                    case 0:
                        ((jac) obj).a(clickableSpan, gb8Var);
                        return;
                    default:
                        ((lac) obj).a(clickableSpan, gb8Var, new q78(gb8Var, (byte) 9));
                        return;
                }
            }
        };
        this.H = new k66(this) {
            public final gb8 b;

            {
                this.b = this;
            }

            @Override
            public final void a(ClickableSpan clickableSpan) {
                byte b = r3;
                Object obj = lacVar;
                gb8 gb8Var = this.b;
                switch (b) {
                    case 0:
                        ((jac) obj).a(clickableSpan, gb8Var);
                        return;
                    default:
                        ((lac) obj).a(clickableSpan, gb8Var, new q78(gb8Var, (byte) 9));
                        return;
                }
            }
        };
        this.V = pkbVar;
        vze.a(this, 16.0f, 8.0f, 16.0f, 8.0f);
        setLinkTextColor(-8796932);
        setTextColor(-1);
        setHighlightColor(872415231);
        setGravity(qoe.y() | 16);
        setTextSize(1, 16.0f);
        setOnClickListener(new m67(eb8Var, (byte) 17));
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r21) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gb8.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        gn.release(this, this.c0);
        this.W = f09.e(null, this.W);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        pkb pkbVar = this.V;
        if (pkbVar != null && pkbVar.w()) {
            canvas.save();
            canvas.translate(getPaddingLeft(), getPaddingTop());
            if (getStaticTextLayout() != null && pkbVar.p0 == this) {
                pkbVar.V(canvas);
            }
            canvas.restore();
        }
        super.onDraw(canvas);
        if (this.b0 != getLayout()) {
            boolean z = true;
            int i = 0;
            this.c0 = gn.update(0, this, this.c0, getLayout());
            this.W = f09.e(getLayout(), this.W);
            if (getLayout() == null || !(getLayout().getText() instanceof Spanned) || ((e09[]) ((Spanned) getLayout().getText()).getSpans(0, getLayout().getText().length(), e09.class)).length <= 0) {
                z = false;
            }
            this.a0 = z;
            if (z) {
                i = 32;
            }
            vze.a(this, 16.0f, 8.0f, i + 16, 8.0f);
            this.b0 = getLayout();
        }
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        this.c0 = gn.update(0, this, this.c0, getLayout());
        this.W = f09.e(getLayout(), this.W);
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
