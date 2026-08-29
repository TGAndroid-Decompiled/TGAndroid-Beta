package nh;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.Utilities;
public final class z5 implements Runnable {
    public final int f18959a = 0;
    public final int f18960b;
    public final int f18961c;
    public final int d;
    public final Object f18962e;
    public final Object f18963f;

    public z5(int i10, int i11, int i12, Bitmap[] bitmapArr, Utilities.Callback callback) {
        this.f18960b = i10;
        this.f18961c = i11;
        this.d = i12;
        this.f18962e = bitmapArr;
        this.f18963f = callback;
    }

    @Override
    public final void run() {
        switch (this.f18959a) {
            case 0:
                Bitmap[] bitmapArr = (Bitmap[]) this.f18962e;
                Utilities.Callback callback = (Utilities.Callback) this.f18963f;
                Bitmap createBitmap = Bitmap.createBitmap(this.f18960b, this.f18961c, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                Path path = new Path();
                RectF rectF = new RectF();
                rectF.set(0.0f, 0.0f, createBitmap.getWidth(), createBitmap.getHeight());
                float f9 = this.d;
                path.addRoundRect(rectF, f9, f9, Path.Direction.CW);
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
                AndroidUtilities.runOnUIThread(new b6(0, callback, createBitmap));
                return;
            default:
                ((MessagesStorage) this.f18962e).lambda$getDialogs$240(this.f18960b, this.f18961c, this.d, (long[]) this.f18963f);
                return;
        }
    }

    public z5(MessagesStorage messagesStorage, int i10, int i11, int i12, long[] jArr) {
        this.f18962e = messagesStorage;
        this.f18960b = i10;
        this.f18961c = i11;
        this.d = i12;
        this.f18963f = jArr;
    }
}
