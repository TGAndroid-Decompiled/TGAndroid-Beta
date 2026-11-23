package hi;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import java.io.Serializable;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.tr;
import org.telegram.messenger.w10;
import org.telegram.tgnet.ConnectionsManager;
public final class c6 implements Runnable {
    public final int f14270a;
    public final int f14271b;
    public final int f14272c;
    public final int d;
    public final Object f14273e;
    public final Object f14274f;

    public c6(int i7, int i10, int i11, Serializable serializable, Object obj, int i12) {
        this.f14270a = i12;
        this.f14271b = i7;
        this.f14272c = i10;
        this.d = i11;
        this.f14273e = serializable;
        this.f14274f = obj;
    }

    @Override
    public final void run() {
        switch (this.f14270a) {
            case 0:
                Bitmap[] bitmapArr = (Bitmap[]) this.f14273e;
                w10 w10Var = (w10) this.f14274f;
                Bitmap createBitmap = Bitmap.createBitmap(this.f14271b, this.f14272c, Bitmap.Config.ARGB_8888);
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
                org.telegram.messenger.g0.g3(new c(7, w10Var, createBitmap));
                return;
            case 1:
                ((tr) this.f14273e).B0(this.f14271b, this.f14272c, this.d, (long[]) this.f14274f);
                return;
            default:
                ConnectionsManager.lambda$onCaptchaCheck$28(this.f14271b, this.f14272c, this.d, (String) this.f14273e, (String) this.f14274f);
                return;
        }
    }

    public c6(tr trVar, int i7, int i10, int i11, long[] jArr) {
        this.f14270a = 1;
        this.f14273e = trVar;
        this.f14271b = i7;
        this.f14272c = i10;
        this.d = i11;
        this.f14274f = jArr;
    }
}
