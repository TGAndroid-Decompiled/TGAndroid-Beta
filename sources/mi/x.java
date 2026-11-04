package mi;

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
import b8.mf;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.a8;
import org.telegram.messenger.bd;
import org.telegram.messenger.cs;
import org.telegram.messenger.h10;
import org.telegram.messenger.hs;
import org.telegram.messenger.w7;
import org.telegram.messenger.zb;
import org.telegram.messenger.zi;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Cells.g9;
import org.telegram.ui.Cells.h9;
import org.telegram.ui.Components.RadialProgress2;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.o31;
public final class x extends y implements org.telegram.ui.ActionBar.z5, g9, l0, cs, org.telegram.messenger.x5 {
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
    public zi Q;
    public TLRPC.Document R;
    public int S;
    public boolean T;
    public boolean U;
    public final k0 V;
    public boolean W;
    public final int f20011n;
    public final org.telegram.ui.ActionBar.e6 f20012r;
    public final Paint f20013s;
    public final TextPaint f20014w;
    public final RadialProgress2 f20015x;
    public final mm0 f20016y;

    public x(int i3, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.f20013s = new Paint(1);
        this.f20014w = new TextPaint(1);
        this.F = org.telegram.messenger.g0.L(16.0f);
        int L = org.telegram.messenger.g0.L(10.0f);
        this.G = L;
        int L2 = org.telegram.messenger.g0.L(44.0f);
        this.H = L2;
        this.f20011n = i3;
        this.f20012r = e6Var;
        setWillNotDraw(false);
        this.E = org.telegram.messenger.z5.q(i3).k();
        RadialProgress2 radialProgress2 = new RadialProgress2(this, e6Var);
        this.f20015x = radialProgress2;
        radialProgress2.setCircleRadius(org.telegram.messenger.g0.L(24.0f));
        int i10 = this.F;
        radialProgress2.r(i10, L, i10 + L2, L2 + L);
        mm0 mm0Var = new mm0(this);
        this.f20016y = mm0Var;
        mm0Var.h = new gi.w5(this, 14);
        setMinimumHeight(org.telegram.messenger.g0.L(66.0f));
        k0 k0Var = new k0(context, e6Var, new gi.v5(this, 15));
        this.V = k0Var;
        addView(k0Var.f19716a, mf.e(-2, -2, 51));
        updateColors();
    }

    private TLRPC.Document getDisplayDocument() {
        s sVar;
        a aVar = this.f20029a;
        if (aVar != null && (sVar = aVar.f19435g) != null) {
            TLRPC.Document document = sVar.h;
            if (document != null) {
                return document;
            }
            return sVar.f19865i;
        }
        return null;
    }

    private int getIconForCurrentState() {
        if (l()) {
            return 3;
        }
        int i3 = this.S;
        if (i3 == 1) {
            return 1;
        }
        if (i3 == 2) {
            return 2;
        }
        if (i3 == 3) {
            return 3;
        }
        return 0;
    }

    @Override
    public final void C(boolean z10) {
        n(true);
    }

    @Override
    public final void M(String str) {
        this.f20015x.p(true, 1.0f);
        n(true);
    }

    @Override
    public final boolean a(int i3, int i10) {
        return this.V.f(i3, i10);
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(k6.ig));
    }

    @Override
    public final void b() {
        this.V.i();
    }

    @Override
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        zi ziVar;
        zi ziVar2 = this.Q;
        if (ziVar2 != null && i10 == this.f20011n) {
            if (i3 != hs.f23239h2 && i3 != hs.f23227f2 && i3 != hs.f23233g2) {
                if (i3 == hs.f23221e2 && ziVar2.f1() == ((Integer) objArr[0]).intValue() && (ziVar = MediaController.B().f21348v0) != null) {
                    zi ziVar3 = this.Q;
                    ziVar3.f26828b0 = ziVar.f26828b0;
                    ziVar3.f26851g0 = ziVar.f26851g0;
                    ziVar3.f26855h0 = ziVar.f26855h0;
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
    public final void e(int i3) {
        int L = org.telegram.messenger.g0.L(16.0f);
        if (this.I) {
            i3 = 0;
        }
        int i10 = L + i3;
        this.F = i10;
        int i11 = this.H;
        int i12 = this.G;
        this.f20015x.r(i10, i12, i10 + i11, i11 + i12);
        requestLayout();
        invalidate();
    }

    public final TLRPC.TL_documentAttributeAudio g() {
        TLRPC.Document displayDocument = getDisplayDocument();
        if (displayDocument == null) {
            return null;
        }
        for (int i3 = 0; i3 < displayDocument.attributes.size(); i3++) {
            if (displayDocument.attributes.get(i3) instanceof TLRPC.TL_documentAttributeAudio) {
                return (TLRPC.TL_documentAttributeAudio) displayDocument.attributes.get(i3);
            }
        }
        return null;
    }

    @Override
    public h1 getCaptionEditText() {
        return this.V.f19716a;
    }

    @Override
    public int getObserverTag() {
        return this.E;
    }

    @Override
    public a getRow() {
        return this.f20029a;
    }

    public final void h(a aVar, n3 n3Var) {
        s sVar;
        this.f20029a = aVar;
        this.P = n3Var;
        if (aVar != null && aVar.f19435g == null) {
            aVar.f19435g = new s();
        }
        this.I = bd.f21784a0;
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
            tL_message.f27022id = -Long.valueOf(displayDocument.f27007id).hashCode();
            tL_message.peer_id = new TLRPC.TL_peerUser();
            TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
            tL_message.from_id = tL_peerUser;
            TLRPC.Peer peer = tL_message.peer_id;
            int i3 = this.f20011n;
            long e10 = h10.i(i3).e();
            peer.user_id = e10;
            tL_peerUser.user_id = e10;
            tL_message.date = (int) (System.currentTimeMillis() / 1000);
            tL_message.message = "";
            TLRPC.TL_messageMediaDocument tL_messageMediaDocument = new TLRPC.TL_messageMediaDocument();
            tL_message.media = tL_messageMediaDocument;
            tL_messageMediaDocument.flags |= 3;
            tL_messageMediaDocument.document = displayDocument;
            tL_message.flags |= 768;
            a aVar2 = this.f20029a;
            if (aVar2 != null && (sVar = aVar2.f19435g) != null && !TextUtils.isEmpty(sVar.f19862e)) {
                tL_message.attachPath = this.f20029a.f19435g.f19862e;
            }
            this.Q = new zi(i3, tL_message, false, true);
        }
        m();
        if (this.U) {
            n(false);
        }
        requestLayout();
        invalidate();
    }

    @Override
    public final void i(long j10, long j11) {
        float f10;
        if (j11 <= 0) {
            f10 = 0.0f;
        } else {
            f10 = ((float) j10) / ((float) j11);
        }
        this.f20015x.p(true, Math.min(1.0f, f10));
        if (this.S != 3) {
            n(true);
        }
    }

    public final boolean j() {
        s sVar;
        a aVar = this.f20029a;
        if (aVar != null && (sVar = aVar.f19435g) != null && sVar.b()) {
            return true;
        }
        return false;
    }

    @Override
    public final void k(ArrayList arrayList) {
        this.V.e(arrayList);
    }

    public final boolean l() {
        s sVar;
        a aVar = this.f20029a;
        if (aVar != null && (sVar = aVar.f19435g) != null && sVar.a()) {
            return true;
        }
        return false;
    }

    public final void m() {
        int i3;
        int i10;
        String str;
        String str2;
        SpannableStringBuilder spannableStringBuilder;
        int L = org.telegram.messenger.g0.L(50.0f) + this.F;
        int i11 = this.H;
        this.J = L + i11;
        if (getMeasuredWidth() > 0) {
            i3 = getMeasuredWidth();
        } else {
            i3 = org.telegram.messenger.g0.f22608q.x;
        }
        if (this.I) {
            i10 = this.f20031c;
        } else {
            i10 = 0;
        }
        this.L = Math.max(0, ((i3 - this.J) - org.telegram.messenger.g0.L(16.0f)) - i10);
        zi ziVar = this.Q;
        if (ziVar != null) {
            str = ziVar.x1(false);
        } else if (g() != null) {
            str = g().performer;
        } else {
            str = null;
        }
        zi ziVar2 = this.Q;
        if (ziVar2 != null) {
            str2 = ziVar2.z1(false);
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
                spannableStringBuilder = new SpannableStringBuilder(a1.g.C(str, " - ", str2));
            } else if (!TextUtils.isEmpty(str2)) {
                spannableStringBuilder = new SpannableStringBuilder(str2);
            } else {
                spannableStringBuilder = new SpannableStringBuilder(str);
            }
            if (!TextUtils.isEmpty(str)) {
                spannableStringBuilder.setSpan(new o31(org.telegram.messenger.g0.o()), 0, str.length(), 18);
            }
            TextPaint textPaint = this.f20014w;
            textPaint.setTextSize(org.telegram.messenger.g0.L(16.0f));
            CharSequence ellipsize = TextUtils.ellipsize(spannableStringBuilder, textPaint, this.L, TextUtils.TruncateAt.END);
            int i13 = this.L;
            this.M = new StaticLayout(ellipsize, this.f20014w, org.telegram.messenger.g0.L(50.0f) + i13, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            this.K = org.telegram.messenger.g0.L(11.0f) + ((i11 - org.telegram.messenger.g0.L(30.0f)) / 2) + i12;
        }
        this.f20016y.i(this.L, org.telegram.messenger.g0.L(30.0f));
    }

    public final void n(boolean z10) {
        TLRPC.Document document;
        boolean z11;
        File K;
        boolean z12;
        s sVar;
        int i3 = k6.We;
        int i10 = k6.Xe;
        int i11 = k6.f27979id;
        int i12 = k6.f27995jd;
        RadialProgress2 radialProgress2 = this.f20015x;
        radialProgress2.g(i3, i10, i11, i12);
        radialProgress2.d = k6.w0(k6.f28109pe, this.f20012r);
        int i13 = 1;
        this.W = true;
        boolean l10 = l();
        int i14 = this.f20011n;
        if (l10) {
            org.telegram.messenger.z5.q(i14).v(this);
            radialProgress2.p(z10, this.f20029a.f19435g.f19863f);
            radialProgress2.setIcon(3, false, z10);
            p();
            return;
        }
        if (j()) {
            document = this.f20029a.f19435g.h;
        } else {
            document = null;
        }
        String r5 = w7.r(null, document);
        a aVar = this.f20029a;
        if (aVar != null && (sVar = aVar.f19435g) != null && !TextUtils.isEmpty(sVar.f19862e) && new File(this.f20029a.f19435g.f19862e).exists()) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (document == null) {
            K = null;
        } else {
            w7.G(i14);
            K = w7.K(document, null, true, true);
        }
        if (!z11 && (K == null || !K.exists())) {
            z12 = false;
        } else {
            z12 = true;
        }
        if (TextUtils.isEmpty(r5)) {
            radialProgress2.setIcon(4, false, false);
            return;
        }
        if (z12) {
            org.telegram.messenger.z5.q(i14).v(this);
            if (!MediaController.B().I(this.Q) || MediaController.B().H()) {
                i13 = 0;
            }
            this.S = i13;
            radialProgress2.setIcon(getIconForCurrentState(), false, z10);
        } else {
            org.telegram.messenger.z5.q(i14).a(r5, null, this);
            boolean T = w7.G(i14).T(r5);
            float f10 = 0.0f;
            if (!T) {
                this.S = 2;
                radialProgress2.p(z10, 0.0f);
                radialProgress2.setIcon(getIconForCurrentState(), false, z10);
            } else {
                this.S = 3;
                Float w10 = zb.D().w(r5);
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
        this.f20015x.n(this);
        this.f20016y.f36204s = this;
        n(false);
        int i3 = this.f20011n;
        hs.f(i3).c(this, hs.f23239h2);
        hs.f(i3).c(this, hs.f23227f2);
        hs.f(i3).c(this, hs.f23233g2);
        hs.f(i3).c(this, hs.f23221e2);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.U = false;
        int i3 = this.f20011n;
        org.telegram.messenger.z5.q(i3).v(this);
        hs.f(i3).n(this, hs.f23239h2);
        hs.f(i3).n(this, hs.f23227f2);
        hs.f(i3).n(this, hs.f23233g2);
        hs.f(i3).n(this, hs.f23221e2);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        h9 textSelectionHelper;
        int i3;
        if (getDisplayDocument() != null) {
            this.f20015x.draw(canvas);
            int i10 = k6.ie;
            org.telegram.ui.ActionBar.e6 e6Var = this.f20012r;
            int w02 = k6.w0(i10, e6Var);
            int w03 = k6.w0(k6.f27996je, e6Var);
            int i11 = k6.f28033le;
            int w04 = k6.w0(i11, e6Var);
            int w05 = k6.w0(i11, e6Var);
            int w06 = k6.w0(k6.ke, e6Var);
            mm0 mm0Var = this.f20016y;
            mm0Var.g(w02, w03, w04, w05, w06);
            if (!l()) {
                canvas.save();
                canvas.translate(this.J, this.K);
                mm0Var.b(canvas);
                canvas.restore();
            }
            int w07 = k6.w0(k6.f27850be, e6Var);
            TextPaint textPaint = this.f20014w;
            textPaint.setColor(w07);
            if (this.N != null) {
                canvas.save();
                canvas.translate(org.telegram.messenger.g0.L(54.0f) + this.F, org.telegram.messenger.g0.L(6.0f) + this.K);
                this.N.draw(canvas);
                canvas.restore();
            }
            if (this.M != null) {
                textPaint.setColor(k6.w0(k6.G6, e6Var));
                canvas.save();
                canvas.translate(org.telegram.messenger.g0.L(54.0f) + this.F, this.K - org.telegram.messenger.g0.L(16.0f));
                this.M.draw(canvas);
                canvas.restore();
            }
            n3 n3Var = this.P;
            if (n3Var != null && (textSelectionHelper = n3Var.f19761a.getTextSelectionHelper()) != null && textSelectionHelper.x() && (getParent() instanceof RecyclerView)) {
                ((RecyclerView) getParent()).getClass();
                int R = RecyclerView.R(this);
                if (R >= 0 && R > textSelectionHelper.f29352p0 && R <= textSelectionHelper.f29355s0) {
                    int i12 = 0;
                    if (this.I) {
                        i3 = 0;
                    } else {
                        i3 = this.f20031c;
                    }
                    float L = org.telegram.messenger.g0.L(8.0f) + i3;
                    float L2 = org.telegram.messenger.g0.L(2.0f);
                    int width = getWidth();
                    if (this.I) {
                        i12 = this.f20031c;
                    }
                    canvas.drawRoundRect(L, L2, (width - i12) - org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(64.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), this.f20013s);
                }
            }
        }
    }

    @Override
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        int i13;
        boolean z11 = this.I;
        int i14 = 0;
        if (z11) {
            i13 = 0;
        } else {
            i13 = this.f20031c;
        }
        if (z11) {
            i14 = this.f20031c;
        }
        this.V.g(i13, i14, i11 - i3, org.telegram.messenger.g0.L(66.0f));
        m();
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        int i11;
        int size = View.MeasureSpec.getSize(i3);
        boolean z10 = this.I;
        int i12 = 0;
        if (z10) {
            i11 = 0;
        } else {
            i11 = this.f20031c;
        }
        if (z10) {
            i12 = this.f20031c;
        }
        setMeasuredDimension(size, org.telegram.messenger.g0.L(66.0f) + this.V.h(i11, i12, size));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        TLRPC.Document document;
        int actionMasked = motionEvent.getActionMasked();
        float x10 = motionEvent.getX();
        float y9 = motionEvent.getY();
        if (!l()) {
            if (this.f20016y.e(x10 - this.J, y9 - this.K, actionMasked)) {
                if (actionMasked == 0) {
                    getParent().requestDisallowInterceptTouchEvent(true);
                }
                invalidate();
                return true;
            }
        }
        if (actionMasked == 0) {
            int i3 = this.F;
            if (x10 >= i3) {
                int i10 = this.H;
                if (x10 <= i3 + i10) {
                    int i11 = this.G;
                    if (y9 >= i11 && y9 <= i11 + i10) {
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
                        a aVar = this.f20029a;
                        t3 t3Var = n3Var.f19761a;
                        ArrayList arrayList = t3Var.f19924t3;
                        z4 z4Var = (z4) t3Var.f19907h4.remove(aVar.f19435g);
                        if (z4Var != null) {
                            z4Var.b();
                        }
                        int indexOf = arrayList.indexOf(aVar);
                        if (indexOf >= 0) {
                            g2 g2Var = t3Var.R3;
                            if (g2Var != null) {
                                g2Var.d();
                            }
                            arrayList.remove(indexOf);
                            t3Var.f35594g3.O(true);
                            g2 g2Var2 = t3Var.R3;
                            if (g2Var2 != null) {
                                g2Var2.h();
                            }
                        }
                        t3Var.f19916p3.onContentChanged();
                    }
                } else if (this.Q != null) {
                    if (j()) {
                        document = this.f20029a.f19435g.h;
                    } else {
                        document = null;
                    }
                    int i12 = this.S;
                    RadialProgress2 radialProgress2 = this.f20015x;
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
                        int i13 = this.f20011n;
                        if (i12 == 2) {
                            radialProgress2.p(false, 0.0f);
                            w7.G(i13).X(document, this.Q, 1, 1);
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
        int i3;
        zi ziVar;
        if (!l() && (ziVar = this.Q) != null) {
            mm0 mm0Var = this.f20016y;
            if (!mm0Var.f36191e) {
                mm0Var.h(ziVar.f26828b0);
            }
        }
        if (l()) {
            if (g() != null) {
                d = g().duration;
                i3 = (int) d;
            }
            i3 = 0;
        } else if (this.Q != null && MediaController.B().I(this.Q)) {
            i3 = this.Q.f26851g0;
        } else {
            TLRPC.TL_documentAttributeAudio g7 = g();
            if (g7 != null) {
                d = g7.duration;
                i3 = (int) d;
            }
            i3 = 0;
        }
        String g02 = org.telegram.messenger.g0.g0(i3, false, false);
        String str = this.O;
        if (str == null || !str.equals(g02)) {
            this.O = g02;
            TextPaint textPaint = this.f20014w;
            textPaint.setTextSize(org.telegram.messenger.g0.L(16.0f));
            this.N = new StaticLayout(g02, textPaint, (int) Math.ceil(textPaint.measureText(g02)), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        }
        invalidate();
    }

    @Override
    public final void updateColors() {
        RadialProgress2 radialProgress2;
        int i3 = k6.ig;
        org.telegram.ui.ActionBar.e6 e6Var = this.f20012r;
        this.f20013s.setColor(k6.w0(i3, e6Var));
        k0 k0Var = this.V;
        if (k0Var != null) {
            k0Var.a();
        }
        try {
            if (this.W && (radialProgress2 = this.f20015x) != null) {
                radialProgress2.d = k6.w0(k6.f28109pe, e6Var);
            }
            if (getBackground() instanceof z1) {
                ((z1) getBackground()).a(k6.w0(k6.f27878d6, e6Var));
            }
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    @Override
    public final void o(long j10, long j11) {
    }
}
