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
import org.telegram.ui.Components.cz;
import org.telegram.ui.Components.ed;
import org.telegram.ui.Components.ng;
import org.telegram.ui.Components.pf;
import org.telegram.ui.Components.pv0;
import org.telegram.ui.Components.qx;
import r0.m0;
public final class a implements m0, qx {
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
        pf pfVar;
        ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.f3650c;
        if (chatActivityEnterView.f21831w3) {
            if ((chatActivityEnterView.y3 || (pfVar = chatActivityEnterView.E0) == null || pfVar.length() <= 0) && (czVar = chatActivityEnterView.U0.f26038y0) != null && czVar.h() > 0 && !chatActivityEnterView.j3) {
                return true;
            }
            return false;
        }
        return false;
    }

    public void e() {
        int i10;
        ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.f3650c;
        pv0 pv0Var = chatActivityEnterView.l1;
        if (d()) {
            AnimatorSet animatorSet = chatActivityEnterView.A3;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            chatActivityEnterView.D3 = true;
            this.f3648a = chatActivityEnterView.y3;
            chatActivityEnterView.y3 = true;
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 1);
            int height = ((((pv0Var.getHeight() - AndroidUtilities.statusBarHeight) - AndroidUtilities.navigationBarHeight) - AndroidUtilities.dp(6.0f)) - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - chatActivityEnterView.getHeight();
            chatActivityEnterView.C3 = height;
            if (chatActivityEnterView.Q1 == 2) {
                int dp = AndroidUtilities.dp(175.0f);
                Point point = AndroidUtilities.displaySize;
                if (point.x > point.y) {
                    i10 = chatActivityEnterView.f21836x2;
                } else {
                    i10 = chatActivityEnterView.f21830w2;
                }
                chatActivityEnterView.C3 = Math.min(height, dp + i10);
            }
            if (chatActivityEnterView.f21727d5 == null) {
                chatActivityEnterView.U0.getLayoutParams().height = chatActivityEnterView.C3;
            }
            chatActivityEnterView.U0.setLayerType(2, null);
            pv0Var.requestLayout();
            if (chatActivityEnterView.f21843y4) {
                pv0Var.setForeground(new ed(chatActivityEnterView));
            }
            this.f3649b = (int) chatActivityEnterView.getTranslationY();
            ng ngVar = chatActivityEnterView.Y2;
            if (ngVar != null) {
                ngVar.s1();
            }
        }
    }

    public a(MessageDigest messageDigest, int i10) {
        ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN);
        this.f3650c = messageDigest;
        this.f3649b = i10;
    }
}
