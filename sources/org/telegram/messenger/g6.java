package org.telegram.messenger;

import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;
public final class g6 implements Runnable {
    public final int f20141a = 0;
    public final boolean f20142b;
    public final int f20143c;
    public final long d;
    public final int e;
    public final boolean f20144f;
    public final Object h;
    public final Serializable f20145n;
    public final Object f20146r;

    public g6(MediaController mediaController, File file, TLRPC.TL_document tL_document, int i10, boolean z10, int i11, boolean z11, long j10) {
        this.h = mediaController;
        this.f20145n = file;
        this.f20146r = tL_document;
        this.f20143c = i10;
        this.f20142b = z10;
        this.e = i11;
        this.f20144f = z11;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f20141a) {
            case 0:
                ((MediaController) this.h).lambda$stopRecordingInternal$43((File) this.f20145n, (TLRPC.TL_document) this.f20146r, this.f20143c, this.f20142b, this.e, this.f20144f, this.d);
                return;
            default:
                int i10 = this.e;
                boolean z10 = this.f20144f;
                ((MessagesStorage) this.h).lambda$updatePinnedMessages$142(this.f20142b, (HashMap) this.f20145n, this.f20143c, this.d, (ArrayList) this.f20146r, i10, z10);
                return;
        }
    }

    public g6(MessagesStorage messagesStorage, boolean z10, HashMap hashMap, int i10, long j10, ArrayList arrayList, int i11, boolean z11) {
        this.h = messagesStorage;
        this.f20142b = z10;
        this.f20145n = hashMap;
        this.f20143c = i10;
        this.d = j10;
        this.f20146r = arrayList;
        this.e = i11;
        this.f20144f = z11;
    }
}
