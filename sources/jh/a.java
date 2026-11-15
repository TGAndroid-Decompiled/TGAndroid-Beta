package jh;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.gj;
import org.telegram.ui.aj;
public final class a {
    public RecyclerView f17361a;
    public int f17362b;
    public long f17363c;
    public int d;
    public boolean f17364e;

    public final boolean a(gj gjVar) {
        if (gjVar != null) {
            if (gjVar.e1() != this.f17362b) {
                if (this.f17363c != 0 && gjVar.c1() == this.f17363c) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    public final boolean b() {
        return this.f17364e;
    }

    public final boolean c(int i7, long j3) {
        if (this.f17362b == i7 && this.f17363c == j3) {
            return false;
        }
        this.f17362b = i7;
        this.f17363c = j3;
        if (i7 == 0) {
            this.f17364e = false;
            return true;
        }
        return true;
    }

    public final void d(int i7) {
        this.d = i7;
    }

    public final void e(aj ajVar) {
        this.f17361a = ajVar;
    }
}
