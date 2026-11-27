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
public final class b62 extends ViewGroup {
    public long E;
    public a62 F;
    public z52 G;
    public float H;
    public float I;
    public float J;
    public float K;
    public final PointF L;
    public boolean M;
    public final p1 N;
    public final y52 O;
    public int P;
    public final c62 Q;
    public final dl1 a;
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

    public b62(c62 c62Var, Context context) {
        super(context);
        this.Q = c62Var;
        this.b = new ArrayList();
        this.c = new HashMap();
        this.n = hl.L(16.0f);
        this.r = hl.L(64.0f);
        this.s = 0;
        this.y = null;
        this.E = 0L;
        this.F = null;
        this.G = null;
        this.H = 0.0f;
        this.L = new PointF();
        this.M = false;
        this.N = new p1(this, (byte) 16);
        this.O = new y52(this);
        this.P = 0;
        setWillNotDraw(false);
        dl1 dl1Var = new dl1(c62Var.n, context, true);
        this.a = dl1Var;
        dl1Var.setCustomText(ob6.M0(2131753953, null));
        addView(dl1Var);
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
            ArrayList arrayList2 = (ArrayList) ((a62) arrayList.get(i)).k.f;
            if (arrayList2.size() != 0) {
                int size2 = arrayList2.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    no6 no6Var = (no6) arrayList2.get(i2);
                    HashMap hashMap = this.c;
                    if (hashMap.containsKey(no6Var)) {
                        Object obj = hashMap.get(no6Var);
                        this.f.put(obj, no6Var);
                        this.h.add(obj);
                    } else {
                        int i3 = 0;
                        while (true) {
                            if (i3 < this.e.size()) {
                                Map.Entry entry = (Map.Entry) this.e.get(i3);
                                Object value = entry.getValue();
                                if (value == no6Var) {
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
                                        if ((value2 instanceof no6) && (str = ((no6) value2).I) != null && no6Var != null && str.equals(no6Var.I)) {
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
        c62 c62Var = this.Q;
        z52 z52Var = c62Var.K;
        PointF pointF = this.L;
        if (z52Var == null) {
            pointF.x = 0.0f;
            pointF.y = 0.0f;
            return pointF;
        } else if (!c62Var.L) {
            RectF e = z52Var.e(z52Var.c());
            RectF e2 = c62Var.K.e(1.0f);
            pointF.x = hl.R1((e.width() / 2.0f) + e2.left, c62Var.E - ((c62Var.H - 0.5f) * c62Var.I), this.H);
            pointF.y = hl.R1((e.height() / 2.0f) + c62Var.K.a.a + e2.top, (c62Var.F - ((c62Var.G - 0.5f) * c62Var.J)) + c62Var.N, this.H);
            return pointF;
        } else {
            RectF e3 = z52Var.e(z52Var.c());
            RectF e4 = c62Var.K.e(1.0f);
            pointF.x = hl.R1((e3.width() / 2.0f) + e4.left, this.I, this.H / this.K);
            pointF.y = hl.R1((e3.height() / 2.0f) + c62Var.K.a.a + e4.top, this.J, this.H / this.K);
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
            ArrayList arrayList2 = ((a62) arrayList.get(i)).h;
            for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                z52 z52Var = (z52) arrayList2.get(i2);
                mpa mpaVar = z52Var.s;
                if (mpaVar != null) {
                    mpaVar.b(z52Var.O.z);
                    z52Var.s = null;
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
            arrayList3.add((no6) this.d.get(num));
            if (i4 % 10 == 9 || i4 == i3) {
                a62 a62Var = new a62(this);
                a62Var.b(new w52(this.Q, arrayList3), false);
                arrayList.add(a62Var);
                arrayList3 = new ArrayList();
            }
        }
    }

    public final boolean[] d() {
        c62 c62Var;
        gu guVar;
        boolean z;
        ArrayList arrayList = this.b;
        boolean[] zArr = new boolean[arrayList.size()];
        float f = this.n;
        int computeVerticalScrollOffset = this.Q.r.computeVerticalScrollOffset();
        this.w = Math.max(0, computeVerticalScrollOffset - c62Var.getListTopPadding());
        this.x = (guVar.getMeasuredHeight() - c62Var.getListTopPadding()) + computeVerticalScrollOffset;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            float a = ((a62) arrayList.get(i)).a() + f;
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
            i = (int) (((a62) arrayList.get(i2)).a() + i);
        }
        dl1 dl1Var = this.a;
        if (dl1Var.getMeasuredHeight() <= 0) {
            dl1Var.measure(View.MeasureSpec.makeMeasureSpec(hl.q.x, 1073741824), -2147473649);
        }
        return dl1Var.getMeasuredHeight() + i;
    }

    public final void f(a62 a62Var, no6 no6Var, int i) {
        a62 a62Var2;
        ArrayList arrayList = (ArrayList) a62Var.k.f;
        arrayList.add(Math.min(arrayList.size(), i), no6Var);
        if (((ArrayList) a62Var.k.f).size() == 11) {
            no6 no6Var2 = (no6) ((ArrayList) a62Var.k.f).get(10);
            ((ArrayList) a62Var.k.f).remove(10);
            ArrayList arrayList2 = this.b;
            int indexOf = arrayList2.indexOf(a62Var);
            if (indexOf >= 0) {
                int i2 = indexOf + 1;
                if (i2 == arrayList2.size()) {
                    a62Var2 = null;
                } else {
                    a62Var2 = (a62) arrayList2.get(i2);
                }
                if (a62Var2 == null) {
                    a62 a62Var3 = new a62(this);
                    ArrayList arrayList3 = new ArrayList();
                    arrayList3.add(no6Var2);
                    a62Var3.b(new w52(this.Q, arrayList3), true);
                    invalidate();
                } else {
                    f(a62Var2, no6Var2, 0);
                }
            }
        }
        a62Var.b(a62Var.k, true);
    }

    public final void g() {
        float f = this.n;
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            a62 a62Var = (a62) arrayList.get(i2);
            float a = a62Var.a();
            a62Var.a = f;
            a62Var.b = i;
            f += a;
            i += ((ArrayList) a62Var.k.f).size();
        }
    }

    public final void h() {
        c62 c62Var = this.Q;
        ValueAnimator valueAnimator = c62Var.M;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        PointF b = b();
        float f = this.H;
        this.K = f;
        this.I = b.x;
        this.J = b.y;
        c62Var.L = true;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f, 0.0f);
        c62Var.M = ofFloat;
        ofFloat.addUpdateListener(new x52(this, (byte) 0));
        c62Var.M.addListener(new jb1(this, (byte) 18));
        c62Var.M.setDuration(200L);
        c62Var.M.start();
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
        u52 u52Var = chatAttachAlertPhotoLayout.H;
        n12 n12Var = chatAttachAlertPhotoLayout.b;
        i52 i52Var = chatAttachAlertPhotoLayout.F;
        HashMap hashMap2 = ChatAttachAlertPhotoLayout.t1;
        hashMap2.clear();
        hashMap2.putAll(hashMap);
        ArrayList arrayList2 = ChatAttachAlertPhotoLayout.u1;
        arrayList2.clear();
        arrayList2.addAll(arrayList);
        if (z) {
            chatAttachAlertPhotoLayout.B0(false);
            chatAttachAlertPhotoLayout.z0();
            int childCount = i52Var.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = i52Var.getChildAt(i);
                if (childAt instanceof d88) {
                    int S = RecyclerView.S(childAt);
                    boolean z5 = u52Var.f;
                    boolean z6 = u52Var.d;
                    if (z5 && S > chatAttachAlertPhotoLayout.N0) {
                        S--;
                    }
                    if (z6 && chatAttachAlertPhotoLayout.U0 == chatAttachAlertPhotoLayout.V0) {
                        S--;
                    }
                    d88 d88Var = (d88) childAt;
                    if (n12Var.N2 != 0 || n12Var.B1) {
                        d88Var.getCheckBox().setVisibility(8);
                    }
                    no6 c0 = chatAttachAlertPhotoLayout.c0(S);
                    if (c0 != null) {
                        int i2 = c0.C;
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
                        if (S == u52Var.b() - 1) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        d88Var.d(c0, z2, z3, z4, n12Var.c2);
                        if ((n12Var.Z1 instanceof zu1) && n12Var.Q3) {
                            d88Var.b(arrayList2.indexOf(Integer.valueOf(i2)), hashMap2.containsKey(Integer.valueOf(i2)), false);
                        } else {
                            d88Var.b(-1, hashMap2.containsKey(Integer.valueOf(i2)), false);
                        }
                    }
                }
            }
        }
        if (size != this.h.size()) {
            this.Q.b.G1(1);
        }
    }

    @Override
    public final void invalidate() {
        int d = c00.d(45.0f, hl.q.y - a.getCurrentActionBarHeight(), e());
        if (this.s != d) {
            this.s = d;
            requestLayout();
        }
        super.invalidate();
    }

    public final void j() {
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            a62 a62Var = (a62) arrayList.get(i);
            if (((ArrayList) a62Var.k.f).size() < 10 && i < arrayList.size() - 1) {
                int size2 = 10 - ((ArrayList) a62Var.k.f).size();
                a62 a62Var2 = (a62) arrayList.get(i + 1);
                ArrayList arrayList2 = new ArrayList();
                int min = Math.min(size2, ((ArrayList) a62Var2.k.f).size());
                for (int i2 = 0; i2 < min; i2++) {
                    arrayList2.add((no6) ((ArrayList) a62Var2.k.f).remove(0));
                }
                ((ArrayList) a62Var.k.f).addAll(arrayList2);
                a62Var.b(a62Var.k, true);
                a62Var2.b(a62Var2.k, true);
            }
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        gu guVar;
        float f;
        ArrayList arrayList;
        int i;
        int i2;
        int i3;
        boolean z;
        float f2;
        z52 z52Var;
        float f3;
        float f4 = this.n;
        c62 c62Var = this.Q;
        int computeVerticalScrollOffset = c62Var.r.computeVerticalScrollOffset();
        this.w = Math.max(0, computeVerticalScrollOffset - c62Var.getListTopPadding());
        this.x = (guVar.getMeasuredHeight() - c62Var.getListTopPadding()) + computeVerticalScrollOffset;
        canvas.save();
        canvas.translate(0.0f, f4);
        ArrayList arrayList2 = this.b;
        int size = arrayList2.size();
        float f5 = f4;
        int i4 = 0;
        int i5 = 0;
        while (i4 < size) {
            a62 a62Var = (a62) arrayList2.get(i4);
            float a = a62Var.a();
            a62Var.a = f5;
            a62Var.b = i5;
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
                    i5 = ((ArrayList) a62Var.k.f).size() + i3;
                    i4 = i2 + 1;
                    size = i;
                    arrayList2 = arrayList;
                }
            }
            ArrayList arrayList3 = a62Var.h;
            int i6 = a62Var.l;
            t37 t37Var = a62Var.x;
            b62 b62Var = a62Var.z;
            arrayList = arrayList2;
            float interpolation = a62Var.j.getInterpolation(Math.min(1.0f, ((float) (SystemClock.elapsedRealtime() - a62Var.c)) / 200.0f));
            if (interpolation < 1.0f) {
                z = true;
            } else {
                z = false;
            }
            Point point = hl.q;
            float max = Math.max(point.x, point.y) * 0.5f;
            float R1 = hl.R1(a62Var.f, a62Var.d, interpolation);
            int width = b62Var.getWidth();
            c62 c62Var2 = b62Var.Q;
            float previewScale = width * R1 * c62Var2.getPreviewScale();
            boolean z2 = z;
            float previewScale2 = c62Var2.getPreviewScale() * hl.R1(a62Var.g, a62Var.e, interpolation) * max;
            if (t37Var != null) {
                f2 = 2.0f;
                a62Var.p = 0.0f;
                float width2 = b62Var.getWidth();
                float f8 = i6;
                a62Var.n = (width2 - Math.max(f8, previewScale)) / 2.0f;
                a62Var.o = (Math.max(f8, previewScale) + b62Var.getWidth()) / 2.0f;
                a62Var.q = Math.max(i6 << 1, previewScale2);
                a62Var.x.p(0, (int) previewScale, (int) previewScale2, 0, 0, 0, false, false);
                t37Var.setBounds((int) a62Var.n, (int) a62Var.p, (int) a62Var.o, (int) a62Var.q);
                if (a62Var.d <= 0.0f) {
                    f3 = 1.0f - interpolation;
                } else if (a62Var.f <= 0.0f) {
                    f3 = interpolation;
                } else {
                    f3 = 1.0f;
                }
                t37Var.setAlpha((int) (f3 * 255.0f));
                t37Var.d(canvas, a62Var.y, null);
                a62Var.p += f8;
                a62Var.n += f8;
                a62Var.q -= f8;
                a62Var.o -= f8;
            } else {
                f2 = 2.0f;
            }
            a62Var.r = a62Var.o - a62Var.n;
            a62Var.s = a62Var.q - a62Var.p;
            int size2 = arrayList3.size();
            for (int i7 = 0; i7 < size2; i7++) {
                z52 z52Var2 = (z52) arrayList3.get(i7);
                if (z52Var2 != null && (((z52Var = c62Var2.K) == null || z52Var.b != z52Var2.b) && z52Var2.a(canvas, false))) {
                    z2 = true;
                }
            }
            Paint paint = a62Var.w;
            RectF rectF = a62Var.t;
            long j = a62Var.i;
            if (j <= 0) {
                i = size;
                i2 = i4;
                i3 = i5;
                f = a;
            } else {
                if (a62Var.u == null || a62Var.v != j) {
                    a62Var.v = j;
                    a62Var.u = new pkb(nza.b1(false, ob6.H(',', "UnlockPaidContent", (int) j), 0.7f, null), 14.0f, hl.o());
                }
                float L = hl.L(28.0f) + a62Var.u.c;
                float L2 = hl.L(32.0f);
                float f9 = a62Var.n;
                float f10 = a62Var.r;
                float f11 = f2;
                float z3 = bp1.z(f10, L, f11, f9);
                i = size;
                float f12 = a62Var.p;
                i2 = i4;
                float f13 = a62Var.s;
                i3 = i5;
                rectF.set(z3, bp1.z(f13, L2, f11, f12), qd4.e(f10, L, f11, f9), qd4.e(f13, L2, f11, f12));
                paint.setColor(1610612736);
                float f14 = L2 / f11;
                canvas.drawRoundRect(rectF, f14, f14, paint);
                f = a;
                a62Var.u.c(hl.L(14.0f) + (((a62Var.r / f11) + a62Var.n) - (L / f11)), a62Var.p + (a62Var.s / f11), 1.0f, -1, canvas);
            }
            if (z2) {
                invalidate();
            }
            canvas.translate(0.0f, f);
            f5 += f;
            i5 = ((ArrayList) a62Var.k.f).size() + i3;
            i4 = i2 + 1;
            size = i;
            arrayList2 = arrayList;
        }
        dl1 dl1Var = this.a;
        dl1Var.j0(f5, dl1Var.getMeasuredHeight());
        if (dl1Var.S()) {
            dl1Var.I(canvas, true);
            dl1Var.L(canvas, true);
        }
        dl1Var.draw(canvas);
        canvas.restore();
        if (c62Var.K != null) {
            canvas.save();
            PointF b = b();
            canvas.translate(b.x, b.y);
            if (c62Var.K.a(canvas, true)) {
                invalidate();
            }
            canvas.restore();
        }
        super.onDraw(canvas);
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        dl1 dl1Var = this.a;
        dl1Var.layout(0, 0, dl1Var.getMeasuredWidth(), dl1Var.getMeasuredHeight());
    }

    @Override
    public final void onMeasure(int i, int i2) {
        this.a.measure(i, -2147473649);
        if (this.s <= 0) {
            this.s = c00.d(45.0f, hl.q.y - a.getCurrentActionBarHeight(), e());
        }
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(Math.max(View.MeasureSpec.getSize(i2), this.s), 1073741824));
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r30) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.b62.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
