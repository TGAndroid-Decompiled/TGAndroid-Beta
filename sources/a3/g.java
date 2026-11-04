package a3;

import android.content.Context;
import android.os.SystemClock;
import ei.z5;
import g2.h0;
import g2.x;
import g9.i0;
import g9.l0;
import g9.s1;
import i2.d0;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
public final class g implements d, d0 {
    public static final s1 f70p = i0.t(4300000L, 3200000L, 2400000L, 1700000L, 860000L);
    public static final s1 f71q = i0.t(1500000L, 980000L, 750000L, 520000L, 290000L);
    public static final s1 f72r = i0.t(2000000L, 1300000L, 1000000L, 860000L, 610000L);
    public static final s1 f73s = i0.t(2500000L, 1700000L, 1200000L, 970000L, 680000L);
    public static final s1 f74t = i0.t(4700000L, 2800000L, 2100000L, 1700000L, 980000L);
    public static final s1 f75u = i0.t(2700000L, 2000000L, 1600000L, 1300000L, 1000000L);
    public static g v;
    public final Context f76a;
    public final l0 f77b;
    public final bb.c f78c;
    public final h0 d;
    public final boolean f79e;
    public final w f80f;
    public int f81g;
    public long h;
    public long f82i;
    public long f83j;
    public long f84k;
    public volatile long f85l;
    public long f86m;
    public int f87n;
    public String f88o;

    public g(Context context, HashMap hashMap) {
        Context applicationContext;
        boolean z10;
        h0 h0Var = h0.f11849a;
        if (context == null) {
            applicationContext = null;
        } else {
            applicationContext = context.getApplicationContext();
        }
        this.f76a = applicationContext;
        this.f77b = l0.b(hashMap);
        this.f78c = new bb.c(1);
        this.f80f = new w();
        this.d = h0Var;
        this.f79e = true;
        if (context != null) {
            x a10 = x.a(context);
            int b10 = a10.b();
            this.f87n = b10;
            this.f85l = b(b10);
            f fVar = new f(this);
            Executor e10 = g2.a.e();
            CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) a10.d;
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                g2.w wVar = (g2.w) it.next();
                if (wVar.f11912a.get() == null) {
                    copyOnWriteArrayList.remove(wVar);
                }
            }
            g2.w wVar2 = new g2.w(a10, fVar, e10);
            synchronized (a10.f11919e) {
                ((CopyOnWriteArrayList) a10.d).add(wVar2);
                z10 = a10.f11916a;
            }
            if (z10) {
                wVar2.f11913b.execute(new z5(wVar2, 15));
                return;
            }
            return;
        }
        this.f87n = 0;
        this.f85l = 1000000L;
    }

    public static synchronized g c(Context context) {
        g gVar;
        Context applicationContext;
        synchronized (g.class) {
            try {
                if (v == null) {
                    if (context == null) {
                        applicationContext = null;
                    } else {
                        applicationContext = context.getApplicationContext();
                    }
                    HashMap hashMap = new HashMap(8);
                    hashMap.put(0, 1000000L);
                    hashMap.put(2, -9223372036854775807L);
                    hashMap.put(3, -9223372036854775807L);
                    hashMap.put(4, -9223372036854775807L);
                    hashMap.put(5, -9223372036854775807L);
                    hashMap.put(10, -9223372036854775807L);
                    hashMap.put(9, -9223372036854775807L);
                    hashMap.put(7, -9223372036854775807L);
                    v = new g(applicationContext, hashMap);
                }
                gVar = v;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return gVar;
    }

    public final synchronized long a() {
        return this.f85l;
    }

    public final long b(int i3) {
        int[] iArr;
        long longValue;
        Integer valueOf = Integer.valueOf(i3);
        l0 l0Var = this.f77b;
        Long l10 = (Long) l0Var.get(valueOf);
        if (l10 == null) {
            l10 = (Long) l0Var.get(0);
        } else if (l10.longValue() == -9223372036854775807L) {
            String str = this.f88o;
            if (str == null) {
                str = "";
            }
            char c2 = 65535;
            switch (str.hashCode()) {
                case 2083:
                    if (str.equals("AD")) {
                        c2 = 0;
                        break;
                    }
                    break;
                case 2084:
                    if (str.equals("AE")) {
                        c2 = 1;
                        break;
                    }
                    break;
                case 2085:
                    if (str.equals("AF")) {
                        c2 = 2;
                        break;
                    }
                    break;
                case 2086:
                    if (str.equals("AG")) {
                        c2 = 3;
                        break;
                    }
                    break;
                case 2088:
                    if (str.equals("AI")) {
                        c2 = 4;
                        break;
                    }
                    break;
                case 2091:
                    if (str.equals("AL")) {
                        c2 = 5;
                        break;
                    }
                    break;
                case 2092:
                    if (str.equals("AM")) {
                        c2 = 6;
                        break;
                    }
                    break;
                case 2094:
                    if (str.equals("AO")) {
                        c2 = 7;
                        break;
                    }
                    break;
                case 2096:
                    if (str.equals("AQ")) {
                        c2 = '\b';
                        break;
                    }
                    break;
                case 2097:
                    if (str.equals("AR")) {
                        c2 = '\t';
                        break;
                    }
                    break;
                case 2098:
                    if (str.equals("AS")) {
                        c2 = '\n';
                        break;
                    }
                    break;
                case 2099:
                    if (str.equals("AT")) {
                        c2 = 11;
                        break;
                    }
                    break;
                case 2100:
                    if (str.equals("AU")) {
                        c2 = '\f';
                        break;
                    }
                    break;
                case 2102:
                    if (str.equals("AW")) {
                        c2 = '\r';
                        break;
                    }
                    break;
                case 2103:
                    if (str.equals("AX")) {
                        c2 = 14;
                        break;
                    }
                    break;
                case 2105:
                    if (str.equals("AZ")) {
                        c2 = 15;
                        break;
                    }
                    break;
                case 2111:
                    if (str.equals("BA")) {
                        c2 = 16;
                        break;
                    }
                    break;
                case 2112:
                    if (str.equals("BB")) {
                        c2 = 17;
                        break;
                    }
                    break;
                case 2114:
                    if (str.equals("BD")) {
                        c2 = 18;
                        break;
                    }
                    break;
                case 2115:
                    if (str.equals("BE")) {
                        c2 = 19;
                        break;
                    }
                    break;
                case 2116:
                    if (str.equals("BF")) {
                        c2 = 20;
                        break;
                    }
                    break;
                case 2117:
                    if (str.equals("BG")) {
                        c2 = 21;
                        break;
                    }
                    break;
                case 2118:
                    if (str.equals("BH")) {
                        c2 = 22;
                        break;
                    }
                    break;
                case 2119:
                    if (str.equals("BI")) {
                        c2 = 23;
                        break;
                    }
                    break;
                case 2120:
                    if (str.equals("BJ")) {
                        c2 = 24;
                        break;
                    }
                    break;
                case 2122:
                    if (str.equals("BL")) {
                        c2 = 25;
                        break;
                    }
                    break;
                case 2123:
                    if (str.equals("BM")) {
                        c2 = 26;
                        break;
                    }
                    break;
                case 2124:
                    if (str.equals("BN")) {
                        c2 = 27;
                        break;
                    }
                    break;
                case 2125:
                    if (str.equals("BO")) {
                        c2 = 28;
                        break;
                    }
                    break;
                case 2127:
                    if (str.equals("BQ")) {
                        c2 = 29;
                        break;
                    }
                    break;
                case 2128:
                    if (str.equals("BR")) {
                        c2 = 30;
                        break;
                    }
                    break;
                case 2129:
                    if (str.equals("BS")) {
                        c2 = 31;
                        break;
                    }
                    break;
                case 2130:
                    if (str.equals("BT")) {
                        c2 = ' ';
                        break;
                    }
                    break;
                case 2133:
                    if (str.equals("BW")) {
                        c2 = '!';
                        break;
                    }
                    break;
                case 2135:
                    if (str.equals("BY")) {
                        c2 = '\"';
                        break;
                    }
                    break;
                case 2136:
                    if (str.equals("BZ")) {
                        c2 = '#';
                        break;
                    }
                    break;
                case 2142:
                    if (str.equals("CA")) {
                        c2 = '$';
                        break;
                    }
                    break;
                case 2145:
                    if (str.equals("CD")) {
                        c2 = '%';
                        break;
                    }
                    break;
                case 2147:
                    if (str.equals("CF")) {
                        c2 = '&';
                        break;
                    }
                    break;
                case 2148:
                    if (str.equals("CG")) {
                        c2 = '\'';
                        break;
                    }
                    break;
                case 2149:
                    if (str.equals("CH")) {
                        c2 = '(';
                        break;
                    }
                    break;
                case 2150:
                    if (str.equals("CI")) {
                        c2 = ')';
                        break;
                    }
                    break;
                case 2152:
                    if (str.equals("CK")) {
                        c2 = '*';
                        break;
                    }
                    break;
                case 2153:
                    if (str.equals("CL")) {
                        c2 = '+';
                        break;
                    }
                    break;
                case 2154:
                    if (str.equals("CM")) {
                        c2 = ',';
                        break;
                    }
                    break;
                case 2155:
                    if (str.equals("CN")) {
                        c2 = '-';
                        break;
                    }
                    break;
                case 2156:
                    if (str.equals("CO")) {
                        c2 = '.';
                        break;
                    }
                    break;
                case 2159:
                    if (str.equals("CR")) {
                        c2 = '/';
                        break;
                    }
                    break;
                case 2162:
                    if (str.equals("CU")) {
                        c2 = '0';
                        break;
                    }
                    break;
                case 2163:
                    if (str.equals("CV")) {
                        c2 = '1';
                        break;
                    }
                    break;
                case 2164:
                    if (str.equals("CW")) {
                        c2 = '2';
                        break;
                    }
                    break;
                case 2165:
                    if (str.equals("CX")) {
                        c2 = '3';
                        break;
                    }
                    break;
                case 2166:
                    if (str.equals("CY")) {
                        c2 = '4';
                        break;
                    }
                    break;
                case 2167:
                    if (str.equals("CZ")) {
                        c2 = '5';
                        break;
                    }
                    break;
                case 2177:
                    if (str.equals("DE")) {
                        c2 = '6';
                        break;
                    }
                    break;
                case 2182:
                    if (str.equals("DJ")) {
                        c2 = '7';
                        break;
                    }
                    break;
                case 2183:
                    if (str.equals("DK")) {
                        c2 = '8';
                        break;
                    }
                    break;
                case 2185:
                    if (str.equals("DM")) {
                        c2 = '9';
                        break;
                    }
                    break;
                case 2187:
                    if (str.equals("DO")) {
                        c2 = ':';
                        break;
                    }
                    break;
                case 2198:
                    if (str.equals("DZ")) {
                        c2 = ';';
                        break;
                    }
                    break;
                case 2206:
                    if (str.equals("EC")) {
                        c2 = '<';
                        break;
                    }
                    break;
                case 2208:
                    if (str.equals("EE")) {
                        c2 = '=';
                        break;
                    }
                    break;
                case 2210:
                    if (str.equals("EG")) {
                        c2 = '>';
                        break;
                    }
                    break;
                case 2221:
                    if (str.equals("ER")) {
                        c2 = '?';
                        break;
                    }
                    break;
                case 2222:
                    if (str.equals("ES")) {
                        c2 = '@';
                        break;
                    }
                    break;
                case 2223:
                    if (str.equals("ET")) {
                        c2 = 'A';
                        break;
                    }
                    break;
                case 2243:
                    if (str.equals("FI")) {
                        c2 = 'B';
                        break;
                    }
                    break;
                case 2244:
                    if (str.equals("FJ")) {
                        c2 = 'C';
                        break;
                    }
                    break;
                case 2245:
                    if (str.equals("FK")) {
                        c2 = 'D';
                        break;
                    }
                    break;
                case 2247:
                    if (str.equals("FM")) {
                        c2 = 'E';
                        break;
                    }
                    break;
                case 2249:
                    if (str.equals("FO")) {
                        c2 = 'F';
                        break;
                    }
                    break;
                case 2252:
                    if (str.equals("FR")) {
                        c2 = 'G';
                        break;
                    }
                    break;
                case 2266:
                    if (str.equals("GA")) {
                        c2 = 'H';
                        break;
                    }
                    break;
                case 2267:
                    if (str.equals("GB")) {
                        c2 = 'I';
                        break;
                    }
                    break;
                case 2269:
                    if (str.equals("GD")) {
                        c2 = 'J';
                        break;
                    }
                    break;
                case 2270:
                    if (str.equals("GE")) {
                        c2 = 'K';
                        break;
                    }
                    break;
                case 2271:
                    if (str.equals("GF")) {
                        c2 = 'L';
                        break;
                    }
                    break;
                case 2272:
                    if (str.equals("GG")) {
                        c2 = 'M';
                        break;
                    }
                    break;
                case 2273:
                    if (str.equals("GH")) {
                        c2 = 'N';
                        break;
                    }
                    break;
                case 2274:
                    if (str.equals("GI")) {
                        c2 = 'O';
                        break;
                    }
                    break;
                case 2277:
                    if (str.equals("GL")) {
                        c2 = 'P';
                        break;
                    }
                    break;
                case 2278:
                    if (str.equals("GM")) {
                        c2 = 'Q';
                        break;
                    }
                    break;
                case 2279:
                    if (str.equals("GN")) {
                        c2 = 'R';
                        break;
                    }
                    break;
                case 2281:
                    if (str.equals("GP")) {
                        c2 = 'S';
                        break;
                    }
                    break;
                case 2282:
                    if (str.equals("GQ")) {
                        c2 = 'T';
                        break;
                    }
                    break;
                case 2283:
                    if (str.equals("GR")) {
                        c2 = 'U';
                        break;
                    }
                    break;
                case 2285:
                    if (str.equals("GT")) {
                        c2 = 'V';
                        break;
                    }
                    break;
                case 2286:
                    if (str.equals("GU")) {
                        c2 = 'W';
                        break;
                    }
                    break;
                case 2288:
                    if (str.equals("GW")) {
                        c2 = 'X';
                        break;
                    }
                    break;
                case 2290:
                    if (str.equals("GY")) {
                        c2 = 'Y';
                        break;
                    }
                    break;
                case 2307:
                    if (str.equals("HK")) {
                        c2 = 'Z';
                        break;
                    }
                    break;
                case 2314:
                    if (str.equals("HR")) {
                        c2 = '[';
                        break;
                    }
                    break;
                case 2316:
                    if (str.equals("HT")) {
                        c2 = '\\';
                        break;
                    }
                    break;
                case 2317:
                    if (str.equals("HU")) {
                        c2 = ']';
                        break;
                    }
                    break;
                case 2331:
                    if (str.equals("ID")) {
                        c2 = '^';
                        break;
                    }
                    break;
                case 2332:
                    if (str.equals("IE")) {
                        c2 = '_';
                        break;
                    }
                    break;
                case 2339:
                    if (str.equals("IL")) {
                        c2 = '`';
                        break;
                    }
                    break;
                case 2340:
                    if (str.equals("IM")) {
                        c2 = 'a';
                        break;
                    }
                    break;
                case 2341:
                    if (str.equals("IN")) {
                        c2 = 'b';
                        break;
                    }
                    break;
                case 2342:
                    if (str.equals("IO")) {
                        c2 = 'c';
                        break;
                    }
                    break;
                case 2344:
                    if (str.equals("IQ")) {
                        c2 = 'd';
                        break;
                    }
                    break;
                case 2345:
                    if (str.equals("IR")) {
                        c2 = 'e';
                        break;
                    }
                    break;
                case 2346:
                    if (str.equals("IS")) {
                        c2 = 'f';
                        break;
                    }
                    break;
                case 2347:
                    if (str.equals("IT")) {
                        c2 = 'g';
                        break;
                    }
                    break;
                case 2363:
                    if (str.equals("JE")) {
                        c2 = 'h';
                        break;
                    }
                    break;
                case 2371:
                    if (str.equals("JM")) {
                        c2 = 'i';
                        break;
                    }
                    break;
                case 2373:
                    if (str.equals("JO")) {
                        c2 = 'j';
                        break;
                    }
                    break;
                case 2374:
                    if (str.equals("JP")) {
                        c2 = 'k';
                        break;
                    }
                    break;
                case 2394:
                    if (str.equals("KE")) {
                        c2 = 'l';
                        break;
                    }
                    break;
                case 2396:
                    if (str.equals("KG")) {
                        c2 = 'm';
                        break;
                    }
                    break;
                case 2397:
                    if (str.equals("KH")) {
                        c2 = 'n';
                        break;
                    }
                    break;
                case 2398:
                    if (str.equals("KI")) {
                        c2 = 'o';
                        break;
                    }
                    break;
                case 2402:
                    if (str.equals("KM")) {
                        c2 = 'p';
                        break;
                    }
                    break;
                case 2403:
                    if (str.equals("KN")) {
                        c2 = 'q';
                        break;
                    }
                    break;
                case 2407:
                    if (str.equals("KR")) {
                        c2 = 'r';
                        break;
                    }
                    break;
                case 2412:
                    if (str.equals("KW")) {
                        c2 = 's';
                        break;
                    }
                    break;
                case 2414:
                    if (str.equals("KY")) {
                        c2 = 't';
                        break;
                    }
                    break;
                case 2415:
                    if (str.equals("KZ")) {
                        c2 = 'u';
                        break;
                    }
                    break;
                case 2421:
                    if (str.equals("LA")) {
                        c2 = 'v';
                        break;
                    }
                    break;
                case 2422:
                    if (str.equals("LB")) {
                        c2 = 'w';
                        break;
                    }
                    break;
                case 2423:
                    if (str.equals("LC")) {
                        c2 = 'x';
                        break;
                    }
                    break;
                case 2429:
                    if (str.equals("LI")) {
                        c2 = 'y';
                        break;
                    }
                    break;
                case 2431:
                    if (str.equals("LK")) {
                        c2 = 'z';
                        break;
                    }
                    break;
                case 2438:
                    if (str.equals("LR")) {
                        c2 = '{';
                        break;
                    }
                    break;
                case 2439:
                    if (str.equals("LS")) {
                        c2 = '|';
                        break;
                    }
                    break;
                case 2440:
                    if (str.equals("LT")) {
                        c2 = '}';
                        break;
                    }
                    break;
                case 2441:
                    if (str.equals("LU")) {
                        c2 = '~';
                        break;
                    }
                    break;
                case 2442:
                    if (str.equals("LV")) {
                        c2 = 127;
                        break;
                    }
                    break;
                case 2445:
                    if (str.equals("LY")) {
                        c2 = 128;
                        break;
                    }
                    break;
                case 2452:
                    if (str.equals("MA")) {
                        c2 = 129;
                        break;
                    }
                    break;
                case 2454:
                    if (str.equals("MC")) {
                        c2 = 130;
                        break;
                    }
                    break;
                case 2455:
                    if (str.equals("MD")) {
                        c2 = 131;
                        break;
                    }
                    break;
                case 2456:
                    if (str.equals("ME")) {
                        c2 = 132;
                        break;
                    }
                    break;
                case 2457:
                    if (str.equals("MF")) {
                        c2 = 133;
                        break;
                    }
                    break;
                case 2458:
                    if (str.equals("MG")) {
                        c2 = 134;
                        break;
                    }
                    break;
                case 2459:
                    if (str.equals("MH")) {
                        c2 = 135;
                        break;
                    }
                    break;
                case 2462:
                    if (str.equals("MK")) {
                        c2 = 136;
                        break;
                    }
                    break;
                case 2463:
                    if (str.equals("ML")) {
                        c2 = 137;
                        break;
                    }
                    break;
                case 2464:
                    if (str.equals("MM")) {
                        c2 = 138;
                        break;
                    }
                    break;
                case 2465:
                    if (str.equals("MN")) {
                        c2 = 139;
                        break;
                    }
                    break;
                case 2466:
                    if (str.equals("MO")) {
                        c2 = 140;
                        break;
                    }
                    break;
                case 2467:
                    if (str.equals("MP")) {
                        c2 = 141;
                        break;
                    }
                    break;
                case 2468:
                    if (str.equals("MQ")) {
                        c2 = 142;
                        break;
                    }
                    break;
                case 2469:
                    if (str.equals("MR")) {
                        c2 = 143;
                        break;
                    }
                    break;
                case 2470:
                    if (str.equals("MS")) {
                        c2 = 144;
                        break;
                    }
                    break;
                case 2471:
                    if (str.equals("MT")) {
                        c2 = 145;
                        break;
                    }
                    break;
                case 2472:
                    if (str.equals("MU")) {
                        c2 = 146;
                        break;
                    }
                    break;
                case 2473:
                    if (str.equals("MV")) {
                        c2 = 147;
                        break;
                    }
                    break;
                case 2474:
                    if (str.equals("MW")) {
                        c2 = 148;
                        break;
                    }
                    break;
                case 2475:
                    if (str.equals("MX")) {
                        c2 = 149;
                        break;
                    }
                    break;
                case 2476:
                    if (str.equals("MY")) {
                        c2 = 150;
                        break;
                    }
                    break;
                case 2477:
                    if (str.equals("MZ")) {
                        c2 = 151;
                        break;
                    }
                    break;
                case 2483:
                    if (str.equals("NA")) {
                        c2 = 152;
                        break;
                    }
                    break;
                case 2485:
                    if (str.equals("NC")) {
                        c2 = 153;
                        break;
                    }
                    break;
                case 2487:
                    if (str.equals("NE")) {
                        c2 = 154;
                        break;
                    }
                    break;
                case 2488:
                    if (str.equals("NF")) {
                        c2 = 155;
                        break;
                    }
                    break;
                case 2489:
                    if (str.equals("NG")) {
                        c2 = 156;
                        break;
                    }
                    break;
                case 2491:
                    if (str.equals("NI")) {
                        c2 = 157;
                        break;
                    }
                    break;
                case 2494:
                    if (str.equals("NL")) {
                        c2 = 158;
                        break;
                    }
                    break;
                case 2497:
                    if (str.equals("NO")) {
                        c2 = 159;
                        break;
                    }
                    break;
                case 2498:
                    if (str.equals("NP")) {
                        c2 = 160;
                        break;
                    }
                    break;
                case 2500:
                    if (str.equals("NR")) {
                        c2 = 161;
                        break;
                    }
                    break;
                case 2503:
                    if (str.equals("NU")) {
                        c2 = 162;
                        break;
                    }
                    break;
                case 2508:
                    if (str.equals("NZ")) {
                        c2 = 163;
                        break;
                    }
                    break;
                case 2526:
                    if (str.equals("OM")) {
                        c2 = 164;
                        break;
                    }
                    break;
                case 2545:
                    if (str.equals("PA")) {
                        c2 = 165;
                        break;
                    }
                    break;
                case 2549:
                    if (str.equals("PE")) {
                        c2 = 166;
                        break;
                    }
                    break;
                case 2550:
                    if (str.equals("PF")) {
                        c2 = 167;
                        break;
                    }
                    break;
                case 2551:
                    if (str.equals("PG")) {
                        c2 = 168;
                        break;
                    }
                    break;
                case 2552:
                    if (str.equals("PH")) {
                        c2 = 169;
                        break;
                    }
                    break;
                case 2555:
                    if (str.equals("PK")) {
                        c2 = 170;
                        break;
                    }
                    break;
                case 2556:
                    if (str.equals("PL")) {
                        c2 = 171;
                        break;
                    }
                    break;
                case 2557:
                    if (str.equals("PM")) {
                        c2 = 172;
                        break;
                    }
                    break;
                case 2562:
                    if (str.equals("PR")) {
                        c2 = 173;
                        break;
                    }
                    break;
                case 2563:
                    if (str.equals("PS")) {
                        c2 = 174;
                        break;
                    }
                    break;
                case 2564:
                    if (str.equals("PT")) {
                        c2 = 175;
                        break;
                    }
                    break;
                case 2567:
                    if (str.equals("PW")) {
                        c2 = 176;
                        break;
                    }
                    break;
                case 2569:
                    if (str.equals("PY")) {
                        c2 = 177;
                        break;
                    }
                    break;
                case 2576:
                    if (str.equals("QA")) {
                        c2 = 178;
                        break;
                    }
                    break;
                case 2611:
                    if (str.equals("RE")) {
                        c2 = 179;
                        break;
                    }
                    break;
                case 2621:
                    if (str.equals("RO")) {
                        c2 = 180;
                        break;
                    }
                    break;
                case 2625:
                    if (str.equals("RS")) {
                        c2 = 181;
                        break;
                    }
                    break;
                case 2627:
                    if (str.equals("RU")) {
                        c2 = 182;
                        break;
                    }
                    break;
                case 2629:
                    if (str.equals("RW")) {
                        c2 = 183;
                        break;
                    }
                    break;
                case 2638:
                    if (str.equals("SA")) {
                        c2 = 184;
                        break;
                    }
                    break;
                case 2639:
                    if (str.equals("SB")) {
                        c2 = 185;
                        break;
                    }
                    break;
                case 2640:
                    if (str.equals("SC")) {
                        c2 = 186;
                        break;
                    }
                    break;
                case 2641:
                    if (str.equals("SD")) {
                        c2 = 187;
                        break;
                    }
                    break;
                case 2642:
                    if (str.equals("SE")) {
                        c2 = 188;
                        break;
                    }
                    break;
                case 2644:
                    if (str.equals("SG")) {
                        c2 = 189;
                        break;
                    }
                    break;
                case 2645:
                    if (str.equals("SH")) {
                        c2 = 190;
                        break;
                    }
                    break;
                case 2646:
                    if (str.equals("SI")) {
                        c2 = 191;
                        break;
                    }
                    break;
                case 2647:
                    if (str.equals("SJ")) {
                        c2 = 192;
                        break;
                    }
                    break;
                case 2648:
                    if (str.equals("SK")) {
                        c2 = 193;
                        break;
                    }
                    break;
                case 2649:
                    if (str.equals("SL")) {
                        c2 = 194;
                        break;
                    }
                    break;
                case 2650:
                    if (str.equals("SM")) {
                        c2 = 195;
                        break;
                    }
                    break;
                case 2651:
                    if (str.equals("SN")) {
                        c2 = 196;
                        break;
                    }
                    break;
                case 2652:
                    if (str.equals("SO")) {
                        c2 = 197;
                        break;
                    }
                    break;
                case 2655:
                    if (str.equals("SR")) {
                        c2 = 198;
                        break;
                    }
                    break;
                case 2656:
                    if (str.equals("SS")) {
                        c2 = 199;
                        break;
                    }
                    break;
                case 2657:
                    if (str.equals("ST")) {
                        c2 = 200;
                        break;
                    }
                    break;
                case 2659:
                    if (str.equals("SV")) {
                        c2 = 201;
                        break;
                    }
                    break;
                case 2661:
                    if (str.equals("SX")) {
                        c2 = 202;
                        break;
                    }
                    break;
                case 2662:
                    if (str.equals("SY")) {
                        c2 = 203;
                        break;
                    }
                    break;
                case 2663:
                    if (str.equals("SZ")) {
                        c2 = 204;
                        break;
                    }
                    break;
                case 2671:
                    if (str.equals("TC")) {
                        c2 = 205;
                        break;
                    }
                    break;
                case 2672:
                    if (str.equals("TD")) {
                        c2 = 206;
                        break;
                    }
                    break;
                case 2675:
                    if (str.equals("TG")) {
                        c2 = 207;
                        break;
                    }
                    break;
                case 2676:
                    if (str.equals("TH")) {
                        c2 = 208;
                        break;
                    }
                    break;
                case 2678:
                    if (str.equals("TJ")) {
                        c2 = 209;
                        break;
                    }
                    break;
                case 2680:
                    if (str.equals("TL")) {
                        c2 = 210;
                        break;
                    }
                    break;
                case 2681:
                    if (str.equals("TM")) {
                        c2 = 211;
                        break;
                    }
                    break;
                case 2682:
                    if (str.equals("TN")) {
                        c2 = 212;
                        break;
                    }
                    break;
                case 2683:
                    if (str.equals("TO")) {
                        c2 = 213;
                        break;
                    }
                    break;
                case 2686:
                    if (str.equals("TR")) {
                        c2 = 214;
                        break;
                    }
                    break;
                case 2688:
                    if (str.equals("TT")) {
                        c2 = 215;
                        break;
                    }
                    break;
                case 2690:
                    if (str.equals("TV")) {
                        c2 = 216;
                        break;
                    }
                    break;
                case 2691:
                    if (str.equals("TW")) {
                        c2 = 217;
                        break;
                    }
                    break;
                case 2694:
                    if (str.equals("TZ")) {
                        c2 = 218;
                        break;
                    }
                    break;
                case 2700:
                    if (str.equals("UA")) {
                        c2 = 219;
                        break;
                    }
                    break;
                case 2706:
                    if (str.equals("UG")) {
                        c2 = 220;
                        break;
                    }
                    break;
                case 2718:
                    if (str.equals("US")) {
                        c2 = 221;
                        break;
                    }
                    break;
                case 2724:
                    if (str.equals("UY")) {
                        c2 = 222;
                        break;
                    }
                    break;
                case 2725:
                    if (str.equals("UZ")) {
                        c2 = 223;
                        break;
                    }
                    break;
                case 2731:
                    if (str.equals("VA")) {
                        c2 = 224;
                        break;
                    }
                    break;
                case 2733:
                    if (str.equals("VC")) {
                        c2 = 225;
                        break;
                    }
                    break;
                case 2735:
                    if (str.equals("VE")) {
                        c2 = 226;
                        break;
                    }
                    break;
                case 2737:
                    if (str.equals("VG")) {
                        c2 = 227;
                        break;
                    }
                    break;
                case 2739:
                    if (str.equals("VI")) {
                        c2 = 228;
                        break;
                    }
                    break;
                case 2744:
                    if (str.equals("VN")) {
                        c2 = 229;
                        break;
                    }
                    break;
                case 2751:
                    if (str.equals("VU")) {
                        c2 = 230;
                        break;
                    }
                    break;
                case 2767:
                    if (str.equals("WF")) {
                        c2 = 231;
                        break;
                    }
                    break;
                case 2780:
                    if (str.equals("WS")) {
                        c2 = 232;
                        break;
                    }
                    break;
                case 2803:
                    if (str.equals("XK")) {
                        c2 = 233;
                        break;
                    }
                    break;
                case 2828:
                    if (str.equals("YE")) {
                        c2 = 234;
                        break;
                    }
                    break;
                case 2843:
                    if (str.equals("YT")) {
                        c2 = 235;
                        break;
                    }
                    break;
                case 2855:
                    if (str.equals("ZA")) {
                        c2 = 236;
                        break;
                    }
                    break;
                case 2867:
                    if (str.equals("ZM")) {
                        c2 = 237;
                        break;
                    }
                    break;
                case 2877:
                    if (str.equals("ZW")) {
                        c2 = 238;
                        break;
                    }
                    break;
            }
            switch (c2) {
                case 0:
                case 4:
                case 17:
                case 29:
                case '2':
                case '9':
                case 'q':
                case 't':
                case 202:
                case 225:
                    iArr = new int[]{1, 2, 0, 0, 2, 2};
                    break;
                case 1:
                    iArr = new int[]{1, 4, 2, 3, 4, 1};
                    break;
                case 2:
                case 204:
                    iArr = new int[]{4, 4, 3, 4, 2, 2};
                    break;
                case 3:
                case ')':
                    iArr = new int[]{2, 4, 3, 4, 2, 2};
                    break;
                case 5:
                    iArr = new int[]{1, 1, 1, 2, 2, 2};
                    break;
                case 6:
                case 165:
                    iArr = new int[]{2, 3, 2, 3, 2, 2};
                    break;
                case 7:
                    iArr = new int[]{3, 4, 4, 3, 2, 2};
                    break;
                case '\b':
                case '?':
                case 162:
                case 186:
                case 190:
                    iArr = new int[]{4, 2, 2, 2, 2, 2};
                    break;
                case '\t':
                    iArr = new int[]{2, 2, 2, 2, 1, 2};
                    break;
                case '\n':
                    iArr = new int[]{2, 2, 3, 3, 2, 2};
                    break;
                case 11:
                case '=':
                case ']':
                case 'f':
                case 127:
                case 145:
                case 188:
                    iArr = new int[]{0, 0, 0, 0, 0, 2};
                    break;
                case '\f':
                    iArr = new int[]{0, 3, 1, 1, 3, 0};
                    break;
                case '\r':
                    iArr = new int[]{2, 2, 3, 4, 2, 2};
                    break;
                case 14:
                case '3':
                case 'y':
                case 144:
                case 172:
                case 195:
                case 224:
                    iArr = new int[]{0, 2, 2, 2, 2, 2};
                    break;
                case 15:
                case '7':
                case 128:
                case 194:
                    iArr = new int[]{4, 2, 3, 3, 2, 2};
                    break;
                case 16:
                case 'j':
                case 214:
                    iArr = new int[]{1, 1, 1, 1, 2, 2};
                    break;
                case 18:
                    iArr = new int[]{2, 1, 3, 2, 4, 2};
                    break;
                case 19:
                    iArr = new int[]{0, 0, 1, 0, 1, 2};
                    break;
                case 20:
                case 187:
                case 203:
                case 206:
                    iArr = new int[]{4, 3, 4, 4, 2, 2};
                    break;
                case 21:
                case 175:
                case 191:
                    iArr = new int[]{0, 0, 0, 0, 1, 2};
                    break;
                case 22:
                    iArr = new int[]{1, 3, 1, 3, 4, 2};
                    break;
                case 23:
                case 'T':
                case '\\':
                case 154:
                case 226:
                case 234:
                    iArr = new int[]{4, 4, 4, 4, 2, 2};
                    break;
                case 24:
                    iArr = new int[]{4, 4, 2, 3, 2, 2};
                    break;
                case 25:
                case 141:
                case 177:
                    iArr = new int[]{1, 2, 2, 2, 2, 2};
                    break;
                case 26:
                    iArr = new int[]{0, 2, 0, 0, 2, 2};
                    break;
                case 27:
                    iArr = new int[]{3, 2, 0, 0, 2, 2};
                    break;
                case 28:
                    iArr = new int[]{1, 2, 4, 4, 2, 2};
                    break;
                case 30:
                    iArr = new int[]{1, 1, 1, 1, 2, 4};
                    break;
                case 31:
                    iArr = new int[]{3, 2, 1, 1, 2, 2};
                    break;
                case ' ':
                    iArr = new int[]{3, 1, 2, 2, 3, 2};
                    break;
                case '!':
                    iArr = new int[]{3, 2, 1, 0, 2, 2};
                    break;
                case '\"':
                    iArr = new int[]{1, 2, 3, 3, 2, 2};
                    break;
                case '#':
                case '*':
                    iArr = new int[]{2, 2, 2, 1, 2, 2};
                    break;
                case '$':
                case 219:
                    iArr = new int[]{0, 2, 1, 2, 3, 3};
                    break;
                case '%':
                case 137:
                    iArr = new int[]{3, 3, 2, 2, 2, 2};
                    break;
                case '&':
                    iArr = new int[]{4, 2, 4, 2, 2, 2};
                    break;
                case '\'':
                case '>':
                case 134:
                    iArr = new int[]{3, 4, 3, 3, 2, 2};
                    break;
                case '(':
                    iArr = new int[]{0, 1, 0, 0, 0, 2};
                    break;
                case '+':
                case 208:
                    iArr = new int[]{0, 1, 2, 2, 2, 2};
                    break;
                case ',':
                case 143:
                    iArr = new int[]{4, 3, 3, 4, 2, 2};
                    break;
                case '-':
                    iArr = new int[]{2, 0, 1, 1, 3, 1};
                    break;
                case '.':
                    iArr = new int[]{2, 3, 3, 2, 2, 2};
                    break;
                case '/':
                case 157:
                    iArr = new int[]{2, 4, 4, 4, 2, 2};
                    break;
                case '0':
                case 'o':
                case 161:
                case 210:
                    iArr = new int[]{4, 2, 4, 4, 2, 2};
                    break;
                case '1':
                    iArr = new int[]{2, 3, 0, 1, 2, 2};
                    break;
                case '4':
                    iArr = new int[]{1, 0, 1, 0, 0, 2};
                    break;
                case '5':
                    iArr = new int[]{0, 0, 2, 0, 1, 2};
                    break;
                case '6':
                    iArr = new int[]{0, 1, 4, 2, 2, 1};
                    break;
                case '8':
                    iArr = new int[]{0, 0, 2, 0, 0, 2};
                    break;
                case ':':
                case '{':
                    iArr = new int[]{3, 4, 4, 4, 2, 2};
                    break;
                case ';':
                case 209:
                    iArr = new int[]{3, 3, 4, 4, 2, 2};
                    break;
                case '<':
                    iArr = new int[]{1, 3, 2, 1, 2, 2};
                    break;
                case '@':
                    iArr = new int[]{0, 0, 0, 0, 1, 0};
                    break;
                case 'A':
                    iArr = new int[]{4, 3, 4, 4, 4, 2};
                    break;
                case 'B':
                    iArr = new int[]{0, 0, 0, 1, 0, 2};
                    break;
                case 'C':
                    iArr = new int[]{3, 2, 2, 3, 2, 2};
                    break;
                case 'D':
                case 155:
                case 192:
                    iArr = new int[]{3, 2, 2, 2, 2, 2};
                    break;
                case 'E':
                    iArr = new int[]{4, 2, 4, 0, 2, 2};
                    break;
                case 'F':
                    iArr = new int[]{0, 2, 2, 0, 2, 2};
                    break;
                case 'G':
                    iArr = new int[]{1, 1, 1, 1, 0, 2};
                    break;
                case 'H':
                    iArr = new int[]{3, 4, 0, 0, 2, 2};
                    break;
                case 'I':
                    iArr = new int[]{1, 1, 3, 2, 2, 2};
                    break;
                case 'J':
                    iArr = new int[]{2, 2, 0, 0, 2, 2};
                    break;
                case 'K':
                    iArr = new int[]{1, 1, 0, 2, 2, 2};
                    break;
                case 'L':
                    iArr = new int[]{3, 2, 3, 3, 2, 2};
                    break;
                case 'M':
                    iArr = new int[]{0, 2, 1, 1, 2, 2};
                    break;
                case 'N':
                    iArr = new int[]{3, 3, 3, 2, 2, 2};
                    break;
                case 'O':
                case 'a':
                case 'h':
                    iArr = new int[]{0, 2, 0, 1, 2, 2};
                    break;
                case 'P':
                case 130:
                    iArr = new int[]{1, 2, 2, 0, 2, 2};
                    break;
                case 'Q':
                case 199:
                    iArr = new int[]{4, 3, 2, 4, 2, 2};
                    break;
                case 'R':
                    iArr = new int[]{3, 4, 4, 2, 2, 2};
                    break;
                case 'S':
                    iArr = new int[]{2, 1, 1, 3, 2, 2};
                    break;
                case 'U':
                    iArr = new int[]{1, 0, 0, 0, 1, 2};
                    break;
                case 'V':
                    iArr = new int[]{2, 1, 2, 1, 2, 2};
                    break;
                case 'W':
                    iArr = new int[]{2, 2, 4, 3, 3, 2};
                    break;
                case 'X':
                    iArr = new int[]{4, 4, 1, 2, 2, 2};
                    break;
                case 'Y':
                    iArr = new int[]{3, 1, 1, 3, 2, 2};
                    break;
                case 'Z':
                    iArr = new int[]{0, 1, 0, 1, 1, 0};
                    break;
                case '[':
                case 's':
                    iArr = new int[]{1, 0, 0, 0, 0, 2};
                    break;
                case '^':
                    iArr = new int[]{3, 1, 3, 3, 2, 4};
                    break;
                case '_':
                    iArr = new int[]{1, 1, 1, 1, 1, 2};
                    break;
                case '`':
                    iArr = new int[]{1, 2, 2, 3, 4, 2};
                    break;
                case 'b':
                    iArr = new int[]{1, 1, 3, 2, 2, 3};
                    break;
                case 'c':
                    iArr = new int[]{3, 2, 2, 0, 2, 2};
                    break;
                case 'd':
                    iArr = new int[]{3, 2, 3, 2, 2, 2};
                    break;
                case 'e':
                    iArr = new int[]{4, 2, 3, 3, 4, 3};
                    break;
                case 'g':
                    iArr = new int[]{0, 1, 1, 2, 1, 2};
                    break;
                case 'i':
                    iArr = new int[]{2, 4, 3, 1, 2, 2};
                    break;
                case 'k':
                    iArr = new int[]{0, 3, 2, 3, 4, 2};
                    break;
                case 'l':
                    iArr = new int[]{3, 2, 1, 1, 1, 2};
                    break;
                case 'm':
                    iArr = new int[]{2, 1, 1, 2, 2, 2};
                    break;
                case 'n':
                    iArr = new int[]{1, 0, 4, 2, 2, 2};
                    break;
                case 'p':
                case 230:
                    iArr = new int[]{4, 3, 3, 2, 2, 2};
                    break;
                case 'r':
                    iArr = new int[]{0, 2, 2, 4, 4, 4};
                    break;
                case 'u':
                    iArr = new int[]{2, 1, 2, 2, 3, 2};
                    break;
                case 'v':
                    iArr = new int[]{1, 2, 1, 3, 2, 2};
                    break;
                case 'w':
                    iArr = new int[]{3, 1, 1, 2, 2, 2};
                    break;
                case 'x':
                    iArr = new int[]{2, 2, 1, 1, 2, 2};
                    break;
                case 'z':
                case 138:
                    iArr = new int[]{3, 2, 3, 3, 4, 2};
                    break;
                case '|':
                case 168:
                    iArr = new int[]{4, 3, 3, 3, 2, 2};
                    break;
                case '}':
                    iArr = new int[]{0, 1, 0, 1, 0, 2};
                    break;
                case '~':
                    iArr = new int[]{4, 0, 3, 2, 1, 3};
                    break;
                case 129:
                    iArr = new int[]{3, 3, 1, 1, 2, 2};
                    break;
                case 131:
                    iArr = new int[]{1, 0, 0, 0, 2, 2};
                    break;
                case 132:
                    iArr = new int[]{2, 0, 0, 1, 3, 2};
                    break;
                case 133:
                    iArr = new int[]{1, 2, 2, 3, 2, 2};
                    break;
                case 135:
                case 211:
                case 216:
                case 231:
                    iArr = new int[]{4, 2, 2, 4, 2, 2};
                    break;
                case 136:
                    iArr = new int[]{1, 0, 0, 1, 3, 2};
                    break;
                case 139:
                    iArr = new int[]{2, 0, 2, 2, 2, 2};
                    break;
                case 140:
                    iArr = new int[]{0, 2, 4, 4, 3, 1};
                    break;
                case 142:
                    iArr = new int[]{2, 1, 2, 3, 2, 2};
                    break;
                case 146:
                    iArr = new int[]{3, 1, 0, 2, 2, 2};
                    break;
                case 147:
                    iArr = new int[]{3, 2, 1, 3, 4, 2};
                    break;
                case 148:
                    iArr = new int[]{3, 2, 2, 1, 2, 2};
                    break;
                case 149:
                    iArr = new int[]{2, 4, 4, 4, 3, 2};
                    break;
                case 150:
                    iArr = new int[]{1, 0, 4, 1, 1, 0};
                    break;
                case 151:
                case 232:
                    iArr = new int[]{3, 1, 2, 2, 2, 2};
                    break;
                case 152:
                    iArr = new int[]{3, 4, 3, 2, 2, 2};
                    break;
                case 153:
                case 235:
                    iArr = new int[]{2, 3, 3, 4, 2, 2};
                    break;
                case 156:
                    iArr = new int[]{3, 4, 2, 1, 2, 2};
                    break;
                case 158:
                    iArr = new int[]{2, 1, 4, 3, 0, 4};
                    break;
                case 159:
                    iArr = new int[]{0, 0, 3, 0, 0, 2};
                    break;
                case 160:
                    iArr = new int[]{2, 2, 4, 3, 2, 2};
                    break;
                case 163:
                    iArr = new int[]{0, 0, 1, 2, 4, 2};
                    break;
                case 164:
                    iArr = new int[]{2, 3, 1, 2, 4, 2};
                    break;
                case 166:
                    iArr = new int[]{1, 2, 4, 4, 3, 2};
                    break;
                case 167:
                    iArr = new int[]{2, 2, 3, 1, 2, 2};
                    break;
                case 169:
                    iArr = new int[]{2, 1, 2, 3, 2, 1};
                    break;
                case 170:
                    iArr = new int[]{3, 3, 3, 3, 2, 2};
                    break;
                case 171:
                    iArr = new int[]{1, 0, 2, 2, 4, 4};
                    break;
                case 173:
                    iArr = new int[]{2, 0, 2, 1, 2, 0};
                    break;
                case 174:
                    iArr = new int[]{3, 4, 1, 3, 2, 2};
                    break;
                case 176:
                    iArr = new int[]{2, 2, 4, 1, 2, 2};
                    break;
                case 178:
                    iArr = new int[]{1, 4, 4, 4, 4, 2};
                    break;
                case 179:
                    iArr = new int[]{0, 3, 2, 3, 1, 2};
                    break;
                case 180:
                    iArr = new int[]{0, 0, 1, 1, 3, 2};
                    break;
                case 181:
                    iArr = new int[]{1, 0, 0, 1, 2, 2};
                    break;
                case 182:
                    iArr = new int[]{1, 0, 0, 1, 3, 3};
                    break;
                case 183:
                    iArr = new int[]{3, 3, 2, 0, 2, 2};
                    break;
                case 184:
                    iArr = new int[]{3, 1, 1, 2, 2, 0};
                    break;
                case 185:
                case 238:
                    iArr = new int[]{4, 2, 4, 3, 2, 2};
                    break;
                case 189:
                    iArr = new int[]{2, 3, 3, 3, 1, 1};
                    break;
                case 193:
                    iArr = new int[]{0, 1, 1, 1, 2, 2};
                    break;
                case 196:
                    iArr = new int[]{4, 4, 3, 2, 2, 2};
                    break;
                case 197:
                    iArr = new int[]{2, 2, 3, 4, 4, 2};
                    break;
                case 198:
                    iArr = new int[]{2, 4, 4, 1, 2, 2};
                    break;
                case 200:
                    iArr = new int[]{2, 2, 1, 2, 2, 2};
                    break;
                case 201:
                    iArr = new int[]{2, 3, 2, 1, 2, 2};
                    break;
                case 205:
                    iArr = new int[]{3, 2, 1, 2, 2, 2};
                    break;
                case 207:
                    iArr = new int[]{3, 4, 1, 0, 2, 2};
                    break;
                case 212:
                    iArr = new int[]{3, 1, 1, 1, 2, 2};
                    break;
                case 213:
                    iArr = new int[]{3, 2, 4, 3, 2, 2};
                    break;
                case 215:
                    iArr = new int[]{2, 4, 1, 0, 2, 2};
                    break;
                case 217:
                    iArr = new int[]{0, 0, 0, 0, 0, 0};
                    break;
                case 218:
                    iArr = new int[]{3, 4, 2, 1, 3, 2};
                    break;
                case 220:
                    iArr = new int[]{3, 3, 2, 3, 4, 2};
                    break;
                case 221:
                    iArr = new int[]{2, 2, 4, 1, 3, 1};
                    break;
                case 222:
                    iArr = new int[]{2, 1, 1, 2, 1, 2};
                    break;
                case 223:
                    iArr = new int[]{1, 2, 3, 4, 3, 2};
                    break;
                case 227:
                    iArr = new int[]{2, 2, 1, 1, 2, 4};
                    break;
                case 228:
                    iArr = new int[]{0, 2, 1, 2, 2, 2};
                    break;
                case 229:
                    iArr = new int[]{0, 0, 1, 2, 2, 2};
                    break;
                case 233:
                    iArr = new int[]{1, 2, 1, 1, 2, 2};
                    break;
                case 236:
                    iArr = new int[]{2, 4, 2, 1, 1, 2};
                    break;
                case 237:
                    iArr = new int[]{4, 4, 4, 3, 2, 2};
                    break;
                default:
                    iArr = new int[]{2, 2, 2, 2, 2, 2};
                    break;
            }
            if (i3 != 2) {
                if (i3 == 3) {
                    longValue = ((Long) f71q.get(iArr[1])).longValue();
                } else if (i3 == 4) {
                    longValue = ((Long) f72r.get(iArr[2])).longValue();
                } else if (i3 == 5) {
                    longValue = ((Long) f73s.get(iArr[3])).longValue();
                } else if (i3 != 7) {
                    if (i3 != 9) {
                        longValue = i3 != 10 ? 1000000L : ((Long) f74t.get(iArr[4])).longValue();
                    } else {
                        longValue = ((Long) f75u.get(iArr[5])).longValue();
                    }
                }
                l10 = Long.valueOf(longValue);
            }
            longValue = ((Long) f70p.get(iArr[0])).longValue();
            l10 = Long.valueOf(longValue);
        }
        if (l10 == null) {
            l10 = 1000000L;
        }
        return l10.longValue();
    }

    public final void d(long j10, int i3, long j11) {
        long j12;
        int i10;
        long j13;
        if (i3 != 0 || j10 != 0 || j11 != this.f86m) {
            this.f86m = j11;
            Iterator it = ((CopyOnWriteArrayList) this.f78c.f3211b).iterator();
            while (it.hasNext()) {
                c cVar = (c) it.next();
                if (!cVar.f63c) {
                    j12 = j10;
                    i10 = i3;
                    j13 = j11;
                    cVar.f61a.post(new b(cVar, i10, j12, j13, 0));
                } else {
                    j12 = j10;
                    i10 = i3;
                    j13 = j11;
                }
                i3 = i10;
                j10 = j12;
                j11 = j13;
            }
        }
    }

    public final synchronized void e(long j10, long j11) {
        try {
            this.d.getClass();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            this.f83j += (int) (elapsedRealtime - this.h);
            this.f84k += j10;
            if (j11 > 0 && j10 > 0) {
                this.f80f.a((((float) j10) * 8000.0f) / ((float) j11), (int) Math.sqrt(j10));
                if (this.f83j < 2000) {
                    if (this.f84k >= 524288) {
                    }
                    d(j10, (int) j11, this.f85l);
                    this.h = elapsedRealtime;
                    this.f82i = 0L;
                }
                this.f85l = this.f80f.b();
                d(j10, (int) j11, this.f85l);
                this.h = elapsedRealtime;
                this.f82i = 0L;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void f(i2.n r11, boolean r12) {
        throw new UnsupportedOperationException("Method not decompiled: a3.g.f(i2.n, boolean):void");
    }

    public final synchronized void g(i2.n r2, boolean r3) {
        throw new UnsupportedOperationException("Method not decompiled: a3.g.g(i2.n, boolean):void");
    }
}
