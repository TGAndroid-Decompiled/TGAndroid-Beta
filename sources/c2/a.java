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
import org.telegram.ui.Components.ez;
import org.telegram.ui.Components.fd;
import org.telegram.ui.Components.mw0;
import org.telegram.ui.Components.pg;
import org.telegram.ui.Components.rf;
import org.telegram.ui.Components.tx;
import r0.m0;
public final class a implements m0, tx {
    public boolean f3944a;
    public int f3945b;
    public Object f3946c;

    public a(FrameLayout frameLayout) {
        this.f3946c = frameLayout;
    }

    @Override
    public void a() {
        this.f3944a = true;
    }

    @Override
    public void b() {
        super/*android.view.ViewGroup*/.setVisibility(0);
        this.f3944a = false;
    }

    @Override
    public void c() {
        if (this.f3944a) {
            return;
        }
        ActionBarContextView actionBarContextView = (ActionBarContextView) this.f3946c;
        actionBarContextView.f2142f = null;
        super/*android.view.ViewGroup*/.setVisibility(this.f3945b);
    }

    public boolean d() {
        ez ezVar;
        rf rfVar;
        ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.f3946c;
        if (chatActivityEnterView.f23991x3) {
            if ((chatActivityEnterView.f24001z3 || (rfVar = chatActivityEnterView.E0) == null || rfVar.length() <= 0) && (ezVar = chatActivityEnterView.U0.f29265y0) != null && ezVar.h() > 0 && !chatActivityEnterView.f23921k3) {
                return true;
            }
            return false;
        }
        return false;
    }

    public void e() {
        int i10;
        ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.f3946c;
        mw0 mw0Var = chatActivityEnterView.f23928m1;
        if (d()) {
            AnimatorSet animatorSet = chatActivityEnterView.B3;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            chatActivityEnterView.E3 = true;
            this.f3944a = chatActivityEnterView.f24001z3;
            chatActivityEnterView.f24001z3 = true;
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 1);
            int height = ((((mw0Var.getHeight() - AndroidUtilities.statusBarHeight) - AndroidUtilities.navigationBarHeight) - AndroidUtilities.dp(6.0f)) - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - chatActivityEnterView.getHeight();
            chatActivityEnterView.D3 = height;
            if (chatActivityEnterView.R1 == 2) {
                int dp = AndroidUtilities.dp(175.0f);
                Point point = AndroidUtilities.displaySize;
                if (point.x > point.y) {
                    i10 = chatActivityEnterView.f23996y2;
                } else {
                    i10 = chatActivityEnterView.f23990x2;
                }
                chatActivityEnterView.D3 = Math.min(height, dp + i10);
            }
            if (chatActivityEnterView.f23880d5 == null) {
                chatActivityEnterView.U0.getLayoutParams().height = chatActivityEnterView.D3;
            }
            chatActivityEnterView.U0.setLayerType(2, null);
            mw0Var.requestLayout();
            if (chatActivityEnterView.f23997y4) {
                mw0Var.setForeground(new fd(chatActivityEnterView));
            }
            this.f3945b = (int) chatActivityEnterView.getTranslationY();
            pg pgVar = chatActivityEnterView.Z2;
            if (pgVar != null) {
                pgVar.s1();
            }
        }
    }

    public a(MessageDigest messageDigest, int i10) {
        ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN);
        this.f3946c = messageDigest;
        this.f3945b = i10;
    }
}
