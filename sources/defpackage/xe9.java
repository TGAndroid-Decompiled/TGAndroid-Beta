package defpackage;

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
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.RadialProgress2;
public final class xe9 extends ze9 implements snb, zlb, jf9, fn7, jq3 {
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
    public ji9 P;
    public r47 Q;
    public TLRPC.Document R;
    public byte S;
    public boolean T;
    public boolean U;
    public final if9 V;
    public boolean W;
    public final int n;
    public final vnb r;
    public final Paint s;
    public final TextPaint w;
    public final RadialProgress2 x;
    public final ry9 y;

    public xe9(int i, vnb vnbVar, Context context) {
        super(context);
        this.s = new Paint(1);
        this.w = new TextPaint(1);
        this.F = hl.L(16.0f);
        int L = hl.L(10.0f);
        this.G = L;
        int L2 = hl.L(44.0f);
        this.H = L2;
        this.n = i;
        this.r = vnbVar;
        setWillNotDraw(false);
        this.E = lq3.q(i).k();
        RadialProgress2 radialProgress2 = new RadialProgress2(this, vnbVar);
        this.x = radialProgress2;
        radialProgress2.setCircleRadius(hl.L(24.0f));
        int i2 = this.F;
        radialProgress2.p(i2, L, i2 + L2, L2 + L);
        ry9 ry9Var = new ry9(this);
        this.y = ry9Var;
        ry9Var.h = new ve9(this, (byte) 0);
        setMinimumHeight(hl.L(66.0f));
        if9 if9Var = new if9(context, vnbVar, new j09(this, (byte) 4));
        this.V = if9Var;
        addView(if9Var.a, tre.e(-2, -2, 51));
        updateColors();
    }

    private TLRPC.Document getDisplayDocument() {
        p07 p07Var;
        mk0 mk0Var = this.a;
        if (mk0Var != null && (p07Var = mk0Var.g) != null) {
            TLRPC.Document document = p07Var.h;
            if (document != null) {
                return document;
            }
            return p07Var.i;
        }
        return null;
    }

    private int getIconForCurrentState() {
        if (!m()) {
            byte b = this.S;
            if (b == 1) {
                return 1;
            }
            if (b == 2) {
                return 2;
            }
            if (b != 3) {
                return 0;
            }
        }
        return 3;
    }

    @Override
    public final void B(boolean z) {
        o(true);
    }

    @Override
    public final void N(String str) {
        this.x.o(true, 1.0f);
        o(true);
    }

    @Override
    public final boolean a(int i, int i2) {
        return this.V.f(i, i2);
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(aob.lg));
    }

    @Override
    public final void b() {
        this.V.i();
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        r47 r47Var;
        r47 r47Var2 = this.Q;
        if (r47Var2 != null && i2 == this.n) {
            if (i != jn7.h2 && i != jn7.f2 && i != jn7.g2) {
                if (i == jn7.e2 && r47Var2.e1() == ((Integer) objArr[0]).intValue() && (r47Var = MediaController.z().v0) != null) {
                    r47 r47Var3 = this.Q;
                    r47Var3.b0 = r47Var.b0;
                    r47Var3.i0 = r47Var.i0;
                    r47Var3.j0 = r47Var.j0;
                    p();
                    return;
                }
                return;
            }
            o(true);
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        this.V.c(canvas);
    }

    @Override
    public final void e(int i) {
        int L = hl.L(16.0f);
        if (this.I) {
            i = 0;
        }
        int i2 = L + i;
        this.F = i2;
        int i3 = this.H;
        int i4 = this.G;
        this.x.p(i2, i4, i2 + i3, i3 + i4);
        requestLayout();
        invalidate();
    }

    public final TLRPC.TL_documentAttributeAudio g() {
        TLRPC.Document displayDocument = getDisplayDocument();
        if (displayDocument == null) {
            return null;
        }
        for (int i = 0; i < displayDocument.attributes.size(); i++) {
            if (displayDocument.attributes.get(i) instanceof TLRPC.TL_documentAttributeAudio) {
                return (TLRPC.TL_documentAttributeAudio) displayDocument.attributes.get(i);
            }
        }
        return null;
    }

    @Override
    public dg9 getCaptionEditText() {
        return this.V.a;
    }

    @Override
    public int getObserverTag() {
        return this.E;
    }

    @Override
    public mk0 getRow() {
        return this.a;
    }

    public final void h(mk0 mk0Var, ji9 ji9Var) {
        p07 p07Var;
        this.a = mk0Var;
        this.P = ji9Var;
        if (mk0Var != null && mk0Var.g == null) {
            mk0Var.g = new p07();
        }
        this.I = ob6.a0;
        c(mk0Var);
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
            tL_message.id = -Long.valueOf(displayDocument.id).hashCode();
            tL_message.peer_id = new TLRPC.TL_peerUser();
            TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
            tL_message.from_id = tL_peerUser;
            TLRPC.Peer peer = tL_message.peer_id;
            int i = this.n;
            long e = yac.h(i).e();
            peer.user_id = e;
            tL_peerUser.user_id = e;
            tL_message.date = (int) (System.currentTimeMillis() / 1000);
            tL_message.message = "";
            TLRPC.TL_messageMediaDocument tL_messageMediaDocument = new TLRPC.TL_messageMediaDocument();
            tL_message.media = tL_messageMediaDocument;
            tL_messageMediaDocument.flags |= 3;
            tL_messageMediaDocument.document = displayDocument;
            tL_message.flags |= 768;
            mk0 mk0Var2 = this.a;
            if (mk0Var2 != null && (p07Var = mk0Var2.g) != null && !TextUtils.isEmpty(p07Var.e)) {
                tL_message.attachPath = this.a.g.e;
            }
            this.Q = new r47(i, tL_message, false, true);
        }
        n();
        if (this.U) {
            o(false);
        }
        requestLayout();
        invalidate();
    }

    @Override
    public final void i(long j, long j2) {
        float f;
        if (j2 <= 0) {
            f = 0.0f;
        } else {
            f = ((float) j) / ((float) j2);
        }
        this.x.o(true, Math.min(1.0f, f));
        if (this.S != 3) {
            o(true);
        }
    }

    public final boolean j() {
        p07 p07Var;
        mk0 mk0Var = this.a;
        if (mk0Var != null && (p07Var = mk0Var.g) != null && p07Var.b()) {
            return true;
        }
        return false;
    }

    @Override
    public final void k(ArrayList arrayList) {
        this.V.e(arrayList);
    }

    public final boolean m() {
        p07 p07Var;
        mk0 mk0Var = this.a;
        if (mk0Var != null && (p07Var = mk0Var.g) != null && p07Var.a()) {
            return true;
        }
        return false;
    }

    public final void n() {
        int i;
        int i2;
        String str;
        String str2;
        SpannableStringBuilder spannableStringBuilder;
        int L = hl.L(50.0f) + this.F;
        int i3 = this.H;
        this.J = L + i3;
        if (getMeasuredWidth() > 0) {
            i = getMeasuredWidth();
        } else {
            i = hl.q.x;
        }
        if (this.I) {
            i2 = this.c;
        } else {
            i2 = 0;
        }
        this.L = Math.max(0, ((i - this.J) - hl.L(16.0f)) - i2);
        r47 r47Var = this.Q;
        if (r47Var != null) {
            str = r47Var.w1(false);
        } else if (g() != null) {
            str = g().performer;
        } else {
            str = null;
        }
        r47 r47Var2 = this.Q;
        if (r47Var2 != null) {
            str2 = r47Var2.y1(false);
        } else if (g() != null) {
            str2 = g().title;
        } else {
            str2 = null;
        }
        boolean isEmpty = TextUtils.isEmpty(str2);
        int i4 = this.G;
        if (isEmpty && TextUtils.isEmpty(str)) {
            this.M = null;
            this.K = ((i3 - hl.L(30.0f)) / 2) + i4;
        } else {
            if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str)) {
                spannableStringBuilder = new SpannableStringBuilder(qd4.p(str, " - ", str2));
            } else if (!TextUtils.isEmpty(str2)) {
                spannableStringBuilder = new SpannableStringBuilder(str2);
            } else {
                spannableStringBuilder = new SpannableStringBuilder(str);
            }
            if (!TextUtils.isEmpty(str)) {
                spannableStringBuilder.setSpan(new y7c(hl.o()), 0, str.length(), 18);
            }
            TextPaint textPaint = this.w;
            textPaint.setTextSize(hl.L(16.0f));
            this.M = new StaticLayout(TextUtils.ellipsize(spannableStringBuilder, textPaint, this.L, TextUtils.TruncateAt.END), textPaint, hl.L(50.0f) + this.L, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            this.K = hl.L(11.0f) + ((i3 - hl.L(30.0f)) / 2) + i4;
        }
        this.y.h(this.L, hl.L(30.0f));
    }

    public final void o(boolean z) {
        TLRPC.Document document;
        boolean z2;
        File J;
        boolean z3;
        p07 p07Var;
        int i = aob.Ze;
        int i2 = aob.af;
        int i3 = aob.ld;
        int i4 = aob.md;
        RadialProgress2 radialProgress2 = this.x;
        radialProgress2.g(i, i2, i3, i4);
        radialProgress2.d = aob.v0(aob.se, this.r);
        byte b = 1;
        this.W = true;
        boolean m = m();
        int i5 = this.n;
        if (m) {
            lq3.q(i5).v(this);
            radialProgress2.o(z, this.a.g.f);
            radialProgress2.setIcon(3, false, z);
            p();
            return;
        }
        if (j()) {
            document = this.a.g.h;
        } else {
            document = null;
        }
        String r = xb4.r(null, document);
        mk0 mk0Var = this.a;
        if (mk0Var != null && (p07Var = mk0Var.g) != null && !TextUtils.isEmpty(p07Var.e) && new File(this.a.g.e).exists()) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (document == null) {
            J = null;
        } else {
            xb4.G(i5);
            J = xb4.J(document, null, true, true);
        }
        if (!z2 && (J == null || !J.exists())) {
            z3 = false;
        } else {
            z3 = true;
        }
        if (TextUtils.isEmpty(r)) {
            radialProgress2.setIcon(4, false, false);
            return;
        }
        if (z3) {
            lq3.q(i5).v(this);
            if (!MediaController.z().H(this.Q) || MediaController.z().G()) {
                b = 0;
            }
            this.S = b;
            radialProgress2.setIcon(getIconForCurrentState(), false, z);
        } else {
            lq3.q(i5).a(r, null, this);
            boolean S = xb4.G(i5).S(r);
            float f = 0.0f;
            if (!S) {
                this.S = (byte) 2;
                radialProgress2.o(z, 0.0f);
                radialProgress2.setIcon(getIconForCurrentState(), false, z);
            } else {
                this.S = (byte) 3;
                Float s = in5.z().s(r);
                if (s != null) {
                    f = s.floatValue();
                }
                radialProgress2.o(z, f);
                radialProgress2.setIcon(getIconForCurrentState(), true, z);
            }
        }
        p();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.U = true;
        this.x.m(this);
        this.y.s = this;
        o(false);
        int i = this.n;
        jn7.f(i).b(this, jn7.h2);
        jn7.f(i).b(this, jn7.f2);
        jn7.f(i).b(this, jn7.g2);
        jn7.f(i).b(this, jn7.e2);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.U = false;
        int i = this.n;
        lq3.q(i).v(this);
        jn7.f(i).n(this, jn7.h2);
        jn7.f(i).n(this, jn7.f2);
        jn7.f(i).n(this, jn7.g2);
        jn7.f(i).n(this, jn7.e2);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        amb textSelectionHelper;
        int i;
        if (getDisplayDocument() != null) {
            this.x.draw(canvas);
            int i2 = aob.le;
            vnb vnbVar = this.r;
            int v0 = aob.v0(i2, vnbVar);
            int v02 = aob.v0(aob.me, vnbVar);
            int i3 = aob.oe;
            int v03 = aob.v0(i3, vnbVar);
            int v04 = aob.v0(i3, vnbVar);
            int v05 = aob.v0(aob.ne, vnbVar);
            ry9 ry9Var = this.y;
            ry9Var.f(v0, v02, v03, v04, v05);
            if (!m()) {
                canvas.save();
                canvas.translate(this.J, this.K);
                ry9Var.b(canvas);
                canvas.restore();
            }
            int v06 = aob.v0(aob.ee, vnbVar);
            TextPaint textPaint = this.w;
            textPaint.setColor(v06);
            if (this.N != null) {
                canvas.save();
                canvas.translate(hl.L(54.0f) + this.F, hl.L(6.0f) + this.K);
                this.N.draw(canvas);
                canvas.restore();
            }
            if (this.M != null) {
                textPaint.setColor(aob.v0(aob.G6, vnbVar));
                canvas.save();
                canvas.translate(hl.L(54.0f) + this.F, this.K - hl.L(16.0f));
                this.M.draw(canvas);
                canvas.restore();
            }
            ji9 ji9Var = this.P;
            if (ji9Var != null && (textSelectionHelper = ji9Var.a.getTextSelectionHelper()) != null && textSelectionHelper.w() && (getParent() instanceof RecyclerView)) {
                ((RecyclerView) getParent()).getClass();
                int S = RecyclerView.S(this);
                if (S >= 0 && S > textSelectionHelper.p0 && S <= textSelectionHelper.s0) {
                    int i4 = 0;
                    if (this.I) {
                        i = 0;
                    } else {
                        i = this.c;
                    }
                    float L = hl.L(8.0f) + i;
                    float L2 = hl.L(2.0f);
                    int width = getWidth();
                    if (this.I) {
                        i4 = this.c;
                    }
                    canvas.drawRoundRect(L, L2, (width - i4) - hl.L(8.0f), hl.L(64.0f), hl.L(8.0f), hl.L(8.0f), this.s);
                }
            }
        }
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean z2 = this.I;
        int i5 = this.c;
        int i6 = 0;
        if (!z2) {
            i6 = i5;
            i5 = 0;
        }
        this.V.g(i6, i5, i3 - i, hl.L(66.0f));
        n();
    }

    @Override
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        boolean z = this.I;
        int i3 = this.c;
        int i4 = 0;
        if (!z) {
            i4 = i3;
            i3 = 0;
        }
        setMeasuredDimension(size, hl.L(66.0f) + this.V.h(i4, i3, size));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        TLRPC.Document document;
        int actionMasked = motionEvent.getActionMasked();
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        if (!m()) {
            if (this.y.e(x - this.J, y - this.K, actionMasked)) {
                if (actionMasked == 0) {
                    getParent().requestDisallowInterceptTouchEvent(true);
                }
                invalidate();
                return true;
            }
        }
        if (actionMasked == 0) {
            int i = this.F;
            if (x >= i) {
                int i2 = this.H;
                if (x <= i + i2) {
                    int i3 = this.G;
                    if (y >= i3 && y <= i3 + i2) {
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
                if (m()) {
                    ji9 ji9Var = this.P;
                    if (ji9Var != null) {
                        mk0 mk0Var = this.a;
                        pi9 pi9Var = ji9Var.a;
                        ArrayList arrayList = pi9Var.t3;
                        sj9 sj9Var = (sj9) pi9Var.h4.remove(mk0Var.g);
                        if (sj9Var != null) {
                            sj9Var.b();
                        }
                        int indexOf = arrayList.indexOf(mk0Var);
                        if (indexOf >= 0) {
                            ch9 ch9Var = pi9Var.R3;
                            if (ch9Var != null) {
                                ch9Var.d();
                            }
                            arrayList.remove(indexOf);
                            pi9Var.g3.O(true);
                            ch9 ch9Var2 = pi9Var.R3;
                            if (ch9Var2 != null) {
                                ch9Var2.h();
                            }
                        }
                        pi9Var.p3.onContentChanged();
                    }
                } else if (this.Q != null) {
                    if (j()) {
                        document = this.a.g.h;
                    } else {
                        document = null;
                    }
                    byte b = this.S;
                    RadialProgress2 radialProgress2 = this.x;
                    if (b == 0) {
                        ArrayList arrayList2 = new ArrayList();
                        arrayList2.add(this.Q);
                        if (MediaController.z().q0(arrayList2, this.Q, 0L, false, null, 0L)) {
                            this.S = (byte) 1;
                            radialProgress2.setIcon(getIconForCurrentState(), false, true);
                            invalidate();
                        }
                    } else if (b == 1) {
                        if (MediaController.z().U(this.Q, true)) {
                            this.S = (byte) 0;
                            radialProgress2.setIcon(getIconForCurrentState(), false, true);
                            invalidate();
                        }
                    } else {
                        int i4 = this.n;
                        if (b == 2) {
                            radialProgress2.o(false, 0.0f);
                            xb4.G(i4).X(document, this.Q, 1, 1);
                            this.S = (byte) 3;
                            radialProgress2.setIcon(getIconForCurrentState(), true, true);
                            invalidate();
                        } else if (b == 3) {
                            xb4.G(i4).f(document);
                            this.S = (byte) 2;
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
        int i;
        r47 r47Var;
        if (!m() && (r47Var = this.Q) != null) {
            ry9 ry9Var = this.y;
            if (!ry9Var.e) {
                ry9Var.g(r47Var.b0);
            }
        }
        if (m()) {
            if (g() != null) {
                d = g().duration;
                i = (int) d;
            }
            i = 0;
        } else if (this.Q != null && MediaController.z().H(this.Q)) {
            i = this.Q.i0;
        } else {
            TLRPC.TL_documentAttributeAudio g = g();
            if (g != null) {
                d = g.duration;
                i = (int) d;
            }
            i = 0;
        }
        String g0 = hl.g0(i, false, false);
        String str = this.O;
        if (str == null || !str.equals(g0)) {
            this.O = g0;
            TextPaint textPaint = this.w;
            textPaint.setTextSize(hl.L(16.0f));
            this.N = new StaticLayout(g0, textPaint, (int) Math.ceil(textPaint.measureText(g0)), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        }
        invalidate();
    }

    @Override
    public final void updateColors() {
        RadialProgress2 radialProgress2;
        int i = aob.lg;
        vnb vnbVar = this.r;
        this.s.setColor(aob.v0(i, vnbVar));
        if9 if9Var = this.V;
        if (if9Var != null) {
            if9Var.a();
        }
        try {
            if (this.W && (radialProgress2 = this.x) != null) {
                radialProgress2.d = aob.v0(aob.se, vnbVar);
            }
            if (getBackground() instanceof vg9) {
                ((vg9) getBackground()).a(aob.v0(aob.d6, vnbVar));
            }
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    @Override
    public final void l(long j, long j2) {
    }
}
