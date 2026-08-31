package jh;

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
    public static HashMap f10121n;
    public final double f10122a;
    public final double f10123b;
    public final int f10124c;
    public final eh.d d;
    public final g f10125e;
    public i f10126f;
    public final int f10127g;
    public final int h;
    public boolean f10128i;
    public final ArrayList f10129j = new ArrayList();
    public final HashMap f10130k = new HashMap();
    public int f10131l = 0;
    public final f f10132m = new f(this, 0);

    public j(int i10, eh.d dVar, int i11, int i12) {
        double d = 1.0d / ((int) AndroidUtilities.screenRefreshRate);
        this.f10122a = d;
        this.f10123b = d * 4.0d;
        this.f10124c = i10;
        this.f10127g = i11;
        this.h = i12;
        this.d = dVar;
        g gVar = new g(this, dVar.getContext());
        this.f10125e = gVar;
        gVar.setSurfaceTextureListener(new h(this, 0));
        gVar.setOpaque(false);
        dVar.addView(gVar);
    }

    public static j d(int i10, View view, ViewGroup viewGroup) {
        int min;
        if (view != null) {
            if (f10121n == null) {
                f10121n = new HashMap();
            }
            j jVar = (j) f10121n.get(Integer.valueOf(i10));
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
                    HashMap hashMap = f10121n;
                    Integer valueOf = Integer.valueOf(i10);
                    eh.d dVar = new eh.d(viewGroup.getContext(), 3);
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
        HashMap hashMap = f10121n;
        if (hashMap != null) {
            for (j jVar : hashMap.values()) {
                if (jVar.f10124c == 0 && (iVar = jVar.f10126f) != null) {
                    iVar.f10111b = z4;
                }
            }
        }
    }

    public final void a(View view) {
        if (!this.f10128i) {
            ArrayList arrayList = this.f10129j;
            if (!arrayList.contains(view)) {
                arrayList.add(view);
                int i10 = this.f10131l;
                this.f10131l = i10 + 1;
                this.f10130k.put(view, Integer.valueOf(i10));
            }
        }
    }

    public final void b(View view) {
        this.f10129j.remove(view);
        this.f10130k.remove(view);
        if (!this.f10128i) {
            f fVar = this.f10132m;
            AndroidUtilities.cancelRunOnUIThread(fVar);
            AndroidUtilities.runOnUIThread(fVar, 30L);
        }
    }

    public final void c(Canvas canvas, View view, int i10, int i11, float f10, boolean z4) {
        if (canvas != null && view != null) {
            canvas.save();
            Integer num = (Integer) this.f10130k.get(view);
            if (num == null) {
                num = 0;
            }
            int i12 = this.f10127g;
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
            g gVar = this.f10125e;
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
