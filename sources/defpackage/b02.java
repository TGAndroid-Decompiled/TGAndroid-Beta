package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MotionEvent;
import org.telegram.ui.ActionBar.d;
public final class b02 extends rt3 {
    public final x02 W;

    public b02(x02 x02Var, Context context, k02 k02Var, wjb wjbVar) {
        super(context, k02Var, null, 1, true, wjbVar);
        this.W = x02Var;
    }

    @Override
    public final void f() {
        super.f();
        t14 emojiView = getEmojiView();
        if (emojiView != null) {
            emojiView.x0 = false;
            emojiView.x2 = false;
            emojiView.setShouldDrawBackground(false);
            emojiView.setBottomInset(gl.n);
        }
    }

    @Override
    public final void i(ActionMode actionMode, Menu menu) {
        d dVar = this.W.Z1;
        if (dVar instanceof mu1) {
            mu1.v6(menu, ((mu1) dVar).h, true, true, true, true);
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        x02 x02Var = this.W;
        b02 b02Var = x02Var.M2;
        if (!x02Var.r3) {
            if (motionEvent.getX() > b02Var.getEditText().getLeft() && motionEvent.getX() < b02Var.getEditText().getRight() && motionEvent.getY() > b02Var.getEditText().getTop() && motionEvent.getY() < b02Var.getEditText().getBottom()) {
                x02Var.c1(b02Var.getEditText(), true);
            } else {
                x02Var.c1(b02Var.getEditText(), false);
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.W.L1();
    }

    @Override
    public final void q(int i, int i2) {
        boolean z;
        x02 x02Var = this.W;
        x02Var.L1();
        if (x02Var.W1) {
            if (i2 > 2 && !TextUtils.isEmpty(getEditText().getText().toString().trim())) {
                z = true;
            } else {
                z = false;
            }
            x02Var.w1(z);
        }
    }
}
