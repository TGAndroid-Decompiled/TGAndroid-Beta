package nh;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.i0;
import org.telegram.messenger.tz;
import org.telegram.ui.Cells.a5;
public final class h {
    public static HashMap f13828n;
    public final double f13829a;
    public final double f13830b;
    public final int f13831c;
    public final a5 d;
    public final f e;
    public g f13832f;
    public final int f13833g;
    public final int h;
    public boolean f13834i;
    public final ArrayList f13835j = new ArrayList();
    public final HashMap f13836k = new HashMap();
    public int f13837l = 0;
    public final e f13838m = new e(this, 0);

    public h(int i10, a5 a5Var, int i11, int i12) {
        double d = 1.0d / ((int) i0.f16027r);
        this.f13829a = d;
        this.f13830b = d * 4.0d;
        this.f13831c = i10;
        this.f13833g = i11;
        this.h = i12;
        this.d = a5Var;
        f fVar = new f(this, a5Var.getContext(), 0);
        this.e = fVar;
        fVar.setSurfaceTextureListener(new li.e(this, 1));
        fVar.setOpaque(false);
        a5Var.addView(fVar);
    }

    public static h d(int i10, View view, ViewGroup viewGroup) {
        int min;
        if (view != null) {
            if (f13828n == null) {
                f13828n = new HashMap();
            }
            h hVar = (h) f13828n.get(Integer.valueOf(i10));
            if (hVar == null) {
                int o10 = tz.o();
                if (o10 != 1) {
                    if (o10 != 2) {
                        Point point = i0.f16026q;
                        min = Math.min(720, (int) (((point.x + point.y) / 2.0f) * 0.7f));
                    } else {
                        Point point2 = i0.f16026q;
                        min = Math.min(1280, (int) (((point2.x + point2.y) / 2.0f) * 1.0f));
                    }
                } else {
                    Point point3 = i0.f16026q;
                    min = Math.min(900, (int) (((point3.x + point3.y) / 2.0f) * 0.8f));
                }
                if (viewGroup != null) {
                    HashMap hashMap = f13828n;
                    Integer valueOf = Integer.valueOf(i10);
                    a5 a5Var = new a5(viewGroup.getContext(), 8);
                    viewGroup.addView(a5Var);
                    h hVar2 = new h(i10, a5Var, min, min);
                    hashMap.put(valueOf, hVar2);
                    hVar = hVar2;
                } else {
                    return null;
                }
            }
            hVar.a(view);
            return hVar;
        }
        return null;
    }

    public static h e(View view) {
        Activity W = i0.W(view.getContext());
        ViewGroup viewGroup = null;
        if (W != null) {
            View rootView = W.findViewById(16908290).getRootView();
            if (rootView instanceof ViewGroup) {
                viewGroup = (ViewGroup) rootView;
            }
        }
        return d(0, view, viewGroup);
    }

    public static void f(boolean z10) {
        g gVar;
        HashMap hashMap = f13828n;
        if (hashMap != null) {
            for (h hVar : hashMap.values()) {
                if (hVar.f13831c == 0 && (gVar = hVar.f13832f) != null) {
                    gVar.f13819b = z10;
                }
            }
        }
    }

    public final void a(View view) {
        if (!this.f13834i) {
            ArrayList arrayList = this.f13835j;
            if (!arrayList.contains(view)) {
                arrayList.add(view);
                int i10 = this.f13837l;
                this.f13837l = i10 + 1;
                this.f13836k.put(view, Integer.valueOf(i10));
            }
        }
    }

    public final void b(View view) {
        this.f13835j.remove(view);
        this.f13836k.remove(view);
        if (!this.f13834i) {
            e eVar = this.f13838m;
            i0.r(eVar);
            i0.h3(eVar, 30L);
        }
    }

    public final void c(Canvas canvas, View view, int i10, int i11, float f7, boolean z10) {
        if (canvas != null && view != null) {
            canvas.save();
            Integer num = (Integer) this.f13836k.get(view);
            if (num == null) {
                num = 0;
            }
            int i12 = this.f13833g;
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
            f fVar = this.e;
            if (z10) {
                Bitmap bitmap = fVar.getBitmap();
                if (bitmap != null) {
                    Paint paint = new Paint(7);
                    paint.setColor(-1);
                    canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
                    bitmap.recycle();
                }
            } else {
                fVar.setAlpha(f7);
                fVar.draw(canvas);
            }
            canvas.restore();
        }
    }
}
