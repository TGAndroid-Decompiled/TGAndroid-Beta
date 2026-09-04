package ih;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.MessageObject;
import org.telegram.ui.uj;
public final class a {
    public RecyclerView f12299a;
    public int f12300b;
    public long f12301c;
    public int d;
    public boolean f12302e;

    public final boolean a(MessageObject messageObject) {
        if (messageObject != null) {
            if (messageObject.getId() != this.f12300b) {
                if (this.f12301c != 0 && messageObject.getGroupId() == this.f12301c) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    public final boolean b() {
        return this.f12302e;
    }

    public final boolean c(int i10, long j3) {
        if (this.f12300b == i10 && this.f12301c == j3) {
            return false;
        }
        this.f12300b = i10;
        this.f12301c = j3;
        if (i10 == 0) {
            this.f12302e = false;
            return true;
        }
        return true;
    }

    public final void d(int i10) {
        this.d = i10;
    }

    public final void e(uj ujVar) {
        this.f12299a = ujVar;
    }
}
