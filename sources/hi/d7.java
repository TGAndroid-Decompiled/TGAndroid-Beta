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
public final class d7 {
    public String A;
    public int A0;
    public String B;
    public int B0;
    public long C;
    public CharSequence C0;
    public long D;
    public float E;
    public o8 E0;
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
    public t S;
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
    public gf f14364a1;
    public long f14365b;
    public boolean f14366b0;
    public Bitmap f14367b1;
    public boolean f14368c;
    public TLRPC.Document f14369c0;
    public boolean f14370c1;
    public long d;
    public bi.j f14371d0;
    public c7 f14372d1;
    public long f14373e;
    public int f14376f;
    public boolean f14377f0;
    public boolean f14378g;
    public Bitmap f14379g0;
    public boolean h;
    public long f14380h0;
    public boolean f14383j;
    public boolean f14385k;
    public int f14386k0;
    public boolean f14387l;
    public int f14388l0;
    public ArrayList f14389m;
    public xe m0;
    public boolean f14390n;
    public boolean f14392o;
    public File f14393o0;
    public SpannableStringBuilder f14394p;
    public String f14395p0;
    public TLRPC.Peer f14396q;
    public long f14397q0;
    public int f14398r;
    public long f14399r0;
    public String f14400s;
    public float f14401s0;
    public TLRPC.MessageMedia f14402t;
    public boolean f14404u;
    public ArrayList v;
    public TLRPC.InputPeer f14406v0;
    public boolean f14407w;
    public HashSet f14408w0;
    public TLRPC.TL_error f14409x;
    public Drawable f14410x0;
    public String f14411y;
    public TLRPC.InputDocument f14413z;
    public final int f14362a = k10.f24932t0;
    public double f14381i = -1.0d;
    public float F = 1.0f;
    public float G = 1.0f;
    public float P = 1.0f;
    public boolean U = false;
    public float V = 0.0f;
    public float W = 1.0f;
    public float f14363a0 = 1.0f;
    public long f14374e0 = -1;
    public int f14382i0 = 720;
    public int f14384j0 = 1280;
    public final Matrix f14391n0 = new Matrix();
    public float f14403t0 = 1.0f;
    public float f14405u0 = 1.0f;
    public boolean f14412y0 = org.telegram.ui.ActionBar.m6.I.q();
    public long f14414z0 = Long.MIN_VALUE;
    public boolean D0 = true;
    public final ArrayList F0 = new ArrayList();
    public boolean G0 = true;
    public int I0 = 86400;
    public String K0 = "";
    public long S0 = 5000;
    public int f14375e1 = 0;

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
            TLRPC.Message message = gjVar.f24177k;
            if (message != null) {
                TLRPC.Chat O0 = np.u1(i7).O0(Long.valueOf(-org.telegram.messenger.n5.o(message.peer_id)));
                if ((O0 != null && O0.noforwards) || !org.telegram.messenger.v3.V(O0)) {
                    TLRPC.MessageFwdHeader messageFwdHeader = gjVar.f24177k.fwd_from;
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

    public static d7 a(t tVar, ArrayList arrayList) {
        d7 d7Var = new d7();
        d7Var.S = tVar;
        d7Var.T = arrayList;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            d7 d7Var2 = (d7) obj;
            if (d7Var2.K) {
                d7Var.K = true;
                d7Var2.V = 0.0f;
                d7Var2.W = Math.min(1.0f, 59000.0f / ((float) d7Var2.f14380h0));
            }
        }
        if (d7Var.K) {
            d7Var.f14386k0 = 720;
            d7Var.f14388l0 = 1280;
            d7Var.f14382i0 = 720;
            d7Var.f14384j0 = 1280;
        } else {
            d7Var.f14386k0 = 1080;
            d7Var.f14388l0 = 1920;
            d7Var.f14382i0 = 1080;
            d7Var.f14384j0 = 1920;
        }
        d7Var.A();
        return d7Var;
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

    public static d7 l(ff ffVar) {
        boolean z10;
        int i7;
        d7 d7Var = new d7();
        d7Var.L = new File(ffVar.I);
        d7Var.Q = ffVar.J;
        d7Var.R = ffVar.K;
        if (!ffVar.d() && ffVar.f28023b) {
            z10 = true;
        } else {
            z10 = false;
        }
        d7Var.K = z10;
        d7Var.N = ffVar.f28024c;
        long j3 = ffVar.E * 1000;
        d7Var.f14380h0 = j3;
        d7Var.Z = 0.0f;
        d7Var.f14363a0 = Math.min(1.0f, 59000.0f / ((float) j3));
        if (d7Var.K && d7Var.N == null) {
            d7Var.N = "vthumb://" + ffVar.C;
        }
        d7Var.A0 = ffVar.T;
        d7Var.B0 = ffVar.U;
        d7Var.h(d7Var.L.getAbsolutePath());
        int i10 = ffVar.F;
        if (i10 > 0 && (i7 = ffVar.G) > 0) {
            d7Var.f14386k0 = i10;
            d7Var.f14388l0 = i7;
        }
        d7Var.A();
        return d7Var;
    }

    public static d7 m(File file, int i7) {
        d7 d7Var = new d7();
        d7Var.L = file;
        d7Var.M = true;
        d7Var.Q = i7;
        d7Var.R = 0;
        d7Var.K = false;
        if (file != null) {
            d7Var.h(file.getAbsolutePath());
        }
        d7Var.A();
        return d7Var;
    }

    public static d7 n(File file, TL_stories.StoryItem storyItem) {
        d7 d7Var = new d7();
        d7Var.f14378g = true;
        d7Var.f14376f = storyItem.f28637id;
        d7Var.L = file;
        d7Var.M = false;
        d7Var.f14386k0 = 720;
        d7Var.f14388l0 = 1280;
        TLRPC.MessageMedia messageMedia = storyItem.media;
        boolean z10 = messageMedia instanceof TLRPC.TL_messageMediaPhoto;
        int i7 = d7Var.f14362a;
        if (z10) {
            d7Var.K = false;
            if (file != null) {
                d7Var.h(file.getAbsolutePath());
            }
        } else if (messageMedia instanceof TLRPC.TL_messageMediaDocument) {
            d7Var.K = true;
            TLRPC.Document document = messageMedia.document;
            if (document != null && document.attributes != null) {
                int i10 = 0;
                while (true) {
                    if (i10 >= storyItem.media.document.attributes.size()) {
                        break;
                    }
                    TLRPC.DocumentAttribute documentAttribute = storyItem.media.document.attributes.get(i10);
                    if (documentAttribute instanceof TLRPC.TL_documentAttributeVideo) {
                        d7Var.f14386k0 = documentAttribute.f28405w;
                        d7Var.f14388l0 = documentAttribute.h;
                        d7Var.f14381i = documentAttribute.duration;
                        break;
                    }
                    i10++;
                }
            }
            TLRPC.Document document2 = storyItem.media.document;
            if (document2 != null) {
                String str = storyItem.firstFramePath;
                if (str != null) {
                    d7Var.N = str;
                } else if (document2.thumbs != null) {
                    int i11 = 0;
                    while (true) {
                        if (i11 >= storyItem.media.document.thumbs.size()) {
                            break;
                        }
                        TLRPC.PhotoSize photoSize = storyItem.media.document.thumbs.get(i11);
                        if (photoSize instanceof TLRPC.TL_photoStrippedSize) {
                            d7Var.O = fc.F(null, photoSize.bytes);
                            break;
                        }
                        org.telegram.messenger.w7.G(i7);
                        File J = org.telegram.messenger.w7.J(photoSize, null, true, true);
                        if (J != null && J.exists()) {
                            d7Var.N = J.getAbsolutePath();
                            break;
                        }
                        i11++;
                    }
                }
            }
        }
        ArrayList arrayList = d7Var.F0;
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
        d7Var.I0 = storyItem.expire_date - storyItem.date;
        try {
            CharSequence m10 = org.telegram.messenger.j6.m(new SpannableString(storyItem.caption), org.telegram.ui.ActionBar.m6.f29544o2.getFontMetricsInt(), true, null, 0);
            gj.b(m10, storyItem.entities, true, false, true, false, 0);
            d7Var.C0 = gj.B5(m10, storyItem.entities, org.telegram.ui.ActionBar.m6.f29544o2.getFontMetricsInt(), false);
        } catch (Exception unused) {
        }
        d7Var.A();
        d7Var.e(storyItem);
        d7Var.f14389m = storyItem.media_areas;
        d7Var.f14406v0 = np.u1(i7).l1(storyItem.dialogId);
        return d7Var;
    }

    public static d7 o(File file, String str, long j3) {
        d7 d7Var = new d7();
        d7Var.f14370c1 = true;
        d7Var.L = file;
        d7Var.M = true;
        d7Var.Q = 0;
        d7Var.R = 0;
        d7Var.K = true;
        d7Var.f14380h0 = j3;
        d7Var.N = str;
        d7Var.Z = 0.0f;
        d7Var.f14363a0 = Math.min(1.0f, 59500.0f / ((float) j3));
        return d7Var;
    }

    public static long p(gj gjVar) {
        Boolean D = D(gjVar);
        if (D == null) {
            return 0L;
        }
        if (D.booleanValue()) {
            return org.telegram.messenger.n5.o(gjVar.f24177k.fwd_from.from_id);
        }
        return gj.B0(gjVar.f24177k);
    }

    public static Bitmap q(b7 b7Var, int i7, int i10, int i11, boolean z10) {
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
        b7Var.c(options);
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
            return b7Var.c(options);
        }
        if (z10 && z11 && cz.o() >= 1) {
            Bitmap c10 = b7Var.c(options);
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
        return b7Var.c(options);
    }

    public static boolean u(TLRPC.Document document, String str) {
        long j3;
        if (document != null) {
            if (!"video/webm".equals(document.mime_type) && !"video/mp4".equals(document.mime_type)) {
                if (gj.K2(document, true)) {
                    RLottieNative a10 = RLottieNative.a(str, null, null, null, 0, null);
                    if (a10 != null) {
                        int i7 = a10.f33051a[0];
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

    public static d7 y(ArrayList arrayList) {
        gj gjVar;
        int i7;
        d7 d7Var = new d7();
        d7Var.f14404u = true;
        d7Var.v = arrayList;
        d7Var.f14382i0 = 1080;
        d7Var.f14384j0 = 1920;
        d7Var.f14414z0 = p((gj) arrayList.get(0));
        d20 d20Var = new d20();
        d20Var.f23442a = (byte) 6;
        d20Var.f23444c = 0.5f;
        d20Var.d = 0.5f;
        ArrayList arrayList2 = new ArrayList();
        d7Var.T0 = arrayList2;
        arrayList2.add(d20Var);
        if (arrayList.size() == 1 && (gjVar = (gj) arrayList.get(0)) != null && ((i7 = gjVar.D) == 8 || i7 == 3 || i7 == 5)) {
            TLRPC.Message message = gjVar.f24177k;
            if (message != null && message.attachPath != null) {
                d7Var.L = new File(gjVar.f24177k.attachPath);
            }
            File file = d7Var.L;
            if (file == null || !file.exists()) {
                org.telegram.messenger.w7.G(d7Var.f14362a);
                d7Var.L = org.telegram.messenger.w7.M(gjVar.f24177k, false, true);
            }
            File file2 = d7Var.L;
            if (file2 != null && file2.exists()) {
                d7Var.K = true;
                d7Var.M = false;
                long L0 = (long) (gjVar.L0() * 1000.0d);
                d7Var.f14380h0 = L0;
                d7Var.Z = 0.0f;
                d7Var.f14363a0 = Math.min(1.0f, 59500.0f / ((float) L0));
                return d7Var;
            }
            d7Var.L = null;
        }
        return d7Var;
    }

    public final void A() {
        float f10;
        Matrix matrix = this.f14391n0;
        matrix.reset();
        int i7 = this.f14386k0;
        int i10 = this.f14388l0;
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
        float f13 = this.f14382i0 / f12;
        if (this.J0 != 0) {
            f13 = Math.min(f13, this.f14384j0 / i10);
        } else {
            float f14 = i10;
            if (f14 / f12 > 1.29f) {
                f13 = Math.max(f13, this.f14384j0 / f14);
            }
        }
        matrix.postScale(f13, f13);
        matrix.postTranslate(com.google.android.gms.internal.vision.e2.w(f12, f13, this.f14382i0, 2.0f), com.google.android.gms.internal.vision.e2.w(i10, f13, this.f14384j0, 2.0f));
    }

    public final void B() {
        long j3;
        if (this.K && !v() && !this.f14378g && !this.f14390n && this.f14380h0 > 69000 && k10.i(this.f14362a).q()) {
            long j10 = this.f14380h0 - 59000;
            if (j10 > 10000) {
                j3 = Math.min(59000L, j10) + 59000;
            } else {
                j3 = 59000;
            }
            long j11 = this.f14380h0 - j3;
            if (j11 > 10000) {
                j3 += Math.min(59000L, j11);
            }
            this.f14363a0 = Math.min(1.0f, ((float) j3) / ((float) this.f14380h0));
        }
    }

    public final boolean E() {
        ArrayList arrayList;
        ArrayList arrayList2;
        gj gjVar;
        TLRPC.Message message;
        ArrayList arrayList3 = this.T0;
        if (!this.K && this.f14411y == null && this.f14393o0 == null && ((arrayList = this.v) == null || arrayList.size() != 1 || (gjVar = (gj) this.v.get(0)) == null || (message = gjVar.f24177k) == null || !(message.action instanceof TLRPC.TL_messageActionStarGiftUnique))) {
            if (arrayList3 != null && !arrayList3.isEmpty()) {
                for (int i7 = 0; i7 < arrayList3.size(); i7++) {
                    d20 d20Var = (d20) arrayList3.get(i7);
                    byte b10 = d20Var.f23442a;
                    if (b10 == 0) {
                        if (!u(d20Var.B, d20Var.f23449j)) {
                        }
                    } else {
                        if (b10 == 1 && (arrayList2 = d20Var.f23450k) != null && !arrayList2.isEmpty()) {
                            for (int i10 = 0; i10 < d20Var.f23450k.size(); i10++) {
                                c20 c20Var = (c20) d20Var.f23450k.get(i10);
                                if (!u(c20Var.document, c20Var.f23183a)) {
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
        throw new UnsupportedOperationException("Method not decompiled: hi.d7.b(float, android.graphics.Bitmap):android.graphics.Bitmap");
    }

    public final void c(File file) {
        Bitmap b10 = b(1.0f, null);
        Bitmap bitmap = this.f14367b1;
        if (bitmap != null) {
            bitmap.recycle();
            this.f14367b1 = null;
        }
        this.f14367b1 = Bitmap.createScaledBitmap(b10, 40, 22, true);
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
                    tL_inputStickeredMediaPhoto.f28468id = tL_inputPhoto;
                    tL_inputPhoto.f28417id = photo.f28422id;
                    tL_inputPhoto.access_hash = photo.access_hash;
                    byte[] bArr = photo.file_reference;
                    tL_inputPhoto.file_reference = bArr;
                    if (bArr == null) {
                        tL_inputPhoto.file_reference = new byte[0];
                    }
                    tL_messages_getAttachedStickers.media = tL_inputStickeredMediaPhoto;
                    this.f14375e1 = ConnectionsManager.getInstance(this.f14362a).sendRequest(tL_messages_getAttachedStickers, new bi.m2(this, storyItem, tL_messages_getAttachedStickers, new ai.a1(this, 11), 7));
                }
            } else {
                TLRPC.Document document = messageMedia.document;
                if (document != null && gj.V2(document)) {
                    TLRPC.TL_inputStickeredMediaDocument tL_inputStickeredMediaDocument = new TLRPC.TL_inputStickeredMediaDocument();
                    TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                    tL_inputStickeredMediaDocument.f28467id = tL_inputDocument;
                    tL_inputDocument.f28410id = document.f28404id;
                    tL_inputDocument.access_hash = document.access_hash;
                    byte[] bArr2 = document.file_reference;
                    tL_inputDocument.file_reference = bArr2;
                    if (bArr2 == null) {
                        tL_inputDocument.file_reference = new byte[0];
                    }
                    tL_messages_getAttachedStickers.media = tL_inputStickeredMediaDocument;
                    this.f14375e1 = ConnectionsManager.getInstance(this.f14362a).sendRequest(tL_messages_getAttachedStickers, new bi.m2(this, storyItem, tL_messages_getAttachedStickers, new ai.a1(this, 11), 7));
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

    public final d7 g() {
        d7 d7Var = new d7();
        d7Var.f14365b = this.f14365b;
        d7Var.f14368c = this.f14368c;
        d7Var.d = this.d;
        d7Var.f14373e = this.f14373e;
        d7Var.f14376f = this.f14376f;
        d7Var.f14378g = this.f14378g;
        d7Var.h = this.h;
        d7Var.f14381i = this.f14381i;
        d7Var.f14383j = this.f14383j;
        d7Var.f14385k = this.f14385k;
        d7Var.f14387l = this.f14387l;
        d7Var.f14389m = this.f14389m;
        d7Var.f14407w = this.f14407w;
        d7Var.f14409x = this.f14409x;
        d7Var.f14411y = this.f14411y;
        d7Var.f14413z = this.f14413z;
        d7Var.A = this.A;
        d7Var.B = this.B;
        d7Var.C = this.C;
        d7Var.D = this.D;
        d7Var.E = this.E;
        d7Var.F = this.F;
        d7Var.G = this.G;
        d7Var.H = this.H;
        d7Var.I = this.I;
        d7Var.J = this.J;
        d7Var.K = this.K;
        d7Var.L = this.L;
        d7Var.M = this.M;
        boolean z10 = this.M;
        int i7 = this.f14362a;
        if (z10) {
            File w10 = w(i7, k(this.L));
            d7Var.L = w10;
            org.telegram.messenger.g0.F(this.L, w10);
        }
        d7Var.N = this.N;
        d7Var.Y = this.Y;
        d7Var.Z = this.Z;
        d7Var.f14363a0 = this.f14363a0;
        d7Var.f14380h0 = this.f14380h0;
        d7Var.f14386k0 = this.f14386k0;
        d7Var.f14388l0 = this.f14388l0;
        d7Var.f14382i0 = this.f14382i0;
        d7Var.f14384j0 = this.f14384j0;
        d7Var.f14406v0 = this.f14406v0;
        d7Var.R = this.R;
        d7Var.f14391n0.set(this.f14391n0);
        d7Var.A0 = this.A0;
        d7Var.B0 = this.B0;
        d7Var.C0 = this.C0;
        d7Var.D0 = this.D0;
        d7Var.E0 = this.E0;
        ArrayList arrayList = d7Var.F0;
        arrayList.clear();
        arrayList.addAll(this.F0);
        d7Var.G0 = this.G0;
        d7Var.H0 = this.H0;
        d7Var.I0 = this.I0;
        d7Var.M0 = this.M0;
        d7Var.N0 = this.N0;
        d7Var.f14408w0 = this.f14408w0;
        File file = this.N0;
        if (file != null && file.exists()) {
            File w11 = w(i7, k(this.N0));
            d7Var.N0 = w11;
            org.telegram.messenger.g0.F(this.N0, w11);
        }
        d7Var.O0 = this.O0;
        File file2 = this.O0;
        if (file2 != null && file2.exists()) {
            File w12 = w(i7, k(this.O0));
            d7Var.O0 = w12;
            org.telegram.messenger.g0.F(this.O0, w12);
        }
        d7Var.P0 = this.P0;
        File file3 = this.P0;
        if (file3 != null && file3.exists()) {
            File w13 = w(i7, k(this.P0));
            d7Var.P0 = w13;
            org.telegram.messenger.g0.F(this.P0, w13);
        }
        d7Var.W0 = this.W0;
        File file4 = this.W0;
        if (file4 != null && file4.exists()) {
            File w14 = w(i7, k(this.W0));
            d7Var.W0 = w14;
            org.telegram.messenger.g0.F(this.W0, w14);
        }
        d7Var.Y0 = this.Y0;
        File file5 = this.Y0;
        if (file5 != null && file5.exists()) {
            File w15 = w(i7, k(this.Y0));
            d7Var.Y0 = w15;
            org.telegram.messenger.g0.F(this.Y0, w15);
        }
        d7Var.Q0 = this.Q0;
        File file6 = this.Q0;
        if (file6 != null && file6.exists()) {
            File w16 = w(i7, k(this.Q0));
            d7Var.Q0 = w16;
            org.telegram.messenger.g0.F(this.Q0, w16);
        }
        d7Var.R0 = this.R0;
        File file7 = this.R0;
        if (file7 != null && file7.exists()) {
            File w17 = w(i7, k(this.R0));
            d7Var.R0 = w17;
            org.telegram.messenger.g0.F(this.R0, w17);
        }
        d7Var.S0 = this.S0;
        d7Var.T0 = new ArrayList();
        if (this.T0 != null) {
            for (int i10 = 0; i10 < this.T0.size(); i10++) {
                d7Var.T0.add(((d20) this.T0.get(i10)).a());
            }
        }
        d7Var.U0 = this.U0;
        d7Var.V0 = this.V0;
        d7Var.Z0 = this.Z0;
        File file8 = this.Z0;
        if (file8 != null && file8.exists()) {
            File w18 = w(i7, k(this.Z0));
            d7Var.Z0 = w18;
            org.telegram.messenger.g0.F(this.Z0, w18);
        }
        d7Var.f14364a1 = this.f14364a1;
        d7Var.f14367b1 = this.f14367b1;
        d7Var.f14370c1 = this.f14370c1;
        d7Var.O = this.O;
        d7Var.f14390n = this.f14390n;
        d7Var.f14392o = this.f14392o;
        d7Var.f14393o0 = this.f14393o0;
        d7Var.f14401s0 = this.f14401s0;
        d7Var.f14403t0 = this.f14403t0;
        d7Var.f14397q0 = this.f14397q0;
        d7Var.f14395p0 = this.f14395p0;
        d7Var.f14399r0 = this.f14399r0;
        d7Var.f14405u0 = this.f14405u0;
        d7Var.f14366b0 = this.f14366b0;
        d7Var.J0 = this.J0;
        d7Var.K0 = this.K0;
        d7Var.L0 = this.L0;
        d7Var.f14374e0 = this.f14374e0;
        d7Var.T = this.T;
        d7Var.S = this.S;
        d7Var.U = this.U;
        d7Var.X = this.X;
        d7Var.P = this.P;
        return d7Var;
    }

    public final void h(String str) {
        if (str != null) {
            try {
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                BitmapFactory.decodeFile(str, options);
                this.f14386k0 = options.outWidth;
                this.f14388l0 = options.outHeight;
            } catch (Exception unused) {
            }
        }
        if (!this.K) {
            if (((int) Math.max(this.f14386k0, (this.f14388l0 / 16.0f) * 9.0f)) <= 900) {
                this.f14382i0 = 720;
                this.f14384j0 = 1280;
                return;
            }
            this.f14382i0 = 1080;
            this.f14384j0 = 1920;
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
                if (this.M && (!this.f14378g || this.f14383j)) {
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
                    if (d20Var.f23442a == 2 && !TextUtils.isEmpty(d20Var.f23459t)) {
                        try {
                            new File(d20Var.f23459t).delete();
                        } catch (Exception e10) {
                            org.telegram.messenger.a8.g(e10, true);
                        }
                        d20Var.f23459t = "";
                    }
                }
            }
            File file4 = this.f14393o0;
            if (file4 != null && (!this.f14378g || this.f14383j)) {
                file4.delete();
                this.f14393o0 = null;
            }
            if (this.f14395p0 != null && (!this.f14378g || this.f14383j)) {
                try {
                    new File(this.f14395p0).delete();
                } catch (Exception unused) {
                }
                this.f14395p0 = null;
            }
        }
        this.O = null;
        if (this.T != null) {
            for (int i10 = 0; i10 < this.T.size(); i10++) {
                ((d7) this.T.get(i10)).i(z10);
            }
        }
        if (this.f14375e1 != 0) {
            ConnectionsManager.getInstance(this.f14362a).cancelRequest(this.f14375e1, true);
        }
    }

    public final int r() {
        long j3;
        if (this.K && !v() && !this.f14378g) {
            long j10 = this.f14380h0;
            if (j10 > 0 && !this.f14390n) {
                if ((this.f14363a0 - this.Z) * ((float) j10) >= 68999) {
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
        if (!this.K && ((i10 = this.f14382i0) > 720 || this.f14384j0 > 1280)) {
            float f10 = 720.0f / i10;
            this.f14391n0.postScale(f10, f10, 0.0f, 0.0f);
            this.f14382i0 = 720;
            this.f14384j0 = 1280;
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
        ai.m mVar = new ai.m((Object) this, absolutePath, (Object) iArr, (Object) y10Var, 20);
        if (v()) {
            String[] strArr = new String[this.T.size()];
            for (int i11 = 0; i11 < this.T.size(); i11++) {
                if (((d7) this.T.get(i11)).L == null) {
                    absolutePath2 = null;
                } else {
                    absolutePath2 = ((d7) this.T.get(i11)).L.getAbsolutePath();
                }
                strArr[i11] = absolutePath2;
                iArr[i11] = new int[11];
            }
            Utilities.f22774e.c(new di.a8(strArr, iArr, mVar, 16));
        } else if (this.L == null) {
            mVar.run();
        } else {
            Utilities.f22774e.c(new di.a8(absolutePath, iArr, mVar, 17));
        }
    }

    public final boolean t() {
        if (v()) {
            for (int i7 = 0; i7 < this.T.size(); i7++) {
                if (((d7) this.T.get(i7)).K) {
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
                        MediaStore.Video.Thumbnails.getThumbnail(org.telegram.messenger.t0.f26895b.getContentResolver(), parseInt, 1, options);
                        options.inSampleSize = d(options, 240, 240);
                        options.inJustDecodeBounds = false;
                        options.inPreferredConfig = Bitmap.Config.RGB_565;
                        options.inDither = true;
                        bitmap = MediaStore.Video.Thumbnails.getThumbnail(org.telegram.messenger.t0.f26895b.getContentResolver(), parseInt, 1, options);
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
                    int[] b10 = c8.k0.b(bitmap, true);
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
                int[] b11 = c8.k0.b(bitmap2, true);
                this.A0 = b11[0];
                this.B0 = b11[1];
                runnable.run();
            }
        }
    }
}
