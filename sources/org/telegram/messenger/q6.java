package org.telegram.messenger;

import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;
public final class q6 implements Runnable {
    public final int f19320a = 0;
    public final boolean f19321b;
    public final int f19322c;
    public final long d;
    public final int e;
    public final boolean f19323f;
    public final Object h;
    public final Serializable f19324n;
    public final Object f19325r;

    public q6(MediaController mediaController, File file, TLRPC.TL_document tL_document, int i10, boolean z10, int i11, boolean z11, long j10) {
        this.h = mediaController;
        this.f19324n = file;
        this.f19325r = tL_document;
        this.f19322c = i10;
        this.f19321b = z10;
        this.e = i11;
        this.f19323f = z11;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f19320a) {
            case 0:
                ((MediaController) this.h).lambda$stopRecordingInternal$41((File) this.f19324n, (TLRPC.TL_document) this.f19325r, this.f19322c, this.f19321b, this.e, this.f19323f, this.d);
                return;
            default:
                int i10 = this.e;
                boolean z10 = this.f19323f;
                ((MessagesStorage) this.h).lambda$updatePinnedMessages$138(this.f19321b, (HashMap) this.f19324n, this.f19322c, this.d, (ArrayList) this.f19325r, i10, z10);
                return;
        }
    }

    public q6(MessagesStorage messagesStorage, boolean z10, HashMap hashMap, int i10, long j10, ArrayList arrayList, int i11, boolean z11) {
        this.h = messagesStorage;
        this.f19321b = z10;
        this.f19324n = hashMap;
        this.f19322c = i10;
        this.d = j10;
        this.f19325r = arrayList;
        this.e = i11;
        this.f19323f = z11;
    }
}
