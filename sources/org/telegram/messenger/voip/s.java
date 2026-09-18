package org.telegram.messenger.voip;

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
public final class s implements Runnable {
    public final int f17713a;
    public final TLObject f17714b;
    public final ArrayList f17715c;
    public final ArrayList d;
    public final Runnable e;

    public s(TLObject tLObject, ArrayList arrayList, ArrayList arrayList2, Runnable runnable, int i10) {
        this.f17713a = i10;
        this.f17714b = tLObject;
        this.f17715c = arrayList;
        this.d = arrayList2;
        this.e = runnable;
    }

    @Override
    public final void run() {
        switch (this.f17713a) {
            case 0:
                VoIPService.lambda$startConferenceGroupCall$48(this.f17714b, this.f17715c, this.d, this.e);
                return;
            default:
                VoIPService.lambda$startConferenceGroupCall$40(this.f17714b, this.f17715c, this.d, this.e);
                return;
        }
    }
}
