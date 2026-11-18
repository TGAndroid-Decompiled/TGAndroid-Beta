package org.telegram.messenger;

import android.content.DialogInterface;
public final class am implements DialogInterface.OnCancelListener {
    public final int f22920a;
    public final c1 f22921b;
    public final int f22922c;

    public am(c1 c1Var, int i7, int i10) {
        this.f22920a = i10;
        this.f22921b = c1Var;
        this.f22922c = i7;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f22920a) {
            case 0:
                ((mp) this.f22921b).getConnectionsManager().cancelRequest(this.f22922c, true);
                return;
            case 1:
                ((mp) this.f22921b).getConnectionsManager().cancelRequest(this.f22922c, true);
                return;
            default:
                ((xv) this.f22921b).getConnectionsManager().cancelRequest(this.f22922c, true);
                return;
        }
    }
}
