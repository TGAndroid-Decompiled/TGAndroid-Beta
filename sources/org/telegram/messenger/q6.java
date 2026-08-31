package org.telegram.messenger;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.TLRPC;
public final class q6 implements Runnable {
    public final int f19755a;
    public final boolean f19756b;
    public final Object f19757c;
    public final Object d;

    public q6(Object obj, Object obj2, boolean z4, int i10) {
        this.f19755a = i10;
        this.f19757c = obj;
        this.d = obj2;
        this.f19756b = z4;
    }

    @Override
    public final void run() {
        switch (this.f19755a) {
            case 0:
                ((MediaController.AnonymousClass2) this.f19757c).lambda$run$1((ByteBuffer) this.d, this.f19756b);
                return;
            case 1:
                ((FileLoader) this.f19757c).lambda$cancelFileUpload$2(this.f19756b, (String) this.d);
                return;
            case 2:
                ((ImageLoader) this.f19757c).lambda$cancelLoadingForImageReceiver$4(this.f19756b, (ImageReceiver) this.d);
                return;
            case 3:
                ((MediaDataController) this.f19757c).lambda$loadBotKeyboard$196((MessagesStorage.TopicKey) this.d, this.f19756b);
                return;
            case 4:
                ((MediaDataController) this.f19757c).lambda$buildShortcuts$143(this.f19756b, (ArrayList) this.d);
                return;
            case 5:
                ((MessagesController) this.f19757c).lambda$processDialogsUpdate$229((TLRPC.messages_Dialogs) this.d, this.f19756b);
                return;
            case 6:
                ((MessagesStorage) this.f19757c).lambda$updateUserInfo$130((TLRPC.UserFull) this.d, this.f19756b);
                return;
            case 7:
                ((MessagesStorage) this.f19757c).lambda$putCachedPhoneBook$149((HashMap) this.d, this.f19756b);
                return;
            case 8:
                ((MessagesStorage) this.f19757c).lambda$updateEncryptedChatSeq$171((TLRPC.EncryptedChat) this.d, this.f19756b);
                return;
            case 9:
                ((MessagesStorage) this.f19757c).lambda$updateChatInfo$134((TLRPC.ChatFull) this.d, this.f19756b);
                return;
            default:
                ((MessagesStorage) this.f19757c).lambda$deleteEphemeralMessages$206((a0.h) this.d, this.f19756b);
                return;
        }
    }

    public q6(Object obj, boolean z4, Object obj2, int i10) {
        this.f19755a = i10;
        this.f19757c = obj;
        this.f19756b = z4;
        this.d = obj2;
    }
}
