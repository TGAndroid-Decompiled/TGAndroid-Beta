package gi;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import java.io.Serializable;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.qr;
import org.telegram.messenger.u10;
import org.telegram.tgnet.ConnectionsManager;
public final class t5 implements Runnable {
    public final int f13613a;
    public final int f13614b;
    public final int f13615c;
    public final int d;
    public final Object f13616e;
    public final Object f13617f;

    public t5(int i3, int i10, int i11, Serializable serializable, Object obj, int i12) {
        this.f13613a = i12;
        this.f13614b = i3;
        this.f13615c = i10;
        this.d = i11;
        this.f13616e = serializable;
        this.f13617f = obj;
    }

    @Override
    public final void run() {
        switch (this.f13613a) {
            case 0:
                Bitmap[] bitmapArr = (Bitmap[]) this.f13616e;
                u10 u10Var = (u10) this.f13617f;
                Bitmap createBitmap = Bitmap.createBitmap(this.f13614b, this.f13615c, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                Path path = new Path();
                RectF rectF = new RectF();
                rectF.set(0.0f, 0.0f, createBitmap.getWidth(), createBitmap.getHeight());
                float f10 = this.d;
                path.addRoundRect(rectF, f10, f10, Path.Direction.CW);
                canvas.clipPath(path);
                for (int i3 = 0; i3 < bitmapArr.length; i3++) {
                    if (bitmapArr[i3] != null) {
                        canvas.save();
                        canvas.translate(createBitmap.getWidth() / 2.0f, createBitmap.getHeight() / 2.0f);
                        float max = Math.max(createBitmap.getWidth() / bitmapArr[i3].getWidth(), createBitmap.getHeight() / bitmapArr[i3].getHeight());
                        canvas.scale(max, max);
                        canvas.translate((-bitmapArr[i3].getWidth()) / 2.0f, (-bitmapArr[i3].getHeight()) / 2.0f);
                        canvas.drawBitmap(bitmapArr[i3], 0.0f, 0.0f, (Paint) null);
                        canvas.restore();
                        org.telegram.messenger.g0.z2(bitmapArr[i3]);
                    }
                }
                Utilities.stackBlurBitmap(createBitmap, 1);
                org.telegram.messenger.g0.h3(new g2.c(13, u10Var, createBitmap));
                return;
            case 1:
                ((qr) this.f13616e).B0(this.f13614b, this.f13615c, this.d, (long[]) this.f13617f);
                return;
            default:
                ConnectionsManager.lambda$onCaptchaCheck$28(this.f13614b, this.f13615c, this.d, (String) this.f13616e, (String) this.f13617f);
                return;
        }
    }

    public t5(qr qrVar, int i3, int i10, int i11, long[] jArr) {
        this.f13613a = 1;
        this.f13616e = qrVar;
        this.f13614b = i3;
        this.f13615c = i10;
        this.d = i11;
        this.f13617f = jArr;
    }
}
