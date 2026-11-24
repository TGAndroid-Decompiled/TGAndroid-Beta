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
public final class kn4 extends FrameLayout implements vlb {
    public final boolean a;
    public final CharSequence b;
    public final jn4 c;
    public final fn d;
    public final fn e;
    public final ln4 f;

    public kn4(ln4 ln4Var, Context context, boolean z, CharSequence charSequence, ArrayList arrayList, boolean z2) {
        super(context);
        CharSequence spannableStringBuilder;
        int i;
        int i2;
        this.f = ln4Var;
        this.a = z;
        String M0 = jb6.M0(2131750583, null);
        String M02 = jb6.M0(2131750582, null);
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
        int i3 = cmb.ui;
        textPaint.setColor(cmb.p1(0.8f, cmb.w0(null, i3, false)));
        hg9.o(textPaint, gm.L(15.33f));
        int i4 = cmb.n6;
        textPaint2.setColor(cmb.w0(null, i4, false));
        hg9.o(textPaint2, gm.L(17.0f));
        paint.setColor(cmb.w0(null, cmb.Ji, false));
        ho hoVar = new ho(false, true, true);
        view.F = hoVar;
        hoVar.n(0.3f, 250L, d53.h);
        hoVar.setCallback(view);
        hoVar.w(gm.L(11.66f));
        hoVar.u(cmb.w0(null, cmb.c6, false));
        hoVar.x(gm.o());
        hoVar.b = 1;
        int p1 = cmb.p1(0.8f, cmb.w0(null, i3, false));
        int w0 = cmb.w0(null, i4, false);
        uib uibVar = new uib(jn4.a(M0), 15.33f, gm.o());
        uibVar.q(view);
        uibVar.a.setColor(p1);
        view.f = uibVar;
        CharSequence a = jn4.a(spannableStringBuilder);
        uib uibVar2 = new uib(a, 15.33f, gm.o());
        uibVar2.q(view);
        TextPaint textPaint3 = uibVar2.a;
        textPaint3.setColor(w0);
        view.h = uibVar2;
        uibVar2.p(k47.A5(gw3.m(a, textPaint3.getFontMetricsInt(), false, null, 0), arrayList, textPaint3.getFontMetricsInt(), false));
        if (z2) {
            i = 26;
        } else {
            i = 0;
        }
        uibVar2.n(i);
        uib uibVar3 = new uib(jn4.a(M02), 15.33f, gm.o());
        uibVar3.q(view);
        uibVar3.a.setColor(p1);
        view.n = uibVar3;
        float L = gm.L(3.0f);
        fArr[3] = L;
        fArr[2] = L;
        fArr[1] = L;
        fArr[0] = L;
        float L2 = gm.L(1.0f);
        fArr[7] = L2;
        fArr[6] = L2;
        fArr[5] = L2;
        fArr[4] = L2;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, gm.L(80.0f), 0.0f, new int[]{-1, 16777215}, new float[]{0.0f, 1.0f}, tileMode);
        view.r = linearGradient;
        paint2.setShader(linearGradient);
        PorterDuff.Mode mode = PorterDuff.Mode.DST_OUT;
        paint2.setXfermode(new PorterDuffXfermode(mode));
        LinearGradient linearGradient2 = new LinearGradient(0.0f, 0.0f, gm.L(80.0f), 0.0f, new int[]{16777215, -1}, new float[]{0.0f, 1.0f}, tileMode);
        view.s = linearGradient2;
        paint3.setShader(linearGradient2);
        paint3.setXfermode(new PorterDuffXfermode(mode));
        this.c = view;
        addView((View) view, qoe.d(-1, 44.0f, 55, 0.0f, 17.33f, 0.0f, 0.0f));
        fn fnVar = new fn(context);
        this.d = fnVar;
        int i5 = cmb.F6;
        anb.X(fnVar, i5, null);
        fnVar.setTextSize(1, 20.0f);
        fnVar.setTypeface(gm.o());
        fnVar.setGravity(17);
        fnVar.setLineSpacing(gm.L(-1.0f), 1.0f);
        CharSequence n = gw3.n(new SpannableStringBuilder(charSequence), fnVar.getPaint().getFontMetricsInt(), false, null, 0, 0.8f, 0);
        this.b = n;
        this.b = k47.B5(n, arrayList, fnVar.getPaint().getFontMetricsInt(), false, 0.8f, 0);
        fnVar.setText(ln4Var.J0());
        if (z2) {
            i2 = 26;
        } else {
            i2 = 0;
        }
        fnVar.setCacheType(i2);
        fnVar.setEmojiColor(cmb.v0(cmb.Ei, ln4Var.J0));
        addView(fnVar, qoe.d(-1, -2.0f, 48, 32.0f, 78.3f, 32.0f, 0.0f));
        fn fnVar2 = new fn(context);
        this.e = fnVar2;
        anb.X(fnVar2, i5, null);
        fnVar2.setTextSize(1, 14.0f);
        fnVar2.setLines(2);
        fnVar2.setGravity(17);
        fnVar2.setLineSpacing(0.0f, 1.15f);
        addView(fnVar2, qoe.d(-1, -2.0f, 48, 32.0f, 113.0f, 32.0f, 0.0f));
        a();
    }

    public final void a() {
        int i;
        String str;
        int i2;
        ln4 ln4Var = this.f;
        ArrayList arrayList = ln4Var.b2;
        boolean z = ln4Var.W1;
        CharSequence charSequence = this.b;
        fn fnVar = this.e;
        if (z) {
            fnVar.setText(gm.R2(jb6.V(null, null, 2131750569, charSequence)));
        } else if (this.a) {
            if (arrayList != null) {
                i = arrayList.size();
            } else {
                i = 0;
            }
            jn4 jn4Var = this.c;
            ho hoVar = jn4Var.F;
            if (i > 0) {
                str = hg9.j(i, "+");
            } else {
                str = "";
            }
            hoVar.t(str, false, true);
            jn4Var.invalidate();
            if (arrayList != null && !arrayList.isEmpty()) {
                if (arrayList != null) {
                    i2 = arrayList.size();
                } else {
                    i2 = 0;
                }
                fnVar.setText(gm.R2(jb6.F("FolderLinkSubtitleChats", i2, charSequence)));
                return;
            }
            fnVar.setText(gm.R2(jb6.V(null, null, 2131750573, charSequence)));
        } else if (arrayList != null && !arrayList.isEmpty()) {
            fnVar.setText(gm.R2(jb6.V(null, null, 2131750574, charSequence)));
        } else {
            fnVar.setText(gm.R2(jb6.V(null, null, 2131750573, charSequence)));
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(gm.L(172.0f), 1073741824));
    }

    @Override
    public final void updateColors() {
        try {
            fn fnVar = this.d;
            if (fnVar != null) {
                int i = cmb.Ei;
                ln4 ln4Var = this.f;
                int i2 = ln4.A2;
                fnVar.setEmojiColor(cmb.v0(i, ln4Var.J0));
            }
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
