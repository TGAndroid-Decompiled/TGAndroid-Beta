package defpackage;

import android.text.Editable;
import android.text.TextWatcher;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class n08 implements TextWatcher {
    public final byte a;
    public final b18 b;

    public n08(b18 b18Var, byte b) {
        this.a = b;
        this.b = b18Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        boolean z;
        String str;
        int indexOf;
        byte b = this.a;
        b18 b18Var = this.b;
        switch (b) {
            case 0:
                if (!b18Var.a1 && b18Var.U0 != 0 && b18Var.Z[0].length() == b18Var.U0) {
                    b18Var.M.callOnClick();
                    return;
                }
                return;
            default:
                ArrayList arrayList = b18Var.V0;
                HashMap hashMap = b18Var.X0;
                if (!b18Var.a1) {
                    b18Var.a1 = true;
                    String h = f78.h(b18Var.Z[1].getText().toString(), false);
                    b18Var.Z[1].setText(h);
                    gg5 gg5Var = (gg5) b18Var.Z[2];
                    if (h.length() == 0) {
                        gg5Var.setHintText((String) null);
                        gg5Var.setHint(ob6.M0(2131747099, null));
                        b18Var.Z[0].setText(ob6.M0(2131752099, null));
                    } else {
                        int i = 4;
                        if (h.length() > 4) {
                            while (true) {
                                if (i >= 1) {
                                    String substring = h.substring(0, i);
                                    if (((String) hashMap.get(substring)) != null) {
                                        b18Var.Z[1].setText(substring);
                                        str = h.substring(i) + b18Var.Z[2].getText().toString();
                                        h = substring;
                                        z = true;
                                    } else {
                                        i--;
                                    }
                                } else {
                                    z = false;
                                    str = null;
                                }
                            }
                            if (!z) {
                                str = h.substring(1) + b18Var.Z[2].getText().toString();
                                EditTextBoldCursor editTextBoldCursor = b18Var.Z[1];
                                h = h.substring(0, 1);
                                editTextBoldCursor.setText(h);
                            }
                        } else {
                            z = false;
                            str = null;
                        }
                        String str2 = (String) hashMap.get(h);
                        if (str2 != null && (indexOf = arrayList.indexOf(str2)) != -1) {
                            b18Var.Z[0].setText((CharSequence) arrayList.get(indexOf));
                            String str3 = (String) b18Var.Y0.get(h);
                            if (str3 != null) {
                                gg5Var.setHintText(str3.replace('X', (char) 8211));
                                gg5Var.setHint((CharSequence) null);
                            }
                        } else {
                            gg5Var.setHintText((String) null);
                            gg5Var.setHint(ob6.M0(2131747099, null));
                            b18Var.Z[0].setText(ob6.M0(2131742490, null));
                        }
                        if (!z) {
                            EditTextBoldCursor editTextBoldCursor2 = b18Var.Z[1];
                            editTextBoldCursor2.setSelection(editTextBoldCursor2.getText().length());
                        }
                        if (str != null) {
                            gg5Var.requestFocus();
                            gg5Var.setText(str);
                            gg5Var.setSelection(gg5Var.length());
                        }
                    }
                    b18Var.a1 = false;
                    return;
                }
                return;
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        byte b = this.a;
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        byte b = this.a;
    }

    private final void a(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void b(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void c(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void d(int i, int i2, int i3, CharSequence charSequence) {
    }
}
