package ci;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.Utilities;
public final class x6 implements Runnable {
    public final int f6293a = 0;
    public final int f6294b;
    public final int f6295c;
    public final int d;
    public final Object f6296e;
    public final Object f6297f;

    public x6(int i10, int i11, int i12, Bitmap[] bitmapArr, Utilities.Callback callback) {
        this.f6294b = i10;
        this.f6295c = i11;
        this.d = i12;
        this.f6296e = bitmapArr;
        this.f6297f = callback;
    }

    @Override
    public final void run() {
        switch (this.f6293a) {
            case 0:
                Bitmap[] bitmapArr = (Bitmap[]) this.f6296e;
                Utilities.Callback callback = (Utilities.Callback) this.f6297f;
                Bitmap createBitmap = Bitmap.createBitmap(this.f6294b, this.f6295c, Bitmap.Config.ARGB_8888);
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
                AndroidUtilities.runOnUIThread(new ai.ba(19, callback, createBitmap));
                return;
            default:
                ((MessagesStorage) this.f6296e).lambda$getDialogs$240(this.f6294b, this.f6295c, this.d, (long[]) this.f6297f);
                return;
        }
    }

    public x6(MessagesStorage messagesStorage, int i10, int i11, int i12, long[] jArr) {
        this.f6296e = messagesStorage;
        this.f6294b = i10;
        this.f6295c = i11;
        this.d = i12;
        this.f6297f = jArr;
    }
}
