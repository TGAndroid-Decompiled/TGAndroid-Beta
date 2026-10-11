package org.telegram.messenger;

import java.util.ArrayList;
import java.util.Set;
import org.telegram.messenger.TranslateController;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class xk implements Runnable {
    public final int f19875a = 0;
    public final boolean f19876b;
    public final long f19877c;
    public final BaseController d;
    public final Object f19878e;
    public final Object f19879f;
    public final Object h;
    public final Object f19880n;

    public xk(long j3, Set set, TranslateController.PendingTranslation pendingTranslation, TranslateController translateController, TLObject tLObject, TLRPC.TL_error tL_error, boolean z10) {
        this.d = translateController;
        this.f19878e = pendingTranslation;
        this.f19879f = tLObject;
        this.f19876b = z10;
        this.h = tL_error;
        this.f19877c = j3;
        this.f19880n = set;
    }

    @Override
    public final void run() {
        switch (this.f19875a) {
            case 0:
                long j3 = this.f19877c;
                ((TranslateController) this.d).lambda$pushToTranslate$22((TranslateController.PendingTranslation) this.f19878e, (TLObject) this.f19879f, this.f19876b, (TLRPC.TL_error) this.h, j3, (Set) this.f19880n);
                return;
            case 1:
                long j10 = this.f19877c;
                ((MediaDataController) this.d).lambda$broadcastReplyMessages$179((ArrayList) this.f19878e, this.f19876b, (ArrayList) this.f19879f, (ArrayList) this.h, (a0.i) this.f19880n, j10);
                return;
            default:
                long j11 = this.f19877c;
                ((MemberRequestsController) this.d).lambda$getImporters$0((TLRPC.TL_error) this.h, (TLObject) this.f19879f, (TLRPC.TL_chatInviteImporter) this.f19878e, this.f19876b, j11, (RequestDelegate) this.f19880n);
                return;
        }
    }

    public xk(long j3, MemberRequestsController memberRequestsController, RequestDelegate requestDelegate, TLObject tLObject, TLRPC.TL_chatInviteImporter tL_chatInviteImporter, TLRPC.TL_error tL_error, boolean z10) {
        this.d = memberRequestsController;
        this.h = tL_error;
        this.f19879f = tLObject;
        this.f19878e = tL_chatInviteImporter;
        this.f19876b = z10;
        this.f19877c = j3;
        this.f19880n = requestDelegate;
    }

    public xk(MediaDataController mediaDataController, ArrayList arrayList, boolean z10, ArrayList arrayList2, ArrayList arrayList3, a0.i iVar, long j3) {
        this.d = mediaDataController;
        this.f19878e = arrayList;
        this.f19876b = z10;
        this.f19879f = arrayList2;
        this.h = arrayList3;
        this.f19880n = iVar;
        this.f19877c = j3;
    }
}
