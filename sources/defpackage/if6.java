package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.view.KeyEvent;
import android.view.MotionEvent;
import org.telegram.ui.Components.AnimatedPhoneNumberEditText;
public final class if6 extends AnimatedPhoneNumberEditText {
    public final byte c2;
    public final lf6 d2;

    public if6(lf6 lf6Var, Context context, byte b) {
        super(context);
        this.c2 = b;
        this.d2 = lf6Var;
    }

    @Override
    public final void onFocusChanged(boolean z, int i, Rect rect) {
        byte b = this.c2;
        float f = 1.0f;
        lf6 lf6Var = this.d2;
        switch (b) {
            case 0:
                super.onFocusChanged(z, i, rect);
                er7 er7Var = lf6Var.f;
                if (!z && !lf6Var.b.isFocused()) {
                    f = 0.0f;
                }
                er7Var.b(f, f, true);
                if (z) {
                    lf6Var.h0.c.setEditText(this);
                    return;
                }
                return;
            default:
                super.onFocusChanged(z, i, rect);
                mf6 mf6Var = lf6Var.h0;
                er7 er7Var2 = lf6Var.f;
                if (!z && !lf6Var.a.isFocused()) {
                    f = 0.0f;
                }
                er7Var2.b(f, f, true);
                if (z) {
                    mf6Var.c.setEditText(this);
                    mf6Var.c.setDispatchBackWhenEmpty(true);
                    if (lf6Var.F == 2) {
                        lf6.n(lf6Var, k96.M0(2131742596, null));
                        return;
                    }
                    return;
                } else if (lf6Var.F == 2) {
                    lf6.n(lf6Var, null);
                    return;
                } else {
                    return;
                }
        }
    }

    @Override
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        switch (this.c2) {
            case 1:
                lf6 lf6Var = this.d2;
                if6 if6Var = lf6Var.a;
                if (i == 67 && lf6Var.b.length() == 0) {
                    if6Var.requestFocus();
                    if6Var.setSelection(if6Var.length());
                    if6Var.dispatchKeyEvent(keyEvent);
                }
                return super.onKeyDown(i, keyEvent);
            default:
                return super.onKeyDown(i, keyEvent);
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.c2) {
            case 1:
                if (motionEvent.getAction() == 0) {
                    mf6 mf6Var = this.d2.h0;
                    short s = mf6.A0;
                    if (!mf6Var.L1(this)) {
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
