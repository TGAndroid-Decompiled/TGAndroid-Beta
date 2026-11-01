package li;

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
import android.media.AudioAttributes;
import android.media.MediaCodec;
import android.media.MediaFormat;
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
import android.view.Choreographer;
import android.view.View;
import com.google.android.gms.common.api.internal.p1;
import com.google.android.gms.location.LocationRequest;
import e9.m2;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.StringReader;
import java.lang.reflect.Array;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.locks.ReentrantLock;
import m.p3;
import org.telegram.messenger.ILocationServiceProvider;
import org.telegram.messenger.aa;
import org.telegram.messenger.ba;
import org.telegram.messenger.ca;
import org.telegram.messenger.da;
import org.telegram.messenger.f8;
import org.telegram.messenger.ff;
import org.telegram.messenger.fu;
import org.telegram.messenger.kp;
import org.telegram.messenger.qa;
import org.telegram.messenger.r20;
import org.telegram.messenger.ra;
import org.telegram.messenger.sa;
import org.telegram.messenger.ta;
import org.telegram.messenger.ua;
import org.telegram.ui.ActionBar.b1;
import org.telegram.ui.ActionBar.k2;
import org.telegram.ui.Components.bi;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.cy0;
import org.telegram.ui.Components.i61;
import org.telegram.ui.Components.jj;
import org.telegram.ui.Components.mj0;
import org.telegram.ui.Components.qy0;
import org.telegram.ui.Components.s4;
import org.telegram.ui.Components.xj;
import org.telegram.ui.io0;
import org.telegram.ui.un;
import org.telegram.ui.vv0;
import org.telegram.ui.wz0;
import org.xmlpull.v1.XmlPullParserException;
import v7.c8;
import v7.r7;
import v7.t6;
public class k implements a1, ILocationServiceProvider, kp, mj0, io0, wz0 {
    public final int f12100a;
    public Object f12101b;
    public Object f12102c;
    public Object d;

    public k(int i10, boolean z10) {
        this.f12100a = i10;
    }

    public static k G(Context context, AttributeSet attributeSet, int[] iArr, int i10) {
        return new k(context, context.obtainStyledAttributes(attributeSet, iArr, i10, 0));
    }

    public static StringBuilder H(String str) {
        StringBuilder sb2;
        String[] strArr;
        int i10;
        byte[] H;
        int i11;
        try {
            BufferedReader bufferedReader = new BufferedReader(new StringReader(str));
            int i12 = 0;
            boolean z10 = false;
            k kVar = null;
            String str2 = null;
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                } else if (!readLine.startsWith("PHOTO")) {
                    if (readLine.indexOf(58) >= 0) {
                        if (readLine.startsWith("BEGIN:VCARD")) {
                            kVar = new k(15, false);
                            kVar.f12102c = new ArrayList();
                            kVar.d = new ArrayList();
                        } else if (readLine.startsWith("END:VCARD") && kVar != null) {
                            z10 = true;
                        }
                    }
                    if (str2 != null) {
                        readLine = str2 + readLine;
                        str2 = null;
                    }
                    if (readLine.contains("=QUOTED-PRINTABLE") && readLine.endsWith("=")) {
                        str2 = readLine.substring(i12, readLine.length() - 1);
                    } else {
                        int indexOf = readLine.indexOf(":");
                        if (indexOf >= 0) {
                            strArr = new String[]{readLine.substring(i12, indexOf), readLine.substring(indexOf + 1).trim()};
                        } else {
                            strArr = new String[]{readLine.trim()};
                        }
                        if (strArr.length < 2 || kVar == null) {
                            i10 = i12;
                        } else if (strArr[i12].startsWith("ORG")) {
                            String[] split = strArr[i12].split(";");
                            int length = split.length;
                            int i13 = i12;
                            String str3 = null;
                            String str4 = null;
                            while (i13 < length) {
                                String[] split2 = split[i13].split("=");
                                sb2 = null;
                                try {
                                    if (split2.length != 2) {
                                        i11 = i12;
                                    } else {
                                        i11 = i12;
                                        if (split2[i12].equals("CHARSET")) {
                                            str4 = split2[1];
                                        } else if (split2[i11].equals("ENCODING")) {
                                            str3 = split2[1];
                                        }
                                    }
                                    i13++;
                                    i12 = i11;
                                } catch (Throwable unused) {
                                    return sb2;
                                }
                            }
                            i10 = i12;
                            kVar.f12101b = strArr[1];
                            if (str3 != null && str3.equalsIgnoreCase("QUOTED-PRINTABLE") && (H = org.telegram.messenger.i0.H(org.telegram.messenger.i0.h1((String) kVar.f12101b))) != null && H.length != 0) {
                                kVar.f12101b = new String(H, str4);
                            }
                            kVar.f12101b = ((String) kVar.f12101b).replace(';', ' ');
                        } else {
                            i10 = i12;
                            if (strArr[i10].startsWith("TEL")) {
                                if (strArr[1].length() > 0) {
                                    ((ArrayList) kVar.d).add(strArr[1]);
                                }
                            } else if (strArr[i10].startsWith("EMAIL")) {
                                String str5 = strArr[1];
                                if (str5.length() > 0) {
                                    ((ArrayList) kVar.f12102c).add(str5);
                                }
                            }
                        }
                        i12 = i10;
                    }
                }
                return sb2;
            }
            int i14 = i12;
            sb2 = null;
            try {
                bufferedReader.close();
            } catch (Exception e) {
                f8.g(e, true);
            }
            if (!z10) {
                return null;
            }
            StringBuilder sb3 = new StringBuilder();
            for (int i15 = i14; i15 < ((ArrayList) kVar.d).size(); i15++) {
                if (sb3.length() > 0) {
                    sb3.append('\n');
                }
                String str6 = (String) ((ArrayList) kVar.d).get(i15);
                if (!str6.contains("#") && !str6.contains("*")) {
                    sb3.append(af.b.c().b(str6));
                }
                sb3.append(str6);
            }
            for (int i16 = i14; i16 < ((ArrayList) kVar.f12102c).size(); i16++) {
                if (sb3.length() > 0) {
                    sb3.append('\n');
                }
                sb3.append(af.b.c().b((String) ((ArrayList) kVar.f12102c).get(i16)));
            }
            if (!TextUtils.isEmpty((String) kVar.f12101b)) {
                if (sb3.length() > 0) {
                    sb3.append('\n');
                }
                sb3.append((String) kVar.f12101b);
            }
            return sb3;
        } catch (Throwable unused2) {
            return null;
        }
    }

    public static void J(File file, File file2) {
        if (file2.isDirectory() && !file2.delete()) {
            Log.e("AtomicFile", "Failed to delete file which is a directory " + file2);
        }
        if (!file.renameTo(file2)) {
            Log.e("AtomicFile", "Failed to rename " + file + " to " + file2);
        }
    }

    public static k i(View view) {
        return new k(view);
    }

    public static Object[] m(Object[] objArr, int[] iArr) {
        int length = objArr.length;
        Class<?> componentType = objArr.getClass().getComponentType();
        cy0 cy0Var = qy0.R;
        int i10 = -1;
        for (int i11 : iArr) {
            i10 = Math.max(i10, i11);
        }
        Object[] objArr2 = (Object[]) Array.newInstance(componentType, i10 + 1);
        for (int i12 = 0; i12 < length; i12++) {
            objArr2[iArr[i12]] = objArr[i12];
        }
        return objArr2;
    }

    public static n2.e n(b2.h0 h0Var) {
        String uri;
        boolean z10;
        boolean z11;
        g2.p pVar = new g2.p();
        byte[] bArr = null;
        pVar.f7330c = null;
        Uri uri2 = h0Var.f2057b;
        if (uri2 == null) {
            uri = null;
        } else {
            uri = uri2.toString();
        }
        boolean z12 = h0Var.f2059f;
        ?? obj = new Object();
        if (z12 && TextUtils.isEmpty(uri)) {
            z10 = false;
        } else {
            z10 = true;
        }
        t6.f(z10);
        obj.f363b = pVar;
        obj.f364c = uri;
        obj.f362a = z12;
        obj.d = new HashMap();
        e9.q0 q0Var = h0Var.f2058c;
        e9.y0 y0Var = q0Var.f6402a;
        if (y0Var == null) {
            y0Var = q0Var.b();
            q0Var.f6402a = y0Var;
        }
        m2 it = y0Var.iterator();
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
        int i10 = b2.n.f2119a;
        hb.a aVar = new hb.a(27);
        UUID uuid = h0Var.f2056a;
        uuid.getClass();
        boolean z13 = h0Var.d;
        boolean z14 = h0Var.e;
        int[] f7 = c8.f(h0Var.f2060g);
        for (int i11 : f7) {
            if (i11 != 2 && i11 != 1) {
                z11 = false;
            } else {
                z11 = true;
            }
            t6.f(z11);
        }
        n2.e eVar = new n2.e(uuid, obj, hashMap, z13, (int[]) f7.clone(), z14, aVar);
        byte[] bArr2 = h0Var.h;
        if (bArr2 != null) {
            bArr = Arrays.copyOf(bArr2, bArr2.length);
        }
        t6.p(eVar.f13454x.isEmpty());
        eVar.K = bArr;
        return eVar;
    }

    @Override
    public boolean A() {
        return false;
    }

    public Typeface C(int i10, int i11, e2.j0 j0Var) {
        e2.j0 j0Var2;
        XmlPullParserException xmlPullParserException;
        IOException iOException;
        int resourceId = ((TypedArray) this.f12102c).getResourceId(i10, 0);
        if (resourceId != 0) {
            if (((TypedValue) this.d) == null) {
                this.d = new TypedValue();
            }
            Context context = (Context) this.f12101b;
            TypedValue typedValue = (TypedValue) this.d;
            ThreadLocal threadLocal = h0.j.f7558a;
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
                    int i12 = typedValue.assetCookie;
                    a0.j jVar = i0.f.f7773b;
                    Typeface typeface = (Typeface) jVar.a(i0.f.b(resources, resourceId, charSequence2, i12, i11));
                    if (typeface != null) {
                        new Handler(Looper.getMainLooper()).post(new d1.e(14, j0Var, typeface));
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
                                } catch (IOException e) {
                                    iOException = e;
                                    j0Var2 = j0Var;
                                    Log.e("ResourcesCompat", "Failed to read xml resource ".concat(charSequence2), iOException);
                                    j0Var2.b();
                                    return null;
                                } catch (XmlPullParserException e7) {
                                    xmlPullParserException = e7;
                                    j0Var2 = j0Var;
                                    Log.e("ResourcesCompat", "Failed to parse xml resource ".concat(charSequence2), xmlPullParserException);
                                    j0Var2.b();
                                    return null;
                                }
                            }
                            try {
                                return i0.f.a(context, g10, resources, resourceId, charSequence2, typedValue.assetCookie, i11, j0Var);
                            } catch (IOException e10) {
                                e = e10;
                                j0Var2 = j0Var;
                                iOException = e;
                                Log.e("ResourcesCompat", "Failed to read xml resource ".concat(charSequence2), iOException);
                                j0Var2.b();
                                return null;
                            } catch (XmlPullParserException e11) {
                                e = e11;
                                j0Var2 = j0Var;
                                xmlPullParserException = e;
                                Log.e("ResourcesCompat", "Failed to parse xml resource ".concat(charSequence2), xmlPullParserException);
                                j0Var2.b();
                                return null;
                            }
                        }
                        j0Var2 = j0Var;
                        try {
                            int i13 = typedValue.assetCookie;
                            Typeface e12 = i0.f.f7772a.e(context, resources, resourceId, charSequence2, i11);
                            if (e12 != null) {
                                jVar.b(i0.f.b(resources, resourceId, charSequence2, i13, i11), e12);
                            }
                            if (e12 != null) {
                                new Handler(Looper.getMainLooper()).post(new d1.e(14, j0Var2, e12));
                            } else {
                                j0Var2.b();
                            }
                            return e12;
                        } catch (IOException e13) {
                            e = e13;
                            iOException = e;
                            Log.e("ResourcesCompat", "Failed to read xml resource ".concat(charSequence2), iOException);
                            j0Var2.b();
                            return null;
                        } catch (XmlPullParserException e14) {
                            e = e14;
                            xmlPullParserException = e;
                            Log.e("ResourcesCompat", "Failed to parse xml resource ".concat(charSequence2), xmlPullParserException);
                            j0Var2.b();
                            return null;
                        }
                    } catch (IOException e15) {
                        e = e15;
                        j0Var2 = j0Var;
                    } catch (XmlPullParserException e16) {
                        e = e16;
                        j0Var2 = j0Var;
                    }
                } else {
                    throw new Resources.NotFoundException("Resource \"" + resources.getResourceName(resourceId) + "\" (" + Integer.toHexString(resourceId) + ") is not a Font: " + typedValue);
                }
            }
        }
        return null;
    }

    public Paint D(float f7, int i10) {
        Paint[] paintArr = (Paint[]) this.f12101b;
        if (paintArr[i10] == null) {
            Paint paint = new Paint(1);
            paintArr[i10] = paint;
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        }
        paintArr[i10].setShader(null);
        paintArr[i10].setColor(-65536);
        paintArr[i10].setAlpha((int) (f7 * 255.0f));
        return paintArr[i10];
    }

    public boolean E() {
        String trim;
        ArrayDeque arrayDeque = (ArrayDeque) this.f12102c;
        if (((String) this.d) != null) {
            return true;
        }
        if (!arrayDeque.isEmpty()) {
            String str = (String) arrayDeque.poll();
            str.getClass();
            this.d = str;
            return true;
        }
        do {
            String readLine = ((BufferedReader) this.f12101b).readLine();
            this.d = readLine;
            if (readLine != null) {
                trim = readLine.trim();
                this.d = trim;
            } else {
                return false;
            }
        } while (trim.isEmpty());
        return true;
    }

    public String F() {
        if (E()) {
            String str = (String) this.d;
            this.d = null;
            return str;
        }
        throw new NoSuchElementException();
    }

    public void I() {
        ((TypedArray) this.f12102c).recycle();
    }

    public FileOutputStream K() {
        File file = (File) this.f12102c;
        File file2 = (File) this.d;
        if (file2.exists()) {
            J(file2, (File) this.f12101b);
        }
        try {
            return new FileOutputStream(file);
        } catch (FileNotFoundException unused) {
            if (file.getParentFile().mkdirs()) {
                try {
                    return new FileOutputStream(file);
                } catch (FileNotFoundException e) {
                    throw new IOException("Failed to create new file " + file, e);
                }
            }
            throw new IOException("Failed to create directory for " + file);
        }
    }

    public void L(boolean z10, float f7) {
        b1[] b1VarArr = (b1[]) this.d;
        for (int i10 = 0; i10 < b1VarArr.length; i10++) {
            if (z10 && ((i10 == 0 && Math.abs(f7 - 0.2f) < 0.01f) || ((i10 == 1 && Math.abs(f7 - 0.5f) < 0.1f) || ((i10 == 2 && Math.abs(f7 - 1.0f) < 0.1f) || ((i10 == 3 && Math.abs(f7 - 1.5f) < 0.1f) || (i10 == 4 && Math.abs(f7 - 2.0f) < 0.1f)))))) {
                b1VarArr[i10].d(-9718023, -9718023);
            } else {
                b1VarArr[i10].d(-328966, -328966);
            }
        }
        ((org.telegram.ui.ActionBar.x0) this.f12102c).e(true, f7);
    }

    public void M(Object obj, String str) {
        k kVar = new k(9, false);
        ((k) this.d).d = kVar;
        this.d = kVar;
        kVar.f12102c = obj;
        kVar.f12101b = str;
    }

    @Override
    public void a() {
        ((gf.e) this.f12101b).b();
        ((k2) this.f12102c).presentFragment(new un((Bundle) this.d));
    }

    @Override
    public void b() {
        r20 r20Var;
        boolean[] zArr = (boolean[]) this.f12101b;
        if (!zArr[0] && (r20Var = (r20) this.f12102c) != null) {
            zArr[0] = true;
            r20Var.a(Boolean.TRUE);
        }
        org.telegram.messenger.i0.h3(new vv0((cc) this.d, 11), 200L);
    }

    @Override
    public void checkLocationSettings(ta taVar, q0.a aVar) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(((da) taVar).f15332a);
        r7.c cVar = (r7.c) this.f12102c;
        g8.c cVar2 = new g8.c(arrayList, false, false);
        cVar.getClass();
        com.google.android.gms.common.api.internal.v b10 = com.google.android.gms.common.api.internal.w.b();
        b10.f4496c = new l2.f(cVar2, 24);
        b10.f4494a = 2426;
        cVar.e(0, b10.a()).addOnCompleteListener(new aa(aVar, 1));
    }

    @Override
    public boolean checkServices() {
        return fu.f15792b.hasServices();
    }

    @Override
    public boolean e() {
        return true;
    }

    @Override
    public boolean f() {
        return true;
    }

    @Override
    public void g(boolean z10) {
        ((gf.e) this.f12101b).b();
        ((k2) this.f12102c).presentFragment(new un((Bundle) this.d));
    }

    @Override
    public void getLastLocation(q0.a aVar) {
        r7.c cVar = (r7.c) this.f12101b;
        cVar.getClass();
        com.google.android.gms.common.api.internal.v b10 = com.google.android.gms.common.api.internal.w.b();
        b10.f4496c = r7.a.f46349c;
        b10.f4494a = 2414;
        cVar.e(0, b10.a()).addOnCompleteListener(new aa(aVar, 0));
    }

    @Override
    public boolean h() {
        return false;
    }

    @Override
    public void h0() {
        ((xj) this.d).Q.B();
    }

    @Override
    public void init(Context context) {
        com.google.android.gms.common.api.e eVar = g8.b.f7450a;
        com.google.android.gms.common.api.i iVar = com.google.android.gms.common.api.i.f4346c;
        com.google.android.gms.common.api.e eVar2 = r7.c.f46351k;
        com.google.android.gms.common.api.a aVar = com.google.android.gms.common.api.b.f4337k;
        this.f12101b = new com.google.android.gms.common.api.j(context, eVar2, aVar, iVar);
        this.f12102c = new com.google.android.gms.common.api.j(context, eVar2, aVar, iVar);
    }

    public String j(int i10, long j10, long j11, String str) {
        ArrayList arrayList = (ArrayList) this.f12101b;
        ArrayList arrayList2 = (ArrayList) this.d;
        ArrayList arrayList3 = (ArrayList) this.f12102c;
        StringBuilder sb2 = new StringBuilder();
        for (int i11 = 0; i11 < arrayList3.size(); i11++) {
            sb2.append((String) arrayList.get(i11));
            if (((Integer) arrayList3.get(i11)).intValue() == 1) {
                sb2.append(str);
            } else if (((Integer) arrayList3.get(i11)).intValue() == 2) {
                sb2.append(String.format(Locale.US, (String) arrayList2.get(i11), Long.valueOf(j10)));
            } else if (((Integer) arrayList3.get(i11)).intValue() == 3) {
                sb2.append(String.format(Locale.US, (String) arrayList2.get(i11), Integer.valueOf(i10)));
            } else if (((Integer) arrayList3.get(i11)).intValue() == 4) {
                sb2.append(String.format(Locale.US, (String) arrayList2.get(i11), Long.valueOf(j11)));
            }
        }
        sb2.append((String) arrayList.get(arrayList3.size()));
        return sb2.toString();
    }

    public void k() {
        android.support.v4.media.session.a0 a0Var = (android.support.v4.media.session.a0) this.f12101b;
        if (a0Var != null) {
            int i10 = ((p4.e) this.d).f44731n.d;
            android.support.v4.media.session.u uVar = (android.support.v4.media.session.u) a0Var.f875b;
            uVar.getClass();
            AudioAttributes.Builder builder = new AudioAttributes.Builder();
            builder.setLegacyStreamType(i10);
            uVar.f902a.setPlaybackToLocal(builder.build());
            this.f12102c = null;
        }
    }

    public void l(Canvas canvas, RectF rectF, float f7) {
        Paint[] paintArr = (Paint[]) this.f12101b;
        if (paintArr[0] == null) {
            Paint paint = new Paint(1);
            paintArr[0] = paint;
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        }
        paintArr[0].setShader((LinearGradient) this.f12102c);
        paintArr[0].setAlpha((int) (f7 * 255.0f));
        canvas.drawRect(rectF, paintArr[0]);
    }

    public void o(Canvas canvas, RectF rectF, int i10, float f7) {
        Paint[] paintArr = (Paint[]) this.f12101b;
        Matrix matrix = (Matrix) this.d;
        if (f7 <= 0.0f) {
            return;
        }
        if (((LinearGradient) this.f12102c) == null) {
            this.f12102c = new LinearGradient(0.0f, 0.0f, 0.0f, 16.0f, new int[]{-65536, 16711680}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        }
        if (paintArr[i10] == null) {
            paintArr[i10] = new Paint(1);
            paintArr[i10].setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        }
        paintArr[i10].setShader((LinearGradient) this.f12102c);
        matrix.reset();
        if (i10 == 0) {
            matrix.postScale(1.0f, rectF.width() / 16.0f);
            matrix.postRotate(-90.0f);
            matrix.postTranslate(rectF.left, rectF.top);
        } else if (i10 == 1) {
            matrix.postScale(1.0f, rectF.height() / 16.0f);
            matrix.postTranslate(rectF.left, rectF.top);
        } else if (i10 == 2) {
            matrix.postScale(1.0f, rectF.width() / 16.0f);
            matrix.postRotate(90.0f);
            matrix.postTranslate(rectF.right, rectF.top);
        } else if (i10 == 3) {
            matrix.postScale(1.0f, rectF.height() / 16.0f);
            matrix.postScale(1.0f, -1.0f);
            matrix.postTranslate(rectF.left, rectF.bottom);
        }
        ((LinearGradient) this.f12102c).setLocalMatrix(matrix);
        paintArr[i10].setAlpha((int) (255.0f * f7));
        canvas.drawRect(rectF, paintArr[i10]);
    }

    @Override
    public ta onCreateLocationRequest() {
        LocationRequest locationRequest = new LocationRequest(102, 3600000L, 600000L, 0L, Long.MAX_VALUE, Long.MAX_VALUE, Integer.MAX_VALUE, 0.0f, true, 3600000L, 0, 0, null, false, new WorkSource(), null);
        ?? obj = new Object();
        obj.f15332a = locationRequest;
        return obj;
    }

    @Override
    public ua onCreateLocationServicesAPI(Context context, qa qaVar, final ra raVar) {
        List list;
        boolean z10;
        Context context2 = org.telegram.messenger.w0.f18945b;
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        ?? lVar = new a0.l(0);
        ?? lVar2 = new a0.l(0);
        Object obj = k6.d.f10935c;
        a8.d dVar = n8.b.f13734a;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Looper mainLooper = context2.getMainLooper();
        String packageName = context2.getPackageName();
        String name = context2.getClass().getName();
        com.google.android.gms.common.api.e eVar = g8.b.f7450a;
        n6.l.h(eVar, "Api must not be null");
        com.google.android.gms.common.api.e eVar2 = null;
        lVar2.put(eVar, null);
        a8.d dVar2 = eVar.f4338a;
        n6.l.h(dVar2, "Base client builder must not be null");
        switch (dVar2.f312a) {
            case 17:
                list = Collections.EMPTY_LIST;
                break;
            default:
                list = Collections.EMPTY_LIST;
                break;
        }
        hashSet2.addAll(list);
        hashSet.addAll(list);
        arrayList.add(new ca(qaVar));
        arrayList2.add(new com.google.android.gms.common.api.l() {
            @Override
            public final void onConnectionFailed(k6.a aVar) {
                od odVar = (od) ra.this;
                if (!odVar.L) {
                    odVar.K = Boolean.FALSE;
                    if (odVar.D) {
                        odVar.D = false;
                        odVar.p();
                    }
                }
            }
        });
        boolean z11 = true;
        n6.l.a("must call addApi() to add at least one API", !lVar2.isEmpty());
        n8.a aVar = n8.a.f13733a;
        com.google.android.gms.common.api.e eVar3 = n8.b.f13735b;
        if (lVar2.containsKey(eVar3)) {
            aVar = (n8.a) lVar2.get(eVar3);
        }
        p3 p3Var = new p3(hashSet, lVar, packageName, name, aVar);
        Map map = (Map) p3Var.f12521c;
        a0.l lVar3 = new a0.l(0);
        a0.l lVar4 = new a0.l(0);
        ArrayList arrayList3 = new ArrayList();
        Iterator it = ((a0.c) lVar2.keySet()).iterator();
        a0.l lVar5 = lVar2;
        while (true) {
            a0.b bVar = (a0.b) it;
            if (bVar.hasNext()) {
                com.google.android.gms.common.api.e eVar4 = (com.google.android.gms.common.api.e) bVar.next();
                Object obj2 = lVar5.get(eVar4);
                if (map.get(eVar4) != null) {
                    z10 = z11;
                } else {
                    z10 = false;
                }
                lVar3.put(eVar4, Boolean.valueOf(z10));
                a0.l lVar6 = lVar4;
                Looper looper = mainLooper;
                p1 p1Var = new p1(eVar4, z10);
                arrayList3.add(p1Var);
                a8.d dVar3 = eVar4.f4338a;
                n6.l.g(dVar3);
                ArrayList arrayList4 = arrayList3;
                Map map2 = map;
                p3 p3Var2 = p3Var;
                a0.l lVar7 = lVar5;
                a0.l lVar8 = lVar3;
                com.google.android.gms.common.api.c a2 = dVar3.a(context2, looper, p3Var2, obj2, p1Var, p1Var);
                lVar6.put(eVar4.f4339b, a2);
                if (a2.b()) {
                    if (eVar2 == null) {
                        mainLooper = looper;
                        p3Var = p3Var2;
                        eVar2 = eVar4;
                    } else {
                        throw new IllegalStateException(a1.g.C(eVar4.f4340c, " cannot be used with ", eVar2.f4340c));
                    }
                } else {
                    mainLooper = looper;
                    p3Var = p3Var2;
                }
                lVar4 = lVar6;
                map = map2;
                lVar3 = lVar8;
                lVar5 = lVar7;
                arrayList3 = arrayList4;
                z11 = true;
            } else {
                p3 p3Var3 = p3Var;
                a0.f fVar = lVar3;
                a0.f fVar2 = lVar4;
                ArrayList arrayList5 = arrayList3;
                Looper looper2 = mainLooper;
                if (eVar2 != null) {
                    boolean equals = hashSet.equals(hashSet2);
                    String str = eVar2.f4340c;
                    if (!equals) {
                        throw new IllegalStateException(a1.g.n("Must not set scopes in GoogleApiClient.Builder when using ", str, ". Set account in GoogleSignInOptions.Builder instead."));
                    }
                }
                com.google.android.gms.common.api.internal.k0 k0Var = new com.google.android.gms.common.api.internal.k0(context2, new ReentrantLock(), looper2, p3Var3, fVar, arrayList, arrayList2, fVar2, com.google.android.gms.common.api.internal.k0.f(fVar2.values(), true), arrayList5);
                Set set = com.google.android.gms.common.api.m.f4528a;
                synchronized (set) {
                    set.add(k0Var);
                }
                ?? obj3 = new Object();
                obj3.f4415a = k0Var;
                return obj3;
            }
        }
    }

    @Override
    public void p(ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(bufferInfo.size);
        byteBuffer.position(bufferInfo.offset);
        byteBuffer.limit(bufferInfo.offset + bufferInfo.size);
        allocateDirect.put(byteBuffer).flip();
        MediaCodec.BufferInfo bufferInfo2 = new MediaCodec.BufferInfo();
        bufferInfo2.set(0, bufferInfo.size, bufferInfo.presentationTimeUs, bufferInfo.flags);
        ((ArrayList) this.f12101b).add(allocateDirect);
        ((ArrayList) this.f12102c).add(bufferInfo2);
    }

    public void q(Object obj, ByteArrayOutputStream byteArrayOutputStream) {
        HashMap hashMap = (HashMap) this.f12101b;
        ma.f fVar = new ma.f(byteArrayOutputStream, hashMap, (HashMap) this.f12102c, (ja.d) this.d);
        if (obj == null) {
            return;
        }
        ja.d dVar = (ja.d) hashMap.get(obj.getClass());
        if (dVar != null) {
            dVar.a(obj, fVar);
            return;
        }
        throw new RuntimeException("No encoder for " + obj.getClass());
    }

    @Override
    public synchronized void removeLocationUpdates(sa saVar) {
        ba baVar = (ba) ((HashMap) this.d).remove(saVar);
        if (baVar != null) {
            r7.c cVar = (r7.c) this.f12101b;
            cVar.getClass();
            String simpleName = ba.class.getSimpleName();
            n6.l.f(simpleName, "Listener type must not be empty");
            cVar.c(new com.google.android.gms.common.api.internal.n(baVar, simpleName), 2418).continueWith(r7.b.f46350a, r7.a.f46348b);
        }
    }

    @Override
    public synchronized void requestLocationUpdates(ta taVar, sa saVar) {
        ba baVar = (ba) ((HashMap) this.d).remove(saVar);
        if (baVar != null) {
            r7.c cVar = (r7.c) this.f12101b;
            cVar.getClass();
            String simpleName = ba.class.getSimpleName();
            n6.l.f(simpleName, "Listener type must not be empty");
            cVar.c(new com.google.android.gms.common.api.internal.n(baVar, simpleName), 2418).continueWith(r7.b.f46350a, r7.a.f46348b);
        }
        ba baVar2 = new ba(saVar);
        ((HashMap) this.d).put(saVar, baVar2);
        ((r7.c) this.f12101b).f(((da) taVar).f15332a, baVar2, Looper.getMainLooper());
    }

    public n2.m s(b2.p0 p0Var) {
        n2.e eVar;
        p0Var.f2182b.getClass();
        b2.h0 h0Var = p0Var.f2182b.f2093c;
        if (h0Var == null) {
            return n2.m.f13466m;
        }
        synchronized (this.f12101b) {
            try {
                if (!h0Var.equals((b2.h0) this.f12102c)) {
                    this.f12102c = h0Var;
                    this.d = n(h0Var);
                }
                eVar = (n2.e) this.d;
                eVar.getClass();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return eVar;
    }

    public String toString() {
        switch (this.f12100a) {
            case 10:
                StringBuilder sb2 = new StringBuilder(32);
                sb2.append((String) this.f12101b);
                sb2.append('{');
                k kVar = (k) ((k) this.f12102c).d;
                String str = "";
                while (kVar != null) {
                    Object obj = kVar.f12102c;
                    sb2.append(str);
                    String str2 = (String) kVar.f12101b;
                    if (str2 != null) {
                        sb2.append(str2);
                        sb2.append('=');
                    }
                    if (obj != null && obj.getClass().isArray()) {
                        String deepToString = Arrays.deepToString(new Object[]{obj});
                        sb2.append((CharSequence) deepToString, 1, deepToString.length() - 1);
                    } else {
                        sb2.append(obj);
                    }
                    kVar = (k) kVar.d;
                    str = ", ";
                }
                sb2.append('}');
                return sb2.toString();
            default:
                return super.toString();
        }
    }

    public ColorStateList u(int i10) {
        int resourceId;
        ColorStateList a2;
        TypedArray typedArray = (TypedArray) this.f12102c;
        if (typedArray.hasValue(i10) && (resourceId = typedArray.getResourceId(i10, 0)) != 0 && (a2 = r7.a((Context) this.f12101b, resourceId)) != null) {
            return a2;
        }
        return typedArray.getColorStateList(i10);
    }

    @Override
    public void u0(int i10, boolean z10, boolean z11) {
        String str;
        if (!z10) {
            xj xjVar = (xj) this.d;
            HashMap hashMap = (HashMap) this.f12101b;
            ArrayList arrayList = (ArrayList) this.f12102c;
            bi biVar = xjVar.f30964b;
            if (!hashMap.isEmpty() && xjVar.Q != null && !xjVar.K) {
                xjVar.K = true;
                ArrayList arrayList2 = new ArrayList();
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    Object obj = hashMap.get(arrayList.get(i11));
                    ?? obj2 = new Object();
                    arrayList2.add(obj2);
                    if (obj instanceof ff) {
                        ff ffVar = (ff) obj;
                        String str2 = ffVar.h;
                        if (str2 != null) {
                            obj2.f17850c = str2;
                        } else {
                            obj2.f17850c = ffVar.I;
                        }
                        obj2.e = ffVar.f14604c;
                        obj2.f17851f = ffVar.f14606g;
                        obj2.f17855k = ffVar.f14617s;
                        obj2.f17859o = ffVar.f14603b;
                        CharSequence charSequence = ffVar.f14602a;
                        if (charSequence != null) {
                            str = charSequence.toString();
                        } else {
                            str = null;
                        }
                        obj2.d = str;
                        obj2.f17853i = ffVar.f14612n;
                        obj2.f17854j = ffVar.f14616r;
                        obj2.h = ffVar.f14621x;
                    }
                }
                s4.Z(biVar.D3, biVar.W0() + arrayList2.size(), biVar.a1(), new jj(i10, 0, xjVar, arrayList2, z11));
            }
        }
    }

    public Drawable v(int i10) {
        int resourceId;
        TypedArray typedArray = (TypedArray) this.f12102c;
        if (typedArray.hasValue(i10) && (resourceId = typedArray.getResourceId(i10, 0)) != 0) {
            return r7.b((Context) this.f12101b, resourceId);
        }
        return typedArray.getDrawable(i10);
    }

    @Override
    public void w(MediaFormat mediaFormat) {
        this.d = mediaFormat;
    }

    @Override
    public void x(android.view.View r13, sg.o0 r14, boolean r15, boolean r16) {
        throw new UnsupportedOperationException("Method not decompiled: li.k.x(android.view.View, sg.o0, boolean, boolean):void");
    }

    public Drawable z(int i10) {
        int resourceId;
        Drawable f7;
        if (((TypedArray) this.f12102c).hasValue(i10) && (resourceId = ((TypedArray) this.f12102c).getResourceId(i10, 0)) != 0) {
            m.q a2 = m.q.a();
            Context context = (Context) this.f12101b;
            synchronized (a2) {
                f7 = a2.f12525a.f(resourceId, context, true);
            }
            return f7;
        }
        return null;
    }

    public k(Object obj, Object obj2, Object obj3, int i10) {
        this.f12100a = i10;
        this.f12101b = obj;
        this.f12102c = obj2;
        this.d = obj3;
    }

    public k(Object obj, Object obj2, Object obj3, boolean z10, int i10) {
        this.f12100a = i10;
        this.d = obj;
        this.f12101b = obj2;
        this.f12102c = obj3;
    }

    public k(String str) {
        this.f12100a = 10;
        k kVar = new k(9, false);
        this.f12102c = kVar;
        this.d = kVar;
        this.f12101b = str;
    }

    public k(Context context) {
        this.f12100a = 13;
        this.f12101b = context;
    }

    public k(String str, Boolean bool, oc.a aVar, String str2) {
        this.f12100a = 12;
        this.f12101b = str;
        this.f12102c = str2;
        this.d = aVar;
    }

    public k(View view) {
        this.f12100a = 22;
        this.d = view;
        i61 i61Var = new i61(this, view);
        this.f12101b = i61Var;
        view.addOnLayoutChangeListener(i61Var);
    }

    public k(File file) {
        this.f12100a = 29;
        this.f12101b = file;
        this.f12102c = new File(file.getPath() + ".new");
        this.d = new File(file.getPath() + ".bak");
    }

    public k(Context context, TypedArray typedArray) {
        this.f12100a = 2;
        this.f12101b = context;
        this.f12102c = typedArray;
    }

    public k(byte[] bArr, j9.y yVar) {
        this.f12100a = 4;
        this.f12101b = bArr;
        this.f12102c = null;
        this.d = yVar;
    }

    public k(b2.s0 s0Var, j9.y yVar) {
        this.f12100a = 4;
        this.f12101b = s0Var.f2254k;
        this.f12102c = s0Var.f2257n;
        this.d = yVar;
    }

    public k(m2.t tVar) {
        this.f12100a = 11;
        this.f12100a = 11;
        this.f12101b = tVar;
        this.f12102c = Choreographer.getInstance();
        this.d = new o1.a(this, 0);
    }

    public k(int i10) {
        this.f12100a = i10;
        switch (i10) {
            case 7:
                this.f12101b = new Object();
                return;
            case 14:
                this.d = new HashMap();
                return;
            case 23:
                this.f12101b = new Paint[4];
                this.d = new Matrix();
                return;
            default:
                this.f12101b = new ArrayList();
                this.f12102c = new ArrayList();
                return;
        }
    }

    public k(p4.e eVar, android.support.v4.media.session.a0 a0Var) {
        this.f12100a = 28;
        this.d = eVar;
        this.f12101b = a0Var;
    }

    public k(ArrayDeque arrayDeque, BufferedReader bufferedReader) {
        this.f12100a = 27;
        this.f12102c = arrayDeque;
        this.f12101b = bufferedReader;
    }

    public k(Object[] objArr, Object[] objArr2) {
        this.f12100a = 21;
        int length = objArr.length;
        int[] iArr = new int[length];
        HashMap hashMap = new HashMap();
        for (int i10 = 0; i10 < length; i10++) {
            Object obj = objArr[i10];
            Integer num = (Integer) hashMap.get(obj);
            if (num == null) {
                num = Integer.valueOf(hashMap.size());
                hashMap.put(obj, num);
            }
            iArr[i10] = num.intValue();
        }
        this.f12101b = iArr;
        this.f12102c = m(objArr, iArr);
        this.d = m(objArr2, iArr);
    }

    @Override
    public void c() {
    }

    @Override
    public void d() {
    }

    @Override
    public void t() {
    }

    @Override
    public void y() {
    }

    @Override
    public void B(Editable editable) {
    }

    @Override
    public void r(Canvas canvas, RectF rectF, float f7, float f10, float f11, int i10, boolean z10) {
    }
}
