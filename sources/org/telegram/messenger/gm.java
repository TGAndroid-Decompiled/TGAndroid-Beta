package org.telegram.messenger;

import android.content.DialogInterface;
public final class gm implements DialogInterface.OnCancelListener {
    public final int f22697a;
    public final c1 f22698b;
    public final int f22699c;

    public gm(c1 c1Var, int i7, int i10) {
        this.f22697a = i10;
        this.f22698b = c1Var;
        this.f22699c = i7;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f22697a) {
            case 0:
                ((qp) this.f22698b).getConnectionsManager().cancelRequest(this.f22699c, true);
                return;
            case 1:
                ((qp) this.f22698b).getConnectionsManager().cancelRequest(this.f22699c, true);
                return;
            default:
                ((dw) this.f22698b).getConnectionsManager().cancelRequest(this.f22699c, true);
                return;
        }
    }
}
