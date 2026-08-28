package fh;

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
public final class c0 implements Runnable {
    public final int f6390a;
    public final int f6391b;
    public final long f6392c;
    public final Object d;
    public final Object f6393e;
    public final Object f6394f;

    public c0(Context context, int i9, GiftAuctionController.Auction auction, long j10, Runnable runnable) {
        this.f6390a = 0;
        this.d = context;
        this.f6391b = i9;
        this.f6393e = auction;
        this.f6392c = j10;
        this.f6394f = runnable;
    }

    @Override
    public final void run() {
        boolean z10;
        boolean z11;
        int i9 = this.f6390a;
        String str = null;
        r2 = null;
        TL_stories.StoryItem storyItem = null;
        int i10 = 0;
        long j10 = this.f6392c;
        int i11 = this.f6391b;
        Object obj = this.f6394f;
        Object obj2 = this.f6393e;
        Object obj3 = this.d;
        switch (i9) {
            case 0:
                new u6((Context) obj3, this.f6391b, ((GiftAuctionController.Auction) obj2).gift, null, this.f6392c, (Runnable) obj, false, false).show();
                return;
            case 1:
                gh.b0 b0Var = (gh.b0) obj2;
                TLObject tLObject = (TLObject) obj;
                int i12 = ((gh.c0) obj3).f7894a;
                boolean[] zArr = b0Var.d;
                boolean[] zArr2 = b0Var.f7826b;
                ArrayList[] arrayListArr = b0Var.f7825a;
                zArr[i11] = false;
                if (tLObject instanceof TL_stars.StarsStatus) {
                    TL_stars.StarsStatus starsStatus = (TL_stars.StarsStatus) tLObject;
                    MessagesController.getInstance(i12).putUsers(starsStatus.users, false);
                    MessagesController.getInstance(i12).putChats(starsStatus.chats, false);
                    arrayListArr[i11].addAll(starsStatus.history);
                    if (arrayListArr[i11].isEmpty() && !zArr2[i11]) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    zArr2[i11] = z10;
                    boolean[] zArr3 = b0Var.f7828e;
                    if ((starsStatus.flags & 1) == 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    zArr3[i11] = z11;
                    String[] strArr = b0Var.f7827c;
                    if (!z11) {
                        str = starsStatus.next_offset;
                    }
                    strArr[i11] = str;
                    NotificationCenter.getInstance(i12).lambda$postNotificationNameOnUIThread$1(NotificationCenter.botStarsTransactionsLoaded, Long.valueOf(j10));
                    return;
                }
                return;
            case 2:
                kh.d dVar = (kh.d) obj3;
                dVar.setLoading(true);
                TL_stars.TL_fulfillStarsSubscription tL_fulfillStarsSubscription = new TL_stars.TL_fulfillStarsSubscription();
                tL_fulfillStarsSubscription.subscription_id = ((TL_stars.StarsSubscription) obj2).f22608id;
                tL_fulfillStarsSubscription.peer = new TLRPC.TL_inputPeerSelf();
                int i13 = this.f6391b;
                ConnectionsManager.getInstance(i13).sendRequest(tL_fulfillStarsSubscription, new gh.v(dVar, (org.telegram.ui.ActionBar.f3[]) obj, i13, this.f6392c, 1));
                return;
            case 3:
                ih.v6 v6Var = (ih.v6) obj3;
                TLObject tLObject2 = (TLObject) obj2;
                String str2 = (String) obj;
                int i14 = v6Var.f12236a;
                HashSet hashSet = v6Var.f12253t;
                if (tLObject2 != null) {
                    TL_stories.TL_stories_stories tL_stories_stories = (TL_stories.TL_stories_stories) tLObject2;
                    MessagesController.getInstance(i14).putUsers(tL_stories_stories.users, false);
                    MessagesController.getInstance(i14).putChats(tL_stories_stories.chats, false);
                    while (true) {
                        if (i10 < tL_stories_stories.stories.size()) {
                            if (tL_stories_stories.stories.get(i10).f22617id == i11) {
                                storyItem = tL_stories_stories.stories.get(i10);
                            } else {
                                i10++;
                            }
                        }
                    }
                }
                v6Var.W.remove(str2);
                if (storyItem != null) {
                    storyItem.dialogId = j10;
                    TL_stories.TL_updateStory tL_updateStory = new TL_stories.TL_updateStory();
                    tL_updateStory.peer = MessagesController.getInstance(i14).getPeer(j10);
                    tL_updateStory.story = storyItem;
                    v6Var.Z(tL_updateStory);
                    return;
                }
                Iterator it = hashSet.iterator();
                while (true) {
                    if (it.hasNext()) {
                        String str3 = (String) it.next();
                        if (str3.endsWith(":" + j10 + ":" + i11)) {
                            hashSet.remove(str3);
                        }
                    }
                }
                hashSet.add(str2);
                v6Var.f12245l.edit().putStringSet("unsupported_stories_checked", hashSet).apply();
                return;
            case 4:
                ((BotForumHelper) obj3).lambda$beforeSendingFinalRequest$3((long[]) obj2, this.f6392c, this.f6391b, (Runnable) obj);
                return;
            case 5:
                ((MediaDataController) obj3).lambda$loadStickers$100((TLObject) obj2, this.f6391b, (Utilities.Callback) obj, this.f6392c);
                return;
            case 6:
                int i15 = this.f6391b;
                ((MessagesStorage) obj3).lambda$checkMessageId$154(this.f6392c, i15, (boolean[]) obj2, (CountDownLatch) obj);
                return;
            case 7:
                ((MessagesStorage) obj3).lambda$overwriteChannel$190(this.f6392c, this.f6391b, (TLRPC.TL_updates_channelDifferenceTooLong) obj2, (Runnable) obj);
                return;
            case 8:
                ((MessagesStorage) obj3).lambda$updateMessageVoiceTranscription$109(this.f6391b, this.f6392c, (TLRPC.Message) obj2, (String) obj);
                return;
            case 9:
                ((MessagesStorage) obj3).lambda$setDialogsFolderId$244((ArrayList) obj2, (ArrayList) obj, this.f6391b, this.f6392c);
                return;
            case 10:
                ((TopicsController) obj3).lambda$loadTopics$2((TLRPC.TL_messages_savedDialogs) obj2, this.f6392c, (a0.h) obj, this.f6391b);
                return;
            case 11:
                ((TopicsController) obj3).lambda$loadTopics$3((TLRPC.TL_messages_savedDialogsSlice) obj2, this.f6392c, (a0.h) obj, this.f6391b);
                return;
            default:
                org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) obj3;
                TLRPC.User user = (TLRPC.User) obj2;
                TLRPC.Chat chat = (TLRPC.Chat) obj;
                int i16 = t1Var.E7;
                if (user != null) {
                    t1Var.T8[i11].m(i16, user);
                    t1Var.S8[i11].setForUserOrChat(user, t1Var.T8[i11]);
                    return;
                } else if (chat != null) {
                    t1Var.T8[i11].k(i16, chat);
                    t1Var.S8[i11].setForUserOrChat(chat, t1Var.T8[i11]);
                    return;
                } else {
                    t1Var.T8[i11].n(j10, "", "");
                    return;
                }
        }
    }

    public c0(Object obj, Object obj2, int i9, Object obj3, long j10, int i10) {
        this.f6390a = i10;
        this.d = obj;
        this.f6393e = obj2;
        this.f6391b = i9;
        this.f6394f = obj3;
        this.f6392c = j10;
    }

    public c0(BotForumHelper botForumHelper, long[] jArr, long j10, int i9, Runnable runnable) {
        this.f6390a = 4;
        this.d = botForumHelper;
        this.f6393e = jArr;
        this.f6392c = j10;
        this.f6391b = i9;
        this.f6394f = runnable;
    }

    public c0(MessagesStorage messagesStorage, int i9, long j10, TLRPC.Message message, String str) {
        this.f6390a = 8;
        this.d = messagesStorage;
        this.f6391b = i9;
        this.f6392c = j10;
        this.f6393e = message;
        this.f6394f = str;
    }

    public c0(MessagesStorage messagesStorage, long j10, int i9, Object obj, Object obj2, int i10) {
        this.f6390a = i10;
        this.d = messagesStorage;
        this.f6392c = j10;
        this.f6391b = i9;
        this.f6393e = obj;
        this.f6394f = obj2;
    }

    public c0(MessagesStorage messagesStorage, ArrayList arrayList, ArrayList arrayList2, int i9, long j10) {
        this.f6390a = 9;
        this.d = messagesStorage;
        this.f6393e = arrayList;
        this.f6394f = arrayList2;
        this.f6391b = i9;
        this.f6392c = j10;
    }

    public c0(TopicsController topicsController, TLRPC.messages_SavedDialogs messages_saveddialogs, long j10, a0.h hVar, int i9, int i10) {
        this.f6390a = i10;
        this.d = topicsController;
        this.f6393e = messages_saveddialogs;
        this.f6392c = j10;
        this.f6394f = hVar;
        this.f6391b = i9;
    }
}
