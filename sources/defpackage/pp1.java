package defpackage;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
public final class pp1 implements View.OnTouchListener {
    public final byte a;
    public final int[] b;
    public final Rect c;
    public final Object d;

    public pp1(j95 j95Var, Rect rect) {
        this.a = (byte) 1;
        this.d = j95Var;
        this.c = rect;
        this.b = new int[2];
    }

    @Override
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        o85 o85Var;
        byte b = this.a;
        Object obj = this.d;
        int[] iArr = this.b;
        Rect rect = this.c;
        switch (b) {
            case 0:
                zu1 zu1Var = (zu1) obj;
                if (motionEvent.getActionMasked() == 0) {
                    n8 n8Var = zu1Var.g9;
                    if (n8Var != null && n8Var.isShowing()) {
                        View contentView = zu1Var.g9.getContentView();
                        contentView.getLocationInWindow(iArr);
                        int i = iArr[0];
                        rect.set(i, iArr[1], contentView.getMeasuredWidth() + i, contentView.getMeasuredHeight() + iArr[1]);
                        if (!rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                            zu1Var.M5(true);
                        }
                    }
                } else if (motionEvent.getActionMasked() == 4) {
                    zu1Var.M5(true);
                }
                return false;
            default:
                j95 j95Var = (j95) obj;
                if (motionEvent.getActionMasked() == 0) {
                    o85 o85Var2 = j95Var.U4;
                    if (o85Var2 != null && o85Var2.isShowing()) {
                        View contentView2 = j95Var.U4.getContentView();
                        contentView2.getLocationInWindow(iArr);
                        int i2 = iArr[0];
                        rect.set(i2, iArr[1], contentView2.getMeasuredWidth() + i2, contentView2.getMeasuredHeight() + iArr[1]);
                        if (!rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                            j95Var.U4.dismiss();
                        }
                    }
                } else if (motionEvent.getActionMasked() == 4 && (o85Var = j95Var.U4) != null && o85Var.isShowing()) {
                    j95Var.U4.dismiss();
                }
                return false;
        }
    }

    public pp1(zu1 zu1Var, Rect rect) {
        this.a = (byte) 0;
        this.d = zu1Var;
        this.c = rect;
        this.b = new int[2];
    }
}
