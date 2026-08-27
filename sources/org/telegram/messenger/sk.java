package org.telegram.messenger;

import java.util.ArrayList;
import java.util.Set;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

public final class sk implements Runnable {

    public final int f21576a = 0;

    public final boolean f21577b;

    public final long f21578c;
    public final BaseController d;

    public final Object f21579e;

    public final Object f21580f;
    public final Object h;

    public final Object f21581n;

    public sk(long j10, Set set, TranslateController.PendingTranslation pendingTranslation, TranslateController translateController, TLObject tLObject, TLRPC.TL_error tL_error, boolean z10) {
        this.d = translateController;
        this.f21579e = pendingTranslation;
        this.f21580f = tLObject;
        this.f21577b = z10;
        this.h = tL_error;
        this.f21578c = j10;
        this.f21581n = set;
    }

    @Override
    public final void run() throws Throwable {
        switch (this.f21576a) {
            case 0:
                TranslateController translateController = (TranslateController) this.d;
                TranslateController.PendingTranslation pendingTranslation = (TranslateController.PendingTranslation) this.f21579e;
                TLObject tLObject = (TLObject) this.f21580f;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.h;
                Set set = (Set) this.f21581n;
                translateController.lambda$pushToTranslate$22(pendingTranslation, tLObject, this.f21577b, tL_error, this.f21578c, set);
                break;
            case 1:
                ((MediaDataController) this.d).lambda$broadcastReplyMessages$179((ArrayList) this.f21579e, this.f21577b, (ArrayList) this.f21580f, (ArrayList) this.h, (a0.h) this.f21581n, this.f21578c);
                break;
            default:
                MemberRequestsController memberRequestsController = (MemberRequestsController) this.d;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.h;
                TLObject tLObject2 = (TLObject) this.f21580f;
                TLRPC.TL_chatInviteImporter tL_chatInviteImporter = (TLRPC.TL_chatInviteImporter) this.f21579e;
                RequestDelegate requestDelegate = (RequestDelegate) this.f21581n;
                memberRequestsController.lambda$getImporters$0(tL_error2, tLObject2, tL_chatInviteImporter, this.f21577b, this.f21578c, requestDelegate);
                break;
        }
    }

    public sk(long j10, MemberRequestsController memberRequestsController, RequestDelegate requestDelegate, TLObject tLObject, TLRPC.TL_chatInviteImporter tL_chatInviteImporter, TLRPC.TL_error tL_error, boolean z10) {
        this.d = memberRequestsController;
        this.h = tL_error;
        this.f21580f = tLObject;
        this.f21579e = tL_chatInviteImporter;
        this.f21577b = z10;
        this.f21578c = j10;
        this.f21581n = requestDelegate;
    }

    public sk(MediaDataController mediaDataController, ArrayList arrayList, boolean z10, ArrayList arrayList2, ArrayList arrayList3, a0.h hVar, long j10) {
        this.d = mediaDataController;
        this.f21579e = arrayList;
        this.f21577b = z10;
        this.f21580f = arrayList2;
        this.h = arrayList3;
        this.f21581n = hVar;
        this.f21578c = j10;
    }
}
