package li;

import android.content.Context;
import android.opengl.GLES20;
import java.util.Arrays;
import org.telegram.ui.Wallet.h5;
public final class r {
    public int f15645a;
    public int[] f15646b;

    public r(Context context, String str) {
        int[] iArr = new int[2];
        this.f15646b = iArr;
        j6.l lVar = new j6.l(context, str);
        this.f15645a = lVar.f14060a;
        GLES20.glGenBuffers(2, iArr, 0);
        h5.a((float[]) lVar.d, iArr[0]);
        h5.a((float[]) lVar.f14061b, iArr[1]);
    }

    public void a(int i10, int i11, int i12) {
        if (i12 != 0 && i10 < i11) {
            int i13 = this.f15645a;
            if (i13 >= 3) {
                int[] iArr = this.f15646b;
                if (iArr[i13 - 1] == i12 && iArr[i13 - 2] == i10) {
                    iArr[i13 - 2] = i11;
                    return;
                }
            }
            int i14 = i13 + 3;
            int[] iArr2 = this.f15646b;
            if (i14 > iArr2.length) {
                this.f15646b = Arrays.copyOf(iArr2, iArr2.length * 2);
            }
            int[] iArr3 = this.f15646b;
            int i15 = this.f15645a;
            int i16 = i15 + 1;
            this.f15645a = i16;
            iArr3[i15] = i10;
            int i17 = i15 + 2;
            this.f15645a = i17;
            iArr3[i16] = i11;
            this.f15645a = i15 + 3;
            iArr3[i17] = i12;
        }
    }
}
