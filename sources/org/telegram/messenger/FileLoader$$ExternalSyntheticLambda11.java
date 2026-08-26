package org.telegram.messenger;

import androidx.collection.LongSparseArray;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;

public final class FileLoader$$ExternalSyntheticLambda11 implements Runnable {
    public final int $r8$classId;
    public final Object f$0;
    public final boolean f$1;
    public final Object f$2;

    public FileLoader$$ExternalSyntheticLambda11(Object obj, Object obj2, boolean z, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$2 = obj2;
        this.f$1 = z;
    }

    @Override
    public final void run() throws Throwable {
        switch (this.$r8$classId) {
            case 0:
                ((FileLoader) this.f$0).lambda$cancelFileUpload$2(this.f$1, (String) this.f$2);
                break;
            case 1:
                ((MediaController.AnonymousClass2) this.f$0).lambda$run$1((ByteBuffer) this.f$2, this.f$1);
                break;
            case 2:
                ((ImageLoader) this.f$0).lambda$cancelLoadingForImageReceiver$4(this.f$1, (ImageReceiver) this.f$2);
                break;
            case 3:
                ((MediaDataController) this.f$0).lambda$loadBotKeyboard$196((MessagesStorage.TopicKey) this.f$2, this.f$1);
                break;
            case 4:
                ((MediaDataController) this.f$0).lambda$buildShortcuts$143(this.f$1, (ArrayList) this.f$2);
                break;
            case 5:
                ((MessagesController) this.f$0).lambda$processDialogsUpdate$229((TLRPC.messages_Dialogs) this.f$2, this.f$1);
                break;
            case 6:
                ((MessagesStorage) this.f$0).lambda$updateUserInfo$130((TLRPC.UserFull) this.f$2, this.f$1);
                break;
            case 7:
                ((MessagesStorage) this.f$0).lambda$putCachedPhoneBook$149((HashMap) this.f$2, this.f$1);
                break;
            case 8:
                ((MessagesStorage) this.f$0).lambda$updateEncryptedChatSeq$171((TLRPC.EncryptedChat) this.f$2, this.f$1);
                break;
            case 9:
                ((MessagesStorage) this.f$0).lambda$updateChatInfo$134((TLRPC.ChatFull) this.f$2, this.f$1);
                break;
            default:
                ((MessagesStorage) this.f$0).lambda$deleteEphemeralMessages$206((LongSparseArray) this.f$2, this.f$1);
                break;
        }
    }

    public FileLoader$$ExternalSyntheticLambda11(Object obj, boolean z, Object obj2, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = z;
        this.f$2 = obj2;
    }
}
