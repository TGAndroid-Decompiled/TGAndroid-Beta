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
import z3.l;
import z3.m;
public final class i implements m {
    public static final byte[] f4188n = {0, 7, 8, 15};
    public static final byte[] f4189r = {0, 119, -120, -1};
    public static final byte[] f4190s = {0, 17, 34, 51, 68, 85, 102, 119, -120, -103, -86, -69, -52, -35, -18, -1};
    public final Paint f4191a;
    public final Paint f4192b;
    public final Canvas f4193c;
    public final b d;
    public final a e;
    public final h f4194f;
    public Bitmap h;

    public i(List list) {
        x xVar = new x((byte[]) list.get(0));
        int H = xVar.H();
        int H2 = xVar.H();
        Paint paint = new Paint();
        this.f4191a = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        paint.setPathEffect(null);
        Paint paint2 = new Paint();
        this.f4192b = paint2;
        paint2.setStyle(Paint.Style.FILL);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
        paint2.setPathEffect(null);
        this.f4193c = new Canvas();
        this.d = new b(719, 575, 0, 719, 0, 575);
        this.e = new a(0, new int[]{0, -1, -16777216, -8421505}, d(), e());
        this.f4194f = new h(H, H2);
    }

    public static byte[] b(int i10, int i11, a4.g gVar) {
        byte[] bArr = new byte[i10];
        for (int i12 = 0; i12 < i10; i12++) {
            bArr[i12] = (byte) gVar.g(i11);
        }
        return bArr;
    }

    public static int[] d() {
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
                iArr[i15] = f(255, i12, i13, i14);
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
                iArr[i15] = f(255, i10, i11, i16);
            }
        }
        return iArr;
    }

    public static int[] e() {
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
                iArr[i28] = f(63, i26, i27, i29);
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
                                iArr[i28] = f(255, i34, i35, i33 + i32);
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
                            iArr[i28] = f(255, i37, i39, i40 + i32);
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
                        iArr[i28] = f(127, i41, i42, i32 + i31);
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
                    iArr[i28] = f(255, i43, i44, i32 + i31);
                }
            }
        }
        return iArr;
    }

    public static int f(int i10, int i11, int i12, int i13) {
        return (i10 << 24) | (i11 << 16) | (i12 << 8) | i13;
    }

    public static void h(byte[] r21, int[] r22, int r23, int r24, int r25, android.graphics.Paint r26, android.graphics.Canvas r27) {
        throw new UnsupportedOperationException("Method not decompiled: b4.i.h(byte[], int[], int, int, int, android.graphics.Paint, android.graphics.Canvas):void");
    }

    public static a i(a4.g gVar, int i10) {
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
        int[] d = d();
        int[] e = e();
        while (i15 > 0) {
            int g14 = gVar.g(i13);
            int g15 = gVar.g(i13);
            if ((g15 & 128) != 0) {
                iArr = iArr2;
            } else if ((g15 & 64) != 0) {
                iArr = d;
            } else {
                iArr = e;
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
            double d10 = g12;
            double d11 = i12 - 128;
            double d12 = g10 - 128;
            iArr[g14] = f((byte) (255 - (g11 & 255)), m0.i((int) ((1.402d * d11) + d10), 0, 255), m0.i((int) ((d10 - (0.34414d * d12)) - (d11 * 0.71414d)), 0, 255), m0.i((int) ((d12 * 1.772d) + d10), 0, 255));
            i15 = i11;
            i16 = 0;
            g13 = g13;
            e = e;
            i13 = 8;
            i14 = 2;
        }
        return new a(g13, iArr2, d, e);
    }

    public static c j(a4.g gVar) {
        byte[] bArr;
        int g10 = gVar.g(16);
        gVar.o(4);
        int g11 = gVar.g(2);
        boolean f7 = gVar.f();
        gVar.o(1);
        byte[] bArr2 = m0.f8255b;
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
    public final z3.d a(int i10, int i11, byte[] bArr) {
        return r.c.a(this, bArr, i11);
    }

    @Override
    public final int c() {
        return 2;
    }

    @Override
    public final void g(byte[] bArr, int i10, int i11, l lVar, j jVar) {
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
        gVar.m(i10);
        while (true) {
            int b10 = gVar.b();
            hVar = this.f4194f;
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
                            if (g11 == hVar.f4182a) {
                                d dVar = hVar.f4187i;
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
                                    hVar.f4187i = dVar2;
                                    hVar.f4184c.clear();
                                    hVar.d.clear();
                                    hVar.e.clear();
                                    break;
                                } else if (dVar != null && dVar.f4168a != g13) {
                                    hVar.f4187i = dVar2;
                                    break;
                                }
                            }
                            break;
                        case 17:
                            d dVar3 = hVar.f4187i;
                            SparseArray sparseArray2 = hVar.f4184c;
                            if (g11 == hVar.f4182a && dVar3 != null) {
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
                                if (dVar3.f4169b == 0 && (fVar2 = (f) sparseArray2.get(g16)) != null) {
                                    SparseArray sparseArray4 = fVar2.f4179j;
                                    for (int i25 = 0; i25 < sparseArray4.size(); i25++) {
                                        fVar3.f4179j.put(sparseArray4.keyAt(i25), (g) sparseArray4.valueAt(i25));
                                    }
                                }
                                sparseArray2.put(fVar3.f4173a, fVar3);
                                break;
                            }
                            break;
                        case 18:
                            if (g11 == hVar.f4182a) {
                                a i26 = i(gVar, g12);
                                hVar.d.put(i26.f4158a, i26);
                                break;
                            } else if (g11 == hVar.f4183b) {
                                a i27 = i(gVar, g12);
                                hVar.f4185f.put(i27.f4158a, i27);
                                break;
                            }
                            break;
                        case 19:
                            if (g11 == hVar.f4182a) {
                                c j10 = j(gVar);
                                hVar.e.put(j10.f4165a, j10);
                                break;
                            } else if (g11 == hVar.f4183b) {
                                c j11 = j(gVar);
                                hVar.f4186g.put(j11.f4165a, j11);
                                break;
                            }
                            break;
                        case 20:
                            if (g11 == hVar.f4182a) {
                                gVar.o(4);
                                boolean f10 = gVar.f();
                                gVar.o(3);
                                int g28 = gVar.g(16);
                                int g29 = gVar.g(16);
                                if (f10) {
                                    int g30 = gVar.g(16);
                                    i18 = gVar.g(16);
                                    i21 = gVar.g(16);
                                    i19 = gVar.g(16);
                                    i20 = g30;
                                } else {
                                    i18 = g28;
                                    i19 = g29;
                                    i20 = 0;
                                    i21 = 0;
                                }
                                hVar.h = new b(g28, g29, i20, i18, i21, i19);
                                break;
                            }
                            break;
                    }
                    gVar.p(d - gVar.d());
                }
            }
        }
        d dVar4 = hVar.f4187i;
        if (dVar4 == null) {
            l0 l0Var = n0.f8476b;
            aVar = new z3.a(-9223372036854775807L, -9223372036854775807L, x1.e);
        } else {
            b bVar2 = hVar.h;
            if (bVar2 == null) {
                bVar2 = this.d;
            }
            Bitmap bitmap = this.h;
            Canvas canvas = this.f4193c;
            if (bitmap == null || bVar2.f4161a + 1 != bitmap.getWidth() || bVar2.f4162b + 1 != this.h.getHeight()) {
                Bitmap createBitmap = Bitmap.createBitmap(bVar2.f4161a + 1, bVar2.f4162b + 1, Bitmap.Config.ARGB_8888);
                this.h = createBitmap;
                canvas.setBitmap(createBitmap);
            }
            ArrayList arrayList2 = new ArrayList();
            SparseArray sparseArray5 = (SparseArray) dVar4.f4170c;
            int i28 = 0;
            while (i28 < sparseArray5.size()) {
                canvas.save();
                e eVar = (e) sparseArray5.valueAt(i28);
                f fVar4 = (f) hVar.f4184c.get(sparseArray5.keyAt(i28));
                int i29 = eVar.f4171a + bVar2.f4163c;
                int i30 = eVar.f4172b + bVar2.e;
                int i31 = fVar4.f4175c;
                int i32 = fVar4.f4176f;
                int i33 = fVar4.d;
                boolean z11 = z10;
                int i34 = i29 + i31;
                int i35 = i30 + i33;
                SparseArray sparseArray6 = sparseArray5;
                canvas.clipRect(i29, i30, Math.min(i34, bVar2.d), Math.min(i35, bVar2.f4164f));
                a aVar2 = (a) hVar.d.get(i32);
                if (aVar2 == null && (aVar2 = (a) hVar.f4185f.get(i32)) == null) {
                    aVar2 = this.e;
                }
                SparseArray sparseArray7 = fVar4.f4179j;
                int i36 = i28;
                int i37 = 0;
                while (i37 < sparseArray7.size()) {
                    int keyAt = sparseArray7.keyAt(i37);
                    SparseArray sparseArray8 = sparseArray7;
                    g gVar2 = (g) sparseArray7.valueAt(i37);
                    int i38 = i30;
                    c cVar = (c) hVar.e.get(keyAt);
                    if (cVar == null) {
                        cVar = (c) hVar.f4186g.get(keyAt);
                    }
                    c cVar2 = cVar;
                    if (cVar2 != null) {
                        if (cVar2.f4166b) {
                            paint = null;
                        } else {
                            paint = this.f4191a;
                        }
                        int i39 = i29;
                        int i40 = fVar4.e;
                        hVar2 = hVar;
                        int i41 = i39 + gVar2.f4180a;
                        int i42 = i38 + gVar2.f4181b;
                        if (i40 == 3) {
                            iArr = aVar2.d;
                        } else if (i40 == 2) {
                            iArr = aVar2.f4160c;
                        } else {
                            iArr = aVar2.f4159b;
                        }
                        int i43 = i33;
                        Paint paint2 = paint;
                        bVar = bVar2;
                        i15 = i31;
                        i14 = i39;
                        arrayList = arrayList2;
                        i13 = i38;
                        f fVar5 = fVar4;
                        int[] iArr2 = iArr;
                        fVar = fVar5;
                        i16 = i37;
                        i17 = i43;
                        h(cVar2.f4167c, iArr2, i40, i41, i42, paint2, canvas);
                        h(cVar2.d, iArr2, i40, i41, i42 + 1, paint2, canvas);
                    } else {
                        arrayList = arrayList2;
                        i13 = i38;
                        bVar = bVar2;
                        hVar2 = hVar;
                        fVar = fVar4;
                        i14 = i29;
                        i15 = i31;
                        i16 = i37;
                        i17 = i33;
                    }
                    i37 = i16 + 1;
                    i31 = i15;
                    i30 = i13;
                    fVar4 = fVar;
                    i29 = i14;
                    arrayList2 = arrayList;
                    sparseArray7 = sparseArray8;
                    bVar2 = bVar;
                    hVar = hVar2;
                    i33 = i17;
                }
                b bVar3 = bVar2;
                ArrayList arrayList3 = arrayList2;
                h hVar3 = hVar;
                int i44 = i30;
                f fVar6 = fVar4;
                int i45 = i29;
                int i46 = i31;
                int i47 = i33;
                if (fVar6.f4174b) {
                    int i48 = fVar6.e;
                    if (i48 == 3) {
                        i12 = aVar2.d[fVar6.f4177g];
                        c12 = 2;
                    } else {
                        c12 = 2;
                        if (i48 == 2) {
                            i12 = aVar2.f4160c[fVar6.h];
                        } else {
                            i12 = aVar2.f4159b[fVar6.f4178i];
                        }
                    }
                    Paint paint3 = this.f4192b;
                    paint3.setColor(i12);
                    c10 = c12;
                    c11 = 3;
                    canvas.drawRect(i45, i44, i34, i35, paint3);
                } else {
                    c10 = 2;
                    c11 = 3;
                }
                Bitmap createBitmap2 = Bitmap.createBitmap(this.h, i45, i44, i46, i47);
                float f11 = bVar3.f4161a;
                float f12 = bVar3.f4162b;
                arrayList3.add(new d2.b(null, null, null, createBitmap2, i44 / f12, 0, 0, i45 / f11, 0, Integer.MIN_VALUE, -3.4028235E38f, i46 / f11, i47 / f12, false, -16777216, Integer.MIN_VALUE, 0.0f, 0));
                canvas.drawColor(0, PorterDuff.Mode.CLEAR);
                canvas.restore();
                i28 = i36 + 1;
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

    @Override
    public final void reset() {
        h hVar = this.f4194f;
        hVar.f4184c.clear();
        hVar.d.clear();
        hVar.e.clear();
        hVar.f4185f.clear();
        hVar.f4186g.clear();
        hVar.h = null;
        hVar.f4187i = null;
    }
}
