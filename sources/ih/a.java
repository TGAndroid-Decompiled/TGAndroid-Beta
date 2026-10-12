package ih;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.MessageObject;
import org.telegram.ui.ak;
public final class a {
    public RecyclerView f11712a;
    public int f11713b;
    public long f11714c;
    public int d;
    public boolean e;

    public final boolean a(MessageObject messageObject) {
        if (messageObject != null) {
            if (messageObject.getId() != this.f11713b) {
                if (this.f11714c != 0 && messageObject.getGroupId() == this.f11714c) {
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
        if (this.f11713b == i10 && this.f11714c == j10) {
            return false;
        }
        this.f11713b = i10;
        this.f11714c = j10;
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
        this.f11712a = akVar;
    }
}
