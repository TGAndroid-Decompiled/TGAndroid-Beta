package bg;

import android.animation.AnimatorSet;
import android.graphics.Point;
import android.widget.FrameLayout;
import androidx.appcompat.widget.ActionBarContextView;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.MessageDigest;
import org.telegram.messenger.ls;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.ax;
import org.telegram.ui.Components.du0;
import org.telegram.ui.Components.gf;
import org.telegram.ui.Components.ly;
import org.telegram.ui.Components.mg;
import org.telegram.ui.Components.sc;
public final class w0 implements r0.m0, ax {
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
        actionBarContextView.f1833f = null;
        super/*android.view.ViewGroup*/.setVisibility(this.f3325b);
    }

    public boolean d() {
        ly lyVar;
        gf gfVar;
        ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.f3326c;
        if (chatActivityEnterView.f32643n4) {
            if ((chatActivityEnterView.f32658p4 || (gfVar = chatActivityEnterView.F0) == null || gfVar.length() <= 0) && (lyVar = chatActivityEnterView.V0.f40143z0) != null && lyVar.b() > 0 && !chatActivityEnterView.f32541a4) {
                return true;
            }
            return false;
        }
        return false;
    }

    public void e() {
        int i7;
        ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.f3326c;
        du0 du0Var = chatActivityEnterView.f32557c2;
        if (d()) {
            AnimatorSet animatorSet = chatActivityEnterView.f32675r4;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            chatActivityEnterView.f32696u4 = true;
            this.f3324a = chatActivityEnterView.f32658p4;
            chatActivityEnterView.f32658p4 = true;
            ls.e().k(ls.f25293j1, 1);
            int height = ((((du0Var.getHeight() - org.telegram.messenger.g0.f24004m) - org.telegram.messenger.g0.f24005n) - org.telegram.messenger.g0.L(6.0f)) - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - chatActivityEnterView.getHeight();
            chatActivityEnterView.f32690t4 = height;
            if (chatActivityEnterView.H2 == 2) {
                int L = org.telegram.messenger.g0.L(175.0f);
                Point point = org.telegram.messenger.g0.f24010q;
                if (point.x > point.y) {
                    i7 = chatActivityEnterView.f32650o3;
                } else {
                    i7 = chatActivityEnterView.f32642n3;
                }
                chatActivityEnterView.f32690t4 = Math.min(height, L + i7);
            }
            if (chatActivityEnterView.f32578e7 == null) {
                chatActivityEnterView.V0.getLayoutParams().height = chatActivityEnterView.f32690t4;
            }
            chatActivityEnterView.V0.setLayerType(2, null);
            du0Var.requestLayout();
            if (chatActivityEnterView.Y5) {
                du0Var.setForeground(new sc(chatActivityEnterView));
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
