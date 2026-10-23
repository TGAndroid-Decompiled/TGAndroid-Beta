package org.telegram.messenger;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.TLRPC;
public final class t6 implements Runnable {
    public final int f19583a;
    public final boolean f19584b;
    public final Object f19585c;
    public final Object d;

    public t6(Object obj, Object obj2, boolean z10, int i10) {
        this.f19583a = i10;
        this.f19585c = obj;
        this.d = obj2;
        this.f19584b = z10;
    }

    @Override
    public final void run() {
        switch (this.f19583a) {
            case 0:
                ((MediaController.AnonymousClass2) this.f19585c).lambda$run$1((ByteBuffer) this.d, this.f19584b);
                return;
            case 1:
                ((FileLoader) this.f19585c).lambda$cancelFileUpload$2(this.f19584b, (String) this.d);
                return;
            case 2:
                ((ImageLoader) this.f19585c).lambda$cancelLoadingForImageReceiver$4(this.f19584b, (ImageReceiver) this.d);
                return;
            case 3:
                ((MediaDataController) this.f19585c).lambda$loadBotKeyboard$197((MessagesStorage.TopicKey) this.d, this.f19584b);
                return;
            case 4:
                ((MediaDataController) this.f19585c).lambda$buildShortcuts$143(this.f19584b, (ArrayList) this.d);
                return;
            case 5:
                ((MessagesController) this.f19585c).lambda$processDialogsUpdate$228((TLRPC.messages_Dialogs) this.d, this.f19584b);
                return;
            case 6:
                ((MessagesStorage) this.f19585c).lambda$updateUserInfo$130((TLRPC.UserFull) this.d, this.f19584b);
                return;
            case 7:
                ((MessagesStorage) this.f19585c).lambda$putCachedPhoneBook$149((HashMap) this.d, this.f19584b);
                return;
            case 8:
                ((MessagesStorage) this.f19585c).lambda$updateEncryptedChatSeq$171((TLRPC.EncryptedChat) this.d, this.f19584b);
                return;
            case 9:
                ((MessagesStorage) this.f19585c).lambda$updateChatInfo$134((TLRPC.ChatFull) this.d, this.f19584b);
                return;
            default:
                ((MessagesStorage) this.f19585c).lambda$deleteEphemeralMessages$206((a0.h) this.d, this.f19584b);
                return;
        }
    }

    public t6(Object obj, boolean z10, Object obj2, int i10) {
        this.f19583a = i10;
        this.f19585c = obj;
        this.f19584b = z10;
        this.d = obj2;
    }
}
