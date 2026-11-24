package defpackage;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
public final class oq1 implements View.OnTouchListener {
    public final byte a;
    public final int[] b;
    public final Rect c;
    public final Object d;

    public oq1(g95 g95Var, Rect rect) {
        this.a = (byte) 1;
        this.d = g95Var;
        this.c = rect;
        this.b = new int[2];
    }

    @Override
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        k85 k85Var;
        byte b = this.a;
        Object obj = this.d;
        int[] iArr = this.b;
        Rect rect = this.c;
        switch (b) {
            case 0:
                yv1 yv1Var = (yv1) obj;
                if (motionEvent.getActionMasked() == 0) {
                    m8 m8Var = yv1Var.g9;
                    if (m8Var != null && m8Var.isShowing()) {
                        View contentView = yv1Var.g9.getContentView();
                        contentView.getLocationInWindow(iArr);
                        int i = iArr[0];
                        rect.set(i, iArr[1], contentView.getMeasuredWidth() + i, contentView.getMeasuredHeight() + iArr[1]);
                        if (!rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                            yv1Var.N5(true);
                        }
                    }
                } else if (motionEvent.getActionMasked() == 4) {
                    yv1Var.N5(true);
                }
                return false;
            default:
                g95 g95Var = (g95) obj;
                if (motionEvent.getActionMasked() == 0) {
                    k85 k85Var2 = g95Var.U4;
                    if (k85Var2 != null && k85Var2.isShowing()) {
                        View contentView2 = g95Var.U4.getContentView();
                        contentView2.getLocationInWindow(iArr);
                        int i2 = iArr[0];
                        rect.set(i2, iArr[1], contentView2.getMeasuredWidth() + i2, contentView2.getMeasuredHeight() + iArr[1]);
                        if (!rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                            g95Var.U4.dismiss();
                        }
                    }
                } else if (motionEvent.getActionMasked() == 4 && (k85Var = g95Var.U4) != null && k85Var.isShowing()) {
                    g95Var.U4.dismiss();
                }
                return false;
        }
    }

    public oq1(yv1 yv1Var, Rect rect) {
        this.a = (byte) 0;
        this.d = yv1Var;
        this.c = rect;
        this.b = new int[2];
    }
}
