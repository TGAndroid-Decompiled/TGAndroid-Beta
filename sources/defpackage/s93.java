package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.SystemClock;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
public final class s93 implements vyb {
    public static final w59 p = mm5.t(4300000L, 3200000L, 2400000L, 1700000L, 860000L);
    public static final w59 q = mm5.t(1500000L, 980000L, 750000L, 520000L, 290000L);
    public static final w59 r = mm5.t(2000000L, 1300000L, 1000000L, 860000L, 610000L);
    public static final w59 s = mm5.t(2500000L, 1700000L, 1200000L, 970000L, 680000L);
    public static final w59 t = mm5.t(4700000L, 2800000L, 2100000L, 1700000L, 980000L);
    public static final w59 u = mm5.t(2700000L, 2000000L, 1600000L, 1300000L, 1000000L);
    public static s93 v;
    public final Context a;
    public final qm5 b;
    public final i4d c;
    public final adb d;
    public final boolean e;
    public final nja f;
    public int g;
    public long h;
    public long i;
    public long j;
    public long k;
    public volatile long l;
    public long m;
    public int n;
    public String o;

    public s93(Context context, HashMap hashMap) {
        Context applicationContext;
        boolean z;
        adb adbVar = adb.a;
        if (context == null) {
            applicationContext = null;
        } else {
            applicationContext = context.getApplicationContext();
        }
        this.a = applicationContext;
        this.b = qm5.b(hashMap);
        this.c = new i4d((byte) 9);
        this.f = new nja();
        this.d = adbVar;
        this.e = true;
        if (context != null) {
            ev2 g = ev2.g(context);
            int h = g.h();
            this.n = h;
            this.l = c(h);
            r93 r93Var = new r93(this);
            Executor a = pd0.a();
            CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) g.e;
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                aj7 aj7Var = (aj7) it.next();
                if (aj7Var.a.get() == null) {
                    copyOnWriteArrayList.remove(aj7Var);
                }
            }
            aj7 aj7Var2 = new aj7(g, r93Var, a);
            synchronized (g.f) {
                ((CopyOnWriteArrayList) g.e).add(aj7Var2);
                z = g.d;
            }
            if (z) {
                aj7Var2.b.execute(new vl6(aj7Var2, (byte) 22));
                return;
            }
            return;
        }
        this.n = 0;
        this.l = 1000000L;
    }

    public static synchronized s93 d(Context context) {
        s93 s93Var;
        Context applicationContext;
        synchronized (s93.class) {
            s93Var = v;
            if (s93Var == null) {
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
                s93Var = new s93(applicationContext, hashMap);
                v = s93Var;
            }
        }
        return s93Var;
    }

    public final void a(Handler handler, l93 l93Var) {
        l93Var.getClass();
        i4d i4dVar = this.c;
        i4dVar.getClass();
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) i4dVar.a;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            he0 he0Var = (he0) it.next();
            if (he0Var.b == l93Var) {
                he0Var.c = true;
                copyOnWriteArrayList.remove(he0Var);
            }
        }
        copyOnWriteArrayList.add(new he0(handler, l93Var));
    }

    public final synchronized long b() {
        return this.l;
    }

    public final long c(int i) {
        long longValue;
        Integer valueOf = Integer.valueOf(i);
        qm5 qm5Var = this.b;
        Long l = (Long) qm5Var.get(valueOf);
        int i2 = 0;
        if (l == null) {
            l = (Long) qm5Var.get(0);
        } else if (l.longValue() == -9223372036854775807L) {
            String str = this.o;
            if (str == null) {
                str = "";
            }
            char c = 65535;
            switch (str.hashCode()) {
                case 2083:
                    if (str.equals("AD")) {
                        c = 0;
                        break;
                    }
                    break;
                case 2084:
                    if (str.equals("AE")) {
                        c = 1;
                        break;
                    }
                    break;
                case 2085:
                    if (str.equals("AF")) {
                        c = 2;
                        break;
                    }
                    break;
                case 2086:
                    if (str.equals("AG")) {
                        c = 3;
                        break;
                    }
                    break;
                case 2088:
                    if (str.equals("AI")) {
                        c = 4;
                        break;
                    }
                    break;
                case 2091:
                    if (str.equals("AL")) {
                        c = 5;
                        break;
                    }
                    break;
                case 2092:
                    if (str.equals("AM")) {
                        c = 6;
                        break;
                    }
                    break;
                case 2094:
                    if (str.equals("AO")) {
                        c = 7;
                        break;
                    }
                    break;
                case 2096:
                    if (str.equals("AQ")) {
                        c = '\b';
                        break;
                    }
                    break;
                case 2097:
                    if (str.equals("AR")) {
                        c = '\t';
                        break;
                    }
                    break;
                case 2098:
                    if (str.equals("AS")) {
                        c = '\n';
                        break;
                    }
                    break;
                case 2099:
                    if (str.equals("AT")) {
                        c = 11;
                        break;
                    }
                    break;
                case 2100:
                    if (str.equals("AU")) {
                        c = '\f';
                        break;
                    }
                    break;
                case 2102:
                    if (str.equals("AW")) {
                        c = '\r';
                        break;
                    }
                    break;
                case 2103:
                    if (str.equals("AX")) {
                        c = 14;
                        break;
                    }
                    break;
                case 2105:
                    if (str.equals("AZ")) {
                        c = 15;
                        break;
                    }
                    break;
                case 2111:
                    if (str.equals("BA")) {
                        c = 16;
                        break;
                    }
                    break;
                case 2112:
                    if (str.equals("BB")) {
                        c = 17;
                        break;
                    }
                    break;
                case 2114:
                    if (str.equals("BD")) {
                        c = 18;
                        break;
                    }
                    break;
                case 2115:
                    if (str.equals("BE")) {
                        c = 19;
                        break;
                    }
                    break;
                case 2116:
                    if (str.equals("BF")) {
                        c = 20;
                        break;
                    }
                    break;
                case 2117:
                    if (str.equals("BG")) {
                        c = 21;
                        break;
                    }
                    break;
                case 2118:
                    if (str.equals("BH")) {
                        c = 22;
                        break;
                    }
                    break;
                case 2119:
                    if (str.equals("BI")) {
                        c = 23;
                        break;
                    }
                    break;
                case 2120:
                    if (str.equals("BJ")) {
                        c = 24;
                        break;
                    }
                    break;
                case 2122:
                    if (str.equals("BL")) {
                        c = 25;
                        break;
                    }
                    break;
                case 2123:
                    if (str.equals("BM")) {
                        c = 26;
                        break;
                    }
                    break;
                case 2124:
                    if (str.equals("BN")) {
                        c = 27;
                        break;
                    }
                    break;
                case 2125:
                    if (str.equals("BO")) {
                        c = 28;
                        break;
                    }
                    break;
                case 2127:
                    if (str.equals("BQ")) {
                        c = 29;
                        break;
                    }
                    break;
                case 2128:
                    if (str.equals("BR")) {
                        c = 30;
                        break;
                    }
                    break;
                case 2129:
                    if (str.equals("BS")) {
                        c = 31;
                        break;
                    }
                    break;
                case 2130:
                    if (str.equals("BT")) {
                        c = ' ';
                        break;
                    }
                    break;
                case 2133:
                    if (str.equals("BW")) {
                        c = '!';
                        break;
                    }
                    break;
                case 2135:
                    if (str.equals("BY")) {
                        c = '\"';
                        break;
                    }
                    break;
                case 2136:
                    if (str.equals("BZ")) {
                        c = '#';
                        break;
                    }
                    break;
                case 2142:
                    if (str.equals("CA")) {
                        c = '$';
                        break;
                    }
                    break;
                case 2145:
                    if (str.equals("CD")) {
                        c = '%';
                        break;
                    }
                    break;
                case 2147:
                    if (str.equals("CF")) {
                        c = '&';
                        break;
                    }
                    break;
                case 2148:
                    if (str.equals("CG")) {
                        c = '\'';
                        break;
                    }
                    break;
                case 2149:
                    if (str.equals("CH")) {
                        c = '(';
                        break;
                    }
                    break;
                case 2150:
                    if (str.equals("CI")) {
                        c = ')';
                        break;
                    }
                    break;
                case 2152:
                    if (str.equals("CK")) {
                        c = '*';
                        break;
                    }
                    break;
                case 2153:
                    if (str.equals("CL")) {
                        c = '+';
                        break;
                    }
                    break;
                case 2154:
                    if (str.equals("CM")) {
                        c = ',';
                        break;
                    }
                    break;
                case 2155:
                    if (str.equals("CN")) {
                        c = '-';
                        break;
                    }
                    break;
                case 2156:
                    if (str.equals("CO")) {
                        c = '.';
                        break;
                    }
                    break;
                case 2159:
                    if (str.equals("CR")) {
                        c = '/';
                        break;
                    }
                    break;
                case 2162:
                    if (str.equals("CU")) {
                        c = '0';
                        break;
                    }
                    break;
                case 2163:
                    if (str.equals("CV")) {
                        c = '1';
                        break;
                    }
                    break;
                case 2164:
                    if (str.equals("CW")) {
                        c = '2';
                        break;
                    }
                    break;
                case 2165:
                    if (str.equals("CX")) {
                        c = '3';
                        break;
                    }
                    break;
                case 2166:
                    if (str.equals("CY")) {
                        c = '4';
                        break;
                    }
                    break;
                case 2167:
                    if (str.equals("CZ")) {
                        c = '5';
                        break;
                    }
                    break;
                case 2177:
                    if (str.equals("DE")) {
                        c = '6';
                        break;
                    }
                    break;
                case 2182:
                    if (str.equals("DJ")) {
                        c = '7';
                        break;
                    }
                    break;
                case 2183:
                    if (str.equals("DK")) {
                        c = '8';
                        break;
                    }
                    break;
                case 2185:
                    if (str.equals("DM")) {
                        c = '9';
                        break;
                    }
                    break;
                case 2187:
                    if (str.equals("DO")) {
                        c = ':';
                        break;
                    }
                    break;
                case 2198:
                    if (str.equals("DZ")) {
                        c = ';';
                        break;
                    }
                    break;
                case 2206:
                    if (str.equals("EC")) {
                        c = '<';
                        break;
                    }
                    break;
                case 2208:
                    if (str.equals("EE")) {
                        c = '=';
                        break;
                    }
                    break;
                case 2210:
                    if (str.equals("EG")) {
                        c = '>';
                        break;
                    }
                    break;
                case 2221:
                    if (str.equals("ER")) {
                        c = '?';
                        break;
                    }
                    break;
                case 2222:
                    if (str.equals("ES")) {
                        c = '@';
                        break;
                    }
                    break;
                case 2223:
                    if (str.equals("ET")) {
                        c = 'A';
                        break;
                    }
                    break;
                case 2243:
                    if (str.equals("FI")) {
                        c = 'B';
                        break;
                    }
                    break;
                case 2244:
                    if (str.equals("FJ")) {
                        c = 'C';
                        break;
                    }
                    break;
                case 2245:
                    if (str.equals("FK")) {
                        c = 'D';
                        break;
                    }
                    break;
                case 2247:
                    if (str.equals("FM")) {
                        c = 'E';
                        break;
                    }
                    break;
                case 2249:
                    if (str.equals("FO")) {
                        c = 'F';
                        break;
                    }
                    break;
                case 2252:
                    if (str.equals("FR")) {
                        c = 'G';
                        break;
                    }
                    break;
                case 2266:
                    if (str.equals("GA")) {
                        c = 'H';
                        break;
                    }
                    break;
                case 2267:
                    if (str.equals("GB")) {
                        c = 'I';
                        break;
                    }
                    break;
                case 2269:
                    if (str.equals("GD")) {
                        c = 'J';
                        break;
                    }
                    break;
                case 2270:
                    if (str.equals("GE")) {
                        c = 'K';
                        break;
                    }
                    break;
                case 2271:
                    if (str.equals("GF")) {
                        c = 'L';
                        break;
                    }
                    break;
                case 2272:
                    if (str.equals("GG")) {
                        c = 'M';
                        break;
                    }
                    break;
                case 2273:
                    if (str.equals("GH")) {
                        c = 'N';
                        break;
                    }
                    break;
                case 2274:
                    if (str.equals("GI")) {
                        c = 'O';
                        break;
                    }
                    break;
                case 2277:
                    if (str.equals("GL")) {
                        c = 'P';
                        break;
                    }
                    break;
                case 2278:
                    if (str.equals("GM")) {
                        c = 'Q';
                        break;
                    }
                    break;
                case 2279:
                    if (str.equals("GN")) {
                        c = 'R';
                        break;
                    }
                    break;
                case 2281:
                    if (str.equals("GP")) {
                        c = 'S';
                        break;
                    }
                    break;
                case 2282:
                    if (str.equals("GQ")) {
                        c = 'T';
                        break;
                    }
                    break;
                case 2283:
                    if (str.equals("GR")) {
                        c = 'U';
                        break;
                    }
                    break;
                case 2285:
                    if (str.equals("GT")) {
                        c = 'V';
                        break;
                    }
                    break;
                case 2286:
                    if (str.equals("GU")) {
                        c = 'W';
                        break;
                    }
                    break;
                case 2288:
                    if (str.equals("GW")) {
                        c = 'X';
                        break;
                    }
                    break;
                case 2290:
                    if (str.equals("GY")) {
                        c = 'Y';
                        break;
                    }
                    break;
                case 2307:
                    if (str.equals("HK")) {
                        c = 'Z';
                        break;
                    }
                    break;
                case 2314:
                    if (str.equals("HR")) {
                        c = '[';
                        break;
                    }
                    break;
                case 2316:
                    if (str.equals("HT")) {
                        c = '\\';
                        break;
                    }
                    break;
                case 2317:
                    if (str.equals("HU")) {
                        c = ']';
                        break;
                    }
                    break;
                case 2331:
                    if (str.equals("ID")) {
                        c = '^';
                        break;
                    }
                    break;
                case 2332:
                    if (str.equals("IE")) {
                        c = '_';
                        break;
                    }
                    break;
                case 2339:
                    if (str.equals("IL")) {
                        c = '`';
                        break;
                    }
                    break;
                case 2340:
                    if (str.equals("IM")) {
                        c = 'a';
                        break;
                    }
                    break;
                case 2341:
                    if (str.equals("IN")) {
                        c = 'b';
                        break;
                    }
                    break;
                case 2342:
                    if (str.equals("IO")) {
                        c = 'c';
                        break;
                    }
                    break;
                case 2344:
                    if (str.equals("IQ")) {
                        c = 'd';
                        break;
                    }
                    break;
                case 2345:
                    if (str.equals("IR")) {
                        c = 'e';
                        break;
                    }
                    break;
                case 2346:
                    if (str.equals("IS")) {
                        c = 'f';
                        break;
                    }
                    break;
                case 2347:
                    if (str.equals("IT")) {
                        c = 'g';
                        break;
                    }
                    break;
                case 2363:
                    if (str.equals("JE")) {
                        c = 'h';
                        break;
                    }
                    break;
                case 2371:
                    if (str.equals("JM")) {
                        c = 'i';
                        break;
                    }
                    break;
                case 2373:
                    if (str.equals("JO")) {
                        c = 'j';
                        break;
                    }
                    break;
                case 2374:
                    if (str.equals("JP")) {
                        c = 'k';
                        break;
                    }
                    break;
                case 2394:
                    if (str.equals("KE")) {
                        c = 'l';
                        break;
                    }
                    break;
                case 2396:
                    if (str.equals("KG")) {
                        c = 'm';
                        break;
                    }
                    break;
                case 2397:
                    if (str.equals("KH")) {
                        c = 'n';
                        break;
                    }
                    break;
                case 2398:
                    if (str.equals("KI")) {
                        c = 'o';
                        break;
                    }
                    break;
                case 2402:
                    if (str.equals("KM")) {
                        c = 'p';
                        break;
                    }
                    break;
                case 2403:
                    if (str.equals("KN")) {
                        c = 'q';
                        break;
                    }
                    break;
                case 2407:
                    if (str.equals("KR")) {
                        c = 'r';
                        break;
                    }
                    break;
                case 2412:
                    if (str.equals("KW")) {
                        c = 's';
                        break;
                    }
                    break;
                case 2414:
                    if (str.equals("KY")) {
                        c = 't';
                        break;
                    }
                    break;
                case 2415:
                    if (str.equals("KZ")) {
                        c = 'u';
                        break;
                    }
                    break;
                case 2421:
                    if (str.equals("LA")) {
                        c = 'v';
                        break;
                    }
                    break;
                case 2422:
                    if (str.equals("LB")) {
                        c = 'w';
                        break;
                    }
                    break;
                case 2423:
                    if (str.equals("LC")) {
                        c = 'x';
                        break;
                    }
                    break;
                case 2429:
                    if (str.equals("LI")) {
                        c = 'y';
                        break;
                    }
                    break;
                case 2431:
                    if (str.equals("LK")) {
                        c = 'z';
                        break;
                    }
                    break;
                case 2438:
                    if (str.equals("LR")) {
                        c = '{';
                        break;
                    }
                    break;
                case 2439:
                    if (str.equals("LS")) {
                        c = '|';
                        break;
                    }
                    break;
                case 2440:
                    if (str.equals("LT")) {
                        c = '}';
                        break;
                    }
                    break;
                case 2441:
                    if (str.equals("LU")) {
                        c = '~';
                        break;
                    }
                    break;
                case 2442:
                    if (str.equals("LV")) {
                        c = 127;
                        break;
                    }
                    break;
                case 2445:
                    if (str.equals("LY")) {
                        c = 128;
                        break;
                    }
                    break;
                case 2452:
                    if (str.equals("MA")) {
                        c = 129;
                        break;
                    }
                    break;
                case 2454:
                    if (str.equals("MC")) {
                        c = 130;
                        break;
                    }
                    break;
                case 2455:
                    if (str.equals("MD")) {
                        c = 131;
                        break;
                    }
                    break;
                case 2456:
                    if (str.equals("ME")) {
                        c = 132;
                        break;
                    }
                    break;
                case 2457:
                    if (str.equals("MF")) {
                        c = 133;
                        break;
                    }
                    break;
                case 2458:
                    if (str.equals("MG")) {
                        c = 134;
                        break;
                    }
                    break;
                case 2459:
                    if (str.equals("MH")) {
                        c = 135;
                        break;
                    }
                    break;
                case 2462:
                    if (str.equals("MK")) {
                        c = 136;
                        break;
                    }
                    break;
                case 2463:
                    if (str.equals("ML")) {
                        c = 137;
                        break;
                    }
                    break;
                case 2464:
                    if (str.equals("MM")) {
                        c = 138;
                        break;
                    }
                    break;
                case 2465:
                    if (str.equals("MN")) {
                        c = 139;
                        break;
                    }
                    break;
                case 2466:
                    if (str.equals("MO")) {
                        c = 140;
                        break;
                    }
                    break;
                case 2467:
                    if (str.equals("MP")) {
                        c = 141;
                        break;
                    }
                    break;
                case 2468:
                    if (str.equals("MQ")) {
                        c = 142;
                        break;
                    }
                    break;
                case 2469:
                    if (str.equals("MR")) {
                        c = 143;
                        break;
                    }
                    break;
                case 2470:
                    if (str.equals("MS")) {
                        c = 144;
                        break;
                    }
                    break;
                case 2471:
                    if (str.equals("MT")) {
                        c = 145;
                        break;
                    }
                    break;
                case 2472:
                    if (str.equals("MU")) {
                        c = 146;
                        break;
                    }
                    break;
                case 2473:
                    if (str.equals("MV")) {
                        c = 147;
                        break;
                    }
                    break;
                case 2474:
                    if (str.equals("MW")) {
                        c = 148;
                        break;
                    }
                    break;
                case 2475:
                    if (str.equals("MX")) {
                        c = 149;
                        break;
                    }
                    break;
                case 2476:
                    if (str.equals("MY")) {
                        c = 150;
                        break;
                    }
                    break;
                case 2477:
                    if (str.equals("MZ")) {
                        c = 151;
                        break;
                    }
                    break;
                case 2483:
                    if (str.equals("NA")) {
                        c = 152;
                        break;
                    }
                    break;
                case 2485:
                    if (str.equals("NC")) {
                        c = 153;
                        break;
                    }
                    break;
                case 2487:
                    if (str.equals("NE")) {
                        c = 154;
                        break;
                    }
                    break;
                case 2488:
                    if (str.equals("NF")) {
                        c = 155;
                        break;
                    }
                    break;
                case 2489:
                    if (str.equals("NG")) {
                        c = 156;
                        break;
                    }
                    break;
                case 2491:
                    if (str.equals("NI")) {
                        c = 157;
                        break;
                    }
                    break;
                case 2494:
                    if (str.equals("NL")) {
                        c = 158;
                        break;
                    }
                    break;
                case 2497:
                    if (str.equals("NO")) {
                        c = 159;
                        break;
                    }
                    break;
                case 2498:
                    if (str.equals("NP")) {
                        c = 160;
                        break;
                    }
                    break;
                case 2500:
                    if (str.equals("NR")) {
                        c = 161;
                        break;
                    }
                    break;
                case 2503:
                    if (str.equals("NU")) {
                        c = 162;
                        break;
                    }
                    break;
                case 2508:
                    if (str.equals("NZ")) {
                        c = 163;
                        break;
                    }
                    break;
                case 2526:
                    if (str.equals("OM")) {
                        c = 164;
                        break;
                    }
                    break;
                case 2545:
                    if (str.equals("PA")) {
                        c = 165;
                        break;
                    }
                    break;
                case 2549:
                    if (str.equals("PE")) {
                        c = 166;
                        break;
                    }
                    break;
                case 2550:
                    if (str.equals("PF")) {
                        c = 167;
                        break;
                    }
                    break;
                case 2551:
                    if (str.equals("PG")) {
                        c = 168;
                        break;
                    }
                    break;
                case 2552:
                    if (str.equals("PH")) {
                        c = 169;
                        break;
                    }
                    break;
                case 2555:
                    if (str.equals("PK")) {
                        c = 170;
                        break;
                    }
                    break;
                case 2556:
                    if (str.equals("PL")) {
                        c = 171;
                        break;
                    }
                    break;
                case 2557:
                    if (str.equals("PM")) {
                        c = 172;
                        break;
                    }
                    break;
                case 2562:
                    if (str.equals("PR")) {
                        c = 173;
                        break;
                    }
                    break;
                case 2563:
                    if (str.equals("PS")) {
                        c = 174;
                        break;
                    }
                    break;
                case 2564:
                    if (str.equals("PT")) {
                        c = 175;
                        break;
                    }
                    break;
                case 2567:
                    if (str.equals("PW")) {
                        c = 176;
                        break;
                    }
                    break;
                case 2569:
                    if (str.equals("PY")) {
                        c = 177;
                        break;
                    }
                    break;
                case 2576:
                    if (str.equals("QA")) {
                        c = 178;
                        break;
                    }
                    break;
                case 2611:
                    if (str.equals("RE")) {
                        c = 179;
                        break;
                    }
                    break;
                case 2621:
                    if (str.equals("RO")) {
                        c = 180;
                        break;
                    }
                    break;
                case 2625:
                    if (str.equals("RS")) {
                        c = 181;
                        break;
                    }
                    break;
                case 2627:
                    if (str.equals("RU")) {
                        c = 182;
                        break;
                    }
                    break;
                case 2629:
                    if (str.equals("RW")) {
                        c = 183;
                        break;
                    }
                    break;
                case 2638:
                    if (str.equals("SA")) {
                        c = 184;
                        break;
                    }
                    break;
                case 2639:
                    if (str.equals("SB")) {
                        c = 185;
                        break;
                    }
                    break;
                case 2640:
                    if (str.equals("SC")) {
                        c = 186;
                        break;
                    }
                    break;
                case 2641:
                    if (str.equals("SD")) {
                        c = 187;
                        break;
                    }
                    break;
                case 2642:
                    if (str.equals("SE")) {
                        c = 188;
                        break;
                    }
                    break;
                case 2644:
                    if (str.equals("SG")) {
                        c = 189;
                        break;
                    }
                    break;
                case 2645:
                    if (str.equals("SH")) {
                        c = 190;
                        break;
                    }
                    break;
                case 2646:
                    if (str.equals("SI")) {
                        c = 191;
                        break;
                    }
                    break;
                case 2647:
                    if (str.equals("SJ")) {
                        c = 192;
                        break;
                    }
                    break;
                case 2648:
                    if (str.equals("SK")) {
                        c = 193;
                        break;
                    }
                    break;
                case 2649:
                    if (str.equals("SL")) {
                        c = 194;
                        break;
                    }
                    break;
                case 2650:
                    if (str.equals("SM")) {
                        c = 195;
                        break;
                    }
                    break;
                case 2651:
                    if (str.equals("SN")) {
                        c = 196;
                        break;
                    }
                    break;
                case 2652:
                    if (str.equals("SO")) {
                        c = 197;
                        break;
                    }
                    break;
                case 2655:
                    if (str.equals("SR")) {
                        c = 198;
                        break;
                    }
                    break;
                case 2656:
                    if (str.equals("SS")) {
                        c = 199;
                        break;
                    }
                    break;
                case 2657:
                    if (str.equals("ST")) {
                        c = 200;
                        break;
                    }
                    break;
                case 2659:
                    if (str.equals("SV")) {
                        c = 201;
                        break;
                    }
                    break;
                case 2661:
                    if (str.equals("SX")) {
                        c = 202;
                        break;
                    }
                    break;
                case 2662:
                    if (str.equals("SY")) {
                        c = 203;
                        break;
                    }
                    break;
                case 2663:
                    if (str.equals("SZ")) {
                        c = 204;
                        break;
                    }
                    break;
                case 2671:
                    if (str.equals("TC")) {
                        c = 205;
                        break;
                    }
                    break;
                case 2672:
                    if (str.equals("TD")) {
                        c = 206;
                        break;
                    }
                    break;
                case 2675:
                    if (str.equals("TG")) {
                        c = 207;
                        break;
                    }
                    break;
                case 2676:
                    if (str.equals("TH")) {
                        c = 208;
                        break;
                    }
                    break;
                case 2678:
                    if (str.equals("TJ")) {
                        c = 209;
                        break;
                    }
                    break;
                case 2680:
                    if (str.equals("TL")) {
                        c = 210;
                        break;
                    }
                    break;
                case 2681:
                    if (str.equals("TM")) {
                        c = 211;
                        break;
                    }
                    break;
                case 2682:
                    if (str.equals("TN")) {
                        c = 212;
                        break;
                    }
                    break;
                case 2683:
                    if (str.equals("TO")) {
                        c = 213;
                        break;
                    }
                    break;
                case 2686:
                    if (str.equals("TR")) {
                        c = 214;
                        break;
                    }
                    break;
                case 2688:
                    if (str.equals("TT")) {
                        c = 215;
                        break;
                    }
                    break;
                case 2690:
                    if (str.equals("TV")) {
                        c = 216;
                        break;
                    }
                    break;
                case 2691:
                    if (str.equals("TW")) {
                        c = 217;
                        break;
                    }
                    break;
                case 2694:
                    if (str.equals("TZ")) {
                        c = 218;
                        break;
                    }
                    break;
                case 2700:
                    if (str.equals("UA")) {
                        c = 219;
                        break;
                    }
                    break;
                case 2706:
                    if (str.equals("UG")) {
                        c = 220;
                        break;
                    }
                    break;
                case 2718:
                    if (str.equals("US")) {
                        c = 221;
                        break;
                    }
                    break;
                case 2724:
                    if (str.equals("UY")) {
                        c = 222;
                        break;
                    }
                    break;
                case 2725:
                    if (str.equals("UZ")) {
                        c = 223;
                        break;
                    }
                    break;
                case 2731:
                    if (str.equals("VA")) {
                        c = 224;
                        break;
                    }
                    break;
                case 2733:
                    if (str.equals("VC")) {
                        c = 225;
                        break;
                    }
                    break;
                case 2735:
                    if (str.equals("VE")) {
                        c = 226;
                        break;
                    }
                    break;
                case 2737:
                    if (str.equals("VG")) {
                        c = 227;
                        break;
                    }
                    break;
                case 2739:
                    if (str.equals("VI")) {
                        c = 228;
                        break;
                    }
                    break;
                case 2744:
                    if (str.equals("VN")) {
                        c = 229;
                        break;
                    }
                    break;
                case 2751:
                    if (str.equals("VU")) {
                        c = 230;
                        break;
                    }
                    break;
                case 2767:
                    if (str.equals("WF")) {
                        c = 231;
                        break;
                    }
                    break;
                case 2780:
                    if (str.equals("WS")) {
                        c = 232;
                        break;
                    }
                    break;
                case 2803:
                    if (str.equals("XK")) {
                        c = 233;
                        break;
                    }
                    break;
                case 2828:
                    if (str.equals("YE")) {
                        c = 234;
                        break;
                    }
                    break;
                case 2843:
                    if (str.equals("YT")) {
                        c = 235;
                        break;
                    }
                    break;
                case 2855:
                    if (str.equals("ZA")) {
                        c = 236;
                        break;
                    }
                    break;
                case 2867:
                    if (str.equals("ZM")) {
                        c = 237;
                        break;
                    }
                    break;
                case 2877:
                    if (str.equals("ZW")) {
                        c = 238;
                        break;
                    }
                    break;
            }
            switch (c) {
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
                    i2 = 73745;
                    break;
                case 1:
                    i2 = 50849;
                    break;
                case 2:
                case 204:
                    i2 = 76004;
                    break;
                case 3:
                case ')':
                    i2 = 76002;
                    break;
                case 5:
                    i2 = 74825;
                    break;
                case 6:
                case 165:
                    i2 = 75418;
                    break;
                case 7:
                    i2 = 75555;
                    break;
                case '\b':
                case '?':
                case 162:
                case 186:
                case 190:
                    i2 = 74900;
                    break;
                case '\t':
                    i2 = 70802;
                    break;
                case '\n':
                    i2 = 75474;
                    break;
                case 11:
                case '=':
                case ']':
                case 'f':
                case 127:
                case 145:
                case 188:
                    i2 = 65536;
                    break;
                case '\f':
                    i2 = 12888;
                    break;
                case '\r':
                    i2 = 75986;
                    break;
                case 14:
                case '3':
                case 'y':
                case 144:
                case 172:
                case 195:
                case 224:
                    i2 = 74896;
                    break;
                case 15:
                case '7':
                case 128:
                case 194:
                    i2 = 75476;
                    break;
                case 16:
                case 'j':
                case 214:
                    i2 = 74313;
                    break;
                case 18:
                    i2 = 83146;
                    break;
                case 19:
                    i2 = 69696;
                    break;
                case 20:
                case 187:
                case 203:
                case 206:
                    i2 = 76060;
                    break;
                case 21:
                case 175:
                case 191:
                    i2 = 69632;
                    break;
                case 22:
                    i2 = 83545;
                    break;
                case 23:
                case 'T':
                case '\\':
                case 154:
                case 226:
                case 234:
                    i2 = 76068;
                    break;
                case 24:
                    i2 = 75428;
                    break;
                case 25:
                case 141:
                case 177:
                    i2 = 74897;
                    break;
                case 26:
                    i2 = 73744;
                    break;
                case 27:
                    i2 = 73747;
                    break;
                case 28:
                    i2 = 76049;
                    break;
                case 30:
                    i2 = 139849;
                    break;
                case 31:
                    i2 = 74323;
                    break;
                case ' ':
                    i2 = 78987;
                    break;
                case '!':
                    i2 = 73811;
                    break;
                case '\"':
                    i2 = 75473;
                    break;
                case '#':
                case '*':
                    i2 = 74386;
                    break;
                case '$':
                case 219:
                    i2 = 111696;
                    break;
                case '%':
                case 137:
                    i2 = 74907;
                    break;
                case '&':
                    i2 = 75028;
                    break;
                case '\'':
                case '>':
                case 134:
                    i2 = 75491;
                    break;
                case '(':
                    i2 = 65544;
                    break;
                case '+':
                case 208:
                    i2 = 74888;
                    break;
                case ',':
                case 143:
                    i2 = 75996;
                    break;
                case '-':
                    i2 = 45634;
                    break;
                case '.':
                    i2 = 74970;
                    break;
                case '/':
                case 157:
                    i2 = 76066;
                    break;
                case '0':
                case 'o':
                case 161:
                case 210:
                    i2 = 76052;
                    break;
                case '1':
                    i2 = 74266;
                    break;
                case '4':
                    i2 = 65601;
                    break;
                case '5':
                    i2 = 69760;
                    break;
                case '6':
                    i2 = 42248;
                    break;
                case '8':
                    i2 = 65664;
                    break;
                case ':':
                case '{':
                    i2 = 76067;
                    break;
                case ';':
                case 209:
                    i2 = 76059;
                    break;
                case '<':
                    i2 = 74393;
                    break;
                case '@':
                    i2 = 4096;
                    break;
                case 'A':
                    i2 = 84252;
                    break;
                case 'B':
                    i2 = 66048;
                    break;
                case 'C':
                    i2 = 75411;
                    break;
                case 'D':
                case 155:
                case 192:
                    i2 = 74899;
                    break;
                case 'E':
                    i2 = 74004;
                    break;
                case 'F':
                    i2 = 73872;
                    break;
                case 'G':
                    i2 = 66121;
                    break;
                case 'H':
                    i2 = 73763;
                    break;
                case 'I':
                    i2 = 74953;
                    break;
                case 'J':
                    i2 = 73746;
                    break;
                case 'K':
                    i2 = 74761;
                    break;
                case 'L':
                    i2 = 75475;
                    break;
                case 'M':
                    i2 = 74320;
                    break;
                case 'N':
                    i2 = 74971;
                    break;
                case 'O':
                case 'a':
                case 'h':
                    i2 = 74256;
                    break;
                case 'P':
                case 130:
                    i2 = 73873;
                    break;
                case 'Q':
                case 199:
                    i2 = 75932;
                    break;
                case 'R':
                    i2 = 75043;
                    break;
                case 'S':
                    i2 = 75338;
                    break;
                case 'U':
                    i2 = 69633;
                    break;
                case 'V':
                    i2 = 74378;
                    break;
                case 'W':
                    i2 = 79634;
                    break;
                case 'X':
                    i2 = 74852;
                    break;
                case 'Y':
                    i2 = 75339;
                    break;
                case 'Z':
                    i2 = 4616;
                    break;
                case '[':
                case 's':
                    i2 = 65537;
                    break;
                case '^':
                    i2 = 141003;
                    break;
                case '_':
                    i2 = 70217;
                    break;
                case '`':
                    i2 = 83601;
                    break;
                case 'b':
                    i2 = 107721;
                    break;
                case 'c':
                    i2 = 73875;
                    break;
                case 'd':
                    i2 = 74963;
                    break;
                case 'e':
                    i2 = 116436;
                    break;
                case 'g':
                    i2 = 70728;
                    break;
                case 'i':
                    i2 = 74466;
                    break;
                case 'k':
                    i2 = 83608;
                    break;
                case 'l':
                    i2 = 70227;
                    break;
                case 'm':
                    i2 = 74826;
                    break;
                case 'n':
                    i2 = 75009;
                    break;
                case 'p':
                case 230:
                    i2 = 74972;
                    break;
                case 'r':
                    i2 = 149648;
                    break;
                case 'u':
                    i2 = 78986;
                    break;
                case 'v':
                    i2 = 75345;
                    break;
                case 'w':
                    i2 = 74827;
                    break;
                case 'x':
                    i2 = 74322;
                    break;
                case 'z':
                case 138:
                    i2 = 83667;
                    break;
                case '|':
                case 168:
                    i2 = 75484;
                    break;
                case '}':
                    i2 = 66056;
                    break;
                case '~':
                    i2 = 103620;
                    break;
                case 129:
                    i2 = 74331;
                    break;
                case 131:
                    i2 = 73729;
                    break;
                case 132:
                    i2 = 78338;
                    break;
                case 133:
                    i2 = 75409;
                    break;
                case 135:
                case 211:
                case 216:
                case 231:
                    i2 = 75924;
                    break;
                case 136:
                    i2 = 78337;
                    break;
                case 139:
                    i2 = 74882;
                    break;
                case 140:
                    i2 = 47376;
                    break;
                case 142:
                    i2 = 75402;
                    break;
                case 146:
                    i2 = 74763;
                    break;
                case 147:
                    i2 = 83539;
                    break;
                case 148:
                    i2 = 74387;
                    break;
                case 149:
                    i2 = 80162;
                    break;
                case 150:
                    i2 = 4865;
                    break;
                case 151:
                case 232:
                    i2 = 74891;
                    break;
                case 152:
                    i2 = 74979;
                    break;
                case 153:
                case 235:
                    i2 = 75994;
                    break;
                case 156:
                    i2 = 74403;
                    break;
                case 158:
                    i2 = 132874;
                    break;
                case 159:
                    i2 = 65728;
                    break;
                case 160:
                    i2 = 75538;
                    break;
                case 163:
                    i2 = 83008;
                    break;
                case 164:
                    i2 = 83034;
                    break;
                case 166:
                    i2 = 80145;
                    break;
                case 167:
                    i2 = 74450;
                    break;
                case 169:
                    i2 = 42634;
                    break;
                case 170:
                    i2 = 75483;
                    break;
                case 171:
                    i2 = 148609;
                    break;
                case 173:
                    i2 = 8834;
                    break;
                case 174:
                    i2 = 75363;
                    break;
                case 176:
                    i2 = 74514;
                    break;
                case 178:
                    i2 = 84257;
                    break;
                case 179:
                    i2 = 71320;
                    break;
                case 180:
                    i2 = 78400;
                    break;
                case 181:
                    i2 = 74241;
                    break;
                case 182:
                    i2 = 111105;
                    break;
                case 183:
                    i2 = 73883;
                    break;
                case 184:
                    i2 = 9291;
                    break;
                case 185:
                case 238:
                    i2 = 75540;
                    break;
                case 189:
                    i2 = 38618;
                    break;
                case 193:
                    i2 = 74312;
                    break;
                case 196:
                    i2 = 74980;
                    break;
                case 197:
                    i2 = 84178;
                    break;
                case 198:
                    i2 = 74530;
                    break;
                case 200:
                    i2 = 74834;
                    break;
                case 201:
                    i2 = 74394;
                    break;
                case 205:
                    i2 = 74835;
                    break;
                case 207:
                    i2 = 73827;
                    break;
                case 212:
                    i2 = 74315;
                    break;
                case 213:
                    i2 = 75539;
                    break;
                case 215:
                    i2 = 73826;
                    break;
                case 217:
                    break;
                case 218:
                    i2 = 78499;
                    break;
                case 220:
                    i2 = 83611;
                    break;
                case 221:
                    i2 = 45842;
                    break;
                case 222:
                    i2 = 70730;
                    break;
                case 223:
                    i2 = 80081;
                    break;
                case 227:
                    i2 = 139858;
                    break;
                case 228:
                    i2 = 74832;
                    break;
                case 229:
                    i2 = 74816;
                    break;
                case 233:
                    i2 = 74321;
                    break;
                case 236:
                    i2 = 70306;
                    break;
                case 237:
                    i2 = 75556;
                    break;
                default:
                    i2 = 74898;
                    break;
            }
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i != 5) {
                            if (i != 7) {
                                if (i != 9) {
                                    if (i != 10) {
                                        longValue = 1000000;
                                    } else {
                                        longValue = ((Long) t.get((i2 >> 12) & 7)).longValue();
                                    }
                                } else {
                                    longValue = ((Long) u.get((i2 >> 15) & 7)).longValue();
                                }
                            }
                        } else {
                            longValue = ((Long) s.get((i2 >> 9) & 7)).longValue();
                        }
                    } else {
                        longValue = ((Long) r.get((i2 >> 6) & 7)).longValue();
                    }
                } else {
                    longValue = ((Long) q.get((i2 >> 3) & 7)).longValue();
                }
                l = Long.valueOf(longValue);
            }
            longValue = ((Long) p.get(i2 & 7)).longValue();
            l = Long.valueOf(longValue);
        }
        if (l == null) {
            l = 1000000L;
        }
        return l.longValue();
    }

    public final void e(long j, int i, long j2) {
        long j3;
        int i2;
        long j4;
        if (i != 0 || j != 0 || j2 != this.m) {
            this.m = j2;
            Iterator it = ((CopyOnWriteArrayList) this.c.a).iterator();
            while (it.hasNext()) {
                he0 he0Var = (he0) it.next();
                if (!he0Var.c) {
                    j3 = j;
                    i2 = i;
                    j4 = j2;
                    he0Var.a.post(new l30(he0Var, i2, j3, j4, (byte) 1));
                } else {
                    j3 = j;
                    i2 = i;
                    j4 = j2;
                }
                i = i2;
                j = j3;
                j2 = j4;
            }
        }
    }

    public final synchronized void f(long j, long j2) {
        this.d.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        this.j += (int) (elapsedRealtime - this.h);
        this.k += j;
        if (j2 > 0 && j > 0) {
            this.f.a((((float) j) * 8000.0f) / ((float) j2), (int) Math.sqrt(j));
            if (this.j >= 2000 || this.k >= 524288) {
                this.l = this.f.b();
            }
            e(j, (int) j2, this.l);
            this.h = elapsedRealtime;
            this.i = 0L;
        }
    }

    public final synchronized void g(defpackage.u63 r11, boolean r12) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.s93.g(u63, boolean):void");
    }

    public final synchronized void h(defpackage.u63 r2, boolean r3) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.s93.h(u63, boolean):void");
    }
}
