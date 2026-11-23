package ai;

import android.os.Build;
import android.util.Log;
import di.mc;
import di.p8;
import di.s4;
import fi.b6;
import fi.d6;
import fi.l4;
import hi.a8;
import hi.c7;
import hi.k7;
import hi.u6;
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
import ki.s3;
import oi.y4;
import org.telegram.messenger.hd;
import org.telegram.messenger.r10;
import org.telegram.messenger.ur;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.ui.Components.es0;
import org.telegram.ui.Dictation.DictationAsr;
import org.telegram.ui.Wallet.u4;
import org.telegram.ui.qw0;
public final class g1 implements RequestDelegate {
    public final int f1215a;
    public final Object f1216b;

    public g1(Object obj, int i7) {
        this.f1215a = i7;
        this.f1216b = obj;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        String str;
        final Comparator qw0Var;
        Locale locale;
        final Comparator qw0Var2;
        Locale locale2;
        int i7 = 0;
        switch (this.f1215a) {
            case 0:
                CountDownLatch countDownLatch = (CountDownLatch) this.f1216b;
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
                    synchronized (m1.class) {
                        m1.f1295a = arrayList;
                        m1.k(arrayList);
                    }
                    Log.d("Dictation", "speech models: " + arrayList.size() + " from the server");
                    DictationAsr.P();
                    DictationAsr.p();
                } else {
                    StringBuilder sb2 = new StringBuilder("speech models: list failed: ");
                    if (tL_error != null) {
                        str = tL_error.text;
                    } else {
                        str = null;
                    }
                    p5.c.t(sb2, str, "Dictation");
                }
                synchronized (m1.class) {
                    m1.f1297c = null;
                }
                countDownLatch.countDown();
                return;
            case 1:
                org.telegram.messenger.g0.g3(new c1.a(26, (di.b0) this.f1216b, tLObject));
                return;
            case 2:
                org.telegram.messenger.g0.g3(new c1.a(27, (di.c0) this.f1216b, tLObject));
                return;
            case 3:
                org.telegram.messenger.g0.g3(new di.f2(12, tLObject, (h0) this.f1216b));
                return;
            case 4:
                org.telegram.messenger.g0.g3(new di.f2(14, (p8) this.f1216b, tLObject));
                return;
            case 5:
                mc mcVar = (mc) this.f1216b;
                if (tLObject instanceof TLRPC.TL_boolTrue) {
                    ur.a0(mcVar.n1).j1(new ArrayList(Arrays.asList(mcVar.G1.f24213k)), true, true, true, 0, false, 0, 0L);
                    return;
                } else {
                    mcVar.getClass();
                    return;
                }
            case 6:
                org.telegram.messenger.g0.g3(new f2.a((a8) this.f1216b, 13));
                return;
            case 7:
                org.telegram.messenger.g0.g3(new l4(2, (b6) this.f1216b, tLObject));
                return;
            case 8:
                org.telegram.messenger.g0.g3(new l4(4, (d6) this.f1216b, tLObject));
                return;
            case 9:
                org.telegram.messenger.g0.g3(new hi.c(2, (hi.r1) this.f1216b, tLObject));
                return;
            case 10:
                org.telegram.messenger.g0.g3(new hi.c(12, (u6) this.f1216b, tLObject));
                return;
            case 11:
                org.telegram.messenger.g0.g3(new hi.c(14, (c7) this.f1216b, tLObject));
                return;
            case 12:
                org.telegram.messenger.g0.g3(new hi.c(15, (k7) this.f1216b, tLObject));
                return;
            case 13:
                org.telegram.messenger.g0.g3(new ii.a((r10) this.f1216b, tLObject, tL_error, 0));
                return;
            case 14:
                org.telegram.messenger.g0.g3(new hi.c(22, (ii.m) this.f1216b, tLObject));
                return;
            case 15:
                jg.h0 h0Var = (jg.h0) this.f1216b;
                h0Var.getClass();
                org.telegram.messenger.g0.g3(new hi.c(24, h0Var, tLObject));
                return;
            case 16:
                org.telegram.messenger.g0.g3(new di.a8((kg.c) this.f1216b, tL_error, tLObject, 27));
                return;
            case 17:
                org.telegram.messenger.g0.g3(new ji.i(1, (kg.f) this.f1216b, tLObject));
                return;
            case 18:
                org.telegram.messenger.g0.g3(new di.a8((kg.n) this.f1216b, tL_error, tLObject, 28));
                return;
            case 19:
                org.telegram.messenger.g0.g3(new kg.y((kg.u0) this.f1216b, tL_error, tLObject, 2));
                return;
            case 20:
                org.telegram.messenger.g0.g3(new kg.y((kg.e1) this.f1216b, tL_error, tLObject, 3));
                return;
            case 21:
                org.telegram.messenger.g0.g3(new ji.i(6, (kg.v1) this.f1216b, tLObject));
                return;
            case 22:
                org.telegram.messenger.g0.g3(new ji.i(14, (s3) this.f1216b, tL_error));
                return;
            case 23:
                org.telegram.messenger.g0.g3(new oi.t(0, (oi.v) this.f1216b, tLObject));
                return;
            case 24:
                org.telegram.messenger.g0.g3(new oi.t(5, (y4) this.f1216b, tLObject));
                return;
            case 25:
                org.telegram.messenger.g0.g3(new u4(26, (org.telegram.ui.web.t1) this.f1216b, tLObject));
                return;
            case 26:
                wg.u0 u0Var = (wg.u0) this.f1216b;
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
                        if (hd.E0().f24472y != null) {
                            locale = hd.E0().f24472y;
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
                    org.telegram.messenger.g0.g3(new es0((Object) u0Var, (Object) hashMap, (Object) arrayList3, 28));
                    return;
                }
                return;
            case 27:
                ug.z zVar = (ug.z) this.f1216b;
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
                                String N0 = hd.N0(2131750504, null);
                                tL_help_country2.default_name = N0;
                                tL_help_country2.name = N0;
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
                        if (hd.E0().f24472y != null) {
                            locale2 = hd.E0().f24472y;
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
                    org.telegram.messenger.g0.g3(new wg.p(zVar, hashMap2, arrayList4, 1));
                    return;
                }
                return;
            default:
                org.telegram.messenger.g0.g3(new wg.q(5, (wg.e1) this.f1216b, tLObject));
                return;
        }
    }
}
