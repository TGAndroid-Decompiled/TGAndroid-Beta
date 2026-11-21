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
import org.telegram.ui.Components.ax;
import org.telegram.ui.Components.du0;
import org.telegram.ui.Components.gf;
import org.telegram.ui.Components.ly;
import org.telegram.ui.Components.ng;
import org.telegram.ui.Components.sc;
public final class w0 implements r0.m0, ax {
    public boolean f3366a;
    public int f3367b;
    public Object f3368c;

    public w0(FrameLayout frameLayout) {
        this.f3368c = frameLayout;
    }

    @Override
    public void a() {
        this.f3366a = true;
    }

    @Override
    public void b() {
        super/*android.view.ViewGroup*/.setVisibility(0);
        this.f3366a = false;
    }

    @Override
    public void c() {
        if (this.f3366a) {
            return;
        }
        ActionBarContextView actionBarContextView = (ActionBarContextView) this.f3368c;
        actionBarContextView.f1875f = null;
        super/*android.view.ViewGroup*/.setVisibility(this.f3367b);
    }

    public boolean d() {
        ly lyVar;
        gf gfVar;
        ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.f3368c;
        if (chatActivityEnterView.f32674n4) {
            if ((chatActivityEnterView.f32689p4 || (gfVar = chatActivityEnterView.F0) == null || gfVar.length() <= 0) && (lyVar = chatActivityEnterView.V0.f40168z0) != null && lyVar.b() > 0 && !chatActivityEnterView.f32572a4) {
                return true;
            }
            return false;
        }
        return false;
    }

    public void e() {
        int i7;
        ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.f3368c;
        du0 du0Var = chatActivityEnterView.f32588c2;
        if (d()) {
            AnimatorSet animatorSet = chatActivityEnterView.f32706r4;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            chatActivityEnterView.f32727u4 = true;
            this.f3366a = chatActivityEnterView.f32689p4;
            chatActivityEnterView.f32689p4 = true;
            ks.e().k(ks.f25163j1, 1);
            int height = ((((du0Var.getHeight() - org.telegram.messenger.g0.f24140m) - org.telegram.messenger.g0.f24141n) - org.telegram.messenger.g0.L(6.0f)) - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - chatActivityEnterView.getHeight();
            chatActivityEnterView.f32721t4 = height;
            if (chatActivityEnterView.H2 == 2) {
                int L = org.telegram.messenger.g0.L(175.0f);
                Point point = org.telegram.messenger.g0.f24146q;
                if (point.x > point.y) {
                    i7 = chatActivityEnterView.f32681o3;
                } else {
                    i7 = chatActivityEnterView.f32673n3;
                }
                chatActivityEnterView.f32721t4 = Math.min(height, L + i7);
            }
            if (chatActivityEnterView.f32609e7 == null) {
                chatActivityEnterView.V0.getLayoutParams().height = chatActivityEnterView.f32721t4;
            }
            chatActivityEnterView.V0.setLayerType(2, null);
            du0Var.requestLayout();
            if (chatActivityEnterView.Y5) {
                du0Var.setForeground(new sc(chatActivityEnterView));
            }
            this.f3367b = (int) chatActivityEnterView.getTranslationY();
            ng ngVar = chatActivityEnterView.P3;
            if (ngVar != null) {
                ngVar.q1();
            }
        }
    }

    public w0(MessageDigest messageDigest, int i7) {
        ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN);
        this.f3368c = messageDigest;
        this.f3367b = i7;
    }
}
