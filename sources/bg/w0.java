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
import org.telegram.ui.Components.nw;
import org.telegram.ui.Components.oc;
import org.telegram.ui.Components.tt0;
import org.telegram.ui.Components.wf;
import org.telegram.ui.Components.xe;
import org.telegram.ui.Components.yx;
public final class w0 implements r0.m0, nw {
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
        yx yxVar;
        xe xeVar;
        ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.f3394c;
        if (chatActivityEnterView.f31158x3) {
            if ((chatActivityEnterView.f31169z3 || (xeVar = chatActivityEnterView.E0) == null || xeVar.length() <= 0) && (yxVar = chatActivityEnterView.U0.f34484y0) != null && yxVar.b() > 0 && !chatActivityEnterView.f31084k3) {
                return true;
            }
            return false;
        }
        return false;
    }

    public void e() {
        int i7;
        ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.f3394c;
        tt0 tt0Var = chatActivityEnterView.f31092m1;
        if (d()) {
            AnimatorSet animatorSet = chatActivityEnterView.B3;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            chatActivityEnterView.E3 = true;
            this.f3392a = chatActivityEnterView.f31169z3;
            chatActivityEnterView.f31169z3 = true;
            qs.e().k(qs.f25021j1, 1);
            int height = ((((tt0Var.getHeight() - org.telegram.messenger.g0.f22557m) - org.telegram.messenger.g0.f22558n) - org.telegram.messenger.g0.L(6.0f)) - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - chatActivityEnterView.getHeight();
            chatActivityEnterView.D3 = height;
            if (chatActivityEnterView.R1 == 2) {
                int L = org.telegram.messenger.g0.L(175.0f);
                Point point = org.telegram.messenger.g0.f22563q;
                if (point.x > point.y) {
                    i7 = chatActivityEnterView.f31163y2;
                } else {
                    i7 = chatActivityEnterView.f31157x2;
                }
                chatActivityEnterView.D3 = Math.min(height, L + i7);
            }
            if (chatActivityEnterView.f31069h5 == null) {
                chatActivityEnterView.U0.getLayoutParams().height = chatActivityEnterView.D3;
            }
            chatActivityEnterView.U0.setLayerType(2, null);
            tt0Var.requestLayout();
            if (chatActivityEnterView.f31165y4) {
                tt0Var.setForeground(new oc(chatActivityEnterView));
            }
            this.f3393b = (int) chatActivityEnterView.getTranslationY();
            wf wfVar = chatActivityEnterView.Z2;
            if (wfVar != null) {
                wfVar.h1();
            }
        }
    }

    public w0(MessageDigest messageDigest, int i7) {
        ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN);
        this.f3394c = messageDigest;
        this.f3393b = i7;
    }
}
