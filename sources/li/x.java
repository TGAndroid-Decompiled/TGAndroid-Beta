package li;

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
import c8.ha;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.a8;
import org.telegram.messenger.gc;
import org.telegram.messenger.hd;
import org.telegram.messenger.ij;
import org.telegram.messenger.ls;
import org.telegram.messenger.p10;
import org.telegram.messenger.qs;
import org.telegram.messenger.w7;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Cells.h9;
import org.telegram.ui.Cells.i9;
import org.telegram.ui.Components.RadialProgress2;
import org.telegram.ui.Components.jm0;
import org.telegram.ui.Components.o31;
public final class x extends y implements org.telegram.ui.ActionBar.a6, h9, k0, ls, org.telegram.messenger.x5 {
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
    public n3 O;
    public ij P;
    public TLRPC.Document Q;
    public int R;
    public boolean S;
    public boolean T;
    public final j0 U;
    public boolean V;
    public final int f18960n;
    public final f6 f18961r;
    public final Paint f18962s;
    public final TextPaint f18963w;
    public final RadialProgress2 f18964x;
    public final jm0 f18965y;

    public x(int i7, Context context, f6 f6Var) {
        super(context);
        this.f18962s = new Paint(1);
        this.f18963w = new TextPaint(1);
        this.E = org.telegram.messenger.g0.L(16.0f);
        int L = org.telegram.messenger.g0.L(10.0f);
        this.F = L;
        int L2 = org.telegram.messenger.g0.L(44.0f);
        this.G = L2;
        this.f18960n = i7;
        this.f18961r = f6Var;
        setWillNotDraw(false);
        this.D = org.telegram.messenger.z5.q(i7).k();
        RadialProgress2 radialProgress2 = new RadialProgress2(this, f6Var);
        this.f18964x = radialProgress2;
        radialProgress2.setCircleRadius(org.telegram.messenger.g0.L(24.0f));
        int i10 = this.E;
        radialProgress2.r(i10, L, i10 + L2, L2 + L);
        jm0 jm0Var = new jm0(this);
        this.f18965y = jm0Var;
        jm0Var.h = new gf.g(this, 11);
        setMinimumHeight(org.telegram.messenger.g0.L(66.0f));
        j0 j0Var = new j0(context, f6Var, new h9.f1(this, 9));
        this.U = j0Var;
        addView(j0Var.f18648a, ha.e(-2, -2, 51));
        updateColors();
    }

    private TLRPC.Document getDisplayDocument() {
        s sVar;
        a aVar = this.f18986a;
        if (aVar != null && (sVar = aVar.f18393g) != null) {
            TLRPC.Document document = sVar.h;
            if (document != null) {
                return document;
            }
            return sVar.f18817i;
        }
        return null;
    }

    private int getIconForCurrentState() {
        if (l()) {
            return 3;
        }
        int i7 = this.R;
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
    public final void C(boolean z9) {
        n(true);
    }

    @Override
    public final void M(String str) {
        this.f18964x.p(true, 1.0f);
        n(true);
    }

    @Override
    public final boolean a(int i7, int i10) {
        return this.U.f(i7, i10);
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(k6.f27948ig));
    }

    @Override
    public final void b() {
        this.U.i();
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        ij ijVar;
        ij ijVar2 = this.P;
        if (ijVar2 != null && i10 == this.f18960n) {
            if (i7 != qs.f24993h2 && i7 != qs.f24981f2 && i7 != qs.f24987g2) {
                if (i7 == qs.f24975e2 && ijVar2.f1() == ((Integer) objArr[0]).intValue() && (ijVar = MediaController.B().f21292u0) != null) {
                    ij ijVar3 = this.P;
                    ijVar3.f23197b0 = ijVar.f23197b0;
                    ijVar3.f23220g0 = ijVar.f23220g0;
                    ijVar3.f23224h0 = ijVar.f23224h0;
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
    public final void e(int i7) {
        int L = org.telegram.messenger.g0.L(16.0f);
        if (this.H) {
            i7 = 0;
        }
        int i10 = L + i7;
        this.E = i10;
        int i11 = this.G;
        int i12 = this.F;
        this.f18964x.r(i10, i12, i10 + i11, i11 + i12);
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
    public g1 getCaptionEditText() {
        return this.U.f18648a;
    }

    @Override
    public int getObserverTag() {
        return this.D;
    }

    @Override
    public a getRow() {
        return this.f18986a;
    }

    public final void h(a aVar, n3 n3Var) {
        s sVar;
        this.f18986a = aVar;
        this.O = n3Var;
        if (aVar != null && aVar.f18393g == null) {
            aVar.f18393g = new s();
        }
        this.H = hd.f22871a0;
        c(aVar);
        this.U.b();
        TLRPC.Document displayDocument = getDisplayDocument();
        if (displayDocument != this.Q) {
            this.Q = displayDocument;
            this.P = null;
            this.N = null;
            this.M = null;
        }
        if (j() && this.P == null && displayDocument != null) {
            TLRPC.TL_message tL_message = new TLRPC.TL_message();
            tL_message.out = true;
            tL_message.f26973id = -Long.valueOf(displayDocument.f26958id).hashCode();
            tL_message.peer_id = new TLRPC.TL_peerUser();
            TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
            tL_message.from_id = tL_peerUser;
            TLRPC.Peer peer = tL_message.peer_id;
            int i7 = this.f18960n;
            long e10 = p10.i(i7).e();
            peer.user_id = e10;
            tL_peerUser.user_id = e10;
            tL_message.date = (int) (System.currentTimeMillis() / 1000);
            tL_message.message = "";
            TLRPC.TL_messageMediaDocument tL_messageMediaDocument = new TLRPC.TL_messageMediaDocument();
            tL_message.media = tL_messageMediaDocument;
            tL_messageMediaDocument.flags |= 3;
            tL_messageMediaDocument.document = displayDocument;
            tL_message.flags |= 768;
            a aVar2 = this.f18986a;
            if (aVar2 != null && (sVar = aVar2.f18393g) != null && !TextUtils.isEmpty(sVar.f18814e)) {
                tL_message.attachPath = this.f18986a.f18393g.f18814e;
            }
            this.P = new ij(i7, tL_message, false, true);
        }
        m();
        if (this.T) {
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
        this.f18964x.p(true, Math.min(1.0f, f10));
        if (this.R != 3) {
            n(true);
        }
    }

    public final boolean j() {
        s sVar;
        a aVar = this.f18986a;
        if (aVar != null && (sVar = aVar.f18393g) != null && sVar.b()) {
            return true;
        }
        return false;
    }

    @Override
    public final void k(ArrayList arrayList) {
        this.U.e(arrayList);
    }

    public final boolean l() {
        s sVar;
        a aVar = this.f18986a;
        if (aVar != null && (sVar = aVar.f18393g) != null && sVar.a()) {
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
        int L = org.telegram.messenger.g0.L(50.0f) + this.E;
        int i11 = this.G;
        this.I = L + i11;
        if (getMeasuredWidth() > 0) {
            i7 = getMeasuredWidth();
        } else {
            i7 = org.telegram.messenger.g0.f22537q.x;
        }
        if (this.H) {
            i10 = this.f18988c;
        } else {
            i10 = 0;
        }
        this.K = Math.max(0, ((i7 - this.I) - org.telegram.messenger.g0.L(16.0f)) - i10);
        ij ijVar = this.P;
        if (ijVar != null) {
            str = ijVar.x1(false);
        } else if (g() != null) {
            str = g().performer;
        } else {
            str = null;
        }
        ij ijVar2 = this.P;
        if (ijVar2 != null) {
            str2 = ijVar2.z1(false);
        } else if (g() != null) {
            str2 = g().title;
        } else {
            str2 = null;
        }
        boolean isEmpty = TextUtils.isEmpty(str2);
        int i12 = this.F;
        if (isEmpty && TextUtils.isEmpty(str)) {
            this.L = null;
            this.J = ((i11 - org.telegram.messenger.g0.L(30.0f)) / 2) + i12;
        } else {
            if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str)) {
                spannableStringBuilder = new SpannableStringBuilder(a8.p0.D(str, " - ", str2));
            } else if (!TextUtils.isEmpty(str2)) {
                spannableStringBuilder = new SpannableStringBuilder(str2);
            } else {
                spannableStringBuilder = new SpannableStringBuilder(str);
            }
            if (!TextUtils.isEmpty(str)) {
                spannableStringBuilder.setSpan(new o31(org.telegram.messenger.g0.o()), 0, str.length(), 18);
            }
            TextPaint textPaint = this.f18963w;
            textPaint.setTextSize(org.telegram.messenger.g0.L(16.0f));
            CharSequence ellipsize = TextUtils.ellipsize(spannableStringBuilder, textPaint, this.K, TextUtils.TruncateAt.END);
            int i13 = this.K;
            this.L = new StaticLayout(ellipsize, this.f18963w, org.telegram.messenger.g0.L(50.0f) + i13, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            this.J = org.telegram.messenger.g0.L(11.0f) + ((i11 - org.telegram.messenger.g0.L(30.0f)) / 2) + i12;
        }
        this.f18965y.i(this.K, org.telegram.messenger.g0.L(30.0f));
    }

    public final void n(boolean z9) {
        TLRPC.Document document;
        boolean z10;
        File K;
        boolean z11;
        s sVar;
        int i7 = k6.We;
        int i10 = k6.Xe;
        int i11 = k6.f27946id;
        int i12 = k6.f27964jd;
        RadialProgress2 radialProgress2 = this.f18964x;
        radialProgress2.g(i7, i10, i11, i12);
        radialProgress2.d = k6.w0(k6.f28076pe, this.f18961r);
        int i13 = 1;
        this.V = true;
        boolean l10 = l();
        int i14 = this.f18960n;
        if (l10) {
            org.telegram.messenger.z5.q(i14).v(this);
            radialProgress2.p(z9, this.f18986a.f18393g.f18815f);
            radialProgress2.setIcon(3, false, z9);
            p();
            return;
        }
        if (j()) {
            document = this.f18986a.f18393g.h;
        } else {
            document = null;
        }
        String r10 = w7.r(null, document);
        a aVar = this.f18986a;
        if (aVar != null && (sVar = aVar.f18393g) != null && !TextUtils.isEmpty(sVar.f18814e) && new File(this.f18986a.f18393g.f18814e).exists()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (document == null) {
            K = null;
        } else {
            w7.G(i14);
            K = w7.K(document, null, true, true);
        }
        if (!z10 && (K == null || !K.exists())) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (TextUtils.isEmpty(r10)) {
            radialProgress2.setIcon(4, false, false);
            return;
        }
        if (z11) {
            org.telegram.messenger.z5.q(i14).v(this);
            if (!MediaController.B().I(this.P) || MediaController.B().H()) {
                i13 = 0;
            }
            this.R = i13;
            radialProgress2.setIcon(getIconForCurrentState(), false, z9);
        } else {
            org.telegram.messenger.z5.q(i14).a(r10, null, this);
            boolean T = w7.G(i14).T(r10);
            float f10 = 0.0f;
            if (!T) {
                this.R = 2;
                radialProgress2.p(z9, 0.0f);
                radialProgress2.setIcon(getIconForCurrentState(), false, z9);
            } else {
                this.R = 3;
                Float w10 = gc.D().w(r10);
                if (w10 != null) {
                    f10 = w10.floatValue();
                }
                radialProgress2.p(z9, f10);
                radialProgress2.setIcon(getIconForCurrentState(), true, z9);
            }
        }
        p();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.T = true;
        this.f18964x.n(this);
        this.f18965y.f35028s = this;
        n(false);
        int i7 = this.f18960n;
        qs.f(i7).c(this, qs.f24993h2);
        qs.f(i7).c(this, qs.f24981f2);
        qs.f(i7).c(this, qs.f24987g2);
        qs.f(i7).c(this, qs.f24975e2);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.T = false;
        int i7 = this.f18960n;
        org.telegram.messenger.z5.q(i7).v(this);
        qs.f(i7).n(this, qs.f24993h2);
        qs.f(i7).n(this, qs.f24981f2);
        qs.f(i7).n(this, qs.f24987g2);
        qs.f(i7).n(this, qs.f24975e2);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        i9 textSelectionHelper;
        int i7;
        if (getDisplayDocument() != null) {
            this.f18964x.draw(canvas);
            int i10 = k6.f27947ie;
            f6 f6Var = this.f18961r;
            int w02 = k6.w0(i10, f6Var);
            int w03 = k6.w0(k6.f27965je, f6Var);
            int i11 = k6.le;
            int w04 = k6.w0(i11, f6Var);
            int w05 = k6.w0(i11, f6Var);
            int w06 = k6.w0(k6.f27984ke, f6Var);
            jm0 jm0Var = this.f18965y;
            jm0Var.g(w02, w03, w04, w05, w06);
            if (!l()) {
                canvas.save();
                canvas.translate(this.I, this.J);
                jm0Var.b(canvas);
                canvas.restore();
            }
            int w07 = k6.w0(k6.f27818be, f6Var);
            TextPaint textPaint = this.f18963w;
            textPaint.setColor(w07);
            if (this.M != null) {
                canvas.save();
                canvas.translate(org.telegram.messenger.g0.L(54.0f) + this.E, org.telegram.messenger.g0.L(6.0f) + this.J);
                this.M.draw(canvas);
                canvas.restore();
            }
            if (this.L != null) {
                textPaint.setColor(k6.w0(k6.G6, f6Var));
                canvas.save();
                canvas.translate(org.telegram.messenger.g0.L(54.0f) + this.E, this.J - org.telegram.messenger.g0.L(16.0f));
                this.L.draw(canvas);
                canvas.restore();
            }
            n3 n3Var = this.O;
            if (n3Var != null && (textSelectionHelper = n3Var.f18728a.getTextSelectionHelper()) != null && textSelectionHelper.x() && (getParent() instanceof RecyclerView)) {
                ((RecyclerView) getParent()).getClass();
                int R = RecyclerView.R(this);
                if (R >= 0 && R > textSelectionHelper.f29313p0 && R <= textSelectionHelper.f29316s0) {
                    int i12 = 0;
                    if (this.H) {
                        i7 = 0;
                    } else {
                        i7 = this.f18988c;
                    }
                    float L = org.telegram.messenger.g0.L(8.0f) + i7;
                    float L2 = org.telegram.messenger.g0.L(2.0f);
                    int width = getWidth();
                    if (this.H) {
                        i12 = this.f18988c;
                    }
                    canvas.drawRoundRect(L, L2, (width - i12) - org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(64.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), this.f18962s);
                }
            }
        }
    }

    @Override
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        int i13;
        boolean z10 = this.H;
        int i14 = 0;
        if (z10) {
            i13 = 0;
        } else {
            i13 = this.f18988c;
        }
        if (z10) {
            i14 = this.f18988c;
        }
        this.U.g(i13, i14, i11 - i7, org.telegram.messenger.g0.L(66.0f));
        m();
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int i11;
        int size = View.MeasureSpec.getSize(i7);
        boolean z9 = this.H;
        int i12 = 0;
        if (z9) {
            i11 = 0;
        } else {
            i11 = this.f18988c;
        }
        if (z9) {
            i12 = this.f18988c;
        }
        setMeasuredDimension(size, org.telegram.messenger.g0.L(66.0f) + this.U.h(i11, i12, size));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        TLRPC.Document document;
        int actionMasked = motionEvent.getActionMasked();
        float x10 = motionEvent.getX();
        float y10 = motionEvent.getY();
        if (!l()) {
            if (this.f18965y.e(x10 - this.I, y10 - this.J, actionMasked)) {
                if (actionMasked == 0) {
                    getParent().requestDisallowInterceptTouchEvent(true);
                }
                invalidate();
                return true;
            }
        }
        if (actionMasked == 0) {
            int i7 = this.E;
            if (x10 >= i7) {
                int i10 = this.G;
                if (x10 <= i7 + i10) {
                    int i11 = this.F;
                    if (y10 >= i11 && y10 <= i11 + i10) {
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
                    n3 n3Var = this.O;
                    if (n3Var != null) {
                        a aVar = this.f18986a;
                        t3 t3Var = n3Var.f18728a;
                        ArrayList arrayList = t3Var.f18894s3;
                        y4 y4Var = (y4) t3Var.f18877g4.remove(aVar.f18393g);
                        if (y4Var != null) {
                            y4Var.b();
                        }
                        int indexOf = arrayList.indexOf(aVar);
                        if (indexOf >= 0) {
                            f2 f2Var = t3Var.Q3;
                            if (f2Var != null) {
                                f2Var.d();
                            }
                            arrayList.remove(indexOf);
                            t3Var.f35167f3.O(true);
                            f2 f2Var2 = t3Var.Q3;
                            if (f2Var2 != null) {
                                f2Var2.h();
                            }
                        }
                        t3Var.f18887o3.onContentChanged();
                    }
                } else if (this.P != null) {
                    if (j()) {
                        document = this.f18986a.f18393g.h;
                    } else {
                        document = null;
                    }
                    int i12 = this.R;
                    RadialProgress2 radialProgress2 = this.f18964x;
                    if (i12 == 0) {
                        ArrayList arrayList2 = new ArrayList();
                        arrayList2.add(this.P);
                        if (MediaController.B().o0(arrayList2, this.P, 0L, false, null, 0L)) {
                            this.R = 1;
                            radialProgress2.setIcon(getIconForCurrentState(), false, true);
                            invalidate();
                        }
                    } else if (i12 == 1) {
                        if (MediaController.B().R(this.P, true)) {
                            this.R = 0;
                            radialProgress2.setIcon(getIconForCurrentState(), false, true);
                            invalidate();
                        }
                    } else {
                        int i13 = this.f18960n;
                        if (i12 == 2) {
                            radialProgress2.p(false, 0.0f);
                            w7.G(i13).X(document, this.P, 1, 1);
                            this.R = 3;
                            radialProgress2.setIcon(getIconForCurrentState(), true, true);
                            invalidate();
                        } else if (i12 == 3) {
                            w7.G(i13).f(document);
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
        int i7;
        ij ijVar;
        if (!l() && (ijVar = this.P) != null) {
            jm0 jm0Var = this.f18965y;
            if (!jm0Var.f35015e) {
                jm0Var.h(ijVar.f23197b0);
            }
        }
        if (l()) {
            if (g() != null) {
                d = g().duration;
                i7 = (int) d;
            }
            i7 = 0;
        } else if (this.P != null && MediaController.B().I(this.P)) {
            i7 = this.P.f23220g0;
        } else {
            TLRPC.TL_documentAttributeAudio g10 = g();
            if (g10 != null) {
                d = g10.duration;
                i7 = (int) d;
            }
            i7 = 0;
        }
        String g02 = org.telegram.messenger.g0.g0(i7, false, false);
        String str = this.N;
        if (str == null || !str.equals(g02)) {
            this.N = g02;
            TextPaint textPaint = this.f18963w;
            textPaint.setTextSize(org.telegram.messenger.g0.L(16.0f));
            this.M = new StaticLayout(g02, textPaint, (int) Math.ceil(textPaint.measureText(g02)), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        }
        invalidate();
    }

    @Override
    public final void updateColors() {
        RadialProgress2 radialProgress2;
        int i7 = k6.f27948ig;
        f6 f6Var = this.f18961r;
        this.f18962s.setColor(k6.w0(i7, f6Var));
        j0 j0Var = this.U;
        if (j0Var != null) {
            j0Var.a();
        }
        try {
            if (this.V && (radialProgress2 = this.f18964x) != null) {
                radialProgress2.d = k6.w0(k6.f28076pe, f6Var);
            }
            if (getBackground() instanceof y1) {
                ((y1) getBackground()).a(k6.w0(k6.f27848d6, f6Var));
            }
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    @Override
    public final void o(long j3, long j10) {
    }
}
