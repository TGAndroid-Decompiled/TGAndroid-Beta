package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class jn implements Runnable {
    public final vp f16407a;
    public final TLRPC.TL_messages_dialogs f16408b;
    public final ArrayList f16409c;
    public final TLRPC.messages_Dialogs d;
    public final int e;
    public final ArrayList f16410f;
    public final ArrayList h;
    public final ArrayList f16411n;
    public final Runnable f16412r;

    public jn(vp vpVar, TLRPC.TL_messages_dialogs tL_messages_dialogs, ArrayList arrayList, TLRPC.messages_Dialogs messages_dialogs, int i10, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, Runnable runnable) {
        this.f16407a = vpVar;
        this.f16408b = tL_messages_dialogs;
        this.f16409c = arrayList;
        this.d = messages_dialogs;
        this.e = i10;
        this.f16410f = arrayList2;
        this.h = arrayList3;
        this.f16411n = arrayList4;
        this.f16412r = runnable;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.jn.run():void");
    }
}
