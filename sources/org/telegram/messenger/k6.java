package org.telegram.messenger;

import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;
public final class k6 implements Runnable {
    public final int f16799a = 0;
    public final boolean f16800b;
    public final int f16801c;
    public final long d;
    public final int e;
    public final boolean f16802f;
    public final Object h;
    public final Serializable f16803n;
    public final Object f16804r;

    public k6(MediaController mediaController, File file, TLRPC.TL_document tL_document, int i10, boolean z10, int i11, boolean z11, long j3) {
        this.h = mediaController;
        this.f16803n = file;
        this.f16804r = tL_document;
        this.f16801c = i10;
        this.f16800b = z10;
        this.e = i11;
        this.f16802f = z11;
        this.d = j3;
    }

    @Override
    public final void run() {
        switch (this.f16799a) {
            case 0:
                ((MediaController) this.h).lambda$stopRecordingInternal$40((File) this.f16803n, (TLRPC.TL_document) this.f16804r, this.f16801c, this.f16800b, this.e, this.f16802f, this.d);
                return;
            default:
                int i10 = this.e;
                boolean z10 = this.f16802f;
                ((MessagesStorage) this.h).lambda$updatePinnedMessages$138(this.f16800b, (HashMap) this.f16803n, this.f16801c, this.d, (ArrayList) this.f16804r, i10, z10);
                return;
        }
    }

    public k6(MessagesStorage messagesStorage, boolean z10, HashMap hashMap, int i10, long j3, ArrayList arrayList, int i11, boolean z11) {
        this.h = messagesStorage;
        this.f16800b = z10;
        this.f16803n = hashMap;
        this.f16801c = i10;
        this.d = j3;
        this.f16804r = arrayList;
        this.e = i11;
        this.f16802f = z11;
    }
}
