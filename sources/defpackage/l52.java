package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.RectF;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
public final class l52 extends ViewGroup {
    public long E;
    public k52 F;
    public j52 G;
    public float H;
    public float I;
    public float J;
    public float K;
    public final PointF L;
    public boolean M;
    public final o1 N;
    public final i52 O;
    public int P;
    public final m52 Q;
    public final uk1 a;
    public final ArrayList b;
    public final HashMap c;
    public HashMap d;
    public ArrayList e;
    public HashMap f;
    public ArrayList h;
    public final int n;
    public final int r;
    public int s;
    public float w;
    public float x;
    public boolean[] y;

    public l52(m52 m52Var, Context context) {
        super(context);
        this.Q = m52Var;
        this.b = new ArrayList();
        this.c = new HashMap();
        this.n = gl.L(16.0f);
        this.r = gl.L(64.0f);
        this.s = 0;
        this.y = null;
        this.E = 0L;
        this.F = null;
        this.G = null;
        this.H = 0.0f;
        this.L = new PointF();
        this.M = false;
        this.N = new o1(this, (byte) 16);
        this.O = new i52(this);
        this.P = 0;
        setWillNotDraw(false);
        uk1 uk1Var = new uk1(m52Var.n, context, true);
        this.a = uk1Var;
        uk1Var.setCustomText(k96.M0(2131753957, null));
        addView(uk1Var);
    }

    public final void a() {
        String str;
        this.d = this.Q.Q.getSelectedPhotos();
        this.e = new ArrayList(this.d.entrySet());
        this.f = new HashMap();
        this.h = new ArrayList();
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ArrayList arrayList2 = (ArrayList) ((k52) arrayList.get(i)).k.f;
            if (arrayList2.size() != 0) {
                int size2 = arrayList2.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    jm6 jm6Var = (jm6) arrayList2.get(i2);
                    HashMap hashMap = this.c;
                    if (hashMap.containsKey(jm6Var)) {
                        Object obj = hashMap.get(jm6Var);
                        this.f.put(obj, jm6Var);
                        this.h.add(obj);
                    } else {
                        int i3 = 0;
                        while (true) {
                            if (i3 < this.e.size()) {
                                Map.Entry entry = (Map.Entry) this.e.get(i3);
                                Object value = entry.getValue();
                                if (value == jm6Var) {
                                    Object key = entry.getKey();
                                    this.f.put(key, value);
                                    this.h.add(key);
                                    break;
                                }
                                i3++;
                            } else {
                                int i4 = 0;
                                while (true) {
                                    if (i4 < this.e.size()) {
                                        Map.Entry entry2 = (Map.Entry) this.e.get(i4);
                                        Object value2 = entry2.getValue();
                                        if ((value2 instanceof jm6) && (str = ((jm6) value2).I) != null && jm6Var != null && str.equals(jm6Var.I)) {
                                            Object key2 = entry2.getKey();
                                            this.f.put(key2, value2);
                                            this.h.add(key2);
                                            break;
                                        }
                                        i4++;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public final PointF b() {
        m52 m52Var = this.Q;
        j52 j52Var = m52Var.K;
        PointF pointF = this.L;
        if (j52Var == null) {
            pointF.x = 0.0f;
            pointF.y = 0.0f;
            return pointF;
        } else if (!m52Var.L) {
            RectF e = j52Var.e(j52Var.c());
            RectF e2 = m52Var.K.e(1.0f);
            pointF.x = gl.R1((e.width() / 2.0f) + e2.left, m52Var.E - ((m52Var.H - 0.5f) * m52Var.I), this.H);
            pointF.y = gl.R1((e.height() / 2.0f) + m52Var.K.a.a + e2.top, (m52Var.F - ((m52Var.G - 0.5f) * m52Var.J)) + m52Var.N, this.H);
            return pointF;
        } else {
            RectF e3 = j52Var.e(j52Var.c());
            RectF e4 = m52Var.K.e(1.0f);
            pointF.x = gl.R1((e3.width() / 2.0f) + e4.left, this.I, this.H / this.K);
            pointF.y = gl.R1((e3.height() / 2.0f) + m52Var.K.a.a + e4.top, this.J, this.H / this.K);
            return pointF;
        }
    }

    public final void c() {
        ArrayList arrayList;
        int i = 0;
        while (true) {
            arrayList = this.b;
            if (i >= arrayList.size()) {
                break;
            }
            ArrayList arrayList2 = ((k52) arrayList.get(i)).h;
            for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                j52 j52Var = (j52) arrayList2.get(i2);
                pla plaVar = j52Var.s;
                if (plaVar != null) {
                    plaVar.b(j52Var.O.z);
                    j52Var.s = null;
                }
            }
            i++;
        }
        arrayList.clear();
        ArrayList arrayList3 = new ArrayList();
        int size = this.h.size();
        int i3 = size - 1;
        for (int i4 = 0; i4 < size; i4++) {
            Integer num = (Integer) this.h.get(i4);
            num.getClass();
            arrayList3.add((jm6) this.d.get(num));
            if (i4 % 10 == 9 || i4 == i3) {
                k52 k52Var = new k52(this);
                k52Var.b(new g52(this.Q, arrayList3), false);
                arrayList.add(k52Var);
                arrayList3 = new ArrayList();
            }
        }
    }

    public final boolean[] d() {
        m52 m52Var;
        fu fuVar;
        boolean z;
        ArrayList arrayList = this.b;
        boolean[] zArr = new boolean[arrayList.size()];
        float f = this.n;
        int computeVerticalScrollOffset = this.Q.r.computeVerticalScrollOffset();
        this.w = Math.max(0, computeVerticalScrollOffset - m52Var.getListTopPadding());
        this.x = (fuVar.getMeasuredHeight() - m52Var.getListTopPadding()) + computeVerticalScrollOffset;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            float a = ((k52) arrayList.get(i)).a() + f;
            float f2 = this.w;
            if ((f >= f2 && f <= this.x) || ((a >= f2 && a <= this.x) || (f <= f2 && a >= this.x))) {
                z = true;
            } else {
                z = false;
            }
            zArr[i] = z;
            i++;
            f = a;
        }
        return zArr;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j) {
        return false;
    }

    public final int e() {
        int i = this.n + this.r;
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            i = (int) (((k52) arrayList.get(i2)).a() + i);
        }
        uk1 uk1Var = this.a;
        if (uk1Var.getMeasuredHeight() <= 0) {
            uk1Var.measure(View.MeasureSpec.makeMeasureSpec(gl.q.x, 1073741824), -2147473649);
        }
        return uk1Var.getMeasuredHeight() + i;
    }

    public final void f(k52 k52Var, jm6 jm6Var, int i) {
        k52 k52Var2;
        ArrayList arrayList = (ArrayList) k52Var.k.f;
        arrayList.add(Math.min(arrayList.size(), i), jm6Var);
        if (((ArrayList) k52Var.k.f).size() == 11) {
            jm6 jm6Var2 = (jm6) ((ArrayList) k52Var.k.f).get(10);
            ((ArrayList) k52Var.k.f).remove(10);
            ArrayList arrayList2 = this.b;
            int indexOf = arrayList2.indexOf(k52Var);
            if (indexOf >= 0) {
                int i2 = indexOf + 1;
                if (i2 == arrayList2.size()) {
                    k52Var2 = null;
                } else {
                    k52Var2 = (k52) arrayList2.get(i2);
                }
                if (k52Var2 == null) {
                    k52 k52Var3 = new k52(this);
                    ArrayList arrayList3 = new ArrayList();
                    arrayList3.add(jm6Var2);
                    k52Var3.b(new g52(this.Q, arrayList3), true);
                    invalidate();
                } else {
                    f(k52Var2, jm6Var2, 0);
                }
            }
        }
        k52Var.b(k52Var.k, true);
    }

    public final void g() {
        float f = this.n;
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            k52 k52Var = (k52) arrayList.get(i2);
            float a = k52Var.a();
            k52Var.a = f;
            k52Var.b = i;
            f += a;
            i += ((ArrayList) k52Var.k.f).size();
        }
    }

    public final void h() {
        m52 m52Var = this.Q;
        ValueAnimator valueAnimator = m52Var.M;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        PointF b = b();
        float f = this.H;
        this.K = f;
        this.I = b.x;
        this.J = b.y;
        m52Var.L = true;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f, 0.0f);
        m52Var.M = ofFloat;
        ofFloat.addUpdateListener(new h52(this, (byte) 1));
        m52Var.M.addListener(new bb1(this, (byte) 18));
        m52Var.M.setDuration(200L);
        m52Var.M.start();
        invalidate();
    }

    public final void i(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, boolean z) {
        boolean z2;
        boolean z3;
        boolean z4;
        int size = chatAttachAlertPhotoLayout.getSelectedPhotosOrder().size();
        a();
        HashMap hashMap = this.f;
        ArrayList arrayList = this.h;
        e52 e52Var = chatAttachAlertPhotoLayout.H;
        x02 x02Var = chatAttachAlertPhotoLayout.b;
        s42 s42Var = chatAttachAlertPhotoLayout.F;
        HashMap hashMap2 = ChatAttachAlertPhotoLayout.t1;
        hashMap2.clear();
        hashMap2.putAll(hashMap);
        ArrayList arrayList2 = ChatAttachAlertPhotoLayout.u1;
        arrayList2.clear();
        arrayList2.addAll(arrayList);
        if (z) {
            chatAttachAlertPhotoLayout.B0(false);
            chatAttachAlertPhotoLayout.z0();
            int childCount = s42Var.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = s42Var.getChildAt(i);
                if (childAt instanceof o48) {
                    int R = RecyclerView.R(childAt);
                    boolean z5 = e52Var.f;
                    boolean z6 = e52Var.d;
                    if (z5 && R > chatAttachAlertPhotoLayout.N0) {
                        R--;
                    }
                    if (z6 && chatAttachAlertPhotoLayout.U0 == chatAttachAlertPhotoLayout.V0) {
                        R--;
                    }
                    o48 o48Var = (o48) childAt;
                    if (x02Var.N2 != 0 || x02Var.B1) {
                        o48Var.getCheckBox().setVisibility(8);
                    }
                    jm6 d0 = chatAttachAlertPhotoLayout.d0(R);
                    if (d0 != null) {
                        int i2 = d0.C;
                        if (hashMap2.size() > 1) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (z6 && chatAttachAlertPhotoLayout.U0 == chatAttachAlertPhotoLayout.V0) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if (R == e52Var.b() - 1) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        o48Var.d(d0, z2, z3, z4, x02Var.c2);
                        if ((x02Var.Z1 instanceof mu1) && x02Var.Q3) {
                            o48Var.b(arrayList2.indexOf(Integer.valueOf(i2)), hashMap2.containsKey(Integer.valueOf(i2)), false);
                        } else {
                            o48Var.b(-1, hashMap2.containsKey(Integer.valueOf(i2)), false);
                        }
                    }
                }
            }
        }
        if (size != this.h.size()) {
            this.Q.b.F1(1);
        }
    }

    @Override
    public final void invalidate() {
        int c = b00.c(45.0f, gl.q.y - a.getCurrentActionBarHeight(), e());
        if (this.s != c) {
            this.s = c;
            requestLayout();
        }
        super.invalidate();
    }

    public final void j() {
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            k52 k52Var = (k52) arrayList.get(i);
            if (((ArrayList) k52Var.k.f).size() < 10 && i < arrayList.size() - 1) {
                int size2 = 10 - ((ArrayList) k52Var.k.f).size();
                k52 k52Var2 = (k52) arrayList.get(i + 1);
                ArrayList arrayList2 = new ArrayList();
                int min = Math.min(size2, ((ArrayList) k52Var2.k.f).size());
                for (int i2 = 0; i2 < min; i2++) {
                    arrayList2.add((jm6) ((ArrayList) k52Var2.k.f).remove(0));
                }
                ((ArrayList) k52Var.k.f).addAll(arrayList2);
                k52Var.b(k52Var.k, true);
                k52Var2.b(k52Var2.k, true);
            }
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        fu fuVar;
        float f;
        ArrayList arrayList;
        int i;
        int i2;
        int i3;
        boolean z;
        float f2;
        j52 j52Var;
        float f3;
        float f4 = this.n;
        m52 m52Var = this.Q;
        int computeVerticalScrollOffset = m52Var.r.computeVerticalScrollOffset();
        this.w = Math.max(0, computeVerticalScrollOffset - m52Var.getListTopPadding());
        this.x = (fuVar.getMeasuredHeight() - m52Var.getListTopPadding()) + computeVerticalScrollOffset;
        canvas.save();
        canvas.translate(0.0f, f4);
        ArrayList arrayList2 = this.b;
        int size = arrayList2.size();
        float f5 = f4;
        int i4 = 0;
        int i5 = 0;
        while (i4 < size) {
            k52 k52Var = (k52) arrayList2.get(i4);
            float a = k52Var.a();
            k52Var.a = f5;
            k52Var.b = i5;
            float f6 = this.w;
            if (f5 < f6 || f5 > this.x) {
                float f7 = f5 + a;
                if ((f7 < f6 || f7 > this.x) && (f5 > f6 || f7 < this.x)) {
                    f = a;
                    arrayList = arrayList2;
                    i = size;
                    i2 = i4;
                    i3 = i5;
                    canvas.translate(0.0f, f);
                    f5 += f;
                    i5 = ((ArrayList) k52Var.k.f).size() + i3;
                    i4 = i2 + 1;
                    size = i;
                    arrayList2 = arrayList;
                }
            }
            ArrayList arrayList3 = k52Var.h;
            int i6 = k52Var.l;
            m17 m17Var = k52Var.x;
            l52 l52Var = k52Var.z;
            arrayList = arrayList2;
            float interpolation = k52Var.j.getInterpolation(Math.min(1.0f, ((float) (SystemClock.elapsedRealtime() - k52Var.c)) / 200.0f));
            if (interpolation < 1.0f) {
                z = true;
            } else {
                z = false;
            }
            Point point = gl.q;
            float max = Math.max(point.x, point.y) * 0.5f;
            float R1 = gl.R1(k52Var.f, k52Var.d, interpolation);
            int width = l52Var.getWidth();
            m52 m52Var2 = l52Var.Q;
            float previewScale = width * R1 * m52Var2.getPreviewScale();
            boolean z2 = z;
            float previewScale2 = m52Var2.getPreviewScale() * gl.R1(k52Var.g, k52Var.e, interpolation) * max;
            if (m17Var != null) {
                f2 = 2.0f;
                k52Var.p = 0.0f;
                float width2 = l52Var.getWidth();
                float f8 = i6;
                k52Var.n = (width2 - Math.max(f8, previewScale)) / 2.0f;
                k52Var.o = (Math.max(f8, previewScale) + l52Var.getWidth()) / 2.0f;
                k52Var.q = Math.max(i6 << 1, previewScale2);
                k52Var.x.p(0, (int) previewScale, (int) previewScale2, 0, 0, 0, false, false);
                m17Var.setBounds((int) k52Var.n, (int) k52Var.p, (int) k52Var.o, (int) k52Var.q);
                if (k52Var.d <= 0.0f) {
                    f3 = 1.0f - interpolation;
                } else if (k52Var.f <= 0.0f) {
                    f3 = interpolation;
                } else {
                    f3 = 1.0f;
                }
                m17Var.setAlpha((int) (f3 * 255.0f));
                m17Var.d(canvas, k52Var.y, null);
                k52Var.p += f8;
                k52Var.n += f8;
                k52Var.q -= f8;
                k52Var.o -= f8;
            } else {
                f2 = 2.0f;
            }
            k52Var.r = k52Var.o - k52Var.n;
            k52Var.s = k52Var.q - k52Var.p;
            int size2 = arrayList3.size();
            for (int i7 = 0; i7 < size2; i7++) {
                j52 j52Var2 = (j52) arrayList3.get(i7);
                if (j52Var2 != null && (((j52Var = m52Var2.K) == null || j52Var.b != j52Var2.b) && j52Var2.a(canvas, false))) {
                    z2 = true;
                }
            }
            Paint paint = k52Var.w;
            RectF rectF = k52Var.t;
            long j = k52Var.i;
            if (j <= 0) {
                i = size;
                i2 = i4;
                i3 = i5;
                f = a;
            } else {
                if (k52Var.u == null || k52Var.v != j) {
                    k52Var.v = j;
                    k52Var.u = new tgb(jva.a1(false, k96.H(',', "UnlockPaidContent", (int) j), 0.7f, null), 14.0f, gl.o());
                }
                float L = gl.L(28.0f) + k52Var.u.c;
                float L2 = gl.L(32.0f);
                float f9 = k52Var.n;
                float f10 = k52Var.r;
                float f11 = f2;
                float z3 = oo1.z(f10, L, f11, f9);
                i = size;
                float f12 = k52Var.p;
                i2 = i4;
                float f13 = k52Var.s;
                i3 = i5;
                rectF.set(z3, oo1.z(f13, L2, f11, f12), tb4.e(f10, L, f11, f9), tb4.e(f13, L2, f11, f12));
                paint.setColor(1610612736);
                float f14 = L2 / f11;
                canvas.drawRoundRect(rectF, f14, f14, paint);
                f = a;
                k52Var.u.c(gl.L(14.0f) + (((k52Var.r / f11) + k52Var.n) - (L / f11)), k52Var.p + (k52Var.s / f11), 1.0f, -1, canvas);
            }
            if (z2) {
                invalidate();
            }
            canvas.translate(0.0f, f);
            f5 += f;
            i5 = ((ArrayList) k52Var.k.f).size() + i3;
            i4 = i2 + 1;
            size = i;
            arrayList2 = arrayList;
        }
        uk1 uk1Var = this.a;
        uk1Var.k0(f5, uk1Var.getMeasuredHeight());
        if (uk1Var.T()) {
            uk1Var.J(canvas, true);
            uk1Var.M(canvas, true);
        }
        uk1Var.draw(canvas);
        canvas.restore();
        if (m52Var.K != null) {
            canvas.save();
            PointF b = b();
            canvas.translate(b.x, b.y);
            if (m52Var.K.a(canvas, true)) {
                invalidate();
            }
            canvas.restore();
        }
        super.onDraw(canvas);
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        uk1 uk1Var = this.a;
        uk1Var.layout(0, 0, uk1Var.getMeasuredWidth(), uk1Var.getMeasuredHeight());
    }

    @Override
    public final void onMeasure(int i, int i2) {
        this.a.measure(i, -2147473649);
        if (this.s <= 0) {
            this.s = b00.c(45.0f, gl.q.y - a.getCurrentActionBarHeight(), e());
        }
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(Math.max(View.MeasureSpec.getSize(i2), this.s), 1073741824));
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r31) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l52.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
