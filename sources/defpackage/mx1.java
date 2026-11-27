package defpackage;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class mx1 implements View.OnTouchListener {
    public final byte a = 2;
    public final Rect b = new Rect();
    public final fn7 c;

    public mx1(w78 w78Var) {
        this.c = w78Var;
    }

    @Override
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        nx1 nx1Var;
        n8 n8Var;
        n8 n8Var2;
        byte b = this.a;
        fn7 fn7Var = this.c;
        Rect rect = this.b;
        switch (b) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) fn7Var;
                if (motionEvent.getActionMasked() == 0 && (nx1Var = chatActivityEnterView.O0) != null && nx1Var.isShowing()) {
                    view.getHitRect(rect);
                    if (!rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        chatActivityEnterView.O0.dismiss();
                    }
                }
                return false;
            case 1:
                w78 w78Var = (w78) fn7Var;
                if (motionEvent.getActionMasked() == 0 && (n8Var = w78Var.J) != null && n8Var.isShowing()) {
                    view.getHitRect(rect);
                    if (!rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        w78Var.J.d(true);
                    }
                }
                return false;
            default:
                l98 l98Var = (l98) fn7Var;
                if (motionEvent.getActionMasked() == 0 && (n8Var2 = l98Var.n0) != null && n8Var2.isShowing()) {
                    view.getHitRect(rect);
                    if (!rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        l98Var.n0.d(true);
                    }
                }
                return false;
        }
    }

    public mx1(l98 l98Var) {
        this.c = l98Var;
    }

    public mx1(ChatActivityEnterView chatActivityEnterView) {
        this.c = chatActivityEnterView;
    }
}
