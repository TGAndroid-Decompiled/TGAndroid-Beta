package b4;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.util.SparseArray;
import e2.j;
import e2.l0;
import e2.x;
import e9.n0;
import e9.x1;
import java.util.ArrayList;
import java.util.List;
import z3.l;
import z3.m;
public final class i implements m {
    public static final byte[] f2477n = {0, 7, 8, 15};
    public static final byte[] f2478r = {0, 119, -120, -1};
    public static final byte[] f2479s = {0, 17, 34, 51, 68, 85, 102, 119, -120, -103, -86, -69, -52, -35, -18, -1};
    public final Paint f2480a;
    public final Paint f2481b;
    public final Canvas f2482c;
    public final b d;
    public final a e;
    public final h f2483f;
    public Bitmap h;

    public i(List list) {
        x xVar = new x((byte[]) list.get(0));
        int H = xVar.H();
        int H2 = xVar.H();
        Paint paint = new Paint();
        this.f2480a = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        paint.setPathEffect(null);
        Paint paint2 = new Paint();
        this.f2481b = paint2;
        paint2.setStyle(Paint.Style.FILL);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
        paint2.setPathEffect(null);
        this.f2482c = new Canvas();
        this.d = new b(719, 575, 0, 719, 0, 575);
        this.e = new a(0, new int[]{0, -1, -16777216, -8421505}, b(), c());
        this.f2483f = new h(H, H2);
    }

    public static byte[] a(int i10, int i11, a4.g gVar) {
        byte[] bArr = new byte[i10];
        for (int i12 = 0; i12 < i10; i12++) {
            bArr[i12] = (byte) gVar.i(i11);
        }
        return bArr;
    }

    public static int[] b() {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int[] iArr = new int[16];
        iArr[0] = 0;
        for (int i15 = 1; i15 < 16; i15++) {
            if (i15 < 8) {
                if ((i15 & 1) != 0) {
                    i12 = 255;
                } else {
                    i12 = 0;
                }
                if ((i15 & 2) != 0) {
                    i13 = 255;
                } else {
                    i13 = 0;
                }
                if ((i15 & 4) != 0) {
                    i14 = 255;
                } else {
                    i14 = 0;
                }
                iArr[i15] = d(255, i12, i13, i14);
            } else {
                int i16 = 127;
                if ((i15 & 1) != 0) {
                    i10 = 127;
                } else {
                    i10 = 0;
                }
                if ((i15 & 2) != 0) {
                    i11 = 127;
                } else {
                    i11 = 0;
                }
                if ((i15 & 4) == 0) {
                    i16 = 0;
                }
                iArr[i15] = d(255, i10, i11, i16);
            }
        }
        return iArr;
    }

    public static int[] c() {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int[] iArr = new int[256];
        iArr[0] = 0;
        for (int i28 = 0; i28 < 256; i28++) {
            int i29 = 255;
            if (i28 < 8) {
                if ((i28 & 1) != 0) {
                    i26 = 255;
                } else {
                    i26 = 0;
                }
                if ((i28 & 2) != 0) {
                    i27 = 255;
                } else {
                    i27 = 0;
                }
                if ((i28 & 4) == 0) {
                    i29 = 0;
                }
                iArr[i28] = d(63, i26, i27, i29);
            } else {
                int i30 = i28 & 136;
                int i31 = 170;
                int i32 = 85;
                if (i30 != 0) {
                    if (i30 != 8) {
                        int i33 = 43;
                        if (i30 != 128) {
                            if (i30 == 136) {
                                if ((i28 & 1) != 0) {
                                    i22 = 43;
                                } else {
                                    i22 = 0;
                                }
                                if ((i28 & 16) != 0) {
                                    i23 = 85;
                                } else {
                                    i23 = 0;
                                }
                                int i34 = i22 + i23;
                                if ((i28 & 2) != 0) {
                                    i24 = 43;
                                } else {
                                    i24 = 0;
                                }
                                if ((i28 & 32) != 0) {
                                    i25 = 85;
                                } else {
                                    i25 = 0;
                                }
                                int i35 = i24 + i25;
                                if ((i28 & 4) == 0) {
                                    i33 = 0;
                                }
                                if ((i28 & 64) == 0) {
                                    i32 = 0;
                                }
                                iArr[i28] = d(255, i34, i35, i33 + i32);
                            }
                        } else {
                            if ((i28 & 1) != 0) {
                                i18 = 43;
                            } else {
                                i18 = 0;
                            }
                            int i36 = i18 + 127;
                            if ((i28 & 16) != 0) {
                                i19 = 85;
                            } else {
                                i19 = 0;
                            }
                            int i37 = i36 + i19;
                            if ((i28 & 2) != 0) {
                                i20 = 43;
                            } else {
                                i20 = 0;
                            }
                            int i38 = i20 + 127;
                            if ((i28 & 32) != 0) {
                                i21 = 85;
                            } else {
                                i21 = 0;
                            }
                            int i39 = i38 + i21;
                            if ((i28 & 4) == 0) {
                                i33 = 0;
                            }
                            int i40 = i33 + 127;
                            if ((i28 & 64) == 0) {
                                i32 = 0;
                            }
                            iArr[i28] = d(255, i37, i39, i40 + i32);
                        }
                    } else {
                        if ((i28 & 1) != 0) {
                            i14 = 85;
                        } else {
                            i14 = 0;
                        }
                        if ((i28 & 16) != 0) {
                            i15 = 170;
                        } else {
                            i15 = 0;
                        }
                        int i41 = i14 + i15;
                        if ((i28 & 2) != 0) {
                            i16 = 85;
                        } else {
                            i16 = 0;
                        }
                        if ((i28 & 32) != 0) {
                            i17 = 170;
                        } else {
                            i17 = 0;
                        }
                        int i42 = i16 + i17;
                        if ((i28 & 4) == 0) {
                            i32 = 0;
                        }
                        if ((i28 & 64) == 0) {
                            i31 = 0;
                        }
                        iArr[i28] = d(127, i41, i42, i32 + i31);
                    }
                } else {
                    if ((i28 & 1) != 0) {
                        i10 = 85;
                    } else {
                        i10 = 0;
                    }
                    if ((i28 & 16) != 0) {
                        i11 = 170;
                    } else {
                        i11 = 0;
                    }
                    int i43 = i10 + i11;
                    if ((i28 & 2) != 0) {
                        i12 = 85;
                    } else {
                        i12 = 0;
                    }
                    if ((i28 & 32) != 0) {
                        i13 = 170;
                    } else {
                        i13 = 0;
                    }
                    int i44 = i12 + i13;
                    if ((i28 & 4) == 0) {
                        i32 = 0;
                    }
                    if ((i28 & 64) == 0) {
                        i31 = 0;
                    }
                    iArr[i28] = d(255, i43, i44, i32 + i31);
                }
            }
        }
        return iArr;
    }

    public static int d(int i10, int i11, int i12, int i13) {
        return (i10 << 24) | (i11 << 16) | (i12 << 8) | i13;
    }

    public static void e(byte[] r21, int[] r22, int r23, int r24, int r25, android.graphics.Paint r26, android.graphics.Canvas r27) {
        throw new UnsupportedOperationException("Method not decompiled: b4.i.e(byte[], int[], int, int, int, android.graphics.Paint, android.graphics.Canvas):void");
    }

    public static a f(a4.g gVar, int i10) {
        int[] iArr;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16 = 8;
        int i17 = gVar.i(8);
        gVar.f0(8);
        int i18 = 2;
        int i19 = i10 - 2;
        int i20 = 0;
        int[] iArr2 = {0, -1, -16777216, -8421505};
        int[] b10 = b();
        int[] c10 = c();
        while (i19 > 0) {
            int i21 = gVar.i(i16);
            int i22 = gVar.i(i16);
            if ((i22 & 128) != 0) {
                iArr = iArr2;
            } else if ((i22 & 64) != 0) {
                iArr = b10;
            } else {
                iArr = c10;
            }
            if ((i22 & 1) != 0) {
                i14 = gVar.i(i16);
                i15 = gVar.i(i16);
                i11 = gVar.i(i16);
                i13 = gVar.i(i16);
                i12 = i19 - 6;
            } else {
                int i23 = gVar.i(4) << 4;
                i11 = gVar.i(4) << 4;
                i12 = i19 - 4;
                i13 = gVar.i(i18) << 6;
                i14 = gVar.i(6) << i18;
                i15 = i23;
            }
            if (i14 == 0) {
                i15 = i20;
                i11 = i15;
                i13 = 255;
            }
            double d = i14;
            double d10 = i15 - 128;
            double d11 = i11 - 128;
            iArr[i21] = d((byte) (255 - (i13 & 255)), l0.i((int) ((1.402d * d10) + d), 0, 255), l0.i((int) ((d - (0.34414d * d11)) - (d10 * 0.71414d)), 0, 255), l0.i((int) ((d11 * 1.772d) + d), 0, 255));
            i19 = i12;
            i20 = 0;
            i17 = i17;
            c10 = c10;
            i16 = 8;
            i18 = 2;
        }
        return new a(i17, iArr2, b10, c10);
    }

    public static c g(a4.g gVar) {
        byte[] bArr;
        int i10 = gVar.i(16);
        gVar.f0(4);
        int i11 = gVar.i(2);
        boolean h = gVar.h();
        gVar.f0(1);
        byte[] bArr2 = l0.f6166b;
        if (i11 == 1) {
            gVar.f0(gVar.i(8) * 16);
        } else if (i11 == 0) {
            int i12 = gVar.i(16);
            int i13 = gVar.i(16);
            if (i12 > 0) {
                bArr2 = new byte[i12];
                gVar.o(i12, bArr2);
            }
            if (i13 > 0) {
                bArr = new byte[i13];
                gVar.o(i13, bArr);
                return new c(i10, h, bArr2, bArr);
            }
        }
        bArr = bArr2;
        return new c(i10, h, bArr2, bArr);
    }

    @Override
    public final z3.d l(int i10, int i11, byte[] bArr) {
        return sc.e.a(this, bArr, i11);
    }

    @Override
    public final int o() {
        return 2;
    }

    @Override
    public final void reset() {
        h hVar = this.f2483f;
        hVar.f2473c.clear();
        hVar.d.clear();
        hVar.e.clear();
        hVar.f2474f.clear();
        hVar.f2475g.clear();
        hVar.h = null;
        hVar.f2476i = null;
    }

    @Override
    public final void z(byte[] bArr, int i10, int i11, l lVar, j jVar) {
        h hVar;
        boolean z10;
        z3.a aVar;
        char c10;
        char c11;
        char c12;
        int i12;
        ArrayList arrayList;
        int i13;
        b bVar;
        h hVar2;
        f fVar;
        int i14;
        int i15;
        int i16;
        int i17;
        Paint paint;
        int[] iArr;
        f fVar2;
        int i18;
        int i19;
        int i20;
        int i21;
        a4.g gVar = new a4.g(bArr, i10 + i11);
        gVar.d0(i10);
        while (true) {
            int b10 = gVar.b();
            hVar = this.f2483f;
            z10 = true;
            if (b10 >= 48 && gVar.i(8) == 15) {
                int i22 = gVar.i(8);
                int i23 = gVar.i(16);
                int i24 = gVar.i(16);
                int d = gVar.d() + i24;
                if (i24 * 8 > gVar.b()) {
                    e2.a.l("DvbParser", "Data field length exceeds limit");
                    gVar.f0(gVar.b());
                } else {
                    switch (i22) {
                        case 16:
                            if (i23 == hVar.f2471a) {
                                d dVar = hVar.f2476i;
                                gVar.i(8);
                                int i25 = gVar.i(4);
                                int i26 = gVar.i(2);
                                gVar.f0(2);
                                int i27 = i24 - 2;
                                SparseArray sparseArray = new SparseArray();
                                while (i27 > 0) {
                                    int i28 = gVar.i(8);
                                    gVar.f0(8);
                                    i27 -= 6;
                                    sparseArray.put(i28, new e(gVar.i(16), gVar.i(16)));
                                }
                                d dVar2 = new d(i25, i26, sparseArray);
                                if (i26 != 0) {
                                    hVar.f2476i = dVar2;
                                    hVar.f2473c.clear();
                                    hVar.d.clear();
                                    hVar.e.clear();
                                    break;
                                } else if (dVar != null && dVar.f2458b != i25) {
                                    hVar.f2476i = dVar2;
                                    break;
                                }
                            }
                            break;
                        case 17:
                            d dVar3 = hVar.f2476i;
                            SparseArray sparseArray2 = hVar.f2473c;
                            if (i23 == hVar.f2471a && dVar3 != null) {
                                int i29 = gVar.i(8);
                                gVar.f0(4);
                                boolean h = gVar.h();
                                gVar.f0(3);
                                int i30 = gVar.i(16);
                                int i31 = gVar.i(16);
                                gVar.i(3);
                                int i32 = gVar.i(3);
                                gVar.f0(2);
                                int i33 = gVar.i(8);
                                int i34 = gVar.i(8);
                                int i35 = gVar.i(4);
                                int i36 = gVar.i(2);
                                gVar.f0(2);
                                int i37 = i24 - 10;
                                SparseArray sparseArray3 = new SparseArray();
                                while (i37 > 0) {
                                    int i38 = gVar.i(16);
                                    int i39 = gVar.i(2);
                                    gVar.i(2);
                                    int i40 = gVar.i(12);
                                    gVar.f0(4);
                                    int i41 = gVar.i(12);
                                    int i42 = i37 - 6;
                                    if (i39 != 1 && i39 != 2) {
                                        i37 = i42;
                                    } else {
                                        gVar.i(8);
                                        gVar.i(8);
                                        i37 -= 8;
                                    }
                                    sparseArray3.put(i38, new g(i40, i41));
                                }
                                f fVar3 = new f(i29, h, i30, i31, i32, i33, i34, i35, i36, sparseArray3);
                                if (dVar3.f2459c == 0 && (fVar2 = (f) sparseArray2.get(i29)) != null) {
                                    SparseArray sparseArray4 = fVar2.f2468j;
                                    for (int i43 = 0; i43 < sparseArray4.size(); i43++) {
                                        fVar3.f2468j.put(sparseArray4.keyAt(i43), (g) sparseArray4.valueAt(i43));
                                    }
                                }
                                sparseArray2.put(fVar3.f2462a, fVar3);
                                break;
                            }
                            break;
                        case 18:
                            if (i23 == hVar.f2471a) {
                                a f7 = f(gVar, i24);
                                hVar.d.put(f7.f2447a, f7);
                                break;
                            } else if (i23 == hVar.f2472b) {
                                a f10 = f(gVar, i24);
                                hVar.f2474f.put(f10.f2447a, f10);
                                break;
                            }
                            break;
                        case 19:
                            if (i23 == hVar.f2471a) {
                                c g10 = g(gVar);
                                hVar.e.put(g10.f2454a, g10);
                                break;
                            } else if (i23 == hVar.f2472b) {
                                c g11 = g(gVar);
                                hVar.f2475g.put(g11.f2454a, g11);
                                break;
                            }
                            break;
                        case 20:
                            if (i23 == hVar.f2471a) {
                                gVar.f0(4);
                                boolean h10 = gVar.h();
                                gVar.f0(3);
                                int i44 = gVar.i(16);
                                int i45 = gVar.i(16);
                                if (h10) {
                                    int i46 = gVar.i(16);
                                    i18 = gVar.i(16);
                                    i21 = gVar.i(16);
                                    i19 = gVar.i(16);
                                    i20 = i46;
                                } else {
                                    i18 = i44;
                                    i19 = i45;
                                    i20 = 0;
                                    i21 = 0;
                                }
                                hVar.h = new b(i44, i45, i20, i18, i21, i19);
                                break;
                            }
                            break;
                    }
                    gVar.g0(d - gVar.d());
                }
            }
        }
        d dVar4 = hVar.f2476i;
        if (dVar4 == null) {
            e9.l0 l0Var = n0.f6390b;
            aVar = new z3.a(-9223372036854775807L, -9223372036854775807L, x1.e);
        } else {
            b bVar2 = hVar.h;
            if (bVar2 == null) {
                bVar2 = this.d;
            }
            Bitmap bitmap = this.h;
            Canvas canvas = this.f2482c;
            if (bitmap == null || bVar2.f2450a + 1 != bitmap.getWidth() || bVar2.f2451b + 1 != this.h.getHeight()) {
                Bitmap createBitmap = Bitmap.createBitmap(bVar2.f2450a + 1, bVar2.f2451b + 1, Bitmap.Config.ARGB_8888);
                this.h = createBitmap;
                canvas.setBitmap(createBitmap);
            }
            ArrayList arrayList2 = new ArrayList();
            SparseArray sparseArray5 = (SparseArray) dVar4.d;
            int i47 = 0;
            while (i47 < sparseArray5.size()) {
                canvas.save();
                e eVar = (e) sparseArray5.valueAt(i47);
                f fVar4 = (f) hVar.f2473c.get(sparseArray5.keyAt(i47));
                int i48 = eVar.f2460a + bVar2.f2452c;
                int i49 = eVar.f2461b + bVar2.e;
                int i50 = fVar4.f2464c;
                int i51 = fVar4.f2465f;
                int i52 = fVar4.d;
                boolean z11 = z10;
                int i53 = i48 + i50;
                int i54 = i49 + i52;
                SparseArray sparseArray6 = sparseArray5;
                canvas.clipRect(i48, i49, Math.min(i53, bVar2.d), Math.min(i54, bVar2.f2453f));
                a aVar2 = (a) hVar.d.get(i51);
                if (aVar2 == null && (aVar2 = (a) hVar.f2474f.get(i51)) == null) {
                    aVar2 = this.e;
                }
                SparseArray sparseArray7 = fVar4.f2468j;
                int i55 = i47;
                int i56 = 0;
                while (i56 < sparseArray7.size()) {
                    int keyAt = sparseArray7.keyAt(i56);
                    SparseArray sparseArray8 = sparseArray7;
                    g gVar2 = (g) sparseArray7.valueAt(i56);
                    int i57 = i49;
                    c cVar = (c) hVar.e.get(keyAt);
                    if (cVar == null) {
                        cVar = (c) hVar.f2475g.get(keyAt);
                    }
                    c cVar2 = cVar;
                    if (cVar2 != null) {
                        if (cVar2.f2455b) {
                            paint = null;
                        } else {
                            paint = this.f2480a;
                        }
                        int i58 = i48;
                        int i59 = fVar4.e;
                        hVar2 = hVar;
                        int i60 = i58 + gVar2.f2469a;
                        int i61 = i57 + gVar2.f2470b;
                        if (i59 == 3) {
                            iArr = aVar2.d;
                        } else if (i59 == 2) {
                            iArr = aVar2.f2449c;
                        } else {
                            iArr = aVar2.f2448b;
                        }
                        int i62 = i52;
                        Paint paint2 = paint;
                        bVar = bVar2;
                        i15 = i50;
                        i14 = i58;
                        arrayList = arrayList2;
                        i13 = i57;
                        f fVar5 = fVar4;
                        int[] iArr2 = iArr;
                        fVar = fVar5;
                        i16 = i56;
                        i17 = i62;
                        e(cVar2.f2456c, iArr2, i59, i60, i61, paint2, canvas);
                        e(cVar2.d, iArr2, i59, i60, i61 + 1, paint2, canvas);
                    } else {
                        arrayList = arrayList2;
                        i13 = i57;
                        bVar = bVar2;
                        hVar2 = hVar;
                        fVar = fVar4;
                        i14 = i48;
                        i15 = i50;
                        i16 = i56;
                        i17 = i52;
                    }
                    i56 = i16 + 1;
                    i50 = i15;
                    i49 = i13;
                    fVar4 = fVar;
                    i48 = i14;
                    arrayList2 = arrayList;
                    sparseArray7 = sparseArray8;
                    bVar2 = bVar;
                    hVar = hVar2;
                    i52 = i17;
                }
                b bVar3 = bVar2;
                ArrayList arrayList3 = arrayList2;
                h hVar3 = hVar;
                int i63 = i49;
                f fVar6 = fVar4;
                int i64 = i48;
                int i65 = i50;
                int i66 = i52;
                if (fVar6.f2463b) {
                    int i67 = fVar6.e;
                    if (i67 == 3) {
                        i12 = aVar2.d[fVar6.f2466g];
                        c12 = 2;
                    } else {
                        c12 = 2;
                        if (i67 == 2) {
                            i12 = aVar2.f2449c[fVar6.h];
                        } else {
                            i12 = aVar2.f2448b[fVar6.f2467i];
                        }
                    }
                    Paint paint3 = this.f2481b;
                    paint3.setColor(i12);
                    c10 = c12;
                    c11 = 3;
                    canvas.drawRect(i64, i63, i53, i54, paint3);
                } else {
                    c10 = 2;
                    c11 = 3;
                }
                Bitmap createBitmap2 = Bitmap.createBitmap(this.h, i64, i63, i65, i66);
                float f11 = bVar3.f2450a;
                float f12 = bVar3.f2451b;
                arrayList3.add(new d2.b(null, null, null, createBitmap2, i63 / f12, 0, 0, i64 / f11, 0, Integer.MIN_VALUE, -3.4028235E38f, i65 / f11, i66 / f12, false, -16777216, Integer.MIN_VALUE, 0.0f, 0));
                canvas.drawColor(0, PorterDuff.Mode.CLEAR);
                canvas.restore();
                i47 = i55 + 1;
                z10 = z11;
                bVar2 = bVar3;
                arrayList2 = arrayList3;
                hVar = hVar3;
                sparseArray5 = sparseArray6;
            }
            aVar = new z3.a(-9223372036854775807L, -9223372036854775807L, arrayList2);
        }
        jVar.accept(aVar);
    }
}
