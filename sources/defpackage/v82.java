package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import org.telegram.ui.ActionBar.d;
public final class v82 extends bf0 {
    public final u82 H;
    public final d I;
    public final boolean J;
    public final ylb K;
    public final z82 L;

    public v82(z82 z82Var, Context context, d dVar, boolean z, ylb ylbVar) {
        super(context);
        this.L = z82Var;
        this.I = dVar;
        this.J = z;
        this.K = ylbVar;
        this.H = new u82(this);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        long j;
        z82 z82Var = this.L;
        if (z82Var.b && this.e == null) {
            u82 u82Var = this.H;
            u82Var.F.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
            u82Var.a = true;
            u82Var.v = true;
            u82Var.J = this.K;
            Integer num = z82Var.c;
            if (num != null) {
                u82Var.z = num.intValue();
            }
            yv1 yv1Var = z82Var.H;
            if (yv1Var != null) {
                j = yv1Var.a();
            } else {
                d dVar = this.I;
                if (dVar instanceof sxb) {
                    j = -((sxb) dVar).a;
                } else {
                    j = 0;
                }
            }
            y4b.h(j, canvas, this.a, u82Var);
            return;
        }
        super.onDraw(canvas);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (this.J && getImageReceiver().E()) {
            accessibilityNodeInfo.setText(jb6.M0(2131754797, null));
            accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(16, jb6.M0(2131747550, null)));
            return;
        }
        accessibilityNodeInfo.setVisibleToUser(false);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.L.b && this.H.a(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }
}
