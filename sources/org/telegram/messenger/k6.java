package org.telegram.messenger;

import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;
public final class k6 implements Runnable {
    public final int f18333a = 0;
    public final boolean f18334b;
    public final int f18335c;
    public final long d;
    public final int f18336e;
    public final boolean f18337f;
    public final Object h;
    public final Serializable f18338n;
    public final Object f18339r;

    public k6(MediaController mediaController, File file, TLRPC.TL_document tL_document, int i10, boolean z10, int i11, boolean z11, long j3) {
        this.h = mediaController;
        this.f18338n = file;
        this.f18339r = tL_document;
        this.f18335c = i10;
        this.f18334b = z10;
        this.f18336e = i11;
        this.f18337f = z11;
        this.d = j3;
    }

    @Override
    public final void run() {
        switch (this.f18333a) {
            case 0:
                ((MediaController) this.h).lambda$stopRecordingInternal$40((File) this.f18338n, (TLRPC.TL_document) this.f18339r, this.f18335c, this.f18334b, this.f18336e, this.f18337f, this.d);
                return;
            default:
                int i10 = this.f18336e;
                boolean z10 = this.f18337f;
                ((MessagesStorage) this.h).lambda$updatePinnedMessages$138(this.f18334b, (HashMap) this.f18338n, this.f18335c, this.d, (ArrayList) this.f18339r, i10, z10);
                return;
        }
    }

    public k6(MessagesStorage messagesStorage, boolean z10, HashMap hashMap, int i10, long j3, ArrayList arrayList, int i11, boolean z11) {
        this.h = messagesStorage;
        this.f18334b = z10;
        this.f18338n = hashMap;
        this.f18335c = i10;
        this.d = j3;
        this.f18339r = arrayList;
        this.f18336e = i11;
        this.f18337f = z11;
    }
}
