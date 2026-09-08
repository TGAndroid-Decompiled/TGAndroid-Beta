package org.telegram.messenger;

import java.util.ArrayList;
import java.util.Set;
import org.telegram.messenger.TranslateController;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class xk implements Runnable {
    public final int f19662a = 0;
    public final boolean f19663b;
    public final long f19664c;
    public final BaseController d;
    public final Object f19665e;
    public final Object f19666f;
    public final Object h;
    public final Object f19667n;

    public xk(long j3, Set set, TranslateController.PendingTranslation pendingTranslation, TranslateController translateController, TLObject tLObject, TLRPC.TL_error tL_error, boolean z10) {
        this.d = translateController;
        this.f19665e = pendingTranslation;
        this.f19666f = tLObject;
        this.f19663b = z10;
        this.h = tL_error;
        this.f19664c = j3;
        this.f19667n = set;
    }

    @Override
    public final void run() {
        switch (this.f19662a) {
            case 0:
                long j3 = this.f19664c;
                ((TranslateController) this.d).lambda$pushToTranslate$22((TranslateController.PendingTranslation) this.f19665e, (TLObject) this.f19666f, this.f19663b, (TLRPC.TL_error) this.h, j3, (Set) this.f19667n);
                return;
            case 1:
                long j10 = this.f19664c;
                ((MediaDataController) this.d).lambda$broadcastReplyMessages$179((ArrayList) this.f19665e, this.f19663b, (ArrayList) this.f19666f, (ArrayList) this.h, (a0.i) this.f19667n, j10);
                return;
            default:
                long j11 = this.f19664c;
                ((MemberRequestsController) this.d).lambda$getImporters$0((TLRPC.TL_error) this.h, (TLObject) this.f19666f, (TLRPC.TL_chatInviteImporter) this.f19665e, this.f19663b, j11, (RequestDelegate) this.f19667n);
                return;
        }
    }

    public xk(long j3, MemberRequestsController memberRequestsController, RequestDelegate requestDelegate, TLObject tLObject, TLRPC.TL_chatInviteImporter tL_chatInviteImporter, TLRPC.TL_error tL_error, boolean z10) {
        this.d = memberRequestsController;
        this.h = tL_error;
        this.f19666f = tLObject;
        this.f19665e = tL_chatInviteImporter;
        this.f19663b = z10;
        this.f19664c = j3;
        this.f19667n = requestDelegate;
    }

    public xk(MediaDataController mediaDataController, ArrayList arrayList, boolean z10, ArrayList arrayList2, ArrayList arrayList3, a0.i iVar, long j3) {
        this.d = mediaDataController;
        this.f19665e = arrayList;
        this.f19663b = z10;
        this.f19666f = arrayList2;
        this.h = arrayList3;
        this.f19667n = iVar;
        this.f19664c = j3;
    }
}
