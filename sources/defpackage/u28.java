package defpackage;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.p;
public final class u28 implements TextWatcher {
    public final String[] a = {"34", "37"};
    public final String[] b = {"300", "301", "302", "303", "304", "305", "309", "36", "38", "39"};
    public final String[] c = {"2221", "2222", "2223", "2224", "2225", "2226", "2227", "2228", "2229", "2200", "2201", "2202", "2203", "2204", "8600", "9860", "223", "224", "225", "226", "227", "228", "229", "23", "24", "25", "26", "270", "271", "2720", "50", "51", "52", "53", "54", "55", "4", "60", "62", "64", "65", "35"};
    public int d = -1;
    public int e;
    public final p f;

    public u28(p pVar) {
        this.f = pVar;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        int i;
        boolean z;
        int i2;
        int i3;
        String[] strArr;
        int i4;
        String str;
        p pVar = this.f;
        if (pVar.p0) {
            return;
        }
        int i5 = 0;
        EditTextBoldCursor editTextBoldCursor = pVar.f[0];
        int selectionStart = editTextBoldCursor.getSelectionStart();
        String obj = editTextBoldCursor.getText().toString();
        int i6 = 3;
        int i7 = 1;
        if (this.d == 3) {
            obj = obj.substring(0, this.e).concat(obj.substring(this.e + 1));
            selectionStart--;
        }
        StringBuilder sb = new StringBuilder(obj.length());
        int i8 = 0;
        while (i8 < obj.length()) {
            int i9 = i8 + 1;
            String substring = obj.substring(i8, i9);
            if ("0123456789".contains(substring)) {
                sb.append(substring);
            }
            i8 = i9;
        }
        pVar.p0 = true;
        String str2 = null;
        int i10 = 100;
        if (sb.length() > 0) {
            String sb2 = sb.toString();
            int i11 = 0;
            while (true) {
                if (i11 < i6) {
                    if (i11 != 0) {
                        if (i11 != i7) {
                            strArr = this.b;
                            i4 = 14;
                            str = "xxxx xxxx xxxx xx";
                        } else {
                            strArr = this.a;
                            i4 = 15;
                            str = "xxxx xxxx xxxx xxx";
                        }
                    } else {
                        strArr = this.c;
                        i4 = 16;
                        str = "xxxx xxxx xxxx xxxx";
                    }
                    i = i7;
                    for (int i12 = i5; i12 < strArr.length; i12++) {
                        String str3 = strArr[i12];
                        if (sb2.length() <= str3.length()) {
                            if (str3.startsWith(sb2)) {
                                i10 = i4;
                                str2 = str;
                                break;
                            }
                        } else if (sb2.startsWith(str3)) {
                            i10 = i4;
                            str2 = str;
                            break;
                        }
                    }
                    if (str2 != null) {
                        break;
                    }
                    i11++;
                    i7 = i;
                    i5 = 0;
                    i6 = 3;
                } else {
                    i = i7;
                    break;
                }
            }
            if (sb.length() > i10) {
                sb.setLength(i10);
            }
        } else {
            i = 1;
        }
        if (str2 != null) {
            if (sb.length() == i10) {
                pVar.f[i].requestFocus();
            }
            yob.X(editTextBoldCursor, aob.G6, pVar.Z0);
            int i13 = 0;
            while (true) {
                if (i13 >= sb.length()) {
                    break;
                } else if (i13 < str2.length()) {
                    if (str2.charAt(i13) == ' ') {
                        sb.insert(i13, ' ');
                        i13++;
                        if (selectionStart == i13 && (i3 = this.d) != 2 && i3 != 3) {
                            selectionStart++;
                        }
                    }
                    i13++;
                } else {
                    sb.insert(i13, ' ');
                    if (selectionStart == i13 + 1 && (i2 = this.d) != 2 && i2 != 3) {
                        selectionStart++;
                    }
                }
            }
        }
        if (!sb.toString().equals(editable.toString())) {
            z = false;
            editable.replace(0, editable.length(), sb);
        } else {
            z = false;
        }
        if (selectionStart >= 0) {
            editTextBoldCursor.setSelection(Math.min(selectionStart, editTextBoldCursor.length()));
        }
        pVar.p0 = z;
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        if (i2 == 0 && i3 == 1) {
            this.d = 1;
        } else if (i2 == 1 && i3 == 0) {
            if (charSequence.charAt(i) == ' ' && i > 0) {
                this.d = 3;
                this.e = i - 1;
                return;
            }
            this.d = 2;
        } else {
            this.d = -1;
        }
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
