package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class xm implements Runnable {
    public final mp f27955a;
    public final TLRPC.TL_messages_dialogs f27956b;
    public final ArrayList f27957c;
    public final TLRPC.messages_Dialogs d;
    public final int f27958e;
    public final ArrayList f27959f;
    public final ArrayList h;
    public final ArrayList f27960n;
    public final Runnable f27961r;

    public xm(mp mpVar, TLRPC.TL_messages_dialogs tL_messages_dialogs, ArrayList arrayList, TLRPC.messages_Dialogs messages_dialogs, int i7, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, Runnable runnable) {
        this.f27955a = mpVar;
        this.f27956b = tL_messages_dialogs;
        this.f27957c = arrayList;
        this.d = messages_dialogs;
        this.f27958e = i7;
        this.f27959f = arrayList2;
        this.h = arrayList3;
        this.f27960n = arrayList4;
        this.f27961r = runnable;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.xm.run():void");
    }
}
