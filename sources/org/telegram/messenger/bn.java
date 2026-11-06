package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class bn implements Runnable {
    public final qp f21672a;
    public final TLRPC.TL_messages_dialogs f21673b;
    public final ArrayList f21674c;
    public final TLRPC.messages_Dialogs d;
    public final int f21675e;
    public final ArrayList f21676f;
    public final ArrayList h;
    public final ArrayList f21677n;
    public final Runnable f21678r;

    public bn(qp qpVar, TLRPC.TL_messages_dialogs tL_messages_dialogs, ArrayList arrayList, TLRPC.messages_Dialogs messages_dialogs, int i7, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, Runnable runnable) {
        this.f21672a = qpVar;
        this.f21673b = tL_messages_dialogs;
        this.f21674c = arrayList;
        this.d = messages_dialogs;
        this.f21675e = i7;
        this.f21676f = arrayList2;
        this.h = arrayList3;
        this.f21677n = arrayList4;
        this.f21678r = runnable;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.bn.run():void");
    }
}
