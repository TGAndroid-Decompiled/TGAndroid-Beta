package org.telegram.messenger;

import android.content.SharedPreferences;
import android.util.Pair;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
public final class uj implements Runnable {
    public final int f19179a;
    public final boolean f19180b;
    public final Object f19181c;
    public final Object d;
    public final Object f19182e;

    public uj(Object obj, Object obj2, Object obj3, boolean z10, int i10) {
        this.f19179a = i10;
        this.f19181c = obj;
        this.d = obj2;
        this.f19182e = obj3;
        this.f19180b = z10;
    }

    @Override
    public final void run() {
        switch (this.f19179a) {
            case 0:
                SendMessagesHelper.lambda$prepareSendingMedia$127((SendMessagesHelper.MediaSendPrepareWorker) this.f19181c, (AccountInstance) this.d, (SendMessagesHelper.SendingMediaInfo) this.f19182e, this.f19180b);
                return;
            case 1:
                CacheFetcher.c((CacheFetcher) this.f19181c, (Pair) this.d, this.f19182e, this.f19180b);
                return;
            case 2:
                ((ChatObject.Call) this.f19181c).lambda$loadMembers$2(this.f19180b, (TLObject) this.d, (TL_phone.getGroupParticipants) this.f19182e);
                return;
            case 3:
                ((ChatThemeController) this.f19181c).lambda$requestAllChatThemes$2((List) this.d, (ResultCallback) this.f19182e, this.f19180b);
                return;
            case 4:
                ((ContactsController) this.f19181c).lambda$deleteContact$56((ArrayList) this.d, this.f19180b, (String) this.f19182e);
                return;
            case 5:
                ((MediaController) this.f19181c).lambda$toggleRecordingPause$27((File) this.d, this.f19180b, (TLRPC.TL_document) this.f19182e);
                return;
            case 6:
                ((MediaController) this.f19181c).lambda$playEmojiSound$19((MessagesController.EmojiSound) this.f19182e, (AccountInstance) this.d, this.f19180b);
                return;
            case 7:
                ((MediaDataController) this.f19181c).lambda$saveReplyMessages$178(this.f19180b, (ArrayList) this.d, (a0.i) this.f19182e);
                return;
            case 8:
                ((MediaDataController) this.f19181c).lambda$loadAvatarConstructor$241((TLObject) this.d, (SharedPreferences) this.f19182e, this.f19180b);
                return;
            case 9:
                ((MediaDataController) this.f19181c).lambda$broadcastPinnedMessage$167((ArrayList) this.d, this.f19180b, (ArrayList) this.f19182e);
                return;
            case 10:
                ((MessagesController) this.f19181c).lambda$processUpdates$377(this.f19180b, (TLRPC.Updates) this.d, (ArrayList) this.f19182e);
                return;
            case 11:
                ((MessagesController) this.f19181c).lambda$getBlockedPeers$112((TLObject) this.d, this.f19180b, (TLRPC.TL_contacts_getBlocked) this.f19182e);
                return;
            case 12:
                ((MessagesController.CommonChatsList) this.f19181c).lambda$load$0((int[]) this.d, (TLObject) this.f19182e, this.f19180b);
                return;
            case 13:
                ((MessagesStorage) this.f19181c).lambda$putUsersAndChats$181((List) this.d, (List) this.f19182e, this.f19180b);
                return;
            default:
                ((NotificationsController) this.f19181c).lambda$removeDeletedMessagesFromNotifications$10((a0.i) this.d, this.f19180b, (ArrayList) this.f19182e);
                return;
        }
    }

    public uj(Object obj, Object obj2, boolean z10, Object obj3, int i10) {
        this.f19179a = i10;
        this.f19181c = obj;
        this.d = obj2;
        this.f19180b = z10;
        this.f19182e = obj3;
    }

    public uj(Object obj, boolean z10, Object obj2, Object obj3, int i10) {
        this.f19179a = i10;
        this.f19181c = obj;
        this.f19180b = z10;
        this.d = obj2;
        this.f19182e = obj3;
    }

    public uj(MediaController mediaController, MessagesController.EmojiSound emojiSound, AccountInstance accountInstance, boolean z10) {
        this.f19179a = 6;
        this.f19181c = mediaController;
        this.f19182e = emojiSound;
        this.d = accountInstance;
        this.f19180b = z10;
    }
}
