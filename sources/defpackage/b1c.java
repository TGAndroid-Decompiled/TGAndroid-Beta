package defpackage;

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
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_stories;
public final class b1c extends pf0 {
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
    public final LongSparseArray a;
    public final HashSet b;
    public final HashMap c;
    public final HashMap d;
    public final HashMap e;
    public final HashMap f;
    public final HashSet h;
    public final na7 n;
    public Boolean r;
    public Boolean s;
    public final ArrayList w;
    public final HashSet x;
    public final HashSet y;

    public b1c(na7 na7Var) {
        super(na7Var.currentAccount);
        this.a = new LongSparseArray();
        this.b = new HashSet();
        this.c = new HashMap();
        this.d = new HashMap();
        this.e = new HashMap();
        this.f = new HashMap();
        this.h = new HashSet();
        this.w = new ArrayList();
        this.x = new HashSet();
        this.y = new HashSet();
        this.E = new HashMap();
        this.F = new HashMap();
        this.G = new HashSet();
        this.H = new HashMap();
        this.I = new HashMap();
        this.J = new HashSet();
        this.K = new HashSet();
        this.L = new HashSet();
        this.M = new HashSet();
        this.n = na7Var;
        gl.e3(new cib(this, (byte) 17), 150L);
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

    public static String i() {
        String str = k96.D0().B.f;
        if (str != null) {
            return str.split("_")[0];
        }
        return str;
    }

    public static ArrayList m() {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (true) {
            List list = O;
            if (i >= list.size()) {
                break;
            }
            ?? obj = new Object();
            String str = (String) list.get(i);
            obj.a = str;
            if ("no".equals(str)) {
                obj.a = "nb";
            }
            obj.b = rzb.E0(rzb.J0(obj.a, null, null));
            obj.c = rzb.E0(rzb.R0(obj.a, true));
            if (obj.b != null) {
                StringBuilder sb = new StringBuilder();
                sb.append(obj.b);
                sb.append(" ");
                String str2 = obj.c;
                if (str2 == null) {
                    str2 = "";
                }
                sb.append(str2);
                obj.d = sb.toString().toLowerCase();
                arrayList.add(obj);
            }
            i++;
        }
        if (Build.VERSION.SDK_INT >= 24) {
            final Collator collator = Collator.getInstance(Locale.getDefault());
            Collections.sort(arrayList, new Comparator() {
                @Override
                public final int compare(Object obj2, Object obj3) {
                    int compare;
                    compare = collator.compare(((u0c) obj2).b, ((u0c) obj3).b);
                    return compare;
                }
            });
            return arrayList;
        }
        Collections.sort(arrayList, Comparator$CC.comparing(new xz((byte) 16)));
        return arrayList;
    }

    public static ArrayList n(String str) {
        ArrayList arrayList = new ArrayList();
        LinkedHashSet linkedHashSet = P;
        if (linkedHashSet == null) {
            LinkedHashSet linkedHashSet2 = new LinkedHashSet();
            try {
                linkedHashSet2.add(k96.D0().B.f);
            } catch (Exception e) {
                fa4.g(e, true);
            }
            try {
                linkedHashSet2.add(Resources.getSystem().getConfiguration().locale.getLanguage());
            } catch (Exception e2) {
                fa4.g(e2, true);
            }
            try {
                linkedHashSet2.addAll(qa9.b0());
            } catch (Exception e3) {
                fa4.g(e3, true);
            }
            try {
                InputMethodManager inputMethodManager = (InputMethodManager) a.b.getSystemService("input_method");
                for (InputMethodInfo inputMethodInfo : inputMethodManager.getEnabledInputMethodList()) {
                    for (InputMethodSubtype inputMethodSubtype : inputMethodManager.getEnabledInputMethodSubtypeList(inputMethodInfo, true)) {
                        if ("keyboard".equals(inputMethodSubtype.getMode())) {
                            String locale = inputMethodSubtype.getLocale();
                            if (locale != null && locale.contains("_")) {
                                locale = locale.split("_")[0];
                            }
                            if (rzb.J0(locale, null, null) != null) {
                                linkedHashSet2.add(locale);
                            }
                        }
                    }
                }
            } catch (Exception e4) {
                fa4.g(e4, true);
            }
            P = linkedHashSet2;
            linkedHashSet = linkedHashSet2;
        }
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            if (!TextUtils.equals(str2, str) && (!"no".equals(str) || !"nb".equals(str2))) {
                if (!"nb".equals(str) || !"no".equals(str2)) {
                    ?? obj = new Object();
                    obj.a = str2;
                    if ("no".equals(str2)) {
                        obj.a = "nb";
                    }
                    obj.b = rzb.E0(rzb.J0(obj.a, null, null));
                    obj.c = rzb.E0(rzb.R0(obj.a, true));
                    if (obj.b != null) {
                        obj.d = (obj.b + " " + obj.c).toLowerCase();
                        arrayList.add(obj);
                    }
                }
            }
        }
        return arrayList;
    }

    public static boolean w(k27 k27Var) {
        TLRPC.Message message;
        if (k27Var != null && (message = k27Var.k) != null && message.summary_from_language != null && !k27Var.O3() && !k27Var.G0 && !k27Var.q4()) {
            int i = k27Var.D;
            if ((i == 0 || i == 3 || i == 1 || i == 9 || i == 14 || i == 17) && !TextUtils.isEmpty(k27Var.k.message) && k27Var.k.message.length() > 100) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static boolean x(k27 k27Var) {
        if (k27Var != null && k27Var.k != null && !k27Var.O3() && !k27Var.G0 && !k27Var.q4() && !(k27.m1(k27Var) instanceof TLRPC.TL_messageMediaWidget)) {
            int i = k27Var.D;
            if (i == 0 || i == 3 || i == 1 || i == 2 || i == 5 || i == 9 || i == 14 || i == 17 || i == 36) {
                if (TextUtils.isEmpty(k27Var.k.message) && !(k27.m1(k27Var) instanceof TLRPC.TL_messageMediaPoll)) {
                    TLRPC.Message message = k27Var.k;
                    if (message.rich_message == null && (!message.voiceTranscriptionOpen || TextUtils.isEmpty(message.voiceTranscription) || !k27Var.k.voiceTranscriptionFinal)) {
                        return false;
                    }
                }
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean A(long j) {
        if (u(j)) {
            if (((Boolean) this.a.get(j, Boolean.valueOf(p(j)))).booleanValue()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void B(k27 k27Var) {
        if (k27Var == null) {
            return;
        }
        Long valueOf = Long.valueOf(k27.B0(k27Var.k));
        HashMap hashMap = this.f;
        HashMap hashMap2 = (HashMap) hashMap.get(valueOf);
        if (hashMap2 == null) {
            Long valueOf2 = Long.valueOf(k27.B0(k27Var.k));
            HashMap hashMap3 = new HashMap();
            hashMap.put(valueOf2, hashMap3);
            hashMap2 = hashMap3;
        }
        hashMap2.put(Integer.valueOf(k27Var.e1()), k27Var);
    }

    public final void E(k27 k27Var, String str, r0c r0cVar) {
        b1c b1cVar;
        Throwable th;
        v0c v0cVar;
        int i;
        if (k27Var != null && k27Var.e1() >= 0) {
            long B0 = k27.B0(k27Var.k);
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
                            } catch (Throwable th2) {
                                th = th2;
                                b1cVar = this;
                                throw th;
                            }
                        }
                        if (arrayList.isEmpty()) {
                            v0cVar = new v0c();
                            arrayList.add(v0cVar);
                        } else {
                            v0cVar = (v0c) arrayList.get(arrayList.size() - 1);
                        }
                        if (v0cVar.b.contains(Integer.valueOf(k27Var.e1()))) {
                            return;
                        }
                        TLRPC.MessageMedia m1 = k27.m1(k27Var);
                        if (!(m1 instanceof TLRPC.TL_messageMediaPoll)) {
                            return;
                        }
                        y0c a = y0c.a((TLRPC.TL_messageMediaPoll) m1);
                        y0c y0cVar = k27Var.k.translatedPoll;
                        try {
                            TLRPC.TL_textWithEntities tL_textWithEntities = a.a;
                            if (tL_textWithEntities != null) {
                                i = tL_textWithEntities.text.length();
                            } else {
                                i = 0;
                            }
                            for (int i2 = 0; i2 < a.b.size(); i2++) {
                                i += ((TLRPC.PollAnswer) a.b.get(i2)).text.text.length();
                            }
                            TLRPC.TL_textWithEntities tL_textWithEntities2 = a.c;
                            if (tL_textWithEntities2 != null) {
                                i += tL_textWithEntities2.text.length();
                            }
                            if (v0cVar.g + i >= 25000 || v0cVar.b.size() + 1 >= 20) {
                                gl.r(v0cVar.a);
                                gl.d3(v0cVar.a);
                                v0cVar = new v0c();
                                arrayList.add(v0cVar);
                            }
                            d2b d2bVar = v0cVar.a;
                            if (d2bVar != null) {
                                gl.r(d2bVar);
                            }
                            this.x.add(Integer.valueOf(k27Var.e1()));
                            v0cVar.b.add(Integer.valueOf(k27Var.e1()));
                            fa4.b("pending translation +" + k27Var.e1() + " poll message");
                            v0cVar.c.add(new Pair(a, y0cVar));
                            v0cVar.d.add(r0cVar);
                            v0cVar.e = str;
                            v0cVar.g = v0cVar.g + i;
                            v0c v0cVar2 = v0cVar;
                            d2b d2bVar2 = new d2b(this, B0, v0cVar2, (byte) 9);
                            v0cVar2.a = d2bVar2;
                            gl.e3(d2bVar2, v0cVar2.f);
                            v0cVar2.f /= 2;
                        } catch (Throwable th3) {
                            b1cVar = this;
                            th = th3;
                            throw th;
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        th = th;
                        throw th;
                    }
                } catch (Throwable th5) {
                    th = th5;
                    b1cVar = this;
                    th = th;
                    throw th;
                }
            }
        }
    }

    public final void F(k27 k27Var, String str, p8c p8cVar) {
        int i;
        Long valueOf = Long.valueOf(k27.B0(k27Var.k));
        Integer valueOf2 = Integer.valueOf(k27Var.e1());
        if (str != null) {
            i = 1;
        } else {
            i = 0;
        }
        int hash = Objects.hash(valueOf, valueOf2, Integer.valueOf(i));
        Integer valueOf3 = Integer.valueOf(hash);
        HashSet hashSet = this.G;
        if (hashSet.contains(valueOf3)) {
            return;
        }
        hashSet.add(Integer.valueOf(hash));
        TLRPC.TL_messages_summarizeText tL_messages_summarizeText = new TLRPC.TL_messages_summarizeText();
        tL_messages_summarizeText.peer = na7.q1(this.currentAccount).h1(k27.B0(k27Var.k));
        tL_messages_summarizeText.id = k27Var.e1();
        if (str != null) {
            tL_messages_summarizeText.flags |= 1;
            tL_messages_summarizeText.to_lang = D(str);
        }
        ConnectionsManager.getInstance(this.currentAccount).sendRequestTyped(tL_messages_summarizeText, new hc((byte) 0), new wm1(this, hash, p8cVar, (byte) 4));
    }

    public final void G(k27 k27Var, String str, t0c t0cVar) {
        boolean z;
        HashMap hashMap;
        HashSet hashSet;
        x0c x0cVar;
        String str2;
        if (k27Var != null && k27Var.k != null && k27Var.e1() >= 0) {
            TLRPC.Message message = k27Var.k;
            int i = 0;
            if (message.voiceTranscription != null && message.voiceTranscriptionFinal && message.voiceTranscriptionOpen) {
                z = true;
            } else {
                z = false;
            }
            long B0 = k27.B0(message);
            if (z) {
                hashMap = this.F;
                hashSet = this.y;
            } else {
                hashMap = this.E;
                hashSet = this.x;
            }
            HashMap hashMap2 = hashMap;
            HashSet hashSet2 = hashSet;
            TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
            TLRPC.Message message2 = k27Var.k;
            if (z) {
                String str3 = message2.voiceTranscription;
                tL_textWithEntities.text = str3;
                if (TextUtils.isEmpty(str3)) {
                    return;
                }
            } else {
                tL_textWithEntities.text = message2.message;
                tL_textWithEntities.entities = message2.entities;
            }
            synchronized (this) {
                ArrayList arrayList = (ArrayList) hashMap2.get(Long.valueOf(B0));
                if (arrayList == null) {
                    Long valueOf = Long.valueOf(B0);
                    ArrayList arrayList2 = new ArrayList();
                    hashMap2.put(valueOf, arrayList2);
                    arrayList = arrayList2;
                }
                if (arrayList.isEmpty()) {
                    x0cVar = new x0c();
                    arrayList.add(x0cVar);
                } else {
                    x0cVar = (x0c) arrayList.get(arrayList.size() - 1);
                }
                if (x0cVar.b.contains(Integer.valueOf(k27Var.e1()))) {
                    return;
                }
                TLRPC.Message message3 = k27Var.k;
                if (z) {
                    String str4 = message3.voiceTranscription;
                    if (str4 != null) {
                        i = str4.length();
                    }
                } else if (message3 != null && (str2 = message3.message) != null) {
                    i = str2.length();
                } else {
                    CharSequence charSequence = k27Var.z;
                    if (charSequence != null) {
                        i = charSequence.length();
                    } else {
                        CharSequence charSequence2 = k27Var.v;
                        if (charSequence2 != null) {
                            i = charSequence2.length();
                        }
                    }
                }
                if (x0cVar.g + i >= 25000 || x0cVar.b.size() + 1 >= 20) {
                    gl.r(x0cVar.a);
                    gl.d3(x0cVar.a);
                    x0cVar = new x0c();
                    arrayList.add(x0cVar);
                }
                x0c x0cVar2 = x0cVar;
                ms0 ms0Var = x0cVar2.a;
                if (ms0Var != null) {
                    gl.r(ms0Var);
                }
                hashSet2.add(Integer.valueOf(k27Var.e1()));
                x0cVar2.b.add(Integer.valueOf(k27Var.e1()));
                fa4.b("pending translation +" + k27Var.e1() + " message");
                x0cVar2.c.add(tL_textWithEntities);
                x0cVar2.d.add(t0cVar);
                x0cVar2.e = str;
                x0cVar2.g += i;
                ms0 ms0Var2 = new ms0(this, hashMap2, B0, x0cVar2, z, hashSet2);
                x0cVar2.a = ms0Var2;
                gl.e3(ms0Var2, x0cVar2.f);
                x0cVar2.f /= 2;
            }
        }
    }

    public final void H() {
        StringBuilder sb = new StringBuilder();
        boolean z = true;
        int i = 0;
        while (true) {
            LongSparseArray longSparseArray = this.a;
            if (i >= longSparseArray.size()) {
                break;
            }
            try {
                long keyAt = longSparseArray.keyAt(i);
                if (!z) {
                    sb.append(";");
                } else {
                    z = false;
                }
                String str = (String) this.e.get(Long.valueOf(keyAt));
                String str2 = "null";
                if (str == null) {
                    str = "null";
                }
                String l = l(keyAt);
                if (l != null) {
                    str2 = l;
                }
                sb.append(keyAt);
                sb.append("=");
                sb.append(str);
                sb.append(">");
                sb.append(str2);
                if (!((Boolean) longSparseArray.valueAt(i)).booleanValue()) {
                    sb.append("!");
                }
            } catch (Exception unused) {
            }
            i++;
        }
        HashSet hashSet = new HashSet();
        Iterator it = this.h.iterator();
        while (it.hasNext()) {
            try {
                hashSet.add("" + it.next());
            } catch (Exception e) {
                fa4.g(e, true);
            }
        }
        na7.q1(this.currentAccount).X3.edit().putString("translating_dialog_languages2", sb.toString()).putStringSet("hidden_translation_at", hashSet).apply();
    }

    public final void I(long j, String str) {
        b1c b1cVar;
        long j2;
        String str2;
        Boolean bool;
        if (TextUtils.equals(l(j), str)) {
            return;
        }
        if (A(j)) {
            b1cVar = this;
            j2 = j;
            str2 = str;
            gl.e3(new de2(b1cVar, j2, str2, (byte) 9), 150L);
        } else {
            b1cVar = this;
            j2 = j;
            str2 = str;
            synchronized (b1cVar) {
                b1cVar.d.put(Long.valueOf(j2), str2);
            }
        }
        b1cVar.b(j2);
        synchronized (b1cVar) {
            LongSparseArray longSparseArray = b1cVar.a;
            bool = Boolean.FALSE;
            longSparseArray.put(j2, bool);
        }
        kk7.f(b1cVar.currentAccount).k(kk7.O1, Long.valueOf(j2), bool);
        rzb.O0(str2);
    }

    public final void J(long j, boolean z, boolean z2) {
        TLRPC.TL_messages_togglePeerTranslations tL_messages_togglePeerTranslations = new TLRPC.TL_messages_togglePeerTranslations();
        tL_messages_togglePeerTranslations.peer = getMessagesController().h1(j);
        tL_messages_togglePeerTranslations.disabled = z;
        getConnectionsManager().sendRequest(tL_messages_togglePeerTranslations, null);
        TLRPC.ChatFull L0 = getMessagesController().L0(-j);
        if (L0 != null) {
            L0.translations_disabled = z;
            getMessagesStorage().K1(L0, true);
        }
        TLRPC.UserFull W1 = getMessagesController().W1(j);
        if (W1 != null) {
            W1.translations_disabled = z;
            getMessagesStorage().g2(W1, true);
        }
        synchronized (this) {
            HashSet hashSet = this.h;
            if (z) {
                hashSet.add(Long.valueOf(j));
                this.a.remove(j);
            } else {
                hashSet.remove(Long.valueOf(j));
            }
        }
        H();
        if (!z2) {
            kk7.f(this.currentAccount).k(kk7.O1, Long.valueOf(j), Boolean.valueOf(A(j)));
        }
    }

    public final boolean K(long j, boolean z) {
        boolean A = A(j);
        int i = kk7.O1;
        boolean z2 = true;
        LongSparseArray longSparseArray = this.a;
        if (z) {
            if (!A) {
                Boolean bool = Boolean.TRUE;
                longSparseArray.put(j, bool);
                kk7.f(this.currentAccount).k(i, Long.valueOf(j), bool);
            }
            z2 = false;
        } else {
            if (A) {
                Boolean bool2 = Boolean.FALSE;
                longSparseArray.put(j, bool2);
                kk7.f(this.currentAccount).k(i, Long.valueOf(j), bool2);
                b(j);
            }
            z2 = false;
        }
        H();
        return z2;
    }

    public final void L(k27 k27Var, y68 y68Var) {
        if (k27Var != null && k27Var.k != null) {
            m11 m11Var = new m11(k27Var);
            String G0 = rzb.G0();
            TLRPC.Message message = k27Var.k;
            if (message.translatedText != null && TextUtils.equals(message.translatedToLanguage, G0)) {
                y68Var.run();
                return;
            }
            HashSet hashSet = this.M;
            if (hashSet.contains(m11Var)) {
                y68Var.run();
                return;
            }
            hashSet.add(m11Var);
            TLRPC.TL_messages_translateText tL_messages_translateText = new TLRPC.TL_messages_translateText();
            tL_messages_translateText.flags |= 2;
            TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
            TLRPC.Message message2 = k27Var.k;
            tL_textWithEntities.text = message2.message;
            ArrayList<TLRPC.MessageEntity> arrayList = message2.entities;
            tL_textWithEntities.entities = arrayList;
            if (arrayList == null) {
                tL_textWithEntities.entities = new ArrayList<>();
            }
            tL_messages_translateText.text.add(tL_textWithEntities);
            tL_messages_translateText.to_lang = D(G0);
            getConnectionsManager().sendRequest(tL_messages_translateText, new p77(this, k27Var, G0, m11Var, y68Var, System.currentTimeMillis(), tL_textWithEntities));
        }
    }

    public final void M(long j) {
        boolean z;
        if (u(j) && s(j)) {
            boolean contains = this.h.contains(Long.valueOf(j));
            TLRPC.ChatFull L0 = getMessagesController().L0(-j);
            if (L0 != null) {
                z = L0.translations_disabled;
            } else {
                TLRPC.UserFull W1 = getMessagesController().W1(j);
                if (W1 != null) {
                    z = W1.translations_disabled;
                } else {
                    z = false;
                }
            }
            synchronized (this) {
                HashSet hashSet = this.h;
                if (z) {
                    hashSet.add(Long.valueOf(j));
                    this.a.remove(j);
                } else {
                    hashSet.remove(Long.valueOf(j));
                }
            }
            if (contains != z) {
                H();
                kk7.f(this.currentAccount).k(kk7.O1, Long.valueOf(j), Boolean.valueOf(A(j)));
            }
        }
    }

    public final boolean a(defpackage.k27 r3, java.lang.String r4) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.b1c.a(k27, java.lang.String):boolean");
    }

    public final void b(long j) {
        synchronized (this) {
            ArrayList arrayList = (ArrayList) this.E.get(Long.valueOf(j));
            if (arrayList != null) {
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    x0c x0cVar = (x0c) obj;
                    gl.r(x0cVar.a);
                    if (x0cVar.h != -1) {
                        getConnectionsManager().cancelRequest(x0cVar.h, true);
                        ArrayList arrayList2 = x0cVar.b;
                        int size2 = arrayList2.size();
                        int i2 = 0;
                        while (i2 < size2) {
                            Object obj2 = arrayList2.get(i2);
                            i2++;
                            this.x.remove((Integer) obj2);
                        }
                    }
                }
                this.E.remove(Long.valueOf(j));
            }
            ArrayList arrayList3 = (ArrayList) this.F.get(Long.valueOf(j));
            if (arrayList3 != null) {
                int size3 = arrayList3.size();
                int i3 = 0;
                while (i3 < size3) {
                    Object obj3 = arrayList3.get(i3);
                    i3++;
                    x0c x0cVar2 = (x0c) obj3;
                    gl.r(x0cVar2.a);
                    if (x0cVar2.h != -1) {
                        getConnectionsManager().cancelRequest(x0cVar2.h, true);
                        ArrayList arrayList4 = x0cVar2.b;
                        int size4 = arrayList4.size();
                        int i4 = 0;
                        while (i4 < size4) {
                            Object obj4 = arrayList4.get(i4);
                            i4++;
                            this.y.remove((Integer) obj4);
                        }
                    }
                }
                this.F.remove(Long.valueOf(j));
            }
            ArrayList arrayList5 = (ArrayList) this.H.get(Long.valueOf(j));
            if (arrayList5 != null) {
                int size5 = arrayList5.size();
                int i5 = 0;
                while (i5 < size5) {
                    Object obj5 = arrayList5.get(i5);
                    i5++;
                    v0c v0cVar = (v0c) obj5;
                    gl.r(v0cVar.a);
                    if (v0cVar.h != -1) {
                        getConnectionsManager().cancelRequest(v0cVar.h, true);
                        ArrayList arrayList6 = v0cVar.b;
                        int size6 = arrayList6.size();
                        int i6 = 0;
                        while (i6 < size6) {
                            Object obj6 = arrayList6.get(i6);
                            i6++;
                            this.x.remove((Integer) obj6);
                        }
                    }
                }
                this.H.remove(Long.valueOf(j));
            }
            ArrayList arrayList7 = (ArrayList) this.I.get(Long.valueOf(j));
            if (arrayList7 != null) {
                int size7 = arrayList7.size();
                int i7 = 0;
                while (i7 < size7) {
                    Object obj7 = arrayList7.get(i7);
                    i7++;
                    w0c w0cVar = (w0c) obj7;
                    gl.r(w0cVar.a);
                    if (w0cVar.f != -1) {
                        getConnectionsManager().cancelRequest(w0cVar.f, true);
                        ArrayList arrayList8 = w0cVar.b;
                        int size8 = arrayList8.size();
                        int i8 = 0;
                        while (i8 < size8) {
                            Object obj8 = arrayList8.get(i8);
                            i8++;
                            this.x.remove((Integer) obj8);
                        }
                    }
                }
                this.I.remove(Long.valueOf(j));
            }
        }
    }

    public final void c(long j) {
        if (u(j)) {
            d(j);
        }
    }

    public final void d(long j) {
        if (!((Boolean) this.a.get(j, Boolean.valueOf(p(j)))).booleanValue()) {
            return;
        }
        getMessagesStorage().a.c(new k0c(this, j, (byte) 1));
    }

    public final void e(k27 k27Var) {
        TLRPC.Message message;
        boolean z;
        HashSet hashSet;
        int size;
        int i;
        float f;
        String str;
        String str2;
        if (k27Var != null && (message = k27Var.k) != null) {
            long B0 = k27.B0(message);
            Long valueOf = Long.valueOf(B0);
            HashMap hashMap = this.c;
            a1c a1cVar = (a1c) hashMap.get(valueOf);
            if (a1cVar == null) {
                Long valueOf2 = Long.valueOf(B0);
                ?? obj = new Object();
                obj.a = new HashSet();
                obj.b = new HashSet();
                obj.c = new HashSet();
                hashMap.put(valueOf2, obj);
                a1cVar = obj;
            }
            HashSet hashSet2 = a1cVar.c;
            HashSet hashSet3 = a1cVar.a;
            HashSet hashSet4 = a1cVar.b;
            boolean z2 = true;
            if (x(k27Var) && ((str2 = k27Var.k.originalLanguage) == null || "und".equals(str2))) {
                z = true;
            } else {
                z = false;
            }
            if (!x(k27Var) || (str = k27Var.k.originalLanguage) == null || "und".equals(str) || v(k27Var.k.originalLanguage)) {
                z2 = false;
            }
            if (z) {
                hashSet4.add(Integer.valueOf(k27Var.e1()));
            } else {
                if (z2) {
                    hashSet = hashSet3;
                } else {
                    hashSet = hashSet2;
                }
                hashSet.add(Integer.valueOf(k27Var.e1()));
            }
            if (!z) {
                this.e.put(Long.valueOf(B0), k27Var.k.originalLanguage);
            }
            int size2 = hashSet3.size();
            int size3 = hashSet4.size();
            int size4 = size2 + size3 + hashSet2.size();
            boolean p = p(B0);
            if (p) {
                i = 2;
            } else {
                i = 6;
            }
            if (size4 >= i) {
                if (p) {
                    if (size2 < 2.0f) {
                        return;
                    }
                } else if (size2 / (size2 + size) < 0.6f) {
                    return;
                }
                float f2 = size3 / size4;
                if (p) {
                    f = 0.8f;
                } else {
                    f = 0.65f;
                }
                if (f2 < f) {
                    this.b.add(Long.valueOf(B0));
                    hashMap.remove(Long.valueOf(B0));
                    gl.e3(new k0c(this, B0, (byte) 0), 450L);
                }
            }
        }
    }

    public final void f() {
        synchronized (this) {
            this.c.clear();
            ArrayList arrayList = new ArrayList();
            Iterator it = this.b.iterator();
            while (it.hasNext()) {
                Long l = (Long) it.next();
                long longValue = l.longValue();
                String str = (String) this.e.get(l);
                if (str != null && v(str)) {
                    b(longValue);
                    this.a.remove(longValue);
                    arrayList.add(l);
                }
            }
            this.b.clear();
            H();
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                Long l2 = (Long) obj;
                l2.getClass();
                kk7.f(this.currentAccount).k(kk7.O1, l2, Boolean.FALSE);
            }
        }
    }

    public final void g(k27 k27Var, boolean z, final boolean z2) {
        TLRPC.Message message;
        final k27 k27Var2;
        TLRPC.TL_textWithEntities tL_textWithEntities;
        y0c y0cVar;
        w0c w0cVar;
        TLRPC.TL_textWithEntities tL_textWithEntities2;
        y0c y0cVar2;
        k27 k27Var3;
        if (k27Var != null && (message = k27Var.k) != null) {
            final long B0 = k27.B0(message);
            k27 k27Var4 = null;
            r7 = null;
            r7 = null;
            String str = null;
            if (z) {
                TLRPC.Message message2 = k27Var.k;
                if (message2.summarizedOpen && message2.summaryText == null && !A(k27.B0(message2))) {
                    p0c p0cVar = new p0c(this, k27Var, B0, (byte) 0);
                    B0 = B0;
                    F(k27Var, null, p0cVar);
                }
            }
            if (u(B0)) {
                if (!z2 && (k27Var3 = k27Var.C) != null) {
                    g(k27Var3, z, true);
                }
                if (x(k27Var)) {
                    if (!A(B0)) {
                        TLRPC.Message message3 = k27Var.k;
                        if (message3 != null) {
                            if (!TextUtils.isEmpty(message3.message)) {
                                str = k27Var.k.message;
                            } else if (k27Var.D == 36 && !TextUtils.isEmpty(k27Var.v)) {
                                str = k27Var.v.toString();
                            }
                        }
                        if (x(k27Var) && k27Var.k != null && !TextUtils.isEmpty(str)) {
                            TLRPC.Message message4 = k27Var.k;
                            if (message4.originalLanguage != null) {
                                e(k27Var);
                                return;
                            }
                            long B02 = k27.B0(message4);
                            int hash = Objects.hash(Long.valueOf(k27.B0(k27Var.k)), Integer.valueOf(k27Var.e1()));
                            if (!s(B02) && !this.w.contains(Integer.valueOf(hash))) {
                                this.w.add(Integer.valueOf(hash));
                                Utilities.d.c(new i0c(this, str, k27Var, B02, hash, (byte) 0));
                            }
                        }
                    } else if (!y(B0)) {
                        String l = l(B0);
                        if (!z2 && k27Var.D != 36) {
                            TLRPC.Message message5 = k27Var.k;
                            if (message5.voiceTranscriptionOpen && message5.voiceTranscriptionFinal) {
                                tL_textWithEntities2 = message5.translatedVoiceTranscription;
                            } else {
                                tL_textWithEntities2 = message5.translatedText;
                            }
                            if ((tL_textWithEntities2 == null && message5.translatedPoll == null) || (((y0cVar2 = message5.translatedPoll) != null && !y0c.b(k27Var, y0cVar2)) || !l.equals(k27Var.k.translatedToLanguage))) {
                                int e1 = k27Var.e1();
                                HashMap hashMap = (HashMap) this.f.get(Long.valueOf(B0));
                                if (hashMap != null) {
                                    k27Var4 = (k27) hashMap.get(Integer.valueOf(e1));
                                }
                                if (k27Var4 != null) {
                                    TLRPC.Message message6 = k27Var.k;
                                    TLRPC.Message message7 = k27Var4.k;
                                    message6.translatedToLanguage = message7.translatedToLanguage;
                                    message6.translatedText = message7.translatedText;
                                    message6.translatedPoll = message7.translatedPoll;
                                    k27Var2 = k27Var4;
                                    if (!z && A(B0)) {
                                        int i = k27Var2.D;
                                        TLRPC.Message message8 = k27Var2.k;
                                        if (i == 36) {
                                            if (message8.translatedRichMessage == null || !l.equals(message8.translatedToLanguage)) {
                                                kk7.f(this.currentAccount).k(kk7.M1, k27Var2);
                                                k8c k8cVar = new k8c(this) {
                                                    public final b1c b;

                                                    {
                                                        this.b = this;
                                                    }

                                                    @Override
                                                    public final void a(Object obj, Object obj2, Object obj3) {
                                                        byte b = r6;
                                                        long j = B0;
                                                        boolean z3 = z2;
                                                        k27 k27Var5 = k27Var2;
                                                        b1c b1cVar = this.b;
                                                        switch (b) {
                                                            case 0:
                                                                Integer num = (Integer) obj;
                                                                TL_iv.RichMessage richMessage = (TL_iv.RichMessage) obj2;
                                                                String str2 = (String) obj3;
                                                                if (k27Var5.e1() != num.intValue()) {
                                                                    fa4.d("wtf, asked to translate " + k27Var5.e1() + " rich message but got " + num + "!");
                                                                }
                                                                TLRPC.Message message9 = k27Var5.k;
                                                                message9.translatedToLanguage = str2;
                                                                message9.translatedText = null;
                                                                message9.translatedVoiceTranscription = null;
                                                                message9.translatedPoll = null;
                                                                message9.translatedRichMessage = richMessage;
                                                                if (z3) {
                                                                    b1cVar.B(k27Var5);
                                                                }
                                                                b1cVar.getMessagesStorage().U1(j, k27Var5.k);
                                                                kk7.f(b1cVar.currentAccount).k(128, k27Var5);
                                                                ArrayList arrayList = (ArrayList) b1cVar.n.S.f(j);
                                                                if (arrayList != null) {
                                                                    for (int i2 = 0; i2 < arrayList.size(); i2++) {
                                                                        k27 k27Var6 = (k27) arrayList.get(i2);
                                                                        if (k27Var6 != null && k27Var6.e1() == k27Var5.e1()) {
                                                                            TLRPC.Message message10 = k27Var6.k;
                                                                            message10.translatedToLanguage = str2;
                                                                            message10.translatedRichMessage = richMessage;
                                                                            if (k27Var6.f6(false)) {
                                                                                kk7.f(b1cVar.currentAccount).k(2, 0);
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
                                                                y0c y0cVar3 = (y0c) obj2;
                                                                String str3 = (String) obj3;
                                                                if (k27Var5.e1() != num2.intValue()) {
                                                                    fa4.d("wtf, asked to translate " + k27Var5.e1() + " poll but got " + num2 + "!");
                                                                }
                                                                TLRPC.Message message11 = k27Var5.k;
                                                                message11.translatedToLanguage = str3;
                                                                message11.translatedText = null;
                                                                message11.translatedVoiceTranscription = null;
                                                                message11.translatedPoll = y0cVar3;
                                                                if (z3) {
                                                                    b1cVar.B(k27Var5);
                                                                }
                                                                b1cVar.getMessagesStorage().U1(j, k27Var5.k);
                                                                kk7.f(b1cVar.currentAccount).k(128, k27Var5);
                                                                ArrayList arrayList2 = (ArrayList) b1cVar.n.S.f(j);
                                                                if (arrayList2 != null) {
                                                                    for (int i3 = 0; i3 < arrayList2.size(); i3++) {
                                                                        k27 k27Var7 = (k27) arrayList2.get(i3);
                                                                        if (k27Var7 != null && k27Var7.e1() == k27Var5.e1()) {
                                                                            TLRPC.Message message12 = k27Var7.k;
                                                                            message12.translatedToLanguage = str3;
                                                                            message12.translatedText = null;
                                                                            message12.translatedVoiceTranscription = null;
                                                                            message12.translatedPoll = y0cVar3;
                                                                            if (k27Var7.f6(false)) {
                                                                                kk7.f(b1cVar.currentAccount).k(2, 0);
                                                                                return;
                                                                            }
                                                                            return;
                                                                        }
                                                                    }
                                                                    return;
                                                                }
                                                                return;
                                                        }
                                                    }
                                                };
                                                if (k27Var2.k != null && k27Var2.e1() >= 0) {
                                                    TLRPC.Message message9 = k27Var2.k;
                                                    if (message9.rich_message != null) {
                                                        long B03 = k27.B0(message9);
                                                        synchronized (this) {
                                                            ArrayList arrayList = (ArrayList) this.I.get(Long.valueOf(B03));
                                                            if (arrayList == null) {
                                                                HashMap hashMap2 = this.I;
                                                                Long valueOf = Long.valueOf(B03);
                                                                ArrayList arrayList2 = new ArrayList();
                                                                hashMap2.put(valueOf, arrayList2);
                                                                arrayList = arrayList2;
                                                            }
                                                            if (arrayList.isEmpty()) {
                                                                w0cVar = new w0c();
                                                                arrayList.add(w0cVar);
                                                            } else {
                                                                w0cVar = (w0c) arrayList.get(arrayList.size() - 1);
                                                            }
                                                            if (w0cVar.b.contains(Integer.valueOf(k27Var2.e1()))) {
                                                                return;
                                                            }
                                                            if (w0cVar.b.size() + 1 >= 20) {
                                                                gl.r(w0cVar.a);
                                                                gl.d3(w0cVar.a);
                                                                w0cVar = new w0c();
                                                                arrayList.add(w0cVar);
                                                            }
                                                            d2b d2bVar = w0cVar.a;
                                                            if (d2bVar != null) {
                                                                gl.r(d2bVar);
                                                            }
                                                            this.x.add(Integer.valueOf(k27Var2.e1()));
                                                            w0cVar.b.add(Integer.valueOf(k27Var2.e1()));
                                                            fa4.b("pending translation +" + k27Var2.e1() + " rich message");
                                                            w0cVar.c.add(k8cVar);
                                                            w0cVar.d = l;
                                                            w0c w0cVar2 = w0cVar;
                                                            d2b d2bVar2 = new d2b(this, B03, w0cVar2, (byte) 8);
                                                            w0cVar2.a = d2bVar2;
                                                            gl.e3(d2bVar2, w0cVar2.e);
                                                            w0cVar2.e /= 2;
                                                            return;
                                                        }
                                                    }
                                                    return;
                                                }
                                                return;
                                            }
                                            return;
                                        } else if (message8.summarizedOpen) {
                                            if (message8.translatedSummaryText == null || !l.equals(message8.translatedSummaryLanguage)) {
                                                F(k27Var2, l, new s0c(this, k27Var2, l, B0, (byte) 0));
                                                return;
                                            }
                                            return;
                                        } else {
                                            if (message8.voiceTranscriptionOpen && message8.voiceTranscriptionFinal) {
                                                tL_textWithEntities = message8.translatedVoiceTranscription;
                                            } else {
                                                tL_textWithEntities = message8.translatedText;
                                            }
                                            if ((tL_textWithEntities == null && message8.translatedPoll == null) || (((y0cVar = message8.translatedPoll) != null && !y0c.b(k27Var2, y0cVar)) || !l.equals(k27Var2.k.translatedToLanguage))) {
                                                kk7.f(this.currentAccount).k(kk7.M1, k27Var2);
                                                if (k27.m1(k27Var2) instanceof TLRPC.TL_messageMediaPoll) {
                                                    E(k27Var2, l, new k8c(this) {
                                                        public final b1c b;

                                                        {
                                                            this.b = this;
                                                        }

                                                        @Override
                                                        public final void a(Object obj, Object obj2, Object obj3) {
                                                            byte b = r6;
                                                            long j = B0;
                                                            boolean z3 = z2;
                                                            k27 k27Var5 = k27Var2;
                                                            b1c b1cVar = this.b;
                                                            switch (b) {
                                                                case 0:
                                                                    Integer num = (Integer) obj;
                                                                    TL_iv.RichMessage richMessage = (TL_iv.RichMessage) obj2;
                                                                    String str2 = (String) obj3;
                                                                    if (k27Var5.e1() != num.intValue()) {
                                                                        fa4.d("wtf, asked to translate " + k27Var5.e1() + " rich message but got " + num + "!");
                                                                    }
                                                                    TLRPC.Message message92 = k27Var5.k;
                                                                    message92.translatedToLanguage = str2;
                                                                    message92.translatedText = null;
                                                                    message92.translatedVoiceTranscription = null;
                                                                    message92.translatedPoll = null;
                                                                    message92.translatedRichMessage = richMessage;
                                                                    if (z3) {
                                                                        b1cVar.B(k27Var5);
                                                                    }
                                                                    b1cVar.getMessagesStorage().U1(j, k27Var5.k);
                                                                    kk7.f(b1cVar.currentAccount).k(128, k27Var5);
                                                                    ArrayList arrayList3 = (ArrayList) b1cVar.n.S.f(j);
                                                                    if (arrayList3 != null) {
                                                                        for (int i2 = 0; i2 < arrayList3.size(); i2++) {
                                                                            k27 k27Var6 = (k27) arrayList3.get(i2);
                                                                            if (k27Var6 != null && k27Var6.e1() == k27Var5.e1()) {
                                                                                TLRPC.Message message10 = k27Var6.k;
                                                                                message10.translatedToLanguage = str2;
                                                                                message10.translatedRichMessage = richMessage;
                                                                                if (k27Var6.f6(false)) {
                                                                                    kk7.f(b1cVar.currentAccount).k(2, 0);
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
                                                                    y0c y0cVar3 = (y0c) obj2;
                                                                    String str3 = (String) obj3;
                                                                    if (k27Var5.e1() != num2.intValue()) {
                                                                        fa4.d("wtf, asked to translate " + k27Var5.e1() + " poll but got " + num2 + "!");
                                                                    }
                                                                    TLRPC.Message message11 = k27Var5.k;
                                                                    message11.translatedToLanguage = str3;
                                                                    message11.translatedText = null;
                                                                    message11.translatedVoiceTranscription = null;
                                                                    message11.translatedPoll = y0cVar3;
                                                                    if (z3) {
                                                                        b1cVar.B(k27Var5);
                                                                    }
                                                                    b1cVar.getMessagesStorage().U1(j, k27Var5.k);
                                                                    kk7.f(b1cVar.currentAccount).k(128, k27Var5);
                                                                    ArrayList arrayList22 = (ArrayList) b1cVar.n.S.f(j);
                                                                    if (arrayList22 != null) {
                                                                        for (int i3 = 0; i3 < arrayList22.size(); i3++) {
                                                                            k27 k27Var7 = (k27) arrayList22.get(i3);
                                                                            if (k27Var7 != null && k27Var7.e1() == k27Var5.e1()) {
                                                                                TLRPC.Message message12 = k27Var7.k;
                                                                                message12.translatedToLanguage = str3;
                                                                                message12.translatedText = null;
                                                                                message12.translatedVoiceTranscription = null;
                                                                                message12.translatedPoll = y0cVar3;
                                                                                if (k27Var7.f6(false)) {
                                                                                    kk7.f(b1cVar.currentAccount).k(2, 0);
                                                                                    return;
                                                                                }
                                                                                return;
                                                                            }
                                                                        }
                                                                        return;
                                                                    }
                                                                    return;
                                                            }
                                                        }
                                                    });
                                                    return;
                                                } else {
                                                    G(k27Var2, l, new m8c() {
                                                        @Override
                                                        public final void a(Object obj, Object obj2, Object obj3, Object obj4) {
                                                            Boolean bool = (Boolean) obj;
                                                            Integer num = (Integer) obj2;
                                                            TLRPC.TL_textWithEntities tL_textWithEntities3 = (TLRPC.TL_textWithEntities) obj3;
                                                            String str2 = (String) obj4;
                                                            k27 k27Var5 = k27Var2;
                                                            if (k27Var5.e1() != num.intValue()) {
                                                                fa4.d("wtf, asked to translate " + k27Var5.e1() + " but got " + num + "!");
                                                            }
                                                            k27Var5.k.translatedToLanguage = str2;
                                                            boolean booleanValue = bool.booleanValue();
                                                            TLRPC.Message message10 = k27Var5.k;
                                                            if (booleanValue) {
                                                                message10.translatedVoiceTranscription = tL_textWithEntities3;
                                                            } else {
                                                                message10.translatedText = tL_textWithEntities3;
                                                            }
                                                            message10.translatedPoll = null;
                                                            b1c b1cVar = b1c.this;
                                                            if (z2) {
                                                                b1cVar.B(k27Var5);
                                                            }
                                                            ad7 messagesStorage = b1cVar.getMessagesStorage();
                                                            TLRPC.Message message11 = k27Var5.k;
                                                            long j = B0;
                                                            messagesStorage.U1(j, message11);
                                                            kk7.f(b1cVar.currentAccount).k(kk7.L1, k27Var5);
                                                            ArrayList arrayList3 = (ArrayList) b1cVar.n.S.f(j);
                                                            if (arrayList3 != null) {
                                                                for (int i2 = 0; i2 < arrayList3.size(); i2++) {
                                                                    k27 k27Var6 = (k27) arrayList3.get(i2);
                                                                    if (k27Var6 != null && k27Var6.e1() == k27Var5.e1()) {
                                                                        k27Var6.k.translatedToLanguage = str2;
                                                                        boolean booleanValue2 = bool.booleanValue();
                                                                        TLRPC.Message message12 = k27Var6.k;
                                                                        if (booleanValue2) {
                                                                            message12.translatedVoiceTranscription = tL_textWithEntities3;
                                                                        } else {
                                                                            message12.translatedText = tL_textWithEntities3;
                                                                        }
                                                                        message12.translatedPoll = null;
                                                                        if (k27Var6.f6(false)) {
                                                                            kk7.f(b1cVar.currentAccount).k(2, 0);
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
                                            } else if (z2) {
                                                B(k27Var2);
                                                return;
                                            } else {
                                                return;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        k27Var2 = k27Var;
                        if (!z) {
                        }
                    }
                }
            }
        }
    }

    public final void h() {
        synchronized (this) {
            for (ArrayList arrayList : this.E.values()) {
                if (arrayList != null) {
                    int size = arrayList.size();
                    int i = 0;
                    while (i < size) {
                        Object obj = arrayList.get(i);
                        i++;
                        x0c x0cVar = (x0c) obj;
                        gl.r(x0cVar.a);
                        if (x0cVar.h != -1) {
                            getConnectionsManager().cancelRequest(x0cVar.h, true);
                            ArrayList arrayList2 = x0cVar.b;
                            int size2 = arrayList2.size();
                            int i2 = 0;
                            while (i2 < size2) {
                                Object obj2 = arrayList2.get(i2);
                                i2++;
                                this.x.remove((Integer) obj2);
                            }
                        }
                    }
                }
            }
            for (ArrayList arrayList3 : this.F.values()) {
                if (arrayList3 != null) {
                    int size3 = arrayList3.size();
                    int i3 = 0;
                    while (i3 < size3) {
                        Object obj3 = arrayList3.get(i3);
                        i3++;
                        x0c x0cVar2 = (x0c) obj3;
                        gl.r(x0cVar2.a);
                        if (x0cVar2.h != -1) {
                            getConnectionsManager().cancelRequest(x0cVar2.h, true);
                            ArrayList arrayList4 = x0cVar2.b;
                            int size4 = arrayList4.size();
                            int i4 = 0;
                            while (i4 < size4) {
                                Object obj4 = arrayList4.get(i4);
                                i4++;
                                this.y.remove((Integer) obj4);
                            }
                        }
                    }
                }
            }
            for (ArrayList arrayList5 : this.H.values()) {
                if (arrayList5 != null) {
                    int size5 = arrayList5.size();
                    int i5 = 0;
                    while (i5 < size5) {
                        Object obj5 = arrayList5.get(i5);
                        i5++;
                        v0c v0cVar = (v0c) obj5;
                        gl.r(v0cVar.a);
                        if (v0cVar.h != -1) {
                            getConnectionsManager().cancelRequest(v0cVar.h, true);
                            ArrayList arrayList6 = v0cVar.b;
                            int size6 = arrayList6.size();
                            int i6 = 0;
                            while (i6 < size6) {
                                Object obj6 = arrayList6.get(i6);
                                i6++;
                                this.x.remove((Integer) obj6);
                            }
                        }
                    }
                }
            }
            for (ArrayList arrayList7 : this.I.values()) {
                if (arrayList7 != null) {
                    int size7 = arrayList7.size();
                    int i7 = 0;
                    while (i7 < size7) {
                        Object obj7 = arrayList7.get(i7);
                        i7++;
                        w0c w0cVar = (w0c) obj7;
                        gl.r(w0cVar.a);
                        if (w0cVar.f != -1) {
                            getConnectionsManager().cancelRequest(w0cVar.f, true);
                            ArrayList arrayList8 = w0cVar.b;
                            int size8 = arrayList8.size();
                            int i8 = 0;
                            while (i8 < size8) {
                                Object obj8 = arrayList8.get(i8);
                                i8++;
                                this.x.remove((Integer) obj8);
                            }
                        }
                    }
                }
            }
        }
        na7.q1(this.currentAccount).X3.edit().remove("translating_dialog_languages2").remove("hidden_translation_at").apply();
        this.a.clear();
        this.b.clear();
        this.c.clear();
        this.d.clear();
        this.e.clear();
        this.f.clear();
        this.h.clear();
        this.x.clear();
        this.y.clear();
    }

    public final void j(k27 k27Var, go2 go2Var) {
        TLRPC.Message message = k27Var.k;
        if (message != null && !TextUtils.isEmpty(message.message)) {
            if (!TextUtils.isEmpty(k27Var.k.originalLanguage)) {
                go2Var.a(k27Var.k.originalLanguage);
                return;
            }
            m11 m11Var = new m11(k27Var);
            HashSet hashSet = this.L;
            if (!hashSet.contains(m11Var)) {
                hashSet.add(m11Var);
                cme.b(k27Var.k.message, new h0c(this, k27Var, m11Var, go2Var), new h0c(this, k27Var, m11Var, go2Var), false);
            }
        }
    }

    public final void k(TL_stories.StoryItem storyItem) {
        String str;
        if (storyItem != null && storyItem.detectedLng == null && (str = storyItem.caption) != null && str.length() != 0) {
            ?? obj = new Object();
            HashSet hashSet = this.J;
            if (!hashSet.contains(obj)) {
                hashSet.add(obj);
                cme.b(storyItem.caption, new o0c(this, storyItem, obj), new o0c(this, storyItem, obj), false);
            }
        }
    }

    public final String l(long j) {
        String str = (String) this.d.get(Long.valueOf(j));
        if (str == null && ((str = rzb.G0()) == null || str.equals((String) this.e.get(Long.valueOf(j))))) {
            str = i();
        }
        if ("nb".equals(str)) {
            return "no";
        }
        return str;
    }

    public final void o(k27 k27Var) {
        TLRPC.Message message = k27Var.k;
        if (message != null) {
            long B0 = k27.B0(message);
            if (!u(B0)) {
                return;
            }
            TLRPC.Message message2 = k27Var.k;
            message2.translatedToLanguage = null;
            message2.translatedText = null;
            message2.translatedVoiceTranscription = null;
            message2.translatedPoll = null;
            message2.summaryText = null;
            message2.translatedSummaryText = null;
            message2.translatedSummaryLanguage = null;
            getMessagesStorage().U1(B0, k27Var.k);
            gl.d3(new de2(this, k27Var, B0, (byte) 8));
        }
    }

    public final boolean p(long j) {
        TLRPC.Chat K0;
        if (!s(j) || (K0 = getMessagesController().K0(Long.valueOf(-j))) == null || !K0.autotranslation) {
            return false;
        }
        return true;
    }

    public final boolean q() {
        if (!getMessagesController().F2()) {
            return false;
        }
        Boolean bool = this.r;
        if (bool == null) {
            bool = Boolean.valueOf(this.n.X3.getBoolean("translate_chat_button", true));
            this.r = bool;
        }
        return bool.booleanValue();
    }

    public final boolean r() {
        if (!getMessagesController().G2()) {
            return false;
        }
        Boolean bool = this.s;
        if (bool == null) {
            bool = Boolean.valueOf(this.n.X3.getBoolean("translate_button", na7.c1().getBoolean("translate_button", false)));
            this.s = bool;
        }
        return bool.booleanValue();
    }

    public final boolean s(long j) {
        if (this.b.contains(Long.valueOf(j)) && u(j) && !cf3.B(j) && getUserConfig().e() != j) {
            return true;
        }
        return false;
    }

    public final boolean t() {
        if (q() && y6c.h(this.currentAccount).p()) {
            return true;
        }
        return false;
    }

    public final boolean u(long j) {
        if (!q()) {
            return false;
        }
        TLRPC.Chat K0 = getMessagesController().K0(Long.valueOf(-j));
        if (!y6c.h(this.currentAccount).p()) {
            if (K0 == null || !K0.autotranslation) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final boolean v(String str) {
        if (getUserConfig().p()) {
            return qa9.b0().contains(str);
        }
        try {
            return TextUtils.equals(k96.D0().B.f, str);
        } catch (Exception unused) {
            return false;
        }
    }

    public final boolean y(long j) {
        if (this.h.contains(Long.valueOf(j))) {
            return true;
        }
        TLRPC.ChatFull L0 = getMessagesController().L0(-j);
        if (L0 != null) {
            return L0.translations_disabled;
        }
        TLRPC.UserFull W1 = getMessagesController().W1(j);
        if (W1 != null) {
            return W1.translations_disabled;
        }
        return false;
    }

    public final boolean z(defpackage.k27 r8) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.b1c.z(k27):boolean");
    }
}
