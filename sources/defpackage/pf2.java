package defpackage;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.drawable.Drawable;
import android.media.AudioManager;
import android.text.SpannableString;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_aicompose;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.Wallet.c;
import org.telegram.ui.o;
public final class pf2 implements Runnable {
    public final byte a;
    public final Object b;
    public final Object c;

    public pf2(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    @Override
    public final void run() {
        dr3 dr3Var;
        Object[] objArr;
        int i;
        byte b = this.a;
        float f = 0.0f;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                nm7 f2 = nm7.f(((uf2) obj2).currentAccount);
                Boolean bool = Boolean.FALSE;
                f2.k(31, (TLRPC.ChatFull) obj, 0, bool, bool);
                return;
            case 1:
                bw2 bw2Var = (bw2) obj2;
                bw2Var.E = false;
                SharedPreferences.Editor edit = oc7.r1(bw2Var.currentAccount).X3.edit();
                String str = ((TLRPC.TL_help_inviteText) obj).message;
                bw2Var.y = str;
                edit.putString("invitelink", str);
                edit.putInt("invitelinktime", (int) (System.currentTimeMillis() / 1000));
                edit.commit();
                return;
            case 2:
                er3 er3Var = (er3) obj2;
                TLObject tLObject = (TLObject) obj;
                dr3 dr3Var2 = er3Var.P;
                dr3 dr3Var3 = er3Var.O;
                dr3 dr3Var4 = er3Var.N;
                dr3 dr3Var5 = er3Var.M;
                dr3 dr3Var6 = er3Var.L;
                dr3 dr3Var7 = er3Var.K;
                er3Var.F = false;
                er3Var.getUserConfig().b0 = System.currentTimeMillis();
                er3Var.getUserConfig().u(false);
                if (tLObject != null) {
                    TL_account.autoDownloadSettings autodownloadsettings = (TL_account.autoDownloadSettings) tLObject;
                    dr3Var7.d(autodownloadsettings.low);
                    dr3Var7.e = false;
                    dr3Var6.d(autodownloadsettings.medium);
                    dr3Var5.d(autodownloadsettings.high);
                    for (int i2 = 0; i2 < 3; i2++) {
                        if (i2 == 0) {
                            dr3Var = dr3Var4;
                        } else if (i2 == 1) {
                            dr3Var = dr3Var3;
                        } else {
                            dr3Var = dr3Var2;
                        }
                        if (dr3Var.a(dr3Var7)) {
                            dr3Var.d(autodownloadsettings.low);
                            dr3Var.e = false;
                        } else if (dr3Var.a(dr3Var6)) {
                            dr3Var.d(autodownloadsettings.medium);
                        } else if (dr3Var.a(dr3Var5)) {
                            dr3Var.d(autodownloadsettings.high);
                        }
                    }
                    SharedPreferences.Editor edit2 = oc7.r1(er3Var.currentAccount).X3.edit();
                    edit2.putString("mobilePreset", dr3Var4.toString());
                    edit2.putString("wifiPreset", dr3Var3.toString());
                    edit2.putString("roamingPreset", dr3Var2.toString());
                    edit2.putString("preset0", dr3Var7.toString());
                    edit2.putString("preset1", dr3Var6.toString());
                    edit2.putString("preset2", dr3Var5.toString());
                    edit2.commit();
                    dr3Var7.toString();
                    dr3Var6.toString();
                    dr3Var5.toString();
                    er3Var.g();
                    return;
                }
                return;
            case 3:
                er3 er3Var2 = (er3) obj2;
                ArrayList arrayList = (ArrayList) obj;
                try {
                    SQLitePreparedStatement executeFast = er3Var2.getMessagesStorage().b.executeFast("DELETE FROM downloading_documents WHERE hash = ? AND id = ?");
                    for (int i3 = 0; i3 < arrayList.size(); i3++) {
                        executeFast.requery();
                        executeFast.bindInteger(1, ((k47) arrayList.get(i3)).F0().dc_id);
                        executeFast.bindLong(2, ((k47) arrayList.get(i3)).F0().id);
                        executeFast.step();
                        try {
                            bc4.G(er3Var2.currentAccount);
                            bc4.M(((k47) arrayList.get(i3)).k, false, true).delete();
                        } catch (Exception e) {
                            fc4.g(e, true);
                        }
                    }
                    executeFast.dispose();
                    return;
                } catch (Exception e2) {
                    fc4.g(e2, true);
                    return;
                }
            case 4:
                oc7.r1(((lv4) obj2).currentAccount).T3(((TLRPC.TL_payments_paymentResult) obj).updates, false);
                return;
            case 5:
                oc7 oc7Var = (oc7) obj2;
                TLRPC.Message message = (TLRPC.Message) obj;
                a6a sendMessagesHelper = oc7Var.getSendMessagesHelper();
                sendMessagesHelper.getClass();
                if (message.reply_markup != null) {
                    List<String> list = (List) sendMessagesHelper.s.remove(message.dialog_id + "_" + message.id);
                    if (list != null) {
                        for (String str2 : list) {
                            sendMessagesHelper.r.remove(str2);
                        }
                    }
                }
                if (!message.out && message.dialog_id == 777000) {
                    TLRPC.MessageAction messageAction = message.action;
                    if (messageAction instanceof TLRPC.TL_messageActionWalletTonConnectRequest) {
                        TLRPC.TL_messageActionWalletTonConnectRequest tL_messageActionWalletTonConnectRequest = (TLRPC.TL_messageActionWalletTonConnectRequest) messageAction;
                        if (tL_messageActionWalletTonConnectRequest.accepted || tL_messageActionWalletTonConnectRequest.declined) {
                            c.C(oc7Var.currentAccount).g.o(message.id, tL_messageActionWalletTonConnectRequest.session_id);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 6:
                jb6 D0 = jb6.D0();
                TLRPC.TL_langPackDifference tL_langPackDifference = ((TL_update.TL_updateLangPack) obj).difference;
                int i4 = ((oc7) obj2).currentAccount;
                if (D0.B != null) {
                    String lowerCase = tL_langPackDifference.lang_code.replace('-', '_').toLowerCase();
                    if (lowerCase.equals(D0.B.c) || lowerCase.equals(D0.B.e)) {
                        D0.b1(D0.B, tL_langPackDifference, i4, false, null);
                        return;
                    }
                    return;
                }
                return;
            case 7:
                jb6.D0().Z0(((oc7) obj2).currentAccount, ((TL_update.TL_updateLangPackTooLong) obj).lang_code, false, null);
                return;
            case 8:
                oc7 oc7Var2 = (oc7) obj2;
                TLRPC.TL_config tL_config = (TLRPC.TL_config) obj;
                oc7Var2.getDownloadController().s(false);
                oc7Var2.W2(true);
                oc7Var2.I(true);
                oc7Var2.C3 = true;
                oc7Var2.Q2 = tL_config.megagroup_size_max;
                oc7Var2.O2 = tL_config.chat_size_max;
                oc7Var2.R2 = tL_config.edit_time_limit;
                oc7Var2.S2 = tL_config.rating_e_decay;
                oc7Var2.W2 = tL_config.stickers_recent_limit;
                oc7Var2.T2 = tL_config.revoke_time_limit;
                oc7Var2.U2 = tL_config.revoke_pm_time_limit;
                oc7Var2.V2 = tL_config.revoke_pm_inbox;
                oc7Var2.D3 = tL_config.fpnv_allowed;
                String str3 = tL_config.me_url_prefix;
                oc7Var2.N2 = str3;
                boolean z = tL_config.force_try_ipv6;
                if (str3.endsWith("/")) {
                    oc7Var2.N2 = ts2.m(1, 0, oc7Var2.N2);
                }
                boolean startsWith = oc7Var2.N2.startsWith("https://");
                String str4 = oc7Var2.N2;
                if (startsWith) {
                    oc7Var2.N2 = str4.substring(8);
                } else if (str4.startsWith("http://")) {
                    oc7Var2.N2 = oc7Var2.N2.substring(7);
                }
                oc7Var2.Z2 = tL_config.call_receive_timeout_ms;
                oc7Var2.a3 = tL_config.call_ring_timeout_ms;
                oc7Var2.b3 = tL_config.call_connect_timeout_ms;
                oc7Var2.c3 = tL_config.call_packet_timeout_ms;
                oc7Var2.j3 = tL_config.message_length_max;
                oc7Var2.k3 = tL_config.caption_length_max;
                oc7Var2.m3 = tL_config.preload_featured_stickers;
                String str5 = tL_config.gif_search_username;
                if (str5 != null) {
                    oc7Var2.o3 = str5;
                }
                if (oc7Var2.p3 != null) {
                    oc7Var2.p3 = tL_config.img_search_username;
                }
                oc7Var2.l3 = tL_config.blocked_mode;
                oc7Var2.q3 = tL_config.dc_txt_domain_name;
                oc7Var2.r3 = tL_config.webfile_dc_id;
                String str6 = tL_config.suggested_lang_code;
                if (str6 != null) {
                    String str7 = oc7Var2.s3;
                    if (str7 != null && str7.equals(str6)) {
                        objArr = null;
                    } else {
                        objArr = 1;
                    }
                    oc7Var2.s3 = tL_config.suggested_lang_code;
                    if (objArr != null) {
                        jb6.D0().V0(oc7Var2.currentAccount, true);
                    }
                }
                cmb.k1(oc7Var2.currentAccount, false);
                cmb.F(false);
                if (tL_config.static_maps_provider == null) {
                    tL_config.static_maps_provider = "telegram";
                }
                oc7Var2.i3 = null;
                oc7Var2.f3 = 2;
                oc7Var2.g3 = 0;
                hg9.r(tL_config.static_maps_provider, new StringBuilder("map providers = "));
                String[] split = tL_config.static_maps_provider.split(",");
                for (int i5 = 0; i5 < split.length; i5++) {
                    String[] split2 = split[i5].split("\\+");
                    if (split2.length > 0) {
                        String[] split3 = split2[0].split(":");
                        if (split3.length > 0) {
                            if ("yandex".equals(split3[0])) {
                                if (i5 == 0) {
                                    if (split2.length > 1) {
                                        oc7Var2.f3 = 3;
                                    } else {
                                        oc7Var2.f3 = 1;
                                    }
                                }
                                oc7Var2.g3 |= 4;
                            } else if ("google".equals(split3[0])) {
                                if (i5 == 0 && split2.length > 1) {
                                    oc7Var2.f3 = 4;
                                }
                                oc7Var2.g3 |= 1;
                            } else if ("telegram".equals(split3[0])) {
                                if (i5 == 0) {
                                    oc7Var2.f3 = 2;
                                }
                                oc7Var2.g3 |= 2;
                            }
                            if (split3.length > 1) {
                                oc7Var2.i3 = split3[1];
                            }
                        }
                    }
                }
                SharedPreferences.Editor edit3 = oc7Var2.X3.edit();
                edit3.putBoolean("remoteConfigLoaded", oc7Var2.C3);
                edit3.putInt("maxGroupCount", oc7Var2.O2);
                edit3.putInt("maxMegagroupCount", oc7Var2.Q2);
                edit3.putInt("maxEditTime", oc7Var2.R2);
                edit3.putInt("ratingDecay", oc7Var2.S2);
                edit3.putInt("maxRecentGifsCount", oc7Var2.Y2);
                edit3.putInt("maxRecentStickersCount", oc7Var2.W2);
                edit3.putInt("maxFaveStickersCount", oc7Var2.X2);
                edit3.putInt("callReceiveTimeout", oc7Var2.Z2);
                edit3.putInt("callRingTimeout", oc7Var2.a3);
                edit3.putInt("callConnectTimeout", oc7Var2.b3);
                edit3.putInt("callPacketTimeout", oc7Var2.c3);
                edit3.putString("linkPrefix", oc7Var2.N2);
                edit3.putInt("maxFolderPinnedDialogsCountDefault", oc7Var2.d3);
                edit3.putInt("maxFolderPinnedDialogsCountPremium", oc7Var2.e3);
                edit3.putInt("maxMessageLength", oc7Var2.j3);
                edit3.putInt("maxCaptionLength", oc7Var2.k3);
                edit3.putBoolean("preloadFeaturedStickers", oc7Var2.m3);
                edit3.putInt("revokeTimeLimit", oc7Var2.T2);
                edit3.putInt("revokeTimePmLimit", oc7Var2.U2);
                edit3.putInt("mapProvider", oc7Var2.f3);
                String str8 = oc7Var2.i3;
                if (str8 != null) {
                    edit3.putString("pk", str8);
                } else {
                    edit3.remove("pk");
                }
                edit3.putBoolean("canRevokePmInbox", oc7Var2.V2);
                edit3.putBoolean("fpnvAllowed", oc7Var2.D3);
                edit3.putBoolean("blockedCountry", oc7Var2.l3);
                edit3.putString("gifSearchBot", oc7Var2.o3);
                edit3.putString("imageSearchBot", oc7Var2.p3);
                edit3.putString("dcDomainName2", oc7Var2.q3);
                edit3.putInt("webFileDatacenterId", oc7Var2.r3);
                edit3.putString("suggestedLangCode", oc7Var2.s3);
                edit3.putBoolean("forceTryIpV6", z);
                String str9 = tL_config.autologin_token;
                oc7Var2.z3 = str9;
                edit3.putString("autologinToken", str9);
                edit3.commit();
                oc7Var2.getConnectionsManager().setForceTryIpV6(z);
                jb6 D02 = jb6.D0();
                int i6 = oc7Var2.currentAccount;
                int i7 = tL_config.lang_pack_version;
                int i8 = tL_config.base_lang_pack_version;
                hb6 hb6Var = D02.B;
                if (hb6Var != null && (hb6Var.i() || D02.B.j())) {
                    if (D02.B.g()) {
                        int i9 = D02.B.i;
                        if (i9 < i8) {
                            fc4.b("LocaleController checkUpdateForCurrentRemoteLocale base version is out of date, applying (local is " + i9 + ", remote is " + i8 + ")");
                            D02.P = true;
                            hb6 hb6Var2 = D02.B;
                            D02.f(hb6Var2, hb6Var2.e, false, i6, new za6(D02, i6, (byte) 0));
                        } else {
                            fc4.b("LocaleController checkUpdateForCurrentRemoteLocale base version is up to date (local is " + i9 + ", remote is " + i8 + ")");
                        }
                    }
                    int i10 = D02.B.h;
                    if (i10 < i7) {
                        fc4.b("LocaleController checkUpdateForCurrentRemoteLocale version is out of date, applying (local is " + i10 + ", remote is " + i7 + ")");
                        D02.P = true;
                        hb6 hb6Var3 = D02.B;
                        D02.f(hb6Var3, hb6Var3.c, false, i6, new za6(D02, i6, (byte) 1));
                    } else {
                        fc4.b("LocaleController checkUpdateForCurrentRemoteLocale version is up to date (local is " + i10 + ", remote is " + i7 + ")");
                    }
                }
                oc7Var2.getNotificationCenter().k(180, new Object[0]);
                return;
            case 9:
                oc7 oc7Var3 = (oc7) obj2;
                TLRPC.TL_messages_invitedUsers tL_messages_invitedUsers = (TLRPC.TL_messages_invitedUsers) obj;
                oc7Var3.d4(tL_messages_invitedUsers.updates.users, false);
                oc7Var3.X3(tL_messages_invitedUsers.updates.chats, false);
                ArrayList<TLRPC.Chat> arrayList2 = tL_messages_invitedUsers.updates.chats;
                if (arrayList2 != null && !arrayList2.isEmpty()) {
                    oc7Var3.getNotificationCenter().k(29, Long.valueOf(tL_messages_invitedUsers.updates.chats.get(0).id));
                    ik.f(oc7Var3.currentAccount, tL_messages_invitedUsers.updates.chats.get(0), tL_messages_invitedUsers);
                    return;
                }
                oc7Var3.getNotificationCenter().k(30, new Object[0]);
                return;
            case 10:
                cf7 cf7Var = (cf7) obj2;
                k47 k47Var = (k47) obj;
                try {
                    NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(k47Var.k.getObjectSize());
                    k47Var.k.serializeToStream(nativeByteBuffer);
                    if (k47Var.a == 2) {
                        i = 1;
                    } else {
                        i = 0;
                    }
                    if (k47Var.f) {
                        i |= 2;
                    }
                    SQLitePreparedStatement executeFast2 = cf7Var.b.executeFast("REPLACE INTO unread_push_messages VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
                    executeFast2.requery();
                    executeFast2.bindLong(1, k47.B0(k47Var.k));
                    executeFast2.bindInteger(2, k47Var.e1());
                    executeFast2.bindLong(3, k47Var.k.random_id);
                    executeFast2.bindInteger(4, k47Var.k.date);
                    executeFast2.bindByteBuffer(5, nativeByteBuffer);
                    CharSequence charSequence = k47Var.v;
                    if (charSequence == null) {
                        executeFast2.bindNull(6);
                    } else {
                        executeFast2.bindString(6, charSequence.toString());
                    }
                    String str10 = k47Var.b;
                    if (str10 == null) {
                        executeFast2.bindNull(7);
                    } else {
                        executeFast2.bindString(7, str10);
                    }
                    String str11 = k47Var.c;
                    if (str11 == null) {
                        executeFast2.bindNull(8);
                    } else {
                        executeFast2.bindString(8, str11);
                    }
                    executeFast2.bindInteger(9, i);
                    executeFast2.bindLong(10, k47.b2(cf7Var.currentAccount, k47Var.k, false, false));
                    executeFast2.bindInteger(11, (k47Var.I ? 1 : 0) + (k47Var.J ? 1 : 0));
                    executeFast2.step();
                    nativeByteBuffer.reuse();
                    executeFast2.dispose();
                    return;
                } catch (Exception e3) {
                    cf7Var.n(e3, true);
                    return;
                }
            case 11:
                jva.v(((a6a) obj2).currentAccount, false).d0((ArrayList) obj);
                return;
            case 12:
                qwb qwbVar = (qwb) obj2;
                HashMap hashMap = (HashMap) obj;
                HashSet hashSet = new HashSet();
                for (bf7 bf7Var : hashMap.keySet()) {
                    int intValue = ((Integer) hashMap.get(bf7Var)).intValue();
                    TLRPC.TL_forumTopic f3 = qwbVar.f(-bf7Var.a, bf7Var.b);
                    if (f3 != null) {
                        f3.read_outbox_max_id = Math.max(f3.read_outbox_max_id, intValue);
                        hashSet.add(Long.valueOf(-bf7Var.a));
                        TLRPC.Message message2 = f3.topMessage;
                        if (message2 != null && f3.read_outbox_max_id >= message2.id) {
                            message2.unread = false;
                        }
                    }
                }
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    nm7.f(qwbVar.currentAccount).k(324, (Long) it.next(), Boolean.TRUE);
                }
                return;
            case 13:
                qwb qwbVar2 = (qwb) obj2;
                List list2 = (List) obj;
                vh6 vh6Var = qwbVar2.e;
                HashSet hashSet2 = new HashSet();
                vh6 vh6Var2 = null;
                for (int i11 = 0; i11 < list2.size(); i11++) {
                    nwb nwbVar = (nwb) list2.get(i11);
                    if (nwbVar.i) {
                        if (vh6Var2 == null) {
                            vh6Var2 = new vh6();
                        }
                        ArrayList arrayList3 = (ArrayList) vh6Var2.f(nwbVar.b);
                        if (arrayList3 == null) {
                            arrayList3 = new ArrayList();
                            vh6Var2.k(arrayList3, nwbVar.b);
                        }
                        TLRPC.TL_forumTopic tL_forumTopic = new TLRPC.TL_forumTopic();
                        if (sd2.o0(qwbVar2.currentAccount, nwbVar.b)) {
                            TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                            tL_forumTopic.from_id = tL_peerUser;
                            tL_peerUser.user_id = nwbVar.c;
                        } else {
                            tL_forumTopic.id = (int) nwbVar.c;
                        }
                        arrayList3.add(tL_forumTopic);
                    } else {
                        TLRPC.TL_forumTopic f4 = qwbVar2.f(-nwbVar.b, nwbVar.c);
                        if (f4 != null) {
                            if (nwbVar.j) {
                                int i12 = nwbVar.e;
                                if (i12 >= 0) {
                                    f4.unread_count = i12;
                                }
                                int i13 = nwbVar.d;
                                if (i13 >= 0) {
                                    f4.unread_mentions_count = i13;
                                }
                            } else {
                                vh6Var.l(qwb.p(f4.top_message, -nwbVar.b));
                                f4.topMessage = nwbVar.g;
                                f4.groupedMessages = nwbVar.h;
                                int i14 = nwbVar.f;
                                f4.top_message = i14;
                                f4.unread_count = nwbVar.e;
                                f4.unread_mentions_count = nwbVar.d;
                                vh6Var.k(f4, qwb.p(i14, -nwbVar.b));
                            }
                            int i15 = nwbVar.a;
                            if (i15 > 0) {
                                f4.totalMessagesCount = i15;
                            }
                            hashSet2.add(Long.valueOf(-nwbVar.b));
                        }
                        if (f4 != null && nwbVar.k) {
                            f4.totalMessagesCount = 0;
                            qwbVar2.k(nwbVar.b, nwbVar.c);
                        }
                    }
                }
                Iterator it2 = hashSet2.iterator();
                while (it2.hasNext()) {
                    qwbVar2.y(((Long) it2.next()).longValue(), true);
                }
                if (vh6Var2 != null) {
                    for (int i16 = 0; i16 < vh6Var2.m(); i16++) {
                        qwbVar2.v(-vh6Var2.j(i16), (ArrayList) vh6Var2.n(i16), null);
                    }
                    return;
                }
                return;
            case 14:
                qwb qwbVar3 = (qwb) obj2;
                d dVar = (d) obj;
                qwbVar3.getClass();
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(dVar.getContext());
                String M0 = jb6.M0(2131748735, null);
                he heVar = alertDialog$Builder.a;
                heVar.S = M0;
                heVar.U = jb6.a0(null, null, 2131748705, Integer.valueOf(oc7.r1(qwbVar3.currentAccount).l4.p1.f()));
                alertDialog$Builder.j(jb6.M0(2131747564, null), null);
                dVar.showDialog(heVar);
                return;
            case 15:
                TL_aicompose.TL_aiComposeTone tL_aiComposeTone = (TL_aicompose.TL_aiComposeTone) obj;
                id idVar = ((a1) obj2).r2;
                idVar.b.remove(tL_aiComposeTone);
                idVar.d();
                idVar.c();
                TL_aicompose.saveTone savetone = new TL_aicompose.saveTone();
                savetone.tone = TL_aicompose.InputAiComposeTone.from(tL_aiComposeTone);
                savetone.unsave = true;
                ConnectionsManager.getInstance(idVar.a).sendRequest(savetone, null);
                return;
            case 16:
                e0 e0Var = (e0) obj2;
                TL_aicompose.TL_aiComposeTone tL_aiComposeTone2 = (TL_aicompose.TL_aiComposeTone) obj;
                d S = LaunchActivity.S();
                if (S != null) {
                    S.presentFragment(ProfileActivity.S2(tL_aiComposeTone2.author_id));
                    e0Var.dismiss();
                    return;
                }
                return;
            case 17:
                ((View.OnClickListener) obj).onClick((n5) obj2);
                return;
            case 18:
                a aVar = (a) obj2;
                boolean canScrollVertically = ((ww9) obj).canScrollVertically(-1);
                boolean z2 = !canScrollVertically;
                if (aVar.D1 != z2) {
                    ValueAnimator valueAnimator = aVar.F1;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    float f5 = aVar.E1;
                    aVar.D1 = z2;
                    if (!canScrollVertically) {
                        f = 1.0f;
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f5, f);
                    aVar.F1 = ofFloat;
                    ofFloat.addUpdateListener(new q5(aVar, (byte) 4));
                    aVar.F1.addListener(new s5(aVar, z2, (byte) 1));
                    aVar.F1.setDuration(320L);
                    aVar.F1.setInterpolator(d53.h);
                    aVar.F1.start();
                    return;
                }
                return;
            case 19:
                a aVar2 = (a) obj2;
                boolean canScrollVertically2 = ((RecyclerView) obj).canScrollVertically(-1);
                boolean z3 = !canScrollVertically2;
                if (aVar2.D1 != z3) {
                    ValueAnimator valueAnimator2 = aVar2.F1;
                    if (valueAnimator2 != null) {
                        valueAnimator2.cancel();
                    }
                    float f6 = aVar2.E1;
                    aVar2.D1 = z3;
                    if (!canScrollVertically2) {
                        f = 1.0f;
                    }
                    ValueAnimator ofFloat2 = ValueAnimator.ofFloat(f6, f);
                    aVar2.F1 = ofFloat2;
                    ofFloat2.addUpdateListener(new q5(aVar2, (byte) 3));
                    aVar2.F1.addListener(new s5(aVar2, z3, (byte) 0));
                    aVar2.F1.setDuration(320L);
                    aVar2.F1.setInterpolator(d53.h);
                    aVar2.F1.start();
                    return;
                }
                return;
            case 20:
                ActionBarLayout actionBarLayout = (ActionBarLayout) obj2;
                Drawable drawable = ActionBarLayout.w1;
                actionBarLayout.d0((d) obj, false);
                actionBarLayout.setVisibility(8);
                View view = actionBarLayout.I0;
                if (view != null) {
                    view.setVisibility(8);
                    return;
                }
                return;
            case 21:
                d dVar2 = (d) obj2;
                d dVar3 = (d) obj;
                Drawable drawable2 = ActionBarLayout.w1;
                if (dVar2 != null) {
                    dVar2.onTransitionAnimationEnd(false, false);
                }
                dVar3.onTransitionAnimationEnd(true, false);
                dVar3.onBecomeFullyVisible();
                return;
            case 22:
                bc bcVar = (bc) obj2;
                TLRPC.UserFull userFull = (TLRPC.UserFull) obj;
                if (userFull != null) {
                    bcVar.Z = false;
                    TL_payments.starRefProgram starrefprogram = userFull.starref_program;
                    bcVar.b0 = starrefprogram;
                    if (starrefprogram == null) {
                        bcVar.Z = true;
                        bcVar.b0 = bcVar.E0();
                        bcVar.a0 = null;
                    } else {
                        TL_payments.starRefProgram starrefprogram2 = new TL_payments.starRefProgram();
                        bcVar.a0 = starrefprogram2;
                        TL_payments.starRefProgram starrefprogram3 = bcVar.b0;
                        starrefprogram2.commission_permille = starrefprogram3.commission_permille;
                        starrefprogram2.duration_months = starrefprogram3.duration_months;
                    }
                }
                bcVar.K0(true);
                return;
            case 23:
                l11.u(((jc) obj2).getContext(), (String) obj);
                return;
            case 24:
                pp8 pp8Var = (pp8) obj;
                if (((boolean[]) obj2)[0]) {
                    pp8Var.run();
                    return;
                }
                return;
            case 25:
                ((ht) obj2).c0((TLRPC.TL_messages_archivedStickers) obj);
                return;
            case 26:
                o oVar = (o) obj2;
                vu vuVar = (vu) obj;
                sx sxVar = oVar.L;
                if (sxVar != null) {
                    sxVar.a(true);
                }
                if (oVar.O0 == vuVar) {
                    oVar.O0 = null;
                    return;
                }
                return;
            case 27:
                ((o) obj2).T0.d();
                ((AnimatorSet) obj).start();
                return;
            case 28:
                ((gw) obj2).b((SpannableString) obj);
                return;
            default:
                i10.a = (AudioManager) ((Context) obj2).getSystemService("audio");
                ((gs2) obj).e();
                return;
        }
    }
}
