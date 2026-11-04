package gi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.FrameLayout;
import b8.mf;
import java.util.HashSet;
import org.telegram.messenger.bd;
import org.telegram.messenger.h10;
import org.telegram.messenger.hs;
import org.telegram.messenger.l10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.RadioButton;
import org.telegram.ui.Components.wo;
import org.telegram.ui.Components.wp;
public final class s8 extends FrameLayout implements org.telegram.ui.ActionBar.z5 {
    public boolean E;
    public Path F;
    public Paint G;
    public final org.telegram.ui.ActionBar.e6 f13569a;
    public final org.telegram.ui.Components.u8 f13570b;
    public final org.telegram.ui.Components.k9 f13571c;
    public final org.telegram.ui.ActionBar.k5 d;
    public final org.telegram.ui.ActionBar.k5 f13572e;
    public final wo f13573f;
    public final RadioButton h;
    public final Paint f13574n;
    public boolean f13575r;
    public boolean f13576s;
    public boolean f13577w;
    public final boolean[] f13578x;
    public long f13579y;

    public s8(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        int i3;
        org.telegram.ui.Components.u8 u8Var = new org.telegram.ui.Components.u8((org.telegram.ui.ActionBar.e6) null);
        this.f13570b = u8Var;
        this.f13574n = new Paint(1);
        this.f13575r = false;
        this.f13576s = true;
        this.f13577w = true;
        this.f13578x = new boolean[1];
        this.f13569a = e6Var;
        u8Var.f38693r = org.telegram.messenger.g0.L(40.0f);
        org.telegram.ui.Components.k9 k9Var = new org.telegram.ui.Components.k9(context);
        this.f13571c = k9Var;
        k9Var.setRoundRadius(org.telegram.messenger.g0.L(20.0f));
        addView(k9Var);
        org.telegram.ui.ActionBar.k5 k5Var = new org.telegram.ui.ActionBar.k5(context);
        this.d = k5Var;
        k5Var.setTypeface(org.telegram.messenger.g0.o());
        k5Var.setTextSize(16);
        int i10 = org.telegram.ui.ActionBar.k6.f27988j5;
        org.telegram.ui.ActionBar.r6.Y(k5Var, i10, e6Var);
        if (bd.f21784a0) {
            i3 = 5;
        } else {
            i3 = 3;
        }
        k5Var.setGravity(i3);
        hs.i(k5Var);
        addView(k5Var);
        org.telegram.ui.ActionBar.k5 k5Var2 = new org.telegram.ui.ActionBar.k5(context);
        this.f13572e = k5Var2;
        k5Var2.setTextSize(14);
        org.telegram.ui.ActionBar.r6.Y(k5Var2, i10, e6Var);
        k5Var2.setGravity(bd.f21784a0 ? 5 : 3);
        hs.i(k5Var2);
        addView(k5Var2);
        wo woVar = new wo(21, context, e6Var);
        this.f13573f = woVar;
        int i11 = org.telegram.ui.ActionBar.k6.B5;
        int i12 = org.telegram.ui.ActionBar.k6.f27990j7;
        woVar.b(i11, i12, org.telegram.ui.ActionBar.k6.C5);
        woVar.setDrawUnchecked(true);
        woVar.setDrawBackgroundAsArc(10);
        addView(woVar);
        woVar.a(false, false);
        woVar.setVisibility(8);
        RadioButton radioButton = new RadioButton(context);
        this.h = radioButton;
        radioButton.setSize(org.telegram.messenger.g0.L(20.0f));
        org.telegram.ui.ActionBar.r6.P(radioButton, i12, org.telegram.ui.ActionBar.k6.E5, e6Var);
        addView(radioButton);
        radioButton.setVisibility(8);
        f();
    }

    private void setSubtitle(CharSequence charSequence) {
        org.telegram.ui.ActionBar.k5 k5Var = this.d;
        org.telegram.ui.ActionBar.k5 k5Var2 = this.f13572e;
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

    public final void a(int i3, TLRPC.Chat chat) {
        long j10;
        float f10;
        String lowerCase;
        int i10;
        int i11;
        float f11;
        int i12;
        if (chat == null) {
            j10 = 0;
        } else {
            j10 = -chat.f27001id;
        }
        this.f13579y = j10;
        org.telegram.ui.Components.u8 u8Var = this.f13570b;
        u8Var.q(chat);
        if (org.telegram.messenger.t3.c0(chat)) {
            f10 = 12.0f;
        } else {
            f10 = 20.0f;
        }
        int L = org.telegram.messenger.g0.L(f10);
        org.telegram.ui.Components.k9 k9Var = this.f13571c;
        k9Var.setRoundRadius(L);
        k9Var.e(chat, u8Var);
        String str = chat.title;
        org.telegram.ui.ActionBar.k5 k5Var = this.d;
        k5Var.l(org.telegram.messenger.i6.m(str, k5Var.getPaint().getFontMetricsInt(), false, null, 0), false);
        boolean[] zArr = this.f13578x;
        zArr[0] = false;
        String str2 = "Members";
        if (this.f13575r) {
            if (i3 <= 0) {
                i3 = chat.participants_count;
            }
            boolean V = org.telegram.messenger.t3.V(chat);
            if (i3 >= 1) {
                if (V) {
                    str2 = "Subscribers";
                }
                lowerCase = bd.G(i3, str2, new Object[0]);
            } else {
                if (V) {
                    i12 = 2131751391;
                } else {
                    i12 = 2131754876;
                }
                lowerCase = bd.M0(i12, null);
            }
        } else if (org.telegram.messenger.t3.T(chat) && !chat.megagroup) {
            if (i3 >= 1) {
                lowerCase = bd.H(',', "Subscribers", i3 - 1);
            } else if (!org.telegram.messenger.t3.t0(chat)) {
                lowerCase = bd.M0(2131752329, null).toLowerCase();
            } else {
                lowerCase = bd.M0(2131752318, null).toLowerCase();
            }
        } else if (i3 >= 1) {
            lowerCase = bd.H(',', "Members", i3 - 1);
        } else if (chat.has_geo) {
            lowerCase = bd.M0(2131748650, null);
        } else if (!org.telegram.messenger.t3.t0(chat)) {
            lowerCase = bd.M0(2131748649, null).toLowerCase();
        } else {
            lowerCase = bd.M0(2131748646, null).toLowerCase();
        }
        setSubtitle(lowerCase);
        if (zArr[0]) {
            i10 = org.telegram.ui.ActionBar.k6.f28061n5;
        } else {
            i10 = org.telegram.ui.ActionBar.k6.r5;
        }
        org.telegram.ui.ActionBar.r6.Y(this.f13572e, i10, this.f13569a);
        if (this.f13576s) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        this.f13573f.setVisibility(i11);
        this.h.setVisibility(8);
        if (i3 > 200) {
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

    public final void b(boolean z10, float f10) {
        RadioButton radioButton = this.h;
        wo woVar = this.f13573f;
        if (z10) {
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

    public final void c(boolean z10, boolean z11) {
        wo woVar = this.f13573f;
        if (woVar.getVisibility() == 0) {
            woVar.a(z10, z11);
        }
        RadioButton radioButton = this.h;
        if (radioButton.getVisibility() == 0) {
            radioButton.a(z10, z11);
        }
    }

    public final void d(boolean z10, boolean z11) {
        boolean z12;
        this.f13575r = z10;
        if (z11 != this.f13576s) {
            this.f13576s = z11;
            f();
        }
        if (!this.f13576s) {
            this.h.setVisibility(8);
            this.f13573f.setVisibility(8);
        }
        if (!this.E && (this.f13576s || !this.f13575r)) {
            z12 = true;
        } else {
            z12 = false;
        }
        setWillNotDraw(z12);
    }

    public final void e(int i3, int i10, TLRPC.User user) {
        org.telegram.ui.ActionBar.e6 e6Var = this.f13569a;
        org.telegram.ui.ActionBar.k5 k5Var = this.d;
        org.telegram.ui.ActionBar.k5 k5Var2 = this.f13572e;
        org.telegram.ui.Components.u8 u8Var = this.f13570b;
        int i11 = 0;
        if (i3 == 4) {
            k5Var.l(bd.M0(2131744538, null), false);
            if (i10 == 1 && user != null) {
                setSubtitle(g(org.telegram.messenger.i6.m(bd.a0(null, null, 2131744534, l10.p(user)), k5Var2.getPaint().getFontMetricsInt(), false, null, 0)));
            } else if (i10 > 0) {
                setSubtitle(g(bd.G(i10, "StoryPrivacyOptionExcludePeople", new Object[0])));
            } else {
                setSubtitle(g(bd.M0(2131744539, null)));
            }
            org.telegram.ui.ActionBar.r6.Y(k5Var2, org.telegram.ui.ActionBar.k6.f28061n5, e6Var);
            u8Var.g(7);
            u8Var.i(-15292942, -15630089);
        } else if (i3 == 2) {
            k5Var.l(bd.M0(2131744540, null), false);
            if (i10 == 1 && user != null) {
                setSubtitle(g(org.telegram.messenger.i6.m(bd.a0(null, null, 2131744534, l10.p(user)), k5Var2.getPaint().getFontMetricsInt(), false, null, 0)));
            } else if (i10 > 0) {
                setSubtitle(g(bd.G(i10, "StoryPrivacyOptionExcludePeople", new Object[0])));
            } else {
                setSubtitle(g(bd.M0(2131744539, null)));
            }
            org.telegram.ui.ActionBar.r6.Y(k5Var2, org.telegram.ui.ActionBar.k6.f28061n5, e6Var);
            u8Var.g(4);
            u8Var.i(-3905294, -6923014);
        } else if (i3 == 1) {
            k5Var.l(bd.M0(2131744542, null), false);
            if (i10 == 1 && user != null) {
                setSubtitle(g(org.telegram.messenger.i6.m(l10.p(user), k5Var2.getPaint().getFontMetricsInt(), false, null, 0)));
            } else if (i10 > 0) {
                setSubtitle(g(bd.G(i10, "StoryPrivacyOptionPeople", new Object[0])));
            } else {
                setSubtitle(g(bd.M0(2131744541, null)));
            }
            org.telegram.ui.ActionBar.r6.Y(k5Var2, org.telegram.ui.ActionBar.k6.f28061n5, e6Var);
            u8Var.g(15);
            u8Var.i(-7808710, -13781445);
        } else if (i3 == 3) {
            k5Var.l(bd.M0(2131744530, null), false);
            if (i10 == 1 && user != null) {
                setSubtitle(g(org.telegram.messenger.i6.m(l10.p(user), k5Var2.getPaint().getFontMetricsInt(), false, null, 0)));
            } else if (i10 > 0) {
                setSubtitle(g(bd.G(i10, "StoryPrivacyOptionPeople", new Object[0])));
            } else {
                setSubtitle(g(bd.M0(2131744529, null)));
            }
            org.telegram.ui.ActionBar.r6.Y(k5Var2, org.telegram.ui.ActionBar.k6.f28061n5, e6Var);
            u8Var.g(6);
            u8Var.i(-18621, -618956);
        }
        this.f13573f.setVisibility(8);
        if (!this.f13576s) {
            i11 = 8;
        }
        this.h.setVisibility(i11);
        org.telegram.ui.Components.k9 k9Var = this.f13571c;
        k9Var.setImageDrawable(u8Var);
        k9Var.setRoundRadius(org.telegram.messenger.g0.L(20.0f));
    }

    public final void f() {
        int i3;
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
        if (bd.f21784a0) {
            i3 = 5;
        } else {
            i3 = 3;
        }
        int i17 = i3 | 16;
        boolean z10 = this.f13576s;
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
        this.f13571c.setLayoutParams(mf.d(40, 40.0f, i17, f10, 0.0f, f11, 0.0f));
        boolean z11 = bd.f21784a0;
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
            if (this.f13576s) {
                i11 = 105;
            } else {
                i11 = 68;
            }
            f12 = i11;
        }
        if (z11) {
            if (this.f13576s) {
                i15 = 105;
            } else {
                i15 = 68;
            }
            f13 = i15;
        } else {
            f13 = 20.0f;
        }
        this.d.setLayoutParams(mf.d(-1, -2.0f, i18, f12, 0.0f, f13, 0.0f));
        boolean z12 = bd.f21784a0;
        if (z12) {
            i12 = 5;
        } else {
            i12 = 3;
        }
        int i20 = i12 | 16;
        if (z12) {
            f14 = 20.0f;
        } else {
            if (this.f13576s) {
                i13 = 105;
            } else {
                i13 = 68;
            }
            f14 = i13;
        }
        if (z12) {
            if (this.f13576s) {
                i19 = 105;
            }
            f15 = i19;
        }
        this.f13572e.setLayoutParams(mf.d(-1, -2.0f, i20, f14, 0.0f, f15, 0.0f));
        if (bd.f21784a0) {
            i14 = 5;
        } else {
            i14 = 3;
        }
        this.f13573f.setLayoutParams(mf.d(24, 24.0f, i14 | 16, 13.0f, 0.0f, 14.0f, 0.0f));
        if (bd.f21784a0) {
            i16 = 5;
        }
        this.h.setLayoutParams(mf.d(22, 22.0f, i16 | 16, 14.0f, 0.0f, 15.0f, 0.0f));
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
        if (this.E) {
            int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27879d7, this.f13569a);
            Paint paint2 = this.f13574n;
            paint2.setColor(w02);
            if (bd.f21784a0) {
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
        if (path != null && (paint = this.G) != null && !this.f13576s && this.f13575r && this.f13577w) {
            canvas2.drawPath(path, paint);
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo r7) {
        throw new UnsupportedOperationException("Method not decompiled: gi.s8.onInitializeAccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo):void");
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        float f10;
        int measuredWidth;
        float f11;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3), 1073741824);
        if (this.f13575r && !this.f13576s) {
            f10 = 62.0f;
        } else {
            f10 = 56.0f;
        }
        super.onMeasure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(f10), 1073741824));
        if (!this.f13576s && this.f13575r) {
            Path path = this.F;
            if (path == null) {
                this.F = new Path();
            } else {
                path.rewind();
            }
            if (bd.f21784a0) {
                measuredWidth = org.telegram.messenger.g0.L(31.0f);
            } else {
                measuredWidth = getMeasuredWidth() - org.telegram.messenger.g0.L(31.0f);
            }
            float f12 = measuredWidth;
            float measuredHeight = getMeasuredHeight() / 2.0f;
            if (bd.f21784a0) {
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
            this.G.setColor(org.telegram.ui.ActionBar.k6.r1(0.3f, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.G6, this.f13569a)));
        }
    }

    public void set(Object obj) {
        int i3;
        boolean z10 = obj instanceof TLRPC.User;
        org.telegram.ui.ActionBar.k5 k5Var = this.d;
        if (z10) {
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
            if (bd.f21784a0) {
                i3 = -1;
            } else {
                i3 = 1;
            }
            k5Var.setTranslationX(i10 * i3);
            k5Var.l((String) obj, false);
        }
    }

    public void setDivider(boolean z10) {
        boolean z11;
        this.E = z10;
        if (!z10 && (this.f13576s || !this.f13575r)) {
            z11 = true;
        } else {
            z11 = false;
        }
        setWillNotDraw(z11);
    }

    public void setRedCheckbox(boolean z10) {
        int i3;
        if (z10) {
            i3 = org.telegram.ui.ActionBar.k6.kk;
        } else {
            i3 = org.telegram.ui.ActionBar.k6.B5;
        }
        this.f13573f.b(i3, org.telegram.ui.ActionBar.k6.f27990j7, org.telegram.ui.ActionBar.k6.C5);
    }

    public void setUser(TLRPC.User user) {
        long j10;
        int i3;
        if (user == null) {
            j10 = 0;
        } else {
            j10 = user.f27150id;
        }
        this.f13579y = j10;
        org.telegram.ui.Components.u8 u8Var = this.f13570b;
        u8Var.r(user);
        int L = org.telegram.messenger.g0.L(20.0f);
        org.telegram.ui.Components.k9 k9Var = this.f13571c;
        k9Var.setRoundRadius(L);
        k9Var.e(user, u8Var);
        String p10 = l10.p(user);
        org.telegram.ui.ActionBar.k5 k5Var = this.d;
        int i10 = 0;
        k5Var.l(org.telegram.messenger.i6.m(p10, k5Var.getPaint().getFontMetricsInt(), false, null, 0), false);
        boolean[] zArr = this.f13578x;
        zArr[0] = false;
        boolean z10 = this.f13575r;
        org.telegram.ui.ActionBar.e6 e6Var = this.f13569a;
        org.telegram.ui.ActionBar.k5 k5Var2 = this.f13572e;
        if (z10) {
            setSubtitle(bd.M0(2131743359, null));
            org.telegram.ui.ActionBar.r6.Y(k5Var2, org.telegram.ui.ActionBar.k6.r5, e6Var);
        } else {
            setSubtitle(bd.d0(h10.f22829t0, user, zArr, null));
            if (zArr[0]) {
                i3 = org.telegram.ui.ActionBar.k6.f28061n5;
            } else {
                i3 = org.telegram.ui.ActionBar.k6.r5;
            }
            org.telegram.ui.ActionBar.r6.Y(k5Var2, i3, e6Var);
        }
        if (!this.f13576s) {
            i10 = 8;
        }
        wo woVar = this.f13573f;
        woVar.setVisibility(i10);
        woVar.setAlpha(1.0f);
        this.h.setVisibility(8);
    }

    @Override
    public final void updateColors() {
        try {
            Paint paint = this.G;
            if (paint != null) {
                paint.setColor(org.telegram.ui.ActionBar.k6.r1(0.3f, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.G6, this.f13569a)));
                invalidate();
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }
}
