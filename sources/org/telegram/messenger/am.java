package org.telegram.messenger;

import android.content.DialogInterface;
public final class am implements DialogInterface.OnCancelListener {
    public final int f23031a;
    public final c1 f23032b;
    public final int f23033c;

    public am(c1 c1Var, int i7, int i10) {
        this.f23031a = i10;
        this.f23032b = c1Var;
        this.f23033c = i7;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f23031a) {
            case 0:
                ((mp) this.f23032b).getConnectionsManager().cancelRequest(this.f23033c, true);
                return;
            case 1:
                ((mp) this.f23032b).getConnectionsManager().cancelRequest(this.f23033c, true);
                return;
            default:
                ((xv) this.f23032b).getConnectionsManager().cancelRequest(this.f23033c, true);
                return;
        }
    }
}
