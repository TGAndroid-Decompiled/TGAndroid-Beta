package org.telegram.messenger;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import org.telegram.ui.Stories.StoryViewer$5$$ExternalSyntheticLambda0;

public final class MessagesStorage$$ExternalSyntheticLambda6 implements Runnable {
    public final int $r8$classId = 1;
    public final Object f$0;
    public final int f$1;
    public final int f$2;
    public final int f$3;
    public final Object f$4;

    public MessagesStorage$$ExternalSyntheticLambda6(int i, int i2, int i3, Bitmap[] bitmapArr, Utilities.Callback callback) {
        this.f$1 = i;
        this.f$2 = i2;
        this.f$3 = i3;
        this.f$0 = bitmapArr;
        this.f$4 = callback;
    }

    @Override
    public final void run() throws Throwable {
        switch (this.$r8$classId) {
            case 0:
                ((MessagesStorage) this.f$0).lambda$getDialogs$240(this.f$1, this.f$2, this.f$3, (long[]) this.f$4);
                break;
            default:
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(this.f$1, this.f$2, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(bitmapCreateBitmap);
                Path path = new Path();
                RectF rectF = new RectF();
                rectF.set(0.0f, 0.0f, bitmapCreateBitmap.getWidth(), bitmapCreateBitmap.getHeight());
                float f = this.f$3;
                path.addRoundRect(rectF, f, f, Path.Direction.CW);
                canvas.clipPath(path);
                int i = 0;
                while (true) {
                    Bitmap[] bitmapArr = (Bitmap[]) this.f$0;
                    if (i >= bitmapArr.length) {
                        Utilities.stackBlurBitmap(bitmapCreateBitmap, 1);
                        AndroidUtilities.runOnUIThread(new StoryViewer$5$$ExternalSyntheticLambda0(23, (Utilities.Callback) this.f$4, bitmapCreateBitmap));
                    } else {
                        if (bitmapArr[i] != null) {
                            canvas.save();
                            canvas.translate(bitmapCreateBitmap.getWidth() / 2.0f, bitmapCreateBitmap.getHeight() / 2.0f);
                            float fMax = Math.max(bitmapCreateBitmap.getWidth() / bitmapArr[i].getWidth(), bitmapCreateBitmap.getHeight() / bitmapArr[i].getHeight());
                            canvas.scale(fMax, fMax);
                            canvas.translate((-bitmapArr[i].getWidth()) / 2.0f, (-bitmapArr[i].getHeight()) / 2.0f);
                            canvas.drawBitmap(bitmapArr[i], 0.0f, 0.0f, (Paint) null);
                            canvas.restore();
                            AndroidUtilities.recycleBitmap(bitmapArr[i]);
                        }
                        i++;
                    }
                    break;
                }
                break;
        }
    }

    public MessagesStorage$$ExternalSyntheticLambda6(MessagesStorage messagesStorage, int i, int i2, int i3, long[] jArr) {
        this.f$0 = messagesStorage;
        this.f$1 = i;
        this.f$2 = i2;
        this.f$3 = i3;
        this.f$4 = jArr;
    }
}
