package bf;

import android.os.Build;
import bg.g3;
import bg.i;
import bg.l0;
import bg.m2;
import e5.u;
import gh.a0;
import gh.jb;
import gh.n7;
import gh.r;
import gh.z;
import h3.g0;
import ih.g;
import ih.h6;
import ih.j6;
import ih.j7;
import j$.util.Objects;
import java.text.Collator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import kh.a8;
import kh.c9;
import kh.k8;
import kh.o8;
import kh.s7;
import kh.u1;
import mh.g4;
import of.f0;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.R;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ai1;
import org.telegram.ui.web.b2;
import pf.l;
import pf.o0;
import pf.r1;
import pf.y0;
import qh.r4;
import qh.v;
public final class a implements RequestDelegate {
    public final int f1668a;
    public final Object f1669b;

    public a(Object obj, int i9) {
        this.f1668a = i9;
        this.f1669b = obj;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        final Comparator eVar;
        Locale locale;
        final Comparator eVar2;
        Locale locale2;
        int i9 = this.f1668a;
        Object obj = this.f1669b;
        switch (i9) {
            case 0:
                AndroidUtilities.runOnUIThread(new a1.e(6, (d) obj, tLObject));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new androidx.car.app.utils.b((e) obj, tLObject, tL_error, 3));
                return;
            case 2:
                m2 m2Var = (m2) obj;
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
                        if (LocaleController.getInstance().getCurrentLocale() != null) {
                            locale = LocaleController.getInstance().getCurrentLocale();
                        } else {
                            locale = Locale.getDefault();
                        }
                        Collator collator = Collator.getInstance(locale);
                        Objects.requireNonNull(collator);
                        eVar = new l0(collator, 0);
                    } else {
                        eVar = new a5.e(10);
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
                    AndroidUtilities.runOnUIThread(new androidx.car.app.utils.b(m2Var, hashMap, arrayList, 4));
                    return;
                }
                return;
            case 3:
                i iVar = (i) obj;
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
                        eVar2 = new l0(collator2, 0);
                    } else {
                        eVar2 = new a5.e(10);
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
                    AndroidUtilities.runOnUIThread(new androidx.car.app.utils.b(iVar, hashMap2, arrayList2, 7));
                    return;
                }
                return;
            case 4:
                AndroidUtilities.runOnUIThread(new a1.e(16, (g3) obj, tLObject));
                return;
            case 5:
                AndroidUtilities.runOnUIThread(new androidx.car.app.utils.b((r) obj, tLObject, tL_error, 17));
                return;
            case 6:
                AndroidUtilities.runOnUIThread(new u(9, (z) obj, tLObject));
                return;
            case 7:
                AndroidUtilities.runOnUIThread(new u(10, (a0) obj, tLObject));
                return;
            case 8:
                AndroidUtilities.runOnUIThread(new u(22, tLObject, (i) obj));
                return;
            case 9:
                AndroidUtilities.runOnUIThread(new u(24, (n7) obj, tLObject));
                return;
            case 10:
                jb jbVar = (jb) obj;
                if (tLObject instanceof TLRPC.TL_boolTrue) {
                    MessagesStorage.getInstance(jbVar.f8369c).putMessages(new ArrayList<>(Arrays.asList(jbVar.G.messageOwner)), true, true, true, 0, 0, 0L);
                    return;
                } else {
                    jbVar.getClass();
                    return;
                }
            case 11:
                AndroidUtilities.runOnUIThread(new g((c9) obj, 10));
                return;
            case 12:
                AndroidUtilities.runOnUIThread(new g0(17, (h6) obj, tLObject));
                return;
            case 13:
                AndroidUtilities.runOnUIThread(new g0(19, (j6) obj, tLObject));
                return;
            case 14:
                AndroidUtilities.runOnUIThread(new j7(13, (u1) obj, tLObject));
                return;
            case 15:
                AndroidUtilities.runOnUIThread(new j7(24, (s7) obj, tLObject));
                return;
            case 16:
                AndroidUtilities.runOnUIThread(new j7(25, (a8) obj, tLObject));
                return;
            case 17:
                AndroidUtilities.runOnUIThread(new j7(26, (k8) obj, tLObject));
                return;
            case 18:
                AndroidUtilities.runOnUIThread(new o8(9, (g4) obj, tL_error));
                return;
            case 19:
                of.c cVar = (of.c) obj;
                if (tLObject != null) {
                    AndroidUtilities.runOnUIThread(new o8(13, cVar, tLObject));
                    return;
                }
                return;
            case 20:
                f0 f0Var = (f0) obj;
                f0Var.getClass();
                AndroidUtilities.runOnUIThread(new o8(14, f0Var, tLObject));
                return;
            case 21:
                AndroidUtilities.runOnUIThread(new ai1(9, (b2) obj, tLObject));
                return;
            case 22:
                AndroidUtilities.runOnUIThread(new pf.a((Object) ((pf.d) obj), (Object) tL_error, (Object) tLObject, 0));
                return;
            case 23:
                AndroidUtilities.runOnUIThread(new ai1(12, (pf.g) obj, tLObject));
                return;
            case 24:
                AndroidUtilities.runOnUIThread(new pf.a((Object) ((l) obj), (Object) tL_error, (Object) tLObject, 1));
                return;
            case 25:
                AndroidUtilities.runOnUIThread(new pf.a((Object) ((o0) obj), (Object) tL_error, (Object) tLObject, 5));
                return;
            case 26:
                AndroidUtilities.runOnUIThread(new pf.a((Object) ((y0) obj), (Object) tL_error, (Object) tLObject, 6));
                return;
            case 27:
                AndroidUtilities.runOnUIThread(new ai1(18, (r1) obj, tLObject));
                return;
            case 28:
                AndroidUtilities.runOnUIThread(new ai1(20, (v) obj, tLObject));
                return;
            default:
                AndroidUtilities.runOnUIThread(new ai1(25, (r4) obj, tLObject));
                return;
        }
    }
}
