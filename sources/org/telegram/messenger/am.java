package org.telegram.messenger;

import android.content.DialogInterface;
public final class am implements DialogInterface.OnCancelListener {
    public final int f22923a;
    public final c1 f22924b;
    public final int f22925c;

    public am(c1 c1Var, int i7, int i10) {
        this.f22923a = i10;
        this.f22924b = c1Var;
        this.f22925c = i7;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f22923a) {
            case 0:
                ((mp) this.f22924b).getConnectionsManager().cancelRequest(this.f22925c, true);
                return;
            case 1:
                ((mp) this.f22924b).getConnectionsManager().cancelRequest(this.f22925c, true);
                return;
            default:
                ((xv) this.f22924b).getConnectionsManager().cancelRequest(this.f22925c, true);
                return;
        }
    }
}
