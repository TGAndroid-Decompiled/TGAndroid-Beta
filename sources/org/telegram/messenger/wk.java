package org.telegram.messenger;

import java.util.ArrayList;
import java.util.Set;
import org.telegram.messenger.TranslateController;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class wk implements Runnable {
    public final int f19731a = 0;
    public final boolean f19732b;
    public final long f19733c;
    public final BaseController d;
    public final Object f19734e;
    public final Object f19735f;
    public final Object h;
    public final Object f19736n;

    public wk(long j3, Set set, TranslateController.PendingTranslation pendingTranslation, TranslateController translateController, TLObject tLObject, TLRPC.TL_error tL_error, boolean z10) {
        this.d = translateController;
        this.f19734e = pendingTranslation;
        this.f19735f = tLObject;
        this.f19732b = z10;
        this.h = tL_error;
        this.f19733c = j3;
        this.f19736n = set;
    }

    @Override
    public final void run() {
        switch (this.f19731a) {
            case 0:
                long j3 = this.f19733c;
                ((TranslateController) this.d).lambda$pushToTranslate$22((TranslateController.PendingTranslation) this.f19734e, (TLObject) this.f19735f, this.f19732b, (TLRPC.TL_error) this.h, j3, (Set) this.f19736n);
                return;
            case 1:
                long j10 = this.f19733c;
                ((MediaDataController) this.d).lambda$broadcastReplyMessages$179((ArrayList) this.f19734e, this.f19732b, (ArrayList) this.f19735f, (ArrayList) this.h, (a0.i) this.f19736n, j10);
                return;
            default:
                long j11 = this.f19733c;
                ((MemberRequestsController) this.d).lambda$getImporters$0((TLRPC.TL_error) this.h, (TLObject) this.f19735f, (TLRPC.TL_chatInviteImporter) this.f19734e, this.f19732b, j11, (RequestDelegate) this.f19736n);
                return;
        }
    }

    public wk(long j3, MemberRequestsController memberRequestsController, RequestDelegate requestDelegate, TLObject tLObject, TLRPC.TL_chatInviteImporter tL_chatInviteImporter, TLRPC.TL_error tL_error, boolean z10) {
        this.d = memberRequestsController;
        this.h = tL_error;
        this.f19735f = tLObject;
        this.f19734e = tL_chatInviteImporter;
        this.f19732b = z10;
        this.f19733c = j3;
        this.f19736n = requestDelegate;
    }

    public wk(MediaDataController mediaDataController, ArrayList arrayList, boolean z10, ArrayList arrayList2, ArrayList arrayList3, a0.i iVar, long j3) {
        this.d = mediaDataController;
        this.f19734e = arrayList;
        this.f19732b = z10;
        this.f19735f = arrayList2;
        this.h = arrayList3;
        this.f19736n = iVar;
        this.f19733c = j3;
    }
}
