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
import org.telegram.ui.Cells.n4;
import org.telegram.ui.Components.rl0;
import org.telegram.ui.Components.tk0;
import org.telegram.ui.Components.vk0;
import org.telegram.ui.Components.wk0;
public class z {
    public final int f2061a;
    public int f2062b;
    public boolean f2063c;
    public boolean d;
    public final Object e;
    public final Object f2064f;
    public Object f2065g;
    public Object h;
    public Object f2066i;
    public final Object f2067j;
    public Object f2068k;

    public z(rl0 rl0Var, f2.i0 i0Var) {
        this.f2061a = 1;
        this.f2067j = new SparseArray();
        this.f2068k = new HashMap();
        this.e = rl0Var;
        this.f2064f = i0Var;
    }

    public final void a() {
        switch (this.f2061a) {
            case 0:
                s sVar = (s) this.e;
                if (!this.f2063c && !this.d) {
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
                ValueAnimator valueAnimator = (ValueAnimator) this.f2065g;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                rl0 rl0Var = (rl0) this.e;
                rl0Var.setVerticalScrollBarEnabled(true);
                rl0Var.U1 = false;
                f2.o0 adapter = rl0Var.getAdapter();
                if (adapter instanceof wk0) {
                    ((wk0) adapter).E();
                }
                this.f2065g = null;
                int childCount = rl0Var.getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    View childAt = rl0Var.getChildAt(i10);
                    childAt.setTranslationY(0.0f);
                    if (childAt instanceof n4) {
                        ((n4) childAt).c(false, false);
                    }
                }
                return;
        }
    }

    public void b() {
        c0.k kVar;
        b0 b0Var = (b0) this.f2064f;
        int i10 = this.f2062b;
        WeakReference weakReference = (WeakReference) this.f2067j;
        d0.b();
        if (!this.f2063c && !this.d) {
            e eVar = (e) weakReference.get();
            if (eVar != null && eVar.f1942g == this && ((kVar = (c0.k) this.f2068k) == null || !kVar.isCancelled())) {
                this.f2063c = true;
                eVar.f1942g = null;
                e eVar2 = (e) weakReference.get();
                if (eVar2 != null) {
                    HashMap hashMap = eVar2.f1939b;
                    if (eVar2.d == b0Var) {
                        Message obtainMessage = eVar2.f1938a.obtainMessage(263, b0Var);
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
                    b bVar = eVar3.f1938a;
                    b0 b0Var2 = (b0) this.f2065g;
                    eVar3.d = b0Var2;
                    eVar3.e = (s) this.e;
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
                    eVar3.f1939b.clear();
                    eVar3.g();
                    eVar3.l();
                    ArrayList arrayList = (ArrayList) this.f2066i;
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
        wk0 wk0Var;
        f2.o0 o0Var;
        long j10;
        HashMap hashMap = (HashMap) this.f2068k;
        SparseArray sparseArray = (SparseArray) this.f2067j;
        f2.i0 i0Var = (f2.i0) this.f2064f;
        rl0 rl0Var = (rl0) this.e;
        if (!rl0Var.U1) {
            if (rl0Var.getItemAnimator() != null) {
                if (z10) {
                    f2.t0 itemAnimator = rl0Var.getItemAnimator();
                    tk0 tk0Var = new tk0(this, i10, i11, z4);
                    boolean k10 = itemAnimator.k();
                    if (!k10) {
                        c(i10, i11, z4, false);
                    } else {
                        itemAnimator.f5825b.add(tk0Var);
                    }
                    if (k10) {
                        return;
                    }
                } else if (rl0Var.getItemAnimator().k()) {
                    return;
                }
            }
            if (this.f2062b == -1) {
                i0Var.i1(i10, i11, z4);
                return;
            }
            int childCount = rl0Var.getChildCount();
            if (childCount != 0 && MessagesController.getGlobalMainSettings().getBoolean("view_animations", true)) {
                if (this.f2062b == 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                rl0Var.setScrollEnabled(false);
                ArrayList arrayList = new ArrayList();
                sparseArray.clear();
                f2.o0 adapter = rl0Var.getAdapter();
                hashMap.clear();
                int i12 = 0;
                while (i12 < childCount) {
                    View childAt = rl0Var.getChildAt(i12);
                    arrayList.add(childAt);
                    i0Var.getClass();
                    sparseArray.put(f2.v0.H(childAt), childAt);
                    if (adapter == null || (!adapter.f5806b && !this.f2063c)) {
                        o0Var = adapter;
                    } else {
                        if (this.f2063c) {
                            int b10 = ((f2.w0) childAt.getLayoutParams()).f5847a.b();
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
                            j10 = ((f2.w0) childAt.getLayoutParams()).f5847a.e;
                        }
                        hashMap.put(Long.valueOf(j10), childAt);
                    }
                    if (childAt instanceof n4) {
                        ((n4) childAt).c(true, true);
                    }
                    i12++;
                    adapter = o0Var;
                }
                f2.o0 o0Var2 = adapter;
                rl0Var.B0();
                rl0Var.o0();
                da.a aVar = rl0Var.d;
                aVar.m((ArrayList) aVar.d);
                aVar.m((ArrayList) aVar.e);
                aVar.f4283b = 0;
                af.h hVar = rl0Var.f1233b;
                f2.o0 o0Var3 = rl0Var.f1259w;
                hVar.d(o0Var3, o0Var3);
                rl0Var.f1251q0.f5734f = true;
                rl0Var.e.y();
                hVar.l();
                if (o0Var2 instanceof wk0) {
                    wk0Var = (wk0) o0Var2;
                } else {
                    wk0Var = null;
                }
                wk0 wk0Var2 = wk0Var;
                i0Var.i1(i10, i11, z4);
                if (o0Var2 != null) {
                    o0Var2.l();
                }
                rl0Var.B0();
                rl0Var.setVerticalScrollBarEnabled(false);
                c6 c6Var = (c6) this.f2066i;
                if (c6Var != null) {
                    c6Var.c();
                }
                rl0Var.U1 = true;
                if (wk0Var2 != null) {
                    wk0Var2.f30305c = true;
                    wk0Var2.d = false;
                    wk0Var2.e.clear();
                    wk0Var2.f30306f.clear();
                }
                rl0Var.addOnLayoutChangeListener(new vk0(this, o0Var2, arrayList, z11, wk0Var2));
                return;
            }
            i0Var.i1(i10, i11, z4);
        }
    }

    public z(e eVar, b0 b0Var, s sVar, int i10, b0 b0Var2, Collection collection) {
        this.f2061a = 0;
        this.f2068k = null;
        this.f2063c = false;
        this.d = false;
        this.f2067j = new WeakReference(eVar);
        this.f2065g = b0Var;
        this.e = sVar;
        this.f2062b = i10;
        this.f2064f = eVar.d;
        this.h = b0Var2;
        this.f2066i = collection != null ? new ArrayList(collection) : null;
        eVar.f1938a.postDelayed(new ag.d(this, 11), 15000L);
    }
}
