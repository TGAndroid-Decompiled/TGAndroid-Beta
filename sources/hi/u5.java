package hi;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import java.io.Serializable;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.vr;
import org.telegram.messenger.z10;
import org.telegram.tgnet.ConnectionsManager;
public final class u5 implements Runnable {
    public final int f15185a;
    public final int f15186b;
    public final int f15187c;
    public final int d;
    public final Object f15188e;
    public final Object f15189f;

    public u5(int i7, int i10, int i11, Serializable serializable, Object obj, int i12) {
        this.f15185a = i12;
        this.f15186b = i7;
        this.f15187c = i10;
        this.d = i11;
        this.f15188e = serializable;
        this.f15189f = obj;
    }

    @Override
    public final void run() {
        switch (this.f15185a) {
            case 0:
                Bitmap[] bitmapArr = (Bitmap[]) this.f15188e;
                z10 z10Var = (z10) this.f15189f;
                Bitmap createBitmap = Bitmap.createBitmap(this.f15186b, this.f15187c, Bitmap.Config.ARGB_8888);
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
                org.telegram.messenger.g0.h3(new h4(2, z10Var, createBitmap));
                return;
            case 1:
                ((vr) this.f15188e).B0(this.f15186b, this.f15187c, this.d, (long[]) this.f15189f);
                return;
            default:
                ConnectionsManager.lambda$onCaptchaCheck$28(this.f15186b, this.f15187c, this.d, (String) this.f15188e, (String) this.f15189f);
                return;
        }
    }

    public u5(vr vrVar, int i7, int i10, int i11, long[] jArr) {
        this.f15185a = 1;
        this.f15188e = vrVar;
        this.f15186b = i7;
        this.f15187c = i10;
        this.d = i11;
        this.f15189f = jArr;
    }
}
