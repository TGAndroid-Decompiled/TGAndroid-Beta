package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.view.KeyEvent;
import android.view.MotionEvent;
import org.telegram.ui.Components.AnimatedPhoneNumberEditText;
public final class jh6 extends AnimatedPhoneNumberEditText {
    public final byte c2;
    public final lh6 d2;

    public jh6(lh6 lh6Var, Context context, byte b) {
        super(context);
        this.c2 = b;
        this.d2 = lh6Var;
    }

    @Override
    public final void onFocusChanged(boolean z, int i, Rect rect) {
        byte b = this.c2;
        float f = 1.0f;
        lh6 lh6Var = this.d2;
        switch (b) {
            case 0:
                super.onFocusChanged(z, i, rect);
                gt7 gt7Var = lh6Var.f;
                if (!z && !lh6Var.b.isFocused()) {
                    f = 0.0f;
                }
                gt7Var.b(f, f, true);
                if (z) {
                    lh6Var.h0.c.setEditText(this);
                    return;
                }
                return;
            default:
                super.onFocusChanged(z, i, rect);
                mh6 mh6Var = lh6Var.h0;
                gt7 gt7Var2 = lh6Var.f;
                if (!z && !lh6Var.a.isFocused()) {
                    f = 0.0f;
                }
                gt7Var2.b(f, f, true);
                if (z) {
                    mh6Var.c.setEditText(this);
                    mh6Var.c.setDispatchBackWhenEmpty(true);
                    if (lh6Var.F == 2) {
                        lh6.n(lh6Var, jb6.M0(2131742522, null));
                        return;
                    }
                    return;
                } else if (lh6Var.F == 2) {
                    lh6.n(lh6Var, null);
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
                lh6 lh6Var = this.d2;
                jh6 jh6Var = lh6Var.a;
                if (i == 67 && lh6Var.b.length() == 0) {
                    jh6Var.requestFocus();
                    jh6Var.setSelection(jh6Var.length());
                    jh6Var.dispatchKeyEvent(keyEvent);
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
                    mh6 mh6Var = this.d2.h0;
                    short s = mh6.A0;
                    if (!mh6Var.M1(this)) {
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
