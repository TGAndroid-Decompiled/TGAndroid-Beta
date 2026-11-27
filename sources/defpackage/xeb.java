package defpackage;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.Components.EditTextBoldCursor;
public interface xeb {
    boolean a();

    void d(TextWatcher textWatcher);

    EditTextBoldCursor getEditField();

    float getEditFieldBottomOffset();

    Editable getEditText();

    CharSequence getFieldText();

    e getParentFragment();

    int getVisibility();

    void setFieldText(CharSequence charSequence);
}
