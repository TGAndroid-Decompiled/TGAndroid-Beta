package gi;

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
import b8.nc;
import java.io.File;
import java.io.FileOutputStream;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.az;
import org.telegram.messenger.h10;
import org.telegram.messenger.hp;
import org.telegram.messenger.re;
import org.telegram.messenger.u10;
import org.telegram.messenger.y10;
import org.telegram.messenger.ye;
import org.telegram.messenger.z10;
import org.telegram.messenger.zb;
import org.telegram.messenger.ze;
import org.telegram.messenger.zi;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.RLottieNative;
public final class f7 {
    public String A;
    public int A0;
    public String B;
    public int B0;
    public long C;
    public CharSequence C0;
    public long D;
    public float E;
    public r8 E0;
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
    public ze f12704a1;
    public long f12705b;
    public boolean f12706b0;
    public Bitmap f12707b1;
    public boolean f12708c;
    public TLRPC.Document f12709c0;
    public boolean f12710c1;
    public long d;
    public ai.m f12711d0;
    public e7 f12712d1;
    public long f12713e;
    public int f12716f;
    public boolean f12717f0;
    public boolean f12718g;
    public Bitmap f12719g0;
    public boolean h;
    public long f12720h0;
    public boolean f12723j;
    public boolean f12725k;
    public int f12726k0;
    public boolean f12727l;
    public int f12728l0;
    public ArrayList f12729m;
    public re m0;
    public boolean f12730n;
    public boolean f12732o;
    public File f12733o0;
    public SpannableStringBuilder f12734p;
    public String f12735p0;
    public TLRPC.Peer f12736q;
    public long f12737q0;
    public int f12738r;
    public long f12739r0;
    public String f12740s;
    public float f12741s0;
    public TLRPC.MessageMedia f12742t;
    public boolean f12744u;
    public ArrayList v;
    public TLRPC.InputPeer f12746v0;
    public boolean f12747w;
    public HashSet f12748w0;
    public TLRPC.TL_error f12749x;
    public Drawable f12750x0;
    public String f12751y;
    public TLRPC.InputDocument f12753z;
    public final int f12702a = h10.f22829t0;
    public double f12721i = -1.0d;
    public float F = 1.0f;
    public float G = 1.0f;
    public float P = 1.0f;
    public boolean U = false;
    public float V = 0.0f;
    public float W = 1.0f;
    public float f12703a0 = 1.0f;
    public long f12714e0 = -1;
    public int f12722i0 = 720;
    public int f12724j0 = 1280;
    public final Matrix f12731n0 = new Matrix();
    public float f12743t0 = 1.0f;
    public float f12745u0 = 1.0f;
    public boolean f12752y0 = org.telegram.ui.ActionBar.k6.I.q();
    public long f12754z0 = Long.MIN_VALUE;
    public boolean D0 = true;
    public final ArrayList F0 = new ArrayList();
    public boolean G0 = true;
    public int I0 = 86400;
    public String K0 = "";
    public long S0 = 5000;
    public int f12715e1 = 0;

    public static void C(BitmapFactory.Options options, int i3) {
        Runtime runtime = Runtime.getRuntime();
        long maxMemory = runtime.maxMemory() - (runtime.totalMemory() - runtime.freeMemory());
        int i10 = options.outWidth;
        int i11 = options.outHeight;
        if (i10 * i11 * 8 <= maxMemory && Math.max(i10, i11) <= 4200 && az.o() > 0) {
            return;
        }
        options.inScaled = true;
        options.inDensity = options.outWidth;
        options.inTargetDensity = i3;
    }

    public static Boolean D(zi ziVar) {
        TLRPC.Peer peer;
        if (ziVar != null) {
            int i3 = ziVar.I1;
            TLRPC.Message message = ziVar.f26868k;
            if (message != null) {
                TLRPC.Chat M0 = hp.s1(i3).M0(Long.valueOf(-org.telegram.messenger.m5.o(message.peer_id)));
                if ((M0 != null && M0.noforwards) || !org.telegram.messenger.t3.V(M0)) {
                    TLRPC.MessageFwdHeader messageFwdHeader = ziVar.f26868k.fwd_from;
                    if (messageFwdHeader != null && (peer = messageFwdHeader.from_id) != null && (messageFwdHeader.flags & 4) != 0) {
                        long o10 = org.telegram.messenger.m5.o(peer);
                        TLRPC.Chat M02 = hp.s1(i3).M0(Long.valueOf(-o10));
                        if (o10 < 0 && ((M02 == null || !M02.noforwards) && org.telegram.messenger.t3.V(M02))) {
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

    public static f7 a(t tVar, ArrayList arrayList) {
        f7 f7Var = new f7();
        f7Var.S = tVar;
        f7Var.T = arrayList;
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            f7 f7Var2 = (f7) obj;
            if (f7Var2.K) {
                f7Var.K = true;
                f7Var2.V = 0.0f;
                f7Var2.W = Math.min(1.0f, 59000.0f / ((float) f7Var2.f12720h0));
            }
        }
        if (f7Var.K) {
            f7Var.f12726k0 = 720;
            f7Var.f12728l0 = 1280;
            f7Var.f12722i0 = 720;
            f7Var.f12724j0 = 1280;
        } else {
            f7Var.f12726k0 = 1080;
            f7Var.f12728l0 = 1920;
            f7Var.f12722i0 = 1080;
            f7Var.f12724j0 = 1920;
        }
        f7Var.A();
        return f7Var;
    }

    public static int d(BitmapFactory.Options options, int i3, int i10) {
        int min;
        int i11 = options.outHeight;
        int i12 = options.outWidth;
        if (i11 <= i10 && i12 <= i3) {
            min = 1;
        } else {
            min = Math.min((int) Math.ceil(i11 / i10), (int) Math.ceil(i12 / i3));
        }
        double d = min;
        return Math.max(1, (int) Math.pow(d, Math.floor(Math.log(d) / Math.log(2.0d))));
    }

    public static void j(Canvas canvas, Drawable drawable, int i3, int i10) {
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
            float max = Math.max(i3 / width, i10 / height);
            drawable.setBounds(0, 0, (int) (width * max), (int) (height * max));
            drawable.draw(canvas);
        } else {
            drawable.setBounds(0, 0, i3, i10);
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

    public static f7 l(ye yeVar) {
        boolean z10;
        int i3;
        f7 f7Var = new f7();
        f7Var.L = new File(yeVar.I);
        f7Var.Q = yeVar.J;
        f7Var.R = yeVar.K;
        if (!yeVar.d() && yeVar.f25310b) {
            z10 = true;
        } else {
            z10 = false;
        }
        f7Var.K = z10;
        f7Var.N = yeVar.f25311c;
        long j10 = yeVar.E * 1000;
        f7Var.f12720h0 = j10;
        f7Var.Z = 0.0f;
        f7Var.f12703a0 = Math.min(1.0f, 59000.0f / ((float) j10));
        if (f7Var.K && f7Var.N == null) {
            f7Var.N = "vthumb://" + yeVar.C;
        }
        f7Var.A0 = yeVar.T;
        f7Var.B0 = yeVar.U;
        f7Var.h(f7Var.L.getAbsolutePath());
        int i10 = yeVar.F;
        if (i10 > 0 && (i3 = yeVar.G) > 0) {
            f7Var.f12726k0 = i10;
            f7Var.f12728l0 = i3;
        }
        f7Var.A();
        return f7Var;
    }

    public static f7 m(File file, int i3) {
        f7 f7Var = new f7();
        f7Var.L = file;
        f7Var.M = true;
        f7Var.Q = i3;
        f7Var.R = 0;
        f7Var.K = false;
        if (file != null) {
            f7Var.h(file.getAbsolutePath());
        }
        f7Var.A();
        return f7Var;
    }

    public static f7 n(File file, TL_stories.StoryItem storyItem) {
        f7 f7Var = new f7();
        f7Var.f12718g = true;
        f7Var.f12716f = storyItem.f27240id;
        f7Var.L = file;
        f7Var.M = false;
        f7Var.f12726k0 = 720;
        f7Var.f12728l0 = 1280;
        TLRPC.MessageMedia messageMedia = storyItem.media;
        boolean z10 = messageMedia instanceof TLRPC.TL_messageMediaPhoto;
        int i3 = f7Var.f12702a;
        if (z10) {
            f7Var.K = false;
            if (file != null) {
                f7Var.h(file.getAbsolutePath());
            }
        } else if (messageMedia instanceof TLRPC.TL_messageMediaDocument) {
            f7Var.K = true;
            TLRPC.Document document = messageMedia.document;
            if (document != null && document.attributes != null) {
                int i10 = 0;
                while (true) {
                    if (i10 >= storyItem.media.document.attributes.size()) {
                        break;
                    }
                    TLRPC.DocumentAttribute documentAttribute = storyItem.media.document.attributes.get(i10);
                    if (documentAttribute instanceof TLRPC.TL_documentAttributeVideo) {
                        f7Var.f12726k0 = documentAttribute.f27008w;
                        f7Var.f12728l0 = documentAttribute.h;
                        f7Var.f12721i = documentAttribute.duration;
                        break;
                    }
                    i10++;
                }
            }
            TLRPC.Document document2 = storyItem.media.document;
            if (document2 != null) {
                String str = storyItem.firstFramePath;
                if (str != null) {
                    f7Var.N = str;
                } else if (document2.thumbs != null) {
                    int i11 = 0;
                    while (true) {
                        if (i11 >= storyItem.media.document.thumbs.size()) {
                            break;
                        }
                        TLRPC.PhotoSize photoSize = storyItem.media.document.thumbs.get(i11);
                        if (photoSize instanceof TLRPC.TL_photoStrippedSize) {
                            f7Var.O = zb.F(null, photoSize.bytes);
                            break;
                        }
                        org.telegram.messenger.w7.G(i3);
                        File K = org.telegram.messenger.w7.K(photoSize, null, true, true);
                        if (K != null && K.exists()) {
                            f7Var.N = K.getAbsolutePath();
                            break;
                        }
                        i11++;
                    }
                }
            }
        }
        ArrayList arrayList = f7Var.F0;
        arrayList.clear();
        ArrayList<TLRPC.PrivacyRule> arrayList2 = storyItem.privacy;
        hp s12 = hp.s1(i3);
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
                        TLRPC.InputUser q12 = s12.q1(s12.a2(l10));
                        if (!(q12 instanceof TLRPC.TL_inputUserEmpty)) {
                            tL_inputPrivacyValueDisallowUsers.users.add(q12);
                        }
                    }
                    arrayList3.add(tL_inputPrivacyValueDisallowUsers);
                } else if (privacyRule instanceof TLRPC.TL_privacyValueAllowUsers) {
                    TLRPC.TL_privacyValueAllowUsers tL_privacyValueAllowUsers = (TLRPC.TL_privacyValueAllowUsers) privacyRule;
                    TLRPC.TL_inputPrivacyValueAllowUsers tL_inputPrivacyValueAllowUsers = new TLRPC.TL_inputPrivacyValueAllowUsers();
                    for (int i14 = 0; i14 < tL_privacyValueAllowUsers.users.size(); i14++) {
                        Long l11 = tL_privacyValueAllowUsers.users.get(i14);
                        l11.getClass();
                        TLRPC.InputUser q13 = s12.q1(s12.a2(l11));
                        if (!(q13 instanceof TLRPC.TL_inputUserEmpty)) {
                            tL_inputPrivacyValueAllowUsers.users.add(q13);
                        }
                    }
                    arrayList3.add(tL_inputPrivacyValueAllowUsers);
                }
            }
        }
        arrayList.addAll(arrayList3);
        f7Var.I0 = storyItem.expire_date - storyItem.date;
        try {
            CharSequence m10 = org.telegram.messenger.i6.m(new SpannableString(storyItem.caption), org.telegram.ui.ActionBar.k6.f28077o2.getFontMetricsInt(), true, null, 0);
            zi.b(m10, storyItem.entities, true, false, true, false, 0);
            f7Var.C0 = zi.C5(m10, storyItem.entities, org.telegram.ui.ActionBar.k6.f28077o2.getFontMetricsInt(), false);
        } catch (Exception unused) {
        }
        f7Var.A();
        f7Var.e(storyItem);
        f7Var.f12729m = storyItem.media_areas;
        f7Var.f12746v0 = hp.s1(i3).j1(storyItem.dialogId);
        return f7Var;
    }

    public static f7 o(File file, String str, long j10) {
        f7 f7Var = new f7();
        f7Var.f12710c1 = true;
        f7Var.L = file;
        f7Var.M = true;
        f7Var.Q = 0;
        f7Var.R = 0;
        f7Var.K = true;
        f7Var.f12720h0 = j10;
        f7Var.N = str;
        f7Var.Z = 0.0f;
        f7Var.f12703a0 = Math.min(1.0f, 59500.0f / ((float) j10));
        return f7Var;
    }

    public static long p(zi ziVar) {
        Boolean D = D(ziVar);
        if (D == null) {
            return 0L;
        }
        if (D.booleanValue()) {
            return org.telegram.messenger.m5.o(ziVar.f26868k.fwd_from.from_id);
        }
        return zi.B0(ziVar.f26868k);
    }

    public static Bitmap q(d7 d7Var, int i3, int i10, int i11, boolean z10) {
        int i12;
        int i13;
        boolean z11;
        if (i11 != 90 && i11 != 270) {
            i13 = i3;
            i12 = i10;
        } else {
            i12 = i3;
            i13 = i10;
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        d7Var.f(options);
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
            return d7Var.f(options);
        }
        if (z10 && z11 && az.o() >= 1) {
            Bitmap f10 = d7Var.f(options);
            float max = Math.max(i13 / f10.getWidth(), i12 / f10.getHeight());
            Bitmap createBitmap = Bitmap.createBitmap((int) (f10.getWidth() * max), (int) (f10.getHeight() * max), Bitmap.Config.ARGB_8888);
            Utilities.y(f10, createBitmap);
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
        return d7Var.f(options);
    }

    public static boolean u(TLRPC.Document document, String str) {
        long j10;
        if (document != null) {
            if (!"video/webm".equals(document.mime_type) && !"video/mp4".equals(document.mime_type)) {
                if (zi.L2(document, true)) {
                    RLottieNative a10 = RLottieNative.a(str, null, null, null, 0, null);
                    if (a10 != null) {
                        int i3 = a10.f31545a[0];
                        a10.d();
                        j10 = i3;
                    } else {
                        j10 = 0;
                    }
                    if (j10 > 1) {
                    }
                }
            }
            return true;
        }
        return false;
    }

    public static File w(int i3, String str) {
        TLRPC.TL_videoSize_layer127 tL_videoSize_layer127;
        TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated = new TLRPC.TL_fileLocationToBeDeprecated();
        tL_fileLocationToBeDeprecated.volume_id = -2147483648L;
        tL_fileLocationToBeDeprecated.dc_id = Integer.MIN_VALUE;
        tL_fileLocationToBeDeprecated.local_id = az.p();
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
        org.telegram.messenger.w7.G(i3);
        return org.telegram.messenger.w7.K(tL_videoSize_layer127, str, true, true);
    }

    public static File x(int i3, boolean z10) {
        String str;
        if (z10) {
            str = "mp4";
        } else {
            str = "jpg";
        }
        return w(i3, str);
    }

    public static f7 y(ArrayList arrayList) {
        zi ziVar;
        int i3;
        f7 f7Var = new f7();
        f7Var.f12744u = true;
        f7Var.v = arrayList;
        f7Var.f12722i0 = 1080;
        f7Var.f12724j0 = 1920;
        f7Var.f12754z0 = p((zi) arrayList.get(0));
        z10 z10Var = new z10();
        z10Var.f26703a = (byte) 6;
        z10Var.f26705c = 0.5f;
        z10Var.d = 0.5f;
        ArrayList arrayList2 = new ArrayList();
        f7Var.T0 = arrayList2;
        arrayList2.add(z10Var);
        if (arrayList.size() == 1 && (ziVar = (zi) arrayList.get(0)) != null && ((i3 = ziVar.D) == 8 || i3 == 3 || i3 == 5)) {
            TLRPC.Message message = ziVar.f26868k;
            if (message != null && message.attachPath != null) {
                f7Var.L = new File(ziVar.f26868k.attachPath);
            }
            File file = f7Var.L;
            if (file == null || !file.exists()) {
                org.telegram.messenger.w7.G(f7Var.f12702a);
                f7Var.L = org.telegram.messenger.w7.N(ziVar.f26868k, false, true);
            }
            File file2 = f7Var.L;
            if (file2 != null && file2.exists()) {
                f7Var.K = true;
                f7Var.M = false;
                long L0 = (long) (ziVar.L0() * 1000.0d);
                f7Var.f12720h0 = L0;
                f7Var.Z = 0.0f;
                f7Var.f12703a0 = Math.min(1.0f, 59500.0f / ((float) L0));
                return f7Var;
            }
            f7Var.L = null;
        }
        return f7Var;
    }

    public final void A() {
        float f10;
        Matrix matrix = this.f12731n0;
        matrix.reset();
        int i3 = this.f12726k0;
        int i10 = this.f12728l0;
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
        matrix.postScale(f10, f11, i3 / 2.0f, i10 / 2.0f);
        if (i11 != 0) {
            matrix.postTranslate((-i3) / 2.0f, (-i10) / 2.0f);
            matrix.postRotate(i11);
            if (i11 == 90 || i11 == 270) {
                i10 = i3;
                i3 = i10;
            }
            matrix.postTranslate(i3 / 2.0f, i10 / 2.0f);
        }
        float f12 = i3;
        float f13 = this.f12722i0 / f12;
        if (this.J0 != 0) {
            f13 = Math.min(f13, this.f12724j0 / i10);
        } else {
            float f14 = i10;
            if (f14 / f12 > 1.29f) {
                f13 = Math.max(f13, this.f12724j0 / f14);
            }
        }
        matrix.postScale(f13, f13);
        matrix.postTranslate(com.google.android.recaptcha.internal.a.c(f12, f13, this.f12722i0, 2.0f), com.google.android.recaptcha.internal.a.c(i10, f13, this.f12724j0, 2.0f));
    }

    public final void B() {
        long j10;
        if (this.K && !v() && !this.f12718g && !this.f12730n && this.f12720h0 > 69000 && h10.i(this.f12702a).q()) {
            long j11 = this.f12720h0 - 59000;
            if (j11 > 10000) {
                j10 = Math.min(59000L, j11) + 59000;
            } else {
                j10 = 59000;
            }
            long j12 = this.f12720h0 - j10;
            if (j12 > 10000) {
                j10 += Math.min(59000L, j12);
            }
            this.f12703a0 = Math.min(1.0f, ((float) j10) / ((float) this.f12720h0));
        }
    }

    public final boolean E() {
        ArrayList arrayList;
        ArrayList arrayList2;
        zi ziVar;
        TLRPC.Message message;
        ArrayList arrayList3 = this.T0;
        if (!this.K && this.f12751y == null && this.f12733o0 == null && ((arrayList = this.v) == null || arrayList.size() != 1 || (ziVar = (zi) this.v.get(0)) == null || (message = ziVar.f26868k) == null || !(message.action instanceof TLRPC.TL_messageActionStarGiftUnique))) {
            if (arrayList3 != null && !arrayList3.isEmpty()) {
                for (int i3 = 0; i3 < arrayList3.size(); i3++) {
                    z10 z10Var = (z10) arrayList3.get(i3);
                    byte b10 = z10Var.f26703a;
                    if (b10 == 0) {
                        if (!u(z10Var.B, z10Var.f26710j)) {
                        }
                    } else {
                        if (b10 == 1 && (arrayList2 = z10Var.f26711k) != null && !arrayList2.isEmpty()) {
                            for (int i10 = 0; i10 < z10Var.f26711k.size(); i10++) {
                                y10 y10Var = (y10) z10Var.f26711k.get(i10);
                                if (!u(y10Var.document, y10Var.f26509a)) {
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
        throw new UnsupportedOperationException("Method not decompiled: gi.f7.b(float, android.graphics.Bitmap):android.graphics.Bitmap");
    }

    public final void c(File file) {
        Bitmap b10 = b(1.0f, null);
        Bitmap bitmap = this.f12707b1;
        if (bitmap != null) {
            bitmap.recycle();
            this.f12707b1 = null;
        }
        this.f12707b1 = Bitmap.createScaledBitmap(b10, 40, 22, true);
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
                    tL_inputStickeredMediaPhoto.f27071id = tL_inputPhoto;
                    tL_inputPhoto.f27020id = photo.f27025id;
                    tL_inputPhoto.access_hash = photo.access_hash;
                    byte[] bArr = photo.file_reference;
                    tL_inputPhoto.file_reference = bArr;
                    if (bArr == null) {
                        tL_inputPhoto.file_reference = new byte[0];
                    }
                    tL_messages_getAttachedStickers.media = tL_inputStickeredMediaPhoto;
                    this.f12715e1 = ConnectionsManager.getInstance(this.f12702a).sendRequest(tL_messages_getAttachedStickers, new ai.q1(this, storyItem, tL_messages_getAttachedStickers, new ci.d0(this, 10), 7));
                }
            } else {
                TLRPC.Document document = messageMedia.document;
                if (document != null && zi.W2(document)) {
                    TLRPC.TL_inputStickeredMediaDocument tL_inputStickeredMediaDocument = new TLRPC.TL_inputStickeredMediaDocument();
                    TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                    tL_inputStickeredMediaDocument.f27070id = tL_inputDocument;
                    tL_inputDocument.f27013id = document.f27007id;
                    tL_inputDocument.access_hash = document.access_hash;
                    byte[] bArr2 = document.file_reference;
                    tL_inputDocument.file_reference = bArr2;
                    if (bArr2 == null) {
                        tL_inputDocument.file_reference = new byte[0];
                    }
                    tL_messages_getAttachedStickers.media = tL_inputStickeredMediaDocument;
                    this.f12715e1 = ConnectionsManager.getInstance(this.f12702a).sendRequest(tL_messages_getAttachedStickers, new ai.q1(this, storyItem, tL_messages_getAttachedStickers, new ci.d0(this, 10), 7));
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

    public final f7 g() {
        f7 f7Var = new f7();
        f7Var.f12705b = this.f12705b;
        f7Var.f12708c = this.f12708c;
        f7Var.d = this.d;
        f7Var.f12713e = this.f12713e;
        f7Var.f12716f = this.f12716f;
        f7Var.f12718g = this.f12718g;
        f7Var.h = this.h;
        f7Var.f12721i = this.f12721i;
        f7Var.f12723j = this.f12723j;
        f7Var.f12725k = this.f12725k;
        f7Var.f12727l = this.f12727l;
        f7Var.f12729m = this.f12729m;
        f7Var.f12747w = this.f12747w;
        f7Var.f12749x = this.f12749x;
        f7Var.f12751y = this.f12751y;
        f7Var.f12753z = this.f12753z;
        f7Var.A = this.A;
        f7Var.B = this.B;
        f7Var.C = this.C;
        f7Var.D = this.D;
        f7Var.E = this.E;
        f7Var.F = this.F;
        f7Var.G = this.G;
        f7Var.H = this.H;
        f7Var.I = this.I;
        f7Var.J = this.J;
        f7Var.K = this.K;
        f7Var.L = this.L;
        f7Var.M = this.M;
        boolean z10 = this.M;
        int i3 = this.f12702a;
        if (z10) {
            File w10 = w(i3, k(this.L));
            f7Var.L = w10;
            org.telegram.messenger.g0.F(this.L, w10);
        }
        f7Var.N = this.N;
        f7Var.Y = this.Y;
        f7Var.Z = this.Z;
        f7Var.f12703a0 = this.f12703a0;
        f7Var.f12720h0 = this.f12720h0;
        f7Var.f12726k0 = this.f12726k0;
        f7Var.f12728l0 = this.f12728l0;
        f7Var.f12722i0 = this.f12722i0;
        f7Var.f12724j0 = this.f12724j0;
        f7Var.f12746v0 = this.f12746v0;
        f7Var.R = this.R;
        f7Var.f12731n0.set(this.f12731n0);
        f7Var.A0 = this.A0;
        f7Var.B0 = this.B0;
        f7Var.C0 = this.C0;
        f7Var.D0 = this.D0;
        f7Var.E0 = this.E0;
        ArrayList arrayList = f7Var.F0;
        arrayList.clear();
        arrayList.addAll(this.F0);
        f7Var.G0 = this.G0;
        f7Var.H0 = this.H0;
        f7Var.I0 = this.I0;
        f7Var.M0 = this.M0;
        f7Var.N0 = this.N0;
        f7Var.f12748w0 = this.f12748w0;
        File file = this.N0;
        if (file != null && file.exists()) {
            File w11 = w(i3, k(this.N0));
            f7Var.N0 = w11;
            org.telegram.messenger.g0.F(this.N0, w11);
        }
        f7Var.O0 = this.O0;
        File file2 = this.O0;
        if (file2 != null && file2.exists()) {
            File w12 = w(i3, k(this.O0));
            f7Var.O0 = w12;
            org.telegram.messenger.g0.F(this.O0, w12);
        }
        f7Var.P0 = this.P0;
        File file3 = this.P0;
        if (file3 != null && file3.exists()) {
            File w13 = w(i3, k(this.P0));
            f7Var.P0 = w13;
            org.telegram.messenger.g0.F(this.P0, w13);
        }
        f7Var.W0 = this.W0;
        File file4 = this.W0;
        if (file4 != null && file4.exists()) {
            File w14 = w(i3, k(this.W0));
            f7Var.W0 = w14;
            org.telegram.messenger.g0.F(this.W0, w14);
        }
        f7Var.Y0 = this.Y0;
        File file5 = this.Y0;
        if (file5 != null && file5.exists()) {
            File w15 = w(i3, k(this.Y0));
            f7Var.Y0 = w15;
            org.telegram.messenger.g0.F(this.Y0, w15);
        }
        f7Var.Q0 = this.Q0;
        File file6 = this.Q0;
        if (file6 != null && file6.exists()) {
            File w16 = w(i3, k(this.Q0));
            f7Var.Q0 = w16;
            org.telegram.messenger.g0.F(this.Q0, w16);
        }
        f7Var.R0 = this.R0;
        File file7 = this.R0;
        if (file7 != null && file7.exists()) {
            File w17 = w(i3, k(this.R0));
            f7Var.R0 = w17;
            org.telegram.messenger.g0.F(this.R0, w17);
        }
        f7Var.S0 = this.S0;
        f7Var.T0 = new ArrayList();
        if (this.T0 != null) {
            for (int i10 = 0; i10 < this.T0.size(); i10++) {
                f7Var.T0.add(((z10) this.T0.get(i10)).a());
            }
        }
        f7Var.U0 = this.U0;
        f7Var.V0 = this.V0;
        f7Var.Z0 = this.Z0;
        File file8 = this.Z0;
        if (file8 != null && file8.exists()) {
            File w18 = w(i3, k(this.Z0));
            f7Var.Z0 = w18;
            org.telegram.messenger.g0.F(this.Z0, w18);
        }
        f7Var.f12704a1 = this.f12704a1;
        f7Var.f12707b1 = this.f12707b1;
        f7Var.f12710c1 = this.f12710c1;
        f7Var.O = this.O;
        f7Var.f12730n = this.f12730n;
        f7Var.f12732o = this.f12732o;
        f7Var.f12733o0 = this.f12733o0;
        f7Var.f12741s0 = this.f12741s0;
        f7Var.f12743t0 = this.f12743t0;
        f7Var.f12737q0 = this.f12737q0;
        f7Var.f12735p0 = this.f12735p0;
        f7Var.f12739r0 = this.f12739r0;
        f7Var.f12745u0 = this.f12745u0;
        f7Var.f12706b0 = this.f12706b0;
        f7Var.J0 = this.J0;
        f7Var.K0 = this.K0;
        f7Var.L0 = this.L0;
        f7Var.f12714e0 = this.f12714e0;
        f7Var.T = this.T;
        f7Var.S = this.S;
        f7Var.U = this.U;
        f7Var.X = this.X;
        f7Var.P = this.P;
        return f7Var;
    }

    public final void h(String str) {
        if (str != null) {
            try {
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                BitmapFactory.decodeFile(str, options);
                this.f12726k0 = options.outWidth;
                this.f12728l0 = options.outHeight;
            } catch (Exception unused) {
            }
        }
        if (!this.K) {
            if (((int) Math.max(this.f12726k0, (this.f12728l0 / 16.0f) * 9.0f)) <= 900) {
                this.f12722i0 = 720;
                this.f12724j0 = 1280;
                return;
            }
            this.f12722i0 = 1080;
            this.f12724j0 = 1920;
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
                if (this.M && (!this.f12718g || this.f12723j)) {
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
                int i3 = 0;
                while (i3 < size) {
                    Object obj = arrayList.get(i3);
                    i3++;
                    z10 z10Var = (z10) obj;
                    if (z10Var.f26703a == 2 && !TextUtils.isEmpty(z10Var.f26720t)) {
                        try {
                            new File(z10Var.f26720t).delete();
                        } catch (Exception e10) {
                            org.telegram.messenger.a8.g(e10, true);
                        }
                        z10Var.f26720t = "";
                    }
                }
            }
            File file4 = this.f12733o0;
            if (file4 != null && (!this.f12718g || this.f12723j)) {
                file4.delete();
                this.f12733o0 = null;
            }
            if (this.f12735p0 != null && (!this.f12718g || this.f12723j)) {
                try {
                    new File(this.f12735p0).delete();
                } catch (Exception unused) {
                }
                this.f12735p0 = null;
            }
        }
        this.O = null;
        if (this.T != null) {
            for (int i10 = 0; i10 < this.T.size(); i10++) {
                ((f7) this.T.get(i10)).i(z10);
            }
        }
        if (this.f12715e1 != 0) {
            ConnectionsManager.getInstance(this.f12702a).cancelRequest(this.f12715e1, true);
        }
    }

    public final int r() {
        long j10;
        if (this.K && !v() && !this.f12718g) {
            long j11 = this.f12720h0;
            if (j11 > 0 && !this.f12730n) {
                if ((this.f12703a0 - this.Z) * ((float) j11) >= 68999) {
                    return (int) Math.ceil(((float) j10) / 59000.0f);
                }
                return 1;
            }
            return 1;
        }
        return 1;
    }

    public final void s(u10 u10Var) {
        String absolutePath;
        int i3;
        String absolutePath2;
        int i10;
        if (!E()) {
            u10Var.a(null);
            return;
        }
        if (!this.K && ((i10 = this.f12722i0) > 720 || this.f12724j0 > 1280)) {
            float f10 = 720.0f / i10;
            this.f12731n0.postScale(f10, f10, 0.0f, 0.0f);
            this.f12722i0 = 720;
            this.f12724j0 = 1280;
        }
        File file = this.L;
        if (file == null) {
            absolutePath = null;
        } else {
            absolutePath = file.getAbsolutePath();
        }
        if (v()) {
            i3 = this.T.size();
        } else {
            i3 = 0;
        }
        int[][] iArr = (int[][]) Array.newInstance(Integer.TYPE, Math.max(1, i3), 11);
        iArr[0] = new int[11];
        ai.z3 z3Var = new ai.z3(this, absolutePath, iArr, u10Var, 17);
        if (v()) {
            String[] strArr = new String[this.T.size()];
            for (int i11 = 0; i11 < this.T.size(); i11++) {
                if (((f7) this.T.get(i11)).L == null) {
                    absolutePath2 = null;
                } else {
                    absolutePath2 = ((f7) this.T.get(i11)).L.getAbsolutePath();
                }
                strArr[i11] = absolutePath2;
                iArr[i11] = new int[11];
            }
            Utilities.f21387e.c(new ei.h9(strArr, iArr, z3Var, 8));
        } else if (this.L == null) {
            z3Var.run();
        } else {
            Utilities.f21387e.c(new ei.h9(absolutePath, iArr, z3Var, 9));
        }
    }

    public final boolean t() {
        if (v()) {
            for (int i3 = 0; i3 < this.T.size(); i3++) {
                if (((f7) this.T.get(i3)).K) {
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
                        MediaStore.Video.Thumbnails.getThumbnail(org.telegram.messenger.t0.f25457b.getContentResolver(), parseInt, 1, options);
                        options.inSampleSize = d(options, 240, 240);
                        options.inJustDecodeBounds = false;
                        options.inPreferredConfig = Bitmap.Config.RGB_565;
                        options.inDither = true;
                        bitmap = MediaStore.Video.Thumbnails.getThumbnail(org.telegram.messenger.t0.f25457b.getContentResolver(), parseInt, 1, options);
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
                    int[] b10 = nc.b(bitmap, true);
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
                int[] b11 = nc.b(bitmap2, true);
                this.A0 = b11[0];
                this.B0 = b11[1];
                runnable.run();
            }
        }
    }
}
