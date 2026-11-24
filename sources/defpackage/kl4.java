package defpackage;

import android.content.Context;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.HashSet;
public final class kl4 extends FrameLayout implements tjb {
    public final boolean a;
    public final CharSequence b;
    public final jl4 c;
    public final fm d;
    public final fm e;
    public final ll4 f;

    public kl4(ll4 ll4Var, Context context, boolean z, CharSequence charSequence, ArrayList arrayList, boolean z2) {
        super(context);
        CharSequence spannableStringBuilder;
        int i;
        int i2;
        this.f = ll4Var;
        this.a = z;
        String M0 = k96.M0(2131750634, null);
        String M02 = k96.M0(2131750633, null);
        if (charSequence == null) {
            spannableStringBuilder = "";
        } else {
            spannableStringBuilder = new SpannableStringBuilder(charSequence);
        }
        ?? view = new View(context);
        TextPaint textPaint = new TextPaint(1);
        view.a = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        view.b = textPaint2;
        Paint paint = new Paint(1);
        view.c = paint;
        view.d = new Path();
        float[] fArr = new float[8];
        view.e = fArr;
        Paint paint2 = new Paint(1);
        view.w = paint2;
        Paint paint3 = new Paint(1);
        view.x = paint3;
        view.y = new Matrix();
        view.E = new Matrix();
        int i3 = bkb.ui;
        textPaint.setColor(bkb.p1(0.8f, bkb.w0(null, i3, false)));
        de9.p(textPaint, gl.L(15.33f));
        int i4 = bkb.n6;
        textPaint2.setColor(bkb.w0(null, i4, false));
        de9.p(textPaint2, gl.L(17.0f));
        paint.setColor(bkb.w0(null, bkb.Ji, false));
        gn gnVar = new gn(false, true, true);
        view.F = gnVar;
        gnVar.n(0.3f, 250L, s33.h);
        gnVar.setCallback(view);
        gnVar.w(gl.L(11.66f));
        gnVar.u(bkb.w0(null, bkb.c6, false));
        gnVar.x(gl.o());
        gnVar.b = 1;
        int p1 = bkb.p1(0.8f, bkb.w0(null, i3, false));
        int w0 = bkb.w0(null, i4, false);
        tgb tgbVar = new tgb(jl4.a(M0), 15.33f, gl.o());
        tgbVar.q(view);
        tgbVar.a.setColor(p1);
        view.f = tgbVar;
        CharSequence a = jl4.a(spannableStringBuilder);
        tgb tgbVar2 = new tgb(a, 15.33f, gl.o());
        tgbVar2.q(view);
        TextPaint textPaint3 = tgbVar2.a;
        textPaint3.setColor(w0);
        view.h = tgbVar2;
        tgbVar2.p(k27.A5(vu3.m(a, textPaint3.getFontMetricsInt(), false, null, 0), arrayList, textPaint3.getFontMetricsInt(), false));
        if (z2) {
            i = 26;
        } else {
            i = 0;
        }
        tgbVar2.n(i);
        tgb tgbVar3 = new tgb(jl4.a(M02), 15.33f, gl.o());
        tgbVar3.q(view);
        tgbVar3.a.setColor(p1);
        view.n = tgbVar3;
        float L = gl.L(3.0f);
        fArr[3] = L;
        fArr[2] = L;
        fArr[1] = L;
        fArr[0] = L;
        float L2 = gl.L(1.0f);
        fArr[7] = L2;
        fArr[6] = L2;
        fArr[5] = L2;
        fArr[4] = L2;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, gl.L(80.0f), 0.0f, new int[]{-1, 16777215}, new float[]{0.0f, 1.0f}, tileMode);
        view.r = linearGradient;
        paint2.setShader(linearGradient);
        PorterDuff.Mode mode = PorterDuff.Mode.DST_OUT;
        paint2.setXfermode(new PorterDuffXfermode(mode));
        LinearGradient linearGradient2 = new LinearGradient(0.0f, 0.0f, gl.L(80.0f), 0.0f, new int[]{16777215, -1}, new float[]{0.0f, 1.0f}, tileMode);
        view.s = linearGradient2;
        paint3.setShader(linearGradient2);
        paint3.setXfermode(new PorterDuffXfermode(mode));
        this.c = view;
        addView((View) view, nme.d(-1, 44.0f, 55, 0.0f, 17.33f, 0.0f, 0.0f));
        fm fmVar = new fm(context);
        this.d = fmVar;
        int i5 = bkb.F6;
        zkb.X(fmVar, i5, null);
        fmVar.setTextSize(1, 20.0f);
        fmVar.setTypeface(gl.o());
        fmVar.setGravity(17);
        fmVar.setLineSpacing(gl.L(-1.0f), 1.0f);
        CharSequence n = vu3.n(new SpannableStringBuilder(charSequence), fmVar.getPaint().getFontMetricsInt(), false, null, 0, 0.8f, 0);
        this.b = n;
        this.b = k27.B5(n, arrayList, fmVar.getPaint().getFontMetricsInt(), false, 0.8f, 0);
        fmVar.setText(ll4Var.J0());
        if (z2) {
            i2 = 26;
        } else {
            i2 = 0;
        }
        fmVar.setCacheType(i2);
        fmVar.setEmojiColor(bkb.v0(bkb.Ei, ll4Var.J0));
        addView(fmVar, nme.d(-1, -2.0f, 48, 32.0f, 78.3f, 32.0f, 0.0f));
        fm fmVar2 = new fm(context);
        this.e = fmVar2;
        zkb.X(fmVar2, i5, null);
        fmVar2.setTextSize(1, 14.0f);
        fmVar2.setLines(2);
        fmVar2.setGravity(17);
        fmVar2.setLineSpacing(0.0f, 1.15f);
        addView(fmVar2, nme.d(-1, -2.0f, 48, 32.0f, 113.0f, 32.0f, 0.0f));
        a();
    }

    public final void a() {
        int i;
        String str;
        int i2;
        ll4 ll4Var = this.f;
        ArrayList arrayList = ll4Var.b2;
        boolean z = ll4Var.W1;
        CharSequence charSequence = this.b;
        fm fmVar = this.e;
        if (z) {
            fmVar.setText(gl.R2(k96.V(null, null, 2131750620, charSequence)));
        } else if (this.a) {
            if (arrayList != null) {
                i = arrayList.size();
            } else {
                i = 0;
            }
            jl4 jl4Var = this.c;
            gn gnVar = jl4Var.F;
            if (i > 0) {
                str = de9.k(i, "+");
            } else {
                str = "";
            }
            gnVar.t(str, false, true);
            jl4Var.invalidate();
            if (arrayList != null && !arrayList.isEmpty()) {
                if (arrayList != null) {
                    i2 = arrayList.size();
                } else {
                    i2 = 0;
                }
                fmVar.setText(gl.R2(k96.F("FolderLinkSubtitleChats", i2, charSequence)));
                return;
            }
            fmVar.setText(gl.R2(k96.V(null, null, 2131750624, charSequence)));
        } else if (arrayList != null && !arrayList.isEmpty()) {
            fmVar.setText(gl.R2(k96.V(null, null, 2131750625, charSequence)));
        } else {
            fmVar.setText(gl.R2(k96.V(null, null, 2131750624, charSequence)));
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(gl.L(172.0f), 1073741824));
    }

    @Override
    public final void updateColors() {
        try {
            fm fmVar = this.d;
            if (fmVar != null) {
                int i = bkb.Ei;
                ll4 ll4Var = this.f;
                int i2 = ll4.A2;
                fmVar.setEmojiColor(bkb.v0(i, ll4Var.J0));
            }
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
