package defpackage;

import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
public final class jo4 extends odc {
    public static final c6e h = new Object();
    public final boolean e;
    public final HashMap b = new HashMap();
    public final HashMap c = new HashMap();
    public final HashMap d = new HashMap();
    public boolean f = false;
    public boolean g = false;

    public jo4(boolean z) {
        this.e = z;
    }

    @Override
    public final void b() {
        if (go4.K(3)) {
            Log.d("FragmentManager", "onCleared called for " + this);
        }
        this.f = true;
    }

    public final void c(bn4 bn4Var, boolean z) {
        if (go4.K(3)) {
            Log.d("FragmentManager", "Clearing non-config state for " + bn4Var);
        }
        e(bn4Var.e, z);
    }

    public final void d(String str, boolean z) {
        if (go4.K(3)) {
            Log.d("FragmentManager", "Clearing non-config state for saved state of Fragment " + str);
        }
        e(str, z);
    }

    public final void e(String str, boolean z) {
        HashMap hashMap = this.c;
        jo4 jo4Var = (jo4) hashMap.get(str);
        if (jo4Var != null) {
            if (z) {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(jo4Var.c.keySet());
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    jo4Var.d((String) obj, true);
                }
            }
            jo4Var.b();
            hashMap.remove(str);
        }
        HashMap hashMap2 = this.d;
        sdc sdcVar = (sdc) hashMap2.get(str);
        if (sdcVar != null) {
            sdcVar.a();
            hashMap2.remove(str);
        }
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && jo4.class == obj.getClass()) {
                jo4 jo4Var = (jo4) obj;
                if (this.b.equals(jo4Var.b) && this.c.equals(jo4Var.c) && this.d.equals(jo4Var.d)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final void f(bn4 bn4Var) {
        if (this.g) {
            if (go4.K(2)) {
                Log.v("FragmentManager", "Ignoring removeRetainedFragment as the state is already saved");
            }
        } else if (this.b.remove(bn4Var.e) != null && go4.K(2)) {
            Log.v("FragmentManager", "Updating retained Fragments: Removed " + bn4Var);
        }
    }

    public final int hashCode() {
        int hashCode = this.c.hashCode();
        return this.d.hashCode() + ((hashCode + (this.b.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FragmentManagerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} Fragments (");
        Iterator it = this.b.values().iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") Child Non Config (");
        Iterator it2 = this.c.keySet().iterator();
        while (it2.hasNext()) {
            sb.append((String) it2.next());
            if (it2.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") ViewModelStores (");
        Iterator it3 = this.d.keySet().iterator();
        while (it3.hasNext()) {
            sb.append((String) it3.next());
            if (it3.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        return sb.toString();
    }
}
