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
public abstract class n1 {
    public static final List f6431u = Collections.EMPTY_LIST;
    public final View f6432a;
    public WeakReference f6433b;
    public int f6441l;
    public RecyclerView f6449t;
    public int f6434c = -1;
    public int d = -1;
    public long f6435e = -1;
    public int f6436f = -1;
    public int f6437g = -1;
    public int h = -1;
    public int f6438i = -1;
    public n1 f6439j = null;
    public n1 f6440k = null;
    public ArrayList f6442m = null;
    public List f6443n = null;
    public int f6444o = 0;
    public d1 f6445p = null;
    public boolean f6446q = false;
    public int f6447r = 0;
    public int f6448s = -1;

    public n1(View view) {
        if (view != null) {
            this.f6432a = view;
            return;
        }
        throw new IllegalArgumentException("itemView may not be null");
    }

    public final void a(int i10) {
        this.f6441l = i10 | this.f6441l;
    }

    public final int b() {
        RecyclerView recyclerView = this.f6449t;
        if (recyclerView == null) {
            return -1;
        }
        return recyclerView.N(this);
    }

    public final int c() {
        int i10 = this.f6437g;
        if (i10 == -1) {
            return this.f6434c;
        }
        return i10;
    }

    public final List d() {
        ArrayList arrayList;
        if ((this.f6441l & 1024) == 0 && (arrayList = this.f6442m) != null && arrayList.size() != 0) {
            return this.f6443n;
        }
        return f6431u;
    }

    public final boolean e(int i10) {
        if ((i10 & this.f6441l) != 0) {
            return true;
        }
        return false;
    }

    public final boolean f() {
        View view = this.f6432a;
        if (view.getParent() != null && view.getParent() != this.f6449t) {
            return true;
        }
        return false;
    }

    public final boolean g() {
        if ((this.f6441l & 1) != 0) {
            return true;
        }
        return false;
    }

    public final boolean h() {
        if ((this.f6441l & 4) != 0) {
            return true;
        }
        return false;
    }

    public final boolean i() {
        if ((this.f6441l & 16) == 0) {
            WeakHashMap weakHashMap = r0.j0.f46829a;
            if (!this.f6432a.hasTransientState()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean j() {
        if ((this.f6441l & 8) != 0) {
            return true;
        }
        return false;
    }

    public final boolean k() {
        if (this.f6445p != null) {
            return true;
        }
        return false;
    }

    public final boolean l() {
        if ((this.f6441l & 256) != 0) {
            return true;
        }
        return false;
    }

    public final boolean m() {
        if ((this.f6441l & 2) != 0) {
            return true;
        }
        return false;
    }

    public final void n(int i10, boolean z10) {
        if (this.d == -1) {
            this.d = this.f6434c;
        }
        if (this.f6437g == -1) {
            this.f6437g = this.f6434c;
        }
        if (z10) {
            this.f6437g += i10;
        }
        this.f6434c += i10;
        View view = this.f6432a;
        if (view.getLayoutParams() != null) {
            ((x0) view.getLayoutParams()).f6510c = true;
        }
    }

    public final void o() {
        this.f6441l = 0;
        int i10 = this.f6434c;
        if (i10 != -1) {
            this.h = i10;
        }
        this.f6434c = -1;
        this.d = -1;
        this.f6435e = -1L;
        this.f6437g = -1;
        this.f6444o = 0;
        this.f6439j = null;
        this.f6440k = null;
        ArrayList arrayList = this.f6442m;
        if (arrayList != null) {
            arrayList.clear();
        }
        this.f6441l &= -1025;
        this.f6447r = 0;
        this.f6448s = -1;
        RecyclerView.m(this);
    }

    public final void p(int i10, int i11) {
        this.f6441l = (i10 & i11) | (this.f6441l & (~i11));
    }

    public final void q(boolean z10) {
        int i10;
        int i11 = this.f6444o;
        if (z10) {
            i10 = i11 - 1;
        } else {
            i10 = i11 + 1;
        }
        this.f6444o = i10;
        if (i10 < 0) {
            this.f6444o = 0;
            if (!BuildVars.DEBUG_VERSION) {
                Log.e("View", "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
                return;
            }
            throw new RuntimeException("isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
        } else if (!z10 && i10 == 1) {
            this.f6441l |= 16;
        } else if (z10 && i10 == 0) {
            this.f6441l &= -17;
        }
    }

    public final boolean r() {
        if ((this.f6441l & 128) != 0) {
            return true;
        }
        return false;
    }

    public final boolean s() {
        if ((this.f6441l & 32) != 0) {
            return true;
        }
        return false;
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("ViewHolder{" + Integer.toHexString(hashCode()) + " position=" + this.f6434c + " id=" + this.f6435e + ", oldPos=" + this.d + ", pLpos:" + this.f6437g);
        if (k()) {
            sb2.append(" scrap ");
            if (this.f6446q) {
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
        if ((this.f6441l & 2) != 0) {
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
            sb2.append(" not recyclable(" + this.f6444o + ")");
        }
        if ((this.f6441l & 512) != 0 || h()) {
            sb2.append(" undefined adapter position");
        }
        if (this.f6432a.getParent() == null) {
            sb2.append(" no parent");
        }
        sb2.append("}");
        return sb2.toString();
    }
}
