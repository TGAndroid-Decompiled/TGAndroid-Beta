package jh;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.MessageObject;
import org.telegram.ui.rj;
public final class a {
    public RecyclerView f15916a;
    public int f15917b;
    public long f15918c;
    public int d;
    public boolean e;

    public final boolean a(MessageObject messageObject) {
        if (messageObject != null) {
            if (messageObject.getId() != this.f15917b) {
                if (this.f15918c != 0 && messageObject.getGroupId() == this.f15918c) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    public final boolean b() {
        return this.e;
    }

    public final boolean c(int i10, long j10) {
        if (this.f15917b == i10 && this.f15918c == j10) {
            return false;
        }
        this.f15917b = i10;
        this.f15918c = j10;
        if (i10 == 0) {
            this.e = false;
            return true;
        }
        return true;
    }

    public final void d(int i10) {
        this.d = i10;
    }

    public final void e(rj rjVar) {
        this.f15916a = rjVar;
    }
}
