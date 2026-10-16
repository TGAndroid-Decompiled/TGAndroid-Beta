package org.telegram.messenger;

import java.util.ArrayList;
import java.util.Set;
import org.telegram.messenger.TranslateController;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class bl implements Runnable {
    public final int f16602a = 0;
    public final boolean f16603b;
    public final long f16604c;
    public final BaseController d;
    public final Object e;
    public final Object f16605f;
    public final Object h;
    public final Object f16606n;

    public bl(long j10, Set set, TranslateController.PendingTranslation pendingTranslation, TranslateController translateController, TLObject tLObject, TLRPC.TL_error tL_error, boolean z10) {
        this.d = translateController;
        this.e = pendingTranslation;
        this.f16605f = tLObject;
        this.f16603b = z10;
        this.h = tL_error;
        this.f16604c = j10;
        this.f16606n = set;
    }

    @Override
    public final void run() {
        switch (this.f16602a) {
            case 0:
                long j10 = this.f16604c;
                ((TranslateController) this.d).lambda$pushToTranslate$22((TranslateController.PendingTranslation) this.e, (TLObject) this.f16605f, this.f16603b, (TLRPC.TL_error) this.h, j10, (Set) this.f16606n);
                return;
            case 1:
                long j11 = this.f16604c;
                ((MediaDataController) this.d).lambda$broadcastReplyMessages$179((ArrayList) this.e, this.f16603b, (ArrayList) this.f16605f, (ArrayList) this.h, (a0.h) this.f16606n, j11);
                return;
            default:
                long j12 = this.f16604c;
                ((MemberRequestsController) this.d).lambda$getImporters$0((TLRPC.TL_error) this.h, (TLObject) this.f16605f, (TLRPC.TL_chatInviteImporter) this.e, this.f16603b, j12, (RequestDelegate) this.f16606n);
                return;
        }
    }

    public bl(long j10, MemberRequestsController memberRequestsController, RequestDelegate requestDelegate, TLObject tLObject, TLRPC.TL_chatInviteImporter tL_chatInviteImporter, TLRPC.TL_error tL_error, boolean z10) {
        this.d = memberRequestsController;
        this.h = tL_error;
        this.f16605f = tLObject;
        this.e = tL_chatInviteImporter;
        this.f16603b = z10;
        this.f16604c = j10;
        this.f16606n = requestDelegate;
    }

    public bl(MediaDataController mediaDataController, ArrayList arrayList, boolean z10, ArrayList arrayList2, ArrayList arrayList3, a0.h hVar, long j10) {
        this.d = mediaDataController;
        this.e = arrayList;
        this.f16603b = z10;
        this.f16605f = arrayList2;
        this.h = arrayList3;
        this.f16606n = hVar;
        this.f16604c = j10;
    }
}
