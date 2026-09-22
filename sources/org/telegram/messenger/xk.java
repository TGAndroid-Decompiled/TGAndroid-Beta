package org.telegram.messenger;

import java.util.ArrayList;
import java.util.Set;
import org.telegram.messenger.TranslateController;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class xk implements Runnable {
    public final int f17904a = 0;
    public final boolean f17905b;
    public final long f17906c;
    public final BaseController d;
    public final Object e;
    public final Object f17907f;
    public final Object h;
    public final Object f17908n;

    public xk(long j3, Set set, TranslateController.PendingTranslation pendingTranslation, TranslateController translateController, TLObject tLObject, TLRPC.TL_error tL_error, boolean z10) {
        this.d = translateController;
        this.e = pendingTranslation;
        this.f17907f = tLObject;
        this.f17905b = z10;
        this.h = tL_error;
        this.f17906c = j3;
        this.f17908n = set;
    }

    @Override
    public final void run() {
        switch (this.f17904a) {
            case 0:
                long j3 = this.f17906c;
                ((TranslateController) this.d).lambda$pushToTranslate$22((TranslateController.PendingTranslation) this.e, (TLObject) this.f17907f, this.f17905b, (TLRPC.TL_error) this.h, j3, (Set) this.f17908n);
                return;
            case 1:
                long j10 = this.f17906c;
                ((MediaDataController) this.d).lambda$broadcastReplyMessages$179((ArrayList) this.e, this.f17905b, (ArrayList) this.f17907f, (ArrayList) this.h, (a0.i) this.f17908n, j10);
                return;
            default:
                long j11 = this.f17906c;
                ((MemberRequestsController) this.d).lambda$getImporters$0((TLRPC.TL_error) this.h, (TLObject) this.f17907f, (TLRPC.TL_chatInviteImporter) this.e, this.f17905b, j11, (RequestDelegate) this.f17908n);
                return;
        }
    }

    public xk(long j3, MemberRequestsController memberRequestsController, RequestDelegate requestDelegate, TLObject tLObject, TLRPC.TL_chatInviteImporter tL_chatInviteImporter, TLRPC.TL_error tL_error, boolean z10) {
        this.d = memberRequestsController;
        this.h = tL_error;
        this.f17907f = tLObject;
        this.e = tL_chatInviteImporter;
        this.f17905b = z10;
        this.f17906c = j3;
        this.f17908n = requestDelegate;
    }

    public xk(MediaDataController mediaDataController, ArrayList arrayList, boolean z10, ArrayList arrayList2, ArrayList arrayList3, a0.i iVar, long j3) {
        this.d = mediaDataController;
        this.e = arrayList;
        this.f17905b = z10;
        this.f17907f = arrayList2;
        this.h = arrayList3;
        this.f17908n = iVar;
        this.f17906c = j3;
    }
}
