package org.telegram.messenger;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.TLRPC;
public final class n6 implements Runnable {
    public final int f18596a;
    public final boolean f18597b;
    public final Object f18598c;
    public final Object d;

    public n6(Object obj, Object obj2, boolean z10, int i10) {
        this.f18596a = i10;
        this.f18598c = obj;
        this.d = obj2;
        this.f18597b = z10;
    }

    @Override
    public final void run() {
        switch (this.f18596a) {
            case 0:
                ((MediaController.AnonymousClass2) this.f18598c).lambda$run$1((ByteBuffer) this.d, this.f18597b);
                return;
            case 1:
                ((FileLoader) this.f18598c).lambda$cancelFileUpload$2(this.f18597b, (String) this.d);
                return;
            case 2:
                ((ImageLoader) this.f18598c).lambda$cancelLoadingForImageReceiver$4(this.f18597b, (ImageReceiver) this.d);
                return;
            case 3:
                ((MediaDataController) this.f18598c).lambda$loadBotKeyboard$197((MessagesStorage.TopicKey) this.d, this.f18597b);
                return;
            case 4:
                ((MediaDataController) this.f18598c).lambda$buildShortcuts$143(this.f18597b, (ArrayList) this.d);
                return;
            case 5:
                ((MessagesController) this.f18598c).lambda$processDialogsUpdate$228((TLRPC.messages_Dialogs) this.d, this.f18597b);
                return;
            case 6:
                ((MessagesStorage) this.f18598c).lambda$updateUserInfo$130((TLRPC.UserFull) this.d, this.f18597b);
                return;
            case 7:
                ((MessagesStorage) this.f18598c).lambda$putCachedPhoneBook$149((HashMap) this.d, this.f18597b);
                return;
            case 8:
                ((MessagesStorage) this.f18598c).lambda$updateEncryptedChatSeq$171((TLRPC.EncryptedChat) this.d, this.f18597b);
                return;
            case 9:
                ((MessagesStorage) this.f18598c).lambda$updateChatInfo$134((TLRPC.ChatFull) this.d, this.f18597b);
                return;
            default:
                ((MessagesStorage) this.f18598c).lambda$deleteEphemeralMessages$206((a0.i) this.d, this.f18597b);
                return;
        }
    }

    public n6(Object obj, boolean z10, Object obj2, int i10) {
        this.f18596a = i10;
        this.f18598c = obj;
        this.f18597b = z10;
        this.d = obj2;
    }
}
