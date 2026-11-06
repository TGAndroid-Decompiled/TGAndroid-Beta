package org.telegram.messenger.voip;

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
public final class q implements Runnable {
    public final int f26155a;
    public final TLObject f26156b;
    public final ArrayList f26157c;
    public final ArrayList d;
    public final Runnable f26158e;

    public q(TLObject tLObject, ArrayList arrayList, ArrayList arrayList2, Runnable runnable, int i7) {
        this.f26155a = i7;
        this.f26156b = tLObject;
        this.f26157c = arrayList;
        this.d = arrayList2;
        this.f26158e = runnable;
    }

    @Override
    public final void run() {
        switch (this.f26155a) {
            case 0:
                VoIPService.lambda$startConferenceGroupCall$48(this.f26156b, this.f26157c, this.d, this.f26158e);
                return;
            default:
                VoIPService.lambda$startConferenceGroupCall$40(this.f26156b, this.f26157c, this.d, this.f26158e);
                return;
        }
    }
}
