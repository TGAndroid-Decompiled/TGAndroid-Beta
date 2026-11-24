package defpackage;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.ui.p;
public final class sk2 implements TextWatcher {
    public final byte a;
    public int b;
    public int c;
    public final Object d;

    public sk2(tk2 tk2Var, int i, int i2) {
        this.a = (byte) 0;
        this.d = tk2Var;
        this.b = i;
        this.c = i2;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        int length;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        byte b = this.a;
        Object obj = this.d;
        switch (b) {
            case 0:
                int i9 = this.c;
                int i10 = this.b;
                tk2 tk2Var = (tk2) obj;
                if (!tk2Var.d && (length = editable.length()) >= 1) {
                    if (length > 1) {
                        String obj2 = editable.toString();
                        tk2Var.d = true;
                        int i11 = i10;
                        for (int i12 = 0; i12 < Math.min(i9 - i10, length); i12++) {
                            if (i12 == 0) {
                                editable.replace(0, length, obj2.substring(i12, i12 + 1));
                            } else {
                                i11++;
                                int i13 = i10 + i12;
                                gl2[] gl2VarArr = tk2Var.f;
                                if (i13 < gl2VarArr.length) {
                                    gl2VarArr[i13].setText(obj2.substring(i12, i12 + 1));
                                }
                            }
                        }
                        tk2Var.d = false;
                        i10 = i11;
                    }
                    int i14 = i10 + 1;
                    if (i14 >= 0) {
                        gl2[] gl2VarArr2 = tk2Var.f;
                        if (i14 < gl2VarArr2.length) {
                            gl2 gl2Var = gl2VarArr2[i14];
                            gl2Var.setSelection(gl2Var.length());
                            tk2Var.f[i14].requestFocus();
                        }
                    }
                    if ((i10 == i9 - 1 || (i10 == i9 - 2 && length >= 2)) && tk2Var.getCode().length() == i9) {
                        tk2Var.a();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                lh6 lh6Var = (lh6) obj;
                jh6 jh6Var = lh6Var.b;
                if (!lh6Var.M) {
                    int selectionStart = jh6Var.getSelectionStart();
                    String obj3 = jh6Var.getText().toString();
                    if (this.b == 3) {
                        obj3 = obj3.substring(0, this.c).concat(obj3.substring(this.c + 1));
                        selectionStart--;
                    }
                    StringBuilder sb = new StringBuilder(obj3.length());
                    int i15 = 0;
                    while (i15 < obj3.length()) {
                        int i16 = i15 + 1;
                        String substring = obj3.substring(i15, i16);
                        if ("0123456789".contains(substring)) {
                            sb.append(substring);
                        }
                        i15 = i16;
                    }
                    lh6Var.M = true;
                    String hintText = jh6Var.getHintText();
                    if (hintText != null) {
                        int i17 = 0;
                        while (true) {
                            if (i17 < sb.length()) {
                                if (i17 < hintText.length()) {
                                    if (hintText.charAt(i17) == ' ') {
                                        sb.insert(i17, ' ');
                                        i17++;
                                        if (selectionStart == i17 && (i2 = this.b) != 2 && i2 != 3) {
                                            selectionStart++;
                                        }
                                    }
                                    i17++;
                                } else {
                                    sb.insert(i17, ' ');
                                    if (selectionStart == i17 + 1 && (i = this.b) != 2 && i != 3) {
                                        selectionStart++;
                                    }
                                }
                            }
                        }
                    }
                    editable.replace(0, editable.length(), sb);
                    if (selectionStart >= 0) {
                        jh6Var.setSelection(Math.min(selectionStart, jh6Var.length()));
                    }
                    jh6Var.invalidate();
                    lh6Var.q();
                    lh6Var.M = false;
                    return;
                }
                return;
            case 2:
                ml7 ml7Var = (ml7) obj;
                if (!ml7Var.y1) {
                    int selectionStart2 = ml7Var.J1.getSelectionStart();
                    String obj4 = ml7Var.J1.getText().toString();
                    if (this.b == 3) {
                        obj4 = obj4.substring(0, this.c).concat(obj4.substring(this.c + 1));
                        selectionStart2--;
                    }
                    StringBuilder sb2 = new StringBuilder(obj4.length());
                    int i18 = 0;
                    while (i18 < obj4.length()) {
                        int i19 = i18 + 1;
                        String substring2 = obj4.substring(i18, i19);
                        if ("0123456789".contains(substring2)) {
                            sb2.append(substring2);
                        }
                        i18 = i19;
                    }
                    ml7Var.y1 = true;
                    String hintText2 = ml7Var.J1.getHintText();
                    if (hintText2 != null) {
                        int i20 = 0;
                        while (true) {
                            if (i20 < sb2.length()) {
                                if (i20 < hintText2.length()) {
                                    if (hintText2.charAt(i20) == ' ') {
                                        sb2.insert(i20, ' ');
                                        i20++;
                                        if (selectionStart2 == i20 && (i4 = this.b) != 2 && i4 != 3) {
                                            selectionStart2++;
                                        }
                                    }
                                    i20++;
                                } else {
                                    sb2.insert(i20, ' ');
                                    if (selectionStart2 == i20 + 1 && (i3 = this.b) != 2 && i3 != 3) {
                                        selectionStart2++;
                                    }
                                }
                            }
                        }
                    }
                    editable.replace(0, editable.length(), sb2);
                    if (selectionStart2 >= 0) {
                        ll7 ll7Var = ml7Var.J1;
                        ll7Var.setSelection(Math.min(selectionStart2, ll7Var.length()));
                    }
                    ml7Var.J1.invalidate();
                    ml7Var.y1 = false;
                    ml7Var.L0();
                    return;
                }
                return;
            case 3:
                xz7 xz7Var = (xz7) obj;
                if (!xz7Var.b1) {
                    dg5 dg5Var = (dg5) xz7Var.Z[2];
                    int selectionStart3 = dg5Var.getSelectionStart();
                    String obj5 = dg5Var.getText().toString();
                    if (this.b == 3) {
                        obj5 = obj5.substring(0, this.c).concat(obj5.substring(this.c + 1));
                        selectionStart3--;
                    }
                    StringBuilder sb3 = new StringBuilder(obj5.length());
                    int i21 = 0;
                    while (i21 < obj5.length()) {
                        int i22 = i21 + 1;
                        String substring3 = obj5.substring(i21, i22);
                        if ("0123456789".contains(substring3)) {
                            sb3.append(substring3);
                        }
                        i21 = i22;
                    }
                    xz7Var.b1 = true;
                    String hintText3 = dg5Var.getHintText();
                    if (hintText3 != null) {
                        int i23 = 0;
                        while (true) {
                            if (i23 < sb3.length()) {
                                if (i23 < hintText3.length()) {
                                    if (hintText3.charAt(i23) == ' ') {
                                        sb3.insert(i23, ' ');
                                        i23++;
                                        if (selectionStart3 == i23 && (i6 = this.b) != 2 && i6 != 3) {
                                            selectionStart3++;
                                        }
                                    }
                                    i23++;
                                } else {
                                    sb3.insert(i23, ' ');
                                    if (selectionStart3 == i23 + 1 && (i5 = this.b) != 2 && i5 != 3) {
                                        selectionStart3++;
                                    }
                                }
                            }
                        }
                    }
                    dg5Var.setText(sb3);
                    if (selectionStart3 >= 0) {
                        dg5Var.setSelection(Math.min(selectionStart3, dg5Var.length()));
                    }
                    dg5Var.invalidate();
                    xz7Var.b1 = false;
                    return;
                }
                return;
            default:
                p pVar = (p) obj;
                if (!pVar.o0) {
                    dg5 dg5Var2 = (dg5) pVar.f[9];
                    int selectionStart4 = dg5Var2.getSelectionStart();
                    String obj6 = dg5Var2.getText().toString();
                    if (this.b == 3) {
                        obj6 = obj6.substring(0, this.c).concat(obj6.substring(this.c + 1));
                        selectionStart4--;
                    }
                    StringBuilder sb4 = new StringBuilder(obj6.length());
                    int i24 = 0;
                    while (i24 < obj6.length()) {
                        int i25 = i24 + 1;
                        String substring4 = obj6.substring(i24, i25);
                        if ("0123456789".contains(substring4)) {
                            sb4.append(substring4);
                        }
                        i24 = i25;
                    }
                    pVar.o0 = true;
                    String hintText4 = dg5Var2.getHintText();
                    if (hintText4 != null) {
                        int i26 = 0;
                        while (true) {
                            if (i26 < sb4.length()) {
                                if (i26 < hintText4.length()) {
                                    if (hintText4.charAt(i26) == ' ') {
                                        sb4.insert(i26, ' ');
                                        i26++;
                                        if (selectionStart4 == i26 && (i8 = this.b) != 2 && i8 != 3) {
                                            selectionStart4++;
                                        }
                                    }
                                    i26++;
                                } else {
                                    sb4.insert(i26, ' ');
                                    if (selectionStart4 == i26 + 1 && (i7 = this.b) != 2 && i7 != 3) {
                                        selectionStart4++;
                                    }
                                }
                            }
                        }
                    }
                    dg5Var2.setText(sb4);
                    if (selectionStart4 >= 0) {
                        dg5Var2.setSelection(Math.min(selectionStart4, dg5Var2.length()));
                    }
                    dg5Var2.invalidate();
                    pVar.o0 = false;
                    return;
                }
                return;
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        switch (this.a) {
            case 0:
                return;
            case 1:
                if (i2 == 0 && i3 == 1) {
                    this.b = 1;
                    return;
                } else if (i2 == 1 && i3 == 0) {
                    if (charSequence.charAt(i) == ' ' && i > 0) {
                        this.b = 3;
                        this.c = i - 1;
                        return;
                    }
                    this.b = 2;
                    return;
                } else {
                    this.b = -1;
                    return;
                }
            case 2:
                if (i2 == 0 && i3 == 1) {
                    this.b = 1;
                    return;
                } else if (i2 == 1 && i3 == 0) {
                    if (charSequence.charAt(i) == ' ' && i > 0) {
                        this.b = 3;
                        this.c = i - 1;
                        return;
                    }
                    this.b = 2;
                    return;
                } else {
                    this.b = -1;
                    return;
                }
            case 3:
                if (i2 == 0 && i3 == 1) {
                    this.b = 1;
                    return;
                } else if (i2 == 1 && i3 == 0) {
                    if (charSequence.charAt(i) == ' ' && i > 0) {
                        this.b = 3;
                        this.c = i - 1;
                        return;
                    }
                    this.b = 2;
                    return;
                } else {
                    this.b = -1;
                    return;
                }
            default:
                if (i2 == 0 && i3 == 1) {
                    this.b = 1;
                    return;
                } else if (i2 == 1 && i3 == 0) {
                    if (charSequence.charAt(i) == ' ' && i > 0) {
                        this.b = 3;
                        this.c = i - 1;
                        return;
                    }
                    this.b = 2;
                    return;
                } else {
                    this.b = -1;
                    return;
                }
        }
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        byte b = this.a;
    }

    public sk2(Object obj, byte b) {
        this.a = b;
        this.d = obj;
        this.b = -1;
    }

    private final void a(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void b(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void c(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void d(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void e(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void f(int i, int i2, int i3, CharSequence charSequence) {
    }
}
