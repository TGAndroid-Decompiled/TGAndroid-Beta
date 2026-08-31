package ng;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.os.Build;
import org.telegram.messenger.NotificationCenter;
public final class m extends AnimatorListenerAdapter {
    public final int f16114a;
    public final s f16115b;

    public m(s sVar, int i10) {
        this.f16114a = i10;
        this.f16115b = sVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10 = this.f16114a;
        s sVar = this.f16115b;
        switch (i10) {
            case 0:
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
                sVar.f16209c.setVisibility(4);
                if (Build.MODEL.toLowerCase().startsWith("zte") && Build.VERSION.SDK_INT <= 28) {
                    sVar.f16211f.setFocusableInTouchMode(false);
                    return;
                }
                return;
            case 1:
                sVar.f16212n.setFocusableInTouchMode(true);
                return;
            case 2:
                sVar.f16215w.setVisibility(4);
                return;
            default:
                sVar.f16212n.setFocusableInTouchMode(false);
                sVar.f16211f.setVisibility(4);
                return;
        }
    }
}
