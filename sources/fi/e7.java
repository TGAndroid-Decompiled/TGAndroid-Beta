package fi;

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
import org.telegram.messenger.g20;
import org.telegram.messenger.gc;
import org.telegram.messenger.gf;
import org.telegram.messenger.h20;
import org.telegram.messenger.hf;
import org.telegram.messenger.ij;
import org.telegram.messenger.iz;
import org.telegram.messenger.p10;
import org.telegram.messenger.qp;
import org.telegram.messenger.ye;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.RLottieNative;
public final class e7 {
    public String A;
    public int A0;
    public String B;
    public int B0;
    public long C;
    public CharSequence C0;
    public long D;
    public float E;
    public q8 E0;
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
    public hf f11882a1;
    public long f11883b;
    public boolean f11884b0;
    public Bitmap f11885b1;
    public boolean f11886c;
    public TLRPC.Document f11887c0;
    public boolean f11888c1;
    public long d;
    public bi.v3 f11889d0;
    public d7 f11890d1;
    public long f11891e;
    public int f11894f;
    public boolean f11895f0;
    public boolean f11896g;
    public Bitmap f11897g0;
    public boolean h;
    public long f11898h0;
    public boolean f11901j;
    public boolean f11903k;
    public int f11904k0;
    public boolean f11905l;
    public int f11906l0;
    public ArrayList f11907m;
    public ye m0;
    public boolean f11908n;
    public boolean f11910o;
    public File f11911o0;
    public SpannableStringBuilder f11912p;
    public String f11913p0;
    public TLRPC.Peer f11914q;
    public long f11915q0;
    public int f11916r;
    public long f11917r0;
    public String f11918s;
    public float f11919s0;
    public TLRPC.MessageMedia f11920t;
    public boolean f11922u;
    public ArrayList v;
    public TLRPC.InputPeer f11924v0;
    public boolean f11925w;
    public HashSet f11926w0;
    public TLRPC.TL_error f11927x;
    public Drawable f11928x0;
    public String f11929y;
    public TLRPC.InputDocument f11931z;
    public final int f11880a = p10.f24474s0;
    public double f11899i = -1.0d;
    public float F = 1.0f;
    public float G = 1.0f;
    public float P = 1.0f;
    public boolean U = false;
    public float V = 0.0f;
    public float W = 1.0f;
    public float f11881a0 = 1.0f;
    public long f11892e0 = -1;
    public int f11900i0 = 720;
    public int f11902j0 = 1280;
    public final Matrix f11909n0 = new Matrix();
    public float f11921t0 = 1.0f;
    public float f11923u0 = 1.0f;
    public boolean f11930y0 = org.telegram.ui.ActionBar.m6.I.q();
    public long f11932z0 = Long.MIN_VALUE;
    public boolean D0 = true;
    public final ArrayList F0 = new ArrayList();
    public boolean G0 = true;
    public int I0 = 86400;
    public String K0 = "";
    public long S0 = 5000;
    public int f11893e1 = 0;

    public static void C(BitmapFactory.Options options, int i7) {
        Runtime runtime = Runtime.getRuntime();
        long maxMemory = runtime.maxMemory() - (runtime.totalMemory() - runtime.freeMemory());
        int i10 = options.outWidth;
        int i11 = options.outHeight;
        if (i10 * i11 * 8 <= maxMemory && Math.max(i10, i11) <= 4200 && iz.o() > 0) {
            return;
        }
        options.inScaled = true;
        options.inDensity = options.outWidth;
        options.inTargetDensity = i7;
    }

    public static Boolean D(ij ijVar) {
        TLRPC.Peer peer;
        if (ijVar != null) {
            int i7 = ijVar.I1;
            TLRPC.Message message = ijVar.f23266k;
            if (message != null) {
                TLRPC.Chat M0 = qp.s1(i7).M0(Long.valueOf(-org.telegram.messenger.m5.o(message.peer_id)));
                if ((M0 != null && M0.noforwards) || !org.telegram.messenger.t3.V(M0)) {
                    TLRPC.MessageFwdHeader messageFwdHeader = ijVar.f23266k.fwd_from;
                    if (messageFwdHeader != null && (peer = messageFwdHeader.from_id) != null && (messageFwdHeader.flags & 4) != 0) {
                        long o4 = org.telegram.messenger.m5.o(peer);
                        TLRPC.Chat M02 = qp.s1(i7).M0(Long.valueOf(-o4));
                        if (o4 < 0 && ((M02 == null || !M02.noforwards) && org.telegram.messenger.t3.V(M02))) {
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

    public static e7 a(t tVar, ArrayList arrayList) {
        e7 e7Var = new e7();
        e7Var.S = tVar;
        e7Var.T = arrayList;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            e7 e7Var2 = (e7) obj;
            if (e7Var2.K) {
                e7Var.K = true;
                e7Var2.V = 0.0f;
                e7Var2.W = Math.min(1.0f, 59000.0f / ((float) e7Var2.f11898h0));
            }
        }
        if (e7Var.K) {
            e7Var.f11904k0 = 720;
            e7Var.f11906l0 = 1280;
            e7Var.f11900i0 = 720;
            e7Var.f11902j0 = 1280;
        } else {
            e7Var.f11904k0 = 1080;
            e7Var.f11906l0 = 1920;
            e7Var.f11900i0 = 1080;
            e7Var.f11902j0 = 1920;
        }
        e7Var.A();
        return e7Var;
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

    public static e7 l(gf gfVar) {
        boolean z9;
        int i7;
        e7 e7Var = new e7();
        e7Var.L = new File(gfVar.I);
        e7Var.Q = gfVar.J;
        e7Var.R = gfVar.K;
        if (!gfVar.d() && gfVar.f26849b) {
            z9 = true;
        } else {
            z9 = false;
        }
        e7Var.K = z9;
        e7Var.N = gfVar.f26850c;
        long j3 = gfVar.E * 1000;
        e7Var.f11898h0 = j3;
        e7Var.Z = 0.0f;
        e7Var.f11881a0 = Math.min(1.0f, 59000.0f / ((float) j3));
        if (e7Var.K && e7Var.N == null) {
            e7Var.N = "vthumb://" + gfVar.C;
        }
        e7Var.A0 = gfVar.T;
        e7Var.B0 = gfVar.U;
        e7Var.h(e7Var.L.getAbsolutePath());
        int i10 = gfVar.F;
        if (i10 > 0 && (i7 = gfVar.G) > 0) {
            e7Var.f11904k0 = i10;
            e7Var.f11906l0 = i7;
        }
        e7Var.A();
        return e7Var;
    }

    public static e7 m(File file, int i7) {
        e7 e7Var = new e7();
        e7Var.L = file;
        e7Var.M = true;
        e7Var.Q = i7;
        e7Var.R = 0;
        e7Var.K = false;
        if (file != null) {
            e7Var.h(file.getAbsolutePath());
        }
        e7Var.A();
        return e7Var;
    }

    public static e7 n(File file, TL_stories.StoryItem storyItem) {
        e7 e7Var = new e7();
        e7Var.f11896g = true;
        e7Var.f11894f = storyItem.f27199id;
        e7Var.L = file;
        e7Var.M = false;
        e7Var.f11904k0 = 720;
        e7Var.f11906l0 = 1280;
        TLRPC.MessageMedia messageMedia = storyItem.media;
        boolean z9 = messageMedia instanceof TLRPC.TL_messageMediaPhoto;
        int i7 = e7Var.f11880a;
        if (z9) {
            e7Var.K = false;
            if (file != null) {
                e7Var.h(file.getAbsolutePath());
            }
        } else if (messageMedia instanceof TLRPC.TL_messageMediaDocument) {
            e7Var.K = true;
            TLRPC.Document document = messageMedia.document;
            if (document != null && document.attributes != null) {
                int i10 = 0;
                while (true) {
                    if (i10 >= storyItem.media.document.attributes.size()) {
                        break;
                    }
                    TLRPC.DocumentAttribute documentAttribute = storyItem.media.document.attributes.get(i10);
                    if (documentAttribute instanceof TLRPC.TL_documentAttributeVideo) {
                        e7Var.f11904k0 = documentAttribute.f26967w;
                        e7Var.f11906l0 = documentAttribute.h;
                        e7Var.f11899i = documentAttribute.duration;
                        break;
                    }
                    i10++;
                }
            }
            TLRPC.Document document2 = storyItem.media.document;
            if (document2 != null) {
                String str = storyItem.firstFramePath;
                if (str != null) {
                    e7Var.N = str;
                } else if (document2.thumbs != null) {
                    int i11 = 0;
                    while (true) {
                        if (i11 >= storyItem.media.document.thumbs.size()) {
                            break;
                        }
                        TLRPC.PhotoSize photoSize = storyItem.media.document.thumbs.get(i11);
                        if (photoSize instanceof TLRPC.TL_photoStrippedSize) {
                            e7Var.O = gc.F(null, photoSize.bytes);
                            break;
                        }
                        org.telegram.messenger.w7.G(i7);
                        File J = org.telegram.messenger.w7.J(photoSize, null, true, true);
                        if (J != null && J.exists()) {
                            e7Var.N = J.getAbsolutePath();
                            break;
                        }
                        i11++;
                    }
                }
            }
        }
        ArrayList arrayList = e7Var.F0;
        arrayList.clear();
        ArrayList<TLRPC.PrivacyRule> arrayList2 = storyItem.privacy;
        qp s12 = qp.s1(i7);
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
        e7Var.I0 = storyItem.expire_date - storyItem.date;
        try {
            CharSequence m10 = org.telegram.messenger.i6.m(new SpannableString(storyItem.caption), org.telegram.ui.ActionBar.m6.f28087o2.getFontMetricsInt(), true, null, 0);
            ij.b(m10, storyItem.entities, true, false, true, false, 0);
            e7Var.C0 = ij.B5(m10, storyItem.entities, org.telegram.ui.ActionBar.m6.f28087o2.getFontMetricsInt(), false);
        } catch (Exception unused) {
        }
        e7Var.A();
        e7Var.e(storyItem);
        e7Var.f11907m = storyItem.media_areas;
        e7Var.f11924v0 = qp.s1(i7).j1(storyItem.dialogId);
        return e7Var;
    }

    public static e7 o(File file, String str, long j3) {
        e7 e7Var = new e7();
        e7Var.f11888c1 = true;
        e7Var.L = file;
        e7Var.M = true;
        e7Var.Q = 0;
        e7Var.R = 0;
        e7Var.K = true;
        e7Var.f11898h0 = j3;
        e7Var.N = str;
        e7Var.Z = 0.0f;
        e7Var.f11881a0 = Math.min(1.0f, 59500.0f / ((float) j3));
        return e7Var;
    }

    public static long p(ij ijVar) {
        Boolean D = D(ijVar);
        if (D == null) {
            return 0L;
        }
        if (D.booleanValue()) {
            return org.telegram.messenger.m5.o(ijVar.f23266k.fwd_from.from_id);
        }
        return ij.B0(ijVar.f23266k);
    }

    public static Bitmap q(c7 c7Var, int i7, int i10, int i11, boolean z9) {
        int i12;
        int i13;
        boolean z10;
        if (i11 != 90 && i11 != 270) {
            i13 = i7;
            i12 = i10;
        } else {
            i12 = i7;
            i13 = i10;
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        c7Var.c(options);
        options.inJustDecodeBounds = false;
        options.inScaled = false;
        Runtime runtime = Runtime.getRuntime();
        long maxMemory = runtime.maxMemory() - (runtime.totalMemory() - runtime.freeMemory());
        int i14 = options.outWidth;
        int i15 = options.outHeight;
        if (((i13 * i12 * 4) + (i14 * i15 * 4)) * 1.1d <= maxMemory) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (i14 <= i13 && i15 <= i12) {
            return c7Var.c(options);
        }
        if (z9 && z10 && iz.o() >= 1) {
            Bitmap c10 = c7Var.c(options);
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
        return c7Var.c(options);
    }

    public static boolean u(TLRPC.Document document, String str) {
        long j3;
        if (document != null) {
            if (!"video/webm".equals(document.mime_type) && !"video/mp4".equals(document.mime_type)) {
                if (ij.K2(document, true)) {
                    RLottieNative a10 = RLottieNative.a(str, null, null, null, 0, null);
                    if (a10 != null) {
                        int i7 = a10.f31489a[0];
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
        tL_fileLocationToBeDeprecated.local_id = iz.p();
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

    public static File x(int i7, boolean z9) {
        String str;
        if (z9) {
            str = "mp4";
        } else {
            str = "jpg";
        }
        return w(i7, str);
    }

    public static e7 y(ArrayList arrayList) {
        ij ijVar;
        int i7;
        e7 e7Var = new e7();
        e7Var.f11922u = true;
        e7Var.v = arrayList;
        e7Var.f11900i0 = 1080;
        e7Var.f11902j0 = 1920;
        e7Var.f11932z0 = p((ij) arrayList.get(0));
        h20 h20Var = new h20();
        h20Var.f22817a = (byte) 6;
        h20Var.f22819c = 0.5f;
        h20Var.d = 0.5f;
        ArrayList arrayList2 = new ArrayList();
        e7Var.T0 = arrayList2;
        arrayList2.add(h20Var);
        if (arrayList.size() == 1 && (ijVar = (ij) arrayList.get(0)) != null && ((i7 = ijVar.D) == 8 || i7 == 3 || i7 == 5)) {
            TLRPC.Message message = ijVar.f23266k;
            if (message != null && message.attachPath != null) {
                e7Var.L = new File(ijVar.f23266k.attachPath);
            }
            File file = e7Var.L;
            if (file == null || !file.exists()) {
                org.telegram.messenger.w7.G(e7Var.f11880a);
                e7Var.L = org.telegram.messenger.w7.M(ijVar.f23266k, false, true);
            }
            File file2 = e7Var.L;
            if (file2 != null && file2.exists()) {
                e7Var.K = true;
                e7Var.M = false;
                long L0 = (long) (ijVar.L0() * 1000.0d);
                e7Var.f11898h0 = L0;
                e7Var.Z = 0.0f;
                e7Var.f11881a0 = Math.min(1.0f, 59500.0f / ((float) L0));
                return e7Var;
            }
            e7Var.L = null;
        }
        return e7Var;
    }

    public final void A() {
        float f10;
        Matrix matrix = this.f11909n0;
        matrix.reset();
        int i7 = this.f11904k0;
        int i10 = this.f11906l0;
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
        float f13 = this.f11900i0 / f12;
        if (this.J0 != 0) {
            f13 = Math.min(f13, this.f11902j0 / i10);
        } else {
            float f14 = i10;
            if (f14 / f12 > 1.29f) {
                f13 = Math.max(f13, this.f11902j0 / f14);
            }
        }
        matrix.postScale(f13, f13);
        matrix.postTranslate(com.google.android.recaptcha.internal.a.w(f12, f13, this.f11900i0, 2.0f), com.google.android.recaptcha.internal.a.w(i10, f13, this.f11902j0, 2.0f));
    }

    public final void B() {
        long j3;
        if (this.K && !v() && !this.f11896g && !this.f11908n && this.f11898h0 > 69000 && p10.i(this.f11880a).q()) {
            long j10 = this.f11898h0 - 59000;
            if (j10 > 10000) {
                j3 = Math.min(59000L, j10) + 59000;
            } else {
                j3 = 59000;
            }
            long j11 = this.f11898h0 - j3;
            if (j11 > 10000) {
                j3 += Math.min(59000L, j11);
            }
            this.f11881a0 = Math.min(1.0f, ((float) j3) / ((float) this.f11898h0));
        }
    }

    public final boolean E() {
        ArrayList arrayList;
        ArrayList arrayList2;
        ij ijVar;
        TLRPC.Message message;
        ArrayList arrayList3 = this.T0;
        if (!this.K && this.f11929y == null && this.f11911o0 == null && ((arrayList = this.v) == null || arrayList.size() != 1 || (ijVar = (ij) this.v.get(0)) == null || (message = ijVar.f23266k) == null || !(message.action instanceof TLRPC.TL_messageActionStarGiftUnique))) {
            if (arrayList3 != null && !arrayList3.isEmpty()) {
                for (int i7 = 0; i7 < arrayList3.size(); i7++) {
                    h20 h20Var = (h20) arrayList3.get(i7);
                    byte b10 = h20Var.f22817a;
                    if (b10 == 0) {
                        if (!u(h20Var.B, h20Var.f22824j)) {
                        }
                    } else {
                        if (b10 == 1 && (arrayList2 = h20Var.f22825k) != null && !arrayList2.isEmpty()) {
                            for (int i10 = 0; i10 < h20Var.f22825k.size(); i10++) {
                                g20 g20Var = (g20) h20Var.f22825k.get(i10);
                                if (!u(g20Var.document, g20Var.f22589a)) {
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
        throw new UnsupportedOperationException("Method not decompiled: fi.e7.b(float, android.graphics.Bitmap):android.graphics.Bitmap");
    }

    public final void c(File file) {
        Bitmap b10 = b(1.0f, null);
        Bitmap bitmap = this.f11885b1;
        if (bitmap != null) {
            bitmap.recycle();
            this.f11885b1 = null;
        }
        this.f11885b1 = Bitmap.createScaledBitmap(b10, 40, 22, true);
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
                    tL_inputStickeredMediaPhoto.f27030id = tL_inputPhoto;
                    tL_inputPhoto.f26979id = photo.f26984id;
                    tL_inputPhoto.access_hash = photo.access_hash;
                    byte[] bArr = photo.file_reference;
                    tL_inputPhoto.file_reference = bArr;
                    if (bArr == null) {
                        tL_inputPhoto.file_reference = new byte[0];
                    }
                    tL_messages_getAttachedStickers.media = tL_inputStickeredMediaPhoto;
                    this.f11893e1 = ConnectionsManager.getInstance(this.f11880a).sendRequest(tL_messages_getAttachedStickers, new bi.g2(this, storyItem, tL_messages_getAttachedStickers, new bi.j0(this, 10), 6));
                }
            } else {
                TLRPC.Document document = messageMedia.document;
                if (document != null && ij.V2(document)) {
                    TLRPC.TL_inputStickeredMediaDocument tL_inputStickeredMediaDocument = new TLRPC.TL_inputStickeredMediaDocument();
                    TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                    tL_inputStickeredMediaDocument.f27029id = tL_inputDocument;
                    tL_inputDocument.f26972id = document.f26966id;
                    tL_inputDocument.access_hash = document.access_hash;
                    byte[] bArr2 = document.file_reference;
                    tL_inputDocument.file_reference = bArr2;
                    if (bArr2 == null) {
                        tL_inputDocument.file_reference = new byte[0];
                    }
                    tL_messages_getAttachedStickers.media = tL_inputStickeredMediaDocument;
                    this.f11893e1 = ConnectionsManager.getInstance(this.f11880a).sendRequest(tL_messages_getAttachedStickers, new bi.g2(this, storyItem, tL_messages_getAttachedStickers, new bi.j0(this, 10), 6));
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

    public final e7 g() {
        e7 e7Var = new e7();
        e7Var.f11883b = this.f11883b;
        e7Var.f11886c = this.f11886c;
        e7Var.d = this.d;
        e7Var.f11891e = this.f11891e;
        e7Var.f11894f = this.f11894f;
        e7Var.f11896g = this.f11896g;
        e7Var.h = this.h;
        e7Var.f11899i = this.f11899i;
        e7Var.f11901j = this.f11901j;
        e7Var.f11903k = this.f11903k;
        e7Var.f11905l = this.f11905l;
        e7Var.f11907m = this.f11907m;
        e7Var.f11925w = this.f11925w;
        e7Var.f11927x = this.f11927x;
        e7Var.f11929y = this.f11929y;
        e7Var.f11931z = this.f11931z;
        e7Var.A = this.A;
        e7Var.B = this.B;
        e7Var.C = this.C;
        e7Var.D = this.D;
        e7Var.E = this.E;
        e7Var.F = this.F;
        e7Var.G = this.G;
        e7Var.H = this.H;
        e7Var.I = this.I;
        e7Var.J = this.J;
        e7Var.K = this.K;
        e7Var.L = this.L;
        e7Var.M = this.M;
        boolean z9 = this.M;
        int i7 = this.f11880a;
        if (z9) {
            File w10 = w(i7, k(this.L));
            e7Var.L = w10;
            org.telegram.messenger.g0.F(this.L, w10);
        }
        e7Var.N = this.N;
        e7Var.Y = this.Y;
        e7Var.Z = this.Z;
        e7Var.f11881a0 = this.f11881a0;
        e7Var.f11898h0 = this.f11898h0;
        e7Var.f11904k0 = this.f11904k0;
        e7Var.f11906l0 = this.f11906l0;
        e7Var.f11900i0 = this.f11900i0;
        e7Var.f11902j0 = this.f11902j0;
        e7Var.f11924v0 = this.f11924v0;
        e7Var.R = this.R;
        e7Var.f11909n0.set(this.f11909n0);
        e7Var.A0 = this.A0;
        e7Var.B0 = this.B0;
        e7Var.C0 = this.C0;
        e7Var.D0 = this.D0;
        e7Var.E0 = this.E0;
        ArrayList arrayList = e7Var.F0;
        arrayList.clear();
        arrayList.addAll(this.F0);
        e7Var.G0 = this.G0;
        e7Var.H0 = this.H0;
        e7Var.I0 = this.I0;
        e7Var.M0 = this.M0;
        e7Var.N0 = this.N0;
        e7Var.f11926w0 = this.f11926w0;
        File file = this.N0;
        if (file != null && file.exists()) {
            File w11 = w(i7, k(this.N0));
            e7Var.N0 = w11;
            org.telegram.messenger.g0.F(this.N0, w11);
        }
        e7Var.O0 = this.O0;
        File file2 = this.O0;
        if (file2 != null && file2.exists()) {
            File w12 = w(i7, k(this.O0));
            e7Var.O0 = w12;
            org.telegram.messenger.g0.F(this.O0, w12);
        }
        e7Var.P0 = this.P0;
        File file3 = this.P0;
        if (file3 != null && file3.exists()) {
            File w13 = w(i7, k(this.P0));
            e7Var.P0 = w13;
            org.telegram.messenger.g0.F(this.P0, w13);
        }
        e7Var.W0 = this.W0;
        File file4 = this.W0;
        if (file4 != null && file4.exists()) {
            File w14 = w(i7, k(this.W0));
            e7Var.W0 = w14;
            org.telegram.messenger.g0.F(this.W0, w14);
        }
        e7Var.Y0 = this.Y0;
        File file5 = this.Y0;
        if (file5 != null && file5.exists()) {
            File w15 = w(i7, k(this.Y0));
            e7Var.Y0 = w15;
            org.telegram.messenger.g0.F(this.Y0, w15);
        }
        e7Var.Q0 = this.Q0;
        File file6 = this.Q0;
        if (file6 != null && file6.exists()) {
            File w16 = w(i7, k(this.Q0));
            e7Var.Q0 = w16;
            org.telegram.messenger.g0.F(this.Q0, w16);
        }
        e7Var.R0 = this.R0;
        File file7 = this.R0;
        if (file7 != null && file7.exists()) {
            File w17 = w(i7, k(this.R0));
            e7Var.R0 = w17;
            org.telegram.messenger.g0.F(this.R0, w17);
        }
        e7Var.S0 = this.S0;
        e7Var.T0 = new ArrayList();
        if (this.T0 != null) {
            for (int i10 = 0; i10 < this.T0.size(); i10++) {
                e7Var.T0.add(((h20) this.T0.get(i10)).a());
            }
        }
        e7Var.U0 = this.U0;
        e7Var.V0 = this.V0;
        e7Var.Z0 = this.Z0;
        File file8 = this.Z0;
        if (file8 != null && file8.exists()) {
            File w18 = w(i7, k(this.Z0));
            e7Var.Z0 = w18;
            org.telegram.messenger.g0.F(this.Z0, w18);
        }
        e7Var.f11882a1 = this.f11882a1;
        e7Var.f11885b1 = this.f11885b1;
        e7Var.f11888c1 = this.f11888c1;
        e7Var.O = this.O;
        e7Var.f11908n = this.f11908n;
        e7Var.f11910o = this.f11910o;
        e7Var.f11911o0 = this.f11911o0;
        e7Var.f11919s0 = this.f11919s0;
        e7Var.f11921t0 = this.f11921t0;
        e7Var.f11915q0 = this.f11915q0;
        e7Var.f11913p0 = this.f11913p0;
        e7Var.f11917r0 = this.f11917r0;
        e7Var.f11923u0 = this.f11923u0;
        e7Var.f11884b0 = this.f11884b0;
        e7Var.J0 = this.J0;
        e7Var.K0 = this.K0;
        e7Var.L0 = this.L0;
        e7Var.f11892e0 = this.f11892e0;
        e7Var.T = this.T;
        e7Var.S = this.S;
        e7Var.U = this.U;
        e7Var.X = this.X;
        e7Var.P = this.P;
        return e7Var;
    }

    public final void h(String str) {
        if (str != null) {
            try {
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                BitmapFactory.decodeFile(str, options);
                this.f11904k0 = options.outWidth;
                this.f11906l0 = options.outHeight;
            } catch (Exception unused) {
            }
        }
        if (!this.K) {
            if (((int) Math.max(this.f11904k0, (this.f11906l0 / 16.0f) * 9.0f)) <= 900) {
                this.f11900i0 = 720;
                this.f11902j0 = 1280;
                return;
            }
            this.f11900i0 = 1080;
            this.f11902j0 = 1920;
        }
    }

    public final void i(boolean z9) {
        if (this.M0 != null) {
            this.M0 = null;
        }
        File file = this.N0;
        if (file != null) {
            file.delete();
            this.N0 = null;
        }
        if (!z9) {
            f();
            File file2 = this.Z0;
            if (file2 != null) {
                file2.delete();
                this.Z0 = null;
            }
            File file3 = this.L;
            if (file3 != null) {
                if (this.M && (!this.f11896g || this.f11901j)) {
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
                    h20 h20Var = (h20) obj;
                    if (h20Var.f22817a == 2 && !TextUtils.isEmpty(h20Var.f22834t)) {
                        try {
                            new File(h20Var.f22834t).delete();
                        } catch (Exception e10) {
                            org.telegram.messenger.a8.g(e10, true);
                        }
                        h20Var.f22834t = "";
                    }
                }
            }
            File file4 = this.f11911o0;
            if (file4 != null && (!this.f11896g || this.f11901j)) {
                file4.delete();
                this.f11911o0 = null;
            }
            if (this.f11913p0 != null && (!this.f11896g || this.f11901j)) {
                try {
                    new File(this.f11913p0).delete();
                } catch (Exception unused) {
                }
                this.f11913p0 = null;
            }
        }
        this.O = null;
        if (this.T != null) {
            for (int i10 = 0; i10 < this.T.size(); i10++) {
                ((e7) this.T.get(i10)).i(z9);
            }
        }
        if (this.f11893e1 != 0) {
            ConnectionsManager.getInstance(this.f11880a).cancelRequest(this.f11893e1, true);
        }
    }

    public final int r() {
        long j3;
        if (this.K && !v() && !this.f11896g) {
            long j10 = this.f11898h0;
            if (j10 > 0 && !this.f11908n) {
                if ((this.f11881a0 - this.Z) * ((float) j10) >= 68999) {
                    return (int) Math.ceil(((float) j3) / 59000.0f);
                }
                return 1;
            }
            return 1;
        }
        return 1;
    }

    public final void s(c20 c20Var) {
        String absolutePath;
        int i7;
        String absolutePath2;
        int i10;
        if (!E()) {
            c20Var.a(null);
            return;
        }
        if (!this.K && ((i10 = this.f11900i0) > 720 || this.f11902j0 > 1280)) {
            float f10 = 720.0f / i10;
            this.f11909n0.postScale(f10, f10, 0.0f, 0.0f);
            this.f11900i0 = 720;
            this.f11902j0 = 1280;
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
        ai.d0 d0Var = new ai.d0(this, absolutePath, iArr, c20Var, 16);
        if (v()) {
            String[] strArr = new String[this.T.size()];
            for (int i11 = 0; i11 < this.T.size(); i11++) {
                if (((e7) this.T.get(i11)).L == null) {
                    absolutePath2 = null;
                } else {
                    absolutePath2 = ((e7) this.T.get(i11)).L.getAbsolutePath();
                }
                strArr[i11] = absolutePath2;
                iArr[i11] = new int[11];
            }
            Utilities.f21341e.c(new x1(strArr, iArr, d0Var, 4));
        } else if (this.L == null) {
            d0Var.run();
        } else {
            Utilities.f21341e.c(new x1(absolutePath, iArr, d0Var));
        }
    }

    public final boolean t() {
        if (v()) {
            for (int i7 = 0; i7 < this.T.size(); i7++) {
                if (((e7) this.T.get(i7)).K) {
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
                        MediaStore.Video.Thumbnails.getThumbnail(org.telegram.messenger.t0.f25570b.getContentResolver(), parseInt, 1, options);
                        options.inSampleSize = d(options, 240, 240);
                        options.inJustDecodeBounds = false;
                        options.inPreferredConfig = Bitmap.Config.RGB_565;
                        options.inDither = true;
                        bitmap = MediaStore.Video.Thumbnails.getThumbnail(org.telegram.messenger.t0.f25570b.getContentResolver(), parseInt, 1, options);
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
                    int[] b10 = a8.ba.b(bitmap, true);
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
                int[] b11 = a8.ba.b(bitmap2, true);
                this.A0 = b11[0];
                this.B0 = b11[1];
                runnable.run();
            }
        }
    }
}
