package defpackage;

import android.view.KeyEvent;
import android.view.View;
import android.widget.ImageView;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class w6 implements View.OnKeyListener {
    public final byte a;
    public final Object b;

    public w6(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override
    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        m8 m8Var;
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                r7 r7Var = (r7) obj;
                if (i != 82 || keyEvent.getRepeatCount() != 0 || keyEvent.getAction() != 1 || (m8Var = r7Var.d) == null || !m8Var.isShowing()) {
                    return false;
                }
                r7Var.d.d(true);
                return true;
            case 1:
                yv1 yv1Var = (yv1) obj;
                yv1Var.getClass();
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) view;
                if (i != 67 || keyEvent.getAction() != 0 || editTextBoldCursor.length() != 0) {
                    return false;
                }
                yv1Var.Ja();
                return true;
            case 2:
                t72 t72Var = (t72) obj;
                EditTextBoldCursor editTextBoldCursor2 = (EditTextBoldCursor) view;
                if (i != 67 || keyEvent.getAction() != 0 || editTextBoldCursor2.length() != 0) {
                    return false;
                }
                ImageView imageView = t72Var.f;
                if (imageView != null) {
                    imageView.callOnClick();
                }
                return true;
            case 3:
                rx3 rx3Var = (rx3) obj;
                if (i != 82 || keyEvent.getRepeatCount() != 0 || keyEvent.getAction() != 1 || !rx3Var.isShowing()) {
                    return false;
                }
                rx3Var.dismiss();
                return true;
            case 4:
                xz7 xz7Var = (xz7) obj;
                if (i != 67 || xz7Var.Z[2].length() != 0) {
                    return false;
                }
                xz7Var.Z[1].requestFocus();
                EditTextBoldCursor editTextBoldCursor3 = xz7Var.Z[1];
                editTextBoldCursor3.setSelection(editTextBoldCursor3.length());
                xz7Var.Z[1].dispatchKeyEvent(keyEvent);
                return true;
            default:
                hg8 hg8Var = (hg8) obj;
                EditTextBoldCursor editTextBoldCursor4 = (EditTextBoldCursor) view;
                if (i != 67 || keyEvent.getAction() != 0 || editTextBoldCursor4.length() != 0) {
                    return false;
                }
                ImageView imageView2 = hg8Var.f;
                if (imageView2 != null) {
                    imageView2.callOnClick();
                }
                return true;
        }
    }
}
