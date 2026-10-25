package d5;

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
import org.telegram.ui.Components.dd;
import org.telegram.ui.Components.jz;
import org.telegram.ui.Components.og;
import org.telegram.ui.Components.pf;
import org.telegram.ui.Components.vw0;
import org.telegram.ui.Components.wx;
import r0.m0;
public final class f implements m0, wx {
    public int f7970a;
    public boolean f7971b;
    public Object f7972c;

    public f(FrameLayout frameLayout) {
        this.f7972c = frameLayout;
    }

    @Override
    public void a() {
        this.f7971b = true;
    }

    @Override
    public void b() {
        super/*android.view.ViewGroup*/.setVisibility(0);
        this.f7971b = false;
    }

    @Override
    public void c() {
        if (this.f7971b) {
            return;
        }
        ActionBarContextView actionBarContextView = (ActionBarContextView) this.f7972c;
        actionBarContextView.f2191f = null;
        super/*android.view.ViewGroup*/.setVisibility(this.f7970a);
    }

    public boolean d() {
        jz jzVar;
        pf pfVar;
        ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.f7972c;
        if (chatActivityEnterView.f25981x3) {
            if ((chatActivityEnterView.f25991z3 || (pfVar = chatActivityEnterView.E0) == null || pfVar.length() <= 0) && (jzVar = chatActivityEnterView.U0.f32786y0) != null && jzVar.h() > 0 && !chatActivityEnterView.f25908k3) {
                return true;
            }
            return false;
        }
        return false;
    }

    public void e() {
        int i10;
        ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.f7972c;
        vw0 vw0Var = chatActivityEnterView.f25915m1;
        if (d()) {
            AnimatorSet animatorSet = chatActivityEnterView.B3;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            chatActivityEnterView.E3 = true;
            this.f7971b = chatActivityEnterView.f25991z3;
            chatActivityEnterView.f25991z3 = true;
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 1);
            int height = ((((vw0Var.getHeight() - AndroidUtilities.statusBarHeight) - AndroidUtilities.navigationBarHeight) - AndroidUtilities.dp(6.0f)) - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - chatActivityEnterView.getHeight();
            chatActivityEnterView.D3 = height;
            if (chatActivityEnterView.R1 == 2) {
                int dp = AndroidUtilities.dp(175.0f);
                Point point = AndroidUtilities.displaySize;
                if (point.x > point.y) {
                    i10 = chatActivityEnterView.f25986y2;
                } else {
                    i10 = chatActivityEnterView.f25980x2;
                }
                chatActivityEnterView.D3 = Math.min(height, dp + i10);
            }
            if (chatActivityEnterView.f25892h5 == null) {
                chatActivityEnterView.U0.getLayoutParams().height = chatActivityEnterView.D3;
            }
            chatActivityEnterView.U0.setLayerType(2, null);
            vw0Var.requestLayout();
            if (chatActivityEnterView.f25987y4) {
                vw0Var.setForeground(new dd(chatActivityEnterView));
            }
            this.f7970a = (int) chatActivityEnterView.getTranslationY();
            og ogVar = chatActivityEnterView.Z2;
            if (ogVar != null) {
                ogVar.c1();
            }
        }
    }

    public f(MessageDigest messageDigest, int i10) {
        ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN);
        this.f7972c = messageDigest;
        this.f7970a = i10;
    }
}
