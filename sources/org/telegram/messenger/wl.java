package org.telegram.messenger;

import android.content.DialogInterface;
public final class wl implements DialogInterface.OnCancelListener {
    public final int f26223a;
    public final c1 f26224b;
    public final int f26225c;

    public wl(c1 c1Var, int i3, int i10) {
        this.f26223a = i10;
        this.f26224b = c1Var;
        this.f26225c = i3;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f26223a) {
            case 0:
                ((hp) this.f26224b).getConnectionsManager().cancelRequest(this.f26225c, true);
                return;
            case 1:
                ((hp) this.f26224b).getConnectionsManager().cancelRequest(this.f26225c, true);
                return;
            default:
                ((vv) this.f26224b).getConnectionsManager().cancelRequest(this.f26225c, true);
                return;
        }
    }
}
