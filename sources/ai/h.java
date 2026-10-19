package ai;

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
import org.telegram.ui.Components.by0;
import org.telegram.ui.jg0;
public final class h implements RequestDelegate {
    public final int f1395a;
    public final Object f1396b;

    public h(Object obj, int i10) {
        this.f1395a = i10;
        this.f1396b = obj;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        final Comparator jg0Var;
        Locale locale;
        final Comparator jg0Var2;
        Locale locale2;
        int i10 = this.f1395a;
        Object obj = this.f1396b;
        switch (i10) {
            case 0:
                AndroidUtilities.runOnUIThread(new a3.l0((x) obj, tLObject, tL_error, 2));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new a1.f(13, (h0) obj, tLObject));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new a1.f(14, (i0) obj, tLObject));
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new a1.f(26, tLObject, (r0) obj));
                return;
            case 4:
                AndroidUtilities.runOnUIThread(new a1.f(28, (y9) obj, tLObject));
                return;
            case 5:
                le leVar = (le) obj;
                if (tLObject instanceof TLRPC.TL_boolTrue) {
                    MessagesStorage.getInstance(leVar.f1791c).putMessages(new ArrayList<>(Arrays.asList(leVar.L.messageOwner)), true, true, true, 0, 0, 0L);
                    return;
                } else {
                    leVar.getClass();
                    return;
                }
            case 6:
                AndroidUtilities.runOnUIThread(new androidx.fragment.app.d((ei.a9) obj, 16));
                return;
            case 7:
                AndroidUtilities.runOnUIThread(new pa(19, (ci.u6) obj, tLObject));
                return;
            case 8:
                AndroidUtilities.runOnUIThread(new pa(21, (ci.w6) obj, tLObject));
                return;
            case 9:
                AndroidUtilities.runOnUIThread(new ci.v7(24, (ei.t1) obj, tLObject));
                return;
            case 10:
                AndroidUtilities.runOnUIThread(new ei.p6(5, (ei.s7) obj, tLObject));
                return;
            case 11:
                AndroidUtilities.runOnUIThread(new ei.p6((ei.a8) obj, tLObject));
                return;
            case 12:
                AndroidUtilities.runOnUIThread(new ei.p6(7, (ei.j8) obj, tLObject));
                return;
            case 13:
                AndroidUtilities.runOnUIThread(new ei.p6(20, (gi.f4) obj, tL_error));
                return;
            case 14:
                hg.c cVar = (hg.c) obj;
                if (tLObject != null) {
                    AndroidUtilities.runOnUIThread(new ei.p6(23, cVar, tLObject));
                    return;
                }
                return;
            case 15:
                hg.h0 h0Var = (hg.h0) obj;
                h0Var.getClass();
                AndroidUtilities.runOnUIThread(new ei.p6(25, h0Var, tLObject));
                return;
            case 16:
                AndroidUtilities.runOnUIThread(new ei.z1((ig.c) obj, tL_error, tLObject, 23));
                return;
            case 17:
                AndroidUtilities.runOnUIThread(new hi.t(3, (ig.f) obj, tLObject));
                return;
            case 18:
                AndroidUtilities.runOnUIThread(new ei.z1((ig.m) obj, tL_error, tLObject, 24));
                return;
            case 19:
                AndroidUtilities.runOnUIThread(new ei.z1((ig.v0) obj, tL_error, tLObject, 28));
                return;
            case 20:
                AndroidUtilities.runOnUIThread(new ei.z1((ig.f1) obj, tL_error, tLObject, 29));
                return;
            case 21:
                AndroidUtilities.runOnUIThread(new hi.t(9, (ig.a2) obj, tLObject));
                return;
            case 22:
                AndroidUtilities.runOnUIThread(new hi.t(20, (ki.x) obj, tLObject));
                return;
            case 23:
                AndroidUtilities.runOnUIThread(new hi.t(25, (ki.a5) obj, tLObject));
                return;
            case 24:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Wallet.z3(28, (org.telegram.ui.web.f2) obj, tLObject));
                return;
            case 25:
                ug.w0 w0Var = (ug.w0) obj;
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
                        jg0Var = new u5(collator, 6);
                    } else {
                        jg0Var = new jg0(16);
                    }
                    Collections.sort(arrayList, jg0Var);
                    for (List list2 : hashMap.values()) {
                        Collections.sort(list2, new Comparator() {
                            @Override
                            public final int compare(Object obj2, Object obj3) {
                                TLRPC.TL_help_country tL_help_country2 = (TLRPC.TL_help_country) obj2;
                                TLRPC.TL_help_country tL_help_country3 = (TLRPC.TL_help_country) obj3;
                                switch (r2) {
                                    case 0:
                                        return jg0Var.compare(tL_help_country2.default_name, tL_help_country3.default_name);
                                    default:
                                        return jg0Var.compare(tL_help_country2.default_name, tL_help_country3.default_name);
                                }
                            }
                        });
                    }
                    AndroidUtilities.runOnUIThread(new by0(w0Var, hashMap, arrayList, 23));
                    return;
                }
                return;
            case 26:
                ig.l0 l0Var = (ig.l0) obj;
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
                        jg0Var2 = new u5(collator2, 6);
                    } else {
                        jg0Var2 = new jg0(16);
                    }
                    Collections.sort(arrayList2, jg0Var2);
                    for (List list4 : hashMap2.values()) {
                        Collections.sort(list4, new Comparator() {
                            @Override
                            public final int compare(Object obj2, Object obj3) {
                                TLRPC.TL_help_country tL_help_country22 = (TLRPC.TL_help_country) obj2;
                                TLRPC.TL_help_country tL_help_country3 = (TLRPC.TL_help_country) obj3;
                                switch (r2) {
                                    case 0:
                                        return jg0Var2.compare(tL_help_country22.default_name, tL_help_country3.default_name);
                                    default:
                                        return jg0Var2.compare(tL_help_country22.default_name, tL_help_country3.default_name);
                                }
                            }
                        });
                    }
                    AndroidUtilities.runOnUIThread(new by0(l0Var, hashMap2, arrayList2, 26));
                    return;
                }
                return;
            case 27:
                AndroidUtilities.runOnUIThread(new uf.c(7, (ug.m1) obj, tLObject));
                return;
            case 28:
                AndroidUtilities.runOnUIThread(new uf.c(9, (wf.c) obj, tLObject));
                return;
            default:
                AndroidUtilities.runOnUIThread(new by0((wf.d) obj, tLObject, tL_error, 27));
                return;
        }
    }
}
