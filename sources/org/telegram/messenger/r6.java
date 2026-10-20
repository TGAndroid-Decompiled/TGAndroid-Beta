package org.telegram.messenger;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.TLRPC;
public final class r6 implements Runnable {
    public final int f19420a;
    public final boolean f19421b;
    public final Object f19422c;
    public final Object d;

    public r6(Object obj, Object obj2, boolean z10, int i10) {
        this.f19420a = i10;
        this.f19422c = obj;
        this.d = obj2;
        this.f19421b = z10;
    }

    @Override
    public final void run() {
        switch (this.f19420a) {
            case 0:
                ((MediaController.AnonymousClass2) this.f19422c).lambda$run$1((ByteBuffer) this.d, this.f19421b);
                return;
            case 1:
                ((FileLoader) this.f19422c).lambda$cancelFileUpload$2(this.f19421b, (String) this.d);
                return;
            case 2:
                ((ImageLoader) this.f19422c).lambda$cancelLoadingForImageReceiver$4(this.f19421b, (ImageReceiver) this.d);
                return;
            case 3:
                ((MediaDataController) this.f19422c).lambda$loadBotKeyboard$197((MessagesStorage.TopicKey) this.d, this.f19421b);
                return;
            case 4:
                ((MediaDataController) this.f19422c).lambda$buildShortcuts$143(this.f19421b, (ArrayList) this.d);
                return;
            case 5:
                ((MessagesController) this.f19422c).lambda$processDialogsUpdate$228((TLRPC.messages_Dialogs) this.d, this.f19421b);
                return;
            case 6:
                ((MessagesStorage) this.f19422c).lambda$updateUserInfo$130((TLRPC.UserFull) this.d, this.f19421b);
                return;
            case 7:
                ((MessagesStorage) this.f19422c).lambda$putCachedPhoneBook$149((HashMap) this.d, this.f19421b);
                return;
            case 8:
                ((MessagesStorage) this.f19422c).lambda$updateEncryptedChatSeq$171((TLRPC.EncryptedChat) this.d, this.f19421b);
                return;
            case 9:
                ((MessagesStorage) this.f19422c).lambda$updateChatInfo$134((TLRPC.ChatFull) this.d, this.f19421b);
                return;
            default:
                ((MessagesStorage) this.f19422c).lambda$deleteEphemeralMessages$206((a0.h) this.d, this.f19421b);
                return;
        }
    }

    public r6(Object obj, boolean z10, Object obj2, int i10) {
        this.f19420a = i10;
        this.f19422c = obj;
        this.f19421b = z10;
        this.d = obj2;
    }
}
