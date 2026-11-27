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
public final class pn4 extends FrameLayout implements snb {
    public final boolean a;
    public final CharSequence b;
    public final on4 c;
    public final gm d;
    public final gm e;
    public final qn4 f;

    public pn4(qn4 qn4Var, Context context, boolean z, CharSequence charSequence, ArrayList arrayList, boolean z2) {
        super(context);
        CharSequence spannableStringBuilder;
        int i;
        int i2;
        this.f = qn4Var;
        this.a = z;
        String M0 = ob6.M0(2131750611, null);
        String M02 = ob6.M0(2131750610, null);
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
        int i3 = aob.vi;
        textPaint.setColor(aob.p1(0.8f, aob.w0(null, i3, false)));
        uh9.p(textPaint, hl.L(15.33f));
        int i4 = aob.o6;
        textPaint2.setColor(aob.w0(null, i4, false));
        uh9.p(textPaint2, hl.L(17.0f));
        paint.setColor(aob.w0(null, aob.Ki, false));
        hn hnVar = new hn(false, true, true);
        view.F = hnVar;
        hnVar.n(0.3f, 250L, k43.h);
        hnVar.setCallback(view);
        hnVar.w(hl.L(11.66f));
        hnVar.u(aob.w0(null, aob.d6, false));
        hnVar.x(hl.o());
        hnVar.b = 1;
        int p1 = aob.p1(0.8f, aob.w0(null, i3, false));
        int w0 = aob.w0(null, i4, false);
        pkb pkbVar = new pkb(on4.a(M0), 15.33f, hl.o());
        pkbVar.q(view);
        pkbVar.a.setColor(p1);
        view.f = pkbVar;
        CharSequence a = on4.a(spannableStringBuilder);
        pkb pkbVar2 = new pkb(a, 15.33f, hl.o());
        pkbVar2.q(view);
        TextPaint textPaint3 = pkbVar2.a;
        textPaint3.setColor(w0);
        view.h = pkbVar2;
        pkbVar2.p(r47.A5(pv3.m(a, textPaint3.getFontMetricsInt(), false, null, 0), arrayList, textPaint3.getFontMetricsInt(), false));
        if (z2) {
            i = 26;
        } else {
            i = 0;
        }
        pkbVar2.n(i);
        pkb pkbVar3 = new pkb(on4.a(M02), 15.33f, hl.o());
        pkbVar3.q(view);
        pkbVar3.a.setColor(p1);
        view.n = pkbVar3;
        float L = hl.L(3.0f);
        fArr[3] = L;
        fArr[2] = L;
        fArr[1] = L;
        fArr[0] = L;
        float L2 = hl.L(1.0f);
        fArr[7] = L2;
        fArr[6] = L2;
        fArr[5] = L2;
        fArr[4] = L2;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, hl.L(80.0f), 0.0f, new int[]{-1, 16777215}, new float[]{0.0f, 1.0f}, tileMode);
        view.r = linearGradient;
        paint2.setShader(linearGradient);
        PorterDuff.Mode mode = PorterDuff.Mode.DST_OUT;
        paint2.setXfermode(new PorterDuffXfermode(mode));
        LinearGradient linearGradient2 = new LinearGradient(0.0f, 0.0f, hl.L(80.0f), 0.0f, new int[]{16777215, -1}, new float[]{0.0f, 1.0f}, tileMode);
        view.s = linearGradient2;
        paint3.setShader(linearGradient2);
        paint3.setXfermode(new PorterDuffXfermode(mode));
        this.c = view;
        addView((View) view, tre.d(-1, 44.0f, 55, 0.0f, 17.33f, 0.0f, 0.0f));
        gm gmVar = new gm(context);
        this.d = gmVar;
        int i5 = aob.G6;
        yob.X(gmVar, i5, null);
        gmVar.setTextSize(1, 20.0f);
        gmVar.setTypeface(hl.o());
        gmVar.setGravity(17);
        gmVar.setLineSpacing(hl.L(-1.0f), 1.0f);
        CharSequence n = pv3.n(new SpannableStringBuilder(charSequence), gmVar.getPaint().getFontMetricsInt(), false, null, 0, 0.8f, 0);
        this.b = n;
        this.b = r47.B5(n, arrayList, gmVar.getPaint().getFontMetricsInt(), false, 0.8f, 0);
        gmVar.setText(qn4Var.K0());
        if (z2) {
            i2 = 26;
        } else {
            i2 = 0;
        }
        gmVar.setCacheType(i2);
        gmVar.setEmojiColor(aob.v0(aob.Fi, qn4Var.J0));
        addView(gmVar, tre.d(-1, -2.0f, 48, 32.0f, 78.3f, 32.0f, 0.0f));
        gm gmVar2 = new gm(context);
        this.e = gmVar2;
        yob.X(gmVar2, i5, null);
        gmVar2.setTextSize(1, 14.0f);
        gmVar2.setLines(2);
        gmVar2.setGravity(17);
        gmVar2.setLineSpacing(0.0f, 1.15f);
        addView(gmVar2, tre.d(-1, -2.0f, 48, 32.0f, 113.0f, 32.0f, 0.0f));
        a();
    }

    public final void a() {
        int i;
        String str;
        int i2;
        qn4 qn4Var = this.f;
        ArrayList arrayList = qn4Var.b2;
        boolean z = qn4Var.W1;
        CharSequence charSequence = this.b;
        gm gmVar = this.e;
        if (z) {
            gmVar.setText(hl.R2(ob6.V(null, null, 2131750597, charSequence)));
        } else if (this.a) {
            if (arrayList != null) {
                i = arrayList.size();
            } else {
                i = 0;
            }
            on4 on4Var = this.c;
            hn hnVar = on4Var.F;
            if (i > 0) {
                str = uh9.k(i, "+");
            } else {
                str = "";
            }
            hnVar.t(str, false, true);
            on4Var.invalidate();
            if (arrayList != null && !arrayList.isEmpty()) {
                if (arrayList != null) {
                    i2 = arrayList.size();
                } else {
                    i2 = 0;
                }
                gmVar.setText(hl.R2(ob6.F("FolderLinkSubtitleChats", i2, charSequence)));
                return;
            }
            gmVar.setText(hl.R2(ob6.V(null, null, 2131750601, charSequence)));
        } else if (arrayList != null && !arrayList.isEmpty()) {
            gmVar.setText(hl.R2(ob6.V(null, null, 2131750602, charSequence)));
        } else {
            gmVar.setText(hl.R2(ob6.V(null, null, 2131750601, charSequence)));
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(hl.L(172.0f), 1073741824));
    }

    @Override
    public final void updateColors() {
        try {
            gm gmVar = this.d;
            if (gmVar != null) {
                int i = aob.Fi;
                qn4 qn4Var = this.f;
                int i2 = qn4.A2;
                gmVar.setEmojiColor(aob.v0(i, qn4Var.J0));
            }
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
