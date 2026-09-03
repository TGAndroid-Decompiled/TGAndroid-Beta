package ng;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.os.Build;
import org.telegram.messenger.NotificationCenter;
public final class m extends AnimatorListenerAdapter {
    public final int f16116a;
    public final s f16117b;

    public m(s sVar, int i10) {
        this.f16116a = i10;
        this.f16117b = sVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10 = this.f16116a;
        s sVar = this.f16117b;
        switch (i10) {
            case 0:
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
                sVar.f16211c.setVisibility(4);
                if (Build.MODEL.toLowerCase().startsWith("zte") && Build.VERSION.SDK_INT <= 28) {
                    sVar.f16213f.setFocusableInTouchMode(false);
                    return;
                }
                return;
            case 1:
                sVar.f16214n.setFocusableInTouchMode(true);
                return;
            case 2:
                sVar.f16217w.setVisibility(4);
                return;
            default:
                sVar.f16214n.setFocusableInTouchMode(false);
                sVar.f16213f.setVisibility(4);
                return;
        }
    }
}
