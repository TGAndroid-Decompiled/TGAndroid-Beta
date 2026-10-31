package c5;

import android.animation.AnimatorSet;
import android.graphics.Point;
import android.widget.FrameLayout;
import androidx.appcompat.widget.ActionBarContextView;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.MessageDigest;
import org.telegram.messenger.i0;
import org.telegram.messenger.zs;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.bx;
import org.telegram.ui.Components.ny;
import org.telegram.ui.Components.se;
import org.telegram.ui.Components.sf;
import org.telegram.ui.Components.uu0;
import r0.l0;
public final class e implements l0, bx {
    public int f3775a;
    public boolean f3776b;
    public Object f3777c;

    public e(FrameLayout frameLayout) {
        this.f3777c = frameLayout;
    }

    @Override
    public void a() {
        this.f3776b = true;
    }

    @Override
    public void b() {
        super/*android.view.ViewGroup*/.setVisibility(0);
        this.f3776b = false;
    }

    @Override
    public void c() {
        if (this.f3776b) {
            return;
        }
        ActionBarContextView actionBarContextView = (ActionBarContextView) this.f3777c;
        actionBarContextView.f1023f = null;
        super/*android.view.ViewGroup*/.setVisibility(this.f3775a);
    }

    public boolean d() {
        ny nyVar;
        se seVar;
        ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.f3777c;
        if (chatActivityEnterView.f23813x3) {
            if ((chatActivityEnterView.f23823z3 || (seVar = chatActivityEnterView.E0) == null || seVar.length() <= 0) && (nyVar = chatActivityEnterView.U0.f31935y0) != null && nyVar.b() > 0 && !chatActivityEnterView.f23739k3) {
                return true;
            }
            return false;
        }
        return false;
    }

    public void e() {
        int i10;
        ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.f3777c;
        uu0 uu0Var = chatActivityEnterView.f23746m1;
        if (d()) {
            AnimatorSet animatorSet = chatActivityEnterView.B3;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            chatActivityEnterView.E3 = true;
            this.f3776b = chatActivityEnterView.f23823z3;
            chatActivityEnterView.f23823z3 = true;
            zs.e().k(zs.f19633j1, 1);
            int height = ((((uu0Var.getHeight() - i0.f16020m) - i0.f16021n) - i0.L(6.0f)) - org.telegram.ui.ActionBar.l.getCurrentActionBarHeight()) - chatActivityEnterView.getHeight();
            chatActivityEnterView.D3 = height;
            if (chatActivityEnterView.R1 == 2) {
                int L = i0.L(175.0f);
                Point point = i0.f16026q;
                if (point.x > point.y) {
                    i10 = chatActivityEnterView.f23818y2;
                } else {
                    i10 = chatActivityEnterView.f23812x2;
                }
                chatActivityEnterView.D3 = Math.min(height, L + i10);
            }
            if (chatActivityEnterView.f23723h5 == null) {
                chatActivityEnterView.U0.getLayoutParams().height = chatActivityEnterView.D3;
            }
            chatActivityEnterView.U0.setLayerType(2, null);
            uu0Var.requestLayout();
            if (chatActivityEnterView.f23819y4) {
                uu0Var.setForeground(new jh.g(chatActivityEnterView));
            }
            this.f3775a = (int) chatActivityEnterView.getTranslationY();
            sf sfVar = chatActivityEnterView.Z2;
            if (sfVar != null) {
                sfVar.d1();
            }
        }
    }

    public e(MessageDigest messageDigest, int i10) {
        ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN);
        this.f3777c = messageDigest;
        this.f3775a = i10;
    }
}
