package org.telegram.messenger;

import android.content.DialogInterface;
public final class bm implements DialogInterface.OnCancelListener {
    public final int f23135a;
    public final c1 f23136b;
    public final int f23137c;

    public bm(c1 c1Var, int i7, int i10) {
        this.f23135a = i10;
        this.f23136b = c1Var;
        this.f23137c = i7;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f23135a) {
            case 0:
                ((np) this.f23136b).getConnectionsManager().cancelRequest(this.f23137c, true);
                return;
            case 1:
                ((np) this.f23136b).getConnectionsManager().cancelRequest(this.f23137c, true);
                return;
            default:
                ((yv) this.f23136b).getConnectionsManager().cancelRequest(this.f23137c, true);
                return;
        }
    }
}
