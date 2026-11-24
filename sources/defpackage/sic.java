package defpackage;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.BitmapFactory;
import android.graphics.Paint;
import android.os.Build;
import android.os.SystemClock;
import android.provider.Settings;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.io.File;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import org.telegram.messenger.a;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.LaunchActivity;
public abstract class sic {
    public static long a;

    public static boolean a(TLRPC.TL_messageActionPhoneCall tL_messageActionPhoneCall) {
        TLRPC.PhoneCallDiscardReason phoneCallDiscardReason = tL_messageActionPhoneCall.reason;
        if (!(phoneCallDiscardReason instanceof TLRPC.TL_phoneCallDiscardReasonBusy) && !(phoneCallDiscardReason instanceof TLRPC.TL_phoneCallDiscardReasonMissed)) {
            for (String str : oc7.r1(z8c.t0).W3.getStringSet("calls_access_hashes", Collections.EMPTY_SET)) {
                String[] split = str.split(" ");
                if (split.length >= 2) {
                    String str2 = split[0];
                    if (str2.equals(tL_messageActionPhoneCall.call_id + "")) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static void b(final TLRPC.User user, final TLRPC.Chat chat, final String str, final TLRPC.InputPeer inputPeer, boolean z, final boolean z2, final boolean z3, final boolean z4, final Activity activity, final d dVar, final j5 j5Var, boolean z5, boolean z6, boolean z7) {
        qd2 f1;
        TLRPC.ChatFull M0;
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        TLRPC.ChatFull M02;
        TLRPC.Peer peer;
        if (activity != null) {
            if (user == null && chat == null) {
                return;
            }
            if (SystemClock.elapsedRealtime() - a >= (chat != null ? 200 : 2000)) {
                if (z5 && chat != null && !z4 && (M02 = oc7.r1(j5Var.a).M0(chat.id)) != null && (peer = M02.groupcall_default_join_as) != null) {
                    final TLRPC.InputPeer i1 = oc7.r1(j5Var.a).i1(k47.B1(peer));
                    wv5.D0(activity, -chat.id, j5Var, new ue7() {
                        @Override
                        public final void z(boolean z8) {
                            String str2 = str;
                            Activity activity2 = activity;
                            TLRPC.Chat chat2 = chat;
                            TLRPC.User user2 = user;
                            TLRPC.InputPeer inputPeer2 = i1;
                            boolean z9 = z2;
                            boolean z10 = z3;
                            d dVar2 = dVar;
                            j5 j5Var2 = j5Var;
                            if (!z8 && str2 != null) {
                                qic qicVar = new qic(activity2, chat2, user2, chat2, str2, inputPeer2, z9, z10, activity2, dVar2, j5Var2);
                                if (dVar2 != null) {
                                    dVar2.showDialog(qicVar);
                                    return;
                                }
                                return;
                            }
                            sic.b(user2, chat2, str2, inputPeer2, !z8, z9, z10, false, activity2, dVar2, j5Var2, false, false, false);
                        }
                    });
                } else if (z5 && chat != null) {
                    wv5.E0(activity, -chat.id, j5Var, dVar, !z4 ? 1 : 0, null, new lic(z4, activity, j5Var, chat, str, user, z2, z3, dVar));
                } else if (z6 && !z && (inputPeer instanceof TLRPC.TL_inputPeerUser) && chat != null && (tL_chatAdminRights = chat.admin_rights) != null && tL_chatAdminRights.anonymous && (!sd2.T(chat) || chat.megagroup)) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity);
                    String M03 = jb6.M0(sd2.W(chat) ? 2131743131 : 2131742990, null);
                    he heVar = alertDialog$Builder.a;
                    heVar.S = M03;
                    heVar.U = jb6.M0(sd2.W(chat) ? 2131743161 : 2131743053, null);
                    alertDialog$Builder.j(jb6.M0(2131743126, null), new ee() {
                        @Override
                        public final void r(he heVar2, int i) {
                            sic.b(TLRPC.User.this, chat, str, inputPeer, false, z2, z3, z4, activity, dVar, j5Var, false, false, false);
                        }
                    });
                    wi8.y(null, 2131752542, alertDialog$Builder, null);
                } else {
                    if (chat != null && inputPeer != null && (M0 = oc7.r1(j5Var.a).M0(chat.id)) != null) {
                        if (inputPeer instanceof TLRPC.TL_inputPeerUser) {
                            TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                            M0.groupcall_default_join_as = tL_peerUser;
                            tL_peerUser.user_id = inputPeer.user_id;
                        } else if (inputPeer instanceof TLRPC.TL_inputPeerChat) {
                            TLRPC.TL_peerChat tL_peerChat = new TLRPC.TL_peerChat();
                            M0.groupcall_default_join_as = tL_peerChat;
                            tL_peerChat.chat_id = inputPeer.chat_id;
                        } else if (inputPeer instanceof TLRPC.TL_inputPeerChannel) {
                            TLRPC.TL_peerChannel tL_peerChannel = new TLRPC.TL_peerChannel();
                            M0.groupcall_default_join_as = tL_peerChannel;
                            tL_peerChannel.channel_id = inputPeer.channel_id;
                        }
                        boolean z8 = M0 instanceof TLRPC.TL_chatFull;
                        int i = M0.flags;
                        if (z8) {
                            M0.flags = i | 32768;
                        } else {
                            M0.flags = i | 67108864;
                        }
                    }
                    if (chat != null && !z4 && (f1 = oc7.r1(j5Var.a).f1(chat.id, false, null)) != null && f1.k()) {
                        g95.S0((LaunchActivity) activity, j5Var, chat, inputPeer, z, str);
                        return;
                    }
                    a = SystemClock.elapsedRealtime();
                    Intent intent = new Intent(activity, VoIPService.class);
                    if (user != null) {
                        intent.putExtra("user_id", user.id);
                    } else {
                        intent.putExtra("chat_id", chat.id);
                        intent.putExtra("createGroupCall", z4);
                        intent.putExtra("hasFewPeers", z);
                        intent.putExtra("isRtmpStream", z7);
                        intent.putExtra("hash", str);
                        if (inputPeer != null) {
                            intent.putExtra("peerChannelId", inputPeer.channel_id);
                            intent.putExtra("peerChatId", inputPeer.chat_id);
                            intent.putExtra("peerUserId", inputPeer.user_id);
                            intent.putExtra("peerAccessHash", inputPeer.access_hash);
                        }
                    }
                    intent.putExtra("is_outgoing", true);
                    intent.putExtra("start_incall_activity", true);
                    intent.putExtra("video_call", z2);
                    intent.putExtra("can_video_call", z3);
                    intent.putExtra("account", z8c.t0);
                    try {
                        activity.startService(intent);
                    } catch (Throwable th) {
                        fc4.g(th, true);
                    }
                }
            }
        }
    }

    public static int c() {
        boolean z = er3.q(0).K.f;
        boolean z2 = er3.q(0).L.f;
        boolean z3 = er3.q(0).M.f;
        if (z || z2 || z3) {
            if (z && !z2 && !z3) {
                return 3;
            }
            if (z && z2 && !z3) {
                return 1;
            }
            if (z && z2 && z3) {
                return 2;
            }
            if (e21.a) {
                fc4.l("Invalid call data saving preset configuration: " + z + "/" + z2 + "/" + z3);
            }
        }
        return 0;
    }

    public static String d(String str) {
        Calendar calendar = Calendar.getInstance();
        return new File(a.b.getExternalFilesDir(null), String.format(Locale.US, "logs/%02d_%02d_%04d_%02d_%02d_%02d_%s.txt", Integer.valueOf(calendar.get(5)), Integer.valueOf(calendar.get(2) + 1), Integer.valueOf(calendar.get(1)), Integer.valueOf(calendar.get(11)), Integer.valueOf(calendar.get(12)), Integer.valueOf(calendar.get(13)), str)).getAbsolutePath();
    }

    public static String e(String str) {
        File file = new File(a.b.getCacheDir(), "voip_logs");
        if (!file.exists()) {
            file.mkdirs();
        }
        boolean z = e21.a;
        return new File(file, str.concat("_stats.log")).getAbsolutePath();
    }

    public static void f(TLRPC.User user, TLRPC.Chat chat, String str, boolean z, boolean z2, boolean z3, Boolean bool, Activity activity, d dVar, j5 j5Var) {
        boolean z4;
        long j;
        j5 j5Var2;
        char c;
        long j2;
        String str2;
        int i;
        String str3;
        int i2;
        String str4;
        if (activity != null) {
            if (user != null || chat != null) {
                VoIPService sharedInstance = VoIPService.getSharedInstance();
                if (sharedInstance != null) {
                    if (user != null) {
                        j = user.id;
                    } else {
                        j = -chat.id;
                    }
                    long callerId = sharedInstance.getCallerId();
                    if (callerId == j) {
                        j5Var2 = j5Var;
                        if (sharedInstance.getAccount() == j5Var2.a) {
                            if (user == null && (activity instanceof LaunchActivity)) {
                                if (!TextUtils.isEmpty(str)) {
                                    sharedInstance.setGroupCallHash(str);
                                }
                                g95.S0((LaunchActivity) activity, j5.a(z8c.t0), null, null, false, null);
                                return;
                            }
                            Intent intent = new Intent(activity, LaunchActivity.class);
                            if (user != null) {
                                str4 = "voip";
                            } else {
                                str4 = "voip_chat";
                            }
                            activity.startActivity(intent.setAction(str4));
                            return;
                        }
                    } else {
                        j5Var2 = j5Var;
                    }
                    if (sharedInstance.isConference()) {
                        StringBuilder sb = new StringBuilder();
                        c = 1;
                        if (sharedInstance.groupCall != null) {
                            int account = sharedInstance.getAccount();
                            int i3 = 0;
                            int i4 = 0;
                            j2 = 0;
                            while (i3 < sharedInstance.groupCall.d.m()) {
                                int i5 = i3;
                                long n = pg3.n(((TLRPC.GroupCallParticipant) sharedInstance.groupCall.d.n(i3)).peer);
                                if (n != z8c.h(account).e()) {
                                    i4++;
                                    if (sb.length() > 0) {
                                        sb.append(", ");
                                    }
                                    sb.append(pg3.r(account, n));
                                    if (i4 >= 2) {
                                        break;
                                    }
                                }
                                i3 = i5 + 1;
                            }
                            if (i4 < sharedInstance.groupCall.d.m() - 1) {
                                sb.append(jb6.G((sharedInstance.groupCall.d.m() - 1) - i4, "AndOther", new Object[0]));
                            }
                        } else {
                            j2 = 0;
                        }
                        if (j > j2) {
                            i = 2131742951;
                        } else {
                            i = 2131742950;
                        }
                        str2 = sb.toString();
                    } else {
                        c = 1;
                        j2 = 0;
                        if (callerId > 0) {
                            TLRPC.User user2 = sharedInstance.getUser();
                            str2 = bw2.m(0, user2.first_name, user2.last_name);
                            if (j > 0) {
                                i = 2131742957;
                            } else {
                                i = 2131742956;
                            }
                        } else {
                            str2 = sharedInstance.getChat().title;
                            if (j > 0) {
                                i = 2131742953;
                            } else {
                                i = 2131742954;
                            }
                        }
                    }
                    if (user != null) {
                        str3 = bw2.m(0, user.first_name, user.last_name);
                    } else {
                        str3 = chat.title;
                    }
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity);
                    if (callerId < j2) {
                        i2 = 2131742952;
                    } else {
                        i2 = 2131742955;
                    }
                    String M0 = jb6.M0(i2, null);
                    he heVar = alertDialog$Builder.a;
                    heVar.S = M0;
                    Object[] objArr = new Object[2];
                    objArr[0] = str2;
                    objArr[c] = str3;
                    heVar.U = gm.S2(jb6.a0(null, null, i, objArr));
                    alertDialog$Builder.j(jb6.M0(2131747564, null), new lic(user, chat, str, z, z2, z3, activity, dVar, j5Var2));
                    wi8.y(null, 2131752542, alertDialog$Builder, null);
                } else if (VoIPService.callIShouldHavePutIntoIntent == null) {
                    if (bool != null) {
                        z4 = bool.booleanValue();
                    } else {
                        z4 = true;
                    }
                    b(user, chat, str, null, false, z, z2, z3, activity, dVar, j5Var, z4, true, false);
                }
            }
        }
    }

    public static void g(Activity activity, int i, TLRPC.InputGroupCall inputGroupCall, boolean z, TLRPC.GroupCall groupCall, HashSet hashSet) {
        if (activity == null) {
            return;
        }
        if (VoIPService.getSharedInstance() != null) {
            VoIPService.getSharedInstance().hangUp(new m25(activity, i, inputGroupCall, z, groupCall, hashSet));
            return;
        }
        a = SystemClock.elapsedRealtime();
        Intent intent = new Intent(activity, VoIPService.class);
        intent.putExtra("chat_id", 0L);
        int i2 = 0;
        intent.putExtra("createGroupCall", false);
        intent.putExtra("hasFewPeers", false);
        intent.putExtra("isRtmpStream", false);
        intent.putExtra("hash", (String) null);
        intent.putExtra("is_outgoing", true);
        intent.putExtra("start_incall_activity", true);
        intent.putExtra("video_call", false);
        SerializedData serializedData = new SerializedData(inputGroupCall.getObjectSize());
        inputGroupCall.serializeToStream(serializedData);
        intent.putExtra("joinConference", serializedData.toByteArray());
        if (groupCall != null) {
            SerializedData serializedData2 = new SerializedData(groupCall.getObjectSize());
            groupCall.serializeToStream(serializedData2);
            intent.putExtra("joinConferenceCall", serializedData2.toByteArray());
        }
        if (hashSet != null) {
            long[] jArr = new long[hashSet.size()];
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                jArr[i2] = ((Long) it.next()).longValue();
                i2++;
            }
            intent.putExtra("inviteUsers", jArr);
        }
        intent.putExtra("account", i);
        intent.putExtra("video_call", z);
        intent.putExtra("can_video_call", true);
        try {
            activity.startService(intent);
        } catch (Throwable th) {
            fc4.g(th, true);
        }
    }

    public static void h(Activity activity, Runnable runnable, int i) {
        boolean z;
        int i2;
        int i3;
        if (i == 102) {
            z = true;
        } else {
            z = false;
        }
        if (activity.shouldShowRequestPermissionRationale("android.permission.RECORD_AUDIO") && (!z || activity.shouldShowRequestPermissionRationale("android.permission.CAMERA"))) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity);
        if (z) {
            i2 = 2131742968;
        } else {
            i2 = 2131742967;
        }
        SpannableStringBuilder S2 = gm.S2(jb6.M0(i2, null));
        he heVar = alertDialog$Builder.a;
        heVar.U = S2;
        alertDialog$Builder.j(jb6.M0(2131745229, null), new mi(activity, (byte) 4));
        alertDialog$Builder.g(jb6.M0(2131751709, null), null);
        heVar.setOnDismissListener(new nf(runnable, (byte) 3));
        if (z) {
            i3 = 2131624117;
        } else {
            i3 = 2131624121;
        }
        int i4 = cmb.K5;
        alertDialog$Builder.l(i3, 72, cmb.w0(null, i4, false), null);
        alertDialog$Builder.m(i4, null);
        alertDialog$Builder.o();
    }

    public static void i(Activity activity) {
        final SharedPreferences d1 = oc7.d1();
        LinearLayout l = td4.l(activity, 1);
        TextView textView = new TextView(activity);
        textView.setTextSize(1, 15.0f);
        textView.setText("Please only change these settings if you know exactly what they do.");
        anb.X(textView, cmb.i5, null);
        l.addView(textView, qoe.k(16.0f, 8.0f, 16.0f, 8.0f, -1, -2));
        final bjb bjbVar = new bjb(activity);
        bjbVar.f("Force TCP", d1.getBoolean("dbg_force_tcp_in_calls", false), false);
        bjbVar.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                byte b = r3;
                bjb bjbVar2 = bjbVar;
                SharedPreferences sharedPreferences = d1;
                switch (b) {
                    case 0:
                        boolean z = sharedPreferences.getBoolean("dbg_force_tcp_in_calls", false);
                        SharedPreferences.Editor edit = sharedPreferences.edit();
                        boolean z2 = !z;
                        edit.putBoolean("dbg_force_tcp_in_calls", z2);
                        edit.commit();
                        bjbVar2.setChecked(z2);
                        return;
                    case 1:
                        boolean z3 = sharedPreferences.getBoolean("dbg_dump_call_stats", false);
                        SharedPreferences.Editor edit2 = sharedPreferences.edit();
                        boolean z4 = !z3;
                        edit2.putBoolean("dbg_dump_call_stats", z4);
                        edit2.commit();
                        bjbVar2.setChecked(z4);
                        return;
                    default:
                        boolean z5 = sharedPreferences.getBoolean("dbg_force_connection_service", false);
                        SharedPreferences.Editor edit3 = sharedPreferences.edit();
                        boolean z6 = !z5;
                        edit3.putBoolean("dbg_force_connection_service", z6);
                        edit3.commit();
                        bjbVar2.setChecked(z6);
                        return;
                }
            }
        });
        l.addView(bjbVar);
        if (e21.a) {
            final bjb bjbVar2 = new bjb(activity);
            bjbVar2.f("Dump detailed stats", d1.getBoolean("dbg_dump_call_stats", false), false);
            bjbVar2.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    byte b = r3;
                    bjb bjbVar22 = bjbVar2;
                    SharedPreferences sharedPreferences = d1;
                    switch (b) {
                        case 0:
                            boolean z = sharedPreferences.getBoolean("dbg_force_tcp_in_calls", false);
                            SharedPreferences.Editor edit = sharedPreferences.edit();
                            boolean z2 = !z;
                            edit.putBoolean("dbg_force_tcp_in_calls", z2);
                            edit.commit();
                            bjbVar22.setChecked(z2);
                            return;
                        case 1:
                            boolean z3 = sharedPreferences.getBoolean("dbg_dump_call_stats", false);
                            SharedPreferences.Editor edit2 = sharedPreferences.edit();
                            boolean z4 = !z3;
                            edit2.putBoolean("dbg_dump_call_stats", z4);
                            edit2.commit();
                            bjbVar22.setChecked(z4);
                            return;
                        default:
                            boolean z5 = sharedPreferences.getBoolean("dbg_force_connection_service", false);
                            SharedPreferences.Editor edit3 = sharedPreferences.edit();
                            boolean z6 = !z5;
                            edit3.putBoolean("dbg_force_connection_service", z6);
                            edit3.commit();
                            bjbVar22.setChecked(z6);
                            return;
                    }
                }
            });
            l.addView(bjbVar2);
        }
        if (Build.VERSION.SDK_INT >= 26) {
            final bjb bjbVar3 = new bjb(activity);
            bjbVar3.f("Enable ConnectionService", d1.getBoolean("dbg_force_connection_service", false), false);
            bjbVar3.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    byte b = r3;
                    bjb bjbVar22 = bjbVar3;
                    SharedPreferences sharedPreferences = d1;
                    switch (b) {
                        case 0:
                            boolean z = sharedPreferences.getBoolean("dbg_force_tcp_in_calls", false);
                            SharedPreferences.Editor edit = sharedPreferences.edit();
                            boolean z2 = !z;
                            edit.putBoolean("dbg_force_tcp_in_calls", z2);
                            edit.commit();
                            bjbVar22.setChecked(z2);
                            return;
                        case 1:
                            boolean z3 = sharedPreferences.getBoolean("dbg_dump_call_stats", false);
                            SharedPreferences.Editor edit2 = sharedPreferences.edit();
                            boolean z4 = !z3;
                            edit2.putBoolean("dbg_dump_call_stats", z4);
                            edit2.commit();
                            bjbVar22.setChecked(z4);
                            return;
                        default:
                            boolean z5 = sharedPreferences.getBoolean("dbg_force_connection_service", false);
                            SharedPreferences.Editor edit3 = sharedPreferences.edit();
                            boolean z6 = !z5;
                            edit3.putBoolean("dbg_force_connection_service", z6);
                            edit3.commit();
                            bjbVar22.setChecked(z6);
                            return;
                    }
                }
            });
            l.addView(bjbVar3);
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity);
        alertDialog$Builder.a.S = jb6.M0(2131751582, null);
        alertDialog$Builder.n(l);
        alertDialog$Builder.o();
    }

    public static void j(final Activity activity, f8c f8cVar, boolean z, final long j, final long j2, final int i, final boolean z2) {
        File file;
        String str;
        String str2;
        String M0;
        String str3;
        boolean z3 = e21.a;
        File file2 = new File(a.b.getExternalFilesDir(null), "logs");
        String[] list = file2.list();
        if (list != null) {
            for (String str4 : list) {
                if (str4.endsWith("voip" + j + ".txt")) {
                    file = new File(file2, str4);
                    break;
                }
            }
        }
        File file3 = new File(a.b.getCacheDir(), "voip_logs");
        if (!file3.exists()) {
            file3.mkdirs();
        }
        file = new File(file3, j + ".log");
        final File file4 = file;
        final int[] iArr = {0};
        int i2 = 1;
        LinearLayout l = td4.l(activity, 1);
        int L = gm.L(16.0f);
        l.setPadding(L, L, L, 0);
        final TextView textView = new TextView(activity);
        textView.setTextSize(2, 16.0f);
        anb.X(textView, cmb.i5, null);
        hg9.p(textView, 17, null, 2131742940);
        l.addView(textView);
        final ?? view = new View(activity);
        view.c = new Paint();
        view.d = (byte) 5;
        view.e = 0;
        view.a = BitmapFactory.decodeResource(view.getResources(), 2131231462).extractAlpha();
        view.b = BitmapFactory.decodeResource(view.getResources(), 2131231461).extractAlpha();
        l.addView((View) view, qoe.t(-2, -2, 1, 0, 16, 0, 0));
        final LinearLayout linearLayout = new LinearLayout(activity);
        linearLayout.setOrientation(1);
        x10 x10Var = new x10((byte) 16);
        if (z) {
            str = "distorted_video";
            str2 = "pixelated_video";
        } else {
            str = null;
            str2 = null;
        }
        String[] strArr = {str, str2, "echo", "noise", "interruptions", "distorted_speech", "silent_local", "silent_remote", "dropped"};
        int i3 = 0;
        while (i3 < 9) {
            if (strArr[i3] != null) {
                oh2 oh2Var = new oh2(activity, i2);
                oh2Var.setClipToPadding(false);
                oh2Var.setTag(strArr[i3]);
                switch (i3) {
                    case 0:
                        M0 = jb6.M0(2131746149, null);
                        str3 = M0;
                        break;
                    case 1:
                        M0 = jb6.M0(2131746148, null);
                        str3 = M0;
                        break;
                    case 2:
                        M0 = jb6.M0(2131746154, null);
                        str3 = M0;
                        break;
                    case 3:
                        M0 = jb6.M0(2131746152, null);
                        str3 = M0;
                        break;
                    case 4:
                        M0 = jb6.M0(2131746153, null);
                        str3 = M0;
                        break;
                    case 5:
                        M0 = jb6.M0(2131746156, null);
                        str3 = M0;
                        break;
                    case 6:
                        M0 = jb6.M0(2131746151, null);
                        str3 = M0;
                        break;
                    case 7:
                        M0 = jb6.M0(2131746150, null);
                        str3 = M0;
                        break;
                    case 8:
                        M0 = jb6.M0(2131746155, null);
                        str3 = M0;
                        break;
                    default:
                        str3 = null;
                        break;
                }
                oh2Var.e(str3, null, false, false, false);
                oh2Var.setOnClickListener(x10Var);
                oh2Var.setTag(strArr[i3]);
                linearLayout.addView(oh2Var);
            }
            i3++;
            i2 = 1;
        }
        l.addView(linearLayout, qoe.k(-8.0f, 0.0f, -8.0f, 0.0f, -1, -2));
        linearLayout.setVisibility(8);
        final EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(activity);
        editTextBoldCursor.setHint(jb6.M0(2131743091, null));
        editTextBoldCursor.setInputType(147457);
        anb.X(editTextBoldCursor, cmb.i5, null);
        anb.D(editTextBoldCursor, cmb.s5, null);
        editTextBoldCursor.setBackground(null);
        anb.F(editTextBoldCursor, cmb.t5, cmb.u5, cmb.p7, null);
        editTextBoldCursor.setPadding(0, gm.L(4.0f), 0, gm.L(4.0f));
        editTextBoldCursor.setTextSize(1, 18.0f);
        editTextBoldCursor.setVisibility(8);
        l.addView(editTextBoldCursor, qoe.k(8.0f, 8.0f, 8.0f, 0.0f, -1, -2));
        final boolean[] zArr = {true};
        final oh2 oh2Var2 = new oh2(activity, 1);
        fyb fybVar = new fyb(zArr, oh2Var2, (byte) 12);
        oh2Var2.e(jb6.M0(2131752557, null), null, true, false, false);
        oh2Var2.setClipToPadding(false);
        oh2Var2.setOnClickListener(fybVar);
        l.addView(oh2Var2, qoe.k(-8.0f, 0.0f, -8.0f, 0.0f, -1, -2));
        final TextView textView2 = new TextView(activity);
        textView2.setTextSize(2, 14.0f);
        wi8.x(textView2, cmb.q5, null, null, 2131752556);
        textView2.setPadding(gm.L(8.0f), 0, gm.L(8.0f), 0);
        textView2.setOnClickListener(fybVar);
        l.addView(textView2);
        oh2Var2.setVisibility(8);
        textView2.setVisibility(8);
        if (!file4.exists()) {
            zArr[0] = false;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity);
        alertDialog$Builder.a.S = jb6.M0(2131752567, null);
        alertDialog$Builder.n(l);
        alertDialog$Builder.j(jb6.M0(2131745374, null), new dq9((byte) 14));
        alertDialog$Builder.g(jb6.M0(2131752542, null), null);
        alertDialog$Builder.a.setOnDismissListener(new qj8(f8cVar, (byte) 15));
        final he heVar = alertDialog$Builder.a;
        if (e21.a && file4.exists()) {
            uxb uxbVar = new uxb(activity, file4, (byte) 8);
            heVar.s0 = "Send log";
            heVar.t0 = uxbVar;
        }
        heVar.show();
        heVar.getWindow().setSoftInputMode(3);
        final View c = heVar.c(-1);
        c.setEnabled(false);
        view.setOnRatingChangeListener(new en0(c));
        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                oh2 oh2Var3;
                qi0 qi0Var = qi0.this;
                int rating = qi0Var.getRating();
                LinearLayout linearLayout2 = linearLayout;
                EditTextBoldCursor editTextBoldCursor2 = editTextBoldCursor;
                File file5 = file4;
                he heVar2 = heVar;
                if (rating < 4) {
                    int[] iArr2 = iArr;
                    if (iArr2[0] != 1) {
                        iArr2[0] = 1;
                        qi0Var.setVisibility(8);
                        textView.setVisibility(8);
                        heVar2.setTitle(jb6.M0(2131752558, null));
                        editTextBoldCursor2.setVisibility(0);
                        if (file5.exists()) {
                            oh2Var2.setVisibility(0);
                            textView2.setVisibility(0);
                        }
                        linearLayout2.setVisibility(0);
                        ((TextView) c).setText(jb6.M0(2131745374, null).toUpperCase());
                        return;
                    }
                }
                int i4 = z8c.t0;
                TL_phone.setCallRating setcallrating = new TL_phone.setCallRating();
                setcallrating.rating = qi0Var.getRating();
                ArrayList arrayList = new ArrayList();
                for (int i5 = 0; i5 < linearLayout2.getChildCount(); i5++) {
                    if (((oh2) linearLayout2.getChildAt(i5)).b()) {
                        arrayList.add("#" + oh2Var3.getTag());
                    }
                }
                if (setcallrating.rating < 5) {
                    setcallrating.comment = editTextBoldCursor2.getText().toString();
                } else {
                    setcallrating.comment = "";
                }
                boolean isEmpty = arrayList.isEmpty();
                boolean[] zArr2 = zArr;
                if (!isEmpty && !zArr2[0]) {
                    setcallrating.comment += " " + TextUtils.join(" ", arrayList);
                }
                TLRPC.TL_inputPhoneCall tL_inputPhoneCall = new TLRPC.TL_inputPhoneCall();
                setcallrating.peer = tL_inputPhoneCall;
                tL_inputPhoneCall.access_hash = j2;
                tL_inputPhoneCall.id = j;
                setcallrating.user_initiative = z2;
                ConnectionsManager.getInstance(i).sendRequest(setcallrating, new ou(i4, zArr2, file5, setcallrating, arrayList, activity));
                heVar2.dismiss();
            }
        });
    }

    public static void k(Activity activity, TLRPC.TL_messageActionPhoneCall tL_messageActionPhoneCall) {
        for (String str : oc7.r1(z8c.t0).W3.getStringSet("calls_access_hashes", Collections.EMPTY_SET)) {
            String[] split = str.split(" ");
            if (split.length >= 2) {
                String str2 = split[0];
                if (str2.equals(tL_messageActionPhoneCall.call_id + "")) {
                    try {
                        j(activity, null, tL_messageActionPhoneCall.video, tL_messageActionPhoneCall.call_id, Long.parseLong(split[1]), z8c.t0, true);
                        return;
                    } catch (Exception unused) {
                        return;
                    }
                }
            }
        }
    }

    public static void l(TLRPC.Chat chat, String str, boolean z, Boolean bool, Activity activity, d dVar, j5 j5Var) {
        int i;
        int i2;
        if (activity == null) {
            return;
        }
        if (ConnectionsManager.getInstance(z8c.t0).getConnectionState() != 3) {
            boolean z2 = false;
            if (Settings.System.getInt(activity.getContentResolver(), "airplane_mode_on", 0) != 0) {
                z2 = true;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity);
            if (z2) {
                i = 2131742960;
            } else {
                i = 2131742958;
            }
            String M0 = jb6.M0(i, null);
            he heVar = alertDialog$Builder.a;
            heVar.S = M0;
            if (z2) {
                i2 = 2131743039;
            } else {
                i2 = 2131743040;
            }
            heVar.U = jb6.M0(i2, null);
            alertDialog$Builder.j(jb6.M0(2131747564, null), null);
            if (z2) {
                Intent intent = new Intent("android.settings.AIRPLANE_MODE_SETTINGS");
                if (intent.resolveActivity(activity.getPackageManager()) != null) {
                    alertDialog$Builder.h(jb6.M0(2131742959, null), new pic(activity, intent, (byte) 1));
                }
            }
            try {
                alertDialog$Builder.o();
                return;
            } catch (Exception e) {
                fc4.g(e, true);
                return;
            }
        }
        f(null, chat, str, false, false, z, bool, activity, dVar, j5Var);
    }

    public static void m(org.telegram.tgnet.TLRPC.User r10, boolean r11, boolean r12, android.app.Activity r13, org.telegram.tgnet.TLRPC.UserFull r14, defpackage.j5 r15) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sic.m(org.telegram.tgnet.TLRPC$User, boolean, boolean, android.app.Activity, org.telegram.tgnet.TLRPC$UserFull, j5):void");
    }
}
