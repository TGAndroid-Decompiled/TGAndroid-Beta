package org.telegram.messenger;

import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;
public final class p6 implements Runnable {
    public final int f18072a = 0;
    public final boolean f18073b;
    public final int f18074c;
    public final long d;
    public final int e;
    public final boolean f18075f;
    public final Object h;
    public final Serializable f18076n;
    public final Object f18077r;

    public p6(MediaController mediaController, File file, TLRPC.TL_document tL_document, int i10, boolean z10, int i11, boolean z11, long j10) {
        this.h = mediaController;
        this.f18076n = file;
        this.f18077r = tL_document;
        this.f18074c = i10;
        this.f18073b = z10;
        this.e = i11;
        this.f18075f = z11;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f18072a) {
            case 0:
                ((MediaController) this.h).lambda$stopRecordingInternal$41((File) this.f18076n, (TLRPC.TL_document) this.f18077r, this.f18074c, this.f18073b, this.e, this.f18075f, this.d);
                return;
            default:
                int i10 = this.e;
                boolean z10 = this.f18075f;
                ((MessagesStorage) this.h).lambda$updatePinnedMessages$138(this.f18073b, (HashMap) this.f18076n, this.f18074c, this.d, (ArrayList) this.f18077r, i10, z10);
                return;
        }
    }

    public p6(MessagesStorage messagesStorage, boolean z10, HashMap hashMap, int i10, long j10, ArrayList arrayList, int i11, boolean z11) {
        this.h = messagesStorage;
        this.f18073b = z10;
        this.f18076n = hashMap;
        this.f18074c = i10;
        this.d = j10;
        this.f18077r = arrayList;
        this.e = i11;
        this.f18075f = z11;
    }
}
