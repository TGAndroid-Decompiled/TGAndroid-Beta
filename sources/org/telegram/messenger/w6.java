package org.telegram.messenger;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.TLRPC;
public final class w6 implements Runnable {
    public final int f21722a;
    public final boolean f21723b;
    public final Object f21724c;
    public final Object d;

    public w6(Object obj, Object obj2, boolean z10, int i10) {
        this.f21722a = i10;
        this.f21724c = obj;
        this.d = obj2;
        this.f21723b = z10;
    }

    @Override
    public final void run() {
        switch (this.f21722a) {
            case 0:
                ((MediaController.AnonymousClass2) this.f21724c).lambda$run$1((ByteBuffer) this.d, this.f21723b);
                return;
            case 1:
                ((FileLoader) this.f21724c).lambda$cancelFileUpload$2(this.f21723b, (String) this.d);
                return;
            case 2:
                ((ImageLoader) this.f21724c).lambda$cancelLoadingForImageReceiver$4(this.f21723b, (ImageReceiver) this.d);
                return;
            case 3:
                ((MediaDataController) this.f21724c).lambda$loadBotKeyboard$197((MessagesStorage.TopicKey) this.d, this.f21723b);
                return;
            case 4:
                ((MediaDataController) this.f21724c).lambda$buildShortcuts$143(this.f21723b, (ArrayList) this.d);
                return;
            case 5:
                ((MessagesController) this.f21724c).lambda$processDialogsUpdate$228((TLRPC.messages_Dialogs) this.d, this.f21723b);
                return;
            case 6:
                ((MessagesStorage) this.f21724c).lambda$updateUserInfo$134((TLRPC.UserFull) this.d, this.f21723b);
                return;
            case 7:
                ((MessagesStorage) this.f21724c).lambda$putCachedPhoneBook$153((HashMap) this.d, this.f21723b);
                return;
            case 8:
                ((MessagesStorage) this.f21724c).lambda$updateEncryptedChatSeq$175((TLRPC.EncryptedChat) this.d, this.f21723b);
                return;
            case 9:
                ((MessagesStorage) this.f21724c).lambda$updateChatInfo$138((TLRPC.ChatFull) this.d, this.f21723b);
                return;
            default:
                ((MessagesStorage) this.f21724c).lambda$deleteEphemeralMessages$210((a0.h) this.d, this.f21723b);
                return;
        }
    }

    public w6(Object obj, boolean z10, Object obj2, int i10) {
        this.f21722a = i10;
        this.f21724c = obj;
        this.f21723b = z10;
        this.d = obj2;
    }
}
