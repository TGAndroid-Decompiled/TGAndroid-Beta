package org.telegram.messenger;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import org.telegram.messenger.Utilities;
import org.telegram.ui.kg1;
public final class tg implements Runnable {
    public final int f18515a = 1;
    public final int f18516b;
    public final int f18517c;
    public final int d;
    public final Object e;
    public final Object f18518f;

    public tg(int i10, int i11, int i12, Bitmap[] bitmapArr, Utilities.Callback callback) {
        this.f18516b = i10;
        this.f18517c = i11;
        this.d = i12;
        this.e = bitmapArr;
        this.f18518f = callback;
    }

    @Override
    public final void run() {
        switch (this.f18515a) {
            case 0:
                ((MessagesStorage) this.e).lambda$getDialogs$240(this.f18516b, this.f18517c, this.d, (long[]) this.f18518f);
                return;
            default:
                Bitmap[] bitmapArr = (Bitmap[]) this.e;
                Utilities.Callback callback = (Utilities.Callback) this.f18518f;
                Bitmap createBitmap = Bitmap.createBitmap(this.f18516b, this.f18517c, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                Path path = new Path();
                RectF rectF = new RectF();
                rectF.set(0.0f, 0.0f, createBitmap.getWidth(), createBitmap.getHeight());
                float f10 = this.d;
                path.addRoundRect(rectF, f10, f10, Path.Direction.CW);
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
                        AndroidUtilities.recycleBitmap(bitmapArr[i10]);
                    }
                }
                Utilities.stackBlurBitmap(createBitmap, 1);
                AndroidUtilities.runOnUIThread(new kg1(23, callback, createBitmap));
                return;
        }
    }

    public tg(MessagesStorage messagesStorage, int i10, int i11, int i12, long[] jArr) {
        this.e = messagesStorage;
        this.f18516b = i10;
        this.f18517c = i11;
        this.d = i12;
        this.f18518f = jArr;
    }
}
