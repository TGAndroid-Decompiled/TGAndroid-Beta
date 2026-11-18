package jh;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.fj;
import org.telegram.ui.bj;
public final class a {
    public RecyclerView f17747a;
    public int f17748b;
    public long f17749c;
    public int d;
    public boolean f17750e;

    public final boolean a(fj fjVar) {
        if (fjVar != null) {
            if (fjVar.e1() != this.f17748b) {
                if (this.f17749c != 0 && fjVar.c1() == this.f17749c) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    public final boolean b() {
        return this.f17750e;
    }

    public final boolean c(int i7, long j3) {
        if (this.f17748b == i7 && this.f17749c == j3) {
            return false;
        }
        this.f17748b = i7;
        this.f17749c = j3;
        if (i7 == 0) {
            this.f17750e = false;
            return true;
        }
        return true;
    }

    public final void d(int i7) {
        this.d = i7;
    }

    public final void e(bj bjVar) {
        this.f17747a = bjVar;
    }
}
