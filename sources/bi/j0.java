package bi;

import android.os.Build;
import j$.util.Objects;
import java.text.Collator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import org.telegram.messenger.yr;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.r31;
import org.telegram.ui.xn0;
public final class j0 implements RequestDelegate {
    public final int f4071a;
    public final Object f4072b;

    public j0(Object obj, int i7) {
        this.f4071a = i7;
        this.f4072b = obj;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        final Comparator xn0Var;
        Locale locale;
        final Comparator xn0Var2;
        Locale locale2;
        int i7 = this.f4071a;
        Object obj = this.f4072b;
        switch (i7) {
            case 0:
                org.telegram.messenger.g0.h3(new a1.e(23, (k0) obj, tLObject));
                return;
            case 1:
                org.telegram.messenger.g0.h3(new a1.e(24, (l0) obj, tLObject));
                return;
            case 2:
                org.telegram.messenger.g0.h3(new a4(6, tLObject, (ai.i) obj));
                return;
            case 3:
                org.telegram.messenger.g0.h3(new a4(8, (v9) obj, tLObject));
                return;
            case 4:
                ce ceVar = (ce) obj;
                if (tLObject instanceof TLRPC.TL_boolTrue) {
                    yr.a0(ceVar.f3617m1).j1(new ArrayList(Arrays.asList(ceVar.F1.f23266k)), true, true, true, 0, false, 0, 0L);
                    return;
                } else {
                    ceVar.getClass();
                    return;
                }
            case 5:
                org.telegram.messenger.g0.h3(new ab((fi.d8) obj, 25));
                return;
            case 6:
                org.telegram.messenger.g0.h3(new di.z0(7, (di.l6) obj, tLObject));
                return;
            case 7:
                org.telegram.messenger.g0.h3(new di.z0(9, (di.n6) obj, tLObject));
                return;
            case 8:
                org.telegram.messenger.g0.h3(new f2.h(3, (fi.r1) obj, tLObject));
                return;
            case 9:
                org.telegram.messenger.g0.h3(new f2.h(13, (fi.w6) obj, tLObject));
                return;
            case 10:
                org.telegram.messenger.g0.h3(new f2.h(15, (fi.e7) obj, tLObject));
                return;
            case 11:
                org.telegram.messenger.g0.h3(new f2.h(16, (fi.m7) obj, tLObject));
                return;
            case 12:
                org.telegram.messenger.g0.h3(new ha.b(7, (hi.c4) obj, tL_error));
                return;
            case 13:
                jg.h0 h0Var = (jg.h0) obj;
                h0Var.getClass();
                org.telegram.messenger.g0.h3(new ha.b(12, h0Var, tLObject));
                return;
            case 14:
                org.telegram.messenger.g0.h3(new fi.x1((kg.c) obj, tL_error, tLObject, 22));
                return;
            case 15:
                org.telegram.messenger.g0.h3(new ha.b(16, (kg.f) obj, tLObject));
                return;
            case 16:
                org.telegram.messenger.g0.h3(new fi.x1((kg.m) obj, tL_error, tLObject, 23));
                return;
            case 17:
                org.telegram.messenger.g0.h3(new fi.x1((kg.s0) obj, tL_error, tLObject, 27));
                return;
            case 18:
                org.telegram.messenger.g0.h3(new fi.x1((kg.c1) obj, tL_error, tLObject, 28));
                return;
            case 19:
                org.telegram.messenger.g0.h3(new ha.b(21, (kg.t1) obj, tLObject));
                return;
            case 20:
                org.telegram.messenger.g0.h3(new ha.b(26, (li.v) obj, tLObject));
                return;
            case 21:
                org.telegram.messenger.g0.h3(new li.j3(1, (li.y4) obj, tLObject));
                return;
            case 22:
                org.telegram.messenger.g0.h3(new org.telegram.ui.web.s(7, (org.telegram.ui.web.u1) obj, tLObject));
                return;
            case 23:
                wg.u0 u0Var = (wg.u0) obj;
                if (tLObject != null) {
                    TLRPC.TL_help_countriesList tL_help_countriesList = (TLRPC.TL_help_countriesList) tLObject;
                    HashMap hashMap = new HashMap();
                    ArrayList arrayList = new ArrayList();
                    for (int i10 = 0; i10 < tL_help_countriesList.countries.size(); i10++) {
                        TLRPC.TL_help_country tL_help_country = tL_help_countriesList.countries.get(i10);
                        String str = tL_help_country.name;
                        if (str != null) {
                            tL_help_country.default_name = str;
                        }
                        if (!tL_help_country.hidden && !tL_help_country.iso2.equalsIgnoreCase("FT")) {
                            String upperCase = tL_help_country.default_name.substring(0, 1).toUpperCase();
                            List list = (List) hashMap.get(upperCase);
                            if (list == null) {
                                list = new ArrayList();
                                hashMap.put(upperCase, list);
                                arrayList.add(upperCase);
                            }
                            list.add(tL_help_country);
                        }
                    }
                    if (Build.VERSION.SDK_INT >= 24) {
                        if (org.telegram.messenger.id.E0().f23189y != null) {
                            locale = org.telegram.messenger.id.E0().f23189y;
                        } else {
                            locale = Locale.getDefault();
                        }
                        Collator collator = Collator.getInstance(locale);
                        Objects.requireNonNull(collator);
                        xn0Var = new s5(collator, 8);
                    } else {
                        xn0Var = new xn0(14);
                    }
                    Collections.sort(arrayList, xn0Var);
                    for (List list2 : hashMap.values()) {
                        Collections.sort(list2, new Comparator() {
                            @Override
                            public final int compare(Object obj2, Object obj3) {
                                TLRPC.TL_help_country tL_help_country2 = (TLRPC.TL_help_country) obj2;
                                TLRPC.TL_help_country tL_help_country3 = (TLRPC.TL_help_country) obj3;
                                switch (r2) {
                                    case 0:
                                        return xn0Var.compare(tL_help_country2.default_name, tL_help_country3.default_name);
                                    default:
                                        return xn0Var.compare(tL_help_country2.default_name, tL_help_country3.default_name);
                                }
                            }
                        });
                    }
                    org.telegram.messenger.g0.h3(new r31(u0Var, hashMap, arrayList, 20));
                    return;
                }
                return;
            case 24:
                ii.c cVar = (ii.c) obj;
                if (tLObject != null) {
                    TLRPC.TL_help_countriesList tL_help_countriesList2 = (TLRPC.TL_help_countriesList) tLObject;
                    HashMap hashMap2 = new HashMap();
                    ArrayList arrayList2 = new ArrayList();
                    for (int i11 = 0; i11 < tL_help_countriesList2.countries.size(); i11++) {
                        TLRPC.TL_help_country tL_help_country2 = tL_help_countriesList2.countries.get(i11);
                        boolean equalsIgnoreCase = tL_help_country2.iso2.equalsIgnoreCase("FT");
                        String str2 = tL_help_country2.name;
                        if (str2 != null) {
                            tL_help_country2.default_name = str2;
                        }
                        if (!tL_help_country2.hidden || equalsIgnoreCase) {
                            if (equalsIgnoreCase) {
                                String M0 = org.telegram.messenger.id.M0(2131750521, null);
                                tL_help_country2.default_name = M0;
                                tL_help_country2.name = M0;
                            }
                            String upperCase2 = tL_help_country2.default_name.substring(0, 1).toUpperCase();
                            List list3 = (List) hashMap2.get(upperCase2);
                            if (list3 == null) {
                                list3 = new ArrayList();
                                hashMap2.put(upperCase2, list3);
                                arrayList2.add(upperCase2);
                            }
                            list3.add(tL_help_country2);
                        }
                    }
                    if (Build.VERSION.SDK_INT >= 24) {
                        if (org.telegram.messenger.id.E0().f23189y != null) {
                            locale2 = org.telegram.messenger.id.E0().f23189y;
                        } else {
                            locale2 = Locale.getDefault();
                        }
                        Collator collator2 = Collator.getInstance(locale2);
                        Objects.requireNonNull(collator2);
                        xn0Var2 = new s5(collator2, 8);
                    } else {
                        xn0Var2 = new xn0(14);
                    }
                    Collections.sort(arrayList2, xn0Var2);
                    for (List list4 : hashMap2.values()) {
                        Collections.sort(list4, new Comparator() {
                            @Override
                            public final int compare(Object obj2, Object obj3) {
                                TLRPC.TL_help_country tL_help_country22 = (TLRPC.TL_help_country) obj2;
                                TLRPC.TL_help_country tL_help_country3 = (TLRPC.TL_help_country) obj3;
                                switch (r2) {
                                    case 0:
                                        return xn0Var2.compare(tL_help_country22.default_name, tL_help_country3.default_name);
                                    default:
                                        return xn0Var2.compare(tL_help_country22.default_name, tL_help_country3.default_name);
                                }
                            }
                        });
                    }
                    org.telegram.messenger.g0.h3(new r31(cVar, hashMap2, arrayList2, 23));
                    return;
                }
                return;
            case 25:
                org.telegram.messenger.g0.h3(new u9.f(22, (wg.f1) obj, tLObject));
                return;
            case 26:
                org.telegram.messenger.g0.h3(new yf.b(0, (yf.d) obj, tLObject));
                return;
            default:
                org.telegram.messenger.g0.h3(new r31((yf.e) obj, tLObject, tL_error));
                return;
        }
    }
}
