package org.telegram.messenger;

import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;
public final class k6 implements Runnable {
    public final int f18332a = 0;
    public final boolean f18333b;
    public final int f18334c;
    public final long d;
    public final int f18335e;
    public final boolean f18336f;
    public final Object h;
    public final Serializable f18337n;
    public final Object f18338r;

    public k6(MediaController mediaController, File file, TLRPC.TL_document tL_document, int i10, boolean z10, int i11, boolean z11, long j3) {
        this.h = mediaController;
        this.f18337n = file;
        this.f18338r = tL_document;
        this.f18334c = i10;
        this.f18333b = z10;
        this.f18335e = i11;
        this.f18336f = z11;
        this.d = j3;
    }

    @Override
    public final void run() {
        switch (this.f18332a) {
            case 0:
                ((MediaController) this.h).lambda$stopRecordingInternal$40((File) this.f18337n, (TLRPC.TL_document) this.f18338r, this.f18334c, this.f18333b, this.f18335e, this.f18336f, this.d);
                return;
            default:
                int i10 = this.f18335e;
                boolean z10 = this.f18336f;
                ((MessagesStorage) this.h).lambda$updatePinnedMessages$138(this.f18333b, (HashMap) this.f18337n, this.f18334c, this.d, (ArrayList) this.f18338r, i10, z10);
                return;
        }
    }

    public k6(MessagesStorage messagesStorage, boolean z10, HashMap hashMap, int i10, long j3, ArrayList arrayList, int i11, boolean z11) {
        this.h = messagesStorage;
        this.f18333b = z10;
        this.f18337n = hashMap;
        this.f18334c = i10;
        this.d = j3;
        this.f18338r = arrayList;
        this.f18335e = i11;
        this.f18336f = z11;
    }
}
