package defpackage;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public final class gl6 implements tp5 {
    public static final Pattern j = Pattern.compile("^[!\"#\\$%&'\\(\\)\\*\\+,\\-\\./:;<=>\\?@\\[\\\\\\]\\^_`\\{\\|\\}~\\p{Pc}\\p{Pd}\\p{Pe}\\p{Pf}\\p{Pi}\\p{Po}\\p{Ps}]");
    public static final Pattern k = Pattern.compile("^ *(?:\n *)?");
    public static final Pattern l = Pattern.compile("^[\\p{Zs}\t\r\n\f]");
    public static final Pattern m = Pattern.compile("^[!\"#$%&'()*+,./:;<=>?@\\[\\\\\\]^_`{|}~-]");
    public static final Pattern n = Pattern.compile("\\s+");
    public final um4 a;
    public final BitSet b;
    public final HashMap c;
    public final HashMap d;
    public yi6 e;
    public String f;
    public int g;
    public oe3 h;
    public az0 i;

    public gl6(um4 um4Var, ArrayList arrayList, ArrayList arrayList2) {
        oqa oqaVar;
        this.a = um4Var;
        HashMap hashMap = new HashMap(arrayList.size());
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            wp5 wp5Var = (wp5) obj;
            char c = wp5Var.c();
            List list = (List) hashMap.get(Character.valueOf(c));
            if (list == null) {
                list = new ArrayList(1);
                hashMap.put(Character.valueOf(c), list);
            }
            list.add(wp5Var);
        }
        this.c = hashMap;
        HashMap hashMap2 = new HashMap();
        int size2 = arrayList2.size();
        while (i < size2) {
            Object obj2 = arrayList2.get(i);
            i++;
            pe3 pe3Var = (pe3) obj2;
            char e = pe3Var.e();
            char b = pe3Var.b();
            if (e == b) {
                pe3 pe3Var2 = (pe3) hashMap2.get(Character.valueOf(e));
                if (pe3Var2 != null && pe3Var2.e() == pe3Var2.b()) {
                    if (pe3Var2 instanceof oqa) {
                        oqaVar = (oqa) pe3Var2;
                    } else {
                        oqa oqaVar2 = new oqa(e);
                        oqaVar2.f(pe3Var2);
                        oqaVar = oqaVar2;
                    }
                    oqaVar.f(pe3Var);
                    hashMap2.put(Character.valueOf(e), oqaVar);
                } else {
                    b(e, pe3Var, hashMap2);
                }
            } else {
                b(e, pe3Var, hashMap2);
                b(b, pe3Var, hashMap2);
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

    public static void b(char c, pe3 pe3Var, HashMap hashMap) {
        if (((pe3) hashMap.put(Character.valueOf(c), pe3Var)) == null) {
            return;
        }
        throw new IllegalArgumentException("Delimiter processor conflict with delimiter char '" + c + "'");
    }

    @Override
    public final void a(String str, yi6 yi6Var) {
        qkb qkbVar;
        String substring;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        uz1 uz1Var;
        this.f = str.trim();
        this.g = 0;
        this.h = null;
        this.i = null;
        this.e = yi6Var;
        while (true) {
            char d = d();
            if (d == 0) {
                qkbVar = null;
            } else {
                List list = (List) this.c.get(Character.valueOf(d));
                if (list != null) {
                    int i = this.g;
                    Iterator it = list.iterator();
                    qkbVar = null;
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        wp5 wp5Var = (wp5) it.next();
                        wp5Var.a = this;
                        wp5Var.b = this.e;
                        wp5Var.c = this.f;
                        wp5Var.d = this.g;
                        yi6 b = wp5Var.b();
                        this.g = wp5Var.d;
                        if (b != null) {
                            qkbVar = b;
                            break;
                        } else {
                            this.g = i;
                            qkbVar = b;
                        }
                    }
                } else {
                    pe3 pe3Var = (pe3) this.d.get(Character.valueOf(d));
                    int i2 = this.g;
                    if (pe3Var != null) {
                        int i3 = 0;
                        while (d() == d) {
                            i3++;
                            this.g++;
                        }
                        if (i3 < pe3Var.c()) {
                            this.g = i2;
                            uz1Var = null;
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
                                if (z && d == pe3Var.e()) {
                                    z3 = true;
                                } else {
                                    z3 = false;
                                }
                                if (z2 && d == pe3Var.b()) {
                                    z4 = true;
                                } else {
                                    z4 = false;
                                }
                                z5 = z3;
                            }
                            this.g = i2;
                            uz1Var = new uz1(i3, z5, z4);
                        }
                        if (uz1Var != null) {
                            int i4 = uz1Var.a;
                            int i5 = i2 + i4;
                            this.g = i5;
                            qkb qkbVar2 = new qkb(this.f.substring(i2, i5));
                            boolean z6 = uz1Var.c;
                            boolean z7 = uz1Var.b;
                            oe3 oe3Var = this.h;
                            oe3 oe3Var2 = new oe3(qkbVar2, d, z6, z7, oe3Var);
                            this.h = oe3Var2;
                            oe3Var2.g = i4;
                            oe3Var2.h = i4;
                            if (oe3Var != null) {
                                oe3Var.f = oe3Var2;
                            }
                            qkbVar = qkbVar2;
                        }
                        qkbVar = null;
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
                            qkbVar = new qkb(this.f.substring(i2, i7));
                        }
                        qkbVar = null;
                    }
                }
                if (qkbVar == null) {
                    this.g++;
                    qkbVar = new qkb(String.valueOf(d));
                }
            }
            if (qkbVar == null) {
                break;
            }
            yi6Var.b(qkbVar);
        }
        e(null);
        yi6 yi6Var2 = (yi6) yi6Var.c;
        yi6 yi6Var3 = (yi6) yi6Var.d;
        if (yi6Var2 == yi6Var3) {
            return;
        }
        spe.b(yi6Var2, yi6Var3);
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

    public final void e(oe3 oe3Var) {
        boolean z;
        yi6 yi6Var;
        HashMap hashMap = new HashMap();
        oe3 oe3Var2 = this.h;
        while (oe3Var2 != null) {
            oe3 oe3Var3 = oe3Var2.e;
            if (oe3Var3 == oe3Var) {
                break;
            }
            oe3Var2 = oe3Var3;
        }
        while (oe3Var2 != null) {
            qkb qkbVar = oe3Var2.a;
            char c = oe3Var2.b;
            pe3 pe3Var = (pe3) this.d.get(Character.valueOf(c));
            if (oe3Var2.d && pe3Var != null) {
                char e = pe3Var.e();
                oe3 oe3Var4 = oe3Var2;
                int i = 0;
                boolean z2 = false;
                while (true) {
                    oe3Var4 = oe3Var4.e;
                    if (oe3Var4 == null || oe3Var4 == oe3Var || oe3Var4 == hashMap.get(Character.valueOf(c))) {
                        break;
                    } else if (oe3Var4.c && oe3Var4.b == e) {
                        i = pe3Var.d(oe3Var4, oe3Var2);
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
                        hashMap.put(Character.valueOf(c), oe3Var2.e);
                        if (!oe3Var2.c) {
                            f(oe3Var2);
                        }
                    }
                    oe3Var2 = oe3Var2.f;
                } else {
                    qkb qkbVar2 = oe3Var4.a;
                    oe3Var4.g -= i;
                    oe3Var2.g -= i;
                    qkbVar2.g = bs2.n(i, 0, qkbVar2.g);
                    qkbVar.g = bs2.n(i, 0, qkbVar.g);
                    oe3 oe3Var5 = oe3Var2.e;
                    while (oe3Var5 != null && oe3Var5 != oe3Var4) {
                        oe3 oe3Var6 = oe3Var5.e;
                        f(oe3Var5);
                        oe3Var5 = oe3Var6;
                    }
                    if (qkbVar2 != qkbVar && (yi6Var = (yi6) qkbVar2.f) != qkbVar) {
                        spe.b(yi6Var, (yi6) qkbVar.e);
                    }
                    pe3Var.a(qkbVar2, qkbVar, i);
                    if (oe3Var4.g == 0) {
                        oe3Var4.a.g();
                        f(oe3Var4);
                    }
                    if (oe3Var2.g == 0) {
                        oe3 oe3Var7 = oe3Var2.f;
                        qkbVar.g();
                        f(oe3Var2);
                        oe3Var2 = oe3Var7;
                    }
                }
            } else {
                oe3Var2 = oe3Var2.f;
            }
        }
        while (true) {
            oe3 oe3Var8 = this.h;
            if (oe3Var8 != null && oe3Var8 != oe3Var) {
                f(oe3Var8);
            } else {
                return;
            }
        }
    }

    public final void f(oe3 oe3Var) {
        oe3 oe3Var2 = oe3Var.e;
        if (oe3Var2 != null) {
            oe3Var2.f = oe3Var.f;
        }
        oe3 oe3Var3 = oe3Var.f;
        if (oe3Var3 == null) {
            this.h = oe3Var2;
        } else {
            oe3Var3.e = oe3Var2;
        }
    }
}
