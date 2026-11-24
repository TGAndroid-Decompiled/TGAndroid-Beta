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
public abstract class rgc {
    public static long a;

    public static boolean a(TLRPC.TL_messageActionPhoneCall tL_messageActionPhoneCall) {
        TLRPC.PhoneCallDiscardReason phoneCallDiscardReason = tL_messageActionPhoneCall.reason;
        if (!(phoneCallDiscardReason instanceof TLRPC.TL_phoneCallDiscardReasonBusy) && !(phoneCallDiscardReason instanceof TLRPC.TL_phoneCallDiscardReasonMissed)) {
            for (String str : na7.q1(y6c.t0).W3.getStringSet("calls_access_hashes", Collections.EMPTY_SET)) {
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
        fc2 e1;
        TLRPC.ChatFull L0;
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        TLRPC.ChatFull L02;
        TLRPC.Peer peer;
        if (activity != null) {
            if (user == null && chat == null) {
                return;
            }
            if (SystemClock.elapsedRealtime() - a >= (chat != null ? 200 : 2000)) {
                if (z5 && chat != null && !z4 && (L02 = na7.q1(j5Var.a).L0(chat.id)) != null && (peer = L02.groupcall_default_join_as) != null) {
                    final TLRPC.InputPeer h1 = na7.q1(j5Var.a).h1(k27.B1(peer));
                    xt5.D0(activity, -chat.id, j5Var, new sc7() {
                        @Override
                        public final void k(boolean z8) {
                            String str2 = str;
                            Activity activity2 = activity;
                            TLRPC.Chat chat2 = chat;
                            TLRPC.User user2 = user;
                            TLRPC.InputPeer inputPeer2 = h1;
                            boolean z9 = z2;
                            boolean z10 = z3;
                            d dVar2 = dVar;
                            j5 j5Var2 = j5Var;
                            if (!z8 && str2 != null) {
                                pgc pgcVar = new pgc(activity2, chat2, user2, chat2, str2, inputPeer2, z9, z10, activity2, dVar2, j5Var2);
                                if (dVar2 != null) {
                                    dVar2.showDialog(pgcVar);
                                    return;
                                }
                                return;
                            }
                            rgc.b(user2, chat2, str2, inputPeer2, !z8, z9, z10, false, activity2, dVar2, j5Var2, false, false, false);
                        }
                    });
                } else if (z5 && chat != null) {
                    xt5.E0(activity, -chat.id, j5Var, dVar, !z4 ? 1 : 0, null, new kgc(z4, activity, j5Var, chat, str, user, z2, z3, dVar));
                } else if (z6 && !z && (inputPeer instanceof TLRPC.TL_inputPeerUser) && chat != null && (tL_chatAdminRights = chat.admin_rights) != null && tL_chatAdminRights.anonymous && (!hc2.T(chat) || chat.megagroup)) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity);
                    String M0 = k96.M0(hc2.W(chat) ? 2131743205 : 2131743064, null);
                    hd hdVar = alertDialog$Builder.a;
                    hdVar.S = M0;
                    hdVar.U = k96.M0(hc2.W(chat) ? 2131743235 : 2131743127, null);
                    alertDialog$Builder.j(k96.M0(2131743200, null), new ed() {
                        @Override
                        public final void u(hd hdVar2, int i) {
                            rgc.b(TLRPC.User.this, chat, str, inputPeer, false, z2, z3, z4, activity, dVar, j5Var, false, false, false);
                        }
                    });
                    ug8.y(null, 2131752577, alertDialog$Builder, null);
                } else {
                    if (chat != null && inputPeer != null && (L0 = na7.q1(j5Var.a).L0(chat.id)) != null) {
                        if (inputPeer instanceof TLRPC.TL_inputPeerUser) {
                            TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                            L0.groupcall_default_join_as = tL_peerUser;
                            tL_peerUser.user_id = inputPeer.user_id;
                        } else if (inputPeer instanceof TLRPC.TL_inputPeerChat) {
                            TLRPC.TL_peerChat tL_peerChat = new TLRPC.TL_peerChat();
                            L0.groupcall_default_join_as = tL_peerChat;
                            tL_peerChat.chat_id = inputPeer.chat_id;
                        } else if (inputPeer instanceof TLRPC.TL_inputPeerChannel) {
                            TLRPC.TL_peerChannel tL_peerChannel = new TLRPC.TL_peerChannel();
                            L0.groupcall_default_join_as = tL_peerChannel;
                            tL_peerChannel.channel_id = inputPeer.channel_id;
                        }
                        boolean z8 = L0 instanceof TLRPC.TL_chatFull;
                        int i = L0.flags;
                        if (z8) {
                            L0.flags = i | 32768;
                        } else {
                            L0.flags = i | 67108864;
                        }
                    }
                    if (chat != null && !z4 && (e1 = na7.q1(j5Var.a).e1(chat.id, false, null)) != null && e1.k()) {
                        h75.S0((LaunchActivity) activity, j5Var, chat, inputPeer, z, str);
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
                    intent.putExtra("account", y6c.t0);
                    try {
                        activity.startService(intent);
                    } catch (Throwable th) {
                        fa4.g(th, true);
                    }
                }
            }
        }
    }

    public static int c() {
        boolean z = up3.q(0).K.f;
        boolean z2 = up3.q(0).L.f;
        boolean z3 = up3.q(0).M.f;
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
            if (w01.a) {
                fa4.l("Invalid call data saving preset configuration: " + z + "/" + z2 + "/" + z3);
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
        boolean z = w01.a;
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
                                h75.S0((LaunchActivity) activity, j5.a(y6c.t0), null, null, false, null);
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
                                long n = cf3.n(((TLRPC.GroupCallParticipant) sharedInstance.groupCall.d.n(i3)).peer);
                                if (n != y6c.h(account).e()) {
                                    i4++;
                                    if (sb.length() > 0) {
                                        sb.append(", ");
                                    }
                                    sb.append(cf3.r(account, n));
                                    if (i4 >= 2) {
                                        break;
                                    }
                                }
                                i3 = i5 + 1;
                            }
                            if (i4 < sharedInstance.groupCall.d.m() - 1) {
                                sb.append(k96.G((sharedInstance.groupCall.d.m() - 1) - i4, "AndOther", new Object[0]));
                            }
                        } else {
                            j2 = 0;
                        }
                        if (j > j2) {
                            i = 2131743025;
                        } else {
                            i = 2131743024;
                        }
                        str2 = sb.toString();
                    } else {
                        c = 1;
                        j2 = 0;
                        if (callerId > 0) {
                            TLRPC.User user2 = sharedInstance.getUser();
                            str2 = qu2.m(0, user2.first_name, user2.last_name);
                            if (j > 0) {
                                i = 2131743031;
                            } else {
                                i = 2131743030;
                            }
                        } else {
                            str2 = sharedInstance.getChat().title;
                            if (j > 0) {
                                i = 2131743027;
                            } else {
                                i = 2131743028;
                            }
                        }
                    }
                    if (user != null) {
                        str3 = qu2.m(0, user.first_name, user.last_name);
                    } else {
                        str3 = chat.title;
                    }
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity);
                    if (callerId < j2) {
                        i2 = 2131743026;
                    } else {
                        i2 = 2131743029;
                    }
                    String M0 = k96.M0(i2, null);
                    hd hdVar = alertDialog$Builder.a;
                    hdVar.S = M0;
                    Object[] objArr = new Object[2];
                    objArr[0] = str2;
                    objArr[c] = str3;
                    hdVar.U = gl.T2(k96.a0(null, null, i, objArr));
                    alertDialog$Builder.j(k96.M0(2131747638, null), new kgc(user, chat, str, z, z2, z3, activity, dVar, j5Var2));
                    ug8.y(null, 2131752577, alertDialog$Builder, null);
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
            VoIPService.getSharedInstance().hangUp(new m05(activity, i, inputGroupCall, z, groupCall, hashSet));
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
            fa4.g(th, true);
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
            i2 = 2131743042;
        } else {
            i2 = 2131743041;
        }
        SpannableStringBuilder T2 = gl.T2(k96.M0(i2, null));
        hd hdVar = alertDialog$Builder.a;
        hdVar.U = T2;
        alertDialog$Builder.j(k96.M0(2131745303, null), new mh(activity, (byte) 4));
        alertDialog$Builder.g(k96.M0(2131751760, null), null);
        hdVar.setOnDismissListener(new ne(runnable, (byte) 3));
        if (z) {
            i3 = 2131624117;
        } else {
            i3 = 2131624121;
        }
        int i4 = bkb.K5;
        alertDialog$Builder.l(i3, 72, bkb.w0(null, i4, false), null);
        alertDialog$Builder.m(i4, null);
        alertDialog$Builder.o();
    }

    public static void i(Activity activity) {
        final SharedPreferences c1 = na7.c1();
        LinearLayout m = ir2.m(activity, 1);
        TextView textView = new TextView(activity);
        textView.setTextSize(1, 15.0f);
        textView.setText("Please only change these settings if you know exactly what they do.");
        zkb.X(textView, bkb.i5, null);
        m.addView(textView, nme.k(16.0f, 8.0f, 16.0f, 8.0f, -1, -2));
        final ahb ahbVar = new ahb(activity);
        ahbVar.f("Force TCP", c1.getBoolean("dbg_force_tcp_in_calls", false), false);
        ahbVar.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                byte b = r3;
                ahb ahbVar2 = ahbVar;
                SharedPreferences sharedPreferences = c1;
                switch (b) {
                    case 0:
                        boolean z = sharedPreferences.getBoolean("dbg_force_tcp_in_calls", false);
                        SharedPreferences.Editor edit = sharedPreferences.edit();
                        boolean z2 = !z;
                        edit.putBoolean("dbg_force_tcp_in_calls", z2);
                        edit.commit();
                        ahbVar2.setChecked(z2);
                        return;
                    case 1:
                        boolean z3 = sharedPreferences.getBoolean("dbg_dump_call_stats", false);
                        SharedPreferences.Editor edit2 = sharedPreferences.edit();
                        boolean z4 = !z3;
                        edit2.putBoolean("dbg_dump_call_stats", z4);
                        edit2.commit();
                        ahbVar2.setChecked(z4);
                        return;
                    default:
                        boolean z5 = sharedPreferences.getBoolean("dbg_force_connection_service", false);
                        SharedPreferences.Editor edit3 = sharedPreferences.edit();
                        boolean z6 = !z5;
                        edit3.putBoolean("dbg_force_connection_service", z6);
                        edit3.commit();
                        ahbVar2.setChecked(z6);
                        return;
                }
            }
        });
        m.addView(ahbVar);
        if (w01.a) {
            final ahb ahbVar2 = new ahb(activity);
            ahbVar2.f("Dump detailed stats", c1.getBoolean("dbg_dump_call_stats", false), false);
            ahbVar2.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    byte b = r3;
                    ahb ahbVar22 = ahbVar2;
                    SharedPreferences sharedPreferences = c1;
                    switch (b) {
                        case 0:
                            boolean z = sharedPreferences.getBoolean("dbg_force_tcp_in_calls", false);
                            SharedPreferences.Editor edit = sharedPreferences.edit();
                            boolean z2 = !z;
                            edit.putBoolean("dbg_force_tcp_in_calls", z2);
                            edit.commit();
                            ahbVar22.setChecked(z2);
                            return;
                        case 1:
                            boolean z3 = sharedPreferences.getBoolean("dbg_dump_call_stats", false);
                            SharedPreferences.Editor edit2 = sharedPreferences.edit();
                            boolean z4 = !z3;
                            edit2.putBoolean("dbg_dump_call_stats", z4);
                            edit2.commit();
                            ahbVar22.setChecked(z4);
                            return;
                        default:
                            boolean z5 = sharedPreferences.getBoolean("dbg_force_connection_service", false);
                            SharedPreferences.Editor edit3 = sharedPreferences.edit();
                            boolean z6 = !z5;
                            edit3.putBoolean("dbg_force_connection_service", z6);
                            edit3.commit();
                            ahbVar22.setChecked(z6);
                            return;
                    }
                }
            });
            m.addView(ahbVar2);
        }
        if (Build.VERSION.SDK_INT >= 26) {
            final ahb ahbVar3 = new ahb(activity);
            ahbVar3.f("Enable ConnectionService", c1.getBoolean("dbg_force_connection_service", false), false);
            ahbVar3.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    byte b = r3;
                    ahb ahbVar22 = ahbVar3;
                    SharedPreferences sharedPreferences = c1;
                    switch (b) {
                        case 0:
                            boolean z = sharedPreferences.getBoolean("dbg_force_tcp_in_calls", false);
                            SharedPreferences.Editor edit = sharedPreferences.edit();
                            boolean z2 = !z;
                            edit.putBoolean("dbg_force_tcp_in_calls", z2);
                            edit.commit();
                            ahbVar22.setChecked(z2);
                            return;
                        case 1:
                            boolean z3 = sharedPreferences.getBoolean("dbg_dump_call_stats", false);
                            SharedPreferences.Editor edit2 = sharedPreferences.edit();
                            boolean z4 = !z3;
                            edit2.putBoolean("dbg_dump_call_stats", z4);
                            edit2.commit();
                            ahbVar22.setChecked(z4);
                            return;
                        default:
                            boolean z5 = sharedPreferences.getBoolean("dbg_force_connection_service", false);
                            SharedPreferences.Editor edit3 = sharedPreferences.edit();
                            boolean z6 = !z5;
                            edit3.putBoolean("dbg_force_connection_service", z6);
                            edit3.commit();
                            ahbVar22.setChecked(z6);
                            return;
                    }
                }
            });
            m.addView(ahbVar3);
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity);
        alertDialog$Builder.a.S = k96.M0(2131751633, null);
        alertDialog$Builder.n(m);
        alertDialog$Builder.o();
    }

    public static void j(final Activity activity, kbc kbcVar, boolean z, final long j, final long j2, final int i, final boolean z2) {
        File file;
        String str;
        String str2;
        String M0;
        String str3;
        boolean z3 = w01.a;
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
        LinearLayout m = ir2.m(activity, 1);
        int L = gl.L(16.0f);
        m.setPadding(L, L, L, 0);
        final TextView textView = new TextView(activity);
        textView.setTextSize(2, 16.0f);
        zkb.X(textView, bkb.i5, null);
        de9.q(textView, 17, null, 2131743014);
        m.addView(textView);
        final ?? view = new View(activity);
        view.c = new Paint();
        view.d = (byte) 5;
        view.e = 0;
        view.a = BitmapFactory.decodeResource(view.getResources(), 2131231461).extractAlpha();
        view.b = BitmapFactory.decodeResource(view.getResources(), 2131231460).extractAlpha();
        m.addView((View) view, nme.t(-2, -2, 1, 0, 16, 0, 0));
        final LinearLayout linearLayout = new LinearLayout(activity);
        linearLayout.setOrientation(1);
        x00 x00Var = new x00((byte) 16);
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
                ag2 ag2Var = new ag2(activity, i2);
                ag2Var.setClipToPadding(false);
                ag2Var.setTag(strArr[i3]);
                switch (i3) {
                    case 0:
                        M0 = k96.M0(2131746223, null);
                        str3 = M0;
                        break;
                    case 1:
                        M0 = k96.M0(2131746222, null);
                        str3 = M0;
                        break;
                    case 2:
                        M0 = k96.M0(2131746228, null);
                        str3 = M0;
                        break;
                    case 3:
                        M0 = k96.M0(2131746226, null);
                        str3 = M0;
                        break;
                    case 4:
                        M0 = k96.M0(2131746227, null);
                        str3 = M0;
                        break;
                    case 5:
                        M0 = k96.M0(2131746230, null);
                        str3 = M0;
                        break;
                    case 6:
                        M0 = k96.M0(2131746225, null);
                        str3 = M0;
                        break;
                    case 7:
                        M0 = k96.M0(2131746224, null);
                        str3 = M0;
                        break;
                    case 8:
                        M0 = k96.M0(2131746229, null);
                        str3 = M0;
                        break;
                    default:
                        str3 = null;
                        break;
                }
                ag2Var.e(str3, null, false, false, false);
                ag2Var.setOnClickListener(x00Var);
                ag2Var.setTag(strArr[i3]);
                linearLayout.addView(ag2Var);
            }
            i3++;
            i2 = 1;
        }
        m.addView(linearLayout, nme.k(-8.0f, 0.0f, -8.0f, 0.0f, -1, -2));
        linearLayout.setVisibility(8);
        final EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(activity);
        editTextBoldCursor.setHint(k96.M0(2131743165, null));
        editTextBoldCursor.setInputType(147457);
        zkb.X(editTextBoldCursor, bkb.i5, null);
        zkb.D(editTextBoldCursor, bkb.s5, null);
        editTextBoldCursor.setBackground(null);
        zkb.F(editTextBoldCursor, bkb.t5, bkb.u5, bkb.p7, null);
        editTextBoldCursor.setPadding(0, gl.L(4.0f), 0, gl.L(4.0f));
        editTextBoldCursor.setTextSize(1, 18.0f);
        editTextBoldCursor.setVisibility(8);
        m.addView(editTextBoldCursor, nme.k(8.0f, 8.0f, 8.0f, 0.0f, -1, -2));
        final boolean[] zArr = {true};
        final ag2 ag2Var2 = new ag2(activity, 1);
        vzb vzbVar = new vzb(zArr, ag2Var2, (byte) 11);
        ag2Var2.e(k96.M0(2131752592, null), null, true, false, false);
        ag2Var2.setClipToPadding(false);
        ag2Var2.setOnClickListener(vzbVar);
        m.addView(ag2Var2, nme.k(-8.0f, 0.0f, -8.0f, 0.0f, -1, -2));
        final TextView textView2 = new TextView(activity);
        textView2.setTextSize(2, 14.0f);
        ug8.x(textView2, bkb.q5, null, null, 2131752591);
        textView2.setPadding(gl.L(8.0f), 0, gl.L(8.0f), 0);
        textView2.setOnClickListener(vzbVar);
        m.addView(textView2);
        ag2Var2.setVisibility(8);
        textView2.setVisibility(8);
        if (!file4.exists()) {
            zArr[0] = false;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity);
        alertDialog$Builder.a.S = k96.M0(2131752602, null);
        alertDialog$Builder.n(m);
        alertDialog$Builder.j(k96.M0(2131745448, null), new ho9((byte) 13));
        alertDialog$Builder.g(k96.M0(2131752577, null), null);
        alertDialog$Builder.a.setOnDismissListener(new ph8(kbcVar, (byte) 15));
        final hd hdVar = alertDialog$Builder.a;
        if (w01.a && file4.exists()) {
            cwb cwbVar = new cwb(activity, file4, (byte) 7);
            hdVar.s0 = "Send log";
            hdVar.t0 = cwbVar;
        }
        hdVar.show();
        hdVar.getWindow().setSoftInputMode(3);
        final View c = hdVar.c(-1);
        c.setEnabled(false);
        view.setOnRatingChangeListener(new em0(c));
        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                ag2 ag2Var3;
                qh0 qh0Var = qh0.this;
                int rating = qh0Var.getRating();
                LinearLayout linearLayout2 = linearLayout;
                EditTextBoldCursor editTextBoldCursor2 = editTextBoldCursor;
                File file5 = file4;
                hd hdVar2 = hdVar;
                if (rating < 4) {
                    int[] iArr2 = iArr;
                    if (iArr2[0] != 1) {
                        iArr2[0] = 1;
                        qh0Var.setVisibility(8);
                        textView.setVisibility(8);
                        hdVar2.setTitle(k96.M0(2131752593, null));
                        editTextBoldCursor2.setVisibility(0);
                        if (file5.exists()) {
                            ag2Var2.setVisibility(0);
                            textView2.setVisibility(0);
                        }
                        linearLayout2.setVisibility(0);
                        ((TextView) c).setText(k96.M0(2131745448, null).toUpperCase());
                        return;
                    }
                }
                int i4 = y6c.t0;
                TL_phone.setCallRating setcallrating = new TL_phone.setCallRating();
                setcallrating.rating = qh0Var.getRating();
                ArrayList arrayList = new ArrayList();
                for (int i5 = 0; i5 < linearLayout2.getChildCount(); i5++) {
                    if (((ag2) linearLayout2.getChildAt(i5)).b()) {
                        arrayList.add("#" + ag2Var3.getTag());
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
                ConnectionsManager.getInstance(i).sendRequest(setcallrating, new ot(i4, zArr2, file5, setcallrating, arrayList, activity));
                hdVar2.dismiss();
            }
        });
    }

    public static void k(Activity activity, TLRPC.TL_messageActionPhoneCall tL_messageActionPhoneCall) {
        for (String str : na7.q1(y6c.t0).W3.getStringSet("calls_access_hashes", Collections.EMPTY_SET)) {
            String[] split = str.split(" ");
            if (split.length >= 2) {
                String str2 = split[0];
                if (str2.equals(tL_messageActionPhoneCall.call_id + "")) {
                    try {
                        j(activity, null, tL_messageActionPhoneCall.video, tL_messageActionPhoneCall.call_id, Long.parseLong(split[1]), y6c.t0, true);
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
        if (ConnectionsManager.getInstance(y6c.t0).getConnectionState() != 3) {
            boolean z2 = false;
            if (Settings.System.getInt(activity.getContentResolver(), "airplane_mode_on", 0) != 0) {
                z2 = true;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity);
            if (z2) {
                i = 2131743034;
            } else {
                i = 2131743032;
            }
            String M0 = k96.M0(i, null);
            hd hdVar = alertDialog$Builder.a;
            hdVar.S = M0;
            if (z2) {
                i2 = 2131743113;
            } else {
                i2 = 2131743114;
            }
            hdVar.U = k96.M0(i2, null);
            alertDialog$Builder.j(k96.M0(2131747638, null), null);
            if (z2) {
                Intent intent = new Intent("android.settings.AIRPLANE_MODE_SETTINGS");
                if (intent.resolveActivity(activity.getPackageManager()) != null) {
                    alertDialog$Builder.h(k96.M0(2131743033, null), new ogc(activity, intent, (byte) 1));
                }
            }
            try {
                alertDialog$Builder.o();
                return;
            } catch (Exception e) {
                fa4.g(e, true);
                return;
            }
        }
        f(null, chat, str, false, false, z, bool, activity, dVar, j5Var);
    }

    public static void m(org.telegram.tgnet.TLRPC.User r10, boolean r11, boolean r12, android.app.Activity r13, org.telegram.tgnet.TLRPC.UserFull r14, defpackage.j5 r15) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rgc.m(org.telegram.tgnet.TLRPC$User, boolean, boolean, android.app.Activity, org.telegram.tgnet.TLRPC$UserFull, j5):void");
    }
}
