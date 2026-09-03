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
public abstract class m1 {
    public static final List f5874u = Collections.EMPTY_LIST;
    public final View f5875a;
    public WeakReference f5876b;
    public int f5884l;
    public RecyclerView f5892t;
    public int f5877c = -1;
    public int d = -1;
    public long f5878e = -1;
    public int f5879f = -1;
    public int f5880g = -1;
    public int h = -1;
    public int f5881i = -1;
    public m1 f5882j = null;
    public m1 f5883k = null;
    public ArrayList f5885m = null;
    public List f5886n = null;
    public int f5887o = 0;
    public bf.f f5888p = null;
    public boolean f5889q = false;
    public int f5890r = 0;
    public int f5891s = -1;

    public m1(View view) {
        if (view != null) {
            this.f5875a = view;
            return;
        }
        throw new IllegalArgumentException("itemView may not be null");
    }

    public final void a(int i10) {
        this.f5884l = i10 | this.f5884l;
    }

    public final int b() {
        RecyclerView recyclerView = this.f5892t;
        if (recyclerView == null) {
            return -1;
        }
        return recyclerView.N(this);
    }

    public final int c() {
        int i10 = this.f5880g;
        if (i10 == -1) {
            return this.f5877c;
        }
        return i10;
    }

    public final List d() {
        ArrayList arrayList;
        if ((this.f5884l & 1024) == 0 && (arrayList = this.f5885m) != null && arrayList.size() != 0) {
            return this.f5886n;
        }
        return f5874u;
    }

    public final boolean e(int i10) {
        if ((i10 & this.f5884l) != 0) {
            return true;
        }
        return false;
    }

    public final boolean f() {
        View view = this.f5875a;
        if (view.getParent() != null && view.getParent() != this.f5892t) {
            return true;
        }
        return false;
    }

    public final boolean g() {
        if ((this.f5884l & 1) != 0) {
            return true;
        }
        return false;
    }

    public final boolean h() {
        if ((this.f5884l & 4) != 0) {
            return true;
        }
        return false;
    }

    public final boolean i() {
        if ((this.f5884l & 16) == 0) {
            WeakHashMap weakHashMap = r0.j0.f46469a;
            if (!this.f5875a.hasTransientState()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean j() {
        if ((this.f5884l & 8) != 0) {
            return true;
        }
        return false;
    }

    public final boolean k() {
        if (this.f5888p != null) {
            return true;
        }
        return false;
    }

    public final boolean l() {
        if ((this.f5884l & 256) != 0) {
            return true;
        }
        return false;
    }

    public final boolean m() {
        if ((this.f5884l & 2) != 0) {
            return true;
        }
        return false;
    }

    public final void n(int i10, boolean z4) {
        if (this.d == -1) {
            this.d = this.f5877c;
        }
        if (this.f5880g == -1) {
            this.f5880g = this.f5877c;
        }
        if (z4) {
            this.f5880g += i10;
        }
        this.f5877c += i10;
        View view = this.f5875a;
        if (view.getLayoutParams() != null) {
            ((x0) view.getLayoutParams()).f5954c = true;
        }
    }

    public final void o() {
        this.f5884l = 0;
        int i10 = this.f5877c;
        if (i10 != -1) {
            this.h = i10;
        }
        this.f5877c = -1;
        this.d = -1;
        this.f5878e = -1L;
        this.f5880g = -1;
        this.f5887o = 0;
        this.f5882j = null;
        this.f5883k = null;
        ArrayList arrayList = this.f5885m;
        if (arrayList != null) {
            arrayList.clear();
        }
        this.f5884l &= -1025;
        this.f5890r = 0;
        this.f5891s = -1;
        RecyclerView.m(this);
    }

    public final void p(int i10, int i11) {
        this.f5884l = (i10 & i11) | (this.f5884l & (~i11));
    }

    public final void q(boolean z4) {
        int i10;
        int i11 = this.f5887o;
        if (z4) {
            i10 = i11 - 1;
        } else {
            i10 = i11 + 1;
        }
        this.f5887o = i10;
        if (i10 < 0) {
            this.f5887o = 0;
            if (!BuildVars.DEBUG_VERSION) {
                Log.e("View", "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
                return;
            }
            throw new RuntimeException("isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
        } else if (!z4 && i10 == 1) {
            this.f5884l |= 16;
        } else if (z4 && i10 == 0) {
            this.f5884l &= -17;
        }
    }

    public final boolean r() {
        if ((this.f5884l & 128) != 0) {
            return true;
        }
        return false;
    }

    public final boolean s() {
        if ((this.f5884l & 32) != 0) {
            return true;
        }
        return false;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("ViewHolder{" + Integer.toHexString(hashCode()) + " position=" + this.f5877c + " id=" + this.f5878e + ", oldPos=" + this.d + ", pLpos:" + this.f5880g);
        if (k()) {
            sb.append(" scrap ");
            if (this.f5889q) {
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
        if ((this.f5884l & 2) != 0) {
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
            sb.append(" not recyclable(" + this.f5887o + ")");
        }
        if ((this.f5884l & 512) != 0 || h()) {
            sb.append(" undefined adapter position");
        }
        if (this.f5875a.getParent() == null) {
            sb.append(" no parent");
        }
        sb.append("}");
        return sb.toString();
    }
}
