package org.telegram.messenger;

import java.util.ArrayList;
import java.util.Set;
import org.telegram.messenger.TranslateController;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class wk implements Runnable {
    public final int f20025a = 0;
    public final boolean f20026b;
    public final long f20027c;
    public final BaseController d;
    public final Object e;
    public final Object f20028f;
    public final Object h;
    public final Object f20029n;

    public wk(long j10, Set set, TranslateController.PendingTranslation pendingTranslation, TranslateController translateController, TLObject tLObject, TLRPC.TL_error tL_error, boolean z10) {
        this.d = translateController;
        this.e = pendingTranslation;
        this.f20028f = tLObject;
        this.f20026b = z10;
        this.h = tL_error;
        this.f20027c = j10;
        this.f20029n = set;
    }

    @Override
    public final void run() {
        switch (this.f20025a) {
            case 0:
                long j10 = this.f20027c;
                ((TranslateController) this.d).lambda$pushToTranslate$22((TranslateController.PendingTranslation) this.e, (TLObject) this.f20028f, this.f20026b, (TLRPC.TL_error) this.h, j10, (Set) this.f20029n);
                return;
            case 1:
                long j11 = this.f20027c;
                ((MediaDataController) this.d).lambda$broadcastReplyMessages$179((ArrayList) this.e, this.f20026b, (ArrayList) this.f20028f, (ArrayList) this.h, (a0.h) this.f20029n, j11);
                return;
            default:
                long j12 = this.f20027c;
                ((MemberRequestsController) this.d).lambda$getImporters$0((TLRPC.TL_error) this.h, (TLObject) this.f20028f, (TLRPC.TL_chatInviteImporter) this.e, this.f20026b, j12, (RequestDelegate) this.f20029n);
                return;
        }
    }

    public wk(long j10, MemberRequestsController memberRequestsController, RequestDelegate requestDelegate, TLObject tLObject, TLRPC.TL_chatInviteImporter tL_chatInviteImporter, TLRPC.TL_error tL_error, boolean z10) {
        this.d = memberRequestsController;
        this.h = tL_error;
        this.f20028f = tLObject;
        this.e = tL_chatInviteImporter;
        this.f20026b = z10;
        this.f20027c = j10;
        this.f20029n = requestDelegate;
    }

    public wk(MediaDataController mediaDataController, ArrayList arrayList, boolean z10, ArrayList arrayList2, ArrayList arrayList3, a0.h hVar, long j10) {
        this.d = mediaDataController;
        this.e = arrayList;
        this.f20026b = z10;
        this.f20028f = arrayList2;
        this.h = arrayList3;
        this.f20029n = hVar;
        this.f20027c = j10;
    }
}
