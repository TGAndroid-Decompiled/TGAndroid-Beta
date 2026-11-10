package bg;

import android.animation.AnimatorSet;
import android.graphics.Point;
import android.widget.FrameLayout;
import androidx.appcompat.widget.ActionBarContextView;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.MessageDigest;
import org.telegram.messenger.qs;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.mw;
import org.telegram.ui.Components.nc;
import org.telegram.ui.Components.st0;
import org.telegram.ui.Components.vf;
import org.telegram.ui.Components.we;
import org.telegram.ui.Components.xx;
public final class w0 implements r0.m0, mw {
    public boolean f3392a;
    public int f3393b;
    public Object f3394c;

    public w0(FrameLayout frameLayout) {
        this.f3394c = frameLayout;
    }

    @Override
    public void a() {
        this.f3392a = true;
    }

    @Override
    public void b() {
        super/*android.view.ViewGroup*/.setVisibility(0);
        this.f3392a = false;
    }

    @Override
    public void c() {
        if (this.f3392a) {
            return;
        }
        ActionBarContextView actionBarContextView = (ActionBarContextView) this.f3394c;
        actionBarContextView.f1921f = null;
        super/*android.view.ViewGroup*/.setVisibility(this.f3393b);
    }

    public boolean d() {
        xx xxVar;
        we weVar;
        ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.f3394c;
        if (chatActivityEnterView.f31169x3) {
            if ((chatActivityEnterView.f31180z3 || (weVar = chatActivityEnterView.E0) == null || weVar.length() <= 0) && (xxVar = chatActivityEnterView.U0.f34085y0) != null && xxVar.b() > 0 && !chatActivityEnterView.f31095k3) {
                return true;
            }
            return false;
        }
        return false;
    }

    public void e() {
        int i7;
        ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.f3394c;
        st0 st0Var = chatActivityEnterView.f31103m1;
        if (d()) {
            AnimatorSet animatorSet = chatActivityEnterView.B3;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            chatActivityEnterView.E3 = true;
            this.f3392a = chatActivityEnterView.f31180z3;
            chatActivityEnterView.f31180z3 = true;
            qs.e().k(qs.f25025j1, 1);
            int height = ((((st0Var.getHeight() - org.telegram.messenger.g0.f22561m) - org.telegram.messenger.g0.f22562n) - org.telegram.messenger.g0.L(6.0f)) - org.telegram.ui.ActionBar.l.getCurrentActionBarHeight()) - chatActivityEnterView.getHeight();
            chatActivityEnterView.D3 = height;
            if (chatActivityEnterView.R1 == 2) {
                int L = org.telegram.messenger.g0.L(175.0f);
                Point point = org.telegram.messenger.g0.f22567q;
                if (point.x > point.y) {
                    i7 = chatActivityEnterView.f31174y2;
                } else {
                    i7 = chatActivityEnterView.f31168x2;
                }
                chatActivityEnterView.D3 = Math.min(height, L + i7);
            }
            if (chatActivityEnterView.f31080h5 == null) {
                chatActivityEnterView.U0.getLayoutParams().height = chatActivityEnterView.D3;
            }
            chatActivityEnterView.U0.setLayerType(2, null);
            st0Var.requestLayout();
            if (chatActivityEnterView.f31176y4) {
                st0Var.setForeground(new nc(chatActivityEnterView));
            }
            this.f3393b = (int) chatActivityEnterView.getTranslationY();
            vf vfVar = chatActivityEnterView.Z2;
            if (vfVar != null) {
                vfVar.h1();
            }
        }
    }

    public w0(MessageDigest messageDigest, int i7) {
        ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN);
        this.f3394c = messageDigest;
        this.f3393b = i7;
    }
}
