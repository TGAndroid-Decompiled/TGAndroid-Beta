package defpackage;

import android.app.Activity;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
public final class k20 extends FrameLayout {
    public final byte a;
    public final i30 b;

    public k20(i30 i30Var, Activity activity, byte b) {
        super(activity);
        this.a = b;
        this.b = i30Var;
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        TextView textView;
        byte b = this.a;
        i30 i30Var = this.b;
        switch (b) {
            case 0:
                View[] viewArr = i30Var.g2;
                int D = wi8.D(248.0f, i3 - i, 4);
                for (int i5 = 0; i5 < 5; i5++) {
                    int L = (D * i5) + gm.L((i5 * 48) + 4);
                    int L2 = gm.L(9.0f);
                    View view = viewArr[i5];
                    view.layout(L, L2, view.getMeasuredWidth() + L, viewArr[i5].getMeasuredHeight() + L2);
                }
                return;
            case 1:
            default:
                super.onLayout(z, i, i2, i3, i4);
                return;
            case 2:
                super.onLayout(z, i, i2, i3, i4);
                r7 r7Var = i30Var.O1;
                if (r7Var != null && (textView = i30Var.T1) != null) {
                    int left = (textView.getLeft() - gm.L(4.0f)) - r7Var.getMeasuredWidth();
                    r7Var.layout(left, r7Var.getTop(), r7Var.getMeasuredWidth() + left, r7Var.getBottom());
                    return;
                }
                return;
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.a) {
            case 1:
                i30 i30Var = this.b;
                if (i30Var.b2.getTag() != null) {
                    i30Var.Q0(false, true);
                }
                return true;
            case 2:
                return true;
            default:
                return super.onTouchEvent(motionEvent);
        }
    }
}
