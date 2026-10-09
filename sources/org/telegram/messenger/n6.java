package org.telegram.messenger;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.TLRPC;
public final class n6 implements Runnable {
    public final int f18592a;
    public final boolean f18593b;
    public final Object f18594c;
    public final Object d;

    public n6(Object obj, Object obj2, boolean z10, int i10) {
        this.f18592a = i10;
        this.f18594c = obj;
        this.d = obj2;
        this.f18593b = z10;
    }

    @Override
    public final void run() {
        switch (this.f18592a) {
            case 0:
                ((MediaController.AnonymousClass2) this.f18594c).lambda$run$1((ByteBuffer) this.d, this.f18593b);
                return;
            case 1:
                ((FileLoader) this.f18594c).lambda$cancelFileUpload$2(this.f18593b, (String) this.d);
                return;
            case 2:
                ((ImageLoader) this.f18594c).lambda$cancelLoadingForImageReceiver$4(this.f18593b, (ImageReceiver) this.d);
                return;
            case 3:
                ((MediaDataController) this.f18594c).lambda$loadBotKeyboard$197((MessagesStorage.TopicKey) this.d, this.f18593b);
                return;
            case 4:
                ((MediaDataController) this.f18594c).lambda$buildShortcuts$143(this.f18593b, (ArrayList) this.d);
                return;
            case 5:
                ((MessagesController) this.f18594c).lambda$processDialogsUpdate$228((TLRPC.messages_Dialogs) this.d, this.f18593b);
                return;
            case 6:
                ((MessagesStorage) this.f18594c).lambda$updateUserInfo$130((TLRPC.UserFull) this.d, this.f18593b);
                return;
            case 7:
                ((MessagesStorage) this.f18594c).lambda$putCachedPhoneBook$149((HashMap) this.d, this.f18593b);
                return;
            case 8:
                ((MessagesStorage) this.f18594c).lambda$updateEncryptedChatSeq$171((TLRPC.EncryptedChat) this.d, this.f18593b);
                return;
            case 9:
                ((MessagesStorage) this.f18594c).lambda$updateChatInfo$134((TLRPC.ChatFull) this.d, this.f18593b);
                return;
            default:
                ((MessagesStorage) this.f18594c).lambda$deleteEphemeralMessages$206((a0.i) this.d, this.f18593b);
                return;
        }
    }

    public n6(Object obj, boolean z10, Object obj2, int i10) {
        this.f18592a = i10;
        this.f18594c = obj;
        this.f18593b = z10;
        this.d = obj2;
    }
}
