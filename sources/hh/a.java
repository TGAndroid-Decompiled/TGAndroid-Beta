package hh;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.MessageObject;
import org.telegram.ui.wj;
public final class a {
    public RecyclerView f11470a;
    public int f11471b;
    public long f11472c;
    public int d;
    public boolean f11473e;

    public final boolean a(MessageObject messageObject) {
        if (messageObject != null) {
            if (messageObject.getId() != this.f11471b) {
                if (this.f11472c != 0 && messageObject.getGroupId() == this.f11472c) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    public final boolean b() {
        return this.f11473e;
    }

    public final boolean c(int i10, long j3) {
        if (this.f11471b == i10 && this.f11472c == j3) {
            return false;
        }
        this.f11471b = i10;
        this.f11472c = j3;
        if (i10 == 0) {
            this.f11473e = false;
            return true;
        }
        return true;
    }

    public final void d(int i10) {
        this.d = i10;
    }

    public final void e(wj wjVar) {
        this.f11470a = wjVar;
    }
}
