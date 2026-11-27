package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MotionEvent;
import org.telegram.ui.ActionBar.e;
public final class r02 extends iu3 {
    public final n12 W;

    public r02(n12 n12Var, Context context, a12 a12Var, vnb vnbVar) {
        super(context, a12Var, null, 1, true, vnbVar);
        this.W = n12Var;
    }

    @Override
    public final void f() {
        super.f();
        o24 emojiView = getEmojiView();
        if (emojiView != null) {
            emojiView.x0 = false;
            emojiView.x2 = false;
            emojiView.setShouldDrawBackground(false);
            emojiView.setBottomInset(hl.n);
        }
    }

    @Override
    public final void i(ActionMode actionMode, Menu menu) {
        e eVar = this.W.Z1;
        if (eVar instanceof zu1) {
            zu1.E6(menu, ((zu1) eVar).h, true, true, true, true);
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        n12 n12Var = this.W;
        r02 r02Var = n12Var.M2;
        if (!n12Var.r3) {
            if (motionEvent.getX() > r02Var.getEditText().getLeft() && motionEvent.getX() < r02Var.getEditText().getRight() && motionEvent.getY() > r02Var.getEditText().getTop() && motionEvent.getY() < r02Var.getEditText().getBottom()) {
                n12Var.d1(r02Var.getEditText(), true);
            } else {
                n12Var.d1(r02Var.getEditText(), false);
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.W.M1();
    }

    @Override
    public final void q(int i, int i2) {
        boolean z;
        n12 n12Var = this.W;
        n12Var.M1();
        if (n12Var.W1) {
            if (i2 > 2 && !TextUtils.isEmpty(getEditText().getText().toString().trim())) {
                z = true;
            } else {
                z = false;
            }
            n12Var.x1(z);
        }
    }
}
