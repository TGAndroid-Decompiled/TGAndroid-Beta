package c2;

import android.animation.ValueAnimator;
import android.os.Message;
import android.util.SparseArray;
import android.view.View;
import f2.g1;
import g7.f6;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import org.telegram.messenger.MessagesController;
import org.telegram.ui.Cells.o4;
import org.telegram.ui.Components.ak0;
import org.telegram.ui.Components.bk0;
import org.telegram.ui.Components.wk0;
import org.telegram.ui.Components.yj0;
public class y {
    public final int f2254a;
    public int f2255b;
    public boolean f2256c;
    public boolean d;
    public final Object f2257e;
    public final Object f2258f;
    public Object f2259g;
    public Object h;
    public Object f2260i;
    public final Object f2261j;
    public Object f2262k;

    public y(wk0 wk0Var, f2.m0 m0Var) {
        this.f2254a = 1;
        this.f2261j = new SparseArray();
        this.f2262k = new HashMap();
        this.f2257e = wk0Var;
        this.f2258f = m0Var;
    }

    public final void a() {
        switch (this.f2254a) {
            case 0:
                r rVar = (r) this.f2257e;
                if (!this.f2256c && !this.d) {
                    this.d = true;
                    if (rVar != null) {
                        rVar.h(0);
                        rVar.d();
                        return;
                    }
                    return;
                }
                return;
            default:
                ValueAnimator valueAnimator = (ValueAnimator) this.f2259g;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                wk0 wk0Var = (wk0) this.f2257e;
                wk0Var.setVerticalScrollBarEnabled(true);
                wk0Var.T1 = false;
                f2.r0 adapter = wk0Var.getAdapter();
                if (adapter instanceof bk0) {
                    ((bk0) adapter).E();
                }
                this.f2259g = null;
                int childCount = wk0Var.getChildCount();
                for (int i9 = 0; i9 < childCount; i9++) {
                    View childAt = wk0Var.getChildAt(i9);
                    childAt.setTranslationY(0.0f);
                    if (childAt instanceof o4) {
                        ((o4) childAt).c(false, false);
                    }
                }
                return;
        }
    }

    public void b() {
        c0.k kVar;
        a0 a0Var = (a0) this.f2258f;
        int i9 = this.f2255b;
        WeakReference weakReference = (WeakReference) this.f2261j;
        c0.b();
        if (!this.f2256c && !this.d) {
            e eVar = (e) weakReference.get();
            if (eVar != null && eVar.f2139g == this && ((kVar = (c0.k) this.f2262k) == null || !kVar.isCancelled())) {
                this.f2256c = true;
                eVar.f2139g = null;
                e eVar2 = (e) weakReference.get();
                if (eVar2 != null) {
                    HashMap hashMap = eVar2.f2135b;
                    if (eVar2.d == a0Var) {
                        Message obtainMessage = eVar2.f2134a.obtainMessage(263, a0Var);
                        obtainMessage.arg1 = i9;
                        obtainMessage.sendToTarget();
                        r rVar = eVar2.f2137e;
                        if (rVar != null) {
                            rVar.h(i9);
                            eVar2.f2137e.d();
                        }
                        if (!hashMap.isEmpty()) {
                            for (r rVar2 : hashMap.values()) {
                                rVar2.h(i9);
                                rVar2.d();
                            }
                            hashMap.clear();
                        }
                        eVar2.f2137e = null;
                    }
                }
                e eVar3 = (e) weakReference.get();
                if (eVar3 != null) {
                    b bVar = eVar3.f2134a;
                    a0 a0Var2 = (a0) this.f2259g;
                    eVar3.d = a0Var2;
                    eVar3.f2137e = (r) this.f2257e;
                    a0 a0Var3 = (a0) this.h;
                    if (a0Var3 == null) {
                        Message obtainMessage2 = bVar.obtainMessage(262, new q0.b(a0Var, a0Var2));
                        obtainMessage2.arg1 = i9;
                        obtainMessage2.sendToTarget();
                    } else {
                        Message obtainMessage3 = bVar.obtainMessage(264, new q0.b(a0Var3, a0Var2));
                        obtainMessage3.arg1 = i9;
                        obtainMessage3.sendToTarget();
                    }
                    eVar3.f2135b.clear();
                    eVar3.g();
                    eVar3.l();
                    ArrayList arrayList = (ArrayList) this.f2260i;
                    if (arrayList != null) {
                        eVar3.d.n(arrayList);
                        return;
                    }
                    return;
                }
                return;
            }
            a();
        }
    }

    public void c(int i9, int i10, boolean z10, boolean z11) {
        boolean z12;
        bk0 bk0Var;
        f2.r0 r0Var;
        long j10;
        HashMap hashMap = (HashMap) this.f2262k;
        SparseArray sparseArray = (SparseArray) this.f2261j;
        f2.m0 m0Var = (f2.m0) this.f2258f;
        wk0 wk0Var = (wk0) this.f2257e;
        if (!wk0Var.T1) {
            if (wk0Var.getItemAnimator() != null) {
                if (z11) {
                    f2.w0 itemAnimator = wk0Var.getItemAnimator();
                    yj0 yj0Var = new yj0(this, i9, i10, z10);
                    boolean k10 = itemAnimator.k();
                    if (!k10) {
                        c(i9, i10, z10, false);
                    } else {
                        itemAnimator.f5547b.add(yj0Var);
                    }
                    if (k10) {
                        return;
                    }
                } else if (wk0Var.getItemAnimator().k()) {
                    return;
                }
            }
            if (this.f2255b == -1) {
                m0Var.i1(i9, i10, z10);
                return;
            }
            int childCount = wk0Var.getChildCount();
            if (childCount != 0 && MessagesController.getGlobalMainSettings().getBoolean("view_animations", true)) {
                if (this.f2255b == 0) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                wk0Var.setScrollEnabled(false);
                ArrayList arrayList = new ArrayList();
                sparseArray.clear();
                f2.r0 adapter = wk0Var.getAdapter();
                hashMap.clear();
                int i11 = 0;
                while (i11 < childCount) {
                    View childAt = wk0Var.getChildAt(i11);
                    arrayList.add(childAt);
                    m0Var.getClass();
                    sparseArray.put(f2.z0.H(childAt), childAt);
                    if (adapter == null || (!adapter.f5524b && !this.f2256c)) {
                        r0Var = adapter;
                    } else {
                        if (this.f2256c) {
                            int b10 = ((f2.a1) childAt.getLayoutParams()).f5311a.b();
                            if (b10 < 0) {
                                r0Var = adapter;
                                i11++;
                                adapter = r0Var;
                            } else {
                                r0Var = adapter;
                                j10 = adapter.i(b10);
                            }
                        } else {
                            r0Var = adapter;
                            j10 = ((f2.a1) childAt.getLayoutParams()).f5311a.f5504e;
                        }
                        hashMap.put(Long.valueOf(j10), childAt);
                    }
                    if (childAt instanceof o4) {
                        ((o4) childAt).c(true, true);
                    }
                    i11++;
                    adapter = r0Var;
                }
                f2.r0 r0Var2 = adapter;
                wk0Var.B0();
                wk0Var.o0();
                f2.b bVar = wk0Var.d;
                bVar.m((ArrayList) bVar.d);
                bVar.m((ArrayList) bVar.f5318e);
                bVar.f5316b = 0;
                g1 g1Var = wk0Var.f1339b;
                f2.r0 r0Var3 = wk0Var.f1366w;
                g1Var.d(r0Var3, r0Var3);
                wk0Var.f1357p0.f5473f = true;
                wk0Var.f1344e.z();
                g1Var.l();
                if (r0Var2 instanceof bk0) {
                    bk0Var = (bk0) r0Var2;
                } else {
                    bk0Var = null;
                }
                bk0 bk0Var2 = bk0Var;
                m0Var.i1(i9, i10, z10);
                if (r0Var2 != null) {
                    r0Var2.l();
                }
                wk0Var.B0();
                wk0Var.setVerticalScrollBarEnabled(false);
                f6 f6Var = (f6) this.f2260i;
                if (f6Var != null) {
                    f6Var.c();
                }
                wk0Var.T1 = true;
                if (bk0Var2 != null) {
                    bk0Var2.f27230c = true;
                    bk0Var2.d = false;
                    bk0Var2.f27231e.clear();
                    bk0Var2.f27232f.clear();
                }
                wk0Var.addOnLayoutChangeListener(new ak0(this, r0Var2, arrayList, z12, bk0Var2));
                return;
            }
            m0Var.i1(i9, i10, z10);
        }
    }

    public y(e eVar, a0 a0Var, r rVar, int i9, a0 a0Var2, Collection collection) {
        this.f2254a = 0;
        this.f2262k = null;
        this.f2256c = false;
        this.d = false;
        this.f2261j = new WeakReference(eVar);
        this.f2259g = a0Var;
        this.f2257e = rVar;
        this.f2255b = i9;
        this.f2258f = eVar.d;
        this.h = a0Var2;
        this.f2260i = collection != null ? new ArrayList(collection) : null;
        eVar.f2134a.postDelayed(new af.e(this, 18), 15000L);
    }
}
