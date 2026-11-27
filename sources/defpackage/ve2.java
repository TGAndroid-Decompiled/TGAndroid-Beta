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
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.Wallet.c;
import org.telegram.ui.o;
public final class ve2 implements Runnable {
    public final byte a;
    public final Object b;
    public final Object c;

    public ve2(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    @Override
    public final void run() {
        kq3 kq3Var;
        Object[] objArr;
        int i;
        Exception runtimeException;
        byte b = this.a;
        float f = 0.0f;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                jn7 f2 = jn7.f(((af2) obj2).currentAccount);
                Boolean bool = Boolean.FALSE;
                f2.k(31, (TLRPC.ChatFull) obj, 0, bool, bool);
                return;
            case 1:
                lv2 lv2Var = (lv2) obj2;
                lv2Var.E = false;
                SharedPreferences.Editor edit = uc7.s1(lv2Var.currentAccount).X3.edit();
                String str = ((TLRPC.TL_help_inviteText) obj).message;
                lv2Var.y = str;
                edit.putString("invitelink", str);
                edit.putInt("invitelinktime", (int) (System.currentTimeMillis() / 1000));
                edit.commit();
                return;
            case 2:
                lq3 lq3Var = (lq3) obj2;
                TLObject tLObject = (TLObject) obj;
                kq3 kq3Var2 = lq3Var.P;
                kq3 kq3Var3 = lq3Var.O;
                kq3 kq3Var4 = lq3Var.N;
                kq3 kq3Var5 = lq3Var.M;
                kq3 kq3Var6 = lq3Var.L;
                kq3 kq3Var7 = lq3Var.K;
                lq3Var.F = false;
                lq3Var.getUserConfig().b0 = System.currentTimeMillis();
                lq3Var.getUserConfig().u(false);
                if (tLObject != null) {
                    TL_account.autoDownloadSettings autodownloadsettings = (TL_account.autoDownloadSettings) tLObject;
                    kq3Var7.d(autodownloadsettings.low);
                    kq3Var7.e = false;
                    kq3Var6.d(autodownloadsettings.medium);
                    kq3Var5.d(autodownloadsettings.high);
                    for (int i2 = 0; i2 < 3; i2++) {
                        if (i2 == 0) {
                            kq3Var = kq3Var4;
                        } else if (i2 == 1) {
                            kq3Var = kq3Var3;
                        } else {
                            kq3Var = kq3Var2;
                        }
                        if (kq3Var.a(kq3Var7)) {
                            kq3Var.d(autodownloadsettings.low);
                            kq3Var.e = false;
                        } else if (kq3Var.a(kq3Var6)) {
                            kq3Var.d(autodownloadsettings.medium);
                        } else if (kq3Var.a(kq3Var5)) {
                            kq3Var.d(autodownloadsettings.high);
                        }
                    }
                    SharedPreferences.Editor edit2 = uc7.s1(lq3Var.currentAccount).X3.edit();
                    edit2.putString("mobilePreset", kq3Var4.toString());
                    edit2.putString("wifiPreset", kq3Var3.toString());
                    edit2.putString("roamingPreset", kq3Var2.toString());
                    edit2.putString("preset0", kq3Var7.toString());
                    edit2.putString("preset1", kq3Var6.toString());
                    edit2.putString("preset2", kq3Var5.toString());
                    edit2.commit();
                    kq3Var7.toString();
                    kq3Var6.toString();
                    kq3Var5.toString();
                    lq3Var.g();
                    return;
                }
                return;
            case 3:
                lq3 lq3Var2 = (lq3) obj2;
                ArrayList arrayList = (ArrayList) obj;
                try {
                    SQLitePreparedStatement executeFast = lq3Var2.getMessagesStorage().b.executeFast("DELETE FROM downloading_documents WHERE hash = ? AND id = ?");
                    for (int i3 = 0; i3 < arrayList.size(); i3++) {
                        executeFast.requery();
                        executeFast.bindInteger(1, ((r47) arrayList.get(i3)).F0().dc_id);
                        executeFast.bindLong(2, ((r47) arrayList.get(i3)).F0().id);
                        executeFast.step();
                        try {
                            xb4.G(lq3Var2.currentAccount);
                            xb4.M(((r47) arrayList.get(i3)).k, false, true).delete();
                        } catch (Exception e) {
                            cc4.g(e, true);
                        }
                    }
                    executeFast.dispose();
                    return;
                } catch (Exception e2) {
                    cc4.g(e2, true);
                    return;
                }
            case 4:
                uc7.s1(((ov4) obj2).currentAccount).Y3(((TLRPC.TL_payments_paymentResult) obj).updates, false);
                return;
            case 5:
                uc7 uc7Var = (uc7) obj2;
                TLRPC.Message message = (TLRPC.Message) obj;
                r7a sendMessagesHelper = uc7Var.getSendMessagesHelper();
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
                            c.C(uc7Var.currentAccount).g.o(message.id, tL_messageActionWalletTonConnectRequest.session_id);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 6:
                ob6 D0 = ob6.D0();
                TLRPC.TL_langPackDifference tL_langPackDifference = ((TL_update.TL_updateLangPack) obj).difference;
                int i4 = ((uc7) obj2).currentAccount;
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
                ob6.D0().Z0(((uc7) obj2).currentAccount, ((TL_update.TL_updateLangPackTooLong) obj).lang_code, false, null);
                return;
            case 8:
                uc7 uc7Var2 = (uc7) obj2;
                TLRPC.TL_config tL_config = (TLRPC.TL_config) obj;
                uc7Var2.getDownloadController().s(false);
                uc7Var2.a3(true);
                uc7Var2.K(true);
                uc7Var2.C3 = true;
                uc7Var2.Q2 = tL_config.megagroup_size_max;
                uc7Var2.O2 = tL_config.chat_size_max;
                uc7Var2.R2 = tL_config.edit_time_limit;
                uc7Var2.S2 = tL_config.rating_e_decay;
                uc7Var2.W2 = tL_config.stickers_recent_limit;
                uc7Var2.T2 = tL_config.revoke_time_limit;
                uc7Var2.U2 = tL_config.revoke_pm_time_limit;
                uc7Var2.V2 = tL_config.revoke_pm_inbox;
                uc7Var2.D3 = tL_config.fpnv_allowed;
                String str3 = tL_config.me_url_prefix;
                uc7Var2.N2 = str3;
                boolean z = tL_config.force_try_ipv6;
                if (str3.endsWith("/")) {
                    uc7Var2.N2 = bs2.n(1, 0, uc7Var2.N2);
                }
                boolean startsWith = uc7Var2.N2.startsWith("https://");
                String str4 = uc7Var2.N2;
                if (startsWith) {
                    uc7Var2.N2 = str4.substring(8);
                } else if (str4.startsWith("http://")) {
                    uc7Var2.N2 = uc7Var2.N2.substring(7);
                }
                uc7Var2.Z2 = tL_config.call_receive_timeout_ms;
                uc7Var2.a3 = tL_config.call_ring_timeout_ms;
                uc7Var2.b3 = tL_config.call_connect_timeout_ms;
                uc7Var2.c3 = tL_config.call_packet_timeout_ms;
                uc7Var2.j3 = tL_config.message_length_max;
                uc7Var2.k3 = tL_config.caption_length_max;
                uc7Var2.m3 = tL_config.preload_featured_stickers;
                String str5 = tL_config.gif_search_username;
                if (str5 != null) {
                    uc7Var2.o3 = str5;
                }
                if (uc7Var2.p3 != null) {
                    uc7Var2.p3 = tL_config.img_search_username;
                }
                uc7Var2.l3 = tL_config.blocked_mode;
                uc7Var2.q3 = tL_config.dc_txt_domain_name;
                uc7Var2.r3 = tL_config.webfile_dc_id;
                String str6 = tL_config.suggested_lang_code;
                if (str6 != null) {
                    String str7 = uc7Var2.s3;
                    if (str7 != null && str7.equals(str6)) {
                        objArr = null;
                    } else {
                        objArr = 1;
                    }
                    uc7Var2.s3 = tL_config.suggested_lang_code;
                    if (objArr != null) {
                        ob6.D0().V0(uc7Var2.currentAccount, true);
                    }
                }
                aob.k1(uc7Var2.currentAccount, false);
                aob.F(false);
                if (tL_config.static_maps_provider == null) {
                    tL_config.static_maps_provider = "telegram";
                }
                uc7Var2.i3 = null;
                uc7Var2.f3 = 2;
                uc7Var2.g3 = 0;
                uh9.s(tL_config.static_maps_provider, new StringBuilder("map providers = "));
                String[] split = tL_config.static_maps_provider.split(",");
                for (int i5 = 0; i5 < split.length; i5++) {
                    String[] split2 = split[i5].split("\\+");
                    if (split2.length > 0) {
                        String[] split3 = split2[0].split(":");
                        if (split3.length > 0) {
                            if ("yandex".equals(split3[0])) {
                                if (i5 == 0) {
                                    if (split2.length > 1) {
                                        uc7Var2.f3 = 3;
                                    } else {
                                        uc7Var2.f3 = 1;
                                    }
                                }
                                uc7Var2.g3 |= 4;
                            } else if ("google".equals(split3[0])) {
                                if (i5 == 0 && split2.length > 1) {
                                    uc7Var2.f3 = 4;
                                }
                                uc7Var2.g3 |= 1;
                            } else if ("telegram".equals(split3[0])) {
                                if (i5 == 0) {
                                    uc7Var2.f3 = 2;
                                }
                                uc7Var2.g3 |= 2;
                            }
                            if (split3.length > 1) {
                                uc7Var2.i3 = split3[1];
                            }
                        }
                    }
                }
                SharedPreferences.Editor edit3 = uc7Var2.X3.edit();
                edit3.putBoolean("remoteConfigLoaded", uc7Var2.C3);
                edit3.putInt("maxGroupCount", uc7Var2.O2);
                edit3.putInt("maxMegagroupCount", uc7Var2.Q2);
                edit3.putInt("maxEditTime", uc7Var2.R2);
                edit3.putInt("ratingDecay", uc7Var2.S2);
                edit3.putInt("maxRecentGifsCount", uc7Var2.Y2);
                edit3.putInt("maxRecentStickersCount", uc7Var2.W2);
                edit3.putInt("maxFaveStickersCount", uc7Var2.X2);
                edit3.putInt("callReceiveTimeout", uc7Var2.Z2);
                edit3.putInt("callRingTimeout", uc7Var2.a3);
                edit3.putInt("callConnectTimeout", uc7Var2.b3);
                edit3.putInt("callPacketTimeout", uc7Var2.c3);
                edit3.putString("linkPrefix", uc7Var2.N2);
                edit3.putInt("maxFolderPinnedDialogsCountDefault", uc7Var2.d3);
                edit3.putInt("maxFolderPinnedDialogsCountPremium", uc7Var2.e3);
                edit3.putInt("maxMessageLength", uc7Var2.j3);
                edit3.putInt("maxCaptionLength", uc7Var2.k3);
                edit3.putBoolean("preloadFeaturedStickers", uc7Var2.m3);
                edit3.putInt("revokeTimeLimit", uc7Var2.T2);
                edit3.putInt("revokeTimePmLimit", uc7Var2.U2);
                edit3.putInt("mapProvider", uc7Var2.f3);
                String str8 = uc7Var2.i3;
                if (str8 != null) {
                    edit3.putString("pk", str8);
                } else {
                    edit3.remove("pk");
                }
                edit3.putBoolean("canRevokePmInbox", uc7Var2.V2);
                edit3.putBoolean("fpnvAllowed", uc7Var2.D3);
                edit3.putBoolean("blockedCountry", uc7Var2.l3);
                edit3.putString("gifSearchBot", uc7Var2.o3);
                edit3.putString("imageSearchBot", uc7Var2.p3);
                edit3.putString("dcDomainName2", uc7Var2.q3);
                edit3.putInt("webFileDatacenterId", uc7Var2.r3);
                edit3.putString("suggestedLangCode", uc7Var2.s3);
                edit3.putBoolean("forceTryIpV6", z);
                String str9 = tL_config.autologin_token;
                uc7Var2.z3 = str9;
                edit3.putString("autologinToken", str9);
                edit3.commit();
                uc7Var2.getConnectionsManager().setForceTryIpV6(z);
                ob6 D02 = ob6.D0();
                int i6 = uc7Var2.currentAccount;
                int i7 = tL_config.lang_pack_version;
                int i8 = tL_config.base_lang_pack_version;
                mb6 mb6Var = D02.B;
                if (mb6Var != null && (mb6Var.i() || D02.B.j())) {
                    if (D02.B.g()) {
                        int i9 = D02.B.i;
                        if (i9 < i8) {
                            cc4.b("LocaleController checkUpdateForCurrentRemoteLocale base version is out of date, applying (local is " + i9 + ", remote is " + i8 + ")");
                            D02.P = true;
                            mb6 mb6Var2 = D02.B;
                            D02.f(mb6Var2, mb6Var2.e, false, i6, new eb6(D02, i6, (byte) 0));
                        } else {
                            cc4.b("LocaleController checkUpdateForCurrentRemoteLocale base version is up to date (local is " + i9 + ", remote is " + i8 + ")");
                        }
                    }
                    int i10 = D02.B.h;
                    if (i10 < i7) {
                        cc4.b("LocaleController checkUpdateForCurrentRemoteLocale version is out of date, applying (local is " + i10 + ", remote is " + i7 + ")");
                        D02.P = true;
                        mb6 mb6Var3 = D02.B;
                        D02.f(mb6Var3, mb6Var3.c, false, i6, new eb6(D02, i6, (byte) 1));
                    } else {
                        cc4.b("LocaleController checkUpdateForCurrentRemoteLocale version is up to date (local is " + i10 + ", remote is " + i7 + ")");
                    }
                }
                uc7Var2.getNotificationCenter().k(180, new Object[0]);
                return;
            case 9:
                uc7 uc7Var3 = (uc7) obj2;
                TLRPC.TL_messages_invitedUsers tL_messages_invitedUsers = (TLRPC.TL_messages_invitedUsers) obj;
                uc7Var3.j4(tL_messages_invitedUsers.updates.users, false);
                uc7Var3.c4(tL_messages_invitedUsers.updates.chats, false);
                ArrayList<TLRPC.Chat> arrayList2 = tL_messages_invitedUsers.updates.chats;
                if (arrayList2 != null && !arrayList2.isEmpty()) {
                    uc7Var3.getNotificationCenter().k(29, Long.valueOf(tL_messages_invitedUsers.updates.chats.get(0).id));
                    jj.f(uc7Var3.currentAccount, tL_messages_invitedUsers.updates.chats.get(0), tL_messages_invitedUsers);
                    return;
                }
                uc7Var3.getNotificationCenter().k(30, new Object[0]);
                return;
            case 10:
                jf7 jf7Var = (jf7) obj2;
                r47 r47Var = (r47) obj;
                try {
                    NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(r47Var.k.getObjectSize());
                    r47Var.k.serializeToStream(nativeByteBuffer);
                    if (r47Var.a == 2) {
                        i = 1;
                    } else {
                        i = 0;
                    }
                    if (r47Var.f) {
                        i |= 2;
                    }
                    SQLitePreparedStatement executeFast2 = jf7Var.b.executeFast("REPLACE INTO unread_push_messages VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
                    executeFast2.requery();
                    executeFast2.bindLong(1, r47.B0(r47Var.k));
                    executeFast2.bindInteger(2, r47Var.e1());
                    executeFast2.bindLong(3, r47Var.k.random_id);
                    executeFast2.bindInteger(4, r47Var.k.date);
                    executeFast2.bindByteBuffer(5, nativeByteBuffer);
                    CharSequence charSequence = r47Var.v;
                    if (charSequence == null) {
                        executeFast2.bindNull(6);
                    } else {
                        executeFast2.bindString(6, charSequence.toString());
                    }
                    String str10 = r47Var.b;
                    if (str10 == null) {
                        executeFast2.bindNull(7);
                    } else {
                        executeFast2.bindString(7, str10);
                    }
                    String str11 = r47Var.c;
                    if (str11 == null) {
                        executeFast2.bindNull(8);
                    } else {
                        executeFast2.bindString(8, str11);
                    }
                    executeFast2.bindInteger(9, i);
                    executeFast2.bindLong(10, r47.b2(jf7Var.currentAccount, r47Var.k, false, false));
                    executeFast2.bindInteger(11, (r47Var.I ? 1 : 0) + (r47Var.J ? 1 : 0));
                    executeFast2.step();
                    nativeByteBuffer.reuse();
                    executeFast2.dispose();
                    return;
                } catch (Exception e3) {
                    jf7Var.n(e3, true);
                    return;
                }
            case 11:
                jxa.v(((r7a) obj2).currentAccount, false).e0((ArrayList) obj);
                return;
            case 12:
                qyb qybVar = (qyb) obj2;
                HashMap hashMap = (HashMap) obj;
                HashSet hashSet = new HashSet();
                for (if7 if7Var : hashMap.keySet()) {
                    int intValue = ((Integer) hashMap.get(if7Var)).intValue();
                    TLRPC.TL_forumTopic f3 = qybVar.f(-if7Var.a, if7Var.b);
                    if (f3 != null) {
                        f3.read_outbox_max_id = Math.max(f3.read_outbox_max_id, intValue);
                        hashSet.add(Long.valueOf(-if7Var.a));
                        TLRPC.Message message2 = f3.topMessage;
                        if (message2 != null && f3.read_outbox_max_id >= message2.id) {
                            message2.unread = false;
                        }
                    }
                }
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    jn7.f(qybVar.currentAccount).k(323, (Long) it.next(), Boolean.TRUE);
                }
                return;
            case 13:
                qyb qybVar2 = (qyb) obj2;
                List list2 = (List) obj;
                zh6 zh6Var = qybVar2.e;
                HashSet hashSet2 = new HashSet();
                zh6 zh6Var2 = null;
                for (int i11 = 0; i11 < list2.size(); i11++) {
                    nyb nybVar = (nyb) list2.get(i11);
                    if (nybVar.i) {
                        if (zh6Var2 == null) {
                            zh6Var2 = new zh6();
                        }
                        ArrayList arrayList3 = (ArrayList) zh6Var2.f(nybVar.b);
                        if (arrayList3 == null) {
                            arrayList3 = new ArrayList();
                            zh6Var2.k(nybVar.b, arrayList3);
                        }
                        TLRPC.TL_forumTopic tL_forumTopic = new TLRPC.TL_forumTopic();
                        if (xc2.o0(qybVar2.currentAccount, nybVar.b)) {
                            TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                            tL_forumTopic.from_id = tL_peerUser;
                            tL_peerUser.user_id = nybVar.c;
                        } else {
                            tL_forumTopic.id = (int) nybVar.c;
                        }
                        arrayList3.add(tL_forumTopic);
                    } else {
                        TLRPC.TL_forumTopic f4 = qybVar2.f(-nybVar.b, nybVar.c);
                        if (f4 != null) {
                            if (nybVar.j) {
                                int i12 = nybVar.e;
                                if (i12 >= 0) {
                                    f4.unread_count = i12;
                                }
                                int i13 = nybVar.d;
                                if (i13 >= 0) {
                                    f4.unread_mentions_count = i13;
                                }
                            } else {
                                zh6Var.l(qyb.p(f4.top_message, -nybVar.b));
                                f4.topMessage = nybVar.g;
                                f4.groupedMessages = nybVar.h;
                                int i14 = nybVar.f;
                                f4.top_message = i14;
                                f4.unread_count = nybVar.e;
                                f4.unread_mentions_count = nybVar.d;
                                zh6Var.k(qyb.p(i14, -nybVar.b), f4);
                            }
                            int i15 = nybVar.a;
                            if (i15 > 0) {
                                f4.totalMessagesCount = i15;
                            }
                            hashSet2.add(Long.valueOf(-nybVar.b));
                        }
                        if (f4 != null && nybVar.k) {
                            f4.totalMessagesCount = 0;
                            qybVar2.k(nybVar.b, nybVar.c);
                        }
                    }
                }
                Iterator it2 = hashSet2.iterator();
                while (it2.hasNext()) {
                    qybVar2.y(((Long) it2.next()).longValue(), true);
                }
                if (zh6Var2 != null) {
                    for (int i16 = 0; i16 < zh6Var2.m(); i16++) {
                        qybVar2.v(-zh6Var2.j(i16), (ArrayList) zh6Var2.n(i16), null);
                    }
                    return;
                }
                return;
            case 14:
                qyb qybVar3 = (qyb) obj2;
                e eVar = (e) obj;
                qybVar3.getClass();
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(eVar.getContext());
                String M0 = ob6.M0(2131748732, null);
                id idVar = alertDialog$Builder.a;
                idVar.S = M0;
                idVar.U = ob6.a0(null, null, 2131748702, Integer.valueOf(uc7.s1(qybVar3.currentAccount).k4.x1.f()));
                alertDialog$Builder.j(ob6.M0(2131747558, null), null);
                eVar.showDialog(idVar);
                return;
            case 15:
                TL_aicompose.TL_aiComposeTone tL_aiComposeTone = (TL_aicompose.TL_aiComposeTone) obj;
                jc jcVar = ((b1) obj2).r2;
                jcVar.b.remove(tL_aiComposeTone);
                jcVar.d();
                jcVar.c();
                TL_aicompose.saveTone savetone = new TL_aicompose.saveTone();
                savetone.tone = TL_aicompose.InputAiComposeTone.from(tL_aiComposeTone);
                savetone.unsave = true;
                ConnectionsManager.getInstance(jcVar.a).sendRequest(savetone, null);
                return;
            case 16:
                f0 f0Var = (f0) obj2;
                TL_aicompose.TL_aiComposeTone tL_aiComposeTone2 = (TL_aicompose.TL_aiComposeTone) obj;
                e S = LaunchActivity.S();
                if (S != null) {
                    S.presentFragment(ProfileActivity.Q2(tL_aiComposeTone2.author_id));
                    f0Var.dismiss();
                    return;
                }
                return;
            case 17:
                ((View.OnClickListener) obj).onClick((o5) obj2);
                return;
            case 18:
                a aVar = (a) obj2;
                boolean canScrollVertically = ((ny9) obj).canScrollVertically(-1);
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
                    ofFloat.addUpdateListener(new r5(aVar, (byte) 4));
                    aVar.F1.addListener(new t5(aVar, z2, (byte) 1));
                    aVar.F1.setDuration(320L);
                    aVar.F1.setInterpolator(k43.h);
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
                    ofFloat2.addUpdateListener(new r5(aVar2, (byte) 3));
                    aVar2.F1.addListener(new t5(aVar2, z3, (byte) 0));
                    aVar2.F1.setDuration(320L);
                    aVar2.F1.setInterpolator(k43.h);
                    aVar2.F1.start();
                    return;
                }
                return;
            case 20:
                ActionBarLayout actionBarLayout = (ActionBarLayout) obj2;
                Drawable drawable = ActionBarLayout.w1;
                actionBarLayout.d0((e) obj, false);
                actionBarLayout.setVisibility(8);
                View view = actionBarLayout.I0;
                if (view != null) {
                    view.setVisibility(8);
                    return;
                }
                return;
            case 21:
                e eVar2 = (e) obj2;
                e eVar3 = (e) obj;
                Drawable drawable2 = ActionBarLayout.w1;
                if (eVar2 != null) {
                    eVar2.onTransitionAnimationEnd(false, false);
                }
                eVar3.onTransitionAnimationEnd(true, false);
                eVar3.onBecomeFullyVisible();
                return;
            case 22:
                cc ccVar = (cc) obj2;
                TLRPC.UserFull userFull = (TLRPC.UserFull) obj;
                if (userFull != null) {
                    ccVar.Z = false;
                    TL_payments.starRefProgram starrefprogram = userFull.starref_program;
                    ccVar.b0 = starrefprogram;
                    if (starrefprogram == null) {
                        ccVar.Z = true;
                        ccVar.b0 = ccVar.E0();
                        ccVar.a0 = null;
                    } else {
                        TL_payments.starRefProgram starrefprogram2 = new TL_payments.starRefProgram();
                        ccVar.a0 = starrefprogram2;
                        TL_payments.starRefProgram starrefprogram3 = ccVar.b0;
                        starrefprogram2.commission_permille = starrefprogram3.commission_permille;
                        starrefprogram2.duration_months = starrefprogram3.duration_months;
                    }
                }
                ccVar.K0(true);
                return;
            case 23:
                uk8 uk8Var = (uk8) obj;
                if (((boolean[]) obj2)[0]) {
                    uk8Var.run();
                    return;
                }
                return;
            case 24:
                ((is) obj2).b0((TLRPC.TL_messages_archivedStickers) obj);
                return;
            case 25:
                o oVar = (o) obj2;
                wt wtVar = (wt) obj;
                tw twVar = oVar.L;
                if (twVar != null) {
                    twVar.a(true);
                }
                if (oVar.O0 == wtVar) {
                    oVar.O0 = null;
                    return;
                }
                return;
            case 26:
                ((o) obj2).T0.d();
                ((AnimatorSet) obj).start();
                return;
            case 27:
                ((hv) obj2).b((SpannableString) obj);
                return;
            case 28:
                j00.a = (AudioManager) ((Context) obj2).getSystemService("audio");
                ((or2) obj).e();
                return;
            default:
                i30 i30Var = (i30) obj2;
                Throwable th = (Throwable) obj;
                i30Var.getClass();
                if (th instanceof Exception) {
                    runtimeException = (Exception) th;
                } else {
                    runtimeException = new RuntimeException(th);
                }
                i30Var.g(runtimeException);
                return;
        }
    }
}
