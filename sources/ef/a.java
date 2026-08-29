package ef;

import a4.v;
import ag.i0;
import android.os.Build;
import eg.d2;
import eg.w2;
import j$.util.Objects;
import java.text.Collator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import jh.db;
import jh.k7;
import jh.q;
import jh.y;
import jh.z;
import lh.e6;
import lh.g6;
import lh.m5;
import lh.r3;
import nh.b6;
import nh.g7;
import nh.o7;
import nh.o8;
import nh.r1;
import nh.y7;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.R;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import ph.n3;
import rf.a0;
import sf.g;
import sf.l;
import sf.n0;
import sf.o1;
import sf.s1;
import sf.x0;
import th.s4;
public final class a implements RequestDelegate {
    public final int f5886a;
    public final Object f5887b;

    public a(Object obj, int i10) {
        this.f5886a = i10;
        this.f5887b = obj;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        final Comparator eVar;
        Locale locale;
        final Comparator eVar2;
        Locale locale2;
        int i10 = this.f5886a;
        Object obj = this.f5887b;
        switch (i10) {
            case 0:
                AndroidUtilities.runOnUIThread(new a1.e(29, (e) obj, tLObject));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new androidx.car.app.utils.b((f) obj, tLObject, tL_error, 4));
                return;
            case 2:
                d2 d2Var = (d2) obj;
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
                        if (LocaleController.getInstance().getCurrentLocale() != null) {
                            locale = LocaleController.getInstance().getCurrentLocale();
                        } else {
                            locale = Locale.getDefault();
                        }
                        Collator collator = Collator.getInstance(locale);
                        Objects.requireNonNull(collator);
                        eVar = new v(collator, 2);
                    } else {
                        eVar = new c5.e(13);
                    }
                    Collections.sort(arrayList, eVar);
                    for (List list2 : hashMap.values()) {
                        Collections.sort(list2, new Comparator() {
                            @Override
                            public final int compare(Object obj2, Object obj3) {
                                TLRPC.TL_help_country tL_help_country2 = (TLRPC.TL_help_country) obj2;
                                TLRPC.TL_help_country tL_help_country3 = (TLRPC.TL_help_country) obj3;
                                switch (r2) {
                                    case 0:
                                        return eVar.compare(tL_help_country2.default_name, tL_help_country3.default_name);
                                    default:
                                        return eVar.compare(tL_help_country2.default_name, tL_help_country3.default_name);
                                }
                            }
                        });
                    }
                    AndroidUtilities.runOnUIThread(new androidx.car.app.utils.b(d2Var, hashMap, arrayList, 5));
                    return;
                }
                return;
            case 3:
                i0 i0Var = (i0) obj;
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
                                String string = LocaleController.getString(R.string.Fragment);
                                tL_help_country2.default_name = string;
                                tL_help_country2.name = string;
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
                        if (LocaleController.getInstance().getCurrentLocale() != null) {
                            locale2 = LocaleController.getInstance().getCurrentLocale();
                        } else {
                            locale2 = Locale.getDefault();
                        }
                        Collator collator2 = Collator.getInstance(locale2);
                        Objects.requireNonNull(collator2);
                        eVar2 = new v(collator2, 2);
                    } else {
                        eVar2 = new c5.e(13);
                    }
                    Collections.sort(arrayList2, eVar2);
                    for (List list4 : hashMap2.values()) {
                        Collections.sort(list4, new Comparator() {
                            @Override
                            public final int compare(Object obj2, Object obj3) {
                                TLRPC.TL_help_country tL_help_country22 = (TLRPC.TL_help_country) obj2;
                                TLRPC.TL_help_country tL_help_country3 = (TLRPC.TL_help_country) obj3;
                                switch (r2) {
                                    case 0:
                                        return eVar2.compare(tL_help_country22.default_name, tL_help_country3.default_name);
                                    default:
                                        return eVar2.compare(tL_help_country22.default_name, tL_help_country3.default_name);
                                }
                            }
                        });
                    }
                    AndroidUtilities.runOnUIThread(new androidx.car.app.utils.b(i0Var, hashMap2, arrayList2, 8));
                    return;
                }
                return;
            case 4:
                AndroidUtilities.runOnUIThread(new c(9, (w2) obj, tLObject));
                return;
            case 5:
                AndroidUtilities.runOnUIThread(new androidx.car.app.utils.b((q) obj, tLObject, tL_error, 18));
                return;
            case 6:
                AndroidUtilities.runOnUIThread(new c(25, (y) obj, tLObject));
                return;
            case 7:
                AndroidUtilities.runOnUIThread(new c(26, (z) obj, tLObject));
                return;
            case 8:
                AndroidUtilities.runOnUIThread(new jh.w2(tLObject, (i0) obj));
                return;
            case 9:
                AndroidUtilities.runOnUIThread(new jh.w2(10, (k7) obj, tLObject));
                return;
            case 10:
                db dbVar = (db) obj;
                if (tLObject instanceof TLRPC.TL_boolTrue) {
                    MessagesStorage.getInstance(dbVar.f11974c).putMessages(new ArrayList<>(Arrays.asList(dbVar.G.messageOwner)), true, true, true, 0, 0, 0L);
                    return;
                } else {
                    dbVar.getClass();
                    return;
                }
            case 11:
                AndroidUtilities.runOnUIThread(new m5((o8) obj, 1));
                return;
            case 12:
                AndroidUtilities.runOnUIThread(new r3(3, (e6) obj, tLObject));
                return;
            case 13:
                AndroidUtilities.runOnUIThread(new r3(5, (g6) obj, tLObject));
                return;
            case 14:
                AndroidUtilities.runOnUIThread(new r3(26, (r1) obj, tLObject));
                return;
            case 15:
                AndroidUtilities.runOnUIThread(new b6(7, (g7) obj, tLObject));
                return;
            case 16:
                AndroidUtilities.runOnUIThread(new b6(8, (o7) obj, tLObject));
                return;
            case 17:
                AndroidUtilities.runOnUIThread(new b6(9, (y7) obj, tLObject));
                return;
            case 18:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.web.y(6, (org.telegram.ui.web.d2) obj, tLObject));
                return;
            case 19:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.web.y(14, (n3) obj, tL_error));
                return;
            case 20:
                rf.c cVar = (rf.c) obj;
                if (tLObject != null) {
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.web.y(20, cVar, tLObject));
                    return;
                }
                return;
            case 21:
                a0 a0Var = (a0) obj;
                a0Var.getClass();
                AndroidUtilities.runOnUIThread(new org.telegram.ui.web.y(21, a0Var, tLObject));
                return;
            case 22:
                AndroidUtilities.runOnUIThread(new sf.a((Object) ((sf.d) obj), (Object) tL_error, (Object) tLObject, 0));
                return;
            case 23:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.web.y(26, (g) obj, tLObject));
                return;
            case 24:
                AndroidUtilities.runOnUIThread(new sf.a((Object) ((l) obj), (Object) tL_error, (Object) tLObject, 1));
                return;
            case 25:
                AndroidUtilities.runOnUIThread(new sf.a((Object) ((n0) obj), (Object) tL_error, (Object) tLObject, 5));
                return;
            case 26:
                AndroidUtilities.runOnUIThread(new sf.a((Object) ((x0) obj), (Object) tL_error, (Object) tLObject, 6));
                return;
            case 27:
                AndroidUtilities.runOnUIThread(new o1(2, (s1) obj, tLObject));
                return;
            case 28:
                AndroidUtilities.runOnUIThread(new o1(4, (th.v) obj, tLObject));
                return;
            default:
                AndroidUtilities.runOnUIThread(new o1(9, (s4) obj, tLObject));
                return;
        }
    }
}
