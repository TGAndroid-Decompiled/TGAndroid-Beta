package ji;

import android.content.DialogInterface;
import org.telegram.messenger.n10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.ActionBar.s1;
public final class c0 implements DialogInterface.OnCancelListener {
    public final int f16283a;
    public final int f16284b;
    public final int f16285c;
    public final Object d;

    public c0(int i3, int i10, Object obj, int i11) {
        this.f16283a = i11;
        this.f16284b = i3;
        this.f16285c = i10;
        this.d = obj;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f16283a) {
            case 0:
                ConnectionsManager.getInstance(this.f16284b).cancelRequest(this.f16285c, true);
                ((s1[]) this.d)[0] = null;
                return;
            default:
                ConnectionsManager.getInstance(this.f16284b).cancelRequest(this.f16285c, true);
                ((n10) this.d).a(null, "CANCELLED");
                return;
        }
    }
}
