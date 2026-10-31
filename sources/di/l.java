package di;

import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.CharacterStyle;
import com.google.android.gms.internal.play_billing.s0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
public abstract class l {
    public static int f5975c;
    public static final s f5973a = new s(new d2.c(2), new d2.c(3));
    public static final LinkedHashMap f5974b = new LinkedHashMap(8, 0.75f, true);
    public static final Object d = new Object();
    public static final ArrayList e = new ArrayList();

    public static void a(Spannable spannable, int i10, s0 s0Var) {
        Object[] spans;
        e[] eVarArr;
        Object[] spans2;
        j[] jVarArr;
        if (i10 != 0) {
            boolean z10 = spannable instanceof f;
            if (z10) {
                spans = f.a((f) spannable, i10, e.class);
            } else {
                spans = spannable.getSpans(0, i10, e.class);
            }
            for (e eVar : (e[]) spans) {
                d(spannable, i10, eVar);
                spannable.removeSpan(eVar);
            }
            if (z10) {
                spans2 = f.a((f) spannable, i10, j.class);
            } else {
                spans2 = spannable.getSpans(0, i10, j.class);
            }
            for (j jVar : (j[]) spans2) {
                d(spannable, i10, jVar);
                spannable.removeSpan(jVar);
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
                            spannable.setSpan(new e(i15), i12, i13, 33);
                        }
                        if ((i14 & 768) != 0) {
                            spannable.setSpan(new j(i14), i12, i13, 33);
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
        String b10 = s.b(str);
        if (!b10.isEmpty() && charSequence.length() != 0) {
            String charSequence2 = charSequence.toString();
            d dVar = new d(b10, charSequence2);
            if (!(charSequence instanceof Spanned) && charSequence2.length() <= 65536) {
                z10 = true;
            } else {
                z10 = false;
            }
            LinkedHashMap linkedHashMap = f5974b;
            synchronized (linkedHashMap) {
                if (z10) {
                    try {
                        SpannableString spannableString = (SpannableString) linkedHashMap.get(dVar);
                        if (spannableString != null) {
                            return spannableString;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                f fVar = new f(charSequence);
                if (z10) {
                    linkedHashMap.put(dVar, fVar);
                    f5975c += charSequence2.length();
                    while (true) {
                        LinkedHashMap linkedHashMap2 = f5974b;
                        if (linkedHashMap2.size() <= 8 && f5975c <= 65536) {
                            break;
                        }
                        Map.Entry entry = (Map.Entry) linkedHashMap2.entrySet().iterator().next();
                        f5975c -= ((d) entry.getKey()).f5959b.length();
                        linkedHashMap2.remove(entry.getKey());
                    }
                }
                c(fVar, fVar.length(), b10);
                return fVar;
            }
        }
        return new SpannableString(charSequence);
    }

    public static void c(Spannable spannable, int i10, String str) {
        k kVar;
        k kVar2;
        r rVar;
        if (spannable == null) {
            return;
        }
        if (i10 >= 0 && i10 <= spannable.length()) {
            h hVar = new h(spannable.subSequence(0, i10).toString());
            long j10 = (0 << 32) | (i10 & 4294967295L);
            synchronized (d) {
                try {
                    ArrayList arrayList = e;
                    Iterator it = arrayList.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            kVar = (k) it.next();
                            Spannable spannable2 = (Spannable) kVar.f5971a.get();
                            if (spannable2 == null) {
                                it.remove();
                            } else if (spannable2 == spannable) {
                                break;
                            }
                        } else {
                            kVar = new k(spannable);
                            arrayList.add(kVar);
                            break;
                        }
                    }
                    kVar2 = kVar;
                    h hVar2 = (h) kVar2.f5972b.put(Long.valueOf(j10), hVar);
                    if (hVar2 != null && (rVar = hVar2.f5964b) != null) {
                        rVar.f5984a = null;
                    }
                } finally {
                }
            }
            r d10 = f5973a.d(hVar.f5963a, str, new a(i10, 0, j10, kVar2, hVar));
            synchronized (d) {
                try {
                    if (kVar2.f5972b.get(Long.valueOf(j10)) == hVar) {
                        hVar.f5964b = d10;
                    } else {
                        d10.f5984a = null;
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
        Object jVar;
        Object jVar2;
        if (spannable instanceof f) {
            f fVar = (f) spannable;
            spanStart = f.b(fVar, characterStyle);
            spanEnd = f.c(fVar, characterStyle);
        } else {
            spanStart = spannable.getSpanStart(characterStyle);
            spanEnd = spannable.getSpanEnd(characterStyle);
        }
        if (spanStart >= 0 && spanStart < 0) {
            if (characterStyle instanceof e) {
                jVar2 = new e(((e) characterStyle).f5960a);
            } else {
                jVar2 = new j(((j) characterStyle).f5970b);
            }
            spannable.setSpan(jVar2, spanStart, Math.min(0, spanEnd), 33);
        }
        if (spanEnd > i10) {
            if (characterStyle instanceof e) {
                jVar = new e(((e) characterStyle).f5960a);
            } else {
                jVar = new j(((j) characterStyle).f5970b);
            }
            spannable.setSpan(jVar, Math.max(i10, spanStart), spanEnd, 33);
        }
    }
}
