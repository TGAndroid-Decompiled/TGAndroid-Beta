package org.telegram.messenger;

import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;

public final class l6 implements Runnable {

    public final int f20838a = 0;

    public final boolean f20839b;

    public final int f20840c;
    public final long d;

    public final int f20841e;

    public final boolean f20842f;
    public final Object h;

    public final Serializable f20843n;

    public final Object f20844r;

    public l6(MediaController mediaController, File file, TLRPC.TL_document tL_document, int i10, boolean z10, int i11, boolean z11, long j10) {
        this.h = mediaController;
        this.f20843n = file;
        this.f20844r = tL_document;
        this.f20840c = i10;
        this.f20839b = z10;
        this.f20841e = i11;
        this.f20842f = z11;
        this.d = j10;
    }

    @Override
    public final void run() throws Throwable {
        switch (this.f20838a) {
            case 0:
                ((MediaController) this.h).lambda$stopRecordingInternal$40((File) this.f20843n, (TLRPC.TL_document) this.f20844r, this.f20840c, this.f20839b, this.f20841e, this.f20842f, this.d);
                break;
            default:
                ((MessagesStorage) this.h).lambda$updatePinnedMessages$138(this.f20839b, (HashMap) this.f20843n, this.f20840c, this.d, (ArrayList) this.f20844r, this.f20841e, this.f20842f);
                break;
        }
    }

    public l6(MessagesStorage messagesStorage, boolean z10, HashMap map, int i10, long j10, ArrayList arrayList, int i11, boolean z11) {
        this.h = messagesStorage;
        this.f20839b = z10;
        this.f20843n = map;
        this.f20840c = i10;
        this.d = j10;
        this.f20844r = arrayList;
        this.f20841e = i11;
        this.f20842f = z11;
    }
}
