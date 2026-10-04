package hh;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.MessageObject;
import org.telegram.ui.sj;
public final class a {
    public RecyclerView f11422a;
    public int f11423b;
    public long f11424c;
    public int d;
    public boolean f11425e;

    public final boolean a(MessageObject messageObject) {
        if (messageObject != null) {
            if (messageObject.getId() != this.f11423b) {
                if (this.f11424c != 0 && messageObject.getGroupId() == this.f11424c) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    public final boolean b() {
        return this.f11425e;
    }

    public final boolean c(int i10, long j3) {
        if (this.f11423b == i10 && this.f11424c == j3) {
            return false;
        }
        this.f11423b = i10;
        this.f11424c = j3;
        if (i10 == 0) {
            this.f11425e = false;
            return true;
        }
        return true;
    }

    public final void d(int i10) {
        this.d = i10;
    }

    public final void e(sj sjVar) {
        this.f11422a = sjVar;
    }
}
