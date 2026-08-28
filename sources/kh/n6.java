package kh;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.Utilities;
public final class n6 implements Runnable {
    public final int f15751a = 0;
    public final int f15752b;
    public final int f15753c;
    public final int d;
    public final Object f15754e;
    public final Object f15755f;

    public n6(int i9, int i10, int i11, Bitmap[] bitmapArr, Utilities.Callback callback) {
        this.f15752b = i9;
        this.f15753c = i10;
        this.d = i11;
        this.f15754e = bitmapArr;
        this.f15755f = callback;
    }

    @Override
    public final void run() {
        switch (this.f15751a) {
            case 0:
                Bitmap[] bitmapArr = (Bitmap[]) this.f15754e;
                Utilities.Callback callback = (Utilities.Callback) this.f15755f;
                Bitmap createBitmap = Bitmap.createBitmap(this.f15752b, this.f15753c, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                Path path = new Path();
                RectF rectF = new RectF();
                rectF.set(0.0f, 0.0f, createBitmap.getWidth(), createBitmap.getHeight());
                float f10 = this.d;
                path.addRoundRect(rectF, f10, f10, Path.Direction.CW);
                canvas.clipPath(path);
                for (int i9 = 0; i9 < bitmapArr.length; i9++) {
                    if (bitmapArr[i9] != null) {
                        canvas.save();
                        canvas.translate(createBitmap.getWidth() / 2.0f, createBitmap.getHeight() / 2.0f);
                        float max = Math.max(createBitmap.getWidth() / bitmapArr[i9].getWidth(), createBitmap.getHeight() / bitmapArr[i9].getHeight());
                        canvas.scale(max, max);
                        canvas.translate((-bitmapArr[i9].getWidth()) / 2.0f, (-bitmapArr[i9].getHeight()) / 2.0f);
                        canvas.drawBitmap(bitmapArr[i9], 0.0f, 0.0f, (Paint) null);
                        canvas.restore();
                        AndroidUtilities.recycleBitmap(bitmapArr[i9]);
                    }
                }
                Utilities.stackBlurBitmap(createBitmap, 1);
                AndroidUtilities.runOnUIThread(new ih.j7(17, callback, createBitmap));
                return;
            default:
                ((MessagesStorage) this.f15754e).lambda$getDialogs$240(this.f15752b, this.f15753c, this.d, (long[]) this.f15755f);
                return;
        }
    }

    public n6(MessagesStorage messagesStorage, int i9, int i10, int i11, long[] jArr) {
        this.f15754e = messagesStorage;
        this.f15752b = i9;
        this.f15753c = i10;
        this.d = i11;
        this.f15755f = jArr;
    }
}
