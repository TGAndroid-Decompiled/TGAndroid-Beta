package org.telegram.messenger;

import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;
public final class n6 implements Runnable {
    public final int f19432a = 0;
    public final boolean f19433b;
    public final int f19434c;
    public final long d;
    public final int f19435e;
    public final boolean f19436f;
    public final Object h;
    public final Serializable f19437n;
    public final Object f19438r;

    public n6(MediaController mediaController, File file, TLRPC.TL_document tL_document, int i10, boolean z4, int i11, boolean z10, long j10) {
        this.h = mediaController;
        this.f19437n = file;
        this.f19438r = tL_document;
        this.f19434c = i10;
        this.f19433b = z4;
        this.f19435e = i11;
        this.f19436f = z10;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f19432a) {
            case 0:
                ((MediaController) this.h).lambda$stopRecordingInternal$40((File) this.f19437n, (TLRPC.TL_document) this.f19438r, this.f19434c, this.f19433b, this.f19435e, this.f19436f, this.d);
                return;
            default:
                int i10 = this.f19435e;
                boolean z4 = this.f19436f;
                ((MessagesStorage) this.h).lambda$updatePinnedMessages$138(this.f19433b, (HashMap) this.f19437n, this.f19434c, this.d, (ArrayList) this.f19438r, i10, z4);
                return;
        }
    }

    public n6(MessagesStorage messagesStorage, boolean z4, HashMap hashMap, int i10, long j10, ArrayList arrayList, int i11, boolean z10) {
        this.h = messagesStorage;
        this.f19433b = z4;
        this.f19437n = hashMap;
        this.f19434c = i10;
        this.d = j10;
        this.f19438r = arrayList;
        this.f19435e = i11;
        this.f19436f = z10;
    }
}
