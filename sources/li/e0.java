package li;

import android.content.DialogInterface;
import org.telegram.messenger.s10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.ActionBar.t1;
public final class e0 implements DialogInterface.OnCancelListener {
    public final int f19560a;
    public final int f19561b;
    public final int f19562c;
    public final Object d;

    public e0(int i7, int i10, Object obj, int i11) {
        this.f19560a = i11;
        this.f19561b = i7;
        this.f19562c = i10;
        this.d = obj;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f19560a) {
            case 0:
                ConnectionsManager.getInstance(this.f19561b).cancelRequest(this.f19562c, true);
                ((t1[]) this.d)[0] = null;
                return;
            default:
                ConnectionsManager.getInstance(this.f19561b).cancelRequest(this.f19562c, true);
                ((s10) this.d).a(null, "CANCELLED");
                return;
        }
    }
}
