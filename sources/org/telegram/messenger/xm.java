package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class xm implements Runnable {
    public final mp f28043a;
    public final TLRPC.TL_messages_dialogs f28044b;
    public final ArrayList f28045c;
    public final TLRPC.messages_Dialogs d;
    public final int f28046e;
    public final ArrayList f28047f;
    public final ArrayList h;
    public final ArrayList f28048n;
    public final Runnable f28049r;

    public xm(mp mpVar, TLRPC.TL_messages_dialogs tL_messages_dialogs, ArrayList arrayList, TLRPC.messages_Dialogs messages_dialogs, int i7, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, Runnable runnable) {
        this.f28043a = mpVar;
        this.f28044b = tL_messages_dialogs;
        this.f28045c = arrayList;
        this.d = messages_dialogs;
        this.f28046e = i7;
        this.f28047f = arrayList2;
        this.h = arrayList3;
        this.f28048n = arrayList4;
        this.f28049r = runnable;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.xm.run():void");
    }
}
