package m;

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
import org.telegram.ui.Components.ag;
import org.telegram.ui.Components.bf;
import org.telegram.ui.Components.cx;
import org.telegram.ui.Components.py;
import org.telegram.ui.Components.zu0;

public final class a implements r0.n0, cx {

    public boolean f17257a;

    public int f17258b;

    public Object f17259c;

    public a(FrameLayout frameLayout) {
        this.f17259c = frameLayout;
    }

    @Override
    public void a() {
        this.f17257a = true;
    }

    @Override
    public void b() {
        super/*android.view.ViewGroup*/.setVisibility(0);
        this.f17257a = false;
    }

    @Override
    public void c() {
        if (this.f17257a) {
            return;
        }
        ActionBarContextView actionBarContextView = (ActionBarContextView) this.f17259c;
        actionBarContextView.f969f = null;
        super/*android.view.ViewGroup*/.setVisibility(this.f17258b);
    }

    public boolean d() {
        py pyVar;
        bf bfVar;
        ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.f17259c;
        if (chatActivityEnterView.f26176s3) {
            return (chatActivityEnterView.f26186u3 || (bfVar = chatActivityEnterView.A0) == null || bfVar.length() <= 0) && (pyVar = chatActivityEnterView.Q0.f35041u0) != null && pyVar.h() > 0 && !chatActivityEnterView.f26107f3;
        }
        return false;
    }

    public void e() {
        ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.f17259c;
        zu0 zu0Var = chatActivityEnterView.f26117h1;
        if (d()) {
            AnimatorSet animatorSet = chatActivityEnterView.f26196w3;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            chatActivityEnterView.f26213z3 = true;
            this.f17257a = chatActivityEnterView.f26186u3;
            chatActivityEnterView.f26186u3 = true;
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 1);
            int height = ((((zu0Var.getHeight() - AndroidUtilities.statusBarHeight) - AndroidUtilities.navigationBarHeight) - AndroidUtilities.dp(6.0f)) - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - chatActivityEnterView.getHeight();
            chatActivityEnterView.f26208y3 = height;
            if (chatActivityEnterView.M1 == 2) {
                int iDp = AndroidUtilities.dp(175.0f);
                Point point = AndroidUtilities.displaySize;
                chatActivityEnterView.f26208y3 = Math.min(height, iDp + (point.x > point.y ? chatActivityEnterView.f26180t2 : chatActivityEnterView.f26175s2));
            }
            if (chatActivityEnterView.Y4 == null) {
                chatActivityEnterView.Q0.getLayoutParams().height = chatActivityEnterView.f26208y3;
            }
            chatActivityEnterView.Q0.setLayerType(2, null);
            zu0Var.requestLayout();
            if (chatActivityEnterView.f26182t4) {
                zu0Var.setForeground(new af.g(chatActivityEnterView));
            }
            this.f17258b = (int) chatActivityEnterView.getTranslationY();
            ag agVar = chatActivityEnterView.U2;
            if (agVar != null) {
                agVar.k1();
            }
        }
    }

    public a(MessageDigest messageDigest, int i10) {
        ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN);
        this.f17259c = messageDigest;
        this.f17258b = i10;
    }
}
