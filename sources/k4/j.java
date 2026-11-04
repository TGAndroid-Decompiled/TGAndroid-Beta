package k4;

import a0.l;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.WorkSource;
import android.text.Editable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import b8.ke;
import b8.oc;
import b8.od;
import b8.zb;
import com.google.android.gms.common.api.internal.d0;
import com.google.android.gms.common.api.internal.f1;
import com.google.android.gms.common.api.internal.s;
import com.google.android.gms.common.api.internal.t;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import d2.f0;
import d2.m;
import d2.u;
import d2.v;
import e3.i0;
import ei.v2;
import g2.k0;
import g2.n0;
import g2.y;
import g9.g2;
import g9.l0;
import g9.t0;
import gi.v5;
import i2.p;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;
import java.lang.reflect.Array;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.locks.ReentrantLock;
import l4.a0;
import m.o3;
import m.q;
import m2.x0;
import org.telegram.messenger.ILocationServiceProvider;
import org.telegram.messenger.a8;
import org.telegram.messenger.g0;
import org.telegram.messenger.ia;
import org.telegram.messenger.ja;
import org.telegram.messenger.ka;
import org.telegram.messenger.la;
import org.telegram.messenger.lt;
import org.telegram.messenger.ma;
import org.telegram.messenger.s9;
import org.telegram.messenger.t9;
import org.telegram.messenger.u10;
import org.telegram.messenger.u9;
import org.telegram.messenger.v9;
import org.telegram.messenger.vo;
import org.telegram.messenger.ye;
import org.telegram.ui.ActionBar.d2;
import org.telegram.ui.ActionBar.u0;
import org.telegram.ui.ActionBar.y0;
import org.telegram.ui.Components.bi;
import org.telegram.ui.Components.fc;
import org.telegram.ui.Components.i9;
import org.telegram.ui.Components.ki0;
import org.telegram.ui.Components.lx0;
import org.telegram.ui.Components.t4;
import org.telegram.ui.Components.uj;
import org.telegram.ui.Components.xw0;
import org.telegram.ui.Components.y41;
import org.telegram.ui.pu0;
import org.telegram.ui.rm0;
import org.telegram.ui.wm;
import org.telegram.ui.zx0;
import org.xmlpull.v1.XmlPullParserException;
public final class j implements b4.d, a0, OnCompleteListener, p5.b, ILocationServiceProvider, vo, ki0, rm0, zx0 {
    public Object f16869a;
    public Object f16870b;
    public Object f16871c;

    public j(Object obj, Object obj2, Object obj3) {
        this.f16869a = obj;
        this.f16870b = obj2;
        this.f16871c = obj3;
    }

    public static j F(Context context, AttributeSet attributeSet, int[] iArr, int i3) {
        return new j(context, context.obtainStyledAttributes(attributeSet, iArr, i3, 0));
    }

    public static StringBuilder G(String str) {
        StringBuilder sb2;
        String[] strArr;
        int i3;
        byte[] H;
        int i10;
        try {
            BufferedReader bufferedReader = new BufferedReader(new StringReader(str));
            int i11 = 0;
            boolean z10 = false;
            j jVar = null;
            String str2 = null;
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                } else if (!readLine.startsWith("PHOTO")) {
                    jVar = jVar;
                    if (readLine.indexOf(58) >= 0) {
                        if (readLine.startsWith("BEGIN:VCARD")) {
                            ?? obj = new Object();
                            obj.f16870b = new ArrayList();
                            obj.f16871c = new ArrayList();
                            jVar = obj;
                        } else {
                            jVar = jVar;
                            jVar = jVar;
                            if (readLine.startsWith("END:VCARD") && jVar != null) {
                                z10 = true;
                                jVar = jVar;
                            }
                        }
                    }
                    if (str2 != null) {
                        readLine = str2 + readLine;
                        str2 = null;
                    }
                    if (readLine.contains("=QUOTED-PRINTABLE") && readLine.endsWith("=")) {
                        str2 = readLine.substring(i11, readLine.length() - 1);
                    } else {
                        int indexOf = readLine.indexOf(":");
                        if (indexOf >= 0) {
                            strArr = new String[]{readLine.substring(i11, indexOf), readLine.substring(indexOf + 1).trim()};
                        } else {
                            strArr = new String[]{readLine.trim()};
                        }
                        if (strArr.length < 2 || jVar == null) {
                            i3 = i11;
                        } else if (strArr[i11].startsWith("ORG")) {
                            String[] split = strArr[i11].split(";");
                            int length = split.length;
                            int i12 = i11;
                            String str3 = null;
                            String str4 = null;
                            while (i12 < length) {
                                String[] split2 = split[i12].split("=");
                                sb2 = null;
                                try {
                                    if (split2.length != 2) {
                                        i10 = i11;
                                    } else {
                                        i10 = i11;
                                        if (split2[i11].equals("CHARSET")) {
                                            str4 = split2[1];
                                        } else if (split2[i10].equals("ENCODING")) {
                                            str3 = split2[1];
                                        }
                                    }
                                    i12++;
                                    i11 = i10;
                                } catch (Throwable unused) {
                                    return sb2;
                                }
                            }
                            i3 = i11;
                            jVar.f16869a = strArr[1];
                            if (str3 != null && str3.equalsIgnoreCase("QUOTED-PRINTABLE") && (H = g0.H(g0.h1((String) jVar.f16869a))) != null && H.length != 0) {
                                jVar.f16869a = new String(H, str4);
                            }
                            jVar.f16869a = ((String) jVar.f16869a).replace(';', ' ');
                        } else {
                            i3 = i11;
                            if (strArr[i3].startsWith("TEL")) {
                                if (strArr[1].length() > 0) {
                                    ((ArrayList) jVar.f16871c).add(strArr[1]);
                                }
                            } else if (strArr[i3].startsWith("EMAIL")) {
                                String str5 = strArr[1];
                                if (str5.length() > 0) {
                                    ((ArrayList) jVar.f16870b).add(str5);
                                }
                            }
                        }
                        i11 = i3;
                    }
                }
                return sb2;
            }
            int i13 = i11;
            sb2 = null;
            try {
                bufferedReader.close();
            } catch (Exception e10) {
                a8.g(e10, true);
            }
            if (!z10) {
                return null;
            }
            StringBuilder sb3 = new StringBuilder();
            for (int i14 = i13; i14 < ((ArrayList) jVar.f16871c).size(); i14++) {
                if (sb3.length() > 0) {
                    sb3.append('\n');
                }
                String str6 = (String) ((ArrayList) jVar.f16871c).get(i14);
                if (!str6.contains("#") && !str6.contains("*")) {
                    sb3.append(mf.b.c().b(str6));
                }
                sb3.append(str6);
            }
            for (int i15 = i13; i15 < ((ArrayList) jVar.f16870b).size(); i15++) {
                if (sb3.length() > 0) {
                    sb3.append('\n');
                }
                sb3.append(mf.b.c().b((String) ((ArrayList) jVar.f16870b).get(i15)));
            }
            if (!TextUtils.isEmpty((String) jVar.f16869a)) {
                if (sb3.length() > 0) {
                    sb3.append('\n');
                }
                sb3.append((String) jVar.f16869a);
            }
            return sb3;
        } catch (Throwable unused2) {
            return null;
        }
    }

    public static j k(View view) {
        return new j(view);
    }

    public static Object[] q(Object[] objArr, int[] iArr) {
        int length = objArr.length;
        Class<?> componentType = objArr.getClass().getComponentType();
        xw0 xw0Var = lx0.S;
        int i3 = -1;
        for (int i10 : iArr) {
            i3 = Math.max(i3, i10);
        }
        Object[] objArr2 = (Object[]) Array.newInstance(componentType, i3 + 1);
        for (int i11 = 0; i11 < length; i11++) {
            objArr2[iArr[i11]] = objArr[i11];
        }
        return objArr2;
    }

    public static p2.e s(f0 f0Var) {
        String uri;
        boolean z10;
        boolean z11;
        p pVar = new p();
        byte[] bArr = null;
        pVar.f14581c = null;
        Uri uri2 = f0Var.f8102b;
        if (uri2 == null) {
            uri = null;
        } else {
            uri = uri2.toString();
        }
        boolean z12 = f0Var.f8105f;
        ?? obj = new Object();
        if (z12 && TextUtils.isEmpty(uri)) {
            z10 = false;
        } else {
            z10 = true;
        }
        zb.f(z10);
        obj.f2378b = pVar;
        obj.f2379c = uri;
        obj.f2377a = z12;
        obj.d = new HashMap();
        l0 l0Var = f0Var.f8103c;
        t0 t0Var = l0Var.f12096a;
        if (t0Var == null) {
            t0Var = l0Var.c();
            l0Var.f12096a = t0Var;
        }
        g2 it = t0Var.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            str.getClass();
            str2.getClass();
            synchronized (((HashMap) obj.d)) {
                ((HashMap) obj.d).put(str, str2);
            }
        }
        HashMap hashMap = new HashMap();
        int i3 = m.f8182a;
        kb.a aVar = new kb.a(1);
        UUID uuid = f0Var.f8101a;
        uuid.getClass();
        boolean z13 = f0Var.d;
        boolean z14 = f0Var.f8104e;
        int[] f10 = od.f(f0Var.f8106g);
        for (int i10 : f10) {
            if (i10 != 2 && i10 != 1) {
                z11 = false;
            } else {
                z11 = true;
            }
            zb.f(z11);
        }
        p2.e eVar = new p2.e(uuid, obj, hashMap, z13, (int[]) f10.clone(), z14, aVar);
        byte[] bArr2 = f0Var.h;
        if (bArr2 != null) {
            bArr = Arrays.copyOf(bArr2, bArr2.length);
        }
        zb.p(eVar.f53107x.isEmpty());
        eVar.L = bArr;
        return eVar;
    }

    public Drawable A(int i3) {
        int resourceId;
        TypedArray typedArray = (TypedArray) this.f16870b;
        if (typedArray.hasValue(i3) && (resourceId = typedArray.getResourceId(i3, 0)) != 0) {
            return oc.b((Context) this.f16869a, resourceId);
        }
        return typedArray.getDrawable(i3);
    }

    public Drawable B(int i3) {
        int resourceId;
        Drawable f10;
        if (((TypedArray) this.f16870b).hasValue(i3) && (resourceId = ((TypedArray) this.f16870b).getResourceId(i3, 0)) != 0) {
            q a10 = q.a();
            Context context = (Context) this.f16869a;
            synchronized (a10) {
                f10 = a10.f18705a.f(resourceId, context, true);
            }
            return f10;
        }
        return null;
    }

    public Typeface C(int i3, int i10, k0 k0Var) {
        k0 k0Var2;
        XmlPullParserException xmlPullParserException;
        IOException iOException;
        int resourceId = ((TypedArray) this.f16870b).getResourceId(i3, 0);
        if (resourceId != 0) {
            if (((TypedValue) this.f16871c) == null) {
                this.f16871c = new TypedValue();
            }
            Context context = (Context) this.f16869a;
            TypedValue typedValue = (TypedValue) this.f16871c;
            ThreadLocal threadLocal = h0.j.f14082a;
            if (!context.isRestricted()) {
                Resources resources = context.getResources();
                resources.getValue(resourceId, typedValue, true);
                CharSequence charSequence = typedValue.string;
                if (charSequence != null) {
                    String charSequence2 = charSequence.toString();
                    if (!charSequence2.startsWith("res/")) {
                        k0Var.b();
                        return null;
                    }
                    int i11 = typedValue.assetCookie;
                    a0.j jVar = i0.e.f14502b;
                    Typeface typeface = (Typeface) jVar.a(i0.e.b(resources, resourceId, charSequence2, i11, i10));
                    if (typeface != null) {
                        new Handler(Looper.getMainLooper()).post(new g2.c(29, k0Var, typeface));
                        return typeface;
                    }
                    try {
                        if (charSequence2.toLowerCase().endsWith(".xml")) {
                            h0.d g7 = h0.b.g(resources.getXml(resourceId), resources);
                            if (g7 == null) {
                                try {
                                    Log.e("ResourcesCompat", "Failed to find font-family tag");
                                    k0Var.b();
                                    return null;
                                } catch (IOException e10) {
                                    iOException = e10;
                                    k0Var2 = k0Var;
                                    Log.e("ResourcesCompat", "Failed to read xml resource ".concat(charSequence2), iOException);
                                    k0Var2.b();
                                    return null;
                                } catch (XmlPullParserException e11) {
                                    xmlPullParserException = e11;
                                    k0Var2 = k0Var;
                                    Log.e("ResourcesCompat", "Failed to parse xml resource ".concat(charSequence2), xmlPullParserException);
                                    k0Var2.b();
                                    return null;
                                }
                            }
                            try {
                                return i0.e.a(context, g7, resources, resourceId, charSequence2, typedValue.assetCookie, i10, k0Var);
                            } catch (IOException e12) {
                                e = e12;
                                k0Var2 = k0Var;
                                iOException = e;
                                Log.e("ResourcesCompat", "Failed to read xml resource ".concat(charSequence2), iOException);
                                k0Var2.b();
                                return null;
                            } catch (XmlPullParserException e13) {
                                e = e13;
                                k0Var2 = k0Var;
                                xmlPullParserException = e;
                                Log.e("ResourcesCompat", "Failed to parse xml resource ".concat(charSequence2), xmlPullParserException);
                                k0Var2.b();
                                return null;
                            }
                        }
                        k0Var2 = k0Var;
                        try {
                            int i12 = typedValue.assetCookie;
                            Typeface e14 = i0.e.f14501a.e(context, resources, resourceId, charSequence2, i10);
                            if (e14 != null) {
                                jVar.b(i0.e.b(resources, resourceId, charSequence2, i12, i10), e14);
                            }
                            if (e14 != null) {
                                new Handler(Looper.getMainLooper()).post(new g2.c(29, k0Var2, e14));
                            } else {
                                k0Var2.b();
                            }
                            return e14;
                        } catch (IOException e15) {
                            e = e15;
                            iOException = e;
                            Log.e("ResourcesCompat", "Failed to read xml resource ".concat(charSequence2), iOException);
                            k0Var2.b();
                            return null;
                        } catch (XmlPullParserException e16) {
                            e = e16;
                            xmlPullParserException = e;
                            Log.e("ResourcesCompat", "Failed to parse xml resource ".concat(charSequence2), xmlPullParserException);
                            k0Var2.b();
                            return null;
                        }
                    } catch (IOException e17) {
                        e = e17;
                        k0Var2 = k0Var;
                    } catch (XmlPullParserException e18) {
                        e = e18;
                        k0Var2 = k0Var;
                    }
                } else {
                    throw new Resources.NotFoundException("Resource \"" + resources.getResourceName(resourceId) + "\" (" + Integer.toHexString(resourceId) + ") is not a Font: " + typedValue);
                }
            }
        }
        return null;
    }

    public Paint D(float f10, int i3) {
        Paint[] paintArr = (Paint[]) this.f16869a;
        if (paintArr[i3] == null) {
            Paint paint = new Paint(1);
            paintArr[i3] = paint;
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        }
        paintArr[i3].setShader(null);
        paintArr[i3].setColor(-65536);
        paintArr[i3].setAlpha((int) (f10 * 255.0f));
        return paintArr[i3];
    }

    public void H() {
        ((TypedArray) this.f16870b).recycle();
    }

    public void I(String str) {
        if (str != null) {
            this.f16869a = str;
            return;
        }
        throw new NullPointerException("Null backendName");
    }

    public void K(boolean z10, float f10) {
        y0[] y0VarArr = (y0[]) this.f16871c;
        for (int i3 = 0; i3 < y0VarArr.length; i3++) {
            if (z10 && ((i3 == 0 && Math.abs(f10 - 0.2f) < 0.01f) || ((i3 == 1 && Math.abs(f10 - 0.5f) < 0.1f) || ((i3 == 2 && Math.abs(f10 - 1.0f) < 0.1f) || ((i3 == 3 && Math.abs(f10 - 1.5f) < 0.1f) || (i3 == 4 && Math.abs(f10 - 2.0f) < 0.1f)))))) {
                y0VarArr[i3].d(-9718023, -9718023);
            } else {
                y0VarArr[i3].d(-328966, -328966);
            }
        }
        ((u0) this.f16870b).e(true, f10);
    }

    @Override
    public boolean O() {
        return false;
    }

    @Override
    public void a() {
        ((sf.b) this.f16869a).b();
        ((d2) this.f16870b).presentFragment(new wm((Bundle) this.f16871c));
    }

    @Override
    public void b(g2.l0 l0Var, e3.q qVar, l4.f0 f0Var) {
        this.f16870b = l0Var;
        f0Var.b();
        f0Var.c();
        i0 i02 = qVar.i0(f0Var.f17822c, 5);
        this.f16871c = i02;
        i02.g((v) this.f16869a);
    }

    @Override
    public void c(y yVar) {
        long d;
        long j10;
        ((g2.l0) this.f16870b).getClass();
        String str = n0.f11873a;
        g2.l0 l0Var = (g2.l0) this.f16870b;
        synchronized (l0Var) {
            try {
                long j11 = l0Var.f11866c;
                if (j11 != -9223372036854775807L) {
                    d = j11 + l0Var.f11865b;
                } else {
                    d = l0Var.d();
                }
                j10 = d;
            } finally {
            }
        }
        long e10 = ((g2.l0) this.f16870b).e();
        if (j10 != -9223372036854775807L && e10 != -9223372036854775807L) {
            v vVar = (v) this.f16869a;
            if (e10 != vVar.f8493x) {
                u a10 = vVar.a();
                a10.f8435w = e10;
                v vVar2 = new v(a10);
                this.f16869a = vVar2;
                ((i0) this.f16871c).g(vVar2);
            }
            int a11 = yVar.a();
            ((i0) this.f16871c).e(a11, yVar);
            ((i0) this.f16871c).d(j10, 1, a11, 0, null);
        }
    }

    @Override
    public void c0() {
        ((uj) this.f16871c).R.A();
    }

    @Override
    public void checkLocationSettings(la laVar, q0.a aVar) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(((v9) laVar).f25842a);
        t7.c cVar = (t7.c) this.f16870b;
        i8.c cVar2 = new i8.c(arrayList, false, false);
        cVar.getClass();
        s b10 = t.b();
        b10.f6737c = new i9(cVar2, 19);
        b10.f6735a = 2426;
        cVar.e(0, b10.a()).addOnCompleteListener(new s9(aVar, 1));
    }

    @Override
    public boolean checkServices() {
        return lt.f24103b.hasServices();
    }

    @Override
    public int d(long j10) {
        long[] jArr = (long[]) this.f16871c;
        int b10 = n0.b(jArr, j10, false);
        if (b10 < jArr.length) {
            return b10;
        }
        return -1;
    }

    @Override
    public boolean e() {
        return true;
    }

    @Override
    public void f() {
        u10 u10Var;
        boolean[] zArr = (boolean[]) this.f16869a;
        if (!zArr[0] && (u10Var = (u10) this.f16870b) != null) {
            zArr[0] = true;
            u10Var.a(Boolean.TRUE);
        }
        g0.i3(new pu0((fc) this.f16871c, 8), 200L);
    }

    @Override
    public Object mo5get() {
        return new n5.s(new kb.a(27), new v7.s(26), (s5.b) ((ke) this.f16869a).mo5get(), (ha.c) ((fa.f) this.f16870b).mo5get(), (za.p) ((ui.f) this.f16871c).mo5get());
    }

    @Override
    public void getLastLocation(q0.a aVar) {
        t7.c cVar = (t7.c) this.f16869a;
        cVar.getClass();
        s b10 = t.b();
        b10.f6737c = t7.a.f54950c;
        b10.f6735a = 2414;
        cVar.e(0, b10.a()).addOnCompleteListener(new s9(aVar, 0));
    }

    @Override
    public long h(int i3) {
        boolean z10;
        long[] jArr = (long[]) this.f16871c;
        boolean z11 = false;
        if (i3 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        zb.f(z10);
        if (i3 < jArr.length) {
            z11 = true;
        }
        zb.f(z11);
        return jArr[i3];
    }

    @Override
    public void init(Context context) {
        com.google.android.gms.common.api.e eVar = i8.b.f14696a;
        com.google.android.gms.common.api.i iVar = com.google.android.gms.common.api.i.f6594c;
        com.google.android.gms.common.api.e eVar2 = t7.c.f54952l;
        com.google.android.gms.common.api.a aVar = com.google.android.gms.common.api.b.f6584j;
        this.f16869a = new com.google.android.gms.common.api.j(context, eVar2, aVar, iVar);
        this.f16870b = new com.google.android.gms.common.api.j(context, eVar2, aVar, iVar);
    }

    @Override
    public void j(boolean z10) {
        ((sf.b) this.f16869a).b();
        ((d2) this.f16870b).presentFragment(new wm((Bundle) this.f16871c));
    }

    public n5.i l() {
        String str;
        if (((String) this.f16869a) == null) {
            str = " backendName";
        } else {
            str = "";
        }
        if (((k5.d) this.f16871c) == null) {
            str = str.concat(" priority");
        }
        if (str.isEmpty()) {
            return new n5.i((String) this.f16869a, (byte[]) this.f16870b, (k5.d) this.f16871c);
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    public String n(int i3, long j10, long j11, String str) {
        ArrayList arrayList = (ArrayList) this.f16869a;
        ArrayList arrayList2 = (ArrayList) this.f16871c;
        ArrayList arrayList3 = (ArrayList) this.f16870b;
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 0; i10 < arrayList3.size(); i10++) {
            sb2.append((String) arrayList.get(i10));
            if (((Integer) arrayList3.get(i10)).intValue() == 1) {
                sb2.append(str);
            } else if (((Integer) arrayList3.get(i10)).intValue() == 2) {
                sb2.append(String.format(Locale.US, (String) arrayList2.get(i10), Long.valueOf(j10)));
            } else if (((Integer) arrayList3.get(i10)).intValue() == 3) {
                sb2.append(String.format(Locale.US, (String) arrayList2.get(i10), Integer.valueOf(i3)));
            } else if (((Integer) arrayList3.get(i10)).intValue() == 4) {
                sb2.append(String.format(Locale.US, (String) arrayList2.get(i10), Long.valueOf(j11)));
            }
        }
        sb2.append((String) arrayList.get(arrayList3.size()));
        return sb2.toString();
    }

    public void o(Canvas canvas, RectF rectF, float f10) {
        Paint[] paintArr = (Paint[]) this.f16869a;
        if (paintArr[0] == null) {
            Paint paint = new Paint(1);
            paintArr[0] = paint;
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        }
        paintArr[0].setShader((LinearGradient) this.f16870b);
        paintArr[0].setAlpha((int) (f10 * 255.0f));
        canvas.drawRect(rectF, paintArr[0]);
    }

    @Override
    public void onComplete(Task task) {
        String str = (String) this.f16870b;
        ScheduledFuture scheduledFuture = (ScheduledFuture) this.f16871c;
        l lVar = ((l6.c) this.f16869a).f18059a;
        synchronized (lVar) {
            lVar.remove(str);
        }
        scheduledFuture.cancel(false);
    }

    @Override
    public la onCreateLocationRequest() {
        LocationRequest locationRequest = new LocationRequest(102, 3600000L, 600000L, 0L, Long.MAX_VALUE, Long.MAX_VALUE, Integer.MAX_VALUE, 0.0f, true, 3600000L, 0, 0, null, false, new WorkSource(), null);
        ?? obj = new Object();
        obj.f25842a = locationRequest;
        return obj;
    }

    @Override
    public ma onCreateLocationServicesAPI(Context context, ia iaVar, final ja jaVar) {
        List list;
        boolean z10;
        Context context2 = org.telegram.messenger.t0.f25457b;
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        ?? lVar = new l(0);
        ?? lVar2 = new l(0);
        Object obj = m6.d.d;
        a6.b bVar = p8.b.f53426a;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Looper mainLooper = context2.getMainLooper();
        String packageName = context2.getPackageName();
        String name = context2.getClass().getName();
        com.google.android.gms.common.api.e eVar = i8.b.f14696a;
        p6.m.h(eVar, "Api must not be null");
        com.google.android.gms.common.api.e eVar2 = null;
        lVar2.put(eVar, null);
        a6.b bVar2 = eVar.f6585a;
        p6.m.h(bVar2, "Base client builder must not be null");
        switch (bVar2.f137a) {
            case 20:
                list = Collections.EMPTY_LIST;
                break;
            default:
                list = Collections.EMPTY_LIST;
                break;
        }
        hashSet2.addAll(list);
        hashSet.addAll(list);
        arrayList.add(new u9(iaVar));
        arrayList2.add(new com.google.android.gms.common.api.l() {
            @Override
            public final void onConnectionFailed(m6.a aVar) {
                ld ldVar = (ld) ja.this;
                if (!ldVar.M) {
                    ldVar.L = Boolean.FALSE;
                    if (ldVar.E) {
                        ldVar.E = false;
                        ldVar.p();
                    }
                }
            }
        });
        boolean z11 = true;
        p6.m.a("must call addApi() to add at least one API", !lVar2.isEmpty());
        p8.a aVar = p8.a.f53425a;
        com.google.android.gms.common.api.e eVar3 = p8.b.f53427b;
        if (lVar2.containsKey(eVar3)) {
            aVar = (p8.a) lVar2.get(eVar3);
        }
        o3 o3Var = new o3(hashSet, lVar, packageName, name, aVar);
        Map map = (Map) o3Var.f18684c;
        l lVar3 = new l(0);
        l lVar4 = new l(0);
        ArrayList arrayList3 = new ArrayList();
        Iterator it = ((a0.c) lVar2.keySet()).iterator();
        l lVar5 = lVar2;
        while (true) {
            a0.b bVar3 = (a0.b) it;
            if (bVar3.hasNext()) {
                com.google.android.gms.common.api.e eVar4 = (com.google.android.gms.common.api.e) bVar3.next();
                Object obj2 = lVar5.get(eVar4);
                if (map.get(eVar4) != null) {
                    z10 = z11;
                } else {
                    z10 = false;
                }
                lVar3.put(eVar4, Boolean.valueOf(z10));
                l lVar6 = lVar4;
                Looper looper = mainLooper;
                f1 f1Var = new f1(eVar4, z10);
                arrayList3.add(f1Var);
                a6.b bVar4 = eVar4.f6585a;
                p6.m.g(bVar4);
                ArrayList arrayList4 = arrayList3;
                Map map2 = map;
                o3 o3Var2 = o3Var;
                l lVar7 = lVar5;
                l lVar8 = lVar3;
                com.google.android.gms.common.api.c a10 = bVar4.a(context2, looper, o3Var2, obj2, f1Var, f1Var);
                lVar6.put(eVar4.f6586b, a10);
                p6.d dVar = (p6.d) a10;
                dVar.getClass();
                if (dVar instanceof c6.e) {
                    if (eVar2 == null) {
                        mainLooper = looper;
                        o3Var = o3Var2;
                        eVar2 = eVar4;
                    } else {
                        String str = eVar4.f6587c;
                        String str2 = eVar2.f6587c;
                        throw new IllegalStateException(org.telegram.ui.Cells.f1.r(str, " cannot be used with ", str2, new StringBuilder(String.valueOf(str).length() + 21 + String.valueOf(str2).length())));
                    }
                } else {
                    mainLooper = looper;
                    o3Var = o3Var2;
                }
                lVar4 = lVar6;
                map = map2;
                lVar3 = lVar8;
                lVar5 = lVar7;
                arrayList3 = arrayList4;
                z11 = true;
            } else {
                o3 o3Var3 = o3Var;
                a0.f fVar = lVar3;
                a0.f fVar2 = lVar4;
                ArrayList arrayList5 = arrayList3;
                Looper looper2 = mainLooper;
                if (eVar2 != null) {
                    boolean equals = hashSet.equals(hashSet2);
                    String str3 = eVar2.f6587c;
                    if (!equals) {
                        throw new IllegalStateException(a1.g.q("Must not set scopes in GoogleApiClient.Builder when using ", str3, ". Set account in GoogleSignInOptions.Builder instead."));
                    }
                }
                d0 d0Var = new d0(context2, new ReentrantLock(), looper2, o3Var3, fVar, arrayList, arrayList2, fVar2, d0.j(fVar2.values(), true), arrayList5);
                Set set = com.google.android.gms.common.api.m.f6781a;
                synchronized (set) {
                    set.add(d0Var);
                }
                v5 v5Var = new v5(23);
                v5Var.f13688b = d0Var;
                return v5Var;
            }
        }
    }

    @Override
    public List p(long j10) {
        List list = (List) this.f16869a;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i3 = 0; i3 < list.size(); i3++) {
            long[] jArr = (long[]) this.f16870b;
            int i10 = i3 * 2;
            if (jArr[i10] <= j10 && j10 < jArr[i10 + 1]) {
                c cVar = (c) list.get(i3);
                f2.b bVar = cVar.f16845a;
                if (bVar.f11364e == -3.4028235E38f) {
                    arrayList2.add(cVar);
                } else {
                    arrayList.add(bVar);
                }
            }
        }
        Collections.sort(arrayList2, new a3.u(21));
        for (int i11 = 0; i11 < arrayList2.size(); i11++) {
            f2.b bVar2 = ((c) arrayList2.get(i11)).f16845a;
            arrayList.add(new f2.b(bVar2.f11361a, bVar2.f11362b, bVar2.f11363c, bVar2.d, (-1) - i11, 1, bVar2.f11366g, bVar2.h, bVar2.f11367i, bVar2.f11372n, bVar2.f11373o, bVar2.f11368j, bVar2.f11369k, bVar2.f11370l, bVar2.f11371m, bVar2.f11374p, bVar2.f11375q, bVar2.f11376r));
        }
        return arrayList;
    }

    @Override
    public boolean r() {
        return true;
    }

    @Override
    public synchronized void removeLocationUpdates(ka kaVar) {
        t9 t9Var = (t9) ((HashMap) this.f16871c).remove(kaVar);
        if (t9Var != null) {
            t7.c cVar = (t7.c) this.f16869a;
            cVar.getClass();
            String simpleName = t9.class.getSimpleName();
            p6.m.f(simpleName, "Listener type must not be empty");
            cVar.c(new com.google.android.gms.common.api.internal.m(t9Var, simpleName), 2418).continueWith(t7.b.f54951a, t7.a.f54949b);
        }
    }

    @Override
    public synchronized void requestLocationUpdates(la laVar, ka kaVar) {
        t9 t9Var = (t9) ((HashMap) this.f16871c).remove(kaVar);
        if (t9Var != null) {
            t7.c cVar = (t7.c) this.f16869a;
            cVar.getClass();
            String simpleName = t9.class.getSimpleName();
            p6.m.f(simpleName, "Listener type must not be empty");
            cVar.c(new com.google.android.gms.common.api.internal.m(t9Var, simpleName), 2418).continueWith(t7.b.f54951a, t7.a.f54949b);
        }
        t9 t9Var2 = new t9(kaVar);
        ((HashMap) this.f16871c).put(kaVar, t9Var2);
        ((t7.c) this.f16869a).f(((v9) laVar).f25842a, t9Var2, Looper.getMainLooper());
    }

    @Override
    public int t() {
        return ((long[]) this.f16871c).length;
    }

    @Override
    public boolean v() {
        return false;
    }

    @Override
    public void v0(int i3, boolean z10, boolean z11) {
        String str;
        if (!z10) {
            uj ujVar = (uj) this.f16871c;
            HashMap hashMap = (HashMap) this.f16869a;
            ArrayList arrayList = (ArrayList) this.f16870b;
            bi biVar = ujVar.f38416b;
            if (!hashMap.isEmpty() && ujVar.R != null && !ujVar.L) {
                ujVar.L = true;
                ArrayList arrayList2 = new ArrayList();
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    Object obj = hashMap.get(arrayList.get(i10));
                    ?? obj2 = new Object();
                    arrayList2.add(obj2);
                    if (obj instanceof ye) {
                        ye yeVar = (ye) obj;
                        String str2 = yeVar.h;
                        if (str2 != null) {
                            obj2.f26477c = str2;
                        } else {
                            obj2.f26477c = yeVar.I;
                        }
                        obj2.f26478e = yeVar.f25311c;
                        obj2.f26479f = yeVar.f25314g;
                        obj2.f26483k = yeVar.f25325s;
                        obj2.f26487o = yeVar.f25310b;
                        CharSequence charSequence = yeVar.f25309a;
                        if (charSequence != null) {
                            str = charSequence.toString();
                        } else {
                            str = null;
                        }
                        obj2.d = str;
                        obj2.f26481i = yeVar.f25320n;
                        obj2.f26482j = yeVar.f25324r;
                        obj2.h = yeVar.f25329x;
                    }
                }
                t4.Z(biVar.E3, biVar.X0() + arrayList2.size(), biVar.b1(), new v2(i3, 2, ujVar, arrayList2, z11));
            }
        }
    }

    public void w(Canvas canvas, RectF rectF, int i3, float f10) {
        Paint[] paintArr = (Paint[]) this.f16869a;
        Matrix matrix = (Matrix) this.f16871c;
        if (f10 <= 0.0f) {
            return;
        }
        if (((LinearGradient) this.f16870b) == null) {
            this.f16870b = new LinearGradient(0.0f, 0.0f, 0.0f, 16.0f, new int[]{-65536, 16711680}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        }
        if (paintArr[i3] == null) {
            paintArr[i3] = new Paint(1);
            paintArr[i3].setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        }
        paintArr[i3].setShader((LinearGradient) this.f16870b);
        matrix.reset();
        if (i3 == 0) {
            matrix.postScale(1.0f, rectF.width() / 16.0f);
            matrix.postRotate(-90.0f);
            matrix.postTranslate(rectF.left, rectF.top);
        } else if (i3 == 1) {
            matrix.postScale(1.0f, rectF.height() / 16.0f);
            matrix.postTranslate(rectF.left, rectF.top);
        } else if (i3 == 2) {
            matrix.postScale(1.0f, rectF.width() / 16.0f);
            matrix.postRotate(90.0f);
            matrix.postTranslate(rectF.right, rectF.top);
        } else if (i3 == 3) {
            matrix.postScale(1.0f, rectF.height() / 16.0f);
            matrix.postScale(1.0f, -1.0f);
            matrix.postTranslate(rectF.left, rectF.bottom);
        }
        ((LinearGradient) this.f16870b).setLocalMatrix(matrix);
        paintArr[i3].setAlpha((int) (255.0f * f10));
        canvas.drawRect(rectF, paintArr[i3]);
    }

    public p2.m x(d2.n0 n0Var) {
        p2.e eVar;
        n0Var.f8241b.getClass();
        f0 f0Var = n0Var.f8241b.f8141c;
        if (f0Var == null) {
            return p2.m.f53118z;
        }
        synchronized (this.f16869a) {
            try {
                if (!f0Var.equals((f0) this.f16870b)) {
                    this.f16870b = f0Var;
                    this.f16871c = s(f0Var);
                }
                eVar = (p2.e) this.f16871c;
                eVar.getClass();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return eVar;
    }

    public ColorStateList y(int i3) {
        int resourceId;
        ColorStateList a10;
        TypedArray typedArray = (TypedArray) this.f16870b;
        if (typedArray.hasValue(i3) && (resourceId = typedArray.getResourceId(i3, 0)) != 0 && (a10 = oc.a((Context) this.f16869a, resourceId)) != null) {
            return a10;
        }
        return typedArray.getColorStateList(i3);
    }

    @Override
    public void z(android.view.View r13, dh.n0 r14, boolean r15, boolean r16) {
        throw new UnsupportedOperationException("Method not decompiled: k4.j.z(android.view.View, dh.n0, boolean, boolean):void");
    }

    public j(boolean z10, Object obj, Object obj2, Object obj3) {
        this.f16871c = obj;
        this.f16869a = obj2;
        this.f16870b = obj3;
    }

    public j(Context context) {
        this.f16869a = context;
    }

    public j(int i3) {
        switch (i3) {
            case 24:
                this.f16869a = new Paint[4];
                this.f16871c = new Matrix();
                return;
            case 28:
                this.f16869a = new Object();
                return;
            default:
                this.f16871c = new HashMap();
                return;
        }
    }

    public j(View view) {
        this.f16871c = view;
        y41 y41Var = new y41(this, view);
        this.f16869a = y41Var;
        view.addOnLayoutChangeListener(y41Var);
    }

    public j(String str) {
        u uVar = new u();
        uVar.f8430q = d2.u0.n("video/mp2t");
        uVar.f8431r = d2.u0.n(str);
        this.f16869a = new v(uVar);
    }

    public j(Context context, TypedArray typedArray) {
        this.f16869a = context;
        this.f16870b = typedArray;
    }

    @Override
    public void J() {
    }

    @Override
    public void g() {
    }

    @Override
    public void i() {
    }

    @Override
    public void m() {
    }

    public j(e2.m... mVarArr) {
        x0 x0Var = new x0();
        ?? obj = new Object();
        obj.f9392c = 1.0f;
        obj.d = 1.0f;
        e2.j jVar = e2.j.f9352e;
        obj.f9393e = jVar;
        obj.f9394f = jVar;
        obj.f9395g = jVar;
        obj.h = jVar;
        ByteBuffer byteBuffer = e2.m.f9358a;
        obj.f9398k = byteBuffer;
        obj.f9399l = byteBuffer;
        obj.f9391b = -1;
        e2.m[] mVarArr2 = new e2.m[mVarArr.length + 2];
        this.f16869a = mVarArr2;
        System.arraycopy(mVarArr, 0, mVarArr2, 0, mVarArr.length);
        this.f16870b = x0Var;
        this.f16871c = obj;
        mVarArr2[mVarArr.length] = x0Var;
        mVarArr2[mVarArr.length + 1] = obj;
    }

    @Override
    public void u(Editable editable) {
    }

    @Override
    public void E(Canvas canvas, RectF rectF, float f10, float f11, float f12, int i3, boolean z10) {
    }
}
