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
import org.telegram.messenger.gd;
import org.telegram.messenger.j10;
import org.telegram.messenger.ks;
import org.telegram.messenger.o10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.RadioButton;
import org.telegram.ui.Components.lq;
import org.telegram.ui.Components.mp;
public final class p8 extends FrameLayout implements org.telegram.ui.ActionBar.c6 {
    public boolean E;
    public Path F;
    public Paint G;
    public final org.telegram.ui.ActionBar.i6 f15241a;
    public final org.telegram.ui.Components.b9 f15242b;
    public final org.telegram.ui.Components.q9 f15243c;
    public final org.telegram.ui.ActionBar.n5 d;
    public final org.telegram.ui.ActionBar.n5 f15244e;
    public final mp f15245f;
    public final RadioButton h;
    public final Paint f15246n;
    public boolean f15247r;
    public boolean f15248s;
    public boolean f15249w;
    public final boolean[] f15250x;
    public long f15251y;

    public p8(Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context);
        int i7;
        org.telegram.ui.Components.b9 b9Var = new org.telegram.ui.Components.b9((org.telegram.ui.ActionBar.i6) null);
        this.f15242b = b9Var;
        this.f15246n = new Paint(1);
        this.f15247r = false;
        this.f15248s = true;
        this.f15249w = true;
        this.f15250x = new boolean[1];
        this.f15241a = i6Var;
        b9Var.f33603r = org.telegram.messenger.g0.L(40.0f);
        org.telegram.ui.Components.q9 q9Var = new org.telegram.ui.Components.q9(context);
        this.f15243c = q9Var;
        q9Var.setRoundRadius(org.telegram.messenger.g0.L(20.0f));
        addView(q9Var);
        org.telegram.ui.ActionBar.n5 n5Var = new org.telegram.ui.ActionBar.n5(context);
        this.d = n5Var;
        n5Var.setTypeface(org.telegram.messenger.g0.o());
        n5Var.setTextSize(16);
        int i10 = org.telegram.ui.ActionBar.n6.f29502j5;
        org.telegram.ui.ActionBar.u6.X(n5Var, i10, i6Var);
        if (gd.f24213a0) {
            i7 = 5;
        } else {
            i7 = 3;
        }
        n5Var.setGravity(i7);
        ks.i(n5Var);
        addView(n5Var);
        org.telegram.ui.ActionBar.n5 n5Var2 = new org.telegram.ui.ActionBar.n5(context);
        this.f15244e = n5Var2;
        n5Var2.setTextSize(14);
        org.telegram.ui.ActionBar.u6.X(n5Var2, i10, i6Var);
        n5Var2.setGravity(gd.f24213a0 ? 5 : 3);
        ks.i(n5Var2);
        addView(n5Var2);
        mp mpVar = new mp(21, context, i6Var);
        this.f15245f = mpVar;
        int i11 = org.telegram.ui.ActionBar.n6.B5;
        int i12 = org.telegram.ui.ActionBar.n6.f29504j7;
        mpVar.b(i11, i12, org.telegram.ui.ActionBar.n6.C5);
        mpVar.setDrawUnchecked(true);
        mpVar.setDrawBackgroundAsArc(10);
        addView(mpVar);
        mpVar.a(false, false);
        mpVar.setVisibility(8);
        RadioButton radioButton = new RadioButton(context);
        this.h = radioButton;
        radioButton.setSize(org.telegram.messenger.g0.L(20.0f));
        org.telegram.ui.ActionBar.u6.O(radioButton, i12, org.telegram.ui.ActionBar.n6.E5, i6Var);
        addView(radioButton);
        radioButton.setVisibility(8);
        f();
    }

    private void setSubtitle(CharSequence charSequence) {
        org.telegram.ui.ActionBar.n5 n5Var = this.d;
        org.telegram.ui.ActionBar.n5 n5Var2 = this.f15244e;
        if (charSequence == null) {
            n5Var.setTranslationY(0.0f);
            n5Var2.setVisibility(8);
            return;
        }
        n5Var.setTranslationY(org.telegram.messenger.g0.L(-9.0f));
        n5Var2.setTranslationY(org.telegram.messenger.g0.L(12.0f));
        n5Var2.l(charSequence, false);
        n5Var2.setVisibility(0);
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
            j3 = -chat.f28403id;
        }
        this.f15251y = j3;
        org.telegram.ui.Components.b9 b9Var = this.f15242b;
        b9Var.q(chat);
        if (org.telegram.messenger.v3.c0(chat)) {
            f10 = 12.0f;
        } else {
            f10 = 20.0f;
        }
        int L = org.telegram.messenger.g0.L(f10);
        org.telegram.ui.Components.q9 q9Var = this.f15243c;
        q9Var.setRoundRadius(L);
        q9Var.f(chat, b9Var);
        String str = chat.title;
        org.telegram.ui.ActionBar.n5 n5Var = this.d;
        n5Var.l(org.telegram.messenger.j6.m(str, n5Var.getPaint().getFontMetricsInt(), false, null, 0), false);
        boolean[] zArr = this.f15250x;
        zArr[0] = false;
        String str2 = "Members";
        if (this.f15247r) {
            if (i7 <= 0) {
                i7 = chat.participants_count;
            }
            boolean V = org.telegram.messenger.v3.V(chat);
            if (i7 >= 1) {
                if (V) {
                    str2 = "Subscribers";
                }
                lowerCase = gd.G(i7, str2, new Object[0]);
            } else {
                if (V) {
                    i12 = 2131751379;
                } else {
                    i12 = 2131754876;
                }
                lowerCase = gd.M0(i12, null);
            }
        } else if (org.telegram.messenger.v3.T(chat) && !chat.megagroup) {
            if (i7 >= 1) {
                lowerCase = gd.H(',', "Subscribers", i7 - 1);
            } else if (!org.telegram.messenger.v3.t0(chat)) {
                lowerCase = gd.M0(2131752318, null).toLowerCase();
            } else {
                lowerCase = gd.M0(2131752307, null).toLowerCase();
            }
        } else if (i7 >= 1) {
            lowerCase = gd.H(',', "Members", i7 - 1);
        } else if (chat.has_geo) {
            lowerCase = gd.M0(2131748450, null);
        } else if (!org.telegram.messenger.v3.t0(chat)) {
            lowerCase = gd.M0(2131748449, null).toLowerCase();
        } else {
            lowerCase = gd.M0(2131748446, null).toLowerCase();
        }
        setSubtitle(lowerCase);
        if (zArr[0]) {
            i10 = org.telegram.ui.ActionBar.n6.f29575n5;
        } else {
            i10 = org.telegram.ui.ActionBar.n6.f29652r5;
        }
        org.telegram.ui.ActionBar.u6.X(this.f15244e, i10, this.f15241a);
        if (this.f15248s) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        this.f15245f.setVisibility(i11);
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
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.G6));
    }

    public final void b(boolean z10, float f10) {
        RadioButton radioButton = this.h;
        mp mpVar = this.f15245f;
        if (z10) {
            if (Math.abs(mpVar.getAlpha() - f10) > 0.1d) {
                mpVar.animate().cancel();
                mpVar.animate().alpha(f10).start();
            }
            if (Math.abs(radioButton.getAlpha() - f10) > 0.1d) {
                radioButton.animate().cancel();
                radioButton.animate().alpha(f10).start();
                return;
            }
            return;
        }
        mpVar.animate().cancel();
        mpVar.setAlpha(f10);
        radioButton.animate().cancel();
        radioButton.setAlpha(f10);
    }

    public final void c(boolean z10, boolean z11) {
        mp mpVar = this.f15245f;
        if (mpVar.getVisibility() == 0) {
            mpVar.a(z10, z11);
        }
        RadioButton radioButton = this.h;
        if (radioButton.getVisibility() == 0) {
            radioButton.a(z10, z11);
        }
    }

    public final void d(boolean z10, boolean z11) {
        boolean z12;
        this.f15247r = z10;
        if (z11 != this.f15248s) {
            this.f15248s = z11;
            f();
        }
        if (!this.f15248s) {
            this.h.setVisibility(8);
            this.f15245f.setVisibility(8);
        }
        if (!this.E && (this.f15248s || !this.f15247r)) {
            z12 = true;
        } else {
            z12 = false;
        }
        setWillNotDraw(z12);
    }

    public final void e(int i7, int i10, TLRPC.User user) {
        org.telegram.ui.ActionBar.i6 i6Var = this.f15241a;
        org.telegram.ui.ActionBar.n5 n5Var = this.d;
        org.telegram.ui.ActionBar.n5 n5Var2 = this.f15244e;
        org.telegram.ui.Components.b9 b9Var = this.f15242b;
        int i11 = 0;
        if (i7 == 4) {
            n5Var.l(gd.M0(2131744293, null), false);
            if (i10 == 1 && user != null) {
                setSubtitle(g(org.telegram.messenger.j6.m(gd.a0(null, null, 2131744289, o10.q(user)), n5Var2.getPaint().getFontMetricsInt(), false, null, 0)));
            } else if (i10 > 0) {
                setSubtitle(g(gd.G(i10, "StoryPrivacyOptionExcludePeople", new Object[0])));
            } else {
                setSubtitle(g(gd.M0(2131744294, null)));
            }
            org.telegram.ui.ActionBar.u6.X(n5Var2, org.telegram.ui.ActionBar.n6.f29575n5, i6Var);
            b9Var.g(7);
            b9Var.i(-15292942, -15630089);
        } else if (i7 == 2) {
            n5Var.l(gd.M0(2131744295, null), false);
            if (i10 == 1 && user != null) {
                setSubtitle(g(org.telegram.messenger.j6.m(gd.a0(null, null, 2131744289, o10.q(user)), n5Var2.getPaint().getFontMetricsInt(), false, null, 0)));
            } else if (i10 > 0) {
                setSubtitle(g(gd.G(i10, "StoryPrivacyOptionExcludePeople", new Object[0])));
            } else {
                setSubtitle(g(gd.M0(2131744294, null)));
            }
            org.telegram.ui.ActionBar.u6.X(n5Var2, org.telegram.ui.ActionBar.n6.f29575n5, i6Var);
            b9Var.g(4);
            b9Var.i(-3905294, -6923014);
        } else if (i7 == 1) {
            n5Var.l(gd.M0(2131744297, null), false);
            if (i10 == 1 && user != null) {
                setSubtitle(g(org.telegram.messenger.j6.m(o10.q(user), n5Var2.getPaint().getFontMetricsInt(), false, null, 0)));
            } else if (i10 > 0) {
                setSubtitle(g(gd.G(i10, "StoryPrivacyOptionPeople", new Object[0])));
            } else {
                setSubtitle(g(gd.M0(2131744296, null)));
            }
            org.telegram.ui.ActionBar.u6.X(n5Var2, org.telegram.ui.ActionBar.n6.f29575n5, i6Var);
            b9Var.g(15);
            b9Var.i(-7808710, -13781445);
        } else if (i7 == 3) {
            n5Var.l(gd.M0(2131744285, null), false);
            if (i10 == 1 && user != null) {
                setSubtitle(g(org.telegram.messenger.j6.m(o10.q(user), n5Var2.getPaint().getFontMetricsInt(), false, null, 0)));
            } else if (i10 > 0) {
                setSubtitle(g(gd.G(i10, "StoryPrivacyOptionPeople", new Object[0])));
            } else {
                setSubtitle(g(gd.M0(2131744284, null)));
            }
            org.telegram.ui.ActionBar.u6.X(n5Var2, org.telegram.ui.ActionBar.n6.f29575n5, i6Var);
            b9Var.g(6);
            b9Var.i(-18621, -618956);
        }
        this.f15245f.setVisibility(8);
        if (!this.f15248s) {
            i11 = 8;
        }
        this.h.setVisibility(i11);
        org.telegram.ui.Components.q9 q9Var = this.f15243c;
        q9Var.setImageDrawable(b9Var);
        q9Var.setRoundRadius(org.telegram.messenger.g0.L(20.0f));
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
        if (gd.f24213a0) {
            i7 = 5;
        } else {
            i7 = 3;
        }
        int i17 = i7 | 16;
        boolean z10 = this.f15248s;
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
        this.f15243c.setLayoutParams(c8.ma.d(40, 40.0f, i17, f10, 0.0f, f11, 0.0f));
        boolean z11 = gd.f24213a0;
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
            if (this.f15248s) {
                i11 = 105;
            } else {
                i11 = 68;
            }
            f12 = i11;
        }
        if (z11) {
            if (this.f15248s) {
                i15 = 105;
            } else {
                i15 = 68;
            }
            f13 = i15;
        } else {
            f13 = 20.0f;
        }
        this.d.setLayoutParams(c8.ma.d(-1, -2.0f, i18, f12, 0.0f, f13, 0.0f));
        boolean z12 = gd.f24213a0;
        if (z12) {
            i12 = 5;
        } else {
            i12 = 3;
        }
        int i20 = i12 | 16;
        if (z12) {
            f14 = 20.0f;
        } else {
            if (this.f15248s) {
                i13 = 105;
            } else {
                i13 = 68;
            }
            f14 = i13;
        }
        if (z12) {
            if (this.f15248s) {
                i19 = 105;
            }
            f15 = i19;
        }
        this.f15244e.setLayoutParams(c8.ma.d(-1, -2.0f, i20, f14, 0.0f, f15, 0.0f));
        if (gd.f24213a0) {
            i14 = 5;
        } else {
            i14 = 3;
        }
        this.f15245f.setLayoutParams(c8.ma.d(24, 24.0f, i14 | 16, 13.0f, 0.0f, 14.0f, 0.0f));
        if (gd.f24213a0) {
            i16 = 5;
        }
        this.h.setLayoutParams(c8.ma.d(22, 22.0f, i16 | 16, 14.0f, 0.0f, 15.0f, 0.0f));
    }

    public final SpannableStringBuilder g(CharSequence charSequence) {
        SpannableString spannableString = new SpannableString(">");
        Drawable drawable = getContext().getResources().getDrawable(2131230875);
        lq lqVar = new lq(2, drawable);
        drawable.setBounds(0, org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(11.0f), org.telegram.messenger.g0.L(12.0f));
        spannableString.setSpan(lqVar, 0, spannableString.length(), 33);
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
            int w02 = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29395d7, this.f15241a);
            Paint paint2 = this.f15246n;
            paint2.setColor(w02);
            if (gd.f24213a0) {
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
        if (path != null && (paint = this.G) != null && !this.f15248s && this.f15247r && this.f15249w) {
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
        if (this.f15247r && !this.f15248s) {
            f10 = 62.0f;
        } else {
            f10 = 56.0f;
        }
        super.onMeasure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(f10), 1073741824));
        if (!this.f15248s && this.f15247r) {
            Path path = this.F;
            if (path == null) {
                this.F = new Path();
            } else {
                path.rewind();
            }
            if (gd.f24213a0) {
                measuredWidth = org.telegram.messenger.g0.L(31.0f);
            } else {
                measuredWidth = getMeasuredWidth() - org.telegram.messenger.g0.L(31.0f);
            }
            float f12 = measuredWidth;
            float measuredHeight = getMeasuredHeight() / 2.0f;
            if (gd.f24213a0) {
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
            this.G.setColor(org.telegram.ui.ActionBar.n6.r1(0.3f, org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.G6, this.f15241a)));
        }
    }

    public void set(Object obj) {
        int i7;
        boolean z10 = obj instanceof TLRPC.User;
        org.telegram.ui.ActionBar.n5 n5Var = this.d;
        if (z10) {
            n5Var.setTypeface(org.telegram.messenger.g0.o());
            n5Var.setTranslationX(0.0f);
            setUser((TLRPC.User) obj);
        } else if (obj instanceof TLRPC.Chat) {
            n5Var.setTypeface(org.telegram.messenger.g0.o());
            n5Var.setTranslationX(0.0f);
            a(0, (TLRPC.Chat) obj);
        } else if (obj instanceof String) {
            n5Var.setTypeface(null);
            int i10 = -org.telegram.messenger.g0.L(52.0f);
            if (gd.f24213a0) {
                i7 = -1;
            } else {
                i7 = 1;
            }
            n5Var.setTranslationX(i10 * i7);
            n5Var.l((String) obj, false);
        }
    }

    public void setDivider(boolean z10) {
        boolean z11;
        this.E = z10;
        if (!z10 && (this.f15248s || !this.f15247r)) {
            z11 = true;
        } else {
            z11 = false;
        }
        setWillNotDraw(z11);
    }

    public void setRedCheckbox(boolean z10) {
        int i7;
        if (z10) {
            i7 = org.telegram.ui.ActionBar.n6.nk;
        } else {
            i7 = org.telegram.ui.ActionBar.n6.B5;
        }
        this.f15245f.b(i7, org.telegram.ui.ActionBar.n6.f29504j7, org.telegram.ui.ActionBar.n6.C5);
    }

    public void setUser(TLRPC.User user) {
        long j3;
        int i7;
        if (user == null) {
            j3 = 0;
        } else {
            j3 = user.f28552id;
        }
        this.f15251y = j3;
        org.telegram.ui.Components.b9 b9Var = this.f15242b;
        b9Var.r(user);
        int L = org.telegram.messenger.g0.L(20.0f);
        org.telegram.ui.Components.q9 q9Var = this.f15243c;
        q9Var.setRoundRadius(L);
        q9Var.f(user, b9Var);
        String q10 = o10.q(user);
        org.telegram.ui.ActionBar.n5 n5Var = this.d;
        int i10 = 0;
        n5Var.l(org.telegram.messenger.j6.m(q10, n5Var.getPaint().getFontMetricsInt(), false, null, 0), false);
        boolean[] zArr = this.f15250x;
        zArr[0] = false;
        boolean z10 = this.f15247r;
        org.telegram.ui.ActionBar.i6 i6Var = this.f15241a;
        org.telegram.ui.ActionBar.n5 n5Var2 = this.f15244e;
        if (z10) {
            setSubtitle(gd.M0(2131743112, null));
            org.telegram.ui.ActionBar.u6.X(n5Var2, org.telegram.ui.ActionBar.n6.f29652r5, i6Var);
        } else {
            setSubtitle(gd.d0(j10.f24770t0, user, zArr, null));
            if (zArr[0]) {
                i7 = org.telegram.ui.ActionBar.n6.f29575n5;
            } else {
                i7 = org.telegram.ui.ActionBar.n6.f29652r5;
            }
            org.telegram.ui.ActionBar.u6.X(n5Var2, i7, i6Var);
        }
        if (!this.f15248s) {
            i10 = 8;
        }
        mp mpVar = this.f15245f;
        mpVar.setVisibility(i10);
        mpVar.setAlpha(1.0f);
        this.h.setVisibility(8);
    }

    @Override
    public final void updateColors() {
        try {
            Paint paint = this.G;
            if (paint != null) {
                paint.setColor(org.telegram.ui.ActionBar.n6.r1(0.3f, org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.G6, this.f15241a)));
                invalidate();
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }
}
