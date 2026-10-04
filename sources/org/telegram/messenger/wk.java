package org.telegram.messenger;

import java.util.ArrayList;
import java.util.Set;
import org.telegram.messenger.TranslateController;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class wk implements Runnable {
    public final int f19743a = 0;
    public final boolean f19744b;
    public final long f19745c;
    public final BaseController d;
    public final Object f19746e;
    public final Object f19747f;
    public final Object h;
    public final Object f19748n;

    public wk(long j3, Set set, TranslateController.PendingTranslation pendingTranslation, TranslateController translateController, TLObject tLObject, TLRPC.TL_error tL_error, boolean z10) {
        this.d = translateController;
        this.f19746e = pendingTranslation;
        this.f19747f = tLObject;
        this.f19744b = z10;
        this.h = tL_error;
        this.f19745c = j3;
        this.f19748n = set;
    }

    @Override
    public final void run() {
        switch (this.f19743a) {
            case 0:
                long j3 = this.f19745c;
                ((TranslateController) this.d).lambda$pushToTranslate$22((TranslateController.PendingTranslation) this.f19746e, (TLObject) this.f19747f, this.f19744b, (TLRPC.TL_error) this.h, j3, (Set) this.f19748n);
                return;
            case 1:
                long j10 = this.f19745c;
                ((MediaDataController) this.d).lambda$broadcastReplyMessages$179((ArrayList) this.f19746e, this.f19744b, (ArrayList) this.f19747f, (ArrayList) this.h, (a0.i) this.f19748n, j10);
                return;
            default:
                long j11 = this.f19745c;
                ((MemberRequestsController) this.d).lambda$getImporters$0((TLRPC.TL_error) this.h, (TLObject) this.f19747f, (TLRPC.TL_chatInviteImporter) this.f19746e, this.f19744b, j11, (RequestDelegate) this.f19748n);
                return;
        }
    }

    public wk(long j3, MemberRequestsController memberRequestsController, RequestDelegate requestDelegate, TLObject tLObject, TLRPC.TL_chatInviteImporter tL_chatInviteImporter, TLRPC.TL_error tL_error, boolean z10) {
        this.d = memberRequestsController;
        this.h = tL_error;
        this.f19747f = tLObject;
        this.f19746e = tL_chatInviteImporter;
        this.f19744b = z10;
        this.f19745c = j3;
        this.f19748n = requestDelegate;
    }

    public wk(MediaDataController mediaDataController, ArrayList arrayList, boolean z10, ArrayList arrayList2, ArrayList arrayList3, a0.i iVar, long j3) {
        this.d = mediaDataController;
        this.f19746e = arrayList;
        this.f19744b = z10;
        this.f19747f = arrayList2;
        this.h = arrayList3;
        this.f19748n = iVar;
        this.f19745c = j3;
    }
}
