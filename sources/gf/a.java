package gf;

import android.os.Build;
import cg.h0;
import d4.t;
import gg.c2;
import gg.v2;
import j$.util.Objects;
import java.text.Collator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import lh.eb;
import lh.l7;
import lh.n2;
import lh.q;
import lh.y;
import lh.z;
import nh.f6;
import nh.h6;
import nh.n4;
import nh.n5;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.R;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.kg1;
import org.telegram.ui.web.e2;
import ph.d7;
import ph.g1;
import ph.m6;
import ph.r7;
import ph.u6;
import rh.o3;
import tf.h1;
import uf.k;
import uf.m0;
import uf.p1;
import uf.v0;
import uf.x0;
import vh.u4;
import vh.v;
public final class a implements RequestDelegate {
    public final int f6529a;
    public final Object f6530b;

    public a(Object obj, int i10) {
        this.f6529a = i10;
        this.f6530b = obj;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        final Comparator fVar;
        Locale locale;
        final Comparator fVar2;
        Locale locale2;
        int i10 = this.f6529a;
        Object obj = this.f6530b;
        switch (i10) {
            case 0:
                AndroidUtilities.runOnUIThread(new a1.e(29, (e) obj, tLObject));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new androidx.car.app.utils.b((f) obj, tLObject, tL_error, 4));
                return;
            case 2:
                c2 c2Var = (c2) obj;
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
                        fVar = new t(collator, 2);
                    } else {
                        fVar = new e5.f(13);
                    }
                    Collections.sort(arrayList, fVar);
                    for (List list2 : hashMap.values()) {
                        Collections.sort(list2, new Comparator() {
                            @Override
                            public final int compare(Object obj2, Object obj3) {
                                TLRPC.TL_help_country tL_help_country2 = (TLRPC.TL_help_country) obj2;
                                TLRPC.TL_help_country tL_help_country3 = (TLRPC.TL_help_country) obj3;
                                switch (r2) {
                                    case 0:
                                        return fVar.compare(tL_help_country2.default_name, tL_help_country3.default_name);
                                    default:
                                        return fVar.compare(tL_help_country2.default_name, tL_help_country3.default_name);
                                }
                            }
                        });
                    }
                    AndroidUtilities.runOnUIThread(new androidx.car.app.utils.b(c2Var, hashMap, arrayList, 5));
                    return;
                }
                return;
            case 3:
                h0 h0Var = (h0) obj;
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
                        fVar2 = new t(collator2, 2);
                    } else {
                        fVar2 = new e5.f(13);
                    }
                    Collections.sort(arrayList2, fVar2);
                    for (List list4 : hashMap2.values()) {
                        Collections.sort(list4, new Comparator() {
                            @Override
                            public final int compare(Object obj2, Object obj3) {
                                TLRPC.TL_help_country tL_help_country22 = (TLRPC.TL_help_country) obj2;
                                TLRPC.TL_help_country tL_help_country3 = (TLRPC.TL_help_country) obj3;
                                switch (r2) {
                                    case 0:
                                        return fVar2.compare(tL_help_country22.default_name, tL_help_country3.default_name);
                                    default:
                                        return fVar2.compare(tL_help_country22.default_name, tL_help_country3.default_name);
                                }
                            }
                        });
                    }
                    AndroidUtilities.runOnUIThread(new androidx.car.app.utils.b(h0Var, hashMap2, arrayList2, 8));
                    return;
                }
                return;
            case 4:
                AndroidUtilities.runOnUIThread(new c(9, (v2) obj, tLObject));
                return;
            case 5:
                AndroidUtilities.runOnUIThread(new androidx.car.app.utils.b((q) obj, tLObject, tL_error, 20));
                return;
            case 6:
                AndroidUtilities.runOnUIThread(new c(27, (y) obj, tLObject));
                return;
            case 7:
                AndroidUtilities.runOnUIThread(new c(28, (z) obj, tLObject));
                return;
            case 8:
                AndroidUtilities.runOnUIThread(new n2(10, tLObject, (h0) obj));
                return;
            case 9:
                AndroidUtilities.runOnUIThread(new n2(12, (l7) obj, tLObject));
                return;
            case 10:
                eb ebVar = (eb) obj;
                if (tLObject instanceof TLRPC.TL_boolTrue) {
                    MessagesStorage.getInstance(ebVar.f12381c).putMessages(new ArrayList<>(Arrays.asList(ebVar.H.messageOwner)), true, true, true, 0, 0, 0L);
                    return;
                } else {
                    ebVar.getClass();
                    return;
                }
            case 11:
                AndroidUtilities.runOnUIThread(new n5((r7) obj, 1));
                return;
            case 12:
                AndroidUtilities.runOnUIThread(new n4(2, (f6) obj, tLObject));
                return;
            case 13:
                AndroidUtilities.runOnUIThread(new n4(4, (h6) obj, tLObject));
                return;
            case 14:
                AndroidUtilities.runOnUIThread(new kg1(15, (e2) obj, tLObject));
                return;
            case 15:
                AndroidUtilities.runOnUIThread(new kg1(19, (g1) obj, tLObject));
                return;
            case 16:
                AndroidUtilities.runOnUIThread(new ph.f6(0, (m6) obj, tLObject));
                return;
            case 17:
                AndroidUtilities.runOnUIThread(new ph.f6(1, (u6) obj, tLObject));
                return;
            case 18:
                AndroidUtilities.runOnUIThread(new ph.f6(2, (d7) obj, tLObject));
                return;
            case 19:
                AndroidUtilities.runOnUIThread(new ph.f6(16, (o3) obj, tL_error));
                return;
            case 20:
                tf.c cVar = (tf.c) obj;
                if (tLObject != null) {
                    AndroidUtilities.runOnUIThread(new ph.f6(20, cVar, tLObject));
                    return;
                }
                return;
            case 21:
                tf.z zVar = (tf.z) obj;
                zVar.getClass();
                AndroidUtilities.runOnUIThread(new ph.f6(21, zVar, tLObject));
                return;
            case 22:
                AndroidUtilities.runOnUIThread(new h1((uf.c) obj, tL_error, tLObject, 2));
                return;
            case 23:
                AndroidUtilities.runOnUIThread(new ph.f6(27, (uf.f) obj, tLObject));
                return;
            case 24:
                AndroidUtilities.runOnUIThread(new h1((k) obj, tL_error, tLObject, 3));
                return;
            case 25:
                AndroidUtilities.runOnUIThread(new h1((m0) obj, tL_error, tLObject, 7));
                return;
            case 26:
                AndroidUtilities.runOnUIThread(new h1((x0) obj, tL_error, tLObject, 8));
                return;
            case 27:
                AndroidUtilities.runOnUIThread(new v0(3, (p1) obj, tLObject));
                return;
            case 28:
                AndroidUtilities.runOnUIThread(new v0(5, (v) obj, tLObject));
                return;
            default:
                AndroidUtilities.runOnUIThread(new v0(10, (u4) obj, tLObject));
                return;
        }
    }
}
