package org.telegram.messenger;

import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;
public final class k6 implements Runnable {
    public final int f16781a = 0;
    public final boolean f16782b;
    public final int f16783c;
    public final long d;
    public final int e;
    public final boolean f16784f;
    public final Object h;
    public final Serializable f16785n;
    public final Object f16786r;

    public k6(MediaController mediaController, File file, TLRPC.TL_document tL_document, int i10, boolean z10, int i11, boolean z11, long j3) {
        this.h = mediaController;
        this.f16785n = file;
        this.f16786r = tL_document;
        this.f16783c = i10;
        this.f16782b = z10;
        this.e = i11;
        this.f16784f = z11;
        this.d = j3;
    }

    @Override
    public final void run() {
        switch (this.f16781a) {
            case 0:
                ((MediaController) this.h).lambda$stopRecordingInternal$40((File) this.f16785n, (TLRPC.TL_document) this.f16786r, this.f16783c, this.f16782b, this.e, this.f16784f, this.d);
                return;
            default:
                int i10 = this.e;
                boolean z10 = this.f16784f;
                ((MessagesStorage) this.h).lambda$updatePinnedMessages$138(this.f16782b, (HashMap) this.f16785n, this.f16783c, this.d, (ArrayList) this.f16786r, i10, z10);
                return;
        }
    }

    public k6(MessagesStorage messagesStorage, boolean z10, HashMap hashMap, int i10, long j3, ArrayList arrayList, int i11, boolean z11) {
        this.h = messagesStorage;
        this.f16782b = z10;
        this.f16785n = hashMap;
        this.f16783c = i10;
        this.d = j3;
        this.f16786r = arrayList;
        this.e = i11;
        this.f16784f = z11;
    }
}
