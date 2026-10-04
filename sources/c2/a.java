package c2;

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
import org.telegram.ui.Components.ez;
import org.telegram.ui.Components.fd;
import org.telegram.ui.Components.lw0;
import org.telegram.ui.Components.pg;
import org.telegram.ui.Components.rf;
import org.telegram.ui.Components.tx;
import r0.m0;
public final class a implements m0, tx {
    public boolean f3943a;
    public int f3944b;
    public Object f3945c;

    public a(FrameLayout frameLayout) {
        this.f3945c = frameLayout;
    }

    @Override
    public void a() {
        this.f3943a = true;
    }

    @Override
    public void b() {
        super/*android.view.ViewGroup*/.setVisibility(0);
        this.f3943a = false;
    }

    @Override
    public void c() {
        if (this.f3943a) {
            return;
        }
        ActionBarContextView actionBarContextView = (ActionBarContextView) this.f3945c;
        actionBarContextView.f2142f = null;
        super/*android.view.ViewGroup*/.setVisibility(this.f3944b);
    }

    public boolean d() {
        ez ezVar;
        rf rfVar;
        ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.f3945c;
        if (chatActivityEnterView.f23983x3) {
            if ((chatActivityEnterView.f23993z3 || (rfVar = chatActivityEnterView.E0) == null || rfVar.length() <= 0) && (ezVar = chatActivityEnterView.U0.f29162y0) != null && ezVar.h() > 0 && !chatActivityEnterView.f23913k3) {
                return true;
            }
            return false;
        }
        return false;
    }

    public void e() {
        int i10;
        ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.f3945c;
        lw0 lw0Var = chatActivityEnterView.f23920m1;
        if (d()) {
            AnimatorSet animatorSet = chatActivityEnterView.B3;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            chatActivityEnterView.E3 = true;
            this.f3943a = chatActivityEnterView.f23993z3;
            chatActivityEnterView.f23993z3 = true;
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 1);
            int height = ((((lw0Var.getHeight() - AndroidUtilities.statusBarHeight) - AndroidUtilities.navigationBarHeight) - AndroidUtilities.dp(6.0f)) - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - chatActivityEnterView.getHeight();
            chatActivityEnterView.D3 = height;
            if (chatActivityEnterView.R1 == 2) {
                int dp = AndroidUtilities.dp(175.0f);
                Point point = AndroidUtilities.displaySize;
                if (point.x > point.y) {
                    i10 = chatActivityEnterView.f23988y2;
                } else {
                    i10 = chatActivityEnterView.f23982x2;
                }
                chatActivityEnterView.D3 = Math.min(height, dp + i10);
            }
            if (chatActivityEnterView.f23872d5 == null) {
                chatActivityEnterView.U0.getLayoutParams().height = chatActivityEnterView.D3;
            }
            chatActivityEnterView.U0.setLayerType(2, null);
            lw0Var.requestLayout();
            if (chatActivityEnterView.f23989y4) {
                lw0Var.setForeground(new fd(chatActivityEnterView));
            }
            this.f3944b = (int) chatActivityEnterView.getTranslationY();
            pg pgVar = chatActivityEnterView.Z2;
            if (pgVar != null) {
                pgVar.s1();
            }
        }
    }

    public a(MessageDigest messageDigest, int i10) {
        ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN);
        this.f3945c = messageDigest;
        this.f3944b = i10;
    }
}
