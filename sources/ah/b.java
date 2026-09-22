package ah;

import ai.d2;
import ai.d6;
import ai.f6;
import ai.jc;
import ai.p3;
import ai.p8;
import ai.q1;
import ai.r5;
import ai.t5;
import ai.v1;
import ai.w5;
import android.content.Context;
import android.content.Intent;
import android.graphics.RectF;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Trace;
import android.text.TextUtils;
import android.view.View;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import b2.b1;
import b2.j1;
import b2.q;
import ci.b9;
import ci.ba;
import ci.ga;
import ci.i9;
import ci.ia;
import ci.k9;
import ci.ka;
import ci.m2;
import ci.n9;
import ci.q9;
import ci.u9;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import e2.d0;
import ei.e4;
import gg.k1;
import hg.a0;
import hg.x;
import i9.w;
import ii.c3;
import ii.h6;
import ii.i1;
import ii.i4;
import ii.o5;
import ii.p0;
import ii.r;
import ii.t3;
import ii.w3;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Executor;
import m4.e1;
import m4.f1;
import m4.k0;
import m4.l0;
import m4.m1;
import m4.u0;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.de;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.a2;
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.ActionBar.d3;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.f3;
import org.telegram.ui.Cells.r8;
import org.telegram.ui.Cells.v;
import org.telegram.ui.Components.AnimatedArrowDrawable;
import org.telegram.ui.Components.al0;
import org.telegram.ui.Components.bl0;
import org.telegram.ui.Components.n70;
import org.telegram.ui.Components.oc;
import org.telegram.ui.Components.vc;
import org.telegram.ui.Components.zt;
import org.telegram.ui.b4;
import org.telegram.ui.dd0;
import org.telegram.ui.f4;
import org.telegram.ui.h4;
import org.telegram.ui.l1;
import org.telegram.ui.l3;
import org.telegram.ui.o3;
import org.telegram.ui.p4;
import org.telegram.ui.v3;
import u2.b0;
import v7.l8;
public final class b implements hh.i, k9, a2, OnFailureListener, q9.d, al0, OnCompleteListener, Continuation, bl0, Utilities.Callback3Return, dd0, p0, zt, i4, e2.n, e2.m, k0, f1, v {
    public final int f419a;
    public final Object f420b;
    public final Object f421c;

    public b(int i10, Object obj, Object obj2) {
        this.f419a = i10;
        this.f420b = obj;
        this.f421c = obj2;
    }

    @Override
    public Object G(cf.c cVar) {
        String str = (String) this.f420b;
        q9.a aVar = (q9.a) this.f421c;
        try {
            Trace.beginSection(str);
            return aVar.f41173f.G(cVar);
        } finally {
            Trace.endSection();
        }
    }

    @Override
    public n70 a(i1 i1Var) {
        r rVar = (r) ((of.b) this.f420b).f15510c;
        n70 n70Var = new n70(rVar, (e6) this.f421c, i1Var, false, false, true);
        rVar.H = n70Var;
        return n70Var;
    }

    @Override
    public void b(org.telegram.tgnet.TLRPC.MessageMedia r1, int r2, boolean r3, int r4, long r5) {
        throw new UnsupportedOperationException("Method not decompiled: ah.b.b(org.telegram.tgnet.TLRPC$MessageMedia, int, boolean, int, long):void");
    }

    @Override
    public void c(float f7, float f10, int i10, View view) {
        e6 e6Var;
        int i11;
        int i12;
        long clientUserId;
        e6 e6Var2;
        e6 e6Var3;
        int i13;
        e6 e6Var4;
        int i14;
        boolean z10;
        e6 e6Var5;
        int i15;
        e6 e6Var6;
        int i16;
        e6 e6Var7;
        int i17;
        int i18;
        e6 e6Var8;
        int i19;
        TLRPC.ChatParticipants chatParticipants;
        ArrayList<TLRPC.ChatParticipant> arrayList;
        int i20;
        e6 e6Var9;
        float f11;
        int i21 = i10;
        switch (this.f419a) {
            case 6:
                ba baVar = (ba) this.f420b;
                Context context = (Context) this.f421c;
                ArrayList arrayList2 = baVar.L;
                a0.i iVar = baVar.f4399b;
                u9 u9Var = baVar.f4406x;
                ArrayList arrayList3 = baVar.f4400c;
                HashMap hashMap = baVar.d;
                ia iaVar = baVar.W;
                if (i21 >= 0 && i21 < arrayList2.size()) {
                    n9 n9Var = (n9) arrayList2.get(i21);
                    int i22 = n9Var.f15531a;
                    int i23 = 0;
                    if (i22 == 3) {
                        if (n9Var.f5084n && iaVar.F) {
                            i20 = ((f3) iaVar).currentAccount;
                            boolean z11 = iaVar.K;
                            TLRPC.InputPeer inputPeer = iaVar.f4805c;
                            q9 q9Var = new q9(baVar, 0);
                            e6Var9 = ((f3) iaVar).resourcesProvider;
                            new i9(context, i20, z11, inputPeer, q9Var, e6Var9).show();
                            return;
                        }
                        int i24 = n9Var.f5079i;
                        if (i24 == 1) {
                            if (iaVar.N == 1 || ia.J0(iaVar).isEmpty()) {
                                iaVar.M = 1;
                                iaVar.f4803b.D(1);
                            }
                            iaVar.N = 1;
                            baVar.f(true);
                            return;
                        } else if (i24 == 3) {
                            if (iaVar.N == 3 || (iaVar.f4808n.isEmpty() && iaVar.f4809r.isEmpty())) {
                                iaVar.M = 3;
                                iaVar.f4803b.D(1);
                            }
                            iaVar.N = 3;
                            baVar.f(true);
                            return;
                        } else if (i24 == 2) {
                            if (iaVar.N == 2) {
                                iaVar.M = 2;
                                iaVar.f4803b.D(1);
                            }
                            iaVar.N = 2;
                            baVar.f(true);
                            return;
                        } else if (i24 == 4) {
                            if (iaVar.N == 4) {
                                iaVar.M = 4;
                                iaVar.f4803b.D(1);
                            }
                            iaVar.N = 4;
                            baVar.f(true);
                            return;
                        } else {
                            if (i24 > 0) {
                                arrayList3.clear();
                                hashMap.clear();
                                iaVar.N = n9Var.f5079i;
                                u9Var.f4668c.a();
                            } else {
                                TLRPC.Chat chat = n9Var.h;
                                if (chat != null) {
                                    long j3 = chat.f18109id;
                                    if (ia.d1(iaVar, chat) > 200) {
                                        try {
                                            baVar.performHapticFeedback(3, 1);
                                        } catch (Throwable unused) {
                                        }
                                        Context context2 = baVar.getContext();
                                        e6Var7 = ((f3) iaVar).resourcesProvider;
                                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context2, 0, e6Var7);
                                        alertDialog$Builder.f18435a.R = LocaleController.getString(R.string.GroupTooLarge);
                                        alertDialog$Builder.f18435a.T = LocaleController.getString(R.string.GroupTooLargeMessage);
                                        hg.c.A(R.string.OK, alertDialog$Builder, null);
                                    } else if (!hashMap.containsKey(Long.valueOf(j3))) {
                                        i17 = ((f3) iaVar).currentAccount;
                                        TLRPC.Chat chat2 = MessagesController.getInstance(i17).getChat(Long.valueOf(j3));
                                        i18 = ((f3) iaVar).currentAccount;
                                        TLRPC.ChatFull chatFull = MessagesController.getInstance(i18).getChatFull(j3);
                                        if (chatFull != null && (chatParticipants = chatFull.participants) != null && (arrayList = chatParticipants.participants) != null && !arrayList.isEmpty() && chatFull.participants.participants.size() >= chatFull.participants_count - 1) {
                                            baVar.d(j3, chatFull.participants);
                                        } else {
                                            b2 b2Var = baVar.G;
                                            if (b2Var != null) {
                                                b2Var.dismiss();
                                                baVar.G = null;
                                            }
                                            baVar.H = j3;
                                            Context context3 = baVar.getContext();
                                            e6Var8 = ((f3) iaVar).resourcesProvider;
                                            b2 b2Var2 = new b2(context3, 3, e6Var8);
                                            baVar.G = b2Var2;
                                            b2Var2.q(50L);
                                            i19 = ((f3) iaVar).currentAccount;
                                            MessagesStorage messagesStorage = MessagesStorage.getInstance(i19);
                                            messagesStorage.getStorageQueue().postRunnable(new p8(baVar, chat2, messagesStorage, j3, 4));
                                        }
                                        if (!TextUtils.isEmpty(baVar.I)) {
                                            u9Var.setText("");
                                            baVar.I = null;
                                            baVar.g(false);
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
                                        baVar.i(true);
                                    }
                                } else {
                                    TLRPC.User user = n9Var.f5078g;
                                    if (user != null) {
                                        if (baVar.f4398a == 0) {
                                            iaVar.N = 0;
                                        }
                                        long j10 = user.f18256id;
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
                                            if (!TextUtils.isEmpty(baVar.I)) {
                                                u9Var.setText("");
                                                baVar.I = null;
                                                baVar.g(false);
                                            }
                                            iVar.k(Boolean.TRUE, j10);
                                        }
                                        arrayList3.clear();
                                        arrayList3.addAll(hashSet);
                                        baVar.i(true);
                                    }
                                }
                            }
                            baVar.f(true);
                            baVar.e(true);
                            u9Var.K = true;
                            return;
                        }
                    } else if (i22 == 7) {
                        if (view instanceof r8) {
                            r8 r8Var = (r8) view;
                            r8Var.setChecked(!r8Var.b());
                            n9Var.f5081k = r8Var.b();
                            int i25 = n9Var.f5076c;
                            if (i25 == 0) {
                                boolean b10 = r8Var.b();
                                iaVar.f4812x = b10;
                                if (iaVar.N == 4) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                if (b10) {
                                    d3 d3Var = iaVar.container;
                                    e6Var6 = ((f3) iaVar).resourcesProvider;
                                    vc vcVar = new vc(d3Var, e6Var6);
                                    int i26 = R.raw.ic_save_to_gallery;
                                    if (z10) {
                                        i16 = R.string.StoryEnabledScreenshotsShare;
                                    } else {
                                        i16 = R.string.StoryEnabledScreenshots;
                                    }
                                    oc G = vcVar.G(i26, 4, LocaleController.getString(i16));
                                    G.f26751j = 5000;
                                    G.k(true);
                                    return;
                                }
                                d3 d3Var2 = iaVar.container;
                                e6Var5 = ((f3) iaVar).resourcesProvider;
                                vc vcVar2 = new vc(d3Var2, e6Var5);
                                int i27 = R.raw.passcode_lock_close;
                                if (z10) {
                                    i15 = R.string.StoryDisabledScreenshotsShare;
                                } else {
                                    i15 = R.string.StoryDisabledScreenshots;
                                }
                                oc G2 = vcVar2.G(i27, 4, LocaleController.getString(i15));
                                G2.f26751j = 5000;
                                G2.k(true);
                                return;
                            } else if (i25 == 1) {
                                boolean b11 = r8Var.b();
                                iaVar.f4813y = b11;
                                boolean z12 = iaVar.f4805c instanceof TLRPC.TL_inputPeerChannel;
                                if (b11) {
                                    d3 d3Var3 = iaVar.container;
                                    e6Var4 = ((f3) iaVar).resourcesProvider;
                                    vc vcVar3 = new vc(d3Var3, e6Var4);
                                    int i28 = R.raw.msg_story_keep;
                                    if (z12) {
                                        i14 = R.string.StoryChannelEnableKeep;
                                    } else {
                                        i14 = R.string.StoryEnableKeep;
                                    }
                                    oc G3 = vcVar3.G(i28, 4, LocaleController.getString(i14));
                                    G3.f26751j = 5000;
                                    G3.k(true);
                                } else {
                                    d3 d3Var4 = iaVar.container;
                                    e6Var3 = ((f3) iaVar).resourcesProvider;
                                    vc vcVar4 = new vc(d3Var4, e6Var3);
                                    int i29 = R.raw.fire_on;
                                    if (z12) {
                                        i13 = R.string.StoryChannelDisableKeep;
                                    } else {
                                        i13 = R.string.StoryDisableKeep;
                                    }
                                    oc G4 = vcVar4.G(i29, 4, LocaleController.getString(i13));
                                    G4.f26751j = 5000;
                                    G4.k(true);
                                }
                                baVar.g(true);
                                return;
                            } else if (i25 == 2) {
                                iaVar.f4811w = r8Var.b();
                                baVar.g(true);
                                return;
                            } else {
                                return;
                            }
                        }
                        return;
                    } else if (i22 == 9) {
                        int i30 = n9Var.f5087q;
                        if (i30 == 0) {
                            ka kaVar = iaVar.f4806c0;
                            if (kaVar != null) {
                                kaVar.run();
                                return;
                            }
                            return;
                        } else if (i30 == 1) {
                            TLRPC.InputPeer inputPeer2 = iaVar.f4805c;
                            if (inputPeer2 == null) {
                                i12 = ((f3) iaVar).currentAccount;
                                clientUserId = UserConfig.getInstance(i12).getClientUserId();
                            } else {
                                clientUserId = DialogObject.getPeerDialogId(inputPeer2);
                            }
                            e6Var2 = ((f3) iaVar).resourcesProvider;
                            n70 F = n70.F(baVar, e6Var2, view);
                            F.c(R.drawable.msg_addfolder, LocaleController.getString(R.string.StoriesAlbumNewAlbum), new ai.j(baVar, clientUserId, 5), false);
                            F.k();
                            n70.f(F, iaVar.i1().B(clientUserId, true), iaVar.v, false, null, new m2(4, baVar, F));
                            F.Z();
                            return;
                        } else if (i30 == 5) {
                            Context context4 = baVar.getContext();
                            e6Var = ((f3) iaVar).resourcesProvider;
                            b2 b2Var3 = new b2(context4, 3, e6Var);
                            b2Var3.q(500L);
                            TL_phone.getGroupCallStreamRtmpUrl getgroupcallstreamrtmpurl = new TL_phone.getGroupCallStreamRtmpUrl();
                            getgroupcallstreamrtmpurl.live_story = true;
                            TLRPC.InputPeer inputPeer3 = iaVar.f4805c;
                            if (inputPeer3 == null) {
                                inputPeer3 = new TLRPC.TL_inputPeerSelf();
                            }
                            getgroupcallstreamrtmpurl.peer = inputPeer3;
                            i11 = ((f3) iaVar).currentAccount;
                            ConnectionsManager.getInstance(i11).sendRequest(getgroupcallstreamrtmpurl, new t5(baVar, b2Var3, getgroupcallstreamrtmpurl, 1));
                            return;
                        } else if (i30 == 6) {
                            iaVar.G = false;
                            baVar.g(true);
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
                h4 h4Var = (h4) this.f420b;
                l3 l3Var = (l3) this.f421c;
                if (h4Var.K == null || i21 - 1 >= 0) {
                    org.telegram.ui.Cells.q9 q9Var2 = h4Var.O0;
                    if (q9Var2 != null) {
                        if (q9Var2.y()) {
                            h4Var.O0.f(false);
                            return;
                        }
                        h4Var.O0.f(false);
                    }
                    f4 adapter = l3Var.getAdapter();
                    if ((view instanceof o3) && adapter.E != null) {
                        o3 o3Var = (o3) view;
                        if (h4Var.G0 == 0) {
                            if ((!o3Var.f36104c || f7 >= view.getMeasuredWidth() / 2) && !o3Var.d) {
                                TLObject userOrChat = MessagesController.getInstance(h4Var.X).getUserOrChat("previews");
                                if (userOrChat instanceof TLRPC.TL_user) {
                                    h4Var.P(adapter.E.f18262id, (TLRPC.User) userOrChat);
                                    return;
                                }
                                int i31 = UserConfig.selectedAccount;
                                long j11 = adapter.E.f18262id;
                                h4Var.b0(true);
                                TLRPC.TL_contacts_resolveUsername tL_contacts_resolveUsername = new TLRPC.TL_contacts_resolveUsername();
                                tL_contacts_resolveUsername.username = "previews";
                                h4Var.G0 = ConnectionsManager.getInstance(i31).sendRequest(tL_contacts_resolveUsername, new de(h4Var, i31, j11));
                                return;
                            }
                            return;
                        }
                        return;
                    } else if (i21 >= 0 && i21 < adapter.d.size()) {
                        TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) adapter.d.get(i21);
                        TL_iv.PageBlock z13 = h4.z(pageBlock);
                        if (z13 instanceof v3) {
                            z13 = ((v3) z13).f38351b;
                        }
                        if (z13 instanceof TL_iv.pageBlockChannel) {
                            MessagesController.getInstance(h4Var.X).openByUserName(ChatObject.getPublicUsername(((TL_iv.pageBlockChannel) z13).channel), h4Var.M, 2);
                            h4Var.o(false, true);
                            return;
                        } else if (z13 instanceof b4) {
                            b4 b4Var = (b4) z13;
                            h4Var.Q(b4Var.f32028a.articles.get(b4Var.f32029b).url, null, null);
                            return;
                        } else if (z13 instanceof TL_iv.pageBlockDetails) {
                            View y3 = h4.y(view);
                            if (y3 instanceof l1) {
                                h4Var.d = null;
                                h4Var.f37828f = null;
                                if (adapter.e.indexOf(pageBlock) >= 0) {
                                    TL_iv.pageBlockDetails pageblockdetails = (TL_iv.pageBlockDetails) z13;
                                    pageblockdetails.open = !pageblockdetails.open;
                                    int h = adapter.h();
                                    adapter.M();
                                    int abs = Math.abs(adapter.h() - h);
                                    l1 l1Var = (l1) y3;
                                    AnimatedArrowDrawable animatedArrowDrawable = l1Var.f35296f;
                                    if (pageblockdetails.open) {
                                        f11 = 0.0f;
                                    } else {
                                        f11 = 1.0f;
                                    }
                                    animatedArrowDrawable.a(f11);
                                    l1Var.invalidate();
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
        return e4.B0((e4) this.f420b, (Context) this.f421c, view, i10);
    }

    @Override
    public boolean d1(View view) {
        switch (this.f419a) {
            case 6:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void e(Object obj, q qVar) {
        ((j2.b) obj).d((b1) this.f421c, new of.b(qVar, ((j2.f) this.f420b).e));
    }

    @Override
    public void f(b2 b2Var, int i10) {
        switch (this.f419a) {
            case 3:
                w5 w5Var = (w5) this.f420b;
                d2 d2Var = ((jc) this.f421c).A0;
                if (d2Var != null) {
                    if (!d2Var.f692w) {
                        TL_phone.discardGroupCall discardgroupcall = new TL_phone.discardGroupCall();
                        discardgroupcall.call = d2Var.f688f;
                        ConnectionsManager.getInstance(d2Var.e).sendRequest(discardgroupcall, new q1(d2Var, 4));
                        d2Var.e();
                        return;
                    }
                    return;
                }
                f6.f0(w5Var.f1655l);
                return;
            case 10:
                e4.y0((e4) this.f420b, (TL_payments.connectedBotStarRef) this.f421c);
                return;
            case 12:
                k1 k1Var = (k1) this.f420b;
                k1Var.getClass();
                ((boolean[]) this.f421c)[0] = true;
                k1Var.Q();
                return;
            case 14:
                a0.d(r4.currentAccount).a((x) this.f420b, ((TL_account.TL_businessChatLink) this.f421c).link);
                return;
            default:
                p4 p4Var = (p4) this.f420b;
                p4Var.getClass();
                b2Var.dismiss();
                p4Var.W((View) this.f421c, true);
                return;
        }
    }

    @Override
    public void g(m4.r rVar) {
        switch (this.f419a) {
            case 23:
                Bundle bundle = (Bundle) this.f421c;
                m4.a0 a0Var = ((l0) this.f420b).f14594g;
                if (bundle == null) {
                    Bundle bundle2 = Bundle.EMPTY;
                }
                a0Var.n(rVar);
                return;
            default:
                l0 l0Var = (l0) this.f420b;
                l0Var.getClass();
                String str = ((n4.l) this.f421c).f14958a;
                if (TextUtils.isEmpty(str)) {
                    e2.a.n("MediaSessionLegacyStub", "onRemoveQueueItem(): Media ID shouldn't be null");
                    return;
                }
                m4.k1 k1Var = l0Var.f14594g.f14464t;
                if (!k1Var.m0(17)) {
                    e2.a.n("MediaSessionLegacyStub", "Can't remove item by ID without COMMAND_GET_TIMELINE being available");
                    return;
                }
                b2.k1 w02 = k1Var.w0();
                j1 j1Var = new j1();
                for (int i10 = 0; i10 < w02.o(); i10++) {
                    if (TextUtils.equals(w02.m(i10, j1Var, 0L).f3057c.f3074a, str)) {
                        k1Var.R(i10);
                        return;
                    }
                }
                return;
        }
    }

    @Override
    public Object h(m4.a0 a0Var, m4.r rVar, int i10) {
        switch (this.f419a) {
            case 25:
                f1 f1Var = (f1) this.f420b;
                u0 u0Var = (u0) this.f421c;
                if (a0Var.j()) {
                    return l8.b(new m4.q1(-100));
                }
                return d0.d0((w) f1Var.h(a0Var, rVar, i10), new r5(a0Var, rVar, u0Var, 14));
            default:
                f1 f1Var2 = (f1) this.f420b;
                e1 e1Var = (e1) this.f421c;
                if (a0Var.j()) {
                    return l8.b(new m4.q1(-100));
                }
                return d0.d0((w) f1Var2.h(a0Var, rVar, i10), new r5(a0Var, rVar, e1Var, 15));
        }
    }

    @Override
    public void i() {
        switch (this.f419a) {
            case 17:
                ((ii.l0) this.f420b).i();
                ((ii.k0) this.f421c).n0();
                return;
            default:
                o5 o5Var = (o5) this.f420b;
                ii.r5 r5Var = (ii.r5) this.f421c;
                TL_iv.pageTableCell pagetablecell = r5Var.f11606b;
                if (pagetablecell != null) {
                    h6.d(pagetablecell, r5Var.f11605a.getText());
                }
                c3 c3Var = o5Var.E;
                if (c3Var != null && o5Var.f11219a != null) {
                    w3.O1(c3Var.f11285a);
                    return;
                }
                return;
        }
    }

    @Override
    public void invoke(Object obj) {
        switch (this.f419a) {
            case 21:
                ((j2.b) obj).e((j2.a) this.f420b, (b0) this.f421c);
                return;
            default:
                ((j2.b) obj).onRenderedFirstFrame((j2.a) this.f420b);
                return;
        }
    }

    @Override
    public void j(RectF rectF, View view) {
        ((ch.d) this.f420b).t(rectF.left, rectF.top);
        ((View) this.f421c).invalidate();
    }

    @Override
    public void k(ga gaVar, boolean z10, boolean z11, boolean z12, boolean z13, TLRPC.InputPeer inputPeer, int i10, b9 b9Var, androidx.fragment.app.a0 a0Var) {
        boolean z14;
        switch (this.f419a) {
            case 1:
                f6 f6Var = (f6) this.f420b;
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) this.f421c;
                TL_stories.TL_stories_editStory tL_stories_editStory = new TL_stories.TL_stories_editStory();
                tL_stories_editStory.peer = MessagesController.getInstance(f6Var.C2).getInputPeer(storyItem.dialogId);
                tL_stories_editStory.f18348id = storyItem.f18344id;
                tL_stories_editStory.flags |= 4;
                tL_stories_editStory.privacy_rules = gaVar.f4723b;
                ConnectionsManager.getInstance(f6Var.C2).sendRequest(tL_stories_editStory, new p3(f6Var, b9Var, storyItem, gaVar, 0));
                return;
            default:
                w5 w5Var = (w5) this.f420b;
                ia iaVar = (ia) this.f421c;
                f6 f6Var2 = w5Var.f1655l;
                d6 d6Var = f6Var2.O1;
                TL_stories.StoryItem storyItem2 = d6Var.f703a;
                if (storyItem2 != null && storyItem2.pinned) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (z14 != z12) {
                    MessagesController.getInstance(f6Var2.C2).getStoriesController().o0(f6Var2.B1, f6Var2.f857v1, z12, null);
                }
                TL_stories.StoryItem storyItem3 = d6Var.f703a;
                if (storyItem3 != null) {
                    TLRPC.MessageMedia messageMedia = storyItem3.media;
                    if (messageMedia instanceof TLRPC.TL_messageMediaVideoStream) {
                        TLRPC.InputGroupCall inputGroupCall = ((TLRPC.TL_messageMediaVideoStream) messageMedia).call;
                        TL_phone.toggleGroupCallSettings togglegroupcallsettings = new TL_phone.toggleGroupCallSettings();
                        togglegroupcallsettings.call = inputGroupCall;
                        togglegroupcallsettings.messages_enabled = Boolean.valueOf(z10);
                        togglegroupcallsettings.send_paid_messages_stars = Long.valueOf(i10);
                        ConnectionsManager.getInstance(f6Var2.C2).sendRequest(togglegroupcallsettings, new v1(1, w5Var, iaVar));
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override
    public void onComplete(Task task) {
        ((com.google.firebase.messaging.g) this.f420b).a((Intent) this.f421c);
    }

    @Override
    public void onFailure(Exception e) {
        String str;
        w0.i gVar;
        String str2;
        w0.d cVar;
        switch (this.f419a) {
            case 4:
                c1.e eVar = (c1.e) this.f420b;
                CancellationSignal cancellationSignal = (CancellationSignal) this.f421c;
                kotlin.jvm.internal.i.e(e, "e");
                if ((e instanceof com.google.android.gms.common.api.f) && b1.d.f2891b.contains(Integer.valueOf(((com.google.android.gms.common.api.f) e).getStatusCode()))) {
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
                d1.e eVar2 = (d1.e) this.f420b;
                CancellationSignal cancellationSignal2 = (CancellationSignal) this.f421c;
                kotlin.jvm.internal.i.e(e, "e");
                if ((e instanceof com.google.android.gms.common.api.f) && b1.d.f2891b.contains(Integer.valueOf(((com.google.android.gms.common.api.f) e).getStatusCode()))) {
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
                    Executor executor = eVar2.f7408g;
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
    public void r0(View view, float f7, float f10) {
        int i10 = this.f419a;
    }

    @Override
    public void run(long j3) {
        TL_keyboard.TL_inlineButtonTypeUserProfile tL_inlineButtonTypeUserProfile = new TL_keyboard.TL_inlineButtonTypeUserProfile();
        tL_inlineButtonTypeUserProfile.user_id = j3;
        ((t3) this.f420b).a((String) this.f421c, tL_inlineButtonTypeUserProfile);
    }

    @Override
    public Object then(Task task) {
        com.google.firebase.messaging.j jVar = (com.google.firebase.messaging.j) this.f420b;
        String str = (String) this.f421c;
        synchronized (jVar) {
            ((a0.f) jVar.f7326b).remove(str);
        }
        return task;
    }

    public b(j2.a aVar, Object obj, long j3) {
        this.f419a = 22;
        this.f420b = aVar;
        this.f421c = obj;
    }

    public b(l0 l0Var, m1 m1Var, Bundle bundle) {
        this.f419a = 23;
        this.f420b = l0Var;
        this.f421c = bundle;
    }

    @Override
    public Object run(Object obj, Object obj2, Object obj3) {
        hg.n nVar = (hg.n) this.f420b;
        TLRPC.Document document = (TLRPC.Document) obj2;
        Boolean bool = (Boolean) obj3;
        nVar.f10363w = false;
        AndroidUtilities.cancelRunOnUIThread(nVar.d);
        hg.j jVar = nVar.f10360n;
        nVar.f10364x = document;
        jVar.setSticker(document);
        ((r8) ((View) this.f421c)).setValueSticker(document);
        nVar.e0(true);
        return Boolean.TRUE;
    }

    private final void l(View view, float f7, float f10) {
    }

    private final void m(View view, float f7, float f10) {
    }
}
