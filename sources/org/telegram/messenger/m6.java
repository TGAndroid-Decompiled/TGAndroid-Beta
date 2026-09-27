package org.telegram.messenger;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.TLRPC;
public final class m6 implements Runnable {
    public final int f16982a;
    public final boolean f16983b;
    public final Object f16984c;
    public final Object d;

    public m6(Object obj, Object obj2, boolean z10, int i10) {
        this.f16982a = i10;
        this.f16984c = obj;
        this.d = obj2;
        this.f16983b = z10;
    }

    @Override
    public final void run() {
        switch (this.f16982a) {
            case 0:
                ((MediaController.AnonymousClass2) this.f16984c).lambda$run$1((ByteBuffer) this.d, this.f16983b);
                return;
            case 1:
                ((FileLoader) this.f16984c).lambda$cancelFileUpload$2(this.f16983b, (String) this.d);
                return;
            case 2:
                ((ImageLoader) this.f16984c).lambda$cancelLoadingForImageReceiver$4(this.f16983b, (ImageReceiver) this.d);
                return;
            case 3:
                ((MediaDataController) this.f16984c).lambda$loadBotKeyboard$196((MessagesStorage.TopicKey) this.d, this.f16983b);
                return;
            case 4:
                ((MediaDataController) this.f16984c).lambda$buildShortcuts$143(this.f16983b, (ArrayList) this.d);
                return;
            case 5:
                ((MessagesController) this.f16984c).lambda$processDialogsUpdate$229((TLRPC.messages_Dialogs) this.d, this.f16983b);
                return;
            case 6:
                ((MessagesStorage) this.f16984c).lambda$updateUserInfo$130((TLRPC.UserFull) this.d, this.f16983b);
                return;
            case 7:
                ((MessagesStorage) this.f16984c).lambda$putCachedPhoneBook$149((HashMap) this.d, this.f16983b);
                return;
            case 8:
                ((MessagesStorage) this.f16984c).lambda$updateEncryptedChatSeq$171((TLRPC.EncryptedChat) this.d, this.f16983b);
                return;
            case 9:
                ((MessagesStorage) this.f16984c).lambda$updateChatInfo$134((TLRPC.ChatFull) this.d, this.f16983b);
                return;
            default:
                ((MessagesStorage) this.f16984c).lambda$deleteEphemeralMessages$206((a0.i) this.d, this.f16983b);
                return;
        }
    }

    public m6(Object obj, boolean z10, Object obj2, int i10) {
        this.f16982a = i10;
        this.f16984c = obj;
        this.f16983b = z10;
        this.d = obj2;
    }
}
