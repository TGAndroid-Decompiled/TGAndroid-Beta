package org.telegram.messenger;

import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;
public final class k6 implements Runnable {
    public final int f16796a = 0;
    public final boolean f16797b;
    public final int f16798c;
    public final long d;
    public final int e;
    public final boolean f16799f;
    public final Object h;
    public final Serializable f16800n;
    public final Object f16801r;

    public k6(MediaController mediaController, File file, TLRPC.TL_document tL_document, int i10, boolean z10, int i11, boolean z11, long j3) {
        this.h = mediaController;
        this.f16800n = file;
        this.f16801r = tL_document;
        this.f16798c = i10;
        this.f16797b = z10;
        this.e = i11;
        this.f16799f = z11;
        this.d = j3;
    }

    @Override
    public final void run() {
        switch (this.f16796a) {
            case 0:
                ((MediaController) this.h).lambda$stopRecordingInternal$40((File) this.f16800n, (TLRPC.TL_document) this.f16801r, this.f16798c, this.f16797b, this.e, this.f16799f, this.d);
                return;
            default:
                int i10 = this.e;
                boolean z10 = this.f16799f;
                ((MessagesStorage) this.h).lambda$updatePinnedMessages$138(this.f16797b, (HashMap) this.f16800n, this.f16798c, this.d, (ArrayList) this.f16801r, i10, z10);
                return;
        }
    }

    public k6(MessagesStorage messagesStorage, boolean z10, HashMap hashMap, int i10, long j3, ArrayList arrayList, int i11, boolean z11) {
        this.h = messagesStorage;
        this.f16797b = z10;
        this.f16800n = hashMap;
        this.f16798c = i10;
        this.d = j3;
        this.f16801r = arrayList;
        this.e = i11;
        this.f16799f = z11;
    }
}
