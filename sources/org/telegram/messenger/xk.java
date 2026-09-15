package org.telegram.messenger;

import java.util.ArrayList;
import java.util.Set;
import org.telegram.messenger.TranslateController;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class xk implements Runnable {
    public final int f17905a = 0;
    public final boolean f17906b;
    public final long f17907c;
    public final BaseController d;
    public final Object e;
    public final Object f17908f;
    public final Object h;
    public final Object f17909n;

    public xk(long j3, Set set, TranslateController.PendingTranslation pendingTranslation, TranslateController translateController, TLObject tLObject, TLRPC.TL_error tL_error, boolean z10) {
        this.d = translateController;
        this.e = pendingTranslation;
        this.f17908f = tLObject;
        this.f17906b = z10;
        this.h = tL_error;
        this.f17907c = j3;
        this.f17909n = set;
    }

    @Override
    public final void run() {
        switch (this.f17905a) {
            case 0:
                long j3 = this.f17907c;
                ((TranslateController) this.d).lambda$pushToTranslate$22((TranslateController.PendingTranslation) this.e, (TLObject) this.f17908f, this.f17906b, (TLRPC.TL_error) this.h, j3, (Set) this.f17909n);
                return;
            case 1:
                long j10 = this.f17907c;
                ((MediaDataController) this.d).lambda$broadcastReplyMessages$179((ArrayList) this.e, this.f17906b, (ArrayList) this.f17908f, (ArrayList) this.h, (a0.i) this.f17909n, j10);
                return;
            default:
                long j11 = this.f17907c;
                ((MemberRequestsController) this.d).lambda$getImporters$0((TLRPC.TL_error) this.h, (TLObject) this.f17908f, (TLRPC.TL_chatInviteImporter) this.e, this.f17906b, j11, (RequestDelegate) this.f17909n);
                return;
        }
    }

    public xk(long j3, MemberRequestsController memberRequestsController, RequestDelegate requestDelegate, TLObject tLObject, TLRPC.TL_chatInviteImporter tL_chatInviteImporter, TLRPC.TL_error tL_error, boolean z10) {
        this.d = memberRequestsController;
        this.h = tL_error;
        this.f17908f = tLObject;
        this.e = tL_chatInviteImporter;
        this.f17906b = z10;
        this.f17907c = j3;
        this.f17909n = requestDelegate;
    }

    public xk(MediaDataController mediaDataController, ArrayList arrayList, boolean z10, ArrayList arrayList2, ArrayList arrayList3, a0.i iVar, long j3) {
        this.d = mediaDataController;
        this.e = arrayList;
        this.f17906b = z10;
        this.f17908f = arrayList2;
        this.h = arrayList3;
        this.f17909n = iVar;
        this.f17907c = j3;
    }
}
