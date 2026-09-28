package hh;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.MessageObject;
import org.telegram.ui.rj;
public final class a {
    public RecyclerView f10480a;
    public int f10481b;
    public long f10482c;
    public int d;
    public boolean e;

    public final boolean a(MessageObject messageObject) {
        if (messageObject != null) {
            if (messageObject.getId() != this.f10481b) {
                if (this.f10482c != 0 && messageObject.getGroupId() == this.f10482c) {
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

    public final boolean c(int i10, long j3) {
        if (this.f10481b == i10 && this.f10482c == j3) {
            return false;
        }
        this.f10481b = i10;
        this.f10482c = j3;
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
        this.f10480a = rjVar;
    }
}
