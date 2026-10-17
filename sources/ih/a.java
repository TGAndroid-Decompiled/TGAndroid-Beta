package ih;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.MessageObject;
import org.telegram.ui.pj;
public final class a {
    public RecyclerView f13098a;
    public int f13099b;
    public long f13100c;
    public int d;
    public boolean e;

    public final boolean a(MessageObject messageObject) {
        if (messageObject != null) {
            if (messageObject.getId() != this.f13099b) {
                if (this.f13100c != 0 && messageObject.getGroupId() == this.f13100c) {
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
        if (this.f13099b == i10 && this.f13100c == j10) {
            return false;
        }
        this.f13099b = i10;
        this.f13100c = j10;
        if (i10 == 0) {
            this.e = false;
            return true;
        }
        return true;
    }

    public final void d(int i10) {
        this.d = i10;
    }

    public final void e(pj pjVar) {
        this.f13098a = pjVar;
    }
}
