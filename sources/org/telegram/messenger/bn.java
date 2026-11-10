package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class bn implements Runnable {
    public final qp f21712a;
    public final TLRPC.TL_messages_dialogs f21713b;
    public final ArrayList f21714c;
    public final TLRPC.messages_Dialogs d;
    public final int f21715e;
    public final ArrayList f21716f;
    public final ArrayList h;
    public final ArrayList f21717n;
    public final Runnable f21718r;

    public bn(qp qpVar, TLRPC.TL_messages_dialogs tL_messages_dialogs, ArrayList arrayList, TLRPC.messages_Dialogs messages_dialogs, int i7, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, Runnable runnable) {
        this.f21712a = qpVar;
        this.f21713b = tL_messages_dialogs;
        this.f21714c = arrayList;
        this.d = messages_dialogs;
        this.f21715e = i7;
        this.f21716f = arrayList2;
        this.h = arrayList3;
        this.f21717n = arrayList4;
        this.f21718r = runnable;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.bn.run():void");
    }
}
