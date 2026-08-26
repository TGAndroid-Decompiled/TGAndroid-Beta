package org.telegram.messenger;

import androidx.collection.LongSparseArray;
import java.util.ArrayList;
import java.util.Set;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

public final class TranslateController$$ExternalSyntheticLambda2 implements Runnable {
    public final int $r8$classId = 0;
    public final BaseController f$0;
    public final Object f$1;
    public final Object f$2;
    public final boolean f$3;
    public final Object f$4;
    public final long f$5;
    public final Object f$6;

    public TranslateController$$ExternalSyntheticLambda2(long j, Set set, TranslateController.PendingTranslation pendingTranslation, TranslateController translateController, TLObject tLObject, TLRPC.TL_error tL_error, boolean z) {
        this.f$0 = translateController;
        this.f$1 = pendingTranslation;
        this.f$2 = tLObject;
        this.f$3 = z;
        this.f$4 = tL_error;
        this.f$5 = j;
        this.f$6 = set;
    }

    @Override
    public final void run() throws Throwable {
        switch (this.$r8$classId) {
            case 0:
                ((TranslateController) this.f$0).lambda$pushToTranslate$22((TranslateController.PendingTranslation) this.f$1, (TLObject) this.f$2, this.f$3, (TLRPC.TL_error) this.f$4, this.f$5, (Set) this.f$6);
                break;
            case 1:
                ((MediaDataController) this.f$0).lambda$broadcastReplyMessages$179((ArrayList) this.f$1, this.f$3, (ArrayList) this.f$2, (ArrayList) this.f$4, (LongSparseArray) this.f$6, this.f$5);
                break;
            default:
                ((MemberRequestsController) this.f$0).lambda$getImporters$0((TLRPC.TL_error) this.f$4, (TLObject) this.f$2, (TLRPC.TL_chatInviteImporter) this.f$1, this.f$3, this.f$5, (RequestDelegate) this.f$6);
                break;
        }
    }

    public TranslateController$$ExternalSyntheticLambda2(long j, MemberRequestsController memberRequestsController, RequestDelegate requestDelegate, TLObject tLObject, TLRPC.TL_chatInviteImporter tL_chatInviteImporter, TLRPC.TL_error tL_error, boolean z) {
        this.f$0 = memberRequestsController;
        this.f$4 = tL_error;
        this.f$2 = tLObject;
        this.f$1 = tL_chatInviteImporter;
        this.f$3 = z;
        this.f$5 = j;
        this.f$6 = requestDelegate;
    }

    public TranslateController$$ExternalSyntheticLambda2(MediaDataController mediaDataController, ArrayList arrayList, boolean z, ArrayList arrayList2, ArrayList arrayList3, LongSparseArray longSparseArray, long j) {
        this.f$0 = mediaDataController;
        this.f$1 = arrayList;
        this.f$3 = z;
        this.f$2 = arrayList2;
        this.f$4 = arrayList3;
        this.f$6 = longSparseArray;
        this.f$5 = j;
    }
}
