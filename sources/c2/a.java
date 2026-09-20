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
import org.telegram.ui.Components.aw0;
import org.telegram.ui.Components.bz;
import org.telegram.ui.Components.ed;
import org.telegram.ui.Components.ng;
import org.telegram.ui.Components.pf;
import org.telegram.ui.Components.qx;
import r0.m0;
public final class a implements m0, qx {
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
        pf pfVar;
        ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.f3658c;
        if (chatActivityEnterView.f22081w3) {
            if ((chatActivityEnterView.y3 || (pfVar = chatActivityEnterView.E0) == null || pfVar.length() <= 0) && (bzVar = chatActivityEnterView.U0.f25968y0) != null && bzVar.h() > 0 && !chatActivityEnterView.j3) {
                return true;
            }
            return false;
        }
        return false;
    }

    public void e() {
        int i10;
        ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.f3658c;
        aw0 aw0Var = chatActivityEnterView.l1;
        if (d()) {
            AnimatorSet animatorSet = chatActivityEnterView.A3;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            chatActivityEnterView.D3 = true;
            this.f3656a = chatActivityEnterView.y3;
            chatActivityEnterView.y3 = true;
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 1);
            int height = ((((aw0Var.getHeight() - AndroidUtilities.statusBarHeight) - AndroidUtilities.navigationBarHeight) - AndroidUtilities.dp(6.0f)) - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - chatActivityEnterView.getHeight();
            chatActivityEnterView.C3 = height;
            if (chatActivityEnterView.Q1 == 2) {
                int dp = AndroidUtilities.dp(175.0f);
                Point point = AndroidUtilities.displaySize;
                if (point.x > point.y) {
                    i10 = chatActivityEnterView.f22086x2;
                } else {
                    i10 = chatActivityEnterView.f22080w2;
                }
                chatActivityEnterView.C3 = Math.min(height, dp + i10);
            }
            if (chatActivityEnterView.f21972c5 == null) {
                chatActivityEnterView.U0.getLayoutParams().height = chatActivityEnterView.C3;
            }
            chatActivityEnterView.U0.setLayerType(2, null);
            aw0Var.requestLayout();
            if (chatActivityEnterView.f22088x4) {
                aw0Var.setForeground(new ed(chatActivityEnterView));
            }
            this.f3657b = (int) chatActivityEnterView.getTranslationY();
            ng ngVar = chatActivityEnterView.Y2;
            if (ngVar != null) {
                ngVar.t1();
            }
        }
    }

    public a(MessageDigest messageDigest, int i10) {
        ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN);
        this.f3658c = messageDigest;
        this.f3657b = i10;
    }
}
