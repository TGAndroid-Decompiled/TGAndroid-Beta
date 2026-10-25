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
import org.telegram.messenger.AndroidUtilities;
public final class d extends View {
    public static final long f1450f0 = System.currentTimeMillis();
    public static final String[] f1451g0 = new String[100];
    public long E;
    public final RectF F;
    public float G;
    public float H;
    public final v1 I;
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
    public final b6.i f1452a;
    public long f1453a0;
    public x0 f1454b;
    public long f1455b0;
    public final Paint f1456c;
    public boolean f1457c0;
    public final Paint d;
    public final int[] f1458d0;
    public final TextPaint e;
    public final RectF f1459e0;
    public final int[] f1460f;
    public final int[] h;
    public final HashMap f1461n;
    public final ArrayList f1462r;
    public final ArrayList f1463s;
    public final ArrayList v;
    public float f1464w;
    public float f1465x;
    public float f1466y;

    public d(Activity activity, b6.i iVar) {
        super(activity);
        this.f1456c = new Paint(1);
        Paint paint = new Paint(1);
        this.d = paint;
        TextPaint textPaint = new TextPaint(1);
        this.e = textPaint;
        new RectF();
        this.f1460f = new int[2];
        this.h = new int[2];
        this.f1461n = new HashMap();
        this.f1462r = new ArrayList();
        this.f1463s = new ArrayList();
        this.v = new ArrayList();
        this.F = new RectF();
        this.G = Float.NaN;
        this.H = -1.0f;
        this.I = new v1(0);
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
        this.f1458d0 = new int[2];
        this.f1459e0 = new RectF();
        this.f1452a = iVar;
        textPaint.setTypeface(AndroidUtilities.bold());
        textPaint.setTextSize(AndroidUtilities.dp(10.0f));
        textPaint.setTextAlign(Paint.Align.CENTER);
        paint.setStyle(Paint.Style.STROKE);
    }

    public static long b() {
        return System.currentTimeMillis() - f1450f0;
    }

    public static float c(float[] fArr, long j10) {
        float min = Math.min(1.0f, ((float) (j10 - fArr[2])) / 180.0f);
        float f7 = fArr[1];
        float max = 1.0f - Math.max(0.0f, Math.min(1.0f, min));
        return ((1.0f - ((max * max) * max)) * (fArr[0] - f7)) + f7;
    }

    public final boolean a(android.graphics.Canvas r37, android.view.ViewGroup r38, java.util.List r39, long r40) {
        throw new UnsupportedOperationException("Method not decompiled: ai.d.a(android.graphics.Canvas, android.view.ViewGroup, java.util.List, long):boolean");
    }

    @Override
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override
    public final void onDraw(android.graphics.Canvas r29) {
        throw new UnsupportedOperationException("Method not decompiled: ai.d.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int i10 = 0;
        if (this.f1465x >= 0.5f) {
            if (this.F.contains(motionEvent.getX(), motionEvent.getY())) {
                if (motionEvent.getActionMasked() == 1) {
                    int i11 = 0;
                    while (true) {
                        ArrayList arrayList = this.f1462r;
                        if (i10 >= arrayList.size()) {
                            break;
                        }
                        c cVar = (c) arrayList.get(i10);
                        if (!cVar.d) {
                            if (Math.abs(motionEvent.getX() - cVar.f1442b) < AndroidUtilities.dp(34.0f) / 2.0f) {
                                t1 t1Var = ((z0) this.f1452a.f3670b).d;
                                ArrayList arrayList2 = t1Var.I;
                                if (i11 >= 0 && i11 < arrayList2.size()) {
                                    arrayList2.remove(i11);
                                    t1Var.c();
                                    t1Var.i0();
                                }
                                invalidate();
                                return true;
                            }
                            i11++;
                        }
                        i10++;
                    }
                }
                return true;
            }
        }
        return false;
    }
}
