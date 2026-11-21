package li;

import android.content.DialogInterface;
import org.telegram.messenger.q10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.ActionBar.t1;
public final class e0 implements DialogInterface.OnCancelListener {
    public final int f19946a;
    public final int f19947b;
    public final int f19948c;
    public final Object d;

    public e0(int i7, int i10, Object obj, int i11) {
        this.f19946a = i11;
        this.f19947b = i7;
        this.f19948c = i10;
        this.d = obj;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f19946a) {
            case 0:
                ConnectionsManager.getInstance(this.f19947b).cancelRequest(this.f19948c, true);
                ((t1[]) this.d)[0] = null;
                return;
            default:
                ConnectionsManager.getInstance(this.f19947b).cancelRequest(this.f19948c, true);
                ((q10) this.d).a(null, "CANCELLED");
                return;
        }
    }
}
