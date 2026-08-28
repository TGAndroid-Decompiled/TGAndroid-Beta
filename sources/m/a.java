package m;

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
import org.telegram.ui.Components.cx;
import org.telegram.ui.Components.eg;
import org.telegram.ui.Components.ff;
import org.telegram.ui.Components.ny;
import org.telegram.ui.Components.vc;
import org.telegram.ui.Components.xu0;
public final class a implements r0.n0, cx {
    public boolean f16882a;
    public int f16883b;
    public Object f16884c;

    public a(FrameLayout frameLayout) {
        this.f16884c = frameLayout;
    }

    @Override
    public void a() {
        this.f16882a = true;
    }

    @Override
    public void b() {
        super/*android.view.ViewGroup*/.setVisibility(0);
        this.f16882a = false;
    }

    @Override
    public void c() {
        if (this.f16882a) {
            return;
        }
        ActionBarContextView actionBarContextView = (ActionBarContextView) this.f16884c;
        actionBarContextView.f464f = null;
        super/*android.view.ViewGroup*/.setVisibility(this.f16883b);
    }

    public boolean d() {
        ny nyVar;
        ff ffVar;
        ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.f16884c;
        if (chatActivityEnterView.f26180s3) {
            if ((chatActivityEnterView.f26190u3 || (ffVar = chatActivityEnterView.A0) == null || ffVar.length() <= 0) && (nyVar = chatActivityEnterView.Q0.f34448u0) != null && nyVar.h() > 0 && !chatActivityEnterView.f26111f3) {
                return true;
            }
            return false;
        }
        return false;
    }

    public void e() {
        int i9;
        ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.f16884c;
        xu0 xu0Var = chatActivityEnterView.f26121h1;
        if (d()) {
            AnimatorSet animatorSet = chatActivityEnterView.f26200w3;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            chatActivityEnterView.f26217z3 = true;
            this.f16882a = chatActivityEnterView.f26190u3;
            chatActivityEnterView.f26190u3 = true;
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 1);
            int height = ((((xu0Var.getHeight() - AndroidUtilities.statusBarHeight) - AndroidUtilities.navigationBarHeight) - AndroidUtilities.dp(6.0f)) - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - chatActivityEnterView.getHeight();
            chatActivityEnterView.f26212y3 = height;
            if (chatActivityEnterView.M1 == 2) {
                int dp = AndroidUtilities.dp(175.0f);
                Point point = AndroidUtilities.displaySize;
                if (point.x > point.y) {
                    i9 = chatActivityEnterView.f26184t2;
                } else {
                    i9 = chatActivityEnterView.f26179s2;
                }
                chatActivityEnterView.f26212y3 = Math.min(height, dp + i9);
            }
            if (chatActivityEnterView.Y4 == null) {
                chatActivityEnterView.Q0.getLayoutParams().height = chatActivityEnterView.f26212y3;
            }
            chatActivityEnterView.Q0.setLayerType(2, null);
            xu0Var.requestLayout();
            if (chatActivityEnterView.f26186t4) {
                xu0Var.setForeground(new vc(chatActivityEnterView));
            }
            this.f16883b = (int) chatActivityEnterView.getTranslationY();
            eg egVar = chatActivityEnterView.U2;
            if (egVar != null) {
                egVar.j1();
            }
        }
    }

    public a(MessageDigest messageDigest, int i9) {
        ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN);
        this.f16884c = messageDigest;
        this.f16883b = i9;
    }
}
