package defpackage;

import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.TextView;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class my7 implements TextView.OnEditorActionListener {
    public final byte a;
    public final xz7 b;

    public my7(xz7 xz7Var, byte b) {
        this.a = b;
        this.b = xz7Var;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        byte b = this.a;
        xz7 xz7Var = this.b;
        switch (b) {
            case 0:
                if (i == 5) {
                    xz7Var.Z[2].requestFocus();
                    return true;
                } else if (i != 6) {
                    return false;
                } else {
                    xz7Var.M.callOnClick();
                    return true;
                }
            case 1:
                if (i != 5) {
                    return false;
                }
                int intValue = ((Integer) textView.getTag()).intValue() + 1;
                EditTextBoldCursor[] editTextBoldCursorArr = xz7Var.Z;
                if (intValue >= editTextBoldCursorArr.length) {
                    return true;
                }
                boolean isFocusable = editTextBoldCursorArr[intValue].isFocusable();
                EditTextBoldCursor[] editTextBoldCursorArr2 = xz7Var.Z;
                if (isFocusable) {
                    editTextBoldCursorArr2[intValue].requestFocus();
                    return true;
                }
                editTextBoldCursorArr2[intValue].dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 1, 0.0f, 0.0f, 0));
                textView.clearFocus();
                gm.t1(textView);
                return true;
            case 2:
                if (i != 5) {
                    return false;
                }
                int intValue2 = ((Integer) textView.getTag()).intValue() + 1;
                EditTextBoldCursor[] editTextBoldCursorArr3 = xz7Var.b0;
                if (intValue2 >= editTextBoldCursorArr3.length) {
                    return true;
                }
                boolean isFocusable2 = editTextBoldCursorArr3[intValue2].isFocusable();
                EditTextBoldCursor[] editTextBoldCursorArr4 = xz7Var.b0;
                if (isFocusable2) {
                    editTextBoldCursorArr4[intValue2].requestFocus();
                    return true;
                }
                editTextBoldCursorArr4[intValue2].dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 1, 0.0f, 0.0f, 0));
                textView.clearFocus();
                gm.t1(textView);
                return true;
            case 3:
                if (i != 6 && i != 5) {
                    return false;
                }
                xz7Var.M.callOnClick();
                return true;
            case 4:
                if (i != 5) {
                    return false;
                }
                int intValue3 = ((Integer) textView.getTag()).intValue() + 1;
                EditTextBoldCursor[] editTextBoldCursorArr5 = xz7Var.Z;
                if (intValue3 >= editTextBoldCursorArr5.length) {
                    return true;
                }
                boolean isFocusable3 = editTextBoldCursorArr5[intValue3].isFocusable();
                EditTextBoldCursor[] editTextBoldCursorArr6 = xz7Var.Z;
                if (isFocusable3) {
                    editTextBoldCursorArr6[intValue3].requestFocus();
                    return true;
                }
                editTextBoldCursorArr6[intValue3].dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 1, 0.0f, 0.0f, 0));
                textView.clearFocus();
                gm.t1(textView);
                return true;
            case 5:
                if (i != 5 && i != 6) {
                    return false;
                }
                xz7Var.M.callOnClick();
                return true;
            default:
                if (i != 6 && i != 5) {
                    return false;
                }
                xz7Var.M.callOnClick();
                return true;
        }
    }
}
