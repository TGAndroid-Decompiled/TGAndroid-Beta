package c2;

import android.animation.ValueAnimator;
import android.os.Message;
import android.util.SparseArray;
import android.view.View;
import f2.d1;
import i7.g6;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import org.telegram.messenger.MessagesController;
import org.telegram.ui.Cells.m4;
import org.telegram.ui.Components.jk0;
import org.telegram.ui.Components.jl0;
import org.telegram.ui.Components.lk0;
import org.telegram.ui.Components.mk0;
public class z {
    public final int f2932a;
    public int f2933b;
    public boolean f2934c;
    public boolean d;
    public final Object f2935e;
    public final Object f2936f;
    public Object f2937g;
    public Object h;
    public Object f2938i;
    public final Object f2939j;
    public Object f2940k;

    public z(jl0 jl0Var, f2.j0 j0Var) {
        this.f2932a = 1;
        this.f2939j = new SparseArray();
        this.f2940k = new HashMap();
        this.f2935e = jl0Var;
        this.f2936f = j0Var;
    }

    public final void a() {
        switch (this.f2932a) {
            case 0:
                s sVar = (s) this.f2935e;
                if (!this.f2934c && !this.d) {
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
                ValueAnimator valueAnimator = (ValueAnimator) this.f2937g;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                jl0 jl0Var = (jl0) this.f2935e;
                jl0Var.setVerticalScrollBarEnabled(true);
                jl0Var.T1 = false;
                f2.p0 adapter = jl0Var.getAdapter();
                if (adapter instanceof mk0) {
                    ((mk0) adapter).E();
                }
                this.f2937g = null;
                int childCount = jl0Var.getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    View childAt = jl0Var.getChildAt(i10);
                    childAt.setTranslationY(0.0f);
                    if (childAt instanceof m4) {
                        ((m4) childAt).b(false, false);
                    }
                }
                return;
        }
    }

    public void b() {
        c0.k kVar;
        b0 b0Var = (b0) this.f2936f;
        int i10 = this.f2933b;
        WeakReference weakReference = (WeakReference) this.f2939j;
        d0.b();
        if (!this.f2934c && !this.d) {
            e eVar = (e) weakReference.get();
            if (eVar != null && eVar.f2809g == this && ((kVar = (c0.k) this.f2940k) == null || !kVar.isCancelled())) {
                this.f2934c = true;
                eVar.f2809g = null;
                e eVar2 = (e) weakReference.get();
                if (eVar2 != null) {
                    HashMap hashMap = eVar2.f2805b;
                    if (eVar2.d == b0Var) {
                        Message obtainMessage = eVar2.f2804a.obtainMessage(263, b0Var);
                        obtainMessage.arg1 = i10;
                        obtainMessage.sendToTarget();
                        s sVar = eVar2.f2807e;
                        if (sVar != null) {
                            sVar.h(i10);
                            eVar2.f2807e.d();
                        }
                        if (!hashMap.isEmpty()) {
                            for (s sVar2 : hashMap.values()) {
                                sVar2.h(i10);
                                sVar2.d();
                            }
                            hashMap.clear();
                        }
                        eVar2.f2807e = null;
                    }
                }
                e eVar3 = (e) weakReference.get();
                if (eVar3 != null) {
                    b bVar = eVar3.f2804a;
                    b0 b0Var2 = (b0) this.f2937g;
                    eVar3.d = b0Var2;
                    eVar3.f2807e = (s) this.f2935e;
                    b0 b0Var3 = (b0) this.h;
                    if (b0Var3 == null) {
                        Message obtainMessage2 = bVar.obtainMessage(262, new q0.b(b0Var, b0Var2));
                        obtainMessage2.arg1 = i10;
                        obtainMessage2.sendToTarget();
                    } else {
                        Message obtainMessage3 = bVar.obtainMessage(264, new q0.b(b0Var3, b0Var2));
                        obtainMessage3.arg1 = i10;
                        obtainMessage3.sendToTarget();
                    }
                    eVar3.f2805b.clear();
                    eVar3.g();
                    eVar3.l();
                    ArrayList arrayList = (ArrayList) this.f2938i;
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

    public void c(int i10, int i11, boolean z10, boolean z11) {
        boolean z12;
        mk0 mk0Var;
        f2.p0 p0Var;
        long j10;
        HashMap hashMap = (HashMap) this.f2940k;
        SparseArray sparseArray = (SparseArray) this.f2939j;
        f2.j0 j0Var = (f2.j0) this.f2936f;
        jl0 jl0Var = (jl0) this.f2935e;
        if (!jl0Var.T1) {
            if (jl0Var.getItemAnimator() != null) {
                if (z11) {
                    f2.u0 itemAnimator = jl0Var.getItemAnimator();
                    jk0 jk0Var = new jk0(this, i10, i11, z10);
                    boolean k9 = itemAnimator.k();
                    if (!k9) {
                        c(i10, i11, z10, false);
                    } else {
                        itemAnimator.f6485b.add(jk0Var);
                    }
                    if (k9) {
                        return;
                    }
                } else if (jl0Var.getItemAnimator().k()) {
                    return;
                }
            }
            if (this.f2933b == -1) {
                j0Var.i1(i10, i11, z10);
                return;
            }
            int childCount = jl0Var.getChildCount();
            if (childCount != 0 && MessagesController.getGlobalMainSettings().getBoolean("view_animations", true)) {
                if (this.f2933b == 0) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                jl0Var.setScrollEnabled(false);
                ArrayList arrayList = new ArrayList();
                sparseArray.clear();
                f2.p0 adapter = jl0Var.getAdapter();
                hashMap.clear();
                int i12 = 0;
                while (i12 < childCount) {
                    View childAt = jl0Var.getChildAt(i12);
                    arrayList.add(childAt);
                    j0Var.getClass();
                    sparseArray.put(f2.w0.H(childAt), childAt);
                    if (adapter == null || (!adapter.f6460b && !this.f2934c)) {
                        p0Var = adapter;
                    } else {
                        if (this.f2934c) {
                            int b10 = ((f2.x0) childAt.getLayoutParams()).f6508a.b();
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
                            j10 = ((f2.x0) childAt.getLayoutParams()).f6508a.f6435e;
                        }
                        hashMap.put(Long.valueOf(j10), childAt);
                    }
                    if (childAt instanceof m4) {
                        ((m4) childAt).b(true, true);
                    }
                    i12++;
                    adapter = p0Var;
                }
                f2.p0 p0Var2 = adapter;
                jl0Var.B0();
                jl0Var.o0();
                ba.a aVar = jl0Var.d;
                aVar.m((ArrayList) aVar.d);
                aVar.m((ArrayList) aVar.f2029e);
                aVar.f2027b = 0;
                d1 d1Var = jl0Var.f1829b;
                f2.p0 p0Var3 = jl0Var.f1856w;
                d1Var.d(p0Var3, p0Var3);
                jl0Var.f1847p0.f6396f = true;
                jl0Var.f1834e.z();
                d1Var.l();
                if (p0Var2 instanceof mk0) {
                    mk0Var = (mk0) p0Var2;
                } else {
                    mk0Var = null;
                }
                mk0 mk0Var2 = mk0Var;
                j0Var.i1(i10, i11, z10);
                if (p0Var2 != null) {
                    p0Var2.l();
                }
                jl0Var.B0();
                jl0Var.setVerticalScrollBarEnabled(false);
                g6 g6Var = (g6) this.f2938i;
                if (g6Var != null) {
                    g6Var.c();
                }
                jl0Var.T1 = true;
                if (mk0Var2 != null) {
                    mk0Var2.f30718c = true;
                    mk0Var2.d = false;
                    mk0Var2.f30719e.clear();
                    mk0Var2.f30720f.clear();
                }
                jl0Var.addOnLayoutChangeListener(new lk0(this, p0Var2, arrayList, z12, mk0Var2));
                return;
            }
            j0Var.i1(i10, i11, z10);
        }
    }

    public z(e eVar, b0 b0Var, s sVar, int i10, b0 b0Var2, Collection collection) {
        this.f2932a = 0;
        this.f2940k = null;
        this.f2934c = false;
        this.d = false;
        this.f2939j = new WeakReference(eVar);
        this.f2937g = b0Var;
        this.f2935e = sVar;
        this.f2933b = i10;
        this.f2936f = eVar.d;
        this.h = b0Var2;
        this.f2938i = collection != null ? new ArrayList(collection) : null;
        eVar.f2804a.postDelayed(new a4.g(this, 24), 15000L);
    }
}
