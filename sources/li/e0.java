package li;

import android.content.DialogInterface;
import org.telegram.messenger.q10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.ActionBar.u1;
public final class e0 implements DialogInterface.OnCancelListener {
    public final int f19918a;
    public final int f19919b;
    public final int f19920c;
    public final Object d;

    public e0(int i7, int i10, Object obj, int i11) {
        this.f19918a = i11;
        this.f19919b = i7;
        this.f19920c = i10;
        this.d = obj;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f19918a) {
            case 0:
                ConnectionsManager.getInstance(this.f19919b).cancelRequest(this.f19920c, true);
                ((u1[]) this.d)[0] = null;
                return;
            default:
                ConnectionsManager.getInstance(this.f19919b).cancelRequest(this.f19920c, true);
                ((q10) this.d).a(null, "CANCELLED");
                return;
        }
    }
}
