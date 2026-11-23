package li;

import android.content.DialogInterface;
import org.telegram.messenger.r10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.ActionBar.t1;
public final class e0 implements DialogInterface.OnCancelListener {
    public final int f19915a;
    public final int f19916b;
    public final int f19917c;
    public final Object d;

    public e0(int i7, int i10, Object obj, int i11) {
        this.f19915a = i11;
        this.f19916b = i7;
        this.f19917c = i10;
        this.d = obj;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f19915a) {
            case 0:
                ConnectionsManager.getInstance(this.f19916b).cancelRequest(this.f19917c, true);
                ((t1[]) this.d)[0] = null;
                return;
            default:
                ConnectionsManager.getInstance(this.f19916b).cancelRequest(this.f19917c, true);
                ((r10) this.d).a(null, "CANCELLED");
                return;
        }
    }
}
