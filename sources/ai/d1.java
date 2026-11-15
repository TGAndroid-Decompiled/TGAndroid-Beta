package ai;

import android.os.Build;
import android.util.Log;
import di.jc;
import di.m8;
import di.p4;
import fi.d6;
import fi.f6;
import fi.g6;
import fi.s5;
import hi.b8;
import hi.d7;
import hi.h4;
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
import ki.y3;
import oi.u4;
import oi.w4;
import org.telegram.messenger.hd;
import org.telegram.messenger.vr;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.ui.Components.lv0;
import org.telegram.ui.Dictation.DictationAsr;
import org.telegram.ui.qv0;
public final class d1 implements RequestDelegate {
    public final int f1178a;
    public final Object f1179b;

    public d1(Object obj, int i7) {
        this.f1178a = i7;
        this.f1179b = obj;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        String str;
        final Comparator qv0Var;
        Locale locale;
        final Comparator qv0Var2;
        Locale locale2;
        int i7 = 0;
        switch (this.f1178a) {
            case 0:
                CountDownLatch countDownLatch = (CountDownLatch) this.f1179b;
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
                    synchronized (i1.class) {
                        i1.f1250a = arrayList;
                        i1.h(arrayList);
                    }
                    Log.d("Dictation", "speech models: " + arrayList.size() + " from the server");
                    DictationAsr.L();
                    DictationAsr.o();
                } else {
                    StringBuilder sb2 = new StringBuilder("speech models: list failed: ");
                    if (tL_error != null) {
                        str = tL_error.text;
                    } else {
                        str = null;
                    }
                    r.b.t(sb2, str, "Dictation");
                }
                synchronized (i1.class) {
                    i1.f1252c = null;
                }
                countDownLatch.countDown();
                return;
            case 1:
                org.telegram.messenger.g0.h3(new c1.c(25, (di.b0) this.f1179b, tLObject));
                return;
            case 2:
                org.telegram.messenger.g0.h3(new c1.c(26, (di.c0) this.f1179b, tLObject));
                return;
            case 3:
                org.telegram.messenger.g0.h3(new di.s2(8, tLObject, (f0) this.f1179b));
                return;
            case 4:
                org.telegram.messenger.g0.h3(new di.s2(10, (m8) this.f1179b, tLObject));
                return;
            case 5:
                jc jcVar = (jc) this.f1179b;
                if (tLObject instanceof TLRPC.TL_boolTrue) {
                    vr.a0(jcVar.n1).j1(new ArrayList(Arrays.asList(jcVar.G1.f23817k)), true, true, true, 0, false, 0, 0L);
                    return;
                } else {
                    jcVar.getClass();
                    return;
                }
            case 6:
                org.telegram.messenger.g0.h3(new fi.c1((b8) this.f1179b, 9));
                return;
            case 7:
                org.telegram.messenger.g0.h3(new di.s2(28, (d6) this.f1179b, tLObject));
                return;
            case 8:
                org.telegram.messenger.g0.h3(new f6(0, (g6) this.f1179b, tLObject));
                return;
            case 9:
                org.telegram.messenger.g0.h3(new f6(28, (hi.r1) this.f1179b, tLObject));
                return;
            case 10:
                org.telegram.messenger.g0.h3(new h4(8, (v6) this.f1179b, tLObject));
                return;
            case 11:
                org.telegram.messenger.g0.h3(new h4(10, (d7) this.f1179b, tLObject));
                return;
            case 12:
                org.telegram.messenger.g0.h3(new h4(11, (l7) this.f1179b, tLObject));
                return;
            case 13:
                jg.h0 h0Var = (jg.h0) this.f1179b;
                h0Var.getClass();
                org.telegram.messenger.g0.h3(new h4(19, h0Var, tLObject));
                return;
            case 14:
                org.telegram.messenger.g0.h3(new s5((Object) ((kg.c) this.f1179b), (Object) tL_error, tLObject, 22));
                return;
            case 15:
                org.telegram.messenger.g0.h3(new h4(26, (kg.f) this.f1179b, tLObject));
                return;
            case 16:
                org.telegram.messenger.g0.h3(new s5((Object) ((kg.n) this.f1179b), (Object) tL_error, tLObject, 23));
                return;
            case 17:
                org.telegram.messenger.g0.h3(new s5((Object) ((kg.s0) this.f1179b), (Object) tL_error, tLObject, 27));
                return;
            case 18:
                org.telegram.messenger.g0.h3(new s5((Object) ((kg.c1) this.f1179b), (Object) tL_error, tLObject, 28));
                return;
            case 19:
                org.telegram.messenger.g0.h3(new kg.t1(1, (kg.v1) this.f1179b, tLObject));
                return;
            case 20:
                org.telegram.messenger.g0.h3(new kg.t1(9, (y3) this.f1179b, tL_error));
                return;
            case 21:
                org.telegram.messenger.g0.h3(new kg.t1(25, (oi.u) this.f1179b, tLObject));
                return;
            case 22:
                org.telegram.messenger.g0.h3(new u4(0, (w4) this.f1179b, tLObject));
                return;
            case 23:
                org.telegram.messenger.g0.h3(new org.telegram.ui.web.e1(2, (org.telegram.ui.web.t1) this.f1179b, tLObject));
                return;
            case 24:
                wg.s0 s0Var = (wg.s0) this.f1179b;
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
                        if (hd.E0().f24129y != null) {
                            locale = hd.E0().f24129y;
                        } else {
                            locale = Locale.getDefault();
                        }
                        Collator collator = Collator.getInstance(locale);
                        Objects.requireNonNull(collator);
                        qv0Var = new p4(collator, 6);
                    } else {
                        qv0Var = new qv0(14);
                    }
                    Collections.sort(arrayList3, qv0Var);
                    for (List list2 : hashMap.values()) {
                        Collections.sort(list2, new Comparator() {
                            @Override
                            public final int compare(Object obj2, Object obj3) {
                                TLRPC.TL_help_country tL_help_country2 = (TLRPC.TL_help_country) obj2;
                                TLRPC.TL_help_country tL_help_country3 = (TLRPC.TL_help_country) obj3;
                                switch (r2) {
                                    case 0:
                                        return qv0Var.compare(tL_help_country2.default_name, tL_help_country3.default_name);
                                    default:
                                        return qv0Var.compare(tL_help_country2.default_name, tL_help_country3.default_name);
                                }
                            }
                        });
                    }
                    org.telegram.messenger.g0.h3(new lv0(s0Var, hashMap, arrayList3, 23));
                    return;
                }
                return;
            case 25:
                ug.p1 p1Var = (ug.p1) this.f1179b;
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
                                String M0 = hd.M0(2131750521, null);
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
                        if (hd.E0().f24129y != null) {
                            locale2 = hd.E0().f24129y;
                        } else {
                            locale2 = Locale.getDefault();
                        }
                        Collator collator2 = Collator.getInstance(locale2);
                        Objects.requireNonNull(collator2);
                        qv0Var2 = new p4(collator2, 6);
                    } else {
                        qv0Var2 = new qv0(14);
                    }
                    Collections.sort(arrayList4, qv0Var2);
                    for (List list4 : hashMap2.values()) {
                        Collections.sort(list4, new Comparator() {
                            @Override
                            public final int compare(Object obj2, Object obj3) {
                                TLRPC.TL_help_country tL_help_country22 = (TLRPC.TL_help_country) obj2;
                                TLRPC.TL_help_country tL_help_country3 = (TLRPC.TL_help_country) obj3;
                                switch (r2) {
                                    case 0:
                                        return qv0Var2.compare(tL_help_country22.default_name, tL_help_country3.default_name);
                                    default:
                                        return qv0Var2.compare(tL_help_country22.default_name, tL_help_country3.default_name);
                                }
                            }
                        });
                    }
                    org.telegram.messenger.g0.h3(new lv0(p1Var, hashMap2, arrayList4, 26));
                    return;
                }
                return;
            case 26:
                org.telegram.messenger.g0.h3(new ug.t1(11, (wg.c1) this.f1179b, tLObject));
                return;
            case 27:
                org.telegram.messenger.g0.h3(new ug.t1(21, (yf.c) this.f1179b, tLObject));
                return;
            default:
                org.telegram.messenger.g0.h3(new lv0((yf.d) this.f1179b, tLObject, tL_error, 29));
                return;
        }
    }
}
