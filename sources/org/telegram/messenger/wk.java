package org.telegram.messenger;

import java.util.ArrayList;
import java.util.Set;
import org.telegram.messenger.TranslateController;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class wk implements Runnable {
    public final int f20082a = 0;
    public final boolean f20083b;
    public final long f20084c;
    public final BaseController d;
    public final Object e;
    public final Object f20085f;
    public final Object h;
    public final Object f20086n;

    public wk(long j10, Set set, TranslateController.PendingTranslation pendingTranslation, TranslateController translateController, TLObject tLObject, TLRPC.TL_error tL_error, boolean z10) {
        this.d = translateController;
        this.e = pendingTranslation;
        this.f20085f = tLObject;
        this.f20083b = z10;
        this.h = tL_error;
        this.f20084c = j10;
        this.f20086n = set;
    }

    @Override
    public final void run() {
        switch (this.f20082a) {
            case 0:
                long j10 = this.f20084c;
                ((TranslateController) this.d).lambda$pushToTranslate$22((TranslateController.PendingTranslation) this.e, (TLObject) this.f20085f, this.f20083b, (TLRPC.TL_error) this.h, j10, (Set) this.f20086n);
                return;
            case 1:
                long j11 = this.f20084c;
                ((MediaDataController) this.d).lambda$broadcastReplyMessages$179((ArrayList) this.e, this.f20083b, (ArrayList) this.f20085f, (ArrayList) this.h, (a0.h) this.f20086n, j11);
                return;
            default:
                long j12 = this.f20084c;
                ((MemberRequestsController) this.d).lambda$getImporters$0((TLRPC.TL_error) this.h, (TLObject) this.f20085f, (TLRPC.TL_chatInviteImporter) this.e, this.f20083b, j12, (RequestDelegate) this.f20086n);
                return;
        }
    }

    public wk(long j10, MemberRequestsController memberRequestsController, RequestDelegate requestDelegate, TLObject tLObject, TLRPC.TL_chatInviteImporter tL_chatInviteImporter, TLRPC.TL_error tL_error, boolean z10) {
        this.d = memberRequestsController;
        this.h = tL_error;
        this.f20085f = tLObject;
        this.e = tL_chatInviteImporter;
        this.f20083b = z10;
        this.f20084c = j10;
        this.f20086n = requestDelegate;
    }

    public wk(MediaDataController mediaDataController, ArrayList arrayList, boolean z10, ArrayList arrayList2, ArrayList arrayList3, a0.h hVar, long j10) {
        this.d = mediaDataController;
        this.e = arrayList;
        this.f20083b = z10;
        this.f20085f = arrayList2;
        this.h = arrayList3;
        this.f20086n = hVar;
        this.f20084c = j10;
    }
}
