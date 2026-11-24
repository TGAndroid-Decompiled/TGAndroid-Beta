package defpackage;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;
public abstract class s49 {
    public static final List u = Collections.EMPTY_LIST;
    public final View a;
    public WeakReference b;
    public int l;
    public RecyclerView t;
    public int c = -1;
    public int d = -1;
    public long e = -1;
    public int f = -1;
    public int g = -1;
    public int h = -1;
    public int i = -1;
    public s49 j = null;
    public s49 k = null;
    public ArrayList m = null;
    public List n = null;
    public int o = 0;
    public wg2 p = null;
    public boolean q = false;
    public int r = 0;
    public int s = -1;

    public s49(View view) {
        if (view != null) {
            this.a = view;
        } else {
            w26.j("itemView may not be null");
            throw null;
        }
    }

    public final void a(int i) {
        this.l |= i;
    }

    public final int b() {
        RecyclerView recyclerView = this.t;
        if (recyclerView == null) {
            return -1;
        }
        return recyclerView.N(this);
    }

    public final int c() {
        int i = this.g;
        if (i == -1) {
            return this.c;
        }
        return i;
    }

    public final List d() {
        ArrayList arrayList;
        if ((this.l & 1024) == 0 && (arrayList = this.m) != null && arrayList.size() != 0) {
            return this.n;
        }
        return u;
    }

    public final boolean e(int i) {
        if ((this.l & i) != 0) {
            return true;
        }
        return false;
    }

    public final boolean f() {
        View view = this.a;
        if (view.getParent() != null && view.getParent() != this.t) {
            return true;
        }
        return false;
    }

    public final boolean g() {
        if ((this.l & 1) != 0) {
            return true;
        }
        return false;
    }

    public final boolean h() {
        if ((this.l & 4) != 0) {
            return true;
        }
        return false;
    }

    public final boolean i() {
        if ((this.l & 16) == 0) {
            WeakHashMap weakHashMap = jdc.a;
            if (!this.a.hasTransientState()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean j() {
        if ((this.l & 8) != 0) {
            return true;
        }
        return false;
    }

    public final boolean k() {
        if (this.p != null) {
            return true;
        }
        return false;
    }

    public final boolean l() {
        if ((this.l & 256) != 0) {
            return true;
        }
        return false;
    }

    public final boolean m() {
        if ((this.l & 2) != 0) {
            return true;
        }
        return false;
    }

    public final void n(int i, boolean z) {
        if (this.d == -1) {
            this.d = this.c;
        }
        int i2 = this.g;
        if (i2 == -1) {
            i2 = this.c;
            this.g = i2;
        }
        if (z) {
            this.g = i2 + i;
        }
        this.c += i;
        View view = this.a;
        if (view.getLayoutParams() != null) {
            ((e49) view.getLayoutParams()).c = true;
        }
    }

    public final void o() {
        this.l = 0;
        int i = this.c;
        if (i != -1) {
            this.h = i;
        }
        this.c = -1;
        this.d = -1;
        this.e = -1L;
        this.g = -1;
        this.o = 0;
        this.j = null;
        this.k = null;
        ArrayList arrayList = this.m;
        if (arrayList != null) {
            arrayList.clear();
        }
        this.l &= -1025;
        this.r = 0;
        this.s = -1;
        RecyclerView.m(this);
    }

    public final void p(int i, int i2) {
        this.l = (this.l & (~i2)) | (i & i2);
    }

    public final void q(boolean z) {
        int i;
        int i2 = this.o;
        if (z) {
            i = i2 - 1;
        } else {
            i = i2 + 1;
        }
        this.o = i;
        if (i >= 0) {
            if (!z) {
                if (i == 1) {
                    this.l |= 16;
                    return;
                }
                return;
            } else if (i == 0) {
                this.l &= -17;
                return;
            } else {
                return;
            }
        }
        this.o = 0;
        boolean z2 = w01.a;
        fyb.h(this, "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for ");
    }

    public final boolean r() {
        if ((this.l & 128) != 0) {
            return true;
        }
        return false;
    }

    public final boolean s() {
        if ((this.l & 32) != 0) {
            return true;
        }
        return false;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("ViewHolder{" + Integer.toHexString(hashCode()) + " position=" + this.c + " id=" + this.e + ", oldPos=" + this.d + ", pLpos:" + this.g);
        if (k()) {
            sb.append(" scrap ");
            if (this.q) {
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
        if ((this.l & 2) != 0) {
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
            sb.append(" not recyclable(" + this.o + ")");
        }
        if ((this.l & 512) != 0 || h()) {
            sb.append(" undefined adapter position");
        }
        if (this.a.getParent() == null) {
            sb.append(" no parent");
        }
        sb.append("}");
        return sb.toString();
    }
}
