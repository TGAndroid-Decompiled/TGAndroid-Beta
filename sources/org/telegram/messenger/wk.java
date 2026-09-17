package org.telegram.messenger;

import java.util.ArrayList;
import java.util.Set;
import org.telegram.messenger.TranslateController;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class wk implements Runnable {
    public final int f19560a = 0;
    public final boolean f19561b;
    public final long f19562c;
    public final BaseController d;
    public final Object f19563e;
    public final Object f19564f;
    public final Object h;
    public final Object f19565n;

    public wk(long j3, Set set, TranslateController.PendingTranslation pendingTranslation, TranslateController translateController, TLObject tLObject, TLRPC.TL_error tL_error, boolean z10) {
        this.d = translateController;
        this.f19563e = pendingTranslation;
        this.f19564f = tLObject;
        this.f19561b = z10;
        this.h = tL_error;
        this.f19562c = j3;
        this.f19565n = set;
    }

    @Override
    public final void run() {
        switch (this.f19560a) {
            case 0:
                long j3 = this.f19562c;
                ((TranslateController) this.d).lambda$pushToTranslate$22((TranslateController.PendingTranslation) this.f19563e, (TLObject) this.f19564f, this.f19561b, (TLRPC.TL_error) this.h, j3, (Set) this.f19565n);
                return;
            case 1:
                long j10 = this.f19562c;
                ((MediaDataController) this.d).lambda$broadcastReplyMessages$179((ArrayList) this.f19563e, this.f19561b, (ArrayList) this.f19564f, (ArrayList) this.h, (a0.i) this.f19565n, j10);
                return;
            default:
                long j11 = this.f19562c;
                ((MemberRequestsController) this.d).lambda$getImporters$0((TLRPC.TL_error) this.h, (TLObject) this.f19564f, (TLRPC.TL_chatInviteImporter) this.f19563e, this.f19561b, j11, (RequestDelegate) this.f19565n);
                return;
        }
    }

    public wk(long j3, MemberRequestsController memberRequestsController, RequestDelegate requestDelegate, TLObject tLObject, TLRPC.TL_chatInviteImporter tL_chatInviteImporter, TLRPC.TL_error tL_error, boolean z10) {
        this.d = memberRequestsController;
        this.h = tL_error;
        this.f19564f = tLObject;
        this.f19563e = tL_chatInviteImporter;
        this.f19561b = z10;
        this.f19562c = j3;
        this.f19565n = requestDelegate;
    }

    public wk(MediaDataController mediaDataController, ArrayList arrayList, boolean z10, ArrayList arrayList2, ArrayList arrayList3, a0.i iVar, long j3) {
        this.d = mediaDataController;
        this.f19563e = arrayList;
        this.f19561b = z10;
        this.f19564f = arrayList2;
        this.h = arrayList3;
        this.f19565n = iVar;
        this.f19562c = j3;
    }
}
