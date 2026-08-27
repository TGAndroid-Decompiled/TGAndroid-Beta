package org.telegram.messenger;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;

public final class n6 implements Runnable {

    public final int f21041a;

    public final boolean f21042b;

    public final Object f21043c;
    public final Object d;

    public n6(Object obj, Object obj2, boolean z10, int i10) {
        this.f21041a = i10;
        this.f21043c = obj;
        this.d = obj2;
        this.f21042b = z10;
    }

    @Override
    public final void run() throws Throwable {
        switch (this.f21041a) {
            case 0:
                ((MediaController.AnonymousClass2) this.f21043c).lambda$run$1((ByteBuffer) this.d, this.f21042b);
                break;
            case 1:
                ((FileLoader) this.f21043c).lambda$cancelFileUpload$2(this.f21042b, (String) this.d);
                break;
            case 2:
                ((ImageLoader) this.f21043c).lambda$cancelLoadingForImageReceiver$4(this.f21042b, (ImageReceiver) this.d);
                break;
            case 3:
                ((MediaDataController) this.f21043c).lambda$loadBotKeyboard$196((MessagesStorage.TopicKey) this.d, this.f21042b);
                break;
            case 4:
                ((MediaDataController) this.f21043c).lambda$buildShortcuts$143(this.f21042b, (ArrayList) this.d);
                break;
            case 5:
                ((MessagesController) this.f21043c).lambda$processDialogsUpdate$229((TLRPC.messages_Dialogs) this.d, this.f21042b);
                break;
            case 6:
                ((MessagesStorage) this.f21043c).lambda$updateUserInfo$130((TLRPC.UserFull) this.d, this.f21042b);
                break;
            case 7:
                ((MessagesStorage) this.f21043c).lambda$putCachedPhoneBook$149((HashMap) this.d, this.f21042b);
                break;
            case 8:
                ((MessagesStorage) this.f21043c).lambda$updateEncryptedChatSeq$171((TLRPC.EncryptedChat) this.d, this.f21042b);
                break;
            case 9:
                ((MessagesStorage) this.f21043c).lambda$updateChatInfo$134((TLRPC.ChatFull) this.d, this.f21042b);
                break;
            default:
                ((MessagesStorage) this.f21043c).lambda$deleteEphemeralMessages$206((a0.h) this.d, this.f21042b);
                break;
        }
    }

    public n6(Object obj, boolean z10, Object obj2, int i10) {
        this.f21041a = i10;
        this.f21043c = obj;
        this.f21042b = z10;
        this.d = obj2;
    }
}
