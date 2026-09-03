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
public abstract class l1 {
    public static final List f5773u = Collections.EMPTY_LIST;
    public final View f5774a;
    public WeakReference f5775b;
    public int f5782l;
    public RecyclerView f5790t;
    public int f5776c = -1;
    public int d = -1;
    public long e = -1;
    public int f5777f = -1;
    public int f5778g = -1;
    public int h = -1;
    public int f5779i = -1;
    public l1 f5780j = null;
    public l1 f5781k = null;
    public ArrayList f5783m = null;
    public List f5784n = null;
    public int f5785o = 0;
    public af.h f5786p = null;
    public boolean f5787q = false;
    public int f5788r = 0;
    public int f5789s = -1;

    public l1(View view) {
        if (view != null) {
            this.f5774a = view;
            return;
        }
        throw new IllegalArgumentException("itemView may not be null");
    }

    public final void a(int i10) {
        this.f5782l = i10 | this.f5782l;
    }

    public final int b() {
        RecyclerView recyclerView = this.f5790t;
        if (recyclerView == null) {
            return -1;
        }
        return recyclerView.N(this);
    }

    public final int c() {
        int i10 = this.f5778g;
        if (i10 == -1) {
            return this.f5776c;
        }
        return i10;
    }

    public final List d() {
        ArrayList arrayList;
        if ((this.f5782l & 1024) == 0 && (arrayList = this.f5783m) != null && arrayList.size() != 0) {
            return this.f5784n;
        }
        return f5773u;
    }

    public final boolean e(int i10) {
        if ((i10 & this.f5782l) != 0) {
            return true;
        }
        return false;
    }

    public final boolean f() {
        View view = this.f5774a;
        if (view.getParent() != null && view.getParent() != this.f5790t) {
            return true;
        }
        return false;
    }

    public final boolean g() {
        if ((this.f5782l & 1) != 0) {
            return true;
        }
        return false;
    }

    public final boolean h() {
        if ((this.f5782l & 4) != 0) {
            return true;
        }
        return false;
    }

    public final boolean i() {
        if ((this.f5782l & 16) == 0) {
            WeakHashMap weakHashMap = r0.j0.f43142a;
            if (!this.f5774a.hasTransientState()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean j() {
        if ((this.f5782l & 8) != 0) {
            return true;
        }
        return false;
    }

    public final boolean k() {
        if (this.f5786p != null) {
            return true;
        }
        return false;
    }

    public final boolean l() {
        if ((this.f5782l & 256) != 0) {
            return true;
        }
        return false;
    }

    public final boolean m() {
        if ((this.f5782l & 2) != 0) {
            return true;
        }
        return false;
    }

    public final void n(int i10, boolean z4) {
        if (this.d == -1) {
            this.d = this.f5776c;
        }
        if (this.f5778g == -1) {
            this.f5778g = this.f5776c;
        }
        if (z4) {
            this.f5778g += i10;
        }
        this.f5776c += i10;
        View view = this.f5774a;
        if (view.getLayoutParams() != null) {
            ((w0) view.getLayoutParams()).f5849c = true;
        }
    }

    public final void o() {
        this.f5782l = 0;
        int i10 = this.f5776c;
        if (i10 != -1) {
            this.h = i10;
        }
        this.f5776c = -1;
        this.d = -1;
        this.e = -1L;
        this.f5778g = -1;
        this.f5785o = 0;
        this.f5780j = null;
        this.f5781k = null;
        ArrayList arrayList = this.f5783m;
        if (arrayList != null) {
            arrayList.clear();
        }
        this.f5782l &= -1025;
        this.f5788r = 0;
        this.f5789s = -1;
        RecyclerView.m(this);
    }

    public final void p(int i10, int i11) {
        this.f5782l = (i10 & i11) | (this.f5782l & (~i11));
    }

    public final void q(boolean z4) {
        int i10;
        int i11 = this.f5785o;
        if (z4) {
            i10 = i11 - 1;
        } else {
            i10 = i11 + 1;
        }
        this.f5785o = i10;
        if (i10 < 0) {
            this.f5785o = 0;
            if (!BuildVars.DEBUG_VERSION) {
                Log.e("View", "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
                return;
            }
            throw new RuntimeException("isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
        } else if (!z4 && i10 == 1) {
            this.f5782l |= 16;
        } else if (z4 && i10 == 0) {
            this.f5782l &= -17;
        }
    }

    public final boolean r() {
        if ((this.f5782l & 128) != 0) {
            return true;
        }
        return false;
    }

    public final boolean s() {
        if ((this.f5782l & 32) != 0) {
            return true;
        }
        return false;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("ViewHolder{" + Integer.toHexString(hashCode()) + " position=" + this.f5776c + " id=" + this.e + ", oldPos=" + this.d + ", pLpos:" + this.f5778g);
        if (k()) {
            sb.append(" scrap ");
            if (this.f5787q) {
                str = "[changeScrap]";
            } else {
                str = "[attachedScrap]";
            }
            sb.append(str);
        }
        if (h()) {
            sb.append(" invalid");
        }
        if (!g()) {
            sb.append(" unbound");
        }
        if ((this.f5782l & 2) != 0) {
            sb.append(" update");
        }
        if (j()) {
            sb.append(" removed");
        }
        if (r()) {
            sb.append(" ignored");
        }
        if (l()) {
            sb.append(" tmpDetached");
        }
        if (!i()) {
            sb.append(" not recyclable(" + this.f5785o + ")");
        }
        if ((this.f5782l & 512) != 0 || h()) {
            sb.append(" undefined adapter position");
        }
        if (this.f5774a.getParent() == null) {
            sb.append(" no parent");
        }
        sb.append("}");
        return sb.toString();
    }
}
