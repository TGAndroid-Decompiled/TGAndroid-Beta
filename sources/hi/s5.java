package hi;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import java.io.Serializable;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.ur;
import org.telegram.messenger.y10;
import org.telegram.tgnet.ConnectionsManager;
public final class s5 implements Runnable {
    public final int f15328a;
    public final int f15329b;
    public final int f15330c;
    public final int d;
    public final Object f15331e;
    public final Object f15332f;

    public s5(int i7, int i10, int i11, Serializable serializable, Object obj, int i12) {
        this.f15328a = i12;
        this.f15329b = i7;
        this.f15330c = i10;
        this.d = i11;
        this.f15331e = serializable;
        this.f15332f = obj;
    }

    @Override
    public final void run() {
        switch (this.f15328a) {
            case 0:
                Bitmap[] bitmapArr = (Bitmap[]) this.f15331e;
                y10 y10Var = (y10) this.f15332f;
                Bitmap createBitmap = Bitmap.createBitmap(this.f15329b, this.f15330c, Bitmap.Config.ARGB_8888);
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
                org.telegram.messenger.g0.g3(new q1(4, y10Var, createBitmap));
                return;
            case 1:
                ((ur) this.f15331e).B0(this.f15329b, this.f15330c, this.d, (long[]) this.f15332f);
                return;
            default:
                ConnectionsManager.lambda$onCaptchaCheck$28(this.f15329b, this.f15330c, this.d, (String) this.f15331e, (String) this.f15332f);
                return;
        }
    }

    public s5(ur urVar, int i7, int i10, int i11, long[] jArr) {
        this.f15328a = 1;
        this.f15331e = urVar;
        this.f15329b = i7;
        this.f15330c = i10;
        this.d = i11;
        this.f15332f = jArr;
    }
}
