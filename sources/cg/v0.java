package cg;

import android.animation.AnimatorSet;
import android.graphics.Point;
import android.widget.FrameLayout;
import androidx.appcompat.widget.ActionBarContextView;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.MessageDigest;
import org.telegram.messenger.hs;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.lw;
import org.telegram.ui.Components.mc;
import org.telegram.ui.Components.qt0;
import org.telegram.ui.Components.uf;
import org.telegram.ui.Components.ve;
import org.telegram.ui.Components.vx;
public final class v0 implements r0.m0, lw {
    public boolean f4757a;
    public int f4758b;
    public Object f4759c;

    public v0(FrameLayout frameLayout) {
        this.f4759c = frameLayout;
    }

    @Override
    public void a() {
        this.f4757a = true;
    }

    @Override
    public void b() {
        super/*android.view.ViewGroup*/.setVisibility(0);
        this.f4757a = false;
    }

    @Override
    public void c() {
        if (this.f4757a) {
            return;
        }
        ActionBarContextView actionBarContextView = (ActionBarContextView) this.f4759c;
        actionBarContextView.f1343f = null;
        super/*android.view.ViewGroup*/.setVisibility(this.f4758b);
    }

    public boolean d() {
        vx vxVar;
        ve veVar;
        ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.f4759c;
        if (chatActivityEnterView.f31229y3) {
            if ((chatActivityEnterView.A3 || (veVar = chatActivityEnterView.F0) == null || veVar.length() <= 0) && (vxVar = chatActivityEnterView.V0.f33599z0) != null && vxVar.b() > 0 && !chatActivityEnterView.f31154l3) {
                return true;
            }
            return false;
        }
        return false;
    }

    public void e() {
        int i3;
        ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.f4759c;
        qt0 qt0Var = chatActivityEnterView.f31163n1;
        if (d()) {
            AnimatorSet animatorSet = chatActivityEnterView.C3;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            chatActivityEnterView.F3 = true;
            this.f4757a = chatActivityEnterView.A3;
            chatActivityEnterView.A3 = true;
            hs.e().k(hs.f23249j1, 1);
            int height = ((((qt0Var.getHeight() - org.telegram.messenger.g0.f22602m) - org.telegram.messenger.g0.f22603n) - org.telegram.messenger.g0.L(6.0f)) - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - chatActivityEnterView.getHeight();
            chatActivityEnterView.E3 = height;
            if (chatActivityEnterView.S1 == 2) {
                int L = org.telegram.messenger.g0.L(175.0f);
                Point point = org.telegram.messenger.g0.f22608q;
                if (point.x > point.y) {
                    i3 = chatActivityEnterView.f31233z2;
                } else {
                    i3 = chatActivityEnterView.f31228y2;
                }
                chatActivityEnterView.E3 = Math.min(height, L + i3);
            }
            if (chatActivityEnterView.f31139i5 == null) {
                chatActivityEnterView.V0.getLayoutParams().height = chatActivityEnterView.E3;
            }
            chatActivityEnterView.V0.setLayerType(2, null);
            qt0Var.requestLayout();
            if (chatActivityEnterView.f31235z4) {
                qt0Var.setForeground(new mc(chatActivityEnterView));
            }
            this.f4758b = (int) chatActivityEnterView.getTranslationY();
            uf ufVar = chatActivityEnterView.f31087a3;
            if (ufVar != null) {
                ufVar.g1();
            }
        }
    }

    public v0(MessageDigest messageDigest, int i3) {
        ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN);
        this.f4759c = messageDigest;
        this.f4758b = i3;
    }
}
