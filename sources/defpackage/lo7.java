package defpackage;

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
import org.telegram.messenger.NotificationRepeat;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.messenger.voip.VoIPGroupNotification;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.Wallet.c;
public final class lo7 extends pg0 implements jm7 {
    public static String k0;
    public static sn7 m0;
    public static NotificationManager n0;
    public static AudioManager p0;
    public static volatile lo7[] q0;
    public static final Object[] r0;
    public static final vh6 s0;
    public final ArrayList E;
    public final vh6 F;
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
    public final zn7 V;
    public final PowerManager.WakeLock W;
    public long X;
    public SoundPool Y;
    public int Z;
    public final ArrayList a;
    public int a0;
    public final ArrayList b;
    public boolean b0;
    public final vh6 c;
    public boolean c0;
    public final vh6 d;
    public final AlarmManager d0;
    public final vh6 e;
    public final int e0;
    public final vh6 f;
    public final String f0;
    public final rna g0;
    public final vh6 h;
    public final ap7 h0;
    public final char[] i0;
    public final zn7 j0;
    public final vh6 n;
    public final vh6 r;
    public final HashSet s;
    public final ArrayList w;
    public ArrayList x;
    public final HashSet y;
    public static final mp3 l0 = new mp3("notificationsQueue");
    public static final long o0 = pg3.E(1);

    static {
        m0 = null;
        n0 = null;
        if (Build.VERSION.SDK_INT >= 26 && a.b != null) {
            m0 = new sn7(a.b);
            n0 = (NotificationManager) a.b.getSystemService("notification");
            c();
        }
        p0 = (AudioManager) a.b.getSystemService("audio");
        q0 = new lo7[4];
        r0 = new Object[4];
        for (int i = 0; i < 4; i++) {
            r0[i] = new Object();
        }
        s0 = new vh6();
    }

    public lo7(int i) {
        super(i);
        Object valueOf;
        this.a = new ArrayList();
        this.b = new ArrayList();
        this.c = new vh6();
        this.d = new vh6();
        this.e = new vh6();
        this.f = new vh6();
        this.h = new vh6();
        this.n = new vh6();
        this.r = new vh6();
        this.s = new HashSet();
        this.w = new ArrayList();
        this.x = new ArrayList();
        this.y = new HashSet();
        this.E = new ArrayList();
        this.F = new vh6();
        this.G = 0L;
        this.H = 0L;
        this.I = 5000;
        this.J = 0;
        this.K = 0;
        this.L = false;
        this.M = 0;
        this.O = -1;
        this.g0 = new rna();
        this.i0 = new char[]{10252, 10338, 10385, 10280, 10277, 10286, 10321};
        this.j0 = new zn7(this, (byte) 11);
        this.e0 = this.currentAccount + 1;
        StringBuilder sb = new StringBuilder("messages");
        int i2 = this.currentAccount;
        if (i2 == 0) {
            valueOf = "";
        } else {
            valueOf = Integer.valueOf(i2);
        }
        sb.append(valueOf);
        this.f0 = sb.toString();
        SharedPreferences d = getAccountInstance().d();
        this.N = d.getBoolean("EnableInChatSound", true);
        this.S = d.getBoolean("badgeNumber", true);
        this.T = d.getBoolean("badgeNumberMuted", false);
        this.U = d.getBoolean("badgeNumberMessages", true);
        m0 = new sn7(a.b);
        n0 = (NotificationManager) a.b.getSystemService("notification");
        try {
            p0 = (AudioManager) a.b.getSystemService("audio");
        } catch (Exception e) {
            fc4.g(e, true);
        }
        try {
            this.d0 = (AlarmManager) a.b.getSystemService("alarm");
        } catch (Exception e2) {
            fc4.g(e2, true);
        }
        try {
            PowerManager.WakeLock newWakeLock = ((PowerManager) a.b.getSystemService("power")).newWakeLock(1, "telegram:notification_delay_lock");
            this.W = newWakeLock;
            newWakeLock.setReferenceCounted(false);
        } catch (Exception e3) {
            fc4.g(e3, true);
        }
        this.V = new zn7(this, (byte) 12);
        this.h0 = new ap7(this.currentAccount);
        gm.c3(new zn7(this, (byte) 13));
    }

    public static Bitmap F(ArrayList arrayList) {
        float f;
        int i;
        Bitmap bitmap;
        Paint paint;
        boolean z;
        float f2;
        float size;
        float size2;
        float f3;
        float f4;
        float f5;
        float f6;
        Object obj;
        ArrayList arrayList2 = arrayList;
        if (Build.VERSION.SDK_INT >= 28 && arrayList2.size() != 0) {
            int L = gm.L(64.0f);
            Bitmap createBitmap = Bitmap.createBitmap(L, L, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            Matrix matrix = new Matrix();
            Paint paint2 = new Paint(3);
            boolean z2 = true;
            Paint paint3 = new Paint(1);
            Rect rect = new Rect();
            paint3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
            if (arrayList2.size() == 1) {
                f = 1.0f;
            } else if (arrayList2.size() == 2) {
                f = 0.65f;
            } else {
                f = 0.5f;
            }
            int i2 = 0;
            TextPaint textPaint = null;
            while (i2 < arrayList2.size()) {
                float f7 = L;
                float f8 = (1.0f - f) * f7;
                try {
                    size = (f8 / arrayList2.size()) * ((arrayList2.size() - 1) - i2);
                    size2 = i2 * (f8 / arrayList2.size());
                    f3 = f7 * f;
                    f4 = f3 / 2.0f;
                    i = L;
                    f5 = size + f4;
                    bitmap = createBitmap;
                    f6 = size2 + f4;
                    f2 = f;
                    try {
                        canvas.drawCircle(f5, f6, gm.L(2.0f) + f4, paint3);
                        obj = arrayList2.get(i2);
                        paint = paint3;
                    } catch (Throwable unused) {
                        paint = paint3;
                    }
                } catch (Throwable unused2) {
                    i = L;
                    bitmap = createBitmap;
                    paint = paint3;
                    z = z2;
                    f2 = f;
                }
                if (obj instanceof File) {
                    String absolutePath = ((File) arrayList2.get(i2)).getAbsolutePath();
                    BitmapFactory.Options options = new BitmapFactory.Options();
                    z = true;
                    try {
                        options.inJustDecodeBounds = true;
                        BitmapFactory.decodeFile(absolutePath, options);
                        int i3 = (int) f3;
                        options.inSampleSize = g6b.d(options, i3, i3);
                        options.inJustDecodeBounds = false;
                        options.inDither = true;
                        Bitmap decodeFile = BitmapFactory.decodeFile(absolutePath, options);
                        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                        BitmapShader bitmapShader = new BitmapShader(decodeFile, tileMode, tileMode);
                        matrix.reset();
                        matrix.postScale(f3 / decodeFile.getWidth(), f3 / decodeFile.getHeight());
                        matrix.postTranslate(size, size2);
                        bitmapShader.setLocalMatrix(matrix);
                        paint2.setShader(bitmapShader);
                        canvas.drawCircle(f5, f6, f4, paint2);
                        decodeFile.recycle();
                        z = true;
                    } catch (Throwable unused3) {
                    }
                    i2++;
                    z2 = z;
                    L = i;
                    createBitmap = bitmap;
                    f = f2;
                    paint3 = paint;
                    arrayList2 = arrayList;
                } else {
                    if (obj instanceof TLRPC.User) {
                        TLRPC.User user = (TLRPC.User) obj;
                        paint2.setShader(new LinearGradient(size, size2, size, size2 + f3, new int[]{cmb.w0(null, cmb.o8[pc0.d(user.id)], false), cmb.w0(null, cmb.p8[pc0.d(user.id)], false)}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
                        canvas.drawCircle(f5, f6, f4, paint2);
                        if (textPaint == null) {
                            z = true;
                            TextPaint textPaint2 = new TextPaint(1);
                            try {
                                textPaint2.setTypeface(gm.o());
                                textPaint2.setTextSize(f7 * 0.25f);
                                textPaint2.setColor(-1);
                                textPaint = textPaint2;
                            } catch (Throwable unused4) {
                                textPaint = textPaint2;
                            }
                        } else {
                            z = true;
                        }
                        StringBuilder sb = new StringBuilder();
                        pc0.a(user.first_name, user.last_name, null, sb);
                        String sb2 = sb.toString();
                        textPaint.getTextBounds(sb2, 0, sb2.length(), rect);
                        canvas.drawText(sb2, (f5 - (rect.width() / 2.0f)) - rect.left, (f6 - (rect.height() / 2.0f)) - rect.top, textPaint);
                        i2++;
                        z2 = z;
                        L = i;
                        createBitmap = bitmap;
                        f = f2;
                        paint3 = paint;
                        arrayList2 = arrayList;
                    }
                    z = true;
                    i2++;
                    z2 = z;
                    L = i;
                    createBitmap = bitmap;
                    f = f2;
                    paint3 = paint;
                    arrayList2 = arrayList;
                }
            }
            return createBitmap;
        }
        return null;
    }

    public static void W(Notification notification, an7 an7Var, boolean z) {
        if (z) {
            an7Var.y = k0;
        } else {
            an7Var.y = notification.getChannelId();
        }
    }

    public static int a(java.util.ArrayList r3, defpackage.k47 r4, long r5, boolean r7, android.content.SharedPreferences r8) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lo7.a(java.util.ArrayList, k47, long, boolean, android.content.SharedPreferences):int");
    }

    public static void c() {
        String str;
        SharedPreferences sharedPreferences;
        if (Build.VERSION.SDK_INT >= 26) {
            String str2 = k0;
            if (str2 == null) {
                sharedPreferences = a.b.getSharedPreferences("Notifications", 0);
                str = sharedPreferences.getString("OtherKey", "Other3");
                k0 = str;
            } else {
                str = str2;
                sharedPreferences = null;
            }
            NotificationChannel notificationChannel = n0.getNotificationChannel(str);
            if (notificationChannel != null && notificationChannel.getImportance() == 0) {
                try {
                    n0.deleteNotificationChannel(k0);
                } catch (Exception e) {
                    fc4.g(e, true);
                }
                k0 = null;
                notificationChannel = null;
            }
            if (k0 == null) {
                if (sharedPreferences == null) {
                    sharedPreferences = a.b.getSharedPreferences("Notifications", 0);
                }
                k0 = "Other" + Utilities.b.nextLong();
                sharedPreferences.edit().putString("OtherKey", k0).commit();
            }
            String M0 = jb6.M0(2131748946, null);
            if (notificationChannel != null && !TextUtils.equals(notificationChannel.getName(), M0)) {
                notificationChannel.setName(M0);
                try {
                    n0.createNotificationChannel(notificationChannel);
                } catch (Exception e2) {
                    fc4.g(e2, true);
                }
            }
            if (notificationChannel == null) {
                fl.g();
                NotificationChannel notificationChannel2 = new NotificationChannel(k0, M0, 3);
                notificationChannel2.enableLights(false);
                notificationChannel2.enableVibration(false);
                notificationChannel2.setSound(null, null);
                try {
                    n0.createNotificationChannel(notificationChannel2);
                } catch (Exception e3) {
                    fc4.g(e3, true);
                }
            }
        }
    }

    public static String e(String str) {
        if (str == null) {
            return null;
        }
        int indexOf = str.indexOf(32);
        if (indexOf >= 0) {
            String substring = str.substring(0, indexOf);
            String str2 = "…";
            if (!str.endsWith("…")) {
                str2 = "";
            }
            return substring.concat(str2);
        }
        return str;
    }

    public static String k(int i) {
        if (i == 0) {
            return "EnableGroup2";
        }
        if (i == 1) {
            return "EnableAll2";
        }
        return "EnableChannel2";
    }

    public static String l(k47 k47Var, String str) {
        boolean z;
        int i;
        TLRPC.Message message = k47Var.k;
        TLRPC.TL_messageActionGramTransfer tL_messageActionGramTransfer = (TLRPC.TL_messageActionGramTransfer) message.action;
        boolean C = m9c.C(k47.B0(message));
        if (C && !TextUtils.isEmpty(tL_messageActionGramTransfer.onramp_provider_name)) {
            return jb6.a0(null, null, 2131747770, c.w(tL_messageActionGramTransfer.amount, false), l53.d(tL_messageActionGramTransfer.onramp_provider_name, Locale.getDefault()));
        }
        if (!tL_messageActionGramTransfer.comment_encrypted && !TextUtils.isEmpty(tL_messageActionGramTransfer.comment)) {
            z = true;
        } else {
            z = false;
        }
        if (C) {
            if (z) {
                i = 2131747768;
            } else {
                i = 2131747769;
            }
        } else if (z) {
            i = 2131747771;
        } else {
            i = 2131747772;
        }
        return jb6.a0(null, null, i, str, c.w(tL_messageActionGramTransfer.amount, false), tL_messageActionGramTransfer.comment);
    }

    public static TLRPC.NotificationSound m(SharedPreferences sharedPreferences, String str, String str2, String str3) {
        long j = sharedPreferences.getLong(str2, 0L);
        String string = sharedPreferences.getString(str3, "NoSound");
        if (j != 0) {
            TLRPC.TL_notificationSoundRingtone tL_notificationSoundRingtone = new TLRPC.TL_notificationSoundRingtone();
            tL_notificationSoundRingtone.id = j;
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

    public static lo7 n(int i) {
        lo7 lo7Var;
        lo7 lo7Var2 = q0[i];
        if (lo7Var2 == null) {
            synchronized (r0[i]) {
                lo7Var = q0[i];
                if (lo7Var == null) {
                    lo7[] lo7VarArr = q0;
                    lo7 lo7Var3 = new lo7(i);
                    lo7VarArr[i] = lo7Var3;
                    lo7Var = lo7Var3;
                }
            }
            return lo7Var;
        }
        return lo7Var2;
    }

    public static String p(long j, long j2, boolean z) {
        String valueOf;
        if (z) {
            if (j2 != 0) {
                Locale locale = Locale.US;
                return j + "_" + j2;
            }
            return String.valueOf(j);
        }
        long j3 = (j2 << 12) + j;
        vh6 vh6Var = s0;
        int h = vh6Var.h(j3);
        if (h >= 0) {
            return (String) vh6Var.n(h);
        }
        if (j2 != 0) {
            Locale locale2 = Locale.US;
            valueOf = j + "_" + j2;
        } else {
            valueOf = String.valueOf(j);
        }
        vh6Var.k(valueOf, j3);
        return valueOf;
    }

    public static boolean y(k47 k47Var) {
        TLRPC.MessageAction messageAction;
        TLRPC.Message message = k47Var.k;
        TLRPC.Peer peer = message.peer_id;
        if ((peer != null && peer.chat_id == 0 && peer.channel_id == 0 && ((messageAction = message.action) == null || (messageAction instanceof TLRPC.TL_messageActionEmpty))) || k47Var.J) {
            return true;
        }
        return false;
    }

    public final void A() {
        try {
            SharedPreferences d = getAccountInstance().d();
            Map<String, ?> all = d.getAll();
            SharedPreferences.Editor edit = d.edit();
            for (Map.Entry<String, ?> entry : all.entrySet()) {
                String key = entry.getKey();
                if (key.startsWith("org.telegram.key")) {
                    if (!key.endsWith("_s")) {
                        String str = (String) entry.getValue();
                        n0.deleteNotificationChannel(str);
                        if (e21.a) {
                            fc4.b("delete all channel " + str);
                        }
                    }
                    edit.remove(key);
                }
            }
            edit.commit();
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    public final void C(ArrayList arrayList, vh6 vh6Var, ArrayList arrayList2, Collection collection) {
        long j;
        long j2;
        boolean z;
        int i;
        int i2;
        int i3;
        int intValue;
        long j3;
        boolean z2;
        int i4;
        TLRPC.MessageFwdHeader messageFwdHeader;
        long j4;
        long j5;
        TLRPC.Message message;
        long j6;
        TLRPC.Message message2;
        SparseArray sparseArray;
        k47 k47Var;
        long j7;
        boolean z3;
        boolean z4;
        SparseArray sparseArray2;
        int intValue2;
        this.f.b();
        this.a.clear();
        this.c.b();
        this.E.clear();
        this.F.b();
        boolean z5 = false;
        this.J = 0;
        this.K = 0;
        getAccountInstance().d();
        vh6 vh6Var2 = new vh6();
        for (int i5 = 0; i5 < arrayList.size(); i5++) {
            TLRPC.Message message3 = (TLRPC.Message) arrayList.get(i5);
            if (message3 != null && ((messageFwdHeader = message3.fwd_from) == null || !messageFwdHeader.imported)) {
                TLRPC.MessageAction messageAction = message3.action;
                if (!(messageAction instanceof TLRPC.TL_messageActionSetMessagesTTL) && (!message3.silent || (!(messageAction instanceof TLRPC.TL_messageActionContactSignUp) && !(messageAction instanceof TLRPC.TL_messageActionUserJoined)))) {
                    long j8 = message3.peer_id.channel_id;
                    if (j8 != 0) {
                        j4 = -j8;
                    } else {
                        j4 = 0;
                    }
                    SparseArray sparseArray3 = (SparseArray) this.c.f(j4);
                    if (sparseArray3 == null || sparseArray3.indexOfKey(message3.id) < 0) {
                        k47 k47Var2 = new k47(this.currentAccount, message3, false, false);
                        if (y(k47Var2)) {
                            this.K++;
                        }
                        long B0 = k47.B0(k47Var2.k);
                        long b2 = k47.b2(this.currentAccount, k47Var2.k, getMessagesController().t2(k47Var2), false);
                        if (k47Var2.k.mentioned) {
                            message = message3;
                            j6 = k47Var2.Z0();
                            j5 = j4;
                        } else {
                            j5 = j4;
                            message = message3;
                            j6 = B0;
                        }
                        int h = vh6Var2.h(j6);
                        if (h >= 0 && b2 == 0) {
                            z4 = ((Boolean) vh6Var2.n(h)).booleanValue();
                            message2 = message;
                            sparseArray = sparseArray3;
                            k47Var = k47Var2;
                            j7 = j5;
                        } else {
                            int o = o(j6, b2);
                            if (o == -1) {
                                message2 = message;
                                sparseArray = sparseArray3;
                                j7 = j5;
                                z4 = x(j6, null, k47Var2.I, k47Var2.J);
                                k47Var = k47Var2;
                            } else {
                                message2 = message;
                                sparseArray = sparseArray3;
                                k47Var = k47Var2;
                                j7 = j5;
                                if (o != 2) {
                                    z3 = true;
                                } else {
                                    z3 = false;
                                }
                                z4 = z3;
                            }
                            vh6Var2.k(Boolean.valueOf(z4), j6);
                        }
                        if (z4 && (j6 != this.G || !a.w)) {
                            if (sparseArray == null) {
                                sparseArray2 = new SparseArray();
                                this.c.k(sparseArray2, j7);
                            } else {
                                sparseArray2 = sparseArray;
                            }
                            sparseArray2.put(message2.id, k47Var);
                            b(k47Var);
                            if (B0 != j6) {
                                Integer num = (Integer) this.r.f(B0);
                                vh6 vh6Var3 = this.r;
                                if (num == null) {
                                    intValue2 = 1;
                                } else {
                                    intValue2 = num.intValue() + 1;
                                }
                                vh6Var3.k(Integer.valueOf(intValue2), B0);
                            }
                        }
                    }
                }
            }
        }
        long j9 = 0;
        int i6 = 0;
        while (i6 < vh6Var.m()) {
            long j10 = vh6Var.j(i6);
            int h2 = vh6Var2.h(j10);
            if (h2 >= 0) {
                z2 = ((Boolean) vh6Var2.n(h2)).booleanValue();
            } else {
                int o2 = o(j10, j9);
                if (o2 == -1) {
                    z2 = x(j10, null, false, false);
                } else if (o2 != 2) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                vh6Var2.k(Boolean.valueOf(z2), j10);
            }
            if (z2) {
                Integer num2 = (Integer) vh6Var.n(i6);
                int intValue3 = num2.intValue();
                this.f.k(num2, j10);
                if (!getMessagesController().m2(j10)) {
                    boolean s2 = getMessagesController().s2(j10);
                    int i7 = this.J;
                    if (s2) {
                        if (intValue3 > 0) {
                            i4 = 1;
                        } else {
                            i4 = 0;
                        }
                        this.J = i7 + i4;
                    } else {
                        this.J = i7 + intValue3;
                    }
                }
            }
            i6++;
            j9 = 0;
        }
        for (int i8 = 0; i8 < arrayList2.size(); i8++) {
            k47 k47Var3 = (k47) arrayList2.get(i8);
            int e1 = k47Var3.e1();
            if (this.c.h(e1) < 0) {
                if (y(k47Var3)) {
                    this.K++;
                }
                long B02 = k47.B0(k47Var3.k);
                long b22 = k47.b2(this.currentAccount, k47Var3.k, getMessagesController().t2(k47Var3), false);
                TLRPC.Message message4 = k47Var3.k;
                long j11 = message4.random_id;
                if (message4.mentioned) {
                    j = k47Var3.Z0();
                } else {
                    j = B02;
                }
                int h3 = vh6Var2.h(j);
                if (h3 >= 0 && b22 == 0) {
                    long j12 = j;
                    z = ((Boolean) vh6Var2.n(h3)).booleanValue();
                    j2 = j12;
                } else {
                    int o3 = o(j, b22);
                    if (o3 == -1) {
                        j2 = j;
                        z = x(j2, null, k47Var3.I, k47Var3.J);
                    } else {
                        j2 = j;
                        if (o3 != 2) {
                            z = true;
                        } else {
                            z = false;
                        }
                    }
                    vh6Var2.k(Boolean.valueOf(z), j2);
                }
                if (z && (j2 != this.G || !a.w)) {
                    if (e1 != 0) {
                        boolean z6 = k47Var3.J;
                        TLRPC.Message message5 = k47Var3.k;
                        if (z6) {
                            j3 = k47.B0(message5);
                        } else {
                            long j13 = message5.peer_id.channel_id;
                            if (j13 != 0) {
                                j3 = -j13;
                            } else {
                                j3 = 0;
                            }
                        }
                        SparseArray sparseArray4 = (SparseArray) this.c.f(j3);
                        if (sparseArray4 == null) {
                            sparseArray4 = new SparseArray();
                            this.c.k(sparseArray4, j3);
                        }
                        sparseArray4.put(e1, k47Var3);
                    } else if (j11 != 0) {
                        this.d.k(k47Var3, j11);
                    }
                    b(k47Var3);
                    if (B02 != j2) {
                        Integer num3 = (Integer) this.r.f(B02);
                        vh6 vh6Var4 = this.r;
                        if (num3 == null) {
                            intValue = 1;
                        } else {
                            intValue = num3.intValue() + 1;
                        }
                        vh6Var4.k(Integer.valueOf(intValue), B02);
                    }
                    Integer num4 = (Integer) this.f.f(j2);
                    if (num4 != null) {
                        i = num4.intValue() + 1;
                    } else {
                        i = 1;
                    }
                    if (!getMessagesController().m2(j2)) {
                        if (getMessagesController().s2(j2)) {
                            if (num4 != null) {
                                int i9 = this.J;
                                if (num4.intValue() > 0) {
                                    i3 = 1;
                                } else {
                                    i3 = 0;
                                }
                                this.J = i9 - i3;
                            }
                            int i10 = this.J;
                            if (i > 0) {
                                i2 = 1;
                            } else {
                                i2 = 0;
                            }
                            this.J = i10 + i2;
                        } else {
                            if (num4 != null) {
                                this.J -= num4.intValue();
                            }
                            this.J += i;
                        }
                    }
                    this.f.k(Integer.valueOf(i), j2);
                }
            }
        }
        if (collection != null) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                ko7 ko7Var = (ko7) it.next();
                long j14 = ko7Var.a;
                ko7 ko7Var2 = (ko7) this.F.f(j14);
                if (ko7Var2 != null) {
                    ko7Var2.c.putAll(ko7Var.c);
                } else {
                    this.E.add(ko7Var);
                    this.F.k(ko7Var, j14);
                }
            }
            Collections.sort(this.E, Comparator$CC.comparingLong(new te((byte) 3)));
        }
        gm.c3(new fo7(this, this.f.m(), (byte) 4));
        if (SystemClock.elapsedRealtime() / 1000 < 60) {
            z5 = true;
        }
        Z(z5);
        if (this.S) {
            S(t());
        }
    }

    public final void D(java.util.ArrayList r43, java.util.ArrayList r44, boolean r45, boolean r46, java.util.concurrent.CountDownLatch r47) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lo7.D(java.util.ArrayList, java.util.ArrayList, boolean, boolean, java.util.concurrent.CountDownLatch):void");
    }

    public final void E(long j, String str) {
        boolean z;
        String M0;
        if (getUserConfig().o()) {
            if (gda.M0 || this.currentAccount == z8c.t0) {
                try {
                    String str2 = "wallet_tonconnect_" + this.currentAccount;
                    if (Build.VERSION.SDK_INT >= 26) {
                        NotificationManager notificationManager = n0;
                        fl.g();
                        notificationManager.createNotificationChannel(new NotificationChannel(str2, "TON Connect", 3));
                    }
                    if (!gm.n2(false) && !gda.B && getAccountInstance().d().getBoolean("EnablePreviewAll", true)) {
                        z = false;
                    } else {
                        z = true;
                    }
                    if (!TextUtils.isEmpty(str) && !z) {
                        M0 = jb6.a0(null, null, 2131747658, str);
                    } else {
                        M0 = jb6.M0(2131747659, null);
                    }
                    Intent intent = new Intent(a.b, LaunchActivity.class);
                    intent.setAction("android.intent.action.VIEW");
                    intent.setData(Uri.parse("tg://resolve?domain=sendgrams"));
                    intent.putExtra("currentAccount", this.currentAccount);
                    intent.addFlags(67108864);
                    PendingIntent activity = PendingIntent.getActivity(a.b, this.currentAccount, intent, 201326592);
                    an7 an7Var = new an7(a.b, str2);
                    an7Var.F.icon = 2131232469;
                    an7Var.e = an7.c(jb6.M0(2131689472, null));
                    an7Var.f = an7.c(M0);
                    vm7 vm7Var = new vm7((byte) 0);
                    vm7Var.f = an7.c(M0);
                    an7Var.i(vm7Var);
                    an7Var.u = "event";
                    an7Var.x = 0;
                    an7Var.F.when = j;
                    an7Var.f(16, true);
                    an7Var.g = activity;
                    m0.e("wallet_tonconnect", this.currentAccount, an7Var.b());
                } catch (Exception e) {
                    fc4.g(e, true);
                }
            }
        }
    }

    public final void G(long j, long j2, boolean z) {
        boolean z2;
        int i = this.currentAccount;
        if (z) {
            n(i).H(j, Integer.MAX_VALUE, j2);
            return;
        }
        boolean x = n(i).x(j, null, false, false);
        int i2 = (j2 > 0L ? 1 : (j2 == 0L ? 0 : -1));
        if (i2 != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        SharedPreferences.Editor edit = oc7.r1(this.currentAccount).W3.edit();
        if (x && !z2) {
            edit.remove("notify2_" + p(j, j2, false));
        } else {
            edit.putInt("notify2_" + p(j, j2, false), 0);
        }
        if (i2 == 0) {
            getMessagesStorage().B1(j, 0L);
            TLRPC.Dialog dialog = (TLRPC.Dialog) getMessagesController().R.f(j);
            if (dialog != null) {
                dialog.notify_settings = new TLRPC.TL_peerNotifySettings();
            }
        }
        edit.apply();
        c0(j, j2, true);
    }

    public final void H(long j, int i, long j2) {
        boolean z;
        long j3 = 0;
        if (j != 0) {
            SharedPreferences.Editor edit = oc7.r1(this.currentAccount).W3.edit();
            int i2 = (j2 > 0L ? 1 : (j2 == 0L ? 0 : -1));
            if (i2 != 0) {
                z = true;
            } else {
                z = false;
            }
            boolean x = n(this.currentAccount).x(j, null, false, false);
            String p = p(j, j2, false);
            if (i == Integer.MAX_VALUE) {
                if (!x && !z) {
                    edit.remove("notify2_" + p);
                } else {
                    edit.putInt("notify2_" + p, 2);
                    j3 = 1L;
                }
            } else {
                edit.putInt("notify2_" + p, 3);
                edit.putInt("notifyuntil_" + p, getConnectionsManager().getCurrentTime() + i);
                j3 = (((long) i) << 32) | 1;
            }
            edit.apply();
            if (i2 == 0) {
                n(this.currentAccount).N(j);
                cf7.Y(this.currentAccount).B1(j, j3);
                TLRPC.Dialog dialog = (TLRPC.Dialog) oc7.r1(this.currentAccount).R.f(j);
                if (dialog != null) {
                    TLRPC.TL_peerNotifySettings tL_peerNotifySettings = new TLRPC.TL_peerNotifySettings();
                    dialog.notify_settings = tL_peerNotifySettings;
                    if (i != Integer.MAX_VALUE || x) {
                        tL_peerNotifySettings.mute_until = i;
                    }
                }
            }
            n(this.currentAccount).c0(j, j2, true);
        }
    }

    public final Pair I(ArrayList arrayList, ArrayList arrayList2) {
        String str;
        TLRPC.FileLocation fileLocation;
        ArrayList arrayList3 = this.E;
        int min = Math.min(3, arrayList3.size());
        boolean z = false;
        int i = 0;
        for (int i2 = 0; i2 < min; i2++) {
            ko7 ko7Var = (ko7) arrayList3.get(i2);
            HashMap hashMap = ko7Var.c;
            long j = ko7Var.a;
            i += hashMap.size();
            z |= ko7Var.d;
            TLRPC.User W1 = getMessagesController().W1(Long.valueOf(j));
            if (W1 == null && (W1 = getMessagesStorage().h0(j)) != null) {
                getMessagesController().c4(W1, true, false);
            }
            File file = null;
            if (W1 != null) {
                str = m9c.r(W1);
                TLRPC.UserProfilePhoto userProfilePhoto = W1.photo;
                if (userProfilePhoto != null && (fileLocation = userProfilePhoto.photo_small) != null && fileLocation.volume_id != 0 && fileLocation.local_id != 0) {
                    bc4 fileLoader = getFileLoader();
                    TLRPC.FileLocation fileLocation2 = W1.photo.photo_small;
                    fileLoader.getClass();
                    File J = bc4.J(fileLocation2, null, true, true);
                    if (!J.exists()) {
                        if (W1.photo.photo_big != null) {
                            bc4 fileLoader2 = getFileLoader();
                            TLRPC.FileLocation fileLocation3 = W1.photo.photo_big;
                            fileLoader2.getClass();
                            J = bc4.J(fileLocation3, null, true, true);
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
                str = ko7Var.b;
                if (str == null) {
                }
            }
            if (str.length() > 50) {
                str = str.substring(0, 25).concat("…");
            }
            arrayList.add(str);
            if (file == null) {
                if (W1 != null) {
                    arrayList2.add(W1);
                }
            } else {
                arrayList2.add(file);
            }
        }
        if (z) {
            arrayList2.clear();
        }
        return new Pair(Integer.valueOf(i), Boolean.valueOf(z));
    }

    public final void J(LongSparseIntArray longSparseIntArray) {
        l0.c(new eo7(this, longSparseIntArray, new ArrayList(), (byte) 0));
    }

    public final void K(ArrayList arrayList, boolean z, boolean z2, CountDownLatch countDownLatch) {
        boolean z3;
        boolean z4;
        if (e21.a) {
            StringBuilder sb = new StringBuilder("NotificationsController: processNewMessages msgs.size()=");
            sb.append(Integer.valueOf(arrayList.size()));
            sb.append(" isLast=");
            z3 = z;
            sb.append(z3);
            sb.append(" isFcm=");
            z4 = z2;
            sb.append(z4);
            sb.append(")");
            fc4.b(sb.toString());
        } else {
            z3 = z;
            z4 = z2;
        }
        int i = 0;
        while (i < arrayList.size()) {
            k47 k47Var = (k47) arrayList.get(i);
            if (k47Var != null && k47Var.k != null && !k47Var.O3()) {
                TLRPC.MessageAction messageAction = k47Var.k.action;
                if (messageAction instanceof TLRPC.TL_messageActionConferenceCall) {
                    TLRPC.TL_messageActionConferenceCall tL_messageActionConferenceCall = (TLRPC.TL_messageActionConferenceCall) messageAction;
                    if (!tL_messageActionConferenceCall.active && !tL_messageActionConferenceCall.missed && getConnectionsManager().getCurrentTime() - k47Var.k.date < getMessagesController().a3 / 1000) {
                        HashSet hashSet = new HashSet();
                        hashSet.add(Long.valueOf(k47.B0(k47Var.k)));
                        ArrayList<TLRPC.Peer> arrayList2 = tL_messageActionConferenceCall.other_participants;
                        int size = arrayList2.size();
                        int i2 = 0;
                        while (i2 < size) {
                            TLRPC.Peer peer = arrayList2.get(i2);
                            i2++;
                            hashSet.add(Long.valueOf(pg3.n(peer)));
                        }
                        StringBuilder sb2 = new StringBuilder();
                        Iterator it = hashSet.iterator();
                        while (it.hasNext()) {
                            long longValue = ((Long) it.next()).longValue();
                            if (sb2.length() > 0) {
                                sb2.append(", ");
                            }
                            sb2.append(pg3.r(this.currentAccount, longValue));
                        }
                        VoIPGroupNotification.request(a.b, this.currentAccount, k47.B0(k47Var.k), sb2.toString(), tL_messageActionConferenceCall.call_id, k47Var.e1(), tL_messageActionConferenceCall.video);
                        arrayList.remove(i);
                        i--;
                    } else {
                        VoIPGroupNotification.hide(a.b, this.currentAccount, k47Var.e1());
                    }
                }
            }
            i++;
        }
        if (arrayList.isEmpty()) {
            if (countDownLatch != null) {
                countDownLatch.countDown();
                return;
            }
            return;
        }
        l0.c(new ea7(this, arrayList, new ArrayList(0), z4, z3, countDownLatch, (byte) 2));
    }

    public final void L(LongSparseIntArray longSparseIntArray, long j, int i, int i2, boolean z) {
        l0.c(new bq6(this, longSparseIntArray, new ArrayList(0), j, i2, i, z));
    }

    public final void M(vh6 vh6Var, boolean z) {
        l0.c(new eb7(this, vh6Var, z, new ArrayList(0), (byte) 3));
    }

    public final void N(long j) {
        L(null, j, 0, Integer.MAX_VALUE, false);
        LongSparseIntArray longSparseIntArray = new LongSparseIntArray();
        longSparseIntArray.put(j, 0);
        J(longSparseIntArray);
    }

    public final String O(k47 k47Var) {
        String str;
        TLRPC.Message message = k47Var.k;
        if (message != null && (str = message.message) != null && message.entities != null) {
            StringBuilder sb = new StringBuilder(str);
            if (k47Var.K2) {
                return sb.toString();
            }
            for (int i = 0; i < k47Var.k.entities.size(); i++) {
                if (k47Var.k.entities.get(i) instanceof TLRPC.TL_messageEntitySpoiler) {
                    TLRPC.TL_messageEntitySpoiler tL_messageEntitySpoiler = (TLRPC.TL_messageEntitySpoiler) k47Var.k.entities.get(i);
                    for (int i2 = 0; i2 < tL_messageEntitySpoiler.length; i2++) {
                        char[] cArr = this.i0;
                        sb.setCharAt(tL_messageEntitySpoiler.offset + i2, cArr[i2 % cArr.length]);
                    }
                }
            }
            return sb.toString();
        }
        return null;
    }

    public final void P(an7 an7Var, long j, long j2, String str, long[] jArr, int i, Uri uri, int i2, boolean z, boolean z2, boolean z3, int i3) {
        fc4.b("resetNotificationSound");
        Uri uri2 = Settings.System.DEFAULT_RINGTONE_URI;
        if (uri2 != null && uri != null && !TextUtils.equals(uri2.toString(), uri.toString())) {
            SharedPreferences.Editor edit = getAccountInstance().d().edit();
            String uri3 = uri2.toString();
            String M0 = jb6.M0(2131751536, null);
            if (z) {
                if (i3 == 2) {
                    edit.putString("ChannelSound", M0);
                } else if (i3 == 0) {
                    edit.putString("GroupSound", M0);
                } else if (i3 == 1) {
                    edit.putString("GlobalSound", M0);
                } else if (i3 == 3) {
                    edit.putString("StoriesSound", M0);
                } else if (i3 == 4 || i3 == 5) {
                    edit.putString("ReactionSound", M0);
                }
                if (i3 == 2) {
                    edit.putString("ChannelSoundPath", uri3);
                } else if (i3 == 0) {
                    edit.putString("GroupSoundPath", uri3);
                } else if (i3 == 1) {
                    edit.putString("GlobalSoundPath", uri3);
                } else if (i3 == 3) {
                    edit.putString("StoriesSoundPath", uri3);
                } else if (i3 == 4 || i3 == 5) {
                    edit.putString("ReactionSound", uri3);
                }
                getNotificationsController().h(i3);
            } else {
                edit.putString("sound_" + p(j, j2, false), M0);
                edit.putString("sound_path_" + p(j, j2, false), uri3);
                i(j, j2);
            }
            edit.commit();
            an7Var.y = e0(j, j2, str, jArr, i, uri2, i2, z, z2, z3, i3);
            m0.e(null, this.e0, an7Var.b());
        }
    }

    public final void Q(boolean z) {
        int i;
        zn7 zn7Var = this.V;
        try {
            if (e21.a) {
                fc4.b("delay notification start, onlineReason = " + z);
            }
            this.W.acquire(10000L);
            mp3 mp3Var = l0;
            mp3Var.a(zn7Var);
            if (z) {
                i = 3000;
            } else {
                i = 1000;
            }
            mp3Var.d(zn7Var, i);
        } catch (Exception e) {
            fc4.g(e, true);
            Z(this.L);
        }
    }

    public final void R() {
        try {
            Intent intent = new Intent(a.b, NotificationRepeat.class);
            intent.putExtra("currentAccount", this.currentAccount);
            PendingIntent service = PendingIntent.getService(a.b, 0, intent, 33554432);
            int i = getAccountInstance().d().getInt("repeat_messages", 60);
            if (i > 0 && this.K > 0) {
                this.d0.set(2, SystemClock.elapsedRealtime() + (i * 60000), service);
            } else {
                this.d0.cancel(service);
            }
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    public final void S(int i) {
        if (this.O != i) {
            fc4.b("setBadge " + i);
            this.O = i;
            try {
                if (dm7.c == null && !dm7.b) {
                    dm7.b();
                    dm7.b = true;
                }
                bm7 bm7Var = dm7.c;
                if (bm7Var != null) {
                    bm7Var.a(i);
                }
            } catch (Throwable unused) {
            }
        }
    }

    public final void T(long j, int i, long j2) {
        SharedPreferences.Editor edit = getAccountInstance().d().edit();
        TLRPC.Dialog dialog = (TLRPC.Dialog) oc7.r1(z8c.t0).R.f(j);
        if (i == 4) {
            if (x(j, null, false, false)) {
                edit.remove("notify2_" + p(j, j2, false));
            } else {
                edit.putInt("notify2_" + p(j, j2, false), 0);
            }
            getMessagesStorage().B1(j, 0L);
            if (dialog != null) {
                dialog.notify_settings = new TLRPC.TL_peerNotifySettings();
            }
        } else {
            int currentTime = ConnectionsManager.getInstance(z8c.t0).getCurrentTime();
            if (i == 0) {
                currentTime += 3600;
            } else if (i == 1) {
                currentTime += 28800;
            } else if (i == 2) {
                currentTime += 172800;
            } else if (i == 3) {
                currentTime = Integer.MAX_VALUE;
            }
            long j3 = 1;
            if (i == 3) {
                edit.putInt("notify2_" + p(j, j2, false), 2);
            } else {
                edit.putInt("notify2_" + p(j, j2, false), 3);
                edit.putInt("notifyuntil_" + p(j, j2, false), currentTime);
                j3 = 1 | (((long) currentTime) << 32);
            }
            n(z8c.t0).N(j);
            cf7.Y(z8c.t0).B1(j, j3);
            if (dialog != null) {
                TLRPC.TL_peerNotifySettings tL_peerNotifySettings = new TLRPC.TL_peerNotifySettings();
                dialog.notify_settings = tL_peerNotifySettings;
                tL_peerNotifySettings.mute_until = currentTime;
            }
        }
        edit.commit();
        c0(j, j2, true);
    }

    public final void U(int i, int i2) {
        getAccountInstance().d().edit().putInt(k(i), i2).commit();
        b0(i);
        cf7 messagesStorage = getMessagesStorage();
        messagesStorage.a.c(new xd7(messagesStorage, (byte) 26));
        g(i);
    }

    public final void V(int i) {
        l0.c(new fo7(this, i, (byte) 7));
    }

    public final void X(defpackage.an7 r89, java.lang.String r90, long r91, long r93, java.lang.String r95, long[] r96, int r97, android.net.Uri r98, int r99, boolean r100, boolean r101, boolean r102, int r103) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lo7.X(an7, java.lang.String, long, long, java.lang.String, long[], int, android.net.Uri, int, boolean, boolean, boolean, int):void");
    }

    public final void Y() {
        l0.c(new zn7(this, (byte) 3));
    }

    public final void Z(boolean r54) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lo7.Z(boolean):void");
    }

    public final void a0(long j, String str) {
        l0.c(new hq6(this, str, j, (byte) 21));
    }

    public final void b(k47 k47Var) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.a;
            if (i < arrayList.size()) {
                if (((k47) arrayList.get(i)).e1() == k47Var.e1() && k47.B0(((k47) arrayList.get(i)).k) == k47.B0(k47Var.k) && ((k47) arrayList.get(i)).K == k47Var.K) {
                    return;
                }
                i++;
            } else {
                arrayList.add(0, k47Var);
                return;
            }
        }
    }

    public final void b0(int i) {
        SharedPreferences d = getAccountInstance().d();
        if (i != 4 && i != 5) {
            TL_account.updateNotifySettings updatenotifysettings = new TL_account.updateNotifySettings();
            TLRPC.TL_inputPeerNotifySettings tL_inputPeerNotifySettings = new TLRPC.TL_inputPeerNotifySettings();
            updatenotifysettings.settings = tL_inputPeerNotifySettings;
            tL_inputPeerNotifySettings.flags = 5;
            if (i == 0) {
                updatenotifysettings.peer = new TLRPC.TL_inputNotifyChats();
                updatenotifysettings.settings.mute_until = d.getInt("EnableGroup2", 0);
                updatenotifysettings.settings.show_previews = d.getBoolean("EnablePreviewGroup", true);
                TLRPC.TL_inputPeerNotifySettings tL_inputPeerNotifySettings2 = updatenotifysettings.settings;
                tL_inputPeerNotifySettings2.flags |= 8;
                tL_inputPeerNotifySettings2.sound = m(d, "GroupSound", "GroupSoundDocId", "GroupSoundPath");
            } else if (i != 1 && i != 3) {
                updatenotifysettings.peer = new TLRPC.TL_inputNotifyBroadcasts();
                updatenotifysettings.settings.mute_until = d.getInt("EnableChannel2", 0);
                updatenotifysettings.settings.show_previews = d.getBoolean("EnablePreviewChannel", true);
                TLRPC.TL_inputPeerNotifySettings tL_inputPeerNotifySettings3 = updatenotifysettings.settings;
                tL_inputPeerNotifySettings3.flags |= 8;
                tL_inputPeerNotifySettings3.sound = m(d, "ChannelSound", "ChannelSoundDocId", "ChannelSoundPath");
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
                tL_inputPeerNotifySettings6.sound = m(d, "GlobalSound", "GlobalSoundDocId", "GlobalSoundPath");
                TLRPC.TL_inputPeerNotifySettings tL_inputPeerNotifySettings7 = updatenotifysettings.settings;
                tL_inputPeerNotifySettings7.flags |= 256;
                tL_inputPeerNotifySettings7.stories_sound = m(d, "StoriesSound", "StoriesSoundDocId", "StoriesSoundPath");
            }
            getConnectionsManager().sendRequest(updatenotifysettings, new nf2((byte) 0));
            return;
        }
        TL_account.setReactionsNotifySettings setreactionsnotifysettings = new TL_account.setReactionsNotifySettings();
        setreactionsnotifysettings.settings = new TL_account.TL_reactionsNotifySettings();
        if (d.getBoolean("EnableReactionsMessages", true)) {
            setreactionsnotifysettings.settings.flags |= 1;
            boolean z = d.getBoolean("EnableReactionsMessagesContacts", false);
            TL_account.TL_reactionsNotifySettings tL_reactionsNotifySettings = setreactionsnotifysettings.settings;
            if (z) {
                tL_reactionsNotifySettings.messages_notify_from = new TL_account.TL_reactionNotificationsFromContacts();
            } else {
                tL_reactionsNotifySettings.messages_notify_from = new TL_account.TL_reactionNotificationsFromAll();
            }
        }
        if (d.getBoolean("EnableReactionsStories", true)) {
            setreactionsnotifysettings.settings.flags |= 2;
            boolean z2 = d.getBoolean("EnableReactionsStoriesContacts", false);
            TL_account.TL_reactionsNotifySettings tL_reactionsNotifySettings2 = setreactionsnotifysettings.settings;
            if (z2) {
                tL_reactionsNotifySettings2.stories_notify_from = new TL_account.TL_reactionNotificationsFromContacts();
            } else {
                tL_reactionsNotifySettings2.stories_notify_from = new TL_account.TL_reactionNotificationsFromAll();
            }
        }
        setreactionsnotifysettings.settings.show_previews = d.getBoolean("EnableReactionsPreview", true);
        setreactionsnotifysettings.settings.sound = m(d, "ReactionSound", "ReactionSoundDocId", "ReactionSoundPath");
        getConnectionsManager().sendRequest(setreactionsnotifysettings, new nf2((byte) 0));
    }

    public final void c0(long j, long j2, boolean z) {
        int i;
        if (z) {
            getNotificationCenter().k(nm7.f0, new Object[0]);
        }
        if (pg3.B(j)) {
            return;
        }
        SharedPreferences d = getAccountInstance().d();
        TL_account.updateNotifySettings updatenotifysettings = new TL_account.updateNotifySettings();
        updatenotifysettings.settings = new TLRPC.TL_inputPeerNotifySettings();
        String p = p(j, j2, false);
        TLRPC.TL_inputPeerNotifySettings tL_inputPeerNotifySettings = updatenotifysettings.settings;
        tL_inputPeerNotifySettings.flags |= 1;
        tL_inputPeerNotifySettings.show_previews = d.getBoolean("content_preview_" + p, true);
        TLRPC.TL_inputPeerNotifySettings tL_inputPeerNotifySettings2 = updatenotifysettings.settings;
        tL_inputPeerNotifySettings2.flags = tL_inputPeerNotifySettings2.flags | 2;
        tL_inputPeerNotifySettings2.silent = d.getBoolean("silent_" + p, false);
        if (d.contains("stories_" + p)) {
            TLRPC.TL_inputPeerNotifySettings tL_inputPeerNotifySettings3 = updatenotifysettings.settings;
            tL_inputPeerNotifySettings3.flags |= 64;
            tL_inputPeerNotifySettings3.stories_muted = !d.getBoolean("stories_" + p, true);
        }
        int i2 = d.getInt("notify2_" + p(j, j2, false), -1);
        if (i2 != -1) {
            TLRPC.TL_inputPeerNotifySettings tL_inputPeerNotifySettings4 = updatenotifysettings.settings;
            tL_inputPeerNotifySettings4.flags |= 4;
            if (i2 == 3) {
                tL_inputPeerNotifySettings4.mute_until = d.getInt("notifyuntil_" + p(j, j2, false), 0);
            } else {
                if (i2 != 2) {
                    i = 0;
                } else {
                    i = Integer.MAX_VALUE;
                }
                tL_inputPeerNotifySettings4.mute_until = i;
            }
        }
        long j3 = d.getLong("sound_document_id_" + p(j, j2, false), 0L);
        String string = d.getString("sound_path_" + p(j, j2, false), null);
        TLRPC.TL_inputPeerNotifySettings tL_inputPeerNotifySettings5 = updatenotifysettings.settings;
        tL_inputPeerNotifySettings5.flags = tL_inputPeerNotifySettings5.flags | 8;
        if (j3 != 0) {
            TLRPC.TL_notificationSoundRingtone tL_notificationSoundRingtone = new TLRPC.TL_notificationSoundRingtone();
            tL_notificationSoundRingtone.id = j3;
            updatenotifysettings.settings.sound = tL_notificationSoundRingtone;
        } else if (string != null) {
            if (string.equalsIgnoreCase("NoSound")) {
                updatenotifysettings.settings.sound = new TLRPC.TL_notificationSoundNone();
            } else {
                TLRPC.TL_notificationSoundLocal tL_notificationSoundLocal = new TLRPC.TL_notificationSoundLocal();
                tL_notificationSoundLocal.title = d.getString("sound_" + p(j, j2, false), null);
                tL_notificationSoundLocal.data = string;
                updatenotifysettings.settings.sound = tL_notificationSoundLocal;
            }
        } else {
            tL_inputPeerNotifySettings5.sound = new TLRPC.TL_notificationSoundDefault();
        }
        if (j2 != 0 && j != getUserConfig().e()) {
            TLRPC.TL_inputNotifyForumTopic tL_inputNotifyForumTopic = new TLRPC.TL_inputNotifyForumTopic();
            tL_inputNotifyForumTopic.peer = getMessagesController().i1(j);
            tL_inputNotifyForumTopic.top_msg_id = (int) j2;
            updatenotifysettings.peer = tL_inputNotifyForumTopic;
        } else {
            int i3 = this.currentAccount;
            if (j < 0 && sd2.Y(oc7.r1(i3).L0(Long.valueOf(-j)))) {
                TLRPC.TL_inputNotifyCommunity tL_inputNotifyCommunity = new TLRPC.TL_inputNotifyCommunity();
                tL_inputNotifyCommunity.community = getMessagesController().g1(-j);
                updatenotifysettings.peer = tL_inputNotifyCommunity;
            } else {
                TLRPC.TL_inputNotifyPeer tL_inputNotifyPeer = new TLRPC.TL_inputNotifyPeer();
                tL_inputNotifyPeer.peer = getMessagesController().i1(j);
                updatenotifysettings.peer = tL_inputNotifyPeer;
            }
        }
        getConnectionsManager().sendRequest(updatenotifysettings, new nf2((byte) 0));
    }

    public final java.lang.String d(defpackage.an7 r18, long r19, java.lang.String r21, org.telegram.tgnet.TLRPC.User r22, org.telegram.tgnet.TLRPC.Chat r23, defpackage.n58 r24, boolean r25) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lo7.d(an7, long, java.lang.String, org.telegram.tgnet.TLRPC$User, org.telegram.tgnet.TLRPC$Chat, n58, boolean):java.lang.String");
    }

    public final void d0() {
        int i = 0;
        long j = Long.MAX_VALUE;
        while (true) {
            ArrayList arrayList = this.E;
            if (i >= arrayList.size()) {
                break;
            }
            for (Pair pair : ((ko7) arrayList.get(i)).c.values()) {
                j = Math.min(j, ((Long) pair.second).longValue());
            }
            i++;
        }
        mp3 mp3Var = l0;
        zn7 zn7Var = this.j0;
        mp3Var.a(zn7Var);
        long currentTimeMillis = j - System.currentTimeMillis();
        if (j != Long.MAX_VALUE) {
            mp3Var.d(zn7Var, Math.max(0L, currentTimeMillis));
        }
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == nm7.Y1) {
            l0.c(new bl7(this, (String) objArr[0], (byte) 7));
        }
    }

    public final java.lang.String e0(long r45, long r47, java.lang.String r49, long[] r50, int r51, android.net.Uri r52, int r53, boolean r54, boolean r55, boolean r56, int r57) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lo7.e0(long, long, java.lang.String, long[], int, android.net.Uri, int, boolean, boolean, boolean, int):java.lang.String");
    }

    public final void f(long j, long j2) {
        if (Build.VERSION.SDK_INT < 26) {
            return;
        }
        l0.c(new ao7(this, j, j2, (byte) 1));
    }

    public final void g(int i) {
        if (Build.VERSION.SDK_INT < 26) {
            return;
        }
        l0.c(new fo7(this, i, (byte) 8));
    }

    public final void h(int i) {
        String str;
        String str2;
        String str3;
        if (Build.VERSION.SDK_INT >= 26) {
            try {
                SharedPreferences d = getAccountInstance().d();
                SharedPreferences.Editor edit = d.edit();
                if (i == 2) {
                    str = "channels";
                } else if (i == 0) {
                    str = "groups";
                } else if (i == 3) {
                    str = "stories";
                } else if (i != 4 && i != 5) {
                    str = "private";
                } else {
                    str = "reactions";
                }
                String string = d.getString(str, null);
                if (string != null) {
                    edit.remove(str).remove(str.concat("_s"));
                    try {
                        n0.deleteNotificationChannel(string);
                    } catch (Exception e) {
                        fc4.g(e, true);
                    }
                    if (e21.a) {
                        fc4.b("delete channel global internal ".concat(string));
                    }
                }
                if (i == 2) {
                    str2 = "channels_ia";
                } else if (i == 0) {
                    str2 = "groups_ia";
                } else if (i == 3) {
                    str2 = "stories_ia";
                } else if (i != 4 && i != 5) {
                    str2 = "private_ia";
                } else {
                    str2 = "reactions_ia";
                }
                String string2 = d.getString(str2, null);
                if (string2 != null) {
                    edit.remove(str2).remove(str2.concat("_s"));
                    try {
                        n0.deleteNotificationChannel(string2);
                    } catch (Exception e2) {
                        fc4.g(e2, true);
                    }
                    if (e21.a) {
                        fc4.b("delete channel global internal ".concat(string2));
                    }
                }
                if (i == 2) {
                    str3 = "overwrite_channel";
                } else if (i == 0) {
                    str3 = "overwrite_group";
                } else if (i == 3) {
                    str3 = "overwrite_stories";
                } else if (i != 4 && i != 5) {
                    str3 = "overwrite_private";
                } else {
                    str3 = "overwrite_reactions";
                }
                edit.remove(str3);
                edit.commit();
            } catch (Exception e3) {
                fc4.g(e3, true);
            }
        }
    }

    public final void i(long j, long j2) {
        if (Build.VERSION.SDK_INT >= 26) {
            try {
                SharedPreferences d = getAccountInstance().d();
                SharedPreferences.Editor edit = d.edit();
                String str = "org.telegram.key" + j;
                if (j2 != 0) {
                    str = str + ".topic" + j2;
                }
                String string = d.getString(str, null);
                if (string != null) {
                    edit.remove(str).remove(str.concat("_s"));
                    try {
                        n0.deleteNotificationChannel(string);
                    } catch (Exception e) {
                        fc4.g(e, true);
                    }
                    if (e21.a) {
                        fc4.b("delete channel internal ".concat(string));
                    }
                }
                String str2 = "org.telegram.keyia" + j;
                String string2 = d.getString(str2, null);
                if (string2 != null) {
                    edit.remove(str2).remove(str2.concat("_s"));
                    try {
                        n0.deleteNotificationChannel(string2);
                    } catch (Exception e2) {
                        fc4.g(e2, true);
                    }
                    if (e21.a) {
                        fc4.b("delete channel internal ".concat(string2));
                    }
                }
                edit.commit();
            } catch (Exception e3) {
                fc4.g(e3, true);
            }
        }
    }

    public final void j() {
        vh6 vh6Var = this.h;
        fc4.b("NotificationsController dismissNotification");
        try {
            m0.b(this.e0, null);
            this.a.clear();
            this.c.b();
            this.n.b();
            for (int i = 0; i < vh6Var.m(); i++) {
                if (!this.y.contains(Long.valueOf(vh6Var.j(i)))) {
                    m0.b(((Integer) vh6Var.n(i)).intValue(), null);
                }
            }
            vh6Var.b();
            gm.c3(new bo6((byte) 6));
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    public final int o(long j, long j2) {
        int c = this.h0.c(-1, j, j2, "notify2_");
        if (c == 3 && this.h0.c(0, j, j2, "notifyuntil_") >= getConnectionsManager().getCurrentTime()) {
            return 2;
        }
        return c;
    }

    public final java.lang.String q(defpackage.k47 r31, java.lang.String[] r32, boolean[] r33) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lo7.q(k47, java.lang.String[], boolean[]):java.lang.String");
    }

    public final java.lang.String r(defpackage.k47 r30, boolean[] r31) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lo7.r(k47, boolean[]):java.lang.String");
    }

    public final String s(TLRPC.Chat chat) {
        if (chat == null) {
            return null;
        }
        if (chat.monoforum) {
            return no4.j(this.currentAccount, chat, false);
        }
        return chat.title;
    }

    public final int t() {
        int i = 0;
        for (int i2 = 0; i2 < 4; i2++) {
            if (z8c.h(i2).o() && (gda.M0 || z8c.t0 == i2)) {
                lo7 n = n(i2);
                if (n.S) {
                    boolean z = n.U;
                    boolean z2 = n.T;
                    if (z) {
                        if (z2) {
                            try {
                                ArrayList arrayList = new ArrayList(oc7.r1(i2).y);
                                int size = arrayList.size();
                                for (int i3 = 0; i3 < size; i3++) {
                                    TLRPC.Dialog dialog = (TLRPC.Dialog) arrayList.get(i3);
                                    if (dialog != null && pg3.y(dialog.id)) {
                                        TLRPC.Chat L0 = getMessagesController().L0(Long.valueOf(-dialog.id));
                                        if (!sd2.r0(L0)) {
                                            if (sd2.Y(L0)) {
                                            }
                                        }
                                    }
                                    if (dialog != null) {
                                        i += oc7.r1(i2).U0(dialog);
                                    }
                                }
                            } catch (Exception e) {
                                fc4.g(e, true);
                            }
                        } else {
                            i += n.J;
                        }
                    } else if (z2) {
                        try {
                            int size2 = oc7.r1(i2).y.size();
                            for (int i4 = 0; i4 < size2; i4++) {
                                TLRPC.Dialog dialog2 = (TLRPC.Dialog) oc7.r1(i2).y.get(i4);
                                if (pg3.y(dialog2.id)) {
                                    TLRPC.Chat L02 = getMessagesController().L0(Long.valueOf(-dialog2.id));
                                    if (!sd2.r0(L02)) {
                                        if (sd2.Y(L02)) {
                                        }
                                    }
                                }
                                if (oc7.r1(i2).U0(dialog2) != 0) {
                                    i++;
                                }
                            }
                        } catch (Exception e2) {
                            fc4.g(e2, false);
                        }
                    } else {
                        i += n.f.m();
                    }
                }
            }
        }
        return i;
    }

    public final boolean u() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.a;
            if (i >= arrayList.size()) {
                return false;
            }
            k47 k47Var = (k47) arrayList.get(i);
            long B0 = k47.B0(k47Var.k);
            if (!k47Var.I) {
                TLRPC.Message message = k47Var.k;
                if ((!message.mentioned || !(message.action instanceof TLRPC.TL_messageActionPinMessage)) && !pg3.B(B0) && ((k47Var.k.peer_id.channel_id == 0 || k47Var.z4()) && B0 != 489000 && B0 != 489001)) {
                    return true;
                }
            }
            i++;
        }
    }

    public final boolean v(int i) {
        if (i == 4) {
            return getAccountInstance().d().getBoolean("EnableReactionsMessages", true);
        }
        if (i == 5) {
            return getAccountInstance().d().getBoolean("EnableReactionsStories", true);
        }
        if (i == 3) {
            return getAccountInstance().d().getBoolean("EnableAllStories", true);
        }
        if (getAccountInstance().d().getInt(k(i), 0) < getConnectionsManager().getCurrentTime()) {
            return true;
        }
        return false;
    }

    public final boolean w(long j) {
        return x(j, null, false, false);
    }

    public final boolean x(long r1, java.lang.Boolean r3, boolean r4, boolean r5) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lo7.x(long, java.lang.Boolean, boolean, boolean):boolean");
    }

    public final void z() {
        PowerManager.WakeLock wakeLock = this.W;
        m0.b(this.currentAccount, "wallet_tonconnect");
        this.G = 0L;
        this.H = 0L;
        this.J = 0;
        this.K = 0;
        this.a.clear();
        this.c.b();
        this.d.b();
        this.f.b();
        this.h.b();
        this.n.b();
        this.y.clear();
        this.b.clear();
        this.L = false;
        this.O = 0;
        try {
            if (wakeLock.isHeld()) {
                wakeLock.release();
            }
        } catch (Exception e) {
            fc4.g(e, true);
        }
        j();
        S(t());
        SharedPreferences.Editor edit = getAccountInstance().d().edit();
        edit.clear();
        edit.commit();
        if (Build.VERSION.SDK_INT >= 26) {
            try {
                n0.deleteNotificationChannelGroup("channels" + this.currentAccount);
                n0.deleteNotificationChannelGroup("groups" + this.currentAccount);
                n0.deleteNotificationChannelGroup("private" + this.currentAccount);
                n0.deleteNotificationChannelGroup("stories" + this.currentAccount);
                n0.deleteNotificationChannelGroup("other" + this.currentAccount);
                String str = this.currentAccount + "channel";
                List<NotificationChannel> notificationChannels = n0.getNotificationChannels();
                int size = notificationChannels.size();
                for (int i = 0; i < size; i++) {
                    String id = bh7.g(notificationChannels.get(i)).getId();
                    if (id.startsWith(str)) {
                        try {
                            n0.deleteNotificationChannel(id);
                        } catch (Exception e2) {
                            fc4.g(e2, true);
                        }
                        if (e21.a) {
                            fc4.b("delete channel cleanup " + id);
                        }
                    }
                }
            } catch (Throwable th) {
                fc4.g(th, true);
            }
        }
    }
}
