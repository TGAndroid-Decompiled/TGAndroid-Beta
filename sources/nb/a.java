package nb;

import a8.r7;
import ad.c;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Paint;
import android.graphics.RectF;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.Editable;
import android.text.style.CharacterStyle;
import b7.l;
import bg.n;
import bi.x5;
import c4.k;
import c8.z0;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import f3.g;
import g6.d0;
import ia.d;
import j$.util.Objects;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ShortBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import lf.b;
import m8.e;
import org.json.JSONObject;
import org.telegram.messenger.IMapsProvider;
import org.telegram.messenger.ab;
import org.telegram.messenger.ca;
import org.telegram.messenger.cb;
import org.telegram.messenger.da;
import org.telegram.messenger.fj;
import org.telegram.messenger.ij;
import org.telegram.messenger.o10;
import org.telegram.messenger.o2;
import org.telegram.messenger.ua;
import org.telegram.messenger.va;
import org.telegram.messenger.wa;
import org.telegram.messenger.xa;
import org.telegram.messenger.ya;
import org.telegram.messenger.za;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.Cells.f1;
import org.telegram.ui.Cells.j9;
import org.telegram.ui.Cells.l1;
import org.telegram.ui.Cells.q1;
import org.telegram.ui.Components.q5;
import org.telegram.ui.ir0;
import org.xml.sax.Attributes;
import pb.h;
import q2.f;
import q2.j;
import q2.m;
import u2.u;
import w7.q;
import w7.s;
public final class a implements k, eg.a, g, fg.a, d, ja.a, b, Continuation, u9.d, IMapsProvider, gh.a, l1, m, u, x5.a {
    public static final a f20539b = new a(14);
    public final int f20540a;

    public a(int i7) {
        this.f20540a = i7;
    }

    public static ia.b W(s sVar) {
        return new ia.b(System.currentTimeMillis() + 3600000, new l(8), new ia.a(true, false, false), 10.0d, 1.2d, 60);
    }

    public static n c0(Editable editable, int i7) {
        Object[] objArr = (n[]) editable.getSpans(0, editable.length(), n.class);
        if (objArr.length != 0) {
            for (int length = objArr.length; length > 0; length--) {
                int i10 = length - 1;
                if (editable.getSpanFlags(objArr[i10]) == 17) {
                    n nVar = objArr[i10];
                    if (nVar.f3357a == i7) {
                        return nVar;
                    }
                }
            }
            return null;
        }
        return null;
    }

    public static boolean f0(boolean z9, String str, Editable editable, Attributes attributes) {
        int i7;
        boolean z10 = false;
        Object obj = null;
        if (str.startsWith("animated-emoji")) {
            if (z9) {
                String a10 = bg.m.a("data-document-id", attributes);
                if (a10 != null) {
                    editable.setSpan(new q5(Long.parseLong(a10), (Paint.FontMetricsInt) null), editable.length(), editable.length(), 17);
                    return true;
                }
            } else {
                Object[] spans = editable.getSpans(0, editable.length(), q5.class);
                if (spans.length != 0) {
                    int length = spans.length;
                    while (true) {
                        if (length <= 0) {
                            break;
                        }
                        int i10 = length - 1;
                        if (editable.getSpanFlags(spans[i10]) == 17) {
                            obj = spans[i10];
                            break;
                        }
                        length--;
                    }
                }
                Object obj2 = (q5) obj;
                if (obj2 != null) {
                    int spanStart = editable.getSpanStart(obj2);
                    editable.removeSpan(obj2);
                    if (spanStart != editable.length()) {
                        editable.setSpan(obj2, spanStart, editable.length(), 33);
                        return true;
                    }
                    return true;
                }
            }
            return false;
        } else if (str.equals("spoiler")) {
            if (z9) {
                editable.setSpan(new n(0), editable.length(), editable.length(), 17);
                return true;
            }
            Object c02 = c0(editable, 0);
            if (c02 != null) {
                int spanStart2 = editable.getSpanStart(c02);
                editable.removeSpan(c02);
                if (spanStart2 != editable.length()) {
                    editable.setSpan(c02, spanStart2, editable.length(), 33);
                    return true;
                }
                return true;
            }
            return false;
        } else if (str.equals("pre")) {
            if (z9) {
                String a11 = bg.m.a("language", attributes);
                if (a11 == null) {
                    a11 = bg.m.a("lang", attributes);
                }
                if (a11 == null) {
                    a11 = bg.m.a("lng", attributes);
                }
                editable.setSpan(new n(a11), editable.length(), editable.length(), 17);
                return true;
            }
            Object c03 = c0(editable, 1);
            if (c03 != null) {
                int spanStart3 = editable.getSpanStart(c03);
                editable.removeSpan(c03);
                if (spanStart3 != editable.length()) {
                    editable.setSpan(c03, spanStart3, editable.length(), 33);
                    return true;
                }
                return true;
            }
            return false;
        } else {
            int i11 = 3;
            if (str.equals("blockquote")) {
                if (z9) {
                    String a12 = bg.m.a("class", attributes);
                    if (bg.m.a("data-collapsed", attributes) != null || (a12 != null && a12.contains("telegram-collapsed-quote"))) {
                        z10 = true;
                    }
                    if (!z10) {
                        i11 = 2;
                    }
                    editable.setSpan(new n(i11), editable.length(), editable.length(), 17);
                    return true;
                }
                n[] nVarArr = (n[]) editable.getSpans(0, editable.length(), n.class);
                for (int length2 = nVarArr.length - 1; length2 >= 0; length2--) {
                    n nVar = nVarArr[length2];
                    if (editable.getSpanFlags(nVar) == 17 && ((i7 = nVar.f3357a) == 2 || i7 == 3)) {
                        obj = nVar;
                        break;
                    }
                }
                if (obj != null) {
                    int spanStart4 = editable.getSpanStart(obj);
                    editable.removeSpan(obj);
                    if (spanStart4 != editable.length()) {
                        editable.setSpan(obj, spanStart4, editable.length(), 33);
                        return true;
                    }
                    return true;
                }
                return false;
            }
            if (str.equals("details")) {
                if (z9) {
                    editable.setSpan(new n(3), editable.length(), editable.length(), 17);
                    return true;
                }
                Object c04 = c0(editable, 3);
                if (c04 != null) {
                    int spanStart5 = editable.getSpanStart(c04);
                    editable.removeSpan(c04);
                    if (spanStart5 != editable.length()) {
                        editable.setSpan(c04, spanStart5, editable.length(), 33);
                    }
                    return true;
                }
            }
            return false;
        }
    }

    public static String l0(c cVar) {
        String str = cVar.f1035a;
        if ("br".equals(str)) {
            return "\n";
        }
        if ("img".equals(str)) {
            String str2 = (String) cVar.a().get("alt");
            if (str2 != null && str2.length() != 0) {
                return str2;
            }
            return "￼";
        } else if ("iframe".equals(str)) {
            return " ";
        } else {
            return null;
        }
    }

    public static void r0(String str) {
        if (str != null && str.length() != 0) {
            if (!str.startsWith("sk_")) {
                return;
            }
            throw new tc.g("Invalid Publishable Key: You are using a secret key to create a token, instead of the publishable one. For more info, see https://stripe.com/docs/stripe.js", null);
        }
        throw new tc.g("Invalid Publishable Key: You must use a valid publishable key to create a token.  For more info, see https://stripe.com/docs/stripe.js.", null);
    }

    public static final CharSequence t0(Object obj) {
        Objects.requireNonNull(obj);
        if (obj instanceof CharSequence) {
            return (CharSequence) obj;
        }
        return obj.toString();
    }

    @Override
    public int A() {
        return 0;
    }

    @Override
    public StackTraceElement[] B(StackTraceElement[] stackTraceElementArr) {
        int i7;
        HashMap hashMap = new HashMap();
        StackTraceElement[] stackTraceElementArr2 = new StackTraceElement[stackTraceElementArr.length];
        int i10 = 0;
        int i11 = 0;
        int i12 = 1;
        while (i10 < stackTraceElementArr.length) {
            StackTraceElement stackTraceElement = stackTraceElementArr[i10];
            Integer num = (Integer) hashMap.get(stackTraceElement);
            if (num != null) {
                int intValue = num.intValue();
                int i13 = i10 - intValue;
                if (i10 + i13 <= stackTraceElementArr.length) {
                    for (int i14 = 0; i14 < i13; i14++) {
                        if (stackTraceElementArr[intValue + i14].equals(stackTraceElementArr[i10 + i14])) {
                        }
                    }
                    int intValue2 = i10 - num.intValue();
                    if (i12 < 10) {
                        System.arraycopy(stackTraceElementArr, i10, stackTraceElementArr2, i11, intValue2);
                        i11 += intValue2;
                        i12++;
                    }
                    i7 = (intValue2 - 1) + i10;
                    hashMap.put(stackTraceElement, Integer.valueOf(i10));
                    i10 = i7 + 1;
                }
            }
            stackTraceElementArr2[i11] = stackTraceElementArr[i10];
            i11++;
            i12 = 1;
            i7 = i10;
            hashMap.put(stackTraceElement, Integer.valueOf(i10));
            i10 = i7 + 1;
        }
        StackTraceElement[] stackTraceElementArr3 = new StackTraceElement[i11];
        System.arraycopy(stackTraceElementArr2, 0, stackTraceElementArr3, 0, i11);
        if (i11 < stackTraceElementArr.length) {
            return stackTraceElementArr3;
        }
        return stackTraceElementArr;
    }

    @Override
    public void B1(q1 q1Var, TLRPC.WebPage webPage, String str, boolean z9) {
        vf.c.t(q1Var.getContext(), str);
    }

    @Override
    public int C0() {
        return 0;
    }

    @Override
    public CharacterStyle C1(q1 q1Var) {
        return null;
    }

    @Override
    public int D(e2.u uVar) {
        return 1;
    }

    @Override
    public boolean E1(q1 q1Var, ij ijVar) {
        return false;
    }

    @Override
    public int F(e2.u uVar) {
        if (uVar.f10623w != null) {
            return 1;
        }
        return 0;
    }

    @Override
    public void H0(ShortBuffer shortBuffer, int i7, ShortBuffer shortBuffer2, int i10) {
        eg.a aVar;
        if (i7 == 6) {
            aVar = eg.a.f10813p;
        } else if (i7 > i10) {
            aVar = eg.a.f10810l;
        } else if (i7 < i10) {
            aVar = eg.a.f10811m;
        } else {
            aVar = eg.a.f10812o;
        }
        aVar.H0(shortBuffer, i7, shortBuffer2, i10);
    }

    @Override
    public boolean I(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return false;
    }

    @Override
    public boolean J0(long j3) {
        return false;
    }

    @Override
    public boolean J1(q1 q1Var, TLRPC.PollAnswer pollAnswer) {
        return false;
    }

    @Override
    public int L() {
        return MediaCodecList.getCodecCount();
    }

    @Override
    public int M() {
        return 0;
    }

    @Override
    public ir0 N1() {
        return null;
    }

    @Override
    public int O() {
        return 0;
    }

    @Override
    public boolean O0(q1 q1Var, boolean z9) {
        return false;
    }

    @Override
    public boolean Q(q1 q1Var, TLRPC.TodoItem todoItem, boolean z9) {
        return false;
    }

    @Override
    public boolean Q1(long j3) {
        return false;
    }

    @Override
    public boolean R() {
        return false;
    }

    @Override
    public int R0() {
        return 0;
    }

    @Override
    public boolean S(q1 q1Var) {
        return false;
    }

    @Override
    public boolean S1(q1 q1Var, TLRPC.TodoItem todoItem) {
        return false;
    }

    @Override
    public boolean T() {
        return false;
    }

    @Override
    public boolean W0(ij ijVar) {
        return f1.a(ijVar);
    }

    @Override
    public int X() {
        return 0;
    }

    @Override
    public boolean Y() {
        return false;
    }

    @Override
    public jh.a Z() {
        return null;
    }

    @Override
    public boolean a0(q1 q1Var) {
        return false;
    }

    @Override
    public lf.a b(wf.b bVar) {
        return new gf.l(bVar);
    }

    @Override
    public boolean b0(q1 q1Var, TLRPC.User user) {
        return false;
    }

    @Override
    public boolean b2(q1 q1Var, TL_iv.PageBlock pageBlock) {
        return false;
    }

    @Override
    public ia.b c(s sVar, JSONObject jSONObject) {
        return W(sVar);
    }

    @Override
    public boolean d() {
        return false;
    }

    @Override
    public Object e(r7 r7Var) {
        switch (this.f20540a) {
            case 15:
                return new h();
            default:
                pb.g gVar = (pb.g) r7Var.a(pb.g.class);
                synchronized (q.class) {
                    byte b10 = (byte) (((byte) 1) | 2);
                    if (b10 == 3) {
                        q.a(new Object());
                    } else {
                        StringBuilder sb2 = new StringBuilder();
                        if ((b10 & 1) == 0) {
                            sb2.append(" enableFirelog");
                        }
                        if ((b10 & 2) == 0) {
                            sb2.append(" firelogEventType");
                        }
                        throw new IllegalStateException("Missing required properties:".concat(sb2.toString()));
                    }
                }
                return new a(0);
        }
    }

    @Override
    public boolean e0() {
        return false;
    }

    @Override
    public int e1() {
        return 0;
    }

    @Override
    public MediaCodecInfo f(int i7) {
        return MediaCodecList.getCodecInfoAt(i7);
    }

    @Override
    public boolean g() {
        return true;
    }

    @Override
    public boolean g2(int i7) {
        return false;
    }

    @Override
    public int getInstallMapsString() {
        return 2131749196;
    }

    @Override
    public String getMapsAppPackageName() {
        return "com.google.android.apps.maps";
    }

    @Override
    public String h(q1 q1Var) {
        return null;
    }

    @Override
    public int h0(q1 q1Var) {
        return 0;
    }

    @Override
    public q2.g i(j jVar, e2.u uVar) {
        if (uVar.f10623w == null) {
            return null;
        }
        return new q2.n(new f(6001, new Exception()));
    }

    @Override
    public void initializeMaps(Context context) {
        synchronized (k8.b.class) {
            k8.b.a(context);
        }
    }

    @Override
    public float j0() {
        return -1.0f;
    }

    @Override
    public boolean k0() {
        return false;
    }

    @Override
    public j9 k2() {
        return null;
    }

    @Override
    public c4.m l(e2.u uVar) {
        throw new IllegalStateException("This SubtitleParser.Factory doesn't support any formats.");
    }

    @Override
    public ya loadRawResourceStyle(Context context, int i7) {
        InputStream openRawResource = context.getResources().openRawResource(i7);
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr = new byte[1024];
            while (true) {
                int read = openRawResource.read(bArr, 0, 1024);
                if (read != -1) {
                    byteArrayOutputStream.write(bArr, 0, read);
                } else {
                    x6.b.a(openRawResource);
                    x6.b.a(byteArrayOutputStream);
                    e eVar = new e(new String(byteArrayOutputStream.toByteArray(), "UTF-8"));
                    ?? obj = new Object();
                    obj.f22638a = eVar;
                    return obj;
                }
            }
        } catch (IOException e10) {
            String obj2 = e10.toString();
            throw new Resources.NotFoundException("Failed to read resource " + i7 + ": " + obj2);
        }
    }

    @Override
    public q2.l m(j jVar, e2.u uVar) {
        return q2.l.f53751z;
    }

    @Override
    public boolean n0(q5 q5Var) {
        return false;
    }

    @Override
    public boolean n1() {
        return false;
    }

    @Override
    public ua newCameraUpdateLatLng(cb cbVar) {
        LatLng latLng = new LatLng(cbVar.f21837a, cbVar.f21838b);
        try {
            l8.a aVar = z0.f5987a;
            q6.m.h(aVar, "CameraUpdateFactory is not initialized");
            Parcel p12 = aVar.p1();
            v7.b.b(p12, latLng);
            Parcel o12 = aVar.o1(p12, 8);
            a7.a m12 = a7.b.m1(o12.readStrongBinder());
            o12.recycle();
            return new ca(new k8.a(m12, 0));
        } catch (RemoteException e10) {
            throw new RuntimeException(e10);
        }
    }

    @Override
    public ua newCameraUpdateLatLngBounds(wa waVar, int i7) {
        LatLngBounds latLngBounds = ((da) waVar).f22013a;
        try {
            l8.a aVar = z0.f5987a;
            q6.m.h(aVar, "CameraUpdateFactory is not initialized");
            Parcel p12 = aVar.p1();
            v7.b.b(p12, latLngBounds);
            p12.writeInt(i7);
            Parcel o12 = aVar.o1(p12, 10);
            a7.a m12 = a7.b.m1(o12.readStrongBinder());
            o12.recycle();
            return new ca(new k8.a(m12, 0));
        } catch (RemoteException e10) {
            throw new RuntimeException(e10);
        }
    }

    @Override
    public ua newCameraUpdateLatLngZoom(cb cbVar, float f10) {
        LatLng latLng = new LatLng(cbVar.f21837a, cbVar.f21838b);
        try {
            l8.a aVar = z0.f5987a;
            q6.m.h(aVar, "CameraUpdateFactory is not initialized");
            Parcel p12 = aVar.p1();
            v7.b.b(p12, latLng);
            p12.writeFloat(f10);
            Parcel o12 = aVar.o1(p12, 9);
            a7.a m12 = a7.b.m1(o12.readStrongBinder());
            o12.recycle();
            return new ca(new k8.a(m12, 0));
        } catch (RemoteException e10) {
            throw new RuntimeException(e10);
        }
    }

    @Override
    public float o0() {
        return -1.0f;
    }

    @Override
    public va onCreateCircleOptions() {
        h9.f1 f1Var = new h9.f1(22, false);
        ?? obj = new Object();
        obj.f19934a = null;
        obj.f19935b = 0.0d;
        obj.f19936c = 10.0f;
        obj.d = -16777216;
        obj.f19937e = 0;
        obj.f19938f = 0.0f;
        obj.h = true;
        obj.f19939n = false;
        obj.f19940r = null;
        f1Var.f14325b = obj;
        return f1Var;
    }

    @Override
    public xa onCreateLatLngBoundsBuilder() {
        d0 d0Var = new d0(25, false);
        m8.d dVar = new m8.d(0);
        dVar.f19943b = Double.POSITIVE_INFINITY;
        dVar.f19944c = Double.NEGATIVE_INFINITY;
        dVar.d = Double.NaN;
        dVar.f19945e = Double.NaN;
        d0Var.f13557b = dVar;
        return d0Var;
    }

    @Override
    public za onCreateMapView(Context context) {
        r7 r7Var = new r7(13, (byte) 0);
        r7Var.f614b = new x5(r7Var, context);
        return r7Var;
    }

    @Override
    public ab onCreateMarkerOptions() {
        gf.g gVar = new gf.g(24);
        ?? obj = new Object();
        obj.f19951e = 0.5f;
        obj.f19952f = 1.0f;
        obj.f19953n = true;
        obj.f19954r = false;
        obj.f19955s = 0.0f;
        obj.f19956w = 0.5f;
        obj.f19957x = 0.0f;
        obj.f19958y = 1.0f;
        gVar.f13891b = obj;
        return gVar;
    }

    @Override
    public boolean p1(q1 q1Var, int i7) {
        return false;
    }

    @Override
    public void q0(ShortBuffer shortBuffer, int i7, ShortBuffer shortBuffer2, int i10, int i11) {
        if (i7 <= i10) {
            if (i11 != 1 && i11 != 2) {
                throw new IllegalArgumentException(jg.g.j(i11, "Illegal use of UpsampleAudioResampler. Channels:"));
            }
            int remaining = shortBuffer.remaining() / i11;
            int ceil = ((int) Math.ceil((i10 / i7) * remaining)) - remaining;
            float f10 = remaining;
            float f11 = f10 / f10;
            float f12 = ceil;
            float f13 = f12 / f12;
            while (remaining > 0 && ceil > 0) {
                if (f11 >= f13) {
                    shortBuffer2.put(shortBuffer.get());
                    if (i11 == 2) {
                        shortBuffer2.put(shortBuffer.get());
                    }
                    remaining--;
                    f11 = remaining / f10;
                } else {
                    shortBuffer2.put(shortBuffer2.get(shortBuffer2.position() - i11));
                    if (i11 == 2) {
                        shortBuffer2.put(shortBuffer2.get(shortBuffer2.position() - i11));
                    }
                    ceil--;
                    f13 = ceil / f12;
                }
            }
            return;
        }
        throw new IllegalArgumentException("Illegal use of UpsampleAudioResampler");
    }

    @Override
    public long s() {
        return System.currentTimeMillis();
    }

    @Override
    public boolean t(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        if ("secure-playback".equals(str) && "video/avc".equals(str2)) {
            return true;
        }
        return false;
    }

    @Override
    public Object then(Task task) {
        Intent intent = (Intent) ((Bundle) task.getResult()).getParcelable("notification_data");
        if (intent != null) {
            return new m6.a(intent);
        }
        return null;
    }

    @Override
    public boolean u1(q1 q1Var, TLRPC.Chat chat) {
        return false;
    }

    @Override
    public float v0() {
        return 0.0f;
    }

    @Override
    public boolean w(e2.u uVar) {
        return false;
    }

    @Override
    public boolean w1() {
        return false;
    }

    @Override
    public boolean x0(ij ijVar) {
        return true;
    }

    @Override
    public String y(long j3) {
        return null;
    }

    @Override
    public int z1(int i7, int i10, int i11) {
        eg.a aVar;
        if (i10 == 6) {
            aVar = eg.a.f10813p;
        } else if (i10 > i11) {
            aVar = eg.a.f10810l;
        } else if (i10 < i11) {
            aVar = eg.a.f10811m;
        } else {
            aVar = eg.a.f10812o;
        }
        return aVar.z1(i7, i10, i11);
    }

    @Override
    public void F1() {
    }

    @Override
    public void Z0() {
    }

    @Override
    public void a() {
    }

    @Override
    public void e2() {
    }

    @Override
    public void i2() {
    }

    @Override
    public void k() {
    }

    @Override
    public void p() {
    }

    @Override
    public void release() {
    }

    @Override
    public void u() {
    }

    @Override
    public void z0() {
    }

    @Override
    public void A1(ij ijVar) {
    }

    @Override
    public void C(q1 q1Var) {
    }

    @Override
    public void D0(q1 q1Var) {
    }

    @Override
    public void G0(q1 q1Var) {
    }

    @Override
    public void H(q1 q1Var) {
    }

    @Override
    public void J(fj fjVar) {
    }

    @Override
    public void K0(q1 q1Var) {
    }

    @Override
    public void N(q1 q1Var) {
    }

    @Override
    public void P(ij ijVar) {
    }

    @Override
    public void P0(q1 q1Var) {
    }

    @Override
    public void Q0(q1 q1Var) {
    }

    @Override
    public void U1(q1 q1Var) {
    }

    @Override
    public void V(q1 q1Var) {
    }

    @Override
    public void c2(q1 q1Var) {
    }

    @Override
    public void d0(int i7) {
    }

    @Override
    public void i0(q1 q1Var) {
    }

    @Override
    public void m0(String str) {
    }

    @Override
    public void o(q1 q1Var) {
    }

    @Override
    public long q(long j3) {
        return j3;
    }

    @Override
    public void r(q1 q1Var) {
    }

    @Override
    public void r1(q1 q1Var) {
    }

    @Override
    public void v(q1 q1Var) {
    }

    @Override
    public void x(q1 q1Var) {
    }

    @Override
    public void y0(q1 q1Var) {
    }

    @Override
    public void y1(q1 q1Var) {
    }

    @Override
    public void z(q1 q1Var) {
    }

    @Override
    public void E(Looper looper, m2.j jVar) {
    }

    @Override
    public void G(q1 q1Var, o2 o2Var) {
    }

    @Override
    public void H1(q1 q1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    @Override
    public void K1(q1 q1Var, o10 o10Var) {
    }

    @Override
    public void L0(q1 q1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    @Override
    public void P1(String str, String str2) {
    }

    @Override
    public void W1(q1 q1Var, long j3) {
    }

    @Override
    public void b1(q1 q1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override
    public void g1(q1 q1Var, int i7) {
    }

    @Override
    public void s1(q1 q1Var, boolean z9) {
    }

    @Override
    public void v1(q1 q1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override
    public void x1(q1 q1Var, int i7) {
    }

    @Override
    public void A0(q1 q1Var, TLObject tLObject, boolean z9) {
    }

    @Override
    public void B0(q1 q1Var, float f10, float f11) {
    }

    @Override
    public void E0(q1 q1Var, boolean z9, boolean z10) {
    }

    @Override
    public void K(q1 q1Var, TLRPC.Document document, RectF rectF) {
    }

    @Override
    public void N0(q1 q1Var, CharacterStyle characterStyle, boolean z9) {
    }

    @Override
    public void g0(q1 q1Var, float f10, float f11) {
    }

    @Override
    public void j1(q1 q1Var, float f10, float f11) {
    }

    @Override
    public void j2(q1 q1Var, int i7, int i10) {
    }

    @Override
    public void p0(q1 q1Var, float f10, float f11) {
    }

    @Override
    public void q1(q1 q1Var, boolean z9, boolean z10) {
    }

    @Override
    public void I1(q1 q1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    @Override
    public void n(q1 q1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i7) {
    }

    @Override
    public void s0(q1 q1Var, TLRPC.User user, float f10, float f11) {
    }

    @Override
    public void u0(q1 q1Var, float f10, float f11, boolean z9) {
    }

    @Override
    public void R1(q1 q1Var, int i7, float f10, float f11, boolean z9) {
    }

    @Override
    public void f2(q1 q1Var, TLRPC.ReactionCount reactionCount, boolean z9, float f10, float f11) {
    }

    @Override
    public void j(q1 q1Var, ArrayList arrayList, int i7, int i10, int i11) {
    }

    @Override
    public void U(q1 q1Var, TLRPC.Chat chat, int i7, float f10, float f11, boolean z9) {
    }

    @Override
    public void D1(ij ijVar, String str, String str2, String str3, String str4, int i7, int i10) {
    }
}
