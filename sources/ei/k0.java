package ei;

import android.content.Context;
import android.graphics.Paint;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import bi.af;
import bi.la;
import bi.lc;
import bi.nc;
import bi.p1;
import bi.t2;
import bi.va;
import bi.y2;
import di.v4;
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
import org.telegram.messenger.a2;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d2;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.h3;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.Cells.n2;
import org.telegram.ui.Cells.r2;
import org.telegram.ui.Cells.r6;
import org.telegram.ui.Cells.w8;
import org.telegram.ui.Components.d5;
import org.telegram.ui.Components.k20;
import org.telegram.ui.Components.pc;
import org.telegram.ui.Components.q80;
import org.telegram.ui.Components.r61;
import org.telegram.ui.Components.v51;
import org.telegram.ui.Components.vl0;
import org.telegram.ui.Components.wc;
import org.telegram.ui.Components.wr;
import org.telegram.ui.eo;
import org.telegram.ui.ig1;
import org.telegram.ui.z10;
import w7.a6;
import zh.s5;
public final class k0 extends h3 implements NotificationCenter.NotificationCenterDelegate, le.d, n2 {
    public static final int V = 0;
    public final k20 E;
    public final z10 F;
    public final r61 G;
    public final nc H;
    public final nc I;
    public final xf.z J;
    public final xf.z K;
    public final View L;
    public final t0 M;
    public final boolean N;
    public final Utilities.Callback O;
    public final Paint P;
    public ArrayList Q;
    public String R;
    public String S;
    public i0.c T;
    public i0.c U;
    public final le.b f7569b;
    public final le.b f7570c;
    public final p1 d;
    public final long e;
    public TLRPC.Chat f7571f;
    public boolean h;
    public bi.d f7572n;
    public bi.d f7573r;
    public final p2 f7574s;
    public final f0 v;
    public final j0 f7575w;
    public final e0 f7576x;
    public final k20 f7577y;

    public k0(p2 p2Var, long j3) {
        this(p2Var, j3, null, null);
    }

    public static void m(k0 k0Var, boolean z10, TLRPC.TL_error tL_error) {
        if (tL_error != null) {
            if (TextUtils.equals("COMMUNITY_REQUEST_CREATED", tL_error.text)) {
                u0.f(new wc((FrameLayout) k0Var.containerView, k0Var.resourcesProvider), 2, z10);
                k0Var.d.D(0);
                return;
            }
            r6.q((FrameLayout) k0Var.containerView, k0Var.resourcesProvider, tL_error, false);
            return;
        }
        u0.f(new wc((FrameLayout) k0Var.containerView, k0Var.resourcesProvider), 1, z10);
        k0Var.d.D(0);
    }

    public static void n(k0 k0Var, ArrayList arrayList, TLRPC.TL_error tL_error) {
        k0Var.f7572n.setLoading(false);
        if (tL_error != null) {
            r6.q((FrameLayout) k0Var.containerView, k0Var.resourcesProvider, tL_error, false);
        } else if (arrayList != null) {
            k0Var.Q = arrayList;
            if (arrayList.isEmpty()) {
                a2.o(R.string.CommunityNoChatsToAdd, new wc((FrameLayout) k0Var.containerView, k0Var.resourcesProvider), R.raw.info, 36);
                return;
            }
            k0Var.f7576x.d.Y2.N(false);
            k0Var.d.D(2);
        }
    }

    public static void o(k0 k0Var, TLRPC.TL_error tL_error) {
        if (tL_error != null) {
            r6.q((FrameLayout) k0Var.containerView, k0Var.resourcesProvider, tL_error, false);
        }
    }

    public static void p(k0 k0Var, d2 d2Var, long j3, boolean z10, long j10) {
        d2Var.dismiss();
        if (j10 == 0) {
            return;
        }
        k0Var.V(MessagesController.getInstance(k0Var.currentAccount).getChat(Long.valueOf(j10)), j3, z10);
    }

    public static void q(k0 k0Var, boolean z10, boolean z11, long j3) {
        int i10;
        Context context = k0Var.getContext();
        f6 f6Var = k0Var.resourcesProvider;
        String string = LocaleController.getString(R.string.CommunityMenuRemoveFromCommunity);
        if (z10) {
            i10 = R.string.CommunityMenuRemoveBotFromCommunityConfirm;
        } else if (z11) {
            i10 = R.string.CommunityMenuRemoveChannelFromCommunityConfirm;
        } else {
            i10 = R.string.CommunityMenuRemoveGroupFromCommunityConfirm;
        }
        d2 P = d5.P(context, f6Var, string, LocaleController.getString(i10), LocaleController.getString(R.string.Remove), new va(k0Var, j3, 3));
        P.show();
        TextView textView = (TextView) P.d(-1);
        if (textView != null) {
            textView.setTextColor(j6.w0(null, j6.f18162q7, false));
        }
    }

    public static void x(k0 k0Var) {
        if (!ChatObject.canAddChatToCommunity(k0Var.f7571f)) {
            k0Var.dismiss();
            return;
        }
        bi.d dVar = k0Var.f7572n;
        if (dVar.N) {
            return;
        }
        dVar.setLoading(true);
        MessagesController.getInstance(k0Var.currentAccount).fetchChatsToAddToCommunity(new t(k0Var, 2));
    }

    public static void y(k0 k0Var, v51 v51Var, View view) {
        long j3;
        TLRPC.Chat chat;
        int i10;
        p2 p2Var = k0Var.f7574s;
        if (!k0Var.T(v51Var)) {
            int i11 = v51Var.d;
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
                Object obj = v51Var.G;
                if (obj instanceof TLRPC.Chat) {
                    chat = (TLRPC.Chat) obj;
                    z10 = ChatObject.isChannelAndNotMegaGroup(chat);
                    j3 = -chat.f17195id;
                } else if (obj instanceof TLRPC.User) {
                    j3 = ((TLRPC.User) obj).f17342id;
                    chat = null;
                } else {
                    return;
                }
                TLRPC.Chat chat2 = chat;
                int b10 = u0.b(k0Var.currentAccount, j3);
                if (b10 != 1 && b10 != 2) {
                    if (b10 == 3) {
                        q80 q80Var = new q80(k0Var.getContext(), chat2, null, k0Var.f7574s, k0Var.resourcesProvider);
                        q80Var.f26341n = new wc((FrameLayout) k0Var.containerView, k0Var.resourcesProvider);
                        q80Var.show();
                        return;
                    } else if (b10 == 4) {
                        wc wcVar = new wc((FrameLayout) k0Var.containerView, k0Var.resourcesProvider);
                        int i12 = R.raw.e_hand_2;
                        if (z10) {
                            i10 = R.string.CommunityHiddenChannelUnavailable;
                        } else {
                            i10 = R.string.CommunityHiddenGroupUnavailable;
                        }
                        a2.o(i10, wcVar, i12, 36);
                        return;
                    } else {
                        return;
                    }
                }
                if (p2Var instanceof eo) {
                    eo eoVar = (eo) p2Var;
                    TLRPC.Chat chat3 = eoVar.e;
                    TLRPC.User i13 = eoVar.i();
                    if ((chat3 != null && chat3.f17195id == (-j3)) || (i13 != null && i13.f17342id == j3)) {
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
                        eo eoVar2 = new eo(bundle);
                        mg.d.a(eoVar2, MessagesStorage.TopicKey.of(j3, MessagesController.getInstance(k0Var.currentAccount).getForumLastTopicId(chat2.f17195id)));
                        p2Var.presentFragment(eoVar2);
                    } else {
                        p2Var.presentFragment(new ig1(bundle));
                    }
                } else {
                    p2Var.presentFragment(new eo(bundle));
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
        arrayList.add(v51.D(99, Math.min(AndroidUtilities.dp(176.0f) + AndroidUtilities.statusBarHeight, (int) (AndroidUtilities.displaySize.y * 0.25f))));
        int i10 = 0;
        arrayList.add(v51.D(0, AndroidUtilities.dp(56.0f)));
        String string = LocaleController.getString(R.string.CommunityShowAsOneChat);
        v51 v51Var = new v51(39);
        v51Var.d = 101;
        v51Var.f27829l = string;
        v51Var.f27842z = 0;
        v51Var.K(k0Var.h);
        arrayList.add(v51Var);
        arrayList.add(v51.A(2, LocaleController.getString(R.string.CommunityShowAsOneChatInfo)));
        t0 t0Var = k0Var.M;
        boolean z11 = true;
        if (t0Var.f7633n && t0Var.f7631l == 1 && (arrayList2 = t0Var.f7629j) != null && arrayList2.size() == 1) {
            arrayList.add(v51.s(3, LocaleController.getString(R.string.CommunityPendingRequest)));
            t0Var.c(arrayList);
            arrayList.add(v51.D(5, AndroidUtilities.dp(14.33f)));
        } else {
            int i11 = t0Var.f7631l;
            if (i11 > 0) {
                int i12 = t0Var.f7635p;
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
                int i14 = fi.i.f8321a;
                v51 J = v51.J(fi.i.class);
                J.d = 100;
                J.f27828k = i13;
                J.f27829l = formatPluralString;
                J.f27831n = str;
                J.B = ((-15497247) << 32) | ((-14899731) & 4294967295L);
                J.f27834q = true;
                arrayList.add(J);
                arrayList.add(v51.D(5, AndroidUtilities.dp(14.33f)));
            }
        }
        MessagesController.CommunityPeersDialog buildCommunityPeers = MessagesController.getInstance(k0Var.currentAccount).buildCommunityPeers(k0Var.e);
        if (buildCommunityPeers != null) {
            if (!buildCommunityPeers.chatsYouAreIn.isEmpty()) {
                arrayList.add(v51.s(21, LocaleController.getString(R.string.CommunitySectionChatsYouAreIn)));
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
                    arrayList.add(v51.D(22, AndroidUtilities.dp(12.0f)));
                }
                arrayList.add(v51.s(23, LocaleController.getString(R.string.CommunitySectionChatsYouCanView)));
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
                    arrayList.add(v51.D(24, AndroidUtilities.dp(12.0f)));
                }
                arrayList.add(v51.s(25, LocaleController.getString(R.string.CommunitySectionChatsYouCanRequestToJoin)));
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
                    arrayList.add(v51.D(26, AndroidUtilities.dp(12.0f)));
                }
                arrayList.add(v51.s(27, LocaleController.getString(R.string.CommunitySectionHiddenChats)));
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
    public final void G(int i10, float f7, float f10, le.e eVar) {
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
            float b10 = xf.f0.b(f7);
            float lerp = AndroidUtilities.lerp(0.9f, 1.0f, b10);
            f0 f0Var = this.v;
            f0Var.f7554a.setAlpha(b10);
            f0Var.f7554a.setScaleX(lerp);
            f0Var.f7554a.setScaleY(lerp);
            org.telegram.ui.ActionBar.l lVar = f0Var.f7554a;
            int i21 = (b10 > 0.0f ? 1 : (b10 == 0.0f ? 0 : -1));
            if (i21 > 0) {
                i15 = 0;
            } else {
                i15 = 8;
            }
            lVar.setVisibility(i15);
            float lerp2 = AndroidUtilities.lerp(0.9f, 1.0f, f7);
            k20 k20Var = this.f7577y;
            k20Var.setAlpha(f7);
            k20Var.setScaleX(lerp2);
            k20Var.setScaleY(lerp2);
            int i22 = (f7 > 0.0f ? 1 : (f7 == 0.0f ? 0 : -1));
            if (i22 > 0) {
                i16 = 0;
            } else {
                i16 = 8;
            }
            k20Var.setVisibility(i16);
            f0Var.d.setAlpha(b10);
            r61 r61Var = f0Var.d;
            if (i21 > 0) {
                i17 = 0;
            } else {
                i17 = 8;
            }
            r61Var.setVisibility(i17);
            this.f7572n.setAlpha(b10);
            this.f7572n.setScaleX(AndroidUtilities.lerp(0.95f, 1.0f, b10));
            this.f7572n.setScaleY(AndroidUtilities.lerp(0.95f, 1.0f, b10));
            bi.d dVar = this.f7572n;
            if (i21 > 0) {
                i18 = 0;
            } else {
                i18 = 8;
            }
            dVar.setVisibility(i18);
            z10 z10Var = this.F;
            z10Var.setAlpha(f7);
            if (i22 > 0) {
                i19 = 0;
            } else {
                i19 = 8;
            }
            z10Var.setVisibility(i19);
            this.containerView.invalidate();
            this.H.invalidate();
        }
        if (i10 == 2) {
            float b11 = xf.f0.b(f7);
            float lerp3 = AndroidUtilities.lerp(0.9f, 1.0f, b11);
            e0 e0Var = this.f7576x;
            e0Var.f7554a.setAlpha(b11);
            e0Var.f7554a.setScaleX(lerp3);
            e0Var.f7554a.setScaleY(lerp3);
            org.telegram.ui.ActionBar.l lVar2 = e0Var.f7554a;
            int i23 = (b11 > 0.0f ? 1 : (b11 == 0.0f ? 0 : -1));
            if (i23 > 0) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            lVar2.setVisibility(i11);
            float lerp4 = AndroidUtilities.lerp(0.9f, 1.0f, f7);
            k20 k20Var2 = this.E;
            k20Var2.setAlpha(f7);
            k20Var2.setScaleX(lerp4);
            k20Var2.setScaleY(lerp4);
            int i24 = (f7 > 0.0f ? 1 : (f7 == 0.0f ? 0 : -1));
            if (i24 > 0) {
                i12 = 0;
            } else {
                i12 = 8;
            }
            k20Var2.setVisibility(i12);
            e0Var.d.setAlpha(b11);
            r61 r61Var2 = e0Var.d;
            if (i23 > 0) {
                i13 = 0;
            } else {
                i13 = 8;
            }
            r61Var2.setVisibility(i13);
            if (!this.N) {
                this.f7573r.setAlpha(b11);
                this.f7573r.setScaleX(AndroidUtilities.lerp(0.95f, 1.0f, b11));
                this.f7573r.setScaleY(AndroidUtilities.lerp(0.95f, 1.0f, b11));
                bi.d dVar2 = this.f7573r;
                if (i23 > 0) {
                    i14 = 0;
                } else {
                    i14 = 8;
                }
                dVar2.setVisibility(i14);
            }
            r61 r61Var3 = this.G;
            r61Var3.setAlpha(f7);
            if (i24 > 0) {
                i20 = 0;
            }
            r61Var3.setVisibility(i20);
            this.containerView.invalidate();
            this.I.invalidate();
        }
    }

    public final boolean T(v51 v51Var) {
        Object obj = v51Var.G;
        if (obj instanceof fi.f) {
            fi.f fVar = (fi.f) obj;
            long j3 = fVar.f8307a;
            TLRPC.Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-j3));
            TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(j3));
            p2 p2Var = this.f7574s;
            if (user != null) {
                p2Var.presentFragment(eo.R9(user.f17342id));
                return true;
            } else if (!ChatObject.isPublic(chat) && !ChatObject.isInChat(chat)) {
                new gi.c(getContext(), chat, new af(25, this, fVar)).show();
                return true;
            } else {
                p2Var.presentFragment(eo.R9(-chat.f17195id));
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
            arrayList.add(v51.D(99, (int) (AndroidUtilities.displaySize.y * 0.35f)));
            arrayList.add(v51.D(0, AndroidUtilities.dp(56.0f)));
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
                        arrayList.add(v51.v(chat));
                    }
                } else {
                    arrayList.add(v51.v(chat));
                }
            }
        }
    }

    public final void V(TLRPC.Chat chat, long j3, boolean z10) {
        long j10 = -chat.f17195id;
        boolean isChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(chat);
        if (!ChatObject.isChannel(chat)) {
            d2 d2Var = new d2(getContext(), 3, null);
            d2Var.q(250L);
            MessagesController.getInstance(this.currentAccount).convertToMegaGroup(getContext(), -j10, null, new d(this, d2Var, j3, z10, 1));
            return;
        }
        MessagesController.getInstance(this.currentAccount).linkCommunity(j10, j3, z10, new lc(isChannelAndNotMegaGroup, this, 1));
    }

    public final void W(v51 v51Var) {
        Object obj = v51Var.G;
        if (obj instanceof TLRPC.Chat) {
            TLRPC.Chat chat = (TLRPC.Chat) obj;
            if (this.N) {
                this.O.run(chat);
                dismiss();
                return;
            }
            new gi.b(getContext(), this.f7571f, -chat.f17195id, new y2(14, this, chat)).show();
        }
    }

    @Override
    public final boolean b() {
        return true;
    }

    @Override
    public final boolean canDismissWithSwipe() {
        if (!this.f7569b.f12870f && !this.f7570c.f12870f) {
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
            mg.d.m(this.f7574s, -r2Var.getDialogId(), findTopic, 0);
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12 = NotificationCenter.chatInfoDidLoad;
        long j3 = this.e;
        f0 f0Var = this.v;
        if (i10 == i12) {
            if (((TLRPC.ChatFull) objArr[0]).f17196id == j3) {
                f0Var.d.Y2.N(true);
            }
        } else if (i10 == NotificationCenter.updateInterfaces) {
            Integer num = (Integer) objArr[0];
            if ((num.intValue() & MessagesController.UPDATE_MASK_CHAT) != 0 || (num.intValue() & MessagesController.UPDATE_MASK_AVATAR) != 0 || (num.intValue() & MessagesController.UPDATE_MASK_CHAT_AVATAR) != 0 || (num.intValue() & MessagesController.UPDATE_MASK_CHAT_NAME) != 0) {
                TLRPC.Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(j3));
                this.f7571f = chat;
                f0Var.f7554a.setTitle(DialogObject.getName(chat));
                f0Var.h.e(this.f7571f, f0Var.f7547n);
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
            p2 p2Var = this.f7574s;
            p2Var.getOrCreateStoryViewer().getClass();
            p2Var.getOrCreateStoryViewer().D(p2Var.getContext(), r2Var.getDialogId(), s5.a((vl0) r2Var.getParent()));
        }
    }

    @Override
    public final void onBackPressed() {
        if (this.d.getCurrentPosition() > 0) {
            if (this.d.getCurrentPosition() == 2) {
                le.b bVar = this.f7570c;
                if (bVar.f12870f) {
                    this.f7576x.d.X2.h1(1, this.U.f10075b);
                    bVar.a(false, true);
                    setAllowNestedScroll(true);
                    k20 k20Var = this.E;
                    AndroidUtilities.hideKeyboard(k20Var.f24572r);
                    k20Var.f24572r.clearFocus();
                    return;
                }
            }
            this.d.D(0);
            return;
        }
        super.onBackPressed();
    }

    public k0(p2 p2Var, long j3, ArrayList arrayList, v4 v4Var) {
        super(p2Var.getContext(), p2Var.getResourceProvider(), true, true);
        wr wrVar = wr.h;
        this.f7569b = new le.b(1, this, wrVar, 350L, false);
        this.f7570c = new le.b(2, this, wrVar, 350L, false);
        this.J = new xf.z(2);
        this.K = new xf.z(8);
        Paint paint = new Paint(1);
        this.P = paint;
        i0.c cVar = i0.c.e;
        this.T = cVar;
        this.U = cVar;
        AndroidUtilities.enableEdgeToEdge(getWindow());
        this.f7574s = p2Var;
        this.N = arrayList != null;
        this.Q = arrayList;
        this.O = v4Var;
        Context context = p2Var.getContext();
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.chatInfoDidLoad);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.updateInterfaces);
        int i10 = j6.f17872a7;
        paint.setColor(j6.v0(i10, this.resourcesProvider));
        fixNavigationBar(j6.v0(i10, this.resourcesProvider));
        this.containerView = new la(this, context);
        p1 p1Var = new p1(this, context, 2);
        this.d = p1Var;
        int i11 = this.backgroundPaddingLeft;
        p1Var.setPadding(i11, 0, i11, 0);
        this.containerView.addView(this.d, a6.e(-1, -1, 119));
        this.H = new nc(this, context, 3);
        this.I = new nc(this, context, 3);
        k20 k20Var = new k20(context, this.resourcesProvider);
        this.f7577y = k20Var;
        k20Var.setCloseButtonVisible(true);
        k20Var.f24575x = true;
        k20Var.e();
        String string = LocaleController.getString(R.string.Search);
        t2 t2Var = k20Var.f24572r;
        t2Var.setHint(string);
        t2Var.addTextChangedListener(new w(this));
        k20Var.setVisibility(8);
        k20 k20Var2 = new k20(context, this.resourcesProvider);
        this.E = k20Var2;
        k20Var2.setCloseButtonVisible(true);
        k20Var2.f24575x = true;
        k20Var2.e();
        String string2 = LocaleController.getString(R.string.Search);
        t2 t2Var2 = k20Var2.f24572r;
        t2Var2.setHint(string2);
        t2Var2.addTextChangedListener(new x(this));
        k20Var2.setVisibility(8);
        r61 r61Var = new r61(context, this.currentAccount, 0, false, new t(this, 0), new u(this, 0), null, this.resourcesProvider);
        this.G = r61Var;
        r61Var.j(new y(this));
        r61Var.setClipToPadding(false);
        r61Var.setVisibility(8);
        r61Var.o1();
        r61Var.Y2.f24250r = false;
        r61Var.setPadding(0, AndroidUtilities.dp(52.0f) + AndroidUtilities.statusBarHeight, 0, AndroidUtilities.navigationBarHeight);
        z10 z10Var = new z10(p2Var);
        this.F = z10Var;
        z10Var.setVisibility(8);
        z10Var.setBackground(null);
        z10Var.setChatPreviewDelegate(new Object());
        z10Var.setUiCallback(new a0(this));
        z10Var.f39162b.setClipToPadding(false);
        this.L = new View(getContext());
        Context context2 = getContext();
        f6 f6Var = this.resourcesProvider;
        t0 t0Var = new t0(context2, f6Var, new wc((FrameLayout) this.containerView, f6Var), this.currentAccount, j3);
        this.M = t0Var;
        t0Var.h = new b0(this, p2Var);
        this.e = j3;
        this.f7571f = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(j3));
        MessagesController.getInstance(this.currentAccount).getChatFull(j3);
        TLRPC.Chat chat = this.f7571f;
        this.h = chat != null && chat.collapsed_in_dialogs;
        fg.q0 q0Var = new fg.q0(R.drawable.search_users_filled, 4, DialogObject.getShortName(chat));
        q0Var.f8183f = this.f7571f;
        q0Var.h = false;
        ArrayList arrayList2 = k20Var.F;
        arrayList2.add(q0Var);
        k20Var.I = arrayList2.size() - 1;
        k20Var.f();
        setBackgroundColor(j6.v0(i10, this.resourcesProvider));
        this.f7575w = new j0(this, context);
        this.v = new f0(this, context);
        this.f7576x = new e0(this, context);
        this.d.setAdapter(new c0(this));
        k20Var.setCloseButtonOnClickListener(new v(this, 0));
        k20Var2.setCloseButtonOnClickListener(new v(this, 1));
        t0Var.d();
        MessagesController.getInstance(this.currentAccount).loadFullChat(j3, 0, true);
        pc.a((FrameLayout) this.containerView, new Object());
        ViewGroup viewGroup = this.containerView;
        u uVar = new u(this, 1);
        WeakHashMap weakHashMap = r0.i0.f41062a;
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
    public final void B(float f7, int i10) {
    }
}
