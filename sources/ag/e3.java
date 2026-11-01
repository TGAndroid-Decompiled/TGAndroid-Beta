package ag;

import android.app.Dialog;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.view.View;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a30;
import org.telegram.messenger.at;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.camera.CameraSession;
import org.telegram.messenger.dd;
import org.telegram.messenger.f8;
import org.telegram.messenger.is;
import org.telegram.messenger.kj;
import org.telegram.messenger.m5;
import org.telegram.messenger.o5;
import org.telegram.messenger.pt;
import org.telegram.messenger.r20;
import org.telegram.messenger.u3;
import org.telegram.messenger.vi;
import org.telegram.messenger.w3;
import org.telegram.messenger.wp;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.a7;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.dx0;
import org.telegram.ui.Components.ox0;
import org.telegram.ui.Components.p21;
import org.telegram.ui.Components.s4;
import org.telegram.ui.Components.so0;
import org.telegram.ui.Components.uk0;
import org.telegram.ui.Components.wb;
import org.telegram.ui.Components.x71;
import org.telegram.ui.Components.z60;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.a50;
import org.telegram.ui.aa;
import org.telegram.ui.cp;
import org.telegram.ui.f7;
import org.telegram.ui.fn;
import org.telegram.ui.hj0;
import org.telegram.ui.iq;
import org.telegram.ui.j9;
import org.telegram.ui.k91;
import org.telegram.ui.kd;
import org.telegram.ui.ke1;
import org.telegram.ui.kt;
import org.telegram.ui.m7;
import org.telegram.ui.na;
import org.telegram.ui.nb;
import org.telegram.ui.oa;
import org.telegram.ui.oo;
import org.telegram.ui.or;
import org.telegram.ui.pr;
import org.telegram.ui.q5;
import org.telegram.ui.sb;
import org.telegram.ui.t7;
import org.telegram.ui.un;
import org.telegram.ui.y60;
import org.telegram.ui.zc;
import org.telegram.ui.zx;
public final class e3 implements Runnable {
    public final int f499a;
    public final Object f500b;
    public final Object f501c;
    public final Object d;
    public final Object e;
    public final Object f502f;

    public e3(i3 i3Var, TLObject tLObject, ArrayList arrayList, TLRPC.TL_messages_sendQuickReplyMessages tL_messages_sendQuickReplyMessages, TLRPC.TL_error tL_error) {
        this.f499a = 1;
        this.f500b = i3Var;
        this.d = tLObject;
        this.f501c = arrayList;
        this.e = tL_messages_sendQuickReplyMessages;
        this.f502f = tL_error;
    }

    @Override
    public final void run() {
        int i10;
        String str;
        Object obj;
        int i11;
        int i12;
        String str2;
        boolean z10;
        TLRPC.GroupCall groupCall;
        TLRPC.WallPaperSettings wallPaperSettings;
        int i13 = this.f499a;
        int i14 = 0;
        Object obj2 = this.f502f;
        Object obj3 = this.e;
        Object obj4 = this.d;
        Object obj5 = this.f501c;
        Object obj6 = this.f500b;
        switch (i13) {
            case 0:
                i3 i3Var = (i3) obj6;
                h3 h3Var = (h3) obj3;
                kj kjVar = (kj) obj2;
                int i15 = i3Var.f566a;
                wp.r1(i15).V3((ArrayList) obj5, true);
                wp.r1(i15).P3((ArrayList) obj4, true);
                h3Var.e = kjVar;
                if (kjVar != null) {
                    kjVar.l(h3Var.f551a, h3Var.f552b);
                }
                i3Var.l();
                at.f(i15).k(121, new Object[0]);
                return;
            case 1:
                i3 i3Var2 = (i3) obj6;
                TLObject tLObject = (TLObject) obj4;
                ArrayList<Integer> arrayList = (ArrayList) obj5;
                TLRPC.TL_messages_sendQuickReplyMessages tL_messages_sendQuickReplyMessages = (TLRPC.TL_messages_sendQuickReplyMessages) obj3;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (tLObject instanceof TLRPC.TL_messages_messages) {
                    ArrayList<TLRPC.Message> arrayList2 = ((TLRPC.TL_messages_messages) tLObject).messages;
                    arrayList.clear();
                    int size = arrayList2.size();
                    int i16 = 0;
                    while (i16 < size) {
                        TLRPC.Message message = arrayList2.get(i16);
                        i16++;
                        arrayList.add(Integer.valueOf(message.f19815id));
                    }
                    tL_messages_sendQuickReplyMessages.f19911id = arrayList;
                    for (int i17 = 0; i17 < arrayList.size(); i17++) {
                        tL_messages_sendQuickReplyMessages.random_id.add(Long.valueOf(Utilities.f14520b.nextLong()));
                    }
                    ConnectionsManager.getInstance(i3Var2.f566a).sendRequest(tL_messages_sendQuickReplyMessages, null);
                    return;
                }
                f8.d("received " + tLObject + " " + tL_error + " on getQuickReplyMessages when trying to send quick reply");
                return;
            case 2:
                i3 i3Var3 = (i3) obj6;
                Runnable runnable = (Runnable) obj2;
                i3Var3.e = false;
                int i18 = i3Var3.f566a;
                wp.r1(i18).V3((ArrayList) obj5, true);
                wp.r1(i18).P3((ArrayList) obj4, true);
                ArrayList arrayList3 = i3Var3.f567b;
                arrayList3.clear();
                arrayList3.addAll((ArrayList) obj3);
                if (runnable != null) {
                    runnable.run();
                    i10 = 0;
                } else {
                    i10 = 0;
                    i3Var3.i(null, false);
                }
                at.f(i18).k(121, new Object[i10]);
                return;
            case 3:
                ((m4.h) obj5).run().a(new q0((xa.n) obj6, (AtomicBoolean) obj4, (m4.i) obj3, (AtomicBoolean) obj2, 9), j9.r.f9764a);
                return;
            case 4:
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj6;
                org.telegram.messenger.j1 j1Var = (org.telegram.messenger.j1) obj5;
                TLObject tLObject2 = (TLObject) obj4;
                wp wpVar = (wp) obj3;
                org.telegram.messenger.g3 g3Var = (org.telegram.messenger.g3) obj2;
                if (tL_error2 != null) {
                    j1Var.a(tL_error2);
                    return;
                } else if (tLObject2 instanceof TL_stories.TL_premium_myBoosts) {
                    TL_stories.TL_premium_myBoosts tL_premium_myBoosts = (TL_stories.TL_premium_myBoosts) tLObject2;
                    wpVar.V3(tL_premium_myBoosts.users, false);
                    wpVar.P3(tL_premium_myBoosts.chats, false);
                    g3Var.a(tL_premium_myBoosts);
                    return;
                } else {
                    return;
                }
            case 5:
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj6;
                r20 r20Var = (r20) obj5;
                TLObject tLObject3 = (TLObject) obj4;
                wp wpVar2 = (wp) obj3;
                r20 r20Var2 = (r20) obj2;
                if (tL_error3 != null) {
                    r20Var.a(tL_error3);
                    return;
                } else if (tLObject3 instanceof TL_stories.TL_premium_myBoosts) {
                    TL_stories.TL_premium_myBoosts tL_premium_myBoosts2 = (TL_stories.TL_premium_myBoosts) tLObject3;
                    wpVar2.V3(tL_premium_myBoosts2.users, false);
                    wpVar2.P3(tL_premium_myBoosts2.chats, false);
                    r20Var2.a(tL_premium_myBoosts2);
                    return;
                } else {
                    return;
                }
            case 6:
                TLObject tLObject4 = (TLObject) obj6;
                wp wpVar3 = (wp) obj5;
                m2 m2Var = (m2) obj4;
                mg.k kVar = (mg.k) obj3;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) obj2;
                if (tLObject4 instanceof TLRPC.TL_payments_checkedGiftCode) {
                    TLRPC.TL_payments_checkedGiftCode tL_payments_checkedGiftCode = (TLRPC.TL_payments_checkedGiftCode) tLObject4;
                    wpVar3.P3(tL_payments_checkedGiftCode.chats, false);
                    wpVar3.V3(tL_payments_checkedGiftCode.users, false);
                    m2Var.a(tL_payments_checkedGiftCode);
                }
                kVar.a(tL_error4);
                return;
            case 7:
                mg.i2 i2Var = (mg.i2) obj6;
                TLRPC.UserFull userFull = (TLRPC.UserFull) obj4;
                TL_account.TL_birthday tL_birthday = (TL_account.TL_birthday) obj3;
                TLRPC.TL_error tL_error5 = (TLRPC.TL_error) obj2;
                FrameLayout frameLayout = i2Var.W1;
                if (((TLObject) obj5) instanceof TLRPC.TL_boolTrue) {
                    wb Q = new cc(frameLayout, i2Var.I0).Q(2131623989, 36, dd.L0(2131746871, null));
                    Q.f32201j = 5000;
                    Q.j();
                    return;
                }
                if (userFull != null) {
                    if (tL_birthday == null) {
                        userFull.flags2 &= -33;
                    } else {
                        userFull.flags2 |= 32;
                    }
                    userFull.birthday = tL_birthday;
                    is.a0(i2Var.f21584a).j2(userFull, false);
                }
                if (tL_error5 != null && (str = tL_error5.text) != null && str.startsWith("FLOOD_WAIT_")) {
                    if (i2Var.getContext() != null) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, i2Var.getContext(), i2Var.I0);
                        alertDialog$Builder.f20135a.R = dd.L0(2131746867, null);
                        alertDialog$Builder.f20135a.T = dd.L0(2131746868, null);
                        i0.a.w(null, 2131747847, alertDialog$Builder, null);
                        return;
                    }
                    return;
                }
                m5.n(null, 2131743904, new cc(frameLayout, i2Var.I0), 2131624011, 36);
                return;
            case 8:
                ((CameraController) obj6).lambda$open$10((CameraSession) obj5, (Runnable) obj4, (SurfaceTexture) obj3, (Runnable) obj2);
                return;
            case 9:
                t7 t7Var = (t7) obj6;
                sh.a aVar = (sh.a) obj5;
                TLRPC.TL_documentAttributeAudio tL_documentAttributeAudio = (TLRPC.TL_documentAttributeAudio) obj4;
                t7Var.getClass();
                aVar.e.f3684a = false;
                tL_documentAttributeAudio.title = (String) obj3;
                tL_documentAttributeAudio.performer = (String) obj2;
                x71 x71Var = t7Var.f41560n;
                for (int i19 = 0; i19 < x71Var.getViewPages().length; i19++) {
                    uk0 c10 = t7Var.c(x71Var.getViewPages()[i19]);
                    if (c10 != null && ((f7) c10.getAdapter()).d == 3) {
                        f7 f7Var = (f7) c10.getAdapter();
                        int i20 = 0;
                        while (true) {
                            if (i20 >= f7Var.e.size()) {
                                break;
                            } else if (((m7) f7Var.e.get(i20)).d == aVar) {
                                f7Var.g(i20);
                            } else {
                                i20++;
                            }
                        }
                    }
                }
                return;
            case 10:
                oa oaVar = (oa) obj6;
                String str3 = (String) obj5;
                TLRPC.TL_error tL_error6 = (TLRPC.TL_error) obj4;
                TLObject tLObject5 = (TLObject) obj3;
                TL_account.checkUsername checkusername = (TL_account.checkUsername) obj2;
                oaVar.e = 0;
                String str4 = oaVar.f40113f;
                if (str4 != null && str4.equals(str3)) {
                    if (tL_error6 == null && (tLObject5 instanceof TLRPC.TL_boolTrue)) {
                        org.telegram.ui.Cells.b2 b2Var = oaVar.G;
                        if (b2Var != null) {
                            b2Var.setText(dd.a0("UsernameAvailable", null, 2131743693, str3));
                            org.telegram.ui.Cells.b2 b2Var2 = oaVar.G;
                            int i21 = t6.f21278w6;
                            b2Var2.setTag(Integer.valueOf(i21));
                            a7.V(oaVar.G, i21, null);
                            na naVar = oaVar.F;
                            if (naVar != null) {
                                na.a(naVar);
                                return;
                            }
                            return;
                        }
                        return;
                    } else if (oaVar.G != null) {
                        if (tL_error6 != null && "USERNAME_INVALID".equals(tL_error6.text) && checkusername.username.length() == 4) {
                            oaVar.G.setText(dd.L0(2131743680, null));
                            org.telegram.ui.Cells.b2 b2Var3 = oaVar.G;
                            int i22 = t6.f21154p7;
                            b2Var3.setTag(Integer.valueOf(i22));
                            a7.V(oaVar.G, i22, null);
                        } else if (tL_error6 != null && "USERNAME_PURCHASE_AVAILABLE".equals(tL_error6.text)) {
                            if (checkusername.username.length() == 4) {
                                oaVar.G.setText(dd.L0(2131743679, null));
                            } else {
                                oaVar.G.setText(dd.L0(2131743683, null));
                            }
                            org.telegram.ui.Cells.b2 b2Var4 = oaVar.G;
                            int i23 = t6.F6;
                            b2Var4.setTag(Integer.valueOf(i23));
                            a7.V(oaVar.G, i23, null);
                        } else {
                            oaVar.G.setText(dd.L0(2131743684, null));
                            org.telegram.ui.Cells.b2 b2Var5 = oaVar.G;
                            int i24 = t6.f21154p7;
                            b2Var5.setTag(Integer.valueOf(i24));
                            a7.V(oaVar.G, i24, null);
                        }
                        na naVar2 = oaVar.F;
                        if (naVar2 != null) {
                            na.a(naVar2);
                            return;
                        }
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 11:
                TLRPC.TL_messages_exportedChatInvite tL_messages_exportedChatInvite = (TLRPC.TL_messages_exportedChatInvite) obj4;
                boolean[] zArr = (boolean[]) obj3;
                org.telegram.ui.ActionBar.x1 x1Var = (org.telegram.ui.ActionBar.x1) obj2;
                sb sbVar = ((nb) obj6).f39794a.f40443n;
                sbVar.A0 = false;
                HashMap hashMap = sbVar.f41334y0;
                String str5 = ((TLRPC.TL_chatInviteExported) obj5).link;
                if (tL_messages_exportedChatInvite == null) {
                    obj = 0;
                } else {
                    obj = tL_messages_exportedChatInvite;
                }
                hashMap.put(str5, obj);
                if (!zArr[0]) {
                    x1Var.dismiss();
                    if (tL_messages_exportedChatInvite != null) {
                        sb.F0(sbVar, tL_messages_exportedChatInvite, sbVar.f41335z0);
                        return;
                    } else {
                        m5.n(null, 2131748923, cc.a0(sbVar), 2131624078, 36);
                        return;
                    }
                }
                return;
            case 12:
                zc zcVar = (zc) obj6;
                boolean[] zArr2 = (boolean[]) obj5;
                int[] iArr = (int[]) obj4;
                int[] iArr2 = (int[]) obj3;
                TLRPC.TL_error tL_error7 = (TLRPC.TL_error) obj2;
                if (!zArr2[0] && (i11 = iArr[0]) < iArr2[0]) {
                    if (tL_error7 != null) {
                        zArr2[0] = true;
                        if ("BOOSTS_REQUIRED".equals(tL_error7.text)) {
                            zcVar.getMessagesController().G0().b(zcVar.f43889a, zcVar.f43893c, new org.telegram.ui.cc(zcVar, 1));
                            return;
                        }
                        zcVar.P.setLoading(false);
                        cc.a0(zcVar).Q(2131624011, 36, dd.a0(null, null, 2131743903, tL_error7.text)).j();
                        return;
                    }
                    int i25 = i11 + 1;
                    iArr[0] = i25;
                    if (i25 == iArr2[0]) {
                        zcVar.finishFragment();
                        org.telegram.ui.ActionBar.k2 k2Var = zcVar.f43904l0;
                        if (k2Var != null) {
                            if (k2Var instanceof oo) {
                                ((oo) k2Var).t0();
                            }
                            cc a02 = cc.a0(zcVar.f43904l0);
                            if (zcVar.d) {
                                i12 = 2131749507;
                            } else {
                                i12 = 2131752459;
                            }
                            m5.n(null, i12, a02, 2131623989, 36);
                            zcVar.f43904l0 = null;
                        }
                        zcVar.P.setLoading(false);
                        return;
                    }
                    return;
                }
                return;
            case 13:
                kd kdVar = (kd) obj6;
                String str6 = (String) obj5;
                TLRPC.TL_error tL_error8 = (TLRPC.TL_error) obj4;
                TLObject tLObject6 = (TLObject) obj3;
                TLRPC.TL_channels_checkUsername tL_channels_checkUsername = (TLRPC.TL_channels_checkUsername) obj2;
                kdVar.X = 0;
                String str7 = kdVar.Y;
                if (str7 != null && str7.equals(str6)) {
                    if (tL_error8 == null && (tLObject6 instanceof TLRPC.TL_boolTrue)) {
                        kdVar.V.setText(dd.a0("LinkAvailable", null, 2131748934, str6));
                        org.telegram.ui.Cells.b2 b2Var6 = kdVar.V;
                        int i26 = t6.f21278w6;
                        b2Var6.setTag(Integer.valueOf(i26));
                        a7.V(kdVar.V, i26, null);
                        kdVar.f38807a0 = true;
                        return;
                    }
                    if (tL_error8 != null && "USERNAME_INVALID".equals(tL_error8.text) && tL_channels_checkUsername.username.length() == 4) {
                        kdVar.V.setText(dd.L0(2131743680, null));
                        a7.V(kdVar.V, t6.f21154p7, null);
                    } else if (tL_error8 != null && "USERNAME_PURCHASE_AVAILABLE".equals(tL_error8.text)) {
                        if (tL_channels_checkUsername.username.length() == 4) {
                            kdVar.V.setText(dd.L0(2131743679, null));
                        } else {
                            kdVar.V.setText(dd.L0(2131743683, null));
                        }
                        a7.V(kdVar.V, t6.F6, null);
                    } else if (tL_error8 != null && "CHANNELS_ADMIN_PUBLIC_TOO_MUCH".equals(tL_error8.text)) {
                        a7.V(kdVar.V, t6.f21154p7, null);
                        kdVar.f38820k0 = false;
                        kdVar.l0();
                    } else {
                        a7.V(kdVar.V, t6.f21154p7, null);
                        kdVar.V.setText(dd.L0(2131748922, null));
                    }
                    kdVar.f38807a0 = false;
                    return;
                }
                return;
            case 14:
                un unVar = (un) obj6;
                boolean[] zArr3 = (boolean[]) obj5;
                boolean[] zArr4 = (boolean[]) obj4;
                ImageView imageView = (ImageView) obj3;
                ImageView imageView2 = (ImageView) obj2;
                if (!zArr3[0]) {
                    zArr3[0] = true;
                    long[] jArr = {-1};
                    q0 q0Var = new q0(jArr, zArr4, imageView, imageView2, 25);
                    TLRPC.TL_messages_rateTranscribedAudio tL_messages_rateTranscribedAudio = new TLRPC.TL_messages_rateTranscribedAudio();
                    tL_messages_rateTranscribedAudio.msg_id = unVar.f42232t5.f1();
                    tL_messages_rateTranscribedAudio.peer = unVar.getMessagesController().l1(unVar.f42232t5.f16690k.peer_id);
                    tL_messages_rateTranscribedAudio.transcription_id = unVar.f42232t5.f16690k.voiceTranscriptionId;
                    tL_messages_rateTranscribedAudio.good = zArr4[0];
                    unVar.getConnectionsManager().sendRequest(tL_messages_rateTranscribedAudio, new aa(unVar, q0Var, jArr, 4));
                    org.telegram.messenger.i0.h3(q0Var, 150L);
                    return;
                }
                return;
            case 15:
                fn fnVar = (fn) obj6;
                org.telegram.ui.ActionBar.x1[] x1VarArr = (org.telegram.ui.ActionBar.x1[]) obj4;
                kj kjVar2 = (kj) obj2;
                q5 q5Var = (q5) obj3;
                un unVar2 = fnVar.f37191a;
                if (((TLRPC.Message) obj5).suggested_post.schedule_date == 0) {
                    x1VarArr[0].setOnDismissListener(null);
                    org.telegram.ui.ActionBar.z2 z2Var = (org.telegram.ui.ActionBar.z2) s4.S(unVar2.getParentActivity(), 0L, new ng.d(15, fnVar, kjVar2), unVar2.getResourceProvider(), 1).f11588b;
                    z2Var.show();
                    z2Var.setOnDismissListener(q5Var);
                    return;
                }
                unVar2.getMessagesController().v(kjVar2.f16690k.f19815id, 0, o5.o(kjVar2.f16690k.peer_id), null, false);
                return;
            case 16:
                cp cpVar = (cp) obj6;
                String str8 = (String) obj5;
                TLRPC.TL_error tL_error9 = (TLRPC.TL_error) obj4;
                TLObject tLObject7 = (TLObject) obj3;
                TLRPC.TL_channels_checkUsername tL_channels_checkUsername2 = (TLRPC.TL_channels_checkUsername) obj2;
                cpVar.f36368h0 = 0;
                String str9 = cpVar.f36369i0;
                if (str9 != null && str9.equals(str8)) {
                    if (tL_error9 == null && (tLObject7 instanceof TLRPC.TL_boolTrue)) {
                        cpVar.h.setText(dd.a0("LinkAvailable", null, 2131748934, str8));
                        cpVar.h.setTextColorByKey(t6.f21278w6);
                        cpVar.f36371k0 = true;
                        return;
                    }
                    if (tL_error9 != null && "USERNAME_INVALID".equals(tL_error9.text) && tL_channels_checkUsername2.username.length() == 4) {
                        cpVar.h.setText(dd.L0(2131743680, null));
                        a7.V(cpVar.h.getTextView(), t6.f21154p7, null);
                    } else if (tL_error9 != null && "USERNAME_PURCHASE_AVAILABLE".equals(tL_error9.text)) {
                        if (tL_channels_checkUsername2.username.length() == 4) {
                            cpVar.h.setText(dd.L0(2131743679, null));
                        } else {
                            cpVar.h.setText(dd.L0(2131743683, null));
                        }
                        a7.V(cpVar.h.getTextView(), t6.F6, null);
                    } else if (tL_error9 != null && "CHANNELS_ADMIN_PUBLIC_TOO_MUCH".equals(tL_error9.text)) {
                        cpVar.f36362c0 = false;
                        cpVar.f0();
                    } else {
                        cpVar.h.setText(dd.L0(2131748922, null));
                        cpVar.h.setTextColorByKey(t6.f21154p7);
                    }
                    cpVar.f36371k0 = false;
                    return;
                }
                return;
            case 17:
                iq.d0((iq) obj6, (TLRPC.TL_error) obj5, (TLRPC.InputCheckPasswordSRP) obj4, (TwoStepVerificationActivity) obj3, (TLRPC.TL_channels_editCreator) obj2);
                return;
            case 18:
                or orVar = (or) obj6;
                ArrayList arrayList4 = (ArrayList) obj5;
                a0.h hVar = (a0.h) obj3;
                ArrayList arrayList5 = (ArrayList) obj4;
                ArrayList arrayList6 = (ArrayList) obj2;
                zf.m1 m1Var = orVar.h;
                pr prVar = orVar.D;
                if (prVar.f40555n1) {
                    orVar.f40255s = false;
                    orVar.d = arrayList4;
                    orVar.e = hVar;
                    orVar.f40252f = arrayList5;
                    m1Var.f(arrayList4, null);
                    if (!w3.T(prVar.f40553n)) {
                        ArrayList arrayList7 = m1Var.f55597g;
                        arrayList7.clear();
                        arrayList7.addAll(arrayList6);
                    }
                    int i27 = orVar.f40254r;
                    orVar.f();
                    if (orVar.f40254r > i27) {
                        prVar.D0(i27);
                    }
                    if (!m1Var.e() && orVar.f40254r == 0) {
                        prVar.f40528b.e(false, true);
                        return;
                    }
                    return;
                }
                return;
            case 19:
                View view = (View) obj6;
                View view2 = (View) obj5;
                WindowManager windowManager = (WindowManager) obj4;
                view.setVisibility(8);
                view2.setVisibility(8);
                windowManager.removeView(view);
                windowManager.removeView(view2);
                windowManager.removeView((View) obj3);
                windowManager.removeView((View) obj2);
                return;
            case 20:
                dx0 dx0Var = (dx0) obj6;
                String str10 = (String) obj5;
                TLRPC.TL_error tL_error10 = (TLRPC.TL_error) obj4;
                TLObject tLObject8 = (TLObject) obj3;
                TextView textView = (TextView) obj2;
                dx0Var.f25615g2 = 0;
                String str11 = dx0Var.f25614f2;
                if (str11 != null && str11.equals(str10)) {
                    if (tL_error10 == null && (tLObject8 instanceof TLRPC.TL_boolTrue)) {
                        textView.setText(dd.L0(2131749244, null));
                        a7.V(textView, t6.f21278w6, dx0Var.I0);
                        dx0Var.f25616h2 = true;
                        return;
                    }
                    textView.setText(dd.L0(2131749239, null));
                    a7.V(textView, t6.f21154p7, dx0Var.I0);
                    dx0Var.f25616h2 = false;
                    return;
                }
                return;
            case 21:
                ox0 ox0Var = (ox0) obj6;
                TLObject tLObject9 = (TLObject) obj5;
                TLRPC.UserFull userFull2 = (TLRPC.UserFull) obj4;
                TL_account.TL_birthday tL_birthday2 = (TL_account.TL_birthday) obj3;
                TLRPC.TL_error tL_error11 = (TLRPC.TL_error) obj2;
                org.telegram.ui.ActionBar.k2 T = LaunchActivity.T();
                if (T != null) {
                    if (tLObject9 instanceof TLRPC.TL_boolTrue) {
                        wb I = cc.a0(T).I(2131624032, dd.L0(2131746871, null), dd.L0(2131746870, null));
                        I.f32201j = 5000;
                        I.j();
                        return;
                    }
                    if (userFull2 != null) {
                        if (tL_birthday2 == null) {
                            userFull2.flags2 &= -33;
                        } else {
                            userFull2.flags2 |= 32;
                        }
                        userFull2.birthday = tL_birthday2;
                        is.a0(ox0Var.f29242a).j2(userFull2, false);
                    }
                    if (tL_error11 != null && (str2 = tL_error11.text) != null && str2.startsWith("FLOOD_WAIT_")) {
                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(ox0Var.f29243b.getContext());
                        alertDialog$Builder2.f20135a.R = dd.L0(2131746867, null);
                        alertDialog$Builder2.f20135a.T = dd.L0(2131746868, null);
                        i0.a.w(null, 2131747847, alertDialog$Builder2, null);
                        return;
                    }
                    m5.n(null, 2131743904, cc.a0(T), 2131624011, 36);
                    return;
                }
                return;
            case 22:
                p21 p21Var = (p21) obj6;
                TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) obj4;
                z60 z60Var = (z60) obj3;
                z60 z60Var2 = (z60) obj2;
                un unVar3 = p21Var.f29339s;
                if (((wp) obj5).q2(p21Var.f29330f, tL_forumTopic.f19846id, null)) {
                    z60Var.u();
                    pt.t(p21Var.e).G(p21Var.f29330f, tL_forumTopic.f19846id, false);
                    if (cc.a(unVar3)) {
                        cc.z(unVar3, 4, 0, p21Var.h).j();
                        return;
                    }
                    return;
                }
                z60Var.K(z60Var2);
                return;
            case 23:
                kt ktVar = (kt) obj6;
                TLObject tLObject10 = (TLObject) obj3;
                ArrayList arrayList8 = (ArrayList) obj5;
                TLRPC.TL_messages_getMyStickers tL_messages_getMyStickers = (TLRPC.TL_messages_getMyStickers) obj2;
                if (((TLRPC.TL_error) obj4) == null && (tLObject10 instanceof TLRPC.TL_messages_myStickers)) {
                    TLRPC.TL_messages_myStickers tL_messages_myStickers = (TLRPC.TL_messages_myStickers) tLObject10;
                    ArrayList<TLRPC.StickerSetCovered> arrayList9 = tL_messages_myStickers.sets;
                    int size2 = arrayList9.size();
                    while (i14 < size2) {
                        TLRPC.StickerSetCovered stickerSetCovered = arrayList9.get(i14);
                        i14++;
                        TLRPC.StickerSetCovered stickerSetCovered2 = stickerSetCovered;
                        TLRPC.StickerSet stickerSet = stickerSetCovered2.set;
                        if (!stickerSet.emojis && !stickerSet.masks) {
                            TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
                            tL_inputStickerSetID.f19814id = stickerSetCovered2.set.f19821id;
                            TLRPC.TL_messages_stickerSet m0 = vi.b0(ktVar.f38992r).m0(tL_inputStickerSetID, true);
                            if (m0 == null || m0.documents.size() < 120) {
                                arrayList8.add(stickerSetCovered2);
                            }
                        }
                    }
                    if (tL_messages_myStickers.sets.size() == tL_messages_getMyStickers.limit) {
                        tL_messages_getMyStickers.offset_id = ((TLRPC.StickerSetCovered) i0.a.g(1, tL_messages_myStickers.sets)).set.f19821id;
                        ConnectionsManager.getInstance(ktVar.f38992r).sendRequest(tL_messages_getMyStickers, new aa(ktVar, arrayList8, tL_messages_getMyStickers, 7));
                        return;
                    }
                    return;
                }
                return;
            case 24:
                zx.J0((zx) obj6, (TLObject) obj5, (TLRPC.UserFull) obj4, (TL_account.TL_birthday) obj3, (TLRPC.TL_error) obj2);
                return;
            case 25:
                a50 a50Var = (a50) obj6;
                TLObject tLObject11 = (TLObject) obj4;
                TL_phone.exportGroupCallInvite exportgroupcallinvite = (TL_phone.exportGroupCallInvite) obj3;
                TLRPC.TL_error tL_error12 = (TLRPC.TL_error) obj2;
                a50Var.getClass();
                ((org.telegram.ui.ActionBar.x1) obj5).dismiss();
                if (tLObject11 instanceof TL_phone.exportedGroupCallInvite) {
                    Context context = a50Var.getContext();
                    int i28 = a50Var.f21584a;
                    TLRPC.InputGroupCall inputGroupCall = exportgroupcallinvite.call;
                    String str12 = ((TL_phone.exportedGroupCallInvite) tLObject11).link;
                    p6 p6Var = a50Var.I0;
                    u3 u3Var = a50Var.R2;
                    if (u3Var != null && (groupCall = u3Var.f18361b) != null && groupCall.creator) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    j9.n0(context, i28, inputGroupCall, str12, p6Var, false, z10);
                    return;
                } else if (tL_error12 != null) {
                    new cc(a50Var.E, new so0()).f0(tL_error12, false);
                    return;
                } else {
                    return;
                }
            case 26:
                a50 a50Var2 = (a50) obj6;
                ArrayList arrayList10 = (ArrayList) obj5;
                ArrayList arrayList11 = (ArrayList) obj4;
                ArrayList arrayList12 = (ArrayList) obj3;
                String str13 = (String) obj2;
                a50Var2.getClass();
                org.telegram.ui.ActionBar.k2 T2 = LaunchActivity.T();
                if (T2 != null) {
                    kg.q0 q0Var2 = new kg.q0(34, a50Var2.f21584a, T2.getContext(), T2, new so0());
                    q0Var2.C1(null, arrayList10, arrayList11, arrayList12, str13);
                    q0Var2.show();
                    return;
                }
                return;
            case 27:
                LaunchActivity launchActivity = (LaunchActivity) obj6;
                y60 y60Var = (y60) obj5;
                TLObject tLObject12 = (TLObject) obj4;
                TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) obj3;
                TLRPC.TL_error tL_error13 = (TLRPC.TL_error) obj2;
                Pattern pattern = LaunchActivity.D1;
                try {
                    y60Var.run();
                } catch (Exception e) {
                    f8.g(e, true);
                }
                if (tLObject12 instanceof TLRPC.TL_wallPaper) {
                    TLRPC.TL_wallPaper tL_wallPaper2 = (TLRPC.TL_wallPaper) tLObject12;
                    if (tL_wallPaper2.pattern) {
                        String str14 = tL_wallPaper2.slug;
                        TLRPC.WallPaperSettings wallPaperSettings2 = tL_wallPaper.settings;
                        ke1 ke1Var = new ke1(str14, wallPaperSettings2.background_color, wallPaperSettings2.second_background_color, wallPaperSettings2.third_background_color, wallPaperSettings2.fourth_background_color, org.telegram.messenger.i0.s1(wallPaperSettings2.rotation, false), wallPaperSettings.intensity / 100.0f, tL_wallPaper.settings.motion, null);
                        ke1Var.f38863g = tL_wallPaper2;
                        tL_wallPaper2 = ke1Var;
                    }
                    k91 k91Var = new k91(tL_wallPaper2, null, true);
                    TLRPC.WallPaperSettings wallPaperSettings3 = tL_wallPaper.settings;
                    boolean z11 = wallPaperSettings3.blur;
                    boolean z12 = wallPaperSettings3.motion;
                    k91Var.G1 = z11;
                    k91Var.F1 = z12;
                    k91Var.f38754o1 = wallPaperSettings3.intensity;
                    launchActivity.t0(k91Var);
                    return;
                }
                StringBuilder sb2 = new StringBuilder();
                a30.q(null, 2131751106, sb2, "\n");
                sb2.append(tL_error13.text);
                launchActivity.F0(s4.M(launchActivity, null, sb2.toString()));
                return;
            case 28:
                LaunchActivity launchActivity2 = (LaunchActivity) obj6;
                zx zxVar = (zx) obj5;
                org.telegram.ui.ActionBar.k2 k2Var2 = (org.telegram.ui.ActionBar.k2) obj4;
                TLRPC.User user = (TLRPC.User) obj3;
                String str15 = (String) obj2;
                ArrayList arrayList13 = launchActivity2.E0;
                if (zxVar != null) {
                    if (k2Var2 != null) {
                        k2Var2.dismissCurrentDialog();
                    }
                    while (i14 < arrayList13.size()) {
                        if (((Dialog) arrayList13.get(i14)).isShowing()) {
                            ((Dialog) arrayList13.get(i14)).dismiss();
                        }
                        i14++;
                    }
                    arrayList13.clear();
                    launchActivity2.t0(zxVar);
                    return;
                } else if (k2Var2 instanceof un) {
                    ((un) k2Var2).ra(user.f19943id, str15, true);
                    return;
                } else {
                    return;
                }
            default:
                LaunchActivity launchActivity3 = (LaunchActivity) obj6;
                TLObject tLObject13 = (TLObject) obj5;
                TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth = (TLRPC.TL_messages_requestUrlAuth) obj4;
                String str16 = (String) obj3;
                TLRPC.TL_error tL_error14 = (TLRPC.TL_error) obj2;
                org.telegram.ui.ActionBar.k2 T3 = LaunchActivity.T();
                if (tLObject13 != null) {
                    if (tLObject13 instanceof TLRPC.TL_urlAuthResultRequest) {
                        hj0.b(false, launchActivity3.O, tL_messages_requestUrlAuth, (TLRPC.TL_urlAuthResultRequest) tLObject13, null, null, null, false, null);
                        return;
                    } else if (tLObject13 instanceof TLRPC.TL_urlAuthResultAccepted) {
                        hj0.b(false, launchActivity3.O, tL_messages_requestUrlAuth, (TLRPC.TL_urlAuthResultAccepted) tLObject13, null, null, null, false, null);
                        return;
                    } else if (tLObject13 instanceof TLRPC.TL_urlAuthResultDefault) {
                        s4.p0(T3, str16, false, true);
                        return;
                    } else {
                        return;
                    }
                } else if (tL_error14 != null) {
                    if ("URL_EXPIRED".equalsIgnoreCase(tL_error14.text)) {
                        hj0.a().I(2131624011, dd.L0(2131753128, null), dd.L0(2131753129, null)).j();
                        return;
                    } else {
                        hj0.a().f0(tL_error14, false);
                        return;
                    }
                } else {
                    return;
                }
        }
    }

    public e3(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i10) {
        this.f499a = i10;
        this.f500b = obj;
        this.f501c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f502f = obj5;
    }

    public e3(fn fnVar, TLRPC.Message message, org.telegram.ui.ActionBar.x1[] x1VarArr, kj kjVar, q5 q5Var) {
        this.f499a = 15;
        this.f500b = fnVar;
        this.f501c = message;
        this.d = x1VarArr;
        this.f502f = kjVar;
        this.e = q5Var;
    }

    public e3(or orVar, ArrayList arrayList, a0.h hVar, ArrayList arrayList2, ArrayList arrayList3) {
        this.f499a = 18;
        this.f500b = orVar;
        this.f501c = arrayList;
        this.e = hVar;
        this.d = arrayList2;
        this.f502f = arrayList3;
    }

    public e3(kt ktVar, TLRPC.TL_error tL_error, TLObject tLObject, ArrayList arrayList, TLRPC.TL_messages_getMyStickers tL_messages_getMyStickers) {
        this.f499a = 23;
        this.f500b = ktVar;
        this.d = tL_error;
        this.e = tLObject;
        this.f501c = arrayList;
        this.f502f = tL_messages_getMyStickers;
    }
}
