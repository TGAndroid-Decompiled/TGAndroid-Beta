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
import org.telegram.ui.Components.cy;
import org.telegram.ui.Components.gd;
import org.telegram.ui.Components.mz;
import org.telegram.ui.Components.ow0;
import org.telegram.ui.Components.pg;
import org.telegram.ui.Components.rf;
import r0.n0;
public final class f implements n0, cy {
    public int f4357a;
    public boolean f4358b;
    public Object f4359c;

    public f(FrameLayout frameLayout) {
        this.f4359c = frameLayout;
    }

    @Override
    public void a() {
        this.f4358b = true;
    }

    @Override
    public void b() {
        super/*android.view.ViewGroup*/.setVisibility(0);
        this.f4358b = false;
    }

    @Override
    public void c() {
        if (this.f4358b) {
            return;
        }
        ActionBarContextView actionBarContextView = (ActionBarContextView) this.f4359c;
        actionBarContextView.f1119f = null;
        super/*android.view.ViewGroup*/.setVisibility(this.f4357a);
    }

    public boolean d() {
        mz mzVar;
        rf rfVar;
        ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.f4359c;
        if (chatActivityEnterView.f22986x3) {
            if ((chatActivityEnterView.f22996z3 || (rfVar = chatActivityEnterView.E0) == null || rfVar.length() <= 0) && (mzVar = chatActivityEnterView.U0.f31084y0) != null && mzVar.h() > 0 && !chatActivityEnterView.f22916k3) {
                return true;
            }
            return false;
        }
        return false;
    }

    public void e() {
        int i10;
        ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.f4359c;
        ow0 ow0Var = chatActivityEnterView.f22923m1;
        if (d()) {
            AnimatorSet animatorSet = chatActivityEnterView.B3;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            chatActivityEnterView.E3 = true;
            this.f4358b = chatActivityEnterView.f22996z3;
            chatActivityEnterView.f22996z3 = true;
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 1);
            int height = ((((ow0Var.getHeight() - AndroidUtilities.statusBarHeight) - AndroidUtilities.navigationBarHeight) - AndroidUtilities.dp(6.0f)) - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - chatActivityEnterView.getHeight();
            chatActivityEnterView.D3 = height;
            if (chatActivityEnterView.R1 == 2) {
                int dp = AndroidUtilities.dp(175.0f);
                Point point = AndroidUtilities.displaySize;
                if (point.x > point.y) {
                    i10 = chatActivityEnterView.f22991y2;
                } else {
                    i10 = chatActivityEnterView.f22985x2;
                }
                chatActivityEnterView.D3 = Math.min(height, dp + i10);
            }
            if (chatActivityEnterView.f22875d5 == null) {
                chatActivityEnterView.U0.getLayoutParams().height = chatActivityEnterView.D3;
            }
            chatActivityEnterView.U0.setLayerType(2, null);
            ow0Var.requestLayout();
            if (chatActivityEnterView.f22992y4) {
                ow0Var.setForeground(new gd(chatActivityEnterView));
            }
            this.f4357a = (int) chatActivityEnterView.getTranslationY();
            pg pgVar = chatActivityEnterView.Z2;
            if (pgVar != null) {
                pgVar.n1();
            }
        }
    }

    public f(MessageDigest messageDigest, int i10) {
        ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN);
        this.f4359c = messageDigest;
        this.f4357a = i10;
    }
}
