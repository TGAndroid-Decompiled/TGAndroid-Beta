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
import org.telegram.ui.Components.sx0;
public final class c2 implements RequestDelegate {
    public final int f2399a;
    public final Object f2400b;

    public c2(Object obj, int i10) {
        this.f2399a = i10;
        this.f2400b = obj;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        final Comparator pVar;
        Locale locale;
        final Comparator pVar2;
        Locale locale2;
        int i10 = this.f2399a;
        Object obj = this.f2400b;
        switch (i10) {
            case 0:
                AndroidUtilities.runOnUIThread(new a1.e(11, (h2) obj, tLObject));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new a1.e(22, (i9) obj, tLObject));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new a1.e(23, (r9) obj, tLObject));
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new a1.e(24, (aa) obj, tLObject));
                return;
            case 4:
                AndroidUtilities.runOnUIThread(new af(15, (di.u4) obj, tL_error));
                return;
            case 5:
                fg.c cVar = (fg.c) obj;
                if (tLObject != null) {
                    AndroidUtilities.runOnUIThread(new af(26, cVar, tLObject));
                    return;
                }
                return;
            case 6:
                fg.h0 h0Var = (fg.h0) obj;
                h0Var.getClass();
                AndroidUtilities.runOnUIThread(new af(27, h0Var, tLObject));
                return;
            case 7:
                AndroidUtilities.runOnUIThread(new a3.k0((gg.c) obj, tL_error, tLObject, 27));
                return;
            case 8:
                AndroidUtilities.runOnUIThread(new fg.s1(2, (gg.f) obj, tLObject));
                return;
            case 9:
                AndroidUtilities.runOnUIThread(new a3.k0((gg.n) obj, tL_error, tLObject, 28));
                return;
            case 10:
                AndroidUtilities.runOnUIThread(new gg.a0((gg.a1) obj, tL_error, tLObject, 2));
                return;
            case 11:
                AndroidUtilities.runOnUIThread(new gg.a0((gg.m1) obj, tL_error, tLObject, 3));
                return;
            case 12:
                AndroidUtilities.runOnUIThread(new fg.s1(8, (gg.k2) obj, tLObject));
                return;
            case 13:
                AndroidUtilities.runOnUIThread(new fg.s1(11, (hi.y) obj, tLObject));
                return;
            case 14:
                AndroidUtilities.runOnUIThread(new fg.s1(16, (hi.d5) obj, tLObject));
                return;
            case 15:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.web.x1(1, (org.telegram.ui.web.i2) obj, tLObject));
                return;
            case 16:
                sg.z0 z0Var = (sg.z0) obj;
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
                        pVar = new q3(collator, 4);
                    } else {
                        pVar = new sg.p(0);
                    }
                    Collections.sort(arrayList, pVar);
                    for (List list2 : hashMap.values()) {
                        Collections.sort(list2, new Comparator() {
                            @Override
                            public final int compare(Object obj2, Object obj3) {
                                TLRPC.TL_help_country tL_help_country2 = (TLRPC.TL_help_country) obj2;
                                TLRPC.TL_help_country tL_help_country3 = (TLRPC.TL_help_country) obj3;
                                switch (r2) {
                                    case 0:
                                        return pVar.compare(tL_help_country2.default_name, tL_help_country3.default_name);
                                    default:
                                        return pVar.compare(tL_help_country2.default_name, tL_help_country3.default_name);
                                }
                            }
                        });
                    }
                    AndroidUtilities.runOnUIThread(new sx0(z0Var, hashMap, arrayList, 16));
                    return;
                }
                return;
            case 17:
                org.telegram.ui.web.y1 y1Var = (org.telegram.ui.web.y1) obj;
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
                        pVar2 = new q3(collator2, 4);
                    } else {
                        pVar2 = new sg.p(0);
                    }
                    Collections.sort(arrayList2, pVar2);
                    for (List list4 : hashMap2.values()) {
                        Collections.sort(list4, new Comparator() {
                            @Override
                            public final int compare(Object obj2, Object obj3) {
                                TLRPC.TL_help_country tL_help_country22 = (TLRPC.TL_help_country) obj2;
                                TLRPC.TL_help_country tL_help_country3 = (TLRPC.TL_help_country) obj3;
                                switch (r2) {
                                    case 0:
                                        return pVar2.compare(tL_help_country22.default_name, tL_help_country3.default_name);
                                    default:
                                        return pVar2.compare(tL_help_country22.default_name, tL_help_country3.default_name);
                                }
                            }
                        });
                    }
                    AndroidUtilities.runOnUIThread(new sx0(y1Var, hashMap2, arrayList2, 19));
                    return;
                }
                return;
            case 18:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.web.x1(24, (sg.p1) obj, tLObject));
                return;
            case 19:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.web.x1(25, (tf.c) obj, tLObject));
                return;
            case 20:
                AndroidUtilities.runOnUIThread(new sx0((Object) ((tf.d) obj), tLObject, (Object) tL_error, 20));
                return;
            case 21:
                AndroidUtilities.runOnUIThread(new sx0((Object) ((xh.h) obj), tLObject, (Object) tL_error, 28));
                return;
            case 22:
                AndroidUtilities.runOnUIThread(new u2.k0(9, (xh.m) obj, tLObject));
                return;
            case 23:
                AndroidUtilities.runOnUIThread(new u2.k0(10, (xh.n) obj, tLObject));
                return;
            case 24:
                AndroidUtilities.runOnUIThread(new u2.k0(22, tLObject, (org.telegram.ui.web.y1) obj));
                return;
            case 25:
                AndroidUtilities.runOnUIThread(new u2.k0(24, (xh.n5) obj, tLObject));
                return;
            case 26:
                xh.r8 r8Var = (xh.r8) obj;
                if (tLObject instanceof TLRPC.TL_boolTrue) {
                    MessagesStorage.getInstance(r8Var.f45989c).putMessages(new ArrayList<>(Arrays.asList(r8Var.K.messageOwner)), true, true, true, 0, 0, 0L);
                    return;
                } else {
                    r8Var.getClass();
                    return;
                }
            case 27:
                AndroidUtilities.runOnUIThread(new xh.x((sa) obj, 28));
                return;
            case 28:
                AndroidUtilities.runOnUIThread(new yg.q(14, (zh.u4) obj, tLObject));
                return;
            default:
                AndroidUtilities.runOnUIThread(new yg.q(16, (zh.w4) obj, tLObject));
                return;
        }
    }
}
