package org.telegram.messenger;

import java.util.ArrayList;
import java.util.Set;
import org.telegram.messenger.TranslateController;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class uk implements Runnable {
    public final int f19684a = 0;
    public final boolean f19685b;
    public final long f19686c;
    public final BaseController d;
    public final Object e;
    public final Object f19687f;
    public final Object h;
    public final Object f19688n;

    public uk(long j10, Set set, TranslateController.PendingTranslation pendingTranslation, TranslateController translateController, TLObject tLObject, TLRPC.TL_error tL_error, boolean z10) {
        this.d = translateController;
        this.e = pendingTranslation;
        this.f19687f = tLObject;
        this.f19685b = z10;
        this.h = tL_error;
        this.f19686c = j10;
        this.f19688n = set;
    }

    @Override
    public final void run() {
        switch (this.f19684a) {
            case 0:
                long j10 = this.f19686c;
                ((TranslateController) this.d).lambda$pushToTranslate$22((TranslateController.PendingTranslation) this.e, (TLObject) this.f19687f, this.f19685b, (TLRPC.TL_error) this.h, j10, (Set) this.f19688n);
                return;
            case 1:
                long j11 = this.f19686c;
                ((MediaDataController) this.d).lambda$broadcastReplyMessages$179((ArrayList) this.e, this.f19685b, (ArrayList) this.f19687f, (ArrayList) this.h, (a0.h) this.f19688n, j11);
                return;
            default:
                long j12 = this.f19686c;
                ((MemberRequestsController) this.d).lambda$getImporters$0((TLRPC.TL_error) this.h, (TLObject) this.f19687f, (TLRPC.TL_chatInviteImporter) this.e, this.f19685b, j12, (RequestDelegate) this.f19688n);
                return;
        }
    }

    public uk(long j10, MemberRequestsController memberRequestsController, RequestDelegate requestDelegate, TLObject tLObject, TLRPC.TL_chatInviteImporter tL_chatInviteImporter, TLRPC.TL_error tL_error, boolean z10) {
        this.d = memberRequestsController;
        this.h = tL_error;
        this.f19687f = tLObject;
        this.e = tL_chatInviteImporter;
        this.f19685b = z10;
        this.f19686c = j10;
        this.f19688n = requestDelegate;
    }

    public uk(MediaDataController mediaDataController, ArrayList arrayList, boolean z10, ArrayList arrayList2, ArrayList arrayList3, a0.h hVar, long j10) {
        this.d = mediaDataController;
        this.e = arrayList;
        this.f19685b = z10;
        this.f19687f = arrayList2;
        this.h = arrayList3;
        this.f19688n = hVar;
        this.f19686c = j10;
    }
}
