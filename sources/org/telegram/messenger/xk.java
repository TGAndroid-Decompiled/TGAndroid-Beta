package org.telegram.messenger;

import java.util.ArrayList;
import java.util.Set;
import org.telegram.messenger.TranslateController;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class xk implements Runnable {
    public final int f18086a = 0;
    public final boolean f18087b;
    public final long f18088c;
    public final BaseController d;
    public final Object e;
    public final Object f18089f;
    public final Object h;
    public final Object f18090n;

    public xk(long j3, Set set, TranslateController.PendingTranslation pendingTranslation, TranslateController translateController, TLObject tLObject, TLRPC.TL_error tL_error, boolean z10) {
        this.d = translateController;
        this.e = pendingTranslation;
        this.f18089f = tLObject;
        this.f18087b = z10;
        this.h = tL_error;
        this.f18088c = j3;
        this.f18090n = set;
    }

    @Override
    public final void run() {
        switch (this.f18086a) {
            case 0:
                long j3 = this.f18088c;
                ((TranslateController) this.d).lambda$pushToTranslate$22((TranslateController.PendingTranslation) this.e, (TLObject) this.f18089f, this.f18087b, (TLRPC.TL_error) this.h, j3, (Set) this.f18090n);
                return;
            case 1:
                long j10 = this.f18088c;
                ((MediaDataController) this.d).lambda$broadcastReplyMessages$179((ArrayList) this.e, this.f18087b, (ArrayList) this.f18089f, (ArrayList) this.h, (a0.i) this.f18090n, j10);
                return;
            default:
                long j11 = this.f18088c;
                ((MemberRequestsController) this.d).lambda$getImporters$0((TLRPC.TL_error) this.h, (TLObject) this.f18089f, (TLRPC.TL_chatInviteImporter) this.e, this.f18087b, j11, (RequestDelegate) this.f18090n);
                return;
        }
    }

    public xk(long j3, MemberRequestsController memberRequestsController, RequestDelegate requestDelegate, TLObject tLObject, TLRPC.TL_chatInviteImporter tL_chatInviteImporter, TLRPC.TL_error tL_error, boolean z10) {
        this.d = memberRequestsController;
        this.h = tL_error;
        this.f18089f = tLObject;
        this.e = tL_chatInviteImporter;
        this.f18087b = z10;
        this.f18088c = j3;
        this.f18090n = requestDelegate;
    }

    public xk(MediaDataController mediaDataController, ArrayList arrayList, boolean z10, ArrayList arrayList2, ArrayList arrayList3, a0.i iVar, long j3) {
        this.d = mediaDataController;
        this.e = arrayList;
        this.f18087b = z10;
        this.f18089f = arrayList2;
        this.h = arrayList3;
        this.f18090n = iVar;
        this.f18088c = j3;
    }
}
