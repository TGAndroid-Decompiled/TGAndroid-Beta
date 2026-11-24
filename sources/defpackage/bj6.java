package defpackage;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public final class bj6 implements qn5 {
    public static final Pattern j = Pattern.compile("^[!\"#\\$%&'\\(\\)\\*\\+,\\-\\./:;<=>\\?@\\[\\\\\\]\\^_`\\{\\|\\}~\\p{Pc}\\p{Pd}\\p{Pe}\\p{Pf}\\p{Pi}\\p{Po}\\p{Ps}]");
    public static final Pattern k = Pattern.compile("^ *(?:\n *)?");
    public static final Pattern l = Pattern.compile("^[\\p{Zs}\t\r\n\f]");
    public static final Pattern m = Pattern.compile("^[!\"#$%&'()*+,./:;<=>?@\\[\\\\\\]^_`{|}~-]");
    public static final Pattern n = Pattern.compile("\\s+");
    public final wk4 a;
    public final BitSet b;
    public final HashMap c;
    public final HashMap d;
    public tg6 e;
    public String f;
    public int g;
    public ud3 h;
    public sy0 i;

    public bj6(wk4 wk4Var, ArrayList arrayList, ArrayList arrayList2) {
        rma rmaVar;
        this.a = wk4Var;
        HashMap hashMap = new HashMap(arrayList.size());
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            tn5 tn5Var = (tn5) obj;
            char c = tn5Var.c();
            List list = (List) hashMap.get(Character.valueOf(c));
            if (list == null) {
                list = new ArrayList(1);
                hashMap.put(Character.valueOf(c), list);
            }
            list.add(tn5Var);
        }
        this.c = hashMap;
        HashMap hashMap2 = new HashMap();
        int size2 = arrayList2.size();
        while (i < size2) {
            Object obj2 = arrayList2.get(i);
            i++;
            vd3 vd3Var = (vd3) obj2;
            char e = vd3Var.e();
            char b = vd3Var.b();
            if (e == b) {
                vd3 vd3Var2 = (vd3) hashMap2.get(Character.valueOf(e));
                if (vd3Var2 != null && vd3Var2.e() == vd3Var2.b()) {
                    if (vd3Var2 instanceof rma) {
                        rmaVar = (rma) vd3Var2;
                    } else {
                        rma rmaVar2 = new rma(e);
                        rmaVar2.f(vd3Var2);
                        rmaVar = rmaVar2;
                    }
                    rmaVar.f(vd3Var);
                    hashMap2.put(Character.valueOf(e), rmaVar);
                } else {
                    b(e, vd3Var, hashMap2);
                }
            } else {
                b(e, vd3Var, hashMap2);
                b(b, vd3Var, hashMap2);
            }
        }
        this.d = hashMap2;
        Set<Character> keySet = this.c.keySet();
        Set<Character> keySet2 = hashMap2.keySet();
        BitSet bitSet = new BitSet();
        for (Character ch : keySet) {
            bitSet.set(ch.charValue());
        }
        for (Character ch2 : keySet2) {
            bitSet.set(ch2.charValue());
        }
        this.b = bitSet;
    }

    public static void b(char c, vd3 vd3Var, HashMap hashMap) {
        if (((vd3) hashMap.put(Character.valueOf(c), vd3Var)) == null) {
            return;
        }
        throw new IllegalArgumentException("Delimiter processor conflict with delimiter char '" + c + "'");
    }

    @Override
    public final void a(String str, tg6 tg6Var) {
        ugb ugbVar;
        String substring;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        cz1 cz1Var;
        this.f = str.trim();
        this.g = 0;
        this.h = null;
        this.i = null;
        this.e = tg6Var;
        while (true) {
            char d = d();
            if (d == 0) {
                ugbVar = null;
            } else {
                List list = (List) this.c.get(Character.valueOf(d));
                if (list != null) {
                    int i = this.g;
                    Iterator it = list.iterator();
                    ugbVar = null;
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        tn5 tn5Var = (tn5) it.next();
                        tn5Var.a = this;
                        tn5Var.b = this.e;
                        tn5Var.c = this.f;
                        tn5Var.d = this.g;
                        tg6 b = tn5Var.b();
                        this.g = tn5Var.d;
                        if (b != null) {
                            ugbVar = b;
                            break;
                        } else {
                            this.g = i;
                            ugbVar = b;
                        }
                    }
                } else {
                    vd3 vd3Var = (vd3) this.d.get(Character.valueOf(d));
                    int i2 = this.g;
                    if (vd3Var != null) {
                        int i3 = 0;
                        while (d() == d) {
                            i3++;
                            this.g++;
                        }
                        if (i3 < vd3Var.c()) {
                            this.g = i2;
                            cz1Var = null;
                        } else {
                            String str2 = "\n";
                            if (i2 == 0) {
                                substring = "\n";
                            } else {
                                substring = this.f.substring(i2 - 1, i2);
                            }
                            char d2 = d();
                            if (d2 != 0) {
                                str2 = String.valueOf(d2);
                            }
                            Pattern pattern = j;
                            boolean matches = pattern.matcher(substring).matches();
                            Pattern pattern2 = l;
                            boolean matches2 = pattern2.matcher(substring).matches();
                            boolean matches3 = pattern.matcher(str2).matches();
                            boolean matches4 = pattern2.matcher(str2).matches();
                            if (!matches4 && (!matches3 || matches2 || matches)) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (!matches2 && (!matches || matches4 || matches3)) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            if (d == '_') {
                                if (z && (!z2 || matches)) {
                                    z5 = true;
                                } else {
                                    z5 = false;
                                }
                                if (z2 && (!z || matches3)) {
                                    z4 = true;
                                } else {
                                    z4 = false;
                                }
                            } else {
                                if (z && d == vd3Var.e()) {
                                    z3 = true;
                                } else {
                                    z3 = false;
                                }
                                if (z2 && d == vd3Var.b()) {
                                    z4 = true;
                                } else {
                                    z4 = false;
                                }
                                z5 = z3;
                            }
                            this.g = i2;
                            cz1Var = new cz1(i3, z5, z4);
                        }
                        if (cz1Var != null) {
                            int i4 = cz1Var.a;
                            int i5 = i2 + i4;
                            this.g = i5;
                            ugb ugbVar2 = new ugb(this.f.substring(i2, i5));
                            boolean z6 = cz1Var.c;
                            boolean z7 = cz1Var.b;
                            ud3 ud3Var = this.h;
                            ud3 ud3Var2 = new ud3(ugbVar2, d, z6, z7, ud3Var);
                            this.h = ud3Var2;
                            ud3Var2.g = i4;
                            ud3Var2.h = i4;
                            if (ud3Var != null) {
                                ud3Var.f = ud3Var2;
                            }
                            ugbVar = ugbVar2;
                        }
                        ugbVar = null;
                    } else {
                        int length = this.f.length();
                        while (true) {
                            int i6 = this.g;
                            if (i6 == length) {
                                break;
                            }
                            if (this.b.get(this.f.charAt(i6))) {
                                break;
                            }
                            this.g++;
                        }
                        int i7 = this.g;
                        if (i2 != i7) {
                            ugbVar = new ugb(this.f.substring(i2, i7));
                        }
                        ugbVar = null;
                    }
                }
                if (ugbVar == null) {
                    this.g++;
                    ugbVar = new ugb(String.valueOf(d));
                }
            }
            if (ugbVar == null) {
                break;
            }
            tg6Var.b(ugbVar);
        }
        e(null);
        tg6 tg6Var2 = (tg6) tg6Var.c;
        tg6 tg6Var3 = (tg6) tg6Var.d;
        if (tg6Var2 == tg6Var3) {
            return;
        }
        yke.b(tg6Var2, tg6Var3);
    }

    public final String c(Pattern pattern) {
        if (this.g >= this.f.length()) {
            return null;
        }
        Matcher matcher = pattern.matcher(this.f);
        matcher.region(this.g, this.f.length());
        if (!matcher.find()) {
            return null;
        }
        this.g = matcher.end();
        return matcher.group();
    }

    public final char d() {
        if (this.g < this.f.length()) {
            return this.f.charAt(this.g);
        }
        return (char) 0;
    }

    public final void e(ud3 ud3Var) {
        boolean z;
        tg6 tg6Var;
        HashMap hashMap = new HashMap();
        ud3 ud3Var2 = this.h;
        while (ud3Var2 != null) {
            ud3 ud3Var3 = ud3Var2.e;
            if (ud3Var3 == ud3Var) {
                break;
            }
            ud3Var2 = ud3Var3;
        }
        while (ud3Var2 != null) {
            ugb ugbVar = ud3Var2.a;
            char c = ud3Var2.b;
            vd3 vd3Var = (vd3) this.d.get(Character.valueOf(c));
            if (ud3Var2.d && vd3Var != null) {
                char e = vd3Var.e();
                ud3 ud3Var4 = ud3Var2;
                int i = 0;
                boolean z2 = false;
                while (true) {
                    ud3Var4 = ud3Var4.e;
                    if (ud3Var4 == null || ud3Var4 == ud3Var || ud3Var4 == hashMap.get(Character.valueOf(c))) {
                        break;
                    } else if (ud3Var4.c && ud3Var4.b == e) {
                        i = vd3Var.d(ud3Var4, ud3Var2);
                        z2 = true;
                        if (i > 0) {
                            z = true;
                            break;
                        }
                    }
                }
                z = z2;
                z2 = false;
                if (!z2) {
                    if (!z) {
                        hashMap.put(Character.valueOf(c), ud3Var2.e);
                        if (!ud3Var2.c) {
                            f(ud3Var2);
                        }
                    }
                    ud3Var2 = ud3Var2.f;
                } else {
                    ugb ugbVar2 = ud3Var4.a;
                    ud3Var4.g -= i;
                    ud3Var2.g -= i;
                    ugbVar2.g = ir2.n(i, 0, ugbVar2.g);
                    ugbVar.g = ir2.n(i, 0, ugbVar.g);
                    ud3 ud3Var5 = ud3Var2.e;
                    while (ud3Var5 != null && ud3Var5 != ud3Var4) {
                        ud3 ud3Var6 = ud3Var5.e;
                        f(ud3Var5);
                        ud3Var5 = ud3Var6;
                    }
                    if (ugbVar2 != ugbVar && (tg6Var = (tg6) ugbVar2.f) != ugbVar) {
                        yke.b(tg6Var, (tg6) ugbVar.e);
                    }
                    vd3Var.a(ugbVar2, ugbVar, i);
                    if (ud3Var4.g == 0) {
                        ud3Var4.a.g();
                        f(ud3Var4);
                    }
                    if (ud3Var2.g == 0) {
                        ud3 ud3Var7 = ud3Var2.f;
                        ugbVar.g();
                        f(ud3Var2);
                        ud3Var2 = ud3Var7;
                    }
                }
            } else {
                ud3Var2 = ud3Var2.f;
            }
        }
        while (true) {
            ud3 ud3Var8 = this.h;
            if (ud3Var8 != null && ud3Var8 != ud3Var) {
                f(ud3Var8);
            } else {
                return;
            }
        }
    }

    public final void f(ud3 ud3Var) {
        ud3 ud3Var2 = ud3Var.e;
        if (ud3Var2 != null) {
            ud3Var2.f = ud3Var.f;
        }
        ud3 ud3Var3 = ud3Var.f;
        if (ud3Var3 == null) {
            this.h = ud3Var2;
        } else {
            ud3Var3.e = ud3Var2;
        }
    }
}
