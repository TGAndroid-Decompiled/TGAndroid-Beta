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
public final class vp5 implements tp5 {
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
    public final um4 d;
    public String e;
    public int f;
    public oe3 g;
    public az0 h;

    public vp5(um4 um4Var) {
        HashMap hashMap = new HashMap();
        c(Arrays.asList(new mx((byte) 0), new mx((byte) 1)), hashMap);
        c((ArrayList) um4Var.b, hashMap);
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
        this.d = um4Var;
    }

    public static void b(char c, pe3 pe3Var, HashMap hashMap) {
        if (((pe3) hashMap.put(Character.valueOf(c), pe3Var)) == null) {
            return;
        }
        throw new IllegalArgumentException("Delimiter processor conflict with delimiter char '" + c + "'");
    }

    public static void c(List list, HashMap hashMap) {
        nqa nqaVar;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            pe3 pe3Var = (pe3) it.next();
            char e = pe3Var.e();
            char b = pe3Var.b();
            if (e == b) {
                pe3 pe3Var2 = (pe3) hashMap.get(Character.valueOf(e));
                if (pe3Var2 != null && pe3Var2.e() == pe3Var2.b()) {
                    if (pe3Var2 instanceof nqa) {
                        nqaVar = (nqa) pe3Var2;
                    } else {
                        nqa nqaVar2 = new nqa(e);
                        nqaVar2.f(pe3Var2);
                        nqaVar = nqaVar2;
                    }
                    nqaVar.f(pe3Var);
                    hashMap.put(Character.valueOf(e), nqaVar);
                } else {
                    b(e, pe3Var, hashMap);
                }
            } else {
                b(e, pe3Var, hashMap);
                b(b, pe3Var, hashMap);
            }
        }
    }

    public static void e(qkb qkbVar, qkb qkbVar2, int i2) {
        if (qkbVar != null && qkbVar2 != null && qkbVar != qkbVar2) {
            StringBuilder sb = new StringBuilder(i2);
            sb.append(qkbVar.g);
            yi6 yi6Var = (yi6) qkbVar2.f;
            for (yi6 yi6Var2 = (yi6) qkbVar.f; yi6Var2 != yi6Var; yi6Var2 = (yi6) yi6Var2.f) {
                sb.append(((qkb) yi6Var2).g);
                yi6Var2.g();
            }
            qkbVar.g = sb.toString();
        }
    }

    public static void f(yi6 yi6Var, yi6 yi6Var2) {
        qkb qkbVar = null;
        qkb qkbVar2 = null;
        int i2 = 0;
        while (yi6Var != null) {
            if (yi6Var instanceof qkb) {
                qkbVar2 = (qkb) yi6Var;
                if (qkbVar == null) {
                    qkbVar = qkbVar2;
                }
                i2 = qkbVar2.g.length() + i2;
            } else {
                e(qkbVar, qkbVar2, i2);
                qkbVar = null;
                qkbVar2 = null;
                i2 = 0;
            }
            if (yi6Var == yi6Var2) {
                break;
            }
            yi6Var = (yi6) yi6Var.f;
        }
        e(qkbVar, qkbVar2, i2);
    }

    @Override
    public final void a(java.lang.String r26, defpackage.yi6 r27) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vp5.a(java.lang.String, yi6):void");
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

    public final void h(oe3 oe3Var) {
        boolean z;
        yi6 yi6Var;
        HashMap hashMap = new HashMap();
        oe3 oe3Var2 = this.g;
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
            pe3 pe3Var = (pe3) this.c.get(Character.valueOf(c));
            if (oe3Var2.d && pe3Var != null) {
                char e = pe3Var.e();
                oe3 oe3Var4 = oe3Var2;
                int i2 = 0;
                boolean z2 = false;
                while (true) {
                    oe3Var4 = oe3Var4.e;
                    if (oe3Var4 == null || oe3Var4 == oe3Var || oe3Var4 == hashMap.get(Character.valueOf(c))) {
                        break;
                    } else if (oe3Var4.c && oe3Var4.b == e) {
                        i2 = pe3Var.d(oe3Var4, oe3Var2);
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
                        hashMap.put(Character.valueOf(c), oe3Var2.e);
                        if (!oe3Var2.c) {
                            i(oe3Var2);
                        }
                    }
                    oe3Var2 = oe3Var2.f;
                } else {
                    qkb qkbVar2 = oe3Var4.a;
                    oe3Var4.g -= i2;
                    oe3Var2.g -= i2;
                    qkbVar2.g = bs2.n(i2, 0, qkbVar2.g);
                    qkbVar.g = bs2.n(i2, 0, qkbVar.g);
                    oe3 oe3Var5 = oe3Var2.e;
                    while (oe3Var5 != null && oe3Var5 != oe3Var4) {
                        oe3 oe3Var6 = oe3Var5.e;
                        i(oe3Var5);
                        oe3Var5 = oe3Var6;
                    }
                    if (qkbVar2 != qkbVar && (yi6Var = (yi6) qkbVar2.f) != qkbVar) {
                        f(yi6Var, (yi6) qkbVar.e);
                    }
                    pe3Var.a(qkbVar2, qkbVar, i2);
                    if (oe3Var4.g == 0) {
                        oe3Var4.a.g();
                        i(oe3Var4);
                    }
                    if (oe3Var2.g == 0) {
                        oe3 oe3Var7 = oe3Var2.f;
                        qkbVar.g();
                        i(oe3Var2);
                        oe3Var2 = oe3Var7;
                    }
                }
            } else {
                oe3Var2 = oe3Var2.f;
            }
        }
        while (true) {
            oe3 oe3Var8 = this.g;
            if (oe3Var8 != null && oe3Var8 != oe3Var) {
                i(oe3Var8);
            } else {
                return;
            }
        }
    }

    public final void i(oe3 oe3Var) {
        oe3 oe3Var2 = oe3Var.e;
        if (oe3Var2 != null) {
            oe3Var2.f = oe3Var.f;
        }
        oe3 oe3Var3 = oe3Var.f;
        if (oe3Var3 == null) {
            this.g = oe3Var2;
        } else {
            oe3Var3.e = oe3Var2;
        }
    }
}
