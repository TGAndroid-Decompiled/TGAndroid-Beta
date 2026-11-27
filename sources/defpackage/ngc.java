package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.AsyncTask;
public final class ngc extends AsyncTask {
    public int a = 0;
    public final qgc b;

    public ngc(qgc qgcVar) {
        this.b = qgcVar;
    }

    @Override
    public final Object doInBackground(Object[] objArr) {
        Bitmap frameAtTime;
        qgc qgcVar = this.b;
        this.a = ((Integer[]) objArr)[0].intValue();
        Bitmap bitmap = null;
        if (!isCancelled()) {
            try {
                frameAtTime = qgcVar.r.getFrameAtTime(qgcVar.y * this.a * 1000, 2);
            } catch (Exception e) {
                e = e;
            }
            try {
                if (!isCancelled()) {
                    if (frameAtTime != null) {
                        Bitmap createBitmap = Bitmap.createBitmap(qgcVar.E, qgcVar.F, frameAtTime.getConfig());
                        Canvas canvas = new Canvas(createBitmap);
                        float max = Math.max(qgcVar.E / frameAtTime.getWidth(), qgcVar.F / frameAtTime.getHeight());
                        int width = (int) (frameAtTime.getWidth() * max);
                        int height = (int) (frameAtTime.getHeight() * max);
                        canvas.drawBitmap(frameAtTime, new Rect(0, 0, frameAtTime.getWidth(), frameAtTime.getHeight()), new Rect((qgcVar.E - width) / 2, (qgcVar.F - height) / 2, width, height), (Paint) null);
                        frameAtTime.recycle();
                        return createBitmap;
                    }
                    return frameAtTime;
                }
            } catch (Exception e2) {
                e = e2;
                bitmap = frameAtTime;
                cc4.g(e, true);
                return bitmap;
            }
        }
        return null;
    }

    @Override
    public final void onPostExecute(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        if (!isCancelled()) {
            qgc qgcVar = this.b;
            qgcVar.w.add(bitmap);
            qgcVar.invalidate();
            int i = this.a;
            if (i < qgcVar.G) {
                qgcVar.b(i + 1);
            } else {
                qgcVar.P = true;
            }
        }
    }
}
