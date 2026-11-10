package fi;

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
import org.telegram.messenger.id;
import org.telegram.messenger.p10;
import org.telegram.messenger.qs;
import org.telegram.messenger.t10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.RadioButton;
import org.telegram.ui.Components.wo;
import org.telegram.ui.Components.wp;
public final class r8 extends FrameLayout implements org.telegram.ui.ActionBar.c6 {
    public boolean D;
    public Path E;
    public Paint F;
    public final org.telegram.ui.ActionBar.h6 f12751a;
    public final org.telegram.ui.Components.v8 f12752b;
    public final org.telegram.ui.Components.k9 f12753c;
    public final org.telegram.ui.ActionBar.m5 d;
    public final org.telegram.ui.ActionBar.m5 f12754e;
    public final wo f12755f;
    public final RadioButton h;
    public final Paint f12756n;
    public boolean f12757r;
    public boolean f12758s;
    public boolean f12759w;
    public final boolean[] f12760x;
    public long f12761y;

    public r8(Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context);
        int i7;
        org.telegram.ui.Components.v8 v8Var = new org.telegram.ui.Components.v8((org.telegram.ui.ActionBar.h6) null);
        this.f12752b = v8Var;
        this.f12756n = new Paint(1);
        this.f12757r = false;
        this.f12758s = true;
        this.f12759w = true;
        this.f12760x = new boolean[1];
        this.f12751a = h6Var;
        v8Var.f38927r = org.telegram.messenger.g0.L(40.0f);
        org.telegram.ui.Components.k9 k9Var = new org.telegram.ui.Components.k9(context);
        this.f12753c = k9Var;
        k9Var.setRoundRadius(org.telegram.messenger.g0.L(20.0f));
        addView(k9Var);
        org.telegram.ui.ActionBar.m5 m5Var = new org.telegram.ui.ActionBar.m5(context);
        this.d = m5Var;
        m5Var.setTypeface(org.telegram.messenger.g0.o());
        m5Var.setTextSize(16);
        int i10 = org.telegram.ui.ActionBar.m6.f27998j5;
        org.telegram.ui.ActionBar.t6.X(m5Var, i10, h6Var);
        if (id.f23161a0) {
            i7 = 5;
        } else {
            i7 = 3;
        }
        m5Var.setGravity(i7);
        qs.i(m5Var);
        addView(m5Var);
        org.telegram.ui.ActionBar.m5 m5Var2 = new org.telegram.ui.ActionBar.m5(context);
        this.f12754e = m5Var2;
        m5Var2.setTextSize(14);
        org.telegram.ui.ActionBar.t6.X(m5Var2, i10, h6Var);
        m5Var2.setGravity(id.f23161a0 ? 5 : 3);
        qs.i(m5Var2);
        addView(m5Var2);
        wo woVar = new wo(21, context, h6Var);
        this.f12755f = woVar;
        int i11 = org.telegram.ui.ActionBar.m6.B5;
        int i12 = org.telegram.ui.ActionBar.m6.f28000j7;
        woVar.b(i11, i12, org.telegram.ui.ActionBar.m6.C5);
        woVar.setDrawUnchecked(true);
        woVar.setDrawBackgroundAsArc(10);
        addView(woVar);
        woVar.a(false, false);
        woVar.setVisibility(8);
        RadioButton radioButton = new RadioButton(context);
        this.h = radioButton;
        radioButton.setSize(org.telegram.messenger.g0.L(20.0f));
        org.telegram.ui.ActionBar.t6.O(radioButton, i12, org.telegram.ui.ActionBar.m6.E5, h6Var);
        addView(radioButton);
        radioButton.setVisibility(8);
        f();
    }

    private void setSubtitle(CharSequence charSequence) {
        org.telegram.ui.ActionBar.m5 m5Var = this.d;
        org.telegram.ui.ActionBar.m5 m5Var2 = this.f12754e;
        if (charSequence == null) {
            m5Var.setTranslationY(0.0f);
            m5Var2.setVisibility(8);
            return;
        }
        m5Var.setTranslationY(org.telegram.messenger.g0.L(-9.0f));
        m5Var2.setTranslationY(org.telegram.messenger.g0.L(12.0f));
        m5Var2.l(charSequence, false);
        m5Var2.setVisibility(0);
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
            j3 = -chat.f26960id;
        }
        this.f12761y = j3;
        org.telegram.ui.Components.v8 v8Var = this.f12752b;
        v8Var.q(chat);
        if (org.telegram.messenger.t3.c0(chat)) {
            f10 = 12.0f;
        } else {
            f10 = 20.0f;
        }
        int L = org.telegram.messenger.g0.L(f10);
        org.telegram.ui.Components.k9 k9Var = this.f12753c;
        k9Var.setRoundRadius(L);
        k9Var.e(chat, v8Var);
        String str = chat.title;
        org.telegram.ui.ActionBar.m5 m5Var = this.d;
        m5Var.l(org.telegram.messenger.i6.m(str, m5Var.getPaint().getFontMetricsInt(), false, null, 0), false);
        boolean[] zArr = this.f12760x;
        zArr[0] = false;
        String str2 = "Members";
        if (this.f12757r) {
            if (i7 <= 0) {
                i7 = chat.participants_count;
            }
            boolean V = org.telegram.messenger.t3.V(chat);
            if (i7 >= 1) {
                if (V) {
                    str2 = "Subscribers";
                }
                lowerCase = id.G(i7, str2, new Object[0]);
            } else {
                if (V) {
                    i12 = 2131751390;
                } else {
                    i12 = 2131754876;
                }
                lowerCase = id.M0(i12, null);
            }
        } else if (org.telegram.messenger.t3.T(chat) && !chat.megagroup) {
            if (i7 >= 1) {
                lowerCase = id.H(',', "Subscribers", i7 - 1);
            } else if (!org.telegram.messenger.t3.t0(chat)) {
                lowerCase = id.M0(2131752329, null).toLowerCase();
            } else {
                lowerCase = id.M0(2131752318, null).toLowerCase();
            }
        } else if (i7 >= 1) {
            lowerCase = id.H(',', "Members", i7 - 1);
        } else if (chat.has_geo) {
            lowerCase = id.M0(2131748642, null);
        } else if (!org.telegram.messenger.t3.t0(chat)) {
            lowerCase = id.M0(2131748641, null).toLowerCase();
        } else {
            lowerCase = id.M0(2131748638, null).toLowerCase();
        }
        setSubtitle(lowerCase);
        if (zArr[0]) {
            i10 = org.telegram.ui.ActionBar.m6.f28071n5;
        } else {
            i10 = org.telegram.ui.ActionBar.m6.f28148r5;
        }
        org.telegram.ui.ActionBar.t6.X(this.f12754e, i10, this.f12751a);
        if (this.f12758s) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        this.f12755f.setVisibility(i11);
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
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.G6));
    }

    public final void b(boolean z9, float f10) {
        RadioButton radioButton = this.h;
        wo woVar = this.f12755f;
        if (z9) {
            if (Math.abs(woVar.getAlpha() - f10) > 0.1d) {
                woVar.animate().cancel();
                woVar.animate().alpha(f10).start();
            }
            if (Math.abs(radioButton.getAlpha() - f10) > 0.1d) {
                radioButton.animate().cancel();
                radioButton.animate().alpha(f10).start();
                return;
            }
            return;
        }
        woVar.animate().cancel();
        woVar.setAlpha(f10);
        radioButton.animate().cancel();
        radioButton.setAlpha(f10);
    }

    public final void c(boolean z9, boolean z10) {
        wo woVar = this.f12755f;
        if (woVar.getVisibility() == 0) {
            woVar.a(z9, z10);
        }
        RadioButton radioButton = this.h;
        if (radioButton.getVisibility() == 0) {
            radioButton.a(z9, z10);
        }
    }

    public final void d(boolean z9, boolean z10) {
        boolean z11;
        this.f12757r = z9;
        if (z10 != this.f12758s) {
            this.f12758s = z10;
            f();
        }
        if (!this.f12758s) {
            this.h.setVisibility(8);
            this.f12755f.setVisibility(8);
        }
        if (!this.D && (this.f12758s || !this.f12757r)) {
            z11 = true;
        } else {
            z11 = false;
        }
        setWillNotDraw(z11);
    }

    public final void e(int i7, int i10, TLRPC.User user) {
        org.telegram.ui.ActionBar.h6 h6Var = this.f12751a;
        org.telegram.ui.ActionBar.m5 m5Var = this.d;
        org.telegram.ui.ActionBar.m5 m5Var2 = this.f12754e;
        org.telegram.ui.Components.v8 v8Var = this.f12752b;
        int i11 = 0;
        if (i7 == 4) {
            m5Var.l(id.M0(2131744528, null), false);
            if (i10 == 1 && user != null) {
                setSubtitle(g(org.telegram.messenger.i6.m(id.a0(null, null, 2131744524, t10.p(user)), m5Var2.getPaint().getFontMetricsInt(), false, null, 0)));
            } else if (i10 > 0) {
                setSubtitle(g(id.G(i10, "StoryPrivacyOptionExcludePeople", new Object[0])));
            } else {
                setSubtitle(g(id.M0(2131744529, null)));
            }
            org.telegram.ui.ActionBar.t6.X(m5Var2, org.telegram.ui.ActionBar.m6.f28071n5, h6Var);
            v8Var.g(7);
            v8Var.i(-15292942, -15630089);
        } else if (i7 == 2) {
            m5Var.l(id.M0(2131744530, null), false);
            if (i10 == 1 && user != null) {
                setSubtitle(g(org.telegram.messenger.i6.m(id.a0(null, null, 2131744524, t10.p(user)), m5Var2.getPaint().getFontMetricsInt(), false, null, 0)));
            } else if (i10 > 0) {
                setSubtitle(g(id.G(i10, "StoryPrivacyOptionExcludePeople", new Object[0])));
            } else {
                setSubtitle(g(id.M0(2131744529, null)));
            }
            org.telegram.ui.ActionBar.t6.X(m5Var2, org.telegram.ui.ActionBar.m6.f28071n5, h6Var);
            v8Var.g(4);
            v8Var.i(-3905294, -6923014);
        } else if (i7 == 1) {
            m5Var.l(id.M0(2131744532, null), false);
            if (i10 == 1 && user != null) {
                setSubtitle(g(org.telegram.messenger.i6.m(t10.p(user), m5Var2.getPaint().getFontMetricsInt(), false, null, 0)));
            } else if (i10 > 0) {
                setSubtitle(g(id.G(i10, "StoryPrivacyOptionPeople", new Object[0])));
            } else {
                setSubtitle(g(id.M0(2131744531, null)));
            }
            org.telegram.ui.ActionBar.t6.X(m5Var2, org.telegram.ui.ActionBar.m6.f28071n5, h6Var);
            v8Var.g(15);
            v8Var.i(-7808710, -13781445);
        } else if (i7 == 3) {
            m5Var.l(id.M0(2131744520, null), false);
            if (i10 == 1 && user != null) {
                setSubtitle(g(org.telegram.messenger.i6.m(t10.p(user), m5Var2.getPaint().getFontMetricsInt(), false, null, 0)));
            } else if (i10 > 0) {
                setSubtitle(g(id.G(i10, "StoryPrivacyOptionPeople", new Object[0])));
            } else {
                setSubtitle(g(id.M0(2131744519, null)));
            }
            org.telegram.ui.ActionBar.t6.X(m5Var2, org.telegram.ui.ActionBar.m6.f28071n5, h6Var);
            v8Var.g(6);
            v8Var.i(-18621, -618956);
        }
        this.f12755f.setVisibility(8);
        if (!this.f12758s) {
            i11 = 8;
        }
        this.h.setVisibility(i11);
        org.telegram.ui.Components.k9 k9Var = this.f12753c;
        k9Var.setImageDrawable(v8Var);
        k9Var.setRoundRadius(org.telegram.messenger.g0.L(20.0f));
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
        if (id.f23161a0) {
            i7 = 5;
        } else {
            i7 = 3;
        }
        int i17 = i7 | 16;
        boolean z9 = this.f12758s;
        if (z9) {
            f10 = 53.0f;
        } else {
            f10 = 16.0f;
        }
        if (z9) {
            f11 = 53.0f;
        } else {
            f11 = 16.0f;
        }
        this.f12753c.setLayoutParams(c8.ha.d(40, 40.0f, i17, f10, 0.0f, f11, 0.0f));
        boolean z10 = id.f23161a0;
        if (z10) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        int i18 = i10 | 16;
        int i19 = 68;
        float f15 = 20.0f;
        if (z10) {
            f12 = 20.0f;
        } else {
            if (this.f12758s) {
                i11 = 105;
            } else {
                i11 = 68;
            }
            f12 = i11;
        }
        if (z10) {
            if (this.f12758s) {
                i15 = 105;
            } else {
                i15 = 68;
            }
            f13 = i15;
        } else {
            f13 = 20.0f;
        }
        this.d.setLayoutParams(c8.ha.d(-1, -2.0f, i18, f12, 0.0f, f13, 0.0f));
        boolean z11 = id.f23161a0;
        if (z11) {
            i12 = 5;
        } else {
            i12 = 3;
        }
        int i20 = i12 | 16;
        if (z11) {
            f14 = 20.0f;
        } else {
            if (this.f12758s) {
                i13 = 105;
            } else {
                i13 = 68;
            }
            f14 = i13;
        }
        if (z11) {
            if (this.f12758s) {
                i19 = 105;
            }
            f15 = i19;
        }
        this.f12754e.setLayoutParams(c8.ha.d(-1, -2.0f, i20, f14, 0.0f, f15, 0.0f));
        if (id.f23161a0) {
            i14 = 5;
        } else {
            i14 = 3;
        }
        this.f12755f.setLayoutParams(c8.ha.d(24, 24.0f, i14 | 16, 13.0f, 0.0f, 14.0f, 0.0f));
        if (id.f23161a0) {
            i16 = 5;
        }
        this.h.setLayoutParams(c8.ha.d(22, 22.0f, i16 | 16, 14.0f, 0.0f, 15.0f, 0.0f));
    }

    public final SpannableStringBuilder g(CharSequence charSequence) {
        SpannableString spannableString = new SpannableString(">");
        Drawable drawable = getContext().getResources().getDrawable(2131230875);
        wp wpVar = new wp(2, drawable);
        drawable.setBounds(0, org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(11.0f), org.telegram.messenger.g0.L(12.0f));
        spannableString.setSpan(wpVar, 0, spannableString.length(), 33);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append(charSequence).append((CharSequence) " ").append((CharSequence) spannableString);
        return spannableStringBuilder;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        Paint paint;
        super.onDraw(canvas);
        if (this.D) {
            int w02 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f27891d7, this.f12751a);
            Paint paint2 = this.f12756n;
            paint2.setColor(w02);
            if (id.f23161a0) {
                canvas2 = canvas;
                canvas2.drawRect(0.0f, getHeight() - 1, getWidth() - org.telegram.messenger.g0.L(105.0f), getHeight(), paint2);
            } else {
                canvas2 = canvas;
                canvas2.drawRect(org.telegram.messenger.g0.L(105.0f), getHeight() - 1, getWidth(), getHeight(), paint2);
            }
        } else {
            canvas2 = canvas;
        }
        Path path = this.E;
        if (path != null && (paint = this.F) != null && !this.f12758s && this.f12757r && this.f12759w) {
            canvas2.drawPath(path, paint);
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo r7) {
        throw new UnsupportedOperationException("Method not decompiled: fi.r8.onInitializeAccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo):void");
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        float f10;
        int measuredWidth;
        float f11;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824);
        if (this.f12757r && !this.f12758s) {
            f10 = 62.0f;
        } else {
            f10 = 56.0f;
        }
        super.onMeasure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(f10), 1073741824));
        if (!this.f12758s && this.f12757r) {
            Path path = this.E;
            if (path == null) {
                this.E = new Path();
            } else {
                path.rewind();
            }
            if (id.f23161a0) {
                measuredWidth = org.telegram.messenger.g0.L(31.0f);
            } else {
                measuredWidth = getMeasuredWidth() - org.telegram.messenger.g0.L(31.0f);
            }
            float f12 = measuredWidth;
            float measuredHeight = getMeasuredHeight() / 2.0f;
            if (id.f23161a0) {
                f11 = -1.0f;
            } else {
                f11 = 1.0f;
            }
            this.E.moveTo(f12, measuredHeight - org.telegram.messenger.g0.L(6.0f));
            this.E.lineTo((f11 * org.telegram.messenger.g0.L(6.0f)) + f12, measuredHeight);
            this.E.lineTo(f12, measuredHeight + org.telegram.messenger.g0.L(6.0f));
            if (this.F == null) {
                Paint paint = new Paint(1);
                this.F = paint;
                paint.setStyle(Paint.Style.STROKE);
                this.F.setStrokeCap(Paint.Cap.ROUND);
            }
            this.F.setStrokeWidth(org.telegram.messenger.g0.N(1.86f));
            this.F.setColor(org.telegram.ui.ActionBar.m6.r1(0.3f, org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.G6, this.f12751a)));
        }
    }

    public void set(Object obj) {
        int i7;
        boolean z9 = obj instanceof TLRPC.User;
        org.telegram.ui.ActionBar.m5 m5Var = this.d;
        if (z9) {
            m5Var.setTypeface(org.telegram.messenger.g0.o());
            m5Var.setTranslationX(0.0f);
            setUser((TLRPC.User) obj);
        } else if (obj instanceof TLRPC.Chat) {
            m5Var.setTypeface(org.telegram.messenger.g0.o());
            m5Var.setTranslationX(0.0f);
            a(0, (TLRPC.Chat) obj);
        } else if (obj instanceof String) {
            m5Var.setTypeface(null);
            int i10 = -org.telegram.messenger.g0.L(52.0f);
            if (id.f23161a0) {
                i7 = -1;
            } else {
                i7 = 1;
            }
            m5Var.setTranslationX(i10 * i7);
            m5Var.l((String) obj, false);
        }
    }

    public void setDivider(boolean z9) {
        boolean z10;
        this.D = z9;
        if (!z9 && (this.f12758s || !this.f12757r)) {
            z10 = true;
        } else {
            z10 = false;
        }
        setWillNotDraw(z10);
    }

    public void setRedCheckbox(boolean z9) {
        int i7;
        if (z9) {
            i7 = org.telegram.ui.ActionBar.m6.kk;
        } else {
            i7 = org.telegram.ui.ActionBar.m6.B5;
        }
        this.f12755f.b(i7, org.telegram.ui.ActionBar.m6.f28000j7, org.telegram.ui.ActionBar.m6.C5);
    }

    public void setUser(TLRPC.User user) {
        long j3;
        int i7;
        if (user == null) {
            j3 = 0;
        } else {
            j3 = user.f27109id;
        }
        this.f12761y = j3;
        org.telegram.ui.Components.v8 v8Var = this.f12752b;
        v8Var.r(user);
        int L = org.telegram.messenger.g0.L(20.0f);
        org.telegram.ui.Components.k9 k9Var = this.f12753c;
        k9Var.setRoundRadius(L);
        k9Var.e(user, v8Var);
        String p10 = t10.p(user);
        org.telegram.ui.ActionBar.m5 m5Var = this.d;
        int i10 = 0;
        m5Var.l(org.telegram.messenger.i6.m(p10, m5Var.getPaint().getFontMetricsInt(), false, null, 0), false);
        boolean[] zArr = this.f12760x;
        zArr[0] = false;
        boolean z9 = this.f12757r;
        org.telegram.ui.ActionBar.h6 h6Var = this.f12751a;
        org.telegram.ui.ActionBar.m5 m5Var2 = this.f12754e;
        if (z9) {
            setSubtitle(id.M0(2131743349, null));
            org.telegram.ui.ActionBar.t6.X(m5Var2, org.telegram.ui.ActionBar.m6.f28148r5, h6Var);
        } else {
            setSubtitle(id.d0(p10.f24474s0, user, zArr, null));
            if (zArr[0]) {
                i7 = org.telegram.ui.ActionBar.m6.f28071n5;
            } else {
                i7 = org.telegram.ui.ActionBar.m6.f28148r5;
            }
            org.telegram.ui.ActionBar.t6.X(m5Var2, i7, h6Var);
        }
        if (!this.f12758s) {
            i10 = 8;
        }
        wo woVar = this.f12755f;
        woVar.setVisibility(i10);
        woVar.setAlpha(1.0f);
        this.h.setVisibility(8);
    }

    @Override
    public final void updateColors() {
        try {
            Paint paint = this.F;
            if (paint != null) {
                paint.setColor(org.telegram.ui.ActionBar.m6.r1(0.3f, org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.G6, this.f12751a)));
                invalidate();
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }
}
