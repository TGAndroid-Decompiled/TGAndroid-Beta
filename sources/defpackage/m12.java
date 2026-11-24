package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MotionEvent;
import org.telegram.ui.ActionBar.d;
public final class m12 extends cv3 {
    public final i22 W;

    public m12(i22 i22Var, Context context, v12 v12Var, ylb ylbVar) {
        super(context, v12Var, null, 1, true, ylbVar);
        this.W = i22Var;
    }

    @Override
    public final void f() {
        super.f();
        e34 emojiView = getEmojiView();
        if (emojiView != null) {
            emojiView.x0 = false;
            emojiView.x2 = false;
            emojiView.setShouldDrawBackground(false);
            emojiView.setBottomInset(gm.n);
        }
    }

    @Override
    public final void i(ActionMode actionMode, Menu menu) {
        d dVar = this.W.Z1;
        if (dVar instanceof yv1) {
            yv1.E6(menu, ((yv1) dVar).h, true, true, true, true);
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        i22 i22Var = this.W;
        m12 m12Var = i22Var.M2;
        if (!i22Var.r3) {
            if (motionEvent.getX() > m12Var.getEditText().getLeft() && motionEvent.getX() < m12Var.getEditText().getRight() && motionEvent.getY() > m12Var.getEditText().getTop() && motionEvent.getY() < m12Var.getEditText().getBottom()) {
                i22Var.c1(m12Var.getEditText(), true);
            } else {
                i22Var.c1(m12Var.getEditText(), false);
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
        i22 i22Var = this.W;
        i22Var.L1();
        if (i22Var.W1) {
            if (i2 > 2 && !TextUtils.isEmpty(getEditText().getText().toString().trim())) {
                z = true;
            } else {
                z = false;
            }
            i22Var.w1(z);
        }
    }
}
