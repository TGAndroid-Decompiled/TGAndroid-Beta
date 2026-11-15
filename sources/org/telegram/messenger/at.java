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
public final class at extends c1 implements is {
    public static String f22557k0;
    public static e0.i0 m0;
    public static NotificationManager f22559n0;
    public static AudioManager f22561p0;
    public static volatile at[] f22562q0;
    public static final Object[] f22563r0;
    public static final a0.h f22564s0;
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
    public final os V;
    public final PowerManager.WakeLock W;
    public long X;
    public SoundPool Y;
    public int Z;
    public final ArrayList f22565a;
    public int f22566a0;
    public final ArrayList f22567b;
    public boolean f22568b0;
    public final a0.h f22569c;
    public boolean f22570c0;
    public final a0.h d;
    public final AlarmManager f22571d0;
    public final a0.h f22572e;
    public final int f22573e0;
    public final a0.h f22574f;
    public final String f22575f0;
    public final xh.f f22576g0;
    public final a0.h h;
    public final bt f22577h0;
    public final char[] f22578i0;
    public final os f22579j0;
    public final a0.h f22580n;
    public final a0.h f22581r;
    public final HashSet f22582s;
    public final ArrayList f22583w;
    public ArrayList f22584x;
    public final HashSet f22585y;
    public static final p5 f22558l0 = new p5("notificationsQueue");
    public static final long f22560o0 = m5.F(1);

    static {
        m0 = null;
        f22559n0 = null;
        if (Build.VERSION.SDK_INT >= 26 && t0.f26600b != null) {
            m0 = new e0.i0(t0.f26600b);
            f22559n0 = (NotificationManager) t0.f26600b.getSystemService("notification");
            i();
        }
        f22561p0 = (AudioManager) t0.f26600b.getSystemService("audio");
        f22562q0 = new at[4];
        f22563r0 = new Object[4];
        for (int i7 = 0; i7 < 4; i7++) {
            f22563r0[i7] = new Object();
        }
        f22564s0 = new a0.h();
    }

    public at(int i7) {
        super(i7);
        Object valueOf;
        this.f22565a = new ArrayList();
        this.f22567b = new ArrayList();
        this.f22569c = new a0.h();
        this.d = new a0.h();
        this.f22572e = new a0.h();
        this.f22574f = new a0.h();
        this.h = new a0.h();
        this.f22580n = new a0.h();
        this.f22581r = new a0.h();
        this.f22582s = new HashSet();
        this.f22583w = new ArrayList();
        this.f22584x = new ArrayList();
        this.f22585y = new HashSet();
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
        this.f22576g0 = new xh.f();
        this.f22578i0 = new char[]{10252, 10338, 10385, 10280, 10277, 10286, 10321};
        this.f22579j0 = new os(this, 11);
        this.f22573e0 = this.currentAccount + 1;
        StringBuilder sb2 = new StringBuilder("messages");
        int i10 = this.currentAccount;
        if (i10 == 0) {
            valueOf = "";
        } else {
            valueOf = Integer.valueOf(i10);
        }
        sb2.append(valueOf);
        this.f22575f0 = sb2.toString();
        SharedPreferences d = getAccountInstance().d();
        this.N = d.getBoolean("EnableInChatSound", true);
        this.S = d.getBoolean("badgeNumber", true);
        this.T = d.getBoolean("badgeNumberMuted", false);
        this.U = d.getBoolean("badgeNumberMessages", true);
        m0 = new e0.i0(t0.f26600b);
        f22559n0 = (NotificationManager) t0.f26600b.getSystemService("notification");
        try {
            f22561p0 = (AudioManager) t0.f26600b.getSystemService("audio");
        } catch (Exception e10) {
            a8.g(e10, true);
        }
        try {
            this.f22571d0 = (AlarmManager) t0.f26600b.getSystemService("alarm");
        } catch (Exception e11) {
            a8.g(e11, true);
        }
        try {
            PowerManager.WakeLock newWakeLock = ((PowerManager) t0.f26600b.getSystemService("power")).newWakeLock(1, "telegram:notification_delay_lock");
            this.W = newWakeLock;
            newWakeLock.setReferenceCounted(false);
        } catch (Exception e12) {
            a8.g(e12, true);
        }
        this.V = new os(this, 12);
        this.f22577h0 = new bt(this.currentAccount);
        g0.h3(new os(this, 13));
    }

    public static boolean E(gj gjVar) {
        TLRPC.MessageAction messageAction;
        TLRPC.Message message = gjVar.f23817k;
        TLRPC.Peer peer = message.peer_id;
        if ((peer != null && peer.chat_id == 0 && peer.channel_id == 0 && ((messageAction = message.action) == null || (messageAction instanceof TLRPC.TL_messageActionEmpty))) || gjVar.J) {
            return true;
        }
        return false;
    }

    public static Bitmap F(ArrayList arrayList) {
        float f10;
        int i7;
        Bitmap bitmap;
        Paint paint;
        boolean z10;
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
                    options.inSampleSize = hi.d7.d(options, i11, i11);
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
                    z11 = z10;
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
                    paint2.setShader(new LinearGradient(size, size2, size, size2 + f12, new int[]{org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.f29071p8[org.telegram.ui.Components.t8.e(user.f28200id)], false), org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.f29091q8[org.telegram.ui.Components.t8.e(user.f28200id)], false)}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
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
                                    L = i7;
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
                    org.telegram.ui.Components.t8.a(user.first_name, user.last_name, null, sb2);
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
                L = i7;
                createBitmap = bitmap;
                f10 = f11;
                paint3 = paint;
                arrayList2 = arrayList;
            }
            c10 = 2;
            z10 = true;
            i10++;
            z11 = z10;
            L = i7;
            createBitmap = bitmap;
            f10 = f11;
            paint3 = paint;
            arrayList2 = arrayList;
        }
        return createBitmap;
    }

    public static void W(Notification notification, e0.q qVar, boolean z10) {
        if (z10) {
            qVar.f9951y = f22557k0;
        } else {
            qVar.f9951y = notification.getChannelId();
        }
    }

    public static void a(at atVar, String str, long j3) {
        boolean z10;
        String M0;
        if (atVar.getUserConfig().p()) {
            if (gz.Q0 || atVar.currentAccount == m10.f24934t0) {
                try {
                    String str2 = "wallet_tonconnect_" + atVar.currentAccount;
                    if (Build.VERSION.SDK_INT >= 26) {
                        f22559n0.createNotificationChannel(new NotificationChannel(str2, "TON Connect", 3));
                    }
                    if (!g0.p2(false) && !gz.C && atVar.getAccountInstance().d().getBoolean("EnablePreviewAll", true)) {
                        z10 = false;
                        if (!TextUtils.isEmpty(str) && !z10) {
                            M0 = hd.a0(null, null, 2131747925, str);
                            Intent intent = new Intent(t0.f26600b, LaunchActivity.class);
                            intent.setAction("android.intent.action.VIEW");
                            intent.setData(Uri.parse("tg://resolve?domain=sendgrams"));
                            intent.putExtra("currentAccount", atVar.currentAccount);
                            intent.addFlags(67108864);
                            PendingIntent activity = PendingIntent.getActivity(t0.f26600b, atVar.currentAccount, intent, 201326592);
                            e0.q qVar = new e0.q(t0.f26600b, str2);
                            qVar.F.icon = 2131232453;
                            qVar.f9933e = e0.q.d(hd.M0(2131689472, null));
                            qVar.f9934f = e0.q.d(M0);
                            e0.l lVar = new e0.l(false);
                            lVar.f9923f = e0.q.d(M0);
                            qVar.n(lVar);
                            qVar.f9948u = "event";
                            qVar.f9950x = 0;
                            qVar.F.when = j3;
                            qVar.h(16, true);
                            qVar.f9935g = activity;
                            m0.e("wallet_tonconnect", atVar.currentAccount, qVar.b());
                        }
                        M0 = hd.M0(2131747926, null);
                        Intent intent2 = new Intent(t0.f26600b, LaunchActivity.class);
                        intent2.setAction("android.intent.action.VIEW");
                        intent2.setData(Uri.parse("tg://resolve?domain=sendgrams"));
                        intent2.putExtra("currentAccount", atVar.currentAccount);
                        intent2.addFlags(67108864);
                        PendingIntent activity2 = PendingIntent.getActivity(t0.f26600b, atVar.currentAccount, intent2, 201326592);
                        e0.q qVar2 = new e0.q(t0.f26600b, str2);
                        qVar2.F.icon = 2131232453;
                        qVar2.f9933e = e0.q.d(hd.M0(2131689472, null));
                        qVar2.f9934f = e0.q.d(M0);
                        e0.l lVar2 = new e0.l(false);
                        lVar2.f9923f = e0.q.d(M0);
                        qVar2.n(lVar2);
                        qVar2.f9948u = "event";
                        qVar2.f9950x = 0;
                        qVar2.F.when = j3;
                        qVar2.h(16, true);
                        qVar2.f9935g = activity2;
                        m0.e("wallet_tonconnect", atVar.currentAccount, qVar2.b());
                    }
                    z10 = true;
                    if (!TextUtils.isEmpty(str)) {
                        M0 = hd.a0(null, null, 2131747925, str);
                        Intent intent22 = new Intent(t0.f26600b, LaunchActivity.class);
                        intent22.setAction("android.intent.action.VIEW");
                        intent22.setData(Uri.parse("tg://resolve?domain=sendgrams"));
                        intent22.putExtra("currentAccount", atVar.currentAccount);
                        intent22.addFlags(67108864);
                        PendingIntent activity22 = PendingIntent.getActivity(t0.f26600b, atVar.currentAccount, intent22, 201326592);
                        e0.q qVar22 = new e0.q(t0.f26600b, str2);
                        qVar22.F.icon = 2131232453;
                        qVar22.f9933e = e0.q.d(hd.M0(2131689472, null));
                        qVar22.f9934f = e0.q.d(M0);
                        e0.l lVar22 = new e0.l(false);
                        lVar22.f9923f = e0.q.d(M0);
                        qVar22.n(lVar22);
                        qVar22.f9948u = "event";
                        qVar22.f9950x = 0;
                        qVar22.F.when = j3;
                        qVar22.h(16, true);
                        qVar22.f9935g = activity22;
                        m0.e("wallet_tonconnect", atVar.currentAccount, qVar22.b());
                    }
                    M0 = hd.M0(2131747926, null);
                    Intent intent222 = new Intent(t0.f26600b, LaunchActivity.class);
                    intent222.setAction("android.intent.action.VIEW");
                    intent222.setData(Uri.parse("tg://resolve?domain=sendgrams"));
                    intent222.putExtra("currentAccount", atVar.currentAccount);
                    intent222.addFlags(67108864);
                    PendingIntent activity222 = PendingIntent.getActivity(t0.f26600b, atVar.currentAccount, intent222, 201326592);
                    e0.q qVar222 = new e0.q(t0.f26600b, str2);
                    qVar222.F.icon = 2131232453;
                    qVar222.f9933e = e0.q.d(hd.M0(2131689472, null));
                    qVar222.f9934f = e0.q.d(M0);
                    e0.l lVar222 = new e0.l(false);
                    lVar222.f9923f = e0.q.d(M0);
                    qVar222.n(lVar222);
                    qVar222.f9948u = "event";
                    qVar222.f9950x = 0;
                    qVar222.F.when = j3;
                    qVar222.h(16, true);
                    qVar222.f9935g = activity222;
                    m0.e("wallet_tonconnect", atVar.currentAccount, qVar222.b());
                } catch (Exception e10) {
                    a8.g(e10, true);
                }
            }
        }
    }

    public static void b(at atVar) {
        try {
            SharedPreferences d = atVar.getAccountInstance().d();
            Map<String, ?> all = d.getAll();
            SharedPreferences.Editor edit = d.edit();
            for (Map.Entry<String, ?> entry : all.entrySet()) {
                String key = entry.getKey();
                if (key.startsWith("org.telegram.key")) {
                    if (!key.endsWith("_s")) {
                        String str = (String) entry.getValue();
                        f22559n0.deleteNotificationChannel(str);
                        if (r2.f26198a) {
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

    public static void c(at atVar) {
        PowerManager.WakeLock wakeLock = atVar.W;
        m0.b(atVar.currentAccount, "wallet_tonconnect");
        atVar.G = 0L;
        atVar.H = 0L;
        atVar.J = 0;
        atVar.K = 0;
        atVar.f22565a.clear();
        atVar.f22569c.b();
        atVar.d.b();
        atVar.f22574f.b();
        atVar.h.b();
        atVar.f22580n.b();
        atVar.f22585y.clear();
        atVar.f22567b.clear();
        atVar.L = false;
        atVar.O = 0;
        try {
            if (wakeLock.isHeld()) {
                wakeLock.release();
            }
        } catch (Exception e10) {
            a8.g(e10, true);
        }
        atVar.p();
        atVar.S(atVar.z());
        SharedPreferences.Editor edit = atVar.getAccountInstance().d().edit();
        edit.clear();
        edit.commit();
        if (Build.VERSION.SDK_INT >= 26) {
            try {
                f22559n0.deleteNotificationChannelGroup("channels" + atVar.currentAccount);
                f22559n0.deleteNotificationChannelGroup("groups" + atVar.currentAccount);
                f22559n0.deleteNotificationChannelGroup("private" + atVar.currentAccount);
                f22559n0.deleteNotificationChannelGroup("stories" + atVar.currentAccount);
                f22559n0.deleteNotificationChannelGroup("other" + atVar.currentAccount);
                String str = atVar.currentAccount + "channel";
                List<NotificationChannel> notificationChannels = f22559n0.getNotificationChannels();
                int size = notificationChannels.size();
                for (int i7 = 0; i7 < size; i7++) {
                    String id2 = notificationChannels.get(i7).getId();
                    if (id2.startsWith(str)) {
                        try {
                            f22559n0.deleteNotificationChannel(id2);
                        } catch (Exception e11) {
                            a8.g(e11, true);
                        }
                        if (r2.f26198a) {
                            a8.b("delete channel cleanup " + id2);
                        }
                    }
                }
            } catch (Throwable th2) {
                a8.g(th2, true);
            }
        }
    }

    public static void e(org.telegram.messenger.at r44, java.util.ArrayList r45, java.util.ArrayList r46, boolean r47, boolean r48, java.util.concurrent.CountDownLatch r49) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.at.e(org.telegram.messenger.at, java.util.ArrayList, java.util.ArrayList, boolean, boolean, java.util.concurrent.CountDownLatch):void");
    }

    public static void f(at atVar, ArrayList arrayList, a0.h hVar, ArrayList arrayList2, Collection collection) {
        long j3;
        long j10;
        boolean z10;
        int i7;
        int i10;
        int i11;
        int intValue;
        long j11;
        boolean z11;
        int i12;
        TLRPC.MessageFwdHeader messageFwdHeader;
        long j12;
        long j13;
        TLRPC.Message message;
        long j14;
        TLRPC.Message message2;
        SparseArray sparseArray;
        gj gjVar;
        long j15;
        boolean z12;
        boolean z13;
        SparseArray sparseArray2;
        int intValue2;
        atVar.f22574f.b();
        atVar.f22565a.clear();
        atVar.f22569c.b();
        atVar.E.clear();
        atVar.F.b();
        boolean z14 = false;
        atVar.J = 0;
        atVar.K = 0;
        atVar.getAccountInstance().d();
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
                    SparseArray sparseArray3 = (SparseArray) atVar.f22569c.f(j12);
                    if (sparseArray3 == null || sparseArray3.indexOfKey(message3.f28072id) < 0) {
                        gj gjVar2 = new gj(atVar.currentAccount, message3, false, false);
                        if (E(gjVar2)) {
                            atVar.K++;
                        }
                        long B0 = gj.B0(gjVar2.f23817k);
                        long b22 = gj.b2(atVar.currentAccount, gjVar2.f23817k, atVar.getMessagesController().u2(gjVar2), false);
                        if (gjVar2.f23817k.mentioned) {
                            message = message3;
                            j14 = gjVar2.Z0();
                            j13 = j12;
                        } else {
                            j13 = j12;
                            message = message3;
                            j14 = B0;
                        }
                        int h = hVar2.h(j14);
                        if (h >= 0 && b22 == 0) {
                            z13 = ((Boolean) hVar2.n(h)).booleanValue();
                            message2 = message;
                            sparseArray = sparseArray3;
                            gjVar = gjVar2;
                            j15 = j13;
                        } else {
                            int u10 = atVar.u(j14, b22);
                            if (u10 == -1) {
                                message2 = message;
                                sparseArray = sparseArray3;
                                j15 = j13;
                                z13 = atVar.D(j14, null, gjVar2.I, gjVar2.J);
                                gjVar = gjVar2;
                            } else {
                                message2 = message;
                                sparseArray = sparseArray3;
                                gjVar = gjVar2;
                                j15 = j13;
                                if (u10 != 2) {
                                    z12 = true;
                                } else {
                                    z12 = false;
                                }
                                z13 = z12;
                            }
                            hVar2.k(Boolean.valueOf(z13), j14);
                        }
                        if (z13 && (j14 != atVar.G || !t0.f26607w)) {
                            if (sparseArray == null) {
                                sparseArray2 = new SparseArray();
                                atVar.f22569c.k(sparseArray2, j15);
                            } else {
                                sparseArray2 = sparseArray;
                            }
                            sparseArray2.put(message2.f28072id, gjVar);
                            atVar.h(gjVar);
                            if (B0 != j14) {
                                Integer num = (Integer) atVar.f22581r.f(B0);
                                a0.h hVar3 = atVar.f22581r;
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
                z11 = ((Boolean) hVar2.n(h7)).booleanValue();
            } else {
                int u11 = atVar.u(j18, j17);
                if (u11 == -1) {
                    z11 = atVar.D(j18, null, false, false);
                } else if (u11 != 2) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                hVar2.k(Boolean.valueOf(z11), j18);
            }
            if (z11) {
                Integer num2 = (Integer) hVar.n(i14);
                int intValue3 = num2.intValue();
                atVar.f22574f.k(num2, j18);
                if (!atVar.getMessagesController().p2(j18)) {
                    if (atVar.getMessagesController().t2(j18)) {
                        int i15 = atVar.J;
                        if (intValue3 > 0) {
                            i12 = 1;
                        } else {
                            i12 = 0;
                        }
                        atVar.J = i15 + i12;
                    } else {
                        atVar.J += intValue3;
                    }
                }
            }
            i14++;
            j17 = 0;
        }
        for (int i16 = 0; i16 < arrayList2.size(); i16++) {
            gj gjVar3 = (gj) arrayList2.get(i16);
            int e12 = gjVar3.e1();
            if (atVar.f22569c.h(e12) < 0) {
                if (E(gjVar3)) {
                    atVar.K++;
                }
                long B02 = gj.B0(gjVar3.f23817k);
                long b23 = gj.b2(atVar.currentAccount, gjVar3.f23817k, atVar.getMessagesController().u2(gjVar3), false);
                TLRPC.Message message4 = gjVar3.f23817k;
                long j19 = message4.random_id;
                if (message4.mentioned) {
                    j3 = gjVar3.Z0();
                } else {
                    j3 = B02;
                }
                int h10 = hVar2.h(j3);
                if (h10 >= 0 && b23 == 0) {
                    long j20 = j3;
                    z10 = ((Boolean) hVar2.n(h10)).booleanValue();
                    j10 = j20;
                } else {
                    int u12 = atVar.u(j3, b23);
                    if (u12 == -1) {
                        j10 = j3;
                        z10 = atVar.D(j10, null, gjVar3.I, gjVar3.J);
                    } else {
                        j10 = j3;
                        if (u12 != 2) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                    }
                    hVar2.k(Boolean.valueOf(z10), j10);
                }
                if (z10 && (j10 != atVar.G || !t0.f26607w)) {
                    if (e12 != 0) {
                        if (gjVar3.J) {
                            j11 = gj.B0(gjVar3.f23817k);
                        } else {
                            long j21 = gjVar3.f23817k.peer_id.channel_id;
                            if (j21 != 0) {
                                j11 = -j21;
                            } else {
                                j11 = 0;
                            }
                        }
                        SparseArray sparseArray4 = (SparseArray) atVar.f22569c.f(j11);
                        if (sparseArray4 == null) {
                            sparseArray4 = new SparseArray();
                            atVar.f22569c.k(sparseArray4, j11);
                        }
                        sparseArray4.put(e12, gjVar3);
                    } else if (j19 != 0) {
                        atVar.d.k(gjVar3, j19);
                    }
                    atVar.h(gjVar3);
                    if (B02 != j10) {
                        Integer num3 = (Integer) atVar.f22581r.f(B02);
                        a0.h hVar4 = atVar.f22581r;
                        if (num3 == null) {
                            intValue = 1;
                        } else {
                            intValue = num3.intValue() + 1;
                        }
                        hVar4.k(Integer.valueOf(intValue), B02);
                    }
                    Integer num4 = (Integer) atVar.f22574f.f(j10);
                    if (num4 != null) {
                        i7 = num4.intValue() + 1;
                    } else {
                        i7 = 1;
                    }
                    if (!atVar.getMessagesController().p2(j10)) {
                        if (atVar.getMessagesController().t2(j10)) {
                            if (num4 != null) {
                                int i17 = atVar.J;
                                if (num4.intValue() > 0) {
                                    i11 = 1;
                                } else {
                                    i11 = 0;
                                }
                                atVar.J = i17 - i11;
                            }
                            int i18 = atVar.J;
                            if (i7 > 0) {
                                i10 = 1;
                            } else {
                                i10 = 0;
                            }
                            atVar.J = i18 + i10;
                        } else {
                            if (num4 != null) {
                                atVar.J -= num4.intValue();
                            }
                            atVar.J += i7;
                        }
                    }
                    atVar.f22574f.k(Integer.valueOf(i7), j10);
                }
            }
        }
        if (collection != null) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                zs zsVar = (zs) it.next();
                long j22 = zsVar.f27999a;
                zs zsVar2 = (zs) atVar.F.f(j22);
                if (zsVar2 != null) {
                    zsVar2.f28001c.putAll(zsVar.f28001c);
                } else {
                    atVar.E.add(zsVar);
                    atVar.F.k(zsVar, j22);
                }
            }
            Collections.sort(atVar.E, Comparator$CC.comparingLong(new qk(2)));
        }
        g0.h3(new us(atVar, atVar.f22574f.m(), 4));
        if (SystemClock.elapsedRealtime() / 1000 < 60) {
            z14 = true;
        }
        atVar.Z(z14);
        if (atVar.S) {
            atVar.S(atVar.z());
        }
    }

    public static int g(java.util.ArrayList r3, org.telegram.messenger.gj r4, long r5, boolean r7, android.content.SharedPreferences r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.at.g(java.util.ArrayList, org.telegram.messenger.gj, long, boolean, android.content.SharedPreferences):int");
    }

    public static void i() {
        SharedPreferences sharedPreferences;
        if (Build.VERSION.SDK_INT >= 26) {
            if (f22557k0 == null) {
                sharedPreferences = t0.f26600b.getSharedPreferences("Notifications", 0);
                f22557k0 = sharedPreferences.getString("OtherKey", "Other3");
            } else {
                sharedPreferences = null;
            }
            NotificationChannel notificationChannel = f22559n0.getNotificationChannel(f22557k0);
            if (notificationChannel != null && notificationChannel.getImportance() == 0) {
                try {
                    f22559n0.deleteNotificationChannel(f22557k0);
                } catch (Exception e10) {
                    a8.g(e10, true);
                }
                f22557k0 = null;
                notificationChannel = null;
            }
            if (f22557k0 == null) {
                if (sharedPreferences == null) {
                    sharedPreferences = t0.f26600b.getSharedPreferences("Notifications", 0);
                }
                f22557k0 = "Other" + Utilities.f22414b.nextLong();
                sharedPreferences.edit().putString("OtherKey", f22557k0).commit();
            }
            String M0 = hd.M0(2131749189, null);
            if (notificationChannel != null && !TextUtils.equals(notificationChannel.getName(), M0)) {
                notificationChannel.setName(M0);
                try {
                    f22559n0.createNotificationChannel(notificationChannel);
                } catch (Exception e11) {
                    a8.g(e11, true);
                }
            }
            if (notificationChannel == null) {
                NotificationChannel notificationChannel2 = new NotificationChannel(f22557k0, M0, 3);
                notificationChannel2.enableLights(false);
                notificationChannel2.enableVibration(false);
                notificationChannel2.setSound(null, null);
                try {
                    f22559n0.createNotificationChannel(notificationChannel2);
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

    public static String r(gj gjVar, String str) {
        boolean z10;
        int i7;
        TLRPC.Message message = gjVar.f23817k;
        TLRPC.TL_messageActionGramTransfer tL_messageActionGramTransfer = (TLRPC.TL_messageActionGramTransfer) message.action;
        boolean A = q10.A(gj.B0(message));
        if (!tL_messageActionGramTransfer.comment_encrypted && !TextUtils.isEmpty(tL_messageActionGramTransfer.comment)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (A) {
            if (z10) {
                i7 = 2131748035;
            } else {
                i7 = 2131748036;
            }
        } else if (z10) {
            i7 = 2131748037;
        } else {
            i7 = 2131748038;
        }
        return hd.a0(null, null, i7, str, org.telegram.ui.Wallet.l0.s(tL_messageActionGramTransfer.amount, false), tL_messageActionGramTransfer.comment);
    }

    public static TLRPC.NotificationSound s(SharedPreferences sharedPreferences, String str, String str2, String str3) {
        long j3 = sharedPreferences.getLong(str2, 0L);
        String string = sharedPreferences.getString(str3, "NoSound");
        if (j3 != 0) {
            TLRPC.TL_notificationSoundRingtone tL_notificationSoundRingtone = new TLRPC.TL_notificationSoundRingtone();
            tL_notificationSoundRingtone.f28178id = j3;
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

    public static at t(int i7) {
        at atVar;
        at atVar2 = f22562q0[i7];
        if (atVar2 == null) {
            synchronized (f22563r0[i7]) {
                try {
                    atVar = f22562q0[i7];
                    if (atVar == null) {
                        at[] atVarArr = f22562q0;
                        at atVar3 = new at(i7);
                        atVarArr[i7] = atVar3;
                        atVar = atVar3;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return atVar;
        }
        return atVar2;
    }

    public static String v(long j3, long j10, boolean z10) {
        String valueOf;
        if (z10) {
            if (j10 != 0) {
                Locale locale = Locale.US;
                return j3 + "_" + j10;
            }
            return String.valueOf(j3);
        }
        long j11 = (j10 << 12) + j3;
        a0.h hVar = f22564s0;
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
            ArrayList arrayList = this.f22565a;
            if (i7 >= arrayList.size()) {
                return false;
            }
            gj gjVar = (gj) arrayList.get(i7);
            long B0 = gj.B0(gjVar.f23817k);
            if (!gjVar.I) {
                TLRPC.Message message = gjVar.f23817k;
                if ((!message.mentioned || !(message.action instanceof TLRPC.TL_messageActionPinMessage)) && !m5.C(B0) && ((gjVar.f23817k.peer_id.channel_id == 0 || gjVar.A4()) && B0 != 489000 && B0 != 489001)) {
                    return true;
                }
            }
            i7++;
        }
    }

    public final boolean B(int i7) {
        if (i7 == 4) {
            return getAccountInstance().d().getBoolean("EnableReactionsMessages", true);
        }
        if (i7 == 5) {
            return getAccountInstance().d().getBoolean("EnableReactionsStories", true);
        }
        if (i7 == 3) {
            return getAccountInstance().d().getBoolean("EnableAllStories", true);
        }
        if (getAccountInstance().d().getInt(q(i7), 0) < getConnectionsManager().getCurrentTime()) {
            return true;
        }
        return false;
    }

    public final boolean C(long j3) {
        return D(j3, null, false, false);
    }

    public final boolean D(long r1, java.lang.Boolean r3, boolean r4, boolean r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.at.D(long, java.lang.Boolean, boolean, boolean):boolean");
    }

    public final void G(long j3, long j10, boolean z10) {
        boolean z11;
        if (z10) {
            t(this.currentAccount).H(j3, Integer.MAX_VALUE, j10);
            return;
        }
        boolean D = t(this.currentAccount).D(j3, null, false, false);
        int i7 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        if (i7 != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        SharedPreferences.Editor edit = np.s1(this.currentAccount).f25270e7.edit();
        if (D && !z11) {
            edit.remove("notify2_" + v(j3, j10, false));
        } else {
            edit.putInt("notify2_" + v(j3, j10, false), 0);
        }
        if (i7 == 0) {
            getMessagesStorage().E1(j3, 0L);
            TLRPC.Dialog dialog = (TLRPC.Dialog) getMessagesController().R.f(j3);
            if (dialog != null) {
                dialog.notify_settings = new TLRPC.TL_peerNotifySettings();
            }
        }
        edit.apply();
        c0(j3, j10, true);
    }

    public final void H(long j3, int i7, long j10) {
        boolean z10;
        long j11 = 0;
        if (j3 != 0) {
            SharedPreferences.Editor edit = np.s1(this.currentAccount).f25270e7.edit();
            int i10 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
            if (i10 != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            boolean D = t(this.currentAccount).D(j3, null, false, false);
            String v = v(j3, j10, false);
            if (i7 == Integer.MAX_VALUE) {
                if (!D && !z10) {
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
                vr.a0(this.currentAccount).E1(j3, j11);
                TLRPC.Dialog dialog = (TLRPC.Dialog) np.s1(this.currentAccount).R.f(j3);
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
        ArrayList arrayList3 = this.E;
        int min = Math.min(3, arrayList3.size());
        boolean z10 = false;
        int i7 = 0;
        for (int i10 = 0; i10 < min; i10++) {
            zs zsVar = (zs) arrayList3.get(i10);
            HashMap hashMap = zsVar.f28001c;
            long j3 = zsVar.f27999a;
            i7 += hashMap.size();
            z10 |= zsVar.d;
            TLRPC.User a22 = getMessagesController().a2(Long.valueOf(j3));
            if (a22 == null && (a22 = getMessagesStorage().k0(j3)) != null) {
                getMessagesController().X3(a22, true, false);
            }
            File file = null;
            if (a22 != null) {
                str = q10.p(a22);
                TLRPC.UserProfilePhoto userProfilePhoto = a22.photo;
                if (userProfilePhoto != null && (fileLocation = userProfilePhoto.photo_small) != null && fileLocation.volume_id != 0 && fileLocation.local_id != 0) {
                    w7 fileLoader = getFileLoader();
                    TLRPC.FileLocation fileLocation2 = a22.photo.photo_small;
                    fileLoader.getClass();
                    File J = w7.J(fileLocation2, null, true, true);
                    if (!J.exists()) {
                        if (a22.photo.photo_big != null) {
                            w7 fileLoader2 = getFileLoader();
                            TLRPC.FileLocation fileLocation3 = a22.photo.photo_big;
                            fileLoader2.getClass();
                            J = w7.J(fileLocation3, null, true, true);
                        } else {
                            J = null;
                        }
                        if (J != null && !J.exists()) {
                            J = null;
                        }
                    }
                    if (J != null) {
                        file = J;
                    }
                }
            } else {
                str = zsVar.f28000b;
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
        return new Pair(Integer.valueOf(i7), Boolean.valueOf(z10));
    }

    public final void J(LongSparseIntArray longSparseIntArray) {
        f22558l0.c(new ts(this, longSparseIntArray, new ArrayList(), 0));
    }

    public final void K(ArrayList arrayList, boolean z10, boolean z11, CountDownLatch countDownLatch) {
        boolean z12;
        boolean z13;
        Object valueOf;
        if (r2.f26198a) {
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
            int i7 = 0;
            while (i7 < arrayList.size()) {
                gj gjVar = (gj) arrayList.get(i7);
                if (gjVar != null && gjVar.f23817k != null && !gjVar.P3()) {
                    TLRPC.MessageAction messageAction = gjVar.f23817k.action;
                    if (messageAction instanceof TLRPC.TL_messageActionConferenceCall) {
                        TLRPC.TL_messageActionConferenceCall tL_messageActionConferenceCall = (TLRPC.TL_messageActionConferenceCall) messageAction;
                        if (!tL_messageActionConferenceCall.active && !tL_messageActionConferenceCall.missed && getConnectionsManager().getCurrentTime() - gjVar.f23817k.date < getMessagesController().f25302i3 / 1000) {
                            HashSet hashSet = new HashSet();
                            hashSet.add(Long.valueOf(gj.B0(gjVar.f23817k)));
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
                            VoIPGroupNotification.request(t0.f26600b, this.currentAccount, gj.B0(gjVar.f23817k), sb3.toString(), tL_messageActionConferenceCall.call_id, gjVar.e1(), tL_messageActionConferenceCall.video);
                            arrayList.remove(i7);
                            i7--;
                        } else {
                            VoIPGroupNotification.hide(t0.f26600b, this.currentAccount, gjVar.e1());
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
        f22558l0.c(new kn(this, arrayList, new ArrayList(0), z13, z12, countDownLatch));
    }

    public final void L(LongSparseIntArray longSparseIntArray, long j3, int i7, int i10, boolean z10) {
        f22558l0.c(new og(this, longSparseIntArray, new ArrayList(0), j3, i10, i7, z10));
    }

    public final void M(a0.h hVar, boolean z10) {
        f22558l0.c(new aa.c0(this, hVar, z10, new ArrayList(0), 22));
    }

    public final void N(long j3) {
        L(null, j3, 0, Integer.MAX_VALUE, false);
        LongSparseIntArray longSparseIntArray = new LongSparseIntArray();
        longSparseIntArray.put(j3, 0);
        J(longSparseIntArray);
    }

    public final String O(gj gjVar) {
        String str;
        TLRPC.Message message = gjVar.f23817k;
        if (message != null && (str = message.message) != null && message.entities != null) {
            StringBuilder sb2 = new StringBuilder(str);
            if (gjVar.K2) {
                return sb2.toString();
            }
            for (int i7 = 0; i7 < gjVar.f23817k.entities.size(); i7++) {
                if (gjVar.f23817k.entities.get(i7) instanceof TLRPC.TL_messageEntitySpoiler) {
                    TLRPC.TL_messageEntitySpoiler tL_messageEntitySpoiler = (TLRPC.TL_messageEntitySpoiler) gjVar.f23817k.entities.get(i7);
                    for (int i10 = 0; i10 < tL_messageEntitySpoiler.length; i10++) {
                        char[] cArr = this.f22578i0;
                        sb2.setCharAt(tL_messageEntitySpoiler.offset + i10, cArr[i10 % cArr.length]);
                    }
                }
            }
            return sb2.toString();
        }
        return null;
    }

    public final void P(e0.q qVar, long j3, long j10, String str, long[] jArr, int i7, Uri uri, int i10, boolean z10, boolean z11, boolean z12, int i11) {
        a8.b("resetNotificationSound");
        Uri uri2 = Settings.System.DEFAULT_RINGTONE_URI;
        if (uri2 != null && uri != null && !TextUtils.equals(uri2.toString(), uri.toString())) {
            SharedPreferences.Editor edit = getAccountInstance().d().edit();
            String uri3 = uri2.toString();
            String M0 = hd.M0(2131751599, null);
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
                edit.putString("sound_" + v(j3, j10, false), M0);
                edit.putString("sound_path_" + v(j3, j10, false), uri3);
                o(j3, j10);
            }
            edit.commit();
            qVar.f9951y = e0(j3, j10, str, jArr, i7, uri2, i10, z10, z11, z12, i11);
            m0.e(null, this.f22573e0, qVar.b());
        }
    }

    public final void Q(boolean z10) {
        int i7;
        os osVar = this.V;
        try {
            if (r2.f26198a) {
                a8.b("delay notification start, onlineReason = " + z10);
            }
            this.W.acquire(10000L);
            p5 p5Var = f22558l0;
            p5Var.a(osVar);
            if (z10) {
                i7 = 3000;
            } else {
                i7 = 1000;
            }
            p5Var.d(osVar, i7);
        } catch (Exception e10) {
            a8.g(e10, true);
            Z(this.L);
        }
    }

    public final void R() {
        try {
            Intent intent = new Intent(t0.f26600b, NotificationRepeat.class);
            intent.putExtra("currentAccount", this.currentAccount);
            PendingIntent service = PendingIntent.getService(t0.f26600b, 0, intent, 33554432);
            int i7 = getAccountInstance().d().getInt("repeat_messages", 60);
            if (i7 > 0 && this.K > 0) {
                this.f22571d0.set(2, SystemClock.elapsedRealtime() + (i7 * 60000), service);
            } else {
                this.f22571d0.cancel(service);
            }
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    public final void S(int i7) {
        if (this.O != i7) {
            a8.b("setBadge " + i7);
            this.O = i7;
            try {
                if (cs.f22931c == null && !cs.f22930b) {
                    cs.b();
                    cs.f22930b = true;
                }
                zr zrVar = cs.f22931c;
                if (zrVar != null) {
                    zrVar.a(i7);
                }
            } catch (Throwable unused) {
            }
        }
    }

    public final void T(long j3, int i7, long j10) {
        SharedPreferences.Editor edit = getAccountInstance().d().edit();
        TLRPC.Dialog dialog = (TLRPC.Dialog) np.s1(m10.f24934t0).R.f(j3);
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
            int currentTime = ConnectionsManager.getInstance(m10.f24934t0).getCurrentTime();
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
            t(m10.f24934t0).N(j3);
            vr.a0(m10.f24934t0).E1(j3, j11);
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
        getAccountInstance().d().edit().putInt(q(i7), i10).commit();
        b0(i7);
        vr messagesStorage = getMessagesStorage();
        messagesStorage.f27220a.c(new oq(messagesStorage, 26));
        m(i7);
    }

    public final void V(int i7) {
        f22558l0.c(new us(this, i7, 7));
    }

    public final void X(e0.q r90, java.lang.String r91, long r92, long r94, java.lang.String r96, long[] r97, int r98, android.net.Uri r99, int r100, boolean r101, boolean r102, boolean r103, int r104) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.at.X(e0.q, java.lang.String, long, long, java.lang.String, long[], int, android.net.Uri, int, boolean, boolean, boolean, int):void");
    }

    public final void Y() {
        f22558l0.c(new os(this, 3));
    }

    public final void Z(boolean r54) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.at.Z(boolean):void");
    }

    public final void a0(long j3, String str) {
        f22558l0.c(new fr(this, str, j3, 3));
    }

    public final void b0(int i7) {
        SharedPreferences d = getAccountInstance().d();
        if (i7 != 4 && i7 != 5) {
            TL_account.updateNotifySettings updatenotifysettings = new TL_account.updateNotifySettings();
            TLRPC.TL_inputPeerNotifySettings tL_inputPeerNotifySettings = new TLRPC.TL_inputPeerNotifySettings();
            updatenotifysettings.settings = tL_inputPeerNotifySettings;
            tL_inputPeerNotifySettings.flags = 5;
            if (i7 == 0) {
                updatenotifysettings.peer = new TLRPC.TL_inputNotifyChats();
                updatenotifysettings.settings.mute_until = d.getInt("EnableGroup2", 0);
                updatenotifysettings.settings.show_previews = d.getBoolean("EnablePreviewGroup", true);
                TLRPC.TL_inputPeerNotifySettings tL_inputPeerNotifySettings2 = updatenotifysettings.settings;
                tL_inputPeerNotifySettings2.flags |= 8;
                tL_inputPeerNotifySettings2.sound = s(d, "GroupSound", "GroupSoundDocId", "GroupSoundPath");
            } else if (i7 != 1 && i7 != 3) {
                updatenotifysettings.peer = new TLRPC.TL_inputNotifyBroadcasts();
                updatenotifysettings.settings.mute_until = d.getInt("EnableChannel2", 0);
                updatenotifysettings.settings.show_previews = d.getBoolean("EnablePreviewChannel", true);
                TLRPC.TL_inputPeerNotifySettings tL_inputPeerNotifySettings3 = updatenotifysettings.settings;
                tL_inputPeerNotifySettings3.flags |= 8;
                tL_inputPeerNotifySettings3.sound = s(d, "ChannelSound", "ChannelSoundDocId", "ChannelSoundPath");
            } else {
                updatenotifysettings.peer = new TLRPC.TL_inputNotifyUsers();
                updatenotifysettings.settings.mute_until = d.getInt("EnableAll2", 0);
                updatenotifysettings.settings.show_previews = d.getBoolean("EnablePreviewAll", true);
                TLRPC.TL_inputPeerNotifySettings tL_inputPeerNotifySettings4 = updatenotifysettings.settings;
                tL_inputPeerNotifySettings4.flags |= 128;
                tL_inputPeerNotifySettings4.stories_hide_sender = d.getBoolean("EnableHideStoriesSenders", false);
                if (d.contains("EnableAllStories")) {
                    TLRPC.TL_inputPeerNotifySettings tL_inputPeerNotifySettings5 = updatenotifysettings.settings;
                    tL_inputPeerNotifySettings5.flags |= 64;
                    tL_inputPeerNotifySettings5.stories_muted = !d.getBoolean("EnableAllStories", true);
                }
                TLRPC.TL_inputPeerNotifySettings tL_inputPeerNotifySettings6 = updatenotifysettings.settings;
                tL_inputPeerNotifySettings6.flags |= 8;
                tL_inputPeerNotifySettings6.sound = s(d, "GlobalSound", "GlobalSoundDocId", "GlobalSoundPath");
                TLRPC.TL_inputPeerNotifySettings tL_inputPeerNotifySettings7 = updatenotifysettings.settings;
                tL_inputPeerNotifySettings7.flags |= 256;
                tL_inputPeerNotifySettings7.stories_sound = s(d, "StoriesSound", "StoriesSoundDocId", "StoriesSoundPath");
            }
            getConnectionsManager().sendRequest(updatenotifysettings, new fi.m5(14));
            return;
        }
        TL_account.setReactionsNotifySettings setreactionsnotifysettings = new TL_account.setReactionsNotifySettings();
        setreactionsnotifysettings.settings = new TL_account.TL_reactionsNotifySettings();
        if (d.getBoolean("EnableReactionsMessages", true)) {
            setreactionsnotifysettings.settings.flags |= 1;
            if (d.getBoolean("EnableReactionsMessagesContacts", false)) {
                setreactionsnotifysettings.settings.messages_notify_from = new TL_account.TL_reactionNotificationsFromContacts();
            } else {
                setreactionsnotifysettings.settings.messages_notify_from = new TL_account.TL_reactionNotificationsFromAll();
            }
        }
        if (d.getBoolean("EnableReactionsStories", true)) {
            setreactionsnotifysettings.settings.flags |= 2;
            if (d.getBoolean("EnableReactionsStoriesContacts", false)) {
                setreactionsnotifysettings.settings.stories_notify_from = new TL_account.TL_reactionNotificationsFromContacts();
            } else {
                setreactionsnotifysettings.settings.stories_notify_from = new TL_account.TL_reactionNotificationsFromAll();
            }
        }
        setreactionsnotifysettings.settings.show_previews = d.getBoolean("EnableReactionsPreview", true);
        setreactionsnotifysettings.settings.sound = s(d, "ReactionSound", "ReactionSoundDocId", "ReactionSoundPath");
        getConnectionsManager().sendRequest(setreactionsnotifysettings, new fi.m5(14));
    }

    public final void c0(long j3, long j10, boolean z10) {
        int i7;
        if (z10) {
            getNotificationCenter().k(ns.f25492f0, new Object[0]);
        }
        if (m5.C(j3)) {
            return;
        }
        SharedPreferences d = getAccountInstance().d();
        TL_account.updateNotifySettings updatenotifysettings = new TL_account.updateNotifySettings();
        updatenotifysettings.settings = new TLRPC.TL_inputPeerNotifySettings();
        String v = v(j3, j10, false);
        TLRPC.TL_inputPeerNotifySettings tL_inputPeerNotifySettings = updatenotifysettings.settings;
        tL_inputPeerNotifySettings.flags |= 1;
        tL_inputPeerNotifySettings.show_previews = d.getBoolean("content_preview_" + v, true);
        TLRPC.TL_inputPeerNotifySettings tL_inputPeerNotifySettings2 = updatenotifysettings.settings;
        tL_inputPeerNotifySettings2.flags = tL_inputPeerNotifySettings2.flags | 2;
        tL_inputPeerNotifySettings2.silent = d.getBoolean("silent_" + v, false);
        if (d.contains("stories_" + v)) {
            TLRPC.TL_inputPeerNotifySettings tL_inputPeerNotifySettings3 = updatenotifysettings.settings;
            tL_inputPeerNotifySettings3.flags |= 64;
            tL_inputPeerNotifySettings3.stories_muted = !d.getBoolean("stories_" + v, true);
        }
        int i10 = d.getInt("notify2_" + v(j3, j10, false), -1);
        if (i10 != -1) {
            TLRPC.TL_inputPeerNotifySettings tL_inputPeerNotifySettings4 = updatenotifysettings.settings;
            tL_inputPeerNotifySettings4.flags |= 4;
            if (i10 == 3) {
                tL_inputPeerNotifySettings4.mute_until = d.getInt("notifyuntil_" + v(j3, j10, false), 0);
            } else {
                if (i10 != 2) {
                    i7 = 0;
                } else {
                    i7 = Integer.MAX_VALUE;
                }
                tL_inputPeerNotifySettings4.mute_until = i7;
            }
        }
        long j11 = d.getLong("sound_document_id_" + v(j3, j10, false), 0L);
        String string = d.getString("sound_path_" + v(j3, j10, false), null);
        TLRPC.TL_inputPeerNotifySettings tL_inputPeerNotifySettings5 = updatenotifysettings.settings;
        tL_inputPeerNotifySettings5.flags = tL_inputPeerNotifySettings5.flags | 8;
        if (j11 != 0) {
            TLRPC.TL_notificationSoundRingtone tL_notificationSoundRingtone = new TLRPC.TL_notificationSoundRingtone();
            tL_notificationSoundRingtone.f28178id = j11;
            updatenotifysettings.settings.sound = tL_notificationSoundRingtone;
        } else if (string != null) {
            if (string.equalsIgnoreCase("NoSound")) {
                updatenotifysettings.settings.sound = new TLRPC.TL_notificationSoundNone();
            } else {
                TLRPC.TL_notificationSoundLocal tL_notificationSoundLocal = new TLRPC.TL_notificationSoundLocal();
                tL_notificationSoundLocal.title = d.getString("sound_" + v(j3, j10, false), null);
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
            if (j3 < 0 && t3.Y(np.s1(i11).M0(Long.valueOf(-j3)))) {
                TLRPC.TL_inputNotifyCommunity tL_inputNotifyCommunity = new TLRPC.TL_inputNotifyCommunity();
                tL_inputNotifyCommunity.community = getMessagesController().h1(-j3);
                updatenotifysettings.peer = tL_inputNotifyCommunity;
            } else {
                TLRPC.TL_inputNotifyPeer tL_inputNotifyPeer = new TLRPC.TL_inputNotifyPeer();
                tL_inputNotifyPeer.peer = getMessagesController().j1(j3);
                updatenotifysettings.peer = tL_inputNotifyPeer;
            }
        }
        getConnectionsManager().sendRequest(updatenotifysettings, new fi.m5(14));
    }

    public final void d0() {
        int i7 = 0;
        long j3 = Long.MAX_VALUE;
        while (true) {
            ArrayList arrayList = this.E;
            if (i7 >= arrayList.size()) {
                break;
            }
            for (Pair pair : ((zs) arrayList.get(i7)).f28001c.values()) {
                j3 = Math.min(j3, ((Long) pair.second).longValue());
            }
            i7++;
        }
        p5 p5Var = f22558l0;
        os osVar = this.f22579j0;
        p5Var.a(osVar);
        long currentTimeMillis = j3 - System.currentTimeMillis();
        if (j3 != Long.MAX_VALUE) {
            p5Var.d(osVar, Math.max(0L, currentTimeMillis));
        }
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == ns.Y1) {
            f22558l0.c(new wq(11, this, (String) objArr[0]));
        }
    }

    public final java.lang.String e0(long r46, long r48, java.lang.String r50, long[] r51, int r52, android.net.Uri r53, int r54, boolean r55, boolean r56, boolean r57, int r58) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.at.e0(long, long, java.lang.String, long[], int, android.net.Uri, int, boolean, boolean, boolean, int):java.lang.String");
    }

    public final void h(gj gjVar) {
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.f22565a;
            if (i7 < arrayList.size()) {
                if (((gj) arrayList.get(i7)).e1() == gjVar.e1() && gj.B0(((gj) arrayList.get(i7)).f23817k) == gj.B0(gjVar.f23817k) && ((gj) arrayList.get(i7)).K == gjVar.K) {
                    return;
                }
                i7++;
            } else {
                arrayList.add(0, gjVar);
                return;
            }
        }
    }

    public final java.lang.String j(e0.q r18, long r19, java.lang.String r21, org.telegram.tgnet.TLRPC.User r22, org.telegram.tgnet.TLRPC.Chat r23, e0.j0 r24, boolean r25) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.at.j(e0.q, long, java.lang.String, org.telegram.tgnet.TLRPC$User, org.telegram.tgnet.TLRPC$Chat, e0.j0, boolean):java.lang.String");
    }

    public final void l(long j3, long j10) {
        if (Build.VERSION.SDK_INT < 26) {
            return;
        }
        f22558l0.c(new ps(this, j3, j10, 1));
    }

    public final void m(int i7) {
        if (Build.VERSION.SDK_INT < 26) {
            return;
        }
        f22558l0.c(new us(this, i7, 8));
    }

    public final void n(int i7) {
        String str;
        String str2;
        String str3;
        if (Build.VERSION.SDK_INT >= 26) {
            try {
                SharedPreferences d = getAccountInstance().d();
                SharedPreferences.Editor edit = d.edit();
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
                String string = d.getString(str, null);
                if (string != null) {
                    edit.remove(str).remove(str.concat("_s"));
                    try {
                        f22559n0.deleteNotificationChannel(string);
                    } catch (Exception e10) {
                        a8.g(e10, true);
                    }
                    if (r2.f26198a) {
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
                String string2 = d.getString(str2, null);
                if (string2 != null) {
                    edit.remove(str2).remove(str2.concat("_s"));
                    try {
                        f22559n0.deleteNotificationChannel(string2);
                    } catch (Exception e11) {
                        a8.g(e11, true);
                    }
                    if (r2.f26198a) {
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
                SharedPreferences d = getAccountInstance().d();
                SharedPreferences.Editor edit = d.edit();
                String str = "org.telegram.key" + j3;
                if (j10 != 0) {
                    str = str + ".topic" + j10;
                }
                String string = d.getString(str, null);
                if (string != null) {
                    edit.remove(str).remove(str + "_s");
                    try {
                        f22559n0.deleteNotificationChannel(string);
                    } catch (Exception e10) {
                        a8.g(e10, true);
                    }
                    if (r2.f26198a) {
                        a8.b("delete channel internal ".concat(string));
                    }
                }
                String str2 = "org.telegram.keyia" + j3;
                String string2 = d.getString(str2, null);
                if (string2 != null) {
                    edit.remove(str2).remove(str2 + "_s");
                    try {
                        f22559n0.deleteNotificationChannel(string2);
                    } catch (Exception e11) {
                        a8.g(e11, true);
                    }
                    if (r2.f26198a) {
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
            m0.b(this.f22573e0, null);
            this.f22565a.clear();
            this.f22569c.b();
            this.f22580n.b();
            for (int i7 = 0; i7 < hVar.m(); i7++) {
                if (!this.f22585y.contains(Long.valueOf(hVar.j(i7)))) {
                    m0.b(((Integer) hVar.n(i7)).intValue(), null);
                }
            }
            hVar.b();
            g0.h3(new c6(11));
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    public final int u(long j3, long j10) {
        int c10 = this.f22577h0.c(-1, j3, j10, "notify2_");
        if (c10 == 3 && this.f22577h0.c(0, j3, j10, "notifyuntil_") >= getConnectionsManager().getCurrentTime()) {
            return 2;
        }
        return c10;
    }

    public final java.lang.String w(org.telegram.messenger.gj r31, java.lang.String[] r32, boolean[] r33) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.at.w(org.telegram.messenger.gj, java.lang.String[], boolean[]):java.lang.String");
    }

    public final java.lang.String x(org.telegram.messenger.gj r31, boolean[] r32) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.at.x(org.telegram.messenger.gj, boolean[]):java.lang.String");
    }

    public final String y(TLRPC.Chat chat) {
        if (chat == null) {
            return null;
        }
        if (chat.monoforum) {
            return qg.c.i(this.currentAccount, chat, false);
        }
        return chat.title;
    }

    public final int z() {
        int i7 = 0;
        for (int i10 = 0; i10 < 4; i10++) {
            if (m10.i(i10).p() && (gz.Q0 || m10.f24934t0 == i10)) {
                at t6 = t(i10);
                if (t6.S) {
                    if (t6.U) {
                        if (t6.T) {
                            try {
                                ArrayList arrayList = new ArrayList(np.s1(i10).f25440y);
                                int size = arrayList.size();
                                for (int i11 = 0; i11 < size; i11++) {
                                    TLRPC.Dialog dialog = (TLRPC.Dialog) arrayList.get(i11);
                                    if (dialog != null && m5.z(dialog.f28055id)) {
                                        TLRPC.Chat M0 = getMessagesController().M0(Long.valueOf(-dialog.f28055id));
                                        if (!t3.r0(M0)) {
                                            if (t3.Y(M0)) {
                                            }
                                        }
                                    }
                                    if (dialog != null) {
                                        i7 += np.s1(i10).V0(dialog);
                                    }
                                }
                            } catch (Exception e10) {
                                a8.g(e10, true);
                            }
                        } else {
                            i7 += t6.J;
                        }
                    } else if (t6.T) {
                        try {
                            int size2 = np.s1(i10).f25440y.size();
                            for (int i12 = 0; i12 < size2; i12++) {
                                TLRPC.Dialog dialog2 = (TLRPC.Dialog) np.s1(i10).f25440y.get(i12);
                                if (m5.z(dialog2.f28055id)) {
                                    TLRPC.Chat M02 = getMessagesController().M0(Long.valueOf(-dialog2.f28055id));
                                    if (!t3.r0(M02)) {
                                        if (t3.Y(M02)) {
                                        }
                                    }
                                }
                                if (np.s1(i10).V0(dialog2) != 0) {
                                    i7++;
                                }
                            }
                        } catch (Exception e11) {
                            a8.g(e11, false);
                        }
                    } else {
                        i7 += t6.f22574f.m();
                    }
                }
            }
        }
        return i7;
    }
}
