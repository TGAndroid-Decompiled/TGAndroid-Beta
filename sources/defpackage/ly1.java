package defpackage;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class ly1 implements View.OnTouchListener {
    public final byte a = 1;
    public final Rect b = new Rect();
    public final jm7 c;

    public ly1(j68 j68Var) {
        this.c = j68Var;
    }

    @Override
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        my1 my1Var;
        m8 m8Var;
        m8 m8Var2;
        byte b = this.a;
        jm7 jm7Var = this.c;
        Rect rect = this.b;
        switch (b) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) jm7Var;
                if (motionEvent.getActionMasked() == 0 && (my1Var = chatActivityEnterView.O0) != null && my1Var.isShowing()) {
                    view.getHitRect(rect);
                    if (!rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        chatActivityEnterView.O0.dismiss();
                    }
                }
                return false;
            case 1:
                j68 j68Var = (j68) jm7Var;
                if (motionEvent.getActionMasked() == 0 && (m8Var = j68Var.J) != null && m8Var.isShowing()) {
                    view.getHitRect(rect);
                    if (!rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        j68Var.J.d(true);
                    }
                }
                return false;
            default:
                w78 w78Var = (w78) jm7Var;
                if (motionEvent.getActionMasked() == 0 && (m8Var2 = w78Var.n0) != null && m8Var2.isShowing()) {
                    view.getHitRect(rect);
                    if (!rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        w78Var.n0.d(true);
                    }
                }
                return false;
        }
    }

    public ly1(w78 w78Var) {
        this.c = w78Var;
    }

    public ly1(ChatActivityEnterView chatActivityEnterView) {
        this.c = chatActivityEnterView;
    }
}
