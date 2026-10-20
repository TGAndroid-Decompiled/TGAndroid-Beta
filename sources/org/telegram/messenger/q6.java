package org.telegram.messenger;

import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;
public final class q6 implements Runnable {
    public final int f19323a = 0;
    public final boolean f19324b;
    public final int f19325c;
    public final long d;
    public final int e;
    public final boolean f19326f;
    public final Object h;
    public final Serializable f19327n;
    public final Object f19328r;

    public q6(MediaController mediaController, File file, TLRPC.TL_document tL_document, int i10, boolean z10, int i11, boolean z11, long j10) {
        this.h = mediaController;
        this.f19327n = file;
        this.f19328r = tL_document;
        this.f19325c = i10;
        this.f19324b = z10;
        this.e = i11;
        this.f19326f = z11;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f19323a) {
            case 0:
                ((MediaController) this.h).lambda$stopRecordingInternal$41((File) this.f19327n, (TLRPC.TL_document) this.f19328r, this.f19325c, this.f19324b, this.e, this.f19326f, this.d);
                return;
            default:
                int i10 = this.e;
                boolean z10 = this.f19326f;
                ((MessagesStorage) this.h).lambda$updatePinnedMessages$138(this.f19324b, (HashMap) this.f19327n, this.f19325c, this.d, (ArrayList) this.f19328r, i10, z10);
                return;
        }
    }

    public q6(MessagesStorage messagesStorage, boolean z10, HashMap hashMap, int i10, long j10, ArrayList arrayList, int i11, boolean z11) {
        this.h = messagesStorage;
        this.f19324b = z10;
        this.f19327n = hashMap;
        this.f19325c = i10;
        this.d = j10;
        this.f19328r = arrayList;
        this.e = i11;
        this.f19326f = z11;
    }
}
