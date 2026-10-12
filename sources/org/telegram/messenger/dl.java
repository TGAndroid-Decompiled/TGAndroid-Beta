package org.telegram.messenger;

import java.util.ArrayList;
import java.util.Set;
import org.telegram.messenger.TranslateController;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class dl implements Runnable {
    public final int f17450a = 0;
    public final boolean f17451b;
    public final long f17452c;
    public final BaseController d;
    public final Object f17453e;
    public final Object f17454f;
    public final Object h;
    public final Object f17455n;

    public dl(long j3, Set set, TranslateController.PendingTranslation pendingTranslation, TranslateController translateController, TLObject tLObject, TLRPC.TL_error tL_error, boolean z10) {
        this.d = translateController;
        this.f17453e = pendingTranslation;
        this.f17454f = tLObject;
        this.f17451b = z10;
        this.h = tL_error;
        this.f17452c = j3;
        this.f17455n = set;
    }

    @Override
    public final void run() {
        switch (this.f17450a) {
            case 0:
                long j3 = this.f17452c;
                ((TranslateController) this.d).lambda$pushToTranslate$22((TranslateController.PendingTranslation) this.f17453e, (TLObject) this.f17454f, this.f17451b, (TLRPC.TL_error) this.h, j3, (Set) this.f17455n);
                return;
            case 1:
                long j10 = this.f17452c;
                ((MediaDataController) this.d).lambda$broadcastReplyMessages$179((ArrayList) this.f17453e, this.f17451b, (ArrayList) this.f17454f, (ArrayList) this.h, (a0.i) this.f17455n, j10);
                return;
            default:
                long j11 = this.f17452c;
                ((MemberRequestsController) this.d).lambda$getImporters$0((TLRPC.TL_error) this.h, (TLObject) this.f17454f, (TLRPC.TL_chatInviteImporter) this.f17453e, this.f17451b, j11, (RequestDelegate) this.f17455n);
                return;
        }
    }

    public dl(long j3, MemberRequestsController memberRequestsController, RequestDelegate requestDelegate, TLObject tLObject, TLRPC.TL_chatInviteImporter tL_chatInviteImporter, TLRPC.TL_error tL_error, boolean z10) {
        this.d = memberRequestsController;
        this.h = tL_error;
        this.f17454f = tLObject;
        this.f17453e = tL_chatInviteImporter;
        this.f17451b = z10;
        this.f17452c = j3;
        this.f17455n = requestDelegate;
    }

    public dl(MediaDataController mediaDataController, ArrayList arrayList, boolean z10, ArrayList arrayList2, ArrayList arrayList3, a0.i iVar, long j3) {
        this.d = mediaDataController;
        this.f17453e = arrayList;
        this.f17451b = z10;
        this.f17454f = arrayList2;
        this.h = arrayList3;
        this.f17455n = iVar;
        this.f17452c = j3;
    }
}
