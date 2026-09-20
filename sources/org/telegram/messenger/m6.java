package org.telegram.messenger;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.TLRPC;
public final class m6 implements Runnable {
    public final int f16958a;
    public final boolean f16959b;
    public final Object f16960c;
    public final Object d;

    public m6(Object obj, Object obj2, boolean z10, int i10) {
        this.f16958a = i10;
        this.f16960c = obj;
        this.d = obj2;
        this.f16959b = z10;
    }

    @Override
    public final void run() {
        switch (this.f16958a) {
            case 0:
                ((MediaController.AnonymousClass2) this.f16960c).lambda$run$1((ByteBuffer) this.d, this.f16959b);
                return;
            case 1:
                ((FileLoader) this.f16960c).lambda$cancelFileUpload$2(this.f16959b, (String) this.d);
                return;
            case 2:
                ((ImageLoader) this.f16960c).lambda$cancelLoadingForImageReceiver$4(this.f16959b, (ImageReceiver) this.d);
                return;
            case 3:
                ((MediaDataController) this.f16960c).lambda$loadBotKeyboard$196((MessagesStorage.TopicKey) this.d, this.f16959b);
                return;
            case 4:
                ((MediaDataController) this.f16960c).lambda$buildShortcuts$143(this.f16959b, (ArrayList) this.d);
                return;
            case 5:
                ((MessagesController) this.f16960c).lambda$processDialogsUpdate$229((TLRPC.messages_Dialogs) this.d, this.f16959b);
                return;
            case 6:
                ((MessagesStorage) this.f16960c).lambda$updateUserInfo$130((TLRPC.UserFull) this.d, this.f16959b);
                return;
            case 7:
                ((MessagesStorage) this.f16960c).lambda$putCachedPhoneBook$149((HashMap) this.d, this.f16959b);
                return;
            case 8:
                ((MessagesStorage) this.f16960c).lambda$updateEncryptedChatSeq$171((TLRPC.EncryptedChat) this.d, this.f16959b);
                return;
            case 9:
                ((MessagesStorage) this.f16960c).lambda$updateChatInfo$134((TLRPC.ChatFull) this.d, this.f16959b);
                return;
            default:
                ((MessagesStorage) this.f16960c).lambda$deleteEphemeralMessages$206((a0.i) this.d, this.f16959b);
                return;
        }
    }

    public m6(Object obj, boolean z10, Object obj2, int i10) {
        this.f16958a = i10;
        this.f16960c = obj;
        this.f16959b = z10;
        this.d = obj2;
    }
}
