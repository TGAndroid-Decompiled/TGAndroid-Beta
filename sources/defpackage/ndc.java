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
public class ndc implements pe8, fdc, uk, jm7 {
    public static int k0;
    public static final HashSet l0 = new HashSet();
    public static HashMap m0;
    public boolean E;
    public boolean F;
    public Uri G;
    public boolean H;
    public boolean I;
    public boolean J;
    public ldc K;
    public hdc L;
    public int M;
    public boolean N;
    public ArrayList O;
    public kdc P;
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
    public vu8 a0;
    public np3 b;
    public final Handler b0;
    public boolean c;
    public final boolean c0;
    public h74 d;
    public boolean d0;
    public h74 e;
    public int e0;
    public final fe3 f;
    public boolean f0;
    public long g0;
    public final ExtendedDefaultDataSourceFactory h;
    public long h0;
    public n88 i0;
    public final ArrayList j0;
    public TextureView n;
    public SurfaceView r;
    public Surface s;
    public boolean w;
    public boolean x;
    public boolean y;

    public ndc(boolean z, boolean z2) {
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
        fe3 fe3Var = new fe3(a.b, new q7f((byte) 13));
        this.f = fe3Var;
        if (z2) {
            ae3 ae3Var = fe3Var.f;
            ae3Var.getClass();
            zd3 zd3Var = new zd3(ae3Var);
            zd3Var.I.add(1);
            fe3Var.m(new ae3(zd3Var));
        }
        this.M = 1;
        this.X = z;
        if (z) {
            nm7.e().a(this, nm7.L4);
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
                        fc4.g(e, true);
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
            if (!oc7.d1().getBoolean("unsupport_".concat(concat), false)) {
                int codecCount = MediaCodecList.getCodecCount();
                for (int i = 0; i < codecCount; i++) {
                    MediaCodecInfo codecInfoAt = MediaCodecList.getCodecInfoAt(i);
                    if (!codecInfoAt.isEncoder() && tm6.i(codecInfoAt, concat)) {
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

    public static mdc O(ArrayList arrayList) {
        if (arrayList != null) {
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                ArrayList arrayList2 = ((kdc) obj).d;
                int size2 = arrayList2.size();
                int i2 = 0;
                while (i2 < size2) {
                    Object obj2 = arrayList2.get(i2);
                    i2++;
                    mdc mdcVar = (mdc) obj2;
                    if (mdcVar.b()) {
                        return mdcVar;
                    }
                }
            }
            return null;
        }
        return null;
    }

    public static ArrayList X(int i, TLRPC.Document document, ArrayList arrayList, int i2, boolean z) {
        kdc kdcVar;
        String str;
        ArrayList arrayList2 = new ArrayList();
        if (document != null) {
            arrayList2.add(document);
        }
        if (!oc7.r1(i).l4.S2.f && arrayList != null) {
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
                    fc4.g(e, true);
                }
            }
            i3++;
        }
        ArrayList arrayList3 = new ArrayList();
        for (int i4 = 0; i4 < arrayList2.size(); i4++) {
            try {
                TLRPC.Document document3 = (TLRPC.Document) arrayList2.get(i4);
                if (!"application/x-mpegurl".equalsIgnoreCase(document3.mime_type) && !"application/x-tgstoryboard".equalsIgnoreCase(document3.mime_type) && !"application/x-tgstoryboardmap".equalsIgnoreCase(document3.mime_type)) {
                    mdc d = mdc.d(i, document3, (TLRPC.Document) longSparseArray.get(document3.id), i2, z);
                    if (d.i > 0 && d.j > 0) {
                        if (document3 == document) {
                            d.b = true;
                        }
                        arrayList3.add(d);
                    }
                }
            } catch (Exception e2) {
                fc4.g(e2, true);
            }
        }
        ArrayList arrayList4 = new ArrayList();
        for (int i5 = 0; i5 < arrayList3.size(); i5++) {
            mdc mdcVar = (mdc) arrayList3.get(i5);
            String str2 = mdcVar.m;
            if (str2 == null || ((!"av1".equals(str2) && !"av01".equals(mdcVar.m) && !"hevc".equals(mdcVar.m) && !"h265".equals(mdcVar.m) && !"vp9".equals(mdcVar.m)) || C0(mdcVar.m))) {
                arrayList4.add(mdcVar);
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
            mdc mdcVar2 = (mdc) obj;
            if (mdcVar2.b) {
                arrayList6.add(new kdc(mdcVar2));
            } else {
                int size2 = arrayList6.size();
                int i7 = 0;
                while (true) {
                    if (i7 < size2) {
                        Object obj2 = arrayList6.get(i7);
                        i7++;
                        kdcVar = (kdc) obj2;
                        if (!kdcVar.a && kdcVar.b == mdcVar2.i && kdcVar.c == mdcVar2.j) {
                            break;
                        }
                    } else {
                        kdcVar = null;
                        break;
                    }
                }
                if (kdcVar != null && !gda.N0) {
                    kdcVar.d.add(mdcVar2);
                } else {
                    arrayList6.add(new kdc(mdcVar2));
                }
            }
        }
        return arrayList6;
    }

    public static mdc a0(ArrayList arrayList) {
        int i;
        int i2;
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            ArrayList arrayList2 = ((kdc) obj).d;
            int size2 = arrayList2.size();
            int i4 = 0;
            while (i4 < size2) {
                Object obj2 = arrayList2.get(i4);
                i4++;
                mdc mdcVar = (mdc) obj2;
                if (mdcVar.b && mdcVar.b()) {
                    return mdcVar;
                }
            }
        }
        int size3 = arrayList.size();
        mdc mdcVar2 = null;
        int i5 = 0;
        while (i5 < size3) {
            Object obj3 = arrayList.get(i5);
            i5++;
            ArrayList arrayList3 = ((kdc) obj3).d;
            int size4 = arrayList3.size();
            int i6 = 0;
            while (i6 < size4) {
                Object obj4 = arrayList3.get(i6);
                i6++;
                mdc mdcVar3 = (mdc) obj4;
                if (!mdcVar3.b && C0(mdcVar3.m) && (mdcVar2 == null || (i = mdcVar3.i * mdcVar3.j) > (i2 = mdcVar2.i * mdcVar2.j) || (i == i2 && mdcVar3.l < mdcVar2.l))) {
                    mdcVar2 = mdcVar3;
                }
            }
        }
        if (mdcVar2 == null) {
            int size5 = arrayList.size();
            int i7 = 0;
            while (i7 < size5) {
                Object obj5 = arrayList.get(i7);
                i7++;
                ArrayList arrayList4 = ((kdc) obj5).d;
                int size6 = arrayList4.size();
                int i8 = 0;
                while (i8 < size6) {
                    Object obj6 = arrayList4.get(i8);
                    i8++;
                    mdc mdcVar4 = (mdc) obj6;
                    if (mdcVar2 == null || mdcVar2.i * mdcVar2.j > mdcVar4.i * mdcVar4.j || mdcVar4.l < mdcVar2.l) {
                        mdcVar2 = mdcVar4;
                    }
                }
            }
        }
        return mdcVar2;
    }

    public static mdc b0(ArrayList arrayList) {
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ArrayList arrayList2 = ((kdc) obj).d;
            int size2 = arrayList2.size();
            int i2 = 0;
            while (i2 < size2) {
                Object obj2 = arrayList2.get(i2);
                i2++;
                mdc mdcVar = (mdc) obj2;
                if (mdcVar.b()) {
                    return mdcVar;
                }
            }
        }
        int size3 = arrayList.size();
        mdc mdcVar2 = null;
        int i3 = 0;
        while (i3 < size3) {
            Object obj3 = arrayList.get(i3);
            i3++;
            ArrayList arrayList3 = ((kdc) obj3).d;
            int size4 = arrayList3.size();
            int i4 = 0;
            while (i4 < size4) {
                Object obj4 = arrayList3.get(i4);
                i4++;
                mdc mdcVar3 = (mdc) obj4;
                if (!mdcVar3.b && (mdcVar2 == null || mdcVar2.i * mdcVar2.j > mdcVar3.i * mdcVar3.j || mdcVar3.l < mdcVar2.l)) {
                    if (mdcVar3.i <= 900 && mdcVar3.j <= 900) {
                        mdcVar2 = mdcVar3;
                    }
                }
            }
        }
        if (mdcVar2 == null) {
            int size5 = arrayList.size();
            int i5 = 0;
            while (i5 < size5) {
                Object obj5 = arrayList.get(i5);
                i5++;
                ArrayList arrayList4 = ((kdc) obj5).d;
                int size6 = arrayList4.size();
                int i6 = 0;
                while (i6 < size6) {
                    Object obj6 = arrayList4.get(i6);
                    i6++;
                    mdc mdcVar4 = (mdc) obj6;
                    if (mdcVar2 == null || mdcVar2.i * mdcVar2.j > mdcVar4.i * mdcVar4.j || mdcVar4.l < mdcVar2.l) {
                        mdcVar2 = mdcVar4;
                    }
                }
            }
        }
        return mdcVar2;
    }

    public static void m0(k47 k47Var, boolean z) {
        if (k47Var == null) {
            return;
        }
        SharedPreferences sharedPreferences = a.b.getSharedPreferences("media_saved_pos", 0);
        sharedPreferences.edit().putBoolean(k47.B0(k47Var.k) + "_" + k47Var.e1() + "loop", z).apply();
    }

    public static void n0(kdc kdcVar, k47 k47Var) {
        String str;
        if (k47Var == null) {
            return;
        }
        long B0 = k47.B0(k47Var.k);
        int e1 = k47Var.e1();
        SharedPreferences.Editor edit = a.b.getSharedPreferences("media_saved_pos", 0).edit();
        if (kdcVar == null) {
            edit.remove(B0 + "_" + e1 + "q2");
        } else {
            String str2 = B0 + "_" + e1 + "q2";
            StringBuilder sb = new StringBuilder();
            sb.append(kdcVar.b);
            sb.append("x");
            sb.append(kdcVar.c);
            if (kdcVar.a) {
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
        h74 h74Var = this.d;
        if (h74Var != null) {
            h74Var.R(f);
        }
        h74 h74Var2 = this.e;
        if (h74Var2 != null) {
            h74Var2.R(f);
        }
    }

    public final void B0(np3 np3Var) {
        this.b = np3Var;
        h74 h74Var = this.d;
        if (np3Var != null) {
            h74Var.s0 = new rf2(np3Var, (byte) 7);
        } else {
            h74Var.s0 = null;
        }
    }

    @Override
    public final void F(u64 u64Var) {
        gm.c3(new x4c(this, u64Var, (byte) 18));
    }

    @Override
    public final void H(int r6, boolean r7) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ndc.H(int, boolean):void");
    }

    public final void I() {
        int i;
        int i2;
        hd3 hd3Var;
        int i3;
        HashMap hashMap = new HashMap();
        hashMap.put(we8.c.a, 144179200);
        ag0 ag0Var = new ag0();
        if (this.c) {
            i2 = 1000;
            i = 1000;
        } else {
            i = 2000;
            i2 = 100;
        }
        xc3.a(i2, 0, "bufferForPlaybackMs", "0");
        xc3.a(i, 0, "bufferForPlaybackAfterRebufferMs", "0");
        xc3.a(50000, i2, "minBufferMs", "bufferForPlaybackMs");
        xc3.a(50000, i, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
        xc3.a(50000, 50000, "maxBufferMs", "minBufferMs");
        xc3.a(0, 0, "backBufferDurationMs", "0");
        xc3 xc3Var = new xc3(ag0Var, 50000, 50000, 50000, 50000, i2, i2, i, i, false, hashMap);
        if (this.d == null) {
            if (this.L != null) {
                hd3Var = new idc(this, a.b);
            } else {
                hd3Var = new hd3(a.b);
            }
            hd3Var.c = true;
            v64 v64Var = new v64(a.b);
            jte.p(!v64Var.A);
            v64Var.c = new ad3(hd3Var, (byte) 3);
            fe3 fe3Var = this.f;
            jte.p(!v64Var.A);
            fe3Var.getClass();
            v64Var.e = new ad3(fe3Var, (byte) 2);
            v64Var.b(xc3Var);
            h74 a = v64Var.a();
            this.d = a;
            a.i0(new o00(3, 0, 1, 1, false, 0, true), false);
            xa3 xa3Var = this.d.s;
            xa3Var.getClass();
            xa3Var.f.a(this);
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
                        h74 h74Var = this.d;
                        h74Var.y1();
                        h74Var.Q(surfaceView.getHolder());
                    }
                }
            }
            this.d.V(this.x);
            h74 h74Var2 = this.d;
            if (this.W) {
                i3 = 2;
            } else {
                i3 = 0;
            }
            h74Var2.n0(i3);
        }
        if (this.y && this.e == null) {
            v64 v64Var2 = new v64(a.b);
            fe3 fe3Var2 = this.f;
            jte.p(!v64Var2.A);
            fe3Var2.getClass();
            v64Var2.e = new ad3(fe3Var2, (byte) 2);
            v64Var2.b(xc3Var);
            h74 a2 = v64Var2.a();
            this.e = a2;
            a2.i0(new o00(2, 0, 1, 1, false, 0, true), false);
            this.e.m.a(new b40(this, (byte) 4));
            this.e.V(this.x);
        }
    }

    public final long N() {
        h74 h74Var = this.d;
        if (h74Var != null) {
            if (this.w) {
                return h74Var.b0();
            }
            return h74Var.getDuration();
        }
        return 0L;
    }

    public final mi2 Q(String str, String str2, String str3) {
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
            ki2 ki2Var = new ki2(str5, this.R, concat);
            ki2Var.e = str2;
            ki2Var.f = str3;
            return new mi2(new li2(ki2Var));
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.O;
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList2.get(i);
            i++;
            ArrayList arrayList3 = ((kdc) obj).d;
            int size2 = arrayList3.size();
            int i2 = 0;
            while (i2 < size2) {
                Object obj2 = arrayList3.get(i2);
                i2++;
                mdc mdcVar = (mdc) obj2;
                StringBuilder sb = new StringBuilder("/mtproto_");
                int i3 = size;
                sb.append(mdcVar.c);
                String sb2 = sb.toString();
                TLRPC.Document document = mdcVar.g;
                if (document != null) {
                    str4 = document.mime_type;
                } else {
                    str4 = null;
                }
                if (TextUtils.isEmpty(str4)) {
                    str4 = "video/mp4";
                }
                ki2 ki2Var2 = new ki2(str4, mdcVar.d, sb2);
                ki2Var2.e = str2;
                ki2Var2.f = str3;
                int i4 = mdcVar.i;
                int i5 = mdcVar.j;
                ki2Var2.a = i4;
                ki2Var2.b = i5;
                arrayList.add(new li2(ki2Var2));
                size = i3;
            }
        }
        return new mi2(arrayList);
    }

    public final TLRPC.Document R() {
        ArrayList arrayList;
        h74 h74Var = this.d;
        if (h74Var != null) {
            h74Var.y1();
            go4 go4Var = h74Var.S;
            if (go4Var != null && go4Var.p != 0 && (arrayList = this.O) != null) {
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    ArrayList arrayList2 = ((kdc) obj).d;
                    int size2 = arrayList2.size();
                    int i2 = 0;
                    while (i2 < size2) {
                        Object obj2 = arrayList2.get(i2);
                        i2++;
                        mdc mdcVar = (mdc) obj2;
                        if (mdcVar.c == go4Var.p) {
                            return mdcVar.g;
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
        h74 h74Var = this.d;
        if (h74Var != null) {
            return h74Var.k();
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
                h74 h74Var = this.d;
                if (h74Var != null) {
                    h74Var.y1();
                    go4 go4Var = h74Var.S;
                    if (go4Var != null) {
                        for (int i2 = 0; i2 < Y(); i2++) {
                            kdc Z = Z(i2);
                            if (!Z.a && go4Var.A == Z.b && go4Var.B == Z.c && go4Var.k == ((int) Math.floor(((mdc) Z.d.get(0)).l * 8.0d))) {
                                return i2;
                            }
                        }
                    }
                }
                return -1;
            } catch (Exception e) {
                fc4.g(e, true);
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
        h74 h74Var = this.d;
        if (h74Var != null) {
            return h74Var.getDuration();
        }
        return 0L;
    }

    public final f6b V(f6b f6bVar) {
        f6b f6bVar2 = f6bVar;
        if (f6bVar == null) {
            f6bVar2 = new Object();
        }
        try {
            h74 h74Var = this.d;
            h74Var.y1();
            MediaFormat mediaFormat = ((om6) h74Var.g[0]).e0;
            ByteBuffer byteBuffer = mediaFormat.getByteBuffer("hdr-static-info");
            byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
            if (byteBuffer.get() == 0) {
                byteBuffer.getShort(17);
                byteBuffer.getShort(19);
            }
            if (Build.VERSION.SDK_INT >= 24) {
                if (mediaFormat.containsKey("color-transfer")) {
                    f6bVar2.b = mediaFormat.getInteger("color-transfer");
                }
                if (mediaFormat.containsKey("color-standard")) {
                    f6bVar2.a = mediaFormat.getInteger("color-standard");
                }
                if (mediaFormat.containsKey("color-range")) {
                    mediaFormat.getInteger("color-range");
                }
            }
        } catch (Exception unused) {
        }
        return f6bVar2;
    }

    public final kdc W(Boolean bool) {
        kdc kdcVar = null;
        for (int i = 0; i < Y(); i++) {
            kdc Z = Z(i);
            if (Z.a == bool.booleanValue() && (kdcVar == null || kdcVar.b * kdcVar.c < Z.b * Z.c)) {
                kdcVar = Z;
            }
        }
        return kdcVar;
    }

    public final int Y() {
        ArrayList arrayList = this.O;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    public final kdc Z(int i) {
        ArrayList arrayList = this.O;
        if (arrayList == null) {
            return W(Boolean.FALSE);
        }
        if (i >= 0 && i < arrayList.size()) {
            return (kdc) this.O.get(i);
        }
        return W(Boolean.FALSE);
    }

    @Override
    public final void a(jec jecVar) {
        if (!Objects.equals(jecVar, jec.d)) {
            this.K.onVideoSizeChanged(jecVar.a, jecVar.b, 0, jecVar.c);
        }
    }

    public final boolean c0() {
        if (!this.y || !this.J) {
            h74 h74Var = this.d;
            if (h74Var != null && h74Var.s()) {
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
            ArrayList arrayList3 = ((kdc) obj).d;
            int size2 = arrayList3.size();
            int i2 = 0;
            while (i2 < size2) {
                Object obj2 = arrayList3.get(i2);
                i2++;
                mdc mdcVar = (mdc) obj2;
                long j = mdcVar.c;
                Uri uri = mdcVar.d;
                ExtendedDefaultDataSourceFactory extendedDefaultDataSourceFactory = this.h;
                extendedDefaultDataSourceFactory.putDocumentUri(j, uri);
                extendedDefaultDataSourceFactory.putDocumentUri(mdcVar.e, mdcVar.f);
                if (mdcVar.f != null) {
                    this.Q.add(mdcVar);
                    StringBuilder sb2 = new StringBuilder("#EXT-X-STREAM-INF:BANDWIDTH=");
                    sb2.append((int) Math.floor(mdcVar.l * 8.0d));
                    sb2.append(",RESOLUTION=");
                    sb2.append(mdcVar.i);
                    sb2.append("x");
                    sb2.append(mdcVar.j);
                    String str2 = mdcVar.m;
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
                        wi8.z(",MIME=\"", str, "\"", sb2);
                    }
                    if (mdcVar.b() && mdcVar.c()) {
                        sb2.append(",CACHED=\"true\"");
                    }
                    sb2.append(",DOCID=\"");
                    sb2.append(mdcVar.c);
                    sb2.append("\",ACCOUNT=\"");
                    sb2.append(mdcVar.a);
                    sb2.append("\"\n");
                    if (mdcVar.c()) {
                        sb2.append(mdcVar.f);
                        sb2.append("\n\n");
                    } else {
                        sb2.append("mtproto:");
                        sb2.append(mdcVar.e);
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
        if (i == nm7.L4 && ((ndc) objArr[0]) != this && c0() && !this.E) {
            f0();
        }
    }

    public final rh0 e0(long j, Uri uri, String str) {
        boolean z;
        vs6 vs6Var;
        xs6 xs6Var;
        is3 is3Var;
        is3 is3Var2;
        us6 us6Var;
        final ExtendedDefaultDataSourceFactory extendedDefaultDataSourceFactory = this.h;
        qs6 qs6Var = new qs6();
        ts6 ts6Var = new ts6();
        List list = Collections.EMPTY_LIST;
        ko5 ko5Var = mo5.b;
        y79 y79Var = y79.e;
        vs6 vs6Var2 = new vs6();
        ys6 ys6Var = ys6.d;
        if (ts6Var.b != null && ts6Var.a == null) {
            z = false;
        } else {
            z = true;
        }
        jte.p(z);
        if (uri != null) {
            if (ts6Var.a != null) {
                us6Var = new us6(ts6Var);
            } else {
                us6Var = null;
            }
            vs6Var = vs6Var2;
            xs6Var = new xs6(uri, null, us6Var, null, list, null, y79Var, -9223372036854775807L);
        } else {
            vs6Var = vs6Var2;
            xs6Var = null;
        }
        bt6 bt6Var = new bt6("", new rs6(qs6Var), xs6Var, new ws6(vs6Var), jt6.M, ys6Var);
        if (j != 0) {
            d12 d12Var = new d12(this, j, (byte) 14);
            h68 h68Var = new h68(new wb3(), (byte) 18);
            Object obj = new Object();
            k4f k4fVar = new k4f((byte) 17);
            bt6Var.b.getClass();
            bt6Var.b.getClass();
            us6 us6Var2 = bt6Var.b.c;
            if (us6Var2 == null) {
                is3Var2 = is3.u;
            } else {
                synchronized (obj) {
                    if (!us6Var2.equals(null)) {
                        is3Var = mx6.y(us6Var2);
                    } else {
                        is3Var = null;
                    }
                    is3Var.getClass();
                }
                is3Var2 = is3Var;
            }
            return new wu8(bt6Var, d12Var, h68Var, is3Var2, k4fVar, 1048576, null);
        }
        str.getClass();
        if (!str.equals("hls")) {
            if (!str.equals("dash")) {
                vu8 vu8Var = this.a0;
                if (vu8Var == null) {
                    vu8Var = new vu8(extendedDefaultDataSourceFactory, new wb3());
                    this.a0 = vu8Var;
                }
                return vu8Var.d(bt6Var);
            }
            DashMediaSource$Factory dashMediaSource$Factory = this.Y;
            DashMediaSource$Factory dashMediaSource$Factory2 = dashMediaSource$Factory;
            if (dashMediaSource$Factory == null) {
                ?? r1 = new qz6(extendedDefaultDataSourceFactory) {
                    public final hi2 a;
                    public final y73 b;
                    public final mx6 c;
                    public final kg7 d;
                    public final k4f e;
                    public final short f;
                    public final int g;

                    {
                        hi2 hi2Var = new hi2(extendedDefaultDataSourceFactory);
                        this.a = hi2Var;
                        this.b = extendedDefaultDataSourceFactory;
                        this.c = new mx6();
                        this.e = new k4f((byte) 17);
                        this.f = (short) 30000;
                        this.g = 5000000;
                        this.d = new kg7((byte) 17);
                        ((m41) hi2Var.c).b = true;
                    }

                    @Override
                    public final qz6 a() {
                        ((m41) this.a.c).b = true;
                        return this;
                    }

                    @Override
                    public final qz6 b() {
                        Object obj2 = this.a.c;
                        return this;
                    }

                    @Override
                    public final qz6 c(fgf fgfVar) {
                        ((m41) this.a.c).c = fgfVar;
                        return this;
                    }

                    @Override
                    public final rh0 d(bt6 bt6Var2) {
                        cx7 cx7Var;
                        bt6Var2.b.getClass();
                        cx7 v63Var = new v63();
                        List list2 = bt6Var2.b.e;
                        if (!list2.isEmpty()) {
                            cx7Var = new lx6(v63Var, list2, (byte) 27);
                        } else {
                            cx7Var = v63Var;
                        }
                        return new c73(bt6Var2, this.b, cx7Var, this.a, this.d, this.c.G(bt6Var2), this.e, this.f, this.g);
                    }
                };
                this.Y = r1;
                dashMediaSource$Factory2 = r1;
            }
            return dashMediaSource$Factory2.d(bt6Var);
        }
        HlsMediaSource$Factory hlsMediaSource$Factory = this.Z;
        HlsMediaSource$Factory hlsMediaSource$Factory2 = hlsMediaSource$Factory;
        if (hlsMediaSource$Factory == null) {
            ?? r12 = new qz6(extendedDefaultDataSourceFactory) {
                public final k6d a;
                public bc3 b;
                public fgf c;
                public final mx6 i = new mx6();
                public final k1f f = new k1f((byte) 17);
                public final wa3 g = fc3.N;
                public final k4f j = new k4f((byte) 17);
                public final kg7 h = new kg7((byte) 17);
                public final boolean l = true;
                public final long m = -9223372036854775807L;
                public final boolean k = true;
                public byte e = 3;
                public boolean d = true;

                {
                    this.a = new k6d(extendedDefaultDataSourceFactory, (byte) 26);
                }

                @Override
                public final qz6 a() {
                    this.d = true;
                    return this;
                }

                @Override
                public final qz6 b() {
                    this.e = (byte) 3;
                    return this;
                }

                @Override
                public final qz6 c(fgf fgfVar) {
                    this.c = fgfVar;
                    return this;
                }

                @Override
                public final dh5 d(bt6 bt6Var2) {
                    bt6Var2.b.getClass();
                    bc3 bc3Var = this.b;
                    bc3 bc3Var2 = bc3Var;
                    if (bc3Var == null) {
                        ?? obj2 = new Object();
                        obj2.c = new fgf((byte) 17);
                        obj2.b = (byte) 3;
                        this.b = obj2;
                        bc3Var2 = obj2;
                    }
                    bc3 bc3Var3 = bc3Var2;
                    fgf fgfVar = this.c;
                    if (fgfVar != null) {
                        bc3Var3.c = fgfVar;
                    }
                    bc3Var3.a = this.d;
                    bc3Var3.b = this.e;
                    List list2 = bt6Var2.b.e;
                    boolean isEmpty = list2.isEmpty();
                    kh5 kh5Var = this.f;
                    if (!isEmpty) {
                        kh5Var = new hi2(kh5Var, list2, (byte) 29);
                    }
                    is3 G = this.i.G(bt6Var2);
                    this.g.getClass();
                    k6d k6dVar = this.a;
                    k4f k4fVar2 = this.j;
                    return new dh5(bt6Var2, k6dVar, bc3Var3, this.h, G, k4fVar2, new fc3(k6dVar, k4fVar2, kh5Var), this.m, this.k, this.l ? 1 : 0);
                }
            };
            this.Z = r12;
            hlsMediaSource$Factory2 = r12;
        }
        return hlsMediaSource$Factory2.d(bt6Var);
    }

    public void f0() {
        this.J = false;
        h74 h74Var = this.d;
        if (h74Var != null) {
            h74Var.V(false);
        }
        h74 h74Var2 = this.e;
        if (h74Var2 != null) {
            h74Var2.V(false);
        }
        if (this.L != null) {
            this.b0.removeCallbacksAndMessages(null);
            this.L.s(false, null);
        }
    }

    public void g0() {
        this.J = true;
        if (this.y && (!this.I || !this.H)) {
            h74 h74Var = this.d;
            if (h74Var != null) {
                h74Var.V(false);
            }
            h74 h74Var2 = this.e;
            if (h74Var2 != null) {
                h74Var2.V(false);
                return;
            }
            return;
        }
        h74 h74Var3 = this.d;
        if (h74Var3 != null) {
            h74Var3.V(true);
        }
        h74 h74Var4 = this.e;
        if (h74Var4 != null) {
            h74Var4.V(true);
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

    public final void j0(ArrayList arrayList, kdc kdcVar) {
        int i;
        ArrayList arrayList2;
        this.O = arrayList;
        this.P = kdcVar;
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
        if (kdcVar != null && (arrayList2 = this.O) != null) {
            i = arrayList2.indexOf(kdcVar);
        } else {
            i = -1;
        }
        this.e0 = i;
        v0(true, kdcVar);
        if (this.d0) {
            this.e0 = -1;
        }
    }

    public final void k0(Uri uri, String str, Uri uri2, String str2) {
        Uri uri3;
        String str3;
        zh6 zh6Var = null;
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
        zh6 zh6Var2 = null;
        for (int i = 0; i < 2; i++) {
            if (i == 0) {
                uri3 = uri;
                str3 = str;
            } else {
                uri3 = uri2;
                str3 = str2;
            }
            zh6 zh6Var3 = new zh6(e0(0L, uri3, str3));
            if (i == 0) {
                zh6Var = zh6Var3;
            } else {
                zh6Var2 = zh6Var3;
            }
        }
        this.d.n1(zh6Var, true);
        this.d.a();
        this.e.n1(zh6Var2, true);
        this.e.a();
        l0.add(Integer.valueOf(this.a));
    }

    public final void l0() {
        l0.remove(Integer.valueOf(this.a));
        h74 h74Var = this.d;
        if (h74Var != null) {
            h74Var.g1();
            this.d = null;
        }
        h74 h74Var2 = this.e;
        if (h74Var2 != null) {
            h74Var2.g1();
            this.e = null;
        }
        if (this.X) {
            nm7.e().n(this, nm7.L4);
        }
    }

    @Override
    public final void m(d0c d0cVar) {
        n88 n88Var = this.i0;
        if (n88Var != null) {
            gm.c3(n88Var);
        }
    }

    public void o0(long j) {
        p0(j, false);
    }

    @Override
    public final void onRenderedFirstFrame(tk tkVar) {
        this.h0 = -9223372036854775807L;
        this.g0 = -9223372036854775807L;
        ldc ldcVar = this.K;
        if (ldcVar != null) {
            ldcVar.onRenderedFirstFrame(tkVar);
        }
    }

    @Override
    public final void onSeekStarted(tk tkVar) {
        ldc ldcVar = this.K;
        if (ldcVar != null) {
            ldcVar.onSeekStarted(tkVar);
        }
    }

    public final void p0(long j, boolean z) {
        jx9 jx9Var;
        h74 h74Var = this.d;
        if (h74Var != null) {
            if (z) {
                jx9Var = jx9.d;
            } else {
                jx9Var = jx9.c;
            }
            h74Var.p1(jx9Var);
            this.d.k1(j);
        }
    }

    public final void q0(long j, boolean z, Runnable runnable) {
        jx9 jx9Var;
        if (this.d != null) {
            if (runnable != null) {
                this.j0.add(runnable);
            }
            h74 h74Var = this.d;
            if (z) {
                jx9Var = jx9.d;
            } else {
                jx9Var = jx9.c;
            }
            h74Var.p1(jx9Var);
            this.d.k1(j);
        }
    }

    public final void r0(boolean z) {
        int i;
        if (this.W != z) {
            this.W = z;
            h74 h74Var = this.d;
            if (h74Var != null) {
                if (z) {
                    i = 2;
                } else {
                    i = 0;
                }
                h74Var.n0(i);
            }
        }
    }

    public final void s0(boolean z) {
        float f;
        h74 h74Var = this.d;
        float f2 = 1.0f;
        if (h74Var != null) {
            if (z) {
                f = 0.0f;
            } else {
                f = 1.0f;
            }
            h74Var.R(f);
        }
        h74 h74Var2 = this.e;
        if (h74Var2 != null) {
            if (z) {
                f2 = 0.0f;
            }
            h74Var2.R(f2);
        }
    }

    public void t0(boolean z) {
        this.J = z;
        if (z && this.y && (!this.I || !this.H)) {
            h74 h74Var = this.d;
            if (h74Var != null) {
                h74Var.V(false);
            }
            h74 h74Var2 = this.e;
            if (h74Var2 != null) {
                h74Var2.V(false);
                return;
            }
            return;
        }
        this.x = z;
        h74 h74Var3 = this.d;
        if (h74Var3 != null) {
            h74Var3.V(z);
        }
        h74 h74Var4 = this.e;
        if (h74Var4 != null) {
            h74Var4.V(z);
        }
    }

    public void u0(float f) {
        try {
            h74 h74Var = this.d;
            if (h74Var != null) {
                float f2 = 1.0f;
                if (f > 1.0f) {
                    f2 = 0.98f;
                }
                h74Var.b(new ce8(f, f2));
            }
        } catch (Exception unused) {
        }
    }

    public final void v0(boolean r21, defpackage.kdc r22) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ndc.v0(boolean, kdc):void");
    }

    @Override
    public final void w(tk tkVar, int i) {
        if (i == 1) {
            ldc ldcVar = this.K;
            if (ldcVar != null) {
                ldcVar.onSeekFinished(tkVar);
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

    public final void w0(int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        h74 h74Var = this.d;
        if (h74Var != null) {
            if (i == 0) {
                i4 = 2;
                i5 = 1;
            } else {
                i4 = 1;
                i5 = 3;
            }
            h74Var.i0(new o00(i5, 0, i4, 1, false, 0, true), false);
        }
        h74 h74Var2 = this.e;
        if (h74Var2 != null) {
            if (i == 0) {
                i3 = 2;
                i2 = 1;
            } else {
                i2 = 2;
                i3 = 1;
            }
            h74Var2.i0(new o00(i2, 0, i3, 1, false, 0, true), true);
        }
    }

    public final void x0(Surface surface) {
        if (this.s != surface) {
            this.s = surface;
            h74 h74Var = this.d;
            if (h74Var == null) {
                return;
            }
            h74Var.r1(surface);
        }
    }

    public final void y0(SurfaceView surfaceView) {
        SurfaceHolder holder;
        if (this.r != surfaceView) {
            this.r = surfaceView;
            h74 h74Var = this.d;
            if (h74Var == null) {
                return;
            }
            h74Var.y1();
            if (surfaceView == null) {
                holder = null;
            } else {
                holder = surfaceView.getHolder();
            }
            h74Var.Q(holder);
        }
    }

    @Override
    public final void z(g0c g0cVar) {
        n88 n88Var = this.i0;
        if (n88Var != null) {
            gm.c3(n88Var);
        }
    }

    public final void z0(TextureView textureView) {
        if (this.n != textureView) {
            this.n = textureView;
            h74 h74Var = this.d;
            if (h74Var == null) {
                return;
            }
            h74Var.s1(textureView);
        }
    }

    @Override
    public void onRenderedFirstFrame() {
        this.K.onRenderedFirstFrame();
    }

    @Override
    public final void B(jt6 jt6Var) {
    }

    @Override
    public final void C(jt6 jt6Var) {
    }

    @Override
    public final void E(u64 u64Var) {
    }

    @Override
    public final void G(y79 y79Var) {
    }

    @Override
    public final void J(ce8 ce8Var) {
    }

    @Override
    public final void K(ne8 ne8Var) {
    }

    @Override
    public final void L(nf7 nf7Var) {
    }

    @Override
    public final void P(boolean z) {
    }

    @Override
    public final void b(int i) {
    }

    @Override
    public final void c(int i) {
    }

    @Override
    public final void d(oe8 oe8Var) {
    }

    @Override
    public final void e(boolean z) {
    }

    @Override
    public final void f(boolean z) {
    }

    @Override
    public final void g(int i) {
    }

    @Override
    public final void h(int i) {
    }

    @Override
    public final void i(ft6 ft6Var) {
    }

    @Override
    public final void j(ia3 ia3Var) {
    }

    @Override
    public final void l(o00 o00Var) {
    }

    @Override
    public final void n(jec jecVar) {
    }

    @Override
    public final void o(boolean z) {
    }

    @Override
    public final void q(float f) {
    }

    @Override
    public final void s(u64 u64Var) {
    }

    @Override
    public final void t(int i) {
    }

    @Override
    public final void v(boolean z) {
    }

    @Override
    public final void x(g53 g53Var) {
    }

    @Override
    public final void D(bqb bqbVar, int i) {
    }

    @Override
    public final void M(int i, int i2) {
    }

    @Override
    public final void p(int i, boolean z) {
    }

    @Override
    public final void r(int i, bt6 bt6Var) {
    }

    @Override
    public final void u(tk tkVar, ft6 ft6Var) {
    }

    @Override
    public final void y(h74 h74Var, hi2 hi2Var) {
    }

    @Override
    public final void A(int i, qe8 qe8Var, qe8 qe8Var2) {
    }

    @Override
    public final void k(tk tkVar, int i, long j) {
    }

    public ndc() {
        this(true, false);
    }
}
