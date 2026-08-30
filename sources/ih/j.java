package ih;

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
    public static HashMap f7592n;
    public final double f7593a;
    public final double f7594b;
    public final int f7595c;
    public final dh.d d;
    public final g e;
    public i f7596f;
    public final int f7597g;
    public final int h;
    public boolean f7598i;
    public final ArrayList f7599j = new ArrayList();
    public final HashMap f7600k = new HashMap();
    public int f7601l = 0;
    public final f f7602m = new f(this, 0);

    public j(int i10, dh.d dVar, int i11, int i12) {
        double d = 1.0d / ((int) AndroidUtilities.screenRefreshRate);
        this.f7593a = d;
        this.f7594b = d * 4.0d;
        this.f7595c = i10;
        this.f7597g = i11;
        this.h = i12;
        this.d = dVar;
        g gVar = new g(this, dVar.getContext());
        this.e = gVar;
        gVar.setSurfaceTextureListener(new h(this, 0));
        gVar.setOpaque(false);
        dVar.addView(gVar);
    }

    public static j d(int i10, View view, ViewGroup viewGroup) {
        int min;
        if (view != null) {
            if (f7592n == null) {
                f7592n = new HashMap();
            }
            j jVar = (j) f7592n.get(Integer.valueOf(i10));
            if (jVar == null) {
                int devicePerformanceClass = SharedConfig.getDevicePerformanceClass();
                if (devicePerformanceClass != 1) {
                    if (devicePerformanceClass != 2) {
                        Point point = AndroidUtilities.displaySize;
                        min = Math.min(720, (int) (((point.x + point.y) / 2.0f) * 0.7f));
                    } else {
                        Point point2 = AndroidUtilities.displaySize;
                        min = Math.min(1280, (int) (((point2.x + point2.y) / 2.0f) * 1.0f));
                    }
                } else {
                    Point point3 = AndroidUtilities.displaySize;
                    min = Math.min(900, (int) (((point3.x + point3.y) / 2.0f) * 0.8f));
                }
                if (viewGroup != null) {
                    HashMap hashMap = f7592n;
                    Integer valueOf = Integer.valueOf(i10);
                    dh.d dVar = new dh.d(viewGroup.getContext(), 3);
                    viewGroup.addView(dVar);
                    j jVar2 = new j(i10, dVar, min, min);
                    hashMap.put(valueOf, jVar2);
                    jVar = jVar2;
                } else {
                    return null;
                }
            }
            jVar.a(view);
            return jVar;
        }
        return null;
    }

    public static j e(View view) {
        Activity findActivity = AndroidUtilities.findActivity(view.getContext());
        ViewGroup viewGroup = null;
        if (findActivity != null) {
            View rootView = findActivity.findViewById(16908290).getRootView();
            if (rootView instanceof ViewGroup) {
                viewGroup = (ViewGroup) rootView;
            }
        }
        return d(0, view, viewGroup);
    }

    public static void f(boolean z4) {
        i iVar;
        HashMap hashMap = f7592n;
        if (hashMap != null) {
            for (j jVar : hashMap.values()) {
                if (jVar.f7595c == 0 && (iVar = jVar.f7596f) != null) {
                    iVar.f7583b = z4;
                }
            }
        }
    }

    public final void a(View view) {
        if (!this.f7598i) {
            ArrayList arrayList = this.f7599j;
            if (!arrayList.contains(view)) {
                arrayList.add(view);
                int i10 = this.f7601l;
                this.f7601l = i10 + 1;
                this.f7600k.put(view, Integer.valueOf(i10));
            }
        }
    }

    public final void b(View view) {
        this.f7599j.remove(view);
        this.f7600k.remove(view);
        if (!this.f7598i) {
            f fVar = this.f7602m;
            AndroidUtilities.cancelRunOnUIThread(fVar);
            AndroidUtilities.runOnUIThread(fVar, 30L);
        }
    }

    public final void c(Canvas canvas, View view, int i10, int i11, float f10, boolean z4) {
        if (canvas != null && view != null) {
            canvas.save();
            Integer num = (Integer) this.f7600k.get(view);
            if (num == null) {
                num = 0;
            }
            int i12 = this.f7597g;
            int i13 = this.h;
            if (i10 > i12 || i11 > i13) {
                float max = Math.max(i10 / i12, i11 / i13);
                canvas.scale(max, max);
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
            g gVar = this.e;
            if (z4) {
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
}
