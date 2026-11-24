package defpackage;

import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.CharacterStyle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
public abstract class qj2 {
    public static int c;
    public static final jj8 a = new jj8(new k32((byte) 8), new k32((byte) 9));
    public static final LinkedHashMap b = new LinkedHashMap(8, 0.75f, true);
    public static final Object d = new Object();
    public static final ArrayList e = new ArrayList();

    public static void a(Spannable spannable, int i, f06 f06Var) {
        Object[] spans;
        jj2[] jj2VarArr;
        Object[] spans2;
        oj2[] oj2VarArr;
        if (i != 0) {
            boolean z = spannable instanceof kj2;
            if (z) {
                int i2 = kj2.b;
                spans = ((kj2) spannable).c(jj2.class, i);
            } else {
                spans = spannable.getSpans(0, i, jj2.class);
            }
            for (jj2 jj2Var : (jj2[]) spans) {
                d(spannable, i, jj2Var);
                spannable.removeSpan(jj2Var);
            }
            if (z) {
                int i3 = kj2.b;
                spans2 = ((kj2) spannable).c(oj2.class, i);
            } else {
                spans2 = spannable.getSpans(0, i, oj2.class);
            }
            for (oj2 oj2Var : (oj2[]) spans2) {
                d(spannable, i, oj2Var);
                spannable.removeSpan(oj2Var);
            }
            if (f06Var != null) {
                int[] b2 = f06Var.b();
                for (int i4 = 0; i4 < b2.length; i4 += 3) {
                    int i5 = b2[i4];
                    int i6 = b2[i4 + 1];
                    int i7 = b2[i4 + 2];
                    if (i5 >= 0 && i6 <= i && i5 < i6) {
                        int i8 = i7 & 255;
                        if (i8 != 0) {
                            spannable.setSpan(new jj2(i8), i5, i6, 33);
                        }
                        if ((i7 & 768) != 0) {
                            spannable.setSpan(new oj2(i7), i5, i6, 33);
                        }
                    }
                }
            }
        }
    }

    public static SpannableString b(CharSequence charSequence, String str) {
        boolean z;
        if (charSequence == null) {
            charSequence = "";
        }
        String b2 = jj8.b(str);
        if (!b2.isEmpty() && charSequence.length() != 0) {
            String charSequence2 = charSequence.toString();
            ij2 ij2Var = new ij2(b2, charSequence2);
            if (!(charSequence instanceof Spanned) && charSequence2.length() <= 65536) {
                z = true;
            } else {
                z = false;
            }
            LinkedHashMap linkedHashMap = b;
            synchronized (linkedHashMap) {
                if (z) {
                    SpannableString spannableString = (SpannableString) linkedHashMap.get(ij2Var);
                    if (spannableString != null) {
                        return spannableString;
                    }
                }
                kj2 kj2Var = new kj2(charSequence);
                if (z) {
                    linkedHashMap.put(ij2Var, kj2Var);
                    c += charSequence2.length();
                    while (true) {
                        LinkedHashMap linkedHashMap2 = b;
                        if (linkedHashMap2.size() <= 8 && c <= 65536) {
                            break;
                        }
                        Map.Entry entry = (Map.Entry) linkedHashMap2.entrySet().iterator().next();
                        c -= ((ij2) entry.getKey()).b.length();
                        linkedHashMap2.remove(entry.getKey());
                    }
                }
                c(kj2Var, kj2Var.length(), b2);
                return kj2Var;
            }
        }
        return new SpannableString(charSequence);
    }

    public static void c(Spannable spannable, int i, String str) {
        pj2 pj2Var;
        ij8 ij8Var;
        if (spannable == null) {
            return;
        }
        if (i >= 0 && i <= spannable.length()) {
            mj2 mj2Var = new mj2(spannable.subSequence(0, i).toString());
            long j = i & 4294967295L;
            synchronized (d) {
                ArrayList arrayList = e;
                Iterator it = arrayList.iterator();
                while (true) {
                    if (it.hasNext()) {
                        pj2Var = (pj2) it.next();
                        Spannable spannable2 = (Spannable) pj2Var.a.get();
                        if (spannable2 == null) {
                            it.remove();
                        } else if (spannable2 == spannable) {
                            break;
                        }
                    } else {
                        pj2Var = new pj2(spannable);
                        arrayList.add(pj2Var);
                        break;
                    }
                }
                mj2 mj2Var2 = (mj2) pj2Var.b.put(Long.valueOf(j), mj2Var);
                if (mj2Var2 != null && (ij8Var = mj2Var2.b) != null) {
                    ij8Var.a = null;
                }
            }
            pj2 pj2Var2 = pj2Var;
            ij8 d2 = a.d(mj2Var.a, str, new bf(pj2Var2, j, mj2Var, i, (byte) 3));
            synchronized (d) {
                if (pj2Var2.b.get(Long.valueOf(j)) == mj2Var) {
                    mj2Var.b = d2;
                } else {
                    d2.a = null;
                }
            }
            return;
        }
        throw new IndexOutOfBoundsException();
    }

    public static void d(Spannable spannable, int i, CharacterStyle characterStyle) {
        int spanStart;
        int spanEnd;
        Object oj2Var;
        Object oj2Var2;
        if (spannable instanceof kj2) {
            kj2 kj2Var = (kj2) spannable;
            int i2 = kj2.b;
            spanStart = kj2Var.b(characterStyle);
            spanEnd = kj2Var.a(characterStyle);
        } else {
            spanStart = spannable.getSpanStart(characterStyle);
            spanEnd = spannable.getSpanEnd(characterStyle);
        }
        if (spanStart >= 0 && spanStart < 0) {
            if (characterStyle instanceof jj2) {
                oj2Var2 = new jj2(((jj2) characterStyle).a);
            } else {
                oj2Var2 = new oj2(((oj2) characterStyle).b);
            }
            spannable.setSpan(oj2Var2, spanStart, Math.min(0, spanEnd), 33);
        }
        if (spanEnd > i) {
            if (characterStyle instanceof jj2) {
                oj2Var = new jj2(((jj2) characterStyle).a);
            } else {
                oj2Var = new oj2(((oj2) characterStyle).b);
            }
            spannable.setSpan(oj2Var, Math.max(i, spanStart), spanEnd, 33);
        }
    }
}
