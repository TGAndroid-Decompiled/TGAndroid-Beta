package defpackage;

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
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.RadioButton;
public final class v9b extends FrameLayout implements snb {
    public boolean E;
    public Path F;
    public Paint G;
    public final vnb a;
    public final rb0 b;
    public final de0 c;
    public final ema d;
    public final ema e;
    public final og2 f;
    public final RadioButton h;
    public final Paint n;
    public boolean r;
    public boolean s;
    public boolean w;
    public final boolean[] x;
    public long y;

    public v9b(Context context, vnb vnbVar) {
        super(context);
        int i;
        rb0 rb0Var = new rb0((vnb) null);
        this.b = rb0Var;
        this.n = new Paint(1);
        this.r = false;
        this.s = true;
        this.w = true;
        this.x = new boolean[1];
        this.a = vnbVar;
        rb0Var.r = hl.L(40.0f);
        de0 de0Var = new de0(context);
        this.c = de0Var;
        de0Var.setRoundRadius(hl.L(20.0f));
        addView(de0Var);
        ema emaVar = new ema(context);
        this.d = emaVar;
        emaVar.setTypeface(hl.o());
        emaVar.setTextSize(16);
        int i2 = aob.j5;
        yob.W(emaVar, i2, vnbVar);
        if (ob6.a0) {
            i = 5;
        } else {
            i = 3;
        }
        emaVar.setGravity(i);
        jn7.i(emaVar);
        addView(emaVar);
        ema emaVar2 = new ema(context);
        this.e = emaVar2;
        emaVar2.setTextSize(14);
        yob.W(emaVar2, i2, vnbVar);
        emaVar2.setGravity(ob6.a0 ? 5 : 3);
        jn7.i(emaVar2);
        addView(emaVar2);
        og2 og2Var = new og2(21, vnbVar, context);
        this.f = og2Var;
        int i3 = aob.B5;
        int i4 = aob.j7;
        og2Var.b(i3, i4, aob.C5);
        og2Var.setDrawUnchecked(true);
        og2Var.setDrawBackgroundAsArc(10);
        addView(og2Var);
        og2Var.a(false, false);
        og2Var.setVisibility(8);
        RadioButton radioButton = new RadioButton(context);
        this.h = radioButton;
        radioButton.setSize(hl.L(20.0f));
        yob.O(radioButton, i4, aob.E5, vnbVar);
        addView(radioButton);
        radioButton.setVisibility(8);
        f();
    }

    private void setSubtitle(CharSequence charSequence) {
        ema emaVar = this.e;
        ema emaVar2 = this.d;
        if (charSequence == null) {
            emaVar2.setTranslationY(0.0f);
            emaVar.setVisibility(8);
            return;
        }
        emaVar2.setTranslationY(hl.L(-9.0f));
        emaVar.setTranslationY(hl.L(12.0f));
        emaVar.l(charSequence, false);
        emaVar.setVisibility(0);
    }

    public final void a(int i, TLRPC.Chat chat) {
        long j;
        float f;
        String lowerCase;
        int i2;
        int i3;
        float f2;
        int i4;
        if (chat == null) {
            j = 0;
        } else {
            j = -chat.id;
        }
        this.y = j;
        rb0 rb0Var = this.b;
        rb0Var.p(chat);
        if (xc2.c0(chat)) {
            f = 12.0f;
        } else {
            f = 20.0f;
        }
        int L = hl.L(f);
        de0 de0Var = this.c;
        de0Var.setRoundRadius(L);
        de0Var.f(chat, rb0Var);
        String str = chat.title;
        ema emaVar = this.d;
        emaVar.l(c00.f(emaVar, str, false, null, 0), false);
        boolean[] zArr = this.x;
        zArr[0] = false;
        String str2 = "Members";
        if (this.r) {
            if (i <= 0) {
                i = chat.participants_count;
            }
            boolean V = xc2.V(chat);
            if (i >= 1) {
                if (V) {
                    str2 = "Subscribers";
                }
                lowerCase = ob6.G(i, str2, new Object[0]);
            } else {
                if (V) {
                    i4 = 2131751355;
                } else {
                    i4 = 2131754872;
                }
                lowerCase = ob6.M0(i4, null);
            }
        } else if (xc2.T(chat) && !chat.megagroup) {
            if (i >= 1) {
                lowerCase = ob6.H(',', "Subscribers", i - 1);
            } else if (!xc2.t0(chat)) {
                lowerCase = ob6.M0(2131752299, null).toLowerCase();
            } else {
                lowerCase = ob6.M0(2131752288, null).toLowerCase();
            }
        } else if (i >= 1) {
            lowerCase = ob6.H(',', "Members", i - 1);
        } else if (chat.has_geo) {
            lowerCase = ob6.M0(2131748396, null);
        } else if (!xc2.t0(chat)) {
            lowerCase = ob6.M0(2131748395, null).toLowerCase();
        } else {
            lowerCase = ob6.M0(2131748392, null).toLowerCase();
        }
        setSubtitle(lowerCase);
        if (zArr[0]) {
            i2 = aob.n5;
        } else {
            i2 = aob.r5;
        }
        yob.W(this.e, i2, this.a);
        if (this.s) {
            i3 = 0;
        } else {
            i3 = 8;
        }
        this.f.setVisibility(i3);
        this.h.setVisibility(8);
        if (i > 200) {
            f2 = 0.3f;
        } else {
            f2 = 1.0f;
        }
        b(false, f2);
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(aob.G6));
    }

    public final void b(boolean z, float f) {
        RadioButton radioButton = this.h;
        og2 og2Var = this.f;
        if (z) {
            if (Math.abs(og2Var.getAlpha() - f) > 0.1d) {
                og2Var.animate().cancel();
                og2Var.animate().alpha(f).start();
            }
            if (Math.abs(radioButton.getAlpha() - f) > 0.1d) {
                radioButton.animate().cancel();
                radioButton.animate().alpha(f).start();
                return;
            }
            return;
        }
        og2Var.animate().cancel();
        og2Var.setAlpha(f);
        radioButton.animate().cancel();
        radioButton.setAlpha(f);
    }

    public final void c(boolean z, boolean z2) {
        og2 og2Var = this.f;
        if (og2Var.getVisibility() == 0) {
            og2Var.a(z, z2);
        }
        RadioButton radioButton = this.h;
        if (radioButton.getVisibility() == 0) {
            radioButton.a(z, z2);
        }
    }

    public final void d(boolean z, boolean z2) {
        boolean z3;
        this.r = z;
        if (z2 != this.s) {
            this.s = z2;
            f();
        }
        if (!this.s) {
            this.h.setVisibility(8);
            this.f.setVisibility(8);
        }
        if (!this.E && (this.s || !this.r)) {
            z3 = true;
        } else {
            z3 = false;
        }
        setWillNotDraw(z3);
    }

    public final void e(int i, int i2, TLRPC.User user) {
        vnb vnbVar = this.a;
        ema emaVar = this.d;
        ema emaVar2 = this.e;
        rb0 rb0Var = this.b;
        int i3 = 0;
        if (i == 4) {
            emaVar.l(ob6.M0(2131744182, null), false);
            if (i2 == 1 && user != null) {
                setSubtitle(g(c00.f(emaVar2, ob6.a0(null, null, 2131744178, lbc.r(user)), false, null, 0)));
            } else if (i2 > 0) {
                setSubtitle(g(ob6.G(i2, "StoryPrivacyOptionExcludePeople", new Object[0])));
            } else {
                setSubtitle(g(ob6.M0(2131744183, null)));
            }
            yob.W(emaVar2, aob.n5, vnbVar);
            rb0Var.f(7);
            rb0Var.h(-15292942, -15630089);
        } else if (i == 2) {
            emaVar.l(ob6.M0(2131744184, null), false);
            if (i2 == 1 && user != null) {
                setSubtitle(g(c00.f(emaVar2, ob6.a0(null, null, 2131744178, lbc.r(user)), false, null, 0)));
            } else if (i2 > 0) {
                setSubtitle(g(ob6.G(i2, "StoryPrivacyOptionExcludePeople", new Object[0])));
            } else {
                setSubtitle(g(ob6.M0(2131744183, null)));
            }
            yob.W(emaVar2, aob.n5, vnbVar);
            rb0Var.f(4);
            rb0Var.h(-3905294, -6923014);
        } else if (i == 1) {
            emaVar.l(ob6.M0(2131744186, null), false);
            if (i2 == 1 && user != null) {
                setSubtitle(g(c00.f(emaVar2, lbc.r(user), false, null, 0)));
            } else if (i2 > 0) {
                setSubtitle(g(ob6.G(i2, "StoryPrivacyOptionPeople", new Object[0])));
            } else {
                setSubtitle(g(ob6.M0(2131744185, null)));
            }
            yob.W(emaVar2, aob.n5, vnbVar);
            rb0Var.f(15);
            rb0Var.h(-7808710, -13781445);
        } else if (i == 3) {
            emaVar.l(ob6.M0(2131744174, null), false);
            if (i2 == 1 && user != null) {
                setSubtitle(g(c00.f(emaVar2, lbc.r(user), false, null, 0)));
            } else if (i2 > 0) {
                setSubtitle(g(ob6.G(i2, "StoryPrivacyOptionPeople", new Object[0])));
            } else {
                setSubtitle(g(ob6.M0(2131744173, null)));
            }
            yob.W(emaVar2, aob.n5, vnbVar);
            rb0Var.f(6);
            rb0Var.h(-18621, -618956);
        }
        this.f.setVisibility(8);
        if (!this.s) {
            i3 = 8;
        }
        this.h.setVisibility(i3);
        de0 de0Var = this.c;
        de0Var.setImageDrawable(rb0Var);
        de0Var.setRoundRadius(hl.L(20.0f));
    }

    public final void f() {
        int i;
        float f;
        float f2;
        int i2;
        int i3;
        float f3;
        float f4;
        int i4;
        int i5;
        float f5;
        int i6;
        int i7;
        int i8 = 3;
        if (ob6.a0) {
            i = 5;
        } else {
            i = 3;
        }
        int i9 = i | 16;
        boolean z = this.s;
        if (z) {
            f = 53.0f;
        } else {
            f = 16.0f;
        }
        if (z) {
            f2 = 53.0f;
        } else {
            f2 = 16.0f;
        }
        this.c.setLayoutParams(tre.d(40, 40.0f, i9, f, 0.0f, f2, 0.0f));
        boolean z2 = ob6.a0;
        if (z2) {
            i2 = 5;
        } else {
            i2 = 3;
        }
        int i10 = i2 | 16;
        int i11 = 68;
        float f6 = 20.0f;
        if (z2) {
            f3 = 20.0f;
        } else {
            if (this.s) {
                i3 = 105;
            } else {
                i3 = 68;
            }
            f3 = i3;
        }
        if (z2) {
            if (this.s) {
                i7 = 105;
            } else {
                i7 = 68;
            }
            f4 = i7;
        } else {
            f4 = 20.0f;
        }
        this.d.setLayoutParams(tre.d(-1, -2.0f, i10, f3, 0.0f, f4, 0.0f));
        boolean z3 = ob6.a0;
        if (z3) {
            i4 = 5;
        } else {
            i4 = 3;
        }
        int i12 = i4 | 16;
        if (z3) {
            f5 = 20.0f;
        } else {
            if (this.s) {
                i5 = 105;
            } else {
                i5 = 68;
            }
            f5 = i5;
        }
        if (z3) {
            if (this.s) {
                i11 = 105;
            }
            f6 = i11;
        }
        this.e.setLayoutParams(tre.d(-1, -2.0f, i12, f5, 0.0f, f6, 0.0f));
        if (ob6.a0) {
            i6 = 5;
        } else {
            i6 = 3;
        }
        this.f.setLayoutParams(tre.d(24, 24.0f, i6 | 16, 13.0f, 0.0f, 14.0f, 0.0f));
        if (ob6.a0) {
            i8 = 5;
        }
        this.h.setLayoutParams(tre.d(22, 22.0f, i8 | 16, 14.0f, 0.0f, 15.0f, 0.0f));
    }

    public final SpannableStringBuilder g(CharSequence charSequence) {
        SpannableString spannableString = new SpannableString(">");
        Drawable drawable = getContext().getResources().getDrawable(2131230875);
        wm2 wm2Var = new wm2(2, drawable);
        drawable.setBounds(0, hl.L(1.0f), hl.L(11.0f), hl.L(12.0f));
        spannableString.setSpan(wm2Var, 0, spannableString.length(), 33);
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
            int v0 = aob.v0(aob.d7, this.a);
            Paint paint2 = this.n;
            paint2.setColor(v0);
            if (ob6.a0) {
                canvas2 = canvas;
                canvas2.drawRect(0.0f, getHeight() - 1, getWidth() - hl.L(105.0f), getHeight(), paint2);
            } else {
                canvas2 = canvas;
                canvas2.drawRect(hl.L(105.0f), getHeight() - 1, getWidth(), getHeight(), paint2);
            }
        } else {
            canvas2 = canvas;
        }
        Path path = this.F;
        if (path != null && (paint = this.G) != null && !this.s && this.r && this.w) {
            canvas2.drawPath(path, paint);
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo r6) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.v9b.onInitializeAccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo):void");
    }

    @Override
    public final void onMeasure(int i, int i2) {
        float f;
        int measuredWidth;
        float f2;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824);
        if (this.r && !this.s) {
            f = 62.0f;
        } else {
            f = 56.0f;
        }
        super.onMeasure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(hl.L(f), 1073741824));
        if (!this.s && this.r) {
            Path path = this.F;
            if (path == null) {
                this.F = new Path();
            } else {
                path.rewind();
            }
            if (ob6.a0) {
                measuredWidth = hl.L(31.0f);
            } else {
                measuredWidth = getMeasuredWidth() - hl.L(31.0f);
            }
            float f3 = measuredWidth;
            float measuredHeight = getMeasuredHeight() / 2.0f;
            if (ob6.a0) {
                f2 = -1.0f;
            } else {
                f2 = 1.0f;
            }
            this.F.moveTo(f3, measuredHeight - hl.L(6.0f));
            this.F.lineTo((f2 * hl.L(6.0f)) + f3, measuredHeight);
            this.F.lineTo(f3, measuredHeight + hl.L(6.0f));
            if (this.G == null) {
                Paint paint = new Paint(1);
                this.G = paint;
                paint.setStyle(Paint.Style.STROKE);
                this.G.setStrokeCap(Paint.Cap.ROUND);
            }
            this.G.setStrokeWidth(hl.N(1.86f));
            this.G.setColor(aob.p1(0.3f, aob.v0(aob.G6, this.a)));
        }
    }

    public void set(Object obj) {
        int i;
        boolean z = obj instanceof TLRPC.User;
        ema emaVar = this.d;
        if (z) {
            emaVar.setTypeface(hl.o());
            emaVar.setTranslationX(0.0f);
            setUser((TLRPC.User) obj);
        } else if (obj instanceof TLRPC.Chat) {
            emaVar.setTypeface(hl.o());
            emaVar.setTranslationX(0.0f);
            a(0, (TLRPC.Chat) obj);
        } else if (obj instanceof String) {
            emaVar.setTypeface(null);
            int i2 = -hl.L(52.0f);
            if (ob6.a0) {
                i = -1;
            } else {
                i = 1;
            }
            emaVar.setTranslationX(i2 * i);
            emaVar.l((String) obj, false);
        }
    }

    public void setDivider(boolean z) {
        boolean z2;
        this.E = z;
        if (!z && (this.s || !this.r)) {
            z2 = true;
        } else {
            z2 = false;
        }
        setWillNotDraw(z2);
    }

    public void setRedCheckbox(boolean z) {
        int i;
        if (z) {
            i = aob.nk;
        } else {
            i = aob.B5;
        }
        this.f.b(i, aob.j7, aob.C5);
    }

    public void setUser(TLRPC.User user) {
        long j;
        int i;
        if (user == null) {
            j = 0;
        } else {
            j = user.id;
        }
        this.y = j;
        rb0 rb0Var = this.b;
        rb0Var.q(user);
        int L = hl.L(20.0f);
        de0 de0Var = this.c;
        de0Var.setRoundRadius(L);
        de0Var.f(user, rb0Var);
        String r = lbc.r(user);
        ema emaVar = this.d;
        int i2 = 0;
        emaVar.l(c00.f(emaVar, r, false, null, 0), false);
        boolean[] zArr = this.x;
        zArr[0] = false;
        boolean z = this.r;
        vnb vnbVar = this.a;
        ema emaVar2 = this.e;
        if (z) {
            setSubtitle(ob6.M0(2131743001, null));
            yob.W(emaVar2, aob.r5, vnbVar);
        } else {
            setSubtitle(ob6.d0(yac.t0, user, zArr, null));
            if (zArr[0]) {
                i = aob.n5;
            } else {
                i = aob.r5;
            }
            yob.W(emaVar2, i, vnbVar);
        }
        if (!this.s) {
            i2 = 8;
        }
        og2 og2Var = this.f;
        og2Var.setVisibility(i2);
        og2Var.setAlpha(1.0f);
        this.h.setVisibility(8);
    }

    @Override
    public final void updateColors() {
        try {
            Paint paint = this.G;
            if (paint != null) {
                paint.setColor(aob.p1(0.3f, aob.v0(aob.G6, this.a)));
                invalidate();
            }
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }
}
