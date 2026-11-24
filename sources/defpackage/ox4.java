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
public final class ox4 extends FrameLayout implements bh6, x74, tjb {
    public static final RectF W = new RectF();
    public nx4 E;
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
    public pb0 V;
    public final TextView a;
    public final ry8 b;
    public be0 c;
    public wjb d;
    public final Paint e;
    public final gn f;
    public final fm0 h;
    public final fm0 n;
    public final fm0 r;
    public int s;
    public int w;
    public int x;
    public boolean y;

    public ox4(Context context) {
        super(context);
        this.e = new Paint(1);
        this.h = new fm0(0, this, tn.a, 320L, false);
        s33 s33Var = s33.h;
        this.n = new fm0(1, this, s33Var, 380L, false);
        this.r = new fm0(2, this, s33Var, 380L, false);
        this.T = 1.0f;
        ?? imageView = new ImageView(context);
        this.b = imageView;
        addView((View) imageView, nme.d(44, 44.0f, 49, 0.0f, -6.0f, 0.0f, 0.0f));
        imageView.setColorFilter(new PorterDuffColorFilter(-16777216, PorterDuff.Mode.SRC_IN));
        TextView textView = new TextView(context);
        this.a = textView;
        textView.setTextSize(1, 12.0f);
        textView.setSingleLine();
        textView.setLines(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setTypeface(gl.o());
        textView.setGravity(17);
        this.G = new TextPaint(textView.getPaint());
        addView(textView, nme.d(-1, -2.0f, 49, 0.0f, 28.33f, 0.0f, 0.0f));
        gn gnVar = new gn(false, false, false);
        this.f = gnVar;
        gnVar.x(gl.o());
        gnVar.setCallback(this);
        gnVar.b = 17;
        gnVar.u(-1);
        gnVar.w(gl.L(10.0f));
    }

    public static ox4 c(Context context, wjb wjbVar, nx4 nx4Var, int i) {
        ox4 ox4Var = new ox4(context);
        ox4Var.d = wjbVar;
        ox4Var.E = nx4Var;
        ox4Var.a.setText(k96.M0(i, null));
        ox4Var.b(false);
        ox4Var.b.setLayoutParams(nme.d(24, 24.0f, 49, 0.0f, 4.0f, 0.0f, 0.0f));
        ox4Var.x = bkb.v0(bkb.Sl, wjbVar);
        ox4Var.s = bkb.v0(bkb.Ql, wjbVar);
        ox4Var.w = bkb.v0(bkb.Rl, wjbVar);
        ox4Var.a();
        return ox4Var;
    }

    public final void a() {
        int i = this.x;
        int i2 = this.s;
        fm0 fm0Var = this.h;
        int f = bm2.f(fm0Var.e, i, i2);
        int f2 = bm2.f(fm0Var.e, this.x, this.w);
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(f, PorterDuff.Mode.SRC_IN);
        be0 be0Var = this.c;
        if (be0Var != null && this.N) {
            be0Var.setColorFilter(porterDuffColorFilter);
            this.c.invalidate();
        }
        this.b.setColorFilter(porterDuffColorFilter);
        this.a.setTextColor(f2);
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(bkb.Sl));
        hashSet.add(Integer.valueOf(bkb.Ql));
        hashSet.add(Integer.valueOf(bkb.Rl));
    }

    public final void b(boolean z) {
        int i;
        boolean z2;
        TLRPC.TL_attachMenuBotIcon tL_attachMenuBotIcon;
        TLRPC.Document document;
        String str;
        boolean z3 = this.h.f;
        TLRPC.TL_attachMenuBot tL_attachMenuBot = this.F;
        kcb kcbVar = null;
        boolean z4 = true;
        if (tL_attachMenuBot != null) {
            Pattern pattern = hq6.U1;
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
                tL_attachMenuBotIcon = hq6.l0(this.F);
                z4 = false;
            }
            if (tL_attachMenuBotIcon != null && (document = tL_attachMenuBotIcon.icon) != null) {
                if (this.Q != document.id) {
                    be0 be0Var = this.c;
                    gl5 b = gl5.b(document);
                    gl5 b2 = gl5.b(document);
                    if (!z4) {
                        kcbVar = uo3.f(document, bkb.Z6, 1.0f, null);
                    }
                    be0Var.j(b, "24_24_lastframe", b2, "24_24_lastframe", kcbVar, this.F);
                    this.Q = document.id;
                }
            } else {
                this.c.b();
            }
            a();
            return;
        }
        nx4 nx4Var = this.E;
        if (nx4Var != null) {
            int i3 = nx4Var.b;
            int i4 = nx4Var.a;
            int i5 = nx4Var.c;
            ry8 ry8Var = this.b;
            if (i5 != -1) {
                ry8Var.setImageResource(i5);
                a();
                return;
            }
            if (z3) {
                i = i4;
            } else {
                i = i3;
            }
            if (nx4Var.d != -1) {
                if (this.O != z3) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (this.P != i) {
                    this.P = i;
                    ry8Var.f(i, 24, 24, null);
                    z2 = true;
                }
                if (z2) {
                    oy8 animatedDrawable = ry8Var.getAnimatedDrawable();
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
                            nx4 nx4Var2 = this.E;
                            if (i8 >= nx4Var2.d - 1) {
                                animatedDrawable.K(nx4Var2.e - 1);
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
                    ry8Var.f(i, 24, 24, null);
                    ry8Var.getAnimatedDrawable().h = false;
                    if (z) {
                        ry8Var.getAnimatedDrawable().H(0);
                        ry8Var.d();
                        return;
                    }
                    ry8Var.getAnimatedDrawable().O(true, 0.99f);
                }
            } else {
                if (ry8Var.getAnimatedDrawable() == null) {
                    ry8Var.f(this.E.a, 24, 24, null);
                }
                oy8 animatedDrawable2 = ry8Var.getAnimatedDrawable();
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
                        ry8Var.d();
                    }
                }
            }
        }
    }

    public final float d() {
        float measureText = this.G.measureText(this.a.getText().toString());
        return Math.min(gl.L(84.0f), (int) ((gl.R1(gl.N(16.0f), gl.L(8.0f), moe.a((measureText - gl.L(40.0f)) / gl.L(16.0f), 0.0f, 1.0f)) * 2.0f) + measureText));
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
            paint.setColor(bkb.p1(tn.a.getInterpolation(f) * 0.09f, this.s));
            rectF.set(0.0f, 0.0f, f2, getHeight());
            float min = Math.min(rectF.width(), rectF.height()) / 2.0f;
            float a = moe.a(this.T, 0.0f, 1.0f) * gl.R1(0.6f, 1.0f, f);
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
            float N = gl.N(1.33f);
            float N2 = gl.N(11.0f) + (f2 / 2.0f);
            float N3 = gl.N(10.0f);
            float N4 = gl.N(16.0f);
            gn gnVar = this.f;
            float max = Math.max(N4, gnVar.c() + gl.L(8.0f));
            float N5 = gl.N(9.333f);
            float N6 = gl.N(8.0f);
            float f5 = max / 2.0f;
            float f6 = N4 / 2.0f;
            rectF.set((N2 - f5) - N, (N3 - f6) - N, f5 + N2 + N, f6 + N3 + N);
            canvas.scale(f4, f4, N2, N3);
            canvas.drawRoundRect(rectF, N5, N5, bkb.Fm);
            rectF.inset(N, N);
            if (this.y) {
                if (this.M == null) {
                    this.M = getContext().getResources().getDrawable(2131232753).mutate();
                }
                nh8.d().f(0.0f, 0.0f, gl.L(96.0f), gl.L(16.0f));
                canvas.drawRoundRect(rectF, N6, N6, nh8.d().e());
                int N7 = (int) (N2 - gl.N(7.0f));
                int N8 = (int) (N3 - gl.N(7.0f));
                this.M.setBounds(N7, N8, gl.L(14.0f) + N7, gl.L(14.0f) + N8);
                this.M.draw(canvas);
            } else {
                paint.setColor(bm2.f(this.r.e, bkb.w0(null, bkb.Xl, false), bkb.w0(null, bkb.q7, false)));
                canvas.drawRoundRect(rectF, N6, N6, paint);
                gnVar.p(rectF);
                gnVar.draw(canvas);
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
            o = gl.n1("fonts/rextrabold.ttf");
        } else {
            o = gl.o();
        }
        this.a.setTypeface(o);
    }

    public final void g() {
        this.x = bkb.v0(bkb.Sl, this.d);
        this.s = bkb.v0(bkb.Ql, this.d);
        this.w = bkb.v0(bkb.Rl, this.d);
        a();
        invalidate();
    }

    public be0 getBackupImageView() {
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

    @Override
    public final void p(int i, float f, float f2, y74 y74Var) {
        if (i == 0) {
            a();
        }
        invalidate();
    }

    public void setAdditionalWidth(int i) {
        this.S = i;
        this.R = true;
    }

    public void setAttachScale(float f) {
        TextView textView = this.a;
        textView.setScaleX(f);
        textView.setScaleY(f);
        ry8 ry8Var = this.b;
        ry8Var.setScaleX(f);
        ry8Var.setScaleY(f);
        be0 be0Var = this.c;
        if (be0Var != null) {
            be0Var.setScaleX(f);
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

    public void setTabAnimation(nx4 nx4Var) {
        this.E = nx4Var;
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
        float L = gl.L(f);
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
        if (this.x == bkb.v0(bkb.Sl, this.d) && this.s == bkb.v0(bkb.Ql, this.d) && this.w == bkb.v0(bkb.Rl, this.d)) {
            return;
        }
        g();
    }

    @Override
    public final void F(float f, int i) {
    }
}
