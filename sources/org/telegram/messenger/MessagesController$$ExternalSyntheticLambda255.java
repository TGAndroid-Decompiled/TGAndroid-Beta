package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

public final class MessagesController$$ExternalSyntheticLambda255 implements RequestDelegate {
    public final int $r8$classId;
    public final MessagesController f$0;
    public final long f$1;
    public final long f$2;
    public final ArrayList f$3;

    public MessagesController$$ExternalSyntheticLambda255(int i, long j, long j2, ArrayList arrayList, MessagesController messagesController) {
        this.$r8$classId = i;
        this.f$0 = messagesController;
        this.f$1 = j;
        this.f$2 = j2;
        this.f$3 = arrayList;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$checkUnreadPollVotesInternal2$430(this.f$1, this.f$2, this.f$3, tLObject, tL_error);
                break;
            case 1:
                this.f$0.lambda$checkUnreadPollVotesInternal2$432(this.f$1, this.f$2, this.f$3, tLObject, tL_error);
                break;
            case 2:
                this.f$0.lambda$checkUnreadPollVotesInternal2$434(this.f$1, this.f$2, this.f$3, tLObject, tL_error);
                break;
            case 3:
                this.f$0.lambda$checkUnreadReactionsInternal2$423(this.f$1, this.f$2, this.f$3, tLObject, tL_error);
                break;
            case 4:
                this.f$0.lambda$checkUnreadReactionsInternal2$425(this.f$1, this.f$2, this.f$3, tLObject, tL_error);
                break;
            default:
                this.f$0.lambda$checkUnreadReactionsInternal2$427(this.f$1, this.f$2, this.f$3, tLObject, tL_error);
                break;
        }
    }
}
