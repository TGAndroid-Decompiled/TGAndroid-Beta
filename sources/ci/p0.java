package ci;

import android.graphics.Bitmap;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Paint;
import com.google.android.gms.internal.vision.e2;
import java.nio.ByteBuffer;
public final class p0 implements Runnable {
    public final int f5737a;
    public final z0 f5738b;
    public final int f5739c;

    public p0(z0 z0Var, int i7, int i10) {
        this.f5737a = i10;
        this.f5738b = z0Var;
        this.f5739c = i7;
    }

    @Override
    public final void run() {
        byte[] bArr;
        switch (this.f5737a) {
            case 0:
                z0 z0Var = this.f5738b;
                int i7 = this.f5739c;
                synchronized (z0.class) {
                    if (z0.O9 != null) {
                        bArr = z0.O9;
                    } else {
                        float y10 = e2.y(org.telegram.messenger.g0.L(24.0f), 0.57735f, 0.5f, 4.0f);
                        float L = org.telegram.messenger.g0.L(30.0f) / 4.0f;
                        int ceil = (int) Math.ceil(3.0f * y10);
                        int ceil2 = ((int) Math.ceil(L)) + ceil + 1;
                        int i10 = (ceil2 * 2) + 2;
                        Bitmap createBitmap = Bitmap.createBitmap(i10, i10, Bitmap.Config.ARGB_8888);
                        Paint paint = new Paint(1);
                        paint.setMaskFilter(new BlurMaskFilter(org.telegram.ui.Cells.c0.x(y10, 0.5f, 0.57735f, 0.1f), BlurMaskFilter.Blur.NORMAL));
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
                        z0.P9 = i10;
                        z0.Q9 = ceil;
                        z0.R9 = ceil2;
                        z0.O9 = bArr3;
                        bArr = bArr3;
                    }
                }
                int i12 = z0.P9;
                Bitmap createBitmap2 = Bitmap.createBitmap(i12, i12, Bitmap.Config.ARGB_8888);
                int[] iArr = new int[i12 * i12];
                z0.s(iArr, bArr, i7);
                createBitmap2.setPixels(iArr, 0, i12, 0, 0, i12, i12);
                createBitmap2.prepareToDraw();
                org.telegram.messenger.g0.g3(new ai.w0(z0Var, createBitmap2, iArr, i7, 3));
                return;
            case 1:
                this.f5738b.F0(this.f5739c);
                return;
            default:
                this.f5738b.F0(this.f5739c);
                return;
        }
    }
}
