package defpackage;

import android.graphics.Bitmap;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Paint;
import java.nio.ByteBuffer;
public final class mw8 implements Runnable {
    public final byte a;
    public final vw8 b;
    public final int c;

    public mw8(vw8 vw8Var, int i, byte b) {
        this.a = b;
        this.b = vw8Var;
        this.c = i;
    }

    @Override
    public final void run() {
        float L;
        byte[] bArr;
        switch (this.a) {
            case 0:
                vw8 vw8Var = this.b;
                int i = this.c;
                synchronized (vw8.class) {
                    if (vw8.M9 != null) {
                        bArr = vw8.M9;
                    } else {
                        float L2 = gl.L(30.0f) / 4.0f;
                        int ceil = (int) Math.ceil(3.0f * L);
                        int ceil2 = ((int) Math.ceil(L2)) + ceil + 1;
                        int i2 = (ceil2 << 1) + 2;
                        Bitmap createBitmap = Bitmap.createBitmap(i2, i2, Bitmap.Config.ARGB_8888);
                        Paint paint = new Paint(1);
                        paint.setMaskFilter(new BlurMaskFilter(oo1.f(((gl.L(24.0f) * 0.57735f) + 0.5f) / 4.0f, 0.5f, 0.57735f, 0.1f), BlurMaskFilter.Blur.NORMAL));
                        float f = ceil;
                        float f2 = i2 - ceil;
                        new Canvas(createBitmap).drawRoundRect(f, f, f2, f2, L2, L2, paint);
                        Bitmap extractAlpha = createBitmap.extractAlpha();
                        createBitmap.recycle();
                        int rowBytes = extractAlpha.getRowBytes();
                        byte[] bArr2 = new byte[rowBytes * i2];
                        byte[] bArr3 = new byte[i2 * i2];
                        extractAlpha.copyPixelsToBuffer(ByteBuffer.wrap(bArr2));
                        extractAlpha.recycle();
                        for (int i3 = 0; i3 < i2; i3++) {
                            System.arraycopy(bArr2, i3 * rowBytes, bArr3, i3 * i2, i2);
                        }
                        vw8.N9 = i2;
                        vw8.O9 = ceil;
                        vw8.P9 = ceil2;
                        vw8.M9 = bArr3;
                        bArr = bArr3;
                    }
                }
                int i4 = vw8.N9;
                Bitmap createBitmap2 = Bitmap.createBitmap(i4, i4, Bitmap.Config.ARGB_8888);
                int[] iArr = new int[i4 * i4];
                vw8.s(iArr, bArr, i);
                createBitmap2.setPixels(iArr, 0, i4, 0, 0, i4, i4);
                createBitmap2.prepareToDraw();
                gl.d3(new q76(vw8Var, createBitmap2, iArr, i, (byte) 21));
                return;
            case 1:
                this.b.F0(this.c);
                return;
            default:
                this.b.F0(this.c);
                return;
        }
    }
}
