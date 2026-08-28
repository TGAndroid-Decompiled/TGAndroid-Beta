package org.telegram.messenger;

import java.util.ArrayList;
import java.util.Set;
import org.telegram.messenger.TranslateController;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class nk implements Runnable {
    public final int f21087a = 0;
    public final boolean f21088b;
    public final long f21089c;
    public final BaseController d;
    public final Object f21090e;
    public final Object f21091f;
    public final Object h;
    public final Object f21092n;

    public nk(long j10, Set set, TranslateController.PendingTranslation pendingTranslation, TranslateController translateController, TLObject tLObject, TLRPC.TL_error tL_error, boolean z10) {
        this.d = translateController;
        this.f21090e = pendingTranslation;
        this.f21091f = tLObject;
        this.f21088b = z10;
        this.h = tL_error;
        this.f21089c = j10;
        this.f21092n = set;
    }

    @Override
    public final void run() {
        switch (this.f21087a) {
            case 0:
                long j10 = this.f21089c;
                ((TranslateController) this.d).lambda$pushToTranslate$22((TranslateController.PendingTranslation) this.f21090e, (TLObject) this.f21091f, this.f21088b, (TLRPC.TL_error) this.h, j10, (Set) this.f21092n);
                return;
            case 1:
                long j11 = this.f21089c;
                ((MediaDataController) this.d).lambda$broadcastReplyMessages$179((ArrayList) this.f21090e, this.f21088b, (ArrayList) this.f21091f, (ArrayList) this.h, (a0.h) this.f21092n, j11);
                return;
            default:
                long j12 = this.f21089c;
                ((MemberRequestsController) this.d).lambda$getImporters$0((TLRPC.TL_error) this.h, (TLObject) this.f21091f, (TLRPC.TL_chatInviteImporter) this.f21090e, this.f21088b, j12, (RequestDelegate) this.f21092n);
                return;
        }
    }

    public nk(long j10, MemberRequestsController memberRequestsController, RequestDelegate requestDelegate, TLObject tLObject, TLRPC.TL_chatInviteImporter tL_chatInviteImporter, TLRPC.TL_error tL_error, boolean z10) {
        this.d = memberRequestsController;
        this.h = tL_error;
        this.f21091f = tLObject;
        this.f21090e = tL_chatInviteImporter;
        this.f21088b = z10;
        this.f21089c = j10;
        this.f21092n = requestDelegate;
    }

    public nk(MediaDataController mediaDataController, ArrayList arrayList, boolean z10, ArrayList arrayList2, ArrayList arrayList3, a0.h hVar, long j10) {
        this.d = mediaDataController;
        this.f21090e = arrayList;
        this.f21088b = z10;
        this.f21091f = arrayList2;
        this.h = arrayList3;
        this.f21092n = hVar;
        this.f21089c = j10;
    }
}
