package bi;

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
public final class c extends View {
    public static final long f3659g0 = System.currentTimeMillis();
    public static final String[] f3660h0 = new String[100];
    public float E;
    public long F;
    public final RectF G;
    public float H;
    public float I;
    public final c1 J;
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
    public m U;
    public float V;
    public float W;
    public final bb.c f3661a;
    public float f3662a0;
    public h0 f3663b;
    public long f3664b0;
    public final Paint f3665c;
    public long f3666c0;
    public final Paint d;
    public boolean f3667d0;
    public final TextPaint f3668e;
    public final int[] f3669e0;
    public final int[] f3670f;
    public final RectF f3671f0;
    public final int[] h;
    public final HashMap f3672n;
    public final ArrayList f3673r;
    public final ArrayList f3674s;
    public final ArrayList f3675w;
    public float f3676x;
    public float f3677y;

    public c(Activity activity, bb.c cVar) {
        super(activity);
        this.f3665c = new Paint(1);
        Paint paint = new Paint(1);
        this.d = paint;
        TextPaint textPaint = new TextPaint(1);
        this.f3668e = textPaint;
        new RectF();
        this.f3670f = new int[2];
        this.h = new int[2];
        this.f3672n = new HashMap();
        this.f3673r = new ArrayList();
        this.f3674s = new ArrayList();
        this.f3675w = new ArrayList();
        this.G = new RectF();
        this.H = Float.NaN;
        this.I = -1.0f;
        this.J = new c1(0);
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
        this.f3662a0 = 0.45f;
        this.f3669e0 = new int[2];
        this.f3671f0 = new RectF();
        this.f3661a = cVar;
        textPaint.setTypeface(org.telegram.messenger.g0.o());
        textPaint.setTextSize(org.telegram.messenger.g0.L(10.0f));
        textPaint.setTextAlign(Paint.Align.CENTER);
        paint.setStyle(Paint.Style.STROKE);
    }

    public static long b() {
        return System.currentTimeMillis() - f3659g0;
    }

    public static float c(float[] fArr, long j10) {
        float min = Math.min(1.0f, ((float) (j10 - fArr[2])) / 180.0f);
        float f10 = fArr[1];
        float max = 1.0f - Math.max(0.0f, Math.min(1.0f, min));
        return ((1.0f - ((max * max) * max)) * (fArr[0] - f10)) + f10;
    }

    public final boolean a(android.graphics.Canvas r37, android.view.ViewGroup r38, java.util.List r39, long r40) {
        throw new UnsupportedOperationException("Method not decompiled: bi.c.a(android.graphics.Canvas, android.view.ViewGroup, java.util.List, long):boolean");
    }

    @Override
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override
    public final void onDraw(android.graphics.Canvas r30) {
        throw new UnsupportedOperationException("Method not decompiled: bi.c.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int i3 = 0;
        if (this.f3677y >= 0.5f) {
            if (this.G.contains(motionEvent.getX(), motionEvent.getY())) {
                if (motionEvent.getActionMasked() == 1) {
                    int i10 = 0;
                    while (true) {
                        ArrayList arrayList = this.f3673r;
                        if (i3 >= arrayList.size()) {
                            break;
                        }
                        b bVar = (b) arrayList.get(i3);
                        if (!bVar.d) {
                            if (Math.abs(motionEvent.getX() - bVar.f3653b) < org.telegram.messenger.g0.L(34.0f) / 2.0f) {
                                a1 a1Var = ((j0) this.f3661a.f3211b).d;
                                ArrayList arrayList2 = a1Var.J;
                                if (i10 >= 0 && i10 < arrayList2.size()) {
                                    arrayList2.remove(i10);
                                    a1Var.c();
                                    a1Var.i0();
                                }
                                invalidate();
                                return true;
                            }
                            i10++;
                        }
                        i3++;
                    }
                }
                return true;
            }
        }
        return false;
    }
}
