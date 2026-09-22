package hh;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.MessageObject;
import org.telegram.ui.uj;
public final class a {
    public RecyclerView f10498a;
    public int f10499b;
    public long f10500c;
    public int d;
    public boolean e;

    public final boolean a(MessageObject messageObject) {
        if (messageObject != null) {
            if (messageObject.getId() != this.f10499b) {
                if (this.f10500c != 0 && messageObject.getGroupId() == this.f10500c) {
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
        if (this.f10499b == i10 && this.f10500c == j3) {
            return false;
        }
        this.f10499b = i10;
        this.f10500c = j3;
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
        this.f10498a = ujVar;
    }
}
