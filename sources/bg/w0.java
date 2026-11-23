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
import org.telegram.ui.Components.cu0;
import org.telegram.ui.Components.hf;
import org.telegram.ui.Components.iy;
import org.telegram.ui.Components.mg;
import org.telegram.ui.Components.sc;
import org.telegram.ui.Components.xw;
public final class w0 implements r0.m0, xw {
    public boolean f3324a;
    public int f3325b;
    public Object f3326c;

    public w0(FrameLayout frameLayout) {
        this.f3326c = frameLayout;
    }

    @Override
    public void a() {
        this.f3324a = true;
    }

    @Override
    public void b() {
        super/*android.view.ViewGroup*/.setVisibility(0);
        this.f3324a = false;
    }

    @Override
    public void c() {
        if (this.f3324a) {
            return;
        }
        ActionBarContextView actionBarContextView = (ActionBarContextView) this.f3326c;
        actionBarContextView.f1834f = null;
        super/*android.view.ViewGroup*/.setVisibility(this.f3325b);
    }

    public boolean d() {
        iy iyVar;
        hf hfVar;
        ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.f3326c;
        if (chatActivityEnterView.f32741n4) {
            if ((chatActivityEnterView.f32756p4 || (hfVar = chatActivityEnterView.F0) == null || hfVar.length() <= 0) && (iyVar = chatActivityEnterView.V0.f39116z0) != null && iyVar.b() > 0 && !chatActivityEnterView.f32639a4) {
                return true;
            }
            return false;
        }
        return false;
    }

    public void e() {
        int i7;
        ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.f3326c;
        cu0 cu0Var = chatActivityEnterView.f32655c2;
        if (d()) {
            AnimatorSet animatorSet = chatActivityEnterView.f32773r4;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            chatActivityEnterView.f32794u4 = true;
            this.f3324a = chatActivityEnterView.f32756p4;
            chatActivityEnterView.f32756p4 = true;
            ks.e().k(ks.f25234j1, 1);
            int height = ((((cu0Var.getHeight() - org.telegram.messenger.g0.f24220m) - org.telegram.messenger.g0.f24221n) - org.telegram.messenger.g0.L(6.0f)) - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - chatActivityEnterView.getHeight();
            chatActivityEnterView.f32788t4 = height;
            if (chatActivityEnterView.H2 == 2) {
                int L = org.telegram.messenger.g0.L(175.0f);
                Point point = org.telegram.messenger.g0.f24226q;
                if (point.x > point.y) {
                    i7 = chatActivityEnterView.f32748o3;
                } else {
                    i7 = chatActivityEnterView.f32740n3;
                }
                chatActivityEnterView.f32788t4 = Math.min(height, L + i7);
            }
            if (chatActivityEnterView.f32676e7 == null) {
                chatActivityEnterView.V0.getLayoutParams().height = chatActivityEnterView.f32788t4;
            }
            chatActivityEnterView.V0.setLayerType(2, null);
            cu0Var.requestLayout();
            if (chatActivityEnterView.Y5) {
                cu0Var.setForeground(new sc(chatActivityEnterView));
            }
            this.f3325b = (int) chatActivityEnterView.getTranslationY();
            mg mgVar = chatActivityEnterView.P3;
            if (mgVar != null) {
                mgVar.q1();
            }
        }
    }

    public w0(MessageDigest messageDigest, int i7) {
        ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN);
        this.f3326c = messageDigest;
        this.f3325b = i7;
    }
}
