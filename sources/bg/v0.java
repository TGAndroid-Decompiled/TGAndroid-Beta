package bg;

import android.animation.AnimatorSet;
import android.graphics.Point;
import android.widget.FrameLayout;
import androidx.appcompat.widget.ActionBarContextView;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.MessageDigest;
import org.telegram.messenger.ns;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.cg;
import org.telegram.ui.Components.dy;
import org.telegram.ui.Components.jc;
import org.telegram.ui.Components.st0;
import org.telegram.ui.Components.sw;
import org.telegram.ui.Components.xe;
public final class v0 implements r0.m0, sw {
    public boolean f3346a;
    public int f3347b;
    public Object f3348c;

    public v0(FrameLayout frameLayout) {
        this.f3348c = frameLayout;
    }

    @Override
    public void a() {
        this.f3346a = true;
    }

    @Override
    public void b() {
        super/*android.view.ViewGroup*/.setVisibility(0);
        this.f3346a = false;
    }

    @Override
    public void c() {
        if (this.f3346a) {
            return;
        }
        ActionBarContextView actionBarContextView = (ActionBarContextView) this.f3348c;
        actionBarContextView.f1871f = null;
        super/*android.view.ViewGroup*/.setVisibility(this.f3347b);
    }

    public boolean d() {
        dy dyVar;
        xe xeVar;
        ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.f3348c;
        if (chatActivityEnterView.f32196f4) {
            if ((chatActivityEnterView.f32210h4 || (xeVar = chatActivityEnterView.F0) == null || xeVar.length() <= 0) && (dyVar = chatActivityEnterView.V0.f37010z0) != null && dyVar.b() > 0 && !chatActivityEnterView.S3) {
                return true;
            }
            return false;
        }
        return false;
    }

    public void e() {
        int i7;
        ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.f3348c;
        st0 st0Var = chatActivityEnterView.U1;
        if (d()) {
            AnimatorSet animatorSet = chatActivityEnterView.f32223j4;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            chatActivityEnterView.f32242m4 = true;
            this.f3346a = chatActivityEnterView.f32210h4;
            chatActivityEnterView.f32210h4 = true;
            ns.e().k(ns.f25518j1, 1);
            int height = ((((st0Var.getHeight() - org.telegram.messenger.g0.f23605m) - org.telegram.messenger.g0.f23606n) - org.telegram.messenger.g0.L(6.0f)) - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - chatActivityEnterView.getHeight();
            chatActivityEnterView.f32236l4 = height;
            if (chatActivityEnterView.f32333z2 == 2) {
                int L = org.telegram.messenger.g0.L(175.0f);
                Point point = org.telegram.messenger.g0.f23611q;
                if (point.x > point.y) {
                    i7 = chatActivityEnterView.f32202g3;
                } else {
                    i7 = chatActivityEnterView.f32195f3;
                }
                chatActivityEnterView.f32236l4 = Math.min(height, L + i7);
            }
            if (chatActivityEnterView.C6 == null) {
                chatActivityEnterView.V0.getLayoutParams().height = chatActivityEnterView.f32236l4;
            }
            chatActivityEnterView.V0.setLayerType(2, null);
            st0Var.requestLayout();
            if (chatActivityEnterView.Q5) {
                st0Var.setForeground(new jc(chatActivityEnterView));
            }
            this.f3347b = (int) chatActivityEnterView.getTranslationY();
            cg cgVar = chatActivityEnterView.H3;
            if (cgVar != null) {
                cgVar.q1();
            }
        }
    }

    public v0(MessageDigest messageDigest, int i7) {
        ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN);
        this.f3348c = messageDigest;
        this.f3347b = i7;
    }
}
