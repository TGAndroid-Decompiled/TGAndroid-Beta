package defpackage;

import android.view.View;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class k implements View.OnClickListener {
    public final byte a;
    public final EditTextBoldCursor b;

    public k(EditTextBoldCursor editTextBoldCursor, byte b) {
        this.a = b;
        this.b = editTextBoldCursor;
    }

    @Override
    public final void onClick(View view) {
        byte b = this.a;
        EditTextBoldCursor editTextBoldCursor = this.b;
        switch (b) {
            case 0:
                editTextBoldCursor.setText("");
                return;
            default:
                editTextBoldCursor.setText("");
                return;
        }
    }
}
