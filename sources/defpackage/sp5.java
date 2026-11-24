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
public final class sp5 implements qp5 {
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
    public final wm4 d;
    public String e;
    public int f;
    public gf3 g;
    public zz0 h;

    public sp5(wm4 wm4Var) {
        HashMap hashMap = new HashMap();
        c(Arrays.asList(new my((byte) 0), new my((byte) 1)), hashMap);
        c((ArrayList) wm4Var.b, hashMap);
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
        this.d = wm4Var;
    }

    public static void b(char c, hf3 hf3Var, HashMap hashMap) {
        if (((hf3) hashMap.put(Character.valueOf(c), hf3Var)) == null) {
            return;
        }
        throw new IllegalArgumentException("Delimiter processor conflict with delimiter char '" + c + "'");
    }

    public static void c(List list, HashMap hashMap) {
        roa roaVar;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            hf3 hf3Var = (hf3) it.next();
            char e = hf3Var.e();
            char b = hf3Var.b();
            if (e == b) {
                hf3 hf3Var2 = (hf3) hashMap.get(Character.valueOf(e));
                if (hf3Var2 != null && hf3Var2.e() == hf3Var2.b()) {
                    if (hf3Var2 instanceof roa) {
                        roaVar = (roa) hf3Var2;
                    } else {
                        roa roaVar2 = new roa(e);
                        roaVar2.f(hf3Var2);
                        roaVar = roaVar2;
                    }
                    roaVar.f(hf3Var);
                    hashMap.put(Character.valueOf(e), roaVar);
                } else {
                    b(e, hf3Var, hashMap);
                }
            } else {
                b(e, hf3Var, hashMap);
                b(b, hf3Var, hashMap);
            }
        }
    }

    public static void e(vib vibVar, vib vibVar2, int i2) {
        if (vibVar != null && vibVar2 != null && vibVar != vibVar2) {
            StringBuilder sb = new StringBuilder(i2);
            sb.append(vibVar.g);
            ui6 ui6Var = (ui6) vibVar2.f;
            for (ui6 ui6Var2 = (ui6) vibVar.f; ui6Var2 != ui6Var; ui6Var2 = (ui6) ui6Var2.f) {
                sb.append(((vib) ui6Var2).g);
                ui6Var2.g();
            }
            vibVar.g = sb.toString();
        }
    }

    public static void f(ui6 ui6Var, ui6 ui6Var2) {
        vib vibVar = null;
        vib vibVar2 = null;
        int i2 = 0;
        while (ui6Var != null) {
            if (ui6Var instanceof vib) {
                vibVar2 = (vib) ui6Var;
                if (vibVar == null) {
                    vibVar = vibVar2;
                }
                i2 = vibVar2.g.length() + i2;
            } else {
                e(vibVar, vibVar2, i2);
                vibVar = null;
                vibVar2 = null;
                i2 = 0;
            }
            if (ui6Var == ui6Var2) {
                break;
            }
            ui6Var = (ui6) ui6Var.f;
        }
        e(vibVar, vibVar2, i2);
    }

    @Override
    public final void a(java.lang.String r26, defpackage.ui6 r27) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sp5.a(java.lang.String, ui6):void");
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

    public final void h(gf3 gf3Var) {
        boolean z;
        ui6 ui6Var;
        HashMap hashMap = new HashMap();
        gf3 gf3Var2 = this.g;
        while (gf3Var2 != null) {
            gf3 gf3Var3 = gf3Var2.e;
            if (gf3Var3 == gf3Var) {
                break;
            }
            gf3Var2 = gf3Var3;
        }
        while (gf3Var2 != null) {
            vib vibVar = gf3Var2.a;
            char c = gf3Var2.b;
            hf3 hf3Var = (hf3) this.c.get(Character.valueOf(c));
            if (gf3Var2.d && hf3Var != null) {
                char e = hf3Var.e();
                gf3 gf3Var4 = gf3Var2;
                int i2 = 0;
                boolean z2 = false;
                while (true) {
                    gf3Var4 = gf3Var4.e;
                    if (gf3Var4 == null || gf3Var4 == gf3Var || gf3Var4 == hashMap.get(Character.valueOf(c))) {
                        break;
                    } else if (gf3Var4.c && gf3Var4.b == e) {
                        i2 = hf3Var.d(gf3Var4, gf3Var2);
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
                        hashMap.put(Character.valueOf(c), gf3Var2.e);
                        if (!gf3Var2.c) {
                            i(gf3Var2);
                        }
                    }
                    gf3Var2 = gf3Var2.f;
                } else {
                    vib vibVar2 = gf3Var4.a;
                    gf3Var4.g -= i2;
                    gf3Var2.g -= i2;
                    vibVar2.g = ts2.m(i2, 0, vibVar2.g);
                    vibVar.g = ts2.m(i2, 0, vibVar.g);
                    gf3 gf3Var5 = gf3Var2.e;
                    while (gf3Var5 != null && gf3Var5 != gf3Var4) {
                        gf3 gf3Var6 = gf3Var5.e;
                        i(gf3Var5);
                        gf3Var5 = gf3Var6;
                    }
                    if (vibVar2 != vibVar && (ui6Var = (ui6) vibVar2.f) != vibVar) {
                        f(ui6Var, (ui6) vibVar.e);
                    }
                    hf3Var.a(vibVar2, vibVar, i2);
                    if (gf3Var4.g == 0) {
                        gf3Var4.a.g();
                        i(gf3Var4);
                    }
                    if (gf3Var2.g == 0) {
                        gf3 gf3Var7 = gf3Var2.f;
                        vibVar.g();
                        i(gf3Var2);
                        gf3Var2 = gf3Var7;
                    }
                }
            } else {
                gf3Var2 = gf3Var2.f;
            }
        }
        while (true) {
            gf3 gf3Var8 = this.g;
            if (gf3Var8 != null && gf3Var8 != gf3Var) {
                i(gf3Var8);
            } else {
                return;
            }
        }
    }

    public final void i(gf3 gf3Var) {
        gf3 gf3Var2 = gf3Var.e;
        if (gf3Var2 != null) {
            gf3Var2.f = gf3Var.f;
        }
        gf3 gf3Var3 = gf3Var.f;
        if (gf3Var3 == null) {
            this.g = gf3Var2;
        } else {
            gf3Var3.e = gf3Var2;
        }
    }
}
