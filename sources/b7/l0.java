package b7;

import android.animation.AnimatorSet;
import android.graphics.Point;
import android.widget.FrameLayout;
import androidx.appcompat.widget.ActionBarContextView;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.MessageDigest;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.bz;
import org.telegram.ui.Components.eg;
import org.telegram.ui.Components.ff;
import org.telegram.ui.Components.ox;
import org.telegram.ui.Components.qv0;
public final class l0 implements r0.n0, ox {
    public boolean f1710a;
    public int f1711b;
    public Object f1712c;

    public l0(FrameLayout frameLayout) {
        this.f1712c = frameLayout;
    }

    @Override
    public void a() {
        this.f1710a = true;
    }

    @Override
    public void b() {
        super/*android.view.ViewGroup*/.setVisibility(0);
        this.f1710a = false;
    }

    @Override
    public void c() {
        if (this.f1710a) {
            return;
        }
        ActionBarContextView actionBarContextView = (ActionBarContextView) this.f1712c;
        actionBarContextView.f403f = null;
        super/*android.view.ViewGroup*/.setVisibility(this.f1711b);
    }

    public boolean d() {
        bz bzVar;
        ff ffVar;
        ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.f1712c;
        if (chatActivityEnterView.f22813t3) {
            if ((chatActivityEnterView.f22823v3 || (ffVar = chatActivityEnterView.B0) == null || ffVar.length() <= 0) && (bzVar = chatActivityEnterView.R0.f26488v0) != null && bzVar.h() > 0 && !chatActivityEnterView.f22744g3) {
                return true;
            }
            return false;
        }
        return false;
    }

    public void e() {
        int i10;
        ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.f1712c;
        qv0 qv0Var = chatActivityEnterView.f22754i1;
        if (d()) {
            AnimatorSet animatorSet = chatActivityEnterView.f22835x3;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            chatActivityEnterView.A3 = true;
            this.f1710a = chatActivityEnterView.f22823v3;
            chatActivityEnterView.f22823v3 = true;
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 1);
            int height = ((((qv0Var.getHeight() - AndroidUtilities.statusBarHeight) - AndroidUtilities.navigationBarHeight) - AndroidUtilities.dp(6.0f)) - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - chatActivityEnterView.getHeight();
            chatActivityEnterView.f22846z3 = height;
            if (chatActivityEnterView.N1 == 2) {
                int dp = AndroidUtilities.dp(175.0f);
                Point point = AndroidUtilities.displaySize;
                if (point.x > point.y) {
                    i10 = chatActivityEnterView.f22817u2;
                } else {
                    i10 = chatActivityEnterView.f22812t2;
                }
                chatActivityEnterView.f22846z3 = Math.min(height, dp + i10);
            }
            if (chatActivityEnterView.Z4 == null) {
                chatActivityEnterView.R0.getLayoutParams().height = chatActivityEnterView.f22846z3;
            }
            chatActivityEnterView.R0.setLayerType(2, null);
            qv0Var.requestLayout();
            if (chatActivityEnterView.f22819u4) {
                qv0Var.setForeground(new df.f(chatActivityEnterView));
            }
            this.f1711b = (int) chatActivityEnterView.getTranslationY();
            eg egVar = chatActivityEnterView.V2;
            if (egVar != null) {
                egVar.x1();
            }
        }
    }

    public l0(MessageDigest messageDigest, int i10) {
        ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN);
        this.f1712c = messageDigest;
        this.f1711b = i10;
    }
}
