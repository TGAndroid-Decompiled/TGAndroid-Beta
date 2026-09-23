package org.telegram.messenger;

import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;
public final class k6 implements Runnable {
    public final int f16541a = 0;
    public final boolean f16542b;
    public final int f16543c;
    public final long d;
    public final int e;
    public final boolean f16544f;
    public final Object h;
    public final Serializable f16545n;
    public final Object f16546r;

    public k6(MediaController mediaController, File file, TLRPC.TL_document tL_document, int i10, boolean z10, int i11, boolean z11, long j3) {
        this.h = mediaController;
        this.f16545n = file;
        this.f16546r = tL_document;
        this.f16543c = i10;
        this.f16542b = z10;
        this.e = i11;
        this.f16544f = z11;
        this.d = j3;
    }

    @Override
    public final void run() {
        switch (this.f16541a) {
            case 0:
                ((MediaController) this.h).lambda$stopRecordingInternal$40((File) this.f16545n, (TLRPC.TL_document) this.f16546r, this.f16543c, this.f16542b, this.e, this.f16544f, this.d);
                return;
            default:
                int i10 = this.e;
                boolean z10 = this.f16544f;
                ((MessagesStorage) this.h).lambda$updatePinnedMessages$138(this.f16542b, (HashMap) this.f16545n, this.f16543c, this.d, (ArrayList) this.f16546r, i10, z10);
                return;
        }
    }

    public k6(MessagesStorage messagesStorage, boolean z10, HashMap hashMap, int i10, long j3, ArrayList arrayList, int i11, boolean z11) {
        this.h = messagesStorage;
        this.f16542b = z10;
        this.f16545n = hashMap;
        this.f16543c = i10;
        this.d = j3;
        this.f16546r = arrayList;
        this.e = i11;
        this.f16544f = z11;
    }
}
