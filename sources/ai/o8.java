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
import org.telegram.ui.lb1;
public final class o8 implements RequestDelegate {
    public final int f1536a;
    public final Object f1537b;

    public o8(Object obj, int i10) {
        this.f1536a = i10;
        this.f1537b = obj;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        final Comparator lb1Var;
        Locale locale;
        final Comparator lb1Var2;
        Locale locale2;
        int i10 = this.f1536a;
        Object obj = this.f1537b;
        switch (i10) {
            case 0:
                AndroidUtilities.runOnUIThread(new a3.d((ci.m9) obj, 12));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new a1.f(15, (w8) obj, tLObject));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new a1.f(17, (y8) obj, tLObject));
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new ca(15, (ci.v1) obj, tLObject));
                return;
            case 4:
                AndroidUtilities.runOnUIThread(new ca(26, (ci.d8) obj, tLObject));
                return;
            case 5:
                AndroidUtilities.runOnUIThread(new ca(27, (ci.l8) obj, tLObject));
                return;
            case 6:
                AndroidUtilities.runOnUIThread(new ca(28, (ci.u8) obj, tLObject));
                return;
            case 7:
                AndroidUtilities.runOnUIThread(new ci.y8(21, (ei.p4) obj, tL_error));
                return;
            case 8:
                gg.c cVar = (gg.c) obj;
                if (tLObject != null) {
                    AndroidUtilities.runOnUIThread(new ci.y8(25, cVar, tLObject));
                    return;
                }
                return;
            case 9:
                gg.h0 h0Var = (gg.h0) obj;
                h0Var.getClass();
                AndroidUtilities.runOnUIThread(new ci.y8(27, h0Var, tLObject));
                return;
            case 10:
                AndroidUtilities.runOnUIThread(new gg.t((hg.d) obj, tL_error, tLObject, 5));
                return;
            case 11:
                AndroidUtilities.runOnUIThread(new gg.w1(2, (hg.g) obj, tLObject));
                return;
            case 12:
                AndroidUtilities.runOnUIThread(new gg.t((hg.n) obj, tL_error, tLObject, 6));
                return;
            case 13:
                AndroidUtilities.runOnUIThread(new gg.t((hg.w0) obj, tL_error, tLObject, 10));
                return;
            case 14:
                AndroidUtilities.runOnUIThread(new gg.t((hg.g1) obj, tL_error, tLObject, 11));
                return;
            case 15:
                AndroidUtilities.runOnUIThread(new gg.w1(8, (hg.c2) obj, tLObject));
                return;
            case 16:
                AndroidUtilities.runOnUIThread(new gg.w1(12, (ii.x) obj, tLObject));
                return;
            case 17:
                AndroidUtilities.runOnUIThread(new gg.w1(17, (ii.c5) obj, tLObject));
                return;
            case 18:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.web.f2(0, (org.telegram.ui.web.g2) obj, tLObject));
                return;
            case 19:
                tg.w0 w0Var = (tg.w0) obj;
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
                        lb1Var = new f8(collator, 5);
                    } else {
                        lb1Var = new lb1(9);
                    }
                    Collections.sort(arrayList, lb1Var);
                    for (List list2 : hashMap.values()) {
                        Collections.sort(list2, new Comparator() {
                            @Override
                            public final int compare(Object obj2, Object obj3) {
                                TLRPC.TL_help_country tL_help_country2 = (TLRPC.TL_help_country) obj2;
                                TLRPC.TL_help_country tL_help_country3 = (TLRPC.TL_help_country) obj3;
                                switch (r2) {
                                    case 0:
                                        return lb1Var.compare(tL_help_country2.default_name, tL_help_country3.default_name);
                                    default:
                                        return lb1Var.compare(tL_help_country2.default_name, tL_help_country3.default_name);
                                }
                            }
                        });
                    }
                    AndroidUtilities.runOnUIThread(new pi.h(w0Var, hashMap, arrayList, 1));
                    return;
                }
                return;
            case 20:
                ii.q1 q1Var = (ii.q1) obj;
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
                        lb1Var2 = new f8(collator2, 5);
                    } else {
                        lb1Var2 = new lb1(9);
                    }
                    Collections.sort(arrayList2, lb1Var2);
                    for (List list4 : hashMap2.values()) {
                        Collections.sort(list4, new Comparator() {
                            @Override
                            public final int compare(Object obj2, Object obj3) {
                                TLRPC.TL_help_country tL_help_country22 = (TLRPC.TL_help_country) obj2;
                                TLRPC.TL_help_country tL_help_country3 = (TLRPC.TL_help_country) obj3;
                                switch (r2) {
                                    case 0:
                                        return lb1Var2.compare(tL_help_country22.default_name, tL_help_country3.default_name);
                                    default:
                                        return lb1Var2.compare(tL_help_country22.default_name, tL_help_country3.default_name);
                                }
                            }
                        });
                    }
                    AndroidUtilities.runOnUIThread(new pi.h(q1Var, hashMap2, arrayList2, 4));
                    return;
                }
                return;
            case 21:
                AndroidUtilities.runOnUIThread(new tg.c1(0, (tg.m1) obj, tLObject));
                return;
            case 22:
                AndroidUtilities.runOnUIThread(new tg.c1(4, (vf.c) obj, tLObject));
                return;
            case 23:
                AndroidUtilities.runOnUIThread(new pi.h((vf.d) obj, tLObject, tL_error, 5));
                return;
            case 24:
                AndroidUtilities.runOnUIThread(new pi.h((yh.g) obj, tLObject, tL_error, 13));
                return;
            case 25:
                AndroidUtilities.runOnUIThread(new tg.c1(15, (yh.l) obj, tLObject));
                return;
            case 26:
                AndroidUtilities.runOnUIThread(new tg.c1(16, (yh.m) obj, tLObject));
                return;
            case 27:
                AndroidUtilities.runOnUIThread(new tg.c1(tLObject, (ii.q1) obj));
                return;
            case 28:
                AndroidUtilities.runOnUIThread(new yh.e5(0, (yh.f5) obj, tLObject));
                return;
            default:
                yh.h8 h8Var = (yh.h8) obj;
                if (tLObject instanceof TLRPC.TL_boolTrue) {
                    MessagesStorage.getInstance(h8Var.f52737c).putMessages(new ArrayList<>(Arrays.asList(h8Var.L.messageOwner)), true, true, true, 0, 0, 0L);
                    return;
                } else {
                    h8Var.getClass();
                    return;
                }
        }
    }
}
