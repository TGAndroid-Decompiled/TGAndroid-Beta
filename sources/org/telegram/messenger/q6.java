package org.telegram.messenger;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.TLRPC;
public final class q6 implements Runnable {
    public final int f17868a;
    public final boolean f17869b;
    public final Object f17870c;
    public final Object d;

    public q6(Object obj, Object obj2, boolean z10, int i10) {
        this.f17868a = i10;
        this.f17870c = obj;
        this.d = obj2;
        this.f17869b = z10;
    }

    @Override
    public final void run() {
        switch (this.f17868a) {
            case 0:
                ((MediaController.AnonymousClass2) this.f17870c).lambda$run$1((ByteBuffer) this.d, this.f17869b);
                return;
            case 1:
                ((FileLoader) this.f17870c).lambda$cancelFileUpload$2(this.f17869b, (String) this.d);
                return;
            case 2:
                ((ImageLoader) this.f17870c).lambda$cancelLoadingForImageReceiver$4(this.f17869b, (ImageReceiver) this.d);
                return;
            case 3:
                ((MediaDataController) this.f17870c).lambda$loadBotKeyboard$197((MessagesStorage.TopicKey) this.d, this.f17869b);
                return;
            case 4:
                ((MediaDataController) this.f17870c).lambda$buildShortcuts$143(this.f17869b, (ArrayList) this.d);
                return;
            case 5:
                ((MessagesController) this.f17870c).lambda$processDialogsUpdate$228((TLRPC.messages_Dialogs) this.d, this.f17869b);
                return;
            case 6:
                ((MessagesStorage) this.f17870c).lambda$updateUserInfo$130((TLRPC.UserFull) this.d, this.f17869b);
                return;
            case 7:
                ((MessagesStorage) this.f17870c).lambda$putCachedPhoneBook$149((HashMap) this.d, this.f17869b);
                return;
            case 8:
                ((MessagesStorage) this.f17870c).lambda$updateEncryptedChatSeq$171((TLRPC.EncryptedChat) this.d, this.f17869b);
                return;
            case 9:
                ((MessagesStorage) this.f17870c).lambda$updateChatInfo$134((TLRPC.ChatFull) this.d, this.f17869b);
                return;
            default:
                ((MessagesStorage) this.f17870c).lambda$deleteEphemeralMessages$206((a0.h) this.d, this.f17869b);
                return;
        }
    }

    public q6(Object obj, boolean z10, Object obj2, int i10) {
        this.f17868a = i10;
        this.f17870c = obj;
        this.f17869b = z10;
        this.d = obj2;
    }
}
