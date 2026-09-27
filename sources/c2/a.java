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
import org.telegram.ui.Components.cw0;
import org.telegram.ui.Components.dz;
import org.telegram.ui.Components.ed;
import org.telegram.ui.Components.og;
import org.telegram.ui.Components.qf;
import org.telegram.ui.Components.rx;
import r0.m0;
public final class a implements m0, rx {
    public boolean f3650a;
    public int f3651b;
    public Object f3652c;

    public a(FrameLayout frameLayout) {
        this.f3652c = frameLayout;
    }

    @Override
    public void a() {
        this.f3650a = true;
    }

    @Override
    public void b() {
        super/*android.view.ViewGroup*/.setVisibility(0);
        this.f3650a = false;
    }

    @Override
    public void c() {
        if (this.f3650a) {
            return;
        }
        ActionBarContextView actionBarContextView = (ActionBarContextView) this.f3652c;
        actionBarContextView.f1970f = null;
        super/*android.view.ViewGroup*/.setVisibility(this.f3651b);
    }

    public boolean d() {
        dz dzVar;
        qf qfVar;
        ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.f3652c;
        if (chatActivityEnterView.f22091x3) {
            if ((chatActivityEnterView.f22101z3 || (qfVar = chatActivityEnterView.E0) == null || qfVar.length() <= 0) && (dzVar = chatActivityEnterView.U0.f26644y0) != null && dzVar.h() > 0 && !chatActivityEnterView.f22021k3) {
                return true;
            }
            return false;
        }
        return false;
    }

    public void e() {
        int i10;
        ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.f3652c;
        cw0 cw0Var = chatActivityEnterView.f22028m1;
        if (d()) {
            AnimatorSet animatorSet = chatActivityEnterView.B3;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            chatActivityEnterView.E3 = true;
            this.f3650a = chatActivityEnterView.f22101z3;
            chatActivityEnterView.f22101z3 = true;
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 1);
            int height = ((((cw0Var.getHeight() - AndroidUtilities.statusBarHeight) - AndroidUtilities.navigationBarHeight) - AndroidUtilities.dp(6.0f)) - org.telegram.ui.ActionBar.l.getCurrentActionBarHeight()) - chatActivityEnterView.getHeight();
            chatActivityEnterView.D3 = height;
            if (chatActivityEnterView.R1 == 2) {
                int dp = AndroidUtilities.dp(175.0f);
                Point point = AndroidUtilities.displaySize;
                if (point.x > point.y) {
                    i10 = chatActivityEnterView.f22096y2;
                } else {
                    i10 = chatActivityEnterView.f22090x2;
                }
                chatActivityEnterView.D3 = Math.min(height, dp + i10);
            }
            if (chatActivityEnterView.f21981d5 == null) {
                chatActivityEnterView.U0.getLayoutParams().height = chatActivityEnterView.D3;
            }
            chatActivityEnterView.U0.setLayerType(2, null);
            cw0Var.requestLayout();
            if (chatActivityEnterView.f22097y4) {
                cw0Var.setForeground(new ed(chatActivityEnterView));
            }
            this.f3651b = (int) chatActivityEnterView.getTranslationY();
            og ogVar = chatActivityEnterView.Z2;
            if (ogVar != null) {
                ogVar.s1();
            }
        }
    }

    public a(MessageDigest messageDigest, int i10) {
        ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN);
        this.f3652c = messageDigest;
        this.f3651b = i10;
    }
}
