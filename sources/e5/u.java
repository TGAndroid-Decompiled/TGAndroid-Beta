package e5;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Point;
import android.graphics.RectF;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import cg.b2;
import d5.g0;
import f9.z;
import gh.e1;
import gh.k2;
import h3.h0;
import h3.k0;
import hh.e9;
import hh.i5;
import java.util.ArrayList;
import java.util.Locale;
import jh.b7;
import jh.c7;
import jh.f7;
import jh.i9;
import jh.k7;
import jh.r6;
import jh.s6;
import lh.a1;
import lh.k9;
import lh.z0;
import lh.z7;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.SharedPrefsHelper;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.video.VideoFramesRewinder;
import org.telegram.messenger.voip.NativeInstance;
import org.telegram.messenger.voip.VideoCapturerDevice;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.e3;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.bm;
import org.telegram.ui.Components.dm;
import org.telegram.ui.Components.em;
import org.telegram.ui.Components.gi;
import org.telegram.ui.Components.gw0;
import org.telegram.ui.Components.hu0;
import org.telegram.ui.Components.mc;
import org.telegram.ui.Components.of;
import org.telegram.ui.Components.pg;
import org.telegram.ui.Components.s70;
import org.telegram.ui.Components.y4;
import org.telegram.ui.Components.yl;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.dn;
import org.telegram.ui.gy;
import org.telegram.ui.lr;
import org.telegram.ui.rn;
import org.telegram.ui.s50;
import org.telegram.ui.zt;

public final class u implements Runnable {

    public final int f5297a;

    public final long f5298b;

    public final Object f5299c;
    public final Object d;

    public u(Object obj, long j10, Object obj2, int i10) {
        this.f5297a = i10;
        this.f5299c = obj;
        this.f5298b = j10;
        this.d = obj2;
    }

    @Override
    public final void run() {
        boolean z10;
        int i10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        bm bmVar;
        int i11 = this.f5297a;
        int i12 = 2;
        int i13 = 1;
        int i14 = 0;
        long j10 = this.f5298b;
        Object obj = this.d;
        Object obj2 = this.f5299c;
        switch (i11) {
            case 0:
                h0 h0Var = (h0) ((xe.b) obj2).f49393c;
                int i15 = g0.f4795a;
                k0 k0Var = h0Var.f7870a;
                i3.f fVar = k0Var.f7987r;
                i3.a aVarK = fVar.k();
                fVar.l(aVarK, 26, new ag.h0(aVarK, obj, j10));
                if (k0Var.R == obj) {
                    k0Var.f7980l.e(26, new z(17));
                }
                break;
            case 1:
                k2 k2Var = (k2) obj2;
                Utilities.Callback callback = (Utilities.Callback) obj;
                k2Var.getClass();
                n2 n2VarU = LaunchActivity.U();
                if (n2VarU != null) {
                    k2Var.dismiss();
                    if (callback != null) {
                        callback.run(Boolean.FALSE);
                    }
                    Bundle bundle = new Bundle();
                    bundle.putLong("user_id", j10);
                    bundle.putBoolean("open_gifts", true);
                    n2VarU.presentFragment(new ProfileActivity(bundle, null));
                    break;
                }
                break;
            case 2:
                i5 i5Var = (i5) obj2;
                Runnable runnable = (Runnable) obj;
                i5Var.p2((int) j10, i5Var.getContext(), true);
                if (runnable != null) {
                    runnable.run();
                }
                break;
            case 3:
                i5 i5Var2 = (i5) obj2;
                i5Var2.getClass();
                ((we.d) obj).b();
                i5Var2.p2((int) j10, i5Var2.getContext(), true);
                break;
            case 4:
                TL_stories.Boost boost = (TL_stories.Boost) obj;
                e3 e3Var = ((e3[]) obj2)[0];
                if (e3Var != null) {
                    e3Var.dismiss();
                }
                n2 n2VarU2 = LaunchActivity.U();
                if (n2VarU2 != null) {
                    n2VarU2.presentFragment(rn.Q9(boost.giveaway_msg_id, j10));
                    break;
                }
                break;
            case 5:
                jh.p pVar = (jh.p) obj2;
                jh.o oVar = (jh.o) obj;
                s6 s6Var = pVar.f13795s;
                ArrayList arrayList = pVar.f13802x;
                gy gyVar = pVar.f13772a0;
                if (gyVar != null && gyVar.getParentActivity() != null) {
                    int i16 = oVar.f13721b;
                    ArrayList arrayList2 = new ArrayList();
                    int i17 = 0;
                    while (true) {
                        if (i17 < arrayList.size()) {
                            long j11 = ((jh.m) arrayList.get(i17)).f13646c;
                            if (j11 == UserConfig.getInstance(pVar.f13780f).clientUserId || !s6Var.J(j11)) {
                                i17++;
                            } else {
                                z10 = false;
                            }
                        } else {
                            z10 = true;
                        }
                    }
                    if (!oVar.B || (z10 && arrayList.size() != 1)) {
                        if (oVar.B || !s6Var.J(oVar.A)) {
                            int i18 = i16;
                            for (int i19 = 0; i19 < arrayList.size(); i19++) {
                                if (s6Var.I(((jh.m) arrayList.get(i19)).f13646c)) {
                                    arrayList2.add(Long.valueOf(((jh.m) arrayList.get(i19)).f13646c));
                                } else if (i19 <= i18) {
                                    i18--;
                                }
                            }
                            i10 = i18;
                            z11 = false;
                        } else {
                            int size = i16;
                            for (int i20 = 0; i20 < arrayList.size(); i20++) {
                                long j12 = ((jh.m) arrayList.get(i20)).f13646c;
                                if (!oVar.B && s6Var.J(j12)) {
                                    arrayList2.add(Long.valueOf(j12));
                                }
                                if (j12 == oVar.A) {
                                    size = arrayList2.size() - 1;
                                }
                            }
                            i10 = size;
                            z11 = false;
                            z12 = true;
                        }
                        i9 orCreateStoryViewer = gyVar.getOrCreateStoryViewer();
                        orCreateStoryViewer.s(new b2(pVar, j10, 4));
                        Context context = pVar.getContext();
                        b7 b7VarA = b7.a(pVar.h);
                        b7VarA.f13121e = new eh.q(i13, pVar, z11);
                        if (pVar.f13773b == 1) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        b7VarA.f13122f = z13;
                        b7VarA.h = z12;
                        b7VarA.f13123n = z11;
                        b7VarA.f13124r = true;
                        orCreateStoryViewer.F(context, null, arrayList2, i10, null, null, b7VarA, false);
                    } else {
                        arrayList2.add(Long.valueOf(oVar.A));
                        i10 = i16;
                        z11 = true;
                    }
                    z12 = false;
                    i9 orCreateStoryViewer2 = gyVar.getOrCreateStoryViewer();
                    orCreateStoryViewer2.s(new b2(pVar, j10, 4));
                    Context context2 = pVar.getContext();
                    b7 b7VarA2 = b7.a(pVar.h);
                    b7VarA2.f13121e = new eh.q(i13, pVar, z11);
                    if (pVar.f13773b == 1) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    b7VarA2.f13122f = z13;
                    b7VarA2.h = z12;
                    b7VarA2.f13123n = z11;
                    b7VarA2.f13124r = true;
                    orCreateStoryViewer2.F(context2, null, arrayList2, i10, null, null, b7VarA2, false);
                    break;
                }
                break;
            case 6:
                s6 s6Var2 = (s6) obj2;
                TLObject tLObject = (TLObject) obj;
                int i21 = s6Var2.f13955a;
                s6Var2.C.remove(Long.valueOf(j10));
                if (tLObject != null) {
                    TL_stories.TL_stories_peerStories tL_stories_peerStories = (TL_stories.TL_stories_peerStories) tLObject;
                    MessagesController.getInstance(i21).putUsers(tL_stories_peerStories.users, false);
                    TLRPC.User user = MessagesController.getInstance(i21).getUser(Long.valueOf(j10));
                    TL_stories.PeerStories peerStories = tL_stories_peerStories.stories;
                    s6Var2.f13961i.k(peerStories, DialogObject.getPeerDialogId(peerStories.peer));
                    if (user != null && (s6Var2.M(user) || user.self)) {
                        s6Var2.g(peerStories);
                        f7 f7Var = s6Var2.f13963k;
                        f7Var.f13332b.getStorageQueue().postRunnable(new c7(f7Var, peerStories, 0));
                    }
                    StringBuilder sbQ = a9.p.q(j10, "StoriesController processAllStoriesResponse dialogId=", " overwrite stories ");
                    sbQ.append(tL_stories_peerStories.stories.stories.size());
                    FileLog.d(sbQ.toString());
                    NotificationCenter.getInstance(i21).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
                    break;
                }
                break;
            case 7:
                r6 r6Var = (r6) obj2;
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) obj;
                s6 s6Var3 = r6Var.I;
                a1 a1Var = s6Var3.f13974w;
                r6Var.d = true;
                z7 z7Var = r6Var.f13907c;
                if (z7Var.f17238w) {
                    a1Var.c(z7Var);
                }
                z7Var.f17238w = false;
                z7Var.f17240x = null;
                if (z7Var.f17197b0) {
                    z14 = false;
                } else {
                    ArrayList arrayList3 = a1Var.f15625b;
                    if (z7Var.f17235u || storyItem.media == null) {
                        z14 = false;
                    } else {
                        ArrayList arrayList4 = new ArrayList();
                        int size2 = arrayList3.size();
                        int i22 = 0;
                        while (i22 < size2) {
                            Object obj3 = arrayList3.get(i22);
                            i22++;
                            z7 z7Var2 = (z7) obj3;
                            if (z7Var2.f17209g && z7Var2.f17207f == storyItem.f22617id) {
                                arrayList4.add(z7Var2);
                            }
                        }
                        a1Var.b(arrayList4);
                        a1Var.e(z7Var);
                        z7Var.f17196b = Utilities.random.nextLong();
                        z0 z0Var = new z0(z7Var);
                        z7Var.f17209g = true;
                        z0Var.G = true;
                        z7Var.f17204e = j10;
                        z0Var.I = j10;
                        int i23 = storyItem.f22617id;
                        z7Var.f17207f = i23;
                        z0Var.H = i23;
                        long j13 = ((long) storyItem.expire_date) * 1000;
                        z7Var.J = j13;
                        z0Var.L = j13;
                        TLRPC.MessageMedia messageMedia = storyItem.media;
                        TLRPC.Document document = messageMedia.document;
                        if (document != null) {
                            long j14 = document.f22386id;
                            z7Var.H = j14;
                            z0Var.J = j14;
                        } else {
                            TLRPC.Photo photo = messageMedia.photo;
                            if (photo != null) {
                                long j15 = photo.f22404id;
                                z7Var.I = j15;
                                z0Var.K = j15;
                            }
                        }
                        arrayList3.remove(z7Var);
                        z14 = false;
                        arrayList3.add(0, z7Var);
                        a1Var.a(z0Var);
                    }
                }
                if (!r6Var.f13906b) {
                    s6Var3.R = z14;
                    s6Var3.S = null;
                }
                break;
            case 8:
                ArrayList arrayList5 = (ArrayList) obj;
                MessagesStorage messagesStorage = ((f7) obj2).f13332b;
                SQLiteDatabase database = messagesStorage.getDatabase();
                try {
                    String strJoin = TextUtils.join(", ", arrayList5);
                    Locale locale = Locale.US;
                    database.executeFast("DELETE FROM stories WHERE dialog_id = " + j10 + " AND story_id IN (" + strJoin + ")").stepThis().dispose();
                } catch (Throwable th) {
                    messagesStorage.checkSQLException(th);
                    return;
                }
                break;
            case 9:
                ((f7) obj2).l(j10, (TL_stories.StoryItem) obj);
                break;
            case 10:
                k7 k7Var = (k7) obj2;
                k7Var.getClass();
                ((View) obj).invalidate();
                MessagesController.getInstance(k7Var.f13591a).getStoriesController().e0(j10, false);
                break;
            case 11:
                k9 k9Var = (k9) obj2;
                k9Var.getClass();
                k9Var.d(j10, ((TLRPC.ChatFull) obj).participants);
                break;
            case 12:
                ((long[]) obj2)[0] = j10;
                ((e1) obj).run();
                break;
            case 13:
                ((VideoFramesRewinder) obj2).lambda$new$1((ArrayList) obj, j10);
                break;
            case 14:
                ((NativeInstance) obj2).lambda$onParticipantDescriptionsRequired$2(j10, (int[]) obj);
                break;
            case 15:
                ((VideoCapturerDevice) obj2).lambda$init$5(j10, (String) obj);
                break;
            case 16:
                ((VideoCapturerDevice) obj2).lambda$init$2(j10, (Point) obj);
                break;
            case 17:
                rn rnVar = (rn) obj2;
                rnVar.getMessagesController().lambda$checkDeletingTask$84(this.f5298b, rnVar.P5, ((MessageObject) obj).getId());
                break;
            case 18:
                rn rnVar2 = ((dn) obj2).f37446a;
                y4.t0(SendMessagesHelper.getInstance(((n2) rnVar2).currentAccount).sendMessage((ArrayList) obj, this.f5298b, false, false, true, 0, 0, null, -1, 0L, rnVar2.N8(), rnVar2.f42006c5), rnVar2, null);
                break;
            case 19:
                lr lrVar = (lr) obj2;
                TLRPC.User user2 = (TLRPC.User) obj;
                lrVar.getMessagesController().deleteParticipantFromChat(lrVar.J, user2);
                lrVar.v0(j10);
                if (lrVar.f40217r != null && user2 != null && mc.a(lrVar)) {
                    mc.D(lrVar, user2, lrVar.f40217r.title).j();
                    break;
                }
                break;
            case 20:
                Runnable runnable2 = (Runnable) obj2;
                n2 n2Var = (n2) obj;
                if (runnable2 != null) {
                    runnable2.run();
                }
                if (n2Var != null) {
                    n2Var.presentFragment(rn.R9(j10));
                }
                break;
            case 21:
                int i24 = ChatActivityEnterView.f26070i5;
                ((of) obj).run();
                SharedPrefsHelper.setWebViewConfirmShown(((ChatActivityEnterView) obj2).M, j10, true);
                break;
            case 22:
                gi giVar = (gi) obj2;
                y4.M(giVar.getContext(), j10, new pg(giVar, 14), (c6) obj);
                break;
            case 23:
                dm dmVar = (dm) obj2;
                bm bmVar2 = (bm) obj;
                em emVar = dmVar.L;
                if (!emVar.f28087r.G1 && dmVar.f27808y == j10 && (bmVar = dmVar.B) == bmVar2) {
                    emVar.F = bmVar;
                    emVar.I = bmVar.f27137a.f27483a;
                    emVar.G = false;
                    dmVar.C = 0.0f;
                    dmVar.invalidate();
                    ValueAnimator valueAnimator = emVar.H;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    emVar.H = valueAnimatorOfFloat;
                    valueAnimatorOfFloat.addUpdateListener(new yl(dmVar, 0));
                    emVar.H.setDuration(200L);
                    emVar.H.start();
                    bm bmVar3 = emVar.F;
                    RectF rectFF = bmVar3.f(bmVar3.e());
                    RectF rectFD = emVar.F.d();
                    emVar.C = (((emVar.f28091y - rectFF.left) / rectFF.width()) + 0.5f) / 2.0f;
                    emVar.B = (emVar.A - rectFF.top) / rectFF.height();
                    emVar.D = rectFD.width();
                    emVar.E = rectFD.height();
                    try {
                        emVar.performHapticFeedback(0, 2);
                    } catch (Exception unused) {
                        return;
                    }
                    break;
                }
                break;
            case 24:
                s70.Xc((s70) obj2, j10, (TLRPC.Chat) obj);
                break;
            case 25:
                ((hu0) obj2).f29145r1.presentFragment(rn.Q9(((MessageObject) obj).getId(), j10));
                break;
            case 26:
                gw0.x1((gw0) obj2, (TLRPC.TL_messages_emojiGroups) obj, j10);
                break;
            case 27:
                gy gyVar2 = (gy) obj2;
                w wVar = (w) obj;
                if (gyVar2.C.bot_admin_rights != null) {
                    gyVar2.getMessagesController().setUserAdminRole(-j10, gyVar2.getMessagesController().getUser(Long.valueOf(gyVar2.D)), gyVar2.C.bot_admin_rights, null, false, gyVar2, true, true, null, wVar, new zt(wVar, i12));
                } else {
                    wVar.run();
                }
                break;
            case 28:
                s50 s50Var = (s50) obj2;
                TLRPC.Updates updates = (TLRPC.Updates) obj;
                s50Var.getClass();
                TLRPC.Update update = updates.update;
                if (update instanceof TL_update.TL_updateNewMessage) {
                    TLRPC.Message message = ((TL_update.TL_updateNewMessage) update).message;
                    if (message != null && (message.action instanceof TLRPC.TL_messageActionConferenceCall)) {
                        i14 = message.f22401id;
                    }
                } else if (update instanceof TL_update.TL_updateMessageID) {
                    i14 = ((TL_update.TL_updateMessageID) update).f22635id;
                } else if (updates.updates != null) {
                    for (int i25 = 0; i25 < updates.updates.size(); i25++) {
                        TLRPC.Update update2 = updates.updates.get(i25);
                        if (update2 instanceof TL_update.TL_updateNewMessage) {
                            TLRPC.Message message2 = ((TL_update.TL_updateNewMessage) update2).message;
                            if (message2 != null && (message2.action instanceof TLRPC.TL_messageActionConferenceCall)) {
                                i14 = message2.f22401id;
                            }
                        } else if (update2 instanceof TL_update.TL_updateMessageID) {
                            i14 = ((TL_update.TL_updateMessageID) update2).f22635id;
                        }
                    }
                }
                ChatObject.Call call = s50Var.W0;
                if (call != null && i14 != 0) {
                    call.invitedUsersMessageIds.put(Long.valueOf(j10), ChatObject.Call.InvitedUser.make(i14));
                    s50Var.O0(true);
                    break;
                }
                break;
            default:
                LaunchActivity launchActivity = (LaunchActivity) obj2;
                Long l10 = (Long) obj;
                n2 n2VarU3 = LaunchActivity.U();
                if (n2VarU3 != null) {
                    rn rnVarR9 = rn.R9(l10.longValue());
                    n2VarU3.presentFragment(rnVarR9);
                    TLRPC.Chat chat = MessagesController.getInstance(launchActivity.K).getChat(Long.valueOf(-l10.longValue()));
                    if (chat != null) {
                        AndroidUtilities.runOnUIThread(new e9(rnVarR9, this.f5298b, chat, 1), 250L);
                    }
                    break;
                }
                break;
        }
    }

    public u(Object obj, Object obj2, long j10, int i10) {
        this.f5297a = i10;
        this.f5299c = obj;
        this.d = obj2;
        this.f5298b = j10;
    }
}
