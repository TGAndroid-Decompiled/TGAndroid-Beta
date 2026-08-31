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
import org.telegram.ui.Components.dz;
import org.telegram.ui.Components.eg;
import org.telegram.ui.Components.ff;
import org.telegram.ui.Components.qv0;
import org.telegram.ui.Components.qx;
public final class l0 implements r0.n0, qx {
    public boolean f1838a;
    public int f1839b;
    public Object f1840c;

    public l0(FrameLayout frameLayout) {
        this.f1840c = frameLayout;
    }

    @Override
    public void a() {
        this.f1838a = true;
    }

    @Override
    public void b() {
        super/*android.view.ViewGroup*/.setVisibility(0);
        this.f1838a = false;
    }

    @Override
    public void c() {
        if (this.f1838a) {
            return;
        }
        ActionBarContextView actionBarContextView = (ActionBarContextView) this.f1840c;
        actionBarContextView.f431f = null;
        super/*android.view.ViewGroup*/.setVisibility(this.f1839b);
    }

    public boolean d() {
        dz dzVar;
        ff ffVar;
        ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.f1840c;
        if (chatActivityEnterView.f24680t3) {
            if ((chatActivityEnterView.f24690v3 || (ffVar = chatActivityEnterView.B0) == null || ffVar.length() <= 0) && (dzVar = chatActivityEnterView.R0.f29331v0) != null && dzVar.h() > 0 && !chatActivityEnterView.f24611g3) {
                return true;
            }
            return false;
        }
        return false;
    }

    public void e() {
        int i10;
        ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.f1840c;
        qv0 qv0Var = chatActivityEnterView.f24621i1;
        if (d()) {
            AnimatorSet animatorSet = chatActivityEnterView.f24702x3;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            chatActivityEnterView.A3 = true;
            this.f1838a = chatActivityEnterView.f24690v3;
            chatActivityEnterView.f24690v3 = true;
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 1);
            int height = ((((qv0Var.getHeight() - AndroidUtilities.statusBarHeight) - AndroidUtilities.navigationBarHeight) - AndroidUtilities.dp(6.0f)) - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - chatActivityEnterView.getHeight();
            chatActivityEnterView.f24713z3 = height;
            if (chatActivityEnterView.N1 == 2) {
                int dp = AndroidUtilities.dp(175.0f);
                Point point = AndroidUtilities.displaySize;
                if (point.x > point.y) {
                    i10 = chatActivityEnterView.f24684u2;
                } else {
                    i10 = chatActivityEnterView.f24679t2;
                }
                chatActivityEnterView.f24713z3 = Math.min(height, dp + i10);
            }
            if (chatActivityEnterView.Z4 == null) {
                chatActivityEnterView.R0.getLayoutParams().height = chatActivityEnterView.f24713z3;
            }
            chatActivityEnterView.R0.setLayerType(2, null);
            qv0Var.requestLayout();
            if (chatActivityEnterView.f24686u4) {
                qv0Var.setForeground(new ef.f(chatActivityEnterView));
            }
            this.f1839b = (int) chatActivityEnterView.getTranslationY();
            eg egVar = chatActivityEnterView.V2;
            if (egVar != null) {
                egVar.y1();
            }
        }
    }

    public l0(MessageDigest messageDigest, int i10) {
        ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN);
        this.f1840c = messageDigest;
        this.f1839b = i10;
    }
}
