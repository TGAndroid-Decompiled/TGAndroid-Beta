package bi;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Trace;
import android.text.TextUtils;
import android.view.View;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Executor;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.CacheByChatsController;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.AnimatedArrowDrawable;
import org.telegram.ui.Components.du;
import org.telegram.ui.Components.kl0;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.w70;
import org.telegram.ui.dd0;
import org.telegram.ui.eo;
import org.telegram.ui.ig1;
import org.telegram.ui.qy;
import org.telegram.ui.wy;
public final class cb implements kl0, OnFailureListener, q9.d, OnCompleteListener, Continuation, org.telegram.ui.ActionBar.c2, ll0, Utilities.Callback3Return, dd0, hi.q0, du, hi.l4, e2.n, e2.m, m4.k0, m4.g1, org.telegram.ui.Cells.v, qy, org.telegram.ui.v4 {
    public final int f2423a;
    public final Object f2424b;
    public final Object f2425c;

    public cb(int i10, Object obj, Object obj2) {
        this.f2423a = i10;
        this.f2424b = obj;
        this.f2425c = obj2;
    }

    @Override
    public boolean A() {
        return false;
    }

    @Override
    public boolean J(wy wyVar) {
        return false;
    }

    @Override
    public Object P1(u6 u6Var) {
        String str = (String) this.f2424b;
        q9.a aVar = (q9.a) this.f2425c;
        try {
            Trace.beginSection(str);
            return aVar.f40554f.P1(u6Var);
        } finally {
            Trace.endSection();
        }
    }

    @Override
    public void a(Object obj, b2.q qVar) {
        ((j2.b) obj).e((b2.b1) this.f2425c, new n4.y(qVar, ((j2.e) this.f2424b).e));
    }

    @Override
    public void b(org.telegram.tgnet.TLRPC.MessageMedia r1, int r2, boolean r3, int r4, long r5) {
        throw new UnsupportedOperationException("Method not decompiled: bi.cb.b(org.telegram.tgnet.TLRPC$MessageMedia, int, boolean, int, long):void");
    }

    @Override
    public void c(float f7, float f10, int i10, View view) {
        org.telegram.ui.ActionBar.f6 f6Var;
        int i11;
        int i12;
        long clientUserId;
        org.telegram.ui.ActionBar.f6 f6Var2;
        org.telegram.ui.ActionBar.f6 f6Var3;
        int i13;
        org.telegram.ui.ActionBar.f6 f6Var4;
        int i14;
        boolean z10;
        org.telegram.ui.ActionBar.f6 f6Var5;
        int i15;
        org.telegram.ui.ActionBar.f6 f6Var6;
        int i16;
        org.telegram.ui.ActionBar.f6 f6Var7;
        int i17;
        int i18;
        org.telegram.ui.ActionBar.f6 f6Var8;
        int i19;
        TLRPC.ChatParticipants chatParticipants;
        ArrayList<TLRPC.ChatParticipant> arrayList;
        int i20;
        org.telegram.ui.ActionBar.f6 f6Var9;
        float f11;
        int i21 = i10;
        switch (this.f2423a) {
            case 0:
                kb kbVar = (kb) this.f2424b;
                Context context = (Context) this.f2425c;
                ArrayList arrayList2 = kbVar.L;
                a0.i iVar = kbVar.f3007b;
                db dbVar = kbVar.f3014x;
                ArrayList arrayList3 = kbVar.f3008c;
                HashMap hashMap = kbVar.d;
                rb rbVar = kbVar.W;
                if (i21 >= 0 && i21 < arrayList2.size()) {
                    pa paVar = (pa) arrayList2.get(i21);
                    int i22 = paVar.f14046a;
                    int i23 = 0;
                    if (i22 == 3) {
                        if (paVar.f3411n && rbVar.F) {
                            i20 = ((org.telegram.ui.ActionBar.h3) rbVar).currentAccount;
                            boolean z11 = rbVar.K;
                            TLRPC.InputPeer inputPeer = rbVar.f3617c;
                            ta taVar = new ta(kbVar, 0);
                            f6Var9 = ((org.telegram.ui.ActionBar.h3) rbVar).resourcesProvider;
                            new ka(context, i20, z11, inputPeer, taVar, f6Var9).show();
                            return;
                        }
                        int i24 = paVar.f3406i;
                        if (i24 == 1) {
                            if (rbVar.N == 1 || rb.J0(rbVar).isEmpty()) {
                                rbVar.M = 1;
                                rbVar.f3615b.D(1);
                            }
                            rbVar.N = 1;
                            kbVar.f(true);
                            return;
                        } else if (i24 == 3) {
                            if (rbVar.N == 3 || (rbVar.f3620n.isEmpty() && rbVar.f3621r.isEmpty())) {
                                rbVar.M = 3;
                                rbVar.f3615b.D(1);
                            }
                            rbVar.N = 3;
                            kbVar.f(true);
                            return;
                        } else if (i24 == 2) {
                            if (rbVar.N == 2) {
                                rbVar.M = 2;
                                rbVar.f3615b.D(1);
                            }
                            rbVar.N = 2;
                            kbVar.f(true);
                            return;
                        } else if (i24 == 4) {
                            if (rbVar.N == 4) {
                                rbVar.M = 4;
                                rbVar.f3615b.D(1);
                            }
                            rbVar.N = 4;
                            kbVar.f(true);
                            return;
                        } else {
                            if (i24 > 0) {
                                arrayList3.clear();
                                hashMap.clear();
                                rbVar.N = paVar.f3406i;
                                dbVar.f3336c.a();
                            } else {
                                TLRPC.Chat chat = paVar.h;
                                if (chat != null) {
                                    long j3 = chat.f17195id;
                                    if (rb.d1(rbVar, chat) > 200) {
                                        try {
                                            kbVar.performHapticFeedback(3, 1);
                                        } catch (Throwable unused) {
                                        }
                                        Context context2 = kbVar.getContext();
                                        f6Var7 = ((org.telegram.ui.ActionBar.h3) rbVar).resourcesProvider;
                                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context2, 0, f6Var7);
                                        alertDialog$Builder.f17528a.R = LocaleController.getString(R.string.GroupTooLarge);
                                        alertDialog$Builder.f17528a.T = LocaleController.getString(R.string.GroupTooLargeMessage);
                                        hc.b.A(R.string.OK, alertDialog$Builder, null);
                                    } else if (!hashMap.containsKey(Long.valueOf(j3))) {
                                        i17 = ((org.telegram.ui.ActionBar.h3) rbVar).currentAccount;
                                        TLRPC.Chat chat2 = MessagesController.getInstance(i17).getChat(Long.valueOf(j3));
                                        i18 = ((org.telegram.ui.ActionBar.h3) rbVar).currentAccount;
                                        TLRPC.ChatFull chatFull = MessagesController.getInstance(i18).getChatFull(j3);
                                        if (chatFull != null && (chatParticipants = chatFull.participants) != null && (arrayList = chatParticipants.participants) != null && !arrayList.isEmpty() && chatFull.participants.participants.size() >= chatFull.participants_count - 1) {
                                            kbVar.d(j3, chatFull.participants);
                                        } else {
                                            org.telegram.ui.ActionBar.d2 d2Var = kbVar.G;
                                            if (d2Var != null) {
                                                d2Var.dismiss();
                                                kbVar.G = null;
                                            }
                                            kbVar.H = j3;
                                            Context context3 = kbVar.getContext();
                                            f6Var8 = ((org.telegram.ui.ActionBar.h3) rbVar).resourcesProvider;
                                            org.telegram.ui.ActionBar.d2 d2Var2 = new org.telegram.ui.ActionBar.d2(context3, 3, f6Var8);
                                            kbVar.G = d2Var2;
                                            d2Var2.q(50L);
                                            i19 = ((org.telegram.ui.ActionBar.h3) rbVar).currentAccount;
                                            MessagesStorage messagesStorage = MessagesStorage.getInstance(i19);
                                            messagesStorage.getStorageQueue().postRunnable(new ua(kbVar, chat2, messagesStorage, j3, 0));
                                        }
                                        if (!TextUtils.isEmpty(kbVar.I)) {
                                            dbVar.setText("");
                                            kbVar.I = null;
                                            kbVar.g(false);
                                        }
                                    } else {
                                        ArrayList arrayList4 = (ArrayList) hashMap.get(Long.valueOf(j3));
                                        if (arrayList4 != null) {
                                            int size = arrayList4.size();
                                            while (i23 < size) {
                                                Object obj = arrayList4.get(i23);
                                                i23++;
                                                iVar.k(Boolean.FALSE, ((Long) obj).longValue());
                                            }
                                        }
                                        hashMap.remove(Long.valueOf(j3));
                                        kbVar.i(true);
                                    }
                                } else {
                                    TLRPC.User user = paVar.f3405g;
                                    if (user != null) {
                                        if (kbVar.f3006a == 0) {
                                            rbVar.N = 0;
                                        }
                                        long j10 = user.f17342id;
                                        HashSet hashSet = new HashSet(arrayList3);
                                        if (arrayList3.contains(Long.valueOf(j10))) {
                                            Iterator it = hashMap.entrySet().iterator();
                                            while (it.hasNext()) {
                                                Map.Entry entry = (Map.Entry) it.next();
                                                if (((ArrayList) entry.getValue()).contains(Long.valueOf(j10))) {
                                                    it.remove();
                                                    hashSet.addAll((Collection) entry.getValue());
                                                }
                                            }
                                            hashSet.remove(Long.valueOf(j10));
                                            iVar.k(Boolean.FALSE, j10);
                                        } else {
                                            Iterator it2 = hashMap.entrySet().iterator();
                                            while (it2.hasNext()) {
                                                Map.Entry entry2 = (Map.Entry) it2.next();
                                                if (((ArrayList) entry2.getValue()).contains(Long.valueOf(j10))) {
                                                    it2.remove();
                                                    hashSet.addAll((Collection) entry2.getValue());
                                                }
                                            }
                                            hashSet.add(Long.valueOf(j10));
                                            if (!TextUtils.isEmpty(kbVar.I)) {
                                                dbVar.setText("");
                                                kbVar.I = null;
                                                kbVar.g(false);
                                            }
                                            iVar.k(Boolean.TRUE, j10);
                                        }
                                        arrayList3.clear();
                                        arrayList3.addAll(hashSet);
                                        kbVar.i(true);
                                    }
                                }
                            }
                            kbVar.f(true);
                            kbVar.e(true);
                            dbVar.K = true;
                            return;
                        }
                    } else if (i22 == 7) {
                        if (view instanceof org.telegram.ui.Cells.s8) {
                            org.telegram.ui.Cells.s8 s8Var = (org.telegram.ui.Cells.s8) view;
                            s8Var.setChecked(!s8Var.b());
                            paVar.f3408k = s8Var.b();
                            int i25 = paVar.f3403c;
                            if (i25 == 0) {
                                boolean b10 = s8Var.b();
                                rbVar.f3624x = b10;
                                if (rbVar.N == 4) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                if (b10) {
                                    org.telegram.ui.ActionBar.f3 f3Var = rbVar.container;
                                    f6Var6 = ((org.telegram.ui.ActionBar.h3) rbVar).resourcesProvider;
                                    org.telegram.ui.Components.wc wcVar = new org.telegram.ui.Components.wc(f3Var, f6Var6);
                                    int i26 = R.raw.ic_save_to_gallery;
                                    if (z10) {
                                        i16 = R.string.StoryEnabledScreenshotsShare;
                                    } else {
                                        i16 = R.string.StoryEnabledScreenshots;
                                    }
                                    org.telegram.ui.Components.pc G = wcVar.G(i26, 4, LocaleController.getString(i16));
                                    G.f26081j = 5000;
                                    G.k(true);
                                    return;
                                }
                                org.telegram.ui.ActionBar.f3 f3Var2 = rbVar.container;
                                f6Var5 = ((org.telegram.ui.ActionBar.h3) rbVar).resourcesProvider;
                                org.telegram.ui.Components.wc wcVar2 = new org.telegram.ui.Components.wc(f3Var2, f6Var5);
                                int i27 = R.raw.passcode_lock_close;
                                if (z10) {
                                    i15 = R.string.StoryDisabledScreenshotsShare;
                                } else {
                                    i15 = R.string.StoryDisabledScreenshots;
                                }
                                org.telegram.ui.Components.pc G2 = wcVar2.G(i27, 4, LocaleController.getString(i15));
                                G2.f26081j = 5000;
                                G2.k(true);
                                return;
                            } else if (i25 == 1) {
                                boolean b11 = s8Var.b();
                                rbVar.f3625y = b11;
                                boolean z12 = rbVar.f3617c instanceof TLRPC.TL_inputPeerChannel;
                                if (b11) {
                                    org.telegram.ui.ActionBar.f3 f3Var3 = rbVar.container;
                                    f6Var4 = ((org.telegram.ui.ActionBar.h3) rbVar).resourcesProvider;
                                    org.telegram.ui.Components.wc wcVar3 = new org.telegram.ui.Components.wc(f3Var3, f6Var4);
                                    int i28 = R.raw.msg_story_keep;
                                    if (z12) {
                                        i14 = R.string.StoryChannelEnableKeep;
                                    } else {
                                        i14 = R.string.StoryEnableKeep;
                                    }
                                    org.telegram.ui.Components.pc G3 = wcVar3.G(i28, 4, LocaleController.getString(i14));
                                    G3.f26081j = 5000;
                                    G3.k(true);
                                } else {
                                    org.telegram.ui.ActionBar.f3 f3Var4 = rbVar.container;
                                    f6Var3 = ((org.telegram.ui.ActionBar.h3) rbVar).resourcesProvider;
                                    org.telegram.ui.Components.wc wcVar4 = new org.telegram.ui.Components.wc(f3Var4, f6Var3);
                                    int i29 = R.raw.fire_on;
                                    if (z12) {
                                        i13 = R.string.StoryChannelDisableKeep;
                                    } else {
                                        i13 = R.string.StoryDisableKeep;
                                    }
                                    org.telegram.ui.Components.pc G4 = wcVar4.G(i29, 4, LocaleController.getString(i13));
                                    G4.f26081j = 5000;
                                    G4.k(true);
                                }
                                kbVar.g(true);
                                return;
                            } else if (i25 == 2) {
                                rbVar.f3623w = s8Var.b();
                                kbVar.g(true);
                                return;
                            } else {
                                return;
                            }
                        }
                        return;
                    } else if (i22 == 9) {
                        int i30 = paVar.f3414q;
                        if (i30 == 0) {
                            tb tbVar = rbVar.f3618c0;
                            if (tbVar != null) {
                                tbVar.run();
                                return;
                            }
                            return;
                        } else if (i30 == 1) {
                            TLRPC.InputPeer inputPeer2 = rbVar.f3617c;
                            if (inputPeer2 == null) {
                                i12 = ((org.telegram.ui.ActionBar.h3) rbVar).currentAccount;
                                clientUserId = UserConfig.getInstance(i12).getClientUserId();
                            } else {
                                clientUserId = DialogObject.getPeerDialogId(inputPeer2);
                            }
                            f6Var2 = ((org.telegram.ui.ActionBar.h3) rbVar).resourcesProvider;
                            w70 F = w70.F(kbVar, f6Var2, view);
                            F.c(R.drawable.msg_addfolder, LocaleController.getString(R.string.StoriesAlbumNewAlbum), new va(kbVar, clientUserId, 0), false);
                            F.k();
                            w70.f(F, rbVar.i1().B(clientUserId, true), rbVar.v, false, null, new y2(4, kbVar, F));
                            F.Z();
                            return;
                        } else if (i30 == 5) {
                            Context context4 = kbVar.getContext();
                            f6Var = ((org.telegram.ui.ActionBar.h3) rbVar).resourcesProvider;
                            org.telegram.ui.ActionBar.d2 d2Var3 = new org.telegram.ui.ActionBar.d2(context4, 3, f6Var);
                            d2Var3.q(500L);
                            TL_phone.getGroupCallStreamRtmpUrl getgroupcallstreamrtmpurl = new TL_phone.getGroupCallStreamRtmpUrl();
                            getgroupcallstreamrtmpurl.live_story = true;
                            TLRPC.InputPeer inputPeer3 = rbVar.f3617c;
                            if (inputPeer3 == null) {
                                inputPeer3 = new TLRPC.TL_inputPeerSelf();
                            }
                            getgroupcallstreamrtmpurl.peer = inputPeer3;
                            i11 = ((org.telegram.ui.ActionBar.h3) rbVar).currentAccount;
                            ConnectionsManager.getInstance(i11).sendRequest(getgroupcallstreamrtmpurl, new wa(kbVar, d2Var3, getgroupcallstreamrtmpurl, 0));
                            return;
                        } else if (i30 == 6) {
                            rbVar.G = false;
                            kbVar.g(true);
                            return;
                        } else {
                            return;
                        }
                    } else {
                        return;
                    }
                }
                return;
            default:
                org.telegram.ui.j4 j4Var = (org.telegram.ui.j4) this.f2424b;
                org.telegram.ui.n3 n3Var = (org.telegram.ui.n3) this.f2425c;
                if (j4Var.K == null || i21 - 1 >= 0) {
                    org.telegram.ui.Cells.s9 s9Var = j4Var.O0;
                    if (s9Var != null) {
                        if (s9Var.y()) {
                            j4Var.O0.f(false);
                            return;
                        }
                        j4Var.O0.f(false);
                    }
                    org.telegram.ui.h4 adapter = n3Var.getAdapter();
                    if ((view instanceof org.telegram.ui.q3) && adapter.E != null) {
                        org.telegram.ui.q3 q3Var = (org.telegram.ui.q3) view;
                        if (j4Var.G0 == 0) {
                            if ((!q3Var.f35957c || f7 >= view.getMeasuredWidth() / 2) && !q3Var.d) {
                                TLObject userOrChat = MessagesController.getInstance(j4Var.X).getUserOrChat("previews");
                                if (userOrChat instanceof TLRPC.TL_user) {
                                    j4Var.P(adapter.E.f17348id, (TLRPC.User) userOrChat);
                                    return;
                                }
                                int i31 = UserConfig.selectedAccount;
                                long j11 = adapter.E.f17348id;
                                j4Var.b0(true);
                                TLRPC.TL_contacts_resolveUsername tL_contacts_resolveUsername = new TLRPC.TL_contacts_resolveUsername();
                                tL_contacts_resolveUsername.username = "previews";
                                j4Var.G0 = ConnectionsManager.getInstance(i31).sendRequest(tL_contacts_resolveUsername, new org.telegram.messenger.le(j4Var, i31, j11));
                                return;
                            }
                            return;
                        }
                        return;
                    } else if (i21 >= 0 && i21 < adapter.d.size()) {
                        TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) adapter.d.get(i21);
                        TL_iv.PageBlock z13 = org.telegram.ui.j4.z(pageBlock);
                        if (z13 instanceof org.telegram.ui.x3) {
                            z13 = ((org.telegram.ui.x3) z13).f38566b;
                        }
                        if (z13 instanceof TL_iv.pageBlockChannel) {
                            MessagesController.getInstance(j4Var.X).openByUserName(ChatObject.getPublicUsername(((TL_iv.pageBlockChannel) z13).channel), j4Var.M, 2);
                            j4Var.o(false, true);
                            return;
                        } else if (z13 instanceof org.telegram.ui.d4) {
                            org.telegram.ui.d4 d4Var = (org.telegram.ui.d4) z13;
                            j4Var.Q(d4Var.f31822a.articles.get(d4Var.f31823b).url, null, null);
                            return;
                        } else if (z13 instanceof TL_iv.pageBlockDetails) {
                            View y3 = org.telegram.ui.j4.y(view);
                            if (y3 instanceof org.telegram.ui.n1) {
                                j4Var.d = null;
                                j4Var.f36857f = null;
                                if (adapter.e.indexOf(pageBlock) >= 0) {
                                    TL_iv.pageBlockDetails pageblockdetails = (TL_iv.pageBlockDetails) z13;
                                    pageblockdetails.open = !pageblockdetails.open;
                                    int h = adapter.h();
                                    adapter.M();
                                    int abs = Math.abs(adapter.h() - h);
                                    org.telegram.ui.n1 n1Var = (org.telegram.ui.n1) y3;
                                    AnimatedArrowDrawable animatedArrowDrawable = n1Var.f35093f;
                                    if (pageblockdetails.open) {
                                        f11 = 0.0f;
                                    } else {
                                        f11 = 1.0f;
                                    }
                                    animatedArrowDrawable.a(f11);
                                    n1Var.invalidate();
                                    if (abs != 0) {
                                        if (pageblockdetails.open) {
                                            adapter.s(i21 + 1, abs);
                                            return;
                                        } else {
                                            adapter.t(i21 + 1, abs);
                                            return;
                                        }
                                    }
                                    return;
                                }
                                return;
                            }
                            return;
                        } else {
                            return;
                        }
                    } else {
                        return;
                    }
                }
                return;
        }
    }

    @Override
    public boolean d(int i10, View view) {
        return di.h4.B0((di.h4) this.f2424b, (Context) this.f2425c, view, i10);
    }

    @Override
    public boolean d1(View view) {
        switch (this.f2423a) {
            case 0:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void e(org.telegram.ui.d5 d5Var) {
        org.telegram.ui.nb nbVar = (org.telegram.ui.nb) this.f2424b;
        TLRPC.User user = (TLRPC.User) this.f2425c;
        int ordinal = d5Var.ordinal();
        if (ordinal != 0) {
            if (ordinal == 3) {
                org.telegram.ui.sb sbVar = nbVar.f35198a;
                if (user != null) {
                    Bundle bundle = new Bundle();
                    bundle.putLong("user_id", user.f17342id);
                    org.telegram.ui.ActionBar.p2 p2Var = sbVar.f36638n;
                    if (p2Var.getMessagesController().checkCanOpenChat(bundle, p2Var)) {
                        p2Var.presentFragment(new eo(bundle));
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        nbVar.a(user);
    }

    @Override
    public void f(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        switch (this.f2423a) {
            case 6:
                di.h4.y0((di.h4) this.f2424b, (TL_payments.connectedBotStarRef) this.f2425c);
                return;
            case 8:
                fg.l1 l1Var = (fg.l1) this.f2424b;
                l1Var.getClass();
                ((boolean[]) this.f2425c)[0] = true;
                l1Var.Q();
                return;
            case 10:
                gg.b0.d(r3.currentAccount).a((gg.x) this.f2424b, ((TL_account.TL_businessChatLink) this.f2425c).link);
                return;
            case 25:
                org.telegram.ui.q4 q4Var = (org.telegram.ui.q4) this.f2424b;
                q4Var.getClass();
                d2Var.dismiss();
                q4Var.W((View) this.f2425c, true);
                return;
            case 27:
                nf.f.o(((org.telegram.ui.wb) this.f2424b).getParentActivity(), (String) this.f2425c, true);
                return;
            default:
                org.telegram.ui.nd.V((org.telegram.ui.nd) this.f2424b, (TLRPC.Chat) this.f2425c);
                return;
        }
    }

    @Override
    public w70 g(hi.k1 k1Var) {
        hi.s sVar = (hi.s) ((of.b) this.f2424b).f14295c;
        w70 w70Var = new w70(sVar, (org.telegram.ui.ActionBar.f6) this.f2425c, k1Var, false, false, true);
        sVar.H = w70Var;
        return w70Var;
    }

    @Override
    public void h(m4.r rVar) {
        switch (this.f2423a) {
            case 19:
                Bundle bundle = (Bundle) this.f2425c;
                m4.b0 b0Var = ((m4.l0) this.f2424b).f13430g;
                if (bundle == null) {
                    Bundle bundle2 = Bundle.EMPTY;
                }
                b0Var.n(rVar);
                return;
            default:
                m4.l0 l0Var = (m4.l0) this.f2424b;
                l0Var.getClass();
                String str = ((n4.l) this.f2425c).f13790a;
                if (TextUtils.isEmpty(str)) {
                    e2.a.n("MediaSessionLegacyStub", "onRemoveQueueItem(): Media ID shouldn't be null");
                    return;
                }
                m4.l1 l1Var = l0Var.f13430g.f13307t;
                if (!l1Var.m0(17)) {
                    e2.a.n("MediaSessionLegacyStub", "Can't remove item by ID without COMMAND_GET_TIMELINE being available");
                    return;
                }
                b2.k1 w02 = l1Var.w0();
                b2.j1 j1Var = new b2.j1();
                for (int i10 = 0; i10 < w02.o(); i10++) {
                    if (TextUtils.equals(w02.m(i10, j1Var, 0L).f1753c.f1770a, str)) {
                        l1Var.R(i10);
                        return;
                    }
                }
                return;
        }
    }

    @Override
    public Object i(m4.b0 b0Var, m4.r rVar, int i10) {
        switch (this.f2423a) {
            case 21:
                m4.g1 g1Var = (m4.g1) this.f2424b;
                j2.h hVar = (j2.h) this.f2425c;
                if (b0Var.j()) {
                    return v7.o8.b(new m4.r1(-100));
                }
                return e2.d0.d0((i9.w) g1Var.i(b0Var, rVar, i10), new androidx.car.app.utils.a(b0Var, rVar, hVar, 12));
            default:
                m4.g1 g1Var2 = (m4.g1) this.f2424b;
                m4.f1 f1Var = (m4.f1) this.f2425c;
                if (b0Var.j()) {
                    return v7.o8.b(new m4.r1(-100));
                }
                return e2.d0.d0((i9.w) g1Var2.i(b0Var, rVar, i10), new androidx.car.app.utils.a(b0Var, rVar, f1Var, 13));
        }
    }

    @Override
    public void invoke(Object obj) {
        switch (this.f2423a) {
            case 17:
                ((j2.b) obj).d((j2.a) this.f2424b, (u2.c0) this.f2425c);
                return;
            default:
                ((j2.b) obj).onRenderedFirstFrame((j2.a) this.f2424b);
                return;
        }
    }

    @Override
    public void j() {
        switch (this.f2423a) {
            case 13:
                ((hi.m0) this.f2424b).i();
                ((hi.l0) this.f2425c).p0();
                return;
            default:
                hi.r5 r5Var = (hi.r5) this.f2424b;
                hi.u5 u5Var = (hi.u5) this.f2425c;
                TL_iv.pageTableCell pagetablecell = u5Var.f9893b;
                if (pagetablecell != null) {
                    hi.l6.d(pagetablecell, u5Var.f9892a.getText());
                }
                hi.f3 f3Var = r5Var.E;
                if (f3Var != null && r5Var.f9464a != null) {
                    hi.z3.N1(f3Var.f9568a);
                    return;
                }
                return;
        }
    }

    @Override
    public void onComplete(Task task) {
        ((com.google.firebase.messaging.g) this.f2424b).a((Intent) this.f2425c);
    }

    @Override
    public void onFailure(Exception e) {
        String str;
        w0.i gVar;
        String str2;
        w0.d cVar;
        switch (this.f2423a) {
            case 1:
                c1.e eVar = (c1.e) this.f2424b;
                CancellationSignal cancellationSignal = (CancellationSignal) this.f2425c;
                kotlin.jvm.internal.i.e(e, "e");
                if ((e instanceof com.google.android.gms.common.api.f) && b1.d.f1587b.contains(Integer.valueOf(((com.google.android.gms.common.api.f) e).getStatusCode()))) {
                    str = "GET_INTERRUPTED";
                } else {
                    str = "GET_NO_CREDENTIALS";
                }
                String str3 = "During begin sign in, failure response from one tap: " + e.getMessage();
                int hashCode = str.hashCode();
                if (hashCode != -1567968963) {
                    if (hashCode != -154594663) {
                        if (hashCode == 1996705159 && str.equals("GET_NO_CREDENTIALS")) {
                            gVar = new w0.k(str3);
                        }
                        gVar = new w0.h(str3, 2);
                    } else {
                        if (str.equals("GET_INTERRUPTED")) {
                            gVar = new w0.j(str3);
                        }
                        gVar = new w0.h(str3, 2);
                    }
                } else {
                    if (str.equals("GET_CANCELED_TAG")) {
                        gVar = new w0.g(str3);
                    }
                    gVar = new w0.h(str3, 2);
                }
                CredentialProviderPlayServicesImpl.Companion.getClass();
                if (!a1.g.a(cancellationSignal)) {
                    eVar.f().execute(new c1.a(eVar, gVar, 0));
                    return;
                }
                return;
            default:
                d1.e eVar2 = (d1.e) this.f2424b;
                CancellationSignal cancellationSignal2 = (CancellationSignal) this.f2425c;
                kotlin.jvm.internal.i.e(e, "e");
                if ((e instanceof com.google.android.gms.common.api.f) && b1.d.f1587b.contains(Integer.valueOf(((com.google.android.gms.common.api.f) e).getStatusCode()))) {
                    str2 = "CREATE_INTERRUPTED";
                } else {
                    str2 = "CREATE_UNKNOWN";
                }
                String str4 = "During create public key credential, fido registration failure: " + e.getMessage();
                if (str2.equals("CREATE_CANCELED")) {
                    cVar = new w0.b(str4);
                } else if (str2.equals("CREATE_INTERRUPTED")) {
                    cVar = new w0.e(str4);
                } else {
                    cVar = new w0.c(str4, 2);
                }
                CredentialProviderPlayServicesImpl.Companion.getClass();
                if (!a1.g.a(cancellationSignal2)) {
                    Executor executor = eVar2.f6184g;
                    if (executor != null) {
                        executor.execute(new d1.a(eVar2, cVar, 1));
                        return;
                    } else {
                        kotlin.jvm.internal.i.h("executor");
                        throw null;
                    }
                }
                return;
        }
    }

    @Override
    public void p0(View view, float f7, float f10) {
        int i10 = this.f2423a;
    }

    @Override
    public void run(long j3) {
        TL_keyboard.TL_inlineButtonTypeUserProfile tL_inlineButtonTypeUserProfile = new TL_keyboard.TL_inlineButtonTypeUserProfile();
        tL_inlineButtonTypeUserProfile.user_id = j3;
        ((hi.w3) this.f2424b).a((String) this.f2425c, tL_inlineButtonTypeUserProfile);
    }

    @Override
    public Object then(Task task) {
        com.google.firebase.messaging.j jVar = (com.google.firebase.messaging.j) this.f2424b;
        String str = (String) this.f2425c;
        synchronized (jVar) {
            ((a0.f) jVar.f6096b).remove(str);
        }
        return task;
    }

    @Override
    public boolean v(wy wyVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, ig1 ig1Var) {
        org.telegram.ui.b6 b6Var = (org.telegram.ui.b6) this.f2424b;
        ArrayList arrayList2 = b6Var.f31166c;
        ((wy) this.f2425c).finishFragment();
        CacheByChatsController.KeepMediaException keepMediaException = null;
        int i12 = 0;
        int i13 = 0;
        while (true) {
            boolean z12 = true;
            if (i13 >= arrayList.size()) {
                break;
            }
            int i14 = 0;
            while (true) {
                if (i14 < b6Var.d.size()) {
                    if (((CacheByChatsController.KeepMediaException) b6Var.d.get(i14)).dialogId == ((MessagesStorage.TopicKey) arrayList.get(i13)).dialogId) {
                        keepMediaException = (CacheByChatsController.KeepMediaException) b6Var.d.get(i14);
                        break;
                    }
                    i14++;
                } else {
                    z12 = false;
                    break;
                }
            }
            if (!z12) {
                int i15 = CacheByChatsController.KEEP_MEDIA_FOREVER;
                if (b6Var.getMessagesController().getCacheByChatsController().getKeepMedia(b6Var.e) == CacheByChatsController.KEEP_MEDIA_FOREVER) {
                    i15 = CacheByChatsController.KEEP_MEDIA_ONE_DAY;
                }
                ArrayList arrayList3 = b6Var.d;
                CacheByChatsController.KeepMediaException keepMediaException2 = new CacheByChatsController.KeepMediaException(((MessagesStorage.TopicKey) arrayList.get(i13)).dialogId, i15);
                arrayList3.add(keepMediaException2);
                keepMediaException = keepMediaException2;
            }
            i13++;
        }
        b6Var.getMessagesController().getCacheByChatsController().saveKeepMediaExceptions(b6Var.e, b6Var.d);
        b6Var.U();
        if (keepMediaException != null) {
            int i16 = 0;
            while (true) {
                if (i16 < arrayList2.size()) {
                    if (((org.telegram.ui.a6) arrayList2.get(i16)).f30807c != null && ((org.telegram.ui.a6) arrayList2.get(i16)).f30807c.dialogId == keepMediaException.dialogId) {
                        i12 = i16;
                        break;
                    }
                    i16++;
                } else {
                    break;
                }
            }
            b6Var.f31165b.u0(i12);
            AndroidUtilities.runOnUIThread(new org.telegram.ui.n(5, b6Var, keepMediaException), 150L);
        }
        return true;
    }

    public cb(j2.a aVar, Object obj, long j3) {
        this.f2423a = 18;
        this.f2424b = aVar;
        this.f2425c = obj;
    }

    public cb(Object obj, Object obj2, Object obj3, int i10) {
        this.f2423a = i10;
        this.f2424b = obj;
        this.f2425c = obj3;
    }

    @Override
    public Object run(Object obj, Object obj2, Object obj3) {
        gg.n nVar = (gg.n) this.f2424b;
        TLRPC.Document document = (TLRPC.Document) obj2;
        Boolean bool = (Boolean) obj3;
        nVar.f8959w = false;
        AndroidUtilities.cancelRunOnUIThread(nVar.d);
        gg.i iVar = nVar.f8956n;
        nVar.f8960x = document;
        iVar.setSticker(document);
        ((org.telegram.ui.Cells.s8) ((View) this.f2425c)).setValueSticker(document);
        nVar.e0(true);
        return Boolean.TRUE;
    }

    private final void k(View view, float f7, float f10) {
    }

    private final void l(View view, float f7, float f10) {
    }
}
