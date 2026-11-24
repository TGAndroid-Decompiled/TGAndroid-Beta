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
public final class gg3 {
    public final hg3 a;
    public int b;
    public int c;
    public boolean d;
    public boolean e;
    public HashMap f;
    public CharSequence g;

    public gg3(hg3 hg3Var) {
        this.a = hg3Var;
    }

    public final void a(int i, k47 k47Var, TLRPC.Chat chat) {
        int i2;
        int i3;
        int i4;
        ArrayList arrayList;
        long j;
        boolean z;
        int i5;
        boolean z2;
        if (k47Var != null && chat != null) {
            i2 = k47Var.e1();
        } else {
            i2 = 0;
        }
        if (this.b != i2 || this.e) {
            this.f = null;
            this.c = 0;
            this.d = false;
            this.e = false;
            this.b = i2;
            TextPaint textPaint = cmb.E0[0];
            if (chat != null) {
                ArrayList l = oc7.r1(i).g4.l(chat.id);
                if (l != null && !l.isEmpty()) {
                    ArrayList arrayList2 = new ArrayList(l);
                    Collections.sort(arrayList2, Comparator$CC.comparingInt(new mn((byte) 4)));
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    if (k47Var != null && !sd2.p0(chat)) {
                        j = k47.b2(i, k47Var.k, true, false);
                        i4 = 1;
                        arrayList = arrayList2;
                        TLRPC.TL_forumTopic f = oc7.r1(i).g4.f(chat.id, j);
                        if (f != null) {
                            CharSequence k = no4.k(f, textPaint, null);
                            spannableStringBuilder.append(k);
                            if (f.unread_count > 0) {
                                i5 = k.length();
                            } else {
                                i5 = 0;
                            }
                            this.c = k.length();
                            if (k47Var.O3()) {
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
                            spannableStringBuilder.setSpan(new fg3(gm.L(3.0f)), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 0);
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
                    if (sd2.p0(chat)) {
                        this.f = new HashMap();
                        int i6 = 0;
                        while (i6 < Math.min(4, arrayList.size())) {
                            if (spannableStringBuilder.length() != 0) {
                                spannableStringBuilder.append((CharSequence) "  ");
                            }
                            ArrayList arrayList3 = arrayList;
                            long n = pg3.n(((TLRPC.TL_forumTopic) arrayList3.get(i6)).from_id);
                            ed0 ed0Var = new ed0(i, this.a);
                            ed0Var.h = false;
                            ed0Var.c(n);
                            this.f.put(Long.valueOf(n), ed0Var);
                            SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(pg3.k(z8c.t0, n));
                            valueOf.insert(0, (CharSequence) "  ");
                            valueOf.setSpan(ed0Var, 0, i4, 33);
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
                                spannableStringBuilder.append(no4.k((TLRPC.ForumTopic) arrayList4.get(i7), textPaint, null));
                                z3 = false;
                            }
                        }
                    }
                    if (i5 > 0) {
                        Typeface o = gm.o();
                        int i8 = cmb.W8;
                        ?? metricAffectingSpan = new MetricAffectingSpan();
                        metricAffectingSpan.a = o;
                        metricAffectingSpan.c = i8;
                        metricAffectingSpan.b = cmb.w0(null, i8, false);
                        spannableStringBuilder.setSpan(metricAffectingSpan, 0, Math.min(spannableStringBuilder.length(), i5 + 2), 0);
                    }
                    this.g = spannableStringBuilder;
                } else if (!oc7.r1(i).g4.e(chat.id)) {
                    oc7.r1(i).g4.n(0, chat.id, true);
                    this.g = jb6.M0(2131748536, null);
                    this.e = true;
                } else {
                    if (sd2.p0(chat)) {
                        i3 = 2131747924;
                    } else {
                        i3 = 2131747871;
                    }
                    this.g = jb6.M0(i3, null);
                }
            }
        }
    }
}
