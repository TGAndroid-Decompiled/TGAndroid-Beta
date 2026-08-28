package dh;

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
public final class k {
    public static HashMap f4601n;
    public final double f4602a;
    public final double f4603b;
    public final int f4604c;
    public final g d;
    public final h f4605e;
    public j f4606f;
    public final int f4607g;
    public final int h;
    public boolean f4608i;
    public final ArrayList f4609j = new ArrayList();
    public final HashMap f4610k = new HashMap();
    public int f4611l = 0;
    public final f f4612m = new f(this, 0);

    public k(int i9, g gVar, int i10, int i11) {
        double d = 1.0d / ((int) AndroidUtilities.screenRefreshRate);
        this.f4602a = d;
        this.f4603b = d * 4.0d;
        this.f4604c = i9;
        this.f4607g = i10;
        this.h = i11;
        this.d = gVar;
        h hVar = new h(this, gVar.getContext());
        this.f4605e = hVar;
        hVar.setSurfaceTextureListener(new i(this, 0));
        hVar.setOpaque(false);
        gVar.addView(hVar);
    }

    public static k d(int i9, View view, ViewGroup viewGroup) {
        int min;
        if (view != null) {
            if (f4601n == null) {
                f4601n = new HashMap();
            }
            k kVar = (k) f4601n.get(Integer.valueOf(i9));
            if (kVar == null) {
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
                    HashMap hashMap = f4601n;
                    Integer valueOf = Integer.valueOf(i9);
                    g gVar = new g(viewGroup.getContext(), 0);
                    viewGroup.addView(gVar);
                    k kVar2 = new k(i9, gVar, min, min);
                    hashMap.put(valueOf, kVar2);
                    kVar = kVar2;
                } else {
                    return null;
                }
            }
            kVar.a(view);
            return kVar;
        }
        return null;
    }

    public static k e(View view) {
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

    public static void f(boolean z10) {
        j jVar;
        HashMap hashMap = f4601n;
        if (hashMap != null) {
            for (k kVar : hashMap.values()) {
                if (kVar.f4604c == 0 && (jVar = kVar.f4606f) != null) {
                    jVar.f4591b = z10;
                }
            }
        }
    }

    public final void a(View view) {
        if (!this.f4608i) {
            ArrayList arrayList = this.f4609j;
            if (!arrayList.contains(view)) {
                arrayList.add(view);
                int i9 = this.f4611l;
                this.f4611l = i9 + 1;
                this.f4610k.put(view, Integer.valueOf(i9));
            }
        }
    }

    public final void b(View view) {
        this.f4609j.remove(view);
        this.f4610k.remove(view);
        if (!this.f4608i) {
            f fVar = this.f4612m;
            AndroidUtilities.cancelRunOnUIThread(fVar);
            AndroidUtilities.runOnUIThread(fVar, 30L);
        }
    }

    public final void c(Canvas canvas, View view, int i9, int i10, float f10, boolean z10) {
        if (canvas != null && view != null) {
            canvas.save();
            Integer num = (Integer) this.f4610k.get(view);
            if (num == null) {
                num = 0;
            }
            int i11 = this.f4607g;
            int i12 = this.h;
            if (i9 > i11 || i10 > i12) {
                float max = Math.max(i9 / i11, i10 / i12);
                canvas.scale(max, max);
            }
            if (num.intValue() % 4 == 1) {
                canvas.rotate(180.0f, i11 / 2.0f, i12 / 2.0f);
            }
            if (num.intValue() % 4 == 2) {
                canvas.scale(-1.0f, 1.0f, i11 / 2.0f, i12 / 2.0f);
            }
            if (num.intValue() % 4 == 3) {
                canvas.scale(1.0f, -1.0f, i11 / 2.0f, i12 / 2.0f);
            }
            h hVar = this.f4605e;
            if (z10) {
                Bitmap bitmap = hVar.getBitmap();
                if (bitmap != null) {
                    Paint paint = new Paint(7);
                    paint.setColor(-1);
                    canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
                    bitmap.recycle();
                }
            } else {
                hVar.setAlpha(f10);
                hVar.draw(canvas);
            }
            canvas.restore();
        }
    }
}
