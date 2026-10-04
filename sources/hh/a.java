package hh;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.MessageObject;
import org.telegram.ui.sj;
public final class a {
    public RecyclerView f11421a;
    public int f11422b;
    public long f11423c;
    public int d;
    public boolean f11424e;

    public final boolean a(MessageObject messageObject) {
        if (messageObject != null) {
            if (messageObject.getId() != this.f11422b) {
                if (this.f11423c != 0 && messageObject.getGroupId() == this.f11423c) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    public final boolean b() {
        return this.f11424e;
    }

    public final boolean c(int i10, long j3) {
        if (this.f11422b == i10 && this.f11423c == j3) {
            return false;
        }
        this.f11422b = i10;
        this.f11423c = j3;
        if (i10 == 0) {
            this.f11424e = false;
            return true;
        }
        return true;
    }

    public final void d(int i10) {
        this.d = i10;
    }

    public final void e(sj sjVar) {
        this.f11421a = sjVar;
    }
}
