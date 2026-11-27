package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import java.io.Serializable;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
public final class it2 implements Runnable {
    public final byte a;
    public final int b;
    public final int c;
    public final int d;
    public final Serializable e;
    public final Object f;

    public it2(int i, int i2, int i3, Serializable serializable, Object obj, byte b) {
        this.a = b;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = serializable;
        this.f = obj;
    }

    @Override
    public final void run() {
        byte b = this.a;
        Object obj = this.f;
        Serializable serializable = this.e;
        int i = this.d;
        int i2 = this.c;
        int i3 = this.b;
        switch (b) {
            case 0:
                ConnectionsManager.lambda$onCaptchaCheck$28(i3, i2, i, (String) serializable, (String) obj);
                return;
            default:
                Bitmap[] bitmapArr = (Bitmap[]) serializable;
                pcc pccVar = (pcc) obj;
                Bitmap createBitmap = Bitmap.createBitmap(i3, i2, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                Path path = new Path();
                RectF rectF = new RectF();
                rectF.set(0.0f, 0.0f, createBitmap.getWidth(), createBitmap.getHeight());
                float f = i;
                path.addRoundRect(rectF, f, f, Path.Direction.CW);
                canvas.clipPath(path);
                for (int i4 = 0; i4 < bitmapArr.length; i4++) {
                    if (bitmapArr[i4] != null) {
                        canvas.save();
                        canvas.translate(createBitmap.getWidth() / 2.0f, createBitmap.getHeight() / 2.0f);
                        float max = Math.max(createBitmap.getWidth() / bitmapArr[i4].getWidth(), createBitmap.getHeight() / bitmapArr[i4].getHeight());
                        canvas.scale(max, max);
                        canvas.translate((-bitmapArr[i4].getWidth()) / 2.0f, (-bitmapArr[i4].getHeight()) / 2.0f);
                        canvas.drawBitmap(bitmapArr[i4], 0.0f, 0.0f, (Paint) null);
                        canvas.restore();
                        hl.w2(bitmapArr[i4]);
                    }
                }
                Utilities.stackBlurBitmap(createBitmap, 1);
                hl.c3(new a58(pccVar, createBitmap, (byte) 19));
                return;
        }
    }
}
