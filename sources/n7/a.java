package n7;

import java.io.IOException;
import java.math.RoundingMode;
import java.nio.charset.StandardCharsets;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.telegram.ui.Cells.r6;
public abstract class a {
    public static volatile cc.k f13934b;
    public static final Object f13933a = new Object();
    public static final c1 f13935c = new c1("id");
    public static final c1 d = new c1("type");

    public static int a(int i10, int i11) {
        RoundingMode roundingMode = RoundingMode.CEILING;
        roundingMode.getClass();
        if (i11 != 0) {
            int i12 = i10 / i11;
            int i13 = i10 - (i11 * i12);
            if (i13 != 0) {
                int i14 = ((i10 ^ i11) >> 31) | 1;
                switch (o0.f13984a[roundingMode.ordinal()]) {
                    case 1:
                        throw new ArithmeticException("mode was UNNECESSARY, but rounding was necessary");
                    case 2:
                        return i12;
                    case 3:
                        if (i14 >= 0) {
                            return i12;
                        }
                        break;
                    case 4:
                        break;
                    case 5:
                        if (i14 <= 0) {
                            return i12;
                        }
                        break;
                    case 6:
                    case 7:
                    case 8:
                        int abs = Math.abs(i13);
                        int abs2 = abs - (Math.abs(i11) - abs);
                        if (abs2 == 0) {
                            RoundingMode roundingMode2 = RoundingMode.HALF_UP;
                            RoundingMode roundingMode3 = RoundingMode.HALF_EVEN;
                            return i12;
                        } else if (abs2 <= 0) {
                            return i12;
                        }
                        break;
                    default:
                        throw new AssertionError();
                }
                return i12 + i14;
            }
            return i12;
        }
        throw new ArithmeticException("/ by zero");
    }

    public static int b(p pVar) {
        int i10;
        int i11 = 0;
        for (Object obj : pVar) {
            if (obj != null) {
                i10 = obj.hashCode();
            } else {
                i10 = 0;
            }
            i11 += i10;
        }
        return i11;
    }

    public static String c(String str, Object... objArr) {
        int length;
        int length2;
        int indexOf;
        String j3;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            length = objArr.length;
            if (i11 >= length) {
                break;
            }
            Object obj = objArr[i11];
            if (obj == null) {
                j3 = "null";
            } else {
                try {
                    j3 = obj.toString();
                } catch (Exception e) {
                    String C = a4.a.C(obj.getClass().getName(), "@", Integer.toHexString(System.identityHashCode(obj)));
                    Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(C), (Throwable) e);
                    j3 = r6.j("<", C, " threw ", e.getClass().getName(), ">");
                }
            }
            objArr[i11] = j3;
            i11++;
        }
        StringBuilder sb2 = new StringBuilder(str.length() + (length * 16));
        int i12 = 0;
        while (true) {
            length2 = objArr.length;
            if (i10 >= length2 || (indexOf = str.indexOf("%s", i12)) == -1) {
                break;
            }
            sb2.append((CharSequence) str, i12, indexOf);
            sb2.append(objArr[i10]);
            i10++;
            i12 = indexOf + 2;
        }
        sb2.append((CharSequence) str, i12, str.length());
        if (i10 < length2) {
            sb2.append(" [");
            sb2.append(objArr[i10]);
            for (int i13 = i10 + 1; i13 < objArr.length; i13++) {
                sb2.append(", ");
                sb2.append(objArr[i13]);
            }
            sb2.append(']');
        }
        return sb2.toString();
    }

    public static String d(t0 t0Var) {
        StringBuilder sb2 = new StringBuilder(t0Var.p());
        for (int i10 = 0; i10 < t0Var.p(); i10++) {
            byte i11 = t0Var.i(i10);
            if (i11 != 34) {
                if (i11 != 39) {
                    if (i11 != 92) {
                        switch (i11) {
                            case 7:
                                sb2.append("\\a");
                                continue;
                            case 8:
                                sb2.append("\\b");
                                continue;
                            case 9:
                                sb2.append("\\t");
                                continue;
                            case 10:
                                sb2.append("\\n");
                                continue;
                            case 11:
                                sb2.append("\\v");
                                continue;
                            case 12:
                                sb2.append("\\f");
                                continue;
                            case 13:
                                sb2.append("\\r");
                                continue;
                            default:
                                if (i11 >= 32 && i11 <= 126) {
                                    sb2.append((char) i11);
                                    continue;
                                } else {
                                    sb2.append('\\');
                                    sb2.append((char) (((i11 >>> 6) & 3) + 48));
                                    sb2.append((char) (((i11 >>> 3) & 7) + 48));
                                    sb2.append((char) ((i11 & 7) + 48));
                                    break;
                                }
                                break;
                        }
                    } else {
                        sb2.append("\\\\");
                    }
                } else {
                    sb2.append("\\'");
                }
            } else {
                sb2.append("\\\"");
            }
        }
        return sb2.toString();
    }

    public static void e(int i10, int i11) {
        String c10;
        if (i10 >= 0 && i10 < i11) {
            return;
        }
        if (i10 >= 0) {
            if (i11 < 0) {
                throw new IllegalArgumentException(hc.b.j(i11, "negative size: "));
            }
            c10 = c("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i10), Integer.valueOf(i11));
        } else {
            c10 = c("%s (%s) must not be negative", "index", Integer.valueOf(i10));
        }
        throw new IndexOutOfBoundsException(c10);
    }

    public static void f(Object obj, Object obj2) {
        if (obj != null) {
            if (obj2 != null) {
                return;
            }
            throw new NullPointerException(a4.a.p("null value in entry: ", obj.toString(), "=null"));
        }
        throw new NullPointerException("null key in entry: null=".concat(String.valueOf(obj2)));
    }

    public static final void g(StringBuilder sb2, Iterator it, na.d dVar) {
        if (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            sb2.append(na.d.I3(entry.getKey()));
            sb2.append(" : ");
            sb2.append(na.d.I3(entry.getValue()));
            while (it.hasNext()) {
                sb2.append(",\n  ");
                Map.Entry entry2 = (Map.Entry) it.next();
                sb2.append(na.d.I3(entry2.getKey()));
                sb2.append(" : ");
                sb2.append(na.d.I3(entry2.getValue()));
            }
        }
    }

    public static boolean h(Object obj, Object obj2) {
        if (obj == obj2) {
            return true;
        }
        if (obj != null && obj.equals(obj2)) {
            return true;
        }
        return false;
    }

    public static boolean i(Comparator comparator, Collection collection) {
        Object obj;
        comparator.getClass();
        collection.getClass();
        if (collection instanceof SortedSet) {
            obj = ((SortedSet) collection).comparator();
            if (obj == null) {
                obj = w.f14004b;
            }
        } else if (collection instanceof d0) {
            obj = ((t) ((d0) collection)).d;
        } else {
            return false;
        }
        return comparator.equals(obj);
    }

    public static byte[] j(byte[]... bArr) {
        int i10 = 0;
        int i11 = 0;
        while (true) {
            if (i10 >= bArr.length) {
                break;
            }
            i11 += bArr[i10].length;
            i10++;
        }
        byte[] bArr2 = new byte[i11];
        int i12 = 0;
        for (byte[] bArr3 : bArr) {
            int length = bArr3.length;
            System.arraycopy(bArr3, 0, bArr2, i12, length);
            i12 += length;
        }
        return bArr2;
    }

    public static final e1 k(g1 g1Var) {
        long j3;
        try {
            f1 d10 = g1Var.d();
            if (d10 != null) {
                try {
                    try {
                        byte b10 = d10.f13948a;
                        byte b11 = d10.f13949b;
                        int i10 = 0;
                        if (b10 != Byte.MIN_VALUE) {
                            if (b10 != -96) {
                                if (b10 != -64) {
                                    if (b10 != -32) {
                                        if (b10 != 0 && b10 != 32) {
                                            if (b10 != 64) {
                                                if (b10 == 96) {
                                                    g1Var.h((byte) 96);
                                                    String str = new String(g1Var.j(), StandardCharsets.UTF_8);
                                                    l(b11, str.length());
                                                    return new c1(str);
                                                }
                                                throw new IOException("Unidentifiable major type: " + ((b10 >> 5) & 7));
                                            }
                                            g1Var.h((byte) 64);
                                            byte[] j10 = g1Var.j();
                                            int length = j10.length;
                                            l(b11, length);
                                            return new x0(t0.t(length, j10));
                                        }
                                        long b12 = g1Var.b();
                                        if (b12 > 0) {
                                            j3 = b12;
                                        } else {
                                            j3 = ~b12;
                                        }
                                        l(b11, j3);
                                        return new z0(b12);
                                    }
                                    return new w0(g1Var.e());
                                }
                                throw new IOException("Tags are currently unsupported");
                            }
                            long c10 = g1Var.c();
                            if (c10 <= 1000) {
                                l(b11, c10);
                                int i11 = (int) c10;
                                a1[] a1VarArr = new a1[i11];
                                e1 e1Var = null;
                                int i12 = 0;
                                while (i12 < c10) {
                                    e1 k10 = k(g1Var);
                                    if (e1Var != null && k10.compareTo(e1Var) <= 0) {
                                        String obj = e1Var.toString();
                                        String obj2 = k10.toString();
                                        throw new IOException("Keys in CBOR Map not in strictly ascending natural order:\nPrevious key: " + obj + "\nCurrent key: " + obj2);
                                    }
                                    a1VarArr[i12] = new a1(0, k10, k(g1Var));
                                    i12++;
                                    e1Var = k10;
                                }
                                TreeMap treeMap = new TreeMap();
                                while (i10 < i11) {
                                    a1 a1Var = a1VarArr[i10];
                                    if (!treeMap.containsKey((e1) a1Var.f13938b)) {
                                        treeMap.put((e1) a1Var.f13938b, (e1) a1Var.f13939c);
                                        i10++;
                                    } else {
                                        throw new IOException("Attempted to add duplicate key to canonical CBOR Map.");
                                    }
                                }
                                return new b1(s.b(treeMap));
                            }
                            throw new IOException("Parser being asked to read a large CBOR map");
                        }
                        long a2 = g1Var.a();
                        if (a2 <= 1000) {
                            l(b11, a2);
                            e1[] e1VarArr = new e1[(int) a2];
                            while (i10 < a2) {
                                e1VarArr[i10] = k(g1Var);
                                i10++;
                            }
                            return new v0(n.u(e1VarArr));
                        }
                        throw new IOException("Parser being asked to read a large CBOR array");
                    } catch (IOException | RuntimeException e) {
                        e = e;
                        throw new y0(e);
                    }
                } catch (RuntimeException e7) {
                    e = e7;
                    throw new y0(e);
                }
            }
            throw new IOException("Parser being asked to parse an empty input stream");
        } catch (IOException e10) {
            throw new y0(e10);
        }
    }

    public static final void l(byte b10, long j3) {
        switch (b10) {
            case 24:
                if (j3 >= 24) {
                    return;
                }
                throw new IOException(r6.h(j3, "Integer value ", " after add info could have been represented in 0 additional bytes, but used 1"));
            case 25:
                if (j3 < 256) {
                    throw new IOException(r6.h(j3, "Integer value ", " after add info could have been represented in 0-1 additional bytes, but used 2"));
                }
                return;
            case 26:
                if (j3 < 65536) {
                    throw new IOException(r6.h(j3, "Integer value ", " after add info could have been represented in 0-2 additional bytes, but used 4"));
                }
                return;
            case 27:
                if (j3 < 4294967296L) {
                    throw new IOException(r6.h(j3, "Integer value ", " after add info could have been represented in 0-4 additional bytes, but used 8"));
                }
                return;
            default:
                return;
        }
    }

    public static void m(int i10, int i11, int i12) {
        String n10;
        if (i10 >= 0 && i11 >= i10 && i11 <= i12) {
            return;
        }
        if (i10 >= 0 && i10 <= i12) {
            if (i11 >= 0 && i11 <= i12) {
                n10 = c("end index (%s) must not be less than start index (%s)", Integer.valueOf(i11), Integer.valueOf(i10));
            } else {
                n10 = n(i11, i12, "end index");
            }
        } else {
            n10 = n(i10, i12, "start index");
        }
        throw new IndexOutOfBoundsException(n10);
    }

    public static String n(int i10, int i11, String str) {
        if (i10 < 0) {
            return c("%s (%s) must not be negative", str, Integer.valueOf(i10));
        }
        if (i11 >= 0) {
            return c("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i10), Integer.valueOf(i11));
        }
        throw new IllegalArgumentException(hc.b.j(i11, "negative size: "));
    }
}
