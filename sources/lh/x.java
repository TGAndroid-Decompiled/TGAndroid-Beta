package lh;

import android.content.Context;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CountDownLatch;
import oh.t6;
import org.telegram.messenger.BotForumHelper;
import org.telegram.messenger.GiftAuctionController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.TopicsController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
public final class x implements Runnable {
    public final int f13065a;
    public final int f13066b;
    public final long f13067c;
    public final Object d;
    public final Object f13068e;
    public final Object f13069f;

    public x(Context context, int i10, GiftAuctionController.Auction auction, long j10, Runnable runnable) {
        this.f13065a = 0;
        this.d = context;
        this.f13066b = i10;
        this.f13068e = auction;
        this.f13067c = j10;
        this.f13069f = runnable;
    }

    @Override
    public final void run() {
        boolean z4;
        boolean z10;
        int i10 = this.f13065a;
        String str = null;
        r2 = null;
        TL_stories.StoryItem storyItem = null;
        int i11 = 0;
        long j10 = this.f13067c;
        int i12 = this.f13066b;
        Object obj = this.f13069f;
        Object obj2 = this.f13068e;
        Object obj3 = this.d;
        switch (i10) {
            case 0:
                new e6((Context) obj3, this.f13066b, ((GiftAuctionController.Auction) obj2).gift, null, this.f13067c, (Runnable) obj, false, false).show();
                return;
            case 1:
                mh.z zVar = (mh.z) obj2;
                TLObject tLObject = (TLObject) obj;
                int i13 = ((mh.a0) obj3).f13667a;
                boolean[] zArr = zVar.d;
                boolean[] zArr2 = zVar.f15123b;
                ArrayList[] arrayListArr = zVar.f15122a;
                zArr[i12] = false;
                if (tLObject instanceof TL_stars.StarsStatus) {
                    TL_stars.StarsStatus starsStatus = (TL_stars.StarsStatus) tLObject;
                    MessagesController.getInstance(i13).putUsers(starsStatus.users, false);
                    MessagesController.getInstance(i13).putChats(starsStatus.chats, false);
                    arrayListArr[i12].addAll(starsStatus.history);
                    if (arrayListArr[i12].isEmpty() && !zArr2[i12]) {
                        z4 = false;
                    } else {
                        z4 = true;
                    }
                    zArr2[i12] = z4;
                    boolean[] zArr3 = zVar.f15125e;
                    if ((starsStatus.flags & 1) == 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    zArr3[i12] = z10;
                    String[] strArr = zVar.f15124c;
                    if (!z10) {
                        str = starsStatus.next_offset;
                    }
                    strArr[i12] = str;
                    NotificationCenter.getInstance(i13).lambda$postNotificationNameOnUIThread$1(NotificationCenter.botStarsTransactionsLoaded, Long.valueOf(j10));
                    return;
                }
                return;
            case 2:
                qh.d dVar = (qh.d) obj3;
                dVar.setLoading(true);
                TL_stars.TL_fulfillStarsSubscription tL_fulfillStarsSubscription = new TL_stars.TL_fulfillStarsSubscription();
                tL_fulfillStarsSubscription.subscription_id = ((TL_stars.StarsSubscription) obj2).f21071id;
                tL_fulfillStarsSubscription.peer = new TLRPC.TL_inputPeerSelf();
                int i14 = this.f13066b;
                ConnectionsManager.getInstance(i14).sendRequest(tL_fulfillStarsSubscription, new mh.t(dVar, (org.telegram.ui.ActionBar.h3[]) obj, i14, this.f13067c, 1));
                return;
            case 3:
                t6 t6Var = (t6) obj3;
                TLObject tLObject2 = (TLObject) obj2;
                String str2 = (String) obj;
                int i15 = t6Var.f17770a;
                HashSet hashSet = t6Var.f17787t;
                if (tLObject2 != null) {
                    TL_stories.TL_stories_stories tL_stories_stories = (TL_stories.TL_stories_stories) tLObject2;
                    MessagesController.getInstance(i15).putUsers(tL_stories_stories.users, false);
                    MessagesController.getInstance(i15).putChats(tL_stories_stories.chats, false);
                    while (true) {
                        if (i11 < tL_stories_stories.stories.size()) {
                            if (tL_stories_stories.stories.get(i11).f21080id == i12) {
                                storyItem = tL_stories_stories.stories.get(i11);
                            } else {
                                i11++;
                            }
                        }
                    }
                }
                t6Var.W.remove(str2);
                if (storyItem != null) {
                    storyItem.dialogId = j10;
                    TL_stories.TL_updateStory tL_updateStory = new TL_stories.TL_updateStory();
                    tL_updateStory.peer = MessagesController.getInstance(i15).getPeer(j10);
                    tL_updateStory.story = storyItem;
                    t6Var.Z(tL_updateStory);
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
                t6Var.f17779l.edit().putStringSet("unsupported_stories_checked", hashSet).apply();
                return;
            case 4:
                ((BotForumHelper) obj3).lambda$beforeSendingFinalRequest$3((long[]) obj2, this.f13067c, this.f13066b, (Runnable) obj);
                return;
            case 5:
                ((MediaDataController) obj3).lambda$loadStickers$100((TLObject) obj2, this.f13066b, (Utilities.Callback) obj, this.f13067c);
                return;
            case 6:
                int i16 = this.f13066b;
                ((MessagesStorage) obj3).lambda$checkMessageId$154(this.f13067c, i16, (boolean[]) obj2, (CountDownLatch) obj);
                return;
            case 7:
                ((MessagesStorage) obj3).lambda$overwriteChannel$190(this.f13067c, this.f13066b, (TLRPC.TL_updates_channelDifferenceTooLong) obj2, (Runnable) obj);
                return;
            case 8:
                ((MessagesStorage) obj3).lambda$updateMessageVoiceTranscription$109(this.f13066b, this.f13067c, (TLRPC.Message) obj2, (String) obj);
                return;
            case 9:
                ((MessagesStorage) obj3).lambda$setDialogsFolderId$244((ArrayList) obj2, (ArrayList) obj, this.f13066b, this.f13067c);
                return;
            case 10:
                ((TopicsController) obj3).lambda$loadTopics$2((TLRPC.TL_messages_savedDialogs) obj2, this.f13067c, (a0.h) obj, this.f13066b);
                return;
            case 11:
                ((TopicsController) obj3).lambda$loadTopics$3((TLRPC.TL_messages_savedDialogsSlice) obj2, this.f13067c, (a0.h) obj, this.f13066b);
                return;
            default:
                org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) obj3;
                TLRPC.User user = (TLRPC.User) obj2;
                TLRPC.Chat chat = (TLRPC.Chat) obj;
                int i17 = t1Var.F7;
                if (user != null) {
                    t1Var.U8[i12].m(i17, user);
                    t1Var.T8[i12].setForUserOrChat(user, t1Var.U8[i12]);
                    return;
                } else if (chat != null) {
                    t1Var.U8[i12].k(i17, chat);
                    t1Var.T8[i12].setForUserOrChat(chat, t1Var.U8[i12]);
                    return;
                } else {
                    t1Var.U8[i12].n(j10, "", "");
                    return;
                }
        }
    }

    public x(Object obj, Object obj2, int i10, Object obj3, long j10, int i11) {
        this.f13065a = i11;
        this.d = obj;
        this.f13068e = obj2;
        this.f13066b = i10;
        this.f13069f = obj3;
        this.f13067c = j10;
    }

    public x(BotForumHelper botForumHelper, long[] jArr, long j10, int i10, Runnable runnable) {
        this.f13065a = 4;
        this.d = botForumHelper;
        this.f13068e = jArr;
        this.f13067c = j10;
        this.f13066b = i10;
        this.f13069f = runnable;
    }

    public x(MessagesStorage messagesStorage, int i10, long j10, TLRPC.Message message, String str) {
        this.f13065a = 8;
        this.d = messagesStorage;
        this.f13066b = i10;
        this.f13067c = j10;
        this.f13068e = message;
        this.f13069f = str;
    }

    public x(MessagesStorage messagesStorage, long j10, int i10, Object obj, Object obj2, int i11) {
        this.f13065a = i11;
        this.d = messagesStorage;
        this.f13067c = j10;
        this.f13066b = i10;
        this.f13068e = obj;
        this.f13069f = obj2;
    }

    public x(MessagesStorage messagesStorage, ArrayList arrayList, ArrayList arrayList2, int i10, long j10) {
        this.f13065a = 9;
        this.d = messagesStorage;
        this.f13068e = arrayList;
        this.f13069f = arrayList2;
        this.f13066b = i10;
        this.f13067c = j10;
    }

    public x(TopicsController topicsController, TLRPC.messages_SavedDialogs messages_saveddialogs, long j10, a0.h hVar, int i10, int i11) {
        this.f13065a = i11;
        this.d = topicsController;
        this.f13068e = messages_saveddialogs;
        this.f13067c = j10;
        this.f13069f = hVar;
        this.f13066b = i10;
    }
}
