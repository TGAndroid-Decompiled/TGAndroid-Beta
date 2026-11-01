package bi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.at;
import org.telegram.messenger.b8;
import org.telegram.messenger.dd;
import org.telegram.messenger.e20;
import org.telegram.messenger.f8;
import org.telegram.messenger.ic;
import org.telegram.messenger.kj;
import org.telegram.messenger.vs;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Cells.j9;
import org.telegram.ui.Cells.k9;
import org.telegram.ui.Components.RadialProgress2;
import org.telegram.ui.Components.ln0;
import org.telegram.ui.Components.y41;
public final class b0 extends c0 implements org.telegram.ui.ActionBar.k6, j9, o0, vs, org.telegram.messenger.z5 {
    public final int D;
    public int E;
    public final int F;
    public final int G;
    public boolean H;
    public int I;
    public int J;
    public int K;
    public StaticLayout L;
    public StaticLayout M;
    public String N;
    public x3 O;
    public kj P;
    public TLRPC.Document Q;
    public int R;
    public boolean S;
    public boolean T;
    public final n0 U;
    public boolean V;
    public final int f2851n;
    public final org.telegram.ui.ActionBar.p6 f2852r;
    public final Paint f2853s;
    public final TextPaint f2854w;
    public final RadialProgress2 f2855x;
    public final ln0 f2856y;

    public b0(int i10, Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context);
        this.f2853s = new Paint(1);
        this.f2854w = new TextPaint(1);
        this.E = org.telegram.messenger.i0.L(16.0f);
        int L = org.telegram.messenger.i0.L(10.0f);
        this.F = L;
        int L2 = org.telegram.messenger.i0.L(44.0f);
        this.G = L2;
        this.f2851n = i10;
        this.f2852r = p6Var;
        setWillNotDraw(false);
        this.D = org.telegram.messenger.b6.q(i10).k();
        RadialProgress2 radialProgress2 = new RadialProgress2(this, p6Var);
        this.f2855x = radialProgress2;
        radialProgress2.setCircleRadius(org.telegram.messenger.i0.L(24.0f));
        int i11 = this.E;
        radialProgress2.r(i11, L, i11 + L2, L2 + L);
        ln0 ln0Var = new ln0(this);
        this.f2856y = ln0Var;
        ln0Var.h = new za.c(this, 8);
        setMinimumHeight(org.telegram.messenger.i0.L(66.0f));
        n0 n0Var = new n0(context, p6Var, new a6.i(this, 9));
        this.U = n0Var;
        addView(n0Var.f3214a, w7.b6.e(-2, -2, 51));
        updateColors();
    }

    private TLRPC.Document getDisplayDocument() {
        w wVar;
        a aVar = this.f2881a;
        if (aVar != null && (wVar = aVar.f2821g) != null) {
            TLRPC.Document document = wVar.h;
            if (document != null) {
                return document;
            }
            return wVar.f3421i;
        }
        return null;
    }

    private int getIconForCurrentState() {
        if (l()) {
            return 3;
        }
        int i10 = this.R;
        if (i10 == 1) {
            return 1;
        }
        if (i10 == 2) {
            return 2;
        }
        if (i10 == 3) {
            return 3;
        }
        return 0;
    }

    @Override
    public final void D(boolean z10) {
        n(true);
    }

    @Override
    public final void N(String str) {
        this.f2855x.p(true, 1.0f);
        n(true);
    }

    @Override
    public final boolean a(int i10, int i11) {
        return this.U.f(i10, i11);
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21029ig));
    }

    @Override
    public final void b() {
        this.U.i();
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        kj kjVar;
        kj kjVar2 = this.P;
        if (kjVar2 != null && i11 == this.f2851n) {
            if (i10 != at.f14718h2 && i10 != at.f14706f2 && i10 != at.f14712g2) {
                if (i10 == at.f14700e2 && kjVar2.f1() == ((Integer) objArr[0]).intValue() && (kjVar = MediaController.B().f14483u0) != null) {
                    kj kjVar3 = this.P;
                    kjVar3.f16652b0 = kjVar.f16652b0;
                    kjVar3.f16675g0 = kjVar.f16675g0;
                    kjVar3.f16679h0 = kjVar.f16679h0;
                    p();
                    return;
                }
                return;
            }
            n(true);
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        this.U.c(canvas);
    }

    @Override
    public final void e(int i10) {
        int L = org.telegram.messenger.i0.L(16.0f);
        if (this.H) {
            i10 = 0;
        }
        int i11 = L + i10;
        this.E = i11;
        int i12 = this.G;
        int i13 = this.F;
        this.f2855x.r(i11, i13, i11 + i12, i12 + i13);
        requestLayout();
        invalidate();
    }

    public final TLRPC.TL_documentAttributeAudio g() {
        TLRPC.Document displayDocument = getDisplayDocument();
        if (displayDocument == null) {
            return null;
        }
        for (int i10 = 0; i10 < displayDocument.attributes.size(); i10++) {
            if (displayDocument.attributes.get(i10) instanceof TLRPC.TL_documentAttributeAudio) {
                return (TLRPC.TL_documentAttributeAudio) displayDocument.attributes.get(i10);
            }
        }
        return null;
    }

    @Override
    public n1 getCaptionEditText() {
        return this.U.f3214a;
    }

    @Override
    public int getObserverTag() {
        return this.D;
    }

    @Override
    public a getRow() {
        return this.f2881a;
    }

    @Override
    public final void h(ArrayList arrayList) {
        this.U.e(arrayList);
    }

    @Override
    public final void i(long j10, long j11) {
        float f7;
        if (j11 <= 0) {
            f7 = 0.0f;
        } else {
            f7 = ((float) j10) / ((float) j11);
        }
        this.f2855x.p(true, Math.min(1.0f, f7));
        if (this.R != 3) {
            n(true);
        }
    }

    public final void j(a aVar, x3 x3Var) {
        w wVar;
        this.f2881a = aVar;
        this.O = x3Var;
        if (aVar != null && aVar.f2821g == null) {
            aVar.f2821g = new w();
        }
        this.H = dd.X;
        c(aVar);
        this.U.b();
        TLRPC.Document displayDocument = getDisplayDocument();
        if (displayDocument != this.Q) {
            this.Q = displayDocument;
            this.P = null;
            this.N = null;
            this.M = null;
        }
        if (k() && this.P == null && displayDocument != null) {
            TLRPC.TL_message tL_message = new TLRPC.TL_message();
            tL_message.out = true;
            tL_message.f19815id = -Long.valueOf(displayDocument.f19800id).hashCode();
            tL_message.peer_id = new TLRPC.TL_peerUser();
            TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
            tL_message.from_id = tL_peerUser;
            TLRPC.Peer peer = tL_message.peer_id;
            int i10 = this.f2851n;
            long e = e20.i(i10).e();
            peer.user_id = e;
            tL_peerUser.user_id = e;
            tL_message.date = (int) (System.currentTimeMillis() / 1000);
            tL_message.message = "";
            TLRPC.TL_messageMediaDocument tL_messageMediaDocument = new TLRPC.TL_messageMediaDocument();
            tL_message.media = tL_messageMediaDocument;
            tL_messageMediaDocument.flags |= 3;
            tL_messageMediaDocument.document = displayDocument;
            tL_message.flags |= 768;
            a aVar2 = this.f2881a;
            if (aVar2 != null && (wVar = aVar2.f2821g) != null && !TextUtils.isEmpty(wVar.e)) {
                tL_message.attachPath = this.f2881a.f2821g.e;
            }
            this.P = new kj(i10, tL_message, false, true);
        }
        m();
        if (this.T) {
            n(false);
        }
        requestLayout();
        invalidate();
    }

    public final boolean k() {
        w wVar;
        a aVar = this.f2881a;
        if (aVar != null && (wVar = aVar.f2821g) != null && wVar.b()) {
            return true;
        }
        return false;
    }

    public final boolean l() {
        w wVar;
        a aVar = this.f2881a;
        if (aVar != null && (wVar = aVar.f2821g) != null && wVar.a()) {
            return true;
        }
        return false;
    }

    public final void m() {
        int i10;
        int i11;
        String str;
        String str2;
        SpannableStringBuilder spannableStringBuilder;
        int L = org.telegram.messenger.i0.L(50.0f) + this.E;
        int i12 = this.G;
        this.I = L + i12;
        if (getMeasuredWidth() > 0) {
            i10 = getMeasuredWidth();
        } else {
            i10 = org.telegram.messenger.i0.f16172q.x;
        }
        if (this.H) {
            i11 = this.f2883c;
        } else {
            i11 = 0;
        }
        this.K = Math.max(0, ((i10 - this.I) - org.telegram.messenger.i0.L(16.0f)) - i11);
        kj kjVar = this.P;
        if (kjVar != null) {
            str = kjVar.x1(false);
        } else if (g() != null) {
            str = g().performer;
        } else {
            str = null;
        }
        kj kjVar2 = this.P;
        if (kjVar2 != null) {
            str2 = kjVar2.z1(false);
        } else if (g() != null) {
            str2 = g().title;
        } else {
            str2 = null;
        }
        boolean isEmpty = TextUtils.isEmpty(str2);
        int i13 = this.F;
        if (isEmpty && TextUtils.isEmpty(str)) {
            this.L = null;
            this.J = ((i12 - org.telegram.messenger.i0.L(30.0f)) / 2) + i13;
        } else {
            if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str)) {
                spannableStringBuilder = new SpannableStringBuilder(a1.g.C(str, " - ", str2));
            } else if (!TextUtils.isEmpty(str2)) {
                spannableStringBuilder = new SpannableStringBuilder(str2);
            } else {
                spannableStringBuilder = new SpannableStringBuilder(str);
            }
            if (!TextUtils.isEmpty(str)) {
                spannableStringBuilder.setSpan(new y41(org.telegram.messenger.i0.o()), 0, str.length(), 18);
            }
            TextPaint textPaint = this.f2854w;
            textPaint.setTextSize(org.telegram.messenger.i0.L(16.0f));
            CharSequence ellipsize = TextUtils.ellipsize(spannableStringBuilder, textPaint, this.K, TextUtils.TruncateAt.END);
            int i14 = this.K;
            this.L = new StaticLayout(ellipsize, this.f2854w, org.telegram.messenger.i0.L(50.0f) + i14, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            this.J = org.telegram.messenger.i0.L(11.0f) + ((i12 - org.telegram.messenger.i0.L(30.0f)) / 2) + i13;
        }
        this.f2856y.i(this.K, org.telegram.messenger.i0.L(30.0f));
    }

    public final void n(boolean z10) {
        TLRPC.Document document;
        boolean z11;
        File K;
        boolean z12;
        w wVar;
        int i10 = org.telegram.ui.ActionBar.t6.We;
        int i11 = org.telegram.ui.ActionBar.t6.Xe;
        int i12 = org.telegram.ui.ActionBar.t6.f21027id;
        int i13 = org.telegram.ui.ActionBar.t6.f21046jd;
        RadialProgress2 radialProgress2 = this.f2855x;
        radialProgress2.g(i10, i11, i12, i13);
        radialProgress2.d = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21160pe, this.f2852r);
        int i14 = 1;
        this.V = true;
        boolean l4 = l();
        int i15 = this.f2851n;
        if (l4) {
            org.telegram.messenger.b6.q(i15).v(this);
            radialProgress2.p(z10, this.f2881a.f2821g.f3419f);
            radialProgress2.setIcon(3, false, z10);
            p();
            return;
        }
        if (k()) {
            document = this.f2881a.f2821g.h;
        } else {
            document = null;
        }
        String r10 = b8.r(null, document);
        a aVar = this.f2881a;
        if (aVar != null && (wVar = aVar.f2821g) != null && !TextUtils.isEmpty(wVar.e) && new File(this.f2881a.f2821g.e).exists()) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (document == null) {
            K = null;
        } else {
            b8.G(i15);
            K = b8.K(document, null, true, true);
        }
        if (!z11 && (K == null || !K.exists())) {
            z12 = false;
        } else {
            z12 = true;
        }
        if (TextUtils.isEmpty(r10)) {
            radialProgress2.setIcon(4, false, false);
            return;
        }
        if (z12) {
            org.telegram.messenger.b6.q(i15).v(this);
            if (!MediaController.B().I(this.P) || MediaController.B().H()) {
                i14 = 0;
            }
            this.R = i14;
            radialProgress2.setIcon(getIconForCurrentState(), false, z10);
        } else {
            org.telegram.messenger.b6.q(i15).a(r10, null, this);
            boolean T = b8.G(i15).T(r10);
            float f7 = 0.0f;
            if (!T) {
                this.R = 2;
                radialProgress2.p(z10, 0.0f);
                radialProgress2.setIcon(getIconForCurrentState(), false, z10);
            } else {
                this.R = 3;
                Float w9 = ic.D().w(r10);
                if (w9 != null) {
                    f7 = w9.floatValue();
                }
                radialProgress2.p(z10, f7);
                radialProgress2.setIcon(getIconForCurrentState(), true, z10);
            }
        }
        p();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.T = true;
        this.f2855x.n(this);
        this.f2856y.f28225s = this;
        n(false);
        int i10 = this.f2851n;
        at.f(i10).c(this, at.f14718h2);
        at.f(i10).c(this, at.f14706f2);
        at.f(i10).c(this, at.f14712g2);
        at.f(i10).c(this, at.f14700e2);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.T = false;
        int i10 = this.f2851n;
        org.telegram.messenger.b6.q(i10).v(this);
        at.f(i10).n(this, at.f14718h2);
        at.f(i10).n(this, at.f14706f2);
        at.f(i10).n(this, at.f14712g2);
        at.f(i10).n(this, at.f14700e2);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        k9 textSelectionHelper;
        int i10;
        if (getDisplayDocument() != null) {
            this.f2855x.draw(canvas);
            int i11 = org.telegram.ui.ActionBar.t6.f21028ie;
            org.telegram.ui.ActionBar.p6 p6Var = this.f2852r;
            int w02 = org.telegram.ui.ActionBar.t6.w0(i11, p6Var);
            int w03 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21047je, p6Var);
            int i12 = org.telegram.ui.ActionBar.t6.f21085le;
            int w04 = org.telegram.ui.ActionBar.t6.w0(i12, p6Var);
            int w05 = org.telegram.ui.ActionBar.t6.w0(i12, p6Var);
            int w06 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21067ke, p6Var);
            ln0 ln0Var = this.f2856y;
            ln0Var.g(w02, w03, w04, w05, w06);
            if (!l()) {
                canvas.save();
                canvas.translate(this.I, this.J);
                ln0Var.b(canvas);
                canvas.restore();
            }
            int w07 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f20900be, p6Var);
            TextPaint textPaint = this.f2854w;
            textPaint.setColor(w07);
            if (this.M != null) {
                canvas.save();
                canvas.translate(org.telegram.messenger.i0.L(54.0f) + this.E, org.telegram.messenger.i0.L(6.0f) + this.J);
                this.M.draw(canvas);
                canvas.restore();
            }
            if (this.L != null) {
                textPaint.setColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.G6, p6Var));
                canvas.save();
                canvas.translate(org.telegram.messenger.i0.L(54.0f) + this.E, this.J - org.telegram.messenger.i0.L(16.0f));
                this.L.draw(canvas);
                canvas.restore();
            }
            x3 x3Var = this.O;
            if (x3Var != null && (textSelectionHelper = x3Var.f3450a.getTextSelectionHelper()) != null && textSelectionHelper.x() && (getParent() instanceof RecyclerView)) {
                ((RecyclerView) getParent()).getClass();
                int R = RecyclerView.R(this);
                if (R >= 0 && R > textSelectionHelper.f22187p0 && R <= textSelectionHelper.f22190s0) {
                    int i13 = 0;
                    if (this.H) {
                        i10 = 0;
                    } else {
                        i10 = this.f2883c;
                    }
                    float L = org.telegram.messenger.i0.L(8.0f) + i10;
                    float L2 = org.telegram.messenger.i0.L(2.0f);
                    int width = getWidth();
                    if (this.H) {
                        i13 = this.f2883c;
                    }
                    canvas.drawRoundRect(L, L2, (width - i13) - org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(64.0f), org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(8.0f), this.f2853s);
                }
            }
        }
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        boolean z11 = this.H;
        int i15 = 0;
        if (z11) {
            i14 = 0;
        } else {
            i14 = this.f2883c;
        }
        if (z11) {
            i15 = this.f2883c;
        }
        this.U.g(i14, i15, i12 - i10, org.telegram.messenger.i0.L(66.0f));
        m();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        int size = View.MeasureSpec.getSize(i10);
        boolean z10 = this.H;
        int i13 = 0;
        if (z10) {
            i12 = 0;
        } else {
            i12 = this.f2883c;
        }
        if (z10) {
            i13 = this.f2883c;
        }
        setMeasuredDimension(size, org.telegram.messenger.i0.L(66.0f) + this.U.h(i12, i13, size));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        TLRPC.Document document;
        int actionMasked = motionEvent.getActionMasked();
        float x10 = motionEvent.getX();
        float y3 = motionEvent.getY();
        if (!l()) {
            if (this.f2856y.e(x10 - this.I, y3 - this.J, actionMasked)) {
                if (actionMasked == 0) {
                    getParent().requestDisallowInterceptTouchEvent(true);
                }
                invalidate();
                return true;
            }
        }
        if (actionMasked == 0) {
            int i10 = this.E;
            if (x10 >= i10) {
                int i11 = this.G;
                if (x10 <= i10 + i11) {
                    int i12 = this.F;
                    if (y3 >= i12 && y3 <= i12 + i11) {
                        this.S = true;
                        invalidate();
                        return true;
                    }
                }
            }
        } else if (actionMasked == 1) {
            if (this.S) {
                this.S = false;
                playSoundEffect(0);
                if (l()) {
                    x3 x3Var = this.O;
                    if (x3Var != null) {
                        a aVar = this.f2881a;
                        d4 d4Var = x3Var.f3450a;
                        ArrayList arrayList = d4Var.f2946s3;
                        l5 l5Var = (l5) d4Var.f2929g4.remove(aVar.f2821g);
                        if (l5Var != null) {
                            l5Var.b();
                        }
                        int indexOf = arrayList.indexOf(aVar);
                        if (indexOf >= 0) {
                            o2 o2Var = d4Var.Q3;
                            if (o2Var != null) {
                                o2Var.d();
                            }
                            arrayList.remove(indexOf);
                            d4Var.f31183f3.O(true);
                            o2 o2Var2 = d4Var.Q3;
                            if (o2Var2 != null) {
                                o2Var2.h();
                            }
                        }
                        d4Var.f2938o3.onContentChanged();
                    }
                } else if (this.P != null) {
                    if (k()) {
                        document = this.f2881a.f2821g.h;
                    } else {
                        document = null;
                    }
                    int i13 = this.R;
                    RadialProgress2 radialProgress2 = this.f2855x;
                    if (i13 == 0) {
                        ArrayList arrayList2 = new ArrayList();
                        arrayList2.add(this.P);
                        if (MediaController.B().o0(arrayList2, this.P, 0L, false, null)) {
                            this.R = 1;
                            radialProgress2.setIcon(getIconForCurrentState(), false, true);
                            invalidate();
                        }
                    } else if (i13 == 1) {
                        if (MediaController.B().R(this.P, true)) {
                            this.R = 0;
                            radialProgress2.setIcon(getIconForCurrentState(), false, true);
                            invalidate();
                        }
                    } else {
                        int i14 = this.f2851n;
                        if (i13 == 2) {
                            radialProgress2.p(false, 0.0f);
                            b8.G(i14).X(document, this.P, 1, 1);
                            this.R = 3;
                            radialProgress2.setIcon(getIconForCurrentState(), true, true);
                            invalidate();
                        } else if (i13 == 3) {
                            b8.G(i14).f(document);
                            this.R = 2;
                            radialProgress2.setIcon(getIconForCurrentState(), false, true);
                            invalidate();
                        }
                    }
                }
                invalidate();
                return true;
            }
        } else if (actionMasked == 3) {
            this.S = false;
        }
        if (this.S || super.onTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    public final void p() {
        double d;
        int i10;
        kj kjVar;
        if (!l() && (kjVar = this.P) != null) {
            ln0 ln0Var = this.f2856y;
            if (!ln0Var.e) {
                ln0Var.h(kjVar.f16652b0);
            }
        }
        if (l()) {
            if (g() != null) {
                d = g().duration;
                i10 = (int) d;
            }
            i10 = 0;
        } else if (this.P != null && MediaController.B().I(this.P)) {
            i10 = this.P.f16675g0;
        } else {
            TLRPC.TL_documentAttributeAudio g10 = g();
            if (g10 != null) {
                d = g10.duration;
                i10 = (int) d;
            }
            i10 = 0;
        }
        String g02 = org.telegram.messenger.i0.g0(i10, false, false);
        String str = this.N;
        if (str == null || !str.equals(g02)) {
            this.N = g02;
            TextPaint textPaint = this.f2854w;
            textPaint.setTextSize(org.telegram.messenger.i0.L(16.0f));
            this.M = new StaticLayout(g02, textPaint, (int) Math.ceil(textPaint.measureText(g02)), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        }
        invalidate();
    }

    @Override
    public final void updateColors() {
        RadialProgress2 radialProgress2;
        int i10 = org.telegram.ui.ActionBar.t6.f21029ig;
        org.telegram.ui.ActionBar.p6 p6Var = this.f2852r;
        this.f2853s.setColor(org.telegram.ui.ActionBar.t6.w0(i10, p6Var));
        n0 n0Var = this.U;
        if (n0Var != null) {
            n0Var.a();
        }
        try {
            if (this.V && (radialProgress2 = this.f2855x) != null) {
                radialProgress2.d = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21160pe, p6Var);
            }
            if (getBackground() instanceof h2) {
                ((h2) getBackground()).a(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f20930d6, p6Var));
            }
        } catch (Exception e) {
            f8.g(e, true);
        }
    }

    @Override
    public final void o(long j10, long j11) {
    }
}
