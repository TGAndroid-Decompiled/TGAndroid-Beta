package k4;

import android.graphics.Rect;
import d4.f;
import java.util.Arrays;
public final class a {
    public boolean d;
    public boolean f18191e;
    public int[] f18192f;
    public int f18193g;
    public int h;
    public Rect f18194i;
    public long f18189b = -9223372036854775807L;
    public long f18190c = -9223372036854775807L;
    public final int[] f18188a = new int[4];
    public int f18195j = -1;
    public int f18196k = -1;

    public static int a(int[] iArr, int i7) {
        if (i7 >= 0 && i7 < iArr.length) {
            return iArr[i7];
        }
        return iArr[0];
    }

    public static int c(int i7, int i10) {
        return (i7 & 16777215) | ((i10 * 17) << 24);
    }

    public final void b(f fVar, boolean z10, Rect rect, int[] iArr) {
        int i7;
        int i10;
        int width = rect.width();
        int height = rect.height();
        int i11 = !z10 ? 1 : 0;
        int i12 = i11 * width;
        while (true) {
            int i13 = 0;
            do {
                int i14 = 0;
                for (int i15 = 1; i14 < i15 && i15 <= 64; i15 <<= 2) {
                    if (fVar.b() < 4) {
                        i7 = -1;
                        i10 = 0;
                        break;
                    }
                    i14 = (i14 << 4) | fVar.j(4);
                }
                i7 = i14 & 3;
                if (i14 < 4) {
                    i10 = width;
                } else {
                    i10 = i14 >> 2;
                }
                int min = Math.min(i10, width - i13);
                if (min > 0) {
                    int i16 = i12 + min;
                    Arrays.fill(iArr, i12, i16, this.f18188a[i7]);
                    i13 += min;
                    i12 = i16;
                    continue;
                }
            } while (i13 < width);
            i11 += 2;
            if (i11 >= height) {
                return;
            }
            i12 = i11 * width;
            fVar.c();
        }
    }
}
