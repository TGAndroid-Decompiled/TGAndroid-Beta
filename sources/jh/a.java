package jh;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.fj;
import org.telegram.ui.bj;
public final class a {
    public RecyclerView f17769a;
    public int f17770b;
    public long f17771c;
    public int d;
    public boolean f17772e;

    public final boolean a(fj fjVar) {
        if (fjVar != null) {
            if (fjVar.e1() != this.f17770b) {
                if (this.f17771c != 0 && fjVar.c1() == this.f17771c) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    public final boolean b() {
        return this.f17772e;
    }

    public final boolean c(int i7, long j3) {
        if (this.f17770b == i7 && this.f17771c == j3) {
            return false;
        }
        this.f17770b = i7;
        this.f17771c = j3;
        if (i7 == 0) {
            this.f17772e = false;
            return true;
        }
        return true;
    }

    public final void d(int i7) {
        this.d = i7;
    }

    public final void e(bj bjVar) {
        this.f17769a = bjVar;
    }
}
