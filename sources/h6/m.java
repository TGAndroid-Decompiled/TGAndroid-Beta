package h6;

import a8.ia;
import a8.p0;
import a8.r7;
import ab.b0;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
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
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.WorkSource;
import android.text.Editable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewTreeObserver;
import bi.m6;
import bi.x5;
import com.google.android.gms.common.api.internal.d0;
import com.google.android.gms.common.api.internal.e1;
import com.google.android.gms.common.api.internal.s;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import di.r2;
import e2.s0;
import e2.t;
import e2.u;
import f3.j0;
import gb.j1;
import h2.k0;
import h2.m0;
import h2.x;
import j$.util.DesugarCollections;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;
import java.lang.reflect.Array;
import java.nio.ByteBuffer;
import java.security.Signature;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.locks.ReentrantLock;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import m.q3;
import m4.a0;
import org.telegram.messenger.ILocationServiceProvider;
import org.telegram.messenger.a8;
import org.telegram.messenger.aa;
import org.telegram.messenger.ba;
import org.telegram.messenger.ep;
import org.telegram.messenger.g0;
import org.telegram.messenger.gf;
import org.telegram.messenger.ha;
import org.telegram.messenger.pa;
import org.telegram.messenger.qa;
import org.telegram.messenger.ra;
import org.telegram.messenger.sa;
import org.telegram.messenger.t0;
import org.telegram.messenger.ta;
import org.telegram.messenger.tt;
import org.telegram.messenger.y9;
import org.telegram.messenger.z9;
import org.telegram.ui.ActionBar.f2;
import org.telegram.ui.ActionBar.v0;
import org.telegram.ui.ActionBar.z0;
import org.telegram.ui.Cells.f1;
import org.telegram.ui.Components.ci;
import org.telegram.ui.Components.f51;
import org.telegram.ui.Components.hi0;
import org.telegram.ui.Components.mx0;
import org.telegram.ui.Components.qt;
import org.telegram.ui.Components.u4;
import org.telegram.ui.Components.uj;
import org.telegram.ui.Components.yw0;
import org.telegram.ui.cn;
import org.telegram.ui.zm0;
import org.xmlpull.v1.XmlPullParserException;
public final class m implements ib.b, c4.d, a0, OnCompleteListener, q5.b, ILocationServiceProvider, ep, hi0, zm0 {
    public final int f14265a;
    public Object f14266b;
    public Object f14267c;
    public Object d;

    public m(int i7, boolean z9) {
        this.f14265a = i7;
    }

    public static m g(View view) {
        return new m(view);
    }

    public static Object[] l(Object[] objArr, int[] iArr) {
        int length = objArr.length;
        Class<?> componentType = objArr.getClass().getComponentType();
        yw0 yw0Var = mx0.S;
        int i7 = -1;
        for (int i10 : iArr) {
            i7 = Math.max(i7, i10);
        }
        Object[] objArr2 = (Object[]) Array.newInstance(componentType, i7 + 1);
        for (int i11 = 0; i11 < length; i11++) {
            objArr2[iArr[i11]] = objArr[i11];
        }
        return objArr2;
    }

    public static m x(Context context, AttributeSet attributeSet, int[] iArr, int i7) {
        return new m(context, context.obtainStyledAttributes(attributeSet, iArr, i7, 0));
    }

    public static StringBuilder z(String str) {
        StringBuilder sb2;
        String[] strArr;
        int i7;
        byte[] H;
        int i10;
        try {
            BufferedReader bufferedReader = new BufferedReader(new StringReader(str));
            int i11 = 0;
            boolean z9 = false;
            m mVar = null;
            String str2 = null;
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                } else if (!readLine.startsWith("PHOTO")) {
                    if (readLine.indexOf(58) >= 0) {
                        if (readLine.startsWith("BEGIN:VCARD")) {
                            mVar = new m(20, false);
                            mVar.f14267c = new ArrayList();
                            mVar.d = new ArrayList();
                        } else if (readLine.startsWith("END:VCARD") && mVar != null) {
                            z9 = true;
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
                        if (strArr.length < 2 || mVar == null) {
                            i7 = i11;
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
                            i7 = i11;
                            mVar.f14266b = strArr[1];
                            if (str3 != null && str3.equalsIgnoreCase("QUOTED-PRINTABLE") && (H = g0.H(g0.h1((String) mVar.f14266b))) != null && H.length != 0) {
                                mVar.f14266b = new String(H, str4);
                            }
                            mVar.f14266b = ((String) mVar.f14266b).replace(';', ' ');
                        } else {
                            i7 = i11;
                            if (strArr[i7].startsWith("TEL")) {
                                if (strArr[1].length() > 0) {
                                    ((ArrayList) mVar.d).add(strArr[1]);
                                }
                            } else if (strArr[i7].startsWith("EMAIL")) {
                                String str5 = strArr[1];
                                if (str5.length() > 0) {
                                    ((ArrayList) mVar.f14267c).add(str5);
                                }
                            }
                        }
                        i11 = i7;
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
            if (!z9) {
                return null;
            }
            StringBuilder sb3 = new StringBuilder();
            for (int i14 = i13; i14 < ((ArrayList) mVar.d).size(); i14++) {
                if (sb3.length() > 0) {
                    sb3.append('\n');
                }
                String str6 = (String) ((ArrayList) mVar.d).get(i14);
                if (!str6.contains("#") && !str6.contains("*")) {
                    sb3.append(pf.b.c().b(str6));
                }
                sb3.append(str6);
            }
            for (int i15 = i13; i15 < ((ArrayList) mVar.f14267c).size(); i15++) {
                if (sb3.length() > 0) {
                    sb3.append('\n');
                }
                sb3.append(pf.b.c().b((String) ((ArrayList) mVar.f14267c).get(i15)));
            }
            if (!TextUtils.isEmpty((String) mVar.f14266b)) {
                if (sb3.length() > 0) {
                    sb3.append('\n');
                }
                sb3.append((String) mVar.f14266b);
            }
            return sb3;
        } catch (Throwable unused2) {
            return null;
        }
    }

    public void C() {
        ((TypedArray) this.f14267c).recycle();
    }

    public void D(b3.a aVar) {
        m2.j jVar = (m2.j) ((HashMap) this.f14266b).remove(aVar);
        jVar.getClass();
        l2.g gVar = (l2.g) ((l2.h) this.d).f17840p.get(jVar);
        if (gVar != null) {
            synchronized (gVar) {
                gVar.d--;
            }
        }
    }

    @Override
    public boolean E() {
        return false;
    }

    public void F(String str) {
        if (str != null) {
            this.f14266b = str;
            return;
        }
        throw new NullPointerException("Null backendName");
    }

    public synchronized void G() {
        ((l2.h) this.d).f17829c.e();
    }

    public void H(boolean z9, float f10) {
        z0[] z0VarArr = (z0[]) this.d;
        for (int i7 = 0; i7 < z0VarArr.length; i7++) {
            if (z9 && ((i7 == 0 && Math.abs(f10 - 0.2f) < 0.01f) || ((i7 == 1 && Math.abs(f10 - 0.5f) < 0.1f) || ((i7 == 2 && Math.abs(f10 - 1.0f) < 0.1f) || ((i7 == 3 && Math.abs(f10 - 1.5f) < 0.1f) || (i7 == 4 && Math.abs(f10 - 2.0f) < 0.1f)))))) {
                z0VarArr[i7].d(-9718023, -9718023);
            } else {
                z0VarArr[i7].d(-328966, -328966);
            }
        }
        ((v0) this.f14267c).e(true, f10);
    }

    @Override
    public boolean U() {
        return false;
    }

    @Override
    public void a() {
        ((vf.b) this.f14266b).b();
        ((f2) this.f14267c).presentFragment(new cn((Bundle) this.d));
    }

    @Override
    public void b(k0 k0Var, f3.q qVar, m4.g0 g0Var) {
        this.f14267c = k0Var;
        g0Var.b();
        g0Var.c();
        j0 O1 = qVar.O1(g0Var.f19678c, 5);
        this.d = O1;
        O1.g((u) this.f14266b);
    }

    @Override
    public void c(x xVar) {
        long d;
        long j3;
        ((k0) this.f14267c).getClass();
        String str = m0.f14114a;
        k0 k0Var = (k0) this.f14267c;
        synchronized (k0Var) {
            try {
                long j10 = k0Var.f14107c;
                if (j10 != -9223372036854775807L) {
                    d = j10 + k0Var.f14106b;
                } else {
                    d = k0Var.d();
                }
                j3 = d;
            } finally {
            }
        }
        long e10 = ((k0) this.f14267c).e();
        if (j3 != -9223372036854775807L && e10 != -9223372036854775807L) {
            u uVar = (u) this.f14266b;
            if (e10 != uVar.f10624x) {
                t a10 = uVar.a();
                a10.f10572w = e10;
                u uVar2 = new u(a10);
                this.f14266b = uVar2;
                ((j0) this.d).g(uVar2);
            }
            int a11 = xVar.a();
            ((j0) this.d).b(a11, xVar);
            ((j0) this.d).c(j3, 1, a11, 0, null);
        }
    }

    @Override
    public void checkLocationSettings(sa saVar, q0.a aVar) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(((ba) saVar).f21638a);
        u7.c cVar = (u7.c) this.f14267c;
        j8.c cVar2 = new j8.c(arrayList, false, false);
        cVar.getClass();
        s b10 = com.google.android.gms.common.api.internal.t.b();
        b10.f6685c = new qt(cVar2, 19);
        b10.f6683a = 2426;
        cVar.e(0, b10.a()).addOnCompleteListener(new y9(aVar, 1));
    }

    @Override
    public boolean checkServices() {
        return tt.f25665b.hasServices();
    }

    @Override
    public int d(long j3) {
        long[] jArr = (long[]) this.d;
        int b10 = m0.b(jArr, j3, false);
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
    public void f(boolean z9) {
        ((vf.b) this.f14266b).b();
        ((f2) this.f14267c).presentFragment(new cn((Bundle) this.d));
    }

    @Override
    public void f0() {
        ((uj) this.d).Q.A();
    }

    @Override
    public Object mo24get() {
        switch (this.f14265a) {
            case 3:
                return new jb.p((id.h) ((ib.c) this.f14266b).mo24get(), (j1) ((ib.c) this.f14267c).mo24get(), (m1.g) ((ib.c) this.d).mo24get());
            default:
                return new o5.s(new nb.a(28), new w7.s(27, false), (t5.b) ((r7) this.f14266b).mo24get(), (ia.c) ((ga.d) this.f14267c).mo24get(), (ui.e) ((b0) this.d).mo24get());
        }
    }

    @Override
    public void getLastLocation(q0.a aVar) {
        u7.c cVar = (u7.c) this.f14266b;
        cVar.getClass();
        s b10 = com.google.android.gms.common.api.internal.t.b();
        b10.f6685c = u7.a.f56371c;
        b10.f6683a = 2414;
        cVar.e(0, b10.a()).addOnCompleteListener(new y9(aVar, 0));
    }

    public o5.i h() {
        String str;
        if (((String) this.f14266b) == null) {
            str = " backendName";
        } else {
            str = "";
        }
        if (((l5.d) this.d) == null) {
            str = str.concat(" priority");
        }
        if (str.isEmpty()) {
            return new o5.i((String) this.f14266b, (byte[]) this.f14267c, (l5.d) this.d);
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    @Override
    public void i(android.view.View r13, ch.o0 r14, boolean r15, boolean r16) {
        throw new UnsupportedOperationException("Method not decompiled: h6.m.i(android.view.View, ch.o0, boolean, boolean):void");
    }

    @Override
    public void init(Context context) {
        com.google.android.gms.common.api.e eVar = j8.b.f16584a;
        com.google.android.gms.common.api.i iVar = com.google.android.gms.common.api.i.f6545c;
        com.google.android.gms.common.api.e eVar2 = u7.c.f56373l;
        com.google.android.gms.common.api.a aVar = com.google.android.gms.common.api.b.f6535j;
        this.f14266b = new com.google.android.gms.common.api.j(context, eVar2, aVar, iVar);
        this.f14267c = new com.google.android.gms.common.api.j(context, eVar2, aVar, iVar);
    }

    public void j(Canvas canvas, RectF rectF, float f10) {
        Paint[] paintArr = (Paint[]) this.f14266b;
        if (paintArr[0] == null) {
            Paint paint = new Paint(1);
            paintArr[0] = paint;
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        }
        paintArr[0].setShader((LinearGradient) this.f14267c);
        paintArr[0].setAlpha((int) (f10 * 255.0f));
        canvas.drawRect(rectF, paintArr[0]);
    }

    @Override
    public long k(int i7) {
        boolean z9;
        long[] jArr = (long[]) this.d;
        boolean z10 = false;
        if (i7 >= 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        ia.f(z9);
        if (i7 < jArr.length) {
            z10 = true;
        }
        ia.f(z10);
        return jArr[i7];
    }

    public void m(Canvas canvas, RectF rectF, int i7, float f10) {
        Paint[] paintArr = (Paint[]) this.f14266b;
        Matrix matrix = (Matrix) this.d;
        if (f10 <= 0.0f) {
            return;
        }
        if (((LinearGradient) this.f14267c) == null) {
            this.f14267c = new LinearGradient(0.0f, 0.0f, 0.0f, 16.0f, new int[]{-65536, 16711680}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        }
        if (paintArr[i7] == null) {
            paintArr[i7] = new Paint(1);
            paintArr[i7].setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        }
        paintArr[i7].setShader((LinearGradient) this.f14267c);
        matrix.reset();
        if (i7 == 0) {
            matrix.postScale(1.0f, rectF.width() / 16.0f);
            matrix.postRotate(-90.0f);
            matrix.postTranslate(rectF.left, rectF.top);
        } else if (i7 == 1) {
            matrix.postScale(1.0f, rectF.height() / 16.0f);
            matrix.postTranslate(rectF.left, rectF.top);
        } else if (i7 == 2) {
            matrix.postScale(1.0f, rectF.width() / 16.0f);
            matrix.postRotate(90.0f);
            matrix.postTranslate(rectF.right, rectF.top);
        } else if (i7 == 3) {
            matrix.postScale(1.0f, rectF.height() / 16.0f);
            matrix.postScale(1.0f, -1.0f);
            matrix.postTranslate(rectF.left, rectF.bottom);
        }
        ((LinearGradient) this.f14267c).setLocalMatrix(matrix);
        paintArr[i7].setAlpha((int) (255.0f * f10));
        canvas.drawRect(rectF, paintArr[i7]);
    }

    public Object n(Bitmap bitmap) {
        ih.a aVar = (ih.a) this.f14266b;
        if (aVar.a(bitmap)) {
            this.d = ((ih.b) this.f14267c).b(bitmap);
            aVar.b(bitmap);
        }
        return this.d;
    }

    public ColorStateList o(int i7) {
        int resourceId;
        ColorStateList a10;
        TypedArray typedArray = (TypedArray) this.f14267c;
        if (typedArray.hasValue(i7) && (resourceId = typedArray.getResourceId(i7, 0)) != 0 && (a10 = b5.a.a((Context) this.f14266b, resourceId)) != null) {
            return a10;
        }
        return typedArray.getColorStateList(i7);
    }

    @Override
    public void onComplete(Task task) {
        String str = (String) this.f14267c;
        ScheduledFuture scheduledFuture = (ScheduledFuture) this.d;
        a0.l lVar = ((m6.c) this.f14266b).f19895a;
        synchronized (lVar) {
            lVar.remove(str);
        }
        scheduledFuture.cancel(false);
    }

    @Override
    public sa onCreateLocationRequest() {
        LocationRequest locationRequest = new LocationRequest(102, 3600000L, 600000L, 0L, Long.MAX_VALUE, Long.MAX_VALUE, Integer.MAX_VALUE, 0.0f, true, 3600000L, 0, 0, null, false, new WorkSource(), null);
        ?? obj = new Object();
        obj.f21638a = locationRequest;
        return obj;
    }

    @Override
    public ta onCreateLocationServicesAPI(Context context, pa paVar, final qa qaVar) {
        List list;
        boolean z9;
        Context context2 = t0.f25570b;
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        ?? lVar = new a0.l(0);
        ?? lVar2 = new a0.l(0);
        Object obj = n6.d.d;
        a9.e eVar = q8.b.f54058a;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Looper mainLooper = context2.getMainLooper();
        String packageName = context2.getPackageName();
        String name = context2.getClass().getName();
        com.google.android.gms.common.api.e eVar2 = j8.b.f16584a;
        q6.m.h(eVar2, "Api must not be null");
        com.google.android.gms.common.api.e eVar3 = null;
        lVar2.put(eVar2, null);
        a9.e eVar4 = eVar2.f6536a;
        q6.m.h(eVar4, "Base client builder must not be null");
        switch (eVar4.f758a) {
            case 22:
                list = Collections.EMPTY_LIST;
                break;
            default:
                list = Collections.EMPTY_LIST;
                break;
        }
        hashSet2.addAll(list);
        hashSet.addAll(list);
        arrayList.add(new aa(paVar));
        arrayList2.add(new com.google.android.gms.common.api.l() {
            @Override
            public final void onConnectionFailed(n6.a aVar) {
                sd sdVar = (sd) qa.this;
                if (!sdVar.L) {
                    sdVar.K = Boolean.FALSE;
                    if (sdVar.D) {
                        sdVar.D = false;
                        sdVar.p();
                    }
                }
            }
        });
        boolean z10 = true;
        q6.m.a("must call addApi() to add at least one API", !lVar2.isEmpty());
        q8.a aVar = q8.a.f54057a;
        com.google.android.gms.common.api.e eVar5 = q8.b.f54059b;
        if (lVar2.containsKey(eVar5)) {
            aVar = (q8.a) lVar2.get(eVar5);
        }
        q3 q3Var = new q3(hashSet, lVar, packageName, name, aVar);
        Map map = (Map) q3Var.f19235c;
        a0.l lVar3 = new a0.l(0);
        a0.l lVar4 = new a0.l(0);
        ArrayList arrayList3 = new ArrayList();
        Iterator it = ((a0.c) lVar2.keySet()).iterator();
        a0.l lVar5 = lVar2;
        while (true) {
            a0.b bVar = (a0.b) it;
            if (bVar.hasNext()) {
                com.google.android.gms.common.api.e eVar6 = (com.google.android.gms.common.api.e) bVar.next();
                Object obj2 = lVar5.get(eVar6);
                if (map.get(eVar6) != null) {
                    z9 = z10;
                } else {
                    z9 = false;
                }
                lVar3.put(eVar6, Boolean.valueOf(z9));
                a0.l lVar6 = lVar4;
                Looper looper = mainLooper;
                e1 e1Var = new e1(eVar6, z9);
                arrayList3.add(e1Var);
                a9.e eVar7 = eVar6.f6536a;
                q6.m.g(eVar7);
                ArrayList arrayList4 = arrayList3;
                Map map2 = map;
                q3 q3Var2 = q3Var;
                a0.l lVar7 = lVar5;
                a0.l lVar8 = lVar3;
                com.google.android.gms.common.api.c a10 = eVar7.a(context2, looper, q3Var2, obj2, e1Var, e1Var);
                lVar6.put(eVar6.f6537b, a10);
                q6.d dVar = (q6.d) a10;
                dVar.getClass();
                if (dVar instanceof d6.e) {
                    if (eVar3 == null) {
                        mainLooper = looper;
                        q3Var = q3Var2;
                        eVar3 = eVar6;
                    } else {
                        String str = eVar6.f6538c;
                        String str2 = eVar3.f6538c;
                        throw new IllegalStateException(f1.n(str, " cannot be used with ", str2, new StringBuilder(String.valueOf(str).length() + 21 + String.valueOf(str2).length())));
                    }
                } else {
                    mainLooper = looper;
                    q3Var = q3Var2;
                }
                lVar4 = lVar6;
                map = map2;
                lVar3 = lVar8;
                lVar5 = lVar7;
                arrayList3 = arrayList4;
                z10 = true;
            } else {
                q3 q3Var3 = q3Var;
                a0.f fVar = lVar3;
                a0.f fVar2 = lVar4;
                ArrayList arrayList5 = arrayList3;
                Looper looper2 = mainLooper;
                if (eVar3 != null) {
                    boolean equals = hashSet.equals(hashSet2);
                    String str3 = eVar3.f6538c;
                    if (!equals) {
                        throw new IllegalStateException(p0.p("Must not set scopes in GoogleApiClient.Builder when using ", str3, ". Set account in GoogleSignInOptions.Builder instead."));
                    }
                }
                d0 d0Var = new d0(context2, new ReentrantLock(), looper2, q3Var3, fVar, arrayList, arrayList2, fVar2, d0.j(fVar2.values(), true), arrayList5);
                Set set = com.google.android.gms.common.api.m.f6727a;
                synchronized (set) {
                    set.add(d0Var);
                }
                gf.g gVar = new gf.g(23);
                gVar.f13891b = d0Var;
                return gVar;
            }
        }
    }

    public Drawable p(int i7) {
        int resourceId;
        TypedArray typedArray = (TypedArray) this.f14267c;
        if (typedArray.hasValue(i7) && (resourceId = typedArray.getResourceId(i7, 0)) != 0) {
            return b5.a.b((Context) this.f14266b, resourceId);
        }
        return typedArray.getDrawable(i7);
    }

    public Drawable q(int i7) {
        int resourceId;
        Drawable f10;
        if (((TypedArray) this.f14267c).hasValue(i7) && (resourceId = ((TypedArray) this.f14267c).getResourceId(i7, 0)) != 0) {
            m.r a10 = m.r.a();
            Context context = (Context) this.f14266b;
            synchronized (a10) {
                f10 = a10.f19241a.f(resourceId, context, true);
            }
            return f10;
        }
        return null;
    }

    public Typeface r(int i7, int i10, h2.j0 j0Var) {
        h2.j0 j0Var2;
        XmlPullParserException xmlPullParserException;
        IOException iOException;
        int resourceId = ((TypedArray) this.f14267c).getResourceId(i7, 0);
        if (resourceId != 0) {
            if (((TypedValue) this.d) == null) {
                this.d = new TypedValue();
            }
            Context context = (Context) this.f14266b;
            TypedValue typedValue = (TypedValue) this.d;
            ThreadLocal threadLocal = h0.j.f14029a;
            if (!context.isRestricted()) {
                Resources resources = context.getResources();
                resources.getValue(resourceId, typedValue, true);
                CharSequence charSequence = typedValue.string;
                if (charSequence != null) {
                    String charSequence2 = charSequence.toString();
                    if (!charSequence2.startsWith("res/")) {
                        j0Var.b();
                        return null;
                    }
                    int i11 = typedValue.assetCookie;
                    a0.j jVar = i0.e.f15129b;
                    Typeface typeface = (Typeface) jVar.a(i0.e.b(resources, resourceId, charSequence2, i11, i10));
                    if (typeface != null) {
                        new Handler(Looper.getMainLooper()).post(new f2.h(23, j0Var, typeface));
                        return typeface;
                    }
                    try {
                        if (charSequence2.toLowerCase().endsWith(".xml")) {
                            h0.d g10 = h0.b.g(resources.getXml(resourceId), resources);
                            if (g10 == null) {
                                try {
                                    Log.e("ResourcesCompat", "Failed to find font-family tag");
                                    j0Var.b();
                                    return null;
                                } catch (IOException e10) {
                                    iOException = e10;
                                    j0Var2 = j0Var;
                                    Log.e("ResourcesCompat", "Failed to read xml resource ".concat(charSequence2), iOException);
                                    j0Var2.b();
                                    return null;
                                } catch (XmlPullParserException e11) {
                                    xmlPullParserException = e11;
                                    j0Var2 = j0Var;
                                    Log.e("ResourcesCompat", "Failed to parse xml resource ".concat(charSequence2), xmlPullParserException);
                                    j0Var2.b();
                                    return null;
                                }
                            }
                            try {
                                return i0.e.a(context, g10, resources, resourceId, charSequence2, typedValue.assetCookie, i10, j0Var);
                            } catch (IOException e12) {
                                e = e12;
                                j0Var2 = j0Var;
                                iOException = e;
                                Log.e("ResourcesCompat", "Failed to read xml resource ".concat(charSequence2), iOException);
                                j0Var2.b();
                                return null;
                            } catch (XmlPullParserException e13) {
                                e = e13;
                                j0Var2 = j0Var;
                                xmlPullParserException = e;
                                Log.e("ResourcesCompat", "Failed to parse xml resource ".concat(charSequence2), xmlPullParserException);
                                j0Var2.b();
                                return null;
                            }
                        }
                        j0Var2 = j0Var;
                        try {
                            int i12 = typedValue.assetCookie;
                            Typeface e14 = i0.e.f15128a.e(context, resources, resourceId, charSequence2, i10);
                            if (e14 != null) {
                                jVar.b(i0.e.b(resources, resourceId, charSequence2, i12, i10), e14);
                            }
                            if (e14 != null) {
                                new Handler(Looper.getMainLooper()).post(new f2.h(23, j0Var2, e14));
                            } else {
                                j0Var2.b();
                            }
                            return e14;
                        } catch (IOException e15) {
                            e = e15;
                            iOException = e;
                            Log.e("ResourcesCompat", "Failed to read xml resource ".concat(charSequence2), iOException);
                            j0Var2.b();
                            return null;
                        } catch (XmlPullParserException e16) {
                            e = e16;
                            xmlPullParserException = e;
                            Log.e("ResourcesCompat", "Failed to parse xml resource ".concat(charSequence2), xmlPullParserException);
                            j0Var2.b();
                            return null;
                        }
                    } catch (IOException e17) {
                        e = e17;
                        j0Var2 = j0Var;
                    } catch (XmlPullParserException e18) {
                        e = e18;
                        j0Var2 = j0Var;
                    }
                } else {
                    throw new Resources.NotFoundException("Resource \"" + resources.getResourceName(resourceId) + "\" (" + Integer.toHexString(resourceId) + ") is not a Font: " + typedValue);
                }
            }
        }
        return null;
    }

    @Override
    public synchronized void removeLocationUpdates(ra raVar) {
        z9 z9Var = (z9) ((HashMap) this.d).remove(raVar);
        if (z9Var != null) {
            u7.c cVar = (u7.c) this.f14266b;
            cVar.getClass();
            String simpleName = z9.class.getSimpleName();
            q6.m.f(simpleName, "Listener type must not be empty");
            cVar.c(new com.google.android.gms.common.api.internal.m(z9Var, simpleName), 2418).continueWith(u7.b.f56372a, u7.a.f56370b);
        }
    }

    @Override
    public synchronized void requestLocationUpdates(sa saVar, ra raVar) {
        z9 z9Var = (z9) ((HashMap) this.d).remove(raVar);
        if (z9Var != null) {
            u7.c cVar = (u7.c) this.f14266b;
            cVar.getClass();
            String simpleName = z9.class.getSimpleName();
            q6.m.f(simpleName, "Listener type must not be empty");
            cVar.c(new com.google.android.gms.common.api.internal.m(z9Var, simpleName), 2418).continueWith(u7.b.f56372a, u7.a.f56370b);
        }
        z9 z9Var2 = new z9(raVar);
        ((HashMap) this.d).put(raVar, z9Var2);
        ((u7.c) this.f14266b).f(((ba) saVar).f21638a, z9Var2, Looper.getMainLooper());
    }

    @Override
    public List s(long j3) {
        List list = (List) this.f14266b;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i7 = 0; i7 < list.size(); i7++) {
            long[] jArr = (long[]) this.f14267c;
            int i10 = i7 * 2;
            if (jArr[i10] <= j3 && j3 < jArr[i10 + 1]) {
                l4.c cVar = (l4.c) list.get(i7);
                g2.b bVar = cVar.f18149a;
                if (bVar.f13441e == -3.4028235E38f) {
                    arrayList2.add(cVar);
                } else {
                    arrayList.add(bVar);
                }
            }
        }
        Collections.sort(arrayList2, new jg.x(6));
        for (int i11 = 0; i11 < arrayList2.size(); i11++) {
            g2.b bVar2 = ((l4.c) arrayList2.get(i11)).f18149a;
            arrayList.add(new g2.b(bVar2.f13438a, bVar2.f13439b, bVar2.f13440c, bVar2.d, (-1) - i11, 1, bVar2.f13443g, bVar2.h, bVar2.f13444i, bVar2.f13449n, bVar2.f13450o, bVar2.f13445j, bVar2.f13446k, bVar2.f13447l, bVar2.f13448m, bVar2.f13451p, bVar2.f13452q, bVar2.f13453r));
        }
        return arrayList;
    }

    public void t(ha haVar) {
        try {
            l8.f fVar = (l8.f) this.f14267c;
            k8.c cVar = new k8.c(haVar);
            Parcel p12 = fVar.p1();
            v7.b.c(p12, cVar);
            fVar.t1(p12, 9);
        } catch (RemoteException e10) {
            throw new RuntimeException(e10);
        }
    }

    public String toString() {
        switch (this.f14265a) {
            case 1:
                StringBuilder sb2 = new StringBuilder();
                ArrayList arrayList = (ArrayList) this.f14266b;
                int size = arrayList.size();
                ic.e eVar = null;
                int i7 = 0;
                while (i7 < size) {
                    Object obj = arrayList.get(i7);
                    i7++;
                    ic.e eVar2 = (ic.e) obj;
                    if (eVar != null) {
                        sb2.append(",");
                    }
                    sb2.append(eVar2.toString());
                    eVar = eVar2;
                }
                return sb2.toString();
            default:
                return super.toString();
        }
    }

    public Paint u(float f10, int i7) {
        Paint[] paintArr = (Paint[]) this.f14266b;
        if (paintArr[i7] == null) {
            Paint paint = new Paint(1);
            paintArr[i7] = paint;
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        }
        paintArr[i7].setShader(null);
        paintArr[i7].setColor(-65536);
        paintArr[i7].setAlpha((int) (f10 * 255.0f));
        return paintArr[i7];
    }

    @Override
    public boolean v() {
        return true;
    }

    @Override
    public void v0(int i7, boolean z9, boolean z10) {
        String str;
        if (!z9) {
            uj ujVar = (uj) this.d;
            HashMap hashMap = (HashMap) this.f14266b;
            ArrayList arrayList = (ArrayList) this.f14267c;
            ci ciVar = ujVar.f38656b;
            if (!hashMap.isEmpty() && ujVar.Q != null && !ujVar.K) {
                ujVar.K = true;
                ArrayList arrayList2 = new ArrayList();
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    Object obj = hashMap.get(arrayList.get(i10));
                    ?? obj2 = new Object();
                    arrayList2.add(obj2);
                    if (obj instanceof gf) {
                        gf gfVar = (gf) obj;
                        String str2 = gfVar.h;
                        if (str2 != null) {
                            obj2.f22516c = str2;
                        } else {
                            obj2.f22516c = gfVar.I;
                        }
                        obj2.f22517e = gfVar.f26850c;
                        obj2.f22518f = gfVar.f26853g;
                        obj2.f22522k = gfVar.f26864s;
                        obj2.f22526o = gfVar.f26849b;
                        CharSequence charSequence = gfVar.f26848a;
                        if (charSequence != null) {
                            str = charSequence.toString();
                        } else {
                            str = null;
                        }
                        obj2.d = str;
                        obj2.f22520i = gfVar.f26859n;
                        obj2.f22521j = gfVar.f26863r;
                        obj2.h = gfVar.f26868x;
                    }
                }
                u4.X(ciVar.G3, ciVar.X0() + arrayList2.size(), ciVar.b1(), new r2(i7, 2, ujVar, arrayList2, z10));
            }
        }
    }

    public int w(gc.e eVar) {
        ArrayList arrayList = (ArrayList) this.f14266b;
        int size = arrayList.size();
        int i7 = 0;
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ic.e eVar2 = (ic.e) obj;
            int i11 = eVar2.d;
            gc.d dVar = eVar2.f15450a;
            int a10 = dVar.a(eVar);
            int i12 = a10 + 4;
            int ordinal = dVar.ordinal();
            int i13 = 4;
            if (ordinal != 1) {
                int i14 = 6;
                if (ordinal != 2) {
                    if (ordinal != 4) {
                        if (ordinal != 5) {
                            if (ordinal == 6) {
                                i12 += i11 * 13;
                            }
                        } else {
                            i12 = a10 + 12;
                        }
                    } else {
                        i12 += eVar2.a() * 8;
                    }
                } else {
                    int i15 = ((i11 / 2) * 11) + i12;
                    if (i11 % 2 != 1) {
                        i14 = 0;
                    }
                    i12 = i15 + i14;
                }
            } else {
                int i16 = ((i11 / 3) * 10) + i12;
                int i17 = i11 % 3;
                if (i17 != 1) {
                    if (i17 == 2) {
                        i13 = 7;
                    } else {
                        i13 = 0;
                    }
                }
                i12 = i16 + i13;
            }
            i7 += i12;
        }
        return i7;
    }

    @Override
    public int y() {
        return ((long[]) this.d).length;
    }

    public m(Object obj, Object obj2, Object obj3, int i7) {
        this.f14265a = i7;
        this.f14266b = obj;
        this.f14267c = obj2;
        this.d = obj3;
    }

    public m(Object obj, Object obj2, Object obj3, boolean z9, int i7) {
        this.f14265a = i7;
        this.d = obj;
        this.f14266b = obj2;
        this.f14267c = obj3;
    }

    public m(x5 x5Var, l8.f fVar) {
        this.f14265a = 6;
        this.f14267c = fVar;
        q6.m.g(x5Var);
        this.f14266b = x5Var;
    }

    public m(h hVar) {
        this.f14265a = 0;
        this.d = hVar;
        this.f14267c = new AtomicLong((j6.a.f16507b.nextLong() & 65535) * 10000);
    }

    public m(ih.b bVar) {
        this.f14265a = 2;
        this.f14266b = new ih.a();
        this.f14267c = bVar;
    }

    public m(Context context) {
        this.f14265a = 18;
        this.f14266b = context;
    }

    public m(int i7) {
        this.f14265a = i7;
        switch (i7) {
            case 28:
                this.f14266b = new Paint[4];
                this.d = new Matrix();
                return;
            default:
                this.d = new HashMap();
                return;
        }
    }

    public m(ArrayList arrayList) {
        this.f14265a = 8;
        this.f14266b = DesugarCollections.unmodifiableList(new ArrayList(arrayList));
        this.f14267c = new long[arrayList.size() * 2];
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            l4.c cVar = (l4.c) arrayList.get(i7);
            int i10 = i7 * 2;
            long[] jArr = (long[]) this.f14267c;
            jArr[i10] = cVar.f18150b;
            jArr[i10 + 1] = cVar.f18151c;
        }
        long[] jArr2 = (long[]) this.f14267c;
        long[] copyOf = Arrays.copyOf(jArr2, jArr2.length);
        this.d = copyOf;
        Arrays.sort(copyOf);
    }

    @Override
    public void A() {
    }

    @Override
    public void M() {
    }

    public m(View view) {
        this.f14265a = 27;
        this.d = view;
        f51 f51Var = new f51(this, view);
        this.f14266b = f51Var;
        view.addOnLayoutChangeListener(f51Var);
    }

    @Override
    public void B(Editable editable) {
    }

    public m(String str) {
        this.f14265a = 12;
        t tVar = new t();
        tVar.f10567q = s0.n("video/mp2t");
        tVar.f10568r = s0.n(str);
        this.f14266b = new u(tVar);
    }

    public m(Context context, TypedArray typedArray) {
        this.f14265a = 11;
        this.f14266b = context;
        this.f14267c = typedArray;
    }

    public m(f2.n[] nVarArr) {
        this.f14265a = 15;
        n2.v0 v0Var = new n2.v0();
        ?? obj = new Object();
        obj.f10955c = 1.0f;
        obj.d = 1.0f;
        f2.k kVar = f2.k.f10921e;
        obj.f10956e = kVar;
        obj.f10957f = kVar;
        obj.f10958g = kVar;
        obj.h = kVar;
        ByteBuffer byteBuffer = f2.n.f10927a;
        obj.f10961k = byteBuffer;
        obj.f10962l = byteBuffer;
        obj.f10954b = -1;
        f2.n[] nVarArr2 = new f2.n[nVarArr.length + 2];
        this.f14266b = nVarArr2;
        System.arraycopy(nVarArr, 0, nVarArr2, 0, nVarArr.length);
        this.f14267c = v0Var;
        this.d = obj;
        nVarArr2[nVarArr.length] = v0Var;
        nVarArr2[nVarArr.length + 1] = obj;
    }

    public m(Signature signature) {
        this.f14265a = 5;
        this.f14266b = signature;
        this.f14267c = null;
        this.d = null;
    }

    public m(Cipher cipher) {
        this.f14265a = 5;
        this.f14267c = cipher;
        this.f14266b = null;
        this.d = null;
    }

    public m(Mac mac) {
        this.f14265a = 5;
        this.d = mac;
        this.f14267c = null;
        this.f14266b = null;
    }

    public m(View view, jh.k kVar) {
        ViewTreeObserver viewTreeObserver;
        ViewTreeObserver viewTreeObserver2;
        this.f14265a = 4;
        m6 m6Var = new m6(this, 2);
        this.f14266b = view;
        this.f14267c = kVar;
        view.addOnAttachStateChangeListener(m6Var);
        if (!view.isAttachedToWindow() || (viewTreeObserver2 = (ViewTreeObserver) this.d) == (viewTreeObserver = view.getViewTreeObserver())) {
            return;
        }
        if (viewTreeObserver2 != null) {
            if (viewTreeObserver2.isAlive()) {
                ((ViewTreeObserver) this.d).removeOnPreDrawListener(kVar);
            }
            this.d = null;
        }
        this.d = viewTreeObserver;
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.addOnPreDrawListener(kVar);
        }
    }

    public m(ab.q qVar, gc.e eVar, ic.d dVar) {
        gc.d dVar2;
        int i7;
        int i10;
        this.f14265a = 1;
        this.d = qVar;
        this.f14266b = new ArrayList();
        ic.d dVar3 = dVar;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            dVar2 = gc.d.ECI;
            if (dVar3 == null) {
                break;
            }
            int i13 = dVar3.f15447c;
            int i14 = i11 + dVar3.d;
            ic.d dVar4 = dVar3.f15448e;
            int i15 = i12;
            gc.d dVar5 = dVar3.f15445a;
            boolean z9 = (dVar5 == gc.d.BYTE && dVar4 == null && i13 != 0) || !(dVar4 == null || i13 == dVar4.f15447c);
            i7 = z9 ? 1 : i15;
            if (dVar4 == null || dVar4.f15445a != dVar5 || z9) {
                ((ArrayList) this.f14266b).add(0, new ic.e(this, dVar5, dVar3.f15446b, i13, i14));
                i10 = 0;
            } else {
                i10 = i14;
            }
            if (z9) {
                ((ArrayList) this.f14266b).add(0, new ic.e(this, dVar2, dVar3.f15446b, dVar3.f15447c, 0));
            }
            i12 = i7;
            dVar3 = dVar4;
            i11 = i10;
        }
        int i16 = i12;
        boolean z10 = qVar.f989a;
        gc.b bVar = (gc.b) qVar.d;
        if (z10) {
            ic.e eVar2 = (ic.e) ((ArrayList) this.f14266b).get(0);
            if (eVar2 != null && eVar2.f15450a != dVar2 && i16 != 0) {
                ((ArrayList) this.f14266b).add(0, new ic.e(this, dVar2, 0, 0, 0));
            }
            ((ArrayList) this.f14266b).add(((ic.e) ((ArrayList) this.f14266b).get(0)).f15450a == dVar2 ? 1 : 0, new ic.e(this, gc.d.FNC1_FIRST_POSITION, 0, 0, 0));
        }
        int i17 = eVar.f13814a;
        int i18 = 26;
        int c10 = p1.g.c(i17 <= 9 ? 1 : i17 <= 26 ? 2 : 3);
        if (c10 == 0) {
            i18 = 9;
        } else if (c10 != 1) {
            i7 = 27;
            i18 = 40;
        } else {
            i7 = 10;
        }
        int w10 = w(eVar);
        while (i17 < i18 && !ic.b.d(w10, gc.e.c(i17), bVar)) {
            i17++;
        }
        while (i17 > i7 && ic.b.d(w10, gc.e.c(i17 - 1), bVar)) {
            i17--;
        }
        this.f14267c = gc.e.c(i17);
    }

    public m(l2.h hVar, m2.j jVar) {
        this.f14265a = 7;
        this.d = hVar;
        this.f14266b = new HashMap();
        this.f14267c = jVar;
    }

    public m(Object[] objArr, Object[] objArr2) {
        this.f14265a = 26;
        int length = objArr.length;
        int[] iArr = new int[length];
        HashMap hashMap = new HashMap();
        for (int i7 = 0; i7 < length; i7++) {
            Object obj = objArr[i7];
            Integer num = (Integer) hashMap.get(obj);
            if (num == null) {
                num = Integer.valueOf(hashMap.size());
                hashMap.put(obj, num);
            }
            iArr[i7] = num.intValue();
        }
        this.f14266b = iArr;
        this.f14267c = l(objArr, iArr);
        this.d = l(objArr2, iArr);
    }

    @Override
    public void L(Canvas canvas, RectF rectF, float f10, float f11, float f12, int i7, boolean z9) {
    }
}
