package org.telegram.messenger;

import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;
public final class k6 implements Runnable {
    public final int f18152a = 0;
    public final boolean f18153b;
    public final int f18154c;
    public final long d;
    public final int f18155e;
    public final boolean f18156f;
    public final Object h;
    public final Serializable f18157n;
    public final Object f18158r;

    public k6(MediaController mediaController, File file, TLRPC.TL_document tL_document, int i10, boolean z10, int i11, boolean z11, long j3) {
        this.h = mediaController;
        this.f18157n = file;
        this.f18158r = tL_document;
        this.f18154c = i10;
        this.f18153b = z10;
        this.f18155e = i11;
        this.f18156f = z11;
        this.d = j3;
    }

    @Override
    public final void run() {
        switch (this.f18152a) {
            case 0:
                ((MediaController) this.h).lambda$stopRecordingInternal$40((File) this.f18157n, (TLRPC.TL_document) this.f18158r, this.f18154c, this.f18153b, this.f18155e, this.f18156f, this.d);
                return;
            default:
                int i10 = this.f18155e;
                boolean z10 = this.f18156f;
                ((MessagesStorage) this.h).lambda$updatePinnedMessages$138(this.f18153b, (HashMap) this.f18157n, this.f18154c, this.d, (ArrayList) this.f18158r, i10, z10);
                return;
        }
    }

    public k6(MessagesStorage messagesStorage, boolean z10, HashMap hashMap, int i10, long j3, ArrayList arrayList, int i11, boolean z11) {
        this.h = messagesStorage;
        this.f18153b = z10;
        this.f18157n = hashMap;
        this.f18154c = i10;
        this.d = j3;
        this.f18158r = arrayList;
        this.f18155e = i11;
        this.f18156f = z11;
    }
}
