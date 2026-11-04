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
public final class us extends c1 implements cs {
    public static String f25747k0;
    public static e0.j0 m0;
    public static NotificationManager f25749n0;
    public static AudioManager f25751p0;
    public static volatile us[] f25752q0;
    public static final Object[] f25753r0;
    public static final a0.h f25754s0;
    public final ArrayList E;
    public final a0.h F;
    public long G;
    public long H;
    public int I;
    public int J;
    public int K;
    public boolean L;
    public int M;
    public boolean N;
    public int O;
    public long P;
    public Boolean Q;
    public boolean R;
    public boolean S;
    public boolean T;
    public boolean U;
    public final is V;
    public final PowerManager.WakeLock W;
    public long X;
    public SoundPool Y;
    public int Z;
    public final ArrayList f25755a;
    public int f25756a0;
    public final ArrayList f25757b;
    public boolean f25758b0;
    public final a0.h f25759c;
    public boolean f25760c0;
    public final a0.h d;
    public final AlarmManager f25761d0;
    public final a0.h f25762e;
    public final int f25763e0;
    public final a0.h f25764f;
    public final String f25765f0;
    public final yh.f f25766g0;
    public final a0.h h;
    public final ws f25767h0;
    public final char[] f25768i0;
    public final is f25769j0;
    public final a0.h f25770n;
    public final a0.h f25771r;
    public final HashSet f25772s;
    public final ArrayList f25773w;
    public ArrayList f25774x;
    public final HashSet f25775y;
    public static final p5 f25748l0 = new p5("notificationsQueue");
    public static final long f25750o0 = m5.F(1);

    static {
        m0 = null;
        f25749n0 = null;
        if (Build.VERSION.SDK_INT >= 26 && t0.f25457b != null) {
            m0 = new e0.j0(t0.f25457b);
            f25749n0 = (NotificationManager) t0.f25457b.getSystemService("notification");
            i();
        }
        f25751p0 = (AudioManager) t0.f25457b.getSystemService("audio");
        f25752q0 = new us[4];
        f25753r0 = new Object[4];
        for (int i3 = 0; i3 < 4; i3++) {
            f25753r0[i3] = new Object();
        }
        f25754s0 = new a0.h();
    }

    public us(int i3) {
        super(i3);
        Object valueOf;
        this.f25755a = new ArrayList();
        this.f25757b = new ArrayList();
        this.f25759c = new a0.h();
        this.d = new a0.h();
        this.f25762e = new a0.h();
        this.f25764f = new a0.h();
        this.h = new a0.h();
        this.f25770n = new a0.h();
        this.f25771r = new a0.h();
        this.f25772s = new HashSet();
        this.f25773w = new ArrayList();
        this.f25774x = new ArrayList();
        this.f25775y = new HashSet();
        this.E = new ArrayList();
        this.F = new a0.h();
        this.G = 0L;
        this.H = 0L;
        this.I = 5000;
        this.J = 0;
        this.K = 0;
        this.L = false;
        this.M = 0;
        this.O = -1;
        this.f25766g0 = new yh.f();
        this.f25768i0 = new char[]{10252, 10338, 10385, 10280, 10277, 10286, 10321};
        this.f25769j0 = new is(this, 11);
        this.f25763e0 = this.currentAccount + 1;
        StringBuilder sb2 = new StringBuilder("messages");
        int i10 = this.currentAccount;
        if (i10 == 0) {
            valueOf = "";
        } else {
            valueOf = Integer.valueOf(i10);
        }
        sb2.append(valueOf);
        this.f25765f0 = sb2.toString();
        SharedPreferences c2 = getAccountInstance().c();
        this.N = c2.getBoolean("EnableInChatSound", true);
        this.S = c2.getBoolean("badgeNumber", true);
        this.T = c2.getBoolean("badgeNumberMuted", false);
        this.U = c2.getBoolean("badgeNumberMessages", true);
        m0 = new e0.j0(t0.f25457b);
        f25749n0 = (NotificationManager) t0.f25457b.getSystemService("notification");
        try {
            f25751p0 = (AudioManager) t0.f25457b.getSystemService("audio");
        } catch (Exception e10) {
            a8.g(e10, true);
        }
        try {
            this.f25761d0 = (AlarmManager) t0.f25457b.getSystemService("alarm");
        } catch (Exception e11) {
            a8.g(e11, true);
        }
        try {
            PowerManager.WakeLock newWakeLock = ((PowerManager) t0.f25457b.getSystemService("power")).newWakeLock(1, "telegram:notification_delay_lock");
            this.W = newWakeLock;
            newWakeLock.setReferenceCounted(false);
        } catch (Exception e12) {
            a8.g(e12, true);
        }
        this.V = new is(this, 12);
        this.f25767h0 = new ws(this.currentAccount);
        g0.h3(new is(this, 13));
    }

    public static boolean E(zi ziVar) {
        TLRPC.MessageAction messageAction;
        TLRPC.Message message = ziVar.f26868k;
        TLRPC.Peer peer = message.peer_id;
        if ((peer != null && peer.chat_id == 0 && peer.channel_id == 0 && ((messageAction = message.action) == null || (messageAction instanceof TLRPC.TL_messageActionEmpty))) || ziVar.J) {
            return true;
        }
        return false;
    }

    public static Bitmap F(ArrayList arrayList) {
        float f10;
        int i3;
        Bitmap bitmap;
        Paint paint;
        boolean z10;
        float f11;
        char c2;
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
        boolean z11 = true;
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
                i3 = L;
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
                i3 = L;
                bitmap = createBitmap;
                paint = paint3;
                z10 = z11;
                f11 = f10;
            }
            if (obj instanceof File) {
                String absolutePath = ((File) arrayList2.get(i10)).getAbsolutePath();
                BitmapFactory.Options options = new BitmapFactory.Options();
                z10 = true;
                try {
                    options.inJustDecodeBounds = true;
                    BitmapFactory.decodeFile(absolutePath, options);
                    int i11 = (int) f12;
                    options.inSampleSize = gi.f7.d(options, i11, i11);
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
                        c2 = 2;
                    }
                } catch (Throwable unused4) {
                    c2 = 2;
                    i10++;
                    z11 = z10;
                    L = i3;
                    createBitmap = bitmap;
                    f10 = f11;
                    paint3 = paint;
                    arrayList2 = arrayList;
                }
            } else if (obj instanceof TLRPC.User) {
                TLRPC.User user = (TLRPC.User) obj;
                c2 = 2;
                try {
                    paint2.setShader(new LinearGradient(size, size2, size, size2 + f12, new int[]{org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f28103p8[org.telegram.ui.Components.u8.e(user.f27150id)], false), org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f28123q8[org.telegram.ui.Components.u8.e(user.f27150id)], false)}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
                    canvas.drawCircle(f14, f15, f13, paint2);
                    if (textPaint == null) {
                        try {
                            z10 = true;
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
                                    z11 = z10;
                                    L = i3;
                                    createBitmap = bitmap;
                                    f10 = f11;
                                    paint3 = paint;
                                    arrayList2 = arrayList;
                                }
                            } catch (Throwable unused6) {
                            }
                        } catch (Throwable unused7) {
                            z10 = true;
                        }
                    } else {
                        z10 = true;
                    }
                    StringBuilder sb2 = new StringBuilder();
                    org.telegram.ui.Components.u8.a(user.first_name, user.last_name, null, sb2);
                    String sb3 = sb2.toString();
                    try {
                        textPaint.getTextBounds(sb3, 0, sb3.length(), rect);
                        canvas.drawText(sb3, (f14 - (rect.width() / 2.0f)) - rect.left, (f15 - (rect.height() / 2.0f)) - rect.top, textPaint);
                    } catch (Throwable unused8) {
                    }
                } catch (Throwable unused9) {
                }
                i10++;
                z11 = z10;
                L = i3;
                createBitmap = bitmap;
                f10 = f11;
                paint3 = paint;
                arrayList2 = arrayList;
            }
            c2 = 2;
            z10 = true;
            i10++;
            z11 = z10;
            L = i3;
            createBitmap = bitmap;
            f10 = f11;
            paint3 = paint;
            arrayList2 = arrayList;
        }
        return createBitmap;
    }

    public static void W(Notification notification, e0.q qVar, boolean z10) {
        if (z10) {
            qVar.f9299y = f25747k0;
        } else {
            qVar.f9299y = notification.getChannelId();
        }
    }

    public static void a(us usVar, String str, long j10) {
        boolean z10;
        String M0;
        if (usVar.getUserConfig().p()) {
            if (az.Q0 || usVar.currentAccount == h10.f22829t0) {
                try {
                    String str2 = "wallet_tonconnect_" + usVar.currentAccount;
                    if (Build.VERSION.SDK_INT >= 26) {
                        f25749n0.createNotificationChannel(new NotificationChannel(str2, "TON Connect", 3));
                    }
                    if (!g0.p2(false) && !az.C && usVar.getAccountInstance().c().getBoolean("EnablePreviewAll", true)) {
                        z10 = false;
                        if (!TextUtils.isEmpty(str) && !z10) {
                            M0 = bd.a0(null, null, 2131747933, str);
                            Intent intent = new Intent(t0.f25457b, LaunchActivity.class);
                            intent.setAction("android.intent.action.VIEW");
                            intent.setData(Uri.parse("tg://resolve?domain=sendgrams"));
                            intent.putExtra("currentAccount", usVar.currentAccount);
                            intent.addFlags(67108864);
                            PendingIntent activity = PendingIntent.getActivity(t0.f25457b, usVar.currentAccount, intent, 201326592);
                            e0.q qVar = new e0.q(t0.f25457b, str2);
                            qVar.F.icon = 2131232452;
                            qVar.f9281e = e0.q.d(bd.M0(2131689472, null));
                            qVar.f9282f = e0.q.d(M0);
                            e0.l lVar = new e0.l(false);
                            lVar.f9270f = e0.q.d(M0);
                            qVar.n(lVar);
                            qVar.f9296u = "event";
                            qVar.f9298x = 0;
                            qVar.F.when = j10;
                            qVar.h(16, true);
                            qVar.f9283g = activity;
                            m0.e("wallet_tonconnect", usVar.currentAccount, qVar.b());
                        }
                        M0 = bd.M0(2131747934, null);
                        Intent intent2 = new Intent(t0.f25457b, LaunchActivity.class);
                        intent2.setAction("android.intent.action.VIEW");
                        intent2.setData(Uri.parse("tg://resolve?domain=sendgrams"));
                        intent2.putExtra("currentAccount", usVar.currentAccount);
                        intent2.addFlags(67108864);
                        PendingIntent activity2 = PendingIntent.getActivity(t0.f25457b, usVar.currentAccount, intent2, 201326592);
                        e0.q qVar2 = new e0.q(t0.f25457b, str2);
                        qVar2.F.icon = 2131232452;
                        qVar2.f9281e = e0.q.d(bd.M0(2131689472, null));
                        qVar2.f9282f = e0.q.d(M0);
                        e0.l lVar2 = new e0.l(false);
                        lVar2.f9270f = e0.q.d(M0);
                        qVar2.n(lVar2);
                        qVar2.f9296u = "event";
                        qVar2.f9298x = 0;
                        qVar2.F.when = j10;
                        qVar2.h(16, true);
                        qVar2.f9283g = activity2;
                        m0.e("wallet_tonconnect", usVar.currentAccount, qVar2.b());
                    }
                    z10 = true;
                    if (!TextUtils.isEmpty(str)) {
                        M0 = bd.a0(null, null, 2131747933, str);
                        Intent intent22 = new Intent(t0.f25457b, LaunchActivity.class);
                        intent22.setAction("android.intent.action.VIEW");
                        intent22.setData(Uri.parse("tg://resolve?domain=sendgrams"));
                        intent22.putExtra("currentAccount", usVar.currentAccount);
                        intent22.addFlags(67108864);
                        PendingIntent activity22 = PendingIntent.getActivity(t0.f25457b, usVar.currentAccount, intent22, 201326592);
                        e0.q qVar22 = new e0.q(t0.f25457b, str2);
                        qVar22.F.icon = 2131232452;
                        qVar22.f9281e = e0.q.d(bd.M0(2131689472, null));
                        qVar22.f9282f = e0.q.d(M0);
                        e0.l lVar22 = new e0.l(false);
                        lVar22.f9270f = e0.q.d(M0);
                        qVar22.n(lVar22);
                        qVar22.f9296u = "event";
                        qVar22.f9298x = 0;
                        qVar22.F.when = j10;
                        qVar22.h(16, true);
                        qVar22.f9283g = activity22;
                        m0.e("wallet_tonconnect", usVar.currentAccount, qVar22.b());
                    }
                    M0 = bd.M0(2131747934, null);
                    Intent intent222 = new Intent(t0.f25457b, LaunchActivity.class);
                    intent222.setAction("android.intent.action.VIEW");
                    intent222.setData(Uri.parse("tg://resolve?domain=sendgrams"));
                    intent222.putExtra("currentAccount", usVar.currentAccount);
                    intent222.addFlags(67108864);
                    PendingIntent activity222 = PendingIntent.getActivity(t0.f25457b, usVar.currentAccount, intent222, 201326592);
                    e0.q qVar222 = new e0.q(t0.f25457b, str2);
                    qVar222.F.icon = 2131232452;
                    qVar222.f9281e = e0.q.d(bd.M0(2131689472, null));
                    qVar222.f9282f = e0.q.d(M0);
                    e0.l lVar222 = new e0.l(false);
                    lVar222.f9270f = e0.q.d(M0);
                    qVar222.n(lVar222);
                    qVar222.f9296u = "event";
                    qVar222.f9298x = 0;
                    qVar222.F.when = j10;
                    qVar222.h(16, true);
                    qVar222.f9283g = activity222;
                    m0.e("wallet_tonconnect", usVar.currentAccount, qVar222.b());
                } catch (Exception e10) {
                    a8.g(e10, true);
                }
            }
        }
    }

    public static void b(us usVar) {
        try {
            SharedPreferences c2 = usVar.getAccountInstance().c();
            Map<String, ?> all = c2.getAll();
            SharedPreferences.Editor edit = c2.edit();
            for (Map.Entry<String, ?> entry : all.entrySet()) {
                String key = entry.getKey();
                if (key.startsWith("org.telegram.key")) {
                    if (!key.endsWith("_s")) {
                        String str = (String) entry.getValue();
                        f25749n0.deleteNotificationChannel(str);
                        if (r2.f25040a) {
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

    public static void c(us usVar) {
        PowerManager.WakeLock wakeLock = usVar.W;
        m0.b(usVar.currentAccount, "wallet_tonconnect");
        usVar.G = 0L;
        usVar.H = 0L;
        usVar.J = 0;
        usVar.K = 0;
        usVar.f25755a.clear();
        usVar.f25759c.b();
        usVar.d.b();
        usVar.f25764f.b();
        usVar.h.b();
        usVar.f25770n.b();
        usVar.f25775y.clear();
        usVar.f25757b.clear();
        usVar.L = false;
        usVar.O = 0;
        try {
            if (wakeLock.isHeld()) {
                wakeLock.release();
            }
        } catch (Exception e10) {
            a8.g(e10, true);
        }
        usVar.p();
        usVar.S(usVar.z());
        SharedPreferences.Editor edit = usVar.getAccountInstance().c().edit();
        edit.clear();
        edit.commit();
        if (Build.VERSION.SDK_INT >= 26) {
            try {
                f25749n0.deleteNotificationChannelGroup("channels" + usVar.currentAccount);
                f25749n0.deleteNotificationChannelGroup("groups" + usVar.currentAccount);
                f25749n0.deleteNotificationChannelGroup("private" + usVar.currentAccount);
                f25749n0.deleteNotificationChannelGroup("stories" + usVar.currentAccount);
                f25749n0.deleteNotificationChannelGroup("other" + usVar.currentAccount);
                String str = usVar.currentAccount + "channel";
                List<NotificationChannel> notificationChannels = f25749n0.getNotificationChannels();
                int size = notificationChannels.size();
                for (int i3 = 0; i3 < size; i3++) {
                    String id2 = notificationChannels.get(i3).getId();
                    if (id2.startsWith(str)) {
                        try {
                            f25749n0.deleteNotificationChannel(id2);
                        } catch (Exception e11) {
                            a8.g(e11, true);
                        }
                        if (r2.f25040a) {
                            a8.b("delete channel cleanup " + id2);
                        }
                    }
                }
            } catch (Throwable th2) {
                a8.g(th2, true);
            }
        }
    }

    public static void e(org.telegram.messenger.us r44, java.util.ArrayList r45, java.util.ArrayList r46, boolean r47, boolean r48, java.util.concurrent.CountDownLatch r49) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.us.e(org.telegram.messenger.us, java.util.ArrayList, java.util.ArrayList, boolean, boolean, java.util.concurrent.CountDownLatch):void");
    }

    public static void f(us usVar, ArrayList arrayList, a0.h hVar, ArrayList arrayList2, Collection collection) {
        long j10;
        long j11;
        boolean z10;
        int i3;
        int i10;
        int i11;
        int intValue;
        long j12;
        boolean z11;
        int i12;
        TLRPC.MessageFwdHeader messageFwdHeader;
        long j13;
        long j14;
        TLRPC.Message message;
        long j15;
        TLRPC.Message message2;
        SparseArray sparseArray;
        zi ziVar;
        long j16;
        boolean z12;
        boolean z13;
        SparseArray sparseArray2;
        int intValue2;
        usVar.f25764f.b();
        usVar.f25755a.clear();
        usVar.f25759c.b();
        usVar.E.clear();
        usVar.F.b();
        boolean z14 = false;
        usVar.J = 0;
        usVar.K = 0;
        usVar.getAccountInstance().c();
        a0.h hVar2 = new a0.h();
        for (int i13 = 0; i13 < arrayList.size(); i13++) {
            TLRPC.Message message3 = (TLRPC.Message) arrayList.get(i13);
            if (message3 != null && ((messageFwdHeader = message3.fwd_from) == null || !messageFwdHeader.imported)) {
                TLRPC.MessageAction messageAction = message3.action;
                if (!(messageAction instanceof TLRPC.TL_messageActionSetMessagesTTL) && (!message3.silent || (!(messageAction instanceof TLRPC.TL_messageActionContactSignUp) && !(messageAction instanceof TLRPC.TL_messageActionUserJoined)))) {
                    long j17 = message3.peer_id.channel_id;
                    if (j17 != 0) {
                        j13 = -j17;
                    } else {
                        j13 = 0;
                    }
                    SparseArray sparseArray3 = (SparseArray) usVar.f25759c.f(j13);
                    if (sparseArray3 == null || sparseArray3.indexOfKey(message3.f27022id) < 0) {
                        zi ziVar2 = new zi(usVar.currentAccount, message3, false, false);
                        if (E(ziVar2)) {
                            usVar.K++;
                        }
                        long B0 = zi.B0(ziVar2.f26868k);
                        long c2 = zi.c2(usVar.currentAccount, ziVar2.f26868k, usVar.getMessagesController().u2(ziVar2), false);
                        if (ziVar2.f26868k.mentioned) {
                            message = message3;
                            j15 = ziVar2.Z0();
                            j14 = j13;
                        } else {
                            j14 = j13;
                            message = message3;
                            j15 = B0;
                        }
                        int h = hVar2.h(j15);
                        if (h >= 0 && c2 == 0) {
                            z13 = ((Boolean) hVar2.n(h)).booleanValue();
                            message2 = message;
                            sparseArray = sparseArray3;
                            ziVar = ziVar2;
                            j16 = j14;
                        } else {
                            int u10 = usVar.u(j15, c2);
                            if (u10 == -1) {
                                message2 = message;
                                sparseArray = sparseArray3;
                                j16 = j14;
                                z13 = usVar.D(j15, null, ziVar2.I, ziVar2.J);
                                ziVar = ziVar2;
                            } else {
                                message2 = message;
                                sparseArray = sparseArray3;
                                ziVar = ziVar2;
                                j16 = j14;
                                if (u10 != 2) {
                                    z12 = true;
                                } else {
                                    z12 = false;
                                }
                                z13 = z12;
                            }
                            hVar2.k(Boolean.valueOf(z13), j15);
                        }
                        if (z13 && (j15 != usVar.G || !t0.f25464w)) {
                            if (sparseArray == null) {
                                sparseArray2 = new SparseArray();
                                usVar.f25759c.k(sparseArray2, j16);
                            } else {
                                sparseArray2 = sparseArray;
                            }
                            sparseArray2.put(message2.f27022id, ziVar);
                            usVar.h(ziVar);
                            if (B0 != j15) {
                                Integer num = (Integer) usVar.f25771r.f(B0);
                                a0.h hVar3 = usVar.f25771r;
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
        long j18 = 0;
        int i14 = 0;
        while (i14 < hVar.m()) {
            long j19 = hVar.j(i14);
            int h7 = hVar2.h(j19);
            if (h7 >= 0) {
                z11 = ((Boolean) hVar2.n(h7)).booleanValue();
            } else {
                int u11 = usVar.u(j19, j18);
                if (u11 == -1) {
                    z11 = usVar.D(j19, null, false, false);
                } else if (u11 != 2) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                hVar2.k(Boolean.valueOf(z11), j19);
            }
            if (z11) {
                Integer num2 = (Integer) hVar.n(i14);
                int intValue3 = num2.intValue();
                usVar.f25764f.k(num2, j19);
                if (!usVar.getMessagesController().p2(j19)) {
                    if (usVar.getMessagesController().t2(j19)) {
                        int i15 = usVar.J;
                        if (intValue3 > 0) {
                            i12 = 1;
                        } else {
                            i12 = 0;
                        }
                        usVar.J = i15 + i12;
                    } else {
                        usVar.J += intValue3;
                    }
                }
            }
            i14++;
            j18 = 0;
        }
        for (int i16 = 0; i16 < arrayList2.size(); i16++) {
            zi ziVar3 = (zi) arrayList2.get(i16);
            int f12 = ziVar3.f1();
            if (usVar.f25759c.h(f12) < 0) {
                if (E(ziVar3)) {
                    usVar.K++;
                }
                long B02 = zi.B0(ziVar3.f26868k);
                long c22 = zi.c2(usVar.currentAccount, ziVar3.f26868k, usVar.getMessagesController().u2(ziVar3), false);
                TLRPC.Message message4 = ziVar3.f26868k;
                long j20 = message4.random_id;
                if (message4.mentioned) {
                    j10 = ziVar3.Z0();
                } else {
                    j10 = B02;
                }
                int h10 = hVar2.h(j10);
                if (h10 >= 0 && c22 == 0) {
                    long j21 = j10;
                    z10 = ((Boolean) hVar2.n(h10)).booleanValue();
                    j11 = j21;
                } else {
                    int u12 = usVar.u(j10, c22);
                    if (u12 == -1) {
                        j11 = j10;
                        z10 = usVar.D(j11, null, ziVar3.I, ziVar3.J);
                    } else {
                        j11 = j10;
                        if (u12 != 2) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                    }
                    hVar2.k(Boolean.valueOf(z10), j11);
                }
                if (z10 && (j11 != usVar.G || !t0.f25464w)) {
                    if (f12 != 0) {
                        if (ziVar3.J) {
                            j12 = zi.B0(ziVar3.f26868k);
                        } else {
                            long j22 = ziVar3.f26868k.peer_id.channel_id;
                            if (j22 != 0) {
                                j12 = -j22;
                            } else {
                                j12 = 0;
                            }
                        }
                        SparseArray sparseArray4 = (SparseArray) usVar.f25759c.f(j12);
                        if (sparseArray4 == null) {
                            sparseArray4 = new SparseArray();
                            usVar.f25759c.k(sparseArray4, j12);
                        }
                        sparseArray4.put(f12, ziVar3);
                    } else if (j20 != 0) {
                        usVar.d.k(ziVar3, j20);
                    }
                    usVar.h(ziVar3);
                    if (B02 != j11) {
                        Integer num3 = (Integer) usVar.f25771r.f(B02);
                        a0.h hVar4 = usVar.f25771r;
                        if (num3 == null) {
                            intValue = 1;
                        } else {
                            intValue = num3.intValue() + 1;
                        }
                        hVar4.k(Integer.valueOf(intValue), B02);
                    }
                    Integer num4 = (Integer) usVar.f25764f.f(j11);
                    if (num4 != null) {
                        i3 = num4.intValue() + 1;
                    } else {
                        i3 = 1;
                    }
                    if (!usVar.getMessagesController().p2(j11)) {
                        if (usVar.getMessagesController().t2(j11)) {
                            if (num4 != null) {
                                int i17 = usVar.J;
                                if (num4.intValue() > 0) {
                                    i11 = 1;
                                } else {
                                    i11 = 0;
                                }
                                usVar.J = i17 - i11;
                            }
                            int i18 = usVar.J;
                            if (i3 > 0) {
                                i10 = 1;
                            } else {
                                i10 = 0;
                            }
                            usVar.J = i18 + i10;
                        } else {
                            if (num4 != null) {
                                usVar.J -= num4.intValue();
                            }
                            usVar.J += i3;
                        }
                    }
                    usVar.f25764f.k(Integer.valueOf(i3), j11);
                }
            }
        }
        if (collection != null) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                ts tsVar = (ts) it.next();
                long j23 = tsVar.f25587a;
                ts tsVar2 = (ts) usVar.F.f(j23);
                if (tsVar2 != null) {
                    tsVar2.f25589c.putAll(tsVar.f25589c);
                } else {
                    usVar.E.add(tsVar);
                    usVar.F.k(tsVar, j23);
                }
            }
            Collections.sort(usVar.E, Comparator$CC.comparingLong(new ik(2)));
        }
        g0.h3(new os(usVar, usVar.f25764f.m(), 4));
        if (SystemClock.elapsedRealtime() / 1000 < 60) {
            z14 = true;
        }
        usVar.Z(z14);
        if (usVar.S) {
            usVar.S(usVar.z());
        }
    }

    public static int g(java.util.ArrayList r3, org.telegram.messenger.zi r4, long r5, boolean r7, android.content.SharedPreferences r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.us.g(java.util.ArrayList, org.telegram.messenger.zi, long, boolean, android.content.SharedPreferences):int");
    }

    public static void i() {
        SharedPreferences sharedPreferences;
        if (Build.VERSION.SDK_INT >= 26) {
            if (f25747k0 == null) {
                sharedPreferences = t0.f25457b.getSharedPreferences("Notifications", 0);
                f25747k0 = sharedPreferences.getString("OtherKey", "Other3");
            } else {
                sharedPreferences = null;
            }
            NotificationChannel notificationChannel = f25749n0.getNotificationChannel(f25747k0);
            if (notificationChannel != null && notificationChannel.getImportance() == 0) {
                try {
                    f25749n0.deleteNotificationChannel(f25747k0);
                } catch (Exception e10) {
                    a8.g(e10, true);
                }
                f25747k0 = null;
                notificationChannel = null;
            }
            if (f25747k0 == null) {
                if (sharedPreferences == null) {
                    sharedPreferences = t0.f25457b.getSharedPreferences("Notifications", 0);
                }
                f25747k0 = "Other" + Utilities.f21385b.nextLong();
                sharedPreferences.edit().putString("OtherKey", f25747k0).commit();
            }
            String M0 = bd.M0(2131749197, null);
            if (notificationChannel != null && !TextUtils.equals(notificationChannel.getName(), M0)) {
                notificationChannel.setName(M0);
                try {
                    f25749n0.createNotificationChannel(notificationChannel);
                } catch (Exception e11) {
                    a8.g(e11, true);
                }
            }
            if (notificationChannel == null) {
                NotificationChannel notificationChannel2 = new NotificationChannel(f25747k0, M0, 3);
                notificationChannel2.enableLights(false);
                notificationChannel2.enableVibration(false);
                notificationChannel2.setSound(null, null);
                try {
                    f25749n0.createNotificationChannel(notificationChannel2);
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

    public static String q(int i3) {
        if (i3 == 0) {
            return "EnableGroup2";
        }
        if (i3 == 1) {
            return "EnableAll2";
        }
        return "EnableChannel2";
    }

    public static String r(zi ziVar, String str) {
        boolean z10;
        int i3;
        TLRPC.Message message = ziVar.f26868k;
        TLRPC.TL_messageActionGramTransfer tL_messageActionGramTransfer = (TLRPC.TL_messageActionGramTransfer) message.action;
        boolean A = l10.A(zi.B0(message));
        if (!tL_messageActionGramTransfer.comment_encrypted && !TextUtils.isEmpty(tL_messageActionGramTransfer.comment)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (A) {
            if (z10) {
                i3 = 2131748043;
            } else {
                i3 = 2131748044;
            }
        } else if (z10) {
            i3 = 2131748045;
        } else {
            i3 = 2131748046;
        }
        return bd.a0(null, null, i3, str, org.telegram.ui.Wallet.k0.s(tL_messageActionGramTransfer.amount, false), tL_messageActionGramTransfer.comment);
    }

    public static TLRPC.NotificationSound s(SharedPreferences sharedPreferences, String str, String str2, String str3) {
        long j10 = sharedPreferences.getLong(str2, 0L);
        String string = sharedPreferences.getString(str3, "NoSound");
        if (j10 != 0) {
            TLRPC.TL_notificationSoundRingtone tL_notificationSoundRingtone = new TLRPC.TL_notificationSoundRingtone();
            tL_notificationSoundRingtone.f27128id = j10;
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

    public static us t(int i3) {
        us usVar;
        us usVar2 = f25752q0[i3];
        if (usVar2 == null) {
            synchronized (f25753r0[i3]) {
                try {
                    usVar = f25752q0[i3];
                    if (usVar == null) {
                        us[] usVarArr = f25752q0;
                        us usVar3 = new us(i3);
                        usVarArr[i3] = usVar3;
                        usVar = usVar3;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return usVar;
        }
        return usVar2;
    }

    public static String v(long j10, long j11, boolean z10) {
        String valueOf;
        if (z10) {
            if (j11 != 0) {
                Locale locale = Locale.US;
                return j10 + "_" + j11;
            }
            return String.valueOf(j10);
        }
        long j12 = (j11 << 12) + j10;
        a0.h hVar = f25754s0;
        int h = hVar.h(j12);
        if (h >= 0) {
            return (String) hVar.n(h);
        }
        if (j11 != 0) {
            Locale locale2 = Locale.US;
            valueOf = j10 + "_" + j11;
        } else {
            valueOf = String.valueOf(j10);
        }
        hVar.k(valueOf, j12);
        return valueOf;
    }

    public final boolean A() {
        int i3 = 0;
        while (true) {
            ArrayList arrayList = this.f25755a;
            if (i3 >= arrayList.size()) {
                return false;
            }
            zi ziVar = (zi) arrayList.get(i3);
            long B0 = zi.B0(ziVar.f26868k);
            if (!ziVar.I) {
                TLRPC.Message message = ziVar.f26868k;
                if ((!message.mentioned || !(message.action instanceof TLRPC.TL_messageActionPinMessage)) && !m5.C(B0) && ((ziVar.f26868k.peer_id.channel_id == 0 || ziVar.B4()) && B0 != 489000 && B0 != 489001)) {
                    return true;
                }
            }
            i3++;
        }
    }

    public final boolean B(int i3) {
        if (i3 == 4) {
            return getAccountInstance().c().getBoolean("EnableReactionsMessages", true);
        }
        if (i3 == 5) {
            return getAccountInstance().c().getBoolean("EnableReactionsStories", true);
        }
        if (i3 == 3) {
            return getAccountInstance().c().getBoolean("EnableAllStories", true);
        }
        if (getAccountInstance().c().getInt(q(i3), 0) < getConnectionsManager().getCurrentTime()) {
            return true;
        }
        return false;
    }

    public final boolean C(long j10) {
        return D(j10, null, false, false);
    }

    public final boolean D(long r1, java.lang.Boolean r3, boolean r4, boolean r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.us.D(long, java.lang.Boolean, boolean, boolean):boolean");
    }

    public final void G(long j10, long j11, boolean z10) {
        boolean z11;
        if (z10) {
            t(this.currentAccount).H(j10, Integer.MAX_VALUE, j11);
            return;
        }
        boolean D = t(this.currentAccount).D(j10, null, false, false);
        int i3 = (j11 > 0L ? 1 : (j11 == 0L ? 0 : -1));
        if (i3 != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        SharedPreferences.Editor edit = hp.s1(this.currentAccount).f22989d7.edit();
        if (D && !z11) {
            edit.remove("notify2_" + v(j10, j11, false));
        } else {
            edit.putInt("notify2_" + v(j10, j11, false), 0);
        }
        if (i3 == 0) {
            getMessagesStorage().E1(j10, 0L);
            TLRPC.Dialog dialog = (TLRPC.Dialog) getMessagesController().R.f(j10);
            if (dialog != null) {
                dialog.notify_settings = new TLRPC.TL_peerNotifySettings();
            }
        }
        edit.apply();
        c0(j10, j11, true);
    }

    public final void H(long j10, int i3, long j11) {
        boolean z10;
        long j12 = 0;
        if (j10 != 0) {
            SharedPreferences.Editor edit = hp.s1(this.currentAccount).f22989d7.edit();
            int i10 = (j11 > 0L ? 1 : (j11 == 0L ? 0 : -1));
            if (i10 != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            boolean D = t(this.currentAccount).D(j10, null, false, false);
            String v = v(j10, j11, false);
            if (i3 == Integer.MAX_VALUE) {
                if (!D && !z10) {
                    edit.remove("notify2_" + v);
                } else {
                    edit.putInt("notify2_" + v, 2);
                    j12 = 1L;
                }
            } else {
                edit.putInt("notify2_" + v, 3);
                edit.putInt("notifyuntil_" + v, getConnectionsManager().getCurrentTime() + i3);
                j12 = (((long) i3) << 32) | 1;
            }
            edit.apply();
            if (i10 == 0) {
                t(this.currentAccount).N(j10);
                qr.a0(this.currentAccount).E1(j10, j12);
                TLRPC.Dialog dialog = (TLRPC.Dialog) hp.s1(this.currentAccount).R.f(j10);
                if (dialog != null) {
                    TLRPC.TL_peerNotifySettings tL_peerNotifySettings = new TLRPC.TL_peerNotifySettings();
                    dialog.notify_settings = tL_peerNotifySettings;
                    if (i3 != Integer.MAX_VALUE || D) {
                        tL_peerNotifySettings.mute_until = i3;
                    }
                }
            }
            t(this.currentAccount).c0(j10, j11, true);
        }
    }

    public final Pair I(ArrayList arrayList, ArrayList arrayList2) {
        String str;
        TLRPC.FileLocation fileLocation;
        ArrayList arrayList3 = this.E;
        int min = Math.min(3, arrayList3.size());
        boolean z10 = false;
        int i3 = 0;
        for (int i10 = 0; i10 < min; i10++) {
            ts tsVar = (ts) arrayList3.get(i10);
            HashMap hashMap = tsVar.f25589c;
            long j10 = tsVar.f25587a;
            i3 += hashMap.size();
            z10 |= tsVar.d;
            TLRPC.User a22 = getMessagesController().a2(Long.valueOf(j10));
            if (a22 == null && (a22 = getMessagesStorage().k0(j10)) != null) {
                getMessagesController().X3(a22, true, false);
            }
            File file = null;
            if (a22 != null) {
                str = l10.p(a22);
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
                str = tsVar.f25588b;
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
        if (z10) {
            arrayList2.clear();
        }
        return new Pair(Integer.valueOf(i3), Boolean.valueOf(z10));
    }

    public final void J(LongSparseIntArray longSparseIntArray) {
        f25748l0.c(new ns(this, longSparseIntArray, new ArrayList(), 0));
    }

    public final void K(ArrayList arrayList, boolean z10, boolean z11, CountDownLatch countDownLatch) {
        boolean z12;
        boolean z13;
        Object valueOf;
        if (r2.f25040a) {
            StringBuilder sb2 = new StringBuilder("NotificationsController: processNewMessages msgs.size()=");
            if (arrayList == null) {
                valueOf = "null";
            } else {
                valueOf = Integer.valueOf(arrayList.size());
            }
            sb2.append(valueOf);
            sb2.append(" isLast=");
            z12 = z10;
            sb2.append(z12);
            sb2.append(" isFcm=");
            z13 = z11;
            sb2.append(z13);
            sb2.append(")");
            a8.b(sb2.toString());
        } else {
            z12 = z10;
            z13 = z11;
        }
        if (arrayList != null) {
            int i3 = 0;
            while (i3 < arrayList.size()) {
                zi ziVar = (zi) arrayList.get(i3);
                if (ziVar != null && ziVar.f26868k != null && !ziVar.Q3()) {
                    TLRPC.MessageAction messageAction = ziVar.f26868k.action;
                    if (messageAction instanceof TLRPC.TL_messageActionConferenceCall) {
                        TLRPC.TL_messageActionConferenceCall tL_messageActionConferenceCall = (TLRPC.TL_messageActionConferenceCall) messageAction;
                        if (!tL_messageActionConferenceCall.active && !tL_messageActionConferenceCall.missed && getConnectionsManager().getCurrentTime() - ziVar.f26868k.date < getMessagesController().i3 / 1000) {
                            HashSet hashSet = new HashSet();
                            hashSet.add(Long.valueOf(zi.B0(ziVar.f26868k)));
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
                            VoIPGroupNotification.request(t0.f25457b, this.currentAccount, zi.B0(ziVar.f26868k), sb3.toString(), tL_messageActionConferenceCall.call_id, ziVar.f1(), tL_messageActionConferenceCall.video);
                            arrayList.remove(i3);
                            i3--;
                        } else {
                            VoIPGroupNotification.hide(t0.f25457b, this.currentAccount, ziVar.f1());
                        }
                    }
                }
                i3++;
            }
        }
        if (arrayList.isEmpty()) {
            if (countDownLatch != null) {
                countDownLatch.countDown();
                return;
            }
            return;
        }
        f25748l0.c(new dn(this, arrayList, new ArrayList(0), z13, z12, countDownLatch));
    }

    public final void L(LongSparseIntArray longSparseIntArray, long j10, int i3, int i10, boolean z10) {
        f25748l0.c(new hg(this, longSparseIntArray, new ArrayList(0), j10, i10, i3, z10));
    }

    public final void M(a0.h hVar, boolean z10) {
        f25748l0.c(new ci.u8(this, hVar, z10, new ArrayList(0), 22));
    }

    public final void N(long j10) {
        L(null, j10, 0, Integer.MAX_VALUE, false);
        LongSparseIntArray longSparseIntArray = new LongSparseIntArray();
        longSparseIntArray.put(j10, 0);
        J(longSparseIntArray);
    }

    public final String O(zi ziVar) {
        String str;
        TLRPC.Message message = ziVar.f26868k;
        if (message != null && (str = message.message) != null && message.entities != null) {
            StringBuilder sb2 = new StringBuilder(str);
            if (ziVar.I2) {
                return sb2.toString();
            }
            for (int i3 = 0; i3 < ziVar.f26868k.entities.size(); i3++) {
                if (ziVar.f26868k.entities.get(i3) instanceof TLRPC.TL_messageEntitySpoiler) {
                    TLRPC.TL_messageEntitySpoiler tL_messageEntitySpoiler = (TLRPC.TL_messageEntitySpoiler) ziVar.f26868k.entities.get(i3);
                    for (int i10 = 0; i10 < tL_messageEntitySpoiler.length; i10++) {
                        char[] cArr = this.f25768i0;
                        sb2.setCharAt(tL_messageEntitySpoiler.offset + i10, cArr[i10 % cArr.length]);
                    }
                }
            }
            return sb2.toString();
        }
        return null;
    }

    public final void P(e0.q qVar, long j10, long j11, String str, long[] jArr, int i3, Uri uri, int i10, boolean z10, boolean z11, boolean z12, int i11) {
        a8.b("resetNotificationSound");
        Uri uri2 = Settings.System.DEFAULT_RINGTONE_URI;
        if (uri2 != null && uri != null && !TextUtils.equals(uri2.toString(), uri.toString())) {
            SharedPreferences.Editor edit = getAccountInstance().c().edit();
            String uri3 = uri2.toString();
            String M0 = bd.M0(2131751600, null);
            if (z10) {
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
                edit.putString("sound_" + v(j10, j11, false), M0);
                edit.putString("sound_path_" + v(j10, j11, false), uri3);
                o(j10, j11);
            }
            edit.commit();
            qVar.f9299y = e0(j10, j11, str, jArr, i3, uri2, i10, z10, z11, z12, i11);
            m0.e(null, this.f25763e0, qVar.b());
        }
    }

    public final void Q(boolean z10) {
        int i3;
        is isVar = this.V;
        try {
            if (r2.f25040a) {
                a8.b("delay notification start, onlineReason = " + z10);
            }
            this.W.acquire(10000L);
            p5 p5Var = f25748l0;
            p5Var.a(isVar);
            if (z10) {
                i3 = 3000;
            } else {
                i3 = 1000;
            }
            p5Var.e(isVar, i3);
        } catch (Exception e10) {
            a8.g(e10, true);
            Z(this.L);
        }
    }

    public final void R() {
        try {
            Intent intent = new Intent(t0.f25457b, NotificationRepeat.class);
            intent.putExtra("currentAccount", this.currentAccount);
            PendingIntent service = PendingIntent.getService(t0.f25457b, 0, intent, 33554432);
            int i3 = getAccountInstance().c().getInt("repeat_messages", 60);
            if (i3 > 0 && this.K > 0) {
                this.f25761d0.set(2, SystemClock.elapsedRealtime() + (i3 * 60000), service);
            } else {
                this.f25761d0.cancel(service);
            }
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    public final void S(int i3) {
        if (this.O != i3) {
            a8.b("setBadge " + i3);
            this.O = i3;
            try {
                if (wr.f26252c == null && !wr.f26251b) {
                    wr.b();
                    wr.f26251b = true;
                }
                ur urVar = wr.f26252c;
                if (urVar != null) {
                    urVar.a(i3);
                }
            } catch (Throwable unused) {
            }
        }
    }

    public final void T(long j10, int i3, long j11) {
        SharedPreferences.Editor edit = getAccountInstance().c().edit();
        TLRPC.Dialog dialog = (TLRPC.Dialog) hp.s1(h10.f22829t0).R.f(j10);
        if (i3 == 4) {
            if (D(j10, null, false, false)) {
                edit.remove("notify2_" + v(j10, j11, false));
            } else {
                edit.putInt("notify2_" + v(j10, j11, false), 0);
            }
            getMessagesStorage().E1(j10, 0L);
            if (dialog != null) {
                dialog.notify_settings = new TLRPC.TL_peerNotifySettings();
            }
        } else {
            int currentTime = ConnectionsManager.getInstance(h10.f22829t0).getCurrentTime();
            if (i3 == 0) {
                currentTime += 3600;
            } else if (i3 == 1) {
                currentTime += 28800;
            } else if (i3 == 2) {
                currentTime += 172800;
            } else if (i3 == 3) {
                currentTime = Integer.MAX_VALUE;
            }
            long j12 = 1;
            if (i3 == 3) {
                edit.putInt("notify2_" + v(j10, j11, false), 2);
            } else {
                edit.putInt("notify2_" + v(j10, j11, false), 3);
                edit.putInt("notifyuntil_" + v(j10, j11, false), currentTime);
                j12 = 1 | (((long) currentTime) << 32);
            }
            t(h10.f22829t0).N(j10);
            qr.a0(h10.f22829t0).E1(j10, j12);
            if (dialog != null) {
                TLRPC.TL_peerNotifySettings tL_peerNotifySettings = new TLRPC.TL_peerNotifySettings();
                dialog.notify_settings = tL_peerNotifySettings;
                tL_peerNotifySettings.mute_until = currentTime;
            }
        }
        edit.commit();
        c0(j10, j11, true);
    }

    public final void U(int i3, int i10) {
        getAccountInstance().c().edit().putInt(q(i3), i10).commit();
        b0(i3);
        qr messagesStorage = getMessagesStorage();
        messagesStorage.f24934a.c(new hq(messagesStorage, 25));
        m(i3);
    }

    public final void V(int i3) {
        f25748l0.c(new os(this, i3, 7));
    }

    public final void X(e0.q r90, java.lang.String r91, long r92, long r94, java.lang.String r96, long[] r97, int r98, android.net.Uri r99, int r100, boolean r101, boolean r102, boolean r103, int r104) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.us.X(e0.q, java.lang.String, long, long, java.lang.String, long[], int, android.net.Uri, int, boolean, boolean, boolean, int):void");
    }

    public final void Y() {
        f25748l0.c(new is(this, 3));
    }

    public final void Z(boolean r54) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.us.Z(boolean):void");
    }

    public final void a0(long j10, String str) {
        f25748l0.c(new zq(this, str, j10, 3));
    }

    public final void b0(int i3) {
        SharedPreferences c2 = getAccountInstance().c();
        if (i3 != 4 && i3 != 5) {
            TL_account.updateNotifySettings updatenotifysettings = new TL_account.updateNotifySettings();
            TLRPC.TL_inputPeerNotifySettings tL_inputPeerNotifySettings = new TLRPC.TL_inputPeerNotifySettings();
            updatenotifysettings.settings = tL_inputPeerNotifySettings;
            tL_inputPeerNotifySettings.flags = 5;
            if (i3 == 0) {
                updatenotifysettings.peer = new TLRPC.TL_inputNotifyChats();
                updatenotifysettings.settings.mute_until = c2.getInt("EnableGroup2", 0);
                updatenotifysettings.settings.show_previews = c2.getBoolean("EnablePreviewGroup", true);
                TLRPC.TL_inputPeerNotifySettings tL_inputPeerNotifySettings2 = updatenotifysettings.settings;
                tL_inputPeerNotifySettings2.flags |= 8;
                tL_inputPeerNotifySettings2.sound = s(c2, "GroupSound", "GroupSoundDocId", "GroupSoundPath");
            } else if (i3 != 1 && i3 != 3) {
                updatenotifysettings.peer = new TLRPC.TL_inputNotifyBroadcasts();
                updatenotifysettings.settings.mute_until = c2.getInt("EnableChannel2", 0);
                updatenotifysettings.settings.show_previews = c2.getBoolean("EnablePreviewChannel", true);
                TLRPC.TL_inputPeerNotifySettings tL_inputPeerNotifySettings3 = updatenotifysettings.settings;
                tL_inputPeerNotifySettings3.flags |= 8;
                tL_inputPeerNotifySettings3.sound = s(c2, "ChannelSound", "ChannelSoundDocId", "ChannelSoundPath");
            } else {
                updatenotifysettings.peer = new TLRPC.TL_inputNotifyUsers();
                updatenotifysettings.settings.mute_until = c2.getInt("EnableAll2", 0);
                updatenotifysettings.settings.show_previews = c2.getBoolean("EnablePreviewAll", true);
                TLRPC.TL_inputPeerNotifySettings tL_inputPeerNotifySettings4 = updatenotifysettings.settings;
                tL_inputPeerNotifySettings4.flags |= 128;
                tL_inputPeerNotifySettings4.stories_hide_sender = c2.getBoolean("EnableHideStoriesSenders", false);
                if (c2.contains("EnableAllStories")) {
                    TLRPC.TL_inputPeerNotifySettings tL_inputPeerNotifySettings5 = updatenotifysettings.settings;
                    tL_inputPeerNotifySettings5.flags |= 64;
                    tL_inputPeerNotifySettings5.stories_muted = !c2.getBoolean("EnableAllStories", true);
                }
                TLRPC.TL_inputPeerNotifySettings tL_inputPeerNotifySettings6 = updatenotifysettings.settings;
                tL_inputPeerNotifySettings6.flags |= 8;
                tL_inputPeerNotifySettings6.sound = s(c2, "GlobalSound", "GlobalSoundDocId", "GlobalSoundPath");
                TLRPC.TL_inputPeerNotifySettings tL_inputPeerNotifySettings7 = updatenotifysettings.settings;
                tL_inputPeerNotifySettings7.flags |= 256;
                tL_inputPeerNotifySettings7.stories_sound = s(c2, "StoriesSound", "StoriesSoundDocId", "StoriesSoundPath");
            }
            getConnectionsManager().sendRequest(updatenotifysettings, new ei.u5(14));
            return;
        }
        TL_account.setReactionsNotifySettings setreactionsnotifysettings = new TL_account.setReactionsNotifySettings();
        setreactionsnotifysettings.settings = new TL_account.TL_reactionsNotifySettings();
        if (c2.getBoolean("EnableReactionsMessages", true)) {
            setreactionsnotifysettings.settings.flags |= 1;
            if (c2.getBoolean("EnableReactionsMessagesContacts", false)) {
                setreactionsnotifysettings.settings.messages_notify_from = new TL_account.TL_reactionNotificationsFromContacts();
            } else {
                setreactionsnotifysettings.settings.messages_notify_from = new TL_account.TL_reactionNotificationsFromAll();
            }
        }
        if (c2.getBoolean("EnableReactionsStories", true)) {
            setreactionsnotifysettings.settings.flags |= 2;
            if (c2.getBoolean("EnableReactionsStoriesContacts", false)) {
                setreactionsnotifysettings.settings.stories_notify_from = new TL_account.TL_reactionNotificationsFromContacts();
            } else {
                setreactionsnotifysettings.settings.stories_notify_from = new TL_account.TL_reactionNotificationsFromAll();
            }
        }
        setreactionsnotifysettings.settings.show_previews = c2.getBoolean("EnableReactionsPreview", true);
        setreactionsnotifysettings.settings.sound = s(c2, "ReactionSound", "ReactionSoundDocId", "ReactionSoundPath");
        getConnectionsManager().sendRequest(setreactionsnotifysettings, new ei.u5(14));
    }

    public final void c0(long j10, long j11, boolean z10) {
        int i3;
        if (z10) {
            getNotificationCenter().k(hs.f23225f0, new Object[0]);
        }
        if (m5.C(j10)) {
            return;
        }
        SharedPreferences c2 = getAccountInstance().c();
        TL_account.updateNotifySettings updatenotifysettings = new TL_account.updateNotifySettings();
        updatenotifysettings.settings = new TLRPC.TL_inputPeerNotifySettings();
        String v = v(j10, j11, false);
        TLRPC.TL_inputPeerNotifySettings tL_inputPeerNotifySettings = updatenotifysettings.settings;
        tL_inputPeerNotifySettings.flags |= 1;
        tL_inputPeerNotifySettings.show_previews = c2.getBoolean("content_preview_" + v, true);
        TLRPC.TL_inputPeerNotifySettings tL_inputPeerNotifySettings2 = updatenotifysettings.settings;
        tL_inputPeerNotifySettings2.flags = tL_inputPeerNotifySettings2.flags | 2;
        tL_inputPeerNotifySettings2.silent = c2.getBoolean("silent_" + v, false);
        if (c2.contains("stories_" + v)) {
            TLRPC.TL_inputPeerNotifySettings tL_inputPeerNotifySettings3 = updatenotifysettings.settings;
            tL_inputPeerNotifySettings3.flags |= 64;
            tL_inputPeerNotifySettings3.stories_muted = !c2.getBoolean("stories_" + v, true);
        }
        int i10 = c2.getInt("notify2_" + v(j10, j11, false), -1);
        if (i10 != -1) {
            TLRPC.TL_inputPeerNotifySettings tL_inputPeerNotifySettings4 = updatenotifysettings.settings;
            tL_inputPeerNotifySettings4.flags |= 4;
            if (i10 == 3) {
                tL_inputPeerNotifySettings4.mute_until = c2.getInt("notifyuntil_" + v(j10, j11, false), 0);
            } else {
                if (i10 != 2) {
                    i3 = 0;
                } else {
                    i3 = Integer.MAX_VALUE;
                }
                tL_inputPeerNotifySettings4.mute_until = i3;
            }
        }
        long j12 = c2.getLong("sound_document_id_" + v(j10, j11, false), 0L);
        String string = c2.getString("sound_path_" + v(j10, j11, false), null);
        TLRPC.TL_inputPeerNotifySettings tL_inputPeerNotifySettings5 = updatenotifysettings.settings;
        tL_inputPeerNotifySettings5.flags = tL_inputPeerNotifySettings5.flags | 8;
        if (j12 != 0) {
            TLRPC.TL_notificationSoundRingtone tL_notificationSoundRingtone = new TLRPC.TL_notificationSoundRingtone();
            tL_notificationSoundRingtone.f27128id = j12;
            updatenotifysettings.settings.sound = tL_notificationSoundRingtone;
        } else if (string != null) {
            if (string.equalsIgnoreCase("NoSound")) {
                updatenotifysettings.settings.sound = new TLRPC.TL_notificationSoundNone();
            } else {
                TLRPC.TL_notificationSoundLocal tL_notificationSoundLocal = new TLRPC.TL_notificationSoundLocal();
                tL_notificationSoundLocal.title = c2.getString("sound_" + v(j10, j11, false), null);
                tL_notificationSoundLocal.data = string;
                updatenotifysettings.settings.sound = tL_notificationSoundLocal;
            }
        } else {
            tL_inputPeerNotifySettings5.sound = new TLRPC.TL_notificationSoundDefault();
        }
        if (j11 != 0 && j10 != getUserConfig().e()) {
            TLRPC.TL_inputNotifyForumTopic tL_inputNotifyForumTopic = new TLRPC.TL_inputNotifyForumTopic();
            tL_inputNotifyForumTopic.peer = getMessagesController().j1(j10);
            tL_inputNotifyForumTopic.top_msg_id = (int) j11;
            updatenotifysettings.peer = tL_inputNotifyForumTopic;
        } else {
            int i11 = this.currentAccount;
            if (j10 < 0 && t3.Y(hp.s1(i11).M0(Long.valueOf(-j10)))) {
                TLRPC.TL_inputNotifyCommunity tL_inputNotifyCommunity = new TLRPC.TL_inputNotifyCommunity();
                tL_inputNotifyCommunity.community = getMessagesController().h1(-j10);
                updatenotifysettings.peer = tL_inputNotifyCommunity;
            } else {
                TLRPC.TL_inputNotifyPeer tL_inputNotifyPeer = new TLRPC.TL_inputNotifyPeer();
                tL_inputNotifyPeer.peer = getMessagesController().j1(j10);
                updatenotifysettings.peer = tL_inputNotifyPeer;
            }
        }
        getConnectionsManager().sendRequest(updatenotifysettings, new ei.u5(14));
    }

    public final void d0() {
        int i3 = 0;
        long j10 = Long.MAX_VALUE;
        while (true) {
            ArrayList arrayList = this.E;
            if (i3 >= arrayList.size()) {
                break;
            }
            for (Pair pair : ((ts) arrayList.get(i3)).f25589c.values()) {
                j10 = Math.min(j10, ((Long) pair.second).longValue());
            }
            i3++;
        }
        p5 p5Var = f25748l0;
        is isVar = this.f25769j0;
        p5Var.a(isVar);
        long currentTimeMillis = j10 - System.currentTimeMillis();
        if (j10 != Long.MAX_VALUE) {
            p5Var.e(isVar, Math.max(0L, currentTimeMillis));
        }
    }

    @Override
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        if (i3 == hs.Y1) {
            f25748l0.c(new pq(11, this, (String) objArr[0]));
        }
    }

    public final java.lang.String e0(long r46, long r48, java.lang.String r50, long[] r51, int r52, android.net.Uri r53, int r54, boolean r55, boolean r56, boolean r57, int r58) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.us.e0(long, long, java.lang.String, long[], int, android.net.Uri, int, boolean, boolean, boolean, int):java.lang.String");
    }

    public final void h(zi ziVar) {
        int i3 = 0;
        while (true) {
            ArrayList arrayList = this.f25755a;
            if (i3 < arrayList.size()) {
                if (((zi) arrayList.get(i3)).f1() == ziVar.f1() && zi.B0(((zi) arrayList.get(i3)).f26868k) == zi.B0(ziVar.f26868k) && ((zi) arrayList.get(i3)).K == ziVar.K) {
                    return;
                }
                i3++;
            } else {
                arrayList.add(0, ziVar);
                return;
            }
        }
    }

    public final java.lang.String j(e0.q r18, long r19, java.lang.String r21, org.telegram.tgnet.TLRPC.User r22, org.telegram.tgnet.TLRPC.Chat r23, e0.k0 r24, boolean r25) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.us.j(e0.q, long, java.lang.String, org.telegram.tgnet.TLRPC$User, org.telegram.tgnet.TLRPC$Chat, e0.k0, boolean):java.lang.String");
    }

    public final void l(long j10, long j11) {
        if (Build.VERSION.SDK_INT < 26) {
            return;
        }
        f25748l0.c(new js(this, j10, j11, 1));
    }

    public final void m(int i3) {
        if (Build.VERSION.SDK_INT < 26) {
            return;
        }
        f25748l0.c(new os(this, i3, 8));
    }

    public final void n(int i3) {
        String str;
        String str2;
        String str3;
        if (Build.VERSION.SDK_INT >= 26) {
            try {
                SharedPreferences c2 = getAccountInstance().c();
                SharedPreferences.Editor edit = c2.edit();
                if (i3 == 2) {
                    str = "channels";
                } else if (i3 == 0) {
                    str = "groups";
                } else if (i3 == 3) {
                    str = "stories";
                } else {
                    if (i3 != 4 && i3 != 5) {
                        str = "private";
                    }
                    str = "reactions";
                }
                String string = c2.getString(str, null);
                if (string != null) {
                    edit.remove(str).remove(str.concat("_s"));
                    try {
                        f25749n0.deleteNotificationChannel(string);
                    } catch (Exception e10) {
                        a8.g(e10, true);
                    }
                    if (r2.f25040a) {
                        a8.b("delete channel global internal ".concat(string));
                    }
                }
                if (i3 == 2) {
                    str2 = "channels_ia";
                } else if (i3 == 0) {
                    str2 = "groups_ia";
                } else if (i3 == 3) {
                    str2 = "stories_ia";
                } else {
                    if (i3 != 4 && i3 != 5) {
                        str2 = "private_ia";
                    }
                    str2 = "reactions_ia";
                }
                String string2 = c2.getString(str2, null);
                if (string2 != null) {
                    edit.remove(str2).remove(str2.concat("_s"));
                    try {
                        f25749n0.deleteNotificationChannel(string2);
                    } catch (Exception e11) {
                        a8.g(e11, true);
                    }
                    if (r2.f25040a) {
                        a8.b("delete channel global internal ".concat(string2));
                    }
                }
                if (i3 == 2) {
                    str3 = "overwrite_channel";
                } else if (i3 == 0) {
                    str3 = "overwrite_group";
                } else if (i3 == 3) {
                    str3 = "overwrite_stories";
                } else {
                    if (i3 != 4 && i3 != 5) {
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

    public final void o(long j10, long j11) {
        if (Build.VERSION.SDK_INT >= 26) {
            try {
                SharedPreferences c2 = getAccountInstance().c();
                SharedPreferences.Editor edit = c2.edit();
                String str = "org.telegram.key" + j10;
                if (j11 != 0) {
                    str = str + ".topic" + j11;
                }
                String string = c2.getString(str, null);
                if (string != null) {
                    edit.remove(str).remove(str + "_s");
                    try {
                        f25749n0.deleteNotificationChannel(string);
                    } catch (Exception e10) {
                        a8.g(e10, true);
                    }
                    if (r2.f25040a) {
                        a8.b("delete channel internal ".concat(string));
                    }
                }
                String str2 = "org.telegram.keyia" + j10;
                String string2 = c2.getString(str2, null);
                if (string2 != null) {
                    edit.remove(str2).remove(str2 + "_s");
                    try {
                        f25749n0.deleteNotificationChannel(string2);
                    } catch (Exception e11) {
                        a8.g(e11, true);
                    }
                    if (r2.f25040a) {
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
            m0.b(this.f25763e0, null);
            this.f25755a.clear();
            this.f25759c.b();
            this.f25770n.b();
            for (int i3 = 0; i3 < hVar.m(); i3++) {
                if (!this.f25775y.contains(Long.valueOf(hVar.j(i3)))) {
                    m0.b(((Integer) hVar.n(i3)).intValue(), null);
                }
            }
            hVar.b();
            g0.h3(new hc(9));
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    public final int u(long j10, long j11) {
        int c2 = this.f25767h0.c(-1, j10, j11, "notify2_");
        if (c2 == 3 && this.f25767h0.c(0, j10, j11, "notifyuntil_") >= getConnectionsManager().getCurrentTime()) {
            return 2;
        }
        return c2;
    }

    public final java.lang.String w(org.telegram.messenger.zi r31, java.lang.String[] r32, boolean[] r33) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.us.w(org.telegram.messenger.zi, java.lang.String[], boolean[]):java.lang.String");
    }

    public final java.lang.String x(org.telegram.messenger.zi r31, boolean[] r32) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.us.x(org.telegram.messenger.zi, boolean[]):java.lang.String");
    }

    public final String y(TLRPC.Chat chat) {
        if (chat == null) {
            return null;
        }
        if (chat.monoforum) {
            return rg.c.i(this.currentAccount, chat, false);
        }
        return chat.title;
    }

    public final int z() {
        int i3 = 0;
        for (int i10 = 0; i10 < 4; i10++) {
            if (h10.i(i10).p() && (az.Q0 || h10.f22829t0 == i10)) {
                us t10 = t(i10);
                if (t10.S) {
                    if (t10.U) {
                        if (t10.T) {
                            try {
                                ArrayList arrayList = new ArrayList(hp.s1(i10).f23169y);
                                int size = arrayList.size();
                                for (int i11 = 0; i11 < size; i11++) {
                                    TLRPC.Dialog dialog = (TLRPC.Dialog) arrayList.get(i11);
                                    if (dialog != null && m5.z(dialog.f27005id)) {
                                        TLRPC.Chat M0 = getMessagesController().M0(Long.valueOf(-dialog.f27005id));
                                        if (!t3.r0(M0)) {
                                            if (t3.Y(M0)) {
                                            }
                                        }
                                    }
                                    if (dialog != null) {
                                        i3 += hp.s1(i10).V0(dialog);
                                    }
                                }
                            } catch (Exception e10) {
                                a8.g(e10, true);
                            }
                        } else {
                            i3 += t10.J;
                        }
                    } else if (t10.T) {
                        try {
                            int size2 = hp.s1(i10).f23169y.size();
                            for (int i12 = 0; i12 < size2; i12++) {
                                TLRPC.Dialog dialog2 = (TLRPC.Dialog) hp.s1(i10).f23169y.get(i12);
                                if (m5.z(dialog2.f27005id)) {
                                    TLRPC.Chat M02 = getMessagesController().M0(Long.valueOf(-dialog2.f27005id));
                                    if (!t3.r0(M02)) {
                                        if (t3.Y(M02)) {
                                        }
                                    }
                                }
                                if (hp.s1(i10).V0(dialog2) != 0) {
                                    i3++;
                                }
                            }
                        } catch (Exception e11) {
                            a8.g(e11, false);
                        }
                    } else {
                        i3 += t10.f25764f.m();
                    }
                }
            }
        }
        return i3;
    }
}
