package hh;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.MessageObject;
import org.telegram.ui.tj;
public final class a {
    public RecyclerView f10485a;
    public int f10486b;
    public long f10487c;
    public int d;
    public boolean e;

    public final boolean a(MessageObject messageObject) {
        if (messageObject != null) {
            if (messageObject.getId() != this.f10486b) {
                if (this.f10487c != 0 && messageObject.getGroupId() == this.f10487c) {
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
        if (this.f10486b == i10 && this.f10487c == j3) {
            return false;
        }
        this.f10486b = i10;
        this.f10487c = j3;
        if (i10 == 0) {
            this.e = false;
            return true;
        }
        return true;
    }

    public final void d(int i10) {
        this.d = i10;
    }

    public final void e(tj tjVar) {
        this.f10485a = tjVar;
    }
}
