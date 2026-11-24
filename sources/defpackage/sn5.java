package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public final class sn5 implements qn5 {
    public static final Pattern i = Pattern.compile("^[!\"#\\$%&'\\(\\)\\*\\+,\\-\\./:;<=>\\?@\\[\\\\\\]\\^_`\\{\\|\\}~\\p{Pc}\\p{Pd}\\p{Pe}\\p{Pf}\\p{Pi}\\p{Po}\\p{Ps}]");
    public static final Pattern j = Pattern.compile("^(?:<[A-Za-z][A-Za-z0-9-]*(?:\\s+[a-zA-Z_:][a-zA-Z0-9:._-]*(?:\\s*=\\s*(?:[^\"'=<>`\\x00-\\x20]+|'[^']*'|\"[^\"]*\"))?)*\\s*/?>|</[A-Za-z][A-Za-z0-9-]*\\s*[>]|<!---->|<!--(?:-?[^>-])(?:-?[^-])*-->|[<][?].*?[?][>]|<![A-Z]+\\s+[^>]*>|<!\\[CDATA\\[[\\s\\S]*?\\]\\]>)", 2);
    public static final Pattern k = Pattern.compile("^[!\"#$%&'()*+,./:;<=>?@\\[\\\\\\]^_`{|}~-]");
    public static final Pattern l = Pattern.compile("^&(?:#x[a-f0-9]{1,6}|#[0-9]{1,7}|[a-z][a-z0-9]{1,31});", 2);
    public static final Pattern m = Pattern.compile("`+");
    public static final Pattern n = Pattern.compile("^`+");
    public static final Pattern o = Pattern.compile("^<([a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?(?:\\.[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?)*)>");
    public static final Pattern p = Pattern.compile("^<[a-zA-Z][a-zA-Z0-9.+-]{1,31}:[^<>\u0000- ]*>");
    public static final Pattern q = Pattern.compile("^ *(?:\n *)?");
    public static final Pattern r = Pattern.compile("^[\\p{Zs}\t\r\n\f]");
    public static final Pattern s = Pattern.compile("\\s+");
    public static final Pattern t = Pattern.compile(" *$");
    public final BitSet a;
    public final BitSet b;
    public final HashMap c;
    public final wk4 d;
    public String e;
    public int f;
    public ud3 g;
    public sy0 h;

    public sn5(wk4 wk4Var) {
        HashMap hashMap = new HashMap();
        c(Arrays.asList(new lx((byte) 0), new lx((byte) 1)), hashMap);
        c((ArrayList) wk4Var.b, hashMap);
        this.c = hashMap;
        Set<Character> keySet = hashMap.keySet();
        BitSet bitSet = new BitSet();
        for (Character ch : keySet) {
            bitSet.set(ch.charValue());
        }
        this.b = bitSet;
        BitSet bitSet2 = new BitSet();
        bitSet2.or(bitSet);
        bitSet2.set(10);
        bitSet2.set(96);
        bitSet2.set(91);
        bitSet2.set(93);
        bitSet2.set(92);
        bitSet2.set(33);
        bitSet2.set(60);
        bitSet2.set(38);
        this.a = bitSet2;
        this.d = wk4Var;
    }

    public static void b(char c, vd3 vd3Var, HashMap hashMap) {
        if (((vd3) hashMap.put(Character.valueOf(c), vd3Var)) == null) {
            return;
        }
        throw new IllegalArgumentException("Delimiter processor conflict with delimiter char '" + c + "'");
    }

    public static void c(List list, HashMap hashMap) {
        qma qmaVar;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            vd3 vd3Var = (vd3) it.next();
            char e = vd3Var.e();
            char b = vd3Var.b();
            if (e == b) {
                vd3 vd3Var2 = (vd3) hashMap.get(Character.valueOf(e));
                if (vd3Var2 != null && vd3Var2.e() == vd3Var2.b()) {
                    if (vd3Var2 instanceof qma) {
                        qmaVar = (qma) vd3Var2;
                    } else {
                        qma qmaVar2 = new qma(e);
                        qmaVar2.f(vd3Var2);
                        qmaVar = qmaVar2;
                    }
                    qmaVar.f(vd3Var);
                    hashMap.put(Character.valueOf(e), qmaVar);
                } else {
                    b(e, vd3Var, hashMap);
                }
            } else {
                b(e, vd3Var, hashMap);
                b(b, vd3Var, hashMap);
            }
        }
    }

    public static void e(ugb ugbVar, ugb ugbVar2, int i2) {
        if (ugbVar != null && ugbVar2 != null && ugbVar != ugbVar2) {
            StringBuilder sb = new StringBuilder(i2);
            sb.append(ugbVar.g);
            tg6 tg6Var = (tg6) ugbVar2.f;
            for (tg6 tg6Var2 = (tg6) ugbVar.f; tg6Var2 != tg6Var; tg6Var2 = (tg6) tg6Var2.f) {
                sb.append(((ugb) tg6Var2).g);
                tg6Var2.g();
            }
            ugbVar.g = sb.toString();
        }
    }

    public static void f(tg6 tg6Var, tg6 tg6Var2) {
        ugb ugbVar = null;
        ugb ugbVar2 = null;
        int i2 = 0;
        while (tg6Var != null) {
            if (tg6Var instanceof ugb) {
                ugbVar2 = (ugb) tg6Var;
                if (ugbVar == null) {
                    ugbVar = ugbVar2;
                }
                i2 = ugbVar2.g.length() + i2;
            } else {
                e(ugbVar, ugbVar2, i2);
                ugbVar = null;
                ugbVar2 = null;
                i2 = 0;
            }
            if (tg6Var == tg6Var2) {
                break;
            }
            tg6Var = (tg6) tg6Var.f;
        }
        e(ugbVar, ugbVar2, i2);
    }

    @Override
    public final void a(java.lang.String r26, defpackage.tg6 r27) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sn5.a(java.lang.String, tg6):void");
    }

    public final String d(Pattern pattern) {
        if (this.f >= this.e.length()) {
            return null;
        }
        Matcher matcher = pattern.matcher(this.e);
        matcher.region(this.f, this.e.length());
        if (!matcher.find()) {
            return null;
        }
        this.f = matcher.end();
        return matcher.group();
    }

    public final char g() {
        if (this.f < this.e.length()) {
            return this.e.charAt(this.f);
        }
        return (char) 0;
    }

    public final void h(ud3 ud3Var) {
        boolean z;
        tg6 tg6Var;
        HashMap hashMap = new HashMap();
        ud3 ud3Var2 = this.g;
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
            vd3 vd3Var = (vd3) this.c.get(Character.valueOf(c));
            if (ud3Var2.d && vd3Var != null) {
                char e = vd3Var.e();
                ud3 ud3Var4 = ud3Var2;
                int i2 = 0;
                boolean z2 = false;
                while (true) {
                    ud3Var4 = ud3Var4.e;
                    if (ud3Var4 == null || ud3Var4 == ud3Var || ud3Var4 == hashMap.get(Character.valueOf(c))) {
                        break;
                    } else if (ud3Var4.c && ud3Var4.b == e) {
                        i2 = vd3Var.d(ud3Var4, ud3Var2);
                        z2 = true;
                        if (i2 > 0) {
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
                            i(ud3Var2);
                        }
                    }
                    ud3Var2 = ud3Var2.f;
                } else {
                    ugb ugbVar2 = ud3Var4.a;
                    ud3Var4.g -= i2;
                    ud3Var2.g -= i2;
                    ugbVar2.g = ir2.n(i2, 0, ugbVar2.g);
                    ugbVar.g = ir2.n(i2, 0, ugbVar.g);
                    ud3 ud3Var5 = ud3Var2.e;
                    while (ud3Var5 != null && ud3Var5 != ud3Var4) {
                        ud3 ud3Var6 = ud3Var5.e;
                        i(ud3Var5);
                        ud3Var5 = ud3Var6;
                    }
                    if (ugbVar2 != ugbVar && (tg6Var = (tg6) ugbVar2.f) != ugbVar) {
                        f(tg6Var, (tg6) ugbVar.e);
                    }
                    vd3Var.a(ugbVar2, ugbVar, i2);
                    if (ud3Var4.g == 0) {
                        ud3Var4.a.g();
                        i(ud3Var4);
                    }
                    if (ud3Var2.g == 0) {
                        ud3 ud3Var7 = ud3Var2.f;
                        ugbVar.g();
                        i(ud3Var2);
                        ud3Var2 = ud3Var7;
                    }
                }
            } else {
                ud3Var2 = ud3Var2.f;
            }
        }
        while (true) {
            ud3 ud3Var8 = this.g;
            if (ud3Var8 != null && ud3Var8 != ud3Var) {
                i(ud3Var8);
            } else {
                return;
            }
        }
    }

    public final void i(ud3 ud3Var) {
        ud3 ud3Var2 = ud3Var.e;
        if (ud3Var2 != null) {
            ud3Var2.f = ud3Var.f;
        }
        ud3 ud3Var3 = ud3Var.f;
        if (ud3Var3 == null) {
            this.g = ud3Var2;
        } else {
            ud3Var3.e = ud3Var2;
        }
    }
}
