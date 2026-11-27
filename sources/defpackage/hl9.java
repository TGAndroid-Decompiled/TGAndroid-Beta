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
public final class hl9 {
    public int A;
    public final int B;
    public int C;
    public vnb D;
    public wb2 E;
    public rb2 F;
    public v41 G;
    public Paint H;
    public pkb I;
    public va6 J;
    public final RectF K;
    public boolean L;
    public int M;
    public float N;
    public boolean O;
    public hl9 P;
    public View Q;
    public mpa R;
    public int S;
    public int T;
    public mm U;
    public float V;
    public dk9 W;
    public int X;
    public IdentityHashMap Y;
    public final int a;
    public final r47 b;
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
    public vi7 r;
    public boolean s;
    public float t;
    public boolean u;
    public boolean v;
    public final TextPaint w;
    public final TextPaint x;
    public final ab9 y;
    public final pm3 z;

    public hl9(int i, int i2, vnb vnbVar) {
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
        this.y = new ab9(null);
        this.z = new pm3((byte) 7);
        this.K = new RectF();
        this.b = null;
        this.a = i;
        this.B = i2;
        this.D = vnbVar;
        int i3 = xea.S0;
        this.M = i3;
        this.N = hl.p;
        textPaint.setTextSize(hl.L(i3));
        textPaint2.setTextSize(hl.L(this.M));
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
            return qd4.o(str, ".");
        } else if (TLObject.hasFlag(pageListOrderedItem.flags, 8)) {
            return uh9.l(new StringBuilder(), pageListOrderedItem.value, ".");
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
            arrayList.add((ak9) arrayList2.get(arrayList.size()));
        }
    }

    public static SpannableStringBuilder Z(CharSequence charSequence) {
        el9[] el9VarArr;
        int i;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
        for (el9 el9Var : (el9[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), el9.class)) {
            int spanStart = spannableStringBuilder.getSpanStart(el9Var);
            int spanEnd = spannableStringBuilder.getSpanEnd(el9Var);
            if (spanEnd > spanStart) {
                int i2 = el9Var.b;
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
                    spannableStringBuilder.setSpan(new smb(obj, 0), spanStart, spanEnd, 33);
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
            wi9.g(sb2, Z);
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
            if (((Boolean) qd4.l(1, arrayList)).booleanValue()) {
                str = "</ol>";
            } else {
                str = "</ul>";
            }
            sb.append(str);
        }
    }

    public static defpackage.j47[] e(float[] r32) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hl9.e(float[]):j47[]");
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
            if (!mm9.j(textdiff.text)) {
                x(textdiff.text, sb);
            } else if (!mm9.j(textdiff.old_text)) {
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

    public static rmb y(int i) {
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
        wb2 wb2Var = this.E;
        if (wb2Var != null && wb2Var.gb > 0) {
            return true;
        }
        return false;
    }

    public final boolean B() {
        dm dmVar;
        if (E()) {
            int i = 0;
            while (true) {
                ArrayList arrayList = this.n;
                if (i >= arrayList.size()) {
                    break;
                }
                kmb kmbVar = (kmb) arrayList.get(i);
                if ((kmbVar instanceof gl9) && (dmVar = ((gl9) kmbVar).F) != null && !dmVar.a.isEmpty()) {
                    return true;
                }
                i++;
            }
        }
        return false;
    }

    public final boolean C() {
        r47 r47Var = this.b;
        if (r47Var != null && r47Var.P2() && !r47Var.O3()) {
            return true;
        }
        return false;
    }

    public final boolean D() {
        r47 r47Var = this.b;
        if (r47Var != null && r47Var.O3()) {
            return true;
        }
        return false;
    }

    public final boolean E() {
        vi7 vi7Var = this.r;
        if (vi7Var != null && vi7Var.h) {
            return false;
        }
        return true;
    }

    public final boolean F() {
        wb2 wb2Var = this.E;
        if (wb2Var != null && wb2Var.L2()) {
            return true;
        }
        return false;
    }

    public final boolean G() {
        kmb[] K;
        dk9 dk9Var = this.W;
        if (dk9Var != null && (K = dk9Var.K()) != null) {
            for (kmb kmbVar : K) {
                if (kmbVar instanceof gl9) {
                    gl9 gl9Var = (gl9) kmbVar;
                    if (gl9Var.N != null || gl9Var.R != null) {
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

    public final void I(hl9 hl9Var) {
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
                dk9 dk9Var = (dk9) arrayList.get(i3);
                View view2 = dk9Var.W;
                if (view2 != null && view2 == view) {
                    dk9Var.U();
                    CheckBoxBase checkBoxBase = dk9Var.r;
                    if (checkBoxBase != null) {
                        checkBoxBase.l = false;
                    }
                    dk9Var.W = null;
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
        this.M = xea.S0;
        this.N = hl.p;
        this.w.setTextSize(hl.L(xea.S0));
        this.x.setTextSize(hl.L(xea.S0));
        this.d = false;
        this.c = null;
        r47 r47Var = this.b;
        if (r47Var != null && r47Var.k != null && r47Var.E0() != null) {
            TL_iv.RichMessage E0 = r47Var.E0();
            this.c = E0;
            this.d = E0.part;
            this.P = hl9Var;
            int i4 = 0;
            while (i4 < this.c.blocks.size()) {
                TL_iv.PageBlock pageBlock = this.c.blocks.get(i4);
                hl9 hl9Var2 = this;
                dk9 j = hl9Var2.j(pageBlock, 0, new Rect(), 0, N(i4, this.c.blocks));
                if ((j instanceof xk9) && (((z3 = pageBlock instanceof TL_iv.pageBlockParagraph)) || o.H(pageBlock))) {
                    xk9 xk9Var = (xk9) j;
                    if (i4 == 0 && z3) {
                        i = 0;
                    } else {
                        i = xk9Var.a0;
                    }
                    if (i4 == hl9Var2.c.blocks.size() - 1) {
                        i2 = 0;
                    } else {
                        i2 = xk9Var.b0;
                    }
                    xk9Var.i0(i, i2);
                }
                i4++;
                this = hl9Var2;
            }
            hl9 hl9Var3 = this;
            for (int i5 = 0; i5 < arrayList.size(); i5++) {
                dk9 dk9Var2 = (dk9) arrayList.get(i5);
                if ((dk9Var2 instanceof xk9) && dk9Var2.w > 0) {
                    if (i5 > 0 && ((dk9) arrayList.get(i5 - 1)).w > 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    int i6 = i5 + 1;
                    if (i6 < arrayList.size() && ((dk9) arrayList.get(i6)).w > 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    xk9 xk9Var2 = (xk9) dk9Var2;
                    float f2 = 6.0f;
                    if (z) {
                        f = 3.0f;
                    } else {
                        f = 6.0f;
                    }
                    int L = hl.L(f);
                    if (z2) {
                        f2 = 3.0f;
                    }
                    xk9Var2.i0(L, hl.L(f2));
                }
            }
            hl9Var3.P = null;
            if (hl9Var3.r != null) {
                for (int i7 = 0; i7 < arrayList.size(); i7++) {
                    ((dk9) arrayList.get(i7)).L = hl9Var3.r;
                }
                hl9Var3.r.k(hl9Var3.p());
            }
            if (view != null) {
                for (int i8 = 0; i8 < arrayList.size(); i8++) {
                    ((dk9) arrayList.get(i8)).m(view);
                }
            }
            hl9Var3.P();
            hl9Var3.W();
        }
    }

    public final boolean K(TL_iv.RichMessage richMessage, int i) {
        if (this.c == richMessage && this.M == xea.S0 && Math.abs(this.N - hl.p) <= 0.1f && i == this.B) {
            return false;
        }
        return true;
    }

    public final boolean L(android.view.MotionEvent r12) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hl9.L(android.view.MotionEvent):boolean");
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
                ak9 ak9Var = (ak9) obj;
                if (i >= ak9Var.a && i <= ak9Var.b) {
                    arrayList.add(ak9Var);
                }
            }
            Collections.sort(arrayList, new qq7((byte) 15));
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
            this.C = Math.max(this.C, ((dk9) arrayList.get(i)).J());
            i++;
        }
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            dk9 dk9Var = (dk9) arrayList.get(i2);
            if (dk9Var instanceof wk9) {
                wk9 wk9Var = (wk9) dk9Var;
                int i3 = this.C;
                int i4 = wk9Var.f0;
                int i5 = wk9Var.e0;
                Rect rect = wk9Var.b;
                int max = Math.max(i4, Math.min(i5, Math.max(0, (i3 - rect.left) - rect.right)));
                wk9Var.g0 = max;
                zib zibVar = wk9Var.Y;
                zibVar.setRenderWidth(max);
                wk9Var.h0 = zibVar.getRenderHeight();
            }
        }
        StringBuilder sb = new StringBuilder();
        int i6 = 0;
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            dk9 dk9Var2 = (dk9) arrayList.get(i7);
            boolean R = dk9Var2.R();
            dk9Var2.N = i6;
            dk9Var2.O = 0;
            dk9Var2.R = R;
            Rect rect2 = dk9Var2.b;
            dk9Var2.Y(rect2.left, rect2.top + i6, i7);
            if (R) {
                kmb[] K = dk9Var2.K();
                if (K != null) {
                    for (kmb kmbVar : K) {
                        if (kmbVar != null && kmbVar.a() != null) {
                            if (sb.length() > 0) {
                                sb.append('\n');
                            }
                            arrayList3.add(Integer.valueOf(sb.length()));
                            arrayList4.add(Integer.valueOf(i7));
                            arrayList2.add(kmbVar);
                            CharSequence text = kmbVar.a().getText();
                            if (text != null) {
                                sb.append(text);
                            }
                        }
                    }
                }
                int H = dk9Var2.H();
                dk9Var2.O = H;
                i6 += H;
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
                    dk9 dk9Var = (dk9) arrayList.get(i3);
                    if (dk9Var instanceof jk9) {
                        jk9 jk9Var = (jk9) dk9Var;
                        gl9 gl9Var = jk9Var.Y;
                        gl9Var.c = (hl.L(53.0f) + (jk9Var.T - jk9Var.a.S)) - gl9Var.f;
                    }
                    i3++;
                } else {
                    return;
                }
            }
        }
    }

    public final void S(wb2 wb2Var, rb2 rb2Var) {
        this.E = wb2Var;
        this.F = rb2Var;
    }

    public final void T(CharacterStyle characterStyle, SpannableStringBuilder spannableStringBuilder, int i, int i2) {
        if (characterStyle instanceof el9) {
            int i3 = ((el9) characterStyle).b;
            el9[] el9VarArr = (el9[]) spannableStringBuilder.getSpans(i, i2, el9.class);
            if (el9VarArr != null && el9VarArr.length > 0) {
                Arrays.sort(el9VarArr, Comparator$CC.comparingInt(new kn1(spannableStringBuilder, (byte) 2)));
                for (int i4 = 0; i4 < el9VarArr.length; i4++) {
                    int spanStart = spannableStringBuilder.getSpanStart(el9VarArr[i4]);
                    int spanEnd = spannableStringBuilder.getSpanEnd(el9VarArr[i4]);
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
            spannableStringBuilder.setSpan(new el9(this, i3, z), i, nextSpanTransition, 33);
            i = nextSpanTransition;
        }
    }

    public final void V(vi7 vi7Var) {
        this.r = vi7Var;
        int i = 0;
        while (true) {
            ArrayList arrayList = this.g;
            if (i < arrayList.size()) {
                ((dk9) arrayList.get(i)).L = vi7Var;
                arrayList.get(i);
                ((dk9) arrayList.get(i)).getClass();
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
                ((dk9) arrayList.get(i)).c0();
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
        dk9 dk9Var = (dk9) arrayList.get(0);
        if (!(dk9Var instanceof qk9) && !(dk9Var instanceof cl9) && !(dk9Var instanceof ik9) && !(dk9Var instanceof uk9) && !(dk9Var instanceof nm9)) {
            return false;
        }
        return true;
    }

    public final void a0(int i) {
        gl9 gl9Var;
        View view;
        boolean z;
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.n;
            if (i2 < arrayList.size()) {
                kmb kmbVar = (kmb) arrayList.get(i2);
                if ((kmbVar instanceof gl9) && (view = (gl9Var = (gl9) kmbVar).T) != null) {
                    hm.release(view, gl9Var.F);
                    gl9Var.F = null;
                    View view2 = gl9Var.T;
                    if (gl9Var.a.v && !gl9Var.w) {
                        z = true;
                    } else {
                        z = false;
                    }
                    gl9Var.F = hm.update(i, view2, z, (dm) null, gl9Var.b);
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
                    ((dk9) arrayList.get(i)).m(view);
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    public final void c(org.telegram.tgnet.TLRPC.Chat r10, org.telegram.tgnet.TLRPC.User r11) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hl9.c(org.telegram.tgnet.TLRPC$Chat, org.telegram.tgnet.TLRPC$User):void");
    }

    public final void f(View view) {
        View view2 = this.Q;
        if (view2 == view && view2 != null) {
            mpa mpaVar = this.R;
            if (mpaVar != null) {
                mpaVar.b(view);
                this.R = null;
            }
            this.Q = null;
            int i = 0;
            while (true) {
                ArrayList arrayList = this.g;
                if (i >= arrayList.size()) {
                    break;
                }
                dk9 dk9Var = (dk9) arrayList.get(i);
                View view3 = dk9Var.W;
                if (view3 != null && view3 == view) {
                    dk9Var.U();
                    CheckBoxBase checkBoxBase = dk9Var.r;
                    if (checkBoxBase != null) {
                        checkBoxBase.l = false;
                    }
                    dk9Var.W = null;
                }
                i++;
            }
            if (view == this.E) {
                this.E = null;
                this.F = null;
            }
        }
    }

    public final void g(Canvas canvas, int i, int i2, dc2 dc2Var) {
        int i3;
        boolean z;
        float f;
        float f2;
        hl9 hl9Var;
        dc2 dc2Var2;
        int i4;
        int i5;
        boolean z2;
        rb2 rb2Var;
        R(i, i2);
        if (D()) {
            i3 = aob.Yc;
        } else {
            i3 = aob.Xc;
        }
        this.w.linkColor = aob.v0(i3, this.D);
        boolean z3 = this.d;
        int min = Math.min(this.A, hl.L(900.0f));
        if (z3) {
            canvas.saveLayerAlpha(-i, 0.0f, this.C + i2, min, 255, 31);
        }
        wb2 wb2Var = this.E;
        boolean z4 = false;
        if (wb2Var != null && wb2Var.Ec > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            float f3 = wb2Var.Cc - wb2Var.u0;
            f2 = wb2Var.Ec + f3;
            f = f3;
            dc2Var2 = dc2Var;
            hl9Var = this;
        } else {
            f = 0.0f;
            f2 = 0.0f;
            hl9Var = this;
            dc2Var2 = dc2Var;
        }
        hl9Var.h(canvas, dc2Var2, z, f, f2);
        if (z3) {
            RectF rectF = hl.P;
            rectF.set(-i, min - hl.L(32.0f), this.C + i2, min);
            this.z.r(canvas, rectF, 3, 1.0f);
            canvas.restore();
            if (D()) {
                i4 = aob.Ob;
            } else {
                i4 = aob.Bd;
            }
            int v0 = aob.v0(i4, this.D);
            if (this.I == null) {
                this.I = new pkb(ob6.M0(2131745067, null), 16.0f, hl.o());
            }
            v41 v41Var = this.G;
            if (v41Var == null) {
                this.G = new v41(this.Q, 1.5f, 2.0f);
            } else {
                View view = v41Var.a;
                View view2 = this.Q;
                if (view != view2) {
                    v41Var.a = view2;
                }
            }
            Paint paint = this.H;
            if (paint == null) {
                paint = new Paint(1);
                this.H = paint;
            }
            paint.setColor(aob.p1(0.1f, v0));
            float f4 = this.I.c;
            int i6 = this.C;
            float f5 = (((i6 + i5) + this.T) / 2.0f) - this.S;
            float L = hl.L(4.0f) + min;
            float L2 = (((this.C + this.S) + this.T) - hl.L(24.0f)) / 2.0f;
            RectF rectF2 = this.K;
            rectF2.set(f5 - L2, L, f5 + L2, hl.L(42.0f) + L);
            wb2 wb2Var2 = this.E;
            if (wb2Var2 != null && (rb2Var = this.F) != null && rb2Var.k1(wb2Var2, 7)) {
                z2 = true;
            } else {
                z2 = false;
            }
            va6 va6Var = this.J;
            if (va6Var != null && !z2 && !va6Var.c() && !this.J.d()) {
                this.J.a();
            }
            va6 va6Var2 = this.J;
            if (va6Var2 == null) {
                if (z2) {
                    va6 va6Var3 = new va6();
                    this.J = va6Var3;
                    va6Var3.x.setStrokeWidth(hl.L(1.25f));
                    this.J.D = true;
                }
            } else if (z2 && (va6Var2.c() || this.J.d())) {
                va6 va6Var4 = this.J;
                va6Var4.b = -1L;
                va6Var4.c = -1L;
            }
            va6 va6Var5 = this.J;
            if (va6Var5 != null) {
                va6Var5.g(aob.p1(0.1f, v0), aob.p1(0.3f, v0), aob.p1(0.3f, v0), aob.p1(1.2f, v0));
            }
            float a = this.G.a(0.075f);
            if (a != 1.0f) {
                z4 = true;
            }
            if (z4) {
                canvas.save();
                canvas.scale(a, a, rectF2.centerX(), rectF2.centerY());
            }
            canvas.drawRoundRect(rectF2, hl.L(8.0f), hl.L(8.0f), this.H);
            va6 va6Var6 = this.J;
            if (va6Var6 != null && !va6Var6.c()) {
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

    public final void h(Canvas canvas, dc2 dc2Var, boolean z, float f, float f2) {
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
        jk9 jk9Var;
        float f8;
        float f9;
        float f10;
        int i;
        int i2;
        boolean z5;
        float f11;
        float f12;
        float f13;
        int H;
        float f14;
        float f15;
        int i3;
        float f16;
        int H2;
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
                ak9 ak9Var = (ak9) arrayList.get(i6);
                int r = r(ak9Var.a, dc2Var);
                int i8 = ak9Var.b;
                ArrayList arrayList2 = this.g;
                float f19 = 4.0f;
                if (i8 >= 0 && i8 < arrayList2.size() && dc2Var != null && (this.s || this.u)) {
                    float max = Math.max(f17, Math.min(1.0f, dc2Var.L1));
                    dk9 dk9Var = (dk9) arrayList2.get(i8);
                    int d = c00.d(4.0f, dk9Var.b.bottom, i5);
                    float f20 = dk9Var.P + dk9Var.Q;
                    if (dk9Var.S) {
                        i4 = d;
                    } else {
                        i4 = i5;
                    }
                    float f21 = f20 - i4;
                    float f22 = dk9Var.N + dk9Var.O;
                    if (!dk9Var.R) {
                        d = i5;
                    }
                    i3 = Math.round(hl.R1(f21, f22 - d, max));
                } else {
                    int i9 = i5;
                    int i10 = i9;
                    while (true) {
                        if (i9 < arrayList2.size()) {
                            dk9 dk9Var2 = (dk9) arrayList2.get(i9);
                            boolean R = dk9Var2.R();
                            Rect rect = dk9Var2.b;
                            if (R) {
                                float f23 = f19;
                                if (dc2Var != null && (this.s || this.u)) {
                                    H2 = hl.U1(Math.max(f17, Math.min(1.0f, dc2Var.L1)), dk9Var2.Q, dk9Var2.O);
                                } else {
                                    H2 = dk9Var2.H();
                                }
                                int i11 = H2 + i10;
                                if (i9 == i8 && rect.bottom > hl.L(f23)) {
                                    f16 = f23;
                                    i11 = uh9.f(f16, rect.bottom, i11);
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
                int i12 = ak9Var.b;
                ArrayList arrayList3 = this.g;
                float f24 = 1.0f;
                for (int i13 = ak9Var.a; i13 < Math.min(i12 + 1, arrayList3.size()); i13++) {
                    dk9 dk9Var3 = (dk9) arrayList3.get(i13);
                    if (dk9Var3.R()) {
                        f24 *= dk9Var3.y();
                    }
                }
                int L = hl.L(3.0f) * ak9Var.d;
                int i14 = ak9Var.e + L;
                int i15 = L + ak9Var.f;
                if (i3 - r > i14 + i15) {
                    r += i14;
                    i3 -= i15;
                }
                RectF rectF = hl.P;
                rectF.set(ak9Var.c, r, this.C - hl.L(ak9Var.d * 12), i3);
                canvas3.save();
                canvas3.scale(f24, f24, rectF.centerX(), rectF.centerY());
                float floor = (float) Math.floor(xea.U0 / 3.0f);
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
            dk9 dk9Var4 = (dk9) this.g.get(i16);
            if ((dk9Var4 instanceof sk9) && (dk9Var4.R || dk9Var4.S)) {
                sk9 sk9Var = (sk9) dk9Var4;
                int r2 = sk9Var.X.r();
                gl9 gl9Var = sk9Var.Y;
                if (gl9Var != null) {
                    i2 = gl9Var.r();
                } else {
                    i2 = 0;
                }
                int max2 = Math.max(r2, i2);
                if (max2 > 0) {
                    if (dc2Var != null && (this.s || this.u)) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    if (z5) {
                        f11 = Math.max(0.0f, Math.min(f18, dc2Var.L1));
                    } else {
                        f11 = f18;
                    }
                    if (z5) {
                        if (sk9Var.S) {
                            f14 = f18;
                        } else {
                            f14 = 0.0f;
                        }
                        if (sk9Var.R) {
                            f15 = f18;
                        } else {
                            f15 = 0.0f;
                        }
                        f12 = hl.R1(f14, f15, f11);
                    } else if (sk9Var.R) {
                        f12 = f18;
                    } else {
                        f12 = 0.0f;
                    }
                    if (f12 > 0.0f) {
                        float f25 = ((this.C + this.T) - this.S) / 2.0f;
                        float f26 = max2 / 2.0f;
                        float L2 = (f25 - f26) - hl.L(30.0f);
                        float L3 = f25 + f26 + hl.L(30.0f);
                        if (z5) {
                            f13 = hl.R1(sk9Var.P, sk9Var.N, f11);
                            H = hl.U1(f11, sk9Var.Q, sk9Var.O);
                        } else {
                            f13 = sk9Var.N;
                            H = sk9Var.H();
                        }
                        float L4 = hl.L(8.0f) + f13;
                        float L5 = (f13 + H) - hl.L(8.0f);
                        if (L5 > L4) {
                            RectF rectF2 = hl.P;
                            rectF2.set(L2, L4, L3, L5);
                            float floor2 = (float) Math.floor(xea.U0 / 2.0f);
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
                            this.i.setBounds(hl.L(8.0f) + i17, hl.L(7.0f) + i18, uh9.w(8.0f, i17, intrinsicWidth), uh9.w(7.0f, i18, intrinsicHeight));
                            canvas3.scale(-1.0f, -1.0f, this.i.getBounds().centerX(), this.i.getBounds().centerY());
                            this.i.draw(canvas3);
                            canvas3.restore();
                            canvas3.save();
                            canvas3.clipRect(L2, L4, L3, L5);
                            int i19 = (int) L3;
                            int i20 = (int) L5;
                            this.i.setBounds(qu6.x(8.0f, i19, intrinsicWidth), qu6.x(7.0f, i20, intrinsicHeight), i19 - hl.L(8.0f), i20 - hl.L(7.0f));
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
        r47 r47Var = this.b;
        if (!this.O && (r47Var == null || !uc7.s1(this.a).j4.z(r47Var))) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (!z2 && this.U == null) {
            this.V = 0.0f;
        } else {
            mm mmVar = this.U;
            if (mmVar == null) {
                mm mmVar2 = new mm(0L, 350L, k43.h);
                this.U = mmVar2;
                mmVar = mmVar2;
            }
            if (z2) {
                f3 = 1.0f;
            } else {
                f3 = 0.0f;
            }
            float e = mmVar.e(false, f3);
            this.V = e;
            if (e > 0.0f && (view = this.Q) != null) {
                view.invalidate();
            }
        }
        if (dc2Var != null && (this.s || this.u)) {
            f4 = 1.0f;
            f5 = Math.max(0.0f, Math.min(1.0f, dc2Var.L1));
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
                dk9 dk9Var5 = (dk9) arrayList4.get(i22);
                if (dk9Var5 instanceof jk9) {
                    jk9 jk9Var2 = (jk9) dk9Var5;
                    jk9Var2.e0 = hl.R1(jk9Var2.P, jk9Var2.N, f5) + jk9Var2.H();
                    int i23 = i22 + 1;
                    while (true) {
                        if (i23 < arrayList4.size()) {
                            dk9 dk9Var6 = (dk9) arrayList4.get(i23);
                            do {
                                dk9Var6 = dk9Var6.M;
                                if (dk9Var6 == null) {
                                    f10 = hl.R1(((dk9) arrayList4.get(i23)).P, ((dk9) arrayList4.get(i23)).N, f5);
                                    break;
                                }
                            } while (dk9Var6 != jk9Var2);
                            i23++;
                        } else {
                            f10 = Float.MAX_VALUE;
                            break;
                        }
                    }
                    jk9Var2.f0 = f10;
                }
            }
        }
        ArrayList arrayList5 = this.g;
        for (int i24 = 0; i24 < arrayList5.size(); i24++) {
            dk9 dk9Var7 = (dk9) arrayList5.get(i24);
            if (dk9Var7 instanceof yk9) {
                yk9 yk9Var = (yk9) dk9Var7;
                if (yk9Var.i0) {
                    f8 = 1.0f;
                } else {
                    f8 = 0.0f;
                }
                if (yk9Var.h0) {
                    f9 = 1.0f;
                } else {
                    f9 = 0.0f;
                }
                yk9Var.j0 = hl.R1(f8, f9, f5);
                yk9Var.k0 = hl.U1(f5, yk9Var.Q, yk9Var.O);
            }
        }
        int i25 = 0;
        while (i25 < this.g.size()) {
            dk9 dk9Var8 = (dk9) this.g.get(i25);
            if (dk9Var8.R || dk9Var8.S) {
                float R12 = hl.R1(dk9Var8.P, dk9Var8.N, f5);
                boolean z7 = dk9Var8 instanceof kk9;
                if (z7) {
                    R1 = 1.0f;
                } else {
                    if (dk9Var8.S) {
                        f6 = 1.0f;
                    } else {
                        f6 = 0.0f;
                    }
                    if (dk9Var8.R) {
                        f7 = 1.0f;
                    } else {
                        f7 = 0.0f;
                    }
                    R1 = hl.R1(f6, f7, f5);
                }
                if (R1 > 0.0f) {
                    int H3 = dk9Var8.H();
                    if (!z3 || (H3 + R12 > f && R12 < f2)) {
                        canvas3.save();
                        if (z4 && (jk9Var = dk9Var8.M) != null && !z7) {
                            float f27 = -3.4028235E38f;
                            float f28 = Float.MAX_VALUE;
                            for (jk9Var = dk9Var8.M; jk9Var != null; jk9Var = jk9Var.M) {
                                f27 = Math.max(f27, jk9Var.e0);
                                f28 = Math.min(f28, jk9Var.f0);
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
                            int saveLayerAlpha = canvas2.saveLayerAlpha(-this.S, 0.0f, this.C + this.T, H3, (int) (R1 * 255.0f), 31);
                            dk9Var8.s(canvas2);
                            canvas2.restoreToCount(saveLayerAlpha);
                        } else {
                            canvas2 = canvas3;
                            dk9Var8.s(canvas2);
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
                    dk9 dk9Var = (dk9) arrayList.get(i);
                    if (dk9Var.R) {
                        canvas.save();
                        canvas.translate(0.0f, dk9Var.N);
                        dk9Var.r(canvas, colorFilter);
                        canvas.restore();
                    }
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    public final dk9 j(TL_iv.PageBlock pageBlock, int i, Rect rect, int i2, boolean z) {
        int L;
        int i3;
        int i4;
        h0d h0dVar;
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
        zk9 zk9Var;
        int i8;
        int i9;
        TextPaint textPaint;
        int i10;
        int i11;
        int i12;
        hl9 hl9Var;
        int L2;
        dk9 dk9Var;
        boolean z5;
        hl9 hl9Var2 = this;
        int i13 = i2;
        int i14 = rect.left + rect.right;
        int i15 = hl9Var2.B;
        if (i14 >= i15) {
            return null;
        }
        boolean z6 = pageBlock instanceof TL_iv.pageBlockThinking;
        int i16 = 0;
        ArrayList arrayList = hl9Var2.g;
        if (z6) {
            al9 al9Var = new al9(hl9Var2, new Rect(), i15, hl9Var2.l(pageBlock.text, 0));
            arrayList.add(al9Var);
            return al9Var;
        } else if (!o.H(pageBlock) && !(pageBlock instanceof TL_iv.pageBlockFooter) && !(pageBlock instanceof TL_iv.pageBlockParagraph)) {
            if (pageBlock instanceof TL_iv.pageBlockPreformatted) {
                TL_iv.pageBlockPreformatted pageblockpreformatted = (TL_iv.pageBlockPreformatted) pageBlock;
                hl9 hl9Var3 = hl9Var2.P;
                if (hl9Var3 == null) {
                    dk9Var = null;
                } else {
                    ArrayList arrayList2 = hl9Var3.g;
                    int size = arrayList2.size();
                    int i17 = 0;
                    while (true) {
                        if (i17 < size) {
                            Object obj = arrayList2.get(i17);
                            i17++;
                            dk9 dk9Var2 = (dk9) obj;
                            if (rk9.class.isInstance(dk9Var2) && (dk9Var2 instanceof rk9)) {
                                String str = ((rk9) dk9Var2).o0;
                                String w = w(pageBlock.text);
                                if (str != null && str.length() <= w.length() && w.length() > 0) {
                                    z5 = w.startsWith(str);
                                } else {
                                    z5 = false;
                                }
                                if (z5) {
                                    dk9Var = (dk9) rk9.class.cast(dk9Var2);
                                    break;
                                }
                            }
                        } else {
                            dk9Var = null;
                            break;
                        }
                    }
                }
                rk9 rk9Var = new rk9(hl9Var2, rect, hl9Var2.B, pageblockpreformatted, (rk9) dk9Var);
                rk9Var.G = 2131754048;
                arrayList.add(rk9Var);
                return rk9Var;
            }
            boolean z7 = pageBlock instanceof TL_iv.pageBlockList;
            TextPaint textPaint2 = hl9Var2.x;
            if (z7) {
                TL_iv.pageBlockList pageblocklist = (TL_iv.pageBlockList) pageBlock;
                int i18 = i + 1;
                textPaint2.setTextSize(hl.L(xea.S0));
                int L3 = hl.L(16.0f);
                for (int i19 = 0; i19 < pageblocklist.items.size(); i19++) {
                    if (pageblocklist.items.get(i19).checkbox) {
                        L2 = hl.L(26.0f);
                    } else {
                        L2 = hl.L(16.0f);
                    }
                    L3 = Math.max(L3, L2);
                }
                Rect rect2 = new Rect(rect);
                if (hl9Var2.H()) {
                    rect2.right += L3;
                } else {
                    rect2.left += L3;
                }
                int i20 = 0;
                while (i20 < pageblocklist.items.size()) {
                    TL_iv.PageListItem pageListItem = pageblocklist.items.get(i20);
                    if (pageListItem instanceof TL_iv.TL_pageListItemText) {
                        TL_iv.TL_pageListItemText tL_pageListItemText = (TL_iv.TL_pageListItemText) pageListItem;
                        xk9 xk9Var = new xk9(hl9Var2, new Rect(rect2), i15, hl9Var2.l(tL_pageListItemText.text, i13));
                        xk9Var.n = L3;
                        if (tL_pageListItemText.checkbox) {
                            xk9Var.a0(tL_pageListItemText, tL_pageListItemText.checked);
                        } else {
                            xk9Var.b0("•◦▪".charAt(i % 3) + "");
                        }
                        boolean z8 = tL_pageListItemText.checkbox;
                        boolean z9 = tL_pageListItemText.checked;
                        xk9Var.w = i18;
                        xk9Var.x = false;
                        xk9Var.y = z8;
                        xk9Var.E = z9;
                        arrayList.add(xk9Var);
                    } else if (pageListItem instanceof TL_iv.TL_pageListItemBlocks) {
                        TL_iv.TL_pageListItemBlocks tL_pageListItemBlocks = (TL_iv.TL_pageListItemBlocks) pageListItem;
                        if (!tL_pageListItemBlocks.blocks.isEmpty()) {
                            int size2 = arrayList.size();
                            int i21 = 0;
                            boolean z10 = false;
                            while (i21 < tL_pageListItemBlocks.blocks.size()) {
                                int i22 = i21;
                                dk9 j = j(tL_pageListItemBlocks.blocks.get(i21), i18, new Rect(rect2), i13, N(i21, tL_pageListItemBlocks.blocks));
                                int i23 = i18;
                                if (j != null && !z10) {
                                    j.n = L3;
                                    if (tL_pageListItemBlocks.checkbox) {
                                        j.a0(tL_pageListItemBlocks, tL_pageListItemBlocks.checked);
                                    } else {
                                        j.b0("•◦▪".charAt(i % 3) + "");
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
                                hl9Var2 = this;
                            }
                            i12 = i18;
                            hl9Var = hl9Var2;
                            int size3 = arrayList.size();
                            for (int i24 = size2; i24 < size3; i24++) {
                                dk9 dk9Var3 = (dk9) arrayList.get(i24);
                                if (dk9Var3.w == 0) {
                                    dk9Var3.w = i12;
                                    dk9Var3.x = false;
                                }
                            }
                            i20++;
                            hl9Var2 = hl9Var;
                            i18 = i12;
                        }
                    }
                    i12 = i18;
                    hl9Var = hl9Var2;
                    i20++;
                    hl9Var2 = hl9Var;
                    i18 = i12;
                }
                return null;
            }
            hl9 hl9Var4 = hl9Var2;
            boolean z13 = true;
            if (pageBlock instanceof TL_iv.pageBlockOrderedList) {
                TL_iv.pageBlockOrderedList pageblockorderedlist = (TL_iv.pageBlockOrderedList) pageBlock;
                int i25 = i + 1;
                textPaint2.setTextSize(hl.L(xea.S0));
                new TextPaint(textPaint2).setTypeface(hl.o());
                int L4 = hl.L(16.0f);
                for (int i26 = 0; i26 < pageblockorderedlist.items.size(); i26++) {
                    TL_iv.PageListOrderedItem pageListOrderedItem = pageblockorderedlist.items.get(i26);
                    String M = M(pageblockorderedlist, pageListOrderedItem, i26);
                    if (pageListOrderedItem.checkbox) {
                        i11 = hl.L(26.0f);
                    } else {
                        i11 = 0;
                    }
                    L4 = Math.max(L4, hl.L(8.0f) + ((int) Math.ceil(textPaint.measureText(M))) + i11);
                }
                Rect rect3 = new Rect(rect);
                if (hl9Var4.H()) {
                    rect3.right += L4;
                } else {
                    rect3.left += L4;
                }
                int i27 = 0;
                while (i27 < pageblockorderedlist.items.size()) {
                    TL_iv.PageListOrderedItem pageListOrderedItem2 = pageblockorderedlist.items.get(i27);
                    if (pageListOrderedItem2 instanceof TL_iv.TL_pageListOrderedItemText) {
                        TL_iv.TL_pageListOrderedItemText tL_pageListOrderedItemText = (TL_iv.TL_pageListOrderedItemText) pageListOrderedItem2;
                        xk9 xk9Var2 = new xk9(hl9Var4, new Rect(rect3), i15, hl9Var4.l(tL_pageListOrderedItemText.text, i13));
                        xk9Var2.n = L4;
                        xk9Var2.b0(M(pageblockorderedlist, tL_pageListOrderedItemText, i27));
                        if (tL_pageListOrderedItemText.checkbox) {
                            xk9Var2.a0(tL_pageListOrderedItemText, tL_pageListOrderedItemText.checked);
                        }
                        boolean z14 = tL_pageListOrderedItemText.checkbox;
                        boolean z15 = tL_pageListOrderedItemText.checked;
                        xk9Var2.w = i25;
                        xk9Var2.x = z13;
                        xk9Var2.y = z14;
                        xk9Var2.E = z15;
                        arrayList.add(xk9Var2);
                    } else if (pageListOrderedItem2 instanceof TL_iv.TL_pageListOrderedItemBlocks) {
                        TL_iv.TL_pageListOrderedItemBlocks tL_pageListOrderedItemBlocks = (TL_iv.TL_pageListOrderedItemBlocks) pageListOrderedItem2;
                        if (!tL_pageListOrderedItemBlocks.blocks.isEmpty()) {
                            int i28 = i16;
                            int i29 = i28;
                            while (i28 < tL_pageListOrderedItemBlocks.blocks.size()) {
                                hl9 hl9Var5 = hl9Var4;
                                int i30 = i25;
                                int i31 = i28;
                                dk9 j2 = hl9Var5.j(tL_pageListOrderedItemBlocks.blocks.get(i28), i30, new Rect(rect3), i13, N(i28, tL_pageListOrderedItemBlocks.blocks));
                                hl9Var4 = hl9Var5;
                                i25 = i30;
                                int i32 = i13;
                                if (j2 != null && i29 == 0) {
                                    j2.n = L4;
                                    if (tL_pageListOrderedItemBlocks.checkbox) {
                                        j2.a0(tL_pageListOrderedItemBlocks, tL_pageListOrderedItemBlocks.checked);
                                    }
                                    j2.b0(M(pageblockorderedlist, tL_pageListOrderedItemBlocks, i27));
                                    if (tL_pageListOrderedItemBlocks.checkbox) {
                                        j2.a0(tL_pageListOrderedItemBlocks, tL_pageListOrderedItemBlocks.checked);
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
                                dk9 dk9Var4 = (dk9) arrayList.get(size5);
                                if (dk9Var4.w == 0) {
                                    dk9Var4.w = i25;
                                    dk9Var4.x = true;
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
            ArrayList arrayList3 = hl9Var4.h;
            if (z18) {
                int i34 = rect.left;
                int size6 = arrayList.size();
                TL_iv.pageBlockBlockquote pageblockblockquote2 = (TL_iv.pageBlockBlockquote) pageBlock;
                SpannableStringBuilder l = hl9Var4.l(pageBlock.text, Q(i33, q(pageBlock)));
                TL_iv.RichText richText = pageblockblockquote2.caption;
                if (richText != null && !TextUtils.isEmpty(w(richText))) {
                    spannableStringBuilder2 = hl9Var4.l(pageblockblockquote2.caption, Q(i33, 11));
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
                    ?? yk9Var = new yk9(hl9Var4, new Rect(hl.L(12.0f) + rect.left, hl.L(4.0f) + rect.top, hl.L(20.0f) + rect.right, hl.L(4.0f) + rect.bottom), hl9Var4.B, pageblockblockquote2, spannableStringBuilder3);
                    pageblockblockquote = pageblockblockquote2;
                    yk9Var.c0 = i35;
                    yk9Var.i0(hl.L(8.0f), hl.L(8.0f));
                    zk9Var = yk9Var;
                } else {
                    pageblockblockquote = pageblockblockquote2;
                    zk9Var = new zk9(hl9Var4, new Rect(hl.L(12.0f) + rect.left, hl.L(12.0f) + rect.top, hl.L(12.0f) + rect.right, hl.L(14.0f) + rect.bottom), hl9Var4.B, l, spannableStringBuilder2, Layout.Alignment.ALIGN_NORMAL);
                }
                zk9Var.G = 2131753989;
                arrayList.add(zk9Var);
                int size7 = arrayList.size() - 1;
                int L5 = hl.L(8.0f);
                if (pageblockblockquote.collapsed) {
                    i8 = hl.L(8.0f);
                } else {
                    i8 = 0;
                }
                arrayList3.add(new ak9(size6, size7, i34, i, L5, i8));
                return zk9Var;
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
                    int L6 = hl.L(12.0f) + rect.left;
                    int i39 = rect.top;
                    if (z3) {
                        i6 = hl.L(4.0f);
                    } else {
                        i6 = 0;
                    }
                    int i40 = i39 + i6;
                    int L7 = hl.L(12.0f) + rect.right;
                    int i41 = i37;
                    int i42 = rect.bottom;
                    if (z4 && !z2) {
                        i7 = hl.L(4.0f);
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
                    ((dk9) arrayList.get(size8)).F = 2131753989;
                }
                if (z2) {
                    xk9 xk9Var3 = new xk9(this, new Rect(hl.L(12.0f) + rect.left, rect.top, hl.L(12.0f) + rect.right, hl.L(6.0f) + rect.bottom), i15, new SpannableStringBuilder(l(pageblockblockquoteblocks2.caption, Q(i43, 11))));
                    xk9Var3.c0 = 0;
                    xk9Var3.i0(hl.L(2.0f), 0);
                    arrayList.add(xk9Var3);
                }
                arrayList3.add(new ak9(size8, arrayList.size() - 1, i36, i, 0, 0));
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
                zk9 zk9Var2 = new zk9(this, new Rect(hl.L(30.0f) + rect.left, hl.L(16.0f) + rect.top, hl.L(30.0f) + rect.right, hl.L(16.0f) + rect.bottom), this.B, l2, spannableStringBuilder, Layout.Alignment.ALIGN_CENTER);
                zk9Var2.G = 2131753990;
                arrayList.add(zk9Var2);
                return zk9Var2;
            } else if (pageBlock instanceof TL_iv.pageBlockButtonRow) {
                fk9 fk9Var = new fk9(this, rect, i15, (TL_iv.pageBlockButtonRow) pageBlock);
                fk9Var.G = 2131754867;
                arrayList.add(fk9Var);
                return fk9Var;
            } else if (pageBlock instanceof TL_iv.pageBlockTable) {
                try {
                    wk9 wk9Var = new wk9(this, rect, i15, (TL_iv.pageBlockTable) pageBlock);
                    wk9Var.G = 2131754850;
                    arrayList.add(wk9Var);
                    return wk9Var;
                } catch (IllegalArgumentException unused) {
                    return null;
                }
            } else if (pageBlock instanceof TL_iv.pageBlockMath) {
                ok9 ok9Var = new ok9(this, rect, i15, (TL_iv.pageBlockMath) pageBlock);
                arrayList.add(ok9Var);
                return ok9Var;
            } else if (pageBlock instanceof TL_iv.pageBlockDivider) {
                lk9 lk9Var = new lk9(this, rect, i15);
                arrayList.add(lk9Var);
                return lk9Var;
            } else if (pageBlock instanceof TL_iv.pageBlockPhoto) {
                TL_iv.pageBlockPhoto pageblockphoto = (TL_iv.pageBlockPhoto) pageBlock;
                qk9 qk9Var = new qk9(this, rect, this.B, pageblockphoto, arrayList.isEmpty());
                arrayList.add(qk9Var);
                k(pageblockphoto.caption, rect, i33);
                return qk9Var;
            } else if (pageBlock instanceof TL_iv.pageBlockVideo) {
                TL_iv.pageBlockVideo pageblockvideo = (TL_iv.pageBlockVideo) pageBlock;
                cl9 cl9Var = new cl9(this, rect, this.B, pageblockvideo, arrayList.isEmpty());
                arrayList.add(cl9Var);
                k(pageblockvideo.caption, rect, i33);
                return cl9Var;
            } else if (pageBlock instanceof TL_iv.pageBlockCollage) {
                TL_iv.pageBlockCollage pageblockcollage = (TL_iv.pageBlockCollage) pageBlock;
                ik9 ik9Var = new ik9(this, rect, this.B, pageblockcollage, arrayList.isEmpty());
                arrayList.add(ik9Var);
                k(pageblockcollage.caption, rect, i33);
                return ik9Var;
            } else if (pageBlock instanceof TL_iv.pageBlockSlideshow) {
                TL_iv.pageBlockSlideshow pageblockslideshow = (TL_iv.pageBlockSlideshow) pageBlock;
                uk9 uk9Var = new uk9(this, rect, this.B, pageblockslideshow, arrayList.isEmpty());
                arrayList.add(uk9Var);
                k(pageblockslideshow.caption, rect, i33);
                return uk9Var;
            } else if (pageBlock instanceof TL_iv.pageBlockMap) {
                TL_iv.pageBlockMap pageblockmap = (TL_iv.pageBlockMap) pageBlock;
                nk9 nk9Var = new nk9(this, rect, i15, pageblockmap);
                arrayList.add(nk9Var);
                k(pageblockmap.caption, rect, i33);
                return nk9Var;
            } else if (pageBlock instanceof TL_iv.pageBlockAudio) {
                TL_iv.pageBlockAudio pageblockaudio = (TL_iv.pageBlockAudio) pageBlock;
                HashMap hashMap = this.m;
                if (((r47) hashMap.get(pageblockaudio)) == null && (s = s(pageblockaudio.audio_id)) != null) {
                    TLRPC.TL_message tL_message = new TLRPC.TL_message();
                    tL_message.out = true;
                    int i44 = -Long.valueOf(pageblockaudio.audio_id).hashCode();
                    pageblockaudio.mid = i44;
                    tL_message.id = i44;
                    r47 r47Var = this.b;
                    tL_message.realId = r47Var.L1();
                    tL_message.dialog_id = r47.B0(r47Var.k);
                    TLRPC.Peer peer = r47Var.k.peer_id;
                    tL_message.peer_id = peer;
                    int i45 = this.a;
                    if (peer == null) {
                        TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                        tL_message.peer_id = tL_peerUser;
                        tL_peerUser.user_id = yac.h(i45).e();
                    }
                    TLRPC.TL_peerUser tL_peerUser2 = new TLRPC.TL_peerUser();
                    tL_message.from_id = tL_peerUser2;
                    tL_peerUser2.user_id = yac.h(i45).e();
                    tL_message.date = (int) (System.currentTimeMillis() / 1000);
                    tL_message.message = "";
                    TLRPC.TL_messageMediaDocument tL_messageMediaDocument = new TLRPC.TL_messageMediaDocument();
                    tL_message.media = tL_messageMediaDocument;
                    tL_messageMediaDocument.flags |= 3;
                    tL_messageMediaDocument.document = s;
                    tL_message.flags |= 768;
                    r47 r47Var2 = new r47(i45, tL_message, false, true);
                    this.l.add(r47Var2);
                    hashMap.put(pageblockaudio, r47Var2);
                }
                ck9 ck9Var = new ck9(this, rect, i15, pageblockaudio);
                arrayList.add(ck9Var);
                k(pageblockaudio.caption, rect, i33);
                return ck9Var;
            } else if (pageBlock instanceof TL_iv.pageBlockDocument) {
                TL_iv.pageBlockDocument pageblockdocument = (TL_iv.pageBlockDocument) pageBlock;
                mk9 mk9Var = new mk9(this, rect, i15, pageblockdocument);
                arrayList.add(mk9Var);
                k(pageblockdocument.caption, rect, i33);
                return mk9Var;
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
                    AtomicInteger atomicInteger = nm9.t0;
                    if (pageblockembed.html != null && k0d.m(pageblockembed.url)) {
                        if (k0d.m(pageblockembed.url)) {
                            String str3 = pageblockembed.url;
                            int i0 = i15 + (nm9.i0() << 1);
                            if (k0d.m(str3)) {
                                h0dVar = (h0d) k0d.a.get(str3);
                            } else {
                                h0dVar = null;
                            }
                            if (h0dVar != null && (i5 = h0dVar.e) != 0) {
                                i0 = Math.min(i0, hl.L(Math.max(200, i5)));
                            }
                            i15 = i0 - (nm9.i0() << 1);
                        }
                        nm9 nm9Var = new nm9(this, rect, i15, pageblockembed, arrayList.isEmpty());
                        arrayList.add(nm9Var);
                        k(pageblockembed.caption, rect, i33);
                        return nm9Var;
                    }
                }
                if (pageBlock instanceof TL_iv.pageBlockUnsupported) {
                    if (vsd.a(i33, 9)) {
                        i4 = hl.L(6.0f);
                    } else if (i > 0) {
                        i4 = hl.L(4.0f);
                    } else {
                        i4 = 0;
                    }
                    bl9 bl9Var = new bl9(this, new Rect((rect.left + i4) - hl.L(7.0f), Math.max(hl.L(14.0f), rect.top), (rect.right + i4) - hl.L(7.0f), Math.max(hl.L(14.0f), rect.bottom)), this.B, arrayList.size(), i);
                    this.e.add(bl9Var);
                    if (i == 0) {
                        this.f.add(bl9Var);
                    }
                    arrayList.add(bl9Var);
                    return bl9Var;
                } else if (pageBlock instanceof TL_iv.pageBlockDetails) {
                    TL_iv.pageBlockDetails pageblockdetails = (TL_iv.pageBlockDetails) pageBlock;
                    jk9 jk9Var = new jk9(this, rect, this.B, pageblockdetails, l(pageblockdetails.title, i33 & (-17)));
                    arrayList.add(jk9Var);
                    for (int i46 = 0; i46 < pageblockdetails.blocks.size(); i46++) {
                        j(pageblockdetails.blocks.get(i46), i + 1, rect, i33, N(i46, pageblockdetails.blocks));
                    }
                    arrayList.add(new kk9(this, new Rect(rect.left, 0, rect.right, 0), i15));
                    for (int size9 = arrayList.size(); size9 < arrayList.size(); size9++) {
                        dk9 dk9Var5 = (dk9) arrayList.get(size9);
                        if (dk9Var5.M == null) {
                            dk9Var5.M = jk9Var;
                        }
                    }
                    return jk9Var;
                } else {
                    boolean z19 = f11.a;
                    return null;
                }
            }
        } else {
            boolean H = o.H(pageBlock);
            xk9 xk9Var4 = new xk9(hl9Var2, rect, i15, hl9Var2.l(pageBlock.text, Q(i13, q(pageBlock))));
            if (H) {
                xk9Var4.i0(hl.L(10.0f), hl.L(6.0f));
            } else if (pageBlock instanceof TL_iv.pageBlockParagraph) {
                if (z) {
                    L = 0;
                } else {
                    L = hl.L(6.0f);
                }
                xk9Var4.i0(L, hl.L(6.0f));
            }
            if (pageBlock instanceof TL_iv.pageBlockHeading1) {
                i3 = 2131754023;
            } else if (pageBlock instanceof TL_iv.pageBlockHeading2) {
                i3 = 2131754022;
            } else if (pageBlock instanceof TL_iv.pageBlockHeading3) {
                i3 = 2131754021;
            } else if (pageBlock instanceof TL_iv.pageBlockHeading4) {
                i3 = 2131754020;
            } else if (pageBlock instanceof TL_iv.pageBlockHeading5) {
                i3 = 2131754019;
            } else if (pageBlock instanceof TL_iv.pageBlockHeading6) {
                i3 = 2131754018;
            } else if (pageBlock instanceof TL_iv.pageBlockFooter) {
                i3 = 2131754025;
            } else {
                i3 = 0;
            }
            xk9Var4.G = i3;
            arrayList.add(xk9Var4);
            return xk9Var4;
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
            this.g.add(new hk9(this, rect, this.B, spannableStringBuilder, spannableStringBuilder2));
        }
    }

    public final SpannableStringBuilder l(TL_iv.RichText richText, int i) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (i == 0) {
            m(richText, spannableStringBuilder, 0);
        } else {
            n(richText, spannableStringBuilder, i, new el9(this, i, false));
        }
        if (richText != null && spannableStringBuilder.length() > 0) {
            spannableStringBuilder.setSpan(new bk9(richText, i), 0, spannableStringBuilder.length(), 33);
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
                    boolean j = mm9.j(textdiff.text);
                    boolean j2 = mm9.j(textdiff.old_text);
                    if (j) {
                        if (!j2) {
                            n(textdiff.old_text, spannableStringBuilder, i, new smb(y(8192), 0));
                        }
                    } else {
                        TL_iv.RichText richText2 = textdiff.text;
                        if (j2) {
                            n(richText2, spannableStringBuilder, i, new smb(y(4096), 0));
                        } else {
                            n(richText2, spannableStringBuilder, i, new xpa());
                        }
                    }
                } else if (richText instanceof TL_iv.textBold) {
                    int i2 = i | 16;
                    n(richText.text, spannableStringBuilder, i2, new el9(this, i2, false));
                } else if (richText instanceof TL_iv.textItalic) {
                    int i3 = i | 32;
                    n(richText.text, spannableStringBuilder, i3, new el9(this, i3, false));
                } else if (richText instanceof TL_iv.textUnderline) {
                    int i4 = i | 64;
                    n(richText.text, spannableStringBuilder, i4, new el9(this, i4, false));
                } else if (richText instanceof TL_iv.textStrike) {
                    int i5 = i | 128;
                    n(richText.text, spannableStringBuilder, i5, new el9(this, i5, false));
                } else if (richText instanceof TL_iv.textFixed) {
                    int i6 = i | 256;
                    n(richText.text, spannableStringBuilder, i6, new el9(this, i6, false));
                } else if (richText instanceof TL_iv.textUrl) {
                    n(richText.text, spannableStringBuilder, i, new h8c(((TL_iv.textUrl) richText).url, y(1024)));
                } else if (richText instanceof TL_iv.textEmail) {
                    TL_iv.RichText richText3 = richText.text;
                    n(richText3, spannableStringBuilder, i, new h8c("mailto:" + ((TL_iv.textEmail) richText).email, y(1024)));
                } else if (richText instanceof TL_iv.textConcat) {
                    for (int i7 = 0; i7 < richText.texts.size(); i7++) {
                        m(richText.texts.get(i7), spannableStringBuilder, i);
                    }
                } else if (richText instanceof TL_iv.textSubscript) {
                    int i8 = i | 2048;
                    n(richText.text, spannableStringBuilder, i8, new el9(this, i8, false));
                } else if (richText instanceof TL_iv.textSuperscript) {
                    int i9 = i | 4096;
                    n(richText.text, spannableStringBuilder, i9, new el9(this, i9, false));
                } else if (richText instanceof TL_iv.textMarked) {
                    int i10 = i | 8192;
                    n(richText.text, spannableStringBuilder, i10, new el9(this, i10, false));
                } else if (richText instanceof TL_iv.textPhone) {
                    TL_iv.textPhone textphone = (TL_iv.textPhone) richText;
                    String h = f78.h(textphone.phone, false);
                    if (textphone.phone.startsWith("+")) {
                        h = c00.i("+", h);
                    }
                    n(richText.text, spannableStringBuilder, i, new h8c(c00.i("tel:", h), y(1024)));
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
                    n(richText4, spannableStringBuilder, i, new p37((byte) 3));
                } else {
                    int i11 = 4;
                    if (richText instanceof TL_iv.textMath) {
                        TL_iv.textMath textmath = (TL_iv.textMath) richText;
                        if (textmath.bitmap == null && !textmath.tried) {
                            textmath.tried = true;
                            qz5 a = qz5.a(textmath.source, hl.L(this.M + 4), true);
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
                            spannableStringBuilder.setSpan(new mlb(null, textmath.bitmap, textmath.w, textmath.h, aob.v0(aob.G6, this.D), textmath.depth), length2, length3, 33);
                            String str3 = textmath.source;
                            if (str3 != null && !str3.isEmpty()) {
                                spannableStringBuilder.setSpan(new fmb(textmath.source), length2, length3, 33);
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
                            boolean a2 = vsd.a(i, 13);
                            int i12 = i & 15;
                            if (i12 >= 1 && i12 <= 6) {
                                TextPaint textPaint = new TextPaint(this.w);
                                new el9(this, i, true).a(textPaint);
                                size = new hm(textcustomemoji.document_id, 0.85f, textPaint.getFontMetricsInt());
                            } else {
                                long j3 = textcustomemoji.document_id;
                                if (a2) {
                                    f = 1.0f;
                                }
                                hm hmVar = new hm(j3, f, (Paint.FontMetricsInt) null);
                                int i13 = this.M + 4;
                                if (a2) {
                                    i11 = -2;
                                }
                                size = hmVar.setSize(hl.L(i13 + i11));
                            }
                            spannableStringBuilder.setSpan(size, length4, length5, 33);
                        } else if (richText instanceof TL_iv.textSpoiler) {
                            n(richText.text, spannableStringBuilder, i, new smb(y(256), 0));
                        } else if (richText instanceof TL_iv.textMention) {
                            TLRPC.TL_messageEntityMention tL_messageEntityMention = new TLRPC.TL_messageEntityMention();
                            ?? obj = new Object();
                            obj.d = tL_messageEntityMention;
                            n(richText.text, spannableStringBuilder, i, new f8c(w(richText), (rmb) obj));
                        } else if (richText instanceof TL_iv.textHashtag) {
                            TLRPC.TL_messageEntityHashtag tL_messageEntityHashtag = new TLRPC.TL_messageEntityHashtag();
                            ?? obj2 = new Object();
                            obj2.d = tL_messageEntityHashtag;
                            n(richText.text, spannableStringBuilder, i, new f8c(w(richText), (rmb) obj2));
                        } else if (richText instanceof TL_iv.textBotCommand) {
                            n(richText.text, spannableStringBuilder, i, new c8c(w(richText), D() ? 1 : 0, null));
                        } else if (richText instanceof TL_iv.textCashtag) {
                            TLRPC.TL_messageEntityCashtag tL_messageEntityCashtag = new TLRPC.TL_messageEntityCashtag();
                            ?? obj3 = new Object();
                            obj3.d = tL_messageEntityCashtag;
                            n(richText.text, spannableStringBuilder, i, new f8c(w(richText), (rmb) obj3));
                        } else if (richText instanceof TL_iv.textAutoUrl) {
                            n(richText.text, spannableStringBuilder, i, new h8c(w(richText), y(1024)));
                        } else if (richText instanceof TL_iv.textAutoEmail) {
                            n(richText.text, spannableStringBuilder, i, new h8c("mailto:".concat(w(richText)), y(1024)));
                        } else if (richText instanceof TL_iv.textAutoPhone) {
                            String w = w(richText);
                            String h2 = f78.h(w, false);
                            if (w.startsWith("+")) {
                                h2 = c00.i("+", h2);
                            }
                            n(richText.text, spannableStringBuilder, i, new h8c(c00.i("tel:", h2), y(1024)));
                        } else if (richText instanceof TL_iv.textTonAddress) {
                            n(richText.text, spannableStringBuilder, i, new f8c("tonaddress:".concat(w(richText)), (rmb) null));
                        } else if (richText instanceof TL_iv.textBankCard) {
                            n(richText.text, spannableStringBuilder, i, new f8c("card:".concat(w(richText)), (rmb) null));
                        } else if (richText instanceof TL_iv.textMentionName) {
                            n(richText.text, spannableStringBuilder, i, new i8c(String.valueOf(((TL_iv.textMentionName) richText).user_id), D() ? 1 : 0, null));
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
                            el9 el9Var = new el9(this, i14, false);
                            no4 no4Var = new no4(w(richText), null, tL_messageEntityFormattedDate);
                            int length6 = spannableStringBuilder.length();
                            m(richText5, spannableStringBuilder, i14);
                            if (spannableStringBuilder.length() > length6) {
                                T(el9Var, spannableStringBuilder, length6, spannableStringBuilder.length());
                                T(no4Var, spannableStringBuilder, length6, spannableStringBuilder.length());
                            }
                        } else if (richText instanceof TL_iv.textButton) {
                            int length7 = spannableStringBuilder.length();
                            spannableStringBuilder.append("*");
                            gk9 gk9Var = new gk9(this, this.B, (TL_iv.textButton) richText, null);
                            gk9Var.d = 1.2f;
                            spannableStringBuilder.setSpan(gk9Var, length7, spannableStringBuilder.length(), 33);
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
            ((dk9) arrayList.get(i)).o(arrayList2);
        }
        for (int i2 = 0; i2 < arrayList2.size(); i2++) {
            ((ti7) arrayList2.get(i2)).getClass();
        }
        return arrayList2;
    }

    public final int r(int i, dc2 dc2Var) {
        int H;
        ArrayList arrayList = this.g;
        if (i >= 0 && i < arrayList.size() && dc2Var != null && (this.s || this.u)) {
            float max = Math.max(0.0f, Math.min(1.0f, dc2Var.L1));
            dk9 dk9Var = (dk9) arrayList.get(i);
            return Math.round(hl.R1(dk9Var.P, dk9Var.N, max));
        }
        int i2 = 0;
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            dk9 dk9Var2 = (dk9) arrayList.get(i3);
            boolean R = dk9Var2.R();
            if (i3 == i) {
                return i2;
            }
            if (R) {
                if (dc2Var != null && (this.s || this.u)) {
                    H = hl.U1(Math.max(0.0f, Math.min(1.0f, dc2Var.L1)), dk9Var2.Q, dk9Var2.O);
                } else {
                    H = dk9Var2.H();
                }
                i2 = H + i2;
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
        if (this.d && this.A > hl.L(900.0f)) {
            return hl.L(950.0f);
        }
        int i2 = this.A;
        if (this.d) {
            i = hl.L(50.0f);
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hl9.v(int, int):java.lang.String");
    }

    public hl9(r47 r47Var, int i, hl9 hl9Var) {
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
        this.y = new ab9(null);
        this.z = new pm3((byte) 7);
        this.K = new RectF();
        this.b = r47Var;
        this.B = i;
        this.a = r47Var.K1;
        I(hl9Var);
    }
}
