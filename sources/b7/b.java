package b7;

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
import kh.a2;
import org.telegram.ui.yh;
public abstract class b {
    public static volatile a f1665b;
    public static final Object f1664a = new Object();
    public static final f1 f1666c = new f1("id");
    public static final f1 d = new f1("type");

    public static int a(int i10, int i11) {
        RoundingMode roundingMode = RoundingMode.CEILING;
        roundingMode.getClass();
        if (i11 != 0) {
            int i12 = i10 / i11;
            int i13 = i10 - (i11 * i12);
            if (i13 != 0) {
                int i14 = ((i10 ^ i11) >> 31) | 1;
                switch (r0.f1724a[roundingMode.ordinal()]) {
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

    public static int b(q qVar) {
        int i10;
        int i11 = 0;
        for (Object obj : qVar) {
            if (obj != null) {
                i10 = obj.hashCode();
            } else {
                i10 = 0;
            }
            i11 += i10;
        }
        return i11;
    }

    public static String c(w0 w0Var) {
        StringBuilder sb = new StringBuilder(w0Var.p());
        for (int i10 = 0; i10 < w0Var.p(); i10++) {
            byte i11 = w0Var.i(i10);
            if (i11 != 34) {
                if (i11 != 39) {
                    if (i11 != 92) {
                        switch (i11) {
                            case 7:
                                sb.append("\\a");
                                continue;
                            case 8:
                                sb.append("\\b");
                                continue;
                            case 9:
                                sb.append("\\t");
                                continue;
                            case 10:
                                sb.append("\\n");
                                continue;
                            case 11:
                                sb.append("\\v");
                                continue;
                            case 12:
                                sb.append("\\f");
                                continue;
                            case 13:
                                sb.append("\\r");
                                continue;
                            default:
                                if (i11 >= 32 && i11 <= 126) {
                                    sb.append((char) i11);
                                    continue;
                                } else {
                                    sb.append('\\');
                                    sb.append((char) (((i11 >>> 6) & 3) + 48));
                                    sb.append((char) (((i11 >>> 3) & 7) + 48));
                                    sb.append((char) ((i11 & 7) + 48));
                                    break;
                                }
                                break;
                        }
                    } else {
                        sb.append("\\\\");
                    }
                } else {
                    sb.append("\\'");
                }
            } else {
                sb.append("\\\"");
            }
        }
        return sb.toString();
    }

    public static String d(String str, Object... objArr) {
        int length;
        int length2;
        int indexOf;
        String l10;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            length = objArr.length;
            if (i11 >= length) {
                break;
            }
            Object obj = objArr[i11];
            if (obj == null) {
                l10 = "null";
            } else {
                try {
                    l10 = obj.toString();
                } catch (Exception e) {
                    String z4 = android.support.v4.media.a.z(obj.getClass().getName(), "@", Integer.toHexString(System.identityHashCode(obj)));
                    Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(z4), (Throwable) e);
                    l10 = yh.l("<", z4, " threw ", e.getClass().getName(), ">");
                }
            }
            objArr[i11] = l10;
            i11++;
        }
        StringBuilder sb = new StringBuilder(str.length() + (length * 16));
        int i12 = 0;
        while (true) {
            length2 = objArr.length;
            if (i10 >= length2 || (indexOf = str.indexOf("%s", i12)) == -1) {
                break;
            }
            sb.append((CharSequence) str, i12, indexOf);
            sb.append(objArr[i10]);
            i10++;
            i12 = indexOf + 2;
        }
        sb.append((CharSequence) str, i12, str.length());
        if (i10 < length2) {
            sb.append(" [");
            sb.append(objArr[i10]);
            for (int i13 = i10 + 1; i13 < objArr.length; i13++) {
                sb.append(", ");
                sb.append(objArr[i13]);
            }
            sb.append(']');
        }
        return sb.toString();
    }

    public static void e(int i10, int i11) {
        String d10;
        if (i10 >= 0 && i10 < i11) {
            return;
        }
        if (i10 >= 0) {
            if (i11 < 0) {
                throw new IllegalArgumentException(a2.j(i11, "negative size: "));
            }
            d10 = d("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i10), Integer.valueOf(i11));
        } else {
            d10 = d("%s (%s) must not be negative", "index", Integer.valueOf(i10));
        }
        throw new IndexOutOfBoundsException(d10);
    }

    public static void f(Object obj, Object obj2) {
        if (obj != null) {
            if (obj2 != null) {
                return;
            }
            throw new NullPointerException(android.support.v4.media.a.o("null value in entry: ", obj.toString(), "=null"));
        }
        throw new NullPointerException("null key in entry: null=".concat(String.valueOf(obj2)));
    }

    public static final void g(StringBuilder sb, Iterator it, h7.u uVar) {
        if (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            sb.append(h7.u.H2(entry.getKey()));
            sb.append(" : ");
            sb.append(h7.u.H2(entry.getValue()));
            while (it.hasNext()) {
                sb.append(",\n  ");
                Map.Entry entry2 = (Map.Entry) it.next();
                sb.append(h7.u.H2(entry2.getKey()));
                sb.append(" : ");
                sb.append(h7.u.H2(entry2.getValue()));
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
                obj = y.f1740b;
            }
        } else if (collection instanceof f0) {
            obj = ((v) ((f0) collection)).d;
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

    public static final h1 k(j1 j1Var) {
        long j10;
        try {
            i1 d10 = j1Var.d();
            if (d10 != null) {
                try {
                    try {
                        byte b10 = d10.f1685a;
                        byte b11 = d10.f1686b;
                        int i10 = 0;
                        if (b10 != Byte.MIN_VALUE) {
                            if (b10 != -96) {
                                if (b10 != -64) {
                                    if (b10 != -32) {
                                        if (b10 != 0 && b10 != 32) {
                                            if (b10 != 64) {
                                                if (b10 == 96) {
                                                    j1Var.h((byte) 96);
                                                    String str = new String(j1Var.j(), StandardCharsets.UTF_8);
                                                    l(b11, str.length());
                                                    return new f1(str);
                                                }
                                                throw new IOException("Unidentifiable major type: " + ((b10 >> 5) & 7));
                                            }
                                            j1Var.h((byte) 64);
                                            byte[] j11 = j1Var.j();
                                            int length = j11.length;
                                            l(b11, length);
                                            return new b1(w0.t(length, j11));
                                        }
                                        long b12 = j1Var.b();
                                        if (b12 > 0) {
                                            j10 = b12;
                                        } else {
                                            j10 = ~b12;
                                        }
                                        l(b11, j10);
                                        return new d1(b12);
                                    }
                                    return new a1(j1Var.e());
                                }
                                throw new IOException("Tags are currently unsupported");
                            }
                            long c3 = j1Var.c();
                            if (c3 <= 1000) {
                                l(b11, c3);
                                int i11 = (int) c3;
                                bf.b[] bVarArr = new bf.b[i11];
                                h1 h1Var = null;
                                int i12 = 0;
                                while (i12 < c3) {
                                    h1 k10 = k(j1Var);
                                    if (h1Var != null && k10.compareTo(h1Var) <= 0) {
                                        String obj = h1Var.toString();
                                        String obj2 = k10.toString();
                                        throw new IOException("Keys in CBOR Map not in strictly ascending natural order:\nPrevious key: " + obj + "\nCurrent key: " + obj2);
                                    }
                                    bVarArr[i12] = new bf.b(15, k10, k(j1Var));
                                    i12++;
                                    h1Var = k10;
                                }
                                TreeMap treeMap = new TreeMap();
                                while (i10 < i11) {
                                    bf.b bVar = bVarArr[i10];
                                    if (!treeMap.containsKey((h1) bVar.f1782b)) {
                                        treeMap.put((h1) bVar.f1782b, (h1) bVar.f1783c);
                                        i10++;
                                    } else {
                                        throw new IOException("Attempted to add duplicate key to canonical CBOR Map.");
                                    }
                                }
                                return new e1(u.b(treeMap));
                            }
                            throw new IOException("Parser being asked to read a large CBOR map");
                        }
                        long a2 = j1Var.a();
                        if (a2 <= 1000) {
                            l(b11, a2);
                            h1[] h1VarArr = new h1[(int) a2];
                            while (i10 < a2) {
                                h1VarArr[i10] = k(j1Var);
                                i10++;
                            }
                            return new z0(o.u(h1VarArr));
                        }
                        throw new IOException("Parser being asked to read a large CBOR array");
                    } catch (IOException | RuntimeException e) {
                        e = e;
                        throw new c1(e);
                    }
                } catch (RuntimeException e6) {
                    e = e6;
                    throw new c1(e);
                }
            }
            throw new IOException("Parser being asked to parse an empty input stream");
        } catch (IOException e10) {
            throw new c1(e10);
        }
    }

    public static final void l(byte b10, long j10) {
        switch (b10) {
            case 24:
                if (j10 >= 24) {
                    return;
                }
                throw new IOException(e2.c.i(j10, "Integer value ", " after add info could have been represented in 0 additional bytes, but used 1"));
            case 25:
                if (j10 < 256) {
                    throw new IOException(e2.c.i(j10, "Integer value ", " after add info could have been represented in 0-1 additional bytes, but used 2"));
                }
                return;
            case 26:
                if (j10 < 65536) {
                    throw new IOException(e2.c.i(j10, "Integer value ", " after add info could have been represented in 0-2 additional bytes, but used 4"));
                }
                return;
            case 27:
                if (j10 < 4294967296L) {
                    throw new IOException(e2.c.i(j10, "Integer value ", " after add info could have been represented in 0-4 additional bytes, but used 8"));
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
                n10 = d("end index (%s) must not be less than start index (%s)", Integer.valueOf(i11), Integer.valueOf(i10));
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
            return d("%s (%s) must not be negative", str, Integer.valueOf(i10));
        }
        if (i11 >= 0) {
            return d("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i10), Integer.valueOf(i11));
        }
        throw new IllegalArgumentException(a2.j(i11, "negative size: "));
    }
}
