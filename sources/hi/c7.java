package hi;

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
import java.util.List;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.c20;
import org.telegram.messenger.cz;
import org.telegram.messenger.d20;
import org.telegram.messenger.fc;
import org.telegram.messenger.ff;
import org.telegram.messenger.gf;
import org.telegram.messenger.gj;
import org.telegram.messenger.k10;
import org.telegram.messenger.np;
import org.telegram.messenger.xe;
import org.telegram.messenger.y10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.RLottieNative;
public final class c7 {
    public String A;
    public int A0;
    public String B;
    public int B0;
    public long C;
    public CharSequence C0;
    public long D;
    public float E;
    public n8 E0;
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
    public v S;
    public ArrayList T;
    public ArrayList T0;
    public List U0;
    public ArrayList V0;
    public File W0;
    public long X;
    public File X0;
    public boolean Y;
    public File Y0;
    public float Z;
    public File Z0;
    public gf f14340a1;
    public long f14341b;
    public boolean f14342b0;
    public Bitmap f14343b1;
    public boolean f14344c;
    public TLRPC.Document f14345c0;
    public boolean f14346c1;
    public long d;
    public bi.j f14347d0;
    public b7 f14348d1;
    public long f14349e;
    public int f14352f;
    public boolean f14353f0;
    public boolean f14354g;
    public Bitmap f14355g0;
    public boolean h;
    public long f14356h0;
    public boolean f14359j;
    public boolean f14361k;
    public int f14362k0;
    public boolean f14363l;
    public int f14364l0;
    public ArrayList f14365m;
    public xe m0;
    public boolean f14366n;
    public boolean f14368o;
    public File f14369o0;
    public SpannableStringBuilder f14370p;
    public String f14371p0;
    public TLRPC.Peer f14372q;
    public long f14373q0;
    public int f14374r;
    public long f14375r0;
    public String f14376s;
    public float f14377s0;
    public TLRPC.MessageMedia f14378t;
    public boolean f14380u;
    public ArrayList v;
    public TLRPC.InputPeer f14382v0;
    public boolean f14383w;
    public HashSet f14384w0;
    public TLRPC.TL_error f14385x;
    public Drawable f14386x0;
    public String f14387y;
    public TLRPC.InputDocument f14389z;
    public final int f14338a = k10.f24968t0;
    public double f14357i = -1.0d;
    public float F = 1.0f;
    public float G = 1.0f;
    public float P = 1.0f;
    public boolean U = false;
    public float V = 0.0f;
    public float W = 1.0f;
    public float f14339a0 = 1.0f;
    public long f14350e0 = -1;
    public int f14358i0 = 720;
    public int f14360j0 = 1280;
    public final Matrix f14367n0 = new Matrix();
    public float f14379t0 = 1.0f;
    public float f14381u0 = 1.0f;
    public boolean f14388y0 = org.telegram.ui.ActionBar.m6.I.q();
    public long f14390z0 = Long.MIN_VALUE;
    public boolean D0 = true;
    public final ArrayList F0 = new ArrayList();
    public boolean G0 = true;
    public int I0 = 86400;
    public String K0 = "";
    public long S0 = 5000;
    public int f14351e1 = 0;

    public static void C(BitmapFactory.Options options, int i7) {
        Runtime runtime = Runtime.getRuntime();
        long maxMemory = runtime.maxMemory() - (runtime.totalMemory() - runtime.freeMemory());
        int i10 = options.outWidth;
        int i11 = options.outHeight;
        if (i10 * i11 * 8 <= maxMemory && Math.max(i10, i11) <= 4200 && cz.o() > 0) {
            return;
        }
        options.inScaled = true;
        options.inDensity = options.outWidth;
        options.inTargetDensity = i7;
    }

    public static Boolean D(gj gjVar) {
        TLRPC.Peer peer;
        if (gjVar != null) {
            int i7 = gjVar.K1;
            TLRPC.Message message = gjVar.f24213k;
            if (message != null) {
                TLRPC.Chat O0 = np.u1(i7).O0(Long.valueOf(-org.telegram.messenger.n5.o(message.peer_id)));
                if ((O0 != null && O0.noforwards) || !org.telegram.messenger.v3.V(O0)) {
                    TLRPC.MessageFwdHeader messageFwdHeader = gjVar.f24213k.fwd_from;
                    if (messageFwdHeader != null && (peer = messageFwdHeader.from_id) != null && (messageFwdHeader.flags & 4) != 0) {
                        long o4 = org.telegram.messenger.n5.o(peer);
                        TLRPC.Chat O02 = np.u1(i7).O0(Long.valueOf(-o4));
                        if (o4 < 0 && ((O02 == null || !O02.noforwards) && org.telegram.messenger.v3.V(O02))) {
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

    public static c7 a(v vVar, ArrayList arrayList) {
        c7 c7Var = new c7();
        c7Var.S = vVar;
        c7Var.T = arrayList;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            c7 c7Var2 = (c7) obj;
            if (c7Var2.K) {
                c7Var.K = true;
                c7Var2.V = 0.0f;
                c7Var2.W = Math.min(1.0f, 59000.0f / ((float) c7Var2.f14356h0));
            }
        }
        if (c7Var.K) {
            c7Var.f14362k0 = 720;
            c7Var.f14364l0 = 1280;
            c7Var.f14358i0 = 720;
            c7Var.f14360j0 = 1280;
        } else {
            c7Var.f14362k0 = 1080;
            c7Var.f14364l0 = 1920;
            c7Var.f14358i0 = 1080;
            c7Var.f14360j0 = 1920;
        }
        c7Var.A();
        return c7Var;
    }

    public static int d(BitmapFactory.Options options, int i7, int i10) {
        int min;
        int i11 = options.outHeight;
        int i12 = options.outWidth;
        if (i11 <= i10 && i12 <= i7) {
            min = 1;
        } else {
            min = Math.min((int) Math.ceil(i11 / i10), (int) Math.ceil(i12 / i7));
        }
        double d = min;
        return Math.max(1, (int) Math.pow(d, Math.floor(Math.log(d) / Math.log(2.0d))));
    }

    public static void j(Canvas canvas, Drawable drawable, int i7, int i10) {
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
            float max = Math.max(i7 / width, i10 / height);
            drawable.setBounds(0, 0, (int) (width * max), (int) (height * max));
            drawable.draw(canvas);
        } else {
            drawable.setBounds(0, 0, i7, i10);
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

    public static c7 l(ff ffVar) {
        boolean z10;
        int i7;
        c7 c7Var = new c7();
        c7Var.L = new File(ffVar.I);
        c7Var.Q = ffVar.J;
        c7Var.R = ffVar.K;
        if (!ffVar.d() && ffVar.f28059b) {
            z10 = true;
        } else {
            z10 = false;
        }
        c7Var.K = z10;
        c7Var.N = ffVar.f28060c;
        long j3 = ffVar.E * 1000;
        c7Var.f14356h0 = j3;
        c7Var.Z = 0.0f;
        c7Var.f14339a0 = Math.min(1.0f, 59000.0f / ((float) j3));
        if (c7Var.K && c7Var.N == null) {
            c7Var.N = "vthumb://" + ffVar.C;
        }
        c7Var.A0 = ffVar.T;
        c7Var.B0 = ffVar.U;
        c7Var.h(c7Var.L.getAbsolutePath());
        int i10 = ffVar.F;
        if (i10 > 0 && (i7 = ffVar.G) > 0) {
            c7Var.f14362k0 = i10;
            c7Var.f14364l0 = i7;
        }
        c7Var.A();
        return c7Var;
    }

    public static c7 m(File file, int i7) {
        c7 c7Var = new c7();
        c7Var.L = file;
        c7Var.M = true;
        c7Var.Q = i7;
        c7Var.R = 0;
        c7Var.K = false;
        if (file != null) {
            c7Var.h(file.getAbsolutePath());
        }
        c7Var.A();
        return c7Var;
    }

    public static c7 n(File file, TL_stories.StoryItem storyItem) {
        c7 c7Var = new c7();
        c7Var.f14354g = true;
        c7Var.f14352f = storyItem.f28673id;
        c7Var.L = file;
        c7Var.M = false;
        c7Var.f14362k0 = 720;
        c7Var.f14364l0 = 1280;
        TLRPC.MessageMedia messageMedia = storyItem.media;
        boolean z10 = messageMedia instanceof TLRPC.TL_messageMediaPhoto;
        int i7 = c7Var.f14338a;
        if (z10) {
            c7Var.K = false;
            if (file != null) {
                c7Var.h(file.getAbsolutePath());
            }
        } else if (messageMedia instanceof TLRPC.TL_messageMediaDocument) {
            c7Var.K = true;
            TLRPC.Document document = messageMedia.document;
            if (document != null && document.attributes != null) {
                int i10 = 0;
                while (true) {
                    if (i10 >= storyItem.media.document.attributes.size()) {
                        break;
                    }
                    TLRPC.DocumentAttribute documentAttribute = storyItem.media.document.attributes.get(i10);
                    if (documentAttribute instanceof TLRPC.TL_documentAttributeVideo) {
                        c7Var.f14362k0 = documentAttribute.f28441w;
                        c7Var.f14364l0 = documentAttribute.h;
                        c7Var.f14357i = documentAttribute.duration;
                        break;
                    }
                    i10++;
                }
            }
            TLRPC.Document document2 = storyItem.media.document;
            if (document2 != null) {
                String str = storyItem.firstFramePath;
                if (str != null) {
                    c7Var.N = str;
                } else if (document2.thumbs != null) {
                    int i11 = 0;
                    while (true) {
                        if (i11 >= storyItem.media.document.thumbs.size()) {
                            break;
                        }
                        TLRPC.PhotoSize photoSize = storyItem.media.document.thumbs.get(i11);
                        if (photoSize instanceof TLRPC.TL_photoStrippedSize) {
                            c7Var.O = fc.F(null, photoSize.bytes);
                            break;
                        }
                        org.telegram.messenger.w7.G(i7);
                        File J = org.telegram.messenger.w7.J(photoSize, null, true, true);
                        if (J != null && J.exists()) {
                            c7Var.N = J.getAbsolutePath();
                            break;
                        }
                        i11++;
                    }
                }
            }
        }
        ArrayList arrayList = c7Var.F0;
        arrayList.clear();
        ArrayList<TLRPC.PrivacyRule> arrayList2 = storyItem.privacy;
        np u12 = np.u1(i7);
        ArrayList arrayList3 = new ArrayList();
        for (int i12 = 0; i12 < arrayList2.size(); i12++) {
            TLRPC.PrivacyRule privacyRule = arrayList2.get(i12);
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
                    for (int i13 = 0; i13 < tL_privacyValueDisallowUsers.users.size(); i13++) {
                        Long l10 = tL_privacyValueDisallowUsers.users.get(i13);
                        l10.getClass();
                        TLRPC.InputUser s12 = u12.s1(u12.c2(l10));
                        if (!(s12 instanceof TLRPC.TL_inputUserEmpty)) {
                            tL_inputPrivacyValueDisallowUsers.users.add(s12);
                        }
                    }
                    arrayList3.add(tL_inputPrivacyValueDisallowUsers);
                } else if (privacyRule instanceof TLRPC.TL_privacyValueAllowUsers) {
                    TLRPC.TL_privacyValueAllowUsers tL_privacyValueAllowUsers = (TLRPC.TL_privacyValueAllowUsers) privacyRule;
                    TLRPC.TL_inputPrivacyValueAllowUsers tL_inputPrivacyValueAllowUsers = new TLRPC.TL_inputPrivacyValueAllowUsers();
                    for (int i14 = 0; i14 < tL_privacyValueAllowUsers.users.size(); i14++) {
                        Long l11 = tL_privacyValueAllowUsers.users.get(i14);
                        l11.getClass();
                        TLRPC.InputUser s13 = u12.s1(u12.c2(l11));
                        if (!(s13 instanceof TLRPC.TL_inputUserEmpty)) {
                            tL_inputPrivacyValueAllowUsers.users.add(s13);
                        }
                    }
                    arrayList3.add(tL_inputPrivacyValueAllowUsers);
                }
            }
        }
        arrayList.addAll(arrayList3);
        c7Var.I0 = storyItem.expire_date - storyItem.date;
        try {
            CharSequence m10 = org.telegram.messenger.j6.m(new SpannableString(storyItem.caption), org.telegram.ui.ActionBar.m6.f29578o2.getFontMetricsInt(), true, null, 0);
            gj.b(m10, storyItem.entities, true, false, true, false, 0);
            c7Var.C0 = gj.B5(m10, storyItem.entities, org.telegram.ui.ActionBar.m6.f29578o2.getFontMetricsInt(), false);
        } catch (Exception unused) {
        }
        c7Var.A();
        c7Var.e(storyItem);
        c7Var.f14365m = storyItem.media_areas;
        c7Var.f14382v0 = np.u1(i7).l1(storyItem.dialogId);
        return c7Var;
    }

    public static c7 o(File file, String str, long j3) {
        c7 c7Var = new c7();
        c7Var.f14346c1 = true;
        c7Var.L = file;
        c7Var.M = true;
        c7Var.Q = 0;
        c7Var.R = 0;
        c7Var.K = true;
        c7Var.f14356h0 = j3;
        c7Var.N = str;
        c7Var.Z = 0.0f;
        c7Var.f14339a0 = Math.min(1.0f, 59500.0f / ((float) j3));
        return c7Var;
    }

    public static long p(gj gjVar) {
        Boolean D = D(gjVar);
        if (D == null) {
            return 0L;
        }
        if (D.booleanValue()) {
            return org.telegram.messenger.n5.o(gjVar.f24213k.fwd_from.from_id);
        }
        return gj.B0(gjVar.f24213k);
    }

    public static Bitmap q(a7 a7Var, int i7, int i10, int i11, boolean z10) {
        int i12;
        int i13;
        boolean z11;
        if (i11 != 90 && i11 != 270) {
            i13 = i7;
            i12 = i10;
        } else {
            i12 = i7;
            i13 = i10;
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        a7Var.c(options);
        options.inJustDecodeBounds = false;
        options.inScaled = false;
        Runtime runtime = Runtime.getRuntime();
        long maxMemory = runtime.maxMemory() - (runtime.totalMemory() - runtime.freeMemory());
        int i14 = options.outWidth;
        int i15 = options.outHeight;
        if (((i13 * i12 * 4) + (i14 * i15 * 4)) * 1.1d <= maxMemory) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (i14 <= i13 && i15 <= i12) {
            return a7Var.c(options);
        }
        if (z10 && z11 && cz.o() >= 1) {
            Bitmap c10 = a7Var.c(options);
            float max = Math.max(i13 / c10.getWidth(), i12 / c10.getHeight());
            Bitmap createBitmap = Bitmap.createBitmap((int) (c10.getWidth() * max), (int) (c10.getHeight() * max), Bitmap.Config.ARGB_8888);
            Utilities.y(c10, createBitmap);
            Utilities.j(Math.round(1.0f / max), 8, 0);
            return createBitmap;
        }
        options.inScaled = true;
        int i16 = options.outWidth;
        int i17 = options.outHeight;
        if (i13 / i16 > i12 / i17) {
            options.inDensity = i16;
            options.inTargetDensity = i13;
        } else {
            options.inDensity = i17;
            options.inTargetDensity = i12;
        }
        return a7Var.c(options);
    }

    public static boolean u(TLRPC.Document document, String str) {
        long j3;
        if (document != null) {
            if (!"video/webm".equals(document.mime_type) && !"video/mp4".equals(document.mime_type)) {
                if (gj.K2(document, true)) {
                    RLottieNative a10 = RLottieNative.a(str, null, null, null, 0, null);
                    if (a10 != null) {
                        int i7 = a10.f33085a[0];
                        a10.d();
                        j3 = i7;
                    } else {
                        j3 = 0;
                    }
                    if (j3 > 1) {
                    }
                }
            }
            return true;
        }
        return false;
    }

    public static File w(int i7, String str) {
        TLRPC.TL_videoSize_layer127 tL_videoSize_layer127;
        TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated = new TLRPC.TL_fileLocationToBeDeprecated();
        tL_fileLocationToBeDeprecated.volume_id = -2147483648L;
        tL_fileLocationToBeDeprecated.dc_id = Integer.MIN_VALUE;
        tL_fileLocationToBeDeprecated.local_id = cz.p();
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
        org.telegram.messenger.w7.G(i7);
        return org.telegram.messenger.w7.J(tL_videoSize_layer127, str, true, true);
    }

    public static File x(int i7, boolean z10) {
        String str;
        if (z10) {
            str = "mp4";
        } else {
            str = "jpg";
        }
        return w(i7, str);
    }

    public static c7 y(ArrayList arrayList) {
        gj gjVar;
        int i7;
        c7 c7Var = new c7();
        c7Var.f14380u = true;
        c7Var.v = arrayList;
        c7Var.f14358i0 = 1080;
        c7Var.f14360j0 = 1920;
        c7Var.f14390z0 = p((gj) arrayList.get(0));
        d20 d20Var = new d20();
        d20Var.f23478a = (byte) 6;
        d20Var.f23480c = 0.5f;
        d20Var.d = 0.5f;
        ArrayList arrayList2 = new ArrayList();
        c7Var.T0 = arrayList2;
        arrayList2.add(d20Var);
        if (arrayList.size() == 1 && (gjVar = (gj) arrayList.get(0)) != null && ((i7 = gjVar.D) == 8 || i7 == 3 || i7 == 5)) {
            TLRPC.Message message = gjVar.f24213k;
            if (message != null && message.attachPath != null) {
                c7Var.L = new File(gjVar.f24213k.attachPath);
            }
            File file = c7Var.L;
            if (file == null || !file.exists()) {
                org.telegram.messenger.w7.G(c7Var.f14338a);
                c7Var.L = org.telegram.messenger.w7.M(gjVar.f24213k, false, true);
            }
            File file2 = c7Var.L;
            if (file2 != null && file2.exists()) {
                c7Var.K = true;
                c7Var.M = false;
                long L0 = (long) (gjVar.L0() * 1000.0d);
                c7Var.f14356h0 = L0;
                c7Var.Z = 0.0f;
                c7Var.f14339a0 = Math.min(1.0f, 59500.0f / ((float) L0));
                return c7Var;
            }
            c7Var.L = null;
        }
        return c7Var;
    }

    public final void A() {
        float f10;
        Matrix matrix = this.f14367n0;
        matrix.reset();
        int i7 = this.f14362k0;
        int i10 = this.f14364l0;
        int i11 = this.Q;
        int i12 = this.R;
        float f11 = 1.0f;
        if (i12 == 1) {
            f10 = -1.0f;
        } else {
            f10 = 1.0f;
        }
        if (i12 == 2) {
            f11 = -1.0f;
        }
        matrix.postScale(f10, f11, i7 / 2.0f, i10 / 2.0f);
        if (i11 != 0) {
            matrix.postTranslate((-i7) / 2.0f, (-i10) / 2.0f);
            matrix.postRotate(i11);
            if (i11 == 90 || i11 == 270) {
                i10 = i7;
                i7 = i10;
            }
            matrix.postTranslate(i7 / 2.0f, i10 / 2.0f);
        }
        float f12 = i7;
        float f13 = this.f14358i0 / f12;
        if (this.J0 != 0) {
            f13 = Math.min(f13, this.f14360j0 / i10);
        } else {
            float f14 = i10;
            if (f14 / f12 > 1.29f) {
                f13 = Math.max(f13, this.f14360j0 / f14);
            }
        }
        matrix.postScale(f13, f13);
        matrix.postTranslate(com.google.android.gms.internal.vision.e2.w(f12, f13, this.f14358i0, 2.0f), com.google.android.gms.internal.vision.e2.w(i10, f13, this.f14360j0, 2.0f));
    }

    public final void B() {
        long j3;
        if (this.K && !v() && !this.f14354g && !this.f14366n && this.f14356h0 > 69000 && k10.i(this.f14338a).q()) {
            long j10 = this.f14356h0 - 59000;
            if (j10 > 10000) {
                j3 = Math.min(59000L, j10) + 59000;
            } else {
                j3 = 59000;
            }
            long j11 = this.f14356h0 - j3;
            if (j11 > 10000) {
                j3 += Math.min(59000L, j11);
            }
            this.f14339a0 = Math.min(1.0f, ((float) j3) / ((float) this.f14356h0));
        }
    }

    public final boolean E() {
        ArrayList arrayList;
        ArrayList arrayList2;
        gj gjVar;
        TLRPC.Message message;
        ArrayList arrayList3 = this.T0;
        if (!this.K && this.f14387y == null && this.f14369o0 == null && ((arrayList = this.v) == null || arrayList.size() != 1 || (gjVar = (gj) this.v.get(0)) == null || (message = gjVar.f24213k) == null || !(message.action instanceof TLRPC.TL_messageActionStarGiftUnique))) {
            if (arrayList3 != null && !arrayList3.isEmpty()) {
                for (int i7 = 0; i7 < arrayList3.size(); i7++) {
                    d20 d20Var = (d20) arrayList3.get(i7);
                    byte b10 = d20Var.f23478a;
                    if (b10 == 0) {
                        if (!u(d20Var.B, d20Var.f23485j)) {
                        }
                    } else {
                        if (b10 == 1 && (arrayList2 = d20Var.f23486k) != null && !arrayList2.isEmpty()) {
                            for (int i10 = 0; i10 < d20Var.f23486k.size(); i10++) {
                                c20 c20Var = (c20) d20Var.f23486k.get(i10);
                                if (!u(c20Var.document, c20Var.f23219a)) {
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
        throw new UnsupportedOperationException("Method not decompiled: hi.c7.b(float, android.graphics.Bitmap):android.graphics.Bitmap");
    }

    public final void c(File file) {
        Bitmap b10 = b(1.0f, null);
        Bitmap bitmap = this.f14343b1;
        if (bitmap != null) {
            bitmap.recycle();
            this.f14343b1 = null;
        }
        this.f14343b1 = Bitmap.createScaledBitmap(b10, 40, 22, true);
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            b10.compress(Bitmap.CompressFormat.JPEG, 95, fileOutputStream);
            fileOutputStream.close();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        b10.recycle();
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
                    tL_inputStickeredMediaPhoto.f28504id = tL_inputPhoto;
                    tL_inputPhoto.f28453id = photo.f28458id;
                    tL_inputPhoto.access_hash = photo.access_hash;
                    byte[] bArr = photo.file_reference;
                    tL_inputPhoto.file_reference = bArr;
                    if (bArr == null) {
                        tL_inputPhoto.file_reference = new byte[0];
                    }
                    tL_messages_getAttachedStickers.media = tL_inputStickeredMediaPhoto;
                    this.f14351e1 = ConnectionsManager.getInstance(this.f14338a).sendRequest(tL_messages_getAttachedStickers, new bi.k2(this, storyItem, tL_messages_getAttachedStickers, new ai.g1(this, 11), 7));
                }
            } else {
                TLRPC.Document document = messageMedia.document;
                if (document != null && gj.V2(document)) {
                    TLRPC.TL_inputStickeredMediaDocument tL_inputStickeredMediaDocument = new TLRPC.TL_inputStickeredMediaDocument();
                    TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                    tL_inputStickeredMediaDocument.f28503id = tL_inputDocument;
                    tL_inputDocument.f28446id = document.f28440id;
                    tL_inputDocument.access_hash = document.access_hash;
                    byte[] bArr2 = document.file_reference;
                    tL_inputDocument.file_reference = bArr2;
                    if (bArr2 == null) {
                        tL_inputDocument.file_reference = new byte[0];
                    }
                    tL_messages_getAttachedStickers.media = tL_inputStickeredMediaDocument;
                    this.f14351e1 = ConnectionsManager.getInstance(this.f14338a).sendRequest(tL_messages_getAttachedStickers, new bi.k2(this, storyItem, tL_messages_getAttachedStickers, new ai.g1(this, 11), 7));
                }
            }
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

    public final c7 g() {
        c7 c7Var = new c7();
        c7Var.f14341b = this.f14341b;
        c7Var.f14344c = this.f14344c;
        c7Var.d = this.d;
        c7Var.f14349e = this.f14349e;
        c7Var.f14352f = this.f14352f;
        c7Var.f14354g = this.f14354g;
        c7Var.h = this.h;
        c7Var.f14357i = this.f14357i;
        c7Var.f14359j = this.f14359j;
        c7Var.f14361k = this.f14361k;
        c7Var.f14363l = this.f14363l;
        c7Var.f14365m = this.f14365m;
        c7Var.f14383w = this.f14383w;
        c7Var.f14385x = this.f14385x;
        c7Var.f14387y = this.f14387y;
        c7Var.f14389z = this.f14389z;
        c7Var.A = this.A;
        c7Var.B = this.B;
        c7Var.C = this.C;
        c7Var.D = this.D;
        c7Var.E = this.E;
        c7Var.F = this.F;
        c7Var.G = this.G;
        c7Var.H = this.H;
        c7Var.I = this.I;
        c7Var.J = this.J;
        c7Var.K = this.K;
        c7Var.L = this.L;
        c7Var.M = this.M;
        boolean z10 = this.M;
        int i7 = this.f14338a;
        if (z10) {
            File w10 = w(i7, k(this.L));
            c7Var.L = w10;
            org.telegram.messenger.g0.F(this.L, w10);
        }
        c7Var.N = this.N;
        c7Var.Y = this.Y;
        c7Var.Z = this.Z;
        c7Var.f14339a0 = this.f14339a0;
        c7Var.f14356h0 = this.f14356h0;
        c7Var.f14362k0 = this.f14362k0;
        c7Var.f14364l0 = this.f14364l0;
        c7Var.f14358i0 = this.f14358i0;
        c7Var.f14360j0 = this.f14360j0;
        c7Var.f14382v0 = this.f14382v0;
        c7Var.R = this.R;
        c7Var.f14367n0.set(this.f14367n0);
        c7Var.A0 = this.A0;
        c7Var.B0 = this.B0;
        c7Var.C0 = this.C0;
        c7Var.D0 = this.D0;
        c7Var.E0 = this.E0;
        ArrayList arrayList = c7Var.F0;
        arrayList.clear();
        arrayList.addAll(this.F0);
        c7Var.G0 = this.G0;
        c7Var.H0 = this.H0;
        c7Var.I0 = this.I0;
        c7Var.M0 = this.M0;
        c7Var.N0 = this.N0;
        c7Var.f14384w0 = this.f14384w0;
        File file = this.N0;
        if (file != null && file.exists()) {
            File w11 = w(i7, k(this.N0));
            c7Var.N0 = w11;
            org.telegram.messenger.g0.F(this.N0, w11);
        }
        c7Var.O0 = this.O0;
        File file2 = this.O0;
        if (file2 != null && file2.exists()) {
            File w12 = w(i7, k(this.O0));
            c7Var.O0 = w12;
            org.telegram.messenger.g0.F(this.O0, w12);
        }
        c7Var.P0 = this.P0;
        File file3 = this.P0;
        if (file3 != null && file3.exists()) {
            File w13 = w(i7, k(this.P0));
            c7Var.P0 = w13;
            org.telegram.messenger.g0.F(this.P0, w13);
        }
        c7Var.W0 = this.W0;
        File file4 = this.W0;
        if (file4 != null && file4.exists()) {
            File w14 = w(i7, k(this.W0));
            c7Var.W0 = w14;
            org.telegram.messenger.g0.F(this.W0, w14);
        }
        c7Var.Y0 = this.Y0;
        File file5 = this.Y0;
        if (file5 != null && file5.exists()) {
            File w15 = w(i7, k(this.Y0));
            c7Var.Y0 = w15;
            org.telegram.messenger.g0.F(this.Y0, w15);
        }
        c7Var.Q0 = this.Q0;
        File file6 = this.Q0;
        if (file6 != null && file6.exists()) {
            File w16 = w(i7, k(this.Q0));
            c7Var.Q0 = w16;
            org.telegram.messenger.g0.F(this.Q0, w16);
        }
        c7Var.R0 = this.R0;
        File file7 = this.R0;
        if (file7 != null && file7.exists()) {
            File w17 = w(i7, k(this.R0));
            c7Var.R0 = w17;
            org.telegram.messenger.g0.F(this.R0, w17);
        }
        c7Var.S0 = this.S0;
        c7Var.T0 = new ArrayList();
        if (this.T0 != null) {
            for (int i10 = 0; i10 < this.T0.size(); i10++) {
                c7Var.T0.add(((d20) this.T0.get(i10)).a());
            }
        }
        c7Var.U0 = this.U0;
        c7Var.V0 = this.V0;
        c7Var.Z0 = this.Z0;
        File file8 = this.Z0;
        if (file8 != null && file8.exists()) {
            File w18 = w(i7, k(this.Z0));
            c7Var.Z0 = w18;
            org.telegram.messenger.g0.F(this.Z0, w18);
        }
        c7Var.f14340a1 = this.f14340a1;
        c7Var.f14343b1 = this.f14343b1;
        c7Var.f14346c1 = this.f14346c1;
        c7Var.O = this.O;
        c7Var.f14366n = this.f14366n;
        c7Var.f14368o = this.f14368o;
        c7Var.f14369o0 = this.f14369o0;
        c7Var.f14377s0 = this.f14377s0;
        c7Var.f14379t0 = this.f14379t0;
        c7Var.f14373q0 = this.f14373q0;
        c7Var.f14371p0 = this.f14371p0;
        c7Var.f14375r0 = this.f14375r0;
        c7Var.f14381u0 = this.f14381u0;
        c7Var.f14342b0 = this.f14342b0;
        c7Var.J0 = this.J0;
        c7Var.K0 = this.K0;
        c7Var.L0 = this.L0;
        c7Var.f14350e0 = this.f14350e0;
        c7Var.T = this.T;
        c7Var.S = this.S;
        c7Var.U = this.U;
        c7Var.X = this.X;
        c7Var.P = this.P;
        return c7Var;
    }

    public final void h(String str) {
        if (str != null) {
            try {
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                BitmapFactory.decodeFile(str, options);
                this.f14362k0 = options.outWidth;
                this.f14364l0 = options.outHeight;
            } catch (Exception unused) {
            }
        }
        if (!this.K) {
            if (((int) Math.max(this.f14362k0, (this.f14364l0 / 16.0f) * 9.0f)) <= 900) {
                this.f14358i0 = 720;
                this.f14360j0 = 1280;
                return;
            }
            this.f14358i0 = 1080;
            this.f14360j0 = 1920;
        }
    }

    public final void i(boolean z10) {
        if (this.M0 != null) {
            this.M0 = null;
        }
        File file = this.N0;
        if (file != null) {
            file.delete();
            this.N0 = null;
        }
        if (!z10) {
            f();
            File file2 = this.Z0;
            if (file2 != null) {
                file2.delete();
                this.Z0 = null;
            }
            File file3 = this.L;
            if (file3 != null) {
                if (this.M && (!this.f14354g || this.f14359j)) {
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
                int i7 = 0;
                while (i7 < size) {
                    Object obj = arrayList.get(i7);
                    i7++;
                    d20 d20Var = (d20) obj;
                    if (d20Var.f23478a == 2 && !TextUtils.isEmpty(d20Var.f23495t)) {
                        try {
                            new File(d20Var.f23495t).delete();
                        } catch (Exception e10) {
                            org.telegram.messenger.a8.g(e10, true);
                        }
                        d20Var.f23495t = "";
                    }
                }
            }
            File file4 = this.f14369o0;
            if (file4 != null && (!this.f14354g || this.f14359j)) {
                file4.delete();
                this.f14369o0 = null;
            }
            if (this.f14371p0 != null && (!this.f14354g || this.f14359j)) {
                try {
                    new File(this.f14371p0).delete();
                } catch (Exception unused) {
                }
                this.f14371p0 = null;
            }
        }
        this.O = null;
        if (this.T != null) {
            for (int i10 = 0; i10 < this.T.size(); i10++) {
                ((c7) this.T.get(i10)).i(z10);
            }
        }
        if (this.f14351e1 != 0) {
            ConnectionsManager.getInstance(this.f14338a).cancelRequest(this.f14351e1, true);
        }
    }

    public final int r() {
        long j3;
        if (this.K && !v() && !this.f14354g) {
            long j10 = this.f14356h0;
            if (j10 > 0 && !this.f14366n) {
                if ((this.f14339a0 - this.Z) * ((float) j10) >= 68999) {
                    return (int) Math.ceil(((float) j3) / 59000.0f);
                }
                return 1;
            }
            return 1;
        }
        return 1;
    }

    public final void s(y10 y10Var) {
        String absolutePath;
        int i7;
        String absolutePath2;
        int i10;
        if (!E()) {
            y10Var.a(null);
            return;
        }
        if (!this.K && ((i10 = this.f14358i0) > 720 || this.f14360j0 > 1280)) {
            float f10 = 720.0f / i10;
            this.f14367n0.postScale(f10, f10, 0.0f, 0.0f);
            this.f14358i0 = 720;
            this.f14360j0 = 1280;
        }
        File file = this.L;
        if (file == null) {
            absolutePath = null;
        } else {
            absolutePath = file.getAbsolutePath();
        }
        if (v()) {
            i7 = this.T.size();
        } else {
            i7 = 0;
        }
        int[][] iArr = (int[][]) Array.newInstance(Integer.TYPE, Math.max(1, i7), 11);
        iArr[0] = new int[11];
        ai.r rVar = new ai.r((Object) this, absolutePath, (Object) iArr, (Object) y10Var, 20);
        if (v()) {
            String[] strArr = new String[this.T.size()];
            for (int i11 = 0; i11 < this.T.size(); i11++) {
                if (((c7) this.T.get(i11)).L == null) {
                    absolutePath2 = null;
                } else {
                    absolutePath2 = ((c7) this.T.get(i11)).L.getAbsolutePath();
                }
                strArr[i11] = absolutePath2;
                iArr[i11] = new int[11];
            }
            Utilities.f22810e.c(new di.a8(strArr, iArr, rVar, 16));
        } else if (this.L == null) {
            rVar.run();
        } else {
            Utilities.f22810e.c(new di.a8(absolutePath, iArr, rVar, 17));
        }
    }

    public final boolean t() {
        if (v()) {
            for (int i7 = 0; i7 < this.T.size(); i7++) {
                if (((c7) this.T.get(i7)).K) {
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

    public final void z(Runnable runnable) {
        Bitmap bitmap;
        if (this.K && this.A0 == 0 && this.B0 == 0) {
            if (this.N != null) {
                try {
                    BitmapFactory.Options options = new BitmapFactory.Options();
                    if (this.N.startsWith("vthumb://")) {
                        long parseInt = Integer.parseInt(this.N.substring(9));
                        options.inJustDecodeBounds = true;
                        MediaStore.Video.Thumbnails.getThumbnail(org.telegram.messenger.t0.f26931b.getContentResolver(), parseInt, 1, options);
                        options.inSampleSize = d(options, 240, 240);
                        options.inJustDecodeBounds = false;
                        options.inPreferredConfig = Bitmap.Config.RGB_565;
                        options.inDither = true;
                        bitmap = MediaStore.Video.Thumbnails.getThumbnail(org.telegram.messenger.t0.f26931b.getContentResolver(), parseInt, 1, options);
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
                    int[] b10 = c8.j0.b(bitmap, true);
                    this.A0 = b10[0];
                    this.B0 = b10[1];
                    bitmap.recycle();
                    runnable.run();
                    return;
                }
                return;
            }
            Bitmap bitmap2 = this.O;
            if (bitmap2 != null) {
                int[] b11 = c8.j0.b(bitmap2, true);
                this.A0 = b11[0];
                this.B0 = b11[1];
                runnable.run();
            }
        }
    }
}
