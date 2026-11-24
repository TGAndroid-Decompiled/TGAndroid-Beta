package defpackage;

import android.text.Editable;
import android.text.TextWatcher;
import java.util.HashMap;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.p;
public final class iz7 implements TextWatcher {
    public final byte a;
    public final p b;

    public iz7(p pVar, byte b) {
        this.a = b;
        this.b = pVar;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        boolean z;
        String str;
        String str2;
        byte b = this.a;
        p pVar = this.b;
        switch (b) {
            case 0:
                if (pVar.d0 != 0 && editable.length() == pVar.d0) {
                    pVar.F0(false);
                    return;
                }
                return;
            default:
                HashMap hashMap = pVar.c;
                if (!pVar.n0) {
                    pVar.n0 = true;
                    String h = p38.h(pVar.f[8].getText().toString(), false);
                    pVar.f[8].setText(h);
                    fe5 fe5Var = (fe5) pVar.f[9];
                    if (h.length() == 0) {
                        fe5Var.setHintText((String) null);
                        fe5Var.setHint(k96.M0(2131747179, null));
                    } else {
                        int i = 4;
                        if (h.length() > 4) {
                            while (true) {
                                if (i >= 1) {
                                    String substring = h.substring(0, i);
                                    if (((String) hashMap.get(substring)) != null) {
                                        pVar.f[8].setText(substring);
                                        str = h.substring(i) + pVar.f[9].getText().toString();
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
                                str = h.substring(1) + pVar.f[9].getText().toString();
                                EditTextBoldCursor editTextBoldCursor = pVar.f[8];
                                h = h.substring(0, 1);
                                editTextBoldCursor.setText(h);
                            }
                        } else {
                            z = false;
                            str = null;
                        }
                        String str3 = (String) hashMap.get(h);
                        if (str3 != null && pVar.a.indexOf(str3) != -1 && (str2 = (String) pVar.d.get(h)) != null) {
                            fe5Var.setHintText(str2.replace('X', (char) 8211));
                            fe5Var.setHint((CharSequence) null);
                        } else {
                            fe5Var.setHintText((String) null);
                            fe5Var.setHint(k96.M0(2131747179, null));
                        }
                        if (!z) {
                            EditTextBoldCursor editTextBoldCursor2 = pVar.f[8];
                            editTextBoldCursor2.setSelection(editTextBoldCursor2.getText().length());
                        }
                        if (str != null) {
                            fe5Var.requestFocus();
                            fe5Var.setText(str);
                            fe5Var.setSelection(fe5Var.length());
                        }
                    }
                    pVar.n0 = false;
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
