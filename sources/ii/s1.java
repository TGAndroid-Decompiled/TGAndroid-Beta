package ii;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.gb0;
public final class s1 implements TextWatcher {
    public boolean f15216a;
    public final EditTextBoldCursor f15217b;
    public final int f15218c;
    public final gb0 d;

    public s1(EditTextBoldCursor editTextBoldCursor, int i3, gb0 gb0Var) {
        this.f15217b = editTextBoldCursor;
        this.f15218c = i3;
        this.d = gb0Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        EditTextBoldCursor editTextBoldCursor = this.f15217b;
        CharSequence text = editTextBoldCursor.getText();
        if (!this.f15216a) {
            int length = text.length();
            int i3 = this.f15218c;
            if (length > i3) {
                this.f15216a = true;
                text = text.subSequence(0, i3);
                editTextBoldCursor.setText(text);
                editTextBoldCursor.setSelection(editTextBoldCursor.length());
                this.f15216a = false;
            }
        }
        this.d.c(editTextBoldCursor.isFocused(), !TextUtils.isEmpty(text));
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i3, int i10, int i11) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i3, int i10, int i11) {
    }
}
