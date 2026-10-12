package b4;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.util.SparseArray;
import e2.j;
import e2.m0;
import e2.x;
import e9.l0;
import e9.n0;
import e9.x1;
import java.util.ArrayList;
import java.util.List;
import z3.m;
import z3.n;
public final class i implements n {
    public static final byte[] f2572n = {0, 7, 8, 15};
    public static final byte[] f2573r = {0, 119, -120, -1};
    public static final byte[] f2574s = {0, 17, 34, 51, 68, 85, 102, 119, -120, -103, -86, -69, -52, -35, -18, -1};
    public final Paint f2575a;
    public final Paint f2576b;
    public final Canvas f2577c;
    public final b d;
    public final a e;
    public final h f2578f;
    public Bitmap h;

    public i(List list) {
        x xVar = new x((byte[]) list.get(0));
        int H = xVar.H();
        int H2 = xVar.H();
        Paint paint = new Paint();
        this.f2575a = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        paint.setPathEffect(null);
        Paint paint2 = new Paint();
        this.f2576b = paint2;
        paint2.setStyle(Paint.Style.FILL);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
        paint2.setPathEffect(null);
        this.f2577c = new Canvas();
        this.d = new b(719, 575, 0, 719, 0, 575);
        this.e = new a(0, new int[]{0, -1, -16777216, -8421505}, b(), c());
        this.f2578f = new h(H, H2);
    }

    public static byte[] a(int i10, int i11, a4.g gVar) {
        byte[] bArr = new byte[i10];
        for (int i12 = 0; i12 < i10; i12++) {
            bArr[i12] = (byte) gVar.g(i11);
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
        int g10;
        int i11;
        int g11;
        int g12;
        int i12;
        int i13 = 8;
        int g13 = gVar.g(8);
        gVar.o(8);
        int i14 = 2;
        int i15 = i10 - 2;
        int i16 = 0;
        int[] iArr2 = {0, -1, -16777216, -8421505};
        int[] b10 = b();
        int[] c10 = c();
        while (i15 > 0) {
            int g14 = gVar.g(i13);
            int g15 = gVar.g(i13);
            if ((g15 & 128) != 0) {
                iArr = iArr2;
            } else if ((g15 & 64) != 0) {
                iArr = b10;
            } else {
                iArr = c10;
            }
            if ((g15 & 1) != 0) {
                g12 = gVar.g(i13);
                i12 = gVar.g(i13);
                g10 = gVar.g(i13);
                g11 = gVar.g(i13);
                i11 = i15 - 6;
            } else {
                int g16 = gVar.g(4) << 4;
                g10 = gVar.g(4) << 4;
                i11 = i15 - 4;
                g11 = gVar.g(i14) << 6;
                g12 = gVar.g(6) << i14;
                i12 = g16;
            }
            if (g12 == 0) {
                i12 = i16;
                g10 = i12;
                g11 = 255;
            }
            double d = g12;
            double d10 = i12 - 128;
            double d11 = g10 - 128;
            iArr[g14] = d((byte) (255 - (g11 & 255)), m0.i((int) ((1.402d * d10) + d), 0, 255), m0.i((int) ((d - (0.34414d * d11)) - (d10 * 0.71414d)), 0, 255), m0.i((int) ((d11 * 1.772d) + d), 0, 255));
            i15 = i11;
            i16 = 0;
            g13 = g13;
            c10 = c10;
            i13 = 8;
            i14 = 2;
        }
        return new a(g13, iArr2, b10, c10);
    }

    public static c g(a4.g gVar) {
        byte[] bArr;
        int g10 = gVar.g(16);
        gVar.o(4);
        int g11 = gVar.g(2);
        boolean f7 = gVar.f();
        gVar.o(1);
        byte[] bArr2 = m0.f8373b;
        if (g11 == 1) {
            gVar.o(gVar.g(8) * 16);
        } else if (g11 == 0) {
            int g12 = gVar.g(16);
            int g13 = gVar.g(16);
            if (g12 > 0) {
                bArr2 = new byte[g12];
                gVar.j(g12, bArr2);
            }
            if (g13 > 0) {
                bArr = new byte[g13];
                gVar.j(g13, bArr);
                return new c(bArr2, bArr, f7, g10);
            }
        }
        bArr = bArr2;
        return new c(bArr2, bArr, f7, g10);
    }

    @Override
    public final int h0() {
        return 2;
    }

    @Override
    public final void reset() {
        h hVar = this.f2578f;
        hVar.f2568c.clear();
        hVar.d.clear();
        hVar.e.clear();
        hVar.f2569f.clear();
        hVar.f2570g.clear();
        hVar.h = null;
        hVar.f2571i = null;
    }

    @Override
    public final void u0(byte[] bArr, int i10, int i11, m mVar, j jVar) {
        h hVar;
        boolean z10;
        z3.b bVar;
        char c10;
        char c11;
        char c12;
        int i12;
        ArrayList arrayList;
        int i13;
        b bVar2;
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
        gVar.m(i10);
        while (true) {
            int b10 = gVar.b();
            hVar = this.f2578f;
            z10 = true;
            if (b10 >= 48 && gVar.g(8) == 15) {
                int g10 = gVar.g(8);
                int g11 = gVar.g(16);
                int g12 = gVar.g(16);
                int d = gVar.d() + g12;
                if (g12 * 8 > gVar.b()) {
                    e2.a.l("DvbParser", "Data field length exceeds limit");
                    gVar.o(gVar.b());
                } else {
                    switch (g10) {
                        case 16:
                            if (g11 == hVar.f2566a) {
                                d dVar = hVar.f2571i;
                                gVar.g(8);
                                int g13 = gVar.g(4);
                                int g14 = gVar.g(2);
                                gVar.o(2);
                                int i22 = g12 - 2;
                                SparseArray sparseArray = new SparseArray();
                                while (i22 > 0) {
                                    int g15 = gVar.g(8);
                                    gVar.o(8);
                                    i22 -= 6;
                                    sparseArray.put(g15, new e(gVar.g(16), gVar.g(16)));
                                }
                                d dVar2 = new d(g13, g14, sparseArray);
                                if (g14 != 0) {
                                    hVar.f2571i = dVar2;
                                    hVar.f2568c.clear();
                                    hVar.d.clear();
                                    hVar.e.clear();
                                    break;
                                } else if (dVar != null && dVar.f2552a != g13) {
                                    hVar.f2571i = dVar2;
                                    break;
                                }
                            }
                            break;
                        case 17:
                            d dVar3 = hVar.f2571i;
                            SparseArray sparseArray2 = hVar.f2568c;
                            if (g11 == hVar.f2566a && dVar3 != null) {
                                int g16 = gVar.g(8);
                                gVar.o(4);
                                boolean f7 = gVar.f();
                                gVar.o(3);
                                int g17 = gVar.g(16);
                                int g18 = gVar.g(16);
                                gVar.g(3);
                                int g19 = gVar.g(3);
                                gVar.o(2);
                                int g20 = gVar.g(8);
                                int g21 = gVar.g(8);
                                int g22 = gVar.g(4);
                                int g23 = gVar.g(2);
                                gVar.o(2);
                                int i23 = g12 - 10;
                                SparseArray sparseArray3 = new SparseArray();
                                while (i23 > 0) {
                                    int g24 = gVar.g(16);
                                    int g25 = gVar.g(2);
                                    gVar.g(2);
                                    int g26 = gVar.g(12);
                                    gVar.o(4);
                                    int g27 = gVar.g(12);
                                    int i24 = i23 - 6;
                                    if (g25 != 1 && g25 != 2) {
                                        i23 = i24;
                                    } else {
                                        gVar.g(8);
                                        gVar.g(8);
                                        i23 -= 8;
                                    }
                                    sparseArray3.put(g24, new g(g26, g27));
                                }
                                f fVar3 = new f(g16, f7, g17, g18, g19, g20, g21, g22, g23, sparseArray3);
                                if (dVar3.f2553b == 0 && (fVar2 = (f) sparseArray2.get(g16)) != null) {
                                    SparseArray sparseArray4 = fVar2.f2563j;
                                    for (int i25 = 0; i25 < sparseArray4.size(); i25++) {
                                        fVar3.f2563j.put(sparseArray4.keyAt(i25), (g) sparseArray4.valueAt(i25));
                                    }
                                }
                                sparseArray2.put(fVar3.f2557a, fVar3);
                                break;
                            }
                            break;
                        case 18:
                            if (g11 == hVar.f2566a) {
                                a f10 = f(gVar, g12);
                                hVar.d.put(f10.f2542a, f10);
                                break;
                            } else if (g11 == hVar.f2567b) {
                                a f11 = f(gVar, g12);
                                hVar.f2569f.put(f11.f2542a, f11);
                                break;
                            }
                            break;
                        case 19:
                            if (g11 == hVar.f2566a) {
                                c g28 = g(gVar);
                                hVar.e.put(g28.f2549a, g28);
                                break;
                            } else if (g11 == hVar.f2567b) {
                                c g29 = g(gVar);
                                hVar.f2570g.put(g29.f2549a, g29);
                                break;
                            }
                            break;
                        case 20:
                            if (g11 == hVar.f2566a) {
                                gVar.o(4);
                                boolean f12 = gVar.f();
                                gVar.o(3);
                                int g30 = gVar.g(16);
                                int g31 = gVar.g(16);
                                if (f12) {
                                    int g32 = gVar.g(16);
                                    i18 = gVar.g(16);
                                    i21 = gVar.g(16);
                                    i19 = gVar.g(16);
                                    i20 = g32;
                                } else {
                                    i18 = g30;
                                    i19 = g31;
                                    i20 = 0;
                                    i21 = 0;
                                }
                                hVar.h = new b(g30, g31, i20, i18, i21, i19);
                                break;
                            }
                            break;
                    }
                    gVar.p(d - gVar.d());
                }
            }
        }
        d dVar4 = hVar.f2571i;
        if (dVar4 == null) {
            l0 l0Var = n0.f8592b;
            bVar = new z3.b(-9223372036854775807L, -9223372036854775807L, x1.e);
        } else {
            b bVar3 = hVar.h;
            if (bVar3 == null) {
                bVar3 = this.d;
            }
            Bitmap bitmap = this.h;
            Canvas canvas = this.f2577c;
            if (bitmap == null || bVar3.f2545a + 1 != bitmap.getWidth() || bVar3.f2546b + 1 != this.h.getHeight()) {
                Bitmap createBitmap = Bitmap.createBitmap(bVar3.f2545a + 1, bVar3.f2546b + 1, Bitmap.Config.ARGB_8888);
                this.h = createBitmap;
                canvas.setBitmap(createBitmap);
            }
            ArrayList arrayList2 = new ArrayList();
            SparseArray sparseArray5 = (SparseArray) dVar4.f2554c;
            int i26 = 0;
            while (i26 < sparseArray5.size()) {
                canvas.save();
                e eVar = (e) sparseArray5.valueAt(i26);
                f fVar4 = (f) hVar.f2568c.get(sparseArray5.keyAt(i26));
                int i27 = eVar.f2555a + bVar3.f2547c;
                int i28 = eVar.f2556b + bVar3.e;
                int i29 = fVar4.f2559c;
                int i30 = fVar4.f2560f;
                int i31 = fVar4.d;
                boolean z11 = z10;
                int i32 = i27 + i29;
                int i33 = i28 + i31;
                SparseArray sparseArray6 = sparseArray5;
                canvas.clipRect(i27, i28, Math.min(i32, bVar3.d), Math.min(i33, bVar3.f2548f));
                a aVar = (a) hVar.d.get(i30);
                if (aVar == null && (aVar = (a) hVar.f2569f.get(i30)) == null) {
                    aVar = this.e;
                }
                SparseArray sparseArray7 = fVar4.f2563j;
                int i34 = i26;
                int i35 = 0;
                while (i35 < sparseArray7.size()) {
                    int keyAt = sparseArray7.keyAt(i35);
                    SparseArray sparseArray8 = sparseArray7;
                    g gVar2 = (g) sparseArray7.valueAt(i35);
                    int i36 = i28;
                    c cVar = (c) hVar.e.get(keyAt);
                    if (cVar == null) {
                        cVar = (c) hVar.f2570g.get(keyAt);
                    }
                    c cVar2 = cVar;
                    if (cVar2 != null) {
                        if (cVar2.f2550b) {
                            paint = null;
                        } else {
                            paint = this.f2575a;
                        }
                        int i37 = i27;
                        int i38 = fVar4.e;
                        hVar2 = hVar;
                        int i39 = i37 + gVar2.f2564a;
                        int i40 = i36 + gVar2.f2565b;
                        if (i38 == 3) {
                            iArr = aVar.d;
                        } else if (i38 == 2) {
                            iArr = aVar.f2544c;
                        } else {
                            iArr = aVar.f2543b;
                        }
                        int i41 = i31;
                        Paint paint2 = paint;
                        bVar2 = bVar3;
                        i15 = i29;
                        i14 = i37;
                        arrayList = arrayList2;
                        i13 = i36;
                        f fVar5 = fVar4;
                        int[] iArr2 = iArr;
                        fVar = fVar5;
                        i16 = i35;
                        i17 = i41;
                        e(cVar2.f2551c, iArr2, i38, i39, i40, paint2, canvas);
                        e(cVar2.d, iArr2, i38, i39, i40 + 1, paint2, canvas);
                    } else {
                        arrayList = arrayList2;
                        i13 = i36;
                        bVar2 = bVar3;
                        hVar2 = hVar;
                        fVar = fVar4;
                        i14 = i27;
                        i15 = i29;
                        i16 = i35;
                        i17 = i31;
                    }
                    i35 = i16 + 1;
                    i29 = i15;
                    i28 = i13;
                    fVar4 = fVar;
                    i27 = i14;
                    arrayList2 = arrayList;
                    sparseArray7 = sparseArray8;
                    bVar3 = bVar2;
                    hVar = hVar2;
                    i31 = i17;
                }
                b bVar4 = bVar3;
                ArrayList arrayList3 = arrayList2;
                h hVar3 = hVar;
                int i42 = i28;
                f fVar6 = fVar4;
                int i43 = i27;
                int i44 = i29;
                int i45 = i31;
                if (fVar6.f2558b) {
                    int i46 = fVar6.e;
                    if (i46 == 3) {
                        i12 = aVar.d[fVar6.f2561g];
                        c12 = 2;
                    } else {
                        c12 = 2;
                        if (i46 == 2) {
                            i12 = aVar.f2544c[fVar6.h];
                        } else {
                            i12 = aVar.f2543b[fVar6.f2562i];
                        }
                    }
                    Paint paint3 = this.f2576b;
                    paint3.setColor(i12);
                    c10 = c12;
                    c11 = 3;
                    canvas.drawRect(i43, i42, i32, i33, paint3);
                } else {
                    c10 = 2;
                    c11 = 3;
                }
                Bitmap createBitmap2 = Bitmap.createBitmap(this.h, i43, i42, i44, i45);
                float f13 = bVar4.f2545a;
                float f14 = bVar4.f2546b;
                arrayList3.add(new d2.b(null, null, null, createBitmap2, i42 / f14, 0, 0, i43 / f13, 0, Integer.MIN_VALUE, -3.4028235E38f, i44 / f13, i45 / f14, false, -16777216, Integer.MIN_VALUE, 0.0f, 0));
                canvas.drawColor(0, PorterDuff.Mode.CLEAR);
                canvas.restore();
                i26 = i34 + 1;
                z10 = z11;
                bVar3 = bVar4;
                arrayList2 = arrayList3;
                hVar = hVar3;
                sparseArray5 = sparseArray6;
            }
            bVar = new z3.b(-9223372036854775807L, -9223372036854775807L, arrayList2);
        }
        jVar.accept(bVar);
    }

    @Override
    public final z3.e w(int i10, int i11, byte[] bArr) {
        return t8.b.a(this, bArr, i11);
    }
}
