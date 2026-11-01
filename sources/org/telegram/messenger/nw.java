package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class nw implements Runnable {
    public final int f17347a;
    public final pw f17348b;
    public final ArrayList f17349c;

    public nw(pw pwVar, ArrayList arrayList, int i10) {
        this.f17347a = i10;
        this.f17348b = pwVar;
        this.f17349c = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f17347a) {
            case 0:
                pw pwVar = this.f17348b;
                pwVar.getClass();
                int i10 = 0;
                while (true) {
                    ArrayList arrayList = this.f17349c;
                    if (i10 < arrayList.size()) {
                        kj kjVar = new kj(pwVar.currentAccount, (TLRPC.Message) arrayList.get(i10), false, true);
                        kjVar.A0 = true;
                        pwVar.getSendMessagesHelper().k0(0L, kjVar, true);
                        i10++;
                    } else {
                        return;
                    }
                }
            default:
                pw pwVar2 = this.f17348b;
                pwVar2.getClass();
                int i11 = 0;
                while (true) {
                    ArrayList arrayList2 = this.f17349c;
                    if (i11 < arrayList2.size()) {
                        kj kjVar2 = (kj) pwVar2.getMessagesController().S.f(((Long) arrayList2.get(i11)).longValue());
                        if (kjVar2 != null) {
                            kjVar2.Z = true;
                        }
                        i11++;
                    } else {
                        return;
                    }
                }
        }
    }
}
