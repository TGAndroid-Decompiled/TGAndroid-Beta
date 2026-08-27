package h7;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.NinePatchDrawable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import org.telegram.messenger.ApplicationLoader;

public abstract class l6 {
    public static NinePatchDrawable a(Bitmap bitmap, Rect rect, int i10, int i11) {
        if (bitmap == null) {
            throw new IllegalArgumentException("bitmap == null");
        }
        if (bitmap.isRecycled()) {
            throw new IllegalArgumentException("bitmap is recycled");
        }
        if (i10 >= 0 && i10 < bitmap.getWidth() && i11 >= 0 && i11 < bitmap.getHeight()) {
            return new NinePatchDrawable(ApplicationLoader.applicationContext.getResources(), bitmap, c(i10, i10 + 1, i11, i11 + 1, rect.left, rect.top, rect.right, rect.bottom, bitmap.getPixel(i10, i11)).array(), rect, null);
        }
        StringBuilder sbP = com.google.android.recaptcha.internal.a.p("center pixel is outside bitmap: (", i10, ", ", i11, ") for ");
        sbP.append(bitmap.getWidth());
        sbP.append("x");
        sbP.append(bitmap.getHeight());
        throw new IllegalArgumentException(sbP.toString());
    }

    public static NinePatchDrawable b(Bitmap[] bitmapArr, float[] fArr, float f10, float f11, int i10, pg.e eVar) {
        float f12;
        char c10;
        Bitmap bitmapCreateBitmap;
        if (fArr == null || fArr.length != 8) {
            throw new IllegalArgumentException("radii must have 8 values: TLx,TLy, TRx,TRy, BRx,BRy, BLx,BLy");
        }
        float fMax = Math.max(0.0f, fArr[0]);
        float fMax2 = Math.max(0.0f, fArr[1]);
        float fMax3 = Math.max(0.0f, fArr[2]);
        float fMax4 = Math.max(0.0f, fArr[3]);
        float fMax5 = Math.max(0.0f, fArr[4]);
        float fMax6 = Math.max(0.0f, fArr[5]);
        float fMax7 = Math.max(0.0f, fArr[6]);
        float fMax8 = Math.max(0.0f, fArr[7]);
        int iCeil = (int) Math.ceil(f10 * 2.0f);
        int iCeil2 = iCeil + ((int) Math.ceil(Math.max(0.0f, -0.0f)));
        int iCeil3 = iCeil + ((int) Math.ceil(Math.max(0.0f, 0.0f)));
        int iCeil4 = iCeil + ((int) Math.ceil(Math.max(0.0f, -f11)));
        int iCeil5 = iCeil + ((int) Math.ceil(Math.max(0.0f, f11)));
        float fMax9 = Math.max(fMax + fMax3, fMax7 + fMax5);
        float fMax10 = Math.max(fMax2 + fMax8, fMax4 + fMax6);
        int iCeil6 = ((int) Math.ceil(fMax9 + 2.0f)) + iCeil2;
        int i11 = iCeil6 + iCeil3;
        int iCeil7 = ((int) Math.ceil(fMax10 + 2.0f)) + iCeil4;
        int i12 = iCeil7 + iCeil5;
        boolean z10 = bitmapArr != null && bitmapArr.length == 1;
        if (z10) {
            c10 = 1;
            bitmapCreateBitmap = bitmapArr[0];
            if (bitmapCreateBitmap != null && !bitmapCreateBitmap.isRecycled() && bitmapCreateBitmap.isMutable() && bitmapCreateBitmap.getWidth() == i11 && bitmapCreateBitmap.getHeight() == i12) {
                f12 = fMax5;
                if (bitmapCreateBitmap.getConfig() == Bitmap.Config.ARGB_8888) {
                    bitmapCreateBitmap.eraseColor(0);
                    i12 = i12;
                }
                if (bitmapCreateBitmap == null) {
                    bitmapCreateBitmap = Bitmap.createBitmap(i11, i12, Bitmap.Config.ARGB_8888);
                }
                if (z10) {
                    bitmapArr[0] = bitmapCreateBitmap;
                }
                Canvas canvas = new Canvas(bitmapCreateBitmap);
                int i13 = i12;
                RectF rectF = new RectF(iCeil2, iCeil4, iCeil6, iCeil7);
                float[] fArr2 = new float[8];
                fArr2[0] = fMax;
                fArr2[c10] = fMax2;
                fArr2[2] = fMax3;
                fArr2[3] = fMax4;
                fArr2[4] = f12;
                fArr2[5] = fMax6;
                fArr2[6] = fMax7;
                fArr2[7] = fMax8;
                eVar.a(canvas, rectF, fArr2);
                float fMax11 = Math.max(fMax, fMax7);
                float fMax12 = Math.max(fMax3, f12);
                float fMax13 = Math.max(fMax2, fMax4);
                float fMax14 = Math.max(fMax8, fMax6);
                int iB = n.b(((int) Math.ceil(fMax11)) + iCeil2, 1, i11 - 2);
                int iB2 = n.b((i11 - iCeil3) - ((int) Math.ceil(fMax12)), iB + 1, i11 - 1);
                int iB3 = n.b(((int) Math.ceil(fMax13)) + iCeil4, 1, i13 - 2);
                return new NinePatchDrawable(ApplicationLoader.applicationContext.getResources(), bitmapCreateBitmap, c(iB, iB2, iB3, n.b((i13 - iCeil5) - ((int) Math.ceil(fMax14)), iB3 + 1, i13 - 1), iCeil2, iCeil4, iCeil3, iCeil5, i10).array(), new Rect(iCeil2, iCeil4, iCeil3, iCeil5), null);
            }
            f12 = fMax5;
        } else {
            f12 = fMax5;
            c10 = 1;
        }
        bitmapCreateBitmap = null;
        if (bitmapCreateBitmap == null) {
            bitmapCreateBitmap = Bitmap.createBitmap(i11, i12, Bitmap.Config.ARGB_8888);
        }
        if (z10) {
            bitmapArr[0] = bitmapCreateBitmap;
        }
        Canvas canvas2 = new Canvas(bitmapCreateBitmap);
        int i14 = i12;
        RectF rectF2 = new RectF(iCeil2, iCeil4, iCeil6, iCeil7);
        float[] fArr3 = new float[8];
        fArr3[0] = fMax;
        fArr3[c10] = fMax2;
        fArr3[2] = fMax3;
        fArr3[3] = fMax4;
        fArr3[4] = f12;
        fArr3[5] = fMax6;
        fArr3[6] = fMax7;
        fArr3[7] = fMax8;
        eVar.a(canvas2, rectF2, fArr3);
        float fMax15 = Math.max(fMax, fMax7);
        float fMax16 = Math.max(fMax3, f12);
        float fMax17 = Math.max(fMax2, fMax4);
        float fMax18 = Math.max(fMax8, fMax6);
        int iB4 = n.b(((int) Math.ceil(fMax15)) + iCeil2, 1, i11 - 2);
        int iB5 = n.b((i11 - iCeil3) - ((int) Math.ceil(fMax16)), iB4 + 1, i11 - 1);
        int iB6 = n.b(((int) Math.ceil(fMax17)) + iCeil4, 1, i14 - 2);
        return new NinePatchDrawable(ApplicationLoader.applicationContext.getResources(), bitmapCreateBitmap, c(iB4, iB5, iB6, n.b((i14 - iCeil5) - ((int) Math.ceil(fMax18)), iB6 + 1, i14 - 1), iCeil2, iCeil4, iCeil3, iCeil5, i10).array(), new Rect(iCeil2, iCeil4, iCeil3, iCeil5), null);
    }

    public static ByteBuffer c(int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
        ByteBuffer byteBufferOrder = ByteBuffer.allocate(84).order(ByteOrder.nativeOrder());
        byteBufferOrder.put((byte) 1);
        byteBufferOrder.put((byte) 2);
        byteBufferOrder.put((byte) 2);
        byteBufferOrder.put((byte) 9);
        byteBufferOrder.putInt(0);
        byteBufferOrder.putInt(0);
        byteBufferOrder.putInt(i14);
        byteBufferOrder.putInt(i16);
        byteBufferOrder.putInt(i15);
        byteBufferOrder.putInt(i17);
        byteBufferOrder.putInt(0);
        byteBufferOrder.putInt(i10);
        byteBufferOrder.putInt(i11);
        byteBufferOrder.putInt(i12);
        byteBufferOrder.putInt(i13);
        byteBufferOrder.putInt(1);
        byteBufferOrder.putInt(1);
        byteBufferOrder.putInt(1);
        byteBufferOrder.putInt(1);
        byteBufferOrder.putInt(i18);
        byteBufferOrder.putInt(1);
        byteBufferOrder.putInt(1);
        byteBufferOrder.putInt(1);
        byteBufferOrder.putInt(1);
        return byteBufferOrder;
    }
}
