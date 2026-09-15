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
import org.telegram.ui.Components.bz;
import org.telegram.ui.Components.cd;
import org.telegram.ui.Components.mg;
import org.telegram.ui.Components.of;
import org.telegram.ui.Components.pv0;
import org.telegram.ui.Components.px;
import r0.m0;
public final class a implements m0, px {
    public boolean f3651a;
    public int f3652b;
    public Object f3653c;

    public a(FrameLayout frameLayout) {
        this.f3653c = frameLayout;
    }

    @Override
    public void a() {
        this.f3651a = true;
    }

    @Override
    public void b() {
        super/*android.view.ViewGroup*/.setVisibility(0);
        this.f3651a = false;
    }

    @Override
    public void c() {
        if (this.f3651a) {
            return;
        }
        ActionBarContextView actionBarContextView = (ActionBarContextView) this.f3653c;
        actionBarContextView.f1971f = null;
        super/*android.view.ViewGroup*/.setVisibility(this.f3652b);
    }

    public boolean d() {
        bz bzVar;
        of ofVar;
        ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.f3653c;
        if (chatActivityEnterView.f21860w3) {
            if ((chatActivityEnterView.y3 || (ofVar = chatActivityEnterView.E0) == null || ofVar.length() <= 0) && (bzVar = chatActivityEnterView.U0.f25773y0) != null && bzVar.h() > 0 && !chatActivityEnterView.j3) {
                return true;
            }
            return false;
        }
        return false;
    }

    public void e() {
        int i10;
        ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.f3653c;
        pv0 pv0Var = chatActivityEnterView.l1;
        if (d()) {
            AnimatorSet animatorSet = chatActivityEnterView.A3;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            chatActivityEnterView.D3 = true;
            this.f3651a = chatActivityEnterView.y3;
            chatActivityEnterView.y3 = true;
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 1);
            int height = ((((pv0Var.getHeight() - AndroidUtilities.statusBarHeight) - AndroidUtilities.navigationBarHeight) - AndroidUtilities.dp(6.0f)) - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - chatActivityEnterView.getHeight();
            chatActivityEnterView.C3 = height;
            if (chatActivityEnterView.Q1 == 2) {
                int dp = AndroidUtilities.dp(175.0f);
                Point point = AndroidUtilities.displaySize;
                if (point.x > point.y) {
                    i10 = chatActivityEnterView.f21865x2;
                } else {
                    i10 = chatActivityEnterView.f21859w2;
                }
                chatActivityEnterView.C3 = Math.min(height, dp + i10);
            }
            if (chatActivityEnterView.f21751c5 == null) {
                chatActivityEnterView.U0.getLayoutParams().height = chatActivityEnterView.C3;
            }
            chatActivityEnterView.U0.setLayerType(2, null);
            pv0Var.requestLayout();
            if (chatActivityEnterView.f21867x4) {
                pv0Var.setForeground(new cd(chatActivityEnterView));
            }
            this.f3652b = (int) chatActivityEnterView.getTranslationY();
            mg mgVar = chatActivityEnterView.Y2;
            if (mgVar != null) {
                mgVar.s1();
            }
        }
    }

    public a(MessageDigest messageDigest, int i10) {
        ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN);
        this.f3653c = messageDigest;
        this.f3652b = i10;
    }
}
