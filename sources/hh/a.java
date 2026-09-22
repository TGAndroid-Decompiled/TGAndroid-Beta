package hh;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.MessageObject;
import org.telegram.ui.uj;
public final class a {
    public RecyclerView f10494a;
    public int f10495b;
    public long f10496c;
    public int d;
    public boolean e;

    public final boolean a(MessageObject messageObject) {
        if (messageObject != null) {
            if (messageObject.getId() != this.f10495b) {
                if (this.f10496c != 0 && messageObject.getGroupId() == this.f10496c) {
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
        if (this.f10495b == i10 && this.f10496c == j3) {
            return false;
        }
        this.f10495b = i10;
        this.f10496c = j3;
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
        this.f10494a = ujVar;
    }
}
