package e2;

import a8.la;
import android.net.Uri;
import android.os.Bundle;
import h9.y1;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
public final class l0 {
    public static final l0 f10494g;
    public static final String h;
    public static final String f10495i;
    public static final String f10496j;
    public static final String f10497k;
    public static final String f10498l;
    public static final String f10499m;
    public final String f10500a;
    public final g0 f10501b;
    public final f0 f10502c;
    public final o0 d;
    public final b0 f10503e;
    public final h0 f10504f;

    static {
        z zVar = new z();
        h9.g0 g0Var = h9.i0.f14003b;
        h9.t1 t1Var = h9.t1.f14071e;
        List list = Collections.EMPTY_LIST;
        h9.t1 t1Var2 = h9.t1.f14071e;
        e0 e0Var = new e0();
        f10494g = new l0("", new a0(zVar), null, new f0(e0Var), o0.L, h0.d);
        h = Integer.toString(0, 36);
        f10495i = Integer.toString(1, 36);
        f10496j = Integer.toString(2, 36);
        f10497k = Integer.toString(3, 36);
        f10498l = Integer.toString(4, 36);
        f10499m = Integer.toString(5, 36);
    }

    public l0(String str, b0 b0Var, g0 g0Var, f0 f0Var, o0 o0Var, h0 h0Var) {
        this.f10500a = str;
        this.f10501b = g0Var;
        this.f10502c = f0Var;
        this.d = o0Var;
        this.f10503e = b0Var;
        this.f10504f = h0Var;
    }

    public static l0 a(int i7, Bundle bundle) {
        f0 f0Var;
        o0 b10;
        boolean z10;
        boolean z11;
        boolean z12;
        b0 b0Var;
        h0 h0Var;
        Map b11;
        byte[] bArr;
        d0 d0Var;
        y yVar;
        h9.t1 f10;
        h9.t1 b12;
        g0 g0Var;
        String string = bundle.getString(h, "");
        string.getClass();
        Bundle bundle2 = bundle.getBundle(f10495i);
        if (bundle2 == null) {
            f0Var = f0.f10387f;
        } else {
            e0 e0Var = new e0();
            String str = f0.f10388g;
            f0 f0Var2 = f0.f10387f;
            e0Var.f10380a = bundle2.getLong(str, f0Var2.f10392a);
            e0Var.f10381b = bundle2.getLong(f0.h, f0Var2.f10393b);
            e0Var.f10382c = bundle2.getLong(f0.f10389i, f0Var2.f10394c);
            e0Var.d = bundle2.getFloat(f0.f10390j, f0Var2.d);
            e0Var.f10383e = bundle2.getFloat(f0.f10391k, f0Var2.f10395e);
            f0Var = new f0(e0Var);
        }
        f0 f0Var3 = f0Var;
        Bundle bundle3 = bundle.getBundle(f10496j);
        if (bundle3 == null) {
            b10 = o0.L;
        } else {
            b10 = o0.b(i7, bundle3);
        }
        o0 o0Var = b10;
        Bundle bundle4 = bundle.getBundle(f10497k);
        if (bundle4 == null) {
            b0Var = b0.f10326r;
        } else {
            z zVar = new z();
            String str2 = a0.f10312j;
            a0 a0Var = a0.f10311i;
            long j3 = a0Var.f10320a;
            long j10 = a0Var.d;
            long j11 = a0Var.f10321b;
            long S = h2.l0.S(bundle4.getLong(str2, j3));
            boolean z13 = true;
            if (S >= 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            la.f(z10);
            zVar.f10808a = S;
            long S2 = h2.l0.S(bundle4.getLong(a0.f10313k, a0Var.f10322c));
            if (S2 != Long.MIN_VALUE && S2 < 0) {
                z11 = false;
            } else {
                z11 = true;
            }
            la.f(z11);
            zVar.f10809b = S2;
            zVar.f10810c = bundle4.getBoolean(a0.f10314l, a0Var.f10323e);
            zVar.d = bundle4.getBoolean(a0.f10315m, a0Var.f10324f);
            zVar.f10811e = bundle4.getBoolean(a0.f10316n, a0Var.f10325g);
            zVar.f10812f = bundle4.getBoolean(a0.f10319q, a0Var.h);
            long j12 = bundle4.getLong(a0.f10317o, j11);
            if (j12 != j11) {
                if (j12 >= 0) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                la.f(z12);
                zVar.f10808a = j12;
            }
            long j13 = bundle4.getLong(a0.f10318p, j10);
            if (j13 != j10) {
                if (j13 != Long.MIN_VALUE && j13 < 0) {
                    z13 = false;
                }
                la.f(z13);
                zVar.f10809b = j13;
            }
            b0Var = new a0(zVar);
        }
        b0 b0Var2 = b0Var;
        Bundle bundle5 = bundle.getBundle(f10498l);
        if (bundle5 == null) {
            h0Var = h0.d;
        } else {
            android.support.v4.media.session.a0 a0Var2 = new android.support.v4.media.session.a0(21, false);
            a0Var2.f1705b = (Uri) bundle5.getParcelable(h0.f10420e);
            a0Var2.f1706c = bundle5.getString(h0.f10421f);
            a0Var2.d = h2.l0.o(bundle5.getBundle(h0.f10422g));
            h0Var = new h0(a0Var2);
        }
        h0 h0Var2 = h0Var;
        Bundle bundle6 = bundle.getBundle(f10499m);
        if (bundle6 == null) {
            g0Var = null;
        } else {
            Bundle bundle7 = bundle6.getBundle(g0.f10404k);
            if (bundle7 == null) {
                d0Var = null;
            } else {
                String string2 = bundle7.getString(d0.f10351i);
                string2.getClass();
                UUID fromString = UUID.fromString(string2);
                Uri uri = (Uri) bundle7.getParcelable(d0.f10352j);
                String str3 = d0.f10353k;
                Bundle bundle8 = Bundle.EMPTY;
                Bundle bundle9 = bundle7.getBundle(str3);
                if (bundle9 == null) {
                    bundle9 = bundle8;
                }
                if (bundle9 == bundle8) {
                    b11 = y1.h;
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
                    b11 = h9.l0.b(hashMap);
                }
                boolean z14 = bundle7.getBoolean(d0.f10354l, false);
                boolean z15 = bundle7.getBoolean(d0.f10355m, false);
                boolean z16 = bundle7.getBoolean(d0.f10356n, false);
                String str5 = d0.f10357o;
                ArrayList<Integer> arrayList = new ArrayList<>();
                ArrayList<Integer> integerArrayList = bundle7.getIntegerArrayList(str5);
                if (integerArrayList != null) {
                    arrayList = integerArrayList;
                }
                h9.i0 q10 = h9.i0.q(arrayList);
                byte[] byteArray = bundle7.getByteArray(d0.f10358p);
                c0 c0Var = new c0();
                c0Var.f10345a = fromString;
                c0Var.f10346b = uri;
                c0Var.f10347c = h9.l0.b(b11);
                c0Var.d = z14;
                c0Var.f10349f = z16;
                c0Var.f10348e = z15;
                c0Var.f10350g = h9.i0.q(q10);
                if (byteArray != null) {
                    bArr = Arrays.copyOf(byteArray, byteArray.length);
                } else {
                    bArr = null;
                }
                c0Var.h = bArr;
                d0Var = new d0(c0Var);
            }
            Bundle bundle10 = bundle6.getBundle(g0.f10405l);
            if (bundle10 == null) {
                yVar = null;
            } else {
                Uri uri2 = (Uri) bundle10.getParcelable(y.f10803b);
                uri2.getClass();
                ?? obj = new Object();
                obj.f10796a = uri2;
                yVar = new y(obj);
            }
            ArrayList parcelableArrayList = bundle6.getParcelableArrayList(g0.f10406m);
            if (parcelableArrayList == null) {
                h9.g0 g0Var2 = h9.i0.f14003b;
                f10 = h9.t1.f14071e;
            } else {
                h9.f0 p10 = h9.i0.p();
                int i10 = 0;
                while (i10 < parcelableArrayList.size()) {
                    Bundle bundle11 = (Bundle) parcelableArrayList.get(i10);
                    bundle11.getClass();
                    p10.c(new f1(bundle11.getInt(f1.d, 0), bundle11.getInt(f1.f10396e, 0), bundle11.getInt(f1.f10397f, 0)));
                    i10++;
                    parcelableArrayList = parcelableArrayList;
                }
                f10 = p10.f();
            }
            h9.t1 t1Var = f10;
            ArrayList parcelableArrayList2 = bundle6.getParcelableArrayList(g0.f10408o);
            if (parcelableArrayList2 == null) {
                h9.g0 g0Var3 = h9.i0.f14003b;
                b12 = h9.t1.f14071e;
            } else {
                b12 = h2.e.b(new ci.v(11), parcelableArrayList2);
            }
            h9.t1 t1Var2 = b12;
            long j14 = bundle6.getLong(g0.f10409p, -9223372036854775807L);
            Uri uri3 = (Uri) bundle6.getParcelable(g0.f10402i);
            uri3.getClass();
            g0Var = new g0(uri3, bundle6.getString(g0.f10403j), d0Var, yVar, t1Var, bundle6.getString(g0.f10407n), t1Var2, j14);
        }
        return new l0(string, b0Var2, g0Var, f0Var3, o0Var, h0Var2);
    }

    public static l0 b(Uri uri) {
        boolean z10;
        g0 g0Var;
        z zVar = new z();
        c0 c0Var = new c0();
        List list = Collections.EMPTY_LIST;
        h9.t1 t1Var = h9.t1.f14071e;
        e0 e0Var = new e0();
        h0 h0Var = h0.d;
        if (c0Var.f10346b != null && c0Var.f10345a == null) {
            z10 = false;
        } else {
            z10 = true;
        }
        la.p(z10);
        d0 d0Var = null;
        if (uri != null) {
            if (c0Var.f10345a != null) {
                d0Var = new d0(c0Var);
            }
            g0Var = new g0(uri, null, d0Var, null, list, null, t1Var, -9223372036854775807L);
        } else {
            g0Var = null;
        }
        return new l0("", new a0(zVar), g0Var, new f0(e0Var), o0.L, h0Var);
    }

    public final Bundle c(int i7, boolean z10) {
        g0 g0Var;
        Bundle bundle = new Bundle();
        String str = this.f10500a;
        if (!str.equals("")) {
            bundle.putString(h, str);
        }
        f0 f0Var = f0.f10387f;
        f0 f0Var2 = this.f10502c;
        if (!f0Var2.equals(f0Var)) {
            bundle.putBundle(f10495i, f0Var2.b());
        }
        o0 o0Var = o0.L;
        o0 o0Var2 = this.d;
        if (!o0Var2.equals(o0Var)) {
            bundle.putBundle(f10496j, o0Var2.c(i7));
        }
        a0 a0Var = a0.f10311i;
        b0 b0Var = this.f10503e;
        if (!b0Var.equals(a0Var)) {
            Bundle bundle2 = new Bundle();
            long j3 = b0Var.f10320a;
            if (j3 != a0Var.f10320a) {
                bundle2.putLong(a0.f10312j, j3);
            }
            long j10 = b0Var.f10322c;
            if (j10 != a0Var.f10322c) {
                bundle2.putLong(a0.f10313k, j10);
            }
            long j11 = b0Var.f10321b;
            if (j11 != a0Var.f10321b) {
                bundle2.putLong(a0.f10317o, j11);
            }
            long j12 = b0Var.d;
            if (j12 != a0Var.d) {
                bundle2.putLong(a0.f10318p, j12);
            }
            boolean z11 = b0Var.f10323e;
            if (z11 != a0Var.f10323e) {
                bundle2.putBoolean(a0.f10314l, z11);
            }
            boolean z12 = b0Var.f10324f;
            if (z12 != a0Var.f10324f) {
                bundle2.putBoolean(a0.f10315m, z12);
            }
            boolean z13 = b0Var.f10325g;
            if (z13 != a0Var.f10325g) {
                bundle2.putBoolean(a0.f10316n, z13);
            }
            boolean z14 = b0Var.h;
            if (z14 != a0Var.h) {
                bundle2.putBoolean(a0.f10319q, z14);
            }
            bundle.putBundle(f10497k, bundle2);
        }
        h0 h0Var = h0.d;
        h0 h0Var2 = this.f10504f;
        if (!h0Var2.equals(h0Var)) {
            Bundle bundle3 = new Bundle();
            Uri uri = h0Var2.f10423a;
            if (uri != null) {
                bundle3.putParcelable(h0.f10420e, uri);
            }
            String str2 = h0Var2.f10424b;
            if (str2 != null) {
                bundle3.putString(h0.f10421f, str2);
            }
            Bundle bundle4 = h0Var2.f10425c;
            if (bundle4 != null) {
                bundle3.putBundle(h0.f10422g, bundle4);
            }
            bundle.putBundle(f10498l, bundle3);
        }
        if (z10 && (g0Var = this.f10501b) != null) {
            h9.i0 i0Var = g0Var.f10415g;
            List list = g0Var.f10413e;
            Bundle bundle5 = new Bundle();
            bundle5.putParcelable(g0.f10402i, g0Var.f10410a);
            String str3 = g0Var.f10411b;
            if (str3 != null) {
                bundle5.putString(g0.f10403j, str3);
            }
            d0 d0Var = g0Var.f10412c;
            if (d0Var != null) {
                String str4 = g0.f10404k;
                h9.i0 i0Var2 = d0Var.f10364g;
                h9.l0 l0Var = d0Var.f10361c;
                Bundle bundle6 = new Bundle();
                bundle6.putString(d0.f10351i, d0Var.f10359a.toString());
                Uri uri2 = d0Var.f10360b;
                if (uri2 != null) {
                    bundle6.putParcelable(d0.f10352j, uri2);
                }
                if (!l0Var.isEmpty()) {
                    String str5 = d0.f10353k;
                    Bundle bundle7 = new Bundle();
                    for (Map.Entry entry : l0Var.entrySet()) {
                        bundle7.putString((String) entry.getKey(), (String) entry.getValue());
                    }
                    bundle6.putBundle(str5, bundle7);
                }
                boolean z15 = d0Var.d;
                if (z15) {
                    bundle6.putBoolean(d0.f10354l, z15);
                }
                boolean z16 = d0Var.f10362e;
                if (z16) {
                    bundle6.putBoolean(d0.f10355m, z16);
                }
                boolean z17 = d0Var.f10363f;
                if (z17) {
                    bundle6.putBoolean(d0.f10356n, z17);
                }
                if (!i0Var2.isEmpty()) {
                    bundle6.putIntegerArrayList(d0.f10357o, new ArrayList<>(i0Var2));
                }
                byte[] bArr = d0Var.h;
                if (bArr != null) {
                    bundle6.putByteArray(d0.f10358p, bArr);
                }
                bundle5.putBundle(str4, bundle6);
            }
            y yVar = g0Var.d;
            if (yVar != null) {
                String str6 = g0.f10405l;
                Bundle bundle8 = new Bundle();
                bundle8.putParcelable(y.f10803b, yVar.f10804a);
                bundle5.putBundle(str6, bundle8);
            }
            if (!list.isEmpty()) {
                bundle5.putParcelableArrayList(g0.f10406m, h2.e.h(list, new ci.v(9)));
            }
            String str7 = g0Var.f10414f;
            if (str7 != null) {
                bundle5.putString(g0.f10407n, str7);
            }
            if (!i0Var.isEmpty()) {
                bundle5.putParcelableArrayList(g0.f10408o, h2.e.h(i0Var, new ci.v(10)));
            }
            long j13 = g0Var.h;
            if (j13 != -9223372036854775807L) {
                bundle5.putLong(g0.f10409p, j13);
            }
            bundle.putBundle(f10499m, bundle5);
        }
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof l0) {
                l0 l0Var = (l0) obj;
                if (Objects.equals(this.f10500a, l0Var.f10500a) && this.f10503e.equals(l0Var.f10503e) && Objects.equals(this.f10501b, l0Var.f10501b) && Objects.equals(this.f10502c, l0Var.f10502c) && Objects.equals(this.d, l0Var.d) && Objects.equals(this.f10504f, l0Var.f10504f)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i7;
        int hashCode = this.f10500a.hashCode() * 31;
        g0 g0Var = this.f10501b;
        if (g0Var != null) {
            i7 = g0Var.hashCode();
        } else {
            i7 = 0;
        }
        int hashCode2 = this.f10502c.hashCode();
        int hashCode3 = this.f10503e.hashCode();
        int hashCode4 = this.d.hashCode();
        return this.f10504f.hashCode() + ((hashCode4 + ((hashCode3 + ((hashCode2 + ((hashCode + i7) * 31)) * 31)) * 31)) * 31);
    }
}
