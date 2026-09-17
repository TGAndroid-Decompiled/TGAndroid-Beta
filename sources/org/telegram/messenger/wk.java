package org.telegram.messenger;

import java.util.ArrayList;
import java.util.Set;
import org.telegram.messenger.TranslateController;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class wk implements Runnable {
    public final int f19587a = 0;
    public final boolean f19588b;
    public final long f19589c;
    public final BaseController d;
    public final Object f19590e;
    public final Object f19591f;
    public final Object h;
    public final Object f19592n;

    public wk(long j3, Set set, TranslateController.PendingTranslation pendingTranslation, TranslateController translateController, TLObject tLObject, TLRPC.TL_error tL_error, boolean z10) {
        this.d = translateController;
        this.f19590e = pendingTranslation;
        this.f19591f = tLObject;
        this.f19588b = z10;
        this.h = tL_error;
        this.f19589c = j3;
        this.f19592n = set;
    }

    @Override
    public final void run() {
        switch (this.f19587a) {
            case 0:
                long j3 = this.f19589c;
                ((TranslateController) this.d).lambda$pushToTranslate$22((TranslateController.PendingTranslation) this.f19590e, (TLObject) this.f19591f, this.f19588b, (TLRPC.TL_error) this.h, j3, (Set) this.f19592n);
                return;
            case 1:
                long j10 = this.f19589c;
                ((MediaDataController) this.d).lambda$broadcastReplyMessages$179((ArrayList) this.f19590e, this.f19588b, (ArrayList) this.f19591f, (ArrayList) this.h, (a0.i) this.f19592n, j10);
                return;
            default:
                long j11 = this.f19589c;
                ((MemberRequestsController) this.d).lambda$getImporters$0((TLRPC.TL_error) this.h, (TLObject) this.f19591f, (TLRPC.TL_chatInviteImporter) this.f19590e, this.f19588b, j11, (RequestDelegate) this.f19592n);
                return;
        }
    }

    public wk(long j3, MemberRequestsController memberRequestsController, RequestDelegate requestDelegate, TLObject tLObject, TLRPC.TL_chatInviteImporter tL_chatInviteImporter, TLRPC.TL_error tL_error, boolean z10) {
        this.d = memberRequestsController;
        this.h = tL_error;
        this.f19591f = tLObject;
        this.f19590e = tL_chatInviteImporter;
        this.f19588b = z10;
        this.f19589c = j3;
        this.f19592n = requestDelegate;
    }

    public wk(MediaDataController mediaDataController, ArrayList arrayList, boolean z10, ArrayList arrayList2, ArrayList arrayList3, a0.i iVar, long j3) {
        this.d = mediaDataController;
        this.f19590e = arrayList;
        this.f19588b = z10;
        this.f19591f = arrayList2;
        this.h = arrayList3;
        this.f19592n = iVar;
        this.f19589c = j3;
    }
}
