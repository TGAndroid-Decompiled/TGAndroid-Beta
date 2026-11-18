package h6;

import a8.la;
import a8.p0;
import a8.r7;
import ab.c0;
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
import android.graphics.SurfaceTexture;
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
import bi.r2;
import c8.z;
import com.google.android.gms.common.api.internal.g1;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import e2.s0;
import e2.t;
import e2.u;
import f3.i0;
import fi.a6;
import fi.l2;
import gb.h1;
import h2.j0;
import h2.k0;
import h2.l0;
import h2.x;
import hi.c7;
import hi.d7;
import hi.r1;
import hi.s8;
import hi.t5;
import hi.v5;
import hi.w5;
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
import jg.w;
import m.o3;
import m4.a0;
import m4.f0;
import n2.w0;
import org.telegram.messenger.ILocationServiceProvider;
import org.telegram.messenger.a8;
import org.telegram.messenger.ap;
import org.telegram.messenger.ef;
import org.telegram.messenger.fa;
import org.telegram.messenger.g0;
import org.telegram.messenger.na;
import org.telegram.messenger.nt;
import org.telegram.messenger.oa;
import org.telegram.messenger.pa;
import org.telegram.messenger.qa;
import org.telegram.messenger.ra;
import org.telegram.messenger.t0;
import org.telegram.messenger.w9;
import org.telegram.messenger.x9;
import org.telegram.messenger.y9;
import org.telegram.messenger.z9;
import org.telegram.ui.ActionBar.h2;
import org.telegram.ui.ActionBar.v0;
import org.telegram.ui.ActionBar.z0;
import org.telegram.ui.Cells.b5;
import org.telegram.ui.Components.cz;
import org.telegram.ui.Components.d61;
import org.telegram.ui.Components.f61;
import org.telegram.ui.Components.ix0;
import org.telegram.ui.Components.kk;
import org.telegram.ui.Components.r51;
import org.telegram.ui.Components.si;
import org.telegram.ui.Components.ui0;
import org.telegram.ui.Components.v51;
import org.telegram.ui.Components.wx0;
import org.telegram.ui.Components.yy;
import org.telegram.ui.bn;
import org.telegram.ui.bn0;
import org.xmlpull.v1.XmlPullParserException;
public final class m implements d61, ib.b, c4.d, a0, OnCompleteListener, q5.b, ILocationServiceProvider, ap, ui0, bn0 {
    public final int f13938a;
    public Object f13939b;
    public Object f13940c;
    public Object d;

    public m(int i7, boolean z10) {
        this.f13938a = i7;
    }

    public static m D(Context context, AttributeSet attributeSet, int[] iArr, int i7) {
        return new m(context, context.obtainStyledAttributes(attributeSet, iArr, i7, 0));
    }

    public static StringBuilder F(String str) {
        StringBuilder sb2;
        String[] strArr;
        int i7;
        byte[] H;
        int i10;
        try {
            BufferedReader bufferedReader = new BufferedReader(new StringReader(str));
            int i11 = 0;
            boolean z10 = false;
            m mVar = null;
            String str2 = null;
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                } else if (!readLine.startsWith("PHOTO")) {
                    if (readLine.indexOf(58) >= 0) {
                        if (readLine.startsWith("BEGIN:VCARD")) {
                            mVar = new m(21, false);
                            mVar.f13940c = new ArrayList();
                            mVar.d = new ArrayList();
                        } else if (readLine.startsWith("END:VCARD") && mVar != null) {
                            z10 = true;
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
                            mVar.f13939b = strArr[1];
                            if (str3 != null && str3.equalsIgnoreCase("QUOTED-PRINTABLE") && (H = g0.H(g0.h1((String) mVar.f13939b))) != null && H.length != 0) {
                                mVar.f13939b = new String(H, str4);
                            }
                            mVar.f13939b = ((String) mVar.f13939b).replace(';', ' ');
                        } else {
                            i7 = i11;
                            if (strArr[i7].startsWith("TEL")) {
                                if (strArr[1].length() > 0) {
                                    ((ArrayList) mVar.d).add(strArr[1]);
                                }
                            } else if (strArr[i7].startsWith("EMAIL")) {
                                String str5 = strArr[1];
                                if (str5.length() > 0) {
                                    ((ArrayList) mVar.f13940c).add(str5);
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
            if (!z10) {
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
            for (int i15 = i13; i15 < ((ArrayList) mVar.f13940c).size(); i15++) {
                if (sb3.length() > 0) {
                    sb3.append('\n');
                }
                sb3.append(pf.b.c().b((String) ((ArrayList) mVar.f13940c).get(i15)));
            }
            if (!TextUtils.isEmpty((String) mVar.f13939b)) {
                if (sb3.length() > 0) {
                    sb3.append('\n');
                }
                sb3.append((String) mVar.f13939b);
            }
            return sb3;
        } catch (Throwable unused2) {
            return null;
        }
    }

    public static m i(View view) {
        return new m(view);
    }

    public static Object[] l(Object[] objArr, int[] iArr) {
        int length = objArr.length;
        Class<?> componentType = objArr.getClass().getComponentType();
        ix0 ix0Var = wx0.T;
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

    public Paint B(float f10, int i7) {
        Paint[] paintArr = (Paint[]) this.f13939b;
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

    public int C(gc.e eVar) {
        ArrayList arrayList = (ArrayList) this.f13939b;
        int size = arrayList.size();
        int i7 = 0;
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ic.e eVar2 = (ic.e) obj;
            int i11 = eVar2.d;
            gc.d dVar = eVar2.f16221a;
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
    public boolean E() {
        return false;
    }

    public void G() {
        ((TypedArray) this.f13940c).recycle();
    }

    public void H(b3.a aVar) {
        m2.i iVar = (m2.i) ((HashMap) this.f13939b).remove(aVar);
        iVar.getClass();
        l2.g gVar = (l2.g) ((l2.h) this.d).f19404p.get(iVar);
        if (gVar != null) {
            synchronized (gVar) {
                gVar.d--;
            }
        }
    }

    public void I(String str) {
        if (str != null) {
            this.f13939b = str;
            return;
        }
        throw new NullPointerException("Null backendName");
    }

    public synchronized void J() {
        ((l2.h) this.d).f19393c.e();
    }

    public void K(boolean z10, float f10) {
        z0[] z0VarArr = (z0[]) this.d;
        for (int i7 = 0; i7 < z0VarArr.length; i7++) {
            if (z10 && ((i7 == 0 && Math.abs(f10 - 0.2f) < 0.01f) || ((i7 == 1 && Math.abs(f10 - 0.5f) < 0.1f) || ((i7 == 2 && Math.abs(f10 - 1.0f) < 0.1f) || ((i7 == 3 && Math.abs(f10 - 1.5f) < 0.1f) || (i7 == 4 && Math.abs(f10 - 2.0f) < 0.1f)))))) {
                z0VarArr[i7].d(-9718023, -9718023);
            } else {
                z0VarArr[i7].d(-328966, -328966);
            }
        }
        ((v0) this.f13940c).e(true, f10);
    }

    @Override
    public void a() {
        ((vf.b) this.f13939b).b();
        ((h2) this.f13940c).presentFragment(new bn((Bundle) this.d));
    }

    @Override
    public void b(k0 k0Var, f3.q qVar, f0 f0Var) {
        this.f13940c = k0Var;
        f0Var.b();
        f0Var.c();
        i0 d2 = qVar.d2(f0Var.f20616c, 5);
        this.d = d2;
        d2.g((u) this.f13939b);
    }

    @Override
    public void b0() {
        ((kk) this.d).R.A();
    }

    @Override
    public void c(x xVar) {
        long d;
        long j3;
        ((k0) this.f13940c).getClass();
        String str = l0.f13786a;
        k0 k0Var = (k0) this.f13940c;
        synchronized (k0Var) {
            try {
                long j10 = k0Var.f13780c;
                if (j10 != -9223372036854775807L) {
                    d = j10 + k0Var.f13779b;
                } else {
                    d = k0Var.d();
                }
                j3 = d;
            } finally {
            }
        }
        long e10 = ((k0) this.f13940c).e();
        if (j3 != -9223372036854775807L && e10 != -9223372036854775807L) {
            u uVar = (u) this.f13939b;
            if (e10 != uVar.f10773x) {
                t a10 = uVar.a();
                a10.f10721w = e10;
                u uVar2 = new u(a10);
                this.f13939b = uVar2;
                ((i0) this.d).g(uVar2);
            }
            int a11 = xVar.a();
            ((i0) this.d).b(a11, xVar);
            ((i0) this.d).c(j3, 1, a11, 0, null);
        }
    }

    @Override
    public void checkLocationSettings(qa qaVar, q0.a aVar) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(((z9) qaVar).f28276a);
        u7.c cVar = (u7.c) this.f13940c;
        j8.c cVar2 = new j8.c(arrayList, false, false);
        cVar.getClass();
        com.google.android.gms.common.api.internal.t b10 = com.google.android.gms.common.api.internal.u.b();
        b10.f6357c = new b5(cVar2);
        b10.f6355a = 2426;
        cVar.e(0, b10.a()).addOnCompleteListener(new w9(aVar, 1));
    }

    @Override
    public boolean checkServices() {
        return nt.f25968b.hasServices();
    }

    @Override
    public int d(long j3) {
        long[] jArr = (long[]) this.d;
        int b10 = l0.b(jArr, j3, false);
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
    public void f(boolean z10) {
        ((vf.b) this.f13939b).b();
        ((h2) this.f13940c).presentFragment(new bn((Bundle) this.d));
    }

    @Override
    public void g(android.view.View r13, ch.p0 r14, boolean r15, boolean r16) {
        throw new UnsupportedOperationException("Method not decompiled: h6.m.g(android.view.View, ch.p0, boolean, boolean):void");
    }

    @Override
    public Object mo24get() {
        switch (this.f13938a) {
            case 4:
                return new jb.p((id.h) ((ib.c) this.f13939b).mo24get(), (h1) ((ib.c) this.f13940c).mo24get(), (m1.g) ((ib.c) this.d).mo24get());
            default:
                return new o5.s(new qb.a(28), new pb.b(28), (t5.b) ((r7) this.f13939b).mo24get(), (ia.c) ((ga.d) this.f13940c).mo24get(), (c0) ((xi.e) this.d).mo24get());
        }
    }

    @Override
    public void getLastLocation(q0.a aVar) {
        u7.c cVar = (u7.c) this.f13939b;
        cVar.getClass();
        com.google.android.gms.common.api.internal.t b10 = com.google.android.gms.common.api.internal.u.b();
        b10.f6357c = u7.a.f58435c;
        b10.f6355a = 2414;
        cVar.e(0, b10.a()).addOnCompleteListener(new w9(aVar, 0));
    }

    @Override
    public long h(int i7) {
        boolean z10;
        long[] jArr = (long[]) this.d;
        boolean z11 = false;
        if (i7 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        la.f(z10);
        if (i7 < jArr.length) {
            z11 = true;
        }
        la.f(z11);
        return jArr[i7];
    }

    @Override
    public void init(Context context) {
        com.google.android.gms.common.api.e eVar = j8.b.f17322a;
        com.google.android.gms.common.api.i iVar = com.google.android.gms.common.api.i.f6210c;
        com.google.android.gms.common.api.e eVar2 = u7.c.f58437l;
        com.google.android.gms.common.api.a aVar = com.google.android.gms.common.api.b.f6200j;
        this.f13939b = new com.google.android.gms.common.api.j(context, eVar2, aVar, iVar);
        this.f13940c = new com.google.android.gms.common.api.j(context, eVar2, aVar, iVar);
    }

    public o5.i j() {
        String str;
        if (((String) this.f13939b) == null) {
            str = " backendName";
        } else {
            str = "";
        }
        if (((l5.d) this.d) == null) {
            str = str.concat(" priority");
        }
        if (str.isEmpty()) {
            return new o5.i((String) this.f13939b, (byte[]) this.f13940c, (l5.d) this.d);
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    public void k(Canvas canvas, RectF rectF, float f10) {
        Paint[] paintArr = (Paint[]) this.f13939b;
        if (paintArr[0] == null) {
            Paint paint = new Paint(1);
            paintArr[0] = paint;
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        }
        paintArr[0].setShader((LinearGradient) this.f13940c);
        paintArr[0].setAlpha((int) (f10 * 255.0f));
        canvas.drawRect(rectF, paintArr[0]);
    }

    @Override
    public List m(long j3) {
        List list = (List) this.f13939b;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i7 = 0; i7 < list.size(); i7++) {
            long[] jArr = (long[]) this.f13940c;
            int i10 = i7 * 2;
            if (jArr[i10] <= j3 && j3 < jArr[i10 + 1]) {
                l4.c cVar = (l4.c) list.get(i7);
                g2.b bVar = cVar.f19646a;
                if (bVar.f13108e == -3.4028235E38f) {
                    arrayList2.add(cVar);
                } else {
                    arrayList.add(bVar);
                }
            }
        }
        Collections.sort(arrayList2, new w(6));
        for (int i11 = 0; i11 < arrayList2.size(); i11++) {
            g2.b bVar2 = ((l4.c) arrayList2.get(i11)).f19646a;
            arrayList.add(new g2.b(bVar2.f13105a, bVar2.f13106b, bVar2.f13107c, bVar2.d, (-1) - i11, 1, bVar2.f13110g, bVar2.h, bVar2.f13111i, bVar2.f13116n, bVar2.f13117o, bVar2.f13112j, bVar2.f13113k, bVar2.f13114l, bVar2.f13115m, bVar2.f13118p, bVar2.f13119q, bVar2.f13120r));
        }
        return arrayList;
    }

    public void n(Canvas canvas, RectF rectF, int i7, float f10) {
        Paint[] paintArr = (Paint[]) this.f13939b;
        Matrix matrix = (Matrix) this.d;
        if (f10 <= 0.0f) {
            return;
        }
        if (((LinearGradient) this.f13940c) == null) {
            this.f13940c = new LinearGradient(0.0f, 0.0f, 0.0f, 16.0f, new int[]{-65536, 16711680}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        }
        if (paintArr[i7] == null) {
            paintArr[i7] = new Paint(1);
            paintArr[i7].setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        }
        paintArr[i7].setShader((LinearGradient) this.f13940c);
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
        ((LinearGradient) this.f13940c).setLocalMatrix(matrix);
        paintArr[i7].setAlpha((int) (255.0f * f10));
        canvas.drawRect(rectF, paintArr[i7]);
    }

    @Override
    public boolean o() {
        return true;
    }

    @Override
    public void onComplete(Task task) {
        String str = (String) this.f13940c;
        ScheduledFuture scheduledFuture = (ScheduledFuture) this.d;
        a0.l lVar = ((m6.c) this.f13939b).f20851a;
        synchronized (lVar) {
            lVar.remove(str);
        }
        scheduledFuture.cancel(false);
    }

    @Override
    public qa onCreateLocationRequest() {
        LocationRequest locationRequest = new LocationRequest(102, 3600000L, 600000L, 0L, Long.MAX_VALUE, Long.MAX_VALUE, Integer.MAX_VALUE, 0.0f, true, 3600000L, 0, 0, null, false, new WorkSource(), null);
        ?? obj = new Object();
        obj.f28276a = locationRequest;
        return obj;
    }

    @Override
    public ra onCreateLocationServicesAPI(Context context, na naVar, final oa oaVar) {
        List list;
        boolean z10;
        Context context2 = t0.f26915b;
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        ?? lVar = new a0.l(0);
        ?? lVar2 = new a0.l(0);
        Object obj = n6.d.d;
        a9.e eVar = q8.b.f56069a;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Looper mainLooper = context2.getMainLooper();
        String packageName = context2.getPackageName();
        String name = context2.getClass().getName();
        com.google.android.gms.common.api.e eVar2 = j8.b.f17322a;
        q6.m.i(eVar2, "Api must not be null");
        com.google.android.gms.common.api.e eVar3 = null;
        lVar2.put(eVar2, null);
        a9.e eVar4 = eVar2.f6201a;
        q6.m.i(eVar4, "Base client builder must not be null");
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
        arrayList.add(new y9(naVar));
        arrayList2.add(new com.google.android.gms.common.api.l() {
            @Override
            public final void onConnectionFailed(n6.a aVar) {
                qd qdVar = (qd) oa.this;
                if (!qdVar.M) {
                    qdVar.L = Boolean.FALSE;
                    if (qdVar.E) {
                        qdVar.E = false;
                        qdVar.p();
                    }
                }
            }
        });
        boolean z11 = true;
        q6.m.a("must call addApi() to add at least one API", !lVar2.isEmpty());
        q8.a aVar = q8.a.f56068a;
        com.google.android.gms.common.api.e eVar5 = q8.b.f56070b;
        if (lVar2.containsKey(eVar5)) {
            aVar = (q8.a) lVar2.get(eVar5);
        }
        o3 o3Var = new o3(hashSet, lVar, packageName, name, aVar);
        Map map = (Map) o3Var.f20163c;
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
                    z10 = z11;
                } else {
                    z10 = false;
                }
                lVar3.put(eVar6, Boolean.valueOf(z10));
                a0.l lVar6 = lVar4;
                Looper looper = mainLooper;
                g1 g1Var = new g1(eVar6, z10);
                arrayList3.add(g1Var);
                a9.e eVar7 = eVar6.f6201a;
                q6.m.h(eVar7);
                ArrayList arrayList4 = arrayList3;
                Map map2 = map;
                o3 o3Var2 = o3Var;
                a0.l lVar7 = lVar5;
                a0.l lVar8 = lVar3;
                com.google.android.gms.common.api.c a10 = eVar7.a(context2, looper, o3Var2, obj2, g1Var, g1Var);
                lVar6.put(eVar6.f6202b, a10);
                q6.d dVar = (q6.d) a10;
                dVar.getClass();
                if (dVar instanceof d6.e) {
                    if (eVar3 == null) {
                        mainLooper = looper;
                        o3Var = o3Var2;
                        eVar3 = eVar6;
                    } else {
                        String str = eVar6.f6203c;
                        String str2 = eVar3.f6203c;
                        throw new IllegalStateException(p5.c.m(str, " cannot be used with ", str2, new StringBuilder(String.valueOf(str).length() + 21 + String.valueOf(str2).length())));
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
                if (eVar3 != null) {
                    boolean equals = hashSet.equals(hashSet2);
                    String str3 = eVar3.f6203c;
                    if (!equals) {
                        throw new IllegalStateException(p0.p("Must not set scopes in GoogleApiClient.Builder when using ", str3, ". Set account in GoogleSignInOptions.Builder instead."));
                    }
                }
                com.google.android.gms.common.api.internal.f0 f0Var = new com.google.android.gms.common.api.internal.f0(context2, new ReentrantLock(), looper2, o3Var3, fVar, arrayList, arrayList2, fVar2, com.google.android.gms.common.api.internal.f0.h(fVar2.values(), true), arrayList5);
                Set set = com.google.android.gms.common.api.m.f6397a;
                synchronized (set) {
                    set.add(f0Var);
                }
                ?? obj3 = new Object();
                obj3.f6253a = f0Var;
                return obj3;
            }
        }
    }

    @Override
    public void onError(f61 f61Var, Exception exc) {
        s8 s8Var = ((w5) this.d).O;
        if (s8Var != null) {
            s8Var.run();
        }
    }

    @Override
    public void onRenderedFirstFrame(m2.a aVar) {
    }

    @Override
    public void onStateChanged(boolean z10, int i7) {
        w5 w5Var = (w5) this.d;
        t5 t5Var = w5Var.L;
        f61 f61Var = w5Var.f15653e;
        if (f61Var == null) {
            return;
        }
        if (f61Var.d0()) {
            g0.g3(t5Var);
        } else {
            g0.r(t5Var);
        }
    }

    @Override
    public boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        return false;
    }

    @Override
    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        ((w5) this.d).i();
    }

    @Override
    public void onVideoSizeChanged(int i7, int i10, int i11, float f10) {
        w5 w5Var = (w5) this.d;
        d7 d7Var = (d7) this.f13939b;
        if (d7Var != null) {
            c7 V = w5Var.f15653e.V(d7Var.f14398d1);
            d7Var.f14398d1 = V;
            v51 v51Var = w5Var.f15663n;
            if (v51Var != null) {
                v51Var.setHDRInfo(V);
            }
        }
        int i12 = (int) (i7 * f10);
        w5Var.f15655f = i12;
        int i13 = (int) (i10 * f10);
        w5Var.h = i13;
        if (d7Var != null && (d7Var.f14412k0 != i12 || d7Var.f14414l0 != i13)) {
            d7Var.f14412k0 = i12;
            d7Var.f14414l0 = i13;
            d7Var.A();
        }
        w5Var.b();
        v51 v51Var2 = w5Var.f15663n;
        if (v51Var2 != null) {
            int i14 = w5Var.f15655f;
            int i15 = w5Var.h;
            v51Var2.d = i14;
            v51Var2.f40503e = i15;
            cz czVar = v51Var2.f40501b;
            if (czVar != null) {
                czVar.postRunnable(new yy(czVar, i14, i15, 0));
            }
        }
    }

    @Override
    public int p() {
        return ((long[]) this.d).length;
    }

    @Override
    public boolean q() {
        return false;
    }

    public Object r(Bitmap bitmap) {
        ih.a aVar = (ih.a) this.f13939b;
        if (aVar.a(bitmap)) {
            this.d = ((ih.b) this.f13940c).b(bitmap);
            aVar.b(bitmap);
        }
        return this.d;
    }

    @Override
    public synchronized void removeLocationUpdates(pa paVar) {
        x9 x9Var = (x9) ((HashMap) this.d).remove(paVar);
        if (x9Var != null) {
            u7.c cVar = (u7.c) this.f13939b;
            cVar.getClass();
            String simpleName = x9.class.getSimpleName();
            q6.m.g(simpleName, "Listener type must not be empty");
            cVar.c(new com.google.android.gms.common.api.internal.m(x9Var, simpleName), 2418).continueWith(u7.b.f58436a, u7.a.f58434b);
        }
    }

    @Override
    public synchronized void requestLocationUpdates(qa qaVar, pa paVar) {
        x9 x9Var = (x9) ((HashMap) this.d).remove(paVar);
        if (x9Var != null) {
            u7.c cVar = (u7.c) this.f13939b;
            cVar.getClass();
            String simpleName = x9.class.getSimpleName();
            q6.m.g(simpleName, "Listener type must not be empty");
            cVar.c(new com.google.android.gms.common.api.internal.m(x9Var, simpleName), 2418).continueWith(u7.b.f58436a, u7.a.f58434b);
        }
        x9 x9Var2 = new x9(paVar);
        ((HashMap) this.d).put(paVar, x9Var2);
        ((u7.c) this.f13939b).f(((z9) qaVar).f28276a, x9Var2, Looper.getMainLooper());
    }

    public ColorStateList s(int i7) {
        int resourceId;
        ColorStateList a10;
        TypedArray typedArray = (TypedArray) this.f13940c;
        if (typedArray.hasValue(i7) && (resourceId = typedArray.getResourceId(i7, 0)) != 0 && (a10 = z.a((Context) this.f13939b, resourceId)) != null) {
            return a10;
        }
        return typedArray.getColorStateList(i7);
    }

    public Drawable t(int i7) {
        int resourceId;
        TypedArray typedArray = (TypedArray) this.f13940c;
        if (typedArray.hasValue(i7) && (resourceId = typedArray.getResourceId(i7, 0)) != 0) {
            return z.b((Context) this.f13939b, resourceId);
        }
        return typedArray.getDrawable(i7);
    }

    public String toString() {
        switch (this.f13938a) {
            case 2:
                StringBuilder sb2 = new StringBuilder();
                ArrayList arrayList = (ArrayList) this.f13939b;
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

    public Drawable v(int i7) {
        int resourceId;
        Drawable f10;
        if (((TypedArray) this.f13940c).hasValue(i7) && (resourceId = ((TypedArray) this.f13940c).getResourceId(i7, 0)) != 0) {
            m.q a10 = m.q.a();
            Context context = (Context) this.f13939b;
            synchronized (a10) {
                f10 = a10.f20184a.f(resourceId, context, true);
            }
            return f10;
        }
        return null;
    }

    @Override
    public void v0(int i7, boolean z10, boolean z11) {
        String str;
        if (!z10) {
            kk kkVar = (kk) this.d;
            HashMap hashMap = (HashMap) this.f13939b;
            ArrayList arrayList = (ArrayList) this.f13940c;
            si siVar = kkVar.f36766b;
            if (!hashMap.isEmpty() && kkVar.R != null && !kkVar.L) {
                kkVar.L = true;
                ArrayList arrayList2 = new ArrayList();
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    Object obj = hashMap.get(arrayList.get(i10));
                    ?? obj2 = new Object();
                    arrayList2.add(obj2);
                    if (obj instanceof ef) {
                        ef efVar = (ef) obj;
                        String str2 = efVar.h;
                        if (str2 != null) {
                            obj2.f28213c = str2;
                        } else {
                            obj2.f28213c = efVar.I;
                        }
                        obj2.f28214e = efVar.f27850c;
                        obj2.f28215f = efVar.f27853g;
                        obj2.f28219k = efVar.f27864s;
                        obj2.f28223o = efVar.f27849b;
                        CharSequence charSequence = efVar.f27848a;
                        if (charSequence != null) {
                            str = charSequence.toString();
                        } else {
                            str = null;
                        }
                        obj2.d = str;
                        obj2.f28217i = efVar.f27859n;
                        obj2.f28218j = efVar.f27863r;
                        obj2.h = efVar.f27868x;
                    }
                }
                org.telegram.ui.Components.b5.X(siVar.H3, siVar.Y0() + arrayList2.size(), siVar.c1(), new l2(i7, 2, kkVar, arrayList2, z11));
            }
        }
    }

    public Typeface w(int i7, int i10, j0 j0Var) {
        j0 j0Var2;
        XmlPullParserException xmlPullParserException;
        IOException iOException;
        int resourceId = ((TypedArray) this.f13940c).getResourceId(i7, 0);
        if (resourceId != 0) {
            if (((TypedValue) this.d) == null) {
                this.d = new TypedValue();
            }
            Context context = (Context) this.f13939b;
            TypedValue typedValue = (TypedValue) this.d;
            ThreadLocal threadLocal = h0.j.f13702a;
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
                    a0.j jVar = i0.e.f15899b;
                    Typeface typeface = (Typeface) jVar.a(i0.e.b(resources, resourceId, charSequence2, i11, i10));
                    if (typeface != null) {
                        new Handler(Looper.getMainLooper()).post(new a6(20, j0Var, typeface));
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
                            Typeface e14 = i0.e.f15898a.e(context, resources, resourceId, charSequence2, i10);
                            if (e14 != null) {
                                jVar.b(i0.e.b(resources, resourceId, charSequence2, i12, i10), e14);
                            }
                            if (e14 != null) {
                                new Handler(Looper.getMainLooper()).post(new a6(20, j0Var2, e14));
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

    public void y(fa faVar) {
        try {
            l8.f fVar = (l8.f) this.f13940c;
            k8.c cVar = new k8.c(faVar);
            Parcel p12 = fVar.p1();
            v7.b.c(p12, cVar);
            fVar.t1(p12, 9);
        } catch (RemoteException e10) {
            throw new RuntimeException(e10);
        }
    }

    public m(Object obj, Object obj2, Object obj3, int i7) {
        this.f13938a = i7;
        this.d = obj;
        this.f13939b = obj2;
        this.f13940c = obj3;
    }

    @Override
    public void onRenderedFirstFrame() {
        d7 d7Var = (d7) this.f13939b;
        Runnable[] runnableArr = (Runnable[]) this.f13940c;
        w5 w5Var = (w5) this.d;
        v5 v5Var = w5Var.I;
        if (v5Var != null && v5Var.f15579g) {
            int i7 = w5Var.f15655f;
            int i10 = w5Var.h;
            v5Var.d = true;
            v5Var.f15577e = i7;
            v5Var.f15578f = i10;
            org.telegram.ui.web.b bVar = v5Var.f15576c;
            if (bVar != null) {
                bVar.a(Integer.valueOf(i7), Integer.valueOf(v5Var.f15578f));
            }
        }
        Runnable runnable = runnableArr[0];
        if (runnable != null) {
            w5Var.post(runnable);
            runnableArr[0] = null;
            Bitmap bitmap = w5Var.f15646a;
            if (bitmap != null) {
                bitmap.recycle();
                if (d7Var.M0 == w5Var.f15646a) {
                    d7Var.M0 = null;
                }
                w5Var.f15646a = null;
                w5Var.invalidate();
                return;
            }
            return;
        }
        v51 v51Var = w5Var.f15663n;
        if (v51Var != null) {
            if (v5Var == null || !v5Var.f15579g) {
                v51Var.animate().alpha(1.0f).setDuration(180L).withEndAction(new r1(6, this, d7Var)).start();
            }
        }
    }

    public m(Object obj, Object obj2, Object obj3, boolean z10, int i7) {
        this.f13938a = i7;
        this.f13939b = obj;
        this.f13940c = obj2;
        this.d = obj3;
    }

    public m(ai.k0 k0Var, l8.f fVar) {
        this.f13938a = 7;
        this.f13940c = fVar;
        q6.m.h(k0Var);
        this.f13939b = k0Var;
    }

    public m(h hVar) {
        this.f13938a = 0;
        this.d = hVar;
        this.f13940c = new AtomicLong((j6.a.f17243b.nextLong() & 65535) * 10000);
    }

    public m(ih.b bVar) {
        this.f13938a = 3;
        this.f13939b = new ih.a();
        this.f13940c = bVar;
    }

    public m(Context context) {
        this.f13938a = 19;
        this.f13939b = context;
    }

    public m(int i7) {
        this.f13938a = i7;
        switch (i7) {
            case 29:
                this.f13939b = new Paint[4];
                this.d = new Matrix();
                return;
            default:
                this.d = new HashMap();
                return;
        }
    }

    public m(ArrayList arrayList) {
        this.f13938a = 9;
        this.f13939b = DesugarCollections.unmodifiableList(new ArrayList(arrayList));
        this.f13940c = new long[arrayList.size() * 2];
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            l4.c cVar = (l4.c) arrayList.get(i7);
            int i10 = i7 * 2;
            long[] jArr = (long[]) this.f13940c;
            jArr[i10] = cVar.f19647b;
            jArr[i10 + 1] = cVar.f19648c;
        }
        long[] jArr2 = (long[]) this.f13940c;
        long[] copyOf = Arrays.copyOf(jArr2, jArr2.length);
        this.d = copyOf;
        Arrays.sort(copyOf);
    }

    @Override
    public void u() {
    }

    @Override
    public void z() {
    }

    public m(View view) {
        this.f13938a = 28;
        this.d = view;
        r51 r51Var = new r51(this, view);
        this.f13939b = r51Var;
        view.addOnLayoutChangeListener(r51Var);
    }

    @Override
    public void A(Editable editable) {
    }

    @Override
    public void onSeekFinished(m2.a aVar) {
    }

    @Override
    public void onSeekStarted(m2.a aVar) {
    }

    public m(String str) {
        this.f13938a = 12;
        t tVar = new t();
        tVar.f10716q = s0.n("video/mp2t");
        tVar.f10717r = s0.n(str);
        this.f13939b = new u(tVar);
    }

    public m(Context context, TypedArray typedArray) {
        this.f13938a = 11;
        this.f13939b = context;
        this.f13940c = typedArray;
    }

    public m(f2.n[] nVarArr) {
        this.f13938a = 15;
        w0 w0Var = new w0();
        ?? obj = new Object();
        obj.f11085c = 1.0f;
        obj.d = 1.0f;
        f2.k kVar = f2.k.f11051e;
        obj.f11086e = kVar;
        obj.f11087f = kVar;
        obj.f11088g = kVar;
        obj.h = kVar;
        ByteBuffer byteBuffer = f2.n.f11057a;
        obj.f11091k = byteBuffer;
        obj.f11092l = byteBuffer;
        obj.f11084b = -1;
        f2.n[] nVarArr2 = new f2.n[nVarArr.length + 2];
        this.f13939b = nVarArr2;
        System.arraycopy(nVarArr, 0, nVarArr2, 0, nVarArr.length);
        this.f13940c = w0Var;
        this.d = obj;
        nVarArr2[nVarArr.length] = w0Var;
        nVarArr2[nVarArr.length + 1] = obj;
    }

    public m(Signature signature) {
        this.f13938a = 6;
        this.f13939b = signature;
        this.f13940c = null;
        this.d = null;
    }

    public m(Cipher cipher) {
        this.f13938a = 6;
        this.f13940c = cipher;
        this.f13939b = null;
        this.d = null;
    }

    public m(Mac mac) {
        this.f13938a = 6;
        this.d = mac;
        this.f13940c = null;
        this.f13939b = null;
    }

    public m(View view, jh.k kVar) {
        ViewTreeObserver viewTreeObserver;
        ViewTreeObserver viewTreeObserver2;
        this.f13938a = 5;
        r2 r2Var = new r2(this, 6);
        this.f13939b = view;
        this.f13940c = kVar;
        view.addOnAttachStateChangeListener(r2Var);
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
        this.f13938a = 2;
        this.d = qVar;
        this.f13939b = new ArrayList();
        ic.d dVar3 = dVar;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            dVar2 = gc.d.ECI;
            if (dVar3 == null) {
                break;
            }
            int i13 = dVar3.f16218c;
            int i14 = i11 + dVar3.d;
            ic.d dVar4 = dVar3.f16219e;
            int i15 = i12;
            gc.d dVar5 = dVar3.f16216a;
            boolean z10 = (dVar5 == gc.d.BYTE && dVar4 == null && i13 != 0) || !(dVar4 == null || i13 == dVar4.f16218c);
            i7 = z10 ? 1 : i15;
            if (dVar4 == null || dVar4.f16216a != dVar5 || z10) {
                ((ArrayList) this.f13939b).add(0, new ic.e(this, dVar5, dVar3.f16217b, i13, i14));
                i10 = 0;
            } else {
                i10 = i14;
            }
            if (z10) {
                ((ArrayList) this.f13939b).add(0, new ic.e(this, dVar2, dVar3.f16217b, dVar3.f16218c, 0));
            }
            i12 = i7;
            dVar3 = dVar4;
            i11 = i10;
        }
        int i16 = i12;
        boolean z11 = qVar.f987a;
        gc.b bVar = (gc.b) qVar.d;
        if (z11) {
            ic.e eVar2 = (ic.e) ((ArrayList) this.f13939b).get(0);
            if (eVar2 != null && eVar2.f16221a != dVar2 && i16 != 0) {
                ((ArrayList) this.f13939b).add(0, new ic.e(this, dVar2, 0, 0, 0));
            }
            ((ArrayList) this.f13939b).add(((ic.e) ((ArrayList) this.f13939b).get(0)).f16221a == dVar2 ? 1 : 0, new ic.e(this, gc.d.FNC1_FIRST_POSITION, 0, 0, 0));
        }
        int i17 = eVar.f13471a;
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
        int C = C(eVar);
        while (i17 < i18 && !ic.b.d(C, gc.e.c(i17), bVar)) {
            i17++;
        }
        while (i17 > i7 && ic.b.d(C, gc.e.c(i17 - 1), bVar)) {
            i17--;
        }
        this.f13940c = gc.e.c(i17);
    }

    public m(l2.h hVar, m2.i iVar) {
        this.f13938a = 8;
        this.d = hVar;
        this.f13939b = new HashMap();
        this.f13940c = iVar;
    }

    public m(Object[] objArr, Object[] objArr2) {
        this.f13938a = 27;
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
        this.f13939b = iArr;
        this.f13940c = l(objArr, iArr);
        this.d = l(objArr2, iArr);
    }

    @Override
    public void x(Canvas canvas, RectF rectF, float f10, float f11, float f12, int i7, boolean z10) {
    }
}
