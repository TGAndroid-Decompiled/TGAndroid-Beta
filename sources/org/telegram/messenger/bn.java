package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class bn implements Runnable {
    public final qp f21671a;
    public final TLRPC.TL_messages_dialogs f21672b;
    public final ArrayList f21673c;
    public final TLRPC.messages_Dialogs d;
    public final int f21674e;
    public final ArrayList f21675f;
    public final ArrayList h;
    public final ArrayList f21676n;
    public final Runnable f21677r;

    public bn(qp qpVar, TLRPC.TL_messages_dialogs tL_messages_dialogs, ArrayList arrayList, TLRPC.messages_Dialogs messages_dialogs, int i7, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, Runnable runnable) {
        this.f21671a = qpVar;
        this.f21672b = tL_messages_dialogs;
        this.f21673c = arrayList;
        this.d = messages_dialogs;
        this.f21674e = i7;
        this.f21675f = arrayList2;
        this.h = arrayList3;
        this.f21676n = arrayList4;
        this.f21677r = runnable;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.bn.run():void");
    }
}
