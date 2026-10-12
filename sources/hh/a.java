package hh;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.MessageObject;
import org.telegram.ui.ak;
public final class a {
    public RecyclerView f11469a;
    public int f11470b;
    public long f11471c;
    public int d;
    public boolean f11472e;

    public final boolean a(MessageObject messageObject) {
        if (messageObject != null) {
            if (messageObject.getId() != this.f11470b) {
                if (this.f11471c != 0 && messageObject.getGroupId() == this.f11471c) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    public final boolean b() {
        return this.f11472e;
    }

    public final boolean c(int i10, long j3) {
        if (this.f11470b == i10 && this.f11471c == j3) {
            return false;
        }
        this.f11470b = i10;
        this.f11471c = j3;
        if (i10 == 0) {
            this.f11472e = false;
            return true;
        }
        return true;
    }

    public final void d(int i10) {
        this.d = i10;
    }

    public final void e(ak akVar) {
        this.f11469a = akVar;
    }
}
