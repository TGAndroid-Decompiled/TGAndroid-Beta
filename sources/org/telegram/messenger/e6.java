package org.telegram.messenger;

import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;
public final class e6 implements Runnable {
    public final int f18305a = 0;
    public final boolean f18306b;
    public final int f18307c;
    public final long d;
    public final int e;
    public final boolean f18308f;
    public final Object h;
    public final Serializable f18309n;
    public final Object f18310r;

    public e6(MediaController mediaController, File file, TLRPC.TL_document tL_document, int i10, boolean z10, int i11, boolean z11, long j10) {
        this.h = mediaController;
        this.f18309n = file;
        this.f18310r = tL_document;
        this.f18307c = i10;
        this.f18306b = z10;
        this.e = i11;
        this.f18308f = z11;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f18305a) {
            case 0:
                ((MediaController) this.h).lambda$stopRecordingInternal$43((File) this.f18309n, (TLRPC.TL_document) this.f18310r, this.f18307c, this.f18306b, this.e, this.f18308f, this.d);
                return;
            default:
                int i10 = this.e;
                boolean z10 = this.f18308f;
                ((MessagesStorage) this.h).lambda$updatePinnedMessages$138(this.f18306b, (HashMap) this.f18309n, this.f18307c, this.d, (ArrayList) this.f18310r, i10, z10);
                return;
        }
    }

    public e6(MessagesStorage messagesStorage, boolean z10, HashMap hashMap, int i10, long j10, ArrayList arrayList, int i11, boolean z11) {
        this.h = messagesStorage;
        this.f18306b = z10;
        this.f18309n = hashMap;
        this.f18307c = i10;
        this.d = j10;
        this.f18310r = arrayList;
        this.e = i11;
        this.f18308f = z11;
    }
}
