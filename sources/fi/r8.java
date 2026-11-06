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
import org.telegram.messenger.hd;
import org.telegram.messenger.p10;
import org.telegram.messenger.qs;
import org.telegram.messenger.t10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.RadioButton;
import org.telegram.ui.Components.wo;
import org.telegram.ui.Components.wp;
public final class r8 extends FrameLayout implements org.telegram.ui.ActionBar.a6 {
    public boolean D;
    public Path E;
    public Paint F;
    public final org.telegram.ui.ActionBar.f6 f12746a;
    public final org.telegram.ui.Components.w8 f12747b;
    public final org.telegram.ui.Components.l9 f12748c;
    public final org.telegram.ui.ActionBar.k5 d;
    public final org.telegram.ui.ActionBar.k5 f12749e;
    public final wo f12750f;
    public final RadioButton h;
    public final Paint f12751n;
    public boolean f12752r;
    public boolean f12753s;
    public boolean f12754w;
    public final boolean[] f12755x;
    public long f12756y;

    public r8(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        int i7;
        org.telegram.ui.Components.w8 w8Var = new org.telegram.ui.Components.w8((org.telegram.ui.ActionBar.f6) null);
        this.f12747b = w8Var;
        this.f12751n = new Paint(1);
        this.f12752r = false;
        this.f12753s = true;
        this.f12754w = true;
        this.f12755x = new boolean[1];
        this.f12746a = f6Var;
        w8Var.f39907r = org.telegram.messenger.g0.L(40.0f);
        org.telegram.ui.Components.l9 l9Var = new org.telegram.ui.Components.l9(context);
        this.f12748c = l9Var;
        l9Var.setRoundRadius(org.telegram.messenger.g0.L(20.0f));
        addView(l9Var);
        org.telegram.ui.ActionBar.k5 k5Var = new org.telegram.ui.ActionBar.k5(context);
        this.d = k5Var;
        k5Var.setTypeface(org.telegram.messenger.g0.o());
        k5Var.setTextSize(16);
        int i10 = org.telegram.ui.ActionBar.k6.f27956j5;
        org.telegram.ui.ActionBar.r6.Y(k5Var, i10, f6Var);
        if (hd.f22871a0) {
            i7 = 5;
        } else {
            i7 = 3;
        }
        k5Var.setGravity(i7);
        qs.i(k5Var);
        addView(k5Var);
        org.telegram.ui.ActionBar.k5 k5Var2 = new org.telegram.ui.ActionBar.k5(context);
        this.f12749e = k5Var2;
        k5Var2.setTextSize(14);
        org.telegram.ui.ActionBar.r6.Y(k5Var2, i10, f6Var);
        k5Var2.setGravity(hd.f22871a0 ? 5 : 3);
        qs.i(k5Var2);
        addView(k5Var2);
        wo woVar = new wo(21, context, f6Var);
        this.f12750f = woVar;
        int i11 = org.telegram.ui.ActionBar.k6.B5;
        int i12 = org.telegram.ui.ActionBar.k6.f27958j7;
        woVar.b(i11, i12, org.telegram.ui.ActionBar.k6.C5);
        woVar.setDrawUnchecked(true);
        woVar.setDrawBackgroundAsArc(10);
        addView(woVar);
        woVar.a(false, false);
        woVar.setVisibility(8);
        RadioButton radioButton = new RadioButton(context);
        this.h = radioButton;
        radioButton.setSize(org.telegram.messenger.g0.L(20.0f));
        org.telegram.ui.ActionBar.r6.P(radioButton, i12, org.telegram.ui.ActionBar.k6.E5, f6Var);
        addView(radioButton);
        radioButton.setVisibility(8);
        f();
    }

    private void setSubtitle(CharSequence charSequence) {
        org.telegram.ui.ActionBar.k5 k5Var = this.d;
        org.telegram.ui.ActionBar.k5 k5Var2 = this.f12749e;
        if (charSequence == null) {
            k5Var.setTranslationY(0.0f);
            k5Var2.setVisibility(8);
            return;
        }
        k5Var.setTranslationY(org.telegram.messenger.g0.L(-9.0f));
        k5Var2.setTranslationY(org.telegram.messenger.g0.L(12.0f));
        k5Var2.l(charSequence, false);
        k5Var2.setVisibility(0);
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
            j3 = -chat.f26952id;
        }
        this.f12756y = j3;
        org.telegram.ui.Components.w8 w8Var = this.f12747b;
        w8Var.q(chat);
        if (org.telegram.messenger.t3.c0(chat)) {
            f10 = 12.0f;
        } else {
            f10 = 20.0f;
        }
        int L = org.telegram.messenger.g0.L(f10);
        org.telegram.ui.Components.l9 l9Var = this.f12748c;
        l9Var.setRoundRadius(L);
        l9Var.e(chat, w8Var);
        String str = chat.title;
        org.telegram.ui.ActionBar.k5 k5Var = this.d;
        k5Var.l(org.telegram.messenger.i6.m(str, k5Var.getPaint().getFontMetricsInt(), false, null, 0), false);
        boolean[] zArr = this.f12755x;
        zArr[0] = false;
        String str2 = "Members";
        if (this.f12752r) {
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
                    i12 = 2131751391;
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
            lowerCase = hd.M0(2131748641, null);
        } else if (!org.telegram.messenger.t3.t0(chat)) {
            lowerCase = hd.M0(2131748640, null).toLowerCase();
        } else {
            lowerCase = hd.M0(2131748637, null).toLowerCase();
        }
        setSubtitle(lowerCase);
        if (zArr[0]) {
            i10 = org.telegram.ui.ActionBar.k6.f28029n5;
        } else {
            i10 = org.telegram.ui.ActionBar.k6.f28106r5;
        }
        org.telegram.ui.ActionBar.r6.Y(this.f12749e, i10, this.f12746a);
        if (this.f12753s) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        this.f12750f.setVisibility(i11);
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
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.G6));
    }

    public final void b(boolean z9, float f10) {
        RadioButton radioButton = this.h;
        wo woVar = this.f12750f;
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
        wo woVar = this.f12750f;
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
        this.f12752r = z9;
        if (z10 != this.f12753s) {
            this.f12753s = z10;
            f();
        }
        if (!this.f12753s) {
            this.h.setVisibility(8);
            this.f12750f.setVisibility(8);
        }
        if (!this.D && (this.f12753s || !this.f12752r)) {
            z11 = true;
        } else {
            z11 = false;
        }
        setWillNotDraw(z11);
    }

    public final void e(int i7, int i10, TLRPC.User user) {
        org.telegram.ui.ActionBar.f6 f6Var = this.f12746a;
        org.telegram.ui.ActionBar.k5 k5Var = this.d;
        org.telegram.ui.ActionBar.k5 k5Var2 = this.f12749e;
        org.telegram.ui.Components.w8 w8Var = this.f12747b;
        int i11 = 0;
        if (i7 == 4) {
            k5Var.l(hd.M0(2131744529, null), false);
            if (i10 == 1 && user != null) {
                setSubtitle(g(org.telegram.messenger.i6.m(hd.a0(null, null, 2131744525, t10.p(user)), k5Var2.getPaint().getFontMetricsInt(), false, null, 0)));
            } else if (i10 > 0) {
                setSubtitle(g(hd.G(i10, "StoryPrivacyOptionExcludePeople", new Object[0])));
            } else {
                setSubtitle(g(hd.M0(2131744530, null)));
            }
            org.telegram.ui.ActionBar.r6.Y(k5Var2, org.telegram.ui.ActionBar.k6.f28029n5, f6Var);
            w8Var.g(7);
            w8Var.i(-15292942, -15630089);
        } else if (i7 == 2) {
            k5Var.l(hd.M0(2131744531, null), false);
            if (i10 == 1 && user != null) {
                setSubtitle(g(org.telegram.messenger.i6.m(hd.a0(null, null, 2131744525, t10.p(user)), k5Var2.getPaint().getFontMetricsInt(), false, null, 0)));
            } else if (i10 > 0) {
                setSubtitle(g(hd.G(i10, "StoryPrivacyOptionExcludePeople", new Object[0])));
            } else {
                setSubtitle(g(hd.M0(2131744530, null)));
            }
            org.telegram.ui.ActionBar.r6.Y(k5Var2, org.telegram.ui.ActionBar.k6.f28029n5, f6Var);
            w8Var.g(4);
            w8Var.i(-3905294, -6923014);
        } else if (i7 == 1) {
            k5Var.l(hd.M0(2131744533, null), false);
            if (i10 == 1 && user != null) {
                setSubtitle(g(org.telegram.messenger.i6.m(t10.p(user), k5Var2.getPaint().getFontMetricsInt(), false, null, 0)));
            } else if (i10 > 0) {
                setSubtitle(g(hd.G(i10, "StoryPrivacyOptionPeople", new Object[0])));
            } else {
                setSubtitle(g(hd.M0(2131744532, null)));
            }
            org.telegram.ui.ActionBar.r6.Y(k5Var2, org.telegram.ui.ActionBar.k6.f28029n5, f6Var);
            w8Var.g(15);
            w8Var.i(-7808710, -13781445);
        } else if (i7 == 3) {
            k5Var.l(hd.M0(2131744521, null), false);
            if (i10 == 1 && user != null) {
                setSubtitle(g(org.telegram.messenger.i6.m(t10.p(user), k5Var2.getPaint().getFontMetricsInt(), false, null, 0)));
            } else if (i10 > 0) {
                setSubtitle(g(hd.G(i10, "StoryPrivacyOptionPeople", new Object[0])));
            } else {
                setSubtitle(g(hd.M0(2131744520, null)));
            }
            org.telegram.ui.ActionBar.r6.Y(k5Var2, org.telegram.ui.ActionBar.k6.f28029n5, f6Var);
            w8Var.g(6);
            w8Var.i(-18621, -618956);
        }
        this.f12750f.setVisibility(8);
        if (!this.f12753s) {
            i11 = 8;
        }
        this.h.setVisibility(i11);
        org.telegram.ui.Components.l9 l9Var = this.f12748c;
        l9Var.setImageDrawable(w8Var);
        l9Var.setRoundRadius(org.telegram.messenger.g0.L(20.0f));
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
        if (hd.f22871a0) {
            i7 = 5;
        } else {
            i7 = 3;
        }
        int i17 = i7 | 16;
        boolean z9 = this.f12753s;
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
        this.f12748c.setLayoutParams(c8.ha.d(40, 40.0f, i17, f10, 0.0f, f11, 0.0f));
        boolean z10 = hd.f22871a0;
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
            if (this.f12753s) {
                i11 = 105;
            } else {
                i11 = 68;
            }
            f12 = i11;
        }
        if (z10) {
            if (this.f12753s) {
                i15 = 105;
            } else {
                i15 = 68;
            }
            f13 = i15;
        } else {
            f13 = 20.0f;
        }
        this.d.setLayoutParams(c8.ha.d(-1, -2.0f, i18, f12, 0.0f, f13, 0.0f));
        boolean z11 = hd.f22871a0;
        if (z11) {
            i12 = 5;
        } else {
            i12 = 3;
        }
        int i20 = i12 | 16;
        if (z11) {
            f14 = 20.0f;
        } else {
            if (this.f12753s) {
                i13 = 105;
            } else {
                i13 = 68;
            }
            f14 = i13;
        }
        if (z11) {
            if (this.f12753s) {
                i19 = 105;
            }
            f15 = i19;
        }
        this.f12749e.setLayoutParams(c8.ha.d(-1, -2.0f, i20, f14, 0.0f, f15, 0.0f));
        if (hd.f22871a0) {
            i14 = 5;
        } else {
            i14 = 3;
        }
        this.f12750f.setLayoutParams(c8.ha.d(24, 24.0f, i14 | 16, 13.0f, 0.0f, 14.0f, 0.0f));
        if (hd.f22871a0) {
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
            int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27849d7, this.f12746a);
            Paint paint2 = this.f12751n;
            paint2.setColor(w02);
            if (hd.f22871a0) {
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
        if (path != null && (paint = this.F) != null && !this.f12753s && this.f12752r && this.f12754w) {
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
        if (this.f12752r && !this.f12753s) {
            f10 = 62.0f;
        } else {
            f10 = 56.0f;
        }
        super.onMeasure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(f10), 1073741824));
        if (!this.f12753s && this.f12752r) {
            Path path = this.E;
            if (path == null) {
                this.E = new Path();
            } else {
                path.rewind();
            }
            if (hd.f22871a0) {
                measuredWidth = org.telegram.messenger.g0.L(31.0f);
            } else {
                measuredWidth = getMeasuredWidth() - org.telegram.messenger.g0.L(31.0f);
            }
            float f12 = measuredWidth;
            float measuredHeight = getMeasuredHeight() / 2.0f;
            if (hd.f22871a0) {
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
            this.F.setColor(org.telegram.ui.ActionBar.k6.r1(0.3f, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.G6, this.f12746a)));
        }
    }

    public void set(Object obj) {
        int i7;
        boolean z9 = obj instanceof TLRPC.User;
        org.telegram.ui.ActionBar.k5 k5Var = this.d;
        if (z9) {
            k5Var.setTypeface(org.telegram.messenger.g0.o());
            k5Var.setTranslationX(0.0f);
            setUser((TLRPC.User) obj);
        } else if (obj instanceof TLRPC.Chat) {
            k5Var.setTypeface(org.telegram.messenger.g0.o());
            k5Var.setTranslationX(0.0f);
            a(0, (TLRPC.Chat) obj);
        } else if (obj instanceof String) {
            k5Var.setTypeface(null);
            int i10 = -org.telegram.messenger.g0.L(52.0f);
            if (hd.f22871a0) {
                i7 = -1;
            } else {
                i7 = 1;
            }
            k5Var.setTranslationX(i10 * i7);
            k5Var.l((String) obj, false);
        }
    }

    public void setDivider(boolean z9) {
        boolean z10;
        this.D = z9;
        if (!z9 && (this.f12753s || !this.f12752r)) {
            z10 = true;
        } else {
            z10 = false;
        }
        setWillNotDraw(z10);
    }

    public void setRedCheckbox(boolean z9) {
        int i7;
        if (z9) {
            i7 = org.telegram.ui.ActionBar.k6.kk;
        } else {
            i7 = org.telegram.ui.ActionBar.k6.B5;
        }
        this.f12750f.b(i7, org.telegram.ui.ActionBar.k6.f27958j7, org.telegram.ui.ActionBar.k6.C5);
    }

    public void setUser(TLRPC.User user) {
        long j3;
        int i7;
        if (user == null) {
            j3 = 0;
        } else {
            j3 = user.f27101id;
        }
        this.f12756y = j3;
        org.telegram.ui.Components.w8 w8Var = this.f12747b;
        w8Var.r(user);
        int L = org.telegram.messenger.g0.L(20.0f);
        org.telegram.ui.Components.l9 l9Var = this.f12748c;
        l9Var.setRoundRadius(L);
        l9Var.e(user, w8Var);
        String p10 = t10.p(user);
        org.telegram.ui.ActionBar.k5 k5Var = this.d;
        int i10 = 0;
        k5Var.l(org.telegram.messenger.i6.m(p10, k5Var.getPaint().getFontMetricsInt(), false, null, 0), false);
        boolean[] zArr = this.f12755x;
        zArr[0] = false;
        boolean z9 = this.f12752r;
        org.telegram.ui.ActionBar.f6 f6Var = this.f12746a;
        org.telegram.ui.ActionBar.k5 k5Var2 = this.f12749e;
        if (z9) {
            setSubtitle(hd.M0(2131743350, null));
            org.telegram.ui.ActionBar.r6.Y(k5Var2, org.telegram.ui.ActionBar.k6.f28106r5, f6Var);
        } else {
            setSubtitle(hd.d0(p10.f24459s0, user, zArr, null));
            if (zArr[0]) {
                i7 = org.telegram.ui.ActionBar.k6.f28029n5;
            } else {
                i7 = org.telegram.ui.ActionBar.k6.f28106r5;
            }
            org.telegram.ui.ActionBar.r6.Y(k5Var2, i7, f6Var);
        }
        if (!this.f12753s) {
            i10 = 8;
        }
        wo woVar = this.f12750f;
        woVar.setVisibility(i10);
        woVar.setAlpha(1.0f);
        this.h.setVisibility(8);
    }

    @Override
    public final void updateColors() {
        try {
            Paint paint = this.F;
            if (paint != null) {
                paint.setColor(org.telegram.ui.ActionBar.k6.r1(0.3f, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.G6, this.f12746a)));
                invalidate();
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }
}
