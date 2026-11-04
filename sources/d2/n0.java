package d2;

import android.net.Uri;
import android.os.Bundle;
import b8.zb;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
public final class n0 {
    public static final n0 f8234g;
    public static final String h;
    public static final String f8235i;
    public static final String f8236j;
    public static final String f8237k;
    public static final String f8238l;
    public static final String f8239m;
    public final String f8240a;
    public final i0 f8241b;
    public final h0 f8242c;
    public final q0 d;
    public final d0 f8243e;
    public final j0 f8244f;

    static {
        b0 b0Var = new b0();
        g9.g0 g0Var = g9.i0.f12083b;
        g9.s1 s1Var = g9.s1.f12146e;
        List list = Collections.EMPTY_LIST;
        g9.s1 s1Var2 = g9.s1.f12146e;
        g0 g0Var2 = new g0();
        f8234g = new n0("", new c0(b0Var), null, new h0(g0Var2), q0.L, j0.d);
        h = Integer.toString(0, 36);
        f8235i = Integer.toString(1, 36);
        f8236j = Integer.toString(2, 36);
        f8237k = Integer.toString(3, 36);
        f8238l = Integer.toString(4, 36);
        f8239m = Integer.toString(5, 36);
    }

    public n0(String str, d0 d0Var, i0 i0Var, h0 h0Var, q0 q0Var, j0 j0Var) {
        this.f8240a = str;
        this.f8241b = i0Var;
        this.f8242c = h0Var;
        this.d = q0Var;
        this.f8243e = d0Var;
        this.f8244f = j0Var;
    }

    public static n0 a(int i3, Bundle bundle) {
        h0 h0Var;
        q0 b10;
        boolean z10;
        boolean z11;
        boolean z12;
        d0 d0Var;
        j0 j0Var;
        Map b11;
        byte[] bArr;
        f0 f0Var;
        a0 a0Var;
        g9.s1 f10;
        g9.s1 b12;
        i0 i0Var;
        String string = bundle.getString(h, "");
        string.getClass();
        Bundle bundle2 = bundle.getBundle(f8235i);
        if (bundle2 == null) {
            h0Var = h0.f8116f;
        } else {
            g0 g0Var = new g0();
            String str = h0.f8117g;
            h0 h0Var2 = h0.f8116f;
            g0Var.f8108a = bundle2.getLong(str, h0Var2.f8121a);
            g0Var.f8109b = bundle2.getLong(h0.h, h0Var2.f8122b);
            g0Var.f8110c = bundle2.getLong(h0.f8118i, h0Var2.f8123c);
            g0Var.d = bundle2.getFloat(h0.f8119j, h0Var2.d);
            g0Var.f8111e = bundle2.getFloat(h0.f8120k, h0Var2.f8124e);
            h0Var = new h0(g0Var);
        }
        h0 h0Var3 = h0Var;
        Bundle bundle3 = bundle.getBundle(f8236j);
        if (bundle3 == null) {
            b10 = q0.L;
        } else {
            b10 = q0.b(i3, bundle3);
        }
        q0 q0Var = b10;
        Bundle bundle4 = bundle.getBundle(f8237k);
        if (bundle4 == null) {
            d0Var = d0.f8058r;
        } else {
            b0 b0Var = new b0();
            String str2 = c0.f8044j;
            c0 c0Var = c0.f8043i;
            long j10 = c0Var.f8052a;
            long j11 = c0Var.d;
            long j12 = c0Var.f8053b;
            long S = g2.n0.S(bundle4.getLong(str2, j10));
            boolean z13 = true;
            if (S >= 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            zb.f(z10);
            b0Var.f8033a = S;
            long S2 = g2.n0.S(bundle4.getLong(c0.f8045k, c0Var.f8054c));
            if (S2 != Long.MIN_VALUE && S2 < 0) {
                z11 = false;
            } else {
                z11 = true;
            }
            zb.f(z11);
            b0Var.f8034b = S2;
            b0Var.f8035c = bundle4.getBoolean(c0.f8046l, c0Var.f8055e);
            b0Var.d = bundle4.getBoolean(c0.f8047m, c0Var.f8056f);
            b0Var.f8036e = bundle4.getBoolean(c0.f8048n, c0Var.f8057g);
            b0Var.f8037f = bundle4.getBoolean(c0.f8051q, c0Var.h);
            long j13 = bundle4.getLong(c0.f8049o, j12);
            if (j13 != j12) {
                if (j13 >= 0) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                zb.f(z12);
                b0Var.f8033a = j13;
            }
            long j14 = bundle4.getLong(c0.f8050p, j11);
            if (j14 != j11) {
                if (j14 != Long.MIN_VALUE && j14 < 0) {
                    z13 = false;
                }
                zb.f(z13);
                b0Var.f8034b = j14;
            }
            d0Var = new c0(b0Var);
        }
        d0 d0Var2 = d0Var;
        Bundle bundle5 = bundle.getBundle(f8238l);
        if (bundle5 == null) {
            j0Var = j0.d;
        } else {
            android.support.v4.media.session.a0 a0Var2 = new android.support.v4.media.session.a0(13, false);
            a0Var2.f1186b = (Uri) bundle5.getParcelable(j0.f8149e);
            a0Var2.f1187c = bundle5.getString(j0.f8150f);
            a0Var2.d = g2.n0.o(bundle5.getBundle(j0.f8151g));
            j0Var = new j0(a0Var2);
        }
        j0 j0Var2 = j0Var;
        Bundle bundle6 = bundle.getBundle(f8239m);
        if (bundle6 == null) {
            i0Var = null;
        } else {
            Bundle bundle7 = bundle6.getBundle(i0.f8133k);
            if (bundle7 == null) {
                f0Var = null;
            } else {
                String string2 = bundle7.getString(f0.f8093i);
                string2.getClass();
                UUID fromString = UUID.fromString(string2);
                Uri uri = (Uri) bundle7.getParcelable(f0.f8094j);
                String str3 = f0.f8095k;
                Bundle bundle8 = Bundle.EMPTY;
                Bundle bundle9 = bundle7.getBundle(str3);
                if (bundle9 == null) {
                    bundle9 = bundle8;
                }
                if (bundle9 == bundle8) {
                    b11 = g9.x1.h;
                } else {
                    HashMap hashMap = new HashMap();
                    if (bundle9 != bundle8) {
                        for (String str4 : bundle9.keySet()) {
                            String string3 = bundle9.getString(str4);
                            if (string3 != null) {
                                hashMap.put(str4, string3);
                            }
                        }
                    }
                    b11 = g9.l0.b(hashMap);
                }
                boolean z14 = bundle7.getBoolean(f0.f8096l, false);
                boolean z15 = bundle7.getBoolean(f0.f8097m, false);
                boolean z16 = bundle7.getBoolean(f0.f8098n, false);
                String str5 = f0.f8099o;
                ArrayList<Integer> arrayList = new ArrayList<>();
                ArrayList<Integer> integerArrayList = bundle7.getIntegerArrayList(str5);
                if (integerArrayList != null) {
                    arrayList = integerArrayList;
                }
                g9.i0 q10 = g9.i0.q(arrayList);
                byte[] byteArray = bundle7.getByteArray(f0.f8100p);
                e0 e0Var = new e0();
                e0Var.f8073a = fromString;
                e0Var.f8074b = uri;
                e0Var.f8075c = g9.l0.b(b11);
                e0Var.d = z14;
                e0Var.f8077f = z16;
                e0Var.f8076e = z15;
                e0Var.f8078g = g9.i0.q(q10);
                if (byteArray != null) {
                    bArr = Arrays.copyOf(byteArray, byteArray.length);
                } else {
                    bArr = null;
                }
                e0Var.h = bArr;
                f0Var = new f0(e0Var);
            }
            Bundle bundle10 = bundle6.getBundle(i0.f8134l);
            if (bundle10 == null) {
                a0Var = null;
            } else {
                Uri uri2 = (Uri) bundle10.getParcelable(a0.f8022b);
                uri2.getClass();
                ?? obj = new Object();
                obj.f8525a = uri2;
                a0Var = new a0(obj);
            }
            ArrayList parcelableArrayList = bundle6.getParcelableArrayList(i0.f8135m);
            if (parcelableArrayList == null) {
                g9.g0 g0Var2 = g9.i0.f12083b;
                f10 = g9.s1.f12146e;
            } else {
                g9.f0 p10 = g9.i0.p();
                int i10 = 0;
                while (i10 < parcelableArrayList.size()) {
                    Bundle bundle11 = (Bundle) parcelableArrayList.get(i10);
                    bundle11.getClass();
                    p10.c(new h1(bundle11.getInt(h1.d, 0), bundle11.getInt(h1.f8125e, 0), bundle11.getInt(h1.f8126f, 0)));
                    i10++;
                    parcelableArrayList = parcelableArrayList;
                }
                f10 = p10.f();
            }
            g9.s1 s1Var = f10;
            ArrayList parcelableArrayList2 = bundle6.getParcelableArrayList(i0.f8137o);
            if (parcelableArrayList2 == null) {
                g9.g0 g0Var3 = g9.i0.f12083b;
                b12 = g9.s1.f12146e;
            } else {
                b12 = g2.f.b(new a3.j(27), parcelableArrayList2);
            }
            g9.s1 s1Var2 = b12;
            long j15 = bundle6.getLong(i0.f8138p, -9223372036854775807L);
            Uri uri3 = (Uri) bundle6.getParcelable(i0.f8131i);
            uri3.getClass();
            i0Var = new i0(uri3, bundle6.getString(i0.f8132j), f0Var, a0Var, s1Var, bundle6.getString(i0.f8136n), s1Var2, j15);
        }
        return new n0(string, d0Var2, i0Var, h0Var3, q0Var, j0Var2);
    }

    public static n0 b(Uri uri) {
        boolean z10;
        i0 i0Var;
        b0 b0Var = new b0();
        e0 e0Var = new e0();
        List list = Collections.EMPTY_LIST;
        g9.s1 s1Var = g9.s1.f12146e;
        g0 g0Var = new g0();
        j0 j0Var = j0.d;
        if (e0Var.f8074b != null && e0Var.f8073a == null) {
            z10 = false;
        } else {
            z10 = true;
        }
        zb.p(z10);
        f0 f0Var = null;
        if (uri != null) {
            if (e0Var.f8073a != null) {
                f0Var = new f0(e0Var);
            }
            i0Var = new i0(uri, null, f0Var, null, list, null, s1Var, -9223372036854775807L);
        } else {
            i0Var = null;
        }
        return new n0("", new c0(b0Var), i0Var, new h0(g0Var), q0.L, j0Var);
    }

    public final Bundle c(int i3, boolean z10) {
        i0 i0Var;
        Bundle bundle = new Bundle();
        String str = this.f8240a;
        if (!str.equals("")) {
            bundle.putString(h, str);
        }
        h0 h0Var = h0.f8116f;
        h0 h0Var2 = this.f8242c;
        if (!h0Var2.equals(h0Var)) {
            bundle.putBundle(f8235i, h0Var2.b());
        }
        q0 q0Var = q0.L;
        q0 q0Var2 = this.d;
        if (!q0Var2.equals(q0Var)) {
            bundle.putBundle(f8236j, q0Var2.c(i3));
        }
        c0 c0Var = c0.f8043i;
        d0 d0Var = this.f8243e;
        if (!d0Var.equals(c0Var)) {
            Bundle bundle2 = new Bundle();
            long j10 = d0Var.f8052a;
            if (j10 != c0Var.f8052a) {
                bundle2.putLong(c0.f8044j, j10);
            }
            long j11 = d0Var.f8054c;
            if (j11 != c0Var.f8054c) {
                bundle2.putLong(c0.f8045k, j11);
            }
            long j12 = d0Var.f8053b;
            if (j12 != c0Var.f8053b) {
                bundle2.putLong(c0.f8049o, j12);
            }
            long j13 = d0Var.d;
            if (j13 != c0Var.d) {
                bundle2.putLong(c0.f8050p, j13);
            }
            boolean z11 = d0Var.f8055e;
            if (z11 != c0Var.f8055e) {
                bundle2.putBoolean(c0.f8046l, z11);
            }
            boolean z12 = d0Var.f8056f;
            if (z12 != c0Var.f8056f) {
                bundle2.putBoolean(c0.f8047m, z12);
            }
            boolean z13 = d0Var.f8057g;
            if (z13 != c0Var.f8057g) {
                bundle2.putBoolean(c0.f8048n, z13);
            }
            boolean z14 = d0Var.h;
            if (z14 != c0Var.h) {
                bundle2.putBoolean(c0.f8051q, z14);
            }
            bundle.putBundle(f8237k, bundle2);
        }
        j0 j0Var = j0.d;
        j0 j0Var2 = this.f8244f;
        if (!j0Var2.equals(j0Var)) {
            Bundle bundle3 = new Bundle();
            Uri uri = j0Var2.f8152a;
            if (uri != null) {
                bundle3.putParcelable(j0.f8149e, uri);
            }
            String str2 = j0Var2.f8153b;
            if (str2 != null) {
                bundle3.putString(j0.f8150f, str2);
            }
            Bundle bundle4 = j0Var2.f8154c;
            if (bundle4 != null) {
                bundle3.putBundle(j0.f8151g, bundle4);
            }
            bundle.putBundle(f8238l, bundle3);
        }
        if (z10 && (i0Var = this.f8241b) != null) {
            g9.i0 i0Var2 = i0Var.f8144g;
            List list = i0Var.f8142e;
            Bundle bundle5 = new Bundle();
            bundle5.putParcelable(i0.f8131i, i0Var.f8139a);
            String str3 = i0Var.f8140b;
            if (str3 != null) {
                bundle5.putString(i0.f8132j, str3);
            }
            f0 f0Var = i0Var.f8141c;
            if (f0Var != null) {
                String str4 = i0.f8133k;
                g9.i0 i0Var3 = f0Var.f8106g;
                g9.l0 l0Var = f0Var.f8103c;
                Bundle bundle6 = new Bundle();
                bundle6.putString(f0.f8093i, f0Var.f8101a.toString());
                Uri uri2 = f0Var.f8102b;
                if (uri2 != null) {
                    bundle6.putParcelable(f0.f8094j, uri2);
                }
                if (!l0Var.isEmpty()) {
                    String str5 = f0.f8095k;
                    Bundle bundle7 = new Bundle();
                    for (Map.Entry entry : l0Var.entrySet()) {
                        bundle7.putString((String) entry.getKey(), (String) entry.getValue());
                    }
                    bundle6.putBundle(str5, bundle7);
                }
                boolean z15 = f0Var.d;
                if (z15) {
                    bundle6.putBoolean(f0.f8096l, z15);
                }
                boolean z16 = f0Var.f8104e;
                if (z16) {
                    bundle6.putBoolean(f0.f8097m, z16);
                }
                boolean z17 = f0Var.f8105f;
                if (z17) {
                    bundle6.putBoolean(f0.f8098n, z17);
                }
                if (!i0Var3.isEmpty()) {
                    bundle6.putIntegerArrayList(f0.f8099o, new ArrayList<>(i0Var3));
                }
                byte[] bArr = f0Var.h;
                if (bArr != null) {
                    bundle6.putByteArray(f0.f8100p, bArr);
                }
                bundle5.putBundle(str4, bundle6);
            }
            a0 a0Var = i0Var.d;
            if (a0Var != null) {
                String str6 = i0.f8134l;
                Bundle bundle8 = new Bundle();
                bundle8.putParcelable(a0.f8022b, a0Var.f8023a);
                bundle5.putBundle(str6, bundle8);
            }
            if (!list.isEmpty()) {
                bundle5.putParcelableArrayList(i0.f8135m, g2.f.h(list, new a3.j(25)));
            }
            String str7 = i0Var.f8143f;
            if (str7 != null) {
                bundle5.putString(i0.f8136n, str7);
            }
            if (!i0Var2.isEmpty()) {
                bundle5.putParcelableArrayList(i0.f8137o, g2.f.h(i0Var2, new a3.j(26)));
            }
            long j14 = i0Var.h;
            if (j14 != -9223372036854775807L) {
                bundle5.putLong(i0.f8138p, j14);
            }
            bundle.putBundle(f8239m, bundle5);
        }
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof n0) {
                n0 n0Var = (n0) obj;
                if (Objects.equals(this.f8240a, n0Var.f8240a) && this.f8243e.equals(n0Var.f8243e) && Objects.equals(this.f8241b, n0Var.f8241b) && Objects.equals(this.f8242c, n0Var.f8242c) && Objects.equals(this.d, n0Var.d) && Objects.equals(this.f8244f, n0Var.f8244f)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i3;
        int hashCode = this.f8240a.hashCode() * 31;
        i0 i0Var = this.f8241b;
        if (i0Var != null) {
            i3 = i0Var.hashCode();
        } else {
            i3 = 0;
        }
        int hashCode2 = this.f8242c.hashCode();
        int hashCode3 = this.f8243e.hashCode();
        int hashCode4 = this.d.hashCode();
        return this.f8244f.hashCode() + ((hashCode4 + ((hashCode3 + ((hashCode2 + ((hashCode + i3) * 31)) * 31)) * 31)) * 31);
    }
}
