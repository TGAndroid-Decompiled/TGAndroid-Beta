package e5;

import android.content.Context;
import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.util.Pair;
import android.view.Surface;
import d5.g0;
import h3.h0;
import h3.s0;
import h3.t0;
import h3.u0;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;
import p8.l0;
import p8.z;

public final class i extends y3.q {

    public static final int[] f5250n1 = {1920, 1600, 1440, 1280, 960, 854, 640, 540, 480};

    public static boolean f5251o1;

    public static boolean f5252p1;
    public final Context E0;
    public final r F0;
    public final xe.b G0;
    public final long H0;
    public final int I0;
    public final boolean J0;
    public b8.b K0;
    public boolean L0;
    public boolean M0;
    public Surface N0;
    public k O0;
    public boolean P0;
    public int Q0;
    public boolean R0;
    public boolean S0;
    public boolean T0;
    public long U0;
    public long V0;
    public long W0;
    public int X0;
    public int Y0;
    public int Z0;

    public long f5253a1;

    public long f5254b1;

    public long f5255c1;

    public int f5256d1;

    public int f5257e1;

    public int f5258f1;

    public int f5259g1;

    public float f5260h1;

    public x f5261i1;

    public boolean f5262j1;

    public int f5263k1;
    public h l1;

    public m f5264m1;

    public i(Context context, y3.j jVar, Handler handler, h0 h0Var) {
        super(2, jVar, 30.0f);
        this.H0 = 5000L;
        this.I0 = 50;
        Context applicationContext = context.getApplicationContext();
        this.E0 = applicationContext;
        this.F0 = new r(applicationContext);
        this.G0 = new xe.b(handler, h0Var, false, 20);
        this.J0 = "NVIDIA".equals(g0.f4797c);
        this.V0 = -9223372036854775807L;
        this.f5257e1 = -1;
        this.f5258f1 = -1;
        this.f5260h1 = -1.0f;
        this.Q0 = 1;
        this.f5263k1 = 0;
        this.f5261i1 = null;
    }

    public static boolean R(String str) {
        String str2;
        byte b10;
        String str3;
        byte b11;
        boolean z10 = false;
        if (str.startsWith("OMX.google")) {
            return false;
        }
        synchronized (i.class) {
            try {
                if (!f5251o1) {
                    int i10 = g0.f4795a;
                    byte b12 = 28;
                    if (i10 <= 28) {
                        String str4 = g0.f4796b;
                        str4.getClass();
                        switch (str4.hashCode()) {
                            case -1339091551:
                                if (!str4.equals("dangal")) {
                                    b11 = -1;
                                } else {
                                    b11 = 0;
                                }
                                break;
                            case -1220081023:
                                if (!str4.equals("dangalFHD")) {
                                    b11 = -1;
                                } else {
                                    b11 = 1;
                                }
                                break;
                            case -1220066608:
                                if (!str4.equals("dangalUHD")) {
                                    b11 = -1;
                                } else {
                                    b11 = 2;
                                }
                                break;
                            case -1012436106:
                                if (!str4.equals("oneday")) {
                                    b11 = -1;
                                } else {
                                    b11 = 3;
                                }
                                break;
                            case -760312546:
                                if (!str4.equals("aquaman")) {
                                    b11 = -1;
                                } else {
                                    b11 = 4;
                                }
                                break;
                            case -64886864:
                                if (!str4.equals("magnolia")) {
                                    b11 = -1;
                                } else {
                                    b11 = 5;
                                }
                                break;
                            case 3415681:
                                if (!str4.equals("once")) {
                                    b11 = -1;
                                } else {
                                    b11 = 6;
                                }
                                break;
                            case 825323514:
                                if (!str4.equals("machuca")) {
                                    b11 = -1;
                                } else {
                                    b11 = 7;
                                }
                                break;
                            default:
                                b11 = -1;
                                break;
                        }
                        switch (b11) {
                            default:
                                if (i10 <= 27 || !"HWEML".equals(g0.f4796b)) {
                                    str2 = g0.d;
                                    str2.getClass();
                                    switch (str2.hashCode()) {
                                        case -349662828:
                                            if (!str2.equals("AFTJMST12")) {
                                                b10 = 0;
                                            } else {
                                                b10 = -1;
                                            }
                                            break;
                                        case -321033677:
                                            if (!str2.equals("AFTKMST12")) {
                                                b10 = 1;
                                            } else {
                                                b10 = -1;
                                            }
                                            break;
                                        case 2006354:
                                            if (!str2.equals("AFTA")) {
                                                b10 = 2;
                                            } else {
                                                b10 = -1;
                                            }
                                            break;
                                        case 2006367:
                                            if (!str2.equals("AFTN")) {
                                                b10 = 3;
                                            } else {
                                                b10 = -1;
                                            }
                                            break;
                                        case 2006371:
                                            if (!str2.equals("AFTR")) {
                                                b10 = 4;
                                            } else {
                                                b10 = -1;
                                            }
                                            break;
                                        case 1785421873:
                                            if (!str2.equals("AFTEU011")) {
                                                b10 = 5;
                                            } else {
                                                b10 = -1;
                                            }
                                            break;
                                        case 1785421876:
                                            if (!str2.equals("AFTEU014")) {
                                                b10 = 6;
                                            } else {
                                                b10 = -1;
                                            }
                                            break;
                                        case 1798172390:
                                            if (!str2.equals("AFTSO001")) {
                                                b10 = 7;
                                            } else {
                                                b10 = -1;
                                            }
                                            break;
                                        case 2119412532:
                                            if (!str2.equals("AFTEUFF014")) {
                                                b10 = 8;
                                            } else {
                                                b10 = -1;
                                            }
                                            break;
                                        default:
                                            b10 = -1;
                                            break;
                                    }
                                    switch (b10) {
                                        default:
                                            if (i10 <= 26) {
                                                str3 = g0.f4796b;
                                                str3.getClass();
                                                switch (str3.hashCode()) {
                                                    case -2144781245:
                                                        if (!str3.equals("GIONEE_SWW1609")) {
                                                            b12 = 0;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case -2144781185:
                                                        if (!str3.equals("GIONEE_SWW1627")) {
                                                            b12 = 1;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case -2144781160:
                                                        if (!str3.equals("GIONEE_SWW1631")) {
                                                            b12 = 2;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case -2097309513:
                                                        if (!str3.equals("K50a40")) {
                                                            b12 = 3;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case -2022874474:
                                                        if (!str3.equals("CP8676_I02")) {
                                                            b12 = 4;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case -1978993182:
                                                        if (!str3.equals("NX541J")) {
                                                            b12 = 5;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case -1978990237:
                                                        if (!str3.equals("NX573J")) {
                                                            b12 = 6;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case -1936688988:
                                                        if (!str3.equals("PGN528")) {
                                                            b12 = 7;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case -1936688066:
                                                        if (!str3.equals("PGN610")) {
                                                            b12 = 8;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case -1936688065:
                                                        if (!str3.equals("PGN611")) {
                                                            b12 = 9;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case -1931988508:
                                                        if (!str3.equals("AquaPowerM")) {
                                                            b12 = 10;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case -1885099851:
                                                        if (!str3.equals("RAIJIN")) {
                                                            b12 = 11;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case -1696512866:
                                                        if (!str3.equals("XT1663")) {
                                                            b12 = 12;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case -1680025915:
                                                        if (!str3.equals("ComioS1")) {
                                                            b12 = 13;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case -1615810839:
                                                        if (!str3.equals("Phantom6")) {
                                                            b12 = 14;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case -1600724499:
                                                        if (!str3.equals("pacificrim")) {
                                                            b12 = 15;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case -1554255044:
                                                        if (!str3.equals("vernee_M5")) {
                                                            b12 = 16;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case -1481772737:
                                                        if (!str3.equals("panell_dl")) {
                                                            b12 = 17;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case -1481772730:
                                                        if (!str3.equals("panell_ds")) {
                                                            b12 = 18;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case -1481772729:
                                                        if (!str3.equals("panell_dt")) {
                                                            b12 = 19;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case -1320080169:
                                                        if (!str3.equals("GiONEE_GBL7319")) {
                                                            b12 = 20;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case -1217592143:
                                                        if (!str3.equals("BRAVIA_ATV2")) {
                                                            b12 = 21;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case -1180384755:
                                                        if (!str3.equals("iris60")) {
                                                            b12 = 22;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case -1139198265:
                                                        if (!str3.equals("Slate_Pro")) {
                                                            b12 = 23;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case -1052835013:
                                                        if (!str3.equals("namath")) {
                                                            b12 = 24;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case -993250464:
                                                        if (!str3.equals("A10-70F")) {
                                                            b12 = 25;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case -993250458:
                                                        if (!str3.equals("A10-70L")) {
                                                            b12 = 26;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case -965403638:
                                                        if (!str3.equals("s905x018")) {
                                                            b12 = 27;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case -958336948:
                                                        if (!str3.equals("ELUGA_Ray_X")) {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case -879245230:
                                                        if (!str3.equals("tcl_eu")) {
                                                            b12 = 29;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case -842500323:
                                                        if (!str3.equals("nicklaus_f")) {
                                                            b12 = 30;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case -821392978:
                                                        if (!str3.equals("A7000-a")) {
                                                            b12 = 31;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case -797483286:
                                                        if (!str3.equals("SVP-DTV15")) {
                                                            b12 = 32;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case -794946968:
                                                        if (!str3.equals("watson")) {
                                                            b12 = 33;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case -788334647:
                                                        if (!str3.equals("whyred")) {
                                                            b12 = 34;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case -782144577:
                                                        if (!str3.equals("OnePlus5T")) {
                                                            b12 = 35;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case -575125681:
                                                        if (!str3.equals("GiONEE_CBL7513")) {
                                                            b12 = 36;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case -521118391:
                                                        if (!str3.equals("GIONEE_GBL7360")) {
                                                            b12 = 37;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case -430914369:
                                                        if (!str3.equals("Pixi4-7_3G")) {
                                                            b12 = 38;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case -290434366:
                                                        if (!str3.equals("taido_row")) {
                                                            b12 = 39;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case -282781963:
                                                        if (!str3.equals("BLACK-1X")) {
                                                            b12 = 40;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case -277133239:
                                                        if (!str3.equals("Z12_PRO")) {
                                                            b12 = 41;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case -173639913:
                                                        if (!str3.equals("ELUGA_A3_Pro")) {
                                                            b12 = 42;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case -56598463:
                                                        if (!str3.equals("woods_fn")) {
                                                            b12 = 43;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 2126:
                                                        if (!str3.equals("C1")) {
                                                            b12 = 44;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 2564:
                                                        if (!str3.equals("Q5")) {
                                                            b12 = 45;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 2715:
                                                        if (!str3.equals("V1")) {
                                                            b12 = 46;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 2719:
                                                        if (!str3.equals("V5")) {
                                                            b12 = 47;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 3091:
                                                        if (!str3.equals("b5")) {
                                                            b12 = 48;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 3483:
                                                        if (!str3.equals("mh")) {
                                                            b12 = 49;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 73405:
                                                        if (!str3.equals("JGZ")) {
                                                            b12 = 50;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 75537:
                                                        if (!str3.equals("M04")) {
                                                            b12 = 51;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 75739:
                                                        if (!str3.equals("M5c")) {
                                                            b12 = 52;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 76779:
                                                        if (!str3.equals("MX6")) {
                                                            b12 = 53;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 78669:
                                                        if (!str3.equals("P85")) {
                                                            b12 = 54;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 79305:
                                                        if (!str3.equals("PLE")) {
                                                            b12 = 55;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 80618:
                                                        if (!str3.equals("QX1")) {
                                                            b12 = 56;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 88274:
                                                        if (!str3.equals("Z80")) {
                                                            b12 = 57;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 98846:
                                                        if (!str3.equals("cv1")) {
                                                            b12 = 58;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 98848:
                                                        if (!str3.equals("cv3")) {
                                                            b12 = 59;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 99329:
                                                        if (!str3.equals("deb")) {
                                                            b12 = 60;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 101481:
                                                        if (!str3.equals("flo")) {
                                                            b12 = 61;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 1513190:
                                                        if (!str3.equals("1601")) {
                                                            b12 = 62;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 1514184:
                                                        if (!str3.equals("1713")) {
                                                            b12 = 63;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 1514185:
                                                        if (!str3.equals("1714")) {
                                                            b12 = 64;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 2133089:
                                                        if (!str3.equals("F01H")) {
                                                            b12 = 65;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 2133091:
                                                        if (!str3.equals("F01J")) {
                                                            b12 = 66;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 2133120:
                                                        if (!str3.equals("F02H")) {
                                                            b12 = 67;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 2133151:
                                                        if (!str3.equals("F03H")) {
                                                            b12 = 68;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 2133182:
                                                        if (!str3.equals("F04H")) {
                                                            b12 = 69;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 2133184:
                                                        if (!str3.equals("F04J")) {
                                                            b12 = 70;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 2436959:
                                                        if (!str3.equals("P681")) {
                                                            b12 = 71;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 2463773:
                                                        if (!str3.equals("Q350")) {
                                                            b12 = 72;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 2464648:
                                                        if (!str3.equals("Q427")) {
                                                            b12 = 73;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 2689555:
                                                        if (!str3.equals("XE2X")) {
                                                            b12 = 74;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 3154429:
                                                        if (!str3.equals("fugu")) {
                                                            b12 = 75;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 3284551:
                                                        if (!str3.equals("kate")) {
                                                            b12 = 76;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 3351335:
                                                        if (!str3.equals("mido")) {
                                                            b12 = 77;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 3386211:
                                                        if (!str3.equals("p212")) {
                                                            b12 = 78;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 41325051:
                                                        if (!str3.equals("MEIZU_M5")) {
                                                            b12 = 79;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 51349633:
                                                        if (!str3.equals("601LV")) {
                                                            b12 = 80;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 51350594:
                                                        if (!str3.equals("602LV")) {
                                                            b12 = 81;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 55178625:
                                                        if (!str3.equals("Aura_Note_2")) {
                                                            b12 = 82;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 61542055:
                                                        if (!str3.equals("A1601")) {
                                                            b12 = 83;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 65355429:
                                                        if (!str3.equals("E5643")) {
                                                            b12 = 84;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 66214468:
                                                        if (!str3.equals("F3111")) {
                                                            b12 = 85;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 66214470:
                                                        if (!str3.equals("F3113")) {
                                                            b12 = 86;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 66214473:
                                                        if (!str3.equals("F3116")) {
                                                            b12 = 87;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 66215429:
                                                        if (!str3.equals("F3211")) {
                                                            b12 = 88;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 66215431:
                                                        if (!str3.equals("F3213")) {
                                                            b12 = 89;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 66215433:
                                                        if (!str3.equals("F3215")) {
                                                            b12 = 90;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 66216390:
                                                        if (!str3.equals("F3311")) {
                                                            b12 = 91;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 76402249:
                                                        if (!str3.equals("PRO7S")) {
                                                            b12 = 92;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 76404105:
                                                        if (!str3.equals("Q4260")) {
                                                            b12 = 93;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 76404911:
                                                        if (!str3.equals("Q4310")) {
                                                            b12 = 94;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 80963634:
                                                        if (!str3.equals("V23GB")) {
                                                            b12 = 95;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 82882791:
                                                        if (!str3.equals("X3_HK")) {
                                                            b12 = 96;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 98715550:
                                                        if (!str3.equals("i9031")) {
                                                            b12 = 97;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 101370885:
                                                        if (!str3.equals("l5460")) {
                                                            b12 = 98;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 102844228:
                                                        if (!str3.equals("le_x6")) {
                                                            b12 = 99;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 165221241:
                                                        if (!str3.equals("A2016a40")) {
                                                            b12 = 100;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 182191441:
                                                        if (!str3.equals("CPY83_I00")) {
                                                            b12 = 101;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 245388979:
                                                        if (!str3.equals("marino_f")) {
                                                            b12 = 102;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 287431619:
                                                        if (!str3.equals("griffin")) {
                                                            b12 = 103;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 307593612:
                                                        if (!str3.equals("A7010a48")) {
                                                            b12 = 104;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 308517133:
                                                        if (!str3.equals("A7020a48")) {
                                                            b12 = 105;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 316215098:
                                                        if (!str3.equals("TB3-730F")) {
                                                            b12 = 106;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 316215116:
                                                        if (!str3.equals("TB3-730X")) {
                                                            b12 = 107;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 316246811:
                                                        if (!str3.equals("TB3-850F")) {
                                                            b12 = 108;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 316246818:
                                                        if (!str3.equals("TB3-850M")) {
                                                            b12 = 109;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 407160593:
                                                        if (!str3.equals("Pixi5-10_4G")) {
                                                            b12 = 110;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 507412548:
                                                        if (!str3.equals("QM16XE_U")) {
                                                            b12 = 111;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 793982701:
                                                        if (!str3.equals("GIONEE_WBL5708")) {
                                                            b12 = 112;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 794038622:
                                                        if (!str3.equals("GIONEE_WBL7365")) {
                                                            b12 = 113;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 794040393:
                                                        if (!str3.equals("GIONEE_WBL7519")) {
                                                            b12 = 114;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 835649806:
                                                        if (!str3.equals("manning")) {
                                                            b12 = 115;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 917340916:
                                                        if (!str3.equals("A7000plus")) {
                                                            b12 = 116;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 958008161:
                                                        if (!str3.equals("j2xlteins")) {
                                                            b12 = 117;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 1060579533:
                                                        if (!str3.equals("panell_d")) {
                                                            b12 = 118;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 1150207623:
                                                        if (!str3.equals("LS-5017")) {
                                                            b12 = 119;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 1176899427:
                                                        if (!str3.equals("itel_S41")) {
                                                            b12 = 120;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 1280332038:
                                                        if (!str3.equals("hwALE-H")) {
                                                            b12 = 121;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 1306947716:
                                                        if (!str3.equals("EverStar_S")) {
                                                            b12 = 122;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 1349174697:
                                                        if (!str3.equals("htc_e56ml_dtul")) {
                                                            b12 = 123;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 1522194893:
                                                        if (!str3.equals("woods_f")) {
                                                            b12 = 124;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 1691543273:
                                                        if (!str3.equals("CPH1609")) {
                                                            b12 = 125;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 1691544261:
                                                        if (!str3.equals("CPH1715")) {
                                                            b12 = 126;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 1709443163:
                                                        if (!str3.equals("iball8735_9806")) {
                                                            b12 = 127;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 1865889110:
                                                        if (!str3.equals("santoni")) {
                                                            b12 = 128;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 1906253259:
                                                        if (!str3.equals("PB2-670M")) {
                                                            b12 = 129;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 1977196784:
                                                        if (!str3.equals("Infinix-X572")) {
                                                            b12 = 130;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 2006372676:
                                                        if (!str3.equals("BRAVIA_ATV3_4K")) {
                                                            b12 = 131;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 2019281702:
                                                        if (!str3.equals("DM-01K")) {
                                                            b12 = 132;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 2029784656:
                                                        if (!str3.equals("HWBLN-H")) {
                                                            b12 = 133;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 2030379515:
                                                        if (!str3.equals("HWCAM-H")) {
                                                            b12 = 134;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 2033393791:
                                                        if (!str3.equals("ASUS_X00AD_2")) {
                                                            b12 = 135;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 2047190025:
                                                        if (!str3.equals("ELUGA_Note")) {
                                                            b12 = 136;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 2047252157:
                                                        if (!str3.equals("ELUGA_Prim")) {
                                                            b12 = 137;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 2048319463:
                                                        if (!str3.equals("HWVNS-H")) {
                                                            b12 = 138;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    case 2048855701:
                                                        if (!str3.equals("HWWAS-H")) {
                                                            b12 = 139;
                                                        } else {
                                                            b12 = -1;
                                                        }
                                                        break;
                                                    default:
                                                        b12 = -1;
                                                        break;
                                                }
                                                switch (b12) {
                                                    default:
                                                        if (str2.equals("JSN-L21")) {
                                                        }
                                                    case 0:
                                                    case 1:
                                                    case 2:
                                                    case 3:
                                                    case 4:
                                                    case 5:
                                                    case 6:
                                                    case 7:
                                                    case 8:
                                                    case 9:
                                                    case 10:
                                                    case 11:
                                                    case 12:
                                                    case 13:
                                                    case 14:
                                                    case 15:
                                                    case 16:
                                                    case 17:
                                                    case 18:
                                                    case 19:
                                                    case 20:
                                                    case 21:
                                                    case 22:
                                                    case 23:
                                                    case 24:
                                                    case 25:
                                                    case 26:
                                                    case 27:
                                                    case 28:
                                                    case 29:
                                                    case 30:
                                                    case 31:
                                                    case 32:
                                                    case 33:
                                                    case 34:
                                                    case 35:
                                                    case 36:
                                                    case 37:
                                                    case 38:
                                                    case 39:
                                                    case 40:
                                                    case 41:
                                                    case 42:
                                                    case 43:
                                                    case 44:
                                                    case 45:
                                                    case 46:
                                                    case 47:
                                                    case 48:
                                                    case 49:
                                                    case 50:
                                                    case 51:
                                                    case 52:
                                                    case 53:
                                                    case 54:
                                                    case 55:
                                                    case 56:
                                                    case 57:
                                                    case 58:
                                                    case 59:
                                                    case 60:
                                                    case 61:
                                                    case 62:
                                                    case 63:
                                                    case 64:
                                                    case 65:
                                                    case 66:
                                                    case 67:
                                                    case 68:
                                                    case 69:
                                                    case 70:
                                                    case 71:
                                                    case 72:
                                                    case 73:
                                                    case 74:
                                                    case 75:
                                                    case 76:
                                                    case 77:
                                                    case 78:
                                                    case 79:
                                                    case 80:
                                                    case 81:
                                                    case 82:
                                                    case 83:
                                                    case 84:
                                                    case 85:
                                                    case 86:
                                                    case 87:
                                                    case 88:
                                                    case 89:
                                                    case 90:
                                                    case 91:
                                                    case 92:
                                                    case 93:
                                                    case 94:
                                                    case 95:
                                                    case 96:
                                                    case 97:
                                                    case 98:
                                                    case 99:
                                                    case 100:
                                                    case 101:
                                                    case 102:
                                                    case 103:
                                                    case 104:
                                                    case 105:
                                                    case 106:
                                                    case 107:
                                                    case 108:
                                                    case 109:
                                                    case 110:
                                                    case 111:
                                                    case 112:
                                                    case 113:
                                                    case 114:
                                                    case 115:
                                                    case 116:
                                                    case 117:
                                                    case 118:
                                                    case 119:
                                                    case 120:
                                                    case 121:
                                                    case 122:
                                                    case 123:
                                                    case 124:
                                                    case 125:
                                                    case 126:
                                                    case 127:
                                                    case 128:
                                                    case 129:
                                                    case 130:
                                                    case 131:
                                                    case 132:
                                                    case 133:
                                                    case 134:
                                                    case 135:
                                                    case 136:
                                                    case 137:
                                                    case 138:
                                                    case 139:
                                                        z10 = true;
                                                        break;
                                                }
                                            }
                                        case 0:
                                        case 1:
                                        case 2:
                                        case 3:
                                        case 4:
                                        case 5:
                                        case 6:
                                        case 7:
                                        case 8:
                                            z10 = true;
                                            break;
                                    }
                                }
                            case 0:
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                            case 7:
                                z10 = true;
                                break;
                        }
                    } else if (i10 <= 27) {
                        str2 = g0.d;
                        str2.getClass();
                        switch (str2.hashCode()) {
                            case -349662828:
                                if (!str2.equals("AFTJMST12")) {
                                    b10 = 0;
                                } else {
                                    b10 = -1;
                                }
                                break;
                            case -321033677:
                                if (!str2.equals("AFTKMST12")) {
                                    b10 = 1;
                                } else {
                                    b10 = -1;
                                }
                                break;
                            case 2006354:
                                if (!str2.equals("AFTA")) {
                                    b10 = 2;
                                } else {
                                    b10 = -1;
                                }
                                break;
                            case 2006367:
                                if (!str2.equals("AFTN")) {
                                    b10 = 3;
                                } else {
                                    b10 = -1;
                                }
                                break;
                            case 2006371:
                                if (!str2.equals("AFTR")) {
                                    b10 = 4;
                                } else {
                                    b10 = -1;
                                }
                                break;
                            case 1785421873:
                                if (!str2.equals("AFTEU011")) {
                                    b10 = 5;
                                } else {
                                    b10 = -1;
                                }
                                break;
                            case 1785421876:
                                if (!str2.equals("AFTEU014")) {
                                    b10 = 6;
                                } else {
                                    b10 = -1;
                                }
                                break;
                            case 1798172390:
                                if (!str2.equals("AFTSO001")) {
                                    b10 = 7;
                                } else {
                                    b10 = -1;
                                }
                                break;
                            case 2119412532:
                                if (!str2.equals("AFTEUFF014")) {
                                    b10 = 8;
                                } else {
                                    b10 = -1;
                                }
                                break;
                            default:
                                b10 = -1;
                                break;
                        }
                        switch (b10) {
                            default:
                                if (i10 <= 26) {
                                    str3 = g0.f4796b;
                                    str3.getClass();
                                    switch (str3.hashCode()) {
                                        case -2144781245:
                                            if (!str3.equals("GIONEE_SWW1609")) {
                                                b12 = 0;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case -2144781185:
                                            if (!str3.equals("GIONEE_SWW1627")) {
                                                b12 = 1;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case -2144781160:
                                            if (!str3.equals("GIONEE_SWW1631")) {
                                                b12 = 2;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case -2097309513:
                                            if (!str3.equals("K50a40")) {
                                                b12 = 3;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case -2022874474:
                                            if (!str3.equals("CP8676_I02")) {
                                                b12 = 4;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case -1978993182:
                                            if (!str3.equals("NX541J")) {
                                                b12 = 5;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case -1978990237:
                                            if (!str3.equals("NX573J")) {
                                                b12 = 6;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case -1936688988:
                                            if (!str3.equals("PGN528")) {
                                                b12 = 7;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case -1936688066:
                                            if (!str3.equals("PGN610")) {
                                                b12 = 8;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case -1936688065:
                                            if (!str3.equals("PGN611")) {
                                                b12 = 9;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case -1931988508:
                                            if (!str3.equals("AquaPowerM")) {
                                                b12 = 10;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case -1885099851:
                                            if (!str3.equals("RAIJIN")) {
                                                b12 = 11;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case -1696512866:
                                            if (!str3.equals("XT1663")) {
                                                b12 = 12;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case -1680025915:
                                            if (!str3.equals("ComioS1")) {
                                                b12 = 13;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case -1615810839:
                                            if (!str3.equals("Phantom6")) {
                                                b12 = 14;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case -1600724499:
                                            if (!str3.equals("pacificrim")) {
                                                b12 = 15;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case -1554255044:
                                            if (!str3.equals("vernee_M5")) {
                                                b12 = 16;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case -1481772737:
                                            if (!str3.equals("panell_dl")) {
                                                b12 = 17;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case -1481772730:
                                            if (!str3.equals("panell_ds")) {
                                                b12 = 18;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case -1481772729:
                                            if (!str3.equals("panell_dt")) {
                                                b12 = 19;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case -1320080169:
                                            if (!str3.equals("GiONEE_GBL7319")) {
                                                b12 = 20;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case -1217592143:
                                            if (!str3.equals("BRAVIA_ATV2")) {
                                                b12 = 21;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case -1180384755:
                                            if (!str3.equals("iris60")) {
                                                b12 = 22;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case -1139198265:
                                            if (!str3.equals("Slate_Pro")) {
                                                b12 = 23;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case -1052835013:
                                            if (!str3.equals("namath")) {
                                                b12 = 24;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case -993250464:
                                            if (!str3.equals("A10-70F")) {
                                                b12 = 25;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case -993250458:
                                            if (!str3.equals("A10-70L")) {
                                                b12 = 26;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case -965403638:
                                            if (!str3.equals("s905x018")) {
                                                b12 = 27;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case -958336948:
                                            if (!str3.equals("ELUGA_Ray_X")) {
                                                b12 = -1;
                                            }
                                            break;
                                        case -879245230:
                                            if (!str3.equals("tcl_eu")) {
                                                b12 = 29;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case -842500323:
                                            if (!str3.equals("nicklaus_f")) {
                                                b12 = 30;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case -821392978:
                                            if (!str3.equals("A7000-a")) {
                                                b12 = 31;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case -797483286:
                                            if (!str3.equals("SVP-DTV15")) {
                                                b12 = 32;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case -794946968:
                                            if (!str3.equals("watson")) {
                                                b12 = 33;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case -788334647:
                                            if (!str3.equals("whyred")) {
                                                b12 = 34;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case -782144577:
                                            if (!str3.equals("OnePlus5T")) {
                                                b12 = 35;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case -575125681:
                                            if (!str3.equals("GiONEE_CBL7513")) {
                                                b12 = 36;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case -521118391:
                                            if (!str3.equals("GIONEE_GBL7360")) {
                                                b12 = 37;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case -430914369:
                                            if (!str3.equals("Pixi4-7_3G")) {
                                                b12 = 38;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case -290434366:
                                            if (!str3.equals("taido_row")) {
                                                b12 = 39;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case -282781963:
                                            if (!str3.equals("BLACK-1X")) {
                                                b12 = 40;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case -277133239:
                                            if (!str3.equals("Z12_PRO")) {
                                                b12 = 41;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case -173639913:
                                            if (!str3.equals("ELUGA_A3_Pro")) {
                                                b12 = 42;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case -56598463:
                                            if (!str3.equals("woods_fn")) {
                                                b12 = 43;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 2126:
                                            if (!str3.equals("C1")) {
                                                b12 = 44;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 2564:
                                            if (!str3.equals("Q5")) {
                                                b12 = 45;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 2715:
                                            if (!str3.equals("V1")) {
                                                b12 = 46;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 2719:
                                            if (!str3.equals("V5")) {
                                                b12 = 47;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 3091:
                                            if (!str3.equals("b5")) {
                                                b12 = 48;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 3483:
                                            if (!str3.equals("mh")) {
                                                b12 = 49;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 73405:
                                            if (!str3.equals("JGZ")) {
                                                b12 = 50;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 75537:
                                            if (!str3.equals("M04")) {
                                                b12 = 51;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 75739:
                                            if (!str3.equals("M5c")) {
                                                b12 = 52;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 76779:
                                            if (!str3.equals("MX6")) {
                                                b12 = 53;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 78669:
                                            if (!str3.equals("P85")) {
                                                b12 = 54;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 79305:
                                            if (!str3.equals("PLE")) {
                                                b12 = 55;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 80618:
                                            if (!str3.equals("QX1")) {
                                                b12 = 56;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 88274:
                                            if (!str3.equals("Z80")) {
                                                b12 = 57;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 98846:
                                            if (!str3.equals("cv1")) {
                                                b12 = 58;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 98848:
                                            if (!str3.equals("cv3")) {
                                                b12 = 59;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 99329:
                                            if (!str3.equals("deb")) {
                                                b12 = 60;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 101481:
                                            if (!str3.equals("flo")) {
                                                b12 = 61;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 1513190:
                                            if (!str3.equals("1601")) {
                                                b12 = 62;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 1514184:
                                            if (!str3.equals("1713")) {
                                                b12 = 63;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 1514185:
                                            if (!str3.equals("1714")) {
                                                b12 = 64;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 2133089:
                                            if (!str3.equals("F01H")) {
                                                b12 = 65;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 2133091:
                                            if (!str3.equals("F01J")) {
                                                b12 = 66;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 2133120:
                                            if (!str3.equals("F02H")) {
                                                b12 = 67;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 2133151:
                                            if (!str3.equals("F03H")) {
                                                b12 = 68;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 2133182:
                                            if (!str3.equals("F04H")) {
                                                b12 = 69;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 2133184:
                                            if (!str3.equals("F04J")) {
                                                b12 = 70;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 2436959:
                                            if (!str3.equals("P681")) {
                                                b12 = 71;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 2463773:
                                            if (!str3.equals("Q350")) {
                                                b12 = 72;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 2464648:
                                            if (!str3.equals("Q427")) {
                                                b12 = 73;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 2689555:
                                            if (!str3.equals("XE2X")) {
                                                b12 = 74;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 3154429:
                                            if (!str3.equals("fugu")) {
                                                b12 = 75;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 3284551:
                                            if (!str3.equals("kate")) {
                                                b12 = 76;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 3351335:
                                            if (!str3.equals("mido")) {
                                                b12 = 77;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 3386211:
                                            if (!str3.equals("p212")) {
                                                b12 = 78;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 41325051:
                                            if (!str3.equals("MEIZU_M5")) {
                                                b12 = 79;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 51349633:
                                            if (!str3.equals("601LV")) {
                                                b12 = 80;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 51350594:
                                            if (!str3.equals("602LV")) {
                                                b12 = 81;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 55178625:
                                            if (!str3.equals("Aura_Note_2")) {
                                                b12 = 82;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 61542055:
                                            if (!str3.equals("A1601")) {
                                                b12 = 83;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 65355429:
                                            if (!str3.equals("E5643")) {
                                                b12 = 84;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 66214468:
                                            if (!str3.equals("F3111")) {
                                                b12 = 85;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 66214470:
                                            if (!str3.equals("F3113")) {
                                                b12 = 86;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 66214473:
                                            if (!str3.equals("F3116")) {
                                                b12 = 87;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 66215429:
                                            if (!str3.equals("F3211")) {
                                                b12 = 88;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 66215431:
                                            if (!str3.equals("F3213")) {
                                                b12 = 89;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 66215433:
                                            if (!str3.equals("F3215")) {
                                                b12 = 90;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 66216390:
                                            if (!str3.equals("F3311")) {
                                                b12 = 91;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 76402249:
                                            if (!str3.equals("PRO7S")) {
                                                b12 = 92;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 76404105:
                                            if (!str3.equals("Q4260")) {
                                                b12 = 93;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 76404911:
                                            if (!str3.equals("Q4310")) {
                                                b12 = 94;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 80963634:
                                            if (!str3.equals("V23GB")) {
                                                b12 = 95;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 82882791:
                                            if (!str3.equals("X3_HK")) {
                                                b12 = 96;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 98715550:
                                            if (!str3.equals("i9031")) {
                                                b12 = 97;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 101370885:
                                            if (!str3.equals("l5460")) {
                                                b12 = 98;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 102844228:
                                            if (!str3.equals("le_x6")) {
                                                b12 = 99;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 165221241:
                                            if (!str3.equals("A2016a40")) {
                                                b12 = 100;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 182191441:
                                            if (!str3.equals("CPY83_I00")) {
                                                b12 = 101;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 245388979:
                                            if (!str3.equals("marino_f")) {
                                                b12 = 102;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 287431619:
                                            if (!str3.equals("griffin")) {
                                                b12 = 103;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 307593612:
                                            if (!str3.equals("A7010a48")) {
                                                b12 = 104;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 308517133:
                                            if (!str3.equals("A7020a48")) {
                                                b12 = 105;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 316215098:
                                            if (!str3.equals("TB3-730F")) {
                                                b12 = 106;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 316215116:
                                            if (!str3.equals("TB3-730X")) {
                                                b12 = 107;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 316246811:
                                            if (!str3.equals("TB3-850F")) {
                                                b12 = 108;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 316246818:
                                            if (!str3.equals("TB3-850M")) {
                                                b12 = 109;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 407160593:
                                            if (!str3.equals("Pixi5-10_4G")) {
                                                b12 = 110;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 507412548:
                                            if (!str3.equals("QM16XE_U")) {
                                                b12 = 111;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 793982701:
                                            if (!str3.equals("GIONEE_WBL5708")) {
                                                b12 = 112;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 794038622:
                                            if (!str3.equals("GIONEE_WBL7365")) {
                                                b12 = 113;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 794040393:
                                            if (!str3.equals("GIONEE_WBL7519")) {
                                                b12 = 114;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 835649806:
                                            if (!str3.equals("manning")) {
                                                b12 = 115;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 917340916:
                                            if (!str3.equals("A7000plus")) {
                                                b12 = 116;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 958008161:
                                            if (!str3.equals("j2xlteins")) {
                                                b12 = 117;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 1060579533:
                                            if (!str3.equals("panell_d")) {
                                                b12 = 118;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 1150207623:
                                            if (!str3.equals("LS-5017")) {
                                                b12 = 119;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 1176899427:
                                            if (!str3.equals("itel_S41")) {
                                                b12 = 120;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 1280332038:
                                            if (!str3.equals("hwALE-H")) {
                                                b12 = 121;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 1306947716:
                                            if (!str3.equals("EverStar_S")) {
                                                b12 = 122;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 1349174697:
                                            if (!str3.equals("htc_e56ml_dtul")) {
                                                b12 = 123;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 1522194893:
                                            if (!str3.equals("woods_f")) {
                                                b12 = 124;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 1691543273:
                                            if (!str3.equals("CPH1609")) {
                                                b12 = 125;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 1691544261:
                                            if (!str3.equals("CPH1715")) {
                                                b12 = 126;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 1709443163:
                                            if (!str3.equals("iball8735_9806")) {
                                                b12 = 127;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 1865889110:
                                            if (!str3.equals("santoni")) {
                                                b12 = 128;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 1906253259:
                                            if (!str3.equals("PB2-670M")) {
                                                b12 = 129;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 1977196784:
                                            if (!str3.equals("Infinix-X572")) {
                                                b12 = 130;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 2006372676:
                                            if (!str3.equals("BRAVIA_ATV3_4K")) {
                                                b12 = 131;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 2019281702:
                                            if (!str3.equals("DM-01K")) {
                                                b12 = 132;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 2029784656:
                                            if (!str3.equals("HWBLN-H")) {
                                                b12 = 133;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 2030379515:
                                            if (!str3.equals("HWCAM-H")) {
                                                b12 = 134;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 2033393791:
                                            if (!str3.equals("ASUS_X00AD_2")) {
                                                b12 = 135;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 2047190025:
                                            if (!str3.equals("ELUGA_Note")) {
                                                b12 = 136;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 2047252157:
                                            if (!str3.equals("ELUGA_Prim")) {
                                                b12 = 137;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 2048319463:
                                            if (!str3.equals("HWVNS-H")) {
                                                b12 = 138;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        case 2048855701:
                                            if (!str3.equals("HWWAS-H")) {
                                                b12 = 139;
                                            } else {
                                                b12 = -1;
                                            }
                                            break;
                                        default:
                                            b12 = -1;
                                            break;
                                    }
                                    switch (b12) {
                                        default:
                                            if (str2.equals("JSN-L21")) {
                                            }
                                        case 0:
                                        case 1:
                                        case 2:
                                        case 3:
                                        case 4:
                                        case 5:
                                        case 6:
                                        case 7:
                                        case 8:
                                        case 9:
                                        case 10:
                                        case 11:
                                        case 12:
                                        case 13:
                                        case 14:
                                        case 15:
                                        case 16:
                                        case 17:
                                        case 18:
                                        case 19:
                                        case 20:
                                        case 21:
                                        case 22:
                                        case 23:
                                        case 24:
                                        case 25:
                                        case 26:
                                        case 27:
                                        case 28:
                                        case 29:
                                        case 30:
                                        case 31:
                                        case 32:
                                        case 33:
                                        case 34:
                                        case 35:
                                        case 36:
                                        case 37:
                                        case 38:
                                        case 39:
                                        case 40:
                                        case 41:
                                        case 42:
                                        case 43:
                                        case 44:
                                        case 45:
                                        case 46:
                                        case 47:
                                        case 48:
                                        case 49:
                                        case 50:
                                        case 51:
                                        case 52:
                                        case 53:
                                        case 54:
                                        case 55:
                                        case 56:
                                        case 57:
                                        case 58:
                                        case 59:
                                        case 60:
                                        case 61:
                                        case 62:
                                        case 63:
                                        case 64:
                                        case 65:
                                        case 66:
                                        case 67:
                                        case 68:
                                        case 69:
                                        case 70:
                                        case 71:
                                        case 72:
                                        case 73:
                                        case 74:
                                        case 75:
                                        case 76:
                                        case 77:
                                        case 78:
                                        case 79:
                                        case 80:
                                        case 81:
                                        case 82:
                                        case 83:
                                        case 84:
                                        case 85:
                                        case 86:
                                        case 87:
                                        case 88:
                                        case 89:
                                        case 90:
                                        case 91:
                                        case 92:
                                        case 93:
                                        case 94:
                                        case 95:
                                        case 96:
                                        case 97:
                                        case 98:
                                        case 99:
                                        case 100:
                                        case 101:
                                        case 102:
                                        case 103:
                                        case 104:
                                        case 105:
                                        case 106:
                                        case 107:
                                        case 108:
                                        case 109:
                                        case 110:
                                        case 111:
                                        case 112:
                                        case 113:
                                        case 114:
                                        case 115:
                                        case 116:
                                        case 117:
                                        case 118:
                                        case 119:
                                        case 120:
                                        case 121:
                                        case 122:
                                        case 123:
                                        case 124:
                                        case 125:
                                        case 126:
                                        case 127:
                                        case 128:
                                        case 129:
                                        case 130:
                                        case 131:
                                        case 132:
                                        case 133:
                                        case 134:
                                        case 135:
                                        case 136:
                                        case 137:
                                        case 138:
                                        case 139:
                                            z10 = true;
                                            break;
                                    }
                                }
                            case 0:
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                            case 7:
                            case 8:
                                z10 = true;
                                break;
                        }
                    } else {
                        str2 = g0.d;
                        str2.getClass();
                        switch (str2.hashCode()) {
                            case -349662828:
                                if (!str2.equals("AFTJMST12")) {
                                    b10 = -1;
                                } else {
                                    b10 = 0;
                                }
                                break;
                            case -321033677:
                                if (!str2.equals("AFTKMST12")) {
                                    b10 = -1;
                                } else {
                                    b10 = 1;
                                }
                                break;
                            case 2006354:
                                if (!str2.equals("AFTA")) {
                                    b10 = -1;
                                } else {
                                    b10 = 2;
                                }
                                break;
                            case 2006367:
                                if (!str2.equals("AFTN")) {
                                    b10 = -1;
                                } else {
                                    b10 = 3;
                                }
                                break;
                            case 2006371:
                                if (!str2.equals("AFTR")) {
                                    b10 = -1;
                                } else {
                                    b10 = 4;
                                }
                                break;
                            case 1785421873:
                                if (!str2.equals("AFTEU011")) {
                                    b10 = -1;
                                } else {
                                    b10 = 5;
                                }
                                break;
                            case 1785421876:
                                if (!str2.equals("AFTEU014")) {
                                    b10 = -1;
                                } else {
                                    b10 = 6;
                                }
                                break;
                            case 1798172390:
                                if (!str2.equals("AFTSO001")) {
                                    b10 = -1;
                                } else {
                                    b10 = 7;
                                }
                                break;
                            case 2119412532:
                                if (!str2.equals("AFTEUFF014")) {
                                    b10 = -1;
                                } else {
                                    b10 = 8;
                                }
                                break;
                            default:
                                b10 = -1;
                                break;
                        }
                        switch (b10) {
                            default:
                                if (i10 <= 26) {
                                    str3 = g0.f4796b;
                                    str3.getClass();
                                    switch (str3.hashCode()) {
                                        case -2144781245:
                                            if (!str3.equals("GIONEE_SWW1609")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 0;
                                            }
                                            break;
                                        case -2144781185:
                                            if (!str3.equals("GIONEE_SWW1627")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 1;
                                            }
                                            break;
                                        case -2144781160:
                                            if (!str3.equals("GIONEE_SWW1631")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 2;
                                            }
                                            break;
                                        case -2097309513:
                                            if (!str3.equals("K50a40")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 3;
                                            }
                                            break;
                                        case -2022874474:
                                            if (!str3.equals("CP8676_I02")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 4;
                                            }
                                            break;
                                        case -1978993182:
                                            if (!str3.equals("NX541J")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 5;
                                            }
                                            break;
                                        case -1978990237:
                                            if (!str3.equals("NX573J")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 6;
                                            }
                                            break;
                                        case -1936688988:
                                            if (!str3.equals("PGN528")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 7;
                                            }
                                            break;
                                        case -1936688066:
                                            if (!str3.equals("PGN610")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 8;
                                            }
                                            break;
                                        case -1936688065:
                                            if (!str3.equals("PGN611")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 9;
                                            }
                                            break;
                                        case -1931988508:
                                            if (!str3.equals("AquaPowerM")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 10;
                                            }
                                            break;
                                        case -1885099851:
                                            if (!str3.equals("RAIJIN")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 11;
                                            }
                                            break;
                                        case -1696512866:
                                            if (!str3.equals("XT1663")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 12;
                                            }
                                            break;
                                        case -1680025915:
                                            if (!str3.equals("ComioS1")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 13;
                                            }
                                            break;
                                        case -1615810839:
                                            if (!str3.equals("Phantom6")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 14;
                                            }
                                            break;
                                        case -1600724499:
                                            if (!str3.equals("pacificrim")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 15;
                                            }
                                            break;
                                        case -1554255044:
                                            if (!str3.equals("vernee_M5")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 16;
                                            }
                                            break;
                                        case -1481772737:
                                            if (!str3.equals("panell_dl")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 17;
                                            }
                                            break;
                                        case -1481772730:
                                            if (!str3.equals("panell_ds")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 18;
                                            }
                                            break;
                                        case -1481772729:
                                            if (!str3.equals("panell_dt")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 19;
                                            }
                                            break;
                                        case -1320080169:
                                            if (!str3.equals("GiONEE_GBL7319")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 20;
                                            }
                                            break;
                                        case -1217592143:
                                            if (!str3.equals("BRAVIA_ATV2")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 21;
                                            }
                                            break;
                                        case -1180384755:
                                            if (!str3.equals("iris60")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 22;
                                            }
                                            break;
                                        case -1139198265:
                                            if (!str3.equals("Slate_Pro")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 23;
                                            }
                                            break;
                                        case -1052835013:
                                            if (!str3.equals("namath")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 24;
                                            }
                                            break;
                                        case -993250464:
                                            if (!str3.equals("A10-70F")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 25;
                                            }
                                            break;
                                        case -993250458:
                                            if (!str3.equals("A10-70L")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 26;
                                            }
                                            break;
                                        case -965403638:
                                            if (!str3.equals("s905x018")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 27;
                                            }
                                            break;
                                        case -958336948:
                                            if (!str3.equals("ELUGA_Ray_X")) {
                                                b12 = -1;
                                            }
                                            break;
                                        case -879245230:
                                            if (!str3.equals("tcl_eu")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 29;
                                            }
                                            break;
                                        case -842500323:
                                            if (!str3.equals("nicklaus_f")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 30;
                                            }
                                            break;
                                        case -821392978:
                                            if (!str3.equals("A7000-a")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 31;
                                            }
                                            break;
                                        case -797483286:
                                            if (!str3.equals("SVP-DTV15")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 32;
                                            }
                                            break;
                                        case -794946968:
                                            if (!str3.equals("watson")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 33;
                                            }
                                            break;
                                        case -788334647:
                                            if (!str3.equals("whyred")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 34;
                                            }
                                            break;
                                        case -782144577:
                                            if (!str3.equals("OnePlus5T")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 35;
                                            }
                                            break;
                                        case -575125681:
                                            if (!str3.equals("GiONEE_CBL7513")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 36;
                                            }
                                            break;
                                        case -521118391:
                                            if (!str3.equals("GIONEE_GBL7360")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 37;
                                            }
                                            break;
                                        case -430914369:
                                            if (!str3.equals("Pixi4-7_3G")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 38;
                                            }
                                            break;
                                        case -290434366:
                                            if (!str3.equals("taido_row")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 39;
                                            }
                                            break;
                                        case -282781963:
                                            if (!str3.equals("BLACK-1X")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 40;
                                            }
                                            break;
                                        case -277133239:
                                            if (!str3.equals("Z12_PRO")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 41;
                                            }
                                            break;
                                        case -173639913:
                                            if (!str3.equals("ELUGA_A3_Pro")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 42;
                                            }
                                            break;
                                        case -56598463:
                                            if (!str3.equals("woods_fn")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 43;
                                            }
                                            break;
                                        case 2126:
                                            if (!str3.equals("C1")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 44;
                                            }
                                            break;
                                        case 2564:
                                            if (!str3.equals("Q5")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 45;
                                            }
                                            break;
                                        case 2715:
                                            if (!str3.equals("V1")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 46;
                                            }
                                            break;
                                        case 2719:
                                            if (!str3.equals("V5")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 47;
                                            }
                                            break;
                                        case 3091:
                                            if (!str3.equals("b5")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 48;
                                            }
                                            break;
                                        case 3483:
                                            if (!str3.equals("mh")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 49;
                                            }
                                            break;
                                        case 73405:
                                            if (!str3.equals("JGZ")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 50;
                                            }
                                            break;
                                        case 75537:
                                            if (!str3.equals("M04")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 51;
                                            }
                                            break;
                                        case 75739:
                                            if (!str3.equals("M5c")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 52;
                                            }
                                            break;
                                        case 76779:
                                            if (!str3.equals("MX6")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 53;
                                            }
                                            break;
                                        case 78669:
                                            if (!str3.equals("P85")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 54;
                                            }
                                            break;
                                        case 79305:
                                            if (!str3.equals("PLE")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 55;
                                            }
                                            break;
                                        case 80618:
                                            if (!str3.equals("QX1")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 56;
                                            }
                                            break;
                                        case 88274:
                                            if (!str3.equals("Z80")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 57;
                                            }
                                            break;
                                        case 98846:
                                            if (!str3.equals("cv1")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 58;
                                            }
                                            break;
                                        case 98848:
                                            if (!str3.equals("cv3")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 59;
                                            }
                                            break;
                                        case 99329:
                                            if (!str3.equals("deb")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 60;
                                            }
                                            break;
                                        case 101481:
                                            if (!str3.equals("flo")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 61;
                                            }
                                            break;
                                        case 1513190:
                                            if (!str3.equals("1601")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 62;
                                            }
                                            break;
                                        case 1514184:
                                            if (!str3.equals("1713")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 63;
                                            }
                                            break;
                                        case 1514185:
                                            if (!str3.equals("1714")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 64;
                                            }
                                            break;
                                        case 2133089:
                                            if (!str3.equals("F01H")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 65;
                                            }
                                            break;
                                        case 2133091:
                                            if (!str3.equals("F01J")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 66;
                                            }
                                            break;
                                        case 2133120:
                                            if (!str3.equals("F02H")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 67;
                                            }
                                            break;
                                        case 2133151:
                                            if (!str3.equals("F03H")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 68;
                                            }
                                            break;
                                        case 2133182:
                                            if (!str3.equals("F04H")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 69;
                                            }
                                            break;
                                        case 2133184:
                                            if (!str3.equals("F04J")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 70;
                                            }
                                            break;
                                        case 2436959:
                                            if (!str3.equals("P681")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 71;
                                            }
                                            break;
                                        case 2463773:
                                            if (!str3.equals("Q350")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 72;
                                            }
                                            break;
                                        case 2464648:
                                            if (!str3.equals("Q427")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 73;
                                            }
                                            break;
                                        case 2689555:
                                            if (!str3.equals("XE2X")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 74;
                                            }
                                            break;
                                        case 3154429:
                                            if (!str3.equals("fugu")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 75;
                                            }
                                            break;
                                        case 3284551:
                                            if (!str3.equals("kate")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 76;
                                            }
                                            break;
                                        case 3351335:
                                            if (!str3.equals("mido")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 77;
                                            }
                                            break;
                                        case 3386211:
                                            if (!str3.equals("p212")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 78;
                                            }
                                            break;
                                        case 41325051:
                                            if (!str3.equals("MEIZU_M5")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 79;
                                            }
                                            break;
                                        case 51349633:
                                            if (!str3.equals("601LV")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 80;
                                            }
                                            break;
                                        case 51350594:
                                            if (!str3.equals("602LV")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 81;
                                            }
                                            break;
                                        case 55178625:
                                            if (!str3.equals("Aura_Note_2")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 82;
                                            }
                                            break;
                                        case 61542055:
                                            if (!str3.equals("A1601")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 83;
                                            }
                                            break;
                                        case 65355429:
                                            if (!str3.equals("E5643")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 84;
                                            }
                                            break;
                                        case 66214468:
                                            if (!str3.equals("F3111")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 85;
                                            }
                                            break;
                                        case 66214470:
                                            if (!str3.equals("F3113")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 86;
                                            }
                                            break;
                                        case 66214473:
                                            if (!str3.equals("F3116")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 87;
                                            }
                                            break;
                                        case 66215429:
                                            if (!str3.equals("F3211")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 88;
                                            }
                                            break;
                                        case 66215431:
                                            if (!str3.equals("F3213")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 89;
                                            }
                                            break;
                                        case 66215433:
                                            if (!str3.equals("F3215")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 90;
                                            }
                                            break;
                                        case 66216390:
                                            if (!str3.equals("F3311")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 91;
                                            }
                                            break;
                                        case 76402249:
                                            if (!str3.equals("PRO7S")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 92;
                                            }
                                            break;
                                        case 76404105:
                                            if (!str3.equals("Q4260")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 93;
                                            }
                                            break;
                                        case 76404911:
                                            if (!str3.equals("Q4310")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 94;
                                            }
                                            break;
                                        case 80963634:
                                            if (!str3.equals("V23GB")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 95;
                                            }
                                            break;
                                        case 82882791:
                                            if (!str3.equals("X3_HK")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 96;
                                            }
                                            break;
                                        case 98715550:
                                            if (!str3.equals("i9031")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 97;
                                            }
                                            break;
                                        case 101370885:
                                            if (!str3.equals("l5460")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 98;
                                            }
                                            break;
                                        case 102844228:
                                            if (!str3.equals("le_x6")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 99;
                                            }
                                            break;
                                        case 165221241:
                                            if (!str3.equals("A2016a40")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 100;
                                            }
                                            break;
                                        case 182191441:
                                            if (!str3.equals("CPY83_I00")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 101;
                                            }
                                            break;
                                        case 245388979:
                                            if (!str3.equals("marino_f")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 102;
                                            }
                                            break;
                                        case 287431619:
                                            if (!str3.equals("griffin")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 103;
                                            }
                                            break;
                                        case 307593612:
                                            if (!str3.equals("A7010a48")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 104;
                                            }
                                            break;
                                        case 308517133:
                                            if (!str3.equals("A7020a48")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 105;
                                            }
                                            break;
                                        case 316215098:
                                            if (!str3.equals("TB3-730F")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 106;
                                            }
                                            break;
                                        case 316215116:
                                            if (!str3.equals("TB3-730X")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 107;
                                            }
                                            break;
                                        case 316246811:
                                            if (!str3.equals("TB3-850F")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 108;
                                            }
                                            break;
                                        case 316246818:
                                            if (!str3.equals("TB3-850M")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 109;
                                            }
                                            break;
                                        case 407160593:
                                            if (!str3.equals("Pixi5-10_4G")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 110;
                                            }
                                            break;
                                        case 507412548:
                                            if (!str3.equals("QM16XE_U")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 111;
                                            }
                                            break;
                                        case 793982701:
                                            if (!str3.equals("GIONEE_WBL5708")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 112;
                                            }
                                            break;
                                        case 794038622:
                                            if (!str3.equals("GIONEE_WBL7365")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 113;
                                            }
                                            break;
                                        case 794040393:
                                            if (!str3.equals("GIONEE_WBL7519")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 114;
                                            }
                                            break;
                                        case 835649806:
                                            if (!str3.equals("manning")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 115;
                                            }
                                            break;
                                        case 917340916:
                                            if (!str3.equals("A7000plus")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 116;
                                            }
                                            break;
                                        case 958008161:
                                            if (!str3.equals("j2xlteins")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 117;
                                            }
                                            break;
                                        case 1060579533:
                                            if (!str3.equals("panell_d")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 118;
                                            }
                                            break;
                                        case 1150207623:
                                            if (!str3.equals("LS-5017")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 119;
                                            }
                                            break;
                                        case 1176899427:
                                            if (!str3.equals("itel_S41")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 120;
                                            }
                                            break;
                                        case 1280332038:
                                            if (!str3.equals("hwALE-H")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 121;
                                            }
                                            break;
                                        case 1306947716:
                                            if (!str3.equals("EverStar_S")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 122;
                                            }
                                            break;
                                        case 1349174697:
                                            if (!str3.equals("htc_e56ml_dtul")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 123;
                                            }
                                            break;
                                        case 1522194893:
                                            if (!str3.equals("woods_f")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 124;
                                            }
                                            break;
                                        case 1691543273:
                                            if (!str3.equals("CPH1609")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 125;
                                            }
                                            break;
                                        case 1691544261:
                                            if (!str3.equals("CPH1715")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 126;
                                            }
                                            break;
                                        case 1709443163:
                                            if (!str3.equals("iball8735_9806")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 127;
                                            }
                                            break;
                                        case 1865889110:
                                            if (!str3.equals("santoni")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 128;
                                            }
                                            break;
                                        case 1906253259:
                                            if (!str3.equals("PB2-670M")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 129;
                                            }
                                            break;
                                        case 1977196784:
                                            if (!str3.equals("Infinix-X572")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 130;
                                            }
                                            break;
                                        case 2006372676:
                                            if (!str3.equals("BRAVIA_ATV3_4K")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 131;
                                            }
                                            break;
                                        case 2019281702:
                                            if (!str3.equals("DM-01K")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 132;
                                            }
                                            break;
                                        case 2029784656:
                                            if (!str3.equals("HWBLN-H")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 133;
                                            }
                                            break;
                                        case 2030379515:
                                            if (!str3.equals("HWCAM-H")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 134;
                                            }
                                            break;
                                        case 2033393791:
                                            if (!str3.equals("ASUS_X00AD_2")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 135;
                                            }
                                            break;
                                        case 2047190025:
                                            if (!str3.equals("ELUGA_Note")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 136;
                                            }
                                            break;
                                        case 2047252157:
                                            if (!str3.equals("ELUGA_Prim")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 137;
                                            }
                                            break;
                                        case 2048319463:
                                            if (!str3.equals("HWVNS-H")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 138;
                                            }
                                            break;
                                        case 2048855701:
                                            if (!str3.equals("HWWAS-H")) {
                                                b12 = -1;
                                            } else {
                                                b12 = 139;
                                            }
                                            break;
                                        default:
                                            b12 = -1;
                                            break;
                                    }
                                    switch (b12) {
                                        default:
                                            if (str2.equals("JSN-L21")) {
                                            }
                                        case 0:
                                        case 1:
                                        case 2:
                                        case 3:
                                        case 4:
                                        case 5:
                                        case 6:
                                        case 7:
                                        case 8:
                                        case 9:
                                        case 10:
                                        case 11:
                                        case 12:
                                        case 13:
                                        case 14:
                                        case 15:
                                        case 16:
                                        case 17:
                                        case 18:
                                        case 19:
                                        case 20:
                                        case 21:
                                        case 22:
                                        case 23:
                                        case 24:
                                        case 25:
                                        case 26:
                                        case 27:
                                        case 28:
                                        case 29:
                                        case 30:
                                        case 31:
                                        case 32:
                                        case 33:
                                        case 34:
                                        case 35:
                                        case 36:
                                        case 37:
                                        case 38:
                                        case 39:
                                        case 40:
                                        case 41:
                                        case 42:
                                        case 43:
                                        case 44:
                                        case 45:
                                        case 46:
                                        case 47:
                                        case 48:
                                        case 49:
                                        case 50:
                                        case 51:
                                        case 52:
                                        case 53:
                                        case 54:
                                        case 55:
                                        case 56:
                                        case 57:
                                        case 58:
                                        case 59:
                                        case 60:
                                        case 61:
                                        case 62:
                                        case 63:
                                        case 64:
                                        case 65:
                                        case 66:
                                        case 67:
                                        case 68:
                                        case 69:
                                        case 70:
                                        case 71:
                                        case 72:
                                        case 73:
                                        case 74:
                                        case 75:
                                        case 76:
                                        case 77:
                                        case 78:
                                        case 79:
                                        case 80:
                                        case 81:
                                        case 82:
                                        case 83:
                                        case 84:
                                        case 85:
                                        case 86:
                                        case 87:
                                        case 88:
                                        case 89:
                                        case 90:
                                        case 91:
                                        case 92:
                                        case 93:
                                        case 94:
                                        case 95:
                                        case 96:
                                        case 97:
                                        case 98:
                                        case 99:
                                        case 100:
                                        case 101:
                                        case 102:
                                        case 103:
                                        case 104:
                                        case 105:
                                        case 106:
                                        case 107:
                                        case 108:
                                        case 109:
                                        case 110:
                                        case 111:
                                        case 112:
                                        case 113:
                                        case 114:
                                        case 115:
                                        case 116:
                                        case 117:
                                        case 118:
                                        case 119:
                                        case 120:
                                        case 121:
                                        case 122:
                                        case 123:
                                        case 124:
                                        case 125:
                                        case 126:
                                        case 127:
                                        case 128:
                                        case 129:
                                        case 130:
                                        case 131:
                                        case 132:
                                        case 133:
                                        case 134:
                                        case 135:
                                        case 136:
                                        case 137:
                                        case 138:
                                        case 139:
                                            z10 = true;
                                            break;
                                    }
                                }
                            case 0:
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                            case 7:
                            case 8:
                                z10 = true;
                                break;
                        }
                    }
                    f5252p1 = z10;
                    f5251o1 = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f5252p1;
    }

    public static int S(y3.n nVar, t0 t0Var) {
        int iIntValue;
        int i10 = t0Var.G;
        int i11 = t0Var.H;
        if (i10 != -1 && i11 != -1) {
            String str = t0Var.B;
            if ("video/dolby-vision".equals(str)) {
                Pair pairD = y3.w.d(t0Var);
                str = (pairD == null || !((iIntValue = ((Integer) pairD.first).intValue()) == 512 || iIntValue == 1 || iIntValue == 2)) ? "video/hevc" : "video/avc";
            }
            str.getClass();
            switch (str) {
                case "video/3gpp":
                case "video/av01":
                case "video/mp4v-es":
                case "video/x-vnd.on2.vp8":
                    return ((i10 * i11) * 3) / 4;
                case "video/hevc":
                    return Math.max(2097152, ((i10 * i11) * 3) / 4);
                case "video/avc":
                    String str2 = g0.d;
                    if (!"BRAVIA 4K 2015".equals(str2) && (!"Amazon".equals(g0.f4797c) || (!"KFSOWI".equals(str2) && (!"AFTS".equals(str2) || !nVar.f49499f)))) {
                        return ((g0.f(i11, 16) * g0.f(i10, 16)) * 768) / 4;
                    }
                    break;
                case "video/x-vnd.on2.vp9":
                    return ((i10 * i11) * 3) / 8;
            }
        }
        return -1;
    }

    public static z T(Context context, y3.r rVar, t0 t0Var, boolean z10, boolean z11) {
        String str = t0Var.B;
        if (str == null) {
            p8.x xVar = z.f45604b;
            return l0.f45555e;
        }
        rVar.getClass();
        List listE = y3.w.e(str, z10, z11);
        String strB = y3.w.b(t0Var);
        if (strB == null) {
            return z.u(listE);
        }
        List listE2 = y3.w.e(strB, z10, z11);
        if (g0.f4795a >= 26 && "video/dolby-vision".equals(t0Var.B) && !listE2.isEmpty() && !g.a(context)) {
            return z.u(listE2);
        }
        p8.x xVar2 = z.f45604b;
        p8.w wVar = new p8.w();
        wVar.b(listE);
        wVar.b(listE2);
        return wVar.c();
    }

    public static int U(y3.n nVar, t0 t0Var) {
        int i10 = t0Var.C;
        List list = t0Var.D;
        if (i10 == -1) {
            return S(nVar, t0Var);
        }
        int size = list.size();
        int length = 0;
        for (int i11 = 0; i11 < size; i11++) {
            length += ((byte[]) list.get(i11)).length;
        }
        return t0Var.C + length;
    }

    @Override
    public final void A() {
        Q();
    }

    @Override
    public final boolean C(long r31, long r33, y3.k r35, java.nio.ByteBuffer r36, int r37, int r38, int r39, long r40, boolean r42, boolean r43, h3.t0 r44) {
        throw new UnsupportedOperationException("Method not decompiled: e5.i.C(long, long, y3.k, java.nio.ByteBuffer, int, int, int, long, boolean, boolean, h3.t0):boolean");
    }

    @Override
    public final void G() {
        super.G();
        this.Z0 = 0;
    }

    @Override
    public final boolean K(y3.n nVar) {
        return this.N0 != null || a0(nVar);
    }

    @Override
    public final int M(y3.r rVar, t0 t0Var) {
        boolean z10;
        int i10 = 0;
        if (!d5.q.j(t0Var.B)) {
            return com.google.android.recaptcha.internal.a.b(0, 0, 0);
        }
        boolean z11 = t0Var.E != null;
        Context context = this.E0;
        z zVarT = T(context, rVar, t0Var, z11, false);
        if (z11 && zVarT.isEmpty()) {
            zVarT = T(context, rVar, t0Var, false, false);
        }
        if (zVarT.isEmpty()) {
            return com.google.android.recaptcha.internal.a.b(1, 0, 0);
        }
        int i11 = t0Var.W;
        if (i11 != 0 && i11 != 2) {
            return com.google.android.recaptcha.internal.a.b(2, 0, 0);
        }
        y3.n nVar = (y3.n) zVarT.get(0);
        boolean zD = nVar.d(t0Var);
        if (!zD) {
            int i12 = 1;
            while (true) {
                if (i12 >= zVarT.size()) {
                    z10 = true;
                    break;
                }
                y3.n nVar2 = (y3.n) zVarT.get(i12);
                if (nVar2.d(t0Var)) {
                    nVar = nVar2;
                    z10 = false;
                    zD = true;
                    break;
                }
                i12++;
            }
        } else {
            z10 = true;
            break;
        }
        int i13 = zD ? 4 : 3;
        int i14 = nVar.e(t0Var) ? 16 : 8;
        int i15 = nVar.f49500g ? 64 : 0;
        int i16 = z10 ? 128 : 0;
        if (g0.f4795a >= 26 && "video/dolby-vision".equals(t0Var.B) && !g.a(context)) {
            i16 = 256;
        }
        if (zD) {
            z zVarT2 = T(context, rVar, t0Var, z11, true);
            if (!zVarT2.isEmpty()) {
                Pattern pattern = y3.w.f49545a;
                ArrayList arrayList = new ArrayList(zVarT2);
                Collections.sort(arrayList, new ag.h(new t0.c(t0Var, 5), 6));
                y3.n nVar3 = (y3.n) arrayList.get(0);
                if (nVar3.d(t0Var) && nVar3.e(t0Var)) {
                    i10 = 32;
                }
            }
        }
        return i13 | i14 | i10 | i15 | i16;
    }

    public final void Q() {
        y3.k kVar;
        this.R0 = false;
        if (g0.f4795a < 23 || !this.f5262j1 || (kVar = this.I) == null) {
            return;
        }
        this.l1 = new h(this, kVar);
    }

    public final void V() {
        if (this.X0 > 0) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            long j10 = jElapsedRealtime - this.W0;
            int i10 = this.X0;
            xe.b bVar = this.G0;
            Handler handler = (Handler) bVar.f49392b;
            if (handler != null) {
                handler.post(new t(bVar, i10, j10));
            }
            this.X0 = 0;
            this.W0 = jElapsedRealtime;
        }
    }

    public final void W() {
        this.T0 = true;
        if (this.R0) {
            return;
        }
        this.R0 = true;
        Surface surface = this.N0;
        xe.b bVar = this.G0;
        Handler handler = (Handler) bVar.f49392b;
        if (handler != null) {
            handler.post(new u(bVar, surface, SystemClock.elapsedRealtime(), 0));
        }
        this.P0 = true;
    }

    public final void X() {
        int i10 = this.f5257e1;
        if (i10 == -1 && this.f5258f1 == -1) {
            return;
        }
        x xVar = this.f5261i1;
        if (xVar != null && xVar.f5308a == i10 && xVar.f5309b == this.f5258f1 && xVar.f5310c == this.f5259g1 && xVar.d == this.f5260h1) {
            return;
        }
        x xVar2 = new x(this.f5257e1, this.f5258f1, this.f5260h1, this.f5259g1);
        this.f5261i1 = xVar2;
        xe.b bVar = this.G0;
        Handler handler = (Handler) bVar.f49392b;
        if (handler != null) {
            handler.post(new d5.u(5, bVar, xVar2));
        }
    }

    public final void Y(y3.k kVar, int i10) {
        X();
        d5.a.c("releaseOutputBuffer");
        kVar.releaseOutputBuffer(i10, true);
        d5.a.q();
        this.f5254b1 = SystemClock.elapsedRealtime() * 1000;
        this.f49539z0.f14421e++;
        this.Y0 = 0;
        W();
    }

    public final void Z(y3.k kVar, int i10, long j10) {
        X();
        d5.a.c("releaseOutputBuffer");
        kVar.b(i10, j10);
        d5.a.q();
        this.f5254b1 = SystemClock.elapsedRealtime() * 1000;
        this.f49539z0.f14421e++;
        this.Y0 = 0;
        W();
    }

    public final boolean a0(y3.n nVar) {
        if (g0.f4795a < 23 || this.f5262j1 || R(nVar.f49495a)) {
            return false;
        }
        return !nVar.f49499f || k.b(this.E0);
    }

    @Override
    public final k3.l b(y3.n nVar, t0 t0Var, t0 t0Var2) {
        k3.l lVarB = nVar.b(t0Var, t0Var2);
        int i10 = lVarB.f14436e;
        int i11 = t0Var2.G;
        b8.b bVar = this.K0;
        if (i11 > bVar.f2041a || t0Var2.H > bVar.f2042b) {
            i10 |= 256;
        }
        if (U(nVar, t0Var2) > this.K0.f2043c) {
            i10 |= 64;
        }
        int i12 = i10;
        return new k3.l(nVar.f49495a, t0Var, t0Var2, i12 != 0 ? 0 : lVarB.d, i12);
    }

    public final void b0(y3.k kVar, int i10) {
        d5.a.c("skipVideoBuffer");
        kVar.releaseOutputBuffer(i10, false);
        d5.a.q();
        this.f49539z0.f14422f++;
    }

    @Override
    public final y3.l c(IllegalStateException illegalStateException, y3.n nVar) {
        Surface surface = this.N0;
        f fVar = new f(illegalStateException, nVar);
        System.identityHashCode(surface);
        if (surface != null) {
            surface.isValid();
        }
        return fVar;
    }

    public final void c0(int i10, int i11) {
        k3.f fVar = this.f49539z0;
        fVar.h += i10;
        int i12 = i10 + i11;
        fVar.f14423g += i12;
        this.X0 += i12;
        int i13 = this.Y0 + i12;
        this.Y0 = i13;
        fVar.f14424i = Math.max(i13, fVar.f14424i);
        int i14 = this.I0;
        if (i14 <= 0 || this.X0 < i14) {
            return;
        }
        V();
    }

    public final void d0(long j10) {
        k3.f fVar = this.f49539z0;
        fVar.f14426k += j10;
        fVar.f14427l++;
        this.f5255c1 += j10;
        this.f5256d1++;
    }

    @Override
    public final String getName() {
        return "MediaCodecVideoRenderer";
    }

    @Override
    public final void handleMessage(int i10, Object obj) {
        ?? C;
        Handler handler;
        Handler handler2;
        Surface surface;
        int iIntValue;
        r rVar = this.F0;
        if (i10 != 1) {
            if (i10 == 7) {
                this.f5264m1 = (m) obj;
                return;
            }
            if (i10 == 10) {
                int iIntValue2 = ((Integer) obj).intValue();
                if (this.f5263k1 != iIntValue2) {
                    this.f5263k1 = iIntValue2;
                    if (this.f5262j1) {
                        E();
                        return;
                    }
                    return;
                }
                return;
            }
            if (i10 != 4) {
                if (i10 == 5 && rVar.f5286j != (iIntValue = ((Integer) obj).intValue())) {
                    rVar.f5286j = iIntValue;
                    rVar.c(true);
                    return;
                }
                return;
            }
            int iIntValue3 = ((Integer) obj).intValue();
            this.Q0 = iIntValue3;
            y3.k kVar = this.I;
            if (kVar != null) {
                kVar.f(iIntValue3);
                return;
            }
            return;
        }
        if (obj instanceof Surface) {
            surface = (Surface) obj;
        } else {
            C = 0;
        }
        if (C == 0) {
            k kVar2 = this.O0;
            if (kVar2 != null) {
                C = surface;
                C = kVar2;
            } else {
                y3.n nVar = this.P;
                if (nVar != null && a0(nVar)) {
                    C = surface;
                    C = k.c(this.E0, nVar.f49499f);
                    this.O0 = C;
                }
            }
        }
        C = surface;
        C = surface;
        C = surface;
        Surface surface2 = this.N0;
        xe.b bVar = this.G0;
        if (surface2 == C) {
            if (C == 0 || C == this.O0) {
                return;
            }
            x xVar = this.f5261i1;
            if (xVar != null && (handler = (Handler) bVar.f49392b) != null) {
                handler.post(new d5.u(5, bVar, xVar));
            }
            if (this.P0) {
                Surface surface3 = this.N0;
                Handler handler3 = (Handler) bVar.f49392b;
                if (handler3 != null) {
                    handler3.post(new u(bVar, surface3, SystemClock.elapsedRealtime(), 0));
                    return;
                }
                return;
            }
            return;
        }
        this.N0 = C;
        rVar.getClass();
        ?? r10 = C instanceof k ? 0 : C;
        if (rVar.f5282e != r10) {
            rVar.a();
            rVar.f5282e = r10;
            rVar.c(true);
        }
        this.P0 = false;
        int state = getState();
        ?? r11 = this.I;
        if (r11 != 0) {
            if (g0.f4795a < 23 || C == 0 || this.L0) {
                E();
                r();
            } else {
                try {
                    r11.g(C);
                } catch (Throwable th) {
                    th.printStackTrace();
                    throw new l(th);
                }
            }
        }
        if (C == 0 || C == this.O0) {
            this.f5261i1 = null;
            Q();
            return;
        }
        x xVar2 = this.f5261i1;
        if (xVar2 != null && (handler2 = (Handler) bVar.f49392b) != null) {
            handler2.post(new d5.u(5, bVar, xVar2));
        }
        Q();
        if (state == 2) {
            long j10 = this.H0;
            this.V0 = j10 > 0 ? SystemClock.elapsedRealtime() + j10 : -9223372036854775807L;
        }
    }

    @Override
    public final boolean isReady() {
        k kVar;
        if (super.isReady() && (this.R0 || (((kVar = this.O0) != null && this.N0 == kVar) || this.I == null || this.f5262j1))) {
            this.V0 = -9223372036854775807L;
            return true;
        }
        if (this.V0 == -9223372036854775807L) {
            return false;
        }
        if (SystemClock.elapsedRealtime() < this.V0) {
            return true;
        }
        this.V0 = -9223372036854775807L;
        return false;
    }

    @Override
    public final boolean k() {
        return this.f5262j1 && g0.f4795a < 23;
    }

    @Override
    public final float l(float f10, t0[] t0VarArr) {
        float fMax = -1.0f;
        for (t0 t0Var : t0VarArr) {
            float f11 = t0Var.I;
            if (f11 != -1.0f) {
                fMax = Math.max(fMax, f11);
            }
        }
        if (fMax == -1.0f) {
            return -1.0f;
        }
        return fMax * f10;
    }

    @Override
    public final ArrayList m(y3.r rVar, t0 t0Var, boolean z10) {
        z zVarT = T(this.E0, rVar, t0Var, z10, this.f5262j1);
        Pattern pattern = y3.w.f49545a;
        ArrayList arrayList = new ArrayList(zVarT);
        Collections.sort(arrayList, new ag.h(new t0.c(t0Var, 5), 6));
        return arrayList;
    }

    @Override
    public final y3.i o(y3.n nVar, t0 t0Var, MediaCrypto mediaCrypto, float f10) {
        int i10;
        b bVar;
        b8.b bVar2;
        Point point;
        Point point2;
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        boolean z10;
        Pair pairD;
        int iS;
        k kVar = this.O0;
        if (kVar != null && kVar.f5270a != nVar.f49499f) {
            if (this.N0 == kVar) {
                this.N0 = null;
            }
            kVar.release();
            this.O0 = null;
        }
        String str = nVar.f49497c;
        t0[] streamFormats = getStreamFormats();
        int i11 = t0Var.G;
        float f11 = t0Var.I;
        int i12 = t0Var.H;
        b bVar3 = t0Var.N;
        int iU = U(nVar, t0Var);
        if (streamFormats.length == 1) {
            if (iU != -1 && (iS = S(nVar, t0Var)) != -1) {
                iU = Math.min((int) (iU * 1.5f), iS);
            }
            bVar2 = new b8.b(i11, i12, iU);
            i10 = i12;
            bVar = bVar3;
        } else {
            int iMax = i11;
            int iMax2 = i12;
            int i13 = 0;
            boolean z11 = false;
            for (int length = streamFormats.length; i13 < length; length = length) {
                t0 t0Var2 = streamFormats[i13];
                int i14 = i13;
                if (bVar3 != null && t0Var2.N == null) {
                    s0 s0VarA = t0Var2.a();
                    s0VarA.A = bVar3;
                    t0Var2 = new t0(s0VarA);
                }
                k3.l lVarB = nVar.b(t0Var, t0Var2);
                t0[] t0VarArr = streamFormats;
                int i15 = t0Var2.H;
                if (lVarB.d != 0) {
                    int i16 = t0Var2.G;
                    z11 |= i16 == -1 || i15 == -1;
                    iMax = Math.max(iMax, i16);
                    iMax2 = Math.max(iMax2, i15);
                    iU = Math.max(iU, U(nVar, t0Var2));
                }
                i13 = i14 + 1;
                streamFormats = t0VarArr;
            }
            if (z11) {
                d5.a.K("MediaCodecVideoRenderer", "Resolutions unknown. Codec max resolution: " + iMax + "x" + iMax2);
                boolean z12 = i12 > i11;
                int i17 = z12 ? i12 : i11;
                boolean z13 = z12;
                int i18 = z12 ? i11 : i12;
                float f12 = i18 / i17;
                bVar = bVar3;
                int i19 = 0;
                while (true) {
                    if (i19 < 9) {
                        int i20 = f5250n1[i19];
                        int i21 = i19;
                        int i22 = (int) (i20 * f12);
                        if (i20 > i17 && i22 > i18) {
                            int i23 = i18;
                            int i24 = i17;
                            if (g0.f4795a >= 21) {
                                int i25 = z13 ? i22 : i20;
                                if (!z13) {
                                    i20 = i22;
                                }
                                MediaCodecInfo.CodecCapabilities codecCapabilities = nVar.d;
                                if (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) {
                                    point2 = null;
                                } else {
                                    int widthAlignment = videoCapabilities.getWidthAlignment();
                                    int heightAlignment = videoCapabilities.getHeightAlignment();
                                    point2 = new Point(g0.f(i25, widthAlignment) * widthAlignment, g0.f(i20, heightAlignment) * heightAlignment);
                                }
                                i10 = i12;
                                if (nVar.f(point2.x, point2.y, f11)) {
                                    point = point2;
                                } else {
                                    i19 = i21 + 1;
                                    i12 = i10;
                                    i18 = i23;
                                    i17 = i24;
                                }
                            } else {
                                i10 = i12;
                                try {
                                    int iF = g0.f(i20, 16) * 16;
                                    int iF2 = g0.f(i22, 16) * 16;
                                    if (iF * iF2 <= y3.w.j()) {
                                        int i26 = z13 ? iF2 : iF;
                                        if (!z13) {
                                            iF = iF2;
                                        }
                                        point2 = new Point(i26, iF);
                                        point = point2;
                                    } else {
                                        i19 = i21 + 1;
                                        i12 = i10;
                                        i18 = i23;
                                        i17 = i24;
                                    }
                                } catch (y3.t unused) {
                                    point = null;
                                }
                            }
                        }
                        if (point != null) {
                            iMax = Math.max(iMax, point.x);
                            iMax2 = Math.max(iMax2, point.y);
                            s0 s0VarA2 = t0Var.a();
                            s0VarA2.f8140t = iMax;
                            s0VarA2.f8141u = iMax2;
                            iU = Math.max(iU, S(nVar, new t0(s0VarA2)));
                            d5.a.K("MediaCodecVideoRenderer", "Codec max resolution adjusted to: " + iMax + "x" + iMax2);
                        }
                    }
                    i10 = i12;
                    point = null;
                    if (point != null) {
                        iMax = Math.max(iMax, point.x);
                        iMax2 = Math.max(iMax2, point.y);
                        s0 s0VarA3 = t0Var.a();
                        s0VarA3.f8140t = iMax;
                        s0VarA3.f8141u = iMax2;
                        iU = Math.max(iU, S(nVar, new t0(s0VarA3)));
                        d5.a.K("MediaCodecVideoRenderer", "Codec max resolution adjusted to: " + iMax + "x" + iMax2);
                    }
                }
            } else {
                i10 = i12;
                bVar = bVar3;
            }
            bVar2 = new b8.b(iMax, iMax2, iU);
        }
        this.K0 = bVar2;
        int i27 = this.f5262j1 ? this.f5263k1 : 0;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger("width", i11);
        mediaFormat.setInteger("height", i10);
        d5.a.I(mediaFormat, t0Var.D);
        if (f11 != -1.0f) {
            mediaFormat.setFloat("frame-rate", f11);
        }
        d5.a.A(mediaFormat, "rotation-degrees", t0Var.J);
        if (bVar != null) {
            b bVar4 = bVar;
            d5.a.A(mediaFormat, "color-transfer", bVar4.f5233c);
            d5.a.A(mediaFormat, "color-standard", bVar4.f5231a);
            d5.a.A(mediaFormat, "color-range", bVar4.f5232b);
            byte[] bArr = bVar4.d;
            if (bArr != null) {
                mediaFormat.setByteBuffer("hdr-static-info", ByteBuffer.wrap(bArr));
            }
        }
        if ("video/dolby-vision".equals(t0Var.B) && (pairD = y3.w.d(t0Var)) != null) {
            d5.a.A(mediaFormat, "profile", ((Integer) pairD.first).intValue());
        }
        mediaFormat.setInteger("max-width", bVar2.f2041a);
        mediaFormat.setInteger("max-height", bVar2.f2042b);
        d5.a.A(mediaFormat, "max-input-size", bVar2.f2043c);
        if (g0.f4795a >= 23) {
            mediaFormat.setInteger("priority", 0);
            if (f10 != -1.0f) {
                mediaFormat.setFloat("operating-rate", f10);
            }
        }
        if (this.J0) {
            z10 = true;
            mediaFormat.setInteger("no-post-process", 1);
            mediaFormat.setInteger("auto-frc", 0);
        } else {
            z10 = true;
        }
        if (i27 != 0) {
            mediaFormat.setFeatureEnabled("tunneled-playback", z10);
            mediaFormat.setInteger("audio-session-id", i27);
        }
        if (this.N0 == null) {
            if (!a0(nVar)) {
                throw new IllegalStateException();
            }
            if (this.O0 == null) {
                this.O0 = k.c(this.E0, nVar.f49499f);
            }
            this.N0 = this.O0;
        }
        return new y3.i(nVar, mediaFormat, t0Var, this.N0, mediaCrypto);
    }

    @Override
    public final void onDisabled() {
        xe.b bVar = this.G0;
        this.f5261i1 = null;
        Q();
        this.P0 = false;
        this.l1 = null;
        try {
            super.onDisabled();
            k3.f fVar = this.f49539z0;
            bVar.getClass();
            synchronized (fVar) {
            }
            Handler handler = (Handler) bVar.f49392b;
            if (handler != null) {
                handler.post(new v(bVar, fVar, 0));
            }
        } catch (Throwable th) {
            bVar.m(this.f49539z0);
            throw th;
        }
    }

    @Override
    public final void onEnabled(boolean z10, boolean z11) {
        this.f49539z0 = new k3.f();
        boolean z12 = getConfiguration().f7935a;
        d5.a.i((z12 && this.f5263k1 == 0) ? false : true);
        if (this.f5262j1 != z12) {
            this.f5262j1 = z12;
            E();
        }
        k3.f fVar = this.f49539z0;
        xe.b bVar = this.G0;
        Handler handler = (Handler) bVar.f49392b;
        if (handler != null) {
            handler.post(new v(bVar, fVar, 1));
        }
        this.S0 = z11;
        this.T0 = false;
    }

    @Override
    public final void onPositionReset(long j10, boolean z10) {
        super.onPositionReset(j10, z10);
        Q();
        r rVar = this.F0;
        rVar.f5289m = 0L;
        rVar.f5292p = -1L;
        rVar.f5290n = -1L;
        this.f5253a1 = -9223372036854775807L;
        this.U0 = -9223372036854775807L;
        this.Y0 = 0;
        if (!z10) {
            this.V0 = -9223372036854775807L;
        } else {
            long j11 = this.H0;
            this.V0 = j11 > 0 ? SystemClock.elapsedRealtime() + j11 : -9223372036854775807L;
        }
    }

    @Override
    public final void onQueueInputBuffer(k3.i iVar) {
        boolean z10 = this.f5262j1;
        if (!z10) {
            this.Z0++;
        }
        if (g0.f4795a >= 23 || !z10) {
            return;
        }
        long j10 = iVar.d;
        P(j10);
        X();
        this.f49539z0.f14421e++;
        W();
        z(j10);
    }

    @Override
    public final void onReset() {
        k kVar;
        try {
            super.onReset();
            kVar = this.O0;
            if (kVar != null) {
                if (this.N0 == kVar) {
                    this.N0 = null;
                }
            }
        } finally {
            if (this.O0 != null) {
                Surface surface = this.N0;
                kVar = this.O0;
                if (surface == kVar) {
                    this.N0 = null;
                }
                kVar.release();
                this.O0 = null;
            }
        }
    }

    @Override
    public final void onStarted() {
        this.X0 = 0;
        this.W0 = SystemClock.elapsedRealtime();
        this.f5254b1 = SystemClock.elapsedRealtime() * 1000;
        this.f5255c1 = 0L;
        this.f5256d1 = 0;
        r rVar = this.F0;
        rVar.d = true;
        rVar.f5289m = 0L;
        rVar.f5292p = -1L;
        rVar.f5290n = -1L;
        o oVar = rVar.f5280b;
        if (oVar != null) {
            q qVar = rVar.f5281c;
            qVar.getClass();
            qVar.f5277b.sendEmptyMessage(1);
            oVar.m(new a1.c(rVar, 21));
        }
        rVar.c(false);
    }

    @Override
    public final void onStopped() {
        this.V0 = -9223372036854775807L;
        V();
        int i10 = this.f5256d1;
        if (i10 != 0) {
            long j10 = this.f5255c1;
            xe.b bVar = this.G0;
            Handler handler = (Handler) bVar.f49392b;
            if (handler != null) {
                handler.post(new t(bVar, j10, i10));
            }
            this.f5255c1 = 0L;
            this.f5256d1 = 0;
        }
        r rVar = this.F0;
        rVar.d = false;
        o oVar = rVar.f5280b;
        if (oVar != null) {
            oVar.r();
            q qVar = rVar.f5281c;
            qVar.getClass();
            qVar.f5277b.sendEmptyMessage(2);
        }
        rVar.a();
    }

    @Override
    public final void p(k3.i iVar) {
        if (this.M0) {
            ByteBuffer byteBuffer = iVar.f14431e;
            byteBuffer.getClass();
            if (byteBuffer.remaining() >= 7) {
                byte b10 = byteBuffer.get();
                short s10 = byteBuffer.getShort();
                short s11 = byteBuffer.getShort();
                byte b11 = byteBuffer.get();
                byte b12 = byteBuffer.get();
                byteBuffer.position(0);
                if (b10 == -75 && s10 == 60 && s11 == 1 && b11 == 4) {
                    if (b12 == 0 || b12 == 1) {
                        byte[] bArr = new byte[byteBuffer.remaining()];
                        byteBuffer.get(bArr);
                        byteBuffer.position(0);
                        y3.k kVar = this.I;
                        Bundle bundle = new Bundle();
                        bundle.putByteArray("hdr10-plus-info", bArr);
                        kVar.setParameters(bundle);
                    }
                }
            }
        }
    }

    @Override
    public final void setPlaybackSpeed(float f10, float f11) {
        super.setPlaybackSpeed(f10, f11);
        r rVar = this.F0;
        rVar.f5285i = f10;
        rVar.f5289m = 0L;
        rVar.f5292p = -1L;
        rVar.f5290n = -1L;
        rVar.c(false);
    }

    @Override
    public final void t(Exception exc) {
        d5.a.p("MediaCodecVideoRenderer", "Video codec error", exc);
        xe.b bVar = this.G0;
        Handler handler = (Handler) bVar.f49392b;
        if (handler != null) {
            handler.post(new d5.u(7, bVar, exc));
        }
    }

    @Override
    public final void u(long j10, long j11, String str) {
        String str2;
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        xe.b bVar = this.G0;
        Handler handler = (Handler) bVar.f49392b;
        if (handler != null) {
            str2 = str;
            handler.post(new w(bVar, str2, j10, j11, 0));
        } else {
            str2 = str;
        }
        this.L0 = R(str2);
        y3.n nVar = this.P;
        nVar.getClass();
        boolean z10 = false;
        if (g0.f4795a >= 29 && "video/x-vnd.on2.vp9".equals(nVar.f49496b)) {
            MediaCodecInfo.CodecCapabilities codecCapabilities = nVar.d;
            if (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) {
                codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[0];
            }
            for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : codecProfileLevelArr) {
                if (codecProfileLevel.profile == 16384) {
                    z10 = true;
                    break;
                }
            }
        }
        this.M0 = z10;
        if (g0.f4795a < 23 || !this.f5262j1) {
            return;
        }
        y3.k kVar = this.I;
        kVar.getClass();
        this.l1 = new h(this, kVar);
    }

    @Override
    public final void v(String str) {
        xe.b bVar = this.G0;
        Handler handler = (Handler) bVar.f49392b;
        if (handler != null) {
            handler.post(new d5.u(6, bVar, str));
        }
    }

    @Override
    public final k3.l w(u0 u0Var) {
        k3.l lVarW = super.w(u0Var);
        t0 t0Var = u0Var.f8207b;
        xe.b bVar = this.G0;
        Handler handler = (Handler) bVar.f49392b;
        if (handler != null) {
            handler.post(new androidx.car.app.utils.a(bVar, t0Var, lVarW, 9));
        }
        return lVarW;
    }

    @Override
    public final void x(t0 t0Var, MediaFormat mediaFormat) {
        y3.k kVar = this.I;
        if (kVar != null) {
            kVar.f(this.Q0);
        }
        if (this.f5262j1) {
            this.f5257e1 = t0Var.G;
            this.f5258f1 = t0Var.H;
        } else {
            mediaFormat.getClass();
            boolean z10 = mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top");
            this.f5257e1 = z10 ? (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1 : mediaFormat.getInteger("width");
            this.f5258f1 = z10 ? (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1 : mediaFormat.getInteger("height");
        }
        float f10 = t0Var.K;
        int i10 = t0Var.J;
        this.f5260h1 = f10;
        if (g0.f4795a < 21) {
            this.f5259g1 = i10;
        } else if (i10 == 90 || i10 == 270) {
            int i11 = this.f5257e1;
            this.f5257e1 = this.f5258f1;
            this.f5258f1 = i11;
            this.f5260h1 = 1.0f / f10;
        }
        float f11 = t0Var.I;
        r rVar = this.F0;
        rVar.f5283f = f11;
        d dVar = rVar.f5279a;
        dVar.f5241a.c();
        dVar.f5242b.c();
        dVar.f5243c = false;
        dVar.d = -9223372036854775807L;
        dVar.f5244e = 0;
        rVar.b();
    }

    @Override
    public final void z(long j10) {
        super.z(j10);
        if (this.f5262j1) {
            return;
        }
        this.Z0--;
    }
}
