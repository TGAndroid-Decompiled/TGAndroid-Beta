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
import org.telegram.ui.Components.gd;
import org.telegram.ui.Components.jy;
import org.telegram.ui.Components.sg;
import org.telegram.ui.Components.tz;
import org.telegram.ui.Components.uf;
import org.telegram.ui.Components.yw0;
import r0.m0;
public final class a implements m0, jy {
    public boolean f3992a;
    public int f3993b;
    public Object f3994c;

    public a(FrameLayout frameLayout) {
        this.f3994c = frameLayout;
    }

    @Override
    public void a() {
        this.f3992a = true;
    }

    @Override
    public void b() {
        super/*android.view.ViewGroup*/.setVisibility(0);
        this.f3992a = false;
    }

    @Override
    public void c() {
        if (this.f3992a) {
            return;
        }
        ActionBarContextView actionBarContextView = (ActionBarContextView) this.f3994c;
        actionBarContextView.f2219f = null;
        super/*android.view.ViewGroup*/.setVisibility(this.f3993b);
    }

    public boolean d() {
        tz tzVar;
        uf ufVar;
        ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.f3994c;
        if (chatActivityEnterView.Z3) {
            if ((chatActivityEnterView.f23628b4 || (ufVar = chatActivityEnterView.E0) == null || ufVar.length() <= 0) && (tzVar = chatActivityEnterView.U0.f25143y0) != null && tzVar.h() > 0 && !chatActivityEnterView.M3) {
                return true;
            }
            return false;
        }
        return false;
    }

    public void e() {
        int i10;
        ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.f3994c;
        yw0 yw0Var = chatActivityEnterView.f23690m1;
        if (d()) {
            AnimatorSet animatorSet = chatActivityEnterView.f23641d4;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            chatActivityEnterView.f23661g4 = true;
            this.f3992a = chatActivityEnterView.f23628b4;
            chatActivityEnterView.f23628b4 = true;
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 1);
            int height = ((((yw0Var.getHeight() - AndroidUtilities.statusBarHeight) - AndroidUtilities.navigationBarHeight) - AndroidUtilities.dp(6.0f)) - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - chatActivityEnterView.getHeight();
            chatActivityEnterView.f23655f4 = height;
            if (chatActivityEnterView.R1 == 2) {
                int dp = AndroidUtilities.dp(175.0f);
                Point point = AndroidUtilities.displaySize;
                if (point.x > point.y) {
                    i10 = chatActivityEnterView.f23768y2;
                } else {
                    i10 = chatActivityEnterView.f23761x2;
                }
                chatActivityEnterView.f23655f4 = Math.min(height, dp + i10);
            }
            if (chatActivityEnterView.G5 == null) {
                chatActivityEnterView.U0.getLayoutParams().height = chatActivityEnterView.f23655f4;
            }
            chatActivityEnterView.U0.setLayerType(2, null);
            yw0Var.requestLayout();
            if (chatActivityEnterView.f23629b5) {
                yw0Var.setForeground(new gd(chatActivityEnterView));
            }
            this.f3993b = (int) chatActivityEnterView.getTranslationY();
            sg sgVar = chatActivityEnterView.Z2;
            if (sgVar != null) {
                sgVar.y1();
            }
        }
    }

    public a(MessageDigest messageDigest, int i10) {
        ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN);
        this.f3994c = messageDigest;
        this.f3993b = i10;
    }
}
