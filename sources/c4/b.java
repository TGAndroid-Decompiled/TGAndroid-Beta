package c4;

import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import java.util.ArrayList;
public final class b {
    public final ArrayList f4140a;
    public final ArrayList f4141b;
    public final StringBuilder f4142c;
    public int d;
    public int f4143e;
    public int f4144f;
    public int f4145g;
    public int h;

    public b(int i3, int i10) {
        ArrayList arrayList = new ArrayList();
        this.f4140a = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.f4141b = arrayList2;
        StringBuilder sb2 = new StringBuilder();
        this.f4142c = sb2;
        this.f4145g = i3;
        arrayList.clear();
        arrayList2.clear();
        sb2.setLength(0);
        this.d = 15;
        this.f4143e = 0;
        this.f4144f = 0;
        this.h = i10;
    }

    public final void a(char c2) {
        StringBuilder sb2 = this.f4142c;
        if (sb2.length() < 32) {
            sb2.append(c2);
        }
    }

    public final void b() {
        StringBuilder sb2 = this.f4142c;
        int length = sb2.length();
        if (length > 0) {
            sb2.delete(length - 1, length);
            ArrayList arrayList = this.f4140a;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                a aVar = (a) arrayList.get(size);
                int i3 = aVar.f4139c;
                if (i3 == length) {
                    aVar.f4139c = i3 - 1;
                } else {
                    return;
                }
            }
        }
    }

    public final f2.b c(int i3) {
        int i10;
        float f10;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.f4141b;
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
        int i12 = this.f4143e + this.f4144f;
        int length = (32 - i12) - spannableStringBuilder.length();
        int i13 = i12 - length;
        if (i3 != Integer.MIN_VALUE) {
            i10 = i3;
        } else if (this.f4145g == 2 && (Math.abs(i13) < 3 || length < 0)) {
            i10 = 1;
        } else if (this.f4145g == 2 && i13 > 0) {
            i10 = 2;
        } else {
            i10 = 0;
        }
        if (i10 != 1) {
            if (i10 != 2) {
                f10 = a1.g.A(i12, 32.0f, 0.8f, 0.1f);
            } else {
                f10 = a1.g.A(32 - length, 32.0f, 0.8f, 0.1f);
            }
        } else {
            f10 = 0.5f;
        }
        float f11 = f10;
        int i14 = this.d;
        if (i14 > 7) {
            i14 -= 17;
        } else if (this.f4145g == 1) {
            i14 -= this.h - 1;
        }
        return new f2.b(spannableStringBuilder, Layout.Alignment.ALIGN_NORMAL, null, null, i14, 1, Integer.MIN_VALUE, f11, i10, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, -16777216, Integer.MIN_VALUE, 0.0f, 0);
    }

    public final SpannableString d() {
        int i3;
        boolean z10;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f4142c);
        int length = spannableStringBuilder.length();
        int i10 = -1;
        int i11 = -1;
        int i12 = -1;
        int i13 = -1;
        int i14 = 0;
        int i15 = 0;
        boolean z11 = false;
        while (true) {
            ArrayList arrayList = this.f4140a;
            if (i14 >= arrayList.size()) {
                break;
            }
            a aVar = (a) arrayList.get(i14);
            boolean z12 = aVar.f4138b;
            int i16 = aVar.f4137a;
            if (i16 != 8) {
                if (i16 == 7) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (i16 != 7) {
                    i13 = c.B[i16];
                }
                z11 = z10;
            }
            int i17 = aVar.f4139c;
            i14++;
            if (i14 < arrayList.size()) {
                i3 = ((a) arrayList.get(i14)).f4139c;
            } else {
                i3 = length;
            }
            if (i17 != i3) {
                if (i10 != -1 && !z12) {
                    spannableStringBuilder.setSpan(new UnderlineSpan(), i10, i17, 33);
                    i10 = -1;
                } else if (i10 == -1 && z12) {
                    i10 = i17;
                }
                if (i11 != -1 && !z11) {
                    spannableStringBuilder.setSpan(new StyleSpan(2), i11, i17, 33);
                    i11 = -1;
                } else if (i11 == -1 && z11) {
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
        if (this.f4140a.isEmpty() && this.f4141b.isEmpty() && this.f4142c.length() == 0) {
            return true;
        }
        return false;
    }
}
