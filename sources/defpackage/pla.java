package defpackage;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.HashMap;
public final class pla {
    public static HashMap n;
    public final double a;
    public final double b;
    public final boolean c;
    public final ar8 d;
    public final ro5 e;
    public ola f;
    public final int g;
    public final int h;
    public boolean i;
    public final ArrayList j = new ArrayList();
    public final HashMap k = new HashMap();
    public int l = 0;
    public final nla m = new nla(this, (byte) 0);

    public pla(int i, ar8 ar8Var, int i2, int i3) {
        double d = 1.0d / ((int) gl.r);
        this.a = d;
        this.b = d * 4.0d;
        this.c = i;
        this.g = i2;
        this.h = i3;
        this.d = ar8Var;
        ro5 ro5Var = new ro5((byte) 2, ar8Var.getContext(), this);
        this.e = ro5Var;
        ro5Var.setSurfaceTextureListener(new up5(this, (byte) 3));
        ro5Var.setOpaque(false);
        ar8Var.addView(ro5Var);
    }

    public static pla d(int i, View view, ViewGroup viewGroup) {
        int min;
        if (view != null) {
            HashMap hashMap = n;
            if (hashMap == null) {
                hashMap = new HashMap();
                n = hashMap;
            }
            pla plaVar = (pla) hashMap.get(Integer.valueOf(i));
            if (plaVar == null) {
                int o = gba.o();
                if (o != 1) {
                    if (o != 2) {
                        Point point = gl.q;
                        min = Math.min(720, (int) (((point.x + point.y) / 2.0f) * 0.7f));
                    } else {
                        Point point2 = gl.q;
                        min = Math.min(1280, (int) (((point2.x + point2.y) / 2.0f) * 1.0f));
                    }
                } else {
                    Point point3 = gl.q;
                    min = Math.min(900, (int) (((point3.x + point3.y) / 2.0f) * 0.8f));
                }
                if (viewGroup != null) {
                    HashMap hashMap2 = n;
                    Integer valueOf = Integer.valueOf(i);
                    ar8 ar8Var = new ar8(viewGroup.getContext(), (byte) 9);
                    viewGroup.addView(ar8Var);
                    pla plaVar2 = new pla(i, ar8Var, min, min);
                    hashMap2.put(valueOf, plaVar2);
                    plaVar = plaVar2;
                } else {
                    return null;
                }
            }
            plaVar.a(view);
            return plaVar;
        }
        return null;
    }

    public static pla e(View view) {
        Activity W = gl.W(view.getContext());
        ViewGroup viewGroup = null;
        if (W != null) {
            View rootView = W.findViewById(16908290).getRootView();
            if (rootView instanceof ViewGroup) {
                viewGroup = (ViewGroup) rootView;
            }
        }
        return d(0, view, viewGroup);
    }

    public static void f(boolean z) {
        ola olaVar;
        HashMap hashMap = n;
        if (hashMap != null) {
            for (pla plaVar : hashMap.values()) {
                if (!plaVar.c && (olaVar = plaVar.f) != null) {
                    olaVar.b = z;
                }
            }
        }
    }

    public final void a(View view) {
        if (!this.i) {
            ArrayList arrayList = this.j;
            if (!arrayList.contains(view)) {
                arrayList.add(view);
                int i = this.l;
                this.l = i + 1;
                this.k.put(view, Integer.valueOf(i));
            }
        }
    }

    public final void b(View view) {
        this.j.remove(view);
        this.k.remove(view);
        if (!this.i) {
            nla nlaVar = this.m;
            gl.r(nlaVar);
            gl.d3(nlaVar, 30L);
        }
    }

    public final void c(Canvas canvas, View view, int i, int i2, float f, boolean z) {
        if (canvas != null && view != null) {
            canvas.save();
            Integer num = (Integer) this.k.get(view);
            if (num == null) {
                num = 0;
            }
            int i3 = this.g;
            int i4 = this.h;
            if (i > i3 || i2 > i4) {
                float max = Math.max(i / i3, i2 / i4);
                canvas.scale(max, max);
            }
            if (num.intValue() % 4 == 1) {
                canvas.rotate(180.0f, i3 / 2.0f, i4 / 2.0f);
            }
            if (num.intValue() % 4 == 2) {
                canvas.scale(-1.0f, 1.0f, i3 / 2.0f, i4 / 2.0f);
            }
            if (num.intValue() % 4 == 3) {
                canvas.scale(1.0f, -1.0f, i3 / 2.0f, i4 / 2.0f);
            }
            ro5 ro5Var = this.e;
            if (z) {
                Bitmap bitmap = ro5Var.getBitmap();
                if (bitmap != null) {
                    Paint paint = new Paint(7);
                    paint.setColor(-1);
                    canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
                    bitmap.recycle();
                }
            } else {
                ro5Var.setAlpha(f);
                ro5Var.draw(canvas);
            }
            canvas.restore();
        }
    }
}
