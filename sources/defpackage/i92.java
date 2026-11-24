package defpackage;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.HashSet;
import java.util.Locale;
import org.telegram.tgnet.TLRPC;
public abstract class i92 extends LinearLayout implements tjb {
    public static final int M = 0;
    public boolean E;
    public boolean F;
    public AnimatorSet G;
    public boolean H;
    public boolean I;
    public float J;
    public int K;
    public boolean L;
    public TLRPC.Document a;
    public final TextView b;
    public final TextView c;
    public h92 d;
    public final int e;
    public final FrameLayout f;
    public be0 h;
    public be0 n;
    public final wjb r;
    public boolean s;
    public ry8 w;
    public TextView x;
    public t8 y;

    public i92(Context context, int i, TLRPC.Document document, wjb wjbVar) {
        super(context);
        setOrientation(1);
        this.e = i;
        this.r = wjbVar;
        setPadding(0, gl.L(8.0f), 0, 0);
        TextView textView = new TextView(context);
        this.b = textView;
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(gl.o());
        textView.setTextAlignment(4);
        textView.setGravity(17);
        TextView textView2 = new TextView(context);
        this.c = textView2;
        textView2.setTextAlignment(4);
        textView2.setGravity(17);
        textView2.setTextSize(1, 14.0f);
        textView2.setGravity(1);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f = frameLayout;
        be0 be0Var = new be0(context);
        this.h = be0Var;
        be0Var.getImageReceiver().S0 = true;
        frameLayout.addView(this.h, nme.c(112.0f, 112));
        ote.a(this.h);
        be0 be0Var2 = new be0(context);
        this.n = be0Var2;
        be0Var2.getImageReceiver().S0 = true;
        frameLayout.addView(this.n, nme.c(112.0f, 112));
        this.n.setVisibility(8);
        this.n.setAlpha(0.0f);
        ote.a(this.n);
        e();
        updateColors();
        String M0 = k96.M0(2131748001, null);
        String M02 = k96.M0(2131747999, null);
        textView.setText(M0);
        textView2.setText(M02);
        textView2.setMaxWidth(je5.a(textView2.getText(), textView2.getPaint()));
        this.h.setContentDescription(textView2.getText());
        this.a = document;
        if (document == null) {
            hq6 d0 = hq6.d0(i);
            TLRPC.Document document2 = d0.z0;
            d0.o1();
            this.a = document2;
        }
    }

    public static String a(TLRPC.Document document) {
        float min;
        float f;
        int i;
        if (gl.O1()) {
            min = gl.P0();
            f = 0.4f;
        } else {
            Point point = gl.q;
            min = Math.min(point.x, point.y);
            f = 0.5f;
        }
        float f2 = min * f;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i3 < document.attributes.size()) {
                TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i3);
                if (documentAttribute instanceof TLRPC.TL_documentAttributeImageSize) {
                    i2 = documentAttribute.w;
                    i = documentAttribute.h;
                    break;
                }
                i3++;
            } else {
                i = 0;
                break;
            }
        }
        if (k27.K2(document, true) && i2 == 0 && i == 0) {
            i2 = 512;
            i = 512;
        }
        if (i2 == 0) {
            i = (int) f2;
            i2 = gl.L(100.0f) + i;
        }
        int i4 = (int) ((f2 / i2) * i);
        int i5 = (int) f2;
        float f3 = i4;
        if (f3 > f2) {
            i5 = (int) ((f2 / f3) * i5);
            i4 = i5;
        }
        float f4 = i5;
        float f5 = gl.p;
        Locale locale = Locale.US;
        return tb4.m((int) (f4 / f5), (int) (i4 / f5), "_");
    }

    public final void b(boolean z, boolean z2, SpannableStringBuilder spannableStringBuilder, String str, View.OnClickListener onClickListener) {
        if (this.E == z) {
            return;
        }
        this.E = z;
        this.F = z2;
        if (z) {
            if (this.w == null) {
                ?? imageView = new ImageView(getContext());
                this.w = imageView;
                imageView.setScaleType(ImageView.ScaleType.CENTER);
                this.w.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
                this.w.setBackground(bkb.K(gl.L(78.0f), 469762048));
                ry8 ry8Var = this.w;
                if (z2) {
                    ry8Var.setImageResource(2131231099);
                } else {
                    ry8Var.f(2131624078, 80, 80, null);
                    this.w.setOnClickListener(new x91(this, (byte) 11));
                }
            }
            this.w.d();
            if (this.x == null) {
                TextView textView = new TextView(getContext());
                this.x = textView;
                textView.setTextAlignment(4);
                this.x.setGravity(17);
                this.x.setTextSize(1, 13.0f);
            }
            this.x.setText(spannableStringBuilder);
            TextView textView2 = this.x;
            textView2.setMaxWidth(je5.a(textView2.getText(), this.x.getPaint()));
            TextView textView3 = this.x;
            int i = bkb.Yc;
            wjb wjbVar = this.r;
            zkb.X(textView3, i, wjbVar);
            this.x.setLineSpacing(gl.L(2.0f), 1.0f);
            if (this.y == null) {
                t8 t8Var = new t8(getContext(), (byte) 4);
                this.y = t8Var;
                t8Var.setTextAlignment(4);
                this.y.setGravity(17);
                this.y.setTypeface(gl.o());
                this.y.setTextSize(1, 14.0f);
                this.y.setPadding(gl.L(13.0f), gl.L(5.0f), gl.L(13.0f), gl.L(8.0f));
                t8 t8Var2 = this.y;
                int L = gl.L(15.0f);
                t8Var2.setBackground(bkb.i0(L, L, L, L, 503316480, 855638016, 855638016));
                ote.a(this.y);
            }
            this.y.setText(str);
            zkb.X(this.y, i, wjbVar);
            this.y.setOnClickListener(onClickListener);
        }
        e();
    }

    public final void c(CharSequence charSequence, CharSequence charSequence2) {
        String trim;
        String trim2;
        int i;
        this.I = true;
        if (charSequence == null) {
            trim = null;
        } else {
            trim = charSequence.toString().trim();
        }
        if (TextUtils.isEmpty(trim)) {
            charSequence = k96.M0(2131748001, null);
        }
        this.b.setText(charSequence);
        if (charSequence2 == null) {
            trim2 = null;
        } else {
            trim2 = charSequence2.toString().trim();
        }
        if (TextUtils.isEmpty(trim2)) {
            charSequence2 = k96.M0(2131747999, null);
        }
        TextView textView = this.c;
        textView.setText(charSequence2);
        if (textView.getText().length() > 60) {
            i = Math.min((int) (gl.q.x * 0.5f), je5.a(textView.getText(), textView.getPaint()));
        } else {
            i = (int) (gl.q.x * 0.5f);
        }
        textView.setMaxWidth(i);
    }

    public final void d() {
        AnimatorSet animatorSet = this.G;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.n.setVisibility(0);
        this.h.setVisibility(0);
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.G = animatorSet2;
        animatorSet2.setDuration(420L);
        this.G.setInterpolator(s33.h);
        this.G.addListener(new y7(this));
        AnimatorSet animatorSet3 = this.G;
        Property property = View.ALPHA;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.n, property, 0.0f, 1.0f);
        Property property2 = View.SCALE_X;
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.n, property2, 0.7f, 1.0f);
        Property property3 = View.SCALE_Y;
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.n, property3, 0.7f, 1.0f);
        be0 be0Var = this.n;
        float[] fArr = {-gl.L(24.0f), 0.0f};
        Property property4 = View.TRANSLATION_Y;
        animatorSet3.playTogether(ofFloat, ofFloat2, ofFloat3, ObjectAnimator.ofFloat(be0Var, property4, fArr), ObjectAnimator.ofFloat(this.h, property, 1.0f, 0.0f), ObjectAnimator.ofFloat(this.h, property2, 1.0f, 0.7f), ObjectAnimator.ofFloat(this.h, property3, 1.0f, 0.7f), ObjectAnimator.ofFloat(this.h, property4, 0.0f, gl.L(24.0f)));
        this.G.start();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        if (!this.L) {
            wjb wjbVar = this.r;
            if (wjbVar != null) {
                wjbVar.b(0.0f, this.J + gl.L(4.0f), getMeasuredWidth(), this.K);
            } else {
                bkb.q(0.0f, this.J + gl.L(4.0f), getMeasuredWidth(), this.K);
            }
            canvas2 = canvas;
            canvas2.drawRoundRect(0.0f, 0.0f, getWidth(), getHeight(), gl.L(16.0f), gl.L(16.0f), bkb.U0("paintChatActionBackground", wjbVar));
        } else {
            canvas2 = canvas;
        }
        if (!this.s) {
            this.s = true;
            setSticker(this.a);
        }
        super.dispatchDraw(canvas2);
    }

    public final void e() {
        int i;
        removeAllViews();
        if (this.E) {
            addView(this.w, nme.t(78, 78, 49, 20, 9, 20, 9));
            boolean F3 = na7.q1(this.e).F3();
            TextView textView = this.x;
            if (F3) {
                i = 13;
            } else {
                i = 9;
            }
            addView(textView, nme.t(-2, -2, 49, 20, 0, 20, i));
            if (!F3) {
                t8 t8Var = this.y;
                if ((t8Var != null && !TextUtils.isEmpty(t8Var.getText())) || !this.F) {
                    addView(this.y, nme.t(-2, 30, 49, 20, 2, 20, 13));
                    return;
                }
                return;
            }
            return;
        }
        addView(this.b, nme.t(-2, -2, 1, 20, 6, 20, 6));
        addView(this.c, nme.t(-2, -2, 1, 20, 6, 20, 6));
        addView(this.f, nme.t(112, 112, 1, 16, 10, 16, 16));
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.a == null) {
            hq6 d0 = hq6.d0(this.e);
            TLRPC.Document document = d0.z0;
            d0.o1();
            this.a = document;
            if (this.s) {
                setSticker(document);
            }
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override
    public void onMeasure(int i, int i2) {
        this.H = true;
        boolean z = this.I;
        TextView textView = this.c;
        if (!z) {
            textView.setVisibility(0);
        }
        this.h.setVisibility(0);
        super.onMeasure(i, i2);
        if (getMeasuredHeight() > View.MeasureSpec.getSize(i2) && !this.I) {
            textView.setVisibility(8);
            this.h.setVisibility(8);
        } else {
            if (!this.I) {
                textView.setVisibility(0);
            }
            this.h.setVisibility(0);
        }
        this.H = false;
        super.onMeasure(i, i2);
    }

    @Override
    public final void requestLayout() {
        if (this.H) {
            return;
        }
        super.requestLayout();
    }

    @Override
    public void setBackground(Drawable drawable) {
        super.setBackground(drawable);
        this.L = true;
    }

    public void setListener(h92 h92Var) {
        this.d = h92Var;
    }

    public void setSticker(TLRPC.Document document) {
        TLRPC.Document document2;
        if (document == null) {
            return;
        }
        this.s = true;
        this.n.b();
        kcb f = uo3.f(document, bkb.bd, 1.0f, null);
        if (f != null) {
            this.h.p(gl5.b(document), a(document), f, document);
            document2 = document;
        } else {
            document2 = document;
            this.h.h(gl5.b(document), a(document), gl5.c(ba4.w(document.thumbs, 90, false, null, false), document), null, 0, document2);
        }
        this.h.setOnClickListener(new kb1(this, document2, (byte) 15));
    }

    @Override
    public final void updateColors() {
        wjb wjbVar = this.r;
        TextView textView = this.b;
        if (textView != null) {
            textView.setTextColor(bkb.v0(bkb.Yc, wjbVar));
        }
        TextView textView2 = this.c;
        if (textView2 != null) {
            textView2.setTextColor(bkb.v0(bkb.Yc, wjbVar));
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }

    public void setSticker(String str) {
        if (str == null) {
            return;
        }
        this.s = true;
        this.n.b();
        this.h.h(gl5.g(str), "256_256", null, null, 0, null);
    }
}
