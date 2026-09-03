package mg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.os.Build;
import org.telegram.messenger.NotificationCenter;
public final class m extends AnimatorListenerAdapter {
    public final int f14034a;
    public final s f14035b;

    public m(s sVar, int i10) {
        this.f14034a = i10;
        this.f14035b = sVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10 = this.f14034a;
        s sVar = this.f14035b;
        switch (i10) {
            case 0:
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
                sVar.f14125c.setVisibility(4);
                if (Build.MODEL.toLowerCase().startsWith("zte") && Build.VERSION.SDK_INT <= 28) {
                    sVar.f14126f.setFocusableInTouchMode(false);
                    return;
                }
                return;
            case 1:
                sVar.f14127n.setFocusableInTouchMode(true);
                return;
            case 2:
                sVar.f14130w.setVisibility(4);
                return;
            default:
                sVar.f14127n.setFocusableInTouchMode(false);
                sVar.f14126f.setVisibility(4);
                return;
        }
    }
}
