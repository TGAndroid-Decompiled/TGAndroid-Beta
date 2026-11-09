package d4;

import a8.ia;
import android.text.SpannableStringBuilder;
import h2.x;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
public final class g extends j {
    public final x h = new x();
    public final f f8165i = new f();
    public int f8166j = -1;
    public final int f8167k;
    public final e[] f8168l;
    public e f8169m;
    public List f8170n;
    public List f8171o;
    public f f8172p;
    public int f8173q;

    public g(int i7, List list) {
        this.f8167k = i7 == -1 ? 1 : i7;
        if (list != null) {
            byte[] bArr = h2.g.f14085a;
            if (list.size() == 1 && ((byte[]) list.get(0)).length == 1) {
                byte b10 = ((byte[]) list.get(0))[0];
            }
        }
        this.f8168l = new e[8];
        for (int i10 = 0; i10 < 8; i10++) {
            this.f8168l[i10] = new e();
        }
        this.f8169m = this.f8168l[0];
    }

    @Override
    public final d6.i f() {
        List list = this.f8170n;
        this.f8171o = list;
        list.getClass();
        return new d6.i(list, 16);
    }

    @Override
    public final void flush() {
        super.flush();
        this.f8170n = null;
        this.f8171o = null;
        this.f8173q = 0;
        this.f8169m = this.f8168l[0];
        l();
        this.f8172p = null;
    }

    @Override
    public final void g(h hVar) {
        boolean z9;
        ByteBuffer byteBuffer = hVar.f17175c;
        byteBuffer.getClass();
        byte[] array = byteBuffer.array();
        int limit = byteBuffer.limit();
        x xVar = this.h;
        xVar.L(limit, array);
        while (xVar.a() >= 3) {
            int A = xVar.A();
            int i7 = A & 3;
            boolean z10 = false;
            if ((A & 4) == 4) {
                z9 = true;
            } else {
                z9 = false;
            }
            byte A2 = (byte) xVar.A();
            byte A3 = (byte) xVar.A();
            if (i7 == 2 || i7 == 3) {
                if (z9) {
                    if (i7 == 3) {
                        j();
                        int i10 = (A2 & 192) >> 6;
                        int i11 = this.f8166j;
                        if (i11 != -1 && i10 != (i11 + 1) % 4) {
                            l();
                            h2.a.l("Cea708Decoder", "Sequence number discontinuity. previous=" + this.f8166j + " current=" + i10);
                        }
                        this.f8166j = i10;
                        int i12 = A2 & 63;
                        if (i12 == 0) {
                            i12 = 64;
                        }
                        f fVar = new f(i10, i12);
                        this.f8172p = fVar;
                        fVar.f8164e = 1;
                        ((byte[]) fVar.f8162b)[0] = A3;
                    } else {
                        if (i7 == 2) {
                            z10 = true;
                        }
                        ia.f(z10);
                        f fVar2 = this.f8172p;
                        if (fVar2 == null) {
                            h2.a.c("Cea708Decoder", "Encountered DTVCC_PACKET_DATA before DTVCC_PACKET_START");
                        } else {
                            byte[] bArr = (byte[]) fVar2.f8162b;
                            int i13 = fVar2.f8164e;
                            int i14 = i13 + 1;
                            fVar2.f8164e = i14;
                            bArr[i13] = A2;
                            fVar2.f8164e = i13 + 2;
                            bArr[i14] = A3;
                        }
                    }
                    f fVar3 = this.f8172p;
                    if (fVar3.f8164e == (fVar3.d * 2) - 1) {
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
        if (this.f8170n != this.f8171o) {
            return true;
        }
        return false;
    }

    public final void j() {
        char c10;
        int i7;
        boolean z9;
        e eVar;
        f fVar = this.f8172p;
        if (fVar == null) {
            return;
        }
        int i10 = 2;
        if (fVar.f8164e != (fVar.d * 2) - 1) {
            h2.a.b("Cea708Decoder", "DtvCcPacket ended prematurely; size is " + ((this.f8172p.d * 2) - 1) + ", but current index is " + this.f8172p.f8164e + " (sequence number " + this.f8172p.f8163c + ");");
        }
        f fVar2 = this.f8172p;
        int i11 = fVar2.f8164e;
        f fVar3 = this.f8165i;
        fVar3.H(i11, (byte[]) fVar2.f8162b);
        boolean z10 = false;
        while (true) {
            if (fVar3.b() > 0) {
                int i12 = 3;
                int j3 = fVar3.j(3);
                int j10 = fVar3.j(5);
                if (j3 == 7) {
                    fVar3.L(i10);
                    j3 = fVar3.j(6);
                    if (j3 < 7) {
                        com.google.android.recaptcha.internal.a.o(j3, "Invalid extended service number: ", "Cea708Decoder");
                    }
                }
                if (j10 == 0) {
                    if (j3 != 0) {
                        h2.a.l("Cea708Decoder", "serviceNumber is non-zero (" + j3 + ") when blockSize is 0");
                    }
                } else if (j3 != this.f8167k) {
                    fVar3.M(j10);
                } else {
                    int f10 = (j10 * 8) + fVar3.f();
                    while (fVar3.f() < f10) {
                        int j11 = fVar3.j(8);
                        if (j11 != 16) {
                            if (j11 <= 31) {
                                if (j11 != 0) {
                                    if (j11 != i12) {
                                        if (j11 != 8) {
                                            switch (j11) {
                                                case 12:
                                                    l();
                                                    break;
                                                case 13:
                                                    this.f8169m.a('\n');
                                                    break;
                                                case 14:
                                                    break;
                                                default:
                                                    if (j11 >= 17 && j11 <= 23) {
                                                        h2.a.l("Cea708Decoder", "Currently unsupported COMMAND_EXT1 Command: " + j11);
                                                        fVar3.L(8);
                                                        break;
                                                    } else if (j11 >= 24 && j11 <= 31) {
                                                        h2.a.l("Cea708Decoder", "Currently unsupported COMMAND_P16 Command: " + j11);
                                                        fVar3.L(16);
                                                        break;
                                                    } else {
                                                        com.google.android.recaptcha.internal.a.o(j11, "Invalid C0 command: ", "Cea708Decoder");
                                                        break;
                                                    }
                                            }
                                        } else {
                                            SpannableStringBuilder spannableStringBuilder = this.f8169m.f8143b;
                                            int length = spannableStringBuilder.length();
                                            if (length > 0) {
                                                spannableStringBuilder.delete(length - 1, length);
                                            }
                                        }
                                    } else {
                                        this.f8170n = k();
                                    }
                                }
                                i7 = i10;
                            } else if (j11 <= 127) {
                                if (j11 == 127) {
                                    this.f8169m.a((char) 9835);
                                } else {
                                    this.f8169m.a((char) (j11 & 255));
                                }
                                i7 = i10;
                                z10 = true;
                            } else {
                                if (j11 <= 159) {
                                    e[] eVarArr = this.f8168l;
                                    switch (j11) {
                                        case 128:
                                        case 129:
                                        case 130:
                                        case 131:
                                        case 132:
                                        case 133:
                                        case 134:
                                        case 135:
                                            z9 = true;
                                            int i13 = j11 - 128;
                                            if (this.f8173q != i13) {
                                                this.f8173q = i13;
                                                this.f8169m = eVarArr[i13];
                                                break;
                                            }
                                            break;
                                        case 136:
                                            z9 = true;
                                            for (int i14 = 1; i14 <= 8; i14++) {
                                                if (fVar3.i()) {
                                                    e eVar2 = eVarArr[8 - i14];
                                                    eVar2.f8142a.clear();
                                                    eVar2.f8143b.clear();
                                                    eVar2.f8154o = -1;
                                                    eVar2.f8155p = -1;
                                                    eVar2.f8156q = -1;
                                                    eVar2.f8158s = -1;
                                                    eVar2.f8160u = 0;
                                                }
                                            }
                                            break;
                                        case 137:
                                            for (int i15 = 1; i15 <= 8; i15++) {
                                                if (fVar3.i()) {
                                                    eVarArr[8 - i15].d = true;
                                                }
                                            }
                                            z9 = true;
                                            break;
                                        case 138:
                                            for (int i16 = 1; i16 <= 8; i16++) {
                                                if (fVar3.i()) {
                                                    eVarArr[8 - i16].d = false;
                                                }
                                            }
                                            z9 = true;
                                            break;
                                        case 139:
                                            for (int i17 = 1; i17 <= 8; i17++) {
                                                if (fVar3.i()) {
                                                    eVarArr[8 - i17].d = !eVar.d;
                                                }
                                            }
                                            z9 = true;
                                            break;
                                        case 140:
                                            for (int i18 = 1; i18 <= 8; i18++) {
                                                if (fVar3.i()) {
                                                    eVarArr[8 - i18].d();
                                                }
                                            }
                                            z9 = true;
                                            break;
                                        case 141:
                                            fVar3.L(8);
                                            z9 = true;
                                            break;
                                        case 142:
                                            z9 = true;
                                            break;
                                        case 143:
                                            l();
                                            z9 = true;
                                            break;
                                        case 144:
                                            int i19 = i10;
                                            if (!this.f8169m.f8144c) {
                                                fVar3.L(16);
                                                z9 = true;
                                                i12 = 3;
                                                break;
                                            } else {
                                                fVar3.j(4);
                                                fVar3.j(i19);
                                                fVar3.j(i19);
                                                boolean i20 = fVar3.i();
                                                boolean i21 = fVar3.i();
                                                i12 = 3;
                                                fVar3.j(3);
                                                fVar3.j(3);
                                                this.f8169m.e(i20, i21);
                                                z9 = true;
                                            }
                                        case 145:
                                            if (!this.f8169m.f8144c) {
                                                fVar3.L(24);
                                            } else {
                                                int c11 = e.c(fVar3.j(2), fVar3.j(2), fVar3.j(2), fVar3.j(2));
                                                int c12 = e.c(fVar3.j(2), fVar3.j(2), fVar3.j(2), fVar3.j(2));
                                                fVar3.L(2);
                                                e.c(fVar3.j(2), fVar3.j(2), fVar3.j(2), 0);
                                                this.f8169m.f(c11, c12);
                                            }
                                            z9 = true;
                                            i12 = 3;
                                            break;
                                        case 146:
                                            if (!this.f8169m.f8144c) {
                                                fVar3.L(16);
                                            } else {
                                                fVar3.L(4);
                                                int j12 = fVar3.j(4);
                                                fVar3.L(2);
                                                fVar3.j(6);
                                                e eVar3 = this.f8169m;
                                                if (eVar3.f8160u != j12) {
                                                    eVar3.a('\n');
                                                }
                                                eVar3.f8160u = j12;
                                            }
                                            z9 = true;
                                            i12 = 3;
                                            break;
                                        case 147:
                                        case 148:
                                        case 149:
                                        case 150:
                                        default:
                                            com.google.android.recaptcha.internal.a.o(j11, "Invalid C1 command: ", "Cea708Decoder");
                                            z9 = true;
                                            break;
                                        case 151:
                                            if (!this.f8169m.f8144c) {
                                                fVar3.L(32);
                                            } else {
                                                int c13 = e.c(fVar3.j(2), fVar3.j(2), fVar3.j(2), fVar3.j(2));
                                                fVar3.j(2);
                                                e.c(fVar3.j(2), fVar3.j(2), fVar3.j(2), 0);
                                                fVar3.i();
                                                fVar3.i();
                                                fVar3.j(2);
                                                fVar3.j(2);
                                                int j13 = fVar3.j(2);
                                                fVar3.L(8);
                                                e eVar4 = this.f8169m;
                                                eVar4.f8153n = c13;
                                                eVar4.f8150k = j13;
                                            }
                                            z9 = true;
                                            i12 = 3;
                                            break;
                                        case 152:
                                        case 153:
                                        case 154:
                                        case 155:
                                        case 156:
                                        case 157:
                                        case 158:
                                        case 159:
                                            int i22 = j11 - 152;
                                            e eVar5 = eVarArr[i22];
                                            fVar3.L(i10);
                                            boolean i23 = fVar3.i();
                                            fVar3.L(i10);
                                            int j14 = fVar3.j(i12);
                                            boolean i24 = fVar3.i();
                                            int j15 = fVar3.j(7);
                                            int j16 = fVar3.j(8);
                                            int j17 = fVar3.j(4);
                                            int j18 = fVar3.j(4);
                                            fVar3.L(i10);
                                            fVar3.L(6);
                                            fVar3.L(i10);
                                            int j19 = fVar3.j(3);
                                            int j20 = fVar3.j(3);
                                            ArrayList arrayList = eVar5.f8142a;
                                            eVar5.f8144c = true;
                                            eVar5.d = i23;
                                            eVar5.f8145e = j14;
                                            eVar5.f8146f = i24;
                                            eVar5.f8147g = j15;
                                            eVar5.h = j16;
                                            eVar5.f8148i = j17;
                                            int i25 = j18 + 1;
                                            if (eVar5.f8149j != i25) {
                                                eVar5.f8149j = i25;
                                                while (true) {
                                                    if (arrayList.size() >= eVar5.f8149j || arrayList.size() >= 15) {
                                                        arrayList.remove(0);
                                                    }
                                                }
                                            }
                                            if (j19 != 0 && eVar5.f8151l != j19) {
                                                eVar5.f8151l = j19;
                                                int i26 = j19 - 1;
                                                int i27 = e.B[i26];
                                                boolean z11 = e.A[i26];
                                                int i28 = e.f8140y[i26];
                                                int i29 = e.f8141z[i26];
                                                int i30 = e.f8139x[i26];
                                                eVar5.f8153n = i27;
                                                eVar5.f8150k = i30;
                                            }
                                            if (j20 != 0 && eVar5.f8152m != j20) {
                                                eVar5.f8152m = j20;
                                                int i31 = j20 - 1;
                                                int i32 = e.D[i31];
                                                int i33 = e.C[i31];
                                                eVar5.e(false, false);
                                                eVar5.f(e.v, e.E[i31]);
                                            }
                                            if (this.f8173q != i22) {
                                                this.f8173q = i22;
                                                this.f8169m = eVarArr[i22];
                                            }
                                            z9 = true;
                                            i12 = 3;
                                            break;
                                    }
                                } else {
                                    z9 = true;
                                    if (j11 <= 255) {
                                        this.f8169m.a((char) (j11 & 255));
                                    } else {
                                        com.google.android.recaptcha.internal.a.o(j11, "Invalid base command: ", "Cea708Decoder");
                                        i7 = 2;
                                        c10 = 7;
                                    }
                                }
                                z10 = z9;
                                i7 = 2;
                                c10 = 7;
                            }
                            c10 = 7;
                        } else {
                            int j21 = fVar3.j(8);
                            if (j21 <= 31) {
                                c10 = 7;
                                if (j21 > 7) {
                                    if (j21 <= 15) {
                                        fVar3.L(8);
                                    } else if (j21 <= 23) {
                                        fVar3.L(16);
                                    } else if (j21 <= 31) {
                                        fVar3.L(24);
                                    }
                                }
                            } else {
                                c10 = 7;
                                if (j21 <= 127) {
                                    if (j21 != 32) {
                                        if (j21 != 33) {
                                            if (j21 != 37) {
                                                if (j21 != 42) {
                                                    if (j21 != 44) {
                                                        if (j21 != 63) {
                                                            if (j21 != 57) {
                                                                if (j21 != 58) {
                                                                    if (j21 != 60) {
                                                                        if (j21 != 61) {
                                                                            switch (j21) {
                                                                                case 48:
                                                                                    this.f8169m.a((char) 9608);
                                                                                    break;
                                                                                case 49:
                                                                                    this.f8169m.a((char) 8216);
                                                                                    break;
                                                                                case 50:
                                                                                    this.f8169m.a((char) 8217);
                                                                                    break;
                                                                                case 51:
                                                                                    this.f8169m.a((char) 8220);
                                                                                    break;
                                                                                case 52:
                                                                                    this.f8169m.a((char) 8221);
                                                                                    break;
                                                                                case 53:
                                                                                    this.f8169m.a((char) 8226);
                                                                                    break;
                                                                                default:
                                                                                    switch (j21) {
                                                                                        case 118:
                                                                                            this.f8169m.a((char) 8539);
                                                                                            break;
                                                                                        case 119:
                                                                                            this.f8169m.a((char) 8540);
                                                                                            break;
                                                                                        case 120:
                                                                                            this.f8169m.a((char) 8541);
                                                                                            break;
                                                                                        case 121:
                                                                                            this.f8169m.a((char) 8542);
                                                                                            break;
                                                                                        case 122:
                                                                                            this.f8169m.a((char) 9474);
                                                                                            break;
                                                                                        case 123:
                                                                                            this.f8169m.a((char) 9488);
                                                                                            break;
                                                                                        case 124:
                                                                                            this.f8169m.a((char) 9492);
                                                                                            break;
                                                                                        case 125:
                                                                                            this.f8169m.a((char) 9472);
                                                                                            break;
                                                                                        case 126:
                                                                                            this.f8169m.a((char) 9496);
                                                                                            break;
                                                                                        case 127:
                                                                                            this.f8169m.a((char) 9484);
                                                                                            break;
                                                                                        default:
                                                                                            com.google.android.recaptcha.internal.a.o(j21, "Invalid G2 character: ", "Cea708Decoder");
                                                                                            break;
                                                                                    }
                                                                            }
                                                                        } else {
                                                                            this.f8169m.a((char) 8480);
                                                                        }
                                                                    } else {
                                                                        this.f8169m.a((char) 339);
                                                                    }
                                                                } else {
                                                                    this.f8169m.a((char) 353);
                                                                }
                                                            } else {
                                                                this.f8169m.a((char) 8482);
                                                            }
                                                        } else {
                                                            this.f8169m.a((char) 376);
                                                        }
                                                    } else {
                                                        this.f8169m.a((char) 338);
                                                    }
                                                } else {
                                                    this.f8169m.a((char) 352);
                                                }
                                            } else {
                                                this.f8169m.a((char) 8230);
                                            }
                                        } else {
                                            this.f8169m.a((char) 160);
                                        }
                                    } else {
                                        this.f8169m.a(' ');
                                    }
                                    i7 = 2;
                                    z10 = true;
                                } else if (j21 <= 159) {
                                    if (j21 <= 135) {
                                        fVar3.L(32);
                                    } else if (j21 <= 143) {
                                        fVar3.L(40);
                                    } else if (j21 <= 159) {
                                        i7 = 2;
                                        fVar3.L(2);
                                        fVar3.L(fVar3.j(6) * 8);
                                    }
                                } else {
                                    i7 = 2;
                                    if (j21 <= 255) {
                                        if (j21 == 160) {
                                            this.f8169m.a((char) 13252);
                                        } else {
                                            com.google.android.recaptcha.internal.a.o(j21, "Invalid G3 character: ", "Cea708Decoder");
                                            this.f8169m.a('_');
                                        }
                                        z10 = true;
                                    } else {
                                        com.google.android.recaptcha.internal.a.o(j21, "Invalid extended command: ", "Cea708Decoder");
                                    }
                                }
                            }
                            i7 = 2;
                        }
                        i10 = i7;
                    }
                }
            }
        }
        if (z10) {
            this.f8170n = k();
        }
        this.f8172p = null;
    }

    public final java.util.List k() {
        throw new UnsupportedOperationException("Method not decompiled: d4.g.k():java.util.List");
    }

    public final void l() {
        for (int i7 = 0; i7 < 8; i7++) {
            this.f8168l[i7].d();
        }
    }
}
