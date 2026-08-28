package nh;

import android.content.Context;
import android.graphics.Paint;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import bg.i2;
import fh.f1;
import fh.l2;
import fh.v2;
import g7.e6;
import ih.e7;
import java.util.ArrayList;
import java.util.WeakHashMap;
import kh.j1;
import kh.la;
import kh.o8;
import kh.v8;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.c2;
import org.telegram.ui.ActionBar.f3;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.Cells.j2;
import org.telegram.ui.Cells.n2;
import org.telegram.ui.Cells.r2;
import org.telegram.ui.Cells.s8;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.m10;
import org.telegram.ui.Components.oc;
import org.telegram.ui.Components.p70;
import org.telegram.ui.Components.wk0;
import org.telegram.ui.Components.y4;
import org.telegram.ui.f10;
import org.telegram.ui.qn;
import org.telegram.ui.we1;
public final class j0 extends f3 implements NotificationCenter.NotificationCenterDelegate, td.b, n2 {
    public static final int R = 0;
    public final m10 A;
    public final f10 B;
    public final i51 C;
    public final l2 D;
    public final l2 E;
    public final ff.c0 F;
    public final ff.c0 G;
    public final View H;
    public final q0 I;
    public final boolean J;
    public final Utilities.Callback K;
    public final Paint L;
    public ArrayList M;
    public String N;
    public String O;
    public i0.b P;
    public i0.b Q;
    public final td.a f18649b;
    public final td.a f18650c;
    public final j1 d;
    public final long f18651e;
    public TLRPC.Chat f18652f;
    public boolean h;
    public kh.d f18653n;
    public kh.d f18654r;
    public final o2 f18655s;
    public final e0 v;
    public final i0 f18656w;
    public final d0 f18657x;
    public final m10 f18658y;

    public j0(o2 o2Var, long j10) {
        this(o2Var, j10, null, null);
    }

    public static void m(j0 j0Var, boolean z10, TLRPC.TL_error tL_error) {
        if (tL_error != null) {
            if (TextUtils.equals("COMMUNITY_REQUEST_CREATED", tL_error.text)) {
                r0.f(new oc((FrameLayout) j0Var.containerView, j0Var.resourcesProvider), 2, z10);
                j0Var.d.D(0);
                return;
            }
            j2.s((FrameLayout) j0Var.containerView, j0Var.resourcesProvider, tL_error, false);
            return;
        }
        r0.f(new oc((FrameLayout) j0Var.containerView, j0Var.resourcesProvider), 1, z10);
        j0Var.d.D(0);
    }

    public static void n(j0 j0Var, ArrayList arrayList, TLRPC.TL_error tL_error) {
        j0Var.f18653n.setLoading(false);
        if (tL_error != null) {
            j2.s((FrameLayout) j0Var.containerView, j0Var.resourcesProvider, tL_error, false);
        } else if (arrayList != null) {
            j0Var.M = arrayList;
            if (arrayList.isEmpty()) {
                org.telegram.messenger.l0.p(R.string.CommunityNoChatsToAdd, new oc((FrameLayout) j0Var.containerView, j0Var.resourcesProvider), R.raw.info, 36);
                return;
            }
            j0Var.f18657x.d.U2.N(false);
            j0Var.d.D(2);
        }
    }

    public static void o(j0 j0Var, TLRPC.TL_error tL_error) {
        if (tL_error != null) {
            j2.s((FrameLayout) j0Var.containerView, j0Var.resourcesProvider, tL_error, false);
        }
    }

    public static void p(j0 j0Var, c2 c2Var, long j10, boolean z10, long j11) {
        c2Var.dismiss();
        if (j11 == 0) {
            return;
        }
        j0Var.U(MessagesController.getInstance(j0Var.currentAccount).getChat(Long.valueOf(j11)), j10, z10);
    }

    public static void q(j0 j0Var, boolean z10, boolean z11, long j10) {
        int i9;
        Context context = j0Var.getContext();
        b6 b6Var = j0Var.resourcesProvider;
        String string = LocaleController.getString(R.string.CommunityMenuRemoveFromCommunity);
        if (z10) {
            i9 = R.string.CommunityMenuRemoveBotFromCommunityConfirm;
        } else if (z11) {
            i9 = R.string.CommunityMenuRemoveChannelFromCommunityConfirm;
        } else {
            i9 = R.string.CommunityMenuRemoveGroupFromCommunityConfirm;
        }
        c2 P = y4.P(context, b6Var, string, LocaleController.getString(i9), LocaleController.getString(R.string.Remove), new i2(j0Var, j10, 12));
        P.show();
        TextView textView = (TextView) P.d(-1);
        if (textView != null) {
            textView.setTextColor(f6.w0(null, f6.f23230q7, false));
        }
    }

    public static void x(j0 j0Var) {
        if (!ChatObject.canAddChatToCommunity(j0Var.f18652f)) {
            j0Var.dismiss();
            return;
        }
        kh.d dVar = j0Var.f18653n;
        if (dVar.J) {
            return;
        }
        dVar.setLoading(true);
        MessagesController.getInstance(j0Var.currentAccount).fetchChatsToAddToCommunity(new s(j0Var, 2));
    }

    public static void y(j0 j0Var, l41 l41Var, View view) {
        long j10;
        TLRPC.Chat chat;
        int i9;
        o2 o2Var = j0Var.f18655s;
        if (!j0Var.S(l41Var)) {
            int i10 = l41Var.d;
            boolean z10 = false;
            if (i10 == 101) {
                j0Var.h = !j0Var.h;
                MessagesController.getInstance(j0Var.currentAccount).toggleCommunityCollapsedInDialogs(j0Var.f18651e, j0Var.h);
                if (view instanceof s8) {
                    ((s8) view).getCheckBox().c(j0Var.h, true);
                } else {
                    j0Var.v.d.U2.N(false);
                }
            } else if (i10 == 100) {
                j0Var.d.D(1);
                j0Var.I.e();
            } else {
                Object obj = l41Var.G;
                if (obj instanceof TLRPC.Chat) {
                    chat = (TLRPC.Chat) obj;
                    z10 = ChatObject.isChannelAndNotMegaGroup(chat);
                    j10 = -chat.f22380id;
                } else if (obj instanceof TLRPC.User) {
                    j10 = ((TLRPC.User) obj).f22527id;
                    chat = null;
                } else {
                    return;
                }
                TLRPC.Chat chat2 = chat;
                int b10 = r0.b(j0Var.currentAccount, j10);
                if (b10 != 1 && b10 != 2) {
                    if (b10 == 3) {
                        p70 p70Var = new p70(j0Var.getContext(), chat2, null, j0Var.f18655s, j0Var.resourcesProvider);
                        p70Var.f31570n = new oc((FrameLayout) j0Var.containerView, j0Var.resourcesProvider);
                        p70Var.show();
                        return;
                    } else if (b10 == 4) {
                        oc ocVar = new oc((FrameLayout) j0Var.containerView, j0Var.resourcesProvider);
                        int i11 = R.raw.e_hand_2;
                        if (z10) {
                            i9 = R.string.CommunityHiddenChannelUnavailable;
                        } else {
                            i9 = R.string.CommunityHiddenGroupUnavailable;
                        }
                        org.telegram.messenger.l0.p(i9, ocVar, i11, 36);
                        return;
                    } else {
                        return;
                    }
                }
                if (o2Var instanceof qn) {
                    qn qnVar = (qn) o2Var;
                    TLRPC.Chat chat3 = qnVar.f41890e;
                    TLRPC.User i12 = qnVar.i();
                    if ((chat3 != null && chat3.f22380id == (-j10)) || (i12 != null && i12.f22527id == j10)) {
                        j0Var.dismiss();
                        return;
                    }
                }
                Bundle bundle = new Bundle();
                if (j10 > 0) {
                    bundle.putLong("user_id", j10);
                } else {
                    bundle.putLong("chat_id", -j10);
                }
                if (ChatObject.isForum(chat2)) {
                    if (ChatObject.areTabsEnabled(chat2)) {
                        qn qnVar2 = new qn(bundle);
                        vf.c.a(qnVar2, MessagesStorage.TopicKey.of(j10, MessagesController.getInstance(j0Var.currentAccount).getForumLastTopicId(chat2.f22380id)));
                        o2Var.presentFragment(qnVar2);
                    } else {
                        o2Var.presentFragment(new we1(bundle));
                    }
                } else {
                    o2Var.presentFragment(new qn(bundle));
                }
                j0Var.dismiss();
            }
        }
    }

    public static void z(j0 j0Var, ArrayList arrayList) {
        String formatPluralString;
        String str;
        boolean z10;
        ArrayList arrayList2;
        arrayList.add(l41.D(99, Math.min(AndroidUtilities.dp(176.0f) + AndroidUtilities.statusBarHeight, (int) (AndroidUtilities.displaySize.y * 0.25f))));
        int i9 = 0;
        arrayList.add(l41.D(0, AndroidUtilities.dp(56.0f)));
        String string = LocaleController.getString(R.string.CommunityShowAsOneChat);
        l41 l41Var = new l41(39);
        l41Var.d = 101;
        l41Var.f30339l = string;
        l41Var.f30352z = 0;
        l41Var.K(j0Var.h);
        arrayList.add(l41Var);
        arrayList.add(l41.A(2, LocaleController.getString(R.string.CommunityShowAsOneChatInfo)));
        q0 q0Var = j0Var.I;
        boolean z11 = true;
        if (q0Var.f18709n && q0Var.f18707l == 1 && (arrayList2 = q0Var.f18705j) != null && arrayList2.size() == 1) {
            arrayList.add(l41.s(3, LocaleController.getString(R.string.CommunityPendingRequest)));
            q0Var.c(arrayList);
            arrayList.add(l41.D(5, AndroidUtilities.dp(14.33f)));
        } else {
            int i10 = q0Var.f18707l;
            if (i10 > 0) {
                int i11 = q0Var.f18711p;
                int i12 = R.drawable.filled_requests_24;
                if (i10 == i11) {
                    formatPluralString = LocaleController.getString(R.string.CommunityPendingRequests);
                } else {
                    formatPluralString = LocaleController.formatPluralString("CommunityPendingRequestsRow", i10, new Object[0]);
                }
                if (i11 > 0) {
                    str = Integer.toString(i11);
                } else {
                    str = null;
                }
                int i13 = oh.h.f19601a;
                l41 J = l41.J(oh.h.class);
                J.d = 100;
                J.f30338k = i12;
                J.f30339l = formatPluralString;
                J.f30341n = str;
                J.B = ((-15497247) << 32) | ((-14899731) & 4294967295L);
                J.f30344q = true;
                arrayList.add(J);
                arrayList.add(l41.D(5, AndroidUtilities.dp(14.33f)));
            }
        }
        MessagesController.CommunityPeersDialog buildCommunityPeers = MessagesController.getInstance(j0Var.currentAccount).buildCommunityPeers(j0Var.f18651e);
        if (buildCommunityPeers != null) {
            if (!buildCommunityPeers.chatsYouAreIn.isEmpty()) {
                arrayList.add(l41.s(21, LocaleController.getString(R.string.CommunitySectionChatsYouAreIn)));
                ArrayList<MessagesController.CommunityPeerDialog> arrayList3 = buildCommunityPeers.chatsYouAreIn;
                int size = arrayList3.size();
                int i14 = 0;
                while (i14 < size) {
                    MessagesController.CommunityPeerDialog communityPeerDialog = arrayList3.get(i14);
                    i14++;
                    arrayList.add(n0.a(communityPeerDialog, j0Var));
                }
                z10 = true;
            } else {
                z10 = false;
            }
            if (!buildCommunityPeers.chatsYouCanView.isEmpty()) {
                if (z10) {
                    arrayList.add(l41.D(22, AndroidUtilities.dp(12.0f)));
                }
                arrayList.add(l41.s(23, LocaleController.getString(R.string.CommunitySectionChatsYouCanView)));
                ArrayList<MessagesController.CommunityPeerDialog> arrayList4 = buildCommunityPeers.chatsYouCanView;
                int size2 = arrayList4.size();
                int i15 = 0;
                while (i15 < size2) {
                    MessagesController.CommunityPeerDialog communityPeerDialog2 = arrayList4.get(i15);
                    i15++;
                    arrayList.add(n0.a(communityPeerDialog2, j0Var));
                }
                z10 = true;
            }
            if (!buildCommunityPeers.chatsYouCanJoin.isEmpty()) {
                if (z10) {
                    arrayList.add(l41.D(24, AndroidUtilities.dp(12.0f)));
                }
                arrayList.add(l41.s(25, LocaleController.getString(R.string.CommunitySectionChatsYouCanRequestToJoin)));
                ArrayList<MessagesController.CommunityPeerDialog> arrayList5 = buildCommunityPeers.chatsYouCanJoin;
                int size3 = arrayList5.size();
                int i16 = 0;
                while (i16 < size3) {
                    MessagesController.CommunityPeerDialog communityPeerDialog3 = arrayList5.get(i16);
                    i16++;
                    arrayList.add(n0.a(communityPeerDialog3, j0Var));
                }
            } else {
                z11 = z10;
            }
            if (!buildCommunityPeers.chatsOther.isEmpty()) {
                if (z11) {
                    arrayList.add(l41.D(26, AndroidUtilities.dp(12.0f)));
                }
                arrayList.add(l41.s(27, LocaleController.getString(R.string.CommunitySectionHiddenChats)));
                ArrayList<MessagesController.CommunityPeerDialog> arrayList6 = buildCommunityPeers.chatsOther;
                int size4 = arrayList6.size();
                while (i9 < size4) {
                    MessagesController.CommunityPeerDialog communityPeerDialog4 = arrayList6.get(i9);
                    i9++;
                    arrayList.add(n0.a(communityPeerDialog4, j0Var));
                }
            }
        }
    }

    @Override
    public final void J0(int i9, float f10, float f11, td.c cVar) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19 = 8;
        if (i9 == 1) {
            float b10 = ff.m0.b(f10);
            float lerp = AndroidUtilities.lerp(0.9f, 1.0f, b10);
            e0 e0Var = this.v;
            e0Var.f18637a.setAlpha(b10);
            e0Var.f18637a.setScaleX(lerp);
            e0Var.f18637a.setScaleY(lerp);
            org.telegram.ui.ActionBar.k kVar = e0Var.f18637a;
            int i20 = (b10 > 0.0f ? 1 : (b10 == 0.0f ? 0 : -1));
            if (i20 > 0) {
                i14 = 0;
            } else {
                i14 = 8;
            }
            kVar.setVisibility(i14);
            float lerp2 = AndroidUtilities.lerp(0.9f, 1.0f, f10);
            m10 m10Var = this.f18658y;
            m10Var.setAlpha(f10);
            m10Var.setScaleX(lerp2);
            m10Var.setScaleY(lerp2);
            int i21 = (f10 > 0.0f ? 1 : (f10 == 0.0f ? 0 : -1));
            if (i21 > 0) {
                i15 = 0;
            } else {
                i15 = 8;
            }
            m10Var.setVisibility(i15);
            e0Var.d.setAlpha(b10);
            i51 i51Var = e0Var.d;
            if (i20 > 0) {
                i16 = 0;
            } else {
                i16 = 8;
            }
            i51Var.setVisibility(i16);
            this.f18653n.setAlpha(b10);
            this.f18653n.setScaleX(AndroidUtilities.lerp(0.95f, 1.0f, b10));
            this.f18653n.setScaleY(AndroidUtilities.lerp(0.95f, 1.0f, b10));
            kh.d dVar = this.f18653n;
            if (i20 > 0) {
                i17 = 0;
            } else {
                i17 = 8;
            }
            dVar.setVisibility(i17);
            f10 f10Var = this.B;
            f10Var.setAlpha(f10);
            if (i21 > 0) {
                i18 = 0;
            } else {
                i18 = 8;
            }
            f10Var.setVisibility(i18);
            this.containerView.invalidate();
            this.D.invalidate();
        }
        if (i9 == 2) {
            float b11 = ff.m0.b(f10);
            float lerp3 = AndroidUtilities.lerp(0.9f, 1.0f, b11);
            d0 d0Var = this.f18657x;
            d0Var.f18637a.setAlpha(b11);
            d0Var.f18637a.setScaleX(lerp3);
            d0Var.f18637a.setScaleY(lerp3);
            org.telegram.ui.ActionBar.k kVar2 = d0Var.f18637a;
            int i22 = (b11 > 0.0f ? 1 : (b11 == 0.0f ? 0 : -1));
            if (i22 > 0) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            kVar2.setVisibility(i10);
            float lerp4 = AndroidUtilities.lerp(0.9f, 1.0f, f10);
            m10 m10Var2 = this.A;
            m10Var2.setAlpha(f10);
            m10Var2.setScaleX(lerp4);
            m10Var2.setScaleY(lerp4);
            int i23 = (f10 > 0.0f ? 1 : (f10 == 0.0f ? 0 : -1));
            if (i23 > 0) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            m10Var2.setVisibility(i11);
            d0Var.d.setAlpha(b11);
            i51 i51Var2 = d0Var.d;
            if (i22 > 0) {
                i12 = 0;
            } else {
                i12 = 8;
            }
            i51Var2.setVisibility(i12);
            if (!this.J) {
                this.f18654r.setAlpha(b11);
                this.f18654r.setScaleX(AndroidUtilities.lerp(0.95f, 1.0f, b11));
                this.f18654r.setScaleY(AndroidUtilities.lerp(0.95f, 1.0f, b11));
                kh.d dVar2 = this.f18654r;
                if (i22 > 0) {
                    i13 = 0;
                } else {
                    i13 = 8;
                }
                dVar2.setVisibility(i13);
            }
            i51 i51Var3 = this.C;
            i51Var3.setAlpha(f10);
            if (i23 > 0) {
                i19 = 0;
            }
            i51Var3.setVisibility(i19);
            this.containerView.invalidate();
            this.E.invalidate();
        }
    }

    public final boolean S(l41 l41Var) {
        Object obj = l41Var.G;
        if (obj instanceof oh.e) {
            oh.e eVar = (oh.e) obj;
            long j10 = eVar.f19586a;
            TLRPC.Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-j10));
            TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(j10));
            o2 o2Var = this.f18655s;
            if (user != null) {
                o2Var.presentFragment(qn.R9(user.f22527id));
                return true;
            } else if (!ChatObject.isPublic(chat) && !ChatObject.isInChat(chat)) {
                new ph.b(getContext(), chat, new o8(12, this, eVar)).show();
                return true;
            } else {
                o2Var.presentFragment(qn.R9(-chat.f22380id));
                return true;
            }
        }
        return false;
    }

    public final void T(ArrayList arrayList, boolean z10) {
        String str;
        String str2;
        int i9 = 0;
        if (!z10) {
            arrayList.add(l41.D(99, (int) (AndroidUtilities.displaySize.y * 0.35f)));
            arrayList.add(l41.D(0, AndroidUtilities.dp(56.0f)));
        }
        if (this.M != null) {
            if (z10 && (str2 = this.O) != null) {
                str = str2.toLowerCase();
            } else {
                str = null;
            }
            ArrayList arrayList2 = this.M;
            int size = arrayList2.size();
            while (i9 < size) {
                Object obj = arrayList2.get(i9);
                i9++;
                TLRPC.Chat chat = (TLRPC.Chat) obj;
                if (z10 && !TextUtils.isEmpty(str)) {
                    String str3 = chat.title;
                    if (str3 != null && str3.toLowerCase().contains(str)) {
                        arrayList.add(l41.v(chat));
                    }
                } else {
                    arrayList.add(l41.v(chat));
                }
            }
        }
    }

    public final void U(TLRPC.Chat chat, long j10, boolean z10) {
        long j11 = -chat.f22380id;
        boolean isChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(chat);
        if (!ChatObject.isChannel(chat)) {
            c2 c2Var = new c2(getContext(), 3, null);
            c2Var.q(250L);
            MessagesController.getInstance(this.currentAccount).convertToMegaGroup(getContext(), -j11, null, new d(this, c2Var, j10, z10, 1));
            return;
        }
        MessagesController.getInstance(this.currentAccount).linkCommunity(j11, j10, z10, new la(isChannelAndNotMegaGroup, this, 1));
    }

    public final void V(l41 l41Var) {
        Object obj = l41Var.G;
        if (obj instanceof TLRPC.Chat) {
            TLRPC.Chat chat = (TLRPC.Chat) obj;
            if (this.J) {
                this.K.run(chat);
                dismiss();
                return;
            }
            new ph.a(getContext(), this.f18652f, -chat.f22380id, new f1(23, this, chat)).show();
        }
    }

    @Override
    public final boolean b() {
        return true;
    }

    @Override
    public final boolean canDismissWithSwipe() {
        if (!this.f18649b.f47776f && !this.f18650c.f47776f) {
            View currentView = this.d.getCurrentView();
            if (currentView instanceof g0) {
                return ((g0) currentView).f18640e;
            }
            return true;
        }
        return false;
    }

    @Override
    public final boolean canSwipeToBack(MotionEvent motionEvent) {
        return false;
    }

    @Override
    public final void d(r2 r2Var) {
        TLRPC.TL_forumTopic findTopic;
        if (r2Var.getMessage() != null && (findTopic = MessagesController.getInstance(this.currentAccount).getTopicsController().findTopic(-r2Var.getDialogId(), MessageObject.getTopicId(this.currentAccount, r2Var.getMessage().messageOwner, true))) != null) {
            vf.c.m(this.f18655s, -r2Var.getDialogId(), findTopic, 0);
        }
    }

    @Override
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        int i11 = NotificationCenter.chatInfoDidLoad;
        long j10 = this.f18651e;
        e0 e0Var = this.v;
        if (i9 == i11) {
            if (((TLRPC.ChatFull) objArr[0]).f22381id == j10) {
                e0Var.d.U2.N(true);
            }
        } else if (i9 == NotificationCenter.updateInterfaces) {
            Integer num = (Integer) objArr[0];
            if ((num.intValue() & MessagesController.UPDATE_MASK_CHAT) != 0 || (num.intValue() & MessagesController.UPDATE_MASK_AVATAR) != 0 || (num.intValue() & MessagesController.UPDATE_MASK_CHAT_AVATAR) != 0 || (num.intValue() & MessagesController.UPDATE_MASK_CHAT_NAME) != 0) {
                TLRPC.Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(j10));
                this.f18652f = chat;
                e0Var.f18637a.setTitle(DialogObject.getName(chat));
                e0Var.h.e(this.f18652f, e0Var.f18626n);
            }
        }
    }

    @Override
    public final void dismissInternal() {
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.chatInfoDidLoad);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.updateInterfaces);
        super.dismissInternal();
    }

    @Override
    public final void e(r2 r2Var) {
        if (MessagesController.getInstance(this.currentAccount).getStoriesController().I(r2Var.getDialogId())) {
            o2 o2Var = this.f18655s;
            o2Var.getOrCreateStoryViewer().getClass();
            o2Var.getOrCreateStoryViewer().D(o2Var.getContext(), r2Var.getDialogId(), e7.a((wk0) r2Var.getParent()));
        }
    }

    @Override
    public final void onBackPressed() {
        if (this.d.getCurrentPosition() > 0) {
            if (this.d.getCurrentPosition() == 2) {
                td.a aVar = this.f18650c;
                if (aVar.f47776f) {
                    this.f18657x.d.T2.h1(1, this.Q.f10849b);
                    aVar.a(false, true);
                    setAllowNestedScroll(true);
                    m10 m10Var = this.A;
                    AndroidUtilities.hideKeyboard(m10Var.f30664r);
                    m10Var.f30664r.clearFocus();
                    return;
                }
            }
            this.d.D(0);
            return;
        }
        super.onBackPressed();
    }

    public j0(o2 o2Var, long j10, ArrayList arrayList, v2 v2Var) {
        super(o2Var.getContext(), o2Var.getResourceProvider(), true, true);
        gr grVar = gr.h;
        this.f18649b = new td.a(1, this, grVar, 350L, false);
        this.f18650c = new td.a(2, this, grVar, 350L, false);
        this.F = new ff.c0(2);
        this.G = new ff.c0(8);
        Paint paint = new Paint(1);
        this.L = paint;
        i0.b bVar = i0.b.f10847e;
        this.P = bVar;
        this.Q = bVar;
        AndroidUtilities.enableEdgeToEdge(getWindow());
        this.f18655s = o2Var;
        this.J = arrayList != null;
        this.M = arrayList;
        this.K = v2Var;
        Context context = o2Var.getContext();
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.chatInfoDidLoad);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.updateInterfaces);
        int i9 = f6.f22947a7;
        paint.setColor(f6.v0(i9, this.resourcesProvider));
        fixNavigationBar(f6.v0(i9, this.resourcesProvider));
        this.containerView = new v8(this, context);
        j1 j1Var = new j1(this, context, 2);
        this.d = j1Var;
        int i10 = this.backgroundPaddingLeft;
        j1Var.setPadding(i10, 0, i10, 0);
        this.containerView.addView(this.d, e6.e(-1, -1, 119));
        this.D = new l2(this, context, 5);
        this.E = new l2(this, context, 5);
        m10 m10Var = new m10(context, this.resourcesProvider);
        this.f18658y = m10Var;
        m10Var.setCloseButtonVisible(true);
        m10Var.f30667x = true;
        m10Var.d();
        String string = LocaleController.getString(R.string.Search);
        fg.g gVar = m10Var.f30664r;
        gVar.setHint(string);
        gVar.addTextChangedListener(new v(this));
        m10Var.setVisibility(8);
        m10 m10Var2 = new m10(context, this.resourcesProvider);
        this.A = m10Var2;
        m10Var2.setCloseButtonVisible(true);
        m10Var2.f30667x = true;
        m10Var2.d();
        String string2 = LocaleController.getString(R.string.Search);
        fg.g gVar2 = m10Var2.f30664r;
        gVar2.setHint(string2);
        gVar2.addTextChangedListener(new w(this));
        m10Var2.setVisibility(8);
        i51 i51Var = new i51(context, this.currentAccount, 0, false, new s(this, 0), new t(this, 0), null, this.resourcesProvider);
        this.C = i51Var;
        i51Var.j(new x(this));
        i51Var.setClipToPadding(false);
        i51Var.setVisibility(8);
        i51Var.p1();
        i51Var.U2.f35188r = false;
        i51Var.setPadding(0, AndroidUtilities.dp(52.0f) + AndroidUtilities.statusBarHeight, 0, AndroidUtilities.navigationBarHeight);
        f10 f10Var = new f10(o2Var);
        this.B = f10Var;
        f10Var.setVisibility(8);
        f10Var.setBackground(null);
        f10Var.setChatPreviewDelegate(new Object());
        f10Var.setUiCallback(new z(this));
        f10Var.f38087b.setClipToPadding(false);
        this.H = new View(getContext());
        Context context2 = getContext();
        b6 b6Var = this.resourcesProvider;
        q0 q0Var = new q0(context2, b6Var, new oc((FrameLayout) this.containerView, b6Var), this.currentAccount, j10);
        this.I = q0Var;
        q0Var.h = new a0(this, o2Var);
        this.f18651e = j10;
        this.f18652f = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(j10));
        MessagesController.getInstance(this.currentAccount).getChatFull(j10);
        TLRPC.Chat chat = this.f18652f;
        this.h = chat != null && chat.collapsed_in_dialogs;
        of.m0 m0Var = new of.m0(R.drawable.search_users_filled, 4, DialogObject.getShortName(chat));
        m0Var.f19422f = this.f18652f;
        m0Var.h = false;
        ArrayList arrayList2 = m10Var.B;
        arrayList2.add(m0Var);
        m10Var.E = arrayList2.size() - 1;
        m10Var.f();
        setBackgroundColor(f6.v0(i9, this.resourcesProvider));
        this.f18656w = new i0(this, context);
        this.v = new e0(this, context);
        this.f18657x = new d0(this, context);
        this.d.setAdapter(new b0(this));
        m10Var.setCloseButtonOnClickListener(new u(this, 0));
        m10Var2.setCloseButtonOnClickListener(new u(this, 1));
        q0Var.d();
        MessagesController.getInstance(this.currentAccount).loadFullChat(j10, 0, true);
        gc.a((FrameLayout) this.containerView, new Object());
        ViewGroup viewGroup = this.containerView;
        t tVar = new t(this, 1);
        WeakHashMap weakHashMap = r0.j0.f46915a;
        r0.b0.j(viewGroup, tVar);
    }

    @Override
    public final void c() {
    }

    @Override
    public final void a(r2 r2Var) {
    }

    @Override
    public final void f(r2 r2Var) {
    }

    @Override
    public final void B(float f10, int i9) {
    }
}
