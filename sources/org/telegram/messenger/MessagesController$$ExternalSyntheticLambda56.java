package org.telegram.messenger;

import androidx.collection.LongSparseArray;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

public final class MessagesController$$ExternalSyntheticLambda56 implements Runnable {
    public final int $r8$classId;
    public final MessagesController f$0;
    public final int f$1;
    public final ArrayList f$2;
    public final boolean f$3;
    public final TLRPC.TL_messages_peerDialogs f$4;
    public final LongSparseArray f$5;
    public final TLRPC.TL_messages_dialogs f$6;

    public MessagesController$$ExternalSyntheticLambda56(MessagesController messagesController, int i, ArrayList arrayList, boolean z, TLRPC.TL_messages_peerDialogs tL_messages_peerDialogs, LongSparseArray longSparseArray, TLRPC.TL_messages_dialogs tL_messages_dialogs, int i2) {
        this.$r8$classId = i2;
        this.f$0 = messagesController;
        this.f$1 = i;
        this.f$2 = arrayList;
        this.f$3 = z;
        this.f$4 = tL_messages_peerDialogs;
        this.f$5 = longSparseArray;
        this.f$6 = tL_messages_dialogs;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$loadPinnedDialogs$365(this.f$1, this.f$2, this.f$3, this.f$4, this.f$5, this.f$6);
                break;
            default:
                LongSparseArray longSparseArray = this.f$5;
                TLRPC.TL_messages_dialogs tL_messages_dialogs = this.f$6;
                this.f$0.lambda$loadPinnedDialogs$366(this.f$1, this.f$2, this.f$3, this.f$4, longSparseArray, tL_messages_dialogs);
                break;
        }
    }
}
