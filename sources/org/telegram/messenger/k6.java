package org.telegram.messenger;

import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;
public final class k6 implements Runnable {
    public final int f16542a = 0;
    public final boolean f16543b;
    public final int f16544c;
    public final long d;
    public final int e;
    public final boolean f16545f;
    public final Object h;
    public final Serializable f16546n;
    public final Object f16547r;

    public k6(MediaController mediaController, File file, TLRPC.TL_document tL_document, int i10, boolean z10, int i11, boolean z11, long j3) {
        this.h = mediaController;
        this.f16546n = file;
        this.f16547r = tL_document;
        this.f16544c = i10;
        this.f16543b = z10;
        this.e = i11;
        this.f16545f = z11;
        this.d = j3;
    }

    @Override
    public final void run() {
        switch (this.f16542a) {
            case 0:
                ((MediaController) this.h).lambda$stopRecordingInternal$40((File) this.f16546n, (TLRPC.TL_document) this.f16547r, this.f16544c, this.f16543b, this.e, this.f16545f, this.d);
                return;
            default:
                int i10 = this.e;
                boolean z10 = this.f16545f;
                ((MessagesStorage) this.h).lambda$updatePinnedMessages$138(this.f16543b, (HashMap) this.f16546n, this.f16544c, this.d, (ArrayList) this.f16547r, i10, z10);
                return;
        }
    }

    public k6(MessagesStorage messagesStorage, boolean z10, HashMap hashMap, int i10, long j3, ArrayList arrayList, int i11, boolean z11) {
        this.h = messagesStorage;
        this.f16543b = z10;
        this.f16546n = hashMap;
        this.f16544c = i10;
        this.d = j3;
        this.f16547r = arrayList;
        this.e = i11;
        this.f16545f = z11;
    }
}
