package org.telegram.messenger;

import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;
public final class k6 implements Runnable {
    public final int f16800a = 0;
    public final boolean f16801b;
    public final int f16802c;
    public final long d;
    public final int e;
    public final boolean f16803f;
    public final Object h;
    public final Serializable f16804n;
    public final Object f16805r;

    public k6(MediaController mediaController, File file, TLRPC.TL_document tL_document, int i10, boolean z10, int i11, boolean z11, long j3) {
        this.h = mediaController;
        this.f16804n = file;
        this.f16805r = tL_document;
        this.f16802c = i10;
        this.f16801b = z10;
        this.e = i11;
        this.f16803f = z11;
        this.d = j3;
    }

    @Override
    public final void run() {
        switch (this.f16800a) {
            case 0:
                ((MediaController) this.h).lambda$stopRecordingInternal$40((File) this.f16804n, (TLRPC.TL_document) this.f16805r, this.f16802c, this.f16801b, this.e, this.f16803f, this.d);
                return;
            default:
                int i10 = this.e;
                boolean z10 = this.f16803f;
                ((MessagesStorage) this.h).lambda$updatePinnedMessages$138(this.f16801b, (HashMap) this.f16804n, this.f16802c, this.d, (ArrayList) this.f16805r, i10, z10);
                return;
        }
    }

    public k6(MessagesStorage messagesStorage, boolean z10, HashMap hashMap, int i10, long j3, ArrayList arrayList, int i11, boolean z11) {
        this.h = messagesStorage;
        this.f16801b = z10;
        this.f16804n = hashMap;
        this.f16802c = i10;
        this.d = j3;
        this.f16805r = arrayList;
        this.e = i11;
        this.f16803f = z11;
    }
}
