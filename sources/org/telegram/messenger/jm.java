package org.telegram.messenger;

import android.content.DialogInterface;
public final class jm implements DialogInterface.OnCancelListener {
    public final int f16404a;
    public final f1 f16405b;
    public final int f16406c;

    public jm(f1 f1Var, int i10, int i11) {
        this.f16404a = i11;
        this.f16405b = f1Var;
        this.f16406c = i10;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f16404a) {
            case 0:
                ((vp) this.f16405b).getConnectionsManager().cancelRequest(this.f16406c, true);
                return;
            case 1:
                ((vp) this.f16405b).getConnectionsManager().cancelRequest(this.f16406c, true);
                return;
            default:
                ((ow) this.f16405b).getConnectionsManager().cancelRequest(this.f16406c, true);
                return;
        }
    }
}
