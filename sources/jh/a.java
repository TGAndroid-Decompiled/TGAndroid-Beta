package jh;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.ij;
import org.telegram.ui.aj;
public final class a {
    public RecyclerView f17006a;
    public int f17007b;
    public long f17008c;
    public int d;
    public boolean f17009e;

    public final boolean a(ij ijVar) {
        if (ijVar != null) {
            if (ijVar.f1() != this.f17007b) {
                if (this.f17008c != 0 && ijVar.d1() == this.f17008c) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    public final boolean b() {
        return this.f17009e;
    }

    public final boolean c(int i7, long j3) {
        if (this.f17007b == i7 && this.f17008c == j3) {
            return false;
        }
        this.f17007b = i7;
        this.f17008c = j3;
        if (i7 == 0) {
            this.f17009e = false;
            return true;
        }
        return true;
    }

    public final void d(int i7) {
        this.d = i7;
    }

    public final void e(aj ajVar) {
        this.f17006a = ajVar;
    }
}
