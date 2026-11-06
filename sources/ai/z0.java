package ai;

import android.graphics.Bitmap;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Paint;
import java.nio.ByteBuffer;
public final class z0 implements Runnable {
    public final int f1714a;
    public final l1 f1715b;
    public final int f1716c;

    public z0(l1 l1Var, int i7, int i10) {
        this.f1714a = i10;
        this.f1715b = l1Var;
        this.f1716c = i7;
    }

    @Override
    public final void run() {
        byte[] bArr;
        switch (this.f1714a) {
            case 0:
                l1 l1Var = this.f1715b;
                int i7 = this.f1716c;
                synchronized (l1.class) {
                    if (l1.N9 != null) {
                        bArr = l1.N9;
                    } else {
                        float y10 = com.google.android.recaptcha.internal.a.y(org.telegram.messenger.g0.L(24.0f), 0.57735f, 0.5f, 4.0f);
                        float L = org.telegram.messenger.g0.L(30.0f) / 4.0f;
                        int ceil = (int) Math.ceil(3.0f * y10);
                        int ceil2 = ((int) Math.ceil(L)) + ceil + 1;
                        int i10 = (ceil2 * 2) + 2;
                        Bitmap createBitmap = Bitmap.createBitmap(i10, i10, Bitmap.Config.ARGB_8888);
                        Paint paint = new Paint(1);
                        paint.setMaskFilter(new BlurMaskFilter(Math.max(0.1f, (y10 - 0.5f) / 0.57735f), BlurMaskFilter.Blur.NORMAL));
                        float f10 = ceil;
                        float f11 = i10 - ceil;
                        new Canvas(createBitmap).drawRoundRect(f10, f10, f11, f11, L, L, paint);
                        Bitmap extractAlpha = createBitmap.extractAlpha();
                        createBitmap.recycle();
                        int rowBytes = extractAlpha.getRowBytes();
                        byte[] bArr2 = new byte[rowBytes * i10];
                        byte[] bArr3 = new byte[i10 * i10];
                        extractAlpha.copyPixelsToBuffer(ByteBuffer.wrap(bArr2));
                        extractAlpha.recycle();
                        for (int i11 = 0; i11 < i10; i11++) {
                            System.arraycopy(bArr2, i11 * rowBytes, bArr3, i11 * i10, i10);
                        }
                        l1.O9 = i10;
                        l1.P9 = ceil;
                        l1.Q9 = ceil2;
                        l1.N9 = bArr3;
                        bArr = bArr3;
                    }
                }
                int i12 = l1.O9;
                Bitmap createBitmap2 = Bitmap.createBitmap(i12, i12, Bitmap.Config.ARGB_8888);
                int[] iArr = new int[i12 * i12];
                l1.s(iArr, bArr, i7);
                createBitmap2.setPixels(iArr, 0, i12, 0, 0, i12, i12);
                createBitmap2.prepareToDraw();
                org.telegram.messenger.g0.h3(new a1(l1Var, createBitmap2, iArr, i7, 1));
                return;
            case 1:
                this.f1715b.F0(this.f1716c);
                return;
            default:
                this.f1715b.F0(this.f1716c);
                return;
        }
    }
}
