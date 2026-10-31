package gh;

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
import ea.f;
import fe.e;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.regex.Pattern;
import org.telegram.messenger.c00;
import org.telegram.messenger.cd;
import org.telegram.messenger.i0;
import org.telegram.messenger.ic;
import org.telegram.messenger.ui;
import org.telegram.messenger.v5;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.bi0;
import org.telegram.ui.Components.e6;
import org.telegram.ui.Components.ei0;
import org.telegram.ui.Components.g9;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.r8;
import org.telegram.ui.qf0;
import w7.b6;
import w7.u;
public final class b extends FrameLayout implements qf0, e, k6 {
    public static final RectF V = new RectF();
    public a D;
    public TLRPC.TL_attachMenuBot E;
    public final TextPaint F;
    public boolean G;
    public float H;
    public boolean I;
    public float J;
    public boolean K;
    public Drawable L;
    public boolean M;
    public boolean N;
    public int O;
    public long P;
    public boolean Q;
    public int R;
    public float S;
    public TextPaint T;
    public r8 U;
    public final TextView f7518a;
    public final ei0 f7519b;
    public g9 f7520c;
    public p6 d;
    public final Paint e;
    public final e6 f7521f;
    public final fe.b h;
    public final fe.b f7522n;
    public final fe.b f7523r;
    public int f7524s;
    public int f7525w;
    public int f7526x;
    public boolean f7527y;

    public b(Context context) {
        super(context);
        this.e = new Paint(1);
        this.h = new fe.b(0, this, ee.a.f6489a, 320L, false);
        gr grVar = gr.h;
        this.f7522n = new fe.b(1, this, grVar, 380L, false);
        this.f7523r = new fe.b(2, this, grVar, 380L, false);
        this.S = 1.0f;
        ?? imageView = new ImageView(context);
        this.f7519b = imageView;
        addView((View) imageView, b6.d(44, 44.0f, 49, 0.0f, -6.0f, 0.0f, 0.0f));
        imageView.setColorFilter(new PorterDuffColorFilter(-16777216, PorterDuff.Mode.SRC_IN));
        TextView textView = new TextView(context);
        this.f7518a = textView;
        textView.setTextSize(1, 12.0f);
        textView.setSingleLine();
        textView.setLines(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setTypeface(i0.o());
        textView.setGravity(17);
        this.F = new TextPaint(textView.getPaint());
        addView(textView, b6.d(-1, -2.0f, 49, 0.0f, 28.33f, 0.0f, 0.0f));
        e6 e6Var = new e6(false, false, false);
        this.f7521f = e6Var;
        e6Var.x(i0.o());
        e6Var.setCallback(this);
        e6Var.f25695b = 17;
        e6Var.u(-1);
        e6Var.w(i0.L(10.0f));
    }

    public static b c(Context context, p6 p6Var, a aVar, int i10) {
        b bVar = new b(context);
        bVar.d = p6Var;
        bVar.D = aVar;
        bVar.f7518a.setText(cd.L0(i10, null));
        bVar.b(false);
        bVar.f7519b.setLayoutParams(b6.d(24, 24.0f, 49, 0.0f, 4.0f, 0.0f, 0.0f));
        bVar.f7526x = t6.w0(t6.Ql, p6Var);
        bVar.f7524s = t6.w0(t6.Ol, p6Var);
        bVar.f7525w = t6.w0(t6.Pl, p6Var);
        bVar.a();
        return bVar;
    }

    public final void a() {
        int i10 = this.f7526x;
        int i11 = this.f7524s;
        fe.b bVar = this.h;
        int f7 = i0.b.f(bVar.e, i10, i11);
        int f10 = i0.b.f(bVar.e, this.f7526x, this.f7525w);
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(f7, PorterDuff.Mode.SRC_IN);
        g9 g9Var = this.f7520c;
        if (g9Var != null && this.M) {
            g9Var.setColorFilter(porterDuffColorFilter);
            this.f7520c.invalidate();
        }
        this.f7519b.setColorFilter(porterDuffColorFilter);
        this.f7518a.setTextColor(f10);
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(t6.Ql));
        hashSet.add(Integer.valueOf(t6.Ol));
        hashSet.add(Integer.valueOf(t6.Pl));
    }

    public final void b(boolean z10) {
        int i10;
        boolean z11;
        TLRPC.TL_attachMenuBotIcon tL_attachMenuBotIcon;
        TLRPC.Document document;
        String str;
        boolean z12 = this.h.f7021f;
        TLRPC.TL_attachMenuBot tL_attachMenuBot = this.E;
        c00 c00Var = null;
        boolean z13 = true;
        if (tL_attachMenuBot != null) {
            Pattern pattern = ui.R1;
            ArrayList<TLRPC.TL_attachMenuBotIcon> arrayList = tL_attachMenuBot.icons;
            int size = arrayList.size();
            int i11 = 0;
            while (true) {
                if (i11 < size) {
                    TLRPC.TL_attachMenuBotIcon tL_attachMenuBotIcon2 = arrayList.get(i11);
                    i11++;
                    tL_attachMenuBotIcon = tL_attachMenuBotIcon2;
                    String str2 = tL_attachMenuBotIcon.name;
                    if (z12) {
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
                tL_attachMenuBotIcon = ui.k0(this.E);
                z13 = false;
            }
            if (tL_attachMenuBotIcon != null && (document = tL_attachMenuBotIcon.icon) != null) {
                if (this.P != document.f19799id) {
                    g9 g9Var = this.f7520c;
                    ic b10 = ic.b(document);
                    ic b11 = ic.b(document);
                    if (!z13) {
                        c00Var = v5.f(document, t6.f20872a7, 1.0f, null);
                    }
                    g9Var.m(b10, "24_24_lastframe", b11, "24_24_lastframe", c00Var, this.E);
                    this.P = document.f19799id;
                }
            } else {
                this.f7520c.b();
            }
            a();
            return;
        }
        a aVar = this.D;
        if (aVar != null) {
            int i12 = aVar.f7516b;
            int i13 = aVar.f7515a;
            int i14 = aVar.f7517c;
            ei0 ei0Var = this.f7519b;
            if (i14 != -1) {
                ei0Var.setImageResource(i14);
                a();
                return;
            }
            if (z12) {
                i10 = i13;
            } else {
                i10 = i12;
            }
            if (aVar.d != -1) {
                if (this.N != z12) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (this.O != i10) {
                    this.O = i10;
                    ei0Var.f(i10, 24, 24, null);
                    z11 = true;
                }
                if (z11) {
                    bi0 animatedDrawable = ei0Var.getAnimatedDrawable();
                    if (animatedDrawable != null) {
                        if (z12) {
                            animatedDrawable.P(this.D.d);
                            if (animatedDrawable.f24752a0 >= this.D.e - 2) {
                                animatedDrawable.N(0, false, false);
                            }
                            int i15 = animatedDrawable.f24752a0;
                            int i16 = this.D.d;
                            if (i15 <= i16) {
                                animatedDrawable.start();
                            } else {
                                animatedDrawable.M(i16);
                            }
                        } else {
                            int i17 = animatedDrawable.f24752a0;
                            a aVar2 = this.D;
                            if (i17 >= aVar2.d - 1) {
                                animatedDrawable.P(aVar2.e - 1);
                                animatedDrawable.start();
                            } else {
                                animatedDrawable.P(0);
                                animatedDrawable.M(0);
                            }
                        }
                    } else {
                        return;
                    }
                }
                this.N = z12;
            } else if (i13 != i12) {
                if (this.O != i10) {
                    this.O = i10;
                    ei0Var.f(i10, 24, 24, null);
                    ei0Var.getAnimatedDrawable().h = false;
                    if (z10) {
                        ei0Var.getAnimatedDrawable().M(0);
                        ei0Var.d();
                        return;
                    }
                    ei0Var.getAnimatedDrawable().T(true, 0.99f);
                }
            } else {
                if (ei0Var.getAnimatedDrawable() == null) {
                    ei0Var.f(this.D.f7515a, 24, 24, null);
                }
                bi0 animatedDrawable2 = ei0Var.getAnimatedDrawable();
                if (animatedDrawable2 != null) {
                    int[] iArr = animatedDrawable2.e;
                    if (this.N != z12) {
                        this.N = z12;
                        if (z12) {
                            animatedDrawable2.h = false;
                            animatedDrawable2.M(0);
                            animatedDrawable2.P(iArr[0]);
                        } else {
                            animatedDrawable2.h = true;
                            animatedDrawable2.M(iArr[0]);
                            animatedDrawable2.P(0);
                        }
                        ei0Var.d();
                    }
                }
            }
        }
    }

    public final float d() {
        float measureText = this.F.measureText(this.f7518a.getText().toString());
        return Math.min(i0.L(84.0f), (int) ((i0.T1(i0.N(16.0f), i0.L(8.0f), u.a((measureText - i0.L(40.0f)) / i0.L(16.0f), 0.0f, 1.0f)) * 2.0f) + measureText));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float width;
        float f7;
        boolean z10;
        if (this.G) {
            width = this.H;
        } else {
            width = getWidth();
        }
        float f10 = width;
        if (this.I) {
            f7 = this.J;
        } else {
            f7 = this.h.e;
        }
        int i10 = (f7 > 0.0f ? 1 : (f7 == 0.0f ? 0 : -1));
        RectF rectF = V;
        float f11 = 1.0f;
        Paint paint = this.e;
        if (i10 > 0 && !this.K) {
            paint.setColor(t6.r1(ee.a.f6489a.getInterpolation(f7) * 0.09f, this.f7524s));
            rectF.set(0.0f, 0.0f, f10, getHeight());
            float min = Math.min(rectF.width(), rectF.height()) / 2.0f;
            float a2 = u.a(this.S, 0.0f, 1.0f) * i0.T1(0.6f, 1.0f, f7);
            canvas.save();
            canvas.scale(a2, a2, rectF.centerX(), rectF.centerY());
            canvas.drawRoundRect(rectF, min, min, paint);
            canvas.restore();
        }
        if (!this.f7527y) {
            f11 = this.f7522n.e;
        }
        float f12 = f11 * this.S;
        int i11 = (f12 > 0.0f ? 1 : (f12 == 0.0f ? 0 : -1));
        if (i11 > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            canvas.saveLayer(0.0f, 0.0f, f10, getHeight(), null);
        }
        super.dispatchDraw(canvas);
        if (i11 > 0) {
            canvas.save();
            float N = i0.N(1.33f);
            float N2 = i0.N(11.0f) + (f10 / 2.0f);
            float N3 = i0.N(10.0f);
            float N4 = i0.N(16.0f);
            e6 e6Var = this.f7521f;
            float max = Math.max(N4, e6Var.c() + i0.L(8.0f));
            float N5 = i0.N(9.333f);
            float N6 = i0.N(8.0f);
            float f13 = max / 2.0f;
            float f14 = N4 / 2.0f;
            rectF.set((N2 - f13) - N, (N3 - f14) - N, f13 + N2 + N, f14 + N3 + N);
            canvas.scale(f12, f12, N2, N3);
            canvas.drawRoundRect(rectF, N5, N5, t6.Cm);
            rectF.inset(N, N);
            if (this.f7527y) {
                if (this.L == null) {
                    this.L = getContext().getResources().getDrawable(2131232745).mutate();
                }
                f.d().f(0.0f, 0.0f, i0.L(96.0f), i0.L(16.0f));
                canvas.drawRoundRect(rectF, N6, N6, f.d().e());
                int N7 = (int) (N2 - i0.N(7.0f));
                int N8 = (int) (N3 - i0.N(7.0f));
                this.L.setBounds(N7, N8, i0.L(14.0f) + N7, i0.L(14.0f) + N8);
                this.L.draw(canvas);
            } else {
                paint.setColor(i0.b.f(this.f7523r.e, t6.x0(null, t6.Vl, false), t6.x0(null, t6.f21187r7, false)));
                canvas.drawRoundRect(rectF, N6, N6, paint);
                e6Var.p(rectF);
                e6Var.draw(canvas);
            }
            canvas.restore();
        }
        if (z10) {
            canvas.restore();
        }
    }

    public final void e(String str, boolean z10, boolean z11) {
        this.f7521f.t(str, z11, true);
        this.f7522n.a(!TextUtils.isEmpty(str), z11);
        this.f7523r.a(z10, z11);
    }

    public final void f(boolean z10, boolean z11) {
        Typeface o10;
        this.h.a(z10, z11);
        b(z11);
        if (z10) {
            o10 = i0.o1("fonts/rextrabold.ttf");
        } else {
            o10 = i0.o();
        }
        this.f7518a.setTypeface(o10);
    }

    public final void g() {
        this.f7526x = t6.w0(t6.Ql, this.d);
        this.f7524s = t6.w0(t6.Ol, this.d);
        this.f7525w = t6.w0(t6.Pl, this.d);
        a();
        invalidate();
    }

    public g9 getBackupImageView() {
        return this.f7520c;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        if (this.Q) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(((int) d()) + this.R, 1073741824), i11);
        } else {
            super.onMeasure(i10, i11);
        }
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        if (this.G) {
            float measuredWidth = (this.H - getMeasuredWidth()) / 2.0f;
            this.f7519b.setTranslationX(measuredWidth);
            this.f7518a.setTranslationX(measuredWidth);
        }
    }

    public void setAdditionalWidth(int i10) {
        this.R = i10;
        this.Q = true;
    }

    public void setAttachScale(float f7) {
        TextView textView = this.f7518a;
        textView.setScaleX(f7);
        textView.setScaleY(f7);
        ei0 ei0Var = this.f7519b;
        ei0Var.setScaleX(f7);
        ei0Var.setScaleY(f7);
        g9 g9Var = this.f7520c;
        if (g9Var != null) {
            g9Var.setScaleX(f7);
            this.f7520c.setScaleY(f7);
        }
        this.S = f7;
        invalidate();
    }

    public void setPremiumBadge(boolean z10) {
        this.f7527y = z10;
    }

    public void setSkipDrawSelector(boolean z10) {
        if (this.K != z10) {
            this.K = z10;
            invalidate();
        }
    }

    public void setTabAnimation(a aVar) {
        this.D = aVar;
        this.E = null;
        this.O = 0;
        this.P = 0L;
        this.f7519b.a();
        b(false);
    }

    public void setText(CharSequence charSequence) {
        this.f7518a.setText(charSequence);
    }

    public void setTextSizeDp(float f7) {
        float L = i0.L(f7);
        TextView textView = this.f7518a;
        if (textView.getTextSize() != L) {
            textView.setTextSize(1, f7);
            this.F.setTextSize(L);
        }
    }

    public void setVisualWidth(float f7) {
        this.G = true;
        if (this.H != f7) {
            this.H = f7;
            float measuredWidth = (f7 - getMeasuredWidth()) / 2.0f;
            this.f7519b.setTranslationX(measuredWidth);
            this.f7518a.setTranslationX(measuredWidth);
            invalidate();
        }
    }

    @Override
    public final void updateColors() {
        if (this.f7526x == t6.w0(t6.Ql, this.d) && this.f7524s == t6.w0(t6.Ol, this.d) && this.f7525w == t6.w0(t6.Pl, this.d)) {
            return;
        }
        g();
    }

    @Override
    public final void v(int i10, float f7, float f10, fe.f fVar) {
        if (i10 == 0) {
            a();
        }
        invalidate();
    }

    @Override
    public final void E(float f7, int i10) {
    }
}
