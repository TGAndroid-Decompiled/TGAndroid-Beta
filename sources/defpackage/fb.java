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
public final class fb extends FrameLayout {
    public final db E;
    public int F;
    public int G;
    public int H;
    public int I;
    public int J;
    public float K;
    public boolean L;
    public gt M;
    public vs N;
    public vs O;
    public AsyncTask P;
    public final uk5 a;
    public boolean b;
    public final hf0 c;
    public final FrameLayout d;
    public final FrameLayout e;
    public final ImageView f;
    public final hf0 h;
    public final ImageView n;
    public final TextView r;
    public final TextView s;
    public final t62 w;
    public final wa x;
    public final ArrayList y;

    public fb(Activity activity) {
        super(activity);
        int i = yac.t0;
        this.y = new ArrayList();
        this.K = 0.0f;
        setWillNotDraw(false);
        int i2 = yac.t0;
        c cVar = new c(this, (byte) 5);
        ua uaVar = new ua(this);
        uk5 uk5Var = new uk5((vnb) null);
        this.a = uk5Var;
        wa waVar = new wa(this, activity, i2, cVar, uaVar, uk5Var);
        this.x = waVar;
        waVar.g3.r = false;
        waVar.setOverScrollMode(2);
        waVar.setPadding(0, 0, 0, 0);
        addView(waVar, tre.e(-1, -1, 119));
        FrameLayout frameLayout = new FrameLayout(activity);
        this.d = frameLayout;
        FrameLayout frameLayout2 = new FrameLayout(activity);
        this.e = frameLayout2;
        hf0 Z = aob.Z(this.H, this.J, 15, 15);
        this.c = Z;
        frameLayout2.setBackground(Z);
        iye.b(frameLayout2, 0.04f, 1.25f);
        frameLayout.addView(frameLayout2, tre.d(-1, -2.0f, 7, 12.0f, 0.0f, 12.0f, 15.0f));
        ImageView imageView = new ImageView(activity);
        this.f = imageView;
        frameLayout2.addView(imageView, tre.d(24, 24.0f, 19, 16.0f, 16.0f, 16.0f, 16.0f));
        ImageView imageView2 = new ImageView(activity);
        this.n = imageView2;
        iye.a(imageView2);
        imageView2.setScaleType(ImageView.ScaleType.CENTER);
        imageView2.setImageResource(2131232108);
        hf0 Z2 = aob.Z(0, 0, 6, 6);
        this.h = Z2;
        imageView2.setBackground(Z2);
        frameLayout2.addView(imageView2, tre.d(32, 32.0f, 53, 14.0f, 14.0f, 14.0f, 14.0f));
        LinearLayout linearLayout = new LinearLayout(activity);
        linearLayout.setOrientation(1);
        frameLayout2.addView(linearLayout, tre.d(-1, -2.0f, 16, 54.0f, 9.0f, 54.0f, 9.0f));
        TextView textView = new TextView(activity);
        this.r = textView;
        textView.setTextSize(1, 16.0f);
        textView.setTypeface(hl.o());
        textView.setMaxLines(4);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        linearLayout.addView(textView, tre.t(-1, -2, 55, 0, 0, 0, 2));
        TextView textView2 = new TextView(activity);
        this.s = textView2;
        textView2.setTextSize(1, 14.0f);
        textView2.setMaxLines(3);
        textView2.setEllipsize(TextUtils.TruncateAt.MIDDLE);
        linearLayout.addView(textView2, tre.t(-1, -2, 55, 0, 0, 0, 0));
        this.E = new db(null, i, new c1(this, (byte) 6));
        this.w = new t62(activity, (byte) 1);
        int i3 = aob.Gl;
        c(aob.w0(null, i3, false), hl.B(aob.w0(null, i3, false)) >= 0.721f ? -16777216 : -1);
        setOpenProgress(0.0f);
        setImportantForAccessibility(4);
    }

    public static String a(r47 r47Var) {
        TLRPC.Message message = r47Var.k;
        if (message != null) {
            TLRPC.MessageMedia messageMedia = message.media;
            if (messageMedia instanceof TLRPC.TL_messageMediaWebPage) {
                return messageMedia.webpage.url;
            }
        }
        CharSequence charSequence = r47Var.v;
        if (charSequence != null && charSequence.length() > 0) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(r47Var.v);
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fb.b(android.content.Context, java.lang.String):void");
    }

    public final void c(int i, int i2) {
        float f;
        if (this.F != i) {
            this.F = i;
            invalidate();
        }
        this.I = i2;
        if (hl.B(i) >= 0.721f) {
            f = 0.0f;
        } else {
            f = 1.0f;
        }
        this.H = vm2.f(hl.R1(0.05f, 0.12f, f), i, i2);
        this.G = i;
        this.J = vm2.f(hl.R1(0.12f, 0.22f, f), i, i2);
        int i3 = this.H;
        hf0 hf0Var = this.c;
        aob.F1(hf0Var, i3, false);
        aob.F1(hf0Var, this.J, true);
        this.e.invalidate();
        this.r.setTextColor(i2);
        this.s.setTextColor(aob.p1(0.6f, i2));
        ImageView imageView = this.f;
        if (imageView.getColorFilter() != null) {
            imageView.setColorFilter(new PorterDuffColorFilter(i2, PorterDuff.Mode.SRC_IN));
        }
        this.n.setColorFilter(new PorterDuffColorFilter(i2, PorterDuff.Mode.SRC_IN));
        aob.F1(this.h, aob.p1(1.5f, this.J), true);
        int v = aob.v(i, aob.p1(0.05f, i2));
        int v2 = aob.v(i, aob.p1(0.55f, i2));
        uk5 uk5Var = this.a;
        SparseIntArray sparseIntArray = (SparseIntArray) uk5Var.b;
        ((SparseIntArray) uk5Var.b).put(aob.d6, this.G);
        sparseIntArray.put(aob.G6, i2);
        sparseIntArray.put(aob.e7, v);
        sparseIntArray.put(aob.f7, v2);
        sparseIntArray.put(aob.G8, aob.p1(0.2f, i2));
        sparseIntArray.put(aob.i6, aob.p1(hl.R1(0.05f, 0.12f, f), i2));
        this.x.i1();
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
        db dbVar = this.E;
        if (dbVar != null && this.L) {
            dbVar.a();
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        db dbVar = this.E;
        if (dbVar != null) {
            dbVar.c();
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
            wa waVar = this.x;
            waVar.g3.O(true);
            if (z != (!arrayList.isEmpty())) {
                waVar.f3.g1(0, 0);
                return;
            }
            return;
        }
        oi5 oi5Var = new oi5(new sa((byte) 0, this, z));
        String str3 = bw9.a().c;
        if (str3 != null) {
            str2 = str3 + URLEncoder.encode(str);
        }
        this.P = oi5Var.execute(str2);
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
        db dbVar = this.E;
        if (z && dbVar != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.L = z2;
        if (z2) {
            dbVar.a();
        }
    }
}
