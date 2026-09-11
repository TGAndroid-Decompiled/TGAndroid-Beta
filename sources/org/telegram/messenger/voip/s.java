package org.telegram.messenger.voip;

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
public final class s implements Runnable {
    public final int f19428a;
    public final TLObject f19429b;
    public final ArrayList f19430c;
    public final ArrayList d;
    public final Runnable f19431e;

    public s(TLObject tLObject, ArrayList arrayList, ArrayList arrayList2, Runnable runnable, int i10) {
        this.f19428a = i10;
        this.f19429b = tLObject;
        this.f19430c = arrayList;
        this.d = arrayList2;
        this.f19431e = runnable;
    }

    @Override
    public final void run() {
        switch (this.f19428a) {
            case 0:
                VoIPService.lambda$startConferenceGroupCall$48(this.f19429b, this.f19430c, this.d, this.f19431e);
                return;
            default:
                VoIPService.lambda$startConferenceGroupCall$40(this.f19429b, this.f19430c, this.d, this.f19431e);
                return;
        }
    }
}
