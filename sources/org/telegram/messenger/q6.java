package org.telegram.messenger;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.TLRPC;
public final class q6 implements Runnable {
    public final int f18170a;
    public final boolean f18171b;
    public final Object f18172c;
    public final Object d;

    public q6(Object obj, Object obj2, boolean z4, int i10) {
        this.f18170a = i10;
        this.f18172c = obj;
        this.d = obj2;
        this.f18171b = z4;
    }

    @Override
    public final void run() {
        switch (this.f18170a) {
            case 0:
                ((MediaController.AnonymousClass2) this.f18172c).lambda$run$1((ByteBuffer) this.d, this.f18171b);
                return;
            case 1:
                ((FileLoader) this.f18172c).lambda$cancelFileUpload$2(this.f18171b, (String) this.d);
                return;
            case 2:
                ((ImageLoader) this.f18172c).lambda$cancelLoadingForImageReceiver$4(this.f18171b, (ImageReceiver) this.d);
                return;
            case 3:
                ((MediaDataController) this.f18172c).lambda$loadBotKeyboard$196((MessagesStorage.TopicKey) this.d, this.f18171b);
                return;
            case 4:
                ((MediaDataController) this.f18172c).lambda$buildShortcuts$143(this.f18171b, (ArrayList) this.d);
                return;
            case 5:
                ((MessagesController) this.f18172c).lambda$processDialogsUpdate$229((TLRPC.messages_Dialogs) this.d, this.f18171b);
                return;
            case 6:
                ((MessagesStorage) this.f18172c).lambda$updateUserInfo$130((TLRPC.UserFull) this.d, this.f18171b);
                return;
            case 7:
                ((MessagesStorage) this.f18172c).lambda$putCachedPhoneBook$149((HashMap) this.d, this.f18171b);
                return;
            case 8:
                ((MessagesStorage) this.f18172c).lambda$updateEncryptedChatSeq$171((TLRPC.EncryptedChat) this.d, this.f18171b);
                return;
            case 9:
                ((MessagesStorage) this.f18172c).lambda$updateChatInfo$134((TLRPC.ChatFull) this.d, this.f18171b);
                return;
            default:
                ((MessagesStorage) this.f18172c).lambda$deleteEphemeralMessages$206((a0.h) this.d, this.f18171b);
                return;
        }
    }

    public q6(Object obj, boolean z4, Object obj2, int i10) {
        this.f18170a = i10;
        this.f18172c = obj;
        this.f18171b = z4;
        this.d = obj2;
    }
}
