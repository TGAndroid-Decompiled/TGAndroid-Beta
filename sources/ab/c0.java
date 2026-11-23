package ab;

import a8.ma;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.util.Log;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.LinearLayout;
import android.widget.TextView;
import c8.na;
import e2.v0;
import e2.y0;
import gb.w0;
import h9.t0;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.hd;
import org.telegram.messenger.o10;
import org.telegram.ui.ActionBar.g2;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.Cells.u2;
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.fw;
import org.telegram.ui.Components.wi0;
import org.telegram.ui.Components.x5;
import org.telegram.ui.Components.xy0;
import org.telegram.ui.Wallet.c5;
import org.telegram.ui.gu0;
import org.telegram.ui.hy0;
import org.telegram.ui.ly0;
import org.telegram.ui.ur0;
import p4.g1;
import p4.k1;
import p4.l1;
import x2.r1;
public final class c0 implements ib.b, wi0, ly0 {
    public static c0 f906f;
    public final int f907a;
    public Object f908b;
    public Object f909c;
    public Object d;
    public Object f910e;

    public c0(Object obj, Object obj2, Object obj3, Object obj4, int i7) {
        this.f907a = i7;
        this.f908b = obj;
        this.f909c = obj2;
        this.d = obj3;
        this.f910e = obj4;
    }

    public static synchronized c0 s() {
        c0 c0Var;
        synchronized (c0.class) {
            try {
                if (f906f == null) {
                    f906f = new c0(0);
                }
                c0Var = f906f;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c0Var;
    }

    public boolean A(p4.v vVar) {
        boolean z10;
        synchronized (this.f908b) {
            if (((a0.f) this.d).get(vVar) != null) {
                z10 = true;
            } else {
                z10 = false;
            }
        }
        return z10;
    }

    public boolean B() {
        return ((ArrayList) this.d).isEmpty();
    }

    public boolean C(p4.v vVar, int i7) {
        p4.h hVar;
        synchronized (this.f908b) {
            hVar = (p4.h) ((a0.f) this.d).get(vVar);
        }
        p4.d0 d0Var = (p4.d0) ((WeakReference) this.f910e).get();
        if (hVar != null && hVar.f55274e.a(i7) && d0Var != null && d0Var.f55205t.t().a(i7)) {
            return true;
        }
        return false;
    }

    public boolean D(p4.v vVar, int i7) {
        p4.h hVar;
        boolean z10;
        synchronized (this.f908b) {
            hVar = (p4.h) ((a0.f) this.d).get(vVar);
        }
        if (hVar != null) {
            l1 l1Var = hVar.d;
            l1Var.getClass();
            if (i7 != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            ma.e("Use contains(Command) for custom command", z10);
            for (k1 k1Var : l1Var.f55334a) {
                if (k1Var.f55330a == i7) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public boolean E() {
        switch (this.f907a) {
            case 10:
                return false;
            default:
                return false;
        }
    }

    public boolean F(p4.v vVar, k1 k1Var) {
        p4.h hVar;
        synchronized (this.f908b) {
            hVar = (p4.h) ((a0.f) this.d).get(vVar);
        }
        if (hVar != null) {
            t0 t0Var = hVar.d.f55334a;
            k1Var.getClass();
            if (t0Var.contains(k1Var) || p4.d.j(k1Var.f55331b)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public boolean G(k.a aVar, MenuItem menuItem) {
        return ((ActionMode.Callback) this.f908b).onActionItemClicked(m(aVar), new l.r((Context) this.f909c, (l0.a) menuItem));
    }

    public boolean H(k.a aVar, Menu menu) {
        ActionMode.Callback callback = (ActionMode.Callback) this.f908b;
        k.e m10 = m(aVar);
        a0.l lVar = (a0.l) this.f910e;
        Menu menu2 = (Menu) lVar.get(menu);
        if (menu2 == null) {
            menu2 = new l.a0((Context) this.f909c, (l.k) menu);
            lVar.put(menu, menu2);
        }
        return callback.onCreateActionMode(m10, menu2);
    }

    public void K(p4.v vVar) {
        synchronized (this.f908b) {
            try {
                p4.h hVar = (p4.h) ((a0.f) this.d).remove(vVar);
                if (hVar == null) {
                    return;
                }
                ((a0.f) this.f909c).remove(hVar.f55271a);
                hVar.f55272b.g();
                p4.d0 d0Var = (p4.d0) ((WeakReference) this.f910e).get();
                if (d0Var != null && !d0Var.j()) {
                    h2.l0.W(d0Var.f55197l, new p4.e(d0Var, vVar, 0));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public java.lang.Object L(kd.c r8) {
        throw new UnsupportedOperationException("Method not decompiled: ab.c0.L(kd.c):java.lang.Object");
    }

    @Override
    public void a() {
        org.telegram.messenger.g0.h3(new hy0((g2) this.f908b, (Context) this.f909c, (h6) this.d, (fw) this.f910e, 2), 200L);
    }

    public void b(Object obj, p4.v vVar, l1 l1Var, y0 y0Var) {
        synchronized (this.f908b) {
            try {
                p4.v r10 = r(obj);
                if (r10 == null) {
                    ((a0.f) this.f909c).put(obj, vVar);
                    ?? obj2 = new Object();
                    obj2.f6349c = new Object();
                    obj2.d = new a0.l(0);
                    ((a0.f) this.d).put(vVar, new p4.h(obj, obj2, l1Var, y0Var));
                } else {
                    p4.h hVar = (p4.h) ((a0.f) this.d).get(r10);
                    hVar.getClass();
                    hVar.d = l1Var;
                    hVar.f55274e = y0Var;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void c(p4.v vVar, int i7, p4.g gVar) {
        synchronized (this.f908b) {
            try {
                p4.h hVar = (p4.h) ((a0.f) this.d).get(vVar);
                if (hVar != null) {
                    y0 y0Var = hVar.f55276g;
                    y0Var.getClass();
                    ca.i iVar = new ca.i();
                    iVar.c(y0Var.f10802a);
                    iVar.b(i7);
                    hVar.f55276g = new y0(iVar.d());
                    hVar.f55273c.add(gVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override
    public void d() {
        org.telegram.messenger.g0.h3(new ur0(26, (g2) this.f908b, (fw) this.f910e), 200L);
    }

    public java.lang.Object e(kd.c r7) {
        throw new UnsupportedOperationException("Method not decompiled: ab.c0.e(kd.c):java.lang.Object");
    }

    public void f(Canvas canvas, int i7) {
        ArrayList arrayList = (ArrayList) this.d;
        canvas.clipRect(0, 0, i7, org.telegram.messenger.g0.L(14.66f));
        RectF rectF = org.telegram.messenger.g0.P;
        float f10 = i7;
        rectF.set(0.0f, 0.0f, f10, org.telegram.messenger.g0.L(14.66f));
        canvas.saveLayerAlpha(rectF, 255, 31);
        if (hd.f24408a0) {
            canvas.translate(f10, 0.0f);
        }
        int L = i7 - org.telegram.messenger.g0.L(25.0f);
        int i10 = 0;
        while (i10 < arrayList.size()) {
            bs bsVar = (bs) arrayList.get(i10);
            L = o10.x(4.0f, bsVar.f33870g, L);
            if (L < 0) {
                break;
            }
            if (hd.f24408a0) {
                canvas.translate(-bsVar.f33870g, 0.0f);
                bsVar.a(canvas);
                canvas.translate(-org.telegram.messenger.g0.L(4.0f), 0.0f);
            } else {
                bsVar.a(canvas);
                canvas.translate(org.telegram.messenger.g0.L(4.0f) + bsVar.f33870g, 0.0f);
            }
            i10++;
        }
        if (i10 < arrayList.size()) {
            int size = arrayList.size() - i10;
            bs bsVar2 = (bs) this.f910e;
            if (bsVar2 == null || bsVar2.f33865a != size) {
                ?? obj = new Object();
                obj.f33865a = size;
                xy0 xy0Var = new xy0(i5.c.i(size, "+"), 10.0f, org.telegram.messenger.g0.o());
                xy0Var.r((u2) this.f908b);
                obj.f33867c = xy0Var;
                int L2 = org.telegram.messenger.g0.L(9.32f);
                xy0 xy0Var2 = obj.f33867c;
                obj.f33870g = L2 + ((int) xy0Var2.f42224c);
                xy0Var2.i();
                int i11 = m6.f29531n8;
                obj.f33869f = i11;
                obj.f33868e = true;
                obj.d = m6.x0(null, i11, false);
                this.f910e = obj;
            }
            if (hd.f24408a0) {
                canvas.translate(-((bs) this.f910e).f33870g, 0.0f);
                ((bs) this.f910e).a(canvas);
                canvas.translate(-org.telegram.messenger.g0.L(4.0f), 0.0f);
            } else {
                ((bs) this.f910e).a(canvas);
                canvas.translate(org.telegram.messenger.g0.L(4.0f) + ((bs) this.f910e).f33870g, 0.0f);
            }
        }
        canvas.restore();
    }

    @Override
    public void g(android.view.View r13, ch.p0 r14, boolean r15, boolean r16) {
        throw new UnsupportedOperationException("Method not decompiled: ab.c0.g(android.view.View, ch.p0, boolean, boolean):void");
    }

    @Override
    public Object mo24get() {
        return new gb.n((o9.g) ((d9.o) this.f908b).f7917a, (jb.l) ((ib.c) this.f909c).mo24get(), (id.h) ((ib.c) this.d).mo24get(), (w0) ((ib.c) this.f910e).mo24get());
    }

    @Override
    public void h() {
        g2 g2Var = (g2) this.f908b;
        g2Var.showDialog(new ug.y0(g2Var, 3, true));
    }

    public void k(p4.h hVar) {
        p4.d0 d0Var = (p4.d0) ((WeakReference) this.f910e).get();
        if (d0Var != null) {
            AtomicBoolean atomicBoolean = new AtomicBoolean(true);
            while (atomicBoolean.get()) {
                atomicBoolean.set(false);
                p4.g gVar = (p4.g) hVar.f55273c.poll();
                if (gVar == null) {
                    hVar.f55275f = false;
                    return;
                }
                AtomicBoolean atomicBoolean2 = new AtomicBoolean(true);
                p4.h hVar2 = hVar;
                h2.l0.W(d0Var.f55197l, new c5(d0Var, r(hVar.f55271a), new gu0(this, gVar, atomicBoolean2, hVar2, atomicBoolean, 12)));
                atomicBoolean2.set(false);
                hVar = hVar2;
            }
        }
    }

    public void l(final p4.v vVar) {
        synchronized (this.f908b) {
            try {
                p4.h hVar = (p4.h) ((a0.f) this.d).get(vVar);
                if (hVar == null) {
                    return;
                }
                final y0 y0Var = hVar.f55276g;
                hVar.f55276g = y0.f10800b;
                hVar.f55273c.add(new p4.g(vVar, y0Var) {
                    public final v f55226b;

                    @Override
                    public final m9.y run() {
                        d0 d0Var = (d0) ((WeakReference) ab.c0.this.f910e).get();
                        if (d0Var != null) {
                            d0Var.p(this.f55226b);
                        }
                        return m9.w.f20954b;
                    }
                });
                if (hVar.f55275f) {
                    return;
                }
                hVar.f55275f = true;
                k(hVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public k.e m(k.a aVar) {
        ArrayList arrayList = (ArrayList) this.d;
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            k.e eVar = (k.e) arrayList.get(i7);
            if (eVar != null && eVar.f18062b == aVar) {
                return eVar;
            }
        }
        k.e eVar2 = new k.e((Context) this.f909c, aVar);
        arrayList.add(eVar2);
        return eVar2;
    }

    public y0 n(p4.v vVar) {
        synchronized (this.f908b) {
            try {
                p4.h hVar = (p4.h) ((a0.f) this.d).get(vVar);
                if (hVar != null) {
                    return hVar.f55274e;
                }
                return null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override
    public boolean o() {
        switch (this.f907a) {
            case 10:
                return true;
            default:
                return true;
        }
    }

    public h9.i0 p() {
        h9.i0 q10;
        synchronized (this.f908b) {
            q10 = h9.i0.q(((a0.f) this.f909c).values());
        }
        return q10;
    }

    @Override
    public boolean q() {
        switch (this.f907a) {
            case 10:
                return false;
            default:
                return false;
        }
    }

    public p4.v r(Object obj) {
        p4.v vVar;
        synchronized (this.f908b) {
            vVar = (p4.v) ((a0.f) this.f909c).get(obj);
        }
        return vVar;
    }

    public v0 t(p4.v vVar) {
        synchronized (this.f908b) {
            try {
                return ((p4.h) ((a0.f) this.d).get(vVar)) != null ? null : null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public String toString() {
        switch (this.f907a) {
            case 16:
                return ((ze.b) this.f910e).toString();
            default:
                return super.toString();
        }
    }

    public g1 u(p4.v vVar) {
        synchronized (this.f908b) {
            try {
                if (((p4.h) ((a0.f) this.d).get(vVar)) != null) {
                    return null;
                }
                return null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public com.google.android.gms.common.api.internal.t v(p4.v vVar) {
        p4.h hVar;
        synchronized (this.f908b) {
            hVar = (p4.h) ((a0.f) this.d).get(vVar);
        }
        if (hVar != null) {
            return hVar.f55272b;
        }
        return null;
    }

    public boolean w(Context context) {
        boolean z10;
        if (((Boolean) this.d) == null) {
            if (context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.d = Boolean.valueOf(z10);
        }
        if (!((Boolean) this.f909c).booleanValue() && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Missing Permission: android.permission.ACCESS_NETWORK_STATE this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return ((Boolean) this.d).booleanValue();
    }

    @Override
    public void x(Canvas canvas, RectF rectF, float f10, float f11, float f12, int i7, boolean z10) {
        int i10 = this.f907a;
    }

    public boolean y(Context context) {
        boolean z10;
        if (((Boolean) this.f909c) == null) {
            if (context.checkCallingOrSelfPermission("android.permission.WAKE_LOCK") == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f909c = Boolean.valueOf(z10);
        }
        if (!((Boolean) this.f909c).booleanValue() && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Missing Permission: android.permission.WAKE_LOCK this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return ((Boolean) this.f909c).booleanValue();
    }

    @Override
    public void z() {
        int i7 = this.f907a;
    }

    public c0(Object obj, Object obj2, Object obj3, Object obj4, boolean z10, int i7) {
        this.f907a = i7;
        this.f910e = obj;
        this.f908b = obj2;
        this.f909c = obj3;
        this.d = obj4;
    }

    public c0(u2 u2Var) {
        this.f907a = 9;
        this.f909c = new ArrayList();
        this.d = new ArrayList();
        this.f910e = null;
        this.f908b = u2Var;
    }

    public c0(p4.d0 d0Var) {
        this.f907a = 13;
        this.f909c = new a0.l(0);
        this.d = new a0.l(0);
        this.f908b = new Object();
        this.f910e = new WeakReference(d0Var);
    }

    public c0(Typeface typeface, s1.b bVar) {
        int i7;
        int i10;
        int i11;
        int i12;
        this.f907a = 1;
        this.f910e = typeface;
        this.f908b = bVar;
        this.d = new androidx.emoji2.text.t(1024);
        int a10 = bVar.a(6);
        if (a10 != 0) {
            int i13 = a10 + bVar.f56302a;
            i7 = ((ByteBuffer) bVar.d).getInt(((ByteBuffer) bVar.d).getInt(i13) + i13);
        } else {
            i7 = 0;
        }
        this.f909c = new char[i7 * 2];
        int a11 = bVar.a(6);
        if (a11 != 0) {
            int i14 = a11 + bVar.f56302a;
            i10 = ((ByteBuffer) bVar.d).getInt(((ByteBuffer) bVar.d).getInt(i14) + i14);
        } else {
            i10 = 0;
        }
        for (int i15 = 0; i15 < i10; i15++) {
            androidx.emoji2.text.p pVar = new androidx.emoji2.text.p(this, i15);
            s1.a b10 = pVar.b();
            int a12 = b10.a(4);
            Character.toChars(a12 != 0 ? ((ByteBuffer) b10.d).getInt(a12 + b10.f56302a) : 0, (char[]) this.f909c, i15 * 2);
            s1.a b11 = pVar.b();
            int a13 = b11.a(16);
            if (a13 != 0) {
                int i16 = a13 + b11.f56302a;
                i11 = ((ByteBuffer) b11.d).getInt(((ByteBuffer) b11.d).getInt(i16) + i16);
            } else {
                i11 = 0;
            }
            if (i11 > 0) {
                androidx.emoji2.text.t tVar = (androidx.emoji2.text.t) this.d;
                s1.a b12 = pVar.b();
                int a14 = b12.a(16);
                if (a14 != 0) {
                    int i17 = a14 + b12.f56302a;
                    i12 = ((ByteBuffer) b12.d).getInt(((ByteBuffer) b12.d).getInt(i17) + i17);
                } else {
                    i12 = 0;
                }
                tVar.a(pVar, 0, i12 - 1);
            } else {
                throw new IllegalArgumentException("invalid metadata codepoint length");
            }
        }
    }

    private final void I() {
    }

    private final void J() {
    }

    public c0(int i7) {
        this.f907a = i7;
        switch (i7) {
            case 2:
                return;
            case 8:
                this.f908b = new ArrayList();
                this.f909c = new ArrayList();
                this.d = new ArrayList();
                this.f910e = new ArrayList();
                return;
            default:
                this.f908b = null;
                this.f909c = null;
                this.d = null;
                this.f910e = new ArrayDeque();
                return;
        }
    }

    public c0(Context context, ActionMode.Callback callback) {
        this.f907a = 5;
        this.f909c = context;
        this.f908b = callback;
        this.d = new ArrayList();
        this.f910e = new a0.l(0);
    }

    public c0(ng.e eVar) {
        this.f907a = 7;
        LinearLayout linearLayout = new LinearLayout(eVar.getContext());
        this.f910e = linearLayout;
        linearLayout.setPadding(org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(2.0f));
        if (eVar.F) {
            TextView textView = new TextView(eVar.getContext());
            this.d = textView;
            linearLayout.addView(textView);
            textView.getLayoutParams().width = org.telegram.messenger.g0.L(36.0f);
            textView.setVisibility(8);
            textView.setTypeface(org.telegram.messenger.g0.o());
            textView.setTextSize(1, 13.0f);
        }
        TextView textView2 = new TextView(eVar.getContext());
        this.f909c = textView2;
        linearLayout.addView(textView2, na.k(0.0f, 0.0f, 20.0f, 0.0f, -2, -2));
        x5 x5Var = new x5(eVar.getContext());
        this.f908b = x5Var;
        linearLayout.addView(x5Var, na.o(-1, -2));
        textView2.setGravity(8388611);
        x5Var.setGravity(8388613);
        x5Var.setTypeface(org.telegram.messenger.g0.o());
        x5Var.setTextSize(1, 13.0f);
        textView2.setTextSize(1, 13.0f);
    }

    public c0(m1.b0 b0Var, List list) {
        this.f907a = 6;
        this.f910e = b0Var;
        this.f908b = new ie.d();
        this.f909c = zd.b0.a();
        this.d = hd.f.l(list);
    }

    public c0(r1 r1Var, boolean[] zArr) {
        this.f907a = 15;
        this.f908b = r1Var;
        this.f909c = zArr;
        int i7 = r1Var.f60223a;
        this.d = new boolean[i7];
        this.f910e = new boolean[i7];
    }

    private final void i(Canvas canvas, RectF rectF, float f10, float f11, float f12, int i7, boolean z10) {
    }

    private final void j(Canvas canvas, RectF rectF, float f10, float f11, float f12, int i7, boolean z10) {
    }
}
