package defpackage;

import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import java.util.ArrayList;
public final class vd1 {
    public final ArrayList a;
    public final ArrayList b;
    public final StringBuilder c;
    public int d;
    public int e;
    public int f;
    public byte g;
    public byte h;

    public vd1(int i, int i2) {
        ArrayList arrayList = new ArrayList();
        this.a = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.b = arrayList2;
        StringBuilder sb = new StringBuilder();
        this.c = sb;
        this.g = i;
        arrayList.clear();
        arrayList2.clear();
        sb.setLength(0);
        this.d = 15;
        this.e = 0;
        this.f = 0;
        this.h = i2;
    }

    public final void a(char c) {
        StringBuilder sb = this.c;
        if (sb.length() < 32) {
            sb.append(c);
        }
    }

    public final void b() {
        StringBuilder sb = this.c;
        int length = sb.length();
        if (length > 0) {
            sb.delete(length - 1, length);
            ArrayList arrayList = this.a;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ud1 ud1Var = (ud1) arrayList.get(size);
                int i = ud1Var.c;
                if (i == length) {
                    ud1Var.c = i - 1;
                } else {
                    return;
                }
            }
        }
    }

    public final m43 c(int i) {
        float f;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.b;
            if (i2 >= arrayList.size()) {
                break;
            }
            spannableStringBuilder.append((CharSequence) arrayList.get(i2));
            spannableStringBuilder.append('\n');
            i2++;
        }
        spannableStringBuilder.append((CharSequence) d());
        if (spannableStringBuilder.length() == 0) {
            return null;
        }
        int i3 = this.e + this.f;
        int length = (32 - i3) - spannableStringBuilder.length();
        int i4 = i3 - length;
        int i5 = i;
        if (i5 == Integer.MIN_VALUE) {
            if (this.g == 2 && (Math.abs(i4) < 3 || length < 0)) {
                i5 = 1;
            } else if (this.g == 2 && i4 > 0) {
                i5 = 2;
            } else {
                i5 = 0;
            }
        }
        if (i5 != 1) {
            if (i5 != 2) {
                f = c00.B(i3, 32.0f, 0.8f, 0.1f);
            } else {
                f = c00.B(32 - length, 32.0f, 0.8f, 0.1f);
            }
        } else {
            f = 0.5f;
        }
        int i6 = this.d;
        if (i6 > 7) {
            i6 -= 17;
        } else if (this.g == 1) {
            i6 -= this.h - 1;
        }
        return new m43(spannableStringBuilder, Layout.Alignment.ALIGN_NORMAL, null, null, i6, 1, Integer.MIN_VALUE, f, i5, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, -16777216, Integer.MIN_VALUE, 0.0f, 0);
    }

    public final SpannableString d() {
        int i;
        int i2;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.c);
        int length = spannableStringBuilder.length();
        int i3 = -1;
        int i4 = -1;
        int i5 = -1;
        int i6 = -1;
        int i7 = 0;
        int i8 = 0;
        boolean z = false;
        while (true) {
            ArrayList arrayList = this.a;
            if (i7 >= arrayList.size()) {
                break;
            }
            ud1 ud1Var = (ud1) arrayList.get(i7);
            boolean z2 = ud1Var.b;
            int i9 = ud1Var.a;
            if (i9 != 8) {
                if (i9 == 7) {
                    z = true;
                } else {
                    i6 = wd1.B[i9];
                    z = false;
                }
            }
            int i10 = ud1Var.c;
            i7++;
            if (i7 < arrayList.size()) {
                i = ((ud1) arrayList.get(i7)).c;
            } else {
                i = length;
            }
            if (i10 != i) {
                if (i3 != -1) {
                    if (!z2) {
                        i2 = 33;
                        spannableStringBuilder.setSpan(new UnderlineSpan(), i3, i10, 33);
                        i3 = -1;
                    } else {
                        i2 = 33;
                    }
                } else {
                    i2 = 33;
                    if (z2) {
                        i3 = i10;
                    }
                }
                if (i4 != -1) {
                    if (!z) {
                        spannableStringBuilder.setSpan(new StyleSpan(2), i4, i10, i2);
                        i4 = -1;
                    }
                } else if (z) {
                    i4 = i10;
                }
                if (i6 != i5) {
                    if (i5 != -1) {
                        spannableStringBuilder.setSpan(new ForegroundColorSpan(i5), i8, i10, 33);
                    }
                    i5 = i6;
                    i8 = i10;
                }
            }
        }
        if (i3 != -1 && i3 != length) {
            spannableStringBuilder.setSpan(new UnderlineSpan(), i3, length, 33);
        }
        if (i4 != -1 && i4 != length) {
            spannableStringBuilder.setSpan(new StyleSpan(2), i4, length, 33);
        }
        if (i8 != length && i5 != -1) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan(i5), i8, length, 33);
        }
        return new SpannableString(spannableStringBuilder);
    }

    public final boolean e() {
        if (this.a.isEmpty() && this.b.isEmpty() && this.c.length() == 0) {
            return true;
        }
        return false;
    }
}
