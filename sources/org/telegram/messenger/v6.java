package org.telegram.messenger;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.TLRPC;
public final class v6 implements Runnable {
    public final int f21488a;
    public final boolean f21489b;
    public final Object f21490c;
    public final Object d;

    public v6(Object obj, Object obj2, boolean z10, int i10) {
        this.f21488a = i10;
        this.f21490c = obj;
        this.d = obj2;
        this.f21489b = z10;
    }

    @Override
    public final void run() {
        switch (this.f21488a) {
            case 0:
                ((MediaController.AnonymousClass2) this.f21490c).lambda$run$1((ByteBuffer) this.d, this.f21489b);
                return;
            case 1:
                ((FileLoader) this.f21490c).lambda$cancelFileUpload$2(this.f21489b, (String) this.d);
                return;
            case 2:
                ((ImageLoader) this.f21490c).lambda$cancelLoadingForImageReceiver$4(this.f21489b, (ImageReceiver) this.d);
                return;
            case 3:
                ((MediaDataController) this.f21490c).lambda$loadBotKeyboard$197((MessagesStorage.TopicKey) this.d, this.f21489b);
                return;
            case 4:
                ((MediaDataController) this.f21490c).lambda$buildShortcuts$143(this.f21489b, (ArrayList) this.d);
                return;
            case 5:
                ((MessagesController) this.f21490c).lambda$processDialogsUpdate$228((TLRPC.messages_Dialogs) this.d, this.f21489b);
                return;
            case 6:
                ((MessagesStorage) this.f21490c).lambda$updateUserInfo$133((TLRPC.UserFull) this.d, this.f21489b);
                return;
            case 7:
                ((MessagesStorage) this.f21490c).lambda$putCachedPhoneBook$152((HashMap) this.d, this.f21489b);
                return;
            case 8:
                ((MessagesStorage) this.f21490c).lambda$updateEncryptedChatSeq$174((TLRPC.EncryptedChat) this.d, this.f21489b);
                return;
            case 9:
                ((MessagesStorage) this.f21490c).lambda$updateChatInfo$137((TLRPC.ChatFull) this.d, this.f21489b);
                return;
            default:
                ((MessagesStorage) this.f21490c).lambda$deleteEphemeralMessages$209((a0.h) this.d, this.f21489b);
                return;
        }
    }

    public v6(Object obj, boolean z10, Object obj2, int i10) {
        this.f21488a = i10;
        this.f21490c = obj;
        this.f21489b = z10;
        this.d = obj2;
    }
}
