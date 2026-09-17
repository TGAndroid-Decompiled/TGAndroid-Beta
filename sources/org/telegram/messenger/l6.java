package org.telegram.messenger;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.TLRPC;
public final class l6 implements Runnable {
    public final int f18288a;
    public final boolean f18289b;
    public final Object f18290c;
    public final Object d;

    public l6(Object obj, Object obj2, boolean z10, int i10) {
        this.f18288a = i10;
        this.f18290c = obj;
        this.d = obj2;
        this.f18289b = z10;
    }

    @Override
    public final void run() {
        switch (this.f18288a) {
            case 0:
                ((MediaController.AnonymousClass2) this.f18290c).lambda$run$1((ByteBuffer) this.d, this.f18289b);
                return;
            case 1:
                ((FileLoader) this.f18290c).lambda$cancelFileUpload$2(this.f18289b, (String) this.d);
                return;
            case 2:
                ((ImageLoader) this.f18290c).lambda$cancelLoadingForImageReceiver$4(this.f18289b, (ImageReceiver) this.d);
                return;
            case 3:
                ((MediaDataController) this.f18290c).lambda$loadBotKeyboard$196((MessagesStorage.TopicKey) this.d, this.f18289b);
                return;
            case 4:
                ((MediaDataController) this.f18290c).lambda$buildShortcuts$143(this.f18289b, (ArrayList) this.d);
                return;
            case 5:
                ((MessagesController) this.f18290c).lambda$processDialogsUpdate$229((TLRPC.messages_Dialogs) this.d, this.f18289b);
                return;
            case 6:
                ((MessagesStorage) this.f18290c).lambda$updateUserInfo$130((TLRPC.UserFull) this.d, this.f18289b);
                return;
            case 7:
                ((MessagesStorage) this.f18290c).lambda$putCachedPhoneBook$149((HashMap) this.d, this.f18289b);
                return;
            case 8:
                ((MessagesStorage) this.f18290c).lambda$updateEncryptedChatSeq$171((TLRPC.EncryptedChat) this.d, this.f18289b);
                return;
            case 9:
                ((MessagesStorage) this.f18290c).lambda$updateChatInfo$134((TLRPC.ChatFull) this.d, this.f18289b);
                return;
            default:
                ((MessagesStorage) this.f18290c).lambda$deleteEphemeralMessages$206((a0.i) this.d, this.f18289b);
                return;
        }
    }

    public l6(Object obj, boolean z10, Object obj2, int i10) {
        this.f18288a = i10;
        this.f18290c = obj;
        this.f18289b = z10;
        this.d = obj2;
    }
}
