package gh;

import android.content.Context;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.concurrent.CountDownLatch;
import jh.s6;
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

public final class a0 implements Runnable {

    public final int f7126a;

    public final int f7127b;

    public final long f7128c;
    public final Object d;

    public final Object f7129e;

    public final Object f7130f;

    public a0(Context context, int i10, GiftAuctionController.Auction auction, long j10, Runnable runnable) {
        this.f7126a = 0;
        this.d = context;
        this.f7127b = i10;
        this.f7129e = auction;
        this.f7128c = j10;
        this.f7130f = runnable;
    }

    @Override
    public final void run() {
        int i10 = this.f7126a;
        storyItem = null;
        TL_stories.StoryItem storyItem = null;
        long j10 = this.f7128c;
        int i11 = this.f7127b;
        Object obj = this.f7130f;
        Object obj2 = this.f7129e;
        Object obj3 = this.d;
        switch (i10) {
            case 0:
                new m6((Context) obj3, this.f7127b, ((GiftAuctionController.Auction) obj2).gift, null, this.f7128c, (Runnable) obj, false, false).show();
                break;
            case 1:
                hh.b0 b0Var = (hh.b0) obj2;
                TLObject tLObject = (TLObject) obj;
                int i12 = ((hh.c0) obj3).f9049a;
                boolean[] zArr = b0Var.d;
                boolean[] zArr2 = b0Var.f8984b;
                ArrayList[] arrayListArr = b0Var.f8983a;
                zArr[i11] = false;
                if (tLObject instanceof TL_stars.StarsStatus) {
                    TL_stars.StarsStatus starsStatus = (TL_stars.StarsStatus) tLObject;
                    MessagesController.getInstance(i12).putUsers(starsStatus.users, false);
                    MessagesController.getInstance(i12).putChats(starsStatus.chats, false);
                    arrayListArr[i11].addAll(starsStatus.history);
                    zArr2[i11] = !arrayListArr[i11].isEmpty() || zArr2[i11];
                    boolean[] zArr3 = b0Var.f8986e;
                    boolean z10 = (starsStatus.flags & 1) == 0;
                    zArr3[i11] = z10;
                    b0Var.f8985c[i11] = z10 ? null : starsStatus.next_offset;
                    NotificationCenter.getInstance(i12).lambda$postNotificationNameOnUIThread$1(NotificationCenter.botStarsTransactionsLoaded, Long.valueOf(j10));
                }
                break;
            case 2:
                lh.d dVar = (lh.d) obj3;
                dVar.setLoading(true);
                TL_stars.TL_fulfillStarsSubscription tL_fulfillStarsSubscription = new TL_stars.TL_fulfillStarsSubscription();
                tL_fulfillStarsSubscription.subscription_id = ((TL_stars.StarsSubscription) obj2).f22608id;
                tL_fulfillStarsSubscription.peer = new TLRPC.TL_inputPeerSelf();
                int i13 = this.f7127b;
                ConnectionsManager.getInstance(i13).sendRequest(tL_fulfillStarsSubscription, new hh.v(dVar, (org.telegram.ui.ActionBar.e3[]) obj, i13, this.f7128c, 1));
                break;
            case 3:
                s6 s6Var = (s6) obj3;
                TLObject tLObject2 = (TLObject) obj2;
                String str = (String) obj;
                int i14 = s6Var.f13955a;
                HashSet<String> hashSet = s6Var.f13972t;
                if (tLObject2 != null) {
                    TL_stories.TL_stories_stories tL_stories_stories = (TL_stories.TL_stories_stories) tLObject2;
                    MessagesController.getInstance(i14).putUsers(tL_stories_stories.users, false);
                    MessagesController.getInstance(i14).putChats(tL_stories_stories.chats, false);
                    for (int i15 = 0; i15 < tL_stories_stories.stories.size(); i15++) {
                        if (tL_stories_stories.stories.get(i15).f22617id == i11) {
                            storyItem = tL_stories_stories.stories.get(i15);
                        }
                    }
                }
                s6Var.W.remove(str);
                if (storyItem != null) {
                    storyItem.dialogId = j10;
                    TL_stories.TL_updateStory tL_updateStory = new TL_stories.TL_updateStory();
                    tL_updateStory.peer = MessagesController.getInstance(i14).getPeer(j10);
                    tL_updateStory.story = storyItem;
                    s6Var.Z(tL_updateStory);
                } else {
                    for (String str2 : hashSet) {
                        if (str2.endsWith(":" + j10 + ":" + i11)) {
                            hashSet.remove(str2);
                            hashSet.add(str);
                            s6Var.f13964l.edit().putStringSet("unsupported_stories_checked", hashSet).apply();
                            break;
                        }
                    }
                    hashSet.add(str);
                    s6Var.f13964l.edit().putStringSet("unsupported_stories_checked", hashSet).apply();
                }
                break;
            case 4:
                ((BotForumHelper) obj3).lambda$beforeSendingFinalRequest$3((long[]) obj2, this.f7128c, this.f7127b, (Runnable) obj);
                break;
            case 5:
                ((MediaDataController) obj3).lambda$loadStickers$100((TLObject) obj2, this.f7127b, (Utilities.Callback) obj, this.f7128c);
                break;
            case 6:
                ((MessagesStorage) obj3).lambda$checkMessageId$154(this.f7128c, this.f7127b, (boolean[]) obj2, (CountDownLatch) obj);
                break;
            case 7:
                ((MessagesStorage) obj3).lambda$overwriteChannel$190(this.f7128c, this.f7127b, (TLRPC.TL_updates_channelDifferenceTooLong) obj2, (Runnable) obj);
                break;
            case 8:
                ((MessagesStorage) obj3).lambda$updateMessageVoiceTranscription$109(this.f7127b, this.f7128c, (TLRPC.Message) obj2, (String) obj);
                break;
            case 9:
                ((MessagesStorage) obj3).lambda$setDialogsFolderId$244((ArrayList) obj2, (ArrayList) obj, this.f7127b, this.f7128c);
                break;
            case 10:
                ((TopicsController) obj3).lambda$loadTopics$2((TLRPC.TL_messages_savedDialogs) obj2, this.f7128c, (a0.h) obj, this.f7127b);
                break;
            case 11:
                ((TopicsController) obj3).lambda$loadTopics$3((TLRPC.TL_messages_savedDialogsSlice) obj2, this.f7128c, (a0.h) obj, this.f7127b);
                break;
            default:
                org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) obj3;
                TLRPC.User user = (TLRPC.User) obj2;
                TLRPC.Chat chat = (TLRPC.Chat) obj;
                int i16 = s1Var.E7;
                if (user != null) {
                    s1Var.T8[i11].m(i16, user);
                    s1Var.S8[i11].setForUserOrChat(user, s1Var.T8[i11]);
                } else if (chat != null) {
                    s1Var.T8[i11].k(i16, chat);
                    s1Var.S8[i11].setForUserOrChat(chat, s1Var.T8[i11]);
                } else {
                    s1Var.T8[i11].n(j10, "", "");
                }
                break;
        }
    }

    public a0(Object obj, Object obj2, int i10, Object obj3, long j10, int i11) {
        this.f7126a = i11;
        this.d = obj;
        this.f7129e = obj2;
        this.f7127b = i10;
        this.f7130f = obj3;
        this.f7128c = j10;
    }

    public a0(BotForumHelper botForumHelper, long[] jArr, long j10, int i10, Runnable runnable) {
        this.f7126a = 4;
        this.d = botForumHelper;
        this.f7129e = jArr;
        this.f7128c = j10;
        this.f7127b = i10;
        this.f7130f = runnable;
    }

    public a0(MessagesStorage messagesStorage, int i10, long j10, TLRPC.Message message, String str) {
        this.f7126a = 8;
        this.d = messagesStorage;
        this.f7127b = i10;
        this.f7128c = j10;
        this.f7129e = message;
        this.f7130f = str;
    }

    public a0(MessagesStorage messagesStorage, long j10, int i10, Object obj, Object obj2, int i11) {
        this.f7126a = i11;
        this.d = messagesStorage;
        this.f7128c = j10;
        this.f7127b = i10;
        this.f7129e = obj;
        this.f7130f = obj2;
    }

    public a0(MessagesStorage messagesStorage, ArrayList arrayList, ArrayList arrayList2, int i10, long j10) {
        this.f7126a = 9;
        this.d = messagesStorage;
        this.f7129e = arrayList;
        this.f7130f = arrayList2;
        this.f7127b = i10;
        this.f7128c = j10;
    }

    public a0(TopicsController topicsController, TLRPC.messages_SavedDialogs messages_saveddialogs, long j10, a0.h hVar, int i10, int i11) {
        this.f7126a = i11;
        this.d = topicsController;
        this.f7129e = messages_saveddialogs;
        this.f7128c = j10;
        this.f7130f = hVar;
        this.f7127b = i10;
    }
}
