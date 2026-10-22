package org.telegram.messenger;

import java.util.ArrayList;
import java.util.Set;
import org.telegram.messenger.TranslateController;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class xk implements Runnable {
    public final int f20102a = 0;
    public final boolean f20103b;
    public final long f20104c;
    public final BaseController d;
    public final Object e;
    public final Object f20105f;
    public final Object h;
    public final Object f20106n;

    public xk(long j10, Set set, TranslateController.PendingTranslation pendingTranslation, TranslateController translateController, TLObject tLObject, TLRPC.TL_error tL_error, boolean z10) {
        this.d = translateController;
        this.e = pendingTranslation;
        this.f20105f = tLObject;
        this.f20103b = z10;
        this.h = tL_error;
        this.f20104c = j10;
        this.f20106n = set;
    }

    @Override
    public final void run() {
        switch (this.f20102a) {
            case 0:
                long j10 = this.f20104c;
                ((TranslateController) this.d).lambda$pushToTranslate$22((TranslateController.PendingTranslation) this.e, (TLObject) this.f20105f, this.f20103b, (TLRPC.TL_error) this.h, j10, (Set) this.f20106n);
                return;
            case 1:
                long j11 = this.f20104c;
                ((MediaDataController) this.d).lambda$broadcastReplyMessages$179((ArrayList) this.e, this.f20103b, (ArrayList) this.f20105f, (ArrayList) this.h, (a0.h) this.f20106n, j11);
                return;
            default:
                long j12 = this.f20104c;
                ((MemberRequestsController) this.d).lambda$getImporters$0((TLRPC.TL_error) this.h, (TLObject) this.f20105f, (TLRPC.TL_chatInviteImporter) this.e, this.f20103b, j12, (RequestDelegate) this.f20106n);
                return;
        }
    }

    public xk(long j10, MemberRequestsController memberRequestsController, RequestDelegate requestDelegate, TLObject tLObject, TLRPC.TL_chatInviteImporter tL_chatInviteImporter, TLRPC.TL_error tL_error, boolean z10) {
        this.d = memberRequestsController;
        this.h = tL_error;
        this.f20105f = tLObject;
        this.e = tL_chatInviteImporter;
        this.f20103b = z10;
        this.f20104c = j10;
        this.f20106n = requestDelegate;
    }

    public xk(MediaDataController mediaDataController, ArrayList arrayList, boolean z10, ArrayList arrayList2, ArrayList arrayList3, a0.h hVar, long j10) {
        this.d = mediaDataController;
        this.e = arrayList;
        this.f20103b = z10;
        this.f20105f = arrayList2;
        this.h = arrayList3;
        this.f20106n = hVar;
        this.f20104c = j10;
    }
}
