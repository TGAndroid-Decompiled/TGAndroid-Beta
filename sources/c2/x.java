package c2;

import android.animation.ValueAnimator;
import android.os.Message;
import android.util.SparseArray;
import android.view.View;
import f2.e1;
import h7.a6;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import org.telegram.messenger.MessagesController;
import org.telegram.ui.Cells.l4;
import org.telegram.ui.Components.ak0;
import org.telegram.ui.Components.ck0;
import org.telegram.ui.Components.dk0;
import org.telegram.ui.Components.zk0;

public class x {

    public final int f2366a;

    public int f2367b;

    public boolean f2368c;
    public boolean d;

    public final Object f2369e;

    public final Object f2370f;

    public Object f2371g;
    public Object h;

    public Object f2372i;

    public final Object f2373j;

    public Object f2374k;

    public x(zk0 zk0Var, f2.k0 k0Var) {
        this.f2366a = 1;
        this.f2373j = new SparseArray();
        this.f2374k = new HashMap();
        this.f2369e = zk0Var;
        this.f2370f = k0Var;
    }

    public final void a() {
        switch (this.f2366a) {
            case 0:
                r rVar = (r) this.f2369e;
                if (!this.f2368c && !this.d) {
                    this.d = true;
                    if (rVar != null) {
                        rVar.h(0);
                        rVar.d();
                    }
                    break;
                }
                break;
            default:
                ValueAnimator valueAnimator = (ValueAnimator) this.f2371g;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                zk0 zk0Var = (zk0) this.f2369e;
                zk0Var.setVerticalScrollBarEnabled(true);
                zk0Var.T1 = false;
                f2.q0 adapter = zk0Var.getAdapter();
                if (adapter instanceof dk0) {
                    ((dk0) adapter).E();
                }
                this.f2371g = null;
                int childCount = zk0Var.getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    View childAt = zk0Var.getChildAt(i10);
                    childAt.setTranslationY(0.0f);
                    if (childAt instanceof l4) {
                        ((l4) childAt).c(false, false);
                    }
                }
                break;
        }
    }

    public void b() {
        c0.k kVar;
        z zVar = (z) this.f2370f;
        int i10 = this.f2367b;
        WeakReference weakReference = (WeakReference) this.f2373j;
        b0.b();
        if (this.f2368c || this.d) {
            return;
        }
        e eVar = (e) weakReference.get();
        if (eVar == null || eVar.f2256g != this || ((kVar = (c0.k) this.f2374k) != null && kVar.isCancelled())) {
            a();
            return;
        }
        this.f2368c = true;
        eVar.f2256g = null;
        e eVar2 = (e) weakReference.get();
        if (eVar2 != null) {
            HashMap map = eVar2.f2252b;
            if (eVar2.d == zVar) {
                Message messageObtainMessage = eVar2.f2251a.obtainMessage(263, zVar);
                messageObtainMessage.arg1 = i10;
                messageObtainMessage.sendToTarget();
                r rVar = eVar2.f2254e;
                if (rVar != null) {
                    rVar.h(i10);
                    eVar2.f2254e.d();
                }
                if (!map.isEmpty()) {
                    for (r rVar2 : map.values()) {
                        rVar2.h(i10);
                        rVar2.d();
                    }
                    map.clear();
                }
                eVar2.f2254e = null;
            }
        }
        e eVar3 = (e) weakReference.get();
        if (eVar3 == null) {
            return;
        }
        b bVar = eVar3.f2251a;
        z zVar2 = (z) this.f2371g;
        eVar3.d = zVar2;
        eVar3.f2254e = (r) this.f2369e;
        z zVar3 = (z) this.h;
        if (zVar3 == null) {
            Message messageObtainMessage2 = bVar.obtainMessage(262, new q0.b(zVar, zVar2));
            messageObtainMessage2.arg1 = i10;
            messageObtainMessage2.sendToTarget();
        } else {
            Message messageObtainMessage3 = bVar.obtainMessage(264, new q0.b(zVar3, zVar2));
            messageObtainMessage3.arg1 = i10;
            messageObtainMessage3.sendToTarget();
        }
        eVar3.f2252b.clear();
        eVar3.g();
        eVar3.l();
        ArrayList arrayList = (ArrayList) this.f2372i;
        if (arrayList != null) {
            eVar3.d.n(arrayList);
        }
    }

    public void c(int i10, int i11, boolean z10) {
        d(i10, i11, z10, false);
    }

    public void d(int i10, int i11, boolean z10, boolean z11) {
        long jI;
        HashMap map = (HashMap) this.f2374k;
        SparseArray sparseArray = (SparseArray) this.f2373j;
        f2.k0 k0Var = (f2.k0) this.f2370f;
        zk0 zk0Var = (zk0) this.f2369e;
        if (zk0Var.T1) {
            return;
        }
        if (zk0Var.getItemAnimator() != null) {
            if (z11) {
                f2.v0 itemAnimator = zk0Var.getItemAnimator();
                ak0 ak0Var = new ak0(this, i10, i11, z10);
                boolean zK = itemAnimator.k();
                if (zK) {
                    itemAnimator.f5841b.add(ak0Var);
                } else {
                    d(i10, i11, z10, false);
                }
                if (zK) {
                    return;
                }
            } else if (zk0Var.getItemAnimator().k()) {
                return;
            }
        }
        if (this.f2367b == -1) {
            k0Var.i1(i10, i11, z10);
            return;
        }
        int childCount = zk0Var.getChildCount();
        if (childCount == 0 || !MessagesController.getGlobalMainSettings().getBoolean("view_animations", true)) {
            k0Var.i1(i10, i11, z10);
            return;
        }
        boolean z12 = this.f2367b == 0;
        zk0Var.setScrollEnabled(false);
        ArrayList arrayList = new ArrayList();
        sparseArray.clear();
        f2.q0 adapter = zk0Var.getAdapter();
        map.clear();
        int i12 = 0;
        while (i12 < childCount) {
            View childAt = zk0Var.getChildAt(i12);
            arrayList.add(childAt);
            k0Var.getClass();
            sparseArray.put(f2.x0.H(childAt), childAt);
            if (adapter == null || !(adapter.f5815b || this.f2368c)) {
                adapter = adapter;
            } else {
                if (this.f2368c) {
                    int iB = ((f2.y0) childAt.getLayoutParams()).f5864a.b();
                    if (iB < 0) {
                        adapter = adapter;
                    } else {
                        jI = adapter.i(iB);
                    }
                    i12++;
                    adapter = adapter;
                } else {
                    jI = ((f2.y0) childAt.getLayoutParams()).f5864a.f5792e;
                }
                map.put(Long.valueOf(jI), childAt);
            }
            if (childAt instanceof l4) {
                ((l4) childAt).c(true, true);
            }
            i12++;
            adapter = adapter;
        }
        f2.q0 q0Var = adapter;
        zk0Var.B0();
        zk0Var.o0();
        aa.a aVar = zk0Var.d;
        aVar.m((ArrayList) aVar.d);
        aVar.m((ArrayList) aVar.f202e);
        aVar.f200b = 0;
        e1 e1Var = zk0Var.f1835b;
        f2.q0 q0Var2 = zk0Var.f1862w;
        e1Var.d(q0Var2, q0Var2);
        zk0Var.f1853p0.f5761f = true;
        zk0Var.f1840e.x();
        e1Var.l();
        dk0 dk0Var = q0Var instanceof dk0 ? (dk0) q0Var : null;
        k0Var.i1(i10, i11, z10);
        if (q0Var != null) {
            q0Var.l();
        }
        zk0Var.B0();
        zk0Var.setVerticalScrollBarEnabled(false);
        a6 a6Var = (a6) this.f2372i;
        if (a6Var != null) {
            a6Var.c();
        }
        zk0Var.T1 = true;
        if (dk0Var != null) {
            dk0Var.f27786c = true;
            dk0Var.d = false;
            dk0Var.f27787e.clear();
            dk0Var.f27788f.clear();
        }
        zk0Var.addOnLayoutChangeListener(new ck0(this, q0Var, arrayList, z12, dk0Var));
    }

    public x(e eVar, z zVar, r rVar, int i10, z zVar2, Collection collection) {
        this.f2366a = 0;
        this.f2374k = null;
        this.f2368c = false;
        this.d = false;
        this.f2373j = new WeakReference(eVar);
        this.f2371g = zVar;
        this.f2369e = rVar;
        this.f2367b = i10;
        this.f2370f = eVar.d;
        this.h = zVar2;
        this.f2372i = collection != null ? new ArrayList(collection) : null;
        eVar.f2251a.postDelayed(new af.e(this, 18), 15000L);
    }
}
