package hh;

import android.view.View;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatMessagesMetadataController;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.NotificationsController;
import org.telegram.messenger.R;
import org.telegram.messenger.Timer;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.ec;
import org.telegram.ui.Components.mc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ca0;
import org.telegram.ui.gy;
import org.telegram.ui.rn;

public final class e2 implements Runnable {

    public final int f9159a;

    public final Object f9160b;

    public final long f9161c;
    public final Object d;

    public final Object f9162e;

    public e2(u7 u7Var, Object obj, long j10, Object obj2, int i10) {
        this.f9159a = i10;
        this.d = u7Var;
        this.f9160b = obj;
        this.f9161c = j10;
        this.f9162e = obj2;
    }

    @Override
    public final void run() {
        char c10;
        boolean z10;
        int i10;
        boolean z11;
        boolean z12;
        TLRPC.ChatParticipants chatParticipants;
        ArrayList<TLRPC.ChatParticipant> arrayList;
        int i11 = this.f9159a;
        TL_stories.StoryItem storyItem = null;
        long j10 = this.f9161c;
        Object obj = this.f9162e;
        Object obj2 = this.d;
        Object obj3 = this.f9160b;
        switch (i11) {
            case 0:
                i5 i5Var = (i5) obj3;
                Utilities.Callback callback = (Utilities.Callback) obj;
                if (((u7) obj2).f10154e) {
                    i5Var.v1(j10, callback);
                } else {
                    ec ecVarQ = i5Var.getBulletinFactory().Q(R.raw.error, 36, LocaleController.formatString(R.string.UnknownErrorCode, "NO_BALANCE"));
                    ecVarQ.f28030t = true;
                    ecVarQ.j();
                }
                break;
            case 1:
                i5.d0((i5) obj3, j10, (TL_stars.TL_starGiftUnique) obj2, (gy) obj);
                break;
            case 2:
                i5 i5Var2 = (i5) obj3;
                i5Var2.getClass();
                ((boolean[]) obj2)[0] = true;
                i5Var2.f9461f0.setLoading(false);
                i5Var2.v1(j10, (Utilities.Callback) obj);
                break;
            case 3:
                ((u7) obj2).d0((MessageObject) obj, ((o5) obj3).f9826a, this.f9161c, true, true, null);
                break;
            case 4:
                u7 u7Var = (u7) obj2;
                TLObject tLObject = (TLObject) obj3;
                Utilities.Callback callback2 = (Utilities.Callback) obj;
                if (tLObject instanceof TL_stars.starGiftUpgradePreview) {
                    TL_stars.starGiftUpgradePreview stargiftupgradepreview = (TL_stars.starGiftUpgradePreview) tLObject;
                    u7Var.M.put(Long.valueOf(j10), stargiftupgradepreview);
                    callback2.run(stargiftupgradepreview);
                } else {
                    u7Var.getClass();
                    callback2.run(null);
                }
                break;
            case 5:
                u7 u7Var2 = (u7) obj2;
                Utilities.Callback callback3 = (Utilities.Callback) obj;
                TL_stars.StarGift starGift = (TL_stars.StarGift) obj3;
                if (u7Var2.f10154e) {
                    u7Var2.H(starGift, this.f9161c, null, true, callback3);
                } else {
                    u7.e("NO_BALANCE");
                    callback3.run(null);
                }
                break;
            case 6:
                CharSequence charSequenceReplaceTags = (CharSequence) obj;
                mc mcVarA0 = mc.a0((rn) obj3);
                TLRPC.Document document = ((TL_stars.StarGift) obj2).sticker;
                String string = LocaleController.getString(R.string.StarsGiftCompleted);
                if (charSequenceReplaceTags == null) {
                    charSequenceReplaceTags = AndroidUtilities.replaceTags(LocaleController.formatPluralString("StarsGiftCompletedText", (int) j10, new Object[0]));
                }
                mcVarA0.s(document, string, charSequenceReplaceTags).k(true);
                break;
            case 7:
                ((u7) obj2).h0((LaunchActivity) obj3, j10, (String) obj);
                break;
            case 8:
                jh.s6 s6Var = (jh.s6) obj3;
                TL_stories.TL_updateStory tL_updateStory = (TL_stories.TL_updateStory) obj2;
                TLRPC.User user = (TLRPC.User) obj;
                ArrayList arrayList2 = s6Var.h;
                ArrayList arrayList3 = s6Var.f13960g;
                int i12 = s6Var.f13955a;
                FileLog.d("StoriesController update stories for dialog " + j10);
                s6Var.n0(j10, Collections.singletonList(tL_updateStory.story), false);
                s6Var.l0(j10, Collections.singletonList(tL_updateStory.story), true);
                a0.h hVar = s6Var.f13961i;
                TL_stories.PeerStories peerStories = (TL_stories.PeerStories) hVar.f(j10);
                ArrayList arrayList4 = new ArrayList();
                int i13 = s6Var.f13973u;
                if (peerStories != null) {
                    TL_stories.StoryItem storyItemF = tL_updateStory.story;
                    c10 = 1;
                    if (storyItemF instanceof TL_stories.TL_storyItemDeleted) {
                        NotificationsController.getInstance(i12).processDeleteStory(j10, storyItemF.f22617id);
                    }
                    int i14 = 0;
                    while (true) {
                        if (i14 >= peerStories.stories.size()) {
                            z11 = false;
                        } else if (peerStories.stories.get(i14).f22617id != storyItemF.f22617id) {
                            i14++;
                        } else if (storyItemF instanceof TL_stories.TL_storyItemDeleted) {
                            peerStories.stories.remove(i14);
                            i0.a.v(storyItemF.f22617id, new StringBuilder("StoriesController remove story id="));
                            z11 = true;
                            z12 = true;
                        } else {
                            TL_stories.StoryItem storyItem2 = peerStories.stories.get(i14);
                            storyItemF = jh.s6.f(storyItem2, storyItemF);
                            arrayList4.add(storyItemF);
                            peerStories.stories.set(i14, storyItemF);
                            if (storyItemF.attachPath == null) {
                                storyItemF.attachPath = storyItem2.attachPath;
                            }
                            if (storyItemF.firstFramePath == null) {
                                storyItemF.firstFramePath = storyItem2.firstFramePath;
                            }
                            i0.a.v(storyItemF.f22617id, new StringBuilder("StoriesController update story id="));
                            z11 = true;
                        }
                        z12 = false;
                    }
                    if (z11) {
                        z10 = false;
                    } else if (storyItemF instanceof TL_stories.TL_storyItemDeleted) {
                        FileLog.d("StoriesController can't add new story DELETED");
                    } else if (jh.l7.w(i12, storyItemF)) {
                        FileLog.d("StoriesController can't add new story isExpired");
                    } else if (j10 > 0 && (user == null || !(user.self || s6Var.M(user)))) {
                        FileLog.d("StoriesController can't add new story user is not contact");
                    } else {
                        arrayList4.add(storyItemF);
                        peerStories.stories.add(storyItemF);
                        FileLog.d("StoriesController add new story id=" + storyItemF.f22617id + " total stories count " + peerStories.stories.size());
                        s6Var.W(j10, storyItemF);
                        s6Var.g(peerStories);
                        z10 = true;
                        z12 = true;
                    }
                    if (z12) {
                        if (!peerStories.stories.isEmpty() || s6Var.K(j10)) {
                            Collections.sort(peerStories.stories, jh.s6.X);
                        } else {
                            arrayList3.remove(peerStories);
                            arrayList2.remove(peerStories);
                            hVar.l(DialogObject.getPeerDialogId(peerStories.peer));
                            s6Var.f13973u--;
                        }
                    }
                    if (i13 != s6Var.f13973u) {
                        s6Var.f13964l.edit().putInt("total_stores", s6Var.f13973u).apply();
                    }
                    s6Var.v(arrayList3);
                    s6Var.v(arrayList2);
                    if (z10) {
                        if (tL_updateStory.story instanceof TL_stories.TL_storyItemDeleted) {
                            NotificationCenter notificationCenter = NotificationCenter.getInstance(i12);
                            int i15 = NotificationCenter.storyDeleted;
                            Long lValueOf = Long.valueOf(j10);
                            Integer numValueOf = Integer.valueOf(tL_updateStory.story.f22617id);
                            Object[] objArr = new Object[2];
                            i10 = 0;
                            objArr[0] = lValueOf;
                            objArr[c10] = numValueOf;
                            notificationCenter.lambda$postNotificationNameOnUIThread$1(i15, objArr);
                        } else {
                            i10 = 0;
                        }
                        NotificationCenter.getInstance(i12).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[i10]);
                    }
                    MessagesController.getInstance(i12).checkArchiveFolder();
                    break;
                } else {
                    c10 = 1;
                    TL_stories.StoryItem storyItem3 = tL_updateStory.story;
                    if (storyItem3 instanceof TL_stories.TL_storyItemDeleted) {
                        FileLog.d("StoriesController can't add user " + j10 + " with new story DELETED");
                    } else if (jh.l7.w(i12, storyItem3)) {
                        FileLog.d("StoriesController can't add user " + j10 + " with new story isExpired");
                    } else if (j10 > 0 && (user == null || !(user.self || s6Var.M(user)))) {
                        FileLog.d("StoriesController can't add user cause is not contact");
                    } else {
                        TL_stories.TL_peerStories tL_peerStories = new TL_stories.TL_peerStories();
                        tL_peerStories.peer = tL_updateStory.peer;
                        tL_peerStories.stories.add(tL_updateStory.story);
                        i0.a.v(tL_updateStory.story.f22617id, new StringBuilder("StoriesController add new user with story id="));
                        long peerDialogId = DialogObject.getPeerDialogId(tL_peerStories.peer);
                        s6Var.b0(peerDialogId, tL_peerStories);
                        if (peerDialogId != UserConfig.getInstance(UserConfig.selectedAccount).clientUserId) {
                            TLRPC.User user2 = MessagesController.getInstance(i12).getUser(Long.valueOf(peerDialogId));
                            s6Var.g(tL_peerStories);
                            if (user2 != null && !user2.stories_hidden) {
                                s6Var.X(tL_peerStories);
                            }
                        }
                        FileLog.d("StoriesController applyNewStories " + peerDialogId);
                        s6Var.n0(peerDialogId, tL_peerStories.stories, false);
                        s6Var.f13973u = s6Var.f13973u + 1;
                        s6Var.O(j10);
                    }
                }
                z10 = true;
                if (i13 != s6Var.f13973u) {
                    s6Var.f13964l.edit().putInt("total_stores", s6Var.f13973u).apply();
                }
                s6Var.v(arrayList3);
                s6Var.v(arrayList2);
                if (z10) {
                    if (tL_updateStory.story instanceof TL_stories.TL_storyItemDeleted) {
                        NotificationCenter notificationCenter2 = NotificationCenter.getInstance(i12);
                        int i16 = NotificationCenter.storyDeleted;
                        Long lValueOf2 = Long.valueOf(j10);
                        Integer numValueOf2 = Integer.valueOf(tL_updateStory.story.f22617id);
                        Object[] objArr2 = new Object[2];
                        i10 = 0;
                        objArr2[0] = lValueOf2;
                        objArr2[c10] = numValueOf2;
                        notificationCenter2.lambda$postNotificationNameOnUIThread$1(i16, objArr2);
                    } else {
                        i10 = 0;
                    }
                    NotificationCenter.getInstance(i12).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[i10]);
                }
                MessagesController.getInstance(i12).checkArchiveFolder();
                break;
            case 9:
                TLObject tLObject2 = (TLObject) obj2;
                ca0 ca0Var = (ca0) obj;
                jh.s6 s6Var2 = ((jh.y5) obj3).f14155c;
                int i17 = s6Var2.f13955a;
                if (tLObject2 != null) {
                    TL_stories.TL_stories_peerStories tL_stories_peerStories = (TL_stories.TL_stories_peerStories) tLObject2;
                    MessagesController.getInstance(i17).putUsers(tL_stories_peerStories.users, false);
                    MessagesController.getInstance(i17).putChats(tL_stories_peerStories.chats, false);
                    TL_stories.PeerStories peerStories2 = tL_stories_peerStories.stories;
                    if (peerStories2 != null) {
                        for (int i18 = 0; i18 < peerStories2.stories.size(); i18++) {
                            if ((peerStories2.stories.get(i18).media instanceof TLRPC.TL_messageMediaVideoStream) && !(peerStories2.stories.get(i18) instanceof TL_stories.TL_storyItemSkipped)) {
                                a0.h hVar2 = s6Var2.E;
                                storyItem = peerStories2.stories.get(i18);
                                hVar2.k(storyItem, j10);
                            }
                        }
                    }
                }
                ca0Var.accept(storyItem);
                break;
            case 10:
                TLObject tLObject3 = (TLObject) obj2;
                d5.d dVar = (d5.d) obj;
                jh.s6 s6Var3 = ((jh.z5) obj3).f14191c;
                if (tLObject3 != null) {
                    TL_stories.TL_stories_stories tL_stories_stories = (TL_stories.TL_stories_stories) tLObject3;
                    MessagesController.getInstance(s6Var3.f13955a).putUsers(tL_stories_stories.users, false);
                    MessagesController.getInstance(s6Var3.f13955a).putChats(tL_stories_stories.chats, false);
                    if (tL_stories_stories.stories.size() > 0) {
                        a0.h hVar3 = s6Var3.E;
                        storyItem = tL_stories_stories.stories.get(0);
                        hVar3.k(storyItem, j10);
                    }
                }
                dVar.accept(storyItem);
                break;
            case 11:
                long j11 = this.f9161c;
                AndroidUtilities.runOnUIThread(new e5.u((jh.k7) obj3, (View) obj2, j11, 10), 500L);
                ((jh.h7) obj).f(j11);
                break;
            case 12:
                lh.k9 k9Var = (lh.k9) obj3;
                boolean zIsChannel = ChatObject.isChannel((TLRPC.Chat) obj2);
                long j12 = this.f9161c;
                TLRPC.ChatFull chatFullLoadChatInfoInQueue = ((MessagesStorage) obj).loadChatInfoInQueue(j12, zIsChannel, true, true, 0);
                if (chatFullLoadChatInfoInQueue == null || (chatParticipants = chatFullLoadChatInfoInQueue.participants) == null || ((arrayList = chatParticipants.participants) != null && arrayList.size() < chatFullLoadChatInfoInQueue.participants_count - 1)) {
                    AndroidUtilities.runOnUIThread(new ua(k9Var, zIsChannel, j12, 1));
                } else {
                    AndroidUtilities.runOnUIThread(new e5.u(k9Var, j12, chatFullLoadChatInfoInQueue, 11));
                }
                break;
            case 13:
                ((ChatMessagesMetadataController) obj3).lambda$loadStoriesForMessages$1((MessageObject) obj2, j10, (TL_stories.StoryItem) obj);
                break;
            case 14:
                ((MediaDataController) obj3).lambda$loadReplyMessagesForMessages$170((Timer.Task) obj2, j10, (ArrayList) obj);
                break;
            case 15:
                ((MediaDataController) obj3).lambda$loadMusic$141(j10, (ArrayList) obj2, (ArrayList) obj);
                break;
            case 16:
                ((MessagesController) obj3).lambda$getGroupCall$62((TLObject) obj2, j10, (Runnable) obj);
                break;
            case 17:
                ((MessagesController) obj3).lambda$checkPromoInfoInternal$165((TLRPC.TL_help_promoData) obj2, (TLRPC.TL_messages_peerDialogs) obj, j10);
                break;
            case 18:
                ((MessagesController) obj3).lambda$updateChannelUserName$291(j10, (String) obj2, (Runnable) obj);
                break;
            case 19:
                ((MessagesController) obj3).lambda$checkChatInviter$374(j10, (ArrayList) obj2, (TLRPC.TL_channels_channelParticipant) obj);
                break;
            case 20:
                ((MessagesController) obj3).lambda$addUserToChat$300((Utilities.Callback) obj, (TLRPC.TL_messages_invitedUsers) obj2, j10);
                break;
            case 21:
                ((MessagesController) obj3).lambda$reloadMessages$73(j10, (ArrayList) obj2, (ArrayList) obj);
                break;
            case 22:
                ((MessagesStorage) obj3).lambda$deleteUserChatHistory$85((ArrayList) obj2, j10, (ArrayList) obj);
                break;
            case 23:
                ((MessagesStorage) obj3).lambda$updateMessagePollResults$101(j10, (TLRPC.Poll) obj2, (TLRPC.PollResults) obj);
                break;
            case 24:
                ((MessagesStorage) obj3).lambda$onReactionsUpdate$106((TLRPC.TL_messageReactions) obj2, (TLRPC.TL_messageReactions) obj, j10);
                break;
            case 25:
                ((MessagesStorage) obj3).lambda$getUserSync$258((TLRPC.User[]) obj2, j10, (CountDownLatch) obj);
                break;
            case 26:
                ((MessagesStorage) obj3).lambda$containsLocalDialog$179(j10, (Boolean[]) obj2, (CountDownLatch) obj);
                break;
            case 27:
                ((MessagesStorage) obj3).lambda$getChannelPtsSync$257(j10, (Integer[]) obj2, (CountDownLatch) obj);
                break;
            case 28:
                ((MessagesStorage) obj3).lambda$getChatSync$259((TLRPC.Chat[]) obj2, j10, (CountDownLatch) obj);
                break;
            default:
                ((MessagesStorage) obj3).lambda$loadPendingTasks$14((TLRPC.TL_dialog) obj2, (TLRPC.InputPeer) obj, j10);
                break;
        }
    }

    public e2(u7 u7Var, Utilities.Callback callback, TL_stars.StarGift starGift, long j10) {
        this.f9159a = 5;
        this.d = u7Var;
        this.f9162e = callback;
        this.f9160b = starGift;
        this.f9161c = j10;
    }

    public e2(Object obj, long j10, Object obj2, Object obj3, int i10) {
        this.f9159a = i10;
        this.f9160b = obj;
        this.f9161c = j10;
        this.d = obj2;
        this.f9162e = obj3;
    }

    public e2(Object obj, Object obj2, long j10, Object obj3, int i10) {
        this.f9159a = i10;
        this.f9160b = obj;
        this.d = obj2;
        this.f9161c = j10;
        this.f9162e = obj3;
    }

    public e2(Object obj, Object obj2, Object obj3, long j10, int i10) {
        this.f9159a = i10;
        this.f9160b = obj;
        this.d = obj2;
        this.f9162e = obj3;
        this.f9161c = j10;
    }

    public e2(MessagesController messagesController, Utilities.Callback callback, TLRPC.TL_messages_invitedUsers tL_messages_invitedUsers, long j10) {
        this.f9159a = 20;
        this.f9160b = messagesController;
        this.f9162e = callback;
        this.d = tL_messages_invitedUsers;
        this.f9161c = j10;
    }
}
