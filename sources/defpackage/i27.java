package defpackage;

import java.util.ArrayList;
public final class i27 {
    public final CharSequence a;
    public final int b;
    public final int c;
    public final float d;
    public final ArrayList e = new ArrayList();
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final boolean k;

    public i27(defpackage.k27 r37, java.lang.CharSequence r38, android.text.TextPaint r39, int r40) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.i27.<init>(k27, java.lang.CharSequence, android.text.TextPaint, int):void");
    }

    public final void a(i27 i27Var) {
        if (i27Var != null) {
            ArrayList arrayList = i27Var.e;
            int i = 0;
            while (true) {
                ArrayList arrayList2 = this.e;
                if (i < Math.min(arrayList2.size(), arrayList.size())) {
                    ((h27) arrayList2.get(i)).H = ((h27) arrayList.get(i)).H;
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    public final int b() {
        int i;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            ArrayList arrayList = this.e;
            if (i2 < arrayList.size()) {
                int i4 = ((h27) arrayList.get(i2)).f;
                h27 h27Var = (h27) arrayList.get(i2);
                if (h27Var.K && h27Var.f()) {
                    i = h27Var.G;
                } else {
                    i = h27Var.w;
                }
                i3 += i + i4 + ((h27) arrayList.get(i2)).h;
                i2++;
            } else {
                return i3;
            }
        }
    }

    public final int c(nb2 nb2Var) {
        int i = 0;
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.e;
            if (i < arrayList.size()) {
                i2 += ((h27) arrayList.get(i)).j(nb2Var) + ((h27) arrayList.get(i)).f + ((h27) arrayList.get(i)).h;
                i++;
            } else {
                return i2;
            }
        }
    }
}
