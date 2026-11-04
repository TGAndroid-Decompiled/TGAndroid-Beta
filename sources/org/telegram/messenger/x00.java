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
import org.telegram.ui.Components.f21;
import org.telegram.ui.gy0;
import org.telegram.ui.qn0;
public final class x00 extends c1 {
    public static final List N = Arrays.asList("en", "ar", "zh", "fr", "de", "it", "ja", "ko", "pt", "ru", "es", "uk");
    public static final List O = Arrays.asList("af", "sq", "am", "ar", "hy", "az", "eu", "be", "bn", "bs", "bg", "ca", "ceb", "zh-cn", "zh", "zh-tw", "co", "hr", "cs", "da", "nl", "en", "eo", "et", "fi", "fr", "fy", "gl", "ka", "de", "el", "gu", "ht", "ha", "haw", "he", "hi", "hmn", "hu", "is", "ig", "id", "ga", "it", "ja", "jv", "kn", "kk", "km", "rw", "ko", "ku", "ky", "lo", "la", "lv", "lt", "lb", "mk", "mg", "ms", "ml", "mt", "mi", "mr", "mn", "my", "ne", "no", "ny", "or", "ps", "fa", "pl", "pt", "pt-br", "pa", "ro", "ru", "sm", "gd", "sr", "st", "sn", "sd", "si", "sk", "sl", "so", "es", "su", "sw", "sv", "tl", "tg", "ta", "tt", "te", "th", "tr", "tk", "uk", "ur", "ug", "uz", "vi", "cy", "xh", "yi", "yo", "zu");
    public static LinkedHashSet P = null;
    public final HashMap E;
    public final HashMap F;
    public final HashSet G;
    public final HashMap H;
    public final HashMap I;
    public final HashSet J;
    public final HashSet K;
    public final HashSet L;
    public final HashSet M;
    public final LongSparseArray f26322a;
    public final HashSet f26323b;
    public final HashMap f26324c;
    public final HashMap d;
    public final HashMap f26325e;
    public final HashMap f26326f;
    public final HashSet h;
    public final hp f26327n;
    public Boolean f26328r;
    public Boolean f26329s;
    public final ArrayList f26330w;
    public final HashSet f26331x;
    public final HashSet f26332y;

    public x00(hp hpVar) {
        super(hpVar.currentAccount);
        this.f26322a = new LongSparseArray();
        this.f26323b = new HashSet();
        this.f26324c = new HashMap();
        this.d = new HashMap();
        this.f26325e = new HashMap();
        this.f26326f = new HashMap();
        this.h = new HashSet();
        this.f26330w = new ArrayList();
        this.f26331x = new HashSet();
        this.f26332y = new HashSet();
        this.E = new HashMap();
        this.F = new HashMap();
        this.G = new HashSet();
        this.H = new HashMap();
        this.I = new HashMap();
        this.J = new HashSet();
        this.K = new HashSet();
        this.L = new HashSet();
        this.M = new HashSet();
        this.f26327n = hpVar;
        g0.i3(new vs(this, 17), 150L);
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
        String str = bd.E0().B.f26565f;
        if (str != null) {
            return str.split("_")[0];
        }
        return str;
    }

    public static ArrayList n() {
        ArrayList arrayList = new ArrayList();
        int i3 = 0;
        while (true) {
            List list = O;
            if (i3 >= list.size()) {
                break;
            }
            ?? obj = new Object();
            String str = (String) list.get(i3);
            obj.f24844a = str;
            if ("no".equals(str)) {
                obj.f24844a = "nb";
            }
            obj.f24845b = f21.K0(f21.O0(obj.f24844a, null, null));
            obj.f24846c = f21.K0(f21.V0(obj.f24844a, true));
            if (obj.f24845b != null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(obj.f24845b);
                sb2.append(" ");
                String str2 = obj.f24846c;
                if (str2 == null) {
                    str2 = "";
                }
                sb2.append(str2);
                obj.d = sb2.toString().toLowerCase();
                arrayList.add(obj);
            }
            i3++;
        }
        if (Build.VERSION.SDK_INT >= 24) {
            Collections.sort(arrayList, new f00(Collator.getInstance(Locale.getDefault()), 0));
            return arrayList;
        }
        Collections.sort(arrayList, Comparator$CC.comparing(new fa.b(6)));
        return arrayList;
    }

    public static ArrayList o(String str) {
        ArrayList arrayList = new ArrayList();
        if (P == null) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            try {
                linkedHashSet.add(bd.E0().B.f26565f);
            } catch (Exception e10) {
                a8.g(e10, true);
            }
            try {
                linkedHashSet.add(Resources.getSystem().getConfiguration().locale.getLanguage());
            } catch (Exception e11) {
                a8.g(e11, true);
            }
            try {
                linkedHashSet.addAll(gy0.d0());
            } catch (Exception e12) {
                a8.g(e12, true);
            }
            try {
                InputMethodManager inputMethodManager = (InputMethodManager) t0.f25457b.getSystemService("input_method");
                for (InputMethodInfo inputMethodInfo : inputMethodManager.getEnabledInputMethodList()) {
                    for (InputMethodSubtype inputMethodSubtype : inputMethodManager.getEnabledInputMethodSubtypeList(inputMethodInfo, true)) {
                        if ("keyboard".equals(inputMethodSubtype.getMode())) {
                            String locale = inputMethodSubtype.getLocale();
                            if (locale != null && locale.contains("_")) {
                                locale = locale.split("_")[0];
                            }
                            if (f21.O0(locale, null, null) != null) {
                                linkedHashSet.add(locale);
                            }
                        }
                    }
                }
            } catch (Exception e13) {
                a8.g(e13, true);
            }
            P = linkedHashSet;
        }
        Iterator it = P.iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            if (!TextUtils.equals(str2, str) && (!"no".equals(str) || !"nb".equals(str2))) {
                if (!"nb".equals(str) || !"no".equals(str2)) {
                    ?? obj = new Object();
                    obj.f24844a = str2;
                    if ("no".equals(str2)) {
                        obj.f24844a = "nb";
                    }
                    obj.f24845b = f21.K0(f21.O0(obj.f24844a, null, null));
                    obj.f24846c = f21.K0(f21.V0(obj.f24844a, true));
                    if (obj.f24845b != null) {
                        obj.d = (obj.f24845b + " " + obj.f24846c).toLowerCase();
                        arrayList.add(obj);
                    }
                }
            }
        }
        return arrayList;
    }

    public static boolean x(zi ziVar) {
        TLRPC.Message message;
        if (ziVar != null && (message = ziVar.f26868k) != null && message.summary_from_language != null && !ziVar.Q3() && !ziVar.E0 && !ziVar.s4()) {
            int i3 = ziVar.D;
            if ((i3 == 0 || i3 == 3 || i3 == 1 || i3 == 9 || i3 == 14 || i3 == 17) && !TextUtils.isEmpty(ziVar.f26868k.message) && ziVar.f26868k.message.length() > 100) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static boolean y(zi ziVar) {
        if (ziVar != null && ziVar.f26868k != null && !ziVar.Q3() && !ziVar.E0 && !ziVar.s4() && !(zi.n1(ziVar) instanceof TLRPC.TL_messageMediaWidget)) {
            int i3 = ziVar.D;
            if (i3 == 0 || i3 == 3 || i3 == 1 || i3 == 2 || i3 == 5 || i3 == 9 || i3 == 14 || i3 == 17 || i3 == 36) {
                if (TextUtils.isEmpty(ziVar.f26868k.message) && !(zi.n1(ziVar) instanceof TLRPC.TL_messageMediaPoll)) {
                    TLRPC.Message message = ziVar.f26868k;
                    if (message.rich_message == null && (!message.voiceTranscriptionOpen || TextUtils.isEmpty(message.voiceTranscription) || !ziVar.f26868k.voiceTranscriptionFinal)) {
                        return false;
                    }
                }
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean A(zi ziVar) {
        HashSet hashSet;
        TLRPC.Message message;
        boolean z10 = true;
        if (ziVar != null && (message = ziVar.f26868k) != null && message.summarizedOpen) {
            return this.G.contains(Integer.valueOf(Objects.hash(Long.valueOf(zi.B0(message)), Integer.valueOf(ziVar.f1()), Integer.valueOf(B(zi.B0(ziVar.f26868k)) ? 1 : 0))));
        }
        synchronized (this) {
            if (ziVar != null) {
                try {
                    TLRPC.Message message2 = ziVar.f26868k;
                    if (message2 != null) {
                        if (message2.voiceTranscriptionOpen && message2.voiceTranscriptionFinal) {
                            hashSet = this.f26332y;
                        } else {
                            hashSet = this.f26331x;
                        }
                        if (hashSet.contains(Integer.valueOf(ziVar.f1())) && B(zi.B0(ziVar.f26868k))) {
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
            if (((Boolean) this.f26322a.get(j10, Boolean.valueOf(q(j10)))).booleanValue()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void C(zi ziVar) {
        Long valueOf = Long.valueOf(zi.B0(ziVar.f26868k));
        HashMap hashMap = this.f26326f;
        HashMap hashMap2 = (HashMap) hashMap.get(valueOf);
        if (hashMap2 == null) {
            Long valueOf2 = Long.valueOf(zi.B0(ziVar.f26868k));
            HashMap hashMap3 = new HashMap();
            hashMap.put(valueOf2, hashMap3);
            hashMap2 = hashMap3;
        }
        hashMap2.put(Integer.valueOf(ziVar.f1()), ziVar);
    }

    public final void E(zi ziVar, String str, n00 n00Var) {
        Throwable th2;
        r00 r00Var;
        int i3;
        if (ziVar.f1() >= 0) {
            long B0 = zi.B0(ziVar.f26868k);
            synchronized (this) {
                try {
                    try {
                        ArrayList arrayList = (ArrayList) this.H.get(Long.valueOf(B0));
                        if (arrayList == null) {
                            try {
                                HashMap hashMap = this.H;
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
                            r00Var = new r00();
                            arrayList.add(r00Var);
                        } else {
                            r00Var = (r00) arrayList.get(arrayList.size() - 1);
                        }
                        if (r00Var.f25022b.contains(Integer.valueOf(ziVar.f1()))) {
                            return;
                        }
                        TLRPC.MessageMedia n12 = zi.n1(ziVar);
                        if (!(n12 instanceof TLRPC.TL_messageMediaPoll)) {
                            return;
                        }
                        u00 a10 = u00.a((TLRPC.TL_messageMediaPoll) n12);
                        u00 u00Var = ziVar.f26868k.translatedPoll;
                        TLRPC.TL_textWithEntities tL_textWithEntities = a10.f25638a;
                        if (tL_textWithEntities != null) {
                            i3 = tL_textWithEntities.text.length();
                        } else {
                            i3 = 0;
                        }
                        for (int i10 = 0; i10 < a10.f25639b.size(); i10++) {
                            i3 += ((TLRPC.PollAnswer) a10.f25639b.get(i10)).text.text.length();
                        }
                        TLRPC.TL_textWithEntities tL_textWithEntities2 = a10.f25640c;
                        if (tL_textWithEntities2 != null) {
                            i3 += tL_textWithEntities2.text.length();
                        }
                        if (r00Var.f25026g + i3 >= 25000 || r00Var.f25022b.size() + 1 >= 20) {
                            g0.r(r00Var.f25021a);
                            g0.h3(r00Var.f25021a);
                            r00Var = new r00();
                            arrayList.add(r00Var);
                        }
                        zq zqVar = r00Var.f25021a;
                        if (zqVar != null) {
                            g0.r(zqVar);
                        }
                        this.f26331x.add(Integer.valueOf(ziVar.f1()));
                        r00Var.f25022b.add(Integer.valueOf(ziVar.f1()));
                        a8.b("pending translation +" + ziVar.f1() + " poll message");
                        r00Var.f25023c.add(new Pair(a10, u00Var));
                        r00Var.d.add(n00Var);
                        r00Var.f25024e = str;
                        r00Var.f25026g = r00Var.f25026g + i3;
                        r00 r00Var2 = r00Var;
                        zq zqVar2 = new zq(this, B0, r00Var2, 8);
                        r00Var2.f25021a = zqVar2;
                        g0.i3(zqVar2, r00Var2.f25025f);
                        r00Var2.f25025f /= 2;
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

    public final void F(zi ziVar, String str, u10 u10Var) {
        int i3;
        Long valueOf = Long.valueOf(zi.B0(ziVar.f26868k));
        Integer valueOf2 = Integer.valueOf(ziVar.f1());
        if (str != null) {
            i3 = 1;
        } else {
            i3 = 0;
        }
        int hash = Objects.hash(valueOf, valueOf2, Integer.valueOf(i3));
        Integer valueOf3 = Integer.valueOf(hash);
        HashSet hashSet = this.G;
        if (hashSet.contains(valueOf3)) {
            return;
        }
        hashSet.add(Integer.valueOf(hash));
        TLRPC.TL_messages_summarizeText tL_messages_summarizeText = new TLRPC.TL_messages_summarizeText();
        tL_messages_summarizeText.peer = hp.s1(this.currentAccount).j1(zi.B0(ziVar.f26868k));
        tL_messages_summarizeText.f27123id = ziVar.f1();
        if (str != null) {
            tL_messages_summarizeText.flags |= 1;
            tL_messages_summarizeText.to_lang = D(str);
        }
        ConnectionsManager.getInstance(this.currentAccount).sendRequestTyped(tL_messages_summarizeText, new c3.b(1), new zs(this, hash, u10Var));
    }

    public final void G(org.telegram.messenger.zi r15, java.lang.String r16, org.telegram.messenger.p00 r17) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.x00.G(org.telegram.messenger.zi, java.lang.String, org.telegram.messenger.p00):void");
    }

    public final void H() {
        StringBuilder sb2 = new StringBuilder();
        boolean z10 = true;
        int i3 = 0;
        while (true) {
            LongSparseArray longSparseArray = this.f26322a;
            if (i3 >= longSparseArray.size()) {
                break;
            }
            try {
                long keyAt = longSparseArray.keyAt(i3);
                if (!z10) {
                    sb2.append(";");
                }
                if (z10) {
                    z10 = false;
                }
                String str = (String) this.f26325e.get(Long.valueOf(keyAt));
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
                if (!((Boolean) longSparseArray.valueAt(i3)).booleanValue()) {
                    sb2.append("!");
                }
            } catch (Exception unused) {
            }
            i3++;
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
        hp.s1(this.currentAccount).f22999e7.edit().putString("translating_dialog_languages2", sb2.toString()).putStringSet("hidden_translation_at", hashSet).apply();
    }

    public final void I(long j10, String str) {
        x00 x00Var;
        long j11;
        String str2;
        Boolean bool;
        if (TextUtils.equals(m(j10), str)) {
            return;
        }
        if (B(j10)) {
            x00Var = this;
            j11 = j10;
            str2 = str;
            g0.i3(new a4(x00Var, j11, str2, 9), 150L);
        } else {
            x00Var = this;
            j11 = j10;
            str2 = str;
            synchronized (this) {
                x00Var.d.put(Long.valueOf(j11), str2);
            }
        }
        c(j11);
        synchronized (this) {
            LongSparseArray longSparseArray = x00Var.f26322a;
            bool = Boolean.FALSE;
            longSparseArray.put(j11, bool);
        }
        hs.f(x00Var.currentAccount).k(hs.P1, Long.valueOf(j11), bool);
        f21.S0(str2);
    }

    public final void J(long j10, boolean z10, boolean z11) {
        TLRPC.TL_messages_togglePeerTranslations tL_messages_togglePeerTranslations = new TLRPC.TL_messages_togglePeerTranslations();
        tL_messages_togglePeerTranslations.peer = getMessagesController().j1(j10);
        tL_messages_togglePeerTranslations.disabled = z10;
        getConnectionsManager().sendRequest(tL_messages_togglePeerTranslations, null);
        TLRPC.ChatFull N0 = getMessagesController().N0(-j10);
        if (N0 != null) {
            N0.translations_disabled = z10;
            getMessagesStorage().N1(N0, true);
        }
        TLRPC.UserFull b22 = getMessagesController().b2(j10);
        if (b22 != null) {
            b22.translations_disabled = z10;
            getMessagesStorage().j2(b22, true);
        }
        synchronized (this) {
            try {
                if (z10) {
                    this.h.add(Long.valueOf(j10));
                    this.f26322a.remove(j10);
                } else {
                    this.h.remove(Long.valueOf(j10));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        H();
        if (!z11) {
            hs.f(this.currentAccount).k(hs.P1, Long.valueOf(j10), Boolean.valueOf(B(j10)));
        }
    }

    public final boolean K(long j10, boolean z10) {
        boolean B = B(j10);
        int i3 = hs.P1;
        boolean z11 = true;
        LongSparseArray longSparseArray = this.f26322a;
        if (z10 && !B) {
            Boolean bool = Boolean.TRUE;
            longSparseArray.put(j10, bool);
            hs.f(this.currentAccount).k(i3, Long.valueOf(j10), bool);
        } else if (!z10 && B) {
            Boolean bool2 = Boolean.FALSE;
            longSparseArray.put(j10, bool2);
            hs.f(this.currentAccount).k(i3, Long.valueOf(j10), bool2);
            c(j10);
        } else {
            z11 = false;
        }
        H();
        return z11;
    }

    public final void L(zi ziVar, qn0 qn0Var) {
        if (ziVar != null && ziVar.f26868k != null) {
            e3.s sVar = new e3.s(ziVar);
            String M0 = f21.M0();
            TLRPC.Message message = ziVar.f26868k;
            if (message.translatedText != null && TextUtils.equals(message.translatedToLanguage, M0)) {
                qn0Var.run();
                return;
            }
            HashSet hashSet = this.M;
            if (hashSet.contains(sVar)) {
                qn0Var.run();
                return;
            }
            hashSet.add(sVar);
            TLRPC.TL_messages_translateText tL_messages_translateText = new TLRPC.TL_messages_translateText();
            tL_messages_translateText.flags |= 2;
            TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
            TLRPC.Message message2 = ziVar.f26868k;
            tL_textWithEntities.text = message2.message;
            ArrayList<TLRPC.MessageEntity> arrayList = message2.entities;
            tL_textWithEntities.entities = arrayList;
            if (arrayList == null) {
                tL_textWithEntities.entities = new ArrayList<>();
            }
            tL_messages_translateText.text.add(tL_textWithEntities);
            tL_messages_translateText.to_lang = D(M0);
            getConnectionsManager().sendRequest(tL_messages_translateText, new cm(this, ziVar, M0, sVar, qn0Var, System.currentTimeMillis(), tL_textWithEntities));
        }
    }

    public final void M(long j10) {
        boolean z10;
        if (v(j10) && t(j10)) {
            boolean contains = this.h.contains(Long.valueOf(j10));
            TLRPC.ChatFull N0 = getMessagesController().N0(-j10);
            if (N0 != null) {
                z10 = N0.translations_disabled;
            } else {
                TLRPC.UserFull b22 = getMessagesController().b2(j10);
                if (b22 != null) {
                    z10 = b22.translations_disabled;
                } else {
                    z10 = false;
                }
            }
            synchronized (this) {
                try {
                    if (z10) {
                        this.h.add(Long.valueOf(j10));
                        this.f26322a.remove(j10);
                    } else {
                        this.h.remove(Long.valueOf(j10));
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (contains != z10) {
                H();
                hs.f(this.currentAccount).k(hs.P1, Long.valueOf(j10), Boolean.valueOf(B(j10)));
            }
        }
    }

    public final boolean b(org.telegram.messenger.zi r3, java.lang.String r4) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.x00.b(org.telegram.messenger.zi, java.lang.String):boolean");
    }

    public final void c(long j10) {
        synchronized (this) {
            try {
                ArrayList arrayList = (ArrayList) this.E.get(Long.valueOf(j10));
                if (arrayList != null) {
                    int size = arrayList.size();
                    int i3 = 0;
                    while (i3 < size) {
                        Object obj = arrayList.get(i3);
                        i3++;
                        t00 t00Var = (t00) obj;
                        g0.r(t00Var.f25467a);
                        if (t00Var.h != -1) {
                            getConnectionsManager().cancelRequest(t00Var.h, true);
                            ArrayList arrayList2 = t00Var.f25468b;
                            int size2 = arrayList2.size();
                            int i10 = 0;
                            while (i10 < size2) {
                                Object obj2 = arrayList2.get(i10);
                                i10++;
                                this.f26331x.remove((Integer) obj2);
                            }
                        }
                    }
                    this.E.remove(Long.valueOf(j10));
                }
                ArrayList arrayList3 = (ArrayList) this.F.get(Long.valueOf(j10));
                if (arrayList3 != null) {
                    int size3 = arrayList3.size();
                    int i11 = 0;
                    while (i11 < size3) {
                        Object obj3 = arrayList3.get(i11);
                        i11++;
                        t00 t00Var2 = (t00) obj3;
                        g0.r(t00Var2.f25467a);
                        if (t00Var2.h != -1) {
                            getConnectionsManager().cancelRequest(t00Var2.h, true);
                            ArrayList arrayList4 = t00Var2.f25468b;
                            int size4 = arrayList4.size();
                            int i12 = 0;
                            while (i12 < size4) {
                                Object obj4 = arrayList4.get(i12);
                                i12++;
                                this.f26332y.remove((Integer) obj4);
                            }
                        }
                    }
                    this.F.remove(Long.valueOf(j10));
                }
                ArrayList arrayList5 = (ArrayList) this.H.get(Long.valueOf(j10));
                if (arrayList5 != null) {
                    int size5 = arrayList5.size();
                    int i13 = 0;
                    while (i13 < size5) {
                        Object obj5 = arrayList5.get(i13);
                        i13++;
                        r00 r00Var = (r00) obj5;
                        g0.r(r00Var.f25021a);
                        if (r00Var.h != -1) {
                            getConnectionsManager().cancelRequest(r00Var.h, true);
                            ArrayList arrayList6 = r00Var.f25022b;
                            int size6 = arrayList6.size();
                            int i14 = 0;
                            while (i14 < size6) {
                                Object obj6 = arrayList6.get(i14);
                                i14++;
                                this.f26331x.remove((Integer) obj6);
                            }
                        }
                    }
                    this.H.remove(Long.valueOf(j10));
                }
                ArrayList arrayList7 = (ArrayList) this.I.get(Long.valueOf(j10));
                if (arrayList7 != null) {
                    int size7 = arrayList7.size();
                    int i15 = 0;
                    while (i15 < size7) {
                        Object obj7 = arrayList7.get(i15);
                        i15++;
                        s00 s00Var = (s00) obj7;
                        g0.r(s00Var.f25261a);
                        if (s00Var.f25265f != -1) {
                            getConnectionsManager().cancelRequest(s00Var.f25265f, true);
                            ArrayList arrayList8 = s00Var.f25262b;
                            int size8 = arrayList8.size();
                            int i16 = 0;
                            while (i16 < size8) {
                                Object obj8 = arrayList8.get(i16);
                                i16++;
                                this.f26331x.remove((Integer) obj8);
                            }
                        }
                    }
                    this.I.remove(Long.valueOf(j10));
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
        if (!((Boolean) this.f26322a.get(j10, Boolean.valueOf(q(j10)))).booleanValue()) {
            return;
        }
        getMessagesStorage().f24934a.c(new g00(this, j10, 1));
    }

    public final void f(zi ziVar) {
        TLRPC.Message message;
        boolean z10;
        HashSet hashSet;
        int size;
        int i3;
        float f10;
        String str;
        String str2;
        if (ziVar != null && (message = ziVar.f26868k) != null) {
            long B0 = zi.B0(message);
            Long valueOf = Long.valueOf(B0);
            HashMap hashMap = this.f26324c;
            w00 w00Var = (w00) hashMap.get(valueOf);
            if (w00Var == null) {
                Long valueOf2 = Long.valueOf(B0);
                ?? obj = new Object();
                obj.f26145a = new HashSet();
                obj.f26146b = new HashSet();
                obj.f26147c = new HashSet();
                hashMap.put(valueOf2, obj);
                w00Var = obj;
            }
            HashSet hashSet2 = w00Var.f26147c;
            HashSet hashSet3 = w00Var.f26145a;
            HashSet hashSet4 = w00Var.f26146b;
            boolean z11 = false;
            if (y(ziVar) && ((str2 = ziVar.f26868k.originalLanguage) == null || "und".equals(str2))) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (y(ziVar) && (str = ziVar.f26868k.originalLanguage) != null && !"und".equals(str) && !w(ziVar.f26868k.originalLanguage)) {
                z11 = true;
            }
            if (z10) {
                hashSet4.add(Integer.valueOf(ziVar.f1()));
            } else {
                if (z11) {
                    hashSet = hashSet3;
                } else {
                    hashSet = hashSet2;
                }
                hashSet.add(Integer.valueOf(ziVar.f1()));
            }
            if (!z10) {
                this.f26325e.put(Long.valueOf(B0), ziVar.f26868k.originalLanguage);
            }
            int size2 = hashSet3.size();
            int size3 = hashSet4.size();
            int size4 = size2 + size3 + hashSet2.size();
            boolean q10 = q(B0);
            if (q10) {
                i3 = 2;
            } else {
                i3 = 6;
            }
            if (size4 >= i3) {
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
                    this.f26323b.add(Long.valueOf(B0));
                    hashMap.remove(Long.valueOf(B0));
                    g0.i3(new g00(this, B0, 0), 450L);
                }
            }
        }
    }

    public final void g() {
        synchronized (this) {
            try {
                this.f26324c.clear();
                ArrayList arrayList = new ArrayList();
                Iterator it = this.f26323b.iterator();
                while (it.hasNext()) {
                    Long l10 = (Long) it.next();
                    long longValue = l10.longValue();
                    String str = (String) this.f26325e.get(l10);
                    if (str != null && w(str)) {
                        c(longValue);
                        this.f26322a.remove(longValue);
                        arrayList.add(l10);
                    }
                }
                this.f26323b.clear();
                H();
                int size = arrayList.size();
                int i3 = 0;
                while (i3 < size) {
                    Object obj = arrayList.get(i3);
                    i3++;
                    Long l11 = (Long) obj;
                    l11.getClass();
                    hs.f(this.currentAccount).k(hs.P1, l11, Boolean.FALSE);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void h(zi ziVar, boolean z10, final boolean z11) {
        TLRPC.Message message;
        TLRPC.TL_textWithEntities tL_textWithEntities;
        u00 u00Var;
        s00 s00Var;
        TLRPC.TL_textWithEntities tL_textWithEntities2;
        u00 u00Var2;
        zi ziVar2;
        if (ziVar != null && (message = ziVar.f26868k) != null) {
            final long B0 = zi.B0(message);
            final zi ziVar3 = null;
            r2 = null;
            r2 = null;
            String str = null;
            if (z10) {
                TLRPC.Message message2 = ziVar.f26868k;
                if (message2.summarizedOpen && message2.summaryText == null && !B(zi.B0(message2))) {
                    F(ziVar, null, new l00(this, ziVar, B0));
                }
            }
            if (v(B0)) {
                if (!z11 && (ziVar2 = ziVar.C) != null) {
                    h(ziVar2, z10, true);
                }
                if (y(ziVar)) {
                    if (!B(B0)) {
                        TLRPC.Message message3 = ziVar.f26868k;
                        if (message3 != null) {
                            if (!TextUtils.isEmpty(message3.message)) {
                                str = ziVar.f26868k.message;
                            } else if (ziVar.D == 36 && !TextUtils.isEmpty(ziVar.v)) {
                                str = ziVar.v.toString();
                            }
                        }
                        if (y(ziVar) && ziVar.f26868k != null && !TextUtils.isEmpty(str)) {
                            TLRPC.Message message4 = ziVar.f26868k;
                            if (message4.originalLanguage != null) {
                                f(ziVar);
                                return;
                            }
                            long B02 = zi.B0(message4);
                            int hash = Objects.hash(Long.valueOf(zi.B0(ziVar.f26868k)), Integer.valueOf(ziVar.f1()));
                            if (!t(B02) && !this.f26330w.contains(Integer.valueOf(hash))) {
                                this.f26330w.add(Integer.valueOf(hash));
                                Utilities.d.c(new e00(this, str, ziVar, B02, hash, 0));
                            }
                        }
                    } else if (!z(B0)) {
                        String m10 = m(B0);
                        if (!z11 && ziVar.D != 36) {
                            TLRPC.Message message5 = ziVar.f26868k;
                            if (message5.voiceTranscriptionOpen && message5.voiceTranscriptionFinal) {
                                tL_textWithEntities2 = message5.translatedVoiceTranscription;
                            } else {
                                tL_textWithEntities2 = message5.translatedText;
                            }
                            if ((tL_textWithEntities2 == null && message5.translatedPoll == null) || (((u00Var2 = message5.translatedPoll) != null && !u00.b(ziVar, u00Var2)) || !m10.equals(ziVar.f26868k.translatedToLanguage))) {
                                int f12 = ziVar.f1();
                                HashMap hashMap = (HashMap) this.f26326f.get(Long.valueOf(B0));
                                if (hashMap != null) {
                                    ziVar3 = (zi) hashMap.get(Integer.valueOf(f12));
                                }
                                if (ziVar3 != null) {
                                    TLRPC.Message message6 = ziVar.f26868k;
                                    TLRPC.Message message7 = ziVar3.f26868k;
                                    message6.translatedToLanguage = message7.translatedToLanguage;
                                    message6.translatedText = message7.translatedText;
                                    message6.translatedPoll = message7.translatedPoll;
                                    if (!z10 && B(B0)) {
                                        if (ziVar3.D == 36) {
                                            TLRPC.Message message8 = ziVar3.f26868k;
                                            if (message8.translatedRichMessage == null || !m10.equals(message8.translatedToLanguage)) {
                                                hs.f(this.currentAccount).k(hs.N1, ziVar3);
                                                p10 p10Var = new p10(this) {
                                                    public final x00 f24299b;

                                                    {
                                                        this.f24299b = this;
                                                    }

                                                    @Override
                                                    public final void a(Object obj, Object obj2, Object obj3) {
                                                        int i3 = r6;
                                                        long j10 = B0;
                                                        boolean z12 = z11;
                                                        zi ziVar4 = ziVar3;
                                                        x00 x00Var = this.f24299b;
                                                        switch (i3) {
                                                            case 0:
                                                                Integer num = (Integer) obj;
                                                                TL_iv.RichMessage richMessage = (TL_iv.RichMessage) obj2;
                                                                String str2 = (String) obj3;
                                                                if (ziVar4.f1() != num.intValue()) {
                                                                    a8.d("wtf, asked to translate " + ziVar4.f1() + " rich message but got " + num + "!");
                                                                }
                                                                TLRPC.Message message9 = ziVar4.f26868k;
                                                                message9.translatedToLanguage = str2;
                                                                message9.translatedText = null;
                                                                message9.translatedVoiceTranscription = null;
                                                                message9.translatedPoll = null;
                                                                message9.translatedRichMessage = richMessage;
                                                                if (z12) {
                                                                    x00Var.C(ziVar4);
                                                                }
                                                                x00Var.getMessagesStorage().X1(j10, ziVar4.f26868k);
                                                                hs.f(x00Var.currentAccount).k(128, ziVar4);
                                                                ArrayList arrayList = (ArrayList) x00Var.f26327n.S.f(j10);
                                                                if (arrayList != null) {
                                                                    for (int i10 = 0; i10 < arrayList.size(); i10++) {
                                                                        zi ziVar5 = (zi) arrayList.get(i10);
                                                                        if (ziVar5 != null && ziVar5.f1() == ziVar4.f1()) {
                                                                            TLRPC.Message message10 = ziVar5.f26868k;
                                                                            message10.translatedToLanguage = str2;
                                                                            message10.translatedRichMessage = richMessage;
                                                                            if (ziVar5.h6(false)) {
                                                                                hs.f(x00Var.currentAccount).k(2, 0);
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
                                                                u00 u00Var3 = (u00) obj2;
                                                                String str3 = (String) obj3;
                                                                boolean z13 = false;
                                                                if (ziVar4.f1() != num2.intValue()) {
                                                                    a8.d("wtf, asked to translate " + ziVar4.f1() + " poll but got " + num2 + "!");
                                                                }
                                                                TLRPC.Message message11 = ziVar4.f26868k;
                                                                message11.translatedToLanguage = str3;
                                                                message11.translatedText = null;
                                                                message11.translatedVoiceTranscription = null;
                                                                message11.translatedPoll = u00Var3;
                                                                if (z12) {
                                                                    x00Var.C(ziVar4);
                                                                }
                                                                x00Var.getMessagesStorage().X1(j10, ziVar4.f26868k);
                                                                hs.f(x00Var.currentAccount).k(128, ziVar4);
                                                                ArrayList arrayList2 = (ArrayList) x00Var.f26327n.S.f(j10);
                                                                if (arrayList2 != null) {
                                                                    int i11 = 0;
                                                                    while (i11 < arrayList2.size()) {
                                                                        zi ziVar6 = (zi) arrayList2.get(i11);
                                                                        if (ziVar6 != null && ziVar6.f1() == ziVar4.f1()) {
                                                                            TLRPC.Message message12 = ziVar6.f26868k;
                                                                            message12.translatedToLanguage = str3;
                                                                            message12.translatedText = null;
                                                                            message12.translatedVoiceTranscription = null;
                                                                            message12.translatedPoll = u00Var3;
                                                                            boolean z14 = z13;
                                                                            if (ziVar6.h6(z14)) {
                                                                                hs f10 = hs.f(x00Var.currentAccount);
                                                                                Object[] objArr = new Object[1];
                                                                                objArr[z14 ? 1 : 0] = Integer.valueOf(z14 ? 1 : 0);
                                                                                f10.k(2, objArr);
                                                                                return;
                                                                            }
                                                                            return;
                                                                        }
                                                                        i11++;
                                                                        z13 = false;
                                                                    }
                                                                    return;
                                                                }
                                                                return;
                                                        }
                                                    }
                                                };
                                                if (ziVar3.f26868k != null && ziVar3.f1() >= 0) {
                                                    TLRPC.Message message9 = ziVar3.f26868k;
                                                    if (message9.rich_message != null) {
                                                        long B03 = zi.B0(message9);
                                                        synchronized (this) {
                                                            try {
                                                                ArrayList arrayList = (ArrayList) this.I.get(Long.valueOf(B03));
                                                                if (arrayList == null) {
                                                                    HashMap hashMap2 = this.I;
                                                                    Long valueOf = Long.valueOf(B03);
                                                                    ArrayList arrayList2 = new ArrayList();
                                                                    hashMap2.put(valueOf, arrayList2);
                                                                    arrayList = arrayList2;
                                                                }
                                                                if (arrayList.isEmpty()) {
                                                                    s00Var = new s00();
                                                                    arrayList.add(s00Var);
                                                                } else {
                                                                    s00Var = (s00) arrayList.get(arrayList.size() - 1);
                                                                }
                                                                if (s00Var.f25262b.contains(Integer.valueOf(ziVar3.f1()))) {
                                                                    return;
                                                                }
                                                                if (s00Var.f25262b.size() + 1 >= 20) {
                                                                    g0.r(s00Var.f25261a);
                                                                    g0.h3(s00Var.f25261a);
                                                                    s00Var = new s00();
                                                                    arrayList.add(s00Var);
                                                                }
                                                                zq zqVar = s00Var.f25261a;
                                                                if (zqVar != null) {
                                                                    g0.r(zqVar);
                                                                }
                                                                this.f26331x.add(Integer.valueOf(ziVar3.f1()));
                                                                s00Var.f25262b.add(Integer.valueOf(ziVar3.f1()));
                                                                a8.b("pending translation +" + ziVar3.f1() + " rich message");
                                                                s00Var.f25263c.add(p10Var);
                                                                s00Var.d = m10;
                                                                s00 s00Var2 = s00Var;
                                                                zq zqVar2 = new zq(this, B03, s00Var2, 7);
                                                                s00Var2.f25261a = zqVar2;
                                                                g0.i3(zqVar2, s00Var2.f25264e);
                                                                s00Var2.f25264e /= 2;
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
                                        TLRPC.Message message10 = ziVar3.f26868k;
                                        if (message10.summarizedOpen) {
                                            if (message10.translatedSummaryText == null || !m10.equals(message10.translatedSummaryLanguage)) {
                                                F(ziVar3, m10, new o00(this, ziVar3, m10, B0));
                                                return;
                                            }
                                            return;
                                        }
                                        if (message10.voiceTranscriptionOpen && message10.voiceTranscriptionFinal) {
                                            tL_textWithEntities = message10.translatedVoiceTranscription;
                                        } else {
                                            tL_textWithEntities = message10.translatedText;
                                        }
                                        if ((tL_textWithEntities == null && message10.translatedPoll == null) || (((u00Var = message10.translatedPoll) != null && !u00.b(ziVar3, u00Var)) || !m10.equals(ziVar3.f26868k.translatedToLanguage))) {
                                            hs.f(this.currentAccount).k(hs.N1, ziVar3);
                                            if (zi.n1(ziVar3) instanceof TLRPC.TL_messageMediaPoll) {
                                                E(ziVar3, m10, new p10(this) {
                                                    public final x00 f24299b;

                                                    {
                                                        this.f24299b = this;
                                                    }

                                                    @Override
                                                    public final void a(Object obj, Object obj2, Object obj3) {
                                                        int i3 = r6;
                                                        long j10 = B0;
                                                        boolean z12 = z11;
                                                        zi ziVar4 = ziVar3;
                                                        x00 x00Var = this.f24299b;
                                                        switch (i3) {
                                                            case 0:
                                                                Integer num = (Integer) obj;
                                                                TL_iv.RichMessage richMessage = (TL_iv.RichMessage) obj2;
                                                                String str2 = (String) obj3;
                                                                if (ziVar4.f1() != num.intValue()) {
                                                                    a8.d("wtf, asked to translate " + ziVar4.f1() + " rich message but got " + num + "!");
                                                                }
                                                                TLRPC.Message message92 = ziVar4.f26868k;
                                                                message92.translatedToLanguage = str2;
                                                                message92.translatedText = null;
                                                                message92.translatedVoiceTranscription = null;
                                                                message92.translatedPoll = null;
                                                                message92.translatedRichMessage = richMessage;
                                                                if (z12) {
                                                                    x00Var.C(ziVar4);
                                                                }
                                                                x00Var.getMessagesStorage().X1(j10, ziVar4.f26868k);
                                                                hs.f(x00Var.currentAccount).k(128, ziVar4);
                                                                ArrayList arrayList3 = (ArrayList) x00Var.f26327n.S.f(j10);
                                                                if (arrayList3 != null) {
                                                                    for (int i10 = 0; i10 < arrayList3.size(); i10++) {
                                                                        zi ziVar5 = (zi) arrayList3.get(i10);
                                                                        if (ziVar5 != null && ziVar5.f1() == ziVar4.f1()) {
                                                                            TLRPC.Message message102 = ziVar5.f26868k;
                                                                            message102.translatedToLanguage = str2;
                                                                            message102.translatedRichMessage = richMessage;
                                                                            if (ziVar5.h6(false)) {
                                                                                hs.f(x00Var.currentAccount).k(2, 0);
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
                                                                u00 u00Var3 = (u00) obj2;
                                                                String str3 = (String) obj3;
                                                                boolean z13 = false;
                                                                if (ziVar4.f1() != num2.intValue()) {
                                                                    a8.d("wtf, asked to translate " + ziVar4.f1() + " poll but got " + num2 + "!");
                                                                }
                                                                TLRPC.Message message11 = ziVar4.f26868k;
                                                                message11.translatedToLanguage = str3;
                                                                message11.translatedText = null;
                                                                message11.translatedVoiceTranscription = null;
                                                                message11.translatedPoll = u00Var3;
                                                                if (z12) {
                                                                    x00Var.C(ziVar4);
                                                                }
                                                                x00Var.getMessagesStorage().X1(j10, ziVar4.f26868k);
                                                                hs.f(x00Var.currentAccount).k(128, ziVar4);
                                                                ArrayList arrayList22 = (ArrayList) x00Var.f26327n.S.f(j10);
                                                                if (arrayList22 != null) {
                                                                    int i11 = 0;
                                                                    while (i11 < arrayList22.size()) {
                                                                        zi ziVar6 = (zi) arrayList22.get(i11);
                                                                        if (ziVar6 != null && ziVar6.f1() == ziVar4.f1()) {
                                                                            TLRPC.Message message12 = ziVar6.f26868k;
                                                                            message12.translatedToLanguage = str3;
                                                                            message12.translatedText = null;
                                                                            message12.translatedVoiceTranscription = null;
                                                                            message12.translatedPoll = u00Var3;
                                                                            boolean z14 = z13;
                                                                            if (ziVar6.h6(z14)) {
                                                                                hs f10 = hs.f(x00Var.currentAccount);
                                                                                Object[] objArr = new Object[1];
                                                                                objArr[z14 ? 1 : 0] = Integer.valueOf(z14 ? 1 : 0);
                                                                                f10.k(2, objArr);
                                                                                return;
                                                                            }
                                                                            return;
                                                                        }
                                                                        i11++;
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
                                                G(ziVar3, m10, new r10() {
                                                    @Override
                                                    public final void a(Object obj, Object obj2, Object obj3, Object obj4) {
                                                        Boolean bool = (Boolean) obj;
                                                        Integer num = (Integer) obj2;
                                                        TLRPC.TL_textWithEntities tL_textWithEntities3 = (TLRPC.TL_textWithEntities) obj3;
                                                        String str2 = (String) obj4;
                                                        zi ziVar4 = ziVar3;
                                                        if (ziVar4.f1() != num.intValue()) {
                                                            a8.d("wtf, asked to translate " + ziVar4.f1() + " but got " + num + "!");
                                                        }
                                                        ziVar4.f26868k.translatedToLanguage = str2;
                                                        if (bool.booleanValue()) {
                                                            ziVar4.f26868k.translatedVoiceTranscription = tL_textWithEntities3;
                                                        } else {
                                                            ziVar4.f26868k.translatedText = tL_textWithEntities3;
                                                        }
                                                        ziVar4.f26868k.translatedPoll = null;
                                                        x00 x00Var = x00.this;
                                                        if (z11) {
                                                            x00Var.C(ziVar4);
                                                        }
                                                        qr messagesStorage = x00Var.getMessagesStorage();
                                                        TLRPC.Message message11 = ziVar4.f26868k;
                                                        long j10 = B0;
                                                        messagesStorage.X1(j10, message11);
                                                        hs.f(x00Var.currentAccount).k(hs.M1, ziVar4);
                                                        ArrayList arrayList3 = (ArrayList) x00Var.f26327n.S.f(j10);
                                                        if (arrayList3 != null) {
                                                            for (int i3 = 0; i3 < arrayList3.size(); i3++) {
                                                                zi ziVar5 = (zi) arrayList3.get(i3);
                                                                if (ziVar5 != null && ziVar5.f1() == ziVar4.f1()) {
                                                                    ziVar5.f26868k.translatedToLanguage = str2;
                                                                    if (bool.booleanValue()) {
                                                                        ziVar5.f26868k.translatedVoiceTranscription = tL_textWithEntities3;
                                                                    } else {
                                                                        ziVar5.f26868k.translatedText = tL_textWithEntities3;
                                                                    }
                                                                    ziVar5.f26868k.translatedPoll = null;
                                                                    if (ziVar5.h6(false)) {
                                                                        hs.f(x00Var.currentAccount).k(hs.f23292r, 0);
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
                                            C(ziVar3);
                                            return;
                                        } else {
                                            return;
                                        }
                                    }
                                }
                            }
                        }
                        ziVar3 = ziVar;
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
                for (ArrayList arrayList : this.E.values()) {
                    if (arrayList != null) {
                        int size = arrayList.size();
                        int i3 = 0;
                        while (i3 < size) {
                            Object obj = arrayList.get(i3);
                            i3++;
                            t00 t00Var = (t00) obj;
                            g0.r(t00Var.f25467a);
                            if (t00Var.h != -1) {
                                getConnectionsManager().cancelRequest(t00Var.h, true);
                                ArrayList arrayList2 = t00Var.f25468b;
                                int size2 = arrayList2.size();
                                int i10 = 0;
                                while (i10 < size2) {
                                    Object obj2 = arrayList2.get(i10);
                                    i10++;
                                    this.f26331x.remove((Integer) obj2);
                                }
                            }
                        }
                    }
                }
                for (ArrayList arrayList3 : this.F.values()) {
                    if (arrayList3 != null) {
                        int size3 = arrayList3.size();
                        int i11 = 0;
                        while (i11 < size3) {
                            Object obj3 = arrayList3.get(i11);
                            i11++;
                            t00 t00Var2 = (t00) obj3;
                            g0.r(t00Var2.f25467a);
                            if (t00Var2.h != -1) {
                                getConnectionsManager().cancelRequest(t00Var2.h, true);
                                ArrayList arrayList4 = t00Var2.f25468b;
                                int size4 = arrayList4.size();
                                int i12 = 0;
                                while (i12 < size4) {
                                    Object obj4 = arrayList4.get(i12);
                                    i12++;
                                    this.f26332y.remove((Integer) obj4);
                                }
                            }
                        }
                    }
                }
                for (ArrayList arrayList5 : this.H.values()) {
                    if (arrayList5 != null) {
                        int size5 = arrayList5.size();
                        int i13 = 0;
                        while (i13 < size5) {
                            Object obj5 = arrayList5.get(i13);
                            i13++;
                            r00 r00Var = (r00) obj5;
                            g0.r(r00Var.f25021a);
                            if (r00Var.h != -1) {
                                getConnectionsManager().cancelRequest(r00Var.h, true);
                                ArrayList arrayList6 = r00Var.f25022b;
                                int size6 = arrayList6.size();
                                int i14 = 0;
                                while (i14 < size6) {
                                    Object obj6 = arrayList6.get(i14);
                                    i14++;
                                    this.f26331x.remove((Integer) obj6);
                                }
                            }
                        }
                    }
                }
                for (ArrayList arrayList7 : this.I.values()) {
                    if (arrayList7 != null) {
                        int size7 = arrayList7.size();
                        int i15 = 0;
                        while (i15 < size7) {
                            Object obj7 = arrayList7.get(i15);
                            i15++;
                            s00 s00Var = (s00) obj7;
                            g0.r(s00Var.f25261a);
                            if (s00Var.f25265f != -1) {
                                getConnectionsManager().cancelRequest(s00Var.f25265f, true);
                                ArrayList arrayList8 = s00Var.f25262b;
                                int size8 = arrayList8.size();
                                int i16 = 0;
                                while (i16 < size8) {
                                    Object obj8 = arrayList8.get(i16);
                                    i16++;
                                    this.f26331x.remove((Integer) obj8);
                                }
                            }
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        hp.s1(this.currentAccount).f22999e7.edit().remove("translating_dialog_languages2").remove("hidden_translation_at").apply();
        this.f26322a.clear();
        this.f26323b.clear();
        this.f26324c.clear();
        this.d.clear();
        this.f26325e.clear();
        this.f26326f.clear();
        this.h.clear();
        this.f26331x.clear();
        this.f26332y.clear();
    }

    public final void k(zi ziVar, ci.w9 w9Var) {
        TLRPC.Message message = ziVar.f26868k;
        if (message != null && !TextUtils.isEmpty(message.message)) {
            if (!TextUtils.isEmpty(ziVar.f26868k.originalLanguage)) {
                w9Var.a(ziVar.f26868k.originalLanguage);
                return;
            }
            e3.s sVar = new e3.s(ziVar);
            HashSet hashSet = this.L;
            if (!hashSet.contains(sVar)) {
                hashSet.add(sVar);
                b6.d(ziVar.f26868k.message, new d00(this, ziVar, sVar, w9Var), new d00(this, ziVar, sVar, w9Var), false);
            }
        }
    }

    public final void l(TL_stories.StoryItem storyItem) {
        String str;
        if (storyItem != null && storyItem.detectedLng == null && (str = storyItem.caption) != null && str.length() != 0) {
            ?? obj = new Object();
            HashSet hashSet = this.J;
            if (!hashSet.contains(obj)) {
                hashSet.add(obj);
                b6.d(storyItem.caption, new k00(this, storyItem, obj), new k00(this, storyItem, obj), false);
            }
        }
    }

    public final String m(long j10) {
        String str = (String) this.d.get(Long.valueOf(j10));
        if (str == null && ((str = f21.M0()) == null || str.equals((String) this.f26325e.get(Long.valueOf(j10))))) {
            str = j();
        }
        if ("nb".equals(str)) {
            return "no";
        }
        return str;
    }

    public final void p(zi ziVar) {
        TLRPC.Message message = ziVar.f26868k;
        if (message != null) {
            long B0 = zi.B0(message);
            if (!v(B0)) {
                return;
            }
            TLRPC.Message message2 = ziVar.f26868k;
            message2.translatedToLanguage = null;
            message2.translatedText = null;
            message2.translatedVoiceTranscription = null;
            message2.translatedPoll = null;
            message2.summaryText = null;
            message2.translatedSummaryText = null;
            message2.translatedSummaryLanguage = null;
            getMessagesStorage().X1(B0, ziVar.f26868k);
            g0.h3(new a4(this, ziVar, B0, 8));
        }
    }

    public final boolean q(long j10) {
        TLRPC.Chat M0;
        if (!t(j10) || (M0 = getMessagesController().M0(Long.valueOf(-j10))) == null || !M0.autotranslation) {
            return false;
        }
        return true;
    }

    public final boolean r() {
        if (!getMessagesController().G2()) {
            return false;
        }
        if (this.f26328r == null) {
            this.f26328r = Boolean.valueOf(this.f26327n.f22999e7.getBoolean("translate_chat_button", true));
        }
        return this.f26328r.booleanValue();
    }

    public final boolean s() {
        if (!getMessagesController().H2()) {
            return false;
        }
        if (this.f26329s == null) {
            this.f26329s = Boolean.valueOf(this.f26327n.f22999e7.getBoolean("translate_button", hp.e1().getBoolean("translate_button", false)));
        }
        return this.f26329s.booleanValue();
    }

    public final boolean t(long j10) {
        if (this.f26323b.contains(Long.valueOf(j10)) && v(j10) && !m5.C(j10) && getUserConfig().e() != j10) {
            return true;
        }
        return false;
    }

    public final boolean u() {
        if (r() && h10.i(this.currentAccount).q()) {
            return true;
        }
        return false;
    }

    public final boolean v(long j10) {
        if (!r()) {
            return false;
        }
        TLRPC.Chat M0 = getMessagesController().M0(Long.valueOf(-j10));
        if (!h10.i(this.currentAccount).q()) {
            if (M0 == null || !M0.autotranslation) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final boolean w(String str) {
        if (getUserConfig().q()) {
            return gy0.d0().contains(str);
        }
        try {
            return TextUtils.equals(bd.E0().B.f26565f, str);
        } catch (Exception unused) {
            return false;
        }
    }

    public final boolean z(long j10) {
        if (this.h.contains(Long.valueOf(j10))) {
            return true;
        }
        TLRPC.ChatFull N0 = getMessagesController().N0(-j10);
        if (N0 != null) {
            return N0.translations_disabled;
        }
        TLRPC.UserFull b22 = getMessagesController().b2(j10);
        if (b22 != null) {
            return b22.translations_disabled;
        }
        return false;
    }
}
