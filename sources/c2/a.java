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
import org.telegram.ui.Components.dw0;
import org.telegram.ui.Components.ez;
import org.telegram.ui.Components.fd;
import org.telegram.ui.Components.pg;
import org.telegram.ui.Components.rf;
import org.telegram.ui.Components.tx;
import r0.m0;
public final class a implements m0, tx {
    public boolean f3655a;
    public int f3656b;
    public Object f3657c;

    public a(FrameLayout frameLayout) {
        this.f3657c = frameLayout;
    }

    @Override
    public void a() {
        this.f3655a = true;
    }

    @Override
    public void b() {
        super/*android.view.ViewGroup*/.setVisibility(0);
        this.f3655a = false;
    }

    @Override
    public void c() {
        if (this.f3655a) {
            return;
        }
        ActionBarContextView actionBarContextView = (ActionBarContextView) this.f3657c;
        actionBarContextView.f1975f = null;
        super/*android.view.ViewGroup*/.setVisibility(this.f3656b);
    }

    public boolean d() {
        ez ezVar;
        rf rfVar;
        ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.f3657c;
        if (chatActivityEnterView.f22110x3) {
            if ((chatActivityEnterView.f22120z3 || (rfVar = chatActivityEnterView.E0) == null || rfVar.length() <= 0) && (ezVar = chatActivityEnterView.U0.f26888y0) != null && ezVar.h() > 0 && !chatActivityEnterView.f22040k3) {
                return true;
            }
            return false;
        }
        return false;
    }

    public void e() {
        int i10;
        ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.f3657c;
        dw0 dw0Var = chatActivityEnterView.f22047m1;
        if (d()) {
            AnimatorSet animatorSet = chatActivityEnterView.B3;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            chatActivityEnterView.E3 = true;
            this.f3655a = chatActivityEnterView.f22120z3;
            chatActivityEnterView.f22120z3 = true;
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 1);
            int height = ((((dw0Var.getHeight() - AndroidUtilities.statusBarHeight) - AndroidUtilities.navigationBarHeight) - AndroidUtilities.dp(6.0f)) - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - chatActivityEnterView.getHeight();
            chatActivityEnterView.D3 = height;
            if (chatActivityEnterView.R1 == 2) {
                int dp = AndroidUtilities.dp(175.0f);
                Point point = AndroidUtilities.displaySize;
                if (point.x > point.y) {
                    i10 = chatActivityEnterView.f22115y2;
                } else {
                    i10 = chatActivityEnterView.f22109x2;
                }
                chatActivityEnterView.D3 = Math.min(height, dp + i10);
            }
            if (chatActivityEnterView.f22000d5 == null) {
                chatActivityEnterView.U0.getLayoutParams().height = chatActivityEnterView.D3;
            }
            chatActivityEnterView.U0.setLayerType(2, null);
            dw0Var.requestLayout();
            if (chatActivityEnterView.f22116y4) {
                dw0Var.setForeground(new fd(chatActivityEnterView));
            }
            this.f3656b = (int) chatActivityEnterView.getTranslationY();
            pg pgVar = chatActivityEnterView.Z2;
            if (pgVar != null) {
                pgVar.s1();
            }
        }
    }

    public a(MessageDigest messageDigest, int i10) {
        ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN);
        this.f3657c = messageDigest;
        this.f3656b = i10;
    }
}
