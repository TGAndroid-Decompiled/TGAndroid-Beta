package org.telegram.messenger;

import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;
public final class p6 implements Runnable {
    public final int f19225a = 0;
    public final boolean f19226b;
    public final int f19227c;
    public final long d;
    public final int e;
    public final boolean f19228f;
    public final Object h;
    public final Serializable f19229n;
    public final Object f19230r;

    public p6(MediaController mediaController, File file, TLRPC.TL_document tL_document, int i10, boolean z10, int i11, boolean z11, long j10) {
        this.h = mediaController;
        this.f19229n = file;
        this.f19230r = tL_document;
        this.f19227c = i10;
        this.f19226b = z10;
        this.e = i11;
        this.f19228f = z11;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f19225a) {
            case 0:
                ((MediaController) this.h).lambda$stopRecordingInternal$41((File) this.f19229n, (TLRPC.TL_document) this.f19230r, this.f19227c, this.f19226b, this.e, this.f19228f, this.d);
                return;
            default:
                int i10 = this.e;
                boolean z10 = this.f19228f;
                ((MessagesStorage) this.h).lambda$updatePinnedMessages$138(this.f19226b, (HashMap) this.f19229n, this.f19227c, this.d, (ArrayList) this.f19230r, i10, z10);
                return;
        }
    }

    public p6(MessagesStorage messagesStorage, boolean z10, HashMap hashMap, int i10, long j10, ArrayList arrayList, int i11, boolean z11) {
        this.h = messagesStorage;
        this.f19226b = z10;
        this.f19229n = hashMap;
        this.f19227c = i10;
        this.d = j10;
        this.f19230r = arrayList;
        this.e = i11;
        this.f19228f = z11;
    }
}
