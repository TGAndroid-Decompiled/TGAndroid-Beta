package org.telegram.messenger;

import java.util.ArrayList;
import java.util.Set;
import org.telegram.messenger.TranslateController;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class dl implements Runnable {
    public final int f17451a = 0;
    public final boolean f17452b;
    public final long f17453c;
    public final BaseController d;
    public final Object f17454e;
    public final Object f17455f;
    public final Object h;
    public final Object f17456n;

    public dl(long j3, Set set, TranslateController.PendingTranslation pendingTranslation, TranslateController translateController, TLObject tLObject, TLRPC.TL_error tL_error, boolean z10) {
        this.d = translateController;
        this.f17454e = pendingTranslation;
        this.f17455f = tLObject;
        this.f17452b = z10;
        this.h = tL_error;
        this.f17453c = j3;
        this.f17456n = set;
    }

    @Override
    public final void run() {
        switch (this.f17451a) {
            case 0:
                long j3 = this.f17453c;
                ((TranslateController) this.d).lambda$pushToTranslate$22((TranslateController.PendingTranslation) this.f17454e, (TLObject) this.f17455f, this.f17452b, (TLRPC.TL_error) this.h, j3, (Set) this.f17456n);
                return;
            case 1:
                long j10 = this.f17453c;
                ((MediaDataController) this.d).lambda$broadcastReplyMessages$179((ArrayList) this.f17454e, this.f17452b, (ArrayList) this.f17455f, (ArrayList) this.h, (a0.i) this.f17456n, j10);
                return;
            default:
                long j11 = this.f17453c;
                ((MemberRequestsController) this.d).lambda$getImporters$0((TLRPC.TL_error) this.h, (TLObject) this.f17455f, (TLRPC.TL_chatInviteImporter) this.f17454e, this.f17452b, j11, (RequestDelegate) this.f17456n);
                return;
        }
    }

    public dl(long j3, MemberRequestsController memberRequestsController, RequestDelegate requestDelegate, TLObject tLObject, TLRPC.TL_chatInviteImporter tL_chatInviteImporter, TLRPC.TL_error tL_error, boolean z10) {
        this.d = memberRequestsController;
        this.h = tL_error;
        this.f17455f = tLObject;
        this.f17454e = tL_chatInviteImporter;
        this.f17452b = z10;
        this.f17453c = j3;
        this.f17456n = requestDelegate;
    }

    public dl(MediaDataController mediaDataController, ArrayList arrayList, boolean z10, ArrayList arrayList2, ArrayList arrayList3, a0.i iVar, long j3) {
        this.d = mediaDataController;
        this.f17454e = arrayList;
        this.f17452b = z10;
        this.f17455f = arrayList2;
        this.h = arrayList3;
        this.f17456n = iVar;
        this.f17453c = j3;
    }
}
