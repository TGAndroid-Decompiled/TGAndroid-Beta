package org.telegram.messenger;

import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;
public final class n6 implements Runnable {
    public final int f17881a = 0;
    public final boolean f17882b;
    public final int f17883c;
    public final long d;
    public final int e;
    public final boolean f17884f;
    public final Object h;
    public final Serializable f17885n;
    public final Object f17886r;

    public n6(MediaController mediaController, File file, TLRPC.TL_document tL_document, int i10, boolean z4, int i11, boolean z10, long j10) {
        this.h = mediaController;
        this.f17885n = file;
        this.f17886r = tL_document;
        this.f17883c = i10;
        this.f17882b = z4;
        this.e = i11;
        this.f17884f = z10;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f17881a) {
            case 0:
                ((MediaController) this.h).lambda$stopRecordingInternal$40((File) this.f17885n, (TLRPC.TL_document) this.f17886r, this.f17883c, this.f17882b, this.e, this.f17884f, this.d);
                return;
            default:
                int i10 = this.e;
                boolean z4 = this.f17884f;
                ((MessagesStorage) this.h).lambda$updatePinnedMessages$138(this.f17882b, (HashMap) this.f17885n, this.f17883c, this.d, (ArrayList) this.f17886r, i10, z4);
                return;
        }
    }

    public n6(MessagesStorage messagesStorage, boolean z4, HashMap hashMap, int i10, long j10, ArrayList arrayList, int i11, boolean z10) {
        this.h = messagesStorage;
        this.f17882b = z4;
        this.f17885n = hashMap;
        this.f17883c = i10;
        this.d = j10;
        this.f17886r = arrayList;
        this.e = i11;
        this.f17884f = z10;
    }
}
