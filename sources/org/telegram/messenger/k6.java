package org.telegram.messenger;

import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;
public final class k6 implements Runnable {
    public final int f16554a = 0;
    public final boolean f16555b;
    public final int f16556c;
    public final long d;
    public final int e;
    public final boolean f16557f;
    public final Object h;
    public final Serializable f16558n;
    public final Object f16559r;

    public k6(MediaController mediaController, File file, TLRPC.TL_document tL_document, int i10, boolean z10, int i11, boolean z11, long j3) {
        this.h = mediaController;
        this.f16558n = file;
        this.f16559r = tL_document;
        this.f16556c = i10;
        this.f16555b = z10;
        this.e = i11;
        this.f16557f = z11;
        this.d = j3;
    }

    @Override
    public final void run() {
        switch (this.f16554a) {
            case 0:
                ((MediaController) this.h).lambda$stopRecordingInternal$40((File) this.f16558n, (TLRPC.TL_document) this.f16559r, this.f16556c, this.f16555b, this.e, this.f16557f, this.d);
                return;
            default:
                int i10 = this.e;
                boolean z10 = this.f16557f;
                ((MessagesStorage) this.h).lambda$updatePinnedMessages$138(this.f16555b, (HashMap) this.f16558n, this.f16556c, this.d, (ArrayList) this.f16559r, i10, z10);
                return;
        }
    }

    public k6(MessagesStorage messagesStorage, boolean z10, HashMap hashMap, int i10, long j3, ArrayList arrayList, int i11, boolean z11) {
        this.h = messagesStorage;
        this.f16555b = z10;
        this.f16558n = hashMap;
        this.f16556c = i10;
        this.d = j3;
        this.f16559r = arrayList;
        this.e = i11;
        this.f16557f = z11;
    }
}
