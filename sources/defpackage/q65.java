package defpackage;

import android.view.MotionEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import java.util.ArrayList;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.ui.LaunchActivity;
public final class q65 extends s09 {
    public final g95 r;

    public q65(g95 g95Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.r = g95Var;
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        boolean z;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
        g95 g95Var = this.r;
        byte b = g95Var.z3;
        if (b != 0 && b != 1) {
            z = false;
        } else {
            z = true;
        }
        accessibilityNodeInfo.setEnabled(z);
        if (g95Var.z3 == 1) {
            accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(16, jb6.M0(2131742977, null)));
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        g95 g95Var = this.r;
        v55 v55Var = g95Var.q4;
        ArrayList arrayList = g95Var.S3;
        if (motionEvent.getAction() == 0 && g95Var.z3 == 0 && g95Var.T2 != null) {
            gm.d3(v55Var, 300L);
            g95Var.K3 = true;
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            if (g95Var.K3) {
                gm.r(v55Var);
                g95Var.K3 = false;
            } else if (g95Var.L3) {
                gm.r(g95Var.p4);
                g95Var.H1(0, true);
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().setMicMute(true, true, false);
                    try {
                        g95Var.v1.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                }
                arrayList.clear();
                arrayList.addAll(g95Var.R3);
                for (int i = 0; i < arrayList.size(); i++) {
                    ((ha5) arrayList.get(i)).j(true);
                }
                g95Var.L3 = false;
                MotionEvent obtain = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
                super.onTouchEvent(obtain);
                obtain.recycle();
                return true;
            }
        }
        return super.onTouchEvent(motionEvent);
    }
}
