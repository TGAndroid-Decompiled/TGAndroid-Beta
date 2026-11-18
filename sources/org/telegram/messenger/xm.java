package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class xm implements Runnable {
    public final mp f27927a;
    public final TLRPC.TL_messages_dialogs f27928b;
    public final ArrayList f27929c;
    public final TLRPC.messages_Dialogs d;
    public final int f27930e;
    public final ArrayList f27931f;
    public final ArrayList h;
    public final ArrayList f27932n;
    public final Runnable f27933r;

    public xm(mp mpVar, TLRPC.TL_messages_dialogs tL_messages_dialogs, ArrayList arrayList, TLRPC.messages_Dialogs messages_dialogs, int i7, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, Runnable runnable) {
        this.f27927a = mpVar;
        this.f27928b = tL_messages_dialogs;
        this.f27929c = arrayList;
        this.d = messages_dialogs;
        this.f27930e = i7;
        this.f27931f = arrayList2;
        this.h = arrayList3;
        this.f27932n = arrayList4;
        this.f27933r = runnable;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.xm.run():void");
    }
}
