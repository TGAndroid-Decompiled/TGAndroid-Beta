package org.telegram.messenger;

import java.util.ArrayList;
import java.util.Set;
import org.telegram.messenger.TranslateController;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class wk implements Runnable {
    public final int f19736a = 0;
    public final boolean f19737b;
    public final long f19738c;
    public final BaseController d;
    public final Object f19739e;
    public final Object f19740f;
    public final Object h;
    public final Object f19741n;

    public wk(long j3, Set set, TranslateController.PendingTranslation pendingTranslation, TranslateController translateController, TLObject tLObject, TLRPC.TL_error tL_error, boolean z10) {
        this.d = translateController;
        this.f19739e = pendingTranslation;
        this.f19740f = tLObject;
        this.f19737b = z10;
        this.h = tL_error;
        this.f19738c = j3;
        this.f19741n = set;
    }

    @Override
    public final void run() {
        switch (this.f19736a) {
            case 0:
                long j3 = this.f19738c;
                ((TranslateController) this.d).lambda$pushToTranslate$22((TranslateController.PendingTranslation) this.f19739e, (TLObject) this.f19740f, this.f19737b, (TLRPC.TL_error) this.h, j3, (Set) this.f19741n);
                return;
            case 1:
                long j10 = this.f19738c;
                ((MediaDataController) this.d).lambda$broadcastReplyMessages$179((ArrayList) this.f19739e, this.f19737b, (ArrayList) this.f19740f, (ArrayList) this.h, (a0.i) this.f19741n, j10);
                return;
            default:
                long j11 = this.f19738c;
                ((MemberRequestsController) this.d).lambda$getImporters$0((TLRPC.TL_error) this.h, (TLObject) this.f19740f, (TLRPC.TL_chatInviteImporter) this.f19739e, this.f19737b, j11, (RequestDelegate) this.f19741n);
                return;
        }
    }

    public wk(long j3, MemberRequestsController memberRequestsController, RequestDelegate requestDelegate, TLObject tLObject, TLRPC.TL_chatInviteImporter tL_chatInviteImporter, TLRPC.TL_error tL_error, boolean z10) {
        this.d = memberRequestsController;
        this.h = tL_error;
        this.f19740f = tLObject;
        this.f19739e = tL_chatInviteImporter;
        this.f19737b = z10;
        this.f19738c = j3;
        this.f19741n = requestDelegate;
    }

    public wk(MediaDataController mediaDataController, ArrayList arrayList, boolean z10, ArrayList arrayList2, ArrayList arrayList3, a0.i iVar, long j3) {
        this.d = mediaDataController;
        this.f19739e = arrayList;
        this.f19737b = z10;
        this.f19740f = arrayList2;
        this.h = arrayList3;
        this.f19741n = iVar;
        this.f19738c = j3;
    }
}
