package org.telegram.messenger;

import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;
public final class n6 implements Runnable {
    public final int f17906a = 0;
    public final boolean f17907b;
    public final int f17908c;
    public final long d;
    public final int e;
    public final boolean f17909f;
    public final Object h;
    public final Serializable f17910n;
    public final Object f17911r;

    public n6(MediaController mediaController, File file, TLRPC.TL_document tL_document, int i10, boolean z4, int i11, boolean z10, long j10) {
        this.h = mediaController;
        this.f17910n = file;
        this.f17911r = tL_document;
        this.f17908c = i10;
        this.f17907b = z4;
        this.e = i11;
        this.f17909f = z10;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f17906a) {
            case 0:
                ((MediaController) this.h).lambda$stopRecordingInternal$40((File) this.f17910n, (TLRPC.TL_document) this.f17911r, this.f17908c, this.f17907b, this.e, this.f17909f, this.d);
                return;
            default:
                int i10 = this.e;
                boolean z4 = this.f17909f;
                ((MessagesStorage) this.h).lambda$updatePinnedMessages$138(this.f17907b, (HashMap) this.f17910n, this.f17908c, this.d, (ArrayList) this.f17911r, i10, z4);
                return;
        }
    }

    public n6(MessagesStorage messagesStorage, boolean z4, HashMap hashMap, int i10, long j10, ArrayList arrayList, int i11, boolean z10) {
        this.h = messagesStorage;
        this.f17907b = z4;
        this.f17910n = hashMap;
        this.f17908c = i10;
        this.d = j10;
        this.f17911r = arrayList;
        this.e = i11;
        this.f17909f = z10;
    }
}
