package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.view.KeyEvent;
import android.view.MotionEvent;
import org.telegram.ui.Components.AnimatedPhoneNumberEditText;
public final class mh6 extends AnimatedPhoneNumberEditText {
    public final byte d2;
    public final ph6 e2;

    public mh6(ph6 ph6Var, Context context, byte b) {
        super(context);
        this.d2 = b;
        this.e2 = ph6Var;
    }

    @Override
    public final void onFocusChanged(boolean z, int i, Rect rect) {
        byte b = this.d2;
        float f = 1.0f;
        ph6 ph6Var = this.e2;
        switch (b) {
            case 0:
                super.onFocusChanged(z, i, rect);
                lu7 lu7Var = ph6Var.f;
                if (!z && !ph6Var.b.isFocused()) {
                    f = 0.0f;
                }
                lu7Var.b(f, f, true);
                if (z) {
                    ph6Var.h0.c.setEditText(this);
                    return;
                }
                return;
            default:
                super.onFocusChanged(z, i, rect);
                qh6 qh6Var = ph6Var.h0;
                lu7 lu7Var2 = ph6Var.f;
                if (!z && !ph6Var.a.isFocused()) {
                    f = 0.0f;
                }
                lu7Var2.b(f, f, true);
                if (z) {
                    qh6Var.c.setEditText(this);
                    qh6Var.c.setDispatchBackWhenEmpty(true);
                    if (ph6Var.F == 2) {
                        ph6.n(ph6Var, ob6.M0(2131742490, null));
                        return;
                    }
                    return;
                } else if (ph6Var.F == 2) {
                    ph6.n(ph6Var, null);
                    return;
                } else {
                    return;
                }
        }
    }

    @Override
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        switch (this.d2) {
            case 1:
                ph6 ph6Var = this.e2;
                mh6 mh6Var = ph6Var.a;
                if (i == 67 && ph6Var.b.length() == 0) {
                    mh6Var.requestFocus();
                    mh6Var.setSelection(mh6Var.length());
                    mh6Var.dispatchKeyEvent(keyEvent);
                }
                return super.onKeyDown(i, keyEvent);
            default:
                return super.onKeyDown(i, keyEvent);
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.d2) {
            case 1:
                if (motionEvent.getAction() == 0) {
                    qh6 qh6Var = this.e2.h0;
                    short s = qh6.A0;
                    if (!qh6Var.M1(this)) {
                        clearFocus();
                        requestFocus();
                    }
                }
                return super.onTouchEvent(motionEvent);
            default:
                return super.onTouchEvent(motionEvent);
        }
    }
}
