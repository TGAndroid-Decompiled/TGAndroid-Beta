package org.telegram.messenger.voip;

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
public final class r implements Runnable {
    public final int f27175a;
    public final TLObject f27176b;
    public final ArrayList f27177c;
    public final ArrayList d;
    public final Runnable f27178e;

    public r(TLObject tLObject, ArrayList arrayList, ArrayList arrayList2, Runnable runnable, int i7) {
        this.f27175a = i7;
        this.f27176b = tLObject;
        this.f27177c = arrayList;
        this.d = arrayList2;
        this.f27178e = runnable;
    }

    @Override
    public final void run() {
        switch (this.f27175a) {
            case 0:
                VoIPService.lambda$startConferenceGroupCall$48(this.f27176b, this.f27177c, this.d, this.f27178e);
                return;
            default:
                VoIPService.lambda$startConferenceGroupCall$40(this.f27176b, this.f27177c, this.d, this.f27178e);
                return;
        }
    }
}
