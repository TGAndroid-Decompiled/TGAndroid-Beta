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
    public final int f1189a;
    public final long f1190b;
    public final int f1191c;
    public final Object d;
    public final Object e;
    public final Object f1192f;

    public l8(Context context, int i10, GiftAuctionController.Auction auction, long j3, Runnable runnable) {
        this.f1189a = 10;
        this.d = context;
        this.f1191c = i10;
        this.e = auction;
        this.f1190b = j3;
        this.f1192f = runnable;
    }

    @Override
    public final void run() {
        boolean z10;
        boolean z11;
        int i10 = this.f1189a;
        TL_stories.StoryItem storyItem = null;
        String str = null;
        storyItem = null;
        int i11 = 0;
        long j3 = this.f1190b;
        int i12 = this.f1191c;
        Object obj = this.f1192f;
        Object obj2 = this.e;
        Object obj3 = this.d;
        switch (i10) {
            case 0:
                l9 l9Var = (l9) obj3;
                TLObject tLObject = (TLObject) obj2;
                String str2 = (String) obj;
                int i13 = l9Var.f1193a;
                HashSet hashSet = l9Var.f1209t;
                if (tLObject != null) {
                    TL_stories.TL_stories_stories tL_stories_stories = (TL_stories.TL_stories_stories) tLObject;
                    MessagesController.getInstance(i13).putUsers(tL_stories_stories.users, false);
                    MessagesController.getInstance(i13).putChats(tL_stories_stories.chats, false);
                    while (true) {
                        if (i11 < tL_stories_stories.stories.size()) {
                            if (tL_stories_stories.stories.get(i11).f18563id == i12) {
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
                l9Var.f1201l.edit().putStringSet("unsupported_stories_checked", hashSet).apply();
                return;
            case 1:
                ((BotForumHelper) obj3).lambda$beforeSendingFinalRequest$3((long[]) obj2, this.f1190b, this.f1191c, (Runnable) obj);
                return;
            case 2:
                ((MediaDataController) obj3).lambda$loadStickers$100((TLObject) obj2, this.f1191c, (Utilities.Callback) obj, this.f1190b);
                return;
            case 3:
                int i14 = this.f1191c;
                ((MessagesStorage) obj3).lambda$checkMessageId$154(this.f1190b, i14, (boolean[]) obj2, (CountDownLatch) obj);
                return;
            case 4:
                ((MessagesStorage) obj3).lambda$overwriteChannel$190(this.f1190b, this.f1191c, (TLRPC.TL_updates_channelDifferenceTooLong) obj2, (Runnable) obj);
                return;
            case 5:
                ((MessagesStorage) obj3).lambda$updateMessageVoiceTranscription$109(this.f1191c, this.f1190b, (TLRPC.Message) obj2, (String) obj);
                return;
            case 6:
                ((MessagesStorage) obj3).lambda$setDialogsFolderId$244((ArrayList) obj2, (ArrayList) obj, this.f1191c, this.f1190b);
                return;
            case 7:
                ((TopicsController) obj3).lambda$loadTopics$2((TLRPC.TL_messages_savedDialogs) obj2, this.f1190b, (a0.i) obj, this.f1191c);
                return;
            case 8:
                ((TopicsController) obj3).lambda$loadTopics$3((TLRPC.TL_messages_savedDialogsSlice) obj2, this.f1190b, (a0.i) obj, this.f1191c);
                return;
            case 9:
                org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) obj3;
                TLRPC.User user = (TLRPC.User) obj2;
                TLRPC.Chat chat = (TLRPC.Chat) obj;
                int i15 = u1Var.I7;
                if (user != null) {
                    u1Var.X8[i12].m(i15, user);
                    u1Var.W8[i12].setForUserOrChat(user, u1Var.X8[i12]);
                    return;
                } else if (chat != null) {
                    u1Var.X8[i12].k(i15, chat);
                    u1Var.W8[i12].setForUserOrChat(chat, u1Var.X8[i12]);
                    return;
                } else {
                    u1Var.X8[i12].n(j3, "", "");
                    return;
                }
            case 10:
                new xh.z4((Context) obj3, this.f1191c, ((GiftAuctionController.Auction) obj2).gift, null, this.f1190b, (Runnable) obj, false, false).show();
                return;
            case 11:
                yh.n nVar = (yh.n) obj;
                TLObject tLObject2 = (TLObject) obj2;
                int i16 = ((yh.o) obj3).f47827a;
                boolean[] zArr = nVar.d;
                boolean[] zArr2 = nVar.f47786b;
                ArrayList[] arrayListArr = nVar.f47785a;
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
                    String[] strArr = nVar.f47787c;
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
                tL_fulfillStarsSubscription.subscription_id = ((TL_stars.StarsSubscription) obj2).f18554id;
                tL_fulfillStarsSubscription.peer = new TLRPC.TL_inputPeerSelf();
                int i17 = this.f1191c;
                ConnectionsManager.getInstance(i17).sendRequest(tL_fulfillStarsSubscription, new j8(dVar, (org.telegram.ui.ActionBar.f3[]) obj, i17, this.f1190b, 7));
                return;
        }
    }

    public l8(Object obj, TLObject tLObject, int i10, Object obj2, long j3, int i11) {
        this.f1189a = i11;
        this.d = obj;
        this.e = tLObject;
        this.f1191c = i10;
        this.f1192f = obj2;
        this.f1190b = j3;
    }

    public l8(BotForumHelper botForumHelper, long[] jArr, long j3, int i10, Runnable runnable) {
        this.f1189a = 1;
        this.d = botForumHelper;
        this.e = jArr;
        this.f1190b = j3;
        this.f1191c = i10;
        this.f1192f = runnable;
    }

    public l8(MessagesStorage messagesStorage, int i10, long j3, TLRPC.Message message, String str) {
        this.f1189a = 5;
        this.d = messagesStorage;
        this.f1191c = i10;
        this.f1190b = j3;
        this.e = message;
        this.f1192f = str;
    }

    public l8(MessagesStorage messagesStorage, long j3, int i10, Object obj, Object obj2, int i11) {
        this.f1189a = i11;
        this.d = messagesStorage;
        this.f1190b = j3;
        this.f1191c = i10;
        this.e = obj;
        this.f1192f = obj2;
    }

    public l8(MessagesStorage messagesStorage, ArrayList arrayList, ArrayList arrayList2, int i10, long j3) {
        this.f1189a = 6;
        this.d = messagesStorage;
        this.e = arrayList;
        this.f1192f = arrayList2;
        this.f1191c = i10;
        this.f1190b = j3;
    }

    public l8(TopicsController topicsController, TLRPC.messages_SavedDialogs messages_saveddialogs, long j3, a0.i iVar, int i10, int i11) {
        this.f1189a = i11;
        this.d = topicsController;
        this.e = messages_saveddialogs;
        this.f1190b = j3;
        this.f1192f = iVar;
        this.f1191c = i10;
    }

    public l8(yh.o oVar, yh.n nVar, int i10, TLObject tLObject, long j3) {
        this.f1189a = 11;
        this.d = oVar;
        this.f1192f = nVar;
        this.f1191c = i10;
        this.e = tLObject;
        this.f1190b = j3;
    }
}
