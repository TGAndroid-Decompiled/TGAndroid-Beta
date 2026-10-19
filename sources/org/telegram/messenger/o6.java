package org.telegram.messenger;

import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;
public final class o6 implements Runnable {
    public final int f19148a = 0;
    public final boolean f19149b;
    public final int f19150c;
    public final long d;
    public final int e;
    public final boolean f19151f;
    public final Object h;
    public final Serializable f19152n;
    public final Object f19153r;

    public o6(MediaController mediaController, File file, TLRPC.TL_document tL_document, int i10, boolean z10, int i11, boolean z11, long j10) {
        this.h = mediaController;
        this.f19152n = file;
        this.f19153r = tL_document;
        this.f19150c = i10;
        this.f19149b = z10;
        this.e = i11;
        this.f19151f = z11;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f19148a) {
            case 0:
                ((MediaController) this.h).lambda$stopRecordingInternal$41((File) this.f19152n, (TLRPC.TL_document) this.f19153r, this.f19150c, this.f19149b, this.e, this.f19151f, this.d);
                return;
            default:
                int i10 = this.e;
                boolean z10 = this.f19151f;
                ((MessagesStorage) this.h).lambda$updatePinnedMessages$138(this.f19149b, (HashMap) this.f19152n, this.f19150c, this.d, (ArrayList) this.f19153r, i10, z10);
                return;
        }
    }

    public o6(MessagesStorage messagesStorage, boolean z10, HashMap hashMap, int i10, long j10, ArrayList arrayList, int i11, boolean z11) {
        this.h = messagesStorage;
        this.f19149b = z10;
        this.f19152n = hashMap;
        this.f19150c = i10;
        this.d = j10;
        this.f19153r = arrayList;
        this.e = i11;
        this.f19151f = z11;
    }
}
