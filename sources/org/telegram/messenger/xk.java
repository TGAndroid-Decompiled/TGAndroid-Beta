package org.telegram.messenger;

import java.util.ArrayList;
import java.util.Set;
import org.telegram.messenger.TranslateController;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class xk implements Runnable {
    public final int f19844a = 0;
    public final boolean f19845b;
    public final long f19846c;
    public final BaseController d;
    public final Object f19847e;
    public final Object f19848f;
    public final Object h;
    public final Object f19849n;

    public xk(long j3, Set set, TranslateController.PendingTranslation pendingTranslation, TranslateController translateController, TLObject tLObject, TLRPC.TL_error tL_error, boolean z10) {
        this.d = translateController;
        this.f19847e = pendingTranslation;
        this.f19848f = tLObject;
        this.f19845b = z10;
        this.h = tL_error;
        this.f19846c = j3;
        this.f19849n = set;
    }

    @Override
    public final void run() {
        switch (this.f19844a) {
            case 0:
                long j3 = this.f19846c;
                ((TranslateController) this.d).lambda$pushToTranslate$22((TranslateController.PendingTranslation) this.f19847e, (TLObject) this.f19848f, this.f19845b, (TLRPC.TL_error) this.h, j3, (Set) this.f19849n);
                return;
            case 1:
                long j10 = this.f19846c;
                ((MediaDataController) this.d).lambda$broadcastReplyMessages$179((ArrayList) this.f19847e, this.f19845b, (ArrayList) this.f19848f, (ArrayList) this.h, (a0.i) this.f19849n, j10);
                return;
            default:
                long j11 = this.f19846c;
                ((MemberRequestsController) this.d).lambda$getImporters$0((TLRPC.TL_error) this.h, (TLObject) this.f19848f, (TLRPC.TL_chatInviteImporter) this.f19847e, this.f19845b, j11, (RequestDelegate) this.f19849n);
                return;
        }
    }

    public xk(long j3, MemberRequestsController memberRequestsController, RequestDelegate requestDelegate, TLObject tLObject, TLRPC.TL_chatInviteImporter tL_chatInviteImporter, TLRPC.TL_error tL_error, boolean z10) {
        this.d = memberRequestsController;
        this.h = tL_error;
        this.f19848f = tLObject;
        this.f19847e = tL_chatInviteImporter;
        this.f19845b = z10;
        this.f19846c = j3;
        this.f19849n = requestDelegate;
    }

    public xk(MediaDataController mediaDataController, ArrayList arrayList, boolean z10, ArrayList arrayList2, ArrayList arrayList3, a0.i iVar, long j3) {
        this.d = mediaDataController;
        this.f19847e = arrayList;
        this.f19845b = z10;
        this.f19848f = arrayList2;
        this.h = arrayList3;
        this.f19849n = iVar;
        this.f19846c = j3;
    }
}
