package org.telegram.messenger;

import android.content.DialogInterface;
public final class gm implements DialogInterface.OnCancelListener {
    public final int f22693a;
    public final c1 f22694b;
    public final int f22695c;

    public gm(c1 c1Var, int i7, int i10) {
        this.f22693a = i10;
        this.f22694b = c1Var;
        this.f22695c = i7;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f22693a) {
            case 0:
                ((qp) this.f22694b).getConnectionsManager().cancelRequest(this.f22695c, true);
                return;
            case 1:
                ((qp) this.f22694b).getConnectionsManager().cancelRequest(this.f22695c, true);
                return;
            default:
                ((dw) this.f22694b).getConnectionsManager().cancelRequest(this.f22695c, true);
                return;
        }
    }
}
