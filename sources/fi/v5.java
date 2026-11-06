package fi;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import java.io.Serializable;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.c20;
import org.telegram.messenger.yr;
import org.telegram.tgnet.ConnectionsManager;
public final class v5 implements Runnable {
    public final int f12922a;
    public final int f12923b;
    public final int f12924c;
    public final int d;
    public final Object f12925e;
    public final Object f12926f;

    public v5(int i7, int i10, int i11, Serializable serializable, Object obj, int i12) {
        this.f12922a = i12;
        this.f12923b = i7;
        this.f12924c = i10;
        this.d = i11;
        this.f12925e = serializable;
        this.f12926f = obj;
    }

    @Override
    public final void run() {
        switch (this.f12922a) {
            case 0:
                Bitmap[] bitmapArr = (Bitmap[]) this.f12925e;
                c20 c20Var = (c20) this.f12926f;
                Bitmap createBitmap = Bitmap.createBitmap(this.f12923b, this.f12924c, Bitmap.Config.ARGB_8888);
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
                org.telegram.messenger.g0.h3(new f2.h(7, c20Var, createBitmap));
                return;
            case 1:
                ((yr) this.f12925e).B0(this.f12923b, this.f12924c, this.d, (long[]) this.f12926f);
                return;
            default:
                ConnectionsManager.lambda$onCaptchaCheck$28(this.f12923b, this.f12924c, this.d, (String) this.f12925e, (String) this.f12926f);
                return;
        }
    }

    public v5(yr yrVar, int i7, int i10, int i11, long[] jArr) {
        this.f12922a = 1;
        this.f12925e = yrVar;
        this.f12923b = i7;
        this.f12924c = i10;
        this.d = i11;
        this.f12926f = jArr;
    }
}
