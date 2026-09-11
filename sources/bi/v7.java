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
import org.telegram.ui.Components.er0;
import org.telegram.ui.f11;
public final class v7 implements RequestDelegate {
    public final int f3902a;
    public final Object f3903b;

    public v7(Object obj, int i10) {
        this.f3902a = i10;
        this.f3903b = obj;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        final Comparator f11Var;
        Locale locale;
        final Comparator f11Var2;
        Locale locale2;
        int i10 = this.f3902a;
        Object obj = this.f3903b;
        switch (i10) {
            case 0:
                AndroidUtilities.runOnUIThread(new a3.c((di.o9) obj, 22));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new a1.e(24, (d8) obj, tLObject));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new a1.e(26, (f8) obj, tLObject));
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new s8(24, (di.w1) obj, tLObject));
                return;
            case 4:
                AndroidUtilities.runOnUIThread(new di.b7(5, (di.g8) obj, tLObject));
                return;
            case 5:
                AndroidUtilities.runOnUIThread(new di.b7((di.o8) obj, tLObject));
                return;
            case 6:
                AndroidUtilities.runOnUIThread(new di.b7(7, (di.x8) obj, tLObject));
                return;
            case 7:
                AndroidUtilities.runOnUIThread(new di.b7(29, (fi.r4) obj, tL_error));
                return;
            case 8:
                hg.c cVar = (hg.c) obj;
                if (tLObject != null) {
                    AndroidUtilities.runOnUIThread(new fi.j4(4, cVar, tLObject));
                    return;
                }
                return;
            case 9:
                hg.i0 i0Var = (hg.i0) obj;
                i0Var.getClass();
                AndroidUtilities.runOnUIThread(new fi.j4(5, i0Var, tLObject));
                return;
            case 10:
                AndroidUtilities.runOnUIThread(new hg.t((ig.c) obj, tL_error, tLObject, 7));
                return;
            case 11:
                AndroidUtilities.runOnUIThread(new fi.j4(12, (ig.f) obj, tLObject));
                return;
            case 12:
                AndroidUtilities.runOnUIThread(new hg.t((ig.m) obj, tL_error, tLObject, 8));
                return;
            case 13:
                AndroidUtilities.runOnUIThread(new hg.t((ig.w0) obj, tL_error, tLObject, 12));
                return;
            case 14:
                AndroidUtilities.runOnUIThread(new hg.t((ig.g1) obj, tL_error, tLObject, 13));
                return;
            case 15:
                AndroidUtilities.runOnUIThread(new fi.j4(18, (ig.b2) obj, tLObject));
                return;
            case 16:
                AndroidUtilities.runOnUIThread(new fi.j4(25, (ji.x) obj, tLObject));
                return;
            case 17:
                AndroidUtilities.runOnUIThread(new ji.b5(0, (ji.d5) obj, tLObject));
                return;
            case 18:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.web.g1(4, (org.telegram.ui.web.h2) obj, tLObject));
                return;
            case 19:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.web.g1(25, (uf.c) obj, tLObject));
                return;
            case 20:
                AndroidUtilities.runOnUIThread(new er0((uf.d) obj, tLObject, tL_error, 24));
                return;
            case 21:
                ug.y0 y0Var = (ug.y0) obj;
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
                        f11Var = new l7(collator, 5);
                    } else {
                        f11Var = new f11(9);
                    }
                    Collections.sort(arrayList, f11Var);
                    for (List list2 : hashMap.values()) {
                        Collections.sort(list2, new Comparator() {
                            @Override
                            public final int compare(Object obj2, Object obj3) {
                                TLRPC.TL_help_country tL_help_country2 = (TLRPC.TL_help_country) obj2;
                                TLRPC.TL_help_country tL_help_country3 = (TLRPC.TL_help_country) obj3;
                                switch (r2) {
                                    case 0:
                                        return f11Var.compare(tL_help_country2.default_name, tL_help_country3.default_name);
                                    default:
                                        return f11Var.compare(tL_help_country2.default_name, tL_help_country3.default_name);
                                }
                            }
                        });
                    }
                    AndroidUtilities.runOnUIThread(new er0(y0Var, hashMap, arrayList, 25));
                    return;
                }
                return;
            case 22:
                org.telegram.ui.web.b1 b1Var = (org.telegram.ui.web.b1) obj;
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
                        f11Var2 = new l7(collator2, 5);
                    } else {
                        f11Var2 = new f11(9);
                    }
                    Collections.sort(arrayList2, f11Var2);
                    for (List list4 : hashMap2.values()) {
                        Collections.sort(list4, new Comparator() {
                            @Override
                            public final int compare(Object obj2, Object obj3) {
                                TLRPC.TL_help_country tL_help_country22 = (TLRPC.TL_help_country) obj2;
                                TLRPC.TL_help_country tL_help_country3 = (TLRPC.TL_help_country) obj3;
                                switch (r2) {
                                    case 0:
                                        return f11Var2.compare(tL_help_country22.default_name, tL_help_country3.default_name);
                                    default:
                                        return f11Var2.compare(tL_help_country22.default_name, tL_help_country3.default_name);
                                }
                            }
                        });
                    }
                    AndroidUtilities.runOnUIThread(new er0(b1Var, hashMap2, arrayList2, 28));
                    return;
                }
                return;
            case 23:
                AndroidUtilities.runOnUIThread(new ug.r(5, (ug.n1) obj, tLObject));
                return;
            case 24:
                AndroidUtilities.runOnUIThread(new wh.n((zh.g) obj, tLObject, tL_error, 6));
                return;
            case 25:
                AndroidUtilities.runOnUIThread(new ug.r(14, (zh.l) obj, tLObject));
                return;
            case 26:
                AndroidUtilities.runOnUIThread(new ug.r(15, (zh.m) obj, tLObject));
                return;
            case 27:
                AndroidUtilities.runOnUIThread(new ug.r(27, tLObject, (org.telegram.ui.web.b1) obj));
                return;
            case 28:
                AndroidUtilities.runOnUIThread(new ug.r(29, (zh.j5) obj, tLObject));
                return;
            default:
                zh.n8 n8Var = (zh.n8) obj;
                if (tLObject instanceof TLRPC.TL_boolTrue) {
                    MessagesStorage.getInstance(n8Var.f52337c).putMessages(new ArrayList<>(Arrays.asList(n8Var.K.messageOwner)), true, true, true, 0, 0, 0L);
                    return;
                } else {
                    n8Var.getClass();
                    return;
                }
        }
    }
}
