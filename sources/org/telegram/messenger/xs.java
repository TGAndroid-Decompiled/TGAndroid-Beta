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
public final class xs extends c1 implements fs {
    public static String f27958k0;
    public static e0.i0 m0;
    public static NotificationManager f27960n0;
    public static AudioManager f27962p0;
    public static volatile xs[] f27963q0;
    public static final Object[] f27964r0;
    public static final a0.h f27965s0;
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
    public final ls V;
    public final PowerManager.WakeLock W;
    public long X;
    public SoundPool Y;
    public int Z;
    public final ArrayList f27966a;
    public int f27967a0;
    public final ArrayList f27968b;
    public boolean f27969b0;
    public final a0.h f27970c;
    public boolean f27971c0;
    public final a0.h d;
    public final AlarmManager f27972d0;
    public final a0.h f27973e;
    public final int f27974e0;
    public final a0.h f27975f;
    public final String f27976f0;
    public final xh.f f27977g0;
    public final a0.h h;
    public final ys f27978h0;
    public final char[] f27979i0;
    public final ls f27980j0;
    public final a0.h f27981n;
    public final a0.h f27982r;
    public final HashSet f27983s;
    public final ArrayList f27984w;
    public ArrayList f27985x;
    public final HashSet f27986y;
    public static final q5 f27959l0 = new q5("notificationsQueue");
    public static final long f27961o0 = n5.F(1);

    static {
        m0 = null;
        f27960n0 = null;
        if (Build.VERSION.SDK_INT >= 26 && t0.f26915b != null) {
            m0 = new e0.i0(t0.f26915b);
            f27960n0 = (NotificationManager) t0.f26915b.getSystemService("notification");
            i();
        }
        f27962p0 = (AudioManager) t0.f26915b.getSystemService("audio");
        f27963q0 = new xs[4];
        f27964r0 = new Object[4];
        for (int i7 = 0; i7 < 4; i7++) {
            f27964r0[i7] = new Object();
        }
        f27965s0 = new a0.h();
    }

    public xs(int i7) {
        super(i7);
        Object valueOf;
        this.f27966a = new ArrayList();
        this.f27968b = new ArrayList();
        this.f27970c = new a0.h();
        this.d = new a0.h();
        this.f27973e = new a0.h();
        this.f27975f = new a0.h();
        this.h = new a0.h();
        this.f27981n = new a0.h();
        this.f27982r = new a0.h();
        this.f27983s = new HashSet();
        this.f27984w = new ArrayList();
        this.f27985x = new ArrayList();
        this.f27986y = new HashSet();
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
        this.f27977g0 = new xh.f();
        this.f27979i0 = new char[]{10252, 10338, 10385, 10280, 10277, 10286, 10321};
        this.f27980j0 = new ls(this, 11);
        this.f27974e0 = this.currentAccount + 1;
        StringBuilder sb2 = new StringBuilder("messages");
        int i10 = this.currentAccount;
        if (i10 == 0) {
            valueOf = "";
        } else {
            valueOf = Integer.valueOf(i10);
        }
        sb2.append(valueOf);
        this.f27976f0 = sb2.toString();
        SharedPreferences d = getAccountInstance().d();
        this.N = d.getBoolean("EnableInChatSound", true);
        this.S = d.getBoolean("badgeNumber", true);
        this.T = d.getBoolean("badgeNumberMuted", false);
        this.U = d.getBoolean("badgeNumberMessages", true);
        m0 = new e0.i0(t0.f26915b);
        f27960n0 = (NotificationManager) t0.f26915b.getSystemService("notification");
        try {
            f27962p0 = (AudioManager) t0.f26915b.getSystemService("audio");
        } catch (Exception e10) {
            a8.g(e10, true);
        }
        try {
            this.f27972d0 = (AlarmManager) t0.f26915b.getSystemService("alarm");
        } catch (Exception e11) {
            a8.g(e11, true);
        }
        try {
            PowerManager.WakeLock newWakeLock = ((PowerManager) t0.f26915b.getSystemService("power")).newWakeLock(1, "telegram:notification_delay_lock");
            this.W = newWakeLock;
            newWakeLock.setReferenceCounted(false);
        } catch (Exception e12) {
            a8.g(e12, true);
        }
        this.V = new ls(this, 12);
        this.f27978h0 = new ys(this.currentAccount);
        g0.g3(new ls(this, 13));
    }

    public static boolean E(fj fjVar) {
        TLRPC.MessageAction messageAction;
        TLRPC.Message message = fjVar.f23968k;
        TLRPC.Peer peer = message.peer_id;
        if ((peer != null && peer.chat_id == 0 && peer.channel_id == 0 && ((messageAction = message.action) == null || (messageAction instanceof TLRPC.TL_messageActionEmpty))) || fjVar.J) {
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
                    paint2.setShader(new LinearGradient(size, size2, size, size2 + f12, new int[]{org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29618p8[org.telegram.ui.Components.b9.e(user.f28554id)], false), org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29638q8[org.telegram.ui.Components.b9.e(user.f28554id)], false)}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
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
                    org.telegram.ui.Components.b9.a(user.first_name, user.last_name, null, sb2);
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
            qVar.f10269y = f27958k0;
        } else {
            qVar.f10269y = notification.getChannelId();
        }
    }

    public static void a(xs xsVar, String str, long j3) {
        boolean z10;
        String M0;
        if (xsVar.getUserConfig().p()) {
            if (bz.Q0 || xsVar.currentAccount == j10.f24773t0) {
                try {
                    String str2 = "wallet_tonconnect_" + xsVar.currentAccount;
                    if (Build.VERSION.SDK_INT >= 26) {
                        f27960n0.createNotificationChannel(new NotificationChannel(str2, "TON Connect", 3));
                    }
                    if (!g0.p2(false) && !bz.C && xsVar.getAccountInstance().d().getBoolean("EnablePreviewAll", true)) {
                        z10 = false;
                        if (!TextUtils.isEmpty(str) && !z10) {
                            M0 = gd.a0(null, null, 2131747732, str);
                            Intent intent = new Intent(t0.f26915b, LaunchActivity.class);
                            intent.setAction("android.intent.action.VIEW");
                            intent.setData(Uri.parse("tg://resolve?domain=sendgrams"));
                            intent.putExtra("currentAccount", xsVar.currentAccount);
                            intent.addFlags(67108864);
                            PendingIntent activity = PendingIntent.getActivity(t0.f26915b, xsVar.currentAccount, intent, 201326592);
                            e0.q qVar = new e0.q(t0.f26915b, str2);
                            qVar.F.icon = 2131232454;
                            qVar.f10251e = e0.q.d(gd.M0(2131689472, null));
                            qVar.f10252f = e0.q.d(M0);
                            e0.l lVar = new e0.l(false);
                            lVar.f10241f = e0.q.d(M0);
                            qVar.n(lVar);
                            qVar.f10266u = "event";
                            qVar.f10268x = 0;
                            qVar.F.when = j3;
                            qVar.h(16, true);
                            qVar.f10253g = activity;
                            m0.e("wallet_tonconnect", xsVar.currentAccount, qVar.b());
                        }
                        M0 = gd.M0(2131747733, null);
                        Intent intent2 = new Intent(t0.f26915b, LaunchActivity.class);
                        intent2.setAction("android.intent.action.VIEW");
                        intent2.setData(Uri.parse("tg://resolve?domain=sendgrams"));
                        intent2.putExtra("currentAccount", xsVar.currentAccount);
                        intent2.addFlags(67108864);
                        PendingIntent activity2 = PendingIntent.getActivity(t0.f26915b, xsVar.currentAccount, intent2, 201326592);
                        e0.q qVar2 = new e0.q(t0.f26915b, str2);
                        qVar2.F.icon = 2131232454;
                        qVar2.f10251e = e0.q.d(gd.M0(2131689472, null));
                        qVar2.f10252f = e0.q.d(M0);
                        e0.l lVar2 = new e0.l(false);
                        lVar2.f10241f = e0.q.d(M0);
                        qVar2.n(lVar2);
                        qVar2.f10266u = "event";
                        qVar2.f10268x = 0;
                        qVar2.F.when = j3;
                        qVar2.h(16, true);
                        qVar2.f10253g = activity2;
                        m0.e("wallet_tonconnect", xsVar.currentAccount, qVar2.b());
                    }
                    z10 = true;
                    if (!TextUtils.isEmpty(str)) {
                        M0 = gd.a0(null, null, 2131747732, str);
                        Intent intent22 = new Intent(t0.f26915b, LaunchActivity.class);
                        intent22.setAction("android.intent.action.VIEW");
                        intent22.setData(Uri.parse("tg://resolve?domain=sendgrams"));
                        intent22.putExtra("currentAccount", xsVar.currentAccount);
                        intent22.addFlags(67108864);
                        PendingIntent activity22 = PendingIntent.getActivity(t0.f26915b, xsVar.currentAccount, intent22, 201326592);
                        e0.q qVar22 = new e0.q(t0.f26915b, str2);
                        qVar22.F.icon = 2131232454;
                        qVar22.f10251e = e0.q.d(gd.M0(2131689472, null));
                        qVar22.f10252f = e0.q.d(M0);
                        e0.l lVar22 = new e0.l(false);
                        lVar22.f10241f = e0.q.d(M0);
                        qVar22.n(lVar22);
                        qVar22.f10266u = "event";
                        qVar22.f10268x = 0;
                        qVar22.F.when = j3;
                        qVar22.h(16, true);
                        qVar22.f10253g = activity22;
                        m0.e("wallet_tonconnect", xsVar.currentAccount, qVar22.b());
                    }
                    M0 = gd.M0(2131747733, null);
                    Intent intent222 = new Intent(t0.f26915b, LaunchActivity.class);
                    intent222.setAction("android.intent.action.VIEW");
                    intent222.setData(Uri.parse("tg://resolve?domain=sendgrams"));
                    intent222.putExtra("currentAccount", xsVar.currentAccount);
                    intent222.addFlags(67108864);
                    PendingIntent activity222 = PendingIntent.getActivity(t0.f26915b, xsVar.currentAccount, intent222, 201326592);
                    e0.q qVar222 = new e0.q(t0.f26915b, str2);
                    qVar222.F.icon = 2131232454;
                    qVar222.f10251e = e0.q.d(gd.M0(2131689472, null));
                    qVar222.f10252f = e0.q.d(M0);
                    e0.l lVar222 = new e0.l(false);
                    lVar222.f10241f = e0.q.d(M0);
                    qVar222.n(lVar222);
                    qVar222.f10266u = "event";
                    qVar222.f10268x = 0;
                    qVar222.F.when = j3;
                    qVar222.h(16, true);
                    qVar222.f10253g = activity222;
                    m0.e("wallet_tonconnect", xsVar.currentAccount, qVar222.b());
                } catch (Exception e10) {
                    a8.g(e10, true);
                }
            }
        }
    }

    public static void b(xs xsVar) {
        try {
            SharedPreferences d = xsVar.getAccountInstance().d();
            Map<String, ?> all = d.getAll();
            SharedPreferences.Editor edit = d.edit();
            for (Map.Entry<String, ?> entry : all.entrySet()) {
                String key = entry.getKey();
                if (key.startsWith("org.telegram.key")) {
                    if (!key.endsWith("_s")) {
                        String str = (String) entry.getValue();
                        f27960n0.deleteNotificationChannel(str);
                        if (s2.f26723a) {
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

    public static void c(xs xsVar) {
        PowerManager.WakeLock wakeLock = xsVar.W;
        m0.b(xsVar.currentAccount, "wallet_tonconnect");
        xsVar.G = 0L;
        xsVar.H = 0L;
        xsVar.J = 0;
        xsVar.K = 0;
        xsVar.f27966a.clear();
        xsVar.f27970c.b();
        xsVar.d.b();
        xsVar.f27975f.b();
        xsVar.h.b();
        xsVar.f27981n.b();
        xsVar.f27986y.clear();
        xsVar.f27968b.clear();
        xsVar.L = false;
        xsVar.O = 0;
        try {
            if (wakeLock.isHeld()) {
                wakeLock.release();
            }
        } catch (Exception e10) {
            a8.g(e10, true);
        }
        xsVar.p();
        xsVar.S(xsVar.z());
        SharedPreferences.Editor edit = xsVar.getAccountInstance().d().edit();
        edit.clear();
        edit.commit();
        if (Build.VERSION.SDK_INT >= 26) {
            try {
                f27960n0.deleteNotificationChannelGroup("channels" + xsVar.currentAccount);
                f27960n0.deleteNotificationChannelGroup("groups" + xsVar.currentAccount);
                f27960n0.deleteNotificationChannelGroup("private" + xsVar.currentAccount);
                f27960n0.deleteNotificationChannelGroup("stories" + xsVar.currentAccount);
                f27960n0.deleteNotificationChannelGroup("other" + xsVar.currentAccount);
                String str = xsVar.currentAccount + "channel";
                List<NotificationChannel> notificationChannels = f27960n0.getNotificationChannels();
                int size = notificationChannels.size();
                for (int i7 = 0; i7 < size; i7++) {
                    String id2 = notificationChannels.get(i7).getId();
                    if (id2.startsWith(str)) {
                        try {
                            f27960n0.deleteNotificationChannel(id2);
                        } catch (Exception e11) {
                            a8.g(e11, true);
                        }
                        if (s2.f26723a) {
                            a8.b("delete channel cleanup " + id2);
                        }
                    }
                }
            } catch (Throwable th2) {
                a8.g(th2, true);
            }
        }
    }

    public static void e(org.telegram.messenger.xs r44, java.util.ArrayList r45, java.util.ArrayList r46, boolean r47, boolean r48, java.util.concurrent.CountDownLatch r49) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.xs.e(org.telegram.messenger.xs, java.util.ArrayList, java.util.ArrayList, boolean, boolean, java.util.concurrent.CountDownLatch):void");
    }

    public static void f(xs xsVar, ArrayList arrayList, a0.h hVar, ArrayList arrayList2, Collection collection) {
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
        fj fjVar;
        long j15;
        boolean z12;
        boolean z13;
        SparseArray sparseArray2;
        int intValue2;
        xsVar.f27975f.b();
        xsVar.f27966a.clear();
        xsVar.f27970c.b();
        xsVar.E.clear();
        xsVar.F.b();
        boolean z14 = false;
        xsVar.J = 0;
        xsVar.K = 0;
        xsVar.getAccountInstance().d();
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
                    SparseArray sparseArray3 = (SparseArray) xsVar.f27970c.f(j12);
                    if (sparseArray3 == null || sparseArray3.indexOfKey(message3.f28426id) < 0) {
                        fj fjVar2 = new fj(xsVar.currentAccount, message3, false, false);
                        if (E(fjVar2)) {
                            xsVar.K++;
                        }
                        long B0 = fj.B0(fjVar2.f23968k);
                        long b22 = fj.b2(xsVar.currentAccount, fjVar2.f23968k, xsVar.getMessagesController().z2(fjVar2), false);
                        if (fjVar2.f23968k.mentioned) {
                            message = message3;
                            j14 = fjVar2.Z0();
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
                            fjVar = fjVar2;
                            j15 = j13;
                        } else {
                            int u10 = xsVar.u(j14, b22);
                            if (u10 == -1) {
                                message2 = message;
                                sparseArray = sparseArray3;
                                j15 = j13;
                                z13 = xsVar.D(j14, null, fjVar2.I, fjVar2.J);
                                fjVar = fjVar2;
                            } else {
                                message2 = message;
                                sparseArray = sparseArray3;
                                fjVar = fjVar2;
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
                        if (z13 && (j14 != xsVar.G || !t0.f26922w)) {
                            if (sparseArray == null) {
                                sparseArray2 = new SparseArray();
                                xsVar.f27970c.k(sparseArray2, j15);
                            } else {
                                sparseArray2 = sparseArray;
                            }
                            sparseArray2.put(message2.f28426id, fjVar);
                            xsVar.h(fjVar);
                            if (B0 != j14) {
                                Integer num = (Integer) xsVar.f27982r.f(B0);
                                a0.h hVar3 = xsVar.f27982r;
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
                int u11 = xsVar.u(j18, j17);
                if (u11 == -1) {
                    z11 = xsVar.D(j18, null, false, false);
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
                xsVar.f27975f.k(num2, j18);
                if (!xsVar.getMessagesController().s2(j18)) {
                    if (xsVar.getMessagesController().y2(j18)) {
                        int i15 = xsVar.J;
                        if (intValue3 > 0) {
                            i12 = 1;
                        } else {
                            i12 = 0;
                        }
                        xsVar.J = i15 + i12;
                    } else {
                        xsVar.J += intValue3;
                    }
                }
            }
            i14++;
            j17 = 0;
        }
        for (int i16 = 0; i16 < arrayList2.size(); i16++) {
            fj fjVar3 = (fj) arrayList2.get(i16);
            int e12 = fjVar3.e1();
            if (xsVar.f27970c.h(e12) < 0) {
                if (E(fjVar3)) {
                    xsVar.K++;
                }
                long B02 = fj.B0(fjVar3.f23968k);
                long b23 = fj.b2(xsVar.currentAccount, fjVar3.f23968k, xsVar.getMessagesController().z2(fjVar3), false);
                TLRPC.Message message4 = fjVar3.f23968k;
                long j19 = message4.random_id;
                if (message4.mentioned) {
                    j3 = fjVar3.Z0();
                } else {
                    j3 = B02;
                }
                int h10 = hVar2.h(j3);
                if (h10 >= 0 && b23 == 0) {
                    long j20 = j3;
                    z10 = ((Boolean) hVar2.n(h10)).booleanValue();
                    j10 = j20;
                } else {
                    int u12 = xsVar.u(j3, b23);
                    if (u12 == -1) {
                        j10 = j3;
                        z10 = xsVar.D(j10, null, fjVar3.I, fjVar3.J);
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
                if (z10 && (j10 != xsVar.G || !t0.f26922w)) {
                    if (e12 != 0) {
                        if (fjVar3.J) {
                            j11 = fj.B0(fjVar3.f23968k);
                        } else {
                            long j21 = fjVar3.f23968k.peer_id.channel_id;
                            if (j21 != 0) {
                                j11 = -j21;
                            } else {
                                j11 = 0;
                            }
                        }
                        SparseArray sparseArray4 = (SparseArray) xsVar.f27970c.f(j11);
                        if (sparseArray4 == null) {
                            sparseArray4 = new SparseArray();
                            xsVar.f27970c.k(sparseArray4, j11);
                        }
                        sparseArray4.put(e12, fjVar3);
                    } else if (j19 != 0) {
                        xsVar.d.k(fjVar3, j19);
                    }
                    xsVar.h(fjVar3);
                    if (B02 != j10) {
                        Integer num3 = (Integer) xsVar.f27982r.f(B02);
                        a0.h hVar4 = xsVar.f27982r;
                        if (num3 == null) {
                            intValue = 1;
                        } else {
                            intValue = num3.intValue() + 1;
                        }
                        hVar4.k(Integer.valueOf(intValue), B02);
                    }
                    Integer num4 = (Integer) xsVar.f27975f.f(j10);
                    if (num4 != null) {
                        i7 = num4.intValue() + 1;
                    } else {
                        i7 = 1;
                    }
                    if (!xsVar.getMessagesController().s2(j10)) {
                        if (xsVar.getMessagesController().y2(j10)) {
                            if (num4 != null) {
                                int i17 = xsVar.J;
                                if (num4.intValue() > 0) {
                                    i11 = 1;
                                } else {
                                    i11 = 0;
                                }
                                xsVar.J = i17 - i11;
                            }
                            int i18 = xsVar.J;
                            if (i7 > 0) {
                                i10 = 1;
                            } else {
                                i10 = 0;
                            }
                            xsVar.J = i18 + i10;
                        } else {
                            if (num4 != null) {
                                xsVar.J -= num4.intValue();
                            }
                            xsVar.J += i7;
                        }
                    }
                    xsVar.f27975f.k(Integer.valueOf(i7), j10);
                }
            }
        }
        if (collection != null) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                ws wsVar = (ws) it.next();
                long j22 = wsVar.f27758a;
                ws wsVar2 = (ws) xsVar.F.f(j22);
                if (wsVar2 != null) {
                    wsVar2.f27760c.putAll(wsVar.f27760c);
                } else {
                    xsVar.E.add(wsVar);
                    xsVar.F.k(wsVar, j22);
                }
            }
            Collections.sort(xsVar.E, Comparator$CC.comparingLong(new ok(2)));
        }
        g0.g3(new rs(xsVar, xsVar.f27975f.m(), 4));
        if (SystemClock.elapsedRealtime() / 1000 < 60) {
            z14 = true;
        }
        xsVar.Z(z14);
        if (xsVar.S) {
            xsVar.S(xsVar.z());
        }
    }

    public static int g(java.util.ArrayList r3, org.telegram.messenger.fj r4, long r5, boolean r7, android.content.SharedPreferences r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.xs.g(java.util.ArrayList, org.telegram.messenger.fj, long, boolean, android.content.SharedPreferences):int");
    }

    public static void i() {
        SharedPreferences sharedPreferences;
        if (Build.VERSION.SDK_INT >= 26) {
            if (f27958k0 == null) {
                sharedPreferences = t0.f26915b.getSharedPreferences("Notifications", 0);
                f27958k0 = sharedPreferences.getString("OtherKey", "Other3");
            } else {
                sharedPreferences = null;
            }
            NotificationChannel notificationChannel = f27960n0.getNotificationChannel(f27958k0);
            if (notificationChannel != null && notificationChannel.getImportance() == 0) {
                try {
                    f27960n0.deleteNotificationChannel(f27958k0);
                } catch (Exception e10) {
                    a8.g(e10, true);
                }
                f27958k0 = null;
                notificationChannel = null;
            }
            if (f27958k0 == null) {
                if (sharedPreferences == null) {
                    sharedPreferences = t0.f26915b.getSharedPreferences("Notifications", 0);
                }
                f27958k0 = "Other" + Utilities.f22780b.nextLong();
                sharedPreferences.edit().putString("OtherKey", f27958k0).commit();
            }
            String M0 = gd.M0(2131748997, null);
            if (notificationChannel != null && !TextUtils.equals(notificationChannel.getName(), M0)) {
                notificationChannel.setName(M0);
                try {
                    f27960n0.createNotificationChannel(notificationChannel);
                } catch (Exception e11) {
                    a8.g(e11, true);
                }
            }
            if (notificationChannel == null) {
                NotificationChannel notificationChannel2 = new NotificationChannel(f27958k0, M0, 3);
                notificationChannel2.enableLights(false);
                notificationChannel2.enableVibration(false);
                notificationChannel2.setSound(null, null);
                try {
                    f27960n0.createNotificationChannel(notificationChannel2);
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

    public static String r(fj fjVar, String str) {
        boolean z10;
        int i7;
        TLRPC.Message message = fjVar.f23968k;
        TLRPC.TL_messageActionGramTransfer tL_messageActionGramTransfer = (TLRPC.TL_messageActionGramTransfer) message.action;
        boolean B = o10.B(fj.B0(message));
        if (B && !TextUtils.isEmpty(tL_messageActionGramTransfer.onramp_provider_name)) {
            return gd.a0(null, null, 2131747844, org.telegram.ui.Wallet.u0.x(tL_messageActionGramTransfer.amount, false), org.telegram.ui.Wallet.g.d(tL_messageActionGramTransfer.onramp_provider_name, Locale.getDefault()));
        }
        if (!tL_messageActionGramTransfer.comment_encrypted && !TextUtils.isEmpty(tL_messageActionGramTransfer.comment)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (B) {
            if (z10) {
                i7 = 2131747842;
            } else {
                i7 = 2131747843;
            }
        } else if (z10) {
            i7 = 2131747845;
        } else {
            i7 = 2131747846;
        }
        return gd.a0(null, null, i7, str, org.telegram.ui.Wallet.u0.x(tL_messageActionGramTransfer.amount, false), tL_messageActionGramTransfer.comment);
    }

    public static TLRPC.NotificationSound s(SharedPreferences sharedPreferences, String str, String str2, String str3) {
        long j3 = sharedPreferences.getLong(str2, 0L);
        String string = sharedPreferences.getString(str3, "NoSound");
        if (j3 != 0) {
            TLRPC.TL_notificationSoundRingtone tL_notificationSoundRingtone = new TLRPC.TL_notificationSoundRingtone();
            tL_notificationSoundRingtone.f28532id = j3;
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

    public static xs t(int i7) {
        xs xsVar;
        xs xsVar2 = f27963q0[i7];
        if (xsVar2 == null) {
            synchronized (f27964r0[i7]) {
                try {
                    xsVar = f27963q0[i7];
                    if (xsVar == null) {
                        xs[] xsVarArr = f27963q0;
                        xs xsVar3 = new xs(i7);
                        xsVarArr[i7] = xsVar3;
                        xsVar = xsVar3;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return xsVar;
        }
        return xsVar2;
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
        a0.h hVar = f27965s0;
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
            ArrayList arrayList = this.f27966a;
            if (i7 >= arrayList.size()) {
                return false;
            }
            fj fjVar = (fj) arrayList.get(i7);
            long B0 = fj.B0(fjVar.f23968k);
            if (!fjVar.I) {
                TLRPC.Message message = fjVar.f23968k;
                if ((!message.mentioned || !(message.action instanceof TLRPC.TL_messageActionPinMessage)) && !n5.C(B0) && ((fjVar.f23968k.peer_id.channel_id == 0 || fjVar.A4()) && B0 != 489000 && B0 != 489001)) {
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.xs.D(long, java.lang.Boolean, boolean, boolean):boolean");
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
        SharedPreferences.Editor edit = mp.u1(this.currentAccount).f25660g7.edit();
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
            SharedPreferences.Editor edit = mp.u1(this.currentAccount).f25660g7.edit();
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
                tr.a0(this.currentAccount).E1(j3, j11);
                TLRPC.Dialog dialog = (TLRPC.Dialog) mp.u1(this.currentAccount).R.f(j3);
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
            ws wsVar = (ws) arrayList3.get(i10);
            HashMap hashMap = wsVar.f27760c;
            long j3 = wsVar.f27758a;
            i7 += hashMap.size();
            z10 |= wsVar.d;
            TLRPC.User c22 = getMessagesController().c2(Long.valueOf(j3));
            if (c22 == null && (c22 = getMessagesStorage().k0(j3)) != null) {
                getMessagesController().e4(c22, true, false);
            }
            File file = null;
            if (c22 != null) {
                str = o10.q(c22);
                TLRPC.UserProfilePhoto userProfilePhoto = c22.photo;
                if (userProfilePhoto != null && (fileLocation = userProfilePhoto.photo_small) != null && fileLocation.volume_id != 0 && fileLocation.local_id != 0) {
                    w7 fileLoader = getFileLoader();
                    TLRPC.FileLocation fileLocation2 = c22.photo.photo_small;
                    fileLoader.getClass();
                    File J = w7.J(fileLocation2, null, true, true);
                    if (!J.exists()) {
                        if (c22.photo.photo_big != null) {
                            w7 fileLoader2 = getFileLoader();
                            TLRPC.FileLocation fileLocation3 = c22.photo.photo_big;
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
                str = wsVar.f27759b;
                if (str == null) {
                }
            }
            if (str.length() > 50) {
                str = str.substring(0, 25) + "…";
            }
            arrayList.add(str);
            if (file == null && c22 != null) {
                arrayList2.add(c22);
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
        f27959l0.c(new qs(this, longSparseIntArray, new ArrayList(), 0));
    }

    public final void K(ArrayList arrayList, boolean z10, boolean z11, CountDownLatch countDownLatch) {
        boolean z12;
        boolean z13;
        Object valueOf;
        if (s2.f26723a) {
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
                fj fjVar = (fj) arrayList.get(i7);
                if (fjVar != null && fjVar.f23968k != null && !fjVar.P3()) {
                    TLRPC.MessageAction messageAction = fjVar.f23968k.action;
                    if (messageAction instanceof TLRPC.TL_messageActionConferenceCall) {
                        TLRPC.TL_messageActionConferenceCall tL_messageActionConferenceCall = (TLRPC.TL_messageActionConferenceCall) messageAction;
                        if (!tL_messageActionConferenceCall.active && !tL_messageActionConferenceCall.missed && getConnectionsManager().getCurrentTime() - fjVar.f23968k.date < getMessagesController().f25689k3 / 1000) {
                            HashSet hashSet = new HashSet();
                            hashSet.add(Long.valueOf(fj.B0(fjVar.f23968k)));
                            ArrayList<TLRPC.Peer> arrayList2 = tL_messageActionConferenceCall.other_participants;
                            int size = arrayList2.size();
                            int i10 = 0;
                            while (i10 < size) {
                                TLRPC.Peer peer = arrayList2.get(i10);
                                i10++;
                                hashSet.add(Long.valueOf(n5.o(peer)));
                            }
                            StringBuilder sb3 = new StringBuilder();
                            Iterator it = hashSet.iterator();
                            while (it.hasNext()) {
                                long longValue = ((Long) it.next()).longValue();
                                if (sb3.length() > 0) {
                                    sb3.append(", ");
                                }
                                sb3.append(n5.s(this.currentAccount, longValue));
                            }
                            VoIPGroupNotification.request(t0.f26915b, this.currentAccount, fj.B0(fjVar.f23968k), sb3.toString(), tL_messageActionConferenceCall.call_id, fjVar.e1(), tL_messageActionConferenceCall.video);
                            arrayList.remove(i7);
                            i7--;
                        } else {
                            VoIPGroupNotification.hide(t0.f26915b, this.currentAccount, fjVar.e1());
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
        f27959l0.c(new gn(this, arrayList, new ArrayList(0), z13, z12, countDownLatch));
    }

    public final void L(LongSparseIntArray longSparseIntArray, long j3, int i7, int i10, boolean z10) {
        f27959l0.c(new ng(this, longSparseIntArray, new ArrayList(0), j3, i10, i7, z10));
    }

    public final void M(a0.h hVar, boolean z10) {
        f27959l0.c(new aa.c0(this, hVar, z10, new ArrayList(0), 22));
    }

    public final void N(long j3) {
        L(null, j3, 0, Integer.MAX_VALUE, false);
        LongSparseIntArray longSparseIntArray = new LongSparseIntArray();
        longSparseIntArray.put(j3, 0);
        J(longSparseIntArray);
    }

    public final String O(fj fjVar) {
        String str;
        TLRPC.Message message = fjVar.f23968k;
        if (message != null && (str = message.message) != null && message.entities != null) {
            StringBuilder sb2 = new StringBuilder(str);
            if (fjVar.K2) {
                return sb2.toString();
            }
            for (int i7 = 0; i7 < fjVar.f23968k.entities.size(); i7++) {
                if (fjVar.f23968k.entities.get(i7) instanceof TLRPC.TL_messageEntitySpoiler) {
                    TLRPC.TL_messageEntitySpoiler tL_messageEntitySpoiler = (TLRPC.TL_messageEntitySpoiler) fjVar.f23968k.entities.get(i7);
                    for (int i10 = 0; i10 < tL_messageEntitySpoiler.length; i10++) {
                        char[] cArr = this.f27979i0;
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
            String M0 = gd.M0(2131751588, null);
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
            qVar.f10269y = e0(j3, j10, str, jArr, i7, uri2, i10, z10, z11, z12, i11);
            m0.e(null, this.f27974e0, qVar.b());
        }
    }

    public final void Q(boolean z10) {
        int i7;
        ls lsVar = this.V;
        try {
            if (s2.f26723a) {
                a8.b("delay notification start, onlineReason = " + z10);
            }
            this.W.acquire(10000L);
            q5 q5Var = f27959l0;
            q5Var.a(lsVar);
            if (z10) {
                i7 = 3000;
            } else {
                i7 = 1000;
            }
            q5Var.d(lsVar, i7);
        } catch (Exception e10) {
            a8.g(e10, true);
            Z(this.L);
        }
    }

    public final void R() {
        try {
            Intent intent = new Intent(t0.f26915b, NotificationRepeat.class);
            intent.putExtra("currentAccount", this.currentAccount);
            PendingIntent service = PendingIntent.getService(t0.f26915b, 0, intent, 33554432);
            int i7 = getAccountInstance().d().getInt("repeat_messages", 60);
            if (i7 > 0 && this.K > 0) {
                this.f27972d0.set(2, SystemClock.elapsedRealtime() + (i7 * 60000), service);
            } else {
                this.f27972d0.cancel(service);
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
                if (zr.f28349c == null && !zr.f28348b) {
                    zr.b();
                    zr.f28348b = true;
                }
                wr wrVar = zr.f28349c;
                if (wrVar != null) {
                    wrVar.a(i7);
                }
            } catch (Throwable unused) {
            }
        }
    }

    public final void T(long j3, int i7, long j10) {
        SharedPreferences.Editor edit = getAccountInstance().d().edit();
        TLRPC.Dialog dialog = (TLRPC.Dialog) mp.u1(j10.f24773t0).R.f(j3);
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
            int currentTime = ConnectionsManager.getInstance(j10.f24773t0).getCurrentTime();
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
            t(j10.f24773t0).N(j3);
            tr.a0(j10.f24773t0).E1(j3, j11);
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
        tr messagesStorage = getMessagesStorage();
        messagesStorage.f27054a.c(new pq(messagesStorage, 26));
        m(i7);
    }

    public final void V(int i7) {
        f27959l0.c(new rs(this, i7, 7));
    }

    public final void X(e0.q r90, java.lang.String r91, long r92, long r94, java.lang.String r96, long[] r97, int r98, android.net.Uri r99, int r100, boolean r101, boolean r102, boolean r103, int r104) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.xs.X(e0.q, java.lang.String, long, long, java.lang.String, long[], int, android.net.Uri, int, boolean, boolean, boolean, int):void");
    }

    public final void Y() {
        f27959l0.c(new ls(this, 3));
    }

    public final void Z(boolean r54) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.xs.Z(boolean):void");
    }

    public final void a0(long j3, String str) {
        f27959l0.c(new br(this, str, j3, 3));
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
            getConnectionsManager().sendRequest(updatenotifysettings, new fi.k5(14));
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
        getConnectionsManager().sendRequest(setreactionsnotifysettings, new fi.k5(14));
    }

    public final void c0(long j3, long j10, boolean z10) {
        int i7;
        if (z10) {
            getNotificationCenter().k(ks.f25112f0, new Object[0]);
        }
        if (n5.C(j3)) {
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
            tL_notificationSoundRingtone.f28532id = j11;
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
            tL_inputNotifyForumTopic.peer = getMessagesController().l1(j3);
            tL_inputNotifyForumTopic.top_msg_id = (int) j10;
            updatenotifysettings.peer = tL_inputNotifyForumTopic;
        } else {
            int i11 = this.currentAccount;
            if (j3 < 0 && v3.Y(mp.u1(i11).O0(Long.valueOf(-j3)))) {
                TLRPC.TL_inputNotifyCommunity tL_inputNotifyCommunity = new TLRPC.TL_inputNotifyCommunity();
                tL_inputNotifyCommunity.community = getMessagesController().j1(-j3);
                updatenotifysettings.peer = tL_inputNotifyCommunity;
            } else {
                TLRPC.TL_inputNotifyPeer tL_inputNotifyPeer = new TLRPC.TL_inputNotifyPeer();
                tL_inputNotifyPeer.peer = getMessagesController().l1(j3);
                updatenotifysettings.peer = tL_inputNotifyPeer;
            }
        }
        getConnectionsManager().sendRequest(updatenotifysettings, new fi.k5(14));
    }

    public final void d0() {
        int i7 = 0;
        long j3 = Long.MAX_VALUE;
        while (true) {
            ArrayList arrayList = this.E;
            if (i7 >= arrayList.size()) {
                break;
            }
            for (Pair pair : ((ws) arrayList.get(i7)).f27760c.values()) {
                j3 = Math.min(j3, ((Long) pair.second).longValue());
            }
            i7++;
        }
        q5 q5Var = f27959l0;
        ls lsVar = this.f27980j0;
        q5Var.a(lsVar);
        long currentTimeMillis = j3 - System.currentTimeMillis();
        if (j3 != Long.MAX_VALUE) {
            q5Var.d(lsVar, Math.max(0L, currentTimeMillis));
        }
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == ks.Y1) {
            f27959l0.c(new rq(13, this, (String) objArr[0]));
        }
    }

    public final java.lang.String e0(long r46, long r48, java.lang.String r50, long[] r51, int r52, android.net.Uri r53, int r54, boolean r55, boolean r56, boolean r57, int r58) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.xs.e0(long, long, java.lang.String, long[], int, android.net.Uri, int, boolean, boolean, boolean, int):java.lang.String");
    }

    public final void h(fj fjVar) {
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.f27966a;
            if (i7 < arrayList.size()) {
                if (((fj) arrayList.get(i7)).e1() == fjVar.e1() && fj.B0(((fj) arrayList.get(i7)).f23968k) == fj.B0(fjVar.f23968k) && ((fj) arrayList.get(i7)).K == fjVar.K) {
                    return;
                }
                i7++;
            } else {
                arrayList.add(0, fjVar);
                return;
            }
        }
    }

    public final java.lang.String j(e0.q r18, long r19, java.lang.String r21, org.telegram.tgnet.TLRPC.User r22, org.telegram.tgnet.TLRPC.Chat r23, e0.j0 r24, boolean r25) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.xs.j(e0.q, long, java.lang.String, org.telegram.tgnet.TLRPC$User, org.telegram.tgnet.TLRPC$Chat, e0.j0, boolean):java.lang.String");
    }

    public final void l(long j3, long j10) {
        if (Build.VERSION.SDK_INT < 26) {
            return;
        }
        f27959l0.c(new ms(this, j3, j10, 1));
    }

    public final void m(int i7) {
        if (Build.VERSION.SDK_INT < 26) {
            return;
        }
        f27959l0.c(new rs(this, i7, 8));
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
                        f27960n0.deleteNotificationChannel(string);
                    } catch (Exception e10) {
                        a8.g(e10, true);
                    }
                    if (s2.f26723a) {
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
                        f27960n0.deleteNotificationChannel(string2);
                    } catch (Exception e11) {
                        a8.g(e11, true);
                    }
                    if (s2.f26723a) {
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
                        f27960n0.deleteNotificationChannel(string);
                    } catch (Exception e10) {
                        a8.g(e10, true);
                    }
                    if (s2.f26723a) {
                        a8.b("delete channel internal ".concat(string));
                    }
                }
                String str2 = "org.telegram.keyia" + j3;
                String string2 = d.getString(str2, null);
                if (string2 != null) {
                    edit.remove(str2).remove(str2 + "_s");
                    try {
                        f27960n0.deleteNotificationChannel(string2);
                    } catch (Exception e11) {
                        a8.g(e11, true);
                    }
                    if (s2.f26723a) {
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
            m0.b(this.f27974e0, null);
            this.f27966a.clear();
            this.f27970c.b();
            this.f27981n.b();
            for (int i7 = 0; i7 < hVar.m(); i7++) {
                if (!this.f27986y.contains(Long.valueOf(hVar.j(i7)))) {
                    m0.b(((Integer) hVar.n(i7)).intValue(), null);
                }
            }
            hVar.b();
            g0.g3(new j2(13));
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    public final int u(long j3, long j10) {
        int c10 = this.f27978h0.c(-1, j3, j10, "notify2_");
        if (c10 == 3 && this.f27978h0.c(0, j3, j10, "notifyuntil_") >= getConnectionsManager().getCurrentTime()) {
            return 2;
        }
        return c10;
    }

    public final java.lang.String w(org.telegram.messenger.fj r31, java.lang.String[] r32, boolean[] r33) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.xs.w(org.telegram.messenger.fj, java.lang.String[], boolean[]):java.lang.String");
    }

    public final java.lang.String x(org.telegram.messenger.fj r31, boolean[] r32) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.xs.x(org.telegram.messenger.fj, boolean[]):java.lang.String");
    }

    public final String y(TLRPC.Chat chat) {
        if (chat == null) {
            return null;
        }
        if (chat.monoforum) {
            return qg.c.j(this.currentAccount, chat, false);
        }
        return chat.title;
    }

    public final int z() {
        int i7 = 0;
        for (int i10 = 0; i10 < 4; i10++) {
            if (j10.i(i10).p() && (bz.Q0 || j10.f24773t0 == i10)) {
                xs t6 = t(i10);
                if (t6.S) {
                    if (t6.U) {
                        if (t6.T) {
                            try {
                                ArrayList arrayList = new ArrayList(mp.u1(i10).f25811y);
                                int size = arrayList.size();
                                for (int i11 = 0; i11 < size; i11++) {
                                    TLRPC.Dialog dialog = (TLRPC.Dialog) arrayList.get(i11);
                                    if (dialog != null && n5.z(dialog.f28409id)) {
                                        TLRPC.Chat O0 = getMessagesController().O0(Long.valueOf(-dialog.f28409id));
                                        if (!v3.r0(O0)) {
                                            if (v3.Y(O0)) {
                                            }
                                        }
                                    }
                                    if (dialog != null) {
                                        i7 += mp.u1(i10).X0(dialog);
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
                            int size2 = mp.u1(i10).f25811y.size();
                            for (int i12 = 0; i12 < size2; i12++) {
                                TLRPC.Dialog dialog2 = (TLRPC.Dialog) mp.u1(i10).f25811y.get(i12);
                                if (n5.z(dialog2.f28409id)) {
                                    TLRPC.Chat O02 = getMessagesController().O0(Long.valueOf(-dialog2.f28409id));
                                    if (!v3.r0(O02)) {
                                        if (v3.Y(O02)) {
                                        }
                                    }
                                }
                                if (mp.u1(i10).X0(dialog2) != 0) {
                                    i7++;
                                }
                            }
                        } catch (Exception e11) {
                            a8.g(e11, false);
                        }
                    } else {
                        i7 += t6.f27975f.m();
                    }
                }
            }
        }
        return i7;
    }
}
