package org.telegram.messenger;

import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;
public final class l6 implements Runnable {
    public final int f18443a = 0;
    public final boolean f18444b;
    public final int f18445c;
    public final long d;
    public final int f18446e;
    public final boolean f18447f;
    public final Object h;
    public final Serializable f18448n;
    public final Object f18449r;

    public l6(MediaController mediaController, File file, TLRPC.TL_document tL_document, int i10, boolean z10, int i11, boolean z11, long j3) {
        this.h = mediaController;
        this.f18448n = file;
        this.f18449r = tL_document;
        this.f18445c = i10;
        this.f18444b = z10;
        this.f18446e = i11;
        this.f18447f = z11;
        this.d = j3;
    }

    @Override
    public final void run() {
        switch (this.f18443a) {
            case 0:
                ((MediaController) this.h).lambda$stopRecordingInternal$40((File) this.f18448n, (TLRPC.TL_document) this.f18449r, this.f18445c, this.f18444b, this.f18446e, this.f18447f, this.d);
                return;
            default:
                int i10 = this.f18446e;
                boolean z10 = this.f18447f;
                ((MessagesStorage) this.h).lambda$updatePinnedMessages$138(this.f18444b, (HashMap) this.f18448n, this.f18445c, this.d, (ArrayList) this.f18449r, i10, z10);
                return;
        }
    }

    public l6(MessagesStorage messagesStorage, boolean z10, HashMap hashMap, int i10, long j3, ArrayList arrayList, int i11, boolean z11) {
        this.h = messagesStorage;
        this.f18444b = z10;
        this.f18448n = hashMap;
        this.f18445c = i10;
        this.d = j3;
        this.f18449r = arrayList;
        this.f18446e = i11;
        this.f18447f = z11;
    }
}
