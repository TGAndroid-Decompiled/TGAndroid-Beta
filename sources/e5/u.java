package e5;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.LongSparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
import d5.f0;
import fh.f1;
import fh.f2;
import fh.y1;
import fh.y3;
import gh.a0;
import gh.jb;
import gh.k5;
import gh.n7;
import gh.p5;
import gh.pa;
import gh.s7;
import gh.u7;
import gh.v1;
import gh.v7;
import h3.d0;
import h3.h0;
import h3.j0;
import h3.k0;
import h3.p2;
import h3.r2;
import h3.w1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.l0;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.c2;
import org.telegram.ui.ActionBar.f3;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.Cells.g5;
import org.telegram.ui.Cells.t1;
import org.telegram.ui.Cells.w0;
import org.telegram.ui.Components.ah0;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.o9;
import org.telegram.ui.Components.oc;
import org.telegram.ui.Components.vq0;
import org.telegram.ui.Components.wk0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.qn;
public final class u implements Runnable {
    public final int f4937a;
    public final Object f4938b;
    public final Object f4939c;

    public u(int i9, Object obj, Object obj2) {
        this.f4937a = i9;
        this.f4938b = obj;
        this.f4939c = obj2;
    }

    @Override
    public final void run() {
        boolean z10;
        int i9;
        boolean z11;
        boolean z12;
        oc a02;
        int i10;
        int i11;
        MessageObject messageObject;
        TLRPC.TL_messageReactions tL_messageReactions;
        boolean z13;
        TLRPC.TL_messageReactions tL_messageReactions2;
        long j10;
        boolean z14;
        boolean z15;
        ArrayList<TLRPC.MessageReactor> arrayList = null;
        boolean z16 = true;
        switch (this.f4937a) {
            case 0:
                z zVar = (z) this.f4939c;
                int i12 = f0.f4349a;
                k0 k0Var = ((h0) ((we.b) this.f4938b).f48794c).f9440a;
                k0Var.f9542g0 = zVar;
                k0Var.f9550l.e(25, new d0(zVar));
                return;
            case 1:
                int i13 = f0.f4349a;
                i3.f fVar = ((h0) ((we.b) this.f4938b).f48794c).f9440a.f9557r;
                i3.a k10 = fVar.k();
                fVar.l(k10, 1019, new i3.d(k10, (String) this.f4939c, 23));
                return;
            case 2:
                int i14 = f0.f4349a;
                i3.f fVar2 = ((h0) ((we.b) this.f4938b).f48794c).f9440a.f9557r;
                i3.a k11 = fVar2.k();
                fVar2.l(k11, 1030, new i3.d(k11, (Exception) this.f4939c, 29));
                return;
            case 3:
                eh.x xVar = (eh.x) this.f4938b;
                g5 g5Var = (g5) this.f4939c;
                int i15 = xVar.f5254k;
                o2 o2Var = xVar.f5251g;
                TLRPC.TL_chatInviteImporter importer = g5Var.getImporter();
                xVar.f5261r = importer;
                LongSparseArray longSparseArray = xVar.d;
                TLRPC.User user = (TLRPC.User) longSparseArray.get(importer.user_id);
                if (user != null) {
                    o2Var.getMessagesController().putUser(user, false);
                    Point point = AndroidUtilities.displaySize;
                    if (point.x > point.y) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (user.photo != null && !z10) {
                        if (xVar.f5262s == null) {
                            eh.w wVar = new eh.w(xVar, o2Var.getParentActivity(), (wk0) g5Var.getParent(), o2Var.getResourceProvider(), xVar.f5246a);
                            xVar.f5262s = wVar;
                            TLRPC.TL_chatInviteImporter tL_chatInviteImporter = xVar.f5261r;
                            o9 avatarImageView = g5Var.getAvatarImageView();
                            TextView textView = wVar.f5238e;
                            ah0 ah0Var = wVar.h;
                            wVar.f5241r = tL_chatInviteImporter;
                            wVar.v = avatarImageView;
                            TLRPC.User user2 = MessagesController.getInstance(i15).getUser(Long.valueOf(tL_chatInviteImporter.user_id));
                            ImageLocation forUserOrChat = ImageLocation.getForUserOrChat(i15, user2, 0);
                            ImageLocation forUserOrChat2 = ImageLocation.getForUserOrChat(i15, user2, 1);
                            if (MessagesController.getInstance(i15).getUserFull(tL_chatInviteImporter.user_id) == null) {
                                MessagesController.getInstance(i15).loadUserInfo(user2, false, 0);
                            }
                            ah0Var.setParentAvatarImage(avatarImageView);
                            ah0Var.M(tL_chatInviteImporter.user_id, true);
                            ah0Var.H(null, forUserOrChat, forUserOrChat2, true);
                            wVar.d.setText(UserObject.getUserName((TLRPC.User) longSparseArray.get(tL_chatInviteImporter.user_id)));
                            textView.setText(tL_chatInviteImporter.about);
                            if (TextUtils.isEmpty(tL_chatInviteImporter.about)) {
                                i9 = 8;
                            } else {
                                i9 = 0;
                            }
                            textView.setVisibility(i9);
                            wVar.f5245y.requestLayout();
                            xVar.f5262s.setOnDismissListener(new eh.l(xVar, 0));
                            xVar.f5262s.show();
                            return;
                        }
                        return;
                    }
                    xVar.f5247b = true;
                    o2Var.dismissCurrentDialog();
                    Bundle bundle = new Bundle();
                    ProfileActivity profileActivity = new ProfileActivity(bundle, null);
                    bundle.putLong("user_id", user.f22527id);
                    bundle.putBoolean("removeFragmentOnChatOpen", false);
                    o2Var.presentFragment(profileActivity);
                    return;
                }
                return;
            case 4:
                fh.c cVar = (fh.c) this.f4938b;
                cVar.getClass();
                ((View.OnClickListener) this.f4939c).onClick(cVar);
                return;
            case 5:
                ((y1) this.f4938b).getBulletinFactory().d0((TLRPC.TL_error) this.f4939c, false);
                return;
            case 6:
                f2 f2Var = (f2) this.f4938b;
                f2Var.getClass();
                if (!((TL_stars.SavedStarGift) this.f4939c).unsaved) {
                    f2Var.B.setVisibility(8);
                    return;
                }
                return;
            case 7:
                vq0 vq0Var = (vq0) this.f4938b;
                TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) this.f4939c;
                vq0Var.h(tL_starGiftCollection.title, new f1(2, vq0Var, tL_starGiftCollection));
                return;
            case 8:
                AndroidUtilities.addToClipboard((String) this.f4939c);
                oc.a0(((y3) this.f4938b).f6880a.f6545a).k(false).j();
                return;
            case 9:
                gh.z zVar2 = (gh.z) this.f4938b;
                TLObject tLObject = (TLObject) this.f4939c;
                int i16 = zVar2.f9235a;
                ArrayList arrayList2 = zVar2.f9238e;
                zVar2.f9241i = 0;
                if (tLObject instanceof TL_payments.connectedStarRefBots) {
                    TL_payments.connectedStarRefBots connectedstarrefbots = (TL_payments.connectedStarRefBots) tLObject;
                    MessagesController.getInstance(i16).putUsers(connectedstarrefbots.users, false);
                    if (zVar2.f9237c <= 0) {
                        arrayList2.clear();
                    }
                    zVar2.f9237c = connectedstarrefbots.count;
                    arrayList2.addAll(connectedstarrefbots.connected_bots);
                    if (!connectedstarrefbots.connected_bots.isEmpty() && arrayList2.size() < zVar2.f9237c) {
                        z11 = false;
                    } else {
                        z11 = true;
                    }
                    zVar2.d = z11;
                } else {
                    zVar2.h = true;
                    zVar2.d = true;
                }
                zVar2.f9240g = false;
                NotificationCenter.getInstance(i16).lambda$postNotificationNameOnUIThread$1(NotificationCenter.channelConnectedBotsUpdate, Long.valueOf(zVar2.f9236b));
                return;
            case 10:
                a0 a0Var = (a0) this.f4938b;
                TLObject tLObject2 = (TLObject) this.f4939c;
                int i17 = a0Var.f7762a;
                ArrayList arrayList3 = a0Var.f7765e;
                if (tLObject2 instanceof TL_payments.suggestedStarRefBots) {
                    TL_payments.suggestedStarRefBots suggestedstarrefbots = (TL_payments.suggestedStarRefBots) tLObject2;
                    MessagesController.getInstance(i17).putUsers(suggestedstarrefbots.users, false);
                    if (a0Var.f7764c <= 0) {
                        arrayList3.clear();
                    }
                    a0Var.f7764c = suggestedstarrefbots.count;
                    arrayList3.addAll(suggestedstarrefbots.suggested_bots);
                    a0Var.f7769j = suggestedstarrefbots.next_offset;
                    if (!suggestedstarrefbots.suggested_bots.isEmpty() && arrayList3.size() < a0Var.f7764c) {
                        z12 = false;
                    } else {
                        z12 = true;
                    }
                    a0Var.d = z12;
                } else {
                    a0Var.f7768i = true;
                    a0Var.d = true;
                }
                a0Var.h = false;
                NotificationCenter.getInstance(i17).lambda$postNotificationNameOnUIThread$1(NotificationCenter.channelSuggestedBotsUpdate, Long.valueOf(a0Var.f7763b));
                return;
            case 11:
                k5.U0((k5) this.f4938b, (Long) this.f4939c);
                return;
            case 12:
                k5 k5Var = (k5) this.f4938b;
                if (!((v7) this.f4939c).f9048e) {
                    gc Q = k5Var.getBulletinFactory().Q(R.raw.error, 36, LocaleController.formatString(R.string.UnknownErrorCode, "NO_BALANCE"));
                    Q.f28747t = true;
                    Q.j();
                    return;
                }
                k5Var.f8407f0.setLoading(false);
                k5Var.w1();
                return;
            case 13:
                ((k5) this.f4938b).getBulletinFactory().d0((TLRPC.TL_error) this.f4939c, false);
                return;
            case 14:
                MessagesController.getInstance(((k5) this.f4938b).currentAccount).processUpdates((TLRPC.Updates) ((TLObject) this.f4939c), false);
                return;
            case 15:
                k5 k5Var2 = (k5) this.f4938b;
                k5Var2.getClass();
                ((boolean[]) this.f4939c)[0] = true;
                k5Var2.f8407f0.setLoading(false);
                k5Var2.w1();
                return;
            case 16:
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) this.f4939c;
                ((k5) this.f4938b).getBulletinFactory().Q(R.raw.ic_delete, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GiftRemovedDescription, tL_starGiftUnique.title + " #" + tL_starGiftUnique.num))).j();
                return;
            case 17:
                k5 k5Var3 = (k5) this.f4938b;
                oc.a0((qn) this.f4939c).K(R.raw.gift, LocaleController.getString(R.string.StarsGiftUpgradeCompleted), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.StarsGiftUpgradeCompletedText, DialogObject.getShortName(k5Var3.T))), LocaleController.getString(R.string.StarsGiftUpgradeCompletedMoreButton), new v1(k5Var3, 8)).k(true);
                return;
            case 18:
                ((k5) this.f4938b).n2((CharSequence) this.f4939c);
                return;
            case 19:
                k5.H0((k5) this.f4938b, (TL_stars.TL_payments_uniqueStarGift) this.f4939c);
                return;
            case 20:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f4939c;
                ((c2) this.f4938b).dismiss();
                o2 U = LaunchActivity.U();
                if (U != null) {
                    if (tL_error != null && "STARGIFT_ALREADY_BURNED".equalsIgnoreCase(tL_error.text)) {
                        a02 = oc.a0(U);
                        i10 = R.raw.fire_on;
                        i11 = R.string.UniqueGiftNotFoundBurned;
                    } else {
                        a02 = oc.a0(U);
                        i10 = R.raw.error;
                        i11 = R.string.UniqueGiftNotFound;
                    }
                    l0.p(i11, a02, i10, 36);
                    return;
                }
                return;
            case 21:
                p5 p5Var = (p5) this.f4938b;
                qn qnVar = (qn) this.f4939c;
                org.telegram.ui.Cells.a0 a0Var2 = p5Var.f8714b;
                if (a0Var2 != null) {
                    try {
                        a0Var2.performHapticFeedback(0);
                    } catch (Exception unused) {
                    }
                    p5Var.onTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                    org.telegram.ui.Cells.a0 a0Var3 = p5Var.f8714b;
                    if (a0Var3 instanceof t1) {
                        messageObject = ((t1) a0Var3).getPrimaryMessageObject();
                        if (messageObject != null) {
                            TLRPC.Message message = messageObject.messageOwner;
                            if (message != null && (tL_messageReactions2 = message.reactions) != null) {
                                arrayList = tL_messageReactions2.top_reactors;
                            }
                        } else {
                            return;
                        }
                    } else if ((a0Var3 instanceof w0) && (messageObject = ((w0) a0Var3).getMessageObject()) != null) {
                        TLRPC.Message message2 = messageObject.messageOwner;
                        if (message2 != null && (tL_messageReactions = message2.reactions) != null) {
                            arrayList = tL_messageReactions.top_reactors;
                        }
                    } else {
                        return;
                    }
                    ArrayList<TLRPC.MessageReactor> arrayList4 = arrayList;
                    u7 u7Var = v7.y(messageObject.currentAccount, false).B;
                    if (u7Var != null) {
                        u7Var.b();
                    }
                    TLRPC.ChatFull chatFull = qnVar.V7;
                    Context context = p5Var.getContext();
                    int currentAccount = qnVar.getCurrentAccount();
                    long a2 = qnVar.a();
                    if (chatFull != null && !chatFull.paid_reactions_available) {
                        z13 = false;
                    } else {
                        z13 = true;
                    }
                    MessageObject messageObject2 = messageObject;
                    jb jbVar = new jb(context, currentAccount, a2, qnVar, messageObject2, arrayList4, z13, false, 0L, qnVar.getResourceProvider());
                    messageObject2.getId();
                    org.telegram.ui.Cells.a0 a0Var4 = p5Var.f8714b;
                    jbVar.P = qnVar;
                    jbVar.Q = a0Var4;
                    jbVar.show();
                    return;
                }
                return;
            case 22:
                TLObject tLObject3 = (TLObject) this.f4938b;
                bg.i iVar = (bg.i) this.f4939c;
                if (tLObject3 instanceof TL_stars.StarGifts) {
                    iVar.run((TL_stars.StarGifts) tLObject3);
                    return;
                } else {
                    iVar.run(null);
                    return;
                }
            case 23:
                boolean[] zArr = (boolean[]) this.f4938b;
                Utilities.Callback2 callback2 = (Utilities.Callback2) this.f4939c;
                if (!zArr[0]) {
                    callback2.run("cancelled", 0L);
                    zArr[0] = true;
                    return;
                }
                return;
            case 24:
                n7 n7Var = (n7) this.f4938b;
                TLObject tLObject4 = (TLObject) this.f4939c;
                ArrayList arrayList5 = n7Var.f8625l;
                int i18 = n7Var.f8616a;
                if (tLObject4 instanceof TL_stars.TL_payments_savedStarGifts) {
                    TL_stars.TL_payments_savedStarGifts tL_payments_savedStarGifts = (TL_stars.TL_payments_savedStarGifts) tLObject4;
                    MessagesController.getInstance(i18).putUsers(tL_payments_savedStarGifts.users, false);
                    MessagesController.getInstance(i18).putChats(tL_payments_savedStarGifts.chats, false);
                    if (tL_payments_savedStarGifts.gifts.size() > 0) {
                        TL_stars.SavedStarGift savedStarGift = tL_payments_savedStarGifts.gifts.get(0);
                        int i19 = 0;
                        while (i19 < arrayList5.size() && ((TL_stars.SavedStarGift) arrayList5.get(i19)).pinned_to_top) {
                            i19++;
                        }
                        arrayList5.add(i19, savedStarGift);
                        NotificationCenter.getInstance(i18).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starUserGiftsLoaded, Long.valueOf(n7Var.f8617b), n7Var);
                        return;
                    }
                    return;
                }
                return;
            case 25:
                ((MessagesController) this.f4938b).processUpdates((TLRPC.Updates) ((TLObject) this.f4939c), false);
                return;
            case 26:
                new oc(((f3[]) this.f4938b)[0].topBulletinContainer, (b6) this.f4939c).Q(R.raw.copy, 36, LocaleController.getString(R.string.StarsTransactionIDCopied)).k(false);
                return;
            case 27:
                jb jbVar2 = (jb) this.f4938b;
                jbVar2.N = true;
                jbVar2.o(new s7((u7) this.f4939c, 2));
                AndroidUtilities.runOnUIThread(new pa(jbVar2, 1), 240L);
                return;
            case 28:
                ((d5.d0) this.f4938b).d((Typeface) this.f4939c);
                return;
            default:
                k0 k0Var2 = (k0) this.f4938b;
                te.f fVar3 = (te.f) this.f4939c;
                int i20 = k0Var2.H - fVar3.f47819c;
                k0Var2.H = i20;
                if (fVar3.d) {
                    k0Var2.I = fVar3.f47820e;
                    k0Var2.J = true;
                }
                if (fVar3.f47821f) {
                    k0Var2.K = fVar3.f47822g;
                }
                if (i20 == 0) {
                    r2 r2Var = ((w1) fVar3.h).f9789a;
                    if (!k0Var2.f9545i0.f9789a.p() && r2Var.p()) {
                        k0Var2.f9547j0 = -1;
                        k0Var2.f9549k0 = 0L;
                    }
                    if (!r2Var.p()) {
                        List asList = Arrays.asList(((h3.f2) r2Var).f9406r);
                        if (asList.size() == k0Var2.f9554o.size()) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        d5.a.i(z15);
                        for (int i21 = 0; i21 < asList.size(); i21++) {
                            ((j0) k0Var2.f9554o.get(i21)).f9514b = (r2) asList.get(i21);
                        }
                    }
                    long j11 = -9223372036854775807L;
                    if (k0Var2.J) {
                        if (((w1) fVar3.h).f9790b.equals(k0Var2.f9545i0.f9790b) && ((w1) fVar3.h).d == k0Var2.f9545i0.f9804r) {
                            z16 = false;
                        }
                        if (z16) {
                            if (!r2Var.p() && !((w1) fVar3.h).f9790b.a()) {
                                w1 w1Var = (w1) fVar3.h;
                                j4.d0 d0Var = w1Var.f9790b;
                                long j12 = w1Var.d;
                                Object obj = d0Var.f13426a;
                                p2 p2Var = k0Var2.f9553n;
                                r2Var.g(obj, p2Var);
                                j11 = j12 + p2Var.f9640e;
                            } else {
                                j11 = ((w1) fVar3.h).d;
                            }
                        }
                        j10 = j11;
                        z14 = z16;
                    } else {
                        j10 = -9223372036854775807L;
                        z14 = false;
                    }
                    k0Var2.J = false;
                    k0Var2.o0((w1) fVar3.h, 1, k0Var2.K, false, z14, k0Var2.I, j10, -1, false);
                    return;
                }
                return;
        }
    }

    public u(v7 v7Var, boolean[] zArr, Utilities.Callback2 callback2) {
        this.f4937a = 23;
        this.f4938b = zArr;
        this.f4939c = callback2;
    }
}
