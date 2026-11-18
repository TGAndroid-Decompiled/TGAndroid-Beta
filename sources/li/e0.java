package li;

import android.content.DialogInterface;
import org.telegram.messenger.q10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.ActionBar.u1;
public final class e0 implements DialogInterface.OnCancelListener {
    public final int f19921a;
    public final int f19922b;
    public final int f19923c;
    public final Object d;

    public e0(int i7, int i10, Object obj, int i11) {
        this.f19921a = i11;
        this.f19922b = i7;
        this.f19923c = i10;
        this.d = obj;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f19921a) {
            case 0:
                ConnectionsManager.getInstance(this.f19922b).cancelRequest(this.f19923c, true);
                ((u1[]) this.d)[0] = null;
                return;
            default:
                ConnectionsManager.getInstance(this.f19922b).cancelRequest(this.f19923c, true);
                ((q10) this.d).a(null, "CANCELLED");
                return;
        }
    }
}
