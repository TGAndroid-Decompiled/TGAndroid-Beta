package org.telegram.messenger;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.TLRPC;
public final class m6 implements Runnable {
    public final int f16727a;
    public final boolean f16728b;
    public final Object f16729c;
    public final Object d;

    public m6(Object obj, Object obj2, boolean z10, int i10) {
        this.f16727a = i10;
        this.f16729c = obj;
        this.d = obj2;
        this.f16728b = z10;
    }

    @Override
    public final void run() {
        switch (this.f16727a) {
            case 0:
                ((MediaController.AnonymousClass2) this.f16729c).lambda$run$1((ByteBuffer) this.d, this.f16728b);
                return;
            case 1:
                ((FileLoader) this.f16729c).lambda$cancelFileUpload$2(this.f16728b, (String) this.d);
                return;
            case 2:
                ((ImageLoader) this.f16729c).lambda$cancelLoadingForImageReceiver$4(this.f16728b, (ImageReceiver) this.d);
                return;
            case 3:
                ((MediaDataController) this.f16729c).lambda$loadBotKeyboard$196((MessagesStorage.TopicKey) this.d, this.f16728b);
                return;
            case 4:
                ((MediaDataController) this.f16729c).lambda$buildShortcuts$143(this.f16728b, (ArrayList) this.d);
                return;
            case 5:
                ((MessagesController) this.f16729c).lambda$processDialogsUpdate$229((TLRPC.messages_Dialogs) this.d, this.f16728b);
                return;
            case 6:
                ((MessagesStorage) this.f16729c).lambda$updateUserInfo$130((TLRPC.UserFull) this.d, this.f16728b);
                return;
            case 7:
                ((MessagesStorage) this.f16729c).lambda$putCachedPhoneBook$149((HashMap) this.d, this.f16728b);
                return;
            case 8:
                ((MessagesStorage) this.f16729c).lambda$updateEncryptedChatSeq$171((TLRPC.EncryptedChat) this.d, this.f16728b);
                return;
            case 9:
                ((MessagesStorage) this.f16729c).lambda$updateChatInfo$134((TLRPC.ChatFull) this.d, this.f16728b);
                return;
            default:
                ((MessagesStorage) this.f16729c).lambda$deleteEphemeralMessages$206((a0.i) this.d, this.f16728b);
                return;
        }
    }

    public m6(Object obj, boolean z10, Object obj2, int i10) {
        this.f16727a = i10;
        this.f16729c = obj;
        this.f16728b = z10;
        this.d = obj2;
    }
}
