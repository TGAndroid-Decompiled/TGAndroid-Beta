package org.telegram.messenger;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.CharacterStyle;
import android.text.style.URLSpan;
import android.view.View;
import j$.util.Comparator$CC;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.function.ToIntFunction;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.CheckBoxBase;
import org.telegram.ui.Components.a80;
import org.telegram.ui.Components.b41;
import org.telegram.ui.Components.ck0;
import org.telegram.ui.Components.d41;
import org.telegram.ui.Components.e41;
import org.telegram.ui.Components.eu0;
import org.telegram.ui.Components.mx0;
import org.telegram.ui.Components.my0;
import org.telegram.ui.Components.ny0;
import org.telegram.ui.Components.uy0;
import org.telegram.ui.Components.vy0;
import org.telegram.ui.Components.y31;
import org.telegram.ui.Components.zj0;
import org.telegram.ui.rg0;
import org.telegram.ui.tg0;
public final class kv {
    public int A;
    public final int B;
    public int C;
    public org.telegram.ui.ActionBar.f6 D;
    public org.telegram.ui.Cells.q1 E;
    public org.telegram.ui.Cells.l1 F;
    public org.telegram.ui.Components.ic G;
    public Paint H;
    public my0 I;
    public a80 J;
    public final RectF K;
    public boolean L;
    public int M;
    public float N;
    public boolean O;
    public kv P;
    public View Q;
    public xh.e R;
    public int S;
    public int T;
    public org.telegram.ui.Components.w5 U;
    public float V;
    public fu W;
    public int X;
    public IdentityHashMap Y;
    public final int f23763a;
    public final ij f23764b;
    public TL_iv.RichMessage f23765c;
    public boolean d;
    public final ArrayList f23766e;
    public final ArrayList f23767f;
    public final ArrayList f23768g;
    public final ArrayList h;
    public Drawable f23769i;
    public final HashMap f23770j;
    public final HashMap f23771k;
    public final ArrayList f23772l;
    public final HashMap f23773m;
    public final ArrayList f23774n;
    public final ArrayList f23775o;
    public final ArrayList f23776p;
    public Object f23777q;
    public tg0 f23778r;
    public boolean f23779s;
    public float f23780t;
    public boolean f23781u;
    public boolean v;
    public final TextPaint f23782w;
    public final TextPaint f23783x;
    public final zj0 f23784y;
    public final h6.m f23785z;

    public kv(ij ijVar, int i7, kv kvVar) {
        this.f23766e = new ArrayList();
        this.f23767f = new ArrayList();
        this.f23768g = new ArrayList();
        this.h = new ArrayList();
        this.f23770j = new HashMap();
        this.f23771k = new HashMap();
        this.f23772l = new ArrayList();
        this.f23773m = new HashMap();
        this.f23774n = new ArrayList();
        this.f23775o = new ArrayList();
        this.f23776p = new ArrayList();
        this.f23777q = "";
        this.f23780t = 1.0f;
        this.f23782w = new TextPaint(1);
        this.f23783x = new TextPaint(1);
        this.f23784y = new zj0(null);
        this.f23785z = new h6.m(28);
        this.K = new RectF();
        this.f23764b = ijVar;
        this.B = i7;
        this.f23763a = ijVar.I1;
        J(kvVar);
    }

    public static boolean A(TLRPC.PeerColor peerColor) {
        if ((peerColor instanceof TLRPC.TL_peerColorCollectible) || ((peerColor instanceof TLRPC.TL_peerColor) && (peerColor.flags & 1) != 0)) {
            return true;
        }
        return false;
    }

    public static float K(int i7, int i10, float[] fArr) {
        float f10 = 0.0f;
        while (i7 < i10) {
            f10 += fArr[i7];
            i7++;
        }
        return 1000 / Math.max(1.0E-4f, f10);
    }

    public static String N(TL_iv.pageBlockOrderedList pageblockorderedlist, TL_iv.PageListOrderedItem pageListOrderedItem, int i7) {
        if (!TextUtils.isEmpty(pageListOrderedItem.num)) {
            if (pageListOrderedItem.num.endsWith(".")) {
                return pageListOrderedItem.num;
            }
            return a8.p0.s(new StringBuilder(), pageListOrderedItem.num, ".");
        } else if (TLObject.hasFlag(pageListOrderedItem.flags, 8)) {
            return a8.p0.n(pageListOrderedItem.value, ".", new StringBuilder());
        } else if (TLObject.hasFlag(pageblockorderedlist.flags, 1)) {
            StringBuilder sb2 = new StringBuilder();
            int i10 = pageblockorderedlist.start;
            if (pageblockorderedlist.reversed) {
                i7 = -i7;
            }
            sb2.append(i10 + i7);
            sb2.append(".");
            return sb2.toString();
        } else {
            return (i7 + 1) + ".";
        }
    }

    public static boolean O(int i7, List list) {
        if (i7 > 0 && (list.get(i7 - 1) instanceof TL_iv.pageBlockParagraph)) {
            return true;
        }
        return false;
    }

    public static int R(int i7, int i10) {
        if (i10 == 0) {
            return i7;
        }
        return (i7 & (-16)) | i10;
    }

    public static void Z(StringBuilder sb2, ArrayList arrayList, ArrayList arrayList2) {
        int i7 = 0;
        while (i7 < arrayList.size() && i7 < arrayList2.size() && arrayList.get(i7) == arrayList2.get(i7)) {
            i7++;
        }
        while (arrayList.size() > i7) {
            sb2.append("</blockquote>");
            arrayList.remove(arrayList.size() - 1);
        }
        while (arrayList.size() < arrayList2.size()) {
            sb2.append("<blockquote>");
            arrayList.add((bu) arrayList2.get(arrayList.size()));
        }
    }

    public static void a(StringBuilder sb2, CharSequence charSequence, int i7, int i10, boolean z9) {
        String str;
        String str2;
        if (i10 > i7) {
            SpannableStringBuilder a02 = a0(charSequence.subSequence(i7, i10));
            StringBuilder sb3 = new StringBuilder();
            li.b4.g(sb3, a02);
            String sb4 = sb3.toString();
            if (sb4.isEmpty()) {
                return;
            }
            if (z9) {
                str = "<cite>";
            } else {
                str = "<p>";
            }
            sb2.append(str);
            sb2.append(sb4);
            if (z9) {
                str2 = "</cite>";
            } else {
                str2 = "</p>";
            }
            sb2.append(str2);
        }
    }

    public static SpannableStringBuilder a0(CharSequence charSequence) {
        gv[] gvVarArr;
        int i7;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
        for (gv gvVar : (gv[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), gv.class)) {
            int spanStart = spannableStringBuilder.getSpanStart(gvVar);
            int spanEnd = spannableStringBuilder.getSpanEnd(gvVar);
            if (spanEnd > spanStart) {
                int i10 = gvVar.f22729b;
                if ((i10 & 16) != 0) {
                    i7 = 1;
                } else {
                    i7 = 0;
                }
                if ((i10 & 32) != 0) {
                    i7 |= 2;
                }
                if ((i10 & 64) != 0) {
                    i7 |= 16;
                }
                if ((i10 & 128) != 0) {
                    i7 |= 8;
                }
                if ((i10 & 256) != 0) {
                    i7 |= 4;
                }
                if ((i10 & 2048) != 0) {
                    i7 |= 16384;
                }
                if ((i10 & 4096) != 0) {
                    i7 |= 32768;
                }
                if ((i10 & 8192) != 0) {
                    i7 |= 65536;
                }
                if (i7 != 0) {
                    ?? obj = new Object();
                    obj.f38751a = i7;
                    spannableStringBuilder.setSpan(new vy0(obj, 0), spanStart, spanEnd, 33);
                }
            }
        }
        return spannableStringBuilder;
    }

    public static void d(StringBuilder sb2, ArrayList arrayList) {
        String str;
        while (!arrayList.isEmpty()) {
            if (((Boolean) org.telegram.ui.Cells.f1.k(1, arrayList)).booleanValue()) {
                str = "</ol>";
            } else {
                str = "</ul>";
            }
            sb2.append(str);
        }
    }

    public static org.telegram.messenger.aj[] e(float[] r34) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.kv.e(float[]):org.telegram.messenger.aj[]");
    }

    public static int q(TL_iv.PageBlock pageBlock) {
        if (pageBlock instanceof TL_iv.pageBlockHeading1) {
            return 1;
        }
        if (pageBlock instanceof TL_iv.pageBlockHeading2) {
            return 2;
        }
        if (pageBlock instanceof TL_iv.pageBlockHeading3) {
            return 3;
        }
        if (pageBlock instanceof TL_iv.pageBlockHeading4) {
            return 4;
        }
        if (pageBlock instanceof TL_iv.pageBlockHeading5) {
            return 5;
        }
        if (pageBlock instanceof TL_iv.pageBlockHeading6) {
            return 6;
        }
        if ((pageBlock instanceof TL_iv.pageBlockBlockquote) || (pageBlock instanceof TL_iv.pageBlockBlockquoteBlocks)) {
            return 9;
        }
        if (pageBlock instanceof TL_iv.pageBlockPullquote) {
            return 12;
        }
        if (pageBlock instanceof TL_iv.pageBlockFooter) {
            return 7;
        }
        return 0;
    }

    public static String x(TL_iv.RichText richText) {
        StringBuilder sb2 = new StringBuilder();
        y(richText, sb2);
        return sb2.toString();
    }

    public static void y(TL_iv.RichText richText, StringBuilder sb2) {
        if (richText instanceof TL_iv.textPlain) {
            sb2.append(((TL_iv.textPlain) richText).text);
        } else if (richText instanceof TL_iv.textDiff) {
            TL_iv.textDiff textdiff = (TL_iv.textDiff) richText;
            if (!li.c6.j(textdiff.text)) {
                y(textdiff.text, sb2);
            } else if (!li.c6.j(textdiff.old_text)) {
                y(textdiff.old_text, sb2);
            }
        } else if (richText instanceof TL_iv.textConcat) {
            for (int i7 = 0; i7 < richText.texts.size(); i7++) {
                y(richText.texts.get(i7), sb2);
            }
        } else {
            TL_iv.RichText richText2 = richText.text;
            if (richText2 != null) {
                y(richText2, sb2);
            }
        }
    }

    public static uy0 z(int i7) {
        ?? obj = new Object();
        obj.f38751a = i7;
        return obj;
    }

    public final boolean B() {
        org.telegram.ui.Cells.q1 q1Var = this.E;
        if (q1Var != null && q1Var.Ta > 0) {
            return true;
        }
        return false;
    }

    public final boolean C() {
        org.telegram.ui.Components.n5 n5Var;
        if (F()) {
            int i7 = 0;
            while (true) {
                ArrayList arrayList = this.f23774n;
                if (i7 >= arrayList.size()) {
                    break;
                }
                org.telegram.ui.Cells.t9 t9Var = (org.telegram.ui.Cells.t9) arrayList.get(i7);
                if ((t9Var instanceof jv) && (n5Var = ((jv) t9Var).E) != null && !n5Var.f36230a.isEmpty()) {
                    return true;
                }
                i7++;
            }
        }
        return false;
    }

    public final boolean D() {
        ij ijVar = this.f23764b;
        if (ijVar != null && ijVar.Q2() && !ijVar.Q3()) {
            return true;
        }
        return false;
    }

    public final boolean E() {
        ij ijVar = this.f23764b;
        if (ijVar != null && ijVar.Q3()) {
            return true;
        }
        return false;
    }

    public final boolean F() {
        tg0 tg0Var = this.f23778r;
        if (tg0Var != null && tg0Var.h) {
            return false;
        }
        return true;
    }

    public final boolean G() {
        org.telegram.ui.Cells.q1 q1Var = this.E;
        if (q1Var != null && q1Var.I2()) {
            return true;
        }
        return false;
    }

    public final boolean H() {
        org.telegram.ui.Cells.t9[] L;
        fu fuVar = this.W;
        if (fuVar != null && (L = fuVar.L()) != null) {
            for (org.telegram.ui.Cells.t9 t9Var : L) {
                if (t9Var instanceof jv) {
                    jv jvVar = (jv) t9Var;
                    if (jvVar.M != null || jvVar.Q != null) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final boolean I() {
        TL_iv.RichMessage richMessage = this.f23765c;
        if (richMessage != null && richMessage.rtl) {
            return true;
        }
        return false;
    }

    public final void J(kv kvVar) {
        boolean z9;
        boolean z10;
        float f10;
        boolean z11;
        int i7;
        int i10;
        this.A = 0;
        this.C = 0;
        View view = this.Q;
        ArrayList arrayList = this.f23768g;
        if (view != null) {
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                fu fuVar = (fu) arrayList.get(i11);
                View view2 = fuVar.V;
                if (view2 != null && view2 == view) {
                    fuVar.V();
                    CheckBoxBase checkBoxBase = fuVar.f22456r;
                    if (checkBoxBase != null) {
                        checkBoxBase.f31254l = false;
                    }
                    fuVar.V = null;
                }
            }
        }
        this.f23766e.clear();
        this.f23767f.clear();
        arrayList.clear();
        this.h.clear();
        this.f23770j.clear();
        this.f23771k.clear();
        this.f23772l.clear();
        this.f23773m.clear();
        this.f23774n.clear();
        this.f23775o.clear();
        this.f23776p.clear();
        this.f23777q = "";
        this.M = iz.W0;
        this.N = g0.f22543p;
        this.f23782w.setTextSize(g0.L(iz.W0));
        this.f23783x.setTextSize(g0.L(iz.W0));
        this.d = false;
        this.f23765c = null;
        ij ijVar = this.f23764b;
        if (ijVar != null && ijVar.f23244k != null && ijVar.E0() != null) {
            TL_iv.RichMessage E0 = ijVar.E0();
            this.f23765c = E0;
            this.d = E0.part;
            this.P = kvVar;
            for (int i12 = 0; i12 < this.f23765c.blocks.size(); i12++) {
                TL_iv.PageBlock pageBlock = this.f23765c.blocks.get(i12);
                fu j3 = j(pageBlock, 0, new Rect(), 0, O(i12, this.f23765c.blocks));
                if ((j3 instanceof zu) && (((z11 = pageBlock instanceof TL_iv.pageBlockParagraph)) || org.telegram.ui.g4.I(pageBlock))) {
                    zu zuVar = (zu) j3;
                    if (i12 == 0 && z11) {
                        i7 = 0;
                    } else {
                        i7 = zuVar.Z;
                    }
                    if (i12 == this.f23765c.blocks.size() - 1) {
                        i10 = 0;
                    } else {
                        i10 = zuVar.f26922a0;
                    }
                    zuVar.j0(i7, i10);
                }
            }
            for (int i13 = 0; i13 < arrayList.size(); i13++) {
                fu fuVar2 = (fu) arrayList.get(i13);
                if ((fuVar2 instanceof zu) && fuVar2.f22458w > 0) {
                    if (i13 > 0 && ((fu) arrayList.get(i13 - 1)).f22458w > 0) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    int i14 = i13 + 1;
                    if (i14 < arrayList.size() && ((fu) arrayList.get(i14)).f22458w > 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    zu zuVar2 = (zu) fuVar2;
                    float f11 = 6.0f;
                    if (z9) {
                        f10 = 3.0f;
                    } else {
                        f10 = 6.0f;
                    }
                    int L = g0.L(f10);
                    if (z10) {
                        f11 = 3.0f;
                    }
                    zuVar2.j0(L, g0.L(f11));
                }
            }
            this.P = null;
            if (this.f23778r != null) {
                for (int i15 = 0; i15 < arrayList.size(); i15++) {
                    ((fu) arrayList.get(i15)).K = this.f23778r;
                }
                this.f23778r.k(p());
            }
            if (view != null) {
                for (int i16 = 0; i16 < arrayList.size(); i16++) {
                    ((fu) arrayList.get(i16)).m(view);
                }
            }
            Q();
            X();
        }
    }

    public final boolean L(TL_iv.RichMessage richMessage, int i7) {
        if (this.f23765c == richMessage && this.M == iz.W0 && Math.abs(this.N - g0.f22543p) <= 0.1f && i7 == this.B) {
            return false;
        }
        return true;
    }

    public final boolean M(android.view.MotionEvent r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.kv.M(android.view.MotionEvent):boolean");
    }

    public final ArrayList P(int i7) {
        ArrayList arrayList = new ArrayList();
        if (i7 >= 0) {
            ArrayList arrayList2 = this.h;
            int size = arrayList2.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList2.get(i10);
                i10++;
                bu buVar = (bu) obj;
                if (i7 >= buVar.f21697a && i7 <= buVar.f21698b) {
                    arrayList.add(buVar);
                }
            }
            Collections.sort(arrayList, new vj(14));
        }
        return arrayList;
    }

    public final void Q() {
        ArrayList arrayList;
        this.A = 0;
        this.C = 0;
        ArrayList arrayList2 = this.f23774n;
        arrayList2.clear();
        ArrayList arrayList3 = this.f23775o;
        arrayList3.clear();
        ArrayList arrayList4 = this.f23776p;
        arrayList4.clear();
        int i7 = 0;
        while (true) {
            arrayList = this.f23768g;
            if (i7 >= arrayList.size()) {
                break;
            }
            this.C = Math.max(this.C, ((fu) arrayList.get(i7)).K());
            i7++;
        }
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            fu fuVar = (fu) arrayList.get(i10);
            if (fuVar instanceof yu) {
                yu yuVar = (yu) fuVar;
                int i11 = this.C;
                int i12 = yuVar.f26727e0;
                int i13 = yuVar.f26726d0;
                Rect rect = yuVar.f22451b;
                int max = Math.max(i12, Math.min(i13, Math.max(0, (i11 - rect.left) - rect.right)));
                yuVar.f26728f0 = max;
                mx0 mx0Var = yuVar.X;
                mx0Var.setRenderWidth(max);
                yuVar.f26729g0 = mx0Var.getRenderHeight();
            }
        }
        StringBuilder sb2 = new StringBuilder();
        int i14 = 0;
        for (int i15 = 0; i15 < arrayList.size(); i15++) {
            fu fuVar2 = (fu) arrayList.get(i15);
            boolean S = fuVar2.S();
            fuVar2.M = i14;
            fuVar2.N = 0;
            fuVar2.Q = S;
            Rect rect2 = fuVar2.f22451b;
            fuVar2.Z(rect2.left, rect2.top + i14, i15);
            if (S) {
                org.telegram.ui.Cells.t9[] L = fuVar2.L();
                if (L != null) {
                    for (org.telegram.ui.Cells.t9 t9Var : L) {
                        if (t9Var != null && t9Var.a() != null) {
                            if (sb2.length() > 0) {
                                sb2.append('\n');
                            }
                            arrayList3.add(Integer.valueOf(sb2.length()));
                            arrayList4.add(Integer.valueOf(i15));
                            arrayList2.add(t9Var);
                            CharSequence text = t9Var.a().getText();
                            if (text != null) {
                                sb2.append(text);
                            }
                        }
                    }
                }
                int I = fuVar2.I();
                fuVar2.N = I;
                i14 += I;
            }
        }
        this.A = i14;
        this.f23777q = sb2;
    }

    public final void S(int i7, int i10) {
        if (this.S != i7 || this.T != i10) {
            this.S = i7;
            this.T = i10;
            int i11 = 0;
            while (true) {
                ArrayList arrayList = this.f23768g;
                if (i11 < arrayList.size()) {
                    fu fuVar = (fu) arrayList.get(i11);
                    if (fuVar instanceof lu) {
                        lu luVar = (lu) fuVar;
                        jv jvVar = luVar.X;
                        jvVar.f23594c = (g0.L(53.0f) + (luVar.S - luVar.f22450a.S)) - jvVar.f23596f;
                    }
                    i11++;
                } else {
                    return;
                }
            }
        }
    }

    public final void T(org.telegram.ui.Cells.q1 q1Var, org.telegram.ui.Cells.l1 l1Var) {
        this.E = q1Var;
        this.F = l1Var;
    }

    public final void U(CharacterStyle characterStyle, final SpannableStringBuilder spannableStringBuilder, int i7, int i10) {
        if (characterStyle instanceof gv) {
            int i11 = ((gv) characterStyle).f22729b;
            gv[] gvVarArr = (gv[]) spannableStringBuilder.getSpans(i7, i10, gv.class);
            if (gvVarArr != null && gvVarArr.length > 0) {
                Arrays.sort(gvVarArr, Comparator$CC.comparingInt(new ToIntFunction() {
                    @Override
                    public final int applyAsInt(Object obj) {
                        return spannableStringBuilder.getSpanStart((gv) obj);
                    }
                }));
                for (int i12 = 0; i12 < gvVarArr.length; i12++) {
                    int spanStart = spannableStringBuilder.getSpanStart(gvVarArr[i12]);
                    int spanEnd = spannableStringBuilder.getSpanEnd(gvVarArr[i12]);
                    if (spanStart > i7) {
                        V(spannableStringBuilder, i7, spanStart, i11);
                    }
                    i7 = Math.max(i7, spanEnd);
                }
                if (i7 < i10) {
                    V(spannableStringBuilder, i7, i10, i11);
                    return;
                }
                return;
            }
            V(spannableStringBuilder, i7, i10, i11);
            return;
        }
        spannableStringBuilder.setSpan(characterStyle, i7, i10, 33);
    }

    public final void V(SpannableStringBuilder spannableStringBuilder, int i7, int i10, int i11) {
        boolean z9;
        while (i7 < i10) {
            int nextSpanTransition = spannableStringBuilder.nextSpanTransition(i7, i10, URLSpan.class);
            if (((URLSpan[]) spannableStringBuilder.getSpans(i7, nextSpanTransition, URLSpan.class)).length > 0) {
                z9 = true;
            } else {
                z9 = false;
            }
            spannableStringBuilder.setSpan(new gv(this, i11, z9), i7, nextSpanTransition, 33);
            i7 = nextSpanTransition;
        }
    }

    public final void W(tg0 tg0Var) {
        this.f23778r = tg0Var;
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.f23768g;
            if (i7 < arrayList.size()) {
                ((fu) arrayList.get(i7)).K = tg0Var;
                arrayList.get(i7);
                ((fu) arrayList.get(i7)).getClass();
                i7++;
            } else {
                return;
            }
        }
    }

    public final void X() {
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.f23768g;
            if (i7 < arrayList.size()) {
                ((fu) arrayList.get(i7)).d0();
                i7++;
            } else {
                return;
            }
        }
    }

    public final boolean Y() {
        ArrayList arrayList = this.f23768g;
        if (arrayList.isEmpty()) {
            return false;
        }
        fu fuVar = (fu) arrayList.get(0);
        if (!(fuVar instanceof su) && !(fuVar instanceof ev) && !(fuVar instanceof ku) && !(fuVar instanceof wu) && !(fuVar instanceof ck0)) {
            return false;
        }
        return true;
    }

    public final void b(View view) {
        View view2 = this.Q;
        if (view != view2) {
            if (view2 != null) {
                f(view2);
            }
            this.Q = view;
            int i7 = 0;
            while (true) {
                ArrayList arrayList = this.f23768g;
                if (i7 < arrayList.size()) {
                    ((fu) arrayList.get(i7)).m(view);
                    i7++;
                } else {
                    return;
                }
            }
        }
    }

    public final void b0(int i7) {
        jv jvVar;
        View view;
        boolean z9;
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f23774n;
            if (i10 < arrayList.size()) {
                org.telegram.ui.Cells.t9 t9Var = (org.telegram.ui.Cells.t9) arrayList.get(i10);
                if ((t9Var instanceof jv) && (view = (jvVar = (jv) t9Var).S) != null) {
                    org.telegram.ui.Components.r5.release(view, jvVar.E);
                    jvVar.E = null;
                    View view2 = jvVar.S;
                    if (jvVar.f23592a.v && !jvVar.f23600w) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    jvVar.E = org.telegram.ui.Components.r5.update(i7, view2, z9, (org.telegram.ui.Components.n5) null, jvVar.f23593b);
                }
                i10++;
            } else {
                return;
            }
        }
    }

    public final void c(org.telegram.tgnet.TLRPC.Chat r10, org.telegram.tgnet.TLRPC.User r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.kv.c(org.telegram.tgnet.TLRPC$Chat, org.telegram.tgnet.TLRPC$User):void");
    }

    public final void f(View view) {
        View view2 = this.Q;
        if (view2 == view && view2 != null) {
            xh.e eVar = this.R;
            if (eVar != null) {
                eVar.b(view);
                this.R = null;
            }
            this.Q = null;
            int i7 = 0;
            while (true) {
                ArrayList arrayList = this.f23768g;
                if (i7 >= arrayList.size()) {
                    break;
                }
                fu fuVar = (fu) arrayList.get(i7);
                View view3 = fuVar.V;
                if (view3 != null && view3 == view) {
                    fuVar.V();
                    CheckBoxBase checkBoxBase = fuVar.f22456r;
                    if (checkBoxBase != null) {
                        checkBoxBase.f31254l = false;
                    }
                    fuVar.V = null;
                }
                i7++;
            }
            if (view == this.E) {
                this.E = null;
                this.F = null;
            }
        }
    }

    public final void g(Canvas canvas, int i7, int i10, org.telegram.ui.Cells.x1 x1Var) {
        int i11;
        boolean z9;
        float f10;
        float f11;
        int i12;
        int i13;
        boolean z10;
        org.telegram.ui.Cells.l1 l1Var;
        S(i7, i10);
        if (E()) {
            i11 = org.telegram.ui.ActionBar.k6.Vc;
        } else {
            i11 = org.telegram.ui.ActionBar.k6.Uc;
        }
        this.f23782w.linkColor = org.telegram.ui.ActionBar.k6.w0(i11, this.D);
        boolean z11 = this.d;
        int min = Math.min(this.A, g0.L(900.0f));
        if (z11) {
            canvas.saveLayerAlpha(-i7, 0.0f, this.C + i10, min, 255, 31);
        }
        org.telegram.ui.Cells.q1 q1Var = this.E;
        boolean z12 = false;
        if (q1Var != null && q1Var.f29979qc > 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (z9) {
            float f12 = q1Var.f29953oc - q1Var.f30006t0;
            f11 = q1Var.f29979qc + f12;
            f10 = f12;
        } else {
            f10 = 0.0f;
            f11 = 0.0f;
        }
        h(canvas, x1Var, z9, f10, f11);
        if (z11) {
            RectF rectF = g0.P;
            rectF.set(-i7, min - g0.L(32.0f), this.C + i10, min);
            this.f23785z.m(canvas, rectF, 3, 1.0f);
            canvas.restore();
            if (E()) {
                i12 = org.telegram.ui.ActionBar.k6.Lb;
            } else {
                i12 = org.telegram.ui.ActionBar.k6.f28247yd;
            }
            int w02 = org.telegram.ui.ActionBar.k6.w0(i12, this.D);
            if (this.I == null) {
                this.I = new my0(hd.M0(2131745340, null), 16.0f, g0.o());
            }
            org.telegram.ui.Components.ic icVar = this.G;
            if (icVar == null) {
                this.G = new org.telegram.ui.Components.ic(this.Q, 1.5f, 2.0f);
            } else {
                View view = icVar.f34579a;
                View view2 = this.Q;
                if (view != view2) {
                    icVar.f34579a = view2;
                }
            }
            if (this.H == null) {
                this.H = new Paint(1);
            }
            this.H.setColor(org.telegram.ui.ActionBar.k6.r1(0.1f, w02));
            float f13 = this.I.f36125c;
            int i14 = this.C;
            float f14 = (((i14 + i13) + this.T) / 2.0f) - this.S;
            float L = g0.L(4.0f) + min;
            float L2 = (((this.C + this.S) + this.T) - g0.L(24.0f)) / 2.0f;
            RectF rectF2 = this.K;
            rectF2.set(f14 - L2, L, f14 + L2, g0.L(42.0f) + L);
            org.telegram.ui.Cells.q1 q1Var2 = this.E;
            if (q1Var2 != null && (l1Var = this.F) != null && l1Var.p1(q1Var2, 7)) {
                z10 = true;
            } else {
                z10 = false;
            }
            a80 a80Var = this.J;
            if (a80Var != null && !z10 && !a80Var.c() && !this.J.d()) {
                this.J.a();
            }
            a80 a80Var2 = this.J;
            if (a80Var2 == null && z10) {
                a80 a80Var3 = new a80();
                this.J = a80Var3;
                a80Var3.f31742x.setStrokeWidth(g0.L(1.25f));
                this.J.D = true;
            } else if (a80Var2 != null && z10 && (a80Var2.c() || this.J.d())) {
                a80 a80Var4 = this.J;
                a80Var4.f31723b = -1L;
                a80Var4.f31724c = -1L;
            }
            a80 a80Var5 = this.J;
            if (a80Var5 != null) {
                a80Var5.g(org.telegram.ui.ActionBar.k6.r1(0.1f, w02), org.telegram.ui.ActionBar.k6.r1(0.3f, w02), org.telegram.ui.ActionBar.k6.r1(0.3f, w02), org.telegram.ui.ActionBar.k6.r1(1.2f, w02));
            }
            float a10 = this.G.a(0.075f);
            if (a10 != 1.0f) {
                z12 = true;
            }
            if (z12) {
                canvas.save();
                canvas.scale(a10, a10, rectF2.centerX(), rectF2.centerY());
            }
            canvas.drawRoundRect(rectF2, g0.L(8.0f), g0.L(8.0f), this.H);
            a80 a80Var6 = this.J;
            if (a80Var6 != null && !a80Var6.c()) {
                this.J.e(rectF2);
                this.J.k(8.0f);
                this.J.draw(canvas);
                View view3 = this.Q;
                if (view3 != null) {
                    view3.invalidate();
                }
            }
            this.I.c(rectF2.centerX() - (f13 / 2.0f), rectF2.centerY(), 1.0f, w02, canvas);
            if (z12) {
                canvas.restore();
            }
        }
    }

    public final void h(Canvas canvas, org.telegram.ui.Cells.x1 x1Var, boolean z9, float f10, float f11) {
        boolean z10;
        float f12;
        View view;
        float f13;
        float f14;
        boolean z11;
        boolean z12;
        float f15;
        float f16;
        float T1;
        Canvas canvas2;
        lu luVar;
        float f17;
        float f18;
        float f19;
        int i7;
        int i10;
        boolean z13;
        float f20;
        float f21;
        float f22;
        int I;
        float f23;
        float f24;
        int i11;
        float f25;
        int I2;
        int i12;
        Canvas canvas3 = canvas;
        float f26 = 0.0f;
        float f27 = 1.0f;
        int i13 = 0;
        if (!this.h.isEmpty()) {
            ArrayList arrayList = this.h;
            int size = arrayList.size();
            int i14 = 0;
            while (i14 < size) {
                int i15 = i14 + 1;
                bu buVar = (bu) arrayList.get(i14);
                int r10 = r(buVar.f21697a, x1Var);
                int i16 = buVar.f21698b;
                ArrayList arrayList2 = this.f23768g;
                float f28 = 4.0f;
                if (i16 >= 0 && i16 < arrayList2.size() && x1Var != null && (this.f23779s || this.f23781u)) {
                    float max = Math.max(f26, Math.min(f27, x1Var.L1));
                    fu fuVar = (fu) arrayList2.get(i16);
                    int e10 = jg.g.e(4.0f, fuVar.f22451b.bottom, i13);
                    float f29 = fuVar.O + fuVar.P;
                    if (fuVar.R) {
                        i12 = e10;
                    } else {
                        i12 = i13;
                    }
                    float f30 = f29 - i12;
                    float f31 = fuVar.M + fuVar.N;
                    if (!fuVar.Q) {
                        e10 = i13;
                    }
                    i11 = Math.round(g0.T1(f30, f31 - e10, max));
                } else {
                    int i17 = i13;
                    int i18 = i17;
                    while (true) {
                        if (i17 < arrayList2.size()) {
                            fu fuVar2 = (fu) arrayList2.get(i17);
                            boolean S = fuVar2.S();
                            float f32 = f28;
                            Rect rect = fuVar2.f22451b;
                            if (S) {
                                if (x1Var != null && (this.f23779s || this.f23781u)) {
                                    I2 = g0.W1(Math.max(0.0f, Math.min(f27, x1Var.L1)), fuVar2.P, fuVar2.N);
                                } else {
                                    I2 = fuVar2.I();
                                }
                                int i19 = I2 + i18;
                                if (i17 == i16 && rect.bottom > g0.L(f32)) {
                                    f25 = f32;
                                    i18 = k5.B(f25, rect.bottom, i19);
                                } else {
                                    f25 = f32;
                                    i18 = i19;
                                }
                            } else {
                                f25 = f32;
                            }
                            if (i17 == i16) {
                                i11 = i18;
                                break;
                            }
                            if (S) {
                            }
                            i17++;
                            f28 = f25;
                            f27 = 1.0f;
                        } else {
                            i11 = this.A;
                            break;
                        }
                    }
                }
                int i20 = buVar.f21698b;
                ArrayList arrayList3 = this.f23768g;
                float f33 = 1.0f;
                for (int i21 = buVar.f21697a; i21 < Math.min(i20 + 1, arrayList3.size()); i21++) {
                    fu fuVar3 = (fu) arrayList3.get(i21);
                    if (fuVar3.S()) {
                        f33 = fuVar3.z() * f33;
                    }
                }
                int L = g0.L(3.0f) * buVar.d;
                int i22 = buVar.f21700e + L;
                int i23 = L + buVar.f21701f;
                if (i11 - r10 > i22 + i23) {
                    r10 += i22;
                    i11 -= i23;
                }
                RectF rectF = g0.P;
                rectF.set(buVar.f21699c, r10, this.C - g0.L(buVar.d * 12), i11);
                canvas3.save();
                canvas3.scale(f33, f33, rectF.centerX(), rectF.centerY());
                float floor = (float) Math.floor(iz.Y0 / 3.0f);
                this.f23784y.d(canvas3, rectF, floor, floor, floor, 1.0f, false, false);
                this.f23784y.f(canvas3, rectF, 1.0f);
                canvas3.restore();
                size = size;
                i14 = i15;
                f26 = 0.0f;
                f27 = 1.0f;
                i13 = 0;
            }
        }
        int i24 = 0;
        while (i24 < this.f23768g.size()) {
            fu fuVar4 = (fu) this.f23768g.get(i24);
            if ((fuVar4 instanceof uu) && (fuVar4.Q || fuVar4.R)) {
                uu uuVar = (uu) fuVar4;
                int r11 = uuVar.W.r();
                jv jvVar = uuVar.X;
                if (jvVar != null) {
                    i10 = jvVar.r();
                } else {
                    i10 = 0;
                }
                int max2 = Math.max(r11, i10);
                if (max2 > 0) {
                    if (x1Var != null && (this.f23779s || this.f23781u)) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if (z13) {
                        f20 = Math.max(0.0f, Math.min(1.0f, x1Var.L1));
                    } else {
                        f20 = 1.0f;
                    }
                    if (z13) {
                        if (uuVar.R) {
                            f23 = 1.0f;
                        } else {
                            f23 = 0.0f;
                        }
                        if (uuVar.Q) {
                            f24 = 1.0f;
                        } else {
                            f24 = 0.0f;
                        }
                        f21 = g0.T1(f23, f24, f20);
                    } else if (uuVar.Q) {
                        f21 = 1.0f;
                    } else {
                        f21 = 0.0f;
                    }
                    if (f21 > 0.0f) {
                        float f34 = ((this.C + this.T) - this.S) / 2.0f;
                        float f35 = max2 / 2.0f;
                        float L2 = (f34 - f35) - g0.L(30.0f);
                        float L3 = f34 + f35 + g0.L(30.0f);
                        if (z13) {
                            f22 = g0.T1(uuVar.O, uuVar.M, f20);
                        } else {
                            f22 = uuVar.M;
                        }
                        if (z13) {
                            I = g0.W1(f20, uuVar.P, uuVar.N);
                        } else {
                            I = uuVar.I();
                        }
                        float L4 = g0.L(8.0f) + f22;
                        float L5 = (f22 + I) - g0.L(8.0f);
                        if (L5 > L4) {
                            RectF rectF2 = g0.P;
                            rectF2.set(L2, L4, L3, L5);
                            float floor2 = (float) Math.floor(iz.Y0 / 2.0f);
                            this.f23784y.d(canvas3, rectF2, floor2, floor2, floor2, f21, false, false);
                            if (this.f23769i == null) {
                                this.f23769i = t0.f25563b.getDrawable(2131231966).mutate();
                            }
                            this.f23769i.setColorFilter(this.f23784y.i(), PorterDuff.Mode.SRC_IN);
                            this.f23769i.setAlpha((int) (f21 * 255.0f));
                            int intrinsicWidth = this.f23769i.getIntrinsicWidth();
                            int intrinsicHeight = this.f23769i.getIntrinsicHeight();
                            canvas3.save();
                            canvas3.clipRect(L2, L4, L3, L5);
                            int i25 = (int) L2;
                            int i26 = (int) L4;
                            i7 = i24;
                            this.f23769i.setBounds(g0.L(8.0f) + i25, g0.L(7.0f) + i26, k5.C(8.0f, i25, intrinsicWidth), k5.C(7.0f, i26, intrinsicHeight));
                            canvas3.scale(-1.0f, -1.0f, this.f23769i.getBounds().centerX(), this.f23769i.getBounds().centerY());
                            this.f23769i.draw(canvas3);
                            canvas3.restore();
                            canvas3.save();
                            canvas3.clipRect(L2, L4, L3, L5);
                            int i27 = (int) L3;
                            int i28 = (int) L5;
                            this.f23769i.setBounds(k5.z(8.0f, i27, intrinsicWidth), k5.z(7.0f, i28, intrinsicHeight), i27 - g0.L(8.0f), i28 - g0.L(7.0f));
                            canvas3.scale(1.0f, -1.0f, this.f23769i.getBounds().centerX(), this.f23769i.getBounds().centerY());
                            this.f23769i.draw(canvas3);
                            canvas3.restore();
                            this.f23769i.setAlpha(255);
                            i24 = i7 + 1;
                        }
                    }
                }
            }
            i7 = i24;
            i24 = i7 + 1;
        }
        ij ijVar = this.f23764b;
        if (!this.O && (ijVar == null || !qp.s1(this.f23763a).f24889s7.A(ijVar))) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (!z10 && this.U == null) {
            this.V = 0.0f;
        } else {
            if (this.U == null) {
                this.U = new org.telegram.ui.Components.w5(0L, 350L, org.telegram.ui.Components.xq.h);
            }
            org.telegram.ui.Components.w5 w5Var = this.U;
            if (z10) {
                f12 = 1.0f;
            } else {
                f12 = 0.0f;
            }
            float e11 = w5Var.e(false, f12);
            this.V = e11;
            if (e11 > 0.0f && (view = this.Q) != null) {
                view.invalidate();
            }
        }
        if (x1Var == null || (!this.f23779s && !this.f23781u)) {
            f13 = 1.0f;
            f14 = 1.0f;
        } else {
            f13 = 1.0f;
            f14 = Math.max(0.0f, Math.min(1.0f, x1Var.L1));
        }
        this.f23780t = f14;
        int i29 = (f14 > f13 ? 1 : (f14 == f13 ? 0 : -1));
        if (i29 >= 0) {
            this.f23779s = false;
            this.f23781u = false;
        }
        boolean z14 = this.f23779s;
        if (!z14 && !this.f23781u) {
            z11 = z9;
        } else {
            z11 = false;
        }
        if (z14 && f14 < 1.0f) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (z12) {
            ArrayList arrayList4 = this.f23768g;
            for (int i30 = 0; i30 < arrayList4.size(); i30++) {
                fu fuVar5 = (fu) arrayList4.get(i30);
                if (fuVar5 instanceof lu) {
                    lu luVar2 = (lu) fuVar5;
                    luVar2.f23930d0 = g0.T1(luVar2.O, luVar2.M, f14) + luVar2.I();
                    int i31 = i30 + 1;
                    while (true) {
                        if (i31 < arrayList4.size()) {
                            fu fuVar6 = (fu) arrayList4.get(i31);
                            do {
                                fuVar6 = fuVar6.L;
                                if (fuVar6 == null) {
                                    f19 = g0.T1(((fu) arrayList4.get(i31)).O, ((fu) arrayList4.get(i31)).M, f14);
                                    break;
                                }
                            } while (fuVar6 != luVar2);
                            i31++;
                        } else {
                            f19 = Float.MAX_VALUE;
                            break;
                        }
                    }
                    luVar2.f23931e0 = f19;
                }
            }
        }
        ArrayList arrayList5 = this.f23768g;
        for (int i32 = 0; i32 < arrayList5.size(); i32++) {
            fu fuVar7 = (fu) arrayList5.get(i32);
            if (fuVar7 instanceof av) {
                av avVar = (av) fuVar7;
                if (avVar.f21532h0) {
                    f17 = 1.0f;
                } else {
                    f17 = 0.0f;
                }
                if (avVar.f21531g0) {
                    f18 = 1.0f;
                } else {
                    f18 = 0.0f;
                }
                avVar.f21533i0 = g0.T1(f17, f18, f14);
                avVar.f21534j0 = g0.W1(f14, avVar.P, avVar.N);
            }
        }
        int i33 = 0;
        while (i33 < this.f23768g.size()) {
            fu fuVar8 = (fu) this.f23768g.get(i33);
            if (fuVar8.Q || fuVar8.R) {
                float T12 = g0.T1(fuVar8.O, fuVar8.M, f14);
                boolean z15 = fuVar8 instanceof mu;
                if (z15) {
                    T1 = 1.0f;
                } else {
                    if (fuVar8.R) {
                        f15 = 1.0f;
                    } else {
                        f15 = 0.0f;
                    }
                    if (fuVar8.Q) {
                        f16 = 1.0f;
                    } else {
                        f16 = 0.0f;
                    }
                    T1 = g0.T1(f15, f16, f14);
                }
                if (T1 > 0.0f) {
                    int I3 = fuVar8.I();
                    if (!z11 || (I3 + T12 > f10 && T12 < f11)) {
                        canvas3.save();
                        if (z12 && (luVar = fuVar8.L) != null && !z15) {
                            float f36 = -3.4028235E38f;
                            float f37 = Float.MAX_VALUE;
                            for (luVar = fuVar8.L; luVar != null; luVar = luVar.L) {
                                f36 = Math.max(f36, luVar.f23930d0);
                                f37 = Math.min(f37, luVar.f23931e0);
                            }
                            if (f37 <= f36) {
                                canvas3.restore();
                            } else {
                                canvas3.clipRect(-this.S, f36, this.C + this.T, f37);
                            }
                        }
                        canvas3.translate(0.0f, T12);
                        if (T1 < 1.0f) {
                            canvas2 = canvas3;
                            int saveLayerAlpha = canvas2.saveLayerAlpha(-this.S, 0.0f, this.C + this.T, I3, (int) (T1 * 255.0f), 31);
                            fuVar8.t(canvas2);
                            canvas2.restoreToCount(saveLayerAlpha);
                        } else {
                            canvas2 = canvas3;
                            fuVar8.t(canvas2);
                        }
                        canvas2.restore();
                        i33++;
                        canvas3 = canvas2;
                    }
                }
            }
            canvas2 = canvas3;
            i33++;
            canvas3 = canvas2;
        }
        if (i29 >= 0) {
            X();
        }
    }

    public final void i(Canvas canvas, ColorFilter colorFilter) {
        if (F()) {
            int i7 = 0;
            while (true) {
                ArrayList arrayList = this.f23768g;
                if (i7 < arrayList.size()) {
                    fu fuVar = (fu) arrayList.get(i7);
                    if (fuVar.Q) {
                        canvas.save();
                        canvas.translate(0.0f, fuVar.M);
                        fuVar.s(canvas, colorFilter);
                        canvas.restore();
                    }
                    i7++;
                } else {
                    return;
                }
            }
        }
    }

    public final org.telegram.messenger.fu j(org.telegram.tgnet.tl.TL_iv.PageBlock r29, int r30, android.graphics.Rect r31, int r32, boolean r33) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.kv.j(org.telegram.tgnet.tl.TL_iv$PageBlock, int, android.graphics.Rect, int, boolean):org.telegram.messenger.fu");
    }

    public final void k(TL_iv.PageCaption pageCaption, Rect rect, int i7) {
        boolean z9;
        SpannableStringBuilder spannableStringBuilder;
        if (pageCaption != null) {
            TL_iv.RichText richText = pageCaption.text;
            boolean z10 = false;
            if (richText != null && !(richText instanceof TL_iv.textEmpty)) {
                z9 = true;
            } else {
                z9 = false;
            }
            TL_iv.RichText richText2 = pageCaption.credit;
            if (richText2 != null && !(richText2 instanceof TL_iv.textEmpty)) {
                z10 = true;
            }
            if (!z9 && !z10) {
                return;
            }
            int R = R(i7, 10);
            SpannableStringBuilder spannableStringBuilder2 = null;
            if (z9) {
                spannableStringBuilder = l(pageCaption.text, R);
            } else {
                spannableStringBuilder = null;
            }
            if (z10) {
                spannableStringBuilder2 = l(pageCaption.credit, R);
            }
            this.f23768g.add(new ju(this, rect, this.B, spannableStringBuilder, spannableStringBuilder2));
        }
    }

    public final SpannableStringBuilder l(TL_iv.RichText richText, int i7) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (i7 == 0) {
            m(richText, spannableStringBuilder, 0);
        } else {
            n(richText, spannableStringBuilder, i7, new gv(this, i7, false));
        }
        if (richText != null && spannableStringBuilder.length() > 0) {
            spannableStringBuilder.setSpan(new cu(richText, i7), 0, spannableStringBuilder.length(), 33);
        }
        return spannableStringBuilder;
    }

    public final void m(TL_iv.RichText richText, SpannableStringBuilder spannableStringBuilder, int i7) {
        CharSequence charSequence;
        Object size;
        int length = spannableStringBuilder.length();
        if (!(richText instanceof TL_iv.textEmpty)) {
            if (richText instanceof TL_iv.textPlain) {
                spannableStringBuilder.append(((TL_iv.textPlain) richText).text);
            } else {
                if (richText instanceof TL_iv.textDiff) {
                    TL_iv.textDiff textdiff = (TL_iv.textDiff) richText;
                    boolean j3 = li.c6.j(textdiff.text);
                    boolean j10 = li.c6.j(textdiff.old_text);
                    if (j3 && !j10) {
                        n(textdiff.old_text, spannableStringBuilder, i7, new vy0(z(8192), 0));
                    } else if (!j3 && j10) {
                        n(textdiff.text, spannableStringBuilder, i7, new vy0(z(4096), 0));
                    } else if (!j3) {
                        n(textdiff.text, spannableStringBuilder, i7, new eu0());
                    }
                } else if (richText instanceof TL_iv.textBold) {
                    int i10 = i7 | 16;
                    n(richText.text, spannableStringBuilder, i10, new gv(this, i10, false));
                } else if (richText instanceof TL_iv.textItalic) {
                    int i11 = i7 | 32;
                    n(richText.text, spannableStringBuilder, i11, new gv(this, i11, false));
                } else if (richText instanceof TL_iv.textUnderline) {
                    int i12 = i7 | 64;
                    n(richText.text, spannableStringBuilder, i12, new gv(this, i12, false));
                } else if (richText instanceof TL_iv.textStrike) {
                    int i13 = i7 | 128;
                    n(richText.text, spannableStringBuilder, i13, new gv(this, i13, false));
                } else if (richText instanceof TL_iv.textFixed) {
                    int i14 = i7 | 256;
                    n(richText.text, spannableStringBuilder, i14, new gv(this, i14, false));
                } else if (richText instanceof TL_iv.textUrl) {
                    n(richText.text, spannableStringBuilder, i7, new d41(((TL_iv.textUrl) richText).url, z(1024)));
                } else if (richText instanceof TL_iv.textEmail) {
                    TL_iv.RichText richText2 = richText.text;
                    n(richText2, spannableStringBuilder, i7, new d41("mailto:" + ((TL_iv.textEmail) richText).email, z(1024)));
                } else if (richText instanceof TL_iv.textConcat) {
                    for (int i15 = 0; i15 < richText.texts.size(); i15++) {
                        m(richText.texts.get(i15), spannableStringBuilder, i7);
                    }
                } else if (richText instanceof TL_iv.textSubscript) {
                    int i16 = i7 | 2048;
                    n(richText.text, spannableStringBuilder, i16, new gv(this, i16, false));
                } else if (richText instanceof TL_iv.textSuperscript) {
                    int i17 = i7 | 4096;
                    n(richText.text, spannableStringBuilder, i17, new gv(this, i17, false));
                } else if (richText instanceof TL_iv.textMarked) {
                    int i18 = i7 | 8192;
                    n(richText.text, spannableStringBuilder, i18, new gv(this, i18, false));
                } else if (richText instanceof TL_iv.textPhone) {
                    TL_iv.textPhone textphone = (TL_iv.textPhone) richText;
                    String d = pf.b.d(textphone.phone, false);
                    if (textphone.phone.startsWith("+")) {
                        d = rf.b.i("+", d);
                    }
                    n(richText.text, spannableStringBuilder, i7, new d41(rf.b.i("tel:", d), z(1024)));
                } else if (richText instanceof TL_iv.textAnchor) {
                    TL_iv.textAnchor textanchor = (TL_iv.textAnchor) richText;
                    String str = textanchor.name;
                    if (str != null) {
                        String lowerCase = str.toLowerCase();
                        if (!(textanchor.text instanceof TL_iv.textEmpty)) {
                            this.f23771k.put(lowerCase, textanchor);
                        } else {
                            HashMap hashMap = this.f23770j;
                            if (!hashMap.containsKey(lowerCase)) {
                                hashMap.put(lowerCase, Integer.valueOf(this.f23768g.size()));
                            }
                        }
                    }
                    TL_iv.RichText richText3 = richText.text;
                    String str2 = textanchor.name;
                    if (str2 != null) {
                        str2.toLowerCase();
                    }
                    n(richText3, spannableStringBuilder, i7, new fi.t9(3));
                } else {
                    int i19 = 4;
                    if (richText instanceof TL_iv.textMath) {
                        TL_iv.textMath textmath = (TL_iv.textMath) richText;
                        if (textmath.bitmap == null && !textmath.tried) {
                            textmath.tried = true;
                            li.q a10 = li.q.a(textmath.source, g0.L(this.M + 4), true);
                            if (a10 != null) {
                                textmath.f27180w = a10.f18779b;
                                textmath.h = a10.f18780c;
                                textmath.depth = a10.d;
                                textmath.bitmap = a10.f18778a;
                            }
                        }
                        if (textmath.bitmap != null) {
                            int length2 = spannableStringBuilder.length();
                            spannableStringBuilder.append(" ");
                            int length3 = spannableStringBuilder.length();
                            spannableStringBuilder.setSpan(new ny0(null, textmath.bitmap, textmath.f27180w, textmath.h, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.G6, this.D), textmath.depth), length2, length3, 33);
                            String str3 = textmath.source;
                            if (str3 != null && !str3.isEmpty()) {
                                spannableStringBuilder.setSpan(new org.telegram.ui.Cells.o9(textmath.source), length2, length3, 33);
                            }
                        }
                    } else {
                        float f10 = 1.2f;
                        if (richText instanceof TL_iv.textCustomEmoji) {
                            TL_iv.textCustomEmoji textcustomemoji = (TL_iv.textCustomEmoji) richText;
                            if (TextUtils.isEmpty(textcustomemoji.alt)) {
                                charSequence = "😀";
                            } else {
                                charSequence = textcustomemoji.alt;
                            }
                            int length4 = spannableStringBuilder.length();
                            spannableStringBuilder.append(charSequence);
                            int length5 = spannableStringBuilder.length();
                            boolean a11 = c8.zc.a(i7, 13);
                            int i20 = i7 & 15;
                            if (i20 >= 1 && i20 <= 6) {
                                TextPaint textPaint = new TextPaint(this.f23782w);
                                new gv(this, i7, true).a(textPaint);
                                size = new org.telegram.ui.Components.r5(textcustomemoji.document_id, 0.85f, textPaint.getFontMetricsInt());
                            } else {
                                long j11 = textcustomemoji.document_id;
                                if (a11) {
                                    f10 = 1.0f;
                                }
                                org.telegram.ui.Components.r5 r5Var = new org.telegram.ui.Components.r5(j11, f10, (Paint.FontMetricsInt) null);
                                int i21 = this.M + 4;
                                if (a11) {
                                    i19 = -2;
                                }
                                size = r5Var.setSize(g0.L(i21 + i19));
                            }
                            spannableStringBuilder.setSpan(size, length4, length5, 33);
                        } else if (richText instanceof TL_iv.textSpoiler) {
                            n(richText.text, spannableStringBuilder, i7, new vy0(z(256), 0));
                        } else if (richText instanceof TL_iv.textMention) {
                            TLRPC.TL_messageEntityMention tL_messageEntityMention = new TLRPC.TL_messageEntityMention();
                            ?? obj = new Object();
                            obj.d = tL_messageEntityMention;
                            n(richText.text, spannableStringBuilder, i7, new b41(x(richText), (uy0) obj));
                        } else if (richText instanceof TL_iv.textHashtag) {
                            TLRPC.TL_messageEntityHashtag tL_messageEntityHashtag = new TLRPC.TL_messageEntityHashtag();
                            ?? obj2 = new Object();
                            obj2.d = tL_messageEntityHashtag;
                            n(richText.text, spannableStringBuilder, i7, new b41(x(richText), (uy0) obj2));
                        } else if (richText instanceof TL_iv.textBotCommand) {
                            n(richText.text, spannableStringBuilder, i7, new y31(x(richText), E() ? 1 : 0, null));
                        } else if (richText instanceof TL_iv.textCashtag) {
                            TLRPC.TL_messageEntityCashtag tL_messageEntityCashtag = new TLRPC.TL_messageEntityCashtag();
                            ?? obj3 = new Object();
                            obj3.d = tL_messageEntityCashtag;
                            n(richText.text, spannableStringBuilder, i7, new b41(x(richText), (uy0) obj3));
                        } else if (richText instanceof TL_iv.textAutoUrl) {
                            n(richText.text, spannableStringBuilder, i7, new d41(x(richText), z(1024)));
                        } else if (richText instanceof TL_iv.textAutoEmail) {
                            n(richText.text, spannableStringBuilder, i7, new d41(rf.b.i("mailto:", x(richText)), z(1024)));
                        } else if (richText instanceof TL_iv.textAutoPhone) {
                            String x10 = x(richText);
                            String d2 = pf.b.d(x10, false);
                            if (x10.startsWith("+")) {
                                d2 = rf.b.i("+", d2);
                            }
                            n(richText.text, spannableStringBuilder, i7, new d41(rf.b.i("tel:", d2), z(1024)));
                        } else if (richText instanceof TL_iv.textTonAddress) {
                            n(richText.text, spannableStringBuilder, i7, new b41(rf.b.i("tonaddress:", x(richText)), (uy0) null));
                        } else if (richText instanceof TL_iv.textBankCard) {
                            n(richText.text, spannableStringBuilder, i7, new b41(rf.b.i("card:", x(richText)), (uy0) null));
                        } else if (richText instanceof TL_iv.textMentionName) {
                            TL_iv.RichText richText4 = richText.text;
                            n(richText4, spannableStringBuilder, i7, new e41("" + ((TL_iv.textMentionName) richText).user_id, E() ? 1 : 0, null));
                        } else if (richText instanceof TL_iv.textDate) {
                            TL_iv.textDate textdate = (TL_iv.textDate) richText;
                            TLRPC.TL_messageEntityFormattedDate tL_messageEntityFormattedDate = new TLRPC.TL_messageEntityFormattedDate();
                            tL_messageEntityFormattedDate.relative = textdate.relative;
                            tL_messageEntityFormattedDate.short_time = textdate.short_time;
                            tL_messageEntityFormattedDate.long_time = textdate.long_time;
                            tL_messageEntityFormattedDate.short_date = textdate.short_date;
                            tL_messageEntityFormattedDate.long_date = textdate.long_date;
                            tL_messageEntityFormattedDate.day_of_week = textdate.day_of_week;
                            tL_messageEntityFormattedDate.date = textdate.date;
                            int i22 = i7 | 512;
                            TL_iv.RichText richText5 = richText.text;
                            gv gvVar = new gv(this, i22, false);
                            org.telegram.ui.Components.zz zzVar = new org.telegram.ui.Components.zz(x(richText), null, tL_messageEntityFormattedDate);
                            int length6 = spannableStringBuilder.length();
                            m(richText5, spannableStringBuilder, i22);
                            if (spannableStringBuilder.length() > length6) {
                                U(gvVar, spannableStringBuilder, length6, spannableStringBuilder.length());
                                U(zzVar, spannableStringBuilder, length6, spannableStringBuilder.length());
                            }
                        } else if (richText instanceof TL_iv.textButton) {
                            int length7 = spannableStringBuilder.length();
                            spannableStringBuilder.append("*");
                            iu iuVar = new iu(this, this.B, (TL_iv.textButton) richText, null);
                            iuVar.d = 1.2f;
                            spannableStringBuilder.setSpan(iuVar, length7, spannableStringBuilder.length(), 33);
                        }
                    }
                }
            }
        }
        IdentityHashMap identityHashMap = this.Y;
        if (identityHashMap != null && richText != null) {
            identityHashMap.put(richText, new int[]{length, spannableStringBuilder.length()});
        }
    }

    public final void n(TL_iv.RichText richText, SpannableStringBuilder spannableStringBuilder, int i7, CharacterStyle characterStyle) {
        int length = spannableStringBuilder.length();
        m(richText, spannableStringBuilder, i7);
        if (spannableStringBuilder.length() > length) {
            U(characterStyle, spannableStringBuilder, length, spannableStringBuilder.length());
        }
    }

    public final SpannableStringBuilder o(TL_iv.RichText richText, int i7, IdentityHashMap identityHashMap) {
        IdentityHashMap identityHashMap2 = this.Y;
        this.Y = identityHashMap;
        try {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            m(richText, spannableStringBuilder, i7);
            return spannableStringBuilder;
        } finally {
            this.Y = identityHashMap2;
        }
    }

    public final ArrayList p() {
        ArrayList arrayList = this.f23768g;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            ((fu) arrayList.get(i7)).p(arrayList2);
        }
        for (int i10 = 0; i10 < arrayList2.size(); i10++) {
            ((rg0) arrayList2.get(i10)).getClass();
        }
        return arrayList2;
    }

    public final int r(int i7, org.telegram.ui.Cells.x1 x1Var) {
        int I;
        ArrayList arrayList = this.f23768g;
        if (i7 >= 0 && i7 < arrayList.size() && x1Var != null && (this.f23779s || this.f23781u)) {
            float max = Math.max(0.0f, Math.min(1.0f, x1Var.L1));
            fu fuVar = (fu) arrayList.get(i7);
            return Math.round(g0.T1(fuVar.O, fuVar.M, max));
        }
        int i10 = 0;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            fu fuVar2 = (fu) arrayList.get(i11);
            boolean S = fuVar2.S();
            if (i11 == i7) {
                return i10;
            }
            if (S) {
                if (x1Var != null && (this.f23779s || this.f23781u)) {
                    I = g0.W1(Math.max(0.0f, Math.min(1.0f, x1Var.L1)), fuVar2.P, fuVar2.N);
                } else {
                    I = fuVar2.I();
                }
                i10 = I + i10;
            }
        }
        return this.A;
    }

    public final TLRPC.Document s(long j3) {
        TL_iv.RichMessage richMessage = this.f23765c;
        if (richMessage == null) {
            return null;
        }
        ArrayList<TLRPC.Document> arrayList = richMessage.documents;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            TLRPC.Document document = arrayList.get(i7);
            i7++;
            TLRPC.Document document2 = document;
            if (document2.f26959id == j3) {
                return document2;
            }
        }
        return null;
    }

    public final int t() {
        int i7;
        if (this.d && this.A > g0.L(900.0f)) {
            return g0.L(950.0f);
        }
        int i10 = this.A;
        if (this.d) {
            i7 = g0.L(50.0f);
        } else {
            i7 = 0;
        }
        return i10 + i7;
    }

    public final int u() {
        return this.B;
    }

    public final TLRPC.Photo v(long j3) {
        TL_iv.RichMessage richMessage = this.f23765c;
        if (richMessage == null) {
            return null;
        }
        ArrayList<TLRPC.Photo> arrayList = richMessage.photos;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            TLRPC.Photo photo = arrayList.get(i7);
            i7++;
            TLRPC.Photo photo2 = photo;
            if (photo2.f26977id == j3) {
                return photo2;
            }
        }
        return null;
    }

    public final java.lang.String w(int r22, int r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.kv.w(int, int):java.lang.String");
    }

    public kv(int i7, int i10, org.telegram.ui.ActionBar.f6 f6Var) {
        this.f23766e = new ArrayList();
        this.f23767f = new ArrayList();
        this.f23768g = new ArrayList();
        this.h = new ArrayList();
        this.f23770j = new HashMap();
        this.f23771k = new HashMap();
        this.f23772l = new ArrayList();
        this.f23773m = new HashMap();
        this.f23774n = new ArrayList();
        this.f23775o = new ArrayList();
        this.f23776p = new ArrayList();
        this.f23777q = "";
        this.f23780t = 1.0f;
        TextPaint textPaint = new TextPaint(1);
        this.f23782w = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        this.f23783x = textPaint2;
        this.f23784y = new zj0(null);
        this.f23785z = new h6.m(28);
        this.K = new RectF();
        this.f23764b = null;
        this.f23763a = i7;
        this.B = i10;
        this.D = f6Var;
        int i11 = iz.W0;
        this.M = i11;
        this.N = g0.f22543p;
        textPaint.setTextSize(g0.L(i11));
        textPaint2.setTextSize(g0.L(this.M));
    }
}
