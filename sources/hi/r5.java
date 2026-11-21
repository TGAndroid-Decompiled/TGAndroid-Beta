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
public final class r5 implements Runnable {
    public final int f15330a;
    public final int f15331b;
    public final int f15332c;
    public final int d;
    public final Object f15333e;
    public final Object f15334f;

    public r5(int i7, int i10, int i11, Serializable serializable, Object obj, int i12) {
        this.f15330a = i12;
        this.f15331b = i7;
        this.f15332c = i10;
        this.d = i11;
        this.f15333e = serializable;
        this.f15334f = obj;
    }

    @Override
    public final void run() {
        switch (this.f15330a) {
            case 0:
                Bitmap[] bitmapArr = (Bitmap[]) this.f15333e;
                x10 x10Var = (x10) this.f15334f;
                Bitmap createBitmap = Bitmap.createBitmap(this.f15331b, this.f15332c, Bitmap.Config.ARGB_8888);
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
                org.telegram.messenger.g0.g3(new c(6, x10Var, createBitmap));
                return;
            case 1:
                ((tr) this.f15333e).B0(this.f15331b, this.f15332c, this.d, (long[]) this.f15334f);
                return;
            default:
                ConnectionsManager.lambda$onCaptchaCheck$28(this.f15331b, this.f15332c, this.d, (String) this.f15333e, (String) this.f15334f);
                return;
        }
    }

    public r5(tr trVar, int i7, int i10, int i11, long[] jArr) {
        this.f15330a = 1;
        this.f15333e = trVar;
        this.f15331b = i7;
        this.f15332c = i10;
        this.d = i11;
        this.f15334f = jArr;
    }
}
