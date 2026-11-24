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
public final class tf implements RequestDelegate {
    public final byte a;
    public final Object b;

    public tf(Object obj, byte b) {
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
        byte b = this.a;
        int i = 0;
        Object obj = this.b;
        switch (b) {
            case 0:
                j5 j5Var = (j5) obj;
                if (tLObject instanceof TLRPC.Updates) {
                    na7.q1(j5Var.a).R3((TLRPC.Updates) tLObject, false);
                    return;
                }
                return;
            case 1:
                gl.c3(new nn6((hs) obj, tL_error, tLObject, (byte) 9));
                return;
            case 2:
                gl.c3(new nn6((bd0) obj, tL_error, tLObject, (byte) 15));
                return;
            case 3:
                gl.c3(new z20((oj0) obj, tLObject, (byte) 7));
                return;
            case 4:
                xy9 xy9Var = (xy9) obj;
                if (tLObject != null) {
                    TLRPC.TL_help_countriesList tL_help_countriesList = (TLRPC.TL_help_countriesList) tLObject;
                    HashMap hashMap = new HashMap();
                    ArrayList arrayList = new ArrayList();
                    for (int i2 = 0; i2 < tL_help_countriesList.countries.size(); i2++) {
                        TLRPC.TL_help_country tL_help_country = tL_help_countriesList.countries.get(i2);
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
                                arrayList.add(upperCase);
                            }
                            list.add(tL_help_country);
                        }
                    }
                    if (Build.VERSION.SDK_INT >= 24) {
                        if (k96.D0().y != null) {
                            locale = k96.D0().y;
                        } else {
                            locale = Locale.getDefault();
                        }
                        Collator collator = Collator.getInstance(locale);
                        Objects.requireNonNull(collator);
                        saVar = new in0(collator, (byte) 0);
                    } else {
                        saVar = new sa((byte) 9);
                    }
                    Collections.sort(arrayList, saVar);
                    for (List list2 : hashMap.values()) {
                        Collections.sort(list2, new jn0(saVar, (byte) 0));
                    }
                    gl.c3(new nn6(xy9Var, hashMap, arrayList, (byte) 20));
                    return;
                }
                return;
            case 5:
                be2 be2Var = (be2) obj;
                if (tLObject != null) {
                    TLRPC.TL_help_countriesList tL_help_countriesList2 = (TLRPC.TL_help_countriesList) tLObject;
                    HashMap hashMap2 = new HashMap();
                    ArrayList arrayList2 = new ArrayList();
                    for (int i3 = 0; i3 < tL_help_countriesList2.countries.size(); i3++) {
                        TLRPC.TL_help_country tL_help_country2 = tL_help_countriesList2.countries.get(i3);
                        boolean equalsIgnoreCase = tL_help_country2.iso2.equalsIgnoreCase("FT");
                        String str3 = tL_help_country2.name;
                        if (str3 != null) {
                            tL_help_country2.default_name = str3;
                        }
                        if (!tL_help_country2.hidden || equalsIgnoreCase) {
                            if (equalsIgnoreCase) {
                                String M0 = k96.M0(2131750504, null);
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
                        if (k96.D0().y != null) {
                            locale2 = k96.D0().y;
                        } else {
                            locale2 = Locale.getDefault();
                        }
                        Collator collator2 = Collator.getInstance(locale2);
                        Objects.requireNonNull(collator2);
                        saVar2 = new in0(collator2, (byte) 0);
                    } else {
                        saVar2 = new sa((byte) 9);
                    }
                    Collections.sort(arrayList2, saVar2);
                    for (List list4 : hashMap2.values()) {
                        Collections.sort(list4, new jn0(saVar2, (byte) 1));
                    }
                    gl.c3(new nn6(be2Var, hashMap2, arrayList2, (byte) 23));
                    return;
                }
                return;
            case 6:
                gl.c3(new z20((zs0) obj, tLObject, (byte) 16));
                return;
            case 7:
                gl.c3(new z20((at0) obj, tLObject, (byte) 17));
                return;
            case 8:
                gl.c3(new q21((p31) obj, tLObject, (byte) 1));
                return;
            case 9:
                y31 y31Var = (y31) obj;
                y31Var.getClass();
                gl.c3(new fv0(y31Var, tL_error, tLObject, (byte) 5));
                return;
            case 10:
                gl.c3(new fv0((z81) obj, tL_error, tLObject, (byte) 12));
                return;
            case 11:
                gl.c3(new kx1((s12) obj, tL_error, (byte) 10));
                return;
            case 12:
                gl.c3(new hq1((m82) obj, (byte) 20));
                return;
            case 13:
                gl.c3(new n92((x92) obj, tLObject, (byte) 1));
                return;
            case 14:
                kf2 kf2Var = (kf2) obj;
                if (tLObject != null) {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                    kf2Var.getMessagesController().R3(updates, false);
                    if (!updates.chats.isEmpty()) {
                        gl.d3(new n92(kf2Var, updates, (byte) 16), 1000L);
                        return;
                    }
                    return;
                }
                return;
            case 15:
                it2 it2Var = (it2) obj;
                it2Var.getClass();
                gl.c3(new ws2(it2Var, (byte) 2));
                return;
            case 16:
                gl.c3(new gu2((f13) obj, tLObject, (byte) 15));
                return;
            case 17:
                DataSettingsActivity dataSettingsActivity = (DataSettingsActivity) obj;
                dataSettingsActivity.getClass();
                gl.c3(new i63(dataSettingsActivity, (byte) 0));
                return;
            case 18:
                gl.c3(new wc3((uj3) obj, tLObject, (byte) 9));
                return;
            case 19:
                mt9 mt9Var = (mt9) obj;
                mt9Var.getClass();
                gl.c3(new wc3(mt9Var, tLObject, (byte) 11));
                return;
            case 20:
                CountDownLatch countDownLatch = (CountDownLatch) obj;
                if (tLObject instanceof Vector) {
                    ArrayList arrayList3 = new ArrayList();
                    ArrayList<T> arrayList4 = ((Vector) tLObject).objects;
                    int size = arrayList4.size();
                    while (i < size) {
                        Object obj2 = arrayList4.get(i);
                        i++;
                        if (obj2 instanceof TLRPC.TL_transcriptionModel) {
                            TLRPC.TL_transcriptionModel tL_transcriptionModel = (TLRPC.TL_transcriptionModel) obj2;
                            if (tL_transcriptionModel.document instanceof TLRPC.TL_document) {
                                arrayList3.add(tL_transcriptionModel);
                            }
                        }
                    }
                    synchronized (zm3.class) {
                        zm3.a = arrayList3;
                        zm3.k(arrayList3);
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
                    ir2.x(sb, str, "Dictation");
                }
                synchronized (zm3.class) {
                    zm3.c = null;
                }
                countDownLatch.countDown();
                return;
            case 21:
                gl.c3(new ee2((up3) obj, tLObject, (byte) 2));
                return;
            case 22:
                gl.c3(new eu3((lv3) obj, tLObject, (byte) 2));
                return;
            case 23:
                gl.c3(new eu3((pz3) obj, tLObject, (byte) 5));
                return;
            case 24:
                y04 y04Var = (y04) obj;
                if (tLObject != null) {
                    gl.c3(new eu3(y04Var, tLObject, (byte) 10));
                    return;
                }
                return;
            case 25:
                l94 l94Var = (l94) obj;
                if (tL_error != null) {
                    l94Var.h(0, false);
                    return;
                } else if (tLObject instanceof Vector) {
                    l94Var.E0 = false;
                    Vector vector = (Vector) tLObject;
                    if (!vector.objects.isEmpty()) {
                        if (l94Var.q0 == null) {
                            l94Var.q0 = new HashMap();
                        }
                        for (int i4 = 0; i4 < vector.objects.size(); i4++) {
                            TLRPC.TL_fileHash tL_fileHash = (TLRPC.TL_fileHash) vector.objects.get(i4);
                            l94Var.q0.put(Long.valueOf(tL_fileHash.offset), tL_fileHash);
                        }
                    }
                    for (int i5 = 0; i5 < l94Var.I0.size(); i5++) {
                        k94 k94Var = (k94) l94Var.I0.get(i5);
                        if (l94Var.M != null || l94Var.a0 == k94Var.e) {
                            l94Var.I0.remove(i5);
                            if (!l94Var.k(k94Var, null)) {
                                TLRPC.TL_upload_file tL_upload_file = k94Var.f;
                                if (tL_upload_file != null) {
                                    tL_upload_file.disableFree = false;
                                    tL_upload_file.freeResources();
                                    return;
                                }
                                TLRPC.TL_upload_webFile tL_upload_webFile = k94Var.g;
                                if (tL_upload_webFile != null) {
                                    tL_upload_webFile.disableFree = false;
                                    tL_upload_webFile.freeResources();
                                    return;
                                }
                                TLRPC.TL_upload_cdnFile tL_upload_cdnFile = k94Var.h;
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
            case 26:
                gl.c3(new mg3((cd4) obj, tL_error, tLObject, (byte) 27));
                return;
            case 27:
                df4 df4Var = (df4) obj;
                if (df4Var != null) {
                    gl.c3(df4Var);
                    return;
                }
                return;
            case 28:
                gl.c3(new ns2((i8c) obj, tLObject, tL_error, (byte) 1));
                return;
            default:
                gl.c3(new vc4((tz4) obj, tLObject, (byte) 16));
                return;
        }
    }
}
