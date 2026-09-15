package hh;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.MessageObject;
import org.telegram.ui.uj;
public final class a {
    public RecyclerView f10492a;
    public int f10493b;
    public long f10494c;
    public int d;
    public boolean e;

    public final boolean a(MessageObject messageObject) {
        if (messageObject != null) {
            if (messageObject.getId() != this.f10493b) {
                if (this.f10494c != 0 && messageObject.getGroupId() == this.f10494c) {
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
        if (this.f10493b == i10 && this.f10494c == j3) {
            return false;
        }
        this.f10493b = i10;
        this.f10494c = j3;
        if (i10 == 0) {
            this.e = false;
            return true;
        }
        return true;
    }

    public final void d(int i10) {
        this.d = i10;
    }

    public final void e(uj ujVar) {
        this.f10492a = ujVar;
    }
}
