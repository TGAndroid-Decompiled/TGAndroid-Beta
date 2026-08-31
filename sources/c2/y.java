package c2;

import android.animation.ValueAnimator;
import android.os.Message;
import android.util.SparseArray;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import k7.d6;
import org.telegram.messenger.MessagesController;
import org.telegram.ui.Cells.o4;
import org.telegram.ui.Components.tl0;
import org.telegram.ui.Components.vk0;
import org.telegram.ui.Components.xk0;
import org.telegram.ui.Components.yk0;
public class y {
    public final int f2205a;
    public int f2206b;
    public boolean f2207c;
    public boolean d;
    public final Object f2208e;
    public final Object f2209f;
    public Object f2210g;
    public Object h;
    public Object f2211i;
    public final Object f2212j;
    public Object f2213k;

    public y(tl0 tl0Var, f2.j0 j0Var) {
        this.f2205a = 1;
        this.f2212j = new SparseArray();
        this.f2213k = new HashMap();
        this.f2208e = tl0Var;
        this.f2209f = j0Var;
    }

    public final void a() {
        switch (this.f2205a) {
            case 0:
                s sVar = (s) this.f2208e;
                if (!this.f2207c && !this.d) {
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
                ValueAnimator valueAnimator = (ValueAnimator) this.f2210g;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                tl0 tl0Var = (tl0) this.f2208e;
                tl0Var.setVerticalScrollBarEnabled(true);
                tl0Var.U1 = false;
                f2.p0 adapter = tl0Var.getAdapter();
                if (adapter instanceof yk0) {
                    ((yk0) adapter).E();
                }
                this.f2210g = null;
                int childCount = tl0Var.getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    View childAt = tl0Var.getChildAt(i10);
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
        a0 a0Var = (a0) this.f2209f;
        int i10 = this.f2206b;
        WeakReference weakReference = (WeakReference) this.f2212j;
        c0.b();
        if (!this.f2207c && !this.d) {
            e eVar = (e) weakReference.get();
            if (eVar != null && eVar.f2081g == this && ((kVar = (c0.k) this.f2213k) == null || !kVar.isCancelled())) {
                this.f2207c = true;
                eVar.f2081g = null;
                e eVar2 = (e) weakReference.get();
                if (eVar2 != null) {
                    HashMap hashMap = eVar2.f2077b;
                    if (eVar2.d == a0Var) {
                        Message obtainMessage = eVar2.f2076a.obtainMessage(263, a0Var);
                        obtainMessage.arg1 = i10;
                        obtainMessage.sendToTarget();
                        s sVar = eVar2.f2079e;
                        if (sVar != null) {
                            sVar.h(i10);
                            eVar2.f2079e.d();
                        }
                        if (!hashMap.isEmpty()) {
                            for (s sVar2 : hashMap.values()) {
                                sVar2.h(i10);
                                sVar2.d();
                            }
                            hashMap.clear();
                        }
                        eVar2.f2079e = null;
                    }
                }
                e eVar3 = (e) weakReference.get();
                if (eVar3 != null) {
                    b bVar = eVar3.f2076a;
                    a0 a0Var2 = (a0) this.f2210g;
                    eVar3.d = a0Var2;
                    eVar3.f2079e = (s) this.f2208e;
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
                    eVar3.f2077b.clear();
                    eVar3.g();
                    eVar3.l();
                    ArrayList arrayList = (ArrayList) this.f2211i;
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
        yk0 yk0Var;
        f2.p0 p0Var;
        long j10;
        HashMap hashMap = (HashMap) this.f2213k;
        SparseArray sparseArray = (SparseArray) this.f2212j;
        f2.j0 j0Var = (f2.j0) this.f2209f;
        tl0 tl0Var = (tl0) this.f2208e;
        if (!tl0Var.U1) {
            if (tl0Var.getItemAnimator() != null) {
                if (z10) {
                    f2.u0 itemAnimator = tl0Var.getItemAnimator();
                    vk0 vk0Var = new vk0(this, i10, i11, z4);
                    boolean k10 = itemAnimator.k();
                    if (!k10) {
                        c(i10, i11, z4, false);
                    } else {
                        itemAnimator.f5929b.add(vk0Var);
                    }
                    if (k10) {
                        return;
                    }
                } else if (tl0Var.getItemAnimator().k()) {
                    return;
                }
            }
            if (this.f2206b == -1) {
                j0Var.i1(i10, i11, z4);
                return;
            }
            int childCount = tl0Var.getChildCount();
            if (childCount != 0 && MessagesController.getGlobalMainSettings().getBoolean("view_animations", true)) {
                if (this.f2206b == 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                tl0Var.setScrollEnabled(false);
                ArrayList arrayList = new ArrayList();
                sparseArray.clear();
                f2.p0 adapter = tl0Var.getAdapter();
                hashMap.clear();
                int i12 = 0;
                while (i12 < childCount) {
                    View childAt = tl0Var.getChildAt(i12);
                    arrayList.add(childAt);
                    j0Var.getClass();
                    sparseArray.put(f2.w0.H(childAt), childAt);
                    if (adapter == null || (!adapter.f5909b && !this.f2207c)) {
                        p0Var = adapter;
                    } else {
                        if (this.f2207c) {
                            int b10 = ((f2.x0) childAt.getLayoutParams()).f5952a.b();
                            if (b10 < 0) {
                                p0Var = adapter;
                                i12++;
                                adapter = p0Var;
                            } else {
                                p0Var = adapter;
                                j10 = adapter.i(b10);
                            }
                        } else {
                            p0Var = adapter;
                            j10 = ((f2.x0) childAt.getLayoutParams()).f5952a.f5878e;
                        }
                        hashMap.put(Long.valueOf(j10), childAt);
                    }
                    if (childAt instanceof o4) {
                        ((o4) childAt).c(true, true);
                    }
                    i12++;
                    adapter = p0Var;
                }
                f2.p0 p0Var2 = adapter;
                tl0Var.B0();
                tl0Var.o0();
                da.a aVar = tl0Var.d;
                aVar.m((ArrayList) aVar.d);
                aVar.m((ArrayList) aVar.f4384e);
                aVar.f4382b = 0;
                bf.f fVar = tl0Var.f1320b;
                f2.p0 p0Var3 = tl0Var.f1347w;
                fVar.d(p0Var3, p0Var3);
                tl0Var.f1339q0.f5831f = true;
                tl0Var.f1325e.y();
                fVar.l();
                if (p0Var2 instanceof yk0) {
                    yk0Var = (yk0) p0Var2;
                } else {
                    yk0Var = null;
                }
                yk0 yk0Var2 = yk0Var;
                j0Var.i1(i10, i11, z4);
                if (p0Var2 != null) {
                    p0Var2.l();
                }
                tl0Var.B0();
                tl0Var.setVerticalScrollBarEnabled(false);
                d6 d6Var = (d6) this.f2211i;
                if (d6Var != null) {
                    d6Var.c();
                }
                tl0Var.U1 = true;
                if (yk0Var2 != null) {
                    yk0Var2.f33533c = true;
                    yk0Var2.d = false;
                    yk0Var2.f33534e.clear();
                    yk0Var2.f33535f.clear();
                }
                tl0Var.addOnLayoutChangeListener(new xk0(this, p0Var2, arrayList, z11, yk0Var2));
                return;
            }
            j0Var.i1(i10, i11, z4);
        }
    }

    public y(e eVar, a0 a0Var, s sVar, int i10, a0 a0Var2, Collection collection) {
        this.f2205a = 0;
        this.f2213k = null;
        this.f2207c = false;
        this.d = false;
        this.f2212j = new WeakReference(eVar);
        this.f2210g = a0Var;
        this.f2208e = sVar;
        this.f2206b = i10;
        this.f2209f = eVar.d;
        this.h = a0Var2;
        this.f2211i = collection != null ? new ArrayList(collection) : null;
        eVar.f2076a.postDelayed(new ag.e(this, 12), 15000L);
    }
}
