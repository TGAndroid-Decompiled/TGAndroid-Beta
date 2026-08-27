package cf;

import a5.f;
import ag.h;
import ag.n0;
import android.os.Build;
import cg.f2;
import cg.y2;
import d5.u;
import hh.a0;
import hh.jb;
import hh.m5;
import hh.m7;
import hh.r;
import hh.y9;
import hh.z;
import j$.util.Objects;
import java.text.Collator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import jh.d6;
import jh.f6;
import jh.p6;
import lh.j8;
import lh.k7;
import lh.r7;
import lh.s1;
import lh.z7;
import lh.z8;
import nh.e4;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.R;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.web.c2;
import org.telegram.ui.zh1;
import qf.q1;
import rh.o2;
import rh.s4;
import rh.v;

public final class a implements RequestDelegate {

    public final int f2572a;

    public final Object f2573b;

    public a(Object obj, int i10) {
        this.f2572a = i10;
        this.f2573b = obj;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        final Comparator fVar;
        final Comparator fVar2;
        int i10 = this.f2572a;
        int i11 = 3;
        int i12 = 26;
        int i13 = 19;
        int i14 = 2;
        int i15 = 18;
        int i16 = 24;
        final int i17 = 0;
        final int i18 = 1;
        Object obj = this.f2573b;
        switch (i10) {
            case 0:
                AndroidUtilities.runOnUIThread(new a1.e(16, (d) obj, tLObject));
                break;
            case 1:
                AndroidUtilities.runOnUIThread(new androidx.car.app.utils.a((e) obj, tLObject, tL_error, i11));
                break;
            case 2:
                f2 f2Var = (f2) obj;
                if (tLObject != null) {
                    TLRPC.TL_help_countriesList tL_help_countriesList = (TLRPC.TL_help_countriesList) tLObject;
                    HashMap map = new HashMap();
                    ArrayList arrayList = new ArrayList();
                    for (int i19 = 0; i19 < tL_help_countriesList.countries.size(); i19++) {
                        TLRPC.TL_help_country tL_help_country = tL_help_countriesList.countries.get(i19);
                        String str = tL_help_country.name;
                        if (str != null) {
                            tL_help_country.default_name = str;
                        }
                        if (!tL_help_country.hidden && !tL_help_country.iso2.equalsIgnoreCase("FT")) {
                            String upperCase = tL_help_country.default_name.substring(0, 1).toUpperCase();
                            List arrayList2 = (List) map.get(upperCase);
                            if (arrayList2 == null) {
                                arrayList2 = new ArrayList();
                                map.put(upperCase, arrayList2);
                                arrayList.add(upperCase);
                            }
                            arrayList2.add(tL_help_country);
                        }
                    }
                    if (Build.VERSION.SDK_INT >= 24) {
                        Collator collator = Collator.getInstance(LocaleController.getInstance().getCurrentLocale() != null ? LocaleController.getInstance().getCurrentLocale() : Locale.getDefault());
                        Objects.requireNonNull(collator);
                        fVar = new h(collator, i18);
                    } else {
                        fVar = new f(11);
                    }
                    Collections.sort(arrayList, fVar);
                    Iterator it = map.values().iterator();
                    while (it.hasNext()) {
                        Collections.sort((List) it.next(), new Comparator() {
                            @Override
                            public final int compare(Object obj2, Object obj3) {
                                TLRPC.TL_help_country tL_help_country2 = (TLRPC.TL_help_country) obj2;
                                TLRPC.TL_help_country tL_help_country3 = (TLRPC.TL_help_country) obj3;
                                switch (i17) {
                                    case 0:
                                        return fVar.compare(tL_help_country2.default_name, tL_help_country3.default_name);
                                    default:
                                        return fVar.compare(tL_help_country2.default_name, tL_help_country3.default_name);
                                }
                            }
                        });
                    }
                    AndroidUtilities.runOnUIThread(new androidx.car.app.utils.a(f2Var, map, arrayList, 4));
                }
                break;
            case 3:
                n0 n0Var = (n0) obj;
                if (tLObject != null) {
                    TLRPC.TL_help_countriesList tL_help_countriesList2 = (TLRPC.TL_help_countriesList) tLObject;
                    HashMap map2 = new HashMap();
                    ArrayList arrayList3 = new ArrayList();
                    for (int i20 = 0; i20 < tL_help_countriesList2.countries.size(); i20++) {
                        TLRPC.TL_help_country tL_help_country2 = tL_help_countriesList2.countries.get(i20);
                        boolean zEqualsIgnoreCase = tL_help_country2.iso2.equalsIgnoreCase("FT");
                        String str2 = tL_help_country2.name;
                        if (str2 != null) {
                            tL_help_country2.default_name = str2;
                        }
                        if (!tL_help_country2.hidden || zEqualsIgnoreCase) {
                            if (zEqualsIgnoreCase) {
                                String string = LocaleController.getString(R.string.Fragment);
                                tL_help_country2.default_name = string;
                                tL_help_country2.name = string;
                            }
                            String upperCase2 = tL_help_country2.default_name.substring(0, 1).toUpperCase();
                            List arrayList4 = (List) map2.get(upperCase2);
                            if (arrayList4 == null) {
                                arrayList4 = new ArrayList();
                                map2.put(upperCase2, arrayList4);
                                arrayList3.add(upperCase2);
                            }
                            arrayList4.add(tL_help_country2);
                        }
                    }
                    if (Build.VERSION.SDK_INT >= 24) {
                        Collator collator2 = Collator.getInstance(LocaleController.getInstance().getCurrentLocale() != null ? LocaleController.getInstance().getCurrentLocale() : Locale.getDefault());
                        Objects.requireNonNull(collator2);
                        fVar2 = new h(collator2, i18);
                    } else {
                        fVar2 = new f(11);
                    }
                    Collections.sort(arrayList3, fVar2);
                    Iterator it2 = map2.values().iterator();
                    while (it2.hasNext()) {
                        Collections.sort((List) it2.next(), new Comparator() {
                            @Override
                            public final int compare(Object obj2, Object obj3) {
                                TLRPC.TL_help_country tL_help_country3 = (TLRPC.TL_help_country) obj2;
                                TLRPC.TL_help_country tL_help_country4 = (TLRPC.TL_help_country) obj3;
                                switch (i18) {
                                    case 0:
                                        return fVar2.compare(tL_help_country3.default_name, tL_help_country4.default_name);
                                    default:
                                        return fVar2.compare(tL_help_country3.default_name, tL_help_country4.default_name);
                                }
                            }
                        });
                    }
                    AndroidUtilities.runOnUIThread(new androidx.car.app.utils.a(n0Var, map2, arrayList3, 7));
                }
                break;
            case 4:
                AndroidUtilities.runOnUIThread(new a1.e(i12, (y2) obj, tLObject));
                break;
            case 5:
                AndroidUtilities.runOnUIThread(new androidx.car.app.utils.a((r) obj, tLObject, tL_error, i15));
                break;
            case 6:
                AndroidUtilities.runOnUIThread(new u(i15, (z) obj, tLObject));
                break;
            case 7:
                AndroidUtilities.runOnUIThread(new u(i13, (a0) obj, tLObject));
                break;
            case 8:
                AndroidUtilities.runOnUIThread(new m5(i18, tLObject, (n0) obj));
                break;
            case 9:
                AndroidUtilities.runOnUIThread(new m5(i11, (m7) obj, tLObject));
                break;
            case 10:
                jb jbVar = (jb) obj;
                if (tLObject instanceof TLRPC.TL_boolTrue) {
                    MessagesStorage.getInstance(jbVar.f9557c).putMessages(new ArrayList<>(Arrays.asList(jbVar.G.messageOwner)), true, true, true, 0, 0, 0L);
                } else {
                    jbVar.getClass();
                }
                break;
            case 11:
                AndroidUtilities.runOnUIThread(new y9((z8) obj, 17));
                break;
            case 12:
                AndroidUtilities.runOnUIThread(new m5(i12, (d6) obj, tLObject));
                break;
            case 13:
                AndroidUtilities.runOnUIThread(new m5(28, (f6) obj, tLObject));
                break;
            case 14:
                AndroidUtilities.runOnUIThread(new p6(i13, (s1) obj, tLObject));
                break;
            case 15:
                AndroidUtilities.runOnUIThread(new k7(i17, (r7) obj, tLObject));
                break;
            case 16:
                AndroidUtilities.runOnUIThread(new k7(i18, (z7) obj, tLObject));
                break;
            case 17:
                AndroidUtilities.runOnUIThread(new k7(i14, (j8) obj, tLObject));
                break;
            case 18:
                AndroidUtilities.runOnUIThread(new k7(15, (e4) obj, tL_error));
                break;
            case 19:
                AndroidUtilities.runOnUIThread(new zh1(9, (c2) obj, tLObject));
                break;
            case 20:
                pf.c cVar = (pf.c) obj;
                if (tLObject != null) {
                    AndroidUtilities.runOnUIThread(new zh1(12, cVar, tLObject));
                }
                break;
            case 21:
                pf.z zVar = (pf.z) obj;
                zVar.getClass();
                AndroidUtilities.runOnUIThread(new zh1(13, zVar, tLObject));
                break;
            case 22:
                AndroidUtilities.runOnUIThread(new qf.a(obj, (Object) tL_error, (Object) tLObject, 0));
                break;
            case 23:
                AndroidUtilities.runOnUIThread(new zh1(i15, (qf.h) obj, tLObject));
                break;
            case 24:
                AndroidUtilities.runOnUIThread(new qf.a(obj, (Object) tL_error, (Object) tLObject, 1));
                break;
            case 25:
                AndroidUtilities.runOnUIThread(new qf.a(obj, (Object) tL_error, (Object) tLObject, 5));
                break;
            case 26:
                AndroidUtilities.runOnUIThread(new qf.a(obj, (Object) tL_error, (Object) tLObject, 6));
                break;
            case 27:
                AndroidUtilities.runOnUIThread(new zh1(i16, (q1) obj, tLObject));
                break;
            case 28:
                AndroidUtilities.runOnUIThread(new zh1(27, (v) obj, tLObject));
                break;
            default:
                AndroidUtilities.runOnUIThread(new o2(2, (s4) obj, tLObject));
                break;
        }
    }
}
