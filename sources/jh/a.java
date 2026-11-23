package jh;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.gj;
import org.telegram.ui.bj;
public final class a {
    public RecyclerView f17738a;
    public int f17739b;
    public long f17740c;
    public int d;
    public boolean f17741e;

    public final boolean a(gj gjVar) {
        if (gjVar != null) {
            if (gjVar.e1() != this.f17739b) {
                if (this.f17740c != 0 && gjVar.c1() == this.f17740c) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    public final boolean b() {
        return this.f17741e;
    }

    public final boolean c(int i7, long j3) {
        if (this.f17739b == i7 && this.f17740c == j3) {
            return false;
        }
        this.f17739b = i7;
        this.f17740c = j3;
        if (i7 == 0) {
            this.f17741e = false;
            return true;
        }
        return true;
    }

    public final void d(int i7) {
        this.d = i7;
    }

    public final void e(bj bjVar) {
        this.f17738a = bjVar;
    }
}
