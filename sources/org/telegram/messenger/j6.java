package org.telegram.messenger;

import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;
public final class j6 implements Runnable {
    public final int f18053a = 0;
    public final boolean f18054b;
    public final int f18055c;
    public final long d;
    public final int f18056e;
    public final boolean f18057f;
    public final Object h;
    public final Serializable f18058n;
    public final Object f18059r;

    public j6(MediaController mediaController, File file, TLRPC.TL_document tL_document, int i10, boolean z10, int i11, boolean z11, long j3) {
        this.h = mediaController;
        this.f18058n = file;
        this.f18059r = tL_document;
        this.f18055c = i10;
        this.f18054b = z10;
        this.f18056e = i11;
        this.f18057f = z11;
        this.d = j3;
    }

    @Override
    public final void run() {
        switch (this.f18053a) {
            case 0:
                ((MediaController) this.h).lambda$stopRecordingInternal$40((File) this.f18058n, (TLRPC.TL_document) this.f18059r, this.f18055c, this.f18054b, this.f18056e, this.f18057f, this.d);
                return;
            default:
                int i10 = this.f18056e;
                boolean z10 = this.f18057f;
                ((MessagesStorage) this.h).lambda$updatePinnedMessages$138(this.f18054b, (HashMap) this.f18058n, this.f18055c, this.d, (ArrayList) this.f18059r, i10, z10);
                return;
        }
    }

    public j6(MessagesStorage messagesStorage, boolean z10, HashMap hashMap, int i10, long j3, ArrayList arrayList, int i11, boolean z11) {
        this.h = messagesStorage;
        this.f18054b = z10;
        this.f18058n = hashMap;
        this.f18055c = i10;
        this.d = j3;
        this.f18059r = arrayList;
        this.f18056e = i11;
        this.f18057f = z11;
    }
}
