package defpackage;

import android.graphics.Typeface;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import j$.util.Comparator$CC;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;
public final class nf3 {
    public final of3 a;
    public int b;
    public int c;
    public boolean d;
    public boolean e;
    public HashMap f;
    public CharSequence g;

    public nf3(of3 of3Var) {
        this.a = of3Var;
    }

    public final void a(int i, r47 r47Var, TLRPC.Chat chat) {
        int i2;
        int i3;
        int i4;
        ArrayList arrayList;
        long j;
        boolean z;
        int i5;
        boolean z2;
        if (r47Var != null && chat != null) {
            i2 = r47Var.e1();
        } else {
            i2 = 0;
        }
        if (this.b != i2 || this.e) {
            this.f = null;
            this.c = 0;
            this.d = false;
            this.e = false;
            this.b = i2;
            TextPaint textPaint = aob.E0[0];
            if (chat != null) {
                ArrayList l = uc7.s1(i).g4.l(chat.id);
                if (l != null && !l.isEmpty()) {
                    ArrayList arrayList2 = new ArrayList(l);
                    Collections.sort(arrayList2, Comparator$CC.comparingInt(new nm((byte) 4)));
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    if (r47Var != null && !xc2.p0(chat)) {
                        j = r47.b2(i, r47Var.k, true, false);
                        i4 = 1;
                        arrayList = arrayList2;
                        TLRPC.TL_forumTopic f = uc7.s1(i).g4.f(chat.id, j);
                        if (f != null) {
                            CharSequence k = ro4.k(f, textPaint, null);
                            spannableStringBuilder.append(k);
                            if (f.unread_count > 0) {
                                i5 = k.length();
                            } else {
                                i5 = 0;
                            }
                            this.c = k.length();
                            if (r47Var.O3()) {
                                this.d = false;
                                z2 = false;
                            } else {
                                if (f.unread_count > 0) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                this.d = z2;
                            }
                        } else {
                            this.d = false;
                            z2 = false;
                            i5 = 0;
                        }
                        if (z2) {
                            spannableStringBuilder.append((CharSequence) " ");
                            spannableStringBuilder.setSpan(new mf3(hl.L(3.0f)), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 0);
                            z = true;
                        } else {
                            z = false;
                        }
                    } else {
                        i4 = 1;
                        arrayList = arrayList2;
                        j = 0;
                        z = false;
                        i5 = 0;
                    }
                    if (xc2.p0(chat)) {
                        this.f = new HashMap();
                        int i6 = 0;
                        while (i6 < Math.min(4, arrayList.size())) {
                            if (spannableStringBuilder.length() != 0) {
                                spannableStringBuilder.append((CharSequence) "  ");
                            }
                            ArrayList arrayList3 = arrayList;
                            long n = wf3.n(((TLRPC.TL_forumTopic) arrayList3.get(i6)).from_id);
                            gc0 gc0Var = new gc0(i, this.a);
                            gc0Var.h = false;
                            gc0Var.c(n);
                            this.f.put(Long.valueOf(n), gc0Var);
                            SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(wf3.k(yac.t0, n));
                            valueOf.insert(0, (CharSequence) "  ");
                            valueOf.setSpan(gc0Var, 0, i4, 33);
                            spannableStringBuilder.append((CharSequence) valueOf);
                            i6++;
                            arrayList = arrayList3;
                            i4 = 1;
                        }
                    } else {
                        ArrayList arrayList4 = arrayList;
                        boolean z3 = true;
                        for (int i7 = 0; i7 < Math.min(4, arrayList4.size()); i7++) {
                            TextPaint textPaint2 = textPaint;
                            if (((TLRPC.TL_forumTopic) arrayList4.get(i7)).id == j) {
                                textPaint = textPaint2;
                            } else {
                                if (spannableStringBuilder.length() != 0) {
                                    if (z3 && z) {
                                        spannableStringBuilder.append((CharSequence) " ");
                                    } else {
                                        spannableStringBuilder.append((CharSequence) ", ");
                                    }
                                }
                                textPaint = textPaint2;
                                spannableStringBuilder.append(ro4.k((TLRPC.ForumTopic) arrayList4.get(i7), textPaint, null));
                                z3 = false;
                            }
                        }
                    }
                    if (i5 > 0) {
                        Typeface o = hl.o();
                        int i8 = aob.X8;
                        ?? metricAffectingSpan = new MetricAffectingSpan();
                        metricAffectingSpan.a = o;
                        metricAffectingSpan.c = i8;
                        metricAffectingSpan.b = aob.w0(null, i8, false);
                        spannableStringBuilder.setSpan(metricAffectingSpan, 0, Math.min(spannableStringBuilder.length(), i5 + 2), 0);
                    }
                    this.g = spannableStringBuilder;
                } else if (!uc7.s1(i).g4.e(chat.id)) {
                    uc7.s1(i).g4.n(0, chat.id, true);
                    this.g = ob6.M0(2131748533, null);
                    this.e = true;
                } else {
                    if (xc2.p0(chat)) {
                        i3 = 2131747921;
                    } else {
                        i3 = 2131747868;
                    }
                    this.g = ob6.M0(i3, null);
                }
            }
        }
    }
}
