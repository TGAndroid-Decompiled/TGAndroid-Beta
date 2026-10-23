package org.telegram.messenger;

import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;
public final class d6 implements Runnable {
    public final int f18232a = 0;
    public final boolean f18233b;
    public final int f18234c;
    public final long d;
    public final int e;
    public final boolean f18235f;
    public final Object h;
    public final Serializable f18236n;
    public final Object f18237r;

    public d6(MediaController mediaController, File file, TLRPC.TL_document tL_document, int i10, boolean z10, int i11, boolean z11, long j10) {
        this.h = mediaController;
        this.f18236n = file;
        this.f18237r = tL_document;
        this.f18234c = i10;
        this.f18233b = z10;
        this.e = i11;
        this.f18235f = z11;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f18232a) {
            case 0:
                ((MediaController) this.h).lambda$stopRecordingInternal$43((File) this.f18236n, (TLRPC.TL_document) this.f18237r, this.f18234c, this.f18233b, this.e, this.f18235f, this.d);
                return;
            default:
                int i10 = this.e;
                boolean z10 = this.f18235f;
                ((MessagesStorage) this.h).lambda$updatePinnedMessages$138(this.f18233b, (HashMap) this.f18236n, this.f18234c, this.d, (ArrayList) this.f18237r, i10, z10);
                return;
        }
    }

    public d6(MessagesStorage messagesStorage, boolean z10, HashMap hashMap, int i10, long j10, ArrayList arrayList, int i11, boolean z11) {
        this.h = messagesStorage;
        this.f18233b = z10;
        this.f18236n = hashMap;
        this.f18234c = i10;
        this.d = j10;
        this.f18237r = arrayList;
        this.e = i11;
        this.f18235f = z11;
    }
}
