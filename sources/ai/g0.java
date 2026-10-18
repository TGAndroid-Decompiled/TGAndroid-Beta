package ai;

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
public final class g0 implements Runnable {
    public final int f1327a;
    public final int f1328b;
    public final long f1329c;
    public final Object d;
    public final Object e;
    public final Object f1330f;

    public g0(Context context, int i10, GiftAuctionController.Auction auction, long j10, Runnable runnable) {
        this.f1327a = 14;
        this.d = context;
        this.f1328b = i10;
        this.e = auction;
        this.f1329c = j10;
        this.f1330f = runnable;
    }

    @Override
    public final void run() {
        boolean z10;
        boolean z11;
        int i10 = this.f1327a;
        String str = null;
        r2 = null;
        TL_stories.StoryItem storyItem = null;
        int i11 = 0;
        long j10 = this.f1329c;
        int i12 = this.f1328b;
        Object obj = this.f1330f;
        Object obj2 = this.e;
        Object obj3 = this.d;
        switch (i10) {
            case 0:
                j0 j0Var = (j0) obj2;
                TLObject tLObject = (TLObject) obj;
                int i13 = ((k0) obj3).f1614a;
                boolean[] zArr = j0Var.d;
                boolean[] zArr2 = j0Var.f1538b;
                ArrayList[] arrayListArr = j0Var.f1537a;
                zArr[i12] = false;
                if (tLObject instanceof TL_stars.StarsStatus) {
                    TL_stars.StarsStatus starsStatus = (TL_stars.StarsStatus) tLObject;
                    MessagesController.getInstance(i13).putUsers(starsStatus.users, false);
                    MessagesController.getInstance(i13).putChats(starsStatus.chats, false);
                    arrayListArr[i12].addAll(starsStatus.history);
                    if (arrayListArr[i12].isEmpty() && !zArr2[i12]) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    zArr2[i12] = z10;
                    boolean[] zArr3 = j0Var.e;
                    if ((starsStatus.flags & 1) == 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    zArr3[i12] = z11;
                    String[] strArr = j0Var.f1539c;
                    if (!z11) {
                        str = starsStatus.next_offset;
                    }
                    strArr[i12] = str;
                    NotificationCenter.getInstance(i13).lambda$postNotificationNameOnUIThread$1(NotificationCenter.botStarsTransactionsLoaded, Long.valueOf(j10));
                    return;
                }
                return;
            case 1:
                ei.d dVar = (ei.d) obj3;
                dVar.setLoading(true);
                TL_stars.TL_fulfillStarsSubscription tL_fulfillStarsSubscription = new TL_stars.TL_fulfillStarsSubscription();
                tL_fulfillStarsSubscription.subscription_id = ((TL_stars.StarsSubscription) obj2).f20497id;
                tL_fulfillStarsSubscription.peer = new TLRPC.TL_inputPeerSelf();
                int i14 = this.f1328b;
                ConnectionsManager.getInstance(i14).sendRequest(tL_fulfillStarsSubscription, new c0(dVar, (org.telegram.ui.ActionBar.f3[]) obj, i14, this.f1329c, 1));
                return;
            case 2:
                ci.h7 h7Var = (ci.h7) obj3;
                TLObject tLObject2 = (TLObject) obj;
                String str2 = (String) obj2;
                int i15 = h7Var.f5397a;
                HashSet hashSet = h7Var.f5413t;
                if (tLObject2 != null) {
                    TL_stories.TL_stories_stories tL_stories_stories = (TL_stories.TL_stories_stories) tLObject2;
                    MessagesController.getInstance(i15).putUsers(tL_stories_stories.users, false);
                    MessagesController.getInstance(i15).putChats(tL_stories_stories.chats, false);
                    while (true) {
                        if (i11 < tL_stories_stories.stories.size()) {
                            if (tL_stories_stories.stories.get(i11).f20506id == i12) {
                                storyItem = tL_stories_stories.stories.get(i11);
                            } else {
                                i11++;
                            }
                        }
                    }
                }
                h7Var.W.remove(str2);
                if (storyItem != null) {
                    storyItem.dialogId = j10;
                    TL_stories.TL_updateStory tL_updateStory = new TL_stories.TL_updateStory();
                    tL_updateStory.peer = MessagesController.getInstance(i15).getPeer(j10);
                    tL_updateStory.story = storyItem;
                    h7Var.Z(tL_updateStory);
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
                h7Var.f5405l.edit().putStringSet("unsupported_stories_checked", hashSet).apply();
                return;
            case 3:
                ((BotForumHelper) obj3).lambda$beforeSendingFinalRequest$3((long[]) obj2, this.f1329c, this.f1328b, (Runnable) obj);
                return;
            case 4:
                ((MediaDataController) obj3).lambda$loadStickers$100((TLObject) obj, this.f1328b, (Utilities.Callback) obj2, this.f1329c);
                return;
            case 5:
                ((MessagesStorage) obj3).lambda$checkMessageId$154(this.f1329c, this.f1328b, (boolean[]) obj2, (CountDownLatch) obj);
                return;
            case 6:
                ((MessagesStorage) obj3).lambda$overwriteChannel$190(this.f1329c, this.f1328b, (TLRPC.TL_updates_channelDifferenceTooLong) obj2, (Runnable) obj);
                return;
            case 7:
                ((MessagesStorage) obj3).lambda$updateMessageVoiceTranscription$109(this.f1328b, this.f1329c, (TLRPC.Message) obj2, (String) obj);
                return;
            case 8:
                ((MessagesStorage) obj3).lambda$setDialogsFolderId$244((ArrayList) obj2, (ArrayList) obj, this.f1328b, this.f1329c);
                return;
            case 9:
                ((SendMessagesHelper) obj3).lambda$completeSendingGramTransfer$6((MessageObject) obj2, (TLRPC.Message) obj, this.f1329c, this.f1328b);
                return;
            case 10:
                ((TelegramMediaSession) obj3).lambda$loadMusicForDialog$6(this.f1328b, this.f1329c, (ArrayList) obj2, (ArrayList) obj);
                return;
            case 11:
                ((TopicsController) obj3).lambda$loadTopics$2((TLRPC.TL_messages_savedDialogs) obj2, this.f1329c, (a0.h) obj, this.f1328b);
                return;
            case 12:
                ((TopicsController) obj3).lambda$loadTopics$3((TLRPC.TL_messages_savedDialogsSlice) obj2, this.f1329c, (a0.h) obj, this.f1328b);
                return;
            case 13:
                org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) obj3;
                TLRPC.User user = (TLRPC.User) obj2;
                TLRPC.Chat chat = (TLRPC.Chat) obj;
                int i16 = u1Var.I7;
                if (user != null) {
                    u1Var.X8[i12].m(i16, user);
                    u1Var.W8[i12].setForUserOrChat(user, u1Var.X8[i12]);
                    return;
                } else if (chat != null) {
                    u1Var.X8[i12].k(i16, chat);
                    u1Var.W8[i12].setForUserOrChat(chat, u1Var.X8[i12]);
                    return;
                } else {
                    u1Var.X8[i12].n(j10, "", "");
                    return;
                }
            default:
                new yh.x4((Context) obj3, this.f1328b, ((GiftAuctionController.Auction) obj2).gift, null, this.f1329c, (Runnable) obj, false, false).show();
                return;
        }
    }

    public g0(Object obj, int i10, long j10, Object obj2, Serializable serializable, int i11) {
        this.f1327a = i11;
        this.d = obj;
        this.f1328b = i10;
        this.f1329c = j10;
        this.e = obj2;
        this.f1330f = serializable;
    }

    public g0(Object obj, Object obj2, int i10, Object obj3, long j10, int i11) {
        this.f1327a = i11;
        this.d = obj;
        this.e = obj2;
        this.f1328b = i10;
        this.f1330f = obj3;
        this.f1329c = j10;
    }

    public g0(Object obj, TLObject tLObject, int i10, Object obj2, long j10, int i11) {
        this.f1327a = i11;
        this.d = obj;
        this.f1330f = tLObject;
        this.f1328b = i10;
        this.e = obj2;
        this.f1329c = j10;
    }

    public g0(BotForumHelper botForumHelper, long[] jArr, long j10, int i10, Runnable runnable) {
        this.f1327a = 3;
        this.d = botForumHelper;
        this.e = jArr;
        this.f1329c = j10;
        this.f1328b = i10;
        this.f1330f = runnable;
    }

    public g0(MessagesStorage messagesStorage, long j10, int i10, Object obj, Object obj2, int i11) {
        this.f1327a = i11;
        this.d = messagesStorage;
        this.f1329c = j10;
        this.f1328b = i10;
        this.e = obj;
        this.f1330f = obj2;
    }

    public g0(MessagesStorage messagesStorage, ArrayList arrayList, ArrayList arrayList2, int i10, long j10) {
        this.f1327a = 8;
        this.d = messagesStorage;
        this.e = arrayList;
        this.f1330f = arrayList2;
        this.f1328b = i10;
        this.f1329c = j10;
    }

    public g0(SendMessagesHelper sendMessagesHelper, MessageObject messageObject, TLRPC.Message message, long j10, int i10) {
        this.f1327a = 9;
        this.d = sendMessagesHelper;
        this.e = messageObject;
        this.f1330f = message;
        this.f1329c = j10;
        this.f1328b = i10;
    }

    public g0(TopicsController topicsController, TLRPC.messages_SavedDialogs messages_saveddialogs, long j10, a0.h hVar, int i10, int i11) {
        this.f1327a = i11;
        this.d = topicsController;
        this.e = messages_saveddialogs;
        this.f1329c = j10;
        this.f1330f = hVar;
        this.f1328b = i10;
    }
}
