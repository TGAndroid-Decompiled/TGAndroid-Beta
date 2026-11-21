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
import org.telegram.ui.Components.fz0;
import org.telegram.ui.Components.gz0;
import org.telegram.ui.Components.ok0;
import org.telegram.ui.Components.p41;
import org.telegram.ui.Components.q80;
import org.telegram.ui.Components.qu0;
import org.telegram.ui.Components.rk0;
import org.telegram.ui.Components.s41;
import org.telegram.ui.Components.u41;
import org.telegram.ui.Components.v41;
import org.telegram.ui.Components.xy0;
import org.telegram.ui.Components.yx0;
import org.telegram.ui.Components.yy0;
import org.telegram.ui.wg0;
import org.telegram.ui.yg0;
public final class ev {
    public int A;
    public final int B;
    public int C;
    public org.telegram.ui.ActionBar.h6 D;
    public org.telegram.ui.Cells.r1 E;
    public org.telegram.ui.Cells.m1 F;
    public org.telegram.ui.Components.mc G;
    public Paint H;
    public xy0 I;
    public q80 J;
    public final RectF K;
    public boolean L;
    public int M;
    public float N;
    public boolean O;
    public ev P;
    public View Q;
    public xh.e R;
    public int S;
    public int T;
    public org.telegram.ui.Components.d6 U;
    public float V;
    public zt W;
    public int X;
    public IdentityHashMap Y;
    public final int f23795a;
    public final fj f23796b;
    public TL_iv.RichMessage f23797c;
    public boolean d;
    public final ArrayList f23798e;
    public final ArrayList f23799f;
    public final ArrayList f23800g;
    public final ArrayList h;
    public Drawable f23801i;
    public final HashMap f23802j;
    public final HashMap f23803k;
    public final ArrayList f23804l;
    public final HashMap f23805m;
    public final ArrayList f23806n;
    public final ArrayList f23807o;
    public final ArrayList f23808p;
    public Object f23809q;
    public yg0 f23810r;
    public boolean f23811s;
    public float f23812t;
    public boolean f23813u;
    public boolean v;
    public final TextPaint f23814w;
    public final TextPaint f23815x;
    public final ok0 f23816y;
    public final h6.m f23817z;

    public ev(fj fjVar, int i7, ev evVar) {
        this.f23798e = new ArrayList();
        this.f23799f = new ArrayList();
        this.f23800g = new ArrayList();
        this.h = new ArrayList();
        this.f23802j = new HashMap();
        this.f23803k = new HashMap();
        this.f23804l = new ArrayList();
        this.f23805m = new HashMap();
        this.f23806n = new ArrayList();
        this.f23807o = new ArrayList();
        this.f23808p = new ArrayList();
        this.f23809q = "";
        this.f23812t = 1.0f;
        this.f23814w = new TextPaint(1);
        this.f23815x = new TextPaint(1);
        this.f23816y = new ok0(null);
        this.f23817z = new h6.m(29);
        this.K = new RectF();
        this.f23796b = fjVar;
        this.B = i7;
        this.f23795a = fjVar.K1;
        J(evVar);
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
            arrayList.add((vt) arrayList2.get(arrayList.size()));
        }
    }

    public static void a(StringBuilder sb2, CharSequence charSequence, int i7, int i10, boolean z10) {
        String str;
        String str2;
        if (i10 > i7) {
            SpannableStringBuilder a02 = a0(charSequence.subSequence(i7, i10));
            StringBuilder sb3 = new StringBuilder();
            oi.b4.g(sb3, a02);
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
        av[] avVarArr;
        int i7;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
        for (av avVar : (av[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), av.class)) {
            int spanStart = spannableStringBuilder.getSpanStart(avVar);
            int spanEnd = spannableStringBuilder.getSpanEnd(avVar);
            if (spanEnd > spanStart) {
                int i10 = avVar.f22998b;
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
                    obj.f35335a = i7;
                    spannableStringBuilder.setSpan(new gz0(obj, 0), spanStart, spanEnd, 33);
                }
            }
        }
        return spannableStringBuilder;
    }

    public static void d(StringBuilder sb2, ArrayList arrayList) {
        String str;
        while (!arrayList.isEmpty()) {
            if (((Boolean) p5.c.g(1, arrayList)).booleanValue()) {
                str = "</ol>";
            } else {
                str = "</ul>";
            }
            sb2.append(str);
        }
    }

    public static org.telegram.messenger.xi[] e(float[] r34) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.ev.e(float[]):org.telegram.messenger.xi[]");
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
            if (!oi.c6.j(textdiff.text)) {
                y(textdiff.text, sb2);
            } else if (!oi.c6.j(textdiff.old_text)) {
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

    public static fz0 z(int i7) {
        ?? obj = new Object();
        obj.f35335a = i7;
        return obj;
    }

    public final boolean B() {
        org.telegram.ui.Cells.r1 r1Var = this.E;
        if (r1Var != null && r1Var.Ua > 0) {
            return true;
        }
        return false;
    }

    public final boolean C() {
        org.telegram.ui.Components.u5 u5Var;
        if (F()) {
            int i7 = 0;
            while (true) {
                ArrayList arrayList = this.f23806n;
                if (i7 >= arrayList.size()) {
                    break;
                }
                org.telegram.ui.Cells.u9 u9Var = (org.telegram.ui.Cells.u9) arrayList.get(i7);
                if ((u9Var instanceof dv) && (u5Var = ((dv) u9Var).F) != null && !u5Var.f40269a.isEmpty()) {
                    return true;
                }
                i7++;
            }
        }
        return false;
    }

    public final boolean D() {
        fj fjVar = this.f23796b;
        if (fjVar != null && fjVar.P2() && !fjVar.P3()) {
            return true;
        }
        return false;
    }

    public final boolean E() {
        fj fjVar = this.f23796b;
        if (fjVar != null && fjVar.P3()) {
            return true;
        }
        return false;
    }

    public final boolean F() {
        yg0 yg0Var = this.f23810r;
        if (yg0Var != null && yg0Var.h) {
            return false;
        }
        return true;
    }

    public final boolean G() {
        org.telegram.ui.Cells.r1 r1Var = this.E;
        if (r1Var != null && r1Var.L2()) {
            return true;
        }
        return false;
    }

    public final boolean H() {
        org.telegram.ui.Cells.u9[] L;
        zt ztVar = this.W;
        if (ztVar != null && (L = ztVar.L()) != null) {
            for (org.telegram.ui.Cells.u9 u9Var : L) {
                if (u9Var instanceof dv) {
                    dv dvVar = (dv) u9Var;
                    if (dvVar.N != null || dvVar.R != null) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final boolean I() {
        TL_iv.RichMessage richMessage = this.f23797c;
        if (richMessage != null && richMessage.rtl) {
            return true;
        }
        return false;
    }

    public final void J(ev evVar) {
        boolean z10;
        boolean z11;
        float f10;
        boolean z12;
        int i7;
        int i10;
        this.A = 0;
        this.C = 0;
        View view = this.Q;
        ArrayList arrayList = this.f23800g;
        if (view != null) {
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                zt ztVar = (zt) arrayList.get(i11);
                View view2 = ztVar.W;
                if (view2 != null && view2 == view) {
                    ztVar.V();
                    CheckBoxBase checkBoxBase = ztVar.f28383r;
                    if (checkBoxBase != null) {
                        checkBoxBase.f32866l = false;
                    }
                    ztVar.W = null;
                }
            }
        }
        this.f23798e.clear();
        this.f23799f.clear();
        arrayList.clear();
        this.h.clear();
        this.f23802j.clear();
        this.f23803k.clear();
        this.f23804l.clear();
        this.f23805m.clear();
        this.f23806n.clear();
        this.f23807o.clear();
        this.f23808p.clear();
        this.f23809q = "";
        this.M = bz.W0;
        this.N = g0.f24145p;
        this.f23814w.setTextSize(g0.L(bz.W0));
        this.f23815x.setTextSize(g0.L(bz.W0));
        this.d = false;
        this.f23797c = null;
        fj fjVar = this.f23796b;
        if (fjVar != null && fjVar.f23993k != null && fjVar.E0() != null) {
            TL_iv.RichMessage E0 = fjVar.E0();
            this.f23797c = E0;
            this.d = E0.part;
            this.P = evVar;
            for (int i12 = 0; i12 < this.f23797c.blocks.size(); i12++) {
                TL_iv.PageBlock pageBlock = this.f23797c.blocks.get(i12);
                zt j3 = j(pageBlock, 0, new Rect(), 0, O(i12, this.f23797c.blocks));
                if ((j3 instanceof tu) && (((z12 = pageBlock instanceof TL_iv.pageBlockParagraph)) || org.telegram.ui.g4.I(pageBlock))) {
                    tu tuVar = (tu) j3;
                    if (i12 == 0 && z12) {
                        i7 = 0;
                    } else {
                        i7 = tuVar.f27097a0;
                    }
                    if (i12 == this.f23797c.blocks.size() - 1) {
                        i10 = 0;
                    } else {
                        i10 = tuVar.f27098b0;
                    }
                    tuVar.j0(i7, i10);
                }
            }
            for (int i13 = 0; i13 < arrayList.size(); i13++) {
                zt ztVar2 = (zt) arrayList.get(i13);
                if ((ztVar2 instanceof tu) && ztVar2.f28385w > 0) {
                    if (i13 > 0 && ((zt) arrayList.get(i13 - 1)).f28385w > 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    int i14 = i13 + 1;
                    if (i14 < arrayList.size() && ((zt) arrayList.get(i14)).f28385w > 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    tu tuVar2 = (tu) ztVar2;
                    float f11 = 6.0f;
                    if (z10) {
                        f10 = 3.0f;
                    } else {
                        f10 = 6.0f;
                    }
                    int L = g0.L(f10);
                    if (z11) {
                        f11 = 3.0f;
                    }
                    tuVar2.j0(L, g0.L(f11));
                }
            }
            this.P = null;
            if (this.f23810r != null) {
                for (int i15 = 0; i15 < arrayList.size(); i15++) {
                    ((zt) arrayList.get(i15)).L = this.f23810r;
                }
                this.f23810r.k(p());
            }
            if (view != null) {
                for (int i16 = 0; i16 < arrayList.size(); i16++) {
                    ((zt) arrayList.get(i16)).m(view);
                }
            }
            Q();
            X();
        }
    }

    public final boolean L(TL_iv.RichMessage richMessage, int i7) {
        if (this.f23797c == richMessage && this.M == bz.W0 && Math.abs(this.N - g0.f24145p) <= 0.1f && i7 == this.B) {
            return false;
        }
        return true;
    }

    public final boolean M(android.view.MotionEvent r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.ev.M(android.view.MotionEvent):boolean");
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
                vt vtVar = (vt) obj;
                if (i7 >= vtVar.f27623a && i7 <= vtVar.f27624b) {
                    arrayList.add(vtVar);
                }
            }
            Collections.sort(arrayList, new dl(13));
        }
        return arrayList;
    }

    public final void Q() {
        ArrayList arrayList;
        this.A = 0;
        this.C = 0;
        ArrayList arrayList2 = this.f23806n;
        arrayList2.clear();
        ArrayList arrayList3 = this.f23807o;
        arrayList3.clear();
        ArrayList arrayList4 = this.f23808p;
        arrayList4.clear();
        int i7 = 0;
        while (true) {
            arrayList = this.f23800g;
            if (i7 >= arrayList.size()) {
                break;
            }
            this.C = Math.max(this.C, ((zt) arrayList.get(i7)).K());
            i7++;
        }
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            zt ztVar = (zt) arrayList.get(i10);
            if (ztVar instanceof su) {
                su suVar = (su) ztVar;
                int i11 = this.C;
                int i12 = suVar.f26892f0;
                int i13 = suVar.f26891e0;
                Rect rect = suVar.f28378b;
                int max = Math.max(i12, Math.min(i13, Math.max(0, (i11 - rect.left) - rect.right)));
                suVar.f26893g0 = max;
                yx0 yx0Var = suVar.Y;
                yx0Var.setRenderWidth(max);
                suVar.f26894h0 = yx0Var.getRenderHeight();
            }
        }
        StringBuilder sb2 = new StringBuilder();
        int i14 = 0;
        for (int i15 = 0; i15 < arrayList.size(); i15++) {
            zt ztVar2 = (zt) arrayList.get(i15);
            boolean S = ztVar2.S();
            ztVar2.N = i14;
            ztVar2.O = 0;
            ztVar2.R = S;
            Rect rect2 = ztVar2.f28378b;
            ztVar2.Z(rect2.left, rect2.top + i14, i15);
            if (S) {
                org.telegram.ui.Cells.u9[] L = ztVar2.L();
                if (L != null) {
                    for (org.telegram.ui.Cells.u9 u9Var : L) {
                        if (u9Var != null && u9Var.a() != null) {
                            if (sb2.length() > 0) {
                                sb2.append('\n');
                            }
                            arrayList3.add(Integer.valueOf(sb2.length()));
                            arrayList4.add(Integer.valueOf(i15));
                            arrayList2.add(u9Var);
                            CharSequence text = u9Var.a().getText();
                            if (text != null) {
                                sb2.append(text);
                            }
                        }
                    }
                }
                int I = ztVar2.I();
                ztVar2.O = I;
                i14 += I;
            }
        }
        this.A = i14;
        this.f23809q = sb2;
    }

    public final void S(int i7, int i10) {
        if (this.S != i7 || this.T != i10) {
            this.S = i7;
            this.T = i10;
            int i11 = 0;
            while (true) {
                ArrayList arrayList = this.f23800g;
                if (i11 < arrayList.size()) {
                    zt ztVar = (zt) arrayList.get(i11);
                    if (ztVar instanceof fu) {
                        fu fuVar = (fu) ztVar;
                        dv dvVar = fuVar.Y;
                        dvVar.f23606c = (g0.L(53.0f) + (fuVar.T - fuVar.f28377a.S)) - dvVar.f23608f;
                    }
                    i11++;
                } else {
                    return;
                }
            }
        }
    }

    public final void T(org.telegram.ui.Cells.r1 r1Var, org.telegram.ui.Cells.m1 m1Var) {
        this.E = r1Var;
        this.F = m1Var;
    }

    public final void U(CharacterStyle characterStyle, final SpannableStringBuilder spannableStringBuilder, int i7, int i10) {
        if (characterStyle instanceof av) {
            int i11 = ((av) characterStyle).f22998b;
            av[] avVarArr = (av[]) spannableStringBuilder.getSpans(i7, i10, av.class);
            if (avVarArr != null && avVarArr.length > 0) {
                Arrays.sort(avVarArr, Comparator$CC.comparingInt(new ToIntFunction() {
                    @Override
                    public final int applyAsInt(Object obj) {
                        return spannableStringBuilder.getSpanStart((av) obj);
                    }
                }));
                for (int i12 = 0; i12 < avVarArr.length; i12++) {
                    int spanStart = spannableStringBuilder.getSpanStart(avVarArr[i12]);
                    int spanEnd = spannableStringBuilder.getSpanEnd(avVarArr[i12]);
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
        boolean z10;
        while (i7 < i10) {
            int nextSpanTransition = spannableStringBuilder.nextSpanTransition(i7, i10, URLSpan.class);
            if (((URLSpan[]) spannableStringBuilder.getSpans(i7, nextSpanTransition, URLSpan.class)).length > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            spannableStringBuilder.setSpan(new av(this, i11, z10), i7, nextSpanTransition, 33);
            i7 = nextSpanTransition;
        }
    }

    public final void W(yg0 yg0Var) {
        this.f23810r = yg0Var;
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.f23800g;
            if (i7 < arrayList.size()) {
                ((zt) arrayList.get(i7)).L = yg0Var;
                arrayList.get(i7);
                ((zt) arrayList.get(i7)).getClass();
                i7++;
            } else {
                return;
            }
        }
    }

    public final void X() {
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.f23800g;
            if (i7 < arrayList.size()) {
                ((zt) arrayList.get(i7)).d0();
                i7++;
            } else {
                return;
            }
        }
    }

    public final boolean Y() {
        ArrayList arrayList = this.f23800g;
        if (arrayList.isEmpty()) {
            return false;
        }
        zt ztVar = (zt) arrayList.get(0);
        if (!(ztVar instanceof mu) && !(ztVar instanceof yu) && !(ztVar instanceof eu) && !(ztVar instanceof qu) && !(ztVar instanceof rk0)) {
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
                ArrayList arrayList = this.f23800g;
                if (i7 < arrayList.size()) {
                    ((zt) arrayList.get(i7)).m(view);
                    i7++;
                } else {
                    return;
                }
            }
        }
    }

    public final void b0(int i7) {
        dv dvVar;
        View view;
        boolean z10;
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f23806n;
            if (i10 < arrayList.size()) {
                org.telegram.ui.Cells.u9 u9Var = (org.telegram.ui.Cells.u9) arrayList.get(i10);
                if ((u9Var instanceof dv) && (view = (dvVar = (dv) u9Var).T) != null) {
                    org.telegram.ui.Components.y5.release(view, dvVar.F);
                    dvVar.F = null;
                    View view2 = dvVar.T;
                    if (dvVar.f23604a.v && !dvVar.f23612w) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    dvVar.F = org.telegram.ui.Components.y5.update(i7, view2, z10, (org.telegram.ui.Components.u5) null, dvVar.f23605b);
                }
                i10++;
            } else {
                return;
            }
        }
    }

    public final void c(org.telegram.tgnet.TLRPC.Chat r10, org.telegram.tgnet.TLRPC.User r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.ev.c(org.telegram.tgnet.TLRPC$Chat, org.telegram.tgnet.TLRPC$User):void");
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
                ArrayList arrayList = this.f23800g;
                if (i7 >= arrayList.size()) {
                    break;
                }
                zt ztVar = (zt) arrayList.get(i7);
                View view3 = ztVar.W;
                if (view3 != null && view3 == view) {
                    ztVar.V();
                    CheckBoxBase checkBoxBase = ztVar.f28383r;
                    if (checkBoxBase != null) {
                        checkBoxBase.f32866l = false;
                    }
                    ztVar.W = null;
                }
                i7++;
            }
            if (view == this.E) {
                this.E = null;
                this.F = null;
            }
        }
    }

    public final void g(Canvas canvas, int i7, int i10, org.telegram.ui.Cells.y1 y1Var) {
        int i11;
        boolean z10;
        float f10;
        float f11;
        int i12;
        int i13;
        boolean z11;
        org.telegram.ui.Cells.m1 m1Var;
        S(i7, i10);
        if (E()) {
            i11 = org.telegram.ui.ActionBar.m6.Yc;
        } else {
            i11 = org.telegram.ui.ActionBar.m6.Xc;
        }
        this.f23814w.linkColor = org.telegram.ui.ActionBar.m6.w0(i11, this.D);
        boolean z12 = this.d;
        int min = Math.min(this.A, g0.L(900.0f));
        if (z12) {
            canvas.saveLayerAlpha(-i7, 0.0f, this.C + i10, min, 255, 31);
        }
        org.telegram.ui.Cells.r1 r1Var = this.E;
        boolean z13 = false;
        if (r1Var != null && r1Var.f31602sc > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            float f12 = r1Var.f31574qc - r1Var.f31617u0;
            f11 = r1Var.f31602sc + f12;
            f10 = f12;
        } else {
            f10 = 0.0f;
            f11 = 0.0f;
        }
        h(canvas, y1Var, z10, f10, f11);
        if (z12) {
            RectF rectF = g0.P;
            rectF.set(-i7, min - g0.L(32.0f), this.C + i10, min);
            this.f23817z.n(canvas, rectF, 3, 1.0f);
            canvas.restore();
            if (E()) {
                i12 = org.telegram.ui.ActionBar.m6.Ob;
            } else {
                i12 = org.telegram.ui.ActionBar.m6.Bd;
            }
            int w02 = org.telegram.ui.ActionBar.m6.w0(i12, this.D);
            if (this.I == null) {
                this.I = new xy0(gd.N0(2131745143, null), 16.0f, g0.o());
            }
            org.telegram.ui.Components.mc mcVar = this.G;
            if (mcVar == null) {
                this.G = new org.telegram.ui.Components.mc(this.Q, 1.5f, 2.0f);
            } else {
                View view = mcVar.f37473a;
                View view2 = this.Q;
                if (view != view2) {
                    mcVar.f37473a = view2;
                }
            }
            if (this.H == null) {
                this.H = new Paint(1);
            }
            this.H.setColor(org.telegram.ui.ActionBar.m6.r1(0.1f, w02));
            float f13 = this.I.f42254c;
            int i14 = this.C;
            float f14 = (((i14 + i13) + this.T) / 2.0f) - this.S;
            float L = g0.L(4.0f) + min;
            float L2 = (((this.C + this.S) + this.T) - g0.L(24.0f)) / 2.0f;
            RectF rectF2 = this.K;
            rectF2.set(f14 - L2, L, f14 + L2, g0.L(42.0f) + L);
            org.telegram.ui.Cells.r1 r1Var2 = this.E;
            if (r1Var2 != null && (m1Var = this.F) != null && m1Var.z1(r1Var2, 7)) {
                z11 = true;
            } else {
                z11 = false;
            }
            q80 q80Var = this.J;
            if (q80Var != null && !z11 && !q80Var.c() && !this.J.d()) {
                this.J.a();
            }
            q80 q80Var2 = this.J;
            if (q80Var2 == null && z11) {
                q80 q80Var3 = new q80();
                this.J = q80Var3;
                q80Var3.f38839x.setStrokeWidth(g0.L(1.25f));
                this.J.D = true;
            } else if (q80Var2 != null && z11 && (q80Var2.c() || this.J.d())) {
                q80 q80Var4 = this.J;
                q80Var4.f38820b = -1L;
                q80Var4.f38821c = -1L;
            }
            q80 q80Var5 = this.J;
            if (q80Var5 != null) {
                q80Var5.g(org.telegram.ui.ActionBar.m6.r1(0.1f, w02), org.telegram.ui.ActionBar.m6.r1(0.3f, w02), org.telegram.ui.ActionBar.m6.r1(0.3f, w02), org.telegram.ui.ActionBar.m6.r1(1.2f, w02));
            }
            float a10 = this.G.a(0.075f);
            if (a10 != 1.0f) {
                z13 = true;
            }
            if (z13) {
                canvas.save();
                canvas.scale(a10, a10, rectF2.centerX(), rectF2.centerY());
            }
            canvas.drawRoundRect(rectF2, g0.L(8.0f), g0.L(8.0f), this.H);
            q80 q80Var6 = this.J;
            if (q80Var6 != null && !q80Var6.c()) {
                this.J.e(rectF2);
                this.J.k(8.0f);
                this.J.draw(canvas);
                View view3 = this.Q;
                if (view3 != null) {
                    view3.invalidate();
                }
            }
            this.I.c(rectF2.centerX() - (f13 / 2.0f), rectF2.centerY(), 1.0f, w02, canvas);
            if (z13) {
                canvas.restore();
            }
        }
    }

    public final void h(Canvas canvas, org.telegram.ui.Cells.y1 y1Var, boolean z10, float f10, float f11) {
        boolean z11;
        float f12;
        View view;
        float f13;
        float f14;
        boolean z12;
        boolean z13;
        float f15;
        float f16;
        float T1;
        Canvas canvas2;
        fu fuVar;
        float f17;
        float f18;
        float f19;
        int i7;
        int i10;
        boolean z14;
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
                vt vtVar = (vt) arrayList.get(i14);
                int r10 = r(vtVar.f27623a, y1Var);
                int i16 = vtVar.f27624b;
                ArrayList arrayList2 = this.f23800g;
                float f28 = 4.0f;
                if (i16 >= 0 && i16 < arrayList2.size() && y1Var != null && (this.f23811s || this.f23813u)) {
                    float max = Math.max(f26, Math.min(f27, y1Var.L1));
                    zt ztVar = (zt) arrayList2.get(i16);
                    int d = i5.c.d(4.0f, ztVar.f28378b.bottom, i13);
                    float f29 = ztVar.P + ztVar.Q;
                    if (ztVar.S) {
                        i12 = d;
                    } else {
                        i12 = i13;
                    }
                    float f30 = f29 - i12;
                    float f31 = ztVar.N + ztVar.O;
                    if (!ztVar.R) {
                        d = i13;
                    }
                    i11 = Math.round(g0.T1(f30, f31 - d, max));
                } else {
                    int i17 = i13;
                    int i18 = i17;
                    while (true) {
                        if (i17 < arrayList2.size()) {
                            zt ztVar2 = (zt) arrayList2.get(i17);
                            boolean S = ztVar2.S();
                            float f32 = f28;
                            Rect rect = ztVar2.f28378b;
                            if (S) {
                                if (y1Var != null && (this.f23811s || this.f23813u)) {
                                    I2 = g0.W1(Math.max(0.0f, Math.min(f27, y1Var.L1)), ztVar2.Q, ztVar2.O);
                                } else {
                                    I2 = ztVar2.I();
                                }
                                int i19 = I2 + i18;
                                if (i17 == i16 && rect.bottom > g0.L(f32)) {
                                    f25 = f32;
                                    i18 = f3.B(f25, rect.bottom, i19);
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
                int i20 = vtVar.f27624b;
                ArrayList arrayList3 = this.f23800g;
                float f33 = 1.0f;
                for (int i21 = vtVar.f27623a; i21 < Math.min(i20 + 1, arrayList3.size()); i21++) {
                    zt ztVar3 = (zt) arrayList3.get(i21);
                    if (ztVar3.S()) {
                        f33 = ztVar3.z() * f33;
                    }
                }
                int L = g0.L(3.0f) * vtVar.d;
                int i22 = vtVar.f27626e + L;
                int i23 = L + vtVar.f27627f;
                if (i11 - r10 > i22 + i23) {
                    r10 += i22;
                    i11 -= i23;
                }
                RectF rectF = g0.P;
                rectF.set(vtVar.f27625c, r10, this.C - g0.L(vtVar.d * 12), i11);
                canvas3.save();
                canvas3.scale(f33, f33, rectF.centerX(), rectF.centerY());
                float floor = (float) Math.floor(bz.Y0 / 3.0f);
                this.f23816y.d(canvas3, rectF, floor, floor, floor, 1.0f, false, false);
                this.f23816y.f(canvas3, rectF, 1.0f);
                canvas3.restore();
                size = size;
                i14 = i15;
                f26 = 0.0f;
                f27 = 1.0f;
                i13 = 0;
            }
        }
        int i24 = 0;
        while (i24 < this.f23800g.size()) {
            zt ztVar4 = (zt) this.f23800g.get(i24);
            if ((ztVar4 instanceof ou) && (ztVar4.R || ztVar4.S)) {
                ou ouVar = (ou) ztVar4;
                int r11 = ouVar.X.r();
                dv dvVar = ouVar.Y;
                if (dvVar != null) {
                    i10 = dvVar.r();
                } else {
                    i10 = 0;
                }
                int max2 = Math.max(r11, i10);
                if (max2 > 0) {
                    if (y1Var != null && (this.f23811s || this.f23813u)) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if (z14) {
                        f20 = Math.max(0.0f, Math.min(1.0f, y1Var.L1));
                    } else {
                        f20 = 1.0f;
                    }
                    if (z14) {
                        if (ouVar.S) {
                            f23 = 1.0f;
                        } else {
                            f23 = 0.0f;
                        }
                        if (ouVar.R) {
                            f24 = 1.0f;
                        } else {
                            f24 = 0.0f;
                        }
                        f21 = g0.T1(f23, f24, f20);
                    } else if (ouVar.R) {
                        f21 = 1.0f;
                    } else {
                        f21 = 0.0f;
                    }
                    if (f21 > 0.0f) {
                        float f34 = ((this.C + this.T) - this.S) / 2.0f;
                        float f35 = max2 / 2.0f;
                        float L2 = (f34 - f35) - g0.L(30.0f);
                        float L3 = f34 + f35 + g0.L(30.0f);
                        if (z14) {
                            f22 = g0.T1(ouVar.P, ouVar.N, f20);
                        } else {
                            f22 = ouVar.N;
                        }
                        if (z14) {
                            I = g0.W1(f20, ouVar.Q, ouVar.O);
                        } else {
                            I = ouVar.I();
                        }
                        float L4 = g0.L(8.0f) + f22;
                        float L5 = (f22 + I) - g0.L(8.0f);
                        if (L5 > L4) {
                            RectF rectF2 = g0.P;
                            rectF2.set(L2, L4, L3, L5);
                            float floor2 = (float) Math.floor(bz.Y0 / 2.0f);
                            this.f23816y.d(canvas3, rectF2, floor2, floor2, floor2, f21, false, false);
                            if (this.f23801i == null) {
                                this.f23801i = t0.f26941b.getDrawable(2131231967).mutate();
                            }
                            this.f23801i.setColorFilter(this.f23816y.i(), PorterDuff.Mode.SRC_IN);
                            this.f23801i.setAlpha((int) (f21 * 255.0f));
                            int intrinsicWidth = this.f23801i.getIntrinsicWidth();
                            int intrinsicHeight = this.f23801i.getIntrinsicHeight();
                            canvas3.save();
                            canvas3.clipRect(L2, L4, L3, L5);
                            int i25 = (int) L2;
                            int i26 = (int) L4;
                            i7 = i24;
                            this.f23801i.setBounds(g0.L(8.0f) + i25, g0.L(7.0f) + i26, f3.C(8.0f, i25, intrinsicWidth), f3.C(7.0f, i26, intrinsicHeight));
                            canvas3.scale(-1.0f, -1.0f, this.f23801i.getBounds().centerX(), this.f23801i.getBounds().centerY());
                            this.f23801i.draw(canvas3);
                            canvas3.restore();
                            canvas3.save();
                            canvas3.clipRect(L2, L4, L3, L5);
                            int i27 = (int) L3;
                            int i28 = (int) L5;
                            this.f23801i.setBounds(f3.z(8.0f, i27, intrinsicWidth), f3.z(7.0f, i28, intrinsicHeight), i27 - g0.L(8.0f), i28 - g0.L(7.0f));
                            canvas3.scale(1.0f, -1.0f, this.f23801i.getBounds().centerX(), this.f23801i.getBounds().centerY());
                            this.f23801i.draw(canvas3);
                            canvas3.restore();
                            this.f23801i.setAlpha(255);
                            i24 = i7 + 1;
                        }
                    }
                }
            }
            i7 = i24;
            i24 = i7 + 1;
        }
        fj fjVar = this.f23796b;
        if (!this.O && (fjVar == null || !mp.u1(this.f23795a).f25815v7.A(fjVar))) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (!z11 && this.U == null) {
            this.V = 0.0f;
        } else {
            if (this.U == null) {
                this.U = new org.telegram.ui.Components.d6(0L, 350L, org.telegram.ui.Components.nr.h);
            }
            org.telegram.ui.Components.d6 d6Var = this.U;
            if (z11) {
                f12 = 1.0f;
            } else {
                f12 = 0.0f;
            }
            float e10 = d6Var.e(false, f12);
            this.V = e10;
            if (e10 > 0.0f && (view = this.Q) != null) {
                view.invalidate();
            }
        }
        if (y1Var == null || (!this.f23811s && !this.f23813u)) {
            f13 = 1.0f;
            f14 = 1.0f;
        } else {
            f13 = 1.0f;
            f14 = Math.max(0.0f, Math.min(1.0f, y1Var.L1));
        }
        this.f23812t = f14;
        int i29 = (f14 > f13 ? 1 : (f14 == f13 ? 0 : -1));
        if (i29 >= 0) {
            this.f23811s = false;
            this.f23813u = false;
        }
        boolean z15 = this.f23811s;
        if (!z15 && !this.f23813u) {
            z12 = z10;
        } else {
            z12 = false;
        }
        if (z15 && f14 < 1.0f) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (z13) {
            ArrayList arrayList4 = this.f23800g;
            for (int i30 = 0; i30 < arrayList4.size(); i30++) {
                zt ztVar5 = (zt) arrayList4.get(i30);
                if (ztVar5 instanceof fu) {
                    fu fuVar2 = (fu) ztVar5;
                    fuVar2.f24092e0 = g0.T1(fuVar2.P, fuVar2.N, f14) + fuVar2.I();
                    int i31 = i30 + 1;
                    while (true) {
                        if (i31 < arrayList4.size()) {
                            zt ztVar6 = (zt) arrayList4.get(i31);
                            do {
                                ztVar6 = ztVar6.M;
                                if (ztVar6 == null) {
                                    f19 = g0.T1(((zt) arrayList4.get(i31)).P, ((zt) arrayList4.get(i31)).N, f14);
                                    break;
                                }
                            } while (ztVar6 != fuVar2);
                            i31++;
                        } else {
                            f19 = Float.MAX_VALUE;
                            break;
                        }
                    }
                    fuVar2.f24093f0 = f19;
                }
            }
        }
        ArrayList arrayList5 = this.f23800g;
        for (int i32 = 0; i32 < arrayList5.size(); i32++) {
            zt ztVar7 = (zt) arrayList5.get(i32);
            if (ztVar7 instanceof uu) {
                uu uuVar = (uu) ztVar7;
                if (uuVar.f27285i0) {
                    f17 = 1.0f;
                } else {
                    f17 = 0.0f;
                }
                if (uuVar.f27284h0) {
                    f18 = 1.0f;
                } else {
                    f18 = 0.0f;
                }
                uuVar.f27286j0 = g0.T1(f17, f18, f14);
                uuVar.f27287k0 = g0.W1(f14, uuVar.Q, uuVar.O);
            }
        }
        int i33 = 0;
        while (i33 < this.f23800g.size()) {
            zt ztVar8 = (zt) this.f23800g.get(i33);
            if (ztVar8.R || ztVar8.S) {
                float T12 = g0.T1(ztVar8.P, ztVar8.N, f14);
                boolean z16 = ztVar8 instanceof gu;
                if (z16) {
                    T1 = 1.0f;
                } else {
                    if (ztVar8.S) {
                        f15 = 1.0f;
                    } else {
                        f15 = 0.0f;
                    }
                    if (ztVar8.R) {
                        f16 = 1.0f;
                    } else {
                        f16 = 0.0f;
                    }
                    T1 = g0.T1(f15, f16, f14);
                }
                if (T1 > 0.0f) {
                    int I3 = ztVar8.I();
                    if (!z12 || (I3 + T12 > f10 && T12 < f11)) {
                        canvas3.save();
                        if (z13 && (fuVar = ztVar8.M) != null && !z16) {
                            float f36 = -3.4028235E38f;
                            float f37 = Float.MAX_VALUE;
                            for (fuVar = ztVar8.M; fuVar != null; fuVar = fuVar.M) {
                                f36 = Math.max(f36, fuVar.f24092e0);
                                f37 = Math.min(f37, fuVar.f24093f0);
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
                            ztVar8.t(canvas2);
                            canvas2.restoreToCount(saveLayerAlpha);
                        } else {
                            canvas2 = canvas3;
                            ztVar8.t(canvas2);
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
                ArrayList arrayList = this.f23800g;
                if (i7 < arrayList.size()) {
                    zt ztVar = (zt) arrayList.get(i7);
                    if (ztVar.R) {
                        canvas.save();
                        canvas.translate(0.0f, ztVar.N);
                        ztVar.s(canvas, colorFilter);
                        canvas.restore();
                    }
                    i7++;
                } else {
                    return;
                }
            }
        }
    }

    public final org.telegram.messenger.zt j(org.telegram.tgnet.tl.TL_iv.PageBlock r29, int r30, android.graphics.Rect r31, int r32, boolean r33) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.ev.j(org.telegram.tgnet.tl.TL_iv$PageBlock, int, android.graphics.Rect, int, boolean):org.telegram.messenger.zt");
    }

    public final void k(TL_iv.PageCaption pageCaption, Rect rect, int i7) {
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
            int R = R(i7, 10);
            SpannableStringBuilder spannableStringBuilder2 = null;
            if (z10) {
                spannableStringBuilder = l(pageCaption.text, R);
            } else {
                spannableStringBuilder = null;
            }
            if (z11) {
                spannableStringBuilder2 = l(pageCaption.credit, R);
            }
            this.f23800g.add(new du(this, rect, this.B, spannableStringBuilder, spannableStringBuilder2));
        }
    }

    public final SpannableStringBuilder l(TL_iv.RichText richText, int i7) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (i7 == 0) {
            m(richText, spannableStringBuilder, 0);
        } else {
            n(richText, spannableStringBuilder, i7, new av(this, i7, false));
        }
        if (richText != null && spannableStringBuilder.length() > 0) {
            spannableStringBuilder.setSpan(new wt(richText, i7), 0, spannableStringBuilder.length(), 33);
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
                    boolean j3 = oi.c6.j(textdiff.text);
                    boolean j10 = oi.c6.j(textdiff.old_text);
                    if (j3 && !j10) {
                        n(textdiff.old_text, spannableStringBuilder, i7, new gz0(z(8192), 0));
                    } else if (!j3 && j10) {
                        n(textdiff.text, spannableStringBuilder, i7, new gz0(z(4096), 0));
                    } else if (!j3) {
                        n(textdiff.text, spannableStringBuilder, i7, new qu0());
                    }
                } else if (richText instanceof TL_iv.textBold) {
                    int i10 = i7 | 16;
                    n(richText.text, spannableStringBuilder, i10, new av(this, i10, false));
                } else if (richText instanceof TL_iv.textItalic) {
                    int i11 = i7 | 32;
                    n(richText.text, spannableStringBuilder, i11, new av(this, i11, false));
                } else if (richText instanceof TL_iv.textUnderline) {
                    int i12 = i7 | 64;
                    n(richText.text, spannableStringBuilder, i12, new av(this, i12, false));
                } else if (richText instanceof TL_iv.textStrike) {
                    int i13 = i7 | 128;
                    n(richText.text, spannableStringBuilder, i13, new av(this, i13, false));
                } else if (richText instanceof TL_iv.textFixed) {
                    int i14 = i7 | 256;
                    n(richText.text, spannableStringBuilder, i14, new av(this, i14, false));
                } else if (richText instanceof TL_iv.textUrl) {
                    n(richText.text, spannableStringBuilder, i7, new u41(((TL_iv.textUrl) richText).url, z(1024)));
                } else if (richText instanceof TL_iv.textEmail) {
                    TL_iv.RichText richText2 = richText.text;
                    n(richText2, spannableStringBuilder, i7, new u41("mailto:" + ((TL_iv.textEmail) richText).email, z(1024)));
                } else if (richText instanceof TL_iv.textConcat) {
                    for (int i15 = 0; i15 < richText.texts.size(); i15++) {
                        m(richText.texts.get(i15), spannableStringBuilder, i7);
                    }
                } else if (richText instanceof TL_iv.textSubscript) {
                    int i16 = i7 | 2048;
                    n(richText.text, spannableStringBuilder, i16, new av(this, i16, false));
                } else if (richText instanceof TL_iv.textSuperscript) {
                    int i17 = i7 | 4096;
                    n(richText.text, spannableStringBuilder, i17, new av(this, i17, false));
                } else if (richText instanceof TL_iv.textMarked) {
                    int i18 = i7 | 8192;
                    n(richText.text, spannableStringBuilder, i18, new av(this, i18, false));
                } else if (richText instanceof TL_iv.textPhone) {
                    TL_iv.textPhone textphone = (TL_iv.textPhone) richText;
                    String d = pf.b.d(textphone.phone, false);
                    if (textphone.phone.startsWith("+")) {
                        d = p5.c.k("+", d);
                    }
                    n(richText.text, spannableStringBuilder, i7, new u41(p5.c.k("tel:", d), z(1024)));
                } else if (richText instanceof TL_iv.textAnchor) {
                    TL_iv.textAnchor textanchor = (TL_iv.textAnchor) richText;
                    String str = textanchor.name;
                    if (str != null) {
                        String lowerCase = str.toLowerCase();
                        if (!(textanchor.text instanceof TL_iv.textEmpty)) {
                            this.f23803k.put(lowerCase, textanchor);
                        } else {
                            HashMap hashMap = this.f23802j;
                            if (!hashMap.containsKey(lowerCase)) {
                                hashMap.put(lowerCase, Integer.valueOf(this.f23800g.size()));
                            }
                        }
                    }
                    TL_iv.RichText richText3 = richText.text;
                    String str2 = textanchor.name;
                    if (str2 != null) {
                        str2.toLowerCase();
                    }
                    n(richText3, spannableStringBuilder, i7, new hi.q9(3));
                } else {
                    int i19 = 4;
                    if (richText instanceof TL_iv.textMath) {
                        TL_iv.textMath textmath = (TL_iv.textMath) richText;
                        if (textmath.bitmap == null && !textmath.tried) {
                            textmath.tried = true;
                            oi.p a10 = oi.p.a(textmath.source, g0.L(this.M + 4), true);
                            if (a10 != null) {
                                textmath.f28658w = a10.f22301b;
                                textmath.h = a10.f22302c;
                                textmath.depth = a10.d;
                                textmath.bitmap = a10.f22300a;
                            }
                        }
                        if (textmath.bitmap != null) {
                            int length2 = spannableStringBuilder.length();
                            spannableStringBuilder.append(" ");
                            int length3 = spannableStringBuilder.length();
                            spannableStringBuilder.setSpan(new yy0(null, textmath.bitmap, textmath.f28658w, textmath.h, org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.G6, this.D), textmath.depth), length2, length3, 33);
                            String str3 = textmath.source;
                            if (str3 != null && !str3.isEmpty()) {
                                spannableStringBuilder.setSpan(new org.telegram.ui.Cells.p9(textmath.source), length2, length3, 33);
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
                            boolean a11 = c8.dd.a(i7, 13);
                            int i20 = i7 & 15;
                            if (i20 >= 1 && i20 <= 6) {
                                TextPaint textPaint = new TextPaint(this.f23814w);
                                new av(this, i7, true).a(textPaint);
                                size = new org.telegram.ui.Components.y5(textcustomemoji.document_id, 0.85f, textPaint.getFontMetricsInt());
                            } else {
                                long j11 = textcustomemoji.document_id;
                                if (a11) {
                                    f10 = 1.0f;
                                }
                                org.telegram.ui.Components.y5 y5Var = new org.telegram.ui.Components.y5(j11, f10, (Paint.FontMetricsInt) null);
                                int i21 = this.M + 4;
                                if (a11) {
                                    i19 = -2;
                                }
                                size = y5Var.setSize(g0.L(i21 + i19));
                            }
                            spannableStringBuilder.setSpan(size, length4, length5, 33);
                        } else if (richText instanceof TL_iv.textSpoiler) {
                            n(richText.text, spannableStringBuilder, i7, new gz0(z(256), 0));
                        } else if (richText instanceof TL_iv.textMention) {
                            TLRPC.TL_messageEntityMention tL_messageEntityMention = new TLRPC.TL_messageEntityMention();
                            ?? obj = new Object();
                            obj.d = tL_messageEntityMention;
                            n(richText.text, spannableStringBuilder, i7, new s41(x(richText), (fz0) obj));
                        } else if (richText instanceof TL_iv.textHashtag) {
                            TLRPC.TL_messageEntityHashtag tL_messageEntityHashtag = new TLRPC.TL_messageEntityHashtag();
                            ?? obj2 = new Object();
                            obj2.d = tL_messageEntityHashtag;
                            n(richText.text, spannableStringBuilder, i7, new s41(x(richText), (fz0) obj2));
                        } else if (richText instanceof TL_iv.textBotCommand) {
                            n(richText.text, spannableStringBuilder, i7, new p41(x(richText), E() ? 1 : 0, null));
                        } else if (richText instanceof TL_iv.textCashtag) {
                            TLRPC.TL_messageEntityCashtag tL_messageEntityCashtag = new TLRPC.TL_messageEntityCashtag();
                            ?? obj3 = new Object();
                            obj3.d = tL_messageEntityCashtag;
                            n(richText.text, spannableStringBuilder, i7, new s41(x(richText), (fz0) obj3));
                        } else if (richText instanceof TL_iv.textAutoUrl) {
                            n(richText.text, spannableStringBuilder, i7, new u41(x(richText), z(1024)));
                        } else if (richText instanceof TL_iv.textAutoEmail) {
                            n(richText.text, spannableStringBuilder, i7, new u41(p5.c.k("mailto:", x(richText)), z(1024)));
                        } else if (richText instanceof TL_iv.textAutoPhone) {
                            String x10 = x(richText);
                            String d2 = pf.b.d(x10, false);
                            if (x10.startsWith("+")) {
                                d2 = p5.c.k("+", d2);
                            }
                            n(richText.text, spannableStringBuilder, i7, new u41(p5.c.k("tel:", d2), z(1024)));
                        } else if (richText instanceof TL_iv.textTonAddress) {
                            n(richText.text, spannableStringBuilder, i7, new s41(p5.c.k("tonaddress:", x(richText)), (fz0) null));
                        } else if (richText instanceof TL_iv.textBankCard) {
                            n(richText.text, spannableStringBuilder, i7, new s41(p5.c.k("card:", x(richText)), (fz0) null));
                        } else if (richText instanceof TL_iv.textMentionName) {
                            TL_iv.RichText richText4 = richText.text;
                            n(richText4, spannableStringBuilder, i7, new v41("" + ((TL_iv.textMentionName) richText).user_id, E() ? 1 : 0, null));
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
                            av avVar = new av(this, i22, false);
                            org.telegram.ui.Components.m00 m00Var = new org.telegram.ui.Components.m00(x(richText), null, tL_messageEntityFormattedDate);
                            int length6 = spannableStringBuilder.length();
                            m(richText5, spannableStringBuilder, i22);
                            if (spannableStringBuilder.length() > length6) {
                                U(avVar, spannableStringBuilder, length6, spannableStringBuilder.length());
                                U(m00Var, spannableStringBuilder, length6, spannableStringBuilder.length());
                            }
                        } else if (richText instanceof TL_iv.textButton) {
                            int length7 = spannableStringBuilder.length();
                            spannableStringBuilder.append("*");
                            cu cuVar = new cu(this, this.B, (TL_iv.textButton) richText, null);
                            cuVar.d = 1.2f;
                            spannableStringBuilder.setSpan(cuVar, length7, spannableStringBuilder.length(), 33);
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
        ArrayList arrayList = this.f23800g;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            ((zt) arrayList.get(i7)).p(arrayList2);
        }
        for (int i10 = 0; i10 < arrayList2.size(); i10++) {
            ((wg0) arrayList2.get(i10)).getClass();
        }
        return arrayList2;
    }

    public final int r(int i7, org.telegram.ui.Cells.y1 y1Var) {
        int I;
        ArrayList arrayList = this.f23800g;
        if (i7 >= 0 && i7 < arrayList.size() && y1Var != null && (this.f23811s || this.f23813u)) {
            float max = Math.max(0.0f, Math.min(1.0f, y1Var.L1));
            zt ztVar = (zt) arrayList.get(i7);
            return Math.round(g0.T1(ztVar.P, ztVar.N, max));
        }
        int i10 = 0;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            zt ztVar2 = (zt) arrayList.get(i11);
            boolean S = ztVar2.S();
            if (i11 == i7) {
                return i10;
            }
            if (S) {
                if (y1Var != null && (this.f23811s || this.f23813u)) {
                    I = g0.W1(Math.max(0.0f, Math.min(1.0f, y1Var.L1)), ztVar2.Q, ztVar2.O);
                } else {
                    I = ztVar2.I();
                }
                i10 = I + i10;
            }
        }
        return this.A;
    }

    public final TLRPC.Document s(long j3) {
        TL_iv.RichMessage richMessage = this.f23797c;
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
            if (document2.f28437id == j3) {
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
        TL_iv.RichMessage richMessage = this.f23797c;
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
            if (photo2.f28455id == j3) {
                return photo2;
            }
        }
        return null;
    }

    public final java.lang.String w(int r22, int r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.ev.w(int, int):java.lang.String");
    }

    public ev(int i7, int i10, org.telegram.ui.ActionBar.h6 h6Var) {
        this.f23798e = new ArrayList();
        this.f23799f = new ArrayList();
        this.f23800g = new ArrayList();
        this.h = new ArrayList();
        this.f23802j = new HashMap();
        this.f23803k = new HashMap();
        this.f23804l = new ArrayList();
        this.f23805m = new HashMap();
        this.f23806n = new ArrayList();
        this.f23807o = new ArrayList();
        this.f23808p = new ArrayList();
        this.f23809q = "";
        this.f23812t = 1.0f;
        TextPaint textPaint = new TextPaint(1);
        this.f23814w = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        this.f23815x = textPaint2;
        this.f23816y = new ok0(null);
        this.f23817z = new h6.m(29);
        this.K = new RectF();
        this.f23796b = null;
        this.f23795a = i7;
        this.B = i10;
        this.D = h6Var;
        int i11 = bz.W0;
        this.M = i11;
        this.N = g0.f24145p;
        textPaint.setTextSize(g0.L(i11));
        textPaint2.setTextSize(g0.L(this.M));
    }
}
