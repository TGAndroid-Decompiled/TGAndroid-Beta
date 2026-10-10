package org.telegram.messenger;

import java.util.ArrayList;
import java.util.Set;
import org.telegram.messenger.TranslateController;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class xk implements Runnable {
    public final int f19848a = 0;
    public final boolean f19849b;
    public final long f19850c;
    public final BaseController d;
    public final Object f19851e;
    public final Object f19852f;
    public final Object h;
    public final Object f19853n;

    public xk(long j3, Set set, TranslateController.PendingTranslation pendingTranslation, TranslateController translateController, TLObject tLObject, TLRPC.TL_error tL_error, boolean z10) {
        this.d = translateController;
        this.f19851e = pendingTranslation;
        this.f19852f = tLObject;
        this.f19849b = z10;
        this.h = tL_error;
        this.f19850c = j3;
        this.f19853n = set;
    }

    @Override
    public final void run() {
        switch (this.f19848a) {
            case 0:
                long j3 = this.f19850c;
                ((TranslateController) this.d).lambda$pushToTranslate$22((TranslateController.PendingTranslation) this.f19851e, (TLObject) this.f19852f, this.f19849b, (TLRPC.TL_error) this.h, j3, (Set) this.f19853n);
                return;
            case 1:
                long j10 = this.f19850c;
                ((MediaDataController) this.d).lambda$broadcastReplyMessages$179((ArrayList) this.f19851e, this.f19849b, (ArrayList) this.f19852f, (ArrayList) this.h, (a0.i) this.f19853n, j10);
                return;
            default:
                long j11 = this.f19850c;
                ((MemberRequestsController) this.d).lambda$getImporters$0((TLRPC.TL_error) this.h, (TLObject) this.f19852f, (TLRPC.TL_chatInviteImporter) this.f19851e, this.f19849b, j11, (RequestDelegate) this.f19853n);
                return;
        }
    }

    public xk(long j3, MemberRequestsController memberRequestsController, RequestDelegate requestDelegate, TLObject tLObject, TLRPC.TL_chatInviteImporter tL_chatInviteImporter, TLRPC.TL_error tL_error, boolean z10) {
        this.d = memberRequestsController;
        this.h = tL_error;
        this.f19852f = tLObject;
        this.f19851e = tL_chatInviteImporter;
        this.f19849b = z10;
        this.f19850c = j3;
        this.f19853n = requestDelegate;
    }

    public xk(MediaDataController mediaDataController, ArrayList arrayList, boolean z10, ArrayList arrayList2, ArrayList arrayList3, a0.i iVar, long j3) {
        this.d = mediaDataController;
        this.f19851e = arrayList;
        this.f19849b = z10;
        this.f19852f = arrayList2;
        this.h = arrayList3;
        this.f19853n = iVar;
        this.f19850c = j3;
    }
}
