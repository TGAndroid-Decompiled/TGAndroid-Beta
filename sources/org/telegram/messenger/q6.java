package org.telegram.messenger;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.TLRPC;
public final class q6 implements Runnable {
    public final int f19328a;
    public final boolean f19329b;
    public final Object f19330c;
    public final Object d;

    public q6(Object obj, Object obj2, boolean z10, int i10) {
        this.f19328a = i10;
        this.f19330c = obj;
        this.d = obj2;
        this.f19329b = z10;
    }

    @Override
    public final void run() {
        switch (this.f19328a) {
            case 0:
                ((MediaController.AnonymousClass2) this.f19330c).lambda$run$1((ByteBuffer) this.d, this.f19329b);
                return;
            case 1:
                ((FileLoader) this.f19330c).lambda$cancelFileUpload$2(this.f19329b, (String) this.d);
                return;
            case 2:
                ((ImageLoader) this.f19330c).lambda$cancelLoadingForImageReceiver$4(this.f19329b, (ImageReceiver) this.d);
                return;
            case 3:
                ((MediaDataController) this.f19330c).lambda$loadBotKeyboard$197((MessagesStorage.TopicKey) this.d, this.f19329b);
                return;
            case 4:
                ((MediaDataController) this.f19330c).lambda$buildShortcuts$143(this.f19329b, (ArrayList) this.d);
                return;
            case 5:
                ((MessagesController) this.f19330c).lambda$processDialogsUpdate$228((TLRPC.messages_Dialogs) this.d, this.f19329b);
                return;
            case 6:
                ((MessagesStorage) this.f19330c).lambda$updateUserInfo$130((TLRPC.UserFull) this.d, this.f19329b);
                return;
            case 7:
                ((MessagesStorage) this.f19330c).lambda$putCachedPhoneBook$149((HashMap) this.d, this.f19329b);
                return;
            case 8:
                ((MessagesStorage) this.f19330c).lambda$updateEncryptedChatSeq$171((TLRPC.EncryptedChat) this.d, this.f19329b);
                return;
            case 9:
                ((MessagesStorage) this.f19330c).lambda$updateChatInfo$134((TLRPC.ChatFull) this.d, this.f19329b);
                return;
            default:
                ((MessagesStorage) this.f19330c).lambda$deleteEphemeralMessages$206((a0.h) this.d, this.f19329b);
                return;
        }
    }

    public q6(Object obj, boolean z10, Object obj2, int i10) {
        this.f19328a = i10;
        this.f19330c = obj;
        this.f19329b = z10;
        this.d = obj2;
    }
}
