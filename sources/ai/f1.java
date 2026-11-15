package ai;

import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Base64;
import bi.b3;
import hi.sa;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.messenger.a8;
import org.telegram.messenger.gj;
import org.telegram.messenger.hd;
import org.telegram.messenger.k5;
import org.telegram.messenger.m10;
import org.telegram.messenger.np;
import org.telegram.messenger.ns;
import org.telegram.messenger.so;
import org.telegram.messenger.vr;
import org.telegram.messenger.w7;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_chatlists;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.RLottieNative;
import org.telegram.ui.Components.au0;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.i9;
import org.telegram.ui.Components.ja;
import org.telegram.ui.Components.rr;
import org.telegram.ui.Components.t8;
import org.telegram.ui.Components.yt0;
import org.telegram.ui.Components.zt0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.SecretMediaViewer;
import org.telegram.ui.an;
import org.telegram.ui.c40;
import org.telegram.ui.g4;
import org.telegram.ui.g50;
import org.telegram.ui.je0;
import org.telegram.ui.kd0;
import org.telegram.ui.q90;
import org.telegram.ui.yw;
public final class f1 implements Runnable {
    public final int f1204a;
    public final int f1205b;
    public final Object f1206c;
    public final Object d;
    public final Object f1207e;
    public final Object f1208f;

    public f1(int i7, Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f1204a = i10;
        this.f1205b = i7;
        this.f1206c = obj;
        this.d = obj2;
        this.f1207e = obj3;
        this.f1208f = obj4;
    }

    private final void a() {
        TLObject tLObject = (TLObject) this.f1206c;
        HashSet hashSet = (HashSet) this.d;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f1207e;
        org.telegram.ui.ActionBar.e2 e2Var = (org.telegram.ui.ActionBar.e2) this.f1208f;
        boolean z10 = tLObject instanceof TLRPC.Updates;
        int i7 = this.f1205b;
        if (z10) {
            TLRPC.Updates updates = (TLRPC.Updates) tLObject;
            np.s1(i7).Y3(updates.users, false);
            np.s1(i7).S3(updates.chats, false);
            ArrayList z02 = np.z0(updates, TL_update.TL_updateGroupCall.class);
            int size = z02.size();
            TLRPC.GroupCall groupCall = null;
            int i10 = 0;
            while (i10 < size) {
                Object obj = z02.get(i10);
                i10++;
                groupCall = ((TL_update.TL_updateGroupCall) obj).call;
            }
            if (LaunchActivity.H1 != null && groupCall != null) {
                TLRPC.TL_inputGroupCall tL_inputGroupCall = new TLRPC.TL_inputGroupCall();
                tL_inputGroupCall.f28068id = groupCall.f28061id;
                tL_inputGroupCall.access_hash = groupCall.access_hash;
                org.telegram.ui.Components.voip.c2.g(LaunchActivity.H1, i7, tL_inputGroupCall, false, groupCall, hashSet);
            }
        } else if (tLObject instanceof TL_phone.groupCall) {
            TL_phone.groupCall groupcall = (TL_phone.groupCall) tLObject;
            np.s1(i7).Y3(groupcall.users, false);
            np.s1(i7).S3(groupcall.chats, false);
            if (LaunchActivity.H1 != null) {
                TLRPC.TL_inputGroupCall tL_inputGroupCall2 = new TLRPC.TL_inputGroupCall();
                TLRPC.GroupCall groupCall2 = groupcall.call;
                tL_inputGroupCall2.f28068id = groupCall2.f28061id;
                tL_inputGroupCall2.access_hash = groupCall2.access_hash;
                org.telegram.ui.Components.voip.c2.g(LaunchActivity.H1, i7, tL_inputGroupCall2, false, groupCall2, hashSet);
            }
        } else if (tL_error != null) {
            cc.a0(e2Var).f0(tL_error, false);
        }
    }

    private final void b() {
        org.telegram.ui.ActionBar.e2 Q;
        TLRPC.Chat chat = (TLRPC.Chat) this.f1206c;
        ArrayList arrayList = (ArrayList) this.d;
        ArrayList arrayList2 = (ArrayList) this.f1207e;
        ArrayList arrayList3 = (ArrayList) this.f1208f;
        if (LaunchActivity.E1 && (Q = LaunchActivity.Q()) != null && Q.getParentActivity() != null) {
            ug.j0 j0Var = new ug.j0(11, this.f1205b, Q.getParentActivity(), Q, null);
            j0Var.C1(chat, arrayList, arrayList2, arrayList3, null);
            j0Var.show();
        }
    }

    private final void c() {
        TLRPC.TL_help_support tL_help_support = (TLRPC.TL_help_support) this.d;
        org.telegram.ui.ActionBar.t1 t1Var = (org.telegram.ui.ActionBar.t1) this.f1207e;
        org.telegram.ui.ActionBar.e2 e2Var = (org.telegram.ui.ActionBar.e2) this.f1208f;
        SharedPreferences.Editor edit = ((SharedPreferences) this.f1206c).edit();
        edit.putLong("support_id2", tL_help_support.user.f28200id);
        SerializedData serializedData = new SerializedData();
        tL_help_support.user.serializeToStream(serializedData);
        edit.putString("support_user", Base64.encodeToString(serializedData.toByteArray(), 0));
        edit.commit();
        serializedData.cleanup();
        try {
            t1Var.dismiss();
        } catch (Exception e10) {
            a8.g(e10, true);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(tL_help_support.user);
        int i7 = this.f1205b;
        vr.a0(i7).m1(arrayList, null, true, true);
        np.s1(i7).X3(tL_help_support.user, false, false);
        Bundle bundle = new Bundle();
        bundle.putLong("user_id", tL_help_support.user.f28200id);
        e2Var.presentFragment(new an(bundle));
    }

    private final void d() {
        org.telegram.ui.ActionBar.t1[] t1VarArr = (org.telegram.ui.ActionBar.t1[]) this.d;
        int[] iArr = (int[]) this.f1206c;
        Runnable runnable = (Runnable) this.f1207e;
        org.telegram.ui.ActionBar.e2 e2Var = (org.telegram.ui.ActionBar.e2) this.f1208f;
        org.telegram.ui.ActionBar.t1 t1Var = t1VarArr[0];
        if (t1Var == null) {
            return;
        }
        t1Var.setOnCancelListener(new org.telegram.ui.Components.m1(iArr, this.f1205b, runnable));
        e2Var.showDialog(t1VarArr[0]);
    }

    private final void f() {
        rr.d1((rr) this.d, (TLObject) this.f1207e, (TLRPC.InputPeer) this.f1208f, this.f1205b, (int[]) this.f1206c);
    }

    private final void g() {
        int i7;
        int i10;
        au0 au0Var = (au0) this.f1206c;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) this.d;
        gj gjVar = (gj) this.f1207e;
        org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) this.f1208f;
        int[] iArr = au0Var.f33577e;
        RLottieNative[] rLottieNativeArr = au0Var.f33066g1;
        if (au0Var.X0) {
            org.telegram.messenger.g0.h3(new yt0(au0Var, 2));
            return;
        }
        boolean z10 = false;
        int i11 = 0;
        while (true) {
            int length = rLottieNativeArr.length;
            i7 = this.f1205b;
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
                    w7.G(m10.f24934t0);
                    String y22 = org.telegram.messenger.g0.y2(w7.J(document, null, true, true), 0);
                    if (TextUtils.isEmpty(y22)) {
                        org.telegram.messenger.g0.h3(new zt0(document, i7, gjVar, q1Var, tL_messages_stickerSet, 1));
                        z10 = true;
                    } else {
                        rLottieNativeArr[i11] = RLottieNative.b(y22, iArr, null, null);
                        au0Var.f33067h1[i11] = iArr[0];
                    }
                }
            }
            i11++;
        }
        if (z10) {
            org.telegram.messenger.g0.h3(new yt0(au0Var, 3));
        } else {
            org.telegram.messenger.g0.h3(new org.telegram.ui.f0(au0Var, i7, q1Var, 23));
        }
    }

    private final void h() {
        boolean z10;
        boolean z11;
        LaunchActivity launchActivity = (LaunchActivity) this.f1206c;
        TLObject tLObject = (TLObject) this.d;
        Uri uri = (Uri) this.f1207e;
        org.telegram.ui.ActionBar.t1 t1Var = (org.telegram.ui.ActionBar.t1) this.f1208f;
        String str = LaunchActivity.C1;
        if (!launchActivity.isFinishing()) {
            if (tLObject != null && launchActivity.f42649p0 != null) {
                TLRPC.TL_messages_historyImportParsed tL_messages_historyImportParsed = (TLRPC.TL_messages_historyImportParsed) tLObject;
                Bundle k10 = a8.p0.k("onlySelect", true);
                k10.putString("importTitle", tL_messages_historyImportParsed.title);
                k10.putBoolean("allowSwitchAccount", true);
                if (tL_messages_historyImportParsed.pm) {
                    k10.putInt("dialogsType", 12);
                } else if (tL_messages_historyImportParsed.group) {
                    k10.putInt("dialogsType", 11);
                } else {
                    String uri2 = uri.toString();
                    int i7 = this.f1205b;
                    Iterator it = np.s1(i7).Y3.iterator();
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
                        Iterator it2 = np.s1(i7).X3.iterator();
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
                if (SecretMediaViewer.g() && SecretMediaViewer.f().f43308s) {
                    SecretMediaViewer.f().e(false, false);
                } else if (PhotoViewer.A1() && PhotoViewer.p1().P1()) {
                    PhotoViewer.p1().z0(false, true);
                } else if (g4.G() && g4.v().W) {
                    g4.v().m(false, true);
                }
                sa.w();
                c40 c40Var = c40.C5;
                if (c40Var != null) {
                    c40Var.dismiss();
                }
                if (org.telegram.messenger.g0.Q1()) {
                    launchActivity.f42649p0.X(true, true);
                    launchActivity.f42653r0.X(true, true);
                }
                yw ywVar = new yw(k10);
                ywVar.E2 = launchActivity;
                if (!org.telegram.messenger.g0.Q1() ? !(launchActivity.f42649p0.getFragmentStack().size() <= 1 || !(launchActivity.f42649p0.getFragmentStack().get(launchActivity.f42649p0.getFragmentStack().size() - 1) instanceof je0)) : !(launchActivity.f42651q0.getFragmentStack().isEmpty() || !(launchActivity.f42651q0.getFragmentStack().get(launchActivity.f42651q0.getFragmentStack().size() - 1) instanceof je0))) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                ((ActionBarLayout) launchActivity.M()).V(ywVar, z11, false);
            } else {
                if (launchActivity.X == null) {
                    launchActivity.X = new ArrayList();
                }
                launchActivity.X.add(0, launchActivity.Y);
                launchActivity.Y = null;
                launchActivity.j0(true);
            }
            try {
                t1Var.dismiss();
            } catch (Exception e10) {
                a8.g(e10, true);
            }
        }
    }

    private final void i() {
        LaunchActivity launchActivity = (LaunchActivity) this.f1206c;
        g50 g50Var = (g50) this.d;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f1207e;
        TLRPC.Updates updates = (TLRPC.Updates) this.f1208f;
        ArrayList arrayList = launchActivity.f42630e0;
        if (!launchActivity.isFinishing()) {
            try {
                g50Var.run();
            } catch (Exception e10) {
                a8.g(e10, true);
            }
            if (tL_error == null) {
                if (launchActivity.f42649p0 != null && updates != null && !updates.chats.isEmpty()) {
                    TLRPC.Chat chat = updates.chats.get(0);
                    chat.left = false;
                    chat.kicked = false;
                    int i7 = this.f1205b;
                    np.s1(i7).Y3(updates.users, false);
                    np.s1(i7).S3(updates.chats, false);
                    Bundle bundle = new Bundle();
                    bundle.putLong("chat_id", chat.f28051id);
                    if (arrayList.isEmpty() || np.s1(i7).E(bundle, (org.telegram.ui.ActionBar.e2) i5.c.h(1, arrayList), null, null)) {
                        an anVar = new an(bundle);
                        ns.f(i7).k(ns.f25572t, new Object[0]);
                        ((ActionBarLayout) launchActivity.M()).V(anVar, false, true);
                        return;
                    }
                    return;
                }
                return;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(launchActivity);
            String M0 = hd.M0(2131689472, null);
            org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28392a;
            t1Var.S = M0;
            if (tL_error.text.startsWith("FLOOD_WAIT")) {
                t1Var.U = hd.M0(2131750687, null);
            } else if (tL_error.text.equals("USERS_TOO_MUCH")) {
                t1Var.U = hd.M0(2131749076, null);
            } else {
                t1Var.U = hd.M0(2131749075, null);
            }
            alertDialog$Builder.k(hd.M0(2131747831, null), null);
            launchActivity.F0(alertDialog$Builder);
        }
    }

    private final void j() {
        cc a02;
        ArrayList<TLRPC.User> arrayList;
        ArrayList<TLRPC.Chat> arrayList2;
        TLObject tLObject = (TLObject) this.d;
        String str = (String) this.f1207e;
        g50 g50Var = (g50) this.f1208f;
        org.telegram.ui.ActionBar.e2 e2Var = (org.telegram.ui.ActionBar.e2) i5.c.h(1, ((LaunchActivity) this.f1206c).f42630e0);
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
                int i7 = this.f1205b;
                int i10 = 0;
                np.s1(i7).S3(arrayList2, false);
                np.s1(i7).Y3(arrayList, false);
                if (z10 && ((TL_chatlists.TL_chatlists_chatlistInvite) chatlist_chatlistinvite).peers.isEmpty()) {
                    a02 = cc.a0(e2Var);
                } else {
                    ?? jaVar = new ja(e2Var, false);
                    jaVar.U1 = -1;
                    jaVar.Y1 = "";
                    jaVar.Z1 = new ArrayList();
                    jaVar.f42498b2 = "";
                    jaVar.d2 = new ArrayList();
                    ArrayList arrayList3 = new ArrayList();
                    jaVar.f42500e2 = arrayList3;
                    jaVar.f42517v2 = -1;
                    jaVar.f42520y2 = -5;
                    jaVar.T1 = str;
                    jaVar.V1 = chatlist_chatlistinvite;
                    arrayList3.clear();
                    if (z10) {
                        TL_chatlists.TL_chatlists_chatlistInvite tL_chatlists_chatlistInvite2 = (TL_chatlists.TL_chatlists_chatlistInvite) chatlist_chatlistinvite;
                        TLRPC.TL_textWithEntities tL_textWithEntities = tL_chatlists_chatlistInvite2.title;
                        jaVar.Y1 = tL_textWithEntities.text;
                        jaVar.Z1 = tL_textWithEntities.entities;
                        jaVar.f42497a2 = tL_chatlists_chatlistInvite2.title_noanimate;
                        jaVar.f42499c2 = tL_chatlists_chatlistInvite2.peers;
                    } else if (chatlist_chatlistinvite instanceof TL_chatlists.TL_chatlists_chatlistInviteAlready) {
                        TL_chatlists.TL_chatlists_chatlistInviteAlready tL_chatlists_chatlistInviteAlready2 = (TL_chatlists.TL_chatlists_chatlistInviteAlready) chatlist_chatlistinvite;
                        jaVar.f42499c2 = tL_chatlists_chatlistInviteAlready2.missing_peers;
                        jaVar.f42501f2 = tL_chatlists_chatlistInviteAlready2.already_peers;
                        jaVar.U1 = tL_chatlists_chatlistInviteAlready2.filter_id;
                        ArrayList arrayList4 = e2Var.getMessagesController().Q0;
                        if (arrayList4 != null) {
                            while (true) {
                                if (i10 >= arrayList4.size()) {
                                    break;
                                }
                                so soVar = (so) arrayList4.get(i10);
                                if (soVar.f26542a == jaVar.U1) {
                                    jaVar.Y1 = soVar.f26543b;
                                    jaVar.Z1 = soVar.f26544c;
                                    jaVar.f42497a2 = soVar.f26553n;
                                    break;
                                }
                                i10++;
                            }
                        }
                    }
                    jaVar.f1();
                    e2Var.showDialog(jaVar);
                    g50Var.run();
                    return;
                }
            } else {
                a02 = cc.a0(e2Var);
            }
            g50Var.run();
            return;
        } catch (Exception e10) {
            a8.g(e10, true);
            return;
        }
        k5.o(null, 2131748209, a02, null);
    }

    private final void k() {
        ((q90) this.f1206c).v((String) this.d, this.f1205b + 1, (String) this.f1207e, (String) this.f1208f);
    }

    private final void l() {
        kd0 kd0Var = (kd0) this.f1206c;
        String str = (String) this.d;
        String str2 = (String) this.f1207e;
        String str3 = (String) this.f1208f;
        ArrayList arrayList = new ArrayList();
        f5.a aVar = new f5.a();
        aVar.f10926c = "inapp";
        aVar.f10925b = str;
        arrayList.add(aVar.a());
        a8.b("LoginBilling querying \"" + str + "\" product");
        org.telegram.messenger.r1.i().o(arrayList, new b3(kd0Var, str, str2, str3, this.f1205b));
    }

    private final void m() {
        t8 t8Var = (t8) this.d;
        TLRPC.User user = (TLRPC.User) this.f1207e;
        ((int[]) this.f1206c)[0] = this.f1205b;
        t8Var.r(user);
        ((i9) this.f1208f).f(user, t8Var);
    }

    private final void n() {
        Object obj;
        p4.m0 m0Var = (p4.m0) this.f1206c;
        p4.i1 i1Var = (p4.i1) this.d;
        q4.r rVar = (q4.r) this.f1207e;
        p4.l0 l0Var = (p4.l0) this.f1208f;
        ab.c0 c0Var = m0Var.f54781g;
        if (!m0Var.h.j()) {
            boolean isActive = ((q4.l) m0Var.f54787n.f55252b).f55234a.isActive();
            int i7 = this.f1205b;
            if (!isActive) {
                StringBuilder sb2 = new StringBuilder("Ignore incoming session command before initialization. command=");
                if (i1Var == null) {
                    obj = Integer.valueOf(i7);
                } else {
                    obj = i1Var.f54726b;
                }
                sb2.append(obj);
                sb2.append(", pid=");
                sb2.append(rVar.f55254a.f55256b);
                h2.a.l("MediaSessionLegacyStub", sb2.toString());
                return;
            }
            p4.v m0 = m0Var.m0(rVar);
            if (i1Var != null) {
                if (!c0Var.C(m0, i1Var)) {
                    return;
                }
            } else if (!c0Var.A(m0, i7)) {
                return;
            }
            try {
                l0Var.f(m0);
            } catch (RemoteException e10) {
                h2.a.m("MediaSessionLegacyStub", "Exception in " + m0, e10);
            }
        }
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: ai.f1.run():void");
    }

    public f1(Object obj, int i7, Object obj2, Object obj3, Object obj4, int i10) {
        this.f1204a = i10;
        this.f1206c = obj;
        this.f1205b = i7;
        this.d = obj2;
        this.f1207e = obj3;
        this.f1208f = obj4;
    }

    public f1(Object obj, Object obj2, int i7, Object obj3, Object obj4, int i10) {
        this.f1204a = i10;
        this.f1206c = obj;
        this.d = obj2;
        this.f1205b = i7;
        this.f1207e = obj3;
        this.f1208f = obj4;
    }

    public f1(Object obj, Object obj2, Object obj3, int i7, Object obj4, int i10) {
        this.f1204a = i10;
        this.f1206c = obj;
        this.d = obj2;
        this.f1207e = obj3;
        this.f1205b = i7;
        this.f1208f = obj4;
    }

    public f1(Object obj, Object obj2, Object obj3, Object obj4, int i7, int i10) {
        this.f1204a = i10;
        this.f1206c = obj;
        this.d = obj2;
        this.f1207e = obj3;
        this.f1208f = obj4;
        this.f1205b = i7;
    }

    public f1(rr rrVar, TLObject tLObject, TLRPC.InputPeer inputPeer, int i7, int[] iArr) {
        this.f1204a = 18;
        this.d = rrVar;
        this.f1207e = tLObject;
        this.f1208f = inputPeer;
        this.f1205b = i7;
        this.f1206c = iArr;
    }

    public f1(org.telegram.ui.ActionBar.t1[] t1VarArr, int[] iArr, int i7, Runnable runnable, org.telegram.ui.ActionBar.e2 e2Var) {
        this.f1204a = 17;
        this.d = t1VarArr;
        this.f1206c = iArr;
        this.f1205b = i7;
        this.f1207e = runnable;
        this.f1208f = e2Var;
    }
}
