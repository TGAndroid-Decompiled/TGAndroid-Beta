package org.telegram.messenger;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.TLRPC;
public final class n6 implements Runnable {
    public final int f18636a;
    public final boolean f18637b;
    public final Object f18638c;
    public final Object d;

    public n6(Object obj, Object obj2, boolean z10, int i10) {
        this.f18636a = i10;
        this.f18638c = obj;
        this.d = obj2;
        this.f18637b = z10;
    }

    @Override
    public final void run() {
        switch (this.f18636a) {
            case 0:
                ((MediaController.AnonymousClass2) this.f18638c).lambda$run$1((ByteBuffer) this.d, this.f18637b);
                return;
            case 1:
                ((FileLoader) this.f18638c).lambda$cancelFileUpload$2(this.f18637b, (String) this.d);
                return;
            case 2:
                ((ImageLoader) this.f18638c).lambda$cancelLoadingForImageReceiver$4(this.f18637b, (ImageReceiver) this.d);
                return;
            case 3:
                ((MediaDataController) this.f18638c).lambda$loadBotKeyboard$197((MessagesStorage.TopicKey) this.d, this.f18637b);
                return;
            case 4:
                ((MediaDataController) this.f18638c).lambda$buildShortcuts$143(this.f18637b, (ArrayList) this.d);
                return;
            case 5:
                ((MessagesController) this.f18638c).lambda$processDialogsUpdate$228((TLRPC.messages_Dialogs) this.d, this.f18637b);
                return;
            case 6:
                ((MessagesStorage) this.f18638c).lambda$updateUserInfo$130((TLRPC.UserFull) this.d, this.f18637b);
                return;
            case 7:
                ((MessagesStorage) this.f18638c).lambda$putCachedPhoneBook$149((HashMap) this.d, this.f18637b);
                return;
            case 8:
                ((MessagesStorage) this.f18638c).lambda$updateEncryptedChatSeq$171((TLRPC.EncryptedChat) this.d, this.f18637b);
                return;
            case 9:
                ((MessagesStorage) this.f18638c).lambda$updateChatInfo$134((TLRPC.ChatFull) this.d, this.f18637b);
                return;
            default:
                ((MessagesStorage) this.f18638c).lambda$deleteEphemeralMessages$206((a0.i) this.d, this.f18637b);
                return;
        }
    }

    public n6(Object obj, boolean z10, Object obj2, int i10) {
        this.f18636a = i10;
        this.f18638c = obj;
        this.f18637b = z10;
        this.d = obj2;
    }
}
