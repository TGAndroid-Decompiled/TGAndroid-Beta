package org.telegram.messenger;

import java.util.ArrayList;
import java.util.Set;
import org.telegram.messenger.TranslateController;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class xk implements Runnable {
    public final int f19839a = 0;
    public final boolean f19840b;
    public final long f19841c;
    public final BaseController d;
    public final Object f19842e;
    public final Object f19843f;
    public final Object h;
    public final Object f19844n;

    public xk(long j3, Set set, TranslateController.PendingTranslation pendingTranslation, TranslateController translateController, TLObject tLObject, TLRPC.TL_error tL_error, boolean z10) {
        this.d = translateController;
        this.f19842e = pendingTranslation;
        this.f19843f = tLObject;
        this.f19840b = z10;
        this.h = tL_error;
        this.f19841c = j3;
        this.f19844n = set;
    }

    @Override
    public final void run() {
        switch (this.f19839a) {
            case 0:
                long j3 = this.f19841c;
                ((TranslateController) this.d).lambda$pushToTranslate$22((TranslateController.PendingTranslation) this.f19842e, (TLObject) this.f19843f, this.f19840b, (TLRPC.TL_error) this.h, j3, (Set) this.f19844n);
                return;
            case 1:
                long j10 = this.f19841c;
                ((MediaDataController) this.d).lambda$broadcastReplyMessages$179((ArrayList) this.f19842e, this.f19840b, (ArrayList) this.f19843f, (ArrayList) this.h, (a0.i) this.f19844n, j10);
                return;
            default:
                long j11 = this.f19841c;
                ((MemberRequestsController) this.d).lambda$getImporters$0((TLRPC.TL_error) this.h, (TLObject) this.f19843f, (TLRPC.TL_chatInviteImporter) this.f19842e, this.f19840b, j11, (RequestDelegate) this.f19844n);
                return;
        }
    }

    public xk(long j3, MemberRequestsController memberRequestsController, RequestDelegate requestDelegate, TLObject tLObject, TLRPC.TL_chatInviteImporter tL_chatInviteImporter, TLRPC.TL_error tL_error, boolean z10) {
        this.d = memberRequestsController;
        this.h = tL_error;
        this.f19843f = tLObject;
        this.f19842e = tL_chatInviteImporter;
        this.f19840b = z10;
        this.f19841c = j3;
        this.f19844n = requestDelegate;
    }

    public xk(MediaDataController mediaDataController, ArrayList arrayList, boolean z10, ArrayList arrayList2, ArrayList arrayList3, a0.i iVar, long j3) {
        this.d = mediaDataController;
        this.f19842e = arrayList;
        this.f19840b = z10;
        this.f19843f = arrayList2;
        this.h = arrayList3;
        this.f19844n = iVar;
        this.f19841c = j3;
    }
}
