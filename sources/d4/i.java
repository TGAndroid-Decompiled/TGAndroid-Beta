package d4;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.util.SparseArray;
import b4.l;
import b4.m;
import g2.k;
import g2.n0;
import g2.y;
import g9.g0;
import g9.i0;
import g9.s1;
import java.util.ArrayList;
import java.util.List;
public final class i implements m {
    public static final byte[] f8559n = {0, 7, 8, 15};
    public static final byte[] f8560r = {0, 119, -120, -1};
    public static final byte[] f8561s = {0, 17, 34, 51, 68, 85, 102, 119, -120, -103, -86, -69, -52, -35, -18, -1};
    public final Paint f8562a;
    public final Paint f8563b;
    public final Canvas f8564c;
    public final b d;
    public final a f8565e;
    public final h f8566f;
    public Bitmap h;

    public i(List list) {
        y yVar = new y((byte[]) list.get(0));
        int H = yVar.H();
        int H2 = yVar.H();
        Paint paint = new Paint();
        this.f8562a = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        paint.setPathEffect(null);
        Paint paint2 = new Paint();
        this.f8563b = paint2;
        paint2.setStyle(Paint.Style.FILL);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
        paint2.setPathEffect(null);
        this.f8564c = new Canvas();
        this.d = new b(719, 575, 0, 719, 0, 575);
        this.f8565e = new a(0, new int[]{0, -1, -16777216, -8421505}, b(), c());
        this.f8566f = new h(H, H2);
    }

    public static byte[] a(int i3, int i10, c4.f fVar) {
        byte[] bArr = new byte[i3];
        for (int i11 = 0; i11 < i3; i11++) {
            bArr[i11] = (byte) fVar.j(i10);
        }
        return bArr;
    }

    public static int[] b() {
        int i3;
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
                iArr[i14] = d(255, i11, i12, i13);
            } else {
                int i15 = 127;
                if ((i14 & 1) != 0) {
                    i3 = 127;
                } else {
                    i3 = 0;
                }
                if ((i14 & 2) != 0) {
                    i10 = 127;
                } else {
                    i10 = 0;
                }
                if ((i14 & 4) == 0) {
                    i15 = 0;
                }
                iArr[i14] = d(255, i3, i10, i15);
            }
        }
        return iArr;
    }

    public static int[] c() {
        int i3;
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
                iArr[i27] = d(63, i25, i26, i28);
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
                                iArr[i27] = d(255, i33, i34, i32 + i31);
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
                            iArr[i27] = d(255, i36, i38, i39 + i31);
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
                        iArr[i27] = d(127, i40, i41, i31 + i30);
                    }
                } else {
                    if ((i27 & 1) != 0) {
                        i3 = 85;
                    } else {
                        i3 = 0;
                    }
                    if ((i27 & 16) != 0) {
                        i10 = 170;
                    } else {
                        i10 = 0;
                    }
                    int i42 = i3 + i10;
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
                    iArr[i27] = d(255, i42, i43, i31 + i30);
                }
            }
        }
        return iArr;
    }

    public static int d(int i3, int i10, int i11, int i12) {
        return (i3 << 24) | (i10 << 16) | (i11 << 8) | i12;
    }

    public static void e(byte[] r21, int[] r22, int r23, int r24, int r25, android.graphics.Paint r26, android.graphics.Canvas r27) {
        throw new UnsupportedOperationException("Method not decompiled: d4.i.e(byte[], int[], int, int, int, android.graphics.Paint, android.graphics.Canvas):void");
    }

    public static a f(c4.f fVar, int i3) {
        int[] iArr;
        int j10;
        int i10;
        int j11;
        int j12;
        int i11;
        int i12 = 8;
        int j13 = fVar.j(8);
        fVar.L(8);
        int i13 = 2;
        int i14 = i3 - 2;
        int i15 = 0;
        int[] iArr2 = {0, -1, -16777216, -8421505};
        int[] b10 = b();
        int[] c2 = c();
        while (i14 > 0) {
            int j14 = fVar.j(i12);
            int j15 = fVar.j(i12);
            if ((j15 & 128) != 0) {
                iArr = iArr2;
            } else if ((j15 & 64) != 0) {
                iArr = b10;
            } else {
                iArr = c2;
            }
            if ((j15 & 1) != 0) {
                j12 = fVar.j(i12);
                i11 = fVar.j(i12);
                j10 = fVar.j(i12);
                j11 = fVar.j(i12);
                i10 = i14 - 6;
            } else {
                int j16 = fVar.j(4) << 4;
                j10 = fVar.j(4) << 4;
                i10 = i14 - 4;
                j11 = fVar.j(i13) << 6;
                j12 = fVar.j(6) << i13;
                i11 = j16;
            }
            if (j12 == 0) {
                i11 = i15;
                j10 = i11;
                j11 = 255;
            }
            double d = j12;
            double d10 = i11 - 128;
            double d11 = j10 - 128;
            iArr[j14] = d((byte) (255 - (j11 & 255)), n0.i((int) ((1.402d * d10) + d), 0, 255), n0.i((int) ((d - (0.34414d * d11)) - (d10 * 0.71414d)), 0, 255), n0.i((int) ((d11 * 1.772d) + d), 0, 255));
            i14 = i10;
            i15 = 0;
            j13 = j13;
            c2 = c2;
            i12 = 8;
            i13 = 2;
        }
        return new a(j13, iArr2, b10, c2);
    }

    public static c g(c4.f fVar) {
        byte[] bArr;
        int j10 = fVar.j(16);
        fVar.L(4);
        int j11 = fVar.j(2);
        boolean i3 = fVar.i();
        fVar.L(1);
        byte[] bArr2 = n0.f11874b;
        if (j11 == 1) {
            fVar.L(fVar.j(8) * 16);
        } else if (j11 == 0) {
            int j12 = fVar.j(16);
            int j13 = fVar.j(16);
            if (j12 > 0) {
                bArr2 = new byte[j12];
                fVar.o(j12, bArr2);
            }
            if (j13 > 0) {
                bArr = new byte[j13];
                fVar.o(j13, bArr);
                return new c(j10, i3, bArr2, bArr);
            }
        }
        bArr = bArr2;
        return new c(j10, i3, bArr2, bArr);
    }

    @Override
    public final b4.d B(int i3, int i10, byte[] bArr) {
        return a1.g.a(this, bArr, i10);
    }

    @Override
    public final void F(byte[] bArr, int i3, int i10, l lVar, k kVar) {
        h hVar;
        boolean z10;
        b4.a aVar;
        char c2;
        char c10;
        char c11;
        int i11;
        ArrayList arrayList;
        int i12;
        b bVar;
        h hVar2;
        f fVar;
        int i13;
        int i14;
        int i15;
        int i16;
        Paint paint;
        int[] iArr;
        f fVar2;
        int i17;
        int i18;
        int i19;
        int i20;
        c4.f fVar3 = new c4.f(bArr, i3 + i10);
        fVar3.J(i3);
        while (true) {
            int b10 = fVar3.b();
            hVar = this.f8566f;
            z10 = true;
            if (b10 >= 48 && fVar3.j(8) == 15) {
                int j10 = fVar3.j(8);
                int j11 = fVar3.j(16);
                int j12 = fVar3.j(16);
                int d = fVar3.d() + j12;
                if (j12 * 8 > fVar3.b()) {
                    g2.a.l("DvbParser", "Data field length exceeds limit");
                    fVar3.L(fVar3.b());
                } else {
                    switch (j10) {
                        case 16:
                            if (j11 == hVar.f8552a) {
                                d dVar = hVar.f8558i;
                                fVar3.j(8);
                                int j13 = fVar3.j(4);
                                int j14 = fVar3.j(2);
                                fVar3.L(2);
                                int i21 = j12 - 2;
                                SparseArray sparseArray = new SparseArray();
                                while (i21 > 0) {
                                    int j15 = fVar3.j(8);
                                    fVar3.L(8);
                                    i21 -= 6;
                                    sparseArray.put(j15, new e(fVar3.j(16), fVar3.j(16)));
                                }
                                d dVar2 = new d(j13, j14, sparseArray);
                                if (j14 != 0) {
                                    hVar.f8558i = dVar2;
                                    hVar.f8554c.clear();
                                    hVar.d.clear();
                                    hVar.f8555e.clear();
                                    break;
                                } else if (dVar != null && dVar.f8538b != j13) {
                                    hVar.f8558i = dVar2;
                                    break;
                                }
                            }
                            break;
                        case 17:
                            d dVar3 = hVar.f8558i;
                            SparseArray sparseArray2 = hVar.f8554c;
                            if (j11 == hVar.f8552a && dVar3 != null) {
                                int j16 = fVar3.j(8);
                                fVar3.L(4);
                                boolean i22 = fVar3.i();
                                fVar3.L(3);
                                int j17 = fVar3.j(16);
                                int j18 = fVar3.j(16);
                                fVar3.j(3);
                                int j19 = fVar3.j(3);
                                fVar3.L(2);
                                int j20 = fVar3.j(8);
                                int j21 = fVar3.j(8);
                                int j22 = fVar3.j(4);
                                int j23 = fVar3.j(2);
                                fVar3.L(2);
                                int i23 = j12 - 10;
                                SparseArray sparseArray3 = new SparseArray();
                                while (i23 > 0) {
                                    int j24 = fVar3.j(16);
                                    int j25 = fVar3.j(2);
                                    fVar3.j(2);
                                    int j26 = fVar3.j(12);
                                    fVar3.L(4);
                                    int j27 = fVar3.j(12);
                                    int i24 = i23 - 6;
                                    if (j25 != 1 && j25 != 2) {
                                        i23 = i24;
                                    } else {
                                        fVar3.j(8);
                                        fVar3.j(8);
                                        i23 -= 8;
                                    }
                                    sparseArray3.put(j24, new g(j26, j27));
                                }
                                f fVar4 = new f(j16, i22, j17, j18, j19, j20, j21, j22, j23, sparseArray3);
                                if (dVar3.f8539c == 0 && (fVar2 = (f) sparseArray2.get(j16)) != null) {
                                    SparseArray sparseArray4 = fVar2.f8549j;
                                    for (int i25 = 0; i25 < sparseArray4.size(); i25++) {
                                        fVar4.f8549j.put(sparseArray4.keyAt(i25), (g) sparseArray4.valueAt(i25));
                                    }
                                }
                                sparseArray2.put(fVar4.f8542a, fVar4);
                                break;
                            }
                            break;
                        case 18:
                            if (j11 == hVar.f8552a) {
                                a f10 = f(fVar3, j12);
                                hVar.d.put(f10.f8526a, f10);
                                break;
                            } else if (j11 == hVar.f8553b) {
                                a f11 = f(fVar3, j12);
                                hVar.f8556f.put(f11.f8526a, f11);
                                break;
                            }
                            break;
                        case 19:
                            if (j11 == hVar.f8552a) {
                                c g7 = g(fVar3);
                                hVar.f8555e.put(g7.f8534a, g7);
                                break;
                            } else if (j11 == hVar.f8553b) {
                                c g10 = g(fVar3);
                                hVar.f8557g.put(g10.f8534a, g10);
                                break;
                            }
                            break;
                        case 20:
                            if (j11 == hVar.f8552a) {
                                fVar3.L(4);
                                boolean i26 = fVar3.i();
                                fVar3.L(3);
                                int j28 = fVar3.j(16);
                                int j29 = fVar3.j(16);
                                if (i26) {
                                    int j30 = fVar3.j(16);
                                    i17 = fVar3.j(16);
                                    i20 = fVar3.j(16);
                                    i18 = fVar3.j(16);
                                    i19 = j30;
                                } else {
                                    i17 = j28;
                                    i18 = j29;
                                    i19 = 0;
                                    i20 = 0;
                                }
                                hVar.h = new b(j28, j29, i19, i17, i20, i18);
                                break;
                            }
                            break;
                    }
                    fVar3.M(d - fVar3.d());
                }
            }
        }
        d dVar4 = hVar.f8558i;
        if (dVar4 == null) {
            g0 g0Var = i0.f12083b;
            aVar = new b4.a(-9223372036854775807L, -9223372036854775807L, s1.f12146e);
        } else {
            b bVar2 = hVar.h;
            if (bVar2 == null) {
                bVar2 = this.d;
            }
            Bitmap bitmap = this.h;
            Canvas canvas = this.f8564c;
            if (bitmap == null || bVar2.f8529a + 1 != bitmap.getWidth() || bVar2.f8530b + 1 != this.h.getHeight()) {
                Bitmap createBitmap = Bitmap.createBitmap(bVar2.f8529a + 1, bVar2.f8530b + 1, Bitmap.Config.ARGB_8888);
                this.h = createBitmap;
                canvas.setBitmap(createBitmap);
            }
            ArrayList arrayList2 = new ArrayList();
            SparseArray sparseArray5 = (SparseArray) dVar4.d;
            int i27 = 0;
            while (i27 < sparseArray5.size()) {
                canvas.save();
                e eVar = (e) sparseArray5.valueAt(i27);
                f fVar5 = (f) hVar.f8554c.get(sparseArray5.keyAt(i27));
                int i28 = eVar.f8540a + bVar2.f8531c;
                int i29 = eVar.f8541b + bVar2.f8532e;
                int i30 = fVar5.f8544c;
                int i31 = fVar5.f8546f;
                int i32 = fVar5.d;
                boolean z11 = z10;
                int i33 = i28 + i30;
                int i34 = i29 + i32;
                SparseArray sparseArray6 = sparseArray5;
                canvas.clipRect(i28, i29, Math.min(i33, bVar2.d), Math.min(i34, bVar2.f8533f));
                a aVar2 = (a) hVar.d.get(i31);
                if (aVar2 == null && (aVar2 = (a) hVar.f8556f.get(i31)) == null) {
                    aVar2 = this.f8565e;
                }
                SparseArray sparseArray7 = fVar5.f8549j;
                int i35 = i27;
                int i36 = 0;
                while (i36 < sparseArray7.size()) {
                    int keyAt = sparseArray7.keyAt(i36);
                    SparseArray sparseArray8 = sparseArray7;
                    g gVar = (g) sparseArray7.valueAt(i36);
                    int i37 = i29;
                    c cVar = (c) hVar.f8555e.get(keyAt);
                    if (cVar == null) {
                        cVar = (c) hVar.f8557g.get(keyAt);
                    }
                    c cVar2 = cVar;
                    if (cVar2 != null) {
                        if (cVar2.f8535b) {
                            paint = null;
                        } else {
                            paint = this.f8562a;
                        }
                        int i38 = i28;
                        int i39 = fVar5.f8545e;
                        hVar2 = hVar;
                        int i40 = i38 + gVar.f8550a;
                        int i41 = i37 + gVar.f8551b;
                        if (i39 == 3) {
                            iArr = aVar2.d;
                        } else if (i39 == 2) {
                            iArr = aVar2.f8528c;
                        } else {
                            iArr = aVar2.f8527b;
                        }
                        int i42 = i32;
                        Paint paint2 = paint;
                        bVar = bVar2;
                        i14 = i30;
                        i13 = i38;
                        arrayList = arrayList2;
                        i12 = i37;
                        f fVar6 = fVar5;
                        int[] iArr2 = iArr;
                        fVar = fVar6;
                        i15 = i36;
                        i16 = i42;
                        e(cVar2.f8536c, iArr2, i39, i40, i41, paint2, canvas);
                        e(cVar2.d, iArr2, i39, i40, i41 + 1, paint2, canvas);
                    } else {
                        arrayList = arrayList2;
                        i12 = i37;
                        bVar = bVar2;
                        hVar2 = hVar;
                        fVar = fVar5;
                        i13 = i28;
                        i14 = i30;
                        i15 = i36;
                        i16 = i32;
                    }
                    i36 = i15 + 1;
                    i30 = i14;
                    i29 = i12;
                    fVar5 = fVar;
                    i28 = i13;
                    arrayList2 = arrayList;
                    sparseArray7 = sparseArray8;
                    bVar2 = bVar;
                    hVar = hVar2;
                    i32 = i16;
                }
                b bVar3 = bVar2;
                ArrayList arrayList3 = arrayList2;
                h hVar3 = hVar;
                int i43 = i29;
                f fVar7 = fVar5;
                int i44 = i28;
                int i45 = i30;
                int i46 = i32;
                if (fVar7.f8543b) {
                    int i47 = fVar7.f8545e;
                    if (i47 == 3) {
                        i11 = aVar2.d[fVar7.f8547g];
                        c11 = 2;
                    } else {
                        c11 = 2;
                        if (i47 == 2) {
                            i11 = aVar2.f8528c[fVar7.h];
                        } else {
                            i11 = aVar2.f8527b[fVar7.f8548i];
                        }
                    }
                    Paint paint3 = this.f8563b;
                    paint3.setColor(i11);
                    c2 = c11;
                    c10 = 3;
                    canvas.drawRect(i44, i43, i33, i34, paint3);
                } else {
                    c2 = 2;
                    c10 = 3;
                }
                Bitmap createBitmap2 = Bitmap.createBitmap(this.h, i44, i43, i45, i46);
                float f12 = bVar3.f8529a;
                float f13 = bVar3.f8530b;
                arrayList3.add(new f2.b(null, null, null, createBitmap2, i43 / f13, 0, 0, i44 / f12, 0, Integer.MIN_VALUE, -3.4028235E38f, i45 / f12, i46 / f13, false, -16777216, Integer.MIN_VALUE, 0.0f, 0));
                canvas.drawColor(0, PorterDuff.Mode.CLEAR);
                canvas.restore();
                i27 = i35 + 1;
                z10 = z11;
                bVar2 = bVar3;
                arrayList2 = arrayList3;
                hVar = hVar3;
                sparseArray5 = sparseArray6;
            }
            aVar = new b4.a(-9223372036854775807L, -9223372036854775807L, arrayList2);
        }
        kVar.accept(aVar);
    }

    @Override
    public final int Y() {
        return 2;
    }

    @Override
    public final void reset() {
        h hVar = this.f8566f;
        hVar.f8554c.clear();
        hVar.d.clear();
        hVar.f8555e.clear();
        hVar.f8556f.clear();
        hVar.f8557g.clear();
        hVar.h = null;
        hVar.f8558i = null;
    }
}
