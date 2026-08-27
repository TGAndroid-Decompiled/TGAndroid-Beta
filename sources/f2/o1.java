package f2;

import android.util.Log;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;
import org.telegram.messenger.BuildVars;

public abstract class o1 {

    public static final List f5788u = Collections.EMPTY_LIST;

    public final View f5789a;

    public WeakReference f5790b;

    public int f5798l;

    public RecyclerView f5806t;

    public int f5791c = -1;
    public int d = -1;

    public long f5792e = -1;

    public int f5793f = -1;

    public int f5794g = -1;
    public int h = -1;

    public int f5795i = -1;

    public o1 f5796j = null;

    public o1 f5797k = null;

    public ArrayList f5799m = null;

    public List f5800n = null;

    public int f5801o = 0;

    public e1 f5802p = null;

    public boolean f5803q = false;

    public int f5804r = 0;

    public int f5805s = -1;

    public o1(View view) {
        if (view == null) {
            throw new IllegalArgumentException("itemView may not be null");
        }
        this.f5789a = view;
    }

    public final void a(int i10) {
        this.f5798l = i10 | this.f5798l;
    }

    public final int b() {
        RecyclerView recyclerView = this.f5806t;
        if (recyclerView == null) {
            return -1;
        }
        return recyclerView.N(this);
    }

    public final int c() {
        int i10 = this.f5794g;
        return i10 == -1 ? this.f5791c : i10;
    }

    public final List d() {
        ArrayList arrayList;
        return ((this.f5798l & 1024) != 0 || (arrayList = this.f5799m) == null || arrayList.size() == 0) ? f5788u : this.f5800n;
    }

    public final boolean e(int i10) {
        return (i10 & this.f5798l) != 0;
    }

    public final boolean f() {
        View view = this.f5789a;
        return (view.getParent() == null || view.getParent() == this.f5806t) ? false : true;
    }

    public final boolean g() {
        return (this.f5798l & 1) != 0;
    }

    public final boolean h() {
        return (this.f5798l & 4) != 0;
    }

    public final boolean i() {
        if ((this.f5798l & 16) != 0) {
            return false;
        }
        WeakHashMap weakHashMap = r0.j0.f46605a;
        return !this.f5789a.hasTransientState();
    }

    public final boolean j() {
        return (this.f5798l & 8) != 0;
    }

    public final boolean k() {
        return this.f5802p != null;
    }

    public final boolean l() {
        return (this.f5798l & 256) != 0;
    }

    public final boolean m() {
        return (this.f5798l & 2) != 0;
    }

    public final void n(int i10, boolean z10) {
        if (this.d == -1) {
            this.d = this.f5791c;
        }
        if (this.f5794g == -1) {
            this.f5794g = this.f5791c;
        }
        if (z10) {
            this.f5794g += i10;
        }
        this.f5791c += i10;
        View view = this.f5789a;
        if (view.getLayoutParams() != null) {
            ((y0) view.getLayoutParams()).f5866c = true;
        }
    }

    public final void o() {
        this.f5798l = 0;
        int i10 = this.f5791c;
        if (i10 != -1) {
            this.h = i10;
        }
        this.f5791c = -1;
        this.d = -1;
        this.f5792e = -1L;
        this.f5794g = -1;
        this.f5801o = 0;
        this.f5796j = null;
        this.f5797k = null;
        ArrayList arrayList = this.f5799m;
        if (arrayList != null) {
            arrayList.clear();
        }
        this.f5798l &= -1025;
        this.f5804r = 0;
        this.f5805s = -1;
        RecyclerView.m(this);
    }

    public final void p(int i10, int i11) {
        this.f5798l = (i10 & i11) | (this.f5798l & (~i11));
    }

    public final void q(boolean z10) {
        int i10 = this.f5801o;
        int i11 = z10 ? i10 - 1 : i10 + 1;
        this.f5801o = i11;
        if (i11 < 0) {
            this.f5801o = 0;
            if (BuildVars.DEBUG_VERSION) {
                throw new RuntimeException("isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
            }
            Log.e("View", "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
            return;
        }
        if (!z10 && i11 == 1) {
            this.f5798l |= 16;
        } else if (z10 && i11 == 0) {
            this.f5798l &= -17;
        }
    }

    public final boolean r() {
        return (this.f5798l & 128) != 0;
    }

    public final boolean s() {
        return (this.f5798l & 32) != 0;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ViewHolder{" + Integer.toHexString(hashCode()) + " position=" + this.f5791c + " id=" + this.f5792e + ", oldPos=" + this.d + ", pLpos:" + this.f5794g);
        if (k()) {
            sb2.append(" scrap ");
            sb2.append(this.f5803q ? "[changeScrap]" : "[attachedScrap]");
        }
        if (h()) {
            sb2.append(" invalid");
        }
        if (!g()) {
            sb2.append(" unbound");
        }
        if ((this.f5798l & 2) != 0) {
            sb2.append(" update");
        }
        if (j()) {
            sb2.append(" removed");
        }
        if (r()) {
            sb2.append(" ignored");
        }
        if (l()) {
            sb2.append(" tmpDetached");
        }
        if (!i()) {
            sb2.append(" not recyclable(" + this.f5801o + ")");
        }
        if ((this.f5798l & 512) != 0 || h()) {
            sb2.append(" undefined adapter position");
        }
        if (this.f5789a.getParent() == null) {
            sb2.append(" no parent");
        }
        sb2.append("}");
        return sb2.toString();
    }
}
