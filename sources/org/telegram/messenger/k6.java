package org.telegram.messenger;

import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;
public final class k6 implements Runnable {
    public final int f16791a = 0;
    public final boolean f16792b;
    public final int f16793c;
    public final long d;
    public final int e;
    public final boolean f16794f;
    public final Object h;
    public final Serializable f16795n;
    public final Object f16796r;

    public k6(MediaController mediaController, File file, TLRPC.TL_document tL_document, int i10, boolean z10, int i11, boolean z11, long j3) {
        this.h = mediaController;
        this.f16795n = file;
        this.f16796r = tL_document;
        this.f16793c = i10;
        this.f16792b = z10;
        this.e = i11;
        this.f16794f = z11;
        this.d = j3;
    }

    @Override
    public final void run() {
        switch (this.f16791a) {
            case 0:
                ((MediaController) this.h).lambda$stopRecordingInternal$40((File) this.f16795n, (TLRPC.TL_document) this.f16796r, this.f16793c, this.f16792b, this.e, this.f16794f, this.d);
                return;
            default:
                int i10 = this.e;
                boolean z10 = this.f16794f;
                ((MessagesStorage) this.h).lambda$updatePinnedMessages$138(this.f16792b, (HashMap) this.f16795n, this.f16793c, this.d, (ArrayList) this.f16796r, i10, z10);
                return;
        }
    }

    public k6(MessagesStorage messagesStorage, boolean z10, HashMap hashMap, int i10, long j3, ArrayList arrayList, int i11, boolean z11) {
        this.h = messagesStorage;
        this.f16792b = z10;
        this.f16795n = hashMap;
        this.f16793c = i10;
        this.d = j3;
        this.f16796r = arrayList;
        this.e = i11;
        this.f16794f = z11;
    }
}
