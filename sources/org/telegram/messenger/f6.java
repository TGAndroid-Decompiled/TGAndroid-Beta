package org.telegram.messenger;

import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;
public final class f6 implements Runnable {
    public final int f20057a = 0;
    public final boolean f20058b;
    public final int f20059c;
    public final long d;
    public final int e;
    public final boolean f20060f;
    public final Object h;
    public final Serializable f20061n;
    public final Object f20062r;

    public f6(MediaController mediaController, File file, TLRPC.TL_document tL_document, int i10, boolean z10, int i11, boolean z11, long j10) {
        this.h = mediaController;
        this.f20061n = file;
        this.f20062r = tL_document;
        this.f20059c = i10;
        this.f20058b = z10;
        this.e = i11;
        this.f20060f = z11;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f20057a) {
            case 0:
                ((MediaController) this.h).lambda$stopRecordingInternal$43((File) this.f20061n, (TLRPC.TL_document) this.f20062r, this.f20059c, this.f20058b, this.e, this.f20060f, this.d);
                return;
            default:
                int i10 = this.e;
                boolean z10 = this.f20060f;
                ((MessagesStorage) this.h).lambda$updatePinnedMessages$141(this.f20058b, (HashMap) this.f20061n, this.f20059c, this.d, (ArrayList) this.f20062r, i10, z10);
                return;
        }
    }

    public f6(MessagesStorage messagesStorage, boolean z10, HashMap hashMap, int i10, long j10, ArrayList arrayList, int i11, boolean z11) {
        this.h = messagesStorage;
        this.f20058b = z10;
        this.f20061n = hashMap;
        this.f20059c = i10;
        this.d = j10;
        this.f20062r = arrayList;
        this.e = i11;
        this.f20060f = z11;
    }
}
