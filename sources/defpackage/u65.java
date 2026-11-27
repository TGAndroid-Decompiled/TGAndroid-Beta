package defpackage;

import android.view.MotionEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import java.util.ArrayList;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.ui.LaunchActivity;
public final class u65 extends e29 {
    public final j95 r;

    public u65(j95 j95Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.r = j95Var;
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        boolean z;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
        j95 j95Var = this.r;
        byte b = j95Var.z3;
        if (b != 0 && b != 1) {
            z = false;
        } else {
            z = true;
        }
        accessibilityNodeInfo.setEnabled(z);
        if (j95Var.z3 == 1) {
            accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(16, ob6.M0(2131742945, null)));
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        j95 j95Var = this.r;
        z55 z55Var = j95Var.q4;
        ArrayList arrayList = j95Var.S3;
        if (motionEvent.getAction() == 0 && j95Var.z3 == 0 && j95Var.T2 != null) {
            hl.d3(z55Var, 300L);
            j95Var.K3 = true;
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            if (j95Var.K3) {
                hl.r(z55Var);
                j95Var.K3 = false;
            } else if (j95Var.L3) {
                hl.r(j95Var.p4);
                j95Var.I1(0, true);
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().setMicMute(true, true, false);
                    try {
                        j95Var.v1.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                }
                arrayList.clear();
                arrayList.addAll(j95Var.R3);
                for (int i = 0; i < arrayList.size(); i++) {
                    ((ka5) arrayList.get(i)).j(true);
                }
                j95Var.L3 = false;
                MotionEvent obtain = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
                super.onTouchEvent(obtain);
                obtain.recycle();
                return true;
            }
        }
        return super.onTouchEvent(motionEvent);
    }
}
