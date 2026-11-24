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
public final class w62 extends ViewGroup {
    public long E;
    public v62 F;
    public u62 G;
    public float H;
    public float I;
    public float J;
    public float K;
    public final PointF L;
    public boolean M;
    public final o1 N;
    public final t62 O;
    public int P;
    public final x62 Q;
    public final cm1 a;
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

    public w62(x62 x62Var, Context context) {
        super(context);
        this.Q = x62Var;
        this.b = new ArrayList();
        this.c = new HashMap();
        this.n = gm.L(16.0f);
        this.r = gm.L(64.0f);
        this.s = 0;
        this.y = null;
        this.E = 0L;
        this.F = null;
        this.G = null;
        this.H = 0.0f;
        this.L = new PointF();
        this.M = false;
        this.N = new o1(this, (byte) 16);
        this.O = new t62(this);
        this.P = 0;
        setWillNotDraw(false);
        cm1 cm1Var = new cm1(x62Var.n, context, true);
        this.a = cm1Var;
        cm1Var.setCustomText(jb6.M0(2131753925, null));
        addView(cm1Var);
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
            ArrayList arrayList2 = (ArrayList) ((v62) arrayList.get(i)).k.f;
            if (arrayList2.size() != 0) {
                int size2 = arrayList2.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    jo6 jo6Var = (jo6) arrayList2.get(i2);
                    HashMap hashMap = this.c;
                    if (hashMap.containsKey(jo6Var)) {
                        Object obj = hashMap.get(jo6Var);
                        this.f.put(obj, jo6Var);
                        this.h.add(obj);
                    } else {
                        int i3 = 0;
                        while (true) {
                            if (i3 < this.e.size()) {
                                Map.Entry entry = (Map.Entry) this.e.get(i3);
                                Object value = entry.getValue();
                                if (value == jo6Var) {
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
                                        if ((value2 instanceof jo6) && (str = ((jo6) value2).I) != null && jo6Var != null && str.equals(jo6Var.I)) {
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
        x62 x62Var = this.Q;
        u62 u62Var = x62Var.K;
        PointF pointF = this.L;
        if (u62Var == null) {
            pointF.x = 0.0f;
            pointF.y = 0.0f;
            return pointF;
        } else if (!x62Var.L) {
            RectF e = u62Var.e(u62Var.c());
            RectF e2 = x62Var.K.e(1.0f);
            pointF.x = gm.R1((e.width() / 2.0f) + e2.left, x62Var.E - ((x62Var.H - 0.5f) * x62Var.I), this.H);
            pointF.y = gm.R1((e.height() / 2.0f) + x62Var.K.a.a + e2.top, (x62Var.F - ((x62Var.G - 0.5f) * x62Var.J)) + x62Var.N, this.H);
            return pointF;
        } else {
            RectF e3 = u62Var.e(u62Var.c());
            RectF e4 = x62Var.K.e(1.0f);
            pointF.x = gm.R1((e3.width() / 2.0f) + e4.left, this.I, this.H / this.K);
            pointF.y = gm.R1((e3.height() / 2.0f) + x62Var.K.a.a + e4.top, this.J, this.H / this.K);
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
            ArrayList arrayList2 = ((v62) arrayList.get(i)).h;
            for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                u62 u62Var = (u62) arrayList2.get(i2);
                qna qnaVar = u62Var.s;
                if (qnaVar != null) {
                    qnaVar.b(u62Var.O.z);
                    u62Var.s = null;
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
            arrayList3.add((jo6) this.d.get(num));
            if (i4 % 10 == 9 || i4 == i3) {
                v62 v62Var = new v62(this);
                v62Var.b(new r62(this.Q, arrayList3), false);
                arrayList.add(v62Var);
                arrayList3 = new ArrayList();
            }
        }
    }

    public final boolean[] d() {
        x62 x62Var;
        fv fvVar;
        boolean z;
        ArrayList arrayList = this.b;
        boolean[] zArr = new boolean[arrayList.size()];
        float f = this.n;
        int computeVerticalScrollOffset = this.Q.r.computeVerticalScrollOffset();
        this.w = Math.max(0, computeVerticalScrollOffset - x62Var.getListTopPadding());
        this.x = (fvVar.getMeasuredHeight() - x62Var.getListTopPadding()) + computeVerticalScrollOffset;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            float a = ((v62) arrayList.get(i)).a() + f;
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
            i = (int) (((v62) arrayList.get(i2)).a() + i);
        }
        cm1 cm1Var = this.a;
        if (cm1Var.getMeasuredHeight() <= 0) {
            cm1Var.measure(View.MeasureSpec.makeMeasureSpec(gm.q.x, 1073741824), -2147473649);
        }
        return cm1Var.getMeasuredHeight() + i;
    }

    public final void f(v62 v62Var, jo6 jo6Var, int i) {
        v62 v62Var2;
        ArrayList arrayList = (ArrayList) v62Var.k.f;
        arrayList.add(Math.min(arrayList.size(), i), jo6Var);
        if (((ArrayList) v62Var.k.f).size() == 11) {
            jo6 jo6Var2 = (jo6) ((ArrayList) v62Var.k.f).get(10);
            ((ArrayList) v62Var.k.f).remove(10);
            ArrayList arrayList2 = this.b;
            int indexOf = arrayList2.indexOf(v62Var);
            if (indexOf >= 0) {
                int i2 = indexOf + 1;
                if (i2 == arrayList2.size()) {
                    v62Var2 = null;
                } else {
                    v62Var2 = (v62) arrayList2.get(i2);
                }
                if (v62Var2 == null) {
                    v62 v62Var3 = new v62(this);
                    ArrayList arrayList3 = new ArrayList();
                    arrayList3.add(jo6Var2);
                    v62Var3.b(new r62(this.Q, arrayList3), true);
                    invalidate();
                } else {
                    f(v62Var2, jo6Var2, 0);
                }
            }
        }
        v62Var.b(v62Var.k, true);
    }

    public final void g() {
        float f = this.n;
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            v62 v62Var = (v62) arrayList.get(i2);
            float a = v62Var.a();
            v62Var.a = f;
            v62Var.b = i;
            f += a;
            i += ((ArrayList) v62Var.k.f).size();
        }
    }

    public final void h() {
        x62 x62Var = this.Q;
        ValueAnimator valueAnimator = x62Var.M;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        PointF b = b();
        float f = this.H;
        this.K = f;
        this.I = b.x;
        this.J = b.y;
        x62Var.L = true;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f, 0.0f);
        x62Var.M = ofFloat;
        ofFloat.addUpdateListener(new s62(this, (byte) 1));
        x62Var.M.addListener(new b91(this, (byte) 20));
        x62Var.M.setDuration(200L);
        x62Var.M.start();
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
        p62 p62Var = chatAttachAlertPhotoLayout.H;
        i22 i22Var = chatAttachAlertPhotoLayout.b;
        d62 d62Var = chatAttachAlertPhotoLayout.F;
        HashMap hashMap2 = ChatAttachAlertPhotoLayout.t1;
        hashMap2.clear();
        hashMap2.putAll(hashMap);
        ArrayList arrayList2 = ChatAttachAlertPhotoLayout.u1;
        arrayList2.clear();
        arrayList2.addAll(arrayList);
        if (z) {
            chatAttachAlertPhotoLayout.B0(false);
            chatAttachAlertPhotoLayout.z0();
            int childCount = d62Var.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = d62Var.getChildAt(i);
                if (childAt instanceof q68) {
                    int R = RecyclerView.R(childAt);
                    boolean z5 = p62Var.f;
                    boolean z6 = p62Var.d;
                    if (z5 && R > chatAttachAlertPhotoLayout.N0) {
                        R--;
                    }
                    if (z6 && chatAttachAlertPhotoLayout.U0 == chatAttachAlertPhotoLayout.V0) {
                        R--;
                    }
                    q68 q68Var = (q68) childAt;
                    if (i22Var.N2 != 0 || i22Var.B1) {
                        q68Var.getCheckBox().setVisibility(8);
                    }
                    jo6 d0 = chatAttachAlertPhotoLayout.d0(R);
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
                        if (R == p62Var.b() - 1) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        q68Var.d(d0, z2, z3, z4, i22Var.c2);
                        if ((i22Var.Z1 instanceof yv1) && i22Var.Q3) {
                            q68Var.b(arrayList2.indexOf(Integer.valueOf(i2)), hashMap2.containsKey(Integer.valueOf(i2)), false);
                        } else {
                            q68Var.b(-1, hashMap2.containsKey(Integer.valueOf(i2)), false);
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
        int c = b10.c(45.0f, gm.q.y - a.getCurrentActionBarHeight(), e());
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
            v62 v62Var = (v62) arrayList.get(i);
            if (((ArrayList) v62Var.k.f).size() < 10 && i < arrayList.size() - 1) {
                int size2 = 10 - ((ArrayList) v62Var.k.f).size();
                v62 v62Var2 = (v62) arrayList.get(i + 1);
                ArrayList arrayList2 = new ArrayList();
                int min = Math.min(size2, ((ArrayList) v62Var2.k.f).size());
                for (int i2 = 0; i2 < min; i2++) {
                    arrayList2.add((jo6) ((ArrayList) v62Var2.k.f).remove(0));
                }
                ((ArrayList) v62Var.k.f).addAll(arrayList2);
                v62Var.b(v62Var.k, true);
                v62Var2.b(v62Var2.k, true);
            }
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        fv fvVar;
        float f;
        ArrayList arrayList;
        int i;
        int i2;
        int i3;
        boolean z;
        float f2;
        u62 u62Var;
        float f3;
        float f4 = this.n;
        x62 x62Var = this.Q;
        int computeVerticalScrollOffset = x62Var.r.computeVerticalScrollOffset();
        this.w = Math.max(0, computeVerticalScrollOffset - x62Var.getListTopPadding());
        this.x = (fvVar.getMeasuredHeight() - x62Var.getListTopPadding()) + computeVerticalScrollOffset;
        canvas.save();
        canvas.translate(0.0f, f4);
        ArrayList arrayList2 = this.b;
        int size = arrayList2.size();
        float f5 = f4;
        int i4 = 0;
        int i5 = 0;
        while (i4 < size) {
            v62 v62Var = (v62) arrayList2.get(i4);
            float a = v62Var.a();
            v62Var.a = f5;
            v62Var.b = i5;
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
                    i5 = ((ArrayList) v62Var.k.f).size() + i3;
                    i4 = i2 + 1;
                    size = i;
                    arrayList2 = arrayList;
                }
            }
            ArrayList arrayList3 = v62Var.h;
            int i6 = v62Var.l;
            m37 m37Var = v62Var.x;
            w62 w62Var = v62Var.z;
            arrayList = arrayList2;
            float interpolation = v62Var.j.getInterpolation(Math.min(1.0f, ((float) (SystemClock.elapsedRealtime() - v62Var.c)) / 200.0f));
            if (interpolation < 1.0f) {
                z = true;
            } else {
                z = false;
            }
            Point point = gm.q;
            float max = Math.max(point.x, point.y) * 0.5f;
            float R1 = gm.R1(v62Var.f, v62Var.d, interpolation);
            int width = w62Var.getWidth();
            x62 x62Var2 = w62Var.Q;
            float previewScale = width * R1 * x62Var2.getPreviewScale();
            boolean z2 = z;
            float previewScale2 = x62Var2.getPreviewScale() * gm.R1(v62Var.g, v62Var.e, interpolation) * max;
            if (m37Var != null) {
                f2 = 2.0f;
                v62Var.p = 0.0f;
                float width2 = w62Var.getWidth();
                float f8 = i6;
                v62Var.n = (width2 - Math.max(f8, previewScale)) / 2.0f;
                v62Var.o = (Math.max(f8, previewScale) + w62Var.getWidth()) / 2.0f;
                v62Var.q = Math.max(i6 << 1, previewScale2);
                v62Var.x.p(0, (int) previewScale, (int) previewScale2, 0, 0, 0, false, false);
                m37Var.setBounds((int) v62Var.n, (int) v62Var.p, (int) v62Var.o, (int) v62Var.q);
                if (v62Var.d <= 0.0f) {
                    f3 = 1.0f - interpolation;
                } else if (v62Var.f <= 0.0f) {
                    f3 = interpolation;
                } else {
                    f3 = 1.0f;
                }
                m37Var.setAlpha((int) (f3 * 255.0f));
                m37Var.d(canvas, v62Var.y, null);
                v62Var.p += f8;
                v62Var.n += f8;
                v62Var.q -= f8;
                v62Var.o -= f8;
            } else {
                f2 = 2.0f;
            }
            v62Var.r = v62Var.o - v62Var.n;
            v62Var.s = v62Var.q - v62Var.p;
            int size2 = arrayList3.size();
            for (int i7 = 0; i7 < size2; i7++) {
                u62 u62Var2 = (u62) arrayList3.get(i7);
                if (u62Var2 != null && (((u62Var = x62Var2.K) == null || u62Var.b != u62Var2.b) && u62Var2.a(canvas, false))) {
                    z2 = true;
                }
            }
            Paint paint = v62Var.w;
            RectF rectF = v62Var.t;
            long j = v62Var.i;
            if (j <= 0) {
                i = size;
                i2 = i4;
                i3 = i5;
                f = a;
            } else {
                if (v62Var.u == null || v62Var.v != j) {
                    v62Var.v = j;
                    v62Var.u = new uib(nxa.b1(false, jb6.H(',', "UnlockPaidContent", (int) j), 0.7f, null), 14.0f, gm.o());
                }
                float L = gm.L(28.0f) + v62Var.u.c;
                float L2 = gm.L(32.0f);
                float f9 = v62Var.n;
                float f10 = v62Var.r;
                float f11 = f2;
                float z3 = aq1.z(f10, L, f11, f9);
                i = size;
                float f12 = v62Var.p;
                i2 = i4;
                float f13 = v62Var.s;
                i3 = i5;
                rectF.set(z3, aq1.z(f13, L2, f11, f12), td4.e(f10, L, f11, f9), td4.e(f13, L2, f11, f12));
                paint.setColor(1610612736);
                float f14 = L2 / f11;
                canvas.drawRoundRect(rectF, f14, f14, paint);
                f = a;
                v62Var.u.c(gm.L(14.0f) + (((v62Var.r / f11) + v62Var.n) - (L / f11)), v62Var.p + (v62Var.s / f11), 1.0f, -1, canvas);
            }
            if (z2) {
                invalidate();
            }
            canvas.translate(0.0f, f);
            f5 += f;
            i5 = ((ArrayList) v62Var.k.f).size() + i3;
            i4 = i2 + 1;
            size = i;
            arrayList2 = arrayList;
        }
        cm1 cm1Var = this.a;
        cm1Var.j0(f5, cm1Var.getMeasuredHeight());
        if (cm1Var.Q()) {
            cm1Var.F(canvas, true);
            cm1Var.I(canvas, true);
        }
        cm1Var.draw(canvas);
        canvas.restore();
        if (x62Var.K != null) {
            canvas.save();
            PointF b = b();
            canvas.translate(b.x, b.y);
            if (x62Var.K.a(canvas, true)) {
                invalidate();
            }
            canvas.restore();
        }
        super.onDraw(canvas);
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        cm1 cm1Var = this.a;
        cm1Var.layout(0, 0, cm1Var.getMeasuredWidth(), cm1Var.getMeasuredHeight());
    }

    @Override
    public final void onMeasure(int i, int i2) {
        this.a.measure(i, -2147473649);
        if (this.s <= 0) {
            this.s = b10.c(45.0f, gm.q.y - a.getCurrentActionBarHeight(), e());
        }
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(Math.max(View.MeasureSpec.getSize(i2), this.s), 1073741824));
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r30) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.w62.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
