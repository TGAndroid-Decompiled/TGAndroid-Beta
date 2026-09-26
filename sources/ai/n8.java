package ai;

import android.os.Build;
import j$.util.Objects;
import java.io.Serializable;
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
import org.telegram.ui.Components.cn0;
import org.telegram.ui.db1;
public final class n8 implements RequestDelegate {
    public final int f1303a;
    public final Object f1304b;

    public n8(Object obj, int i10) {
        this.f1303a = i10;
        this.f1304b = obj;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        final Comparator db1Var;
        Locale locale;
        final Comparator db1Var2;
        Locale locale2;
        int i10 = this.f1303a;
        Object obj = this.f1304b;
        switch (i10) {
            case 0:
                AndroidUtilities.runOnUIThread(new a3.d((ci.m9) obj, 12));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new a1.e(15, (v8) obj, tLObject));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new a1.e(17, (x8) obj, tLObject));
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new ba(15, (ci.w1) obj, tLObject));
                return;
            case 4:
                AndroidUtilities.runOnUIThread(new ba(26, (ci.d8) obj, tLObject));
                return;
            case 5:
                AndroidUtilities.runOnUIThread(new ba(27, (ci.l8) obj, tLObject));
                return;
            case 6:
                AndroidUtilities.runOnUIThread(new ba(28, (ci.u8) obj, tLObject));
                return;
            case 7:
                AndroidUtilities.runOnUIThread(new ci.y8(21, (ei.q4) obj, tL_error));
                return;
            case 8:
                gg.c cVar = (gg.c) obj;
                if (tLObject != null) {
                    AndroidUtilities.runOnUIThread(new ci.y8(25, cVar, tLObject));
                    return;
                }
                return;
            case 9:
                gg.i0 i0Var = (gg.i0) obj;
                i0Var.getClass();
                AndroidUtilities.runOnUIThread(new ci.y8(26, i0Var, tLObject));
                return;
            case 10:
                AndroidUtilities.runOnUIThread(new gg.t((hg.d) obj, tL_error, tLObject, 5));
                return;
            case 11:
                AndroidUtilities.runOnUIThread(new gg.x1(2, (hg.g) obj, tLObject));
                return;
            case 12:
                AndroidUtilities.runOnUIThread(new gg.t((hg.n) obj, tL_error, tLObject, 6));
                return;
            case 13:
                AndroidUtilities.runOnUIThread(new gg.t((hg.x0) obj, tL_error, tLObject, 10));
                return;
            case 14:
                AndroidUtilities.runOnUIThread(new gg.t((hg.h1) obj, tL_error, tLObject, 11));
                return;
            case 15:
                AndroidUtilities.runOnUIThread(new gg.x1(8, (hg.c2) obj, tLObject));
                return;
            case 16:
                AndroidUtilities.runOnUIThread(new gg.x1(12, (ii.x) obj, tLObject));
                return;
            case 17:
                AndroidUtilities.runOnUIThread(new gg.x1(17, (ii.b5) obj, tLObject));
                return;
            case 18:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.web.o1((org.telegram.ui.web.g2) obj, tLObject, 3));
                return;
            case 19:
                tg.x0 x0Var = (tg.x0) obj;
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
                        db1Var = new e8(collator, 5);
                    } else {
                        db1Var = new db1(7);
                    }
                    Collections.sort(arrayList, db1Var);
                    for (List list2 : hashMap.values()) {
                        Collections.sort(list2, new Comparator() {
                            @Override
                            public final int compare(Object obj2, Object obj3) {
                                TLRPC.TL_help_country tL_help_country2 = (TLRPC.TL_help_country) obj2;
                                TLRPC.TL_help_country tL_help_country3 = (TLRPC.TL_help_country) obj3;
                                switch (r2) {
                                    case 0:
                                        return db1Var.compare(tL_help_country2.default_name, tL_help_country3.default_name);
                                    default:
                                        return db1Var.compare(tL_help_country2.default_name, tL_help_country3.default_name);
                                }
                            }
                        });
                    }
                    AndroidUtilities.runOnUIThread(new cn0((Object) x0Var, (Serializable) hashMap, arrayList, 27));
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
                        db1Var2 = new e8(collator2, 5);
                    } else {
                        db1Var2 = new db1(7);
                    }
                    Collections.sort(arrayList2, db1Var2);
                    for (List list4 : hashMap2.values()) {
                        Collections.sort(list4, new Comparator() {
                            @Override
                            public final int compare(Object obj2, Object obj3) {
                                TLRPC.TL_help_country tL_help_country22 = (TLRPC.TL_help_country) obj2;
                                TLRPC.TL_help_country tL_help_country3 = (TLRPC.TL_help_country) obj3;
                                switch (r2) {
                                    case 0:
                                        return db1Var2.compare(tL_help_country22.default_name, tL_help_country3.default_name);
                                    default:
                                        return db1Var2.compare(tL_help_country22.default_name, tL_help_country3.default_name);
                                }
                            }
                        });
                    }
                    AndroidUtilities.runOnUIThread(new tg.r(q1Var, hashMap2, arrayList2, 0));
                    return;
                }
                return;
            case 21:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.web.o1(28, (tg.m1) obj, tLObject));
                return;
            case 22:
                AndroidUtilities.runOnUIThread(new u2.p0(1, (uf.c) obj, tLObject));
                return;
            case 23:
                AndroidUtilities.runOnUIThread(new tg.r((uf.d) obj, tLObject, tL_error, 1));
                return;
            case 24:
                AndroidUtilities.runOnUIThread(new tg.r((yh.g) obj, tLObject, tL_error, 9));
                return;
            case 25:
                AndroidUtilities.runOnUIThread(new u2.p0(13, (yh.l) obj, tLObject));
                return;
            case 26:
                AndroidUtilities.runOnUIThread(new u2.p0(14, (yh.m) obj, tLObject));
                return;
            case 27:
                AndroidUtilities.runOnUIThread(new u2.p0(26, tLObject, (ii.q1) obj));
                return;
            case 28:
                AndroidUtilities.runOnUIThread(new u2.p0(28, (yh.k5) obj, tLObject));
                return;
            default:
                yh.o8 o8Var = (yh.o8) obj;
                if (tLObject instanceof TLRPC.TL_boolTrue) {
                    MessagesStorage.getInstance(o8Var.f47846c).putMessages(new ArrayList<>(Arrays.asList(o8Var.K.messageOwner)), true, true, true, 0, 0, 0L);
                    return;
                } else {
                    o8Var.getClass();
                    return;
                }
        }
    }
}
