package defpackage;

import android.text.TextUtils;
import java.math.RoundingMode;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public final class dxc implements s84 {
    public static final Pattern i = Pattern.compile("LOCAL:([^,]+)");
    public static final Pattern j = Pattern.compile("MPEGTS:(-?\\d+)");
    public final String a;
    public final vqb b;
    public final fgf d;
    public final boolean e;
    public u84 f;
    public int h;
    public final yw7 c = new yw7();
    public byte[] g = new byte[1024];

    public dxc(String str, vqb vqbVar, fgf fgfVar, boolean z) {
        this.a = str;
        this.b = vqbVar;
        this.d = fgfVar;
        this.e = z;
    }

    @Override
    public final int b(t84 t84Var, u21 u21Var) {
        String n;
        int length;
        this.f.getClass();
        int i2 = (int) ((vb3) t84Var).c;
        int i3 = this.h;
        byte[] bArr = this.g;
        if (i3 == bArr.length) {
            if (i2 != -1) {
                length = i2;
            } else {
                length = bArr.length;
            }
            bArr = Arrays.copyOf(bArr, (length * 3) / 2);
            this.g = bArr;
        }
        int i4 = this.h;
        int read = ((vb3) t84Var).read(bArr, i4, bArr.length - i4);
        if (read != -1) {
            int i5 = this.h + read;
            this.h = i5;
            if (i2 == -1 || i5 != i2) {
                return 0;
            }
        }
        yw7 yw7Var = new yw7(this.g);
        exc.d(yw7Var);
        String n2 = yw7Var.n(StandardCharsets.UTF_8);
        long j2 = 0;
        long j3 = 0;
        while (true) {
            Matcher matcher = null;
            if (!TextUtils.isEmpty(n2)) {
                if (n2.startsWith("X-TIMESTAMP-MAP")) {
                    Matcher matcher2 = i.matcher(n2);
                    if (matcher2.find()) {
                        Matcher matcher3 = j.matcher(n2);
                        if (matcher3.find()) {
                            String group = matcher2.group(1);
                            group.getClass();
                            j3 = exc.c(group);
                            String group2 = matcher3.group(1);
                            group2.getClass();
                            long parseLong = Long.parseLong(group2);
                            String str = hac.a;
                            j2 = hac.b0(parseLong, 1000000L, 90000L, RoundingMode.DOWN);
                        } else {
                            throw bx7.a("X-TIMESTAMP-MAP doesn't contain media timestamp: ".concat(n2), null);
                        }
                    } else {
                        throw bx7.a("X-TIMESTAMP-MAP doesn't contain local timestamp: ".concat(n2), null);
                    }
                }
                n2 = yw7Var.n(StandardCharsets.UTF_8);
            } else {
                while (true) {
                    String n3 = yw7Var.n(StandardCharsets.UTF_8);
                    if (n3 == null) {
                        break;
                    } else if (exc.a.matcher(n3).matches()) {
                        do {
                            n = yw7Var.n(StandardCharsets.UTF_8);
                            if (n != null) {
                            }
                        } while (!n.isEmpty());
                    } else {
                        Matcher matcher4 = cxc.a.matcher(n3);
                        if (matcher4.matches()) {
                            matcher = matcher4;
                            break;
                        }
                    }
                }
                if (matcher == null) {
                    g(0L);
                    return -1;
                }
                String group3 = matcher.group(1);
                group3.getClass();
                long c = exc.c(group3);
                String str2 = hac.a;
                long b = this.b.b(hac.b0((j2 + c) - j3, 90000L, 1000000L, RoundingMode.DOWN) % 8589934592L);
                yzb g = g(b - c);
                byte[] bArr2 = this.g;
                int i6 = this.h;
                yw7 yw7Var2 = this.c;
                yw7Var2.L(i6, bArr2);
                g.e(this.h, yw7Var2);
                g.a(b, 1, this.h, 0, null);
                return -1;
            }
        }
    }

    @Override
    public final boolean c(t84 t84Var) {
        vb3 vb3Var = (vb3) t84Var;
        vb3Var.d(this.g, 0, 6, false);
        byte[] bArr = this.g;
        yw7 yw7Var = this.c;
        yw7Var.L(6, bArr);
        if (exc.a(yw7Var)) {
            return true;
        }
        vb3Var.d(this.g, 6, 3, false);
        yw7Var.L(9, this.g);
        return exc.a(yw7Var);
    }

    @Override
    public final void d(long j2, long j3) {
        throw new IllegalStateException();
    }

    @Override
    public final List e() {
        ko5 ko5Var = mo5.b;
        return y79.e;
    }

    @Override
    public final void f(u84 u84Var) {
        if (this.e) {
            u84Var = new yh4(u84Var, this.d);
        }
        this.f = u84Var;
        u84Var.f0(new od0(-9223372036854775807L));
    }

    public final yzb g(long j2) {
        yzb c0 = this.f.c0(0, 3);
        fo4 fo4Var = new fo4();
        fo4Var.s = wf7.n("text/vtt");
        fo4Var.d = this.a;
        fo4Var.x = j2;
        mlb.w(fo4Var, c0);
        this.f.B();
        return c0;
    }

    @Override
    public final s84 a() {
        return this;
    }

    @Override
    public final void release() {
    }
}
