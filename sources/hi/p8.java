package hi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.FrameLayout;
import java.util.HashSet;
import org.telegram.messenger.hd;
import org.telegram.messenger.m10;
import org.telegram.messenger.ns;
import org.telegram.messenger.q10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.RadioButton;
import org.telegram.ui.Components.eq;
import org.telegram.ui.Components.fp;
public final class p8 extends FrameLayout implements org.telegram.ui.ActionBar.z5 {
    public boolean E;
    public Path F;
    public Paint G;
    public final org.telegram.ui.ActionBar.e6 f14870a;
    public final org.telegram.ui.Components.t8 f14871b;
    public final org.telegram.ui.Components.i9 f14872c;
    public final org.telegram.ui.ActionBar.j5 d;
    public final org.telegram.ui.ActionBar.j5 f14873e;
    public final fp f14874f;
    public final RadioButton h;
    public final Paint f14875n;
    public boolean f14876r;
    public boolean f14877s;
    public boolean f14878w;
    public final boolean[] f14879x;
    public long f14880y;

    public p8(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        int i7;
        org.telegram.ui.Components.t8 t8Var = new org.telegram.ui.Components.t8((org.telegram.ui.ActionBar.e6) null);
        this.f14871b = t8Var;
        this.f14875n = new Paint(1);
        this.f14876r = false;
        this.f14877s = true;
        this.f14878w = true;
        this.f14879x = new boolean[1];
        this.f14870a = e6Var;
        t8Var.f39602r = org.telegram.messenger.g0.L(40.0f);
        org.telegram.ui.Components.i9 i9Var = new org.telegram.ui.Components.i9(context);
        this.f14872c = i9Var;
        i9Var.setRoundRadius(org.telegram.messenger.g0.L(20.0f));
        addView(i9Var);
        org.telegram.ui.ActionBar.j5 j5Var = new org.telegram.ui.ActionBar.j5(context);
        this.d = j5Var;
        j5Var.setTypeface(org.telegram.messenger.g0.o());
        j5Var.setTextSize(16);
        int i10 = org.telegram.ui.ActionBar.j6.f28957j5;
        org.telegram.ui.ActionBar.q6.X(j5Var, i10, e6Var);
        if (hd.f24101a0) {
            i7 = 5;
        } else {
            i7 = 3;
        }
        j5Var.setGravity(i7);
        ns.i(j5Var);
        addView(j5Var);
        org.telegram.ui.ActionBar.j5 j5Var2 = new org.telegram.ui.ActionBar.j5(context);
        this.f14873e = j5Var2;
        j5Var2.setTextSize(14);
        org.telegram.ui.ActionBar.q6.X(j5Var2, i10, e6Var);
        j5Var2.setGravity(hd.f24101a0 ? 5 : 3);
        ns.i(j5Var2);
        addView(j5Var2);
        fp fpVar = new fp(21, context, e6Var);
        this.f14874f = fpVar;
        int i11 = org.telegram.ui.ActionBar.j6.B5;
        int i12 = org.telegram.ui.ActionBar.j6.f28959j7;
        fpVar.b(i11, i12, org.telegram.ui.ActionBar.j6.C5);
        fpVar.setDrawUnchecked(true);
        fpVar.setDrawBackgroundAsArc(10);
        addView(fpVar);
        fpVar.a(false, false);
        fpVar.setVisibility(8);
        RadioButton radioButton = new RadioButton(context);
        this.h = radioButton;
        radioButton.setSize(org.telegram.messenger.g0.L(20.0f));
        org.telegram.ui.ActionBar.q6.O(radioButton, i12, org.telegram.ui.ActionBar.j6.E5, e6Var);
        addView(radioButton);
        radioButton.setVisibility(8);
        f();
    }

    private void setSubtitle(CharSequence charSequence) {
        org.telegram.ui.ActionBar.j5 j5Var = this.d;
        org.telegram.ui.ActionBar.j5 j5Var2 = this.f14873e;
        if (charSequence == null) {
            j5Var.setTranslationY(0.0f);
            j5Var2.setVisibility(8);
            return;
        }
        j5Var.setTranslationY(org.telegram.messenger.g0.L(-9.0f));
        j5Var2.setTranslationY(org.telegram.messenger.g0.L(12.0f));
        j5Var2.l(charSequence, false);
        j5Var2.setVisibility(0);
    }

    public final void a(int i7, TLRPC.Chat chat) {
        long j3;
        float f10;
        String lowerCase;
        int i10;
        int i11;
        float f11;
        int i12;
        if (chat == null) {
            j3 = 0;
        } else {
            j3 = -chat.f28051id;
        }
        this.f14880y = j3;
        org.telegram.ui.Components.t8 t8Var = this.f14871b;
        t8Var.q(chat);
        if (org.telegram.messenger.t3.c0(chat)) {
            f10 = 12.0f;
        } else {
            f10 = 20.0f;
        }
        int L = org.telegram.messenger.g0.L(f10);
        org.telegram.ui.Components.i9 i9Var = this.f14872c;
        i9Var.setRoundRadius(L);
        i9Var.f(chat, t8Var);
        String str = chat.title;
        org.telegram.ui.ActionBar.j5 j5Var = this.d;
        j5Var.l(org.telegram.messenger.j6.m(str, j5Var.getPaint().getFontMetricsInt(), false, null, 0), false);
        boolean[] zArr = this.f14879x;
        zArr[0] = false;
        String str2 = "Members";
        if (this.f14876r) {
            if (i7 <= 0) {
                i7 = chat.participants_count;
            }
            boolean V = org.telegram.messenger.t3.V(chat);
            if (i7 >= 1) {
                if (V) {
                    str2 = "Subscribers";
                }
                lowerCase = hd.G(i7, str2, new Object[0]);
            } else {
                if (V) {
                    i12 = 2131751390;
                } else {
                    i12 = 2131754876;
                }
                lowerCase = hd.M0(i12, null);
            }
        } else if (org.telegram.messenger.t3.T(chat) && !chat.megagroup) {
            if (i7 >= 1) {
                lowerCase = hd.H(',', "Subscribers", i7 - 1);
            } else if (!org.telegram.messenger.t3.t0(chat)) {
                lowerCase = hd.M0(2131752329, null).toLowerCase();
            } else {
                lowerCase = hd.M0(2131752318, null).toLowerCase();
            }
        } else if (i7 >= 1) {
            lowerCase = hd.H(',', "Members", i7 - 1);
        } else if (chat.has_geo) {
            lowerCase = hd.M0(2131748642, null);
        } else if (!org.telegram.messenger.t3.t0(chat)) {
            lowerCase = hd.M0(2131748641, null).toLowerCase();
        } else {
            lowerCase = hd.M0(2131748638, null).toLowerCase();
        }
        setSubtitle(lowerCase);
        if (zArr[0]) {
            i10 = org.telegram.ui.ActionBar.j6.f29030n5;
        } else {
            i10 = org.telegram.ui.ActionBar.j6.f29107r5;
        }
        org.telegram.ui.ActionBar.q6.X(this.f14873e, i10, this.f14870a);
        if (this.f14877s) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        this.f14874f.setVisibility(i11);
        this.h.setVisibility(8);
        if (i7 > 200) {
            f11 = 0.3f;
        } else {
            f11 = 1.0f;
        }
        b(false, f11);
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.G6));
    }

    public final void b(boolean z10, float f10) {
        RadioButton radioButton = this.h;
        fp fpVar = this.f14874f;
        if (z10) {
            if (Math.abs(fpVar.getAlpha() - f10) > 0.1d) {
                fpVar.animate().cancel();
                fpVar.animate().alpha(f10).start();
            }
            if (Math.abs(radioButton.getAlpha() - f10) > 0.1d) {
                radioButton.animate().cancel();
                radioButton.animate().alpha(f10).start();
                return;
            }
            return;
        }
        fpVar.animate().cancel();
        fpVar.setAlpha(f10);
        radioButton.animate().cancel();
        radioButton.setAlpha(f10);
    }

    public final void c(boolean z10, boolean z11) {
        fp fpVar = this.f14874f;
        if (fpVar.getVisibility() == 0) {
            fpVar.a(z10, z11);
        }
        RadioButton radioButton = this.h;
        if (radioButton.getVisibility() == 0) {
            radioButton.a(z10, z11);
        }
    }

    public final void d(boolean z10, boolean z11) {
        boolean z12;
        this.f14876r = z10;
        if (z11 != this.f14877s) {
            this.f14877s = z11;
            f();
        }
        if (!this.f14877s) {
            this.h.setVisibility(8);
            this.f14874f.setVisibility(8);
        }
        if (!this.E && (this.f14877s || !this.f14876r)) {
            z12 = true;
        } else {
            z12 = false;
        }
        setWillNotDraw(z12);
    }

    public final void e(int i7, int i10, TLRPC.User user) {
        org.telegram.ui.ActionBar.e6 e6Var = this.f14870a;
        org.telegram.ui.ActionBar.j5 j5Var = this.d;
        org.telegram.ui.ActionBar.j5 j5Var2 = this.f14873e;
        org.telegram.ui.Components.t8 t8Var = this.f14871b;
        int i11 = 0;
        if (i7 == 4) {
            j5Var.l(hd.M0(2131744528, null), false);
            if (i10 == 1 && user != null) {
                setSubtitle(g(org.telegram.messenger.j6.m(hd.a0(null, null, 2131744524, q10.p(user)), j5Var2.getPaint().getFontMetricsInt(), false, null, 0)));
            } else if (i10 > 0) {
                setSubtitle(g(hd.G(i10, "StoryPrivacyOptionExcludePeople", new Object[0])));
            } else {
                setSubtitle(g(hd.M0(2131744529, null)));
            }
            org.telegram.ui.ActionBar.q6.X(j5Var2, org.telegram.ui.ActionBar.j6.f29030n5, e6Var);
            t8Var.g(7);
            t8Var.i(-15292942, -15630089);
        } else if (i7 == 2) {
            j5Var.l(hd.M0(2131744530, null), false);
            if (i10 == 1 && user != null) {
                setSubtitle(g(org.telegram.messenger.j6.m(hd.a0(null, null, 2131744524, q10.p(user)), j5Var2.getPaint().getFontMetricsInt(), false, null, 0)));
            } else if (i10 > 0) {
                setSubtitle(g(hd.G(i10, "StoryPrivacyOptionExcludePeople", new Object[0])));
            } else {
                setSubtitle(g(hd.M0(2131744529, null)));
            }
            org.telegram.ui.ActionBar.q6.X(j5Var2, org.telegram.ui.ActionBar.j6.f29030n5, e6Var);
            t8Var.g(4);
            t8Var.i(-3905294, -6923014);
        } else if (i7 == 1) {
            j5Var.l(hd.M0(2131744532, null), false);
            if (i10 == 1 && user != null) {
                setSubtitle(g(org.telegram.messenger.j6.m(q10.p(user), j5Var2.getPaint().getFontMetricsInt(), false, null, 0)));
            } else if (i10 > 0) {
                setSubtitle(g(hd.G(i10, "StoryPrivacyOptionPeople", new Object[0])));
            } else {
                setSubtitle(g(hd.M0(2131744531, null)));
            }
            org.telegram.ui.ActionBar.q6.X(j5Var2, org.telegram.ui.ActionBar.j6.f29030n5, e6Var);
            t8Var.g(15);
            t8Var.i(-7808710, -13781445);
        } else if (i7 == 3) {
            j5Var.l(hd.M0(2131744520, null), false);
            if (i10 == 1 && user != null) {
                setSubtitle(g(org.telegram.messenger.j6.m(q10.p(user), j5Var2.getPaint().getFontMetricsInt(), false, null, 0)));
            } else if (i10 > 0) {
                setSubtitle(g(hd.G(i10, "StoryPrivacyOptionPeople", new Object[0])));
            } else {
                setSubtitle(g(hd.M0(2131744519, null)));
            }
            org.telegram.ui.ActionBar.q6.X(j5Var2, org.telegram.ui.ActionBar.j6.f29030n5, e6Var);
            t8Var.g(6);
            t8Var.i(-18621, -618956);
        }
        this.f14874f.setVisibility(8);
        if (!this.f14877s) {
            i11 = 8;
        }
        this.h.setVisibility(i11);
        org.telegram.ui.Components.i9 i9Var = this.f14872c;
        i9Var.setImageDrawable(t8Var);
        i9Var.setRoundRadius(org.telegram.messenger.g0.L(20.0f));
    }

    public final void f() {
        int i7;
        float f10;
        float f11;
        int i10;
        int i11;
        float f12;
        float f13;
        int i12;
        int i13;
        float f14;
        int i14;
        int i15;
        int i16 = 3;
        if (hd.f24101a0) {
            i7 = 5;
        } else {
            i7 = 3;
        }
        int i17 = i7 | 16;
        boolean z10 = this.f14877s;
        if (z10) {
            f10 = 53.0f;
        } else {
            f10 = 16.0f;
        }
        if (z10) {
            f11 = 53.0f;
        } else {
            f11 = 16.0f;
        }
        this.f14872c.setLayoutParams(c8.ja.d(40, 40.0f, i17, f10, 0.0f, f11, 0.0f));
        boolean z11 = hd.f24101a0;
        if (z11) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        int i18 = i10 | 16;
        int i19 = 68;
        float f15 = 20.0f;
        if (z11) {
            f12 = 20.0f;
        } else {
            if (this.f14877s) {
                i11 = 105;
            } else {
                i11 = 68;
            }
            f12 = i11;
        }
        if (z11) {
            if (this.f14877s) {
                i15 = 105;
            } else {
                i15 = 68;
            }
            f13 = i15;
        } else {
            f13 = 20.0f;
        }
        this.d.setLayoutParams(c8.ja.d(-1, -2.0f, i18, f12, 0.0f, f13, 0.0f));
        boolean z12 = hd.f24101a0;
        if (z12) {
            i12 = 5;
        } else {
            i12 = 3;
        }
        int i20 = i12 | 16;
        if (z12) {
            f14 = 20.0f;
        } else {
            if (this.f14877s) {
                i13 = 105;
            } else {
                i13 = 68;
            }
            f14 = i13;
        }
        if (z12) {
            if (this.f14877s) {
                i19 = 105;
            }
            f15 = i19;
        }
        this.f14873e.setLayoutParams(c8.ja.d(-1, -2.0f, i20, f14, 0.0f, f15, 0.0f));
        if (hd.f24101a0) {
            i14 = 5;
        } else {
            i14 = 3;
        }
        this.f14874f.setLayoutParams(c8.ja.d(24, 24.0f, i14 | 16, 13.0f, 0.0f, 14.0f, 0.0f));
        if (hd.f24101a0) {
            i16 = 5;
        }
        this.h.setLayoutParams(c8.ja.d(22, 22.0f, i16 | 16, 14.0f, 0.0f, 15.0f, 0.0f));
    }

    public final SpannableStringBuilder g(CharSequence charSequence) {
        SpannableString spannableString = new SpannableString(">");
        Drawable drawable = getContext().getResources().getDrawable(2131230875);
        eq eqVar = new eq(2, drawable);
        drawable.setBounds(0, org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(11.0f), org.telegram.messenger.g0.L(12.0f));
        spannableString.setSpan(eqVar, 0, spannableString.length(), 33);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append(charSequence).append((CharSequence) " ").append((CharSequence) spannableString);
        return spannableStringBuilder;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        Paint paint;
        super.onDraw(canvas);
        if (this.E) {
            int w02 = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f28850d7, this.f14870a);
            Paint paint2 = this.f14875n;
            paint2.setColor(w02);
            if (hd.f24101a0) {
                canvas2 = canvas;
                canvas2.drawRect(0.0f, getHeight() - 1, getWidth() - org.telegram.messenger.g0.L(105.0f), getHeight(), paint2);
            } else {
                canvas2 = canvas;
                canvas2.drawRect(org.telegram.messenger.g0.L(105.0f), getHeight() - 1, getWidth(), getHeight(), paint2);
            }
        } else {
            canvas2 = canvas;
        }
        Path path = this.F;
        if (path != null && (paint = this.G) != null && !this.f14877s && this.f14876r && this.f14878w) {
            canvas2.drawPath(path, paint);
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo r7) {
        throw new UnsupportedOperationException("Method not decompiled: hi.p8.onInitializeAccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo):void");
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        float f10;
        int measuredWidth;
        float f11;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824);
        if (this.f14876r && !this.f14877s) {
            f10 = 62.0f;
        } else {
            f10 = 56.0f;
        }
        super.onMeasure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(f10), 1073741824));
        if (!this.f14877s && this.f14876r) {
            Path path = this.F;
            if (path == null) {
                this.F = new Path();
            } else {
                path.rewind();
            }
            if (hd.f24101a0) {
                measuredWidth = org.telegram.messenger.g0.L(31.0f);
            } else {
                measuredWidth = getMeasuredWidth() - org.telegram.messenger.g0.L(31.0f);
            }
            float f12 = measuredWidth;
            float measuredHeight = getMeasuredHeight() / 2.0f;
            if (hd.f24101a0) {
                f11 = -1.0f;
            } else {
                f11 = 1.0f;
            }
            this.F.moveTo(f12, measuredHeight - org.telegram.messenger.g0.L(6.0f));
            this.F.lineTo((f11 * org.telegram.messenger.g0.L(6.0f)) + f12, measuredHeight);
            this.F.lineTo(f12, measuredHeight + org.telegram.messenger.g0.L(6.0f));
            if (this.G == null) {
                Paint paint = new Paint(1);
                this.G = paint;
                paint.setStyle(Paint.Style.STROKE);
                this.G.setStrokeCap(Paint.Cap.ROUND);
            }
            this.G.setStrokeWidth(org.telegram.messenger.g0.N(1.86f));
            this.G.setColor(org.telegram.ui.ActionBar.j6.r1(0.3f, org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.G6, this.f14870a)));
        }
    }

    public void set(Object obj) {
        int i7;
        boolean z10 = obj instanceof TLRPC.User;
        org.telegram.ui.ActionBar.j5 j5Var = this.d;
        if (z10) {
            j5Var.setTypeface(org.telegram.messenger.g0.o());
            j5Var.setTranslationX(0.0f);
            setUser((TLRPC.User) obj);
        } else if (obj instanceof TLRPC.Chat) {
            j5Var.setTypeface(org.telegram.messenger.g0.o());
            j5Var.setTranslationX(0.0f);
            a(0, (TLRPC.Chat) obj);
        } else if (obj instanceof String) {
            j5Var.setTypeface(null);
            int i10 = -org.telegram.messenger.g0.L(52.0f);
            if (hd.f24101a0) {
                i7 = -1;
            } else {
                i7 = 1;
            }
            j5Var.setTranslationX(i10 * i7);
            j5Var.l((String) obj, false);
        }
    }

    public void setDivider(boolean z10) {
        boolean z11;
        this.E = z10;
        if (!z10 && (this.f14877s || !this.f14876r)) {
            z11 = true;
        } else {
            z11 = false;
        }
        setWillNotDraw(z11);
    }

    public void setRedCheckbox(boolean z10) {
        int i7;
        if (z10) {
            i7 = org.telegram.ui.ActionBar.j6.nk;
        } else {
            i7 = org.telegram.ui.ActionBar.j6.B5;
        }
        this.f14874f.b(i7, org.telegram.ui.ActionBar.j6.f28959j7, org.telegram.ui.ActionBar.j6.C5);
    }

    public void setUser(TLRPC.User user) {
        long j3;
        int i7;
        if (user == null) {
            j3 = 0;
        } else {
            j3 = user.f28200id;
        }
        this.f14880y = j3;
        org.telegram.ui.Components.t8 t8Var = this.f14871b;
        t8Var.r(user);
        int L = org.telegram.messenger.g0.L(20.0f);
        org.telegram.ui.Components.i9 i9Var = this.f14872c;
        i9Var.setRoundRadius(L);
        i9Var.f(user, t8Var);
        String p10 = q10.p(user);
        org.telegram.ui.ActionBar.j5 j5Var = this.d;
        int i10 = 0;
        j5Var.l(org.telegram.messenger.j6.m(p10, j5Var.getPaint().getFontMetricsInt(), false, null, 0), false);
        boolean[] zArr = this.f14879x;
        zArr[0] = false;
        boolean z10 = this.f14876r;
        org.telegram.ui.ActionBar.e6 e6Var = this.f14870a;
        org.telegram.ui.ActionBar.j5 j5Var2 = this.f14873e;
        if (z10) {
            setSubtitle(hd.M0(2131743349, null));
            org.telegram.ui.ActionBar.q6.X(j5Var2, org.telegram.ui.ActionBar.j6.f29107r5, e6Var);
        } else {
            setSubtitle(hd.d0(m10.f24934t0, user, zArr, null));
            if (zArr[0]) {
                i7 = org.telegram.ui.ActionBar.j6.f29030n5;
            } else {
                i7 = org.telegram.ui.ActionBar.j6.f29107r5;
            }
            org.telegram.ui.ActionBar.q6.X(j5Var2, i7, e6Var);
        }
        if (!this.f14877s) {
            i10 = 8;
        }
        fp fpVar = this.f14874f;
        fpVar.setVisibility(i10);
        fpVar.setAlpha(1.0f);
        this.h.setVisibility(8);
    }

    @Override
    public final void updateColors() {
        try {
            Paint paint = this.G;
            if (paint != null) {
                paint.setColor(org.telegram.ui.ActionBar.j6.r1(0.3f, org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.G6, this.f14870a)));
                invalidate();
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }
}
