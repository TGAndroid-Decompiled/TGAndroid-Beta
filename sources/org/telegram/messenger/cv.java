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
import org.telegram.ui.Components.dk0;
import org.telegram.ui.Components.du0;
import org.telegram.ui.Components.gk0;
import org.telegram.ui.Components.lx0;
import org.telegram.ui.Components.ly0;
import org.telegram.ui.Components.my0;
import org.telegram.ui.Components.s31;
import org.telegram.ui.Components.ty0;
import org.telegram.ui.Components.uy0;
import org.telegram.ui.Components.v31;
import org.telegram.ui.Components.w70;
import org.telegram.ui.Components.x31;
import org.telegram.ui.Components.y31;
import org.telegram.ui.lg0;
import org.telegram.ui.ng0;
public final class cv {
    public int A;
    public final int B;
    public int C;
    public org.telegram.ui.ActionBar.e6 D;
    public org.telegram.ui.Cells.q1 E;
    public org.telegram.ui.Cells.l1 F;
    public org.telegram.ui.Components.gc G;
    public Paint H;
    public ly0 I;
    public w70 J;
    public final RectF K;
    public boolean L;
    public int M;
    public float N;
    public boolean O;
    public cv P;
    public View Q;
    public yh.e R;
    public int S;
    public int T;
    public org.telegram.ui.Components.u5 U;
    public float V;
    public xt W;
    public int X;
    public IdentityHashMap Y;
    public final int f22065a;
    public final zi f22066b;
    public TL_iv.RichMessage f22067c;
    public boolean d;
    public final ArrayList f22068e;
    public final ArrayList f22069f;
    public final ArrayList f22070g;
    public final ArrayList h;
    public Drawable f22071i;
    public final HashMap f22072j;
    public final HashMap f22073k;
    public final ArrayList f22074l;
    public final HashMap f22075m;
    public final ArrayList f22076n;
    public final ArrayList f22077o;
    public final ArrayList f22078p;
    public Object f22079q;
    public ng0 f22080r;
    public boolean f22081s;
    public float f22082t;
    public boolean f22083u;
    public boolean v;
    public final TextPaint f22084w;
    public final TextPaint f22085x;
    public final dk0 f22086y;
    public final k4.j f22087z;

    public cv(zi ziVar, int i3, cv cvVar) {
        this.f22068e = new ArrayList();
        this.f22069f = new ArrayList();
        this.f22070g = new ArrayList();
        this.h = new ArrayList();
        this.f22072j = new HashMap();
        this.f22073k = new HashMap();
        this.f22074l = new ArrayList();
        this.f22075m = new HashMap();
        this.f22076n = new ArrayList();
        this.f22077o = new ArrayList();
        this.f22078p = new ArrayList();
        this.f22079q = "";
        this.f22082t = 1.0f;
        this.f22084w = new TextPaint(1);
        this.f22085x = new TextPaint(1);
        this.f22086y = new dk0(null);
        this.f22087z = new k4.j(24);
        this.K = new RectF();
        this.f22066b = ziVar;
        this.B = i3;
        this.f22065a = ziVar.I1;
        J(cvVar);
    }

    public static boolean A(TLRPC.PeerColor peerColor) {
        if ((peerColor instanceof TLRPC.TL_peerColorCollectible) || ((peerColor instanceof TLRPC.TL_peerColor) && (peerColor.flags & 1) != 0)) {
            return true;
        }
        return false;
    }

    public static float K(int i3, int i10, float[] fArr) {
        float f10 = 0.0f;
        while (i3 < i10) {
            f10 += fArr[i3];
            i3++;
        }
        return 1000 / Math.max(1.0E-4f, f10);
    }

    public static String N(TL_iv.pageBlockOrderedList pageblockorderedlist, TL_iv.PageListOrderedItem pageListOrderedItem, int i3) {
        if (!TextUtils.isEmpty(pageListOrderedItem.num)) {
            if (pageListOrderedItem.num.endsWith(".")) {
                return pageListOrderedItem.num;
            }
            return a1.g.s(new StringBuilder(), pageListOrderedItem.num, ".");
        } else if (TLObject.hasFlag(pageListOrderedItem.flags, 8)) {
            return a1.g.o(pageListOrderedItem.value, ".", new StringBuilder());
        } else if (TLObject.hasFlag(pageblockorderedlist.flags, 1)) {
            StringBuilder sb2 = new StringBuilder();
            int i10 = pageblockorderedlist.start;
            if (pageblockorderedlist.reversed) {
                i3 = -i3;
            }
            sb2.append(i10 + i3);
            sb2.append(".");
            return sb2.toString();
        } else {
            return (i3 + 1) + ".";
        }
    }

    public static boolean O(int i3, List list) {
        if (i3 > 0 && (list.get(i3 - 1) instanceof TL_iv.pageBlockParagraph)) {
            return true;
        }
        return false;
    }

    public static int R(int i3, int i10) {
        if (i10 == 0) {
            return i3;
        }
        return (i3 & (-16)) | i10;
    }

    public static void Z(StringBuilder sb2, ArrayList arrayList, ArrayList arrayList2) {
        int i3 = 0;
        while (i3 < arrayList.size() && i3 < arrayList2.size() && arrayList.get(i3) == arrayList2.get(i3)) {
            i3++;
        }
        while (arrayList.size() > i3) {
            sb2.append("</blockquote>");
            arrayList.remove(arrayList.size() - 1);
        }
        while (arrayList.size() < arrayList2.size()) {
            sb2.append("<blockquote>");
            arrayList.add((tt) arrayList2.get(arrayList.size()));
        }
    }

    public static void a(StringBuilder sb2, CharSequence charSequence, int i3, int i10, boolean z10) {
        String str;
        String str2;
        if (i10 > i3) {
            SpannableStringBuilder a02 = a0(charSequence.subSequence(i3, i10));
            StringBuilder sb3 = new StringBuilder();
            mi.b4.g(sb3, a02);
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
        yu[] yuVarArr;
        int i3;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
        for (yu yuVar : (yu[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), yu.class)) {
            int spanStart = spannableStringBuilder.getSpanStart(yuVar);
            int spanEnd = spannableStringBuilder.getSpanEnd(yuVar);
            if (spanEnd > spanStart) {
                int i10 = yuVar.f26657b;
                if ((i10 & 16) != 0) {
                    i3 = 1;
                } else {
                    i3 = 0;
                }
                if ((i10 & 32) != 0) {
                    i3 |= 2;
                }
                if ((i10 & 64) != 0) {
                    i3 |= 16;
                }
                if ((i10 & 128) != 0) {
                    i3 |= 8;
                }
                if ((i10 & 256) != 0) {
                    i3 |= 4;
                }
                if ((i10 & 2048) != 0) {
                    i3 |= 16384;
                }
                if ((i10 & 4096) != 0) {
                    i3 |= 32768;
                }
                if ((i10 & 8192) != 0) {
                    i3 |= 65536;
                }
                if (i3 != 0) {
                    ?? obj = new Object();
                    obj.f38578a = i3;
                    spannableStringBuilder.setSpan(new uy0(obj, 0), spanStart, spanEnd, 33);
                }
            }
        }
        return spannableStringBuilder;
    }

    public static void d(StringBuilder sb2, ArrayList arrayList) {
        String str;
        while (!arrayList.isEmpty()) {
            if (((Boolean) org.telegram.ui.Cells.f1.o(1, arrayList)).booleanValue()) {
                str = "</ol>";
            } else {
                str = "</ul>";
            }
            sb2.append(str);
        }
    }

    public static org.telegram.messenger.ri[] e(float[] r34) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.cv.e(float[]):org.telegram.messenger.ri[]");
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
            if (!mi.d6.j(textdiff.text)) {
                y(textdiff.text, sb2);
            } else if (!mi.d6.j(textdiff.old_text)) {
                y(textdiff.old_text, sb2);
            }
        } else if (richText instanceof TL_iv.textConcat) {
            for (int i3 = 0; i3 < richText.texts.size(); i3++) {
                y(richText.texts.get(i3), sb2);
            }
        } else {
            TL_iv.RichText richText2 = richText.text;
            if (richText2 != null) {
                y(richText2, sb2);
            }
        }
    }

    public static ty0 z(int i3) {
        ?? obj = new Object();
        obj.f38578a = i3;
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
        org.telegram.ui.Components.l5 l5Var;
        if (F()) {
            int i3 = 0;
            while (true) {
                ArrayList arrayList = this.f22076n;
                if (i3 >= arrayList.size()) {
                    break;
                }
                org.telegram.ui.Cells.s9 s9Var = (org.telegram.ui.Cells.s9) arrayList.get(i3);
                if ((s9Var instanceof bv) && (l5Var = ((bv) s9Var).F) != null && !l5Var.f35600a.isEmpty()) {
                    return true;
                }
                i3++;
            }
        }
        return false;
    }

    public final boolean D() {
        zi ziVar = this.f22066b;
        if (ziVar != null && ziVar.Q2() && !ziVar.Q3()) {
            return true;
        }
        return false;
    }

    public final boolean E() {
        zi ziVar = this.f22066b;
        if (ziVar != null && ziVar.Q3()) {
            return true;
        }
        return false;
    }

    public final boolean F() {
        ng0 ng0Var = this.f22080r;
        if (ng0Var != null && ng0Var.h) {
            return false;
        }
        return true;
    }

    public final boolean G() {
        org.telegram.ui.Cells.q1 q1Var = this.E;
        if (q1Var != null && q1Var.H2()) {
            return true;
        }
        return false;
    }

    public final boolean H() {
        org.telegram.ui.Cells.s9[] L;
        xt xtVar = this.W;
        if (xtVar != null && (L = xtVar.L()) != null) {
            for (org.telegram.ui.Cells.s9 s9Var : L) {
                if (s9Var instanceof bv) {
                    bv bvVar = (bv) s9Var;
                    if (bvVar.N != null || bvVar.R != null) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final boolean I() {
        TL_iv.RichMessage richMessage = this.f22067c;
        if (richMessage != null && richMessage.rtl) {
            return true;
        }
        return false;
    }

    public final void J(cv cvVar) {
        boolean z10;
        boolean z11;
        float f10;
        boolean z12;
        int i3;
        int i10;
        this.A = 0;
        this.C = 0;
        View view = this.Q;
        ArrayList arrayList = this.f22070g;
        if (view != null) {
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                xt xtVar = (xt) arrayList.get(i11);
                View view2 = xtVar.W;
                if (view2 != null && view2 == view) {
                    xtVar.V();
                    CheckBoxBase checkBoxBase = xtVar.f26440r;
                    if (checkBoxBase != null) {
                        checkBoxBase.f31329l = false;
                    }
                    xtVar.W = null;
                }
            }
        }
        this.f22068e.clear();
        this.f22069f.clear();
        arrayList.clear();
        this.h.clear();
        this.f22072j.clear();
        this.f22073k.clear();
        this.f22074l.clear();
        this.f22075m.clear();
        this.f22076n.clear();
        this.f22077o.clear();
        this.f22078p.clear();
        this.f22079q = "";
        this.M = az.W0;
        this.N = g0.f22607p;
        this.f22084w.setTextSize(g0.L(az.W0));
        this.f22085x.setTextSize(g0.L(az.W0));
        this.d = false;
        this.f22067c = null;
        zi ziVar = this.f22066b;
        if (ziVar != null && ziVar.f26868k != null && ziVar.E0() != null) {
            TL_iv.RichMessage E0 = ziVar.E0();
            this.f22067c = E0;
            this.d = E0.part;
            this.P = cvVar;
            for (int i12 = 0; i12 < this.f22067c.blocks.size(); i12++) {
                TL_iv.PageBlock pageBlock = this.f22067c.blocks.get(i12);
                xt j10 = j(pageBlock, 0, new Rect(), 0, O(i12, this.f22067c.blocks));
                if ((j10 instanceof ru) && (((z12 = pageBlock instanceof TL_iv.pageBlockParagraph)) || org.telegram.ui.i4.I(pageBlock))) {
                    ru ruVar = (ru) j10;
                    if (i12 == 0 && z12) {
                        i3 = 0;
                    } else {
                        i3 = ruVar.f25232a0;
                    }
                    if (i12 == this.f22067c.blocks.size() - 1) {
                        i10 = 0;
                    } else {
                        i10 = ruVar.f25233b0;
                    }
                    ruVar.j0(i3, i10);
                }
            }
            for (int i13 = 0; i13 < arrayList.size(); i13++) {
                xt xtVar2 = (xt) arrayList.get(i13);
                if ((xtVar2 instanceof ru) && xtVar2.f26442w > 0) {
                    if (i13 > 0 && ((xt) arrayList.get(i13 - 1)).f26442w > 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    int i14 = i13 + 1;
                    if (i14 < arrayList.size() && ((xt) arrayList.get(i14)).f26442w > 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    ru ruVar2 = (ru) xtVar2;
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
                    ruVar2.j0(L, g0.L(f11));
                }
            }
            this.P = null;
            if (this.f22080r != null) {
                for (int i15 = 0; i15 < arrayList.size(); i15++) {
                    ((xt) arrayList.get(i15)).L = this.f22080r;
                }
                this.f22080r.k(p());
            }
            if (view != null) {
                for (int i16 = 0; i16 < arrayList.size(); i16++) {
                    ((xt) arrayList.get(i16)).m(view);
                }
            }
            Q();
            X();
        }
    }

    public final boolean L(TL_iv.RichMessage richMessage, int i3) {
        if (this.f22067c == richMessage && this.M == az.W0 && Math.abs(this.N - g0.f22607p) <= 0.1f && i3 == this.B) {
            return false;
        }
        return true;
    }

    public final boolean M(android.view.MotionEvent r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.cv.M(android.view.MotionEvent):boolean");
    }

    public final ArrayList P(int i3) {
        ArrayList arrayList = new ArrayList();
        if (i3 >= 0) {
            ArrayList arrayList2 = this.h;
            int size = arrayList2.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList2.get(i10);
                i10++;
                tt ttVar = (tt) obj;
                if (i3 >= ttVar.f25591a && i3 <= ttVar.f25592b) {
                    arrayList.add(ttVar);
                }
            }
            Collections.sort(arrayList, new tq(4));
        }
        return arrayList;
    }

    public final void Q() {
        ArrayList arrayList;
        this.A = 0;
        this.C = 0;
        ArrayList arrayList2 = this.f22076n;
        arrayList2.clear();
        ArrayList arrayList3 = this.f22077o;
        arrayList3.clear();
        ArrayList arrayList4 = this.f22078p;
        arrayList4.clear();
        int i3 = 0;
        while (true) {
            arrayList = this.f22070g;
            if (i3 >= arrayList.size()) {
                break;
            }
            this.C = Math.max(this.C, ((xt) arrayList.get(i3)).K());
            i3++;
        }
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            xt xtVar = (xt) arrayList.get(i10);
            if (xtVar instanceof qu) {
                qu quVar = (qu) xtVar;
                int i11 = this.C;
                int i12 = quVar.f24966f0;
                int i13 = quVar.f24965e0;
                Rect rect = quVar.f26435b;
                int max = Math.max(i12, Math.min(i13, Math.max(0, (i11 - rect.left) - rect.right)));
                quVar.f24967g0 = max;
                lx0 lx0Var = quVar.Y;
                lx0Var.setRenderWidth(max);
                quVar.f24968h0 = lx0Var.getRenderHeight();
            }
        }
        StringBuilder sb2 = new StringBuilder();
        int i14 = 0;
        for (int i15 = 0; i15 < arrayList.size(); i15++) {
            xt xtVar2 = (xt) arrayList.get(i15);
            boolean S = xtVar2.S();
            xtVar2.N = i14;
            xtVar2.O = 0;
            xtVar2.R = S;
            Rect rect2 = xtVar2.f26435b;
            xtVar2.Z(rect2.left, rect2.top + i14, i15);
            if (S) {
                org.telegram.ui.Cells.s9[] L = xtVar2.L();
                if (L != null) {
                    for (org.telegram.ui.Cells.s9 s9Var : L) {
                        if (s9Var != null && s9Var.a() != null) {
                            if (sb2.length() > 0) {
                                sb2.append('\n');
                            }
                            arrayList3.add(Integer.valueOf(sb2.length()));
                            arrayList4.add(Integer.valueOf(i15));
                            arrayList2.add(s9Var);
                            CharSequence text = s9Var.a().getText();
                            if (text != null) {
                                sb2.append(text);
                            }
                        }
                    }
                }
                int I = xtVar2.I();
                xtVar2.O = I;
                i14 += I;
            }
        }
        this.A = i14;
        this.f22079q = sb2;
    }

    public final void S(int i3, int i10) {
        if (this.S != i3 || this.T != i10) {
            this.S = i3;
            this.T = i10;
            int i11 = 0;
            while (true) {
                ArrayList arrayList = this.f22070g;
                if (i11 < arrayList.size()) {
                    xt xtVar = (xt) arrayList.get(i11);
                    if (xtVar instanceof du) {
                        du duVar = (du) xtVar;
                        bv bvVar = duVar.Y;
                        bvVar.f21889c = (g0.L(53.0f) + (duVar.T - duVar.f26434a.S)) - bvVar.f21891f;
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

    public final void U(CharacterStyle characterStyle, final SpannableStringBuilder spannableStringBuilder, int i3, int i10) {
        if (characterStyle instanceof yu) {
            int i11 = ((yu) characterStyle).f26657b;
            yu[] yuVarArr = (yu[]) spannableStringBuilder.getSpans(i3, i10, yu.class);
            if (yuVarArr != null && yuVarArr.length > 0) {
                Arrays.sort(yuVarArr, Comparator$CC.comparingInt(new ToIntFunction() {
                    @Override
                    public final int applyAsInt(Object obj) {
                        return spannableStringBuilder.getSpanStart((yu) obj);
                    }
                }));
                for (int i12 = 0; i12 < yuVarArr.length; i12++) {
                    int spanStart = spannableStringBuilder.getSpanStart(yuVarArr[i12]);
                    int spanEnd = spannableStringBuilder.getSpanEnd(yuVarArr[i12]);
                    if (spanStart > i3) {
                        V(spannableStringBuilder, i3, spanStart, i11);
                    }
                    i3 = Math.max(i3, spanEnd);
                }
                if (i3 < i10) {
                    V(spannableStringBuilder, i3, i10, i11);
                    return;
                }
                return;
            }
            V(spannableStringBuilder, i3, i10, i11);
            return;
        }
        spannableStringBuilder.setSpan(characterStyle, i3, i10, 33);
    }

    public final void V(SpannableStringBuilder spannableStringBuilder, int i3, int i10, int i11) {
        boolean z10;
        while (i3 < i10) {
            int nextSpanTransition = spannableStringBuilder.nextSpanTransition(i3, i10, URLSpan.class);
            if (((URLSpan[]) spannableStringBuilder.getSpans(i3, nextSpanTransition, URLSpan.class)).length > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            spannableStringBuilder.setSpan(new yu(this, i11, z10), i3, nextSpanTransition, 33);
            i3 = nextSpanTransition;
        }
    }

    public final void W(ng0 ng0Var) {
        this.f22080r = ng0Var;
        int i3 = 0;
        while (true) {
            ArrayList arrayList = this.f22070g;
            if (i3 < arrayList.size()) {
                ((xt) arrayList.get(i3)).L = ng0Var;
                arrayList.get(i3);
                ((xt) arrayList.get(i3)).getClass();
                i3++;
            } else {
                return;
            }
        }
    }

    public final void X() {
        int i3 = 0;
        while (true) {
            ArrayList arrayList = this.f22070g;
            if (i3 < arrayList.size()) {
                ((xt) arrayList.get(i3)).d0();
                i3++;
            } else {
                return;
            }
        }
    }

    public final boolean Y() {
        ArrayList arrayList = this.f22070g;
        if (arrayList.isEmpty()) {
            return false;
        }
        xt xtVar = (xt) arrayList.get(0);
        if (!(xtVar instanceof ku) && !(xtVar instanceof wu) && !(xtVar instanceof cu) && !(xtVar instanceof ou) && !(xtVar instanceof gk0)) {
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
            int i3 = 0;
            while (true) {
                ArrayList arrayList = this.f22070g;
                if (i3 < arrayList.size()) {
                    ((xt) arrayList.get(i3)).m(view);
                    i3++;
                } else {
                    return;
                }
            }
        }
    }

    public final void b0(int i3) {
        bv bvVar;
        View view;
        boolean z10;
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f22076n;
            if (i10 < arrayList.size()) {
                org.telegram.ui.Cells.s9 s9Var = (org.telegram.ui.Cells.s9) arrayList.get(i10);
                if ((s9Var instanceof bv) && (view = (bvVar = (bv) s9Var).T) != null) {
                    org.telegram.ui.Components.p5.release(view, bvVar.F);
                    bvVar.F = null;
                    View view2 = bvVar.T;
                    if (bvVar.f21887a.v && !bvVar.f21895w) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    bvVar.F = org.telegram.ui.Components.p5.update(i3, view2, z10, (org.telegram.ui.Components.l5) null, bvVar.f21888b);
                }
                i10++;
            } else {
                return;
            }
        }
    }

    public final void c(org.telegram.tgnet.TLRPC.Chat r10, org.telegram.tgnet.TLRPC.User r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.cv.c(org.telegram.tgnet.TLRPC$Chat, org.telegram.tgnet.TLRPC$User):void");
    }

    public final void f(View view) {
        View view2 = this.Q;
        if (view2 == view && view2 != null) {
            yh.e eVar = this.R;
            if (eVar != null) {
                eVar.b(view);
                this.R = null;
            }
            this.Q = null;
            int i3 = 0;
            while (true) {
                ArrayList arrayList = this.f22070g;
                if (i3 >= arrayList.size()) {
                    break;
                }
                xt xtVar = (xt) arrayList.get(i3);
                View view3 = xtVar.W;
                if (view3 != null && view3 == view) {
                    xtVar.V();
                    CheckBoxBase checkBoxBase = xtVar.f26440r;
                    if (checkBoxBase != null) {
                        checkBoxBase.f31329l = false;
                    }
                    xtVar.W = null;
                }
                i3++;
            }
            if (view == this.E) {
                this.E = null;
                this.F = null;
            }
        }
    }

    public final void g(Canvas canvas, int i3, int i10, org.telegram.ui.Cells.x1 x1Var) {
        int i11;
        boolean z10;
        float f10;
        float f11;
        int i12;
        int i13;
        boolean z11;
        org.telegram.ui.Cells.l1 l1Var;
        S(i3, i10);
        if (E()) {
            i11 = org.telegram.ui.ActionBar.k6.Vc;
        } else {
            i11 = org.telegram.ui.ActionBar.k6.Uc;
        }
        this.f22084w.linkColor = org.telegram.ui.ActionBar.k6.w0(i11, this.D);
        boolean z12 = this.d;
        int min = Math.min(this.A, g0.L(900.0f));
        if (z12) {
            canvas.saveLayerAlpha(-i3, 0.0f, this.C + i10, min, 255, 31);
        }
        org.telegram.ui.Cells.q1 q1Var = this.E;
        boolean z13 = false;
        if (q1Var != null && q1Var.f30056qc > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            float f12 = q1Var.f30030oc - q1Var.f30094u0;
            f11 = q1Var.f30056qc + f12;
            f10 = f12;
        } else {
            f10 = 0.0f;
            f11 = 0.0f;
        }
        h(canvas, x1Var, z10, f10, f11);
        if (z12) {
            RectF rectF = g0.P;
            rectF.set(-i3, min - g0.L(32.0f), this.C + i10, min);
            this.f22087z.w(canvas, rectF, 3, 1.0f);
            canvas.restore();
            if (E()) {
                i12 = org.telegram.ui.ActionBar.k6.Lb;
            } else {
                i12 = org.telegram.ui.ActionBar.k6.f28278yd;
            }
            int w02 = org.telegram.ui.ActionBar.k6.w0(i12, this.D);
            if (this.I == null) {
                this.I = new ly0(bd.M0(2131745349, null), 16.0f, g0.o());
            }
            org.telegram.ui.Components.gc gcVar = this.G;
            if (gcVar == null) {
                this.G = new org.telegram.ui.Components.gc(this.Q, 1.5f, 2.0f);
            } else {
                View view = gcVar.f34043a;
                View view2 = this.Q;
                if (view != view2) {
                    gcVar.f34043a = view2;
                }
            }
            if (this.H == null) {
                this.H = new Paint(1);
            }
            this.H.setColor(org.telegram.ui.ActionBar.k6.r1(0.1f, w02));
            float f13 = this.I.f35918c;
            int i14 = this.C;
            float f14 = (((i14 + i13) + this.T) / 2.0f) - this.S;
            float L = g0.L(4.0f) + min;
            float L2 = (((this.C + this.S) + this.T) - g0.L(24.0f)) / 2.0f;
            RectF rectF2 = this.K;
            rectF2.set(f14 - L2, L, f14 + L2, g0.L(42.0f) + L);
            org.telegram.ui.Cells.q1 q1Var2 = this.E;
            if (q1Var2 != null && (l1Var = this.F) != null && l1Var.p1(q1Var2, 7)) {
                z11 = true;
            } else {
                z11 = false;
            }
            w70 w70Var = this.J;
            if (w70Var != null && !z11 && !w70Var.c() && !this.J.d()) {
                this.J.a();
            }
            w70 w70Var2 = this.J;
            if (w70Var2 == null && z11) {
                w70 w70Var3 = new w70();
                this.J = w70Var3;
                w70Var3.f39944x.setStrokeWidth(g0.L(1.25f));
                this.J.D = true;
            } else if (w70Var2 != null && z11 && (w70Var2.c() || this.J.d())) {
                w70 w70Var4 = this.J;
                w70Var4.f39925b = -1L;
                w70Var4.f39926c = -1L;
            }
            w70 w70Var5 = this.J;
            if (w70Var5 != null) {
                w70Var5.g(org.telegram.ui.ActionBar.k6.r1(0.1f, w02), org.telegram.ui.ActionBar.k6.r1(0.3f, w02), org.telegram.ui.ActionBar.k6.r1(0.3f, w02), org.telegram.ui.ActionBar.k6.r1(1.2f, w02));
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
            w70 w70Var6 = this.J;
            if (w70Var6 != null && !w70Var6.c()) {
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

    public final void h(Canvas canvas, org.telegram.ui.Cells.x1 x1Var, boolean z10, float f10, float f11) {
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
        du duVar;
        float f17;
        float f18;
        float f19;
        int i3;
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
                tt ttVar = (tt) arrayList.get(i14);
                int r5 = r(ttVar.f25591a, x1Var);
                int i16 = ttVar.f25592b;
                ArrayList arrayList2 = this.f22070g;
                float f28 = 4.0f;
                if (i16 >= 0 && i16 < arrayList2.size() && x1Var != null && (this.f22081s || this.f22083u)) {
                    float max = Math.max(f26, Math.min(f27, x1Var.L1));
                    xt xtVar = (xt) arrayList2.get(i16);
                    int d = k2.p1.d(4.0f, xtVar.f26435b.bottom, i13);
                    float f29 = xtVar.P + xtVar.Q;
                    if (xtVar.S) {
                        i12 = d;
                    } else {
                        i12 = i13;
                    }
                    float f30 = f29 - i12;
                    float f31 = xtVar.N + xtVar.O;
                    if (!xtVar.R) {
                        d = i13;
                    }
                    i11 = Math.round(g0.T1(f30, f31 - d, max));
                } else {
                    int i17 = i13;
                    int i18 = i17;
                    while (true) {
                        if (i17 < arrayList2.size()) {
                            xt xtVar2 = (xt) arrayList2.get(i17);
                            boolean S = xtVar2.S();
                            float f32 = f28;
                            Rect rect = xtVar2.f26435b;
                            if (S) {
                                if (x1Var != null && (this.f22081s || this.f22083u)) {
                                    I2 = g0.W1(Math.max(0.0f, Math.min(f27, x1Var.L1)), xtVar2.Q, xtVar2.O);
                                } else {
                                    I2 = xtVar2.I();
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
                int i20 = ttVar.f25592b;
                ArrayList arrayList3 = this.f22070g;
                float f33 = 1.0f;
                for (int i21 = ttVar.f25591a; i21 < Math.min(i20 + 1, arrayList3.size()); i21++) {
                    xt xtVar3 = (xt) arrayList3.get(i21);
                    if (xtVar3.S()) {
                        f33 = xtVar3.z() * f33;
                    }
                }
                int L = g0.L(3.0f) * ttVar.d;
                int i22 = ttVar.f25594e + L;
                int i23 = L + ttVar.f25595f;
                if (i11 - r5 > i22 + i23) {
                    r5 += i22;
                    i11 -= i23;
                }
                RectF rectF = g0.P;
                rectF.set(ttVar.f25593c, r5, this.C - g0.L(ttVar.d * 12), i11);
                canvas3.save();
                canvas3.scale(f33, f33, rectF.centerX(), rectF.centerY());
                float floor = (float) Math.floor(az.Y0 / 3.0f);
                this.f22086y.d(canvas3, rectF, floor, floor, floor, 1.0f, false, false);
                this.f22086y.f(canvas3, rectF, 1.0f);
                canvas3.restore();
                size = size;
                i14 = i15;
                f26 = 0.0f;
                f27 = 1.0f;
                i13 = 0;
            }
        }
        int i24 = 0;
        while (i24 < this.f22070g.size()) {
            xt xtVar4 = (xt) this.f22070g.get(i24);
            if ((xtVar4 instanceof mu) && (xtVar4.R || xtVar4.S)) {
                mu muVar = (mu) xtVar4;
                int r9 = muVar.X.r();
                bv bvVar = muVar.Y;
                if (bvVar != null) {
                    i10 = bvVar.r();
                } else {
                    i10 = 0;
                }
                int max2 = Math.max(r9, i10);
                if (max2 > 0) {
                    if (x1Var != null && (this.f22081s || this.f22083u)) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if (z14) {
                        f20 = Math.max(0.0f, Math.min(1.0f, x1Var.L1));
                    } else {
                        f20 = 1.0f;
                    }
                    if (z14) {
                        if (muVar.S) {
                            f23 = 1.0f;
                        } else {
                            f23 = 0.0f;
                        }
                        if (muVar.R) {
                            f24 = 1.0f;
                        } else {
                            f24 = 0.0f;
                        }
                        f21 = g0.T1(f23, f24, f20);
                    } else if (muVar.R) {
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
                            f22 = g0.T1(muVar.P, muVar.N, f20);
                        } else {
                            f22 = muVar.N;
                        }
                        if (z14) {
                            I = g0.W1(f20, muVar.Q, muVar.O);
                        } else {
                            I = muVar.I();
                        }
                        float L4 = g0.L(8.0f) + f22;
                        float L5 = (f22 + I) - g0.L(8.0f);
                        if (L5 > L4) {
                            RectF rectF2 = g0.P;
                            rectF2.set(L2, L4, L3, L5);
                            float floor2 = (float) Math.floor(az.Y0 / 2.0f);
                            this.f22086y.d(canvas3, rectF2, floor2, floor2, floor2, f21, false, false);
                            if (this.f22071i == null) {
                                this.f22071i = t0.f25457b.getDrawable(2131231966).mutate();
                            }
                            this.f22071i.setColorFilter(this.f22086y.i(), PorterDuff.Mode.SRC_IN);
                            this.f22071i.setAlpha((int) (f21 * 255.0f));
                            int intrinsicWidth = this.f22071i.getIntrinsicWidth();
                            int intrinsicHeight = this.f22071i.getIntrinsicHeight();
                            canvas3.save();
                            canvas3.clipRect(L2, L4, L3, L5);
                            int i25 = (int) L2;
                            int i26 = (int) L4;
                            i3 = i24;
                            this.f22071i.setBounds(g0.L(8.0f) + i25, g0.L(7.0f) + i26, k5.C(8.0f, i25, intrinsicWidth), k5.C(7.0f, i26, intrinsicHeight));
                            canvas3.scale(-1.0f, -1.0f, this.f22071i.getBounds().centerX(), this.f22071i.getBounds().centerY());
                            this.f22071i.draw(canvas3);
                            canvas3.restore();
                            canvas3.save();
                            canvas3.clipRect(L2, L4, L3, L5);
                            int i27 = (int) L3;
                            int i28 = (int) L5;
                            this.f22071i.setBounds(k5.z(8.0f, i27, intrinsicWidth), k5.z(7.0f, i28, intrinsicHeight), i27 - g0.L(8.0f), i28 - g0.L(7.0f));
                            canvas3.scale(1.0f, -1.0f, this.f22071i.getBounds().centerX(), this.f22071i.getBounds().centerY());
                            this.f22071i.draw(canvas3);
                            canvas3.restore();
                            this.f22071i.setAlpha(255);
                            i24 = i3 + 1;
                        }
                    }
                }
            }
            i3 = i24;
            i24 = i3 + 1;
        }
        zi ziVar = this.f22066b;
        if (!this.O && (ziVar == null || !hp.s1(this.f22065a).f23120s7.A(ziVar))) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (!z11 && this.U == null) {
            this.V = 0.0f;
        } else {
            if (this.U == null) {
                this.U = new org.telegram.ui.Components.u5(0L, 350L, org.telegram.ui.Components.xq.h);
            }
            org.telegram.ui.Components.u5 u5Var = this.U;
            if (z11) {
                f12 = 1.0f;
            } else {
                f12 = 0.0f;
            }
            float e10 = u5Var.e(false, f12);
            this.V = e10;
            if (e10 > 0.0f && (view = this.Q) != null) {
                view.invalidate();
            }
        }
        if (x1Var == null || (!this.f22081s && !this.f22083u)) {
            f13 = 1.0f;
            f14 = 1.0f;
        } else {
            f13 = 1.0f;
            f14 = Math.max(0.0f, Math.min(1.0f, x1Var.L1));
        }
        this.f22082t = f14;
        int i29 = (f14 > f13 ? 1 : (f14 == f13 ? 0 : -1));
        if (i29 >= 0) {
            this.f22081s = false;
            this.f22083u = false;
        }
        boolean z15 = this.f22081s;
        if (!z15 && !this.f22083u) {
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
            ArrayList arrayList4 = this.f22070g;
            for (int i30 = 0; i30 < arrayList4.size(); i30++) {
                xt xtVar5 = (xt) arrayList4.get(i30);
                if (xtVar5 instanceof du) {
                    du duVar2 = (du) xtVar5;
                    duVar2.f22247e0 = g0.T1(duVar2.P, duVar2.N, f14) + duVar2.I();
                    int i31 = i30 + 1;
                    while (true) {
                        if (i31 < arrayList4.size()) {
                            xt xtVar6 = (xt) arrayList4.get(i31);
                            do {
                                xtVar6 = xtVar6.M;
                                if (xtVar6 == null) {
                                    f19 = g0.T1(((xt) arrayList4.get(i31)).P, ((xt) arrayList4.get(i31)).N, f14);
                                    break;
                                }
                            } while (xtVar6 != duVar2);
                            i31++;
                        } else {
                            f19 = Float.MAX_VALUE;
                            break;
                        }
                    }
                    duVar2.f22248f0 = f19;
                }
            }
        }
        ArrayList arrayList5 = this.f22070g;
        for (int i32 = 0; i32 < arrayList5.size(); i32++) {
            xt xtVar7 = (xt) arrayList5.get(i32);
            if (xtVar7 instanceof su) {
                su suVar = (su) xtVar7;
                if (suVar.f25430i0) {
                    f17 = 1.0f;
                } else {
                    f17 = 0.0f;
                }
                if (suVar.f25429h0) {
                    f18 = 1.0f;
                } else {
                    f18 = 0.0f;
                }
                suVar.f25431j0 = g0.T1(f17, f18, f14);
                suVar.f25432k0 = g0.W1(f14, suVar.Q, suVar.O);
            }
        }
        int i33 = 0;
        while (i33 < this.f22070g.size()) {
            xt xtVar8 = (xt) this.f22070g.get(i33);
            if (xtVar8.R || xtVar8.S) {
                float T12 = g0.T1(xtVar8.P, xtVar8.N, f14);
                boolean z16 = xtVar8 instanceof eu;
                if (z16) {
                    T1 = 1.0f;
                } else {
                    if (xtVar8.S) {
                        f15 = 1.0f;
                    } else {
                        f15 = 0.0f;
                    }
                    if (xtVar8.R) {
                        f16 = 1.0f;
                    } else {
                        f16 = 0.0f;
                    }
                    T1 = g0.T1(f15, f16, f14);
                }
                if (T1 > 0.0f) {
                    int I3 = xtVar8.I();
                    if (!z12 || (I3 + T12 > f10 && T12 < f11)) {
                        canvas3.save();
                        if (z13 && (duVar = xtVar8.M) != null && !z16) {
                            float f36 = -3.4028235E38f;
                            float f37 = Float.MAX_VALUE;
                            for (duVar = xtVar8.M; duVar != null; duVar = duVar.M) {
                                f36 = Math.max(f36, duVar.f22247e0);
                                f37 = Math.min(f37, duVar.f22248f0);
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
                            xtVar8.t(canvas2);
                            canvas2.restoreToCount(saveLayerAlpha);
                        } else {
                            canvas2 = canvas3;
                            xtVar8.t(canvas2);
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
            int i3 = 0;
            while (true) {
                ArrayList arrayList = this.f22070g;
                if (i3 < arrayList.size()) {
                    xt xtVar = (xt) arrayList.get(i3);
                    if (xtVar.R) {
                        canvas.save();
                        canvas.translate(0.0f, xtVar.N);
                        xtVar.s(canvas, colorFilter);
                        canvas.restore();
                    }
                    i3++;
                } else {
                    return;
                }
            }
        }
    }

    public final org.telegram.messenger.xt j(org.telegram.tgnet.tl.TL_iv.PageBlock r29, int r30, android.graphics.Rect r31, int r32, boolean r33) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.cv.j(org.telegram.tgnet.tl.TL_iv$PageBlock, int, android.graphics.Rect, int, boolean):org.telegram.messenger.xt");
    }

    public final void k(TL_iv.PageCaption pageCaption, Rect rect, int i3) {
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
            int R = R(i3, 10);
            SpannableStringBuilder spannableStringBuilder2 = null;
            if (z10) {
                spannableStringBuilder = l(pageCaption.text, R);
            } else {
                spannableStringBuilder = null;
            }
            if (z11) {
                spannableStringBuilder2 = l(pageCaption.credit, R);
            }
            this.f22070g.add(new bu(this, rect, this.B, spannableStringBuilder, spannableStringBuilder2));
        }
    }

    public final SpannableStringBuilder l(TL_iv.RichText richText, int i3) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (i3 == 0) {
            m(richText, spannableStringBuilder, 0);
        } else {
            n(richText, spannableStringBuilder, i3, new yu(this, i3, false));
        }
        if (richText != null && spannableStringBuilder.length() > 0) {
            spannableStringBuilder.setSpan(new ut(richText, i3), 0, spannableStringBuilder.length(), 33);
        }
        return spannableStringBuilder;
    }

    public final void m(TL_iv.RichText richText, SpannableStringBuilder spannableStringBuilder, int i3) {
        CharSequence charSequence;
        Object size;
        int length = spannableStringBuilder.length();
        if (!(richText instanceof TL_iv.textEmpty)) {
            if (richText instanceof TL_iv.textPlain) {
                spannableStringBuilder.append(((TL_iv.textPlain) richText).text);
            } else {
                if (richText instanceof TL_iv.textDiff) {
                    TL_iv.textDiff textdiff = (TL_iv.textDiff) richText;
                    boolean j10 = mi.d6.j(textdiff.text);
                    boolean j11 = mi.d6.j(textdiff.old_text);
                    if (j10 && !j11) {
                        n(textdiff.old_text, spannableStringBuilder, i3, new uy0(z(8192), 0));
                    } else if (!j10 && j11) {
                        n(textdiff.text, spannableStringBuilder, i3, new uy0(z(4096), 0));
                    } else if (!j10) {
                        n(textdiff.text, spannableStringBuilder, i3, new du0());
                    }
                } else if (richText instanceof TL_iv.textBold) {
                    int i10 = i3 | 16;
                    n(richText.text, spannableStringBuilder, i10, new yu(this, i10, false));
                } else if (richText instanceof TL_iv.textItalic) {
                    int i11 = i3 | 32;
                    n(richText.text, spannableStringBuilder, i11, new yu(this, i11, false));
                } else if (richText instanceof TL_iv.textUnderline) {
                    int i12 = i3 | 64;
                    n(richText.text, spannableStringBuilder, i12, new yu(this, i12, false));
                } else if (richText instanceof TL_iv.textStrike) {
                    int i13 = i3 | 128;
                    n(richText.text, spannableStringBuilder, i13, new yu(this, i13, false));
                } else if (richText instanceof TL_iv.textFixed) {
                    int i14 = i3 | 256;
                    n(richText.text, spannableStringBuilder, i14, new yu(this, i14, false));
                } else if (richText instanceof TL_iv.textUrl) {
                    n(richText.text, spannableStringBuilder, i3, new x31(((TL_iv.textUrl) richText).url, z(1024)));
                } else if (richText instanceof TL_iv.textEmail) {
                    TL_iv.RichText richText2 = richText.text;
                    n(richText2, spannableStringBuilder, i3, new x31("mailto:" + ((TL_iv.textEmail) richText).email, z(1024)));
                } else if (richText instanceof TL_iv.textConcat) {
                    for (int i15 = 0; i15 < richText.texts.size(); i15++) {
                        m(richText.texts.get(i15), spannableStringBuilder, i3);
                    }
                } else if (richText instanceof TL_iv.textSubscript) {
                    int i16 = i3 | 2048;
                    n(richText.text, spannableStringBuilder, i16, new yu(this, i16, false));
                } else if (richText instanceof TL_iv.textSuperscript) {
                    int i17 = i3 | 4096;
                    n(richText.text, spannableStringBuilder, i17, new yu(this, i17, false));
                } else if (richText instanceof TL_iv.textMarked) {
                    int i18 = i3 | 8192;
                    n(richText.text, spannableStringBuilder, i18, new yu(this, i18, false));
                } else if (richText instanceof TL_iv.textPhone) {
                    TL_iv.textPhone textphone = (TL_iv.textPhone) richText;
                    String d = mf.b.d(textphone.phone, false);
                    if (textphone.phone.startsWith("+")) {
                        d = t4.c.f("+", d);
                    }
                    n(richText.text, spannableStringBuilder, i3, new x31(t4.c.f("tel:", d), z(1024)));
                } else if (richText instanceof TL_iv.textAnchor) {
                    TL_iv.textAnchor textanchor = (TL_iv.textAnchor) richText;
                    String str = textanchor.name;
                    if (str != null) {
                        String lowerCase = str.toLowerCase();
                        if (!(textanchor.text instanceof TL_iv.textEmpty)) {
                            this.f22073k.put(lowerCase, textanchor);
                        } else {
                            HashMap hashMap = this.f22072j;
                            if (!hashMap.containsKey(lowerCase)) {
                                hashMap.put(lowerCase, Integer.valueOf(this.f22070g.size()));
                            }
                        }
                    }
                    TL_iv.RichText richText3 = richText.text;
                    String str2 = textanchor.name;
                    if (str2 != null) {
                        str2.toLowerCase();
                    }
                    n(richText3, spannableStringBuilder, i3, new gi.t9(3));
                } else {
                    int i19 = 4;
                    if (richText instanceof TL_iv.textMath) {
                        TL_iv.textMath textmath = (TL_iv.textMath) richText;
                        if (textmath.bitmap == null && !textmath.tried) {
                            textmath.tried = true;
                            mi.q a10 = mi.q.a(textmath.source, g0.L(this.M + 4), true);
                            if (a10 != null) {
                                textmath.f27228w = a10.f19825b;
                                textmath.h = a10.f19826c;
                                textmath.depth = a10.d;
                                textmath.bitmap = a10.f19824a;
                            }
                        }
                        if (textmath.bitmap != null) {
                            int length2 = spannableStringBuilder.length();
                            spannableStringBuilder.append(" ");
                            int length3 = spannableStringBuilder.length();
                            spannableStringBuilder.setSpan(new my0(null, textmath.bitmap, textmath.f27228w, textmath.h, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.G6, this.D), textmath.depth), length2, length3, 33);
                            String str3 = textmath.source;
                            if (str3 != null && !str3.isEmpty()) {
                                spannableStringBuilder.setSpan(new org.telegram.ui.Cells.n9(textmath.source), length2, length3, 33);
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
                            boolean a11 = x7.u.a(i3, 13);
                            int i20 = i3 & 15;
                            if (i20 >= 1 && i20 <= 6) {
                                TextPaint textPaint = new TextPaint(this.f22084w);
                                new yu(this, i3, true).a(textPaint);
                                size = new org.telegram.ui.Components.p5(textcustomemoji.document_id, 0.85f, textPaint.getFontMetricsInt());
                            } else {
                                long j12 = textcustomemoji.document_id;
                                if (a11) {
                                    f10 = 1.0f;
                                }
                                org.telegram.ui.Components.p5 p5Var = new org.telegram.ui.Components.p5(j12, f10, (Paint.FontMetricsInt) null);
                                int i21 = this.M + 4;
                                if (a11) {
                                    i19 = -2;
                                }
                                size = p5Var.setSize(g0.L(i21 + i19));
                            }
                            spannableStringBuilder.setSpan(size, length4, length5, 33);
                        } else if (richText instanceof TL_iv.textSpoiler) {
                            n(richText.text, spannableStringBuilder, i3, new uy0(z(256), 0));
                        } else if (richText instanceof TL_iv.textMention) {
                            TLRPC.TL_messageEntityMention tL_messageEntityMention = new TLRPC.TL_messageEntityMention();
                            ?? obj = new Object();
                            obj.d = tL_messageEntityMention;
                            n(richText.text, spannableStringBuilder, i3, new v31(x(richText), (ty0) obj));
                        } else if (richText instanceof TL_iv.textHashtag) {
                            TLRPC.TL_messageEntityHashtag tL_messageEntityHashtag = new TLRPC.TL_messageEntityHashtag();
                            ?? obj2 = new Object();
                            obj2.d = tL_messageEntityHashtag;
                            n(richText.text, spannableStringBuilder, i3, new v31(x(richText), (ty0) obj2));
                        } else if (richText instanceof TL_iv.textBotCommand) {
                            n(richText.text, spannableStringBuilder, i3, new s31(x(richText), E() ? 1 : 0, null));
                        } else if (richText instanceof TL_iv.textCashtag) {
                            TLRPC.TL_messageEntityCashtag tL_messageEntityCashtag = new TLRPC.TL_messageEntityCashtag();
                            ?? obj3 = new Object();
                            obj3.d = tL_messageEntityCashtag;
                            n(richText.text, spannableStringBuilder, i3, new v31(x(richText), (ty0) obj3));
                        } else if (richText instanceof TL_iv.textAutoUrl) {
                            n(richText.text, spannableStringBuilder, i3, new x31(x(richText), z(1024)));
                        } else if (richText instanceof TL_iv.textAutoEmail) {
                            n(richText.text, spannableStringBuilder, i3, new x31(t4.c.f("mailto:", x(richText)), z(1024)));
                        } else if (richText instanceof TL_iv.textAutoPhone) {
                            String x10 = x(richText);
                            String d10 = mf.b.d(x10, false);
                            if (x10.startsWith("+")) {
                                d10 = t4.c.f("+", d10);
                            }
                            n(richText.text, spannableStringBuilder, i3, new x31(t4.c.f("tel:", d10), z(1024)));
                        } else if (richText instanceof TL_iv.textTonAddress) {
                            n(richText.text, spannableStringBuilder, i3, new v31(t4.c.f("tonaddress:", x(richText)), (ty0) null));
                        } else if (richText instanceof TL_iv.textBankCard) {
                            n(richText.text, spannableStringBuilder, i3, new v31(t4.c.f("card:", x(richText)), (ty0) null));
                        } else if (richText instanceof TL_iv.textMentionName) {
                            TL_iv.RichText richText4 = richText.text;
                            n(richText4, spannableStringBuilder, i3, new y31("" + ((TL_iv.textMentionName) richText).user_id, E() ? 1 : 0, null));
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
                            int i22 = i3 | 512;
                            TL_iv.RichText richText5 = richText.text;
                            yu yuVar = new yu(this, i22, false);
                            org.telegram.ui.Components.vz vzVar = new org.telegram.ui.Components.vz(x(richText), null, tL_messageEntityFormattedDate);
                            int length6 = spannableStringBuilder.length();
                            m(richText5, spannableStringBuilder, i22);
                            if (spannableStringBuilder.length() > length6) {
                                U(yuVar, spannableStringBuilder, length6, spannableStringBuilder.length());
                                U(vzVar, spannableStringBuilder, length6, spannableStringBuilder.length());
                            }
                        } else if (richText instanceof TL_iv.textButton) {
                            int length7 = spannableStringBuilder.length();
                            spannableStringBuilder.append("*");
                            au auVar = new au(this, this.B, (TL_iv.textButton) richText, null);
                            auVar.d = 1.2f;
                            spannableStringBuilder.setSpan(auVar, length7, spannableStringBuilder.length(), 33);
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

    public final void n(TL_iv.RichText richText, SpannableStringBuilder spannableStringBuilder, int i3, CharacterStyle characterStyle) {
        int length = spannableStringBuilder.length();
        m(richText, spannableStringBuilder, i3);
        if (spannableStringBuilder.length() > length) {
            U(characterStyle, spannableStringBuilder, length, spannableStringBuilder.length());
        }
    }

    public final SpannableStringBuilder o(TL_iv.RichText richText, int i3, IdentityHashMap identityHashMap) {
        IdentityHashMap identityHashMap2 = this.Y;
        this.Y = identityHashMap;
        try {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            m(richText, spannableStringBuilder, i3);
            return spannableStringBuilder;
        } finally {
            this.Y = identityHashMap2;
        }
    }

    public final ArrayList p() {
        ArrayList arrayList = this.f22070g;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            ((xt) arrayList.get(i3)).p(arrayList2);
        }
        for (int i10 = 0; i10 < arrayList2.size(); i10++) {
            ((lg0) arrayList2.get(i10)).getClass();
        }
        return arrayList2;
    }

    public final int r(int i3, org.telegram.ui.Cells.x1 x1Var) {
        int I;
        ArrayList arrayList = this.f22070g;
        if (i3 >= 0 && i3 < arrayList.size() && x1Var != null && (this.f22081s || this.f22083u)) {
            float max = Math.max(0.0f, Math.min(1.0f, x1Var.L1));
            xt xtVar = (xt) arrayList.get(i3);
            return Math.round(g0.T1(xtVar.P, xtVar.N, max));
        }
        int i10 = 0;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            xt xtVar2 = (xt) arrayList.get(i11);
            boolean S = xtVar2.S();
            if (i11 == i3) {
                return i10;
            }
            if (S) {
                if (x1Var != null && (this.f22081s || this.f22083u)) {
                    I = g0.W1(Math.max(0.0f, Math.min(1.0f, x1Var.L1)), xtVar2.Q, xtVar2.O);
                } else {
                    I = xtVar2.I();
                }
                i10 = I + i10;
            }
        }
        return this.A;
    }

    public final TLRPC.Document s(long j10) {
        TL_iv.RichMessage richMessage = this.f22067c;
        if (richMessage == null) {
            return null;
        }
        ArrayList<TLRPC.Document> arrayList = richMessage.documents;
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            TLRPC.Document document = arrayList.get(i3);
            i3++;
            TLRPC.Document document2 = document;
            if (document2.f27007id == j10) {
                return document2;
            }
        }
        return null;
    }

    public final int t() {
        int i3;
        if (this.d && this.A > g0.L(900.0f)) {
            return g0.L(950.0f);
        }
        int i10 = this.A;
        if (this.d) {
            i3 = g0.L(50.0f);
        } else {
            i3 = 0;
        }
        return i10 + i3;
    }

    public final int u() {
        return this.B;
    }

    public final TLRPC.Photo v(long j10) {
        TL_iv.RichMessage richMessage = this.f22067c;
        if (richMessage == null) {
            return null;
        }
        ArrayList<TLRPC.Photo> arrayList = richMessage.photos;
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            TLRPC.Photo photo = arrayList.get(i3);
            i3++;
            TLRPC.Photo photo2 = photo;
            if (photo2.f27025id == j10) {
                return photo2;
            }
        }
        return null;
    }

    public final java.lang.String w(int r22, int r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.cv.w(int, int):java.lang.String");
    }

    public cv(int i3, int i10, org.telegram.ui.ActionBar.e6 e6Var) {
        this.f22068e = new ArrayList();
        this.f22069f = new ArrayList();
        this.f22070g = new ArrayList();
        this.h = new ArrayList();
        this.f22072j = new HashMap();
        this.f22073k = new HashMap();
        this.f22074l = new ArrayList();
        this.f22075m = new HashMap();
        this.f22076n = new ArrayList();
        this.f22077o = new ArrayList();
        this.f22078p = new ArrayList();
        this.f22079q = "";
        this.f22082t = 1.0f;
        TextPaint textPaint = new TextPaint(1);
        this.f22084w = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        this.f22085x = textPaint2;
        this.f22086y = new dk0(null);
        this.f22087z = new k4.j(24);
        this.K = new RectF();
        this.f22066b = null;
        this.f22065a = i3;
        this.B = i10;
        this.D = e6Var;
        int i11 = az.W0;
        this.M = i11;
        this.N = g0.f22607p;
        textPaint.setTextSize(g0.L(i11));
        textPaint2.setTextSize(g0.L(this.M));
    }
}
