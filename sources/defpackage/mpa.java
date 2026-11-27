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
public final class mpa {
    public static HashMap n;
    public final double a;
    public final double b;
    public final boolean c;
    public final ir8 d;
    public final uq5 e;
    public lpa f;
    public final int g;
    public final int h;
    public boolean i;
    public final ArrayList j = new ArrayList();
    public final HashMap k = new HashMap();
    public int l = 0;
    public final kpa m = new kpa(this, (byte) 0);

    public mpa(int i, ir8 ir8Var, int i2, int i3) {
        double d = 1.0d / ((int) hl.r);
        this.a = d;
        this.b = d * 4.0d;
        this.c = i;
        this.g = i2;
        this.h = i3;
        this.d = ir8Var;
        uq5 uq5Var = new uq5((byte) 2, ir8Var.getContext(), this);
        this.e = uq5Var;
        uq5Var.setSurfaceTextureListener(new wr5(this, (byte) 3));
        uq5Var.setOpaque(false);
        ir8Var.addView(uq5Var);
    }

    public static mpa d(int i, View view, ViewGroup viewGroup) {
        int min;
        if (view != null) {
            HashMap hashMap = n;
            if (hashMap == null) {
                hashMap = new HashMap();
                n = hashMap;
            }
            mpa mpaVar = (mpa) hashMap.get(Integer.valueOf(i));
            if (mpaVar == null) {
                int o = xea.o();
                if (o != 1) {
                    if (o != 2) {
                        Point point = hl.q;
                        min = Math.min(720, (int) (((point.x + point.y) / 2.0f) * 0.7f));
                    } else {
                        Point point2 = hl.q;
                        min = Math.min(1280, (int) (((point2.x + point2.y) / 2.0f) * 1.0f));
                    }
                } else {
                    Point point3 = hl.q;
                    min = Math.min(900, (int) (((point3.x + point3.y) / 2.0f) * 0.8f));
                }
                if (viewGroup != null) {
                    HashMap hashMap2 = n;
                    Integer valueOf = Integer.valueOf(i);
                    ir8 ir8Var = new ir8(viewGroup.getContext(), (byte) 10);
                    viewGroup.addView(ir8Var);
                    mpa mpaVar2 = new mpa(i, ir8Var, min, min);
                    hashMap2.put(valueOf, mpaVar2);
                    mpaVar = mpaVar2;
                } else {
                    return null;
                }
            }
            mpaVar.a(view);
            return mpaVar;
        }
        return null;
    }

    public static mpa e(View view) {
        Activity W = hl.W(view.getContext());
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
        lpa lpaVar;
        HashMap hashMap = n;
        if (hashMap != null) {
            for (mpa mpaVar : hashMap.values()) {
                if (!mpaVar.c && (lpaVar = mpaVar.f) != null) {
                    lpaVar.b = z;
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
            kpa kpaVar = this.m;
            hl.r(kpaVar);
            hl.d3(kpaVar, 30L);
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
            uq5 uq5Var = this.e;
            if (z) {
                Bitmap bitmap = uq5Var.getBitmap();
                if (bitmap != null) {
                    Paint paint = new Paint(7);
                    paint.setColor(-1);
                    canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
                    bitmap.recycle();
                }
            } else {
                uq5Var.setAlpha(f);
                uq5Var.draw(canvas);
            }
            canvas.restore();
        }
    }
}
