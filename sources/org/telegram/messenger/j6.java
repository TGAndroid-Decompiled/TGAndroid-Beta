package org.telegram.messenger;

import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;
public final class j6 implements Runnable {
    public final int f18080a = 0;
    public final boolean f18081b;
    public final int f18082c;
    public final long d;
    public final int f18083e;
    public final boolean f18084f;
    public final Object h;
    public final Serializable f18085n;
    public final Object f18086r;

    public j6(MediaController mediaController, File file, TLRPC.TL_document tL_document, int i10, boolean z10, int i11, boolean z11, long j3) {
        this.h = mediaController;
        this.f18085n = file;
        this.f18086r = tL_document;
        this.f18082c = i10;
        this.f18081b = z10;
        this.f18083e = i11;
        this.f18084f = z11;
        this.d = j3;
    }

    @Override
    public final void run() {
        switch (this.f18080a) {
            case 0:
                ((MediaController) this.h).lambda$stopRecordingInternal$40((File) this.f18085n, (TLRPC.TL_document) this.f18086r, this.f18082c, this.f18081b, this.f18083e, this.f18084f, this.d);
                return;
            default:
                int i10 = this.f18083e;
                boolean z10 = this.f18084f;
                ((MessagesStorage) this.h).lambda$updatePinnedMessages$138(this.f18081b, (HashMap) this.f18085n, this.f18082c, this.d, (ArrayList) this.f18086r, i10, z10);
                return;
        }
    }

    public j6(MessagesStorage messagesStorage, boolean z10, HashMap hashMap, int i10, long j3, ArrayList arrayList, int i11, boolean z11) {
        this.h = messagesStorage;
        this.f18081b = z10;
        this.f18085n = hashMap;
        this.f18082c = i10;
        this.d = j3;
        this.f18086r = arrayList;
        this.f18083e = i11;
        this.f18084f = z11;
    }
}
