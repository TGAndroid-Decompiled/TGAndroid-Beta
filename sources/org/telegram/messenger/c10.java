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
import org.telegram.ui.Components.p21;
import org.telegram.ui.oy0;
import org.telegram.ui.wn0;
public final class c10 extends c1 {
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
    public final LongSparseArray f22786a;
    public final HashSet f22787b;
    public final HashMap f22788c;
    public final HashMap d;
    public final HashMap f22789e;
    public final HashMap f22790f;
    public final HashSet h;
    public final np f22791n;
    public Boolean f22792r;
    public Boolean f22793s;
    public final ArrayList f22794w;
    public final HashSet f22795x;
    public final HashSet f22796y;

    public c10(np npVar) {
        super(npVar.currentAccount);
        this.f22786a = new LongSparseArray();
        this.f22787b = new HashSet();
        this.f22788c = new HashMap();
        this.d = new HashMap();
        this.f22789e = new HashMap();
        this.f22790f = new HashMap();
        this.h = new HashSet();
        this.f22794w = new ArrayList();
        this.f22795x = new HashSet();
        this.f22796y = new HashSet();
        this.E = new HashMap();
        this.F = new HashMap();
        this.G = new HashSet();
        this.H = new HashMap();
        this.I = new HashMap();
        this.J = new HashSet();
        this.K = new HashSet();
        this.L = new HashSet();
        this.M = new HashSet();
        this.f22791n = npVar;
        g0.i3(new as(this, 17), 150L);
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
        String str = hd.E0().B.f23070f;
        if (str != null) {
            return str.split("_")[0];
        }
        return str;
    }

    public static ArrayList n() {
        ArrayList arrayList = new ArrayList();
        int i7 = 0;
        while (true) {
            List list = O;
            if (i7 >= list.size()) {
                break;
            }
            ?? obj = new Object();
            String str = (String) list.get(i7);
            obj.f26917a = str;
            if ("no".equals(str)) {
                obj.f26917a = "nb";
            }
            obj.f26918b = p21.K0(p21.O0(obj.f26917a, null, null));
            obj.f26919c = p21.K0(p21.W0(obj.f26917a, true));
            if (obj.f26918b != null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(obj.f26918b);
                sb2.append(" ");
                String str2 = obj.f26919c;
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
            Collections.sort(arrayList, new k00(Collator.getInstance(Locale.getDefault()), 0));
            return arrayList;
        }
        Collections.sort(arrayList, Comparator$CC.comparing(new aa.l(7)));
        return arrayList;
    }

    public static ArrayList o(String str) {
        ArrayList arrayList = new ArrayList();
        if (P == null) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            try {
                linkedHashSet.add(hd.E0().B.f23070f);
            } catch (Exception e10) {
                a8.g(e10, true);
            }
            try {
                linkedHashSet.add(Resources.getSystem().getConfiguration().locale.getLanguage());
            } catch (Exception e11) {
                a8.g(e11, true);
            }
            try {
                linkedHashSet.addAll(oy0.d0());
            } catch (Exception e12) {
                a8.g(e12, true);
            }
            try {
                InputMethodManager inputMethodManager = (InputMethodManager) t0.f26609b.getSystemService("input_method");
                for (InputMethodInfo inputMethodInfo : inputMethodManager.getEnabledInputMethodList()) {
                    for (InputMethodSubtype inputMethodSubtype : inputMethodManager.getEnabledInputMethodSubtypeList(inputMethodInfo, true)) {
                        if ("keyboard".equals(inputMethodSubtype.getMode())) {
                            String locale = inputMethodSubtype.getLocale();
                            if (locale != null && locale.contains("_")) {
                                locale = locale.split("_")[0];
                            }
                            if (p21.O0(locale, null, null) != null) {
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
                    obj.f26917a = str2;
                    if ("no".equals(str2)) {
                        obj.f26917a = "nb";
                    }
                    obj.f26918b = p21.K0(p21.O0(obj.f26917a, null, null));
                    obj.f26919c = p21.K0(p21.W0(obj.f26917a, true));
                    if (obj.f26918b != null) {
                        obj.d = (obj.f26918b + " " + obj.f26919c).toLowerCase();
                        arrayList.add(obj);
                    }
                }
            }
        }
        return arrayList;
    }

    public static boolean x(gj gjVar) {
        TLRPC.Message message;
        if (gjVar != null && (message = gjVar.f23819k) != null && message.summary_from_language != null && !gjVar.P3() && !gjVar.G0 && !gjVar.r4()) {
            int i7 = gjVar.D;
            if ((i7 == 0 || i7 == 3 || i7 == 1 || i7 == 9 || i7 == 14 || i7 == 17) && !TextUtils.isEmpty(gjVar.f23819k.message) && gjVar.f23819k.message.length() > 100) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static boolean y(gj gjVar) {
        if (gjVar != null && gjVar.f23819k != null && !gjVar.P3() && !gjVar.G0 && !gjVar.r4() && !(gj.m1(gjVar) instanceof TLRPC.TL_messageMediaWidget)) {
            int i7 = gjVar.D;
            if (i7 == 0 || i7 == 3 || i7 == 1 || i7 == 2 || i7 == 5 || i7 == 9 || i7 == 14 || i7 == 17 || i7 == 36) {
                if (TextUtils.isEmpty(gjVar.f23819k.message) && !(gj.m1(gjVar) instanceof TLRPC.TL_messageMediaPoll)) {
                    TLRPC.Message message = gjVar.f23819k;
                    if (message.rich_message == null && (!message.voiceTranscriptionOpen || TextUtils.isEmpty(message.voiceTranscription) || !gjVar.f23819k.voiceTranscriptionFinal)) {
                        return false;
                    }
                }
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean A(gj gjVar) {
        HashSet hashSet;
        TLRPC.Message message;
        boolean z10 = true;
        if (gjVar != null && (message = gjVar.f23819k) != null && message.summarizedOpen) {
            return this.G.contains(Integer.valueOf(Objects.hash(Long.valueOf(gj.B0(message)), Integer.valueOf(gjVar.e1()), Integer.valueOf(B(gj.B0(gjVar.f23819k)) ? 1 : 0))));
        }
        synchronized (this) {
            if (gjVar != null) {
                try {
                    TLRPC.Message message2 = gjVar.f23819k;
                    if (message2 != null) {
                        if (message2.voiceTranscriptionOpen && message2.voiceTranscriptionFinal) {
                            hashSet = this.f22796y;
                        } else {
                            hashSet = this.f22795x;
                        }
                        if (hashSet.contains(Integer.valueOf(gjVar.e1())) && B(gj.B0(gjVar.f23819k))) {
                        }
                    }
                } finally {
                }
            }
            z10 = false;
        }
        return z10;
    }

    public final boolean B(long j3) {
        if (v(j3)) {
            if (((Boolean) this.f22786a.get(j3, Boolean.valueOf(q(j3)))).booleanValue()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void C(gj gjVar) {
        Long valueOf = Long.valueOf(gj.B0(gjVar.f23819k));
        HashMap hashMap = this.f22790f;
        HashMap hashMap2 = (HashMap) hashMap.get(valueOf);
        if (hashMap2 == null) {
            Long valueOf2 = Long.valueOf(gj.B0(gjVar.f23819k));
            HashMap hashMap3 = new HashMap();
            hashMap.put(valueOf2, hashMap3);
            hashMap2 = hashMap3;
        }
        hashMap2.put(Integer.valueOf(gjVar.e1()), gjVar);
    }

    public final void E(gj gjVar, String str, s00 s00Var) {
        Throwable th2;
        w00 w00Var;
        int i7;
        if (gjVar.e1() >= 0) {
            long B0 = gj.B0(gjVar.f23819k);
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
                            w00Var = new w00();
                            arrayList.add(w00Var);
                        } else {
                            w00Var = (w00) arrayList.get(arrayList.size() - 1);
                        }
                        if (w00Var.f27283b.contains(Integer.valueOf(gjVar.e1()))) {
                            return;
                        }
                        TLRPC.MessageMedia m12 = gj.m1(gjVar);
                        if (!(m12 instanceof TLRPC.TL_messageMediaPoll)) {
                            return;
                        }
                        z00 a10 = z00.a((TLRPC.TL_messageMediaPoll) m12);
                        z00 z00Var = gjVar.f23819k.translatedPoll;
                        TLRPC.TL_textWithEntities tL_textWithEntities = a10.f27869a;
                        if (tL_textWithEntities != null) {
                            i7 = tL_textWithEntities.text.length();
                        } else {
                            i7 = 0;
                        }
                        for (int i10 = 0; i10 < a10.f27870b.size(); i10++) {
                            i7 += ((TLRPC.PollAnswer) a10.f27870b.get(i10)).text.text.length();
                        }
                        TLRPC.TL_textWithEntities tL_textWithEntities2 = a10.f27871c;
                        if (tL_textWithEntities2 != null) {
                            i7 += tL_textWithEntities2.text.length();
                        }
                        if (w00Var.f27287g + i7 >= 25000 || w00Var.f27283b.size() + 1 >= 20) {
                            g0.r(w00Var.f27282a);
                            g0.h3(w00Var.f27282a);
                            w00Var = new w00();
                            arrayList.add(w00Var);
                        }
                        dr drVar = w00Var.f27282a;
                        if (drVar != null) {
                            g0.r(drVar);
                        }
                        this.f22795x.add(Integer.valueOf(gjVar.e1()));
                        w00Var.f27283b.add(Integer.valueOf(gjVar.e1()));
                        a8.b("pending translation +" + gjVar.e1() + " poll message");
                        w00Var.f27284c.add(new Pair(a10, z00Var));
                        w00Var.d.add(s00Var);
                        w00Var.f27285e = str;
                        w00Var.f27287g = w00Var.f27287g + i7;
                        w00 w00Var2 = w00Var;
                        dr drVar2 = new dr(this, B0, w00Var2, 8);
                        w00Var2.f27282a = drVar2;
                        g0.i3(drVar2, w00Var2.f27286f);
                        w00Var2.f27286f /= 2;
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

    public final void F(gj gjVar, String str, z10 z10Var) {
        int i7;
        Long valueOf = Long.valueOf(gj.B0(gjVar.f23819k));
        Integer valueOf2 = Integer.valueOf(gjVar.e1());
        if (str != null) {
            i7 = 1;
        } else {
            i7 = 0;
        }
        int hash = Objects.hash(valueOf, valueOf2, Integer.valueOf(i7));
        Integer valueOf3 = Integer.valueOf(hash);
        HashSet hashSet = this.G;
        if (hashSet.contains(valueOf3)) {
            return;
        }
        hashSet.add(Integer.valueOf(hash));
        TLRPC.TL_messages_summarizeText tL_messages_summarizeText = new TLRPC.TL_messages_summarizeText();
        tL_messages_summarizeText.peer = np.s1(this.currentAccount).j1(gj.B0(gjVar.f23819k));
        tL_messages_summarizeText.f28173id = gjVar.e1();
        if (str != null) {
            tL_messages_summarizeText.flags |= 1;
            tL_messages_summarizeText.to_lang = D(str);
        }
        ConnectionsManager.getInstance(this.currentAccount).sendRequestTyped(tL_messages_summarizeText, new d3.b(1), new et(this, hash, z10Var));
    }

    public final void G(org.telegram.messenger.gj r15, java.lang.String r16, org.telegram.messenger.u00 r17) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.c10.G(org.telegram.messenger.gj, java.lang.String, org.telegram.messenger.u00):void");
    }

    public final void H() {
        StringBuilder sb2 = new StringBuilder();
        boolean z10 = true;
        int i7 = 0;
        while (true) {
            LongSparseArray longSparseArray = this.f22786a;
            if (i7 >= longSparseArray.size()) {
                break;
            }
            try {
                long keyAt = longSparseArray.keyAt(i7);
                if (!z10) {
                    sb2.append(";");
                }
                if (z10) {
                    z10 = false;
                }
                String str = (String) this.f22789e.get(Long.valueOf(keyAt));
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
        np.s1(this.currentAccount).f25283f7.edit().putString("translating_dialog_languages2", sb2.toString()).putStringSet("hidden_translation_at", hashSet).apply();
    }

    public final void I(long j3, String str) {
        c10 c10Var;
        long j10;
        String str2;
        Boolean bool;
        if (TextUtils.equals(m(j3), str)) {
            return;
        }
        if (B(j3)) {
            c10Var = this;
            j10 = j3;
            str2 = str;
            g0.i3(new a4(c10Var, j10, str2, 9), 150L);
        } else {
            c10Var = this;
            j10 = j3;
            str2 = str;
            synchronized (this) {
                c10Var.d.put(Long.valueOf(j10), str2);
            }
        }
        c(j10);
        synchronized (this) {
            LongSparseArray longSparseArray = c10Var.f22786a;
            bool = Boolean.FALSE;
            longSparseArray.put(j10, bool);
        }
        ns.f(c10Var.currentAccount).k(ns.P1, Long.valueOf(j10), bool);
        p21.T0(str2);
    }

    public final void J(long j3, boolean z10, boolean z11) {
        TLRPC.TL_messages_togglePeerTranslations tL_messages_togglePeerTranslations = new TLRPC.TL_messages_togglePeerTranslations();
        tL_messages_togglePeerTranslations.peer = getMessagesController().j1(j3);
        tL_messages_togglePeerTranslations.disabled = z10;
        getConnectionsManager().sendRequest(tL_messages_togglePeerTranslations, null);
        TLRPC.ChatFull N0 = getMessagesController().N0(-j3);
        if (N0 != null) {
            N0.translations_disabled = z10;
            getMessagesStorage().N1(N0, true);
        }
        TLRPC.UserFull b22 = getMessagesController().b2(j3);
        if (b22 != null) {
            b22.translations_disabled = z10;
            getMessagesStorage().j2(b22, true);
        }
        synchronized (this) {
            try {
                if (z10) {
                    this.h.add(Long.valueOf(j3));
                    this.f22786a.remove(j3);
                } else {
                    this.h.remove(Long.valueOf(j3));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        H();
        if (!z11) {
            ns.f(this.currentAccount).k(ns.P1, Long.valueOf(j3), Boolean.valueOf(B(j3)));
        }
    }

    public final boolean K(long j3, boolean z10) {
        boolean B = B(j3);
        int i7 = ns.P1;
        boolean z11 = true;
        LongSparseArray longSparseArray = this.f22786a;
        if (z10 && !B) {
            Boolean bool = Boolean.TRUE;
            longSparseArray.put(j3, bool);
            ns.f(this.currentAccount).k(i7, Long.valueOf(j3), bool);
        } else if (!z10 && B) {
            Boolean bool2 = Boolean.FALSE;
            longSparseArray.put(j3, bool2);
            ns.f(this.currentAccount).k(i7, Long.valueOf(j3), bool2);
            c(j3);
        } else {
            z11 = false;
        }
        H();
        return z11;
    }

    public final void L(gj gjVar, wn0 wn0Var) {
        if (gjVar != null && gjVar.f23819k != null) {
            f3.s sVar = new f3.s(gjVar);
            String M0 = p21.M0();
            TLRPC.Message message = gjVar.f23819k;
            if (message.translatedText != null && TextUtils.equals(message.translatedToLanguage, M0)) {
                wn0Var.run();
                return;
            }
            HashSet hashSet = this.M;
            if (hashSet.contains(sVar)) {
                wn0Var.run();
                return;
            }
            hashSet.add(sVar);
            TLRPC.TL_messages_translateText tL_messages_translateText = new TLRPC.TL_messages_translateText();
            tL_messages_translateText.flags |= 2;
            TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
            TLRPC.Message message2 = gjVar.f23819k;
            tL_textWithEntities.text = message2.message;
            ArrayList<TLRPC.MessageEntity> arrayList = message2.entities;
            tL_textWithEntities.entities = arrayList;
            if (arrayList == null) {
                tL_textWithEntities.entities = new ArrayList<>();
            }
            tL_messages_translateText.text.add(tL_textWithEntities);
            tL_messages_translateText.to_lang = D(M0);
            getConnectionsManager().sendRequest(tL_messages_translateText, new jm(this, gjVar, M0, sVar, wn0Var, System.currentTimeMillis(), tL_textWithEntities));
        }
    }

    public final void M(long j3) {
        boolean z10;
        if (v(j3) && t(j3)) {
            boolean contains = this.h.contains(Long.valueOf(j3));
            TLRPC.ChatFull N0 = getMessagesController().N0(-j3);
            if (N0 != null) {
                z10 = N0.translations_disabled;
            } else {
                TLRPC.UserFull b22 = getMessagesController().b2(j3);
                if (b22 != null) {
                    z10 = b22.translations_disabled;
                } else {
                    z10 = false;
                }
            }
            synchronized (this) {
                try {
                    if (z10) {
                        this.h.add(Long.valueOf(j3));
                        this.f22786a.remove(j3);
                    } else {
                        this.h.remove(Long.valueOf(j3));
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (contains != z10) {
                H();
                ns.f(this.currentAccount).k(ns.P1, Long.valueOf(j3), Boolean.valueOf(B(j3)));
            }
        }
    }

    public final boolean b(org.telegram.messenger.gj r3, java.lang.String r4) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.c10.b(org.telegram.messenger.gj, java.lang.String):boolean");
    }

    public final void c(long j3) {
        synchronized (this) {
            try {
                ArrayList arrayList = (ArrayList) this.E.get(Long.valueOf(j3));
                if (arrayList != null) {
                    int size = arrayList.size();
                    int i7 = 0;
                    while (i7 < size) {
                        Object obj = arrayList.get(i7);
                        i7++;
                        y00 y00Var = (y00) obj;
                        g0.r(y00Var.f27637a);
                        if (y00Var.h != -1) {
                            getConnectionsManager().cancelRequest(y00Var.h, true);
                            ArrayList arrayList2 = y00Var.f27638b;
                            int size2 = arrayList2.size();
                            int i10 = 0;
                            while (i10 < size2) {
                                Object obj2 = arrayList2.get(i10);
                                i10++;
                                this.f22795x.remove((Integer) obj2);
                            }
                        }
                    }
                    this.E.remove(Long.valueOf(j3));
                }
                ArrayList arrayList3 = (ArrayList) this.F.get(Long.valueOf(j3));
                if (arrayList3 != null) {
                    int size3 = arrayList3.size();
                    int i11 = 0;
                    while (i11 < size3) {
                        Object obj3 = arrayList3.get(i11);
                        i11++;
                        y00 y00Var2 = (y00) obj3;
                        g0.r(y00Var2.f27637a);
                        if (y00Var2.h != -1) {
                            getConnectionsManager().cancelRequest(y00Var2.h, true);
                            ArrayList arrayList4 = y00Var2.f27638b;
                            int size4 = arrayList4.size();
                            int i12 = 0;
                            while (i12 < size4) {
                                Object obj4 = arrayList4.get(i12);
                                i12++;
                                this.f22796y.remove((Integer) obj4);
                            }
                        }
                    }
                    this.F.remove(Long.valueOf(j3));
                }
                ArrayList arrayList5 = (ArrayList) this.H.get(Long.valueOf(j3));
                if (arrayList5 != null) {
                    int size5 = arrayList5.size();
                    int i13 = 0;
                    while (i13 < size5) {
                        Object obj5 = arrayList5.get(i13);
                        i13++;
                        w00 w00Var = (w00) obj5;
                        g0.r(w00Var.f27282a);
                        if (w00Var.h != -1) {
                            getConnectionsManager().cancelRequest(w00Var.h, true);
                            ArrayList arrayList6 = w00Var.f27283b;
                            int size6 = arrayList6.size();
                            int i14 = 0;
                            while (i14 < size6) {
                                Object obj6 = arrayList6.get(i14);
                                i14++;
                                this.f22795x.remove((Integer) obj6);
                            }
                        }
                    }
                    this.H.remove(Long.valueOf(j3));
                }
                ArrayList arrayList7 = (ArrayList) this.I.get(Long.valueOf(j3));
                if (arrayList7 != null) {
                    int size7 = arrayList7.size();
                    int i15 = 0;
                    while (i15 < size7) {
                        Object obj7 = arrayList7.get(i15);
                        i15++;
                        x00 x00Var = (x00) obj7;
                        g0.r(x00Var.f27447a);
                        if (x00Var.f27451f != -1) {
                            getConnectionsManager().cancelRequest(x00Var.f27451f, true);
                            ArrayList arrayList8 = x00Var.f27448b;
                            int size8 = arrayList8.size();
                            int i16 = 0;
                            while (i16 < size8) {
                                Object obj8 = arrayList8.get(i16);
                                i16++;
                                this.f22795x.remove((Integer) obj8);
                            }
                        }
                    }
                    this.I.remove(Long.valueOf(j3));
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
        if (!((Boolean) this.f22786a.get(j3, Boolean.valueOf(q(j3)))).booleanValue()) {
            return;
        }
        getMessagesStorage().f27219a.c(new l00(this, j3, 1));
    }

    public final void f(gj gjVar) {
        TLRPC.Message message;
        boolean z10;
        HashSet hashSet;
        int size;
        int i7;
        float f10;
        String str;
        String str2;
        if (gjVar != null && (message = gjVar.f23819k) != null) {
            long B0 = gj.B0(message);
            Long valueOf = Long.valueOf(B0);
            HashMap hashMap = this.f22788c;
            b10 b10Var = (b10) hashMap.get(valueOf);
            if (b10Var == null) {
                Long valueOf2 = Long.valueOf(B0);
                ?? obj = new Object();
                obj.f22644a = new HashSet();
                obj.f22645b = new HashSet();
                obj.f22646c = new HashSet();
                hashMap.put(valueOf2, obj);
                b10Var = obj;
            }
            HashSet hashSet2 = b10Var.f22646c;
            HashSet hashSet3 = b10Var.f22644a;
            HashSet hashSet4 = b10Var.f22645b;
            boolean z11 = false;
            if (y(gjVar) && ((str2 = gjVar.f23819k.originalLanguage) == null || "und".equals(str2))) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (y(gjVar) && (str = gjVar.f23819k.originalLanguage) != null && !"und".equals(str) && !w(gjVar.f23819k.originalLanguage)) {
                z11 = true;
            }
            if (z10) {
                hashSet4.add(Integer.valueOf(gjVar.e1()));
            } else {
                if (z11) {
                    hashSet = hashSet3;
                } else {
                    hashSet = hashSet2;
                }
                hashSet.add(Integer.valueOf(gjVar.e1()));
            }
            if (!z10) {
                this.f22789e.put(Long.valueOf(B0), gjVar.f23819k.originalLanguage);
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
                    this.f22787b.add(Long.valueOf(B0));
                    hashMap.remove(Long.valueOf(B0));
                    g0.i3(new l00(this, B0, 0), 450L);
                }
            }
        }
    }

    public final void g() {
        synchronized (this) {
            try {
                this.f22788c.clear();
                ArrayList arrayList = new ArrayList();
                Iterator it = this.f22787b.iterator();
                while (it.hasNext()) {
                    Long l10 = (Long) it.next();
                    long longValue = l10.longValue();
                    String str = (String) this.f22789e.get(l10);
                    if (str != null && w(str)) {
                        c(longValue);
                        this.f22786a.remove(longValue);
                        arrayList.add(l10);
                    }
                }
                this.f22787b.clear();
                H();
                int size = arrayList.size();
                int i7 = 0;
                while (i7 < size) {
                    Object obj = arrayList.get(i7);
                    i7++;
                    Long l11 = (Long) obj;
                    l11.getClass();
                    ns.f(this.currentAccount).k(ns.P1, l11, Boolean.FALSE);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void h(gj gjVar, boolean z10, final boolean z11) {
        TLRPC.Message message;
        TLRPC.TL_textWithEntities tL_textWithEntities;
        z00 z00Var;
        x00 x00Var;
        TLRPC.TL_textWithEntities tL_textWithEntities2;
        z00 z00Var2;
        gj gjVar2;
        if (gjVar != null && (message = gjVar.f23819k) != null) {
            final long B0 = gj.B0(message);
            final gj gjVar3 = null;
            r2 = null;
            r2 = null;
            String str = null;
            if (z10) {
                TLRPC.Message message2 = gjVar.f23819k;
                if (message2.summarizedOpen && message2.summaryText == null && !B(gj.B0(message2))) {
                    F(gjVar, null, new q00(this, gjVar, B0));
                }
            }
            if (v(B0)) {
                if (!z11 && (gjVar2 = gjVar.C) != null) {
                    h(gjVar2, z10, true);
                }
                if (y(gjVar)) {
                    if (!B(B0)) {
                        TLRPC.Message message3 = gjVar.f23819k;
                        if (message3 != null) {
                            if (!TextUtils.isEmpty(message3.message)) {
                                str = gjVar.f23819k.message;
                            } else if (gjVar.D == 36 && !TextUtils.isEmpty(gjVar.v)) {
                                str = gjVar.v.toString();
                            }
                        }
                        if (y(gjVar) && gjVar.f23819k != null && !TextUtils.isEmpty(str)) {
                            TLRPC.Message message4 = gjVar.f23819k;
                            if (message4.originalLanguage != null) {
                                f(gjVar);
                                return;
                            }
                            long B02 = gj.B0(message4);
                            int hash = Objects.hash(Long.valueOf(gj.B0(gjVar.f23819k)), Integer.valueOf(gjVar.e1()));
                            if (!t(B02) && !this.f22794w.contains(Integer.valueOf(hash))) {
                                this.f22794w.add(Integer.valueOf(hash));
                                Utilities.d.c(new j00(this, str, gjVar, B02, hash, 0));
                            }
                        }
                    } else if (!z(B0)) {
                        String m10 = m(B0);
                        if (!z11 && gjVar.D != 36) {
                            TLRPC.Message message5 = gjVar.f23819k;
                            if (message5.voiceTranscriptionOpen && message5.voiceTranscriptionFinal) {
                                tL_textWithEntities2 = message5.translatedVoiceTranscription;
                            } else {
                                tL_textWithEntities2 = message5.translatedText;
                            }
                            if ((tL_textWithEntities2 == null && message5.translatedPoll == null) || (((z00Var2 = message5.translatedPoll) != null && !z00.b(gjVar, z00Var2)) || !m10.equals(gjVar.f23819k.translatedToLanguage))) {
                                int e12 = gjVar.e1();
                                HashMap hashMap = (HashMap) this.f22790f.get(Long.valueOf(B0));
                                if (hashMap != null) {
                                    gjVar3 = (gj) hashMap.get(Integer.valueOf(e12));
                                }
                                if (gjVar3 != null) {
                                    TLRPC.Message message6 = gjVar.f23819k;
                                    TLRPC.Message message7 = gjVar3.f23819k;
                                    message6.translatedToLanguage = message7.translatedToLanguage;
                                    message6.translatedText = message7.translatedText;
                                    message6.translatedPoll = message7.translatedPoll;
                                    if (!z10 && B(B0)) {
                                        if (gjVar3.D == 36) {
                                            TLRPC.Message message8 = gjVar3.f23819k;
                                            if (message8.translatedRichMessage == null || !m10.equals(message8.translatedToLanguage)) {
                                                ns.f(this.currentAccount).k(ns.N1, gjVar3);
                                                u10 u10Var = new u10(this) {
                                                    public final c10 f26396b;

                                                    {
                                                        this.f26396b = this;
                                                    }

                                                    @Override
                                                    public final void a(Object obj, Object obj2, Object obj3) {
                                                        int i7 = r6;
                                                        long j3 = B0;
                                                        boolean z12 = z11;
                                                        gj gjVar4 = gjVar3;
                                                        c10 c10Var = this.f26396b;
                                                        switch (i7) {
                                                            case 0:
                                                                Integer num = (Integer) obj;
                                                                TL_iv.RichMessage richMessage = (TL_iv.RichMessage) obj2;
                                                                String str2 = (String) obj3;
                                                                if (gjVar4.e1() != num.intValue()) {
                                                                    a8.d("wtf, asked to translate " + gjVar4.e1() + " rich message but got " + num + "!");
                                                                }
                                                                TLRPC.Message message9 = gjVar4.f23819k;
                                                                message9.translatedToLanguage = str2;
                                                                message9.translatedText = null;
                                                                message9.translatedVoiceTranscription = null;
                                                                message9.translatedPoll = null;
                                                                message9.translatedRichMessage = richMessage;
                                                                if (z12) {
                                                                    c10Var.C(gjVar4);
                                                                }
                                                                c10Var.getMessagesStorage().X1(j3, gjVar4.f23819k);
                                                                ns.f(c10Var.currentAccount).k(128, gjVar4);
                                                                ArrayList arrayList = (ArrayList) c10Var.f22791n.S.f(j3);
                                                                if (arrayList != null) {
                                                                    for (int i10 = 0; i10 < arrayList.size(); i10++) {
                                                                        gj gjVar5 = (gj) arrayList.get(i10);
                                                                        if (gjVar5 != null && gjVar5.e1() == gjVar4.e1()) {
                                                                            TLRPC.Message message10 = gjVar5.f23819k;
                                                                            message10.translatedToLanguage = str2;
                                                                            message10.translatedRichMessage = richMessage;
                                                                            if (gjVar5.g6(false)) {
                                                                                ns.f(c10Var.currentAccount).k(2, 0);
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
                                                                z00 z00Var3 = (z00) obj2;
                                                                String str3 = (String) obj3;
                                                                boolean z13 = false;
                                                                if (gjVar4.e1() != num2.intValue()) {
                                                                    a8.d("wtf, asked to translate " + gjVar4.e1() + " poll but got " + num2 + "!");
                                                                }
                                                                TLRPC.Message message11 = gjVar4.f23819k;
                                                                message11.translatedToLanguage = str3;
                                                                message11.translatedText = null;
                                                                message11.translatedVoiceTranscription = null;
                                                                message11.translatedPoll = z00Var3;
                                                                if (z12) {
                                                                    c10Var.C(gjVar4);
                                                                }
                                                                c10Var.getMessagesStorage().X1(j3, gjVar4.f23819k);
                                                                ns.f(c10Var.currentAccount).k(128, gjVar4);
                                                                ArrayList arrayList2 = (ArrayList) c10Var.f22791n.S.f(j3);
                                                                if (arrayList2 != null) {
                                                                    int i11 = 0;
                                                                    while (i11 < arrayList2.size()) {
                                                                        gj gjVar6 = (gj) arrayList2.get(i11);
                                                                        if (gjVar6 != null && gjVar6.e1() == gjVar4.e1()) {
                                                                            TLRPC.Message message12 = gjVar6.f23819k;
                                                                            message12.translatedToLanguage = str3;
                                                                            message12.translatedText = null;
                                                                            message12.translatedVoiceTranscription = null;
                                                                            message12.translatedPoll = z00Var3;
                                                                            boolean z14 = z13;
                                                                            if (gjVar6.g6(z14)) {
                                                                                ns f10 = ns.f(c10Var.currentAccount);
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
                                                if (gjVar3.f23819k != null && gjVar3.e1() >= 0) {
                                                    TLRPC.Message message9 = gjVar3.f23819k;
                                                    if (message9.rich_message != null) {
                                                        long B03 = gj.B0(message9);
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
                                                                    x00Var = new x00();
                                                                    arrayList.add(x00Var);
                                                                } else {
                                                                    x00Var = (x00) arrayList.get(arrayList.size() - 1);
                                                                }
                                                                if (x00Var.f27448b.contains(Integer.valueOf(gjVar3.e1()))) {
                                                                    return;
                                                                }
                                                                if (x00Var.f27448b.size() + 1 >= 20) {
                                                                    g0.r(x00Var.f27447a);
                                                                    g0.h3(x00Var.f27447a);
                                                                    x00Var = new x00();
                                                                    arrayList.add(x00Var);
                                                                }
                                                                dr drVar = x00Var.f27447a;
                                                                if (drVar != null) {
                                                                    g0.r(drVar);
                                                                }
                                                                this.f22795x.add(Integer.valueOf(gjVar3.e1()));
                                                                x00Var.f27448b.add(Integer.valueOf(gjVar3.e1()));
                                                                a8.b("pending translation +" + gjVar3.e1() + " rich message");
                                                                x00Var.f27449c.add(u10Var);
                                                                x00Var.d = m10;
                                                                x00 x00Var2 = x00Var;
                                                                dr drVar2 = new dr(this, B03, x00Var2, 7);
                                                                x00Var2.f27447a = drVar2;
                                                                g0.i3(drVar2, x00Var2.f27450e);
                                                                x00Var2.f27450e /= 2;
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
                                        TLRPC.Message message10 = gjVar3.f23819k;
                                        if (message10.summarizedOpen) {
                                            if (message10.translatedSummaryText == null || !m10.equals(message10.translatedSummaryLanguage)) {
                                                F(gjVar3, m10, new t00(this, gjVar3, m10, B0));
                                                return;
                                            }
                                            return;
                                        }
                                        if (message10.voiceTranscriptionOpen && message10.voiceTranscriptionFinal) {
                                            tL_textWithEntities = message10.translatedVoiceTranscription;
                                        } else {
                                            tL_textWithEntities = message10.translatedText;
                                        }
                                        if ((tL_textWithEntities == null && message10.translatedPoll == null) || (((z00Var = message10.translatedPoll) != null && !z00.b(gjVar3, z00Var)) || !m10.equals(gjVar3.f23819k.translatedToLanguage))) {
                                            ns.f(this.currentAccount).k(ns.N1, gjVar3);
                                            if (gj.m1(gjVar3) instanceof TLRPC.TL_messageMediaPoll) {
                                                E(gjVar3, m10, new u10(this) {
                                                    public final c10 f26396b;

                                                    {
                                                        this.f26396b = this;
                                                    }

                                                    @Override
                                                    public final void a(Object obj, Object obj2, Object obj3) {
                                                        int i7 = r6;
                                                        long j3 = B0;
                                                        boolean z12 = z11;
                                                        gj gjVar4 = gjVar3;
                                                        c10 c10Var = this.f26396b;
                                                        switch (i7) {
                                                            case 0:
                                                                Integer num = (Integer) obj;
                                                                TL_iv.RichMessage richMessage = (TL_iv.RichMessage) obj2;
                                                                String str2 = (String) obj3;
                                                                if (gjVar4.e1() != num.intValue()) {
                                                                    a8.d("wtf, asked to translate " + gjVar4.e1() + " rich message but got " + num + "!");
                                                                }
                                                                TLRPC.Message message92 = gjVar4.f23819k;
                                                                message92.translatedToLanguage = str2;
                                                                message92.translatedText = null;
                                                                message92.translatedVoiceTranscription = null;
                                                                message92.translatedPoll = null;
                                                                message92.translatedRichMessage = richMessage;
                                                                if (z12) {
                                                                    c10Var.C(gjVar4);
                                                                }
                                                                c10Var.getMessagesStorage().X1(j3, gjVar4.f23819k);
                                                                ns.f(c10Var.currentAccount).k(128, gjVar4);
                                                                ArrayList arrayList3 = (ArrayList) c10Var.f22791n.S.f(j3);
                                                                if (arrayList3 != null) {
                                                                    for (int i10 = 0; i10 < arrayList3.size(); i10++) {
                                                                        gj gjVar5 = (gj) arrayList3.get(i10);
                                                                        if (gjVar5 != null && gjVar5.e1() == gjVar4.e1()) {
                                                                            TLRPC.Message message102 = gjVar5.f23819k;
                                                                            message102.translatedToLanguage = str2;
                                                                            message102.translatedRichMessage = richMessage;
                                                                            if (gjVar5.g6(false)) {
                                                                                ns.f(c10Var.currentAccount).k(2, 0);
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
                                                                z00 z00Var3 = (z00) obj2;
                                                                String str3 = (String) obj3;
                                                                boolean z13 = false;
                                                                if (gjVar4.e1() != num2.intValue()) {
                                                                    a8.d("wtf, asked to translate " + gjVar4.e1() + " poll but got " + num2 + "!");
                                                                }
                                                                TLRPC.Message message11 = gjVar4.f23819k;
                                                                message11.translatedToLanguage = str3;
                                                                message11.translatedText = null;
                                                                message11.translatedVoiceTranscription = null;
                                                                message11.translatedPoll = z00Var3;
                                                                if (z12) {
                                                                    c10Var.C(gjVar4);
                                                                }
                                                                c10Var.getMessagesStorage().X1(j3, gjVar4.f23819k);
                                                                ns.f(c10Var.currentAccount).k(128, gjVar4);
                                                                ArrayList arrayList22 = (ArrayList) c10Var.f22791n.S.f(j3);
                                                                if (arrayList22 != null) {
                                                                    int i11 = 0;
                                                                    while (i11 < arrayList22.size()) {
                                                                        gj gjVar6 = (gj) arrayList22.get(i11);
                                                                        if (gjVar6 != null && gjVar6.e1() == gjVar4.e1()) {
                                                                            TLRPC.Message message12 = gjVar6.f23819k;
                                                                            message12.translatedToLanguage = str3;
                                                                            message12.translatedText = null;
                                                                            message12.translatedVoiceTranscription = null;
                                                                            message12.translatedPoll = z00Var3;
                                                                            boolean z14 = z13;
                                                                            if (gjVar6.g6(z14)) {
                                                                                ns f10 = ns.f(c10Var.currentAccount);
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
                                                G(gjVar3, m10, new w10() {
                                                    @Override
                                                    public final void a(Object obj, Object obj2, Object obj3, Object obj4) {
                                                        Boolean bool = (Boolean) obj;
                                                        Integer num = (Integer) obj2;
                                                        TLRPC.TL_textWithEntities tL_textWithEntities3 = (TLRPC.TL_textWithEntities) obj3;
                                                        String str2 = (String) obj4;
                                                        gj gjVar4 = gjVar3;
                                                        if (gjVar4.e1() != num.intValue()) {
                                                            a8.d("wtf, asked to translate " + gjVar4.e1() + " but got " + num + "!");
                                                        }
                                                        gjVar4.f23819k.translatedToLanguage = str2;
                                                        if (bool.booleanValue()) {
                                                            gjVar4.f23819k.translatedVoiceTranscription = tL_textWithEntities3;
                                                        } else {
                                                            gjVar4.f23819k.translatedText = tL_textWithEntities3;
                                                        }
                                                        gjVar4.f23819k.translatedPoll = null;
                                                        c10 c10Var = c10.this;
                                                        if (z11) {
                                                            c10Var.C(gjVar4);
                                                        }
                                                        vr messagesStorage = c10Var.getMessagesStorage();
                                                        TLRPC.Message message11 = gjVar4.f23819k;
                                                        long j3 = B0;
                                                        messagesStorage.X1(j3, message11);
                                                        ns.f(c10Var.currentAccount).k(ns.M1, gjVar4);
                                                        ArrayList arrayList3 = (ArrayList) c10Var.f22791n.S.f(j3);
                                                        if (arrayList3 != null) {
                                                            for (int i7 = 0; i7 < arrayList3.size(); i7++) {
                                                                gj gjVar5 = (gj) arrayList3.get(i7);
                                                                if (gjVar5 != null && gjVar5.e1() == gjVar4.e1()) {
                                                                    gjVar5.f23819k.translatedToLanguage = str2;
                                                                    if (bool.booleanValue()) {
                                                                        gjVar5.f23819k.translatedVoiceTranscription = tL_textWithEntities3;
                                                                    } else {
                                                                        gjVar5.f23819k.translatedText = tL_textWithEntities3;
                                                                    }
                                                                    gjVar5.f23819k.translatedPoll = null;
                                                                    if (gjVar5.g6(false)) {
                                                                        ns.f(c10Var.currentAccount).k(ns.f25560r, 0);
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
                                            C(gjVar3);
                                            return;
                                        } else {
                                            return;
                                        }
                                    }
                                }
                            }
                        }
                        gjVar3 = gjVar;
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
                        int i7 = 0;
                        while (i7 < size) {
                            Object obj = arrayList.get(i7);
                            i7++;
                            y00 y00Var = (y00) obj;
                            g0.r(y00Var.f27637a);
                            if (y00Var.h != -1) {
                                getConnectionsManager().cancelRequest(y00Var.h, true);
                                ArrayList arrayList2 = y00Var.f27638b;
                                int size2 = arrayList2.size();
                                int i10 = 0;
                                while (i10 < size2) {
                                    Object obj2 = arrayList2.get(i10);
                                    i10++;
                                    this.f22795x.remove((Integer) obj2);
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
                            y00 y00Var2 = (y00) obj3;
                            g0.r(y00Var2.f27637a);
                            if (y00Var2.h != -1) {
                                getConnectionsManager().cancelRequest(y00Var2.h, true);
                                ArrayList arrayList4 = y00Var2.f27638b;
                                int size4 = arrayList4.size();
                                int i12 = 0;
                                while (i12 < size4) {
                                    Object obj4 = arrayList4.get(i12);
                                    i12++;
                                    this.f22796y.remove((Integer) obj4);
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
                            w00 w00Var = (w00) obj5;
                            g0.r(w00Var.f27282a);
                            if (w00Var.h != -1) {
                                getConnectionsManager().cancelRequest(w00Var.h, true);
                                ArrayList arrayList6 = w00Var.f27283b;
                                int size6 = arrayList6.size();
                                int i14 = 0;
                                while (i14 < size6) {
                                    Object obj6 = arrayList6.get(i14);
                                    i14++;
                                    this.f22795x.remove((Integer) obj6);
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
                            x00 x00Var = (x00) obj7;
                            g0.r(x00Var.f27447a);
                            if (x00Var.f27451f != -1) {
                                getConnectionsManager().cancelRequest(x00Var.f27451f, true);
                                ArrayList arrayList8 = x00Var.f27448b;
                                int size8 = arrayList8.size();
                                int i16 = 0;
                                while (i16 < size8) {
                                    Object obj8 = arrayList8.get(i16);
                                    i16++;
                                    this.f22795x.remove((Integer) obj8);
                                }
                            }
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        np.s1(this.currentAccount).f25283f7.edit().remove("translating_dialog_languages2").remove("hidden_translation_at").apply();
        this.f22786a.clear();
        this.f22787b.clear();
        this.f22788c.clear();
        this.d.clear();
        this.f22789e.clear();
        this.f22790f.clear();
        this.h.clear();
        this.f22795x.clear();
        this.f22796y.clear();
    }

    public final void k(gj gjVar, di.l9 l9Var) {
        TLRPC.Message message = gjVar.f23819k;
        if (message != null && !TextUtils.isEmpty(message.message)) {
            if (!TextUtils.isEmpty(gjVar.f23819k.originalLanguage)) {
                l9Var.a(gjVar.f23819k.originalLanguage);
                return;
            }
            f3.s sVar = new f3.s(gjVar);
            HashSet hashSet = this.L;
            if (!hashSet.contains(sVar)) {
                hashSet.add(sVar);
                b6.d(gjVar.f23819k.message, new i00(this, gjVar, sVar, l9Var), new i00(this, gjVar, sVar, l9Var), false);
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
                b6.d(storyItem.caption, new p00(this, storyItem, obj), new p00(this, storyItem, obj), false);
            }
        }
    }

    public final String m(long j3) {
        String str = (String) this.d.get(Long.valueOf(j3));
        if (str == null && ((str = p21.M0()) == null || str.equals((String) this.f22789e.get(Long.valueOf(j3))))) {
            str = j();
        }
        if ("nb".equals(str)) {
            return "no";
        }
        return str;
    }

    public final void p(gj gjVar) {
        TLRPC.Message message = gjVar.f23819k;
        if (message != null) {
            long B0 = gj.B0(message);
            if (!v(B0)) {
                return;
            }
            TLRPC.Message message2 = gjVar.f23819k;
            message2.translatedToLanguage = null;
            message2.translatedText = null;
            message2.translatedVoiceTranscription = null;
            message2.translatedPoll = null;
            message2.summaryText = null;
            message2.translatedSummaryText = null;
            message2.translatedSummaryLanguage = null;
            getMessagesStorage().X1(B0, gjVar.f23819k);
            g0.h3(new a4(this, gjVar, B0, 8));
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
        if (this.f22792r == null) {
            this.f22792r = Boolean.valueOf(this.f22791n.f25283f7.getBoolean("translate_chat_button", true));
        }
        return this.f22792r.booleanValue();
    }

    public final boolean s() {
        if (!getMessagesController().H2()) {
            return false;
        }
        if (this.f22793s == null) {
            this.f22793s = Boolean.valueOf(this.f22791n.f25283f7.getBoolean("translate_button", np.e1().getBoolean("translate_button", false)));
        }
        return this.f22793s.booleanValue();
    }

    public final boolean t(long j3) {
        if (this.f22787b.contains(Long.valueOf(j3)) && v(j3) && !m5.C(j3) && getUserConfig().e() != j3) {
            return true;
        }
        return false;
    }

    public final boolean u() {
        if (r() && m10.i(this.currentAccount).q()) {
            return true;
        }
        return false;
    }

    public final boolean v(long j3) {
        if (!r()) {
            return false;
        }
        TLRPC.Chat M0 = getMessagesController().M0(Long.valueOf(-j3));
        if (!m10.i(this.currentAccount).q()) {
            if (M0 == null || !M0.autotranslation) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final boolean w(String str) {
        if (getUserConfig().q()) {
            return oy0.d0().contains(str);
        }
        try {
            return TextUtils.equals(hd.E0().B.f23070f, str);
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
