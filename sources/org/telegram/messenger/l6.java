package org.telegram.messenger;

import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;
public final class l6 implements Runnable {
    public final int f18402a = 0;
    public final boolean f18403b;
    public final int f18404c;
    public final long d;
    public final int f18405e;
    public final boolean f18406f;
    public final Object h;
    public final Serializable f18407n;
    public final Object f18408r;

    public l6(MediaController mediaController, File file, TLRPC.TL_document tL_document, int i10, boolean z10, int i11, boolean z11, long j3) {
        this.h = mediaController;
        this.f18407n = file;
        this.f18408r = tL_document;
        this.f18404c = i10;
        this.f18403b = z10;
        this.f18405e = i11;
        this.f18406f = z11;
        this.d = j3;
    }

    @Override
    public final void run() {
        switch (this.f18402a) {
            case 0:
                ((MediaController) this.h).lambda$stopRecordingInternal$40((File) this.f18407n, (TLRPC.TL_document) this.f18408r, this.f18404c, this.f18403b, this.f18405e, this.f18406f, this.d);
                return;
            default:
                int i10 = this.f18405e;
                boolean z10 = this.f18406f;
                ((MessagesStorage) this.h).lambda$updatePinnedMessages$138(this.f18403b, (HashMap) this.f18407n, this.f18404c, this.d, (ArrayList) this.f18408r, i10, z10);
                return;
        }
    }

    public l6(MessagesStorage messagesStorage, boolean z10, HashMap hashMap, int i10, long j3, ArrayList arrayList, int i11, boolean z11) {
        this.h = messagesStorage;
        this.f18403b = z10;
        this.f18407n = hashMap;
        this.f18404c = i10;
        this.d = j3;
        this.f18408r = arrayList;
        this.f18405e = i11;
        this.f18406f = z11;
    }
}
