package org.telegram.messenger;

import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;
public final class l6 implements Runnable {
    public final int f18406a = 0;
    public final boolean f18407b;
    public final int f18408c;
    public final long d;
    public final int f18409e;
    public final boolean f18410f;
    public final Object h;
    public final Serializable f18411n;
    public final Object f18412r;

    public l6(MediaController mediaController, File file, TLRPC.TL_document tL_document, int i10, boolean z10, int i11, boolean z11, long j3) {
        this.h = mediaController;
        this.f18411n = file;
        this.f18412r = tL_document;
        this.f18408c = i10;
        this.f18407b = z10;
        this.f18409e = i11;
        this.f18410f = z11;
        this.d = j3;
    }

    @Override
    public final void run() {
        switch (this.f18406a) {
            case 0:
                ((MediaController) this.h).lambda$stopRecordingInternal$40((File) this.f18411n, (TLRPC.TL_document) this.f18412r, this.f18408c, this.f18407b, this.f18409e, this.f18410f, this.d);
                return;
            default:
                int i10 = this.f18409e;
                boolean z10 = this.f18410f;
                ((MessagesStorage) this.h).lambda$updatePinnedMessages$138(this.f18407b, (HashMap) this.f18411n, this.f18408c, this.d, (ArrayList) this.f18412r, i10, z10);
                return;
        }
    }

    public l6(MessagesStorage messagesStorage, boolean z10, HashMap hashMap, int i10, long j3, ArrayList arrayList, int i11, boolean z11) {
        this.h = messagesStorage;
        this.f18407b = z10;
        this.f18411n = hashMap;
        this.f18408c = i10;
        this.d = j3;
        this.f18412r = arrayList;
        this.f18409e = i11;
        this.f18410f = z11;
    }
}
