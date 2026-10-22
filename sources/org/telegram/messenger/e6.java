package org.telegram.messenger;

import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;
public final class e6 implements Runnable {
    public final int f18241a = 0;
    public final boolean f18242b;
    public final int f18243c;
    public final long d;
    public final int e;
    public final boolean f18244f;
    public final Object h;
    public final Serializable f18245n;
    public final Object f18246r;

    public e6(MediaController mediaController, File file, TLRPC.TL_document tL_document, int i10, boolean z10, int i11, boolean z11, long j10) {
        this.h = mediaController;
        this.f18245n = file;
        this.f18246r = tL_document;
        this.f18243c = i10;
        this.f18242b = z10;
        this.e = i11;
        this.f18244f = z11;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f18241a) {
            case 0:
                ((MediaController) this.h).lambda$stopRecordingInternal$43((File) this.f18245n, (TLRPC.TL_document) this.f18246r, this.f18243c, this.f18242b, this.e, this.f18244f, this.d);
                return;
            default:
                int i10 = this.e;
                boolean z10 = this.f18244f;
                ((MessagesStorage) this.h).lambda$updatePinnedMessages$138(this.f18242b, (HashMap) this.f18245n, this.f18243c, this.d, (ArrayList) this.f18246r, i10, z10);
                return;
        }
    }

    public e6(MessagesStorage messagesStorage, boolean z10, HashMap hashMap, int i10, long j10, ArrayList arrayList, int i11, boolean z11) {
        this.h = messagesStorage;
        this.f18242b = z10;
        this.f18245n = hashMap;
        this.f18243c = i10;
        this.d = j10;
        this.f18246r = arrayList;
        this.e = i11;
        this.f18244f = z11;
    }
}
