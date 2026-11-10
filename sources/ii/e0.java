package ii;

import android.content.DialogInterface;
import org.telegram.messenger.v10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.ActionBar.u1;
public final class e0 implements DialogInterface.OnCancelListener {
    public final int f15521a;
    public final int f15522b;
    public final int f15523c;
    public final Object d;

    public e0(int i7, int i10, Object obj, int i11) {
        this.f15521a = i11;
        this.f15522b = i7;
        this.f15523c = i10;
        this.d = obj;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f15521a) {
            case 0:
                ConnectionsManager.getInstance(this.f15522b).cancelRequest(this.f15523c, true);
                ((u1[]) this.d)[0] = null;
                return;
            default:
                ConnectionsManager.getInstance(this.f15522b).cancelRequest(this.f15523c, true);
                ((v10) this.d).a(null, "CANCELLED");
                return;
        }
    }
}
