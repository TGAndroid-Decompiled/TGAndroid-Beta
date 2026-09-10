package org.telegram.messenger;

import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;
public final class q6 implements Runnable {
    public final int f16112a = 0;
    public final boolean f16113b;
    public final int f16114c;
    public final long d;
    public final int e;
    public final boolean f16115f;
    public final Object h;
    public final Serializable f16116n;
    public final Object f16117r;

    public q6(MediaController mediaController, File file, TLRPC.TL_document tL_document, int i10, boolean z10, int i11, boolean z11, long j3) {
        this.h = mediaController;
        this.f16116n = file;
        this.f16117r = tL_document;
        this.f16114c = i10;
        this.f16113b = z10;
        this.e = i11;
        this.f16115f = z11;
        this.d = j3;
    }

    @Override
    public final void run() {
        switch (this.f16112a) {
            case 0:
                ((MediaController) this.h).lambda$stopRecordingInternal$40((File) this.f16116n, (TLRPC.TL_document) this.f16117r, this.f16114c, this.f16113b, this.e, this.f16115f, this.d);
                return;
            default:
                int i10 = this.e;
                boolean z10 = this.f16115f;
                ((MessagesStorage) this.h).lambda$updatePinnedMessages$138(this.f16113b, (HashMap) this.f16116n, this.f16114c, this.d, (ArrayList) this.f16117r, i10, z10);
                return;
        }
    }

    public q6(MessagesStorage messagesStorage, boolean z10, HashMap hashMap, int i10, long j3, ArrayList arrayList, int i11, boolean z11) {
        this.h = messagesStorage;
        this.f16113b = z10;
        this.f16116n = hashMap;
        this.f16114c = i10;
        this.d = j3;
        this.f16117r = arrayList;
        this.e = i11;
        this.f16115f = z11;
    }
}
