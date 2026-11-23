package oi;

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
import c8.ma;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.a8;
import org.telegram.messenger.fc;
import org.telegram.messenger.gj;
import org.telegram.messenger.gs;
import org.telegram.messenger.hd;
import org.telegram.messenger.k10;
import org.telegram.messenger.ls;
import org.telegram.messenger.w7;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.Cells.i9;
import org.telegram.ui.Cells.j9;
import org.telegram.ui.Components.RadialProgress2;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.ym0;
public final class x extends y implements org.telegram.ui.ActionBar.b6, i9, j0, gs, org.telegram.messenger.y5 {
    public final int E;
    public int F;
    public final int G;
    public final int H;
    public boolean I;
    public int J;
    public int K;
    public int L;
    public StaticLayout M;
    public StaticLayout N;
    public String O;
    public n3 P;
    public gj Q;
    public TLRPC.Document R;
    public int S;
    public boolean T;
    public boolean U;
    public final i0 V;
    public boolean W;
    public final int f22511n;
    public final h6 f22512r;
    public final Paint f22513s;
    public final TextPaint f22514w;
    public final RadialProgress2 f22515x;
    public final ym0 f22516y;

    public x(int i7, Context context, h6 h6Var) {
        super(context);
        this.f22513s = new Paint(1);
        this.f22514w = new TextPaint(1);
        this.F = org.telegram.messenger.g0.L(16.0f);
        int L = org.telegram.messenger.g0.L(10.0f);
        this.G = L;
        int L2 = org.telegram.messenger.g0.L(44.0f);
        this.H = L2;
        this.f22511n = i7;
        this.f22512r = h6Var;
        setWillNotDraw(false);
        this.E = org.telegram.messenger.a6.q(i7).k();
        RadialProgress2 radialProgress2 = new RadialProgress2(this, h6Var);
        this.f22515x = radialProgress2;
        radialProgress2.setCircleRadius(org.telegram.messenger.g0.L(24.0f));
        int i10 = this.F;
        radialProgress2.r(i10, L, i10 + L2, L2 + L);
        ym0 ym0Var = new ym0(this);
        this.f22516y = ym0Var;
        ym0Var.h = new h9.g1(this, 17);
        setMinimumHeight(org.telegram.messenger.g0.L(66.0f));
        i0 i0Var = new i0(context, h6Var, new hi.w4(this, 17));
        this.V = i0Var;
        addView(i0Var.f22168a, ma.e(-2, -2, 51));
        updateColors();
    }

    private TLRPC.Document getDisplayDocument() {
        r rVar;
        a aVar = this.f22531a;
        if (aVar != null && (rVar = aVar.f21939g) != null) {
            TLRPC.Document document = rVar.h;
            if (document != null) {
                return document;
            }
            return rVar.f22350i;
        }
        return null;
    }

    private int getIconForCurrentState() {
        if (l()) {
            return 3;
        }
        int i7 = this.S;
        if (i7 == 1) {
            return 1;
        }
        if (i7 == 2) {
            return 2;
        }
        if (i7 == 3) {
            return 3;
        }
        return 0;
    }

    @Override
    public final void C(boolean z10) {
        n(true);
    }

    @Override
    public final void N(String str) {
        this.f22515x.p(true, 1.0f);
        n(true);
    }

    @Override
    public final boolean a(int i7, int i10) {
        return this.V.f(i7, i10);
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(m6.f29537lg));
    }

    @Override
    public final void b() {
        this.V.i();
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        gj gjVar;
        gj gjVar2 = this.Q;
        if (gjVar2 != null && i10 == this.f22511n) {
            if (i7 != ls.f25318h2 && i7 != ls.f25306f2 && i7 != ls.f25312g2) {
                if (i7 == ls.f25300e2 && gjVar2.e1() == ((Integer) objArr[0]).intValue() && (gjVar = MediaController.B().f22771v0) != null) {
                    gj gjVar3 = this.Q;
                    gjVar3.f24173b0 = gjVar.f24173b0;
                    gjVar3.f24205i0 = gjVar.f24205i0;
                    gjVar3.f24210j0 = gjVar.f24210j0;
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
        this.V.c(canvas);
    }

    @Override
    public final void e(int i7) {
        int L = org.telegram.messenger.g0.L(16.0f);
        if (this.I) {
            i7 = 0;
        }
        int i10 = L + i7;
        this.F = i10;
        int i11 = this.H;
        int i12 = this.G;
        this.f22515x.r(i10, i12, i10 + i11, i11 + i12);
        requestLayout();
        invalidate();
    }

    public final TLRPC.TL_documentAttributeAudio g() {
        TLRPC.Document displayDocument = getDisplayDocument();
        if (displayDocument == null) {
            return null;
        }
        for (int i7 = 0; i7 < displayDocument.attributes.size(); i7++) {
            if (displayDocument.attributes.get(i7) instanceof TLRPC.TL_documentAttributeAudio) {
                return (TLRPC.TL_documentAttributeAudio) displayDocument.attributes.get(i7);
            }
        }
        return null;
    }

    @Override
    public f1 getCaptionEditText() {
        return this.V.f22168a;
    }

    @Override
    public int getObserverTag() {
        return this.E;
    }

    @Override
    public a getRow() {
        return this.f22531a;
    }

    public final void h(a aVar, n3 n3Var) {
        r rVar;
        this.f22531a = aVar;
        this.P = n3Var;
        if (aVar != null && aVar.f21939g == null) {
            aVar.f21939g = new r();
        }
        this.I = hd.f24444a0;
        c(aVar);
        this.V.b();
        TLRPC.Document displayDocument = getDisplayDocument();
        if (displayDocument != this.R) {
            this.R = displayDocument;
            this.Q = null;
            this.O = null;
            this.N = null;
        }
        if (j() && this.Q == null && displayDocument != null) {
            TLRPC.TL_message tL_message = new TLRPC.TL_message();
            tL_message.out = true;
            tL_message.f28455id = -Long.valueOf(displayDocument.f28440id).hashCode();
            tL_message.peer_id = new TLRPC.TL_peerUser();
            TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
            tL_message.from_id = tL_peerUser;
            TLRPC.Peer peer = tL_message.peer_id;
            int i7 = this.f22511n;
            long e10 = k10.i(i7).e();
            peer.user_id = e10;
            tL_peerUser.user_id = e10;
            tL_message.date = (int) (System.currentTimeMillis() / 1000);
            tL_message.message = "";
            TLRPC.TL_messageMediaDocument tL_messageMediaDocument = new TLRPC.TL_messageMediaDocument();
            tL_message.media = tL_messageMediaDocument;
            tL_messageMediaDocument.flags |= 3;
            tL_messageMediaDocument.document = displayDocument;
            tL_message.flags |= 768;
            a aVar2 = this.f22531a;
            if (aVar2 != null && (rVar = aVar2.f21939g) != null && !TextUtils.isEmpty(rVar.f22347e)) {
                tL_message.attachPath = this.f22531a.f21939g.f22347e;
            }
            this.Q = new gj(i7, tL_message, false, true);
        }
        m();
        if (this.U) {
            n(false);
        }
        requestLayout();
        invalidate();
    }

    @Override
    public final void i(long j3, long j10) {
        float f10;
        if (j10 <= 0) {
            f10 = 0.0f;
        } else {
            f10 = ((float) j3) / ((float) j10);
        }
        this.f22515x.p(true, Math.min(1.0f, f10));
        if (this.S != 3) {
            n(true);
        }
    }

    public final boolean j() {
        r rVar;
        a aVar = this.f22531a;
        if (aVar != null && (rVar = aVar.f21939g) != null && rVar.b()) {
            return true;
        }
        return false;
    }

    @Override
    public final void k(ArrayList arrayList) {
        this.V.e(arrayList);
    }

    public final boolean l() {
        r rVar;
        a aVar = this.f22531a;
        if (aVar != null && (rVar = aVar.f21939g) != null && rVar.a()) {
            return true;
        }
        return false;
    }

    public final void m() {
        int i7;
        int i10;
        String str;
        String str2;
        SpannableStringBuilder spannableStringBuilder;
        int L = org.telegram.messenger.g0.L(50.0f) + this.F;
        int i11 = this.H;
        this.J = L + i11;
        if (getMeasuredWidth() > 0) {
            i7 = getMeasuredWidth();
        } else {
            i7 = org.telegram.messenger.g0.f24046q.x;
        }
        if (this.I) {
            i10 = this.f22533c;
        } else {
            i10 = 0;
        }
        this.L = Math.max(0, ((i7 - this.J) - org.telegram.messenger.g0.L(16.0f)) - i10);
        gj gjVar = this.Q;
        if (gjVar != null) {
            str = gjVar.w1(false);
        } else if (g() != null) {
            str = g().performer;
        } else {
            str = null;
        }
        gj gjVar2 = this.Q;
        if (gjVar2 != null) {
            str2 = gjVar2.y1(false);
        } else if (g() != null) {
            str2 = g().title;
        } else {
            str2 = null;
        }
        boolean isEmpty = TextUtils.isEmpty(str2);
        int i12 = this.G;
        if (isEmpty && TextUtils.isEmpty(str)) {
            this.M = null;
            this.K = ((i11 - org.telegram.messenger.g0.L(30.0f)) / 2) + i12;
        } else {
            if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str)) {
                spannableStringBuilder = new SpannableStringBuilder(a8.p0.E(str, " - ", str2));
            } else if (!TextUtils.isEmpty(str2)) {
                spannableStringBuilder = new SpannableStringBuilder(str2);
            } else {
                spannableStringBuilder = new SpannableStringBuilder(str);
            }
            if (!TextUtils.isEmpty(str)) {
                spannableStringBuilder.setSpan(new l41(org.telegram.messenger.g0.o()), 0, str.length(), 18);
            }
            TextPaint textPaint = this.f22514w;
            textPaint.setTextSize(org.telegram.messenger.g0.L(16.0f));
            CharSequence ellipsize = TextUtils.ellipsize(spannableStringBuilder, textPaint, this.L, TextUtils.TruncateAt.END);
            int i13 = this.L;
            this.M = new StaticLayout(ellipsize, this.f22514w, org.telegram.messenger.g0.L(50.0f) + i13, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            this.K = org.telegram.messenger.g0.L(11.0f) + ((i11 - org.telegram.messenger.g0.L(30.0f)) / 2) + i12;
        }
        this.f22516y.i(this.L, org.telegram.messenger.g0.L(30.0f));
    }

    public final void n(boolean z10) {
        TLRPC.Document document;
        boolean z11;
        File J;
        boolean z12;
        r rVar;
        int i7 = m6.Ze;
        int i10 = m6.f29332af;
        int i11 = m6.f29535ld;
        int i12 = m6.f29551md;
        RadialProgress2 radialProgress2 = this.f22515x;
        radialProgress2.g(i7, i10, i11, i12);
        radialProgress2.d = m6.w0(m6.f29666se, this.f22512r);
        int i13 = 1;
        this.W = true;
        boolean l10 = l();
        int i14 = this.f22511n;
        if (l10) {
            org.telegram.messenger.a6.q(i14).v(this);
            radialProgress2.p(z10, this.f22531a.f21939g.f22348f);
            radialProgress2.setIcon(3, false, z10);
            p();
            return;
        }
        if (j()) {
            document = this.f22531a.f21939g.h;
        } else {
            document = null;
        }
        String r10 = w7.r(null, document);
        a aVar = this.f22531a;
        if (aVar != null && (rVar = aVar.f21939g) != null && !TextUtils.isEmpty(rVar.f22347e) && new File(this.f22531a.f21939g.f22347e).exists()) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (document == null) {
            J = null;
        } else {
            w7.G(i14);
            J = w7.J(document, null, true, true);
        }
        if (!z11 && (J == null || !J.exists())) {
            z12 = false;
        } else {
            z12 = true;
        }
        if (TextUtils.isEmpty(r10)) {
            radialProgress2.setIcon(4, false, false);
            return;
        }
        if (z12) {
            org.telegram.messenger.a6.q(i14).v(this);
            if (!MediaController.B().I(this.Q) || MediaController.B().H()) {
                i13 = 0;
            }
            this.S = i13;
            radialProgress2.setIcon(getIconForCurrentState(), false, z10);
        } else {
            org.telegram.messenger.a6.q(i14).a(r10, null, this);
            boolean S = w7.G(i14).S(r10);
            float f10 = 0.0f;
            if (!S) {
                this.S = 2;
                radialProgress2.p(z10, 0.0f);
                radialProgress2.setIcon(getIconForCurrentState(), false, z10);
            } else {
                this.S = 3;
                Float w10 = fc.D().w(r10);
                if (w10 != null) {
                    f10 = w10.floatValue();
                }
                radialProgress2.p(z10, f10);
                radialProgress2.setIcon(getIconForCurrentState(), true, z10);
            }
        }
        p();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.U = true;
        this.f22515x.n(this);
        this.f22516y.f42473s = this;
        n(false);
        int i7 = this.f22511n;
        ls.f(i7).c(this, ls.f25318h2);
        ls.f(i7).c(this, ls.f25306f2);
        ls.f(i7).c(this, ls.f25312g2);
        ls.f(i7).c(this, ls.f25300e2);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.U = false;
        int i7 = this.f22511n;
        org.telegram.messenger.a6.q(i7).v(this);
        ls.f(i7).n(this, ls.f25318h2);
        ls.f(i7).n(this, ls.f25306f2);
        ls.f(i7).n(this, ls.f25312g2);
        ls.f(i7).n(this, ls.f25300e2);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        j9 textSelectionHelper;
        int i7;
        if (getDisplayDocument() != null) {
            this.f22515x.draw(canvas);
            int i10 = m6.le;
            h6 h6Var = this.f22512r;
            int w02 = m6.w0(i10, h6Var);
            int w03 = m6.w0(m6.f29552me, h6Var);
            int i11 = m6.f29589oe;
            int w04 = m6.w0(i11, h6Var);
            int w05 = m6.w0(i11, h6Var);
            int w06 = m6.w0(m6.ne, h6Var);
            ym0 ym0Var = this.f22516y;
            ym0Var.g(w02, w03, w04, w05, w06);
            if (!l()) {
                canvas.save();
                canvas.translate(this.J, this.K);
                ym0Var.b(canvas);
                canvas.restore();
            }
            int w07 = m6.w0(m6.f29407ee, h6Var);
            TextPaint textPaint = this.f22514w;
            textPaint.setColor(w07);
            if (this.N != null) {
                canvas.save();
                canvas.translate(org.telegram.messenger.g0.L(54.0f) + this.F, org.telegram.messenger.g0.L(6.0f) + this.K);
                this.N.draw(canvas);
                canvas.restore();
            }
            if (this.M != null) {
                textPaint.setColor(m6.w0(m6.G6, h6Var));
                canvas.save();
                canvas.translate(org.telegram.messenger.g0.L(54.0f) + this.F, this.K - org.telegram.messenger.g0.L(16.0f));
                this.M.draw(canvas);
                canvas.restore();
            }
            n3 n3Var = this.P;
            if (n3Var != null && (textSelectionHelper = n3Var.f22267a.getTextSelectionHelper()) != null && textSelectionHelper.x() && (getParent() instanceof RecyclerView)) {
                ((RecyclerView) getParent()).getClass();
                int R = RecyclerView.R(this);
                if (R >= 0 && R > textSelectionHelper.f30923p0 && R <= textSelectionHelper.f30926s0) {
                    int i12 = 0;
                    if (this.I) {
                        i7 = 0;
                    } else {
                        i7 = this.f22533c;
                    }
                    float L = org.telegram.messenger.g0.L(8.0f) + i7;
                    float L2 = org.telegram.messenger.g0.L(2.0f);
                    int width = getWidth();
                    if (this.I) {
                        i12 = this.f22533c;
                    }
                    canvas.drawRoundRect(L, L2, (width - i12) - org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(64.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), this.f22513s);
                }
            }
        }
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        int i13;
        boolean z11 = this.I;
        int i14 = 0;
        if (z11) {
            i13 = 0;
        } else {
            i13 = this.f22533c;
        }
        if (z11) {
            i14 = this.f22533c;
        }
        this.V.g(i13, i14, i11 - i7, org.telegram.messenger.g0.L(66.0f));
        m();
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int i11;
        int size = View.MeasureSpec.getSize(i7);
        boolean z10 = this.I;
        int i12 = 0;
        if (z10) {
            i11 = 0;
        } else {
            i11 = this.f22533c;
        }
        if (z10) {
            i12 = this.f22533c;
        }
        setMeasuredDimension(size, org.telegram.messenger.g0.L(66.0f) + this.V.h(i11, i12, size));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        TLRPC.Document document;
        int actionMasked = motionEvent.getActionMasked();
        float x10 = motionEvent.getX();
        float y10 = motionEvent.getY();
        if (!l()) {
            if (this.f22516y.e(x10 - this.J, y10 - this.K, actionMasked)) {
                if (actionMasked == 0) {
                    getParent().requestDisallowInterceptTouchEvent(true);
                }
                invalidate();
                return true;
            }
        }
        if (actionMasked == 0) {
            int i7 = this.F;
            if (x10 >= i7) {
                int i10 = this.H;
                if (x10 <= i7 + i10) {
                    int i11 = this.G;
                    if (y10 >= i11 && y10 <= i11 + i10) {
                        this.T = true;
                        invalidate();
                        return true;
                    }
                }
            }
        } else if (actionMasked == 1) {
            if (this.T) {
                this.T = false;
                playSoundEffect(0);
                if (l()) {
                    n3 n3Var = this.P;
                    if (n3Var != null) {
                        a aVar = this.f22531a;
                        t3 t3Var = n3Var.f22267a;
                        ArrayList arrayList = t3Var.f22436t3;
                        y4 y4Var = (y4) t3Var.f22419h4.remove(aVar.f21939g);
                        if (y4Var != null) {
                            y4Var.b();
                        }
                        int indexOf = arrayList.indexOf(aVar);
                        if (indexOf >= 0) {
                            g2 g2Var = t3Var.R3;
                            if (g2Var != null) {
                                g2Var.d();
                            }
                            arrayList.remove(indexOf);
                            t3Var.f35790g3.O(true);
                            g2 g2Var2 = t3Var.R3;
                            if (g2Var2 != null) {
                                g2Var2.h();
                            }
                        }
                        t3Var.f22428p3.onContentChanged();
                    }
                } else if (this.Q != null) {
                    if (j()) {
                        document = this.f22531a.f21939g.h;
                    } else {
                        document = null;
                    }
                    int i12 = this.S;
                    RadialProgress2 radialProgress2 = this.f22515x;
                    if (i12 == 0) {
                        ArrayList arrayList2 = new ArrayList();
                        arrayList2.add(this.Q);
                        if (MediaController.B().o0(arrayList2, this.Q, 0L, false, null, 0L)) {
                            this.S = 1;
                            radialProgress2.setIcon(getIconForCurrentState(), false, true);
                            invalidate();
                        }
                    } else if (i12 == 1) {
                        if (MediaController.B().R(this.Q, true)) {
                            this.S = 0;
                            radialProgress2.setIcon(getIconForCurrentState(), false, true);
                            invalidate();
                        }
                    } else {
                        int i13 = this.f22511n;
                        if (i12 == 2) {
                            radialProgress2.p(false, 0.0f);
                            w7.G(i13).W(document, this.Q, 1, 1);
                            this.S = 3;
                            radialProgress2.setIcon(getIconForCurrentState(), true, true);
                            invalidate();
                        } else if (i12 == 3) {
                            w7.G(i13).f(document);
                            this.S = 2;
                            radialProgress2.setIcon(getIconForCurrentState(), false, true);
                            invalidate();
                        }
                    }
                }
                invalidate();
                return true;
            }
        } else if (actionMasked == 3) {
            this.T = false;
        }
        if (this.T || super.onTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    public final void p() {
        double d;
        int i7;
        gj gjVar;
        if (!l() && (gjVar = this.Q) != null) {
            ym0 ym0Var = this.f22516y;
            if (!ym0Var.f42460e) {
                ym0Var.h(gjVar.f24173b0);
            }
        }
        if (l()) {
            if (g() != null) {
                d = g().duration;
                i7 = (int) d;
            }
            i7 = 0;
        } else if (this.Q != null && MediaController.B().I(this.Q)) {
            i7 = this.Q.f24205i0;
        } else {
            TLRPC.TL_documentAttributeAudio g10 = g();
            if (g10 != null) {
                d = g10.duration;
                i7 = (int) d;
            }
            i7 = 0;
        }
        String g02 = org.telegram.messenger.g0.g0(i7, false, false);
        String str = this.O;
        if (str == null || !str.equals(g02)) {
            this.O = g02;
            TextPaint textPaint = this.f22514w;
            textPaint.setTextSize(org.telegram.messenger.g0.L(16.0f));
            this.N = new StaticLayout(g02, textPaint, (int) Math.ceil(textPaint.measureText(g02)), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        }
        invalidate();
    }

    @Override
    public final void updateColors() {
        RadialProgress2 radialProgress2;
        int i7 = m6.f29537lg;
        h6 h6Var = this.f22512r;
        this.f22513s.setColor(m6.w0(i7, h6Var));
        i0 i0Var = this.V;
        if (i0Var != null) {
            i0Var.a();
        }
        try {
            if (this.W && (radialProgress2 = this.f22515x) != null) {
                radialProgress2.d = m6.w0(m6.f29666se, h6Var);
            }
            if (getBackground() instanceof y1) {
                ((y1) getBackground()).a(m6.w0(m6.f29381d6, h6Var));
            }
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    @Override
    public final void o(long j3, long j10) {
    }
}
