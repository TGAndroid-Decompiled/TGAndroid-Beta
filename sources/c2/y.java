package c2;

import android.animation.ValueAnimator;
import android.os.Message;
import android.util.SparseArray;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import k7.c6;
import org.telegram.messenger.MessagesController;
import org.telegram.ui.Cells.o4;
import org.telegram.ui.Components.sl0;
import org.telegram.ui.Components.uk0;
import org.telegram.ui.Components.wk0;
import org.telegram.ui.Components.xk0;
public class y {
    public final int f2030a;
    public int f2031b;
    public boolean f2032c;
    public boolean d;
    public final Object e;
    public final Object f2033f;
    public Object f2034g;
    public Object h;
    public Object f2035i;
    public final Object f2036j;
    public Object f2037k;

    public y(sl0 sl0Var, f2.i0 i0Var) {
        this.f2030a = 1;
        this.f2036j = new SparseArray();
        this.f2037k = new HashMap();
        this.e = sl0Var;
        this.f2033f = i0Var;
    }

    public final void a() {
        switch (this.f2030a) {
            case 0:
                s sVar = (s) this.e;
                if (!this.f2032c && !this.d) {
                    this.d = true;
                    if (sVar != null) {
                        sVar.h(0);
                        sVar.d();
                        return;
                    }
                    return;
                }
                return;
            default:
                ValueAnimator valueAnimator = (ValueAnimator) this.f2034g;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                sl0 sl0Var = (sl0) this.e;
                sl0Var.setVerticalScrollBarEnabled(true);
                sl0Var.U1 = false;
                f2.o0 adapter = sl0Var.getAdapter();
                if (adapter instanceof xk0) {
                    ((xk0) adapter).E();
                }
                this.f2034g = null;
                int childCount = sl0Var.getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    View childAt = sl0Var.getChildAt(i10);
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
        a0 a0Var = (a0) this.f2033f;
        int i10 = this.f2031b;
        WeakReference weakReference = (WeakReference) this.f2036j;
        c0.b();
        if (!this.f2032c && !this.d) {
            e eVar = (e) weakReference.get();
            if (eVar != null && eVar.f1915g == this && ((kVar = (c0.k) this.f2037k) == null || !kVar.isCancelled())) {
                this.f2032c = true;
                eVar.f1915g = null;
                e eVar2 = (e) weakReference.get();
                if (eVar2 != null) {
                    HashMap hashMap = eVar2.f1912b;
                    if (eVar2.d == a0Var) {
                        Message obtainMessage = eVar2.f1911a.obtainMessage(263, a0Var);
                        obtainMessage.arg1 = i10;
                        obtainMessage.sendToTarget();
                        s sVar = eVar2.e;
                        if (sVar != null) {
                            sVar.h(i10);
                            eVar2.e.d();
                        }
                        if (!hashMap.isEmpty()) {
                            for (s sVar2 : hashMap.values()) {
                                sVar2.h(i10);
                                sVar2.d();
                            }
                            hashMap.clear();
                        }
                        eVar2.e = null;
                    }
                }
                e eVar3 = (e) weakReference.get();
                if (eVar3 != null) {
                    b bVar = eVar3.f1911a;
                    a0 a0Var2 = (a0) this.f2034g;
                    eVar3.d = a0Var2;
                    eVar3.e = (s) this.e;
                    a0 a0Var3 = (a0) this.h;
                    if (a0Var3 == null) {
                        Message obtainMessage2 = bVar.obtainMessage(262, new q0.b(a0Var, a0Var2));
                        obtainMessage2.arg1 = i10;
                        obtainMessage2.sendToTarget();
                    } else {
                        Message obtainMessage3 = bVar.obtainMessage(264, new q0.b(a0Var3, a0Var2));
                        obtainMessage3.arg1 = i10;
                        obtainMessage3.sendToTarget();
                    }
                    eVar3.f1912b.clear();
                    eVar3.g();
                    eVar3.l();
                    ArrayList arrayList = (ArrayList) this.f2035i;
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

    public void c(int i10, int i11, boolean z4, boolean z10) {
        boolean z11;
        xk0 xk0Var;
        f2.o0 o0Var;
        long j10;
        HashMap hashMap = (HashMap) this.f2037k;
        SparseArray sparseArray = (SparseArray) this.f2036j;
        f2.i0 i0Var = (f2.i0) this.f2033f;
        sl0 sl0Var = (sl0) this.e;
        if (!sl0Var.U1) {
            if (sl0Var.getItemAnimator() != null) {
                if (z10) {
                    f2.t0 itemAnimator = sl0Var.getItemAnimator();
                    uk0 uk0Var = new uk0(this, i10, i11, z4);
                    boolean k10 = itemAnimator.k();
                    if (!k10) {
                        c(i10, i11, z4, false);
                    } else {
                        itemAnimator.f5836b.add(uk0Var);
                    }
                    if (k10) {
                        return;
                    }
                } else if (sl0Var.getItemAnimator().k()) {
                    return;
                }
            }
            if (this.f2031b == -1) {
                i0Var.i1(i10, i11, z4);
                return;
            }
            int childCount = sl0Var.getChildCount();
            if (childCount != 0 && MessagesController.getGlobalMainSettings().getBoolean("view_animations", true)) {
                if (this.f2031b == 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                sl0Var.setScrollEnabled(false);
                ArrayList arrayList = new ArrayList();
                sparseArray.clear();
                f2.o0 adapter = sl0Var.getAdapter();
                hashMap.clear();
                int i12 = 0;
                while (i12 < childCount) {
                    View childAt = sl0Var.getChildAt(i12);
                    arrayList.add(childAt);
                    i0Var.getClass();
                    sparseArray.put(f2.v0.H(childAt), childAt);
                    if (adapter == null || (!adapter.f5817b && !this.f2032c)) {
                        o0Var = adapter;
                    } else {
                        if (this.f2032c) {
                            int b10 = ((f2.w0) childAt.getLayoutParams()).f5858a.b();
                            if (b10 < 0) {
                                o0Var = adapter;
                                i12++;
                                adapter = o0Var;
                            } else {
                                o0Var = adapter;
                                j10 = adapter.i(b10);
                            }
                        } else {
                            o0Var = adapter;
                            j10 = ((f2.w0) childAt.getLayoutParams()).f5858a.e;
                        }
                        hashMap.put(Long.valueOf(j10), childAt);
                    }
                    if (childAt instanceof o4) {
                        ((o4) childAt).c(true, true);
                    }
                    i12++;
                    adapter = o0Var;
                }
                f2.o0 o0Var2 = adapter;
                sl0Var.B0();
                sl0Var.o0();
                da.a aVar = sl0Var.d;
                aVar.m((ArrayList) aVar.d);
                aVar.m((ArrayList) aVar.e);
                aVar.f4302b = 0;
                bf.f fVar = sl0Var.f1222b;
                f2.o0 o0Var3 = sl0Var.f1248w;
                fVar.d(o0Var3, o0Var3);
                sl0Var.f1240q0.f5745f = true;
                sl0Var.e.y();
                fVar.l();
                if (o0Var2 instanceof xk0) {
                    xk0Var = (xk0) o0Var2;
                } else {
                    xk0Var = null;
                }
                xk0 xk0Var2 = xk0Var;
                i0Var.i1(i10, i11, z4);
                if (o0Var2 != null) {
                    o0Var2.l();
                }
                sl0Var.B0();
                sl0Var.setVerticalScrollBarEnabled(false);
                c6 c6Var = (c6) this.f2035i;
                if (c6Var != null) {
                    c6Var.c();
                }
                sl0Var.U1 = true;
                if (xk0Var2 != null) {
                    xk0Var2.f30688c = true;
                    xk0Var2.d = false;
                    xk0Var2.e.clear();
                    xk0Var2.f30689f.clear();
                }
                sl0Var.addOnLayoutChangeListener(new wk0(this, o0Var2, arrayList, z11, xk0Var2));
                return;
            }
            i0Var.i1(i10, i11, z4);
        }
    }

    public y(e eVar, a0 a0Var, s sVar, int i10, a0 a0Var2, Collection collection) {
        this.f2030a = 0;
        this.f2037k = null;
        this.f2032c = false;
        this.d = false;
        this.f2036j = new WeakReference(eVar);
        this.f2034g = a0Var;
        this.e = sVar;
        this.f2031b = i10;
        this.f2033f = eVar.d;
        this.h = a0Var2;
        this.f2035i = collection != null ? new ArrayList(collection) : null;
        eVar.f1911a.postDelayed(new ag.d(this, 11), 15000L);
    }
}
