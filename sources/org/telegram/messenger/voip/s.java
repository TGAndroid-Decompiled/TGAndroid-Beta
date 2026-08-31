package org.telegram.messenger.voip;

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
public final class s implements Runnable {
    public final int f20465a;
    public final TLObject f20466b;
    public final ArrayList f20467c;
    public final ArrayList d;
    public final Runnable f20468e;

    public s(TLObject tLObject, ArrayList arrayList, ArrayList arrayList2, Runnable runnable, int i10) {
        this.f20465a = i10;
        this.f20466b = tLObject;
        this.f20467c = arrayList;
        this.d = arrayList2;
        this.f20468e = runnable;
    }

    @Override
    public final void run() {
        switch (this.f20465a) {
            case 0:
                VoIPService.lambda$startConferenceGroupCall$48(this.f20466b, this.f20467c, this.d, this.f20468e);
                return;
            default:
                VoIPService.lambda$startConferenceGroupCall$40(this.f20466b, this.f20467c, this.d, this.f20468e);
                return;
        }
    }
}
