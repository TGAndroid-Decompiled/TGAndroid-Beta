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
import org.telegram.ui.Components.ed;
import org.telegram.ui.Components.kw0;
import org.telegram.ui.Components.kz;
import org.telegram.ui.Components.og;
import org.telegram.ui.Components.pf;
import org.telegram.ui.Components.xx;
import r0.m0;
public final class f implements m0, xx {
    public int f4730a;
    public boolean f4731b;
    public Object f4732c;

    public f(FrameLayout frameLayout) {
        this.f4732c = frameLayout;
    }

    @Override
    public void a() {
        this.f4731b = true;
    }

    @Override
    public void b() {
        super/*android.view.ViewGroup*/.setVisibility(0);
        this.f4731b = false;
    }

    @Override
    public void c() {
        if (this.f4731b) {
            return;
        }
        ActionBarContextView actionBarContextView = (ActionBarContextView) this.f4732c;
        actionBarContextView.f2740f = null;
        super/*android.view.ViewGroup*/.setVisibility(this.f4730a);
    }

    public boolean d() {
        kz kzVar;
        pf pfVar;
        ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.f4732c;
        if (chatActivityEnterView.f24044x3) {
            if ((chatActivityEnterView.f24054z3 || (pfVar = chatActivityEnterView.E0) == null || pfVar.length() <= 0) && (kzVar = chatActivityEnterView.U0.f30840y0) != null && kzVar.h() > 0 && !chatActivityEnterView.f23974k3) {
                return true;
            }
            return false;
        }
        return false;
    }

    public void e() {
        int i10;
        ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.f4732c;
        kw0 kw0Var = chatActivityEnterView.f23981m1;
        if (d()) {
            AnimatorSet animatorSet = chatActivityEnterView.B3;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            chatActivityEnterView.E3 = true;
            this.f4731b = chatActivityEnterView.f24054z3;
            chatActivityEnterView.f24054z3 = true;
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 1);
            int height = ((((kw0Var.getHeight() - AndroidUtilities.statusBarHeight) - AndroidUtilities.navigationBarHeight) - AndroidUtilities.dp(6.0f)) - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - chatActivityEnterView.getHeight();
            chatActivityEnterView.D3 = height;
            if (chatActivityEnterView.R1 == 2) {
                int dp = AndroidUtilities.dp(175.0f);
                Point point = AndroidUtilities.displaySize;
                if (point.x > point.y) {
                    i10 = chatActivityEnterView.f24049y2;
                } else {
                    i10 = chatActivityEnterView.f24043x2;
                }
                chatActivityEnterView.D3 = Math.min(height, dp + i10);
            }
            if (chatActivityEnterView.f23933d5 == null) {
                chatActivityEnterView.U0.getLayoutParams().height = chatActivityEnterView.D3;
            }
            chatActivityEnterView.U0.setLayerType(2, null);
            kw0Var.requestLayout();
            if (chatActivityEnterView.f24050y4) {
                kw0Var.setForeground(new ed(chatActivityEnterView));
            }
            this.f4730a = (int) chatActivityEnterView.getTranslationY();
            og ogVar = chatActivityEnterView.Z2;
            if (ogVar != null) {
                ogVar.n1();
            }
        }
    }

    public f(MessageDigest messageDigest, int i10) {
        ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN);
        this.f4732c = messageDigest;
        this.f4730a = i10;
    }
}
