package org.telegram.messenger;

import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;
public final class k6 implements Runnable {
    public final int f16816a = 0;
    public final boolean f16817b;
    public final int f16818c;
    public final long d;
    public final int e;
    public final boolean f16819f;
    public final Object h;
    public final Serializable f16820n;
    public final Object f16821r;

    public k6(MediaController mediaController, File file, TLRPC.TL_document tL_document, int i10, boolean z10, int i11, boolean z11, long j3) {
        this.h = mediaController;
        this.f16820n = file;
        this.f16821r = tL_document;
        this.f16818c = i10;
        this.f16817b = z10;
        this.e = i11;
        this.f16819f = z11;
        this.d = j3;
    }

    @Override
    public final void run() {
        switch (this.f16816a) {
            case 0:
                ((MediaController) this.h).lambda$stopRecordingInternal$40((File) this.f16820n, (TLRPC.TL_document) this.f16821r, this.f16818c, this.f16817b, this.e, this.f16819f, this.d);
                return;
            default:
                int i10 = this.e;
                boolean z10 = this.f16819f;
                ((MessagesStorage) this.h).lambda$updatePinnedMessages$138(this.f16817b, (HashMap) this.f16820n, this.f16818c, this.d, (ArrayList) this.f16821r, i10, z10);
                return;
        }
    }

    public k6(MessagesStorage messagesStorage, boolean z10, HashMap hashMap, int i10, long j3, ArrayList arrayList, int i11, boolean z11) {
        this.h = messagesStorage;
        this.f16817b = z10;
        this.f16820n = hashMap;
        this.f16818c = i10;
        this.d = j3;
        this.f16821r = arrayList;
        this.e = i11;
        this.f16819f = z11;
    }
}
