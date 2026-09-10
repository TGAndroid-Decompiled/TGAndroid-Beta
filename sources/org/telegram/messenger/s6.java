package org.telegram.messenger;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.TLRPC;
public final class s6 implements Runnable {
    public final int f16284a;
    public final boolean f16285b;
    public final Object f16286c;
    public final Object d;

    public s6(Object obj, Object obj2, boolean z10, int i10) {
        this.f16284a = i10;
        this.f16286c = obj;
        this.d = obj2;
        this.f16285b = z10;
    }

    @Override
    public final void run() {
        switch (this.f16284a) {
            case 0:
                ((MediaController.AnonymousClass2) this.f16286c).lambda$run$1((ByteBuffer) this.d, this.f16285b);
                return;
            case 1:
                ((FileLoader) this.f16286c).lambda$cancelFileUpload$2(this.f16285b, (String) this.d);
                return;
            case 2:
                ((ImageLoader) this.f16286c).lambda$cancelLoadingForImageReceiver$4(this.f16285b, (ImageReceiver) this.d);
                return;
            case 3:
                ((MediaDataController) this.f16286c).lambda$loadBotKeyboard$196((MessagesStorage.TopicKey) this.d, this.f16285b);
                return;
            case 4:
                ((MediaDataController) this.f16286c).lambda$buildShortcuts$143(this.f16285b, (ArrayList) this.d);
                return;
            case 5:
                ((MessagesController) this.f16286c).lambda$processDialogsUpdate$229((TLRPC.messages_Dialogs) this.d, this.f16285b);
                return;
            case 6:
                ((MessagesStorage) this.f16286c).lambda$updateUserInfo$130((TLRPC.UserFull) this.d, this.f16285b);
                return;
            case 7:
                ((MessagesStorage) this.f16286c).lambda$putCachedPhoneBook$149((HashMap) this.d, this.f16285b);
                return;
            case 8:
                ((MessagesStorage) this.f16286c).lambda$updateEncryptedChatSeq$171((TLRPC.EncryptedChat) this.d, this.f16285b);
                return;
            case 9:
                ((MessagesStorage) this.f16286c).lambda$updateChatInfo$134((TLRPC.ChatFull) this.d, this.f16285b);
                return;
            default:
                ((MessagesStorage) this.f16286c).lambda$deleteEphemeralMessages$206((a0.i) this.d, this.f16285b);
                return;
        }
    }

    public s6(Object obj, boolean z10, Object obj2, int i10) {
        this.f16284a = i10;
        this.f16286c = obj;
        this.f16285b = z10;
        this.d = obj2;
    }
}
