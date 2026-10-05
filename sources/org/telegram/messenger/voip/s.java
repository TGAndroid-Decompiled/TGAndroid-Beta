package org.telegram.messenger.voip;

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
public final class s implements Runnable {
    public final int f19608a;
    public final TLObject f19609b;
    public final ArrayList f19610c;
    public final ArrayList d;
    public final Runnable f19611e;

    public s(TLObject tLObject, ArrayList arrayList, ArrayList arrayList2, Runnable runnable, int i10) {
        this.f19608a = i10;
        this.f19609b = tLObject;
        this.f19610c = arrayList;
        this.d = arrayList2;
        this.f19611e = runnable;
    }

    @Override
    public final void run() {
        switch (this.f19608a) {
            case 0:
                VoIPService.lambda$startConferenceGroupCall$48(this.f19609b, this.f19610c, this.d, this.f19611e);
                return;
            default:
                VoIPService.lambda$startConferenceGroupCall$40(this.f19609b, this.f19610c, this.d, this.f19611e);
                return;
        }
    }
}
