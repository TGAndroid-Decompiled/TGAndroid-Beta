package defpackage;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.os.AsyncTask;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.URLSpan;
import android.util.SparseIntArray;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.net.URLEncoder;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class eb extends FrameLayout {
    public final cb E;
    public int F;
    public int G;
    public int H;
    public int I;
    public int J;
    public float K;
    public boolean L;
    public iu M;
    public xt N;
    public xt O;
    public AsyncTask P;
    public final rk5 a;
    public boolean b;
    public final fg0 c;
    public final FrameLayout d;
    public final FrameLayout e;
    public final ImageView f;
    public final fg0 h;
    public final ImageView n;
    public final TextView r;
    public final TextView s;
    public final o72 w;
    public final va x;
    public final ArrayList y;

    public eb(Activity activity) {
        super(activity);
        int i = z8c.t0;
        this.y = new ArrayList();
        this.K = 0.0f;
        setWillNotDraw(false);
        int i2 = z8c.t0;
        f fVar = new f(this, (byte) 5);
        ta taVar = new ta(this);
        rk5 rk5Var = new rk5((ylb) null);
        this.a = rk5Var;
        va vaVar = new va(this, activity, i2, fVar, taVar, rk5Var);
        this.x = vaVar;
        vaVar.g3.r = false;
        vaVar.setOverScrollMode(2);
        vaVar.setPadding(0, 0, 0, 0);
        addView(vaVar, qoe.e(-1, -1, 119));
        FrameLayout frameLayout = new FrameLayout(activity);
        this.d = frameLayout;
        FrameLayout frameLayout2 = new FrameLayout(activity);
        this.e = frameLayout2;
        fg0 Z = cmb.Z(this.H, this.J, 15, 15);
        this.c = Z;
        frameLayout2.setBackground(Z);
        rve.b(frameLayout2, 0.04f, 1.25f);
        frameLayout.addView(frameLayout2, qoe.d(-1, -2.0f, 7, 12.0f, 0.0f, 12.0f, 15.0f));
        ImageView imageView = new ImageView(activity);
        this.f = imageView;
        frameLayout2.addView(imageView, qoe.d(24, 24.0f, 19, 16.0f, 16.0f, 16.0f, 16.0f));
        ImageView imageView2 = new ImageView(activity);
        this.n = imageView2;
        rve.a(imageView2);
        imageView2.setScaleType(ImageView.ScaleType.CENTER);
        imageView2.setImageResource(2131232109);
        fg0 Z2 = cmb.Z(0, 0, 6, 6);
        this.h = Z2;
        imageView2.setBackground(Z2);
        frameLayout2.addView(imageView2, qoe.d(32, 32.0f, 53, 14.0f, 14.0f, 14.0f, 14.0f));
        LinearLayout linearLayout = new LinearLayout(activity);
        linearLayout.setOrientation(1);
        frameLayout2.addView(linearLayout, qoe.d(-1, -2.0f, 16, 54.0f, 9.0f, 54.0f, 9.0f));
        TextView textView = new TextView(activity);
        this.r = textView;
        textView.setTextSize(1, 16.0f);
        textView.setTypeface(gm.o());
        textView.setMaxLines(4);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        linearLayout.addView(textView, qoe.t(-1, -2, 55, 0, 0, 0, 2));
        TextView textView2 = new TextView(activity);
        this.s = textView2;
        textView2.setTextSize(1, 14.0f);
        textView2.setMaxLines(3);
        textView2.setEllipsize(TextUtils.TruncateAt.MIDDLE);
        linearLayout.addView(textView2, qoe.t(-1, -2, 55, 0, 0, 0, 0));
        this.E = new cb(null, i, new b1(this, (byte) 6));
        this.w = new o72(activity, (byte) 1);
        int i3 = cmb.Fl;
        c(cmb.w0(null, i3, false), gm.B(cmb.w0(null, i3, false)) >= 0.721f ? -16777216 : -1);
        setOpenProgress(0.0f);
        setImportantForAccessibility(4);
    }

    public static String a(k47 k47Var) {
        TLRPC.Message message = k47Var.k;
        if (message != null) {
            TLRPC.MessageMedia messageMedia = message.media;
            if (messageMedia instanceof TLRPC.TL_messageMediaWebPage) {
                return messageMedia.webpage.url;
            }
        }
        CharSequence charSequence = k47Var.v;
        if (charSequence != null && charSequence.length() > 0) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(k47Var.v);
            for (URLSpan uRLSpan : (URLSpan[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), URLSpan.class)) {
                String url = uRLSpan.getURL();
                if (url != null && !url.startsWith("@") && !url.startsWith("#") && !url.startsWith("$")) {
                    return url;
                }
            }
            return null;
        }
        return null;
    }

    public static void b(android.content.Context r15, java.lang.String r16) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eb.b(android.content.Context, java.lang.String):void");
    }

    public final void c(int i, int i2) {
        float f;
        if (this.F != i) {
            this.F = i;
            invalidate();
        }
        this.I = i2;
        if (gm.B(i) >= 0.721f) {
            f = 0.0f;
        } else {
            f = 1.0f;
        }
        this.H = on2.f(gm.R1(0.05f, 0.12f, f), i, i2);
        this.G = i;
        this.J = on2.f(gm.R1(0.12f, 0.22f, f), i, i2);
        int i3 = this.H;
        fg0 fg0Var = this.c;
        cmb.F1(fg0Var, i3, false);
        cmb.F1(fg0Var, this.J, true);
        this.e.invalidate();
        this.r.setTextColor(i2);
        this.s.setTextColor(cmb.p1(0.6f, i2));
        ImageView imageView = this.f;
        if (imageView.getColorFilter() != null) {
            imageView.setColorFilter(new PorterDuffColorFilter(i2, PorterDuff.Mode.SRC_IN));
        }
        this.n.setColorFilter(new PorterDuffColorFilter(i2, PorterDuff.Mode.SRC_IN));
        cmb.F1(this.h, cmb.p1(1.5f, this.J), true);
        int v = cmb.v(i, cmb.p1(0.05f, i2));
        int v2 = cmb.v(i, cmb.p1(0.55f, i2));
        rk5 rk5Var = this.a;
        SparseIntArray sparseIntArray = (SparseIntArray) rk5Var.b;
        ((SparseIntArray) rk5Var.b).put(cmb.c6, this.G);
        sparseIntArray.put(cmb.F6, i2);
        sparseIntArray.put(cmb.d7, v);
        sparseIntArray.put(cmb.e7, v2);
        sparseIntArray.put(cmb.F8, cmb.p1(0.2f, i2));
        sparseIntArray.put(cmb.h6, cmb.p1(gm.R1(0.05f, 0.12f, f), i2));
        this.x.h1();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        canvas.clipRect(0.0f, 0.0f, getWidth(), getHeight() * this.K);
        canvas.drawColor(this.G);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.K < 0.3f) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        cb cbVar = this.E;
        if (cbVar != null && this.L) {
            cbVar.a();
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        cb cbVar = this.E;
        if (cbVar != null) {
            cbVar.c();
        }
    }

    public void setInput(String str) {
        AsyncTask asyncTask = this.P;
        String str2 = null;
        if (asyncTask != null) {
            asyncTask.cancel(true);
            this.P = null;
        }
        ArrayList arrayList = this.y;
        boolean z = !arrayList.isEmpty();
        if (TextUtils.isEmpty(str)) {
            arrayList.clear();
            va vaVar = this.x;
            vaVar.g3.O(true);
            if (z != (!arrayList.isEmpty())) {
                vaVar.f3.g1(0, 0);
                return;
            }
            return;
        }
        li5 li5Var = new li5(new ra((byte) 0, this, z));
        String str3 = ku9.a().c;
        if (str3 != null) {
            str2 = str3 + URLEncoder.encode(str);
        }
        this.P = li5Var.execute(str2);
    }

    public void setOpenProgress(float f) {
        int i;
        if (Math.abs(this.K - f) > 1.0E-4f) {
            this.K = f;
            if (f <= 1.0E-4f) {
                i = 4;
            } else {
                i = 0;
            }
            if (getImportantForAccessibility() != i) {
                setImportantForAccessibility(i);
            }
            invalidate();
        }
    }

    public void setOpened(boolean z) {
        boolean z2;
        cb cbVar = this.E;
        if (z && cbVar != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.L = z2;
        if (z2) {
            cbVar.a();
        }
    }
}
