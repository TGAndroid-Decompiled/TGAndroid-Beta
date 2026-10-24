package hi;

import ai.jc;
import ai.v3;
import android.content.Context;
import android.graphics.Paint;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import ci.q7;
import ei.e2;
import ei.h1;
import ei.ka;
import ei.u8;
import gi.g4;
import java.util.ArrayList;
import java.util.WeakHashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.v0;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.c2;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.h3;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Cells.b1;
import org.telegram.ui.Cells.m2;
import org.telegram.ui.Cells.q2;
import org.telegram.ui.Cells.v8;
import org.telegram.ui.Components.d5;
import org.telegram.ui.Components.i20;
import org.telegram.ui.Components.i71;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.lm0;
import org.telegram.ui.Components.oc;
import org.telegram.ui.Components.vc;
import org.telegram.ui.Components.z80;
import org.telegram.ui.Components.zr;
import org.telegram.ui.i10;
import org.telegram.ui.sn;
import org.telegram.ui.xe1;
import w7.z5;
public final class k0 extends h3 implements NotificationCenter.NotificationCenterDelegate, ne.d, m2 {
    public static final int V = 0;
    public final i20 E;
    public final i10 F;
    public final i71 G;
    public final jc H;
    public final jc I;
    public final zf.y J;
    public final zf.y K;
    public final View L;
    public final s0 M;
    public final boolean N;
    public final Utilities.Callback O;
    public final Paint P;
    public ArrayList Q;
    public String R;
    public String S;
    public i0.b T;
    public i0.b U;
    public final ne.b f12199b;
    public final ne.b f12200c;
    public final h1 d;
    public final long e;
    public TLRPC.Chat f12201f;
    public boolean h;
    public ei.d f12202n;
    public ei.d f12203r;
    public final o2 f12204s;
    public final f0 v;
    public final j0 f12205w;
    public final e0 f12206x;
    public final i20 f12207y;

    public k0(o2 o2Var, long j10) {
        this(o2Var, j10, null, null);
    }

    public static void B(k0 k0Var) {
        if (!ChatObject.canAddChatToCommunity(k0Var.f12201f)) {
            k0Var.dismiss();
            return;
        }
        ei.d dVar = k0Var.f12202n;
        if (dVar.Q) {
            return;
        }
        dVar.setLoading(true);
        MessagesController.getInstance(k0Var.currentAccount).fetchChatsToAddToCommunity(new s(k0Var, 2));
    }

    public static void C(k0 k0Var, l61 l61Var, View view) {
        long j10;
        TLRPC.Chat chat;
        int i10;
        o2 o2Var = k0Var.f12204s;
        if (!k0Var.d0(l61Var)) {
            int i11 = l61Var.d;
            boolean z10 = false;
            if (i11 == 101) {
                k0Var.h = !k0Var.h;
                MessagesController.getInstance(k0Var.currentAccount).toggleCommunityCollapsedInDialogs(k0Var.e, k0Var.h);
                if (view instanceof v8) {
                    ((v8) view).getCheckBox().c(k0Var.h, true);
                } else {
                    k0Var.v.d.Z2.N(false);
                }
            } else if (i11 == 100) {
                k0Var.d.D(1);
                k0Var.M.e();
            } else {
                Object obj = l61Var.G;
                if (obj instanceof TLRPC.Chat) {
                    chat = (TLRPC.Chat) obj;
                    z10 = ChatObject.isChannelAndNotMegaGroup(chat);
                    j10 = -chat.f20344id;
                } else if (obj instanceof TLRPC.User) {
                    j10 = ((TLRPC.User) obj).f20491id;
                    chat = null;
                } else {
                    return;
                }
                TLRPC.Chat chat2 = chat;
                int b10 = t0.b(k0Var.currentAccount, j10);
                if (b10 != 1 && b10 != 2) {
                    if (b10 == 3) {
                        z80 z80Var = new z80(k0Var.getContext(), chat2, null, k0Var.f12204s, k0Var.resourcesProvider);
                        z80Var.f33178r = new vc((FrameLayout) k0Var.containerView, k0Var.resourcesProvider);
                        z80Var.show();
                        return;
                    } else if (b10 == 4) {
                        vc vcVar = new vc((FrameLayout) k0Var.containerView, k0Var.resourcesProvider);
                        int i12 = R.raw.e_hand_2;
                        if (z10) {
                            i10 = R.string.CommunityHiddenChannelUnavailable;
                        } else {
                            i10 = R.string.CommunityHiddenGroupUnavailable;
                        }
                        v0.p(i10, vcVar, i12, 36);
                        return;
                    } else {
                        return;
                    }
                }
                if (o2Var instanceof sn) {
                    sn snVar = (sn) o2Var;
                    TLRPC.Chat chat3 = snVar.e;
                    TLRPC.User i13 = snVar.i();
                    if ((chat3 != null && chat3.f20344id == (-j10)) || (i13 != null && i13.f20491id == j10)) {
                        k0Var.dismiss();
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
                        sn snVar2 = new sn(bundle);
                        og.d.a(snVar2, MessagesStorage.TopicKey.of(j10, MessagesController.getInstance(k0Var.currentAccount).getForumLastTopicId(chat2.f20344id)));
                        o2Var.presentFragment(snVar2);
                    } else {
                        o2Var.presentFragment(new xe1(bundle));
                    }
                } else {
                    o2Var.presentFragment(new sn(bundle));
                }
                k0Var.dismiss();
            }
        }
    }

    public static void D(k0 k0Var, ArrayList arrayList) {
        String formatPluralString;
        String str;
        boolean z10;
        ArrayList arrayList2;
        arrayList.add(l61.D(99, Math.min(AndroidUtilities.dp(176.0f) + AndroidUtilities.statusBarHeight, (int) (AndroidUtilities.displaySize.y * 0.25f))));
        int i10 = 0;
        arrayList.add(l61.D(0, AndroidUtilities.dp(56.0f)));
        String string = LocaleController.getString(R.string.CommunityShowAsOneChat);
        l61 l61Var = new l61(39);
        l61Var.d = 101;
        l61Var.f28227l = string;
        l61Var.f28240z = 0;
        l61Var.K(k0Var.h);
        arrayList.add(l61Var);
        arrayList.add(l61.A(2, LocaleController.getString(R.string.CommunityShowAsOneChatInfo)));
        s0 s0Var = k0Var.M;
        boolean z11 = true;
        if (s0Var.f12260n && s0Var.f12258l == 1 && (arrayList2 = s0Var.f12256j) != null && arrayList2.size() == 1) {
            arrayList.add(l61.s(3, LocaleController.getString(R.string.CommunityPendingRequest)));
            s0Var.c(arrayList);
            arrayList.add(l61.D(5, AndroidUtilities.dp(14.33f)));
        } else {
            int i11 = s0Var.f12258l;
            if (i11 > 0) {
                int i12 = s0Var.f12262p;
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
                int i14 = ii.i.f13219a;
                l61 J = l61.J(ii.i.class);
                J.d = 100;
                J.f28226k = i13;
                J.f28227l = formatPluralString;
                J.f28229n = str;
                J.B = ((-15497247) << 32) | ((-14899731) & 4294967295L);
                J.f28232q = true;
                arrayList.add(J);
                arrayList.add(l61.D(5, AndroidUtilities.dp(14.33f)));
            }
        }
        MessagesController.CommunityPeersDialog buildCommunityPeers = MessagesController.getInstance(k0Var.currentAccount).buildCommunityPeers(k0Var.e);
        if (buildCommunityPeers != null) {
            if (!buildCommunityPeers.chatsYouAreIn.isEmpty()) {
                arrayList.add(l61.s(21, LocaleController.getString(R.string.CommunitySectionChatsYouAreIn)));
                ArrayList<MessagesController.CommunityPeerDialog> arrayList3 = buildCommunityPeers.chatsYouAreIn;
                int size = arrayList3.size();
                int i15 = 0;
                while (i15 < size) {
                    MessagesController.CommunityPeerDialog communityPeerDialog = arrayList3.get(i15);
                    i15++;
                    arrayList.add(p0.a(communityPeerDialog, k0Var));
                }
                z10 = true;
            } else {
                z10 = false;
            }
            if (!buildCommunityPeers.chatsYouCanView.isEmpty()) {
                if (z10) {
                    arrayList.add(l61.D(22, AndroidUtilities.dp(12.0f)));
                }
                arrayList.add(l61.s(23, LocaleController.getString(R.string.CommunitySectionChatsYouCanView)));
                ArrayList<MessagesController.CommunityPeerDialog> arrayList4 = buildCommunityPeers.chatsYouCanView;
                int size2 = arrayList4.size();
                int i16 = 0;
                while (i16 < size2) {
                    MessagesController.CommunityPeerDialog communityPeerDialog2 = arrayList4.get(i16);
                    i16++;
                    arrayList.add(p0.a(communityPeerDialog2, k0Var));
                }
                z10 = true;
            }
            if (!buildCommunityPeers.chatsYouCanJoin.isEmpty()) {
                if (z10) {
                    arrayList.add(l61.D(24, AndroidUtilities.dp(12.0f)));
                }
                arrayList.add(l61.s(25, LocaleController.getString(R.string.CommunitySectionChatsYouCanRequestToJoin)));
                ArrayList<MessagesController.CommunityPeerDialog> arrayList5 = buildCommunityPeers.chatsYouCanJoin;
                int size3 = arrayList5.size();
                int i17 = 0;
                while (i17 < size3) {
                    MessagesController.CommunityPeerDialog communityPeerDialog3 = arrayList5.get(i17);
                    i17++;
                    arrayList.add(p0.a(communityPeerDialog3, k0Var));
                }
            } else {
                z11 = z10;
            }
            if (!buildCommunityPeers.chatsOther.isEmpty()) {
                if (z11) {
                    arrayList.add(l61.D(26, AndroidUtilities.dp(12.0f)));
                }
                arrayList.add(l61.s(27, LocaleController.getString(R.string.CommunitySectionHiddenChats)));
                ArrayList<MessagesController.CommunityPeerDialog> arrayList6 = buildCommunityPeers.chatsOther;
                int size4 = arrayList6.size();
                while (i10 < size4) {
                    MessagesController.CommunityPeerDialog communityPeerDialog4 = arrayList6.get(i10);
                    i10++;
                    arrayList.add(p0.a(communityPeerDialog4, k0Var));
                }
            }
        }
    }

    public static ViewGroup W(k0 k0Var) {
        return k0Var.containerView;
    }

    public static void m(k0 k0Var, boolean z10, TLRPC.TL_error tL_error) {
        if (tL_error != null) {
            if (TextUtils.equals("COMMUNITY_REQUEST_CREATED", tL_error.text)) {
                t0.f(new vc((FrameLayout) k0Var.containerView, k0Var.resourcesProvider), 2, z10);
                k0Var.d.D(0);
                return;
            }
            b1.s((FrameLayout) k0Var.containerView, k0Var.resourcesProvider, tL_error, false);
            return;
        }
        t0.f(new vc((FrameLayout) k0Var.containerView, k0Var.resourcesProvider), 1, z10);
        k0Var.d.D(0);
    }

    public static void n(k0 k0Var, ArrayList arrayList, TLRPC.TL_error tL_error) {
        k0Var.f12202n.setLoading(false);
        if (tL_error != null) {
            b1.s((FrameLayout) k0Var.containerView, k0Var.resourcesProvider, tL_error, false);
        } else if (arrayList != null) {
            k0Var.Q = arrayList;
            if (arrayList.isEmpty()) {
                v0.p(R.string.CommunityNoChatsToAdd, new vc((FrameLayout) k0Var.containerView, k0Var.resourcesProvider), R.raw.info, 36);
                return;
            }
            k0Var.f12206x.d.Z2.N(false);
            k0Var.d.D(2);
        }
    }

    public static void p(k0 k0Var, TLRPC.TL_error tL_error) {
        if (tL_error != null) {
            b1.s((FrameLayout) k0Var.containerView, k0Var.resourcesProvider, tL_error, false);
        }
    }

    public static void q(k0 k0Var, c2 c2Var, long j10, boolean z10, long j11) {
        c2Var.dismiss();
        if (j11 == 0) {
            return;
        }
        k0Var.f0(MessagesController.getInstance(k0Var.currentAccount).getChat(Long.valueOf(j11)), j10, z10);
    }

    public static void r(k0 k0Var, boolean z10, boolean z11, long j10) {
        int i10;
        Context context = k0Var.getContext();
        g6 g6Var = k0Var.resourcesProvider;
        String string = LocaleController.getString(R.string.CommunityMenuRemoveFromCommunity);
        if (z10) {
            i10 = R.string.CommunityMenuRemoveBotFromCommunityConfirm;
        } else if (z11) {
            i10 = R.string.CommunityMenuRemoveChannelFromCommunityConfirm;
        } else {
            i10 = R.string.CommunityMenuRemoveGroupFromCommunityConfirm;
        }
        c2 O = d5.O(context, g6Var, string, LocaleController.getString(i10), LocaleController.getString(R.string.Remove), new v3(k0Var, j10, 11));
        O.show();
        TextView textView = (TextView) O.d(-1);
        if (textView != null) {
            r6.W(textView, k6.f21422q7, null);
        }
    }

    @Override
    public final boolean b() {
        return true;
    }

    @Override
    public final boolean canDismissWithSwipe() {
        if (!this.f12199b.f17447f && !this.f12200c.f17447f) {
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
    public final void d(q2 q2Var) {
        TLRPC.TL_forumTopic findTopic;
        if (q2Var.getMessage() != null && (findTopic = MessagesController.getInstance(this.currentAccount).getTopicsController().findTopic(-q2Var.getDialogId(), MessageObject.getTopicId(this.currentAccount, q2Var.getMessage().messageOwner, true))) != null) {
            og.d.m(this.f12204s, -q2Var.getDialogId(), findTopic, 0);
        }
    }

    public final boolean d0(l61 l61Var) {
        Object obj = l61Var.G;
        if (obj instanceof ii.f) {
            ii.f fVar = (ii.f) obj;
            long j10 = fVar.f13205a;
            TLRPC.Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-j10));
            TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(j10));
            o2 o2Var = this.f12204s;
            if (user != null) {
                o2Var.presentFragment(sn.W9(user.f20491id));
                return true;
            } else if (!ChatObject.isPublic(chat) && !ChatObject.isInChat(chat)) {
                new ji.b(getContext(), chat, new t(0, this, fVar)).show();
                return true;
            } else {
                o2Var.presentFragment(sn.W9(-chat.f20344id));
                return true;
            }
        }
        return false;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12 = NotificationCenter.chatInfoDidLoad;
        long j10 = this.e;
        f0 f0Var = this.v;
        if (i10 == i12) {
            if (((TLRPC.ChatFull) objArr[0]).f20345id == j10) {
                f0Var.d.Z2.N(true);
            }
        } else if (i10 == NotificationCenter.updateInterfaces) {
            Integer num = (Integer) objArr[0];
            if ((num.intValue() & MessagesController.UPDATE_MASK_CHAT) != 0 || (num.intValue() & MessagesController.UPDATE_MASK_AVATAR) != 0 || (num.intValue() & MessagesController.UPDATE_MASK_CHAT_AVATAR) != 0 || (num.intValue() & MessagesController.UPDATE_MASK_CHAT_NAME) != 0) {
                TLRPC.Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(j10));
                this.f12201f = chat;
                f0Var.f12184a.setTitle(DialogObject.getName(chat));
                f0Var.h.e(this.f12201f, f0Var.f12177n);
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
    public final void e(q2 q2Var) {
        if (MessagesController.getInstance(this.currentAccount).getStoriesController().I(q2Var.getDialogId())) {
            o2 o2Var = this.f12204s;
            o2Var.getOrCreateStoryViewer().getClass();
            o2Var.getOrCreateStoryViewer().D(o2Var.getContext(), q2Var.getDialogId(), q7.a((lm0) q2Var.getParent()));
        }
    }

    public final void e0(ArrayList arrayList, boolean z10) {
        String str;
        String str2;
        int i10 = 0;
        if (!z10) {
            arrayList.add(l61.D(99, (int) (AndroidUtilities.displaySize.y * 0.35f)));
            arrayList.add(l61.D(0, AndroidUtilities.dp(56.0f)));
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
                        arrayList.add(l61.v(chat));
                    }
                } else {
                    arrayList.add(l61.v(chat));
                }
            }
        }
    }

    public final void f0(TLRPC.Chat chat, long j10, boolean z10) {
        long j11 = -chat.f20344id;
        boolean isChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(chat);
        if (!ChatObject.isChannel(chat)) {
            c2 c2Var = new c2(getContext(), 3, null);
            c2Var.r(250L);
            MessagesController.getInstance(this.currentAccount).convertToMegaGroup(getContext(), -j11, null, new d(this, c2Var, j10, z10, 1));
            return;
        }
        MessagesController.getInstance(this.currentAccount).linkCommunity(j11, j10, z10, new ka(1, this, isChannelAndNotMegaGroup));
    }

    public final void g0(l61 l61Var) {
        Object obj = l61Var.G;
        if (obj instanceof TLRPC.Chat) {
            TLRPC.Chat chat = (TLRPC.Chat) obj;
            if (this.N) {
                this.O.run(chat);
                dismiss();
                return;
            }
            new ji.a(getContext(), this.f12201f, -chat.f20344id, new ai.o2(21, this, chat)).show();
        }
    }

    @Override
    public final void o(int i10, float f7, float f10, ne.e eVar) {
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
            float b10 = zf.f0.b(f7);
            float lerp = AndroidUtilities.lerp(0.9f, 1.0f, b10);
            f0 f0Var = this.v;
            f0Var.f12184a.setAlpha(b10);
            f0Var.f12184a.setScaleX(lerp);
            f0Var.f12184a.setScaleY(lerp);
            org.telegram.ui.ActionBar.k kVar = f0Var.f12184a;
            int i21 = (b10 > 0.0f ? 1 : (b10 == 0.0f ? 0 : -1));
            if (i21 > 0) {
                i15 = 0;
            } else {
                i15 = 8;
            }
            kVar.setVisibility(i15);
            float lerp2 = AndroidUtilities.lerp(0.9f, 1.0f, f7);
            i20 i20Var = this.f12207y;
            i20Var.setAlpha(f7);
            i20Var.setScaleX(lerp2);
            i20Var.setScaleY(lerp2);
            int i22 = (f7 > 0.0f ? 1 : (f7 == 0.0f ? 0 : -1));
            if (i22 > 0) {
                i16 = 0;
            } else {
                i16 = 8;
            }
            i20Var.setVisibility(i16);
            f0Var.d.setAlpha(b10);
            i71 i71Var = f0Var.d;
            if (i21 > 0) {
                i17 = 0;
            } else {
                i17 = 8;
            }
            i71Var.setVisibility(i17);
            this.f12202n.setAlpha(b10);
            this.f12202n.setScaleX(AndroidUtilities.lerp(0.95f, 1.0f, b10));
            this.f12202n.setScaleY(AndroidUtilities.lerp(0.95f, 1.0f, b10));
            ei.d dVar = this.f12202n;
            if (i21 > 0) {
                i18 = 0;
            } else {
                i18 = 8;
            }
            dVar.setVisibility(i18);
            i10 i10Var = this.F;
            i10Var.setAlpha(f7);
            if (i22 > 0) {
                i19 = 0;
            } else {
                i19 = 8;
            }
            i10Var.setVisibility(i19);
            this.containerView.invalidate();
            this.H.invalidate();
        }
        if (i10 == 2) {
            float b11 = zf.f0.b(f7);
            float lerp3 = AndroidUtilities.lerp(0.9f, 1.0f, b11);
            e0 e0Var = this.f12206x;
            e0Var.f12184a.setAlpha(b11);
            e0Var.f12184a.setScaleX(lerp3);
            e0Var.f12184a.setScaleY(lerp3);
            org.telegram.ui.ActionBar.k kVar2 = e0Var.f12184a;
            int i23 = (b11 > 0.0f ? 1 : (b11 == 0.0f ? 0 : -1));
            if (i23 > 0) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            kVar2.setVisibility(i11);
            float lerp4 = AndroidUtilities.lerp(0.9f, 1.0f, f7);
            i20 i20Var2 = this.E;
            i20Var2.setAlpha(f7);
            i20Var2.setScaleX(lerp4);
            i20Var2.setScaleY(lerp4);
            int i24 = (f7 > 0.0f ? 1 : (f7 == 0.0f ? 0 : -1));
            if (i24 > 0) {
                i12 = 0;
            } else {
                i12 = 8;
            }
            i20Var2.setVisibility(i12);
            e0Var.d.setAlpha(b11);
            i71 i71Var2 = e0Var.d;
            if (i23 > 0) {
                i13 = 0;
            } else {
                i13 = 8;
            }
            i71Var2.setVisibility(i13);
            if (!this.N) {
                this.f12203r.setAlpha(b11);
                this.f12203r.setScaleX(AndroidUtilities.lerp(0.95f, 1.0f, b11));
                this.f12203r.setScaleY(AndroidUtilities.lerp(0.95f, 1.0f, b11));
                ei.d dVar2 = this.f12203r;
                if (i23 > 0) {
                    i14 = 0;
                } else {
                    i14 = 8;
                }
                dVar2.setVisibility(i14);
            }
            i71 i71Var3 = this.G;
            i71Var3.setAlpha(f7);
            if (i24 > 0) {
                i20 = 0;
            }
            i71Var3.setVisibility(i20);
            this.containerView.invalidate();
            this.I.invalidate();
        }
    }

    @Override
    public final void onBackPressed() {
        if (this.d.getCurrentPosition() > 0) {
            if (this.d.getCurrentPosition() == 2) {
                ne.b bVar = this.f12200c;
                if (bVar.f17447f) {
                    this.f12206x.d.Y2.h1(1, this.U.f12316b);
                    bVar.a(false, true);
                    setAllowNestedScroll(true);
                    i20 i20Var = this.E;
                    AndroidUtilities.hideKeyboard(i20Var.f27258r);
                    i20Var.f27258r.clearFocus();
                    return;
                }
            }
            this.d.D(0);
            return;
        }
        super.onBackPressed();
    }

    @Override
    public final void onThemeColorsChanged() {
        Paint paint = this.P;
        try {
            super.onThemeColorsChanged();
            int w02 = k6.w0(k6.f21126a7, this.resourcesProvider);
            if (paint.getColor() != w02) {
                setBackgroundColor(w02);
                paint.setColor(w02);
                ViewGroup viewGroup = this.containerView;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public k0(o2 o2Var, long j10, ArrayList arrayList, g4 g4Var) {
        super(o2Var.getContext(), o2Var.getResourceProvider(), true, true);
        zr zrVar = zr.h;
        this.f12199b = new ne.b(1, this, zrVar, 350L, false);
        this.f12200c = new ne.b(2, this, zrVar, 350L, false);
        this.J = new zf.y(2);
        this.K = new zf.y(8);
        Paint paint = new Paint(1);
        this.P = paint;
        i0.b bVar = i0.b.e;
        this.T = bVar;
        this.U = bVar;
        AndroidUtilities.enableEdgeToEdge(getWindow());
        this.f12204s = o2Var;
        this.N = arrayList != null;
        this.Q = arrayList;
        this.O = g4Var;
        Context context = o2Var.getContext();
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.chatInfoDidLoad);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.updateInterfaces);
        int i10 = k6.f21126a7;
        paint.setColor(k6.w0(i10, this.resourcesProvider));
        fixNavigationBarKey(i10);
        this.containerView = new u8(this, context);
        h1 h1Var = new h1(this, context, 2);
        this.d = h1Var;
        int i11 = this.backgroundPaddingLeft;
        h1Var.setPadding(i11, 0, i11, 0);
        this.containerView.addView(this.d, z5.e(-1, -1, 119));
        this.H = new jc(this, context, 5);
        this.I = new jc(this, context, 5);
        i20 i20Var = new i20(context, this.resourcesProvider);
        this.f12207y = i20Var;
        i20Var.setCloseButtonVisible(true);
        i20Var.f27261x = true;
        i20Var.updateColors();
        String string = LocaleController.getString(R.string.Search);
        e2 e2Var = i20Var.f27258r;
        e2Var.setHint(string);
        e2Var.addTextChangedListener(new w(this));
        i20Var.setVisibility(8);
        i20 i20Var2 = new i20(context, this.resourcesProvider);
        this.E = i20Var2;
        i20Var2.setCloseButtonVisible(true);
        i20Var2.f27261x = true;
        i20Var2.updateColors();
        String string2 = LocaleController.getString(R.string.Search);
        e2 e2Var2 = i20Var2.f27258r;
        e2Var2.setHint(string2);
        e2Var2.addTextChangedListener(new x(this));
        i20Var2.setVisibility(8);
        i71 i71Var = new i71(context, this.currentAccount, 0, false, new s(this, 0), new u(this, 0), null, this.resourcesProvider);
        this.G = i71Var;
        i71Var.j(new y(this));
        i71Var.setClipToPadding(false);
        i71Var.setVisibility(8);
        i71Var.t1();
        i71Var.Z2.f24646r = false;
        i71Var.setPadding(0, AndroidUtilities.dp(52.0f) + AndroidUtilities.statusBarHeight, 0, AndroidUtilities.navigationBarHeight);
        i10 i10Var = new i10(o2Var);
        this.F = i10Var;
        i10Var.setVisibility(8);
        i10Var.setBackground(null);
        i10Var.setChatPreviewDelegate(new Object());
        i10Var.setUiCallback(new a0(this));
        i10Var.f38095b.setClipToPadding(false);
        this.L = new View(getContext());
        Context context2 = getContext();
        g6 g6Var = this.resourcesProvider;
        s0 s0Var = new s0(context2, g6Var, new vc((FrameLayout) this.containerView, g6Var), this.currentAccount, j10);
        this.M = s0Var;
        s0Var.h = new b0(this, o2Var);
        this.e = j10;
        this.f12201f = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(j10));
        MessagesController.getInstance(this.currentAccount).getChatFull(j10);
        TLRPC.Chat chat = this.f12201f;
        this.h = chat != null && chat.collapsed_in_dialogs;
        hg.o0 o0Var = new hg.o0(R.drawable.search_users_filled, 4, DialogObject.getShortName(chat));
        o0Var.f12031f = this.f12201f;
        o0Var.h = false;
        ArrayList arrayList2 = i20Var.F;
        arrayList2.add(o0Var);
        i20Var.I = arrayList2.size() - 1;
        i20Var.e();
        setBackgroundColor(k6.w0(i10, this.resourcesProvider));
        this.f12205w = new j0(this, context);
        this.v = new f0(this, context);
        this.f12206x = new e0(this, context);
        this.d.setAdapter(new c0(this));
        i20Var.setCloseButtonOnClickListener(new v(this, 0));
        i20Var2.setCloseButtonOnClickListener(new v(this, 1));
        s0Var.d();
        MessagesController.getInstance(this.currentAccount).loadFullChat(j10, 0, true);
        oc.a((FrameLayout) this.containerView, new Object());
        ViewGroup viewGroup = this.containerView;
        u uVar = new u(this, 1);
        WeakHashMap weakHashMap = r0.i0.f45241a;
        r0.a0.i(viewGroup, uVar);
    }

    @Override
    public final void a(q2 q2Var) {
    }

    @Override
    public final void f(q2 q2Var) {
    }

    @Override
    public final void c() {
    }

    @Override
    public final void H(float f7, int i10) {
    }
}
