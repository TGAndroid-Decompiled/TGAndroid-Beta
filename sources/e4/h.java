package e4;

import a8.p0;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.util.SparseArray;
import c4.l;
import c4.m;
import h2.j;
import h2.m0;
import h2.x;
import h9.g0;
import h9.i0;
import h9.t1;
import java.util.ArrayList;
import java.util.List;
public final class h implements m {
    public static final byte[] f10693n = {0, 7, 8, 15};
    public static final byte[] f10694r = {0, 119, -120, -1};
    public static final byte[] f10695s = {0, 17, 34, 51, 68, 85, 102, 119, -120, -103, -86, -69, -52, -35, -18, -1};
    public final Paint f10696a;
    public final Paint f10697b;
    public final Canvas f10698c;
    public final b d;
    public final a f10699e;
    public final g f10700f;
    public Bitmap h;

    public h(List list) {
        x xVar = new x((byte[]) list.get(0));
        int H = xVar.H();
        int H2 = xVar.H();
        Paint paint = new Paint();
        this.f10696a = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        paint.setPathEffect(null);
        Paint paint2 = new Paint();
        this.f10697b = paint2;
        paint2.setStyle(Paint.Style.FILL);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
        paint2.setPathEffect(null);
        this.f10698c = new Canvas();
        this.d = new b(719, 575, 0, 719, 0, 575);
        this.f10699e = new a(0, new int[]{0, -1, -16777216, -8421505}, b(), d());
        this.f10700f = new g(H, H2);
    }

    public static byte[] a(int i7, int i10, d4.f fVar) {
        byte[] bArr = new byte[i7];
        for (int i11 = 0; i11 < i7; i11++) {
            bArr[i11] = (byte) fVar.j(i10);
        }
        return bArr;
    }

    public static int[] b() {
        int i7;
        int i10;
        int i11;
        int i12;
        int i13;
        int[] iArr = new int[16];
        iArr[0] = 0;
        for (int i14 = 1; i14 < 16; i14++) {
            if (i14 < 8) {
                if ((i14 & 1) != 0) {
                    i11 = 255;
                } else {
                    i11 = 0;
                }
                if ((i14 & 2) != 0) {
                    i12 = 255;
                } else {
                    i12 = 0;
                }
                if ((i14 & 4) != 0) {
                    i13 = 255;
                } else {
                    i13 = 0;
                }
                iArr[i14] = e(255, i11, i12, i13);
            } else {
                int i15 = 127;
                if ((i14 & 1) != 0) {
                    i7 = 127;
                } else {
                    i7 = 0;
                }
                if ((i14 & 2) != 0) {
                    i10 = 127;
                } else {
                    i10 = 0;
                }
                if ((i14 & 4) == 0) {
                    i15 = 0;
                }
                iArr[i14] = e(255, i7, i10, i15);
            }
        }
        return iArr;
    }

    public static int[] d() {
        int i7;
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
        int[] iArr = new int[256];
        iArr[0] = 0;
        for (int i27 = 0; i27 < 256; i27++) {
            int i28 = 255;
            if (i27 < 8) {
                if ((i27 & 1) != 0) {
                    i25 = 255;
                } else {
                    i25 = 0;
                }
                if ((i27 & 2) != 0) {
                    i26 = 255;
                } else {
                    i26 = 0;
                }
                if ((i27 & 4) == 0) {
                    i28 = 0;
                }
                iArr[i27] = e(63, i25, i26, i28);
            } else {
                int i29 = i27 & 136;
                int i30 = 170;
                int i31 = 85;
                if (i29 != 0) {
                    if (i29 != 8) {
                        int i32 = 43;
                        if (i29 != 128) {
                            if (i29 == 136) {
                                if ((i27 & 1) != 0) {
                                    i21 = 43;
                                } else {
                                    i21 = 0;
                                }
                                if ((i27 & 16) != 0) {
                                    i22 = 85;
                                } else {
                                    i22 = 0;
                                }
                                int i33 = i21 + i22;
                                if ((i27 & 2) != 0) {
                                    i23 = 43;
                                } else {
                                    i23 = 0;
                                }
                                if ((i27 & 32) != 0) {
                                    i24 = 85;
                                } else {
                                    i24 = 0;
                                }
                                int i34 = i23 + i24;
                                if ((i27 & 4) == 0) {
                                    i32 = 0;
                                }
                                if ((i27 & 64) == 0) {
                                    i31 = 0;
                                }
                                iArr[i27] = e(255, i33, i34, i32 + i31);
                            }
                        } else {
                            if ((i27 & 1) != 0) {
                                i17 = 43;
                            } else {
                                i17 = 0;
                            }
                            int i35 = i17 + 127;
                            if ((i27 & 16) != 0) {
                                i18 = 85;
                            } else {
                                i18 = 0;
                            }
                            int i36 = i35 + i18;
                            if ((i27 & 2) != 0) {
                                i19 = 43;
                            } else {
                                i19 = 0;
                            }
                            int i37 = i19 + 127;
                            if ((i27 & 32) != 0) {
                                i20 = 85;
                            } else {
                                i20 = 0;
                            }
                            int i38 = i37 + i20;
                            if ((i27 & 4) == 0) {
                                i32 = 0;
                            }
                            int i39 = i32 + 127;
                            if ((i27 & 64) == 0) {
                                i31 = 0;
                            }
                            iArr[i27] = e(255, i36, i38, i39 + i31);
                        }
                    } else {
                        if ((i27 & 1) != 0) {
                            i13 = 85;
                        } else {
                            i13 = 0;
                        }
                        if ((i27 & 16) != 0) {
                            i14 = 170;
                        } else {
                            i14 = 0;
                        }
                        int i40 = i13 + i14;
                        if ((i27 & 2) != 0) {
                            i15 = 85;
                        } else {
                            i15 = 0;
                        }
                        if ((i27 & 32) != 0) {
                            i16 = 170;
                        } else {
                            i16 = 0;
                        }
                        int i41 = i15 + i16;
                        if ((i27 & 4) == 0) {
                            i31 = 0;
                        }
                        if ((i27 & 64) == 0) {
                            i30 = 0;
                        }
                        iArr[i27] = e(127, i40, i41, i31 + i30);
                    }
                } else {
                    if ((i27 & 1) != 0) {
                        i7 = 85;
                    } else {
                        i7 = 0;
                    }
                    if ((i27 & 16) != 0) {
                        i10 = 170;
                    } else {
                        i10 = 0;
                    }
                    int i42 = i7 + i10;
                    if ((i27 & 2) != 0) {
                        i11 = 85;
                    } else {
                        i11 = 0;
                    }
                    if ((i27 & 32) != 0) {
                        i12 = 170;
                    } else {
                        i12 = 0;
                    }
                    int i43 = i11 + i12;
                    if ((i27 & 4) == 0) {
                        i31 = 0;
                    }
                    if ((i27 & 64) == 0) {
                        i30 = 0;
                    }
                    iArr[i27] = e(255, i42, i43, i31 + i30);
                }
            }
        }
        return iArr;
    }

    public static int e(int i7, int i10, int i11, int i12) {
        return (i7 << 24) | (i10 << 16) | (i11 << 8) | i12;
    }

    public static void f(byte[] r21, int[] r22, int r23, int r24, int r25, android.graphics.Paint r26, android.graphics.Canvas r27) {
        throw new UnsupportedOperationException("Method not decompiled: e4.h.f(byte[], int[], int, int, int, android.graphics.Paint, android.graphics.Canvas):void");
    }

    public static a g(d4.f fVar, int i7) {
        int[] iArr;
        int j3;
        int i10;
        int j10;
        int j11;
        int i11;
        int i12 = 8;
        int j12 = fVar.j(8);
        fVar.L(8);
        int i13 = 2;
        int i14 = i7 - 2;
        int i15 = 0;
        int[] iArr2 = {0, -1, -16777216, -8421505};
        int[] b10 = b();
        int[] d = d();
        while (i14 > 0) {
            int j13 = fVar.j(i12);
            int j14 = fVar.j(i12);
            if ((j14 & 128) != 0) {
                iArr = iArr2;
            } else if ((j14 & 64) != 0) {
                iArr = b10;
            } else {
                iArr = d;
            }
            if ((j14 & 1) != 0) {
                j11 = fVar.j(i12);
                i11 = fVar.j(i12);
                j3 = fVar.j(i12);
                j10 = fVar.j(i12);
                i10 = i14 - 6;
            } else {
                int j15 = fVar.j(4) << 4;
                j3 = fVar.j(4) << 4;
                i10 = i14 - 4;
                j10 = fVar.j(i13) << 6;
                j11 = fVar.j(6) << i13;
                i11 = j15;
            }
            if (j11 == 0) {
                i11 = i15;
                j3 = i11;
                j10 = 255;
            }
            double d2 = j11;
            double d10 = i11 - 128;
            double d11 = j3 - 128;
            iArr[j13] = e((byte) (255 - (j10 & 255)), m0.i((int) ((1.402d * d10) + d2), 0, 255), m0.i((int) ((d2 - (0.34414d * d11)) - (d10 * 0.71414d)), 0, 255), m0.i((int) ((d11 * 1.772d) + d2), 0, 255));
            i14 = i10;
            i15 = 0;
            j12 = j12;
            d = d;
            i12 = 8;
            i13 = 2;
        }
        return new a(j12, iArr2, b10, d);
    }

    public static c h(d4.f fVar) {
        byte[] bArr;
        int j3 = fVar.j(16);
        fVar.L(4);
        int j10 = fVar.j(2);
        boolean i7 = fVar.i();
        fVar.L(1);
        byte[] bArr2 = m0.f14113b;
        if (j10 == 1) {
            fVar.L(fVar.j(8) * 16);
        } else if (j10 == 0) {
            int j11 = fVar.j(16);
            int j12 = fVar.j(16);
            if (j11 > 0) {
                bArr2 = new byte[j11];
                fVar.o(j11, bArr2);
            }
            if (j12 > 0) {
                bArr = new byte[j12];
                fVar.o(j12, bArr);
                return new c(j3, i7, bArr2, bArr);
            }
        }
        bArr = bArr2;
        return new c(j3, i7, bArr2, bArr);
    }

    @Override
    public final int P() {
        return 2;
    }

    @Override
    public final c4.d c(int i7, int i10, byte[] bArr) {
        return p0.a(this, bArr, i10);
    }

    @Override
    public final void reset() {
        g gVar = this.f10700f;
        gVar.f10688c.clear();
        gVar.d.clear();
        gVar.f10689e.clear();
        gVar.f10690f.clear();
        gVar.f10691g.clear();
        gVar.h = null;
        gVar.f10692i = null;
    }

    @Override
    public final void z(byte[] bArr, int i7, int i10, l lVar, j jVar) {
        g gVar;
        boolean z9;
        c4.a aVar;
        char c10;
        char c11;
        char c12;
        int i11;
        ArrayList arrayList;
        int i12;
        b bVar;
        g gVar2;
        e eVar;
        int i13;
        int i14;
        int i15;
        int i16;
        Paint paint;
        int[] iArr;
        e eVar2;
        int i17;
        int i18;
        int i19;
        int i20;
        d4.f fVar = new d4.f(bArr, i7 + i10);
        fVar.J(i7);
        while (true) {
            int b10 = fVar.b();
            gVar = this.f10700f;
            z9 = true;
            if (b10 >= 48 && fVar.j(8) == 15) {
                int j3 = fVar.j(8);
                int j10 = fVar.j(16);
                int j11 = fVar.j(16);
                int d = fVar.d() + j11;
                if (j11 * 8 > fVar.b()) {
                    h2.a.l("DvbParser", "Data field length exceeds limit");
                    fVar.L(fVar.b());
                } else {
                    switch (j3) {
                        case 16:
                            if (j10 == gVar.f10686a) {
                                cc.c cVar = gVar.f10692i;
                                fVar.j(8);
                                int j12 = fVar.j(4);
                                int j13 = fVar.j(2);
                                fVar.L(2);
                                int i21 = j11 - 2;
                                SparseArray sparseArray = new SparseArray();
                                while (i21 > 0) {
                                    int j14 = fVar.j(8);
                                    fVar.L(8);
                                    i21 -= 6;
                                    sparseArray.put(j14, new d(fVar.j(16), fVar.j(16)));
                                }
                                cc.c cVar2 = new cc.c(j12, j13, sparseArray);
                                if (j13 != 0) {
                                    gVar.f10692i = cVar2;
                                    gVar.f10688c.clear();
                                    gVar.d.clear();
                                    gVar.f10689e.clear();
                                    break;
                                } else if (cVar != null && cVar.f6046b != j12) {
                                    gVar.f10692i = cVar2;
                                    break;
                                }
                            }
                            break;
                        case 17:
                            cc.c cVar3 = gVar.f10692i;
                            SparseArray sparseArray2 = gVar.f10688c;
                            if (j10 == gVar.f10686a && cVar3 != null) {
                                int j15 = fVar.j(8);
                                fVar.L(4);
                                boolean i22 = fVar.i();
                                fVar.L(3);
                                int j16 = fVar.j(16);
                                int j17 = fVar.j(16);
                                fVar.j(3);
                                int j18 = fVar.j(3);
                                fVar.L(2);
                                int j19 = fVar.j(8);
                                int j20 = fVar.j(8);
                                int j21 = fVar.j(4);
                                int j22 = fVar.j(2);
                                fVar.L(2);
                                int i23 = j11 - 10;
                                SparseArray sparseArray3 = new SparseArray();
                                while (i23 > 0) {
                                    int j23 = fVar.j(16);
                                    int j24 = fVar.j(2);
                                    fVar.j(2);
                                    int j25 = fVar.j(12);
                                    fVar.L(4);
                                    int j26 = fVar.j(12);
                                    int i24 = i23 - 6;
                                    if (j24 != 1 && j24 != 2) {
                                        i23 = i24;
                                    } else {
                                        fVar.j(8);
                                        fVar.j(8);
                                        i23 -= 8;
                                    }
                                    sparseArray3.put(j23, new f(j25, j26));
                                }
                                e eVar3 = new e(j15, i22, j16, j17, j18, j19, j20, j21, j22, sparseArray3);
                                if (cVar3.f6047c == 0 && (eVar2 = (e) sparseArray2.get(j15)) != null) {
                                    SparseArray sparseArray4 = eVar2.f10683j;
                                    for (int i25 = 0; i25 < sparseArray4.size(); i25++) {
                                        eVar3.f10683j.put(sparseArray4.keyAt(i25), (f) sparseArray4.valueAt(i25));
                                    }
                                }
                                sparseArray2.put(eVar3.f10676a, eVar3);
                                break;
                            }
                            break;
                        case 18:
                            if (j10 == gVar.f10686a) {
                                a g10 = g(fVar, j11);
                                gVar.d.put(g10.f10663a, g10);
                                break;
                            } else if (j10 == gVar.f10687b) {
                                a g11 = g(fVar, j11);
                                gVar.f10690f.put(g11.f10663a, g11);
                                break;
                            }
                            break;
                        case 19:
                            if (j10 == gVar.f10686a) {
                                c h = h(fVar);
                                gVar.f10689e.put(h.f10671a, h);
                                break;
                            } else if (j10 == gVar.f10687b) {
                                c h7 = h(fVar);
                                gVar.f10691g.put(h7.f10671a, h7);
                                break;
                            }
                            break;
                        case 20:
                            if (j10 == gVar.f10686a) {
                                fVar.L(4);
                                boolean i26 = fVar.i();
                                fVar.L(3);
                                int j27 = fVar.j(16);
                                int j28 = fVar.j(16);
                                if (i26) {
                                    int j29 = fVar.j(16);
                                    i17 = fVar.j(16);
                                    i20 = fVar.j(16);
                                    i18 = fVar.j(16);
                                    i19 = j29;
                                } else {
                                    i17 = j27;
                                    i18 = j28;
                                    i19 = 0;
                                    i20 = 0;
                                }
                                gVar.h = new b(j27, j28, i19, i17, i20, i18);
                                break;
                            }
                            break;
                    }
                    fVar.M(d - fVar.d());
                }
            }
        }
        cc.c cVar4 = gVar.f10692i;
        if (cVar4 == null) {
            g0 g0Var = i0.f14329b;
            aVar = new c4.a(-9223372036854775807L, -9223372036854775807L, t1.f14397e);
        } else {
            b bVar2 = gVar.h;
            if (bVar2 == null) {
                bVar2 = this.d;
            }
            Bitmap bitmap = this.h;
            Canvas canvas = this.f10698c;
            if (bitmap == null || bVar2.f10666a + 1 != bitmap.getWidth() || bVar2.f10667b + 1 != this.h.getHeight()) {
                Bitmap createBitmap = Bitmap.createBitmap(bVar2.f10666a + 1, bVar2.f10667b + 1, Bitmap.Config.ARGB_8888);
                this.h = createBitmap;
                canvas.setBitmap(createBitmap);
            }
            ArrayList arrayList2 = new ArrayList();
            SparseArray sparseArray5 = (SparseArray) cVar4.d;
            int i27 = 0;
            while (i27 < sparseArray5.size()) {
                canvas.save();
                d dVar = (d) sparseArray5.valueAt(i27);
                e eVar4 = (e) gVar.f10688c.get(sparseArray5.keyAt(i27));
                int i28 = dVar.f10674a + bVar2.f10668c;
                int i29 = dVar.f10675b + bVar2.f10669e;
                int i30 = eVar4.f10678c;
                int i31 = eVar4.f10680f;
                int i32 = eVar4.d;
                boolean z10 = z9;
                int i33 = i28 + i30;
                int i34 = i29 + i32;
                SparseArray sparseArray6 = sparseArray5;
                canvas.clipRect(i28, i29, Math.min(i33, bVar2.d), Math.min(i34, bVar2.f10670f));
                a aVar2 = (a) gVar.d.get(i31);
                if (aVar2 == null && (aVar2 = (a) gVar.f10690f.get(i31)) == null) {
                    aVar2 = this.f10699e;
                }
                SparseArray sparseArray7 = eVar4.f10683j;
                int i35 = i27;
                int i36 = 0;
                while (i36 < sparseArray7.size()) {
                    int keyAt = sparseArray7.keyAt(i36);
                    SparseArray sparseArray8 = sparseArray7;
                    f fVar2 = (f) sparseArray7.valueAt(i36);
                    int i37 = i29;
                    c cVar5 = (c) gVar.f10689e.get(keyAt);
                    if (cVar5 == null) {
                        cVar5 = (c) gVar.f10691g.get(keyAt);
                    }
                    c cVar6 = cVar5;
                    if (cVar6 != null) {
                        if (cVar6.f10672b) {
                            paint = null;
                        } else {
                            paint = this.f10696a;
                        }
                        int i38 = i28;
                        int i39 = eVar4.f10679e;
                        gVar2 = gVar;
                        int i40 = i38 + fVar2.f10684a;
                        int i41 = i37 + fVar2.f10685b;
                        if (i39 == 3) {
                            iArr = aVar2.d;
                        } else if (i39 == 2) {
                            iArr = aVar2.f10665c;
                        } else {
                            iArr = aVar2.f10664b;
                        }
                        int i42 = i32;
                        Paint paint2 = paint;
                        bVar = bVar2;
                        i14 = i30;
                        i13 = i38;
                        arrayList = arrayList2;
                        i12 = i37;
                        e eVar5 = eVar4;
                        int[] iArr2 = iArr;
                        eVar = eVar5;
                        i15 = i36;
                        i16 = i42;
                        f(cVar6.f10673c, iArr2, i39, i40, i41, paint2, canvas);
                        f(cVar6.d, iArr2, i39, i40, i41 + 1, paint2, canvas);
                    } else {
                        arrayList = arrayList2;
                        i12 = i37;
                        bVar = bVar2;
                        gVar2 = gVar;
                        eVar = eVar4;
                        i13 = i28;
                        i14 = i30;
                        i15 = i36;
                        i16 = i32;
                    }
                    i36 = i15 + 1;
                    i30 = i14;
                    i29 = i12;
                    eVar4 = eVar;
                    i28 = i13;
                    arrayList2 = arrayList;
                    sparseArray7 = sparseArray8;
                    bVar2 = bVar;
                    gVar = gVar2;
                    i32 = i16;
                }
                b bVar3 = bVar2;
                ArrayList arrayList3 = arrayList2;
                g gVar3 = gVar;
                int i43 = i29;
                e eVar6 = eVar4;
                int i44 = i28;
                int i45 = i30;
                int i46 = i32;
                if (eVar6.f10677b) {
                    int i47 = eVar6.f10679e;
                    if (i47 == 3) {
                        i11 = aVar2.d[eVar6.f10681g];
                        c12 = 2;
                    } else {
                        c12 = 2;
                        if (i47 == 2) {
                            i11 = aVar2.f10665c[eVar6.h];
                        } else {
                            i11 = aVar2.f10664b[eVar6.f10682i];
                        }
                    }
                    Paint paint3 = this.f10697b;
                    paint3.setColor(i11);
                    c10 = c12;
                    c11 = 3;
                    canvas.drawRect(i44, i43, i33, i34, paint3);
                } else {
                    c10 = 2;
                    c11 = 3;
                }
                Bitmap createBitmap2 = Bitmap.createBitmap(this.h, i44, i43, i45, i46);
                float f10 = bVar3.f10666a;
                float f11 = bVar3.f10667b;
                arrayList3.add(new g2.b(null, null, null, createBitmap2, i43 / f11, 0, 0, i44 / f10, 0, Integer.MIN_VALUE, -3.4028235E38f, i45 / f10, i46 / f11, false, -16777216, Integer.MIN_VALUE, 0.0f, 0));
                canvas.drawColor(0, PorterDuff.Mode.CLEAR);
                canvas.restore();
                i27 = i35 + 1;
                z9 = z10;
                bVar2 = bVar3;
                arrayList2 = arrayList3;
                gVar = gVar3;
                sparseArray5 = sparseArray6;
            }
            aVar = new c4.a(-9223372036854775807L, -9223372036854775807L, arrayList2);
        }
        jVar.accept(aVar);
    }
}
