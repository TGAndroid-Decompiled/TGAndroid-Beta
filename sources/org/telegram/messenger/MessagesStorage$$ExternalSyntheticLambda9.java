package org.telegram.messenger;

import java.util.ArrayList;

public final class MessagesStorage$$ExternalSyntheticLambda9 implements Runnable {
    public final int $r8$classId;
    public final MessagesStorage f$0;
    public final long f$1;
    public final ArrayList f$2;

    public MessagesStorage$$ExternalSyntheticLambda9(MessagesStorage messagesStorage, long j, ArrayList arrayList, int i) {
        this.$r8$classId = i;
        this.f$0 = messagesStorage;
        this.f$1 = j;
        this.f$2 = arrayList;
    }

    @Override
    public final void run() throws Throwable {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$createTaskForSecretChat$117(this.f$1, this.f$2);
                break;
            case 1:
                this.f$0.lambda$deleteUserChatHistory$86(this.f$2, this.f$1);
                break;
            case 2:
                this.f$0.lambda$emptyMessagesMedia$99(this.f$2, this.f$1);
                break;
            case 3:
                this.f$0.lambda$deleteSavedDialog$54(this.f$1, this.f$2);
                break;
            case 4:
                this.f$0.lambda$updateChannelUsers$125(this.f$1, this.f$2);
                break;
            case 5:
                this.f$0.lambda$markVoiceMessageContentAsRead$217(this.f$2, this.f$1);
                break;
            case 6:
                this.f$0.lambda$markMessagesAsDeletedInternal$226(this.f$2, this.f$1);
                break;
            default:
                this.f$0.lambda$removeTopics$58(this.f$2, this.f$1);
                break;
        }
    }

    public MessagesStorage$$ExternalSyntheticLambda9(MessagesStorage messagesStorage, ArrayList arrayList, long j, int i) {
        this.$r8$classId = i;
        this.f$0 = messagesStorage;
        this.f$2 = arrayList;
        this.f$1 = j;
    }
}
