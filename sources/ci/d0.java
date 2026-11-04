package ci;

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
import org.telegram.messenger.bd;
import org.telegram.messenger.qr;
import org.telegram.messenger.u10;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.iv0;
import org.telegram.ui.hc1;
public final class d0 implements RequestDelegate {
    public final int f4944a;
    public final Object f4945b;

    public d0(Object obj, int i3) {
        this.f4944a = i3;
        this.f4945b = obj;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        final Comparator i1Var;
        Locale locale;
        final Comparator i1Var2;
        Locale locale2;
        int i3 = this.f4944a;
        Object obj = this.f4945b;
        switch (i3) {
            case 0:
                org.telegram.messenger.g0.h3(new e0(0, (f0) obj, tLObject));
                return;
            case 1:
                org.telegram.messenger.g0.h3(new e0(1, (g0) obj, tLObject));
                return;
            case 2:
                org.telegram.messenger.g0.h3(new e0(tLObject, (ai.v2) obj));
                return;
            case 3:
                org.telegram.messenger.g0.h3(new e0(15, (v8) obj, tLObject));
                return;
            case 4:
                tc tcVar = (tc) obj;
                if (tLObject instanceof TLRPC.TL_boolTrue) {
                    qr.a0(tcVar.k1).j1(new ArrayList(Arrays.asList(tcVar.D1.f26868k)), true, true, true, 0, false, 0, 0L);
                    return;
                } else {
                    tcVar.getClass();
                    return;
                }
            case 5:
                org.telegram.messenger.g0.h3(new ei.z5((gi.c8) obj, 1));
                return;
            case 6:
                org.telegram.messenger.g0.h3(new ei.b0(10, (ei.l6) obj, tLObject));
                return;
            case 7:
                org.telegram.messenger.g0.h3(new ei.b0(12, (ei.n6) obj, tLObject));
                return;
            case 8:
                org.telegram.messenger.g0.h3(new g2.c(9, (gi.r1) obj, tLObject));
                return;
            case 9:
                org.telegram.messenger.g0.h3(new g2.c(19, (gi.x6) obj, tLObject));
                return;
            case 10:
                org.telegram.messenger.g0.h3(new g2.c(21, (gi.f7) obj, tLObject));
                return;
            case 11:
                org.telegram.messenger.g0.h3(new g2.c(22, (gi.m7) obj, tLObject));
                return;
            case 12:
                org.telegram.messenger.g0.h3(new ii.e(6, (ii.d4) obj, tL_error));
                return;
            case 13:
                kg.e0 e0Var = (kg.e0) obj;
                e0Var.getClass();
                org.telegram.messenger.g0.h3(new ii.e(13, e0Var, tLObject));
                return;
            case 14:
                org.telegram.messenger.g0.h3(new ei.h9((lg.c) obj, tL_error, tLObject, 27));
                return;
            case 15:
                org.telegram.messenger.g0.h3(new ii.e(22, (lg.f) obj, tLObject));
                return;
            case 16:
                org.telegram.messenger.g0.h3(new ei.h9((lg.m) obj, tL_error, tLObject, 28));
                return;
            case 17:
                org.telegram.messenger.g0.h3(new lg.y((lg.t0) obj, tL_error, tLObject, 2));
                return;
            case 18:
                org.telegram.messenger.g0.h3(new lg.y((lg.d1) obj, tL_error, tLObject, 3));
                return;
            case 19:
                org.telegram.messenger.g0.h3(new ii.e(27, (lg.u1) obj, tLObject));
                return;
            case 20:
                org.telegram.messenger.g0.h3(new m2.s(4, (mi.v) obj, tLObject));
                return;
            case 21:
                org.telegram.messenger.g0.h3(new m2.s(9, (mi.z4) obj, tLObject));
                return;
            case 22:
                org.telegram.messenger.g0.h3(new hc1(11, (org.telegram.ui.web.s1) obj, tLObject));
                return;
            case 23:
                xg.u0 u0Var = (xg.u0) obj;
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
                        if (bd.E0().f21812y != null) {
                            locale = bd.E0().f21812y;
                        } else {
                            locale = Locale.getDefault();
                        }
                        Collator collator = Collator.getInstance(locale);
                        Objects.requireNonNull(collator);
                        i1Var = new y4(collator, 6);
                    } else {
                        i1Var = new vg.i1(1);
                    }
                    Collections.sort(arrayList, i1Var);
                    for (List list2 : hashMap.values()) {
                        Collections.sort(list2, new Comparator() {
                            @Override
                            public final int compare(Object obj2, Object obj3) {
                                TLRPC.TL_help_country tL_help_country2 = (TLRPC.TL_help_country) obj2;
                                TLRPC.TL_help_country tL_help_country3 = (TLRPC.TL_help_country) obj3;
                                switch (r2) {
                                    case 0:
                                        return i1Var.compare(tL_help_country2.default_name, tL_help_country3.default_name);
                                    default:
                                        return i1Var.compare(tL_help_country2.default_name, tL_help_country3.default_name);
                                }
                            }
                        });
                    }
                    org.telegram.messenger.g0.h3(new iv0((u10) u0Var, hashMap, arrayList, 25));
                    return;
                }
                return;
            case 24:
                gi.j8 j8Var = (gi.j8) obj;
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
                                String M0 = bd.M0(2131750529, null);
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
                        if (bd.E0().f21812y != null) {
                            locale2 = bd.E0().f21812y;
                        } else {
                            locale2 = Locale.getDefault();
                        }
                        Collator collator2 = Collator.getInstance(locale2);
                        Objects.requireNonNull(collator2);
                        i1Var2 = new y4(collator2, 6);
                    } else {
                        i1Var2 = new vg.i1(1);
                    }
                    Collections.sort(arrayList2, i1Var2);
                    for (List list4 : hashMap2.values()) {
                        Collections.sort(list4, new Comparator() {
                            @Override
                            public final int compare(Object obj2, Object obj3) {
                                TLRPC.TL_help_country tL_help_country22 = (TLRPC.TL_help_country) obj2;
                                TLRPC.TL_help_country tL_help_country3 = (TLRPC.TL_help_country) obj3;
                                switch (r2) {
                                    case 0:
                                        return i1Var2.compare(tL_help_country22.default_name, tL_help_country3.default_name);
                                    default:
                                        return i1Var2.compare(tL_help_country22.default_name, tL_help_country3.default_name);
                                }
                            }
                        });
                    }
                    org.telegram.messenger.g0.h3(new iv0((u10) j8Var, hashMap2, arrayList2, 28));
                    return;
                }
                return;
            case 25:
                org.telegram.messenger.g0.h3(new u9.a(29, (xg.e1) obj, tLObject));
                return;
            case 26:
                org.telegram.messenger.g0.h3(new xh.i(7, (zf.c) obj, tLObject));
                return;
            default:
                org.telegram.messenger.g0.h3(new z9.o((zf.d) obj, tLObject, tL_error, 2));
                return;
        }
    }
}
