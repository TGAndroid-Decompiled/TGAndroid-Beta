package org.telegram.messenger;

import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;
public final class p6 implements Runnable {
    public final int f19228a = 0;
    public final boolean f19229b;
    public final int f19230c;
    public final long d;
    public final int e;
    public final boolean f19231f;
    public final Object h;
    public final Serializable f19232n;
    public final Object f19233r;

    public p6(MediaController mediaController, File file, TLRPC.TL_document tL_document, int i10, boolean z10, int i11, boolean z11, long j10) {
        this.h = mediaController;
        this.f19232n = file;
        this.f19233r = tL_document;
        this.f19230c = i10;
        this.f19229b = z10;
        this.e = i11;
        this.f19231f = z11;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f19228a) {
            case 0:
                ((MediaController) this.h).lambda$stopRecordingInternal$41((File) this.f19232n, (TLRPC.TL_document) this.f19233r, this.f19230c, this.f19229b, this.e, this.f19231f, this.d);
                return;
            default:
                int i10 = this.e;
                boolean z10 = this.f19231f;
                ((MessagesStorage) this.h).lambda$updatePinnedMessages$138(this.f19229b, (HashMap) this.f19232n, this.f19230c, this.d, (ArrayList) this.f19233r, i10, z10);
                return;
        }
    }

    public p6(MessagesStorage messagesStorage, boolean z10, HashMap hashMap, int i10, long j10, ArrayList arrayList, int i11, boolean z11) {
        this.h = messagesStorage;
        this.f19229b = z10;
        this.f19232n = hashMap;
        this.f19230c = i10;
        this.d = j10;
        this.f19233r = arrayList;
        this.e = i11;
        this.f19231f = z11;
    }
}
