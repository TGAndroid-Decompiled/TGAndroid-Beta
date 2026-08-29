package ih;

import android.content.Context;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CountDownLatch;
import lh.s6;
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
public final class y implements Runnable {
    public final int f9512a;
    public final int f9513b;
    public final long f9514c;
    public final Object d;
    public final Object f9515e;
    public final Object f9516f;

    public y(Context context, int i10, GiftAuctionController.Auction auction, long j10, Runnable runnable) {
        this.f9512a = 0;
        this.d = context;
        this.f9513b = i10;
        this.f9515e = auction;
        this.f9514c = j10;
        this.f9516f = runnable;
    }

    @Override
    public final void run() {
        boolean z10;
        boolean z11;
        int i10 = this.f9512a;
        String str = null;
        r2 = null;
        TL_stories.StoryItem storyItem = null;
        int i11 = 0;
        long j10 = this.f9514c;
        int i12 = this.f9513b;
        Object obj = this.f9516f;
        Object obj2 = this.f9515e;
        Object obj3 = this.d;
        switch (i10) {
            case 0:
                new e6((Context) obj3, this.f9513b, ((GiftAuctionController.Auction) obj2).gift, null, this.f9514c, (Runnable) obj, false, false).show();
                return;
            case 1:
                jh.a0 a0Var = (jh.a0) obj2;
                TLObject tLObject = (TLObject) obj;
                int i13 = ((jh.b0) obj3).f11774a;
                boolean[] zArr = a0Var.d;
                boolean[] zArr2 = a0Var.f11703b;
                ArrayList[] arrayListArr = a0Var.f11702a;
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
                    boolean[] zArr3 = a0Var.f11705e;
                    if ((starsStatus.flags & 1) == 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    zArr3[i12] = z11;
                    String[] strArr = a0Var.f11704c;
                    if (!z11) {
                        str = starsStatus.next_offset;
                    }
                    strArr[i12] = str;
                    NotificationCenter.getInstance(i13).lambda$postNotificationNameOnUIThread$1(NotificationCenter.botStarsTransactionsLoaded, Long.valueOf(j10));
                    return;
                }
                return;
            case 2:
                nh.d dVar = (nh.d) obj3;
                dVar.setLoading(true);
                TL_stars.TL_fulfillStarsSubscription tL_fulfillStarsSubscription = new TL_stars.TL_fulfillStarsSubscription();
                tL_fulfillStarsSubscription.subscription_id = ((TL_stars.StarsSubscription) obj2).f22620id;
                tL_fulfillStarsSubscription.peer = new TLRPC.TL_inputPeerSelf();
                int i14 = this.f9513b;
                ConnectionsManager.getInstance(i14).sendRequest(tL_fulfillStarsSubscription, new jh.u(dVar, (org.telegram.ui.ActionBar.f3[]) obj, i14, this.f9514c, 1));
                return;
            case 3:
                s6 s6Var = (s6) obj3;
                TLObject tLObject2 = (TLObject) obj2;
                String str2 = (String) obj;
                int i15 = s6Var.f16218a;
                HashSet hashSet = s6Var.f16235t;
                if (tLObject2 != null) {
                    TL_stories.TL_stories_stories tL_stories_stories = (TL_stories.TL_stories_stories) tLObject2;
                    MessagesController.getInstance(i15).putUsers(tL_stories_stories.users, false);
                    MessagesController.getInstance(i15).putChats(tL_stories_stories.chats, false);
                    while (true) {
                        if (i11 < tL_stories_stories.stories.size()) {
                            if (tL_stories_stories.stories.get(i11).f22629id == i12) {
                                storyItem = tL_stories_stories.stories.get(i11);
                            } else {
                                i11++;
                            }
                        }
                    }
                }
                s6Var.W.remove(str2);
                if (storyItem != null) {
                    storyItem.dialogId = j10;
                    TL_stories.TL_updateStory tL_updateStory = new TL_stories.TL_updateStory();
                    tL_updateStory.peer = MessagesController.getInstance(i15).getPeer(j10);
                    tL_updateStory.story = storyItem;
                    s6Var.Z(tL_updateStory);
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
                s6Var.f16227l.edit().putStringSet("unsupported_stories_checked", hashSet).apply();
                return;
            case 4:
                ((BotForumHelper) obj3).lambda$beforeSendingFinalRequest$3((long[]) obj2, this.f9514c, this.f9513b, (Runnable) obj);
                return;
            case 5:
                ((MediaDataController) obj3).lambda$loadStickers$100((TLObject) obj2, this.f9513b, (Utilities.Callback) obj, this.f9514c);
                return;
            case 6:
                int i16 = this.f9513b;
                ((MessagesStorage) obj3).lambda$checkMessageId$154(this.f9514c, i16, (boolean[]) obj2, (CountDownLatch) obj);
                return;
            case 7:
                ((MessagesStorage) obj3).lambda$overwriteChannel$190(this.f9514c, this.f9513b, (TLRPC.TL_updates_channelDifferenceTooLong) obj2, (Runnable) obj);
                return;
            case 8:
                ((MessagesStorage) obj3).lambda$updateMessageVoiceTranscription$109(this.f9513b, this.f9514c, (TLRPC.Message) obj2, (String) obj);
                return;
            case 9:
                ((MessagesStorage) obj3).lambda$setDialogsFolderId$244((ArrayList) obj2, (ArrayList) obj, this.f9513b, this.f9514c);
                return;
            case 10:
                ((TopicsController) obj3).lambda$loadTopics$2((TLRPC.TL_messages_savedDialogs) obj2, this.f9514c, (a0.h) obj, this.f9513b);
                return;
            case 11:
                ((TopicsController) obj3).lambda$loadTopics$3((TLRPC.TL_messages_savedDialogsSlice) obj2, this.f9514c, (a0.h) obj, this.f9513b);
                return;
            default:
                org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) obj3;
                TLRPC.User user = (TLRPC.User) obj2;
                TLRPC.Chat chat = (TLRPC.Chat) obj;
                int i17 = s1Var.E7;
                if (user != null) {
                    s1Var.T8[i12].m(i17, user);
                    s1Var.S8[i12].setForUserOrChat(user, s1Var.T8[i12]);
                    return;
                } else if (chat != null) {
                    s1Var.T8[i12].k(i17, chat);
                    s1Var.S8[i12].setForUserOrChat(chat, s1Var.T8[i12]);
                    return;
                } else {
                    s1Var.T8[i12].n(j10, "", "");
                    return;
                }
        }
    }

    public y(Object obj, Object obj2, int i10, Object obj3, long j10, int i11) {
        this.f9512a = i11;
        this.d = obj;
        this.f9515e = obj2;
        this.f9513b = i10;
        this.f9516f = obj3;
        this.f9514c = j10;
    }

    public y(BotForumHelper botForumHelper, long[] jArr, long j10, int i10, Runnable runnable) {
        this.f9512a = 4;
        this.d = botForumHelper;
        this.f9515e = jArr;
        this.f9514c = j10;
        this.f9513b = i10;
        this.f9516f = runnable;
    }

    public y(MessagesStorage messagesStorage, int i10, long j10, TLRPC.Message message, String str) {
        this.f9512a = 8;
        this.d = messagesStorage;
        this.f9513b = i10;
        this.f9514c = j10;
        this.f9515e = message;
        this.f9516f = str;
    }

    public y(MessagesStorage messagesStorage, long j10, int i10, Object obj, Object obj2, int i11) {
        this.f9512a = i11;
        this.d = messagesStorage;
        this.f9514c = j10;
        this.f9513b = i10;
        this.f9515e = obj;
        this.f9516f = obj2;
    }

    public y(MessagesStorage messagesStorage, ArrayList arrayList, ArrayList arrayList2, int i10, long j10) {
        this.f9512a = 9;
        this.d = messagesStorage;
        this.f9515e = arrayList;
        this.f9516f = arrayList2;
        this.f9513b = i10;
        this.f9514c = j10;
    }

    public y(TopicsController topicsController, TLRPC.messages_SavedDialogs messages_saveddialogs, long j10, a0.h hVar, int i10, int i11) {
        this.f9512a = i11;
        this.d = topicsController;
        this.f9515e = messages_saveddialogs;
        this.f9514c = j10;
        this.f9516f = hVar;
        this.f9513b = i10;
    }
}
