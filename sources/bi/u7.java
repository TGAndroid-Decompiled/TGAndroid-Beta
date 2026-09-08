package bi;

import android.content.Context;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CountDownLatch;
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
public final class u7 implements Runnable {
    public final int f3827a;
    public final long f3828b;
    public final int f3829c;
    public final Object d;
    public final Object f3830e;
    public final Object f3831f;

    public u7(Context context, int i10, GiftAuctionController.Auction auction, long j3, Runnable runnable) {
        this.f3827a = 10;
        this.d = context;
        this.f3829c = i10;
        this.f3830e = auction;
        this.f3828b = j3;
        this.f3831f = runnable;
    }

    @Override
    public final void run() {
        boolean z10;
        boolean z11;
        int i10 = this.f3827a;
        TL_stories.StoryItem storyItem = null;
        String str = null;
        storyItem = null;
        int i11 = 0;
        long j3 = this.f3828b;
        int i12 = this.f3829c;
        Object obj = this.f3831f;
        Object obj2 = this.f3830e;
        Object obj3 = this.d;
        switch (i10) {
            case 0:
                u8 u8Var = (u8) obj3;
                TLObject tLObject = (TLObject) obj2;
                String str2 = (String) obj;
                int i13 = u8Var.f3832a;
                HashSet hashSet = u8Var.f3849t;
                if (tLObject != null) {
                    TL_stories.TL_stories_stories tL_stories_stories = (TL_stories.TL_stories_stories) tLObject;
                    MessagesController.getInstance(i13).putUsers(tL_stories_stories.users, false);
                    MessagesController.getInstance(i13).putChats(tL_stories_stories.chats, false);
                    while (true) {
                        if (i11 < tL_stories_stories.stories.size()) {
                            if (tL_stories_stories.stories.get(i11).f20134id == i12) {
                                storyItem = tL_stories_stories.stories.get(i11);
                            } else {
                                i11++;
                            }
                        }
                    }
                }
                u8Var.W.remove(str2);
                if (storyItem != null) {
                    storyItem.dialogId = j3;
                    TL_stories.TL_updateStory tL_updateStory = new TL_stories.TL_updateStory();
                    tL_updateStory.peer = MessagesController.getInstance(i13).getPeer(j3);
                    tL_updateStory.story = storyItem;
                    u8Var.Z(tL_updateStory);
                    return;
                }
                Iterator it = hashSet.iterator();
                while (true) {
                    if (it.hasNext()) {
                        String str3 = (String) it.next();
                        if (str3.endsWith(":" + j3 + ":" + i12)) {
                            hashSet.remove(str3);
                        }
                    }
                }
                hashSet.add(str2);
                u8Var.f3841l.edit().putStringSet("unsupported_stories_checked", hashSet).apply();
                return;
            case 1:
                ((BotForumHelper) obj3).lambda$beforeSendingFinalRequest$3((long[]) obj2, this.f3828b, this.f3829c, (Runnable) obj);
                return;
            case 2:
                ((MediaDataController) obj3).lambda$loadStickers$100((TLObject) obj2, this.f3829c, (Utilities.Callback) obj, this.f3828b);
                return;
            case 3:
                int i14 = this.f3829c;
                ((MessagesStorage) obj3).lambda$checkMessageId$154(this.f3828b, i14, (boolean[]) obj2, (CountDownLatch) obj);
                return;
            case 4:
                ((MessagesStorage) obj3).lambda$overwriteChannel$190(this.f3828b, this.f3829c, (TLRPC.TL_updates_channelDifferenceTooLong) obj2, (Runnable) obj);
                return;
            case 5:
                ((MessagesStorage) obj3).lambda$updateMessageVoiceTranscription$109(this.f3829c, this.f3828b, (TLRPC.Message) obj2, (String) obj);
                return;
            case 6:
                ((MessagesStorage) obj3).lambda$setDialogsFolderId$244((ArrayList) obj2, (ArrayList) obj, this.f3829c, this.f3828b);
                return;
            case 7:
                ((TopicsController) obj3).lambda$loadTopics$2((TLRPC.TL_messages_savedDialogs) obj2, this.f3828b, (a0.i) obj, this.f3829c);
                return;
            case 8:
                ((TopicsController) obj3).lambda$loadTopics$3((TLRPC.TL_messages_savedDialogsSlice) obj2, this.f3828b, (a0.i) obj, this.f3829c);
                return;
            case 9:
                org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) obj3;
                TLRPC.User user = (TLRPC.User) obj2;
                TLRPC.Chat chat = (TLRPC.Chat) obj;
                int i15 = t1Var.I7;
                if (user != null) {
                    t1Var.X8[i12].m(i15, user);
                    t1Var.W8[i12].setForUserOrChat(user, t1Var.X8[i12]);
                    return;
                } else if (chat != null) {
                    t1Var.X8[i12].k(i15, chat);
                    t1Var.W8[i12].setForUserOrChat(chat, t1Var.X8[i12]);
                    return;
                } else {
                    t1Var.X8[i12].n(j3, "", "");
                    return;
                }
            case 10:
                new yh.x4((Context) obj3, this.f3829c, ((GiftAuctionController.Auction) obj2).gift, null, this.f3828b, (Runnable) obj, false, false).show();
                return;
            case 11:
                zh.n nVar = (zh.n) obj;
                TLObject tLObject2 = (TLObject) obj2;
                int i16 = ((zh.o) obj3).f52379a;
                boolean[] zArr = nVar.d;
                boolean[] zArr2 = nVar.f52317b;
                ArrayList[] arrayListArr = nVar.f52316a;
                zArr[i12] = false;
                if (tLObject2 instanceof TL_stars.StarsStatus) {
                    TL_stars.StarsStatus starsStatus = (TL_stars.StarsStatus) tLObject2;
                    MessagesController.getInstance(i16).putUsers(starsStatus.users, false);
                    MessagesController.getInstance(i16).putChats(starsStatus.chats, false);
                    arrayListArr[i12].addAll(starsStatus.history);
                    if (arrayListArr[i12].isEmpty() && !zArr2[i12]) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    zArr2[i12] = z10;
                    boolean[] zArr3 = nVar.f52319e;
                    if ((starsStatus.flags & 1) == 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    zArr3[i12] = z11;
                    String[] strArr = nVar.f52318c;
                    if (!z11) {
                        str = starsStatus.next_offset;
                    }
                    strArr[i12] = str;
                    NotificationCenter.getInstance(i16).lambda$postNotificationNameOnUIThread$1(NotificationCenter.botStarsTransactionsLoaded, Long.valueOf(j3));
                    return;
                }
                return;
            default:
                di.d dVar = (di.d) obj3;
                dVar.setLoading(true);
                TL_stars.TL_fulfillStarsSubscription tL_fulfillStarsSubscription = new TL_stars.TL_fulfillStarsSubscription();
                tL_fulfillStarsSubscription.subscription_id = ((TL_stars.StarsSubscription) obj2).f20125id;
                tL_fulfillStarsSubscription.peer = new TLRPC.TL_inputPeerSelf();
                int i17 = this.f3829c;
                ConnectionsManager.getInstance(i17).sendRequest(tL_fulfillStarsSubscription, new s7(dVar, (org.telegram.ui.ActionBar.f3[]) obj, i17, this.f3828b, 7));
                return;
        }
    }

    public u7(Object obj, TLObject tLObject, int i10, Object obj2, long j3, int i11) {
        this.f3827a = i11;
        this.d = obj;
        this.f3830e = tLObject;
        this.f3829c = i10;
        this.f3831f = obj2;
        this.f3828b = j3;
    }

    public u7(BotForumHelper botForumHelper, long[] jArr, long j3, int i10, Runnable runnable) {
        this.f3827a = 1;
        this.d = botForumHelper;
        this.f3830e = jArr;
        this.f3828b = j3;
        this.f3829c = i10;
        this.f3831f = runnable;
    }

    public u7(MessagesStorage messagesStorage, int i10, long j3, TLRPC.Message message, String str) {
        this.f3827a = 5;
        this.d = messagesStorage;
        this.f3829c = i10;
        this.f3828b = j3;
        this.f3830e = message;
        this.f3831f = str;
    }

    public u7(MessagesStorage messagesStorage, long j3, int i10, Object obj, Object obj2, int i11) {
        this.f3827a = i11;
        this.d = messagesStorage;
        this.f3828b = j3;
        this.f3829c = i10;
        this.f3830e = obj;
        this.f3831f = obj2;
    }

    public u7(MessagesStorage messagesStorage, ArrayList arrayList, ArrayList arrayList2, int i10, long j3) {
        this.f3827a = 6;
        this.d = messagesStorage;
        this.f3830e = arrayList;
        this.f3831f = arrayList2;
        this.f3829c = i10;
        this.f3828b = j3;
    }

    public u7(TopicsController topicsController, TLRPC.messages_SavedDialogs messages_saveddialogs, long j3, a0.i iVar, int i10, int i11) {
        this.f3827a = i11;
        this.d = topicsController;
        this.f3830e = messages_saveddialogs;
        this.f3828b = j3;
        this.f3831f = iVar;
        this.f3829c = i10;
    }

    public u7(zh.o oVar, zh.n nVar, int i10, TLObject tLObject, long j3) {
        this.f3827a = 11;
        this.d = oVar;
        this.f3831f = nVar;
        this.f3829c = i10;
        this.f3830e = tLObject;
        this.f3828b = j3;
    }
}
