package defpackage;

import android.view.View;
import org.telegram.messenger.voip.VoIPService;
public final class vjc implements View.OnClickListener {
    public final byte a;
    public final mkc b;
    public final VoIPService c;

    public vjc(mkc mkcVar, VoIPService voIPService, byte b) {
        this.a = b;
        this.b = mkcVar;
        this.c = voIPService;
    }

    @Override
    public final void onClick(View view) {
        byte b = this.a;
        VoIPService voIPService = this.c;
        mkc mkcVar = this.b;
        switch (b) {
            case 0:
                hl.c3(new xjc(mkcVar, (byte) 8));
                int i = mkcVar.M;
                if (i > 0) {
                    voIPService.sendCallRating(i);
                    return;
                }
                return;
            default:
                hl.c3(new xjc(mkcVar, (byte) 10));
                int i2 = mkcVar.M;
                if (i2 > 0) {
                    voIPService.sendCallRating(i2);
                    return;
                }
                return;
        }
    }
}
