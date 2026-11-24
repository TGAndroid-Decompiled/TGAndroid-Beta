package defpackage;

import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.CharacterStyle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
public abstract class el2 {
    public static int c;
    public static final ml8 a = new ml8(new a32((byte) 9), new a32((byte) 10));
    public static final LinkedHashMap b = new LinkedHashMap(8, 0.75f, true);
    public static final Object d = new Object();
    public static final ArrayList e = new ArrayList();

    public static void a(Spannable spannable, int i, f26 f26Var) {
        Object[] spans;
        xk2[] xk2VarArr;
        Object[] spans2;
        cl2[] cl2VarArr;
        if (i != 0) {
            boolean z = spannable instanceof yk2;
            if (z) {
                int i2 = yk2.b;
                spans = ((yk2) spannable).c(xk2.class, i);
            } else {
                spans = spannable.getSpans(0, i, xk2.class);
            }
            for (xk2 xk2Var : (xk2[]) spans) {
                d(spannable, i, xk2Var);
                spannable.removeSpan(xk2Var);
            }
            if (z) {
                int i3 = yk2.b;
                spans2 = ((yk2) spannable).c(cl2.class, i);
            } else {
                spans2 = spannable.getSpans(0, i, cl2.class);
            }
            for (cl2 cl2Var : (cl2[]) spans2) {
                d(spannable, i, cl2Var);
                spannable.removeSpan(cl2Var);
            }
            if (f26Var != null) {
                int[] b2 = f26Var.b();
                for (int i4 = 0; i4 < b2.length; i4 += 3) {
                    int i5 = b2[i4];
                    int i6 = b2[i4 + 1];
                    int i7 = b2[i4 + 2];
                    if (i5 >= 0 && i6 <= i && i5 < i6) {
                        int i8 = i7 & 255;
                        if (i8 != 0) {
                            spannable.setSpan(new xk2(i8), i5, i6, 33);
                        }
                        if ((i7 & 768) != 0) {
                            spannable.setSpan(new cl2(i7), i5, i6, 33);
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
        String b2 = ml8.b(str);
        if (!b2.isEmpty() && charSequence.length() != 0) {
            String charSequence2 = charSequence.toString();
            wk2 wk2Var = new wk2(b2, charSequence2);
            if (!(charSequence instanceof Spanned) && charSequence2.length() <= 65536) {
                z = true;
            } else {
                z = false;
            }
            LinkedHashMap linkedHashMap = b;
            synchronized (linkedHashMap) {
                if (z) {
                    SpannableString spannableString = (SpannableString) linkedHashMap.get(wk2Var);
                    if (spannableString != null) {
                        return spannableString;
                    }
                }
                yk2 yk2Var = new yk2(charSequence);
                if (z) {
                    linkedHashMap.put(wk2Var, yk2Var);
                    c += charSequence2.length();
                    while (true) {
                        LinkedHashMap linkedHashMap2 = b;
                        if (linkedHashMap2.size() <= 8 && c <= 65536) {
                            break;
                        }
                        Map.Entry entry = (Map.Entry) linkedHashMap2.entrySet().iterator().next();
                        c -= ((wk2) entry.getKey()).b.length();
                        linkedHashMap2.remove(entry.getKey());
                    }
                }
                c(yk2Var, yk2Var.length(), b2);
                return yk2Var;
            }
        }
        return new SpannableString(charSequence);
    }

    public static void c(Spannable spannable, int i, String str) {
        dl2 dl2Var;
        ll8 ll8Var;
        if (spannable == null) {
            return;
        }
        if (i >= 0 && i <= spannable.length()) {
            al2 al2Var = new al2(spannable.subSequence(0, i).toString());
            long j = i & 4294967295L;
            synchronized (d) {
                ArrayList arrayList = e;
                Iterator it = arrayList.iterator();
                while (true) {
                    if (it.hasNext()) {
                        dl2Var = (dl2) it.next();
                        Spannable spannable2 = (Spannable) dl2Var.a.get();
                        if (spannable2 == null) {
                            it.remove();
                        } else if (spannable2 == spannable) {
                            break;
                        }
                    } else {
                        dl2Var = new dl2(spannable);
                        arrayList.add(dl2Var);
                        break;
                    }
                }
                al2 al2Var2 = (al2) dl2Var.b.put(Long.valueOf(j), al2Var);
                if (al2Var2 != null && (ll8Var = al2Var2.b) != null) {
                    ll8Var.a = null;
                }
            }
            dl2 dl2Var2 = dl2Var;
            ll8 d2 = a.d(al2Var.a, str, new cg(dl2Var2, j, al2Var, i, (byte) 3));
            synchronized (d) {
                if (dl2Var2.b.get(Long.valueOf(j)) == al2Var) {
                    al2Var.b = d2;
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
        Object cl2Var;
        Object cl2Var2;
        if (spannable instanceof yk2) {
            yk2 yk2Var = (yk2) spannable;
            int i2 = yk2.b;
            spanStart = yk2Var.b(characterStyle);
            spanEnd = yk2Var.a(characterStyle);
        } else {
            spanStart = spannable.getSpanStart(characterStyle);
            spanEnd = spannable.getSpanEnd(characterStyle);
        }
        if (spanStart >= 0 && spanStart < 0) {
            if (characterStyle instanceof xk2) {
                cl2Var2 = new xk2(((xk2) characterStyle).a);
            } else {
                cl2Var2 = new cl2(((cl2) characterStyle).b);
            }
            spannable.setSpan(cl2Var2, spanStart, Math.min(0, spanEnd), 33);
        }
        if (spanEnd > i) {
            if (characterStyle instanceof xk2) {
                cl2Var = new xk2(((xk2) characterStyle).a);
            } else {
                cl2Var = new cl2(((cl2) characterStyle).b);
            }
            spannable.setSpan(cl2Var, Math.max(i, spanStart), spanEnd, 33);
        }
    }
}
