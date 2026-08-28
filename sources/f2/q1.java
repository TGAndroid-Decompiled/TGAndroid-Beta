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
public abstract class q1 {
    public static final List f5500u = Collections.EMPTY_LIST;
    public final View f5501a;
    public WeakReference f5502b;
    public int f5510l;
    public RecyclerView f5518t;
    public int f5503c = -1;
    public int d = -1;
    public long f5504e = -1;
    public int f5505f = -1;
    public int f5506g = -1;
    public int h = -1;
    public int f5507i = -1;
    public q1 f5508j = null;
    public q1 f5509k = null;
    public ArrayList f5511m = null;
    public List f5512n = null;
    public int f5513o = 0;
    public g1 f5514p = null;
    public boolean f5515q = false;
    public int f5516r = 0;
    public int f5517s = -1;

    public q1(View view) {
        if (view != null) {
            this.f5501a = view;
            return;
        }
        throw new IllegalArgumentException("itemView may not be null");
    }

    public final void a(int i9) {
        this.f5510l = i9 | this.f5510l;
    }

    public final int b() {
        RecyclerView recyclerView = this.f5518t;
        if (recyclerView == null) {
            return -1;
        }
        return recyclerView.N(this);
    }

    public final int c() {
        int i9 = this.f5506g;
        if (i9 == -1) {
            return this.f5503c;
        }
        return i9;
    }

    public final List d() {
        ArrayList arrayList;
        if ((this.f5510l & 1024) == 0 && (arrayList = this.f5511m) != null && arrayList.size() != 0) {
            return this.f5512n;
        }
        return f5500u;
    }

    public final boolean e(int i9) {
        if ((i9 & this.f5510l) != 0) {
            return true;
        }
        return false;
    }

    public final boolean f() {
        View view = this.f5501a;
        if (view.getParent() != null && view.getParent() != this.f5518t) {
            return true;
        }
        return false;
    }

    public final boolean g() {
        if ((this.f5510l & 1) != 0) {
            return true;
        }
        return false;
    }

    public final boolean h() {
        if ((this.f5510l & 4) != 0) {
            return true;
        }
        return false;
    }

    public final boolean i() {
        if ((this.f5510l & 16) == 0) {
            WeakHashMap weakHashMap = r0.j0.f46915a;
            if (!this.f5501a.hasTransientState()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean j() {
        if ((this.f5510l & 8) != 0) {
            return true;
        }
        return false;
    }

    public final boolean k() {
        if (this.f5514p != null) {
            return true;
        }
        return false;
    }

    public final boolean l() {
        if ((this.f5510l & 256) != 0) {
            return true;
        }
        return false;
    }

    public final boolean m() {
        if ((this.f5510l & 2) != 0) {
            return true;
        }
        return false;
    }

    public final void n(int i9, boolean z10) {
        if (this.d == -1) {
            this.d = this.f5503c;
        }
        if (this.f5506g == -1) {
            this.f5506g = this.f5503c;
        }
        if (z10) {
            this.f5506g += i9;
        }
        this.f5503c += i9;
        View view = this.f5501a;
        if (view.getLayoutParams() != null) {
            ((a1) view.getLayoutParams()).f5313c = true;
        }
    }

    public final void o() {
        this.f5510l = 0;
        int i9 = this.f5503c;
        if (i9 != -1) {
            this.h = i9;
        }
        this.f5503c = -1;
        this.d = -1;
        this.f5504e = -1L;
        this.f5506g = -1;
        this.f5513o = 0;
        this.f5508j = null;
        this.f5509k = null;
        ArrayList arrayList = this.f5511m;
        if (arrayList != null) {
            arrayList.clear();
        }
        this.f5510l &= -1025;
        this.f5516r = 0;
        this.f5517s = -1;
        RecyclerView.m(this);
    }

    public final void p(int i9, int i10) {
        this.f5510l = (i9 & i10) | (this.f5510l & (~i10));
    }

    public final void q(boolean z10) {
        int i9;
        int i10 = this.f5513o;
        if (z10) {
            i9 = i10 - 1;
        } else {
            i9 = i10 + 1;
        }
        this.f5513o = i9;
        if (i9 < 0) {
            this.f5513o = 0;
            if (!BuildVars.DEBUG_VERSION) {
                Log.e("View", "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
                return;
            }
            throw new RuntimeException("isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
        } else if (!z10 && i9 == 1) {
            this.f5510l |= 16;
        } else if (z10 && i9 == 0) {
            this.f5510l &= -17;
        }
    }

    public final boolean r() {
        if ((this.f5510l & 128) != 0) {
            return true;
        }
        return false;
    }

    public final boolean s() {
        if ((this.f5510l & 32) != 0) {
            return true;
        }
        return false;
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("ViewHolder{" + Integer.toHexString(hashCode()) + " position=" + this.f5503c + " id=" + this.f5504e + ", oldPos=" + this.d + ", pLpos:" + this.f5506g);
        if (k()) {
            sb2.append(" scrap ");
            if (this.f5515q) {
                str = "[changeScrap]";
            } else {
                str = "[attachedScrap]";
            }
            sb2.append(str);
        }
        if (h()) {
            sb2.append(" invalid");
        }
        if (!g()) {
            sb2.append(" unbound");
        }
        if ((this.f5510l & 2) != 0) {
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
            sb2.append(" not recyclable(" + this.f5513o + ")");
        }
        if ((this.f5510l & 512) != 0 || h()) {
            sb2.append(" undefined adapter position");
        }
        if (this.f5501a.getParent() == null) {
            sb2.append(" no parent");
        }
        sb2.append("}");
        return sb2.toString();
    }
}
