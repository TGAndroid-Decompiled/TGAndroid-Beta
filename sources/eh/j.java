package eh;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;

public final class j {

    public static HashMap f5499n;

    public final double f5500a;

    public final double f5501b;

    public final int f5502c;
    public final ag.d d;

    public final g f5503e;

    public i f5504f;

    public final int f5505g;
    public final int h;

    public boolean f5506i;

    public final ArrayList f5507j = new ArrayList();

    public final HashMap f5508k = new HashMap();

    public int f5509l = 0;

    public final f f5510m = new f(this, 0);

    public j(int i10, ag.d dVar, int i11, int i12) {
        double d = 1.0d / ((double) ((int) AndroidUtilities.screenRefreshRate));
        this.f5500a = d;
        this.f5501b = d * 4.0d;
        this.f5502c = i10;
        this.f5505g = i11;
        this.h = i12;
        this.d = dVar;
        g gVar = new g(this, dVar.getContext());
        this.f5503e = gVar;
        gVar.setSurfaceTextureListener(new h(this, 0));
        gVar.setOpaque(false);
        dVar.addView(gVar);
    }

    public static j d(int i10, View view, ViewGroup viewGroup) {
        int iMin;
        if (view == null) {
            return null;
        }
        if (f5499n == null) {
            f5499n = new HashMap();
        }
        j jVar = (j) f5499n.get(Integer.valueOf(i10));
        if (jVar == null) {
            int devicePerformanceClass = SharedConfig.getDevicePerformanceClass();
            if (devicePerformanceClass == 1) {
                Point point = AndroidUtilities.displaySize;
                iMin = Math.min(900, (int) (((point.x + point.y) / 2.0f) * 0.8f));
            } else if (devicePerformanceClass != 2) {
                Point point2 = AndroidUtilities.displaySize;
                iMin = Math.min(720, (int) (((point2.x + point2.y) / 2.0f) * 0.7f));
            } else {
                Point point3 = AndroidUtilities.displaySize;
                iMin = Math.min(1280, (int) (((point3.x + point3.y) / 2.0f) * 1.0f));
            }
            if (viewGroup == null) {
                return null;
            }
            HashMap map = f5499n;
            Integer numValueOf = Integer.valueOf(i10);
            ag.d dVar = new ag.d(viewGroup.getContext(), 1);
            viewGroup.addView(dVar);
            j jVar2 = new j(i10, dVar, iMin, iMin);
            map.put(numValueOf, jVar2);
            jVar = jVar2;
        }
        jVar.a(view);
        return jVar;
    }

    public static j e(View view) {
        Activity activityFindActivity = AndroidUtilities.findActivity(view.getContext());
        ViewGroup viewGroup = null;
        if (activityFindActivity != null) {
            View rootView = activityFindActivity.findViewById(16908290).getRootView();
            if (rootView instanceof ViewGroup) {
                viewGroup = (ViewGroup) rootView;
            }
        }
        return d(0, view, viewGroup);
    }

    public static void f(boolean z10) {
        i iVar;
        HashMap map = f5499n;
        if (map == null) {
            return;
        }
        for (j jVar : map.values()) {
            if (jVar.f5502c == 0 && (iVar = jVar.f5504f) != null) {
                iVar.f5489b = z10;
            }
        }
    }

    public final void a(View view) {
        if (this.f5506i) {
            return;
        }
        ArrayList arrayList = this.f5507j;
        if (arrayList.contains(view)) {
            return;
        }
        arrayList.add(view);
        int i10 = this.f5509l;
        this.f5509l = i10 + 1;
        this.f5508k.put(view, Integer.valueOf(i10));
    }

    public final void b(View view) {
        this.f5507j.remove(view);
        this.f5508k.remove(view);
        if (this.f5506i) {
            return;
        }
        f fVar = this.f5510m;
        AndroidUtilities.cancelRunOnUIThread(fVar);
        AndroidUtilities.runOnUIThread(fVar, 30L);
    }

    public final void c(Canvas canvas, View view, int i10, int i11, float f10, boolean z10) {
        if (canvas == null || view == null) {
            return;
        }
        canvas.save();
        Integer num = (Integer) this.f5508k.get(view);
        if (num == null) {
            num = 0;
        }
        int i12 = this.f5505g;
        int i13 = this.h;
        if (i10 > i12 || i11 > i13) {
            float fMax = Math.max(i10 / i12, i11 / i13);
            canvas.scale(fMax, fMax);
        }
        if (num.intValue() % 4 == 1) {
            canvas.rotate(180.0f, i12 / 2.0f, i13 / 2.0f);
        }
        if (num.intValue() % 4 == 2) {
            canvas.scale(-1.0f, 1.0f, i12 / 2.0f, i13 / 2.0f);
        }
        if (num.intValue() % 4 == 3) {
            canvas.scale(1.0f, -1.0f, i12 / 2.0f, i13 / 2.0f);
        }
        g gVar = this.f5503e;
        if (z10) {
            Bitmap bitmap = gVar.getBitmap();
            if (bitmap != null) {
                Paint paint = new Paint(7);
                paint.setColor(-1);
                canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
                bitmap.recycle();
            }
        } else {
            gVar.setAlpha(f10);
            gVar.draw(canvas);
        }
        canvas.restore();
    }
}
