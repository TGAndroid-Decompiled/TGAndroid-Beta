package org.telegram.messenger;

import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;
public final class k6 implements Runnable {
    public final int f18328a = 0;
    public final boolean f18329b;
    public final int f18330c;
    public final long d;
    public final int f18331e;
    public final boolean f18332f;
    public final Object h;
    public final Serializable f18333n;
    public final Object f18334r;

    public k6(MediaController mediaController, File file, TLRPC.TL_document tL_document, int i10, boolean z10, int i11, boolean z11, long j3) {
        this.h = mediaController;
        this.f18333n = file;
        this.f18334r = tL_document;
        this.f18330c = i10;
        this.f18329b = z10;
        this.f18331e = i11;
        this.f18332f = z11;
        this.d = j3;
    }

    @Override
    public final void run() {
        switch (this.f18328a) {
            case 0:
                ((MediaController) this.h).lambda$stopRecordingInternal$40((File) this.f18333n, (TLRPC.TL_document) this.f18334r, this.f18330c, this.f18329b, this.f18331e, this.f18332f, this.d);
                return;
            default:
                int i10 = this.f18331e;
                boolean z10 = this.f18332f;
                ((MessagesStorage) this.h).lambda$updatePinnedMessages$138(this.f18329b, (HashMap) this.f18333n, this.f18330c, this.d, (ArrayList) this.f18334r, i10, z10);
                return;
        }
    }

    public k6(MessagesStorage messagesStorage, boolean z10, HashMap hashMap, int i10, long j3, ArrayList arrayList, int i11, boolean z11) {
        this.h = messagesStorage;
        this.f18329b = z10;
        this.f18333n = hashMap;
        this.f18330c = i10;
        this.d = j3;
        this.f18334r = arrayList;
        this.f18331e = i11;
        this.f18332f = z11;
    }
}
