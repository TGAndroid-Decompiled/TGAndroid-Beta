package org.telegram.messenger;

import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;
public final class k6 implements Runnable {
    public final int f16731a = 0;
    public final boolean f16732b;
    public final int f16733c;
    public final long d;
    public final int e;
    public final boolean f16734f;
    public final Object h;
    public final Serializable f16735n;
    public final Object f16736r;

    public k6(MediaController mediaController, File file, TLRPC.TL_document tL_document, int i10, boolean z10, int i11, boolean z11, long j3) {
        this.h = mediaController;
        this.f16735n = file;
        this.f16736r = tL_document;
        this.f16733c = i10;
        this.f16732b = z10;
        this.e = i11;
        this.f16734f = z11;
        this.d = j3;
    }

    @Override
    public final void run() {
        switch (this.f16731a) {
            case 0:
                ((MediaController) this.h).lambda$stopRecordingInternal$40((File) this.f16735n, (TLRPC.TL_document) this.f16736r, this.f16733c, this.f16732b, this.e, this.f16734f, this.d);
                return;
            default:
                int i10 = this.e;
                boolean z10 = this.f16734f;
                ((MessagesStorage) this.h).lambda$updatePinnedMessages$138(this.f16732b, (HashMap) this.f16735n, this.f16733c, this.d, (ArrayList) this.f16736r, i10, z10);
                return;
        }
    }

    public k6(MessagesStorage messagesStorage, boolean z10, HashMap hashMap, int i10, long j3, ArrayList arrayList, int i11, boolean z11) {
        this.h = messagesStorage;
        this.f16732b = z10;
        this.f16735n = hashMap;
        this.f16733c = i10;
        this.d = j3;
        this.f16736r = arrayList;
        this.e = i11;
        this.f16734f = z11;
    }
}
