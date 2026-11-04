package org.telegram.messenger.voip;

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
public final class p implements Runnable {
    public final int f26041a;
    public final TLObject f26042b;
    public final ArrayList f26043c;
    public final ArrayList d;
    public final Runnable f26044e;

    public p(TLObject tLObject, ArrayList arrayList, ArrayList arrayList2, Runnable runnable, int i3) {
        this.f26041a = i3;
        this.f26042b = tLObject;
        this.f26043c = arrayList;
        this.d = arrayList2;
        this.f26044e = runnable;
    }

    @Override
    public final void run() {
        switch (this.f26041a) {
            case 0:
                VoIPService.lambda$startConferenceGroupCall$48(this.f26042b, this.f26043c, this.d, this.f26044e);
                return;
            default:
                VoIPService.lambda$startConferenceGroupCall$40(this.f26042b, this.f26043c, this.d, this.f26044e);
                return;
        }
    }
}
