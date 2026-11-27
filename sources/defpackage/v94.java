package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.RenderEffect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Layout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
public final class v94 extends FrameLayout implements eu5 {
    public final zc E;
    public final ArrayList F;
    public final ArrayList G;
    public final ArrayList H;
    public t94 I;
    public r47 J;
    public boolean K;
    public boolean L;
    public boolean M;
    public boolean N;
    public int O;
    public boolean P;
    public int Q;
    public float R;
    public float S;
    public float T;
    public int U;
    public int V;
    public int W;
    public final int a;
    public int a0;
    public final vnb b;
    public int b0;
    public final de0 c;
    public int c0;
    public final de0[] d;
    public int[] d0;
    public final TextView[] e;
    public int[] e0;
    public final TextView f;
    public String[] f0;
    public float g0;
    public final TextView h;
    public boolean h0;
    public final Paint i0;
    public final TextPaint j0;
    public Drawable k0;
    public boolean l0;
    public boolean m0;
    public final TextView n;
    public boolean n0;
    public final TextView r;
    public final TextView s;
    public final b6 w;
    public final b21 x;
    public final HorizontalScrollView y;

    public v94(int i, vnb vnbVar, Context context) {
        super(context);
        int i2;
        this.d = new de0[3];
        this.e = new TextView[2];
        this.F = new ArrayList();
        this.G = new ArrayList();
        this.H = new ArrayList();
        this.T = 1.0f;
        int i3 = 0;
        this.d0 = new int[0];
        this.e0 = new int[0];
        this.f0 = new String[0];
        this.i0 = new Paint(1);
        this.j0 = new TextPaint(1);
        this.a = i;
        this.b = vnbVar;
        setWillNotDraw(false);
        de0 de0Var = new de0(context);
        this.c = de0Var;
        de0Var.setRoundRadius(hl.L(8.0f));
        addView(de0Var);
        int i4 = aob.G6;
        TextView q = q(context, 15, i4);
        this.f = q;
        jn7.i(q);
        q.setTypeface(hl.o());
        q.setSingleLine(true);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        q.setEllipsize(truncateAt);
        addView(q);
        int i5 = aob.q9;
        TextView q2 = q(context, 13, i5);
        this.h = q2;
        q2.setSingleLine(true);
        addView(q2);
        TextView q3 = q(context, 13, i5);
        this.n = q3;
        q3.setSingleLine(true);
        q3.setCompoundDrawablePadding(hl.L(3.0f));
        Drawable mutate = context.getDrawable(2131232429).mutate();
        mutate.setColorFilter(new PorterDuffColorFilter(aob.v0(i5, vnbVar), PorterDuff.Mode.SRC_IN));
        mutate.setBounds(0, 0, mutate.getIntrinsicWidth(), mutate.getIntrinsicHeight());
        q3.setCompoundDrawables(mutate, null, null, null);
        addView(q3);
        TextView q4 = q(context, 15, aob.g9);
        this.r = q4;
        jn7.i(q4);
        q4.setMaxLines(3);
        q4.setEllipsize(truncateAt);
        if (ob6.a0) {
            i2 = 5;
        } else {
            i2 = 3;
        }
        q4.setGravity(i2 | 48);
        addView(q4);
        b6 b6Var = new b6(context, (byte) 13);
        this.w = b6Var;
        b21 b21Var = new b21(context, vnbVar, (byte) 3);
        this.x = b21Var;
        b21Var.setOnLinkPressListener(new r94(this, (byte) 0));
        b21Var.setTextSize(16.0f);
        yob.X(b21Var, i4, vnbVar);
        b21Var.setLinkTextColor(aob.v0(aob.J6, vnbVar));
        b21Var.setIncludeFontPadding(false);
        b21Var.setGravity((ob6.a0 ? 5 : 3) | 48);
        jn7.i(b21Var);
        b6Var.addView(b21Var);
        addView(b6Var);
        TextView q5 = q(context, 15, aob.n6);
        this.s = q5;
        q5.setText(ob6.M0(2131745067, null));
        q5.setSingleLine(true);
        addView(q5);
        zc zcVar = new zc((byte) 20, context, this);
        this.E = zcVar;
        HorizontalScrollView horizontalScrollView = new HorizontalScrollView(context);
        this.y = horizontalScrollView;
        horizontalScrollView.setHorizontalScrollBarEnabled(false);
        horizontalScrollView.setLayoutDirection(0);
        horizontalScrollView.addView(zcVar, new FrameLayout.LayoutParams(-2, -1));
        horizontalScrollView.setVisibility(4);
        horizontalScrollView.setOnScrollChangeListener(new ev(this, (byte) 1));
        addView(horizontalScrollView);
        int i6 = 0;
        while (true) {
            de0[] de0VarArr = this.d;
            if (i6 >= de0VarArr.length) {
                break;
            }
            de0 de0Var2 = new de0(context);
            de0VarArr[i6] = de0Var2;
            de0Var2.setRoundRadius(hl.L(8.0f));
            de0Var2.getImageReceiver().l1 = (byte) 1;
            addView(de0Var2);
            i6++;
        }
        while (true) {
            TextView[] textViewArr = this.e;
            if (i3 < textViewArr.length) {
                TextView d = d(context);
                textViewArr[i3] = d;
                addView(d);
                i3++;
            } else {
                this.j0.setTextSize(hl.L(12.0f));
                this.j0.setTypeface(hl.o());
                this.j0.setColor(-1);
                return;
            }
        }
    }

    public static float b(r47 r47Var) {
        int i;
        int i2;
        TLRPC.Photo photo;
        ArrayList<TLRPC.PhotoSize> arrayList;
        TLRPC.WebPage webPage;
        TLRPC.Document F0 = r47Var.F0();
        if (F0 != null) {
            ArrayList<TLRPC.DocumentAttribute> arrayList2 = F0.attributes;
            int size = arrayList2.size();
            i = 0;
            i2 = 0;
            int i3 = 0;
            while (i3 < size) {
                TLRPC.DocumentAttribute documentAttribute = arrayList2.get(i3);
                i3++;
                TLRPC.DocumentAttribute documentAttribute2 = documentAttribute;
                if ((documentAttribute2 instanceof TLRPC.TL_documentAttributeVideo) || (documentAttribute2 instanceof TLRPC.TL_documentAttributeImageSize)) {
                    i = documentAttribute2.w;
                    i2 = documentAttribute2.h;
                }
            }
        } else {
            i = 0;
            i2 = 0;
        }
        if (i <= 0 || i2 <= 0) {
            TLRPC.MessageMedia n1 = r47.n1(r47Var.k);
            TLRPC.PhotoSize photoSize = null;
            if (n1 != null) {
                photo = n1.photo;
            } else {
                photo = null;
            }
            if (photo == null && n1 != null && (webPage = n1.webpage) != null) {
                photo = webPage.photo;
            }
            if (photo != null) {
                arrayList = photo.sizes;
            } else if (F0 != null) {
                arrayList = F0.thumbs;
            } else {
                arrayList = null;
            }
            if (arrayList != null) {
                photoSize = xb4.w(arrayList, hl.Y0(false), false, null, false);
            }
            if (photoSize != null) {
                i = photoSize.w;
                i2 = photoSize.h;
            }
        }
        if (i > 0 && i2 > 0) {
            return i / i2;
        }
        return 1.0f;
    }

    public static int g() {
        float f;
        if (ob6.a0) {
            f = 14.0f;
        } else {
            f = 60.0f;
        }
        return hl.L(f);
    }

    public static boolean h(r47 r47Var) {
        TLRPC.Photo photo;
        TLRPC.WebPage webPage;
        if (r47Var.I1 != null) {
            return true;
        }
        TLRPC.MessageMedia n1 = r47.n1(r47Var.k);
        if (n1 != null) {
            photo = n1.photo;
        } else {
            photo = null;
        }
        if (photo == null && n1 != null && (webPage = n1.webpage) != null) {
            photo = webPage.photo;
        }
        if (photo != null) {
            return !photo.sizes.isEmpty();
        }
        TLRPC.Document F0 = r47Var.F0();
        if (F0 != null && !F0.thumbs.isEmpty()) {
            return true;
        }
        return false;
    }

    public static float k(float f, float f2, float f3) {
        return Math.max(0.0f, Math.min(1.0f, (f - f2) / (f3 - f2)));
    }

    public static void l(View view, float f) {
        Shader.TileMode tileMode;
        RenderEffect createBlurEffect;
        if (Build.VERSION.SDK_INT < 31) {
            return;
        }
        float L = hl.L(10.0f) * f;
        if (L >= 1.0f) {
            tileMode = Shader.TileMode.DECAL;
            createBlurEffect = RenderEffect.createBlurEffect(L, L, tileMode);
        } else {
            createBlurEffect = null;
        }
        view.setRenderEffect(createBlurEffect);
    }

    public static boolean n(defpackage.de0 r12, defpackage.r47 r13, int r14, boolean r15, java.lang.String r16, boolean r17) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.v94.n(de0, r47, int, boolean, java.lang.String, boolean):boolean");
    }

    public static String r(r47 r47Var) {
        TLRPC.Document F0 = r47Var.F0();
        if (r47.K4(r47Var.k) && F0 != null) {
            ArrayList<TLRPC.DocumentAttribute> arrayList = F0.attributes;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                TLRPC.DocumentAttribute documentAttribute = arrayList.get(i);
                i++;
                TLRPC.DocumentAttribute documentAttribute2 = documentAttribute;
                if (documentAttribute2 instanceof TLRPC.TL_documentAttributeVideo) {
                    return hl.g0((int) documentAttribute2.duration, false, false);
                }
            }
        }
        return null;
    }

    public static java.lang.CharSequence s(int r2, android.text.TextPaint r3, java.lang.CharSequence r4) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.v94.s(int, android.text.TextPaint, java.lang.CharSequence):java.lang.CharSequence");
    }

    public final void a(boolean z) {
        int L = hl.L(8.0f);
        de0[] de0VarArr = this.d;
        if (!z) {
            de0VarArr[0].getImageReceiver().r0(L, 0, 0, L);
            de0VarArr[1].getImageReceiver().r0(0, L, 0, 0);
            de0VarArr[2].getImageReceiver().r0(0, 0, L, 0);
            return;
        }
        for (de0 de0Var : de0VarArr) {
            de0Var.setRoundRadius(L);
        }
    }

    public final void c(Canvas canvas) {
        if (this.P && !this.m0) {
            float U1 = hl.U1(this.R, hl.L(14.0f), hl.L(60.0f));
            if (ob6.a0) {
                canvas.drawLine(0.0f, getHeight() - 1, getWidth() - U1, getHeight() - 1, aob.j0);
            } else {
                canvas.drawLine(U1, getHeight() - 1, getWidth(), getHeight() - 1, aob.j0);
            }
        }
    }

    public final TextView d(Context context) {
        TextView q = q(context, 12, aob.G6);
        q.setTextColor(-1);
        q.setGravity(17);
        q.setPadding(hl.L(4.0f), 0, hl.L(4.0f), 0);
        q.setBackground(aob.b0(hl.L(4.0f), Integer.MIN_VALUE));
        return q;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f;
        float f2;
        int i;
        int i2;
        float f3;
        float L;
        float f4 = this.g0;
        if (f4 == 0.0f) {
            super.dispatchDraw(canvas);
            c(canvas);
            return;
        }
        boolean z = ob6.a0;
        int width = getWidth();
        int height = getHeight();
        if (z) {
            float f5 = width;
            f = f5;
            f2 = f5 - f4;
        } else {
            f = f4;
            f2 = 0.0f;
        }
        int i3 = aob.Fi;
        vnb vnbVar = this.b;
        int v0 = aob.v0(i3, vnbVar);
        Paint paint = this.i0;
        paint.setColor(v0);
        float f6 = height;
        canvas.drawRect(f2, 0.0f, f, f6, paint);
        if (this.k0 == null || this.l0 != this.h0) {
            this.l0 = this.h0;
            Context context = getContext();
            if (this.h0) {
                i = 2131232453;
            } else {
                i = 2131232452;
            }
            Drawable mutate = context.getDrawable(i).mutate();
            this.k0 = mutate;
            mutate.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        }
        if (this.h0) {
            i2 = 2131747994;
        } else {
            i2 = 2131747997;
        }
        String M0 = ob6.M0(i2, null);
        float f7 = 1.0f;
        float min = Math.min(1.0f, f4 / hl.L(88.0f));
        if (z) {
            f3 = 2.0f;
            L = width - (hl.L(88.0f) / 2.0f);
        } else {
            f3 = 2.0f;
            L = hl.L(88.0f) / 2.0f;
        }
        float f8 = f6 / f3;
        canvas.save();
        canvas.clipRect(f2, 0.0f, f, f6);
        float R1 = hl.R1(0.6f, 1.0f, min);
        if (min >= 1.0f) {
            f7 = 1.1f;
        }
        float f9 = R1 * f7;
        int L2 = hl.L(24.0f);
        canvas.save();
        canvas.scale(f9, f9, L, f8 - hl.L(8.0f));
        float f10 = L2 / f3;
        this.k0.setBounds((int) (L - f10), (int) ((f8 - hl.L(8.0f)) - f10), (int) (L + f10), (int) ((f8 - hl.L(8.0f)) + f10));
        int i4 = (int) (min * 255.0f);
        this.k0.setAlpha(i4);
        this.k0.draw(canvas);
        canvas.restore();
        TextPaint textPaint = this.j0;
        textPaint.setAlpha(i4);
        canvas.drawText(M0, L - (textPaint.measureText(M0) / f3), f8 + hl.L(18.0f), textPaint);
        canvas.restore();
        canvas.save();
        if (z) {
            f4 = -f4;
        }
        canvas.translate(f4, 0.0f);
        paint.setColor(aob.v0(aob.d6, vnbVar));
        canvas.drawRect(0.0f, 0.0f, width, f6, paint);
        super.dispatchDraw(canvas);
        c(canvas);
        canvas.restore();
    }

    @Override
    public final void e(RectF rectF) {
        rectF.set(0.0f, 0.0f, getWidth(), getHeight());
    }

    @Override
    public final void f(Canvas canvas, float f) {
        this.m0 = true;
        draw(canvas);
        this.m0 = false;
    }

    @Override
    public final FrameLayout.LayoutParams generateDefaultLayoutParams() {
        return new FrameLayout.LayoutParams(-2, -2);
    }

    public ArrayList<r47> getMedia() {
        return this.H;
    }

    public r47 getMessage() {
        return this.J;
    }

    public int getMorphHeight() {
        return Math.round(hl.U1(this.R, this.U, this.V));
    }

    public float getProgress() {
        return this.R;
    }

    public final boolean i(int i) {
        if (this.R >= 1.0f) {
            ArrayList arrayList = this.F;
            if (i < arrayList.size() && ((de0) arrayList.get(i)).getImageReceiver().C()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void j(View view, float f, float f2, float f3) {
        float f4;
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        if (ob6.a0) {
            f4 = measuredWidth;
        } else {
            f4 = 0.0f;
        }
        view.setPivotX(f4);
        view.setPivotY(0.0f);
        view.setScaleX(f3);
        view.setScaleY(f3);
        if (ob6.a0) {
            f = (getMeasuredWidth() - f) - measuredWidth;
        }
        int round = Math.round(f);
        int round2 = Math.round(f2);
        view.layout(round, round2, measuredWidth + round, measuredHeight + round2);
    }

    public final void m(defpackage.r47 r31, java.util.ArrayList r32) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.v94.m(r47, java.util.ArrayList):void");
    }

    public final void o(boolean z, float f) {
        if (this.g0 == f && this.h0 == z) {
            return;
        }
        this.g0 = f;
        this.h0 = z;
        invalidate();
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        float measuredWidth;
        int i5;
        int i6;
        boolean z2;
        float f;
        int i7;
        int i8;
        int L;
        boolean z3;
        int i9;
        int i10;
        boolean z4;
        HorizontalScrollView horizontalScrollView;
        de0[] de0VarArr;
        boolean z5;
        boolean z6;
        boolean z7;
        float y;
        float f2;
        int L2;
        float f3;
        float f4;
        int i11;
        boolean z8;
        HorizontalScrollView horizontalScrollView2;
        float f5;
        de0[] de0VarArr2;
        boolean z9;
        int measuredWidth2 = getMeasuredWidth();
        float f6 = this.R;
        boolean z10 = ob6.a0;
        de0 de0Var = this.c;
        de0Var.setRoundRadius((int) (de0Var.getMeasuredWidth() / 2.0f));
        j(de0Var, hl.L(14.0f), hl.U1(f6, hl.L(10.0f), hl.L(12.0f)), 1.0f);
        float R1 = hl.R1(0.8666667f, 1.0f, this.R);
        TextView textView = this.f;
        float measuredWidth3 = textView.getMeasuredWidth() * R1;
        textView.setTextColor(vm2.f(f6, aob.v0(aob.G6, this.b), this.Q));
        j(textView, hl.U1(f6, hl.L(36.0f), hl.L(60.0f)), hl.U1(f6, hl.L(18.0f), hl.L(22.0f)) - ((textView.getMeasuredHeight() * R1) / 2.0f), R1);
        View view = this.h;
        float R12 = hl.R1(hl.L(36.0f) + measuredWidth3 + hl.L(6.0f), (measuredWidth2 - hl.L(14.0f)) - view.getMeasuredWidth(), f6);
        j(view, R12, hl.U1(f6, hl.L(18.0f), hl.L(22.0f)) - (view.getMeasuredHeight() / 2.0f), 1.0f);
        float R13 = hl.R1(0.7f, 1.0f, f6);
        View view2 = this.n;
        j(view2, (R12 - hl.L(10.0f)) - view2.getMeasuredWidth(), ((view.getMeasuredHeight() - view2.getMeasuredHeight()) / 2.0f) + (hl.U1(f6, hl.L(18.0f), hl.L(22.0f)) - (view.getMeasuredHeight() / 2.0f)), 1.0f);
        if (ob6.a0) {
            measuredWidth = 0.0f;
        } else {
            measuredWidth = view2.getMeasuredWidth();
        }
        view2.setPivotX(measuredWidth);
        view2.setPivotY(view2.getMeasuredHeight() / 2.0f);
        view2.setScaleX(R13);
        view2.setScaleY(R13);
        view2.setAlpha(f6);
        float U1 = hl.U1(f6, hl.L(14.0f), hl.L(60.0f));
        float U12 = hl.U1(f6, hl.L(31.0f), hl.L(36.0f));
        float k = k(f6, 0.0f, 0.6f);
        float k2 = k(f6, 0.3f, 1.0f);
        float R14 = hl.R1(1.0f, 1.0666667f, f6);
        View view3 = this.r;
        j(view3, U1, U12, R14);
        boolean z11 = false;
        if (k < 1.0f) {
            i5 = 0;
        } else {
            i5 = 4;
        }
        view3.setVisibility(i5);
        view3.setAlpha(this.T * (1.0f - k));
        l(view3, k);
        float R15 = hl.R1(0.875f, 1.0f, f6);
        View view4 = this.w;
        j(view4, U1, U12, R15);
        b21 b21Var = this.x;
        b21Var.layout(0, 0, b21Var.getMeasuredWidth(), b21Var.getMeasuredHeight());
        view4.setAlpha(k2);
        if (this.L && k2 > 0.0f) {
            i6 = 0;
        } else {
            i6 = 4;
        }
        view4.setVisibility(i6);
        l(view4, 1.0f - k2);
        boolean z12 = true;
        if (this.b0 < this.a0) {
            z2 = true;
        } else {
            z2 = false;
        }
        float L3 = ((hl.L(4.0f) + view4.getMeasuredHeight()) * R15) + U12;
        View view5 = this.s;
        j(view5, U1, L3, 1.0f);
        if (z2) {
            f = (1.0f - this.S) * k2;
        } else {
            f = 0.0f;
        }
        view5.setAlpha(f);
        if (f > 0.0f) {
            i7 = 0;
        } else {
            i7 = 4;
        }
        view5.setVisibility(i7);
        if (z2) {
            i8 = Math.round((1.0f - this.S) * hl.L(24.0f));
        } else {
            i8 = 0;
        }
        int measuredHeight = view4.getMeasuredHeight() + i8;
        if (this.L) {
            L = hl.L(8.0f) + hl.L(36.0f) + measuredHeight;
        } else {
            L = hl.L(40.0f);
        }
        HorizontalScrollView horizontalScrollView3 = this.y;
        horizontalScrollView3.layout(0, L, measuredWidth2, horizontalScrollView3.getMeasuredHeight() + L);
        int i12 = (f6 > 0.0f ? 1 : (f6 == 0.0f ? 0 : -1));
        ArrayList arrayList = this.H;
        if (i12 > 0 && !arrayList.isEmpty()) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z3) {
            i9 = 0;
        } else {
            i9 = 4;
        }
        horizontalScrollView3.setVisibility(i9);
        ArrayList arrayList2 = this.F;
        de0[] de0VarArr3 = this.d;
        if (z3 && !this.M && this.e0.length == arrayList.size()) {
            this.M = true;
            float f7 = hl.p;
            if (this.f0.length != arrayList.size()) {
                this.f0 = new String[arrayList.size()];
            }
            int i13 = 0;
            while (i13 < arrayList.size()) {
                String[] strArr = this.f0;
                StringBuilder sb = new StringBuilder();
                boolean z13 = z11;
                sb.append((int) (this.e0[i13] / f7));
                sb.append("_");
                sb.append((int) (this.c0 / f7));
                strArr[i13] = sb.toString();
                r47 r47Var = (r47) arrayList.get(i13);
                if (r47.K4(r47Var.k) && !r47Var.g4()) {
                    boolean z14 = xea.a;
                    if (i86.e(1024) && !r47Var.x3() && !r47Var.t2() && (r47Var.z0 || r47Var.y0 || (r47Var.B() && lq3.q(this.a).d(r47Var)))) {
                        String str = this.f0[i13];
                        TLRPC.Document F0 = r47Var.F0();
                        i11 = measuredWidth2;
                        z8 = z10;
                        horizontalScrollView2 = horizontalScrollView3;
                        jn5 jn5Var = null;
                        f5 = f7;
                        de0VarArr2 = de0VarArr3;
                        TLRPC.PhotoSize w = xb4.w(F0.thumbs, hl.Y0(z13), z13, null, true);
                        TLRPC.PhotoSize w2 = xb4.w(F0.thumbs, 40, z13, null, z13);
                        ImageReceiver imageReceiver = ((de0) arrayList2.get(i13)).getImageReceiver();
                        z9 = true;
                        imageReceiver.x0 = true;
                        imageReceiver.u0 = true;
                        imageReceiver.M(1);
                        jn5 b = jn5.b(F0);
                        jn5 c = jn5.c(w, F0);
                        if (w2 != null && w2 != w) {
                            jn5Var = jn5.c(w2, F0);
                        }
                        imageReceiver.Y(b, "g", c, str, jn5Var, qd4.o(str, "_b"), r47Var.I1, F0.size, null, r47Var, 0);
                        imageReceiver.w0(false);
                        i13++;
                        z12 = z9;
                        de0VarArr3 = de0VarArr2;
                        measuredWidth2 = i11;
                        z10 = z8;
                        horizontalScrollView3 = horizontalScrollView2;
                        f7 = f5;
                        z11 = false;
                    }
                }
                i11 = measuredWidth2;
                z8 = z10;
                horizontalScrollView2 = horizontalScrollView3;
                f5 = f7;
                de0VarArr2 = de0VarArr3;
                z9 = z12;
                n((de0) arrayList2.get(i13), r47Var, hl.Y0(z13), false, this.f0[i13], false);
                i13++;
                z12 = z9;
                de0VarArr3 = de0VarArr2;
                measuredWidth2 = i11;
                z10 = z8;
                horizontalScrollView3 = horizontalScrollView2;
                f7 = f5;
                z11 = false;
            }
            i10 = measuredWidth2;
            z4 = z10;
            horizontalScrollView = horizontalScrollView3;
            de0VarArr = de0VarArr3;
            z6 = z12;
            for (int i14 = 0; i14 < this.O && i14 < arrayList.size(); i14++) {
                n(de0VarArr[i14], (r47) arrayList.get(i14), hl.Y0(false), false, this.f0[i14], true);
            }
            z5 = false;
        } else {
            i10 = measuredWidth2;
            z4 = z10;
            horizontalScrollView = horizontalScrollView3;
            de0VarArr = de0VarArr3;
            z5 = false;
            z6 = true;
        }
        for (int i15 = z5; i15 < arrayList2.size(); i15++) {
            de0 de0Var2 = (de0) arrayList2.get(i15);
            if (i15 < this.O) {
                if (i(i15)) {
                    f3 = 1.0f;
                } else {
                    f3 = 0.0f;
                }
            } else {
                f3 = f6;
            }
            de0Var2.setAlpha(f3);
            TextView textView2 = (TextView) this.G.get(i15);
            if (i15 < this.O) {
                f4 = k(f6, 0.6f, 1.0f);
            } else {
                f4 = f6;
            }
            textView2.setAlpha(f4);
        }
        if (i12 <= 0 && this.O >= 3) {
            z7 = z5;
        } else {
            z7 = z6;
        }
        if (z7 != this.N) {
            this.N = z7;
            a(z7);
        }
        if (i12 > 0) {
            for (int i16 = z5; i16 < this.O; i16++) {
                de0VarArr[i16].setRoundRadius(Math.round(hl.U1(f6, hl.L(8.0f), hl.L(10.0f))));
            }
        }
        int L4 = hl.L(11.0f);
        if (!z4) {
            int i17 = i10 - L4;
            if (this.O == 2) {
                L2 = hl.L(100.0f);
            } else {
                L2 = hl.L(72.0f);
            }
            L4 = i17 - L2;
        }
        int L5 = hl.L(10.0f);
        int L6 = hl.L(72.0f);
        int D = ik8.D(2.0f, hl.L(72.0f), 2);
        int i18 = z5;
        while (true) {
            int i19 = this.O;
            if (i18 >= i19) {
                break;
            }
            float f8 = L5;
            if (i19 >= 3) {
                y = i18 == 0 ? L4 : (L4 + L6) - D;
                if (i18 == 2) {
                    f8 = (L5 + L6) - D;
                }
            } else {
                y = uh9.y(52.0f, i18, L4);
            }
            if (i12 > 0 && i18 < this.d0.length) {
                y = hl.R1(y, (g() + this.d0[i18]) - horizontalScrollView.getScrollX(), f6);
                f8 = hl.R1(f8, L, f6);
            }
            de0 de0Var3 = de0VarArr[i18];
            int round = Math.round(y);
            int round2 = Math.round(f8);
            de0Var3.layout(round, round2, de0Var3.getMeasuredWidth() + round, de0Var3.getMeasuredHeight() + round2);
            if (i(i18)) {
                f2 = 0.0f;
            } else {
                f2 = 1.0f;
            }
            de0Var3.setAlpha(f2);
            i18++;
        }
        int i20 = z5;
        while (true) {
            TextView[] textViewArr = this.e;
            if (i20 < textViewArr.length) {
                TextView textView3 = textViewArr[i20];
                de0 de0Var4 = de0VarArr[i20];
                int right = de0Var4.getRight() - hl.L(4.0f);
                int bottom = de0Var4.getBottom() - hl.L(4.0f);
                textView3.layout(right - textView3.getMeasuredWidth(), bottom - hl.L(16.0f), right, bottom);
                textView3.setAlpha(1.0f - k(f6, 0.0f, 0.4f));
                i20++;
            } else {
                return;
            }
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        int L;
        int i3;
        int i4;
        int i5;
        int i6;
        boolean z;
        int i7;
        int i8;
        int i9;
        int L2;
        TextView[] textViewArr;
        int L3;
        int L4;
        int L5;
        int[] iArr;
        int L6;
        int L7;
        int size = View.MeasureSpec.getSize(i);
        float f = this.R;
        if (this.K) {
            int L8 = hl.L(40.0f);
            if (this.O == 2) {
                L7 = hl.L(100.0f);
            } else {
                L7 = hl.L(72.0f);
            }
            L = L7 + L8;
        } else {
            L = hl.L(25.0f);
        }
        int i10 = size - L;
        TextView textView = this.h;
        int ceil = (int) Math.ceil(textView.getPaint().measureText(textView.getText().toString()));
        int i11 = 1073741824;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i10, 1073741824);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(hl.L(57.0f), Integer.MIN_VALUE);
        TextView textView2 = this.r;
        textView2.measure(makeMeasureSpec, makeMeasureSpec2);
        this.W = Math.max(1, Math.min(3, textView2.getLineCount()));
        textView2.measure(View.MeasureSpec.makeMeasureSpec(i10, 1073741824), View.MeasureSpec.makeMeasureSpec(hl.L(this.W * 19), 1073741824));
        int D = ik8.D(2.0f, hl.L(72.0f), 2);
        int L9 = hl.L((this.W * 19) + 42);
        if (this.K) {
            i3 = hl.L(94.0f);
        } else {
            i3 = 0;
        }
        this.U = Math.max(L9, i3);
        int L10 = size - hl.L(74.0f);
        int makeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(L10, 1073741824);
        b21 b21Var = this.x;
        b21Var.measure(makeMeasureSpec3, 0);
        if (this.L) {
            i4 = b21Var.getMeasuredHeight();
        } else {
            i4 = 0;
        }
        this.a0 = i4;
        Layout layout = b21Var.getLayout();
        if (layout != null && layout.getLineCount() > 10) {
            i5 = layout.getLineBottom(9);
        } else {
            i5 = this.a0;
        }
        this.b0 = i5;
        if (i5 < this.a0) {
            z = true;
        } else {
            z = false;
        }
        int round = Math.round(hl.U1(this.S, i5, i6));
        this.w.measure(View.MeasureSpec.makeMeasureSpec(L10, 1073741824), View.MeasureSpec.makeMeasureSpec(round, 1073741824));
        this.s.measure(0, View.MeasureSpec.makeMeasureSpec(hl.L(20.0f), 1073741824));
        if (z) {
            i7 = Math.round((1.0f - this.S) * hl.L(24.0f));
        } else {
            i7 = 0;
        }
        ArrayList arrayList = this.H;
        int size2 = arrayList.size();
        if (this.d0.length != size2) {
            this.d0 = new int[size2];
            this.e0 = new int[size2];
        }
        if (size2 == 0) {
            this.c0 = 0;
            i8 = 0;
        } else if (size2 == 1) {
            float b = b((r47) arrayList.get(0));
            float f2 = L10;
            i8 = 0;
            float min = Math.min(f2 / b, Math.min(hl.L(420.0f), f2 * 1.25f));
            this.e0[0] = (int) Math.min(f2, b * min);
            this.c0 = (int) Math.max(min, hl.L(120.0f));
        } else {
            i8 = 0;
            float f3 = L10;
            this.c0 = (int) Math.min(hl.L(220.0f), 0.75f * f3);
            int i12 = 0;
            int i13 = 0;
            while (i12 < size2) {
                float b2 = b((r47) arrayList.get(i12));
                this.d0[i12] = i13;
                int[] iArr2 = this.e0;
                int i14 = i12;
                float f4 = this.c0;
                iArr2[i14] = (int) Math.min(f3, Math.max(f4 * 0.5f, Math.min(f4 * 1.6f, f4 * b2)));
                i13 = uh9.w(4.0f, this.e0[i14], i13);
                i12 = i14 + 1;
                size2 = size2;
                round = round;
                i11 = 1073741824;
            }
        }
        int i15 = round;
        int i16 = i11;
        this.y.measure(View.MeasureSpec.makeMeasureSpec(size, i16), View.MeasureSpec.makeMeasureSpec(this.c0, i16));
        int L11 = hl.L(36.0f);
        boolean z2 = this.L;
        if (z2) {
            i9 = i15 + i7;
        } else {
            i9 = i8;
        }
        int i17 = L11 + i9;
        if (this.c0 > 0) {
            int i18 = i15 + i7;
            if (z2) {
                L6 = hl.L(8.0f) + hl.L(36.0f) + i18;
            } else {
                L6 = hl.L(40.0f);
            }
            i17 = L6 + this.c0;
        }
        this.V = qu6.e(12.0f, i17, hl.L(60.0f));
        int makeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(hl.L(18.0f), 1073741824);
        TextView textView3 = this.n;
        int i19 = i8;
        textView3.measure(i19, makeMeasureSpec4);
        textView.measure(i19, View.MeasureSpec.makeMeasureSpec(hl.L(18.0f), 1073741824));
        if (textView3.getVisibility() == 8) {
            L2 = 0;
        } else {
            L2 = hl.L(10.0f) + textView3.getMeasuredWidth();
        }
        this.f.measure(View.MeasureSpec.makeMeasureSpec(Math.max(0, (int) (hl.U1(f, qu6.x(28.0f, i10, ceil), ((L10 - ceil) - L2) - hl.L(8.0f)) / hl.R1(0.8666667f, 1.0f, this.R))), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(hl.L(20.0f), 1073741824));
        int round2 = Math.round(hl.U1(f, hl.L(16.0f), hl.L(36.0f)));
        this.c.measure(View.MeasureSpec.makeMeasureSpec(round2, 1073741824), View.MeasureSpec.makeMeasureSpec(round2, 1073741824));
        int i20 = 0;
        while (true) {
            de0[] de0VarArr = this.d;
            if (i20 >= de0VarArr.length) {
                break;
            }
            int i21 = this.O;
            if (i21 >= 3) {
                L4 = D;
            } else if (i21 == 2) {
                L4 = hl.L(48.0f);
            } else {
                L4 = hl.L(72.0f);
            }
            if (this.O >= 3 && i20 > 0) {
                L5 = D;
            } else {
                L5 = hl.L(72.0f);
            }
            if (i20 < this.O) {
                if (i20 < this.e0.length && f > 0.0f) {
                    L4 = Math.round(hl.U1(f, L4, iArr[i20]));
                    L5 = Math.round(hl.U1(f, L5, this.c0));
                }
            }
            de0VarArr[i20].measure(View.MeasureSpec.makeMeasureSpec(L4, 1073741824), View.MeasureSpec.makeMeasureSpec(L5, 1073741824));
            i20++;
        }
        for (TextView textView4 : this.e) {
            if (this.O == 2) {
                L3 = hl.L(40.0f);
            } else {
                L3 = hl.L(64.0f);
            }
            textView4.measure(View.MeasureSpec.makeMeasureSpec(L3, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(hl.L(16.0f), 1073741824));
        }
        setMeasuredDimension(size, Math.round(hl.U1(f, this.U, this.V)));
    }

    public final void p() {
        r47 r47Var;
        float f;
        t94 t94Var = this.I;
        if (t94Var != null && (r47Var = this.J) != null) {
            im7 im7Var = (im7) t94Var;
            lm7 lm7Var = im7Var.z3;
            km7 km7Var = (km7) lm7Var.V.get(lm7.B0(im7Var.n3, r47Var));
            if (km7Var == null) {
                km7Var = lm7Var.U;
            }
            float f2 = km7Var.a;
            im7 im7Var2 = (im7) this.I;
            km7 km7Var2 = (km7) im7Var2.z3.W.get(lm7.B0(im7Var2.n3, this.J));
            if (km7Var2 != null) {
                f = km7Var2.a;
            } else {
                f = 0.0f;
            }
            float max = Math.max(0.0f, Math.min(1.0f, f2));
            float max2 = Math.max(0.0f, Math.min(1.0f, f));
            if (this.R != max || this.S != max2) {
                this.R = max;
                this.S = max2;
                requestLayout();
                invalidate();
            }
        }
    }

    public final TextView q(Context context, int i, int i2) {
        TextView textView = new TextView(context);
        textView.setTextSize(i);
        yob.X(textView, i2, this.b);
        textView.setIncludeFontPadding(false);
        textView.setElegantTextHeight(false);
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 28) {
            textView.setFallbackLineSpacing(false);
        }
        if (i3 >= 35) {
            textView.setLocalePreferredLineHeightForMinimumUsed(false);
        }
        textView.setGravity(16);
        return textView;
    }

    public void setHost(t94 t94Var) {
        this.I = t94Var;
    }

    public void setMessage(r47 r47Var) {
        m(r47Var, null);
    }

    @Override
    public void setScrimHidden(boolean z) {
        if (this.n0 != z) {
            this.n0 = z;
            if (getParent() instanceof View) {
                ((View) getParent()).invalidate();
            }
        }
    }
}
