package defpackage;

import android.app.Activity;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
public final class l10 extends FrameLayout {
    public final byte a;
    public final j20 b;

    public l10(j20 j20Var, Activity activity, byte b) {
        super(activity);
        this.a = b;
        this.b = j20Var;
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        TextView textView;
        byte b = this.a;
        j20 j20Var = this.b;
        switch (b) {
            case 0:
                View[] viewArr = j20Var.g2;
                int D = ik8.D(248.0f, i3 - i, 4);
                for (int i5 = 0; i5 < 5; i5++) {
                    int L = (D * i5) + hl.L((i5 * 48) + 4);
                    int L2 = hl.L(9.0f);
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
                s7 s7Var = j20Var.O1;
                if (s7Var != null && (textView = j20Var.T1) != null) {
                    int left = (textView.getLeft() - hl.L(4.0f)) - s7Var.getMeasuredWidth();
                    s7Var.layout(left, s7Var.getTop(), s7Var.getMeasuredWidth() + left, s7Var.getBottom());
                    return;
                }
                return;
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.a) {
            case 1:
                j20 j20Var = this.b;
                if (j20Var.b2.getTag() != null) {
                    j20Var.R0(false, true);
                }
                return true;
            case 2:
                return true;
            default:
                return super.onTouchEvent(motionEvent);
        }
    }
}
