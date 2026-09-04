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
import org.telegram.ui.Components.fd;
import org.telegram.ui.Components.og;
import org.telegram.ui.Components.ov0;
import org.telegram.ui.Components.qf;
import org.telegram.ui.Components.qx;
import r0.m0;
public final class a implements m0, qx {
    public boolean f4138a;
    public int f4139b;
    public Object f4140c;

    public a(FrameLayout frameLayout) {
        this.f4140c = frameLayout;
    }

    @Override
    public void a() {
        this.f4138a = true;
    }

    @Override
    public void b() {
        super/*android.view.ViewGroup*/.setVisibility(0);
        this.f4138a = false;
    }

    @Override
    public void c() {
        if (this.f4138a) {
            return;
        }
        ActionBarContextView actionBarContextView = (ActionBarContextView) this.f4140c;
        actionBarContextView.f958f = null;
        super/*android.view.ViewGroup*/.setVisibility(this.f4139b);
    }

    public boolean d() {
        bz bzVar;
        qf qfVar;
        ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.f4140c;
        if (chatActivityEnterView.f23791w3) {
            if ((chatActivityEnterView.y3 || (qfVar = chatActivityEnterView.E0) == null || qfVar.length() <= 0) && (bzVar = chatActivityEnterView.U0.f28003y0) != null && bzVar.h() > 0 && !chatActivityEnterView.j3) {
                return true;
            }
            return false;
        }
        return false;
    }

    public void e() {
        int i10;
        ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.f4140c;
        ov0 ov0Var = chatActivityEnterView.l1;
        if (d()) {
            AnimatorSet animatorSet = chatActivityEnterView.A3;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            chatActivityEnterView.D3 = true;
            this.f4138a = chatActivityEnterView.y3;
            chatActivityEnterView.y3 = true;
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 1);
            int height = ((((ov0Var.getHeight() - AndroidUtilities.statusBarHeight) - AndroidUtilities.navigationBarHeight) - AndroidUtilities.dp(6.0f)) - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - chatActivityEnterView.getHeight();
            chatActivityEnterView.C3 = height;
            if (chatActivityEnterView.Q1 == 2) {
                int dp = AndroidUtilities.dp(175.0f);
                Point point = AndroidUtilities.displaySize;
                if (point.x > point.y) {
                    i10 = chatActivityEnterView.f23796x2;
                } else {
                    i10 = chatActivityEnterView.f23790w2;
                }
                chatActivityEnterView.C3 = Math.min(height, dp + i10);
            }
            if (chatActivityEnterView.f23681c5 == null) {
                chatActivityEnterView.U0.getLayoutParams().height = chatActivityEnterView.C3;
            }
            chatActivityEnterView.U0.setLayerType(2, null);
            ov0Var.requestLayout();
            if (chatActivityEnterView.f23798x4) {
                ov0Var.setForeground(new fd(chatActivityEnterView));
            }
            this.f4139b = (int) chatActivityEnterView.getTranslationY();
            og ogVar = chatActivityEnterView.Y2;
            if (ogVar != null) {
                ogVar.m1();
            }
        }
    }

    public a(MessageDigest messageDigest, int i10) {
        ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN);
        this.f4140c = messageDigest;
        this.f4139b = i10;
    }
}
