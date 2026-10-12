package org.telegram.messenger;

import java.util.ArrayList;
import java.util.Set;
import org.telegram.messenger.TranslateController;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class al implements Runnable {
    public final int f16813a = 0;
    public final boolean f16814b;
    public final long f16815c;
    public final BaseController d;
    public final Object e;
    public final Object f16816f;
    public final Object h;
    public final Object f16817n;

    public al(long j10, Set set, TranslateController.PendingTranslation pendingTranslation, TranslateController translateController, TLObject tLObject, TLRPC.TL_error tL_error, boolean z10) {
        this.d = translateController;
        this.e = pendingTranslation;
        this.f16816f = tLObject;
        this.f16814b = z10;
        this.h = tL_error;
        this.f16815c = j10;
        this.f16817n = set;
    }

    @Override
    public final void run() {
        switch (this.f16813a) {
            case 0:
                long j10 = this.f16815c;
                ((TranslateController) this.d).lambda$pushToTranslate$22((TranslateController.PendingTranslation) this.e, (TLObject) this.f16816f, this.f16814b, (TLRPC.TL_error) this.h, j10, (Set) this.f16817n);
                return;
            case 1:
                long j11 = this.f16815c;
                ((MediaDataController) this.d).lambda$broadcastReplyMessages$179((ArrayList) this.e, this.f16814b, (ArrayList) this.f16816f, (ArrayList) this.h, (a0.h) this.f16817n, j11);
                return;
            default:
                long j12 = this.f16815c;
                ((MemberRequestsController) this.d).lambda$getImporters$0((TLRPC.TL_error) this.h, (TLObject) this.f16816f, (TLRPC.TL_chatInviteImporter) this.e, this.f16814b, j12, (RequestDelegate) this.f16817n);
                return;
        }
    }

    public al(long j10, MemberRequestsController memberRequestsController, RequestDelegate requestDelegate, TLObject tLObject, TLRPC.TL_chatInviteImporter tL_chatInviteImporter, TLRPC.TL_error tL_error, boolean z10) {
        this.d = memberRequestsController;
        this.h = tL_error;
        this.f16816f = tLObject;
        this.e = tL_chatInviteImporter;
        this.f16814b = z10;
        this.f16815c = j10;
        this.f16817n = requestDelegate;
    }

    public al(MediaDataController mediaDataController, ArrayList arrayList, boolean z10, ArrayList arrayList2, ArrayList arrayList3, a0.h hVar, long j10) {
        this.d = mediaDataController;
        this.e = arrayList;
        this.f16814b = z10;
        this.f16816f = arrayList2;
        this.h = arrayList3;
        this.f16817n = hVar;
        this.f16815c = j10;
    }
}
