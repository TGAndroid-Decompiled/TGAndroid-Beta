package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.AsyncTask;
import java.util.ArrayList;
public final class lcc extends AsyncTask {
    public int a = 0;
    public final Paint b = new Paint(3);
    public final occ c;

    public lcc(occ occVar) {
        this.c = occVar;
    }

    @Override
    public final Object doInBackground(Object[] objArr) {
        Bitmap frameAtTime;
        occ occVar = this.c;
        this.a = ((Integer[]) objArr)[0].intValue();
        Bitmap bitmap = null;
        if (!isCancelled()) {
            try {
                frameAtTime = occVar.E.getFrameAtTime(occVar.I * this.a * 1000, 2);
            } catch (Exception e) {
                e = e;
            }
            try {
                if (!isCancelled()) {
                    if (frameAtTime != null) {
                        Bitmap createBitmap = Bitmap.createBitmap(occVar.J, occVar.K, frameAtTime.getConfig());
                        Canvas canvas = new Canvas(createBitmap);
                        float max = Math.max(occVar.J / frameAtTime.getWidth(), occVar.K / frameAtTime.getHeight());
                        int width = (int) (frameAtTime.getWidth() * max);
                        int height = (int) (frameAtTime.getHeight() * max);
                        Rect rect = new Rect(0, 0, frameAtTime.getWidth(), frameAtTime.getHeight());
                        int i = occVar.J;
                        int i2 = occVar.K;
                        canvas.drawBitmap(frameAtTime, rect, new Rect((i - width) / 2, (i2 - height) / 2, (i + width) / 2, (i2 + height) / 2), this.b);
                        frameAtTime.recycle();
                        return createBitmap;
                    }
                    return frameAtTime;
                }
            } catch (Exception e2) {
                e = e2;
                bitmap = frameAtTime;
                fa4.g(e, true);
                return bitmap;
            }
        }
        return null;
    }

    @Override
    public final void onPostExecute(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        if (!isCancelled()) {
            occ occVar = this.c;
            ArrayList arrayList = occVar.G;
            ?? obj2 = new Object();
            obj2.a = bitmap;
            arrayList.add(obj2);
            occVar.invalidate();
            int i = this.a;
            if (i < occVar.L) {
                occVar.d(i + 1);
            }
        }
    }
}
