package defpackage;

import android.view.MotionEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import java.util.ArrayList;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.ui.LaunchActivity;
public final class s45 extends ry8 {
    public final h75 r;

    public s45(h75 h75Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.r = h75Var;
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        boolean z;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
        h75 h75Var = this.r;
        byte b = h75Var.z3;
        if (b != 0 && b != 1) {
            z = false;
        } else {
            z = true;
        }
        accessibilityNodeInfo.setEnabled(z);
        if (h75Var.z3 == 1) {
            accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(16, k96.M0(2131743051, null)));
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        h75 h75Var = this.r;
        w35 w35Var = h75Var.q4;
        ArrayList arrayList = h75Var.S3;
        if (motionEvent.getAction() == 0 && h75Var.z3 == 0 && h75Var.T2 != null) {
            gl.e3(w35Var, 300L);
            h75Var.K3 = true;
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            if (h75Var.K3) {
                gl.r(w35Var);
                h75Var.K3 = false;
            } else if (h75Var.L3) {
                gl.r(h75Var.p4);
                h75Var.H1(0, true);
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().setMicMute(true, true, false);
                    try {
                        h75Var.v1.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                }
                arrayList.clear();
                arrayList.addAll(h75Var.R3);
                for (int i = 0; i < arrayList.size(); i++) {
                    ((h85) arrayList.get(i)).j(true);
                }
                h75Var.L3 = false;
                MotionEvent obtain = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
                super.onTouchEvent(obtain);
                obtain.recycle();
                return true;
            }
        }
        return super.onTouchEvent(motionEvent);
    }
}
