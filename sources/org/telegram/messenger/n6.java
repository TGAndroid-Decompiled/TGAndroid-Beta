package org.telegram.messenger;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.TLRPC;
public final class n6 implements Runnable {
    public final int f18600a;
    public final boolean f18601b;
    public final Object f18602c;
    public final Object d;

    public n6(Object obj, Object obj2, boolean z10, int i10) {
        this.f18600a = i10;
        this.f18602c = obj;
        this.d = obj2;
        this.f18601b = z10;
    }

    @Override
    public final void run() {
        switch (this.f18600a) {
            case 0:
                ((MediaController.AnonymousClass2) this.f18602c).lambda$run$1((ByteBuffer) this.d, this.f18601b);
                return;
            case 1:
                ((FileLoader) this.f18602c).lambda$cancelFileUpload$2(this.f18601b, (String) this.d);
                return;
            case 2:
                ((ImageLoader) this.f18602c).lambda$cancelLoadingForImageReceiver$4(this.f18601b, (ImageReceiver) this.d);
                return;
            case 3:
                ((MediaDataController) this.f18602c).lambda$loadBotKeyboard$197((MessagesStorage.TopicKey) this.d, this.f18601b);
                return;
            case 4:
                ((MediaDataController) this.f18602c).lambda$buildShortcuts$143(this.f18601b, (ArrayList) this.d);
                return;
            case 5:
                ((MessagesController) this.f18602c).lambda$processDialogsUpdate$228((TLRPC.messages_Dialogs) this.d, this.f18601b);
                return;
            case 6:
                ((MessagesStorage) this.f18602c).lambda$updateUserInfo$130((TLRPC.UserFull) this.d, this.f18601b);
                return;
            case 7:
                ((MessagesStorage) this.f18602c).lambda$putCachedPhoneBook$149((HashMap) this.d, this.f18601b);
                return;
            case 8:
                ((MessagesStorage) this.f18602c).lambda$updateEncryptedChatSeq$171((TLRPC.EncryptedChat) this.d, this.f18601b);
                return;
            case 9:
                ((MessagesStorage) this.f18602c).lambda$updateChatInfo$134((TLRPC.ChatFull) this.d, this.f18601b);
                return;
            default:
                ((MessagesStorage) this.f18602c).lambda$deleteEphemeralMessages$206((a0.i) this.d, this.f18601b);
                return;
        }
    }

    public n6(Object obj, boolean z10, Object obj2, int i10) {
        this.f18600a = i10;
        this.f18602c = obj;
        this.f18601b = z10;
        this.d = obj2;
    }
}
