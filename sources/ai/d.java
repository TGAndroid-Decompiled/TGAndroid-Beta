package ai;

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
public final class d extends View {
    public static final long f1137f0 = System.currentTimeMillis();
    public static final String[] f1138g0 = new String[100];
    public float D;
    public long E;
    public final RectF F;
    public float G;
    public float H;
    public final n1 I;
    public final Path J;
    public float K;
    public final RectF L;
    public final RectF M;
    public final WeakHashMap N;
    public final Path O;
    public final int[] P;
    public LinearGradient Q;
    public final Paint R;
    public final Paint.FontMetrics S;
    public r T;
    public float U;
    public float V;
    public float W;
    public final aa.n f1139a;
    public long f1140a0;
    public q0 f1141b;
    public long f1142b0;
    public final Paint f1143c;
    public boolean f1144c0;
    public final Paint d;
    public final int[] f1145d0;
    public final TextPaint f1146e;
    public final RectF f1147e0;
    public final int[] f1148f;
    public final int[] h;
    public final HashMap f1149n;
    public final ArrayList f1150r;
    public final ArrayList f1151s;
    public final ArrayList f1152w;
    public float f1153x;
    public float f1154y;

    public d(Activity activity, aa.n nVar) {
        super(activity);
        this.f1143c = new Paint(1);
        Paint paint = new Paint(1);
        this.d = paint;
        TextPaint textPaint = new TextPaint(1);
        this.f1146e = textPaint;
        new RectF();
        this.f1148f = new int[2];
        this.h = new int[2];
        this.f1149n = new HashMap();
        this.f1150r = new ArrayList();
        this.f1151s = new ArrayList();
        this.f1152w = new ArrayList();
        this.F = new RectF();
        this.G = Float.NaN;
        this.H = -1.0f;
        this.I = new n1(0);
        this.J = new Path();
        this.K = Float.NaN;
        this.L = new RectF();
        this.M = new RectF();
        this.N = new WeakHashMap();
        this.O = new Path();
        this.P = new int[2];
        this.R = new Paint(1);
        this.S = new Paint.FontMetrics();
        this.U = Float.NaN;
        this.W = 0.45f;
        this.f1145d0 = new int[2];
        this.f1147e0 = new RectF();
        this.f1139a = nVar;
        textPaint.setTypeface(org.telegram.messenger.g0.o());
        textPaint.setTextSize(org.telegram.messenger.g0.L(10.0f));
        textPaint.setTextAlign(Paint.Align.CENTER);
        paint.setStyle(Paint.Style.STROKE);
    }

    public static long b() {
        return System.currentTimeMillis() - f1137f0;
    }

    public static float c(float[] fArr, long j3) {
        float min = Math.min(1.0f, ((float) (j3 - fArr[2])) / 180.0f);
        float f10 = fArr[1];
        float max = 1.0f - Math.max(0.0f, Math.min(1.0f, min));
        return ((1.0f - ((max * max) * max)) * (fArr[0] - f10)) + f10;
    }

    public final boolean a(android.graphics.Canvas r37, android.view.ViewGroup r38, java.util.List r39, long r40) {
        throw new UnsupportedOperationException("Method not decompiled: ai.d.a(android.graphics.Canvas, android.view.ViewGroup, java.util.List, long):boolean");
    }

    @Override
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override
    public final void onDraw(android.graphics.Canvas r30) {
        throw new UnsupportedOperationException("Method not decompiled: ai.d.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int i7 = 0;
        if (this.f1154y >= 0.5f) {
            if (this.F.contains(motionEvent.getX(), motionEvent.getY())) {
                if (motionEvent.getActionMasked() == 1) {
                    int i10 = 0;
                    while (true) {
                        ArrayList arrayList = this.f1150r;
                        if (i7 >= arrayList.size()) {
                            break;
                        }
                        c cVar = (c) arrayList.get(i7);
                        if (!cVar.d) {
                            if (Math.abs(motionEvent.getX() - cVar.f1133b) < org.telegram.messenger.g0.L(34.0f) / 2.0f) {
                                l1 l1Var = ((s0) this.f1139a.f825b).d;
                                ArrayList arrayList2 = l1Var.I;
                                if (i10 >= 0 && i10 < arrayList2.size()) {
                                    arrayList2.remove(i10);
                                    l1Var.c();
                                    l1Var.i0();
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
