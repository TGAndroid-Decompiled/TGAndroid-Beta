package defpackage;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;
public abstract class vs9 extends FrameLayout implements gk7 {
    public static hd I;
    public final long E;
    public float F;
    public float G;
    public ValueAnimator H;
    public final int a;
    public final d b;
    public final wjb c;
    public final ns9 d;
    public final gx0 e;
    public LinearLayout f;
    public long h;
    public final ArrayList n;
    public final ArrayList r;
    public boolean s;
    public kl0 w;
    public nl0 x;
    public final Paint y;

    public vs9(Context context, d dVar, int i, long j, wjb wjbVar) {
        super(context);
        this.n = new ArrayList();
        this.r = new ArrayList();
        this.y = new Paint(1);
        this.a = i;
        this.b = dVar;
        this.c = wjbVar;
        this.E = j;
        i19.n(wjbVar);
        ns9 ns9Var = new ns9(this, context, wjbVar, (byte) 0);
        this.d = ns9Var;
        ns9Var.setPadding(gl.L(5.66f), 0, gl.L(5.66f), 0);
        ns9Var.setClipToPadding(false);
        t26 t26Var = new t26();
        t26Var.i1(0);
        ns9Var.setLayoutManager(t26Var);
        gx0 gx0Var = new gx0(this, (byte) 9);
        this.e = gx0Var;
        ns9Var.setAdapter(gx0Var);
        ns9Var.setOverScrollMode(2);
        addView(ns9Var, nme.c(-1.0f, -1));
        ns9Var.setOnItemClickListener(new sh8(this, i, dVar, (byte) 1));
        ns9Var.setOnItemLongClickListener(new zm(this, i, dVar, wjbVar, (byte) 9));
        gb3 gb3Var = new gb3();
        gb3Var.o(s33.h);
        gb3Var.n(320L);
        ns9Var.setItemAnimator(gb3Var);
        hq6.d0(i).a1(false);
        h(false);
    }

    public static void c(Context context, int i, TLRPC.Reaction reaction, wjb wjbVar) {
        View view;
        boolean z;
        AlertDialog$Builder alertDialog$Builder;
        SpannableString spannableString;
        int i2;
        d Q = LaunchActivity.Q();
        Activity W = gl.W(context);
        if (W != null) {
            view = W.getCurrentFocus();
        } else {
            view = null;
        }
        if (Q != null && (Q.getFragmentView() instanceof cja) && ((cja) Q.getFragmentView()).Q() > gl.L(20.0f)) {
            z = true;
        } else {
            z = false;
        }
        hd[] hdVarArr = new hd[1];
        if (z) {
            alertDialog$Builder = new AlertDialog$Builder(0, wjbVar, context);
        } else {
            alertDialog$Builder = new AlertDialog$Builder(0, wjbVar, context);
        }
        AlertDialog$Builder alertDialog$Builder2 = alertDialog$Builder;
        String H1 = na7.q1(i).H1(reaction);
        h19 d = h19.d(reaction);
        TextPaint textPaint = new TextPaint();
        textPaint.setTextSize(gl.L(20.0f));
        if (!TextUtils.isEmpty(d.f)) {
            spannableString = vu3.m(d.f, textPaint.getFontMetricsInt(), false, null, 0);
        } else {
            SpannableString spannableString2 = new SpannableString("😀");
            spannableString2.setSpan(new gm(d.g, textPaint.getFontMetricsInt()), 0, spannableString2.length(), 17);
            spannableString = spannableString2;
        }
        SpannableStringBuilder append = new SpannableStringBuilder(spannableString).append((CharSequence) "  ");
        if (TextUtils.isEmpty(H1)) {
            i2 = 2131745689;
        } else {
            i2 = 2131745677;
        }
        SpannableStringBuilder append2 = append.append((CharSequence) k96.M0(i2, null));
        hd hdVar = alertDialog$Builder2.a;
        hdVar.S = append2;
        final ps9 ps9Var = new ps9(context, wjbVar);
        ps9Var.setOnEditorActionListener(new qs9(ps9Var, i, reaction, hdVarArr, view));
        hq6.d0(i).O(gl.F0(), true);
        ps9Var.setTextSize(1, 18.0f);
        if (H1 == null) {
            H1 = "";
        }
        ps9Var.setText(H1);
        int i3 = bkb.i5;
        zkb.X(ps9Var, i3, wjbVar);
        zkb.l(ps9Var, 34, bkb.Ni, wjbVar);
        ps9Var.setHintText(k96.M0(2131745690, null));
        ps9Var.setSingleLine(true);
        ps9Var.setFocusable(true);
        ps9Var.setInputType(16384);
        zkb.F(ps9Var, bkb.j6, bkb.k6, bkb.o7, wjbVar);
        ps9Var.setImeOptions(6);
        ps9Var.setBackgroundDrawable(null);
        ps9Var.setPadding(0, 0, gl.L(42.0f), 0);
        LinearLayout j = de9.j(context, 1);
        TextView textView = new TextView(context);
        zkb.X(textView, i3, wjbVar);
        textView.setTextSize(1, 16.0f);
        textView.setText(k96.M0(2131745688, null));
        j.addView(textView, nme.k(24.0f, 5.0f, 24.0f, 12.0f, -1, -2));
        j.addView(ps9Var, nme.k(24.0f, 0.0f, 24.0f, 10.0f, -1, -2));
        alertDialog$Builder2.n(j);
        hdVar.a = gl.L(292.0f);
        alertDialog$Builder2.j(k96.M0(2131745754, null), new yf(ps9Var, i, reaction, (byte) 13));
        alertDialog$Builder2.g(k96.M0(2131752577, null), new ho9((byte) 3));
        if (z) {
            I = hdVar;
            hdVarArr[0] = hdVar;
            hdVar.setOnDismissListener(new b41(view, (byte) 3));
            I.setOnShowListener(new DialogInterface.OnShowListener() {
                @Override
                public final void onShow(DialogInterface dialogInterface) {
                    byte b = r2;
                    ps9 ps9Var2 = ps9Var;
                    switch (b) {
                        case 0:
                            ps9Var2.requestFocus();
                            gl.E3(ps9Var2);
                            return;
                        default:
                            ps9Var2.requestFocus();
                            gl.E3(ps9Var2);
                            return;
                    }
                }
            });
            I.q(250L);
        } else {
            hdVarArr[0] = hdVar;
            hdVar.setOnDismissListener(new ph8(ps9Var, (byte) 5));
            hdVarArr[0].setOnShowListener(new DialogInterface.OnShowListener() {
                @Override
                public final void onShow(DialogInterface dialogInterface) {
                    byte b = r2;
                    ps9 ps9Var2 = ps9Var;
                    switch (b) {
                        case 0:
                            ps9Var2.requestFocus();
                            gl.E3(ps9Var2);
                            return;
                        default:
                            ps9Var2.requestFocus();
                            gl.E3(ps9Var2);
                            return;
                    }
                }
            });
            hdVarArr[0].show();
        }
        hdVarArr[0].k0 = false;
        ps9Var.setSelection(ps9Var.getText().length());
    }

    public final boolean a() {
        if (this.r.isEmpty() && !this.s) {
            return false;
        }
        return true;
    }

    public abstract void b(boolean z);

    public final void d(kl0 kl0Var, nl0 nl0Var) {
        this.w = kl0Var;
        this.x = nl0Var;
        float N = gl.N(1.0f);
        Paint paint = this.y;
        paint.setStrokeWidth(N);
        paint.setStyle(Paint.Style.STROKE);
        View view = this.f;
        if (view != null) {
            il0 c = kl0Var.c(view, null, false);
            c.p(nod.o(this.c));
            c.s(gl.L(9.0f), gl.L(15.0f), gl.L(15.0f), gl.L(9.0f));
            c.u(gl.L(5.0f));
            c.q(gl.L(4.0f));
            view.setBackground(c);
        }
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == kk7.i3) {
            long longValue = ((Long) objArr[0]).longValue();
            if (longValue == 0 || longValue == this.E) {
                h(true);
            }
        } else if (i == kk7.k4) {
            invalidate();
            gl.d0(this.d, new bm0((byte) 12));
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.F < 0.5f) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j) {
        LinearLayout linearLayout;
        if (view == this.d && (linearLayout = this.f) != null) {
            if (linearLayout.getAlpha() >= 1.0f) {
                return false;
            }
            canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) ((1.0f - this.f.getAlpha()) * 255.0f), 31);
            boolean drawChild = super.drawChild(canvas, view, j);
            canvas.restore();
            return drawChild;
        }
        return super.drawChild(canvas, view, j);
    }

    public final void e(h19 h19Var, boolean z) {
        gx0 gx0Var = this.e;
        if (h19Var == null) {
            this.h = 0L;
            if (z) {
                f(null);
            }
            gx0Var.f();
            return;
        }
        int i = 0;
        while (true) {
            ArrayList arrayList = this.r;
            if (i < arrayList.size()) {
                long j = h19Var.h;
                h19 h19Var2 = ((ss9) arrayList.get(i)).a;
                long j2 = h19Var2.h;
                if (j == j2) {
                    this.h = j2;
                    if (z) {
                        f(h19Var2);
                    }
                    gx0Var.f();
                    this.d.w0(i);
                    return;
                }
                i++;
            } else {
                return;
            }
        }
    }

    public abstract boolean f(h19 h19Var);

    public final void g(boolean z) {
        float f;
        ValueAnimator valueAnimator = this.H;
        if (valueAnimator != null) {
            this.H = null;
            valueAnimator.cancel();
        }
        if (z) {
            setVisibility(0);
        }
        float f2 = this.G;
        if (z) {
            f = 1.0f;
        } else {
            f = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f2, f);
        this.H = ofFloat;
        ofFloat.addUpdateListener(new x89(this, (byte) 11));
        this.H.setInterpolator(s33.h);
        this.H.setDuration(320L);
        this.H.addListener(new id4((byte) 29, this, z));
        this.H.start();
    }

    public int getCurrentHeight() {
        return (int) (getMeasuredHeight() * this.F);
    }

    public void h(boolean z) {
        boolean z2;
        int i;
        int i2;
        String str;
        int hashCode;
        HashSet hashSet = new HashSet();
        ArrayList arrayList = this.n;
        arrayList.clear();
        ArrayList arrayList2 = this.r;
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        int i3 = this.a;
        na7 q1 = na7.q1(i3);
        long j = this.E;
        TLRPC.TL_messages_savedReactionsTags F1 = q1.F1(j, false);
        if (F1 != null) {
            int i4 = 0;
            z2 = false;
            while (i4 < F1.tags.size()) {
                TLRPC.TL_savedReactionTag tL_savedReactionTag = F1.tags.get(i4);
                h19 d = h19.d(tL_savedReactionTag.reaction);
                TLRPC.TL_messages_savedReactionsTags tL_messages_savedReactionsTags = F1;
                if (!hashSet.contains(Long.valueOf(d.h)) && (j == 0 || tL_savedReactionTag.count > 0)) {
                    int i5 = tL_savedReactionTag.count;
                    if (i2 != 0) {
                        str = q1.H1(tL_savedReactionTag.reaction);
                    } else {
                        str = tL_savedReactionTag.title;
                    }
                    ?? obj = new Object();
                    obj.a = d;
                    obj.b = i5;
                    obj.c = str;
                    if (str == null) {
                        hashCode = -233;
                    } else {
                        hashCode = str.hashCode();
                    }
                    obj.d = hashCode;
                    i = i4;
                    if (obj.a.h == this.h) {
                        z2 = true;
                    }
                    arrayList2.add(obj);
                    hashSet.add(Long.valueOf(d.h));
                } else {
                    i = i4;
                }
                i4 = i + 1;
                F1 = tL_messages_savedReactionsTags;
            }
        } else {
            z2 = false;
        }
        if (!z2 && this.h != 0) {
            this.h = 0L;
            f(null);
        }
        gx0 gx0Var = this.e;
        if (z) {
            vu7.a(new rs9(this), true).c(gx0Var);
        } else {
            gx0Var.f();
        }
        boolean p = y6c.h(i3).p();
        this.s = !p;
        if (!p) {
            if (this.f == null) {
                LinearLayout linearLayout = new LinearLayout(getContext());
                this.f = linearLayout;
                linearLayout.setOnClickListener(new ik8(this, (byte) 17));
                this.f.setOrientation(0);
                ote.b(this.f, 0.03f, 1.25f);
                ba1 ba1Var = new ba1(this, getContext());
                int i6 = bkb.n6;
                wjb wjbVar = this.c;
                zkb.X(ba1Var, i6, wjbVar);
                ba1Var.setTextSize(1, 12.0f);
                ba1Var.setTypeface(gl.o());
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                Drawable mutate = getContext().getResources().getDrawable(2131232248).mutate();
                int i7 = bkb.Wc;
                PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                mutate.setColorFilter(new PorterDuffColorFilter(i7, mode));
                cm2 cm2Var = new cm2(0, mutate);
                cm2Var.s = 0.0f;
                cm2Var.r = 0.0f;
                cm2Var.I = 0.94f;
                cm2Var.J = 0.94f;
                SpannableString spannableString = new SpannableString("l");
                spannableString.setSpan(cm2Var, 0, spannableString.length(), 17);
                spannableStringBuilder.append((CharSequence) spannableString);
                spannableStringBuilder.append((CharSequence) " ").append((CharSequence) k96.M0(2131754378, null));
                ba1Var.setText(spannableStringBuilder);
                ba1Var.setPadding(gl.L(4.0f), gl.L(4.0f), gl.L(9.0f), gl.L(4.0f));
                TextView textView = new TextView(getContext());
                zkb.X(textView, i6, wjbVar);
                textView.setTextSize(1, 12.0f);
                textView.setTypeface(gl.o());
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(k96.M0(2131754377, null));
                SpannableString spannableString2 = new SpannableString(">");
                Drawable mutate2 = getContext().getResources().getDrawable(2131232064).mutate();
                mutate2.setColorFilter(new PorterDuffColorFilter(i7, mode));
                cm2 cm2Var2 = new cm2(0, mutate2);
                cm2Var2.I = 0.76f;
                cm2Var2.J = 0.76f;
                cm2Var2.r = -gl.L(1.0f);
                cm2Var2.s = gl.L(1.0f);
                spannableString2.setSpan(cm2Var2, 0, spannableString2.length(), 17);
                spannableStringBuilder2.append((CharSequence) spannableString2);
                textView.setText(spannableStringBuilder2);
                textView.setPadding(gl.L(5.66f), gl.L(4.0f), gl.L(9.0f), gl.L(4.0f));
                this.f.addView(ba1Var, nme.r(-2, -2, 16));
                this.f.addView(textView, nme.r(-2, -2, 16));
                this.f.setPadding(gl.L(7.0f), 0, 0, 0);
                this.f.setClipToPadding(false);
                addView(this.f, nme.d(-2, -1.0f, 19, 5.0f, 0.0f, 5.0f, 0.0f));
            }
            if (!z) {
                this.f.setVisibility(0);
                this.f.setAlpha(0.0f);
                this.f.animate().alpha(1.0f).start();
                return;
            }
            return;
        }
        LinearLayout linearLayout2 = this.f;
        if (linearLayout2 != null) {
            if (z) {
                linearLayout2.animate().alpha(0.0f).withEndAction(new zk9(this, (byte) 12)).start();
                return;
            }
            linearLayout2.setAlpha(1.0f);
            this.f.setVisibility(0);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i = this.a;
        kk7.f(i).b(this, kk7.i3);
        kk7.f(i).b(this, kk7.k4);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i = this.a;
        kk7.f(i).n(this, kk7.i3);
        kk7.f(i).n(this, kk7.k4);
    }

    public void setShown(float f) {
        this.F = f;
        ns9 ns9Var = this.d;
        ns9Var.setPivotX(ns9Var.getWidth() / 2.0f);
        ns9Var.setPivotY(0.0f);
        ns9Var.setScaleX(gl.R1(0.8f, 1.0f, f));
        ns9Var.setScaleY(gl.R1(0.8f, 1.0f, f));
        setAlpha(f);
        invalidate();
    }
}
