package org.telegram.messenger;

import android.content.Context;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.GiftAuctionController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
public final class k0 implements Runnable {
    public final int f15569a;
    public final int f15570b;
    public final long f15571c;
    public final Object d;
    public final Object e;
    public final Object f15572f;

    public k0(Context context, int i10, GiftAuctionController.Auction auction, long j3, Runnable runnable) {
        this.f15569a = 9;
        this.d = context;
        this.f15570b = i10;
        this.e = auction;
        this.f15571c = j3;
        this.f15572f = runnable;
    }

    @Override
    public final void run() {
        boolean z10;
        boolean z11;
        int i10 = this.f15569a;
        String str = null;
        r2 = null;
        TL_stories.StoryItem storyItem = null;
        int i11 = 0;
        long j3 = this.f15571c;
        int i12 = this.f15570b;
        Object obj = this.f15572f;
        Object obj2 = this.e;
        Object obj3 = this.d;
        switch (i10) {
            case 0:
                ((BotForumHelper) obj3).lambda$beforeSendingFinalRequest$3((long[]) obj2, this.f15571c, this.f15570b, (Runnable) obj);
                return;
            case 1:
                ((MediaDataController) obj3).lambda$loadStickers$100((TLObject) obj2, this.f15570b, (Utilities.Callback) obj, this.f15571c);
                return;
            case 2:
                int i13 = this.f15570b;
                ((MessagesStorage) obj3).lambda$checkMessageId$154(this.f15571c, i13, (boolean[]) obj2, (CountDownLatch) obj);
                return;
            case 3:
                ((MessagesStorage) obj3).lambda$overwriteChannel$190(this.f15571c, this.f15570b, (TLRPC.TL_updates_channelDifferenceTooLong) obj2, (Runnable) obj);
                return;
            case 4:
                ((MessagesStorage) obj3).lambda$updateMessageVoiceTranscription$109(this.f15570b, this.f15571c, (TLRPC.Message) obj2, (String) obj);
                return;
            case 5:
                ((MessagesStorage) obj3).lambda$setDialogsFolderId$244((ArrayList) obj2, (ArrayList) obj, this.f15570b, this.f15571c);
                return;
            case 6:
                ((TopicsController) obj3).lambda$loadTopics$2((TLRPC.TL_messages_savedDialogs) obj2, this.f15571c, (a0.i) obj, this.f15570b);
                return;
            case 7:
                ((TopicsController) obj3).lambda$loadTopics$3((TLRPC.TL_messages_savedDialogsSlice) obj2, this.f15571c, (a0.i) obj, this.f15570b);
                return;
            case 8:
                org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) obj3;
                TLRPC.User user = (TLRPC.User) obj2;
                TLRPC.Chat chat = (TLRPC.Chat) obj;
                int i14 = t1Var.I7;
                if (user != null) {
                    t1Var.X8[i12].m(i14, user);
                    t1Var.W8[i12].setForUserOrChat(user, t1Var.X8[i12]);
                    return;
                } else if (chat != null) {
                    t1Var.X8[i12].k(i14, chat);
                    t1Var.W8[i12].setForUserOrChat(chat, t1Var.X8[i12]);
                    return;
                } else {
                    t1Var.X8[i12].n(j3, "", "");
                    return;
                }
            case 9:
                new wh.y4((Context) obj3, this.f15570b, ((GiftAuctionController.Auction) obj2).gift, null, this.f15571c, (Runnable) obj, false, false).show();
                return;
            case 10:
                xh.o oVar = (xh.o) obj2;
                TLObject tLObject = (TLObject) obj;
                int i15 = ((xh.p) obj3).f45843a;
                boolean[] zArr = oVar.d;
                boolean[] zArr2 = oVar.f45784b;
                ArrayList[] arrayListArr = oVar.f45783a;
                zArr[i12] = false;
                if (tLObject instanceof TL_stars.StarsStatus) {
                    TL_stars.StarsStatus starsStatus = (TL_stars.StarsStatus) tLObject;
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
                    String[] strArr = oVar.f45785c;
                    if (!z11) {
                        str = starsStatus.next_offset;
                    }
                    strArr[i12] = str;
                    NotificationCenter.getInstance(i15).lambda$postNotificationNameOnUIThread$1(NotificationCenter.botStarsTransactionsLoaded, Long.valueOf(j3));
                    return;
                }
                return;
            case 11:
                bi.d dVar = (bi.d) obj3;
                dVar.setLoading(true);
                TL_stars.TL_fulfillStarsSubscription tL_fulfillStarsSubscription = new TL_stars.TL_fulfillStarsSubscription();
                tL_fulfillStarsSubscription.subscription_id = ((TL_stars.StarsSubscription) obj2).f17426id;
                tL_fulfillStarsSubscription.peer = new TLRPC.TL_inputPeerSelf();
                int i16 = this.f15570b;
                ConnectionsManager.getInstance(i16).sendRequest(tL_fulfillStarsSubscription, new u0(dVar, (org.telegram.ui.ActionBar.h3[]) obj, i16, this.f15571c, 6));
                return;
            default:
                zh.i5 i5Var = (zh.i5) obj3;
                TLObject tLObject2 = (TLObject) obj2;
                String str2 = (String) obj;
                int i17 = i5Var.f48499a;
                HashSet hashSet = i5Var.f48515t;
                if (tLObject2 != null) {
                    TL_stories.TL_stories_stories tL_stories_stories = (TL_stories.TL_stories_stories) tLObject2;
                    MessagesController.getInstance(i17).putUsers(tL_stories_stories.users, false);
                    MessagesController.getInstance(i17).putChats(tL_stories_stories.chats, false);
                    while (true) {
                        if (i11 < tL_stories_stories.stories.size()) {
                            if (tL_stories_stories.stories.get(i11).f17435id == i12) {
                                storyItem = tL_stories_stories.stories.get(i11);
                            } else {
                                i11++;
                            }
                        }
                    }
                }
                i5Var.W.remove(str2);
                if (storyItem != null) {
                    storyItem.dialogId = j3;
                    TL_stories.TL_updateStory tL_updateStory = new TL_stories.TL_updateStory();
                    tL_updateStory.peer = MessagesController.getInstance(i17).getPeer(j3);
                    tL_updateStory.story = storyItem;
                    i5Var.Z(tL_updateStory);
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
                i5Var.f48507l.edit().putStringSet("unsupported_stories_checked", hashSet).apply();
                return;
        }
    }

    public k0(Object obj, Object obj2, int i10, Object obj3, long j3, int i11) {
        this.f15569a = i11;
        this.d = obj;
        this.e = obj2;
        this.f15570b = i10;
        this.f15572f = obj3;
        this.f15571c = j3;
    }

    public k0(BotForumHelper botForumHelper, long[] jArr, long j3, int i10, Runnable runnable) {
        this.f15569a = 0;
        this.d = botForumHelper;
        this.e = jArr;
        this.f15571c = j3;
        this.f15570b = i10;
        this.f15572f = runnable;
    }

    public k0(MessagesStorage messagesStorage, int i10, long j3, TLRPC.Message message, String str) {
        this.f15569a = 4;
        this.d = messagesStorage;
        this.f15570b = i10;
        this.f15571c = j3;
        this.e = message;
        this.f15572f = str;
    }

    public k0(MessagesStorage messagesStorage, long j3, int i10, Object obj, Object obj2, int i11) {
        this.f15569a = i11;
        this.d = messagesStorage;
        this.f15571c = j3;
        this.f15570b = i10;
        this.e = obj;
        this.f15572f = obj2;
    }

    public k0(MessagesStorage messagesStorage, ArrayList arrayList, ArrayList arrayList2, int i10, long j3) {
        this.f15569a = 5;
        this.d = messagesStorage;
        this.e = arrayList;
        this.f15572f = arrayList2;
        this.f15570b = i10;
        this.f15571c = j3;
    }

    public k0(TopicsController topicsController, TLRPC.messages_SavedDialogs messages_saveddialogs, long j3, a0.i iVar, int i10, int i11) {
        this.f15569a = i11;
        this.d = topicsController;
        this.e = messages_saveddialogs;
        this.f15571c = j3;
        this.f15572f = iVar;
        this.f15570b = i10;
    }
}
