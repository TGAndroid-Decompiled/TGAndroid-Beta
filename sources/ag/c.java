package ag;

import android.os.Build;
import bi.l5;
import bi.v6;
import j$.util.Objects;
import java.text.Collator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import org.telegram.messenger.dd;
import org.telegram.messenger.is;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import rh.v5;
import rh.y8;
import th.r4;
import th.t4;
import vh.f5;
import vh.i6;
import vh.n5;
import vh.t5;
public final class c implements RequestDelegate {
    public final int f474a;
    public final Object f475b;

    public c(Object obj, int i10) {
        this.f474a = i10;
        this.f475b = obj;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        final Comparator dVar;
        Locale locale;
        final Comparator dVar2;
        Locale locale2;
        int i10 = this.f474a;
        Object obj = this.f475b;
        switch (i10) {
            case 0:
                org.telegram.messenger.i0.g3(new a3.l0((f) obj, tL_error, tLObject, 1));
                return;
            case 1:
                org.telegram.messenger.i0.g3(new a1.f(7, (k) obj, tLObject));
                return;
            case 2:
                org.telegram.messenger.i0.g3(new a3.l0((w) obj, tL_error, tLObject, 2));
                return;
            case 3:
                org.telegram.messenger.i0.g3(new a3.l0((v1) obj, tL_error, tLObject, 6));
                return;
            case 4:
                org.telegram.messenger.i0.g3(new a3.l0((h2) obj, tL_error, tLObject, 7));
                return;
            case 5:
                org.telegram.messenger.i0.g3(new a1.f(12, (i3) obj, tLObject));
                return;
            case 6:
                org.telegram.messenger.i0.g3(new a1.f(18, (bi.z) obj, tLObject));
                return;
            case 7:
                org.telegram.messenger.i0.g3(new a1.f(23, (l5) obj, tLObject));
                return;
            case 8:
                mg.s1 s1Var = (mg.s1) obj;
                if (tLObject != null) {
                    TLRPC.TL_help_countriesList tL_help_countriesList = (TLRPC.TL_help_countriesList) tLObject;
                    HashMap hashMap = new HashMap();
                    ArrayList arrayList = new ArrayList();
                    for (int i11 = 0; i11 < tL_help_countriesList.countries.size(); i11++) {
                        TLRPC.TL_help_country tL_help_country = tL_help_countriesList.countries.get(i11);
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
                        if (dd.D0().f15365y != null) {
                            locale = dd.D0().f15365y;
                        } else {
                            locale = Locale.getDefault();
                        }
                        Collator collator = Collator.getInstance(locale);
                        Objects.requireNonNull(collator);
                        dVar = new v6(collator, 2);
                    } else {
                        dVar = new a4.d(11);
                    }
                    Collections.sort(arrayList, dVar);
                    for (List list2 : hashMap.values()) {
                        Collections.sort(list2, new Comparator() {
                            @Override
                            public final int compare(Object obj2, Object obj3) {
                                TLRPC.TL_help_country tL_help_country2 = (TLRPC.TL_help_country) obj2;
                                TLRPC.TL_help_country tL_help_country3 = (TLRPC.TL_help_country) obj3;
                                switch (r2) {
                                    case 0:
                                        return dVar.compare(tL_help_country2.default_name, tL_help_country3.default_name);
                                    default:
                                        return dVar.compare(tL_help_country2.default_name, tL_help_country3.default_name);
                                }
                            }
                        });
                    }
                    org.telegram.messenger.i0.g3(new li.s(s1Var, hashMap, arrayList, 5));
                    return;
                }
                return;
            case 9:
                l lVar = (l) obj;
                if (tLObject != null) {
                    TLRPC.TL_help_countriesList tL_help_countriesList2 = (TLRPC.TL_help_countriesList) tLObject;
                    HashMap hashMap2 = new HashMap();
                    ArrayList arrayList2 = new ArrayList();
                    for (int i12 = 0; i12 < tL_help_countriesList2.countries.size(); i12++) {
                        TLRPC.TL_help_country tL_help_country2 = tL_help_countriesList2.countries.get(i12);
                        boolean equalsIgnoreCase = tL_help_country2.iso2.equalsIgnoreCase("FT");
                        String str2 = tL_help_country2.name;
                        if (str2 != null) {
                            tL_help_country2.default_name = str2;
                        }
                        if (!tL_help_country2.hidden || equalsIgnoreCase) {
                            if (equalsIgnoreCase) {
                                String L0 = dd.L0(2131750530, null);
                                tL_help_country2.default_name = L0;
                                tL_help_country2.name = L0;
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
                        if (dd.D0().f15365y != null) {
                            locale2 = dd.D0().f15365y;
                        } else {
                            locale2 = Locale.getDefault();
                        }
                        Collator collator2 = Collator.getInstance(locale2);
                        Objects.requireNonNull(collator2);
                        dVar2 = new v6(collator2, 2);
                    } else {
                        dVar2 = new a4.d(11);
                    }
                    Collections.sort(arrayList2, dVar2);
                    for (List list4 : hashMap2.values()) {
                        Collections.sort(list4, new Comparator() {
                            @Override
                            public final int compare(Object obj2, Object obj3) {
                                TLRPC.TL_help_country tL_help_country22 = (TLRPC.TL_help_country) obj2;
                                TLRPC.TL_help_country tL_help_country3 = (TLRPC.TL_help_country) obj3;
                                switch (r2) {
                                    case 0:
                                        return dVar2.compare(tL_help_country22.default_name, tL_help_country3.default_name);
                                    default:
                                        return dVar2.compare(tL_help_country22.default_name, tL_help_country3.default_name);
                                }
                            }
                        });
                    }
                    org.telegram.messenger.i0.g3(new li.s(lVar, hashMap2, arrayList2, 8));
                    return;
                }
                return;
            case 10:
                org.telegram.messenger.i0.g3(new k2.u(29, (mg.i2) obj, tLObject));
                return;
            case 11:
                org.telegram.messenger.i0.g3(new mh.k(3, (of.c) obj, tLObject));
                return;
            case 12:
                org.telegram.messenger.i0.g3(new li.s((of.d) obj, tLObject, tL_error, 12));
                return;
            case 13:
                org.telegram.messenger.i0.g3(new org.telegram.ui.web.v1(0, (org.telegram.ui.web.w1) obj, tLObject));
                return;
            case 14:
                org.telegram.messenger.i0.g3(new rh.n(0, (rh.o) obj, tLObject));
                return;
            case 15:
                org.telegram.messenger.i0.g3(new rh.n(1, (rh.p) obj, tLObject));
                return;
            case 16:
                org.telegram.messenger.i0.g3(new rh.n(tLObject, (ph.h1) obj));
                return;
            case 17:
                org.telegram.messenger.i0.g3(new rh.n(15, (v5) obj, tLObject));
                return;
            case 18:
                y8 y8Var = (y8) obj;
                if (tLObject instanceof TLRPC.TL_boolTrue) {
                    is.a0(y8Var.f47781j1).j1(new ArrayList(Arrays.asList(y8Var.C1.f16690k)), true, true, true, 0, false, 0, 0L);
                    return;
                } else {
                    y8Var.getClass();
                    return;
                }
            case 19:
                org.telegram.messenger.i0.g3(new sg.v((i6) obj, 13));
                return;
            case 20:
                org.telegram.messenger.i0.g3(new th.o0(7, (r4) obj, tLObject));
                return;
            case 21:
                org.telegram.messenger.i0.g3(new th.o0(9, (t4) obj, tLObject));
                return;
            case 22:
                org.telegram.messenger.i0.g3(new vh.r0(1, (vh.e1) obj, tLObject));
                return;
            case 23:
                org.telegram.messenger.i0.g3(new vh.r0(11, (f5) obj, tLObject));
                return;
            case 24:
                org.telegram.messenger.i0.g3(new vh.r0(13, (n5) obj, tLObject));
                return;
            case 25:
                org.telegram.messenger.i0.g3(new vh.r0(14, (t5) obj, tLObject));
                return;
            case 26:
                org.telegram.messenger.i0.g3(new vh.r0(29, (xh.j3) obj, tL_error));
                return;
            case 27:
                zf.c cVar = (zf.c) obj;
                if (tLObject != null) {
                    org.telegram.messenger.i0.g3(new xh.e3(3, cVar, tLObject));
                    return;
                }
                return;
            default:
                zf.z zVar = (zf.z) obj;
                zVar.getClass();
                org.telegram.messenger.i0.g3(new xh.e3(5, zVar, tLObject));
                return;
        }
    }
}
