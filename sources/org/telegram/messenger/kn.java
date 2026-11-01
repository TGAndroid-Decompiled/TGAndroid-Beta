package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class kn implements Runnable {
    public final wp f16760a;
    public final TLRPC.TL_messages_dialogs f16761b;
    public final ArrayList f16762c;
    public final TLRPC.messages_Dialogs d;
    public final int e;
    public final ArrayList f16763f;
    public final ArrayList h;
    public final ArrayList f16764n;
    public final Runnable f16765r;

    public kn(wp wpVar, TLRPC.TL_messages_dialogs tL_messages_dialogs, ArrayList arrayList, TLRPC.messages_Dialogs messages_dialogs, int i10, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, Runnable runnable) {
        this.f16760a = wpVar;
        this.f16761b = tL_messages_dialogs;
        this.f16762c = arrayList;
        this.d = messages_dialogs;
        this.e = i10;
        this.f16763f = arrayList2;
        this.h = arrayList3;
        this.f16764n = arrayList4;
        this.f16765r = runnable;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.kn.run():void");
    }
}
