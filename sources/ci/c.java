package ci;

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
    public static final long f5623g0 = System.currentTimeMillis();
    public static final String[] f5624h0 = new String[100];
    public float E;
    public long F;
    public final RectF G;
    public float H;
    public float I;
    public final b1 J;
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
    public final cb.c f5625a;
    public float f5626a0;
    public h0 f5627b;
    public long f5628b0;
    public final Paint f5629c;
    public long f5630c0;
    public final Paint d;
    public boolean f5631d0;
    public final TextPaint f5632e;
    public final int[] f5633e0;
    public final int[] f5634f;
    public final RectF f5635f0;
    public final int[] h;
    public final HashMap f5636n;
    public final ArrayList f5637r;
    public final ArrayList f5638s;
    public final ArrayList f5639w;
    public float f5640x;
    public float f5641y;

    public c(Activity activity, cb.c cVar) {
        super(activity);
        this.f5629c = new Paint(1);
        Paint paint = new Paint(1);
        this.d = paint;
        TextPaint textPaint = new TextPaint(1);
        this.f5632e = textPaint;
        new RectF();
        this.f5634f = new int[2];
        this.h = new int[2];
        this.f5636n = new HashMap();
        this.f5637r = new ArrayList();
        this.f5638s = new ArrayList();
        this.f5639w = new ArrayList();
        this.G = new RectF();
        this.H = Float.NaN;
        this.I = -1.0f;
        this.J = new b1(0);
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
        this.f5626a0 = 0.45f;
        this.f5633e0 = new int[2];
        this.f5635f0 = new RectF();
        this.f5625a = cVar;
        textPaint.setTypeface(org.telegram.messenger.g0.o());
        textPaint.setTextSize(org.telegram.messenger.g0.L(10.0f));
        textPaint.setTextAlign(Paint.Align.CENTER);
        paint.setStyle(Paint.Style.STROKE);
    }

    public static long b() {
        return System.currentTimeMillis() - f5623g0;
    }

    public static float c(float[] fArr, long j3) {
        float min = Math.min(1.0f, ((float) (j3 - fArr[2])) / 180.0f);
        float f10 = fArr[1];
        float max = 1.0f - Math.max(0.0f, Math.min(1.0f, min));
        return ((1.0f - ((max * max) * max)) * (fArr[0] - f10)) + f10;
    }

    public final boolean a(android.graphics.Canvas r37, android.view.ViewGroup r38, java.util.List r39, long r40) {
        throw new UnsupportedOperationException("Method not decompiled: ci.c.a(android.graphics.Canvas, android.view.ViewGroup, java.util.List, long):boolean");
    }

    @Override
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override
    public final void onDraw(android.graphics.Canvas r29) {
        throw new UnsupportedOperationException("Method not decompiled: ci.c.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int i7 = 0;
        if (this.f5641y >= 0.5f) {
            if (this.G.contains(motionEvent.getX(), motionEvent.getY())) {
                if (motionEvent.getActionMasked() == 1) {
                    int i10 = 0;
                    while (true) {
                        ArrayList arrayList = this.f5637r;
                        if (i7 >= arrayList.size()) {
                            break;
                        }
                        b bVar = (b) arrayList.get(i7);
                        if (!bVar.d) {
                            if (Math.abs(motionEvent.getX() - bVar.f5577b) < org.telegram.messenger.g0.L(34.0f) / 2.0f) {
                                z0 z0Var = ((j0) this.f5625a.f5183b).d;
                                ArrayList arrayList2 = z0Var.J;
                                if (i10 >= 0 && i10 < arrayList2.size()) {
                                    arrayList2.remove(i10);
                                    z0Var.c();
                                    z0Var.i0();
                                }
                                invalidate();
                                return true;
                            }
                            i10++;
                        }
                        i7++;
                    }
                }
                return true;
            }
        }
        return false;
    }
}
