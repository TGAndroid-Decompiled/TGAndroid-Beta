package org.telegram.messenger;

import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;
public final class p6 implements Runnable {
    public final int f18536a = 0;
    public final boolean f18537b;
    public final int f18538c;
    public final long d;
    public final int f18539e;
    public final boolean f18540f;
    public final Object h;
    public final Serializable f18541n;
    public final Object f18542r;

    public p6(MediaController mediaController, File file, TLRPC.TL_document tL_document, int i10, boolean z10, int i11, boolean z11, long j3) {
        this.h = mediaController;
        this.f18541n = file;
        this.f18542r = tL_document;
        this.f18538c = i10;
        this.f18537b = z10;
        this.f18539e = i11;
        this.f18540f = z11;
        this.d = j3;
    }

    @Override
    public final void run() {
        switch (this.f18536a) {
            case 0:
                ((MediaController) this.h).lambda$stopRecordingInternal$41((File) this.f18541n, (TLRPC.TL_document) this.f18542r, this.f18538c, this.f18537b, this.f18539e, this.f18540f, this.d);
                return;
            default:
                int i10 = this.f18539e;
                boolean z10 = this.f18540f;
                ((MessagesStorage) this.h).lambda$updatePinnedMessages$138(this.f18537b, (HashMap) this.f18541n, this.f18538c, this.d, (ArrayList) this.f18542r, i10, z10);
                return;
        }
    }

    public p6(MessagesStorage messagesStorage, boolean z10, HashMap hashMap, int i10, long j3, ArrayList arrayList, int i11, boolean z11) {
        this.h = messagesStorage;
        this.f18537b = z10;
        this.f18541n = hashMap;
        this.f18538c = i10;
        this.d = j3;
        this.f18542r = arrayList;
        this.f18539e = i11;
        this.f18540f = z11;
    }
}
