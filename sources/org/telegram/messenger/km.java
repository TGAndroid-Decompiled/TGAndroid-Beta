package org.telegram.messenger;

import android.content.DialogInterface;
public final class km implements DialogInterface.OnCancelListener {
    public final int f16757a;
    public final f1 f16758b;
    public final int f16759c;

    public km(f1 f1Var, int i10, int i11) {
        this.f16757a = i11;
        this.f16758b = f1Var;
        this.f16759c = i10;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f16757a) {
            case 0:
                ((wp) this.f16758b).getConnectionsManager().cancelRequest(this.f16759c, true);
                return;
            case 1:
                ((wp) this.f16758b).getConnectionsManager().cancelRequest(this.f16759c, true);
                return;
            default:
                ((pw) this.f16758b).getConnectionsManager().cancelRequest(this.f16759c, true);
                return;
        }
    }
}
