package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.os.SystemClock;
import android.util.LongSparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.PhotoViewer;
public final class n02 extends View implements ViewTreeObserver.OnPreDrawListener, ViewTreeObserver.OnScrollChangedListener, ViewTreeObserver.OnGlobalLayoutListener {
    public ViewGroup E;
    public vr1 F;
    public ha4 G;
    public boolean H;
    public boolean I;
    public ViewTreeObserver J;
    public final boolean a;
    public final RectF b;
    public final RectF c;
    public final RectF d;
    public final LongSparseArray e;
    public final fo1 f;
    public ra4 h;
    public final vh2 n;
    public yv1 r;
    public k47 s;
    public long w;
    public boolean x;
    public String y;

    public n02(Context context) {
        super(context);
        this.b = new RectF();
        this.c = new RectF();
        this.d = new RectF();
        this.e = new LongSparseArray();
        this.f = new fo1(this, (byte) 17);
        this.n = new vh2((byte) 2);
        this.a = gda.c1;
    }

    public final void a(k47 k47Var, String str, String str2, String str3, boolean z) {
        long[] jArr;
        long j;
        boolean z2;
        boolean z3;
        k47 k47Var2 = null;
        if (k47Var != null && k47.B0(k47Var.k) == this.w) {
            jArr = g(k47Var);
        } else {
            jArr = null;
        }
        if (jArr == null) {
            return;
        }
        long j2 = k47Var.k.grouped_id;
        int i = (int) jArr[1];
        vh6 vh6Var = this.r.P6;
        int i2 = 0;
        while (true) {
            j = 0;
            if (j2 == 0 || i2 >= vh6Var.m()) {
                break;
            }
            f47 f47Var = (f47) vh6Var.n(i2);
            if (!f47Var.d.isEmpty() && ((k47) f47Var.d.get(0)).k.grouped_id == j2) {
                i = Math.min(i, d(f47Var));
            }
            i2++;
        }
        TLRPC.Chat L0 = oc7.r1(this.r.getCurrentAccount()).L0(Long.valueOf(-jArr[0]));
        long j3 = jArr[0];
        if (L0 != null && !L0.min) {
            j = L0.access_hash;
        }
        String str4 = this.y;
        this.r.getClass();
        la4 la4Var = new la4(j3, j, i, str, str2, str4, null, ia4.d(this.r.getCurrentAccount()), Utilities.b.nextLong());
        if (!this.x) {
            la4Var.k = this.w;
            la4Var.l = k47Var.e1();
        }
        if (z) {
            k47Var2 = k47Var;
        }
        this.s = k47Var2;
        ra4 ra4Var = this.h;
        boolean equals = str.equals("open_media");
        if (!z && (!PhotoViewer.C0() || !PhotoViewer.r0().V0())) {
            z2 = false;
        } else {
            z2 = true;
        }
        ra4Var.a();
        ra4Var.b = la4Var;
        ra4Var.c = SystemClock.uptimeMillis();
        ra4Var.d = equals;
        if (equals && z2) {
            z3 = true;
        } else {
            z3 = false;
        }
        ra4Var.e = z3;
        la4 la4Var2 = null;
        ra4Var.g = null;
        ra4Var.f = true;
        int currentAccount = this.r.getCurrentAccount();
        if (str3 != null) {
            la4Var2 = la4Var;
        }
        ia4.g = la4Var2;
        ia4.h = str3;
        String f = ia4.f(currentAccount);
        la4 a = la4.a(la4Var.b());
        if (f != null) {
            ia4.d.postRunnable(new ba4(f, a, (byte) 1));
        }
        h(100L);
    }

    public final void b(final defpackage.k47 r14, java.lang.String r15) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n02.b(k47, java.lang.String):void");
    }

    public final void c(yv1 yv1Var, long j, ViewGroup viewGroup, vr1 vr1Var) {
        String str;
        this.r = yv1Var;
        this.w = j;
        this.E = viewGroup;
        this.F = vr1Var;
        this.h = new ra4(new h64((byte) 11), new ca4(ia4.f(yv1Var.getCurrentAccount()), (byte) 0));
        boolean V = sd2.V(yv1Var.e);
        this.x = V;
        boolean z = yv1Var.v4;
        boolean v = m9c.v(yv1Var.h());
        if (j == z8c.h(yv1Var.getCurrentAccount()).e()) {
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
            this.G = new ha4(yv1Var.getCurrentAccount(), this.y);
        }
    }

    public final int d(f47 f47Var) {
        ArrayList arrayList = f47Var.d;
        int size = arrayList.size();
        int i = Integer.MAX_VALUE;
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            long[] g = g((k47) obj);
            if (g != null) {
                i = (int) Math.min(i, g[1]);
            }
        }
        return i;
    }

    public final void e() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n02.e():void");
    }

    public final void f() {
        ha4 ha4Var = this.G;
        if (ha4Var != null) {
            pa4 pa4Var = ha4Var.a;
            pa4Var.getClass();
            long uptimeMillis = SystemClock.uptimeMillis();
            HashMap hashMap = pa4Var.c;
            for (oa4 oa4Var : hashMap.values()) {
                oa4Var.a(uptimeMillis);
            }
            pa4Var.f = uptimeMillis;
            if (pa4Var.e) {
                ArrayList arrayList = pa4Var.d;
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    ka4 ka4Var = (ka4) obj;
                    if (hashMap.get(ka4Var.a()) != null && ((oa4) hashMap.get(ka4Var.a())).h) {
                        hashMap.put(ka4Var.a(), new oa4(pa4Var, ka4Var, uptimeMillis));
                    }
                }
            }
        }
        ra4 ra4Var = this.h;
        long uptimeMillis2 = SystemClock.uptimeMillis();
        if (ra4Var.b != null) {
            if ((!ra4Var.d || !ra4Var.e) && uptimeMillis2 >= ra4Var.c + 1000) {
                ra4Var.a();
            }
        }
    }

    public final long[] g(defpackage.k47 r12) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n02.g(k47):long[]");
    }

    public final void h(long j) {
        if (this.I) {
            return;
        }
        this.I = true;
        gm.d3(this.f, j);
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
        gm.r(this.f);
        this.I = false;
        ha4 ha4Var = this.G;
        if (ha4Var != null) {
            ha4Var.a.b(false);
        }
        super.onDetachedFromWindow();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.a) {
            canvas.drawRect(this.c, cmb.Hm);
            int i = 0;
            while (true) {
                LongSparseArray longSparseArray = this.e;
                if (i < longSparseArray.size()) {
                    canvas.drawRect(((m02) longSparseArray.valueAt(i)).a, cmb.Im);
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
