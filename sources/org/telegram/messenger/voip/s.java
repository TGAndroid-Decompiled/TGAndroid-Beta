package org.telegram.messenger.voip;

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
public final class s implements Runnable {
    public final int f17947a;
    public final TLObject f17948b;
    public final ArrayList f17949c;
    public final ArrayList d;
    public final Runnable e;

    public s(TLObject tLObject, ArrayList arrayList, ArrayList arrayList2, Runnable runnable, int i10) {
        this.f17947a = i10;
        this.f17948b = tLObject;
        this.f17949c = arrayList;
        this.d = arrayList2;
        this.e = runnable;
    }

    @Override
    public final void run() {
        switch (this.f17947a) {
            case 0:
                VoIPService.lambda$startConferenceGroupCall$48(this.f17948b, this.f17949c, this.d, this.e);
                return;
            default:
                VoIPService.lambda$startConferenceGroupCall$40(this.f17948b, this.f17949c, this.d, this.e);
                return;
        }
    }
}
