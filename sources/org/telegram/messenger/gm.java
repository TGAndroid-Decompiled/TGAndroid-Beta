package org.telegram.messenger;

import android.content.DialogInterface;
public final class gm implements DialogInterface.OnCancelListener {
    public final int f22671a;
    public final c1 f22672b;
    public final int f22673c;

    public gm(c1 c1Var, int i7, int i10) {
        this.f22671a = i10;
        this.f22672b = c1Var;
        this.f22673c = i7;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f22671a) {
            case 0:
                ((qp) this.f22672b).getConnectionsManager().cancelRequest(this.f22673c, true);
                return;
            case 1:
                ((qp) this.f22672b).getConnectionsManager().cancelRequest(this.f22673c, true);
                return;
            default:
                ((dw) this.f22672b).getConnectionsManager().cancelRequest(this.f22673c, true);
                return;
        }
    }
}
