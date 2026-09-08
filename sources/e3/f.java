package e3;

import b2.r;
import b2.r0;
import b2.s;
import com.google.android.gms.common.api.internal.w;
import com.google.android.gms.internal.vision.e2;
import e2.d0;
import e2.v;
import e9.a1;
import e9.g0;
import e9.i0;
import e9.q;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
public final class f implements a {
    public final i0 f8861a;
    public final int f8862b;

    public f(int i10, a1 a1Var) {
        this.f8862b = i10;
        this.f8861a = a1Var;
    }

    public static f b(int i10, v vVar) {
        String str;
        int i11;
        a gVar;
        String str2;
        int i12 = 4;
        q.e(4, "initialCapacity");
        Object[] objArr = new Object[4];
        int i13 = vVar.f8819c;
        int i14 = -2;
        int i15 = 0;
        while (vVar.a() > 8) {
            int l4 = vVar.l();
            int l10 = vVar.f8818b + vVar.l();
            vVar.I(l10);
            if (l4 == 1414744396) {
                gVar = b(vVar.l(), vVar);
            } else {
                d dVar = null;
                switch (l4) {
                    case 1718776947:
                        if (i14 == 2) {
                            vVar.K(i12);
                            int l11 = vVar.l();
                            int l12 = vVar.l();
                            vVar.K(i12);
                            int l13 = vVar.l();
                            switch (l13) {
                                case 808802372:
                                case 877677894:
                                case 1145656883:
                                case 1145656920:
                                case 1482049860:
                                case 1684633208:
                                case 2021026148:
                                    str2 = "video/mp4v-es";
                                    break;
                                case 826496577:
                                case 828601953:
                                case 875967048:
                                    str2 = "video/avc";
                                    break;
                                case 842289229:
                                    str2 = "video/mp42";
                                    break;
                                case 859066445:
                                    str2 = "video/mp43";
                                    break;
                                case 1196444237:
                                case 1735420525:
                                    str2 = "video/mjpeg";
                                    break;
                                default:
                                    str2 = null;
                                    break;
                            }
                            if (str2 == null) {
                                e2.n(l13, "Ignoring track with unsupported compression ", "StreamFormatChunk");
                                gVar = dVar;
                                break;
                            } else {
                                r rVar = new r();
                                rVar.f2345x = l11;
                                rVar.f2346y = l12;
                                rVar.f2339q = r0.n(str2);
                                gVar = new g(new s(rVar));
                                break;
                            }
                        } else {
                            if (i14 == 1) {
                                int q6 = vVar.q();
                                if (q6 == 1) {
                                    str = "audio/raw";
                                } else if (q6 != 85) {
                                    if (q6 == 255) {
                                        str = "audio/mp4a-latm";
                                    } else if (q6 != 8192) {
                                        if (q6 != 8193) {
                                            str = null;
                                        } else {
                                            str = "audio/vnd.dts";
                                        }
                                    } else {
                                        str = "audio/ac3";
                                    }
                                } else {
                                    str = "audio/mpeg";
                                }
                                if (str == null) {
                                    e2.n(q6, "Ignoring track with unsupported format tag ", "StreamFormatChunk");
                                } else {
                                    int q10 = vVar.q();
                                    int l14 = vVar.l();
                                    vVar.K(6);
                                    int q11 = vVar.q();
                                    String str3 = d0.f8765a;
                                    int B = d0.B(q11, ByteOrder.LITTLE_ENDIAN);
                                    if (vVar.a() > 0) {
                                        i11 = vVar.q();
                                    } else {
                                        i11 = 0;
                                    }
                                    r rVar2 = new r();
                                    rVar2.f2339q = r0.n(str);
                                    rVar2.I = q10;
                                    rVar2.J = l14;
                                    if (str.equals("audio/raw") && B != 0) {
                                        rVar2.K = B;
                                    }
                                    if (str.equals("audio/mp4a-latm") && i11 > 0) {
                                        byte[] bArr = new byte[i11];
                                        vVar.h(0, i11, bArr);
                                        rVar2.f2342t = i0.z(bArr);
                                    }
                                    gVar = new g(new s(rVar2));
                                    break;
                                }
                            } else {
                                e2.a.n("StreamFormatChunk", "Ignoring strf box for unsupported track type: " + d0.G(i14));
                            }
                            gVar = dVar;
                        }
                    case 1751742049:
                        int l15 = vVar.l();
                        vVar.K(8);
                        int l16 = vVar.l();
                        int l17 = vVar.l();
                        vVar.K(i12);
                        vVar.l();
                        vVar.K(12);
                        gVar = new c(l15, l16, l17);
                        break;
                    case 1752331379:
                        int l18 = vVar.l();
                        vVar.K(12);
                        vVar.l();
                        int l19 = vVar.l();
                        int l20 = vVar.l();
                        vVar.K(i12);
                        int l21 = vVar.l();
                        int l22 = vVar.l();
                        vVar.K(i12);
                        dVar = new d(l18, l19, l20, l21, l22, vVar.l());
                        gVar = dVar;
                        break;
                    case 1852994675:
                        gVar = new h(vVar.v(vVar.a(), StandardCharsets.UTF_8));
                        break;
                    default:
                        gVar = dVar;
                        break;
                }
            }
            if (gVar != null) {
                if (gVar.getType() == 1752331379) {
                    i14 = ((d) gVar).a();
                }
                int i16 = i15 + 1;
                int h = w.h(objArr.length, i16);
                if (h > objArr.length) {
                    objArr = Arrays.copyOf(objArr, h);
                }
                objArr[i15] = gVar;
                i15 = i16;
            }
            vVar.J(l10);
            vVar.I(i13);
            i12 = 4;
        }
        return new f(i10, i0.t(i15, objArr));
    }

    public final a a(Class cls) {
        g0 listIterator = this.f8861a.listIterator(0);
        while (listIterator.hasNext()) {
            a aVar = (a) listIterator.next();
            if (aVar.getClass() == cls) {
                return aVar;
            }
        }
        return null;
    }

    @Override
    public final int getType() {
        return this.f8862b;
    }
}
