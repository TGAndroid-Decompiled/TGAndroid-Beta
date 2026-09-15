package org.telegram.messenger.voip;

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
public final class s implements Runnable {
    public final int f17704a;
    public final TLObject f17705b;
    public final ArrayList f17706c;
    public final ArrayList d;
    public final Runnable e;

    public s(TLObject tLObject, ArrayList arrayList, ArrayList arrayList2, Runnable runnable, int i10) {
        this.f17704a = i10;
        this.f17705b = tLObject;
        this.f17706c = arrayList;
        this.d = arrayList2;
        this.e = runnable;
    }

    @Override
    public final void run() {
        switch (this.f17704a) {
            case 0:
                VoIPService.lambda$startConferenceGroupCall$48(this.f17705b, this.f17706c, this.d, this.e);
                return;
            default:
                VoIPService.lambda$startConferenceGroupCall$40(this.f17705b, this.f17706c, this.d, this.e);
                return;
        }
    }
}
