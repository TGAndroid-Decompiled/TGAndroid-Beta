package hi;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import java.io.Serializable;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.tr;
import org.telegram.messenger.x10;
import org.telegram.tgnet.ConnectionsManager;
public final class s5 implements Runnable {
    public final int f15378a;
    public final int f15379b;
    public final int f15380c;
    public final int d;
    public final Object f15381e;
    public final Object f15382f;

    public s5(int i7, int i10, int i11, Serializable serializable, Object obj, int i12) {
        this.f15378a = i12;
        this.f15379b = i7;
        this.f15380c = i10;
        this.d = i11;
        this.f15381e = serializable;
        this.f15382f = obj;
    }

    @Override
    public final void run() {
        switch (this.f15378a) {
            case 0:
                Bitmap[] bitmapArr = (Bitmap[]) this.f15381e;
                x10 x10Var = (x10) this.f15382f;
                Bitmap createBitmap = Bitmap.createBitmap(this.f15379b, this.f15380c, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                Path path = new Path();
                RectF rectF = new RectF();
                rectF.set(0.0f, 0.0f, createBitmap.getWidth(), createBitmap.getHeight());
                float f10 = this.d;
                path.addRoundRect(rectF, f10, f10, Path.Direction.CW);
                canvas.clipPath(path);
                for (int i7 = 0; i7 < bitmapArr.length; i7++) {
                    if (bitmapArr[i7] != null) {
                        canvas.save();
                        canvas.translate(createBitmap.getWidth() / 2.0f, createBitmap.getHeight() / 2.0f);
                        float max = Math.max(createBitmap.getWidth() / bitmapArr[i7].getWidth(), createBitmap.getHeight() / bitmapArr[i7].getHeight());
                        canvas.scale(max, max);
                        canvas.translate((-bitmapArr[i7].getWidth()) / 2.0f, (-bitmapArr[i7].getHeight()) / 2.0f);
                        canvas.drawBitmap(bitmapArr[i7], 0.0f, 0.0f, (Paint) null);
                        canvas.restore();
                        org.telegram.messenger.g0.z2(bitmapArr[i7]);
                    }
                }
                Utilities.stackBlurBitmap(createBitmap, 1);
                org.telegram.messenger.g0.g3(new r1(4, x10Var, createBitmap));
                return;
            case 1:
                ((tr) this.f15381e).B0(this.f15379b, this.f15380c, this.d, (long[]) this.f15382f);
                return;
            default:
                ConnectionsManager.lambda$onCaptchaCheck$28(this.f15379b, this.f15380c, this.d, (String) this.f15381e, (String) this.f15382f);
                return;
        }
    }

    public s5(tr trVar, int i7, int i10, int i11, long[] jArr) {
        this.f15378a = 1;
        this.f15381e = trVar;
        this.f15379b = i7;
        this.f15380c = i10;
        this.d = i11;
        this.f15382f = jArr;
    }
}
