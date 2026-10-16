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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.R;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ds0;
public final class z7 implements RequestDelegate {
    public final int f4071a;
    public final Object f4072b;

    public z7(Object obj, int i10) {
        this.f4071a = i10;
        this.f4072b = obj;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        final Comparator ds0Var;
        Locale locale;
        final Comparator ds0Var2;
        Locale locale2;
        int i10 = this.f4071a;
        Object obj = this.f4072b;
        switch (i10) {
            case 0:
                AndroidUtilities.runOnUIThread(new a3.d((di.l9) obj, 23));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new a1.f(26, (g8) obj, tLObject));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new a1.f(28, (i8) obj, tLObject));
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new u8(26, (di.v1) obj, tLObject));
                return;
            case 4:
                AndroidUtilities.runOnUIThread(new di.y6(7, (di.c8) obj, tLObject));
                return;
            case 5:
                AndroidUtilities.runOnUIThread(new di.y6(8, (di.k8) obj, tLObject));
                return;
            case 6:
                AndroidUtilities.runOnUIThread(new di.y6(9, (di.t8) obj, tLObject));
                return;
            case 7:
                AndroidUtilities.runOnUIThread(new fi.q3(1, (fi.q4) obj, tL_error));
                return;
            case 8:
                hg.c cVar = (hg.c) obj;
                if (tLObject != null) {
                    AndroidUtilities.runOnUIThread(new fi.q3(6, cVar, tLObject));
                    return;
                }
                return;
            case 9:
                hg.h0 h0Var = (hg.h0) obj;
                h0Var.getClass();
                AndroidUtilities.runOnUIThread(new fi.q3(8, h0Var, tLObject));
                return;
            case 10:
                AndroidUtilities.runOnUIThread(new hg.t((ig.c) obj, tL_error, tLObject, 8));
                return;
            case 11:
                AndroidUtilities.runOnUIThread(new fi.q3(14, (ig.f) obj, tLObject));
                return;
            case 12:
                AndroidUtilities.runOnUIThread(new hg.t((ig.m) obj, tL_error, tLObject, 9));
                return;
            case 13:
                AndroidUtilities.runOnUIThread(new hg.t((ig.w0) obj, tL_error, tLObject, 13));
                return;
            case 14:
                AndroidUtilities.runOnUIThread(new hg.t((ig.g1) obj, tL_error, tLObject, 14));
                return;
            case 15:
                AndroidUtilities.runOnUIThread(new fi.q3(20, (ig.b2) obj, tLObject));
                return;
            case 16:
                AndroidUtilities.runOnUIThread(new fi.q3(27, (ji.x) obj, tLObject));
                return;
            case 17:
                AndroidUtilities.runOnUIThread(new ji.v2(2, (ji.e5) obj, tLObject));
                return;
            case 18:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.web.v(7, (org.telegram.ui.web.g2) obj, tLObject));
                return;
            case 19:
                ug.x0 x0Var = (ug.x0) obj;
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
                        ds0Var = new q7(collator, 5);
                    } else {
                        ds0Var = new ds0(13);
                    }
                    Collections.sort(arrayList, ds0Var);
                    for (List list2 : hashMap.values()) {
                        Collections.sort(list2, new Comparator() {
                            @Override
                            public final int compare(Object obj2, Object obj3) {
                                TLRPC.TL_help_country tL_help_country2 = (TLRPC.TL_help_country) obj2;
                                TLRPC.TL_help_country tL_help_country3 = (TLRPC.TL_help_country) obj3;
                                switch (r2) {
                                    case 0:
                                        return ds0Var.compare(tL_help_country2.default_name, tL_help_country3.default_name);
                                    default:
                                        return ds0Var.compare(tL_help_country2.default_name, tL_help_country3.default_name);
                                }
                            }
                        });
                    }
                    AndroidUtilities.runOnUIThread(new pi.g(x0Var, hashMap, arrayList, 8));
                    return;
                }
                return;
            case 20:
                ji.p1 p1Var = (ji.p1) obj;
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
                        ds0Var2 = new q7(collator2, 5);
                    } else {
                        ds0Var2 = new ds0(13);
                    }
                    Collections.sort(arrayList2, ds0Var2);
                    for (List list4 : hashMap2.values()) {
                        Collections.sort(list4, new Comparator() {
                            @Override
                            public final int compare(Object obj2, Object obj3) {
                                TLRPC.TL_help_country tL_help_country22 = (TLRPC.TL_help_country) obj2;
                                TLRPC.TL_help_country tL_help_country3 = (TLRPC.TL_help_country) obj3;
                                switch (r2) {
                                    case 0:
                                        return ds0Var2.compare(tL_help_country22.default_name, tL_help_country3.default_name);
                                    default:
                                        return ds0Var2.compare(tL_help_country22.default_name, tL_help_country3.default_name);
                                }
                            }
                        });
                    }
                    AndroidUtilities.runOnUIThread(new pi.g(p1Var, hashMap2, arrayList2, 11));
                    return;
                }
                return;
            case 21:
                AndroidUtilities.runOnUIThread(new s9.b(16, (ug.m1) obj, tLObject));
                return;
            case 22:
                AndroidUtilities.runOnUIThread(new s9.b(18, (wf.c) obj, tLObject));
                return;
            case 23:
                AndroidUtilities.runOnUIThread(new pi.g((wf.d) obj, tLObject, tL_error, 12));
                return;
            case 24:
                AndroidUtilities.runOnUIThread(new pi.g((zh.g) obj, tLObject, tL_error, 20));
                return;
            case 25:
                AndroidUtilities.runOnUIThread(new s9.b(29, (zh.l) obj, tLObject));
                return;
            case 26:
                AndroidUtilities.runOnUIThread(new zh.m(0, (zh.n) obj, tLObject));
                return;
            case 27:
                AndroidUtilities.runOnUIThread(new zh.m(tLObject, (ji.p1) obj));
                return;
            case 28:
                AndroidUtilities.runOnUIThread(new zh.m(14, (zh.f5) obj, tLObject));
                return;
            default:
                zh.h8 h8Var = (zh.h8) obj;
                if (tLObject instanceof TLRPC.TL_boolTrue) {
                    MessagesStorage.getInstance(h8Var.f50642c).putMessages(new ArrayList<>(Arrays.asList(h8Var.L.messageOwner)), true, true, true, 0, 0, 0L);
                    return;
                } else {
                    h8Var.getClass();
                    return;
                }
        }
    }
}
