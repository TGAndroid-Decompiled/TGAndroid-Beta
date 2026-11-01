package org.telegram.messenger;

import android.content.DialogInterface;
import org.telegram.tgnet.ConnectionsManager;
public final class tt implements DialogInterface.OnCancelListener {
    public final int f18305a;
    public final int f18306b;
    public final int f18307c;
    public final Object d;

    public tt(int i10, int i11, Object obj, int i12) {
        this.f18305a = i12;
        this.f18306b = i10;
        this.f18307c = i11;
        this.d = obj;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f18305a) {
            case 0:
                ConnectionsManager.getInstance(this.f18306b).cancelRequest(this.f18307c, true);
                ((k20) this.d).a(null, "CANCELLED");
                return;
            default:
                ConnectionsManager.getInstance(this.f18306b).cancelRequest(this.f18307c, true);
                ((org.telegram.ui.ActionBar.x1[]) this.d)[0] = null;
                return;
        }
    }
}
