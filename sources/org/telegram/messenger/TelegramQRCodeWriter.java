package org.telegram.messenger;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.GradientDrawable;
import java.nio.charset.Charset;
import java.nio.charset.UnsupportedCharsetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;

public final class TelegramQRCodeWriter {
    private static final int QUIET_ZONE_SIZE = 4;
    private int imageBlockX;
    private int imageBloks;
    private int imageSize;
    private sb.b input;
    private int sideQuadSize;
    private float[] radii = new float[8];
    public boolean includeSideQuads = true;

    public static void drawSideQuads(Canvas canvas, float f10, float f11, Paint paint, float f12, float f13, int i10, float f14, float f15, float[] fArr, boolean z10) {
        float f16;
        float f17;
        Path path = new Path();
        for (int i11 = 0; i11 < 3; i11++) {
            if (i11 == 0) {
                f16 = i10;
                f17 = f16;
            } else if (i11 == 1) {
                f17 = i10;
                f16 = (f14 - (f12 * f13)) - f17;
            } else {
                f16 = i10;
                f17 = (f14 - (f12 * f13)) - f16;
            }
            float f18 = f16 + f10;
            float f19 = f17 + f11;
            if (z10) {
                RectF rectF = AndroidUtilities.rectTmp;
                float f20 = (f12 - 1.0f) * f13;
                rectF.set(f18 + f13, f19 + f13, f18 + f20, f20 + f19);
                float f21 = ((f12 * f13) / 4.0f) * f15;
                path.reset();
                path.addRoundRect(rectF, f21, f21, Path.Direction.CW);
                path.close();
                canvas.save();
                canvas.clipPath(path, Region.Op.DIFFERENCE);
            }
            float f22 = f12 * f13;
            float f23 = (f22 / 3.0f) * f15;
            RectF rectF2 = AndroidUtilities.rectTmp;
            rectF2.set(f18, f19, f18 + f22, f22 + f19);
            canvas.drawRoundRect(rectF2, f23, f23, paint);
            if (z10) {
                canvas.restore();
            }
            float f24 = (f12 - 2.0f) * f13;
            float f25 = (f24 / 4.0f) * f15;
            float f26 = 2.0f * f13;
            rectF2.set(f18 + f26, f26 + f19, f18 + f24, f19 + f24);
            canvas.drawRoundRect(rectF2, f25, f25, paint);
        }
    }

    public static void drawSideQuadsGradient(Canvas canvas, Paint paint, GradientDrawable gradientDrawable, float f10, float f11, int i10, float f12, float f13, float[] fArr, int i11, int i12) {
        float f14;
        float f15;
        float f16;
        float f17;
        float f18;
        boolean z10 = Color.alpha(i11) == 0;
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadii(fArr);
        Path path = new Path();
        RectF rectF = new RectF();
        for (int i13 = 0; i13 < 3; i13++) {
            if (i13 == 0) {
                f17 = i10;
                f16 = f17;
            } else {
                if (i13 == 1) {
                    f15 = i10;
                    f14 = (f12 - (f10 * f11)) - f15;
                } else {
                    f14 = i10;
                    f15 = (f12 - (f10 * f11)) - f14;
                }
                f16 = f14;
                f17 = f15;
            }
            if (z10) {
                float f19 = (f10 - 1.0f) * f11;
                f18 = 1.0f;
                rectF.set(f16 + f11, f17 + f11, f16 + f19, f19 + f17);
                float f20 = ((f10 * f11) / 4.0f) * f13;
                path.reset();
                path.addRoundRect(rectF, f20, f20, Path.Direction.CW);
                path.close();
                canvas.save();
                canvas.clipPath(path, Region.Op.DIFFERENCE);
            } else {
                f18 = 1.0f;
            }
            float f21 = f10 * f11;
            Arrays.fill(fArr, (f21 / 3.0f) * f13);
            gradientDrawable.setColor(i12);
            gradientDrawable.setBounds((int) f16, (int) f17, (int) (f16 + f21), (int) (f17 + f21));
            gradientDrawable.draw(canvas);
            float f22 = f17;
            float f23 = f16 + f11;
            float f24 = f22 + f11;
            float f25 = (f10 - f18) * f11;
            float f26 = f16 + f25;
            float f27 = f25 + f22;
            canvas.drawRect(f23, f24, f26, f27, paint);
            if (z10) {
                canvas.restore();
            }
            if (!z10) {
                Arrays.fill(fArr, (f21 / 4.0f) * f13);
                gradientDrawable.setColor(i11);
                gradientDrawable.setBounds((int) f23, (int) f24, (int) f26, (int) f27);
                gradientDrawable.draw(canvas);
            }
            float f28 = (f10 - 2.0f) * f11;
            Arrays.fill(fArr, (f28 / 4.0f) * f13);
            gradientDrawable.setColor(i12);
            float f29 = 2.0f * f11;
            gradientDrawable.setBounds((int) (f16 + f29), (int) (f22 + f29), (int) (f16 + f28), (int) (f22 + f28));
            gradientDrawable.draw(canvas);
        }
    }

    private boolean has(int i10, int i11) {
        int i12 = this.imageBlockX;
        if (i10 >= i12) {
            int i13 = this.imageBloks;
            if (i10 < i12 + i13 && i11 >= i12 && i11 < i12 + i13) {
                return false;
            }
        }
        int i14 = this.sideQuadSize;
        if ((i10 < i14 || i10 >= this.input.f47831b - i14) && i11 < i14) {
            return false;
        }
        if ((i10 >= i14 || i11 < this.input.f47832c - i14) && i10 >= 0 && i11 >= 0) {
            sb.b bVar = this.input;
            if (i10 < bVar.f47831b && i11 < bVar.f47832c && bVar.a(i10, i11) == 1) {
                return true;
            }
        }
        return false;
    }

    public Bitmap encode(String str, int i10, int i11, Map<lb.b, ?> map, Bitmap bitmap) {
        return encode(str, i10, i11, map, bitmap, 1.0f, -1, -16777216);
    }

    public int getImageSize() {
        return this.imageSize;
    }

    public int getSideSize() {
        return this.sideQuadSize;
    }

    public Bitmap encode(String str, int i10, int i11, Map<lb.b, ?> map, Bitmap bitmap, float f10, int i12, int i13) throws com.google.firebase.messaging.s {
        int i14;
        boolean z10;
        boolean z11;
        Charset charsetForName;
        qb.d dVar;
        int i15;
        int iA;
        int i16;
        qb.e eVarC;
        int iA2;
        int i17;
        qb.e eVarC2;
        qb.e eVarC3;
        qb.e eVar;
        mb.a aVar;
        mb.c cVar;
        int i18;
        Paint paint;
        char c10;
        boolean z12;
        boolean z13;
        float f11;
        Canvas canvas;
        Paint paint2;
        byte[][] bArr;
        int i19;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        char c11;
        if (str.isEmpty()) {
            throw new IllegalArgumentException("Found empty contents");
        }
        if (i10 < 0 || i11 < 0) {
            throw new IllegalArgumentException("Requested dimensions are too small: " + i10 + 'x' + i11);
        }
        qb.b bVarValueOf = qb.b.L;
        if (map != null) {
            lb.b bVar = lb.b.f15507a;
            if (map.containsKey(bVar)) {
                bVarValueOf = qb.b.valueOf(map.get(bVar).toString());
            }
            lb.b bVar2 = lb.b.f15509c;
            if (map.containsKey(bVar2)) {
                i14 = Integer.parseInt(map.get(bVar2).toString());
            } else {
                i14 = 4;
            }
        } else {
            i14 = 4;
        }
        Charset charset = sb.c.f47834b;
        if (map != null) {
            lb.b bVar3 = lb.b.h;
            if (map.containsKey(bVar3) && Boolean.parseBoolean(map.get(bVar3).toString())) {
                z10 = true;
            } else {
                z10 = false;
            }
        } else {
            z10 = false;
        }
        if (map != null) {
            lb.b bVar4 = lb.b.f15511f;
            if (map.containsKey(bVar4) && Boolean.parseBoolean(map.get(bVar4).toString())) {
                z11 = true;
            } else {
                z11 = false;
            }
        } else {
            z11 = false;
        }
        lb.b bVar5 = lb.b.f15508b;
        boolean z18 = map != null && map.containsKey(bVar5);
        if (z18) {
            try {
                charsetForName = Charset.forName(map.get(bVar5).toString());
            } catch (UnsupportedCharsetException unused) {
                charsetForName = charset;
            }
        } else {
            charsetForName = charset;
        }
        int i20 = i14;
        if (z11) {
            if (charsetForName.equals(charset)) {
                charsetForName = null;
            }
            com.google.firebase.messaging.l lVar = new com.google.firebase.messaging.l();
            lVar.f4600b = str;
            lVar.f4599a = z10;
            lVar.f4601c = new mb.e(str, charsetForName);
            lVar.d = bVarValueOf;
            qb.b bVar6 = (qb.b) lVar.d;
            qb.e[] eVarArr = {com.google.firebase.messaging.l.j(1), com.google.firebase.messaging.l.j(2), com.google.firebase.messaging.l.j(3)};
            j9.a[] aVarArr = {lVar.h(eVarArr[0]), lVar.h(eVarArr[1]), lVar.h(eVarArr[2])};
            int i21 = 0;
            int i22 = -1;
            int i23 = Integer.MAX_VALUE;
            for (int i24 = 3; i21 < i24; i24 = 3) {
                j9.a aVar2 = aVarArr[i21];
                int iC = aVar2.C((qb.e) aVar2.f12864c);
                if (sb.c.c(iC, eVarArr[i21], bVar6) && iC < i23) {
                    i23 = iC;
                    i22 = i21;
                }
                i21++;
            }
            if (i22 < 0) {
                throw new com.google.firebase.messaging.s("Data too big for any version");
            }
            j9.a aVar3 = aVarArr[i22];
            aVar = new mb.a();
            ArrayList arrayList = (ArrayList) aVar3.f12863b;
            int size = arrayList.size();
            int i25 = 0;
            while (i25 < size) {
                Object obj = arrayList.get(i25);
                int i26 = i25 + 1;
                sb.f fVar = (sb.f) obj;
                int i27 = fVar.f47845c;
                j9.a aVar4 = fVar.f47846e;
                com.google.firebase.messaging.l lVar2 = (com.google.firebase.messaging.l) aVar4.d;
                ArrayList arrayList2 = arrayList;
                qb.d dVar2 = fVar.f47843a;
                int i28 = size;
                aVar.b(dVar2.f46195b, 4);
                int i29 = fVar.d;
                if (i29 > 0) {
                    aVar.b(fVar.a(), dVar2.a((qb.e) aVar4.f12864c));
                }
                if (dVar2 == qb.d.ECI) {
                    aVar.b(((mb.c) mb.c.d.get(((mb.e) lVar2.f4601c).f17933a[i27].charset().name())).f17924a[0], 8);
                } else if (i29 > 0) {
                    String str2 = (String) lVar2.f4600b;
                    int i30 = fVar.f47844b;
                    sb.c.a(str2.substring(i30, i29 + i30), dVar2, aVar, ((mb.e) lVar2.f4601c).f17933a[i27].charset());
                }
                arrayList = arrayList2;
                size = i28;
                i25 = i26;
            }
            eVar = (qb.e) aVar3.f12864c;
        } else {
            Charset charset2 = mb.h.f17946b;
            qb.d dVar3 = qb.d.BYTE;
            if (charset2 == null || !charset2.equals(charsetForName) || !sb.c.b(str)) {
                boolean z19 = false;
                boolean z20 = false;
                int i31 = 0;
                while (true) {
                    if (i31 < str.length()) {
                        char cCharAt = str.charAt(i31);
                        if (cCharAt >= '0' && cCharAt <= '9') {
                            z20 = true;
                        } else if ((cCharAt < '`' ? sb.c.f47833a[cCharAt] : -1) != -1) {
                            z19 = true;
                        }
                        i31++;
                    } else {
                        if (z19) {
                            dVar = qb.d.ALPHANUMERIC;
                            break;
                        }
                        if (z20) {
                            dVar = qb.d.NUMERIC;
                            break;
                        }
                    }
                    dVar = dVar3;
                    break;
                }
            }
            dVar = qb.d.KANJI;
            mb.a aVar5 = new mb.a();
            if (dVar == dVar3 && z18 && (cVar = (mb.c) mb.c.d.get(charsetForName.name())) != null) {
                i15 = 4;
                aVar5.b(7, 4);
                aVar5.b(cVar.f17924a[0], 8);
            } else {
                i15 = 4;
            }
            if (z10) {
                aVar5.b(5, i15);
            }
            aVar5.b(dVar.f46195b, i15);
            mb.a aVar6 = new mb.a();
            sb.c.a(str, dVar, aVar6, charsetForName);
            if (map != null) {
                lb.b bVar7 = lb.b.d;
                if (map.containsKey(bVar7)) {
                    eVarC3 = qb.e.c(Integer.parseInt(map.get(bVar7).toString()));
                    if (!sb.c.c(dVar.a(eVarC3) + aVar5.f17918b + aVar6.f17918b, eVarC3, bVarValueOf)) {
                        throw new com.google.firebase.messaging.s("Data too big for requested version");
                    }
                } else {
                    iA = dVar.a(qb.e.c(1)) + aVar5.f17918b + aVar6.f17918b;
                    i16 = 1;
                    while (true) {
                        if (i16 <= 40) {
                            throw new com.google.firebase.messaging.s("Data too big");
                        }
                        eVarC = qb.e.c(i16);
                        if (sb.c.c(iA, eVarC, bVarValueOf)) {
                            iA2 = dVar.a(eVarC) + aVar5.f17918b + aVar6.f17918b;
                            i17 = 1;
                            while (true) {
                                if (i17 <= 40) {
                                    throw new com.google.firebase.messaging.s("Data too big");
                                }
                                eVarC2 = qb.e.c(i17);
                                if (sb.c.c(iA2, eVarC2, bVarValueOf)) {
                                    eVarC3 = eVarC2;
                                    break;
                                }
                                i17++;
                                bVarValueOf = bVarValueOf;
                            }
                        } else {
                            i16++;
                            iA = iA;
                            bVarValueOf = bVarValueOf;
                        }
                    }
                }
            } else {
                iA = dVar.a(qb.e.c(1)) + aVar5.f17918b + aVar6.f17918b;
                i16 = 1;
                while (true) {
                    if (i16 <= 40) {
                        throw new com.google.firebase.messaging.s("Data too big");
                    }
                    eVarC = qb.e.c(i16);
                    if (sb.c.c(iA, eVarC, bVarValueOf)) {
                        iA2 = dVar.a(eVarC) + aVar5.f17918b + aVar6.f17918b;
                        i17 = 1;
                        while (true) {
                            if (i17 <= 40) {
                                throw new com.google.firebase.messaging.s("Data too big");
                            }
                            eVarC2 = qb.e.c(i17);
                            if (sb.c.c(iA2, eVarC2, bVarValueOf)) {
                                eVarC3 = eVarC2;
                                break;
                            }
                            i17++;
                            bVarValueOf = bVarValueOf;
                        }
                    } else {
                        i16++;
                        iA = iA;
                        bVarValueOf = bVarValueOf;
                    }
                }
            }
            mb.a aVar7 = new mb.a();
            int i32 = aVar5.f17918b;
            aVar7.c(i32);
            for (int i33 = 0; i33 < i32; i33++) {
                aVar7.a(aVar5.d(i33));
            }
            int iE = dVar == dVar3 ? aVar6.e() : str.length();
            int iA3 = dVar.a(eVarC3);
            int i34 = 1 << iA3;
            if (iE >= i34) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(iE);
                sb2.append(" is bigger than ");
                sb2.append(i34 - 1);
                throw new com.google.firebase.messaging.s(sb2.toString());
            }
            aVar7.b(iE, iA3);
            int i35 = aVar6.f17918b;
            aVar7.c(aVar7.f17918b + i35);
            for (int i36 = 0; i36 < i35; i36++) {
                aVar7.a(aVar6.d(i36));
            }
            eVar = eVarC3;
            aVar = aVar7;
        }
        n2.v vVar = eVar.f46200c[bVarValueOf.ordinal()];
        int i37 = eVar.d;
        int i38 = vVar.f18186b;
        d5.p[] pVarArr = (d5.p[]) vVar.f18187c;
        int i39 = 0;
        for (d5.p pVar : pVarArr) {
            i39 += pVar.f4821a;
        }
        int i40 = i37 - (i39 * i38);
        int i41 = i40 * 8;
        if (aVar.f17918b > i41) {
            throw new com.google.firebase.messaging.s("data bits cannot fit in the QR Code" + aVar.f17918b + " > " + i41);
        }
        for (int i42 = 0; i42 < 4 && aVar.f17918b < i41; i42++) {
            aVar.a(false);
        }
        boolean z21 = false;
        int i43 = aVar.f17918b & 7;
        if (i43 > 0) {
            while (i43 < 8) {
                aVar.a(z21);
                i43++;
                z21 = false;
            }
        }
        int iE2 = i40 - aVar.e();
        int i44 = 0;
        while (i44 < iE2) {
            int i45 = iE2;
            aVar.b((i44 & 1) == 0 ? 236 : 17, 8);
            i44++;
            iE2 = i45;
        }
        if (aVar.f17918b != i41) {
            throw new com.google.firebase.messaging.s("Bits size does not equal capacity");
        }
        int i46 = 0;
        for (d5.p pVar2 : pVarArr) {
            i46 += pVar2.f4821a;
        }
        if (aVar.e() != i40) {
            throw new com.google.firebase.messaging.s("Number of bits and data bytes does not match");
        }
        ArrayList arrayList3 = new ArrayList(i46);
        int iMax = 0;
        int i47 = 0;
        int i48 = 0;
        int iMax2 = 0;
        while (i47 < i46) {
            int[] iArr = new int[1];
            int[] iArr2 = new int[1];
            if (i47 >= i46) {
                throw new com.google.firebase.messaging.s("Block ID too large");
            }
            int i49 = i37 % i46;
            int i50 = i46 - i49;
            int i51 = i37 / i46;
            int i52 = i40 / i46;
            int i53 = i52 + 1;
            int i54 = i51 - i52;
            int i55 = (i51 + 1) - i53;
            if (i54 != i55) {
                throw new com.google.firebase.messaging.s("EC bytes mismatch");
            }
            if (i46 != i50 + i49) {
                throw new com.google.firebase.messaging.s("RS blocks mismatch");
            }
            if (i37 != ((i53 + i55) * i49) + ((i52 + i54) * i50)) {
                throw new com.google.firebase.messaging.s("Total bytes mismatch");
            }
            if (i47 < i50) {
                c11 = 0;
                iArr[0] = i52;
                iArr2[0] = i54;
            } else {
                c11 = 0;
                iArr[0] = i53;
                iArr2[0] = i55;
            }
            int i56 = iArr[c11];
            byte[] bArr2 = new byte[i56];
            int i57 = i48 * 8;
            int i58 = 0;
            while (i58 < i56) {
                int i59 = i58;
                int i60 = i46;
                int i61 = i57;
                int i62 = i47;
                int i63 = 0;
                for (int i64 = 0; i64 < 8; i64++) {
                    if (aVar.d(i61)) {
                        i63 = (1 << (7 - i64)) | i63;
                    }
                    i61++;
                }
                bArr2[i59] = (byte) i63;
                i58 = i59 + 1;
                i47 = i62;
                i57 = i61;
                i46 = i60;
            }
            int i65 = i47;
            int i66 = i46;
            int i67 = iArr2[0];
            int i68 = i56 + i67;
            int[] iArr3 = new int[i68];
            int i69 = 0;
            while (i69 < i56) {
                iArr3[i69] = bArr2[i69] & 255;
                i69++;
                i68 = i68;
            }
            int i70 = i68;
            ob.a aVar8 = ob.a.h;
            ArrayList arrayList4 = new ArrayList();
            mb.a aVar9 = aVar;
            qb.b bVar8 = bVarValueOf;
            arrayList4.add(new ob.b(aVar8, new int[]{1}));
            if (i67 == 0) {
                throw new IllegalArgumentException("No error correction bytes");
            }
            int i71 = i70 - i67;
            if (i71 <= 0) {
                throw new IllegalArgumentException("No data bytes provided");
            }
            if (i67 >= arrayList4.size()) {
                ob.b bVar9 = (ob.b) i0.a.i(1, arrayList4);
                int size2 = arrayList4.size();
                ob.b bVarG = bVar9;
                while (size2 <= i67) {
                    int i72 = size2;
                    bVarG = bVarG.g(new ob.b(aVar8, new int[]{1, aVar8.f19415a[(i72 - 1) + aVar8.f19420g]}));
                    arrayList4.add(bVarG);
                    size2 = i72 + 1;
                    i37 = i37;
                    eVar = eVar;
                }
            }
            qb.e eVar2 = eVar;
            int i73 = i37;
            ob.b bVar10 = (ob.b) arrayList4.get(i67);
            int[] iArr4 = new int[i71];
            System.arraycopy(iArr3, 0, iArr4, 0, i71);
            if (i71 == 0) {
                throw new IllegalArgumentException();
            }
            if (i71 > 1 && iArr4[0] == 0) {
                int i74 = 1;
                while (i74 < i71 && iArr4[i74] == 0) {
                    i74++;
                }
                if (i74 == i71) {
                    iArr4 = new int[]{0};
                } else {
                    int i75 = i71 - i74;
                    int[] iArr5 = new int[i75];
                    System.arraycopy(iArr4, i74, iArr5, 0, i75);
                    iArr4 = iArr5;
                }
            }
            if (i67 < 0) {
                throw new IllegalArgumentException();
            }
            int length = iArr4.length;
            int[] iArr6 = new int[length + i67];
            int i76 = 0;
            while (i76 < length) {
                iArr6[i76] = aVar8.c(iArr4[i76], 1);
                i76++;
                iArr4 = iArr4;
            }
            ob.b bVar11 = new ob.b(aVar8, iArr6);
            if (!aVar8.equals(bVar10.f19421a)) {
                throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
            }
            if (bVar10.e()) {
                throw new IllegalArgumentException("Divide by 0");
            }
            ob.b bVarA = aVar8.f19417c;
            int iB = aVar8.b(bVar10.c(bVar10.d()));
            while (bVar11.d() >= bVar10.d() && !bVar11.e()) {
                int iD = bVar11.d() - bVar10.d();
                int iC2 = aVar8.c(bVar11.c(bVar11.d()), iB);
                int i77 = iB;
                ob.b bVarH = bVar10.h(iD, iC2);
                bVarA = bVarA.a(aVar8.a(iD, iC2));
                bVar11 = bVar11.a(bVarH);
                iB = i77;
            }
            int[] iArr7 = new ob.b[]{bVarA, bVar11}[1].f19422b;
            int length2 = i67 - iArr7.length;
            for (int i78 = 0; i78 < length2; i78++) {
                iArr3[i71 + i78] = 0;
            }
            System.arraycopy(iArr7, 0, iArr3, i71 + length2, iArr7.length);
            byte[] bArr3 = new byte[i67];
            for (int i79 = 0; i79 < i67; i79++) {
                bArr3[i79] = (byte) iArr3[i56 + i79];
            }
            arrayList3.add(new sb.a(bArr2, bArr3));
            iMax2 = Math.max(iMax2, i56);
            iMax = Math.max(iMax, i67);
            i48 += iArr[0];
            i47 = i65 + 1;
            aVar = aVar9;
            i46 = i66;
            i37 = i73;
            bVarValueOf = bVar8;
            eVar = eVar2;
        }
        qb.e eVar3 = eVar;
        qb.b bVar12 = bVarValueOf;
        int i80 = i37;
        if (i40 != i48) {
            throw new com.google.firebase.messaging.s("Data bytes does not match offset");
        }
        mb.a aVar10 = new mb.a();
        for (int i81 = 0; i81 < iMax2; i81++) {
            int size3 = arrayList3.size();
            int i82 = 0;
            while (i82 < size3) {
                Object obj2 = arrayList3.get(i82);
                i82++;
                byte[] bArr4 = ((sb.a) obj2).f47828a;
                if (i81 < bArr4.length) {
                    aVar10.b(bArr4[i81], 8);
                }
            }
        }
        for (int i83 = 0; i83 < iMax; i83++) {
            int size4 = arrayList3.size();
            int i84 = 0;
            while (i84 < size4) {
                Object obj3 = arrayList3.get(i84);
                i84++;
                byte[] bArr5 = ((sb.a) obj3).f47829b;
                if (i83 < bArr5.length) {
                    aVar10.b(bArr5[i83], 8);
                }
            }
        }
        if (i80 != aVar10.e()) {
            StringBuilder sbO = i0.a.o(i80, "Interleaving error: ", " and ");
            sbO.append(aVar10.e());
            sbO.append(" differ.");
            throw new com.google.firebase.messaging.s(sbO.toString());
        }
        int i85 = (eVar3.f46198a * 4) + 17;
        sb.b bVar13 = new sb.b(i85, i85);
        if (map != null) {
            lb.b bVar14 = lb.b.f15510e;
            if (map.containsKey(bVar14)) {
                i18 = Integer.parseInt(map.get(bVar14).toString());
                if (!(i18 >= 0 && i18 < 8)) {
                    i18 = -1;
                }
            } else {
                i18 = -1;
            }
        } else {
            i18 = -1;
        }
        int i86 = bVar13.f47832c;
        int i87 = bVar13.f47831b;
        int i88 = -1;
        if (i18 == -1) {
            int i89 = 0;
            int i90 = Integer.MAX_VALUE;
            while (i89 < 8) {
                qb.b bVar15 = bVar12;
                sb.d.b(aVar10, bVar15, eVar3, i89, bVar13);
                int iA4 = sb.d.a(bVar13, false) + sb.d.a(bVar13, true);
                int i91 = 0;
                int i92 = 0;
                while (true) {
                    int i93 = i86 - 1;
                    bArr = bVar13.f47830a;
                    if (i91 >= i93) {
                        break;
                    }
                    byte[] bArr6 = bArr[i91];
                    int i94 = 0;
                    while (i94 < i87 - 1) {
                        byte b10 = bArr6[i94];
                        int i95 = i94 + 1;
                        int i96 = i88;
                        if (b10 == bArr6[i95]) {
                            byte[] bArr7 = bArr[i91 + 1];
                            if (b10 == bArr7[i94] && b10 == bArr7[i95]) {
                                i92++;
                            }
                        }
                        i88 = i96;
                        i94 = i95;
                    }
                    i91++;
                }
                int i97 = i88;
                int i98 = (i92 * 3) + iA4;
                int i99 = 0;
                for (int i100 = 0; i100 < i86; i100++) {
                    int i101 = 0;
                    while (i101 < i87) {
                        byte[] bArr8 = bArr[i100];
                        int i102 = i101 + 6;
                        if (i102 < i87) {
                            i19 = i89;
                            byte b11 = 1;
                            if (bArr8[i101] == 1 && bArr8[i101 + 1] == 0 && bArr8[i101 + 2] == 1 && bArr8[i101 + 3] == 1 && bArr8[i101 + 4] == 1 && bArr8[i101 + 5] == 0 && bArr8[i102] == 1) {
                                int i103 = i101 - 4;
                                if (i103 < 0 || bArr8.length < i101) {
                                    z16 = false;
                                    break;
                                }
                                while (true) {
                                    if (i103 >= i101) {
                                        z16 = true;
                                        break;
                                    }
                                    if (bArr8[i103] == b11) {
                                        z16 = false;
                                        break;
                                    }
                                    i103++;
                                    b11 = 1;
                                }
                                if (z16) {
                                    i99++;
                                } else {
                                    int i104 = i101 + 7;
                                    int i105 = i101 + 11;
                                    if (i104 < 0 || bArr8.length < i105) {
                                        z17 = false;
                                        break;
                                    }
                                    while (true) {
                                        if (i104 >= i105) {
                                            z17 = true;
                                            break;
                                        }
                                        int i106 = i104;
                                        if (bArr8[i104] == 1) {
                                            z17 = false;
                                            break;
                                        }
                                        i104 = i106 + 1;
                                    }
                                    if (z17) {
                                        i99++;
                                    }
                                }
                            }
                        } else {
                            i19 = i89;
                        }
                        int i107 = i100 + 6;
                        if (i107 < i86) {
                            byte b12 = 1;
                            if (bArr[i100][i101] == 1 && bArr[i100 + 1][i101] == 0 && bArr[i100 + 2][i101] == 1 && bArr[i100 + 3][i101] == 1 && bArr[i100 + 4][i101] == 1 && bArr[i100 + 5][i101] == 0 && bArr[i107][i101] == 1) {
                                int i108 = i100 - 4;
                                if (i108 < 0 || bArr.length < i100) {
                                    z14 = false;
                                    break;
                                }
                                while (true) {
                                    if (i108 >= i100) {
                                        z14 = true;
                                        break;
                                    }
                                    if (bArr[i108][i101] == b12) {
                                        z14 = false;
                                        break;
                                    }
                                    i108++;
                                    b12 = 1;
                                }
                                if (z14) {
                                    i99++;
                                } else {
                                    int i109 = i100 + 7;
                                    int i110 = i100 + 11;
                                    if (i109 < 0 || bArr.length < i110) {
                                        z15 = false;
                                        break;
                                    }
                                    while (true) {
                                        if (i109 >= i110) {
                                            z15 = true;
                                            break;
                                        }
                                        if (bArr[i109][i101] == 1) {
                                            z15 = false;
                                            break;
                                        }
                                        i109++;
                                    }
                                    if (z15) {
                                        i99++;
                                    }
                                }
                            }
                        }
                        i101++;
                        i89 = i19;
                    }
                }
                int i111 = i89;
                int i112 = (i99 * 40) + i98;
                int i113 = 0;
                for (int i114 = 0; i114 < i86; i114++) {
                    byte[] bArr9 = bArr[i114];
                    for (int i115 = 0; i115 < i87; i115++) {
                        if (bArr9[i115] == 1) {
                            i113++;
                        }
                    }
                }
                int i116 = i86 * i87;
                int iAbs = (((Math.abs((i113 * 2) - i116) * 10) / i116) * 10) + i112;
                if (iAbs < i90) {
                    i90 = iAbs;
                    i88 = i111;
                } else {
                    i88 = i97;
                }
                i89 = i111 + 1;
                bVar12 = bVar15;
            }
            i18 = i88;
        }
        sb.d.b(aVar10, bVar12, eVar3, i18, bVar13);
        this.input = bVar13;
        for (int i117 = 0; i117 < i87 && has(i117, 0); i117++) {
            this.sideQuadSize++;
        }
        int i118 = i20 * 2;
        int i119 = i87 + i118;
        int i120 = i118 + i86;
        int iMin = Math.min(Math.max(i10, i119) / i119, Math.max(i11, i120) / i120);
        int i121 = iMin * i87;
        int i122 = i121 + 32;
        Bitmap bitmapCreateBitmap = (bitmap == null || bitmap.getWidth() != i122) ? Bitmap.createBitmap(i122, i122, Bitmap.Config.ARGB_8888) : bitmap;
        Canvas canvas2 = new Canvas(bitmapCreateBitmap);
        canvas2.drawColor(i12);
        Paint paint3 = new Paint(1);
        paint3.setColor(i13);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadii(this.radii);
        float f12 = i121 / 4.65f;
        Canvas canvas3 = canvas2;
        float f13 = iMin;
        int iRound = Math.round(f12 / f13);
        this.imageBloks = iRound;
        if (iRound % 2 != i87 % 2) {
            this.imageBloks = iRound + 1;
        }
        int i123 = this.imageBloks;
        this.imageBlockX = (i87 - i123) / 2;
        int i124 = (i123 * iMin) - 24;
        this.imageSize = i124;
        int i125 = (i122 - i124) / 2;
        if (this.includeSideQuads) {
            paint3.setColor(i13);
            paint = paint3;
            c10 = 3;
            drawSideQuadsGradient(canvas3, paint, gradientDrawable, this.sideQuadSize, f13, 16, i122, f10, this.radii, i12, i13);
        } else {
            paint = paint3;
            c10 = 3;
        }
        boolean z22 = Color.alpha(i12) == 0;
        float f14 = (f13 / 2.0f) * f10;
        int i126 = 16;
        int i127 = 0;
        while (i127 < i86) {
            int i128 = 0;
            int i129 = 16;
            while (i128 < i87) {
                if (has(i128, i127)) {
                    Arrays.fill(this.radii, f14);
                    if (has(i128, i127 - 1)) {
                        float[] fArr = this.radii;
                        fArr[1] = 0.0f;
                        fArr[0] = 0.0f;
                        fArr[c10] = 0.0f;
                        fArr[2] = 0.0f;
                    }
                    if (has(i128, i127 + 1)) {
                        float[] fArr2 = this.radii;
                        fArr2[7] = 0.0f;
                        fArr2[6] = 0.0f;
                        fArr2[5] = 0.0f;
                        fArr2[4] = 0.0f;
                    }
                    if (has(i128 - 1, i127)) {
                        float[] fArr3 = this.radii;
                        fArr3[1] = 0.0f;
                        fArr3[0] = 0.0f;
                        fArr3[7] = 0.0f;
                        fArr3[6] = 0.0f;
                    }
                    if (has(i128 + 1, i127)) {
                        float[] fArr4 = this.radii;
                        fArr4[c10] = 0.0f;
                        fArr4[2] = 0.0f;
                        fArr4[5] = 0.0f;
                        fArr4[4] = 0.0f;
                    }
                    gradientDrawable.setColor(i13);
                    gradientDrawable.setBounds(i129, i126, i129 + iMin, i126 + iMin);
                    gradientDrawable.draw(canvas3);
                    paint2 = paint;
                    canvas = canvas3;
                    f11 = f14;
                } else {
                    Paint paint4 = paint;
                    Arrays.fill(this.radii, 0.0f);
                    int i130 = i128 - 1;
                    int i131 = i127 - 1;
                    if (has(i130, i131) && has(i130, i127) && has(i128, i131)) {
                        float[] fArr5 = this.radii;
                        fArr5[1] = f14;
                        fArr5[0] = f14;
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    boolean z23 = z12;
                    int i132 = i128 + 1;
                    if (has(i132, i131) && has(i132, i127) && has(i128, i131)) {
                        float[] fArr6 = this.radii;
                        fArr6[c10] = f14;
                        fArr6[2] = f14;
                        z13 = true;
                    } else {
                        z13 = z23;
                    }
                    f11 = f14;
                    int i133 = i127 + 1;
                    if (has(i130, i133) && has(i130, i127) && has(i128, i133)) {
                        float[] fArr7 = this.radii;
                        fArr7[7] = f11;
                        fArr7[6] = f11;
                        z13 = true;
                    }
                    if (has(i132, i133) && has(i132, i127) && has(i128, i133)) {
                        float[] fArr8 = this.radii;
                        fArr8[5] = f11;
                        fArr8[4] = f11;
                        z13 = true;
                    }
                    if (!z13 || z22) {
                        canvas = canvas3;
                        paint2 = paint4;
                    } else {
                        int i134 = i129 + iMin;
                        int i135 = i126 + iMin;
                        canvas3.drawRect(i129, i126, i134, i135, paint4);
                        canvas = canvas3;
                        paint2 = paint4;
                        gradientDrawable.setColor(i12);
                        gradientDrawable.setBounds(i129, i126, i134, i135);
                        gradientDrawable.draw(canvas);
                    }
                }
                i128++;
                i129 += iMin;
                canvas3 = canvas;
                paint = paint2;
                f14 = f11;
            }
            i127++;
            i126 += iMin;
            paint = paint;
        }
        Canvas canvas4 = canvas3;
        String res = AndroidUtilities.readRes(R.raw.qr_logo);
        int i136 = this.imageSize;
        Bitmap bitmap2 = SvgHelper.getBitmap(res, i136, i136, false);
        float f15 = i125;
        canvas4.drawBitmap(bitmap2, f15, f15, (Paint) null);
        bitmap2.recycle();
        canvas4.setBitmap(null);
        return bitmapCreateBitmap;
    }
}
