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
import org.telegram.ui.Components.a01;
import org.telegram.ui.Components.c51;
import org.telegram.ui.Components.el0;
import org.telegram.ui.Components.f51;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.hl0;
import org.telegram.ui.Components.hv0;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.qy0;
import org.telegram.ui.Components.rz0;
import org.telegram.ui.Components.sz0;
import org.telegram.ui.Components.t80;
import org.telegram.ui.Components.zz0;
import org.telegram.ui.vh0;
import org.telegram.ui.xh0;
public final class wv {
    public int A;
    public final int B;
    public int C;
    public org.telegram.ui.ActionBar.p6 D;
    public org.telegram.ui.Cells.q1 E;
    public org.telegram.ui.Cells.l1 F;
    public org.telegram.ui.Components.dc G;
    public Paint H;
    public rz0 I;
    public t80 J;
    public final RectF K;
    public boolean L;
    public int M;
    public float N;
    public boolean O;
    public wv P;
    public View Q;
    public nh.h R;
    public int S;
    public int T;
    public org.telegram.ui.Components.t5 U;
    public float V;
    public ru W;
    public int X;
    public IdentityHashMap Y;
    public final int f19329a;
    public final kj f19330b;
    public TL_iv.RichMessage f19331c;
    public boolean d;
    public final ArrayList e;
    public final ArrayList f19332f;
    public final ArrayList f19333g;
    public final ArrayList h;
    public Drawable f19334i;
    public final HashMap f19335j;
    public final HashMap f19336k;
    public final ArrayList f19337l;
    public final HashMap f19338m;
    public final ArrayList f19339n;
    public final ArrayList f19340o;
    public final ArrayList f19341p;
    public Object f19342q;
    public xh0 f19343r;
    public boolean f19344s;
    public float f19345t;
    public boolean f19346u;
    public boolean v;
    public final TextPaint f19347w;
    public final TextPaint f19348x;
    public final el0 f19349y;
    public final li.k f19350z;

    public wv(kj kjVar, int i10, wv wvVar) {
        this.e = new ArrayList();
        this.f19332f = new ArrayList();
        this.f19333g = new ArrayList();
        this.h = new ArrayList();
        this.f19335j = new HashMap();
        this.f19336k = new HashMap();
        this.f19337l = new ArrayList();
        this.f19338m = new HashMap();
        this.f19339n = new ArrayList();
        this.f19340o = new ArrayList();
        this.f19341p = new ArrayList();
        this.f19342q = "";
        this.f19345t = 1.0f;
        this.f19347w = new TextPaint(1);
        this.f19348x = new TextPaint(1);
        this.f19349y = new el0(null);
        this.f19350z = new li.k(23);
        this.K = new RectF();
        this.f19330b = kjVar;
        this.B = i10;
        this.f19329a = kjVar.I1;
        J(wvVar);
    }

    public static boolean A(TLRPC.PeerColor peerColor) {
        if ((peerColor instanceof TLRPC.TL_peerColorCollectible) || ((peerColor instanceof TLRPC.TL_peerColor) && (peerColor.flags & 1) != 0)) {
            return true;
        }
        return false;
    }

    public static float K(int i10, int i11, float[] fArr) {
        float f7 = 0.0f;
        while (i10 < i11) {
            f7 += fArr[i10];
            i10++;
        }
        return 1000 / Math.max(1.0E-4f, f7);
    }

    public static String N(TL_iv.pageBlockOrderedList pageblockorderedlist, TL_iv.PageListOrderedItem pageListOrderedItem, int i10) {
        if (!TextUtils.isEmpty(pageListOrderedItem.num)) {
            if (pageListOrderedItem.num.endsWith(".")) {
                return pageListOrderedItem.num;
            }
            return a1.g.r(new StringBuilder(), pageListOrderedItem.num, ".");
        } else if (TLObject.hasFlag(pageListOrderedItem.flags, 8)) {
            return a1.g.p(new StringBuilder(), pageListOrderedItem.value, ".");
        } else {
            if (TLObject.hasFlag(pageblockorderedlist.flags, 1)) {
                StringBuilder sb2 = new StringBuilder();
                int i11 = pageblockorderedlist.start;
                if (pageblockorderedlist.reversed) {
                    i10 = -i10;
                }
                sb2.append(i11 + i10);
                sb2.append(".");
                return sb2.toString();
            }
            return (i10 + 1) + ".";
        }
    }

    public static boolean O(int i10, List list) {
        if (i10 > 0 && (list.get(i10 - 1) instanceof TL_iv.pageBlockParagraph)) {
            return true;
        }
        return false;
    }

    public static int R(int i10, int i11) {
        if (i11 == 0) {
            return i10;
        }
        return (i10 & (-16)) | i11;
    }

    public static void Z(StringBuilder sb2, ArrayList arrayList, ArrayList arrayList2) {
        int i10 = 0;
        while (i10 < arrayList.size() && i10 < arrayList2.size() && arrayList.get(i10) == arrayList2.get(i10)) {
            i10++;
        }
        while (arrayList.size() > i10) {
            sb2.append("</blockquote>");
            arrayList.remove(arrayList.size() - 1);
        }
        while (arrayList.size() < arrayList2.size()) {
            sb2.append("<blockquote>");
            arrayList.add((nu) arrayList2.get(arrayList.size()));
        }
    }

    public static void a(StringBuilder sb2, CharSequence charSequence, int i10, int i11, boolean z10) {
        String str;
        String str2;
        if (i11 > i10) {
            SpannableStringBuilder a02 = a0(charSequence.subSequence(i10, i11));
            StringBuilder sb3 = new StringBuilder();
            bi.l4.g(sb3, a02);
            String sb4 = sb3.toString();
            if (sb4.isEmpty()) {
                return;
            }
            if (z10) {
                str = "<cite>";
            } else {
                str = "<p>";
            }
            sb2.append(str);
            sb2.append(sb4);
            if (z10) {
                str2 = "</cite>";
            } else {
                str2 = "</p>";
            }
            sb2.append(str2);
        }
    }

    public static SpannableStringBuilder a0(CharSequence charSequence) {
        sv[] svVarArr;
        int i10;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
        for (sv svVar : (sv[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), sv.class)) {
            int spanStart = spannableStringBuilder.getSpanStart(svVar);
            int spanEnd = spannableStringBuilder.getSpanEnd(svVar);
            if (spanEnd > spanStart) {
                int i11 = svVar.f18167b;
                if ((i11 & 16) != 0) {
                    i10 = 1;
                } else {
                    i10 = 0;
                }
                if ((i11 & 32) != 0) {
                    i10 |= 2;
                }
                if ((i11 & 64) != 0) {
                    i10 |= 16;
                }
                if ((i11 & 128) != 0) {
                    i10 |= 8;
                }
                if ((i11 & 256) != 0) {
                    i10 |= 4;
                }
                if ((i11 & 2048) != 0) {
                    i10 |= 16384;
                }
                if ((i11 & 4096) != 0) {
                    i10 |= 32768;
                }
                if ((i11 & 8192) != 0) {
                    i10 |= 65536;
                }
                if (i10 != 0) {
                    ?? obj = new Object();
                    obj.f33282a = i10;
                    spannableStringBuilder.setSpan(new a01(obj, 0), spanStart, spanEnd, 33);
                }
            }
        }
        return spannableStringBuilder;
    }

    public static void d(StringBuilder sb2, ArrayList arrayList) {
        String str;
        while (!arrayList.isEmpty()) {
            if (((Boolean) i0.a.v(1, arrayList)).booleanValue()) {
                str = "</ol>";
            } else {
                str = "</ul>";
            }
            sb2.append(str);
        }
    }

    public static org.telegram.messenger.cj[] e(float[] r34) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.wv.e(float[]):org.telegram.messenger.cj[]");
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
            if (!bi.s6.j(textdiff.text)) {
                y(textdiff.text, sb2);
            } else if (!bi.s6.j(textdiff.old_text)) {
                y(textdiff.old_text, sb2);
            }
        } else if (richText instanceof TL_iv.textConcat) {
            for (int i10 = 0; i10 < richText.texts.size(); i10++) {
                y(richText.texts.get(i10), sb2);
            }
        } else {
            TL_iv.RichText richText2 = richText.text;
            if (richText2 != null) {
                y(richText2, sb2);
            }
        }
    }

    public static zz0 z(int i10) {
        ?? obj = new Object();
        obj.f33282a = i10;
        return obj;
    }

    public final boolean B() {
        org.telegram.ui.Cells.q1 q1Var = this.E;
        if (q1Var != null && q1Var.Sa > 0) {
            return true;
        }
        return false;
    }

    public final boolean C() {
        org.telegram.ui.Components.k5 k5Var;
        if (F()) {
            int i10 = 0;
            while (true) {
                ArrayList arrayList = this.f19339n;
                if (i10 >= arrayList.size()) {
                    break;
                }
                org.telegram.ui.Cells.u9 u9Var = (org.telegram.ui.Cells.u9) arrayList.get(i10);
                if ((u9Var instanceof vv) && (k5Var = ((vv) u9Var).E) != null && !k5Var.f27728a.isEmpty()) {
                    return true;
                }
                i10++;
            }
        }
        return false;
    }

    public final boolean D() {
        kj kjVar = this.f19330b;
        if (kjVar != null && kjVar.P2() && !kjVar.P3()) {
            return true;
        }
        return false;
    }

    public final boolean E() {
        kj kjVar = this.f19330b;
        if (kjVar != null && kjVar.P3()) {
            return true;
        }
        return false;
    }

    public final boolean F() {
        xh0 xh0Var = this.f19343r;
        if (xh0Var != null && xh0Var.h) {
            return false;
        }
        return true;
    }

    public final boolean G() {
        org.telegram.ui.Cells.q1 q1Var = this.E;
        if (q1Var != null && q1Var.F2()) {
            return true;
        }
        return false;
    }

    public final boolean H() {
        org.telegram.ui.Cells.u9[] K;
        ru ruVar = this.W;
        if (ruVar != null && (K = ruVar.K()) != null) {
            for (org.telegram.ui.Cells.u9 u9Var : K) {
                if (u9Var instanceof vv) {
                    vv vvVar = (vv) u9Var;
                    if (vvVar.M != null || vvVar.Q != null) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final boolean I() {
        TL_iv.RichMessage richMessage = this.f19331c;
        if (richMessage != null && richMessage.rtl) {
            return true;
        }
        return false;
    }

    public final void J(wv wvVar) {
        boolean z10;
        boolean z11;
        float f7;
        boolean z12;
        int i10;
        int i11;
        this.A = 0;
        this.C = 0;
        View view = this.Q;
        ArrayList arrayList = this.f19333g;
        if (view != null) {
            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                ru ruVar = (ru) arrayList.get(i12);
                View view2 = ruVar.V;
                if (view2 != null && view2 == view) {
                    ruVar.U();
                    CheckBoxBase checkBoxBase = ruVar.f17972r;
                    if (checkBoxBase != null) {
                        checkBoxBase.f23915l = false;
                    }
                    ruVar.V = null;
                }
            }
        }
        this.e.clear();
        this.f19332f.clear();
        arrayList.clear();
        this.h.clear();
        this.f19335j.clear();
        this.f19336k.clear();
        this.f19337l.clear();
        this.f19338m.clear();
        this.f19339n.clear();
        this.f19340o.clear();
        this.f19341p.clear();
        this.f19342q = "";
        this.M = uz.W0;
        this.N = i0.f16171p;
        this.f19347w.setTextSize(i0.L(uz.W0));
        this.f19348x.setTextSize(i0.L(uz.W0));
        this.d = false;
        this.f19331c = null;
        kj kjVar = this.f19330b;
        if (kjVar != null && kjVar.f16690k != null && kjVar.E0() != null) {
            TL_iv.RichMessage E0 = kjVar.E0();
            this.f19331c = E0;
            this.d = E0.part;
            this.P = wvVar;
            for (int i13 = 0; i13 < this.f19331c.blocks.size(); i13++) {
                TL_iv.PageBlock pageBlock = this.f19331c.blocks.get(i13);
                ru j10 = j(pageBlock, 0, new Rect(), 0, O(i13, this.f19331c.blocks));
                if ((j10 instanceof lv) && (((z12 = pageBlock instanceof TL_iv.pageBlockParagraph)) || org.telegram.ui.h4.I(pageBlock))) {
                    lv lvVar = (lv) j10;
                    if (i13 == 0 && z12) {
                        i10 = 0;
                    } else {
                        i10 = lvVar.Z;
                    }
                    if (i13 == this.f19331c.blocks.size() - 1) {
                        i11 = 0;
                    } else {
                        i11 = lvVar.f17002a0;
                    }
                    lvVar.i0(i10, i11);
                }
            }
            for (int i14 = 0; i14 < arrayList.size(); i14++) {
                ru ruVar2 = (ru) arrayList.get(i14);
                if ((ruVar2 instanceof lv) && ruVar2.f17974w > 0) {
                    if (i14 > 0 && ((ru) arrayList.get(i14 - 1)).f17974w > 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    int i15 = i14 + 1;
                    if (i15 < arrayList.size() && ((ru) arrayList.get(i15)).f17974w > 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    lv lvVar2 = (lv) ruVar2;
                    float f10 = 6.0f;
                    if (z10) {
                        f7 = 3.0f;
                    } else {
                        f7 = 6.0f;
                    }
                    int L = i0.L(f7);
                    if (z11) {
                        f10 = 3.0f;
                    }
                    lvVar2.i0(L, i0.L(f10));
                }
            }
            this.P = null;
            if (this.f19343r != null) {
                for (int i16 = 0; i16 < arrayList.size(); i16++) {
                    ((ru) arrayList.get(i16)).K = this.f19343r;
                }
                this.f19343r.k(p());
            }
            if (view != null) {
                for (int i17 = 0; i17 < arrayList.size(); i17++) {
                    ((ru) arrayList.get(i17)).m(view);
                }
            }
            Q();
            X();
        }
    }

    public final boolean L(TL_iv.RichMessage richMessage, int i10) {
        if (this.f19331c == richMessage && this.M == uz.W0 && Math.abs(this.N - i0.f16171p) <= 0.1f && i10 == this.B) {
            return false;
        }
        return true;
    }

    public final boolean M(android.view.MotionEvent r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.wv.M(android.view.MotionEvent):boolean");
    }

    public final ArrayList P(int i10) {
        ArrayList arrayList = new ArrayList();
        if (i10 >= 0) {
            ArrayList arrayList2 = this.h;
            int size = arrayList2.size();
            int i11 = 0;
            while (i11 < size) {
                Object obj = arrayList2.get(i11);
                i11++;
                nu nuVar = (nu) obj;
                if (i10 >= nuVar.f17343a && i10 <= nuVar.f17344b) {
                    arrayList.add(nuVar);
                }
            }
            Collections.sort(arrayList, new ck(16));
        }
        return arrayList;
    }

    public final void Q() {
        ArrayList arrayList;
        this.A = 0;
        this.C = 0;
        ArrayList arrayList2 = this.f19339n;
        arrayList2.clear();
        ArrayList arrayList3 = this.f19340o;
        arrayList3.clear();
        ArrayList arrayList4 = this.f19341p;
        arrayList4.clear();
        int i10 = 0;
        while (true) {
            arrayList = this.f19333g;
            if (i10 >= arrayList.size()) {
                break;
            }
            this.C = Math.max(this.C, ((ru) arrayList.get(i10)).J());
            i10++;
        }
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            ru ruVar = (ru) arrayList.get(i11);
            if (ruVar instanceof kv) {
                kv kvVar = (kv) ruVar;
                int i12 = this.C;
                int i13 = kvVar.f16802e0;
                int i14 = kvVar.f16801d0;
                Rect rect = kvVar.f17968b;
                int max = Math.max(i13, Math.min(i14, Math.max(0, (i12 - rect.left) - rect.right)));
                kvVar.f16803f0 = max;
                qy0 qy0Var = kvVar.X;
                qy0Var.setRenderWidth(max);
                kvVar.f16804g0 = qy0Var.getRenderHeight();
            }
        }
        StringBuilder sb2 = new StringBuilder();
        int i15 = 0;
        for (int i16 = 0; i16 < arrayList.size(); i16++) {
            ru ruVar2 = (ru) arrayList.get(i16);
            boolean R = ruVar2.R();
            ruVar2.M = i15;
            ruVar2.N = 0;
            ruVar2.Q = R;
            Rect rect2 = ruVar2.f17968b;
            ruVar2.Y(rect2.left, rect2.top + i15, i16);
            if (R) {
                org.telegram.ui.Cells.u9[] K = ruVar2.K();
                if (K != null) {
                    for (org.telegram.ui.Cells.u9 u9Var : K) {
                        if (u9Var != null && u9Var.a() != null) {
                            if (sb2.length() > 0) {
                                sb2.append('\n');
                            }
                            arrayList3.add(Integer.valueOf(sb2.length()));
                            arrayList4.add(Integer.valueOf(i16));
                            arrayList2.add(u9Var);
                            CharSequence text = u9Var.a().getText();
                            if (text != null) {
                                sb2.append(text);
                            }
                        }
                    }
                }
                int H = ruVar2.H();
                ruVar2.N = H;
                i15 += H;
            }
        }
        this.A = i15;
        this.f19342q = sb2;
    }

    public final void S(int i10, int i11) {
        if (this.S != i10 || this.T != i11) {
            this.S = i10;
            this.T = i11;
            int i12 = 0;
            while (true) {
                ArrayList arrayList = this.f19333g;
                if (i12 < arrayList.size()) {
                    ru ruVar = (ru) arrayList.get(i12);
                    if (ruVar instanceof xu) {
                        xu xuVar = (xu) ruVar;
                        vv vvVar = xuVar.X;
                        vvVar.f18905c = (i0.L(53.0f) + (xuVar.S - xuVar.f17967a.S)) - vvVar.f18906f;
                    }
                    i12++;
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

    public final void U(CharacterStyle characterStyle, final SpannableStringBuilder spannableStringBuilder, int i10, int i11) {
        if (characterStyle instanceof sv) {
            int i12 = ((sv) characterStyle).f18167b;
            sv[] svVarArr = (sv[]) spannableStringBuilder.getSpans(i10, i11, sv.class);
            if (svVarArr != null && svVarArr.length > 0) {
                Arrays.sort(svVarArr, Comparator$CC.comparingInt(new ToIntFunction() {
                    @Override
                    public final int applyAsInt(Object obj) {
                        return spannableStringBuilder.getSpanStart((sv) obj);
                    }
                }));
                for (int i13 = 0; i13 < svVarArr.length; i13++) {
                    int spanStart = spannableStringBuilder.getSpanStart(svVarArr[i13]);
                    int spanEnd = spannableStringBuilder.getSpanEnd(svVarArr[i13]);
                    if (spanStart > i10) {
                        V(spannableStringBuilder, i10, spanStart, i12);
                    }
                    i10 = Math.max(i10, spanEnd);
                }
                if (i10 < i11) {
                    V(spannableStringBuilder, i10, i11, i12);
                    return;
                }
                return;
            }
            V(spannableStringBuilder, i10, i11, i12);
            return;
        }
        spannableStringBuilder.setSpan(characterStyle, i10, i11, 33);
    }

    public final void V(SpannableStringBuilder spannableStringBuilder, int i10, int i11, int i12) {
        boolean z10;
        while (i10 < i11) {
            int nextSpanTransition = spannableStringBuilder.nextSpanTransition(i10, i11, URLSpan.class);
            if (((URLSpan[]) spannableStringBuilder.getSpans(i10, nextSpanTransition, URLSpan.class)).length > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            spannableStringBuilder.setSpan(new sv(this, i12, z10), i10, nextSpanTransition, 33);
            i10 = nextSpanTransition;
        }
    }

    public final void W(xh0 xh0Var) {
        this.f19343r = xh0Var;
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f19333g;
            if (i10 < arrayList.size()) {
                ((ru) arrayList.get(i10)).K = xh0Var;
                arrayList.get(i10);
                ((ru) arrayList.get(i10)).getClass();
                i10++;
            } else {
                return;
            }
        }
    }

    public final void X() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f19333g;
            if (i10 < arrayList.size()) {
                ((ru) arrayList.get(i10)).c0();
                i10++;
            } else {
                return;
            }
        }
    }

    public final boolean Y() {
        ArrayList arrayList = this.f19333g;
        if (arrayList.isEmpty()) {
            return false;
        }
        ru ruVar = (ru) arrayList.get(0);
        if (!(ruVar instanceof ev) && !(ruVar instanceof qv) && !(ruVar instanceof wu) && !(ruVar instanceof iv) && !(ruVar instanceof hl0)) {
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
            int i10 = 0;
            while (true) {
                ArrayList arrayList = this.f19333g;
                if (i10 < arrayList.size()) {
                    ((ru) arrayList.get(i10)).m(view);
                    i10++;
                } else {
                    return;
                }
            }
        }
    }

    public final void b0(int i10) {
        vv vvVar;
        View view;
        boolean z10;
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.f19339n;
            if (i11 < arrayList.size()) {
                org.telegram.ui.Cells.u9 u9Var = (org.telegram.ui.Cells.u9) arrayList.get(i11);
                if ((u9Var instanceof vv) && (view = (vvVar = (vv) u9Var).S) != null) {
                    org.telegram.ui.Components.o5.release(view, vvVar.E);
                    vvVar.E = null;
                    View view2 = vvVar.S;
                    if (vvVar.f18903a.v && !vvVar.f18910w) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    vvVar.E = org.telegram.ui.Components.o5.update(i10, view2, z10, (org.telegram.ui.Components.k5) null, vvVar.f18904b);
                }
                i11++;
            } else {
                return;
            }
        }
    }

    public final void c(org.telegram.tgnet.TLRPC.Chat r10, org.telegram.tgnet.TLRPC.User r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.wv.c(org.telegram.tgnet.TLRPC$Chat, org.telegram.tgnet.TLRPC$User):void");
    }

    public final void f(View view) {
        View view2 = this.Q;
        if (view2 == view && view2 != null) {
            nh.h hVar = this.R;
            if (hVar != null) {
                hVar.b(view);
                this.R = null;
            }
            this.Q = null;
            int i10 = 0;
            while (true) {
                ArrayList arrayList = this.f19333g;
                if (i10 >= arrayList.size()) {
                    break;
                }
                ru ruVar = (ru) arrayList.get(i10);
                View view3 = ruVar.V;
                if (view3 != null && view3 == view) {
                    ruVar.U();
                    CheckBoxBase checkBoxBase = ruVar.f17972r;
                    if (checkBoxBase != null) {
                        checkBoxBase.f23915l = false;
                    }
                    ruVar.V = null;
                }
                i10++;
            }
            if (view == this.E) {
                this.E = null;
                this.F = null;
            }
        }
    }

    public final void g(Canvas canvas, int i10, int i11, org.telegram.ui.Cells.x1 x1Var) {
        int i12;
        boolean z10;
        float f7;
        float f10;
        int i13;
        int i14;
        boolean z11;
        org.telegram.ui.Cells.l1 l1Var;
        S(i10, i11);
        if (E()) {
            i12 = org.telegram.ui.ActionBar.t6.Vc;
        } else {
            i12 = org.telegram.ui.ActionBar.t6.Uc;
        }
        this.f19347w.linkColor = org.telegram.ui.ActionBar.t6.w0(i12, this.D);
        boolean z12 = this.d;
        int min = Math.min(this.A, i0.L(900.0f));
        if (z12) {
            canvas.saveLayerAlpha(-i10, 0.0f, this.C + i11, min, 255, 31);
        }
        org.telegram.ui.Cells.q1 q1Var = this.E;
        boolean z13 = false;
        if (q1Var != null && q1Var.f22686pc > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            float f11 = q1Var.f22662nc - q1Var.f22725t0;
            f10 = q1Var.f22686pc + f11;
            f7 = f11;
        } else {
            f7 = 0.0f;
            f10 = 0.0f;
        }
        h(canvas, x1Var, z10, f7, f10);
        if (z12) {
            RectF rectF = i0.P;
            rectF.set(-i10, min - i0.L(32.0f), this.C + i11, min);
            this.f19350z.o(canvas, rectF, 3, 1.0f);
            canvas.restore();
            if (E()) {
                i13 = org.telegram.ui.ActionBar.t6.Lb;
            } else {
                i13 = org.telegram.ui.ActionBar.t6.f21319yd;
            }
            int w02 = org.telegram.ui.ActionBar.t6.w0(i13, this.D);
            if (this.I == null) {
                this.I = new rz0(dd.L0(2131745357, null), 16.0f, i0.o());
            }
            org.telegram.ui.Components.dc dcVar = this.G;
            if (dcVar == null) {
                this.G = new org.telegram.ui.Components.dc(this.Q, 1.5f, 2.0f);
            } else {
                View view = dcVar.f25460a;
                View view2 = this.Q;
                if (view != view2) {
                    dcVar.f25460a = view2;
                }
            }
            if (this.H == null) {
                this.H = new Paint(1);
            }
            this.H.setColor(org.telegram.ui.ActionBar.t6.r1(0.1f, w02));
            float f12 = this.I.f30126c;
            int i15 = this.C;
            float f13 = (((i15 + i14) + this.T) / 2.0f) - this.S;
            float L = i0.L(4.0f) + min;
            float L2 = (((this.C + this.S) + this.T) - i0.L(24.0f)) / 2.0f;
            RectF rectF2 = this.K;
            rectF2.set(f13 - L2, L, f13 + L2, i0.L(42.0f) + L);
            org.telegram.ui.Cells.q1 q1Var2 = this.E;
            if (q1Var2 != null && (l1Var = this.F) != null && l1Var.k1(q1Var2, 7)) {
                z11 = true;
            } else {
                z11 = false;
            }
            t80 t80Var = this.J;
            if (t80Var != null && !z11 && !t80Var.c() && !this.J.d()) {
                this.J.a();
            }
            t80 t80Var2 = this.J;
            if (t80Var2 == null && z11) {
                t80 t80Var3 = new t80();
                this.J = t80Var3;
                t80Var3.f30592x.setStrokeWidth(i0.L(1.25f));
                this.J.D = true;
            } else if (t80Var2 != null && z11 && (t80Var2.c() || this.J.d())) {
                t80 t80Var4 = this.J;
                t80Var4.f30574b = -1L;
                t80Var4.f30575c = -1L;
            }
            t80 t80Var5 = this.J;
            if (t80Var5 != null) {
                t80Var5.g(org.telegram.ui.ActionBar.t6.r1(0.1f, w02), org.telegram.ui.ActionBar.t6.r1(0.3f, w02), org.telegram.ui.ActionBar.t6.r1(0.3f, w02), org.telegram.ui.ActionBar.t6.r1(1.2f, w02));
            }
            float a2 = this.G.a(0.075f);
            if (a2 != 1.0f) {
                z13 = true;
            }
            if (z13) {
                canvas.save();
                canvas.scale(a2, a2, rectF2.centerX(), rectF2.centerY());
            }
            canvas.drawRoundRect(rectF2, i0.L(8.0f), i0.L(8.0f), this.H);
            t80 t80Var6 = this.J;
            if (t80Var6 != null && !t80Var6.c()) {
                this.J.e(rectF2);
                this.J.k(8.0f);
                this.J.draw(canvas);
                View view3 = this.Q;
                if (view3 != null) {
                    view3.invalidate();
                }
            }
            this.I.c(rectF2.centerX() - (f12 / 2.0f), rectF2.centerY(), 1.0f, w02, canvas);
            if (z13) {
                canvas.restore();
            }
        }
    }

    public final void h(Canvas canvas, org.telegram.ui.Cells.x1 x1Var, boolean z10, float f7, float f10) {
        boolean z11;
        float f11;
        View view;
        float f12;
        float f13;
        boolean z12;
        boolean z13;
        float f14;
        float f15;
        float T1;
        Canvas canvas2;
        xu xuVar;
        float f16;
        float f17;
        float f18;
        int i10;
        int i11;
        boolean z14;
        float f19;
        float f20;
        float f21;
        int H;
        float f22;
        float f23;
        int i12;
        float f24;
        int H2;
        int i13;
        Canvas canvas3 = canvas;
        float f25 = 0.0f;
        float f26 = 1.0f;
        int i14 = 0;
        if (!this.h.isEmpty()) {
            ArrayList arrayList = this.h;
            int size = arrayList.size();
            int i15 = 0;
            while (i15 < size) {
                int i16 = i15 + 1;
                nu nuVar = (nu) arrayList.get(i15);
                int r10 = r(nuVar.f17343a, x1Var);
                int i17 = nuVar.f17344b;
                ArrayList arrayList2 = this.f19333g;
                float f27 = 4.0f;
                if (i17 >= 0 && i17 < arrayList2.size() && x1Var != null && (this.f19344s || this.f19346u)) {
                    float max = Math.max(f25, Math.min(f26, x1Var.L1));
                    ru ruVar = (ru) arrayList2.get(i17);
                    int d = i0.a.d(4.0f, ruVar.f17968b.bottom, i14);
                    float f28 = ruVar.O + ruVar.P;
                    if (ruVar.R) {
                        i13 = d;
                    } else {
                        i13 = i14;
                    }
                    float f29 = f28 - i13;
                    float f30 = ruVar.M + ruVar.N;
                    if (!ruVar.Q) {
                        d = i14;
                    }
                    i12 = Math.round(i0.T1(f29, f30 - d, max));
                } else {
                    int i18 = i14;
                    int i19 = i18;
                    while (true) {
                        if (i18 < arrayList2.size()) {
                            ru ruVar2 = (ru) arrayList2.get(i18);
                            boolean R = ruVar2.R();
                            float f31 = f27;
                            Rect rect = ruVar2.f17968b;
                            if (R) {
                                if (x1Var != null && (this.f19344s || this.f19346u)) {
                                    H2 = i0.W1(Math.max(0.0f, Math.min(f26, x1Var.L1)), ruVar2.P, ruVar2.N);
                                } else {
                                    H2 = ruVar2.H();
                                }
                                int i20 = H2 + i19;
                                if (i18 == i17 && rect.bottom > i0.L(f31)) {
                                    f24 = f31;
                                    i19 = m5.B(f24, rect.bottom, i20);
                                } else {
                                    f24 = f31;
                                    i19 = i20;
                                }
                            } else {
                                f24 = f31;
                            }
                            if (i18 == i17) {
                                i12 = i19;
                                break;
                            }
                            if (R) {
                            }
                            i18++;
                            f27 = f24;
                            f26 = 1.0f;
                        } else {
                            i12 = this.A;
                            break;
                        }
                    }
                }
                int i21 = nuVar.f17344b;
                ArrayList arrayList3 = this.f19333g;
                float f32 = 1.0f;
                for (int i22 = nuVar.f17343a; i22 < Math.min(i21 + 1, arrayList3.size()); i22++) {
                    ru ruVar3 = (ru) arrayList3.get(i22);
                    if (ruVar3.R()) {
                        f32 = ruVar3.z() * f32;
                    }
                }
                int L = i0.L(3.0f) * nuVar.d;
                int i23 = nuVar.e + L;
                int i24 = L + nuVar.f17346f;
                if (i12 - r10 > i23 + i24) {
                    r10 += i23;
                    i12 -= i24;
                }
                RectF rectF = i0.P;
                rectF.set(nuVar.f17345c, r10, this.C - i0.L(nuVar.d * 12), i12);
                canvas3.save();
                canvas3.scale(f32, f32, rectF.centerX(), rectF.centerY());
                float floor = (float) Math.floor(uz.Y0 / 3.0f);
                this.f19349y.d(canvas3, rectF, floor, floor, floor, 1.0f, false, false);
                this.f19349y.f(canvas3, rectF, 1.0f);
                canvas3.restore();
                size = size;
                i15 = i16;
                f25 = 0.0f;
                f26 = 1.0f;
                i14 = 0;
            }
        }
        int i25 = 0;
        while (i25 < this.f19333g.size()) {
            ru ruVar4 = (ru) this.f19333g.get(i25);
            if ((ruVar4 instanceof gv) && (ruVar4.Q || ruVar4.R)) {
                gv gvVar = (gv) ruVar4;
                int r11 = gvVar.W.r();
                vv vvVar = gvVar.X;
                if (vvVar != null) {
                    i11 = vvVar.r();
                } else {
                    i11 = 0;
                }
                int max2 = Math.max(r11, i11);
                if (max2 > 0) {
                    if (x1Var != null && (this.f19344s || this.f19346u)) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if (z14) {
                        f19 = Math.max(0.0f, Math.min(1.0f, x1Var.L1));
                    } else {
                        f19 = 1.0f;
                    }
                    if (z14) {
                        if (gvVar.R) {
                            f22 = 1.0f;
                        } else {
                            f22 = 0.0f;
                        }
                        if (gvVar.Q) {
                            f23 = 1.0f;
                        } else {
                            f23 = 0.0f;
                        }
                        f20 = i0.T1(f22, f23, f19);
                    } else if (gvVar.Q) {
                        f20 = 1.0f;
                    } else {
                        f20 = 0.0f;
                    }
                    if (f20 > 0.0f) {
                        float f33 = ((this.C + this.T) - this.S) / 2.0f;
                        float f34 = max2 / 2.0f;
                        float L2 = (f33 - f34) - i0.L(30.0f);
                        float L3 = f33 + f34 + i0.L(30.0f);
                        if (z14) {
                            f21 = i0.T1(gvVar.O, gvVar.M, f19);
                        } else {
                            f21 = gvVar.M;
                        }
                        if (z14) {
                            H = i0.W1(f19, gvVar.P, gvVar.N);
                        } else {
                            H = gvVar.H();
                        }
                        float L4 = i0.L(8.0f) + f21;
                        float L5 = (f21 + H) - i0.L(8.0f);
                        if (L5 > L4) {
                            RectF rectF2 = i0.P;
                            rectF2.set(L2, L4, L3, L5);
                            float floor2 = (float) Math.floor(uz.Y0 / 2.0f);
                            this.f19349y.d(canvas3, rectF2, floor2, floor2, floor2, f20, false, false);
                            if (this.f19334i == null) {
                                this.f19334i = w0.f18945b.getDrawable(2131231965).mutate();
                            }
                            this.f19334i.setColorFilter(this.f19349y.i(), PorterDuff.Mode.SRC_IN);
                            this.f19334i.setAlpha((int) (f20 * 255.0f));
                            int intrinsicWidth = this.f19334i.getIntrinsicWidth();
                            int intrinsicHeight = this.f19334i.getIntrinsicHeight();
                            canvas3.save();
                            canvas3.clipRect(L2, L4, L3, L5);
                            int i26 = (int) L2;
                            int i27 = (int) L4;
                            i10 = i25;
                            this.f19334i.setBounds(i0.L(8.0f) + i26, i0.L(7.0f) + i27, m5.C(8.0f, i26, intrinsicWidth), m5.C(7.0f, i27, intrinsicHeight));
                            canvas3.scale(-1.0f, -1.0f, this.f19334i.getBounds().centerX(), this.f19334i.getBounds().centerY());
                            this.f19334i.draw(canvas3);
                            canvas3.restore();
                            canvas3.save();
                            canvas3.clipRect(L2, L4, L3, L5);
                            int i28 = (int) L3;
                            int i29 = (int) L5;
                            this.f19334i.setBounds(m5.z(8.0f, i28, intrinsicWidth), m5.z(7.0f, i29, intrinsicHeight), i28 - i0.L(8.0f), i29 - i0.L(7.0f));
                            canvas3.scale(1.0f, -1.0f, this.f19334i.getBounds().centerX(), this.f19334i.getBounds().centerY());
                            this.f19334i.draw(canvas3);
                            canvas3.restore();
                            this.f19334i.setAlpha(255);
                            i25 = i10 + 1;
                        }
                    }
                }
            }
            i10 = i25;
            i25 = i10 + 1;
        }
        kj kjVar = this.f19330b;
        if (!this.O && (kjVar == null || !wp.r1(this.f19329a).f19253t7.A(kjVar))) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (!z11 && this.U == null) {
            this.V = 0.0f;
        } else {
            if (this.U == null) {
                this.U = new org.telegram.ui.Components.t5(0L, 350L, org.telegram.ui.Components.gr.h);
            }
            org.telegram.ui.Components.t5 t5Var = this.U;
            if (z11) {
                f11 = 1.0f;
            } else {
                f11 = 0.0f;
            }
            float e = t5Var.e(false, f11);
            this.V = e;
            if (e > 0.0f && (view = this.Q) != null) {
                view.invalidate();
            }
        }
        if (x1Var == null || (!this.f19344s && !this.f19346u)) {
            f12 = 1.0f;
            f13 = 1.0f;
        } else {
            f12 = 1.0f;
            f13 = Math.max(0.0f, Math.min(1.0f, x1Var.L1));
        }
        this.f19345t = f13;
        int i30 = (f13 > f12 ? 1 : (f13 == f12 ? 0 : -1));
        if (i30 >= 0) {
            this.f19344s = false;
            this.f19346u = false;
        }
        boolean z15 = this.f19344s;
        if (!z15 && !this.f19346u) {
            z12 = z10;
        } else {
            z12 = false;
        }
        if (z15 && f13 < 1.0f) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (z13) {
            ArrayList arrayList4 = this.f19333g;
            for (int i31 = 0; i31 < arrayList4.size(); i31++) {
                ru ruVar5 = (ru) arrayList4.get(i31);
                if (ruVar5 instanceof xu) {
                    xu xuVar2 = (xu) ruVar5;
                    xuVar2.f19480d0 = i0.T1(xuVar2.O, xuVar2.M, f13) + xuVar2.H();
                    int i32 = i31 + 1;
                    while (true) {
                        if (i32 < arrayList4.size()) {
                            ru ruVar6 = (ru) arrayList4.get(i32);
                            do {
                                ruVar6 = ruVar6.L;
                                if (ruVar6 == null) {
                                    f18 = i0.T1(((ru) arrayList4.get(i32)).O, ((ru) arrayList4.get(i32)).M, f13);
                                    break;
                                }
                            } while (ruVar6 != xuVar2);
                            i32++;
                        } else {
                            f18 = Float.MAX_VALUE;
                            break;
                        }
                    }
                    xuVar2.f19481e0 = f18;
                }
            }
        }
        ArrayList arrayList5 = this.f19333g;
        for (int i33 = 0; i33 < arrayList5.size(); i33++) {
            ru ruVar7 = (ru) arrayList5.get(i33);
            if (ruVar7 instanceof mv) {
                mv mvVar = (mv) ruVar7;
                if (mvVar.f17203h0) {
                    f16 = 1.0f;
                } else {
                    f16 = 0.0f;
                }
                if (mvVar.f17202g0) {
                    f17 = 1.0f;
                } else {
                    f17 = 0.0f;
                }
                mvVar.f17204i0 = i0.T1(f16, f17, f13);
                mvVar.f17205j0 = i0.W1(f13, mvVar.P, mvVar.N);
            }
        }
        int i34 = 0;
        while (i34 < this.f19333g.size()) {
            ru ruVar8 = (ru) this.f19333g.get(i34);
            if (ruVar8.Q || ruVar8.R) {
                float T12 = i0.T1(ruVar8.O, ruVar8.M, f13);
                boolean z16 = ruVar8 instanceof yu;
                if (z16) {
                    T1 = 1.0f;
                } else {
                    if (ruVar8.R) {
                        f14 = 1.0f;
                    } else {
                        f14 = 0.0f;
                    }
                    if (ruVar8.Q) {
                        f15 = 1.0f;
                    } else {
                        f15 = 0.0f;
                    }
                    T1 = i0.T1(f14, f15, f13);
                }
                if (T1 > 0.0f) {
                    int H3 = ruVar8.H();
                    if (!z12 || (H3 + T12 > f7 && T12 < f10)) {
                        canvas3.save();
                        if (z13 && (xuVar = ruVar8.L) != null && !z16) {
                            float f35 = -3.4028235E38f;
                            float f36 = Float.MAX_VALUE;
                            for (xuVar = ruVar8.L; xuVar != null; xuVar = xuVar.L) {
                                f35 = Math.max(f35, xuVar.f19480d0);
                                f36 = Math.min(f36, xuVar.f19481e0);
                            }
                            if (f36 <= f35) {
                                canvas3.restore();
                            } else {
                                canvas3.clipRect(-this.S, f35, this.C + this.T, f36);
                            }
                        }
                        canvas3.translate(0.0f, T12);
                        if (T1 < 1.0f) {
                            canvas2 = canvas3;
                            int saveLayerAlpha = canvas2.saveLayerAlpha(-this.S, 0.0f, this.C + this.T, H3, (int) (T1 * 255.0f), 31);
                            ruVar8.t(canvas2);
                            canvas2.restoreToCount(saveLayerAlpha);
                        } else {
                            canvas2 = canvas3;
                            ruVar8.t(canvas2);
                        }
                        canvas2.restore();
                        i34++;
                        canvas3 = canvas2;
                    }
                }
            }
            canvas2 = canvas3;
            i34++;
            canvas3 = canvas2;
        }
        if (i30 >= 0) {
            X();
        }
    }

    public final void i(Canvas canvas, ColorFilter colorFilter) {
        if (F()) {
            int i10 = 0;
            while (true) {
                ArrayList arrayList = this.f19333g;
                if (i10 < arrayList.size()) {
                    ru ruVar = (ru) arrayList.get(i10);
                    if (ruVar.Q) {
                        canvas.save();
                        canvas.translate(0.0f, ruVar.M);
                        ruVar.s(canvas, colorFilter);
                        canvas.restore();
                    }
                    i10++;
                } else {
                    return;
                }
            }
        }
    }

    public final org.telegram.messenger.ru j(org.telegram.tgnet.tl.TL_iv.PageBlock r29, int r30, android.graphics.Rect r31, int r32, boolean r33) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.wv.j(org.telegram.tgnet.tl.TL_iv$PageBlock, int, android.graphics.Rect, int, boolean):org.telegram.messenger.ru");
    }

    public final void k(TL_iv.PageCaption pageCaption, Rect rect, int i10) {
        boolean z10;
        SpannableStringBuilder spannableStringBuilder;
        if (pageCaption != null) {
            TL_iv.RichText richText = pageCaption.text;
            boolean z11 = false;
            if (richText != null && !(richText instanceof TL_iv.textEmpty)) {
                z10 = true;
            } else {
                z10 = false;
            }
            TL_iv.RichText richText2 = pageCaption.credit;
            if (richText2 != null && !(richText2 instanceof TL_iv.textEmpty)) {
                z11 = true;
            }
            if (!z10 && !z11) {
                return;
            }
            int R = R(i10, 10);
            SpannableStringBuilder spannableStringBuilder2 = null;
            if (z10) {
                spannableStringBuilder = l(pageCaption.text, R);
            } else {
                spannableStringBuilder = null;
            }
            if (z11) {
                spannableStringBuilder2 = l(pageCaption.credit, R);
            }
            this.f19333g.add(new vu(this, rect, this.B, spannableStringBuilder, spannableStringBuilder2));
        }
    }

    public final SpannableStringBuilder l(TL_iv.RichText richText, int i10) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (i10 == 0) {
            m(richText, spannableStringBuilder, 0);
        } else {
            n(richText, spannableStringBuilder, i10, new sv(this, i10, false));
        }
        if (richText != null && spannableStringBuilder.length() > 0) {
            spannableStringBuilder.setSpan(new ou(richText, i10), 0, spannableStringBuilder.length(), 33);
        }
        return spannableStringBuilder;
    }

    public final void m(TL_iv.RichText richText, SpannableStringBuilder spannableStringBuilder, int i10) {
        CharSequence charSequence;
        Object size;
        int length = spannableStringBuilder.length();
        if (!(richText instanceof TL_iv.textEmpty)) {
            if (richText instanceof TL_iv.textPlain) {
                spannableStringBuilder.append(((TL_iv.textPlain) richText).text);
            } else {
                if (richText instanceof TL_iv.textDiff) {
                    TL_iv.textDiff textdiff = (TL_iv.textDiff) richText;
                    boolean j10 = bi.s6.j(textdiff.text);
                    boolean j11 = bi.s6.j(textdiff.old_text);
                    if (j10 && !j11) {
                        n(textdiff.old_text, spannableStringBuilder, i10, new a01(z(8192), 0));
                    } else if (!j10 && j11) {
                        n(textdiff.text, spannableStringBuilder, i10, new a01(z(4096), 0));
                    } else if (!j10) {
                        n(textdiff.text, spannableStringBuilder, i10, new hv0());
                    }
                } else if (richText instanceof TL_iv.textBold) {
                    int i11 = i10 | 16;
                    n(richText.text, spannableStringBuilder, i11, new sv(this, i11, false));
                } else if (richText instanceof TL_iv.textItalic) {
                    int i12 = i10 | 32;
                    n(richText.text, spannableStringBuilder, i12, new sv(this, i12, false));
                } else if (richText instanceof TL_iv.textUnderline) {
                    int i13 = i10 | 64;
                    n(richText.text, spannableStringBuilder, i13, new sv(this, i13, false));
                } else if (richText instanceof TL_iv.textStrike) {
                    int i14 = i10 | 128;
                    n(richText.text, spannableStringBuilder, i14, new sv(this, i14, false));
                } else if (richText instanceof TL_iv.textFixed) {
                    int i15 = i10 | 256;
                    n(richText.text, spannableStringBuilder, i15, new sv(this, i15, false));
                } else if (richText instanceof TL_iv.textUrl) {
                    n(richText.text, spannableStringBuilder, i10, new h51(((TL_iv.textUrl) richText).url, z(1024)));
                } else if (richText instanceof TL_iv.textEmail) {
                    TL_iv.RichText richText2 = richText.text;
                    n(richText2, spannableStringBuilder, i10, new h51("mailto:" + ((TL_iv.textEmail) richText).email, z(1024)));
                } else if (richText instanceof TL_iv.textConcat) {
                    for (int i16 = 0; i16 < richText.texts.size(); i16++) {
                        m(richText.texts.get(i16), spannableStringBuilder, i10);
                    }
                } else if (richText instanceof TL_iv.textSubscript) {
                    int i17 = i10 | 2048;
                    n(richText.text, spannableStringBuilder, i17, new sv(this, i17, false));
                } else if (richText instanceof TL_iv.textSuperscript) {
                    int i18 = i10 | 4096;
                    n(richText.text, spannableStringBuilder, i18, new sv(this, i18, false));
                } else if (richText instanceof TL_iv.textMarked) {
                    int i19 = i10 | 8192;
                    n(richText.text, spannableStringBuilder, i19, new sv(this, i19, false));
                } else if (richText instanceof TL_iv.textPhone) {
                    TL_iv.textPhone textphone = (TL_iv.textPhone) richText;
                    String d = af.b.d(textphone.phone, false);
                    if (textphone.phone.startsWith("+")) {
                        d = sc.e.h("+", d);
                    }
                    n(richText.text, spannableStringBuilder, i10, new h51(sc.e.h("tel:", d), z(1024)));
                } else if (richText instanceof TL_iv.textAnchor) {
                    TL_iv.textAnchor textanchor = (TL_iv.textAnchor) richText;
                    String str = textanchor.name;
                    if (str != null) {
                        String lowerCase = str.toLowerCase();
                        if (!(textanchor.text instanceof TL_iv.textEmpty)) {
                            this.f19336k.put(lowerCase, textanchor);
                        } else {
                            HashMap hashMap = this.f19335j;
                            if (!hashMap.containsKey(lowerCase)) {
                                hashMap.put(lowerCase, Integer.valueOf(this.f19333g.size()));
                            }
                        }
                    }
                    TL_iv.RichText richText3 = richText.text;
                    String str2 = textanchor.name;
                    if (str2 != null) {
                        str2.toLowerCase();
                    }
                    n(richText3, spannableStringBuilder, i10, new aj(2));
                } else {
                    int i20 = 4;
                    if (richText instanceof TL_iv.textMath) {
                        TL_iv.textMath textmath = (TL_iv.textMath) richText;
                        if (textmath.bitmap == null && !textmath.tried) {
                            textmath.tried = true;
                            bi.u a2 = bi.u.a(textmath.source, i0.L(this.M + 4), true);
                            if (a2 != null) {
                                textmath.f20020w = a2.f3370b;
                                textmath.h = a2.f3371c;
                                textmath.depth = a2.d;
                                textmath.bitmap = a2.f3369a;
                            }
                        }
                        if (textmath.bitmap != null) {
                            int length2 = spannableStringBuilder.length();
                            spannableStringBuilder.append(" ");
                            int length3 = spannableStringBuilder.length();
                            spannableStringBuilder.setSpan(new sz0(null, textmath.bitmap, textmath.f20020w, textmath.h, org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.G6, this.D), textmath.depth), length2, length3, 33);
                            String str3 = textmath.source;
                            if (str3 != null && !str3.isEmpty()) {
                                spannableStringBuilder.setSpan(new org.telegram.ui.Cells.p9(textmath.source), length2, length3, 33);
                            }
                        }
                    } else {
                        float f7 = 1.2f;
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
                            boolean a10 = v7.u7.a(i10, 13);
                            int i21 = i10 & 15;
                            if (i21 >= 1 && i21 <= 6) {
                                TextPaint textPaint = new TextPaint(this.f19347w);
                                new sv(this, i10, true).a(textPaint);
                                size = new org.telegram.ui.Components.o5(textcustomemoji.document_id, 0.85f, textPaint.getFontMetricsInt());
                            } else {
                                long j12 = textcustomemoji.document_id;
                                if (a10) {
                                    f7 = 1.0f;
                                }
                                org.telegram.ui.Components.o5 o5Var = new org.telegram.ui.Components.o5(j12, f7, (Paint.FontMetricsInt) null);
                                int i22 = this.M + 4;
                                if (a10) {
                                    i20 = -2;
                                }
                                size = o5Var.setSize(i0.L(i22 + i20));
                            }
                            spannableStringBuilder.setSpan(size, length4, length5, 33);
                        } else if (richText instanceof TL_iv.textSpoiler) {
                            n(richText.text, spannableStringBuilder, i10, new a01(z(256), 0));
                        } else if (richText instanceof TL_iv.textMention) {
                            TLRPC.TL_messageEntityMention tL_messageEntityMention = new TLRPC.TL_messageEntityMention();
                            ?? obj = new Object();
                            obj.d = tL_messageEntityMention;
                            n(richText.text, spannableStringBuilder, i10, new f51(x(richText), (zz0) obj));
                        } else if (richText instanceof TL_iv.textHashtag) {
                            TLRPC.TL_messageEntityHashtag tL_messageEntityHashtag = new TLRPC.TL_messageEntityHashtag();
                            ?? obj2 = new Object();
                            obj2.d = tL_messageEntityHashtag;
                            n(richText.text, spannableStringBuilder, i10, new f51(x(richText), (zz0) obj2));
                        } else if (richText instanceof TL_iv.textBotCommand) {
                            n(richText.text, spannableStringBuilder, i10, new c51(x(richText), E() ? 1 : 0, null));
                        } else if (richText instanceof TL_iv.textCashtag) {
                            TLRPC.TL_messageEntityCashtag tL_messageEntityCashtag = new TLRPC.TL_messageEntityCashtag();
                            ?? obj3 = new Object();
                            obj3.d = tL_messageEntityCashtag;
                            n(richText.text, spannableStringBuilder, i10, new f51(x(richText), (zz0) obj3));
                        } else if (richText instanceof TL_iv.textAutoUrl) {
                            n(richText.text, spannableStringBuilder, i10, new h51(x(richText), z(1024)));
                        } else if (richText instanceof TL_iv.textAutoEmail) {
                            n(richText.text, spannableStringBuilder, i10, new h51(sc.e.h("mailto:", x(richText)), z(1024)));
                        } else if (richText instanceof TL_iv.textAutoPhone) {
                            String x10 = x(richText);
                            String d10 = af.b.d(x10, false);
                            if (x10.startsWith("+")) {
                                d10 = sc.e.h("+", d10);
                            }
                            n(richText.text, spannableStringBuilder, i10, new h51(sc.e.h("tel:", d10), z(1024)));
                        } else if (richText instanceof TL_iv.textTonAddress) {
                            n(richText.text, spannableStringBuilder, i10, new f51(sc.e.h("tonaddress:", x(richText)), (zz0) null));
                        } else if (richText instanceof TL_iv.textBankCard) {
                            n(richText.text, spannableStringBuilder, i10, new f51(sc.e.h("card:", x(richText)), (zz0) null));
                        } else if (richText instanceof TL_iv.textMentionName) {
                            TL_iv.RichText richText4 = richText.text;
                            n(richText4, spannableStringBuilder, i10, new i51("" + ((TL_iv.textMentionName) richText).user_id, E() ? 1 : 0, null));
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
                            int i23 = i10 | 512;
                            TL_iv.RichText richText5 = richText.text;
                            sv svVar = new sv(this, i23, false);
                            org.telegram.ui.Components.n00 n00Var = new org.telegram.ui.Components.n00(x(richText), null, tL_messageEntityFormattedDate);
                            int length6 = spannableStringBuilder.length();
                            m(richText5, spannableStringBuilder, i23);
                            if (spannableStringBuilder.length() > length6) {
                                U(svVar, spannableStringBuilder, length6, spannableStringBuilder.length());
                                U(n00Var, spannableStringBuilder, length6, spannableStringBuilder.length());
                            }
                        } else if (richText instanceof TL_iv.textButton) {
                            int length7 = spannableStringBuilder.length();
                            spannableStringBuilder.append("*");
                            uu uuVar = new uu(this, this.B, (TL_iv.textButton) richText, null);
                            uuVar.d = 1.2f;
                            spannableStringBuilder.setSpan(uuVar, length7, spannableStringBuilder.length(), 33);
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

    public final void n(TL_iv.RichText richText, SpannableStringBuilder spannableStringBuilder, int i10, CharacterStyle characterStyle) {
        int length = spannableStringBuilder.length();
        m(richText, spannableStringBuilder, i10);
        if (spannableStringBuilder.length() > length) {
            U(characterStyle, spannableStringBuilder, length, spannableStringBuilder.length());
        }
    }

    public final SpannableStringBuilder o(TL_iv.RichText richText, int i10, IdentityHashMap identityHashMap) {
        IdentityHashMap identityHashMap2 = this.Y;
        this.Y = identityHashMap;
        try {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            m(richText, spannableStringBuilder, i10);
            return spannableStringBuilder;
        } finally {
            this.Y = identityHashMap2;
        }
    }

    public final ArrayList p() {
        ArrayList arrayList = this.f19333g;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            ((ru) arrayList.get(i10)).p(arrayList2);
        }
        for (int i11 = 0; i11 < arrayList2.size(); i11++) {
            ((vh0) arrayList2.get(i11)).getClass();
        }
        return arrayList2;
    }

    public final int r(int i10, org.telegram.ui.Cells.x1 x1Var) {
        int H;
        ArrayList arrayList = this.f19333g;
        if (i10 >= 0 && i10 < arrayList.size() && x1Var != null && (this.f19344s || this.f19346u)) {
            float max = Math.max(0.0f, Math.min(1.0f, x1Var.L1));
            ru ruVar = (ru) arrayList.get(i10);
            return Math.round(i0.T1(ruVar.O, ruVar.M, max));
        }
        int i11 = 0;
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            ru ruVar2 = (ru) arrayList.get(i12);
            boolean R = ruVar2.R();
            if (i12 == i10) {
                return i11;
            }
            if (R) {
                if (x1Var != null && (this.f19344s || this.f19346u)) {
                    H = i0.W1(Math.max(0.0f, Math.min(1.0f, x1Var.L1)), ruVar2.P, ruVar2.N);
                } else {
                    H = ruVar2.H();
                }
                i11 = H + i11;
            }
        }
        return this.A;
    }

    public final TLRPC.Document s(long j10) {
        TL_iv.RichMessage richMessage = this.f19331c;
        if (richMessage == null) {
            return null;
        }
        ArrayList<TLRPC.Document> arrayList = richMessage.documents;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            TLRPC.Document document = arrayList.get(i10);
            i10++;
            TLRPC.Document document2 = document;
            if (document2.f19800id == j10) {
                return document2;
            }
        }
        return null;
    }

    public final int t() {
        int i10;
        if (this.d && this.A > i0.L(900.0f)) {
            return i0.L(950.0f);
        }
        int i11 = this.A;
        if (this.d) {
            i10 = i0.L(50.0f);
        } else {
            i10 = 0;
        }
        return i11 + i10;
    }

    public final int u() {
        return this.B;
    }

    public final TLRPC.Photo v(long j10) {
        TL_iv.RichMessage richMessage = this.f19331c;
        if (richMessage == null) {
            return null;
        }
        ArrayList<TLRPC.Photo> arrayList = richMessage.photos;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            TLRPC.Photo photo = arrayList.get(i10);
            i10++;
            TLRPC.Photo photo2 = photo;
            if (photo2.f19818id == j10) {
                return photo2;
            }
        }
        return null;
    }

    public final java.lang.String w(int r22, int r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.wv.w(int, int):java.lang.String");
    }

    public wv(int i10, int i11, org.telegram.ui.ActionBar.p6 p6Var) {
        this.e = new ArrayList();
        this.f19332f = new ArrayList();
        this.f19333g = new ArrayList();
        this.h = new ArrayList();
        this.f19335j = new HashMap();
        this.f19336k = new HashMap();
        this.f19337l = new ArrayList();
        this.f19338m = new HashMap();
        this.f19339n = new ArrayList();
        this.f19340o = new ArrayList();
        this.f19341p = new ArrayList();
        this.f19342q = "";
        this.f19345t = 1.0f;
        TextPaint textPaint = new TextPaint(1);
        this.f19347w = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        this.f19348x = textPaint2;
        this.f19349y = new el0(null);
        this.f19350z = new li.k(23);
        this.K = new RectF();
        this.f19330b = null;
        this.f19329a = i10;
        this.B = i11;
        this.D = p6Var;
        int i12 = uz.W0;
        this.M = i12;
        this.N = i0.f16171p;
        textPaint.setTextSize(i0.L(i12));
        textPaint2.setTextSize(i0.L(this.M));
    }
}
