package defpackage;

import android.content.SharedPreferences;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.media.MediaFormat;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Base64;
import android.util.LongSparseArray;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import androidx.media3.exoplayer.dash.DashMediaSource$Factory;
import androidx.media3.exoplayer.hls.HlsMediaSource$Factory;
import j$.util.Objects;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import org.telegram.messenger.a;
import org.telegram.messenger.secretmedia.ExtendedDefaultDataSourceFactory;
import org.telegram.tgnet.TLRPC;
public class kfc implements bg8, cfc, vj, fn7 {
    public static int k0;
    public static final HashSet l0 = new HashSet();
    public static HashMap m0;
    public boolean E;
    public boolean F;
    public Uri G;
    public boolean H;
    public boolean I;
    public boolean J;
    public ifc K;
    public efc L;
    public int M;
    public boolean N;
    public ArrayList O;
    public hfc P;
    public ArrayList Q;
    public Uri R;
    public Uri S;
    public String T;
    public String U;
    public boolean V;
    public boolean W;
    public final boolean X;
    public DashMediaSource$Factory Y;
    public HlsMediaSource$Factory Z;
    public final int a;
    public dw8 a0;
    public uo3 b;
    public final Handler b0;
    public boolean c;
    public final boolean c0;
    public s64 d;
    public boolean d0;
    public s64 e;
    public int e0;
    public final ld3 f;
    public boolean f0;
    public long g0;
    public final ExtendedDefaultDataSourceFactory h;
    public long h0;
    public y98 i0;
    public final ArrayList j0;
    public TextureView n;
    public SurfaceView r;
    public Surface s;
    public boolean w;
    public boolean x;
    public boolean y;

    public kfc(boolean z, boolean z2) {
        int i = k0;
        k0 = i + 1;
        this.a = i;
        this.b0 = new Handler(Looper.getMainLooper());
        this.d0 = false;
        this.e0 = -1;
        this.g0 = -9223372036854775807L;
        this.h0 = -9223372036854775807L;
        this.j0 = new ArrayList();
        this.c0 = z2;
        this.h = new ExtendedDefaultDataSourceFactory(a.b, "Mozilla/5.0 (X11; Linux x86_64; rv:10.0) Gecko/20150101 Firefox/47.0 (Chrome)");
        ld3 ld3Var = new ld3(a.b, new faf((byte) 13));
        this.f = ld3Var;
        if (z2) {
            gd3 gd3Var = ld3Var.f;
            gd3Var.getClass();
            fd3 fd3Var = new fd3(gd3Var);
            fd3Var.I.add(1);
            ld3Var.m(new gd3(fd3Var));
        }
        this.M = 1;
        this.X = z;
        if (z) {
            jn7.e().a(this, jn7.K4);
        }
    }

    public static boolean C0(String str) {
        String concat;
        if (str == null) {
            concat = null;
        } else {
            char c = 65535;
            switch (str.hashCode()) {
                case 96924:
                    if (str.equals("av1")) {
                        c = 0;
                        break;
                    }
                    break;
                case 96974:
                    if (str.equals("avc")) {
                        c = 1;
                        break;
                    }
                    break;
                case 116926:
                    if (str.equals("vp8")) {
                        c = 2;
                        break;
                    }
                    break;
                case 116927:
                    if (str.equals("vp9")) {
                        c = 3;
                        break;
                    }
                    break;
                case 3004662:
                    if (str.equals("av01")) {
                        c = 4;
                        break;
                    }
                    break;
                case 3148040:
                    if (str.equals("h264")) {
                        c = 5;
                        break;
                    }
                    break;
                case 3148041:
                    if (str.equals("h265")) {
                        c = 6;
                        break;
                    }
                    break;
                case 3199082:
                    if (str.equals("hevc")) {
                        c = 7;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                case 4:
                    concat = "video/av01";
                    break;
                case 1:
                case 5:
                    concat = "video/avc";
                    break;
                case 2:
                    concat = "video/x-vnd.on2.vp8";
                    break;
                case 3:
                    concat = "video/x-vnd.on2.vp9";
                    break;
                case 6:
                case 7:
                    concat = "video/hevc";
                    break;
                default:
                    try {
                        concat = "video/".concat(str);
                        break;
                    } catch (Exception e) {
                        cc4.g(e, true);
                        return false;
                    }
            }
        }
        if (concat != null) {
            HashMap hashMap = m0;
            if (hashMap == null) {
                hashMap = new HashMap();
                m0 = hashMap;
            }
            Boolean bool = (Boolean) hashMap.get(concat);
            if (bool != null) {
                return bool.booleanValue();
            }
            if (!uc7.e1().getBoolean("unsupport_".concat(concat), false)) {
                int codecCount = MediaCodecList.getCodecCount();
                for (int i = 0; i < codecCount; i++) {
                    MediaCodecInfo codecInfoAt = MediaCodecList.getCodecInfoAt(i);
                    if (!codecInfoAt.isEncoder() && wm6.i(codecInfoAt, concat)) {
                        for (String str2 : codecInfoAt.getSupportedTypes()) {
                            if (str2.equalsIgnoreCase(concat)) {
                                m0.put(concat, Boolean.TRUE);
                                return true;
                            }
                        }
                        continue;
                    }
                }
                m0.put(concat, Boolean.FALSE);
                return false;
            }
        }
        return false;
    }

    public static jfc O(ArrayList arrayList) {
        if (arrayList != null) {
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                ArrayList arrayList2 = ((hfc) obj).d;
                int size2 = arrayList2.size();
                int i2 = 0;
                while (i2 < size2) {
                    Object obj2 = arrayList2.get(i2);
                    i2++;
                    jfc jfcVar = (jfc) obj2;
                    if (jfcVar.b()) {
                        return jfcVar;
                    }
                }
            }
            return null;
        }
        return null;
    }

    public static ArrayList X(int i, TLRPC.Document document, ArrayList arrayList, int i2, boolean z) {
        hfc hfcVar;
        String str;
        ArrayList arrayList2 = new ArrayList();
        if (document != null) {
            arrayList2.add(document);
        }
        if (!uc7.s1(i).l4.a3.f && arrayList != null) {
            arrayList2.addAll(arrayList);
        }
        LongSparseArray longSparseArray = new LongSparseArray();
        int i3 = 0;
        while (i3 < arrayList2.size()) {
            TLRPC.Document document2 = (TLRPC.Document) arrayList2.get(i3);
            if ("application/x-mpegurl".equalsIgnoreCase(document2.mime_type) && (str = document2.file_name_fixed) != null && str.startsWith("mtproto")) {
                try {
                    longSparseArray.put(Long.parseLong(document2.file_name_fixed.substring(7)), document2);
                    arrayList2.remove(i3);
                    i3--;
                } catch (Exception e) {
                    cc4.g(e, true);
                }
            }
            i3++;
        }
        ArrayList arrayList3 = new ArrayList();
        for (int i4 = 0; i4 < arrayList2.size(); i4++) {
            try {
                TLRPC.Document document3 = (TLRPC.Document) arrayList2.get(i4);
                if (!"application/x-mpegurl".equalsIgnoreCase(document3.mime_type) && !"application/x-tgstoryboard".equalsIgnoreCase(document3.mime_type) && !"application/x-tgstoryboardmap".equalsIgnoreCase(document3.mime_type)) {
                    jfc d = jfc.d(i, document3, (TLRPC.Document) longSparseArray.get(document3.id), i2, z);
                    if (d.i > 0 && d.j > 0) {
                        if (document3 == document) {
                            d.b = true;
                        }
                        arrayList3.add(d);
                    }
                }
            } catch (Exception e2) {
                cc4.g(e2, true);
            }
        }
        ArrayList arrayList4 = new ArrayList();
        for (int i5 = 0; i5 < arrayList3.size(); i5++) {
            jfc jfcVar = (jfc) arrayList3.get(i5);
            String str2 = jfcVar.m;
            if (str2 == null || ((!"av1".equals(str2) && !"av01".equals(jfcVar.m) && !"hevc".equals(jfcVar.m) && !"h265".equals(jfcVar.m) && !"vp9".equals(jfcVar.m)) || C0(jfcVar.m))) {
                arrayList4.add(jfcVar);
            }
        }
        ArrayList arrayList5 = new ArrayList();
        if (arrayList4.isEmpty()) {
            arrayList5.addAll(arrayList3);
        } else {
            arrayList5.addAll(arrayList4);
        }
        ArrayList arrayList6 = new ArrayList();
        int size = arrayList5.size();
        int i6 = 0;
        while (i6 < size) {
            Object obj = arrayList5.get(i6);
            i6++;
            jfc jfcVar2 = (jfc) obj;
            if (jfcVar2.b) {
                arrayList6.add(new hfc(jfcVar2));
            } else {
                int size2 = arrayList6.size();
                int i7 = 0;
                while (true) {
                    if (i7 < size2) {
                        Object obj2 = arrayList6.get(i7);
                        i7++;
                        hfcVar = (hfc) obj2;
                        if (!hfcVar.a && hfcVar.b == jfcVar2.i && hfcVar.c == jfcVar2.j) {
                            break;
                        }
                    } else {
                        hfcVar = null;
                        break;
                    }
                }
                if (hfcVar != null && !xea.N0) {
                    hfcVar.d.add(jfcVar2);
                } else {
                    arrayList6.add(new hfc(jfcVar2));
                }
            }
        }
        return arrayList6;
    }

    public static jfc a0(ArrayList arrayList) {
        int i;
        int i2;
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            ArrayList arrayList2 = ((hfc) obj).d;
            int size2 = arrayList2.size();
            int i4 = 0;
            while (i4 < size2) {
                Object obj2 = arrayList2.get(i4);
                i4++;
                jfc jfcVar = (jfc) obj2;
                if (jfcVar.b && jfcVar.b()) {
                    return jfcVar;
                }
            }
        }
        int size3 = arrayList.size();
        jfc jfcVar2 = null;
        int i5 = 0;
        while (i5 < size3) {
            Object obj3 = arrayList.get(i5);
            i5++;
            ArrayList arrayList3 = ((hfc) obj3).d;
            int size4 = arrayList3.size();
            int i6 = 0;
            while (i6 < size4) {
                Object obj4 = arrayList3.get(i6);
                i6++;
                jfc jfcVar3 = (jfc) obj4;
                if (!jfcVar3.b && C0(jfcVar3.m) && (jfcVar2 == null || (i = jfcVar3.i * jfcVar3.j) > (i2 = jfcVar2.i * jfcVar2.j) || (i == i2 && jfcVar3.l < jfcVar2.l))) {
                    jfcVar2 = jfcVar3;
                }
            }
        }
        if (jfcVar2 == null) {
            int size5 = arrayList.size();
            int i7 = 0;
            while (i7 < size5) {
                Object obj5 = arrayList.get(i7);
                i7++;
                ArrayList arrayList4 = ((hfc) obj5).d;
                int size6 = arrayList4.size();
                int i8 = 0;
                while (i8 < size6) {
                    Object obj6 = arrayList4.get(i8);
                    i8++;
                    jfc jfcVar4 = (jfc) obj6;
                    if (jfcVar2 == null || jfcVar2.i * jfcVar2.j > jfcVar4.i * jfcVar4.j || jfcVar4.l < jfcVar2.l) {
                        jfcVar2 = jfcVar4;
                    }
                }
            }
        }
        return jfcVar2;
    }

    public static jfc b0(ArrayList arrayList) {
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ArrayList arrayList2 = ((hfc) obj).d;
            int size2 = arrayList2.size();
            int i2 = 0;
            while (i2 < size2) {
                Object obj2 = arrayList2.get(i2);
                i2++;
                jfc jfcVar = (jfc) obj2;
                if (jfcVar.b()) {
                    return jfcVar;
                }
            }
        }
        int size3 = arrayList.size();
        jfc jfcVar2 = null;
        int i3 = 0;
        while (i3 < size3) {
            Object obj3 = arrayList.get(i3);
            i3++;
            ArrayList arrayList3 = ((hfc) obj3).d;
            int size4 = arrayList3.size();
            int i4 = 0;
            while (i4 < size4) {
                Object obj4 = arrayList3.get(i4);
                i4++;
                jfc jfcVar3 = (jfc) obj4;
                if (!jfcVar3.b && (jfcVar2 == null || jfcVar2.i * jfcVar2.j > jfcVar3.i * jfcVar3.j || jfcVar3.l < jfcVar2.l)) {
                    if (jfcVar3.i <= 900 && jfcVar3.j <= 900) {
                        jfcVar2 = jfcVar3;
                    }
                }
            }
        }
        if (jfcVar2 == null) {
            int size5 = arrayList.size();
            int i5 = 0;
            while (i5 < size5) {
                Object obj5 = arrayList.get(i5);
                i5++;
                ArrayList arrayList4 = ((hfc) obj5).d;
                int size6 = arrayList4.size();
                int i6 = 0;
                while (i6 < size6) {
                    Object obj6 = arrayList4.get(i6);
                    i6++;
                    jfc jfcVar4 = (jfc) obj6;
                    if (jfcVar2 == null || jfcVar2.i * jfcVar2.j > jfcVar4.i * jfcVar4.j || jfcVar4.l < jfcVar2.l) {
                        jfcVar2 = jfcVar4;
                    }
                }
            }
        }
        return jfcVar2;
    }

    public static void m0(r47 r47Var, boolean z) {
        if (r47Var == null) {
            return;
        }
        SharedPreferences sharedPreferences = a.b.getSharedPreferences("media_saved_pos", 0);
        sharedPreferences.edit().putBoolean(r47.B0(r47Var.k) + "_" + r47Var.e1() + "loop", z).apply();
    }

    public static void n0(hfc hfcVar, r47 r47Var) {
        String str;
        if (r47Var == null) {
            return;
        }
        long B0 = r47.B0(r47Var.k);
        int e1 = r47Var.e1();
        SharedPreferences.Editor edit = a.b.getSharedPreferences("media_saved_pos", 0).edit();
        if (hfcVar == null) {
            edit.remove(B0 + "_" + e1 + "q2");
        } else {
            String str2 = B0 + "_" + e1 + "q2";
            StringBuilder sb = new StringBuilder();
            sb.append(hfcVar.b);
            sb.append("x");
            sb.append(hfcVar.c);
            if (hfcVar.a) {
                str = "s";
            } else {
                str = "";
            }
            sb.append(str);
            edit.putString(str2, sb.toString());
        }
        edit.apply();
    }

    public final void A0(float f) {
        s64 s64Var = this.d;
        if (s64Var != null) {
            s64Var.R(f);
        }
        s64 s64Var2 = this.e;
        if (s64Var2 != null) {
            s64Var2.R(f);
        }
    }

    public final void B0(uo3 uo3Var) {
        this.b = uo3Var;
        s64 s64Var = this.d;
        if (uo3Var != null) {
            s64Var.s0 = new pe2(uo3Var, (byte) 7);
        } else {
            s64Var.s0 = null;
        }
    }

    @Override
    public final void F(e64 e64Var) {
        hl.c3(new c9c(this, e64Var, (byte) 13));
    }

    @Override
    public final void H(int r6, boolean r7) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kfc.H(int, boolean):void");
    }

    public final void I() {
        int i;
        int i2;
        oc3 oc3Var;
        int i3;
        HashMap hashMap = new HashMap();
        hashMap.put(ig8.c.a, 144179200);
        cf0 cf0Var = new cf0();
        if (this.c) {
            i2 = 1000;
            i = 1000;
        } else {
            i = 2000;
            i2 = 100;
        }
        ec3.a(i2, 0, "bufferForPlaybackMs", "0");
        ec3.a(i, 0, "bufferForPlaybackAfterRebufferMs", "0");
        ec3.a(50000, i2, "minBufferMs", "bufferForPlaybackMs");
        ec3.a(50000, i, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
        ec3.a(50000, 50000, "maxBufferMs", "minBufferMs");
        ec3.a(0, 0, "backBufferDurationMs", "0");
        ec3 ec3Var = new ec3(cf0Var, 50000, 50000, 50000, 50000, i2, i2, i, i, false, hashMap);
        if (this.d == null) {
            if (this.L != null) {
                oc3Var = new ffc(this, a.b);
            } else {
                oc3Var = new oc3(a.b);
            }
            oc3Var.c = true;
            f64 f64Var = new f64(a.b);
            yve.p(!f64Var.A);
            f64Var.c = new hc3(oc3Var, (byte) 3);
            ld3 ld3Var = this.f;
            yve.p(!f64Var.A);
            ld3Var.getClass();
            f64Var.e = new hc3(ld3Var, (byte) 2);
            f64Var.b(ec3Var);
            s64 a = f64Var.a();
            this.d = a;
            a.i0(new oz(3, 0, 1, 1, false, 0, true), false);
            ea3 ea3Var = this.d.s;
            ea3Var.getClass();
            ea3Var.f.a(this);
            this.d.m.a(this);
            this.d.t0.add(this);
            TextureView textureView = this.n;
            if (textureView != null) {
                this.d.s1(textureView);
            } else {
                Surface surface = this.s;
                if (surface != null) {
                    this.d.r1(surface);
                } else {
                    SurfaceView surfaceView = this.r;
                    if (surfaceView != null) {
                        s64 s64Var = this.d;
                        s64Var.y1();
                        s64Var.Q(surfaceView.getHolder());
                    }
                }
            }
            this.d.V(this.x);
            s64 s64Var2 = this.d;
            if (this.W) {
                i3 = 2;
            } else {
                i3 = 0;
            }
            s64Var2.n0(i3);
        }
        if (this.y && this.e == null) {
            f64 f64Var2 = new f64(a.b);
            ld3 ld3Var2 = this.f;
            yve.p(!f64Var2.A);
            ld3Var2.getClass();
            f64Var2.e = new hc3(ld3Var2, (byte) 2);
            f64Var2.b(ec3Var);
            s64 a2 = f64Var2.a();
            this.e = a2;
            a2.i0(new oz(2, 0, 1, 1, false, 0, true), false);
            this.e.m.a(new c30(this, (byte) 4));
            this.e.V(this.x);
        }
    }

    public final long N() {
        s64 s64Var = this.d;
        if (s64Var != null) {
            if (this.w) {
                return s64Var.b0();
            }
            return s64Var.getDuration();
        }
        return 0L;
    }

    public final qh2 Q(String str, String str2, String str3) {
        String str4;
        String str5 = "video/mp4";
        if (this.O == null) {
            if (this.R == null) {
                return null;
            }
            String concat = "/mtproto_".concat(str);
            String queryParameter = this.R.getQueryParameter("mime");
            if (!TextUtils.isEmpty(queryParameter)) {
                str5 = queryParameter;
            }
            oh2 oh2Var = new oh2(str5, this.R, concat);
            oh2Var.e = str2;
            oh2Var.f = str3;
            return new qh2(new ph2(oh2Var));
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.O;
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList2.get(i);
            i++;
            ArrayList arrayList3 = ((hfc) obj).d;
            int size2 = arrayList3.size();
            int i2 = 0;
            while (i2 < size2) {
                Object obj2 = arrayList3.get(i2);
                i2++;
                jfc jfcVar = (jfc) obj2;
                StringBuilder sb = new StringBuilder("/mtproto_");
                int i3 = size;
                sb.append(jfcVar.c);
                String sb2 = sb.toString();
                TLRPC.Document document = jfcVar.g;
                if (document != null) {
                    str4 = document.mime_type;
                } else {
                    str4 = null;
                }
                if (TextUtils.isEmpty(str4)) {
                    str4 = "video/mp4";
                }
                oh2 oh2Var2 = new oh2(str4, jfcVar.d, sb2);
                oh2Var2.e = str2;
                oh2Var2.f = str3;
                int i4 = jfcVar.i;
                int i5 = jfcVar.j;
                oh2Var2.a = i4;
                oh2Var2.b = i5;
                arrayList.add(new ph2(oh2Var2));
                size = i3;
            }
        }
        return new qh2(arrayList);
    }

    public final TLRPC.Document R() {
        ArrayList arrayList;
        s64 s64Var = this.d;
        if (s64Var != null) {
            s64Var.y1();
            ko4 ko4Var = s64Var.S;
            if (ko4Var != null && ko4Var.p != 0 && (arrayList = this.O) != null) {
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    ArrayList arrayList2 = ((hfc) obj).d;
                    int size2 = arrayList2.size();
                    int i2 = 0;
                    while (i2 < size2) {
                        Object obj2 = arrayList2.get(i2);
                        i2++;
                        jfc jfcVar = (jfc) obj2;
                        if (jfcVar.c == ko4Var.p) {
                            return jfcVar.g;
                        }
                    }
                }
                return null;
            }
            return null;
        }
        return null;
    }

    public final long S() {
        long j = this.h0;
        if (j != -9223372036854775807L) {
            return j;
        }
        s64 s64Var = this.d;
        if (s64Var != null) {
            return s64Var.k();
        }
        return 0L;
    }

    public final int T() {
        if (this.e0 == -1) {
            try {
                if (this.d0) {
                    for (int i = 0; i < Y(); i++) {
                        if (Z(i).a) {
                            return i;
                        }
                    }
                }
                s64 s64Var = this.d;
                if (s64Var != null) {
                    s64Var.y1();
                    ko4 ko4Var = s64Var.S;
                    if (ko4Var != null) {
                        for (int i2 = 0; i2 < Y(); i2++) {
                            hfc Z = Z(i2);
                            if (!Z.a && ko4Var.A == Z.b && ko4Var.B == Z.c && ko4Var.k == ((int) Math.floor(((jfc) Z.d.get(0)).l * 8.0d))) {
                                return i2;
                            }
                        }
                    }
                }
                return -1;
            } catch (Exception e) {
                cc4.g(e, true);
                return -1;
            }
        }
        return this.e0;
    }

    public final long U() {
        long j = this.g0;
        if (j != -9223372036854775807L) {
            return j;
        }
        s64 s64Var = this.d;
        if (s64Var != null) {
            return s64Var.getDuration();
        }
        return 0L;
    }

    public final b8b V(b8b b8bVar) {
        b8b b8bVar2 = b8bVar;
        if (b8bVar == null) {
            b8bVar2 = new Object();
        }
        try {
            s64 s64Var = this.d;
            s64Var.y1();
            MediaFormat mediaFormat = ((qm6) s64Var.g[0]).e0;
            ByteBuffer byteBuffer = mediaFormat.getByteBuffer("hdr-static-info");
            byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
            if (byteBuffer.get() == 0) {
                byteBuffer.getShort(17);
                byteBuffer.getShort(19);
            }
            if (Build.VERSION.SDK_INT >= 24) {
                if (mediaFormat.containsKey("color-transfer")) {
                    b8bVar2.b = mediaFormat.getInteger("color-transfer");
                }
                if (mediaFormat.containsKey("color-standard")) {
                    b8bVar2.a = mediaFormat.getInteger("color-standard");
                }
                if (mediaFormat.containsKey("color-range")) {
                    mediaFormat.getInteger("color-range");
                }
            }
        } catch (Exception unused) {
        }
        return b8bVar2;
    }

    public final hfc W(Boolean bool) {
        hfc hfcVar = null;
        for (int i = 0; i < Y(); i++) {
            hfc Z = Z(i);
            if (Z.a == bool.booleanValue() && (hfcVar == null || hfcVar.b * hfcVar.c < Z.b * Z.c)) {
                hfcVar = Z;
            }
        }
        return hfcVar;
    }

    public final int Y() {
        ArrayList arrayList = this.O;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    public final hfc Z(int i) {
        ArrayList arrayList = this.O;
        if (arrayList == null) {
            return W(Boolean.FALSE);
        }
        if (i >= 0 && i < arrayList.size()) {
            return (hfc) this.O.get(i);
        }
        return W(Boolean.FALSE);
    }

    @Override
    public final void a(ggc ggcVar) {
        if (!Objects.equals(ggcVar, ggc.d)) {
            this.K.onVideoSizeChanged(ggcVar.a, ggcVar.b, 0, ggcVar.c);
        }
    }

    public final boolean c0() {
        if (!this.y || !this.J) {
            s64 s64Var = this.d;
            if (s64Var != null && s64Var.s()) {
                return true;
            }
            return false;
        }
        return true;
    }

    public final Uri d0(ArrayList arrayList) {
        String str;
        StringBuilder sb = new StringBuilder("#EXTM3U\n#EXT-X-VERSION:6\n#EXT-X-INDEPENDENT-SEGMENTS\n\n");
        this.Q = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        boolean z = false;
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ArrayList arrayList3 = ((hfc) obj).d;
            int size2 = arrayList3.size();
            int i2 = 0;
            while (i2 < size2) {
                Object obj2 = arrayList3.get(i2);
                i2++;
                jfc jfcVar = (jfc) obj2;
                long j = jfcVar.c;
                Uri uri = jfcVar.d;
                ExtendedDefaultDataSourceFactory extendedDefaultDataSourceFactory = this.h;
                extendedDefaultDataSourceFactory.putDocumentUri(j, uri);
                extendedDefaultDataSourceFactory.putDocumentUri(jfcVar.e, jfcVar.f);
                if (jfcVar.f != null) {
                    this.Q.add(jfcVar);
                    StringBuilder sb2 = new StringBuilder("#EXT-X-STREAM-INF:BANDWIDTH=");
                    sb2.append((int) Math.floor(jfcVar.l * 8.0d));
                    sb2.append(",RESOLUTION=");
                    sb2.append(jfcVar.i);
                    sb2.append("x");
                    sb2.append(jfcVar.j);
                    String str2 = jfcVar.m;
                    if (str2 == null) {
                        str = null;
                    } else {
                        char c = 65535;
                        switch (str2.hashCode()) {
                            case 96924:
                                if (str2.equals("av1")) {
                                    c = 0;
                                    break;
                                }
                                break;
                            case 96974:
                                if (str2.equals("avc")) {
                                    c = 1;
                                    break;
                                }
                                break;
                            case 116926:
                                if (str2.equals("vp8")) {
                                    c = 2;
                                    break;
                                }
                                break;
                            case 116927:
                                if (str2.equals("vp9")) {
                                    c = 3;
                                    break;
                                }
                                break;
                            case 3004662:
                                if (str2.equals("av01")) {
                                    c = 4;
                                    break;
                                }
                                break;
                            case 3148040:
                                if (str2.equals("h264")) {
                                    c = 5;
                                    break;
                                }
                                break;
                            case 3148041:
                                if (str2.equals("h265")) {
                                    c = 6;
                                    break;
                                }
                                break;
                            case 3199082:
                                if (str2.equals("hevc")) {
                                    c = 7;
                                    break;
                                }
                                break;
                        }
                        switch (c) {
                            case 0:
                            case 4:
                                str = "video/av01";
                                break;
                            case 1:
                            case 5:
                                str = "video/avc";
                                break;
                            case 2:
                                str = "video/x-vnd.on2.vp8";
                                break;
                            case 3:
                                str = "video/x-vnd.on2.vp9";
                                break;
                            case 6:
                            case 7:
                                str = "video/hevc";
                                break;
                            default:
                                str = "video/".concat(str2);
                                break;
                        }
                    }
                    if (str != null) {
                        ik8.z(",MIME=\"", str, "\"", sb2);
                    }
                    if (jfcVar.b() && jfcVar.c()) {
                        sb2.append(",CACHED=\"true\"");
                    }
                    sb2.append(",DOCID=\"");
                    sb2.append(jfcVar.c);
                    sb2.append("\",ACCOUNT=\"");
                    sb2.append(jfcVar.a);
                    sb2.append("\"\n");
                    if (jfcVar.c()) {
                        sb2.append(jfcVar.f);
                        sb2.append("\n\n");
                    } else {
                        sb2.append("mtproto:");
                        sb2.append(jfcVar.e);
                        sb2.append("\n\n");
                    }
                    arrayList2.add(sb2.toString());
                    z = true;
                }
            }
        }
        if (!z) {
            return null;
        }
        Collections.reverse(arrayList2);
        sb.append(TextUtils.join("", arrayList2));
        return Uri.parse("data:application/x-mpegurl;base64," + Base64.encodeToString(sb.toString().getBytes(), 2));
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == jn7.K4 && ((kfc) objArr[0]) != this && c0() && !this.E) {
            f0();
        }
    }

    public final rg0 e0(long j, Uri uri, String str) {
        boolean z;
        zs6 zs6Var;
        bt6 bt6Var;
        pr3 pr3Var;
        pr3 pr3Var2;
        ys6 ys6Var;
        final ExtendedDefaultDataSourceFactory extendedDefaultDataSourceFactory = this.h;
        us6 us6Var = new us6();
        xs6 xs6Var = new xs6();
        List list = Collections.EMPTY_LIST;
        no5 no5Var = po5.b;
        j99 j99Var = j99.e;
        zs6 zs6Var2 = new zs6();
        ct6 ct6Var = ct6.d;
        if (xs6Var.b != null && xs6Var.a == null) {
            z = false;
        } else {
            z = true;
        }
        yve.p(z);
        if (uri != null) {
            if (xs6Var.a != null) {
                ys6Var = new ys6(xs6Var);
            } else {
                ys6Var = null;
            }
            zs6Var = zs6Var2;
            bt6Var = new bt6(uri, null, ys6Var, null, list, null, j99Var, -9223372036854775807L);
        } else {
            zs6Var = zs6Var2;
            bt6Var = null;
        }
        ft6 ft6Var = new ft6("", new vs6(us6Var), bt6Var, new at6(zs6Var), nt6.M, ct6Var);
        if (j != 0) {
            i02 i02Var = new i02(this, j, (byte) 14);
            jz7 jz7Var = new jz7(new db3(), (byte) 21);
            Object obj = new Object();
            z6f z6fVar = new z6f((byte) 17);
            ft6Var.b.getClass();
            ft6Var.b.getClass();
            ys6 ys6Var2 = ft6Var.b.c;
            if (ys6Var2 == null) {
                pr3Var2 = pr3.u;
            } else {
                synchronized (obj) {
                    if (!ys6Var2.equals(null)) {
                        pr3Var = rx6.x(ys6Var2);
                    } else {
                        pr3Var = null;
                    }
                    pr3Var.getClass();
                }
                pr3Var2 = pr3Var;
            }
            return new ew8(ft6Var, i02Var, jz7Var, pr3Var2, z6fVar, 1048576, null);
        }
        str.getClass();
        if (!str.equals("hls")) {
            if (!str.equals("dash")) {
                dw8 dw8Var = this.a0;
                if (dw8Var == null) {
                    dw8Var = new dw8(extendedDefaultDataSourceFactory, new db3());
                    this.a0 = dw8Var;
                }
                return dw8Var.d(ft6Var);
            }
            DashMediaSource$Factory dashMediaSource$Factory = this.Y;
            DashMediaSource$Factory dashMediaSource$Factory2 = dashMediaSource$Factory;
            if (dashMediaSource$Factory == null) {
                ?? r1 = new uz6(extendedDefaultDataSourceFactory) {
                    public final qx6 a;
                    public final f73 b;
                    public final rx6 c;
                    public final sg7 d;
                    public final z6f e;
                    public final short f;
                    public final int g;

                    {
                        qx6 qx6Var = new qx6(extendedDefaultDataSourceFactory);
                        this.a = qx6Var;
                        this.b = extendedDefaultDataSourceFactory;
                        this.c = new rx6();
                        this.e = new z6f((byte) 17);
                        this.f = (short) 30000;
                        this.g = 5000000;
                        this.d = new sg7((byte) 17);
                        ((n31) qx6Var.c).b = true;
                    }

                    @Override
                    public final uz6 a() {
                        ((n31) this.a.c).b = true;
                        return this;
                    }

                    @Override
                    public final uz6 b() {
                        Object obj2 = this.a.c;
                        return this;
                    }

                    @Override
                    public final uz6 c(uif uifVar) {
                        ((n31) this.a.c).c = uifVar;
                        return this;
                    }

                    @Override
                    public final rg0 d(ft6 ft6Var2) {
                        iy7 iy7Var;
                        ft6Var2.b.getClass();
                        iy7 b63Var = new b63();
                        List list2 = ft6Var2.b.e;
                        if (!list2.isEmpty()) {
                            iy7Var = new lh2(b63Var, list2, (byte) 28);
                        } else {
                            iy7Var = b63Var;
                        }
                        return new i63(ft6Var2, this.b, iy7Var, this.a, this.d, this.c.G(ft6Var2), this.e, this.f, this.g);
                    }
                };
                this.Y = r1;
                dashMediaSource$Factory2 = r1;
            }
            return dashMediaSource$Factory2.d(ft6Var);
        }
        HlsMediaSource$Factory hlsMediaSource$Factory = this.Z;
        HlsMediaSource$Factory hlsMediaSource$Factory2 = hlsMediaSource$Factory;
        if (hlsMediaSource$Factory == null) {
            ?? r12 = new uz6(extendedDefaultDataSourceFactory) {
                public final z8d a;
                public ib3 b;
                public uif c;
                public final rx6 i = new rx6();
                public final z3f f = new z3f((byte) 17);
                public final da3 g = mb3.N;
                public final z6f j = new z6f((byte) 17);
                public final sg7 h = new sg7((byte) 17);
                public final boolean l = true;
                public final long m = -9223372036854775807L;
                public final boolean k = true;
                public byte e = 3;
                public boolean d = true;

                {
                    this.a = new z8d(extendedDefaultDataSourceFactory, (byte) 27);
                }

                @Override
                public final uz6 a() {
                    this.d = true;
                    return this;
                }

                @Override
                public final uz6 b() {
                    this.e = (byte) 3;
                    return this;
                }

                @Override
                public final uz6 c(uif uifVar) {
                    this.c = uifVar;
                    return this;
                }

                @Override
                public final gh5 d(ft6 ft6Var2) {
                    ft6Var2.b.getClass();
                    ib3 ib3Var = this.b;
                    ib3 ib3Var2 = ib3Var;
                    if (ib3Var == null) {
                        ?? obj2 = new Object();
                        obj2.c = new uif((byte) 17);
                        obj2.b = (byte) 3;
                        this.b = obj2;
                        ib3Var2 = obj2;
                    }
                    ib3 ib3Var3 = ib3Var2;
                    uif uifVar = this.c;
                    if (uifVar != null) {
                        ib3Var3.c = uifVar;
                    }
                    ib3Var3.a = this.d;
                    ib3Var3.b = this.e;
                    List list2 = ft6Var2.b.e;
                    boolean isEmpty = list2.isEmpty();
                    nh5 nh5Var = this.f;
                    if (!isEmpty) {
                        nh5Var = new qx6(nh5Var, list2, false, (byte) 27);
                    }
                    pr3 G = this.i.G(ft6Var2);
                    this.g.getClass();
                    z8d z8dVar = this.a;
                    z6f z6fVar2 = this.j;
                    return new gh5(ft6Var2, z8dVar, ib3Var3, this.h, G, z6fVar2, new mb3(z8dVar, z6fVar2, nh5Var), this.m, this.k, this.l ? 1 : 0);
                }
            };
            this.Z = r12;
            hlsMediaSource$Factory2 = r12;
        }
        return hlsMediaSource$Factory2.d(ft6Var);
    }

    public void f0() {
        this.J = false;
        s64 s64Var = this.d;
        if (s64Var != null) {
            s64Var.V(false);
        }
        s64 s64Var2 = this.e;
        if (s64Var2 != null) {
            s64Var2.V(false);
        }
        if (this.L != null) {
            this.b0.removeCallbacksAndMessages(null);
            this.L.t(false, null);
        }
    }

    public void g0() {
        this.J = true;
        if (this.y && (!this.I || !this.H)) {
            s64 s64Var = this.d;
            if (s64Var != null) {
                s64Var.V(false);
            }
            s64 s64Var2 = this.e;
            if (s64Var2 != null) {
                s64Var2.V(false);
                return;
            }
            return;
        }
        s64 s64Var3 = this.d;
        if (s64Var3 != null) {
            s64Var3.V(true);
        }
        s64 s64Var4 = this.e;
        if (s64Var4 != null) {
            s64Var4.V(true);
        }
    }

    public final void h0(long j, Uri uri, String str) {
        String str2 = null;
        this.O = null;
        this.P = null;
        this.R = uri;
        this.T = str;
        this.S = null;
        this.U = null;
        boolean z = false;
        this.V = false;
        this.d0 = false;
        this.f0 = false;
        this.H = false;
        this.y = false;
        this.G = uri;
        if (uri != null) {
            str2 = uri.getScheme();
        }
        if (str2 != null && !str2.startsWith("file")) {
            z = true;
        }
        this.w = z;
        I();
        this.d.n1(e0(j, uri, str), true);
        this.d.a();
    }

    public final void i0(Uri uri, String str) {
        h0(0L, uri, str);
    }

    public final void j0(ArrayList arrayList, hfc hfcVar) {
        int i;
        ArrayList arrayList2;
        this.O = arrayList;
        this.P = hfcVar;
        this.R = null;
        this.T = "hls";
        this.S = null;
        this.U = null;
        this.V = false;
        this.d0 = false;
        this.H = false;
        this.y = false;
        this.G = null;
        this.w = true;
        I();
        this.f0 = false;
        if (hfcVar != null && (arrayList2 = this.O) != null) {
            i = arrayList2.indexOf(hfcVar);
        } else {
            i = -1;
        }
        this.e0 = i;
        v0(true, hfcVar);
        if (this.d0) {
            this.e0 = -1;
        }
    }

    public final void k0(Uri uri, String str, Uri uri2, String str2) {
        Uri uri3;
        String str3;
        di6 di6Var = null;
        this.O = null;
        this.P = null;
        this.R = uri;
        this.S = uri2;
        this.T = str;
        this.U = str2;
        this.V = true;
        this.f0 = false;
        this.y = true;
        this.I = false;
        this.H = false;
        I();
        di6 di6Var2 = null;
        for (int i = 0; i < 2; i++) {
            if (i == 0) {
                uri3 = uri;
                str3 = str;
            } else {
                uri3 = uri2;
                str3 = str2;
            }
            di6 di6Var3 = new di6(e0(0L, uri3, str3));
            if (i == 0) {
                di6Var = di6Var3;
            } else {
                di6Var2 = di6Var3;
            }
        }
        this.d.n1(di6Var, true);
        this.d.a();
        this.e.n1(di6Var2, true);
        this.e.a();
        l0.add(Integer.valueOf(this.a));
    }

    public final void l0() {
        l0.remove(Integer.valueOf(this.a));
        s64 s64Var = this.d;
        if (s64Var != null) {
            s64Var.g1();
            this.d = null;
        }
        s64 s64Var2 = this.e;
        if (s64Var2 != null) {
            s64Var2.g1();
            this.e = null;
        }
        if (this.X) {
            jn7.e().n(this, jn7.K4);
        }
    }

    @Override
    public final void m(c2c c2cVar) {
        y98 y98Var = this.i0;
        if (y98Var != null) {
            hl.c3(y98Var);
        }
    }

    public void o0(long j) {
        p0(j, false);
    }

    @Override
    public final void onRenderedFirstFrame(uj ujVar) {
        this.h0 = -9223372036854775807L;
        this.g0 = -9223372036854775807L;
        ifc ifcVar = this.K;
        if (ifcVar != null) {
            ifcVar.onRenderedFirstFrame(ujVar);
        }
    }

    @Override
    public final void onSeekStarted(uj ujVar) {
        ifc ifcVar = this.K;
        if (ifcVar != null) {
            ifcVar.onSeekStarted(ujVar);
        }
    }

    public final void p0(long j, boolean z) {
        az9 az9Var;
        s64 s64Var = this.d;
        if (s64Var != null) {
            if (z) {
                az9Var = az9.d;
            } else {
                az9Var = az9.c;
            }
            s64Var.p1(az9Var);
            this.d.k1(j);
        }
    }

    public final void q0(long j, boolean z, Runnable runnable) {
        az9 az9Var;
        if (this.d != null) {
            if (runnable != null) {
                this.j0.add(runnable);
            }
            s64 s64Var = this.d;
            if (z) {
                az9Var = az9.d;
            } else {
                az9Var = az9.c;
            }
            s64Var.p1(az9Var);
            this.d.k1(j);
        }
    }

    public final void r0(boolean z) {
        int i;
        if (this.W != z) {
            this.W = z;
            s64 s64Var = this.d;
            if (s64Var != null) {
                if (z) {
                    i = 2;
                } else {
                    i = 0;
                }
                s64Var.n0(i);
            }
        }
    }

    public final void s0(boolean z) {
        float f;
        s64 s64Var = this.d;
        float f2 = 1.0f;
        if (s64Var != null) {
            if (z) {
                f = 0.0f;
            } else {
                f = 1.0f;
            }
            s64Var.R(f);
        }
        s64 s64Var2 = this.e;
        if (s64Var2 != null) {
            if (z) {
                f2 = 0.0f;
            }
            s64Var2.R(f2);
        }
    }

    public void t0(boolean z) {
        this.J = z;
        if (z && this.y && (!this.I || !this.H)) {
            s64 s64Var = this.d;
            if (s64Var != null) {
                s64Var.V(false);
            }
            s64 s64Var2 = this.e;
            if (s64Var2 != null) {
                s64Var2.V(false);
                return;
            }
            return;
        }
        this.x = z;
        s64 s64Var3 = this.d;
        if (s64Var3 != null) {
            s64Var3.V(z);
        }
        s64 s64Var4 = this.e;
        if (s64Var4 != null) {
            s64Var4.V(z);
        }
    }

    public void u0(float f) {
        try {
            s64 s64Var = this.d;
            if (s64Var != null) {
                float f2 = 1.0f;
                if (f > 1.0f) {
                    f2 = 0.98f;
                }
                s64Var.c(new of8(f, f2));
            }
        } catch (Exception unused) {
        }
    }

    public final void v0(boolean r21, defpackage.hfc r22) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kfc.v0(boolean, hfc):void");
    }

    public final void w0(int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        s64 s64Var = this.d;
        if (s64Var != null) {
            if (i == 0) {
                i4 = 2;
                i5 = 1;
            } else {
                i4 = 1;
                i5 = 3;
            }
            s64Var.i0(new oz(i5, 0, i4, 1, false, 0, true), false);
        }
        s64 s64Var2 = this.e;
        if (s64Var2 != null) {
            if (i == 0) {
                i3 = 2;
                i2 = 1;
            } else {
                i2 = 2;
                i3 = 1;
            }
            s64Var2.i0(new oz(i2, 0, i3, 1, false, 0, true), true);
        }
    }

    public final void x0(Surface surface) {
        if (this.s != surface) {
            this.s = surface;
            s64 s64Var = this.d;
            if (s64Var == null) {
                return;
            }
            s64Var.r1(surface);
        }
    }

    @Override
    public final void y(uj ujVar, int i) {
        if (i == 1) {
            ifc ifcVar = this.K;
            if (ifcVar != null) {
                ifcVar.onSeekFinished(ujVar);
            }
            ArrayList arrayList = this.j0;
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                ((Runnable) obj).run();
            }
            arrayList.clear();
        }
    }

    public final void y0(SurfaceView surfaceView) {
        SurfaceHolder holder;
        if (this.r != surfaceView) {
            this.r = surfaceView;
            s64 s64Var = this.d;
            if (s64Var == null) {
                return;
            }
            s64Var.y1();
            if (surfaceView == null) {
                holder = null;
            } else {
                holder = surfaceView.getHolder();
            }
            s64Var.Q(holder);
        }
    }

    @Override
    public final void z(f2c f2cVar) {
        y98 y98Var = this.i0;
        if (y98Var != null) {
            hl.c3(y98Var);
        }
    }

    public final void z0(TextureView textureView) {
        if (this.n != textureView) {
            this.n = textureView;
            s64 s64Var = this.d;
            if (s64Var == null) {
                return;
            }
            s64Var.s1(textureView);
        }
    }

    @Override
    public void onRenderedFirstFrame() {
        this.K.onRenderedFirstFrame();
    }

    @Override
    public final void B(nt6 nt6Var) {
    }

    @Override
    public final void C(nt6 nt6Var) {
    }

    @Override
    public final void E(e64 e64Var) {
    }

    @Override
    public final void G(j99 j99Var) {
    }

    @Override
    public final void J(of8 of8Var) {
    }

    @Override
    public final void K(zf8 zf8Var) {
    }

    @Override
    public final void L(vf7 vf7Var) {
    }

    @Override
    public final void P(boolean z) {
    }

    @Override
    public final void b(int i) {
    }

    @Override
    public final void c(ag8 ag8Var) {
    }

    @Override
    public final void d(int i) {
    }

    @Override
    public final void e(boolean z) {
    }

    @Override
    public final void f(int i) {
    }

    @Override
    public final void g(int i) {
    }

    @Override
    public final void h(boolean z) {
    }

    @Override
    public final void i(jt6 jt6Var) {
    }

    @Override
    public final void j(p93 p93Var) {
    }

    @Override
    public final void l(oz ozVar) {
    }

    @Override
    public final void o(boolean z) {
    }

    @Override
    public final void q(float f) {
    }

    @Override
    public final void s(ggc ggcVar) {
    }

    @Override
    public final void t(int i) {
    }

    @Override
    public final void u(e64 e64Var) {
    }

    @Override
    public final void v(boolean z) {
    }

    @Override
    public final void x(n43 n43Var) {
    }

    @Override
    public final void D(asb asbVar, int i) {
    }

    @Override
    public final void M(int i, int i2) {
    }

    @Override
    public final void k(s64 s64Var, qx6 qx6Var) {
    }

    @Override
    public final void p(int i, boolean z) {
    }

    @Override
    public final void r(int i, ft6 ft6Var) {
    }

    @Override
    public final void w(uj ujVar, jt6 jt6Var) {
    }

    @Override
    public final void A(int i, cg8 cg8Var, cg8 cg8Var2) {
    }

    @Override
    public final void n(uj ujVar, int i, long j) {
    }

    public kfc() {
        this(true, false);
    }
}
