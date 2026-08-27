package b6;

import a0.f;
import a9.p;
import ag.t2;
import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Bitmap;
import android.graphics.LinearGradient;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.os.Bundle;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.Xml;
import android.view.animation.Interpolator;
import c2.t0;
import com.google.android.exoplayer2.extractor.FlacStreamMetadata;
import com.google.android.gms.common.api.internal.q1;
import com.google.firebase.messaging.m;
import com.google.firebase.messaging.t;
import d5.f0;
import d5.g0;
import d5.z;
import f2.r;
import g7.e8;
import g7.f8;
import g7.g9;
import g7.j;
import g7.k;
import g7.m6;
import gf.d0;
import gf.h;
import h0.b;
import h0.c;
import h7.z7;
import hh.l3;
import i7.i0;
import i7.j0;
import i7.n9;
import i7.na;
import i7.u7;
import j$.util.DesugarCollections;
import j$.util.Objects;
import j4.w0;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.zip.Deflater;
import k7.ib;
import k7.we;
import k7.x;
import k7.y;
import k7.zf;
import m.t3;
import m3.d;
import m3.e;
import m3.l;
import m3.n;
import m5.o;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.zk0;
import org.xmlpull.v1.XmlPullParserException;
import p8.a0;
import p8.c0;
import p8.q0;
import p8.w;

public final class a implements e {

    public final int f2032a;

    public Object f2033b;

    public int f2034c;
    public Object d;

    public a(char c10, int i10) {
        this.f2032a = i10;
    }

    public static a d(Resources resources, int i10, Resources.Theme theme) throws XmlPullParserException, IOException {
        int next;
        float f10;
        float f11;
        Shader.TileMode tileMode;
        Shader radialGradient;
        Shader.TileMode tileMode2;
        XmlResourceParser xml = resources.getXml(i10);
        AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
        do {
            next = xml.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next != 2) {
            throw new XmlPullParserException("No start tag found");
        }
        String name = xml.getName();
        name.getClass();
        if (!name.equals("gradient")) {
            if (name.equals("selector")) {
                ColorStateList colorStateListB = c.b(resources, xml, attributeSetAsAttributeSet, theme);
                return new a((Shader) null, colorStateListB, colorStateListB.getDefaultColor());
            }
            throw new XmlPullParserException(xml.getPositionDescription() + ": unsupported complex color tag " + name);
        }
        String name2 = xml.getName();
        if (!name2.equals("gradient")) {
            throw new XmlPullParserException(xml.getPositionDescription() + ": invalid gradient color tag " + name2);
        }
        TypedArray typedArrayF = b.f(resources, theme, attributeSetAsAttributeSet, d0.a.d);
        float f12 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "startX") != null ? typedArrayF.getFloat(8, 0.0f) : 0.0f;
        float f13 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "startY") != null ? typedArrayF.getFloat(9, 0.0f) : 0.0f;
        float f14 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "endX") != null ? typedArrayF.getFloat(10, 0.0f) : 0.0f;
        float f15 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "endY") != null ? typedArrayF.getFloat(11, 0.0f) : 0.0f;
        float f16 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "centerX") != null ? typedArrayF.getFloat(3, 0.0f) : 0.0f;
        float f17 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "centerY") != null ? typedArrayF.getFloat(4, 0.0f) : 0.0f;
        int i11 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "type") != null ? typedArrayF.getInt(2, 0) : 0;
        int color = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "startColor") != null ? typedArrayF.getColor(0, 0) : 0;
        boolean z10 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "centerColor") != null;
        int color2 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "centerColor") != null ? typedArrayF.getColor(7, 0) : 0;
        int color3 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "endColor") != null ? typedArrayF.getColor(1, 0) : 0;
        int i12 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "tileMode") != null ? typedArrayF.getInt(6, 0) : 0;
        float f18 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "gradientRadius") != null ? typedArrayF.getFloat(5, 0.0f) : 0.0f;
        typedArrayF.recycle();
        int depth = xml.getDepth() + 1;
        ArrayList arrayList = new ArrayList(20);
        float f19 = f18;
        ArrayList arrayList2 = new ArrayList(20);
        while (true) {
            int next2 = xml.next();
            f10 = f14;
            if (next2 == 1) {
                f11 = f15;
                break;
            }
            int depth2 = xml.getDepth();
            f11 = f15;
            if (depth2 < depth && next2 == 3) {
                break;
            }
            if (next2 == 2 && depth2 <= depth && xml.getName().equals("item")) {
                TypedArray typedArrayF2 = b.f(resources, theme, attributeSetAsAttributeSet, d0.a.f4679e);
                boolean zHasValue = typedArrayF2.hasValue(0);
                boolean zHasValue2 = typedArrayF2.hasValue(1);
                if (!zHasValue || !zHasValue2) {
                    throw new XmlPullParserException(xml.getPositionDescription() + ": <item> tag requires a 'color' attribute and a 'offset' attribute!");
                }
                int color4 = typedArrayF2.getColor(0, 0);
                float f20 = typedArrayF2.getFloat(1, 0.0f);
                typedArrayF2.recycle();
                arrayList2.add(Integer.valueOf(color4));
                arrayList.add(Float.valueOf(f20));
            }
            f14 = f10;
            f15 = f11;
        }
        g5.b bVar = arrayList2.size() > 0 ? new g5.b(arrayList2, arrayList) : null;
        if (bVar == null) {
            bVar = z10 ? new g5.b(color, color2, color3) : new g5.b(color, color3);
        }
        if (i11 != 1) {
            if (i11 != 2) {
                int[] iArr = (int[]) bVar.f6389b;
                float[] fArr = (float[]) bVar.f6390c;
                if (i12 != 1) {
                    tileMode2 = i12 != 2 ? Shader.TileMode.CLAMP : Shader.TileMode.MIRROR;
                } else {
                    tileMode2 = Shader.TileMode.REPEAT;
                }
                radialGradient = new LinearGradient(f12, f13, f10, f11, iArr, fArr, tileMode2);
            } else {
                radialGradient = new SweepGradient(f16, f17, (int[]) bVar.f6389b, (float[]) bVar.f6390c);
            }
        } else {
            if (f19 <= 0.0f) {
                throw new XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
            }
            int[] iArr2 = (int[]) bVar.f6389b;
            float[] fArr2 = (float[]) bVar.f6390c;
            if (i12 != 1) {
                tileMode = i12 != 2 ? Shader.TileMode.CLAMP : Shader.TileMode.MIRROR;
            } else {
                tileMode = Shader.TileMode.REPEAT;
            }
            radialGradient = new RadialGradient(f16, f17, f19, iArr2, fArr2, tileMode);
        }
        return new a(radialGradient, (ColorStateList) null, 0);
    }

    @Override
    public d P1(l lVar, long j10) {
        long j11;
        switch (this.f2032a) {
            case 20:
                long position = lVar.getPosition();
                long jF = f(lVar);
                long jI = lVar.i();
                lVar.j(Math.max(6, ((FlacStreamMetadata) this.f2033b).minFrameSize));
                long jF2 = f(lVar);
                long jI2 = lVar.i();
                if (jF > j10 || jF2 <= j10) {
                    return jF2 <= j10 ? new d(-2, jF2, jI2) : new d(-1, jF, position);
                }
                return new d(0, -9223372036854775807L, jI);
            default:
                long position2 = lVar.getPosition();
                int iMin = (int) Math.min(112800, lVar.getLength() - position2);
                z zVar = (z) this.d;
                zVar.z(iMin);
                lVar.b(0, iMin, zVar.f4858a);
                int i10 = zVar.f4860c;
                long j12 = -1;
                long j13 = -1;
                long j14 = -9223372036854775807L;
                while (true) {
                    if (zVar.a() >= 188) {
                        byte[] bArr = zVar.f4858a;
                        int i11 = zVar.f4859b;
                        while (true) {
                            if (i11 < i10) {
                                j11 = -9223372036854775807L;
                                if (bArr[i11] != 71) {
                                    i11++;
                                }
                            } else {
                                j11 = -9223372036854775807L;
                            }
                        }
                        int i12 = i11 + 188;
                        if (i12 <= i10) {
                            long jA = z7.a(zVar, i11, this.f2034c);
                            if (jA != j11) {
                                long jB = ((f0) this.f2033b).b(jA);
                                if (jB > j10) {
                                    return j14 == j11 ? new d(-1, jB, position2) : new d(0, -9223372036854775807L, position2 + j13);
                                }
                                j14 = jB;
                                if (100000 + j14 > j10) {
                                    return new d(0, -9223372036854775807L, position2 + ((long) i11));
                                }
                                j13 = i11;
                            }
                            zVar.C(i12);
                            j12 = i12;
                        }
                    } else {
                        j11 = -9223372036854775807L;
                    }
                }
                return j14 != j11 ? new d(-2, j14, position2 + j12) : d.d;
        }
    }

    public void a(int i10, int i11) {
        int i12 = (i11 << 16) + i10;
        boolean z10 = this.f2034c != i12;
        this.f2034c = i12;
        for (int i13 = 0; i13 < h.f6978y; i13++) {
            if (z10 || ((Bitmap[]) this.d)[i13] == null) {
                Bitmap bitmap = ((Bitmap[]) this.d)[i13];
                if (bitmap != null) {
                    Utilities.globalQueue.postRunnable(new r(bitmap, 2));
                }
                ((Bitmap[]) this.d)[i13] = Bitmap.createBitmap(i11, i10, Bitmap.Config.ARGB_8888);
            }
            d0[] d0VarArr = (d0[]) this.f2033b;
            if (d0VarArr[i13] == null) {
                d0VarArr[i13] = new d0(i11 * i10 * 2);
            }
        }
    }

    public ba.b b() {
        if ("".isEmpty()) {
            return new ba.b((String) this.f2033b, ((Long) this.d).longValue(), this.f2034c);
        }
        throw new IllegalStateException("Missing required properties:".concat(""));
    }

    public q0 c() {
        char c10;
        char c11;
        char c12;
        ?? r10;
        short[] sArr;
        boolean z10;
        ?? r11;
        q0 q0Var;
        a0 a0Var = (a0) this.d;
        if (a0Var != null) {
            throw a0Var.a();
        }
        int i10 = this.f2034c;
        Object[] objArrCopyOf = (Object[]) this.f2033b;
        if (i10 == 0) {
            q0Var = q0.h;
        } else {
            int i11 = 1;
            a0 a0Var2 = null;
            ?? r12 = 0;
            a0 a0Var3 = null;
            a0 a0Var4 = null;
            if (i10 == 1) {
                Objects.requireNonNull(objArrCopyOf[0]);
                Objects.requireNonNull(objArrCopyOf[1]);
                q0Var = new q0(null, objArrCopyOf, 1);
            } else {
                h7.f0.c(i10, objArrCopyOf.length >> 1);
                int iS = c0.s(i10);
                if (i10 == 1) {
                    Objects.requireNonNull(objArrCopyOf[0]);
                    Objects.requireNonNull(objArrCopyOf[1]);
                    c10 = 1;
                    c11 = 0;
                } else {
                    int i12 = iS - 1;
                    if (iS <= 128) {
                        byte[] bArr = new byte[iS];
                        Arrays.fill(bArr, (byte) -1);
                        int i13 = 0;
                        int i14 = 0;
                        while (i13 < i10) {
                            int i15 = i13 * 2;
                            int i16 = i14 * 2;
                            Object obj = objArrCopyOf[i15];
                            Objects.requireNonNull(obj);
                            Object obj2 = objArrCopyOf[i15 ^ i11];
                            Objects.requireNonNull(obj2);
                            int iO = p8.l.o(obj.hashCode());
                            while (true) {
                                int i17 = iO & i12;
                                int i18 = bArr[i17] & 255;
                                if (i18 == 255) {
                                    bArr[i17] = (byte) i16;
                                    if (i14 < i13) {
                                        objArrCopyOf[i16] = obj;
                                        objArrCopyOf[i16 ^ 1] = obj2;
                                    }
                                    i14++;
                                    break;
                                }
                                if (obj.equals(objArrCopyOf[i18 == true ? 1 : 0])) {
                                    int i19 = ~i18;
                                    Object obj3 = objArrCopyOf[i19 == true ? 1 : 0];
                                    Objects.requireNonNull(obj3);
                                    a0Var3 = new a0(obj, obj2, obj3);
                                    objArrCopyOf[i19 == true ? 1 : 0] = obj2;
                                    break;
                                }
                                iO = i17 + 1;
                            }
                            i13++;
                            i11 = 1;
                        }
                        c10 = 1;
                        c11 = 0;
                        if (i14 == i10) {
                            r12 = bArr;
                        } else {
                            sArr = new Object[]{bArr, Integer.valueOf(i14), a0Var3};
                        }
                    } else {
                        c10 = 1;
                        c11 = 0;
                        if (iS <= 32768) {
                            sArr = new short[iS];
                            Arrays.fill(sArr, (short) -1);
                            int i20 = 0;
                            for (int i21 = 0; i21 < i10; i21++) {
                                int i22 = i21 * 2;
                                int i23 = i20 * 2;
                                Object obj4 = objArrCopyOf[i22];
                                Objects.requireNonNull(obj4);
                                Object obj5 = objArrCopyOf[i22 ^ 1];
                                Objects.requireNonNull(obj5);
                                int iO2 = p8.l.o(obj4.hashCode());
                                while (true) {
                                    int i24 = iO2 & i12;
                                    int i25 = sArr[i24] & 65535;
                                    if (i25 == 65535) {
                                        sArr[i24] = (short) i23;
                                        if (i20 < i21) {
                                            objArrCopyOf[i23] = obj4;
                                            objArrCopyOf[i23 ^ 1] = obj5;
                                        }
                                        i20++;
                                        break;
                                    }
                                    if (obj4.equals(objArrCopyOf[i25 == true ? 1 : 0])) {
                                        int i26 = ~i25;
                                        Object obj6 = objArrCopyOf[i26 == true ? 1 : 0];
                                        Objects.requireNonNull(obj6);
                                        a0Var4 = new a0(obj4, obj5, obj6);
                                        objArrCopyOf[i26 == true ? 1 : 0] = obj5;
                                        break;
                                    }
                                    iO2 = i24 + 1;
                                }
                            }
                            r12 = i20 == i10 ? sArr : new Object[]{sArr, Integer.valueOf(i20), a0Var4};
                        } else {
                            int[] iArr = new int[iS];
                            Arrays.fill(iArr, -1);
                            int i27 = 0;
                            for (int i28 = 0; i28 < i10; i28++) {
                                int i29 = i28 * 2;
                                int i30 = i27 * 2;
                                Object obj7 = objArrCopyOf[i29];
                                Objects.requireNonNull(obj7);
                                Object obj8 = objArrCopyOf[i29 ^ 1];
                                Objects.requireNonNull(obj8);
                                int iO3 = p8.l.o(obj7.hashCode());
                                while (true) {
                                    int i31 = iO3 & i12;
                                    int i32 = iArr[i31];
                                    if (i32 == -1) {
                                        iArr[i31] = i30;
                                        if (i27 < i28) {
                                            objArrCopyOf[i30] = obj7;
                                            objArrCopyOf[i30 ^ 1] = obj8;
                                        }
                                        i27++;
                                        break;
                                    }
                                    if (obj7.equals(objArrCopyOf[i32])) {
                                        int i33 = i32 ^ 1;
                                        Object obj9 = objArrCopyOf[i33];
                                        Objects.requireNonNull(obj9);
                                        a0Var2 = new a0(obj7, obj8, obj9);
                                        objArrCopyOf[i33] = obj8;
                                        break;
                                    }
                                    iO3 = i31 + 1;
                                }
                            }
                            c12 = 2;
                            r10 = i27 == i10 ? iArr : new Object[]{iArr, Integer.valueOf(i27), a0Var2};
                        }
                    }
                    z10 = r10 instanceof Object[];
                    r11 = r10;
                    if (z10) {
                        Object[] objArr = (Object[]) r10;
                        this.d = (a0) objArr[c12];
                        Object obj10 = objArr[c11];
                        int iIntValue = ((Integer) objArr[c10]).intValue();
                        objArrCopyOf = Arrays.copyOf(objArrCopyOf, iIntValue * 2);
                        r11 = obj10;
                        i10 = iIntValue;
                    }
                    q0Var = new q0(r11, objArrCopyOf, i10);
                }
                c12 = 2;
                r10 = r12;
                z10 = r10 instanceof Object[];
                r11 = r10;
                if (z10) {
                    Object[] objArr2 = (Object[]) r10;
                    this.d = (a0) objArr2[c12];
                    Object obj11 = objArr2[c11];
                    int iIntValue2 = ((Integer) objArr2[c10]).intValue();
                    objArrCopyOf = Arrays.copyOf(objArrCopyOf, iIntValue2 * 2);
                    r11 = obj11;
                    i10 = iIntValue2;
                }
                q0Var = new q0(r11, objArrCopyOf, i10);
            }
        }
        a0 a0Var5 = (a0) this.d;
        if (a0Var5 == null) {
            return q0Var;
        }
        throw a0Var5.a();
    }

    public void e(String str, Object... objArr) {
        if (this.f2034c <= 3) {
            String str2 = (String) this.f2033b;
            if (objArr.length > 0) {
                str = String.format(Locale.US, str, objArr);
            }
            Log.d(str2, ((String) this.d).concat(str));
        }
    }

    public long f(l lVar) {
        int iE;
        n nVar = (n) this.d;
        FlacStreamMetadata flacStreamMetadata = (FlacStreamMetadata) this.f2033b;
        while (lVar.i() < lVar.getLength() - 6) {
            int i10 = this.f2034c;
            long jI = lVar.i();
            byte[] bArr = new byte[2];
            int i11 = 0;
            boolean zA = false;
            lVar.b(0, 2, bArr);
            if ((((bArr[0] & 255) << 8) | (bArr[1] & 255)) != i10) {
                lVar.q();
                lVar.j((int) (jI - lVar.getPosition()));
            } else {
                z zVar = new z(16);
                System.arraycopy(bArr, 0, zVar.f4858a, 0, 2);
                byte[] bArr2 = zVar.f4858a;
                while (i11 < 14 && (iE = lVar.e(2 + i11, 14 - i11, bArr2)) != -1) {
                    i11 += iE;
                }
                zVar.B(i11);
                lVar.q();
                lVar.j((int) (jI - lVar.getPosition()));
                zA = h7.r.a(zVar, flacStreamMetadata, i10, nVar);
            }
            if (zA) {
                break;
            }
            lVar.j(1);
        }
        if (lVar.i() < lVar.getLength() - 6) {
            return nVar.f17620a;
        }
        lVar.j((int) (lVar.getLength() - lVar.i()));
        return flacStreamMetadata.totalSamples;
    }

    @Override
    public void f2() {
        switch (this.f2032a) {
            case 20:
                break;
            default:
                z zVar = (z) this.d;
                byte[] bArr = g0.f4799f;
                zVar.getClass();
                zVar.A(bArr.length, bArr);
                break;
        }
    }

    public Object g(int i10) {
        SparseArray sparseArray = (SparseArray) this.f2033b;
        if (this.f2034c == -1) {
            this.f2034c = 0;
        }
        while (true) {
            int i11 = this.f2034c;
            if (i11 <= 0 || i10 >= sparseArray.keyAt(i11)) {
                break;
            }
            this.f2034c--;
        }
        while (this.f2034c < sparseArray.size() - 1 && i10 >= sparseArray.keyAt(this.f2034c + 1)) {
            this.f2034c++;
        }
        return sparseArray.valueAt(this.f2034c);
    }

    public boolean h() {
        ColorStateList colorStateList;
        return ((Shader) this.f2033b) == null && (colorStateList = (ColorStateList) this.d) != null && colorStateList.isStateful();
    }

    public void j(Object obj, Object obj2) {
        int i10 = (this.f2034c + 1) * 2;
        Object[] objArr = (Object[]) this.f2033b;
        if (i10 > objArr.length) {
            this.f2033b = Arrays.copyOf(objArr, w.d(objArr.length, i10));
        }
        if (obj == null) {
            String strValueOf = String.valueOf(obj2);
            StringBuilder sb2 = new StringBuilder(strValueOf.length() + 24);
            sb2.append("null key in entry: null=");
            sb2.append(strValueOf);
            throw new NullPointerException(sb2.toString());
        }
        if (obj2 == null) {
            String strValueOf2 = String.valueOf(obj);
            StringBuilder sb3 = new StringBuilder(strValueOf2.length() + 26);
            sb3.append("null value in entry: ");
            sb3.append(strValueOf2);
            sb3.append("=null");
            throw new NullPointerException(sb3.toString());
        }
        Object[] objArr2 = (Object[]) this.f2033b;
        int i11 = this.f2034c;
        int i12 = i11 * 2;
        objArr2[i12] = obj;
        objArr2[i12 + 1] = obj2;
        this.f2034c = i11 + 1;
    }

    public void k(int i10) {
        l(i10, 200L, er.f28122f);
    }

    public void l(int i10, long j10, Interpolator interpolator) {
        ValueAnimator valueAnimator = (ValueAnimator) this.f2033b;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            ((ValueAnimator) this.f2033b).cancel();
        }
        int[] iArr = new int[1];
        this.f2034c = 0;
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, i10);
        this.f2033b = valueAnimatorOfInt;
        valueAnimatorOfInt.addUpdateListener(new t2(21, this, iArr));
        ((ValueAnimator) this.f2033b).addListener(new l3(this, i10, iArr, 2));
        ((ValueAnimator) this.f2033b).setDuration(j10);
        ((ValueAnimator) this.f2033b).setInterpolator(interpolator);
        ((ValueAnimator) this.f2033b).start();
    }

    public List m(CharSequence charSequence) {
        charSequence.getClass();
        o oVar = (o) this.d;
        oVar.getClass();
        o8.h hVar = new o8.h(oVar, this, charSequence);
        ArrayList arrayList = new ArrayList();
        while (hVar.hasNext()) {
            arrayList.add((String) hVar.next());
        }
        return DesugarCollections.unmodifiableList(arrayList);
    }

    public void n(String str, v5.c cVar) {
        int i10 = this.f2034c + 1;
        Object[] objArr = (Object[]) this.f2033b;
        int length = objArr.length;
        int i11 = i10 + i10;
        if (i11 > length) {
            if (i11 < 0) {
                throw new AssertionError("cannot store more than MAX_VALUE elements");
            }
            int i12 = length + (length >> 1) + 1;
            if (i12 < i11) {
                int iHighestOneBit = Integer.highestOneBit(i11 - 1);
                i12 = iHighestOneBit + iHighestOneBit;
            }
            if (i12 < 0) {
                i12 = Integer.MAX_VALUE;
            }
            this.f2033b = Arrays.copyOf(objArr, i12);
        }
        Object[] objArr2 = (Object[]) this.f2033b;
        int i13 = this.f2034c;
        int i14 = i13 + i13;
        objArr2[i14] = str;
        objArr2[i14 + 1] = cVar;
        this.f2034c = i13 + 1;
    }

    public void o(String str, com.google.android.gms.common.api.internal.l lVar) {
        Map map = (Map) this.f2033b;
        if (map.containsKey(str)) {
            throw new IllegalArgumentException(p.m("LifecycleCallback with tag ", str, " already added to this fragment."));
        }
        map.put(str, lVar);
        if (this.f2034c > 0) {
            new t0(Looper.getMainLooper(), 6).post(new q1(this, lVar, str, 0));
        }
    }

    public byte[] p() {
        switch (this.f2032a) {
            case 7:
                g9 g9Var = g9.f6488c;
                t tVar = (t) this.f2033b;
                ((e8) this.d).h = false;
                e8 e8Var = (e8) this.d;
                e8Var.f6459f = Boolean.FALSE;
                tVar.f4619b = new f8(e8Var);
                try {
                    g9.b();
                    m6 m6Var = new m6(tVar);
                    a5.n nVar = new a5.n(13);
                    g9Var.a(nVar);
                    HashMap map = new HashMap((HashMap) nVar.f100b);
                    HashMap map2 = new HashMap((HashMap) nVar.f101c);
                    j jVar = (j) nVar.d;
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
                        k kVar = new k(byteArrayOutputStream, map, map2, jVar);
                        r9.d dVar = (r9.d) map.get(m6.class);
                        if (dVar == null) {
                            throw new r9.b("No encoder for ".concat(String.valueOf(m6.class)));
                        }
                        dVar.a(m6Var, kVar);
                        return byteArrayOutputStream.toByteArray();
                    } catch (IOException unused) {
                    }
                } catch (UnsupportedEncodingException e9) {
                    throw new UnsupportedOperationException("Failed to covert logging to UTF-8 byte array", e9);
                }
                break;
            case 11:
                na naVar = na.f10763c;
                m mVar = (m) this.f2033b;
                ((e8) this.d).h = false;
                e8 e8Var2 = (e8) this.d;
                e8Var2.f6459f = Boolean.FALSE;
                mVar.f4602a = new n9(e8Var2);
                try {
                    na.b();
                    u7 u7Var = new u7(mVar);
                    a5.n nVar2 = new a5.n(21);
                    naVar.a(nVar2);
                    HashMap map3 = new HashMap((HashMap) nVar2.f100b);
                    HashMap map4 = new HashMap((HashMap) nVar2.f101c);
                    i0 i0Var = (i0) nVar2.d;
                    ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                    try {
                        j0 j0Var = new j0(byteArrayOutputStream2, map3, map4, i0Var);
                        r9.d dVar2 = (r9.d) map3.get(u7.class);
                        if (dVar2 == null) {
                            throw new r9.b("No encoder for ".concat(String.valueOf(u7.class)));
                        }
                        dVar2.a(u7Var, j0Var);
                        return byteArrayOutputStream2.toByteArray();
                    } catch (IOException unused2) {
                    }
                } catch (UnsupportedEncodingException e10) {
                    throw new UnsupportedOperationException("Failed to covert logging to UTF-8 byte array", e10);
                }
                break;
            default:
                zf zfVar = zf.f15087c;
                t3 t3Var = (t3) this.f2033b;
                ((e8) this.d).h = false;
                e8 e8Var3 = (e8) this.d;
                e8Var3.f6459f = Boolean.FALSE;
                t3Var.f17473a = new we(e8Var3);
                try {
                    zf.b();
                    ib ibVar = new ib(t3Var);
                    j9.a aVar = new j9.a(2);
                    zfVar.a(aVar);
                    HashMap map5 = new HashMap((HashMap) aVar.f12864c);
                    HashMap map6 = new HashMap((HashMap) aVar.d);
                    x xVar = (x) aVar.f12863b;
                    ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
                    try {
                        y yVar = new y(byteArrayOutputStream3, map5, map6, xVar);
                        r9.d dVar3 = (r9.d) map5.get(ib.class);
                        if (dVar3 == null) {
                            throw new r9.b("No encoder for ".concat(String.valueOf(ib.class)));
                        }
                        dVar3.a(ibVar, yVar);
                        return byteArrayOutputStream3.toByteArray();
                    } catch (IOException unused3) {
                    }
                } catch (UnsupportedEncodingException e11) {
                    throw new UnsupportedOperationException("Failed to covert logging to UTF-8 byte array", e11);
                }
                break;
        }
    }

    public void q(Bundle bundle) {
        this.f2034c = 1;
        this.d = bundle;
        for (Map.Entry entry : ((Map) this.f2033b).entrySet()) {
            ((com.google.android.gms.common.api.internal.l) entry.getValue()).onCreate(bundle != null ? bundle.getBundle((String) entry.getKey()) : null);
        }
    }

    public void r(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        for (Map.Entry entry : ((Map) this.f2033b).entrySet()) {
            Bundle bundle2 = new Bundle();
            ((com.google.android.gms.common.api.internal.l) entry.getValue()).onSaveInstanceState(bundle2);
            bundle.putBundle((String) entry.getKey(), bundle2);
        }
    }

    public a(int i10, int i11) {
        this.f2032a = i11;
        switch (i11) {
            case 21:
                this.f2033b = new Object[i10 * 2];
                this.f2034c = 0;
                break;
            default:
                this.f2034c = i10;
                break;
        }
    }

    public a(Object obj, int i10, Object obj2, int i11) {
        this.f2032a = i11;
        this.d = obj;
        this.f2034c = i10;
        this.f2033b = obj2;
    }

    public a(int i10, byte b10) {
        this.f2032a = i10;
        switch (i10) {
            case 5:
                this.f2033b = new Object[8];
                this.f2034c = 0;
                break;
            case 8:
                int i11 = h.f6978y;
                this.f2033b = new d0[i11];
                this.d = new Bitmap[i11];
                break;
            case 17:
                this.f2033b = new pg.a();
                break;
            default:
                this.f2033b = DesugarCollections.synchronizedMap(new f(0));
                this.f2034c = 0;
                break;
        }
    }

    public a(m mVar, int i10) {
        this.f2032a = 11;
        this.d = new e8();
        this.f2033b = mVar;
        na.b();
        this.f2034c = i10;
    }

    public a(t tVar, int i10) {
        this.f2032a = 7;
        this.d = new e8();
        this.f2033b = tVar;
        g9.b();
        this.f2034c = i10;
    }

    public a(String str, String[] strArr) {
        String string;
        this.f2032a = 0;
        if (strArr.length == 0) {
            string = "";
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append('[');
            for (String str2 : strArr) {
                if (sb2.length() > 1) {
                    sb2.append(",");
                }
                sb2.append(str2);
            }
            sb2.append("] ");
            string = sb2.toString();
        }
        this.d = string;
        this.f2033b = str;
        int i10 = 2;
        y5.l.c(str.length() <= 23, "tag \"%s\" is longer than the %d character maximum", str, 23);
        while (i10 <= 7 && !Log.isLoggable((String) this.f2033b, i10)) {
            i10++;
        }
        this.f2034c = i10;
    }

    private final void i() {
    }

    public a(t3 t3Var, int i10) {
        this.f2032a = 13;
        this.d = new e8();
        this.f2033b = t3Var;
        zf.b();
        this.f2034c = i10;
    }

    public a(zk0 zk0Var) {
        this.f2032a = 19;
        this.d = zk0Var;
    }

    public a(ByteBuffer byteBuffer, int i10, RectF rectF) {
        this.f2032a = 23;
        this.f2033b = rectF;
        this.f2034c = i10;
        try {
            this.d = File.createTempFile("paint", ".bin", ApplicationLoader.applicationContext.getCacheDir());
        } catch (Exception e9) {
            FileLog.e(e9);
        }
        if (((File) this.d) == null) {
            return;
        }
        try {
            byte[] bArrArray = byteBuffer.array();
            FileOutputStream fileOutputStream = new FileOutputStream((File) this.d);
            Deflater deflater = new Deflater(1, true);
            deflater.setInput(bArrArray, byteBuffer.arrayOffset(), byteBuffer.remaining());
            deflater.finish();
            byte[] bArr = new byte[1024];
            while (!deflater.finished()) {
                fileOutputStream.write(bArr, 0, deflater.deflate(bArr));
            }
            deflater.end();
            fileOutputStream.close();
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    public a(w0 w0Var) {
        this.f2032a = 12;
        this.f2033b = new SparseArray();
        this.d = w0Var;
        this.f2034c = -1;
    }

    public a(Shader shader, ColorStateList colorStateList, int i10) {
        this.f2032a = 9;
        this.f2033b = shader;
        this.d = colorStateList;
        this.f2034c = i10;
    }

    public a(FlacStreamMetadata flacStreamMetadata, int i10) {
        this.f2032a = 20;
        this.f2033b = flacStreamMetadata;
        this.f2034c = i10;
        this.d = new n();
    }

    public a(int i10, f0 f0Var) {
        this.f2032a = 22;
        this.f2034c = i10;
        this.f2033b = f0Var;
        this.d = new z();
    }

    public a(o oVar) {
        this.f2032a = 16;
        this.d = oVar;
        this.f2033b = o8.c.f19360a;
        this.f2034c = Integer.MAX_VALUE;
    }
}
