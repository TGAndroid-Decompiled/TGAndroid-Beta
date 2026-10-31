package org.telegram.messenger;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
public final class ur implements Runnable {
    public final int f18388a = 1;
    public final int f18389b;
    public final int f18390c;
    public final int d;
    public final Object e;
    public final Object f18391f;

    public ur(int i10, int i11, int i12, Bitmap[] bitmapArr, q20 q20Var) {
        this.f18389b = i10;
        this.f18390c = i11;
        this.d = i12;
        this.e = bitmapArr;
        this.f18391f = q20Var;
    }

    @Override
    public final void run() {
        switch (this.f18388a) {
            case 0:
                ((hs) this.e).B0(this.f18389b, this.f18390c, this.d, (long[]) this.f18391f);
                return;
            default:
                Bitmap[] bitmapArr = (Bitmap[]) this.e;
                q20 q20Var = (q20) this.f18391f;
                Bitmap createBitmap = Bitmap.createBitmap(this.f18389b, this.f18390c, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                Path path = new Path();
                RectF rectF = new RectF();
                rectF.set(0.0f, 0.0f, createBitmap.getWidth(), createBitmap.getHeight());
                float f7 = this.d;
                path.addRoundRect(rectF, f7, f7, Path.Direction.CW);
                canvas.clipPath(path);
                for (int i10 = 0; i10 < bitmapArr.length; i10++) {
                    if (bitmapArr[i10] != null) {
                        canvas.save();
                        canvas.translate(createBitmap.getWidth() / 2.0f, createBitmap.getHeight() / 2.0f);
                        float max = Math.max(createBitmap.getWidth() / bitmapArr[i10].getWidth(), createBitmap.getHeight() / bitmapArr[i10].getHeight());
                        canvas.scale(max, max);
                        canvas.translate((-bitmapArr[i10].getWidth()) / 2.0f, (-bitmapArr[i10].getHeight()) / 2.0f);
                        canvas.drawBitmap(bitmapArr[i10], 0.0f, 0.0f, (Paint) null);
                        canvas.restore();
                        i0.z2(bitmapArr[i10]);
                    }
                }
                Utilities.stackBlurBitmap(createBitmap, 1);
                i0.g3(new vh.d1(4, q20Var, createBitmap));
                return;
        }
    }

    public ur(hs hsVar, int i10, int i11, int i12, long[] jArr) {
        this.e = hsVar;
        this.f18389b = i10;
        this.f18390c = i11;
        this.d = i12;
        this.f18391f = jArr;
    }
}
