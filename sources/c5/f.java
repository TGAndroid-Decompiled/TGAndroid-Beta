package c5;

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
import org.telegram.ui.Components.cd;
import org.telegram.ui.Components.iz;
import org.telegram.ui.Components.mg;
import org.telegram.ui.Components.nf;
import org.telegram.ui.Components.nw0;
import org.telegram.ui.Components.vx;
import r0.m0;
public final class f implements m0, vx {
    public int f4733a;
    public boolean f4734b;
    public Object f4735c;

    public f(FrameLayout frameLayout) {
        this.f4735c = frameLayout;
    }

    @Override
    public void a() {
        this.f4734b = true;
    }

    @Override
    public void b() {
        super/*android.view.ViewGroup*/.setVisibility(0);
        this.f4734b = false;
    }

    @Override
    public void c() {
        if (this.f4734b) {
            return;
        }
        ActionBarContextView actionBarContextView = (ActionBarContextView) this.f4735c;
        actionBarContextView.f2745f = null;
        super/*android.view.ViewGroup*/.setVisibility(this.f4733a);
    }

    public boolean d() {
        iz izVar;
        nf nfVar;
        ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.f4735c;
        if (chatActivityEnterView.f24191x3) {
            if ((chatActivityEnterView.f24201z3 || (nfVar = chatActivityEnterView.E0) == null || nfVar.length() <= 0) && (izVar = chatActivityEnterView.U0.f30380y0) != null && izVar.h() > 0 && !chatActivityEnterView.f24118k3) {
                return true;
            }
            return false;
        }
        return false;
    }

    public void e() {
        int i10;
        ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.f4735c;
        nw0 nw0Var = chatActivityEnterView.f24125m1;
        if (d()) {
            AnimatorSet animatorSet = chatActivityEnterView.B3;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            chatActivityEnterView.E3 = true;
            this.f4734b = chatActivityEnterView.f24201z3;
            chatActivityEnterView.f24201z3 = true;
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 1);
            int height = ((((nw0Var.getHeight() - AndroidUtilities.statusBarHeight) - AndroidUtilities.navigationBarHeight) - AndroidUtilities.dp(6.0f)) - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - chatActivityEnterView.getHeight();
            chatActivityEnterView.D3 = height;
            if (chatActivityEnterView.R1 == 2) {
                int dp = AndroidUtilities.dp(175.0f);
                Point point = AndroidUtilities.displaySize;
                if (point.x > point.y) {
                    i10 = chatActivityEnterView.f24196y2;
                } else {
                    i10 = chatActivityEnterView.f24190x2;
                }
                chatActivityEnterView.D3 = Math.min(height, dp + i10);
            }
            if (chatActivityEnterView.f24102h5 == null) {
                chatActivityEnterView.U0.getLayoutParams().height = chatActivityEnterView.D3;
            }
            chatActivityEnterView.U0.setLayerType(2, null);
            nw0Var.requestLayout();
            if (chatActivityEnterView.f24197y4) {
                nw0Var.setForeground(new cd(chatActivityEnterView));
            }
            this.f4733a = (int) chatActivityEnterView.getTranslationY();
            mg mgVar = chatActivityEnterView.Z2;
            if (mgVar != null) {
                mgVar.n1();
            }
        }
    }

    public f(MessageDigest messageDigest, int i10) {
        ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN);
        this.f4735c = messageDigest;
        this.f4733a = i10;
    }
}
