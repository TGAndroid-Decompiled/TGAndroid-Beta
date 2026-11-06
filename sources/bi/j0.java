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
import org.telegram.ui.Components.q31;
import org.telegram.ui.un0;
public final class j0 implements RequestDelegate {
    public final int f4074a;
    public final Object f4075b;

    public j0(Object obj, int i7) {
        this.f4074a = i7;
        this.f4075b = obj;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        final Comparator un0Var;
        Locale locale;
        final Comparator un0Var2;
        Locale locale2;
        int i7 = this.f4074a;
        Object obj = this.f4075b;
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
                    yr.a0(ceVar.f3615j1).j1(new ArrayList(Arrays.asList(ceVar.C1.f23237k)), true, true, true, 0, false, 0, 0L);
                    return;
                } else {
                    ceVar.getClass();
                    return;
                }
            case 5:
                org.telegram.messenger.g0.h3(new ab((fi.d8) obj, 26));
                return;
            case 6:
                org.telegram.messenger.g0.h3(new di.z0(7, (di.k6) obj, tLObject));
                return;
            case 7:
                org.telegram.messenger.g0.h3(new di.z0(9, (di.m6) obj, tLObject));
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
                org.telegram.messenger.g0.h3(new org.telegram.ui.web.w(6, (org.telegram.ui.web.v1) obj, tLObject));
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
                        if (org.telegram.messenger.hd.E0().f22899y != null) {
                            locale = org.telegram.messenger.hd.E0().f22899y;
                        } else {
                            locale = Locale.getDefault();
                        }
                        Collator collator = Collator.getInstance(locale);
                        Objects.requireNonNull(collator);
                        un0Var = new s5(collator, 8);
                    } else {
                        un0Var = new un0(14);
                    }
                    Collections.sort(arrayList, un0Var);
                    for (List list2 : hashMap.values()) {
                        Collections.sort(list2, new Comparator() {
                            @Override
                            public final int compare(Object obj2, Object obj3) {
                                TLRPC.TL_help_country tL_help_country2 = (TLRPC.TL_help_country) obj2;
                                TLRPC.TL_help_country tL_help_country3 = (TLRPC.TL_help_country) obj3;
                                switch (r2) {
                                    case 0:
                                        return un0Var.compare(tL_help_country2.default_name, tL_help_country3.default_name);
                                    default:
                                        return un0Var.compare(tL_help_country2.default_name, tL_help_country3.default_name);
                                }
                            }
                        });
                    }
                    org.telegram.messenger.g0.h3(new q31(u0Var, hashMap, arrayList, 20));
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
                                String M0 = org.telegram.messenger.hd.M0(2131750520, null);
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
                        if (org.telegram.messenger.hd.E0().f22899y != null) {
                            locale2 = org.telegram.messenger.hd.E0().f22899y;
                        } else {
                            locale2 = Locale.getDefault();
                        }
                        Collator collator2 = Collator.getInstance(locale2);
                        Objects.requireNonNull(collator2);
                        un0Var2 = new s5(collator2, 8);
                    } else {
                        un0Var2 = new un0(14);
                    }
                    Collections.sort(arrayList2, un0Var2);
                    for (List list4 : hashMap2.values()) {
                        Collections.sort(list4, new Comparator() {
                            @Override
                            public final int compare(Object obj2, Object obj3) {
                                TLRPC.TL_help_country tL_help_country22 = (TLRPC.TL_help_country) obj2;
                                TLRPC.TL_help_country tL_help_country3 = (TLRPC.TL_help_country) obj3;
                                switch (r2) {
                                    case 0:
                                        return un0Var2.compare(tL_help_country22.default_name, tL_help_country3.default_name);
                                    default:
                                        return un0Var2.compare(tL_help_country22.default_name, tL_help_country3.default_name);
                                }
                            }
                        });
                    }
                    org.telegram.messenger.g0.h3(new q31(cVar, hashMap2, arrayList2, 23));
                    return;
                }
                return;
            case 25:
                org.telegram.messenger.g0.h3(new ti.p(26, (wg.f1) obj, tLObject));
                return;
            case 26:
                org.telegram.messenger.g0.h3(new wi.q(4, (yf.c) obj, tLObject));
                return;
            default:
                org.telegram.messenger.g0.h3(new q31((yf.d) obj, tLObject, tL_error));
                return;
        }
    }
}
