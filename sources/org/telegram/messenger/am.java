package org.telegram.messenger;

import android.content.DialogInterface;
public final class am implements DialogInterface.OnCancelListener {
    public final int f22948a;
    public final c1 f22949b;
    public final int f22950c;

    public am(c1 c1Var, int i7, int i10) {
        this.f22948a = i10;
        this.f22949b = c1Var;
        this.f22950c = i7;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f22948a) {
            case 0:
                ((mp) this.f22949b).getConnectionsManager().cancelRequest(this.f22950c, true);
                return;
            case 1:
                ((mp) this.f22949b).getConnectionsManager().cancelRequest(this.f22950c, true);
                return;
            default:
                ((xv) this.f22949b).getConnectionsManager().cancelRequest(this.f22950c, true);
                return;
        }
    }
}
