package bi;

import android.content.ContextWrapper;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import org.telegram.messenger.c20;
import org.telegram.messenger.ij;
import org.telegram.messenger.p10;
import org.telegram.messenger.qp;
import org.telegram.messenger.qs;
import org.telegram.messenger.vo;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_chatlists;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.RLottieNative;
import org.telegram.ui.Components.au0;
import org.telegram.ui.Components.yt0;
import org.telegram.ui.Components.zt0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.SecretMediaViewer;
import org.telegram.ui.cn;
import org.telegram.ui.f10;
import org.telegram.ui.f40;
import org.telegram.ui.me0;
import org.telegram.ui.mn0;
import org.telegram.ui.mo0;
import org.telegram.ui.od0;
import org.telegram.ui.s90;
import org.telegram.ui.zw;
public final class ub implements Runnable {
    public final int f4837a;
    public final int f4838b;
    public final Object f4839c;
    public final Object d;
    public final Object f4840e;
    public final Object f4841f;

    public ub(int i7, TLRPC.Chat chat, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3) {
        this.f4837a = 13;
        this.f4838b = i7;
        this.f4839c = chat;
        this.d = arrayList;
        this.f4840e = arrayList2;
        this.f4841f = arrayList3;
    }

    private final void a() {
        int i7;
        int i10;
        au0 au0Var = (au0) this.f4839c;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) this.d;
        ij ijVar = (ij) this.f4840e;
        org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) this.f4841f;
        int[] iArr = au0Var.f40968e;
        RLottieNative[] rLottieNativeArr = au0Var.f32001f1;
        if (au0Var.W0) {
            org.telegram.messenger.g0.h3(new yt0(au0Var, 2));
            return;
        }
        boolean z9 = false;
        int i11 = 0;
        while (true) {
            int length = rLottieNativeArr.length;
            i7 = this.f4838b;
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
                    org.telegram.messenger.w7.G(p10.f24474s0);
                    String y22 = org.telegram.messenger.g0.y2(org.telegram.messenger.w7.J(document, null, true, true), 0);
                    if (TextUtils.isEmpty(y22)) {
                        org.telegram.messenger.g0.h3(new zt0(document, i7, ijVar, q1Var, tL_messages_stickerSet, 1));
                        z9 = true;
                    } else {
                        rLottieNativeArr[i11] = RLottieNative.b(y22, iArr, null, null);
                        au0Var.f32002g1[i11] = iArr[0];
                    }
                }
            }
            i11++;
        }
        if (z9) {
            org.telegram.messenger.g0.h3(new yt0(au0Var, 3));
        } else {
            org.telegram.messenger.g0.h3(new org.telegram.ui.q8(au0Var, i7, q1Var, 20));
        }
    }

    private final void b() {
        boolean z9;
        boolean z10;
        LaunchActivity launchActivity = (LaunchActivity) this.f4839c;
        TLObject tLObject = (TLObject) this.f4840e;
        Uri uri = (Uri) this.d;
        org.telegram.ui.ActionBar.u1 u1Var = (org.telegram.ui.ActionBar.u1) this.f4841f;
        String str = LaunchActivity.B1;
        if (!launchActivity.isFinishing()) {
            if (tLObject != null && launchActivity.f41277o0 != null) {
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
                    int i7 = this.f4838b;
                    Iterator it = qp.s1(i7).X3.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (uri2.contains((String) it.next())) {
                                k10.putInt("dialogsType", 12);
                                z9 = true;
                                break;
                            }
                        } else {
                            z9 = false;
                            break;
                        }
                    }
                    if (!z9) {
                        Iterator it2 = qp.s1(i7).W3.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                break;
                            } else if (uri2.contains((String) it2.next())) {
                                k10.putInt("dialogsType", 11);
                                z9 = true;
                                break;
                            }
                        }
                        if (!z9) {
                            k10.putInt("dialogsType", 13);
                        }
                    }
                }
                if (SecretMediaViewer.g() && SecretMediaViewer.f().f41935s) {
                    SecretMediaViewer.f().e(false, false);
                } else if (PhotoViewer.A1() && PhotoViewer.p1().P1()) {
                    PhotoViewer.p1().z0(false, true);
                } else if (org.telegram.ui.g4.G() && org.telegram.ui.g4.v().V) {
                    org.telegram.ui.g4.v().m(false, true);
                }
                fi.va.w();
                f40 f40Var = f40.f45501x5;
                if (f40Var != null) {
                    f40Var.dismiss();
                }
                if (org.telegram.messenger.g0.Q1()) {
                    launchActivity.f41277o0.X(true, true);
                    launchActivity.f41281q0.X(true, true);
                }
                zw zwVar = new zw(k10);
                zwVar.D2 = launchActivity;
                if (!org.telegram.messenger.g0.Q1() ? !(launchActivity.f41277o0.getFragmentStack().size() <= 1 || !(launchActivity.f41277o0.getFragmentStack().get(launchActivity.f41277o0.getFragmentStack().size() - 1) instanceof me0)) : !(launchActivity.f41279p0.getFragmentStack().isEmpty() || !(launchActivity.f41279p0.getFragmentStack().get(launchActivity.f41279p0.getFragmentStack().size() - 1) instanceof me0))) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                ((ActionBarLayout) launchActivity.M()).V(zwVar, z10, false);
            } else {
                if (launchActivity.W == null) {
                    launchActivity.W = new ArrayList();
                }
                launchActivity.W.add(0, launchActivity.X);
                launchActivity.X = null;
                launchActivity.j0(true);
            }
            try {
                u1Var.dismiss();
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        }
    }

    private final void c() {
        LaunchActivity launchActivity = (LaunchActivity) this.f4839c;
        f10 f10Var = (f10) this.d;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f4840e;
        TLRPC.Updates updates = (TLRPC.Updates) this.f4841f;
        ArrayList arrayList = launchActivity.f41258d0;
        if (!launchActivity.isFinishing()) {
            try {
                f10Var.run();
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
            if (tL_error == null) {
                if (launchActivity.f41277o0 != null && updates != null && !updates.chats.isEmpty()) {
                    TLRPC.Chat chat = updates.chats.get(0);
                    chat.left = false;
                    chat.kicked = false;
                    int i7 = this.f4838b;
                    qp.s1(i7).Y3(updates.users, false);
                    qp.s1(i7).S3(updates.chats, false);
                    Bundle bundle = new Bundle();
                    bundle.putLong("chat_id", chat.f26960id);
                    if (arrayList.isEmpty() || qp.s1(i7).E(bundle, (org.telegram.ui.ActionBar.f2) jg.g.i(1, arrayList), null, null)) {
                        cn cnVar = new cn(bundle);
                        qs.f(i7).k(qs.f25080t, new Object[0]);
                        ((ActionBarLayout) launchActivity.M()).V(cnVar, false, true);
                        return;
                    }
                    return;
                }
                return;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(launchActivity);
            String M0 = org.telegram.messenger.id.M0(2131689472, null);
            org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27300a;
            u1Var.R = M0;
            if (tL_error.text.startsWith("FLOOD_WAIT")) {
                u1Var.T = org.telegram.messenger.id.M0(2131750687, null);
            } else if (tL_error.text.equals("USERS_TOO_MUCH")) {
                u1Var.T = org.telegram.messenger.id.M0(2131749076, null);
            } else {
                u1Var.T = org.telegram.messenger.id.M0(2131749075, null);
            }
            alertDialog$Builder.k(org.telegram.messenger.id.M0(2131747831, null), null);
            launchActivity.F0(alertDialog$Builder);
        }
    }

    private final void d() {
        org.telegram.ui.Components.gc a02;
        ArrayList<TLRPC.User> arrayList;
        ArrayList<TLRPC.Chat> arrayList2;
        TLObject tLObject = (TLObject) this.f4840e;
        String str = (String) this.f4841f;
        f10 f10Var = (f10) this.d;
        org.telegram.ui.ActionBar.f2 f2Var = (org.telegram.ui.ActionBar.f2) jg.g.i(1, ((LaunchActivity) this.f4839c).f41258d0);
        try {
            if (tLObject instanceof TL_chatlists.chatlist_ChatlistInvite) {
                TL_chatlists.chatlist_ChatlistInvite chatlist_chatlistinvite = (TL_chatlists.chatlist_ChatlistInvite) tLObject;
                boolean z9 = chatlist_chatlistinvite instanceof TL_chatlists.TL_chatlists_chatlistInvite;
                if (z9) {
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
                int i7 = this.f4838b;
                int i10 = 0;
                qp.s1(i7).S3(arrayList2, false);
                qp.s1(i7).Y3(arrayList, false);
                if (z9 && ((TL_chatlists.TL_chatlists_chatlistInvite) chatlist_chatlistinvite).peers.isEmpty()) {
                    a02 = org.telegram.ui.Components.gc.a0(f2Var);
                } else {
                    ?? maVar = new org.telegram.ui.Components.ma(f2Var, false);
                    maVar.T1 = -1;
                    maVar.X1 = "";
                    maVar.Y1 = new ArrayList();
                    maVar.f39821a2 = "";
                    maVar.f39823c2 = new ArrayList();
                    ArrayList arrayList3 = new ArrayList();
                    maVar.d2 = arrayList3;
                    maVar.f39840u2 = -1;
                    maVar.f39843x2 = -5;
                    maVar.S1 = str;
                    maVar.U1 = chatlist_chatlistinvite;
                    arrayList3.clear();
                    if (z9) {
                        TL_chatlists.TL_chatlists_chatlistInvite tL_chatlists_chatlistInvite2 = (TL_chatlists.TL_chatlists_chatlistInvite) chatlist_chatlistinvite;
                        TLRPC.TL_textWithEntities tL_textWithEntities = tL_chatlists_chatlistInvite2.title;
                        maVar.X1 = tL_textWithEntities.text;
                        maVar.Y1 = tL_textWithEntities.entities;
                        maVar.Z1 = tL_chatlists_chatlistInvite2.title_noanimate;
                        maVar.f39822b2 = tL_chatlists_chatlistInvite2.peers;
                    } else if (chatlist_chatlistinvite instanceof TL_chatlists.TL_chatlists_chatlistInviteAlready) {
                        TL_chatlists.TL_chatlists_chatlistInviteAlready tL_chatlists_chatlistInviteAlready2 = (TL_chatlists.TL_chatlists_chatlistInviteAlready) chatlist_chatlistinvite;
                        maVar.f39822b2 = tL_chatlists_chatlistInviteAlready2.missing_peers;
                        maVar.f39824e2 = tL_chatlists_chatlistInviteAlready2.already_peers;
                        maVar.T1 = tL_chatlists_chatlistInviteAlready2.filter_id;
                        ArrayList arrayList4 = f2Var.getMessagesController().P0;
                        if (arrayList4 != null) {
                            while (true) {
                                if (i10 >= arrayList4.size()) {
                                    break;
                                }
                                vo voVar = (vo) arrayList4.get(i10);
                                if (voVar.f26074a == maVar.T1) {
                                    maVar.X1 = voVar.f26075b;
                                    maVar.Y1 = voVar.f26076c;
                                    maVar.Z1 = voVar.f26085n;
                                    break;
                                }
                                i10++;
                            }
                        }
                    }
                    maVar.f1();
                    f2Var.showDialog(maVar);
                    f10Var.run();
                    return;
                }
            } else {
                a02 = org.telegram.ui.Components.gc.a0(f2Var);
            }
            f10Var.run();
            return;
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
            return;
        }
        org.telegram.messenger.k5.p(null, 2131748209, a02, null);
    }

    private final void f() {
        ((s90) this.f4839c).v((String) this.f4841f, this.f4838b + 1, (String) this.d, (String) this.f4840e);
    }

    private final void g() {
        od0 od0Var = (od0) this.f4839c;
        String str = (String) this.f4841f;
        String str2 = (String) this.d;
        String str3 = (String) this.f4840e;
        ArrayList arrayList = new ArrayList();
        ?? obj = new Object();
        obj.f11118b = "inapp";
        obj.f11117a = str;
        arrayList.add(obj.a());
        org.telegram.messenger.a8.b("LoginBilling querying \"" + str + "\" product");
        org.telegram.messenger.r1.i().o(arrayList, new i6(od0Var, str, str2, str3, this.f4838b));
    }

    private final void h() {
        org.telegram.ui.Components.v8 v8Var = (org.telegram.ui.Components.v8) this.d;
        TLRPC.User user = (TLRPC.User) this.f4840e;
        ((int[]) this.f4839c)[0] = this.f4838b;
        v8Var.r(user);
        ((org.telegram.ui.Components.k9) this.f4841f).e(user, v8Var);
    }

    private final void i() {
        Object obj;
        p4.m0 m0Var = (p4.m0) this.f4839c;
        p4.i1 i1Var = (p4.i1) this.d;
        q4.r rVar = (q4.r) this.f4840e;
        p4.l0 l0Var = (p4.l0) this.f4841f;
        ui.e eVar = m0Var.f53375g;
        if (!m0Var.h.j()) {
            boolean isActive = ((q4.l) m0Var.f53381n.f53815b).f53797a.isActive();
            int i7 = this.f4838b;
            if (!isActive) {
                StringBuilder sb2 = new StringBuilder("Ignore incoming session command before initialization. command=");
                if (i1Var == null) {
                    obj = Integer.valueOf(i7);
                } else {
                    obj = i1Var.f53320b;
                }
                sb2.append(obj);
                sb2.append(", pid=");
                sb2.append(rVar.f53817a.f53819b);
                h2.a.l("MediaSessionLegacyStub", sb2.toString());
                return;
            }
            p4.v m0 = m0Var.m0(rVar);
            if (i1Var != null) {
                if (!eVar.I(m0, i1Var)) {
                    return;
                }
            } else if (!eVar.H(m0, i7)) {
                return;
            }
            try {
                l0Var.f(m0);
            } catch (RemoteException e10) {
                h2.a.m("MediaSessionLegacyStub", "Exception in " + m0, e10);
            }
        }
    }

    private final void j() {
        int i7;
        int i10;
        tg.c2 c2Var = (tg.c2) this.f4839c;
        int i11 = this.f4838b;
        List list = (List) this.d;
        ArrayList arrayList = (ArrayList) this.f4840e;
        mn0 mn0Var = (mn0) this.f4841f;
        if (c2Var.I != null && !c2Var.D) {
            Matrix matrix = new Matrix();
            matrix.postScale(1.0f / c2Var.I.getWidth(), 1.0f / c2Var.I.getHeight());
            matrix.postTranslate(-0.5f, -0.5f);
            matrix.postRotate(i11);
            matrix.postTranslate(0.5f, 0.5f);
            if ((i11 / 90) % 2 != 0) {
                matrix.postScale(c2Var.I.getHeight(), c2Var.I.getWidth());
            } else {
                matrix.postScale(c2Var.I.getWidth(), c2Var.I.getHeight());
            }
            if (list.isEmpty()) {
                tg.z1 z1Var = new tg.z1(c2Var);
                z1Var.h.set(0.0f, 0.0f, c2Var.I.getWidth(), c2Var.I.getHeight());
                z1Var.f56033i.set(z1Var.h);
                matrix.mapRect(z1Var.f56033i);
                z1Var.f56029c = i11;
                Bitmap d = c2Var.d(0, 0, c2Var.I, false);
                z1Var.d = d;
                if (d == null) {
                    org.telegram.messenger.a8.g(new RuntimeException("createSmoothEdgesSegmentedImage failed on empty image"), true);
                    return;
                }
                z1Var.f56031f = z1Var.c();
                tg.c2.c(z1Var, c2Var.T, c2Var.U);
                c2Var.O = z1Var.f56034j;
                c2Var.P = z1Var.f56035k;
                arrayList.add(z1Var);
                org.telegram.messenger.g0.h3(new mo0(c2Var, arrayList, mn0Var, z1Var, 27));
                c2Var.E = z1Var;
                c2Var.D = true;
                c2Var.f55626y = false;
                return;
            }
            for (int i12 = 0; i12 < list.size(); i12++) {
                tg.b2 b2Var = (tg.b2) list.get(i12);
                tg.z1 z1Var2 = new tg.z1(c2Var);
                z1Var2.h.set(b2Var.f55592b, b2Var.f55593c, i7 + b2Var.d, i10 + b2Var.f55594e);
                z1Var2.f56033i.set(z1Var2.h);
                matrix.mapRect(z1Var2.f56033i);
                z1Var2.f56029c = i11;
                Bitmap d2 = c2Var.d(b2Var.f55592b, b2Var.f55593c, b2Var.f55591a, false);
                z1Var2.d = d2;
                if (d2 != null) {
                    z1Var2.f56031f = z1Var2.c();
                    tg.c2.c(z1Var2, c2Var.T, c2Var.U);
                    c2Var.O = z1Var2.f56034j;
                    c2Var.P = z1Var2.f56035k;
                    arrayList.add(z1Var2);
                }
            }
            c2Var.E = null;
            c2Var.D = true;
            c2Var.f55626y = false;
            org.telegram.messenger.g0.h3(new org.telegram.ui.web.s(23, c2Var, arrayList));
        }
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: bi.ub.run():void");
    }

    public ub(ContextWrapper contextWrapper, TLObject tLObject, int i7, String str, Object obj, int i10) {
        this.f4837a = i10;
        this.f4839c = contextWrapper;
        this.f4840e = tLObject;
        this.f4838b = i7;
        this.f4841f = str;
        this.d = obj;
    }

    public ub(Object obj, int i7, Object obj2, Object obj3, Object obj4, int i10) {
        this.f4837a = i10;
        this.f4839c = obj;
        this.f4838b = i7;
        this.d = obj2;
        this.f4840e = obj3;
        this.f4841f = obj4;
    }

    public ub(Object obj, Object obj2, int i7, Object obj3, Object obj4, int i10) {
        this.f4837a = i10;
        this.f4839c = obj;
        this.d = obj2;
        this.f4838b = i7;
        this.f4840e = obj3;
        this.f4841f = obj4;
    }

    public ub(Object obj, Object obj2, Object obj3, int i7, org.telegram.ui.ActionBar.f2 f2Var, int i10) {
        this.f4837a = i10;
        this.f4839c = obj;
        this.d = obj2;
        this.f4840e = obj3;
        this.f4838b = i7;
        this.f4841f = f2Var;
    }

    public ub(Object obj, Object obj2, Object obj3, Object obj4, int i7, int i10) {
        this.f4837a = i10;
        this.f4839c = obj;
        this.d = obj2;
        this.f4840e = obj3;
        this.f4841f = obj4;
        this.f4838b = i7;
    }

    public ub(Object obj, String str, String str2, String str3, int i7, int i10) {
        this.f4837a = i10;
        this.f4839c = obj;
        this.f4841f = str;
        this.d = str2;
        this.f4840e = str3;
        this.f4838b = i7;
    }

    public ub(Object obj, TLObject tLObject, Object obj2, int i7, Object obj3, int i10) {
        this.f4837a = i10;
        this.f4839c = obj;
        this.f4840e = tLObject;
        this.d = obj2;
        this.f4838b = i7;
        this.f4841f = obj3;
    }

    public ub(jg.c cVar, Locale locale, String str, Locale locale2, int i7) {
        this.f4837a = 3;
        this.f4839c = cVar;
        this.d = locale;
        this.f4841f = str;
        this.f4840e = locale2;
        this.f4838b = i7;
    }

    public ub(TLObject tLObject, int i7, HashSet hashSet, TLRPC.TL_error tL_error, org.telegram.ui.ActionBar.f2 f2Var) {
        this.f4837a = 9;
        this.f4840e = tLObject;
        this.f4838b = i7;
        this.f4839c = hashSet;
        this.d = tL_error;
        this.f4841f = f2Var;
    }

    public ub(TLObject tLObject, boolean[] zArr, c20 c20Var, int i7, TL_account.updateEmojiStatus updateemojistatus) {
        this.f4837a = 2;
        this.f4840e = tLObject;
        this.f4839c = zArr;
        this.d = c20Var;
        this.f4838b = i7;
        this.f4841f = updateemojistatus;
    }
}
