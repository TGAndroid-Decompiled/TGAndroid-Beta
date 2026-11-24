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
public class lbc implements mc8, cbc, uj, gk7 {
    public static int k0;
    public static final HashSet l0 = new HashSet();
    public static HashMap m0;
    public boolean E;
    public boolean F;
    public Uri G;
    public boolean H;
    public boolean I;
    public boolean J;
    public ibc K;
    public ebc L;
    public int M;
    public boolean N;
    public ArrayList O;
    public hbc P;
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
    public us8 a0;
    public do3 b;
    public final Handler b0;
    public boolean c;
    public final boolean c0;
    public y54 d;
    public boolean d0;
    public y54 e;
    public int e0;
    public final sc3 f;
    public boolean f0;
    public long g0;
    public final ExtendedDefaultDataSourceFactory h;
    public long h0;
    public l68 i0;
    public final ArrayList j0;
    public TextureView n;
    public SurfaceView r;
    public Surface s;
    public boolean w;
    public boolean x;
    public boolean y;

    public lbc(boolean z, boolean z2) {
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
        sc3 sc3Var = new sc3(a.b, new o5f((byte) 13));
        this.f = sc3Var;
        if (z2) {
            nc3 nc3Var = sc3Var.f;
            nc3Var.getClass();
            mc3 mc3Var = new mc3(nc3Var);
            mc3Var.I.add(1);
            sc3Var.m(new nc3(mc3Var));
        }
        this.M = 1;
        this.X = z;
        if (z) {
            kk7.e().a(this, kk7.J4);
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
                        fa4.g(e, true);
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
            if (!na7.c1().getBoolean("unsupport_".concat(concat), false)) {
                int codecCount = MediaCodecList.getCodecCount();
                for (int i = 0; i < codecCount; i++) {
                    MediaCodecInfo codecInfoAt = MediaCodecList.getCodecInfoAt(i);
                    if (!codecInfoAt.isEncoder() && qk6.i(codecInfoAt, concat)) {
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

    public static jbc O(ArrayList arrayList) {
        if (arrayList != null) {
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                ArrayList arrayList2 = ((hbc) obj).d;
                int size2 = arrayList2.size();
                int i2 = 0;
                while (i2 < size2) {
                    Object obj2 = arrayList2.get(i2);
                    i2++;
                    jbc jbcVar = (jbc) obj2;
                    if (jbcVar.b()) {
                        return jbcVar;
                    }
                }
            }
            return null;
        }
        return null;
    }

    public static ArrayList X(int i, TLRPC.Document document, ArrayList arrayList, int i2, boolean z) {
        hbc hbcVar;
        String str;
        ArrayList arrayList2 = new ArrayList();
        if (document != null) {
            arrayList2.add(document);
        }
        if (!na7.q1(i).k4.S2.f && arrayList != null) {
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
                    fa4.g(e, true);
                }
            }
            i3++;
        }
        ArrayList arrayList3 = new ArrayList();
        for (int i4 = 0; i4 < arrayList2.size(); i4++) {
            try {
                TLRPC.Document document3 = (TLRPC.Document) arrayList2.get(i4);
                if (!"application/x-mpegurl".equalsIgnoreCase(document3.mime_type) && !"application/x-tgstoryboard".equalsIgnoreCase(document3.mime_type) && !"application/x-tgstoryboardmap".equalsIgnoreCase(document3.mime_type)) {
                    jbc d = jbc.d(i, document3, (TLRPC.Document) longSparseArray.get(document3.id), i2, z);
                    if (d.i > 0 && d.j > 0) {
                        if (document3 == document) {
                            d.b = true;
                        }
                        arrayList3.add(d);
                    }
                }
            } catch (Exception e2) {
                fa4.g(e2, true);
            }
        }
        ArrayList arrayList4 = new ArrayList();
        for (int i5 = 0; i5 < arrayList3.size(); i5++) {
            jbc jbcVar = (jbc) arrayList3.get(i5);
            String str2 = jbcVar.m;
            if (str2 == null || ((!"av1".equals(str2) && !"av01".equals(jbcVar.m) && !"hevc".equals(jbcVar.m) && !"h265".equals(jbcVar.m) && !"vp9".equals(jbcVar.m)) || C0(jbcVar.m))) {
                arrayList4.add(jbcVar);
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
            jbc jbcVar2 = (jbc) obj;
            if (jbcVar2.b) {
                arrayList6.add(new hbc(jbcVar2));
            } else {
                int size2 = arrayList6.size();
                int i7 = 0;
                while (true) {
                    if (i7 < size2) {
                        Object obj2 = arrayList6.get(i7);
                        i7++;
                        hbcVar = (hbc) obj2;
                        if (!hbcVar.a && hbcVar.b == jbcVar2.i && hbcVar.c == jbcVar2.j) {
                            break;
                        }
                    } else {
                        hbcVar = null;
                        break;
                    }
                }
                if (hbcVar != null && !gba.N0) {
                    hbcVar.d.add(jbcVar2);
                } else {
                    arrayList6.add(new hbc(jbcVar2));
                }
            }
        }
        return arrayList6;
    }

    public static jbc a0(ArrayList arrayList) {
        int i;
        int i2;
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            ArrayList arrayList2 = ((hbc) obj).d;
            int size2 = arrayList2.size();
            int i4 = 0;
            while (i4 < size2) {
                Object obj2 = arrayList2.get(i4);
                i4++;
                jbc jbcVar = (jbc) obj2;
                if (jbcVar.b && jbcVar.b()) {
                    return jbcVar;
                }
            }
        }
        int size3 = arrayList.size();
        jbc jbcVar2 = null;
        int i5 = 0;
        while (i5 < size3) {
            Object obj3 = arrayList.get(i5);
            i5++;
            ArrayList arrayList3 = ((hbc) obj3).d;
            int size4 = arrayList3.size();
            int i6 = 0;
            while (i6 < size4) {
                Object obj4 = arrayList3.get(i6);
                i6++;
                jbc jbcVar3 = (jbc) obj4;
                if (!jbcVar3.b && C0(jbcVar3.m) && (jbcVar2 == null || (i = jbcVar3.i * jbcVar3.j) > (i2 = jbcVar2.i * jbcVar2.j) || (i == i2 && jbcVar3.l < jbcVar2.l))) {
                    jbcVar2 = jbcVar3;
                }
            }
        }
        if (jbcVar2 == null) {
            int size5 = arrayList.size();
            int i7 = 0;
            while (i7 < size5) {
                Object obj5 = arrayList.get(i7);
                i7++;
                ArrayList arrayList4 = ((hbc) obj5).d;
                int size6 = arrayList4.size();
                int i8 = 0;
                while (i8 < size6) {
                    Object obj6 = arrayList4.get(i8);
                    i8++;
                    jbc jbcVar4 = (jbc) obj6;
                    if (jbcVar2 == null || jbcVar2.i * jbcVar2.j > jbcVar4.i * jbcVar4.j || jbcVar4.l < jbcVar2.l) {
                        jbcVar2 = jbcVar4;
                    }
                }
            }
        }
        return jbcVar2;
    }

    public static jbc b0(ArrayList arrayList) {
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ArrayList arrayList2 = ((hbc) obj).d;
            int size2 = arrayList2.size();
            int i2 = 0;
            while (i2 < size2) {
                Object obj2 = arrayList2.get(i2);
                i2++;
                jbc jbcVar = (jbc) obj2;
                if (jbcVar.b()) {
                    return jbcVar;
                }
            }
        }
        int size3 = arrayList.size();
        jbc jbcVar2 = null;
        int i3 = 0;
        while (i3 < size3) {
            Object obj3 = arrayList.get(i3);
            i3++;
            ArrayList arrayList3 = ((hbc) obj3).d;
            int size4 = arrayList3.size();
            int i4 = 0;
            while (i4 < size4) {
                Object obj4 = arrayList3.get(i4);
                i4++;
                jbc jbcVar3 = (jbc) obj4;
                if (!jbcVar3.b && (jbcVar2 == null || jbcVar2.i * jbcVar2.j > jbcVar3.i * jbcVar3.j || jbcVar3.l < jbcVar2.l)) {
                    if (jbcVar3.i <= 900 && jbcVar3.j <= 900) {
                        jbcVar2 = jbcVar3;
                    }
                }
            }
        }
        if (jbcVar2 == null) {
            int size5 = arrayList.size();
            int i5 = 0;
            while (i5 < size5) {
                Object obj5 = arrayList.get(i5);
                i5++;
                ArrayList arrayList4 = ((hbc) obj5).d;
                int size6 = arrayList4.size();
                int i6 = 0;
                while (i6 < size6) {
                    Object obj6 = arrayList4.get(i6);
                    i6++;
                    jbc jbcVar4 = (jbc) obj6;
                    if (jbcVar2 == null || jbcVar2.i * jbcVar2.j > jbcVar4.i * jbcVar4.j || jbcVar4.l < jbcVar2.l) {
                        jbcVar2 = jbcVar4;
                    }
                }
            }
        }
        return jbcVar2;
    }

    public static void m0(k27 k27Var, boolean z) {
        if (k27Var == null) {
            return;
        }
        SharedPreferences sharedPreferences = a.b.getSharedPreferences("media_saved_pos", 0);
        sharedPreferences.edit().putBoolean(k27.B0(k27Var.k) + "_" + k27Var.e1() + "loop", z).apply();
    }

    public static void n0(hbc hbcVar, k27 k27Var) {
        String str;
        if (k27Var == null) {
            return;
        }
        long B0 = k27.B0(k27Var.k);
        int e1 = k27Var.e1();
        SharedPreferences.Editor edit = a.b.getSharedPreferences("media_saved_pos", 0).edit();
        if (hbcVar == null) {
            edit.remove(B0 + "_" + e1 + "q2");
        } else {
            String str2 = B0 + "_" + e1 + "q2";
            StringBuilder sb = new StringBuilder();
            sb.append(hbcVar.b);
            sb.append("x");
            sb.append(hbcVar.c);
            if (hbcVar.a) {
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
        y54 y54Var = this.d;
        if (y54Var != null) {
            y54Var.R(f);
        }
        y54 y54Var2 = this.e;
        if (y54Var2 != null) {
            y54Var2.R(f);
        }
    }

    public final void B0(do3 do3Var) {
        this.b = do3Var;
        y54 y54Var = this.d;
        if (do3Var != null) {
            y54Var.s0 = new ge2(do3Var, (byte) 7);
        } else {
            y54Var.s0 = null;
        }
    }

    @Override
    public final void F(j54 j54Var) {
        gl.c3(new l3c(this, j54Var, (byte) 16));
    }

    @Override
    public final void H(int r6, boolean r7) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lbc.H(int, boolean):void");
    }

    public final void I() {
        int i;
        int i2;
        vb3 vb3Var;
        int i3;
        HashMap hashMap = new HashMap();
        hashMap.put(uc8.c.a, 144179200);
        af0 af0Var = new af0();
        if (this.c) {
            i2 = 1000;
            i = 1000;
        } else {
            i = 2000;
            i2 = 100;
        }
        lb3.a(i2, 0, "bufferForPlaybackMs", "0");
        lb3.a(i, 0, "bufferForPlaybackAfterRebufferMs", "0");
        lb3.a(50000, i2, "minBufferMs", "bufferForPlaybackMs");
        lb3.a(50000, i, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
        lb3.a(50000, 50000, "maxBufferMs", "minBufferMs");
        lb3.a(0, 0, "backBufferDurationMs", "0");
        lb3 lb3Var = new lb3(af0Var, 50000, 50000, 50000, 50000, i2, i2, i, i, false, hashMap);
        if (this.d == null) {
            if (this.L != null) {
                vb3Var = new fbc(this, a.b);
            } else {
                vb3Var = new vb3(a.b);
            }
            vb3Var.c = true;
            k54 k54Var = new k54(a.b);
            gre.p(!k54Var.A);
            k54Var.c = new ob3(vb3Var, (byte) 3);
            sc3 sc3Var = this.f;
            gre.p(!k54Var.A);
            sc3Var.getClass();
            k54Var.e = new ob3(sc3Var, (byte) 2);
            k54Var.b(lb3Var);
            y54 a = k54Var.a();
            this.d = a;
            a.i0(new nz(3, 0, 1, 1, false, 0, true), false);
            l93 l93Var = this.d.s;
            l93Var.getClass();
            l93Var.f.a(this);
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
                        y54 y54Var = this.d;
                        y54Var.y1();
                        y54Var.Q(surfaceView.getHolder());
                    }
                }
            }
            this.d.V(this.x);
            y54 y54Var2 = this.d;
            if (this.W) {
                i3 = 2;
            } else {
                i3 = 0;
            }
            y54Var2.n0(i3);
        }
        if (this.y && this.e == null) {
            k54 k54Var2 = new k54(a.b);
            sc3 sc3Var2 = this.f;
            gre.p(!k54Var2.A);
            sc3Var2.getClass();
            k54Var2.e = new ob3(sc3Var2, (byte) 2);
            k54Var2.b(lb3Var);
            y54 a2 = k54Var2.a();
            this.e = a2;
            a2.i0(new nz(2, 0, 1, 1, false, 0, true), false);
            this.e.m.a(new b30(this, (byte) 4));
            this.e.V(this.x);
        }
    }

    public final long N() {
        y54 y54Var = this.d;
        if (y54Var != null) {
            if (this.w) {
                return y54Var.b0();
            }
            return y54Var.getDuration();
        }
        return 0L;
    }

    public final yg2 Q(String str, String str2, String str3) {
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
            wg2 wg2Var = new wg2(str5, this.R, concat);
            wg2Var.e = str2;
            wg2Var.f = str3;
            return new yg2(new xg2(wg2Var));
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.O;
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList2.get(i);
            i++;
            ArrayList arrayList3 = ((hbc) obj).d;
            int size2 = arrayList3.size();
            int i2 = 0;
            while (i2 < size2) {
                Object obj2 = arrayList3.get(i2);
                i2++;
                jbc jbcVar = (jbc) obj2;
                StringBuilder sb = new StringBuilder("/mtproto_");
                int i3 = size;
                sb.append(jbcVar.c);
                String sb2 = sb.toString();
                TLRPC.Document document = jbcVar.g;
                if (document != null) {
                    str4 = document.mime_type;
                } else {
                    str4 = null;
                }
                if (TextUtils.isEmpty(str4)) {
                    str4 = "video/mp4";
                }
                wg2 wg2Var2 = new wg2(str4, jbcVar.d, sb2);
                wg2Var2.e = str2;
                wg2Var2.f = str3;
                int i4 = jbcVar.i;
                int i5 = jbcVar.j;
                wg2Var2.a = i4;
                wg2Var2.b = i5;
                arrayList.add(new xg2(wg2Var2));
                size = i3;
            }
        }
        return new yg2(arrayList);
    }

    public final TLRPC.Document R() {
        ArrayList arrayList;
        y54 y54Var = this.d;
        if (y54Var != null) {
            y54Var.y1();
            fm4 fm4Var = y54Var.S;
            if (fm4Var != null && fm4Var.p != 0 && (arrayList = this.O) != null) {
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    ArrayList arrayList2 = ((hbc) obj).d;
                    int size2 = arrayList2.size();
                    int i2 = 0;
                    while (i2 < size2) {
                        Object obj2 = arrayList2.get(i2);
                        i2++;
                        jbc jbcVar = (jbc) obj2;
                        if (jbcVar.c == fm4Var.p) {
                            return jbcVar.g;
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
        y54 y54Var = this.d;
        if (y54Var != null) {
            return y54Var.m();
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
                y54 y54Var = this.d;
                if (y54Var != null) {
                    y54Var.y1();
                    fm4 fm4Var = y54Var.S;
                    if (fm4Var != null) {
                        for (int i2 = 0; i2 < Y(); i2++) {
                            hbc Z = Z(i2);
                            if (!Z.a && fm4Var.A == Z.b && fm4Var.B == Z.c && fm4Var.k == ((int) Math.floor(((jbc) Z.d.get(0)).l * 8.0d))) {
                                return i2;
                            }
                        }
                    }
                }
                return -1;
            } catch (Exception e) {
                fa4.g(e, true);
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
        y54 y54Var = this.d;
        if (y54Var != null) {
            return y54Var.getDuration();
        }
        return 0L;
    }

    public final e4b V(e4b e4bVar) {
        e4b e4bVar2 = e4bVar;
        if (e4bVar == null) {
            e4bVar2 = new Object();
        }
        try {
            y54 y54Var = this.d;
            y54Var.y1();
            MediaFormat mediaFormat = ((lk6) y54Var.g[0]).e0;
            ByteBuffer byteBuffer = mediaFormat.getByteBuffer("hdr-static-info");
            byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
            if (byteBuffer.get() == 0) {
                byteBuffer.getShort(17);
                byteBuffer.getShort(19);
            }
            if (Build.VERSION.SDK_INT >= 24) {
                if (mediaFormat.containsKey("color-transfer")) {
                    e4bVar2.b = mediaFormat.getInteger("color-transfer");
                }
                if (mediaFormat.containsKey("color-standard")) {
                    e4bVar2.a = mediaFormat.getInteger("color-standard");
                }
                if (mediaFormat.containsKey("color-range")) {
                    mediaFormat.getInteger("color-range");
                }
            }
        } catch (Exception unused) {
        }
        return e4bVar2;
    }

    public final hbc W(Boolean bool) {
        hbc hbcVar = null;
        for (int i = 0; i < Y(); i++) {
            hbc Z = Z(i);
            if (Z.a == bool.booleanValue() && (hbcVar == null || hbcVar.b * hbcVar.c < Z.b * Z.c)) {
                hbcVar = Z;
            }
        }
        return hbcVar;
    }

    public final int Y() {
        ArrayList arrayList = this.O;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    public final hbc Z(int i) {
        ArrayList arrayList = this.O;
        if (arrayList == null) {
            return W(Boolean.FALSE);
        }
        if (i >= 0 && i < arrayList.size()) {
            return (hbc) this.O.get(i);
        }
        return W(Boolean.FALSE);
    }

    @Override
    public final void a(icc iccVar) {
        if (!Objects.equals(iccVar, icc.d)) {
            this.K.onVideoSizeChanged(iccVar.a, iccVar.b, 0, iccVar.c);
        }
    }

    public final boolean c0() {
        if (!this.y || !this.J) {
            y54 y54Var = this.d;
            if (y54Var != null && y54Var.s()) {
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
            ArrayList arrayList3 = ((hbc) obj).d;
            int size2 = arrayList3.size();
            int i2 = 0;
            while (i2 < size2) {
                Object obj2 = arrayList3.get(i2);
                i2++;
                jbc jbcVar = (jbc) obj2;
                long j = jbcVar.c;
                Uri uri = jbcVar.d;
                ExtendedDefaultDataSourceFactory extendedDefaultDataSourceFactory = this.h;
                extendedDefaultDataSourceFactory.putDocumentUri(j, uri);
                extendedDefaultDataSourceFactory.putDocumentUri(jbcVar.e, jbcVar.f);
                if (jbcVar.f != null) {
                    this.Q.add(jbcVar);
                    StringBuilder sb2 = new StringBuilder("#EXT-X-STREAM-INF:BANDWIDTH=");
                    sb2.append((int) Math.floor(jbcVar.l * 8.0d));
                    sb2.append(",RESOLUTION=");
                    sb2.append(jbcVar.i);
                    sb2.append("x");
                    sb2.append(jbcVar.j);
                    String str2 = jbcVar.m;
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
                        ug8.z(",MIME=\"", str, "\"", sb2);
                    }
                    if (jbcVar.b() && jbcVar.c()) {
                        sb2.append(",CACHED=\"true\"");
                    }
                    sb2.append(",DOCID=\"");
                    sb2.append(jbcVar.c);
                    sb2.append("\",ACCOUNT=\"");
                    sb2.append(jbcVar.a);
                    sb2.append("\"\n");
                    if (jbcVar.c()) {
                        sb2.append(jbcVar.f);
                        sb2.append("\n\n");
                    } else {
                        sb2.append("mtproto:");
                        sb2.append(jbcVar.e);
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
        if (i == kk7.J4 && ((lbc) objArr[0]) != this && c0() && !this.E) {
            f0();
        }
    }

    public final qg0 e0(long j, Uri uri, String str) {
        boolean z;
        vq6 vq6Var;
        xq6 xq6Var;
        yq3 yq3Var;
        yq3 yq3Var2;
        uq6 uq6Var;
        final ExtendedDefaultDataSourceFactory extendedDefaultDataSourceFactory = this.h;
        qq6 qq6Var = new qq6();
        tq6 tq6Var = new tq6();
        List list = Collections.EMPTY_LIST;
        km5 km5Var = mm5.b;
        w59 w59Var = w59.e;
        vq6 vq6Var2 = new vq6();
        yq6 yq6Var = yq6.d;
        if (tq6Var.b != null && tq6Var.a == null) {
            z = false;
        } else {
            z = true;
        }
        gre.p(z);
        if (uri != null) {
            if (tq6Var.a != null) {
                uq6Var = new uq6(tq6Var);
            } else {
                uq6Var = null;
            }
            vq6Var = vq6Var2;
            xq6Var = new xq6(uri, null, uq6Var, null, list, null, w59Var, -9223372036854775807L);
        } else {
            vq6Var = vq6Var2;
            xq6Var = null;
        }
        br6 br6Var = new br6("", new rq6(qq6Var), xq6Var, new wq6(vq6Var), jr6.M, yq6Var);
        if (j != 0) {
            rz1 rz1Var = new rz1(this, j, (byte) 14);
            k88 k88Var = new k88(new ka3(), (byte) 14);
            Object obj = new Object();
            i2f i2fVar = new i2f((byte) 17);
            br6Var.b.getClass();
            br6Var.b.getClass();
            uq6 uq6Var2 = br6Var.b.c;
            if (uq6Var2 == null) {
                yq3Var2 = yq3.u;
            } else {
                synchronized (obj) {
                    if (!uq6Var2.equals(null)) {
                        yq3Var = mv6.v(uq6Var2);
                    } else {
                        yq3Var = null;
                    }
                    yq3Var.getClass();
                }
                yq3Var2 = yq3Var;
            }
            return new vs8(br6Var, rz1Var, k88Var, yq3Var2, i2fVar, 1048576, null);
        }
        str.getClass();
        if (!str.equals("hls")) {
            if (!str.equals("dash")) {
                us8 us8Var = this.a0;
                if (us8Var == null) {
                    us8Var = new us8(extendedDefaultDataSourceFactory, new ka3());
                    this.a0 = us8Var;
                }
                return us8Var.d(br6Var);
            }
            DashMediaSource$Factory dashMediaSource$Factory = this.Y;
            DashMediaSource$Factory dashMediaSource$Factory2 = dashMediaSource$Factory;
            if (dashMediaSource$Factory == null) {
                ?? r1 = new qx6(extendedDefaultDataSourceFactory) {
                    public final lv6 a;
                    public final m63 b;
                    public final mv6 c;
                    public final ie7 d;
                    public final i2f e;
                    public final short f;
                    public final int g;

                    {
                        lv6 lv6Var = new lv6(extendedDefaultDataSourceFactory);
                        this.a = lv6Var;
                        this.b = extendedDefaultDataSourceFactory;
                        this.c = new mv6();
                        this.e = new i2f((byte) 17);
                        this.f = (short) 30000;
                        this.g = 5000000;
                        this.d = new ie7((byte) 17);
                        ((e31) lv6Var.c).b = true;
                    }

                    @Override
                    public final qx6 a() {
                        ((e31) this.a.c).b = true;
                        return this;
                    }

                    @Override
                    public final qx6 b() {
                        Object obj2 = this.a.c;
                        return this;
                    }

                    @Override
                    public final qx6 c(eef eefVar) {
                        ((e31) this.a.c).c = eefVar;
                        return this;
                    }

                    @Override
                    public final qg0 d(br6 br6Var2) {
                        bv7 bv7Var;
                        br6Var2.b.getClass();
                        bv7 j53Var = new j53();
                        List list2 = br6Var2.b.e;
                        if (!list2.isEmpty()) {
                            bv7Var = new lv6(j53Var, list2, false, (byte) 27);
                        } else {
                            bv7Var = j53Var;
                        }
                        return new q53(br6Var2, this.b, bv7Var, this.a, this.d, this.c.F(br6Var2), this.e, this.f, this.g);
                    }
                };
                this.Y = r1;
                dashMediaSource$Factory2 = r1;
            }
            return dashMediaSource$Factory2.d(br6Var);
        }
        HlsMediaSource$Factory hlsMediaSource$Factory = this.Z;
        HlsMediaSource$Factory hlsMediaSource$Factory2 = hlsMediaSource$Factory;
        if (hlsMediaSource$Factory == null) {
            ?? r12 = new qx6(extendedDefaultDataSourceFactory) {
                public final l69 a;
                public pa3 b;
                public eef c;
                public final mv6 i = new mv6();
                public final ize f = new ize((byte) 17);
                public final k93 g = ta3.N;
                public final i2f j = new i2f((byte) 17);
                public final ie7 h = new ie7((byte) 17);
                public final boolean l = true;
                public final long m = -9223372036854775807L;
                public final boolean k = true;
                public byte e = 3;
                public boolean d = true;

                {
                    this.a = new l69(extendedDefaultDataSourceFactory, (byte) 27);
                }

                @Override
                public final qx6 a() {
                    this.d = true;
                    return this;
                }

                @Override
                public final qx6 b() {
                    this.e = (byte) 3;
                    return this;
                }

                @Override
                public final qx6 c(eef eefVar) {
                    this.c = eefVar;
                    return this;
                }

                @Override
                public final ef5 d(br6 br6Var2) {
                    br6Var2.b.getClass();
                    pa3 pa3Var = this.b;
                    pa3 pa3Var2 = pa3Var;
                    if (pa3Var == null) {
                        ?? obj2 = new Object();
                        obj2.c = new eef((byte) 17);
                        obj2.b = (byte) 3;
                        this.b = obj2;
                        pa3Var2 = obj2;
                    }
                    pa3 pa3Var3 = pa3Var2;
                    eef eefVar = this.c;
                    if (eefVar != null) {
                        pa3Var3.c = eefVar;
                    }
                    pa3Var3.a = this.d;
                    pa3Var3.b = this.e;
                    List list2 = br6Var2.b.e;
                    boolean isEmpty = list2.isEmpty();
                    lf5 lf5Var = this.f;
                    if (!isEmpty) {
                        lf5Var = new tg2(lf5Var, list2, (byte) 27);
                    }
                    yq3 F = this.i.F(br6Var2);
                    this.g.getClass();
                    l69 l69Var = this.a;
                    i2f i2fVar2 = this.j;
                    return new ef5(br6Var2, l69Var, pa3Var3, this.h, F, i2fVar2, new ta3(l69Var, i2fVar2, lf5Var), this.m, this.k, this.l ? 1 : 0);
                }
            };
            this.Z = r12;
            hlsMediaSource$Factory2 = r12;
        }
        return hlsMediaSource$Factory2.d(br6Var);
    }

    public void f0() {
        this.J = false;
        y54 y54Var = this.d;
        if (y54Var != null) {
            y54Var.V(false);
        }
        y54 y54Var2 = this.e;
        if (y54Var2 != null) {
            y54Var2.V(false);
        }
        if (this.L != null) {
            this.b0.removeCallbacksAndMessages(null);
            this.L.o(false, null);
        }
    }

    public void g0() {
        this.J = true;
        if (this.y && (!this.I || !this.H)) {
            y54 y54Var = this.d;
            if (y54Var != null) {
                y54Var.V(false);
            }
            y54 y54Var2 = this.e;
            if (y54Var2 != null) {
                y54Var2.V(false);
                return;
            }
            return;
        }
        y54 y54Var3 = this.d;
        if (y54Var3 != null) {
            y54Var3.V(true);
        }
        y54 y54Var4 = this.e;
        if (y54Var4 != null) {
            y54Var4.V(true);
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

    public final void j0(ArrayList arrayList, hbc hbcVar) {
        int i;
        ArrayList arrayList2;
        this.O = arrayList;
        this.P = hbcVar;
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
        if (hbcVar != null && (arrayList2 = this.O) != null) {
            i = arrayList2.indexOf(hbcVar);
        } else {
            i = -1;
        }
        this.e0 = i;
        v0(true, hbcVar);
        if (this.d0) {
            this.e0 = -1;
        }
    }

    public final void k0(Uri uri, String str, Uri uri2, String str2) {
        Uri uri3;
        String str3;
        zf6 zf6Var = null;
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
        zf6 zf6Var2 = null;
        for (int i = 0; i < 2; i++) {
            if (i == 0) {
                uri3 = uri;
                str3 = str;
            } else {
                uri3 = uri2;
                str3 = str2;
            }
            zf6 zf6Var3 = new zf6(e0(0L, uri3, str3));
            if (i == 0) {
                zf6Var = zf6Var3;
            } else {
                zf6Var2 = zf6Var3;
            }
        }
        this.d.n1(zf6Var, true);
        this.d.a();
        this.e.n1(zf6Var2, true);
        this.e.a();
        l0.add(Integer.valueOf(this.a));
    }

    public final void l0() {
        l0.remove(Integer.valueOf(this.a));
        y54 y54Var = this.d;
        if (y54Var != null) {
            y54Var.g1();
            this.d = null;
        }
        y54 y54Var2 = this.e;
        if (y54Var2 != null) {
            y54Var2.g1();
            this.e = null;
        }
        if (this.X) {
            kk7.e().n(this, kk7.J4);
        }
    }

    @Override
    public final void m(byb bybVar) {
        l68 l68Var = this.i0;
        if (l68Var != null) {
            gl.c3(l68Var);
        }
    }

    public void o0(long j) {
        p0(j, false);
    }

    @Override
    public final void onRenderedFirstFrame(tj tjVar) {
        this.h0 = -9223372036854775807L;
        this.g0 = -9223372036854775807L;
        ibc ibcVar = this.K;
        if (ibcVar != null) {
            ibcVar.onRenderedFirstFrame(tjVar);
        }
    }

    @Override
    public final void onSeekStarted(tj tjVar) {
        ibc ibcVar = this.K;
        if (ibcVar != null) {
            ibcVar.onSeekStarted(tjVar);
        }
    }

    public final void p0(long j, boolean z) {
        gv9 gv9Var;
        y54 y54Var = this.d;
        if (y54Var != null) {
            if (z) {
                gv9Var = gv9.d;
            } else {
                gv9Var = gv9.c;
            }
            y54Var.p1(gv9Var);
            this.d.k1(j);
        }
    }

    public final void q0(long j, boolean z, Runnable runnable) {
        gv9 gv9Var;
        if (this.d != null) {
            if (runnable != null) {
                this.j0.add(runnable);
            }
            y54 y54Var = this.d;
            if (z) {
                gv9Var = gv9.d;
            } else {
                gv9Var = gv9.c;
            }
            y54Var.p1(gv9Var);
            this.d.k1(j);
        }
    }

    public final void r0(boolean z) {
        int i;
        if (this.W != z) {
            this.W = z;
            y54 y54Var = this.d;
            if (y54Var != null) {
                if (z) {
                    i = 2;
                } else {
                    i = 0;
                }
                y54Var.n0(i);
            }
        }
    }

    public final void s0(boolean z) {
        float f;
        y54 y54Var = this.d;
        float f2 = 1.0f;
        if (y54Var != null) {
            if (z) {
                f = 0.0f;
            } else {
                f = 1.0f;
            }
            y54Var.R(f);
        }
        y54 y54Var2 = this.e;
        if (y54Var2 != null) {
            if (z) {
                f2 = 0.0f;
            }
            y54Var2.R(f2);
        }
    }

    public void t0(boolean z) {
        this.J = z;
        if (z && this.y && (!this.I || !this.H)) {
            y54 y54Var = this.d;
            if (y54Var != null) {
                y54Var.V(false);
            }
            y54 y54Var2 = this.e;
            if (y54Var2 != null) {
                y54Var2.V(false);
                return;
            }
            return;
        }
        this.x = z;
        y54 y54Var3 = this.d;
        if (y54Var3 != null) {
            y54Var3.V(z);
        }
        y54 y54Var4 = this.e;
        if (y54Var4 != null) {
            y54Var4.V(z);
        }
    }

    public void u0(float f) {
        try {
            y54 y54Var = this.d;
            if (y54Var != null) {
                float f2 = 1.0f;
                if (f > 1.0f) {
                    f2 = 0.98f;
                }
                y54Var.b(new zb8(f, f2));
            }
        } catch (Exception unused) {
        }
    }

    public final void v0(boolean r21, defpackage.hbc r22) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lbc.v0(boolean, hbc):void");
    }

    public final void w0(int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        y54 y54Var = this.d;
        if (y54Var != null) {
            if (i == 0) {
                i4 = 2;
                i5 = 1;
            } else {
                i4 = 1;
                i5 = 3;
            }
            y54Var.i0(new nz(i5, 0, i4, 1, false, 0, true), false);
        }
        y54 y54Var2 = this.e;
        if (y54Var2 != null) {
            if (i == 0) {
                i3 = 2;
                i2 = 1;
            } else {
                i2 = 2;
                i3 = 1;
            }
            y54Var2.i0(new nz(i2, 0, i3, 1, false, 0, true), true);
        }
    }

    public final void x0(Surface surface) {
        if (this.s != surface) {
            this.s = surface;
            y54 y54Var = this.d;
            if (y54Var == null) {
                return;
            }
            y54Var.r1(surface);
        }
    }

    @Override
    public final void y(tj tjVar, int i) {
        if (i == 1) {
            ibc ibcVar = this.K;
            if (ibcVar != null) {
                ibcVar.onSeekFinished(tjVar);
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
            y54 y54Var = this.d;
            if (y54Var == null) {
                return;
            }
            y54Var.y1();
            if (surfaceView == null) {
                holder = null;
            } else {
                holder = surfaceView.getHolder();
            }
            y54Var.Q(holder);
        }
    }

    @Override
    public final void z(eyb eybVar) {
        l68 l68Var = this.i0;
        if (l68Var != null) {
            gl.c3(l68Var);
        }
    }

    public final void z0(TextureView textureView) {
        if (this.n != textureView) {
            this.n = textureView;
            y54 y54Var = this.d;
            if (y54Var == null) {
                return;
            }
            y54Var.s1(textureView);
        }
    }

    @Override
    public void onRenderedFirstFrame() {
        this.K.onRenderedFirstFrame();
    }

    @Override
    public final void B(jr6 jr6Var) {
    }

    @Override
    public final void C(jr6 jr6Var) {
    }

    @Override
    public final void E(j54 j54Var) {
    }

    @Override
    public final void G(w59 w59Var) {
    }

    @Override
    public final void J(zb8 zb8Var) {
    }

    @Override
    public final void K(kc8 kc8Var) {
    }

    @Override
    public final void L(ld7 ld7Var) {
    }

    @Override
    public final void P(boolean z) {
    }

    @Override
    public final void b(int i) {
    }

    @Override
    public final void c(lc8 lc8Var) {
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
    public final void i(fr6 fr6Var) {
    }

    @Override
    public final void j(w83 w83Var) {
    }

    @Override
    public final void l(nz nzVar) {
    }

    @Override
    public final void o(boolean z) {
    }

    @Override
    public final void q(float f) {
    }

    @Override
    public final void s(icc iccVar) {
    }

    @Override
    public final void t(int i) {
    }

    @Override
    public final void u(j54 j54Var) {
    }

    @Override
    public final void v(boolean z) {
    }

    @Override
    public final void x(v33 v33Var) {
    }

    @Override
    public final void D(aob aobVar, int i) {
    }

    @Override
    public final void M(int i, int i2) {
    }

    @Override
    public final void k(y54 y54Var, lv6 lv6Var) {
    }

    @Override
    public final void p(int i, boolean z) {
    }

    @Override
    public final void r(int i, br6 br6Var) {
    }

    @Override
    public final void w(tj tjVar, fr6 fr6Var) {
    }

    @Override
    public final void A(int i, nc8 nc8Var, nc8 nc8Var2) {
    }

    @Override
    public final void n(tj tjVar, int i, long j) {
    }

    public lbc() {
        this(true, false);
    }
}
