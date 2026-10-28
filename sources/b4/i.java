package b4;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.util.SparseArray;
import e2.j;
import e2.n0;
import e2.x;
import f9.g0;
import f9.i0;
import f9.s1;
import java.util.ArrayList;
import java.util.List;
import org.telegram.ui.Components.b10;
import z3.l;
import z3.m;
public final class i implements m {
    public static final byte[] f3639n = {0, 7, 8, 15};
    public static final byte[] f3640r = {0, 119, -120, -1};
    public static final byte[] f3641s = {0, 17, 34, 51, 68, 85, 102, 119, -120, -103, -86, -69, -52, -35, -18, -1};
    public final Paint f3642a;
    public final Paint f3643b;
    public final Canvas f3644c;
    public final b d;
    public final a e;
    public final h f3645f;
    public Bitmap h;

    public i(List list) {
        x xVar = new x((byte[]) list.get(0));
        int H = xVar.H();
        int H2 = xVar.H();
        Paint paint = new Paint();
        this.f3642a = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        paint.setPathEffect(null);
        Paint paint2 = new Paint();
        this.f3643b = paint2;
        paint2.setStyle(Paint.Style.FILL);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
        paint2.setPathEffect(null);
        this.f3644c = new Canvas();
        this.d = new b(719, 575, 0, 719, 0, 575);
        this.e = new a(0, new int[]{0, -1, -16777216, -8421505}, b(), c());
        this.f3645f = new h(H, H2);
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
        int g7;
        int i11;
        int g10;
        int g11;
        int i12;
        int i13 = 8;
        int g12 = gVar.g(8);
        gVar.o(8);
        int i14 = 2;
        int i15 = i10 - 2;
        int i16 = 0;
        int[] iArr2 = {0, -1, -16777216, -8421505};
        int[] b10 = b();
        int[] c10 = c();
        while (i15 > 0) {
            int g13 = gVar.g(i13);
            int g14 = gVar.g(i13);
            if ((g14 & 128) != 0) {
                iArr = iArr2;
            } else if ((g14 & 64) != 0) {
                iArr = b10;
            } else {
                iArr = c10;
            }
            if ((g14 & 1) != 0) {
                g11 = gVar.g(i13);
                i12 = gVar.g(i13);
                g7 = gVar.g(i13);
                g10 = gVar.g(i13);
                i11 = i15 - 6;
            } else {
                int g15 = gVar.g(4) << 4;
                g7 = gVar.g(4) << 4;
                i11 = i15 - 4;
                g10 = gVar.g(i14) << 6;
                g11 = gVar.g(6) << i14;
                i12 = g15;
            }
            if (g11 == 0) {
                i12 = i16;
                g7 = i12;
                g10 = 255;
            }
            double d = g11;
            double d10 = i12 - 128;
            double d11 = g7 - 128;
            iArr[g13] = d((byte) (255 - (g10 & 255)), n0.i((int) ((1.402d * d10) + d), 0, 255), n0.i((int) ((d - (0.34414d * d11)) - (d10 * 0.71414d)), 0, 255), n0.i((int) ((d11 * 1.772d) + d), 0, 255));
            i15 = i11;
            i16 = 0;
            g12 = g12;
            c10 = c10;
            i13 = 8;
            i14 = 2;
        }
        return new a(g12, iArr2, b10, c10);
    }

    public static c g(a4.g gVar) {
        byte[] bArr;
        int g7 = gVar.g(16);
        gVar.o(4);
        int g10 = gVar.g(2);
        boolean f7 = gVar.f();
        gVar.o(1);
        byte[] bArr2 = n0.f9692b;
        if (g10 == 1) {
            gVar.o(gVar.g(8) * 16);
        } else if (g10 == 0) {
            int g11 = gVar.g(16);
            int g12 = gVar.g(16);
            if (g11 > 0) {
                bArr2 = new byte[g11];
                gVar.j(g11, bArr2);
            }
            if (g12 > 0) {
                bArr = new byte[g12];
                gVar.j(g12, bArr);
                return new c(bArr2, bArr, f7, g7);
            }
        }
        bArr = bArr2;
        return new c(bArr2, bArr, f7, g7);
    }

    @Override
    public final void G(byte[] bArr, int i10, int i11, l lVar, j jVar) {
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
            hVar = this.f3645f;
            z10 = true;
            if (b10 >= 48 && gVar.g(8) == 15) {
                int g7 = gVar.g(8);
                int g10 = gVar.g(16);
                int g11 = gVar.g(16);
                int d = gVar.d() + g11;
                if (g11 * 8 > gVar.b()) {
                    e2.a.l("DvbParser", "Data field length exceeds limit");
                    gVar.o(gVar.b());
                } else {
                    switch (g7) {
                        case 16:
                            if (g10 == hVar.f3633a) {
                                d dVar = hVar.f3638i;
                                gVar.g(8);
                                int g12 = gVar.g(4);
                                int g13 = gVar.g(2);
                                gVar.o(2);
                                int i22 = g11 - 2;
                                SparseArray sparseArray = new SparseArray();
                                while (i22 > 0) {
                                    int g14 = gVar.g(8);
                                    gVar.o(8);
                                    i22 -= 6;
                                    sparseArray.put(g14, new e(gVar.g(16), gVar.g(16)));
                                }
                                d dVar2 = new d(g12, g13, sparseArray);
                                if (g13 != 0) {
                                    hVar.f3638i = dVar2;
                                    hVar.f3635c.clear();
                                    hVar.d.clear();
                                    hVar.e.clear();
                                    break;
                                } else if (dVar != null && dVar.f3619a != g12) {
                                    hVar.f3638i = dVar2;
                                    break;
                                }
                            }
                            break;
                        case 17:
                            d dVar3 = hVar.f3638i;
                            SparseArray sparseArray2 = hVar.f3635c;
                            if (g10 == hVar.f3633a && dVar3 != null) {
                                int g15 = gVar.g(8);
                                gVar.o(4);
                                boolean f7 = gVar.f();
                                gVar.o(3);
                                int g16 = gVar.g(16);
                                int g17 = gVar.g(16);
                                gVar.g(3);
                                int g18 = gVar.g(3);
                                gVar.o(2);
                                int g19 = gVar.g(8);
                                int g20 = gVar.g(8);
                                int g21 = gVar.g(4);
                                int g22 = gVar.g(2);
                                gVar.o(2);
                                int i23 = g11 - 10;
                                SparseArray sparseArray3 = new SparseArray();
                                while (i23 > 0) {
                                    int g23 = gVar.g(16);
                                    int g24 = gVar.g(2);
                                    gVar.g(2);
                                    int g25 = gVar.g(12);
                                    gVar.o(4);
                                    int g26 = gVar.g(12);
                                    int i24 = i23 - 6;
                                    if (g24 != 1 && g24 != 2) {
                                        i23 = i24;
                                    } else {
                                        gVar.g(8);
                                        gVar.g(8);
                                        i23 -= 8;
                                    }
                                    sparseArray3.put(g23, new g(g25, g26));
                                }
                                f fVar3 = new f(g15, f7, g16, g17, g18, g19, g20, g21, g22, sparseArray3);
                                if (dVar3.f3620b == 0 && (fVar2 = (f) sparseArray2.get(g15)) != null) {
                                    SparseArray sparseArray4 = fVar2.f3630j;
                                    for (int i25 = 0; i25 < sparseArray4.size(); i25++) {
                                        fVar3.f3630j.put(sparseArray4.keyAt(i25), (g) sparseArray4.valueAt(i25));
                                    }
                                }
                                sparseArray2.put(fVar3.f3624a, fVar3);
                                break;
                            }
                            break;
                        case 18:
                            if (g10 == hVar.f3633a) {
                                a f10 = f(gVar, g11);
                                hVar.d.put(f10.f3609a, f10);
                                break;
                            } else if (g10 == hVar.f3634b) {
                                a f11 = f(gVar, g11);
                                hVar.f3636f.put(f11.f3609a, f11);
                                break;
                            }
                            break;
                        case 19:
                            if (g10 == hVar.f3633a) {
                                c g27 = g(gVar);
                                hVar.e.put(g27.f3616a, g27);
                                break;
                            } else if (g10 == hVar.f3634b) {
                                c g28 = g(gVar);
                                hVar.f3637g.put(g28.f3616a, g28);
                                break;
                            }
                            break;
                        case 20:
                            if (g10 == hVar.f3633a) {
                                gVar.o(4);
                                boolean f12 = gVar.f();
                                gVar.o(3);
                                int g29 = gVar.g(16);
                                int g30 = gVar.g(16);
                                if (f12) {
                                    int g31 = gVar.g(16);
                                    i18 = gVar.g(16);
                                    i21 = gVar.g(16);
                                    i19 = gVar.g(16);
                                    i20 = g31;
                                } else {
                                    i18 = g29;
                                    i19 = g30;
                                    i20 = 0;
                                    i21 = 0;
                                }
                                hVar.h = new b(g29, g30, i20, i18, i21, i19);
                                break;
                            }
                            break;
                    }
                    gVar.p(d - gVar.d());
                }
            }
        }
        d dVar4 = hVar.f3638i;
        if (dVar4 == null) {
            g0 g0Var = i0.f10286b;
            aVar = new z3.a(-9223372036854775807L, -9223372036854775807L, s1.e);
        } else {
            b bVar2 = hVar.h;
            if (bVar2 == null) {
                bVar2 = this.d;
            }
            Bitmap bitmap = this.h;
            Canvas canvas = this.f3644c;
            if (bitmap == null || bVar2.f3612a + 1 != bitmap.getWidth() || bVar2.f3613b + 1 != this.h.getHeight()) {
                Bitmap createBitmap = Bitmap.createBitmap(bVar2.f3612a + 1, bVar2.f3613b + 1, Bitmap.Config.ARGB_8888);
                this.h = createBitmap;
                canvas.setBitmap(createBitmap);
            }
            ArrayList arrayList2 = new ArrayList();
            SparseArray sparseArray5 = (SparseArray) dVar4.f3621c;
            int i26 = 0;
            while (i26 < sparseArray5.size()) {
                canvas.save();
                e eVar = (e) sparseArray5.valueAt(i26);
                f fVar4 = (f) hVar.f3635c.get(sparseArray5.keyAt(i26));
                int i27 = eVar.f3622a + bVar2.f3614c;
                int i28 = eVar.f3623b + bVar2.e;
                int i29 = fVar4.f3626c;
                int i30 = fVar4.f3627f;
                int i31 = fVar4.d;
                boolean z11 = z10;
                int i32 = i27 + i29;
                int i33 = i28 + i31;
                SparseArray sparseArray6 = sparseArray5;
                canvas.clipRect(i27, i28, Math.min(i32, bVar2.d), Math.min(i33, bVar2.f3615f));
                a aVar2 = (a) hVar.d.get(i30);
                if (aVar2 == null && (aVar2 = (a) hVar.f3636f.get(i30)) == null) {
                    aVar2 = this.e;
                }
                SparseArray sparseArray7 = fVar4.f3630j;
                int i34 = i26;
                int i35 = 0;
                while (i35 < sparseArray7.size()) {
                    int keyAt = sparseArray7.keyAt(i35);
                    SparseArray sparseArray8 = sparseArray7;
                    g gVar2 = (g) sparseArray7.valueAt(i35);
                    int i36 = i28;
                    c cVar = (c) hVar.e.get(keyAt);
                    if (cVar == null) {
                        cVar = (c) hVar.f3637g.get(keyAt);
                    }
                    c cVar2 = cVar;
                    if (cVar2 != null) {
                        if (cVar2.f3617b) {
                            paint = null;
                        } else {
                            paint = this.f3642a;
                        }
                        int i37 = i27;
                        int i38 = fVar4.e;
                        hVar2 = hVar;
                        int i39 = i37 + gVar2.f3631a;
                        int i40 = i36 + gVar2.f3632b;
                        if (i38 == 3) {
                            iArr = aVar2.d;
                        } else if (i38 == 2) {
                            iArr = aVar2.f3611c;
                        } else {
                            iArr = aVar2.f3610b;
                        }
                        int i41 = i31;
                        Paint paint2 = paint;
                        bVar = bVar2;
                        i15 = i29;
                        i14 = i37;
                        arrayList = arrayList2;
                        i13 = i36;
                        f fVar5 = fVar4;
                        int[] iArr2 = iArr;
                        fVar = fVar5;
                        i16 = i35;
                        i17 = i41;
                        e(cVar2.f3618c, iArr2, i38, i39, i40, paint2, canvas);
                        e(cVar2.d, iArr2, i38, i39, i40 + 1, paint2, canvas);
                    } else {
                        arrayList = arrayList2;
                        i13 = i36;
                        bVar = bVar2;
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
                    bVar2 = bVar;
                    hVar = hVar2;
                    i31 = i17;
                }
                b bVar3 = bVar2;
                ArrayList arrayList3 = arrayList2;
                h hVar3 = hVar;
                int i42 = i28;
                f fVar6 = fVar4;
                int i43 = i27;
                int i44 = i29;
                int i45 = i31;
                if (fVar6.f3625b) {
                    int i46 = fVar6.e;
                    if (i46 == 3) {
                        i12 = aVar2.d[fVar6.f3628g];
                        c12 = 2;
                    } else {
                        c12 = 2;
                        if (i46 == 2) {
                            i12 = aVar2.f3611c[fVar6.h];
                        } else {
                            i12 = aVar2.f3610b[fVar6.f3629i];
                        }
                    }
                    Paint paint3 = this.f3643b;
                    paint3.setColor(i12);
                    c10 = c12;
                    c11 = 3;
                    canvas.drawRect(i43, i42, i32, i33, paint3);
                } else {
                    c10 = 2;
                    c11 = 3;
                }
                Bitmap createBitmap2 = Bitmap.createBitmap(this.h, i43, i42, i44, i45);
                float f13 = bVar3.f3612a;
                float f14 = bVar3.f3613b;
                arrayList3.add(new d2.b(null, null, null, createBitmap2, i42 / f14, 0, 0, i43 / f13, 0, Integer.MIN_VALUE, -3.4028235E38f, i44 / f13, i45 / f14, false, -16777216, Integer.MIN_VALUE, 0.0f, 0));
                canvas.drawColor(0, PorterDuff.Mode.CLEAR);
                canvas.restore();
                i26 = i34 + 1;
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
    public final z3.d j(int i10, int i11, byte[] bArr) {
        return b10.a(this, bArr, i11);
    }

    @Override
    public final void reset() {
        h hVar = this.f3645f;
        hVar.f3635c.clear();
        hVar.d.clear();
        hVar.e.clear();
        hVar.f3636f.clear();
        hVar.f3637g.clear();
        hVar.h = null;
        hVar.f3638i = null;
    }

    @Override
    public final int y() {
        return 2;
    }
}
