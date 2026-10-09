package a4;

import android.text.SpannableStringBuilder;
import com.google.android.gms.internal.vision.e2;
import e2.v;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
public final class h extends k {
    public final v h = new v();
    public final g f279i = new g();
    public int f280j = -1;
    public final int f281k;
    public final f[] f282l;
    public f f283m;
    public List f284n;
    public List f285o;
    public g f286p;
    public int f287q;

    public h(int i10, List list) {
        this.f281k = i10 == -1 ? 1 : i10;
        if (list != null) {
            byte[] bArr = e2.e.f8542a;
            if (list.size() == 1 && ((byte[]) list.get(0)).length == 1) {
                byte b10 = ((byte[]) list.get(0))[0];
            }
        }
        this.f282l = new f[8];
        for (int i11 = 0; i11 < 8; i11++) {
            this.f282l[i11] = new f();
        }
        this.f283m = this.f282l[0];
    }

    @Override
    public final l f() {
        List list = this.f284n;
        this.f285o = list;
        list.getClass();
        return new l(list, 0);
    }

    @Override
    public final void flush() {
        super.flush();
        this.f284n = null;
        this.f285o = null;
        this.f287q = 0;
        this.f283m = this.f282l[0];
        l();
        this.f286p = null;
    }

    @Override
    public final void g(i iVar) {
        boolean z10;
        ByteBuffer byteBuffer = iVar.f10985c;
        byteBuffer.getClass();
        byte[] array = byteBuffer.array();
        int limit = byteBuffer.limit();
        v vVar = this.h;
        vVar.H(limit, array);
        while (vVar.a() >= 3) {
            int x10 = vVar.x();
            int i10 = x10 & 3;
            boolean z11 = false;
            if ((x10 & 4) == 4) {
                z10 = true;
            } else {
                z10 = false;
            }
            byte x11 = (byte) vVar.x();
            byte x12 = (byte) vVar.x();
            if (i10 == 2 || i10 == 3) {
                if (z10) {
                    if (i10 == 3) {
                        j();
                        int i11 = (x11 & 192) >> 6;
                        int i12 = this.f280j;
                        if (i12 != -1 && i11 != (i12 + 1) % 4) {
                            l();
                            e2.a.n("Cea708Decoder", "Sequence number discontinuity. previous=" + this.f280j + " current=" + i11);
                        }
                        this.f280j = i11;
                        int i13 = x11 & 63;
                        if (i13 == 0) {
                            i13 = 64;
                        }
                        g gVar = new g(i11, i13);
                        this.f286p = gVar;
                        byte[] bArr = gVar.f276b;
                        gVar.f278e = 1;
                        bArr[0] = x12;
                    } else {
                        if (i10 == 2) {
                            z11 = true;
                        }
                        e2.d.b(z11);
                        g gVar2 = this.f286p;
                        if (gVar2 == null) {
                            e2.a.e("Cea708Decoder", "Encountered DTVCC_PACKET_DATA before DTVCC_PACKET_START");
                        } else {
                            byte[] bArr2 = gVar2.f276b;
                            int i14 = gVar2.f278e;
                            int i15 = i14 + 1;
                            gVar2.f278e = i15;
                            bArr2[i14] = x11;
                            gVar2.f278e = i14 + 2;
                            bArr2[i15] = x12;
                        }
                    }
                    g gVar3 = this.f286p;
                    if (gVar3.f278e == (gVar3.d * 2) - 1) {
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
        if (this.f284n != this.f285o) {
            return true;
        }
        return false;
    }

    public final void j() {
        char c10;
        int i10;
        boolean z10;
        f fVar;
        g gVar = this.f286p;
        if (gVar == null) {
            return;
        }
        int i11 = 2;
        if (gVar.f278e != (gVar.d * 2) - 1) {
            e2.a.d("Cea708Decoder", "DtvCcPacket ended prematurely; size is " + ((this.f286p.d * 2) - 1) + ", but current index is " + this.f286p.f278e + " (sequence number " + this.f286p.f277c + ");");
        }
        g gVar2 = this.f286p;
        byte[] bArr = gVar2.f276b;
        int i12 = gVar2.f278e;
        g gVar3 = this.f279i;
        gVar3.o(i12, bArr);
        boolean z11 = false;
        while (true) {
            if (gVar3.b() > 0) {
                int i13 = 3;
                int i14 = gVar3.i(3);
                int i15 = gVar3.i(5);
                if (i14 == 7) {
                    gVar3.t(i11);
                    i14 = gVar3.i(6);
                    if (i14 < 7) {
                        e2.m(i14, "Invalid extended service number: ", "Cea708Decoder");
                    }
                }
                if (i15 == 0) {
                    if (i14 != 0) {
                        e2.a.n("Cea708Decoder", "serviceNumber is non-zero (" + i14 + ") when blockSize is 0");
                    }
                } else if (i14 != this.f281k) {
                    gVar3.u(i15);
                } else {
                    int g10 = (i15 * 8) + gVar3.g();
                    while (gVar3.g() < g10) {
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
                                                    this.f283m.a('\n');
                                                    break;
                                                case 14:
                                                    break;
                                                default:
                                                    if (i16 >= 17 && i16 <= 23) {
                                                        e2.a.n("Cea708Decoder", "Currently unsupported COMMAND_EXT1 Command: " + i16);
                                                        gVar3.t(8);
                                                        break;
                                                    } else if (i16 >= 24 && i16 <= 31) {
                                                        e2.a.n("Cea708Decoder", "Currently unsupported COMMAND_P16 Command: " + i16);
                                                        gVar3.t(16);
                                                        break;
                                                    } else {
                                                        e2.m(i16, "Invalid C0 command: ", "Cea708Decoder");
                                                        break;
                                                    }
                                            }
                                        } else {
                                            SpannableStringBuilder spannableStringBuilder = this.f283m.f257b;
                                            int length = spannableStringBuilder.length();
                                            if (length > 0) {
                                                spannableStringBuilder.delete(length - 1, length);
                                            }
                                        }
                                    } else {
                                        this.f284n = k();
                                    }
                                }
                                i10 = i11;
                            } else if (i16 <= 127) {
                                if (i16 == 127) {
                                    this.f283m.a((char) 9835);
                                } else {
                                    this.f283m.a((char) (i16 & 255));
                                }
                                i10 = i11;
                                z11 = true;
                            } else {
                                if (i16 <= 159) {
                                    f[] fVarArr = this.f282l;
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
                                            if (this.f287q != i17) {
                                                this.f287q = i17;
                                                this.f283m = fVarArr[i17];
                                                break;
                                            }
                                            break;
                                        case 136:
                                            z10 = true;
                                            for (int i18 = 1; i18 <= 8; i18++) {
                                                if (gVar3.h()) {
                                                    f fVar2 = fVarArr[8 - i18];
                                                    fVar2.f256a.clear();
                                                    fVar2.f257b.clear();
                                                    fVar2.f268o = -1;
                                                    fVar2.f269p = -1;
                                                    fVar2.f270q = -1;
                                                    fVar2.f272s = -1;
                                                    fVar2.f274u = 0;
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
                                            gVar3.t(8);
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
                                            if (!this.f283m.f258c) {
                                                gVar3.t(16);
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
                                                this.f283m.e(h, h10);
                                                z10 = true;
                                            }
                                        case 145:
                                            if (!this.f283m.f258c) {
                                                gVar3.t(24);
                                            } else {
                                                int c11 = f.c(gVar3.i(2), gVar3.i(2), gVar3.i(2), gVar3.i(2));
                                                int c12 = f.c(gVar3.i(2), gVar3.i(2), gVar3.i(2), gVar3.i(2));
                                                gVar3.t(2);
                                                f.c(gVar3.i(2), gVar3.i(2), gVar3.i(2), 0);
                                                this.f283m.f(c11, c12);
                                            }
                                            z10 = true;
                                            i13 = 3;
                                            break;
                                        case 146:
                                            if (!this.f283m.f258c) {
                                                gVar3.t(16);
                                            } else {
                                                gVar3.t(4);
                                                int i24 = gVar3.i(4);
                                                gVar3.t(2);
                                                gVar3.i(6);
                                                f fVar3 = this.f283m;
                                                if (fVar3.f274u != i24) {
                                                    fVar3.a('\n');
                                                }
                                                fVar3.f274u = i24;
                                            }
                                            z10 = true;
                                            i13 = 3;
                                            break;
                                        case 147:
                                        case 148:
                                        case 149:
                                        case 150:
                                        default:
                                            e2.m(i16, "Invalid C1 command: ", "Cea708Decoder");
                                            z10 = true;
                                            break;
                                        case 151:
                                            if (!this.f283m.f258c) {
                                                gVar3.t(32);
                                            } else {
                                                int c13 = f.c(gVar3.i(2), gVar3.i(2), gVar3.i(2), gVar3.i(2));
                                                gVar3.i(2);
                                                f.c(gVar3.i(2), gVar3.i(2), gVar3.i(2), 0);
                                                gVar3.h();
                                                gVar3.h();
                                                gVar3.i(2);
                                                gVar3.i(2);
                                                int i25 = gVar3.i(2);
                                                gVar3.t(8);
                                                f fVar4 = this.f283m;
                                                fVar4.f267n = c13;
                                                fVar4.f264k = i25;
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
                                            gVar3.t(i11);
                                            boolean h11 = gVar3.h();
                                            gVar3.t(i11);
                                            int i27 = gVar3.i(i13);
                                            boolean h12 = gVar3.h();
                                            int i28 = gVar3.i(7);
                                            int i29 = gVar3.i(8);
                                            int i30 = gVar3.i(4);
                                            int i31 = gVar3.i(4);
                                            gVar3.t(i11);
                                            gVar3.t(6);
                                            gVar3.t(i11);
                                            int i32 = gVar3.i(3);
                                            int i33 = gVar3.i(3);
                                            ArrayList arrayList = fVar5.f256a;
                                            fVar5.f258c = true;
                                            fVar5.d = h11;
                                            fVar5.f259e = i27;
                                            fVar5.f260f = h12;
                                            fVar5.f261g = i28;
                                            fVar5.h = i29;
                                            fVar5.f262i = i30;
                                            int i34 = i31 + 1;
                                            if (fVar5.f263j != i34) {
                                                fVar5.f263j = i34;
                                                while (true) {
                                                    if (arrayList.size() >= fVar5.f263j || arrayList.size() >= 15) {
                                                        arrayList.remove(0);
                                                    }
                                                }
                                            }
                                            if (i32 != 0 && fVar5.f265l != i32) {
                                                fVar5.f265l = i32;
                                                int i35 = i32 - 1;
                                                int i36 = f.B[i35];
                                                boolean z12 = f.A[i35];
                                                int i37 = f.f254y[i35];
                                                int i38 = f.f255z[i35];
                                                int i39 = f.f253x[i35];
                                                fVar5.f267n = i36;
                                                fVar5.f264k = i39;
                                            }
                                            if (i33 != 0 && fVar5.f266m != i33) {
                                                fVar5.f266m = i33;
                                                int i40 = i33 - 1;
                                                int i41 = f.D[i40];
                                                int i42 = f.C[i40];
                                                fVar5.e(false, false);
                                                fVar5.f(f.v, f.E[i40]);
                                            }
                                            if (this.f287q != i26) {
                                                this.f287q = i26;
                                                this.f283m = fVarArr[i26];
                                            }
                                            z10 = true;
                                            i13 = 3;
                                            break;
                                    }
                                } else {
                                    z10 = true;
                                    if (i16 <= 255) {
                                        this.f283m.a((char) (i16 & 255));
                                    } else {
                                        e2.m(i16, "Invalid base command: ", "Cea708Decoder");
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
                                        gVar3.t(8);
                                    } else if (i43 <= 23) {
                                        gVar3.t(16);
                                    } else if (i43 <= 31) {
                                        gVar3.t(24);
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
                                                                                    this.f283m.a((char) 9608);
                                                                                    break;
                                                                                case 49:
                                                                                    this.f283m.a((char) 8216);
                                                                                    break;
                                                                                case 50:
                                                                                    this.f283m.a((char) 8217);
                                                                                    break;
                                                                                case 51:
                                                                                    this.f283m.a((char) 8220);
                                                                                    break;
                                                                                case 52:
                                                                                    this.f283m.a((char) 8221);
                                                                                    break;
                                                                                case 53:
                                                                                    this.f283m.a((char) 8226);
                                                                                    break;
                                                                                default:
                                                                                    switch (i43) {
                                                                                        case 118:
                                                                                            this.f283m.a((char) 8539);
                                                                                            break;
                                                                                        case 119:
                                                                                            this.f283m.a((char) 8540);
                                                                                            break;
                                                                                        case 120:
                                                                                            this.f283m.a((char) 8541);
                                                                                            break;
                                                                                        case 121:
                                                                                            this.f283m.a((char) 8542);
                                                                                            break;
                                                                                        case 122:
                                                                                            this.f283m.a((char) 9474);
                                                                                            break;
                                                                                        case 123:
                                                                                            this.f283m.a((char) 9488);
                                                                                            break;
                                                                                        case 124:
                                                                                            this.f283m.a((char) 9492);
                                                                                            break;
                                                                                        case 125:
                                                                                            this.f283m.a((char) 9472);
                                                                                            break;
                                                                                        case 126:
                                                                                            this.f283m.a((char) 9496);
                                                                                            break;
                                                                                        case 127:
                                                                                            this.f283m.a((char) 9484);
                                                                                            break;
                                                                                        default:
                                                                                            e2.m(i43, "Invalid G2 character: ", "Cea708Decoder");
                                                                                            break;
                                                                                    }
                                                                            }
                                                                        } else {
                                                                            this.f283m.a((char) 8480);
                                                                        }
                                                                    } else {
                                                                        this.f283m.a((char) 339);
                                                                    }
                                                                } else {
                                                                    this.f283m.a((char) 353);
                                                                }
                                                            } else {
                                                                this.f283m.a((char) 8482);
                                                            }
                                                        } else {
                                                            this.f283m.a((char) 376);
                                                        }
                                                    } else {
                                                        this.f283m.a((char) 338);
                                                    }
                                                } else {
                                                    this.f283m.a((char) 352);
                                                }
                                            } else {
                                                this.f283m.a((char) 8230);
                                            }
                                        } else {
                                            this.f283m.a((char) 160);
                                        }
                                    } else {
                                        this.f283m.a(' ');
                                    }
                                    i10 = 2;
                                    z11 = true;
                                } else if (i43 <= 159) {
                                    if (i43 <= 135) {
                                        gVar3.t(32);
                                    } else if (i43 <= 143) {
                                        gVar3.t(40);
                                    } else if (i43 <= 159) {
                                        i10 = 2;
                                        gVar3.t(2);
                                        gVar3.t(gVar3.i(6) * 8);
                                    }
                                } else {
                                    i10 = 2;
                                    if (i43 <= 255) {
                                        if (i43 == 160) {
                                            this.f283m.a((char) 13252);
                                        } else {
                                            e2.m(i43, "Invalid G3 character: ", "Cea708Decoder");
                                            this.f283m.a('_');
                                        }
                                        z11 = true;
                                    } else {
                                        e2.m(i43, "Invalid extended command: ", "Cea708Decoder");
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
            this.f284n = k();
        }
        this.f286p = null;
    }

    public final java.util.List k() {
        throw new UnsupportedOperationException("Method not decompiled: a4.h.k():java.util.List");
    }

    public final void l() {
        for (int i10 = 0; i10 < 8; i10++) {
            this.f282l[i10].d();
        }
    }
}
