package defpackage;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.EditTextBoldCursor;
public interface bbb {
    boolean a();

    void d(TextWatcher textWatcher);

    EditTextBoldCursor getEditField();

    float getEditFieldBottomOffset();

    Editable getEditText();

    CharSequence getFieldText();

    d getParentFragment();

    int getVisibility();

    void setFieldText(CharSequence charSequence);
}
