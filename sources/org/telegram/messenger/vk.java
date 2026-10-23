package org.telegram.messenger;

import java.util.ArrayList;
import java.util.Set;
import org.telegram.messenger.TranslateController;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class vk implements Runnable {
    public final int f19898a = 0;
    public final boolean f19899b;
    public final long f19900c;
    public final BaseController d;
    public final Object e;
    public final Object f19901f;
    public final Object h;
    public final Object f19902n;

    public vk(long j10, Set set, TranslateController.PendingTranslation pendingTranslation, TranslateController translateController, TLObject tLObject, TLRPC.TL_error tL_error, boolean z10) {
        this.d = translateController;
        this.e = pendingTranslation;
        this.f19901f = tLObject;
        this.f19899b = z10;
        this.h = tL_error;
        this.f19900c = j10;
        this.f19902n = set;
    }

    @Override
    public final void run() {
        switch (this.f19898a) {
            case 0:
                long j10 = this.f19900c;
                ((TranslateController) this.d).lambda$pushToTranslate$22((TranslateController.PendingTranslation) this.e, (TLObject) this.f19901f, this.f19899b, (TLRPC.TL_error) this.h, j10, (Set) this.f19902n);
                return;
            case 1:
                long j11 = this.f19900c;
                ((MediaDataController) this.d).lambda$broadcastReplyMessages$179((ArrayList) this.e, this.f19899b, (ArrayList) this.f19901f, (ArrayList) this.h, (a0.h) this.f19902n, j11);
                return;
            default:
                long j12 = this.f19900c;
                ((MemberRequestsController) this.d).lambda$getImporters$0((TLRPC.TL_error) this.h, (TLObject) this.f19901f, (TLRPC.TL_chatInviteImporter) this.e, this.f19899b, j12, (RequestDelegate) this.f19902n);
                return;
        }
    }

    public vk(long j10, MemberRequestsController memberRequestsController, RequestDelegate requestDelegate, TLObject tLObject, TLRPC.TL_chatInviteImporter tL_chatInviteImporter, TLRPC.TL_error tL_error, boolean z10) {
        this.d = memberRequestsController;
        this.h = tL_error;
        this.f19901f = tLObject;
        this.e = tL_chatInviteImporter;
        this.f19899b = z10;
        this.f19900c = j10;
        this.f19902n = requestDelegate;
    }

    public vk(MediaDataController mediaDataController, ArrayList arrayList, boolean z10, ArrayList arrayList2, ArrayList arrayList3, a0.h hVar, long j10) {
        this.d = mediaDataController;
        this.e = arrayList;
        this.f19899b = z10;
        this.f19901f = arrayList2;
        this.h = arrayList3;
        this.f19902n = hVar;
        this.f19900c = j10;
    }
}
