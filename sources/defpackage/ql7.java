package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.KeyEvent;
import org.telegram.ui.Components.AnimatedPhoneNumberEditText;
public final class ql7 extends AnimatedPhoneNumberEditText {
    public final byte d2;
    public final rl7 e2;

    public ql7(rl7 rl7Var, Context context, byte b) {
        super(context);
        this.d2 = b;
        this.e2 = rl7Var;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        switch (this.d2) {
            case 1:
                this.N1.setColor(aob.w0(null, aob.H6, false));
                super.onDraw(canvas);
                return;
            default:
                super.onDraw(canvas);
                return;
        }
    }

    @Override
    public final void onFocusChanged(boolean z, int i, Rect rect) {
        byte b = this.d2;
        float f = 1.0f;
        rl7 rl7Var = this.e2;
        switch (b) {
            case 0:
                super.onFocusChanged(z, i, rect);
                lu7 lu7Var = rl7Var.s1;
                if (!z && !rl7Var.J1.isFocused()) {
                    f = 0.0f;
                }
                lu7Var.b(f, f, true);
                return;
            default:
                super.onFocusChanged(z, i, rect);
                lu7 lu7Var2 = rl7Var.s1;
                if (!z && !rl7Var.H1.isFocused()) {
                    f = 0.0f;
                }
                lu7Var2.b(f, f, true);
                return;
        }
    }

    @Override
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        switch (this.d2) {
            case 1:
                if (i == 67) {
                    rl7 rl7Var = this.e2;
                    if (rl7Var.J1.length() == 0) {
                        rl7Var.H1.requestFocus();
                        ql7 ql7Var = rl7Var.H1;
                        ql7Var.setSelection(ql7Var.length());
                        rl7Var.H1.dispatchKeyEvent(keyEvent);
                    }
                }
                return super.onKeyDown(i, keyEvent);
            default:
                return super.onKeyDown(i, keyEvent);
        }
    }
}
