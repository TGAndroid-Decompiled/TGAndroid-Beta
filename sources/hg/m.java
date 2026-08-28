package hg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.os.Build;
import org.telegram.messenger.NotificationCenter;
public final class m extends AnimatorListenerAdapter {
    public final int f10643a;
    public final s f10644b;

    public m(s sVar, int i9) {
        this.f10643a = i9;
        this.f10644b = sVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i9 = this.f10643a;
        s sVar = this.f10644b;
        switch (i9) {
            case 0:
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
                sVar.f10721c.setVisibility(4);
                if (Build.MODEL.toLowerCase().startsWith("zte") && Build.VERSION.SDK_INT <= 28) {
                    sVar.f10723f.setFocusableInTouchMode(false);
                    return;
                }
                return;
            case 1:
                sVar.f10724n.setFocusableInTouchMode(true);
                return;
            case 2:
                sVar.f10727w.setVisibility(4);
                return;
            default:
                sVar.f10724n.setFocusableInTouchMode(false);
                sVar.f10723f.setVisibility(4);
                return;
        }
    }
}
