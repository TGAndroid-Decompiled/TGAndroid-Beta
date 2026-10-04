package org.telegram.messenger;

import java.util.ArrayList;
import java.util.Set;
import org.telegram.messenger.TranslateController;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class wk implements Runnable {
    public final int f19742a = 0;
    public final boolean f19743b;
    public final long f19744c;
    public final BaseController d;
    public final Object f19745e;
    public final Object f19746f;
    public final Object h;
    public final Object f19747n;

    public wk(long j3, Set set, TranslateController.PendingTranslation pendingTranslation, TranslateController translateController, TLObject tLObject, TLRPC.TL_error tL_error, boolean z10) {
        this.d = translateController;
        this.f19745e = pendingTranslation;
        this.f19746f = tLObject;
        this.f19743b = z10;
        this.h = tL_error;
        this.f19744c = j3;
        this.f19747n = set;
    }

    @Override
    public final void run() {
        switch (this.f19742a) {
            case 0:
                long j3 = this.f19744c;
                ((TranslateController) this.d).lambda$pushToTranslate$22((TranslateController.PendingTranslation) this.f19745e, (TLObject) this.f19746f, this.f19743b, (TLRPC.TL_error) this.h, j3, (Set) this.f19747n);
                return;
            case 1:
                long j10 = this.f19744c;
                ((MediaDataController) this.d).lambda$broadcastReplyMessages$179((ArrayList) this.f19745e, this.f19743b, (ArrayList) this.f19746f, (ArrayList) this.h, (a0.i) this.f19747n, j10);
                return;
            default:
                long j11 = this.f19744c;
                ((MemberRequestsController) this.d).lambda$getImporters$0((TLRPC.TL_error) this.h, (TLObject) this.f19746f, (TLRPC.TL_chatInviteImporter) this.f19745e, this.f19743b, j11, (RequestDelegate) this.f19747n);
                return;
        }
    }

    public wk(long j3, MemberRequestsController memberRequestsController, RequestDelegate requestDelegate, TLObject tLObject, TLRPC.TL_chatInviteImporter tL_chatInviteImporter, TLRPC.TL_error tL_error, boolean z10) {
        this.d = memberRequestsController;
        this.h = tL_error;
        this.f19746f = tLObject;
        this.f19745e = tL_chatInviteImporter;
        this.f19743b = z10;
        this.f19744c = j3;
        this.f19747n = requestDelegate;
    }

    public wk(MediaDataController mediaDataController, ArrayList arrayList, boolean z10, ArrayList arrayList2, ArrayList arrayList3, a0.i iVar, long j3) {
        this.d = mediaDataController;
        this.f19745e = arrayList;
        this.f19743b = z10;
        this.f19746f = arrayList2;
        this.h = arrayList3;
        this.f19747n = iVar;
        this.f19744c = j3;
    }
}
