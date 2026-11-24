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
public final class te3 {
    public final ue3 a;
    public int b;
    public int c;
    public boolean d;
    public boolean e;
    public HashMap f;
    public CharSequence g;

    public te3(ue3 ue3Var) {
        this.a = ue3Var;
    }

    public final void a(int i, k27 k27Var, TLRPC.Chat chat) {
        int i2;
        int i3;
        int i4;
        ArrayList arrayList;
        long j;
        boolean z;
        int i5;
        boolean z2;
        if (k27Var != null && chat != null) {
            i2 = k27Var.e1();
        } else {
            i2 = 0;
        }
        if (this.b != i2 || this.e) {
            this.f = null;
            this.c = 0;
            this.d = false;
            this.e = false;
            this.b = i2;
            TextPaint textPaint = bkb.E0[0];
            if (chat != null) {
                ArrayList l = na7.q1(i).g4.l(chat.id);
                if (l != null && !l.isEmpty()) {
                    ArrayList arrayList2 = new ArrayList(l);
                    Collections.sort(arrayList2, Comparator$CC.comparingInt(new mm((byte) 4)));
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    if (k27Var != null && !hc2.p0(chat)) {
                        j = k27.b2(i, k27Var.k, true, false);
                        i4 = 1;
                        arrayList = arrayList2;
                        TLRPC.TL_forumTopic f = na7.q1(i).g4.f(chat.id, j);
                        if (f != null) {
                            CharSequence k = mm4.k(f, textPaint, null);
                            spannableStringBuilder.append(k);
                            if (f.unread_count > 0) {
                                i5 = k.length();
                            } else {
                                i5 = 0;
                            }
                            this.c = k.length();
                            if (k27Var.O3()) {
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
                            spannableStringBuilder.setSpan(new se3(gl.L(3.0f)), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 0);
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
                    if (hc2.p0(chat)) {
                        this.f = new HashMap();
                        int i6 = 0;
                        while (i6 < Math.min(4, arrayList.size())) {
                            if (spannableStringBuilder.length() != 0) {
                                spannableStringBuilder.append((CharSequence) "  ");
                            }
                            ArrayList arrayList3 = arrayList;
                            long n = cf3.n(((TLRPC.TL_forumTopic) arrayList3.get(i6)).from_id);
                            ec0 ec0Var = new ec0(i, this.a);
                            ec0Var.h = false;
                            ec0Var.c(n);
                            this.f.put(Long.valueOf(n), ec0Var);
                            SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(cf3.k(y6c.t0, n));
                            valueOf.insert(0, (CharSequence) "  ");
                            valueOf.setSpan(ec0Var, 0, i4, 33);
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
                                spannableStringBuilder.append(mm4.k((TLRPC.ForumTopic) arrayList4.get(i7), textPaint, null));
                                z3 = false;
                            }
                        }
                    }
                    if (i5 > 0) {
                        Typeface o = gl.o();
                        int i8 = bkb.W8;
                        ?? metricAffectingSpan = new MetricAffectingSpan();
                        metricAffectingSpan.a = o;
                        metricAffectingSpan.c = i8;
                        metricAffectingSpan.b = bkb.w0(null, i8, false);
                        spannableStringBuilder.setSpan(metricAffectingSpan, 0, Math.min(spannableStringBuilder.length(), i5 + 2), 0);
                    }
                    this.g = spannableStringBuilder;
                } else if (!na7.q1(i).g4.e(chat.id)) {
                    na7.q1(i).g4.n(0, chat.id, true);
                    this.g = k96.M0(2131748587, null);
                    this.e = true;
                } else {
                    if (hc2.p0(chat)) {
                        i3 = 2131747998;
                    } else {
                        i3 = 2131747945;
                    }
                    this.g = k96.M0(i3, null);
                }
            }
        }
    }
}
