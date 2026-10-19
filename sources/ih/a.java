package ih;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.MessageObject;
import org.telegram.ui.nj;
public final class a {
    public RecyclerView f13103a;
    public int f13104b;
    public long f13105c;
    public int d;
    public boolean e;

    public final boolean a(MessageObject messageObject) {
        if (messageObject != null) {
            if (messageObject.getId() != this.f13104b) {
                if (this.f13105c != 0 && messageObject.getGroupId() == this.f13105c) {
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
        if (this.f13104b == i10 && this.f13105c == j10) {
            return false;
        }
        this.f13104b = i10;
        this.f13105c = j10;
        if (i10 == 0) {
            this.e = false;
            return true;
        }
        return true;
    }

    public final void d(int i10) {
        this.d = i10;
    }

    public final void e(nj njVar) {
        this.f13103a = njVar;
    }
}
