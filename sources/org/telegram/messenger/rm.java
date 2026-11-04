package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class rm implements Runnable {
    public final hp f25183a;
    public final TLRPC.TL_messages_dialogs f25184b;
    public final ArrayList f25185c;
    public final TLRPC.messages_Dialogs d;
    public final int f25186e;
    public final ArrayList f25187f;
    public final ArrayList h;
    public final ArrayList f25188n;
    public final Runnable f25189r;

    public rm(hp hpVar, TLRPC.TL_messages_dialogs tL_messages_dialogs, ArrayList arrayList, TLRPC.messages_Dialogs messages_dialogs, int i3, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, Runnable runnable) {
        this.f25183a = hpVar;
        this.f25184b = tL_messages_dialogs;
        this.f25185c = arrayList;
        this.d = messages_dialogs;
        this.f25186e = i3;
        this.f25187f = arrayList2;
        this.h = arrayList3;
        this.f25188n = arrayList4;
        this.f25189r = runnable;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.rm.run():void");
    }
}
