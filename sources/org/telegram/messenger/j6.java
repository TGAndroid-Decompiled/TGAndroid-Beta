package org.telegram.messenger;

import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;
public final class j6 implements Runnable {
    public final int f20657a = 0;
    public final boolean f20658b;
    public final int f20659c;
    public final long d;
    public final int f20660e;
    public final boolean f20661f;
    public final Object h;
    public final Serializable f20662n;
    public final Object f20663r;

    public j6(MediaController mediaController, File file, TLRPC.TL_document tL_document, int i9, boolean z10, int i10, boolean z11, long j10) {
        this.h = mediaController;
        this.f20662n = file;
        this.f20663r = tL_document;
        this.f20659c = i9;
        this.f20658b = z10;
        this.f20660e = i10;
        this.f20661f = z11;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f20657a) {
            case 0:
                ((MediaController) this.h).lambda$stopRecordingInternal$40((File) this.f20662n, (TLRPC.TL_document) this.f20663r, this.f20659c, this.f20658b, this.f20660e, this.f20661f, this.d);
                return;
            default:
                int i9 = this.f20660e;
                boolean z10 = this.f20661f;
                ((MessagesStorage) this.h).lambda$updatePinnedMessages$138(this.f20658b, (HashMap) this.f20662n, this.f20659c, this.d, (ArrayList) this.f20663r, i9, z10);
                return;
        }
    }

    public j6(MessagesStorage messagesStorage, boolean z10, HashMap hashMap, int i9, long j10, ArrayList arrayList, int i10, boolean z11) {
        this.h = messagesStorage;
        this.f20658b = z10;
        this.f20662n = hashMap;
        this.f20659c = i9;
        this.d = j10;
        this.f20663r = arrayList;
        this.f20660e = i10;
        this.f20661f = z11;
    }
}
