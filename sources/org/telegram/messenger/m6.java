package org.telegram.messenger;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.TLRPC;
public final class m6 implements Runnable {
    public final int f16732a;
    public final boolean f16733b;
    public final Object f16734c;
    public final Object d;

    public m6(Object obj, Object obj2, boolean z10, int i10) {
        this.f16732a = i10;
        this.f16734c = obj;
        this.d = obj2;
        this.f16733b = z10;
    }

    @Override
    public final void run() {
        switch (this.f16732a) {
            case 0:
                ((MediaController.AnonymousClass2) this.f16734c).lambda$run$1((ByteBuffer) this.d, this.f16733b);
                return;
            case 1:
                ((FileLoader) this.f16734c).lambda$cancelFileUpload$2(this.f16733b, (String) this.d);
                return;
            case 2:
                ((ImageLoader) this.f16734c).lambda$cancelLoadingForImageReceiver$4(this.f16733b, (ImageReceiver) this.d);
                return;
            case 3:
                ((MediaDataController) this.f16734c).lambda$loadBotKeyboard$196((MessagesStorage.TopicKey) this.d, this.f16733b);
                return;
            case 4:
                ((MediaDataController) this.f16734c).lambda$buildShortcuts$143(this.f16733b, (ArrayList) this.d);
                return;
            case 5:
                ((MessagesController) this.f16734c).lambda$processDialogsUpdate$229((TLRPC.messages_Dialogs) this.d, this.f16733b);
                return;
            case 6:
                ((MessagesStorage) this.f16734c).lambda$updateUserInfo$130((TLRPC.UserFull) this.d, this.f16733b);
                return;
            case 7:
                ((MessagesStorage) this.f16734c).lambda$putCachedPhoneBook$149((HashMap) this.d, this.f16733b);
                return;
            case 8:
                ((MessagesStorage) this.f16734c).lambda$updateEncryptedChatSeq$171((TLRPC.EncryptedChat) this.d, this.f16733b);
                return;
            case 9:
                ((MessagesStorage) this.f16734c).lambda$updateChatInfo$134((TLRPC.ChatFull) this.d, this.f16733b);
                return;
            default:
                ((MessagesStorage) this.f16734c).lambda$deleteEphemeralMessages$206((a0.i) this.d, this.f16733b);
                return;
        }
    }

    public m6(Object obj, boolean z10, Object obj2, int i10) {
        this.f16732a = i10;
        this.f16734c = obj;
        this.f16733b = z10;
        this.d = obj2;
    }
}
