package ih;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.MessageObject;
import org.telegram.ui.nj;
public final class a {
    public RecyclerView f13142a;
    public int f13143b;
    public long f13144c;
    public int d;
    public boolean e;

    public final boolean a(MessageObject messageObject) {
        if (messageObject != null) {
            if (messageObject.getId() != this.f13143b) {
                if (this.f13144c != 0 && messageObject.getGroupId() == this.f13144c) {
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
        if (this.f13143b == i10 && this.f13144c == j10) {
            return false;
        }
        this.f13143b = i10;
        this.f13144c = j10;
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
        this.f13142a = njVar;
    }
}
