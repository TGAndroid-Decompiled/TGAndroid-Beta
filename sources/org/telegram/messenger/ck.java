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
public final class ck implements Runnable {
    public final int f19846a;
    public final boolean f19847b;
    public final Object f19848c;
    public final Object d;
    public final Object e;

    public ck(Object obj, Object obj2, Object obj3, boolean z10, int i10) {
        this.f19846a = i10;
        this.f19848c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f19847b = z10;
    }

    @Override
    public final void run() {
        switch (this.f19846a) {
            case 0:
                SendMessagesHelper.lambda$prepareSendingMedia$130((SendMessagesHelper.MediaSendPrepareWorker) this.f19848c, (AccountInstance) this.d, (SendMessagesHelper.SendingMediaInfo) this.e, this.f19847b);
                return;
            case 1:
                CacheFetcher.c((CacheFetcher) this.f19848c, (Pair) this.d, this.e, this.f19847b);
                return;
            case 2:
                ((ChatObject.Call) this.f19848c).lambda$loadMembers$2(this.f19847b, (TLObject) this.d, (TL_phone.getGroupParticipants) this.e);
                return;
            case 3:
                ((ChatThemeController) this.f19848c).lambda$requestAllChatThemes$2((List) this.d, (ResultCallback) this.e, this.f19847b);
                return;
            case 4:
                ((ContactsController) this.f19848c).lambda$deleteContact$56((ArrayList) this.d, this.f19847b, (String) this.e);
                return;
            case 5:
                ((MediaController) this.f19848c).lambda$toggleRecordingPause$29((File) this.d, this.f19847b, (TLRPC.TL_document) this.e);
                return;
            case 6:
                ((MediaController) this.f19848c).lambda$playEmojiSound$19((MessagesController.EmojiSound) this.e, (AccountInstance) this.d, this.f19847b);
                return;
            case 7:
                ((MediaDataController) this.f19848c).lambda$saveReplyMessages$178(this.f19847b, (ArrayList) this.d, (a0.h) this.e);
                return;
            case 8:
                ((MediaDataController) this.f19848c).lambda$loadAvatarConstructor$242((TLObject) this.d, (SharedPreferences) this.e, this.f19847b);
                return;
            case 9:
                ((MediaDataController) this.f19848c).lambda$broadcastPinnedMessage$167((ArrayList) this.d, this.f19847b, (ArrayList) this.e);
                return;
            case 10:
                ((MessagesController) this.f19848c).lambda$getBlockedPeers$111((TLObject) this.d, this.f19847b, (TLRPC.TL_contacts_getBlocked) this.e);
                return;
            case 11:
                ((MessagesController) this.f19848c).lambda$processUpdates$382(this.f19847b, (TLRPC.Updates) this.d, (ArrayList) this.e);
                return;
            case 12:
                ((MessagesController.CommonChatsList) this.f19848c).lambda$load$0((int[]) this.d, (TLObject) this.e, this.f19847b);
                return;
            case 13:
                ((MessagesStorage) this.f19848c).lambda$putUsersAndChats$184((List) this.d, (List) this.e, this.f19847b);
                return;
            default:
                ((NotificationsController) this.f19848c).lambda$removeDeletedMessagesFromNotifications$11((a0.h) this.d, this.f19847b, (ArrayList) this.e);
                return;
        }
    }

    public ck(Object obj, Object obj2, boolean z10, Object obj3, int i10) {
        this.f19846a = i10;
        this.f19848c = obj;
        this.d = obj2;
        this.f19847b = z10;
        this.e = obj3;
    }

    public ck(Object obj, boolean z10, Object obj2, Object obj3, int i10) {
        this.f19846a = i10;
        this.f19848c = obj;
        this.f19847b = z10;
        this.d = obj2;
        this.e = obj3;
    }

    public ck(MediaController mediaController, MessagesController.EmojiSound emojiSound, AccountInstance accountInstance, boolean z10) {
        this.f19846a = 6;
        this.f19848c = mediaController;
        this.e = emojiSound;
        this.d = accountInstance;
        this.f19847b = z10;
    }
}
