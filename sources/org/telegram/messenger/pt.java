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
public final class pt extends f1 implements vs {
    public static String f17636j0;
    public static e0.k0 f17638l0;
    public static NotificationManager m0;
    public static AudioManager f17640o0;
    public static volatile pt[] f17641p0;
    public static final Object[] f17642q0;
    public static final a0.h f17643r0;
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
    public final bt U;
    public final PowerManager.WakeLock V;
    public long W;
    public SoundPool X;
    public int Y;
    public int Z;
    public final ArrayList f17644a;
    public boolean f17645a0;
    public final ArrayList f17646b;
    public boolean f17647b0;
    public final a0.h f17648c;
    public final AlarmManager f17649c0;
    public final a0.h d;
    public final int f17650d0;
    public final a0.h e;
    public final String f17651e0;
    public final a0.h f17652f;
    public final nh.i f17653f0;
    public final qt f17654g0;
    public final a0.h h;
    public final char[] f17655h0;
    public final bt f17656i0;
    public final a0.h f17657n;
    public final a0.h f17658r;
    public final HashSet f17659s;
    public final ArrayList f17660w;
    public ArrayList f17661x;
    public final HashSet f17662y;
    public static final r5 f17637k0 = new r5("notificationsQueue");
    public static final long f17639n0 = o5.F(1);

    static {
        f17638l0 = null;
        m0 = null;
        if (Build.VERSION.SDK_INT >= 26 && w0.f18945b != null) {
            f17638l0 = new e0.k0(w0.f18945b);
            m0 = (NotificationManager) w0.f18945b.getSystemService("notification");
            i();
        }
        f17640o0 = (AudioManager) w0.f18945b.getSystemService("audio");
        f17641p0 = new pt[4];
        f17642q0 = new Object[4];
        for (int i10 = 0; i10 < 4; i10++) {
            f17642q0[i10] = new Object();
        }
        f17643r0 = new a0.h();
    }

    public pt(int i10) {
        super(i10);
        Object valueOf;
        this.f17644a = new ArrayList();
        this.f17646b = new ArrayList();
        this.f17648c = new a0.h();
        this.d = new a0.h();
        this.e = new a0.h();
        this.f17652f = new a0.h();
        this.h = new a0.h();
        this.f17657n = new a0.h();
        this.f17658r = new a0.h();
        this.f17659s = new HashSet();
        this.f17660w = new ArrayList();
        this.f17661x = new ArrayList();
        this.f17662y = new HashSet();
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
        this.f17653f0 = new nh.i();
        this.f17655h0 = new char[]{10252, 10338, 10385, 10280, 10277, 10286, 10321};
        this.f17656i0 = new bt(this, 12);
        this.f17650d0 = this.currentAccount + 1;
        StringBuilder sb2 = new StringBuilder("messages");
        int i11 = this.currentAccount;
        if (i11 == 0) {
            valueOf = "";
        } else {
            valueOf = Integer.valueOf(i11);
        }
        sb2.append(valueOf);
        this.f17651e0 = sb2.toString();
        SharedPreferences c10 = getAccountInstance().c();
        this.M = c10.getBoolean("EnableInChatSound", true);
        this.R = c10.getBoolean("badgeNumber", true);
        this.S = c10.getBoolean("badgeNumberMuted", false);
        this.T = c10.getBoolean("badgeNumberMessages", true);
        f17638l0 = new e0.k0(w0.f18945b);
        m0 = (NotificationManager) w0.f18945b.getSystemService("notification");
        try {
            f17640o0 = (AudioManager) w0.f18945b.getSystemService("audio");
        } catch (Exception e) {
            f8.g(e, true);
        }
        try {
            this.f17649c0 = (AlarmManager) w0.f18945b.getSystemService("alarm");
        } catch (Exception e7) {
            f8.g(e7, true);
        }
        try {
            PowerManager.WakeLock newWakeLock = ((PowerManager) w0.f18945b.getSystemService("power")).newWakeLock(1, "telegram:notification_delay_lock");
            this.V = newWakeLock;
            newWakeLock.setReferenceCounted(false);
        } catch (Exception e10) {
            f8.g(e10, true);
        }
        this.U = new bt(this, 13);
        this.f17654g0 = new qt(this.currentAccount);
        i0.g3(new bt(this, 0));
    }

    public static boolean E(kj kjVar) {
        TLRPC.MessageAction messageAction;
        TLRPC.Message message = kjVar.f16690k;
        TLRPC.Peer peer = message.peer_id;
        if ((peer != null && peer.chat_id == 0 && peer.channel_id == 0 && ((messageAction = message.action) == null || (messageAction instanceof TLRPC.TL_messageActionEmpty))) || kjVar.J) {
            return true;
        }
        return false;
    }

    public static Bitmap F(ArrayList arrayList) {
        float f7;
        int i10;
        Bitmap bitmap;
        Paint paint;
        boolean z10;
        float f10;
        char c10;
        float size;
        float size2;
        float f11;
        float f12;
        float f13;
        float f14;
        Object obj;
        ArrayList arrayList2 = arrayList;
        if (Build.VERSION.SDK_INT < 28 || arrayList2.size() == 0) {
            return null;
        }
        int L = i0.L(64.0f);
        Bitmap createBitmap = Bitmap.createBitmap(L, L, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Matrix matrix = new Matrix();
        Paint paint2 = new Paint(3);
        boolean z11 = true;
        Paint paint3 = new Paint(1);
        Rect rect = new Rect();
        paint3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        if (arrayList2.size() == 1) {
            f7 = 1.0f;
        } else if (arrayList2.size() == 2) {
            f7 = 0.65f;
        } else {
            f7 = 0.5f;
        }
        int i11 = 0;
        TextPaint textPaint = null;
        while (i11 < arrayList2.size()) {
            float f15 = L;
            float f16 = (1.0f - f7) * f15;
            try {
                size = (f16 / arrayList2.size()) * ((arrayList2.size() - 1) - i11);
                size2 = i11 * (f16 / arrayList2.size());
                f11 = f15 * f7;
                f12 = f11 / 2.0f;
                i10 = L;
                f13 = size + f12;
                bitmap = createBitmap;
                f14 = size2 + f12;
                f10 = f7;
                try {
                    canvas.drawCircle(f13, f14, i0.L(2.0f) + f12, paint3);
                    obj = arrayList2.get(i11);
                    paint = paint3;
                } catch (Throwable unused) {
                    paint = paint3;
                }
            } catch (Throwable unused2) {
                i10 = L;
                bitmap = createBitmap;
                paint = paint3;
                z10 = z11;
                f10 = f7;
            }
            if (obj instanceof File) {
                String absolutePath = ((File) arrayList2.get(i11)).getAbsolutePath();
                BitmapFactory.Options options = new BitmapFactory.Options();
                z10 = true;
                try {
                    options.inJustDecodeBounds = true;
                    BitmapFactory.decodeFile(absolutePath, options);
                    int i12 = (int) f11;
                    options.inSampleSize = vh.n5.d(options, i12, i12);
                    try {
                        options.inJustDecodeBounds = false;
                        options.inDither = true;
                        Bitmap decodeFile = BitmapFactory.decodeFile(absolutePath, options);
                        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                        BitmapShader bitmapShader = new BitmapShader(decodeFile, tileMode, tileMode);
                        matrix.reset();
                        matrix.postScale(f11 / decodeFile.getWidth(), f11 / decodeFile.getHeight());
                        matrix.postTranslate(size, size2);
                        bitmapShader.setLocalMatrix(matrix);
                        paint2.setShader(bitmapShader);
                        canvas.drawCircle(f13, f14, f12, paint2);
                        decodeFile.recycle();
                    } catch (Throwable unused3) {
                        c10 = 2;
                    }
                } catch (Throwable unused4) {
                    c10 = 2;
                    i11++;
                    z11 = z10;
                    L = i10;
                    createBitmap = bitmap;
                    f7 = f10;
                    paint3 = paint;
                    arrayList2 = arrayList;
                }
            } else if (obj instanceof TLRPC.User) {
                TLRPC.User user = (TLRPC.User) obj;
                c10 = 2;
                try {
                    paint2.setShader(new LinearGradient(size, size2, size, size2 + f11, new int[]{org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f21155p8[org.telegram.ui.Components.r8.e(user.f19943id)], false), org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f21172q8[org.telegram.ui.Components.r8.e(user.f19943id)], false)}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
                    canvas.drawCircle(f13, f14, f12, paint2);
                    if (textPaint == null) {
                        try {
                            z10 = true;
                            try {
                                TextPaint textPaint2 = new TextPaint(1);
                                try {
                                    textPaint2.setTypeface(i0.o());
                                    textPaint2.setTextSize(f15 * 0.25f);
                                    textPaint2.setColor(-1);
                                    textPaint = textPaint2;
                                } catch (Throwable unused5) {
                                    textPaint = textPaint2;
                                    i11++;
                                    z11 = z10;
                                    L = i10;
                                    createBitmap = bitmap;
                                    f7 = f10;
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
                    org.telegram.ui.Components.r8.a(user.first_name, user.last_name, null, sb2);
                    String sb3 = sb2.toString();
                    try {
                        textPaint.getTextBounds(sb3, 0, sb3.length(), rect);
                        canvas.drawText(sb3, (f13 - (rect.width() / 2.0f)) - rect.left, (f14 - (rect.height() / 2.0f)) - rect.top, textPaint);
                    } catch (Throwable unused8) {
                    }
                } catch (Throwable unused9) {
                }
                i11++;
                z11 = z10;
                L = i10;
                createBitmap = bitmap;
                f7 = f10;
                paint3 = paint;
                arrayList2 = arrayList;
            }
            c10 = 2;
            z10 = true;
            i11++;
            z11 = z10;
            L = i10;
            createBitmap = bitmap;
            f7 = f10;
            paint3 = paint;
            arrayList2 = arrayList;
        }
        return createBitmap;
    }

    public static void W(Notification notification, e0.r rVar, boolean z10) {
        if (z10) {
            rVar.f6077y = f17636j0;
        } else {
            rVar.f6077y = notification.getChannelId();
        }
    }

    public static void a(pt ptVar, String str, long j10) {
        boolean z10;
        String L0;
        if (ptVar.getUserConfig().p()) {
            if (uz.Q0 || ptVar.currentAccount == e20.f15506s0) {
                try {
                    String str2 = "wallet_tonconnect_" + ptVar.currentAccount;
                    if (Build.VERSION.SDK_INT >= 26) {
                        m0.createNotificationChannel(new NotificationChannel(str2, "TON Connect", 3));
                    }
                    if (!i0.p2(false) && !uz.C && ptVar.getAccountInstance().c().getBoolean("EnablePreviewAll", true)) {
                        z10 = false;
                        if (!TextUtils.isEmpty(str) && !z10) {
                            L0 = dd.a0(null, null, 2131747941, str);
                            Intent intent = new Intent(w0.f18945b, LaunchActivity.class);
                            intent.setAction("android.intent.action.VIEW");
                            intent.setData(Uri.parse("tg://resolve?domain=sendgrams"));
                            intent.putExtra("currentAccount", ptVar.currentAccount);
                            intent.addFlags(67108864);
                            PendingIntent activity = PendingIntent.getActivity(w0.f18945b, ptVar.currentAccount, intent, 201326592);
                            e0.r rVar = new e0.r(w0.f18945b, str2);
                            rVar.F.icon = 2131232451;
                            rVar.e = e0.r.d(dd.L0(2131689472, null));
                            rVar.f6060f = e0.r.d(L0);
                            e0.m mVar = new e0.m(false);
                            mVar.f6049f = e0.r.d(L0);
                            rVar.n(mVar);
                            rVar.f6074u = "event";
                            rVar.f6076x = 0;
                            rVar.F.when = j10;
                            rVar.h(16, true);
                            rVar.f6061g = activity;
                            f17638l0.e("wallet_tonconnect", ptVar.currentAccount, rVar.b());
                        }
                        L0 = dd.L0(2131747942, null);
                        Intent intent2 = new Intent(w0.f18945b, LaunchActivity.class);
                        intent2.setAction("android.intent.action.VIEW");
                        intent2.setData(Uri.parse("tg://resolve?domain=sendgrams"));
                        intent2.putExtra("currentAccount", ptVar.currentAccount);
                        intent2.addFlags(67108864);
                        PendingIntent activity2 = PendingIntent.getActivity(w0.f18945b, ptVar.currentAccount, intent2, 201326592);
                        e0.r rVar2 = new e0.r(w0.f18945b, str2);
                        rVar2.F.icon = 2131232451;
                        rVar2.e = e0.r.d(dd.L0(2131689472, null));
                        rVar2.f6060f = e0.r.d(L0);
                        e0.m mVar2 = new e0.m(false);
                        mVar2.f6049f = e0.r.d(L0);
                        rVar2.n(mVar2);
                        rVar2.f6074u = "event";
                        rVar2.f6076x = 0;
                        rVar2.F.when = j10;
                        rVar2.h(16, true);
                        rVar2.f6061g = activity2;
                        f17638l0.e("wallet_tonconnect", ptVar.currentAccount, rVar2.b());
                    }
                    z10 = true;
                    if (!TextUtils.isEmpty(str)) {
                        L0 = dd.a0(null, null, 2131747941, str);
                        Intent intent22 = new Intent(w0.f18945b, LaunchActivity.class);
                        intent22.setAction("android.intent.action.VIEW");
                        intent22.setData(Uri.parse("tg://resolve?domain=sendgrams"));
                        intent22.putExtra("currentAccount", ptVar.currentAccount);
                        intent22.addFlags(67108864);
                        PendingIntent activity22 = PendingIntent.getActivity(w0.f18945b, ptVar.currentAccount, intent22, 201326592);
                        e0.r rVar22 = new e0.r(w0.f18945b, str2);
                        rVar22.F.icon = 2131232451;
                        rVar22.e = e0.r.d(dd.L0(2131689472, null));
                        rVar22.f6060f = e0.r.d(L0);
                        e0.m mVar22 = new e0.m(false);
                        mVar22.f6049f = e0.r.d(L0);
                        rVar22.n(mVar22);
                        rVar22.f6074u = "event";
                        rVar22.f6076x = 0;
                        rVar22.F.when = j10;
                        rVar22.h(16, true);
                        rVar22.f6061g = activity22;
                        f17638l0.e("wallet_tonconnect", ptVar.currentAccount, rVar22.b());
                    }
                    L0 = dd.L0(2131747942, null);
                    Intent intent222 = new Intent(w0.f18945b, LaunchActivity.class);
                    intent222.setAction("android.intent.action.VIEW");
                    intent222.setData(Uri.parse("tg://resolve?domain=sendgrams"));
                    intent222.putExtra("currentAccount", ptVar.currentAccount);
                    intent222.addFlags(67108864);
                    PendingIntent activity222 = PendingIntent.getActivity(w0.f18945b, ptVar.currentAccount, intent222, 201326592);
                    e0.r rVar222 = new e0.r(w0.f18945b, str2);
                    rVar222.F.icon = 2131232451;
                    rVar222.e = e0.r.d(dd.L0(2131689472, null));
                    rVar222.f6060f = e0.r.d(L0);
                    e0.m mVar222 = new e0.m(false);
                    mVar222.f6049f = e0.r.d(L0);
                    rVar222.n(mVar222);
                    rVar222.f6074u = "event";
                    rVar222.f6076x = 0;
                    rVar222.F.when = j10;
                    rVar222.h(16, true);
                    rVar222.f6061g = activity222;
                    f17638l0.e("wallet_tonconnect", ptVar.currentAccount, rVar222.b());
                } catch (Exception e) {
                    f8.g(e, true);
                }
            }
        }
    }

    public static void b(pt ptVar) {
        try {
            SharedPreferences c10 = ptVar.getAccountInstance().c();
            Map<String, ?> all = c10.getAll();
            SharedPreferences.Editor edit = c10.edit();
            for (Map.Entry<String, ?> entry : all.entrySet()) {
                String key = entry.getKey();
                if (key.startsWith("org.telegram.key")) {
                    if (!key.endsWith("_s")) {
                        String str = (String) entry.getValue();
                        m0.deleteNotificationChannel(str);
                        if (v2.f18578a) {
                            f8.b("delete all channel " + str);
                        }
                    }
                    edit.remove(key);
                }
            }
            edit.commit();
        } catch (Exception e) {
            f8.g(e, true);
        }
    }

    public static void c(pt ptVar) {
        PowerManager.WakeLock wakeLock = ptVar.V;
        f17638l0.b(ptVar.currentAccount, "wallet_tonconnect");
        ptVar.F = 0L;
        ptVar.G = 0L;
        ptVar.I = 0;
        ptVar.J = 0;
        ptVar.f17644a.clear();
        ptVar.f17648c.b();
        ptVar.d.b();
        ptVar.f17652f.b();
        ptVar.h.b();
        ptVar.f17657n.b();
        ptVar.f17662y.clear();
        ptVar.f17646b.clear();
        ptVar.K = false;
        ptVar.N = 0;
        try {
            if (wakeLock.isHeld()) {
                wakeLock.release();
            }
        } catch (Exception e) {
            f8.g(e, true);
        }
        ptVar.p();
        ptVar.S(ptVar.z());
        SharedPreferences.Editor edit = ptVar.getAccountInstance().c().edit();
        edit.clear();
        edit.commit();
        if (Build.VERSION.SDK_INT >= 26) {
            try {
                m0.deleteNotificationChannelGroup("channels" + ptVar.currentAccount);
                m0.deleteNotificationChannelGroup("groups" + ptVar.currentAccount);
                m0.deleteNotificationChannelGroup("private" + ptVar.currentAccount);
                m0.deleteNotificationChannelGroup("stories" + ptVar.currentAccount);
                m0.deleteNotificationChannelGroup("other" + ptVar.currentAccount);
                String str = ptVar.currentAccount + "channel";
                List<NotificationChannel> notificationChannels = m0.getNotificationChannels();
                int size = notificationChannels.size();
                for (int i10 = 0; i10 < size; i10++) {
                    String id2 = notificationChannels.get(i10).getId();
                    if (id2.startsWith(str)) {
                        try {
                            m0.deleteNotificationChannel(id2);
                        } catch (Exception e7) {
                            f8.g(e7, true);
                        }
                        if (v2.f18578a) {
                            f8.b("delete channel cleanup " + id2);
                        }
                    }
                }
            } catch (Throwable th2) {
                f8.g(th2, true);
            }
        }
    }

    public static void e(org.telegram.messenger.pt r44, java.util.ArrayList r45, java.util.ArrayList r46, boolean r47, boolean r48, java.util.concurrent.CountDownLatch r49) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.pt.e(org.telegram.messenger.pt, java.util.ArrayList, java.util.ArrayList, boolean, boolean, java.util.concurrent.CountDownLatch):void");
    }

    public static void f(pt ptVar, ArrayList arrayList, a0.h hVar, ArrayList arrayList2, Collection collection) {
        long j10;
        long j11;
        boolean z10;
        int i10;
        int i11;
        int i12;
        int intValue;
        long j12;
        boolean z11;
        int i13;
        TLRPC.MessageFwdHeader messageFwdHeader;
        long j13;
        long j14;
        TLRPC.Message message;
        long j15;
        TLRPC.Message message2;
        SparseArray sparseArray;
        kj kjVar;
        long j16;
        boolean z12;
        boolean z13;
        SparseArray sparseArray2;
        int intValue2;
        ptVar.f17652f.b();
        ptVar.f17644a.clear();
        ptVar.f17648c.b();
        ptVar.D.clear();
        ptVar.E.b();
        boolean z14 = false;
        ptVar.I = 0;
        ptVar.J = 0;
        ptVar.getAccountInstance().c();
        a0.h hVar2 = new a0.h();
        for (int i14 = 0; i14 < arrayList.size(); i14++) {
            TLRPC.Message message3 = (TLRPC.Message) arrayList.get(i14);
            if (message3 != null && ((messageFwdHeader = message3.fwd_from) == null || !messageFwdHeader.imported)) {
                TLRPC.MessageAction messageAction = message3.action;
                if (!(messageAction instanceof TLRPC.TL_messageActionSetMessagesTTL) && (!message3.silent || (!(messageAction instanceof TLRPC.TL_messageActionContactSignUp) && !(messageAction instanceof TLRPC.TL_messageActionUserJoined)))) {
                    long j17 = message3.peer_id.channel_id;
                    if (j17 != 0) {
                        j13 = -j17;
                    } else {
                        j13 = 0;
                    }
                    SparseArray sparseArray3 = (SparseArray) ptVar.f17648c.f(j13);
                    if (sparseArray3 == null || sparseArray3.indexOfKey(message3.f19815id) < 0) {
                        kj kjVar2 = new kj(ptVar.currentAccount, message3, false, false);
                        if (E(kjVar2)) {
                            ptVar.J++;
                        }
                        long B0 = kj.B0(kjVar2.f16690k);
                        long c22 = kj.c2(ptVar.currentAccount, kjVar2.f16690k, ptVar.getMessagesController().t2(kjVar2), false);
                        if (kjVar2.f16690k.mentioned) {
                            message = message3;
                            j15 = kjVar2.Z0();
                            j14 = j13;
                        } else {
                            j14 = j13;
                            message = message3;
                            j15 = B0;
                        }
                        int h = hVar2.h(j15);
                        if (h >= 0 && c22 == 0) {
                            z13 = ((Boolean) hVar2.n(h)).booleanValue();
                            message2 = message;
                            sparseArray = sparseArray3;
                            kjVar = kjVar2;
                            j16 = j14;
                        } else {
                            int u10 = ptVar.u(j15, c22);
                            if (u10 == -1) {
                                message2 = message;
                                sparseArray = sparseArray3;
                                j16 = j14;
                                z13 = ptVar.D(j15, null, kjVar2.I, kjVar2.J);
                                kjVar = kjVar2;
                            } else {
                                message2 = message;
                                sparseArray = sparseArray3;
                                kjVar = kjVar2;
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
                        if (z13 && (j15 != ptVar.F || !w0.f18951w)) {
                            if (sparseArray == null) {
                                sparseArray2 = new SparseArray();
                                ptVar.f17648c.k(sparseArray2, j16);
                            } else {
                                sparseArray2 = sparseArray;
                            }
                            sparseArray2.put(message2.f19815id, kjVar);
                            ptVar.h(kjVar);
                            if (B0 != j15) {
                                Integer num = (Integer) ptVar.f17658r.f(B0);
                                a0.h hVar3 = ptVar.f17658r;
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
        int i15 = 0;
        while (i15 < hVar.m()) {
            long j19 = hVar.j(i15);
            int h10 = hVar2.h(j19);
            if (h10 >= 0) {
                z11 = ((Boolean) hVar2.n(h10)).booleanValue();
            } else {
                int u11 = ptVar.u(j19, j18);
                if (u11 == -1) {
                    z11 = ptVar.D(j19, null, false, false);
                } else if (u11 != 2) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                hVar2.k(Boolean.valueOf(z11), j19);
            }
            if (z11) {
                Integer num2 = (Integer) hVar.n(i15);
                int intValue3 = num2.intValue();
                ptVar.f17652f.k(num2, j19);
                if (!ptVar.getMessagesController().o2(j19)) {
                    if (ptVar.getMessagesController().s2(j19)) {
                        int i16 = ptVar.I;
                        if (intValue3 > 0) {
                            i13 = 1;
                        } else {
                            i13 = 0;
                        }
                        ptVar.I = i16 + i13;
                    } else {
                        ptVar.I += intValue3;
                    }
                }
            }
            i15++;
            j18 = 0;
        }
        for (int i17 = 0; i17 < arrayList2.size(); i17++) {
            kj kjVar3 = (kj) arrayList2.get(i17);
            int f12 = kjVar3.f1();
            if (ptVar.f17648c.h(f12) < 0) {
                if (E(kjVar3)) {
                    ptVar.J++;
                }
                long B02 = kj.B0(kjVar3.f16690k);
                long c23 = kj.c2(ptVar.currentAccount, kjVar3.f16690k, ptVar.getMessagesController().t2(kjVar3), false);
                TLRPC.Message message4 = kjVar3.f16690k;
                long j20 = message4.random_id;
                if (message4.mentioned) {
                    j10 = kjVar3.Z0();
                } else {
                    j10 = B02;
                }
                int h11 = hVar2.h(j10);
                if (h11 >= 0 && c23 == 0) {
                    long j21 = j10;
                    z10 = ((Boolean) hVar2.n(h11)).booleanValue();
                    j11 = j21;
                } else {
                    int u12 = ptVar.u(j10, c23);
                    if (u12 == -1) {
                        j11 = j10;
                        z10 = ptVar.D(j11, null, kjVar3.I, kjVar3.J);
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
                if (z10 && (j11 != ptVar.F || !w0.f18951w)) {
                    if (f12 != 0) {
                        if (kjVar3.J) {
                            j12 = kj.B0(kjVar3.f16690k);
                        } else {
                            long j22 = kjVar3.f16690k.peer_id.channel_id;
                            if (j22 != 0) {
                                j12 = -j22;
                            } else {
                                j12 = 0;
                            }
                        }
                        SparseArray sparseArray4 = (SparseArray) ptVar.f17648c.f(j12);
                        if (sparseArray4 == null) {
                            sparseArray4 = new SparseArray();
                            ptVar.f17648c.k(sparseArray4, j12);
                        }
                        sparseArray4.put(f12, kjVar3);
                    } else if (j20 != 0) {
                        ptVar.d.k(kjVar3, j20);
                    }
                    ptVar.h(kjVar3);
                    if (B02 != j11) {
                        Integer num3 = (Integer) ptVar.f17658r.f(B02);
                        a0.h hVar4 = ptVar.f17658r;
                        if (num3 == null) {
                            intValue = 1;
                        } else {
                            intValue = num3.intValue() + 1;
                        }
                        hVar4.k(Integer.valueOf(intValue), B02);
                    }
                    Integer num4 = (Integer) ptVar.f17652f.f(j11);
                    if (num4 != null) {
                        i10 = num4.intValue() + 1;
                    } else {
                        i10 = 1;
                    }
                    if (!ptVar.getMessagesController().o2(j11)) {
                        if (ptVar.getMessagesController().s2(j11)) {
                            if (num4 != null) {
                                int i18 = ptVar.I;
                                if (num4.intValue() > 0) {
                                    i12 = 1;
                                } else {
                                    i12 = 0;
                                }
                                ptVar.I = i18 - i12;
                            }
                            int i19 = ptVar.I;
                            if (i10 > 0) {
                                i11 = 1;
                            } else {
                                i11 = 0;
                            }
                            ptVar.I = i19 + i11;
                        } else {
                            if (num4 != null) {
                                ptVar.I -= num4.intValue();
                            }
                            ptVar.I += i10;
                        }
                    }
                    ptVar.f17652f.k(Integer.valueOf(i10), j11);
                }
            }
        }
        if (collection != null) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                ot otVar = (ot) it.next();
                long j23 = otVar.f17509a;
                ot otVar2 = (ot) ptVar.E.f(j23);
                if (otVar2 != null) {
                    otVar2.f17511c.putAll(otVar.f17511c);
                } else {
                    ptVar.D.add(otVar);
                    ptVar.E.k(otVar, j23);
                }
            }
            Collections.sort(ptVar.D, Comparator$CC.comparingLong(new vk(2)));
        }
        i0.g3(new ht(ptVar, ptVar.f17652f.m(), 4));
        if (SystemClock.elapsedRealtime() / 1000 < 60) {
            z14 = true;
        }
        ptVar.Z(z14);
        if (ptVar.R) {
            ptVar.S(ptVar.z());
        }
    }

    public static int g(java.util.ArrayList r3, org.telegram.messenger.kj r4, long r5, boolean r7, android.content.SharedPreferences r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.pt.g(java.util.ArrayList, org.telegram.messenger.kj, long, boolean, android.content.SharedPreferences):int");
    }

    public static void i() {
        SharedPreferences sharedPreferences;
        if (Build.VERSION.SDK_INT >= 26) {
            if (f17636j0 == null) {
                sharedPreferences = w0.f18945b.getSharedPreferences("Notifications", 0);
                f17636j0 = sharedPreferences.getString("OtherKey", "Other3");
            } else {
                sharedPreferences = null;
            }
            NotificationChannel notificationChannel = m0.getNotificationChannel(f17636j0);
            if (notificationChannel != null && notificationChannel.getImportance() == 0) {
                try {
                    m0.deleteNotificationChannel(f17636j0);
                } catch (Exception e) {
                    f8.g(e, true);
                }
                f17636j0 = null;
                notificationChannel = null;
            }
            if (f17636j0 == null) {
                if (sharedPreferences == null) {
                    sharedPreferences = w0.f18945b.getSharedPreferences("Notifications", 0);
                }
                f17636j0 = "Other" + Utilities.f14520b.nextLong();
                sharedPreferences.edit().putString("OtherKey", f17636j0).commit();
            }
            if (notificationChannel == null) {
                NotificationChannel notificationChannel2 = new NotificationChannel(f17636j0, "Internal notifications", 3);
                notificationChannel2.enableLights(false);
                notificationChannel2.enableVibration(false);
                notificationChannel2.setSound(null, null);
                try {
                    m0.createNotificationChannel(notificationChannel2);
                } catch (Exception e7) {
                    f8.g(e7, true);
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

    public static String q(int i10) {
        if (i10 == 0) {
            return "EnableGroup2";
        }
        if (i10 == 1) {
            return "EnableAll2";
        }
        return "EnableChannel2";
    }

    public static String r(kj kjVar, String str) {
        boolean z10;
        int i10;
        TLRPC.Message message = kjVar.f16690k;
        TLRPC.TL_messageActionGramTransfer tL_messageActionGramTransfer = (TLRPC.TL_messageActionGramTransfer) message.action;
        boolean A = i20.A(kj.B0(message));
        if (!tL_messageActionGramTransfer.comment_encrypted && !TextUtils.isEmpty(tL_messageActionGramTransfer.comment)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (A) {
            if (z10) {
                i10 = 2131748051;
            } else {
                i10 = 2131748052;
            }
        } else if (z10) {
            i10 = 2131748053;
        } else {
            i10 = 2131748054;
        }
        return dd.a0(null, null, i10, str, org.telegram.ui.Wallet.k0.s(tL_messageActionGramTransfer.amount, false), tL_messageActionGramTransfer.comment);
    }

    public static TLRPC.NotificationSound s(SharedPreferences sharedPreferences, String str, String str2, String str3) {
        long j10 = sharedPreferences.getLong(str2, 0L);
        String string = sharedPreferences.getString(str3, "NoSound");
        if (j10 != 0) {
            TLRPC.TL_notificationSoundRingtone tL_notificationSoundRingtone = new TLRPC.TL_notificationSoundRingtone();
            tL_notificationSoundRingtone.f19921id = j10;
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

    public static pt t(int i10) {
        pt ptVar;
        pt ptVar2 = f17641p0[i10];
        if (ptVar2 == null) {
            synchronized (f17642q0[i10]) {
                try {
                    ptVar = f17641p0[i10];
                    if (ptVar == null) {
                        pt[] ptVarArr = f17641p0;
                        pt ptVar3 = new pt(i10);
                        ptVarArr[i10] = ptVar3;
                        ptVar = ptVar3;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return ptVar;
        }
        return ptVar2;
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
        a0.h hVar = f17643r0;
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
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f17644a;
            if (i10 >= arrayList.size()) {
                return false;
            }
            kj kjVar = (kj) arrayList.get(i10);
            long B0 = kj.B0(kjVar.f16690k);
            if (!kjVar.I) {
                TLRPC.Message message = kjVar.f16690k;
                if ((!message.mentioned || !(message.action instanceof TLRPC.TL_messageActionPinMessage)) && !o5.C(B0) && ((kjVar.f16690k.peer_id.channel_id == 0 || kjVar.A4()) && B0 != 489000 && B0 != 489001)) {
                    return true;
                }
            }
            i10++;
        }
    }

    public final boolean B(int i10) {
        if (i10 == 4) {
            return getAccountInstance().c().getBoolean("EnableReactionsMessages", true);
        }
        if (i10 == 5) {
            return getAccountInstance().c().getBoolean("EnableReactionsStories", true);
        }
        if (i10 == 3) {
            return getAccountInstance().c().getBoolean("EnableAllStories", true);
        }
        if (getAccountInstance().c().getInt(q(i10), 0) < getConnectionsManager().getCurrentTime()) {
            return true;
        }
        return false;
    }

    public final boolean C(long j10) {
        return D(j10, null, false, false);
    }

    public final boolean D(long r1, java.lang.Boolean r3, boolean r4, boolean r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.pt.D(long, java.lang.Boolean, boolean, boolean):boolean");
    }

    public final void G(long j10, long j11, boolean z10) {
        boolean z11;
        if (z10) {
            t(this.currentAccount).H(j10, Integer.MAX_VALUE, j11);
            return;
        }
        boolean D = t(this.currentAccount).D(j10, null, false, false);
        int i10 = (j11 > 0L ? 1 : (j11 == 0L ? 0 : -1));
        if (i10 != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        SharedPreferences.Editor edit = wp.r1(this.currentAccount).e7.edit();
        if (D && !z11) {
            edit.remove("notify2_" + v(j10, j11, false));
        } else {
            edit.putInt("notify2_" + v(j10, j11, false), 0);
        }
        if (i10 == 0) {
            getMessagesStorage().E1(j10, 0L);
            TLRPC.Dialog dialog = (TLRPC.Dialog) getMessagesController().Q.f(j10);
            if (dialog != null) {
                dialog.notify_settings = new TLRPC.TL_peerNotifySettings();
            }
        }
        edit.apply();
        c0(j10, j11, true);
    }

    public final void H(long j10, int i10, long j11) {
        boolean z10;
        long j12 = 0;
        if (j10 != 0) {
            SharedPreferences.Editor edit = wp.r1(this.currentAccount).e7.edit();
            int i11 = (j11 > 0L ? 1 : (j11 == 0L ? 0 : -1));
            if (i11 != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            boolean D = t(this.currentAccount).D(j10, null, false, false);
            String v = v(j10, j11, false);
            if (i10 == Integer.MAX_VALUE) {
                if (!D && !z10) {
                    edit.remove("notify2_" + v);
                } else {
                    edit.putInt("notify2_" + v, 2);
                    j12 = 1L;
                }
            } else {
                edit.putInt("notify2_" + v, 3);
                edit.putInt("notifyuntil_" + v, getConnectionsManager().getCurrentTime() + i10);
                j12 = (((long) i10) << 32) | 1;
            }
            edit.apply();
            if (i11 == 0) {
                t(this.currentAccount).N(j10);
                is.a0(this.currentAccount).E1(j10, j12);
                TLRPC.Dialog dialog = (TLRPC.Dialog) wp.r1(this.currentAccount).Q.f(j10);
                if (dialog != null) {
                    TLRPC.TL_peerNotifySettings tL_peerNotifySettings = new TLRPC.TL_peerNotifySettings();
                    dialog.notify_settings = tL_peerNotifySettings;
                    if (i10 != Integer.MAX_VALUE || D) {
                        tL_peerNotifySettings.mute_until = i10;
                    }
                }
            }
            t(this.currentAccount).c0(j10, j11, true);
        }
    }

    public final Pair I(ArrayList arrayList, ArrayList arrayList2) {
        String str;
        TLRPC.FileLocation fileLocation;
        ArrayList arrayList3 = this.D;
        int min = Math.min(3, arrayList3.size());
        boolean z10 = false;
        int i10 = 0;
        for (int i11 = 0; i11 < min; i11++) {
            ot otVar = (ot) arrayList3.get(i11);
            HashMap hashMap = otVar.f17511c;
            long j10 = otVar.f17509a;
            i10 += hashMap.size();
            z10 |= otVar.d;
            TLRPC.User Z1 = getMessagesController().Z1(Long.valueOf(j10));
            if (Z1 == null && (Z1 = getMessagesStorage().k0(j10)) != null) {
                getMessagesController().U3(Z1, true, false);
            }
            File file = null;
            if (Z1 != null) {
                str = i20.p(Z1);
                TLRPC.UserProfilePhoto userProfilePhoto = Z1.photo;
                if (userProfilePhoto != null && (fileLocation = userProfilePhoto.photo_small) != null && fileLocation.volume_id != 0 && fileLocation.local_id != 0) {
                    b8 fileLoader = getFileLoader();
                    TLRPC.FileLocation fileLocation2 = Z1.photo.photo_small;
                    fileLoader.getClass();
                    File K = b8.K(fileLocation2, null, true, true);
                    if (!K.exists()) {
                        if (Z1.photo.photo_big != null) {
                            b8 fileLoader2 = getFileLoader();
                            TLRPC.FileLocation fileLocation3 = Z1.photo.photo_big;
                            fileLoader2.getClass();
                            K = b8.K(fileLocation3, null, true, true);
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
                str = otVar.f17510b;
                if (str == null) {
                }
            }
            if (str.length() > 50) {
                str = str.substring(0, 25) + "…";
            }
            arrayList.add(str);
            if (file == null && Z1 != null) {
                arrayList2.add(Z1);
            } else if (file != null) {
                arrayList2.add(file);
            }
        }
        if (z10) {
            arrayList2.clear();
        }
        return new Pair(Integer.valueOf(i10), Boolean.valueOf(z10));
    }

    public final void J(LongSparseIntArray longSparseIntArray) {
        f17637k0.c(new gt(this, longSparseIntArray, new ArrayList(), 0));
    }

    public final void K(ArrayList arrayList, boolean z10, boolean z11, CountDownLatch countDownLatch) {
        boolean z12;
        boolean z13;
        Object valueOf;
        if (v2.f18578a) {
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
            f8.b(sb2.toString());
        } else {
            z12 = z10;
            z13 = z11;
        }
        if (arrayList != null) {
            int i10 = 0;
            while (i10 < arrayList.size()) {
                kj kjVar = (kj) arrayList.get(i10);
                if (kjVar != null && kjVar.f16690k != null && !kjVar.P3()) {
                    TLRPC.MessageAction messageAction = kjVar.f16690k.action;
                    if (messageAction instanceof TLRPC.TL_messageActionConferenceCall) {
                        TLRPC.TL_messageActionConferenceCall tL_messageActionConferenceCall = (TLRPC.TL_messageActionConferenceCall) messageAction;
                        if (!tL_messageActionConferenceCall.active && !tL_messageActionConferenceCall.missed && getConnectionsManager().getCurrentTime() - kjVar.f16690k.date < getMessagesController().f19143h3 / 1000) {
                            HashSet hashSet = new HashSet();
                            hashSet.add(Long.valueOf(kj.B0(kjVar.f16690k)));
                            ArrayList<TLRPC.Peer> arrayList2 = tL_messageActionConferenceCall.other_participants;
                            int size = arrayList2.size();
                            int i11 = 0;
                            while (i11 < size) {
                                TLRPC.Peer peer = arrayList2.get(i11);
                                i11++;
                                hashSet.add(Long.valueOf(o5.o(peer)));
                            }
                            StringBuilder sb3 = new StringBuilder();
                            Iterator it = hashSet.iterator();
                            while (it.hasNext()) {
                                long longValue = ((Long) it.next()).longValue();
                                if (sb3.length() > 0) {
                                    sb3.append(", ");
                                }
                                sb3.append(o5.s(this.currentAccount, longValue));
                            }
                            VoIPGroupNotification.request(w0.f18945b, this.currentAccount, kj.B0(kjVar.f16690k), sb3.toString(), tL_messageActionConferenceCall.call_id, kjVar.f1(), tL_messageActionConferenceCall.video);
                            arrayList.remove(i10);
                            i10--;
                        } else {
                            VoIPGroupNotification.hide(w0.f18945b, this.currentAccount, kjVar.f1());
                        }
                    }
                }
                i10++;
            }
        }
        if (arrayList.isEmpty()) {
            if (countDownLatch != null) {
                countDownLatch.countDown();
                return;
            }
            return;
        }
        f17637k0.c(new en(this, arrayList, new ArrayList(0), z13, z12, countDownLatch));
    }

    public final void L(LongSparseIntArray longSparseIntArray, long j10, int i10, int i11, boolean z10) {
        f17637k0.c(new pg(this, longSparseIntArray, new ArrayList(0), j10, i11, i10, z10));
    }

    public final void M(a0.h hVar, boolean z10) {
        f17637k0.c(new bi.n4(this, hVar, z10, new ArrayList(0), 20));
    }

    public final void N(long j10) {
        L(null, j10, 0, Integer.MAX_VALUE, false);
        LongSparseIntArray longSparseIntArray = new LongSparseIntArray();
        longSparseIntArray.put(j10, 0);
        J(longSparseIntArray);
    }

    public final String O(kj kjVar) {
        String str;
        TLRPC.Message message = kjVar.f16690k;
        if (message != null && (str = message.message) != null && message.entities != null) {
            StringBuilder sb2 = new StringBuilder(str);
            if (kjVar.I2) {
                return sb2.toString();
            }
            for (int i10 = 0; i10 < kjVar.f16690k.entities.size(); i10++) {
                if (kjVar.f16690k.entities.get(i10) instanceof TLRPC.TL_messageEntitySpoiler) {
                    TLRPC.TL_messageEntitySpoiler tL_messageEntitySpoiler = (TLRPC.TL_messageEntitySpoiler) kjVar.f16690k.entities.get(i10);
                    for (int i11 = 0; i11 < tL_messageEntitySpoiler.length; i11++) {
                        char[] cArr = this.f17655h0;
                        sb2.setCharAt(tL_messageEntitySpoiler.offset + i11, cArr[i11 % cArr.length]);
                    }
                }
            }
            return sb2.toString();
        }
        return null;
    }

    public final void P(e0.r rVar, long j10, long j11, String str, long[] jArr, int i10, Uri uri, int i11, boolean z10, boolean z11, boolean z12, int i12) {
        f8.b("resetNotificationSound");
        Uri uri2 = Settings.System.DEFAULT_RINGTONE_URI;
        if (uri2 != null && uri != null && !TextUtils.equals(uri2.toString(), uri.toString())) {
            SharedPreferences.Editor edit = getAccountInstance().c().edit();
            String uri3 = uri2.toString();
            String L0 = dd.L0(2131751600, null);
            if (z10) {
                if (i12 == 2) {
                    edit.putString("ChannelSound", L0);
                } else if (i12 == 0) {
                    edit.putString("GroupSound", L0);
                } else if (i12 == 1) {
                    edit.putString("GlobalSound", L0);
                } else if (i12 == 3) {
                    edit.putString("StoriesSound", L0);
                } else if (i12 == 4 || i12 == 5) {
                    edit.putString("ReactionSound", L0);
                }
                if (i12 == 2) {
                    edit.putString("ChannelSoundPath", uri3);
                } else if (i12 == 0) {
                    edit.putString("GroupSoundPath", uri3);
                } else if (i12 == 1) {
                    edit.putString("GlobalSoundPath", uri3);
                } else if (i12 == 3) {
                    edit.putString("StoriesSoundPath", uri3);
                } else if (i12 == 4 || i12 == 5) {
                    edit.putString("ReactionSound", uri3);
                }
                getNotificationsController().n(i12);
            } else {
                edit.putString("sound_" + v(j10, j11, false), L0);
                edit.putString("sound_path_" + v(j10, j11, false), uri3);
                o(j10, j11);
            }
            edit.commit();
            rVar.f6077y = e0(j10, j11, str, jArr, i10, uri2, i11, z10, z11, z12, i12);
            f17638l0.e(null, this.f17650d0, rVar.b());
        }
    }

    public final void Q(boolean z10) {
        int i10;
        bt btVar = this.U;
        try {
            if (v2.f18578a) {
                f8.b("delay notification start, onlineReason = " + z10);
            }
            this.V.acquire(10000L);
            r5 r5Var = f17637k0;
            r5Var.a(btVar);
            if (z10) {
                i10 = 3000;
            } else {
                i10 = 1000;
            }
            r5Var.d(btVar, i10);
        } catch (Exception e) {
            f8.g(e, true);
            Z(this.K);
        }
    }

    public final void R() {
        try {
            Intent intent = new Intent(w0.f18945b, NotificationRepeat.class);
            intent.putExtra("currentAccount", this.currentAccount);
            PendingIntent service = PendingIntent.getService(w0.f18945b, 0, intent, 33554432);
            int i10 = getAccountInstance().c().getInt("repeat_messages", 60);
            if (i10 > 0 && this.J > 0) {
                this.f17649c0.set(2, SystemClock.elapsedRealtime() + (i10 * 60000), service);
            } else {
                this.f17649c0.cancel(service);
            }
        } catch (Exception e) {
            f8.g(e, true);
        }
    }

    public final void S(int i10) {
        if (this.N != i10) {
            f8.b("setBadge " + i10);
            this.N = i10;
            try {
                if (ps.f17635c == null && !ps.f17634b) {
                    ps.b();
                    ps.f17634b = true;
                }
                ms msVar = ps.f17635c;
                if (msVar != null) {
                    msVar.a(i10);
                }
            } catch (Throwable unused) {
            }
        }
    }

    public final void T(long j10, int i10, long j11) {
        SharedPreferences.Editor edit = getAccountInstance().c().edit();
        TLRPC.Dialog dialog = (TLRPC.Dialog) wp.r1(e20.f15506s0).Q.f(j10);
        if (i10 == 4) {
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
            int currentTime = ConnectionsManager.getInstance(e20.f15506s0).getCurrentTime();
            if (i10 == 0) {
                currentTime += 3600;
            } else if (i10 == 1) {
                currentTime += 28800;
            } else if (i10 == 2) {
                currentTime += 172800;
            } else if (i10 == 3) {
                currentTime = Integer.MAX_VALUE;
            }
            long j12 = 1;
            if (i10 == 3) {
                edit.putInt("notify2_" + v(j10, j11, false), 2);
            } else {
                edit.putInt("notify2_" + v(j10, j11, false), 3);
                edit.putInt("notifyuntil_" + v(j10, j11, false), currentTime);
                j12 = 1 | (((long) currentTime) << 32);
            }
            t(e20.f15506s0).N(j10);
            is.a0(e20.f15506s0).E1(j10, j12);
            if (dialog != null) {
                TLRPC.TL_peerNotifySettings tL_peerNotifySettings = new TLRPC.TL_peerNotifySettings();
                dialog.notify_settings = tL_peerNotifySettings;
                tL_peerNotifySettings.mute_until = currentTime;
            }
        }
        edit.commit();
        c0(j10, j11, true);
    }

    public final void U(int i10, int i11) {
        getAccountInstance().c().edit().putInt(q(i10), i11).commit();
        b0(i10);
        is messagesStorage = getMessagesStorage();
        messagesStorage.f16331a.c(new cr(messagesStorage, 25));
        m(i10);
    }

    public final void V(int i10) {
        f17637k0.c(new ht(this, i10, 7));
    }

    public final void X(e0.r r89, java.lang.String r90, long r91, long r93, java.lang.String r95, long[] r96, int r97, android.net.Uri r98, int r99, boolean r100, boolean r101, boolean r102, int r103) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.pt.X(e0.r, java.lang.String, long, long, java.lang.String, long[], int, android.net.Uri, int, boolean, boolean, boolean, int):void");
    }

    public final void Y() {
        f17637k0.c(new bt(this, 4));
    }

    public final void Z(boolean r54) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.pt.Z(boolean):void");
    }

    public final void a0(long j10, String str) {
        f17637k0.c(new pr(this, str, j10, 3));
    }

    public final void b0(int i10) {
        SharedPreferences c10 = getAccountInstance().c();
        if (i10 != 4 && i10 != 5) {
            TL_account.updateNotifySettings updatenotifysettings = new TL_account.updateNotifySettings();
            TLRPC.TL_inputPeerNotifySettings tL_inputPeerNotifySettings = new TLRPC.TL_inputPeerNotifySettings();
            updatenotifysettings.settings = tL_inputPeerNotifySettings;
            tL_inputPeerNotifySettings.flags = 5;
            if (i10 == 0) {
                updatenotifysettings.peer = new TLRPC.TL_inputNotifyChats();
                updatenotifysettings.settings.mute_until = c10.getInt("EnableGroup2", 0);
                updatenotifysettings.settings.show_previews = c10.getBoolean("EnablePreviewGroup", true);
                TLRPC.TL_inputPeerNotifySettings tL_inputPeerNotifySettings2 = updatenotifysettings.settings;
                tL_inputPeerNotifySettings2.flags |= 8;
                tL_inputPeerNotifySettings2.sound = s(c10, "GroupSound", "GroupSoundDocId", "GroupSoundPath");
            } else if (i10 != 1 && i10 != 3) {
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
            getConnectionsManager().sendRequest(updatenotifysettings, new ag.c3(9));
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
        getConnectionsManager().sendRequest(setreactionsnotifysettings, new ag.c3(9));
    }

    public final void c0(long j10, long j11, boolean z10) {
        int i10;
        if (z10) {
            getNotificationCenter().k(at.f14704f0, new Object[0]);
        }
        if (o5.C(j10)) {
            return;
        }
        SharedPreferences c10 = getAccountInstance().c();
        TL_account.updateNotifySettings updatenotifysettings = new TL_account.updateNotifySettings();
        updatenotifysettings.settings = new TLRPC.TL_inputPeerNotifySettings();
        String v = v(j10, j11, false);
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
        int i11 = c10.getInt("notify2_" + v(j10, j11, false), -1);
        if (i11 != -1) {
            TLRPC.TL_inputPeerNotifySettings tL_inputPeerNotifySettings4 = updatenotifysettings.settings;
            tL_inputPeerNotifySettings4.flags |= 4;
            if (i11 == 3) {
                tL_inputPeerNotifySettings4.mute_until = c10.getInt("notifyuntil_" + v(j10, j11, false), 0);
            } else {
                if (i11 != 2) {
                    i10 = 0;
                } else {
                    i10 = Integer.MAX_VALUE;
                }
                tL_inputPeerNotifySettings4.mute_until = i10;
            }
        }
        long j12 = c10.getLong("sound_document_id_" + v(j10, j11, false), 0L);
        String string = c10.getString("sound_path_" + v(j10, j11, false), null);
        TLRPC.TL_inputPeerNotifySettings tL_inputPeerNotifySettings5 = updatenotifysettings.settings;
        tL_inputPeerNotifySettings5.flags = tL_inputPeerNotifySettings5.flags | 8;
        if (j12 != 0) {
            TLRPC.TL_notificationSoundRingtone tL_notificationSoundRingtone = new TLRPC.TL_notificationSoundRingtone();
            tL_notificationSoundRingtone.f19921id = j12;
            updatenotifysettings.settings.sound = tL_notificationSoundRingtone;
        } else if (string != null) {
            if (string.equalsIgnoreCase("NoSound")) {
                updatenotifysettings.settings.sound = new TLRPC.TL_notificationSoundNone();
            } else {
                TLRPC.TL_notificationSoundLocal tL_notificationSoundLocal = new TLRPC.TL_notificationSoundLocal();
                tL_notificationSoundLocal.title = c10.getString("sound_" + v(j10, j11, false), null);
                tL_notificationSoundLocal.data = string;
                updatenotifysettings.settings.sound = tL_notificationSoundLocal;
            }
        } else {
            tL_inputPeerNotifySettings5.sound = new TLRPC.TL_notificationSoundDefault();
        }
        if (j11 != 0 && j10 != getUserConfig().e()) {
            TLRPC.TL_inputNotifyForumTopic tL_inputNotifyForumTopic = new TLRPC.TL_inputNotifyForumTopic();
            tL_inputNotifyForumTopic.peer = getMessagesController().i1(j10);
            tL_inputNotifyForumTopic.top_msg_id = (int) j11;
            updatenotifysettings.peer = tL_inputNotifyForumTopic;
        } else {
            int i12 = this.currentAccount;
            if (j10 < 0 && w3.Y(wp.r1(i12).L0(Long.valueOf(-j10)))) {
                TLRPC.TL_inputNotifyCommunity tL_inputNotifyCommunity = new TLRPC.TL_inputNotifyCommunity();
                tL_inputNotifyCommunity.community = getMessagesController().g1(-j10);
                updatenotifysettings.peer = tL_inputNotifyCommunity;
            } else {
                TLRPC.TL_inputNotifyPeer tL_inputNotifyPeer = new TLRPC.TL_inputNotifyPeer();
                tL_inputNotifyPeer.peer = getMessagesController().i1(j10);
                updatenotifysettings.peer = tL_inputNotifyPeer;
            }
        }
        getConnectionsManager().sendRequest(updatenotifysettings, new ag.c3(9));
    }

    public final void d0() {
        int i10 = 0;
        long j10 = Long.MAX_VALUE;
        while (true) {
            ArrayList arrayList = this.D;
            if (i10 >= arrayList.size()) {
                break;
            }
            for (Pair pair : ((ot) arrayList.get(i10)).f17511c.values()) {
                j10 = Math.min(j10, ((Long) pair.second).longValue());
            }
            i10++;
        }
        r5 r5Var = f17637k0;
        bt btVar = this.f17656i0;
        r5Var.a(btVar);
        long currentTimeMillis = j10 - System.currentTimeMillis();
        if (j10 != Long.MAX_VALUE) {
            r5Var.d(btVar, Math.max(0L, currentTimeMillis));
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == at.Y1) {
            f17637k0.c(new ir(9, this, (String) objArr[0]));
        }
    }

    public final java.lang.String e0(long r46, long r48, java.lang.String r50, long[] r51, int r52, android.net.Uri r53, int r54, boolean r55, boolean r56, boolean r57, int r58) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.pt.e0(long, long, java.lang.String, long[], int, android.net.Uri, int, boolean, boolean, boolean, int):java.lang.String");
    }

    public final void h(kj kjVar) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f17644a;
            if (i10 < arrayList.size()) {
                if (((kj) arrayList.get(i10)).f1() == kjVar.f1() && kj.B0(((kj) arrayList.get(i10)).f16690k) == kj.B0(kjVar.f16690k) && ((kj) arrayList.get(i10)).K == kjVar.K) {
                    return;
                }
                i10++;
            } else {
                arrayList.add(0, kjVar);
                return;
            }
        }
    }

    public final java.lang.String j(e0.r r18, long r19, java.lang.String r21, org.telegram.tgnet.TLRPC.User r22, org.telegram.tgnet.TLRPC.Chat r23, e0.l0 r24, boolean r25) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.pt.j(e0.r, long, java.lang.String, org.telegram.tgnet.TLRPC$User, org.telegram.tgnet.TLRPC$Chat, e0.l0, boolean):java.lang.String");
    }

    public final void l(long j10, long j11) {
        if (Build.VERSION.SDK_INT < 26) {
            return;
        }
        f17637k0.c(new ct(this, j10, j11, 1));
    }

    public final void m(int i10) {
        if (Build.VERSION.SDK_INT < 26) {
            return;
        }
        f17637k0.c(new ht(this, i10, 8));
    }

    public final void n(int i10) {
        String str;
        String str2;
        String str3;
        if (Build.VERSION.SDK_INT >= 26) {
            try {
                SharedPreferences c10 = getAccountInstance().c();
                SharedPreferences.Editor edit = c10.edit();
                if (i10 == 2) {
                    str = "channels";
                } else if (i10 == 0) {
                    str = "groups";
                } else if (i10 == 3) {
                    str = "stories";
                } else {
                    if (i10 != 4 && i10 != 5) {
                        str = "private";
                    }
                    str = "reactions";
                }
                String string = c10.getString(str, null);
                if (string != null) {
                    edit.remove(str).remove(str.concat("_s"));
                    try {
                        m0.deleteNotificationChannel(string);
                    } catch (Exception e) {
                        f8.g(e, true);
                    }
                    if (v2.f18578a) {
                        f8.b("delete channel global internal ".concat(string));
                    }
                }
                if (i10 == 2) {
                    str2 = "channels_ia";
                } else if (i10 == 0) {
                    str2 = "groups_ia";
                } else if (i10 == 3) {
                    str2 = "stories_ia";
                } else {
                    if (i10 != 4 && i10 != 5) {
                        str2 = "private_ia";
                    }
                    str2 = "reactions_ia";
                }
                String string2 = c10.getString(str2, null);
                if (string2 != null) {
                    edit.remove(str2).remove(str2.concat("_s"));
                    try {
                        m0.deleteNotificationChannel(string2);
                    } catch (Exception e7) {
                        f8.g(e7, true);
                    }
                    if (v2.f18578a) {
                        f8.b("delete channel global internal ".concat(string2));
                    }
                }
                if (i10 == 2) {
                    str3 = "overwrite_channel";
                } else if (i10 == 0) {
                    str3 = "overwrite_group";
                } else if (i10 == 3) {
                    str3 = "overwrite_stories";
                } else {
                    if (i10 != 4 && i10 != 5) {
                        str3 = "overwrite_private";
                    }
                    str3 = "overwrite_reactions";
                }
                edit.remove(str3);
                edit.commit();
            } catch (Exception e10) {
                f8.g(e10, true);
            }
        }
    }

    public final void o(long j10, long j11) {
        if (Build.VERSION.SDK_INT >= 26) {
            try {
                SharedPreferences c10 = getAccountInstance().c();
                SharedPreferences.Editor edit = c10.edit();
                String str = "org.telegram.key" + j10;
                if (j11 != 0) {
                    str = str + ".topic" + j11;
                }
                String string = c10.getString(str, null);
                if (string != null) {
                    edit.remove(str).remove(str + "_s");
                    try {
                        m0.deleteNotificationChannel(string);
                    } catch (Exception e) {
                        f8.g(e, true);
                    }
                    if (v2.f18578a) {
                        f8.b("delete channel internal ".concat(string));
                    }
                }
                String str2 = "org.telegram.keyia" + j10;
                String string2 = c10.getString(str2, null);
                if (string2 != null) {
                    edit.remove(str2).remove(str2 + "_s");
                    try {
                        m0.deleteNotificationChannel(string2);
                    } catch (Exception e7) {
                        f8.g(e7, true);
                    }
                    if (v2.f18578a) {
                        f8.b("delete channel internal ".concat(string2));
                    }
                }
                edit.commit();
            } catch (Exception e10) {
                f8.g(e10, true);
            }
        }
    }

    public final void p() {
        a0.h hVar = this.h;
        f8.b("NotificationsController dismissNotification");
        try {
            f17638l0.b(this.f17650d0, null);
            this.f17644a.clear();
            this.f17648c.b();
            this.f17657n.b();
            for (int i10 = 0; i10 < hVar.m(); i10++) {
                if (!this.f17662y.contains(Long.valueOf(hVar.j(i10)))) {
                    f17638l0.b(((Integer) hVar.n(i10)).intValue(), null);
                }
            }
            hVar.b();
            i0.g3(new ag.f3(26));
        } catch (Exception e) {
            f8.g(e, true);
        }
    }

    public final int u(long j10, long j11) {
        int c10 = this.f17654g0.c(-1, j10, j11, "notify2_");
        if (c10 == 3 && this.f17654g0.c(0, j10, j11, "notifyuntil_") >= getConnectionsManager().getCurrentTime()) {
            return 2;
        }
        return c10;
    }

    public final java.lang.String w(org.telegram.messenger.kj r31, java.lang.String[] r32, boolean[] r33) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.pt.w(org.telegram.messenger.kj, java.lang.String[], boolean[]):java.lang.String");
    }

    public final java.lang.String x(org.telegram.messenger.kj r31, boolean[] r32) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.pt.x(org.telegram.messenger.kj, boolean[]):java.lang.String");
    }

    public final String y(TLRPC.Chat chat) {
        if (chat == null) {
            return null;
        }
        if (chat.monoforum) {
            return gg.e.i(this.currentAccount, chat, false);
        }
        return chat.title;
    }

    public final int z() {
        int i10 = 0;
        for (int i11 = 0; i11 < 4; i11++) {
            if (e20.i(i11).p() && (uz.Q0 || e20.f15506s0 == i11)) {
                pt t10 = t(i11);
                if (t10.R) {
                    if (t10.T) {
                        if (t10.S) {
                            try {
                                ArrayList arrayList = new ArrayList(wp.r1(i11).f19293y);
                                int size = arrayList.size();
                                for (int i12 = 0; i12 < size; i12++) {
                                    TLRPC.Dialog dialog = (TLRPC.Dialog) arrayList.get(i12);
                                    if (dialog != null && o5.z(dialog.f19798id)) {
                                        TLRPC.Chat L0 = getMessagesController().L0(Long.valueOf(-dialog.f19798id));
                                        if (!w3.r0(L0)) {
                                            if (w3.Y(L0)) {
                                            }
                                        }
                                    }
                                    if (dialog != null) {
                                        i10 += wp.r1(i11).U0(dialog);
                                    }
                                }
                            } catch (Exception e) {
                                f8.g(e, true);
                            }
                        } else {
                            i10 += t10.I;
                        }
                    } else if (t10.S) {
                        try {
                            int size2 = wp.r1(i11).f19293y.size();
                            for (int i13 = 0; i13 < size2; i13++) {
                                TLRPC.Dialog dialog2 = (TLRPC.Dialog) wp.r1(i11).f19293y.get(i13);
                                if (o5.z(dialog2.f19798id)) {
                                    TLRPC.Chat L02 = getMessagesController().L0(Long.valueOf(-dialog2.f19798id));
                                    if (!w3.r0(L02)) {
                                        if (w3.Y(L02)) {
                                        }
                                    }
                                }
                                if (wp.r1(i11).U0(dialog2) != 0) {
                                    i10++;
                                }
                            }
                        } catch (Exception e7) {
                            f8.g(e7, false);
                        }
                    } else {
                        i10 += t10.f17652f.m();
                    }
                }
            }
        }
        return i10;
    }
}
