package ab;

import a8.ja;
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
import org.telegram.messenger.i20;
import org.telegram.ui.ActionBar.e2;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Cells.t2;
import org.telegram.ui.Components.ff;
import org.telegram.ui.Components.hh0;
import org.telegram.ui.Components.li0;
import org.telegram.ui.Components.o5;
import org.telegram.ui.Components.oy0;
import org.telegram.ui.Components.sr;
import org.telegram.ui.cu0;
import org.telegram.ui.cy0;
import org.telegram.ui.fy0;
import org.telegram.ui.hy0;
import org.telegram.ui.web.e1;
import p4.i1;
import p4.j1;
import ug.x0;
import x2.q1;
public final class c0 implements ib.b, li0, hy0 {
    public static c0 f907f;
    public final int f908a;
    public Object f909b;
    public Object f910c;
    public Object d;
    public Object f911e;

    public c0(Object obj, Object obj2, Object obj3, Object obj4, int i7) {
        this.f908a = i7;
        this.f909b = obj;
        this.f910c = obj2;
        this.d = obj3;
        this.f911e = obj4;
    }

    public static synchronized c0 q() {
        c0 c0Var;
        synchronized (c0.class) {
            try {
                if (f907f == null) {
                    f907f = new c0(0);
                }
                c0Var = f907f;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c0Var;
    }

    public boolean A(p4.v vVar, int i7) {
        p4.h hVar;
        boolean z10;
        synchronized (this.f909b) {
            hVar = (p4.h) ((a0.f) this.d).get(vVar);
        }
        if (hVar != null) {
            j1 j1Var = hVar.d;
            j1Var.getClass();
            if (i7 != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            ja.e("Use contains(Command) for custom command", z10);
            for (i1 i1Var : j1Var.f54753a) {
                if (i1Var.f54725a == i7) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public boolean B() {
        switch (this.f908a) {
            case 10:
                return false;
            default:
                return false;
        }
    }

    public boolean C(p4.v vVar, i1 i1Var) {
        p4.h hVar;
        synchronized (this.f909b) {
            hVar = (p4.h) ((a0.f) this.d).get(vVar);
        }
        if (hVar != null) {
            t0 t0Var = hVar.d.f54753a;
            i1Var.getClass();
            if (t0Var.contains(i1Var) || p4.d.j(i1Var.f54726b)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public boolean D(k.a aVar, MenuItem menuItem) {
        return ((ActionMode.Callback) this.f909b).onActionItemClicked(m(aVar), new l.r((Context) this.f910c, (l0.a) menuItem));
    }

    public boolean E(k.a aVar, Menu menu) {
        ActionMode.Callback callback = (ActionMode.Callback) this.f909b;
        k.e m10 = m(aVar);
        a0.l lVar = (a0.l) this.f911e;
        Menu menu2 = (Menu) lVar.get(menu);
        if (menu2 == null) {
            menu2 = new l.a0((Context) this.f910c, (l.k) menu);
            lVar.put(menu, menu2);
        }
        return callback.onCreateActionMode(m10, menu2);
    }

    public void H(p4.v vVar) {
        synchronized (this.f909b) {
            try {
                p4.h hVar = (p4.h) ((a0.f) this.d).remove(vVar);
                if (hVar == null) {
                    return;
                }
                ((a0.f) this.f910c).remove(hVar.f54699a);
                hVar.f54700b.g();
                p4.d0 d0Var = (p4.d0) ((WeakReference) this.f911e).get();
                if (d0Var != null && !d0Var.j()) {
                    h2.l0.W(d0Var.f54627l, new p4.e(d0Var, vVar, 0));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public java.lang.Object I(kd.c r8) {
        throw new UnsupportedOperationException("Method not decompiled: ab.c0.I(kd.c):java.lang.Object");
    }

    @Override
    public void J(Canvas canvas, RectF rectF, float f10, float f11, float f12, int i7, boolean z10) {
        int i10 = this.f908a;
    }

    @Override
    public void K() {
        int i7 = this.f908a;
    }

    @Override
    public boolean L() {
        switch (this.f908a) {
            case 10:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void a() {
        org.telegram.messenger.g0.i3(new cy0((e2) this.f909b, (Context) this.f910c, (e6) this.d, (hh0) this.f911e, 2), 200L);
    }

    public void b(Object obj, p4.v vVar, j1 j1Var, y0 y0Var) {
        synchronized (this.f909b) {
            try {
                p4.v p10 = p(obj);
                if (p10 == null) {
                    ((a0.f) this.f910c).put(obj, vVar);
                    ?? obj2 = new Object();
                    obj2.f6071c = new Object();
                    obj2.d = new a0.l(0);
                    ((a0.f) this.d).put(vVar, new p4.h(obj, obj2, j1Var, y0Var));
                } else {
                    p4.h hVar = (p4.h) ((a0.f) this.d).get(p10);
                    hVar.getClass();
                    hVar.d = j1Var;
                    hVar.f54702e = y0Var;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void c(p4.v vVar, int i7, p4.g gVar) {
        synchronized (this.f909b) {
            try {
                p4.h hVar = (p4.h) ((a0.f) this.d).get(vVar);
                if (hVar != null) {
                    y0 y0Var = hVar.f54704g;
                    y0Var.getClass();
                    ca.i iVar = new ca.i();
                    iVar.c(y0Var.f10492a);
                    iVar.b(i7);
                    hVar.f54704g = new y0(iVar.d());
                    hVar.f54701c.add(gVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override
    public void d() {
        org.telegram.messenger.g0.i3(new fy0(1, (e2) this.f909b, (hh0) this.f911e), 200L);
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
        if (hd.f24101a0) {
            canvas.translate(f10, 0.0f);
        }
        int L = i7 - org.telegram.messenger.g0.L(25.0f);
        int i10 = 0;
        while (i10 < arrayList.size()) {
            sr srVar = (sr) arrayList.get(i10);
            L = i20.w(4.0f, srVar.f39398g, L);
            if (L < 0) {
                break;
            }
            if (hd.f24101a0) {
                canvas.translate(-srVar.f39398g, 0.0f);
                srVar.a(canvas);
                canvas.translate(-org.telegram.messenger.g0.L(4.0f), 0.0f);
            } else {
                srVar.a(canvas);
                canvas.translate(org.telegram.messenger.g0.L(4.0f) + srVar.f39398g, 0.0f);
            }
            i10++;
        }
        if (i10 < arrayList.size()) {
            int size = arrayList.size() - i10;
            sr srVar2 = (sr) this.f911e;
            if (srVar2 == null || srVar2.f39393a != size) {
                ?? obj = new Object();
                obj.f39393a = size;
                oy0 oy0Var = new oy0(i5.c.i(size, "+"), 10.0f, org.telegram.messenger.g0.o());
                oy0Var.r((t2) this.f909b);
                obj.f39395c = oy0Var;
                int L2 = org.telegram.messenger.g0.L(9.32f);
                oy0 oy0Var2 = obj.f39395c;
                obj.f39398g = L2 + ((int) oy0Var2.f38105c);
                oy0Var2.i();
                int i11 = j6.f29033n8;
                obj.f39397f = i11;
                obj.f39396e = true;
                obj.d = j6.x0(null, i11, false);
                this.f911e = obj;
            }
            if (hd.f24101a0) {
                canvas.translate(-((sr) this.f911e).f39398g, 0.0f);
                ((sr) this.f911e).a(canvas);
                canvas.translate(-org.telegram.messenger.g0.L(4.0f), 0.0f);
            } else {
                ((sr) this.f911e).a(canvas);
                canvas.translate(org.telegram.messenger.g0.L(4.0f) + ((sr) this.f911e).f39398g, 0.0f);
            }
        }
        canvas.restore();
    }

    @Override
    public void g() {
        e2 e2Var = (e2) this.f909b;
        e2Var.showDialog(new x0(e2Var, 3, true));
    }

    @Override
    public Object mo24get() {
        return new gb.n((o9.g) ((d9.o) this.f909b).f7640b, (jb.l) ((ib.c) this.f910c).mo24get(), (id.h) ((ib.c) this.d).mo24get(), (w0) ((ib.c) this.f911e).mo24get());
    }

    @Override
    public void h(android.view.View r13, ch.p0 r14, boolean r15, boolean r16) {
        throw new UnsupportedOperationException("Method not decompiled: ab.c0.h(android.view.View, ch.p0, boolean, boolean):void");
    }

    public void k(p4.h hVar) {
        p4.d0 d0Var = (p4.d0) ((WeakReference) this.f911e).get();
        if (d0Var != null) {
            AtomicBoolean atomicBoolean = new AtomicBoolean(true);
            while (atomicBoolean.get()) {
                atomicBoolean.set(false);
                p4.g gVar = (p4.g) hVar.f54701c.poll();
                if (gVar == null) {
                    hVar.f54703f = false;
                    return;
                }
                AtomicBoolean atomicBoolean2 = new AtomicBoolean(true);
                p4.h hVar2 = hVar;
                h2.l0.W(d0Var.f54627l, new e1(d0Var, p(hVar.f54699a), new cu0(this, gVar, atomicBoolean2, hVar2, atomicBoolean, 12)));
                atomicBoolean2.set(false);
                hVar = hVar2;
            }
        }
    }

    public void l(final p4.v vVar) {
        synchronized (this.f909b) {
            try {
                p4.h hVar = (p4.h) ((a0.f) this.d).get(vVar);
                if (hVar == null) {
                    return;
                }
                final y0 y0Var = hVar.f54704g;
                hVar.f54704g = y0.f10490b;
                hVar.f54701c.add(new p4.g(vVar, y0Var) {
                    public final v f54686b;

                    @Override
                    public final m9.y run() {
                        d0 d0Var = (d0) ((WeakReference) ab.c0.this.f911e).get();
                        if (d0Var != null) {
                            d0Var.p(this.f54686b);
                        }
                        return m9.w.f20596b;
                    }
                });
                if (hVar.f54703f) {
                    return;
                }
                hVar.f54703f = true;
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
            if (eVar != null && eVar.f17673b == aVar) {
                return eVar;
            }
        }
        k.e eVar2 = new k.e((Context) this.f910c, aVar);
        arrayList.add(eVar2);
        return eVar2;
    }

    public y0 n(p4.v vVar) {
        synchronized (this.f909b) {
            try {
                p4.h hVar = (p4.h) ((a0.f) this.d).get(vVar);
                if (hVar != null) {
                    return hVar.f54702e;
                }
                return null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public h9.i0 o() {
        h9.i0 q10;
        synchronized (this.f909b) {
            q10 = h9.i0.q(((a0.f) this.f910c).values());
        }
        return q10;
    }

    public p4.v p(Object obj) {
        p4.v vVar;
        synchronized (this.f909b) {
            vVar = (p4.v) ((a0.f) this.f910c).get(obj);
        }
        return vVar;
    }

    @Override
    public boolean r() {
        switch (this.f908a) {
            case 10:
                return true;
            default:
                return true;
        }
    }

    public v0 s(p4.v vVar) {
        synchronized (this.f909b) {
            try {
                return ((p4.h) ((a0.f) this.d).get(vVar)) != null ? null : null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public p4.e1 t(p4.v vVar) {
        synchronized (this.f909b) {
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

    public String toString() {
        switch (this.f908a) {
            case 16:
                return ((ff) this.f911e).toString();
            default:
                return super.toString();
        }
    }

    public com.google.android.gms.common.api.internal.t u(p4.v vVar) {
        p4.h hVar;
        synchronized (this.f909b) {
            hVar = (p4.h) ((a0.f) this.d).get(vVar);
        }
        if (hVar != null) {
            return hVar.f54700b;
        }
        return null;
    }

    public boolean v(Context context) {
        boolean z10;
        if (((Boolean) this.d) == null) {
            if (context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.d = Boolean.valueOf(z10);
        }
        if (!((Boolean) this.f910c).booleanValue() && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Missing Permission: android.permission.ACCESS_NETWORK_STATE this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return ((Boolean) this.d).booleanValue();
    }

    public boolean w(Context context) {
        boolean z10;
        if (((Boolean) this.f910c) == null) {
            if (context.checkCallingOrSelfPermission("android.permission.WAKE_LOCK") == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f910c = Boolean.valueOf(z10);
        }
        if (!((Boolean) this.f910c).booleanValue() && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Missing Permission: android.permission.WAKE_LOCK this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return ((Boolean) this.f910c).booleanValue();
    }

    public boolean x(p4.v vVar) {
        boolean z10;
        synchronized (this.f909b) {
            if (((a0.f) this.d).get(vVar) != null) {
                z10 = true;
            } else {
                z10 = false;
            }
        }
        return z10;
    }

    public boolean y() {
        return ((ArrayList) this.d).isEmpty();
    }

    public boolean z(p4.v vVar, int i7) {
        p4.h hVar;
        synchronized (this.f909b) {
            hVar = (p4.h) ((a0.f) this.d).get(vVar);
        }
        p4.d0 d0Var = (p4.d0) ((WeakReference) this.f911e).get();
        if (hVar != null && hVar.f54702e.a(i7) && d0Var != null && d0Var.f54635t.t().a(i7)) {
            return true;
        }
        return false;
    }

    public c0(Object obj, Object obj2, Object obj3, Object obj4, boolean z10, int i7) {
        this.f908a = i7;
        this.f911e = obj;
        this.f909b = obj2;
        this.f910c = obj3;
        this.d = obj4;
    }

    public c0(t2 t2Var) {
        this.f908a = 9;
        this.f910c = new ArrayList();
        this.d = new ArrayList();
        this.f911e = null;
        this.f909b = t2Var;
    }

    public c0(p4.d0 d0Var) {
        this.f908a = 13;
        this.f910c = new a0.l(0);
        this.d = new a0.l(0);
        this.f909b = new Object();
        this.f911e = new WeakReference(d0Var);
    }

    public c0(Typeface typeface, s1.b bVar) {
        int i7;
        int i10;
        int i11;
        int i12;
        this.f908a = 1;
        this.f911e = typeface;
        this.f909b = bVar;
        this.d = new androidx.emoji2.text.t(1024);
        int a10 = bVar.a(6);
        if (a10 != 0) {
            int i13 = a10 + bVar.f55717a;
            i7 = ((ByteBuffer) bVar.d).getInt(((ByteBuffer) bVar.d).getInt(i13) + i13);
        } else {
            i7 = 0;
        }
        this.f910c = new char[i7 * 2];
        int a11 = bVar.a(6);
        if (a11 != 0) {
            int i14 = a11 + bVar.f55717a;
            i10 = ((ByteBuffer) bVar.d).getInt(((ByteBuffer) bVar.d).getInt(i14) + i14);
        } else {
            i10 = 0;
        }
        for (int i15 = 0; i15 < i10; i15++) {
            androidx.emoji2.text.p pVar = new androidx.emoji2.text.p(this, i15);
            s1.a b10 = pVar.b();
            int a12 = b10.a(4);
            Character.toChars(a12 != 0 ? ((ByteBuffer) b10.d).getInt(a12 + b10.f55717a) : 0, (char[]) this.f910c, i15 * 2);
            s1.a b11 = pVar.b();
            int a13 = b11.a(16);
            if (a13 != 0) {
                int i16 = a13 + b11.f55717a;
                i11 = ((ByteBuffer) b11.d).getInt(((ByteBuffer) b11.d).getInt(i16) + i16);
            } else {
                i11 = 0;
            }
            if (i11 > 0) {
                androidx.emoji2.text.t tVar = (androidx.emoji2.text.t) this.d;
                s1.a b12 = pVar.b();
                int a14 = b12.a(16);
                if (a14 != 0) {
                    int i17 = a14 + b12.f55717a;
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

    private final void F() {
    }

    private final void G() {
    }

    public c0(int i7) {
        this.f908a = i7;
        switch (i7) {
            case 2:
                return;
            case 8:
                this.f909b = new ArrayList();
                this.f910c = new ArrayList();
                this.d = new ArrayList();
                this.f911e = new ArrayList();
                return;
            default:
                this.f909b = null;
                this.f910c = null;
                this.d = null;
                this.f911e = new ArrayDeque();
                return;
        }
    }

    public c0(Context context, ActionMode.Callback callback) {
        this.f908a = 5;
        this.f910c = context;
        this.f909b = callback;
        this.d = new ArrayList();
        this.f911e = new a0.l(0);
    }

    public c0(ng.e eVar) {
        this.f908a = 7;
        LinearLayout linearLayout = new LinearLayout(eVar.getContext());
        this.f911e = linearLayout;
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
        this.f910c = textView2;
        linearLayout.addView(textView2, c8.ja.k(0.0f, 0.0f, 20.0f, 0.0f, -2, -2));
        o5 o5Var = new o5(eVar.getContext());
        this.f909b = o5Var;
        linearLayout.addView(o5Var, c8.ja.o(-1, -2));
        textView2.setGravity(8388611);
        o5Var.setGravity(8388613);
        o5Var.setTypeface(org.telegram.messenger.g0.o());
        o5Var.setTextSize(1, 13.0f);
        textView2.setTextSize(1, 13.0f);
    }

    public c0(m1.b0 b0Var, List list) {
        this.f908a = 6;
        this.f911e = b0Var;
        this.f909b = new ie.d();
        this.f910c = zd.b0.a();
        this.d = hd.f.l(list);
    }

    public c0(q1 q1Var, boolean[] zArr) {
        this.f908a = 15;
        this.f909b = q1Var;
        this.f910c = zArr;
        int i7 = q1Var.f59640a;
        this.d = new boolean[i7];
        this.f911e = new boolean[i7];
    }

    private final void i(Canvas canvas, RectF rectF, float f10, float f11, float f12, int i7, boolean z10) {
    }

    private final void j(Canvas canvas, RectF rectF, float f10, float f11, float f12, int i7, boolean z10) {
    }
}
