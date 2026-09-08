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
    public boolean f4165a;
    public int f4166b;
    public Object f4167c;

    public a(FrameLayout frameLayout) {
        this.f4167c = frameLayout;
    }

    @Override
    public void a() {
        this.f4165a = true;
    }

    @Override
    public void b() {
        super/*android.view.ViewGroup*/.setVisibility(0);
        this.f4165a = false;
    }

    @Override
    public void c() {
        if (this.f4165a) {
            return;
        }
        ActionBarContextView actionBarContextView = (ActionBarContextView) this.f4167c;
        actionBarContextView.f970f = null;
        super/*android.view.ViewGroup*/.setVisibility(this.f4166b);
    }

    public boolean d() {
        bz bzVar;
        qf qfVar;
        ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.f4167c;
        if (chatActivityEnterView.f23818w3) {
            if ((chatActivityEnterView.y3 || (qfVar = chatActivityEnterView.E0) == null || qfVar.length() <= 0) && (bzVar = chatActivityEnterView.U0.f28030y0) != null && bzVar.h() > 0 && !chatActivityEnterView.j3) {
                return true;
            }
            return false;
        }
        return false;
    }

    public void e() {
        int i10;
        ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.f4167c;
        ov0 ov0Var = chatActivityEnterView.l1;
        if (d()) {
            AnimatorSet animatorSet = chatActivityEnterView.A3;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            chatActivityEnterView.D3 = true;
            this.f4165a = chatActivityEnterView.y3;
            chatActivityEnterView.y3 = true;
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 1);
            int height = ((((ov0Var.getHeight() - AndroidUtilities.statusBarHeight) - AndroidUtilities.navigationBarHeight) - AndroidUtilities.dp(6.0f)) - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - chatActivityEnterView.getHeight();
            chatActivityEnterView.C3 = height;
            if (chatActivityEnterView.Q1 == 2) {
                int dp = AndroidUtilities.dp(175.0f);
                Point point = AndroidUtilities.displaySize;
                if (point.x > point.y) {
                    i10 = chatActivityEnterView.f23823x2;
                } else {
                    i10 = chatActivityEnterView.f23817w2;
                }
                chatActivityEnterView.C3 = Math.min(height, dp + i10);
            }
            if (chatActivityEnterView.f23708c5 == null) {
                chatActivityEnterView.U0.getLayoutParams().height = chatActivityEnterView.C3;
            }
            chatActivityEnterView.U0.setLayerType(2, null);
            ov0Var.requestLayout();
            if (chatActivityEnterView.f23825x4) {
                ov0Var.setForeground(new fd(chatActivityEnterView));
            }
            this.f4166b = (int) chatActivityEnterView.getTranslationY();
            og ogVar = chatActivityEnterView.Y2;
            if (ogVar != null) {
                ogVar.m1();
            }
        }
    }

    public a(MessageDigest messageDigest, int i10) {
        ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN);
        this.f4167c = messageDigest;
        this.f4166b = i10;
    }
}
