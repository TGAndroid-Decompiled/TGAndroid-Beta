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
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.TelegramMediaSession;
import org.telegram.messenger.TopicsController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
public final class m8 implements Runnable {
    public final int f1262a;
    public final long f1263b;
    public final int f1264c;
    public final Object d;
    public final Object e;
    public final Object f1265f;

    public m8(Context context, int i10, GiftAuctionController.Auction auction, long j3, Runnable runnable) {
        this.f1262a = 11;
        this.d = context;
        this.f1264c = i10;
        this.e = auction;
        this.f1263b = j3;
        this.f1265f = runnable;
    }

    @Override
    public final void run() {
        boolean z10;
        boolean z11;
        int i10 = this.f1262a;
        TL_stories.StoryItem storyItem = null;
        String str = null;
        storyItem = null;
        int i11 = 0;
        long j3 = this.f1263b;
        int i12 = this.f1264c;
        Object obj = this.f1265f;
        Object obj2 = this.e;
        Object obj3 = this.d;
        switch (i10) {
            case 0:
                l9 l9Var = (l9) obj3;
                TLObject tLObject = (TLObject) obj2;
                String str2 = (String) obj;
                int i13 = l9Var.f1192a;
                HashSet hashSet = l9Var.f1208t;
                if (tLObject != null) {
                    TL_stories.TL_stories_stories tL_stories_stories = (TL_stories.TL_stories_stories) tLObject;
                    MessagesController.getInstance(i13).putUsers(tL_stories_stories.users, false);
                    MessagesController.getInstance(i13).putChats(tL_stories_stories.chats, false);
                    while (true) {
                        if (i11 < tL_stories_stories.stories.size()) {
                            if (tL_stories_stories.stories.get(i11).f18570id == i12) {
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
                l9Var.f1200l.edit().putStringSet("unsupported_stories_checked", hashSet).apply();
                return;
            case 1:
                ((BotForumHelper) obj3).lambda$beforeSendingFinalRequest$3((long[]) obj2, this.f1263b, this.f1264c, (Runnable) obj);
                return;
            case 2:
                ((MediaDataController) obj3).lambda$loadStickers$100((TLObject) obj2, this.f1264c, (Utilities.Callback) obj, this.f1263b);
                return;
            case 3:
                ((MessagesStorage) obj3).lambda$checkMessageId$154(this.f1263b, this.f1264c, (boolean[]) obj2, (CountDownLatch) obj);
                return;
            case 4:
                ((MessagesStorage) obj3).lambda$overwriteChannel$190(this.f1263b, this.f1264c, (TLRPC.TL_updates_channelDifferenceTooLong) obj2, (Runnable) obj);
                return;
            case 5:
                ((MessagesStorage) obj3).lambda$updateMessageVoiceTranscription$109(this.f1264c, this.f1263b, (TLRPC.Message) obj2, (String) obj);
                return;
            case 6:
                ((MessagesStorage) obj3).lambda$setDialogsFolderId$244((ArrayList) obj2, (ArrayList) obj, this.f1264c, this.f1263b);
                return;
            case 7:
                ((TelegramMediaSession) obj3).lambda$loadMusicForDialog$6(this.f1264c, this.f1263b, (ArrayList) obj2, (ArrayList) obj);
                return;
            case 8:
                ((TopicsController) obj3).lambda$loadTopics$2((TLRPC.TL_messages_savedDialogs) obj2, this.f1263b, (a0.i) obj, this.f1264c);
                return;
            case 9:
                ((TopicsController) obj3).lambda$loadTopics$3((TLRPC.TL_messages_savedDialogsSlice) obj2, this.f1263b, (a0.i) obj, this.f1264c);
                return;
            case 10:
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
                    u1Var.X8[i12].n(j3, "", "");
                    return;
                }
            case 11:
                new xh.z4((Context) obj3, this.f1264c, ((GiftAuctionController.Auction) obj2).gift, null, this.f1263b, (Runnable) obj, false, false).show();
                return;
            case 12:
                yh.n nVar = (yh.n) obj;
                TLObject tLObject2 = (TLObject) obj2;
                int i15 = ((yh.o) obj3).f47783a;
                boolean[] zArr = nVar.d;
                boolean[] zArr2 = nVar.f47752b;
                ArrayList[] arrayListArr = nVar.f47751a;
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
                    boolean[] zArr3 = nVar.e;
                    if ((starsStatus.flags & 1) == 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    zArr3[i12] = z11;
                    String[] strArr = nVar.f47753c;
                    if (!z11) {
                        str = starsStatus.next_offset;
                    }
                    strArr[i12] = str;
                    NotificationCenter.getInstance(i15).lambda$postNotificationNameOnUIThread$1(NotificationCenter.botStarsTransactionsLoaded, Long.valueOf(j3));
                    return;
                }
                return;
            default:
                ci.d dVar = (ci.d) obj3;
                dVar.setLoading(true);
                TL_stars.TL_fulfillStarsSubscription tL_fulfillStarsSubscription = new TL_stars.TL_fulfillStarsSubscription();
                tL_fulfillStarsSubscription.subscription_id = ((TL_stars.StarsSubscription) obj2).f18561id;
                tL_fulfillStarsSubscription.peer = new TLRPC.TL_inputPeerSelf();
                int i16 = this.f1264c;
                ConnectionsManager.getInstance(i16).sendRequest(tL_fulfillStarsSubscription, new k8(dVar, (org.telegram.ui.ActionBar.e3[]) obj, i16, this.f1263b, 7));
                return;
        }
    }

    public m8(Object obj, int i10, long j3, Object obj2, Serializable serializable, int i11) {
        this.f1262a = i11;
        this.d = obj;
        this.f1264c = i10;
        this.f1263b = j3;
        this.e = obj2;
        this.f1265f = serializable;
    }

    public m8(Object obj, TLObject tLObject, int i10, Object obj2, long j3, int i11) {
        this.f1262a = i11;
        this.d = obj;
        this.e = tLObject;
        this.f1264c = i10;
        this.f1265f = obj2;
        this.f1263b = j3;
    }

    public m8(BotForumHelper botForumHelper, long[] jArr, long j3, int i10, Runnable runnable) {
        this.f1262a = 1;
        this.d = botForumHelper;
        this.e = jArr;
        this.f1263b = j3;
        this.f1264c = i10;
        this.f1265f = runnable;
    }

    public m8(MessagesStorage messagesStorage, long j3, int i10, Object obj, Object obj2, int i11) {
        this.f1262a = i11;
        this.d = messagesStorage;
        this.f1263b = j3;
        this.f1264c = i10;
        this.e = obj;
        this.f1265f = obj2;
    }

    public m8(MessagesStorage messagesStorage, ArrayList arrayList, ArrayList arrayList2, int i10, long j3) {
        this.f1262a = 6;
        this.d = messagesStorage;
        this.e = arrayList;
        this.f1265f = arrayList2;
        this.f1264c = i10;
        this.f1263b = j3;
    }

    public m8(TopicsController topicsController, TLRPC.messages_SavedDialogs messages_saveddialogs, long j3, a0.i iVar, int i10, int i11) {
        this.f1262a = i11;
        this.d = topicsController;
        this.e = messages_saveddialogs;
        this.f1263b = j3;
        this.f1265f = iVar;
        this.f1264c = i10;
    }

    public m8(yh.o oVar, yh.n nVar, int i10, TLObject tLObject, long j3) {
        this.f1262a = 12;
        this.d = oVar;
        this.f1265f = nVar;
        this.f1264c = i10;
        this.e = tLObject;
        this.f1263b = j3;
    }
}
