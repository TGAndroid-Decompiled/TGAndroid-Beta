package org.telegram.messenger;

import java.util.ArrayList;
import java.util.Set;
import org.telegram.messenger.TranslateController;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class xk implements Runnable {
    public final int f19635a = 0;
    public final boolean f19636b;
    public final long f19637c;
    public final BaseController d;
    public final Object f19638e;
    public final Object f19639f;
    public final Object h;
    public final Object f19640n;

    public xk(long j3, Set set, TranslateController.PendingTranslation pendingTranslation, TranslateController translateController, TLObject tLObject, TLRPC.TL_error tL_error, boolean z10) {
        this.d = translateController;
        this.f19638e = pendingTranslation;
        this.f19639f = tLObject;
        this.f19636b = z10;
        this.h = tL_error;
        this.f19637c = j3;
        this.f19640n = set;
    }

    @Override
    public final void run() {
        switch (this.f19635a) {
            case 0:
                long j3 = this.f19637c;
                ((TranslateController) this.d).lambda$pushToTranslate$22((TranslateController.PendingTranslation) this.f19638e, (TLObject) this.f19639f, this.f19636b, (TLRPC.TL_error) this.h, j3, (Set) this.f19640n);
                return;
            case 1:
                long j10 = this.f19637c;
                ((MediaDataController) this.d).lambda$broadcastReplyMessages$179((ArrayList) this.f19638e, this.f19636b, (ArrayList) this.f19639f, (ArrayList) this.h, (a0.i) this.f19640n, j10);
                return;
            default:
                long j11 = this.f19637c;
                ((MemberRequestsController) this.d).lambda$getImporters$0((TLRPC.TL_error) this.h, (TLObject) this.f19639f, (TLRPC.TL_chatInviteImporter) this.f19638e, this.f19636b, j11, (RequestDelegate) this.f19640n);
                return;
        }
    }

    public xk(long j3, MemberRequestsController memberRequestsController, RequestDelegate requestDelegate, TLObject tLObject, TLRPC.TL_chatInviteImporter tL_chatInviteImporter, TLRPC.TL_error tL_error, boolean z10) {
        this.d = memberRequestsController;
        this.h = tL_error;
        this.f19639f = tLObject;
        this.f19638e = tL_chatInviteImporter;
        this.f19636b = z10;
        this.f19637c = j3;
        this.f19640n = requestDelegate;
    }

    public xk(MediaDataController mediaDataController, ArrayList arrayList, boolean z10, ArrayList arrayList2, ArrayList arrayList3, a0.i iVar, long j3) {
        this.d = mediaDataController;
        this.f19638e = arrayList;
        this.f19636b = z10;
        this.f19639f = arrayList2;
        this.h = arrayList3;
        this.f19640n = iVar;
        this.f19637c = j3;
    }
}
