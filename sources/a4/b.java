package a4;

import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import java.util.ArrayList;
public final class b {
    public final ArrayList f211a;
    public final ArrayList f212b;
    public final StringBuilder f213c;
    public int d;
    public int e;
    public int f214f;
    public int f215g;
    public int h;

    public b(int i10, int i11) {
        ArrayList arrayList = new ArrayList();
        this.f211a = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.f212b = arrayList2;
        StringBuilder sb2 = new StringBuilder();
        this.f213c = sb2;
        this.f215g = i10;
        arrayList.clear();
        arrayList2.clear();
        sb2.setLength(0);
        this.d = 15;
        this.e = 0;
        this.f214f = 0;
        this.h = i11;
    }

    public final void a(char c10) {
        StringBuilder sb2 = this.f213c;
        if (sb2.length() < 32) {
            sb2.append(c10);
        }
    }

    public final void b() {
        StringBuilder sb2 = this.f213c;
        int length = sb2.length();
        if (length > 0) {
            sb2.delete(length - 1, length);
            ArrayList arrayList = this.f211a;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                a aVar = (a) arrayList.get(size);
                int i10 = aVar.f210c;
                if (i10 == length) {
                    aVar.f210c = i10 - 1;
                } else {
                    return;
                }
            }
        }
    }

    public final d2.b c(int i10) {
        int i11;
        float f7;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        int i12 = 0;
        while (true) {
            ArrayList arrayList = this.f212b;
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
        int i13 = this.e + this.f214f;
        int length = (32 - i13) - spannableStringBuilder.length();
        int i14 = i13 - length;
        if (i10 != Integer.MIN_VALUE) {
            i11 = i10;
        } else if (this.f215g == 2 && (Math.abs(i14) < 3 || length < 0)) {
            i11 = 1;
        } else if (this.f215g == 2 && i14 > 0) {
            i11 = 2;
        } else {
            i11 = 0;
        }
        if (i11 != 1) {
            if (i11 != 2) {
                f7 = a1.g.c(i13, 32.0f, 0.8f, 0.1f);
            } else {
                f7 = a1.g.c(32 - length, 32.0f, 0.8f, 0.1f);
            }
        } else {
            f7 = 0.5f;
        }
        float f10 = f7;
        int i15 = this.d;
        if (i15 > 7) {
            i15 -= 17;
        } else if (this.f215g == 1) {
            i15 -= this.h - 1;
        }
        return new d2.b(spannableStringBuilder, Layout.Alignment.ALIGN_NORMAL, null, null, i15, 1, Integer.MIN_VALUE, f10, i11, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, -16777216, Integer.MIN_VALUE, 0.0f, 0);
    }

    public final SpannableString d() {
        int i10;
        boolean z10;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f213c);
        int length = spannableStringBuilder.length();
        int i11 = -1;
        int i12 = -1;
        int i13 = -1;
        int i14 = -1;
        int i15 = 0;
        int i16 = 0;
        boolean z11 = false;
        while (true) {
            ArrayList arrayList = this.f211a;
            if (i15 >= arrayList.size()) {
                break;
            }
            a aVar = (a) arrayList.get(i15);
            boolean z12 = aVar.f209b;
            int i17 = aVar.f208a;
            if (i17 != 8) {
                if (i17 == 7) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (i17 != 7) {
                    i14 = c.B[i17];
                }
                z11 = z10;
            }
            int i18 = aVar.f210c;
            i15++;
            if (i15 < arrayList.size()) {
                i10 = ((a) arrayList.get(i15)).f210c;
            } else {
                i10 = length;
            }
            if (i18 != i10) {
                if (i11 != -1 && !z12) {
                    spannableStringBuilder.setSpan(new UnderlineSpan(), i11, i18, 33);
                    i11 = -1;
                } else if (i11 == -1 && z12) {
                    i11 = i18;
                }
                if (i12 != -1 && !z11) {
                    spannableStringBuilder.setSpan(new StyleSpan(2), i12, i18, 33);
                    i12 = -1;
                } else if (i12 == -1 && z11) {
                    i12 = i18;
                }
                if (i14 != i13) {
                    if (i13 != -1) {
                        spannableStringBuilder.setSpan(new ForegroundColorSpan(i13), i16, i18, 33);
                    }
                    i13 = i14;
                    i16 = i18;
                }
            }
        }
        if (i11 != -1 && i11 != length) {
            spannableStringBuilder.setSpan(new UnderlineSpan(), i11, length, 33);
        }
        if (i12 != -1 && i12 != length) {
            spannableStringBuilder.setSpan(new StyleSpan(2), i12, length, 33);
        }
        if (i16 != length && i13 != -1) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan(i13), i16, length, 33);
        }
        return new SpannableString(spannableStringBuilder);
    }

    public final boolean e() {
        if (this.f211a.isEmpty() && this.f212b.isEmpty() && this.f213c.length() == 0) {
            return true;
        }
        return false;
    }
}
