package li;

import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.CharacterStyle;
import com.google.android.gms.internal.play_billing.s0;
import ei.u1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
public abstract class k {
    public static int f15625c;
    public static final q f15623a = new q(new j2.e(17), new j2.e(18));
    public static final LinkedHashMap f15624b = new LinkedHashMap(8, 0.75f, true);
    public static final Object d = new Object();
    public static final ArrayList f15626e = new ArrayList();

    public static void a(Spannable spannable, int i10, s0 s0Var) {
        Object[] spans;
        d[] dVarArr;
        Object[] spans2;
        i[] iVarArr;
        if (i10 != 0) {
            boolean z10 = spannable instanceof e;
            if (z10) {
                spans = e.a((e) spannable, i10, d.class);
            } else {
                spans = spannable.getSpans(0, i10, d.class);
            }
            for (d dVar : (d[]) spans) {
                d(spannable, i10, dVar);
                spannable.removeSpan(dVar);
            }
            if (z10) {
                spans2 = e.a((e) spannable, i10, i.class);
            } else {
                spans2 = spannable.getSpans(0, i10, i.class);
            }
            for (i iVar : (i[]) spans2) {
                d(spannable, i10, iVar);
                spannable.removeSpan(iVar);
            }
            if (s0Var != null) {
                int[] b10 = s0Var.b();
                for (int i11 = 0; i11 < b10.length; i11 += 3) {
                    int i12 = b10[i11];
                    int i13 = b10[i11 + 1];
                    int i14 = b10[i11 + 2];
                    if (i12 >= 0 && i13 <= i10 && i12 < i13) {
                        int i15 = i14 & 255;
                        if (i15 != 0) {
                            spannable.setSpan(new d(i15), i12, i13, 33);
                        }
                        if ((i14 & 768) != 0) {
                            spannable.setSpan(new i(i14), i12, i13, 33);
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
            LinkedHashMap linkedHashMap = f15624b;
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
                    f15625c += charSequence2.length();
                    while (true) {
                        LinkedHashMap linkedHashMap2 = f15624b;
                        if (linkedHashMap2.size() <= 8 && f15625c <= 65536) {
                            break;
                        }
                        Map.Entry entry = (Map.Entry) linkedHashMap2.entrySet().iterator().next();
                        f15625c -= ((c) entry.getKey()).f15609b.length();
                        linkedHashMap2.remove(entry.getKey());
                    }
                }
                c(eVar, eVar.length(), b10);
                return eVar;
            }
        }
        return new SpannableString(charSequence);
    }

    public static void c(Spannable spannable, int i10, String str) {
        j jVar;
        p pVar;
        if (spannable == null) {
            return;
        }
        if (i10 >= 0 && i10 <= spannable.length()) {
            g gVar = new g(spannable.subSequence(0, i10).toString());
            long j3 = (0 << 32) | (i10 & 4294967295L);
            synchronized (d) {
                try {
                    ArrayList arrayList = f15626e;
                    Iterator it = arrayList.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            jVar = (j) it.next();
                            Spannable spannable2 = (Spannable) jVar.f15621a.get();
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
                    g gVar2 = (g) jVar.f15622b.put(Long.valueOf(j3), gVar);
                    if (gVar2 != null && (pVar = gVar2.f15614b) != null) {
                        pVar.f15634a = null;
                    }
                } finally {
                }
            }
            j jVar2 = jVar;
            p d10 = f15623a.d(gVar.f15613a, str, new u1(jVar2, j3, gVar, i10, 2));
            synchronized (d) {
                try {
                    if (jVar2.f15622b.get(Long.valueOf(j3)) == gVar) {
                        gVar.f15614b = d10;
                    } else {
                        d10.f15634a = null;
                    }
                } finally {
                }
            }
            return;
        }
        throw new IndexOutOfBoundsException();
    }

    public static void d(Spannable spannable, int i10, CharacterStyle characterStyle) {
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
                iVar2 = new d(((d) characterStyle).f15610a);
            } else {
                iVar2 = new i(((i) characterStyle).f15620b);
            }
            spannable.setSpan(iVar2, spanStart, Math.min(0, spanEnd), 33);
        }
        if (spanEnd > i10) {
            if (characterStyle instanceof d) {
                iVar = new d(((d) characterStyle).f15610a);
            } else {
                iVar = new i(((i) characterStyle).f15620b);
            }
            spannable.setSpan(iVar, Math.max(i10, spanStart), spanEnd, 33);
        }
    }
}
