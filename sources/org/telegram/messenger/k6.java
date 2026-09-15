package org.telegram.messenger;

import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;
public final class k6 implements Runnable {
    public final int f16545a = 0;
    public final boolean f16546b;
    public final int f16547c;
    public final long d;
    public final int e;
    public final boolean f16548f;
    public final Object h;
    public final Serializable f16549n;
    public final Object f16550r;

    public k6(MediaController mediaController, File file, TLRPC.TL_document tL_document, int i10, boolean z10, int i11, boolean z11, long j3) {
        this.h = mediaController;
        this.f16549n = file;
        this.f16550r = tL_document;
        this.f16547c = i10;
        this.f16546b = z10;
        this.e = i11;
        this.f16548f = z11;
        this.d = j3;
    }

    @Override
    public final void run() {
        switch (this.f16545a) {
            case 0:
                ((MediaController) this.h).lambda$stopRecordingInternal$40((File) this.f16549n, (TLRPC.TL_document) this.f16550r, this.f16547c, this.f16546b, this.e, this.f16548f, this.d);
                return;
            default:
                int i10 = this.e;
                boolean z10 = this.f16548f;
                ((MessagesStorage) this.h).lambda$updatePinnedMessages$138(this.f16546b, (HashMap) this.f16549n, this.f16547c, this.d, (ArrayList) this.f16550r, i10, z10);
                return;
        }
    }

    public k6(MessagesStorage messagesStorage, boolean z10, HashMap hashMap, int i10, long j3, ArrayList arrayList, int i11, boolean z11) {
        this.h = messagesStorage;
        this.f16546b = z10;
        this.f16549n = hashMap;
        this.f16547c = i10;
        this.d = j3;
        this.f16550r = arrayList;
        this.e = i11;
        this.f16548f = z11;
    }
}
