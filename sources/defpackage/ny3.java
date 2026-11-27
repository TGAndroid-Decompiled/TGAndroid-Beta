package defpackage;

import android.app.Activity;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.text.TextPaint;
import android.view.MotionEvent;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.WeakHashMap;
public final class ny3 extends View {
    public static final long g0 = System.currentTimeMillis();
    public static final String[] h0 = new String[100];
    public float E;
    public long F;
    public final RectF G;
    public float H;
    public float I;
    public final so4 J;
    public final Path K;
    public float L;
    public final RectF M;
    public final RectF N;
    public final WeakHashMap O;
    public final Path P;
    public final int[] Q;
    public LinearGradient R;
    public final Paint S;
    public final Paint.FontMetrics T;
    public yy8 U;
    public float V;
    public float W;
    public final xh4 a;
    public float a0;
    public pz8 b;
    public long b0;
    public final Paint c;
    public long c0;
    public final Paint d;
    public boolean d0;
    public final TextPaint e;
    public final int[] e0;
    public final int[] f;
    public final RectF f0;
    public final int[] h;
    public final HashMap n;
    public final ArrayList r;
    public final ArrayList s;
    public final ArrayList w;
    public float x;
    public float y;

    public ny3(Activity activity, xh4 xh4Var) {
        super(activity);
        this.c = new Paint(1);
        Paint paint = new Paint(1);
        this.d = paint;
        TextPaint textPaint = new TextPaint(1);
        this.e = textPaint;
        this.f = new int[2];
        this.h = new int[2];
        this.n = new HashMap();
        this.r = new ArrayList();
        this.s = new ArrayList();
        this.w = new ArrayList();
        this.G = new RectF();
        this.H = Float.NaN;
        this.I = -1.0f;
        this.J = new so4();
        this.K = new Path();
        this.L = Float.NaN;
        this.M = new RectF();
        this.N = new RectF();
        this.O = new WeakHashMap();
        this.P = new Path();
        this.Q = new int[2];
        this.S = new Paint(1);
        this.T = new Paint.FontMetrics();
        this.V = Float.NaN;
        this.a0 = 0.45f;
        this.e0 = new int[2];
        this.f0 = new RectF();
        this.a = xh4Var;
        textPaint.setTypeface(hl.o());
        textPaint.setTextSize(hl.L(10.0f));
        textPaint.setTextAlign(Paint.Align.CENTER);
        paint.setStyle(Paint.Style.STROKE);
    }

    public static float b(float[] fArr, long j) {
        float min = Math.min(1.0f, ((float) (j - fArr[2])) / 180.0f);
        float f = fArr[1];
        float max = 1.0f - Math.max(0.0f, Math.min(1.0f, min));
        return ((1.0f - ((max * max) * max)) * (fArr[0] - f)) + f;
    }

    public final boolean a(android.graphics.Canvas r38, android.view.ViewGroup r39, java.util.ArrayList r40, long r41) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ny3.a(android.graphics.Canvas, android.view.ViewGroup, java.util.ArrayList, long):boolean");
    }

    @Override
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override
    public final void onDraw(android.graphics.Canvas r30) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ny3.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int i = 0;
        if (this.y >= 0.5f) {
            if (this.G.contains(motionEvent.getX(), motionEvent.getY())) {
                if (motionEvent.getActionMasked() == 1) {
                    int i2 = 0;
                    while (true) {
                        ArrayList arrayList = this.r;
                        if (i >= arrayList.size()) {
                            break;
                        }
                        my3 my3Var = (my3) arrayList.get(i);
                        if (!my3Var.d) {
                            if (Math.abs(motionEvent.getX() - my3Var.b) < hl.L(34.0f) / 2.0f) {
                                g09 g09Var = ((rz8) this.a.b).d;
                                ArrayList arrayList2 = g09Var.J;
                                if (i2 >= 0 && i2 < arrayList2.size()) {
                                    arrayList2.remove(i2);
                                    g09Var.c();
                                    g09Var.i0();
                                }
                                invalidate();
                                return true;
                            }
                            i2++;
                        }
                        i++;
                    }
                }
                return true;
            }
        }
        return false;
    }
}
