package h4;

import a4.g;
import android.graphics.Rect;
import java.util.Arrays;
public final class a {
    public boolean f11017b;
    public boolean f11018c;
    public int[] d;
    public int f11019e;
    public int f11020f;
    public Rect f11021g;
    public final int[] f11016a = new int[4];
    public int h = -1;
    public int f11022i = -1;

    public static int a(int i10, int[] iArr) {
        if (i10 >= 0 && i10 < iArr.length) {
            return iArr[i10];
        }
        return iArr[0];
    }

    public static int c(int i10, int i11) {
        return (i10 & 16777215) | ((i11 * 17) << 24);
    }

    public final void b(g gVar, boolean z10, Rect rect, int[] iArr) {
        int i10;
        int i11;
        int width = rect.width();
        int height = rect.height();
        int i12 = !z10 ? 1 : 0;
        int i13 = i12 * width;
        while (true) {
            int i14 = 0;
            do {
                int i15 = 0;
                for (int i16 = 1; i15 < i16 && i16 <= 64; i16 <<= 2) {
                    if (gVar.b() < 4) {
                        i10 = -1;
                        i11 = 0;
                        break;
                    }
                    i15 = (i15 << 4) | gVar.i(4);
                }
                i10 = i15 & 3;
                if (i15 < 4) {
                    i11 = width;
                } else {
                    i11 = i15 >> 2;
                }
                int min = Math.min(i11, width - i14);
                if (min > 0) {
                    int i17 = i13 + min;
                    Arrays.fill(iArr, i13, i17, this.f11016a[i10]);
                    i14 += min;
                    i13 = i17;
                    continue;
                }
            } while (i14 < width);
            i12 += 2;
            if (i12 >= height) {
                return;
            }
            i13 = i12 * width;
            gVar.c();
        }
    }
}
