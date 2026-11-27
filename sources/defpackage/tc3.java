package defpackage;

import android.util.Log;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
public final class tc3 {
    public final ViewGroup a;
    public final ArrayList b;
    public final ArrayList c;
    public boolean d;
    public boolean e;

    public tc3(ViewGroup viewGroup) {
        viewGroup.getClass();
        this.a = viewGroup;
        this.b = new ArrayList();
        this.c = new ArrayList();
    }

    public final void a(ArrayList arrayList, boolean z) {
        if (kq4.K(2)) {
            Log.v("FragmentManager", "Collecting Effects");
        }
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            ListIterator listIterator = arrayList.listIterator(arrayList.size());
            if (!listIterator.hasPrevious()) {
                if (kq4.K(2)) {
                    Log.v("FragmentManager", "Executing operations from null to null");
                }
                if (!arrayList.isEmpty()) {
                    poa poaVar = (poa) c00.g(1, arrayList);
                    throw null;
                }
                throw new NoSuchElementException("List is empty.");
            }
            poa poaVar2 = (poa) listIterator.previous();
            throw null;
        }
        poa poaVar3 = (poa) it.next();
        throw null;
    }

    public final void b() {
        if (!this.a.isAttachedToWindow()) {
            c();
            this.e = false;
            return;
        }
        synchronized (this.b) {
            ArrayList arrayList = new ArrayList(this.c);
            this.c.clear();
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                poa poaVar = (poa) obj;
                if (this.b.isEmpty()) {
                    poaVar.getClass();
                } else {
                    throw null;
                }
            }
            int size2 = arrayList.size();
            int i2 = 0;
            while (i2 < size2) {
                Object obj2 = arrayList.get(i2);
                i2++;
                poa poaVar2 = (poa) obj2;
                if (this.d) {
                    if (kq4.K(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Completing non-seekable operation " + poaVar2);
                    }
                    poaVar2.b();
                    throw null;
                }
                if (kq4.K(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Cancelling operation " + poaVar2);
                }
                poaVar2.a(this.a);
                this.d = false;
                this.c.add(poaVar2);
            }
            if (!this.b.isEmpty()) {
                e();
                ArrayList arrayList2 = new ArrayList(this.b);
                if (arrayList2.isEmpty()) {
                    return;
                }
                this.b.clear();
                this.c.addAll(arrayList2);
                if (kq4.K(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Executing pending operations");
                }
                a(arrayList2, this.e);
                throw null;
            }
        }
    }

    public final void c() {
        String str;
        String str2;
        if (kq4.K(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Forcing all operations to complete");
        }
        boolean isAttachedToWindow = this.a.isAttachedToWindow();
        synchronized (this.b) {
            e();
            d(this.b);
            ArrayList arrayList = new ArrayList(this.c);
            int size = arrayList.size();
            int i = 0;
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                ((poa) obj).getClass();
            }
            int size2 = arrayList.size();
            int i3 = 0;
            while (i3 < size2) {
                Object obj2 = arrayList.get(i3);
                i3++;
                poa poaVar = (poa) obj2;
                if (kq4.K(2)) {
                    if (isAttachedToWindow) {
                        str2 = "";
                    } else {
                        str2 = "Container " + this.a + " is not attached to window. ";
                    }
                    Log.v("FragmentManager", "SpecialEffectsController: " + str2 + "Cancelling running operation " + poaVar);
                }
                poaVar.a(this.a);
            }
            ArrayList arrayList2 = new ArrayList(this.b);
            int size3 = arrayList2.size();
            int i4 = 0;
            while (i4 < size3) {
                Object obj3 = arrayList2.get(i4);
                i4++;
                ((poa) obj3).getClass();
            }
            int size4 = arrayList2.size();
            while (i < size4) {
                Object obj4 = arrayList2.get(i);
                i++;
                poa poaVar2 = (poa) obj4;
                if (kq4.K(2)) {
                    if (isAttachedToWindow) {
                        str = "";
                    } else {
                        str = "Container " + this.a + " is not attached to window. ";
                    }
                    Log.v("FragmentManager", "SpecialEffectsController: " + str + "Cancelling pending operation " + poaVar2);
                }
                poaVar2.a(this.a);
            }
        }
    }

    public final void d(ArrayList arrayList) {
        if (arrayList.size() <= 0) {
            ArrayList arrayList2 = new ArrayList();
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                ((poa) obj).getClass();
                yl2.d(null, arrayList2);
            }
            List k = sl2.k(sl2.m(arrayList2));
            int size2 = k.size();
            for (int i2 = 0; i2 < size2; i2++) {
                ooa ooaVar = (ooa) k.get(i2);
                ooaVar.getClass();
                ViewGroup viewGroup = this.a;
                viewGroup.getClass();
                if (!ooaVar.a) {
                    ooaVar.c(viewGroup);
                }
                ooaVar.a = true;
            }
            return;
        }
        poa poaVar = (poa) arrayList.get(0);
        throw null;
    }

    public final void e() {
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((poa) obj).getClass();
        }
    }
}
