package a4;

import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import java.util.ArrayList;
public final class c {
    public final ArrayList f223a;
    public final ArrayList f224b;
    public final StringBuilder f225c;
    public int d;
    public int f226e;
    public int f227f;
    public int f228g;
    public int h;

    public c(int i10, int i11) {
        ArrayList arrayList = new ArrayList();
        this.f223a = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.f224b = arrayList2;
        StringBuilder sb2 = new StringBuilder();
        this.f225c = sb2;
        this.f228g = i10;
        arrayList.clear();
        arrayList2.clear();
        sb2.setLength(0);
        this.d = 15;
        this.f226e = 0;
        this.f227f = 0;
        this.h = i11;
    }

    public final void a(char c10) {
        StringBuilder sb2 = this.f225c;
        if (sb2.length() < 32) {
            sb2.append(c10);
        }
    }

    public final void b() {
        StringBuilder sb2 = this.f225c;
        int length = sb2.length();
        if (length > 0) {
            sb2.delete(length - 1, length);
            ArrayList arrayList = this.f223a;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                b bVar = (b) arrayList.get(size);
                int i10 = bVar.f222c;
                if (i10 == length) {
                    bVar.f222c = i10 - 1;
                } else {
                    return;
                }
            }
        }
    }

    public final d2.b c(int i10) {
        int i11;
        float f7;
        float e7;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        int i12 = 0;
        while (true) {
            ArrayList arrayList = this.f224b;
            if (i12 >= arrayList.size()) {
                break;
            }
            spannableStringBuilder.append((CharSequence) arrayList.get(i12));
            spannableStringBuilder.append('\n');
            i12++;
        }
        spannableStringBuilder.append((CharSequence) d());
        if (spannableStringBuilder.length() == 0) {
            return null;
        }
        int i13 = this.f226e + this.f227f;
        int length = (32 - i13) - spannableStringBuilder.length();
        int i14 = i13 - length;
        if (i10 != Integer.MIN_VALUE) {
            i11 = i10;
        } else if (this.f228g == 2 && (Math.abs(i14) < 3 || length < 0)) {
            i11 = 1;
        } else if (this.f228g == 2 && i14 > 0) {
            i11 = 2;
        } else {
            i11 = 0;
        }
        if (i11 != 1) {
            if (i11 != 2) {
                e7 = a.e(i13, 32.0f, 0.8f, 0.1f);
            } else {
                e7 = a.e(32 - length, 32.0f, 0.8f, 0.1f);
            }
            f7 = e7;
        } else {
            f7 = 0.5f;
        }
        int i15 = this.d;
        if (i15 > 7) {
            i15 -= 17;
        } else if (this.f228g == 1) {
            i15 -= this.h - 1;
        }
        return new d2.b(spannableStringBuilder, Layout.Alignment.ALIGN_NORMAL, null, null, i15, 1, Integer.MIN_VALUE, f7, i11, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, -16777216, Integer.MIN_VALUE, 0.0f, 0);
    }

    public final SpannableString d() {
        int i10;
        boolean z10;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f225c);
        int length = spannableStringBuilder.length();
        int i11 = 0;
        int i12 = -1;
        int i13 = -1;
        int i14 = 0;
        int i15 = -1;
        int i16 = -1;
        boolean z11 = false;
        while (true) {
            ArrayList arrayList = this.f223a;
            if (i11 >= arrayList.size()) {
                break;
            }
            b bVar = (b) arrayList.get(i11);
            boolean z12 = bVar.f221b;
            int i17 = bVar.f220a;
            if (i17 != 8) {
                if (i17 == 7) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (i17 != 7) {
                    i16 = d.B[i17];
                }
                z11 = z10;
            }
            int i18 = bVar.f222c;
            i11++;
            if (i11 < arrayList.size()) {
                i10 = ((b) arrayList.get(i11)).f222c;
            } else {
                i10 = length;
            }
            if (i18 != i10) {
                if (i12 != -1 && !z12) {
                    spannableStringBuilder.setSpan(new UnderlineSpan(), i12, i18, 33);
                    i12 = -1;
                } else if (i12 == -1 && z12) {
                    i12 = i18;
                }
                if (i13 != -1 && !z11) {
                    spannableStringBuilder.setSpan(new StyleSpan(2), i13, i18, 33);
                    i13 = -1;
                } else if (i13 == -1 && z11) {
                    i13 = i18;
                }
                if (i16 != i15) {
                    if (i15 != -1) {
                        spannableStringBuilder.setSpan(new ForegroundColorSpan(i15), i14, i18, 33);
                    }
                    i15 = i16;
                    i14 = i18;
                }
            }
        }
        if (i12 != -1 && i12 != length) {
            spannableStringBuilder.setSpan(new UnderlineSpan(), i12, length, 33);
        }
        if (i13 != -1 && i13 != length) {
            spannableStringBuilder.setSpan(new StyleSpan(2), i13, length, 33);
        }
        if (i14 != length && i15 != -1) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan(i15), i14, length, 33);
        }
        return new SpannableString(spannableStringBuilder);
    }

    public final boolean e() {
        if (this.f223a.isEmpty() && this.f224b.isEmpty() && this.f225c.length() == 0) {
            return true;
        }
        return false;
    }
}
