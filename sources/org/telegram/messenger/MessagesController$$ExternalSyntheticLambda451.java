package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

public final class MessagesController$$ExternalSyntheticLambda451 implements RequestDelegate {
    public final int $r8$classId;
    public final MessagesController f$0;
    public final int f$1;
    public final int f$10;
    public final int f$11;
    public final int f$12;
    public final long f$13;
    public final int f$14;
    public final boolean f$15;
    public final int f$16;
    public final boolean f$17;
    public final boolean f$18;
    public final TLObject f$19;
    public final int f$2;
    public final int f$3;
    public final int f$4;
    public final int f$5;
    public final long f$6;
    public final long f$7;
    public final int f$8;
    public final int f$9;

    public MessagesController$$ExternalSyntheticLambda451(MessagesController messagesController, int i, int i2, int i3, int i4, int i5, long j, long j2, int i6, int i7, int i8, int i9, int i10, long j3, int i11, boolean z, int i12, boolean z2, boolean z3, TLRPC.TL_messages_getReplies tL_messages_getReplies) {
        this.$r8$classId = 0;
        this.f$0 = messagesController;
        this.f$1 = i;
        this.f$2 = i2;
        this.f$3 = i3;
        this.f$4 = i4;
        this.f$5 = i5;
        this.f$6 = j;
        this.f$7 = j2;
        this.f$8 = i6;
        this.f$9 = i7;
        this.f$10 = i8;
        this.f$11 = i9;
        this.f$12 = i10;
        this.f$13 = j3;
        this.f$14 = i11;
        this.f$15 = z;
        this.f$16 = i12;
        this.f$17 = z2;
        this.f$18 = z3;
        this.f$19 = tL_messages_getReplies;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.$r8$classId) {
            case 0:
                TLRPC.TL_messages_getReplies tL_messages_getReplies = (TLRPC.TL_messages_getReplies) this.f$19;
                this.f$0.lambda$loadMessagesInternal$180(this.f$1, this.f$2, this.f$3, this.f$4, this.f$5, this.f$6, this.f$7, this.f$8, this.f$9, this.f$10, this.f$11, this.f$12, this.f$13, this.f$14, this.f$15, this.f$16, this.f$17, this.f$18, tL_messages_getReplies, tLObject, tL_error);
                break;
            case 1:
                TLRPC.TL_messages_getSavedHistory tL_messages_getSavedHistory = (TLRPC.TL_messages_getSavedHistory) this.f$19;
                this.f$0.lambda$loadMessagesInternal$178(this.f$6, this.f$1, this.f$2, this.f$3, this.f$7, this.f$4, this.f$5, this.f$8, this.f$9, this.f$10, this.f$11, this.f$12, this.f$13, this.f$14, this.f$15, this.f$16, this.f$17, this.f$18, tL_messages_getSavedHistory, tLObject, tL_error);
                break;
            default:
                TLRPC.TL_messages_getHistory tL_messages_getHistory = (TLRPC.TL_messages_getHistory) this.f$19;
                this.f$0.lambda$loadMessagesInternal$185(this.f$6, this.f$1, this.f$2, this.f$3, this.f$7, this.f$4, this.f$5, this.f$8, this.f$9, this.f$10, this.f$11, this.f$12, this.f$13, this.f$14, this.f$15, this.f$16, this.f$17, this.f$18, tL_messages_getHistory, tLObject, tL_error);
                break;
        }
    }

    public MessagesController$$ExternalSyntheticLambda451(MessagesController messagesController, long j, int i, int i2, int i3, long j2, int i4, int i5, int i6, int i7, int i8, int i9, int i10, long j3, int i11, boolean z, int i12, boolean z2, boolean z3, TLObject tLObject, int i13) {
        this.$r8$classId = i13;
        this.f$0 = messagesController;
        this.f$6 = j;
        this.f$1 = i;
        this.f$2 = i2;
        this.f$3 = i3;
        this.f$7 = j2;
        this.f$4 = i4;
        this.f$5 = i5;
        this.f$8 = i6;
        this.f$9 = i7;
        this.f$10 = i8;
        this.f$11 = i9;
        this.f$12 = i10;
        this.f$13 = j3;
        this.f$14 = i11;
        this.f$15 = z;
        this.f$16 = i12;
        this.f$17 = z2;
        this.f$18 = z3;
        this.f$19 = tLObject;
    }
}
