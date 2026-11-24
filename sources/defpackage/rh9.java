package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.Layout;
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
import java.util.concurrent.atomic.AtomicInteger;
import org.telegram.messenger.a;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.CheckBoxBase;
import org.telegram.ui.o;
public final class rh9 {
    public int A;
    public final int B;
    public int C;
    public wjb D;
    public gb2 E;
    public bb2 F;
    public n41 G;
    public Paint H;
    public tgb I;
    public r86 J;
    public final RectF K;
    public boolean L;
    public int M;
    public float N;
    public boolean O;
    public rh9 P;
    public View Q;
    public pla R;
    public int S;
    public int T;
    public lm U;
    public float V;
    public mg9 W;
    public int X;
    public IdentityHashMap Y;
    public final int a;
    public final k27 b;
    public TL_iv.RichMessage c;
    public boolean d;
    public final ArrayList e;
    public final ArrayList f;
    public final ArrayList g;
    public final ArrayList h;
    public Drawable i;
    public final HashMap j;
    public final HashMap k;
    public final ArrayList l;
    public final HashMap m;
    public final ArrayList n;
    public final ArrayList o;
    public final ArrayList p;
    public CharSequence q;
    public lg7 r;
    public boolean s;
    public float t;
    public boolean u;
    public boolean v;
    public final TextPaint w;
    public final TextPaint x;
    public final n79 y;
    public final xl3 z;

    public rh9(int i, int i2, wjb wjbVar) {
        this.e = new ArrayList();
        this.f = new ArrayList();
        this.g = new ArrayList();
        this.h = new ArrayList();
        this.j = new HashMap();
        this.k = new HashMap();
        this.l = new ArrayList();
        this.m = new HashMap();
        this.n = new ArrayList();
        this.o = new ArrayList();
        this.p = new ArrayList();
        this.q = "";
        this.t = 1.0f;
        TextPaint textPaint = new TextPaint(1);
        this.w = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        this.x = textPaint2;
        this.y = new n79(null);
        this.z = new xl3((byte) 7);
        this.K = new RectF();
        this.b = null;
        this.a = i;
        this.B = i2;
        this.D = wjbVar;
        int i3 = gba.S0;
        this.M = i3;
        this.N = gl.p;
        textPaint.setTextSize(gl.L(i3));
        textPaint2.setTextSize(gl.L(this.M));
    }

    public static float J(int i, int i2, float[] fArr) {
        float f = 0.0f;
        while (i < i2) {
            f += fArr[i];
            i++;
        }
        return 1000.0f / Math.max(1.0E-4f, f);
    }

    public static String M(TL_iv.pageBlockOrderedList pageblockorderedlist, TL_iv.PageListOrderedItem pageListOrderedItem, int i) {
        if (!TextUtils.isEmpty(pageListOrderedItem.num)) {
            boolean endsWith = pageListOrderedItem.num.endsWith(".");
            String str = pageListOrderedItem.num;
            if (endsWith) {
                return str;
            }
            return tb4.o(str, ".");
        } else if (TLObject.hasFlag(pageListOrderedItem.flags, 8)) {
            return de9.l(new StringBuilder(), pageListOrderedItem.value, ".");
        } else {
            if (TLObject.hasFlag(pageblockorderedlist.flags, 1)) {
                StringBuilder sb = new StringBuilder();
                int i2 = pageblockorderedlist.start;
                if (pageblockorderedlist.reversed) {
                    i = -i;
                }
                sb.append(i2 + i);
                sb.append(".");
                return sb.toString();
            }
            return (i + 1) + ".";
        }
    }

    public static boolean N(int i, List list) {
        if (i > 0 && (list.get(i - 1) instanceof TL_iv.pageBlockParagraph)) {
            return true;
        }
        return false;
    }

    public static int Q(int i, int i2) {
        if (i2 == 0) {
            return i;
        }
        return (i & (-16)) | i2;
    }

    public static void Y(StringBuilder sb, ArrayList arrayList, ArrayList arrayList2) {
        int i = 0;
        while (i < arrayList.size() && i < arrayList2.size() && arrayList.get(i) == arrayList2.get(i)) {
            i++;
        }
        while (arrayList.size() > i) {
            sb.append("</blockquote>");
            arrayList.remove(arrayList.size() - 1);
        }
        while (arrayList.size() < arrayList2.size()) {
            sb.append("<blockquote>");
            arrayList.add((jg9) arrayList2.get(arrayList.size()));
        }
    }

    public static SpannableStringBuilder Z(CharSequence charSequence) {
        oh9[] oh9VarArr;
        int i;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
        for (oh9 oh9Var : (oh9[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), oh9.class)) {
            int spanStart = spannableStringBuilder.getSpanStart(oh9Var);
            int spanEnd = spannableStringBuilder.getSpanEnd(oh9Var);
            if (spanEnd > spanStart) {
                int i2 = oh9Var.b;
                if ((i2 & 16) != 0) {
                    i = 1;
                } else {
                    i = 0;
                }
                if ((i2 & 32) != 0) {
                    i |= 2;
                }
                if ((i2 & 64) != 0) {
                    i |= 16;
                }
                if ((i2 & 128) != 0) {
                    i |= 8;
                }
                if ((i2 & 256) != 0) {
                    i |= 4;
                }
                if ((i2 & 2048) != 0) {
                    i |= 16384;
                }
                if ((i2 & 4096) != 0) {
                    i |= 32768;
                }
                if ((i2 & 8192) != 0) {
                    i |= 65536;
                }
                if (i != 0) {
                    ?? obj = new Object();
                    obj.a = i;
                    spannableStringBuilder.setSpan(new wib(obj, 0), spanStart, spanEnd, 33);
                }
            }
        }
        return spannableStringBuilder;
    }

    public static void a(StringBuilder sb, CharSequence charSequence, int i, int i2, boolean z) {
        String str;
        String str2;
        if (i2 > i) {
            SpannableStringBuilder Z = Z(charSequence.subSequence(i, i2));
            StringBuilder sb2 = new StringBuilder();
            ff9.g(sb2, Z);
            String sb3 = sb2.toString();
            if (sb3.isEmpty()) {
                return;
            }
            if (z) {
                str = "<cite>";
            } else {
                str = "<p>";
            }
            sb.append(str);
            sb.append(sb3);
            if (z) {
                str2 = "</cite>";
            } else {
                str2 = "</p>";
            }
            sb.append(str2);
        }
    }

    public static void d(StringBuilder sb, ArrayList arrayList) {
        String str;
        while (!arrayList.isEmpty()) {
            if (((Boolean) tb4.l(1, arrayList)).booleanValue()) {
                str = "</ol>";
            } else {
                str = "</ul>";
            }
            sb.append(str);
        }
    }

    public static defpackage.c27[] e(float[] r32) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rh9.e(float[]):c27[]");
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

    public static String w(TL_iv.RichText richText) {
        StringBuilder sb = new StringBuilder();
        x(richText, sb);
        return sb.toString();
    }

    public static void x(TL_iv.RichText richText, StringBuilder sb) {
        if (richText instanceof TL_iv.textPlain) {
            sb.append(((TL_iv.textPlain) richText).text);
        } else if (richText instanceof TL_iv.textDiff) {
            TL_iv.textDiff textdiff = (TL_iv.textDiff) richText;
            if (!yi9.j(textdiff.text)) {
                x(textdiff.text, sb);
            } else if (!yi9.j(textdiff.old_text)) {
                x(textdiff.old_text, sb);
            }
        } else if (richText instanceof TL_iv.textConcat) {
            for (int i = 0; i < richText.texts.size(); i++) {
                x(richText.texts.get(i), sb);
            }
        } else {
            TL_iv.RichText richText2 = richText.text;
            if (richText2 != null) {
                x(richText2, sb);
            }
        }
    }

    public static vib y(int i) {
        ?? obj = new Object();
        obj.a = i;
        return obj;
    }

    public static boolean z(TLRPC.PeerColor peerColor) {
        if ((peerColor instanceof TLRPC.TL_peerColorCollectible) || ((peerColor instanceof TLRPC.TL_peerColor) && (peerColor.flags & 1) != 0)) {
            return true;
        }
        return false;
    }

    public final boolean A() {
        gb2 gb2Var = this.E;
        if (gb2Var != null && gb2Var.gb > 0) {
            return true;
        }
        return false;
    }

    public final boolean B() {
        cm cmVar;
        if (E()) {
            int i = 0;
            while (true) {
                ArrayList arrayList = this.n;
                if (i >= arrayList.size()) {
                    break;
                }
                pib pibVar = (pib) arrayList.get(i);
                if ((pibVar instanceof qh9) && (cmVar = ((qh9) pibVar).F) != null && !cmVar.a.isEmpty()) {
                    return true;
                }
                i++;
            }
        }
        return false;
    }

    public final boolean C() {
        k27 k27Var = this.b;
        if (k27Var != null && k27Var.P2() && !k27Var.O3()) {
            return true;
        }
        return false;
    }

    public final boolean D() {
        k27 k27Var = this.b;
        if (k27Var != null && k27Var.O3()) {
            return true;
        }
        return false;
    }

    public final boolean E() {
        lg7 lg7Var = this.r;
        if (lg7Var != null && lg7Var.h) {
            return false;
        }
        return true;
    }

    public final boolean F() {
        gb2 gb2Var = this.E;
        if (gb2Var != null && gb2Var.L2()) {
            return true;
        }
        return false;
    }

    public final boolean G() {
        pib[] L;
        mg9 mg9Var = this.W;
        if (mg9Var != null && (L = mg9Var.L()) != null) {
            for (pib pibVar : L) {
                if (pibVar instanceof qh9) {
                    qh9 qh9Var = (qh9) pibVar;
                    if (qh9Var.N != null || qh9Var.R != null) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final boolean H() {
        TL_iv.RichMessage richMessage = this.c;
        if (richMessage != null && richMessage.rtl) {
            return true;
        }
        return false;
    }

    public final void I(rh9 rh9Var) {
        boolean z;
        boolean z2;
        float f;
        boolean z3;
        int i;
        int i2;
        this.A = 0;
        this.C = 0;
        View view = this.Q;
        ArrayList arrayList = this.g;
        if (view != null) {
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                mg9 mg9Var = (mg9) arrayList.get(i3);
                View view2 = mg9Var.W;
                if (view2 != null && view2 == view) {
                    mg9Var.V();
                    CheckBoxBase checkBoxBase = mg9Var.r;
                    if (checkBoxBase != null) {
                        checkBoxBase.l = false;
                    }
                    mg9Var.W = null;
                }
            }
        }
        this.e.clear();
        this.f.clear();
        arrayList.clear();
        this.h.clear();
        this.j.clear();
        this.k.clear();
        this.l.clear();
        this.m.clear();
        this.n.clear();
        this.o.clear();
        this.p.clear();
        this.q = "";
        this.M = gba.S0;
        this.N = gl.p;
        this.w.setTextSize(gl.L(gba.S0));
        this.x.setTextSize(gl.L(gba.S0));
        this.d = false;
        this.c = null;
        k27 k27Var = this.b;
        if (k27Var != null && k27Var.k != null && k27Var.E0() != null) {
            TL_iv.RichMessage E0 = k27Var.E0();
            this.c = E0;
            this.d = E0.part;
            this.P = rh9Var;
            int i4 = 0;
            while (i4 < this.c.blocks.size()) {
                TL_iv.PageBlock pageBlock = this.c.blocks.get(i4);
                rh9 rh9Var2 = this;
                mg9 j = rh9Var2.j(pageBlock, 0, new Rect(), 0, N(i4, this.c.blocks));
                if ((j instanceof hh9) && (((z3 = pageBlock instanceof TL_iv.pageBlockParagraph)) || o.H(pageBlock))) {
                    hh9 hh9Var = (hh9) j;
                    if (i4 == 0 && z3) {
                        i = 0;
                    } else {
                        i = hh9Var.a0;
                    }
                    if (i4 == rh9Var2.c.blocks.size() - 1) {
                        i2 = 0;
                    } else {
                        i2 = hh9Var.b0;
                    }
                    hh9Var.j0(i, i2);
                }
                i4++;
                this = rh9Var2;
            }
            rh9 rh9Var3 = this;
            for (int i5 = 0; i5 < arrayList.size(); i5++) {
                mg9 mg9Var2 = (mg9) arrayList.get(i5);
                if ((mg9Var2 instanceof hh9) && mg9Var2.w > 0) {
                    if (i5 > 0 && ((mg9) arrayList.get(i5 - 1)).w > 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    int i6 = i5 + 1;
                    if (i6 < arrayList.size() && ((mg9) arrayList.get(i6)).w > 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    hh9 hh9Var2 = (hh9) mg9Var2;
                    float f2 = 6.0f;
                    if (z) {
                        f = 3.0f;
                    } else {
                        f = 6.0f;
                    }
                    int L = gl.L(f);
                    if (z2) {
                        f2 = 3.0f;
                    }
                    hh9Var2.j0(L, gl.L(f2));
                }
            }
            rh9Var3.P = null;
            if (rh9Var3.r != null) {
                for (int i7 = 0; i7 < arrayList.size(); i7++) {
                    ((mg9) arrayList.get(i7)).L = rh9Var3.r;
                }
                rh9Var3.r.k(rh9Var3.p());
            }
            if (view != null) {
                for (int i8 = 0; i8 < arrayList.size(); i8++) {
                    ((mg9) arrayList.get(i8)).n(view);
                }
            }
            rh9Var3.P();
            rh9Var3.W();
        }
    }

    public final boolean K(TL_iv.RichMessage richMessage, int i) {
        if (this.c == richMessage && this.M == gba.S0 && Math.abs(this.N - gl.p) <= 0.1f && i == this.B) {
            return false;
        }
        return true;
    }

    public final boolean L(android.view.MotionEvent r12) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rh9.L(android.view.MotionEvent):boolean");
    }

    public final ArrayList O(int i) {
        ArrayList arrayList = new ArrayList();
        if (i >= 0) {
            ArrayList arrayList2 = this.h;
            int size = arrayList2.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList2.get(i2);
                i2++;
                jg9 jg9Var = (jg9) obj;
                if (i >= jg9Var.a && i <= jg9Var.b) {
                    arrayList.add(jg9Var);
                }
            }
            Collections.sort(arrayList, new fx7((byte) 12));
        }
        return arrayList;
    }

    public final void P() {
        ArrayList arrayList;
        this.A = 0;
        this.C = 0;
        ArrayList arrayList2 = this.n;
        arrayList2.clear();
        ArrayList arrayList3 = this.o;
        arrayList3.clear();
        ArrayList arrayList4 = this.p;
        arrayList4.clear();
        int i = 0;
        while (true) {
            arrayList = this.g;
            if (i >= arrayList.size()) {
                break;
            }
            this.C = Math.max(this.C, ((mg9) arrayList.get(i)).K());
            i++;
        }
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            mg9 mg9Var = (mg9) arrayList.get(i2);
            if (mg9Var instanceof gh9) {
                gh9 gh9Var = (gh9) mg9Var;
                int i3 = this.C;
                int i4 = gh9Var.f0;
                int i5 = gh9Var.e0;
                Rect rect = gh9Var.b;
                int max = Math.max(i4, Math.min(i5, Math.max(0, (i3 - rect.left) - rect.right)));
                gh9Var.g0 = max;
                efb efbVar = gh9Var.Y;
                efbVar.setRenderWidth(max);
                gh9Var.h0 = efbVar.getRenderHeight();
            }
        }
        StringBuilder sb = new StringBuilder();
        int i6 = 0;
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            mg9 mg9Var2 = (mg9) arrayList.get(i7);
            boolean S = mg9Var2.S();
            mg9Var2.N = i6;
            mg9Var2.O = 0;
            mg9Var2.R = S;
            Rect rect2 = mg9Var2.b;
            mg9Var2.Z(rect2.left, rect2.top + i6, i7);
            if (S) {
                pib[] L = mg9Var2.L();
                if (L != null) {
                    for (pib pibVar : L) {
                        if (pibVar != null && pibVar.a() != null) {
                            if (sb.length() > 0) {
                                sb.append('\n');
                            }
                            arrayList3.add(Integer.valueOf(sb.length()));
                            arrayList4.add(Integer.valueOf(i7));
                            arrayList2.add(pibVar);
                            CharSequence text = pibVar.a().getText();
                            if (text != null) {
                                sb.append(text);
                            }
                        }
                    }
                }
                int I = mg9Var2.I();
                mg9Var2.O = I;
                i6 += I;
            }
        }
        this.A = i6;
        this.q = sb;
    }

    public final void R(int i, int i2) {
        if (this.S != i || this.T != i2) {
            this.S = i;
            this.T = i2;
            int i3 = 0;
            while (true) {
                ArrayList arrayList = this.g;
                if (i3 < arrayList.size()) {
                    mg9 mg9Var = (mg9) arrayList.get(i3);
                    if (mg9Var instanceof tg9) {
                        tg9 tg9Var = (tg9) mg9Var;
                        qh9 qh9Var = tg9Var.Y;
                        qh9Var.c = (gl.L(53.0f) + (tg9Var.T - tg9Var.a.S)) - qh9Var.f;
                    }
                    i3++;
                } else {
                    return;
                }
            }
        }
    }

    public final void S(gb2 gb2Var, bb2 bb2Var) {
        this.E = gb2Var;
        this.F = bb2Var;
    }

    public final void T(CharacterStyle characterStyle, SpannableStringBuilder spannableStringBuilder, int i, int i2) {
        if (characterStyle instanceof oh9) {
            int i3 = ((oh9) characterStyle).b;
            oh9[] oh9VarArr = (oh9[]) spannableStringBuilder.getSpans(i, i2, oh9.class);
            if (oh9VarArr != null && oh9VarArr.length > 0) {
                Arrays.sort(oh9VarArr, Comparator$CC.comparingInt(new nl1(spannableStringBuilder, (byte) 2)));
                for (int i4 = 0; i4 < oh9VarArr.length; i4++) {
                    int spanStart = spannableStringBuilder.getSpanStart(oh9VarArr[i4]);
                    int spanEnd = spannableStringBuilder.getSpanEnd(oh9VarArr[i4]);
                    if (spanStart > i) {
                        U(spannableStringBuilder, i, spanStart, i3);
                    }
                    i = Math.max(i, spanEnd);
                }
                if (i < i2) {
                    U(spannableStringBuilder, i, i2, i3);
                    return;
                }
                return;
            }
            U(spannableStringBuilder, i, i2, i3);
            return;
        }
        spannableStringBuilder.setSpan(characterStyle, i, i2, 33);
    }

    public final void U(SpannableStringBuilder spannableStringBuilder, int i, int i2, int i3) {
        boolean z;
        while (i < i2) {
            int nextSpanTransition = spannableStringBuilder.nextSpanTransition(i, i2, URLSpan.class);
            if (((URLSpan[]) spannableStringBuilder.getSpans(i, nextSpanTransition, URLSpan.class)).length > 0) {
                z = true;
            } else {
                z = false;
            }
            spannableStringBuilder.setSpan(new oh9(this, i3, z), i, nextSpanTransition, 33);
            i = nextSpanTransition;
        }
    }

    public final void V(lg7 lg7Var) {
        this.r = lg7Var;
        int i = 0;
        while (true) {
            ArrayList arrayList = this.g;
            if (i < arrayList.size()) {
                ((mg9) arrayList.get(i)).L = lg7Var;
                arrayList.get(i);
                ((mg9) arrayList.get(i)).getClass();
                i++;
            } else {
                return;
            }
        }
    }

    public final void W() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.g;
            if (i < arrayList.size()) {
                ((mg9) arrayList.get(i)).d0();
                i++;
            } else {
                return;
            }
        }
    }

    public final boolean X() {
        ArrayList arrayList = this.g;
        if (arrayList.isEmpty()) {
            return false;
        }
        mg9 mg9Var = (mg9) arrayList.get(0);
        if (!(mg9Var instanceof ah9) && !(mg9Var instanceof mh9) && !(mg9Var instanceof sg9) && !(mg9Var instanceof eh9) && !(mg9Var instanceof zi9)) {
            return false;
        }
        return true;
    }

    public final void a0(int i) {
        qh9 qh9Var;
        View view;
        boolean z;
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.n;
            if (i2 < arrayList.size()) {
                pib pibVar = (pib) arrayList.get(i2);
                if ((pibVar instanceof qh9) && (view = (qh9Var = (qh9) pibVar).T) != null) {
                    gm.release(view, qh9Var.F);
                    qh9Var.F = null;
                    View view2 = qh9Var.T;
                    if (qh9Var.a.v && !qh9Var.w) {
                        z = true;
                    } else {
                        z = false;
                    }
                    qh9Var.F = gm.update(i, view2, z, (cm) null, qh9Var.b);
                }
                i2++;
            } else {
                return;
            }
        }
    }

    public final void b(View view) {
        View view2 = this.Q;
        if (view != view2) {
            if (view2 != null) {
                f(view2);
            }
            this.Q = view;
            int i = 0;
            while (true) {
                ArrayList arrayList = this.g;
                if (i < arrayList.size()) {
                    ((mg9) arrayList.get(i)).n(view);
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    public final void c(org.telegram.tgnet.TLRPC.Chat r10, org.telegram.tgnet.TLRPC.User r11) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rh9.c(org.telegram.tgnet.TLRPC$Chat, org.telegram.tgnet.TLRPC$User):void");
    }

    public final void f(View view) {
        View view2 = this.Q;
        if (view2 == view && view2 != null) {
            pla plaVar = this.R;
            if (plaVar != null) {
                plaVar.b(view);
                this.R = null;
            }
            this.Q = null;
            int i = 0;
            while (true) {
                ArrayList arrayList = this.g;
                if (i >= arrayList.size()) {
                    break;
                }
                mg9 mg9Var = (mg9) arrayList.get(i);
                View view3 = mg9Var.W;
                if (view3 != null && view3 == view) {
                    mg9Var.V();
                    CheckBoxBase checkBoxBase = mg9Var.r;
                    if (checkBoxBase != null) {
                        checkBoxBase.l = false;
                    }
                    mg9Var.W = null;
                }
                i++;
            }
            if (view == this.E) {
                this.E = null;
                this.F = null;
            }
        }
    }

    public final void g(Canvas canvas, int i, int i2, nb2 nb2Var) {
        int i3;
        boolean z;
        float f;
        float f2;
        rh9 rh9Var;
        nb2 nb2Var2;
        int i4;
        int i5;
        boolean z2;
        bb2 bb2Var;
        R(i, i2);
        if (D()) {
            i3 = bkb.Xc;
        } else {
            i3 = bkb.Wc;
        }
        this.w.linkColor = bkb.v0(i3, this.D);
        boolean z3 = this.d;
        int min = Math.min(this.A, gl.L(900.0f));
        if (z3) {
            canvas.saveLayerAlpha(-i, 0.0f, this.C + i2, min, 255, 31);
        }
        gb2 gb2Var = this.E;
        boolean z4 = false;
        if (gb2Var != null && gb2Var.Ec > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            float f3 = gb2Var.Cc - gb2Var.u0;
            f2 = gb2Var.Ec + f3;
            f = f3;
            nb2Var2 = nb2Var;
            rh9Var = this;
        } else {
            f = 0.0f;
            f2 = 0.0f;
            rh9Var = this;
            nb2Var2 = nb2Var;
        }
        rh9Var.h(canvas, nb2Var2, z, f, f2);
        if (z3) {
            RectF rectF = gl.P;
            rectF.set(-i, min - gl.L(32.0f), this.C + i2, min);
            this.z.s(canvas, rectF, 3, 1.0f);
            canvas.restore();
            if (D()) {
                i4 = bkb.Nb;
            } else {
                i4 = bkb.Ad;
            }
            int v0 = bkb.v0(i4, this.D);
            if (this.I == null) {
                this.I = new tgb(k96.M0(2131745147, null), 16.0f, gl.o());
            }
            n41 n41Var = this.G;
            if (n41Var == null) {
                this.G = new n41(this.Q, 1.5f, 2.0f);
            } else {
                View view = n41Var.a;
                View view2 = this.Q;
                if (view != view2) {
                    n41Var.a = view2;
                }
            }
            Paint paint = this.H;
            if (paint == null) {
                paint = new Paint(1);
                this.H = paint;
            }
            paint.setColor(bkb.p1(0.1f, v0));
            float f4 = this.I.c;
            int i6 = this.C;
            float f5 = (((i6 + i5) + this.T) / 2.0f) - this.S;
            float L = gl.L(4.0f) + min;
            float L2 = (((this.C + this.S) + this.T) - gl.L(24.0f)) / 2.0f;
            RectF rectF2 = this.K;
            rectF2.set(f5 - L2, L, f5 + L2, gl.L(42.0f) + L);
            gb2 gb2Var2 = this.E;
            if (gb2Var2 != null && (bb2Var = this.F) != null && bb2Var.A1(gb2Var2, 7)) {
                z2 = true;
            } else {
                z2 = false;
            }
            r86 r86Var = this.J;
            if (r86Var != null && !z2 && !r86Var.c() && !this.J.d()) {
                this.J.a();
            }
            r86 r86Var2 = this.J;
            if (r86Var2 == null) {
                if (z2) {
                    r86 r86Var3 = new r86();
                    this.J = r86Var3;
                    r86Var3.x.setStrokeWidth(gl.L(1.25f));
                    this.J.D = true;
                }
            } else if (z2 && (r86Var2.c() || this.J.d())) {
                r86 r86Var4 = this.J;
                r86Var4.b = -1L;
                r86Var4.c = -1L;
            }
            r86 r86Var5 = this.J;
            if (r86Var5 != null) {
                r86Var5.g(bkb.p1(0.1f, v0), bkb.p1(0.3f, v0), bkb.p1(0.3f, v0), bkb.p1(1.2f, v0));
            }
            float a = this.G.a(0.075f);
            if (a != 1.0f) {
                z4 = true;
            }
            if (z4) {
                canvas.save();
                canvas.scale(a, a, rectF2.centerX(), rectF2.centerY());
            }
            canvas.drawRoundRect(rectF2, gl.L(8.0f), gl.L(8.0f), this.H);
            r86 r86Var6 = this.J;
            if (r86Var6 != null && !r86Var6.c()) {
                this.J.e(rectF2);
                this.J.j(8.0f);
                this.J.draw(canvas);
                View view3 = this.Q;
                if (view3 != null) {
                    view3.invalidate();
                }
            }
            this.I.c(rectF2.centerX() - (f4 / 2.0f), rectF2.centerY(), 1.0f, v0, canvas);
            if (z4) {
                canvas.restore();
            }
        }
    }

    public final void h(Canvas canvas, nb2 nb2Var, boolean z, float f, float f2) {
        boolean z2;
        float f3;
        View view;
        float f4;
        float f5;
        boolean z3;
        boolean z4;
        float f6;
        float f7;
        float R1;
        Canvas canvas2;
        tg9 tg9Var;
        float f8;
        float f9;
        float f10;
        int i;
        int i2;
        boolean z5;
        float f11;
        float f12;
        float f13;
        int I;
        float f14;
        float f15;
        int i3;
        float f16;
        int I2;
        int i4;
        Canvas canvas3 = canvas;
        float f17 = 0.0f;
        float f18 = 1.0f;
        int i5 = 0;
        if (!this.h.isEmpty()) {
            ArrayList arrayList = this.h;
            int size = arrayList.size();
            int i6 = 0;
            while (i6 < size) {
                int i7 = i6 + 1;
                jg9 jg9Var = (jg9) arrayList.get(i6);
                int r = r(jg9Var.a, nb2Var);
                int i8 = jg9Var.b;
                ArrayList arrayList2 = this.g;
                float f19 = 4.0f;
                if (i8 >= 0 && i8 < arrayList2.size() && nb2Var != null && (this.s || this.u)) {
                    float max = Math.max(f17, Math.min(1.0f, nb2Var.L1));
                    mg9 mg9Var = (mg9) arrayList2.get(i8);
                    int c = b00.c(4.0f, mg9Var.b.bottom, i5);
                    float f20 = mg9Var.P + mg9Var.Q;
                    if (mg9Var.S) {
                        i4 = c;
                    } else {
                        i4 = i5;
                    }
                    float f21 = f20 - i4;
                    float f22 = mg9Var.N + mg9Var.O;
                    if (!mg9Var.R) {
                        c = i5;
                    }
                    i3 = Math.round(gl.R1(f21, f22 - c, max));
                } else {
                    int i9 = i5;
                    int i10 = i9;
                    while (true) {
                        if (i9 < arrayList2.size()) {
                            mg9 mg9Var2 = (mg9) arrayList2.get(i9);
                            boolean S = mg9Var2.S();
                            Rect rect = mg9Var2.b;
                            if (S) {
                                float f23 = f19;
                                if (nb2Var != null && (this.s || this.u)) {
                                    I2 = gl.U1(Math.max(f17, Math.min(1.0f, nb2Var.L1)), mg9Var2.Q, mg9Var2.O);
                                } else {
                                    I2 = mg9Var2.I();
                                }
                                int i11 = I2 + i10;
                                if (i9 == i8 && rect.bottom > gl.L(f23)) {
                                    f16 = f23;
                                    i11 = de9.f(f16, rect.bottom, i11);
                                } else {
                                    f16 = f23;
                                }
                                i10 = i11;
                            } else {
                                f16 = f19;
                            }
                            if (i9 == i8) {
                                i3 = i10;
                                break;
                            }
                            i9++;
                            f19 = f16;
                            f17 = 0.0f;
                        } else {
                            i3 = this.A;
                            break;
                        }
                    }
                }
                int i12 = jg9Var.b;
                ArrayList arrayList3 = this.g;
                float f24 = 1.0f;
                for (int i13 = jg9Var.a; i13 < Math.min(i12 + 1, arrayList3.size()); i13++) {
                    mg9 mg9Var3 = (mg9) arrayList3.get(i13);
                    if (mg9Var3.S()) {
                        f24 *= mg9Var3.z();
                    }
                }
                int L = gl.L(3.0f) * jg9Var.d;
                int i14 = jg9Var.e + L;
                int i15 = L + jg9Var.f;
                if (i3 - r > i14 + i15) {
                    r += i14;
                    i3 -= i15;
                }
                RectF rectF = gl.P;
                rectF.set(jg9Var.c, r, this.C - gl.L(jg9Var.d * 12), i3);
                canvas3.save();
                canvas3.scale(f24, f24, rectF.centerX(), rectF.centerY());
                float floor = (float) Math.floor(gba.U0 / 3.0f);
                this.y.d(canvas3, rectF, floor, floor, floor, 1.0f, false, false);
                this.y.f(canvas3, rectF, 1.0f);
                canvas3.restore();
                size = size;
                i6 = i7;
                f17 = 0.0f;
                i5 = 0;
            }
        }
        int i16 = 0;
        while (i16 < this.g.size()) {
            mg9 mg9Var4 = (mg9) this.g.get(i16);
            if ((mg9Var4 instanceof ch9) && (mg9Var4.R || mg9Var4.S)) {
                ch9 ch9Var = (ch9) mg9Var4;
                int r2 = ch9Var.X.r();
                qh9 qh9Var = ch9Var.Y;
                if (qh9Var != null) {
                    i2 = qh9Var.r();
                } else {
                    i2 = 0;
                }
                int max2 = Math.max(r2, i2);
                if (max2 > 0) {
                    if (nb2Var != null && (this.s || this.u)) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    if (z5) {
                        f11 = Math.max(0.0f, Math.min(f18, nb2Var.L1));
                    } else {
                        f11 = f18;
                    }
                    if (z5) {
                        if (ch9Var.S) {
                            f14 = f18;
                        } else {
                            f14 = 0.0f;
                        }
                        if (ch9Var.R) {
                            f15 = f18;
                        } else {
                            f15 = 0.0f;
                        }
                        f12 = gl.R1(f14, f15, f11);
                    } else if (ch9Var.R) {
                        f12 = f18;
                    } else {
                        f12 = 0.0f;
                    }
                    if (f12 > 0.0f) {
                        float f25 = ((this.C + this.T) - this.S) / 2.0f;
                        float f26 = max2 / 2.0f;
                        float L2 = (f25 - f26) - gl.L(30.0f);
                        float L3 = f25 + f26 + gl.L(30.0f);
                        if (z5) {
                            f13 = gl.R1(ch9Var.P, ch9Var.N, f11);
                            I = gl.U1(f11, ch9Var.Q, ch9Var.O);
                        } else {
                            f13 = ch9Var.N;
                            I = ch9Var.I();
                        }
                        float L4 = gl.L(8.0f) + f13;
                        float L5 = (f13 + I) - gl.L(8.0f);
                        if (L5 > L4) {
                            RectF rectF2 = gl.P;
                            rectF2.set(L2, L4, L3, L5);
                            float floor2 = (float) Math.floor(gba.U0 / 2.0f);
                            this.y.d(canvas3, rectF2, floor2, floor2, floor2, f12, false, false);
                            Drawable drawable = this.i;
                            if (drawable == null) {
                                drawable = a.b.getDrawable(2131231970).mutate();
                                this.i = drawable;
                            }
                            drawable.setColorFilter(this.y.h(), PorterDuff.Mode.SRC_IN);
                            this.i.setAlpha((int) (f12 * 255.0f));
                            int intrinsicWidth = this.i.getIntrinsicWidth();
                            int intrinsicHeight = this.i.getIntrinsicHeight();
                            canvas3.save();
                            canvas3.clipRect(L2, L4, L3, L5);
                            int i17 = (int) L2;
                            int i18 = (int) L4;
                            i = i16;
                            this.i.setBounds(gl.L(8.0f) + i17, gl.L(7.0f) + i18, de9.w(8.0f, i17, intrinsicWidth), de9.w(7.0f, i18, intrinsicHeight));
                            canvas3.scale(-1.0f, -1.0f, this.i.getBounds().centerX(), this.i.getBounds().centerY());
                            this.i.draw(canvas3);
                            canvas3.restore();
                            canvas3.save();
                            canvas3.clipRect(L2, L4, L3, L5);
                            int i19 = (int) L3;
                            int i20 = (int) L5;
                            this.i.setBounds(ls6.x(8.0f, i19, intrinsicWidth), ls6.x(7.0f, i20, intrinsicHeight), i19 - gl.L(8.0f), i20 - gl.L(7.0f));
                            canvas3.scale(1.0f, -1.0f, this.i.getBounds().centerX(), this.i.getBounds().centerY());
                            this.i.draw(canvas3);
                            canvas3.restore();
                            this.i.setAlpha(255);
                            i16 = i + 1;
                            f18 = 1.0f;
                        }
                    }
                }
            }
            i = i16;
            i16 = i + 1;
            f18 = 1.0f;
        }
        k27 k27Var = this.b;
        if (!this.O && (k27Var == null || !na7.q1(this.a).i4.z(k27Var))) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (!z2 && this.U == null) {
            this.V = 0.0f;
        } else {
            lm lmVar = this.U;
            if (lmVar == null) {
                lm lmVar2 = new lm(0L, 350L, s33.h);
                this.U = lmVar2;
                lmVar = lmVar2;
            }
            if (z2) {
                f3 = 1.0f;
            } else {
                f3 = 0.0f;
            }
            float e = lmVar.e(false, f3);
            this.V = e;
            if (e > 0.0f && (view = this.Q) != null) {
                view.invalidate();
            }
        }
        if (nb2Var != null && (this.s || this.u)) {
            f4 = 1.0f;
            f5 = Math.max(0.0f, Math.min(1.0f, nb2Var.L1));
        } else {
            f4 = 1.0f;
            f5 = 1.0f;
        }
        this.t = f5;
        int i21 = (f5 > f4 ? 1 : (f5 == f4 ? 0 : -1));
        if (i21 >= 0) {
            this.s = false;
            this.u = false;
        }
        boolean z6 = this.s;
        if (!z6 && !this.u) {
            z3 = z;
        } else {
            z3 = false;
        }
        if (z6 && f5 < 1.0f) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            ArrayList arrayList4 = this.g;
            for (int i22 = 0; i22 < arrayList4.size(); i22++) {
                mg9 mg9Var5 = (mg9) arrayList4.get(i22);
                if (mg9Var5 instanceof tg9) {
                    tg9 tg9Var2 = (tg9) mg9Var5;
                    tg9Var2.e0 = gl.R1(tg9Var2.P, tg9Var2.N, f5) + tg9Var2.I();
                    int i23 = i22 + 1;
                    while (true) {
                        if (i23 < arrayList4.size()) {
                            mg9 mg9Var6 = (mg9) arrayList4.get(i23);
                            do {
                                mg9Var6 = mg9Var6.M;
                                if (mg9Var6 == null) {
                                    f10 = gl.R1(((mg9) arrayList4.get(i23)).P, ((mg9) arrayList4.get(i23)).N, f5);
                                    break;
                                }
                            } while (mg9Var6 != tg9Var2);
                            i23++;
                        } else {
                            f10 = Float.MAX_VALUE;
                            break;
                        }
                    }
                    tg9Var2.f0 = f10;
                }
            }
        }
        ArrayList arrayList5 = this.g;
        for (int i24 = 0; i24 < arrayList5.size(); i24++) {
            mg9 mg9Var7 = (mg9) arrayList5.get(i24);
            if (mg9Var7 instanceof ih9) {
                ih9 ih9Var = (ih9) mg9Var7;
                if (ih9Var.i0) {
                    f8 = 1.0f;
                } else {
                    f8 = 0.0f;
                }
                if (ih9Var.h0) {
                    f9 = 1.0f;
                } else {
                    f9 = 0.0f;
                }
                ih9Var.j0 = gl.R1(f8, f9, f5);
                ih9Var.k0 = gl.U1(f5, ih9Var.Q, ih9Var.O);
            }
        }
        int i25 = 0;
        while (i25 < this.g.size()) {
            mg9 mg9Var8 = (mg9) this.g.get(i25);
            if (mg9Var8.R || mg9Var8.S) {
                float R12 = gl.R1(mg9Var8.P, mg9Var8.N, f5);
                boolean z7 = mg9Var8 instanceof ug9;
                if (z7) {
                    R1 = 1.0f;
                } else {
                    if (mg9Var8.S) {
                        f6 = 1.0f;
                    } else {
                        f6 = 0.0f;
                    }
                    if (mg9Var8.R) {
                        f7 = 1.0f;
                    } else {
                        f7 = 0.0f;
                    }
                    R1 = gl.R1(f6, f7, f5);
                }
                if (R1 > 0.0f) {
                    int I3 = mg9Var8.I();
                    if (!z3 || (I3 + R12 > f && R12 < f2)) {
                        canvas3.save();
                        if (z4 && (tg9Var = mg9Var8.M) != null && !z7) {
                            float f27 = -3.4028235E38f;
                            float f28 = Float.MAX_VALUE;
                            for (tg9Var = mg9Var8.M; tg9Var != null; tg9Var = tg9Var.M) {
                                f27 = Math.max(f27, tg9Var.e0);
                                f28 = Math.min(f28, tg9Var.f0);
                            }
                            if (f28 <= f27) {
                                canvas3.restore();
                            } else {
                                canvas3.clipRect(-this.S, f27, this.C + this.T, f28);
                            }
                        }
                        canvas3.translate(0.0f, R12);
                        if (R1 < 1.0f) {
                            canvas2 = canvas3;
                            int saveLayerAlpha = canvas2.saveLayerAlpha(-this.S, 0.0f, this.C + this.T, I3, (int) (R1 * 255.0f), 31);
                            mg9Var8.t(canvas2);
                            canvas2.restoreToCount(saveLayerAlpha);
                        } else {
                            canvas2 = canvas3;
                            mg9Var8.t(canvas2);
                        }
                        canvas2.restore();
                        i25++;
                        canvas3 = canvas2;
                    }
                }
            }
            canvas2 = canvas3;
            i25++;
            canvas3 = canvas2;
        }
        if (i21 >= 0) {
            W();
        }
    }

    public final void i(Canvas canvas, ColorFilter colorFilter) {
        if (E()) {
            int i = 0;
            while (true) {
                ArrayList arrayList = this.g;
                if (i < arrayList.size()) {
                    mg9 mg9Var = (mg9) arrayList.get(i);
                    if (mg9Var.R) {
                        canvas.save();
                        canvas.translate(0.0f, mg9Var.N);
                        mg9Var.s(canvas, colorFilter);
                        canvas.restore();
                    }
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    public final mg9 j(TL_iv.PageBlock pageBlock, int i, Rect rect, int i2, boolean z) {
        int L;
        int i3;
        int i4;
        svc svcVar;
        int i5;
        TLRPC.Document s;
        SpannableStringBuilder spannableStringBuilder;
        boolean z2;
        boolean z3;
        boolean z4;
        int i6;
        int i7;
        SpannableStringBuilder spannableStringBuilder2;
        TL_iv.pageBlockBlockquote pageblockblockquote;
        jh9 jh9Var;
        int i8;
        int i9;
        TextPaint textPaint;
        int i10;
        int i11;
        int i12;
        rh9 rh9Var;
        int L2;
        mg9 mg9Var;
        boolean z5;
        rh9 rh9Var2 = this;
        int i13 = i2;
        int i14 = rect.left + rect.right;
        int i15 = rh9Var2.B;
        if (i14 >= i15) {
            return null;
        }
        boolean z6 = pageBlock instanceof TL_iv.pageBlockThinking;
        int i16 = 0;
        ArrayList arrayList = rh9Var2.g;
        if (z6) {
            kh9 kh9Var = new kh9(rh9Var2, new Rect(), i15, rh9Var2.l(pageBlock.text, 0));
            arrayList.add(kh9Var);
            return kh9Var;
        } else if (!o.H(pageBlock) && !(pageBlock instanceof TL_iv.pageBlockFooter) && !(pageBlock instanceof TL_iv.pageBlockParagraph)) {
            if (pageBlock instanceof TL_iv.pageBlockPreformatted) {
                TL_iv.pageBlockPreformatted pageblockpreformatted = (TL_iv.pageBlockPreformatted) pageBlock;
                rh9 rh9Var3 = rh9Var2.P;
                if (rh9Var3 == null) {
                    mg9Var = null;
                } else {
                    ArrayList arrayList2 = rh9Var3.g;
                    int size = arrayList2.size();
                    int i17 = 0;
                    while (true) {
                        if (i17 < size) {
                            Object obj = arrayList2.get(i17);
                            i17++;
                            mg9 mg9Var2 = (mg9) obj;
                            if (bh9.class.isInstance(mg9Var2) && (mg9Var2 instanceof bh9)) {
                                String str = ((bh9) mg9Var2).o0;
                                String w = w(pageBlock.text);
                                if (str != null && str.length() <= w.length() && w.length() > 0) {
                                    z5 = w.startsWith(str);
                                } else {
                                    z5 = false;
                                }
                                if (z5) {
                                    mg9Var = (mg9) bh9.class.cast(mg9Var2);
                                    break;
                                }
                            }
                        } else {
                            mg9Var = null;
                            break;
                        }
                    }
                }
                bh9 bh9Var = new bh9(rh9Var2, rect, rh9Var2.B, pageblockpreformatted, (bh9) mg9Var);
                bh9Var.G = 2131754052;
                arrayList.add(bh9Var);
                return bh9Var;
            }
            boolean z7 = pageBlock instanceof TL_iv.pageBlockList;
            TextPaint textPaint2 = rh9Var2.x;
            if (z7) {
                TL_iv.pageBlockList pageblocklist = (TL_iv.pageBlockList) pageBlock;
                int i18 = i + 1;
                textPaint2.setTextSize(gl.L(gba.S0));
                int L3 = gl.L(16.0f);
                for (int i19 = 0; i19 < pageblocklist.items.size(); i19++) {
                    if (pageblocklist.items.get(i19).checkbox) {
                        L2 = gl.L(26.0f);
                    } else {
                        L2 = gl.L(16.0f);
                    }
                    L3 = Math.max(L3, L2);
                }
                Rect rect2 = new Rect(rect);
                if (rh9Var2.H()) {
                    rect2.right += L3;
                } else {
                    rect2.left += L3;
                }
                int i20 = 0;
                while (i20 < pageblocklist.items.size()) {
                    TL_iv.PageListItem pageListItem = pageblocklist.items.get(i20);
                    if (pageListItem instanceof TL_iv.TL_pageListItemText) {
                        TL_iv.TL_pageListItemText tL_pageListItemText = (TL_iv.TL_pageListItemText) pageListItem;
                        hh9 hh9Var = new hh9(rh9Var2, new Rect(rect2), i15, rh9Var2.l(tL_pageListItemText.text, i13));
                        hh9Var.n = L3;
                        if (tL_pageListItemText.checkbox) {
                            hh9Var.b0(tL_pageListItemText, tL_pageListItemText.checked);
                        } else {
                            hh9Var.c0("•◦▪".charAt(i % 3) + "");
                        }
                        boolean z8 = tL_pageListItemText.checkbox;
                        boolean z9 = tL_pageListItemText.checked;
                        hh9Var.w = i18;
                        hh9Var.x = false;
                        hh9Var.y = z8;
                        hh9Var.E = z9;
                        arrayList.add(hh9Var);
                    } else if (pageListItem instanceof TL_iv.TL_pageListItemBlocks) {
                        TL_iv.TL_pageListItemBlocks tL_pageListItemBlocks = (TL_iv.TL_pageListItemBlocks) pageListItem;
                        if (!tL_pageListItemBlocks.blocks.isEmpty()) {
                            int size2 = arrayList.size();
                            int i21 = 0;
                            boolean z10 = false;
                            while (i21 < tL_pageListItemBlocks.blocks.size()) {
                                int i22 = i21;
                                mg9 j = j(tL_pageListItemBlocks.blocks.get(i21), i18, new Rect(rect2), i13, N(i21, tL_pageListItemBlocks.blocks));
                                int i23 = i18;
                                if (j != null && !z10) {
                                    j.n = L3;
                                    if (tL_pageListItemBlocks.checkbox) {
                                        j.b0(tL_pageListItemBlocks, tL_pageListItemBlocks.checked);
                                    } else {
                                        j.c0("•◦▪".charAt(i % 3) + "");
                                    }
                                    boolean z11 = tL_pageListItemBlocks.checkbox;
                                    boolean z12 = tL_pageListItemBlocks.checked;
                                    j.w = i23;
                                    j.x = false;
                                    j.y = z11;
                                    j.E = z12;
                                    z10 = true;
                                }
                                i18 = i23;
                                i21 = i22 + 1;
                                rh9Var2 = this;
                            }
                            i12 = i18;
                            rh9Var = rh9Var2;
                            int size3 = arrayList.size();
                            for (int i24 = size2; i24 < size3; i24++) {
                                mg9 mg9Var3 = (mg9) arrayList.get(i24);
                                if (mg9Var3.w == 0) {
                                    mg9Var3.w = i12;
                                    mg9Var3.x = false;
                                }
                            }
                            i20++;
                            rh9Var2 = rh9Var;
                            i18 = i12;
                        }
                    }
                    i12 = i18;
                    rh9Var = rh9Var2;
                    i20++;
                    rh9Var2 = rh9Var;
                    i18 = i12;
                }
                return null;
            }
            rh9 rh9Var4 = rh9Var2;
            boolean z13 = true;
            if (pageBlock instanceof TL_iv.pageBlockOrderedList) {
                TL_iv.pageBlockOrderedList pageblockorderedlist = (TL_iv.pageBlockOrderedList) pageBlock;
                int i25 = i + 1;
                textPaint2.setTextSize(gl.L(gba.S0));
                new TextPaint(textPaint2).setTypeface(gl.o());
                int L4 = gl.L(16.0f);
                for (int i26 = 0; i26 < pageblockorderedlist.items.size(); i26++) {
                    TL_iv.PageListOrderedItem pageListOrderedItem = pageblockorderedlist.items.get(i26);
                    String M = M(pageblockorderedlist, pageListOrderedItem, i26);
                    if (pageListOrderedItem.checkbox) {
                        i11 = gl.L(26.0f);
                    } else {
                        i11 = 0;
                    }
                    L4 = Math.max(L4, gl.L(8.0f) + ((int) Math.ceil(textPaint.measureText(M))) + i11);
                }
                Rect rect3 = new Rect(rect);
                if (rh9Var4.H()) {
                    rect3.right += L4;
                } else {
                    rect3.left += L4;
                }
                int i27 = 0;
                while (i27 < pageblockorderedlist.items.size()) {
                    TL_iv.PageListOrderedItem pageListOrderedItem2 = pageblockorderedlist.items.get(i27);
                    if (pageListOrderedItem2 instanceof TL_iv.TL_pageListOrderedItemText) {
                        TL_iv.TL_pageListOrderedItemText tL_pageListOrderedItemText = (TL_iv.TL_pageListOrderedItemText) pageListOrderedItem2;
                        hh9 hh9Var2 = new hh9(rh9Var4, new Rect(rect3), i15, rh9Var4.l(tL_pageListOrderedItemText.text, i13));
                        hh9Var2.n = L4;
                        hh9Var2.c0(M(pageblockorderedlist, tL_pageListOrderedItemText, i27));
                        if (tL_pageListOrderedItemText.checkbox) {
                            hh9Var2.b0(tL_pageListOrderedItemText, tL_pageListOrderedItemText.checked);
                        }
                        boolean z14 = tL_pageListOrderedItemText.checkbox;
                        boolean z15 = tL_pageListOrderedItemText.checked;
                        hh9Var2.w = i25;
                        hh9Var2.x = z13;
                        hh9Var2.y = z14;
                        hh9Var2.E = z15;
                        arrayList.add(hh9Var2);
                    } else if (pageListOrderedItem2 instanceof TL_iv.TL_pageListOrderedItemBlocks) {
                        TL_iv.TL_pageListOrderedItemBlocks tL_pageListOrderedItemBlocks = (TL_iv.TL_pageListOrderedItemBlocks) pageListOrderedItem2;
                        if (!tL_pageListOrderedItemBlocks.blocks.isEmpty()) {
                            int i28 = i16;
                            int i29 = i28;
                            while (i28 < tL_pageListOrderedItemBlocks.blocks.size()) {
                                rh9 rh9Var5 = rh9Var4;
                                int i30 = i25;
                                int i31 = i28;
                                mg9 j2 = rh9Var5.j(tL_pageListOrderedItemBlocks.blocks.get(i28), i30, new Rect(rect3), i13, N(i28, tL_pageListOrderedItemBlocks.blocks));
                                rh9Var4 = rh9Var5;
                                i25 = i30;
                                int i32 = i13;
                                if (j2 != null && i29 == 0) {
                                    j2.n = L4;
                                    if (tL_pageListOrderedItemBlocks.checkbox) {
                                        j2.b0(tL_pageListOrderedItemBlocks, tL_pageListOrderedItemBlocks.checked);
                                    }
                                    j2.c0(M(pageblockorderedlist, tL_pageListOrderedItemBlocks, i27));
                                    if (tL_pageListOrderedItemBlocks.checkbox) {
                                        j2.b0(tL_pageListOrderedItemBlocks, tL_pageListOrderedItemBlocks.checked);
                                    }
                                    boolean z16 = tL_pageListOrderedItemBlocks.checkbox;
                                    boolean z17 = tL_pageListOrderedItemBlocks.checked;
                                    j2.w = i25;
                                    j2.x = true;
                                    j2.y = z16;
                                    j2.E = z17;
                                    i29 = 1;
                                }
                                i28 = i31 + 1;
                                i13 = i32;
                            }
                            i10 = i13;
                            int size4 = arrayList.size();
                            for (int size5 = arrayList.size(); size5 < size4; size5++) {
                                mg9 mg9Var4 = (mg9) arrayList.get(size5);
                                if (mg9Var4.w == 0) {
                                    mg9Var4.w = i25;
                                    mg9Var4.x = true;
                                }
                            }
                            i27++;
                            i13 = i10;
                            z13 = true;
                            i16 = 0;
                        }
                    }
                    i10 = i13;
                    i27++;
                    i13 = i10;
                    z13 = true;
                    i16 = 0;
                }
                return null;
            }
            int i33 = i13;
            boolean z18 = pageBlock instanceof TL_iv.pageBlockBlockquote;
            ArrayList arrayList3 = rh9Var4.h;
            if (z18) {
                int i34 = rect.left;
                int size6 = arrayList.size();
                TL_iv.pageBlockBlockquote pageblockblockquote2 = (TL_iv.pageBlockBlockquote) pageBlock;
                SpannableStringBuilder l = rh9Var4.l(pageBlock.text, Q(i33, q(pageBlock)));
                TL_iv.RichText richText = pageblockblockquote2.caption;
                if (richText != null && !TextUtils.isEmpty(w(richText))) {
                    spannableStringBuilder2 = rh9Var4.l(pageblockblockquote2.caption, Q(i33, 11));
                } else {
                    spannableStringBuilder2 = null;
                }
                if (pageblockblockquote2.collapsed) {
                    SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(l);
                    if (spannableStringBuilder2 != null) {
                        spannableStringBuilder3.append('\n');
                        i9 = spannableStringBuilder3.length();
                        spannableStringBuilder3.append((CharSequence) spannableStringBuilder2);
                    } else {
                        i9 = -1;
                    }
                    int i35 = i9;
                    ?? ih9Var = new ih9(rh9Var4, new Rect(gl.L(12.0f) + rect.left, gl.L(4.0f) + rect.top, gl.L(20.0f) + rect.right, gl.L(4.0f) + rect.bottom), rh9Var4.B, pageblockblockquote2, spannableStringBuilder3);
                    pageblockblockquote = pageblockblockquote2;
                    ih9Var.c0 = i35;
                    ih9Var.j0(gl.L(8.0f), gl.L(8.0f));
                    jh9Var = ih9Var;
                } else {
                    pageblockblockquote = pageblockblockquote2;
                    jh9Var = new jh9(rh9Var4, new Rect(gl.L(12.0f) + rect.left, gl.L(12.0f) + rect.top, gl.L(12.0f) + rect.right, gl.L(14.0f) + rect.bottom), rh9Var4.B, l, spannableStringBuilder2, Layout.Alignment.ALIGN_NORMAL);
                }
                jh9Var.G = 2131753993;
                arrayList.add(jh9Var);
                int size7 = arrayList.size() - 1;
                int L5 = gl.L(8.0f);
                if (pageblockblockquote.collapsed) {
                    i8 = gl.L(8.0f);
                } else {
                    i8 = 0;
                }
                arrayList3.add(new jg9(size6, size7, i34, i, L5, i8));
                return jh9Var;
            } else if (pageBlock instanceof TL_iv.pageBlockBlockquoteBlocks) {
                int i36 = rect.left;
                int i37 = i + 1;
                int size8 = arrayList.size();
                TL_iv.pageBlockBlockquoteBlocks pageblockblockquoteblocks = (TL_iv.pageBlockBlockquoteBlocks) pageBlock;
                TL_iv.RichText richText2 = pageblockblockquoteblocks.caption;
                if (richText2 != null && !TextUtils.isEmpty(w(richText2))) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                int i38 = 0;
                while (i38 < pageblockblockquoteblocks.blocks.size()) {
                    if (i38 == 0) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (i38 == pageblockblockquoteblocks.blocks.size() - 1) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    TL_iv.PageBlock pageBlock2 = pageblockblockquoteblocks.blocks.get(i38);
                    int L6 = gl.L(12.0f) + rect.left;
                    int i39 = rect.top;
                    if (z3) {
                        i6 = gl.L(4.0f);
                    } else {
                        i6 = 0;
                    }
                    int i40 = i39 + i6;
                    int L7 = gl.L(12.0f) + rect.right;
                    int i41 = i37;
                    int i42 = rect.bottom;
                    if (z4 && !z2) {
                        i7 = gl.L(4.0f);
                    } else {
                        i7 = 0;
                    }
                    j(pageBlock2, i41, new Rect(L6, i40, L7, i42 + i7), Q(i33, 9), N(i38, pageblockblockquoteblocks.blocks));
                    i38++;
                    i33 = i33;
                    pageblockblockquoteblocks = pageblockblockquoteblocks;
                    i37 = i41;
                }
                TL_iv.pageBlockBlockquoteBlocks pageblockblockquoteblocks2 = pageblockblockquoteblocks;
                int i43 = i33;
                if (arrayList.size() > size8) {
                    ((mg9) arrayList.get(size8)).F = 2131753993;
                }
                if (z2) {
                    hh9 hh9Var3 = new hh9(this, new Rect(gl.L(12.0f) + rect.left, rect.top, gl.L(12.0f) + rect.right, gl.L(6.0f) + rect.bottom), i15, new SpannableStringBuilder(l(pageblockblockquoteblocks2.caption, Q(i43, 11))));
                    hh9Var3.c0 = 0;
                    hh9Var3.j0(gl.L(2.0f), 0);
                    arrayList.add(hh9Var3);
                }
                arrayList3.add(new jg9(size8, arrayList.size() - 1, i36, i, 0, 0));
                return null;
            } else if (pageBlock instanceof TL_iv.pageBlockPullquote) {
                TL_iv.pageBlockPullquote pageblockpullquote = (TL_iv.pageBlockPullquote) pageBlock;
                SpannableStringBuilder l2 = l(pageBlock.text, Q(i33, q(pageBlock)));
                TL_iv.RichText richText3 = pageblockpullquote.caption;
                if (richText3 != null && !TextUtils.isEmpty(w(richText3))) {
                    spannableStringBuilder = l(pageblockpullquote.caption, Q(i33, 11));
                } else {
                    spannableStringBuilder = null;
                }
                jh9 jh9Var2 = new jh9(this, new Rect(gl.L(30.0f) + rect.left, gl.L(16.0f) + rect.top, gl.L(30.0f) + rect.right, gl.L(16.0f) + rect.bottom), this.B, l2, spannableStringBuilder, Layout.Alignment.ALIGN_CENTER);
                jh9Var2.G = 2131753994;
                arrayList.add(jh9Var2);
                return jh9Var2;
            } else if (pageBlock instanceof TL_iv.pageBlockButtonRow) {
                pg9 pg9Var = new pg9(this, rect, i15, (TL_iv.pageBlockButtonRow) pageBlock);
                pg9Var.G = 2131754871;
                arrayList.add(pg9Var);
                return pg9Var;
            } else if (pageBlock instanceof TL_iv.pageBlockTable) {
                try {
                    gh9 gh9Var = new gh9(this, rect, i15, (TL_iv.pageBlockTable) pageBlock);
                    gh9Var.G = 2131754854;
                    arrayList.add(gh9Var);
                    return gh9Var;
                } catch (IllegalArgumentException unused) {
                    return null;
                }
            } else if (pageBlock instanceof TL_iv.pageBlockMath) {
                yg9 yg9Var = new yg9(this, rect, i15, (TL_iv.pageBlockMath) pageBlock);
                arrayList.add(yg9Var);
                return yg9Var;
            } else if (pageBlock instanceof TL_iv.pageBlockDivider) {
                vg9 vg9Var = new vg9(this, rect, i15);
                arrayList.add(vg9Var);
                return vg9Var;
            } else if (pageBlock instanceof TL_iv.pageBlockPhoto) {
                TL_iv.pageBlockPhoto pageblockphoto = (TL_iv.pageBlockPhoto) pageBlock;
                ah9 ah9Var = new ah9(this, rect, this.B, pageblockphoto, arrayList.isEmpty());
                arrayList.add(ah9Var);
                k(pageblockphoto.caption, rect, i33);
                return ah9Var;
            } else if (pageBlock instanceof TL_iv.pageBlockVideo) {
                TL_iv.pageBlockVideo pageblockvideo = (TL_iv.pageBlockVideo) pageBlock;
                mh9 mh9Var = new mh9(this, rect, this.B, pageblockvideo, arrayList.isEmpty());
                arrayList.add(mh9Var);
                k(pageblockvideo.caption, rect, i33);
                return mh9Var;
            } else if (pageBlock instanceof TL_iv.pageBlockCollage) {
                TL_iv.pageBlockCollage pageblockcollage = (TL_iv.pageBlockCollage) pageBlock;
                sg9 sg9Var = new sg9(this, rect, this.B, pageblockcollage, arrayList.isEmpty());
                arrayList.add(sg9Var);
                k(pageblockcollage.caption, rect, i33);
                return sg9Var;
            } else if (pageBlock instanceof TL_iv.pageBlockSlideshow) {
                TL_iv.pageBlockSlideshow pageblockslideshow = (TL_iv.pageBlockSlideshow) pageBlock;
                eh9 eh9Var = new eh9(this, rect, this.B, pageblockslideshow, arrayList.isEmpty());
                arrayList.add(eh9Var);
                k(pageblockslideshow.caption, rect, i33);
                return eh9Var;
            } else if (pageBlock instanceof TL_iv.pageBlockMap) {
                TL_iv.pageBlockMap pageblockmap = (TL_iv.pageBlockMap) pageBlock;
                xg9 xg9Var = new xg9(this, rect, i15, pageblockmap);
                arrayList.add(xg9Var);
                k(pageblockmap.caption, rect, i33);
                return xg9Var;
            } else if (pageBlock instanceof TL_iv.pageBlockAudio) {
                TL_iv.pageBlockAudio pageblockaudio = (TL_iv.pageBlockAudio) pageBlock;
                HashMap hashMap = this.m;
                if (((k27) hashMap.get(pageblockaudio)) == null && (s = s(pageblockaudio.audio_id)) != null) {
                    TLRPC.TL_message tL_message = new TLRPC.TL_message();
                    tL_message.out = true;
                    int i44 = -Long.valueOf(pageblockaudio.audio_id).hashCode();
                    pageblockaudio.mid = i44;
                    tL_message.id = i44;
                    k27 k27Var = this.b;
                    tL_message.realId = k27Var.L1();
                    tL_message.dialog_id = k27.B0(k27Var.k);
                    TLRPC.Peer peer = k27Var.k.peer_id;
                    tL_message.peer_id = peer;
                    int i45 = this.a;
                    if (peer == null) {
                        TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                        tL_message.peer_id = tL_peerUser;
                        tL_peerUser.user_id = y6c.h(i45).e();
                    }
                    TLRPC.TL_peerUser tL_peerUser2 = new TLRPC.TL_peerUser();
                    tL_message.from_id = tL_peerUser2;
                    tL_peerUser2.user_id = y6c.h(i45).e();
                    tL_message.date = (int) (System.currentTimeMillis() / 1000);
                    tL_message.message = "";
                    TLRPC.TL_messageMediaDocument tL_messageMediaDocument = new TLRPC.TL_messageMediaDocument();
                    tL_message.media = tL_messageMediaDocument;
                    tL_messageMediaDocument.flags |= 3;
                    tL_messageMediaDocument.document = s;
                    tL_message.flags |= 768;
                    k27 k27Var2 = new k27(i45, tL_message, false, true);
                    this.l.add(k27Var2);
                    hashMap.put(pageblockaudio, k27Var2);
                }
                lg9 lg9Var = new lg9(this, rect, i15, pageblockaudio);
                arrayList.add(lg9Var);
                k(pageblockaudio.caption, rect, i33);
                return lg9Var;
            } else if (pageBlock instanceof TL_iv.pageBlockDocument) {
                TL_iv.pageBlockDocument pageblockdocument = (TL_iv.pageBlockDocument) pageBlock;
                wg9 wg9Var = new wg9(this, rect, i15, pageblockdocument);
                arrayList.add(wg9Var);
                k(pageblockdocument.caption, rect, i33);
                return wg9Var;
            } else if (pageBlock instanceof TL_iv.pageBlockCover) {
                return j(((TL_iv.pageBlockCover) pageBlock).cover, i, rect, i33, false);
            } else {
                if (pageBlock instanceof TL_iv.pageBlockAnchor) {
                    String str2 = ((TL_iv.pageBlockAnchor) pageBlock).name;
                    if (str2 == null) {
                        return null;
                    }
                    this.j.put(str2.toLowerCase(), Integer.valueOf(arrayList.size()));
                    return null;
                }
                if (pageBlock instanceof TL_iv.pageBlockEmbed) {
                    TL_iv.pageBlockEmbed pageblockembed = (TL_iv.pageBlockEmbed) pageBlock;
                    AtomicInteger atomicInteger = zi9.t0;
                    if (pageblockembed.html != null && vvc.m(pageblockembed.url)) {
                        if (vvc.m(pageblockembed.url)) {
                            String str3 = pageblockembed.url;
                            int j0 = i15 + (zi9.j0() << 1);
                            if (vvc.m(str3)) {
                                svcVar = (svc) vvc.a.get(str3);
                            } else {
                                svcVar = null;
                            }
                            if (svcVar != null && (i5 = svcVar.e) != 0) {
                                j0 = Math.min(j0, gl.L(Math.max(200, i5)));
                            }
                            i15 = j0 - (zi9.j0() << 1);
                        }
                        zi9 zi9Var = new zi9(this, rect, i15, pageblockembed, arrayList.isEmpty());
                        arrayList.add(zi9Var);
                        k(pageblockembed.caption, rect, i33);
                        return zi9Var;
                    }
                }
                if (pageBlock instanceof TL_iv.pageBlockUnsupported) {
                    if (fod.a(i33, 9)) {
                        i4 = gl.L(6.0f);
                    } else if (i > 0) {
                        i4 = gl.L(4.0f);
                    } else {
                        i4 = 0;
                    }
                    lh9 lh9Var = new lh9(this, new Rect((rect.left + i4) - gl.L(7.0f), Math.max(gl.L(14.0f), rect.top), (rect.right + i4) - gl.L(7.0f), Math.max(gl.L(14.0f), rect.bottom)), this.B, arrayList.size(), i);
                    this.e.add(lh9Var);
                    if (i == 0) {
                        this.f.add(lh9Var);
                    }
                    arrayList.add(lh9Var);
                    return lh9Var;
                } else if (pageBlock instanceof TL_iv.pageBlockDetails) {
                    TL_iv.pageBlockDetails pageblockdetails = (TL_iv.pageBlockDetails) pageBlock;
                    tg9 tg9Var = new tg9(this, rect, this.B, pageblockdetails, l(pageblockdetails.title, i33 & (-17)));
                    arrayList.add(tg9Var);
                    for (int i46 = 0; i46 < pageblockdetails.blocks.size(); i46++) {
                        j(pageblockdetails.blocks.get(i46), i + 1, rect, i33, N(i46, pageblockdetails.blocks));
                    }
                    arrayList.add(new ug9(this, new Rect(rect.left, 0, rect.right, 0), i15));
                    for (int size9 = arrayList.size(); size9 < arrayList.size(); size9++) {
                        mg9 mg9Var5 = (mg9) arrayList.get(size9);
                        if (mg9Var5.M == null) {
                            mg9Var5.M = tg9Var;
                        }
                    }
                    return tg9Var;
                } else {
                    boolean z19 = w01.a;
                    return null;
                }
            }
        } else {
            boolean H = o.H(pageBlock);
            hh9 hh9Var4 = new hh9(rh9Var2, rect, i15, rh9Var2.l(pageBlock.text, Q(i13, q(pageBlock))));
            if (H) {
                hh9Var4.j0(gl.L(10.0f), gl.L(6.0f));
            } else if (pageBlock instanceof TL_iv.pageBlockParagraph) {
                if (z) {
                    L = 0;
                } else {
                    L = gl.L(6.0f);
                }
                hh9Var4.j0(L, gl.L(6.0f));
            }
            if (pageBlock instanceof TL_iv.pageBlockHeading1) {
                i3 = 2131754027;
            } else if (pageBlock instanceof TL_iv.pageBlockHeading2) {
                i3 = 2131754026;
            } else if (pageBlock instanceof TL_iv.pageBlockHeading3) {
                i3 = 2131754025;
            } else if (pageBlock instanceof TL_iv.pageBlockHeading4) {
                i3 = 2131754024;
            } else if (pageBlock instanceof TL_iv.pageBlockHeading5) {
                i3 = 2131754023;
            } else if (pageBlock instanceof TL_iv.pageBlockHeading6) {
                i3 = 2131754022;
            } else if (pageBlock instanceof TL_iv.pageBlockFooter) {
                i3 = 2131754029;
            } else {
                i3 = 0;
            }
            hh9Var4.G = i3;
            arrayList.add(hh9Var4);
            return hh9Var4;
        }
    }

    public final void k(TL_iv.PageCaption pageCaption, Rect rect, int i) {
        boolean z;
        SpannableStringBuilder spannableStringBuilder;
        if (pageCaption != null) {
            TL_iv.RichText richText = pageCaption.text;
            boolean z2 = false;
            if (richText != null && !(richText instanceof TL_iv.textEmpty)) {
                z = true;
            } else {
                z = false;
            }
            TL_iv.RichText richText2 = pageCaption.credit;
            if (richText2 != null && !(richText2 instanceof TL_iv.textEmpty)) {
                z2 = true;
            }
            if (!z && !z2) {
                return;
            }
            int Q = Q(i, 10);
            SpannableStringBuilder spannableStringBuilder2 = null;
            if (z) {
                spannableStringBuilder = l(pageCaption.text, Q);
            } else {
                spannableStringBuilder = null;
            }
            if (z2) {
                spannableStringBuilder2 = l(pageCaption.credit, Q);
            }
            this.g.add(new rg9(this, rect, this.B, spannableStringBuilder, spannableStringBuilder2));
        }
    }

    public final SpannableStringBuilder l(TL_iv.RichText richText, int i) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (i == 0) {
            m(richText, spannableStringBuilder, 0);
        } else {
            n(richText, spannableStringBuilder, i, new oh9(this, i, false));
        }
        if (richText != null && spannableStringBuilder.length() > 0) {
            spannableStringBuilder.setSpan(new kg9(richText, i), 0, spannableStringBuilder.length(), 33);
        }
        return spannableStringBuilder;
    }

    public final void m(TL_iv.RichText richText, SpannableStringBuilder spannableStringBuilder, int i) {
        CharSequence charSequence;
        Object size;
        int length = spannableStringBuilder.length();
        if (!(richText instanceof TL_iv.textEmpty)) {
            if (richText instanceof TL_iv.textPlain) {
                spannableStringBuilder.append(((TL_iv.textPlain) richText).text);
            } else {
                if (richText instanceof TL_iv.textDiff) {
                    TL_iv.textDiff textdiff = (TL_iv.textDiff) richText;
                    boolean j = yi9.j(textdiff.text);
                    boolean j2 = yi9.j(textdiff.old_text);
                    if (j) {
                        if (!j2) {
                            n(textdiff.old_text, spannableStringBuilder, i, new wib(y(8192), 0));
                        }
                    } else {
                        TL_iv.RichText richText2 = textdiff.text;
                        if (j2) {
                            n(richText2, spannableStringBuilder, i, new wib(y(4096), 0));
                        } else {
                            n(richText2, spannableStringBuilder, i, new ama());
                        }
                    }
                } else if (richText instanceof TL_iv.textBold) {
                    int i2 = i | 16;
                    n(richText.text, spannableStringBuilder, i2, new oh9(this, i2, false));
                } else if (richText instanceof TL_iv.textItalic) {
                    int i3 = i | 32;
                    n(richText.text, spannableStringBuilder, i3, new oh9(this, i3, false));
                } else if (richText instanceof TL_iv.textUnderline) {
                    int i4 = i | 64;
                    n(richText.text, spannableStringBuilder, i4, new oh9(this, i4, false));
                } else if (richText instanceof TL_iv.textStrike) {
                    int i5 = i | 128;
                    n(richText.text, spannableStringBuilder, i5, new oh9(this, i5, false));
                } else if (richText instanceof TL_iv.textFixed) {
                    int i6 = i | 256;
                    n(richText.text, spannableStringBuilder, i6, new oh9(this, i6, false));
                } else if (richText instanceof TL_iv.textUrl) {
                    n(richText.text, spannableStringBuilder, i, new i4c(((TL_iv.textUrl) richText).url, y(1024)));
                } else if (richText instanceof TL_iv.textEmail) {
                    TL_iv.RichText richText3 = richText.text;
                    n(richText3, spannableStringBuilder, i, new i4c("mailto:" + ((TL_iv.textEmail) richText).email, y(1024)));
                } else if (richText instanceof TL_iv.textConcat) {
                    for (int i7 = 0; i7 < richText.texts.size(); i7++) {
                        m(richText.texts.get(i7), spannableStringBuilder, i);
                    }
                } else if (richText instanceof TL_iv.textSubscript) {
                    int i8 = i | 2048;
                    n(richText.text, spannableStringBuilder, i8, new oh9(this, i8, false));
                } else if (richText instanceof TL_iv.textSuperscript) {
                    int i9 = i | 4096;
                    n(richText.text, spannableStringBuilder, i9, new oh9(this, i9, false));
                } else if (richText instanceof TL_iv.textMarked) {
                    int i10 = i | 8192;
                    n(richText.text, spannableStringBuilder, i10, new oh9(this, i10, false));
                } else if (richText instanceof TL_iv.textPhone) {
                    TL_iv.textPhone textphone = (TL_iv.textPhone) richText;
                    String h = p38.h(textphone.phone, false);
                    if (textphone.phone.startsWith("+")) {
                        h = b00.h("+", h);
                    }
                    n(richText.text, spannableStringBuilder, i, new i4c(b00.h("tel:", h), y(1024)));
                } else if (richText instanceof TL_iv.textAnchor) {
                    TL_iv.textAnchor textanchor = (TL_iv.textAnchor) richText;
                    String str = textanchor.name;
                    if (str != null) {
                        String lowerCase = str.toLowerCase();
                        if (!(textanchor.text instanceof TL_iv.textEmpty)) {
                            this.k.put(lowerCase, textanchor);
                        } else {
                            HashMap hashMap = this.j;
                            if (!hashMap.containsKey(lowerCase)) {
                                hashMap.put(lowerCase, Integer.valueOf(this.g.size()));
                            }
                        }
                    }
                    TL_iv.RichText richText4 = richText.text;
                    String str2 = textanchor.name;
                    if (str2 != null) {
                        str2.toLowerCase();
                    }
                    n(richText4, spannableStringBuilder, i, new i17((byte) 3));
                } else {
                    int i11 = 4;
                    if (richText instanceof TL_iv.textMath) {
                        TL_iv.textMath textmath = (TL_iv.textMath) richText;
                        if (textmath.bitmap == null && !textmath.tried) {
                            textmath.tried = true;
                            lx5 a = lx5.a(textmath.source, gl.L(this.M + 4), true);
                            if (a != null) {
                                textmath.w = a.b;
                                textmath.h = a.c;
                                textmath.depth = a.d;
                                textmath.bitmap = a.a;
                            }
                        }
                        if (textmath.bitmap != null) {
                            int length2 = spannableStringBuilder.length();
                            spannableStringBuilder.append(" ");
                            int length3 = spannableStringBuilder.length();
                            spannableStringBuilder.setSpan(new qhb(null, textmath.bitmap, textmath.w, textmath.h, bkb.v0(bkb.F6, this.D), textmath.depth), length2, length3, 33);
                            String str3 = textmath.source;
                            if (str3 != null && !str3.isEmpty()) {
                                spannableStringBuilder.setSpan(new kib(textmath.source), length2, length3, 33);
                            }
                        }
                    } else {
                        float f = 1.2f;
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
                            boolean a2 = fod.a(i, 13);
                            int i12 = i & 15;
                            if (i12 >= 1 && i12 <= 6) {
                                TextPaint textPaint = new TextPaint(this.w);
                                new oh9(this, i, true).a(textPaint);
                                size = new gm(textcustomemoji.document_id, 0.85f, textPaint.getFontMetricsInt());
                            } else {
                                long j3 = textcustomemoji.document_id;
                                if (a2) {
                                    f = 1.0f;
                                }
                                gm gmVar = new gm(j3, f, (Paint.FontMetricsInt) null);
                                int i13 = this.M + 4;
                                if (a2) {
                                    i11 = -2;
                                }
                                size = gmVar.setSize(gl.L(i13 + i11));
                            }
                            spannableStringBuilder.setSpan(size, length4, length5, 33);
                        } else if (richText instanceof TL_iv.textSpoiler) {
                            n(richText.text, spannableStringBuilder, i, new wib(y(256), 0));
                        } else if (richText instanceof TL_iv.textMention) {
                            TLRPC.TL_messageEntityMention tL_messageEntityMention = new TLRPC.TL_messageEntityMention();
                            ?? obj = new Object();
                            obj.d = tL_messageEntityMention;
                            n(richText.text, spannableStringBuilder, i, new g4c(w(richText), (vib) obj));
                        } else if (richText instanceof TL_iv.textHashtag) {
                            TLRPC.TL_messageEntityHashtag tL_messageEntityHashtag = new TLRPC.TL_messageEntityHashtag();
                            ?? obj2 = new Object();
                            obj2.d = tL_messageEntityHashtag;
                            n(richText.text, spannableStringBuilder, i, new g4c(w(richText), (vib) obj2));
                        } else if (richText instanceof TL_iv.textBotCommand) {
                            n(richText.text, spannableStringBuilder, i, new d4c(w(richText), D() ? 1 : 0, null));
                        } else if (richText instanceof TL_iv.textCashtag) {
                            TLRPC.TL_messageEntityCashtag tL_messageEntityCashtag = new TLRPC.TL_messageEntityCashtag();
                            ?? obj3 = new Object();
                            obj3.d = tL_messageEntityCashtag;
                            n(richText.text, spannableStringBuilder, i, new g4c(w(richText), (vib) obj3));
                        } else if (richText instanceof TL_iv.textAutoUrl) {
                            n(richText.text, spannableStringBuilder, i, new i4c(w(richText), y(1024)));
                        } else if (richText instanceof TL_iv.textAutoEmail) {
                            n(richText.text, spannableStringBuilder, i, new i4c("mailto:".concat(w(richText)), y(1024)));
                        } else if (richText instanceof TL_iv.textAutoPhone) {
                            String w = w(richText);
                            String h2 = p38.h(w, false);
                            if (w.startsWith("+")) {
                                h2 = b00.h("+", h2);
                            }
                            n(richText.text, spannableStringBuilder, i, new i4c(b00.h("tel:", h2), y(1024)));
                        } else if (richText instanceof TL_iv.textTonAddress) {
                            n(richText.text, spannableStringBuilder, i, new g4c("tonaddress:".concat(w(richText)), (vib) null));
                        } else if (richText instanceof TL_iv.textBankCard) {
                            n(richText.text, spannableStringBuilder, i, new g4c("card:".concat(w(richText)), (vib) null));
                        } else if (richText instanceof TL_iv.textMentionName) {
                            n(richText.text, spannableStringBuilder, i, new j4c(String.valueOf(((TL_iv.textMentionName) richText).user_id), D() ? 1 : 0, null));
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
                            int i14 = i | 512;
                            TL_iv.RichText richText5 = richText.text;
                            oh9 oh9Var = new oh9(this, i14, false);
                            im4 im4Var = new im4(w(richText), null, tL_messageEntityFormattedDate);
                            int length6 = spannableStringBuilder.length();
                            m(richText5, spannableStringBuilder, i14);
                            if (spannableStringBuilder.length() > length6) {
                                T(oh9Var, spannableStringBuilder, length6, spannableStringBuilder.length());
                                T(im4Var, spannableStringBuilder, length6, spannableStringBuilder.length());
                            }
                        } else if (richText instanceof TL_iv.textButton) {
                            int length7 = spannableStringBuilder.length();
                            spannableStringBuilder.append("*");
                            qg9 qg9Var = new qg9(this, this.B, (TL_iv.textButton) richText, null);
                            qg9Var.d = 1.2f;
                            spannableStringBuilder.setSpan(qg9Var, length7, spannableStringBuilder.length(), 33);
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

    public final void n(TL_iv.RichText richText, SpannableStringBuilder spannableStringBuilder, int i, CharacterStyle characterStyle) {
        int length = spannableStringBuilder.length();
        m(richText, spannableStringBuilder, i);
        if (spannableStringBuilder.length() > length) {
            T(characterStyle, spannableStringBuilder, length, spannableStringBuilder.length());
        }
    }

    public final SpannableStringBuilder o(TL_iv.RichText richText, int i, IdentityHashMap identityHashMap) {
        IdentityHashMap identityHashMap2 = this.Y;
        this.Y = identityHashMap;
        try {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            m(richText, spannableStringBuilder, i);
            return spannableStringBuilder;
        } finally {
            this.Y = identityHashMap2;
        }
    }

    public final ArrayList p() {
        ArrayList arrayList = this.g;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        for (int i = 0; i < arrayList.size(); i++) {
            ((mg9) arrayList.get(i)).p(arrayList2);
        }
        for (int i2 = 0; i2 < arrayList2.size(); i2++) {
            ((jg7) arrayList2.get(i2)).getClass();
        }
        return arrayList2;
    }

    public final int r(int i, nb2 nb2Var) {
        int I;
        ArrayList arrayList = this.g;
        if (i >= 0 && i < arrayList.size() && nb2Var != null && (this.s || this.u)) {
            float max = Math.max(0.0f, Math.min(1.0f, nb2Var.L1));
            mg9 mg9Var = (mg9) arrayList.get(i);
            return Math.round(gl.R1(mg9Var.P, mg9Var.N, max));
        }
        int i2 = 0;
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            mg9 mg9Var2 = (mg9) arrayList.get(i3);
            boolean S = mg9Var2.S();
            if (i3 == i) {
                return i2;
            }
            if (S) {
                if (nb2Var != null && (this.s || this.u)) {
                    I = gl.U1(Math.max(0.0f, Math.min(1.0f, nb2Var.L1)), mg9Var2.Q, mg9Var2.O);
                } else {
                    I = mg9Var2.I();
                }
                i2 = I + i2;
            }
        }
        return this.A;
    }

    public final TLRPC.Document s(long j) {
        TL_iv.RichMessage richMessage = this.c;
        if (richMessage == null) {
            return null;
        }
        ArrayList<TLRPC.Document> arrayList = richMessage.documents;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            TLRPC.Document document = arrayList.get(i);
            i++;
            TLRPC.Document document2 = document;
            if (document2.id == j) {
                return document2;
            }
        }
        return null;
    }

    public final int t() {
        int i;
        if (this.d && this.A > gl.L(900.0f)) {
            return gl.L(950.0f);
        }
        int i2 = this.A;
        if (this.d) {
            i = gl.L(50.0f);
        } else {
            i = 0;
        }
        return i2 + i;
    }

    public final TLRPC.Photo u(long j) {
        TL_iv.RichMessage richMessage = this.c;
        if (richMessage == null) {
            return null;
        }
        ArrayList<TLRPC.Photo> arrayList = richMessage.photos;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            TLRPC.Photo photo = arrayList.get(i);
            i++;
            TLRPC.Photo photo2 = photo;
            if (photo2.id == j) {
                return photo2;
            }
        }
        return null;
    }

    public final java.lang.String v(int r22, int r23) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rh9.v(int, int):java.lang.String");
    }

    public rh9(k27 k27Var, int i, rh9 rh9Var) {
        this.e = new ArrayList();
        this.f = new ArrayList();
        this.g = new ArrayList();
        this.h = new ArrayList();
        this.j = new HashMap();
        this.k = new HashMap();
        this.l = new ArrayList();
        this.m = new HashMap();
        this.n = new ArrayList();
        this.o = new ArrayList();
        this.p = new ArrayList();
        this.q = "";
        this.t = 1.0f;
        this.w = new TextPaint(1);
        this.x = new TextPaint(1);
        this.y = new n79(null);
        this.z = new xl3((byte) 7);
        this.K = new RectF();
        this.b = k27Var;
        this.B = i;
        this.a = k27Var.K1;
        I(rh9Var);
    }
}
