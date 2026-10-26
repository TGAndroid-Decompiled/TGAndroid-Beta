package ii;

import a8.v0;
import ai.n1;
import android.content.Context;
import android.graphics.Paint;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import bi.cc;
import bi.r3;
import di.q7;
import fi.c2;
import fi.ga;
import fi.h1;
import fi.q8;
import hi.p4;
import hi.u2;
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
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e2;
import org.telegram.ui.ActionBar.f7;
import org.telegram.ui.ActionBar.k3;
import org.telegram.ui.ActionBar.r2;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Cells.l2;
import org.telegram.ui.Cells.p2;
import org.telegram.ui.Cells.z8;
import org.telegram.ui.Components.c90;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.g5;
import org.telegram.ui.Components.gb1;
import org.telegram.ui.Components.m20;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.r71;
import org.telegram.ui.Components.t61;
import org.telegram.ui.Components.wc;
import org.telegram.ui.af1;
import org.telegram.ui.d3;
import org.telegram.ui.h10;
import org.telegram.ui.un;
public final class j0 extends k3 implements NotificationCenter.NotificationCenterDelegate, oe.d, l2 {
    public static final int V = 0;
    public final m20 E;
    public final h10 F;
    public final r71 G;
    public final cc H;
    public final cc I;
    public final ag.h0 J;
    public final ag.h0 K;
    public final View L;
    public final r0 M;
    public final boolean N;
    public final Utilities.Callback O;
    public final Paint P;
    public ArrayList Q;
    public String R;
    public String S;
    public i0.b T;
    public i0.b U;
    public final oe.b f14358b;
    public final oe.b f14359c;
    public final h1 d;
    public final long e;
    public TLRPC.Chat f14360f;
    public boolean h;
    public fi.d f14361n;
    public fi.d f14362r;
    public final r2 f14363s;
    public final e0 v;
    public final i0 f14364w;
    public final d0 f14365x;
    public final m20 f14366y;

    public j0(r2 r2Var, long j10) {
        this(r2Var, j10, null, null);
    }

    public static void B(j0 j0Var) {
        if (!ChatObject.canAddChatToCommunity(j0Var.f14360f)) {
            j0Var.dismiss();
            return;
        }
        fi.d dVar = j0Var.f14361n;
        if (dVar.Q) {
            return;
        }
        dVar.setLoading(true);
        MessagesController.getInstance(j0Var.currentAccount).fetchChatsToAddToCommunity(new s(j0Var, 2));
    }

    public static void C(j0 j0Var, t61 t61Var, View view) {
        long j10;
        TLRPC.Chat chat;
        int i10;
        r2 r2Var = j0Var.f14363s;
        if (!j0Var.d0(t61Var)) {
            int i11 = t61Var.d;
            boolean z10 = false;
            if (i11 == 101) {
                j0Var.h = !j0Var.h;
                MessagesController.getInstance(j0Var.currentAccount).toggleCommunityCollapsedInDialogs(j0Var.e, j0Var.h);
                if (view instanceof z8) {
                    ((z8) view).getCheckBox().c(j0Var.h, true);
                } else {
                    j0Var.v.d.f32152g3.O(false);
                }
            } else if (i11 == 100) {
                j0Var.d.E(1);
                j0Var.M.e();
            } else {
                Object obj = t61Var.G;
                if (obj instanceof TLRPC.Chat) {
                    chat = (TLRPC.Chat) obj;
                    z10 = ChatObject.isChannelAndNotMegaGroup(chat);
                    j10 = -chat.f22027id;
                } else if (obj instanceof TLRPC.User) {
                    j10 = ((TLRPC.User) obj).f22176id;
                    chat = null;
                } else {
                    return;
                }
                TLRPC.Chat chat2 = chat;
                int b10 = s0.b(j0Var.currentAccount, j10);
                if (b10 != 1 && b10 != 2) {
                    if (b10 == 3) {
                        c90 c90Var = new c90(j0Var.getContext(), chat2, null, j0Var.f14363s, j0Var.resourcesProvider);
                        c90Var.f27102r = new wc((FrameLayout) j0Var.containerView, j0Var.resourcesProvider);
                        c90Var.show();
                        return;
                    } else if (b10 == 4) {
                        wc wcVar = new wc((FrameLayout) j0Var.containerView, j0Var.resourcesProvider);
                        int i12 = R.raw.e_hand_2;
                        if (z10) {
                            i10 = R.string.CommunityHiddenChannelUnavailable;
                        } else {
                            i10 = R.string.CommunityHiddenGroupUnavailable;
                        }
                        org.telegram.messenger.t.q(i10, wcVar, i12, 36);
                        return;
                    } else {
                        return;
                    }
                }
                if (r2Var instanceof un) {
                    un unVar = (un) r2Var;
                    TLRPC.Chat chat3 = unVar.e;
                    TLRPC.User i13 = unVar.i();
                    if ((chat3 != null && chat3.f22027id == (-j10)) || (i13 != null && i13.f22176id == j10)) {
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
                        un unVar2 = new un(bundle);
                        pg.d.a(unVar2, MessagesStorage.TopicKey.of(j10, MessagesController.getInstance(j0Var.currentAccount).getForumLastTopicId(chat2.f22027id)));
                        r2Var.presentFragment(unVar2);
                    } else {
                        r2Var.presentFragment(new af1(bundle));
                    }
                } else {
                    r2Var.presentFragment(new un(bundle));
                }
                j0Var.dismiss();
            }
        }
    }

    public static void D(j0 j0Var, ArrayList arrayList) {
        String formatPluralString;
        String str;
        boolean z10;
        ArrayList arrayList2;
        arrayList.add(t61.E(99, Math.min(AndroidUtilities.dp(176.0f) + AndroidUtilities.statusBarHeight, (int) (AndroidUtilities.displaySize.y * 0.25f))));
        int i10 = 0;
        arrayList.add(t61.E(0, AndroidUtilities.dp(56.0f)));
        String string = LocaleController.getString(R.string.CommunityShowAsOneChat);
        t61 t61Var = new t61(39);
        t61Var.d = 101;
        t61Var.f32875l = string;
        t61Var.f32888z = 0;
        t61Var.L(j0Var.h);
        arrayList.add(t61Var);
        arrayList.add(t61.B(2, LocaleController.getString(R.string.CommunityShowAsOneChatInfo)));
        r0 r0Var = j0Var.M;
        boolean z11 = true;
        if (r0Var.f14423n && r0Var.f14421l == 1 && (arrayList2 = r0Var.f14419j) != null && arrayList2.size() == 1) {
            arrayList.add(t61.t(3, LocaleController.getString(R.string.CommunityPendingRequest)));
            r0Var.c(arrayList);
            arrayList.add(t61.E(5, AndroidUtilities.dp(14.33f)));
        } else {
            int i11 = r0Var.f14421l;
            if (i11 > 0) {
                int i12 = r0Var.f14425p;
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
                int i14 = ji.i.f15994a;
                t61 K = t61.K(ji.i.class);
                K.d = 100;
                K.f32874k = i13;
                K.f32875l = formatPluralString;
                K.f32877n = str;
                K.B = ((-15497247) << 32) | ((-14899731) & 4294967295L);
                K.f32880q = true;
                arrayList.add(K);
                arrayList.add(t61.E(5, AndroidUtilities.dp(14.33f)));
            }
        }
        MessagesController.CommunityPeersDialog buildCommunityPeers = MessagesController.getInstance(j0Var.currentAccount).buildCommunityPeers(j0Var.e);
        if (buildCommunityPeers != null) {
            if (!buildCommunityPeers.chatsYouAreIn.isEmpty()) {
                arrayList.add(t61.t(21, LocaleController.getString(R.string.CommunitySectionChatsYouAreIn)));
                ArrayList<MessagesController.CommunityPeerDialog> arrayList3 = buildCommunityPeers.chatsYouAreIn;
                int size = arrayList3.size();
                int i15 = 0;
                while (i15 < size) {
                    MessagesController.CommunityPeerDialog communityPeerDialog = arrayList3.get(i15);
                    i15++;
                    arrayList.add(o0.a(communityPeerDialog, j0Var));
                }
                z10 = true;
            } else {
                z10 = false;
            }
            if (!buildCommunityPeers.chatsYouCanView.isEmpty()) {
                if (z10) {
                    arrayList.add(t61.E(22, AndroidUtilities.dp(12.0f)));
                }
                arrayList.add(t61.t(23, LocaleController.getString(R.string.CommunitySectionChatsYouCanView)));
                ArrayList<MessagesController.CommunityPeerDialog> arrayList4 = buildCommunityPeers.chatsYouCanView;
                int size2 = arrayList4.size();
                int i16 = 0;
                while (i16 < size2) {
                    MessagesController.CommunityPeerDialog communityPeerDialog2 = arrayList4.get(i16);
                    i16++;
                    arrayList.add(o0.a(communityPeerDialog2, j0Var));
                }
                z10 = true;
            }
            if (!buildCommunityPeers.chatsYouCanJoin.isEmpty()) {
                if (z10) {
                    arrayList.add(t61.E(24, AndroidUtilities.dp(12.0f)));
                }
                arrayList.add(t61.t(25, LocaleController.getString(R.string.CommunitySectionChatsYouCanRequestToJoin)));
                ArrayList<MessagesController.CommunityPeerDialog> arrayList5 = buildCommunityPeers.chatsYouCanJoin;
                int size3 = arrayList5.size();
                int i17 = 0;
                while (i17 < size3) {
                    MessagesController.CommunityPeerDialog communityPeerDialog3 = arrayList5.get(i17);
                    i17++;
                    arrayList.add(o0.a(communityPeerDialog3, j0Var));
                }
            } else {
                z11 = z10;
            }
            if (!buildCommunityPeers.chatsOther.isEmpty()) {
                if (z11) {
                    arrayList.add(t61.E(26, AndroidUtilities.dp(12.0f)));
                }
                arrayList.add(t61.t(27, LocaleController.getString(R.string.CommunitySectionHiddenChats)));
                ArrayList<MessagesController.CommunityPeerDialog> arrayList6 = buildCommunityPeers.chatsOther;
                int size4 = arrayList6.size();
                while (i10 < size4) {
                    MessagesController.CommunityPeerDialog communityPeerDialog4 = arrayList6.get(i10);
                    i10++;
                    arrayList.add(o0.a(communityPeerDialog4, j0Var));
                }
            }
        }
    }

    public static ViewGroup W(j0 j0Var) {
        return j0Var.containerView;
    }

    public static void m(j0 j0Var, boolean z10, TLRPC.TL_error tL_error) {
        if (tL_error != null) {
            if (TextUtils.equals("COMMUNITY_REQUEST_CREATED", tL_error.text)) {
                s0.f(new wc((FrameLayout) j0Var.containerView, j0Var.resourcesProvider), 2, z10);
                j0Var.d.E(0);
                return;
            }
            d3.t((FrameLayout) j0Var.containerView, j0Var.resourcesProvider, tL_error, false);
            return;
        }
        s0.f(new wc((FrameLayout) j0Var.containerView, j0Var.resourcesProvider), 1, z10);
        j0Var.d.E(0);
    }

    public static void n(j0 j0Var, ArrayList arrayList, TLRPC.TL_error tL_error) {
        j0Var.f14361n.setLoading(false);
        if (tL_error != null) {
            d3.t((FrameLayout) j0Var.containerView, j0Var.resourcesProvider, tL_error, false);
        } else if (arrayList != null) {
            j0Var.Q = arrayList;
            if (arrayList.isEmpty()) {
                org.telegram.messenger.t.q(R.string.CommunityNoChatsToAdd, new wc((FrameLayout) j0Var.containerView, j0Var.resourcesProvider), R.raw.info, 36);
                return;
            }
            j0Var.f14365x.d.f32152g3.O(false);
            j0Var.d.E(2);
        }
    }

    public static void o(j0 j0Var, TLRPC.TL_error tL_error) {
        if (tL_error != null) {
            d3.t((FrameLayout) j0Var.containerView, j0Var.resourcesProvider, tL_error, false);
        }
    }

    public static void p(j0 j0Var, e2 e2Var, long j10, boolean z10, long j11) {
        e2Var.dismiss();
        if (j11 == 0) {
            return;
        }
        j0Var.f0(MessagesController.getInstance(j0Var.currentAccount).getChat(Long.valueOf(j11)), j10, z10);
    }

    public static void q(j0 j0Var, boolean z10, boolean z11, long j10) {
        int i10;
        Context context = j0Var.getContext();
        u6 u6Var = j0Var.resourcesProvider;
        String string = LocaleController.getString(R.string.CommunityMenuRemoveFromCommunity);
        if (z10) {
            i10 = R.string.CommunityMenuRemoveBotFromCommunityConfirm;
        } else if (z11) {
            i10 = R.string.CommunityMenuRemoveChannelFromCommunityConfirm;
        } else {
            i10 = R.string.CommunityMenuRemoveGroupFromCommunityConfirm;
        }
        e2 O = g5.O(context, u6Var, string, LocaleController.getString(i10), LocaleController.getString(R.string.Remove), new r3(j0Var, j10, 11));
        O.show();
        TextView textView = (TextView) O.d(-1);
        if (textView != null) {
            f7.V(textView, y6.f23598q7, null);
        }
    }

    @Override
    public final void E(int i10, float f7, float f10, oe.e eVar) {
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
            float a2 = v0.a(f7);
            float lerp = AndroidUtilities.lerp(0.9f, 1.0f, a2);
            e0 e0Var = this.v;
            e0Var.f14347a.setAlpha(a2);
            e0Var.f14347a.setScaleX(lerp);
            e0Var.f14347a.setScaleY(lerp);
            org.telegram.ui.ActionBar.k kVar = e0Var.f14347a;
            int i21 = (a2 > 0.0f ? 1 : (a2 == 0.0f ? 0 : -1));
            if (i21 > 0) {
                i15 = 0;
            } else {
                i15 = 8;
            }
            kVar.setVisibility(i15);
            float lerp2 = AndroidUtilities.lerp(0.9f, 1.0f, f7);
            m20 m20Var = this.f14366y;
            m20Var.setAlpha(f7);
            m20Var.setScaleX(lerp2);
            m20Var.setScaleY(lerp2);
            int i22 = (f7 > 0.0f ? 1 : (f7 == 0.0f ? 0 : -1));
            if (i22 > 0) {
                i16 = 0;
            } else {
                i16 = 8;
            }
            m20Var.setVisibility(i16);
            e0Var.d.setAlpha(a2);
            r71 r71Var = e0Var.d;
            if (i21 > 0) {
                i17 = 0;
            } else {
                i17 = 8;
            }
            r71Var.setVisibility(i17);
            this.f14361n.setAlpha(a2);
            this.f14361n.setScaleX(AndroidUtilities.lerp(0.95f, 1.0f, a2));
            this.f14361n.setScaleY(AndroidUtilities.lerp(0.95f, 1.0f, a2));
            fi.d dVar = this.f14361n;
            if (i21 > 0) {
                i18 = 0;
            } else {
                i18 = 8;
            }
            dVar.setVisibility(i18);
            h10 h10Var = this.F;
            h10Var.setAlpha(f7);
            if (i22 > 0) {
                i19 = 0;
            } else {
                i19 = 8;
            }
            h10Var.setVisibility(i19);
            this.containerView.invalidate();
            this.H.invalidate();
        }
        if (i10 == 2) {
            float a10 = v0.a(f7);
            float lerp3 = AndroidUtilities.lerp(0.9f, 1.0f, a10);
            d0 d0Var = this.f14365x;
            d0Var.f14347a.setAlpha(a10);
            d0Var.f14347a.setScaleX(lerp3);
            d0Var.f14347a.setScaleY(lerp3);
            org.telegram.ui.ActionBar.k kVar2 = d0Var.f14347a;
            int i23 = (a10 > 0.0f ? 1 : (a10 == 0.0f ? 0 : -1));
            if (i23 > 0) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            kVar2.setVisibility(i11);
            float lerp4 = AndroidUtilities.lerp(0.9f, 1.0f, f7);
            m20 m20Var2 = this.E;
            m20Var2.setAlpha(f7);
            m20Var2.setScaleX(lerp4);
            m20Var2.setScaleY(lerp4);
            int i24 = (f7 > 0.0f ? 1 : (f7 == 0.0f ? 0 : -1));
            if (i24 > 0) {
                i12 = 0;
            } else {
                i12 = 8;
            }
            m20Var2.setVisibility(i12);
            d0Var.d.setAlpha(a10);
            r71 r71Var2 = d0Var.d;
            if (i23 > 0) {
                i13 = 0;
            } else {
                i13 = 8;
            }
            r71Var2.setVisibility(i13);
            if (!this.N) {
                this.f14362r.setAlpha(a10);
                this.f14362r.setScaleX(AndroidUtilities.lerp(0.95f, 1.0f, a10));
                this.f14362r.setScaleY(AndroidUtilities.lerp(0.95f, 1.0f, a10));
                fi.d dVar2 = this.f14362r;
                if (i23 > 0) {
                    i14 = 0;
                } else {
                    i14 = 8;
                }
                dVar2.setVisibility(i14);
            }
            r71 r71Var3 = this.G;
            r71Var3.setAlpha(f7);
            if (i24 > 0) {
                i20 = 0;
            }
            r71Var3.setVisibility(i20);
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
        if (!this.f14358b.f19327f && !this.f14359c.f19327f) {
            View currentView = this.d.getCurrentView();
            if (currentView instanceof g0) {
                return ((g0) currentView).e;
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
    public final void d(p2 p2Var) {
        TLRPC.TL_forumTopic findTopic;
        if (p2Var.getMessage() != null && (findTopic = MessagesController.getInstance(this.currentAccount).getTopicsController().findTopic(-p2Var.getDialogId(), MessageObject.getTopicId(this.currentAccount, p2Var.getMessage().messageOwner, true))) != null) {
            pg.d.m(this.f14363s, -p2Var.getDialogId(), findTopic, 0);
        }
    }

    public final boolean d0(t61 t61Var) {
        Object obj = t61Var.G;
        if (obj instanceof ji.f) {
            ji.f fVar = (ji.f) obj;
            long j10 = fVar.f15980a;
            TLRPC.Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-j10));
            TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(j10));
            r2 r2Var = this.f14363s;
            if (user != null) {
                r2Var.presentFragment(un.ba(user.f22176id));
                return true;
            } else if (!ChatObject.isPublic(chat) && !ChatObject.isInChat(chat)) {
                new ki.b(getContext(), chat, new u2(14, this, fVar)).show();
                return true;
            } else {
                r2Var.presentFragment(un.ba(-chat.f22027id));
                return true;
            }
        }
        return false;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12 = NotificationCenter.chatInfoDidLoad;
        long j10 = this.e;
        e0 e0Var = this.v;
        if (i10 == i12) {
            if (((TLRPC.ChatFull) objArr[0]).f22028id == j10) {
                e0Var.d.f32152g3.O(true);
            }
        } else if (i10 == NotificationCenter.updateInterfaces) {
            Integer num = (Integer) objArr[0];
            if ((num.intValue() & MessagesController.UPDATE_MASK_CHAT) != 0 || (num.intValue() & MessagesController.UPDATE_MASK_AVATAR) != 0 || (num.intValue() & MessagesController.UPDATE_MASK_CHAT_AVATAR) != 0 || (num.intValue() & MessagesController.UPDATE_MASK_CHAT_NAME) != 0) {
                TLRPC.Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(j10));
                this.f14360f = chat;
                e0Var.f14347a.setTitle(DialogObject.getName(chat));
                e0Var.h.f(this.f14360f, e0Var.f14336n);
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
    public final void e(p2 p2Var) {
        if (MessagesController.getInstance(this.currentAccount).getStoriesController().I(p2Var.getDialogId())) {
            r2 r2Var = this.f14363s;
            r2Var.getOrCreateStoryViewer().getClass();
            r2Var.getOrCreateStoryViewer().D(r2Var.getContext(), p2Var.getDialogId(), q7.a((mm0) p2Var.getParent()));
        }
    }

    public final void e0(ArrayList arrayList, boolean z10) {
        String str;
        String str2;
        int i10 = 0;
        if (!z10) {
            arrayList.add(t61.E(99, (int) (AndroidUtilities.displaySize.y * 0.35f)));
            arrayList.add(t61.E(0, AndroidUtilities.dp(56.0f)));
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
                        arrayList.add(t61.w(chat));
                    }
                } else {
                    arrayList.add(t61.w(chat));
                }
            }
        }
    }

    public final void f0(TLRPC.Chat chat, long j10, boolean z10) {
        long j11 = -chat.f22027id;
        boolean isChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(chat);
        if (!ChatObject.isChannel(chat)) {
            e2 e2Var = new e2(getContext(), 3, null);
            e2Var.r(250L);
            MessagesController.getInstance(this.currentAccount).convertToMegaGroup(getContext(), -j11, null, new d(this, e2Var, j10, z10, 1));
            return;
        }
        MessagesController.getInstance(this.currentAccount).linkCommunity(j11, j10, z10, new ga(1, this, isChannelAndNotMegaGroup));
    }

    public final void g0(t61 t61Var) {
        Object obj = t61Var.G;
        if (obj instanceof TLRPC.Chat) {
            TLRPC.Chat chat = (TLRPC.Chat) obj;
            if (this.N) {
                this.O.run(chat);
                dismiss();
                return;
            }
            new ki.a(getContext(), this.f14360f, -chat.f22027id, new n1(23, this, chat)).show();
        }
    }

    @Override
    public final void onBackPressed() {
        if (this.d.getCurrentPosition() > 0) {
            if (this.d.getCurrentPosition() == 2) {
                oe.b bVar = this.f14359c;
                if (bVar.f19327f) {
                    this.f14365x.d.f32151f3.h1(1, this.U.f13451b);
                    bVar.a(false, true);
                    setAllowNestedScroll(true);
                    m20 m20Var = this.E;
                    AndroidUtilities.hideKeyboard(m20Var.f30367r);
                    m20Var.f30367r.clearFocus();
                    return;
                }
            }
            this.d.E(0);
            return;
        }
        super.onBackPressed();
    }

    @Override
    public final void onThemeColorsChanged() {
        Paint paint = this.P;
        try {
            super.onThemeColorsChanged();
            int w02 = y6.w0(y6.f23299a7, this.resourcesProvider);
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

    public j0(r2 r2Var, long j10, ArrayList arrayList, p4 p4Var) {
        super(r2Var.getContext(), r2Var.getResourceProvider(), true, true);
        ds dsVar = ds.h;
        this.f14358b = new oe.b(1, this, dsVar, 350L, false);
        this.f14359c = new oe.b(2, this, dsVar, 350L, false);
        this.J = new ag.h0(2);
        this.K = new ag.h0(8);
        Paint paint = new Paint(1);
        this.P = paint;
        i0.b bVar = i0.b.e;
        this.T = bVar;
        this.U = bVar;
        AndroidUtilities.enableEdgeToEdge(getWindow());
        this.f14363s = r2Var;
        this.N = arrayList != null;
        this.Q = arrayList;
        this.O = p4Var;
        Context context = r2Var.getContext();
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.chatInfoDidLoad);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.updateInterfaces);
        int i10 = y6.f23299a7;
        paint.setColor(y6.w0(i10, this.resourcesProvider));
        fixNavigationBarKey(i10);
        this.containerView = new q8(this, context);
        h1 h1Var = new h1(this, context, 2);
        this.d = h1Var;
        int i11 = this.backgroundPaddingLeft;
        h1Var.setPadding(i11, 0, i11, 0);
        this.containerView.addView(this.d, gb1.i(-1, -1, 119));
        this.H = new cc(this, context, 5);
        this.I = new cc(this, context, 5);
        m20 m20Var = new m20(context, this.resourcesProvider);
        this.f14366y = m20Var;
        m20Var.setCloseButtonVisible(true);
        m20Var.f30370x = true;
        m20Var.updateColors();
        String string = LocaleController.getString(R.string.Search);
        c2 c2Var = m20Var.f30367r;
        c2Var.setHint(string);
        c2Var.addTextChangedListener(new v(this));
        m20Var.setVisibility(8);
        m20 m20Var2 = new m20(context, this.resourcesProvider);
        this.E = m20Var2;
        m20Var2.setCloseButtonVisible(true);
        m20Var2.f30370x = true;
        m20Var2.updateColors();
        String string2 = LocaleController.getString(R.string.Search);
        c2 c2Var2 = m20Var2.f30367r;
        c2Var2.setHint(string2);
        c2Var2.addTextChangedListener(new w(this));
        m20Var2.setVisibility(8);
        r71 r71Var = new r71(context, this.currentAccount, 0, false, new s(this, 0), new t(this, 0), null, this.resourcesProvider);
        this.G = r71Var;
        r71Var.j(new x(this));
        r71Var.setClipToPadding(false);
        r71Var.setVisibility(8);
        r71Var.u1();
        r71Var.f32152g3.f29507r = false;
        r71Var.setPadding(0, AndroidUtilities.dp(52.0f) + AndroidUtilities.statusBarHeight, 0, AndroidUtilities.navigationBarHeight);
        h10 h10Var = new h10(r2Var);
        this.F = h10Var;
        h10Var.setVisibility(8);
        h10Var.setBackground(null);
        h10Var.setChatPreviewDelegate(new Object());
        h10Var.setUiCallback(new z(this));
        h10Var.f39828b.setClipToPadding(false);
        this.L = new View(getContext());
        Context context2 = getContext();
        u6 u6Var = this.resourcesProvider;
        r0 r0Var = new r0(context2, u6Var, new wc((FrameLayout) this.containerView, u6Var), this.currentAccount, j10);
        this.M = r0Var;
        r0Var.h = new a0(this, r2Var);
        this.e = j10;
        this.f14360f = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(j10));
        MessagesController.getInstance(this.currentAccount).getChatFull(j10);
        TLRPC.Chat chat = this.f14360f;
        this.h = chat != null && chat.collapsed_in_dialogs;
        ig.p0 p0Var = new ig.p0(R.drawable.search_users_filled, 4, DialogObject.getShortName(chat));
        p0Var.f14201f = this.f14360f;
        p0Var.h = false;
        ArrayList arrayList2 = m20Var.F;
        arrayList2.add(p0Var);
        m20Var.I = arrayList2.size() - 1;
        m20Var.e();
        setBackgroundColor(y6.w0(i10, this.resourcesProvider));
        this.f14364w = new i0(this, context);
        this.v = new e0(this, context);
        this.f14365x = new d0(this, context);
        this.d.setAdapter(new b0(this));
        m20Var.setCloseButtonOnClickListener(new u(this, 0));
        m20Var2.setCloseButtonOnClickListener(new u(this, 1));
        r0Var.d();
        MessagesController.getInstance(this.currentAccount).loadFullChat(j10, 0, true);
        qc.a((FrameLayout) this.containerView, new Object());
        ViewGroup viewGroup = this.containerView;
        t tVar = new t(this, 1);
        WeakHashMap weakHashMap = r0.i0.f47108a;
        r0.a0.i(viewGroup, tVar);
    }

    @Override
    public final void a(p2 p2Var) {
    }

    @Override
    public final void f(p2 p2Var) {
    }

    @Override
    public final void c() {
    }

    @Override
    public final void z(float f7, int i10) {
    }
}
