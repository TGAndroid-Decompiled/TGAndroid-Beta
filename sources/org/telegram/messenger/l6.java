package org.telegram.messenger;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.TLRPC;
public final class l6 implements Runnable {
    public final int f20846a;
    public final boolean f20847b;
    public final Object f20848c;
    public final Object d;

    public l6(Object obj, Object obj2, boolean z10, int i9) {
        this.f20846a = i9;
        this.f20848c = obj;
        this.d = obj2;
        this.f20847b = z10;
    }

    @Override
    public final void run() {
        switch (this.f20846a) {
            case 0:
                ((MediaController.AnonymousClass2) this.f20848c).lambda$run$1((ByteBuffer) this.d, this.f20847b);
                return;
            case 1:
                ((FileLoader) this.f20848c).lambda$cancelFileUpload$2(this.f20847b, (String) this.d);
                return;
            case 2:
                ((ImageLoader) this.f20848c).lambda$cancelLoadingForImageReceiver$4(this.f20847b, (ImageReceiver) this.d);
                return;
            case 3:
                ((MediaDataController) this.f20848c).lambda$loadBotKeyboard$196((MessagesStorage.TopicKey) this.d, this.f20847b);
                return;
            case 4:
                ((MediaDataController) this.f20848c).lambda$buildShortcuts$143(this.f20847b, (ArrayList) this.d);
                return;
            case 5:
                ((MessagesController) this.f20848c).lambda$processDialogsUpdate$229((TLRPC.messages_Dialogs) this.d, this.f20847b);
                return;
            case 6:
                ((MessagesStorage) this.f20848c).lambda$updateUserInfo$130((TLRPC.UserFull) this.d, this.f20847b);
                return;
            case 7:
                ((MessagesStorage) this.f20848c).lambda$putCachedPhoneBook$149((HashMap) this.d, this.f20847b);
                return;
            case 8:
                ((MessagesStorage) this.f20848c).lambda$updateEncryptedChatSeq$171((TLRPC.EncryptedChat) this.d, this.f20847b);
                return;
            case 9:
                ((MessagesStorage) this.f20848c).lambda$updateChatInfo$134((TLRPC.ChatFull) this.d, this.f20847b);
                return;
            default:
                ((MessagesStorage) this.f20848c).lambda$deleteEphemeralMessages$206((a0.h) this.d, this.f20847b);
                return;
        }
    }

    public l6(Object obj, boolean z10, Object obj2, int i9) {
        this.f20846a = i9;
        this.f20848c = obj;
        this.f20847b = z10;
        this.d = obj2;
    }
}
