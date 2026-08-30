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
    public boolean f1699a;
    public int f1700b;
    public Object f1701c;

    public l0(FrameLayout frameLayout) {
        this.f1701c = frameLayout;
    }

    @Override
    public void a() {
        this.f1699a = true;
    }

    @Override
    public void b() {
        super/*android.view.ViewGroup*/.setVisibility(0);
        this.f1699a = false;
    }

    @Override
    public void c() {
        if (this.f1699a) {
            return;
        }
        ActionBarContextView actionBarContextView = (ActionBarContextView) this.f1701c;
        actionBarContextView.f388f = null;
        super/*android.view.ViewGroup*/.setVisibility(this.f1700b);
    }

    public boolean d() {
        bz bzVar;
        ff ffVar;
        ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.f1701c;
        if (chatActivityEnterView.f22840t3) {
            if ((chatActivityEnterView.f22850v3 || (ffVar = chatActivityEnterView.B0) == null || ffVar.length() <= 0) && (bzVar = chatActivityEnterView.R0.f26476v0) != null && bzVar.h() > 0 && !chatActivityEnterView.f22771g3) {
                return true;
            }
            return false;
        }
        return false;
    }

    public void e() {
        int i10;
        ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.f1701c;
        qv0 qv0Var = chatActivityEnterView.f22781i1;
        if (d()) {
            AnimatorSet animatorSet = chatActivityEnterView.f22862x3;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            chatActivityEnterView.A3 = true;
            this.f1699a = chatActivityEnterView.f22850v3;
            chatActivityEnterView.f22850v3 = true;
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 1);
            int height = ((((qv0Var.getHeight() - AndroidUtilities.statusBarHeight) - AndroidUtilities.navigationBarHeight) - AndroidUtilities.dp(6.0f)) - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - chatActivityEnterView.getHeight();
            chatActivityEnterView.f22873z3 = height;
            if (chatActivityEnterView.N1 == 2) {
                int dp = AndroidUtilities.dp(175.0f);
                Point point = AndroidUtilities.displaySize;
                if (point.x > point.y) {
                    i10 = chatActivityEnterView.f22844u2;
                } else {
                    i10 = chatActivityEnterView.f22839t2;
                }
                chatActivityEnterView.f22873z3 = Math.min(height, dp + i10);
            }
            if (chatActivityEnterView.Z4 == null) {
                chatActivityEnterView.R0.getLayoutParams().height = chatActivityEnterView.f22873z3;
            }
            chatActivityEnterView.R0.setLayerType(2, null);
            qv0Var.requestLayout();
            if (chatActivityEnterView.f22846u4) {
                qv0Var.setForeground(new ef.g(chatActivityEnterView));
            }
            this.f1700b = (int) chatActivityEnterView.getTranslationY();
            eg egVar = chatActivityEnterView.V2;
            if (egVar != null) {
                egVar.u1();
            }
        }
    }

    public l0(MessageDigest messageDigest, int i10) {
        ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN);
        this.f1701c = messageDigest;
        this.f1700b = i10;
    }
}
