package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.RectF;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.style.CharacterStyle;
import android.util.JsonReader;
import android.util.JsonToken;
import android.util.Log;
import com.google.android.gms.tasks.OnFailureListener;
import j$.util.DesugarCollections;
import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.ShortBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.Executor;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
public final class i2f implements aq2, OnFailureListener, yyb, r07, p11, pt9, i30, l74, bk6, bb2, vyc, lt8, bv7, ti2 {
    public static i2f b;
    public final byte a;
    public static final i2f c = new i2f((byte) 1);
    public static final i2f d = new i2f((byte) 2);
    public static final i2f e = new i2f((byte) 3);
    public static final i2f f = new i2f((byte) 4);
    public static final i2f h = new i2f((byte) 5);
    public static final i2f n = new i2f((byte) 6);
    public static final i2f r = new i2f((byte) 7);
    public static final i2f s = new i2f((byte) 8);
    public static final i2f w = new i2f((byte) 9);
    public static final i2f x = new i2f((byte) 10);
    public static final i2f y = new i2f((byte) 11);
    public static final i2f E = new i2f((byte) 12);

    public i2f(byte b2) {
        this.a = b2;
    }

    public static void I3(JsonReader jsonReader, jm5 jm5Var) {
        jsonReader.beginArray();
        boolean z = false;
        while (jsonReader.hasNext()) {
            if (jsonReader.peek().equals(JsonToken.BEGIN_OBJECT)) {
                jsonReader.beginObject();
                String str = null;
                String str2 = null;
                gya gyaVar = null;
                while (jsonReader.hasNext()) {
                    String nextName = jsonReader.nextName();
                    if (nextName.equals("BASE-ID") && jsonReader.peek().equals(JsonToken.STRING)) {
                        str = jsonReader.nextString();
                    } else if (nextName.equals("ID") && jsonReader.peek().equals(JsonToken.STRING)) {
                        str2 = jsonReader.nextString();
                    } else if (nextName.equals("URI-REPLACEMENT") && jsonReader.peek().equals(JsonToken.BEGIN_OBJECT)) {
                        jsonReader.beginObject();
                        HashMap hashMap = new HashMap();
                        HashMap hashMap2 = new HashMap();
                        HashMap hashMap3 = new HashMap();
                        String str3 = null;
                        while (jsonReader.hasNext()) {
                            String nextName2 = jsonReader.nextName();
                            if (nextName2.equals("HOST") && jsonReader.peek().equals(JsonToken.STRING)) {
                                str3 = jsonReader.nextString();
                                if (str3.isEmpty()) {
                                    throw av7.c("The HOST string is present but empty");
                                }
                            } else if (nextName2.equals("PARAMS") && jsonReader.peek().equals(JsonToken.BEGIN_OBJECT)) {
                                jsonReader.beginObject();
                                while (jsonReader.hasNext()) {
                                    String nextName3 = jsonReader.nextName();
                                    if (jsonReader.peek().equals(JsonToken.STRING)) {
                                        hashMap.put(nextName3, jsonReader.nextString());
                                    } else {
                                        jsonReader.skipValue();
                                    }
                                }
                                jsonReader.endObject();
                            } else if (nextName2.equals("PER-VARIANT-URIS") && jsonReader.peek().equals(JsonToken.BEGIN_OBJECT)) {
                                jsonReader.beginObject();
                                while (jsonReader.hasNext()) {
                                    String nextName4 = jsonReader.nextName();
                                    if (jsonReader.peek().equals(JsonToken.STRING)) {
                                        hashMap2.put(nextName4, Uri.parse(jsonReader.nextString()));
                                    } else {
                                        jsonReader.skipValue();
                                    }
                                }
                                jsonReader.endObject();
                            } else if (nextName2.equals("PER-RENDITION-URIS") && jsonReader.peek().equals(JsonToken.BEGIN_OBJECT)) {
                                jsonReader.beginObject();
                                while (jsonReader.hasNext()) {
                                    String nextName5 = jsonReader.nextName();
                                    if (jsonReader.peek().equals(JsonToken.STRING)) {
                                        hashMap3.put(nextName5, Uri.parse(jsonReader.nextString()));
                                    } else {
                                        jsonReader.skipValue();
                                    }
                                }
                                jsonReader.endObject();
                            } else {
                                jsonReader.skipValue();
                            }
                        }
                        jsonReader.endObject();
                        gyaVar = new gya(str3, hashMap, hashMap2, hashMap3);
                    } else {
                        jsonReader.skipValue();
                    }
                }
                jsonReader.endObject();
                if (str != null) {
                    if (str2 != null) {
                        if (gyaVar != null) {
                            jm5Var.c(new fya(str, str2, gyaVar));
                            z = true;
                        } else {
                            throw av7.c("URI-REPLACEMENT field is missing in a PATHWAY-CLONE object");
                        }
                    } else {
                        throw av7.c("ID field is missing in a PATHWAY-CLONE object");
                    }
                } else {
                    throw av7.c("BASE-ID field is missing in a PATHWAY-CLONE object");
                }
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endArray();
        if (z) {
            return;
        }
        throw av7.c("The PATHWAY-CLONES array is present but empty");
    }

    public static void J3(JsonReader jsonReader, jm5 jm5Var) {
        HashSet hashSet = new HashSet();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            if (jsonReader.peek().equals(JsonToken.STRING)) {
                String nextString = jsonReader.nextString();
                if (hashSet.add(nextString)) {
                    jm5Var.c(nextString);
                } else {
                    throw av7.c("The pathway ID (" + nextString + ") appears more than once in the PATHWAY-PRIORITY array");
                }
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endArray();
        if (!hashSet.isEmpty()) {
            return;
        }
        throw av7.c("The PATHWAY-PRIORITY array is present but empty");
    }

    public static synchronized void O3() {
        synchronized (i2f.class) {
            if (b == null) {
                b = new i2f((byte) 0);
            }
        }
    }

    public static byte[] l3(mm5 mm5Var, long j) {
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>(mm5Var.size());
        Iterator<E> it = mm5Var.iterator();
        while (it.hasNext()) {
            u33 u33Var = (u33) it.next();
            Bundle a = u33Var.a();
            Bitmap bitmap = u33Var.d;
            if (bitmap != null) {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                gre.p(bitmap.compress(Bitmap.CompressFormat.PNG, 0, byteArrayOutputStream));
                a.putByteArray(u33.x, byteArrayOutputStream.toByteArray());
            }
            arrayList.add(a);
        }
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("c", arrayList);
        bundle.putLong("d", j);
        Parcel obtain = Parcel.obtain();
        obtain.writeBundle(bundle);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        return marshall;
    }

    public static d86 u3(c86 c86Var, dd ddVar) {
        IOException iOException = (IOException) ddVar.c;
        if (iOException instanceof lg5) {
            int i = ((lg5) iOException).c;
            if (i == 403 || i == 404 || i == 410 || i == 416 || i == 500 || i == 503) {
                if (!c86Var.e) {
                    if (c86Var.a(1)) {
                        return new d86(1, 300000L);
                    }
                    if (c86Var.a(2)) {
                        return new d86(2, 60000L);
                    }
                    return null;
                } else if (c86Var.a(2)) {
                    return new d86(2, 60000L);
                } else {
                    if (c86Var.a(1)) {
                        return new d86(1, 300000L);
                    }
                    return null;
                }
            }
            return null;
        }
        return null;
    }

    public static long w3(dd ddVar) {
        for (Throwable th = (IOException) ddVar.c; th != null; th = th.getCause()) {
            if (!(th instanceof av7) && !(th instanceof FileNotFoundException) && !(th instanceof ig5) && !(th instanceof m86)) {
                if ((th instanceof r63) && ((r63) th).a == 2008) {
                    return -9223372036854775807L;
                }
            } else {
                return -9223372036854775807L;
            }
        }
        return Math.min((ddVar.b - 1) * 1000, 5000);
    }

    public static short z3(short s2, short s3) {
        int i;
        int i2 = s2 + 32768;
        int i3 = s3 + 32768;
        int i4 = 65535;
        if (i2 >= 32768 && i3 >= 32768) {
            i = (((i2 + i3) << 1) - ((i2 * i3) / 32768)) - 65535;
        } else {
            i = (i2 * i3) / 32768;
        }
        if (i != 65536) {
            i4 = i;
        }
        return (short) (i4 - 32768);
    }

    @Override
    public final boolean A1(gb2 gb2Var, int i) {
        byte b2 = this.a;
        return false;
    }

    @Override
    public final void B() {
        throw new UnsupportedOperationException();
    }

    @Override
    public final void B0() {
        byte b2 = this.a;
    }

    @Override
    public final boolean B2(gb2 gb2Var, k27 k27Var) {
        byte b2 = this.a;
        return false;
    }

    @Override
    public final void C1(gb2 gb2Var, boolean z) {
        byte b2 = this.a;
    }

    @Override
    public final void C2() {
        byte b2 = this.a;
    }

    @Override
    public final void D(gb2 gb2Var, TLRPC.User user, TLRPC.Document document, String str) {
        byte b2 = this.a;
    }

    @Override
    public final boolean D0(gb2 gb2Var, TLRPC.PollAnswer pollAnswer) {
        byte b2 = this.a;
        return false;
    }

    @Override
    public final void D1(h27 h27Var) {
        byte b2 = this.a;
    }

    @Override
    public final void E(gb2 gb2Var) {
        byte b2 = this.a;
    }

    @Override
    public final void E0(gb2 gb2Var, long j) {
        byte b2 = this.a;
    }

    @Override
    public final gib E2() {
        byte b2 = this.a;
        return null;
    }

    @Override
    public final boolean F(gb2 gb2Var, TLRPC.TodoItem todoItem) {
        byte b2 = this.a;
        return false;
    }

    @Override
    public final boolean F0(gb2 gb2Var) {
        byte b2 = this.a;
        return false;
    }

    @Override
    public final void F1(gb2 gb2Var, int i) {
        byte b2 = this.a;
    }

    @Override
    public final void G1(gb2 gb2Var, boolean z, boolean z2) {
        byte b2 = this.a;
    }

    @Override
    public final void H(gb2 gb2Var, TLRPC.Document document, RectF rectF) {
        byte b2 = this.a;
    }

    @Override
    public final void H2(gb2 gb2Var) {
        byte b2 = this.a;
    }

    @Override
    public final void I(gb2 gb2Var) {
        byte b2 = this.a;
    }

    @Override
    public final void I1(k27 k27Var, String str, String str2, String str3, String str4, int i, int i2) {
        byte b2 = this.a;
    }

    @Override
    public final boolean J(yz6 yz6Var) {
        return false;
    }

    @Override
    public final boolean J0(long j) {
        byte b2 = this.a;
        return false;
    }

    @Override
    public final Object K(gl2 gl2Var) {
        switch (this.a) {
            case 1:
                Object i = gl2Var.i(new xw8(i16.class, Executor.class));
                i.getClass();
                return new t44((Executor) i);
            default:
                ArrayList arrayList = new ArrayList(gl2Var.O(u3d.class));
                fre.j("No delegate creator registered.", !arrayList.isEmpty());
                Collections.sort(arrayList, is6.e);
                return new d6e((Context) gl2Var.a(Context.class), (u3d) arrayList.get(0));
        }
    }

    @Override
    public final void K1(gb2 gb2Var, TLRPC.WebPage webPage, String str, boolean z) {
        byte b2 = this.a;
        d01.t(gb2Var.getContext(), str);
    }

    @Override
    public final void M(gb2 gb2Var, int i, float f2, float f3, boolean z) {
        byte b2 = this.a;
    }

    @Override
    public final void M0(gb2 gb2Var, boolean z) {
        byte b2 = this.a;
    }

    @Override
    public final void M1(gb2 gb2Var) {
        byte b2 = this.a;
    }

    @Override
    public final boolean N() {
        byte b2 = this.a;
        return false;
    }

    @Override
    public final void N0(gb2 gb2Var) {
        byte b2 = this.a;
    }

    @Override
    public final boolean N1() {
        byte b2 = this.a;
        return false;
    }

    @Override
    public final void O(gb2 gb2Var, CharacterStyle characterStyle, boolean z) {
        byte b2 = this.a;
    }

    @Override
    public final void O1(gb2 gb2Var, iq0 iq0Var) {
        byte b2 = this.a;
    }

    @Override
    public final boolean P() {
        byte b2 = this.a;
        return false;
    }

    @Override
    public final int Q() {
        byte b2 = this.a;
        return 0;
    }

    @Override
    public final void R1() {
        byte b2 = this.a;
    }

    @Override
    public final void S(gb2 gb2Var) {
        byte b2 = this.a;
    }

    @Override
    public final wxb T(int i, int i2) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final boolean T0(gb2 gb2Var, TLRPC.TodoItem todoItem, boolean z) {
        byte b2 = this.a;
        return false;
    }

    @Override
    public final boolean T1(gm gmVar) {
        byte b2 = this.a;
        return false;
    }

    @Override
    public final int U(gb2 gb2Var) {
        byte b2 = this.a;
        return 0;
    }

    @Override
    public final void V(gb2 gb2Var) {
        byte b2 = this.a;
    }

    @Override
    public final void V0(gb2 gb2Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        byte b2 = this.a;
    }

    @Override
    public final vu1 W() {
        byte b2 = this.a;
        return null;
    }

    @Override
    public final void W1(gb2 gb2Var, TLObject tLObject, boolean z) {
        byte b2 = this.a;
    }

    @Override
    public final void X(k27 k27Var) {
        byte b2 = this.a;
    }

    @Override
    public final void X0(gb2 gb2Var) {
        byte b2 = this.a;
    }

    @Override
    public final void X1(gb2 gb2Var) {
        byte b2 = this.a;
    }

    @Override
    public final void Y(gb2 gb2Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
        byte b2 = this.a;
    }

    @Override
    public final void Y0(gb2 gb2Var, float f2, float f3) {
        byte b2 = this.a;
    }

    @Override
    public final void Y1(gb2 gb2Var) {
        byte b2 = this.a;
    }

    @Override
    public final int Z0(int i, int i2, int i3) {
        return i / 2;
    }

    @Override
    public final ma8 Z1() {
        byte b2 = this.a;
        return null;
    }

    @Override
    public final long a() {
        throw new NoSuchElementException();
    }

    @Override
    public final void a0(ShortBuffer shortBuffer, int i, ShortBuffer shortBuffer2, int i2) {
        int min = Math.min(shortBuffer.remaining() / 2, shortBuffer2.remaining());
        for (int i3 = 0; i3 < min; i3++) {
            shortBuffer2.put(z3(shortBuffer.get(), shortBuffer.get()));
        }
    }

    @Override
    public final Object apply(Object obj) {
        return (byte[]) obj;
    }

    @Override
    public final boolean b() {
        byte b2 = this.a;
        return false;
    }

    @Override
    public final void b0(gb2 gb2Var, TLRPC.User user, float f2, float f3) {
        byte b2 = this.a;
    }

    @Override
    public final String b1(gb2 gb2Var) {
        byte b2 = this.a;
        return null;
    }

    @Override
    public final void b2(String str, String str2) {
        byte b2 = this.a;
    }

    @Override
    public final void c() {
        byte b2 = this.a;
    }

    @Override
    public final void c0(int i) {
        byte b2 = this.a;
    }

    @Override
    public final void c1(gb2 gb2Var) {
        byte b2 = this.a;
    }

    @Override
    public final boolean c2(long j) {
        byte b2 = this.a;
        return false;
    }

    @Override
    public final boolean d0() {
        byte b2 = this.a;
        return false;
    }

    @Override
    public final void d2(gb2 gb2Var, k08 k08Var) {
        byte b2 = this.a;
    }

    @Override
    public final long e() {
        return SystemClock.elapsedRealtime();
    }

    @Override
    public final CharacterStyle e0(gb2 gb2Var) {
        byte b2 = this.a;
        return null;
    }

    @Override
    public final void e2(gb2 gb2Var) {
        byte b2 = this.a;
    }

    @Override
    public final void f(q11 q11Var, b11 b11Var, nv0 nv0Var, i42 i42Var) {
        q11Var.setInOutOffset(q11Var.getMeasuredHeight());
        i42Var.accept(Float.valueOf(q11Var.getTranslationY()));
        yla ylaVar = new yla((Object) q11Var, q11.IN_OUT_OFFSET_Y, 0.0f);
        ylaVar.m.a(0.8f);
        ylaVar.m.b(400.0f);
        ylaVar.a(new o11(q11Var, nv0Var, (byte) 0));
        ylaVar.b(new n11(i42Var, q11Var, (byte) 1));
        ylaVar.h();
        b11Var.run();
    }

    @Override
    public final void f0(fv9 fv9Var) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final void g(q11 q11Var, b11 b11Var, z01 z01Var, gw gwVar) {
        yla ylaVar = new yla(q11Var, q11.IN_OUT_OFFSET_Y, q11Var.getHeight());
        ylaVar.m.a(0.8f);
        ylaVar.m.b(400.0f);
        ylaVar.a(new zv0(z01Var, (byte) 2));
        ylaVar.b(new n11(gwVar, q11Var, (byte) 0));
        ylaVar.h();
        b11Var.run();
    }

    @Override
    public final boolean g2(k27 k27Var) {
        byte b2 = this.a;
        return true;
    }

    @Override
    public final Object mo9get() {
        ie7 ie7Var = new ie7((byte) 29);
        HashMap hashMap = new HashMap();
        Set set = Collections.EMPTY_SET;
        if (set != null) {
            hashMap.put(cj8.a, new ka0(30000L, 86400000L, set));
            if (set != null) {
                hashMap.put(cj8.c, new ka0(1000L, 86400000L, set));
                if (set != null) {
                    Set unmodifiableSet = DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList(mq9.b)));
                    if (unmodifiableSet != null) {
                        hashMap.put(cj8.b, new ka0(86400000L, 86400000L, unmodifiableSet));
                        if (hashMap.keySet().size() >= cj8.values().length) {
                            return new ja0(ie7Var, hashMap);
                        }
                        sc8.j("Not all priorities have been configured");
                        return null;
                    }
                    fvc.f("Null flags");
                    return null;
                }
                fvc.f("Null flags");
                return null;
            }
            fvc.f("Null flags");
            return null;
        }
        fvc.f("Null flags");
        return null;
    }

    @Override
    public final long h() {
        throw new NoSuchElementException();
    }

    @Override
    public final boolean h0() {
        byte b2 = this.a;
        return false;
    }

    @Override
    public final boolean h1(gb2 gb2Var, TL_iv.PageBlock pageBlock) {
        byte b2 = this.a;
        return false;
    }

    public final void i(r24 r24Var) {
        r24Var.a(fme.class, jwd.a);
        r24Var.a(pwe.class, sae.a);
        r24Var.a(nme.class, nwd.a);
        r24Var.a(rne.class, wwd.a);
        r24Var.a(cne.class, swd.a);
        r24Var.a(kne.class, dxd.a);
        r24Var.a(ghe.class, ird.a);
        r24Var.a(che.class, crd.a);
        r24Var.a(gke.class, cvd.a);
        r24Var.a(mve.class, x8e.a);
        r24Var.a(wge.class, vqd.a);
        r24Var.a(qge.class, rqd.a);
        r24Var.a(gpe.class, wzd.a);
        r24Var.a(fze.class, vtd.a);
        r24Var.a(sje.class, nud.a);
        r24Var.a(cje.class, ptd.a);
        r24Var.a(mpe.class, b0e.a);
        r24Var.a(qeb.class, i8e.a);
        r24Var.a(dve.class, o8e.a);
        r24Var.a(vue.class, d8e.a);
        r24Var.a(hoe.class, fyd.a);
        r24Var.a(bze.class, qmd.a);
        r24Var.a(noe.class, lyd.a);
        r24Var.a(wqe.class, t2e.a);
        r24Var.a(kre.class, k3e.a);
        r24Var.a(hre.class, e3e.a);
        r24Var.a(bre.class, x2e.a);
        r24Var.a(gte.class, l5e.a);
        r24Var.a(kte.class, q5e.a);
        r24Var.a(rte.class, r6e.a);
        r24Var.a(ote.class, k6e.a);
        r24Var.a(coe.class, yxd.a);
        r24Var.a(vte.class, x6e.a);
        r24Var.a(aue.class, d7e.a);
        r24Var.a(eue.class, j7e.a);
        r24Var.a(iue.class, o7e.a);
        r24Var.a(rue.class, v7e.a);
        r24Var.a(g9b.class, z7e.a);
        r24Var.a(dte.class, n4e.a);
        r24Var.a(mle.class, zvd.a);
        r24Var.a(wse.class, x4e.a);
        r24Var.a(qse.class, s4e.a);
        r24Var.a(xse.class, d5e.a);
        r24Var.a(hve.class, s8e.a);
        r24Var.a(jxe.class, oce.a);
        r24Var.a(ree.class, lod.a);
        r24Var.a(fee.class, ynd.a);
        r24Var.a(zde.class, snd.a);
        r24Var.a(lee.class, dod.a);
        r24Var.a(afe.class, vod.a);
        r24Var.a(wee.class, qod.a);
        r24Var.a(efe.class, yod.a);
        r24Var.a(kfe.class, bpd.a);
        r24Var.a(pfe.class, hpd.a);
        r24Var.a(ufe.class, npd.a);
        r24Var.a(zfe.class, upd.a);
        r24Var.a(led.class, vld.a);
        r24Var.a(xed.class, fmd.a);
        r24Var.a(qed.class, amd.a);
        r24Var.a(cle.class, qvd.a);
        r24Var.a(khe.class, prd.a);
        r24Var.a(z8d.class, gfd.a);
        r24Var.a(w8d.class, lfd.a);
        r24Var.a(tie.class, qsd.a);
        r24Var.a(r9d.class, qfd.a);
        r24Var.a(h9d.class, vfd.a);
        r24Var.a(zad.class, zhd.a);
        r24Var.a(uad.class, fid.a);
        r24Var.a(fad.class, zfd.a);
        r24Var.a(x9d.class, fgd.a);
        r24Var.a(scd.class, hjd.a);
        r24Var.a(mcd.class, pjd.a);
        r24Var.a(ldd.class, jkd.a);
        r24Var.a(edd.class, pkd.a);
        r24Var.a(ied.class, mld.a);
        r24Var.a(fed.class, qld.a);
        r24Var.a(sdd.class, skd.a);
        r24Var.a(pdd.class, ykd.a);
        r24Var.a(bed.class, eld.a);
        r24Var.a(vdd.class, hld.a);
        r24Var.a(kye.class, o9e.a);
        r24Var.a(mxe.class, urd.a);
        r24Var.a(aye.class, vxd.a);
        r24Var.a(wxe.class, pxd.a);
        r24Var.a(pxe.class, bud.a);
        r24Var.a(gye.class, i9e.a);
        r24Var.a(dye.class, d9e.a);
        r24Var.a(nye.class, t9e.a);
        r24Var.a(txe.class, hvd.a);
        r24Var.a(yye.class, bde.a);
        r24Var.a(wye.class, fde.a);
        r24Var.a(qye.class, vce.a);
        r24Var.a(qve.class, bae.a);
        r24Var.a(xke.class, lvd.a);
        r24Var.a(qle.class, ewd.a);
        r24Var.a(sde.class, vmd.a);
        r24Var.a(wje.class, rud.a);
        r24Var.a(ile.class, uvd.a);
        r24Var.a(xie.class, xsd.a);
        r24Var.a(cie.class, csd.a);
        r24Var.a(jie.class, gsd.a);
        r24Var.a(zhe.class, zrd.a);
        r24Var.a(pie.class, msd.a);
        r24Var.a(yne.class, kxd.a);
        r24Var.a(sne.class, hxd.a);
        r24Var.a(t8d.class, dfd.a);
        r24Var.a(axe.class, mbe.a);
        r24Var.a(gxe.class, xbe.a);
        r24Var.a(dxe.class, rbe.a);
        r24Var.a(nde.class, kmd.a);
        r24Var.a(nge.class, kqd.a);
        r24Var.a(ige.class, gqd.a);
        r24Var.a(ege.class, aqd.a);
        r24Var.a(qoe.class, azd.a);
        r24Var.a(cpe.class, nzd.a);
        r24Var.a(woe.class, hzd.a);
        r24Var.a(qad.class, mhd.a);
        r24Var.a(lad.class, shd.a);
        r24Var.a(spe.class, h0e.a);
        r24Var.a(gqe.class, z1e.a);
        r24Var.a(wpe.class, n0e.a);
        r24Var.a(bqe.class, s0e.a);
        r24Var.a(xbd.class, jid.a);
        r24Var.a(sbd.class, oid.a);
        r24Var.a(awe.class, mae.a);
        r24Var.a(vve.class, gae.a);
        r24Var.a(vwe.class, yae.a);
        r24Var.a(ywe.class, ibe.a);
        r24Var.a(ore.class, q3e.a);
        r24Var.a(lse.class, i4e.a);
        r24Var.a(ure.class, w3e.a);
        r24Var.a(hse.class, d4e.a);
        r24Var.a(zcd.class, xjd.a);
        r24Var.a(xcd.class, dkd.a);
        r24Var.a(ake.class, wud.a);
        r24Var.a(hje.class, iud.a);
        r24Var.a(iqe.class, e2e.a);
        r24Var.a(sqe.class, p2e.a);
        r24Var.a(mqe.class, i2e.a);
        r24Var.a(jcd.class, xid.a);
        r24Var.a(bcd.class, bjd.a);
    }

    @Override
    public final void i0(k27 k27Var) {
        byte b2 = this.a;
    }

    @Override
    public final void i1() {
        byte b2 = this.a;
    }

    @Override
    public final void i2(gb2 gb2Var, TLRPC.Chat chat, int i, float f2, float f3, boolean z) {
        byte b2 = this.a;
    }

    @Override
    public final void j2(gb2 gb2Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
        byte b2 = this.a;
    }

    @Override
    public final void k0(String str) {
        byte b2 = this.a;
    }

    @Override
    public final boolean k2(gb2 gb2Var, TLRPC.User user) {
        byte b2 = this.a;
        return false;
    }

    @Override
    public final boolean l() {
        byte b2 = this.a;
        return true;
    }

    @Override
    public final void l0(gb2 gb2Var, int i) {
        byte b2 = this.a;
    }

    @Override
    public final void l1(gb2 gb2Var) {
        byte b2 = this.a;
    }

    @Override
    public final boolean l2(gb2 gb2Var) {
        byte b2 = this.a;
        return false;
    }

    @Override
    public final void m1(gb2 gb2Var, TLRPC.ReactionCount reactionCount, boolean z, float f2, float f3) {
        byte b2 = this.a;
    }

    @Override
    public final qj0 n(String str, ze0 ze0Var, EnumMap enumMap) {
        w34 w34Var;
        int i;
        if (!str.isEmpty()) {
            if (ze0Var == ze0.d) {
                n24 n24Var = n24.a;
                if (enumMap.containsKey(n24Var)) {
                    w34Var = w34.valueOf(enumMap.get(n24Var).toString());
                } else {
                    w34Var = w34.L;
                }
                n24 n24Var2 = n24.c;
                if (enumMap.containsKey(n24Var2)) {
                    i = Integer.parseInt(enumMap.get(n24Var2).toString());
                } else {
                    i = 4;
                }
                rj0 rj0Var = (rj0) p24.b(str, w34Var, enumMap).f;
                if (rj0Var != null) {
                    int i2 = rj0Var.b;
                    int i3 = rj0Var.c;
                    int i4 = i << 1;
                    int i5 = i2 + i4;
                    int i6 = i4 + i3;
                    int max = Math.max(0, i5);
                    int max2 = Math.max(0, i6);
                    int min = Math.min(max / i5, max2 / i6);
                    int i7 = (max - (i2 * min)) / 2;
                    int i8 = (max2 - (i3 * min)) / 2;
                    qj0 qj0Var = new qj0(max, max2);
                    int i9 = 0;
                    while (i9 < i3) {
                        int i10 = i7;
                        int i11 = 0;
                        while (i11 < i2) {
                            if (rj0Var.e(i11, i9) == 1) {
                                qj0Var.d(i10, i8, min, min);
                            }
                            i11++;
                            i10 += min;
                        }
                        i9++;
                        i8 += min;
                    }
                    return qj0Var;
                }
                sdb.a();
                return null;
            }
            w26.i(ze0Var, "Can only encode QR_CODE, but got ");
            return null;
        }
        w26.j("Found empty contents");
        return null;
    }

    @Override
    public final void n1(gb2 gb2Var) {
        byte b2 = this.a;
    }

    @Override
    public final boolean next() {
        return false;
    }

    @Override
    public final void onFailure(Exception exc) {
        ce3 ce3Var = fe7.e;
        if (Log.isLoggable(ce3Var.b, 6)) {
            String str = ce3Var.c;
            String str2 = "Error preloading model resource";
            if (str != null) {
                str2 = str.concat("Error preloading model resource");
            }
            Log.e("MobileVisionBase", str2, exc);
        }
    }

    @Override
    public final void p() {
        byte b2 = this.a;
    }

    @Override
    public final void q(gb2 gb2Var) {
        byte b2 = this.a;
    }

    @Override
    public final void q0(gb2 gb2Var) {
        byte b2 = this.a;
    }

    @Override
    public final void q1(gb2 gb2Var) {
        byte b2 = this.a;
    }

    @Override
    public final boolean r0(gb2 gb2Var, boolean z) {
        byte b2 = this.a;
        return false;
    }

    @Override
    public final void r1(gb2 gb2Var, ArrayList arrayList, int i, int i2, int i3) {
        byte b2 = this.a;
    }

    @Override
    public final void s(gb2 gb2Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i) {
        byte b2 = this.a;
    }

    @Override
    public final void s2(gb2 gb2Var, float f2, float f3) {
        byte b2 = this.a;
    }

    @Override
    public final void t() {
        byte b2 = this.a;
    }

    @Override
    public final void u0(gb2 gb2Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        byte b2 = this.a;
    }

    @Override
    public final void u2() {
        byte b2 = this.a;
    }

    @Override
    public final Object v(Uri uri, s63 s63Var) {
        JsonReader jsonReader = new JsonReader(new InputStreamReader(s63Var));
        try {
            if (jsonReader.peek().equals(JsonToken.BEGIN_OBJECT)) {
                ?? em5Var = new em5(4);
                ?? em5Var2 = new em5(4);
                jsonReader.beginObject();
                Uri uri2 = null;
                int i = 1;
                long j = -9223372036854775807L;
                while (jsonReader.hasNext()) {
                    String nextName = jsonReader.nextName();
                    if (nextName.equals("VERSION") && jsonReader.peek().equals(JsonToken.NUMBER)) {
                        i = jsonReader.nextInt();
                    } else if (nextName.equals("TTL") && jsonReader.peek().equals(JsonToken.NUMBER)) {
                        j = jsonReader.nextInt() * 1000;
                    } else if (nextName.equals("RELOAD-URI") && jsonReader.peek().equals(JsonToken.STRING)) {
                        uri2 = Uri.parse(jsonReader.nextString());
                    } else if (nextName.equals("PATHWAY-PRIORITY") && jsonReader.peek().equals(JsonToken.BEGIN_ARRAY)) {
                        J3(jsonReader, em5Var);
                    } else if (nextName.equals("PATHWAY-CLONES") && jsonReader.peek().equals(JsonToken.BEGIN_ARRAY)) {
                        I3(jsonReader, em5Var2);
                    } else {
                        jsonReader.skipValue();
                    }
                }
                jsonReader.endObject();
                w59 f2 = em5Var.f();
                if (!f2.isEmpty()) {
                    hya hyaVar = new hya(i, j, uri2, f2, em5Var2.f());
                    jsonReader.close();
                    return hyaVar;
                }
                throw av7.c("PATHWAY-PRIORITY field is missing");
            }
            throw av7.c("Steering manifest JSON should be an object at root");
        } catch (Throwable th) {
            try {
                jsonReader.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override
    public final void v0(gb2 gb2Var, int i, int i2) {
        byte b2 = this.a;
    }

    @Override
    public final void v1(gb2 gb2Var, float f2, float f3) {
        byte b2 = this.a;
    }

    @Override
    public final void v2(gb2 gb2Var) {
        byte b2 = this.a;
    }

    public final int v3(int i) {
        if (i == 7) {
            return 6;
        }
        return 3;
    }

    @Override
    public final boolean w0(gb2 gb2Var, TLRPC.Chat chat) {
        byte b2 = this.a;
        return false;
    }

    @Override
    public final String x(long j) {
        byte b2 = this.a;
        return null;
    }

    @Override
    public final void x1(gb2 gb2Var) {
        byte b2 = this.a;
    }

    @Override
    public final void x2(gb2 gb2Var, boolean z, boolean z2) {
        byte b2 = this.a;
    }

    @Override
    public final boolean y1() {
        byte b2 = this.a;
        return false;
    }

    @Override
    public final boolean y2(int i) {
        byte b2 = this.a;
        return false;
    }

    @Override
    public final void z(gb2 gb2Var, float f2, float f3) {
        byte b2 = this.a;
    }

    @Override
    public final void z0(gb2 gb2Var, float f2, float f3, boolean z) {
        byte b2 = this.a;
    }

    @Override
    public final boolean z1(k27 k27Var) {
        byte b2 = this.a;
        return oo1.a(k27Var);
    }

    private final void C3() {
    }

    private final void D3() {
    }

    private final void E1() {
    }

    private final void G3() {
    }

    private final void H1() {
    }

    private final void H3() {
    }

    private final void J2() {
    }

    private final void K2() {
    }

    private final void M3() {
    }

    private final void N3() {
    }

    private final void R() {
    }

    private final void Z() {
    }

    private final void u() {
    }

    private final void x3() {
    }

    private final void y() {
    }

    private final void y3() {
    }

    @Override
    public final void finish() {
    }

    private final void A(gb2 gb2Var) {
    }

    private final void A0(gb2 gb2Var) {
    }

    private final void A2(gb2 gb2Var) {
    }

    private final void C(gb2 gb2Var) {
    }

    private final void C0(gb2 gb2Var) {
    }

    private final void E3(int i) {
    }

    private final void F3(int i) {
    }

    private final void G(gb2 gb2Var) {
    }

    private final void G0(h27 h27Var) {
    }

    private final void G2(gb2 gb2Var) {
    }

    private final void H0(h27 h27Var) {
    }

    private final void I0(gb2 gb2Var) {
    }

    private final void I2(gb2 gb2Var) {
    }

    private final void K0(gb2 gb2Var) {
    }

    private final void K3(k27 k27Var) {
    }

    private final void L(gb2 gb2Var) {
    }

    private final void L3(k27 k27Var) {
    }

    private final void P0(gb2 gb2Var) {
    }

    private final void Q0(gb2 gb2Var) {
    }

    private final void R2(String str) {
    }

    private final void S2(String str) {
    }

    private final void U0(gb2 gb2Var) {
    }

    private final void W0(gb2 gb2Var) {
    }

    private final void X2(gb2 gb2Var) {
    }

    private final void Y2(gb2 gb2Var) {
    }

    private final void b3(gb2 gb2Var) {
    }

    private final void c3(gb2 gb2Var) {
    }

    private final void d3(k27 k27Var) {
    }

    private final void e3(k27 k27Var) {
    }

    private final void f2(gb2 gb2Var) {
    }

    private final void f3(gb2 gb2Var) {
    }

    private final void g0(gb2 gb2Var) {
    }

    private final void g3(gb2 gb2Var) {
    }

    private final void h2(gb2 gb2Var) {
    }

    private final void j0(gb2 gb2Var) {
    }

    private final void j3(gb2 gb2Var) {
    }

    private final void k1(gb2 gb2Var) {
    }

    private final void k3(gb2 gb2Var) {
    }

    private final void o0(gb2 gb2Var) {
    }

    private final void o1(gb2 gb2Var) {
    }

    private final void p0(gb2 gb2Var) {
    }

    private final void p1(gb2 gb2Var) {
    }

    private final void q2(gb2 gb2Var) {
    }

    private final void r2(gb2 gb2Var) {
    }

    private final void s1(gb2 gb2Var) {
    }

    private final void t2(gb2 gb2Var) {
    }

    private final void w2(gb2 gb2Var) {
    }

    private final void z2(gb2 gb2Var) {
    }

    @Override
    public final void m(float f2) {
    }

    @Override
    public final void w(ue3 ue3Var) {
    }

    private final void B1(gb2 gb2Var, int i) {
    }

    private final void L0(gb2 gb2Var, iq0 iq0Var) {
    }

    private final void O0(gb2 gb2Var, iq0 iq0Var) {
    }

    private final void R0(gb2 gb2Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    private final void S0(gb2 gb2Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    private final void T2(gb2 gb2Var, long j) {
    }

    private final void U2(gb2 gb2Var, long j) {
    }

    private final void e1(gb2 gb2Var, int i) {
    }

    private final void f1(gb2 gb2Var, int i) {
    }

    private final void g1(gb2 gb2Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    private final void h3(gb2 gb2Var, k08 k08Var) {
    }

    private final void i3(gb2 gb2Var, k08 k08Var) {
    }

    private final void j1(gb2 gb2Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    private final void m0(gb2 gb2Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final void m2(String str, String str2) {
    }

    private final void m3(gb2 gb2Var, boolean z) {
    }

    private final void n0(gb2 gb2Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final void n2(String str, String str2) {
    }

    private final void o(gb2 gb2Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final void o3(gb2 gb2Var, boolean z) {
    }

    private final void q3(gb2 gb2Var, boolean z) {
    }

    private final void r(gb2 gb2Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final void s3(gb2 gb2Var, boolean z) {
    }

    private final void w1(gb2 gb2Var, int i) {
    }

    @Override
    public final void d(yz6 yz6Var, boolean z) {
    }

    private final void D2(gb2 gb2Var, float f2, float f3) {
    }

    private final void F2(gb2 gb2Var, float f2, float f3) {
    }

    private final void J1(gb2 gb2Var, float f2, float f3) {
    }

    private final void L1(gb2 gb2Var, float f2, float f3) {
    }

    private final void L2(gb2 gb2Var, CharacterStyle characterStyle, boolean z) {
    }

    private final void M2(gb2 gb2Var, CharacterStyle characterStyle, boolean z) {
    }

    private final void Z2(gb2 gb2Var, float f2, float f3) {
    }

    private final void a1(gb2 gb2Var, int i, int i2) {
    }

    private final void a3(gb2 gb2Var, float f2, float f3) {
    }

    private final void d1(gb2 gb2Var, int i, int i2) {
    }

    private final void j(gb2 gb2Var, float f2, float f3) {
    }

    private final void k(gb2 gb2Var, float f2, float f3) {
    }

    private final void n3(gb2 gb2Var, boolean z, boolean z2) {
    }

    private final void o2(gb2 gb2Var, TLRPC.Document document, RectF rectF) {
    }

    private final void p2(gb2 gb2Var, TLRPC.Document document, RectF rectF) {
    }

    private final void p3(gb2 gb2Var, boolean z, boolean z2) {
    }

    private final void r3(gb2 gb2Var, boolean z, boolean z2) {
    }

    private final void t3(gb2 gb2Var, boolean z, boolean z2) {
    }

    private final void x0(gb2 gb2Var, TLObject tLObject, boolean z) {
    }

    private final void y0(gb2 gb2Var, TLObject tLObject, boolean z) {
    }

    private final void N2(gb2 gb2Var, TLRPC.User user, float f2, float f3) {
    }

    private final void O2(gb2 gb2Var, TLRPC.User user, float f2, float f3) {
    }

    private final void P1(gb2 gb2Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i) {
    }

    private final void P2(gb2 gb2Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    private final void Q1(gb2 gb2Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i) {
    }

    private final void Q2(gb2 gb2Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    private final void t1(gb2 gb2Var, float f2, float f3, boolean z) {
    }

    private final void u1(gb2 gb2Var, float f2, float f3, boolean z) {
    }

    private final void S1(gb2 gb2Var, TLRPC.ReactionCount reactionCount, boolean z, float f2, float f3) {
    }

    private final void U1(gb2 gb2Var, TLRPC.ReactionCount reactionCount, boolean z, float f2, float f3) {
    }

    private final void V1(gb2 gb2Var, int i, float f2, float f3, boolean z) {
    }

    private final void V2(gb2 gb2Var, ArrayList arrayList, int i, int i2, int i3) {
    }

    private final void W2(gb2 gb2Var, ArrayList arrayList, int i, int i2, int i3) {
    }

    private final void a2(gb2 gb2Var, int i, float f2, float f3, boolean z) {
    }

    private final void s0(gb2 gb2Var, TLRPC.Chat chat, int i, float f2, float f3, boolean z) {
    }

    private final void t0(gb2 gb2Var, TLRPC.Chat chat, int i, float f2, float f3, boolean z) {
    }

    private final void A3(k27 k27Var, String str, String str2, String str3, String str4, int i, int i2) {
    }

    private final void B3(k27 k27Var, String str, String str2, String str3, String str4, int i, int i2) {
    }
}
