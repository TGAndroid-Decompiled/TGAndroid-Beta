package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class xm implements Runnable {
    public final mp f27929a;
    public final TLRPC.TL_messages_dialogs f27930b;
    public final ArrayList f27931c;
    public final TLRPC.messages_Dialogs d;
    public final int f27932e;
    public final ArrayList f27933f;
    public final ArrayList h;
    public final ArrayList f27934n;
    public final Runnable f27935r;

    public xm(mp mpVar, TLRPC.TL_messages_dialogs tL_messages_dialogs, ArrayList arrayList, TLRPC.messages_Dialogs messages_dialogs, int i7, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, Runnable runnable) {
        this.f27929a = mpVar;
        this.f27930b = tL_messages_dialogs;
        this.f27931c = arrayList;
        this.d = messages_dialogs;
        this.f27932e = i7;
        this.f27933f = arrayList2;
        this.h = arrayList3;
        this.f27934n = arrayList4;
        this.f27935r = runnable;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.xm.run():void");
    }
}
