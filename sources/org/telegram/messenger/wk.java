package org.telegram.messenger;

import java.util.ArrayList;
import java.util.Set;
import org.telegram.messenger.TranslateController;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class wk implements Runnable {
    public final int f18089a = 0;
    public final boolean f18090b;
    public final long f18091c;
    public final BaseController d;
    public final Object e;
    public final Object f18092f;
    public final Object h;
    public final Object f18093n;

    public wk(long j3, Set set, TranslateController.PendingTranslation pendingTranslation, TranslateController translateController, TLObject tLObject, TLRPC.TL_error tL_error, boolean z10) {
        this.d = translateController;
        this.e = pendingTranslation;
        this.f18092f = tLObject;
        this.f18090b = z10;
        this.h = tL_error;
        this.f18091c = j3;
        this.f18093n = set;
    }

    @Override
    public final void run() {
        switch (this.f18089a) {
            case 0:
                long j3 = this.f18091c;
                ((TranslateController) this.d).lambda$pushToTranslate$22((TranslateController.PendingTranslation) this.e, (TLObject) this.f18092f, this.f18090b, (TLRPC.TL_error) this.h, j3, (Set) this.f18093n);
                return;
            case 1:
                long j10 = this.f18091c;
                ((MediaDataController) this.d).lambda$broadcastReplyMessages$179((ArrayList) this.e, this.f18090b, (ArrayList) this.f18092f, (ArrayList) this.h, (a0.i) this.f18093n, j10);
                return;
            default:
                long j11 = this.f18091c;
                ((MemberRequestsController) this.d).lambda$getImporters$0((TLRPC.TL_error) this.h, (TLObject) this.f18092f, (TLRPC.TL_chatInviteImporter) this.e, this.f18090b, j11, (RequestDelegate) this.f18093n);
                return;
        }
    }

    public wk(long j3, MemberRequestsController memberRequestsController, RequestDelegate requestDelegate, TLObject tLObject, TLRPC.TL_chatInviteImporter tL_chatInviteImporter, TLRPC.TL_error tL_error, boolean z10) {
        this.d = memberRequestsController;
        this.h = tL_error;
        this.f18092f = tLObject;
        this.e = tL_chatInviteImporter;
        this.f18090b = z10;
        this.f18091c = j3;
        this.f18093n = requestDelegate;
    }

    public wk(MediaDataController mediaDataController, ArrayList arrayList, boolean z10, ArrayList arrayList2, ArrayList arrayList3, a0.i iVar, long j3) {
        this.d = mediaDataController;
        this.e = arrayList;
        this.f18090b = z10;
        this.f18092f = arrayList2;
        this.h = arrayList3;
        this.f18093n = iVar;
        this.f18091c = j3;
    }
}
