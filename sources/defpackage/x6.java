package defpackage;

import android.view.KeyEvent;
import android.view.View;
import android.widget.ImageView;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class x6 implements View.OnKeyListener {
    public final byte a;
    public final Object b;

    public x6(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override
    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        n8 n8Var;
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                s7 s7Var = (s7) obj;
                if (i != 82 || keyEvent.getRepeatCount() != 0 || keyEvent.getAction() != 1 || (n8Var = s7Var.d) == null || !n8Var.isShowing()) {
                    return false;
                }
                s7Var.d.d(true);
                return true;
            case 1:
                zu1 zu1Var = (zu1) obj;
                zu1Var.getClass();
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) view;
                if (i != 67 || keyEvent.getAction() != 0 || editTextBoldCursor.length() != 0) {
                    return false;
                }
                zu1Var.Ka();
                return true;
            case 2:
                y62 y62Var = (y62) obj;
                EditTextBoldCursor editTextBoldCursor2 = (EditTextBoldCursor) view;
                if (i != 67 || keyEvent.getAction() != 0 || editTextBoldCursor2.length() != 0) {
                    return false;
                }
                ImageView imageView = y62Var.f;
                if (imageView != null) {
                    imageView.callOnClick();
                }
                return true;
            case 3:
                bx3 bx3Var = (bx3) obj;
                if (i != 82 || keyEvent.getRepeatCount() != 0 || keyEvent.getAction() != 1 || !bx3Var.isShowing()) {
                    return false;
                }
                bx3Var.dismiss();
                return true;
            case 4:
                b18 b18Var = (b18) obj;
                if (i != 67 || b18Var.Z[2].length() != 0) {
                    return false;
                }
                b18Var.Z[1].requestFocus();
                EditTextBoldCursor editTextBoldCursor3 = b18Var.Z[1];
                editTextBoldCursor3.setSelection(editTextBoldCursor3.length());
                b18Var.Z[1].dispatchKeyEvent(keyEvent);
                return true;
            default:
                th8 th8Var = (th8) obj;
                EditTextBoldCursor editTextBoldCursor4 = (EditTextBoldCursor) view;
                if (i != 67 || keyEvent.getAction() != 0 || editTextBoldCursor4.length() != 0) {
                    return false;
                }
                ImageView imageView2 = th8Var.f;
                if (imageView2 != null) {
                    imageView2.callOnClick();
                }
                return true;
        }
    }
}
