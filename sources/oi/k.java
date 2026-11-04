package oi;

import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.CharacterStyle;
import com.google.android.gms.internal.play_billing.s0;
import ii.o1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import o4.v0;
public abstract class k {
    public static int f21151c;
    public static final q f21149a = new q(new v0(3), new v0(4));
    public static final LinkedHashMap f21150b = new LinkedHashMap(8, 0.75f, true);
    public static final Object d = new Object();
    public static final ArrayList f21152e = new ArrayList();

    public static void a(Spannable spannable, int i3, s0 s0Var) {
        Object[] spans;
        d[] dVarArr;
        Object[] spans2;
        i[] iVarArr;
        if (i3 != 0) {
            boolean z10 = spannable instanceof e;
            if (z10) {
                spans = e.a((e) spannable, i3, d.class);
            } else {
                spans = spannable.getSpans(0, i3, d.class);
            }
            for (d dVar : (d[]) spans) {
                d(spannable, i3, dVar);
                spannable.removeSpan(dVar);
            }
            if (z10) {
                spans2 = e.a((e) spannable, i3, i.class);
            } else {
                spans2 = spannable.getSpans(0, i3, i.class);
            }
            for (i iVar : (i[]) spans2) {
                d(spannable, i3, iVar);
                spannable.removeSpan(iVar);
            }
            if (s0Var != null) {
                int[] b10 = s0Var.b();
                for (int i10 = 0; i10 < b10.length; i10 += 3) {
                    int i11 = b10[i10];
                    int i12 = b10[i10 + 1];
                    int i13 = b10[i10 + 2];
                    if (i11 >= 0 && i12 <= i3 && i11 < i12) {
                        int i14 = i13 & 255;
                        if (i14 != 0) {
                            spannable.setSpan(new d(i14), i11, i12, 33);
                        }
                        if ((i13 & 768) != 0) {
                            spannable.setSpan(new i(i13), i11, i12, 33);
                        }
                    }
                }
            }
        }
    }

    public static SpannableString b(CharSequence charSequence, String str) {
        boolean z10;
        if (charSequence == null) {
            charSequence = "";
        }
        String b10 = q.b(str);
        if (!b10.isEmpty() && charSequence.length() != 0) {
            String charSequence2 = charSequence.toString();
            c cVar = new c(b10, charSequence2);
            if (!(charSequence instanceof Spanned) && charSequence2.length() <= 65536) {
                z10 = true;
            } else {
                z10 = false;
            }
            LinkedHashMap linkedHashMap = f21150b;
            synchronized (linkedHashMap) {
                if (z10) {
                    try {
                        SpannableString spannableString = (SpannableString) linkedHashMap.get(cVar);
                        if (spannableString != null) {
                            return spannableString;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                e eVar = new e(charSequence);
                if (z10) {
                    linkedHashMap.put(cVar, eVar);
                    f21151c += charSequence2.length();
                    while (true) {
                        LinkedHashMap linkedHashMap2 = f21150b;
                        if (linkedHashMap2.size() <= 8 && f21151c <= 65536) {
                            break;
                        }
                        Map.Entry entry = (Map.Entry) linkedHashMap2.entrySet().iterator().next();
                        f21151c -= ((c) entry.getKey()).f21135b.length();
                        linkedHashMap2.remove(entry.getKey());
                    }
                }
                c(eVar, eVar.length(), b10);
                return eVar;
            }
        }
        return new SpannableString(charSequence);
    }

    public static void c(Spannable spannable, int i3, String str) {
        j jVar;
        j jVar2;
        p pVar;
        if (spannable == null) {
            return;
        }
        if (i3 >= 0 && i3 <= spannable.length()) {
            g gVar = new g(spannable.subSequence(0, i3).toString());
            long j10 = (0 << 32) | (i3 & 4294967295L);
            synchronized (d) {
                try {
                    ArrayList arrayList = f21152e;
                    Iterator it = arrayList.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            jVar = (j) it.next();
                            Spannable spannable2 = (Spannable) jVar.f21147a.get();
                            if (spannable2 == null) {
                                it.remove();
                            } else if (spannable2 == spannable) {
                                break;
                            }
                        } else {
                            jVar = new j(spannable);
                            arrayList.add(jVar);
                            break;
                        }
                    }
                    jVar2 = jVar;
                    g gVar2 = (g) jVar2.f21148b.put(Long.valueOf(j10), gVar);
                    if (gVar2 != null && (pVar = gVar2.f21140b) != null) {
                        pVar.f21160a = null;
                    }
                } finally {
                }
            }
            p d10 = f21149a.d(gVar.f21139a, str, new o1(i3, 2, j10, jVar2, gVar));
            synchronized (d) {
                try {
                    if (jVar2.f21148b.get(Long.valueOf(j10)) == gVar) {
                        gVar.f21140b = d10;
                    } else {
                        d10.f21160a = null;
                    }
                } finally {
                }
            }
            return;
        }
        throw new IndexOutOfBoundsException();
    }

    public static void d(Spannable spannable, int i3, CharacterStyle characterStyle) {
        int spanStart;
        int spanEnd;
        Object iVar;
        Object iVar2;
        if (spannable instanceof e) {
            e eVar = (e) spannable;
            spanStart = e.b(eVar, characterStyle);
            spanEnd = e.c(eVar, characterStyle);
        } else {
            spanStart = spannable.getSpanStart(characterStyle);
            spanEnd = spannable.getSpanEnd(characterStyle);
        }
        if (spanStart >= 0 && spanStart < 0) {
            if (characterStyle instanceof d) {
                iVar2 = new d(((d) characterStyle).f21136a);
            } else {
                iVar2 = new i(((i) characterStyle).f21146b);
            }
            spannable.setSpan(iVar2, spanStart, Math.min(0, spanEnd), 33);
        }
        if (spanEnd > i3) {
            if (characterStyle instanceof d) {
                iVar = new d(((d) characterStyle).f21136a);
            } else {
                iVar = new i(((i) characterStyle).f21146b);
            }
            spannable.setSpan(iVar, Math.max(i3, spanStart), spanEnd, 33);
        }
    }
}
