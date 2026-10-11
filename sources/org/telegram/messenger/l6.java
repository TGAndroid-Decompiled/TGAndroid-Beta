package org.telegram.messenger;

import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;
public final class l6 implements Runnable {
    public final int f18407a = 0;
    public final boolean f18408b;
    public final int f18409c;
    public final long d;
    public final int f18410e;
    public final boolean f18411f;
    public final Object h;
    public final Serializable f18412n;
    public final Object f18413r;

    public l6(MediaController mediaController, File file, TLRPC.TL_document tL_document, int i10, boolean z10, int i11, boolean z11, long j3) {
        this.h = mediaController;
        this.f18412n = file;
        this.f18413r = tL_document;
        this.f18409c = i10;
        this.f18408b = z10;
        this.f18410e = i11;
        this.f18411f = z11;
        this.d = j3;
    }

    @Override
    public final void run() {
        switch (this.f18407a) {
            case 0:
                ((MediaController) this.h).lambda$stopRecordingInternal$40((File) this.f18412n, (TLRPC.TL_document) this.f18413r, this.f18409c, this.f18408b, this.f18410e, this.f18411f, this.d);
                return;
            default:
                int i10 = this.f18410e;
                boolean z10 = this.f18411f;
                ((MessagesStorage) this.h).lambda$updatePinnedMessages$138(this.f18408b, (HashMap) this.f18412n, this.f18409c, this.d, (ArrayList) this.f18413r, i10, z10);
                return;
        }
    }

    public l6(MessagesStorage messagesStorage, boolean z10, HashMap hashMap, int i10, long j3, ArrayList arrayList, int i11, boolean z11) {
        this.h = messagesStorage;
        this.f18408b = z10;
        this.f18412n = hashMap;
        this.f18409c = i10;
        this.d = j3;
        this.f18413r = arrayList;
        this.f18410e = i11;
        this.f18411f = z11;
    }
}
