package org.telegram.messenger;

import android.content.DialogInterface;
public final class gm implements DialogInterface.OnCancelListener {
    public final int f22664a;
    public final c1 f22665b;
    public final int f22666c;

    public gm(c1 c1Var, int i7, int i10) {
        this.f22664a = i10;
        this.f22665b = c1Var;
        this.f22666c = i7;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f22664a) {
            case 0:
                ((qp) this.f22665b).getConnectionsManager().cancelRequest(this.f22666c, true);
                return;
            case 1:
                ((qp) this.f22665b).getConnectionsManager().cancelRequest(this.f22666c, true);
                return;
            default:
                ((dw) this.f22665b).getConnectionsManager().cancelRequest(this.f22666c, true);
                return;
        }
    }
}
