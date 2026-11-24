package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.AsyncTask;
import java.util.ArrayList;
public final class mec extends AsyncTask {
    public int a = 0;
    public final Paint b = new Paint(3);
    public final pec c;

    public mec(pec pecVar) {
        this.c = pecVar;
    }

    @Override
    public final Object doInBackground(Object[] objArr) {
        Bitmap frameAtTime;
        pec pecVar = this.c;
        this.a = ((Integer[]) objArr)[0].intValue();
        Bitmap bitmap = null;
        if (!isCancelled()) {
            try {
                frameAtTime = pecVar.E.getFrameAtTime(pecVar.I * this.a * 1000, 2);
            } catch (Exception e) {
                e = e;
            }
            try {
                if (!isCancelled()) {
                    if (frameAtTime != null) {
                        Bitmap createBitmap = Bitmap.createBitmap(pecVar.J, pecVar.K, frameAtTime.getConfig());
                        Canvas canvas = new Canvas(createBitmap);
                        float max = Math.max(pecVar.J / frameAtTime.getWidth(), pecVar.K / frameAtTime.getHeight());
                        int width = (int) (frameAtTime.getWidth() * max);
                        int height = (int) (frameAtTime.getHeight() * max);
                        Rect rect = new Rect(0, 0, frameAtTime.getWidth(), frameAtTime.getHeight());
                        int i = pecVar.J;
                        int i2 = pecVar.K;
                        canvas.drawBitmap(frameAtTime, rect, new Rect((i - width) / 2, (i2 - height) / 2, (i + width) / 2, (i2 + height) / 2), this.b);
                        frameAtTime.recycle();
                        return createBitmap;
                    }
                    return frameAtTime;
                }
            } catch (Exception e2) {
                e = e2;
                bitmap = frameAtTime;
                fc4.g(e, true);
                return bitmap;
            }
        }
        return null;
    }

    @Override
    public final void onPostExecute(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        if (!isCancelled()) {
            pec pecVar = this.c;
            ArrayList arrayList = pecVar.G;
            ?? obj2 = new Object();
            obj2.a = bitmap;
            arrayList.add(obj2);
            pecVar.invalidate();
            int i = this.a;
            if (i < pecVar.L) {
                pecVar.d(i + 1);
            }
        }
    }
}
