package defpackage;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.ui.p;
public final class ak2 implements TextWatcher {
    public final byte a;
    public int b;
    public int c;
    public final Object d;

    public ak2(bk2 bk2Var, int i, int i2) {
        this.a = (byte) 0;
        this.d = bk2Var;
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
                bk2 bk2Var = (bk2) obj;
                if (!bk2Var.d && (length = editable.length()) >= 1) {
                    if (length > 1) {
                        String obj2 = editable.toString();
                        bk2Var.d = true;
                        int i11 = i10;
                        for (int i12 = 0; i12 < Math.min(i9 - i10, length); i12++) {
                            if (i12 == 0) {
                                editable.replace(0, length, obj2.substring(i12, i12 + 1));
                            } else {
                                i11++;
                                int i13 = i10 + i12;
                                ok2[] ok2VarArr = bk2Var.f;
                                if (i13 < ok2VarArr.length) {
                                    ok2VarArr[i13].setText(obj2.substring(i12, i12 + 1));
                                }
                            }
                        }
                        bk2Var.d = false;
                        i10 = i11;
                    }
                    int i14 = i10 + 1;
                    if (i14 >= 0) {
                        ok2[] ok2VarArr2 = bk2Var.f;
                        if (i14 < ok2VarArr2.length) {
                            ok2 ok2Var = ok2VarArr2[i14];
                            ok2Var.setSelection(ok2Var.length());
                            bk2Var.f[i14].requestFocus();
                        }
                    }
                    if ((i10 == i9 - 1 || (i10 == i9 - 2 && length >= 2)) && bk2Var.getCode().length() == i9) {
                        bk2Var.a();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                ph6 ph6Var = (ph6) obj;
                mh6 mh6Var = ph6Var.b;
                if (!ph6Var.M) {
                    int selectionStart = mh6Var.getSelectionStart();
                    String obj3 = mh6Var.getText().toString();
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
                    ph6Var.M = true;
                    String hintText = mh6Var.getHintText();
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
                        mh6Var.setSelection(Math.min(selectionStart, mh6Var.length()));
                    }
                    mh6Var.invalidate();
                    ph6Var.q();
                    ph6Var.M = false;
                    return;
                }
                return;
            case 2:
                rl7 rl7Var = (rl7) obj;
                if (!rl7Var.y1) {
                    int selectionStart2 = rl7Var.J1.getSelectionStart();
                    String obj4 = rl7Var.J1.getText().toString();
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
                    rl7Var.y1 = true;
                    String hintText2 = rl7Var.J1.getHintText();
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
                        ql7 ql7Var = rl7Var.J1;
                        ql7Var.setSelection(Math.min(selectionStart2, ql7Var.length()));
                    }
                    rl7Var.J1.invalidate();
                    rl7Var.y1 = false;
                    rl7Var.M0();
                    return;
                }
                return;
            case 3:
                b18 b18Var = (b18) obj;
                if (!b18Var.b1) {
                    gg5 gg5Var = (gg5) b18Var.Z[2];
                    int selectionStart3 = gg5Var.getSelectionStart();
                    String obj5 = gg5Var.getText().toString();
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
                    b18Var.b1 = true;
                    String hintText3 = gg5Var.getHintText();
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
                    gg5Var.setText(sb3);
                    if (selectionStart3 >= 0) {
                        gg5Var.setSelection(Math.min(selectionStart3, gg5Var.length()));
                    }
                    gg5Var.invalidate();
                    b18Var.b1 = false;
                    return;
                }
                return;
            default:
                p pVar = (p) obj;
                if (!pVar.o0) {
                    gg5 gg5Var2 = (gg5) pVar.f[9];
                    int selectionStart4 = gg5Var2.getSelectionStart();
                    String obj6 = gg5Var2.getText().toString();
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
                    String hintText4 = gg5Var2.getHintText();
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
                    gg5Var2.setText(sb4);
                    if (selectionStart4 >= 0) {
                        gg5Var2.setSelection(Math.min(selectionStart4, gg5Var2.length()));
                    }
                    gg5Var2.invalidate();
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

    public ak2(Object obj, byte b) {
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
