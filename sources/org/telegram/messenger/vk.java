package org.telegram.messenger;

import java.util.ArrayList;
import java.util.Set;
import org.telegram.messenger.TranslateController;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class vk implements Runnable {
    public final int f21911a = 0;
    public final boolean f21912b;
    public final long f21913c;
    public final BaseController d;
    public final Object f21914e;
    public final Object f21915f;
    public final Object h;
    public final Object f21916n;

    public vk(long j10, Set set, TranslateController.PendingTranslation pendingTranslation, TranslateController translateController, TLObject tLObject, TLRPC.TL_error tL_error, boolean z10) {
        this.d = translateController;
        this.f21914e = pendingTranslation;
        this.f21915f = tLObject;
        this.f21912b = z10;
        this.h = tL_error;
        this.f21913c = j10;
        this.f21916n = set;
    }

    @Override
    public final void run() {
        switch (this.f21911a) {
            case 0:
                long j10 = this.f21913c;
                ((TranslateController) this.d).lambda$pushToTranslate$22((TranslateController.PendingTranslation) this.f21914e, (TLObject) this.f21915f, this.f21912b, (TLRPC.TL_error) this.h, j10, (Set) this.f21916n);
                return;
            case 1:
                long j11 = this.f21913c;
                ((MediaDataController) this.d).lambda$broadcastReplyMessages$179((ArrayList) this.f21914e, this.f21912b, (ArrayList) this.f21915f, (ArrayList) this.h, (a0.h) this.f21916n, j11);
                return;
            default:
                long j12 = this.f21913c;
                ((MemberRequestsController) this.d).lambda$getImporters$0((TLRPC.TL_error) this.h, (TLObject) this.f21915f, (TLRPC.TL_chatInviteImporter) this.f21914e, this.f21912b, j12, (RequestDelegate) this.f21916n);
                return;
        }
    }

    public vk(long j10, MemberRequestsController memberRequestsController, RequestDelegate requestDelegate, TLObject tLObject, TLRPC.TL_chatInviteImporter tL_chatInviteImporter, TLRPC.TL_error tL_error, boolean z10) {
        this.d = memberRequestsController;
        this.h = tL_error;
        this.f21915f = tLObject;
        this.f21914e = tL_chatInviteImporter;
        this.f21912b = z10;
        this.f21913c = j10;
        this.f21916n = requestDelegate;
    }

    public vk(MediaDataController mediaDataController, ArrayList arrayList, boolean z10, ArrayList arrayList2, ArrayList arrayList3, a0.h hVar, long j10) {
        this.d = mediaDataController;
        this.f21914e = arrayList;
        this.f21912b = z10;
        this.f21915f = arrayList2;
        this.h = arrayList3;
        this.f21916n = hVar;
        this.f21913c = j10;
    }
}
