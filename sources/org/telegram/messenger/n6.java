package org.telegram.messenger;

import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;
public final class n6 implements Runnable {
    public final int f19430a = 0;
    public final boolean f19431b;
    public final int f19432c;
    public final long d;
    public final int f19433e;
    public final boolean f19434f;
    public final Object h;
    public final Serializable f19435n;
    public final Object f19436r;

    public n6(MediaController mediaController, File file, TLRPC.TL_document tL_document, int i10, boolean z4, int i11, boolean z10, long j10) {
        this.h = mediaController;
        this.f19435n = file;
        this.f19436r = tL_document;
        this.f19432c = i10;
        this.f19431b = z4;
        this.f19433e = i11;
        this.f19434f = z10;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f19430a) {
            case 0:
                ((MediaController) this.h).lambda$stopRecordingInternal$40((File) this.f19435n, (TLRPC.TL_document) this.f19436r, this.f19432c, this.f19431b, this.f19433e, this.f19434f, this.d);
                return;
            default:
                int i10 = this.f19433e;
                boolean z4 = this.f19434f;
                ((MessagesStorage) this.h).lambda$updatePinnedMessages$138(this.f19431b, (HashMap) this.f19435n, this.f19432c, this.d, (ArrayList) this.f19436r, i10, z4);
                return;
        }
    }

    public n6(MessagesStorage messagesStorage, boolean z4, HashMap hashMap, int i10, long j10, ArrayList arrayList, int i11, boolean z10) {
        this.h = messagesStorage;
        this.f19431b = z4;
        this.f19435n = hashMap;
        this.f19432c = i10;
        this.d = j10;
        this.f19436r = arrayList;
        this.f19433e = i11;
        this.f19434f = z10;
    }
}
