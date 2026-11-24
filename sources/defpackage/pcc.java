package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.AsyncTask;
public final class pcc extends AsyncTask {
    public int a = 0;
    public final scc b;

    public pcc(scc sccVar) {
        this.b = sccVar;
    }

    @Override
    public final Object doInBackground(Object[] objArr) {
        Bitmap frameAtTime;
        scc sccVar = this.b;
        this.a = ((Integer[]) objArr)[0].intValue();
        Bitmap bitmap = null;
        if (!isCancelled()) {
            try {
                frameAtTime = sccVar.r.getFrameAtTime(sccVar.y * this.a * 1000, 2);
            } catch (Exception e) {
                e = e;
            }
            try {
                if (!isCancelled()) {
                    if (frameAtTime != null) {
                        Bitmap createBitmap = Bitmap.createBitmap(sccVar.E, sccVar.F, frameAtTime.getConfig());
                        Canvas canvas = new Canvas(createBitmap);
                        float max = Math.max(sccVar.E / frameAtTime.getWidth(), sccVar.F / frameAtTime.getHeight());
                        int width = (int) (frameAtTime.getWidth() * max);
                        int height = (int) (frameAtTime.getHeight() * max);
                        canvas.drawBitmap(frameAtTime, new Rect(0, 0, frameAtTime.getWidth(), frameAtTime.getHeight()), new Rect((sccVar.E - width) / 2, (sccVar.F - height) / 2, width, height), (Paint) null);
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
            scc sccVar = this.b;
            sccVar.w.add(bitmap);
            sccVar.invalidate();
            int i = this.a;
            if (i < sccVar.G) {
                sccVar.b(i + 1);
            } else {
                sccVar.P = true;
            }
        }
    }
}
