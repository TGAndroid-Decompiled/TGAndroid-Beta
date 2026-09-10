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
import org.telegram.ui.Components.aw0;
import org.telegram.ui.Components.dd;
import org.telegram.ui.Components.iz;
import org.telegram.ui.Components.qg;
import org.telegram.ui.Components.rf;
import org.telegram.ui.Components.vx;
import r0.m0;
public final class a implements m0, vx {
    public boolean f4070a;
    public int f4071b;
    public Object f4072c;

    public a(FrameLayout frameLayout) {
        this.f4072c = frameLayout;
    }

    @Override
    public void a() {
        this.f4070a = true;
    }

    @Override
    public void b() {
        super/*android.view.ViewGroup*/.setVisibility(0);
        this.f4070a = false;
    }

    @Override
    public void c() {
        if (this.f4070a) {
            return;
        }
        ActionBarContextView actionBarContextView = (ActionBarContextView) this.f4072c;
        actionBarContextView.f661f = null;
        super/*android.view.ViewGroup*/.setVisibility(this.f4071b);
    }

    public boolean d() {
        iz izVar;
        rf rfVar;
        ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.f4072c;
        if (chatActivityEnterView.f20945w3) {
            if ((chatActivityEnterView.y3 || (rfVar = chatActivityEnterView.E0) == null || rfVar.length() <= 0) && (izVar = chatActivityEnterView.U0.f26875y0) != null && izVar.h() > 0 && !chatActivityEnterView.j3) {
                return true;
            }
            return false;
        }
        return false;
    }

    public void e() {
        int i10;
        ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.f4072c;
        aw0 aw0Var = chatActivityEnterView.l1;
        if (d()) {
            AnimatorSet animatorSet = chatActivityEnterView.A3;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            chatActivityEnterView.D3 = true;
            this.f4070a = chatActivityEnterView.y3;
            chatActivityEnterView.y3 = true;
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 1);
            int height = ((((aw0Var.getHeight() - AndroidUtilities.statusBarHeight) - AndroidUtilities.navigationBarHeight) - AndroidUtilities.dp(6.0f)) - org.telegram.ui.ActionBar.l.getCurrentActionBarHeight()) - chatActivityEnterView.getHeight();
            chatActivityEnterView.C3 = height;
            if (chatActivityEnterView.Q1 == 2) {
                int dp = AndroidUtilities.dp(175.0f);
                Point point = AndroidUtilities.displaySize;
                if (point.x > point.y) {
                    i10 = chatActivityEnterView.f20950x2;
                } else {
                    i10 = chatActivityEnterView.f20944w2;
                }
                chatActivityEnterView.C3 = Math.min(height, dp + i10);
            }
            if (chatActivityEnterView.f20836c5 == null) {
                chatActivityEnterView.U0.getLayoutParams().height = chatActivityEnterView.C3;
            }
            chatActivityEnterView.U0.setLayerType(2, null);
            aw0Var.requestLayout();
            if (chatActivityEnterView.f20952x4) {
                aw0Var.setForeground(new dd(chatActivityEnterView));
            }
            this.f4071b = (int) chatActivityEnterView.getTranslationY();
            qg qgVar = chatActivityEnterView.Y2;
            if (qgVar != null) {
                qgVar.r1();
            }
        }
    }

    public a(MessageDigest messageDigest, int i10) {
        ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN);
        this.f4072c = messageDigest;
        this.f4071b = i10;
    }
}
