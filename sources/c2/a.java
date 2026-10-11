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
import org.telegram.ui.Components.hd;
import org.telegram.ui.Components.hy;
import org.telegram.ui.Components.qg;
import org.telegram.ui.Components.rz;
import org.telegram.ui.Components.sf;
import org.telegram.ui.Components.uw0;
import r0.m0;
public final class a implements m0, hy {
    public boolean f3993a;
    public int f3994b;
    public Object f3995c;

    public a(FrameLayout frameLayout) {
        this.f3995c = frameLayout;
    }

    @Override
    public void a() {
        this.f3993a = true;
    }

    @Override
    public void b() {
        super/*android.view.ViewGroup*/.setVisibility(0);
        this.f3993a = false;
    }

    @Override
    public void c() {
        if (this.f3993a) {
            return;
        }
        ActionBarContextView actionBarContextView = (ActionBarContextView) this.f3995c;
        actionBarContextView.f2221f = null;
        super/*android.view.ViewGroup*/.setVisibility(this.f3994b);
    }

    public boolean d() {
        rz rzVar;
        sf sfVar;
        ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.f3995c;
        if (chatActivityEnterView.f23979x3) {
            if ((chatActivityEnterView.f23989z3 || (sfVar = chatActivityEnterView.E0) == null || sfVar.length() <= 0) && (rzVar = chatActivityEnterView.U0.f24733y0) != null && rzVar.h() > 0 && !chatActivityEnterView.f23909k3) {
                return true;
            }
            return false;
        }
        return false;
    }

    public void e() {
        int i10;
        ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.f3995c;
        uw0 uw0Var = chatActivityEnterView.f23916m1;
        if (d()) {
            AnimatorSet animatorSet = chatActivityEnterView.B3;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            chatActivityEnterView.E3 = true;
            this.f3993a = chatActivityEnterView.f23989z3;
            chatActivityEnterView.f23989z3 = true;
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 1);
            int height = ((((uw0Var.getHeight() - AndroidUtilities.statusBarHeight) - AndroidUtilities.navigationBarHeight) - AndroidUtilities.dp(6.0f)) - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - chatActivityEnterView.getHeight();
            chatActivityEnterView.D3 = height;
            if (chatActivityEnterView.R1 == 2) {
                int dp = AndroidUtilities.dp(175.0f);
                Point point = AndroidUtilities.displaySize;
                if (point.x > point.y) {
                    i10 = chatActivityEnterView.f23984y2;
                } else {
                    i10 = chatActivityEnterView.f23978x2;
                }
                chatActivityEnterView.D3 = Math.min(height, dp + i10);
            }
            if (chatActivityEnterView.f23868d5 == null) {
                chatActivityEnterView.U0.getLayoutParams().height = chatActivityEnterView.D3;
            }
            chatActivityEnterView.U0.setLayerType(2, null);
            uw0Var.requestLayout();
            if (chatActivityEnterView.f23985y4) {
                uw0Var.setForeground(new hd(chatActivityEnterView));
            }
            this.f3994b = (int) chatActivityEnterView.getTranslationY();
            qg qgVar = chatActivityEnterView.Z2;
            if (qgVar != null) {
                qgVar.y1();
            }
        }
    }

    public a(MessageDigest messageDigest, int i10) {
        ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN);
        this.f3995c = messageDigest;
        this.f3994b = i10;
    }
}
