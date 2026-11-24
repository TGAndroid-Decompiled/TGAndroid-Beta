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
public final class im7 extends pf0 implements gk7 {
    public static String k0;
    public static pl7 m0;
    public static NotificationManager n0;
    public static AudioManager p0;
    public static volatile im7[] q0;
    public static final Object[] r0;
    public static final vf6 s0;
    public final ArrayList E;
    public final vf6 F;
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
    public final wl7 V;
    public final PowerManager.WakeLock W;
    public long X;
    public SoundPool Y;
    public int Z;
    public final ArrayList a;
    public int a0;
    public final ArrayList b;
    public boolean b0;
    public final vf6 c;
    public boolean c0;
    public final vf6 d;
    public final AlarmManager d0;
    public final vf6 e;
    public final int e0;
    public final vf6 f;
    public final String f0;
    public final qla g0;
    public final vf6 h;
    public final wm7 h0;
    public final char[] i0;
    public final wl7 j0;
    public final vf6 n;
    public final vf6 r;
    public final HashSet s;
    public final ArrayList w;
    public ArrayList x;
    public final HashSet y;
    public static final co3 l0 = new co3("notificationsQueue");
    public static final long o0 = cf3.E(1);

    static {
        m0 = null;
        n0 = null;
        if (Build.VERSION.SDK_INT >= 26 && a.b != null) {
            m0 = new pl7(a.b);
            n0 = (NotificationManager) a.b.getSystemService("notification");
            c();
        }
        p0 = (AudioManager) a.b.getSystemService("audio");
        q0 = new im7[4];
        r0 = new Object[4];
        for (int i = 0; i < 4; i++) {
            r0[i] = new Object();
        }
        s0 = new vf6();
    }

    public im7(int i) {
        super(i);
        Object valueOf;
        this.a = new ArrayList();
        this.b = new ArrayList();
        this.c = new vf6();
        this.d = new vf6();
        this.e = new vf6();
        this.f = new vf6();
        this.h = new vf6();
        this.n = new vf6();
        this.r = new vf6();
        this.s = new HashSet();
        this.w = new ArrayList();
        this.x = new ArrayList();
        this.y = new HashSet();
        this.E = new ArrayList();
        this.F = new vf6();
        this.G = 0L;
        this.H = 0L;
        this.I = 5000;
        this.J = 0;
        this.K = 0;
        this.L = false;
        this.M = 0;
        this.O = -1;
        this.g0 = new qla();
        this.i0 = new char[]{10252, 10338, 10385, 10280, 10277, 10286, 10321};
        this.j0 = new wl7(this, (byte) 11);
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
        m0 = new pl7(a.b);
        n0 = (NotificationManager) a.b.getSystemService("notification");
        try {
            p0 = (AudioManager) a.b.getSystemService("audio");
        } catch (Exception e) {
            fa4.g(e, true);
        }
        try {
            this.d0 = (AlarmManager) a.b.getSystemService("alarm");
        } catch (Exception e2) {
            fa4.g(e2, true);
        }
        try {
            PowerManager.WakeLock newWakeLock = ((PowerManager) a.b.getSystemService("power")).newWakeLock(1, "telegram:notification_delay_lock");
            this.W = newWakeLock;
            newWakeLock.setReferenceCounted(false);
        } catch (Exception e3) {
            fa4.g(e3, true);
        }
        this.V = new wl7(this, (byte) 12);
        this.h0 = new wm7(this.currentAccount);
        gl.d3(new wl7(this, (byte) 13));
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
            int L = gl.L(64.0f);
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
                        canvas.drawCircle(f5, f6, gl.L(2.0f) + f4, paint3);
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
                        options.inSampleSize = f4b.d(options, i3, i3);
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
                        paint2.setShader(new LinearGradient(size, size2, size, size2 + f3, new int[]{bkb.w0(null, bkb.o8[pb0.d(user.id)], false), bkb.w0(null, bkb.p8[pb0.d(user.id)], false)}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
                        canvas.drawCircle(f5, f6, f4, paint2);
                        if (textPaint == null) {
                            z = true;
                            TextPaint textPaint2 = new TextPaint(1);
                            try {
                                textPaint2.setTypeface(gl.o());
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
                        pb0.a(user.first_name, user.last_name, null, sb);
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

    public static void W(Notification notification, xk7 xk7Var, boolean z) {
        if (z) {
            xk7Var.y = k0;
        } else {
            xk7Var.y = notification.getChannelId();
        }
    }

    public static int a(java.util.ArrayList r3, defpackage.k27 r4, long r5, boolean r7, android.content.SharedPreferences r8) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.im7.a(java.util.ArrayList, k27, long, boolean, android.content.SharedPreferences):int");
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
                    fa4.g(e, true);
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
            String M0 = k96.M0(2131748997, null);
            if (notificationChannel != null && !TextUtils.equals(notificationChannel.getName(), M0)) {
                notificationChannel.setName(M0);
                try {
                    n0.createNotificationChannel(notificationChannel);
                } catch (Exception e2) {
                    fa4.g(e2, true);
                }
            }
            if (notificationChannel == null) {
                fk.g();
                NotificationChannel notificationChannel2 = new NotificationChannel(k0, M0, 3);
                notificationChannel2.enableLights(false);
                notificationChannel2.enableVibration(false);
                notificationChannel2.setSound(null, null);
                try {
                    n0.createNotificationChannel(notificationChannel2);
                } catch (Exception e3) {
                    fa4.g(e3, true);
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

    public static String l(k27 k27Var, String str) {
        boolean z;
        int i;
        TLRPC.Message message = k27Var.k;
        TLRPC.TL_messageActionGramTransfer tL_messageActionGramTransfer = (TLRPC.TL_messageActionGramTransfer) message.action;
        boolean B = l7c.B(k27.B0(message));
        if (B && !TextUtils.isEmpty(tL_messageActionGramTransfer.onramp_provider_name)) {
            return k96.a0(null, null, 2131747844, c.w(tL_messageActionGramTransfer.amount, false), a43.d(tL_messageActionGramTransfer.onramp_provider_name, Locale.getDefault()));
        }
        if (!tL_messageActionGramTransfer.comment_encrypted && !TextUtils.isEmpty(tL_messageActionGramTransfer.comment)) {
            z = true;
        } else {
            z = false;
        }
        if (B) {
            if (z) {
                i = 2131747842;
            } else {
                i = 2131747843;
            }
        } else if (z) {
            i = 2131747845;
        } else {
            i = 2131747846;
        }
        return k96.a0(null, null, i, str, c.w(tL_messageActionGramTransfer.amount, false), tL_messageActionGramTransfer.comment);
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

    public static im7 n(int i) {
        im7 im7Var;
        im7 im7Var2 = q0[i];
        if (im7Var2 == null) {
            synchronized (r0[i]) {
                im7Var = q0[i];
                if (im7Var == null) {
                    im7[] im7VarArr = q0;
                    im7 im7Var3 = new im7(i);
                    im7VarArr[i] = im7Var3;
                    im7Var = im7Var3;
                }
            }
            return im7Var;
        }
        return im7Var2;
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
        vf6 vf6Var = s0;
        int h = vf6Var.h(j3);
        if (h >= 0) {
            return (String) vf6Var.n(h);
        }
        if (j2 != 0) {
            Locale locale2 = Locale.US;
            valueOf = j + "_" + j2;
        } else {
            valueOf = String.valueOf(j);
        }
        vf6Var.k(valueOf, j3);
        return valueOf;
    }

    public static boolean y(k27 k27Var) {
        TLRPC.MessageAction messageAction;
        TLRPC.Message message = k27Var.k;
        TLRPC.Peer peer = message.peer_id;
        if ((peer != null && peer.chat_id == 0 && peer.channel_id == 0 && ((messageAction = message.action) == null || (messageAction instanceof TLRPC.TL_messageActionEmpty))) || k27Var.J) {
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
                        if (w01.a) {
                            fa4.b("delete all channel " + str);
                        }
                    }
                    edit.remove(key);
                }
            }
            edit.commit();
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    public final void C(ArrayList arrayList, vf6 vf6Var, ArrayList arrayList2, Collection collection) {
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
        k27 k27Var;
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
        vf6 vf6Var2 = new vf6();
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
                        k27 k27Var2 = new k27(this.currentAccount, message3, false, false);
                        if (y(k27Var2)) {
                            this.K++;
                        }
                        long B0 = k27.B0(k27Var2.k);
                        long b2 = k27.b2(this.currentAccount, k27Var2.k, getMessagesController().s2(k27Var2), false);
                        if (k27Var2.k.mentioned) {
                            message = message3;
                            j6 = k27Var2.Z0();
                            j5 = j4;
                        } else {
                            j5 = j4;
                            message = message3;
                            j6 = B0;
                        }
                        int h = vf6Var2.h(j6);
                        if (h >= 0 && b2 == 0) {
                            z4 = ((Boolean) vf6Var2.n(h)).booleanValue();
                            message2 = message;
                            sparseArray = sparseArray3;
                            k27Var = k27Var2;
                            j7 = j5;
                        } else {
                            int o = o(j6, b2);
                            if (o == -1) {
                                message2 = message;
                                sparseArray = sparseArray3;
                                j7 = j5;
                                z4 = x(j6, null, k27Var2.I, k27Var2.J);
                                k27Var = k27Var2;
                            } else {
                                message2 = message;
                                sparseArray = sparseArray3;
                                k27Var = k27Var2;
                                j7 = j5;
                                if (o != 2) {
                                    z3 = true;
                                } else {
                                    z3 = false;
                                }
                                z4 = z3;
                            }
                            vf6Var2.k(Boolean.valueOf(z4), j6);
                        }
                        if (z4 && (j6 != this.G || !a.w)) {
                            if (sparseArray == null) {
                                sparseArray2 = new SparseArray();
                                this.c.k(sparseArray2, j7);
                            } else {
                                sparseArray2 = sparseArray;
                            }
                            sparseArray2.put(message2.id, k27Var);
                            b(k27Var);
                            if (B0 != j6) {
                                Integer num = (Integer) this.r.f(B0);
                                vf6 vf6Var3 = this.r;
                                if (num == null) {
                                    intValue2 = 1;
                                } else {
                                    intValue2 = num.intValue() + 1;
                                }
                                vf6Var3.k(Integer.valueOf(intValue2), B0);
                            }
                        }
                    }
                }
            }
        }
        long j9 = 0;
        int i6 = 0;
        while (i6 < vf6Var.m()) {
            long j10 = vf6Var.j(i6);
            int h2 = vf6Var2.h(j10);
            if (h2 >= 0) {
                z2 = ((Boolean) vf6Var2.n(h2)).booleanValue();
            } else {
                int o2 = o(j10, j9);
                if (o2 == -1) {
                    z2 = x(j10, null, false, false);
                } else if (o2 != 2) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                vf6Var2.k(Boolean.valueOf(z2), j10);
            }
            if (z2) {
                Integer num2 = (Integer) vf6Var.n(i6);
                int intValue3 = num2.intValue();
                this.f.k(num2, j10);
                if (!getMessagesController().l2(j10)) {
                    boolean r2 = getMessagesController().r2(j10);
                    int i7 = this.J;
                    if (r2) {
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
            k27 k27Var3 = (k27) arrayList2.get(i8);
            int e1 = k27Var3.e1();
            if (this.c.h(e1) < 0) {
                if (y(k27Var3)) {
                    this.K++;
                }
                long B02 = k27.B0(k27Var3.k);
                long b22 = k27.b2(this.currentAccount, k27Var3.k, getMessagesController().s2(k27Var3), false);
                TLRPC.Message message4 = k27Var3.k;
                long j11 = message4.random_id;
                if (message4.mentioned) {
                    j = k27Var3.Z0();
                } else {
                    j = B02;
                }
                int h3 = vf6Var2.h(j);
                if (h3 >= 0 && b22 == 0) {
                    long j12 = j;
                    z = ((Boolean) vf6Var2.n(h3)).booleanValue();
                    j2 = j12;
                } else {
                    int o3 = o(j, b22);
                    if (o3 == -1) {
                        j2 = j;
                        z = x(j2, null, k27Var3.I, k27Var3.J);
                    } else {
                        j2 = j;
                        if (o3 != 2) {
                            z = true;
                        } else {
                            z = false;
                        }
                    }
                    vf6Var2.k(Boolean.valueOf(z), j2);
                }
                if (z && (j2 != this.G || !a.w)) {
                    if (e1 != 0) {
                        boolean z6 = k27Var3.J;
                        TLRPC.Message message5 = k27Var3.k;
                        if (z6) {
                            j3 = k27.B0(message5);
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
                        sparseArray4.put(e1, k27Var3);
                    } else if (j11 != 0) {
                        this.d.k(k27Var3, j11);
                    }
                    b(k27Var3);
                    if (B02 != j2) {
                        Integer num3 = (Integer) this.r.f(B02);
                        vf6 vf6Var4 = this.r;
                        if (num3 == null) {
                            intValue = 1;
                        } else {
                            intValue = num3.intValue() + 1;
                        }
                        vf6Var4.k(Integer.valueOf(intValue), B02);
                    }
                    Integer num4 = (Integer) this.f.f(j2);
                    if (num4 != null) {
                        i = num4.intValue() + 1;
                    } else {
                        i = 1;
                    }
                    if (!getMessagesController().l2(j2)) {
                        if (getMessagesController().r2(j2)) {
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
                hm7 hm7Var = (hm7) it.next();
                long j14 = hm7Var.a;
                hm7 hm7Var2 = (hm7) this.F.f(j14);
                if (hm7Var2 != null) {
                    hm7Var2.c.putAll(hm7Var.c);
                } else {
                    this.E.add(hm7Var);
                    this.F.k(hm7Var, j14);
                }
            }
            Collections.sort(this.E, Comparator$CC.comparingLong(new td((byte) 3)));
        }
        gl.d3(new cm7(this, this.f.m(), (byte) 4));
        if (SystemClock.elapsedRealtime() / 1000 < 60) {
            z5 = true;
        }
        Z(z5);
        if (this.S) {
            S(t());
        }
    }

    public final void D(java.util.ArrayList r43, java.util.ArrayList r44, boolean r45, boolean r46, java.util.concurrent.CountDownLatch r47) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.im7.D(java.util.ArrayList, java.util.ArrayList, boolean, boolean, java.util.concurrent.CountDownLatch):void");
    }

    public final void E(long j, String str) {
        boolean z;
        String M0;
        if (getUserConfig().o()) {
            if (gba.N0 || this.currentAccount == y6c.t0) {
                try {
                    String str2 = "wallet_tonconnect_" + this.currentAccount;
                    if (Build.VERSION.SDK_INT >= 26) {
                        NotificationManager notificationManager = n0;
                        fk.g();
                        notificationManager.createNotificationChannel(new NotificationChannel(str2, "TON Connect", 3));
                    }
                    if (!gl.n2(false) && !gba.B && getAccountInstance().d().getBoolean("EnablePreviewAll", true)) {
                        z = false;
                    } else {
                        z = true;
                    }
                    if (!TextUtils.isEmpty(str) && !z) {
                        M0 = k96.a0(null, null, 2131747732, str);
                    } else {
                        M0 = k96.M0(2131747733, null);
                    }
                    Intent intent = new Intent(a.b, LaunchActivity.class);
                    intent.setAction("android.intent.action.VIEW");
                    intent.setData(Uri.parse("tg://resolve?domain=sendgrams"));
                    intent.putExtra("currentAccount", this.currentAccount);
                    intent.addFlags(67108864);
                    PendingIntent activity = PendingIntent.getActivity(a.b, this.currentAccount, intent, 201326592);
                    xk7 xk7Var = new xk7(a.b, str2);
                    xk7Var.F.icon = 2131232457;
                    xk7Var.e = xk7.c(k96.M0(2131689472, null));
                    xk7Var.f = xk7.c(M0);
                    sk7 sk7Var = new sk7((byte) 0);
                    sk7Var.f = xk7.c(M0);
                    xk7Var.i(sk7Var);
                    xk7Var.u = "event";
                    xk7Var.x = 0;
                    xk7Var.F.when = j;
                    xk7Var.f(16, true);
                    xk7Var.g = activity;
                    m0.e("wallet_tonconnect", this.currentAccount, xk7Var.b());
                } catch (Exception e) {
                    fa4.g(e, true);
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
        SharedPreferences.Editor edit = na7.q1(this.currentAccount).W3.edit();
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
            SharedPreferences.Editor edit = na7.q1(this.currentAccount).W3.edit();
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
                ad7.Y(this.currentAccount).B1(j, j3);
                TLRPC.Dialog dialog = (TLRPC.Dialog) na7.q1(this.currentAccount).R.f(j);
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
            hm7 hm7Var = (hm7) arrayList3.get(i2);
            HashMap hashMap = hm7Var.c;
            long j = hm7Var.a;
            i += hashMap.size();
            z |= hm7Var.d;
            TLRPC.User V1 = getMessagesController().V1(Long.valueOf(j));
            if (V1 == null && (V1 = getMessagesStorage().h0(j)) != null) {
                getMessagesController().Z3(V1, true, false);
            }
            File file = null;
            if (V1 != null) {
                str = l7c.q(V1);
                TLRPC.UserProfilePhoto userProfilePhoto = V1.photo;
                if (userProfilePhoto != null && (fileLocation = userProfilePhoto.photo_small) != null && fileLocation.volume_id != 0 && fileLocation.local_id != 0) {
                    ba4 fileLoader = getFileLoader();
                    TLRPC.FileLocation fileLocation2 = V1.photo.photo_small;
                    fileLoader.getClass();
                    File J = ba4.J(fileLocation2, null, true, true);
                    if (!J.exists()) {
                        if (V1.photo.photo_big != null) {
                            ba4 fileLoader2 = getFileLoader();
                            TLRPC.FileLocation fileLocation3 = V1.photo.photo_big;
                            fileLoader2.getClass();
                            J = ba4.J(fileLocation3, null, true, true);
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
                str = hm7Var.b;
                if (str == null) {
                }
            }
            if (str.length() > 50) {
                str = str.substring(0, 25).concat("…");
            }
            arrayList.add(str);
            if (file == null) {
                if (V1 != null) {
                    arrayList2.add(V1);
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
        l0.c(new bm7(this, longSparseIntArray, new ArrayList(), (byte) 0));
    }

    public final void K(ArrayList arrayList, boolean z, boolean z2, CountDownLatch countDownLatch) {
        boolean z3;
        boolean z4;
        if (w01.a) {
            StringBuilder sb = new StringBuilder("NotificationsController: processNewMessages msgs.size()=");
            sb.append(Integer.valueOf(arrayList.size()));
            sb.append(" isLast=");
            z3 = z;
            sb.append(z3);
            sb.append(" isFcm=");
            z4 = z2;
            sb.append(z4);
            sb.append(")");
            fa4.b(sb.toString());
        } else {
            z3 = z;
            z4 = z2;
        }
        int i = 0;
        while (i < arrayList.size()) {
            k27 k27Var = (k27) arrayList.get(i);
            if (k27Var != null && k27Var.k != null && !k27Var.O3()) {
                TLRPC.MessageAction messageAction = k27Var.k.action;
                if (messageAction instanceof TLRPC.TL_messageActionConferenceCall) {
                    TLRPC.TL_messageActionConferenceCall tL_messageActionConferenceCall = (TLRPC.TL_messageActionConferenceCall) messageAction;
                    if (!tL_messageActionConferenceCall.active && !tL_messageActionConferenceCall.missed && getConnectionsManager().getCurrentTime() - k27Var.k.date < getMessagesController().a3 / 1000) {
                        HashSet hashSet = new HashSet();
                        hashSet.add(Long.valueOf(k27.B0(k27Var.k)));
                        ArrayList<TLRPC.Peer> arrayList2 = tL_messageActionConferenceCall.other_participants;
                        int size = arrayList2.size();
                        int i2 = 0;
                        while (i2 < size) {
                            TLRPC.Peer peer = arrayList2.get(i2);
                            i2++;
                            hashSet.add(Long.valueOf(cf3.n(peer)));
                        }
                        StringBuilder sb2 = new StringBuilder();
                        Iterator it = hashSet.iterator();
                        while (it.hasNext()) {
                            long longValue = ((Long) it.next()).longValue();
                            if (sb2.length() > 0) {
                                sb2.append(", ");
                            }
                            sb2.append(cf3.r(this.currentAccount, longValue));
                        }
                        VoIPGroupNotification.request(a.b, this.currentAccount, k27.B0(k27Var.k), sb2.toString(), tL_messageActionConferenceCall.call_id, k27Var.e1(), tL_messageActionConferenceCall.video);
                        arrayList.remove(i);
                        i--;
                    } else {
                        VoIPGroupNotification.hide(a.b, this.currentAccount, k27Var.e1());
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
        l0.c(new d87(this, arrayList, new ArrayList(0), z4, z3, countDownLatch, (byte) 2));
    }

    public final void L(LongSparseIntArray longSparseIntArray, long j, int i, int i2, boolean z) {
        l0.c(new ao6(this, longSparseIntArray, new ArrayList(0), j, i2, i, z));
    }

    public final void M(vf6 vf6Var, boolean z) {
        l0.c(new d97(this, vf6Var, z, new ArrayList(0), (byte) 3));
    }

    public final void N(long j) {
        L(null, j, 0, Integer.MAX_VALUE, false);
        LongSparseIntArray longSparseIntArray = new LongSparseIntArray();
        longSparseIntArray.put(j, 0);
        J(longSparseIntArray);
    }

    public final String O(k27 k27Var) {
        String str;
        TLRPC.Message message = k27Var.k;
        if (message != null && (str = message.message) != null && message.entities != null) {
            StringBuilder sb = new StringBuilder(str);
            if (k27Var.K2) {
                return sb.toString();
            }
            for (int i = 0; i < k27Var.k.entities.size(); i++) {
                if (k27Var.k.entities.get(i) instanceof TLRPC.TL_messageEntitySpoiler) {
                    TLRPC.TL_messageEntitySpoiler tL_messageEntitySpoiler = (TLRPC.TL_messageEntitySpoiler) k27Var.k.entities.get(i);
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

    public final void P(xk7 xk7Var, long j, long j2, String str, long[] jArr, int i, Uri uri, int i2, boolean z, boolean z2, boolean z3, int i3) {
        fa4.b("resetNotificationSound");
        Uri uri2 = Settings.System.DEFAULT_RINGTONE_URI;
        if (uri2 != null && uri != null && !TextUtils.equals(uri2.toString(), uri.toString())) {
            SharedPreferences.Editor edit = getAccountInstance().d().edit();
            String uri3 = uri2.toString();
            String M0 = k96.M0(2131751587, null);
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
            xk7Var.y = e0(j, j2, str, jArr, i, uri2, i2, z, z2, z3, i3);
            m0.e(null, this.e0, xk7Var.b());
        }
    }

    public final void Q(boolean z) {
        int i;
        wl7 wl7Var = this.V;
        try {
            if (w01.a) {
                fa4.b("delay notification start, onlineReason = " + z);
            }
            this.W.acquire(10000L);
            co3 co3Var = l0;
            co3Var.a(wl7Var);
            if (z) {
                i = 3000;
            } else {
                i = 1000;
            }
            co3Var.d(wl7Var, i);
        } catch (Exception e) {
            fa4.g(e, true);
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
            fa4.g(e, true);
        }
    }

    public final void S(int i) {
        if (this.O != i) {
            fa4.b("setBadge " + i);
            this.O = i;
            try {
                if (ak7.c == null && !ak7.b) {
                    ak7.b();
                    ak7.b = true;
                }
                yj7 yj7Var = ak7.c;
                if (yj7Var != null) {
                    yj7Var.a(i);
                }
            } catch (Throwable unused) {
            }
        }
    }

    public final void T(long j, int i, long j2) {
        SharedPreferences.Editor edit = getAccountInstance().d().edit();
        TLRPC.Dialog dialog = (TLRPC.Dialog) na7.q1(y6c.t0).R.f(j);
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
            int currentTime = ConnectionsManager.getInstance(y6c.t0).getCurrentTime();
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
            n(y6c.t0).N(j);
            ad7.Y(y6c.t0).B1(j, j3);
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
        ad7 messagesStorage = getMessagesStorage();
        messagesStorage.a.c(new vb7(messagesStorage, (byte) 26));
        g(i);
    }

    public final void V(int i) {
        l0.c(new cm7(this, i, (byte) 7));
    }

    public final void X(defpackage.xk7 r90, java.lang.String r91, long r92, long r94, java.lang.String r96, long[] r97, int r98, android.net.Uri r99, int r100, boolean r101, boolean r102, boolean r103, int r104) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.im7.X(xk7, java.lang.String, long, long, java.lang.String, long[], int, android.net.Uri, int, boolean, boolean, boolean, int):void");
    }

    public final void Y() {
        l0.c(new wl7(this, (byte) 3));
    }

    public final void Z(boolean r54) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.im7.Z(boolean):void");
    }

    public final void a0(long j, String str) {
        l0.c(new go6(this, str, j, (byte) 21));
    }

    public final void b(k27 k27Var) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.a;
            if (i < arrayList.size()) {
                if (((k27) arrayList.get(i)).e1() == k27Var.e1() && k27.B0(((k27) arrayList.get(i)).k) == k27.B0(k27Var.k) && ((k27) arrayList.get(i)).K == k27Var.K) {
                    return;
                }
                i++;
            } else {
                arrayList.add(0, k27Var);
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
            getConnectionsManager().sendRequest(updatenotifysettings, new ce2((byte) 0));
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
        getConnectionsManager().sendRequest(setreactionsnotifysettings, new ce2((byte) 0));
    }

    public final void c0(long j, long j2, boolean z) {
        int i;
        if (z) {
            getNotificationCenter().k(kk7.e0, new Object[0]);
        }
        if (cf3.B(j)) {
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
            tL_inputNotifyForumTopic.peer = getMessagesController().h1(j);
            tL_inputNotifyForumTopic.top_msg_id = (int) j2;
            updatenotifysettings.peer = tL_inputNotifyForumTopic;
        } else {
            int i3 = this.currentAccount;
            if (j < 0 && hc2.Y(na7.q1(i3).K0(Long.valueOf(-j)))) {
                TLRPC.TL_inputNotifyCommunity tL_inputNotifyCommunity = new TLRPC.TL_inputNotifyCommunity();
                tL_inputNotifyCommunity.community = getMessagesController().f1(-j);
                updatenotifysettings.peer = tL_inputNotifyCommunity;
            } else {
                TLRPC.TL_inputNotifyPeer tL_inputNotifyPeer = new TLRPC.TL_inputNotifyPeer();
                tL_inputNotifyPeer.peer = getMessagesController().h1(j);
                updatenotifysettings.peer = tL_inputNotifyPeer;
            }
        }
        getConnectionsManager().sendRequest(updatenotifysettings, new ce2((byte) 0));
    }

    public final java.lang.String d(defpackage.xk7 r18, long r19, java.lang.String r21, org.telegram.tgnet.TLRPC.User r22, org.telegram.tgnet.TLRPC.Chat r23, defpackage.l38 r24, boolean r25) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.im7.d(xk7, long, java.lang.String, org.telegram.tgnet.TLRPC$User, org.telegram.tgnet.TLRPC$Chat, l38, boolean):java.lang.String");
    }

    public final void d0() {
        int i = 0;
        long j = Long.MAX_VALUE;
        while (true) {
            ArrayList arrayList = this.E;
            if (i >= arrayList.size()) {
                break;
            }
            for (Pair pair : ((hm7) arrayList.get(i)).c.values()) {
                j = Math.min(j, ((Long) pair.second).longValue());
            }
            i++;
        }
        co3 co3Var = l0;
        wl7 wl7Var = this.j0;
        co3Var.a(wl7Var);
        long currentTimeMillis = j - System.currentTimeMillis();
        if (j != Long.MAX_VALUE) {
            co3Var.d(wl7Var, Math.max(0L, currentTimeMillis));
        }
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == kk7.X1) {
            l0.c(new bj7(this, (String) objArr[0], (byte) 6));
        }
    }

    public final java.lang.String e0(long r45, long r47, java.lang.String r49, long[] r50, int r51, android.net.Uri r52, int r53, boolean r54, boolean r55, boolean r56, int r57) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.im7.e0(long, long, java.lang.String, long[], int, android.net.Uri, int, boolean, boolean, boolean, int):java.lang.String");
    }

    public final void f(long j, long j2) {
        if (Build.VERSION.SDK_INT < 26) {
            return;
        }
        l0.c(new xl7(this, j, j2, (byte) 1));
    }

    public final void g(int i) {
        if (Build.VERSION.SDK_INT < 26) {
            return;
        }
        l0.c(new cm7(this, i, (byte) 8));
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
                        fa4.g(e, true);
                    }
                    if (w01.a) {
                        fa4.b("delete channel global internal ".concat(string));
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
                        fa4.g(e2, true);
                    }
                    if (w01.a) {
                        fa4.b("delete channel global internal ".concat(string2));
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
                fa4.g(e3, true);
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
                        fa4.g(e, true);
                    }
                    if (w01.a) {
                        fa4.b("delete channel internal ".concat(string));
                    }
                }
                String str2 = "org.telegram.keyia" + j;
                String string2 = d.getString(str2, null);
                if (string2 != null) {
                    edit.remove(str2).remove(str2.concat("_s"));
                    try {
                        n0.deleteNotificationChannel(string2);
                    } catch (Exception e2) {
                        fa4.g(e2, true);
                    }
                    if (w01.a) {
                        fa4.b("delete channel internal ".concat(string2));
                    }
                }
                edit.commit();
            } catch (Exception e3) {
                fa4.g(e3, true);
            }
        }
    }

    public final void j() {
        vf6 vf6Var = this.h;
        fa4.b("NotificationsController dismissNotification");
        try {
            m0.b(this.e0, null);
            this.a.clear();
            this.c.b();
            this.n.b();
            for (int i = 0; i < vf6Var.m(); i++) {
                if (!this.y.contains(Long.valueOf(vf6Var.j(i)))) {
                    m0.b(((Integer) vf6Var.n(i)).intValue(), null);
                }
            }
            vf6Var.b();
            gl.d3(new am6((byte) 6));
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    public final int o(long j, long j2) {
        int c = this.h0.c(-1, j, j2, "notify2_");
        if (c == 3 && this.h0.c(0, j, j2, "notifyuntil_") >= getConnectionsManager().getCurrentTime()) {
            return 2;
        }
        return c;
    }

    public final java.lang.String q(defpackage.k27 r31, java.lang.String[] r32, boolean[] r33) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.im7.q(k27, java.lang.String[], boolean[]):java.lang.String");
    }

    public final java.lang.String r(defpackage.k27 r30, boolean[] r31) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.im7.r(k27, boolean[]):java.lang.String");
    }

    public final String s(TLRPC.Chat chat) {
        if (chat == null) {
            return null;
        }
        if (chat.monoforum) {
            return mm4.j(this.currentAccount, chat, false);
        }
        return chat.title;
    }

    public final int t() {
        int i = 0;
        for (int i2 = 0; i2 < 4; i2++) {
            if (y6c.h(i2).o() && (gba.N0 || y6c.t0 == i2)) {
                im7 n = n(i2);
                if (n.S) {
                    boolean z = n.U;
                    boolean z2 = n.T;
                    if (z) {
                        if (z2) {
                            try {
                                ArrayList arrayList = new ArrayList(na7.q1(i2).y);
                                int size = arrayList.size();
                                for (int i3 = 0; i3 < size; i3++) {
                                    TLRPC.Dialog dialog = (TLRPC.Dialog) arrayList.get(i3);
                                    if (dialog != null && cf3.y(dialog.id)) {
                                        TLRPC.Chat K0 = getMessagesController().K0(Long.valueOf(-dialog.id));
                                        if (!hc2.r0(K0)) {
                                            if (hc2.Y(K0)) {
                                            }
                                        }
                                    }
                                    if (dialog != null) {
                                        i += na7.q1(i2).T0(dialog);
                                    }
                                }
                            } catch (Exception e) {
                                fa4.g(e, true);
                            }
                        } else {
                            i += n.J;
                        }
                    } else if (z2) {
                        try {
                            int size2 = na7.q1(i2).y.size();
                            for (int i4 = 0; i4 < size2; i4++) {
                                TLRPC.Dialog dialog2 = (TLRPC.Dialog) na7.q1(i2).y.get(i4);
                                if (cf3.y(dialog2.id)) {
                                    TLRPC.Chat K02 = getMessagesController().K0(Long.valueOf(-dialog2.id));
                                    if (!hc2.r0(K02)) {
                                        if (hc2.Y(K02)) {
                                        }
                                    }
                                }
                                if (na7.q1(i2).T0(dialog2) != 0) {
                                    i++;
                                }
                            }
                        } catch (Exception e2) {
                            fa4.g(e2, false);
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
            k27 k27Var = (k27) arrayList.get(i);
            long B0 = k27.B0(k27Var.k);
            if (!k27Var.I) {
                TLRPC.Message message = k27Var.k;
                if ((!message.mentioned || !(message.action instanceof TLRPC.TL_messageActionPinMessage)) && !cf3.B(B0) && ((k27Var.k.peer_id.channel_id == 0 || k27Var.z4()) && B0 != 489000 && B0 != 489001)) {
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.im7.x(long, java.lang.Boolean, boolean, boolean):boolean");
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
            fa4.g(e, true);
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
                    String id = fi7.d(notificationChannels.get(i)).getId();
                    if (id.startsWith(str)) {
                        try {
                            n0.deleteNotificationChannel(id);
                        } catch (Exception e2) {
                            fa4.g(e2, true);
                        }
                        if (w01.a) {
                            fa4.b("delete channel cleanup " + id);
                        }
                    }
                }
            } catch (Throwable th) {
                fa4.g(th, true);
            }
        }
    }
}
