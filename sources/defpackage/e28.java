package defpackage;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.p;
public final class e28 implements TextWatcher {
    public boolean a;
    public String b;
    public boolean c;
    public int d;
    public int e;
    public boolean f;
    public final char[] h = {',', '.', 1643, 12289, 11841, 65040, 65041, 65104, 65105, 65292, 65380, 699};
    public final p n;

    public e28(p pVar) {
        this.n = pVar;
    }

    public final int a(String str) {
        int i = 0;
        while (true) {
            char[] cArr = this.h;
            if (i < cArr.length) {
                int indexOf = str.indexOf(cArr[i]);
                if (indexOf >= 0) {
                    return indexOf;
                }
                i++;
            } else {
                return -1;
            }
        }
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        long j;
        boolean z;
        String str;
        String str2;
        String substring;
        p pVar = this.n;
        if (pVar.n0) {
            return;
        }
        Long l = pVar.I0;
        if (l != null) {
            j = l.longValue();
        } else {
            j = 0;
        }
        String str3 = this.b;
        if (str3 == null) {
            str3 = ob6.n(editable.toString());
        }
        int a = a(str3);
        if (a >= 0) {
            z = true;
        } else {
            z = false;
        }
        String str4 = pVar.D0.invoice.currency;
        str4.getClass();
        int i = 10;
        char c = 65535;
        switch (str4.hashCode()) {
            case 65726:
                if (str4.equals("BHD")) {
                    c = 0;
                    break;
                }
                break;
            case 65759:
                if (str4.equals("BIF")) {
                    c = 1;
                    break;
                }
                break;
            case 66267:
                if (str4.equals("BYR")) {
                    c = 2;
                    break;
                }
                break;
            case 66813:
                if (str4.equals("CLF")) {
                    c = 3;
                    break;
                }
                break;
            case 66823:
                if (str4.equals("CLP")) {
                    c = 4;
                    break;
                }
                break;
            case 67122:
                if (str4.equals("CVE")) {
                    c = 5;
                    break;
                }
                break;
            case 67712:
                if (str4.equals("DJF")) {
                    c = 6;
                    break;
                }
                break;
            case 70719:
                if (str4.equals("GNF")) {
                    c = 7;
                    break;
                }
                break;
            case 72732:
                if (str4.equals("IQD")) {
                    c = '\b';
                    break;
                }
                break;
            case 72801:
                if (str4.equals("ISK")) {
                    c = '\t';
                    break;
                }
                break;
            case 73631:
                if (str4.equals("JOD")) {
                    c = '\n';
                    break;
                }
                break;
            case 73683:
                if (str4.equals("JPY")) {
                    c = 11;
                    break;
                }
                break;
            case 74532:
                if (str4.equals("KMF")) {
                    c = '\f';
                    break;
                }
                break;
            case 74704:
                if (str4.equals("KRW")) {
                    c = '\r';
                    break;
                }
                break;
            case 74840:
                if (str4.equals("KWD")) {
                    c = 14;
                    break;
                }
                break;
            case 75863:
                if (str4.equals("LYD")) {
                    c = 15;
                    break;
                }
                break;
            case 76263:
                if (str4.equals("MGA")) {
                    c = 16;
                    break;
                }
                break;
            case 76618:
                if (str4.equals("MRO")) {
                    c = 17;
                    break;
                }
                break;
            case 78388:
                if (str4.equals("OMR")) {
                    c = 18;
                    break;
                }
                break;
            case 79710:
                if (str4.equals("PYG")) {
                    c = 19;
                    break;
                }
                break;
            case 81569:
                if (str4.equals("RWF")) {
                    c = 20;
                    break;
                }
                break;
            case 83210:
                if (str4.equals("TND")) {
                    c = 21;
                    break;
                }
                break;
            case 83974:
                if (str4.equals("UGX")) {
                    c = 22;
                    break;
                }
                break;
            case 84517:
                if (str4.equals("UYI")) {
                    c = 23;
                    break;
                }
                break;
            case 85132:
                if (str4.equals("VND")) {
                    c = 24;
                    break;
                }
                break;
            case 85367:
                if (str4.equals("VUV")) {
                    c = 25;
                    break;
                }
                break;
            case 86653:
                if (str4.equals("XAF")) {
                    c = 26;
                    break;
                }
                break;
            case 87087:
                if (str4.equals("XOF")) {
                    c = 27;
                    break;
                }
                break;
            case 87118:
                if (str4.equals("XPF")) {
                    c = 28;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
            case '\b':
            case '\n':
            case 14:
            case 15:
            case 18:
            case 21:
                i = 1000;
                break;
            case 1:
            case 2:
            case 4:
            case 5:
            case 6:
            case 7:
            case '\t':
            case 11:
            case '\f':
            case '\r':
            case 16:
            case 19:
            case 20:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
                i = 1;
                break;
            case 3:
                i = 10000;
                break;
            case 17:
                break;
            default:
                i = 100;
                break;
        }
        String str5 = "";
        if (a >= 0) {
            str = str3.substring(0, a);
            str2 = str3.substring(a + 1);
        } else {
            str = str3;
            str2 = "";
        }
        long longValue = Utilities.A(f78.h(str, false)).longValue() * i;
        long longValue2 = Utilities.A(f78.h(str2, false)).longValue();
        String valueOf = String.valueOf(longValue2);
        String valueOf2 = String.valueOf(i - 1);
        if (a > 0 && valueOf.length() > valueOf2.length()) {
            if (this.e - a < valueOf.length()) {
                substring = valueOf.substring(0, valueOf2.length());
            } else {
                substring = valueOf.substring(valueOf.length() - valueOf2.length());
            }
            longValue2 = Utilities.A(substring).longValue();
        }
        Long valueOf3 = Long.valueOf(longValue + longValue2);
        pVar.I0 = valueOf3;
        if (pVar.D0.invoice.max_tip_amount != 0) {
            long longValue3 = valueOf3.longValue();
            long j2 = pVar.D0.invoice.max_tip_amount;
            if (longValue3 > j2) {
                pVar.I0 = Long.valueOf(j2);
            }
        }
        int selectionStart = pVar.f[0].getSelectionStart();
        pVar.n0 = true;
        int i2 = (pVar.I0.longValue() > 0L ? 1 : (pVar.I0.longValue() == 0L ? 0 : -1));
        EditTextBoldCursor[] editTextBoldCursorArr = pVar.f;
        if (i2 == 0) {
            editTextBoldCursorArr[0].setText("");
        } else {
            EditTextBoldCursor editTextBoldCursor = editTextBoldCursorArr[0];
            str5 = ob6.D0().q(pVar.I0.longValue(), false, z, true, pVar.D0.invoice.currency);
            editTextBoldCursor.setText(str5);
        }
        if (j < pVar.I0.longValue() && j != 0 && this.a && selectionStart >= 0) {
            EditTextBoldCursor editTextBoldCursor2 = pVar.f[0];
            editTextBoldCursor2.setSelection(Math.min(selectionStart, editTextBoldCursor2.length()));
        } else if (this.c && this.d != pVar.f[0].length()) {
            EditTextBoldCursor editTextBoldCursor3 = pVar.f[0];
            editTextBoldCursor3.setSelection(Math.max(0, Math.min(selectionStart, editTextBoldCursor3.length())));
        } else if (!this.f && z && a >= 0) {
            int a2 = a(str5);
            EditTextBoldCursor[] editTextBoldCursorArr2 = pVar.f;
            if (a2 > 0) {
                editTextBoldCursorArr2[0].setSelection(a2 + 1);
            } else {
                EditTextBoldCursor editTextBoldCursor4 = editTextBoldCursorArr2[0];
                editTextBoldCursor4.setSelection(editTextBoldCursor4.length());
            }
        } else {
            EditTextBoldCursor editTextBoldCursor5 = pVar.f[0];
            editTextBoldCursor5.setSelection(editTextBoldCursor5.length());
        }
        this.f = z;
        pVar.R0();
        this.b = null;
        pVar.n0 = false;
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        int length;
        boolean z;
        String str;
        if (!this.n.n0) {
            this.a = !TextUtils.isEmpty(charSequence);
            this.b = null;
            if (charSequence == null) {
                length = 0;
            } else {
                length = charSequence.length();
            }
            this.d = length;
            this.e = i;
            if (i2 == 1 && i3 == 0) {
                z = true;
            } else {
                z = false;
            }
            this.c = z;
            if (z) {
                String n = ob6.n(charSequence);
                char charAt = n.charAt(i);
                int a = a(n);
                if (a >= 0) {
                    str = n.substring(a + 1);
                } else {
                    str = "";
                }
                long longValue = Utilities.A(f78.h(str, false)).longValue();
                if ((charAt >= '0' && charAt <= '9') || (str.length() != 0 && longValue == 0)) {
                    if (a > 0 && i > a && longValue == 0) {
                        this.b = n.substring(0, a - 1);
                        return;
                    }
                    return;
                }
                while (true) {
                    int i4 = i - 1;
                    if (i4 >= 0) {
                        char charAt2 = n.charAt(i4);
                        if (charAt2 >= '0' && charAt2 <= '9') {
                            this.b = n.substring(0, i4).concat(n.substring(i));
                            return;
                        }
                        i = i4;
                    } else {
                        return;
                    }
                }
            }
        }
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
