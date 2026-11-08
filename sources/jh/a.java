package jh;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.ij;
import org.telegram.ui.aj;
public final class a {
    public RecyclerView f17009a;
    public int f17010b;
    public long f17011c;
    public int d;
    public boolean f17012e;

    public final boolean a(ij ijVar) {
        if (ijVar != null) {
            if (ijVar.f1() != this.f17010b) {
                if (this.f17011c != 0 && ijVar.d1() == this.f17011c) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    public final boolean b() {
        return this.f17012e;
    }

    public final boolean c(int i7, long j3) {
        if (this.f17010b == i7 && this.f17011c == j3) {
            return false;
        }
        this.f17010b = i7;
        this.f17011c = j3;
        if (i7 == 0) {
            this.f17012e = false;
            return true;
        }
        return true;
    }

    public final void d(int i7) {
        this.d = i7;
    }

    public final void e(aj ajVar) {
        this.f17009a = ajVar;
    }
}
