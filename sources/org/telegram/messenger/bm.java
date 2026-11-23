package org.telegram.messenger;

import android.content.DialogInterface;
public final class bm implements DialogInterface.OnCancelListener {
    public final int f23099a;
    public final c1 f23100b;
    public final int f23101c;

    public bm(c1 c1Var, int i7, int i10) {
        this.f23099a = i10;
        this.f23100b = c1Var;
        this.f23101c = i7;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f23099a) {
            case 0:
                ((np) this.f23100b).getConnectionsManager().cancelRequest(this.f23101c, true);
                return;
            case 1:
                ((np) this.f23100b).getConnectionsManager().cancelRequest(this.f23101c, true);
                return;
            default:
                ((yv) this.f23100b).getConnectionsManager().cancelRequest(this.f23101c, true);
                return;
        }
    }
}
