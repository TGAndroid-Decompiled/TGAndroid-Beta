package ih;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.MessageObject;
import org.telegram.ui.uj;
public final class a {
    public RecyclerView f12325a;
    public int f12326b;
    public long f12327c;
    public int d;
    public boolean f12328e;

    public final boolean a(MessageObject messageObject) {
        if (messageObject != null) {
            if (messageObject.getId() != this.f12326b) {
                if (this.f12327c != 0 && messageObject.getGroupId() == this.f12327c) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    public final boolean b() {
        return this.f12328e;
    }

    public final boolean c(int i10, long j3) {
        if (this.f12326b == i10 && this.f12327c == j3) {
            return false;
        }
        this.f12326b = i10;
        this.f12327c = j3;
        if (i10 == 0) {
            this.f12328e = false;
            return true;
        }
        return true;
    }

    public final void d(int i10) {
        this.d = i10;
    }

    public final void e(uj ujVar) {
        this.f12325a = ujVar;
    }
}
