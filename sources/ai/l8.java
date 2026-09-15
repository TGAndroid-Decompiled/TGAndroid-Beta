package ai;

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
public final class l8 implements Runnable {
    public final int f1184a;
    public final long f1185b;
    public final int f1186c;
    public final Object d;
    public final Object e;
    public final Object f1187f;

    public l8(Context context, int i10, GiftAuctionController.Auction auction, long j3, Runnable runnable) {
        this.f1184a = 10;
        this.d = context;
        this.f1186c = i10;
        this.e = auction;
        this.f1185b = j3;
        this.f1187f = runnable;
    }

    @Override
    public final void run() {
        boolean z10;
        boolean z11;
        int i10 = this.f1184a;
        TL_stories.StoryItem storyItem = null;
        String str = null;
        storyItem = null;
        int i11 = 0;
        long j3 = this.f1185b;
        int i12 = this.f1186c;
        Object obj = this.f1187f;
        Object obj2 = this.e;
        Object obj3 = this.d;
        switch (i10) {
            case 0:
                l9 l9Var = (l9) obj3;
                TLObject tLObject = (TLObject) obj2;
                String str2 = (String) obj;
                int i13 = l9Var.f1188a;
                HashSet hashSet = l9Var.f1204t;
                if (tLObject != null) {
                    TL_stories.TL_stories_stories tL_stories_stories = (TL_stories.TL_stories_stories) tLObject;
                    MessagesController.getInstance(i13).putUsers(tL_stories_stories.users, false);
                    MessagesController.getInstance(i13).putChats(tL_stories_stories.chats, false);
                    while (true) {
                        if (i11 < tL_stories_stories.stories.size()) {
                            if (tL_stories_stories.stories.get(i11).f18348id == i12) {
                                storyItem = tL_stories_stories.stories.get(i11);
                            } else {
                                i11++;
                            }
                        }
                    }
                }
                l9Var.W.remove(str2);
                if (storyItem != null) {
                    storyItem.dialogId = j3;
                    TL_stories.TL_updateStory tL_updateStory = new TL_stories.TL_updateStory();
                    tL_updateStory.peer = MessagesController.getInstance(i13).getPeer(j3);
                    tL_updateStory.story = storyItem;
                    l9Var.Z(tL_updateStory);
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
                l9Var.f1196l.edit().putStringSet("unsupported_stories_checked", hashSet).apply();
                return;
            case 1:
                ((BotForumHelper) obj3).lambda$beforeSendingFinalRequest$3((long[]) obj2, this.f1185b, this.f1186c, (Runnable) obj);
                return;
            case 2:
                ((MediaDataController) obj3).lambda$loadStickers$100((TLObject) obj2, this.f1186c, (Utilities.Callback) obj, this.f1185b);
                return;
            case 3:
                int i14 = this.f1186c;
                ((MessagesStorage) obj3).lambda$checkMessageId$154(this.f1185b, i14, (boolean[]) obj2, (CountDownLatch) obj);
                return;
            case 4:
                ((MessagesStorage) obj3).lambda$overwriteChannel$190(this.f1185b, this.f1186c, (TLRPC.TL_updates_channelDifferenceTooLong) obj2, (Runnable) obj);
                return;
            case 5:
                ((MessagesStorage) obj3).lambda$updateMessageVoiceTranscription$109(this.f1186c, this.f1185b, (TLRPC.Message) obj2, (String) obj);
                return;
            case 6:
                ((MessagesStorage) obj3).lambda$setDialogsFolderId$244((ArrayList) obj2, (ArrayList) obj, this.f1186c, this.f1185b);
                return;
            case 7:
                ((TopicsController) obj3).lambda$loadTopics$2((TLRPC.TL_messages_savedDialogs) obj2, this.f1185b, (a0.i) obj, this.f1186c);
                return;
            case 8:
                ((TopicsController) obj3).lambda$loadTopics$3((TLRPC.TL_messages_savedDialogsSlice) obj2, this.f1185b, (a0.i) obj, this.f1186c);
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
                new xh.y4((Context) obj3, this.f1186c, ((GiftAuctionController.Auction) obj2).gift, null, this.f1185b, (Runnable) obj, false, false).show();
                return;
            case 11:
                yh.n nVar = (yh.n) obj;
                TLObject tLObject2 = (TLObject) obj2;
                int i16 = ((yh.o) obj3).f47541a;
                boolean[] zArr = nVar.d;
                boolean[] zArr2 = nVar.f47478b;
                ArrayList[] arrayListArr = nVar.f47477a;
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
                    boolean[] zArr3 = nVar.e;
                    if ((starsStatus.flags & 1) == 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    zArr3[i12] = z11;
                    String[] strArr = nVar.f47479c;
                    if (!z11) {
                        str = starsStatus.next_offset;
                    }
                    strArr[i12] = str;
                    NotificationCenter.getInstance(i16).lambda$postNotificationNameOnUIThread$1(NotificationCenter.botStarsTransactionsLoaded, Long.valueOf(j3));
                    return;
                }
                return;
            default:
                ci.d dVar = (ci.d) obj3;
                dVar.setLoading(true);
                TL_stars.TL_fulfillStarsSubscription tL_fulfillStarsSubscription = new TL_stars.TL_fulfillStarsSubscription();
                tL_fulfillStarsSubscription.subscription_id = ((TL_stars.StarsSubscription) obj2).f18339id;
                tL_fulfillStarsSubscription.peer = new TLRPC.TL_inputPeerSelf();
                int i17 = this.f1186c;
                ConnectionsManager.getInstance(i17).sendRequest(tL_fulfillStarsSubscription, new j8(dVar, (org.telegram.ui.ActionBar.f3[]) obj, i17, this.f1185b, 7));
                return;
        }
    }

    public l8(Object obj, TLObject tLObject, int i10, Object obj2, long j3, int i11) {
        this.f1184a = i11;
        this.d = obj;
        this.e = tLObject;
        this.f1186c = i10;
        this.f1187f = obj2;
        this.f1185b = j3;
    }

    public l8(BotForumHelper botForumHelper, long[] jArr, long j3, int i10, Runnable runnable) {
        this.f1184a = 1;
        this.d = botForumHelper;
        this.e = jArr;
        this.f1185b = j3;
        this.f1186c = i10;
        this.f1187f = runnable;
    }

    public l8(MessagesStorage messagesStorage, int i10, long j3, TLRPC.Message message, String str) {
        this.f1184a = 5;
        this.d = messagesStorage;
        this.f1186c = i10;
        this.f1185b = j3;
        this.e = message;
        this.f1187f = str;
    }

    public l8(MessagesStorage messagesStorage, long j3, int i10, Object obj, Object obj2, int i11) {
        this.f1184a = i11;
        this.d = messagesStorage;
        this.f1185b = j3;
        this.f1186c = i10;
        this.e = obj;
        this.f1187f = obj2;
    }

    public l8(MessagesStorage messagesStorage, ArrayList arrayList, ArrayList arrayList2, int i10, long j3) {
        this.f1184a = 6;
        this.d = messagesStorage;
        this.e = arrayList;
        this.f1187f = arrayList2;
        this.f1186c = i10;
        this.f1185b = j3;
    }

    public l8(TopicsController topicsController, TLRPC.messages_SavedDialogs messages_saveddialogs, long j3, a0.i iVar, int i10, int i11) {
        this.f1184a = i11;
        this.d = topicsController;
        this.e = messages_saveddialogs;
        this.f1185b = j3;
        this.f1187f = iVar;
        this.f1186c = i10;
    }

    public l8(yh.o oVar, yh.n nVar, int i10, TLObject tLObject, long j3) {
        this.f1184a = 11;
        this.d = oVar;
        this.f1187f = nVar;
        this.f1186c = i10;
        this.e = tLObject;
        this.f1185b = j3;
    }
}
