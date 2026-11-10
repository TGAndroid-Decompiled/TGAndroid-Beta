package ni;

import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.CharacterStyle;
import com.google.android.gms.internal.play_billing.s0;
import hi.n1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
public abstract class m {
    public static int f20642c;
    public static final s f20640a = new s(new a(0), new a(1));
    public static final LinkedHashMap f20641b = new LinkedHashMap(8, 0.75f, true);
    public static final Object d = new Object();
    public static final ArrayList f20643e = new ArrayList();

    public static void a(Spannable spannable, int i7, s0 s0Var) {
        Object[] spans;
        f[] fVarArr;
        Object[] spans2;
        k[] kVarArr;
        if (i7 != 0) {
            boolean z9 = spannable instanceof g;
            if (z9) {
                spans = g.a((g) spannable, i7, f.class);
            } else {
                spans = spannable.getSpans(0, i7, f.class);
            }
            for (f fVar : (f[]) spans) {
                d(spannable, i7, fVar);
                spannable.removeSpan(fVar);
            }
            if (z9) {
                spans2 = g.a((g) spannable, i7, k.class);
            } else {
                spans2 = spannable.getSpans(0, i7, k.class);
            }
            for (k kVar : (k[]) spans2) {
                d(spannable, i7, kVar);
                spannable.removeSpan(kVar);
            }
            if (s0Var != null) {
                int[] b10 = s0Var.b();
                for (int i10 = 0; i10 < b10.length; i10 += 3) {
                    int i11 = b10[i10];
                    int i12 = b10[i10 + 1];
                    int i13 = b10[i10 + 2];
                    if (i11 >= 0 && i12 <= i7 && i11 < i12) {
                        int i14 = i13 & 255;
                        if (i14 != 0) {
                            spannable.setSpan(new f(i14), i11, i12, 33);
                        }
                        if ((i13 & 768) != 0) {
                            spannable.setSpan(new k(i13), i11, i12, 33);
                        }
                    }
                }
            }
        }
    }

    public static SpannableString b(CharSequence charSequence, String str) {
        boolean z9;
        if (charSequence == null) {
            charSequence = "";
        }
        String b10 = s.b(str);
        if (!b10.isEmpty() && charSequence.length() != 0) {
            String charSequence2 = charSequence.toString();
            e eVar = new e(b10, charSequence2);
            if (!(charSequence instanceof Spanned) && charSequence2.length() <= 65536) {
                z9 = true;
            } else {
                z9 = false;
            }
            LinkedHashMap linkedHashMap = f20641b;
            synchronized (linkedHashMap) {
                if (z9) {
                    try {
                        SpannableString spannableString = (SpannableString) linkedHashMap.get(eVar);
                        if (spannableString != null) {
                            return spannableString;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                g gVar = new g(charSequence);
                if (z9) {
                    linkedHashMap.put(eVar, gVar);
                    f20642c += charSequence2.length();
                    while (true) {
                        LinkedHashMap linkedHashMap2 = f20641b;
                        if (linkedHashMap2.size() <= 8 && f20642c <= 65536) {
                            break;
                        }
                        Map.Entry entry = (Map.Entry) linkedHashMap2.entrySet().iterator().next();
                        f20642c -= ((e) entry.getKey()).f20626b.length();
                        linkedHashMap2.remove(entry.getKey());
                    }
                }
                c(gVar, gVar.length(), b10);
                return gVar;
            }
        }
        return new SpannableString(charSequence);
    }

    public static void c(Spannable spannable, int i7, String str) {
        l lVar;
        l lVar2;
        r rVar;
        if (spannable == null) {
            return;
        }
        if (i7 >= 0 && i7 <= spannable.length()) {
            i iVar = new i(spannable.subSequence(0, i7).toString());
            long j3 = (0 << 32) | (i7 & 4294967295L);
            synchronized (d) {
                try {
                    ArrayList arrayList = f20643e;
                    Iterator it = arrayList.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            lVar = (l) it.next();
                            Spannable spannable2 = (Spannable) lVar.f20638a.get();
                            if (spannable2 == null) {
                                it.remove();
                            } else if (spannable2 == spannable) {
                                break;
                            }
                        } else {
                            lVar = new l(spannable);
                            arrayList.add(lVar);
                            break;
                        }
                    }
                    lVar2 = lVar;
                    i iVar2 = (i) lVar2.f20639b.put(Long.valueOf(j3), iVar);
                    if (iVar2 != null && (rVar = iVar2.f20631b) != null) {
                        rVar.f20651a = null;
                    }
                } finally {
                }
            }
            r d2 = f20640a.d(iVar.f20630a, str, new n1(i7, 2, j3, lVar2, iVar));
            synchronized (d) {
                try {
                    if (lVar2.f20639b.get(Long.valueOf(j3)) == iVar) {
                        iVar.f20631b = d2;
                    } else {
                        d2.f20651a = null;
                    }
                } finally {
                }
            }
            return;
        }
        throw new IndexOutOfBoundsException();
    }

    public static void d(Spannable spannable, int i7, CharacterStyle characterStyle) {
        int spanStart;
        int spanEnd;
        Object kVar;
        Object kVar2;
        if (spannable instanceof g) {
            g gVar = (g) spannable;
            spanStart = g.b(gVar, characterStyle);
            spanEnd = g.c(gVar, characterStyle);
        } else {
            spanStart = spannable.getSpanStart(characterStyle);
            spanEnd = spannable.getSpanEnd(characterStyle);
        }
        if (spanStart >= 0 && spanStart < 0) {
            if (characterStyle instanceof f) {
                kVar2 = new f(((f) characterStyle).f20627a);
            } else {
                kVar2 = new k(((k) characterStyle).f20637b);
            }
            spannable.setSpan(kVar2, spanStart, Math.min(0, spanEnd), 33);
        }
        if (spanEnd > i7) {
            if (characterStyle instanceof f) {
                kVar = new f(((f) characterStyle).f20627a);
            } else {
                kVar = new k(((k) characterStyle).f20637b);
            }
            spannable.setSpan(kVar, Math.max(i7, spanStart), spanEnd, 33);
        }
    }
}
