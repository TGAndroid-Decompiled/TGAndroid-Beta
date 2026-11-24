package defpackage;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.os.Build;
import android.text.style.URLSpan;
import android.util.LongSparseArray;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.a;
public final class f37 extends FrameLayout {
    public static final int e0 = 0;
    public final a8 E;
    public final k37 F;
    public final FrameLayout G;
    public final k37 H;
    public final k37 I;
    public final int J;
    public final mv6 K;
    public boolean L;
    public int M;
    public int N;
    public boolean O;
    public boolean P;
    public AnimatorSet Q;
    public final Rect R;
    public int S;
    public float T;
    public int U;
    public boolean V;
    public boolean W;
    public final int a;
    public int a0;
    public final n81 b;
    public int b0;
    public final s27 c;
    public boolean c0;
    public final qib d;
    public final l37 d0;
    public final z27 e;
    public final fu f;
    public final b37 h;
    public final jr n;
    public m27 r;
    public final ActionBarPopupWindow$ActionBarPopupWindowLayout s;
    public final y27 w;
    public final y27 x;
    public final a8 y;

    public f37(defpackage.l37 r40, android.content.Context r41, int r42) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.f37.<init>(l37, android.content.Context, int):void");
    }

    public final k27 a(k27 k27Var) {
        f27 f27Var;
        o27 o27Var = this.d0.d;
        m27 m27Var = o27Var.a;
        if (m27Var != null) {
            LongSparseArray longSparseArray = m27Var.d;
            if (longSparseArray != null && longSparseArray.size() > 0 && (f27Var = (f27) o27Var.a.d.valueAt(0)) != null) {
                if (f27Var.i) {
                    if (k27Var != null) {
                        return k27Var;
                    }
                    bu1 bu1Var = o27Var.d;
                    if (bu1Var != null) {
                        return bu1Var.a;
                    }
                }
                return f27Var.h;
            }
            return (k27) o27Var.a.e.get(0);
        }
        return null;
    }

    public final View b() {
        View childAt;
        k27 a = a(null);
        if (a != null) {
            int i = 0;
            while (true) {
                fu fuVar = this.f;
                if (i >= fuVar.getChildCount()) {
                    break;
                }
                childAt = fuVar.getChildAt(i);
                ni5 ni5Var = (ni5) childAt;
                if (ni5Var.getMessageObject() == null || (ni5Var.getMessageObject() != a && ni5Var.getMessageObject().e1() != a.e1())) {
                    i++;
                }
            }
            return childAt;
        }
        return null;
    }

    public final f27 c(k27 k27Var) {
        if (k27Var.c1() != 0) {
            f27 f27Var = (f27) this.r.d.get(k27Var.c1());
            if (f27Var == null || (f27Var.d.size() > 1 && f27Var.d(k27Var) != null)) {
                return f27Var;
            }
            return null;
        }
        return null;
    }

    public final boolean d(gb2 gb2Var) {
        k27 a;
        if (gb2Var != null && gb2Var.getMessageObject() != null && (a = a(null)) != null) {
            if (gb2Var.getMessageObject() == a || gb2Var.getMessageObject().e1() == a.e1()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void e(float f, int i) {
        boolean z = this.d0.w;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.s;
        n81 n81Var = this.b;
        s27 s27Var = this.c;
        if (z) {
            s27Var.setTranslationY(0.0f);
            n81Var.invalidateOutline();
            n81Var.setTranslationY(0.0f);
            actionBarPopupWindow$ActionBarPopupWindowLayout.setTranslationY(0.0f);
        } else {
            s27Var.setTranslationY(i);
            n81Var.invalidateOutline();
            n81Var.setTranslationY(f);
            actionBarPopupWindow$ActionBarPopupWindowLayout.setTranslationY((f + n81Var.getMeasuredHeight()) - gl.L(2.0f));
        }
        float x = n81Var.getX();
        qib qibVar = this.d;
        qibVar.setTranslationX(x);
        qibVar.setTranslationY(n81Var.getY());
    }

    public final void f() {
        l37 l37Var = this.d0;
        new u21(l37Var, l37Var.G).I(2131624012, k96.M0(2131746244, null), k96.M0(2131746243, null)).j();
    }

    public final void g(boolean z, boolean z2) {
        float f;
        int i;
        float f2;
        int i2;
        float f3;
        int i3;
        float f4;
        float f5;
        float f6;
        int i4 = 0;
        if (this.d0.b) {
            z = false;
        }
        if (!z2 || this.P != z) {
            this.P = z;
            AnimatorSet animatorSet = this.Q;
            if (animatorSet != null) {
                animatorSet.cancel();
                this.Q = null;
            }
            a8 a8Var = this.E;
            a8 a8Var2 = this.y;
            y27 y27Var = this.x;
            y27 y27Var2 = this.w;
            float f7 = 0.0f;
            if (z2) {
                this.Q = new AnimatorSet();
                ArrayList arrayList = new ArrayList();
                Property property = View.ALPHA;
                if (y27Var2 != null) {
                    y27Var2.setVisibility(0);
                    if (!z) {
                        f6 = 1.0f;
                    } else {
                        f6 = 0.0f;
                    }
                    arrayList.add(ObjectAnimator.ofFloat(y27Var2, property, f6));
                }
                if (y27Var != null) {
                    y27Var.setVisibility(0);
                    if (z) {
                        f5 = 1.0f;
                    } else {
                        f5 = 0.0f;
                    }
                    arrayList.add(ObjectAnimator.ofFloat(y27Var, property, f5));
                }
                if (a8Var2 != null) {
                    a8Var2.setVisibility(0);
                    if (!z) {
                        f4 = 1.0f;
                    } else {
                        f4 = 0.0f;
                    }
                    arrayList.add(ObjectAnimator.ofFloat(a8Var2, property, f4));
                }
                if (a8Var != null) {
                    a8Var.setVisibility(0);
                    if (z) {
                        f7 = 1.0f;
                    }
                    arrayList.add(ObjectAnimator.ofFloat(a8Var, property, f7));
                }
                this.Q.playTogether(arrayList);
                this.Q.setDuration(360L);
                this.Q.setInterpolator(s33.h);
                this.Q.addListener(new id4((byte) 14, this, z));
                this.Q.start();
                return;
            }
            if (y27Var2 != null) {
                if (!z) {
                    f3 = 1.0f;
                } else {
                    f3 = 0.0f;
                }
                y27Var2.setAlpha(f3);
                if (!z) {
                    i3 = 0;
                } else {
                    i3 = 4;
                }
                y27Var2.setVisibility(i3);
            }
            if (y27Var != null) {
                if (z) {
                    f2 = 1.0f;
                } else {
                    f2 = 0.0f;
                }
                y27Var.setAlpha(f2);
                if (z) {
                    i2 = 0;
                } else {
                    i2 = 4;
                }
                y27Var.setVisibility(i2);
            }
            if (a8Var2 != null) {
                if (!z) {
                    f = 1.0f;
                } else {
                    f = 0.0f;
                }
                a8Var2.setAlpha(f);
                if (!z) {
                    i = 0;
                } else {
                    i = 4;
                }
                a8Var2.setVisibility(i);
            }
            if (a8Var != null) {
                if (z) {
                    f7 = 1.0f;
                }
                a8Var.setAlpha(f7);
                if (!z) {
                    i4 = 4;
                }
                a8Var.setVisibility(i4);
            }
        }
    }

    public final void h(gb2 gb2Var) {
        URLSpan uRLSpan;
        TLRPC.WebPage webPage;
        if (this.a == 2) {
            o27 o27Var = this.d0.d;
            if (!o27Var.n && (uRLSpan = o27Var.w) != null && (webPage = o27Var.v) != null && !(webPage instanceof TLRPC.TL_webPagePending)) {
                gb2Var.t3(uRLSpan);
                return;
            }
        }
        gb2Var.t3(null);
    }

    public final void i() {
        int i;
        int i2;
        l37 l37Var = this.d0;
        o27 o27Var = l37Var.d;
        b37 b37Var = this.h;
        if (b37Var.k()) {
            this.W = true;
            return;
        }
        for (int i3 = 0; i3 < this.r.f.size(); i3++) {
            k27 k27Var = (k27) this.r.f.get(i3);
            k27Var.M1 = true;
            k27Var.h2 = l37Var.a;
            boolean z = o27Var.k;
            TLRPC.Message message = k27Var.k;
            if (!z) {
                i = message.flags | 4;
                message.flags = i;
                k27Var.g2 = false;
            } else {
                i = message.flags & (-5);
                message.flags = i;
                k27Var.g2 = true;
            }
            if (this.a == 2) {
                TLRPC.WebPage webPage = o27Var.v;
                if (webPage != null) {
                    TLRPC.MessageMedia messageMedia = message.media;
                    if (messageMedia == null || messageMedia.webpage != webPage) {
                        message.flags = i | 512;
                        message.media = new TLRPC.TL_messageMediaWebPage();
                        TLRPC.MessageMedia messageMedia2 = k27Var.k.media;
                        messageMedia2.webpage = o27Var.v;
                        boolean z2 = o27Var.q;
                        messageMedia2.force_large_media = !z2;
                        messageMedia2.force_small_media = z2;
                        messageMedia2.manual = true;
                        k27Var.y = null;
                        k27Var.o0();
                        k27Var.p0 = null;
                        k27Var.q0 = null;
                        k27Var.n0 = null;
                        k27Var.o0 = null;
                        k27Var.r0(true);
                        k27Var.K(true);
                    }
                } else {
                    message.flags = i & (-513);
                    message.media = null;
                }
            }
            if (o27Var.l) {
                k27Var.z = null;
            } else {
                k27Var.k0();
            }
            if (k27Var.S3()) {
                n27 n27Var = (n27) k27Var.k.media;
                TLRPC.PollResults pollResults = n27Var.results;
                if (o27Var.l) {
                    i2 = 0;
                } else {
                    i2 = n27Var.a;
                }
                pollResults.total_voters = i2;
            }
        }
        for (int i4 = 0; i4 < this.r.h.size(); i4++) {
            ((TLRPC.PollAnswerVoters) this.r.h.get(i4)).chosen = !o27Var.k;
        }
        for (int i5 = 0; i5 < this.r.d.size(); i5++) {
            b37Var.U((f27) this.r.d.valueAt(i5));
        }
        this.n.l(0, this.r.f.size());
    }

    public final void j() {
        final int i = this.S;
        final float f = this.T;
        l37 l37Var = this.d0;
        boolean z = l37Var.w;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.s;
        fu fuVar = this.f;
        int i2 = 0;
        if (!z) {
            int measuredHeight = fuVar.getMeasuredHeight();
            int i3 = 0;
            for (int i4 = 0; i4 < fuVar.getChildCount(); i4++) {
                View childAt = fuVar.getChildAt(i4);
                if (RecyclerView.R(childAt) != -1) {
                    measuredHeight = Math.min(measuredHeight, childAt.getTop());
                    i3++;
                }
            }
            m27 m27Var = this.r;
            if (m27Var != null && i3 != 0 && i3 <= m27Var.f.size()) {
                int c = b00.c(4.0f, measuredHeight, 0);
                this.S = c;
                int measuredHeight2 = (fuVar.getMeasuredHeight() - this.S) + c;
                int i5 = gl.q.y;
                if (Build.VERSION.SDK_INT >= 35) {
                    i2 = gl.n;
                }
                this.S = Math.min(measuredHeight2 - ((int) ((((i5 - i2) * 0.8f) - this.a0) - gl.L(8.0f))), this.S);
            } else {
                this.S = 0;
            }
            float z2 = oo1.z(getMeasuredHeight() - gl.L(16.0f), (this.b.getMeasuredHeight() - this.S) + (this.a0 - gl.L(8.0f)), 2.0f, gl.L(8.0f)) - this.S;
            this.T = z2;
            if (z2 > gl.L(8.0f)) {
                this.T = gl.L(8.0f);
            }
            actionBarPopupWindow$ActionBarPopupWindowLayout.setTranslationX(getMeasuredWidth() - actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredWidth());
        } else {
            this.T = 0.0f;
            this.S = 0;
            actionBarPopupWindow$ActionBarPopupWindowLayout.setTranslationX(gl.L(8.0f) + fuVar.getMeasuredWidth());
        }
        if (!this.L) {
            if (this.S == i && this.T == f) {
                return;
            }
            ValueAnimator valueAnimator = l37Var.h;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            l37Var.h = ofFloat;
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                    float f2 = 1.0f - floatValue;
                    f37 f37Var = f37.this;
                    int i6 = (int) ((f37Var.S * floatValue) + (i * f2));
                    f37Var.U = i6;
                    f37Var.e((f37Var.T * floatValue) + (f * f2), i6);
                }
            });
            l37Var.h.setDuration(250L);
            l37Var.h.setInterpolator(la2.V);
            l37Var.h.addListener(new v85(this, (byte) 17));
            gl.e3(l37Var.E, 50L);
            this.U = i;
            e(f, i);
            return;
        }
        float f2 = this.T;
        int i6 = this.S;
        this.U = i6;
        e(f2, i6);
    }

    public final void k() {
        k27 k27Var;
        k27 k27Var2;
        l37 l37Var = this.d0;
        o27 o27Var = l37Var.d;
        if (this.a == 0) {
            z27 z27Var = this.e;
            if (z27Var.v - z27Var.u <= na7.q1(l37Var.x).k4.N1.f()) {
                mib mibVar = z27Var.W;
                if (mibVar != null) {
                    k27Var = ((gb2) mibVar).getMessageObject();
                } else {
                    k27Var = null;
                }
                k27 a = a(k27Var);
                if (o27Var.d != null && z27Var.w()) {
                    o27Var.e = z27Var.u;
                    o27Var.f = z27Var.v;
                    if (a != null) {
                        bu1 bu1Var = o27Var.d;
                        if (bu1Var.m || (k27Var2 = bu1Var.a) == null || k27Var2.e1() != a.e1()) {
                            o27Var.d = bu1.b(o27Var.e, o27Var.f, a);
                            l37Var.b();
                        }
                    }
                }
                z27Var.e(false);
            }
        }
    }

    public final void l(boolean z) {
        String str;
        int size;
        String M0;
        l37 l37Var = this.d0;
        TLRPC.User user = l37Var.n;
        o27 o27Var = l37Var.d;
        TLRPC.Chat chat = l37Var.r;
        s27 s27Var = this.c;
        int i = this.a;
        if (i == 1) {
            m27 m27Var = o27Var.b;
            if (m27Var == null) {
                size = 0;
            } else {
                size = m27Var.g.size();
            }
            s27Var.b(k96.G(size, "PreviewForwardMessagesCount", new Object[0]), z);
            if (!o27Var.h) {
                if (o27Var.m) {
                    if (user != null) {
                        M0 = k96.a0("ForwardPreviewSendersNameVisible", null, 2131750562, qu2.m(0, user.first_name, user.last_name));
                    } else if (hc2.T(chat) && !chat.megagroup) {
                        M0 = k96.M0(2131750561, null);
                    } else {
                        M0 = k96.M0(2131750560, null);
                    }
                } else if (user != null) {
                    M0 = k96.a0("ForwardPreviewSendersNameVisible", null, 2131750562, qu2.m(0, user.first_name, user.last_name));
                } else if (hc2.T(chat) && !chat.megagroup) {
                    M0 = k96.M0(2131750564, null);
                } else {
                    M0 = k96.M0(2131750563, null);
                }
            } else if (!o27Var.k) {
                if (user != null) {
                    M0 = k96.a0("ForwardPreviewSendersNameVisible", null, 2131750562, qu2.m(0, user.first_name, user.last_name));
                } else if (hc2.T(chat) && !chat.megagroup) {
                    M0 = k96.M0(2131750561, null);
                } else {
                    M0 = k96.M0(2131750560, null);
                }
            } else if (user != null) {
                M0 = k96.a0("ForwardPreviewSendersNameHidden", null, 2131750565, qu2.m(0, user.first_name, user.last_name));
            } else if (hc2.T(chat) && !chat.megagroup) {
                M0 = k96.M0(2131750564, null);
            } else {
                M0 = k96.M0(2131750563, null);
            }
            s27Var.a(M0, z);
        } else if (i == 0) {
            if (o27Var.d != null && o27Var.a.j) {
                s27Var.b(k96.M0(2131746689, null), z);
                s27Var.a(k96.M0(2131746688, null), z);
                return;
            }
            s27Var.b(k96.M0(2131748353, null), z);
            if (o27Var.a.j) {
                str = k96.M0(2131748354, null);
            } else {
                str = "";
            }
            s27Var.a(str, z);
        } else if (i == 2) {
            s27Var.b(k96.M0(2131748356, null), z);
            s27Var.a(k96.M0(2131748357, null), z);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.a == 0) {
            gl.d0(this.f, new hj3(this, (byte) 28));
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        k();
        this.c0 = true;
        this.L = true;
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        j();
        this.L = false;
    }

    @Override
    public final void onMeasure(int i, int i2) {
        boolean z;
        int size;
        if (View.MeasureSpec.getSize(i) > View.MeasureSpec.getSize(i2)) {
            z = true;
        } else {
            z = false;
        }
        l37 l37Var = this.d0;
        l37Var.w = z;
        this.a0 = 0;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i2), 0);
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.s;
        actionBarPopupWindow$ActionBarPopupWindowLayout.measure(i, makeMeasureSpec);
        int i3 = this.a0;
        int measuredHeight = actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredHeight();
        Rect rect = this.R;
        this.a0 = Math.max(i3, measuredHeight + rect.top + rect.bottom);
        ((ViewGroup.MarginLayoutParams) this.f.getLayoutParams()).topMargin = a.getCurrentActionBarHeight();
        boolean z2 = l37Var.w;
        n81 n81Var = this.b;
        if (z2) {
            n81Var.getLayoutParams().height = -1;
            ((ViewGroup.MarginLayoutParams) n81Var.getLayoutParams()).topMargin = gl.L(8.0f);
            ((ViewGroup.MarginLayoutParams) n81Var.getLayoutParams()).bottomMargin = gl.L(8.0f);
            n81Var.getLayoutParams().width = (int) Math.min(View.MeasureSpec.getSize(i), Math.max(gl.L(340.0f), View.MeasureSpec.getSize(i) * 0.6f));
            actionBarPopupWindow$ActionBarPopupWindowLayout.getLayoutParams().height = -1;
        } else {
            ((ViewGroup.MarginLayoutParams) n81Var.getLayoutParams()).topMargin = 0;
            ((ViewGroup.MarginLayoutParams) n81Var.getLayoutParams()).bottomMargin = 0;
            n81Var.getLayoutParams().height = (View.MeasureSpec.getSize(i2) - gl.L(6.0f)) - this.a0;
            if (n81Var.getLayoutParams().height < View.MeasureSpec.getSize(i2) * 0.5f) {
                n81Var.getLayoutParams().height = (int) (View.MeasureSpec.getSize(i2) * 0.5f);
            }
            n81Var.getLayoutParams().width = -1;
            actionBarPopupWindow$ActionBarPopupWindowLayout.getLayoutParams().height = View.MeasureSpec.getSize(i2) - n81Var.getLayoutParams().height;
        }
        int size2 = (View.MeasureSpec.getSize(i2) + View.MeasureSpec.getSize(i)) << 16;
        if (this.b0 != size2) {
            for (int i4 = 0; i4 < this.r.f.size(); i4++) {
                k27 k27Var = (k27) this.r.f.get(i4);
                if (l37Var.w) {
                    size = n81Var.getLayoutParams().width;
                } else {
                    size = View.MeasureSpec.getSize(i) - gl.L(16.0f);
                }
                k27Var.d2 = size;
                k27Var.S1 = false;
                k27Var.M1 = true;
                jr jrVar = this.n;
                if (jrVar != null) {
                    jrVar.f();
                }
            }
            this.L = true;
        }
        this.b0 = size2;
        super.onMeasure(i, i2);
    }
}
