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
import ci.ab;
import ci.f9;
import ci.h2;
import ci.i1;
import ci.x8;
import ci.ya;
import ei.s4;
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
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.f3;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Cells.c1;
import org.telegram.ui.Cells.o2;
import org.telegram.ui.Cells.s2;
import org.telegram.ui.Cells.v8;
import org.telegram.ui.Components.c71;
import org.telegram.ui.Components.e5;
import org.telegram.ui.Components.f20;
import org.telegram.ui.Components.g61;
import org.telegram.ui.Components.rc;
import org.telegram.ui.Components.tr;
import org.telegram.ui.Components.u80;
import org.telegram.ui.Components.yc;
import org.telegram.ui.Components.zl0;
import org.telegram.ui.x10;
import org.telegram.ui.yf1;
import org.telegram.ui.yn;
import w7.d9;
import w7.z5;
public final class k0 extends f3 implements NotificationCenter.NotificationCenterDelegate, le.d, o2 {
    public static final int V = 0;
    public final f20 E;
    public final x10 F;
    public final c71 G;
    public final ab H;
    public final ab I;
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
    public final le.b f9915b;
    public final le.b f9916c;
    public final i1 d;
    public final long f9917e;
    public TLRPC.Chat f9918f;
    public boolean h;
    public ci.d f9919n;
    public ci.d f9920r;
    public final n2 f9921s;
    public final f0 v;
    public final j0 f9922w;
    public final e0 f9923x;
    public final f20 f9924y;

    public k0(n2 n2Var, long j3) {
        this(n2Var, j3, null, null);
    }

    public static void m(k0 k0Var, boolean z10, TLRPC.TL_error tL_error) {
        if (tL_error != null) {
            if (TextUtils.equals("COMMUNITY_REQUEST_CREATED", tL_error.text)) {
                u0.f(new yc((FrameLayout) k0Var.containerView, k0Var.resourcesProvider), 2, z10);
                k0Var.d.E(0);
                return;
            }
            c1.r((FrameLayout) k0Var.containerView, k0Var.resourcesProvider, tL_error, false);
            return;
        }
        u0.f(new yc((FrameLayout) k0Var.containerView, k0Var.resourcesProvider), 1, z10);
        k0Var.d.E(0);
    }

    public static void n(k0 k0Var, ArrayList arrayList, TLRPC.TL_error tL_error) {
        k0Var.f9919n.setLoading(false);
        if (tL_error != null) {
            c1.r((FrameLayout) k0Var.containerView, k0Var.resourcesProvider, tL_error, false);
        } else if (arrayList != null) {
            k0Var.Q = arrayList;
            if (arrayList.isEmpty()) {
                org.telegram.messenger.q.p(R.string.CommunityNoChatsToAdd, new yc((FrameLayout) k0Var.containerView, k0Var.resourcesProvider), R.raw.info, 36);
                return;
            }
            k0Var.f9923x.d.f25250f3.N(false);
            k0Var.d.E(2);
        }
    }

    public static void o(k0 k0Var, TLRPC.TL_error tL_error) {
        if (tL_error != null) {
            c1.r((FrameLayout) k0Var.containerView, k0Var.resourcesProvider, tL_error, false);
        }
    }

    public static void p(k0 k0Var, b2 b2Var, long j3, boolean z10, long j10) {
        b2Var.dismiss();
        if (j10 == 0) {
            return;
        }
        k0Var.T(MessagesController.getInstance(k0Var.currentAccount).getChat(Long.valueOf(j10)), j3, z10);
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
            textView.setTextColor(i6.w0(null, i6.f21063q7, false));
        }
    }

    public static void x(k0 k0Var) {
        if (!ChatObject.canAddChatToCommunity(k0Var.f9918f)) {
            k0Var.dismiss();
            return;
        }
        ci.d dVar = k0Var.f9919n;
        if (dVar.N) {
            return;
        }
        dVar.setLoading(true);
        MessagesController.getInstance(k0Var.currentAccount).fetchChatsToAddToCommunity(new t(k0Var, 2));
    }

    public static void y(k0 k0Var, g61 g61Var, View view) {
        long j3;
        TLRPC.Chat chat;
        int i10;
        n2 n2Var = k0Var.f9921s;
        if (!k0Var.R(g61Var)) {
            int i11 = g61Var.d;
            boolean z10 = false;
            if (i11 == 101) {
                k0Var.h = !k0Var.h;
                MessagesController.getInstance(k0Var.currentAccount).toggleCommunityCollapsedInDialogs(k0Var.f9917e, k0Var.h);
                if (view instanceof v8) {
                    ((v8) view).getCheckBox().c(k0Var.h, true);
                } else {
                    k0Var.v.d.f25250f3.N(false);
                }
            } else if (i11 == 100) {
                k0Var.d.E(1);
                k0Var.M.e();
            } else {
                Object obj = g61Var.G;
                if (obj instanceof TLRPC.Chat) {
                    chat = (TLRPC.Chat) obj;
                    z10 = ChatObject.isChannelAndNotMegaGroup(chat);
                    j3 = -chat.f20042id;
                } else if (obj instanceof TLRPC.User) {
                    j3 = ((TLRPC.User) obj).f20189id;
                    chat = null;
                } else {
                    return;
                }
                TLRPC.Chat chat2 = chat;
                int b10 = u0.b(k0Var.currentAccount, j3);
                if (b10 != 1 && b10 != 2) {
                    if (b10 == 3) {
                        u80 u80Var = new u80(k0Var.getContext(), chat2, null, k0Var.f9921s, k0Var.resourcesProvider);
                        u80Var.f31330n = new yc((FrameLayout) k0Var.containerView, k0Var.resourcesProvider);
                        u80Var.show();
                        return;
                    } else if (b10 == 4) {
                        yc ycVar = new yc((FrameLayout) k0Var.containerView, k0Var.resourcesProvider);
                        int i12 = R.raw.e_hand_2;
                        if (z10) {
                            i10 = R.string.CommunityHiddenChannelUnavailable;
                        } else {
                            i10 = R.string.CommunityHiddenGroupUnavailable;
                        }
                        org.telegram.messenger.q.p(i10, ycVar, i12, 36);
                        return;
                    } else {
                        return;
                    }
                }
                if (n2Var instanceof yn) {
                    yn ynVar = (yn) n2Var;
                    TLRPC.Chat chat3 = ynVar.f43322e;
                    TLRPC.User i13 = ynVar.i();
                    if ((chat3 != null && chat3.f20042id == (-j3)) || (i13 != null && i13.f20189id == j3)) {
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
                        yn ynVar2 = new yn(bundle);
                        ng.d.a(ynVar2, MessagesStorage.TopicKey.of(j3, MessagesController.getInstance(k0Var.currentAccount).getForumLastTopicId(chat2.f20042id)));
                        n2Var.presentFragment(ynVar2);
                    } else {
                        n2Var.presentFragment(new yf1(bundle));
                    }
                } else {
                    n2Var.presentFragment(new yn(bundle));
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
        arrayList.add(g61.D(99, Math.min(AndroidUtilities.dp(176.0f) + AndroidUtilities.statusBarHeight, (int) (AndroidUtilities.displaySize.y * 0.25f))));
        int i10 = 0;
        arrayList.add(g61.D(0, AndroidUtilities.dp(56.0f)));
        String string = LocaleController.getString(R.string.CommunityShowAsOneChat);
        g61 g61Var = new g61(39);
        g61Var.d = 101;
        g61Var.f26674l = string;
        g61Var.f26687z = 0;
        g61Var.K(k0Var.h);
        arrayList.add(g61Var);
        arrayList.add(g61.A(2, LocaleController.getString(R.string.CommunityShowAsOneChatInfo)));
        t0 t0Var = k0Var.M;
        boolean z11 = true;
        if (t0Var.f9986n && t0Var.f9984l == 1 && (arrayList2 = t0Var.f9982j) != null && arrayList2.size() == 1) {
            arrayList.add(g61.s(3, LocaleController.getString(R.string.CommunityPendingRequest)));
            t0Var.c(arrayList);
            arrayList.add(g61.D(5, AndroidUtilities.dp(14.33f)));
        } else {
            int i11 = t0Var.f9984l;
            if (i11 > 0) {
                int i12 = t0Var.f9988p;
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
                int i14 = gi.i.f10917a;
                g61 J = g61.J(gi.i.class);
                J.d = 100;
                J.f26673k = i13;
                J.f26674l = formatPluralString;
                J.f26676n = str;
                J.B = ((-15497247) << 32) | ((-14899731) & 4294967295L);
                J.f26679q = true;
                arrayList.add(J);
                arrayList.add(g61.D(5, AndroidUtilities.dp(14.33f)));
            }
        }
        MessagesController.CommunityPeersDialog buildCommunityPeers = MessagesController.getInstance(k0Var.currentAccount).buildCommunityPeers(k0Var.f9917e);
        if (buildCommunityPeers != null) {
            if (!buildCommunityPeers.chatsYouAreIn.isEmpty()) {
                arrayList.add(g61.s(21, LocaleController.getString(R.string.CommunitySectionChatsYouAreIn)));
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
                    arrayList.add(g61.D(22, AndroidUtilities.dp(12.0f)));
                }
                arrayList.add(g61.s(23, LocaleController.getString(R.string.CommunitySectionChatsYouCanView)));
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
                    arrayList.add(g61.D(24, AndroidUtilities.dp(12.0f)));
                }
                arrayList.add(g61.s(25, LocaleController.getString(R.string.CommunitySectionChatsYouCanRequestToJoin)));
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
                    arrayList.add(g61.D(26, AndroidUtilities.dp(12.0f)));
                }
                arrayList.add(g61.s(27, LocaleController.getString(R.string.CommunitySectionHiddenChats)));
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

    public final boolean R(g61 g61Var) {
        Object obj = g61Var.G;
        if (obj instanceof gi.f) {
            gi.f fVar = (gi.f) obj;
            long j3 = fVar.f10902a;
            TLRPC.Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-j3));
            TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(j3));
            n2 n2Var = this.f9921s;
            if (user != null) {
                n2Var.presentFragment(yn.Q9(user.f20189id));
                return true;
            } else if (!ChatObject.isPublic(chat) && !ChatObject.isInChat(chat)) {
                new hi.c(getContext(), chat, new x8(24, this, fVar)).show();
                return true;
            } else {
                n2Var.presentFragment(yn.Q9(-chat.f20042id));
                return true;
            }
        }
        return false;
    }

    public final void S(ArrayList arrayList, boolean z10) {
        String str;
        String str2;
        int i10 = 0;
        if (!z10) {
            arrayList.add(g61.D(99, (int) (AndroidUtilities.displaySize.y * 0.35f)));
            arrayList.add(g61.D(0, AndroidUtilities.dp(56.0f)));
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
                        arrayList.add(g61.v(chat));
                    }
                } else {
                    arrayList.add(g61.v(chat));
                }
            }
        }
    }

    public final void T(TLRPC.Chat chat, long j3, boolean z10) {
        long j10 = -chat.f20042id;
        boolean isChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(chat);
        if (!ChatObject.isChannel(chat)) {
            b2 b2Var = new b2(getContext(), 3, null);
            b2Var.q(250L);
            MessagesController.getInstance(this.currentAccount).convertToMegaGroup(getContext(), -j10, null, new d(this, b2Var, j3, z10, 1));
            return;
        }
        MessagesController.getInstance(this.currentAccount).linkCommunity(j10, j3, z10, new ya(isChannelAndNotMegaGroup, this, 1));
    }

    public final void U(g61 g61Var) {
        Object obj = g61Var.G;
        if (obj instanceof TLRPC.Chat) {
            TLRPC.Chat chat = (TLRPC.Chat) obj;
            if (this.N) {
                this.O.run(chat);
                dismiss();
                return;
            }
            new hi.b(getContext(), this.f9918f, -chat.f20042id, new g3(15, this, chat)).show();
        }
    }

    @Override
    public final void a0(int i10, float f7, float f10, le.e eVar) {
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
            float a2 = d9.a(f7);
            float lerp = AndroidUtilities.lerp(0.9f, 1.0f, a2);
            f0 f0Var = this.v;
            f0Var.f9898a.setAlpha(a2);
            f0Var.f9898a.setScaleX(lerp);
            f0Var.f9898a.setScaleY(lerp);
            org.telegram.ui.ActionBar.k kVar = f0Var.f9898a;
            int i21 = (a2 > 0.0f ? 1 : (a2 == 0.0f ? 0 : -1));
            if (i21 > 0) {
                i15 = 0;
            } else {
                i15 = 8;
            }
            kVar.setVisibility(i15);
            float lerp2 = AndroidUtilities.lerp(0.9f, 1.0f, f7);
            f20 f20Var = this.f9924y;
            f20Var.setAlpha(f7);
            f20Var.setScaleX(lerp2);
            f20Var.setScaleY(lerp2);
            int i22 = (f7 > 0.0f ? 1 : (f7 == 0.0f ? 0 : -1));
            if (i22 > 0) {
                i16 = 0;
            } else {
                i16 = 8;
            }
            f20Var.setVisibility(i16);
            f0Var.d.setAlpha(a2);
            c71 c71Var = f0Var.d;
            if (i21 > 0) {
                i17 = 0;
            } else {
                i17 = 8;
            }
            c71Var.setVisibility(i17);
            this.f9919n.setAlpha(a2);
            this.f9919n.setScaleX(AndroidUtilities.lerp(0.95f, 1.0f, a2));
            this.f9919n.setScaleY(AndroidUtilities.lerp(0.95f, 1.0f, a2));
            ci.d dVar = this.f9919n;
            if (i21 > 0) {
                i18 = 0;
            } else {
                i18 = 8;
            }
            dVar.setVisibility(i18);
            x10 x10Var = this.F;
            x10Var.setAlpha(f7);
            if (i22 > 0) {
                i19 = 0;
            } else {
                i19 = 8;
            }
            x10Var.setVisibility(i19);
            this.containerView.invalidate();
            this.H.invalidate();
        }
        if (i10 == 2) {
            float a10 = d9.a(f7);
            float lerp3 = AndroidUtilities.lerp(0.9f, 1.0f, a10);
            e0 e0Var = this.f9923x;
            e0Var.f9898a.setAlpha(a10);
            e0Var.f9898a.setScaleX(lerp3);
            e0Var.f9898a.setScaleY(lerp3);
            org.telegram.ui.ActionBar.k kVar2 = e0Var.f9898a;
            int i23 = (a10 > 0.0f ? 1 : (a10 == 0.0f ? 0 : -1));
            if (i23 > 0) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            kVar2.setVisibility(i11);
            float lerp4 = AndroidUtilities.lerp(0.9f, 1.0f, f7);
            f20 f20Var2 = this.E;
            f20Var2.setAlpha(f7);
            f20Var2.setScaleX(lerp4);
            f20Var2.setScaleY(lerp4);
            int i24 = (f7 > 0.0f ? 1 : (f7 == 0.0f ? 0 : -1));
            if (i24 > 0) {
                i12 = 0;
            } else {
                i12 = 8;
            }
            f20Var2.setVisibility(i12);
            e0Var.d.setAlpha(a10);
            c71 c71Var2 = e0Var.d;
            if (i23 > 0) {
                i13 = 0;
            } else {
                i13 = 8;
            }
            c71Var2.setVisibility(i13);
            if (!this.N) {
                this.f9920r.setAlpha(a10);
                this.f9920r.setScaleX(AndroidUtilities.lerp(0.95f, 1.0f, a10));
                this.f9920r.setScaleY(AndroidUtilities.lerp(0.95f, 1.0f, a10));
                ci.d dVar2 = this.f9920r;
                if (i23 > 0) {
                    i14 = 0;
                } else {
                    i14 = 8;
                }
                dVar2.setVisibility(i14);
            }
            c71 c71Var3 = this.G;
            c71Var3.setAlpha(f7);
            if (i24 > 0) {
                i20 = 0;
            }
            c71Var3.setVisibility(i20);
            this.containerView.invalidate();
            this.I.invalidate();
        }
    }

    @Override
    public final boolean b() {
        return true;
    }

    @Override
    public final boolean canDismissWithSwipe() {
        if (!this.f9915b.f15437f && !this.f9916c.f15437f) {
            View currentView = this.d.getCurrentView();
            if (currentView instanceof h0) {
                return ((h0) currentView).f9901e;
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
    public final void d(s2 s2Var) {
        TLRPC.TL_forumTopic findTopic;
        if (s2Var.getMessage() != null && (findTopic = MessagesController.getInstance(this.currentAccount).getTopicsController().findTopic(-s2Var.getDialogId(), MessageObject.getTopicId(this.currentAccount, s2Var.getMessage().messageOwner, true))) != null) {
            ng.d.m(this.f9921s, -s2Var.getDialogId(), findTopic, 0);
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12 = NotificationCenter.chatInfoDidLoad;
        long j3 = this.f9917e;
        f0 f0Var = this.v;
        if (i10 == i12) {
            if (((TLRPC.ChatFull) objArr[0]).f20043id == j3) {
                f0Var.d.f25250f3.N(true);
            }
        } else if (i10 == NotificationCenter.updateInterfaces) {
            Integer num = (Integer) objArr[0];
            if ((num.intValue() & MessagesController.UPDATE_MASK_CHAT) != 0 || (num.intValue() & MessagesController.UPDATE_MASK_AVATAR) != 0 || (num.intValue() & MessagesController.UPDATE_MASK_CHAT_AVATAR) != 0 || (num.intValue() & MessagesController.UPDATE_MASK_CHAT_NAME) != 0) {
                TLRPC.Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(j3));
                this.f9918f = chat;
                f0Var.f9898a.setTitle(DialogObject.getName(chat));
                f0Var.h.e(this.f9918f, f0Var.f9891n);
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
    public final void e(s2 s2Var) {
        if (MessagesController.getInstance(this.currentAccount).getStoriesController().I(s2Var.getDialogId())) {
            n2 n2Var = this.f9921s;
            n2Var.getOrCreateStoryViewer().getClass();
            n2Var.getOrCreateStoryViewer().D(n2Var.getContext(), s2Var.getDialogId(), u9.a((zl0) s2Var.getParent()));
        }
    }

    @Override
    public final void onBackPressed() {
        if (this.d.getCurrentPosition() > 0) {
            if (this.d.getCurrentPosition() == 2) {
                le.b bVar = this.f9916c;
                if (bVar.f15437f) {
                    this.f9923x.d.f25249e3.h1(1, this.U.f11527b);
                    bVar.a(false, true);
                    setAllowNestedScroll(true);
                    f20 f20Var = this.E;
                    AndroidUtilities.hideKeyboard(f20Var.f26252r);
                    f20Var.f26252r.clearFocus();
                    return;
                }
            }
            this.d.E(0);
            return;
        }
        super.onBackPressed();
    }

    public k0(n2 n2Var, long j3, ArrayList arrayList, s4 s4Var) {
        super(n2Var.getContext(), n2Var.getResourceProvider(), true, true);
        tr trVar = tr.h;
        this.f9915b = new le.b(1, this, trVar, 350L, false);
        this.f9916c = new le.b(2, this, trVar, 350L, false);
        this.J = new yf.y(2);
        this.K = new yf.y(8);
        Paint paint = new Paint(1);
        this.P = paint;
        i0.b bVar = i0.b.f11525e;
        this.T = bVar;
        this.U = bVar;
        AndroidUtilities.enableEdgeToEdge(getWindow());
        this.f9921s = n2Var;
        this.N = arrayList != null;
        this.Q = arrayList;
        this.O = s4Var;
        Context context = n2Var.getContext();
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.chatInfoDidLoad);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.updateInterfaces);
        int i10 = i6.f20766a7;
        paint.setColor(i6.v0(i10, this.resourcesProvider));
        fixNavigationBar(i6.v0(i10, this.resourcesProvider));
        this.containerView = new f9(this, context);
        i1 i1Var = new i1(this, context, 2);
        this.d = i1Var;
        int i11 = this.backgroundPaddingLeft;
        i1Var.setPadding(i11, 0, i11, 0);
        this.containerView.addView(this.d, z5.e(-1, -1, 119));
        this.H = new ab(this, context, 3);
        this.I = new ab(this, context, 3);
        f20 f20Var = new f20(context, this.resourcesProvider);
        this.f9924y = f20Var;
        f20Var.setCloseButtonVisible(true);
        f20Var.f26255x = true;
        f20Var.e();
        String string = LocaleController.getString(R.string.Search);
        h2 h2Var = f20Var.f26252r;
        h2Var.setHint(string);
        h2Var.addTextChangedListener(new w(this));
        f20Var.setVisibility(8);
        f20 f20Var2 = new f20(context, this.resourcesProvider);
        this.E = f20Var2;
        f20Var2.setCloseButtonVisible(true);
        f20Var2.f26255x = true;
        f20Var2.e();
        String string2 = LocaleController.getString(R.string.Search);
        h2 h2Var2 = f20Var2.f26252r;
        h2Var2.setHint(string2);
        h2Var2.addTextChangedListener(new x(this));
        f20Var2.setVisibility(8);
        c71 c71Var = new c71(context, this.currentAccount, 0, false, new t(this, 0), new u(this, 0), null, this.resourcesProvider);
        this.G = c71Var;
        c71Var.j(new y(this));
        c71Var.setClipToPadding(false);
        c71Var.setVisibility(8);
        c71Var.s1();
        c71Var.f25250f3.f31313r = false;
        c71Var.setPadding(0, AndroidUtilities.dp(52.0f) + AndroidUtilities.statusBarHeight, 0, AndroidUtilities.navigationBarHeight);
        x10 x10Var = new x10(n2Var);
        this.F = x10Var;
        x10Var.setVisibility(8);
        x10Var.setBackground(null);
        x10Var.setChatPreviewDelegate(new Object());
        x10Var.setUiCallback(new a0(this));
        x10Var.f42690b.setClipToPadding(false);
        this.L = new View(getContext());
        Context context2 = getContext();
        d6 d6Var = this.resourcesProvider;
        t0 t0Var = new t0(context2, d6Var, new yc((FrameLayout) this.containerView, d6Var), this.currentAccount, j3);
        this.M = t0Var;
        t0Var.h = new b0(this, n2Var);
        this.f9917e = j3;
        this.f9918f = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(j3));
        MessagesController.getInstance(this.currentAccount).getChatFull(j3);
        TLRPC.Chat chat = this.f9918f;
        this.h = chat != null && chat.collapsed_in_dialogs;
        gg.q0 q0Var = new gg.q0(R.drawable.search_users_filled, 4, DialogObject.getShortName(chat));
        q0Var.f10759f = this.f9918f;
        q0Var.h = false;
        ArrayList arrayList2 = f20Var.F;
        arrayList2.add(q0Var);
        f20Var.I = arrayList2.size() - 1;
        f20Var.f();
        setBackgroundColor(i6.v0(i10, this.resourcesProvider));
        this.f9922w = new j0(this, context);
        this.v = new f0(this, context);
        this.f9923x = new e0(this, context);
        this.d.setAdapter(new c0(this));
        f20Var.setCloseButtonOnClickListener(new v(this, 0));
        f20Var2.setCloseButtonOnClickListener(new v(this, 1));
        t0Var.d();
        MessagesController.getInstance(this.currentAccount).loadFullChat(j3, 0, true);
        rc.a((FrameLayout) this.containerView, new Object());
        ViewGroup viewGroup = this.containerView;
        u uVar = new u(this, 1);
        WeakHashMap weakHashMap = r0.i0.f45603a;
        r0.a0.j(viewGroup, uVar);
    }

    @Override
    public final void a(s2 s2Var) {
    }

    @Override
    public final void f(s2 s2Var) {
    }

    @Override
    public final void c() {
    }

    @Override
    public final void V(float f7, int i10) {
    }
}
