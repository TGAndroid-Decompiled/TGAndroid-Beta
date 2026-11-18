package jh;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.fj;
import org.telegram.ui.bj;
public final class a {
    public RecyclerView f17744a;
    public int f17745b;
    public long f17746c;
    public int d;
    public boolean f17747e;

    public final boolean a(fj fjVar) {
        if (fjVar != null) {
            if (fjVar.e1() != this.f17745b) {
                if (this.f17746c != 0 && fjVar.c1() == this.f17746c) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    public final boolean b() {
        return this.f17747e;
    }

    public final boolean c(int i7, long j3) {
        if (this.f17745b == i7 && this.f17746c == j3) {
            return false;
        }
        this.f17745b = i7;
        this.f17746c = j3;
        if (i7 == 0) {
            this.f17747e = false;
            return true;
        }
        return true;
    }

    public final void d(int i7) {
        this.d = i7;
    }

    public final void e(bj bjVar) {
        this.f17744a = bjVar;
    }
}
