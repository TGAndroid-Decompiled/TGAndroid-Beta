package i2;

import ag.g3;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Pair;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;
import jg.q2;
import jg.s2;
import jg.u2;
import jg.v2;
import org.telegram.messenger.ap;
import org.telegram.messenger.b8;
import org.telegram.messenger.bs;
import org.telegram.messenger.cd;
import org.telegram.messenger.d20;
import org.telegram.messenger.f8;
import org.telegram.messenger.h20;
import org.telegram.messenger.hs;
import org.telegram.messenger.jj;
import org.telegram.messenger.lr;
import org.telegram.messenger.m5;
import org.telegram.messenger.q20;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.messenger.vp;
import org.telegram.messenger.w3;
import org.telegram.messenger.zs;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_chatlists;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.k2;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.x1;
import org.telegram.ui.ActionBar.z2;
import org.telegram.ui.Components.RLottieNative;
import org.telegram.ui.Components.av0;
import org.telegram.ui.Components.bv0;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.cv0;
import org.telegram.ui.Components.g9;
import org.telegram.ui.Components.ha;
import org.telegram.ui.Components.ji0;
import org.telegram.ui.Components.r8;
import org.telegram.ui.Components.vr;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.SecretMediaViewer;
import org.telegram.ui.an;
import org.telegram.ui.ay;
import org.telegram.ui.b50;
import org.telegram.ui.bj;
import org.telegram.ui.f70;
import org.telegram.ui.fn;
import org.telegram.ui.h4;
import org.telegram.ui.mx;
import org.telegram.ui.pf0;
import org.telegram.ui.qm;
import org.telegram.ui.se0;
import org.telegram.ui.ua0;
import org.telegram.ui.un;
import org.telegram.ui.wo0;
import rh.e6;
import vh.o8;
public final class g1 implements Runnable {
    public final int f7866a;
    public final int f7867b;
    public final Object f7868c;
    public final Object d;
    public final Object e;
    public final Object f7869f;

    public g1(int i10, TLRPC.Chat chat, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3) {
        this.f7866a = 9;
        this.f7867b = i10;
        this.f7868c = chat;
        this.d = arrayList;
        this.e = arrayList2;
        this.f7869f = arrayList3;
    }

    @Override
    public final void run() {
        int i10;
        int i11;
        Object obj;
        Object obj2;
        String lowerCase;
        int i12;
        k2 Q;
        boolean z10;
        int i13;
        boolean z11;
        boolean z12;
        boolean z13;
        cc a02;
        ArrayList<TLRPC.User> arrayList;
        ArrayList<TLRPC.Chat> arrayList2;
        boolean z14;
        boolean z15;
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings;
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings2;
        boolean z16;
        long j10;
        final long j11;
        long j12;
        boolean z17;
        boolean z18;
        boolean z19;
        String str = "";
        boolean z20 = true;
        boolean z21 = false;
        switch (this.f7866a) {
            case 0:
                Pair pair = (Pair) this.d;
                ((i1) this.f7868c).f7937b.h.G(((Integer) pair.first).intValue(), (u2.g0) pair.second, (u2.u) this.e, (u2.c0) this.f7869f, this.f7867b);
                return;
            case 1:
                v2 v2Var = (v2) this.f7868c;
                int i14 = this.f7867b;
                List list = (List) this.d;
                ArrayList arrayList3 = (ArrayList) this.e;
                wo0 wo0Var = (wo0) this.f7869f;
                if (v2Var.I != null && !v2Var.D) {
                    Matrix matrix = new Matrix();
                    matrix.postScale(1.0f / v2Var.I.getWidth(), 1.0f / v2Var.I.getHeight());
                    matrix.postTranslate(-0.5f, -0.5f);
                    matrix.postRotate(i14);
                    matrix.postTranslate(0.5f, 0.5f);
                    if ((i14 / 90) % 2 != 0) {
                        matrix.postScale(v2Var.I.getHeight(), v2Var.I.getWidth());
                    } else {
                        matrix.postScale(v2Var.I.getWidth(), v2Var.I.getHeight());
                    }
                    if (list.isEmpty()) {
                        s2 s2Var = new s2(v2Var);
                        s2Var.h.set(0.0f, 0.0f, v2Var.I.getWidth(), v2Var.I.getHeight());
                        s2Var.f10218i.set(s2Var.h);
                        matrix.mapRect(s2Var.f10218i);
                        s2Var.f10215c = i14;
                        Bitmap d = v2Var.d(0, 0, v2Var.I, false);
                        s2Var.d = d;
                        if (d == null) {
                            f8.g(new RuntimeException("createSmoothEdgesSegmentedImage failed on empty image"), true);
                            return;
                        }
                        s2Var.f10216f = s2Var.c();
                        v2.c(s2Var, v2Var.T, v2Var.U);
                        v2Var.O = s2Var.f10219j;
                        v2Var.P = s2Var.f10220k;
                        arrayList3.add(s2Var);
                        org.telegram.messenger.i0.g3(new ag.q0(v2Var, arrayList3, wo0Var, s2Var, 5));
                        v2Var.E = s2Var;
                        v2Var.D = true;
                        v2Var.f10333y = false;
                        return;
                    }
                    for (int i15 = 0; i15 < list.size(); i15++) {
                        u2 u2Var = (u2) list.get(i15);
                        s2 s2Var2 = new s2(v2Var);
                        s2Var2.h.set(u2Var.f10296b, u2Var.f10297c, i10 + u2Var.d, i11 + u2Var.e);
                        s2Var2.f10218i.set(s2Var2.h);
                        matrix.mapRect(s2Var2.f10218i);
                        s2Var2.f10215c = i14;
                        Bitmap d10 = v2Var.d(u2Var.f10296b, u2Var.f10297c, u2Var.f10295a, false);
                        s2Var2.d = d10;
                        if (d10 != null) {
                            s2Var2.f10216f = s2Var2.c();
                            v2.c(s2Var2, v2Var.T, v2Var.U);
                            v2Var.O = s2Var2.f10219j;
                            v2Var.P = s2Var2.f10220k;
                            arrayList3.add(s2Var2);
                        }
                    }
                    v2Var.E = null;
                    v2Var.D = true;
                    v2Var.f10333y = false;
                    org.telegram.messenger.i0.g3(new d1.e(26, v2Var, arrayList3));
                    return;
                }
                return;
            case 2:
                m4.p0 p0Var = (m4.p0) this.f7868c;
                m4.p1 p1Var = (m4.p1) this.d;
                int i16 = this.f7867b;
                n4.r rVar = (n4.r) this.e;
                m4.o0 o0Var = (m4.o0) this.f7869f;
                xa.n nVar = p0Var.f12877g;
                if (!p0Var.h.j()) {
                    if (!((n4.l) p0Var.f12883n.f13526a).f13510a.isActive()) {
                        StringBuilder sb2 = new StringBuilder("Ignore incoming session command before initialization. command=");
                        if (p1Var == null) {
                            obj = Integer.valueOf(i16);
                        } else {
                            obj = p1Var.f12897b;
                        }
                        sb2.append(obj);
                        sb2.append(", pid=");
                        sb2.append(rVar.f13528a.f13530b);
                        e2.a.l("MediaSessionLegacyStub", sb2.toString());
                        return;
                    }
                    m4.w m0 = p0Var.m0(rVar);
                    if (p1Var != null) {
                        if (!nVar.O(m0, p1Var)) {
                            return;
                        }
                    } else if (!nVar.N(m0, i16)) {
                        return;
                    }
                    try {
                        o0Var.b(m0);
                        return;
                    } catch (RemoteException e) {
                        e2.a.m("MediaSessionLegacyStub", "Exception in " + m0, e);
                        return;
                    }
                }
                return;
            case 3:
                ((VoIPService) this.f7868c).lambda$startConferenceGroupCall$33((TLObject) this.d, this.f7867b, (String) this.e, (TLRPC.TL_error) this.f7869f);
                return;
            case 4:
                h4 h4Var = (h4) this.f7868c;
                ArrayList arrayList4 = (ArrayList) this.d;
                HashMap hashMap = (HashMap) this.e;
                String str2 = (String) this.f7869f;
                int i17 = this.f7867b;
                ArrayList arrayList5 = new ArrayList();
                int size = arrayList4.size();
                for (int i18 = 0; i18 < size; i18++) {
                    Object obj3 = arrayList4.get(i18);
                    TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) hashMap.get(obj3);
                    if (obj3 instanceof TL_iv.RichText) {
                        TL_iv.RichText richText = (TL_iv.RichText) obj3;
                        obj2 = obj3;
                        CharSequence A = h4.A(h4Var, h4Var.f37746u0[0].f39039c.E, null, richText, richText, pageBlock, 1000);
                        if (!TextUtils.isEmpty(A)) {
                            lowerCase = A.toString().toLowerCase();
                        }
                        lowerCase = null;
                    } else {
                        obj2 = obj3;
                        if (obj2 instanceof String) {
                            lowerCase = ((String) obj2).toLowerCase();
                        }
                        lowerCase = null;
                    }
                    if (lowerCase != null) {
                        int i19 = 0;
                        while (true) {
                            int indexOf = lowerCase.indexOf(str2, i19);
                            if (indexOf >= 0) {
                                int length = str2.length() + indexOf;
                                if (indexOf == 0 || org.telegram.messenger.i0.K1(lowerCase.charAt(indexOf - 1))) {
                                    ?? obj4 = new Object();
                                    obj4.f40847a = indexOf;
                                    obj4.f40849c = pageBlock;
                                    obj4.f40848b = obj2;
                                    arrayList5.add(obj4);
                                }
                                i19 = length;
                            }
                        }
                    }
                }
                org.telegram.messenger.i0.g3(new g3(h4Var, i17, arrayList5, str2, 9));
                return;
            case 5:
                TLObject tLObject = (TLObject) this.f7868c;
                int i20 = this.f7867b;
                HashSet hashSet = (HashSet) this.d;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.e;
                k2 k2Var = (k2) this.f7869f;
                if (tLObject instanceof TLRPC.Updates) {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                    vp.r1(i20).V3(updates.users, false);
                    vp.r1(i20).P3(updates.chats, false);
                    ArrayList z02 = vp.z0(updates, TL_update.TL_updateGroupCall.class);
                    int size2 = z02.size();
                    TLRPC.GroupCall groupCall = null;
                    int i21 = 0;
                    while (i21 < size2) {
                        Object obj5 = z02.get(i21);
                        i21++;
                        groupCall = ((TL_update.TL_updateGroupCall) obj5).call;
                    }
                    if (LaunchActivity.I1 != null && groupCall != null) {
                        TLRPC.TL_inputGroupCall tL_inputGroupCall = new TLRPC.TL_inputGroupCall();
                        tL_inputGroupCall.f19810id = groupCall.f19803id;
                        tL_inputGroupCall.access_hash = groupCall.access_hash;
                        org.telegram.ui.Components.voip.m1.g(LaunchActivity.I1, i20, tL_inputGroupCall, false, groupCall, hashSet);
                        return;
                    }
                    return;
                } else if (tLObject instanceof TL_phone.groupCall) {
                    TL_phone.groupCall groupcall = (TL_phone.groupCall) tLObject;
                    vp.r1(i20).V3(groupcall.users, false);
                    vp.r1(i20).P3(groupcall.chats, false);
                    if (LaunchActivity.I1 != null) {
                        TLRPC.TL_inputGroupCall tL_inputGroupCall2 = new TLRPC.TL_inputGroupCall();
                        TLRPC.GroupCall groupCall2 = groupcall.call;
                        tL_inputGroupCall2.f19810id = groupCall2.f19803id;
                        tL_inputGroupCall2.access_hash = groupCall2.access_hash;
                        org.telegram.ui.Components.voip.m1.g(LaunchActivity.I1, i20, tL_inputGroupCall2, false, groupCall2, hashSet);
                        return;
                    }
                    return;
                } else if (tL_error != null) {
                    cc.a0(k2Var).f0(tL_error, false);
                    return;
                } else {
                    return;
                }
            case 6:
                un.Q0((un) this.f7868c, this.f7867b, (Boolean) this.d, (TLRPC.WebPage) this.e, (TL_account.getWebPagePreview) this.f7869f);
                return;
            case 7:
                fn fnVar = (fn) this.f7868c;
                bj bjVar = (bj) this.d;
                bjVar.f7485b = fnVar.f37301a.getMessagesController().s0(-((TLRPC.Chat) this.e).f19793id, this.f7867b, new an(fnVar, bjVar, (un) this.f7869f));
                return;
            case 8:
                fn fnVar2 = (fn) this.f7868c;
                int i22 = this.f7867b;
                jj jjVar = (jj) this.d;
                Integer num = (Integer) this.e;
                byte[] bArr = (byte[]) this.f7869f;
                un unVar = fnVar2.f37301a;
                int f12 = jjVar.f1();
                if (jj.B0(jjVar.f16337k) == unVar.f42199b7) {
                    i12 = 1;
                } else {
                    i12 = 0;
                }
                unVar.nb(i22, f12, true, i12, true, 0, num, bArr, new qm(fnVar2, jjVar, 1));
                return;
            case 9:
                int i23 = this.f7867b;
                TLRPC.Chat chat = (TLRPC.Chat) this.f7868c;
                ArrayList arrayList6 = (ArrayList) this.d;
                ArrayList arrayList7 = (ArrayList) this.e;
                ArrayList arrayList8 = (ArrayList) this.f7869f;
                if (LaunchActivity.E1 && (Q = LaunchActivity.Q()) != null && Q.getParentActivity() != null) {
                    kg.q0 q0Var = new kg.q0(11, i23, Q.getParentActivity(), Q, null);
                    q0Var.C1(chat, arrayList6, arrayList7, arrayList8, null);
                    q0Var.show();
                    return;
                }
                return;
            case 10:
                TLRPC.TL_help_support tL_help_support = (TLRPC.TL_help_support) this.d;
                x1 x1Var = (x1) this.e;
                int i24 = this.f7867b;
                k2 k2Var2 = (k2) this.f7869f;
                SharedPreferences.Editor edit = ((SharedPreferences) this.f7868c).edit();
                edit.putLong("support_id2", tL_help_support.user.f19942id);
                SerializedData serializedData = new SerializedData();
                tL_help_support.user.serializeToStream(serializedData);
                edit.putString("support_user", Base64.encodeToString(serializedData.toByteArray(), 0));
                edit.commit();
                serializedData.cleanup();
                try {
                    x1Var.dismiss();
                    z10 = true;
                } catch (Exception e7) {
                    z10 = true;
                    f8.g(e7, true);
                }
                ArrayList arrayList9 = new ArrayList();
                arrayList9.add(tL_help_support.user);
                hs.a0(i24).m1(arrayList9, null, z10, z10);
                vp.r1(i24).U3(tL_help_support.user, false, false);
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", tL_help_support.user.f19942id);
                k2Var2.presentFragment(new un(bundle));
                return;
            case 11:
                x1[] x1VarArr = (x1[]) this.f7868c;
                int[] iArr = (int[]) this.d;
                int i25 = this.f7867b;
                Runnable runnable = (Runnable) this.e;
                k2 k2Var3 = (k2) this.f7869f;
                x1 x1Var2 = x1VarArr[0];
                if (x1Var2 != null) {
                    x1Var2.setOnCancelListener(new org.telegram.ui.Components.n1(iArr, i25, runnable));
                    k2Var3.showDialog(x1VarArr[0]);
                    return;
                }
                return;
            case 12:
                vr.d1((vr) this.f7868c, (TLObject) this.d, (TLRPC.InputPeer) this.e, this.f7867b, (int[]) this.f7869f);
                return;
            case 13:
                cv0 cv0Var = (cv0) this.f7868c;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) this.d;
                int i26 = this.f7867b;
                jj jjVar2 = (jj) this.e;
                org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) this.f7869f;
                int[] iArr2 = cv0Var.e;
                RLottieNative[] rLottieNativeArr = cv0Var.f25182f1;
                if (cv0Var.W0) {
                    org.telegram.messenger.i0.g3(new av0(cv0Var, 2));
                    return;
                }
                boolean z22 = false;
                for (int i27 = 0; i27 < rLottieNativeArr.length; i27++) {
                    if (rLottieNativeArr[i27] == null) {
                        if (i27 == 0) {
                            i13 = 1;
                        } else if (i27 == 1) {
                            i13 = 8;
                        } else if (i27 == 2) {
                            i13 = 14;
                        } else if (i27 == 3) {
                            i13 = 20;
                        } else {
                            i13 = 2;
                        }
                        if (i13 < tL_messages_stickerSet.documents.size()) {
                            TLRPC.Document document = tL_messages_stickerSet.documents.get(i13);
                            b8.G(d20.f15147s0);
                            String y22 = org.telegram.messenger.i0.y2(b8.K(document, null, true, true), 0);
                            if (TextUtils.isEmpty(y22)) {
                                org.telegram.messenger.i0.g3(new bv0(document, i26, jjVar2, q1Var, tL_messages_stickerSet, 1));
                                z22 = true;
                            } else {
                                rLottieNativeArr[i27] = RLottieNative.b(y22, iArr2, null, null);
                                cv0Var.f25183g1[i27] = iArr2[0];
                            }
                        }
                    }
                }
                if (z22) {
                    org.telegram.messenger.i0.g3(new av0(cv0Var, 3));
                    return;
                } else {
                    org.telegram.messenger.i0.g3(new ji0(cv0Var, i26, q1Var, 7));
                    return;
                }
            case 14:
                LaunchActivity launchActivity = (LaunchActivity) this.f7868c;
                TLObject tLObject2 = (TLObject) this.d;
                Uri uri = (Uri) this.e;
                int i28 = this.f7867b;
                x1 x1Var3 = (x1) this.f7869f;
                Pattern pattern = LaunchActivity.D1;
                if (!launchActivity.isFinishing()) {
                    if (tLObject2 != null && launchActivity.f33377q0 != null) {
                        TLRPC.TL_messages_historyImportParsed tL_messages_historyImportParsed = (TLRPC.TL_messages_historyImportParsed) tLObject2;
                        Bundle g10 = a1.g.g("onlySelect", true);
                        g10.putString("importTitle", tL_messages_historyImportParsed.title);
                        g10.putBoolean("allowSwitchAccount", true);
                        if (tL_messages_historyImportParsed.pm) {
                            g10.putInt("dialogsType", 12);
                        } else if (tL_messages_historyImportParsed.group) {
                            g10.putInt("dialogsType", 11);
                        } else {
                            String uri2 = uri.toString();
                            Iterator it = vp.r1(i28).Z3.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    if (uri2.contains((String) it.next())) {
                                        g10.putInt("dialogsType", 12);
                                        z12 = true;
                                    }
                                } else {
                                    z12 = false;
                                }
                            }
                            if (!z12) {
                                Iterator it2 = vp.r1(i28).Y3.iterator();
                                while (true) {
                                    if (it2.hasNext()) {
                                        if (uri2.contains((String) it2.next())) {
                                            g10.putInt("dialogsType", 11);
                                            z12 = true;
                                        }
                                    }
                                }
                                if (!z12) {
                                    g10.putInt("dialogsType", 13);
                                }
                            }
                        }
                        if (SecretMediaViewer.g() && SecretMediaViewer.f().f34016s) {
                            SecretMediaViewer.f().e(false, false);
                        } else if (PhotoViewer.F1() && PhotoViewer.v1().U1()) {
                            PhotoViewer.v1().H0(false, true);
                        } else if (h4.G() && h4.v().V) {
                            h4.v().m(false, true);
                        }
                        o8.w();
                        b50 b50Var = b50.f35989u5;
                        if (b50Var != null) {
                            b50Var.dismiss();
                        }
                        if (org.telegram.messenger.i0.Q1()) {
                            launchActivity.f33377q0.W(true, true);
                            launchActivity.f33381s0.W(true, true);
                        }
                        ay ayVar = new ay(g10);
                        ayVar.C2 = launchActivity;
                        if (!org.telegram.messenger.i0.Q1() ? !(launchActivity.f33377q0.getFragmentStack().size() <= 1 || !(launchActivity.f33377q0.getFragmentStack().get(launchActivity.f33377q0.getFragmentStack().size() - 1) instanceof pf0)) : !(launchActivity.f33379r0.getFragmentStack().isEmpty() || !(launchActivity.f33379r0.getFragmentStack().get(launchActivity.f33379r0.getFragmentStack().size() - 1) instanceof pf0))) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        ((ActionBarLayout) launchActivity.M()).U(ayVar, z13, false);
                        z11 = true;
                    } else {
                        if (launchActivity.W == null) {
                            launchActivity.W = new ArrayList();
                        }
                        launchActivity.W.add(0, launchActivity.X);
                        launchActivity.X = null;
                        z11 = true;
                        launchActivity.j0(true);
                    }
                    try {
                        x1Var3.dismiss();
                        return;
                    } catch (Exception e10) {
                        f8.g(e10, z11);
                        return;
                    }
                }
                return;
            case 15:
                LaunchActivity launchActivity2 = (LaunchActivity) this.f7868c;
                f70 f70Var = (f70) this.d;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.e;
                TLRPC.Updates updates2 = (TLRPC.Updates) this.f7869f;
                int i29 = this.f7867b;
                ArrayList arrayList10 = launchActivity2.f33353d0;
                if (!launchActivity2.isFinishing()) {
                    try {
                        f70Var.run();
                    } catch (Exception e11) {
                        f8.g(e11, true);
                    }
                    if (tL_error2 == null) {
                        if (launchActivity2.f33377q0 != null && updates2 != null && !updates2.chats.isEmpty()) {
                            TLRPC.Chat chat2 = updates2.chats.get(0);
                            chat2.left = false;
                            chat2.kicked = false;
                            vp.r1(i29).V3(updates2.users, false);
                            vp.r1(i29).P3(updates2.chats, false);
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("chat_id", chat2.f19793id);
                            if (arrayList10.isEmpty() || vp.r1(i29).E(bundle2, (k2) i0.a.g(1, arrayList10), null, null)) {
                                un unVar2 = new un(bundle2);
                                zs.f(i29).k(4, new Object[0]);
                                ((ActionBarLayout) launchActivity2.M()).U(unVar2, false, true);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(launchActivity2);
                    alertDialog$Builder.f20134a.R = cd.L0(2131689472, null);
                    if (tL_error2.text.startsWith("FLOOD_WAIT")) {
                        alertDialog$Builder.f20134a.T = cd.L0(2131750688, null);
                    } else if (tL_error2.text.equals("USERS_TOO_MUCH")) {
                        alertDialog$Builder.f20134a.T = cd.L0(2131749086, null);
                    } else {
                        alertDialog$Builder.f20134a.T = cd.L0(2131749085, null);
                    }
                    alertDialog$Builder.k(cd.L0(2131747847, null), null);
                    launchActivity2.F0(alertDialog$Builder);
                    return;
                }
                return;
            case 16:
                TLObject tLObject3 = (TLObject) this.d;
                int i30 = this.f7867b;
                String str3 = (String) this.e;
                f70 f70Var2 = (f70) this.f7869f;
                ?? r02 = (k2) i0.a.g(1, ((LaunchActivity) this.f7868c).f33353d0);
                try {
                    if (tLObject3 instanceof TL_chatlists.chatlist_ChatlistInvite) {
                        TL_chatlists.chatlist_ChatlistInvite chatlist_chatlistinvite = (TL_chatlists.chatlist_ChatlistInvite) tLObject3;
                        boolean z23 = chatlist_chatlistinvite instanceof TL_chatlists.TL_chatlists_chatlistInvite;
                        if (z23) {
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
                        vp.r1(i30).P3(arrayList2, false);
                        vp.r1(i30).V3(arrayList, false);
                        if (z23 && ((TL_chatlists.TL_chatlists_chatlistInvite) chatlist_chatlistinvite).peers.isEmpty()) {
                            a02 = cc.a0(r02);
                        } else {
                            ?? haVar = new ha(r02, false);
                            haVar.Q1 = -1;
                            haVar.U1 = "";
                            haVar.V1 = new ArrayList();
                            haVar.X1 = "";
                            haVar.Z1 = new ArrayList();
                            ArrayList arrayList11 = new ArrayList();
                            haVar.a2 = arrayList11;
                            haVar.f27180r2 = -1;
                            haVar.f27183u2 = -5;
                            haVar.P1 = str3;
                            haVar.R1 = chatlist_chatlistinvite;
                            arrayList11.clear();
                            if (z23) {
                                TL_chatlists.TL_chatlists_chatlistInvite tL_chatlists_chatlistInvite2 = (TL_chatlists.TL_chatlists_chatlistInvite) chatlist_chatlistinvite;
                                TLRPC.TL_textWithEntities tL_textWithEntities = tL_chatlists_chatlistInvite2.title;
                                haVar.U1 = tL_textWithEntities.text;
                                haVar.V1 = tL_textWithEntities.entities;
                                haVar.W1 = tL_chatlists_chatlistInvite2.title_noanimate;
                                haVar.Y1 = tL_chatlists_chatlistInvite2.peers;
                            } else if (chatlist_chatlistinvite instanceof TL_chatlists.TL_chatlists_chatlistInviteAlready) {
                                TL_chatlists.TL_chatlists_chatlistInviteAlready tL_chatlists_chatlistInviteAlready2 = (TL_chatlists.TL_chatlists_chatlistInviteAlready) chatlist_chatlistinvite;
                                haVar.Y1 = tL_chatlists_chatlistInviteAlready2.missing_peers;
                                haVar.f27164b2 = tL_chatlists_chatlistInviteAlready2.already_peers;
                                haVar.Q1 = tL_chatlists_chatlistInviteAlready2.filter_id;
                                ArrayList arrayList12 = r02.getMessagesController().P0;
                                if (arrayList12 != null) {
                                    int i31 = 0;
                                    while (true) {
                                        if (i31 < arrayList12.size()) {
                                            ap apVar = (ap) arrayList12.get(i31);
                                            if (apVar.f14645a == haVar.Q1) {
                                                haVar.U1 = apVar.f14646b;
                                                haVar.V1 = apVar.f14647c;
                                                haVar.W1 = apVar.f14655n;
                                            } else {
                                                i31++;
                                            }
                                        }
                                    }
                                }
                            }
                            haVar.f1();
                            r02.showDialog(haVar);
                            f70Var2.run();
                            return;
                        }
                    } else {
                        a02 = cc.a0(r02);
                    }
                    f70Var2.run();
                    return;
                } catch (Exception e12) {
                    f8.g(e12, true);
                    return;
                }
                m5.o(null, 2131748226, a02, null);
                break;
            case 17:
                ((ua0) this.f7868c).v((String) this.d, this.f7867b + 1, (String) this.e, (String) this.f7869f);
                return;
            case 18:
                se0 se0Var = (se0) this.f7868c;
                String str4 = (String) this.d;
                String str5 = (String) this.e;
                String str6 = (String) this.f7869f;
                int i32 = this.f7867b;
                ArrayList arrayList13 = new ArrayList();
                c5.a aVar = new c5.a();
                aVar.f3732c = "inapp";
                aVar.f3731b = str4;
                arrayList13.add(aVar.a());
                f8.b("LoginBilling querying \"" + str4 + "\" product");
                org.telegram.messenger.u1.i().o(arrayList13, new q2(se0Var, str4, str5, str6, i32));
                return;
            case 19:
                int i33 = this.f7867b;
                r8 r8Var = (r8) this.d;
                TLRPC.User user = (TLRPC.User) this.e;
                ((int[]) this.f7868c)[0] = i33;
                r8Var.r(user);
                ((g9) this.f7869f).e(user, r8Var);
                return;
            case 20:
                ph.l1 l1Var = (ph.l1) this.f7868c;
                Context context = (Context) this.d;
                int i34 = this.f7867b;
                TL_stars.StarGift starGift = (TL_stars.StarGift) this.e;
                long j13 = l1Var.T1;
                ph.n0 n0Var = new ph.n0(l1Var, (q20) this.f7869f, 2);
                boolean z24 = starGift.limited;
                if (z24 && (disallowedGiftsSettings2 = l1Var.S1) != null && disallowedGiftsSettings2.disallow_limited_stargifts) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (z24 && (disallowedGiftsSettings = l1Var.S1) != null && disallowedGiftsSettings.disallow_unique_stargifts) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                new ph.t0(l1Var, context, i34, starGift, j13, n0Var, z14, z15).show();
                return;
            case 21:
                int i35 = this.f7867b;
                TLObject tLObject4 = (TLObject) this.e;
                String str7 = (String) this.f7869f;
                ((vh.d) this.f7868c).setLoading(false);
                z2 z2Var = ((z2[]) this.d)[0];
                if (z2Var != null) {
                    z2Var.dismiss();
                }
                e6.y(i35, false).R();
                k2 T = LaunchActivity.T();
                if (T != null) {
                    cc.a0(T).V(Collections.singletonList(tLObject4), cd.L0(2131744997, null), org.telegram.messenger.i0.W2(cd.a0(null, null, 2131744996, str7)), null).k(false);
                    return;
                }
                return;
            case 22:
                long[] jArr = (long[]) this.f7868c;
                int i36 = this.f7867b;
                g9 g9Var = (g9) this.d;
                g9 g9Var2 = (g9) this.e;
                TextView textView = (TextView) this.f7869f;
                if (jArr[0] >= 0) {
                    TLRPC.User Z1 = vp.r1(i36).Z1(Long.valueOf(jArr[0]));
                    r8 r8Var2 = new r8((p6) null);
                    r8Var2.r(Z1);
                    g9Var.e(Z1, r8Var2);
                } else {
                    TLRPC.Chat L0 = vp.r1(i36).L0(Long.valueOf(-jArr[0]));
                    r8 r8Var3 = new r8((p6) null);
                    r8Var3.q(L0);
                    g9Var.e(L0, r8Var3);
                }
                if (jArr[0] >= 0) {
                    TLRPC.User Z12 = vp.r1(i36).Z1(Long.valueOf(jArr[0]));
                    if (g9Var2 != null) {
                        r8 r8Var4 = new r8((p6) null);
                        r8Var4.r(Z12);
                        g9Var2.e(Z12, r8Var4);
                    }
                    if (textView != null) {
                        textView.setText(h20.p(Z12));
                        return;
                    }
                    return;
                }
                TLRPC.Chat L02 = vp.r1(i36).L0(Long.valueOf(-jArr[0]));
                if (g9Var2 != null) {
                    r8 r8Var5 = new r8((p6) null);
                    r8Var5.q(L02);
                    g9Var2.e(L02, r8Var5);
                }
                if (textView != null) {
                    if (L02 != null) {
                        str = L02.title;
                    }
                    textView.setText(str);
                    return;
                }
                return;
            case 23:
                boolean[] zArr = (boolean[]) this.d;
                q20 q20Var = (q20) this.e;
                int i37 = this.f7867b;
                TL_account.updateEmojiStatus updateemojistatus = (TL_account.updateEmojiStatus) this.f7869f;
                if (!(((TLObject) this.f7868c) instanceof TLRPC.TL_boolTrue)) {
                    if (!zArr[0]) {
                        zArr[0] = true;
                        q20Var.a("SERVER_ERROR");
                        return;
                    }
                    return;
                }
                TLRPC.User f7 = d20.i(i37).f();
                if (f7 != null) {
                    f7.emoji_status = updateemojistatus.emoji_status;
                    zs.f(i37).k(315, f7);
                    vp.r1(i37).g5(f7.f19942id, f7.emoji_status);
                }
                if (!zArr[0]) {
                    zArr[0] = true;
                    q20Var.a(null);
                    return;
                }
                return;
            case 24:
                final zf.z zVar = (zf.z) this.f7868c;
                int i38 = this.f7867b;
                ArrayList arrayList14 = (ArrayList) this.d;
                ArrayList arrayList15 = (ArrayList) this.e;
                ArrayList arrayList16 = (ArrayList) this.f7869f;
                ?? r10 = zVar.f55693j0;
                ?? r11 = zVar.f55707v0;
                int i39 = zVar.f55704s0;
                zVar.D0--;
                if (i38 == zVar.f55686d0) {
                    zVar.f55689f0 = i38;
                    if (zVar.f55687e0 != i38) {
                        r10.b();
                    }
                    if (zVar.f55690g0 != i38) {
                        zVar.I.clear();
                    }
                    zVar.N = true;
                    int i40 = 0;
                    while (i40 < arrayList14.size()) {
                        if (!zVar.F(arrayList14.get(i40))) {
                            arrayList14.remove(i40);
                            i40--;
                        }
                        i40++;
                    }
                    int size3 = r11.size();
                    int i41 = 0;
                    while (i41 < arrayList14.size()) {
                        final Object obj6 = arrayList14.get(i41);
                        if (obj6 instanceof TLRPC.User) {
                            TLRPC.User user2 = (TLRPC.User) obj6;
                            j10 = 0;
                            vp.r1(i39).U3(user2, z20, z21);
                            j11 = user2.f19942id;
                        } else {
                            j10 = 0;
                            if (obj6 instanceof TLRPC.Chat) {
                                TLRPC.Chat chat3 = (TLRPC.Chat) obj6;
                                vp.r1(i39).N3(chat3, z20);
                                j11 = -chat3.f19793id;
                            } else {
                                if (obj6 instanceof TLRPC.EncryptedChat) {
                                    vp.r1(i39).R3((TLRPC.EncryptedChat) obj6, z20);
                                }
                                j11 = 0;
                            }
                        }
                        if (j11 != j10 && ((TLRPC.Dialog) vp.r1(i39).Q.f(j11)) == null) {
                            hs a03 = hs.a0(i39);
                            z18 = z21;
                            z17 = z20;
                            j12 = j11;
                            a03.f15938a.c(new lr(a03, j12, new bs() {
                                @Override
                                public final void a(int i42) {
                                    int i43 = z.this.f55704s0;
                                    if (i42 != -1) {
                                        TLRPC.TL_dialog tL_dialog = new TLRPC.TL_dialog();
                                        long j14 = j11;
                                        tL_dialog.f19797id = j14;
                                        if (i42 != 0) {
                                            tL_dialog.folder_id = i42;
                                        }
                                        Object obj7 = obj6;
                                        if (obj7 instanceof TLRPC.Chat) {
                                            tL_dialog.flags = w3.T((TLRPC.Chat) obj7) ? 1 : 0;
                                        }
                                        vp.r1(i43).Q.k(tL_dialog, j14);
                                        vp.r1(i43).f18950y.add(tL_dialog);
                                        vp.r1(i43).Q4(null);
                                    }
                                }
                            }, 1));
                        } else {
                            j12 = j11;
                            z17 = z20;
                            z18 = z21;
                        }
                        if (zVar.R() && !(obj6 instanceof TLRPC.EncryptedChat)) {
                            mx mxVar = zVar.U;
                            if (mxVar != null && mxVar.a() == j12) {
                                z19 = z17;
                            } else {
                                z19 = z18;
                            }
                            boolean z25 = z19;
                            for (int i42 = z18; !z25 && i42 < size3; i42++) {
                                zf.y yVar = (zf.y) r11.get(i42);
                                if (yVar != null && yVar.f55680c == j12) {
                                    z25 = z17;
                                }
                            }
                            if (z25) {
                                arrayList14.remove(i41);
                                arrayList15.remove(i41);
                                i41--;
                            }
                        }
                        i41++;
                        z21 = z18;
                        z20 = z17;
                    }
                    boolean z26 = z20;
                    boolean z27 = z21;
                    vp.r1(i39).V3(arrayList16, z26);
                    zVar.f55703s = arrayList14;
                    zVar.G = arrayList15;
                    r10.f(arrayList14, r11);
                    zVar.f();
                    mx mxVar2 = zVar.U;
                    if (mxVar2 != null) {
                        if (zVar.D0 > 0) {
                            z16 = z26;
                        } else {
                            z16 = z27;
                        }
                        mxVar2.d(z16, z26);
                        zVar.U.c();
                        return;
                    }
                    return;
                }
                return;
            default:
                zf.f1 f1Var = (zf.f1) this.f7868c;
                int i43 = this.f7867b;
                ArrayList arrayList17 = (ArrayList) this.d;
                ArrayList arrayList18 = (ArrayList) this.e;
                ArrayList arrayList19 = (ArrayList) this.f7869f;
                if (i43 == f1Var.E) {
                    f1Var.d = arrayList17;
                    f1Var.e = arrayList18;
                    f1Var.H = arrayList19;
                    f1Var.f55485f.f(arrayList17, null);
                    f1Var.D = false;
                    f1Var.f();
                    f1Var.F();
                    return;
                }
                return;
        }
    }

    public g1(Object obj, int i10, Object obj2, Object obj3, Object obj4, int i11) {
        this.f7866a = i11;
        this.f7868c = obj;
        this.f7867b = i10;
        this.d = obj2;
        this.e = obj3;
        this.f7869f = obj4;
    }

    public g1(Object obj, Object obj2, int i10, Object obj3, Object obj4, int i11) {
        this.f7866a = i11;
        this.f7868c = obj;
        this.d = obj2;
        this.f7867b = i10;
        this.e = obj3;
        this.f7869f = obj4;
    }

    public g1(Object obj, Object obj2, Object obj3, int i10, Object obj4, int i11) {
        this.f7866a = i11;
        this.f7868c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f7867b = i10;
        this.f7869f = obj4;
    }

    public g1(Object obj, Object obj2, Object obj3, Object obj4, int i10, int i11) {
        this.f7866a = i11;
        this.f7868c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f7869f = obj4;
        this.f7867b = i10;
    }
}
