package org.telegram.messenger;

import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;
public final class k6 implements Runnable {
    public final int f16775a = 0;
    public final boolean f16776b;
    public final int f16777c;
    public final long d;
    public final int e;
    public final boolean f16778f;
    public final Object h;
    public final Serializable f16779n;
    public final Object f16780r;

    public k6(MediaController mediaController, File file, TLRPC.TL_document tL_document, int i10, boolean z10, int i11, boolean z11, long j3) {
        this.h = mediaController;
        this.f16779n = file;
        this.f16780r = tL_document;
        this.f16777c = i10;
        this.f16776b = z10;
        this.e = i11;
        this.f16778f = z11;
        this.d = j3;
    }

    @Override
    public final void run() {
        switch (this.f16775a) {
            case 0:
                ((MediaController) this.h).lambda$stopRecordingInternal$40((File) this.f16779n, (TLRPC.TL_document) this.f16780r, this.f16777c, this.f16776b, this.e, this.f16778f, this.d);
                return;
            default:
                int i10 = this.e;
                boolean z10 = this.f16778f;
                ((MessagesStorage) this.h).lambda$updatePinnedMessages$138(this.f16776b, (HashMap) this.f16779n, this.f16777c, this.d, (ArrayList) this.f16780r, i10, z10);
                return;
        }
    }

    public k6(MessagesStorage messagesStorage, boolean z10, HashMap hashMap, int i10, long j3, ArrayList arrayList, int i11, boolean z11) {
        this.h = messagesStorage;
        this.f16776b = z10;
        this.f16779n = hashMap;
        this.f16777c = i10;
        this.d = j3;
        this.f16780r = arrayList;
        this.e = i11;
        this.f16778f = z11;
    }
}
