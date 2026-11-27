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
public final class m57 extends FrameLayout {
    public static final int e0 = 0;
    public final b8 E;
    public final r57 F;
    public final FrameLayout G;
    public final r57 H;
    public final r57 I;
    public final int J;
    public final rx6 K;
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
    public final w81 b;
    public int b0;
    public final z47 c;
    public boolean c0;
    public final lmb d;
    public final s57 d0;
    public final g57 e;
    public final gu f;
    public final i57 h;
    public final kr n;
    public t47 r;
    public final ActionBarPopupWindow$ActionBarPopupWindowLayout s;
    public final f57 w;
    public final f57 x;
    public final b8 y;

    public m57(defpackage.s57 r40, android.content.Context r41, int r42) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m57.<init>(s57, android.content.Context, int):void");
    }

    public final r47 a(r47 r47Var) {
        m47 m47Var;
        v47 v47Var = this.d0.d;
        t47 t47Var = v47Var.a;
        if (t47Var != null) {
            LongSparseArray longSparseArray = t47Var.d;
            if (longSparseArray != null && longSparseArray.size() > 0 && (m47Var = (m47) v47Var.a.d.valueAt(0)) != null) {
                if (m47Var.i) {
                    if (r47Var != null) {
                        return r47Var;
                    }
                    ou1 ou1Var = v47Var.d;
                    if (ou1Var != null) {
                        return ou1Var.a;
                    }
                }
                return m47Var.h;
            }
            return (r47) v47Var.a.e.get(0);
        }
        return null;
    }

    public final View b() {
        View childAt;
        r47 a = a(null);
        if (a != null) {
            int i = 0;
            while (true) {
                gu guVar = this.f;
                if (i >= guVar.getChildCount()) {
                    break;
                }
                childAt = guVar.getChildAt(i);
                pk5 pk5Var = (pk5) childAt;
                if (pk5Var.getMessageObject() == null || (pk5Var.getMessageObject() != a && pk5Var.getMessageObject().e1() != a.e1())) {
                    i++;
                }
            }
            return childAt;
        }
        return null;
    }

    public final m47 c(r47 r47Var) {
        if (r47Var.c1() != 0) {
            m47 m47Var = (m47) this.r.d.get(r47Var.c1());
            if (m47Var == null || (m47Var.d.size() > 1 && m47Var.d(r47Var) != null)) {
                return m47Var;
            }
            return null;
        }
        return null;
    }

    public final boolean d(wb2 wb2Var) {
        r47 a;
        if (wb2Var != null && wb2Var.getMessageObject() != null && (a = a(null)) != null) {
            if (wb2Var.getMessageObject() == a || wb2Var.getMessageObject().e1() == a.e1()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void e(float f, int i) {
        boolean z = this.d0.w;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.s;
        w81 w81Var = this.b;
        z47 z47Var = this.c;
        if (z) {
            z47Var.setTranslationY(0.0f);
            w81Var.invalidateOutline();
            w81Var.setTranslationY(0.0f);
            actionBarPopupWindow$ActionBarPopupWindowLayout.setTranslationY(0.0f);
        } else {
            z47Var.setTranslationY(i);
            w81Var.invalidateOutline();
            w81Var.setTranslationY(f);
            actionBarPopupWindow$ActionBarPopupWindowLayout.setTranslationY((f + w81Var.getMeasuredHeight()) - hl.L(2.0f));
        }
        float x = w81Var.getX();
        lmb lmbVar = this.d;
        lmbVar.setTranslationX(x);
        lmbVar.setTranslationY(w81Var.getY());
    }

    public final void f() {
        s57 s57Var = this.d0;
        new d31(s57Var, s57Var.G).I(2131624012, ob6.M0(2131746164, null), ob6.M0(2131746163, null)).j();
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
            b8 b8Var = this.E;
            b8 b8Var2 = this.y;
            f57 f57Var = this.x;
            f57 f57Var2 = this.w;
            float f7 = 0.0f;
            if (z2) {
                this.Q = new AnimatorSet();
                ArrayList arrayList = new ArrayList();
                Property property = View.ALPHA;
                if (f57Var2 != null) {
                    f57Var2.setVisibility(0);
                    if (!z) {
                        f6 = 1.0f;
                    } else {
                        f6 = 0.0f;
                    }
                    arrayList.add(ObjectAnimator.ofFloat(f57Var2, property, f6));
                }
                if (f57Var != null) {
                    f57Var.setVisibility(0);
                    if (z) {
                        f5 = 1.0f;
                    } else {
                        f5 = 0.0f;
                    }
                    arrayList.add(ObjectAnimator.ofFloat(f57Var, property, f5));
                }
                if (b8Var2 != null) {
                    b8Var2.setVisibility(0);
                    if (!z) {
                        f4 = 1.0f;
                    } else {
                        f4 = 0.0f;
                    }
                    arrayList.add(ObjectAnimator.ofFloat(b8Var2, property, f4));
                }
                if (b8Var != null) {
                    b8Var.setVisibility(0);
                    if (z) {
                        f7 = 1.0f;
                    }
                    arrayList.add(ObjectAnimator.ofFloat(b8Var, property, f7));
                }
                this.Q.playTogether(arrayList);
                this.Q.setDuration(360L);
                this.Q.setInterpolator(k43.h);
                this.Q.addListener(new gf4((byte) 14, this, z));
                this.Q.start();
                return;
            }
            if (f57Var2 != null) {
                if (!z) {
                    f3 = 1.0f;
                } else {
                    f3 = 0.0f;
                }
                f57Var2.setAlpha(f3);
                if (!z) {
                    i3 = 0;
                } else {
                    i3 = 4;
                }
                f57Var2.setVisibility(i3);
            }
            if (f57Var != null) {
                if (z) {
                    f2 = 1.0f;
                } else {
                    f2 = 0.0f;
                }
                f57Var.setAlpha(f2);
                if (z) {
                    i2 = 0;
                } else {
                    i2 = 4;
                }
                f57Var.setVisibility(i2);
            }
            if (b8Var2 != null) {
                if (!z) {
                    f = 1.0f;
                } else {
                    f = 0.0f;
                }
                b8Var2.setAlpha(f);
                if (!z) {
                    i = 0;
                } else {
                    i = 4;
                }
                b8Var2.setVisibility(i);
            }
            if (b8Var != null) {
                if (z) {
                    f7 = 1.0f;
                }
                b8Var.setAlpha(f7);
                if (!z) {
                    i4 = 4;
                }
                b8Var.setVisibility(i4);
            }
        }
    }

    public final void h(wb2 wb2Var) {
        URLSpan uRLSpan;
        TLRPC.WebPage webPage;
        if (this.a == 2) {
            v47 v47Var = this.d0.d;
            if (!v47Var.n && (uRLSpan = v47Var.w) != null && (webPage = v47Var.v) != null && !(webPage instanceof TLRPC.TL_webPagePending)) {
                wb2Var.t3(uRLSpan);
                return;
            }
        }
        wb2Var.t3(null);
    }

    public final void i() {
        int i;
        int i2;
        s57 s57Var = this.d0;
        v47 v47Var = s57Var.d;
        i57 i57Var = this.h;
        if (i57Var.k()) {
            this.W = true;
            return;
        }
        for (int i3 = 0; i3 < this.r.f.size(); i3++) {
            r47 r47Var = (r47) this.r.f.get(i3);
            r47Var.M1 = true;
            r47Var.h2 = s57Var.a;
            boolean z = v47Var.k;
            TLRPC.Message message = r47Var.k;
            if (!z) {
                i = message.flags | 4;
                message.flags = i;
                r47Var.g2 = false;
            } else {
                i = message.flags & (-5);
                message.flags = i;
                r47Var.g2 = true;
            }
            if (this.a == 2) {
                TLRPC.WebPage webPage = v47Var.v;
                if (webPage != null) {
                    TLRPC.MessageMedia messageMedia = message.media;
                    if (messageMedia == null || messageMedia.webpage != webPage) {
                        message.flags = i | 512;
                        message.media = new TLRPC.TL_messageMediaWebPage();
                        TLRPC.MessageMedia messageMedia2 = r47Var.k.media;
                        messageMedia2.webpage = v47Var.v;
                        boolean z2 = v47Var.q;
                        messageMedia2.force_large_media = !z2;
                        messageMedia2.force_small_media = z2;
                        messageMedia2.manual = true;
                        r47Var.y = null;
                        r47Var.o0();
                        r47Var.p0 = null;
                        r47Var.q0 = null;
                        r47Var.n0 = null;
                        r47Var.o0 = null;
                        r47Var.r0(true);
                        r47Var.K(true);
                    }
                } else {
                    message.flags = i & (-513);
                    message.media = null;
                }
            }
            if (v47Var.l) {
                r47Var.z = null;
            } else {
                r47Var.k0();
            }
            if (r47Var.S3()) {
                u47 u47Var = (u47) r47Var.k.media;
                TLRPC.PollResults pollResults = u47Var.results;
                if (v47Var.l) {
                    i2 = 0;
                } else {
                    i2 = u47Var.a;
                }
                pollResults.total_voters = i2;
            }
        }
        for (int i4 = 0; i4 < this.r.h.size(); i4++) {
            ((TLRPC.PollAnswerVoters) this.r.h.get(i4)).chosen = !v47Var.k;
        }
        for (int i5 = 0; i5 < this.r.d.size(); i5++) {
            i57Var.U((m47) this.r.d.valueAt(i5));
        }
        this.n.l(0, this.r.f.size());
    }

    public final void j() {
        final int i = this.S;
        final float f = this.T;
        s57 s57Var = this.d0;
        boolean z = s57Var.w;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.s;
        gu guVar = this.f;
        int i2 = 0;
        if (!z) {
            int measuredHeight = guVar.getMeasuredHeight();
            int i3 = 0;
            for (int i4 = 0; i4 < guVar.getChildCount(); i4++) {
                View childAt = guVar.getChildAt(i4);
                if (RecyclerView.S(childAt) != -1) {
                    measuredHeight = Math.min(measuredHeight, childAt.getTop());
                    i3++;
                }
            }
            t47 t47Var = this.r;
            if (t47Var != null && i3 != 0 && i3 <= t47Var.f.size()) {
                int d = c00.d(4.0f, measuredHeight, 0);
                this.S = d;
                int measuredHeight2 = (guVar.getMeasuredHeight() - this.S) + d;
                int i5 = hl.q.y;
                if (Build.VERSION.SDK_INT >= 35) {
                    i2 = hl.n;
                }
                this.S = Math.min(measuredHeight2 - ((int) ((((i5 - i2) * 0.8f) - this.a0) - hl.L(8.0f))), this.S);
            } else {
                this.S = 0;
            }
            float z2 = bp1.z(getMeasuredHeight() - hl.L(16.0f), (this.b.getMeasuredHeight() - this.S) + (this.a0 - hl.L(8.0f)), 2.0f, hl.L(8.0f)) - this.S;
            this.T = z2;
            if (z2 > hl.L(8.0f)) {
                this.T = hl.L(8.0f);
            }
            actionBarPopupWindow$ActionBarPopupWindowLayout.setTranslationX(getMeasuredWidth() - actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredWidth());
        } else {
            this.T = 0.0f;
            this.S = 0;
            actionBarPopupWindow$ActionBarPopupWindowLayout.setTranslationX(hl.L(8.0f) + guVar.getMeasuredWidth());
        }
        if (!this.L) {
            if (this.S == i && this.T == f) {
                return;
            }
            ValueAnimator valueAnimator = s57Var.h;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            s57Var.h = ofFloat;
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                    float f2 = 1.0f - floatValue;
                    m57 m57Var = m57.this;
                    int i6 = (int) ((m57Var.S * floatValue) + (i * f2));
                    m57Var.U = i6;
                    m57Var.e((m57Var.T * floatValue) + (f * f2), i6);
                }
            });
            s57Var.h.setDuration(250L);
            s57Var.h.setInterpolator(bb2.V);
            s57Var.h.addListener(new ad5(this, (byte) 16));
            hl.d3(s57Var.E, 50L);
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
        r47 r47Var;
        r47 r47Var2;
        s57 s57Var = this.d0;
        v47 v47Var = s57Var.d;
        if (this.a == 0) {
            g57 g57Var = this.e;
            if (g57Var.v - g57Var.u <= uc7.s1(s57Var.x).k4.V1.f()) {
                hmb hmbVar = g57Var.W;
                if (hmbVar != null) {
                    r47Var = ((wb2) hmbVar).getMessageObject();
                } else {
                    r47Var = null;
                }
                r47 a = a(r47Var);
                if (v47Var.d != null && g57Var.w()) {
                    v47Var.e = g57Var.u;
                    v47Var.f = g57Var.v;
                    if (a != null) {
                        ou1 ou1Var = v47Var.d;
                        if (ou1Var.m || (r47Var2 = ou1Var.a) == null || r47Var2.e1() != a.e1()) {
                            v47Var.d = ou1.b(v47Var.e, v47Var.f, a);
                            s57Var.b();
                        }
                    }
                }
                g57Var.e(false);
            }
        }
    }

    public final void l(boolean z) {
        String str;
        int size;
        String M0;
        s57 s57Var = this.d0;
        TLRPC.User user = s57Var.n;
        v47 v47Var = s57Var.d;
        TLRPC.Chat chat = s57Var.r;
        z47 z47Var = this.c;
        int i = this.a;
        if (i == 1) {
            t47 t47Var = v47Var.b;
            if (t47Var == null) {
                size = 0;
            } else {
                size = t47Var.g.size();
            }
            z47Var.b(ob6.G(size, "PreviewForwardMessagesCount", new Object[0]), z);
            if (!v47Var.h) {
                if (v47Var.m) {
                    if (user != null) {
                        M0 = ob6.a0("ForwardPreviewSendersNameVisible", null, 2131750539, lv2.m(0, user.first_name, user.last_name));
                    } else if (xc2.T(chat) && !chat.megagroup) {
                        M0 = ob6.M0(2131750538, null);
                    } else {
                        M0 = ob6.M0(2131750537, null);
                    }
                } else if (user != null) {
                    M0 = ob6.a0("ForwardPreviewSendersNameVisible", null, 2131750539, lv2.m(0, user.first_name, user.last_name));
                } else if (xc2.T(chat) && !chat.megagroup) {
                    M0 = ob6.M0(2131750541, null);
                } else {
                    M0 = ob6.M0(2131750540, null);
                }
            } else if (!v47Var.k) {
                if (user != null) {
                    M0 = ob6.a0("ForwardPreviewSendersNameVisible", null, 2131750539, lv2.m(0, user.first_name, user.last_name));
                } else if (xc2.T(chat) && !chat.megagroup) {
                    M0 = ob6.M0(2131750538, null);
                } else {
                    M0 = ob6.M0(2131750537, null);
                }
            } else if (user != null) {
                M0 = ob6.a0("ForwardPreviewSendersNameHidden", null, 2131750542, lv2.m(0, user.first_name, user.last_name));
            } else if (xc2.T(chat) && !chat.megagroup) {
                M0 = ob6.M0(2131750541, null);
            } else {
                M0 = ob6.M0(2131750540, null);
            }
            z47Var.a(M0, z);
        } else if (i == 0) {
            if (v47Var.d != null && v47Var.a.j) {
                z47Var.b(ob6.M0(2131746609, null), z);
                z47Var.a(ob6.M0(2131746608, null), z);
                return;
            }
            z47Var.b(ob6.M0(2131748299, null), z);
            if (v47Var.a.j) {
                str = ob6.M0(2131748300, null);
            } else {
                str = "";
            }
            z47Var.a(str, z);
        } else if (i == 2) {
            z47Var.b(ob6.M0(2131748302, null), z);
            z47Var.a(ob6.M0(2131748303, null), z);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.a == 0) {
            hl.d0(this.f, new zj3(this, (byte) 28));
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
        s57 s57Var = this.d0;
        s57Var.w = z;
        this.a0 = 0;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i2), 0);
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.s;
        actionBarPopupWindow$ActionBarPopupWindowLayout.measure(i, makeMeasureSpec);
        int i3 = this.a0;
        int measuredHeight = actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredHeight();
        Rect rect = this.R;
        this.a0 = Math.max(i3, measuredHeight + rect.top + rect.bottom);
        ((ViewGroup.MarginLayoutParams) this.f.getLayoutParams()).topMargin = a.getCurrentActionBarHeight();
        boolean z2 = s57Var.w;
        w81 w81Var = this.b;
        if (z2) {
            w81Var.getLayoutParams().height = -1;
            ((ViewGroup.MarginLayoutParams) w81Var.getLayoutParams()).topMargin = hl.L(8.0f);
            ((ViewGroup.MarginLayoutParams) w81Var.getLayoutParams()).bottomMargin = hl.L(8.0f);
            w81Var.getLayoutParams().width = (int) Math.min(View.MeasureSpec.getSize(i), Math.max(hl.L(340.0f), View.MeasureSpec.getSize(i) * 0.6f));
            actionBarPopupWindow$ActionBarPopupWindowLayout.getLayoutParams().height = -1;
        } else {
            ((ViewGroup.MarginLayoutParams) w81Var.getLayoutParams()).topMargin = 0;
            ((ViewGroup.MarginLayoutParams) w81Var.getLayoutParams()).bottomMargin = 0;
            w81Var.getLayoutParams().height = (View.MeasureSpec.getSize(i2) - hl.L(6.0f)) - this.a0;
            if (w81Var.getLayoutParams().height < View.MeasureSpec.getSize(i2) * 0.5f) {
                w81Var.getLayoutParams().height = (int) (View.MeasureSpec.getSize(i2) * 0.5f);
            }
            w81Var.getLayoutParams().width = -1;
            actionBarPopupWindow$ActionBarPopupWindowLayout.getLayoutParams().height = View.MeasureSpec.getSize(i2) - w81Var.getLayoutParams().height;
        }
        int size2 = (View.MeasureSpec.getSize(i2) + View.MeasureSpec.getSize(i)) << 16;
        if (this.b0 != size2) {
            for (int i4 = 0; i4 < this.r.f.size(); i4++) {
                r47 r47Var = (r47) this.r.f.get(i4);
                if (s57Var.w) {
                    size = w81Var.getLayoutParams().width;
                } else {
                    size = View.MeasureSpec.getSize(i) - hl.L(16.0f);
                }
                r47Var.d2 = size;
                r47Var.S1 = false;
                r47Var.M1 = true;
                kr krVar = this.n;
                if (krVar != null) {
                    krVar.f();
                }
            }
            this.L = true;
        }
        this.b0 = size2;
        super.onMeasure(i, i2);
    }
}
