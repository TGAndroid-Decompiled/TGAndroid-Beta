package defpackage;

import java.util.ArrayList;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLObject;
public final class ijc implements Runnable {
    public final byte a;
    public final TLObject b;
    public final ArrayList c;
    public final ArrayList d;
    public final Runnable e;

    public ijc(TLObject tLObject, ArrayList arrayList, ArrayList arrayList2, Runnable runnable, byte b) {
        this.a = b;
        this.b = tLObject;
        this.c = arrayList;
        this.d = arrayList2;
        this.e = runnable;
    }

    @Override
    public final void run() {
        switch (this.a) {
            case 0:
                VoIPService.lambda$startConferenceGroupCall$51(this.b, this.c, this.d, this.e);
                return;
            default:
                VoIPService.lambda$startConferenceGroupCall$43(this.b, this.c, this.d, this.e);
                return;
        }
    }
}
