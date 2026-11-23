package li;

import android.content.DialogInterface;
import org.telegram.messenger.p10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.ActionBar.t1;
public final class d0 implements DialogInterface.OnCancelListener {
    public final int f20012a;
    public final int f20013b;
    public final int f20014c;
    public final Object d;

    public d0(int i7, int i10, Object obj, int i11) {
        this.f20012a = i11;
        this.f20013b = i7;
        this.f20014c = i10;
        this.d = obj;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f20012a) {
            case 0:
                ConnectionsManager.getInstance(this.f20013b).cancelRequest(this.f20014c, true);
                ((t1[]) this.d)[0] = null;
                return;
            default:
                ConnectionsManager.getInstance(this.f20013b).cancelRequest(this.f20014c, true);
                ((p10) this.d).a(null, "CANCELLED");
                return;
        }
    }
}
