package org.telegram.messenger;

import android.content.DialogInterface;
public final class dm implements DialogInterface.OnCancelListener {
    public final int f23115a;
    public final c1 f23116b;
    public final int f23117c;

    public dm(c1 c1Var, int i7, int i10) {
        this.f23115a = i10;
        this.f23116b = c1Var;
        this.f23117c = i7;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f23115a) {
            case 0:
                ((np) this.f23116b).getConnectionsManager().cancelRequest(this.f23117c, true);
                return;
            case 1:
                ((np) this.f23116b).getConnectionsManager().cancelRequest(this.f23117c, true);
                return;
            default:
                ((bw) this.f23116b).getConnectionsManager().cancelRequest(this.f23117c, true);
                return;
        }
    }
}
