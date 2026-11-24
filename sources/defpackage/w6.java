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
                mu1 mu1Var = (mu1) obj;
                mu1Var.getClass();
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) view;
                if (i != 67 || keyEvent.getAction() != 0 || editTextBoldCursor.length() != 0) {
                    return false;
                }
                mu1Var.za();
                return true;
            case 2:
                i62 i62Var = (i62) obj;
                EditTextBoldCursor editTextBoldCursor2 = (EditTextBoldCursor) view;
                if (i != 67 || keyEvent.getAction() != 0 || editTextBoldCursor2.length() != 0) {
                    return false;
                }
                ImageView imageView = i62Var.f;
                if (imageView != null) {
                    imageView.callOnClick();
                }
                return true;
            case 3:
                gw3 gw3Var = (gw3) obj;
                if (i != 82 || keyEvent.getRepeatCount() != 0 || keyEvent.getAction() != 1 || !gw3Var.isShowing()) {
                    return false;
                }
                gw3Var.dismiss();
                return true;
            case 4:
                vx7 vx7Var = (vx7) obj;
                if (i != 67 || vx7Var.Z[2].length() != 0) {
                    return false;
                }
                vx7Var.Z[1].requestFocus();
                EditTextBoldCursor editTextBoldCursor3 = vx7Var.Z[1];
                editTextBoldCursor3.setSelection(editTextBoldCursor3.length());
                vx7Var.Z[1].dispatchKeyEvent(keyEvent);
                return true;
            default:
                fe8 fe8Var = (fe8) obj;
                EditTextBoldCursor editTextBoldCursor4 = (EditTextBoldCursor) view;
                if (i != 67 || keyEvent.getAction() != 0 || editTextBoldCursor4.length() != 0) {
                    return false;
                }
                ImageView imageView2 = fe8Var.f;
                if (imageView2 != null) {
                    imageView2.callOnClick();
                }
                return true;
        }
    }
}
