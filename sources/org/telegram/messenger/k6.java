package org.telegram.messenger;

import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;
public final class k6 implements Runnable {
    public final int f18125a = 0;
    public final boolean f18126b;
    public final int f18127c;
    public final long d;
    public final int f18128e;
    public final boolean f18129f;
    public final Object h;
    public final Serializable f18130n;
    public final Object f18131r;

    public k6(MediaController mediaController, File file, TLRPC.TL_document tL_document, int i10, boolean z10, int i11, boolean z11, long j3) {
        this.h = mediaController;
        this.f18130n = file;
        this.f18131r = tL_document;
        this.f18127c = i10;
        this.f18126b = z10;
        this.f18128e = i11;
        this.f18129f = z11;
        this.d = j3;
    }

    @Override
    public final void run() {
        switch (this.f18125a) {
            case 0:
                ((MediaController) this.h).lambda$stopRecordingInternal$40((File) this.f18130n, (TLRPC.TL_document) this.f18131r, this.f18127c, this.f18126b, this.f18128e, this.f18129f, this.d);
                return;
            default:
                int i10 = this.f18128e;
                boolean z10 = this.f18129f;
                ((MessagesStorage) this.h).lambda$updatePinnedMessages$138(this.f18126b, (HashMap) this.f18130n, this.f18127c, this.d, (ArrayList) this.f18131r, i10, z10);
                return;
        }
    }

    public k6(MessagesStorage messagesStorage, boolean z10, HashMap hashMap, int i10, long j3, ArrayList arrayList, int i11, boolean z11) {
        this.h = messagesStorage;
        this.f18126b = z10;
        this.f18130n = hashMap;
        this.f18127c = i10;
        this.d = j3;
        this.f18131r = arrayList;
        this.f18128e = i11;
        this.f18129f = z11;
    }
}
