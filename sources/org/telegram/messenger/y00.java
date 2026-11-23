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
import org.telegram.ui.Components.a31;
import org.telegram.ui.ry0;
import org.telegram.ui.zn0;
public final class y00 extends c1 {
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
    public final LongSparseArray f28180a;
    public final HashSet f28181b;
    public final HashMap f28182c;
    public final HashMap d;
    public final HashMap f28183e;
    public final HashMap f28184f;
    public final HashSet h;
    public final mp f28185n;
    public Boolean f28186r;
    public Boolean f28187s;
    public final ArrayList f28188w;
    public final HashSet f28189x;
    public final HashSet f28190y;

    public y00(mp mpVar) {
        super(mpVar.currentAccount);
        this.f28180a = new LongSparseArray();
        this.f28181b = new HashSet();
        this.f28182c = new HashMap();
        this.d = new HashMap();
        this.f28183e = new HashMap();
        this.f28184f = new HashMap();
        this.h = new HashSet();
        this.f28188w = new ArrayList();
        this.f28189x = new HashSet();
        this.f28190y = new HashSet();
        this.E = new HashMap();
        this.F = new HashMap();
        this.G = new HashSet();
        this.H = new HashMap();
        this.I = new HashMap();
        this.J = new HashSet();
        this.K = new HashSet();
        this.L = new HashSet();
        this.M = new HashSet();
        this.f28185n = mpVar;
        g0.h3(new xr(this, 17), 150L);
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
        String str = gd.E0().B.f23447f;
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
            obj.f26618a = str;
            if ("no".equals(str)) {
                obj.f26618a = "nb";
            }
            obj.f26619b = a31.L0(a31.P0(obj.f26618a, null, null));
            obj.f26620c = a31.L0(a31.X0(obj.f26618a, true));
            if (obj.f26619b != null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(obj.f26619b);
                sb2.append(" ");
                String str2 = obj.f26620c;
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
            Collections.sort(arrayList, new g00(Collator.getInstance(Locale.getDefault()), 0));
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
                linkedHashSet.add(gd.E0().B.f23447f);
            } catch (Exception e10) {
                a8.g(e10, true);
            }
            try {
                linkedHashSet.add(Resources.getSystem().getConfiguration().locale.getLanguage());
            } catch (Exception e11) {
                a8.g(e11, true);
            }
            try {
                linkedHashSet.addAll(ry0.d0());
            } catch (Exception e12) {
                a8.g(e12, true);
            }
            try {
                InputMethodManager inputMethodManager = (InputMethodManager) t0.f27013b.getSystemService("input_method");
                for (InputMethodInfo inputMethodInfo : inputMethodManager.getEnabledInputMethodList()) {
                    for (InputMethodSubtype inputMethodSubtype : inputMethodManager.getEnabledInputMethodSubtypeList(inputMethodInfo, true)) {
                        if ("keyboard".equals(inputMethodSubtype.getMode())) {
                            String locale = inputMethodSubtype.getLocale();
                            if (locale != null && locale.contains("_")) {
                                locale = locale.split("_")[0];
                            }
                            if (a31.P0(locale, null, null) != null) {
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
                    obj.f26618a = str2;
                    if ("no".equals(str2)) {
                        obj.f26618a = "nb";
                    }
                    obj.f26619b = a31.L0(a31.P0(obj.f26618a, null, null));
                    obj.f26620c = a31.L0(a31.X0(obj.f26618a, true));
                    if (obj.f26619b != null) {
                        obj.d = (obj.f26619b + " " + obj.f26620c).toLowerCase();
                        arrayList.add(obj);
                    }
                }
            }
        }
        return arrayList;
    }

    public static boolean x(fj fjVar) {
        TLRPC.Message message;
        if (fjVar != null && (message = fjVar.f24073k) != null && message.summary_from_language != null && !fjVar.P3() && !fjVar.G0 && !fjVar.r4()) {
            int i7 = fjVar.D;
            if ((i7 == 0 || i7 == 3 || i7 == 1 || i7 == 9 || i7 == 14 || i7 == 17) && !TextUtils.isEmpty(fjVar.f24073k.message) && fjVar.f24073k.message.length() > 100) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static boolean y(fj fjVar) {
        if (fjVar != null && fjVar.f24073k != null && !fjVar.P3() && !fjVar.G0 && !fjVar.r4() && !(fj.m1(fjVar) instanceof TLRPC.TL_messageMediaWidget)) {
            int i7 = fjVar.D;
            if (i7 == 0 || i7 == 3 || i7 == 1 || i7 == 2 || i7 == 5 || i7 == 9 || i7 == 14 || i7 == 17 || i7 == 36) {
                if (TextUtils.isEmpty(fjVar.f24073k.message) && !(fj.m1(fjVar) instanceof TLRPC.TL_messageMediaPoll)) {
                    TLRPC.Message message = fjVar.f24073k;
                    if (message.rich_message == null && (!message.voiceTranscriptionOpen || TextUtils.isEmpty(message.voiceTranscription) || !fjVar.f24073k.voiceTranscriptionFinal)) {
                        return false;
                    }
                }
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean A(fj fjVar) {
        HashSet hashSet;
        TLRPC.Message message;
        boolean z10 = true;
        if (fjVar != null && (message = fjVar.f24073k) != null && message.summarizedOpen) {
            return this.G.contains(Integer.valueOf(Objects.hash(Long.valueOf(fj.B0(message)), Integer.valueOf(fjVar.e1()), Integer.valueOf(B(fj.B0(fjVar.f24073k)) ? 1 : 0))));
        }
        synchronized (this) {
            if (fjVar != null) {
                try {
                    TLRPC.Message message2 = fjVar.f24073k;
                    if (message2 != null) {
                        if (message2.voiceTranscriptionOpen && message2.voiceTranscriptionFinal) {
                            hashSet = this.f28190y;
                        } else {
                            hashSet = this.f28189x;
                        }
                        if (hashSet.contains(Integer.valueOf(fjVar.e1())) && B(fj.B0(fjVar.f24073k))) {
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
            if (((Boolean) this.f28180a.get(j3, Boolean.valueOf(q(j3)))).booleanValue()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void C(fj fjVar) {
        Long valueOf = Long.valueOf(fj.B0(fjVar.f24073k));
        HashMap hashMap = this.f28184f;
        HashMap hashMap2 = (HashMap) hashMap.get(valueOf);
        if (hashMap2 == null) {
            Long valueOf2 = Long.valueOf(fj.B0(fjVar.f24073k));
            HashMap hashMap3 = new HashMap();
            hashMap.put(valueOf2, hashMap3);
            hashMap2 = hashMap3;
        }
        hashMap2.put(Integer.valueOf(fjVar.e1()), fjVar);
    }

    public final void E(fj fjVar, String str, o00 o00Var) {
        Throwable th2;
        s00 s00Var;
        int i7;
        if (fjVar.e1() >= 0) {
            long B0 = fj.B0(fjVar.f24073k);
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
                            s00Var = new s00();
                            arrayList.add(s00Var);
                        } else {
                            s00Var = (s00) arrayList.get(arrayList.size() - 1);
                        }
                        if (s00Var.f26822b.contains(Integer.valueOf(fjVar.e1()))) {
                            return;
                        }
                        TLRPC.MessageMedia m12 = fj.m1(fjVar);
                        if (!(m12 instanceof TLRPC.TL_messageMediaPoll)) {
                            return;
                        }
                        v00 a10 = v00.a((TLRPC.TL_messageMediaPoll) m12);
                        v00 v00Var = fjVar.f24073k.translatedPoll;
                        TLRPC.TL_textWithEntities tL_textWithEntities = a10.f27409a;
                        if (tL_textWithEntities != null) {
                            i7 = tL_textWithEntities.text.length();
                        } else {
                            i7 = 0;
                        }
                        for (int i10 = 0; i10 < a10.f27410b.size(); i10++) {
                            i7 += ((TLRPC.PollAnswer) a10.f27410b.get(i10)).text.text.length();
                        }
                        TLRPC.TL_textWithEntities tL_textWithEntities2 = a10.f27411c;
                        if (tL_textWithEntities2 != null) {
                            i7 += tL_textWithEntities2.text.length();
                        }
                        if (s00Var.f26826g + i7 >= 25000 || s00Var.f26822b.size() + 1 >= 20) {
                            g0.r(s00Var.f26821a);
                            g0.g3(s00Var.f26821a);
                            s00Var = new s00();
                            arrayList.add(s00Var);
                        }
                        br brVar = s00Var.f26821a;
                        if (brVar != null) {
                            g0.r(brVar);
                        }
                        this.f28189x.add(Integer.valueOf(fjVar.e1()));
                        s00Var.f26822b.add(Integer.valueOf(fjVar.e1()));
                        a8.b("pending translation +" + fjVar.e1() + " poll message");
                        s00Var.f26823c.add(new Pair(a10, v00Var));
                        s00Var.d.add(o00Var);
                        s00Var.f26824e = str;
                        s00Var.f26826g = s00Var.f26826g + i7;
                        s00 s00Var2 = s00Var;
                        br brVar2 = new br(this, B0, s00Var2, 9);
                        s00Var2.f26821a = brVar2;
                        g0.h3(brVar2, s00Var2.f26825f);
                        s00Var2.f26825f /= 2;
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

    public final void F(fj fjVar, String str, w10 w10Var) {
        int i7;
        Long valueOf = Long.valueOf(fj.B0(fjVar.f24073k));
        Integer valueOf2 = Integer.valueOf(fjVar.e1());
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
        tL_messages_summarizeText.peer = mp.u1(this.currentAccount).l1(fj.B0(fjVar.f24073k));
        tL_messages_summarizeText.f28614id = fjVar.e1();
        if (str != null) {
            tL_messages_summarizeText.flags |= 1;
            tL_messages_summarizeText.to_lang = D(str);
        }
        ConnectionsManager.getInstance(this.currentAccount).sendRequestTyped(tL_messages_summarizeText, new d3.b(1), new bt(this, hash, w10Var));
    }

    public final void G(org.telegram.messenger.fj r15, java.lang.String r16, org.telegram.messenger.q00 r17) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.y00.G(org.telegram.messenger.fj, java.lang.String, org.telegram.messenger.q00):void");
    }

    public final void H() {
        StringBuilder sb2 = new StringBuilder();
        boolean z10 = true;
        int i7 = 0;
        while (true) {
            LongSparseArray longSparseArray = this.f28180a;
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
                String str = (String) this.f28183e.get(Long.valueOf(keyAt));
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
        mp.u1(this.currentAccount).h7.edit().putString("translating_dialog_languages2", sb2.toString()).putStringSet("hidden_translation_at", hashSet).apply();
    }

    public final void I(long j3, String str) {
        y00 y00Var;
        long j10;
        String str2;
        Boolean bool;
        if (TextUtils.equals(m(j3), str)) {
            return;
        }
        if (B(j3)) {
            y00Var = this;
            j10 = j3;
            str2 = str;
            g0.h3(new d4(y00Var, j10, str2, 9), 150L);
        } else {
            y00Var = this;
            j10 = j3;
            str2 = str;
            synchronized (this) {
                y00Var.d.put(Long.valueOf(j10), str2);
            }
        }
        c(j10);
        synchronized (this) {
            LongSparseArray longSparseArray = y00Var.f28180a;
            bool = Boolean.FALSE;
            longSparseArray.put(j10, bool);
        }
        ks.f(y00Var.currentAccount).k(ks.P1, Long.valueOf(j10), bool);
        a31.U0(str2);
    }

    public final void J(long j3, boolean z10, boolean z11) {
        TLRPC.TL_messages_togglePeerTranslations tL_messages_togglePeerTranslations = new TLRPC.TL_messages_togglePeerTranslations();
        tL_messages_togglePeerTranslations.peer = getMessagesController().l1(j3);
        tL_messages_togglePeerTranslations.disabled = z10;
        getConnectionsManager().sendRequest(tL_messages_togglePeerTranslations, null);
        TLRPC.ChatFull P0 = getMessagesController().P0(-j3);
        if (P0 != null) {
            P0.translations_disabled = z10;
            getMessagesStorage().N1(P0, true);
        }
        TLRPC.UserFull d2 = getMessagesController().d2(j3);
        if (d2 != null) {
            d2.translations_disabled = z10;
            getMessagesStorage().j2(d2, true);
        }
        synchronized (this) {
            try {
                if (z10) {
                    this.h.add(Long.valueOf(j3));
                    this.f28180a.remove(j3);
                } else {
                    this.h.remove(Long.valueOf(j3));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        H();
        if (!z11) {
            ks.f(this.currentAccount).k(ks.P1, Long.valueOf(j3), Boolean.valueOf(B(j3)));
        }
    }

    public final boolean K(long j3, boolean z10) {
        boolean B = B(j3);
        int i7 = ks.P1;
        boolean z11 = true;
        LongSparseArray longSparseArray = this.f28180a;
        if (z10 && !B) {
            Boolean bool = Boolean.TRUE;
            longSparseArray.put(j3, bool);
            ks.f(this.currentAccount).k(i7, Long.valueOf(j3), bool);
        } else if (!z10 && B) {
            Boolean bool2 = Boolean.FALSE;
            longSparseArray.put(j3, bool2);
            ks.f(this.currentAccount).k(i7, Long.valueOf(j3), bool2);
            c(j3);
        } else {
            z11 = false;
        }
        H();
        return z11;
    }

    public final void L(fj fjVar, zn0 zn0Var) {
        if (fjVar != null && fjVar.f24073k != null) {
            f3.s sVar = new f3.s(fjVar);
            String N0 = a31.N0();
            TLRPC.Message message = fjVar.f24073k;
            if (message.translatedText != null && TextUtils.equals(message.translatedToLanguage, N0)) {
                zn0Var.run();
                return;
            }
            HashSet hashSet = this.M;
            if (hashSet.contains(sVar)) {
                zn0Var.run();
                return;
            }
            hashSet.add(sVar);
            TLRPC.TL_messages_translateText tL_messages_translateText = new TLRPC.TL_messages_translateText();
            tL_messages_translateText.flags |= 2;
            TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
            TLRPC.Message message2 = fjVar.f24073k;
            tL_textWithEntities.text = message2.message;
            ArrayList<TLRPC.MessageEntity> arrayList = message2.entities;
            tL_textWithEntities.entities = arrayList;
            if (arrayList == null) {
                tL_textWithEntities.entities = new ArrayList<>();
            }
            tL_messages_translateText.text.add(tL_textWithEntities);
            tL_messages_translateText.to_lang = D(N0);
            getConnectionsManager().sendRequest(tL_messages_translateText, new dm(this, fjVar, N0, sVar, zn0Var, System.currentTimeMillis(), tL_textWithEntities));
        }
    }

    public final void M(long j3) {
        boolean z10;
        if (v(j3) && t(j3)) {
            boolean contains = this.h.contains(Long.valueOf(j3));
            TLRPC.ChatFull P0 = getMessagesController().P0(-j3);
            if (P0 != null) {
                z10 = P0.translations_disabled;
            } else {
                TLRPC.UserFull d2 = getMessagesController().d2(j3);
                if (d2 != null) {
                    z10 = d2.translations_disabled;
                } else {
                    z10 = false;
                }
            }
            synchronized (this) {
                try {
                    if (z10) {
                        this.h.add(Long.valueOf(j3));
                        this.f28180a.remove(j3);
                    } else {
                        this.h.remove(Long.valueOf(j3));
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (contains != z10) {
                H();
                ks.f(this.currentAccount).k(ks.P1, Long.valueOf(j3), Boolean.valueOf(B(j3)));
            }
        }
    }

    public final boolean b(org.telegram.messenger.fj r3, java.lang.String r4) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.y00.b(org.telegram.messenger.fj, java.lang.String):boolean");
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
                        u00 u00Var = (u00) obj;
                        g0.r(u00Var.f27204a);
                        if (u00Var.h != -1) {
                            getConnectionsManager().cancelRequest(u00Var.h, true);
                            ArrayList arrayList2 = u00Var.f27205b;
                            int size2 = arrayList2.size();
                            int i10 = 0;
                            while (i10 < size2) {
                                Object obj2 = arrayList2.get(i10);
                                i10++;
                                this.f28189x.remove((Integer) obj2);
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
                        u00 u00Var2 = (u00) obj3;
                        g0.r(u00Var2.f27204a);
                        if (u00Var2.h != -1) {
                            getConnectionsManager().cancelRequest(u00Var2.h, true);
                            ArrayList arrayList4 = u00Var2.f27205b;
                            int size4 = arrayList4.size();
                            int i12 = 0;
                            while (i12 < size4) {
                                Object obj4 = arrayList4.get(i12);
                                i12++;
                                this.f28190y.remove((Integer) obj4);
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
                        s00 s00Var = (s00) obj5;
                        g0.r(s00Var.f26821a);
                        if (s00Var.h != -1) {
                            getConnectionsManager().cancelRequest(s00Var.h, true);
                            ArrayList arrayList6 = s00Var.f26822b;
                            int size6 = arrayList6.size();
                            int i14 = 0;
                            while (i14 < size6) {
                                Object obj6 = arrayList6.get(i14);
                                i14++;
                                this.f28189x.remove((Integer) obj6);
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
                        t00 t00Var = (t00) obj7;
                        g0.r(t00Var.f27023a);
                        if (t00Var.f27027f != -1) {
                            getConnectionsManager().cancelRequest(t00Var.f27027f, true);
                            ArrayList arrayList8 = t00Var.f27024b;
                            int size8 = arrayList8.size();
                            int i16 = 0;
                            while (i16 < size8) {
                                Object obj8 = arrayList8.get(i16);
                                i16++;
                                this.f28189x.remove((Integer) obj8);
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
        if (!((Boolean) this.f28180a.get(j3, Boolean.valueOf(q(j3)))).booleanValue()) {
            return;
        }
        getMessagesStorage().f27149a.c(new h00(this, j3, 1));
    }

    public final void f(fj fjVar) {
        TLRPC.Message message;
        boolean z10;
        HashSet hashSet;
        int size;
        int i7;
        float f10;
        String str;
        String str2;
        if (fjVar != null && (message = fjVar.f24073k) != null) {
            long B0 = fj.B0(message);
            Long valueOf = Long.valueOf(B0);
            HashMap hashMap = this.f28182c;
            x00 x00Var = (x00) hashMap.get(valueOf);
            if (x00Var == null) {
                Long valueOf2 = Long.valueOf(B0);
                ?? obj = new Object();
                obj.f27897a = new HashSet();
                obj.f27898b = new HashSet();
                obj.f27899c = new HashSet();
                hashMap.put(valueOf2, obj);
                x00Var = obj;
            }
            HashSet hashSet2 = x00Var.f27899c;
            HashSet hashSet3 = x00Var.f27897a;
            HashSet hashSet4 = x00Var.f27898b;
            boolean z11 = false;
            if (y(fjVar) && ((str2 = fjVar.f24073k.originalLanguage) == null || "und".equals(str2))) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (y(fjVar) && (str = fjVar.f24073k.originalLanguage) != null && !"und".equals(str) && !w(fjVar.f24073k.originalLanguage)) {
                z11 = true;
            }
            if (z10) {
                hashSet4.add(Integer.valueOf(fjVar.e1()));
            } else {
                if (z11) {
                    hashSet = hashSet3;
                } else {
                    hashSet = hashSet2;
                }
                hashSet.add(Integer.valueOf(fjVar.e1()));
            }
            if (!z10) {
                this.f28183e.put(Long.valueOf(B0), fjVar.f24073k.originalLanguage);
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
                    this.f28181b.add(Long.valueOf(B0));
                    hashMap.remove(Long.valueOf(B0));
                    g0.h3(new h00(this, B0, 0), 450L);
                }
            }
        }
    }

    public final void g() {
        synchronized (this) {
            try {
                this.f28182c.clear();
                ArrayList arrayList = new ArrayList();
                Iterator it = this.f28181b.iterator();
                while (it.hasNext()) {
                    Long l10 = (Long) it.next();
                    long longValue = l10.longValue();
                    String str = (String) this.f28183e.get(l10);
                    if (str != null && w(str)) {
                        c(longValue);
                        this.f28180a.remove(longValue);
                        arrayList.add(l10);
                    }
                }
                this.f28181b.clear();
                H();
                int size = arrayList.size();
                int i7 = 0;
                while (i7 < size) {
                    Object obj = arrayList.get(i7);
                    i7++;
                    Long l11 = (Long) obj;
                    l11.getClass();
                    ks.f(this.currentAccount).k(ks.P1, l11, Boolean.FALSE);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void h(fj fjVar, boolean z10, final boolean z11) {
        TLRPC.Message message;
        TLRPC.TL_textWithEntities tL_textWithEntities;
        v00 v00Var;
        t00 t00Var;
        TLRPC.TL_textWithEntities tL_textWithEntities2;
        v00 v00Var2;
        fj fjVar2;
        if (fjVar != null && (message = fjVar.f24073k) != null) {
            final long B0 = fj.B0(message);
            final fj fjVar3 = null;
            r2 = null;
            r2 = null;
            String str = null;
            if (z10) {
                TLRPC.Message message2 = fjVar.f24073k;
                if (message2.summarizedOpen && message2.summaryText == null && !B(fj.B0(message2))) {
                    F(fjVar, null, new m00(this, fjVar, B0));
                }
            }
            if (v(B0)) {
                if (!z11 && (fjVar2 = fjVar.C) != null) {
                    h(fjVar2, z10, true);
                }
                if (y(fjVar)) {
                    if (!B(B0)) {
                        TLRPC.Message message3 = fjVar.f24073k;
                        if (message3 != null) {
                            if (!TextUtils.isEmpty(message3.message)) {
                                str = fjVar.f24073k.message;
                            } else if (fjVar.D == 36 && !TextUtils.isEmpty(fjVar.v)) {
                                str = fjVar.v.toString();
                            }
                        }
                        if (y(fjVar) && fjVar.f24073k != null && !TextUtils.isEmpty(str)) {
                            TLRPC.Message message4 = fjVar.f24073k;
                            if (message4.originalLanguage != null) {
                                f(fjVar);
                                return;
                            }
                            long B02 = fj.B0(message4);
                            int hash = Objects.hash(Long.valueOf(fj.B0(fjVar.f24073k)), Integer.valueOf(fjVar.e1()));
                            if (!t(B02) && !this.f28188w.contains(Integer.valueOf(hash))) {
                                this.f28188w.add(Integer.valueOf(hash));
                                Utilities.d.c(new f00(this, str, fjVar, B02, hash, 0));
                            }
                        }
                    } else if (!z(B0)) {
                        String m10 = m(B0);
                        if (!z11 && fjVar.D != 36) {
                            TLRPC.Message message5 = fjVar.f24073k;
                            if (message5.voiceTranscriptionOpen && message5.voiceTranscriptionFinal) {
                                tL_textWithEntities2 = message5.translatedVoiceTranscription;
                            } else {
                                tL_textWithEntities2 = message5.translatedText;
                            }
                            if ((tL_textWithEntities2 == null && message5.translatedPoll == null) || (((v00Var2 = message5.translatedPoll) != null && !v00.b(fjVar, v00Var2)) || !m10.equals(fjVar.f24073k.translatedToLanguage))) {
                                int e12 = fjVar.e1();
                                HashMap hashMap = (HashMap) this.f28184f.get(Long.valueOf(B0));
                                if (hashMap != null) {
                                    fjVar3 = (fj) hashMap.get(Integer.valueOf(e12));
                                }
                                if (fjVar3 != null) {
                                    TLRPC.Message message6 = fjVar.f24073k;
                                    TLRPC.Message message7 = fjVar3.f24073k;
                                    message6.translatedToLanguage = message7.translatedToLanguage;
                                    message6.translatedText = message7.translatedText;
                                    message6.translatedPoll = message7.translatedPoll;
                                    if (!z10 && B(B0)) {
                                        if (fjVar3.D == 36) {
                                            TLRPC.Message message8 = fjVar3.f24073k;
                                            if (message8.translatedRichMessage == null || !m10.equals(message8.translatedToLanguage)) {
                                                ks.f(this.currentAccount).k(ks.N1, fjVar3);
                                                r10 r10Var = new r10(this) {
                                                    public final y00 f26114b;

                                                    {
                                                        this.f26114b = this;
                                                    }

                                                    @Override
                                                    public final void a(Object obj, Object obj2, Object obj3) {
                                                        int i7 = r6;
                                                        long j3 = B0;
                                                        boolean z12 = z11;
                                                        fj fjVar4 = fjVar3;
                                                        y00 y00Var = this.f26114b;
                                                        switch (i7) {
                                                            case 0:
                                                                Integer num = (Integer) obj;
                                                                TL_iv.RichMessage richMessage = (TL_iv.RichMessage) obj2;
                                                                String str2 = (String) obj3;
                                                                if (fjVar4.e1() != num.intValue()) {
                                                                    a8.d("wtf, asked to translate " + fjVar4.e1() + " rich message but got " + num + "!");
                                                                }
                                                                TLRPC.Message message9 = fjVar4.f24073k;
                                                                message9.translatedToLanguage = str2;
                                                                message9.translatedText = null;
                                                                message9.translatedVoiceTranscription = null;
                                                                message9.translatedPoll = null;
                                                                message9.translatedRichMessage = richMessage;
                                                                if (z12) {
                                                                    y00Var.C(fjVar4);
                                                                }
                                                                y00Var.getMessagesStorage().X1(j3, fjVar4.f24073k);
                                                                ks.f(y00Var.currentAccount).k(128, fjVar4);
                                                                ArrayList arrayList = (ArrayList) y00Var.f28185n.S.f(j3);
                                                                if (arrayList != null) {
                                                                    for (int i10 = 0; i10 < arrayList.size(); i10++) {
                                                                        fj fjVar5 = (fj) arrayList.get(i10);
                                                                        if (fjVar5 != null && fjVar5.e1() == fjVar4.e1()) {
                                                                            TLRPC.Message message10 = fjVar5.f24073k;
                                                                            message10.translatedToLanguage = str2;
                                                                            message10.translatedRichMessage = richMessage;
                                                                            if (fjVar5.g6(false)) {
                                                                                ks.f(y00Var.currentAccount).k(2, 0);
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
                                                                v00 v00Var3 = (v00) obj2;
                                                                String str3 = (String) obj3;
                                                                boolean z13 = false;
                                                                if (fjVar4.e1() != num2.intValue()) {
                                                                    a8.d("wtf, asked to translate " + fjVar4.e1() + " poll but got " + num2 + "!");
                                                                }
                                                                TLRPC.Message message11 = fjVar4.f24073k;
                                                                message11.translatedToLanguage = str3;
                                                                message11.translatedText = null;
                                                                message11.translatedVoiceTranscription = null;
                                                                message11.translatedPoll = v00Var3;
                                                                if (z12) {
                                                                    y00Var.C(fjVar4);
                                                                }
                                                                y00Var.getMessagesStorage().X1(j3, fjVar4.f24073k);
                                                                ks.f(y00Var.currentAccount).k(128, fjVar4);
                                                                ArrayList arrayList2 = (ArrayList) y00Var.f28185n.S.f(j3);
                                                                if (arrayList2 != null) {
                                                                    int i11 = 0;
                                                                    while (i11 < arrayList2.size()) {
                                                                        fj fjVar6 = (fj) arrayList2.get(i11);
                                                                        if (fjVar6 != null && fjVar6.e1() == fjVar4.e1()) {
                                                                            TLRPC.Message message12 = fjVar6.f24073k;
                                                                            message12.translatedToLanguage = str3;
                                                                            message12.translatedText = null;
                                                                            message12.translatedVoiceTranscription = null;
                                                                            message12.translatedPoll = v00Var3;
                                                                            boolean z14 = z13;
                                                                            if (fjVar6.g6(z14)) {
                                                                                ks f10 = ks.f(y00Var.currentAccount);
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
                                                if (fjVar3.f24073k != null && fjVar3.e1() >= 0) {
                                                    TLRPC.Message message9 = fjVar3.f24073k;
                                                    if (message9.rich_message != null) {
                                                        long B03 = fj.B0(message9);
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
                                                                    t00Var = new t00();
                                                                    arrayList.add(t00Var);
                                                                } else {
                                                                    t00Var = (t00) arrayList.get(arrayList.size() - 1);
                                                                }
                                                                if (t00Var.f27024b.contains(Integer.valueOf(fjVar3.e1()))) {
                                                                    return;
                                                                }
                                                                if (t00Var.f27024b.size() + 1 >= 20) {
                                                                    g0.r(t00Var.f27023a);
                                                                    g0.g3(t00Var.f27023a);
                                                                    t00Var = new t00();
                                                                    arrayList.add(t00Var);
                                                                }
                                                                br brVar = t00Var.f27023a;
                                                                if (brVar != null) {
                                                                    g0.r(brVar);
                                                                }
                                                                this.f28189x.add(Integer.valueOf(fjVar3.e1()));
                                                                t00Var.f27024b.add(Integer.valueOf(fjVar3.e1()));
                                                                a8.b("pending translation +" + fjVar3.e1() + " rich message");
                                                                t00Var.f27025c.add(r10Var);
                                                                t00Var.d = m10;
                                                                t00 t00Var2 = t00Var;
                                                                br brVar2 = new br(this, B03, t00Var2, 8);
                                                                t00Var2.f27023a = brVar2;
                                                                g0.h3(brVar2, t00Var2.f27026e);
                                                                t00Var2.f27026e /= 2;
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
                                        TLRPC.Message message10 = fjVar3.f24073k;
                                        if (message10.summarizedOpen) {
                                            if (message10.translatedSummaryText == null || !m10.equals(message10.translatedSummaryLanguage)) {
                                                F(fjVar3, m10, new p00(this, fjVar3, m10, B0));
                                                return;
                                            }
                                            return;
                                        }
                                        if (message10.voiceTranscriptionOpen && message10.voiceTranscriptionFinal) {
                                            tL_textWithEntities = message10.translatedVoiceTranscription;
                                        } else {
                                            tL_textWithEntities = message10.translatedText;
                                        }
                                        if ((tL_textWithEntities == null && message10.translatedPoll == null) || (((v00Var = message10.translatedPoll) != null && !v00.b(fjVar3, v00Var)) || !m10.equals(fjVar3.f24073k.translatedToLanguage))) {
                                            ks.f(this.currentAccount).k(ks.N1, fjVar3);
                                            if (fj.m1(fjVar3) instanceof TLRPC.TL_messageMediaPoll) {
                                                E(fjVar3, m10, new r10(this) {
                                                    public final y00 f26114b;

                                                    {
                                                        this.f26114b = this;
                                                    }

                                                    @Override
                                                    public final void a(Object obj, Object obj2, Object obj3) {
                                                        int i7 = r6;
                                                        long j3 = B0;
                                                        boolean z12 = z11;
                                                        fj fjVar4 = fjVar3;
                                                        y00 y00Var = this.f26114b;
                                                        switch (i7) {
                                                            case 0:
                                                                Integer num = (Integer) obj;
                                                                TL_iv.RichMessage richMessage = (TL_iv.RichMessage) obj2;
                                                                String str2 = (String) obj3;
                                                                if (fjVar4.e1() != num.intValue()) {
                                                                    a8.d("wtf, asked to translate " + fjVar4.e1() + " rich message but got " + num + "!");
                                                                }
                                                                TLRPC.Message message92 = fjVar4.f24073k;
                                                                message92.translatedToLanguage = str2;
                                                                message92.translatedText = null;
                                                                message92.translatedVoiceTranscription = null;
                                                                message92.translatedPoll = null;
                                                                message92.translatedRichMessage = richMessage;
                                                                if (z12) {
                                                                    y00Var.C(fjVar4);
                                                                }
                                                                y00Var.getMessagesStorage().X1(j3, fjVar4.f24073k);
                                                                ks.f(y00Var.currentAccount).k(128, fjVar4);
                                                                ArrayList arrayList3 = (ArrayList) y00Var.f28185n.S.f(j3);
                                                                if (arrayList3 != null) {
                                                                    for (int i10 = 0; i10 < arrayList3.size(); i10++) {
                                                                        fj fjVar5 = (fj) arrayList3.get(i10);
                                                                        if (fjVar5 != null && fjVar5.e1() == fjVar4.e1()) {
                                                                            TLRPC.Message message102 = fjVar5.f24073k;
                                                                            message102.translatedToLanguage = str2;
                                                                            message102.translatedRichMessage = richMessage;
                                                                            if (fjVar5.g6(false)) {
                                                                                ks.f(y00Var.currentAccount).k(2, 0);
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
                                                                v00 v00Var3 = (v00) obj2;
                                                                String str3 = (String) obj3;
                                                                boolean z13 = false;
                                                                if (fjVar4.e1() != num2.intValue()) {
                                                                    a8.d("wtf, asked to translate " + fjVar4.e1() + " poll but got " + num2 + "!");
                                                                }
                                                                TLRPC.Message message11 = fjVar4.f24073k;
                                                                message11.translatedToLanguage = str3;
                                                                message11.translatedText = null;
                                                                message11.translatedVoiceTranscription = null;
                                                                message11.translatedPoll = v00Var3;
                                                                if (z12) {
                                                                    y00Var.C(fjVar4);
                                                                }
                                                                y00Var.getMessagesStorage().X1(j3, fjVar4.f24073k);
                                                                ks.f(y00Var.currentAccount).k(128, fjVar4);
                                                                ArrayList arrayList22 = (ArrayList) y00Var.f28185n.S.f(j3);
                                                                if (arrayList22 != null) {
                                                                    int i11 = 0;
                                                                    while (i11 < arrayList22.size()) {
                                                                        fj fjVar6 = (fj) arrayList22.get(i11);
                                                                        if (fjVar6 != null && fjVar6.e1() == fjVar4.e1()) {
                                                                            TLRPC.Message message12 = fjVar6.f24073k;
                                                                            message12.translatedToLanguage = str3;
                                                                            message12.translatedText = null;
                                                                            message12.translatedVoiceTranscription = null;
                                                                            message12.translatedPoll = v00Var3;
                                                                            boolean z14 = z13;
                                                                            if (fjVar6.g6(z14)) {
                                                                                ks f10 = ks.f(y00Var.currentAccount);
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
                                                G(fjVar3, m10, new t10() {
                                                    @Override
                                                    public final void a(Object obj, Object obj2, Object obj3, Object obj4) {
                                                        Boolean bool = (Boolean) obj;
                                                        Integer num = (Integer) obj2;
                                                        TLRPC.TL_textWithEntities tL_textWithEntities3 = (TLRPC.TL_textWithEntities) obj3;
                                                        String str2 = (String) obj4;
                                                        fj fjVar4 = fjVar3;
                                                        if (fjVar4.e1() != num.intValue()) {
                                                            a8.d("wtf, asked to translate " + fjVar4.e1() + " but got " + num + "!");
                                                        }
                                                        fjVar4.f24073k.translatedToLanguage = str2;
                                                        if (bool.booleanValue()) {
                                                            fjVar4.f24073k.translatedVoiceTranscription = tL_textWithEntities3;
                                                        } else {
                                                            fjVar4.f24073k.translatedText = tL_textWithEntities3;
                                                        }
                                                        fjVar4.f24073k.translatedPoll = null;
                                                        y00 y00Var = y00.this;
                                                        if (z11) {
                                                            y00Var.C(fjVar4);
                                                        }
                                                        tr messagesStorage = y00Var.getMessagesStorage();
                                                        TLRPC.Message message11 = fjVar4.f24073k;
                                                        long j3 = B0;
                                                        messagesStorage.X1(j3, message11);
                                                        ks.f(y00Var.currentAccount).k(ks.M1, fjVar4);
                                                        ArrayList arrayList3 = (ArrayList) y00Var.f28185n.S.f(j3);
                                                        if (arrayList3 != null) {
                                                            for (int i7 = 0; i7 < arrayList3.size(); i7++) {
                                                                fj fjVar5 = (fj) arrayList3.get(i7);
                                                                if (fjVar5 != null && fjVar5.e1() == fjVar4.e1()) {
                                                                    fjVar5.f24073k.translatedToLanguage = str2;
                                                                    if (bool.booleanValue()) {
                                                                        fjVar5.f24073k.translatedVoiceTranscription = tL_textWithEntities3;
                                                                    } else {
                                                                        fjVar5.f24073k.translatedText = tL_textWithEntities3;
                                                                    }
                                                                    fjVar5.f24073k.translatedPoll = null;
                                                                    if (fjVar5.g6(false)) {
                                                                        ks.f(y00Var.currentAccount).k(ks.f25276r, 0);
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
                                            C(fjVar3);
                                            return;
                                        } else {
                                            return;
                                        }
                                    }
                                }
                            }
                        }
                        fjVar3 = fjVar;
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
                            u00 u00Var = (u00) obj;
                            g0.r(u00Var.f27204a);
                            if (u00Var.h != -1) {
                                getConnectionsManager().cancelRequest(u00Var.h, true);
                                ArrayList arrayList2 = u00Var.f27205b;
                                int size2 = arrayList2.size();
                                int i10 = 0;
                                while (i10 < size2) {
                                    Object obj2 = arrayList2.get(i10);
                                    i10++;
                                    this.f28189x.remove((Integer) obj2);
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
                            u00 u00Var2 = (u00) obj3;
                            g0.r(u00Var2.f27204a);
                            if (u00Var2.h != -1) {
                                getConnectionsManager().cancelRequest(u00Var2.h, true);
                                ArrayList arrayList4 = u00Var2.f27205b;
                                int size4 = arrayList4.size();
                                int i12 = 0;
                                while (i12 < size4) {
                                    Object obj4 = arrayList4.get(i12);
                                    i12++;
                                    this.f28190y.remove((Integer) obj4);
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
                            s00 s00Var = (s00) obj5;
                            g0.r(s00Var.f26821a);
                            if (s00Var.h != -1) {
                                getConnectionsManager().cancelRequest(s00Var.h, true);
                                ArrayList arrayList6 = s00Var.f26822b;
                                int size6 = arrayList6.size();
                                int i14 = 0;
                                while (i14 < size6) {
                                    Object obj6 = arrayList6.get(i14);
                                    i14++;
                                    this.f28189x.remove((Integer) obj6);
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
                            t00 t00Var = (t00) obj7;
                            g0.r(t00Var.f27023a);
                            if (t00Var.f27027f != -1) {
                                getConnectionsManager().cancelRequest(t00Var.f27027f, true);
                                ArrayList arrayList8 = t00Var.f27024b;
                                int size8 = arrayList8.size();
                                int i16 = 0;
                                while (i16 < size8) {
                                    Object obj8 = arrayList8.get(i16);
                                    i16++;
                                    this.f28189x.remove((Integer) obj8);
                                }
                            }
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        mp.u1(this.currentAccount).h7.edit().remove("translating_dialog_languages2").remove("hidden_translation_at").apply();
        this.f28180a.clear();
        this.f28181b.clear();
        this.f28182c.clear();
        this.d.clear();
        this.f28183e.clear();
        this.f28184f.clear();
        this.h.clear();
        this.f28189x.clear();
        this.f28190y.clear();
    }

    public final void k(fj fjVar, di.p9 p9Var) {
        TLRPC.Message message = fjVar.f24073k;
        if (message != null && !TextUtils.isEmpty(message.message)) {
            if (!TextUtils.isEmpty(fjVar.f24073k.originalLanguage)) {
                p9Var.a(fjVar.f24073k.originalLanguage);
                return;
            }
            f3.s sVar = new f3.s(fjVar);
            HashSet hashSet = this.L;
            if (!hashSet.contains(sVar)) {
                hashSet.add(sVar);
                c6.d(fjVar.f24073k.message, new e00(this, fjVar, sVar, p9Var), new e00(this, fjVar, sVar, p9Var), false);
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
                c6.d(storyItem.caption, new l00(this, storyItem, obj), new l00(this, storyItem, obj), false);
            }
        }
    }

    public final String m(long j3) {
        String str = (String) this.d.get(Long.valueOf(j3));
        if (str == null && ((str = a31.N0()) == null || str.equals((String) this.f28183e.get(Long.valueOf(j3))))) {
            str = j();
        }
        if ("nb".equals(str)) {
            return "no";
        }
        return str;
    }

    public final void p(fj fjVar) {
        TLRPC.Message message = fjVar.f24073k;
        if (message != null) {
            long B0 = fj.B0(message);
            if (!v(B0)) {
                return;
            }
            TLRPC.Message message2 = fjVar.f24073k;
            message2.translatedToLanguage = null;
            message2.translatedText = null;
            message2.translatedVoiceTranscription = null;
            message2.translatedPoll = null;
            message2.summaryText = null;
            message2.translatedSummaryText = null;
            message2.translatedSummaryLanguage = null;
            getMessagesStorage().X1(B0, fjVar.f24073k);
            g0.g3(new d4(this, fjVar, B0, 8));
        }
    }

    public final boolean q(long j3) {
        TLRPC.Chat O0;
        if (!t(j3) || (O0 = getMessagesController().O0(Long.valueOf(-j3))) == null || !O0.autotranslation) {
            return false;
        }
        return true;
    }

    public final boolean r() {
        if (!getMessagesController().M2()) {
            return false;
        }
        if (this.f28186r == null) {
            this.f28186r = Boolean.valueOf(this.f28185n.h7.getBoolean("translate_chat_button", true));
        }
        return this.f28186r.booleanValue();
    }

    public final boolean s() {
        if (!getMessagesController().N2()) {
            return false;
        }
        if (this.f28187s == null) {
            this.f28187s = Boolean.valueOf(this.f28185n.h7.getBoolean("translate_button", mp.g1().getBoolean("translate_button", false)));
        }
        return this.f28187s.booleanValue();
    }

    public final boolean t(long j3) {
        if (this.f28181b.contains(Long.valueOf(j3)) && v(j3) && !n5.C(j3) && getUserConfig().e() != j3) {
            return true;
        }
        return false;
    }

    public final boolean u() {
        if (r() && i10.i(this.currentAccount).q()) {
            return true;
        }
        return false;
    }

    public final boolean v(long j3) {
        if (!r()) {
            return false;
        }
        TLRPC.Chat O0 = getMessagesController().O0(Long.valueOf(-j3));
        if (!i10.i(this.currentAccount).q()) {
            if (O0 == null || !O0.autotranslation) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final boolean w(String str) {
        if (getUserConfig().q()) {
            return ry0.d0().contains(str);
        }
        try {
            return TextUtils.equals(gd.E0().B.f23447f, str);
        } catch (Exception unused) {
            return false;
        }
    }

    public final boolean z(long j3) {
        if (this.h.contains(Long.valueOf(j3))) {
            return true;
        }
        TLRPC.ChatFull P0 = getMessagesController().P0(-j3);
        if (P0 != null) {
            return P0.translations_disabled;
        }
        TLRPC.UserFull d2 = getMessagesController().d2(j3);
        if (d2 != null) {
            return d2.translations_disabled;
        }
        return false;
    }
}
