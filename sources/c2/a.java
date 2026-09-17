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
import org.telegram.ui.Components.px;
import org.telegram.ui.Components.qv0;
import r0.m0;
public final class a implements m0, px {
    public boolean f3656a;
    public int f3657b;
    public Object f3658c;

    public a(FrameLayout frameLayout) {
        this.f3658c = frameLayout;
    }

    @Override
    public void a() {
        this.f3656a = true;
    }

    @Override
    public void b() {
        super/*android.view.ViewGroup*/.setVisibility(0);
        this.f3656a = false;
    }

    @Override
    public void c() {
        if (this.f3656a) {
            return;
        }
        ActionBarContextView actionBarContextView = (ActionBarContextView) this.f3658c;
        actionBarContextView.f1976f = null;
        super/*android.view.ViewGroup*/.setVisibility(this.f3657b);
    }

    public boolean d() {
        bz bzVar;
        of ofVar;
        ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.f3658c;
        if (chatActivityEnterView.f21870w3) {
            if ((chatActivityEnterView.y3 || (ofVar = chatActivityEnterView.E0) == null || ofVar.length() <= 0) && (bzVar = chatActivityEnterView.U0.f25783y0) != null && bzVar.h() > 0 && !chatActivityEnterView.j3) {
                return true;
            }
            return false;
        }
        return false;
    }

    public void e() {
        int i10;
        ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.f3658c;
        qv0 qv0Var = chatActivityEnterView.l1;
        if (d()) {
            AnimatorSet animatorSet = chatActivityEnterView.A3;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            chatActivityEnterView.D3 = true;
            this.f3656a = chatActivityEnterView.y3;
            chatActivityEnterView.y3 = true;
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 1);
            int height = ((((qv0Var.getHeight() - AndroidUtilities.statusBarHeight) - AndroidUtilities.navigationBarHeight) - AndroidUtilities.dp(6.0f)) - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - chatActivityEnterView.getHeight();
            chatActivityEnterView.C3 = height;
            if (chatActivityEnterView.Q1 == 2) {
                int dp = AndroidUtilities.dp(175.0f);
                Point point = AndroidUtilities.displaySize;
                if (point.x > point.y) {
                    i10 = chatActivityEnterView.f21875x2;
                } else {
                    i10 = chatActivityEnterView.f21869w2;
                }
                chatActivityEnterView.C3 = Math.min(height, dp + i10);
            }
            if (chatActivityEnterView.f21761c5 == null) {
                chatActivityEnterView.U0.getLayoutParams().height = chatActivityEnterView.C3;
            }
            chatActivityEnterView.U0.setLayerType(2, null);
            qv0Var.requestLayout();
            if (chatActivityEnterView.f21877x4) {
                qv0Var.setForeground(new cd(chatActivityEnterView));
            }
            this.f3657b = (int) chatActivityEnterView.getTranslationY();
            mg mgVar = chatActivityEnterView.Y2;
            if (mgVar != null) {
                mgVar.s1();
            }
        }
    }

    public a(MessageDigest messageDigest, int i10) {
        ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN);
        this.f3658c = messageDigest;
        this.f3657b = i10;
    }
}
