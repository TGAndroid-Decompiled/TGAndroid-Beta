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
import org.telegram.ui.Components.cz;
import org.telegram.ui.Components.ed;
import org.telegram.ui.Components.og;
import org.telegram.ui.Components.qf;
import org.telegram.ui.Components.rx;
import r0.m0;
public final class a implements m0, rx {
    public boolean f3648a;
    public int f3649b;
    public Object f3650c;

    public a(FrameLayout frameLayout) {
        this.f3650c = frameLayout;
    }

    @Override
    public void a() {
        this.f3648a = true;
    }

    @Override
    public void b() {
        super/*android.view.ViewGroup*/.setVisibility(0);
        this.f3648a = false;
    }

    @Override
    public void c() {
        if (this.f3648a) {
            return;
        }
        ActionBarContextView actionBarContextView = (ActionBarContextView) this.f3650c;
        actionBarContextView.f1968f = null;
        super/*android.view.ViewGroup*/.setVisibility(this.f3649b);
    }

    public boolean d() {
        cz czVar;
        qf qfVar;
        ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.f3650c;
        if (chatActivityEnterView.f22089x3) {
            if ((chatActivityEnterView.f22099z3 || (qfVar = chatActivityEnterView.E0) == null || qfVar.length() <= 0) && (czVar = chatActivityEnterView.U0.f26307y0) != null && czVar.h() > 0 && !chatActivityEnterView.f22019k3) {
                return true;
            }
            return false;
        }
        return false;
    }

    public void e() {
        int i10;
        ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.f3650c;
        aw0 aw0Var = chatActivityEnterView.f22026m1;
        if (d()) {
            AnimatorSet animatorSet = chatActivityEnterView.B3;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            chatActivityEnterView.E3 = true;
            this.f3648a = chatActivityEnterView.f22099z3;
            chatActivityEnterView.f22099z3 = true;
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 1);
            int height = ((((aw0Var.getHeight() - AndroidUtilities.statusBarHeight) - AndroidUtilities.navigationBarHeight) - AndroidUtilities.dp(6.0f)) - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - chatActivityEnterView.getHeight();
            chatActivityEnterView.D3 = height;
            if (chatActivityEnterView.R1 == 2) {
                int dp = AndroidUtilities.dp(175.0f);
                Point point = AndroidUtilities.displaySize;
                if (point.x > point.y) {
                    i10 = chatActivityEnterView.f22094y2;
                } else {
                    i10 = chatActivityEnterView.f22088x2;
                }
                chatActivityEnterView.D3 = Math.min(height, dp + i10);
            }
            if (chatActivityEnterView.f21979d5 == null) {
                chatActivityEnterView.U0.getLayoutParams().height = chatActivityEnterView.D3;
            }
            chatActivityEnterView.U0.setLayerType(2, null);
            aw0Var.requestLayout();
            if (chatActivityEnterView.f22095y4) {
                aw0Var.setForeground(new ed(chatActivityEnterView));
            }
            this.f3649b = (int) chatActivityEnterView.getTranslationY();
            og ogVar = chatActivityEnterView.Z2;
            if (ogVar != null) {
                ogVar.s1();
            }
        }
    }

    public a(MessageDigest messageDigest, int i10) {
        ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN);
        this.f3650c = messageDigest;
        this.f3649b = i10;
    }
}
