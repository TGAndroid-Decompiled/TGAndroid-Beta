package defpackage;

import android.view.View;
import org.telegram.messenger.voip.VoIPService;
public final class qfc implements View.OnClickListener {
    public final byte a;
    public final hgc b;
    public final VoIPService c;

    public qfc(hgc hgcVar, VoIPService voIPService, byte b) {
        this.a = b;
        this.b = hgcVar;
        this.c = voIPService;
    }

    @Override
    public final void onClick(View view) {
        byte b = this.a;
        VoIPService voIPService = this.c;
        hgc hgcVar = this.b;
        switch (b) {
            case 0:
                gl.c3(new sfc(hgcVar, (byte) 8));
                int i = hgcVar.M;
                if (i > 0) {
                    voIPService.sendCallRating(i);
                    return;
                }
                return;
            default:
                gl.c3(new sfc(hgcVar, (byte) 10));
                int i2 = hgcVar.M;
                if (i2 > 0) {
                    voIPService.sendCallRating(i2);
                    return;
                }
                return;
        }
    }
}
