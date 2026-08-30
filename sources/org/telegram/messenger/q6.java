package org.telegram.messenger;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.TLRPC;
public final class q6 implements Runnable {
    public final int f18196a;
    public final boolean f18197b;
    public final Object f18198c;
    public final Object d;

    public q6(Object obj, Object obj2, boolean z4, int i10) {
        this.f18196a = i10;
        this.f18198c = obj;
        this.d = obj2;
        this.f18197b = z4;
    }

    @Override
    public final void run() {
        switch (this.f18196a) {
            case 0:
                ((MediaController.AnonymousClass2) this.f18198c).lambda$run$1((ByteBuffer) this.d, this.f18197b);
                return;
            case 1:
                ((FileLoader) this.f18198c).lambda$cancelFileUpload$2(this.f18197b, (String) this.d);
                return;
            case 2:
                ((ImageLoader) this.f18198c).lambda$cancelLoadingForImageReceiver$4(this.f18197b, (ImageReceiver) this.d);
                return;
            case 3:
                ((MediaDataController) this.f18198c).lambda$loadBotKeyboard$196((MessagesStorage.TopicKey) this.d, this.f18197b);
                return;
            case 4:
                ((MediaDataController) this.f18198c).lambda$buildShortcuts$143(this.f18197b, (ArrayList) this.d);
                return;
            case 5:
                ((MessagesController) this.f18198c).lambda$processDialogsUpdate$229((TLRPC.messages_Dialogs) this.d, this.f18197b);
                return;
            case 6:
                ((MessagesStorage) this.f18198c).lambda$updateUserInfo$130((TLRPC.UserFull) this.d, this.f18197b);
                return;
            case 7:
                ((MessagesStorage) this.f18198c).lambda$putCachedPhoneBook$149((HashMap) this.d, this.f18197b);
                return;
            case 8:
                ((MessagesStorage) this.f18198c).lambda$updateEncryptedChatSeq$171((TLRPC.EncryptedChat) this.d, this.f18197b);
                return;
            case 9:
                ((MessagesStorage) this.f18198c).lambda$updateChatInfo$134((TLRPC.ChatFull) this.d, this.f18197b);
                return;
            default:
                ((MessagesStorage) this.f18198c).lambda$deleteEphemeralMessages$206((a0.h) this.d, this.f18197b);
                return;
        }
    }

    public q6(Object obj, boolean z4, Object obj2, int i10) {
        this.f18196a = i10;
        this.f18198c = obj;
        this.f18197b = z4;
        this.d = obj2;
    }
}
