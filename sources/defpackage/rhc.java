package defpackage;

import android.view.View;
import org.telegram.messenger.voip.VoIPService;
public final class rhc implements View.OnClickListener {
    public final byte a;
    public final iic b;
    public final VoIPService c;

    public rhc(iic iicVar, VoIPService voIPService, byte b) {
        this.a = b;
        this.b = iicVar;
        this.c = voIPService;
    }

    @Override
    public final void onClick(View view) {
        byte b = this.a;
        VoIPService voIPService = this.c;
        iic iicVar = this.b;
        switch (b) {
            case 0:
                gm.c3(new thc(iicVar, (byte) 8));
                int i = iicVar.M;
                if (i > 0) {
                    voIPService.sendCallRating(i);
                    return;
                }
                return;
            default:
                gm.c3(new thc(iicVar, (byte) 10));
                int i2 = iicVar.M;
                if (i2 > 0) {
                    voIPService.sendCallRating(i2);
                    return;
                }
                return;
        }
    }
}
