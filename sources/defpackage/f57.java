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
public final class f57 extends FrameLayout {
    public static final int e0 = 0;
    public final a8 E;
    public final k57 F;
    public final FrameLayout G;
    public final k57 H;
    public final k57 I;
    public final int J;
    public final mx6 K;
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
    public final w91 b;
    public int b0;
    public final s47 c;
    public boolean c0;
    public final rkb d;
    public final l57 d0;
    public final z47 e;
    public final fv f;
    public final b57 h;
    public final js n;
    public m47 r;
    public final ActionBarPopupWindow$ActionBarPopupWindowLayout s;
    public final y47 w;
    public final y47 x;
    public final a8 y;

    public f57(defpackage.l57 r40, android.content.Context r41, int r42) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.f57.<init>(l57, android.content.Context, int):void");
    }

    public final k47 a(k47 k47Var) {
        f47 f47Var;
        o47 o47Var = this.d0.d;
        m47 m47Var = o47Var.a;
        if (m47Var != null) {
            LongSparseArray longSparseArray = m47Var.d;
            if (longSparseArray != null && longSparseArray.size() > 0 && (f47Var = (f47) o47Var.a.d.valueAt(0)) != null) {
                if (f47Var.i) {
                    if (k47Var != null) {
                        return k47Var;
                    }
                    nv1 nv1Var = o47Var.d;
                    if (nv1Var != null) {
                        return nv1Var.a;
                    }
                }
                return f47Var.h;
            }
            return (k47) o47Var.a.e.get(0);
        }
        return null;
    }

    public final View b() {
        View childAt;
        k47 a = a(null);
        if (a != null) {
            int i = 0;
            while (true) {
                fv fvVar = this.f;
                if (i >= fvVar.getChildCount()) {
                    break;
                }
                childAt = fvVar.getChildAt(i);
                mk5 mk5Var = (mk5) childAt;
                if (mk5Var.getMessageObject() == null || (mk5Var.getMessageObject() != a && mk5Var.getMessageObject().e1() != a.e1())) {
                    i++;
                }
            }
            return childAt;
        }
        return null;
    }

    public final f47 c(k47 k47Var) {
        if (k47Var.c1() != 0) {
            f47 f47Var = (f47) this.r.d.get(k47Var.c1());
            if (f47Var == null || (f47Var.d.size() > 1 && f47Var.d(k47Var) != null)) {
                return f47Var;
            }
            return null;
        }
        return null;
    }

    public final boolean d(rc2 rc2Var) {
        k47 a;
        if (rc2Var != null && rc2Var.getMessageObject() != null && (a = a(null)) != null) {
            if (rc2Var.getMessageObject() == a || rc2Var.getMessageObject().e1() == a.e1()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void e(float f, int i) {
        boolean z = this.d0.w;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.s;
        w91 w91Var = this.b;
        s47 s47Var = this.c;
        if (z) {
            s47Var.setTranslationY(0.0f);
            w91Var.invalidateOutline();
            w91Var.setTranslationY(0.0f);
            actionBarPopupWindow$ActionBarPopupWindowLayout.setTranslationY(0.0f);
        } else {
            s47Var.setTranslationY(i);
            w91Var.invalidateOutline();
            w91Var.setTranslationY(f);
            actionBarPopupWindow$ActionBarPopupWindowLayout.setTranslationY((f + w91Var.getMeasuredHeight()) - gm.L(2.0f));
        }
        float x = w91Var.getX();
        rkb rkbVar = this.d;
        rkbVar.setTranslationX(x);
        rkbVar.setTranslationY(w91Var.getY());
    }

    public final void f() {
        l57 l57Var = this.d0;
        new c41(l57Var, l57Var.G).I(2131624012, jb6.M0(2131746170, null), jb6.M0(2131746169, null)).j();
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
            y47 y47Var = this.x;
            y47 y47Var2 = this.w;
            float f7 = 0.0f;
            if (z2) {
                this.Q = new AnimatorSet();
                ArrayList arrayList = new ArrayList();
                Property property = View.ALPHA;
                if (y47Var2 != null) {
                    y47Var2.setVisibility(0);
                    if (!z) {
                        f6 = 1.0f;
                    } else {
                        f6 = 0.0f;
                    }
                    arrayList.add(ObjectAnimator.ofFloat(y47Var2, property, f6));
                }
                if (y47Var != null) {
                    y47Var.setVisibility(0);
                    if (z) {
                        f5 = 1.0f;
                    } else {
                        f5 = 0.0f;
                    }
                    arrayList.add(ObjectAnimator.ofFloat(y47Var, property, f5));
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
                this.Q.setInterpolator(d53.h);
                this.Q.addListener(new jf4((byte) 14, this, z));
                this.Q.start();
                return;
            }
            if (y47Var2 != null) {
                if (!z) {
                    f3 = 1.0f;
                } else {
                    f3 = 0.0f;
                }
                y47Var2.setAlpha(f3);
                if (!z) {
                    i3 = 0;
                } else {
                    i3 = 4;
                }
                y47Var2.setVisibility(i3);
            }
            if (y47Var != null) {
                if (z) {
                    f2 = 1.0f;
                } else {
                    f2 = 0.0f;
                }
                y47Var.setAlpha(f2);
                if (z) {
                    i2 = 0;
                } else {
                    i2 = 4;
                }
                y47Var.setVisibility(i2);
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

    public final void h(rc2 rc2Var) {
        URLSpan uRLSpan;
        TLRPC.WebPage webPage;
        if (this.a == 2) {
            o47 o47Var = this.d0.d;
            if (!o47Var.n && (uRLSpan = o47Var.w) != null && (webPage = o47Var.v) != null && !(webPage instanceof TLRPC.TL_webPagePending)) {
                rc2Var.t3(uRLSpan);
                return;
            }
        }
        rc2Var.t3(null);
    }

    public final void i() {
        int i;
        int i2;
        l57 l57Var = this.d0;
        o47 o47Var = l57Var.d;
        b57 b57Var = this.h;
        if (b57Var.k()) {
            this.W = true;
            return;
        }
        for (int i3 = 0; i3 < this.r.f.size(); i3++) {
            k47 k47Var = (k47) this.r.f.get(i3);
            k47Var.M1 = true;
            k47Var.h2 = l57Var.a;
            boolean z = o47Var.k;
            TLRPC.Message message = k47Var.k;
            if (!z) {
                i = message.flags | 4;
                message.flags = i;
                k47Var.g2 = false;
            } else {
                i = message.flags & (-5);
                message.flags = i;
                k47Var.g2 = true;
            }
            if (this.a == 2) {
                TLRPC.WebPage webPage = o47Var.v;
                if (webPage != null) {
                    TLRPC.MessageMedia messageMedia = message.media;
                    if (messageMedia == null || messageMedia.webpage != webPage) {
                        message.flags = i | 512;
                        message.media = new TLRPC.TL_messageMediaWebPage();
                        TLRPC.MessageMedia messageMedia2 = k47Var.k.media;
                        messageMedia2.webpage = o47Var.v;
                        boolean z2 = o47Var.q;
                        messageMedia2.force_large_media = !z2;
                        messageMedia2.force_small_media = z2;
                        messageMedia2.manual = true;
                        k47Var.y = null;
                        k47Var.o0();
                        k47Var.p0 = null;
                        k47Var.q0 = null;
                        k47Var.n0 = null;
                        k47Var.o0 = null;
                        k47Var.r0(true);
                        k47Var.K(true);
                    }
                } else {
                    message.flags = i & (-513);
                    message.media = null;
                }
            }
            if (o47Var.l) {
                k47Var.z = null;
            } else {
                k47Var.k0();
            }
            if (k47Var.S3()) {
                n47 n47Var = (n47) k47Var.k.media;
                TLRPC.PollResults pollResults = n47Var.results;
                if (o47Var.l) {
                    i2 = 0;
                } else {
                    i2 = n47Var.a;
                }
                pollResults.total_voters = i2;
            }
        }
        for (int i4 = 0; i4 < this.r.h.size(); i4++) {
            ((TLRPC.PollAnswerVoters) this.r.h.get(i4)).chosen = !o47Var.k;
        }
        for (int i5 = 0; i5 < this.r.d.size(); i5++) {
            b57Var.U((f47) this.r.d.valueAt(i5));
        }
        this.n.l(0, this.r.f.size());
    }

    public final void j() {
        final int i = this.S;
        final float f = this.T;
        l57 l57Var = this.d0;
        boolean z = l57Var.w;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.s;
        fv fvVar = this.f;
        int i2 = 0;
        if (!z) {
            int measuredHeight = fvVar.getMeasuredHeight();
            int i3 = 0;
            for (int i4 = 0; i4 < fvVar.getChildCount(); i4++) {
                View childAt = fvVar.getChildAt(i4);
                if (RecyclerView.R(childAt) != -1) {
                    measuredHeight = Math.min(measuredHeight, childAt.getTop());
                    i3++;
                }
            }
            m47 m47Var = this.r;
            if (m47Var != null && i3 != 0 && i3 <= m47Var.f.size()) {
                int c = b10.c(4.0f, measuredHeight, 0);
                this.S = c;
                int measuredHeight2 = (fvVar.getMeasuredHeight() - this.S) + c;
                int i5 = gm.q.y;
                if (Build.VERSION.SDK_INT >= 35) {
                    i2 = gm.n;
                }
                this.S = Math.min(measuredHeight2 - ((int) ((((i5 - i2) * 0.8f) - this.a0) - gm.L(8.0f))), this.S);
            } else {
                this.S = 0;
            }
            float z2 = aq1.z(getMeasuredHeight() - gm.L(16.0f), (this.b.getMeasuredHeight() - this.S) + (this.a0 - gm.L(8.0f)), 2.0f, gm.L(8.0f)) - this.S;
            this.T = z2;
            if (z2 > gm.L(8.0f)) {
                this.T = gm.L(8.0f);
            }
            actionBarPopupWindow$ActionBarPopupWindowLayout.setTranslationX(getMeasuredWidth() - actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredWidth());
        } else {
            this.T = 0.0f;
            this.S = 0;
            actionBarPopupWindow$ActionBarPopupWindowLayout.setTranslationX(gm.L(8.0f) + fvVar.getMeasuredWidth());
        }
        if (!this.L) {
            if (this.S == i && this.T == f) {
                return;
            }
            ValueAnimator valueAnimator = l57Var.h;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            l57Var.h = ofFloat;
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                    float f2 = 1.0f - floatValue;
                    f57 f57Var = f57.this;
                    int i6 = (int) ((f57Var.S * floatValue) + (i * f2));
                    f57Var.U = i6;
                    f57Var.e((f57Var.T * floatValue) + (f * f2), i6);
                }
            });
            l57Var.h.setDuration(250L);
            l57Var.h.setInterpolator(wb2.V);
            l57Var.h.addListener(new v85(this, (byte) 19));
            gm.d3(l57Var.E, 50L);
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
        k47 k47Var;
        k47 k47Var2;
        l57 l57Var = this.d0;
        o47 o47Var = l57Var.d;
        if (this.a == 0) {
            z47 z47Var = this.e;
            if (z47Var.v - z47Var.u <= oc7.r1(l57Var.x).l4.N1.f()) {
                nkb nkbVar = z47Var.W;
                if (nkbVar != null) {
                    k47Var = ((rc2) nkbVar).getMessageObject();
                } else {
                    k47Var = null;
                }
                k47 a = a(k47Var);
                if (o47Var.d != null && z47Var.w()) {
                    o47Var.e = z47Var.u;
                    o47Var.f = z47Var.v;
                    if (a != null) {
                        nv1 nv1Var = o47Var.d;
                        if (nv1Var.m || (k47Var2 = nv1Var.a) == null || k47Var2.e1() != a.e1()) {
                            o47Var.d = nv1.b(o47Var.e, o47Var.f, a);
                            l57Var.b();
                        }
                    }
                }
                z47Var.e(false);
            }
        }
    }

    public final void l(boolean z) {
        String str;
        int size;
        String M0;
        l57 l57Var = this.d0;
        TLRPC.User user = l57Var.n;
        o47 o47Var = l57Var.d;
        TLRPC.Chat chat = l57Var.r;
        s47 s47Var = this.c;
        int i = this.a;
        if (i == 1) {
            m47 m47Var = o47Var.b;
            if (m47Var == null) {
                size = 0;
            } else {
                size = m47Var.g.size();
            }
            s47Var.b(jb6.G(size, "PreviewForwardMessagesCount", new Object[0]), z);
            if (!o47Var.h) {
                if (o47Var.m) {
                    if (user != null) {
                        M0 = jb6.a0("ForwardPreviewSendersNameVisible", null, 2131750511, bw2.m(0, user.first_name, user.last_name));
                    } else if (sd2.T(chat) && !chat.megagroup) {
                        M0 = jb6.M0(2131750510, null);
                    } else {
                        M0 = jb6.M0(2131750509, null);
                    }
                } else if (user != null) {
                    M0 = jb6.a0("ForwardPreviewSendersNameVisible", null, 2131750511, bw2.m(0, user.first_name, user.last_name));
                } else if (sd2.T(chat) && !chat.megagroup) {
                    M0 = jb6.M0(2131750513, null);
                } else {
                    M0 = jb6.M0(2131750512, null);
                }
            } else if (!o47Var.k) {
                if (user != null) {
                    M0 = jb6.a0("ForwardPreviewSendersNameVisible", null, 2131750511, bw2.m(0, user.first_name, user.last_name));
                } else if (sd2.T(chat) && !chat.megagroup) {
                    M0 = jb6.M0(2131750510, null);
                } else {
                    M0 = jb6.M0(2131750509, null);
                }
            } else if (user != null) {
                M0 = jb6.a0("ForwardPreviewSendersNameHidden", null, 2131750514, bw2.m(0, user.first_name, user.last_name));
            } else if (sd2.T(chat) && !chat.megagroup) {
                M0 = jb6.M0(2131750513, null);
            } else {
                M0 = jb6.M0(2131750512, null);
            }
            s47Var.a(M0, z);
        } else if (i == 0) {
            if (o47Var.d != null && o47Var.a.j) {
                s47Var.b(jb6.M0(2131746615, null), z);
                s47Var.a(jb6.M0(2131746614, null), z);
                return;
            }
            s47Var.b(jb6.M0(2131748302, null), z);
            if (o47Var.a.j) {
                str = jb6.M0(2131748303, null);
            } else {
                str = "";
            }
            s47Var.a(str, z);
        } else if (i == 2) {
            s47Var.b(jb6.M0(2131748305, null), z);
            s47Var.a(jb6.M0(2131748306, null), z);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.a == 0) {
            gm.d0(this.f, new sk3(this, (byte) 28));
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
        l57 l57Var = this.d0;
        l57Var.w = z;
        this.a0 = 0;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i2), 0);
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.s;
        actionBarPopupWindow$ActionBarPopupWindowLayout.measure(i, makeMeasureSpec);
        int i3 = this.a0;
        int measuredHeight = actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredHeight();
        Rect rect = this.R;
        this.a0 = Math.max(i3, measuredHeight + rect.top + rect.bottom);
        ((ViewGroup.MarginLayoutParams) this.f.getLayoutParams()).topMargin = a.getCurrentActionBarHeight();
        boolean z2 = l57Var.w;
        w91 w91Var = this.b;
        if (z2) {
            w91Var.getLayoutParams().height = -1;
            ((ViewGroup.MarginLayoutParams) w91Var.getLayoutParams()).topMargin = gm.L(8.0f);
            ((ViewGroup.MarginLayoutParams) w91Var.getLayoutParams()).bottomMargin = gm.L(8.0f);
            w91Var.getLayoutParams().width = (int) Math.min(View.MeasureSpec.getSize(i), Math.max(gm.L(340.0f), View.MeasureSpec.getSize(i) * 0.6f));
            actionBarPopupWindow$ActionBarPopupWindowLayout.getLayoutParams().height = -1;
        } else {
            ((ViewGroup.MarginLayoutParams) w91Var.getLayoutParams()).topMargin = 0;
            ((ViewGroup.MarginLayoutParams) w91Var.getLayoutParams()).bottomMargin = 0;
            w91Var.getLayoutParams().height = (View.MeasureSpec.getSize(i2) - gm.L(6.0f)) - this.a0;
            if (w91Var.getLayoutParams().height < View.MeasureSpec.getSize(i2) * 0.5f) {
                w91Var.getLayoutParams().height = (int) (View.MeasureSpec.getSize(i2) * 0.5f);
            }
            w91Var.getLayoutParams().width = -1;
            actionBarPopupWindow$ActionBarPopupWindowLayout.getLayoutParams().height = View.MeasureSpec.getSize(i2) - w91Var.getLayoutParams().height;
        }
        int size2 = (View.MeasureSpec.getSize(i2) + View.MeasureSpec.getSize(i)) << 16;
        if (this.b0 != size2) {
            for (int i4 = 0; i4 < this.r.f.size(); i4++) {
                k47 k47Var = (k47) this.r.f.get(i4);
                if (l57Var.w) {
                    size = w91Var.getLayoutParams().width;
                } else {
                    size = View.MeasureSpec.getSize(i) - gm.L(16.0f);
                }
                k47Var.d2 = size;
                k47Var.S1 = false;
                k47Var.M1 = true;
                js jsVar = this.n;
                if (jsVar != null) {
                    jsVar.f();
                }
            }
            this.L = true;
        }
        this.b0 = size2;
        super.onMeasure(i, i2);
    }
}
