package ai;

import android.os.Build;
import android.util.Log;
import di.ga;
import di.mc;
import di.o8;
import di.s4;
import fi.a6;
import fi.b6;
import fi.d6;
import hi.b8;
import hi.d7;
import hi.l7;
import hi.v6;
import j$.util.Objects;
import java.text.Collator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CountDownLatch;
import ki.t3;
import oi.x4;
import org.telegram.messenger.gd;
import org.telegram.messenger.q10;
import org.telegram.messenger.tr;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.ui.Components.sv0;
import org.telegram.ui.Dictation.DictationAsr;
import org.telegram.ui.Wallet.c5;
import org.telegram.ui.qw0;
public final class e1 implements RequestDelegate {
    public final int f1185a;
    public final Object f1186b;

    public e1(Object obj, int i7) {
        this.f1185a = i7;
        this.f1186b = obj;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        String str;
        final Comparator qw0Var;
        Locale locale;
        final Comparator qw0Var2;
        Locale locale2;
        int i7 = 0;
        switch (this.f1185a) {
            case 0:
                CountDownLatch countDownLatch = (CountDownLatch) this.f1186b;
                if (tLObject instanceof Vector) {
                    ArrayList arrayList = new ArrayList();
                    ArrayList<T> arrayList2 = ((Vector) tLObject).objects;
                    int size = arrayList2.size();
                    while (i7 < size) {
                        Object obj = arrayList2.get(i7);
                        i7++;
                        if (obj instanceof TLRPC.TL_transcriptionModel) {
                            TLRPC.TL_transcriptionModel tL_transcriptionModel = (TLRPC.TL_transcriptionModel) obj;
                            if (tL_transcriptionModel.document instanceof TLRPC.TL_document) {
                                arrayList.add(tL_transcriptionModel);
                            }
                        }
                    }
                    synchronized (j1.class) {
                        j1.f1249a = arrayList;
                        j1.k(arrayList);
                    }
                    Log.d("Dictation", "speech models: " + arrayList.size() + " from the server");
                    DictationAsr.L();
                    DictationAsr.n();
                } else {
                    StringBuilder sb2 = new StringBuilder("speech models: list failed: ");
                    if (tL_error != null) {
                        str = tL_error.text;
                    } else {
                        str = null;
                    }
                    p5.c.t(sb2, str, "Dictation");
                }
                synchronized (j1.class) {
                    j1.f1251c = null;
                }
                countDownLatch.countDown();
                return;
            case 1:
                org.telegram.messenger.g0.g3(new c1.c(24, (di.b0) this.f1186b, tLObject));
                return;
            case 2:
                org.telegram.messenger.g0.g3(new c1.c(25, (di.c0) this.f1186b, tLObject));
                return;
            case 3:
                org.telegram.messenger.g0.g3(new di.w2(10, tLObject, (g0) this.f1186b));
                return;
            case 4:
                org.telegram.messenger.g0.g3(new di.w2(12, (o8) this.f1186b, tLObject));
                return;
            case 5:
                mc mcVar = (mc) this.f1186b;
                if (tLObject instanceof TLRPC.TL_boolTrue) {
                    tr.a0(mcVar.n1).j1(new ArrayList(Arrays.asList(mcVar.G1.f23968k)), true, true, true, 0, false, 0, 0L);
                    return;
                } else {
                    mcVar.getClass();
                    return;
                }
            case 6:
                org.telegram.messenger.g0.g3(new f2.a((b8) this.f1186b, 13));
                return;
            case 7:
                org.telegram.messenger.g0.g3(new a6(0, (b6) this.f1186b, tLObject));
                return;
            case 8:
                org.telegram.messenger.g0.g3(new a6(2, (d6) this.f1186b, tLObject));
                return;
            case 9:
                org.telegram.messenger.g0.g3(new hi.r1(0, (hi.s1) this.f1186b, tLObject));
                return;
            case 10:
                org.telegram.messenger.g0.g3(new hi.r1(10, (v6) this.f1186b, tLObject));
                return;
            case 11:
                org.telegram.messenger.g0.g3(new hi.r1(12, (d7) this.f1186b, tLObject));
                return;
            case 12:
                org.telegram.messenger.g0.g3(new hi.r1(13, (l7) this.f1186b, tLObject));
                return;
            case 13:
                org.telegram.messenger.g0.g3(new ii.a((q10) this.f1186b, tLObject, tL_error, 0));
                return;
            case 14:
                org.telegram.messenger.g0.g3(new hi.r1(20, (ii.m) this.f1186b, tLObject));
                return;
            case 15:
                jg.h0 h0Var = (jg.h0) this.f1186b;
                h0Var.getClass();
                org.telegram.messenger.g0.g3(new hi.r1(22, h0Var, tLObject));
                return;
            case 16:
                org.telegram.messenger.g0.g3(new ga((kg.c) this.f1186b, tL_error, tLObject, 26));
                return;
            case 17:
                org.telegram.messenger.g0.g3(new hi.r1(29, (kg.f) this.f1186b, tLObject));
                return;
            case 18:
                org.telegram.messenger.g0.g3(new ga((kg.n) this.f1186b, tL_error, tLObject, 27));
                return;
            case 19:
                org.telegram.messenger.g0.g3(new kg.i0((kg.v0) this.f1186b, tL_error, tLObject, 1));
                return;
            case 20:
                org.telegram.messenger.g0.g3(new kg.i0((kg.f1) this.f1186b, tL_error, tLObject, 2));
                return;
            case 21:
                org.telegram.messenger.g0.g3(new kg.h0(4, (kg.w1) this.f1186b, tLObject));
                return;
            case 22:
                org.telegram.messenger.g0.g3(new kg.h0(12, (t3) this.f1186b, tL_error));
                return;
            case 23:
                org.telegram.messenger.g0.g3(new kg.h0(28, (oi.u) this.f1186b, tLObject));
                return;
            case 24:
                org.telegram.messenger.g0.g3(new oi.s2(3, (x4) this.f1186b, tLObject));
                return;
            case 25:
                org.telegram.messenger.g0.g3(new c5(24, (org.telegram.ui.web.t1) this.f1186b, tLObject));
                return;
            case 26:
                wg.u0 u0Var = (wg.u0) this.f1186b;
                if (tLObject != null) {
                    TLRPC.TL_help_countriesList tL_help_countriesList = (TLRPC.TL_help_countriesList) tLObject;
                    HashMap hashMap = new HashMap();
                    ArrayList arrayList3 = new ArrayList();
                    for (int i10 = 0; i10 < tL_help_countriesList.countries.size(); i10++) {
                        TLRPC.TL_help_country tL_help_country = tL_help_countriesList.countries.get(i10);
                        String str2 = tL_help_country.name;
                        if (str2 != null) {
                            tL_help_country.default_name = str2;
                        }
                        if (!tL_help_country.hidden && !tL_help_country.iso2.equalsIgnoreCase("FT")) {
                            String upperCase = tL_help_country.default_name.substring(0, 1).toUpperCase();
                            List list = (List) hashMap.get(upperCase);
                            if (list == null) {
                                list = new ArrayList();
                                hashMap.put(upperCase, list);
                                arrayList3.add(upperCase);
                            }
                            list.add(tL_help_country);
                        }
                    }
                    if (Build.VERSION.SDK_INT >= 24) {
                        if (gd.E0().f24244y != null) {
                            locale = gd.E0().f24244y;
                        } else {
                            locale = Locale.getDefault();
                        }
                        Collator collator = Collator.getInstance(locale);
                        Objects.requireNonNull(collator);
                        qw0Var = new s4(collator, 6);
                    } else {
                        qw0Var = new qw0(13);
                    }
                    Collections.sort(arrayList3, qw0Var);
                    for (List list2 : hashMap.values()) {
                        Collections.sort(list2, new Comparator() {
                            @Override
                            public final int compare(Object obj2, Object obj3) {
                                TLRPC.TL_help_country tL_help_country2 = (TLRPC.TL_help_country) obj2;
                                TLRPC.TL_help_country tL_help_country3 = (TLRPC.TL_help_country) obj3;
                                switch (r2) {
                                    case 0:
                                        return qw0Var.compare(tL_help_country2.default_name, tL_help_country3.default_name);
                                    default:
                                        return qw0Var.compare(tL_help_country2.default_name, tL_help_country3.default_name);
                                }
                            }
                        });
                    }
                    org.telegram.messenger.g0.g3(new sv0(u0Var, hashMap, arrayList3, 27));
                    return;
                }
                return;
            case 27:
                ug.z zVar = (ug.z) this.f1186b;
                if (tLObject != null) {
                    TLRPC.TL_help_countriesList tL_help_countriesList2 = (TLRPC.TL_help_countriesList) tLObject;
                    HashMap hashMap2 = new HashMap();
                    ArrayList arrayList4 = new ArrayList();
                    for (int i11 = 0; i11 < tL_help_countriesList2.countries.size(); i11++) {
                        TLRPC.TL_help_country tL_help_country2 = tL_help_countriesList2.countries.get(i11);
                        boolean equalsIgnoreCase = tL_help_country2.iso2.equalsIgnoreCase("FT");
                        String str3 = tL_help_country2.name;
                        if (str3 != null) {
                            tL_help_country2.default_name = str3;
                        }
                        if (!tL_help_country2.hidden || equalsIgnoreCase) {
                            if (equalsIgnoreCase) {
                                String M0 = gd.M0(2131750505, null);
                                tL_help_country2.default_name = M0;
                                tL_help_country2.name = M0;
                            }
                            String upperCase2 = tL_help_country2.default_name.substring(0, 1).toUpperCase();
                            List list3 = (List) hashMap2.get(upperCase2);
                            if (list3 == null) {
                                list3 = new ArrayList();
                                hashMap2.put(upperCase2, list3);
                                arrayList4.add(upperCase2);
                            }
                            list3.add(tL_help_country2);
                        }
                    }
                    if (Build.VERSION.SDK_INT >= 24) {
                        if (gd.E0().f24244y != null) {
                            locale2 = gd.E0().f24244y;
                        } else {
                            locale2 = Locale.getDefault();
                        }
                        Collator collator2 = Collator.getInstance(locale2);
                        Objects.requireNonNull(collator2);
                        qw0Var2 = new s4(collator2, 6);
                    } else {
                        qw0Var2 = new qw0(13);
                    }
                    Collections.sort(arrayList4, qw0Var2);
                    for (List list4 : hashMap2.values()) {
                        Collections.sort(list4, new Comparator() {
                            @Override
                            public final int compare(Object obj2, Object obj3) {
                                TLRPC.TL_help_country tL_help_country22 = (TLRPC.TL_help_country) obj2;
                                TLRPC.TL_help_country tL_help_country3 = (TLRPC.TL_help_country) obj3;
                                switch (r2) {
                                    case 0:
                                        return qw0Var2.compare(tL_help_country22.default_name, tL_help_country3.default_name);
                                    default:
                                        return qw0Var2.compare(tL_help_country22.default_name, tL_help_country3.default_name);
                                }
                            }
                        });
                    }
                    org.telegram.messenger.g0.g3(new wg.q(zVar, hashMap2, arrayList4, 0));
                    return;
                }
                return;
            default:
                org.telegram.messenger.g0.g3(new wg.r(3, (wg.d1) this.f1186b, tLObject));
                return;
        }
    }
}
