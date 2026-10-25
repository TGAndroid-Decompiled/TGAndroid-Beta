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
import org.telegram.ui.Components.ny0;
import org.telegram.ui.bv;
public final class i0 implements RequestDelegate {
    public final int f4807a;
    public final Object f4808b;

    public i0(Object obj, int i10) {
        this.f4807a = i10;
        this.f4808b = obj;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        final Comparator bvVar;
        Locale locale;
        final Comparator bvVar2;
        Locale locale2;
        int i10 = this.f4807a;
        Object obj = this.f4808b;
        switch (i10) {
            case 0:
                AndroidUtilities.runOnUIThread(new a1.f(27, (j0) obj, tLObject));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new a1.f(28, (k0) obj, tLObject));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new f2(10, tLObject, (ai.i) obj));
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new f2(12, (t9) obj, tLObject));
                return;
            case 4:
                be beVar = (be) obj;
                if (tLObject instanceof TLRPC.TL_boolTrue) {
                    MessagesStorage.getInstance(beVar.f4400c).putMessages(new ArrayList<>(Arrays.asList(beVar.L.messageOwner)), true, true, true, 0, 0, 0L);
                    return;
                } else {
                    beVar.getClass();
                    return;
                }
            case 5:
                AndroidUtilities.runOnUIThread(new u6((fi.w8) obj, 23));
                return;
            case 6:
                AndroidUtilities.runOnUIThread(new di.b4(3, (di.t6) obj, tLObject));
                return;
            case 7:
                AndroidUtilities.runOnUIThread(new di.b4(5, (di.v6) obj, tLObject));
                return;
            case 8:
                AndroidUtilities.runOnUIThread(new e2.q0(5, (fi.s1) obj, tLObject));
                return;
            case 9:
                AndroidUtilities.runOnUIThread(new e2.q0(15, (fi.o7) obj, tLObject));
                return;
            case 10:
                AndroidUtilities.runOnUIThread(new e2.q0(17, (fi.w7) obj, tLObject));
                return;
            case 11:
                AndroidUtilities.runOnUIThread(new e2.q0(18, (fi.f8) obj, tLObject));
                return;
            case 12:
                AndroidUtilities.runOnUIThread(new hi.u2(3, (hi.o4) obj, tL_error));
                return;
            case 13:
                ig.c cVar = (ig.c) obj;
                if (tLObject != null) {
                    AndroidUtilities.runOnUIThread(new hi.u2(7, cVar, tLObject));
                    return;
                }
                return;
            case 14:
                ig.i0 i0Var = (ig.i0) obj;
                i0Var.getClass();
                AndroidUtilities.runOnUIThread(new hi.u2(9, i0Var, tLObject));
                return;
            case 15:
                AndroidUtilities.runOnUIThread(new e2.m0((jg.c) obj, tL_error, tLObject, 24));
                return;
            case 16:
                AndroidUtilities.runOnUIThread(new hi.u2(20, (jg.f) obj, tLObject));
                return;
            case 17:
                AndroidUtilities.runOnUIThread(new e2.m0((jg.n) obj, tL_error, tLObject, 25));
                return;
            case 18:
                AndroidUtilities.runOnUIThread(new e2.m0((jg.v0) obj, tL_error, tLObject, 29));
                return;
            case 19:
                AndroidUtilities.runOnUIThread(new jg.f1((Object) ((jg.h1) obj), (Object) tL_error, (Object) tLObject, 0));
                return;
            case 20:
                AndroidUtilities.runOnUIThread(new hi.u2(26, (jg.c2) obj, tLObject));
                return;
            case 21:
                AndroidUtilities.runOnUIThread(new k2.e0(2, (li.w) obj, tLObject));
                return;
            case 22:
                AndroidUtilities.runOnUIThread(new k2.e0(7, (li.a5) obj, tLObject));
                return;
            case 23:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Wallet.q6(18, (org.telegram.ui.web.f2) obj, tLObject));
                return;
            case 24:
                vg.x0 x0Var = (vg.x0) obj;
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
                        bvVar = new p5(collator, 6);
                    } else {
                        bvVar = new bv(20);
                    }
                    Collections.sort(arrayList, bvVar);
                    for (List list2 : hashMap.values()) {
                        Collections.sort(list2, new Comparator() {
                            @Override
                            public final int compare(Object obj2, Object obj3) {
                                TLRPC.TL_help_country tL_help_country2 = (TLRPC.TL_help_country) obj2;
                                TLRPC.TL_help_country tL_help_country3 = (TLRPC.TL_help_country) obj3;
                                switch (r2) {
                                    case 0:
                                        return bvVar.compare(tL_help_country2.default_name, tL_help_country3.default_name);
                                    default:
                                        return bvVar.compare(tL_help_country2.default_name, tL_help_country3.default_name);
                                }
                            }
                        });
                    }
                    AndroidUtilities.runOnUIThread(new ny0(x0Var, hashMap, arrayList, 20));
                    return;
                }
                return;
            case 25:
                ig.o oVar = (ig.o) obj;
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
                        bvVar2 = new p5(collator2, 6);
                    } else {
                        bvVar2 = new bv(20);
                    }
                    Collections.sort(arrayList2, bvVar2);
                    for (List list4 : hashMap2.values()) {
                        Collections.sort(list4, new Comparator() {
                            @Override
                            public final int compare(Object obj2, Object obj3) {
                                TLRPC.TL_help_country tL_help_country22 = (TLRPC.TL_help_country) obj2;
                                TLRPC.TL_help_country tL_help_country3 = (TLRPC.TL_help_country) obj3;
                                switch (r2) {
                                    case 0:
                                        return bvVar2.compare(tL_help_country22.default_name, tL_help_country3.default_name);
                                    default:
                                        return bvVar2.compare(tL_help_country22.default_name, tL_help_country3.default_name);
                                }
                            }
                        });
                    }
                    AndroidUtilities.runOnUIThread(new ny0(oVar, hashMap2, arrayList2, 23));
                    return;
                }
                return;
            case 26:
                AndroidUtilities.runOnUIThread(new sg.u(25, (vg.n1) obj, tLObject));
                return;
            case 27:
                AndroidUtilities.runOnUIThread(new vi.i0(2, (xf.c) obj, tLObject));
                return;
            default:
                AndroidUtilities.runOnUIThread(new ny0((xf.d) obj, tLObject, tL_error, 27));
                return;
        }
    }
}
