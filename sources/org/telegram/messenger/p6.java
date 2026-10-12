package org.telegram.messenger;

import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;
public final class p6 implements Runnable {
    public final int f18535a = 0;
    public final boolean f18536b;
    public final int f18537c;
    public final long d;
    public final int f18538e;
    public final boolean f18539f;
    public final Object h;
    public final Serializable f18540n;
    public final Object f18541r;

    public p6(MediaController mediaController, File file, TLRPC.TL_document tL_document, int i10, boolean z10, int i11, boolean z11, long j3) {
        this.h = mediaController;
        this.f18540n = file;
        this.f18541r = tL_document;
        this.f18537c = i10;
        this.f18536b = z10;
        this.f18538e = i11;
        this.f18539f = z11;
        this.d = j3;
    }

    @Override
    public final void run() {
        switch (this.f18535a) {
            case 0:
                ((MediaController) this.h).lambda$stopRecordingInternal$41((File) this.f18540n, (TLRPC.TL_document) this.f18541r, this.f18537c, this.f18536b, this.f18538e, this.f18539f, this.d);
                return;
            default:
                int i10 = this.f18538e;
                boolean z10 = this.f18539f;
                ((MessagesStorage) this.h).lambda$updatePinnedMessages$138(this.f18536b, (HashMap) this.f18540n, this.f18537c, this.d, (ArrayList) this.f18541r, i10, z10);
                return;
        }
    }

    public p6(MessagesStorage messagesStorage, boolean z10, HashMap hashMap, int i10, long j3, ArrayList arrayList, int i11, boolean z11) {
        this.h = messagesStorage;
        this.f18536b = z10;
        this.f18540n = hashMap;
        this.f18537c = i10;
        this.d = j3;
        this.f18541r = arrayList;
        this.f18538e = i11;
        this.f18539f = z11;
    }
}
