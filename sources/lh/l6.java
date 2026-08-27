package lh;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.Utilities;

public final class l6 implements Runnable {

    public final int f16313a = 0;

    public final int f16314b;

    public final int f16315c;
    public final int d;

    public final Object f16316e;

    public final Object f16317f;

    public l6(int i10, int i11, int i12, Bitmap[] bitmapArr, Utilities.Callback callback) {
        this.f16314b = i10;
        this.f16315c = i11;
        this.d = i12;
        this.f16316e = bitmapArr;
        this.f16317f = callback;
    }

    @Override
    public final void run() throws Throwable {
        switch (this.f16313a) {
            case 0:
                Bitmap[] bitmapArr = (Bitmap[]) this.f16316e;
                Utilities.Callback callback = (Utilities.Callback) this.f16317f;
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(this.f16314b, this.f16315c, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(bitmapCreateBitmap);
                Path path = new Path();
                RectF rectF = new RectF();
                rectF.set(0.0f, 0.0f, bitmapCreateBitmap.getWidth(), bitmapCreateBitmap.getHeight());
                float f10 = this.d;
                path.addRoundRect(rectF, f10, f10, Path.Direction.CW);
                canvas.clipPath(path);
                for (int i10 = 0; i10 < bitmapArr.length; i10++) {
                    if (bitmapArr[i10] != null) {
                        canvas.save();
                        canvas.translate(bitmapCreateBitmap.getWidth() / 2.0f, bitmapCreateBitmap.getHeight() / 2.0f);
                        float fMax = Math.max(bitmapCreateBitmap.getWidth() / bitmapArr[i10].getWidth(), bitmapCreateBitmap.getHeight() / bitmapArr[i10].getHeight());
                        canvas.scale(fMax, fMax);
                        canvas.translate((-bitmapArr[i10].getWidth()) / 2.0f, (-bitmapArr[i10].getHeight()) / 2.0f);
                        canvas.drawBitmap(bitmapArr[i10], 0.0f, 0.0f, (Paint) null);
                        canvas.restore();
                        AndroidUtilities.recycleBitmap(bitmapArr[i10]);
                    }
                }
                Utilities.stackBlurBitmap(bitmapCreateBitmap, 1);
                AndroidUtilities.runOnUIThread(new jh.p6(23, callback, bitmapCreateBitmap));
                break;
            default:
                ((MessagesStorage) this.f16316e).lambda$getDialogs$240(this.f16314b, this.f16315c, this.d, (long[]) this.f16317f);
                break;
        }
    }

    public l6(MessagesStorage messagesStorage, int i10, int i11, int i12, long[] jArr) {
        this.f16316e = messagesStorage;
        this.f16314b = i10;
        this.f16315c = i11;
        this.d = i12;
        this.f16317f = jArr;
    }
}
