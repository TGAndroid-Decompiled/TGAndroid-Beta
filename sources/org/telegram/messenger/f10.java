package org.telegram.messenger;

import android.content.res.Resources;
import android.icu.text.Collator;
import android.os.Build;
import android.text.TextUtils;
import android.util.LongSparseArray;
import android.util.Pair;
import android.view.inputmethod.InputMethodInfo;
import android.view.inputmethod.InputMethodManager;
import android.view.inputmethod.InputMethodSubtype;
import j$.util.Comparator$CC;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.k21;
import org.telegram.ui.qy0;
import org.telegram.ui.wn0;
public final class f10 extends c1 {
    public static final List M = Arrays.asList("en", "ar", "zh", "fr", "de", "it", "ja", "ko", "pt", "ru", "es", "uk");
    public static final List N = Arrays.asList("af", "sq", "am", "ar", "hy", "az", "eu", "be", "bn", "bs", "bg", "ca", "ceb", "zh-cn", "zh", "zh-tw", "co", "hr", "cs", "da", "nl", "en", "eo", "et", "fi", "fr", "fy", "gl", "ka", "de", "el", "gu", "ht", "ha", "haw", "he", "hi", "hmn", "hu", "is", "ig", "id", "ga", "it", "ja", "jv", "kn", "kk", "km", "rw", "ko", "ku", "ky", "lo", "la", "lv", "lt", "lb", "mk", "mg", "ms", "ml", "mt", "mi", "mr", "mn", "my", "ne", "no", "ny", "or", "ps", "fa", "pl", "pt", "pt-br", "pa", "ro", "ru", "sm", "gd", "sr", "st", "sn", "sd", "si", "sk", "sl", "so", "es", "su", "sw", "sv", "tl", "tg", "ta", "tt", "te", "th", "tr", "tk", "uk", "ur", "ug", "uz", "vi", "cy", "xh", "yi", "yo", "zu");
    public static LinkedHashSet O = null;
    public final HashMap D;
    public final HashMap E;
    public final HashSet F;
    public final HashMap G;
    public final HashMap H;
    public final HashSet I;
    public final HashSet J;
    public final HashSet K;
    public final HashSet L;
    public final LongSparseArray f22323a;
    public final HashSet f22324b;
    public final HashMap f22325c;
    public final HashMap d;
    public final HashMap f22326e;
    public final HashMap f22327f;
    public final HashSet h;
    public final qp f22328n;
    public Boolean f22329r;
    public Boolean f22330s;
    public final ArrayList f22331w;
    public final HashSet f22332x;
    public final HashSet f22333y;

    public f10(qp qpVar) {
        super(qpVar.currentAccount);
        this.f22323a = new LongSparseArray();
        this.f22324b = new HashSet();
        this.f22325c = new HashMap();
        this.d = new HashMap();
        this.f22326e = new HashMap();
        this.f22327f = new HashMap();
        this.h = new HashSet();
        this.f22331w = new ArrayList();
        this.f22332x = new HashSet();
        this.f22333y = new HashSet();
        this.D = new HashMap();
        this.E = new HashMap();
        this.F = new HashSet();
        this.G = new HashMap();
        this.H = new HashMap();
        this.I = new HashSet();
        this.J = new HashSet();
        this.K = new HashSet();
        this.L = new HashSet();
        this.f22328n = qpVar;
        g0.i3(new ds(this, 17), 150L);
    }

    public static String D(String str) {
        if (str == null) {
            return null;
        }
        if (str.contains("_")) {
            String[] split = str.split("_", 2);
            return split[0].toLowerCase() + "-" + split[1].toUpperCase();
        } else if (str.contains("-")) {
            String[] split2 = str.split("-", 2);
            return split2[0].toLowerCase() + "-" + split2[1].toUpperCase();
        } else {
            return str;
        }
    }

    public static String j() {
        String str = hd.E0().B.f22185f;
        if (str != null) {
            return str.split("_")[0];
        }
        return str;
    }

    public static ArrayList n() {
        ArrayList arrayList = new ArrayList();
        int i7 = 0;
        while (true) {
            List list = N;
            if (i7 >= list.size()) {
                break;
            }
            ?? obj = new Object();
            String str = (String) list.get(i7);
            obj.f26562a = str;
            if ("no".equals(str)) {
                obj.f26562a = "nb";
            }
            obj.f26563b = k21.K0(k21.O0(obj.f26562a, null, null));
            obj.f26564c = k21.K0(k21.V0(obj.f26562a, true));
            if (obj.f26563b != null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(obj.f26563b);
                sb2.append(" ");
                String str2 = obj.f26564c;
                if (str2 == null) {
                    str2 = "";
                }
                sb2.append(str2);
                obj.d = sb2.toString().toLowerCase();
                arrayList.add(obj);
            }
            i7++;
        }
        if (Build.VERSION.SDK_INT >= 24) {
            Collections.sort(arrayList, new n00(Collator.getInstance(Locale.getDefault()), 0));
            return arrayList;
        }
        Collections.sort(arrayList, Comparator$CC.comparing(new aa.l(7)));
        return arrayList;
    }

    public static ArrayList o(String str) {
        ArrayList arrayList = new ArrayList();
        if (O == null) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            try {
                linkedHashSet.add(hd.E0().B.f22185f);
            } catch (Exception e10) {
                a8.g(e10, true);
            }
            try {
                linkedHashSet.add(Resources.getSystem().getConfiguration().locale.getLanguage());
            } catch (Exception e11) {
                a8.g(e11, true);
            }
            try {
                linkedHashSet.addAll(qy0.d0());
            } catch (Exception e12) {
                a8.g(e12, true);
            }
            try {
                InputMethodManager inputMethodManager = (InputMethodManager) t0.f25563b.getSystemService("input_method");
                for (InputMethodInfo inputMethodInfo : inputMethodManager.getEnabledInputMethodList()) {
                    for (InputMethodSubtype inputMethodSubtype : inputMethodManager.getEnabledInputMethodSubtypeList(inputMethodInfo, true)) {
                        if ("keyboard".equals(inputMethodSubtype.getMode())) {
                            String locale = inputMethodSubtype.getLocale();
                            if (locale != null && locale.contains("_")) {
                                locale = locale.split("_")[0];
                            }
                            if (k21.O0(locale, null, null) != null) {
                                linkedHashSet.add(locale);
                            }
                        }
                    }
                }
            } catch (Exception e13) {
                a8.g(e13, true);
            }
            O = linkedHashSet;
        }
        Iterator it = O.iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            if (!TextUtils.equals(str2, str) && (!"no".equals(str) || !"nb".equals(str2))) {
                if (!"nb".equals(str) || !"no".equals(str2)) {
                    ?? obj = new Object();
                    obj.f26562a = str2;
                    if ("no".equals(str2)) {
                        obj.f26562a = "nb";
                    }
                    obj.f26563b = k21.K0(k21.O0(obj.f26562a, null, null));
                    obj.f26564c = k21.K0(k21.V0(obj.f26562a, true));
                    if (obj.f26563b != null) {
                        obj.d = (obj.f26563b + " " + obj.f26564c).toLowerCase();
                        arrayList.add(obj);
                    }
                }
            }
        }
        return arrayList;
    }

    public static boolean x(ij ijVar) {
        TLRPC.Message message;
        if (ijVar != null && (message = ijVar.f23244k) != null && message.summary_from_language != null && !ijVar.Q3() && !ijVar.E0 && !ijVar.s4()) {
            int i7 = ijVar.D;
            if ((i7 == 0 || i7 == 3 || i7 == 1 || i7 == 9 || i7 == 14 || i7 == 17) && !TextUtils.isEmpty(ijVar.f23244k.message) && ijVar.f23244k.message.length() > 100) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static boolean y(ij ijVar) {
        if (ijVar != null && ijVar.f23244k != null && !ijVar.Q3() && !ijVar.E0 && !ijVar.s4() && !(ij.n1(ijVar) instanceof TLRPC.TL_messageMediaWidget)) {
            int i7 = ijVar.D;
            if (i7 == 0 || i7 == 3 || i7 == 1 || i7 == 2 || i7 == 5 || i7 == 9 || i7 == 14 || i7 == 17 || i7 == 36) {
                if (TextUtils.isEmpty(ijVar.f23244k.message) && !(ij.n1(ijVar) instanceof TLRPC.TL_messageMediaPoll)) {
                    TLRPC.Message message = ijVar.f23244k;
                    if (message.rich_message == null && (!message.voiceTranscriptionOpen || TextUtils.isEmpty(message.voiceTranscription) || !ijVar.f23244k.voiceTranscriptionFinal)) {
                        return false;
                    }
                }
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean A(ij ijVar) {
        HashSet hashSet;
        TLRPC.Message message;
        boolean z9 = true;
        if (ijVar != null && (message = ijVar.f23244k) != null && message.summarizedOpen) {
            return this.F.contains(Integer.valueOf(Objects.hash(Long.valueOf(ij.B0(message)), Integer.valueOf(ijVar.f1()), Integer.valueOf(B(ij.B0(ijVar.f23244k)) ? 1 : 0))));
        }
        synchronized (this) {
            if (ijVar != null) {
                try {
                    TLRPC.Message message2 = ijVar.f23244k;
                    if (message2 != null) {
                        if (message2.voiceTranscriptionOpen && message2.voiceTranscriptionFinal) {
                            hashSet = this.f22333y;
                        } else {
                            hashSet = this.f22332x;
                        }
                        if (hashSet.contains(Integer.valueOf(ijVar.f1())) && B(ij.B0(ijVar.f23244k))) {
                        }
                    }
                } finally {
                }
            }
            z9 = false;
        }
        return z9;
    }

    public final boolean B(long j3) {
        if (v(j3)) {
            if (((Boolean) this.f22323a.get(j3, Boolean.valueOf(q(j3)))).booleanValue()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void C(ij ijVar) {
        Long valueOf = Long.valueOf(ij.B0(ijVar.f23244k));
        HashMap hashMap = this.f22327f;
        HashMap hashMap2 = (HashMap) hashMap.get(valueOf);
        if (hashMap2 == null) {
            Long valueOf2 = Long.valueOf(ij.B0(ijVar.f23244k));
            HashMap hashMap3 = new HashMap();
            hashMap.put(valueOf2, hashMap3);
            hashMap2 = hashMap3;
        }
        hashMap2.put(Integer.valueOf(ijVar.f1()), ijVar);
    }

    public final void E(ij ijVar, String str, v00 v00Var) {
        Throwable th2;
        z00 z00Var;
        int i7;
        if (ijVar.f1() >= 0) {
            long B0 = ij.B0(ijVar.f23244k);
            synchronized (this) {
                try {
                    try {
                        ArrayList arrayList = (ArrayList) this.G.get(Long.valueOf(B0));
                        if (arrayList == null) {
                            try {
                                HashMap hashMap = this.G;
                                Long valueOf = Long.valueOf(B0);
                                ArrayList arrayList2 = new ArrayList();
                                hashMap.put(valueOf, arrayList2);
                                arrayList = arrayList2;
                            } catch (Throwable th3) {
                                th2 = th3;
                                throw th2;
                            }
                        }
                        if (arrayList.isEmpty()) {
                            z00Var = new z00();
                            arrayList.add(z00Var);
                        } else {
                            z00Var = (z00) arrayList.get(arrayList.size() - 1);
                        }
                        if (z00Var.f26771b.contains(Integer.valueOf(ijVar.f1()))) {
                            return;
                        }
                        TLRPC.MessageMedia n1 = ij.n1(ijVar);
                        if (!(n1 instanceof TLRPC.TL_messageMediaPoll)) {
                            return;
                        }
                        c10 a10 = c10.a((TLRPC.TL_messageMediaPoll) n1);
                        c10 c10Var = ijVar.f23244k.translatedPoll;
                        TLRPC.TL_textWithEntities tL_textWithEntities = a10.f21734a;
                        if (tL_textWithEntities != null) {
                            i7 = tL_textWithEntities.text.length();
                        } else {
                            i7 = 0;
                        }
                        for (int i10 = 0; i10 < a10.f21735b.size(); i10++) {
                            i7 += ((TLRPC.PollAnswer) a10.f21735b.get(i10)).text.text.length();
                        }
                        TLRPC.TL_textWithEntities tL_textWithEntities2 = a10.f21736c;
                        if (tL_textWithEntities2 != null) {
                            i7 += tL_textWithEntities2.text.length();
                        }
                        if (z00Var.f26775g + i7 >= 25000 || z00Var.f26771b.size() + 1 >= 20) {
                            g0.r(z00Var.f26770a);
                            g0.h3(z00Var.f26770a);
                            z00Var = new z00();
                            arrayList.add(z00Var);
                        }
                        hr hrVar = z00Var.f26770a;
                        if (hrVar != null) {
                            g0.r(hrVar);
                        }
                        this.f22332x.add(Integer.valueOf(ijVar.f1()));
                        z00Var.f26771b.add(Integer.valueOf(ijVar.f1()));
                        a8.b("pending translation +" + ijVar.f1() + " poll message");
                        z00Var.f26772c.add(new Pair(a10, c10Var));
                        z00Var.d.add(v00Var);
                        z00Var.f26773e = str;
                        z00Var.f26775g = z00Var.f26775g + i7;
                        z00 z00Var2 = z00Var;
                        hr hrVar2 = new hr(this, B0, z00Var2, 8);
                        z00Var2.f26770a = hrVar2;
                        g0.i3(hrVar2, z00Var2.f26774f);
                        z00Var2.f26774f /= 2;
                    } catch (Throwable th4) {
                        th = th4;
                        th2 = th;
                        throw th2;
                    }
                } catch (Throwable th5) {
                    th = th5;
                    th2 = th;
                    throw th2;
                }
            }
        }
    }

    public final void F(ij ijVar, String str, c20 c20Var) {
        int i7;
        Long valueOf = Long.valueOf(ij.B0(ijVar.f23244k));
        Integer valueOf2 = Integer.valueOf(ijVar.f1());
        if (str != null) {
            i7 = 1;
        } else {
            i7 = 0;
        }
        int hash = Objects.hash(valueOf, valueOf2, Integer.valueOf(i7));
        Integer valueOf3 = Integer.valueOf(hash);
        HashSet hashSet = this.F;
        if (hashSet.contains(valueOf3)) {
            return;
        }
        hashSet.add(Integer.valueOf(hash));
        TLRPC.TL_messages_summarizeText tL_messages_summarizeText = new TLRPC.TL_messages_summarizeText();
        tL_messages_summarizeText.peer = qp.s1(this.currentAccount).j1(ij.B0(ijVar.f23244k));
        tL_messages_summarizeText.f27075id = ijVar.f1();
        if (str != null) {
            tL_messages_summarizeText.flags |= 1;
            tL_messages_summarizeText.to_lang = D(str);
        }
        ConnectionsManager.getInstance(this.currentAccount).sendRequestTyped(tL_messages_summarizeText, new d3.b(1), new ht(this, hash, c20Var));
    }

    public final void G(org.telegram.messenger.ij r15, java.lang.String r16, org.telegram.messenger.x00 r17) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.f10.G(org.telegram.messenger.ij, java.lang.String, org.telegram.messenger.x00):void");
    }

    public final void H() {
        StringBuilder sb2 = new StringBuilder();
        boolean z9 = true;
        int i7 = 0;
        while (true) {
            LongSparseArray longSparseArray = this.f22323a;
            if (i7 >= longSparseArray.size()) {
                break;
            }
            try {
                long keyAt = longSparseArray.keyAt(i7);
                if (!z9) {
                    sb2.append(";");
                }
                if (z9) {
                    z9 = false;
                }
                String str = (String) this.f22326e.get(Long.valueOf(keyAt));
                String str2 = "null";
                if (str == null) {
                    str = "null";
                }
                String m10 = m(keyAt);
                if (m10 != null) {
                    str2 = m10;
                }
                sb2.append(keyAt);
                sb2.append("=");
                sb2.append(str);
                sb2.append(">");
                sb2.append(str2);
                if (!((Boolean) longSparseArray.valueAt(i7)).booleanValue()) {
                    sb2.append("!");
                }
            } catch (Exception unused) {
            }
            i7++;
        }
        HashSet hashSet = new HashSet();
        Iterator it = this.h.iterator();
        while (it.hasNext()) {
            try {
                hashSet.add("" + it.next());
            } catch (Exception e10) {
                a8.g(e10, true);
            }
        }
        qp.s1(this.currentAccount).f24767e7.edit().putString("translating_dialog_languages2", sb2.toString()).putStringSet("hidden_translation_at", hashSet).apply();
    }

    public final void I(long j3, String str) {
        f10 f10Var;
        long j10;
        String str2;
        Boolean bool;
        if (TextUtils.equals(m(j3), str)) {
            return;
        }
        if (B(j3)) {
            f10Var = this;
            j10 = j3;
            str2 = str;
            g0.i3(new a4(f10Var, j10, str2, 9), 150L);
        } else {
            f10Var = this;
            j10 = j3;
            str2 = str;
            synchronized (this) {
                f10Var.d.put(Long.valueOf(j10), str2);
            }
        }
        c(j10);
        synchronized (this) {
            LongSparseArray longSparseArray = f10Var.f22323a;
            bool = Boolean.FALSE;
            longSparseArray.put(j10, bool);
        }
        qs.f(f10Var.currentAccount).k(qs.P1, Long.valueOf(j10), bool);
        k21.S0(str2);
    }

    public final void J(long j3, boolean z9, boolean z10) {
        TLRPC.TL_messages_togglePeerTranslations tL_messages_togglePeerTranslations = new TLRPC.TL_messages_togglePeerTranslations();
        tL_messages_togglePeerTranslations.peer = getMessagesController().j1(j3);
        tL_messages_togglePeerTranslations.disabled = z9;
        getConnectionsManager().sendRequest(tL_messages_togglePeerTranslations, null);
        TLRPC.ChatFull N0 = getMessagesController().N0(-j3);
        if (N0 != null) {
            N0.translations_disabled = z9;
            getMessagesStorage().N1(N0, true);
        }
        TLRPC.UserFull b22 = getMessagesController().b2(j3);
        if (b22 != null) {
            b22.translations_disabled = z9;
            getMessagesStorage().j2(b22, true);
        }
        synchronized (this) {
            try {
                if (z9) {
                    this.h.add(Long.valueOf(j3));
                    this.f22323a.remove(j3);
                } else {
                    this.h.remove(Long.valueOf(j3));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        H();
        if (!z10) {
            qs.f(this.currentAccount).k(qs.P1, Long.valueOf(j3), Boolean.valueOf(B(j3)));
        }
    }

    public final boolean K(long j3, boolean z9) {
        boolean B = B(j3);
        int i7 = qs.P1;
        boolean z10 = true;
        LongSparseArray longSparseArray = this.f22323a;
        if (z9 && !B) {
            Boolean bool = Boolean.TRUE;
            longSparseArray.put(j3, bool);
            qs.f(this.currentAccount).k(i7, Long.valueOf(j3), bool);
        } else if (!z9 && B) {
            Boolean bool2 = Boolean.FALSE;
            longSparseArray.put(j3, bool2);
            qs.f(this.currentAccount).k(i7, Long.valueOf(j3), bool2);
            c(j3);
        } else {
            z10 = false;
        }
        H();
        return z10;
    }

    public final void L(ij ijVar, wn0 wn0Var) {
        if (ijVar != null && ijVar.f23244k != null) {
            f3.s sVar = new f3.s(ijVar);
            String M0 = k21.M0();
            TLRPC.Message message = ijVar.f23244k;
            if (message.translatedText != null && TextUtils.equals(message.translatedToLanguage, M0)) {
                wn0Var.run();
                return;
            }
            HashSet hashSet = this.L;
            if (hashSet.contains(sVar)) {
                wn0Var.run();
                return;
            }
            hashSet.add(sVar);
            TLRPC.TL_messages_translateText tL_messages_translateText = new TLRPC.TL_messages_translateText();
            tL_messages_translateText.flags |= 2;
            TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
            TLRPC.Message message2 = ijVar.f23244k;
            tL_textWithEntities.text = message2.message;
            ArrayList<TLRPC.MessageEntity> arrayList = message2.entities;
            tL_textWithEntities.entities = arrayList;
            if (arrayList == null) {
                tL_textWithEntities.entities = new ArrayList<>();
            }
            tL_messages_translateText.text.add(tL_textWithEntities);
            tL_messages_translateText.to_lang = D(M0);
            getConnectionsManager().sendRequest(tL_messages_translateText, new mm(this, ijVar, M0, sVar, wn0Var, System.currentTimeMillis(), tL_textWithEntities));
        }
    }

    public final void M(long j3) {
        boolean z9;
        if (v(j3) && t(j3)) {
            boolean contains = this.h.contains(Long.valueOf(j3));
            TLRPC.ChatFull N0 = getMessagesController().N0(-j3);
            if (N0 != null) {
                z9 = N0.translations_disabled;
            } else {
                TLRPC.UserFull b22 = getMessagesController().b2(j3);
                if (b22 != null) {
                    z9 = b22.translations_disabled;
                } else {
                    z9 = false;
                }
            }
            synchronized (this) {
                try {
                    if (z9) {
                        this.h.add(Long.valueOf(j3));
                        this.f22323a.remove(j3);
                    } else {
                        this.h.remove(Long.valueOf(j3));
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (contains != z9) {
                H();
                qs.f(this.currentAccount).k(qs.P1, Long.valueOf(j3), Boolean.valueOf(B(j3)));
            }
        }
    }

    public final boolean b(org.telegram.messenger.ij r3, java.lang.String r4) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.f10.b(org.telegram.messenger.ij, java.lang.String):boolean");
    }

    public final void c(long j3) {
        synchronized (this) {
            try {
                ArrayList arrayList = (ArrayList) this.D.get(Long.valueOf(j3));
                if (arrayList != null) {
                    int size = arrayList.size();
                    int i7 = 0;
                    while (i7 < size) {
                        Object obj = arrayList.get(i7);
                        i7++;
                        b10 b10Var = (b10) obj;
                        g0.r(b10Var.f21573a);
                        if (b10Var.h != -1) {
                            getConnectionsManager().cancelRequest(b10Var.h, true);
                            ArrayList arrayList2 = b10Var.f21574b;
                            int size2 = arrayList2.size();
                            int i10 = 0;
                            while (i10 < size2) {
                                Object obj2 = arrayList2.get(i10);
                                i10++;
                                this.f22332x.remove((Integer) obj2);
                            }
                        }
                    }
                    this.D.remove(Long.valueOf(j3));
                }
                ArrayList arrayList3 = (ArrayList) this.E.get(Long.valueOf(j3));
                if (arrayList3 != null) {
                    int size3 = arrayList3.size();
                    int i11 = 0;
                    while (i11 < size3) {
                        Object obj3 = arrayList3.get(i11);
                        i11++;
                        b10 b10Var2 = (b10) obj3;
                        g0.r(b10Var2.f21573a);
                        if (b10Var2.h != -1) {
                            getConnectionsManager().cancelRequest(b10Var2.h, true);
                            ArrayList arrayList4 = b10Var2.f21574b;
                            int size4 = arrayList4.size();
                            int i12 = 0;
                            while (i12 < size4) {
                                Object obj4 = arrayList4.get(i12);
                                i12++;
                                this.f22333y.remove((Integer) obj4);
                            }
                        }
                    }
                    this.E.remove(Long.valueOf(j3));
                }
                ArrayList arrayList5 = (ArrayList) this.G.get(Long.valueOf(j3));
                if (arrayList5 != null) {
                    int size5 = arrayList5.size();
                    int i13 = 0;
                    while (i13 < size5) {
                        Object obj5 = arrayList5.get(i13);
                        i13++;
                        z00 z00Var = (z00) obj5;
                        g0.r(z00Var.f26770a);
                        if (z00Var.h != -1) {
                            getConnectionsManager().cancelRequest(z00Var.h, true);
                            ArrayList arrayList6 = z00Var.f26771b;
                            int size6 = arrayList6.size();
                            int i14 = 0;
                            while (i14 < size6) {
                                Object obj6 = arrayList6.get(i14);
                                i14++;
                                this.f22332x.remove((Integer) obj6);
                            }
                        }
                    }
                    this.G.remove(Long.valueOf(j3));
                }
                ArrayList arrayList7 = (ArrayList) this.H.get(Long.valueOf(j3));
                if (arrayList7 != null) {
                    int size7 = arrayList7.size();
                    int i15 = 0;
                    while (i15 < size7) {
                        Object obj7 = arrayList7.get(i15);
                        i15++;
                        a10 a10Var = (a10) obj7;
                        g0.r(a10Var.f21364a);
                        if (a10Var.f21368f != -1) {
                            getConnectionsManager().cancelRequest(a10Var.f21368f, true);
                            ArrayList arrayList8 = a10Var.f21365b;
                            int size8 = arrayList8.size();
                            int i16 = 0;
                            while (i16 < size8) {
                                Object obj8 = arrayList8.get(i16);
                                i16++;
                                this.f22332x.remove((Integer) obj8);
                            }
                        }
                    }
                    this.H.remove(Long.valueOf(j3));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void d(long j3) {
        if (v(j3)) {
            e(j3);
        }
    }

    public final void e(long j3) {
        if (!((Boolean) this.f22323a.get(j3, Boolean.valueOf(q(j3)))).booleanValue()) {
            return;
        }
        getMessagesStorage().f26696a.c(new o00(this, j3, 1));
    }

    public final void f(ij ijVar) {
        TLRPC.Message message;
        boolean z9;
        HashSet hashSet;
        int size;
        int i7;
        float f10;
        String str;
        String str2;
        if (ijVar != null && (message = ijVar.f23244k) != null) {
            long B0 = ij.B0(message);
            Long valueOf = Long.valueOf(B0);
            HashMap hashMap = this.f22325c;
            e10 e10Var = (e10) hashMap.get(valueOf);
            if (e10Var == null) {
                Long valueOf2 = Long.valueOf(B0);
                ?? obj = new Object();
                obj.f22144a = new HashSet();
                obj.f22145b = new HashSet();
                obj.f22146c = new HashSet();
                hashMap.put(valueOf2, obj);
                e10Var = obj;
            }
            HashSet hashSet2 = e10Var.f22146c;
            HashSet hashSet3 = e10Var.f22144a;
            HashSet hashSet4 = e10Var.f22145b;
            boolean z10 = false;
            if (y(ijVar) && ((str2 = ijVar.f23244k.originalLanguage) == null || "und".equals(str2))) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (y(ijVar) && (str = ijVar.f23244k.originalLanguage) != null && !"und".equals(str) && !w(ijVar.f23244k.originalLanguage)) {
                z10 = true;
            }
            if (z9) {
                hashSet4.add(Integer.valueOf(ijVar.f1()));
            } else {
                if (z10) {
                    hashSet = hashSet3;
                } else {
                    hashSet = hashSet2;
                }
                hashSet.add(Integer.valueOf(ijVar.f1()));
            }
            if (!z9) {
                this.f22326e.put(Long.valueOf(B0), ijVar.f23244k.originalLanguage);
            }
            int size2 = hashSet3.size();
            int size3 = hashSet4.size();
            int size4 = size2 + size3 + hashSet2.size();
            boolean q10 = q(B0);
            if (q10) {
                i7 = 2;
            } else {
                i7 = 6;
            }
            if (size4 >= i7) {
                if (q10) {
                    if (size2 < 2.0f) {
                        return;
                    }
                } else if (size2 / (size2 + size) < 0.6f) {
                    return;
                }
                float f11 = size3 / size4;
                if (q10) {
                    f10 = 0.8f;
                } else {
                    f10 = 0.65f;
                }
                if (f11 < f10) {
                    this.f22324b.add(Long.valueOf(B0));
                    hashMap.remove(Long.valueOf(B0));
                    g0.i3(new o00(this, B0, 0), 450L);
                }
            }
        }
    }

    public final void g() {
        synchronized (this) {
            try {
                this.f22325c.clear();
                ArrayList arrayList = new ArrayList();
                Iterator it = this.f22324b.iterator();
                while (it.hasNext()) {
                    Long l10 = (Long) it.next();
                    long longValue = l10.longValue();
                    String str = (String) this.f22326e.get(l10);
                    if (str != null && w(str)) {
                        c(longValue);
                        this.f22323a.remove(longValue);
                        arrayList.add(l10);
                    }
                }
                this.f22324b.clear();
                H();
                int size = arrayList.size();
                int i7 = 0;
                while (i7 < size) {
                    Object obj = arrayList.get(i7);
                    i7++;
                    Long l11 = (Long) obj;
                    l11.getClass();
                    qs.f(this.currentAccount).k(qs.P1, l11, Boolean.FALSE);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void h(ij ijVar, boolean z9, final boolean z10) {
        TLRPC.Message message;
        TLRPC.TL_textWithEntities tL_textWithEntities;
        c10 c10Var;
        a10 a10Var;
        TLRPC.TL_textWithEntities tL_textWithEntities2;
        c10 c10Var2;
        ij ijVar2;
        if (ijVar != null && (message = ijVar.f23244k) != null) {
            final long B0 = ij.B0(message);
            final ij ijVar3 = null;
            r2 = null;
            r2 = null;
            String str = null;
            if (z9) {
                TLRPC.Message message2 = ijVar.f23244k;
                if (message2.summarizedOpen && message2.summaryText == null && !B(ij.B0(message2))) {
                    F(ijVar, null, new t00(this, ijVar, B0));
                }
            }
            if (v(B0)) {
                if (!z10 && (ijVar2 = ijVar.C) != null) {
                    h(ijVar2, z9, true);
                }
                if (y(ijVar)) {
                    if (!B(B0)) {
                        TLRPC.Message message3 = ijVar.f23244k;
                        if (message3 != null) {
                            if (!TextUtils.isEmpty(message3.message)) {
                                str = ijVar.f23244k.message;
                            } else if (ijVar.D == 36 && !TextUtils.isEmpty(ijVar.v)) {
                                str = ijVar.v.toString();
                            }
                        }
                        if (y(ijVar) && ijVar.f23244k != null && !TextUtils.isEmpty(str)) {
                            TLRPC.Message message4 = ijVar.f23244k;
                            if (message4.originalLanguage != null) {
                                f(ijVar);
                                return;
                            }
                            long B02 = ij.B0(message4);
                            int hash = Objects.hash(Long.valueOf(ij.B0(ijVar.f23244k)), Integer.valueOf(ijVar.f1()));
                            if (!t(B02) && !this.f22331w.contains(Integer.valueOf(hash))) {
                                this.f22331w.add(Integer.valueOf(hash));
                                Utilities.d.c(new m00(this, str, ijVar, B02, hash, 0));
                            }
                        }
                    } else if (!z(B0)) {
                        String m10 = m(B0);
                        if (!z10 && ijVar.D != 36) {
                            TLRPC.Message message5 = ijVar.f23244k;
                            if (message5.voiceTranscriptionOpen && message5.voiceTranscriptionFinal) {
                                tL_textWithEntities2 = message5.translatedVoiceTranscription;
                            } else {
                                tL_textWithEntities2 = message5.translatedText;
                            }
                            if ((tL_textWithEntities2 == null && message5.translatedPoll == null) || (((c10Var2 = message5.translatedPoll) != null && !c10.b(ijVar, c10Var2)) || !m10.equals(ijVar.f23244k.translatedToLanguage))) {
                                int f12 = ijVar.f1();
                                HashMap hashMap = (HashMap) this.f22327f.get(Long.valueOf(B0));
                                if (hashMap != null) {
                                    ijVar3 = (ij) hashMap.get(Integer.valueOf(f12));
                                }
                                if (ijVar3 != null) {
                                    TLRPC.Message message6 = ijVar.f23244k;
                                    TLRPC.Message message7 = ijVar3.f23244k;
                                    message6.translatedToLanguage = message7.translatedToLanguage;
                                    message6.translatedText = message7.translatedText;
                                    message6.translatedPoll = message7.translatedPoll;
                                    if (!z9 && B(B0)) {
                                        if (ijVar3.D == 36) {
                                            TLRPC.Message message8 = ijVar3.f23244k;
                                            if (message8.translatedRichMessage == null || !m10.equals(message8.translatedToLanguage)) {
                                                qs.f(this.currentAccount).k(qs.N1, ijVar3);
                                                x10 x10Var = new x10(this) {
                                                    public final f10 f25927b;

                                                    {
                                                        this.f25927b = this;
                                                    }

                                                    @Override
                                                    public final void a(Object obj, Object obj2, Object obj3) {
                                                        int i7 = r6;
                                                        long j3 = B0;
                                                        boolean z11 = z10;
                                                        ij ijVar4 = ijVar3;
                                                        f10 f10Var = this.f25927b;
                                                        switch (i7) {
                                                            case 0:
                                                                Integer num = (Integer) obj;
                                                                TL_iv.RichMessage richMessage = (TL_iv.RichMessage) obj2;
                                                                String str2 = (String) obj3;
                                                                if (ijVar4.f1() != num.intValue()) {
                                                                    a8.d("wtf, asked to translate " + ijVar4.f1() + " rich message but got " + num + "!");
                                                                }
                                                                TLRPC.Message message9 = ijVar4.f23244k;
                                                                message9.translatedToLanguage = str2;
                                                                message9.translatedText = null;
                                                                message9.translatedVoiceTranscription = null;
                                                                message9.translatedPoll = null;
                                                                message9.translatedRichMessage = richMessage;
                                                                if (z11) {
                                                                    f10Var.C(ijVar4);
                                                                }
                                                                f10Var.getMessagesStorage().X1(j3, ijVar4.f23244k);
                                                                qs.f(f10Var.currentAccount).k(128, ijVar4);
                                                                ArrayList arrayList = (ArrayList) f10Var.f22328n.R.f(j3);
                                                                if (arrayList != null) {
                                                                    for (int i10 = 0; i10 < arrayList.size(); i10++) {
                                                                        ij ijVar5 = (ij) arrayList.get(i10);
                                                                        if (ijVar5 != null && ijVar5.f1() == ijVar4.f1()) {
                                                                            TLRPC.Message message10 = ijVar5.f23244k;
                                                                            message10.translatedToLanguage = str2;
                                                                            message10.translatedRichMessage = richMessage;
                                                                            if (ijVar5.h6(false)) {
                                                                                qs.f(f10Var.currentAccount).k(2, 0);
                                                                                return;
                                                                            }
                                                                            return;
                                                                        }
                                                                    }
                                                                    return;
                                                                }
                                                                return;
                                                            default:
                                                                Integer num2 = (Integer) obj;
                                                                c10 c10Var3 = (c10) obj2;
                                                                String str3 = (String) obj3;
                                                                boolean z12 = false;
                                                                if (ijVar4.f1() != num2.intValue()) {
                                                                    a8.d("wtf, asked to translate " + ijVar4.f1() + " poll but got " + num2 + "!");
                                                                }
                                                                TLRPC.Message message11 = ijVar4.f23244k;
                                                                message11.translatedToLanguage = str3;
                                                                message11.translatedText = null;
                                                                message11.translatedVoiceTranscription = null;
                                                                message11.translatedPoll = c10Var3;
                                                                if (z11) {
                                                                    f10Var.C(ijVar4);
                                                                }
                                                                f10Var.getMessagesStorage().X1(j3, ijVar4.f23244k);
                                                                qs.f(f10Var.currentAccount).k(128, ijVar4);
                                                                ArrayList arrayList2 = (ArrayList) f10Var.f22328n.R.f(j3);
                                                                if (arrayList2 != null) {
                                                                    int i11 = 0;
                                                                    while (i11 < arrayList2.size()) {
                                                                        ij ijVar6 = (ij) arrayList2.get(i11);
                                                                        if (ijVar6 != null && ijVar6.f1() == ijVar4.f1()) {
                                                                            TLRPC.Message message12 = ijVar6.f23244k;
                                                                            message12.translatedToLanguage = str3;
                                                                            message12.translatedText = null;
                                                                            message12.translatedVoiceTranscription = null;
                                                                            message12.translatedPoll = c10Var3;
                                                                            boolean z13 = z12;
                                                                            if (ijVar6.h6(z13)) {
                                                                                qs f10 = qs.f(f10Var.currentAccount);
                                                                                Object[] objArr = new Object[1];
                                                                                objArr[z13 ? 1 : 0] = Integer.valueOf(z13 ? 1 : 0);
                                                                                f10.k(2, objArr);
                                                                                return;
                                                                            }
                                                                            return;
                                                                        }
                                                                        i11++;
                                                                        z12 = false;
                                                                    }
                                                                    return;
                                                                }
                                                                return;
                                                        }
                                                    }
                                                };
                                                if (ijVar3.f23244k != null && ijVar3.f1() >= 0) {
                                                    TLRPC.Message message9 = ijVar3.f23244k;
                                                    if (message9.rich_message != null) {
                                                        long B03 = ij.B0(message9);
                                                        synchronized (this) {
                                                            try {
                                                                ArrayList arrayList = (ArrayList) this.H.get(Long.valueOf(B03));
                                                                if (arrayList == null) {
                                                                    HashMap hashMap2 = this.H;
                                                                    Long valueOf = Long.valueOf(B03);
                                                                    ArrayList arrayList2 = new ArrayList();
                                                                    hashMap2.put(valueOf, arrayList2);
                                                                    arrayList = arrayList2;
                                                                }
                                                                if (arrayList.isEmpty()) {
                                                                    a10Var = new a10();
                                                                    arrayList.add(a10Var);
                                                                } else {
                                                                    a10Var = (a10) arrayList.get(arrayList.size() - 1);
                                                                }
                                                                if (a10Var.f21365b.contains(Integer.valueOf(ijVar3.f1()))) {
                                                                    return;
                                                                }
                                                                if (a10Var.f21365b.size() + 1 >= 20) {
                                                                    g0.r(a10Var.f21364a);
                                                                    g0.h3(a10Var.f21364a);
                                                                    a10Var = new a10();
                                                                    arrayList.add(a10Var);
                                                                }
                                                                hr hrVar = a10Var.f21364a;
                                                                if (hrVar != null) {
                                                                    g0.r(hrVar);
                                                                }
                                                                this.f22332x.add(Integer.valueOf(ijVar3.f1()));
                                                                a10Var.f21365b.add(Integer.valueOf(ijVar3.f1()));
                                                                a8.b("pending translation +" + ijVar3.f1() + " rich message");
                                                                a10Var.f21366c.add(x10Var);
                                                                a10Var.d = m10;
                                                                a10 a10Var2 = a10Var;
                                                                hr hrVar2 = new hr(this, B03, a10Var2, 7);
                                                                a10Var2.f21364a = hrVar2;
                                                                g0.i3(hrVar2, a10Var2.f21367e);
                                                                a10Var2.f21367e /= 2;
                                                                return;
                                                            } catch (Throwable th2) {
                                                                throw th2;
                                                            }
                                                        }
                                                    }
                                                    return;
                                                }
                                                return;
                                            }
                                            return;
                                        }
                                        TLRPC.Message message10 = ijVar3.f23244k;
                                        if (message10.summarizedOpen) {
                                            if (message10.translatedSummaryText == null || !m10.equals(message10.translatedSummaryLanguage)) {
                                                F(ijVar3, m10, new w00(this, ijVar3, m10, B0));
                                                return;
                                            }
                                            return;
                                        }
                                        if (message10.voiceTranscriptionOpen && message10.voiceTranscriptionFinal) {
                                            tL_textWithEntities = message10.translatedVoiceTranscription;
                                        } else {
                                            tL_textWithEntities = message10.translatedText;
                                        }
                                        if ((tL_textWithEntities == null && message10.translatedPoll == null) || (((c10Var = message10.translatedPoll) != null && !c10.b(ijVar3, c10Var)) || !m10.equals(ijVar3.f23244k.translatedToLanguage))) {
                                            qs.f(this.currentAccount).k(qs.N1, ijVar3);
                                            if (ij.n1(ijVar3) instanceof TLRPC.TL_messageMediaPoll) {
                                                E(ijVar3, m10, new x10(this) {
                                                    public final f10 f25927b;

                                                    {
                                                        this.f25927b = this;
                                                    }

                                                    @Override
                                                    public final void a(Object obj, Object obj2, Object obj3) {
                                                        int i7 = r6;
                                                        long j3 = B0;
                                                        boolean z11 = z10;
                                                        ij ijVar4 = ijVar3;
                                                        f10 f10Var = this.f25927b;
                                                        switch (i7) {
                                                            case 0:
                                                                Integer num = (Integer) obj;
                                                                TL_iv.RichMessage richMessage = (TL_iv.RichMessage) obj2;
                                                                String str2 = (String) obj3;
                                                                if (ijVar4.f1() != num.intValue()) {
                                                                    a8.d("wtf, asked to translate " + ijVar4.f1() + " rich message but got " + num + "!");
                                                                }
                                                                TLRPC.Message message92 = ijVar4.f23244k;
                                                                message92.translatedToLanguage = str2;
                                                                message92.translatedText = null;
                                                                message92.translatedVoiceTranscription = null;
                                                                message92.translatedPoll = null;
                                                                message92.translatedRichMessage = richMessage;
                                                                if (z11) {
                                                                    f10Var.C(ijVar4);
                                                                }
                                                                f10Var.getMessagesStorage().X1(j3, ijVar4.f23244k);
                                                                qs.f(f10Var.currentAccount).k(128, ijVar4);
                                                                ArrayList arrayList3 = (ArrayList) f10Var.f22328n.R.f(j3);
                                                                if (arrayList3 != null) {
                                                                    for (int i10 = 0; i10 < arrayList3.size(); i10++) {
                                                                        ij ijVar5 = (ij) arrayList3.get(i10);
                                                                        if (ijVar5 != null && ijVar5.f1() == ijVar4.f1()) {
                                                                            TLRPC.Message message102 = ijVar5.f23244k;
                                                                            message102.translatedToLanguage = str2;
                                                                            message102.translatedRichMessage = richMessage;
                                                                            if (ijVar5.h6(false)) {
                                                                                qs.f(f10Var.currentAccount).k(2, 0);
                                                                                return;
                                                                            }
                                                                            return;
                                                                        }
                                                                    }
                                                                    return;
                                                                }
                                                                return;
                                                            default:
                                                                Integer num2 = (Integer) obj;
                                                                c10 c10Var3 = (c10) obj2;
                                                                String str3 = (String) obj3;
                                                                boolean z12 = false;
                                                                if (ijVar4.f1() != num2.intValue()) {
                                                                    a8.d("wtf, asked to translate " + ijVar4.f1() + " poll but got " + num2 + "!");
                                                                }
                                                                TLRPC.Message message11 = ijVar4.f23244k;
                                                                message11.translatedToLanguage = str3;
                                                                message11.translatedText = null;
                                                                message11.translatedVoiceTranscription = null;
                                                                message11.translatedPoll = c10Var3;
                                                                if (z11) {
                                                                    f10Var.C(ijVar4);
                                                                }
                                                                f10Var.getMessagesStorage().X1(j3, ijVar4.f23244k);
                                                                qs.f(f10Var.currentAccount).k(128, ijVar4);
                                                                ArrayList arrayList22 = (ArrayList) f10Var.f22328n.R.f(j3);
                                                                if (arrayList22 != null) {
                                                                    int i11 = 0;
                                                                    while (i11 < arrayList22.size()) {
                                                                        ij ijVar6 = (ij) arrayList22.get(i11);
                                                                        if (ijVar6 != null && ijVar6.f1() == ijVar4.f1()) {
                                                                            TLRPC.Message message12 = ijVar6.f23244k;
                                                                            message12.translatedToLanguage = str3;
                                                                            message12.translatedText = null;
                                                                            message12.translatedVoiceTranscription = null;
                                                                            message12.translatedPoll = c10Var3;
                                                                            boolean z13 = z12;
                                                                            if (ijVar6.h6(z13)) {
                                                                                qs f10 = qs.f(f10Var.currentAccount);
                                                                                Object[] objArr = new Object[1];
                                                                                objArr[z13 ? 1 : 0] = Integer.valueOf(z13 ? 1 : 0);
                                                                                f10.k(2, objArr);
                                                                                return;
                                                                            }
                                                                            return;
                                                                        }
                                                                        i11++;
                                                                        z12 = false;
                                                                    }
                                                                    return;
                                                                }
                                                                return;
                                                        }
                                                    }
                                                });
                                                return;
                                            } else {
                                                G(ijVar3, m10, new z10() {
                                                    @Override
                                                    public final void a(Object obj, Object obj2, Object obj3, Object obj4) {
                                                        Boolean bool = (Boolean) obj;
                                                        Integer num = (Integer) obj2;
                                                        TLRPC.TL_textWithEntities tL_textWithEntities3 = (TLRPC.TL_textWithEntities) obj3;
                                                        String str2 = (String) obj4;
                                                        ij ijVar4 = ijVar3;
                                                        if (ijVar4.f1() != num.intValue()) {
                                                            a8.d("wtf, asked to translate " + ijVar4.f1() + " but got " + num + "!");
                                                        }
                                                        ijVar4.f23244k.translatedToLanguage = str2;
                                                        if (bool.booleanValue()) {
                                                            ijVar4.f23244k.translatedVoiceTranscription = tL_textWithEntities3;
                                                        } else {
                                                            ijVar4.f23244k.translatedText = tL_textWithEntities3;
                                                        }
                                                        ijVar4.f23244k.translatedPoll = null;
                                                        f10 f10Var = f10.this;
                                                        if (z10) {
                                                            f10Var.C(ijVar4);
                                                        }
                                                        yr messagesStorage = f10Var.getMessagesStorage();
                                                        TLRPC.Message message11 = ijVar4.f23244k;
                                                        long j3 = B0;
                                                        messagesStorage.X1(j3, message11);
                                                        qs.f(f10Var.currentAccount).k(qs.M1, ijVar4);
                                                        ArrayList arrayList3 = (ArrayList) f10Var.f22328n.R.f(j3);
                                                        if (arrayList3 != null) {
                                                            for (int i7 = 0; i7 < arrayList3.size(); i7++) {
                                                                ij ijVar5 = (ij) arrayList3.get(i7);
                                                                if (ijVar5 != null && ijVar5.f1() == ijVar4.f1()) {
                                                                    ijVar5.f23244k.translatedToLanguage = str2;
                                                                    if (bool.booleanValue()) {
                                                                        ijVar5.f23244k.translatedVoiceTranscription = tL_textWithEntities3;
                                                                    } else {
                                                                        ijVar5.f23244k.translatedText = tL_textWithEntities3;
                                                                    }
                                                                    ijVar5.f23244k.translatedPoll = null;
                                                                    if (ijVar5.h6(false)) {
                                                                        qs.f(f10Var.currentAccount).k(qs.f25054r, 0);
                                                                        return;
                                                                    }
                                                                    return;
                                                                }
                                                            }
                                                        }
                                                    }
                                                });
                                                return;
                                            }
                                        } else if (z10) {
                                            C(ijVar3);
                                            return;
                                        } else {
                                            return;
                                        }
                                    }
                                }
                            }
                        }
                        ijVar3 = ijVar;
                        if (!z9) {
                        }
                    }
                }
            }
        }
    }

    public final void i() {
        synchronized (this) {
            try {
                for (ArrayList arrayList : this.D.values()) {
                    if (arrayList != null) {
                        int size = arrayList.size();
                        int i7 = 0;
                        while (i7 < size) {
                            Object obj = arrayList.get(i7);
                            i7++;
                            b10 b10Var = (b10) obj;
                            g0.r(b10Var.f21573a);
                            if (b10Var.h != -1) {
                                getConnectionsManager().cancelRequest(b10Var.h, true);
                                ArrayList arrayList2 = b10Var.f21574b;
                                int size2 = arrayList2.size();
                                int i10 = 0;
                                while (i10 < size2) {
                                    Object obj2 = arrayList2.get(i10);
                                    i10++;
                                    this.f22332x.remove((Integer) obj2);
                                }
                            }
                        }
                    }
                }
                for (ArrayList arrayList3 : this.E.values()) {
                    if (arrayList3 != null) {
                        int size3 = arrayList3.size();
                        int i11 = 0;
                        while (i11 < size3) {
                            Object obj3 = arrayList3.get(i11);
                            i11++;
                            b10 b10Var2 = (b10) obj3;
                            g0.r(b10Var2.f21573a);
                            if (b10Var2.h != -1) {
                                getConnectionsManager().cancelRequest(b10Var2.h, true);
                                ArrayList arrayList4 = b10Var2.f21574b;
                                int size4 = arrayList4.size();
                                int i12 = 0;
                                while (i12 < size4) {
                                    Object obj4 = arrayList4.get(i12);
                                    i12++;
                                    this.f22333y.remove((Integer) obj4);
                                }
                            }
                        }
                    }
                }
                for (ArrayList arrayList5 : this.G.values()) {
                    if (arrayList5 != null) {
                        int size5 = arrayList5.size();
                        int i13 = 0;
                        while (i13 < size5) {
                            Object obj5 = arrayList5.get(i13);
                            i13++;
                            z00 z00Var = (z00) obj5;
                            g0.r(z00Var.f26770a);
                            if (z00Var.h != -1) {
                                getConnectionsManager().cancelRequest(z00Var.h, true);
                                ArrayList arrayList6 = z00Var.f26771b;
                                int size6 = arrayList6.size();
                                int i14 = 0;
                                while (i14 < size6) {
                                    Object obj6 = arrayList6.get(i14);
                                    i14++;
                                    this.f22332x.remove((Integer) obj6);
                                }
                            }
                        }
                    }
                }
                for (ArrayList arrayList7 : this.H.values()) {
                    if (arrayList7 != null) {
                        int size7 = arrayList7.size();
                        int i15 = 0;
                        while (i15 < size7) {
                            Object obj7 = arrayList7.get(i15);
                            i15++;
                            a10 a10Var = (a10) obj7;
                            g0.r(a10Var.f21364a);
                            if (a10Var.f21368f != -1) {
                                getConnectionsManager().cancelRequest(a10Var.f21368f, true);
                                ArrayList arrayList8 = a10Var.f21365b;
                                int size8 = arrayList8.size();
                                int i16 = 0;
                                while (i16 < size8) {
                                    Object obj8 = arrayList8.get(i16);
                                    i16++;
                                    this.f22332x.remove((Integer) obj8);
                                }
                            }
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        qp.s1(this.currentAccount).f24767e7.edit().remove("translating_dialog_languages2").remove("hidden_translation_at").apply();
        this.f22323a.clear();
        this.f22324b.clear();
        this.f22325c.clear();
        this.d.clear();
        this.f22326e.clear();
        this.f22327f.clear();
        this.h.clear();
        this.f22332x.clear();
        this.f22333y.clear();
    }

    public final void k(ij ijVar, bi.ya yaVar) {
        TLRPC.Message message = ijVar.f23244k;
        if (message != null && !TextUtils.isEmpty(message.message)) {
            if (!TextUtils.isEmpty(ijVar.f23244k.originalLanguage)) {
                yaVar.a(ijVar.f23244k.originalLanguage);
                return;
            }
            f3.s sVar = new f3.s(ijVar);
            HashSet hashSet = this.K;
            if (!hashSet.contains(sVar)) {
                hashSet.add(sVar);
                b6.d(ijVar.f23244k.message, new l00(this, ijVar, sVar, yaVar), new l00(this, ijVar, sVar, yaVar), false);
            }
        }
    }

    public final void l(TL_stories.StoryItem storyItem) {
        String str;
        if (storyItem != null && storyItem.detectedLng == null && (str = storyItem.caption) != null && str.length() != 0) {
            ?? obj = new Object();
            HashSet hashSet = this.I;
            if (!hashSet.contains(obj)) {
                hashSet.add(obj);
                b6.d(storyItem.caption, new s00(this, storyItem, obj), new s00(this, storyItem, obj), false);
            }
        }
    }

    public final String m(long j3) {
        String str = (String) this.d.get(Long.valueOf(j3));
        if (str == null && ((str = k21.M0()) == null || str.equals((String) this.f22326e.get(Long.valueOf(j3))))) {
            str = j();
        }
        if ("nb".equals(str)) {
            return "no";
        }
        return str;
    }

    public final void p(ij ijVar) {
        TLRPC.Message message = ijVar.f23244k;
        if (message != null) {
            long B0 = ij.B0(message);
            if (!v(B0)) {
                return;
            }
            TLRPC.Message message2 = ijVar.f23244k;
            message2.translatedToLanguage = null;
            message2.translatedText = null;
            message2.translatedVoiceTranscription = null;
            message2.translatedPoll = null;
            message2.summaryText = null;
            message2.translatedSummaryText = null;
            message2.translatedSummaryLanguage = null;
            getMessagesStorage().X1(B0, ijVar.f23244k);
            g0.h3(new a4(this, ijVar, B0, 8));
        }
    }

    public final boolean q(long j3) {
        TLRPC.Chat M0;
        if (!t(j3) || (M0 = getMessagesController().M0(Long.valueOf(-j3))) == null || !M0.autotranslation) {
            return false;
        }
        return true;
    }

    public final boolean r() {
        if (!getMessagesController().G2()) {
            return false;
        }
        if (this.f22329r == null) {
            this.f22329r = Boolean.valueOf(this.f22328n.f24767e7.getBoolean("translate_chat_button", true));
        }
        return this.f22329r.booleanValue();
    }

    public final boolean s() {
        if (!getMessagesController().H2()) {
            return false;
        }
        if (this.f22330s == null) {
            this.f22330s = Boolean.valueOf(this.f22328n.f24767e7.getBoolean("translate_button", qp.e1().getBoolean("translate_button", false)));
        }
        return this.f22330s.booleanValue();
    }

    public final boolean t(long j3) {
        if (this.f22324b.contains(Long.valueOf(j3)) && v(j3) && !m5.C(j3) && getUserConfig().e() != j3) {
            return true;
        }
        return false;
    }

    public final boolean u() {
        if (r() && p10.i(this.currentAccount).q()) {
            return true;
        }
        return false;
    }

    public final boolean v(long j3) {
        if (!r()) {
            return false;
        }
        TLRPC.Chat M0 = getMessagesController().M0(Long.valueOf(-j3));
        if (!p10.i(this.currentAccount).q()) {
            if (M0 == null || !M0.autotranslation) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final boolean w(String str) {
        if (getUserConfig().q()) {
            return qy0.d0().contains(str);
        }
        try {
            return TextUtils.equals(hd.E0().B.f22185f, str);
        } catch (Exception unused) {
            return false;
        }
    }

    public final boolean z(long j3) {
        if (this.h.contains(Long.valueOf(j3))) {
            return true;
        }
        TLRPC.ChatFull N0 = getMessagesController().N0(-j3);
        if (N0 != null) {
            return N0.translations_disabled;
        }
        TLRPC.UserFull b22 = getMessagesController().b2(j3);
        if (b22 != null) {
            return b22.translations_disabled;
        }
        return false;
    }
}
