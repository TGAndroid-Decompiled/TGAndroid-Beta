package mg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.os.Build;
import org.telegram.messenger.NotificationCenter;
public final class m extends AnimatorListenerAdapter {
    public final int f14046a;
    public final s f14047b;

    public m(s sVar, int i10) {
        this.f14046a = i10;
        this.f14047b = sVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10 = this.f14046a;
        s sVar = this.f14047b;
        switch (i10) {
            case 0:
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
                sVar.f14137c.setVisibility(4);
                if (Build.MODEL.toLowerCase().startsWith("zte") && Build.VERSION.SDK_INT <= 28) {
                    sVar.f14138f.setFocusableInTouchMode(false);
                    return;
                }
                return;
            case 1:
                sVar.f14139n.setFocusableInTouchMode(true);
                return;
            case 2:
                sVar.f14142w.setVisibility(4);
                return;
            default:
                sVar.f14139n.setFocusableInTouchMode(false);
                sVar.f14138f.setVisibility(4);
                return;
        }
    }
}
