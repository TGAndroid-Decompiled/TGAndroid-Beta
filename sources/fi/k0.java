package fi;

import ai.g3;
import ai.u9;
import android.content.Context;
import android.graphics.Paint;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import ci.bb;
import ci.g9;
import ci.h2;
import ci.i1;
import ci.y8;
import ci.za;
import ei.r4;
import java.util.ArrayList;
import java.util.WeakHashMap;
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
import org.telegram.messenger.z0;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.f3;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Cells.n2;
import org.telegram.ui.Cells.q3;
import org.telegram.ui.Cells.r2;
import org.telegram.ui.Cells.w8;
import org.telegram.ui.Components.c20;
import org.telegram.ui.Components.d61;
import org.telegram.ui.Components.e5;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.h80;
import org.telegram.ui.Components.ml0;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.rr;
import org.telegram.ui.Components.xc;
import org.telegram.ui.u10;
import org.telegram.ui.wf1;
import org.telegram.ui.xn;
import w7.x5;
public final class k0 extends f3 implements NotificationCenter.NotificationCenterDelegate, le.e, n2 {
    public static final int V = 0;
    public final c20 E;
    public final u10 F;
    public final d61 G;
    public final bb H;
    public final bb I;
    public final yf.y J;
    public final yf.y K;
    public final View L;
    public final t0 M;
    public final boolean N;
    public final Utilities.Callback O;
    public final Paint P;
    public ArrayList Q;
    public String R;
    public String S;
    public i0.b T;
    public i0.b U;
    public final le.c f9108b;
    public final le.c f9109c;
    public final i1 d;
    public final long e;
    public TLRPC.Chat f9110f;
    public boolean h;
    public ci.d f9111n;
    public ci.d f9112r;
    public final org.telegram.ui.ActionBar.n2 f9113s;
    public final f0 v;
    public final j0 f9114w;
    public final e0 f9115x;
    public final c20 f9116y;

    public k0(org.telegram.ui.ActionBar.n2 n2Var, long j3) {
        this(n2Var, j3, null, null);
    }

    public static void m(k0 k0Var, boolean z10, TLRPC.TL_error tL_error) {
        if (tL_error != null) {
            if (TextUtils.equals("COMMUNITY_REQUEST_CREATED", tL_error.text)) {
                u0.f(new xc((FrameLayout) k0Var.containerView, k0Var.resourcesProvider), 2, z10);
                k0Var.d.D(0);
                return;
            }
            q3.r((FrameLayout) k0Var.containerView, k0Var.resourcesProvider, tL_error, false);
            return;
        }
        u0.f(new xc((FrameLayout) k0Var.containerView, k0Var.resourcesProvider), 1, z10);
        k0Var.d.D(0);
    }

    public static void n(k0 k0Var, ArrayList arrayList, TLRPC.TL_error tL_error) {
        k0Var.f9111n.setLoading(false);
        if (tL_error != null) {
            q3.r((FrameLayout) k0Var.containerView, k0Var.resourcesProvider, tL_error, false);
        } else if (arrayList != null) {
            k0Var.Q = arrayList;
            if (arrayList.isEmpty()) {
                z0.o(R.string.CommunityNoChatsToAdd, new xc((FrameLayout) k0Var.containerView, k0Var.resourcesProvider), R.raw.info, 36);
                return;
            }
            k0Var.f9115x.d.Y2.N(false);
            k0Var.d.D(2);
        }
    }

    public static void o(k0 k0Var, TLRPC.TL_error tL_error) {
        if (tL_error != null) {
            q3.r((FrameLayout) k0Var.containerView, k0Var.resourcesProvider, tL_error, false);
        }
    }

    public static void p(k0 k0Var, b2 b2Var, long j3, boolean z10, long j10) {
        b2Var.dismiss();
        if (j10 == 0) {
            return;
        }
        k0Var.V(MessagesController.getInstance(k0Var.currentAccount).getChat(Long.valueOf(j10)), j3, z10);
    }

    public static void q(k0 k0Var, boolean z10, boolean z11, long j3) {
        int i10;
        Context context = k0Var.getContext();
        d6 d6Var = k0Var.resourcesProvider;
        String string = LocaleController.getString(R.string.CommunityMenuRemoveFromCommunity);
        if (z10) {
            i10 = R.string.CommunityMenuRemoveBotFromCommunityConfirm;
        } else if (z11) {
            i10 = R.string.CommunityMenuRemoveChannelFromCommunityConfirm;
        } else {
            i10 = R.string.CommunityMenuRemoveGroupFromCommunityConfirm;
        }
        b2 P = e5.P(context, d6Var, string, LocaleController.getString(i10), LocaleController.getString(R.string.Remove), new ai.j(k0Var, j3, 8));
        P.show();
        TextView textView = (TextView) P.d(-1);
        if (textView != null) {
            textView.setTextColor(h6.w0(null, h6.f19026q7, false));
        }
    }

    public static void x(k0 k0Var) {
        if (!ChatObject.canAddChatToCommunity(k0Var.f9110f)) {
            k0Var.dismiss();
            return;
        }
        ci.d dVar = k0Var.f9111n;
        if (dVar.N) {
            return;
        }
        dVar.setLoading(true);
        MessagesController.getInstance(k0Var.currentAccount).fetchChatsToAddToCommunity(new t(k0Var, 2));
    }

    public static void y(k0 k0Var, h51 h51Var, View view) {
        long j3;
        TLRPC.Chat chat;
        int i10;
        org.telegram.ui.ActionBar.n2 n2Var = k0Var.f9113s;
        if (!k0Var.T(h51Var)) {
            int i11 = h51Var.d;
            boolean z10 = false;
            if (i11 == 101) {
                k0Var.h = !k0Var.h;
                MessagesController.getInstance(k0Var.currentAccount).toggleCommunityCollapsedInDialogs(k0Var.e, k0Var.h);
                if (view instanceof w8) {
                    ((w8) view).getCheckBox().c(k0Var.h, true);
                } else {
                    k0Var.v.d.Y2.N(false);
                }
            } else if (i11 == 100) {
                k0Var.d.D(1);
                k0Var.M.e();
            } else {
                Object obj = h51Var.G;
                if (obj instanceof TLRPC.Chat) {
                    chat = (TLRPC.Chat) obj;
                    z10 = ChatObject.isChannelAndNotMegaGroup(chat);
                    j3 = -chat.f18083id;
                } else if (obj instanceof TLRPC.User) {
                    j3 = ((TLRPC.User) obj).f18230id;
                    chat = null;
                } else {
                    return;
                }
                TLRPC.Chat chat2 = chat;
                int b10 = u0.b(k0Var.currentAccount, j3);
                if (b10 != 1 && b10 != 2) {
                    if (b10 == 3) {
                        h80 h80Var = new h80(k0Var.getContext(), chat2, null, k0Var.f9113s, k0Var.resourcesProvider);
                        h80Var.f24567n = new xc((FrameLayout) k0Var.containerView, k0Var.resourcesProvider);
                        h80Var.show();
                        return;
                    } else if (b10 == 4) {
                        xc xcVar = new xc((FrameLayout) k0Var.containerView, k0Var.resourcesProvider);
                        int i12 = R.raw.e_hand_2;
                        if (z10) {
                            i10 = R.string.CommunityHiddenChannelUnavailable;
                        } else {
                            i10 = R.string.CommunityHiddenGroupUnavailable;
                        }
                        z0.o(i10, xcVar, i12, 36);
                        return;
                    } else {
                        return;
                    }
                }
                if (n2Var instanceof xn) {
                    xn xnVar = (xn) n2Var;
                    TLRPC.Chat chat3 = xnVar.e;
                    TLRPC.User i13 = xnVar.i();
                    if ((chat3 != null && chat3.f18083id == (-j3)) || (i13 != null && i13.f18230id == j3)) {
                        k0Var.dismiss();
                        return;
                    }
                }
                Bundle bundle = new Bundle();
                if (j3 > 0) {
                    bundle.putLong("user_id", j3);
                } else {
                    bundle.putLong("chat_id", -j3);
                }
                if (ChatObject.isForum(chat2)) {
                    if (ChatObject.areTabsEnabled(chat2)) {
                        xn xnVar2 = new xn(bundle);
                        ng.d.a(xnVar2, MessagesStorage.TopicKey.of(j3, MessagesController.getInstance(k0Var.currentAccount).getForumLastTopicId(chat2.f18083id)));
                        n2Var.presentFragment(xnVar2);
                    } else {
                        n2Var.presentFragment(new wf1(bundle));
                    }
                } else {
                    n2Var.presentFragment(new xn(bundle));
                }
                k0Var.dismiss();
            }
        }
    }

    public static void z(k0 k0Var, ArrayList arrayList) {
        String formatPluralString;
        String str;
        boolean z10;
        ArrayList arrayList2;
        arrayList.add(h51.D(99, Math.min(AndroidUtilities.dp(176.0f) + AndroidUtilities.statusBarHeight, (int) (AndroidUtilities.displaySize.y * 0.25f))));
        int i10 = 0;
        arrayList.add(h51.D(0, AndroidUtilities.dp(56.0f)));
        String string = LocaleController.getString(R.string.CommunityShowAsOneChat);
        h51 h51Var = new h51(39);
        h51Var.d = 101;
        h51Var.f24507l = string;
        h51Var.f24520z = 0;
        h51Var.K(k0Var.h);
        arrayList.add(h51Var);
        arrayList.add(h51.A(2, LocaleController.getString(R.string.CommunityShowAsOneChatInfo)));
        t0 t0Var = k0Var.M;
        boolean z11 = true;
        if (t0Var.f9172n && t0Var.f9170l == 1 && (arrayList2 = t0Var.f9168j) != null && arrayList2.size() == 1) {
            arrayList.add(h51.s(3, LocaleController.getString(R.string.CommunityPendingRequest)));
            t0Var.c(arrayList);
            arrayList.add(h51.D(5, AndroidUtilities.dp(14.33f)));
        } else {
            int i11 = t0Var.f9170l;
            if (i11 > 0) {
                int i12 = t0Var.f9174p;
                int i13 = R.drawable.filled_requests_24;
                if (i11 == i12) {
                    formatPluralString = LocaleController.getString(R.string.CommunityPendingRequests);
                } else {
                    formatPluralString = LocaleController.formatPluralString("CommunityPendingRequestsRow", i11, new Object[0]);
                }
                if (i12 > 0) {
                    str = Integer.toString(i12);
                } else {
                    str = null;
                }
                int i14 = gi.i.f10023a;
                h51 J = h51.J(gi.i.class);
                J.d = 100;
                J.f24506k = i13;
                J.f24507l = formatPluralString;
                J.f24509n = str;
                J.B = ((-15497247) << 32) | ((-14899731) & 4294967295L);
                J.f24512q = true;
                arrayList.add(J);
                arrayList.add(h51.D(5, AndroidUtilities.dp(14.33f)));
            }
        }
        MessagesController.CommunityPeersDialog buildCommunityPeers = MessagesController.getInstance(k0Var.currentAccount).buildCommunityPeers(k0Var.e);
        if (buildCommunityPeers != null) {
            if (!buildCommunityPeers.chatsYouAreIn.isEmpty()) {
                arrayList.add(h51.s(21, LocaleController.getString(R.string.CommunitySectionChatsYouAreIn)));
                ArrayList<MessagesController.CommunityPeerDialog> arrayList3 = buildCommunityPeers.chatsYouAreIn;
                int size = arrayList3.size();
                int i15 = 0;
                while (i15 < size) {
                    MessagesController.CommunityPeerDialog communityPeerDialog = arrayList3.get(i15);
                    i15++;
                    arrayList.add(q0.a(communityPeerDialog, k0Var));
                }
                z10 = true;
            } else {
                z10 = false;
            }
            if (!buildCommunityPeers.chatsYouCanView.isEmpty()) {
                if (z10) {
                    arrayList.add(h51.D(22, AndroidUtilities.dp(12.0f)));
                }
                arrayList.add(h51.s(23, LocaleController.getString(R.string.CommunitySectionChatsYouCanView)));
                ArrayList<MessagesController.CommunityPeerDialog> arrayList4 = buildCommunityPeers.chatsYouCanView;
                int size2 = arrayList4.size();
                int i16 = 0;
                while (i16 < size2) {
                    MessagesController.CommunityPeerDialog communityPeerDialog2 = arrayList4.get(i16);
                    i16++;
                    arrayList.add(q0.a(communityPeerDialog2, k0Var));
                }
                z10 = true;
            }
            if (!buildCommunityPeers.chatsYouCanJoin.isEmpty()) {
                if (z10) {
                    arrayList.add(h51.D(24, AndroidUtilities.dp(12.0f)));
                }
                arrayList.add(h51.s(25, LocaleController.getString(R.string.CommunitySectionChatsYouCanRequestToJoin)));
                ArrayList<MessagesController.CommunityPeerDialog> arrayList5 = buildCommunityPeers.chatsYouCanJoin;
                int size3 = arrayList5.size();
                int i17 = 0;
                while (i17 < size3) {
                    MessagesController.CommunityPeerDialog communityPeerDialog3 = arrayList5.get(i17);
                    i17++;
                    arrayList.add(q0.a(communityPeerDialog3, k0Var));
                }
            } else {
                z11 = z10;
            }
            if (!buildCommunityPeers.chatsOther.isEmpty()) {
                if (z11) {
                    arrayList.add(h51.D(26, AndroidUtilities.dp(12.0f)));
                }
                arrayList.add(h51.s(27, LocaleController.getString(R.string.CommunitySectionHiddenChats)));
                ArrayList<MessagesController.CommunityPeerDialog> arrayList6 = buildCommunityPeers.chatsOther;
                int size4 = arrayList6.size();
                while (i10 < size4) {
                    MessagesController.CommunityPeerDialog communityPeerDialog4 = arrayList6.get(i10);
                    i10++;
                    arrayList.add(q0.a(communityPeerDialog4, k0Var));
                }
            }
        }
    }

    @Override
    public final void D(int i10, float f7, float f10, le.f fVar) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20 = 8;
        if (i10 == 1) {
            float b10 = yf.e0.b(f7);
            float lerp = AndroidUtilities.lerp(0.9f, 1.0f, b10);
            f0 f0Var = this.v;
            f0Var.f9093a.setAlpha(b10);
            f0Var.f9093a.setScaleX(lerp);
            f0Var.f9093a.setScaleY(lerp);
            org.telegram.ui.ActionBar.k kVar = f0Var.f9093a;
            int i21 = (b10 > 0.0f ? 1 : (b10 == 0.0f ? 0 : -1));
            if (i21 > 0) {
                i15 = 0;
            } else {
                i15 = 8;
            }
            kVar.setVisibility(i15);
            float lerp2 = AndroidUtilities.lerp(0.9f, 1.0f, f7);
            c20 c20Var = this.f9116y;
            c20Var.setAlpha(f7);
            c20Var.setScaleX(lerp2);
            c20Var.setScaleY(lerp2);
            int i22 = (f7 > 0.0f ? 1 : (f7 == 0.0f ? 0 : -1));
            if (i22 > 0) {
                i16 = 0;
            } else {
                i16 = 8;
            }
            c20Var.setVisibility(i16);
            f0Var.d.setAlpha(b10);
            d61 d61Var = f0Var.d;
            if (i21 > 0) {
                i17 = 0;
            } else {
                i17 = 8;
            }
            d61Var.setVisibility(i17);
            this.f9111n.setAlpha(b10);
            this.f9111n.setScaleX(AndroidUtilities.lerp(0.95f, 1.0f, b10));
            this.f9111n.setScaleY(AndroidUtilities.lerp(0.95f, 1.0f, b10));
            ci.d dVar = this.f9111n;
            if (i21 > 0) {
                i18 = 0;
            } else {
                i18 = 8;
            }
            dVar.setVisibility(i18);
            u10 u10Var = this.F;
            u10Var.setAlpha(f7);
            if (i22 > 0) {
                i19 = 0;
            } else {
                i19 = 8;
            }
            u10Var.setVisibility(i19);
            this.containerView.invalidate();
            this.H.invalidate();
        }
        if (i10 == 2) {
            float b11 = yf.e0.b(f7);
            float lerp3 = AndroidUtilities.lerp(0.9f, 1.0f, b11);
            e0 e0Var = this.f9115x;
            e0Var.f9093a.setAlpha(b11);
            e0Var.f9093a.setScaleX(lerp3);
            e0Var.f9093a.setScaleY(lerp3);
            org.telegram.ui.ActionBar.k kVar2 = e0Var.f9093a;
            int i23 = (b11 > 0.0f ? 1 : (b11 == 0.0f ? 0 : -1));
            if (i23 > 0) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            kVar2.setVisibility(i11);
            float lerp4 = AndroidUtilities.lerp(0.9f, 1.0f, f7);
            c20 c20Var2 = this.E;
            c20Var2.setAlpha(f7);
            c20Var2.setScaleX(lerp4);
            c20Var2.setScaleY(lerp4);
            int i24 = (f7 > 0.0f ? 1 : (f7 == 0.0f ? 0 : -1));
            if (i24 > 0) {
                i12 = 0;
            } else {
                i12 = 8;
            }
            c20Var2.setVisibility(i12);
            e0Var.d.setAlpha(b11);
            d61 d61Var2 = e0Var.d;
            if (i23 > 0) {
                i13 = 0;
            } else {
                i13 = 8;
            }
            d61Var2.setVisibility(i13);
            if (!this.N) {
                this.f9112r.setAlpha(b11);
                this.f9112r.setScaleX(AndroidUtilities.lerp(0.95f, 1.0f, b11));
                this.f9112r.setScaleY(AndroidUtilities.lerp(0.95f, 1.0f, b11));
                ci.d dVar2 = this.f9112r;
                if (i23 > 0) {
                    i14 = 0;
                } else {
                    i14 = 8;
                }
                dVar2.setVisibility(i14);
            }
            d61 d61Var3 = this.G;
            d61Var3.setAlpha(f7);
            if (i24 > 0) {
                i20 = 0;
            }
            d61Var3.setVisibility(i20);
            this.containerView.invalidate();
            this.I.invalidate();
        }
    }

    public final boolean T(h51 h51Var) {
        Object obj = h51Var.G;
        if (obj instanceof gi.f) {
            gi.f fVar = (gi.f) obj;
            long j3 = fVar.f10009a;
            TLRPC.Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-j3));
            TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(j3));
            org.telegram.ui.ActionBar.n2 n2Var = this.f9113s;
            if (user != null) {
                n2Var.presentFragment(xn.R9(user.f18230id));
                return true;
            } else if (!ChatObject.isPublic(chat) && !ChatObject.isInChat(chat)) {
                new hi.c(getContext(), chat, new y8(24, this, fVar)).show();
                return true;
            } else {
                n2Var.presentFragment(xn.R9(-chat.f18083id));
                return true;
            }
        }
        return false;
    }

    public final void U(ArrayList arrayList, boolean z10) {
        String str;
        String str2;
        int i10 = 0;
        if (!z10) {
            arrayList.add(h51.D(99, (int) (AndroidUtilities.displaySize.y * 0.35f)));
            arrayList.add(h51.D(0, AndroidUtilities.dp(56.0f)));
        }
        if (this.Q != null) {
            if (z10 && (str2 = this.S) != null) {
                str = str2.toLowerCase();
            } else {
                str = null;
            }
            ArrayList arrayList2 = this.Q;
            int size = arrayList2.size();
            while (i10 < size) {
                Object obj = arrayList2.get(i10);
                i10++;
                TLRPC.Chat chat = (TLRPC.Chat) obj;
                if (z10 && !TextUtils.isEmpty(str)) {
                    String str3 = chat.title;
                    if (str3 != null && str3.toLowerCase().contains(str)) {
                        arrayList.add(h51.v(chat));
                    }
                } else {
                    arrayList.add(h51.v(chat));
                }
            }
        }
    }

    public final void V(TLRPC.Chat chat, long j3, boolean z10) {
        long j10 = -chat.f18083id;
        boolean isChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(chat);
        if (!ChatObject.isChannel(chat)) {
            b2 b2Var = new b2(getContext(), 3, null);
            b2Var.q(250L);
            MessagesController.getInstance(this.currentAccount).convertToMegaGroup(getContext(), -j10, null, new d(this, b2Var, j3, z10, 1));
            return;
        }
        MessagesController.getInstance(this.currentAccount).linkCommunity(j10, j3, z10, new za(isChannelAndNotMegaGroup, this, 1));
    }

    public final void W(h51 h51Var) {
        Object obj = h51Var.G;
        if (obj instanceof TLRPC.Chat) {
            TLRPC.Chat chat = (TLRPC.Chat) obj;
            if (this.N) {
                this.O.run(chat);
                dismiss();
                return;
            }
            new hi.b(getContext(), this.f9110f, -chat.f18083id, new g3(15, this, chat)).show();
        }
    }

    @Override
    public final boolean b() {
        return true;
    }

    @Override
    public final boolean canDismissWithSwipe() {
        if (!this.f9108b.f13963f && !this.f9109c.f13963f) {
            View currentView = this.d.getCurrentView();
            if (currentView instanceof h0) {
                return ((h0) currentView).e;
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
            ng.d.m(this.f9113s, -r2Var.getDialogId(), findTopic, 0);
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12 = NotificationCenter.chatInfoDidLoad;
        long j3 = this.e;
        f0 f0Var = this.v;
        if (i10 == i12) {
            if (((TLRPC.ChatFull) objArr[0]).f18084id == j3) {
                f0Var.d.Y2.N(true);
            }
        } else if (i10 == NotificationCenter.updateInterfaces) {
            Integer num = (Integer) objArr[0];
            if ((num.intValue() & MessagesController.UPDATE_MASK_CHAT) != 0 || (num.intValue() & MessagesController.UPDATE_MASK_AVATAR) != 0 || (num.intValue() & MessagesController.UPDATE_MASK_CHAT_AVATAR) != 0 || (num.intValue() & MessagesController.UPDATE_MASK_CHAT_NAME) != 0) {
                TLRPC.Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(j3));
                this.f9110f = chat;
                f0Var.f9093a.setTitle(DialogObject.getName(chat));
                f0Var.h.e(this.f9110f, f0Var.f9086n);
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
            org.telegram.ui.ActionBar.n2 n2Var = this.f9113s;
            n2Var.getOrCreateStoryViewer().getClass();
            n2Var.getOrCreateStoryViewer().D(n2Var.getContext(), r2Var.getDialogId(), u9.a((ml0) r2Var.getParent()));
        }
    }

    @Override
    public final void onBackPressed() {
        if (this.d.getCurrentPosition() > 0) {
            if (this.d.getCurrentPosition() == 2) {
                le.c cVar = this.f9109c;
                if (cVar.f13963f) {
                    this.f9115x.d.X2.h1(1, this.U.f10577b);
                    cVar.a(false, true);
                    setAllowNestedScroll(true);
                    c20 c20Var = this.E;
                    AndroidUtilities.hideKeyboard(c20Var.f22890r);
                    c20Var.f22890r.clearFocus();
                    return;
                }
            }
            this.d.D(0);
            return;
        }
        super.onBackPressed();
    }

    public k0(org.telegram.ui.ActionBar.n2 n2Var, long j3, ArrayList arrayList, r4 r4Var) {
        super(n2Var.getContext(), n2Var.getResourceProvider(), true, true);
        rr rrVar = rr.h;
        this.f9108b = new le.c(1, this, rrVar, 350L, false);
        this.f9109c = new le.c(2, this, rrVar, 350L, false);
        this.J = new yf.y(2);
        this.K = new yf.y(8);
        Paint paint = new Paint(1);
        this.P = paint;
        i0.b bVar = i0.b.e;
        this.T = bVar;
        this.U = bVar;
        AndroidUtilities.enableEdgeToEdge(getWindow());
        this.f9113s = n2Var;
        this.N = arrayList != null;
        this.Q = arrayList;
        this.O = r4Var;
        Context context = n2Var.getContext();
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.chatInfoDidLoad);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.updateInterfaces);
        int i10 = h6.f18733a7;
        paint.setColor(h6.v0(i10, this.resourcesProvider));
        fixNavigationBar(h6.v0(i10, this.resourcesProvider));
        this.containerView = new g9(this, context);
        i1 i1Var = new i1(this, context, 2);
        this.d = i1Var;
        int i11 = this.backgroundPaddingLeft;
        i1Var.setPadding(i11, 0, i11, 0);
        this.containerView.addView(this.d, x5.e(-1, -1, 119));
        this.H = new bb(this, context, 3);
        this.I = new bb(this, context, 3);
        c20 c20Var = new c20(context, this.resourcesProvider);
        this.f9116y = c20Var;
        c20Var.setCloseButtonVisible(true);
        c20Var.f22893x = true;
        c20Var.e();
        String string = LocaleController.getString(R.string.Search);
        h2 h2Var = c20Var.f22890r;
        h2Var.setHint(string);
        h2Var.addTextChangedListener(new w(this));
        c20Var.setVisibility(8);
        c20 c20Var2 = new c20(context, this.resourcesProvider);
        this.E = c20Var2;
        c20Var2.setCloseButtonVisible(true);
        c20Var2.f22893x = true;
        c20Var2.e();
        String string2 = LocaleController.getString(R.string.Search);
        h2 h2Var2 = c20Var2.f22890r;
        h2Var2.setHint(string2);
        h2Var2.addTextChangedListener(new x(this));
        c20Var2.setVisibility(8);
        d61 d61Var = new d61(context, this.currentAccount, 0, false, new t(this, 0), new u(this, 0), null, this.resourcesProvider);
        this.G = d61Var;
        d61Var.j(new y(this));
        d61Var.setClipToPadding(false);
        d61Var.setVisibility(8);
        d61Var.p1();
        d61Var.Y2.f28662r = false;
        d61Var.setPadding(0, AndroidUtilities.dp(52.0f) + AndroidUtilities.statusBarHeight, 0, AndroidUtilities.navigationBarHeight);
        u10 u10Var = new u10(n2Var);
        this.F = u10Var;
        u10Var.setVisibility(8);
        u10Var.setBackground(null);
        u10Var.setChatPreviewDelegate(new Object());
        u10Var.setUiCallback(new a0(this));
        u10Var.f37846b.setClipToPadding(false);
        this.L = new View(getContext());
        Context context2 = getContext();
        d6 d6Var = this.resourcesProvider;
        t0 t0Var = new t0(context2, d6Var, new xc((FrameLayout) this.containerView, d6Var), this.currentAccount, j3);
        this.M = t0Var;
        t0Var.h = new b0(this, n2Var);
        this.e = j3;
        this.f9110f = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(j3));
        MessagesController.getInstance(this.currentAccount).getChatFull(j3);
        TLRPC.Chat chat = this.f9110f;
        this.h = chat != null && chat.collapsed_in_dialogs;
        gg.q0 q0Var = new gg.q0(R.drawable.search_users_filled, 4, DialogObject.getShortName(chat));
        q0Var.f9882f = this.f9110f;
        q0Var.h = false;
        ArrayList arrayList2 = c20Var.F;
        arrayList2.add(q0Var);
        c20Var.I = arrayList2.size() - 1;
        c20Var.f();
        setBackgroundColor(h6.v0(i10, this.resourcesProvider));
        this.f9114w = new j0(this, context);
        this.v = new f0(this, context);
        this.f9115x = new e0(this, context);
        this.d.setAdapter(new c0(this));
        c20Var.setCloseButtonOnClickListener(new v(this, 0));
        c20Var2.setCloseButtonOnClickListener(new v(this, 1));
        t0Var.d();
        MessagesController.getInstance(this.currentAccount).loadFullChat(j3, 0, true);
        qc.a((FrameLayout) this.containerView, new Object());
        ViewGroup viewGroup = this.containerView;
        u uVar = new u(this, 1);
        WeakHashMap weakHashMap = r0.i0.f41795a;
        r0.a0.j(viewGroup, uVar);
    }

    @Override
    public final void a(r2 r2Var) {
    }

    @Override
    public final void c() {
    }

    @Override
    public final void f(r2 r2Var) {
    }

    @Override
    public final void C(float f7, int i10) {
    }
}
