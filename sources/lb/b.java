package lb;

import j$.util.Objects;
import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Writer;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.regex.Pattern;
public class b implements Closeable, Flushable {
    public static final Pattern f15348w = Pattern.compile("-?(?:0|[1-9][0-9]*)(?:\\.[0-9]+)?(?:[eE][-+]?[0-9]+)?");
    public static final String[] f15349x = new String[128];
    public static final String[] f15350y;
    public final Writer f15351a;
    public int[] f15352b;
    public int f15353c;
    public db.c d;
    public String f15354e;
    public String f15355f;
    public boolean h;
    public int f15356n;
    public boolean f15357r;
    public String f15358s;
    public boolean v;

    static {
        for (int i10 = 0; i10 <= 31; i10++) {
            f15349x[i10] = String.format("\\u%04x", Integer.valueOf(i10));
        }
        String[] strArr = f15349x;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        String[] strArr2 = (String[]) strArr.clone();
        f15350y = strArr2;
        strArr2[60] = "\\u003c";
        strArr2[62] = "\\u003e";
        strArr2[38] = "\\u0026";
        strArr2[61] = "\\u003d";
        strArr2[39] = "\\u0027";
    }

    public b(Writer writer) {
        int[] iArr = new int[32];
        this.f15352b = iArr;
        this.f15353c = 0;
        if (iArr.length == 0) {
            this.f15352b = Arrays.copyOf(iArr, 0);
        }
        int[] iArr2 = this.f15352b;
        int i10 = this.f15353c;
        this.f15353c = i10 + 1;
        iArr2[i10] = 6;
        this.f15356n = 2;
        this.v = true;
        Objects.requireNonNull(writer, "out == null");
        this.f15351a = writer;
        k(db.c.d);
    }

    public final void a() {
        int j3 = j();
        if (j3 != 1) {
            Writer writer = this.f15351a;
            if (j3 != 2) {
                if (j3 != 4) {
                    if (j3 != 6) {
                        if (j3 == 7) {
                            if (this.f15356n != 1) {
                                throw new IllegalStateException("JSON must have only one top-level value.");
                            }
                        } else {
                            throw new IllegalStateException("Nesting problem.");
                        }
                    }
                    this.f15352b[this.f15353c - 1] = 7;
                    return;
                }
                writer.append((CharSequence) this.f15354e);
                this.f15352b[this.f15353c - 1] = 5;
                return;
            }
            writer.append((CharSequence) this.f15355f);
            h();
            return;
        }
        this.f15352b[this.f15353c - 1] = 2;
        h();
    }

    public void b() {
        t();
        a();
        int i10 = this.f15353c;
        int[] iArr = this.f15352b;
        if (i10 == iArr.length) {
            this.f15352b = Arrays.copyOf(iArr, i10 * 2);
        }
        int[] iArr2 = this.f15352b;
        int i11 = this.f15353c;
        this.f15353c = i11 + 1;
        iArr2[i11] = 1;
        this.f15351a.write(91);
    }

    public void c() {
        t();
        a();
        int i10 = this.f15353c;
        int[] iArr = this.f15352b;
        if (i10 == iArr.length) {
            this.f15352b = Arrays.copyOf(iArr, i10 * 2);
        }
        int[] iArr2 = this.f15352b;
        int i11 = this.f15353c;
        this.f15353c = i11 + 1;
        iArr2[i11] = 3;
        this.f15351a.write(123);
    }

    @Override
    public void close() {
        this.f15351a.close();
        int i10 = this.f15353c;
        if (i10 <= 1 && (i10 != 1 || this.f15352b[i10 - 1] == 7)) {
            this.f15353c = 0;
            return;
        }
        throw new IOException("Incomplete document");
    }

    public final void d(char c10, int i10, int i11) {
        int j3 = j();
        if (j3 != i11 && j3 != i10) {
            throw new IllegalStateException("Nesting problem.");
        }
        if (this.f15358s == null) {
            this.f15353c--;
            if (j3 == i11) {
                h();
            }
            this.f15351a.write(c10);
            return;
        }
        throw new IllegalStateException("Dangling name: " + this.f15358s);
    }

    public void e() {
        d(']', 1, 2);
    }

    public void f() {
        d('}', 3, 5);
    }

    public void flush() {
        if (this.f15353c != 0) {
            this.f15351a.flush();
            return;
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    public void g(String str) {
        Objects.requireNonNull(str, "name == null");
        if (this.f15358s == null) {
            int j3 = j();
            if (j3 != 3 && j3 != 5) {
                throw new IllegalStateException("Please begin an object before writing a name.");
            }
            this.f15358s = str;
            return;
        }
        throw new IllegalStateException("Already wrote a name, expecting a value.");
    }

    public final void h() {
        if (!this.h) {
            String str = this.d.f6666a;
            Writer writer = this.f15351a;
            writer.write(str);
            int i10 = this.f15353c;
            for (int i11 = 1; i11 < i10; i11++) {
                writer.write(this.d.f6667b);
            }
        }
    }

    public b i() {
        if (this.f15358s != null) {
            if (this.v) {
                t();
            } else {
                this.f15358s = null;
                return this;
            }
        }
        a();
        this.f15351a.write("null");
        return this;
    }

    public final int j() {
        int i10 = this.f15353c;
        if (i10 != 0) {
            return this.f15352b[i10 - 1];
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    public final void k(db.c cVar) {
        boolean z10;
        Objects.requireNonNull(cVar);
        this.d = cVar;
        this.f15355f = ",";
        if (cVar.f6668c) {
            this.f15354e = ": ";
            if (cVar.f6666a.isEmpty()) {
                this.f15355f = ", ";
            }
        } else {
            this.f15354e = ":";
        }
        if (this.d.f6666a.isEmpty() && this.d.f6667b.isEmpty()) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.h = z10;
    }

    public final void l(int i10) {
        if (i10 != 0) {
            this.f15356n = i10;
            return;
        }
        throw null;
    }

    public final void m(java.lang.String r9) {
        throw new UnsupportedOperationException("Method not decompiled: lb.b.m(java.lang.String):void");
    }

    public void n(double d) {
        t();
        if (this.f15356n != 1 && (Double.isNaN(d) || Double.isInfinite(d))) {
            throw new IllegalArgumentException("Numeric values must be finite, but was " + d);
        }
        a();
        this.f15351a.append((CharSequence) Double.toString(d));
    }

    public void o(long j3) {
        t();
        a();
        this.f15351a.write(Long.toString(j3));
    }

    public void p(Boolean bool) {
        String str;
        if (bool == null) {
            i();
            return;
        }
        t();
        a();
        if (bool.booleanValue()) {
            str = "true";
        } else {
            str = "false";
        }
        this.f15351a.write(str);
    }

    public void q(Number number) {
        if (number == null) {
            i();
            return;
        }
        t();
        String obj = number.toString();
        if (!obj.equals("-Infinity") && !obj.equals("Infinity") && !obj.equals("NaN")) {
            Class<?> cls = number.getClass();
            if (cls != Integer.class && cls != Long.class && cls != Double.class && cls != Float.class && cls != Byte.class && cls != Short.class && cls != BigDecimal.class && cls != BigInteger.class && cls != AtomicInteger.class && cls != AtomicLong.class && !f15348w.matcher(obj).matches()) {
                throw new IllegalArgumentException("String created by " + cls + " is not a valid JSON number: " + obj);
            }
        } else if (this.f15356n != 1) {
            throw new IllegalArgumentException("Numeric values must be finite, but was ".concat(obj));
        }
        a();
        this.f15351a.append((CharSequence) obj);
    }

    public void r(String str) {
        if (str == null) {
            i();
            return;
        }
        t();
        a();
        m(str);
    }

    public void s(boolean z10) {
        String str;
        t();
        a();
        if (z10) {
            str = "true";
        } else {
            str = "false";
        }
        this.f15351a.write(str);
    }

    public final void t() {
        if (this.f15358s != null) {
            int j3 = j();
            if (j3 == 5) {
                this.f15351a.write(this.f15355f);
            } else if (j3 != 3) {
                throw new IllegalStateException("Nesting problem.");
            }
            h();
            this.f15352b[this.f15353c - 1] = 4;
            m(this.f15358s);
            this.f15358s = null;
        }
    }
}
