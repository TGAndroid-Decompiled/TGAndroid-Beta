package defpackage;

import android.os.Build;
import android.util.Log;
import j$.util.Objects;
import java.text.Collator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CountDownLatch;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.ui.DataSettingsActivity;
import org.telegram.ui.Dictation.DictationAsr;
public final class tg implements RequestDelegate {
    public final byte a;
    public final Object b;

    public tg(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        Comparator saVar;
        Locale locale;
        Comparator saVar2;
        Locale locale2;
        String str;
        int i;
        byte b = this.a;
        String str2 = null;
        int i2 = 0;
        Object obj = this.b;
        switch (b) {
            case 0:
                j5 j5Var = (j5) obj;
                if (tLObject instanceof TLRPC.Updates) {
                    oc7.r1(j5Var.a).T3((TLRPC.Updates) tLObject, false);
                    return;
                }
                return;
            case 1:
                gm.c3(new op6((Object) ((ht) obj), (Object) tL_error, (Object) tLObject, (byte) 9));
                return;
            case 2:
                gm.c3(new op6((Object) ((be0) obj), (Object) tL_error, (Object) tLObject, (byte) 15));
                return;
            case 3:
                gm.c3(new x30((ok0) obj, tLObject, (byte) 8));
                return;
            case 4:
                z0a z0aVar = (z0a) obj;
                if (tLObject != null) {
                    TLRPC.TL_help_countriesList tL_help_countriesList = (TLRPC.TL_help_countriesList) tLObject;
                    HashMap hashMap = new HashMap();
                    ArrayList arrayList = new ArrayList();
                    for (int i3 = 0; i3 < tL_help_countriesList.countries.size(); i3++) {
                        TLRPC.TL_help_country tL_help_country = tL_help_countriesList.countries.get(i3);
                        String str3 = tL_help_country.name;
                        if (str3 != null) {
                            tL_help_country.default_name = str3;
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
                        if (jb6.D0().y != null) {
                            locale = jb6.D0().y;
                        } else {
                            locale = Locale.getDefault();
                        }
                        Collator collator = Collator.getInstance(locale);
                        Objects.requireNonNull(collator);
                        saVar = new io0(collator, (byte) 0);
                    } else {
                        saVar = new sa((byte) 9);
                    }
                    Collections.sort(arrayList, saVar);
                    for (List list2 : hashMap.values()) {
                        Collections.sort(list2, new jo0(saVar, (byte) 0));
                    }
                    gm.c3(new op6(z0aVar, hashMap, arrayList, (byte) 20));
                    return;
                }
                return;
            case 5:
                mf2 mf2Var = (mf2) obj;
                if (tLObject != null) {
                    TLRPC.TL_help_countriesList tL_help_countriesList2 = (TLRPC.TL_help_countriesList) tLObject;
                    HashMap hashMap2 = new HashMap();
                    ArrayList arrayList2 = new ArrayList();
                    for (int i4 = 0; i4 < tL_help_countriesList2.countries.size(); i4++) {
                        TLRPC.TL_help_country tL_help_country2 = tL_help_countriesList2.countries.get(i4);
                        boolean equalsIgnoreCase = tL_help_country2.iso2.equalsIgnoreCase("FT");
                        String str4 = tL_help_country2.name;
                        if (str4 != null) {
                            tL_help_country2.default_name = str4;
                        }
                        if (!tL_help_country2.hidden || equalsIgnoreCase) {
                            if (equalsIgnoreCase) {
                                String M0 = jb6.M0(2131750453, null);
                                tL_help_country2.default_name = M0;
                                tL_help_country2.name = M0;
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
                        if (jb6.D0().y != null) {
                            locale2 = jb6.D0().y;
                        } else {
                            locale2 = Locale.getDefault();
                        }
                        Collator collator2 = Collator.getInstance(locale2);
                        Objects.requireNonNull(collator2);
                        saVar2 = new io0(collator2, (byte) 0);
                    } else {
                        saVar2 = new sa((byte) 9);
                    }
                    Collections.sort(arrayList2, saVar2);
                    for (List list4 : hashMap2.values()) {
                        Collections.sort(list4, new jo0(saVar2, (byte) 1));
                    }
                    gm.c3(new op6(mf2Var, hashMap2, arrayList2, (byte) 23));
                    return;
                }
                return;
            case 6:
                gm.c3(new x30((hu0) obj, tLObject, (byte) 17));
                return;
            case 7:
                gm.c3(new x30((iu0) obj, tLObject, (byte) 18));
                return;
            case 8:
                gm.c3(new y31((x41) obj, tLObject, (byte) 2));
                return;
            case 9:
                f51 f51Var = (f51) obj;
                f51Var.getClass();
                gm.c3(new tv0(f51Var, tL_error, tLObject, (byte) 6));
                return;
            case 10:
                gm.c3(new tv0((ia1) obj, tL_error, tLObject, (byte) 13));
                return;
            case 11:
                gm.c3(new lx1((e32) obj, tL_error, (byte) 11));
                return;
            case 12:
                gm.c3(new fo1((y92) obj, (byte) 25));
                return;
            case 13:
                gm.c3(new ra2((ib2) obj, tLObject, (byte) 2));
                return;
            case 14:
                wg2 wg2Var = (wg2) obj;
                if (tLObject != null) {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                    wg2Var.getMessagesController().T3(updates, false);
                    if (!updates.chats.isEmpty()) {
                        gm.d3(new ra2(wg2Var, updates, (byte) 17), 1000L);
                        return;
                    }
                    return;
                }
                return;
            case 15:
                tu2 tu2Var = (tu2) obj;
                tu2Var.getClass();
                gm.c3(new hu2(tu2Var, (byte) 2));
                return;
            case 16:
                gm.c3(new mv2((r23) obj, tLObject, (byte) 16));
                return;
            case 17:
                DataSettingsActivity dataSettingsActivity = (DataSettingsActivity) obj;
                dataSettingsActivity.getClass();
                gm.c3(new u73(dataSettingsActivity, (byte) 0));
                return;
            case 18:
                gm.c3(new rd3((fl3) obj, tLObject, (byte) 10));
                return;
            case 19:
                ov9 ov9Var = (ov9) obj;
                ov9Var.getClass();
                gm.c3(new rd3(ov9Var, tLObject, (byte) 12));
                return;
            case 20:
                CountDownLatch countDownLatch = (CountDownLatch) obj;
                if (tLObject instanceof Vector) {
                    ArrayList arrayList3 = new ArrayList();
                    ArrayList<T> arrayList4 = ((Vector) tLObject).objects;
                    int size = arrayList4.size();
                    while (i2 < size) {
                        Object obj2 = arrayList4.get(i2);
                        i2++;
                        if (obj2 instanceof TLRPC.TL_transcriptionModel) {
                            TLRPC.TL_transcriptionModel tL_transcriptionModel = (TLRPC.TL_transcriptionModel) obj2;
                            if (tL_transcriptionModel.document instanceof TLRPC.TL_document) {
                                arrayList3.add(tL_transcriptionModel);
                            }
                        }
                    }
                    synchronized (jo3.class) {
                        jo3.a = arrayList3;
                        jo3.k(arrayList3);
                    }
                    Log.d("Dictation", "speech models: " + arrayList3.size() + " from the server");
                    DictationAsr.R();
                    DictationAsr.n();
                } else {
                    StringBuilder sb = new StringBuilder("speech models: list failed: ");
                    if (tL_error != null) {
                        str = tL_error.text;
                    } else {
                        str = null;
                    }
                    ts2.w(sb, str, "Dictation");
                }
                synchronized (jo3.class) {
                    jo3.c = null;
                }
                countDownLatch.countDown();
                return;
            case 21:
                gm.c3(new pf2((er3) obj, tLObject, (byte) 2));
                return;
            case 22:
                gm.c3(new pv3((ww3) obj, tLObject, (byte) 3));
                return;
            case 23:
                gm.c3(new pv3((z04) obj, tLObject, (byte) 6));
                return;
            case 24:
                j24 j24Var = (j24) obj;
                if (tLObject != null) {
                    gm.c3(new pv3(j24Var, tLObject, (byte) 11));
                    return;
                }
                return;
            case 25:
                yg ygVar = (yg) obj;
                if (tL_error != null) {
                    str2 = tL_error.text;
                    i = tL_error.code;
                } else {
                    i = 0;
                }
                boolean z = tLObject instanceof TLRPC.TL_boolTrue;
                int i5 = -3;
                if (str2 == null) {
                    if (z) {
                        i5 = -1;
                    }
                } else if (str2.equals("ACCESS_DENIED")) {
                    i5 = -2;
                } else {
                    if (i == 420) {
                        try {
                            i5 = Math.max(0, Integer.parseInt(str2.substring(str2.lastIndexOf(95) + 1)));
                        } catch (NumberFormatException unused) {
                        }
                    }
                    if (i < 0 || i >= 500 || str2.contains("TIMEOUT") || str2.equals("ENGINE_SWITCHED") || str2.equals("TL_VERIFICATION_ERROR")) {
                        i5 = -4;
                    }
                }
                ia4.d.postRunnable(new bm3(ygVar, i5, (byte) 7), 0L);
                return;
            case 26:
                lb4 lb4Var = (lb4) obj;
                if (tL_error != null) {
                    lb4Var.h(0, false);
                    return;
                } else if (tLObject instanceof Vector) {
                    lb4Var.E0 = false;
                    Vector vector = (Vector) tLObject;
                    if (!vector.objects.isEmpty()) {
                        if (lb4Var.q0 == null) {
                            lb4Var.q0 = new HashMap();
                        }
                        for (int i6 = 0; i6 < vector.objects.size(); i6++) {
                            TLRPC.TL_fileHash tL_fileHash = (TLRPC.TL_fileHash) vector.objects.get(i6);
                            lb4Var.q0.put(Long.valueOf(tL_fileHash.offset), tL_fileHash);
                        }
                    }
                    for (int i7 = 0; i7 < lb4Var.I0.size(); i7++) {
                        kb4 kb4Var = (kb4) lb4Var.I0.get(i7);
                        if (lb4Var.M != null || lb4Var.a0 == kb4Var.e) {
                            lb4Var.I0.remove(i7);
                            if (!lb4Var.k(kb4Var, null)) {
                                TLRPC.TL_upload_file tL_upload_file = kb4Var.f;
                                if (tL_upload_file != null) {
                                    tL_upload_file.disableFree = false;
                                    tL_upload_file.freeResources();
                                    return;
                                }
                                TLRPC.TL_upload_webFile tL_upload_webFile = kb4Var.g;
                                if (tL_upload_webFile != null) {
                                    tL_upload_webFile.disableFree = false;
                                    tL_upload_webFile.freeResources();
                                    return;
                                }
                                TLRPC.TL_upload_cdnFile tL_upload_cdnFile = kb4Var.h;
                                if (tL_upload_cdnFile != null) {
                                    tL_upload_cdnFile.disableFree = false;
                                    tL_upload_cdnFile.freeResources();
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                    }
                    return;
                } else {
                    return;
                }
            case 27:
                gm.c3(new pz2((cf4) obj, tL_error, tLObject, (byte) 29));
                return;
            case 28:
                eh4 eh4Var = (eh4) obj;
                if (eh4Var != null) {
                    gm.c3(eh4Var);
                    return;
                }
                return;
            default:
                gm.c3(new yt2((jac) obj, tLObject, tL_error, (byte) 1));
                return;
        }
    }
}
