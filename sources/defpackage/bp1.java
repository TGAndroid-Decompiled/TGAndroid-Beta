package defpackage;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
public final class bp1 implements View.OnTouchListener {
    public final byte a;
    public final int[] b;
    public final Rect c;
    public final Object d;

    public bp1(h75 h75Var, Rect rect) {
        this.a = (byte) 1;
        this.d = h75Var;
        this.c = rect;
        this.b = new int[2];
    }

    @Override
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        m65 m65Var;
        byte b = this.a;
        Object obj = this.d;
        int[] iArr = this.b;
        Rect rect = this.c;
        switch (b) {
            case 0:
                mu1 mu1Var = (mu1) obj;
                if (motionEvent.getActionMasked() == 0) {
                    m8 m8Var = mu1Var.g9;
                    if (m8Var != null && m8Var.isShowing()) {
                        View contentView = mu1Var.g9.getContentView();
                        contentView.getLocationInWindow(iArr);
                        int i = iArr[0];
                        rect.set(i, iArr[1], contentView.getMeasuredWidth() + i, contentView.getMeasuredHeight() + iArr[1]);
                        if (!rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                            mu1Var.G5(true);
                        }
                    }
                } else if (motionEvent.getActionMasked() == 4) {
                    mu1Var.G5(true);
                }
                return false;
            default:
                h75 h75Var = (h75) obj;
                if (motionEvent.getActionMasked() == 0) {
                    m65 m65Var2 = h75Var.U4;
                    if (m65Var2 != null && m65Var2.isShowing()) {
                        View contentView2 = h75Var.U4.getContentView();
                        contentView2.getLocationInWindow(iArr);
                        int i2 = iArr[0];
                        rect.set(i2, iArr[1], contentView2.getMeasuredWidth() + i2, contentView2.getMeasuredHeight() + iArr[1]);
                        if (!rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                            h75Var.U4.dismiss();
                        }
                    }
                } else if (motionEvent.getActionMasked() == 4 && (m65Var = h75Var.U4) != null && m65Var.isShowing()) {
                    h75Var.U4.dismiss();
                }
                return false;
        }
    }

    public bp1(mu1 mu1Var, Rect rect) {
        this.a = (byte) 0;
        this.d = mu1Var;
        this.c = rect;
        this.b = new int[2];
    }
}
