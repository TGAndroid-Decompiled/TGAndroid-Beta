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
import r0.m0;
public final class f implements m0, cy {
    public int f4360a;
    public boolean f4361b;
    public Object f4362c;

    public f(FrameLayout frameLayout) {
        this.f4362c = frameLayout;
    }

    @Override
    public void a() {
        this.f4361b = true;
    }

    @Override
    public void b() {
        super/*android.view.ViewGroup*/.setVisibility(0);
        this.f4361b = false;
    }

    @Override
    public void c() {
        if (this.f4361b) {
            return;
        }
        ActionBarContextView actionBarContextView = (ActionBarContextView) this.f4362c;
        actionBarContextView.f1123f = null;
        super/*android.view.ViewGroup*/.setVisibility(this.f4360a);
    }

    public boolean d() {
        mz mzVar;
        rf rfVar;
        ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.f4362c;
        if (chatActivityEnterView.f22686x3) {
            if ((chatActivityEnterView.f22696z3 || (rfVar = chatActivityEnterView.E0) == null || rfVar.length() <= 0) && (mzVar = chatActivityEnterView.U0.f30777y0) != null && mzVar.h() > 0 && !chatActivityEnterView.f22616k3) {
                return true;
            }
            return false;
        }
        return false;
    }

    public void e() {
        int i10;
        ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.f4362c;
        ow0 ow0Var = chatActivityEnterView.f22623m1;
        if (d()) {
            AnimatorSet animatorSet = chatActivityEnterView.B3;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            chatActivityEnterView.E3 = true;
            this.f4361b = chatActivityEnterView.f22696z3;
            chatActivityEnterView.f22696z3 = true;
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 1);
            int height = ((((ow0Var.getHeight() - AndroidUtilities.statusBarHeight) - AndroidUtilities.navigationBarHeight) - AndroidUtilities.dp(6.0f)) - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - chatActivityEnterView.getHeight();
            chatActivityEnterView.D3 = height;
            if (chatActivityEnterView.R1 == 2) {
                int dp = AndroidUtilities.dp(175.0f);
                Point point = AndroidUtilities.displaySize;
                if (point.x > point.y) {
                    i10 = chatActivityEnterView.f22691y2;
                } else {
                    i10 = chatActivityEnterView.f22685x2;
                }
                chatActivityEnterView.D3 = Math.min(height, dp + i10);
            }
            if (chatActivityEnterView.f22575d5 == null) {
                chatActivityEnterView.U0.getLayoutParams().height = chatActivityEnterView.D3;
            }
            chatActivityEnterView.U0.setLayerType(2, null);
            ow0Var.requestLayout();
            if (chatActivityEnterView.f22692y4) {
                ow0Var.setForeground(new gd(chatActivityEnterView));
            }
            this.f4360a = (int) chatActivityEnterView.getTranslationY();
            pg pgVar = chatActivityEnterView.Z2;
            if (pgVar != null) {
                pgVar.o1();
            }
        }
    }

    public f(MessageDigest messageDigest, int i10) {
        ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN);
        this.f4362c = messageDigest;
        this.f4360a = i10;
    }
}
