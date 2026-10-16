package org.telegram.messenger;

import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;
public final class p6 implements Runnable {
    public final int f17772a = 0;
    public final boolean f17773b;
    public final int f17774c;
    public final long d;
    public final int e;
    public final boolean f17775f;
    public final Object h;
    public final Serializable f17776n;
    public final Object f17777r;

    public p6(MediaController mediaController, File file, TLRPC.TL_document tL_document, int i10, boolean z10, int i11, boolean z11, long j10) {
        this.h = mediaController;
        this.f17776n = file;
        this.f17777r = tL_document;
        this.f17774c = i10;
        this.f17773b = z10;
        this.e = i11;
        this.f17775f = z11;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f17772a) {
            case 0:
                ((MediaController) this.h).lambda$stopRecordingInternal$41((File) this.f17776n, (TLRPC.TL_document) this.f17777r, this.f17774c, this.f17773b, this.e, this.f17775f, this.d);
                return;
            default:
                int i10 = this.e;
                boolean z10 = this.f17775f;
                ((MessagesStorage) this.h).lambda$updatePinnedMessages$138(this.f17773b, (HashMap) this.f17776n, this.f17774c, this.d, (ArrayList) this.f17777r, i10, z10);
                return;
        }
    }

    public p6(MessagesStorage messagesStorage, boolean z10, HashMap hashMap, int i10, long j10, ArrayList arrayList, int i11, boolean z11) {
        this.h = messagesStorage;
        this.f17773b = z10;
        this.f17776n = hashMap;
        this.f17774c = i10;
        this.d = j10;
        this.f17777r = arrayList;
        this.e = i11;
        this.f17775f = z11;
    }
}
