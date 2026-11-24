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
public final class qna {
    public static HashMap n;
    public final double a;
    public final double b;
    public final boolean c;
    public final ct8 d;
    public final rq5 e;
    public pna f;
    public final int g;
    public final int h;
    public boolean i;
    public final ArrayList j = new ArrayList();
    public final HashMap k = new HashMap();
    public int l = 0;
    public final ona m = new ona(this, (byte) 0);

    public qna(int i, ct8 ct8Var, int i2, int i3) {
        double d = 1.0d / ((int) gm.r);
        this.a = d;
        this.b = d * 4.0d;
        this.c = i;
        this.g = i2;
        this.h = i3;
        this.d = ct8Var;
        rq5 rq5Var = new rq5((byte) 2, ct8Var.getContext(), this);
        this.e = rq5Var;
        rq5Var.setSurfaceTextureListener(new tr5(this, (byte) 3));
        rq5Var.setOpaque(false);
        ct8Var.addView(rq5Var);
    }

    public static qna d(int i, View view, ViewGroup viewGroup) {
        int min;
        if (view != null) {
            HashMap hashMap = n;
            if (hashMap == null) {
                hashMap = new HashMap();
                n = hashMap;
            }
            qna qnaVar = (qna) hashMap.get(Integer.valueOf(i));
            if (qnaVar == null) {
                int o = gda.o();
                if (o != 1) {
                    if (o != 2) {
                        Point point = gm.q;
                        min = Math.min(720, (int) (((point.x + point.y) / 2.0f) * 0.7f));
                    } else {
                        Point point2 = gm.q;
                        min = Math.min(1280, (int) (((point2.x + point2.y) / 2.0f) * 1.0f));
                    }
                } else {
                    Point point3 = gm.q;
                    min = Math.min(900, (int) (((point3.x + point3.y) / 2.0f) * 0.8f));
                }
                if (viewGroup != null) {
                    HashMap hashMap2 = n;
                    Integer valueOf = Integer.valueOf(i);
                    ct8 ct8Var = new ct8(viewGroup.getContext(), (byte) 9);
                    viewGroup.addView(ct8Var);
                    qna qnaVar2 = new qna(i, ct8Var, min, min);
                    hashMap2.put(valueOf, qnaVar2);
                    qnaVar = qnaVar2;
                } else {
                    return null;
                }
            }
            qnaVar.a(view);
            return qnaVar;
        }
        return null;
    }

    public static qna e(View view) {
        Activity W = gm.W(view.getContext());
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
        pna pnaVar;
        HashMap hashMap = n;
        if (hashMap != null) {
            for (qna qnaVar : hashMap.values()) {
                if (!qnaVar.c && (pnaVar = qnaVar.f) != null) {
                    pnaVar.b = z;
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
            ona onaVar = this.m;
            gm.r(onaVar);
            gm.d3(onaVar, 30L);
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
            rq5 rq5Var = this.e;
            if (z) {
                Bitmap bitmap = rq5Var.getBitmap();
                if (bitmap != null) {
                    Paint paint = new Paint(7);
                    paint.setColor(-1);
                    canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
                    bitmap.recycle();
                }
            } else {
                rq5Var.setAlpha(f);
                rq5Var.draw(canvas);
            }
            canvas.restore();
        }
    }
}
