package defpackage;

import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.TextWatcher;
import android.widget.EditText;
public final class gy3 implements TextWatcher {
    public final EditText a;
    public fy3 b;
    public boolean c = true;

    public gy3(EditText editText) {
        this.a = editText;
    }

    public static void a(EditText editText, int i) {
        int length;
        if (i == 1 && editText != null && editText.isAttachedToWindow()) {
            Editable editableText = editText.getEditableText();
            int selectionStart = Selection.getSelectionStart(editableText);
            int selectionEnd = Selection.getSelectionEnd(editableText);
            lw3 a = lw3.a();
            if (editableText == null) {
                length = 0;
            } else {
                a.getClass();
                length = editableText.length();
            }
            a.e(0, length, editableText);
            if (selectionStart >= 0) {
                if (selectionEnd >= 0) {
                    Selection.setSelection(editableText, selectionStart, selectionEnd);
                } else {
                    Selection.setSelection(editableText, selectionStart);
                }
            } else if (selectionEnd >= 0) {
                Selection.setSelection(editableText, selectionEnd);
            }
        }
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        EditText editText = this.a;
        if (!editText.isInEditMode() && this.c && lw3.j != null && i2 <= i3 && (charSequence instanceof Spannable)) {
            int b = lw3.a().b();
            if (b != 0) {
                if (b != 1) {
                    if (b != 3) {
                        return;
                    }
                } else {
                    lw3.a().e(i, i3 + i, (Spannable) charSequence);
                    return;
                }
            }
            lw3 a = lw3.a();
            fy3 fy3Var = this.b;
            if (fy3Var == null) {
                fy3Var = new fy3(editText);
                this.b = fy3Var;
            }
            a.f(fy3Var);
        }
    }

    @Override
    public final void afterTextChanged(Editable editable) {
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
