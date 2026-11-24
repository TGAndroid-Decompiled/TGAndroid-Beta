package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.provider.MediaStore;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import java.io.File;
import java.io.FileOutputStream;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.RLottieNative;
public final class f4b {
    public String A;
    public int A0;
    public String B;
    public int B0;
    public long C;
    public CharSequence C0;
    public long D;
    public float E;
    public w5b E0;
    public long H;
    public boolean H0;
    public long I;
    public long J;
    public long J0;
    public boolean K;
    public File L;
    public TLRPC.InputMedia L0;
    public boolean M;
    public Bitmap M0;
    public String N;
    public File N0;
    public Bitmap O;
    public File O0;
    public File P0;
    public int Q;
    public File Q0;
    public int R;
    public File R0;
    public fk2 S;
    public ArrayList T;
    public ArrayList T0;
    public ArrayList U0;
    public ArrayList V0;
    public File W0;
    public long X;
    public File X0;
    public boolean Y;
    public File Y0;
    public float Z;
    public File Z0;
    public lm6 a1;
    public long b;
    public boolean b0;
    public Bitmap b1;
    public boolean c;
    public TLRPC.Document c0;
    public boolean c1;
    public long d;
    public f28 d0;
    public e4b d1;
    public long e;
    public int f;
    public boolean f0;
    public boolean g;
    public Bitmap g0;
    public boolean h;
    public long h0;
    public boolean j;
    public boolean k;
    public int k0;
    public boolean l;
    public int l0;
    public ArrayList m;
    public zl6 m0;
    public boolean n;
    public boolean o;
    public File o0;
    public SpannableStringBuilder p;
    public String p0;
    public TLRPC.Peer q;
    public long q0;
    public int r;
    public long r0;
    public String s;
    public float s0;
    public TLRPC.MessageMedia t;
    public boolean u;
    public ArrayList v;
    public TLRPC.InputPeer v0;
    public boolean w;
    public HashSet w0;
    public TLRPC.TL_error x;
    public Drawable x0;
    public String y;
    public TLRPC.InputDocument z;
    public final int a = y6c.t0;
    public double i = -1.0d;
    public float F = 1.0f;
    public float G = 1.0f;
    public float P = 1.0f;
    public boolean U = false;
    public float V = 0.0f;
    public float W = 1.0f;
    public float a0 = 1.0f;
    public long e0 = -1;
    public int i0 = 720;
    public int j0 = 1280;
    public final Matrix n0 = new Matrix();
    public float t0 = 1.0f;
    public float u0 = 1.0f;
    public boolean y0 = bkb.I.o();
    public long z0 = Long.MIN_VALUE;
    public boolean D0 = true;
    public final ArrayList F0 = new ArrayList();
    public boolean G0 = true;
    public int I0 = 86400;
    public String K0 = "";
    public long S0 = 5000;
    public int e1 = 0;

    public static void B(BitmapFactory.Options options, int i) {
        Runtime runtime = Runtime.getRuntime();
        long maxMemory = runtime.maxMemory() - (runtime.totalMemory() - runtime.freeMemory());
        int i2 = options.outWidth;
        int i3 = options.outHeight;
        if (((i2 * i3) << 3) <= maxMemory && Math.max(i2, i3) <= 4200 && gba.o() > 0) {
            return;
        }
        options.inScaled = true;
        options.inDensity = options.outWidth;
        options.inTargetDensity = i;
    }

    public static Boolean C(k27 k27Var) {
        TLRPC.Peer peer;
        if (k27Var != null) {
            int i = k27Var.K1;
            TLRPC.Message message = k27Var.k;
            if (message != null) {
                TLRPC.Chat K0 = na7.q1(i).K0(Long.valueOf(-cf3.n(message.peer_id)));
                if ((K0 != null && K0.noforwards) || !hc2.V(K0)) {
                    TLRPC.MessageFwdHeader messageFwdHeader = k27Var.k.fwd_from;
                    if (messageFwdHeader != null && (peer = messageFwdHeader.from_id) != null && (messageFwdHeader.flags & 4) != 0) {
                        long n = cf3.n(peer);
                        TLRPC.Chat K02 = na7.q1(i).K0(Long.valueOf(-n));
                        if (n < 0 && ((K02 == null || !K02.noforwards) && hc2.V(K02))) {
                            return Boolean.TRUE;
                        }
                    }
                    return null;
                }
                return Boolean.FALSE;
            }
        }
        return null;
    }

    public static f4b a(fk2 fk2Var, ArrayList arrayList) {
        f4b f4bVar = new f4b();
        f4bVar.S = fk2Var;
        f4bVar.T = arrayList;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            f4b f4bVar2 = (f4b) obj;
            if (f4bVar2.K) {
                f4bVar.K = true;
                f4bVar2.V = 0.0f;
                f4bVar2.W = Math.min(1.0f, 59000.0f / ((float) f4bVar2.h0));
            }
        }
        if (f4bVar.K) {
            f4bVar.k0 = 720;
            f4bVar.l0 = 1280;
            f4bVar.i0 = 720;
            f4bVar.j0 = 1280;
        } else {
            f4bVar.k0 = 1080;
            f4bVar.l0 = 1920;
            f4bVar.i0 = 1080;
            f4bVar.j0 = 1920;
        }
        f4bVar.z();
        return f4bVar;
    }

    public static int d(BitmapFactory.Options options, int i, int i2) {
        int min;
        int i3 = options.outHeight;
        int i4 = options.outWidth;
        if (i3 <= i2 && i4 <= i) {
            min = 1;
        } else {
            min = Math.min((int) Math.ceil(i3 / i2), (int) Math.ceil(i4 / i));
        }
        double d = min;
        return Math.max(1, (int) Math.pow(d, Math.floor(Math.log(d) / 0.6931471805599453d)));
    }

    public static void j(Canvas canvas, Drawable drawable, int i, int i2) {
        if (drawable == null) {
            return;
        }
        Rect rect = new Rect(drawable.getBounds());
        Drawable.Callback callback = drawable.getCallback();
        drawable.setCallback(null);
        if (drawable instanceof BitmapDrawable) {
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            float width = bitmapDrawable.getBitmap().getWidth();
            float height = bitmapDrawable.getBitmap().getHeight();
            float max = Math.max(i / width, i2 / height);
            drawable.setBounds(0, 0, (int) (width * max), (int) (height * max));
            drawable.draw(canvas);
        } else {
            drawable.setBounds(0, 0, i, i2);
            drawable.draw(canvas);
        }
        drawable.setBounds(rect);
        drawable.setCallback(callback);
    }

    public static String k(File file) {
        String path;
        int lastIndexOf;
        if (file != null && (lastIndexOf = (path = file.getPath()).lastIndexOf(46)) > 0) {
            return path.substring(lastIndexOf + 1);
        }
        return null;
    }

    public static f4b l(jm6 jm6Var) {
        boolean z;
        int i;
        f4b f4bVar = new f4b();
        f4bVar.L = new File(jm6Var.I);
        f4bVar.Q = jm6Var.J;
        f4bVar.R = jm6Var.K;
        if (!jm6Var.d() && jm6Var.b) {
            z = true;
        } else {
            z = false;
        }
        f4bVar.K = z;
        f4bVar.N = jm6Var.c;
        long j = jm6Var.E * 1000;
        f4bVar.h0 = j;
        f4bVar.Z = 0.0f;
        f4bVar.a0 = Math.min(1.0f, 59000.0f / ((float) j));
        if (f4bVar.K && f4bVar.N == null) {
            f4bVar.N = "vthumb://" + jm6Var.C;
        }
        f4bVar.A0 = jm6Var.T;
        f4bVar.B0 = jm6Var.U;
        f4bVar.h(f4bVar.L.getAbsolutePath());
        int i2 = jm6Var.F;
        if (i2 > 0 && (i = jm6Var.G) > 0) {
            f4bVar.k0 = i2;
            f4bVar.l0 = i;
        }
        f4bVar.z();
        return f4bVar;
    }

    public static f4b m(File file, int i) {
        f4b f4bVar = new f4b();
        f4bVar.L = file;
        f4bVar.M = true;
        f4bVar.Q = i;
        f4bVar.R = 0;
        f4bVar.K = false;
        if (file != null) {
            f4bVar.h(file.getAbsolutePath());
        }
        f4bVar.z();
        return f4bVar;
    }

    public static f4b n(File file, TL_stories.StoryItem storyItem) {
        f4b f4bVar = new f4b();
        f4bVar.g = true;
        f4bVar.f = storyItem.id;
        f4bVar.L = file;
        f4bVar.M = false;
        f4bVar.k0 = 720;
        f4bVar.l0 = 1280;
        TLRPC.MessageMedia messageMedia = storyItem.media;
        boolean z = messageMedia instanceof TLRPC.TL_messageMediaPhoto;
        int i = f4bVar.a;
        if (z) {
            f4bVar.K = false;
            if (file != null) {
                f4bVar.h(file.getAbsolutePath());
            }
        } else if (messageMedia instanceof TLRPC.TL_messageMediaDocument) {
            f4bVar.K = true;
            TLRPC.Document document = messageMedia.document;
            if (document != null && document.attributes != null) {
                int i2 = 0;
                while (true) {
                    if (i2 >= storyItem.media.document.attributes.size()) {
                        break;
                    }
                    TLRPC.DocumentAttribute documentAttribute = storyItem.media.document.attributes.get(i2);
                    if (documentAttribute instanceof TLRPC.TL_documentAttributeVideo) {
                        f4bVar.k0 = documentAttribute.w;
                        f4bVar.l0 = documentAttribute.h;
                        f4bVar.i = documentAttribute.duration;
                        break;
                    }
                    i2++;
                }
            }
            TLRPC.Document document2 = storyItem.media.document;
            if (document2 != null) {
                String str = storyItem.firstFramePath;
                if (str != null) {
                    f4bVar.N = str;
                } else if (document2.thumbs != null) {
                    int i3 = 0;
                    while (true) {
                        if (i3 >= storyItem.media.document.thumbs.size()) {
                            break;
                        }
                        TLRPC.PhotoSize photoSize = storyItem.media.document.thumbs.get(i3);
                        if (photoSize instanceof TLRPC.TL_photoStrippedSize) {
                            f4bVar.O = fl5.B(null, photoSize.bytes);
                            break;
                        }
                        ba4.G(i);
                        File J = ba4.J(photoSize, null, true, true);
                        if (J != null && J.exists()) {
                            f4bVar.N = J.getAbsolutePath();
                            break;
                        }
                        i3++;
                    }
                }
            }
        }
        ArrayList arrayList = f4bVar.F0;
        arrayList.clear();
        ArrayList<TLRPC.PrivacyRule> arrayList2 = storyItem.privacy;
        na7 q1 = na7.q1(i);
        ArrayList arrayList3 = new ArrayList();
        for (int i4 = 0; i4 < arrayList2.size(); i4++) {
            TLRPC.PrivacyRule privacyRule = arrayList2.get(i4);
            if (privacyRule != null) {
                if (privacyRule instanceof TLRPC.TL_privacyValueAllowAll) {
                    arrayList3.add(new TLRPC.TL_inputPrivacyValueAllowAll());
                } else if (privacyRule instanceof TLRPC.TL_privacyValueAllowCloseFriends) {
                    arrayList3.add(new TLRPC.TL_inputPrivacyValueAllowCloseFriends());
                } else if (privacyRule instanceof TLRPC.TL_privacyValueAllowContacts) {
                    arrayList3.add(new TLRPC.TL_inputPrivacyValueAllowContacts());
                } else if (privacyRule instanceof TLRPC.TL_privacyValueDisallowUsers) {
                    TLRPC.TL_privacyValueDisallowUsers tL_privacyValueDisallowUsers = (TLRPC.TL_privacyValueDisallowUsers) privacyRule;
                    TLRPC.TL_inputPrivacyValueDisallowUsers tL_inputPrivacyValueDisallowUsers = new TLRPC.TL_inputPrivacyValueDisallowUsers();
                    for (int i5 = 0; i5 < tL_privacyValueDisallowUsers.users.size(); i5++) {
                        Long l = tL_privacyValueDisallowUsers.users.get(i5);
                        l.getClass();
                        TLRPC.InputUser o1 = q1.o1(q1.V1(l));
                        if (!(o1 instanceof TLRPC.TL_inputUserEmpty)) {
                            tL_inputPrivacyValueDisallowUsers.users.add(o1);
                        }
                    }
                    arrayList3.add(tL_inputPrivacyValueDisallowUsers);
                } else if (privacyRule instanceof TLRPC.TL_privacyValueAllowUsers) {
                    TLRPC.TL_privacyValueAllowUsers tL_privacyValueAllowUsers = (TLRPC.TL_privacyValueAllowUsers) privacyRule;
                    TLRPC.TL_inputPrivacyValueAllowUsers tL_inputPrivacyValueAllowUsers = new TLRPC.TL_inputPrivacyValueAllowUsers();
                    for (int i6 = 0; i6 < tL_privacyValueAllowUsers.users.size(); i6++) {
                        Long l2 = tL_privacyValueAllowUsers.users.get(i6);
                        l2.getClass();
                        TLRPC.InputUser o12 = q1.o1(q1.V1(l2));
                        if (!(o12 instanceof TLRPC.TL_inputUserEmpty)) {
                            tL_inputPrivacyValueAllowUsers.users.add(o12);
                        }
                    }
                    arrayList3.add(tL_inputPrivacyValueAllowUsers);
                }
            }
        }
        arrayList.addAll(arrayList3);
        f4bVar.I0 = storyItem.expire_date - storyItem.date;
        try {
            CharSequence m = vu3.m(new SpannableString(storyItem.caption), bkb.n2.getFontMetricsInt(), true, null, 0);
            k27.b(m, storyItem.entities, true, false, true, false, 0);
            f4bVar.C0 = k27.A5(m, storyItem.entities, bkb.n2.getFontMetricsInt(), false);
        } catch (Exception unused) {
        }
        f4bVar.z();
        f4bVar.e(storyItem);
        f4bVar.m = storyItem.media_areas;
        f4bVar.v0 = na7.q1(i).h1(storyItem.dialogId);
        return f4bVar;
    }

    public static f4b o(File file, String str, long j) {
        f4b f4bVar = new f4b();
        f4bVar.c1 = true;
        f4bVar.L = file;
        f4bVar.M = true;
        f4bVar.Q = 0;
        f4bVar.R = 0;
        f4bVar.K = true;
        f4bVar.h0 = j;
        f4bVar.N = str;
        f4bVar.Z = 0.0f;
        f4bVar.a0 = Math.min(1.0f, 59500.0f / ((float) j));
        return f4bVar;
    }

    public static long p(k27 k27Var) {
        Boolean C = C(k27Var);
        if (C == null) {
            return 0L;
        }
        if (C.booleanValue()) {
            return cf3.n(k27Var.k.fwd_from.from_id);
        }
        return k27.B0(k27Var.k);
    }

    public static Bitmap q(d4b d4bVar, int i, int i2, int i3, boolean z) {
        int i4;
        int i5;
        if (i3 != 90 && i3 != 270) {
            i5 = i;
            i4 = i2;
        } else {
            i4 = i;
            i5 = i2;
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        d4bVar.l(options);
        boolean z2 = false;
        options.inJustDecodeBounds = false;
        options.inScaled = false;
        Runtime runtime = Runtime.getRuntime();
        long maxMemory = runtime.maxMemory() - (runtime.totalMemory() - runtime.freeMemory());
        int i6 = options.outWidth;
        int i7 = options.outHeight;
        if ((((i6 * i7) << 2) + ((i5 * i4) << 2)) * 1.1d <= maxMemory) {
            z2 = true;
        }
        if (i6 <= i5 && i7 <= i4) {
            return d4bVar.l(options);
        }
        if (z && z2 && gba.o() >= 1) {
            Bitmap l = d4bVar.l(options);
            float max = Math.max(i5 / l.getWidth(), i4 / l.getHeight());
            Bitmap createBitmap = Bitmap.createBitmap((int) (l.getWidth() * max), (int) (l.getHeight() * max), Bitmap.Config.ARGB_8888);
            Utilities.y(l, createBitmap);
            return createBitmap;
        }
        options.inScaled = true;
        int i8 = options.outWidth;
        int i9 = options.outHeight;
        if (i5 / i8 > i4 / i9) {
            options.inDensity = i8;
            options.inTargetDensity = i5;
        } else {
            options.inDensity = i9;
            options.inTargetDensity = i4;
        }
        return d4bVar.l(options);
    }

    public static boolean u(TLRPC.Document document, String str) {
        long j;
        if (document != null) {
            if (!"video/webm".equals(document.mime_type) && !"video/mp4".equals(document.mime_type)) {
                if (k27.K2(document, true)) {
                    RLottieNative a = RLottieNative.a(str, null, null, null, 0, null);
                    if (a != null) {
                        int i = a.a[0];
                        a.d();
                        j = i;
                    } else {
                        j = 0;
                    }
                    if (j > 1) {
                    }
                }
            }
            return true;
        }
        return false;
    }

    public static File w(int i, String str) {
        TLRPC.TL_videoSize_layer127 tL_videoSize_layer127;
        TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated = new TLRPC.TL_fileLocationToBeDeprecated();
        tL_fileLocationToBeDeprecated.volume_id = -2147483648L;
        tL_fileLocationToBeDeprecated.dc_id = Integer.MIN_VALUE;
        tL_fileLocationToBeDeprecated.local_id = gba.p();
        tL_fileLocationToBeDeprecated.file_reference = new byte[0];
        if (!"mp4".equals(str) && !"webm".equals(str)) {
            ?? tL_photoSize_layer127 = new TLRPC.TL_photoSize_layer127();
            tL_photoSize_layer127.location = tL_fileLocationToBeDeprecated;
            tL_videoSize_layer127 = tL_photoSize_layer127;
        } else {
            TLRPC.TL_videoSize_layer127 tL_videoSize_layer1272 = new TLRPC.TL_videoSize_layer127();
            tL_videoSize_layer1272.location = tL_fileLocationToBeDeprecated;
            tL_videoSize_layer127 = tL_videoSize_layer1272;
        }
        ba4.G(i);
        return ba4.J(tL_videoSize_layer127, str, true, true);
    }

    public static f4b x(ArrayList arrayList) {
        k27 k27Var;
        int i;
        f4b f4bVar = new f4b();
        f4bVar.u = true;
        f4bVar.v = arrayList;
        f4bVar.i0 = 1080;
        f4bVar.j0 = 1920;
        f4bVar.z0 = p((k27) arrayList.get(0));
        mac macVar = new mac();
        macVar.a = (byte) 6;
        macVar.c = 0.5f;
        macVar.d = 0.5f;
        ArrayList arrayList2 = new ArrayList();
        f4bVar.T0 = arrayList2;
        arrayList2.add(macVar);
        if (arrayList.size() == 1 && (k27Var = (k27) arrayList.get(0)) != null && ((i = k27Var.D) == 8 || i == 3 || i == 5)) {
            TLRPC.Message message = k27Var.k;
            if (message != null && message.attachPath != null) {
                f4bVar.L = new File(k27Var.k.attachPath);
            }
            File file = f4bVar.L;
            if (file == null || !file.exists()) {
                ba4.G(f4bVar.a);
                f4bVar.L = ba4.M(k27Var.k, false, true);
            }
            File file2 = f4bVar.L;
            if (file2 != null && file2.exists()) {
                f4bVar.K = true;
                f4bVar.M = false;
                long L0 = (long) (k27Var.L0() * 1000.0d);
                f4bVar.h0 = L0;
                f4bVar.Z = 0.0f;
                f4bVar.a0 = Math.min(1.0f, 59500.0f / ((float) L0));
                return f4bVar;
            }
            f4bVar.L = null;
        }
        return f4bVar;
    }

    public final void A() {
        long j;
        if (this.K && !v() && !this.g && !this.n && this.h0 > 69000 && y6c.h(this.a).p()) {
            long j2 = this.h0 - 59000;
            if (j2 > 10000) {
                j = Math.min(59000L, j2) + 59000;
            } else {
                j = 59000;
            }
            long j3 = this.h0 - j;
            if (j3 > 10000) {
                j += Math.min(59000L, j3);
            }
            this.a0 = Math.min(1.0f, ((float) j) / ((float) this.h0));
        }
    }

    public final boolean D() {
        ArrayList arrayList;
        ArrayList arrayList2;
        k27 k27Var;
        TLRPC.Message message;
        ArrayList arrayList3 = this.T0;
        if (!this.K && this.y == null && this.o0 == null && ((arrayList = this.v) == null || arrayList.size() != 1 || (k27Var = (k27) this.v.get(0)) == null || (message = k27Var.k) == null || !(message.action instanceof TLRPC.TL_messageActionStarGiftUnique))) {
            if (arrayList3 != null && !arrayList3.isEmpty()) {
                for (int i = 0; i < arrayList3.size(); i++) {
                    mac macVar = (mac) arrayList3.get(i);
                    byte b = macVar.a;
                    if (b == 0) {
                        if (!u(macVar.B, macVar.j)) {
                        }
                    } else {
                        if (b == 1 && (arrayList2 = macVar.k) != null && !arrayList2.isEmpty()) {
                            for (int i2 = 0; i2 < macVar.k.size(); i2++) {
                                lac lacVar = (lac) macVar.k.get(i2);
                                if (!u(lacVar.document, lacVar.a)) {
                                }
                            }
                            continue;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final android.graphics.Bitmap b(float r27, android.graphics.Bitmap r28) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.f4b.b(float, android.graphics.Bitmap):android.graphics.Bitmap");
    }

    public final void c(File file) {
        Bitmap b = b(1.0f, null);
        Bitmap bitmap = this.b1;
        if (bitmap != null) {
            bitmap.recycle();
            this.b1 = null;
        }
        this.b1 = Bitmap.createScaledBitmap(b, 40, 22, true);
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            b.compress(Bitmap.CompressFormat.JPEG, 95, fileOutputStream);
            fileOutputStream.close();
        } catch (Exception e) {
            fa4.g(e, true);
        }
        b.recycle();
    }

    public final void e(TL_stories.StoryItem storyItem) {
        if (storyItem != null && storyItem.media != null) {
            TLRPC.TL_messages_getAttachedStickers tL_messages_getAttachedStickers = new TLRPC.TL_messages_getAttachedStickers();
            TLRPC.MessageMedia messageMedia = storyItem.media;
            TLRPC.Photo photo = messageMedia.photo;
            if (photo != null) {
                if (photo.has_stickers) {
                    TLRPC.TL_inputStickeredMediaPhoto tL_inputStickeredMediaPhoto = new TLRPC.TL_inputStickeredMediaPhoto();
                    TLRPC.TL_inputPhoto tL_inputPhoto = new TLRPC.TL_inputPhoto();
                    tL_inputStickeredMediaPhoto.id = tL_inputPhoto;
                    tL_inputPhoto.id = photo.id;
                    tL_inputPhoto.access_hash = photo.access_hash;
                    byte[] bArr = photo.file_reference;
                    tL_inputPhoto.file_reference = bArr;
                    if (bArr == null) {
                        tL_inputPhoto.file_reference = new byte[0];
                    }
                    tL_messages_getAttachedStickers.media = tL_inputStickeredMediaPhoto;
                } else {
                    return;
                }
            } else {
                TLRPC.Document document = messageMedia.document;
                if (document != null && k27.V2(document)) {
                    TLRPC.TL_inputStickeredMediaDocument tL_inputStickeredMediaDocument = new TLRPC.TL_inputStickeredMediaDocument();
                    TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                    tL_inputStickeredMediaDocument.id = tL_inputDocument;
                    tL_inputDocument.id = document.id;
                    tL_inputDocument.access_hash = document.access_hash;
                    byte[] bArr2 = document.file_reference;
                    tL_inputDocument.file_reference = bArr2;
                    if (bArr2 == null) {
                        tL_inputDocument.file_reference = new byte[0];
                    }
                    tL_messages_getAttachedStickers.media = tL_inputStickeredMediaDocument;
                } else {
                    return;
                }
            }
            this.e1 = ConnectionsManager.getInstance(this.a).sendRequest(tL_messages_getAttachedStickers, new rt0(this, storyItem, tL_messages_getAttachedStickers, new wx9(this, (byte) 11), (byte) 26));
        }
    }

    public final void f() {
        File file = this.P0;
        if (file != null) {
            file.delete();
            this.P0 = null;
        }
        File file2 = this.Y0;
        if (file2 != null) {
            file2.delete();
            this.Y0 = null;
        }
        File file3 = this.W0;
        if (file3 != null) {
            file3.delete();
            this.W0 = null;
        }
        File file4 = this.X0;
        if (file4 != null) {
            file4.delete();
            this.X0 = null;
        }
        File file5 = this.R0;
        if (file5 != null) {
            file5.delete();
            this.R0 = null;
        }
    }

    public final f4b g() {
        f4b f4bVar = new f4b();
        f4bVar.b = this.b;
        f4bVar.c = this.c;
        f4bVar.d = this.d;
        f4bVar.e = this.e;
        f4bVar.f = this.f;
        f4bVar.g = this.g;
        f4bVar.h = this.h;
        f4bVar.i = this.i;
        f4bVar.j = this.j;
        f4bVar.k = this.k;
        f4bVar.l = this.l;
        f4bVar.m = this.m;
        f4bVar.w = this.w;
        f4bVar.x = this.x;
        f4bVar.y = this.y;
        f4bVar.z = this.z;
        f4bVar.A = this.A;
        f4bVar.B = this.B;
        f4bVar.C = this.C;
        f4bVar.D = this.D;
        f4bVar.E = this.E;
        f4bVar.F = this.F;
        f4bVar.G = this.G;
        f4bVar.H = this.H;
        f4bVar.I = this.I;
        f4bVar.J = this.J;
        f4bVar.K = this.K;
        f4bVar.L = this.L;
        f4bVar.M = this.M;
        boolean z = this.M;
        int i = this.a;
        if (z) {
            File w = w(i, k(this.L));
            f4bVar.L = w;
            gl.F(this.L, w);
        }
        f4bVar.N = this.N;
        f4bVar.Y = this.Y;
        f4bVar.Z = this.Z;
        f4bVar.a0 = this.a0;
        f4bVar.h0 = this.h0;
        f4bVar.k0 = this.k0;
        f4bVar.l0 = this.l0;
        f4bVar.i0 = this.i0;
        f4bVar.j0 = this.j0;
        f4bVar.v0 = this.v0;
        f4bVar.R = this.R;
        f4bVar.n0.set(this.n0);
        f4bVar.A0 = this.A0;
        f4bVar.B0 = this.B0;
        f4bVar.C0 = this.C0;
        f4bVar.D0 = this.D0;
        f4bVar.E0 = this.E0;
        ArrayList arrayList = f4bVar.F0;
        arrayList.clear();
        arrayList.addAll(this.F0);
        f4bVar.G0 = this.G0;
        f4bVar.H0 = this.H0;
        f4bVar.I0 = this.I0;
        f4bVar.M0 = this.M0;
        f4bVar.N0 = this.N0;
        f4bVar.w0 = this.w0;
        File file = this.N0;
        if (file != null && file.exists()) {
            File w2 = w(i, k(this.N0));
            f4bVar.N0 = w2;
            gl.F(this.N0, w2);
        }
        f4bVar.O0 = this.O0;
        File file2 = this.O0;
        if (file2 != null && file2.exists()) {
            File w3 = w(i, k(this.O0));
            f4bVar.O0 = w3;
            gl.F(this.O0, w3);
        }
        f4bVar.P0 = this.P0;
        File file3 = this.P0;
        if (file3 != null && file3.exists()) {
            File w4 = w(i, k(this.P0));
            f4bVar.P0 = w4;
            gl.F(this.P0, w4);
        }
        f4bVar.W0 = this.W0;
        File file4 = this.W0;
        if (file4 != null && file4.exists()) {
            File w5 = w(i, k(this.W0));
            f4bVar.W0 = w5;
            gl.F(this.W0, w5);
        }
        f4bVar.Y0 = this.Y0;
        File file5 = this.Y0;
        if (file5 != null && file5.exists()) {
            File w6 = w(i, k(this.Y0));
            f4bVar.Y0 = w6;
            gl.F(this.Y0, w6);
        }
        f4bVar.Q0 = this.Q0;
        File file6 = this.Q0;
        if (file6 != null && file6.exists()) {
            File w7 = w(i, k(this.Q0));
            f4bVar.Q0 = w7;
            gl.F(this.Q0, w7);
        }
        f4bVar.R0 = this.R0;
        File file7 = this.R0;
        if (file7 != null && file7.exists()) {
            File w8 = w(i, k(this.R0));
            f4bVar.R0 = w8;
            gl.F(this.R0, w8);
        }
        f4bVar.S0 = this.S0;
        f4bVar.T0 = new ArrayList();
        if (this.T0 != null) {
            for (int i2 = 0; i2 < this.T0.size(); i2++) {
                f4bVar.T0.add(((mac) this.T0.get(i2)).a());
            }
        }
        f4bVar.U0 = this.U0;
        f4bVar.V0 = this.V0;
        f4bVar.Z0 = this.Z0;
        File file8 = this.Z0;
        if (file8 != null && file8.exists()) {
            File w9 = w(i, k(this.Z0));
            f4bVar.Z0 = w9;
            gl.F(this.Z0, w9);
        }
        f4bVar.a1 = this.a1;
        f4bVar.b1 = this.b1;
        f4bVar.c1 = this.c1;
        f4bVar.O = this.O;
        f4bVar.n = this.n;
        f4bVar.o = this.o;
        f4bVar.o0 = this.o0;
        f4bVar.s0 = this.s0;
        f4bVar.t0 = this.t0;
        f4bVar.q0 = this.q0;
        f4bVar.p0 = this.p0;
        f4bVar.r0 = this.r0;
        f4bVar.u0 = this.u0;
        f4bVar.b0 = this.b0;
        f4bVar.J0 = this.J0;
        f4bVar.K0 = this.K0;
        f4bVar.L0 = this.L0;
        f4bVar.e0 = this.e0;
        f4bVar.T = this.T;
        f4bVar.S = this.S;
        f4bVar.U = this.U;
        f4bVar.X = this.X;
        f4bVar.P = this.P;
        return f4bVar;
    }

    public final void h(String str) {
        if (str != null) {
            try {
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                BitmapFactory.decodeFile(str, options);
                this.k0 = options.outWidth;
                this.l0 = options.outHeight;
            } catch (Exception unused) {
            }
        }
        if (!this.K) {
            if (((int) Math.max(this.k0, (this.l0 / 16.0f) * 9.0f)) <= 900) {
                this.i0 = 720;
                this.j0 = 1280;
                return;
            }
            this.i0 = 1080;
            this.j0 = 1920;
        }
    }

    public final void i(boolean z) {
        if (this.M0 != null) {
            this.M0 = null;
        }
        File file = this.N0;
        if (file != null) {
            file.delete();
            this.N0 = null;
        }
        if (!z) {
            f();
            File file2 = this.Z0;
            if (file2 != null) {
                file2.delete();
                this.Z0 = null;
            }
            File file3 = this.L;
            if (file3 != null) {
                if (this.M && (!this.g || this.j)) {
                    file3.delete();
                }
                this.L = null;
            }
            if (this.N != null) {
                if (this.M) {
                    new File(this.N).delete();
                }
                this.N = null;
            }
            ArrayList arrayList = this.T0;
            if (arrayList != null) {
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    mac macVar = (mac) obj;
                    if (macVar.a == 2 && !TextUtils.isEmpty(macVar.t)) {
                        try {
                            new File(macVar.t).delete();
                        } catch (Exception e) {
                            fa4.g(e, true);
                        }
                        macVar.t = "";
                    }
                }
            }
            File file4 = this.o0;
            if (file4 != null && (!this.g || this.j)) {
                file4.delete();
                this.o0 = null;
            }
            if (this.p0 != null && (!this.g || this.j)) {
                try {
                    new File(this.p0).delete();
                } catch (Exception unused) {
                }
                this.p0 = null;
            }
        }
        this.O = null;
        if (this.T != null) {
            for (int i2 = 0; i2 < this.T.size(); i2++) {
                ((f4b) this.T.get(i2)).i(z);
            }
        }
        if (this.e1 != 0) {
            ConnectionsManager.getInstance(this.a).cancelRequest(this.e1, true);
        }
    }

    public final int r() {
        long j;
        if (this.K && !v() && !this.g) {
            long j2 = this.h0;
            if (j2 > 0 && !this.n) {
                if ((this.a0 - this.Z) * ((float) j2) >= 68999) {
                    return (int) Math.ceil(((float) j) / 59000.0f);
                }
                return 1;
            }
            return 1;
        }
        return 1;
    }

    public final void s(p8c p8cVar) {
        String absolutePath;
        int i;
        String absolutePath2;
        int i2;
        if (!D()) {
            p8cVar.a(null);
            return;
        }
        if (!this.K && ((i2 = this.i0) > 720 || this.j0 > 1280)) {
            float f = 720.0f / i2;
            this.n0.postScale(f, f, 0.0f, 0.0f);
            this.i0 = 720;
            this.j0 = 1280;
        }
        File file = this.L;
        if (file == null) {
            absolutePath = null;
        } else {
            absolutePath = file.getAbsolutePath();
        }
        if (v()) {
            i = this.T.size();
        } else {
            i = 0;
        }
        int[][] iArr = (int[][]) Array.newInstance(Integer.TYPE, Math.max(1, i), 11);
        iArr[0] = new int[11];
        exa exaVar = new exa((Object) this, absolutePath, (Object) iArr, (Object) p8cVar, (byte) 8);
        if (v()) {
            String[] strArr = new String[this.T.size()];
            for (int i3 = 0; i3 < this.T.size(); i3++) {
                if (((f4b) this.T.get(i3)).L == null) {
                    absolutePath2 = null;
                } else {
                    absolutePath2 = ((f4b) this.T.get(i3)).L.getAbsolutePath();
                }
                strArr[i3] = absolutePath2;
                iArr[i3] = new int[11];
            }
            Utilities.e.c(new r1b(strArr, iArr, exaVar, (byte) 3));
        } else if (this.L == null) {
            exaVar.run();
        } else {
            Utilities.e.c(new r1b(absolutePath, iArr, exaVar, (byte) 4));
        }
    }

    public final boolean t() {
        if (v()) {
            for (int i = 0; i < this.T.size(); i++) {
                if (((f4b) this.T.get(i)).K) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean v() {
        if (this.S != null && this.T != null) {
            return true;
        }
        return false;
    }

    public final void y(Runnable runnable) {
        Bitmap bitmap;
        if (this.K && this.A0 == 0 && this.B0 == 0) {
            if (this.N != null) {
                try {
                    BitmapFactory.Options options = new BitmapFactory.Options();
                    if (this.N.startsWith("vthumb://")) {
                        long parseInt = Integer.parseInt(this.N.substring(9));
                        options.inJustDecodeBounds = true;
                        MediaStore.Video.Thumbnails.getThumbnail(a.b.getContentResolver(), parseInt, 1, options);
                        options.inSampleSize = d(options, 240, 240);
                        options.inJustDecodeBounds = false;
                        options.inPreferredConfig = Bitmap.Config.RGB_565;
                        options.inDither = true;
                        bitmap = MediaStore.Video.Thumbnails.getThumbnail(a.b.getContentResolver(), parseInt, 1, options);
                    } else {
                        options.inJustDecodeBounds = true;
                        BitmapFactory.decodeFile(this.N);
                        options.inSampleSize = d(options, 240, 240);
                        options.inJustDecodeBounds = false;
                        options.inPreferredConfig = Bitmap.Config.RGB_565;
                        options.inDither = true;
                        bitmap = BitmapFactory.decodeFile(this.N);
                    }
                } catch (Exception unused) {
                    bitmap = null;
                }
                if (bitmap != null) {
                    int[] b = kee.b(bitmap, true);
                    this.A0 = b[0];
                    this.B0 = b[1];
                    bitmap.recycle();
                    runnable.run();
                    return;
                }
                return;
            }
            Bitmap bitmap2 = this.O;
            if (bitmap2 != null) {
                int[] b2 = kee.b(bitmap2, true);
                this.A0 = b2[0];
                this.B0 = b2[1];
                runnable.run();
            }
        }
    }

    public final void z() {
        float f;
        Matrix matrix = this.n0;
        matrix.reset();
        int i = this.k0;
        int i2 = this.l0;
        int i3 = this.Q;
        int i4 = this.R;
        float f2 = 1.0f;
        if (i4 == 1) {
            f = -1.0f;
        } else {
            f = 1.0f;
        }
        if (i4 == 2) {
            f2 = -1.0f;
        }
        matrix.postScale(f, f2, i / 2.0f, i2 / 2.0f);
        if (i3 != 0) {
            matrix.postTranslate((-i) / 2.0f, (-i2) / 2.0f);
            matrix.postRotate(i3);
            if (i3 == 90 || i3 == 270) {
                i2 = i;
                i = i2;
            }
            matrix.postTranslate(i / 2.0f, i2 / 2.0f);
        }
        float f3 = i;
        float f4 = this.i0 / f3;
        if (this.J0 != 0) {
            f4 = Math.min(f4, this.j0 / i2);
        } else {
            float f5 = i2;
            if (f5 / f3 > 1.29f) {
                f4 = Math.max(f4, this.j0 / f5);
            }
        }
        matrix.postScale(f4, f4);
        matrix.postTranslate(b00.b(f3, f4, this.i0, 2.0f), b00.b(i2, f4, this.j0, 2.0f));
    }
}
