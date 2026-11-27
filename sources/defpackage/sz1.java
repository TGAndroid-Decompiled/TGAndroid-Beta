package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.net.Uri;
import android.os.SystemClock;
import android.util.LongSparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.PhotoViewer;
public final class sz1 extends View implements ViewTreeObserver.OnPreDrawListener, ViewTreeObserver.OnScrollChangedListener, ViewTreeObserver.OnGlobalLayoutListener {
    public ViewGroup E;
    public wq1 F;
    public da4 G;
    public boolean H;
    public boolean I;
    public ViewTreeObserver J;
    public final boolean a;
    public final RectF b;
    public final RectF c;
    public final RectF d;
    public final LongSparseArray e;
    public final go1 f;
    public na4 h;
    public final zg2 n;
    public zu1 r;
    public r47 s;
    public long w;
    public boolean x;
    public String y;

    public sz1(Context context) {
        super(context);
        this.b = new RectF();
        this.c = new RectF();
        this.d = new RectF();
        this.e = new LongSparseArray();
        this.f = new go1(this, (byte) 18);
        this.n = new zg2((byte) 2);
        this.a = xea.c1;
    }

    public final void a(r47 r47Var, String str, String str2, String str3, boolean z) {
        long[] jArr;
        fa4 fa4Var;
        r47 r47Var2 = r47Var;
        if (r47Var2 != null && r47.B0(r47Var2.k) == this.w) {
            jArr = g(r47Var);
        } else {
            jArr = null;
        }
        if (jArr == null) {
            return;
        }
        long j = r47Var2.k.grouped_id;
        boolean z2 = true;
        zh6 zh6Var = this.r.P6;
        int i = (int) jArr[1];
        for (int i2 = 0; j != 0 && i2 < zh6Var.m(); i2++) {
            m47 m47Var = (m47) zh6Var.n(i2);
            if (!m47Var.d.isEmpty() && ((r47) m47Var.d.get(0)).k.grouped_id == j) {
                i = Math.min(i, d(m47Var));
            }
        }
        TLRPC.Chat M0 = uc7.s1(this.r.getCurrentAccount()).M0(Long.valueOf(-jArr[0]));
        long j2 = 0;
        long j3 = jArr[0];
        if (M0 != null && !M0.min) {
            j2 = M0.access_hash;
        }
        String str4 = this.y;
        ty0 ty0Var = this.r.yb;
        if (ty0Var != null) {
            fa4Var = ty0Var.a(i, j);
        } else {
            fa4Var = null;
        }
        ha4 ha4Var = new ha4(j3, j2, i, str, str2, str4, fa4Var, ea4.g(this.r.getCurrentAccount()), Utilities.b.nextLong());
        if (!this.x) {
            ha4Var.k = this.w;
            ha4Var.l = r47Var2.e1();
        }
        if (!z) {
            r47Var2 = null;
        }
        this.s = r47Var2;
        na4 na4Var = this.h;
        boolean equals = str.equals("open_media");
        if (!z && (!PhotoViewer.C0() || !PhotoViewer.q0().V0())) {
            z2 = false;
        }
        na4Var.a(ha4Var, equals, z2);
        ea4.c(this.r.getCurrentAccount(), ha4Var, str3);
        h(100L);
    }

    public final void b(final r47 r47Var, String str) {
        boolean z;
        if (str != null && m01.h(str)) {
            z = true;
        } else {
            z = false;
        }
        final String b = vke.b(str, z);
        if (b != null) {
            long uptimeMillis = SystemClock.uptimeMillis();
            zg2 zg2Var = this.n;
            if (str != null && str.equals((String) zg2Var.c) && uptimeMillis - zg2Var.b < 1000) {
                return;
            }
            zg2Var.c = str;
            zg2Var.b = uptimeMillis;
            if ("iv".equals(b)) {
                final String uri = m01.C(Uri.parse(str)).toString();
                qx6 qx6Var = ea4.g;
                Runnable runnable = new Runnable(this) {
                    public final sz1 b;

                    {
                        this.b = this;
                    }

                    @Override
                    public final void run() {
                        switch (r4) {
                            case 0:
                                this.b.a(r47Var, "open_iv", null, uri, false);
                                return;
                            default:
                                this.b.a(r47Var, "open_link", uri, null, false);
                                return;
                        }
                    }
                };
                qx6Var.b = str;
                qx6Var.c = runnable;
            } else if ("external".equals(b)) {
                qx6 qx6Var2 = ea4.g;
                Runnable runnable2 = new Runnable(this) {
                    public final sz1 b;

                    {
                        this.b = this;
                    }

                    @Override
                    public final void run() {
                        switch (r4) {
                            case 0:
                                this.b.a(r47Var, "open_iv", null, b, false);
                                return;
                            default:
                                this.b.a(r47Var, "open_link", b, null, false);
                                return;
                        }
                    }
                };
                qx6Var2.b = str;
                qx6Var2.c = runnable2;
            } else {
                a(r47Var, "open_link", b, null, false);
            }
        }
    }

    public final void c(zu1 zu1Var, long j, ViewGroup viewGroup, wq1 wq1Var) {
        String str;
        this.r = zu1Var;
        this.w = j;
        this.E = viewGroup;
        this.F = wq1Var;
        this.h = new na4(new su3((byte) 21), new y94(ea4.i(zu1Var.getCurrentAccount()), (byte) 0));
        boolean V = xc2.V(zu1Var.e);
        this.x = V;
        boolean z = zu1Var.v4;
        boolean v = lbc.v(zu1Var.h());
        if (j == yac.h(zu1Var.getCurrentAccount()).e()) {
            str = "saved";
        } else if (j > 0) {
            if (v) {
                str = "bot";
            } else {
                str = "chat";
            }
        } else if (V) {
            str = "channel";
        } else if (z) {
            str = "discussion";
        } else {
            str = "group";
        }
        this.y = str;
        if (!str.equals("saved")) {
            this.G = new da4(zu1Var.getCurrentAccount(), this.y);
        }
    }

    public final int d(m47 m47Var) {
        ArrayList arrayList = m47Var.d;
        int size = arrayList.size();
        int i = Integer.MAX_VALUE;
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            long[] g = g((r47) obj);
            if (g != null) {
                i = (int) Math.min(i, g[1]);
            }
        }
        return i;
    }

    public final void e() {
        LongSparseArray longSparseArray;
        fa4 fa4Var;
        float f;
        wb2 wb2Var;
        r47 r47Var;
        long[] jArr;
        int i;
        int i2;
        float f2;
        View view;
        byte b;
        long e1;
        m47 m47Var;
        wb2 wb2Var2;
        m47 m47Var2;
        Integer num;
        boolean z;
        float f3;
        byte b2;
        byte b3;
        int i3;
        m47 m47Var3;
        int i4;
        byte b4;
        float[] fArr;
        float f4;
        float f5;
        int i5;
        int i6;
        int i7;
        wb2 wb2Var3;
        long e12;
        if (this.E != null && this.F != null && this.G != null) {
            zu1 zu1Var = this.r;
            wb2 wb2Var4 = null;
            if (zu1Var.yb != null) {
                int currentAccount = zu1Var.getCurrentAccount();
                zu1 zu1Var2 = this.r;
                ty0 ty0Var = zu1Var2.yb;
                if (ea4.a.a.get(Integer.valueOf(currentAccount)) != zu1Var2 || ea4.c > ty0Var.b) {
                    this.r.yb = null;
                }
            }
            LongSparseArray longSparseArray2 = this.e;
            longSparseArray2.clear();
            int childCount = this.F.getChildCount();
            char c = 0;
            int i8 = 0;
            while (i8 < childCount) {
                View childAt = this.F.getChildAt(i8);
                if (childAt instanceof wb2) {
                    wb2Var = (wb2) childAt;
                } else {
                    wb2Var = wb2Var4;
                }
                if (wb2Var != null) {
                    r47Var = wb2Var.getMessageObject();
                } else {
                    r47Var = wb2Var4;
                }
                if (r47Var != null && r47.B0(r47Var.k) == this.w) {
                    jArr = g(r47Var);
                } else {
                    jArr = wb2Var4;
                }
                if (jArr != null) {
                    ViewGroup viewGroup = this.E;
                    RectF rectF = this.d;
                    if (yic.c(childAt, viewGroup, rectF)) {
                        long j = r47Var.k.grouped_id;
                        int i9 = (j > 0L ? 1 : (j == 0L ? 0 : -1));
                        if (i9 != 0) {
                            view = childAt;
                            e1 = j;
                            f2 = 0.0f;
                            b = 1;
                        } else {
                            f2 = 0.0f;
                            view = childAt;
                            b = 1;
                            e1 = r47Var.e1();
                        }
                        rz1 rz1Var = (rz1) longSparseArray2.get(e1);
                        if (rz1Var == null) {
                            if (i9 != 0) {
                                e12 = j;
                            } else {
                                e12 = r47Var.e1();
                            }
                            rz1 rz1Var2 = new rz1();
                            longSparseArray2.put(e12, rz1Var2);
                            rz1Var2.a.set(rectF);
                            rz1Var2.c = j;
                            rz1Var2.d = jArr[c];
                            rz1Var2.e = r47Var.e1();
                            rz1Var = rz1Var2;
                        }
                        HashMap hashMap = rz1Var.j;
                        rz1Var.a.union(rectF);
                        rz1Var.f = (int) Math.min(rz1Var.f, jArr[b]);
                        m47 currentMessagesGroup = wb2Var.getCurrentMessagesGroup();
                        j47 currentPosition = wb2Var.getCurrentPosition();
                        if (i9 != 0) {
                            if (rz1Var.i == null) {
                                ArrayList arrayList = new ArrayList();
                                zh6 zh6Var = this.r.P6;
                                int i10 = 0;
                                while (i10 < zh6Var.m()) {
                                    m47 m47Var4 = (m47) zh6Var.n(i10);
                                    if (!arrayList.contains(m47Var4) && !m47Var4.d.isEmpty()) {
                                        i7 = childCount;
                                        wb2Var3 = wb2Var;
                                        if (((r47) m47Var4.d.get(0)).k.grouped_id == rz1Var.c) {
                                            arrayList.add(m47Var4);
                                        }
                                    } else {
                                        i7 = childCount;
                                        wb2Var3 = wb2Var;
                                    }
                                    i10++;
                                    childCount = i7;
                                    wb2Var = wb2Var3;
                                }
                                i = childCount;
                                wb2Var2 = wb2Var;
                                if (currentMessagesGroup != null && !currentMessagesGroup.d.isEmpty() && !arrayList.contains(currentMessagesGroup)) {
                                    arrayList.add(currentMessagesGroup);
                                }
                                rz1Var.i = new float[0];
                                if (!arrayList.isEmpty()) {
                                    Collections.sort(arrayList, new jz0(this, b));
                                    rz1Var.f = Math.min(rz1Var.f, d((m47) arrayList.get(0)));
                                    int size = arrayList.size();
                                    int i11 = 0;
                                    float f6 = 1.0f;
                                    while (i11 < size) {
                                        Object obj = arrayList.get(i11);
                                        i11++;
                                        ArrayList arrayList2 = ((m47) obj).e;
                                        int size2 = arrayList2.size();
                                        int i12 = 0;
                                        while (i12 < size2) {
                                            Object obj2 = arrayList2.get(i12);
                                            i12++;
                                            int i13 = size;
                                            float f7 = ((j47) obj2).s;
                                            if (f7 > f2) {
                                                f6 = f7;
                                            }
                                            size = i13;
                                        }
                                    }
                                    int size3 = arrayList.size();
                                    int i14 = 0;
                                    while (i14 < size3) {
                                        Object obj3 = arrayList.get(i14);
                                        i14++;
                                        m47 m47Var5 = (m47) obj3;
                                        int length = rz1Var.i.length;
                                        hashMap.put(m47Var5, Integer.valueOf(length));
                                        ArrayList arrayList3 = m47Var5.e;
                                        if (arrayList3.isEmpty()) {
                                            i3 = size3;
                                            m47Var3 = currentMessagesGroup;
                                            float[] copyOf = Arrays.copyOf(rz1Var.i, length + 1);
                                            rz1Var.i = copyOf;
                                            r47 r47Var2 = (r47) m47Var5.d.get(0);
                                            if (!r47Var2.U2() && !r47Var2.I3()) {
                                                fArr = copyOf;
                                                i4 = i8;
                                                TLRPC.PhotoSize w = xb4.w(r47Var2.p0, hl.Y0(false), false, null, false);
                                                if (w != null && (i5 = w.w) > 0 && (i6 = w.h) > 0) {
                                                    f5 = Math.min(1.0f, (i6 * 0.98280096f) / i5);
                                                } else {
                                                    f5 = 1.0f;
                                                }
                                                f4 = f5 * f6;
                                            } else {
                                                fArr = copyOf;
                                                i4 = i8;
                                                f4 = 100.0f;
                                            }
                                            fArr[length] = f4;
                                        } else {
                                            i3 = size3;
                                            m47Var3 = currentMessagesGroup;
                                            i4 = i8;
                                        }
                                        int size4 = arrayList3.size();
                                        int i15 = 0;
                                        while (i15 < size4) {
                                            Object obj4 = arrayList3.get(i15);
                                            i15++;
                                            int i16 = ((j47) obj4).d + length;
                                            float[] fArr2 = rz1Var.i;
                                            int i17 = size4;
                                            if (i16 >= fArr2.length) {
                                                rz1Var.i = Arrays.copyOf(fArr2, i16 + 1);
                                            }
                                            size4 = i17;
                                        }
                                        int size5 = arrayList3.size();
                                        int i18 = 0;
                                        while (i18 < size5) {
                                            Object obj5 = arrayList3.get(i18);
                                            i18++;
                                            j47 j47Var = (j47) obj5;
                                            int i19 = j47Var.c;
                                            int i20 = size5;
                                            while (true) {
                                                if (i19 <= j47Var.d) {
                                                    float[] fArr3 = rz1Var.i;
                                                    int i21 = length + i19;
                                                    float f8 = fArr3[i21];
                                                    int i22 = i18;
                                                    float f9 = j47Var.f;
                                                    float f10 = j47Var.s;
                                                    if (f10 <= f2) {
                                                        f10 = 1.0f;
                                                    }
                                                    fArr3[i21] = Math.max(f8, (f10 * f9) / ((b4 - j47Var.c) + 1));
                                                    i19++;
                                                    i18 = i22;
                                                }
                                            }
                                            size5 = i20;
                                        }
                                        size3 = i3;
                                        currentMessagesGroup = m47Var3;
                                        i8 = i4;
                                    }
                                }
                                m47Var = currentMessagesGroup;
                                i2 = i8;
                            } else {
                                i = childCount;
                                m47Var = currentMessagesGroup;
                                i2 = i8;
                                wb2Var2 = wb2Var;
                            }
                            if (m47Var != null) {
                                m47Var2 = m47Var;
                            } else {
                                int e13 = r47Var.e1();
                                Iterator it = hashMap.keySet().iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        m47 m47Var6 = (m47) it.next();
                                        ArrayList arrayList4 = m47Var6.d;
                                        int size6 = arrayList4.size();
                                        int i23 = 0;
                                        while (i23 < size6) {
                                            Object obj6 = arrayList4.get(i23);
                                            i23++;
                                            if (((r47) obj6).e1() == e13) {
                                                m47Var2 = m47Var6;
                                                break;
                                            }
                                        }
                                    } else {
                                        m47Var2 = null;
                                        break;
                                    }
                                }
                            }
                            if (m47Var2 != null) {
                                num = (Integer) hashMap.get(m47Var2);
                            } else {
                                num = null;
                            }
                            if (num != null && (currentPosition != null || m47Var2.e.isEmpty())) {
                                ImageReceiver photoImage = wb2Var2.getPhotoImage();
                                if (!m47Var2.i && !r47Var.U2() && !r47Var.I3() && photoImage.O0 > f2 && photoImage.M0 >= f2 && photoImage.x() <= view.getHeight()) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                float f11 = rectF.top;
                                if (z) {
                                    f11 += photoImage.M0;
                                }
                                RectF rectF2 = rz1Var.b;
                                float f12 = rectF.left;
                                float f13 = rectF.right;
                                if (z) {
                                    f3 = photoImage.O0 + f11;
                                } else {
                                    f3 = rectF.bottom;
                                }
                                rectF2.union(f12, f11, f13, f3);
                                int i24 = rz1Var.g;
                                int intValue = num.intValue();
                                if (currentPosition != null) {
                                    b2 = currentPosition.c;
                                } else {
                                    b2 = 0;
                                }
                                rz1Var.g = Math.min(i24, intValue + b2);
                                int i25 = rz1Var.h;
                                int intValue2 = num.intValue();
                                if (currentPosition != null) {
                                    b3 = currentPosition.d;
                                } else {
                                    b3 = 0;
                                }
                                rz1Var.h = Math.max(i25, intValue2 + b3);
                            }
                            i8 = i2 + 1;
                            childCount = i;
                            wb2Var4 = null;
                            c = 0;
                        }
                    }
                }
                i = childCount;
                i2 = i8;
                i8 = i2 + 1;
                childCount = i;
                wb2Var4 = null;
                c = 0;
            }
            ArrayList arrayList5 = new ArrayList();
            int i26 = 0;
            while (i26 < longSparseArray2.size()) {
                rz1 rz1Var3 = (rz1) longSparseArray2.valueAt(i26);
                int i27 = rz1Var3.h;
                RectF rectF3 = rz1Var3.a;
                if (i27 >= 0) {
                    float f14 = rectF3.top;
                    float f15 = rectF3.bottom;
                    RectF rectF4 = rz1Var3.b;
                    float f16 = rectF4.top;
                    float f17 = rectF4.bottom;
                    float[] fArr4 = rz1Var3.i;
                    int i28 = rz1Var3.g;
                    longSparseArray = longSparseArray2;
                    float f18 = 0.0f;
                    float f19 = 0.0f;
                    float f20 = 0.0f;
                    for (int i29 = 0; i29 < fArr4.length; i29++) {
                        if (i29 < i28) {
                            f19 += fArr4[i29];
                        } else if (i29 > i27) {
                            f20 += fArr4[i29];
                        } else {
                            f18 += fArr4[i29];
                        }
                    }
                    if (f18 > 0.0f) {
                        f = (f17 - f16) / f18;
                    } else {
                        f = 0.0f;
                    }
                    float[] fArr5 = {Math.min(f14, f16 - (f19 * f)), Math.max(f15, (f20 * f) + f17)};
                    rectF3.top = fArr5[0];
                    rectF3.bottom = fArr5[1];
                } else {
                    longSparseArray = longSparseArray2;
                }
                long j2 = rz1Var3.d;
                int i30 = rz1Var3.f;
                long j3 = rz1Var3.c;
                float f21 = rectF3.top;
                float f22 = rectF3.bottom;
                RectF rectF5 = this.c;
                float f23 = rectF5.top;
                float f24 = rectF5.bottom;
                ty0 ty0Var2 = this.r.yb;
                if (ty0Var2 != null) {
                    fa4Var = ty0Var2.a(i30, j3);
                } else {
                    fa4Var = null;
                }
                ga4 a = vke.a(j2, i30, j3, f21, f22, f23, f24, fa4Var);
                if (a != null) {
                    if (!this.x) {
                        a.a = this.w;
                        a.b = rz1Var3.e;
                    }
                    arrayList5.add(a);
                }
                i26++;
                longSparseArray2 = longSparseArray;
            }
            this.G.a.d(arrayList5);
            if (this.a) {
                invalidate();
            }
        }
    }

    public final void f() {
        da4 da4Var = this.G;
        if (da4Var != null) {
            da4Var.a.e();
        }
        this.h.d(SystemClock.uptimeMillis());
    }

    public final long[] g(defpackage.r47 r12) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sz1.g(r47):long[]");
    }

    public final void h(long j) {
        if (this.I) {
            return;
        }
        this.I = true;
        hl.d3(this.f, j);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        this.J = viewTreeObserver;
        viewTreeObserver.addOnPreDrawListener(this);
        this.J.addOnGlobalLayoutListener(this);
        this.J.addOnScrollChangedListener(this);
        h(100L);
    }

    @Override
    public final void onDetachedFromWindow() {
        ViewTreeObserver viewTreeObserver = this.J;
        if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
            this.J.removeOnPreDrawListener(this);
            this.J.removeOnGlobalLayoutListener(this);
            this.J.removeOnScrollChangedListener(this);
        }
        this.J = null;
        hl.r(this.f);
        this.I = false;
        da4 da4Var = this.G;
        if (da4Var != null) {
            da4Var.a.b(false);
        }
        super.onDetachedFromWindow();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.a) {
            canvas.drawRect(this.c, aob.Im);
            int i = 0;
            while (true) {
                LongSparseArray longSparseArray = this.e;
                if (i < longSparseArray.size()) {
                    canvas.drawRect(((rz1) longSparseArray.valueAt(i)).a, aob.Jm);
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    @Override
    public final void onGlobalLayout() {
        this.H = true;
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        RectF rectF = this.b;
        this.c.set(rectF.left, rectF.top, getMeasuredWidth() - rectF.right, getMeasuredHeight() - rectF.bottom);
    }

    @Override
    public final boolean onPreDraw() {
        if (this.H) {
            e();
            this.H = false;
            if (this.e.size() > 0) {
                h(100L);
                return true;
            }
            return true;
        }
        return true;
    }

    @Override
    public final void onScrollChanged() {
        this.H = true;
    }
}
