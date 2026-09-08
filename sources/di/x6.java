package di;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.Utilities;
public final class x6 implements Runnable {
    public final int f8416a = 0;
    public final int f8417b;
    public final int f8418c;
    public final int d;
    public final Object f8419e;
    public final Object f8420f;

    public x6(int i10, int i11, int i12, Bitmap[] bitmapArr, Utilities.Callback callback) {
        this.f8417b = i10;
        this.f8418c = i11;
        this.d = i12;
        this.f8419e = bitmapArr;
        this.f8420f = callback;
    }

    @Override
    public final void run() {
        switch (this.f8416a) {
            case 0:
                Bitmap[] bitmapArr = (Bitmap[]) this.f8419e;
                Utilities.Callback callback = (Utilities.Callback) this.f8420f;
                Bitmap createBitmap = Bitmap.createBitmap(this.f8417b, this.f8418c, Bitmap.Config.ARGB_8888);
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
                        AndroidUtilities.recycleBitmap(bitmapArr[i10]);
                    }
                }
                Utilities.stackBlurBitmap(createBitmap, 1);
                AndroidUtilities.runOnUIThread(new bi.s8(28, callback, createBitmap));
                return;
            default:
                ((MessagesStorage) this.f8419e).lambda$getDialogs$240(this.f8417b, this.f8418c, this.d, (long[]) this.f8420f);
                return;
        }
    }

    public x6(MessagesStorage messagesStorage, int i10, int i11, int i12, long[] jArr) {
        this.f8419e = messagesStorage;
        this.f8417b = i10;
        this.f8418c = i11;
        this.d = i12;
        this.f8420f = jArr;
    }
}
