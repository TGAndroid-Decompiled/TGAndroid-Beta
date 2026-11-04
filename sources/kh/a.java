package kh;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.zi;
import org.telegram.ui.wi;
public final class a {
    public RecyclerView f17251a;
    public int f17252b;
    public long f17253c;
    public int d;
    public boolean f17254e;

    public final boolean a(zi ziVar) {
        if (ziVar != null) {
            if (ziVar.f1() != this.f17252b) {
                if (this.f17253c != 0 && ziVar.d1() == this.f17253c) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    public final boolean b() {
        return this.f17254e;
    }

    public final boolean c(int i3, long j10) {
        if (this.f17252b == i3 && this.f17253c == j10) {
            return false;
        }
        this.f17252b = i3;
        this.f17253c = j10;
        if (i3 == 0) {
            this.f17254e = false;
            return true;
        }
        return true;
    }

    public final void d(int i3) {
        this.d = i3;
    }

    public final void e(wi wiVar) {
        this.f17251a = wiVar;
    }
}
