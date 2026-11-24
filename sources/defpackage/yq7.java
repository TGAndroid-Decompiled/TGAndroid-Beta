package defpackage;

import android.os.Build;
import android.util.Log;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
public final class yq7 {
    public final Runnable a;
    public final lt b = new lt();
    public zp4 c;
    public final OnBackInvokedCallback d;
    public OnBackInvokedDispatcher e;
    public boolean f;
    public boolean g;

    public yq7(Runnable runnable) {
        OnBackInvokedCallback a;
        this.a = runnable;
        int i = Build.VERSION.SDK_INT;
        if (i >= 33) {
            if (i >= 34) {
                a = vq7.a.a(new rq7(this, (byte) 0), new rq7(this, (byte) 1), new sq7(this, (byte) 0), new sq7(this, (byte) 1));
            } else {
                a = tq7.a.a(new sq7(this, (byte) 2));
            }
            this.d = a;
        }
    }

    public final void a() {
        ?? r2;
        zp4 zp4Var = this.c;
        if (zp4Var == null) {
            lt ltVar = this.b;
            ListIterator listIterator = ltVar.listIterator(ltVar.c);
            while (true) {
                if (listIterator.hasPrevious()) {
                    r2 = listIterator.previous();
                    if (((zp4) r2).a) {
                        break;
                    }
                } else {
                    r2 = 0;
                    break;
                }
            }
            zp4Var = r2;
        }
        this.c = null;
        if (zp4Var != null) {
            hq4 hq4Var = zp4Var.d;
            if (hq4.K(3)) {
                Log.d("FragmentManager", "handleOnBackPressed. PREDICTIVE_BACK = true fragment manager " + hq4Var);
            }
            zp4 zp4Var2 = hq4Var.j;
            ArrayList arrayList = hq4Var.n;
            hq4Var.i = true;
            hq4Var.A(true);
            int i = 0;
            hq4Var.i = false;
            if (hq4Var.h != null) {
                if (!arrayList.isEmpty()) {
                    LinkedHashSet linkedHashSet = new LinkedHashSet(hq4.F(hq4Var.h));
                    int size = arrayList.size();
                    int i2 = 0;
                    while (i2 < size) {
                        Object obj = arrayList.get(i2);
                        i2++;
                        if (obj == null) {
                            Iterator it = linkedHashSet.iterator();
                            if (it.hasNext()) {
                                dp4 dp4Var = (dp4) it.next();
                                throw null;
                            }
                        } else {
                            rjb.p();
                            return;
                        }
                    }
                }
                ArrayList arrayList2 = hq4Var.h.a;
                int size2 = arrayList2.size();
                int i3 = 0;
                while (i3 < size2) {
                    Object obj2 = arrayList2.get(i3);
                    i3++;
                    dp4 dp4Var2 = ((xq4) obj2).b;
                    if (dp4Var2 != null) {
                        dp4Var2.y = false;
                    }
                }
                Iterator it2 = hq4Var.f(0, 1, new ArrayList(Collections.singletonList(hq4Var.h))).iterator();
                while (it2.hasNext()) {
                    md3 md3Var = (md3) it2.next();
                    ArrayList arrayList3 = md3Var.c;
                    if (hq4.K(3)) {
                        Log.d("FragmentManager", "SpecialEffectsController: Completing Back ");
                    }
                    md3Var.d(arrayList3);
                    ArrayList arrayList4 = new ArrayList();
                    int size3 = arrayList3.size();
                    int i4 = 0;
                    while (i4 < size3) {
                        Object obj3 = arrayList3.get(i4);
                        i4++;
                        ((wma) obj3).getClass();
                        qm2.d(null, arrayList4);
                    }
                    List k = km2.k(km2.m(arrayList4));
                    int size4 = k.size();
                    for (int i5 = 0; i5 < size4; i5++) {
                        ((vma) k.get(i5)).a(md3Var.a);
                    }
                    int size5 = arrayList3.size();
                    for (int i6 = 0; i6 < size5; i6++) {
                        ((wma) arrayList3.get(i6)).getClass();
                    }
                    List k2 = km2.k(arrayList3);
                    if (k2.size() > 0) {
                        ((wma) k2.get(0)).getClass();
                        throw null;
                    }
                }
                ArrayList arrayList5 = hq4Var.h.a;
                int size6 = arrayList5.size();
                while (i < size6) {
                    Object obj4 = arrayList5.get(i);
                    i++;
                    dp4 dp4Var3 = ((xq4) obj4).b;
                    if (dp4Var3 != null && dp4Var3.W == null) {
                        hq4Var.g(dp4Var3).j();
                    }
                }
                hq4Var.h = null;
                hq4Var.h0();
                if (hq4.K(3)) {
                    Log.d("FragmentManager", "Op is being set to null");
                    Log.d("FragmentManager", "OnBackPressedCallback enabled=" + zp4Var2.a + " for  FragmentManager " + hq4Var);
                    return;
                }
                return;
            } else if (zp4Var2.a) {
                if (hq4.K(3)) {
                    Log.d("FragmentManager", "Calling popBackStackImmediate via onBackPressed callback");
                }
                hq4Var.S();
                return;
            } else {
                if (hq4.K(3)) {
                    Log.d("FragmentManager", "Calling onBackPressed via onBackPressed callback");
                }
                hq4Var.g.a();
                return;
            }
        }
        this.a.run();
    }

    public final void b(boolean z) {
        OnBackInvokedCallback onBackInvokedCallback;
        OnBackInvokedDispatcher onBackInvokedDispatcher = this.e;
        if (onBackInvokedDispatcher != null && (onBackInvokedCallback = this.d) != null) {
            boolean z2 = this.f;
            tq7 tq7Var = tq7.a;
            if (z) {
                if (!z2) {
                    tq7Var.b(onBackInvokedDispatcher, 0, onBackInvokedCallback);
                    this.f = true;
                }
            } else if (z2) {
                tq7Var.c(onBackInvokedDispatcher, onBackInvokedCallback);
                this.f = false;
            }
        }
    }

    public final void c() {
        boolean z = this.g;
        boolean z2 = false;
        lt ltVar = this.b;
        if (ltVar == null || !ltVar.isEmpty()) {
            Iterator it = ltVar.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (((zp4) it.next()).a) {
                    z2 = true;
                    break;
                }
            }
        }
        this.g = z2;
        if (z2 != z && Build.VERSION.SDK_INT >= 33) {
            b(z2);
        }
    }
}
