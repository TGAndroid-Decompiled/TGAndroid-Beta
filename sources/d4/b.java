package d4;

import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import java.util.ArrayList;
public final class b {
    public final ArrayList f8114a;
    public final ArrayList f8115b;
    public final StringBuilder f8116c;
    public int d;
    public int f8117e;
    public int f8118f;
    public int f8119g;
    public int h;

    public b(int i7, int i10) {
        ArrayList arrayList = new ArrayList();
        this.f8114a = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.f8115b = arrayList2;
        StringBuilder sb2 = new StringBuilder();
        this.f8116c = sb2;
        this.f8119g = i7;
        arrayList.clear();
        arrayList2.clear();
        sb2.setLength(0);
        this.d = 15;
        this.f8117e = 0;
        this.f8118f = 0;
        this.h = i10;
    }

    public final void a(char c10) {
        StringBuilder sb2 = this.f8116c;
        if (sb2.length() < 32) {
            sb2.append(c10);
        }
    }

    public final void b() {
        StringBuilder sb2 = this.f8116c;
        int length = sb2.length();
        if (length > 0) {
            sb2.delete(length - 1, length);
            ArrayList arrayList = this.f8114a;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                a aVar = (a) arrayList.get(size);
                int i7 = aVar.f8113c;
                if (i7 == length) {
                    aVar.f8113c = i7 - 1;
                } else {
                    return;
                }
            }
        }
    }

    public final g2.b c(int i7) {
        int i10;
        float f10;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.f8115b;
            if (i11 >= arrayList.size()) {
                break;
            }
            spannableStringBuilder.append((CharSequence) arrayList.get(i11));
            spannableStringBuilder.append('\n');
            i11++;
        }
        spannableStringBuilder.append((CharSequence) d());
        if (spannableStringBuilder.length() == 0) {
            return null;
        }
        int i12 = this.f8117e + this.f8118f;
        int length = (32 - i12) - spannableStringBuilder.length();
        int i13 = i12 - length;
        if (i7 != Integer.MIN_VALUE) {
            i10 = i7;
        } else if (this.f8119g == 2 && (Math.abs(i13) < 3 || length < 0)) {
            i10 = 1;
        } else if (this.f8119g == 2 && i13 > 0) {
            i10 = 2;
        } else {
            i10 = 0;
        }
        if (i10 != 1) {
            if (i10 != 2) {
                f10 = com.google.android.recaptcha.internal.a.c(i12, 32.0f, 0.8f, 0.1f);
            } else {
                f10 = com.google.android.recaptcha.internal.a.c(32 - length, 32.0f, 0.8f, 0.1f);
            }
        } else {
            f10 = 0.5f;
        }
        float f11 = f10;
        int i14 = this.d;
        if (i14 > 7) {
            i14 -= 17;
        } else if (this.f8119g == 1) {
            i14 -= this.h - 1;
        }
        return new g2.b(spannableStringBuilder, Layout.Alignment.ALIGN_NORMAL, null, null, i14, 1, Integer.MIN_VALUE, f11, i10, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, -16777216, Integer.MIN_VALUE, 0.0f, 0);
    }

    public final SpannableString d() {
        int i7;
        boolean z9;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f8116c);
        int length = spannableStringBuilder.length();
        int i10 = -1;
        int i11 = -1;
        int i12 = -1;
        int i13 = -1;
        int i14 = 0;
        int i15 = 0;
        boolean z10 = false;
        while (true) {
            ArrayList arrayList = this.f8114a;
            if (i14 >= arrayList.size()) {
                break;
            }
            a aVar = (a) arrayList.get(i14);
            boolean z11 = aVar.f8112b;
            int i16 = aVar.f8111a;
            if (i16 != 8) {
                if (i16 == 7) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                if (i16 != 7) {
                    i13 = c.B[i16];
                }
                z10 = z9;
            }
            int i17 = aVar.f8113c;
            i14++;
            if (i14 < arrayList.size()) {
                i7 = ((a) arrayList.get(i14)).f8113c;
            } else {
                i7 = length;
            }
            if (i17 != i7) {
                if (i10 != -1 && !z11) {
                    spannableStringBuilder.setSpan(new UnderlineSpan(), i10, i17, 33);
                    i10 = -1;
                } else if (i10 == -1 && z11) {
                    i10 = i17;
                }
                if (i11 != -1 && !z10) {
                    spannableStringBuilder.setSpan(new StyleSpan(2), i11, i17, 33);
                    i11 = -1;
                } else if (i11 == -1 && z10) {
                    i11 = i17;
                }
                if (i13 != i12) {
                    if (i12 != -1) {
                        spannableStringBuilder.setSpan(new ForegroundColorSpan(i12), i15, i17, 33);
                    }
                    i12 = i13;
                    i15 = i17;
                }
            }
        }
        if (i10 != -1 && i10 != length) {
            spannableStringBuilder.setSpan(new UnderlineSpan(), i10, length, 33);
        }
        if (i11 != -1 && i11 != length) {
            spannableStringBuilder.setSpan(new StyleSpan(2), i11, length, 33);
        }
        if (i15 != length && i12 != -1) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan(i12), i15, length, 33);
        }
        return new SpannableString(spannableStringBuilder);
    }

    public final boolean e() {
        if (this.f8114a.isEmpty() && this.f8115b.isEmpty() && this.f8116c.length() == 0) {
            return true;
        }
        return false;
    }
}
