package kg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.os.Build;
import org.telegram.messenger.NotificationCenter;
public final class m extends AnimatorListenerAdapter {
    public final int f13762a;
    public final s f13763b;

    public m(s sVar, int i10) {
        this.f13762a = i10;
        this.f13763b = sVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10 = this.f13762a;
        s sVar = this.f13763b;
        switch (i10) {
            case 0:
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
                sVar.f13856c.setVisibility(4);
                if (Build.MODEL.toLowerCase().startsWith("zte") && Build.VERSION.SDK_INT <= 28) {
                    sVar.f13858f.setFocusableInTouchMode(false);
                    return;
                }
                return;
            case 1:
                sVar.f13859n.setFocusableInTouchMode(true);
                return;
            case 2:
                sVar.f13862w.setVisibility(4);
                return;
            default:
                sVar.f13859n.setFocusableInTouchMode(false);
                sVar.f13858f.setVisibility(4);
                return;
        }
    }
}
