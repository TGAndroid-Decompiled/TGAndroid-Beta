package ih;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.MessageObject;
import org.telegram.ui.ak;
public final class a {
    public RecyclerView f11716a;
    public int f11717b;
    public long f11718c;
    public int d;
    public boolean e;

    public final boolean a(MessageObject messageObject) {
        if (messageObject != null) {
            if (messageObject.getId() != this.f11717b) {
                if (this.f11718c != 0 && messageObject.getGroupId() == this.f11718c) {
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

    public final boolean c(int i10, long j10) {
        if (this.f11717b == i10 && this.f11718c == j10) {
            return false;
        }
        this.f11717b = i10;
        this.f11718c = j10;
        if (i10 == 0) {
            this.e = false;
            return true;
        }
        return true;
    }

    public final void d(int i10) {
        this.d = i10;
    }

    public final void e(ak akVar) {
        this.f11716a = akVar;
    }
}
