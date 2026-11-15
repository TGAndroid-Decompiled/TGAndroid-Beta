package org.telegram.messenger;

import android.content.DialogInterface;
public final class dm implements DialogInterface.OnCancelListener {
    public final int f23107a;
    public final c1 f23108b;
    public final int f23109c;

    public dm(c1 c1Var, int i7, int i10) {
        this.f23107a = i10;
        this.f23108b = c1Var;
        this.f23109c = i7;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f23107a) {
            case 0:
                ((np) this.f23108b).getConnectionsManager().cancelRequest(this.f23109c, true);
                return;
            case 1:
                ((np) this.f23108b).getConnectionsManager().cancelRequest(this.f23109c, true);
                return;
            default:
                ((bw) this.f23108b).getConnectionsManager().cancelRequest(this.f23109c, true);
                return;
        }
    }
}
