package ig;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.os.Build;
import org.telegram.messenger.NotificationCenter;

public final class m extends AnimatorListenerAdapter {

    public final int f11349a;

    public final s f11350b;

    public m(s sVar, int i10) {
        this.f11349a = i10;
        this.f11350b = sVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10 = this.f11349a;
        s sVar = this.f11350b;
        switch (i10) {
            case 0:
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
                sVar.f11443c.setVisibility(4);
                if (Build.MODEL.toLowerCase().startsWith("zte") && Build.VERSION.SDK_INT <= 28) {
                    sVar.f11445f.setFocusableInTouchMode(false);
                    break;
                }
                break;
            case 1:
                sVar.f11446n.setFocusableInTouchMode(true);
                break;
            case 2:
                sVar.f11449w.setVisibility(4);
                break;
            default:
                sVar.f11446n.setFocusableInTouchMode(false);
                sVar.f11445f.setVisibility(4);
                break;
        }
    }
}
