package defpackage;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class yw1 implements View.OnTouchListener {
    public final byte a = 1;
    public final Rect b = new Rect();
    public final gk7 c;

    public yw1(g48 g48Var) {
        this.c = g48Var;
    }

    @Override
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        zw1 zw1Var;
        m8 m8Var;
        m8 m8Var2;
        byte b = this.a;
        gk7 gk7Var = this.c;
        Rect rect = this.b;
        switch (b) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) gk7Var;
                if (motionEvent.getActionMasked() == 0 && (zw1Var = chatActivityEnterView.O0) != null && zw1Var.isShowing()) {
                    view.getHitRect(rect);
                    if (!rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        chatActivityEnterView.O0.dismiss();
                    }
                }
                return false;
            case 1:
                g48 g48Var = (g48) gk7Var;
                if (motionEvent.getActionMasked() == 0 && (m8Var = g48Var.J) != null && m8Var.isShowing()) {
                    view.getHitRect(rect);
                    if (!rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        g48Var.J.d(true);
                    }
                }
                return false;
            default:
                u58 u58Var = (u58) gk7Var;
                if (motionEvent.getActionMasked() == 0 && (m8Var2 = u58Var.n0) != null && m8Var2.isShowing()) {
                    view.getHitRect(rect);
                    if (!rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        u58Var.n0.d(true);
                    }
                }
                return false;
        }
    }

    public yw1(u58 u58Var) {
        this.c = u58Var;
    }

    public yw1(ChatActivityEnterView chatActivityEnterView) {
        this.c = chatActivityEnterView;
    }
}
