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
import org.telegram.ui.Components.n31;
import org.telegram.ui.e01;
import org.telegram.ui.hp0;
public final class u10 extends f1 {
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
    public final LongSparseArray f18349a;
    public final HashSet f18350b;
    public final HashMap f18351c;
    public final HashMap d;
    public final HashMap e;
    public final HashMap f18352f;
    public final HashSet h;
    public final wp f18353n;
    public Boolean f18354r;
    public Boolean f18355s;
    public final ArrayList f18356w;
    public final HashSet f18357x;
    public final HashSet f18358y;

    public u10(wp wpVar) {
        super(wpVar.currentAccount);
        this.f18349a = new LongSparseArray();
        this.f18350b = new HashSet();
        this.f18351c = new HashMap();
        this.d = new HashMap();
        this.e = new HashMap();
        this.f18352f = new HashMap();
        this.h = new HashSet();
        this.f18356w = new ArrayList();
        this.f18357x = new HashSet();
        this.f18358y = new HashSet();
        this.D = new HashMap();
        this.E = new HashMap();
        this.F = new HashSet();
        this.G = new HashMap();
        this.H = new HashMap();
        this.I = new HashSet();
        this.J = new HashSet();
        this.K = new HashSet();
        this.L = new HashSet();
        this.f18353n = wpVar;
        i0.h3(new ns(this, 18), 150L);
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
        String str = dd.D0().B.f14594f;
        if (str != null) {
            return str.split("_")[0];
        }
        return str;
    }

    public static ArrayList n() {
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        while (true) {
            List list = N;
            if (i10 >= list.size()) {
                break;
            }
            ?? obj = new Object();
            String str = (String) list.get(i10);
            obj.f17246a = str;
            if ("no".equals(str)) {
                obj.f17246a = "nb";
            }
            obj.f17247b = n31.K0(n31.O0(obj.f17246a, null, null));
            obj.f17248c = n31.K0(n31.V0(obj.f17246a, true));
            if (obj.f17247b != null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(obj.f17247b);
                sb2.append(" ");
                String str2 = obj.f17248c;
                if (str2 == null) {
                    str2 = "";
                }
                sb2.append(str2);
                obj.d = sb2.toString().toLowerCase();
                arrayList.add(obj);
            }
            i10++;
        }
        if (Build.VERSION.SDK_INT >= 24) {
            Collections.sort(arrayList, new b10(Collator.getInstance(Locale.getDefault()), 0));
            return arrayList;
        }
        Collections.sort(arrayList, Comparator$CC.comparing(new k2.f(5)));
        return arrayList;
    }

    public static ArrayList o(String str) {
        ArrayList arrayList = new ArrayList();
        if (O == null) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            try {
                linkedHashSet.add(dd.D0().B.f14594f);
            } catch (Exception e) {
                f8.g(e, true);
            }
            try {
                linkedHashSet.add(Resources.getSystem().getConfiguration().locale.getLanguage());
            } catch (Exception e7) {
                f8.g(e7, true);
            }
            try {
                linkedHashSet.addAll(e01.d0());
            } catch (Exception e10) {
                f8.g(e10, true);
            }
            try {
                InputMethodManager inputMethodManager = (InputMethodManager) w0.f18945b.getSystemService("input_method");
                for (InputMethodInfo inputMethodInfo : inputMethodManager.getEnabledInputMethodList()) {
                    for (InputMethodSubtype inputMethodSubtype : inputMethodManager.getEnabledInputMethodSubtypeList(inputMethodInfo, true)) {
                        if ("keyboard".equals(inputMethodSubtype.getMode())) {
                            String locale = inputMethodSubtype.getLocale();
                            if (locale != null && locale.contains("_")) {
                                locale = locale.split("_")[0];
                            }
                            if (n31.O0(locale, null, null) != null) {
                                linkedHashSet.add(locale);
                            }
                        }
                    }
                }
            } catch (Exception e11) {
                f8.g(e11, true);
            }
            O = linkedHashSet;
        }
        Iterator it = O.iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            if (!TextUtils.equals(str2, str) && (!"no".equals(str) || !"nb".equals(str2))) {
                if (!"nb".equals(str) || !"no".equals(str2)) {
                    ?? obj = new Object();
                    obj.f17246a = str2;
                    if ("no".equals(str2)) {
                        obj.f17246a = "nb";
                    }
                    obj.f17247b = n31.K0(n31.O0(obj.f17246a, null, null));
                    obj.f17248c = n31.K0(n31.V0(obj.f17246a, true));
                    if (obj.f17247b != null) {
                        obj.d = (obj.f17247b + " " + obj.f17248c).toLowerCase();
                        arrayList.add(obj);
                    }
                }
            }
        }
        return arrayList;
    }

    public static boolean x(kj kjVar) {
        TLRPC.Message message;
        if (kjVar != null && (message = kjVar.f16690k) != null && message.summary_from_language != null && !kjVar.P3() && !kjVar.E0 && !kjVar.r4()) {
            int i10 = kjVar.D;
            if ((i10 == 0 || i10 == 3 || i10 == 1 || i10 == 9 || i10 == 14 || i10 == 17) && !TextUtils.isEmpty(kjVar.f16690k.message) && kjVar.f16690k.message.length() > 100) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static boolean y(kj kjVar) {
        if (kjVar != null && kjVar.f16690k != null && !kjVar.P3() && !kjVar.E0 && !kjVar.r4() && !(kj.n1(kjVar) instanceof TLRPC.TL_messageMediaWidget)) {
            int i10 = kjVar.D;
            if (i10 == 0 || i10 == 3 || i10 == 1 || i10 == 2 || i10 == 5 || i10 == 9 || i10 == 14 || i10 == 17 || i10 == 36) {
                if (TextUtils.isEmpty(kjVar.f16690k.message) && !(kj.n1(kjVar) instanceof TLRPC.TL_messageMediaPoll)) {
                    TLRPC.Message message = kjVar.f16690k;
                    if (message.rich_message == null && (!message.voiceTranscriptionOpen || TextUtils.isEmpty(message.voiceTranscription) || !kjVar.f16690k.voiceTranscriptionFinal)) {
                        return false;
                    }
                }
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean A(kj kjVar) {
        HashSet hashSet;
        TLRPC.Message message;
        boolean z10 = true;
        if (kjVar != null && (message = kjVar.f16690k) != null && message.summarizedOpen) {
            return this.F.contains(Integer.valueOf(Objects.hash(Long.valueOf(kj.B0(message)), Integer.valueOf(kjVar.f1()), Integer.valueOf(B(kj.B0(kjVar.f16690k)) ? 1 : 0))));
        }
        synchronized (this) {
            if (kjVar != null) {
                try {
                    TLRPC.Message message2 = kjVar.f16690k;
                    if (message2 != null) {
                        if (message2.voiceTranscriptionOpen && message2.voiceTranscriptionFinal) {
                            hashSet = this.f18358y;
                        } else {
                            hashSet = this.f18357x;
                        }
                        if (hashSet.contains(Integer.valueOf(kjVar.f1())) && B(kj.B0(kjVar.f16690k))) {
                        }
                    }
                } finally {
                }
            }
            z10 = false;
        }
        return z10;
    }

    public final boolean B(long j10) {
        if (v(j10)) {
            if (((Boolean) this.f18349a.get(j10, Boolean.valueOf(q(j10)))).booleanValue()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void C(kj kjVar) {
        Long valueOf = Long.valueOf(kj.B0(kjVar.f16690k));
        HashMap hashMap = this.f18352f;
        HashMap hashMap2 = (HashMap) hashMap.get(valueOf);
        if (hashMap2 == null) {
            Long valueOf2 = Long.valueOf(kj.B0(kjVar.f16690k));
            HashMap hashMap3 = new HashMap();
            hashMap.put(valueOf2, hashMap3);
            hashMap2 = hashMap3;
        }
        hashMap2.put(Integer.valueOf(kjVar.f1()), kjVar);
    }

    public final void E(kj kjVar, String str, k10 k10Var) {
        Throwable th2;
        o10 o10Var;
        int i10;
        if (kjVar.f1() >= 0) {
            long B0 = kj.B0(kjVar.f16690k);
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
                            o10Var = new o10();
                            arrayList.add(o10Var);
                        } else {
                            o10Var = (o10) arrayList.get(arrayList.size() - 1);
                        }
                        if (o10Var.f17375b.contains(Integer.valueOf(kjVar.f1()))) {
                            return;
                        }
                        TLRPC.MessageMedia n12 = kj.n1(kjVar);
                        if (!(n12 instanceof TLRPC.TL_messageMediaPoll)) {
                            return;
                        }
                        r10 a2 = r10.a((TLRPC.TL_messageMediaPoll) n12);
                        r10 r10Var = kjVar.f16690k.translatedPoll;
                        TLRPC.TL_textWithEntities tL_textWithEntities = a2.f17886a;
                        if (tL_textWithEntities != null) {
                            i10 = tL_textWithEntities.text.length();
                        } else {
                            i10 = 0;
                        }
                        for (int i11 = 0; i11 < a2.f17887b.size(); i11++) {
                            i10 += ((TLRPC.PollAnswer) a2.f17887b.get(i11)).text.text.length();
                        }
                        TLRPC.TL_textWithEntities tL_textWithEntities2 = a2.f17888c;
                        if (tL_textWithEntities2 != null) {
                            i10 += tL_textWithEntities2.text.length();
                        }
                        if (o10Var.f17378g + i10 >= 25000 || o10Var.f17375b.size() + 1 >= 20) {
                            i0.r(o10Var.f17374a);
                            i0.g3(o10Var.f17374a);
                            o10Var = new o10();
                            arrayList.add(o10Var);
                        }
                        pr prVar = o10Var.f17374a;
                        if (prVar != null) {
                            i0.r(prVar);
                        }
                        this.f18357x.add(Integer.valueOf(kjVar.f1()));
                        o10Var.f17375b.add(Integer.valueOf(kjVar.f1()));
                        f8.b("pending translation +" + kjVar.f1() + " poll message");
                        o10Var.f17376c.add(new Pair(a2, r10Var));
                        o10Var.d.add(k10Var);
                        o10Var.e = str;
                        o10Var.f17378g = o10Var.f17378g + i10;
                        o10 o10Var2 = o10Var;
                        pr prVar2 = new pr(this, B0, o10Var2, 8);
                        o10Var2.f17374a = prVar2;
                        i0.h3(prVar2, o10Var2.f17377f);
                        o10Var2.f17377f /= 2;
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

    public final void F(kj kjVar, String str, r20 r20Var) {
        int i10;
        Long valueOf = Long.valueOf(kj.B0(kjVar.f16690k));
        Integer valueOf2 = Integer.valueOf(kjVar.f1());
        if (str != null) {
            i10 = 1;
        } else {
            i10 = 0;
        }
        int hash = Objects.hash(valueOf, valueOf2, Integer.valueOf(i10));
        Integer valueOf3 = Integer.valueOf(hash);
        HashSet hashSet = this.F;
        if (hashSet.contains(valueOf3)) {
            return;
        }
        hashSet.add(Integer.valueOf(hash));
        TLRPC.TL_messages_summarizeText tL_messages_summarizeText = new TLRPC.TL_messages_summarizeText();
        tL_messages_summarizeText.peer = wp.r1(this.currentAccount).i1(kj.B0(kjVar.f16690k));
        tL_messages_summarizeText.f19916id = kjVar.f1();
        if (str != null) {
            tL_messages_summarizeText.flags |= 1;
            tL_messages_summarizeText.to_lang = D(str);
        }
        ConnectionsManager.getInstance(this.currentAccount).sendRequestTyped(tL_messages_summarizeText, new a3.b(1), new ut(this, hash, r20Var));
    }

    public final void G(org.telegram.messenger.kj r15, java.lang.String r16, org.telegram.messenger.m10 r17) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.u10.G(org.telegram.messenger.kj, java.lang.String, org.telegram.messenger.m10):void");
    }

    public final void H() {
        StringBuilder sb2 = new StringBuilder();
        boolean z10 = true;
        int i10 = 0;
        while (true) {
            LongSparseArray longSparseArray = this.f18349a;
            if (i10 >= longSparseArray.size()) {
                break;
            }
            try {
                long keyAt = longSparseArray.keyAt(i10);
                if (!z10) {
                    sb2.append(";");
                }
                if (z10) {
                    z10 = false;
                }
                String str = (String) this.e.get(Long.valueOf(keyAt));
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
                if (!((Boolean) longSparseArray.valueAt(i10)).booleanValue()) {
                    sb2.append("!");
                }
            } catch (Exception unused) {
            }
            i10++;
        }
        HashSet hashSet = new HashSet();
        Iterator it = this.h.iterator();
        while (it.hasNext()) {
            try {
                hashSet.add("" + it.next());
            } catch (Exception e) {
                f8.g(e, true);
            }
        }
        wp.r1(this.currentAccount).f7.edit().putString("translating_dialog_languages2", sb2.toString()).putStringSet("hidden_translation_at", hashSet).apply();
    }

    public final void I(long j10, String str) {
        u10 u10Var;
        long j11;
        String str2;
        Boolean bool;
        if (TextUtils.equals(m(j10), str)) {
            return;
        }
        if (B(j10)) {
            u10Var = this;
            j11 = j10;
            str2 = str;
            i0.h3(new d4(u10Var, j11, str2, 9), 150L);
        } else {
            u10Var = this;
            j11 = j10;
            str2 = str;
            synchronized (this) {
                u10Var.d.put(Long.valueOf(j11), str2);
            }
        }
        c(j11);
        synchronized (this) {
            LongSparseArray longSparseArray = u10Var.f18349a;
            bool = Boolean.FALSE;
            longSparseArray.put(j11, bool);
        }
        at.f(u10Var.currentAccount).k(at.P1, Long.valueOf(j11), bool);
        n31.S0(str2);
    }

    public final void J(long j10, boolean z10, boolean z11) {
        TLRPC.TL_messages_togglePeerTranslations tL_messages_togglePeerTranslations = new TLRPC.TL_messages_togglePeerTranslations();
        tL_messages_togglePeerTranslations.peer = getMessagesController().i1(j10);
        tL_messages_togglePeerTranslations.disabled = z10;
        getConnectionsManager().sendRequest(tL_messages_togglePeerTranslations, null);
        TLRPC.ChatFull M0 = getMessagesController().M0(-j10);
        if (M0 != null) {
            M0.translations_disabled = z10;
            getMessagesStorage().N1(M0, true);
        }
        TLRPC.UserFull a2 = getMessagesController().a2(j10);
        if (a2 != null) {
            a2.translations_disabled = z10;
            getMessagesStorage().j2(a2, true);
        }
        synchronized (this) {
            try {
                if (z10) {
                    this.h.add(Long.valueOf(j10));
                    this.f18349a.remove(j10);
                } else {
                    this.h.remove(Long.valueOf(j10));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        H();
        if (!z11) {
            at.f(this.currentAccount).k(at.P1, Long.valueOf(j10), Boolean.valueOf(B(j10)));
        }
    }

    public final boolean K(long j10, boolean z10) {
        boolean B = B(j10);
        int i10 = at.P1;
        boolean z11 = true;
        LongSparseArray longSparseArray = this.f18349a;
        if (z10 && !B) {
            Boolean bool = Boolean.TRUE;
            longSparseArray.put(j10, bool);
            at.f(this.currentAccount).k(i10, Long.valueOf(j10), bool);
        } else if (!z10 && B) {
            Boolean bool2 = Boolean.FALSE;
            longSparseArray.put(j10, bool2);
            at.f(this.currentAccount).k(i10, Long.valueOf(j10), bool2);
            c(j10);
        } else {
            z11 = false;
        }
        H();
        return z11;
    }

    public final void L(kj kjVar, hp0 hp0Var) {
        if (kjVar != null && kjVar.f16690k != null) {
            c3.s sVar = new c3.s(kjVar);
            String M0 = n31.M0();
            TLRPC.Message message = kjVar.f16690k;
            if (message.translatedText != null && TextUtils.equals(message.translatedToLanguage, M0)) {
                hp0Var.run();
                return;
            }
            HashSet hashSet = this.L;
            if (hashSet.contains(sVar)) {
                hp0Var.run();
                return;
            }
            hashSet.add(sVar);
            TLRPC.TL_messages_translateText tL_messages_translateText = new TLRPC.TL_messages_translateText();
            tL_messages_translateText.flags |= 2;
            TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
            TLRPC.Message message2 = kjVar.f16690k;
            tL_textWithEntities.text = message2.message;
            ArrayList<TLRPC.MessageEntity> arrayList = message2.entities;
            tL_textWithEntities.entities = arrayList;
            if (arrayList == null) {
                tL_textWithEntities.entities = new ArrayList<>();
            }
            tL_messages_translateText.text.add(tL_textWithEntities);
            tL_messages_translateText.to_lang = D(M0);
            getConnectionsManager().sendRequest(tL_messages_translateText, new om(this, kjVar, M0, sVar, hp0Var, System.currentTimeMillis(), tL_textWithEntities));
        }
    }

    public final void M(long j10) {
        boolean z10;
        if (v(j10) && t(j10)) {
            boolean contains = this.h.contains(Long.valueOf(j10));
            TLRPC.ChatFull M0 = getMessagesController().M0(-j10);
            if (M0 != null) {
                z10 = M0.translations_disabled;
            } else {
                TLRPC.UserFull a2 = getMessagesController().a2(j10);
                if (a2 != null) {
                    z10 = a2.translations_disabled;
                } else {
                    z10 = false;
                }
            }
            synchronized (this) {
                try {
                    if (z10) {
                        this.h.add(Long.valueOf(j10));
                        this.f18349a.remove(j10);
                    } else {
                        this.h.remove(Long.valueOf(j10));
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (contains != z10) {
                H();
                at.f(this.currentAccount).k(at.P1, Long.valueOf(j10), Boolean.valueOf(B(j10)));
            }
        }
    }

    public final boolean b(org.telegram.messenger.kj r3, java.lang.String r4) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.u10.b(org.telegram.messenger.kj, java.lang.String):boolean");
    }

    public final void c(long j10) {
        synchronized (this) {
            try {
                ArrayList arrayList = (ArrayList) this.D.get(Long.valueOf(j10));
                if (arrayList != null) {
                    int size = arrayList.size();
                    int i10 = 0;
                    while (i10 < size) {
                        Object obj = arrayList.get(i10);
                        i10++;
                        q10 q10Var = (q10) obj;
                        i0.r(q10Var.f17732a);
                        if (q10Var.h != -1) {
                            getConnectionsManager().cancelRequest(q10Var.h, true);
                            ArrayList arrayList2 = q10Var.f17733b;
                            int size2 = arrayList2.size();
                            int i11 = 0;
                            while (i11 < size2) {
                                Object obj2 = arrayList2.get(i11);
                                i11++;
                                this.f18357x.remove((Integer) obj2);
                            }
                        }
                    }
                    this.D.remove(Long.valueOf(j10));
                }
                ArrayList arrayList3 = (ArrayList) this.E.get(Long.valueOf(j10));
                if (arrayList3 != null) {
                    int size3 = arrayList3.size();
                    int i12 = 0;
                    while (i12 < size3) {
                        Object obj3 = arrayList3.get(i12);
                        i12++;
                        q10 q10Var2 = (q10) obj3;
                        i0.r(q10Var2.f17732a);
                        if (q10Var2.h != -1) {
                            getConnectionsManager().cancelRequest(q10Var2.h, true);
                            ArrayList arrayList4 = q10Var2.f17733b;
                            int size4 = arrayList4.size();
                            int i13 = 0;
                            while (i13 < size4) {
                                Object obj4 = arrayList4.get(i13);
                                i13++;
                                this.f18358y.remove((Integer) obj4);
                            }
                        }
                    }
                    this.E.remove(Long.valueOf(j10));
                }
                ArrayList arrayList5 = (ArrayList) this.G.get(Long.valueOf(j10));
                if (arrayList5 != null) {
                    int size5 = arrayList5.size();
                    int i14 = 0;
                    while (i14 < size5) {
                        Object obj5 = arrayList5.get(i14);
                        i14++;
                        o10 o10Var = (o10) obj5;
                        i0.r(o10Var.f17374a);
                        if (o10Var.h != -1) {
                            getConnectionsManager().cancelRequest(o10Var.h, true);
                            ArrayList arrayList6 = o10Var.f17375b;
                            int size6 = arrayList6.size();
                            int i15 = 0;
                            while (i15 < size6) {
                                Object obj6 = arrayList6.get(i15);
                                i15++;
                                this.f18357x.remove((Integer) obj6);
                            }
                        }
                    }
                    this.G.remove(Long.valueOf(j10));
                }
                ArrayList arrayList7 = (ArrayList) this.H.get(Long.valueOf(j10));
                if (arrayList7 != null) {
                    int size7 = arrayList7.size();
                    int i16 = 0;
                    while (i16 < size7) {
                        Object obj7 = arrayList7.get(i16);
                        i16++;
                        p10 p10Var = (p10) obj7;
                        i0.r(p10Var.f17550a);
                        if (p10Var.f17553f != -1) {
                            getConnectionsManager().cancelRequest(p10Var.f17553f, true);
                            ArrayList arrayList8 = p10Var.f17551b;
                            int size8 = arrayList8.size();
                            int i17 = 0;
                            while (i17 < size8) {
                                Object obj8 = arrayList8.get(i17);
                                i17++;
                                this.f18357x.remove((Integer) obj8);
                            }
                        }
                    }
                    this.H.remove(Long.valueOf(j10));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void d(long j10) {
        if (v(j10)) {
            e(j10);
        }
    }

    public final void e(long j10) {
        if (!((Boolean) this.f18349a.get(j10, Boolean.valueOf(q(j10)))).booleanValue()) {
            return;
        }
        getMessagesStorage().f16331a.c(new c10(this, j10, 1));
    }

    public final void f(kj kjVar) {
        TLRPC.Message message;
        boolean z10;
        HashSet hashSet;
        int size;
        int i10;
        float f7;
        String str;
        String str2;
        if (kjVar != null && (message = kjVar.f16690k) != null) {
            long B0 = kj.B0(message);
            Long valueOf = Long.valueOf(B0);
            HashMap hashMap = this.f18351c;
            t10 t10Var = (t10) hashMap.get(valueOf);
            if (t10Var == null) {
                Long valueOf2 = Long.valueOf(B0);
                ?? obj = new Object();
                obj.f18191a = new HashSet();
                obj.f18192b = new HashSet();
                obj.f18193c = new HashSet();
                hashMap.put(valueOf2, obj);
                t10Var = obj;
            }
            HashSet hashSet2 = t10Var.f18193c;
            HashSet hashSet3 = t10Var.f18191a;
            HashSet hashSet4 = t10Var.f18192b;
            boolean z11 = false;
            if (y(kjVar) && ((str2 = kjVar.f16690k.originalLanguage) == null || "und".equals(str2))) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (y(kjVar) && (str = kjVar.f16690k.originalLanguage) != null && !"und".equals(str) && !w(kjVar.f16690k.originalLanguage)) {
                z11 = true;
            }
            if (z10) {
                hashSet4.add(Integer.valueOf(kjVar.f1()));
            } else {
                if (z11) {
                    hashSet = hashSet3;
                } else {
                    hashSet = hashSet2;
                }
                hashSet.add(Integer.valueOf(kjVar.f1()));
            }
            if (!z10) {
                this.e.put(Long.valueOf(B0), kjVar.f16690k.originalLanguage);
            }
            int size2 = hashSet3.size();
            int size3 = hashSet4.size();
            int size4 = size2 + size3 + hashSet2.size();
            boolean q6 = q(B0);
            if (q6) {
                i10 = 2;
            } else {
                i10 = 6;
            }
            if (size4 >= i10) {
                if (q6) {
                    if (size2 < 2.0f) {
                        return;
                    }
                } else if (size2 / (size2 + size) < 0.6f) {
                    return;
                }
                float f10 = size3 / size4;
                if (q6) {
                    f7 = 0.8f;
                } else {
                    f7 = 0.65f;
                }
                if (f10 < f7) {
                    this.f18350b.add(Long.valueOf(B0));
                    hashMap.remove(Long.valueOf(B0));
                    i0.h3(new c10(this, B0, 0), 450L);
                }
            }
        }
    }

    public final void g() {
        synchronized (this) {
            try {
                this.f18351c.clear();
                ArrayList arrayList = new ArrayList();
                Iterator it = this.f18350b.iterator();
                while (it.hasNext()) {
                    Long l4 = (Long) it.next();
                    long longValue = l4.longValue();
                    String str = (String) this.e.get(l4);
                    if (str != null && w(str)) {
                        c(longValue);
                        this.f18349a.remove(longValue);
                        arrayList.add(l4);
                    }
                }
                this.f18350b.clear();
                H();
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    Long l10 = (Long) obj;
                    l10.getClass();
                    at.f(this.currentAccount).k(at.P1, l10, Boolean.FALSE);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void h(kj kjVar, boolean z10, final boolean z11) {
        TLRPC.Message message;
        TLRPC.TL_textWithEntities tL_textWithEntities;
        r10 r10Var;
        p10 p10Var;
        TLRPC.TL_textWithEntities tL_textWithEntities2;
        r10 r10Var2;
        kj kjVar2;
        if (kjVar != null && (message = kjVar.f16690k) != null) {
            final long B0 = kj.B0(message);
            final kj kjVar3 = null;
            r2 = null;
            r2 = null;
            String str = null;
            if (z10) {
                TLRPC.Message message2 = kjVar.f16690k;
                if (message2.summarizedOpen && message2.summaryText == null && !B(kj.B0(message2))) {
                    F(kjVar, null, new i10(this, kjVar, B0));
                }
            }
            if (v(B0)) {
                if (!z11 && (kjVar2 = kjVar.C) != null) {
                    h(kjVar2, z10, true);
                }
                if (y(kjVar)) {
                    if (!B(B0)) {
                        TLRPC.Message message3 = kjVar.f16690k;
                        if (message3 != null) {
                            if (!TextUtils.isEmpty(message3.message)) {
                                str = kjVar.f16690k.message;
                            } else if (kjVar.D == 36 && !TextUtils.isEmpty(kjVar.v)) {
                                str = kjVar.v.toString();
                            }
                        }
                        if (y(kjVar) && kjVar.f16690k != null && !TextUtils.isEmpty(str)) {
                            TLRPC.Message message4 = kjVar.f16690k;
                            if (message4.originalLanguage != null) {
                                f(kjVar);
                                return;
                            }
                            long B02 = kj.B0(message4);
                            int hash = Objects.hash(Long.valueOf(kj.B0(kjVar.f16690k)), Integer.valueOf(kjVar.f1()));
                            if (!t(B02) && !this.f18356w.contains(Integer.valueOf(hash))) {
                                this.f18356w.add(Integer.valueOf(hash));
                                Utilities.d.c(new a10(this, str, kjVar, B02, hash, 0));
                            }
                        }
                    } else if (!z(B0)) {
                        String m10 = m(B0);
                        if (!z11 && kjVar.D != 36) {
                            TLRPC.Message message5 = kjVar.f16690k;
                            if (message5.voiceTranscriptionOpen && message5.voiceTranscriptionFinal) {
                                tL_textWithEntities2 = message5.translatedVoiceTranscription;
                            } else {
                                tL_textWithEntities2 = message5.translatedText;
                            }
                            if ((tL_textWithEntities2 == null && message5.translatedPoll == null) || (((r10Var2 = message5.translatedPoll) != null && !r10.b(kjVar, r10Var2)) || !m10.equals(kjVar.f16690k.translatedToLanguage))) {
                                int f12 = kjVar.f1();
                                HashMap hashMap = (HashMap) this.f18352f.get(Long.valueOf(B0));
                                if (hashMap != null) {
                                    kjVar3 = (kj) hashMap.get(Integer.valueOf(f12));
                                }
                                if (kjVar3 != null) {
                                    TLRPC.Message message6 = kjVar.f16690k;
                                    TLRPC.Message message7 = kjVar3.f16690k;
                                    message6.translatedToLanguage = message7.translatedToLanguage;
                                    message6.translatedText = message7.translatedText;
                                    message6.translatedPoll = message7.translatedPoll;
                                    if (!z10 && B(B0)) {
                                        if (kjVar3.D == 36) {
                                            TLRPC.Message message8 = kjVar3.f16690k;
                                            if (message8.translatedRichMessage == null || !m10.equals(message8.translatedToLanguage)) {
                                                at.f(this.currentAccount).k(at.N1, kjVar3);
                                                m20 m20Var = new m20(this) {
                                                    public final u10 f16548b;

                                                    {
                                                        this.f16548b = this;
                                                    }

                                                    @Override
                                                    public final void a(Object obj, Object obj2, Object obj3) {
                                                        int i10 = r6;
                                                        long j10 = B0;
                                                        boolean z12 = z11;
                                                        kj kjVar4 = kjVar3;
                                                        u10 u10Var = this.f16548b;
                                                        switch (i10) {
                                                            case 0:
                                                                Integer num = (Integer) obj;
                                                                TL_iv.RichMessage richMessage = (TL_iv.RichMessage) obj2;
                                                                String str2 = (String) obj3;
                                                                if (kjVar4.f1() != num.intValue()) {
                                                                    f8.d("wtf, asked to translate " + kjVar4.f1() + " rich message but got " + num + "!");
                                                                }
                                                                TLRPC.Message message9 = kjVar4.f16690k;
                                                                message9.translatedToLanguage = str2;
                                                                message9.translatedText = null;
                                                                message9.translatedVoiceTranscription = null;
                                                                message9.translatedPoll = null;
                                                                message9.translatedRichMessage = richMessage;
                                                                if (z12) {
                                                                    u10Var.C(kjVar4);
                                                                }
                                                                u10Var.getMessagesStorage().X1(j10, kjVar4.f16690k);
                                                                at.f(u10Var.currentAccount).k(128, kjVar4);
                                                                ArrayList arrayList = (ArrayList) u10Var.f18353n.R.f(j10);
                                                                if (arrayList != null) {
                                                                    for (int i11 = 0; i11 < arrayList.size(); i11++) {
                                                                        kj kjVar5 = (kj) arrayList.get(i11);
                                                                        if (kjVar5 != null && kjVar5.f1() == kjVar4.f1()) {
                                                                            TLRPC.Message message10 = kjVar5.f16690k;
                                                                            message10.translatedToLanguage = str2;
                                                                            message10.translatedRichMessage = richMessage;
                                                                            if (kjVar5.e6(false)) {
                                                                                at.f(u10Var.currentAccount).k(2, 0);
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
                                                                r10 r10Var3 = (r10) obj2;
                                                                String str3 = (String) obj3;
                                                                boolean z13 = false;
                                                                if (kjVar4.f1() != num2.intValue()) {
                                                                    f8.d("wtf, asked to translate " + kjVar4.f1() + " poll but got " + num2 + "!");
                                                                }
                                                                TLRPC.Message message11 = kjVar4.f16690k;
                                                                message11.translatedToLanguage = str3;
                                                                message11.translatedText = null;
                                                                message11.translatedVoiceTranscription = null;
                                                                message11.translatedPoll = r10Var3;
                                                                if (z12) {
                                                                    u10Var.C(kjVar4);
                                                                }
                                                                u10Var.getMessagesStorage().X1(j10, kjVar4.f16690k);
                                                                at.f(u10Var.currentAccount).k(128, kjVar4);
                                                                ArrayList arrayList2 = (ArrayList) u10Var.f18353n.R.f(j10);
                                                                if (arrayList2 != null) {
                                                                    int i12 = 0;
                                                                    while (i12 < arrayList2.size()) {
                                                                        kj kjVar6 = (kj) arrayList2.get(i12);
                                                                        if (kjVar6 != null && kjVar6.f1() == kjVar4.f1()) {
                                                                            TLRPC.Message message12 = kjVar6.f16690k;
                                                                            message12.translatedToLanguage = str3;
                                                                            message12.translatedText = null;
                                                                            message12.translatedVoiceTranscription = null;
                                                                            message12.translatedPoll = r10Var3;
                                                                            boolean z14 = z13;
                                                                            if (kjVar6.e6(z14)) {
                                                                                at f7 = at.f(u10Var.currentAccount);
                                                                                Object[] objArr = new Object[1];
                                                                                objArr[z14 ? 1 : 0] = Integer.valueOf(z14 ? 1 : 0);
                                                                                f7.k(2, objArr);
                                                                                return;
                                                                            }
                                                                            return;
                                                                        }
                                                                        i12++;
                                                                        z13 = false;
                                                                    }
                                                                    return;
                                                                }
                                                                return;
                                                        }
                                                    }
                                                };
                                                if (kjVar3.f16690k != null && kjVar3.f1() >= 0) {
                                                    TLRPC.Message message9 = kjVar3.f16690k;
                                                    if (message9.rich_message != null) {
                                                        long B03 = kj.B0(message9);
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
                                                                    p10Var = new p10();
                                                                    arrayList.add(p10Var);
                                                                } else {
                                                                    p10Var = (p10) arrayList.get(arrayList.size() - 1);
                                                                }
                                                                if (p10Var.f17551b.contains(Integer.valueOf(kjVar3.f1()))) {
                                                                    return;
                                                                }
                                                                if (p10Var.f17551b.size() + 1 >= 20) {
                                                                    i0.r(p10Var.f17550a);
                                                                    i0.g3(p10Var.f17550a);
                                                                    p10Var = new p10();
                                                                    arrayList.add(p10Var);
                                                                }
                                                                pr prVar = p10Var.f17550a;
                                                                if (prVar != null) {
                                                                    i0.r(prVar);
                                                                }
                                                                this.f18357x.add(Integer.valueOf(kjVar3.f1()));
                                                                p10Var.f17551b.add(Integer.valueOf(kjVar3.f1()));
                                                                f8.b("pending translation +" + kjVar3.f1() + " rich message");
                                                                p10Var.f17552c.add(m20Var);
                                                                p10Var.d = m10;
                                                                p10 p10Var2 = p10Var;
                                                                pr prVar2 = new pr(this, B03, p10Var2, 7);
                                                                p10Var2.f17550a = prVar2;
                                                                i0.h3(prVar2, p10Var2.e);
                                                                p10Var2.e /= 2;
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
                                        TLRPC.Message message10 = kjVar3.f16690k;
                                        if (message10.summarizedOpen) {
                                            if (message10.translatedSummaryText == null || !m10.equals(message10.translatedSummaryLanguage)) {
                                                F(kjVar3, m10, new l10(this, kjVar3, m10, B0));
                                                return;
                                            }
                                            return;
                                        }
                                        if (message10.voiceTranscriptionOpen && message10.voiceTranscriptionFinal) {
                                            tL_textWithEntities = message10.translatedVoiceTranscription;
                                        } else {
                                            tL_textWithEntities = message10.translatedText;
                                        }
                                        if ((tL_textWithEntities == null && message10.translatedPoll == null) || (((r10Var = message10.translatedPoll) != null && !r10.b(kjVar3, r10Var)) || !m10.equals(kjVar3.f16690k.translatedToLanguage))) {
                                            at.f(this.currentAccount).k(at.N1, kjVar3);
                                            if (kj.n1(kjVar3) instanceof TLRPC.TL_messageMediaPoll) {
                                                E(kjVar3, m10, new m20(this) {
                                                    public final u10 f16548b;

                                                    {
                                                        this.f16548b = this;
                                                    }

                                                    @Override
                                                    public final void a(Object obj, Object obj2, Object obj3) {
                                                        int i10 = r6;
                                                        long j10 = B0;
                                                        boolean z12 = z11;
                                                        kj kjVar4 = kjVar3;
                                                        u10 u10Var = this.f16548b;
                                                        switch (i10) {
                                                            case 0:
                                                                Integer num = (Integer) obj;
                                                                TL_iv.RichMessage richMessage = (TL_iv.RichMessage) obj2;
                                                                String str2 = (String) obj3;
                                                                if (kjVar4.f1() != num.intValue()) {
                                                                    f8.d("wtf, asked to translate " + kjVar4.f1() + " rich message but got " + num + "!");
                                                                }
                                                                TLRPC.Message message92 = kjVar4.f16690k;
                                                                message92.translatedToLanguage = str2;
                                                                message92.translatedText = null;
                                                                message92.translatedVoiceTranscription = null;
                                                                message92.translatedPoll = null;
                                                                message92.translatedRichMessage = richMessage;
                                                                if (z12) {
                                                                    u10Var.C(kjVar4);
                                                                }
                                                                u10Var.getMessagesStorage().X1(j10, kjVar4.f16690k);
                                                                at.f(u10Var.currentAccount).k(128, kjVar4);
                                                                ArrayList arrayList3 = (ArrayList) u10Var.f18353n.R.f(j10);
                                                                if (arrayList3 != null) {
                                                                    for (int i11 = 0; i11 < arrayList3.size(); i11++) {
                                                                        kj kjVar5 = (kj) arrayList3.get(i11);
                                                                        if (kjVar5 != null && kjVar5.f1() == kjVar4.f1()) {
                                                                            TLRPC.Message message102 = kjVar5.f16690k;
                                                                            message102.translatedToLanguage = str2;
                                                                            message102.translatedRichMessage = richMessage;
                                                                            if (kjVar5.e6(false)) {
                                                                                at.f(u10Var.currentAccount).k(2, 0);
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
                                                                r10 r10Var3 = (r10) obj2;
                                                                String str3 = (String) obj3;
                                                                boolean z13 = false;
                                                                if (kjVar4.f1() != num2.intValue()) {
                                                                    f8.d("wtf, asked to translate " + kjVar4.f1() + " poll but got " + num2 + "!");
                                                                }
                                                                TLRPC.Message message11 = kjVar4.f16690k;
                                                                message11.translatedToLanguage = str3;
                                                                message11.translatedText = null;
                                                                message11.translatedVoiceTranscription = null;
                                                                message11.translatedPoll = r10Var3;
                                                                if (z12) {
                                                                    u10Var.C(kjVar4);
                                                                }
                                                                u10Var.getMessagesStorage().X1(j10, kjVar4.f16690k);
                                                                at.f(u10Var.currentAccount).k(128, kjVar4);
                                                                ArrayList arrayList22 = (ArrayList) u10Var.f18353n.R.f(j10);
                                                                if (arrayList22 != null) {
                                                                    int i12 = 0;
                                                                    while (i12 < arrayList22.size()) {
                                                                        kj kjVar6 = (kj) arrayList22.get(i12);
                                                                        if (kjVar6 != null && kjVar6.f1() == kjVar4.f1()) {
                                                                            TLRPC.Message message12 = kjVar6.f16690k;
                                                                            message12.translatedToLanguage = str3;
                                                                            message12.translatedText = null;
                                                                            message12.translatedVoiceTranscription = null;
                                                                            message12.translatedPoll = r10Var3;
                                                                            boolean z14 = z13;
                                                                            if (kjVar6.e6(z14)) {
                                                                                at f7 = at.f(u10Var.currentAccount);
                                                                                Object[] objArr = new Object[1];
                                                                                objArr[z14 ? 1 : 0] = Integer.valueOf(z14 ? 1 : 0);
                                                                                f7.k(2, objArr);
                                                                                return;
                                                                            }
                                                                            return;
                                                                        }
                                                                        i12++;
                                                                        z13 = false;
                                                                    }
                                                                    return;
                                                                }
                                                                return;
                                                        }
                                                    }
                                                });
                                                return;
                                            } else {
                                                G(kjVar3, m10, new o20() {
                                                    @Override
                                                    public final void a(Object obj, Object obj2, Object obj3, Object obj4) {
                                                        Boolean bool = (Boolean) obj;
                                                        Integer num = (Integer) obj2;
                                                        TLRPC.TL_textWithEntities tL_textWithEntities3 = (TLRPC.TL_textWithEntities) obj3;
                                                        String str2 = (String) obj4;
                                                        kj kjVar4 = kjVar3;
                                                        if (kjVar4.f1() != num.intValue()) {
                                                            f8.d("wtf, asked to translate " + kjVar4.f1() + " but got " + num + "!");
                                                        }
                                                        kjVar4.f16690k.translatedToLanguage = str2;
                                                        if (bool.booleanValue()) {
                                                            kjVar4.f16690k.translatedVoiceTranscription = tL_textWithEntities3;
                                                        } else {
                                                            kjVar4.f16690k.translatedText = tL_textWithEntities3;
                                                        }
                                                        kjVar4.f16690k.translatedPoll = null;
                                                        u10 u10Var = u10.this;
                                                        if (z11) {
                                                            u10Var.C(kjVar4);
                                                        }
                                                        is messagesStorage = u10Var.getMessagesStorage();
                                                        TLRPC.Message message11 = kjVar4.f16690k;
                                                        long j10 = B0;
                                                        messagesStorage.X1(j10, message11);
                                                        at.f(u10Var.currentAccount).k(at.M1, kjVar4);
                                                        ArrayList arrayList3 = (ArrayList) u10Var.f18353n.R.f(j10);
                                                        if (arrayList3 != null) {
                                                            for (int i10 = 0; i10 < arrayList3.size(); i10++) {
                                                                kj kjVar5 = (kj) arrayList3.get(i10);
                                                                if (kjVar5 != null && kjVar5.f1() == kjVar4.f1()) {
                                                                    kjVar5.f16690k.translatedToLanguage = str2;
                                                                    if (bool.booleanValue()) {
                                                                        kjVar5.f16690k.translatedVoiceTranscription = tL_textWithEntities3;
                                                                    } else {
                                                                        kjVar5.f16690k.translatedText = tL_textWithEntities3;
                                                                    }
                                                                    kjVar5.f16690k.translatedPoll = null;
                                                                    if (kjVar5.e6(false)) {
                                                                        at.f(u10Var.currentAccount).k(at.f14772r, 0);
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
                                        } else if (z11) {
                                            C(kjVar3);
                                            return;
                                        } else {
                                            return;
                                        }
                                    }
                                }
                            }
                        }
                        kjVar3 = kjVar;
                        if (!z10) {
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
                        int i10 = 0;
                        while (i10 < size) {
                            Object obj = arrayList.get(i10);
                            i10++;
                            q10 q10Var = (q10) obj;
                            i0.r(q10Var.f17732a);
                            if (q10Var.h != -1) {
                                getConnectionsManager().cancelRequest(q10Var.h, true);
                                ArrayList arrayList2 = q10Var.f17733b;
                                int size2 = arrayList2.size();
                                int i11 = 0;
                                while (i11 < size2) {
                                    Object obj2 = arrayList2.get(i11);
                                    i11++;
                                    this.f18357x.remove((Integer) obj2);
                                }
                            }
                        }
                    }
                }
                for (ArrayList arrayList3 : this.E.values()) {
                    if (arrayList3 != null) {
                        int size3 = arrayList3.size();
                        int i12 = 0;
                        while (i12 < size3) {
                            Object obj3 = arrayList3.get(i12);
                            i12++;
                            q10 q10Var2 = (q10) obj3;
                            i0.r(q10Var2.f17732a);
                            if (q10Var2.h != -1) {
                                getConnectionsManager().cancelRequest(q10Var2.h, true);
                                ArrayList arrayList4 = q10Var2.f17733b;
                                int size4 = arrayList4.size();
                                int i13 = 0;
                                while (i13 < size4) {
                                    Object obj4 = arrayList4.get(i13);
                                    i13++;
                                    this.f18358y.remove((Integer) obj4);
                                }
                            }
                        }
                    }
                }
                for (ArrayList arrayList5 : this.G.values()) {
                    if (arrayList5 != null) {
                        int size5 = arrayList5.size();
                        int i14 = 0;
                        while (i14 < size5) {
                            Object obj5 = arrayList5.get(i14);
                            i14++;
                            o10 o10Var = (o10) obj5;
                            i0.r(o10Var.f17374a);
                            if (o10Var.h != -1) {
                                getConnectionsManager().cancelRequest(o10Var.h, true);
                                ArrayList arrayList6 = o10Var.f17375b;
                                int size6 = arrayList6.size();
                                int i15 = 0;
                                while (i15 < size6) {
                                    Object obj6 = arrayList6.get(i15);
                                    i15++;
                                    this.f18357x.remove((Integer) obj6);
                                }
                            }
                        }
                    }
                }
                for (ArrayList arrayList7 : this.H.values()) {
                    if (arrayList7 != null) {
                        int size7 = arrayList7.size();
                        int i16 = 0;
                        while (i16 < size7) {
                            Object obj7 = arrayList7.get(i16);
                            i16++;
                            p10 p10Var = (p10) obj7;
                            i0.r(p10Var.f17550a);
                            if (p10Var.f17553f != -1) {
                                getConnectionsManager().cancelRequest(p10Var.f17553f, true);
                                ArrayList arrayList8 = p10Var.f17551b;
                                int size8 = arrayList8.size();
                                int i17 = 0;
                                while (i17 < size8) {
                                    Object obj8 = arrayList8.get(i17);
                                    i17++;
                                    this.f18357x.remove((Integer) obj8);
                                }
                            }
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        wp.r1(this.currentAccount).f7.edit().remove("translating_dialog_languages2").remove("hidden_translation_at").apply();
        this.f18349a.clear();
        this.f18350b.clear();
        this.f18351c.clear();
        this.d.clear();
        this.e.clear();
        this.f18352f.clear();
        this.h.clear();
        this.f18357x.clear();
        this.f18358y.clear();
    }

    public final void k(kj kjVar, bi.i6 i6Var) {
        TLRPC.Message message = kjVar.f16690k;
        if (message != null && !TextUtils.isEmpty(message.message)) {
            if (!TextUtils.isEmpty(kjVar.f16690k.originalLanguage)) {
                i6Var.a(kjVar.f16690k.originalLanguage);
                return;
            }
            c3.s sVar = new c3.s(kjVar);
            HashSet hashSet = this.K;
            if (!hashSet.contains(sVar)) {
                hashSet.add(sVar);
                ks.d(kjVar.f16690k.message, new z00(this, kjVar, sVar, i6Var), new z00(this, kjVar, sVar, i6Var), false);
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
                ks.d(storyItem.caption, new h10(this, storyItem, obj), new h10(this, storyItem, obj), false);
            }
        }
    }

    public final String m(long j10) {
        String str = (String) this.d.get(Long.valueOf(j10));
        if (str == null && ((str = n31.M0()) == null || str.equals((String) this.e.get(Long.valueOf(j10))))) {
            str = j();
        }
        if ("nb".equals(str)) {
            return "no";
        }
        return str;
    }

    public final void p(kj kjVar) {
        TLRPC.Message message = kjVar.f16690k;
        if (message != null) {
            long B0 = kj.B0(message);
            if (!v(B0)) {
                return;
            }
            TLRPC.Message message2 = kjVar.f16690k;
            message2.translatedToLanguage = null;
            message2.translatedText = null;
            message2.translatedVoiceTranscription = null;
            message2.translatedPoll = null;
            message2.summaryText = null;
            message2.translatedSummaryText = null;
            message2.translatedSummaryLanguage = null;
            getMessagesStorage().X1(B0, kjVar.f16690k);
            i0.g3(new d4(this, kjVar, B0, 8));
        }
    }

    public final boolean q(long j10) {
        TLRPC.Chat L0;
        if (!t(j10) || (L0 = getMessagesController().L0(Long.valueOf(-j10))) == null || !L0.autotranslation) {
            return false;
        }
        return true;
    }

    public final boolean r() {
        if (!getMessagesController().F2()) {
            return false;
        }
        if (this.f18354r == null) {
            this.f18354r = Boolean.valueOf(this.f18353n.f7.getBoolean("translate_chat_button", true));
        }
        return this.f18354r.booleanValue();
    }

    public final boolean s() {
        if (!getMessagesController().G2()) {
            return false;
        }
        if (this.f18355s == null) {
            this.f18355s = Boolean.valueOf(this.f18353n.f7.getBoolean("translate_button", wp.d1().getBoolean("translate_button", false)));
        }
        return this.f18355s.booleanValue();
    }

    public final boolean t(long j10) {
        if (this.f18350b.contains(Long.valueOf(j10)) && v(j10) && !o5.C(j10) && getUserConfig().e() != j10) {
            return true;
        }
        return false;
    }

    public final boolean u() {
        if (r() && e20.i(this.currentAccount).q()) {
            return true;
        }
        return false;
    }

    public final boolean v(long j10) {
        if (!r()) {
            return false;
        }
        TLRPC.Chat L0 = getMessagesController().L0(Long.valueOf(-j10));
        if (!e20.i(this.currentAccount).q()) {
            if (L0 == null || !L0.autotranslation) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final boolean w(String str) {
        if (getUserConfig().q()) {
            return e01.d0().contains(str);
        }
        try {
            return TextUtils.equals(dd.D0().B.f14594f, str);
        } catch (Exception unused) {
            return false;
        }
    }

    public final boolean z(long j10) {
        if (this.h.contains(Long.valueOf(j10))) {
            return true;
        }
        TLRPC.ChatFull M0 = getMessagesController().M0(-j10);
        if (M0 != null) {
            return M0.translations_disabled;
        }
        TLRPC.UserFull a2 = getMessagesController().a2(j10);
        if (a2 != null) {
            return a2.translations_disabled;
        }
        return false;
    }
}
