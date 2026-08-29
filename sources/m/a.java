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
import org.telegram.ui.Components.hg;
import org.telegram.ui.Components.hv0;
import org.telegram.ui.Components.jf;
import org.telegram.ui.Components.jx;
import org.telegram.ui.Components.wy;
public final class a implements r0.n0, jx {
    public boolean f16481a;
    public int f16482b;
    public Object f16483c;

    public a(FrameLayout frameLayout) {
        this.f16483c = frameLayout;
    }

    @Override
    public void a() {
        this.f16481a = true;
    }

    @Override
    public void b() {
        super/*android.view.ViewGroup*/.setVisibility(0);
        this.f16481a = false;
    }

    @Override
    public void c() {
        if (this.f16481a) {
            return;
        }
        ActionBarContextView actionBarContextView = (ActionBarContextView) this.f16483c;
        actionBarContextView.f956f = null;
        super/*android.view.ViewGroup*/.setVisibility(this.f16482b);
    }

    public boolean d() {
        wy wyVar;
        jf jfVar;
        ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.f16483c;
        if (chatActivityEnterView.f26191s3) {
            if ((chatActivityEnterView.f26201u3 || (jfVar = chatActivityEnterView.A0) == null || jfVar.length() <= 0) && (wyVar = chatActivityEnterView.Q0.f28639u0) != null && wyVar.h() > 0 && !chatActivityEnterView.f26122f3) {
                return true;
            }
            return false;
        }
        return false;
    }

    public void e() {
        int i10;
        ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.f16483c;
        hv0 hv0Var = chatActivityEnterView.f26132h1;
        if (d()) {
            AnimatorSet animatorSet = chatActivityEnterView.f26212w3;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            chatActivityEnterView.f26228z3 = true;
            this.f16481a = chatActivityEnterView.f26201u3;
            chatActivityEnterView.f26201u3 = true;
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 1);
            int height = ((((hv0Var.getHeight() - AndroidUtilities.statusBarHeight) - AndroidUtilities.navigationBarHeight) - AndroidUtilities.dp(6.0f)) - org.telegram.ui.ActionBar.l.getCurrentActionBarHeight()) - chatActivityEnterView.getHeight();
            chatActivityEnterView.f26223y3 = height;
            if (chatActivityEnterView.M1 == 2) {
                int dp = AndroidUtilities.dp(175.0f);
                Point point = AndroidUtilities.displaySize;
                if (point.x > point.y) {
                    i10 = chatActivityEnterView.f26195t2;
                } else {
                    i10 = chatActivityEnterView.f26190s2;
                }
                chatActivityEnterView.f26223y3 = Math.min(height, dp + i10);
            }
            if (chatActivityEnterView.Y4 == null) {
                chatActivityEnterView.Q0.getLayoutParams().height = chatActivityEnterView.f26223y3;
            }
            chatActivityEnterView.Q0.setLayerType(2, null);
            hv0Var.requestLayout();
            if (chatActivityEnterView.f26197t4) {
                hv0Var.setForeground(new cf.f(chatActivityEnterView));
            }
            this.f16482b = (int) chatActivityEnterView.getTranslationY();
            hg hgVar = chatActivityEnterView.U2;
            if (hgVar != null) {
                hgVar.s1();
            }
        }
    }

    public a(MessageDigest messageDigest, int i10) {
        ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN);
        this.f16483c = messageDigest;
        this.f16482b = i10;
    }
}
