package org.telegram.messenger.voip;

import androidx.collection.LongSparseArray;
import java.util.HashMap;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicInteger;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

public final class VoIPService$$ExternalSyntheticLambda111 implements RequestDelegate {
    public final int $r8$classId;
    public final NotificationCenter.NotificationCenterDelegate f$0;
    public final long f$1;
    public final Object f$2;
    public final Object f$3;
    public final int f$4;
    public final String f$5;

    public VoIPService$$ExternalSyntheticLambda111(MessagesController messagesController, HashMap map, String str, LongSparseArray longSparseArray, long j, int i) {
        this.$r8$classId = 2;
        this.f$0 = messagesController;
        this.f$2 = map;
        this.f$5 = str;
        this.f$3 = longSparseArray;
        this.f$1 = j;
        this.f$4 = i;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.$r8$classId) {
            case 0:
                ((VoIPService) this.f$0).lambda$startConferenceGroupCall$43(this.f$1, (HashSet) this.f$2, (AtomicInteger) this.f$3, this.f$4, this.f$5, tLObject, tL_error);
                break;
            case 1:
                ((VoIPService) this.f$0).lambda$startConferenceGroupCall$51(this.f$1, (HashSet) this.f$2, (AtomicInteger) this.f$3, this.f$4, this.f$5, tLObject, tL_error);
                break;
            default:
                ((MessagesController) this.f$0).lambda$reloadWebPages$187((HashMap) this.f$2, this.f$5, (LongSparseArray) this.f$3, this.f$1, this.f$4, tLObject, tL_error);
                break;
        }
    }

    public VoIPService$$ExternalSyntheticLambda111(VoIPService voIPService, long j, HashSet hashSet, AtomicInteger atomicInteger, int i, String str, int i2) {
        this.$r8$classId = i2;
        this.f$0 = voIPService;
        this.f$1 = j;
        this.f$2 = hashSet;
        this.f$3 = atomicInteger;
        this.f$4 = i;
        this.f$5 = str;
    }
}
