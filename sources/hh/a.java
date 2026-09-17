package hh;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.MessageObject;
import org.telegram.ui.vj;
public final class a {
    public RecyclerView f10497a;
    public int f10498b;
    public long f10499c;
    public int d;
    public boolean e;

    public final boolean a(MessageObject messageObject) {
        if (messageObject != null) {
            if (messageObject.getId() != this.f10498b) {
                if (this.f10499c != 0 && messageObject.getGroupId() == this.f10499c) {
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
        if (this.f10498b == i10 && this.f10499c == j3) {
            return false;
        }
        this.f10498b = i10;
        this.f10499c = j3;
        if (i10 == 0) {
            this.e = false;
            return true;
        }
        return true;
    }

    public final void d(int i10) {
        this.d = i10;
    }

    public final void e(vj vjVar) {
        this.f10497a = vjVar;
    }
}
