package org.telegram.messenger.voip;

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
public final class q implements Runnable {
    public final int f26161a;
    public final TLObject f26162b;
    public final ArrayList f26163c;
    public final ArrayList d;
    public final Runnable f26164e;

    public q(TLObject tLObject, ArrayList arrayList, ArrayList arrayList2, Runnable runnable, int i7) {
        this.f26161a = i7;
        this.f26162b = tLObject;
        this.f26163c = arrayList;
        this.d = arrayList2;
        this.f26164e = runnable;
    }

    @Override
    public final void run() {
        switch (this.f26161a) {
            case 0:
                VoIPService.lambda$startConferenceGroupCall$48(this.f26162b, this.f26163c, this.d, this.f26164e);
                return;
            default:
                VoIPService.lambda$startConferenceGroupCall$40(this.f26162b, this.f26163c, this.d, this.f26164e);
                return;
        }
    }
}
