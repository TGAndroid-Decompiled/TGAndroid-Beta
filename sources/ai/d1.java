package ai;

import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Base64;
import bi.o5;
import hi.nb;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.messenger.a8;
import org.telegram.messenger.f3;
import org.telegram.messenger.fj;
import org.telegram.messenger.gd;
import org.telegram.messenger.i10;
import org.telegram.messenger.ks;
import org.telegram.messenger.mp;
import org.telegram.messenger.ro;
import org.telegram.messenger.tr;
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
import org.telegram.ui.Components.a9;
import org.telegram.ui.Components.iu0;
import org.telegram.ui.Components.ju0;
import org.telegram.ui.Components.kc;
import org.telegram.ui.Components.ku0;
import org.telegram.ui.Components.p9;
import org.telegram.ui.Components.ra;
import org.telegram.ui.Components.xr;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.SecretMediaViewer;
import org.telegram.ui.bn;
import org.telegram.ui.bx;
import org.telegram.ui.e40;
import org.telegram.ui.g4;
import org.telegram.ui.i50;
import org.telegram.ui.ld0;
import org.telegram.ui.le0;
import org.telegram.ui.r90;
public final class d1 implements Runnable {
    public final int f1161a;
    public final int f1162b;
    public final Object f1163c;
    public final Object d;
    public final Object f1164e;
    public final Object f1165f;

    public d1(int i7, Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f1161a = i10;
        this.f1162b = i7;
        this.f1163c = obj;
        this.d = obj2;
        this.f1164e = obj3;
        this.f1165f = obj4;
    }

    private final void a() {
        TLObject tLObject = (TLObject) this.f1163c;
        HashSet hashSet = (HashSet) this.d;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f1164e;
        org.telegram.ui.ActionBar.g2 g2Var = (org.telegram.ui.ActionBar.g2) this.f1165f;
        boolean z10 = tLObject instanceof TLRPC.Updates;
        int i7 = this.f1162b;
        if (z10) {
            TLRPC.Updates updates = (TLRPC.Updates) tLObject;
            mp.u1(i7).f4(updates.users, false);
            mp.u1(i7).Z3(updates.chats, false);
            ArrayList B0 = mp.B0(updates, TL_update.TL_updateGroupCall.class);
            int size = B0.size();
            TLRPC.GroupCall groupCall = null;
            int i10 = 0;
            while (i10 < size) {
                Object obj = B0.get(i10);
                i10++;
                groupCall = ((TL_update.TL_updateGroupCall) obj).call;
            }
            if (LaunchActivity.H1 != null && groupCall != null) {
                TLRPC.TL_inputGroupCall tL_inputGroupCall = new TLRPC.TL_inputGroupCall();
                tL_inputGroupCall.f28509id = groupCall.f28502id;
                tL_inputGroupCall.access_hash = groupCall.access_hash;
                org.telegram.ui.Components.voip.c2.g(LaunchActivity.H1, i7, tL_inputGroupCall, false, groupCall, hashSet);
            }
        } else if (tLObject instanceof TL_phone.groupCall) {
            TL_phone.groupCall groupcall = (TL_phone.groupCall) tLObject;
            mp.u1(i7).f4(groupcall.users, false);
            mp.u1(i7).Z3(groupcall.chats, false);
            if (LaunchActivity.H1 != null) {
                TLRPC.TL_inputGroupCall tL_inputGroupCall2 = new TLRPC.TL_inputGroupCall();
                TLRPC.GroupCall groupCall2 = groupcall.call;
                tL_inputGroupCall2.f28509id = groupCall2.f28502id;
                tL_inputGroupCall2.access_hash = groupCall2.access_hash;
                org.telegram.ui.Components.voip.c2.g(LaunchActivity.H1, i7, tL_inputGroupCall2, false, groupCall2, hashSet);
            }
        } else if (tL_error != null) {
            kc.b0(g2Var).g0(tL_error, false);
        }
    }

    private final void b() {
        org.telegram.ui.ActionBar.g2 Q;
        TLRPC.Chat chat = (TLRPC.Chat) this.f1163c;
        ArrayList arrayList = (ArrayList) this.d;
        ArrayList arrayList2 = (ArrayList) this.f1164e;
        ArrayList arrayList3 = (ArrayList) this.f1165f;
        if (LaunchActivity.E1 && (Q = LaunchActivity.Q()) != null && Q.getParentActivity() != null) {
            ug.k0 k0Var = new ug.k0(11, this.f1162b, Q.getParentActivity(), Q, null);
            k0Var.D1(chat, arrayList, arrayList2, arrayList3, null);
            k0Var.show();
        }
    }

    private final void c() {
        TLRPC.TL_help_support tL_help_support = (TLRPC.TL_help_support) this.d;
        org.telegram.ui.ActionBar.t1 t1Var = (org.telegram.ui.ActionBar.t1) this.f1164e;
        org.telegram.ui.ActionBar.g2 g2Var = (org.telegram.ui.ActionBar.g2) this.f1165f;
        SharedPreferences.Editor edit = ((SharedPreferences) this.f1163c).edit();
        edit.putLong("support_id2", tL_help_support.user.f28641id);
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
        int i7 = this.f1162b;
        tr.a0(i7).m1(arrayList, null, true, true);
        mp.u1(i7).e4(tL_help_support.user, false, false);
        Bundle bundle = new Bundle();
        bundle.putLong("user_id", tL_help_support.user.f28641id);
        g2Var.presentFragment(new bn(bundle));
    }

    private final void d() {
        org.telegram.ui.ActionBar.t1[] t1VarArr = (org.telegram.ui.ActionBar.t1[]) this.d;
        int[] iArr = (int[]) this.f1163c;
        Runnable runnable = (Runnable) this.f1164e;
        org.telegram.ui.ActionBar.g2 g2Var = (org.telegram.ui.ActionBar.g2) this.f1165f;
        org.telegram.ui.ActionBar.t1 t1Var = t1VarArr[0];
        if (t1Var == null) {
            return;
        }
        t1Var.setOnCancelListener(new org.telegram.ui.Components.w1(iArr, this.f1162b, runnable));
        g2Var.showDialog(t1VarArr[0]);
    }

    private final void f() {
        xr.e1((xr) this.d, (TLObject) this.f1164e, (TLRPC.InputPeer) this.f1165f, this.f1162b, (int[]) this.f1163c);
    }

    private final void g() {
        int i7;
        int i10;
        ku0 ku0Var = (ku0) this.f1163c;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) this.d;
        fj fjVar = (fj) this.f1164e;
        org.telegram.ui.Cells.r1 r1Var = (org.telegram.ui.Cells.r1) this.f1165f;
        int[] iArr = ku0Var.f37805e;
        RLottieNative[] rLottieNativeArr = ku0Var.f36889g1;
        if (ku0Var.X0) {
            org.telegram.messenger.g0.g3(new iu0(ku0Var, 2));
            return;
        }
        boolean z10 = false;
        int i11 = 0;
        while (true) {
            int length = rLottieNativeArr.length;
            i7 = this.f1162b;
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
                    w7.G(i10.f24637t0);
                    String y22 = org.telegram.messenger.g0.y2(w7.J(document, null, true, true), 0);
                    if (TextUtils.isEmpty(y22)) {
                        org.telegram.messenger.g0.g3(new ju0(document, i7, fjVar, r1Var, tL_messages_stickerSet, 1));
                        z10 = true;
                    } else {
                        rLottieNativeArr[i11] = RLottieNative.b(y22, iArr, null, null);
                        ku0Var.f36890h1[i11] = iArr[0];
                    }
                }
            }
            i11++;
        }
        if (z10) {
            org.telegram.messenger.g0.g3(new iu0(ku0Var, 3));
        } else {
            org.telegram.messenger.g0.g3(new org.telegram.ui.f0(ku0Var, i7, r1Var, 23));
        }
    }

    private final void h() {
        boolean z10;
        boolean z11;
        LaunchActivity launchActivity = (LaunchActivity) this.f1163c;
        TLObject tLObject = (TLObject) this.d;
        Uri uri = (Uri) this.f1164e;
        org.telegram.ui.ActionBar.t1 t1Var = (org.telegram.ui.ActionBar.t1) this.f1165f;
        String str = LaunchActivity.C1;
        if (!launchActivity.isFinishing()) {
            if (tLObject != null && launchActivity.f43214p0 != null) {
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
                    int i7 = this.f1162b;
                    Iterator it = mp.u1(i7).f25693a4.iterator();
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
                        Iterator it2 = mp.u1(i7).Z3.iterator();
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
                if (SecretMediaViewer.g() && SecretMediaViewer.f().f43880s) {
                    SecretMediaViewer.f().e(false, false);
                } else if (PhotoViewer.A1() && PhotoViewer.p1().Q1()) {
                    PhotoViewer.p1().z0(false, true);
                } else if (g4.G() && g4.v().W) {
                    g4.v().m(false, true);
                }
                nb.w();
                e40 e40Var = e40.C5;
                if (e40Var != null) {
                    e40Var.dismiss();
                }
                if (org.telegram.messenger.g0.Q1()) {
                    launchActivity.f43214p0.X(true, true);
                    launchActivity.f43218r0.X(true, true);
                }
                bx bxVar = new bx(k10);
                bxVar.E2 = launchActivity;
                if (!org.telegram.messenger.g0.Q1() ? !(launchActivity.f43214p0.getFragmentStack().size() <= 1 || !(launchActivity.f43214p0.getFragmentStack().get(launchActivity.f43214p0.getFragmentStack().size() - 1) instanceof le0)) : !(launchActivity.f43216q0.getFragmentStack().isEmpty() || !(launchActivity.f43216q0.getFragmentStack().get(launchActivity.f43216q0.getFragmentStack().size() - 1) instanceof le0))) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                ((ActionBarLayout) launchActivity.M()).V(bxVar, z11, false);
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
        LaunchActivity launchActivity = (LaunchActivity) this.f1163c;
        i50 i50Var = (i50) this.d;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f1164e;
        TLRPC.Updates updates = (TLRPC.Updates) this.f1165f;
        ArrayList arrayList = launchActivity.f43195e0;
        if (!launchActivity.isFinishing()) {
            try {
                i50Var.run();
            } catch (Exception e10) {
                a8.g(e10, true);
            }
            if (tL_error == null) {
                if (launchActivity.f43214p0 != null && updates != null && !updates.chats.isEmpty()) {
                    TLRPC.Chat chat = updates.chats.get(0);
                    chat.left = false;
                    chat.kicked = false;
                    int i7 = this.f1162b;
                    mp.u1(i7).f4(updates.users, false);
                    mp.u1(i7).Z3(updates.chats, false);
                    Bundle bundle = new Bundle();
                    bundle.putLong("chat_id", chat.f28492id);
                    if (arrayList.isEmpty() || mp.u1(i7).E(bundle, (org.telegram.ui.ActionBar.g2) i5.c.h(1, arrayList), null, null)) {
                        bn bnVar = new bn(bundle);
                        ks.f(i7).k(ks.f25289t, new Object[0]);
                        ((ActionBarLayout) launchActivity.M()).V(bnVar, false, true);
                        return;
                    }
                    return;
                }
                return;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(launchActivity);
            String N0 = gd.N0(2131689472, null);
            org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28835a;
            t1Var.S = N0;
            if (tL_error.text.startsWith("FLOOD_WAIT")) {
                t1Var.U = gd.N0(2131750670, null);
            } else if (tL_error.text.equals("USERS_TOO_MUCH")) {
                t1Var.U = gd.N0(2131748883, null);
            } else {
                t1Var.U = gd.N0(2131748882, null);
            }
            alertDialog$Builder.k(gd.N0(2131747637, null), null);
            launchActivity.F0(alertDialog$Builder);
        }
    }

    private final void j() {
        kc b02;
        ArrayList<TLRPC.User> arrayList;
        ArrayList<TLRPC.Chat> arrayList2;
        TLObject tLObject = (TLObject) this.d;
        String str = (String) this.f1164e;
        i50 i50Var = (i50) this.f1165f;
        org.telegram.ui.ActionBar.g2 g2Var = (org.telegram.ui.ActionBar.g2) i5.c.h(1, ((LaunchActivity) this.f1163c).f43195e0);
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
                int i7 = this.f1162b;
                int i10 = 0;
                mp.u1(i7).Z3(arrayList2, false);
                mp.u1(i7).f4(arrayList, false);
                if (z10 && ((TL_chatlists.TL_chatlists_chatlistInvite) chatlist_chatlistinvite).peers.isEmpty()) {
                    b02 = kc.b0(g2Var);
                } else {
                    ?? raVar = new ra(g2Var, false);
                    raVar.U1 = -1;
                    raVar.Y1 = "";
                    raVar.Z1 = new ArrayList();
                    raVar.f35245b2 = "";
                    raVar.d2 = new ArrayList();
                    ArrayList arrayList3 = new ArrayList();
                    raVar.f35247e2 = arrayList3;
                    raVar.f35264v2 = -1;
                    raVar.f35267y2 = -5;
                    raVar.T1 = str;
                    raVar.V1 = chatlist_chatlistinvite;
                    arrayList3.clear();
                    if (z10) {
                        TL_chatlists.TL_chatlists_chatlistInvite tL_chatlists_chatlistInvite2 = (TL_chatlists.TL_chatlists_chatlistInvite) chatlist_chatlistinvite;
                        TLRPC.TL_textWithEntities tL_textWithEntities = tL_chatlists_chatlistInvite2.title;
                        raVar.Y1 = tL_textWithEntities.text;
                        raVar.Z1 = tL_textWithEntities.entities;
                        raVar.f35244a2 = tL_chatlists_chatlistInvite2.title_noanimate;
                        raVar.f35246c2 = tL_chatlists_chatlistInvite2.peers;
                    } else if (chatlist_chatlistinvite instanceof TL_chatlists.TL_chatlists_chatlistInviteAlready) {
                        TL_chatlists.TL_chatlists_chatlistInviteAlready tL_chatlists_chatlistInviteAlready2 = (TL_chatlists.TL_chatlists_chatlistInviteAlready) chatlist_chatlistinvite;
                        raVar.f35246c2 = tL_chatlists_chatlistInviteAlready2.missing_peers;
                        raVar.f35248f2 = tL_chatlists_chatlistInviteAlready2.already_peers;
                        raVar.U1 = tL_chatlists_chatlistInviteAlready2.filter_id;
                        ArrayList arrayList4 = g2Var.getMessagesController().Q0;
                        if (arrayList4 != null) {
                            while (true) {
                                if (i10 >= arrayList4.size()) {
                                    break;
                                }
                                ro roVar = (ro) arrayList4.get(i10);
                                if (roVar.f26773a == raVar.U1) {
                                    raVar.Y1 = roVar.f26774b;
                                    raVar.Z1 = roVar.f26775c;
                                    raVar.f35244a2 = roVar.f26784n;
                                    break;
                                }
                                i10++;
                            }
                        }
                    }
                    raVar.g1();
                    g2Var.showDialog(raVar);
                    i50Var.run();
                    return;
                }
            } else {
                b02 = kc.b0(g2Var);
            }
            i50Var.run();
            return;
        } catch (Exception e10) {
            a8.g(e10, true);
            return;
        }
        f3.o(null, 2131748016, b02, null);
    }

    private final void k() {
        ((r90) this.f1163c).v((String) this.d, this.f1162b + 1, (String) this.f1164e, (String) this.f1165f);
    }

    private final void l() {
        ld0 ld0Var = (ld0) this.f1163c;
        String str = (String) this.d;
        String str2 = (String) this.f1164e;
        String str3 = (String) this.f1165f;
        ArrayList arrayList = new ArrayList();
        f5.a aVar = new f5.a();
        aVar.f11239c = "inapp";
        aVar.f11238b = str;
        arrayList.add(aVar.a());
        a8.b("LoginBilling querying \"" + str + "\" product");
        org.telegram.messenger.r1.i().o(arrayList, new o5(ld0Var, str, str2, str3, this.f1162b));
    }

    private final void m() {
        a9 a9Var = (a9) this.d;
        TLRPC.User user = (TLRPC.User) this.f1164e;
        ((int[]) this.f1163c)[0] = this.f1162b;
        a9Var.r(user);
        ((p9) this.f1165f).f(user, a9Var);
    }

    private final void n() {
        Object obj;
        p4.n0 n0Var = (p4.n0) this.f1163c;
        p4.j1 j1Var = (p4.j1) this.d;
        q4.r rVar = (q4.r) this.f1164e;
        p4.m0 m0Var = (p4.m0) this.f1165f;
        ab.c0 c0Var = n0Var.f55481g;
        if (!n0Var.h.j()) {
            boolean isActive = ((q4.l) n0Var.f55487n.f55949b).f55931a.isActive();
            int i7 = this.f1162b;
            if (!isActive) {
                StringBuilder sb2 = new StringBuilder("Ignore incoming session command before initialization. command=");
                if (j1Var == null) {
                    obj = Integer.valueOf(i7);
                } else {
                    obj = j1Var.f55445b;
                }
                sb2.append(obj);
                sb2.append(", pid=");
                sb2.append(rVar.f55951a.f55953b);
                h2.a.l("MediaSessionLegacyStub", sb2.toString());
                return;
            }
            p4.v m0 = n0Var.m0(rVar);
            if (j1Var != null) {
                if (!c0Var.F(m0, j1Var)) {
                    return;
                }
            } else if (!c0Var.E(m0, i7)) {
                return;
            }
            try {
                m0Var.f(m0);
            } catch (RemoteException e10) {
                h2.a.m("MediaSessionLegacyStub", "Exception in " + m0, e10);
            }
        }
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: ai.d1.run():void");
    }

    public d1(Object obj, int i7, Object obj2, Object obj3, Object obj4, int i10) {
        this.f1161a = i10;
        this.f1163c = obj;
        this.f1162b = i7;
        this.d = obj2;
        this.f1164e = obj3;
        this.f1165f = obj4;
    }

    public d1(Object obj, Object obj2, int i7, Object obj3, Object obj4, int i10) {
        this.f1161a = i10;
        this.f1163c = obj;
        this.d = obj2;
        this.f1162b = i7;
        this.f1164e = obj3;
        this.f1165f = obj4;
    }

    public d1(Object obj, Object obj2, Object obj3, int i7, Object obj4, int i10) {
        this.f1161a = i10;
        this.f1163c = obj;
        this.d = obj2;
        this.f1164e = obj3;
        this.f1162b = i7;
        this.f1165f = obj4;
    }

    public d1(Object obj, Object obj2, Object obj3, Object obj4, int i7, int i10) {
        this.f1161a = i10;
        this.f1163c = obj;
        this.d = obj2;
        this.f1164e = obj3;
        this.f1165f = obj4;
        this.f1162b = i7;
    }

    public d1(xr xrVar, TLObject tLObject, TLRPC.InputPeer inputPeer, int i7, int[] iArr) {
        this.f1161a = 18;
        this.d = xrVar;
        this.f1164e = tLObject;
        this.f1165f = inputPeer;
        this.f1162b = i7;
        this.f1163c = iArr;
    }

    public d1(org.telegram.ui.ActionBar.t1[] t1VarArr, int[] iArr, int i7, Runnable runnable, org.telegram.ui.ActionBar.g2 g2Var) {
        this.f1161a = 17;
        this.d = t1VarArr;
        this.f1163c = iArr;
        this.f1162b = i7;
        this.f1164e = runnable;
        this.f1165f = g2Var;
    }
}
