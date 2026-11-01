package a4;

import android.text.SpannableStringBuilder;
import e2.x;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import v7.t6;
public final class h extends k {
    public final x h = new x();
    public final g f262i = new g();
    public int f263j = -1;
    public final int f264k;
    public final f[] f265l;
    public f f266m;
    public List f267n;
    public List f268o;
    public g f269p;
    public int f270q;

    public h(int i10, List list) {
        this.f264k = i10 == -1 ? 1 : i10;
        if (list != null) {
            byte[] bArr = e2.g.f6140a;
            if (list.size() == 1 && ((byte[]) list.get(0)).length == 1) {
                byte b10 = ((byte[]) list.get(0))[0];
            }
        }
        this.f265l = new f[8];
        for (int i11 = 0; i11 < 8; i11++) {
            this.f265l[i11] = new f();
        }
        this.f266m = this.f265l[0];
    }

    @Override
    public final l f() {
        List list = this.f267n;
        this.f268o = list;
        list.getClass();
        return new l(list, 0);
    }

    @Override
    public final void flush() {
        super.flush();
        this.f267n = null;
        this.f268o = null;
        this.f270q = 0;
        this.f266m = this.f265l[0];
        l();
        this.f269p = null;
    }

    @Override
    public final void g(i iVar) {
        boolean z10;
        ByteBuffer byteBuffer = iVar.f7587c;
        byteBuffer.getClass();
        byte[] array = byteBuffer.array();
        int limit = byteBuffer.limit();
        x xVar = this.h;
        xVar.L(limit, array);
        while (xVar.a() >= 3) {
            int A = xVar.A();
            int i10 = A & 3;
            boolean z11 = false;
            if ((A & 4) == 4) {
                z10 = true;
            } else {
                z10 = false;
            }
            byte A2 = (byte) xVar.A();
            byte A3 = (byte) xVar.A();
            if (i10 == 2 || i10 == 3) {
                if (z10) {
                    if (i10 == 3) {
                        j();
                        int i11 = (A2 & 192) >> 6;
                        int i12 = this.f263j;
                        if (i12 != -1 && i11 != (i12 + 1) % 4) {
                            l();
                            e2.a.l("Cea708Decoder", "Sequence number discontinuity. previous=" + this.f263j + " current=" + i11);
                        }
                        this.f263j = i11;
                        int i13 = A2 & 63;
                        if (i13 == 0) {
                            i13 = 64;
                        }
                        g gVar = new g(i11, i13);
                        this.f269p = gVar;
                        gVar.e = 1;
                        ((byte[]) gVar.f260b)[0] = A3;
                    } else {
                        if (i10 == 2) {
                            z11 = true;
                        }
                        t6.f(z11);
                        g gVar2 = this.f269p;
                        if (gVar2 == null) {
                            e2.a.c("Cea708Decoder", "Encountered DTVCC_PACKET_DATA before DTVCC_PACKET_START");
                        } else {
                            byte[] bArr = (byte[]) gVar2.f260b;
                            int i14 = gVar2.e;
                            int i15 = i14 + 1;
                            gVar2.e = i15;
                            bArr[i14] = A2;
                            gVar2.e = i14 + 2;
                            bArr[i15] = A3;
                        }
                    }
                    g gVar3 = this.f269p;
                    if (gVar3.e == (gVar3.d * 2) - 1) {
                        j();
                    }
                }
            }
        }
    }

    @Override
    public final String getName() {
        return "Cea708Decoder";
    }

    @Override
    public final boolean i() {
        if (this.f267n != this.f268o) {
            return true;
        }
        return false;
    }

    public final void j() {
        char c10;
        int i10;
        boolean z10;
        f fVar;
        g gVar = this.f269p;
        if (gVar == null) {
            return;
        }
        int i11 = 2;
        if (gVar.e != (gVar.d * 2) - 1) {
            e2.a.b("Cea708Decoder", "DtvCcPacket ended prematurely; size is " + ((this.f269p.d * 2) - 1) + ", but current index is " + this.f269p.e + " (sequence number " + this.f269p.f261c + ");");
        }
        g gVar2 = this.f269p;
        int i12 = gVar2.e;
        g gVar3 = this.f262i;
        gVar3.b0(i12, (byte[]) gVar2.f260b);
        boolean z11 = false;
        while (true) {
            if (gVar3.b() > 0) {
                int i13 = 3;
                int i14 = gVar3.i(3);
                int i15 = gVar3.i(5);
                if (i14 == 7) {
                    gVar3.f0(i11);
                    i14 = gVar3.i(6);
                    if (i14 < 7) {
                        a1.g.w(i14, "Invalid extended service number: ", "Cea708Decoder");
                    }
                }
                if (i15 == 0) {
                    if (i14 != 0) {
                        e2.a.l("Cea708Decoder", "serviceNumber is non-zero (" + i14 + ") when blockSize is 0");
                    }
                } else if (i14 != this.f264k) {
                    gVar3.g0(i15);
                } else {
                    int f7 = (i15 * 8) + gVar3.f();
                    while (gVar3.f() < f7) {
                        int i16 = gVar3.i(8);
                        if (i16 != 16) {
                            if (i16 <= 31) {
                                if (i16 != 0) {
                                    if (i16 != i13) {
                                        if (i16 != 8) {
                                            switch (i16) {
                                                case 12:
                                                    l();
                                                    break;
                                                case 13:
                                                    this.f266m.a('\n');
                                                    break;
                                                case 14:
                                                    break;
                                                default:
                                                    if (i16 >= 17 && i16 <= 23) {
                                                        e2.a.l("Cea708Decoder", "Currently unsupported COMMAND_EXT1 Command: " + i16);
                                                        gVar3.f0(8);
                                                        break;
                                                    } else if (i16 >= 24 && i16 <= 31) {
                                                        e2.a.l("Cea708Decoder", "Currently unsupported COMMAND_P16 Command: " + i16);
                                                        gVar3.f0(16);
                                                        break;
                                                    } else {
                                                        a1.g.w(i16, "Invalid C0 command: ", "Cea708Decoder");
                                                        break;
                                                    }
                                            }
                                        } else {
                                            SpannableStringBuilder spannableStringBuilder = this.f266m.f242b;
                                            int length = spannableStringBuilder.length();
                                            if (length > 0) {
                                                spannableStringBuilder.delete(length - 1, length);
                                            }
                                        }
                                    } else {
                                        this.f267n = k();
                                    }
                                }
                                i10 = i11;
                            } else if (i16 <= 127) {
                                if (i16 == 127) {
                                    this.f266m.a((char) 9835);
                                } else {
                                    this.f266m.a((char) (i16 & 255));
                                }
                                i10 = i11;
                                z11 = true;
                            } else {
                                if (i16 <= 159) {
                                    f[] fVarArr = this.f265l;
                                    switch (i16) {
                                        case 128:
                                        case 129:
                                        case 130:
                                        case 131:
                                        case 132:
                                        case 133:
                                        case 134:
                                        case 135:
                                            z10 = true;
                                            int i17 = i16 - 128;
                                            if (this.f270q != i17) {
                                                this.f270q = i17;
                                                this.f266m = fVarArr[i17];
                                                break;
                                            }
                                            break;
                                        case 136:
                                            z10 = true;
                                            for (int i18 = 1; i18 <= 8; i18++) {
                                                if (gVar3.h()) {
                                                    f fVar2 = fVarArr[8 - i18];
                                                    fVar2.f241a.clear();
                                                    fVar2.f242b.clear();
                                                    fVar2.f252o = -1;
                                                    fVar2.f253p = -1;
                                                    fVar2.f254q = -1;
                                                    fVar2.f256s = -1;
                                                    fVar2.f258u = 0;
                                                }
                                            }
                                            break;
                                        case 137:
                                            for (int i19 = 1; i19 <= 8; i19++) {
                                                if (gVar3.h()) {
                                                    fVarArr[8 - i19].d = true;
                                                }
                                            }
                                            z10 = true;
                                            break;
                                        case 138:
                                            for (int i20 = 1; i20 <= 8; i20++) {
                                                if (gVar3.h()) {
                                                    fVarArr[8 - i20].d = false;
                                                }
                                            }
                                            z10 = true;
                                            break;
                                        case 139:
                                            for (int i21 = 1; i21 <= 8; i21++) {
                                                if (gVar3.h()) {
                                                    fVarArr[8 - i21].d = !fVar.d;
                                                }
                                            }
                                            z10 = true;
                                            break;
                                        case 140:
                                            for (int i22 = 1; i22 <= 8; i22++) {
                                                if (gVar3.h()) {
                                                    fVarArr[8 - i22].d();
                                                }
                                            }
                                            z10 = true;
                                            break;
                                        case 141:
                                            gVar3.f0(8);
                                            z10 = true;
                                            break;
                                        case 142:
                                            z10 = true;
                                            break;
                                        case 143:
                                            l();
                                            z10 = true;
                                            break;
                                        case 144:
                                            int i23 = i11;
                                            if (!this.f266m.f243c) {
                                                gVar3.f0(16);
                                                z10 = true;
                                                i13 = 3;
                                                break;
                                            } else {
                                                gVar3.i(4);
                                                gVar3.i(i23);
                                                gVar3.i(i23);
                                                boolean h = gVar3.h();
                                                boolean h10 = gVar3.h();
                                                i13 = 3;
                                                gVar3.i(3);
                                                gVar3.i(3);
                                                this.f266m.e(h, h10);
                                                z10 = true;
                                            }
                                        case 145:
                                            if (!this.f266m.f243c) {
                                                gVar3.f0(24);
                                            } else {
                                                int c11 = f.c(gVar3.i(2), gVar3.i(2), gVar3.i(2), gVar3.i(2));
                                                int c12 = f.c(gVar3.i(2), gVar3.i(2), gVar3.i(2), gVar3.i(2));
                                                gVar3.f0(2);
                                                f.c(gVar3.i(2), gVar3.i(2), gVar3.i(2), 0);
                                                this.f266m.f(c11, c12);
                                            }
                                            z10 = true;
                                            i13 = 3;
                                            break;
                                        case 146:
                                            if (!this.f266m.f243c) {
                                                gVar3.f0(16);
                                            } else {
                                                gVar3.f0(4);
                                                int i24 = gVar3.i(4);
                                                gVar3.f0(2);
                                                gVar3.i(6);
                                                f fVar3 = this.f266m;
                                                if (fVar3.f258u != i24) {
                                                    fVar3.a('\n');
                                                }
                                                fVar3.f258u = i24;
                                            }
                                            z10 = true;
                                            i13 = 3;
                                            break;
                                        case 147:
                                        case 148:
                                        case 149:
                                        case 150:
                                        default:
                                            a1.g.w(i16, "Invalid C1 command: ", "Cea708Decoder");
                                            z10 = true;
                                            break;
                                        case 151:
                                            if (!this.f266m.f243c) {
                                                gVar3.f0(32);
                                            } else {
                                                int c13 = f.c(gVar3.i(2), gVar3.i(2), gVar3.i(2), gVar3.i(2));
                                                gVar3.i(2);
                                                f.c(gVar3.i(2), gVar3.i(2), gVar3.i(2), 0);
                                                gVar3.h();
                                                gVar3.h();
                                                gVar3.i(2);
                                                gVar3.i(2);
                                                int i25 = gVar3.i(2);
                                                gVar3.f0(8);
                                                f fVar4 = this.f266m;
                                                fVar4.f251n = c13;
                                                fVar4.f248k = i25;
                                            }
                                            z10 = true;
                                            i13 = 3;
                                            break;
                                        case 152:
                                        case 153:
                                        case 154:
                                        case 155:
                                        case 156:
                                        case 157:
                                        case 158:
                                        case 159:
                                            int i26 = i16 - 152;
                                            f fVar5 = fVarArr[i26];
                                            gVar3.f0(i11);
                                            boolean h11 = gVar3.h();
                                            gVar3.f0(i11);
                                            int i27 = gVar3.i(i13);
                                            boolean h12 = gVar3.h();
                                            int i28 = gVar3.i(7);
                                            int i29 = gVar3.i(8);
                                            int i30 = gVar3.i(4);
                                            int i31 = gVar3.i(4);
                                            gVar3.f0(i11);
                                            gVar3.f0(6);
                                            gVar3.f0(i11);
                                            int i32 = gVar3.i(3);
                                            int i33 = gVar3.i(3);
                                            ArrayList arrayList = fVar5.f241a;
                                            fVar5.f243c = true;
                                            fVar5.d = h11;
                                            fVar5.e = i27;
                                            fVar5.f244f = h12;
                                            fVar5.f245g = i28;
                                            fVar5.h = i29;
                                            fVar5.f246i = i30;
                                            int i34 = i31 + 1;
                                            if (fVar5.f247j != i34) {
                                                fVar5.f247j = i34;
                                                while (true) {
                                                    if (arrayList.size() >= fVar5.f247j || arrayList.size() >= 15) {
                                                        arrayList.remove(0);
                                                    }
                                                }
                                            }
                                            if (i32 != 0 && fVar5.f249l != i32) {
                                                fVar5.f249l = i32;
                                                int i35 = i32 - 1;
                                                int i36 = f.B[i35];
                                                boolean z12 = f.A[i35];
                                                int i37 = f.f239y[i35];
                                                int i38 = f.f240z[i35];
                                                int i39 = f.f238x[i35];
                                                fVar5.f251n = i36;
                                                fVar5.f248k = i39;
                                            }
                                            if (i33 != 0 && fVar5.f250m != i33) {
                                                fVar5.f250m = i33;
                                                int i40 = i33 - 1;
                                                int i41 = f.D[i40];
                                                int i42 = f.C[i40];
                                                fVar5.e(false, false);
                                                fVar5.f(f.v, f.E[i40]);
                                            }
                                            if (this.f270q != i26) {
                                                this.f270q = i26;
                                                this.f266m = fVarArr[i26];
                                            }
                                            z10 = true;
                                            i13 = 3;
                                            break;
                                    }
                                } else {
                                    z10 = true;
                                    if (i16 <= 255) {
                                        this.f266m.a((char) (i16 & 255));
                                    } else {
                                        a1.g.w(i16, "Invalid base command: ", "Cea708Decoder");
                                        i10 = 2;
                                        c10 = 7;
                                    }
                                }
                                z11 = z10;
                                i10 = 2;
                                c10 = 7;
                            }
                            c10 = 7;
                        } else {
                            int i43 = gVar3.i(8);
                            if (i43 <= 31) {
                                c10 = 7;
                                if (i43 > 7) {
                                    if (i43 <= 15) {
                                        gVar3.f0(8);
                                    } else if (i43 <= 23) {
                                        gVar3.f0(16);
                                    } else if (i43 <= 31) {
                                        gVar3.f0(24);
                                    }
                                }
                            } else {
                                c10 = 7;
                                if (i43 <= 127) {
                                    if (i43 != 32) {
                                        if (i43 != 33) {
                                            if (i43 != 37) {
                                                if (i43 != 42) {
                                                    if (i43 != 44) {
                                                        if (i43 != 63) {
                                                            if (i43 != 57) {
                                                                if (i43 != 58) {
                                                                    if (i43 != 60) {
                                                                        if (i43 != 61) {
                                                                            switch (i43) {
                                                                                case 48:
                                                                                    this.f266m.a((char) 9608);
                                                                                    break;
                                                                                case 49:
                                                                                    this.f266m.a((char) 8216);
                                                                                    break;
                                                                                case 50:
                                                                                    this.f266m.a((char) 8217);
                                                                                    break;
                                                                                case 51:
                                                                                    this.f266m.a((char) 8220);
                                                                                    break;
                                                                                case 52:
                                                                                    this.f266m.a((char) 8221);
                                                                                    break;
                                                                                case 53:
                                                                                    this.f266m.a((char) 8226);
                                                                                    break;
                                                                                default:
                                                                                    switch (i43) {
                                                                                        case 118:
                                                                                            this.f266m.a((char) 8539);
                                                                                            break;
                                                                                        case 119:
                                                                                            this.f266m.a((char) 8540);
                                                                                            break;
                                                                                        case 120:
                                                                                            this.f266m.a((char) 8541);
                                                                                            break;
                                                                                        case 121:
                                                                                            this.f266m.a((char) 8542);
                                                                                            break;
                                                                                        case 122:
                                                                                            this.f266m.a((char) 9474);
                                                                                            break;
                                                                                        case 123:
                                                                                            this.f266m.a((char) 9488);
                                                                                            break;
                                                                                        case 124:
                                                                                            this.f266m.a((char) 9492);
                                                                                            break;
                                                                                        case 125:
                                                                                            this.f266m.a((char) 9472);
                                                                                            break;
                                                                                        case 126:
                                                                                            this.f266m.a((char) 9496);
                                                                                            break;
                                                                                        case 127:
                                                                                            this.f266m.a((char) 9484);
                                                                                            break;
                                                                                        default:
                                                                                            a1.g.w(i43, "Invalid G2 character: ", "Cea708Decoder");
                                                                                            break;
                                                                                    }
                                                                            }
                                                                        } else {
                                                                            this.f266m.a((char) 8480);
                                                                        }
                                                                    } else {
                                                                        this.f266m.a((char) 339);
                                                                    }
                                                                } else {
                                                                    this.f266m.a((char) 353);
                                                                }
                                                            } else {
                                                                this.f266m.a((char) 8482);
                                                            }
                                                        } else {
                                                            this.f266m.a((char) 376);
                                                        }
                                                    } else {
                                                        this.f266m.a((char) 338);
                                                    }
                                                } else {
                                                    this.f266m.a((char) 352);
                                                }
                                            } else {
                                                this.f266m.a((char) 8230);
                                            }
                                        } else {
                                            this.f266m.a((char) 160);
                                        }
                                    } else {
                                        this.f266m.a(' ');
                                    }
                                    i10 = 2;
                                    z11 = true;
                                } else if (i43 <= 159) {
                                    if (i43 <= 135) {
                                        gVar3.f0(32);
                                    } else if (i43 <= 143) {
                                        gVar3.f0(40);
                                    } else if (i43 <= 159) {
                                        i10 = 2;
                                        gVar3.f0(2);
                                        gVar3.f0(gVar3.i(6) * 8);
                                    }
                                } else {
                                    i10 = 2;
                                    if (i43 <= 255) {
                                        if (i43 == 160) {
                                            this.f266m.a((char) 13252);
                                        } else {
                                            a1.g.w(i43, "Invalid G3 character: ", "Cea708Decoder");
                                            this.f266m.a('_');
                                        }
                                        z11 = true;
                                    } else {
                                        a1.g.w(i43, "Invalid extended command: ", "Cea708Decoder");
                                    }
                                }
                            }
                            i10 = 2;
                        }
                        i11 = i10;
                    }
                }
            }
        }
        if (z11) {
            this.f267n = k();
        }
        this.f269p = null;
    }

    public final java.util.List k() {
        throw new UnsupportedOperationException("Method not decompiled: a4.h.k():java.util.List");
    }

    public final void l() {
        for (int i10 = 0; i10 < 8; i10++) {
            this.f265l[i10].d();
        }
    }
}
