package org.telegram.messenger;

import android.app.AlarmManager;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.Shader;
import android.media.AudioManager;
import android.media.SoundPool;
import android.net.Uri;
import android.os.Build;
import android.os.PowerManager;
import android.os.SystemClock;
import android.provider.Settings;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseArray;
import j$.util.Comparator$CC;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.messenger.voip.VoIPGroupNotification;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.LaunchActivity;
public final class dt extends c1 implements ls {
    public static String f22050j0;
    public static e0.i0 f22052l0;
    public static NotificationManager m0;
    public static AudioManager f22054o0;
    public static volatile dt[] f22055p0;
    public static final Object[] f22056q0;
    public static final a0.h f22057r0;
    public final ArrayList D;
    public final a0.h E;
    public long F;
    public long G;
    public int H;
    public int I;
    public int J;
    public boolean K;
    public int L;
    public boolean M;
    public int N;
    public long O;
    public Boolean P;
    public boolean Q;
    public boolean R;
    public boolean S;
    public boolean T;
    public final rs U;
    public final PowerManager.WakeLock V;
    public long W;
    public SoundPool X;
    public int Y;
    public int Z;
    public final ArrayList f22058a;
    public boolean f22059a0;
    public final ArrayList f22060b;
    public boolean f22061b0;
    public final a0.h f22062c;
    public final AlarmManager f22063c0;
    public final a0.h d;
    public final int f22064d0;
    public final a0.h f22065e;
    public final String f22066e0;
    public final a0.h f22067f;
    public final xh.f f22068f0;
    public final et f22069g0;
    public final a0.h h;
    public final char[] f22070h0;
    public final rs f22071i0;
    public final a0.h f22072n;
    public final a0.h f22073r;
    public final HashSet f22074s;
    public final ArrayList f22075w;
    public ArrayList f22076x;
    public final HashSet f22077y;
    public static final p5 f22051k0 = new p5("notificationsQueue");
    public static final long f22053n0 = m5.F(1);

    static {
        f22052l0 = null;
        m0 = null;
        if (Build.VERSION.SDK_INT >= 26 && t0.f25555b != null) {
            f22052l0 = new e0.i0(t0.f25555b);
            m0 = (NotificationManager) t0.f25555b.getSystemService("notification");
            i();
        }
        f22054o0 = (AudioManager) t0.f25555b.getSystemService("audio");
        f22055p0 = new dt[4];
        f22056q0 = new Object[4];
        for (int i7 = 0; i7 < 4; i7++) {
            f22056q0[i7] = new Object();
        }
        f22057r0 = new a0.h();
    }

    public dt(int i7) {
        super(i7);
        Object valueOf;
        this.f22058a = new ArrayList();
        this.f22060b = new ArrayList();
        this.f22062c = new a0.h();
        this.d = new a0.h();
        this.f22065e = new a0.h();
        this.f22067f = new a0.h();
        this.h = new a0.h();
        this.f22072n = new a0.h();
        this.f22073r = new a0.h();
        this.f22074s = new HashSet();
        this.f22075w = new ArrayList();
        this.f22076x = new ArrayList();
        this.f22077y = new HashSet();
        this.D = new ArrayList();
        this.E = new a0.h();
        this.F = 0L;
        this.G = 0L;
        this.H = 5000;
        this.I = 0;
        this.J = 0;
        this.K = false;
        this.L = 0;
        this.N = -1;
        this.f22068f0 = new xh.f();
        this.f22070h0 = new char[]{10252, 10338, 10385, 10280, 10277, 10286, 10321};
        this.f22071i0 = new rs(this, 11);
        this.f22064d0 = this.currentAccount + 1;
        StringBuilder sb2 = new StringBuilder("messages");
        int i10 = this.currentAccount;
        if (i10 == 0) {
            valueOf = "";
        } else {
            valueOf = Integer.valueOf(i10);
        }
        sb2.append(valueOf);
        this.f22066e0 = sb2.toString();
        SharedPreferences c10 = getAccountInstance().c();
        this.M = c10.getBoolean("EnableInChatSound", true);
        this.R = c10.getBoolean("badgeNumber", true);
        this.S = c10.getBoolean("badgeNumberMuted", false);
        this.T = c10.getBoolean("badgeNumberMessages", true);
        f22052l0 = new e0.i0(t0.f25555b);
        m0 = (NotificationManager) t0.f25555b.getSystemService("notification");
        try {
            f22054o0 = (AudioManager) t0.f25555b.getSystemService("audio");
        } catch (Exception e10) {
            a8.g(e10, true);
        }
        try {
            this.f22063c0 = (AlarmManager) t0.f25555b.getSystemService("alarm");
        } catch (Exception e11) {
            a8.g(e11, true);
        }
        try {
            PowerManager.WakeLock newWakeLock = ((PowerManager) t0.f25555b.getSystemService("power")).newWakeLock(1, "telegram:notification_delay_lock");
            this.V = newWakeLock;
            newWakeLock.setReferenceCounted(false);
        } catch (Exception e12) {
            a8.g(e12, true);
        }
        this.U = new rs(this, 12);
        this.f22069g0 = new et(this.currentAccount);
        g0.h3(new rs(this, 13));
    }

    public static boolean E(ij ijVar) {
        TLRPC.MessageAction messageAction;
        TLRPC.Message message = ijVar.f23237k;
        TLRPC.Peer peer = message.peer_id;
        if ((peer != null && peer.chat_id == 0 && peer.channel_id == 0 && ((messageAction = message.action) == null || (messageAction instanceof TLRPC.TL_messageActionEmpty))) || ijVar.J) {
            return true;
        }
        return false;
    }

    public static Bitmap F(ArrayList arrayList) {
        float f10;
        int i7;
        Bitmap bitmap;
        Paint paint;
        boolean z9;
        float f11;
        char c10;
        float size;
        float size2;
        float f12;
        float f13;
        float f14;
        float f15;
        Object obj;
        ArrayList arrayList2 = arrayList;
        if (Build.VERSION.SDK_INT < 28 || arrayList2.size() == 0) {
            return null;
        }
        int L = g0.L(64.0f);
        Bitmap createBitmap = Bitmap.createBitmap(L, L, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Matrix matrix = new Matrix();
        Paint paint2 = new Paint(3);
        boolean z10 = true;
        Paint paint3 = new Paint(1);
        Rect rect = new Rect();
        paint3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        if (arrayList2.size() == 1) {
            f10 = 1.0f;
        } else if (arrayList2.size() == 2) {
            f10 = 0.65f;
        } else {
            f10 = 0.5f;
        }
        int i10 = 0;
        TextPaint textPaint = null;
        while (i10 < arrayList2.size()) {
            float f16 = L;
            float f17 = (1.0f - f10) * f16;
            try {
                size = (f17 / arrayList2.size()) * ((arrayList2.size() - 1) - i10);
                size2 = i10 * (f17 / arrayList2.size());
                f12 = f16 * f10;
                f13 = f12 / 2.0f;
                i7 = L;
                f14 = size + f13;
                bitmap = createBitmap;
                f15 = size2 + f13;
                f11 = f10;
                try {
                    canvas.drawCircle(f14, f15, g0.L(2.0f) + f13, paint3);
                    obj = arrayList2.get(i10);
                    paint = paint3;
                } catch (Throwable unused) {
                    paint = paint3;
                }
            } catch (Throwable unused2) {
                i7 = L;
                bitmap = createBitmap;
                paint = paint3;
                z9 = z10;
                f11 = f10;
            }
            if (obj instanceof File) {
                String absolutePath = ((File) arrayList2.get(i10)).getAbsolutePath();
                BitmapFactory.Options options = new BitmapFactory.Options();
                z9 = true;
                try {
                    options.inJustDecodeBounds = true;
                    BitmapFactory.decodeFile(absolutePath, options);
                    int i11 = (int) f12;
                    options.inSampleSize = fi.e7.d(options, i11, i11);
                    try {
                        options.inJustDecodeBounds = false;
                        options.inDither = true;
                        Bitmap decodeFile = BitmapFactory.decodeFile(absolutePath, options);
                        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                        BitmapShader bitmapShader = new BitmapShader(decodeFile, tileMode, tileMode);
                        matrix.reset();
                        matrix.postScale(f12 / decodeFile.getWidth(), f12 / decodeFile.getHeight());
                        matrix.postTranslate(size, size2);
                        bitmapShader.setLocalMatrix(matrix);
                        paint2.setShader(bitmapShader);
                        canvas.drawCircle(f14, f15, f13, paint2);
                        decodeFile.recycle();
                    } catch (Throwable unused3) {
                        c10 = 2;
                    }
                } catch (Throwable unused4) {
                    c10 = 2;
                    i10++;
                    z10 = z9;
                    L = i7;
                    createBitmap = bitmap;
                    f10 = f11;
                    paint3 = paint;
                    arrayList2 = arrayList;
                }
            } else if (obj instanceof TLRPC.User) {
                TLRPC.User user = (TLRPC.User) obj;
                c10 = 2;
                try {
                    paint2.setShader(new LinearGradient(size, size2, size, size2 + f12, new int[]{org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f28070p8[org.telegram.ui.Components.w8.e(user.f27101id)], false), org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f28090q8[org.telegram.ui.Components.w8.e(user.f27101id)], false)}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
                    canvas.drawCircle(f14, f15, f13, paint2);
                    if (textPaint == null) {
                        try {
                            z9 = true;
                            try {
                                TextPaint textPaint2 = new TextPaint(1);
                                try {
                                    textPaint2.setTypeface(g0.o());
                                    textPaint2.setTextSize(f16 * 0.25f);
                                    textPaint2.setColor(-1);
                                    textPaint = textPaint2;
                                } catch (Throwable unused5) {
                                    textPaint = textPaint2;
                                    i10++;
                                    z10 = z9;
                                    L = i7;
                                    createBitmap = bitmap;
                                    f10 = f11;
                                    paint3 = paint;
                                    arrayList2 = arrayList;
                                }
                            } catch (Throwable unused6) {
                            }
                        } catch (Throwable unused7) {
                            z9 = true;
                        }
                    } else {
                        z9 = true;
                    }
                    StringBuilder sb2 = new StringBuilder();
                    org.telegram.ui.Components.w8.a(user.first_name, user.last_name, null, sb2);
                    String sb3 = sb2.toString();
                    try {
                        textPaint.getTextBounds(sb3, 0, sb3.length(), rect);
                        canvas.drawText(sb3, (f14 - (rect.width() / 2.0f)) - rect.left, (f15 - (rect.height() / 2.0f)) - rect.top, textPaint);
                    } catch (Throwable unused8) {
                    }
                } catch (Throwable unused9) {
                }
                i10++;
                z10 = z9;
                L = i7;
                createBitmap = bitmap;
                f10 = f11;
                paint3 = paint;
                arrayList2 = arrayList;
            }
            c10 = 2;
            z9 = true;
            i10++;
            z10 = z9;
            L = i7;
            createBitmap = bitmap;
            f10 = f11;
            paint3 = paint;
            arrayList2 = arrayList;
        }
        return createBitmap;
    }

    public static void W(Notification notification, e0.q qVar, boolean z9) {
        if (z9) {
            qVar.f10115y = f22050j0;
        } else {
            qVar.f10115y = notification.getChannelId();
        }
    }

    public static void a(dt dtVar, String str, long j3) {
        boolean z9;
        String M0;
        if (dtVar.getUserConfig().p()) {
            if (iz.Q0 || dtVar.currentAccount == p10.f24459s0) {
                try {
                    String str2 = "wallet_tonconnect_" + dtVar.currentAccount;
                    if (Build.VERSION.SDK_INT >= 26) {
                        m0.createNotificationChannel(new NotificationChannel(str2, "TON Connect", 3));
                    }
                    if (!g0.p2(false) && !iz.C && dtVar.getAccountInstance().c().getBoolean("EnablePreviewAll", true)) {
                        z9 = false;
                        if (!TextUtils.isEmpty(str) && !z9) {
                            M0 = hd.a0(null, null, 2131747924, str);
                            Intent intent = new Intent(t0.f25555b, LaunchActivity.class);
                            intent.setAction("android.intent.action.VIEW");
                            intent.setData(Uri.parse("tg://resolve?domain=sendgrams"));
                            intent.putExtra("currentAccount", dtVar.currentAccount);
                            intent.addFlags(67108864);
                            PendingIntent activity = PendingIntent.getActivity(t0.f25555b, dtVar.currentAccount, intent, 201326592);
                            e0.q qVar = new e0.q(t0.f25555b, str2);
                            qVar.F.icon = 2131232452;
                            qVar.f10097e = e0.q.d(hd.M0(2131689472, null));
                            qVar.f10098f = e0.q.d(M0);
                            e0.l lVar = new e0.l(false);
                            lVar.f10087f = e0.q.d(M0);
                            qVar.n(lVar);
                            qVar.f10112u = "event";
                            qVar.f10114x = 0;
                            qVar.F.when = j3;
                            qVar.h(16, true);
                            qVar.f10099g = activity;
                            f22052l0.e("wallet_tonconnect", dtVar.currentAccount, qVar.b());
                        }
                        M0 = hd.M0(2131747925, null);
                        Intent intent2 = new Intent(t0.f25555b, LaunchActivity.class);
                        intent2.setAction("android.intent.action.VIEW");
                        intent2.setData(Uri.parse("tg://resolve?domain=sendgrams"));
                        intent2.putExtra("currentAccount", dtVar.currentAccount);
                        intent2.addFlags(67108864);
                        PendingIntent activity2 = PendingIntent.getActivity(t0.f25555b, dtVar.currentAccount, intent2, 201326592);
                        e0.q qVar2 = new e0.q(t0.f25555b, str2);
                        qVar2.F.icon = 2131232452;
                        qVar2.f10097e = e0.q.d(hd.M0(2131689472, null));
                        qVar2.f10098f = e0.q.d(M0);
                        e0.l lVar2 = new e0.l(false);
                        lVar2.f10087f = e0.q.d(M0);
                        qVar2.n(lVar2);
                        qVar2.f10112u = "event";
                        qVar2.f10114x = 0;
                        qVar2.F.when = j3;
                        qVar2.h(16, true);
                        qVar2.f10099g = activity2;
                        f22052l0.e("wallet_tonconnect", dtVar.currentAccount, qVar2.b());
                    }
                    z9 = true;
                    if (!TextUtils.isEmpty(str)) {
                        M0 = hd.a0(null, null, 2131747924, str);
                        Intent intent22 = new Intent(t0.f25555b, LaunchActivity.class);
                        intent22.setAction("android.intent.action.VIEW");
                        intent22.setData(Uri.parse("tg://resolve?domain=sendgrams"));
                        intent22.putExtra("currentAccount", dtVar.currentAccount);
                        intent22.addFlags(67108864);
                        PendingIntent activity22 = PendingIntent.getActivity(t0.f25555b, dtVar.currentAccount, intent22, 201326592);
                        e0.q qVar22 = new e0.q(t0.f25555b, str2);
                        qVar22.F.icon = 2131232452;
                        qVar22.f10097e = e0.q.d(hd.M0(2131689472, null));
                        qVar22.f10098f = e0.q.d(M0);
                        e0.l lVar22 = new e0.l(false);
                        lVar22.f10087f = e0.q.d(M0);
                        qVar22.n(lVar22);
                        qVar22.f10112u = "event";
                        qVar22.f10114x = 0;
                        qVar22.F.when = j3;
                        qVar22.h(16, true);
                        qVar22.f10099g = activity22;
                        f22052l0.e("wallet_tonconnect", dtVar.currentAccount, qVar22.b());
                    }
                    M0 = hd.M0(2131747925, null);
                    Intent intent222 = new Intent(t0.f25555b, LaunchActivity.class);
                    intent222.setAction("android.intent.action.VIEW");
                    intent222.setData(Uri.parse("tg://resolve?domain=sendgrams"));
                    intent222.putExtra("currentAccount", dtVar.currentAccount);
                    intent222.addFlags(67108864);
                    PendingIntent activity222 = PendingIntent.getActivity(t0.f25555b, dtVar.currentAccount, intent222, 201326592);
                    e0.q qVar222 = new e0.q(t0.f25555b, str2);
                    qVar222.F.icon = 2131232452;
                    qVar222.f10097e = e0.q.d(hd.M0(2131689472, null));
                    qVar222.f10098f = e0.q.d(M0);
                    e0.l lVar222 = new e0.l(false);
                    lVar222.f10087f = e0.q.d(M0);
                    qVar222.n(lVar222);
                    qVar222.f10112u = "event";
                    qVar222.f10114x = 0;
                    qVar222.F.when = j3;
                    qVar222.h(16, true);
                    qVar222.f10099g = activity222;
                    f22052l0.e("wallet_tonconnect", dtVar.currentAccount, qVar222.b());
                } catch (Exception e10) {
                    a8.g(e10, true);
                }
            }
        }
    }

    public static void b(dt dtVar) {
        try {
            SharedPreferences c10 = dtVar.getAccountInstance().c();
            Map<String, ?> all = c10.getAll();
            SharedPreferences.Editor edit = c10.edit();
            for (Map.Entry<String, ?> entry : all.entrySet()) {
                String key = entry.getKey();
                if (key.startsWith("org.telegram.key")) {
                    if (!key.endsWith("_s")) {
                        String str = (String) entry.getValue();
                        m0.deleteNotificationChannel(str);
                        if (r2.f25191a) {
                            a8.b("delete all channel " + str);
                        }
                    }
                    edit.remove(key);
                }
            }
            edit.commit();
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    public static void c(dt dtVar) {
        PowerManager.WakeLock wakeLock = dtVar.V;
        f22052l0.b(dtVar.currentAccount, "wallet_tonconnect");
        dtVar.F = 0L;
        dtVar.G = 0L;
        dtVar.I = 0;
        dtVar.J = 0;
        dtVar.f22058a.clear();
        dtVar.f22062c.b();
        dtVar.d.b();
        dtVar.f22067f.b();
        dtVar.h.b();
        dtVar.f22072n.b();
        dtVar.f22077y.clear();
        dtVar.f22060b.clear();
        dtVar.K = false;
        dtVar.N = 0;
        try {
            if (wakeLock.isHeld()) {
                wakeLock.release();
            }
        } catch (Exception e10) {
            a8.g(e10, true);
        }
        dtVar.p();
        dtVar.S(dtVar.z());
        SharedPreferences.Editor edit = dtVar.getAccountInstance().c().edit();
        edit.clear();
        edit.commit();
        if (Build.VERSION.SDK_INT >= 26) {
            try {
                m0.deleteNotificationChannelGroup("channels" + dtVar.currentAccount);
                m0.deleteNotificationChannelGroup("groups" + dtVar.currentAccount);
                m0.deleteNotificationChannelGroup("private" + dtVar.currentAccount);
                m0.deleteNotificationChannelGroup("stories" + dtVar.currentAccount);
                m0.deleteNotificationChannelGroup("other" + dtVar.currentAccount);
                String str = dtVar.currentAccount + "channel";
                List<NotificationChannel> notificationChannels = m0.getNotificationChannels();
                int size = notificationChannels.size();
                for (int i7 = 0; i7 < size; i7++) {
                    String id2 = notificationChannels.get(i7).getId();
                    if (id2.startsWith(str)) {
                        try {
                            m0.deleteNotificationChannel(id2);
                        } catch (Exception e11) {
                            a8.g(e11, true);
                        }
                        if (r2.f25191a) {
                            a8.b("delete channel cleanup " + id2);
                        }
                    }
                }
            } catch (Throwable th2) {
                a8.g(th2, true);
            }
        }
    }

    public static void e(org.telegram.messenger.dt r44, java.util.ArrayList r45, java.util.ArrayList r46, boolean r47, boolean r48, java.util.concurrent.CountDownLatch r49) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.dt.e(org.telegram.messenger.dt, java.util.ArrayList, java.util.ArrayList, boolean, boolean, java.util.concurrent.CountDownLatch):void");
    }

    public static void f(dt dtVar, ArrayList arrayList, a0.h hVar, ArrayList arrayList2, Collection collection) {
        long j3;
        long j10;
        boolean z9;
        int i7;
        int i10;
        int i11;
        int intValue;
        long j11;
        boolean z10;
        int i12;
        TLRPC.MessageFwdHeader messageFwdHeader;
        long j12;
        long j13;
        TLRPC.Message message;
        long j14;
        TLRPC.Message message2;
        SparseArray sparseArray;
        ij ijVar;
        long j15;
        boolean z11;
        boolean z12;
        SparseArray sparseArray2;
        int intValue2;
        dtVar.f22067f.b();
        dtVar.f22058a.clear();
        dtVar.f22062c.b();
        dtVar.D.clear();
        dtVar.E.b();
        boolean z13 = false;
        dtVar.I = 0;
        dtVar.J = 0;
        dtVar.getAccountInstance().c();
        a0.h hVar2 = new a0.h();
        for (int i13 = 0; i13 < arrayList.size(); i13++) {
            TLRPC.Message message3 = (TLRPC.Message) arrayList.get(i13);
            if (message3 != null && ((messageFwdHeader = message3.fwd_from) == null || !messageFwdHeader.imported)) {
                TLRPC.MessageAction messageAction = message3.action;
                if (!(messageAction instanceof TLRPC.TL_messageActionSetMessagesTTL) && (!message3.silent || (!(messageAction instanceof TLRPC.TL_messageActionContactSignUp) && !(messageAction instanceof TLRPC.TL_messageActionUserJoined)))) {
                    long j16 = message3.peer_id.channel_id;
                    if (j16 != 0) {
                        j12 = -j16;
                    } else {
                        j12 = 0;
                    }
                    SparseArray sparseArray3 = (SparseArray) dtVar.f22062c.f(j12);
                    if (sparseArray3 == null || sparseArray3.indexOfKey(message3.f26973id) < 0) {
                        ij ijVar2 = new ij(dtVar.currentAccount, message3, false, false);
                        if (E(ijVar2)) {
                            dtVar.J++;
                        }
                        long B0 = ij.B0(ijVar2.f23237k);
                        long c22 = ij.c2(dtVar.currentAccount, ijVar2.f23237k, dtVar.getMessagesController().u2(ijVar2), false);
                        if (ijVar2.f23237k.mentioned) {
                            message = message3;
                            j14 = ijVar2.Z0();
                            j13 = j12;
                        } else {
                            j13 = j12;
                            message = message3;
                            j14 = B0;
                        }
                        int h = hVar2.h(j14);
                        if (h >= 0 && c22 == 0) {
                            z12 = ((Boolean) hVar2.n(h)).booleanValue();
                            message2 = message;
                            sparseArray = sparseArray3;
                            ijVar = ijVar2;
                            j15 = j13;
                        } else {
                            int u10 = dtVar.u(j14, c22);
                            if (u10 == -1) {
                                message2 = message;
                                sparseArray = sparseArray3;
                                j15 = j13;
                                z12 = dtVar.D(j14, null, ijVar2.I, ijVar2.J);
                                ijVar = ijVar2;
                            } else {
                                message2 = message;
                                sparseArray = sparseArray3;
                                ijVar = ijVar2;
                                j15 = j13;
                                if (u10 != 2) {
                                    z11 = true;
                                } else {
                                    z11 = false;
                                }
                                z12 = z11;
                            }
                            hVar2.k(Boolean.valueOf(z12), j14);
                        }
                        if (z12 && (j14 != dtVar.F || !t0.f25562w)) {
                            if (sparseArray == null) {
                                sparseArray2 = new SparseArray();
                                dtVar.f22062c.k(sparseArray2, j15);
                            } else {
                                sparseArray2 = sparseArray;
                            }
                            sparseArray2.put(message2.f26973id, ijVar);
                            dtVar.h(ijVar);
                            if (B0 != j14) {
                                Integer num = (Integer) dtVar.f22073r.f(B0);
                                a0.h hVar3 = dtVar.f22073r;
                                if (num == null) {
                                    intValue2 = 1;
                                } else {
                                    intValue2 = num.intValue() + 1;
                                }
                                hVar3.k(Integer.valueOf(intValue2), B0);
                            }
                        }
                    }
                }
            }
        }
        long j17 = 0;
        int i14 = 0;
        while (i14 < hVar.m()) {
            long j18 = hVar.j(i14);
            int h7 = hVar2.h(j18);
            if (h7 >= 0) {
                z10 = ((Boolean) hVar2.n(h7)).booleanValue();
            } else {
                int u11 = dtVar.u(j18, j17);
                if (u11 == -1) {
                    z10 = dtVar.D(j18, null, false, false);
                } else if (u11 != 2) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                hVar2.k(Boolean.valueOf(z10), j18);
            }
            if (z10) {
                Integer num2 = (Integer) hVar.n(i14);
                int intValue3 = num2.intValue();
                dtVar.f22067f.k(num2, j18);
                if (!dtVar.getMessagesController().p2(j18)) {
                    if (dtVar.getMessagesController().t2(j18)) {
                        int i15 = dtVar.I;
                        if (intValue3 > 0) {
                            i12 = 1;
                        } else {
                            i12 = 0;
                        }
                        dtVar.I = i15 + i12;
                    } else {
                        dtVar.I += intValue3;
                    }
                }
            }
            i14++;
            j17 = 0;
        }
        for (int i16 = 0; i16 < arrayList2.size(); i16++) {
            ij ijVar3 = (ij) arrayList2.get(i16);
            int f12 = ijVar3.f1();
            if (dtVar.f22062c.h(f12) < 0) {
                if (E(ijVar3)) {
                    dtVar.J++;
                }
                long B02 = ij.B0(ijVar3.f23237k);
                long c23 = ij.c2(dtVar.currentAccount, ijVar3.f23237k, dtVar.getMessagesController().u2(ijVar3), false);
                TLRPC.Message message4 = ijVar3.f23237k;
                long j19 = message4.random_id;
                if (message4.mentioned) {
                    j3 = ijVar3.Z0();
                } else {
                    j3 = B02;
                }
                int h10 = hVar2.h(j3);
                if (h10 >= 0 && c23 == 0) {
                    long j20 = j3;
                    z9 = ((Boolean) hVar2.n(h10)).booleanValue();
                    j10 = j20;
                } else {
                    int u12 = dtVar.u(j3, c23);
                    if (u12 == -1) {
                        j10 = j3;
                        z9 = dtVar.D(j10, null, ijVar3.I, ijVar3.J);
                    } else {
                        j10 = j3;
                        if (u12 != 2) {
                            z9 = true;
                        } else {
                            z9 = false;
                        }
                    }
                    hVar2.k(Boolean.valueOf(z9), j10);
                }
                if (z9 && (j10 != dtVar.F || !t0.f25562w)) {
                    if (f12 != 0) {
                        if (ijVar3.J) {
                            j11 = ij.B0(ijVar3.f23237k);
                        } else {
                            long j21 = ijVar3.f23237k.peer_id.channel_id;
                            if (j21 != 0) {
                                j11 = -j21;
                            } else {
                                j11 = 0;
                            }
                        }
                        SparseArray sparseArray4 = (SparseArray) dtVar.f22062c.f(j11);
                        if (sparseArray4 == null) {
                            sparseArray4 = new SparseArray();
                            dtVar.f22062c.k(sparseArray4, j11);
                        }
                        sparseArray4.put(f12, ijVar3);
                    } else if (j19 != 0) {
                        dtVar.d.k(ijVar3, j19);
                    }
                    dtVar.h(ijVar3);
                    if (B02 != j10) {
                        Integer num3 = (Integer) dtVar.f22073r.f(B02);
                        a0.h hVar4 = dtVar.f22073r;
                        if (num3 == null) {
                            intValue = 1;
                        } else {
                            intValue = num3.intValue() + 1;
                        }
                        hVar4.k(Integer.valueOf(intValue), B02);
                    }
                    Integer num4 = (Integer) dtVar.f22067f.f(j10);
                    if (num4 != null) {
                        i7 = num4.intValue() + 1;
                    } else {
                        i7 = 1;
                    }
                    if (!dtVar.getMessagesController().p2(j10)) {
                        if (dtVar.getMessagesController().t2(j10)) {
                            if (num4 != null) {
                                int i17 = dtVar.I;
                                if (num4.intValue() > 0) {
                                    i11 = 1;
                                } else {
                                    i11 = 0;
                                }
                                dtVar.I = i17 - i11;
                            }
                            int i18 = dtVar.I;
                            if (i7 > 0) {
                                i10 = 1;
                            } else {
                                i10 = 0;
                            }
                            dtVar.I = i18 + i10;
                        } else {
                            if (num4 != null) {
                                dtVar.I -= num4.intValue();
                            }
                            dtVar.I += i7;
                        }
                    }
                    dtVar.f22067f.k(Integer.valueOf(i7), j10);
                }
            }
        }
        if (collection != null) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                ct ctVar = (ct) it.next();
                long j22 = ctVar.f21896a;
                ct ctVar2 = (ct) dtVar.E.f(j22);
                if (ctVar2 != null) {
                    ctVar2.f21898c.putAll(ctVar.f21898c);
                } else {
                    dtVar.D.add(ctVar);
                    dtVar.E.k(ctVar, j22);
                }
            }
            Collections.sort(dtVar.D, Comparator$CC.comparingLong(new sk(2)));
        }
        g0.h3(new xs(dtVar, dtVar.f22067f.m(), 4));
        if (SystemClock.elapsedRealtime() / 1000 < 60) {
            z13 = true;
        }
        dtVar.Z(z13);
        if (dtVar.R) {
            dtVar.S(dtVar.z());
        }
    }

    public static int g(java.util.ArrayList r3, org.telegram.messenger.ij r4, long r5, boolean r7, android.content.SharedPreferences r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.dt.g(java.util.ArrayList, org.telegram.messenger.ij, long, boolean, android.content.SharedPreferences):int");
    }

    public static void i() {
        SharedPreferences sharedPreferences;
        if (Build.VERSION.SDK_INT >= 26) {
            if (f22050j0 == null) {
                sharedPreferences = t0.f25555b.getSharedPreferences("Notifications", 0);
                f22050j0 = sharedPreferences.getString("OtherKey", "Other3");
            } else {
                sharedPreferences = null;
            }
            NotificationChannel notificationChannel = m0.getNotificationChannel(f22050j0);
            if (notificationChannel != null && notificationChannel.getImportance() == 0) {
                try {
                    m0.deleteNotificationChannel(f22050j0);
                } catch (Exception e10) {
                    a8.g(e10, true);
                }
                f22050j0 = null;
                notificationChannel = null;
            }
            if (f22050j0 == null) {
                if (sharedPreferences == null) {
                    sharedPreferences = t0.f25555b.getSharedPreferences("Notifications", 0);
                }
                f22050j0 = "Other" + Utilities.f21331b.nextLong();
                sharedPreferences.edit().putString("OtherKey", f22050j0).commit();
            }
            String M0 = hd.M0(2131749188, null);
            if (notificationChannel != null && !TextUtils.equals(notificationChannel.getName(), M0)) {
                notificationChannel.setName(M0);
                try {
                    m0.createNotificationChannel(notificationChannel);
                } catch (Exception e11) {
                    a8.g(e11, true);
                }
            }
            if (notificationChannel == null) {
                NotificationChannel notificationChannel2 = new NotificationChannel(f22050j0, M0, 3);
                notificationChannel2.enableLights(false);
                notificationChannel2.enableVibration(false);
                notificationChannel2.setSound(null, null);
                try {
                    m0.createNotificationChannel(notificationChannel2);
                } catch (Exception e12) {
                    a8.g(e12, true);
                }
            }
        }
    }

    public static String k(String str) {
        if (str == null) {
            return null;
        }
        int indexOf = str.indexOf(32);
        if (indexOf >= 0) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str.substring(0, indexOf));
            String str2 = "…";
            if (!str.endsWith("…")) {
                str2 = "";
            }
            sb2.append(str2);
            return sb2.toString();
        }
        return str;
    }

    public static String q(int i7) {
        if (i7 == 0) {
            return "EnableGroup2";
        }
        if (i7 == 1) {
            return "EnableAll2";
        }
        return "EnableChannel2";
    }

    public static String r(ij ijVar, String str) {
        boolean z9;
        int i7;
        TLRPC.Message message = ijVar.f23237k;
        TLRPC.TL_messageActionGramTransfer tL_messageActionGramTransfer = (TLRPC.TL_messageActionGramTransfer) message.action;
        boolean A = t10.A(ij.B0(message));
        if (!tL_messageActionGramTransfer.comment_encrypted && !TextUtils.isEmpty(tL_messageActionGramTransfer.comment)) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (A) {
            if (z9) {
                i7 = 2131748034;
            } else {
                i7 = 2131748035;
            }
        } else if (z9) {
            i7 = 2131748036;
        } else {
            i7 = 2131748037;
        }
        return hd.a0(null, null, i7, str, org.telegram.ui.Wallet.n0.s(tL_messageActionGramTransfer.amount, false), tL_messageActionGramTransfer.comment);
    }

    public static TLRPC.NotificationSound s(SharedPreferences sharedPreferences, String str, String str2, String str3) {
        long j3 = sharedPreferences.getLong(str2, 0L);
        String string = sharedPreferences.getString(str3, "NoSound");
        if (j3 != 0) {
            TLRPC.TL_notificationSoundRingtone tL_notificationSoundRingtone = new TLRPC.TL_notificationSoundRingtone();
            tL_notificationSoundRingtone.f27079id = j3;
            return tL_notificationSoundRingtone;
        } else if (string != null) {
            if (string.equalsIgnoreCase("NoSound")) {
                return new TLRPC.TL_notificationSoundNone();
            }
            TLRPC.TL_notificationSoundLocal tL_notificationSoundLocal = new TLRPC.TL_notificationSoundLocal();
            tL_notificationSoundLocal.title = sharedPreferences.getString(str, null);
            tL_notificationSoundLocal.data = string;
            return tL_notificationSoundLocal;
        } else {
            return new TLRPC.TL_notificationSoundDefault();
        }
    }

    public static dt t(int i7) {
        dt dtVar;
        dt dtVar2 = f22055p0[i7];
        if (dtVar2 == null) {
            synchronized (f22056q0[i7]) {
                try {
                    dtVar = f22055p0[i7];
                    if (dtVar == null) {
                        dt[] dtVarArr = f22055p0;
                        dt dtVar3 = new dt(i7);
                        dtVarArr[i7] = dtVar3;
                        dtVar = dtVar3;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return dtVar;
        }
        return dtVar2;
    }

    public static String v(long j3, long j10, boolean z9) {
        String valueOf;
        if (z9) {
            if (j10 != 0) {
                Locale locale = Locale.US;
                return j3 + "_" + j10;
            }
            return String.valueOf(j3);
        }
        long j11 = (j10 << 12) + j3;
        a0.h hVar = f22057r0;
        int h = hVar.h(j11);
        if (h >= 0) {
            return (String) hVar.n(h);
        }
        if (j10 != 0) {
            Locale locale2 = Locale.US;
            valueOf = j3 + "_" + j10;
        } else {
            valueOf = String.valueOf(j3);
        }
        hVar.k(valueOf, j11);
        return valueOf;
    }

    public final boolean A() {
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.f22058a;
            if (i7 >= arrayList.size()) {
                return false;
            }
            ij ijVar = (ij) arrayList.get(i7);
            long B0 = ij.B0(ijVar.f23237k);
            if (!ijVar.I) {
                TLRPC.Message message = ijVar.f23237k;
                if ((!message.mentioned || !(message.action instanceof TLRPC.TL_messageActionPinMessage)) && !m5.C(B0) && ((ijVar.f23237k.peer_id.channel_id == 0 || ijVar.B4()) && B0 != 489000 && B0 != 489001)) {
                    return true;
                }
            }
            i7++;
        }
    }

    public final boolean B(int i7) {
        if (i7 == 4) {
            return getAccountInstance().c().getBoolean("EnableReactionsMessages", true);
        }
        if (i7 == 5) {
            return getAccountInstance().c().getBoolean("EnableReactionsStories", true);
        }
        if (i7 == 3) {
            return getAccountInstance().c().getBoolean("EnableAllStories", true);
        }
        if (getAccountInstance().c().getInt(q(i7), 0) < getConnectionsManager().getCurrentTime()) {
            return true;
        }
        return false;
    }

    public final boolean C(long j3) {
        return D(j3, null, false, false);
    }

    public final boolean D(long r1, java.lang.Boolean r3, boolean r4, boolean r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.dt.D(long, java.lang.Boolean, boolean, boolean):boolean");
    }

    public final void G(long j3, long j10, boolean z9) {
        boolean z10;
        if (z9) {
            t(this.currentAccount).H(j3, Integer.MAX_VALUE, j10);
            return;
        }
        boolean D = t(this.currentAccount).D(j3, null, false, false);
        int i7 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        if (i7 != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        SharedPreferences.Editor edit = qp.s1(this.currentAccount).f24749d7.edit();
        if (D && !z10) {
            edit.remove("notify2_" + v(j3, j10, false));
        } else {
            edit.putInt("notify2_" + v(j3, j10, false), 0);
        }
        if (i7 == 0) {
            getMessagesStorage().E1(j3, 0L);
            TLRPC.Dialog dialog = (TLRPC.Dialog) getMessagesController().Q.f(j3);
            if (dialog != null) {
                dialog.notify_settings = new TLRPC.TL_peerNotifySettings();
            }
        }
        edit.apply();
        c0(j3, j10, true);
    }

    public final void H(long j3, int i7, long j10) {
        boolean z9;
        long j11 = 0;
        if (j3 != 0) {
            SharedPreferences.Editor edit = qp.s1(this.currentAccount).f24749d7.edit();
            int i10 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
            if (i10 != 0) {
                z9 = true;
            } else {
                z9 = false;
            }
            boolean D = t(this.currentAccount).D(j3, null, false, false);
            String v = v(j3, j10, false);
            if (i7 == Integer.MAX_VALUE) {
                if (!D && !z9) {
                    edit.remove("notify2_" + v);
                } else {
                    edit.putInt("notify2_" + v, 2);
                    j11 = 1L;
                }
            } else {
                edit.putInt("notify2_" + v, 3);
                edit.putInt("notifyuntil_" + v, getConnectionsManager().getCurrentTime() + i7);
                j11 = (((long) i7) << 32) | 1;
            }
            edit.apply();
            if (i10 == 0) {
                t(this.currentAccount).N(j3);
                yr.a0(this.currentAccount).E1(j3, j11);
                TLRPC.Dialog dialog = (TLRPC.Dialog) qp.s1(this.currentAccount).Q.f(j3);
                if (dialog != null) {
                    TLRPC.TL_peerNotifySettings tL_peerNotifySettings = new TLRPC.TL_peerNotifySettings();
                    dialog.notify_settings = tL_peerNotifySettings;
                    if (i7 != Integer.MAX_VALUE || D) {
                        tL_peerNotifySettings.mute_until = i7;
                    }
                }
            }
            t(this.currentAccount).c0(j3, j10, true);
        }
    }

    public final Pair I(ArrayList arrayList, ArrayList arrayList2) {
        String str;
        TLRPC.FileLocation fileLocation;
        ArrayList arrayList3 = this.D;
        int min = Math.min(3, arrayList3.size());
        boolean z9 = false;
        int i7 = 0;
        for (int i10 = 0; i10 < min; i10++) {
            ct ctVar = (ct) arrayList3.get(i10);
            HashMap hashMap = ctVar.f21898c;
            long j3 = ctVar.f21896a;
            i7 += hashMap.size();
            z9 |= ctVar.d;
            TLRPC.User a22 = getMessagesController().a2(Long.valueOf(j3));
            if (a22 == null && (a22 = getMessagesStorage().k0(j3)) != null) {
                getMessagesController().X3(a22, true, false);
            }
            File file = null;
            if (a22 != null) {
                str = t10.p(a22);
                TLRPC.UserProfilePhoto userProfilePhoto = a22.photo;
                if (userProfilePhoto != null && (fileLocation = userProfilePhoto.photo_small) != null && fileLocation.volume_id != 0 && fileLocation.local_id != 0) {
                    w7 fileLoader = getFileLoader();
                    TLRPC.FileLocation fileLocation2 = a22.photo.photo_small;
                    fileLoader.getClass();
                    File K = w7.K(fileLocation2, null, true, true);
                    if (!K.exists()) {
                        if (a22.photo.photo_big != null) {
                            w7 fileLoader2 = getFileLoader();
                            TLRPC.FileLocation fileLocation3 = a22.photo.photo_big;
                            fileLoader2.getClass();
                            K = w7.K(fileLocation3, null, true, true);
                        } else {
                            K = null;
                        }
                        if (K != null && !K.exists()) {
                            K = null;
                        }
                    }
                    if (K != null) {
                        file = K;
                    }
                }
            } else {
                str = ctVar.f21897b;
                if (str == null) {
                }
            }
            if (str.length() > 50) {
                str = str.substring(0, 25) + "…";
            }
            arrayList.add(str);
            if (file == null && a22 != null) {
                arrayList2.add(a22);
            } else if (file != null) {
                arrayList2.add(file);
            }
        }
        if (z9) {
            arrayList2.clear();
        }
        return new Pair(Integer.valueOf(i7), Boolean.valueOf(z9));
    }

    public final void J(LongSparseIntArray longSparseIntArray) {
        f22051k0.c(new ws(this, longSparseIntArray, new ArrayList(), 0));
    }

    public final void K(ArrayList arrayList, boolean z9, boolean z10, CountDownLatch countDownLatch) {
        boolean z11;
        boolean z12;
        Object valueOf;
        if (r2.f25191a) {
            StringBuilder sb2 = new StringBuilder("NotificationsController: processNewMessages msgs.size()=");
            if (arrayList == null) {
                valueOf = "null";
            } else {
                valueOf = Integer.valueOf(arrayList.size());
            }
            sb2.append(valueOf);
            sb2.append(" isLast=");
            z11 = z9;
            sb2.append(z11);
            sb2.append(" isFcm=");
            z12 = z10;
            sb2.append(z12);
            sb2.append(")");
            a8.b(sb2.toString());
        } else {
            z11 = z9;
            z12 = z10;
        }
        if (arrayList != null) {
            int i7 = 0;
            while (i7 < arrayList.size()) {
                ij ijVar = (ij) arrayList.get(i7);
                if (ijVar != null && ijVar.f23237k != null && !ijVar.Q3()) {
                    TLRPC.MessageAction messageAction = ijVar.f23237k.action;
                    if (messageAction instanceof TLRPC.TL_messageActionConferenceCall) {
                        TLRPC.TL_messageActionConferenceCall tL_messageActionConferenceCall = (TLRPC.TL_messageActionConferenceCall) messageAction;
                        if (!tL_messageActionConferenceCall.active && !tL_messageActionConferenceCall.missed && getConnectionsManager().getCurrentTime() - ijVar.f23237k.date < getMessagesController().f24783h3 / 1000) {
                            HashSet hashSet = new HashSet();
                            hashSet.add(Long.valueOf(ij.B0(ijVar.f23237k)));
                            ArrayList<TLRPC.Peer> arrayList2 = tL_messageActionConferenceCall.other_participants;
                            int size = arrayList2.size();
                            int i10 = 0;
                            while (i10 < size) {
                                TLRPC.Peer peer = arrayList2.get(i10);
                                i10++;
                                hashSet.add(Long.valueOf(m5.o(peer)));
                            }
                            StringBuilder sb3 = new StringBuilder();
                            Iterator it = hashSet.iterator();
                            while (it.hasNext()) {
                                long longValue = ((Long) it.next()).longValue();
                                if (sb3.length() > 0) {
                                    sb3.append(", ");
                                }
                                sb3.append(m5.s(this.currentAccount, longValue));
                            }
                            VoIPGroupNotification.request(t0.f25555b, this.currentAccount, ij.B0(ijVar.f23237k), sb3.toString(), tL_messageActionConferenceCall.call_id, ijVar.f1(), tL_messageActionConferenceCall.video);
                            arrayList.remove(i7);
                            i7--;
                        } else {
                            VoIPGroupNotification.hide(t0.f25555b, this.currentAccount, ijVar.f1());
                        }
                    }
                }
                i7++;
            }
        }
        if (arrayList.isEmpty()) {
            if (countDownLatch != null) {
                countDownLatch.countDown();
                return;
            }
            return;
        }
        f22051k0.c(new nn(this, arrayList, new ArrayList(0), z12, z11, countDownLatch));
    }

    public final void L(LongSparseIntArray longSparseIntArray, long j3, int i7, int i10, boolean z9) {
        f22051k0.c(new pg(this, longSparseIntArray, new ArrayList(0), j3, i10, i7, z9));
    }

    public final void M(a0.h hVar, boolean z9) {
        f22051k0.c(new aa.d0(this, hVar, z9, new ArrayList(0), 22));
    }

    public final void N(long j3) {
        L(null, j3, 0, Integer.MAX_VALUE, false);
        LongSparseIntArray longSparseIntArray = new LongSparseIntArray();
        longSparseIntArray.put(j3, 0);
        J(longSparseIntArray);
    }

    public final String O(ij ijVar) {
        String str;
        TLRPC.Message message = ijVar.f23237k;
        if (message != null && (str = message.message) != null && message.entities != null) {
            StringBuilder sb2 = new StringBuilder(str);
            if (ijVar.I2) {
                return sb2.toString();
            }
            for (int i7 = 0; i7 < ijVar.f23237k.entities.size(); i7++) {
                if (ijVar.f23237k.entities.get(i7) instanceof TLRPC.TL_messageEntitySpoiler) {
                    TLRPC.TL_messageEntitySpoiler tL_messageEntitySpoiler = (TLRPC.TL_messageEntitySpoiler) ijVar.f23237k.entities.get(i7);
                    for (int i10 = 0; i10 < tL_messageEntitySpoiler.length; i10++) {
                        char[] cArr = this.f22070h0;
                        sb2.setCharAt(tL_messageEntitySpoiler.offset + i10, cArr[i10 % cArr.length]);
                    }
                }
            }
            return sb2.toString();
        }
        return null;
    }

    public final void P(e0.q qVar, long j3, long j10, String str, long[] jArr, int i7, Uri uri, int i10, boolean z9, boolean z10, boolean z11, int i11) {
        a8.b("resetNotificationSound");
        Uri uri2 = Settings.System.DEFAULT_RINGTONE_URI;
        if (uri2 != null && uri != null && !TextUtils.equals(uri2.toString(), uri.toString())) {
            SharedPreferences.Editor edit = getAccountInstance().c().edit();
            String uri3 = uri2.toString();
            String M0 = hd.M0(2131751600, null);
            if (z9) {
                if (i11 == 2) {
                    edit.putString("ChannelSound", M0);
                } else if (i11 == 0) {
                    edit.putString("GroupSound", M0);
                } else if (i11 == 1) {
                    edit.putString("GlobalSound", M0);
                } else if (i11 == 3) {
                    edit.putString("StoriesSound", M0);
                } else if (i11 == 4 || i11 == 5) {
                    edit.putString("ReactionSound", M0);
                }
                if (i11 == 2) {
                    edit.putString("ChannelSoundPath", uri3);
                } else if (i11 == 0) {
                    edit.putString("GroupSoundPath", uri3);
                } else if (i11 == 1) {
                    edit.putString("GlobalSoundPath", uri3);
                } else if (i11 == 3) {
                    edit.putString("StoriesSoundPath", uri3);
                } else if (i11 == 4 || i11 == 5) {
                    edit.putString("ReactionSound", uri3);
                }
                getNotificationsController().n(i11);
            } else {
                edit.putString("sound_" + v(j3, j10, false), M0);
                edit.putString("sound_path_" + v(j3, j10, false), uri3);
                o(j3, j10);
            }
            edit.commit();
            qVar.f10115y = e0(j3, j10, str, jArr, i7, uri2, i10, z9, z10, z11, i11);
            f22052l0.e(null, this.f22064d0, qVar.b());
        }
    }

    public final void Q(boolean z9) {
        int i7;
        rs rsVar = this.U;
        try {
            if (r2.f25191a) {
                a8.b("delay notification start, onlineReason = " + z9);
            }
            this.V.acquire(10000L);
            p5 p5Var = f22051k0;
            p5Var.a(rsVar);
            if (z9) {
                i7 = 3000;
            } else {
                i7 = 1000;
            }
            p5Var.d(rsVar, i7);
        } catch (Exception e10) {
            a8.g(e10, true);
            Z(this.K);
        }
    }

    public final void R() {
        try {
            Intent intent = new Intent(t0.f25555b, NotificationRepeat.class);
            intent.putExtra("currentAccount", this.currentAccount);
            PendingIntent service = PendingIntent.getService(t0.f25555b, 0, intent, 33554432);
            int i7 = getAccountInstance().c().getInt("repeat_messages", 60);
            if (i7 > 0 && this.J > 0) {
                this.f22063c0.set(2, SystemClock.elapsedRealtime() + (i7 * 60000), service);
            } else {
                this.f22063c0.cancel(service);
            }
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    public final void S(int i7) {
        if (this.N != i7) {
            a8.b("setBadge " + i7);
            this.N = i7;
            try {
                if (fs.f22441c == null && !fs.f22440b) {
                    fs.b();
                    fs.f22440b = true;
                }
                cs csVar = fs.f22441c;
                if (csVar != null) {
                    csVar.a(i7);
                }
            } catch (Throwable unused) {
            }
        }
    }

    public final void T(long j3, int i7, long j10) {
        SharedPreferences.Editor edit = getAccountInstance().c().edit();
        TLRPC.Dialog dialog = (TLRPC.Dialog) qp.s1(p10.f24459s0).Q.f(j3);
        if (i7 == 4) {
            if (D(j3, null, false, false)) {
                edit.remove("notify2_" + v(j3, j10, false));
            } else {
                edit.putInt("notify2_" + v(j3, j10, false), 0);
            }
            getMessagesStorage().E1(j3, 0L);
            if (dialog != null) {
                dialog.notify_settings = new TLRPC.TL_peerNotifySettings();
            }
        } else {
            int currentTime = ConnectionsManager.getInstance(p10.f24459s0).getCurrentTime();
            if (i7 == 0) {
                currentTime += 3600;
            } else if (i7 == 1) {
                currentTime += 28800;
            } else if (i7 == 2) {
                currentTime += 172800;
            } else if (i7 == 3) {
                currentTime = Integer.MAX_VALUE;
            }
            long j11 = 1;
            if (i7 == 3) {
                edit.putInt("notify2_" + v(j3, j10, false), 2);
            } else {
                edit.putInt("notify2_" + v(j3, j10, false), 3);
                edit.putInt("notifyuntil_" + v(j3, j10, false), currentTime);
                j11 = 1 | (((long) currentTime) << 32);
            }
            t(p10.f24459s0).N(j3);
            yr.a0(p10.f24459s0).E1(j3, j11);
            if (dialog != null) {
                TLRPC.TL_peerNotifySettings tL_peerNotifySettings = new TLRPC.TL_peerNotifySettings();
                dialog.notify_settings = tL_peerNotifySettings;
                tL_peerNotifySettings.mute_until = currentTime;
            }
        }
        edit.commit();
        c0(j3, j10, true);
    }

    public final void U(int i7, int i10) {
        getAccountInstance().c().edit().putInt(q(i7), i10).commit();
        b0(i7);
        yr messagesStorage = getMessagesStorage();
        messagesStorage.f26688a.c(new qq(messagesStorage, 25));
        m(i7);
    }

    public final void V(int i7) {
        f22051k0.c(new xs(this, i7, 7));
    }

    public final void X(e0.q r90, java.lang.String r91, long r92, long r94, java.lang.String r96, long[] r97, int r98, android.net.Uri r99, int r100, boolean r101, boolean r102, boolean r103, int r104) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.dt.X(e0.q, java.lang.String, long, long, java.lang.String, long[], int, android.net.Uri, int, boolean, boolean, boolean, int):void");
    }

    public final void Y() {
        f22051k0.c(new rs(this, 3));
    }

    public final void Z(boolean r54) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.dt.Z(boolean):void");
    }

    public final void a0(long j3, String str) {
        f22051k0.c(new hr(this, str, j3, 3));
    }

    public final void b0(int i7) {
        SharedPreferences c10 = getAccountInstance().c();
        if (i7 != 4 && i7 != 5) {
            TL_account.updateNotifySettings updatenotifysettings = new TL_account.updateNotifySettings();
            TLRPC.TL_inputPeerNotifySettings tL_inputPeerNotifySettings = new TLRPC.TL_inputPeerNotifySettings();
            updatenotifysettings.settings = tL_inputPeerNotifySettings;
            tL_inputPeerNotifySettings.flags = 5;
            if (i7 == 0) {
                updatenotifysettings.peer = new TLRPC.TL_inputNotifyChats();
                updatenotifysettings.settings.mute_until = c10.getInt("EnableGroup2", 0);
                updatenotifysettings.settings.show_previews = c10.getBoolean("EnablePreviewGroup", true);
                TLRPC.TL_inputPeerNotifySettings tL_inputPeerNotifySettings2 = updatenotifysettings.settings;
                tL_inputPeerNotifySettings2.flags |= 8;
                tL_inputPeerNotifySettings2.sound = s(c10, "GroupSound", "GroupSoundDocId", "GroupSoundPath");
            } else if (i7 != 1 && i7 != 3) {
                updatenotifysettings.peer = new TLRPC.TL_inputNotifyBroadcasts();
                updatenotifysettings.settings.mute_until = c10.getInt("EnableChannel2", 0);
                updatenotifysettings.settings.show_previews = c10.getBoolean("EnablePreviewChannel", true);
                TLRPC.TL_inputPeerNotifySettings tL_inputPeerNotifySettings3 = updatenotifysettings.settings;
                tL_inputPeerNotifySettings3.flags |= 8;
                tL_inputPeerNotifySettings3.sound = s(c10, "ChannelSound", "ChannelSoundDocId", "ChannelSoundPath");
            } else {
                updatenotifysettings.peer = new TLRPC.TL_inputNotifyUsers();
                updatenotifysettings.settings.mute_until = c10.getInt("EnableAll2", 0);
                updatenotifysettings.settings.show_previews = c10.getBoolean("EnablePreviewAll", true);
                TLRPC.TL_inputPeerNotifySettings tL_inputPeerNotifySettings4 = updatenotifysettings.settings;
                tL_inputPeerNotifySettings4.flags |= 128;
                tL_inputPeerNotifySettings4.stories_hide_sender = c10.getBoolean("EnableHideStoriesSenders", false);
                if (c10.contains("EnableAllStories")) {
                    TLRPC.TL_inputPeerNotifySettings tL_inputPeerNotifySettings5 = updatenotifysettings.settings;
                    tL_inputPeerNotifySettings5.flags |= 64;
                    tL_inputPeerNotifySettings5.stories_muted = !c10.getBoolean("EnableAllStories", true);
                }
                TLRPC.TL_inputPeerNotifySettings tL_inputPeerNotifySettings6 = updatenotifysettings.settings;
                tL_inputPeerNotifySettings6.flags |= 8;
                tL_inputPeerNotifySettings6.sound = s(c10, "GlobalSound", "GlobalSoundDocId", "GlobalSoundPath");
                TLRPC.TL_inputPeerNotifySettings tL_inputPeerNotifySettings7 = updatenotifysettings.settings;
                tL_inputPeerNotifySettings7.flags |= 256;
                tL_inputPeerNotifySettings7.stories_sound = s(c10, "StoriesSound", "StoriesSoundDocId", "StoriesSoundPath");
            }
            getConnectionsManager().sendRequest(updatenotifysettings, new di.u5(14));
            return;
        }
        TL_account.setReactionsNotifySettings setreactionsnotifysettings = new TL_account.setReactionsNotifySettings();
        setreactionsnotifysettings.settings = new TL_account.TL_reactionsNotifySettings();
        if (c10.getBoolean("EnableReactionsMessages", true)) {
            setreactionsnotifysettings.settings.flags |= 1;
            if (c10.getBoolean("EnableReactionsMessagesContacts", false)) {
                setreactionsnotifysettings.settings.messages_notify_from = new TL_account.TL_reactionNotificationsFromContacts();
            } else {
                setreactionsnotifysettings.settings.messages_notify_from = new TL_account.TL_reactionNotificationsFromAll();
            }
        }
        if (c10.getBoolean("EnableReactionsStories", true)) {
            setreactionsnotifysettings.settings.flags |= 2;
            if (c10.getBoolean("EnableReactionsStoriesContacts", false)) {
                setreactionsnotifysettings.settings.stories_notify_from = new TL_account.TL_reactionNotificationsFromContacts();
            } else {
                setreactionsnotifysettings.settings.stories_notify_from = new TL_account.TL_reactionNotificationsFromAll();
            }
        }
        setreactionsnotifysettings.settings.show_previews = c10.getBoolean("EnableReactionsPreview", true);
        setreactionsnotifysettings.settings.sound = s(c10, "ReactionSound", "ReactionSoundDocId", "ReactionSoundPath");
        getConnectionsManager().sendRequest(setreactionsnotifysettings, new di.u5(14));
    }

    public final void c0(long j3, long j10, boolean z9) {
        int i7;
        if (z9) {
            getNotificationCenter().k(qs.f24979f0, new Object[0]);
        }
        if (m5.C(j3)) {
            return;
        }
        SharedPreferences c10 = getAccountInstance().c();
        TL_account.updateNotifySettings updatenotifysettings = new TL_account.updateNotifySettings();
        updatenotifysettings.settings = new TLRPC.TL_inputPeerNotifySettings();
        String v = v(j3, j10, false);
        TLRPC.TL_inputPeerNotifySettings tL_inputPeerNotifySettings = updatenotifysettings.settings;
        tL_inputPeerNotifySettings.flags |= 1;
        tL_inputPeerNotifySettings.show_previews = c10.getBoolean("content_preview_" + v, true);
        TLRPC.TL_inputPeerNotifySettings tL_inputPeerNotifySettings2 = updatenotifysettings.settings;
        tL_inputPeerNotifySettings2.flags = tL_inputPeerNotifySettings2.flags | 2;
        tL_inputPeerNotifySettings2.silent = c10.getBoolean("silent_" + v, false);
        if (c10.contains("stories_" + v)) {
            TLRPC.TL_inputPeerNotifySettings tL_inputPeerNotifySettings3 = updatenotifysettings.settings;
            tL_inputPeerNotifySettings3.flags |= 64;
            tL_inputPeerNotifySettings3.stories_muted = !c10.getBoolean("stories_" + v, true);
        }
        int i10 = c10.getInt("notify2_" + v(j3, j10, false), -1);
        if (i10 != -1) {
            TLRPC.TL_inputPeerNotifySettings tL_inputPeerNotifySettings4 = updatenotifysettings.settings;
            tL_inputPeerNotifySettings4.flags |= 4;
            if (i10 == 3) {
                tL_inputPeerNotifySettings4.mute_until = c10.getInt("notifyuntil_" + v(j3, j10, false), 0);
            } else {
                if (i10 != 2) {
                    i7 = 0;
                } else {
                    i7 = Integer.MAX_VALUE;
                }
                tL_inputPeerNotifySettings4.mute_until = i7;
            }
        }
        long j11 = c10.getLong("sound_document_id_" + v(j3, j10, false), 0L);
        String string = c10.getString("sound_path_" + v(j3, j10, false), null);
        TLRPC.TL_inputPeerNotifySettings tL_inputPeerNotifySettings5 = updatenotifysettings.settings;
        tL_inputPeerNotifySettings5.flags = tL_inputPeerNotifySettings5.flags | 8;
        if (j11 != 0) {
            TLRPC.TL_notificationSoundRingtone tL_notificationSoundRingtone = new TLRPC.TL_notificationSoundRingtone();
            tL_notificationSoundRingtone.f27079id = j11;
            updatenotifysettings.settings.sound = tL_notificationSoundRingtone;
        } else if (string != null) {
            if (string.equalsIgnoreCase("NoSound")) {
                updatenotifysettings.settings.sound = new TLRPC.TL_notificationSoundNone();
            } else {
                TLRPC.TL_notificationSoundLocal tL_notificationSoundLocal = new TLRPC.TL_notificationSoundLocal();
                tL_notificationSoundLocal.title = c10.getString("sound_" + v(j3, j10, false), null);
                tL_notificationSoundLocal.data = string;
                updatenotifysettings.settings.sound = tL_notificationSoundLocal;
            }
        } else {
            tL_inputPeerNotifySettings5.sound = new TLRPC.TL_notificationSoundDefault();
        }
        if (j10 != 0 && j3 != getUserConfig().e()) {
            TLRPC.TL_inputNotifyForumTopic tL_inputNotifyForumTopic = new TLRPC.TL_inputNotifyForumTopic();
            tL_inputNotifyForumTopic.peer = getMessagesController().j1(j3);
            tL_inputNotifyForumTopic.top_msg_id = (int) j10;
            updatenotifysettings.peer = tL_inputNotifyForumTopic;
        } else {
            int i11 = this.currentAccount;
            if (j3 < 0 && t3.Y(qp.s1(i11).M0(Long.valueOf(-j3)))) {
                TLRPC.TL_inputNotifyCommunity tL_inputNotifyCommunity = new TLRPC.TL_inputNotifyCommunity();
                tL_inputNotifyCommunity.community = getMessagesController().h1(-j3);
                updatenotifysettings.peer = tL_inputNotifyCommunity;
            } else {
                TLRPC.TL_inputNotifyPeer tL_inputNotifyPeer = new TLRPC.TL_inputNotifyPeer();
                tL_inputNotifyPeer.peer = getMessagesController().j1(j3);
                updatenotifysettings.peer = tL_inputNotifyPeer;
            }
        }
        getConnectionsManager().sendRequest(updatenotifysettings, new di.u5(14));
    }

    public final void d0() {
        int i7 = 0;
        long j3 = Long.MAX_VALUE;
        while (true) {
            ArrayList arrayList = this.D;
            if (i7 >= arrayList.size()) {
                break;
            }
            for (Pair pair : ((ct) arrayList.get(i7)).f21898c.values()) {
                j3 = Math.min(j3, ((Long) pair.second).longValue());
            }
            i7++;
        }
        p5 p5Var = f22051k0;
        rs rsVar = this.f22071i0;
        p5Var.a(rsVar);
        long currentTimeMillis = j3 - System.currentTimeMillis();
        if (j3 != Long.MAX_VALUE) {
            p5Var.d(rsVar, Math.max(0L, currentTimeMillis));
        }
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == qs.Y1) {
            f22051k0.c(new yq(11, this, (String) objArr[0]));
        }
    }

    public final java.lang.String e0(long r46, long r48, java.lang.String r50, long[] r51, int r52, android.net.Uri r53, int r54, boolean r55, boolean r56, boolean r57, int r58) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.dt.e0(long, long, java.lang.String, long[], int, android.net.Uri, int, boolean, boolean, boolean, int):java.lang.String");
    }

    public final void h(ij ijVar) {
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.f22058a;
            if (i7 < arrayList.size()) {
                if (((ij) arrayList.get(i7)).f1() == ijVar.f1() && ij.B0(((ij) arrayList.get(i7)).f23237k) == ij.B0(ijVar.f23237k) && ((ij) arrayList.get(i7)).K == ijVar.K) {
                    return;
                }
                i7++;
            } else {
                arrayList.add(0, ijVar);
                return;
            }
        }
    }

    public final java.lang.String j(e0.q r18, long r19, java.lang.String r21, org.telegram.tgnet.TLRPC.User r22, org.telegram.tgnet.TLRPC.Chat r23, e0.j0 r24, boolean r25) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.dt.j(e0.q, long, java.lang.String, org.telegram.tgnet.TLRPC$User, org.telegram.tgnet.TLRPC$Chat, e0.j0, boolean):java.lang.String");
    }

    public final void l(long j3, long j10) {
        if (Build.VERSION.SDK_INT < 26) {
            return;
        }
        f22051k0.c(new ss(this, j3, j10, 1));
    }

    public final void m(int i7) {
        if (Build.VERSION.SDK_INT < 26) {
            return;
        }
        f22051k0.c(new xs(this, i7, 8));
    }

    public final void n(int i7) {
        String str;
        String str2;
        String str3;
        if (Build.VERSION.SDK_INT >= 26) {
            try {
                SharedPreferences c10 = getAccountInstance().c();
                SharedPreferences.Editor edit = c10.edit();
                if (i7 == 2) {
                    str = "channels";
                } else if (i7 == 0) {
                    str = "groups";
                } else if (i7 == 3) {
                    str = "stories";
                } else {
                    if (i7 != 4 && i7 != 5) {
                        str = "private";
                    }
                    str = "reactions";
                }
                String string = c10.getString(str, null);
                if (string != null) {
                    edit.remove(str).remove(str.concat("_s"));
                    try {
                        m0.deleteNotificationChannel(string);
                    } catch (Exception e10) {
                        a8.g(e10, true);
                    }
                    if (r2.f25191a) {
                        a8.b("delete channel global internal ".concat(string));
                    }
                }
                if (i7 == 2) {
                    str2 = "channels_ia";
                } else if (i7 == 0) {
                    str2 = "groups_ia";
                } else if (i7 == 3) {
                    str2 = "stories_ia";
                } else {
                    if (i7 != 4 && i7 != 5) {
                        str2 = "private_ia";
                    }
                    str2 = "reactions_ia";
                }
                String string2 = c10.getString(str2, null);
                if (string2 != null) {
                    edit.remove(str2).remove(str2.concat("_s"));
                    try {
                        m0.deleteNotificationChannel(string2);
                    } catch (Exception e11) {
                        a8.g(e11, true);
                    }
                    if (r2.f25191a) {
                        a8.b("delete channel global internal ".concat(string2));
                    }
                }
                if (i7 == 2) {
                    str3 = "overwrite_channel";
                } else if (i7 == 0) {
                    str3 = "overwrite_group";
                } else if (i7 == 3) {
                    str3 = "overwrite_stories";
                } else {
                    if (i7 != 4 && i7 != 5) {
                        str3 = "overwrite_private";
                    }
                    str3 = "overwrite_reactions";
                }
                edit.remove(str3);
                edit.commit();
            } catch (Exception e12) {
                a8.g(e12, true);
            }
        }
    }

    public final void o(long j3, long j10) {
        if (Build.VERSION.SDK_INT >= 26) {
            try {
                SharedPreferences c10 = getAccountInstance().c();
                SharedPreferences.Editor edit = c10.edit();
                String str = "org.telegram.key" + j3;
                if (j10 != 0) {
                    str = str + ".topic" + j10;
                }
                String string = c10.getString(str, null);
                if (string != null) {
                    edit.remove(str).remove(str + "_s");
                    try {
                        m0.deleteNotificationChannel(string);
                    } catch (Exception e10) {
                        a8.g(e10, true);
                    }
                    if (r2.f25191a) {
                        a8.b("delete channel internal ".concat(string));
                    }
                }
                String str2 = "org.telegram.keyia" + j3;
                String string2 = c10.getString(str2, null);
                if (string2 != null) {
                    edit.remove(str2).remove(str2 + "_s");
                    try {
                        m0.deleteNotificationChannel(string2);
                    } catch (Exception e11) {
                        a8.g(e11, true);
                    }
                    if (r2.f25191a) {
                        a8.b("delete channel internal ".concat(string2));
                    }
                }
                edit.commit();
            } catch (Exception e12) {
                a8.g(e12, true);
            }
        }
    }

    public final void p() {
        a0.h hVar = this.h;
        a8.b("NotificationsController dismissNotification");
        try {
            f22052l0.b(this.f22064d0, null);
            this.f22058a.clear();
            this.f22062c.b();
            this.f22072n.b();
            for (int i7 = 0; i7 < hVar.m(); i7++) {
                if (!this.f22077y.contains(Long.valueOf(hVar.j(i7)))) {
                    f22052l0.b(((Integer) hVar.n(i7)).intValue(), null);
                }
            }
            hVar.b();
            g0.h3(new pd(5));
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    public final int u(long j3, long j10) {
        int c10 = this.f22069g0.c(-1, j3, j10, "notify2_");
        if (c10 == 3 && this.f22069g0.c(0, j3, j10, "notifyuntil_") >= getConnectionsManager().getCurrentTime()) {
            return 2;
        }
        return c10;
    }

    public final java.lang.String w(org.telegram.messenger.ij r31, java.lang.String[] r32, boolean[] r33) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.dt.w(org.telegram.messenger.ij, java.lang.String[], boolean[]):java.lang.String");
    }

    public final java.lang.String x(org.telegram.messenger.ij r31, boolean[] r32) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.dt.x(org.telegram.messenger.ij, boolean[]):java.lang.String");
    }

    public final String y(TLRPC.Chat chat) {
        if (chat == null) {
            return null;
        }
        if (chat.monoforum) {
            return qg.d.i(this.currentAccount, chat, false);
        }
        return chat.title;
    }

    public final int z() {
        int i7 = 0;
        for (int i10 = 0; i10 < 4; i10++) {
            if (p10.i(i10).p() && (iz.Q0 || p10.f24459s0 == i10)) {
                dt t6 = t(i10);
                if (t6.R) {
                    if (t6.T) {
                        if (t6.S) {
                            try {
                                ArrayList arrayList = new ArrayList(qp.s1(i10).f24929y);
                                int size = arrayList.size();
                                for (int i11 = 0; i11 < size; i11++) {
                                    TLRPC.Dialog dialog = (TLRPC.Dialog) arrayList.get(i11);
                                    if (dialog != null && m5.z(dialog.f26956id)) {
                                        TLRPC.Chat M0 = getMessagesController().M0(Long.valueOf(-dialog.f26956id));
                                        if (!t3.r0(M0)) {
                                            if (t3.Y(M0)) {
                                            }
                                        }
                                    }
                                    if (dialog != null) {
                                        i7 += qp.s1(i10).V0(dialog);
                                    }
                                }
                            } catch (Exception e10) {
                                a8.g(e10, true);
                            }
                        } else {
                            i7 += t6.I;
                        }
                    } else if (t6.S) {
                        try {
                            int size2 = qp.s1(i10).f24929y.size();
                            for (int i12 = 0; i12 < size2; i12++) {
                                TLRPC.Dialog dialog2 = (TLRPC.Dialog) qp.s1(i10).f24929y.get(i12);
                                if (m5.z(dialog2.f26956id)) {
                                    TLRPC.Chat M02 = getMessagesController().M0(Long.valueOf(-dialog2.f26956id));
                                    if (!t3.r0(M02)) {
                                        if (t3.Y(M02)) {
                                        }
                                    }
                                }
                                if (qp.s1(i10).V0(dialog2) != 0) {
                                    i7++;
                                }
                            }
                        } catch (Exception e11) {
                            a8.g(e11, false);
                        }
                    } else {
                        i7 += t6.f22067f.m();
                    }
                }
            }
        }
        return i7;
    }
}
