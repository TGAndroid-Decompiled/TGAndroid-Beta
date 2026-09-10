package gh;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.MessageObject;
import org.telegram.ui.wj;
public final class a {
    public RecyclerView f9106a;
    public int f9107b;
    public long f9108c;
    public int d;
    public boolean e;

    public final boolean a(MessageObject messageObject) {
        if (messageObject != null) {
            if (messageObject.getId() != this.f9107b) {
                if (this.f9108c != 0 && messageObject.getGroupId() == this.f9108c) {
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
        if (this.f9107b == i10 && this.f9108c == j3) {
            return false;
        }
        this.f9107b = i10;
        this.f9108c = j3;
        if (i10 == 0) {
            this.e = false;
            return true;
        }
        return true;
    }

    public final void d(int i10) {
        this.d = i10;
    }

    public final void e(wj wjVar) {
        this.f9106a = wjVar;
    }
}
