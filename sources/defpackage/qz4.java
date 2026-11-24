package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.regex.Pattern;
import org.telegram.tgnet.TLRPC;
public final class qz4 extends FrameLayout implements dj6, g94, vlb {
    public static final RectF W = new RectF();
    public pz4 E;
    public TLRPC.TL_attachMenuBot F;
    public final TextPaint G;
    public boolean H;
    public float I;
    public boolean J;
    public float K;
    public boolean L;
    public Drawable M;
    public boolean N;
    public boolean O;
    public int P;
    public long Q;
    public boolean R;
    public int S;
    public float T;
    public TextPaint U;
    public pc0 V;
    public final TextView a;
    public final s09 b;
    public bf0 c;
    public ylb d;
    public final Paint e;
    public final ho f;
    public final fn0 h;
    public final fn0 n;
    public final fn0 r;
    public int s;
    public int w;
    public int x;
    public boolean y;

    public qz4(Context context) {
        super(context);
        this.e = new Paint(1);
        this.h = new fn0(0, this, uo.a, 320L, false);
        d53 d53Var = d53.h;
        this.n = new fn0(1, this, d53Var, 380L, false);
        this.r = new fn0(2, this, d53Var, 380L, false);
        this.T = 1.0f;
        ?? imageView = new ImageView(context);
        this.b = imageView;
        addView((View) imageView, qoe.d(44, 44.0f, 49, 0.0f, -6.0f, 0.0f, 0.0f));
        imageView.setColorFilter(new PorterDuffColorFilter(-16777216, PorterDuff.Mode.SRC_IN));
        TextView textView = new TextView(context);
        this.a = textView;
        textView.setTextSize(1, 12.0f);
        textView.setSingleLine();
        textView.setLines(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setTypeface(gm.o());
        textView.setGravity(17);
        this.G = new TextPaint(textView.getPaint());
        addView(textView, qoe.d(-1, -2.0f, 49, 0.0f, 28.33f, 0.0f, 0.0f));
        ho hoVar = new ho(false, false, false);
        this.f = hoVar;
        hoVar.x(gm.o());
        hoVar.setCallback(this);
        hoVar.b = 17;
        hoVar.u(-1);
        hoVar.w(gm.L(10.0f));
    }

    public static qz4 c(Context context, ylb ylbVar, pz4 pz4Var, int i) {
        qz4 qz4Var = new qz4(context);
        qz4Var.d = ylbVar;
        qz4Var.E = pz4Var;
        qz4Var.a.setText(jb6.M0(i, null));
        qz4Var.b(false);
        qz4Var.b.setLayoutParams(qoe.d(24, 24.0f, 49, 0.0f, 4.0f, 0.0f, 0.0f));
        qz4Var.x = cmb.v0(cmb.Sl, ylbVar);
        qz4Var.s = cmb.v0(cmb.Ql, ylbVar);
        qz4Var.w = cmb.v0(cmb.Rl, ylbVar);
        qz4Var.a();
        return qz4Var;
    }

    @Override
    public final void D(int i, float f, float f2, h94 h94Var) {
        if (i == 0) {
            a();
        }
        invalidate();
    }

    public final void a() {
        int i = this.x;
        int i2 = this.s;
        fn0 fn0Var = this.h;
        int f = on2.f(fn0Var.e, i, i2);
        int f2 = on2.f(fn0Var.e, this.x, this.w);
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(f, PorterDuff.Mode.SRC_IN);
        bf0 bf0Var = this.c;
        if (bf0Var != null && this.N) {
            bf0Var.setColorFilter(porterDuffColorFilter);
            this.c.invalidate();
        }
        this.b.setColorFilter(porterDuffColorFilter);
        this.a.setTextColor(f2);
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(cmb.Sl));
        hashSet.add(Integer.valueOf(cmb.Ql));
        hashSet.add(Integer.valueOf(cmb.Rl));
    }

    public final void b(boolean z) {
        int i;
        boolean z2;
        TLRPC.TL_attachMenuBotIcon tL_attachMenuBotIcon;
        TLRPC.Document document;
        String str;
        boolean z3 = this.h.f;
        TLRPC.TL_attachMenuBot tL_attachMenuBot = this.F;
        meb mebVar = null;
        boolean z4 = true;
        if (tL_attachMenuBot != null) {
            Pattern pattern = hs6.U1;
            ArrayList<TLRPC.TL_attachMenuBotIcon> arrayList = tL_attachMenuBot.icons;
            int size = arrayList.size();
            int i2 = 0;
            while (true) {
                if (i2 < size) {
                    TLRPC.TL_attachMenuBotIcon tL_attachMenuBotIcon2 = arrayList.get(i2);
                    i2++;
                    tL_attachMenuBotIcon = tL_attachMenuBotIcon2;
                    String str2 = tL_attachMenuBotIcon.name;
                    if (z3) {
                        str = "android_active_animated";
                    } else {
                        str = "android_animated";
                    }
                    if (str2.equals(str)) {
                        break;
                    }
                } else {
                    tL_attachMenuBotIcon = null;
                    break;
                }
            }
            if (tL_attachMenuBotIcon == null) {
                tL_attachMenuBotIcon = hs6.l0(this.F);
                z4 = false;
            }
            if (tL_attachMenuBotIcon != null && (document = tL_attachMenuBotIcon.icon) != null) {
                if (this.Q != document.id) {
                    bf0 bf0Var = this.c;
                    gn5 b = gn5.b(document);
                    gn5 b2 = gn5.b(document);
                    if (!z4) {
                        mebVar = eq3.f(document, cmb.Z6, 1.0f, null);
                    }
                    bf0Var.j(b, "24_24_lastframe", b2, "24_24_lastframe", mebVar, this.F);
                    this.Q = document.id;
                }
            } else {
                this.c.b();
            }
            a();
            return;
        }
        pz4 pz4Var = this.E;
        if (pz4Var != null) {
            int i3 = pz4Var.b;
            int i4 = pz4Var.a;
            int i5 = pz4Var.c;
            s09 s09Var = this.b;
            if (i5 != -1) {
                s09Var.setImageResource(i5);
                a();
                return;
            }
            if (z3) {
                i = i4;
            } else {
                i = i3;
            }
            if (pz4Var.d != -1) {
                if (this.O != z3) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (this.P != i) {
                    this.P = i;
                    s09Var.f(i, 24, 24, null);
                    z2 = true;
                }
                if (z2) {
                    p09 animatedDrawable = s09Var.getAnimatedDrawable();
                    if (animatedDrawable != null) {
                        if (z3) {
                            animatedDrawable.K(this.E.d);
                            if (animatedDrawable.b0 >= this.E.e - 2) {
                                animatedDrawable.I(0, false, false);
                            }
                            int i6 = animatedDrawable.b0;
                            int i7 = this.E.d;
                            if (i6 <= i7) {
                                animatedDrawable.start();
                            } else {
                                animatedDrawable.H(i7);
                            }
                        } else {
                            int i8 = animatedDrawable.b0;
                            pz4 pz4Var2 = this.E;
                            if (i8 >= pz4Var2.d - 1) {
                                animatedDrawable.K(pz4Var2.e - 1);
                                animatedDrawable.start();
                            } else {
                                animatedDrawable.K(0);
                                animatedDrawable.H(0);
                            }
                        }
                    } else {
                        return;
                    }
                }
                this.O = z3;
            } else if (i4 != i3) {
                if (this.P != i) {
                    this.P = i;
                    s09Var.f(i, 24, 24, null);
                    s09Var.getAnimatedDrawable().h = false;
                    if (z) {
                        s09Var.getAnimatedDrawable().H(0);
                        s09Var.d();
                        return;
                    }
                    s09Var.getAnimatedDrawable().O(true, 0.99f);
                }
            } else {
                if (s09Var.getAnimatedDrawable() == null) {
                    s09Var.f(this.E.a, 24, 24, null);
                }
                p09 animatedDrawable2 = s09Var.getAnimatedDrawable();
                if (animatedDrawable2 != null) {
                    int[] iArr = animatedDrawable2.e;
                    if (this.O != z3) {
                        this.O = z3;
                        if (z3) {
                            animatedDrawable2.h = false;
                            animatedDrawable2.H(0);
                            animatedDrawable2.K(iArr[0]);
                        } else {
                            animatedDrawable2.h = true;
                            animatedDrawable2.H(iArr[0]);
                            animatedDrawable2.K(0);
                        }
                        s09Var.d();
                    }
                }
            }
        }
    }

    public final float d() {
        float measureText = this.G.measureText(this.a.getText().toString());
        return Math.min(gm.L(84.0f), (int) ((gm.R1(gm.N(16.0f), gm.L(8.0f), pqe.a((measureText - gm.L(40.0f)) / gm.L(16.0f), 0.0f, 1.0f)) * 2.0f) + measureText));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float width;
        float f;
        boolean z;
        if (this.H) {
            width = this.I;
        } else {
            width = getWidth();
        }
        float f2 = width;
        if (this.J) {
            f = this.K;
        } else {
            f = this.h.e;
        }
        int i = (f > 0.0f ? 1 : (f == 0.0f ? 0 : -1));
        RectF rectF = W;
        float f3 = 1.0f;
        Paint paint = this.e;
        if (i > 0 && !this.L) {
            paint.setColor(cmb.p1(uo.a.getInterpolation(f) * 0.09f, this.s));
            rectF.set(0.0f, 0.0f, f2, getHeight());
            float min = Math.min(rectF.width(), rectF.height()) / 2.0f;
            float a = pqe.a(this.T, 0.0f, 1.0f) * gm.R1(0.6f, 1.0f, f);
            canvas.save();
            canvas.scale(a, a, rectF.centerX(), rectF.centerY());
            canvas.drawRoundRect(rectF, min, min, paint);
            canvas.restore();
        }
        if (!this.y) {
            f3 = this.n.e;
        }
        float f4 = f3 * this.T;
        int i2 = (f4 > 0.0f ? 1 : (f4 == 0.0f ? 0 : -1));
        if (i2 > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            canvas.saveLayer(0.0f, 0.0f, f2, getHeight(), null);
        }
        super.dispatchDraw(canvas);
        if (i2 > 0) {
            canvas.save();
            float N = gm.N(1.33f);
            float N2 = gm.N(11.0f) + (f2 / 2.0f);
            float N3 = gm.N(10.0f);
            float N4 = gm.N(16.0f);
            ho hoVar = this.f;
            float max = Math.max(N4, hoVar.c() + gm.L(8.0f));
            float N5 = gm.N(9.333f);
            float N6 = gm.N(8.0f);
            float f5 = max / 2.0f;
            float f6 = N4 / 2.0f;
            rectF.set((N2 - f5) - N, (N3 - f6) - N, f5 + N2 + N, f6 + N3 + N);
            canvas.scale(f4, f4, N2, N3);
            canvas.drawRoundRect(rectF, N5, N5, cmb.Fm);
            rectF.inset(N, N);
            if (this.y) {
                if (this.M == null) {
                    this.M = getContext().getResources().getDrawable(2131232765).mutate();
                }
                oj8.d().f(0.0f, 0.0f, gm.L(96.0f), gm.L(16.0f));
                canvas.drawRoundRect(rectF, N6, N6, oj8.d().e());
                int N7 = (int) (N2 - gm.N(7.0f));
                int N8 = (int) (N3 - gm.N(7.0f));
                this.M.setBounds(N7, N8, gm.L(14.0f) + N7, gm.L(14.0f) + N8);
                this.M.draw(canvas);
            } else {
                paint.setColor(on2.f(this.r.e, cmb.w0(null, cmb.Xl, false), cmb.w0(null, cmb.q7, false)));
                canvas.drawRoundRect(rectF, N6, N6, paint);
                hoVar.p(rectF);
                hoVar.draw(canvas);
            }
            canvas.restore();
        }
        if (z) {
            canvas.restore();
        }
    }

    public final void e(String str, boolean z, boolean z2) {
        this.f.t(str, z2, true);
        this.n.a(!TextUtils.isEmpty(str), z2);
        this.r.a(z, z2);
    }

    public final void f(boolean z, boolean z2) {
        Typeface o;
        this.h.a(z, z2);
        b(z2);
        if (z) {
            o = gm.n1("fonts/rextrabold.ttf");
        } else {
            o = gm.o();
        }
        this.a.setTypeface(o);
    }

    public final void g() {
        this.x = cmb.v0(cmb.Sl, this.d);
        this.s = cmb.v0(cmb.Ql, this.d);
        this.w = cmb.v0(cmb.Rl, this.d);
        a();
        invalidate();
    }

    public bf0 getBackupImageView() {
        return this.c;
    }

    @Override
    public final void onMeasure(int i, int i2) {
        if (this.R) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(((int) d()) + this.S, 1073741824), i2);
        } else {
            super.onMeasure(i, i2);
        }
    }

    @Override
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (this.H) {
            float measuredWidth = (this.I - getMeasuredWidth()) / 2.0f;
            this.b.setTranslationX(measuredWidth);
            this.a.setTranslationX(measuredWidth);
        }
    }

    public void setAdditionalWidth(int i) {
        this.S = i;
        this.R = true;
    }

    public void setAttachScale(float f) {
        TextView textView = this.a;
        textView.setScaleX(f);
        textView.setScaleY(f);
        s09 s09Var = this.b;
        s09Var.setScaleX(f);
        s09Var.setScaleY(f);
        bf0 bf0Var = this.c;
        if (bf0Var != null) {
            bf0Var.setScaleX(f);
            this.c.setScaleY(f);
        }
        this.T = f;
        invalidate();
    }

    public void setPremiumBadge(boolean z) {
        this.y = z;
    }

    public void setSkipDrawSelector(boolean z) {
        if (this.L != z) {
            this.L = z;
            invalidate();
        }
    }

    public void setTabAnimation(pz4 pz4Var) {
        this.E = pz4Var;
        this.F = null;
        this.P = 0;
        this.Q = 0L;
        this.b.a();
        b(false);
    }

    public void setText(CharSequence charSequence) {
        this.a.setText(charSequence);
    }

    public void setTextSizeDp(float f) {
        float L = gm.L(f);
        TextView textView = this.a;
        if (textView.getTextSize() != L) {
            textView.setTextSize(1, f);
            this.G.setTextSize(L);
        }
    }

    public void setVisualWidth(float f) {
        this.H = true;
        if (this.I != f) {
            this.I = f;
            float measuredWidth = (f - getMeasuredWidth()) / 2.0f;
            this.b.setTranslationX(measuredWidth);
            this.a.setTranslationX(measuredWidth);
            invalidate();
        }
    }

    @Override
    public final void updateColors() {
        if (this.x == cmb.v0(cmb.Sl, this.d) && this.s == cmb.v0(cmb.Ql, this.d) && this.w == cmb.v0(cmb.Rl, this.d)) {
            return;
        }
        g();
    }

    @Override
    public final void V(float f, int i) {
    }
}
