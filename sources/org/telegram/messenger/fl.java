package org.telegram.messenger;

import java.util.ArrayList;
import java.util.Set;
import org.telegram.messenger.TranslateController;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class fl implements Runnable {
    public final int f15219a = 0;
    public final boolean f15220b;
    public final long f15221c;
    public final BaseController d;
    public final Object e;
    public final Object f15222f;
    public final Object h;
    public final Object f15223n;

    public fl(long j3, Set set, TranslateController.PendingTranslation pendingTranslation, TranslateController translateController, TLObject tLObject, TLRPC.TL_error tL_error, boolean z10) {
        this.d = translateController;
        this.e = pendingTranslation;
        this.f15222f = tLObject;
        this.f15220b = z10;
        this.h = tL_error;
        this.f15221c = j3;
        this.f15223n = set;
    }

    @Override
    public final void run() {
        switch (this.f15219a) {
            case 0:
                long j3 = this.f15221c;
                ((TranslateController) this.d).lambda$pushToTranslate$22((TranslateController.PendingTranslation) this.e, (TLObject) this.f15222f, this.f15220b, (TLRPC.TL_error) this.h, j3, (Set) this.f15223n);
                return;
            case 1:
                long j10 = this.f15221c;
                ((MediaDataController) this.d).lambda$broadcastReplyMessages$179((ArrayList) this.e, this.f15220b, (ArrayList) this.f15222f, (ArrayList) this.h, (a0.i) this.f15223n, j10);
                return;
            default:
                long j11 = this.f15221c;
                ((MemberRequestsController) this.d).lambda$getImporters$0((TLRPC.TL_error) this.h, (TLObject) this.f15222f, (TLRPC.TL_chatInviteImporter) this.e, this.f15220b, j11, (RequestDelegate) this.f15223n);
                return;
        }
    }

    public fl(long j3, MemberRequestsController memberRequestsController, RequestDelegate requestDelegate, TLObject tLObject, TLRPC.TL_chatInviteImporter tL_chatInviteImporter, TLRPC.TL_error tL_error, boolean z10) {
        this.d = memberRequestsController;
        this.h = tL_error;
        this.f15222f = tLObject;
        this.e = tL_chatInviteImporter;
        this.f15220b = z10;
        this.f15221c = j3;
        this.f15223n = requestDelegate;
    }

    public fl(MediaDataController mediaDataController, ArrayList arrayList, boolean z10, ArrayList arrayList2, ArrayList arrayList3, a0.i iVar, long j3) {
        this.d = mediaDataController;
        this.e = arrayList;
        this.f15220b = z10;
        this.f15222f = arrayList2;
        this.h = arrayList3;
        this.f15223n = iVar;
        this.f15221c = j3;
    }
}
