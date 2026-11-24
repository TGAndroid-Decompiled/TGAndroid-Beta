package defpackage;

import android.text.Editable;
import android.text.TextWatcher;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class hx7 implements TextWatcher {
    public final byte a;
    public final vx7 b;

    public hx7(vx7 vx7Var, byte b) {
        this.a = b;
        this.b = vx7Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        boolean z;
        String str;
        int indexOf;
        byte b = this.a;
        vx7 vx7Var = this.b;
        switch (b) {
            case 0:
                if (!vx7Var.a1 && vx7Var.U0 != 0 && vx7Var.Z[0].length() == vx7Var.U0) {
                    vx7Var.M.callOnClick();
                    return;
                }
                return;
            default:
                ArrayList arrayList = vx7Var.V0;
                HashMap hashMap = vx7Var.X0;
                if (!vx7Var.a1) {
                    vx7Var.a1 = true;
                    String h = p38.h(vx7Var.Z[1].getText().toString(), false);
                    vx7Var.Z[1].setText(h);
                    fe5 fe5Var = (fe5) vx7Var.Z[2];
                    if (h.length() == 0) {
                        fe5Var.setHintText((String) null);
                        fe5Var.setHint(k96.M0(2131747179, null));
                        vx7Var.Z[0].setText(k96.M0(2131752122, null));
                    } else {
                        int i = 4;
                        if (h.length() > 4) {
                            while (true) {
                                if (i >= 1) {
                                    String substring = h.substring(0, i);
                                    if (((String) hashMap.get(substring)) != null) {
                                        vx7Var.Z[1].setText(substring);
                                        str = h.substring(i) + vx7Var.Z[2].getText().toString();
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
                                str = h.substring(1) + vx7Var.Z[2].getText().toString();
                                EditTextBoldCursor editTextBoldCursor = vx7Var.Z[1];
                                h = h.substring(0, 1);
                                editTextBoldCursor.setText(h);
                            }
                        } else {
                            z = false;
                            str = null;
                        }
                        String str2 = (String) hashMap.get(h);
                        if (str2 != null && (indexOf = arrayList.indexOf(str2)) != -1) {
                            vx7Var.Z[0].setText((CharSequence) arrayList.get(indexOf));
                            String str3 = (String) vx7Var.Y0.get(h);
                            if (str3 != null) {
                                fe5Var.setHintText(str3.replace('X', (char) 8211));
                                fe5Var.setHint((CharSequence) null);
                            }
                        } else {
                            fe5Var.setHintText((String) null);
                            fe5Var.setHint(k96.M0(2131747179, null));
                            vx7Var.Z[0].setText(k96.M0(2131742596, null));
                        }
                        if (!z) {
                            EditTextBoldCursor editTextBoldCursor2 = vx7Var.Z[1];
                            editTextBoldCursor2.setSelection(editTextBoldCursor2.getText().length());
                        }
                        if (str != null) {
                            fe5Var.requestFocus();
                            fe5Var.setText(str);
                            fe5Var.setSelection(fe5Var.length());
                        }
                    }
                    vx7Var.a1 = false;
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
