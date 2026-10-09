package hh;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.MessageObject;
import org.telegram.ui.wj;
public final class a {
    public RecyclerView f11471a;
    public int f11472b;
    public long f11473c;
    public int d;
    public boolean f11474e;

    public final boolean a(MessageObject messageObject) {
        if (messageObject != null) {
            if (messageObject.getId() != this.f11472b) {
                if (this.f11473c != 0 && messageObject.getGroupId() == this.f11473c) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    public final boolean b() {
        return this.f11474e;
    }

    public final boolean c(int i10, long j3) {
        if (this.f11472b == i10 && this.f11473c == j3) {
            return false;
        }
        this.f11472b = i10;
        this.f11473c = j3;
        if (i10 == 0) {
            this.f11474e = false;
            return true;
        }
        return true;
    }

    public final void d(int i10) {
        this.d = i10;
    }

    public final void e(wj wjVar) {
        this.f11471a = wjVar;
    }
}
