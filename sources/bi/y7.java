package bi;

import android.content.Context;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.BotForumHelper;
import org.telegram.messenger.GiftAuctionController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.TelegramMediaSession;
import org.telegram.messenger.TopicsController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
public final class y7 implements Runnable {
    public final int f4027a;
    public final long f4028b;
    public final int f4029c;
    public final Object d;
    public final Object e;
    public final Object f4030f;

    public y7(Context context, int i10, GiftAuctionController.Auction auction, long j10, Runnable runnable) {
        this.f4027a = 12;
        this.d = context;
        this.f4029c = i10;
        this.e = auction;
        this.f4028b = j10;
        this.f4030f = runnable;
    }

    @Override
    public final void run() {
        boolean z10;
        boolean z11;
        int i10 = this.f4027a;
        TL_stories.StoryItem storyItem = null;
        String str = null;
        storyItem = null;
        int i11 = 0;
        long j10 = this.f4028b;
        int i12 = this.f4029c;
        Object obj = this.f4030f;
        Object obj2 = this.e;
        Object obj3 = this.d;
        switch (i10) {
            case 0:
                x8 x8Var = (x8) obj3;
                TLObject tLObject = (TLObject) obj2;
                String str2 = (String) obj;
                int i13 = x8Var.f3966a;
                HashSet hashSet = x8Var.f3982t;
                if (tLObject != null) {
                    TL_stories.TL_stories_stories tL_stories_stories = (TL_stories.TL_stories_stories) tLObject;
                    MessagesController.getInstance(i13).putUsers(tL_stories_stories.users, false);
                    MessagesController.getInstance(i13).putChats(tL_stories_stories.chats, false);
                    while (true) {
                        if (i11 < tL_stories_stories.stories.size()) {
                            if (tL_stories_stories.stories.get(i11).f19151id == i12) {
                                storyItem = tL_stories_stories.stories.get(i11);
                            } else {
                                i11++;
                            }
                        }
                    }
                }
                x8Var.W.remove(str2);
                if (storyItem != null) {
                    storyItem.dialogId = j10;
                    TL_stories.TL_updateStory tL_updateStory = new TL_stories.TL_updateStory();
                    tL_updateStory.peer = MessagesController.getInstance(i13).getPeer(j10);
                    tL_updateStory.story = storyItem;
                    x8Var.Z(tL_updateStory);
                    return;
                }
                Iterator it = hashSet.iterator();
                while (true) {
                    if (it.hasNext()) {
                        String str3 = (String) it.next();
                        if (str3.endsWith(":" + j10 + ":" + i12)) {
                            hashSet.remove(str3);
                        }
                    }
                }
                hashSet.add(str2);
                x8Var.f3974l.edit().putStringSet("unsupported_stories_checked", hashSet).apply();
                return;
            case 1:
                ((BotForumHelper) obj3).lambda$beforeSendingFinalRequest$3((long[]) obj2, this.f4028b, this.f4029c, (Runnable) obj);
                return;
            case 2:
                ((MediaDataController) obj3).lambda$loadStickers$100((TLObject) obj2, this.f4029c, (Utilities.Callback) obj, this.f4028b);
                return;
            case 3:
                ((MessagesStorage) obj3).lambda$checkMessageId$154(this.f4028b, this.f4029c, (boolean[]) obj2, (CountDownLatch) obj);
                return;
            case 4:
                ((MessagesStorage) obj3).lambda$overwriteChannel$190(this.f4028b, this.f4029c, (TLRPC.TL_updates_channelDifferenceTooLong) obj2, (Runnable) obj);
                return;
            case 5:
                ((MessagesStorage) obj3).lambda$updateMessageVoiceTranscription$109(this.f4029c, this.f4028b, (TLRPC.Message) obj2, (String) obj);
                return;
            case 6:
                ((MessagesStorage) obj3).lambda$setDialogsFolderId$244((ArrayList) obj2, (ArrayList) obj, this.f4029c, this.f4028b);
                return;
            case 7:
                ((SendMessagesHelper) obj3).lambda$completeSendingGramTransfer$6((MessageObject) obj2, (TLRPC.Message) obj, this.f4028b, this.f4029c);
                return;
            case 8:
                ((TelegramMediaSession) obj3).lambda$loadMusicForDialog$6(this.f4029c, this.f4028b, (ArrayList) obj2, (ArrayList) obj);
                return;
            case 9:
                ((TopicsController) obj3).lambda$loadTopics$2((TLRPC.TL_messages_savedDialogs) obj2, this.f4028b, (a0.h) obj, this.f4029c);
                return;
            case 10:
                ((TopicsController) obj3).lambda$loadTopics$3((TLRPC.TL_messages_savedDialogsSlice) obj2, this.f4028b, (a0.h) obj, this.f4029c);
                return;
            case 11:
                org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) obj3;
                TLRPC.User user = (TLRPC.User) obj2;
                TLRPC.Chat chat = (TLRPC.Chat) obj;
                int i14 = u1Var.I7;
                if (user != null) {
                    u1Var.X8[i12].m(i14, user);
                    u1Var.W8[i12].setForUserOrChat(user, u1Var.X8[i12]);
                    return;
                } else if (chat != null) {
                    u1Var.X8[i12].k(i14, chat);
                    u1Var.W8[i12].setForUserOrChat(chat, u1Var.X8[i12]);
                    return;
                } else {
                    u1Var.X8[i12].n(j10, "", "");
                    return;
                }
            case 12:
                new yh.x4((Context) obj3, this.f4029c, ((GiftAuctionController.Auction) obj2).gift, null, this.f4028b, (Runnable) obj, false, false).show();
                return;
            case 13:
                zh.o oVar = (zh.o) obj;
                TLObject tLObject2 = (TLObject) obj2;
                int i15 = ((zh.p) obj3).f50959a;
                boolean[] zArr = oVar.d;
                boolean[] zArr2 = oVar.f50895b;
                ArrayList[] arrayListArr = oVar.f50894a;
                zArr[i12] = false;
                if (tLObject2 instanceof TL_stars.StarsStatus) {
                    TL_stars.StarsStatus starsStatus = (TL_stars.StarsStatus) tLObject2;
                    MessagesController.getInstance(i15).putUsers(starsStatus.users, false);
                    MessagesController.getInstance(i15).putChats(starsStatus.chats, false);
                    arrayListArr[i12].addAll(starsStatus.history);
                    if (arrayListArr[i12].isEmpty() && !zArr2[i12]) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    zArr2[i12] = z10;
                    boolean[] zArr3 = oVar.e;
                    if ((starsStatus.flags & 1) == 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    zArr3[i12] = z11;
                    String[] strArr = oVar.f50896c;
                    if (!z11) {
                        str = starsStatus.next_offset;
                    }
                    strArr[i12] = str;
                    NotificationCenter.getInstance(i15).lambda$postNotificationNameOnUIThread$1(NotificationCenter.botStarsTransactionsLoaded, Long.valueOf(j10));
                    return;
                }
                return;
            default:
                di.d dVar = (di.d) obj3;
                dVar.setLoading(true);
                TL_stars.TL_fulfillStarsSubscription tL_fulfillStarsSubscription = new TL_stars.TL_fulfillStarsSubscription();
                tL_fulfillStarsSubscription.subscription_id = ((TL_stars.StarsSubscription) obj2).f19142id;
                tL_fulfillStarsSubscription.peer = new TLRPC.TL_inputPeerSelf();
                int i16 = this.f4029c;
                ConnectionsManager.getInstance(i16).sendRequest(tL_fulfillStarsSubscription, new w7(dVar, (org.telegram.ui.ActionBar.e3[]) obj, i16, this.f4028b, 7));
                return;
        }
    }

    public y7(Object obj, int i10, long j10, Object obj2, Serializable serializable, int i11) {
        this.f4027a = i11;
        this.d = obj;
        this.f4029c = i10;
        this.f4028b = j10;
        this.e = obj2;
        this.f4030f = serializable;
    }

    public y7(Object obj, TLObject tLObject, int i10, Object obj2, long j10, int i11) {
        this.f4027a = i11;
        this.d = obj;
        this.e = tLObject;
        this.f4029c = i10;
        this.f4030f = obj2;
        this.f4028b = j10;
    }

    public y7(BotForumHelper botForumHelper, long[] jArr, long j10, int i10, Runnable runnable) {
        this.f4027a = 1;
        this.d = botForumHelper;
        this.e = jArr;
        this.f4028b = j10;
        this.f4029c = i10;
        this.f4030f = runnable;
    }

    public y7(MessagesStorage messagesStorage, long j10, int i10, Object obj, Object obj2, int i11) {
        this.f4027a = i11;
        this.d = messagesStorage;
        this.f4028b = j10;
        this.f4029c = i10;
        this.e = obj;
        this.f4030f = obj2;
    }

    public y7(MessagesStorage messagesStorage, ArrayList arrayList, ArrayList arrayList2, int i10, long j10) {
        this.f4027a = 6;
        this.d = messagesStorage;
        this.e = arrayList;
        this.f4030f = arrayList2;
        this.f4029c = i10;
        this.f4028b = j10;
    }

    public y7(SendMessagesHelper sendMessagesHelper, MessageObject messageObject, TLRPC.Message message, long j10, int i10) {
        this.f4027a = 7;
        this.d = sendMessagesHelper;
        this.e = messageObject;
        this.f4030f = message;
        this.f4028b = j10;
        this.f4029c = i10;
    }

    public y7(TopicsController topicsController, TLRPC.messages_SavedDialogs messages_saveddialogs, long j10, a0.h hVar, int i10, int i11) {
        this.f4027a = i11;
        this.d = topicsController;
        this.e = messages_saveddialogs;
        this.f4028b = j10;
        this.f4030f = hVar;
        this.f4029c = i10;
    }

    public y7(zh.p pVar, zh.o oVar, int i10, TLObject tLObject, long j10) {
        this.f4027a = 13;
        this.d = pVar;
        this.f4030f = oVar;
        this.f4029c = i10;
        this.e = tLObject;
        this.f4028b = j10;
    }
}
