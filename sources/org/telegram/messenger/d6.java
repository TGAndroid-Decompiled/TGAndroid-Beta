package org.telegram.messenger;

import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;
public final class d6 implements Runnable {
    public final int f18168a = 0;
    public final boolean f18169b;
    public final int f18170c;
    public final long d;
    public final int e;
    public final boolean f18171f;
    public final Object h;
    public final Serializable f18172n;
    public final Object f18173r;

    public d6(MediaController mediaController, File file, TLRPC.TL_document tL_document, int i10, boolean z10, int i11, boolean z11, long j10) {
        this.h = mediaController;
        this.f18172n = file;
        this.f18173r = tL_document;
        this.f18170c = i10;
        this.f18169b = z10;
        this.e = i11;
        this.f18171f = z11;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f18168a) {
            case 0:
                ((MediaController) this.h).lambda$stopRecordingInternal$43((File) this.f18172n, (TLRPC.TL_document) this.f18173r, this.f18170c, this.f18169b, this.e, this.f18171f, this.d);
                return;
            default:
                int i10 = this.e;
                boolean z10 = this.f18171f;
                ((MessagesStorage) this.h).lambda$updatePinnedMessages$138(this.f18169b, (HashMap) this.f18172n, this.f18170c, this.d, (ArrayList) this.f18173r, i10, z10);
                return;
        }
    }

    public d6(MessagesStorage messagesStorage, boolean z10, HashMap hashMap, int i10, long j10, ArrayList arrayList, int i11, boolean z11) {
        this.h = messagesStorage;
        this.f18169b = z10;
        this.f18172n = hashMap;
        this.f18170c = i10;
        this.d = j10;
        this.f18173r = arrayList;
        this.e = i11;
        this.f18171f = z11;
    }
}
