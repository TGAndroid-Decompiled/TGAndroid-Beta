package bg;

import android.animation.AnimatorSet;
import android.graphics.Point;
import android.widget.FrameLayout;
import androidx.appcompat.widget.ActionBarContextView;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.MessageDigest;
import org.telegram.messenger.ks;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.au0;
import org.telegram.ui.Components.gf;
import org.telegram.ui.Components.jy;
import org.telegram.ui.Components.kg;
import org.telegram.ui.Components.sc;
import org.telegram.ui.Components.yw;
public final class w0 implements r0.m0, yw {
    public boolean f3354a;
    public int f3355b;
    public Object f3356c;

    public w0(FrameLayout frameLayout) {
        this.f3356c = frameLayout;
    }

    @Override
    public void a() {
        this.f3354a = true;
    }

    @Override
    public void b() {
        super/*android.view.ViewGroup*/.setVisibility(0);
        this.f3354a = false;
    }

    @Override
    public void c() {
        if (this.f3354a) {
            return;
        }
        ActionBarContextView actionBarContextView = (ActionBarContextView) this.f3356c;
        actionBarContextView.f1863f = null;
        super/*android.view.ViewGroup*/.setVisibility(this.f3355b);
    }

    public boolean d() {
        jy jyVar;
        gf gfVar;
        ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.f3356c;
        if (chatActivityEnterView.f32631l4) {
            if ((chatActivityEnterView.f32646n4 || (gfVar = chatActivityEnterView.F0) == null || gfVar.length() <= 0) && (jyVar = chatActivityEnterView.V0.f39414z0) != null && jyVar.b() > 0 && !chatActivityEnterView.Y3) {
                return true;
            }
            return false;
        }
        return false;
    }

    public void e() {
        int i7;
        ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.f3356c;
        au0 au0Var = chatActivityEnterView.f32542a2;
        if (d()) {
            AnimatorSet animatorSet = chatActivityEnterView.f32659p4;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            chatActivityEnterView.f32682s4 = true;
            this.f3354a = chatActivityEnterView.f32646n4;
            chatActivityEnterView.f32646n4 = true;
            ks.e().k(ks.f25135j1, 1);
            int height = ((((au0Var.getHeight() - org.telegram.messenger.g0.f24112m) - org.telegram.messenger.g0.f24113n) - org.telegram.messenger.g0.L(6.0f)) - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - chatActivityEnterView.getHeight();
            chatActivityEnterView.f32674r4 = height;
            if (chatActivityEnterView.F2 == 2) {
                int L = org.telegram.messenger.g0.L(175.0f);
                Point point = org.telegram.messenger.g0.f24118q;
                if (point.x > point.y) {
                    i7 = chatActivityEnterView.f32637m3;
                } else {
                    i7 = chatActivityEnterView.f32630l3;
                }
                chatActivityEnterView.f32674r4 = Math.min(height, L + i7);
            }
            if (chatActivityEnterView.f32565c7 == null) {
                chatActivityEnterView.V0.getLayoutParams().height = chatActivityEnterView.f32674r4;
            }
            chatActivityEnterView.V0.setLayerType(2, null);
            au0Var.requestLayout();
            if (chatActivityEnterView.W5) {
                au0Var.setForeground(new sc(chatActivityEnterView));
            }
            this.f3355b = (int) chatActivityEnterView.getTranslationY();
            kg kgVar = chatActivityEnterView.N3;
            if (kgVar != null) {
                kgVar.q1();
            }
        }
    }

    public w0(MessageDigest messageDigest, int i7) {
        ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN);
        this.f3356c = messageDigest;
        this.f3355b = i7;
    }
}
