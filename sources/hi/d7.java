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
import org.telegram.messenger.b20;
import org.telegram.messenger.bz;
import org.telegram.messenger.c20;
import org.telegram.messenger.ec;
import org.telegram.messenger.ef;
import org.telegram.messenger.ff;
import org.telegram.messenger.fj;
import org.telegram.messenger.j10;
import org.telegram.messenger.mp;
import org.telegram.messenger.we;
import org.telegram.messenger.x10;
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
    public u S;
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
    public ff f14390a1;
    public long f14391b;
    public boolean f14392b0;
    public Bitmap f14393b1;
    public boolean f14394c;
    public TLRPC.Document f14395c0;
    public boolean f14396c1;
    public long d;
    public bi.j f14397d0;
    public c7 f14398d1;
    public long f14399e;
    public int f14402f;
    public boolean f14403f0;
    public boolean f14404g;
    public Bitmap f14405g0;
    public boolean h;
    public long f14406h0;
    public boolean f14409j;
    public boolean f14411k;
    public int f14412k0;
    public boolean f14413l;
    public int f14414l0;
    public ArrayList f14415m;
    public we m0;
    public boolean f14416n;
    public boolean f14418o;
    public File f14419o0;
    public SpannableStringBuilder f14420p;
    public String f14421p0;
    public TLRPC.Peer f14422q;
    public long f14423q0;
    public int f14424r;
    public long f14425r0;
    public String f14426s;
    public float f14427s0;
    public TLRPC.MessageMedia f14428t;
    public boolean f14430u;
    public ArrayList v;
    public TLRPC.InputPeer f14432v0;
    public boolean f14433w;
    public HashSet f14434w0;
    public TLRPC.TL_error f14435x;
    public Drawable f14436x0;
    public String f14437y;
    public TLRPC.InputDocument f14439z;
    public final int f14388a = j10.f24773t0;
    public double f14407i = -1.0d;
    public float F = 1.0f;
    public float G = 1.0f;
    public float P = 1.0f;
    public boolean U = false;
    public float V = 0.0f;
    public float W = 1.0f;
    public float f14389a0 = 1.0f;
    public long f14400e0 = -1;
    public int f14408i0 = 720;
    public int f14410j0 = 1280;
    public final Matrix f14417n0 = new Matrix();
    public float f14429t0 = 1.0f;
    public float f14431u0 = 1.0f;
    public boolean f14438y0 = org.telegram.ui.ActionBar.n6.I.q();
    public long f14440z0 = Long.MIN_VALUE;
    public boolean D0 = true;
    public final ArrayList F0 = new ArrayList();
    public boolean G0 = true;
    public int I0 = 86400;
    public String K0 = "";
    public long S0 = 5000;
    public int f14401e1 = 0;

    public static void C(BitmapFactory.Options options, int i7) {
        Runtime runtime = Runtime.getRuntime();
        long maxMemory = runtime.maxMemory() - (runtime.totalMemory() - runtime.freeMemory());
        int i10 = options.outWidth;
        int i11 = options.outHeight;
        if (i10 * i11 * 8 <= maxMemory && Math.max(i10, i11) <= 4200 && bz.o() > 0) {
            return;
        }
        options.inScaled = true;
        options.inDensity = options.outWidth;
        options.inTargetDensity = i7;
    }

    public static Boolean D(fj fjVar) {
        TLRPC.Peer peer;
        if (fjVar != null) {
            int i7 = fjVar.K1;
            TLRPC.Message message = fjVar.f23968k;
            if (message != null) {
                TLRPC.Chat O0 = mp.u1(i7).O0(Long.valueOf(-org.telegram.messenger.n5.o(message.peer_id)));
                if ((O0 != null && O0.noforwards) || !org.telegram.messenger.v3.V(O0)) {
                    TLRPC.MessageFwdHeader messageFwdHeader = fjVar.f23968k.fwd_from;
                    if (messageFwdHeader != null && (peer = messageFwdHeader.from_id) != null && (messageFwdHeader.flags & 4) != 0) {
                        long o4 = org.telegram.messenger.n5.o(peer);
                        TLRPC.Chat O02 = mp.u1(i7).O0(Long.valueOf(-o4));
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

    public static d7 a(u uVar, ArrayList arrayList) {
        d7 d7Var = new d7();
        d7Var.S = uVar;
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
                d7Var2.W = Math.min(1.0f, 59000.0f / ((float) d7Var2.f14406h0));
            }
        }
        if (d7Var.K) {
            d7Var.f14412k0 = 720;
            d7Var.f14414l0 = 1280;
            d7Var.f14408i0 = 720;
            d7Var.f14410j0 = 1280;
        } else {
            d7Var.f14412k0 = 1080;
            d7Var.f14414l0 = 1920;
            d7Var.f14408i0 = 1080;
            d7Var.f14410j0 = 1920;
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

    public static d7 l(ef efVar) {
        boolean z10;
        int i7;
        d7 d7Var = new d7();
        d7Var.L = new File(efVar.I);
        d7Var.Q = efVar.J;
        d7Var.R = efVar.K;
        if (!efVar.d() && efVar.f27849b) {
            z10 = true;
        } else {
            z10 = false;
        }
        d7Var.K = z10;
        d7Var.N = efVar.f27850c;
        long j3 = efVar.E * 1000;
        d7Var.f14406h0 = j3;
        d7Var.Z = 0.0f;
        d7Var.f14389a0 = Math.min(1.0f, 59000.0f / ((float) j3));
        if (d7Var.K && d7Var.N == null) {
            d7Var.N = "vthumb://" + efVar.C;
        }
        d7Var.A0 = efVar.T;
        d7Var.B0 = efVar.U;
        d7Var.h(d7Var.L.getAbsolutePath());
        int i10 = efVar.F;
        if (i10 > 0 && (i7 = efVar.G) > 0) {
            d7Var.f14412k0 = i10;
            d7Var.f14414l0 = i7;
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
        d7Var.f14404g = true;
        d7Var.f14402f = storyItem.f28644id;
        d7Var.L = file;
        d7Var.M = false;
        d7Var.f14412k0 = 720;
        d7Var.f14414l0 = 1280;
        TLRPC.MessageMedia messageMedia = storyItem.media;
        boolean z10 = messageMedia instanceof TLRPC.TL_messageMediaPhoto;
        int i7 = d7Var.f14388a;
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
                        d7Var.f14412k0 = documentAttribute.f28412w;
                        d7Var.f14414l0 = documentAttribute.h;
                        d7Var.f14407i = documentAttribute.duration;
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
                            d7Var.O = ec.F(null, photoSize.bytes);
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
        mp u12 = mp.u1(i7);
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
            CharSequence m10 = org.telegram.messenger.j6.m(new SpannableString(storyItem.caption), org.telegram.ui.ActionBar.n6.f29593o2.getFontMetricsInt(), true, null, 0);
            fj.b(m10, storyItem.entities, true, false, true, false, 0);
            d7Var.C0 = fj.B5(m10, storyItem.entities, org.telegram.ui.ActionBar.n6.f29593o2.getFontMetricsInt(), false);
        } catch (Exception unused) {
        }
        d7Var.A();
        d7Var.e(storyItem);
        d7Var.f14415m = storyItem.media_areas;
        d7Var.f14432v0 = mp.u1(i7).l1(storyItem.dialogId);
        return d7Var;
    }

    public static d7 o(File file, String str, long j3) {
        d7 d7Var = new d7();
        d7Var.f14396c1 = true;
        d7Var.L = file;
        d7Var.M = true;
        d7Var.Q = 0;
        d7Var.R = 0;
        d7Var.K = true;
        d7Var.f14406h0 = j3;
        d7Var.N = str;
        d7Var.Z = 0.0f;
        d7Var.f14389a0 = Math.min(1.0f, 59500.0f / ((float) j3));
        return d7Var;
    }

    public static long p(fj fjVar) {
        Boolean D = D(fjVar);
        if (D == null) {
            return 0L;
        }
        if (D.booleanValue()) {
            return org.telegram.messenger.n5.o(fjVar.f23968k.fwd_from.from_id);
        }
        return fj.B0(fjVar.f23968k);
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
        if (z10 && z11 && bz.o() >= 1) {
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
                if (fj.K2(document, true)) {
                    RLottieNative a10 = RLottieNative.a(str, null, null, null, 0, null);
                    if (a10 != null) {
                        int i7 = a10.f33049a[0];
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
        tL_fileLocationToBeDeprecated.local_id = bz.p();
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
        fj fjVar;
        int i7;
        d7 d7Var = new d7();
        d7Var.f14430u = true;
        d7Var.v = arrayList;
        d7Var.f14408i0 = 1080;
        d7Var.f14410j0 = 1920;
        d7Var.f14440z0 = p((fj) arrayList.get(0));
        c20 c20Var = new c20();
        c20Var.f23232a = (byte) 6;
        c20Var.f23234c = 0.5f;
        c20Var.d = 0.5f;
        ArrayList arrayList2 = new ArrayList();
        d7Var.T0 = arrayList2;
        arrayList2.add(c20Var);
        if (arrayList.size() == 1 && (fjVar = (fj) arrayList.get(0)) != null && ((i7 = fjVar.D) == 8 || i7 == 3 || i7 == 5)) {
            TLRPC.Message message = fjVar.f23968k;
            if (message != null && message.attachPath != null) {
                d7Var.L = new File(fjVar.f23968k.attachPath);
            }
            File file = d7Var.L;
            if (file == null || !file.exists()) {
                org.telegram.messenger.w7.G(d7Var.f14388a);
                d7Var.L = org.telegram.messenger.w7.M(fjVar.f23968k, false, true);
            }
            File file2 = d7Var.L;
            if (file2 != null && file2.exists()) {
                d7Var.K = true;
                d7Var.M = false;
                long L0 = (long) (fjVar.L0() * 1000.0d);
                d7Var.f14406h0 = L0;
                d7Var.Z = 0.0f;
                d7Var.f14389a0 = Math.min(1.0f, 59500.0f / ((float) L0));
                return d7Var;
            }
            d7Var.L = null;
        }
        return d7Var;
    }

    public final void A() {
        float f10;
        Matrix matrix = this.f14417n0;
        matrix.reset();
        int i7 = this.f14412k0;
        int i10 = this.f14414l0;
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
        float f13 = this.f14408i0 / f12;
        if (this.J0 != 0) {
            f13 = Math.min(f13, this.f14410j0 / i10);
        } else {
            float f14 = i10;
            if (f14 / f12 > 1.29f) {
                f13 = Math.max(f13, this.f14410j0 / f14);
            }
        }
        matrix.postScale(f13, f13);
        matrix.postTranslate(com.google.android.gms.internal.vision.e2.w(f12, f13, this.f14408i0, 2.0f), com.google.android.gms.internal.vision.e2.w(i10, f13, this.f14410j0, 2.0f));
    }

    public final void B() {
        long j3;
        if (this.K && !v() && !this.f14404g && !this.f14416n && this.f14406h0 > 69000 && j10.i(this.f14388a).q()) {
            long j10 = this.f14406h0 - 59000;
            if (j10 > 10000) {
                j3 = Math.min(59000L, j10) + 59000;
            } else {
                j3 = 59000;
            }
            long j11 = this.f14406h0 - j3;
            if (j11 > 10000) {
                j3 += Math.min(59000L, j11);
            }
            this.f14389a0 = Math.min(1.0f, ((float) j3) / ((float) this.f14406h0));
        }
    }

    public final boolean E() {
        ArrayList arrayList;
        ArrayList arrayList2;
        fj fjVar;
        TLRPC.Message message;
        ArrayList arrayList3 = this.T0;
        if (!this.K && this.f14437y == null && this.f14419o0 == null && ((arrayList = this.v) == null || arrayList.size() != 1 || (fjVar = (fj) this.v.get(0)) == null || (message = fjVar.f23968k) == null || !(message.action instanceof TLRPC.TL_messageActionStarGiftUnique))) {
            if (arrayList3 != null && !arrayList3.isEmpty()) {
                for (int i7 = 0; i7 < arrayList3.size(); i7++) {
                    c20 c20Var = (c20) arrayList3.get(i7);
                    byte b10 = c20Var.f23232a;
                    if (b10 == 0) {
                        if (!u(c20Var.B, c20Var.f23239j)) {
                        }
                    } else {
                        if (b10 == 1 && (arrayList2 = c20Var.f23240k) != null && !arrayList2.isEmpty()) {
                            for (int i10 = 0; i10 < c20Var.f23240k.size(); i10++) {
                                b20 b20Var = (b20) c20Var.f23240k.get(i10);
                                if (!u(b20Var.document, b20Var.f23022a)) {
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
        Bitmap bitmap = this.f14393b1;
        if (bitmap != null) {
            bitmap.recycle();
            this.f14393b1 = null;
        }
        this.f14393b1 = Bitmap.createScaledBitmap(b10, 40, 22, true);
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
                    tL_inputStickeredMediaPhoto.f28475id = tL_inputPhoto;
                    tL_inputPhoto.f28424id = photo.f28429id;
                    tL_inputPhoto.access_hash = photo.access_hash;
                    byte[] bArr = photo.file_reference;
                    tL_inputPhoto.file_reference = bArr;
                    if (bArr == null) {
                        tL_inputPhoto.file_reference = new byte[0];
                    }
                    tL_messages_getAttachedStickers.media = tL_inputStickeredMediaPhoto;
                    this.f14401e1 = ConnectionsManager.getInstance(this.f14388a).sendRequest(tL_messages_getAttachedStickers, new bi.g2(this, storyItem, tL_messages_getAttachedStickers, new ai.e1(this, 11), 7));
                }
            } else {
                TLRPC.Document document = messageMedia.document;
                if (document != null && fj.V2(document)) {
                    TLRPC.TL_inputStickeredMediaDocument tL_inputStickeredMediaDocument = new TLRPC.TL_inputStickeredMediaDocument();
                    TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                    tL_inputStickeredMediaDocument.f28474id = tL_inputDocument;
                    tL_inputDocument.f28417id = document.f28411id;
                    tL_inputDocument.access_hash = document.access_hash;
                    byte[] bArr2 = document.file_reference;
                    tL_inputDocument.file_reference = bArr2;
                    if (bArr2 == null) {
                        tL_inputDocument.file_reference = new byte[0];
                    }
                    tL_messages_getAttachedStickers.media = tL_inputStickeredMediaDocument;
                    this.f14401e1 = ConnectionsManager.getInstance(this.f14388a).sendRequest(tL_messages_getAttachedStickers, new bi.g2(this, storyItem, tL_messages_getAttachedStickers, new ai.e1(this, 11), 7));
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
        d7Var.f14391b = this.f14391b;
        d7Var.f14394c = this.f14394c;
        d7Var.d = this.d;
        d7Var.f14399e = this.f14399e;
        d7Var.f14402f = this.f14402f;
        d7Var.f14404g = this.f14404g;
        d7Var.h = this.h;
        d7Var.f14407i = this.f14407i;
        d7Var.f14409j = this.f14409j;
        d7Var.f14411k = this.f14411k;
        d7Var.f14413l = this.f14413l;
        d7Var.f14415m = this.f14415m;
        d7Var.f14433w = this.f14433w;
        d7Var.f14435x = this.f14435x;
        d7Var.f14437y = this.f14437y;
        d7Var.f14439z = this.f14439z;
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
        int i7 = this.f14388a;
        if (z10) {
            File w10 = w(i7, k(this.L));
            d7Var.L = w10;
            org.telegram.messenger.g0.F(this.L, w10);
        }
        d7Var.N = this.N;
        d7Var.Y = this.Y;
        d7Var.Z = this.Z;
        d7Var.f14389a0 = this.f14389a0;
        d7Var.f14406h0 = this.f14406h0;
        d7Var.f14412k0 = this.f14412k0;
        d7Var.f14414l0 = this.f14414l0;
        d7Var.f14408i0 = this.f14408i0;
        d7Var.f14410j0 = this.f14410j0;
        d7Var.f14432v0 = this.f14432v0;
        d7Var.R = this.R;
        d7Var.f14417n0.set(this.f14417n0);
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
        d7Var.f14434w0 = this.f14434w0;
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
                d7Var.T0.add(((c20) this.T0.get(i10)).a());
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
        d7Var.f14390a1 = this.f14390a1;
        d7Var.f14393b1 = this.f14393b1;
        d7Var.f14396c1 = this.f14396c1;
        d7Var.O = this.O;
        d7Var.f14416n = this.f14416n;
        d7Var.f14418o = this.f14418o;
        d7Var.f14419o0 = this.f14419o0;
        d7Var.f14427s0 = this.f14427s0;
        d7Var.f14429t0 = this.f14429t0;
        d7Var.f14423q0 = this.f14423q0;
        d7Var.f14421p0 = this.f14421p0;
        d7Var.f14425r0 = this.f14425r0;
        d7Var.f14431u0 = this.f14431u0;
        d7Var.f14392b0 = this.f14392b0;
        d7Var.J0 = this.J0;
        d7Var.K0 = this.K0;
        d7Var.L0 = this.L0;
        d7Var.f14400e0 = this.f14400e0;
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
                this.f14412k0 = options.outWidth;
                this.f14414l0 = options.outHeight;
            } catch (Exception unused) {
            }
        }
        if (!this.K) {
            if (((int) Math.max(this.f14412k0, (this.f14414l0 / 16.0f) * 9.0f)) <= 900) {
                this.f14408i0 = 720;
                this.f14410j0 = 1280;
                return;
            }
            this.f14408i0 = 1080;
            this.f14410j0 = 1920;
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
                if (this.M && (!this.f14404g || this.f14409j)) {
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
                    c20 c20Var = (c20) obj;
                    if (c20Var.f23232a == 2 && !TextUtils.isEmpty(c20Var.f23249t)) {
                        try {
                            new File(c20Var.f23249t).delete();
                        } catch (Exception e10) {
                            org.telegram.messenger.a8.g(e10, true);
                        }
                        c20Var.f23249t = "";
                    }
                }
            }
            File file4 = this.f14419o0;
            if (file4 != null && (!this.f14404g || this.f14409j)) {
                file4.delete();
                this.f14419o0 = null;
            }
            if (this.f14421p0 != null && (!this.f14404g || this.f14409j)) {
                try {
                    new File(this.f14421p0).delete();
                } catch (Exception unused) {
                }
                this.f14421p0 = null;
            }
        }
        this.O = null;
        if (this.T != null) {
            for (int i10 = 0; i10 < this.T.size(); i10++) {
                ((d7) this.T.get(i10)).i(z10);
            }
        }
        if (this.f14401e1 != 0) {
            ConnectionsManager.getInstance(this.f14388a).cancelRequest(this.f14401e1, true);
        }
    }

    public final int r() {
        long j3;
        if (this.K && !v() && !this.f14404g) {
            long j10 = this.f14406h0;
            if (j10 > 0 && !this.f14416n) {
                if ((this.f14389a0 - this.Z) * ((float) j10) >= 68999) {
                    return (int) Math.ceil(((float) j3) / 59000.0f);
                }
                return 1;
            }
            return 1;
        }
        return 1;
    }

    public final void s(x10 x10Var) {
        String absolutePath;
        int i7;
        String absolutePath2;
        int i10;
        if (!E()) {
            x10Var.a(null);
            return;
        }
        if (!this.K && ((i10 = this.f14408i0) > 720 || this.f14410j0 > 1280)) {
            float f10 = 720.0f / i10;
            this.f14417n0.postScale(f10, f10, 0.0f, 0.0f);
            this.f14408i0 = 720;
            this.f14410j0 = 1280;
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
        ai.s sVar = new ai.s((Object) this, absolutePath, (Object) iArr, (Object) x10Var, 20);
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
            Utilities.f22782e.c(new di.ga(strArr, iArr, sVar, 15));
        } else if (this.L == null) {
            sVar.run();
        } else {
            Utilities.f22782e.c(new di.ga(absolutePath, iArr, sVar, 16));
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
                        MediaStore.Video.Thumbnails.getThumbnail(org.telegram.messenger.t0.f26915b.getContentResolver(), parseInt, 1, options);
                        options.inSampleSize = d(options, 240, 240);
                        options.inJustDecodeBounds = false;
                        options.inPreferredConfig = Bitmap.Config.RGB_565;
                        options.inDither = true;
                        bitmap = MediaStore.Video.Thumbnails.getThumbnail(org.telegram.messenger.t0.f26915b.getContentResolver(), parseInt, 1, options);
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
