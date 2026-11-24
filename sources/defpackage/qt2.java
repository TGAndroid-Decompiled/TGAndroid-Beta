package defpackage;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class qt2 implements TextWatcher {
    public final EditTextBoldCursor a;

    public qt2(EditTextBoldCursor editTextBoldCursor) {
        this.a = editTextBoldCursor;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        try {
            String obj = editable.toString();
            if (!obj.isEmpty()) {
                int intValue = Utilities.z(obj).intValue();
                EditTextBoldCursor editTextBoldCursor = this.a;
                if (intValue < 0) {
                    editTextBoldCursor.setText("0");
                    editTextBoldCursor.setSelection(editTextBoldCursor.length());
                } else if (intValue > 300) {
                    editTextBoldCursor.setText("300");
                    editTextBoldCursor.setSelection(editTextBoldCursor.length());
                } else if (!obj.equals(String.valueOf(intValue))) {
                    editTextBoldCursor.setText(String.valueOf(intValue));
                    editTextBoldCursor.setSelection(editTextBoldCursor.length());
                }
            }
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
