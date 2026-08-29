package org.telegram.messenger;

import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;
public final class m6 implements Runnable {
    public final int f20921a = 0;
    public final boolean f20922b;
    public final int f20923c;
    public final long d;
    public final int f20924e;
    public final boolean f20925f;
    public final Object h;
    public final Serializable f20926n;
    public final Object f20927r;

    public m6(MediaController mediaController, File file, TLRPC.TL_document tL_document, int i10, boolean z10, int i11, boolean z11, long j10) {
        this.h = mediaController;
        this.f20926n = file;
        this.f20927r = tL_document;
        this.f20923c = i10;
        this.f20922b = z10;
        this.f20924e = i11;
        this.f20925f = z11;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f20921a) {
            case 0:
                ((MediaController) this.h).lambda$stopRecordingInternal$40((File) this.f20926n, (TLRPC.TL_document) this.f20927r, this.f20923c, this.f20922b, this.f20924e, this.f20925f, this.d);
                return;
            default:
                int i10 = this.f20924e;
                boolean z10 = this.f20925f;
                ((MessagesStorage) this.h).lambda$updatePinnedMessages$138(this.f20922b, (HashMap) this.f20926n, this.f20923c, this.d, (ArrayList) this.f20927r, i10, z10);
                return;
        }
    }

    public m6(MessagesStorage messagesStorage, boolean z10, HashMap hashMap, int i10, long j10, ArrayList arrayList, int i11, boolean z11) {
        this.h = messagesStorage;
        this.f20922b = z10;
        this.f20926n = hashMap;
        this.f20923c = i10;
        this.d = j10;
        this.f20927r = arrayList;
        this.f20924e = i11;
        this.f20925f = z11;
    }
}
