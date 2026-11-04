package ai;

import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import gi.va;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.messenger.a8;
import org.telegram.messenger.bd;
import org.telegram.messenger.h10;
import org.telegram.messenger.hp;
import org.telegram.messenger.hs;
import org.telegram.messenger.mo;
import org.telegram.messenger.qr;
import org.telegram.messenger.u10;
import org.telegram.messenger.w7;
import org.telegram.messenger.zi;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_chatlists;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.RLottieNative;
import org.telegram.ui.Components.fc;
import org.telegram.ui.Components.k9;
import org.telegram.ui.Components.ma;
import org.telegram.ui.Components.u8;
import org.telegram.ui.Components.wt0;
import org.telegram.ui.Components.xt0;
import org.telegram.ui.Components.yt0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.SecretMediaViewer;
import org.telegram.ui.cm;
import org.telegram.ui.di;
import org.telegram.ui.ee0;
import org.telegram.ui.hm;
import org.telegram.ui.id0;
import org.telegram.ui.ly;
import org.telegram.ui.m90;
import org.telegram.ui.rl;
import org.telegram.ui.uw;
import org.telegram.ui.wm;
import org.telegram.ui.x30;
public final class p1 implements Runnable {
    public final int f873a;
    public final int f874b;
    public final Object f875c;
    public final Object d;
    public final Object f876e;
    public final Object f877f;

    public p1(int i3, TLRPC.Chat chat, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3) {
        this.f873a = 15;
        this.f874b = i3;
        this.f875c = chat;
        this.d = arrayList;
        this.f876e = arrayList2;
        this.f877f = arrayList3;
    }

    private final void a() {
        TLObject tLObject = (TLObject) this.f875c;
        HashSet hashSet = (HashSet) this.d;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f876e;
        org.telegram.ui.ActionBar.d2 d2Var = (org.telegram.ui.ActionBar.d2) this.f877f;
        boolean z10 = tLObject instanceof TLRPC.Updates;
        int i3 = this.f874b;
        if (z10) {
            TLRPC.Updates updates = (TLRPC.Updates) tLObject;
            hp.s1(i3).Y3(updates.users, false);
            hp.s1(i3).S3(updates.chats, false);
            ArrayList z02 = hp.z0(updates, TL_update.TL_updateGroupCall.class);
            int size = z02.size();
            TLRPC.GroupCall groupCall = null;
            int i10 = 0;
            while (i10 < size) {
                Object obj = z02.get(i10);
                i10++;
                groupCall = ((TL_update.TL_updateGroupCall) obj).call;
            }
            if (LaunchActivity.K1 != null && groupCall != null) {
                TLRPC.TL_inputGroupCall tL_inputGroupCall = new TLRPC.TL_inputGroupCall();
                tL_inputGroupCall.f27018id = groupCall.f27011id;
                tL_inputGroupCall.access_hash = groupCall.access_hash;
                org.telegram.ui.Components.voip.n1.g(LaunchActivity.K1, i3, tL_inputGroupCall, false, groupCall, hashSet);
            }
        } else if (tLObject instanceof TL_phone.groupCall) {
            TL_phone.groupCall groupcall = (TL_phone.groupCall) tLObject;
            hp.s1(i3).Y3(groupcall.users, false);
            hp.s1(i3).S3(groupcall.chats, false);
            if (LaunchActivity.K1 != null) {
                TLRPC.TL_inputGroupCall tL_inputGroupCall2 = new TLRPC.TL_inputGroupCall();
                TLRPC.GroupCall groupCall2 = groupcall.call;
                tL_inputGroupCall2.f27018id = groupCall2.f27011id;
                tL_inputGroupCall2.access_hash = groupCall2.access_hash;
                org.telegram.ui.Components.voip.n1.g(LaunchActivity.K1, i3, tL_inputGroupCall2, false, groupCall2, hashSet);
            }
        } else if (tL_error != null) {
            fc.a0(d2Var).f0(tL_error, false);
        }
    }

    private final void b() {
        hm hmVar = (hm) this.f875c;
        di diVar = (di) this.d;
        diVar.f54708b = hmVar.f45934a.getMessagesController().s0(-((TLRPC.Chat) this.f876e).f27001id, this.f874b, new cm(hmVar, diVar, (wm) this.f877f));
    }

    private final void c() {
        int i3;
        hm hmVar = (hm) this.f875c;
        zi ziVar = (zi) this.d;
        Integer num = (Integer) this.f876e;
        byte[] bArr = (byte[]) this.f877f;
        wm wmVar = hmVar.f45934a;
        int f12 = ziVar.f1();
        if (zi.B0(ziVar.f26868k) == wmVar.f51272c7) {
            i3 = 1;
        } else {
            i3 = 0;
        }
        int i10 = i3;
        wmVar.xb(this.f874b, f12, true, i10, true, 0, num, bArr, new rl(hmVar, ziVar, 1));
    }

    private final void e() {
        org.telegram.ui.ActionBar.d2 Q;
        TLRPC.Chat chat = (TLRPC.Chat) this.f875c;
        ArrayList arrayList = (ArrayList) this.d;
        ArrayList arrayList2 = (ArrayList) this.f876e;
        ArrayList arrayList3 = (ArrayList) this.f877f;
        if (LaunchActivity.G1 && (Q = LaunchActivity.Q()) != null && Q.getParentActivity() != null) {
            vg.i0 i0Var = new vg.i0(11, this.f874b, Q.getParentActivity(), Q, null);
            i0Var.C1(chat, arrayList, arrayList2, arrayList3, null);
            i0Var.show();
        }
    }

    private final void f() {
        TLRPC.TL_help_support tL_help_support = (TLRPC.TL_help_support) this.d;
        org.telegram.ui.ActionBar.s1 s1Var = (org.telegram.ui.ActionBar.s1) this.f876e;
        org.telegram.ui.ActionBar.d2 d2Var = (org.telegram.ui.ActionBar.d2) this.f877f;
        SharedPreferences.Editor edit = ((SharedPreferences) this.f875c).edit();
        edit.putLong("support_id2", tL_help_support.user.f27150id);
        SerializedData serializedData = new SerializedData();
        tL_help_support.user.serializeToStream(serializedData);
        edit.putString("support_user", Base64.encodeToString(serializedData.toByteArray(), 0));
        edit.commit();
        serializedData.cleanup();
        try {
            s1Var.dismiss();
        } catch (Exception e10) {
            a8.g(e10, true);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(tL_help_support.user);
        int i3 = this.f874b;
        qr.a0(i3).m1(arrayList, null, true, true);
        hp.s1(i3).X3(tL_help_support.user, false, false);
        Bundle bundle = new Bundle();
        bundle.putLong("user_id", tL_help_support.user.f27150id);
        d2Var.presentFragment(new wm(bundle));
    }

    private final void g() {
        org.telegram.ui.ActionBar.s1[] s1VarArr = (org.telegram.ui.ActionBar.s1[]) this.f875c;
        int[] iArr = (int[]) this.d;
        Runnable runnable = (Runnable) this.f876e;
        org.telegram.ui.ActionBar.d2 d2Var = (org.telegram.ui.ActionBar.d2) this.f877f;
        org.telegram.ui.ActionBar.s1 s1Var = s1VarArr[0];
        if (s1Var == null) {
            return;
        }
        s1Var.setOnCancelListener(new org.telegram.ui.Components.n1(iArr, this.f874b, runnable));
        d2Var.showDialog(s1VarArr[0]);
    }

    private final void h() {
        int i3;
        int i10;
        yt0 yt0Var = (yt0) this.f875c;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) this.d;
        zi ziVar = (zi) this.f876e;
        org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) this.f877f;
        int[] iArr = yt0Var.f32725e;
        RLottieNative[] rLottieNativeArr = yt0Var.f40829g1;
        if (yt0Var.X0) {
            org.telegram.messenger.g0.h3(new wt0(yt0Var, 2));
            return;
        }
        boolean z10 = false;
        int i11 = 0;
        while (true) {
            int length = rLottieNativeArr.length;
            i3 = this.f874b;
            if (i11 >= length) {
                break;
            }
            if (rLottieNativeArr[i11] == null) {
                if (i11 == 0) {
                    i10 = 1;
                } else if (i11 == 1) {
                    i10 = 8;
                } else {
                    i10 = 2;
                    if (i11 == 2) {
                        i10 = 14;
                    } else if (i11 == 3) {
                        i10 = 20;
                    }
                }
                if (i10 < tL_messages_stickerSet.documents.size()) {
                    TLRPC.Document document = tL_messages_stickerSet.documents.get(i10);
                    w7.G(h10.f22829t0);
                    String y22 = org.telegram.messenger.g0.y2(w7.K(document, null, true, true), 0);
                    if (TextUtils.isEmpty(y22)) {
                        org.telegram.messenger.g0.h3(new xt0(document, i3, ziVar, q1Var, tL_messages_stickerSet, 1));
                        z10 = true;
                    } else {
                        rLottieNativeArr[i11] = RLottieNative.b(y22, iArr, null, null);
                        yt0Var.f40830h1[i11] = iArr[0];
                    }
                }
            }
            i11++;
        }
        if (z10) {
            org.telegram.messenger.g0.h3(new wt0(yt0Var, 3));
        } else {
            org.telegram.messenger.g0.h3(new org.telegram.ui.f4(yt0Var, i3, q1Var, 21));
        }
    }

    private final void i() {
        boolean z10;
        boolean z11;
        LaunchActivity launchActivity = (LaunchActivity) this.f875c;
        TLObject tLObject = (TLObject) this.d;
        Uri uri = (Uri) this.f876e;
        org.telegram.ui.ActionBar.s1 s1Var = (org.telegram.ui.ActionBar.s1) this.f877f;
        String str = LaunchActivity.E1;
        if (!launchActivity.isFinishing()) {
            if (tLObject != null && launchActivity.f41314r0 != null) {
                TLRPC.TL_messages_historyImportParsed tL_messages_historyImportParsed = (TLRPC.TL_messages_historyImportParsed) tLObject;
                Bundle k10 = a1.g.k("onlySelect", true);
                k10.putString("importTitle", tL_messages_historyImportParsed.title);
                k10.putBoolean("allowSwitchAccount", true);
                if (tL_messages_historyImportParsed.pm) {
                    k10.putInt("dialogsType", 12);
                } else if (tL_messages_historyImportParsed.group) {
                    k10.putInt("dialogsType", 11);
                } else {
                    String uri2 = uri.toString();
                    int i3 = this.f874b;
                    Iterator it = hp.s1(i3).Y3.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (uri2.contains((String) it.next())) {
                                k10.putInt("dialogsType", 12);
                                z10 = true;
                                break;
                            }
                        } else {
                            z10 = false;
                            break;
                        }
                    }
                    if (!z10) {
                        Iterator it2 = hp.s1(i3).X3.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                break;
                            } else if (uri2.contains((String) it2.next())) {
                                k10.putInt("dialogsType", 11);
                                z10 = true;
                                break;
                            }
                        }
                        if (!z10) {
                            k10.putInt("dialogsType", 13);
                        }
                    }
                }
                if (SecretMediaViewer.g() && SecretMediaViewer.f().f41965s) {
                    SecretMediaViewer.f().e(false, false);
                } else if (PhotoViewer.F1() && PhotoViewer.v1().U1()) {
                    PhotoViewer.v1().H0(false, true);
                } else if (org.telegram.ui.i4.G() && org.telegram.ui.i4.v().W) {
                    org.telegram.ui.i4.v().m(false, true);
                }
                va.w();
                x30 x30Var = x30.f51711v5;
                if (x30Var != null) {
                    x30Var.dismiss();
                }
                if (org.telegram.messenger.g0.Q1()) {
                    launchActivity.f41314r0.X(true, true);
                    launchActivity.f41318t0.X(true, true);
                }
                uw uwVar = new uw(k10);
                uwVar.D2 = launchActivity;
                if (!org.telegram.messenger.g0.Q1() ? !(launchActivity.f41314r0.getFragmentStack().size() <= 1 || !(launchActivity.f41314r0.getFragmentStack().get(launchActivity.f41314r0.getFragmentStack().size() - 1) instanceof ee0)) : !(launchActivity.f41316s0.getFragmentStack().isEmpty() || !(launchActivity.f41316s0.getFragmentStack().get(launchActivity.f41316s0.getFragmentStack().size() - 1) instanceof ee0))) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                ((ActionBarLayout) launchActivity.M()).V(uwVar, z11, false);
            } else {
                if (launchActivity.X == null) {
                    launchActivity.X = new ArrayList();
                }
                launchActivity.X.add(0, launchActivity.Y);
                launchActivity.Y = null;
                launchActivity.j0(true);
            }
            try {
                s1Var.dismiss();
            } catch (Exception e10) {
                a8.g(e10, true);
            }
        }
    }

    private final void j() {
        LaunchActivity launchActivity = (LaunchActivity) this.f875c;
        ly lyVar = (ly) this.d;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f876e;
        TLRPC.Updates updates = (TLRPC.Updates) this.f877f;
        ArrayList arrayList = launchActivity.f41291e0;
        if (!launchActivity.isFinishing()) {
            try {
                lyVar.run();
            } catch (Exception e10) {
                a8.g(e10, true);
            }
            if (tL_error == null) {
                if (launchActivity.f41314r0 != null && updates != null && !updates.chats.isEmpty()) {
                    TLRPC.Chat chat = updates.chats.get(0);
                    chat.left = false;
                    chat.kicked = false;
                    int i3 = this.f874b;
                    hp.s1(i3).Y3(updates.users, false);
                    hp.s1(i3).S3(updates.chats, false);
                    Bundle bundle = new Bundle();
                    bundle.putLong("chat_id", chat.f27001id);
                    if (arrayList.isEmpty() || hp.s1(i3).E(bundle, (org.telegram.ui.ActionBar.d2) k2.p1.h(1, arrayList), null, null)) {
                        wm wmVar = new wm(bundle);
                        hs.f(i3).k(hs.f23305t, new Object[0]);
                        ((ActionBarLayout) launchActivity.M()).V(wmVar, false, true);
                        return;
                    }
                    return;
                }
                return;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(launchActivity);
            String M0 = bd.M0(2131689472, null);
            org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.f27343a;
            s1Var.S = M0;
            if (tL_error.text.startsWith("FLOOD_WAIT")) {
                s1Var.U = bd.M0(2131750688, null);
            } else if (tL_error.text.equals("USERS_TOO_MUCH")) {
                s1Var.U = bd.M0(2131749084, null);
            } else {
                s1Var.U = bd.M0(2131749083, null);
            }
            alertDialog$Builder.k(bd.M0(2131747839, null), null);
            launchActivity.F0(alertDialog$Builder);
        }
    }

    private final void k() {
        fc a02;
        ArrayList<TLRPC.User> arrayList;
        ArrayList<TLRPC.Chat> arrayList2;
        TLObject tLObject = (TLObject) this.d;
        String str = (String) this.f876e;
        ly lyVar = (ly) this.f877f;
        org.telegram.ui.ActionBar.d2 d2Var = (org.telegram.ui.ActionBar.d2) k2.p1.h(1, ((LaunchActivity) this.f875c).f41291e0);
        try {
            if (tLObject instanceof TL_chatlists.chatlist_ChatlistInvite) {
                TL_chatlists.chatlist_ChatlistInvite chatlist_chatlistinvite = (TL_chatlists.chatlist_ChatlistInvite) tLObject;
                boolean z10 = chatlist_chatlistinvite instanceof TL_chatlists.TL_chatlists_chatlistInvite;
                if (z10) {
                    TL_chatlists.TL_chatlists_chatlistInvite tL_chatlists_chatlistInvite = (TL_chatlists.TL_chatlists_chatlistInvite) chatlist_chatlistinvite;
                    arrayList2 = tL_chatlists_chatlistInvite.chats;
                    arrayList = tL_chatlists_chatlistInvite.users;
                } else if (chatlist_chatlistinvite instanceof TL_chatlists.TL_chatlists_chatlistInviteAlready) {
                    TL_chatlists.TL_chatlists_chatlistInviteAlready tL_chatlists_chatlistInviteAlready = (TL_chatlists.TL_chatlists_chatlistInviteAlready) chatlist_chatlistinvite;
                    arrayList2 = tL_chatlists_chatlistInviteAlready.chats;
                    arrayList = tL_chatlists_chatlistInviteAlready.users;
                } else {
                    arrayList = null;
                    arrayList2 = null;
                }
                int i3 = this.f874b;
                int i10 = 0;
                hp.s1(i3).S3(arrayList2, false);
                hp.s1(i3).Y3(arrayList, false);
                if (z10 && ((TL_chatlists.TL_chatlists_chatlistInvite) chatlist_chatlistinvite).peers.isEmpty()) {
                    a02 = fc.a0(d2Var);
                } else {
                    ?? maVar = new ma(d2Var, false);
                    maVar.R1 = -1;
                    maVar.V1 = "";
                    maVar.W1 = new ArrayList();
                    maVar.Y1 = "";
                    maVar.f37846a2 = new ArrayList();
                    ArrayList arrayList3 = new ArrayList();
                    maVar.f37847b2 = arrayList3;
                    maVar.f37863s2 = -1;
                    maVar.f37866v2 = -5;
                    maVar.Q1 = str;
                    maVar.S1 = chatlist_chatlistinvite;
                    arrayList3.clear();
                    if (z10) {
                        TL_chatlists.TL_chatlists_chatlistInvite tL_chatlists_chatlistInvite2 = (TL_chatlists.TL_chatlists_chatlistInvite) chatlist_chatlistinvite;
                        TLRPC.TL_textWithEntities tL_textWithEntities = tL_chatlists_chatlistInvite2.title;
                        maVar.V1 = tL_textWithEntities.text;
                        maVar.W1 = tL_textWithEntities.entities;
                        maVar.X1 = tL_chatlists_chatlistInvite2.title_noanimate;
                        maVar.Z1 = tL_chatlists_chatlistInvite2.peers;
                    } else if (chatlist_chatlistinvite instanceof TL_chatlists.TL_chatlists_chatlistInviteAlready) {
                        TL_chatlists.TL_chatlists_chatlistInviteAlready tL_chatlists_chatlistInviteAlready2 = (TL_chatlists.TL_chatlists_chatlistInviteAlready) chatlist_chatlistinvite;
                        maVar.Z1 = tL_chatlists_chatlistInviteAlready2.missing_peers;
                        maVar.c2 = tL_chatlists_chatlistInviteAlready2.already_peers;
                        maVar.R1 = tL_chatlists_chatlistInviteAlready2.filter_id;
                        ArrayList arrayList4 = d2Var.getMessagesController().Q0;
                        if (arrayList4 != null) {
                            while (true) {
                                if (i10 >= arrayList4.size()) {
                                    break;
                                }
                                mo moVar = (mo) arrayList4.get(i10);
                                if (moVar.f24237a == maVar.R1) {
                                    maVar.V1 = moVar.f24238b;
                                    maVar.W1 = moVar.f24239c;
                                    maVar.X1 = moVar.f24248n;
                                    break;
                                }
                                i10++;
                            }
                        }
                    }
                    maVar.f1();
                    d2Var.showDialog(maVar);
                    lyVar.run();
                    return;
                }
            } else {
                a02 = fc.a0(d2Var);
            }
            lyVar.run();
            return;
        } catch (Exception e10) {
            a8.g(e10, true);
            return;
        }
        org.telegram.messenger.k5.p(null, 2131748217, a02, null);
    }

    private final void l() {
        ((m90) this.f875c).v((String) this.d, this.f874b + 1, (String) this.f876e, (String) this.f877f);
    }

    private final void m() {
        id0 id0Var = (id0) this.f875c;
        String str = (String) this.d;
        String str2 = (String) this.f876e;
        String str3 = (String) this.f877f;
        ArrayList arrayList = new ArrayList();
        e5.a aVar = new e5.a();
        aVar.f9555c = "inapp";
        aVar.f9554b = str;
        arrayList.add(aVar.a());
        a8.b("LoginBilling querying \"" + str + "\" product");
        org.telegram.messenger.r1.i().o(arrayList, new m3(id0Var, str, str2, str3, this.f874b));
    }

    private final void n() {
        u8 u8Var = (u8) this.d;
        TLRPC.User user = (TLRPC.User) this.f876e;
        ((int[]) this.f875c)[0] = this.f874b;
        u8Var.r(user);
        ((k9) this.f877f).e(user, u8Var);
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: ai.p1.run():void");
    }

    public p1(Object obj, int i3, Object obj2, Object obj3, Object obj4, int i10) {
        this.f873a = i10;
        this.f875c = obj;
        this.f874b = i3;
        this.d = obj2;
        this.f876e = obj3;
        this.f877f = obj4;
    }

    public p1(Object obj, Object obj2, int i3, Object obj3, Object obj4, int i10) {
        this.f873a = i10;
        this.f875c = obj;
        this.d = obj2;
        this.f874b = i3;
        this.f876e = obj3;
        this.f877f = obj4;
    }

    public p1(Object obj, Object obj2, Object obj3, int i3, Object obj4, int i10) {
        this.f873a = i10;
        this.f875c = obj;
        this.d = obj2;
        this.f876e = obj3;
        this.f874b = i3;
        this.f877f = obj4;
    }

    public p1(Object obj, Object obj2, Object obj3, Object obj4, int i3, int i10) {
        this.f873a = i10;
        this.f875c = obj;
        this.d = obj2;
        this.f876e = obj3;
        this.f877f = obj4;
        this.f874b = i3;
    }

    public p1(TLObject tLObject, boolean[] zArr, u10 u10Var, int i3, TL_account.updateEmojiStatus updateemojistatus) {
        this.f873a = 3;
        this.f875c = tLObject;
        this.d = zArr;
        this.f877f = u10Var;
        this.f874b = i3;
        this.f876e = updateemojistatus;
    }
}
