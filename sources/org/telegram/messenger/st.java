package org.telegram.messenger;

import android.content.DialogInterface;
import org.telegram.tgnet.ConnectionsManager;
public final class st implements DialogInterface.OnCancelListener {
    public final int f17954a;
    public final int f17955b;
    public final int f17956c;
    public final Object d;

    public st(int i10, int i11, Object obj, int i12) {
        this.f17954a = i12;
        this.f17955b = i10;
        this.f17956c = i11;
        this.d = obj;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f17954a) {
            case 0:
                ConnectionsManager.getInstance(this.f17955b).cancelRequest(this.f17956c, true);
                ((j20) this.d).a(null, "CANCELLED");
                return;
            default:
                ConnectionsManager.getInstance(this.f17955b).cancelRequest(this.f17956c, true);
                ((org.telegram.ui.ActionBar.x1[]) this.d)[0] = null;
                return;
        }
    }
}
