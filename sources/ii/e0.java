package ii;

import android.content.DialogInterface;
import org.telegram.messenger.v10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.ActionBar.u1;
public final class e0 implements DialogInterface.OnCancelListener {
    public final int f15519a;
    public final int f15520b;
    public final int f15521c;
    public final Object d;

    public e0(int i7, int i10, Object obj, int i11) {
        this.f15519a = i11;
        this.f15520b = i7;
        this.f15521c = i10;
        this.d = obj;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f15519a) {
            case 0:
                ConnectionsManager.getInstance(this.f15520b).cancelRequest(this.f15521c, true);
                ((u1[]) this.d)[0] = null;
                return;
            default:
                ConnectionsManager.getInstance(this.f15520b).cancelRequest(this.f15521c, true);
                ((v10) this.d).a(null, "CANCELLED");
                return;
        }
    }
}
