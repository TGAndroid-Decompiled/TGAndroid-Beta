package org.telegram.messenger.voip;

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
public final class q implements Runnable {
    public final int f26165a;
    public final TLObject f26166b;
    public final ArrayList f26167c;
    public final ArrayList d;
    public final Runnable f26168e;

    public q(TLObject tLObject, ArrayList arrayList, ArrayList arrayList2, Runnable runnable, int i7) {
        this.f26165a = i7;
        this.f26166b = tLObject;
        this.f26167c = arrayList;
        this.d = arrayList2;
        this.f26168e = runnable;
    }

    @Override
    public final void run() {
        switch (this.f26165a) {
            case 0:
                VoIPService.lambda$startConferenceGroupCall$48(this.f26166b, this.f26167c, this.d, this.f26168e);
                return;
            default:
                VoIPService.lambda$startConferenceGroupCall$40(this.f26166b, this.f26167c, this.d, this.f26168e);
                return;
        }
    }
}
