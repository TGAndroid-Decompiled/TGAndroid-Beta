package defpackage;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.TextView;
import java.io.Serializable;
import java.util.HashMap;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class e08 implements TextWatcher {
    public final byte a = 0;
    public final EditTextBoldCursor b;
    public final Serializable c;
    public final Object d;
    public final fn7 e;

    public e08(s4b s4bVar, int[] iArr, TextView textView, EditTextBoldCursor editTextBoldCursor) {
        this.e = s4bVar;
        this.c = iArr;
        this.d = textView;
        this.b = editTextBoldCursor;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        boolean z;
        switch (this.a) {
            case 0:
                b18 b18Var = (b18) this.e;
                String str = (String) this.c;
                if (((HashMap) this.d) == b18Var.u1) {
                    z = true;
                } else {
                    z = false;
                }
                EditTextBoldCursor editTextBoldCursor = this.b;
                b18Var.P0(editTextBoldCursor, str, editable, z);
                int intValue = ((Integer) editTextBoldCursor.getTag()).intValue();
                EditTextBoldCursor editTextBoldCursor2 = b18Var.Z[intValue];
                if (intValue == 6) {
                    b18Var.R0(true);
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        byte b = this.a;
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        switch (this.a) {
            case 0:
                return;
            default:
                if (((int[]) this.c)[0] == 2) {
                    ((s4b) this.e).F0((TextView) this.d, this.b.getText().toString(), false);
                    return;
                }
                return;
        }
    }

    public e08(b18 b18Var, EditTextBoldCursor editTextBoldCursor, String str, HashMap hashMap) {
        this.e = b18Var;
        this.b = editTextBoldCursor;
        this.c = str;
        this.d = hashMap;
    }

    private final void a(Editable editable) {
    }

    private final void b(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void c(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void d(int i, int i2, int i3, CharSequence charSequence) {
    }
}
