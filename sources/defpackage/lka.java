package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;
import java.util.Stack;
public class lka extends View implements Drawable.Callback {
    public final Stack A0;
    public final Path B0;
    public boolean C0;
    public boolean D0;
    public e0b E;
    public View.OnClickListener E0;
    public String F;
    public boolean F0;
    public int G;
    public float G0;
    public float H;
    public float H0;
    public float I;
    public cn I0;
    public int J;
    public int J0;
    public int K;
    public PorterDuffColorFilter K0;
    public int L;
    public boolean L0;
    public boolean M;
    public Layout.Alignment M0;
    public float N;
    public boolean O;
    public Drawable P;
    public boolean Q;
    public boolean R;
    public float S;
    public long T;
    public int U;
    public Paint V;
    public Paint W;
    public float a;
    public Paint a0;
    public float b;
    public int b0;
    public StaticLayout c;
    public int c0;
    public StaticLayout d;
    public int d0;
    public StaticLayout e;
    public int e0;
    public StaticLayout f;
    public int f0;
    public int g0;
    public final TextPaint h;
    public int h0;
    public int i0;
    public int j0;
    public boolean k0;
    public boolean l0;
    public boolean m0;
    public int n;
    public boolean n0;
    public boolean o0;
    public boolean p0;
    public Boolean q0;
    public int r;
    public int r0;
    public CharSequence s;
    public int s0;
    public int t0;
    public int u0;
    public int v0;
    public Drawable w;
    public float w0;
    public Drawable x;
    public int x0;
    public Drawable y;
    public int y0;
    public final ArrayList z0;

    public lka(Context context) {
        super(context);
        this.n = 51;
        this.r = 1;
        this.I = 1.0f;
        this.J = gm.L(4.0f);
        this.r0 = 16;
        this.y0 = 3;
        this.z0 = new ArrayList();
        this.A0 = new Stack();
        this.B0 = new Path();
        this.J0 = 0;
        this.M0 = Layout.Alignment.ALIGN_NORMAL;
        this.h = new TextPaint(1);
        setImportantForAccessibility(1);
    }

    private Layout.Alignment getAlignment() {
        return this.M0;
    }

    public final void D(int i, float f, float f2, h94 h94Var) {
        invalidate();
    }

    public final void a(int i) {
        int i2;
        int i3;
        Drawable drawable;
        Drawable drawable2;
        StaticLayout staticLayout = this.c;
        if (staticLayout == null) {
            return;
        }
        if (staticLayout.getLineCount() > 0) {
            this.f0 = (int) Math.max(Math.ceil(this.c.getLineWidth(0)), Math.ceil(this.c.getLineRight(0) - this.c.getLineLeft(0)));
            StaticLayout staticLayout2 = this.e;
            boolean z = true;
            if (staticLayout2 != null) {
                this.h0 = staticLayout2.getLineBottom(staticLayout2.getLineCount() - 1);
            } else if (this.r > 1 && this.c.getLineCount() > 0) {
                StaticLayout staticLayout3 = this.c;
                this.h0 = staticLayout3.getLineBottom(staticLayout3.getLineCount() - 1);
            } else {
                this.h0 = this.c.getLineBottom(0);
            }
            int i4 = this.n & 7;
            if (i4 == 1) {
                i2 = ((i - this.f0) / 2) - ((int) this.c.getLineLeft(0));
                this.d0 = i2;
            } else if (i4 == 3) {
                StaticLayout staticLayout4 = this.d;
                if (staticLayout4 != null) {
                    i2 = -((int) staticLayout4.getLineLeft(0));
                    this.d0 = i2;
                } else {
                    i2 = -((int) this.c.getLineLeft(0));
                    this.d0 = i2;
                }
            } else if (this.c.getLineLeft(0) == 0.0f) {
                StaticLayout staticLayout5 = this.d;
                if (staticLayout5 != null) {
                    i2 = (int) (i - staticLayout5.getLineWidth(0));
                    this.d0 = i2;
                } else {
                    i2 = i - this.f0;
                    this.d0 = i2;
                }
            } else {
                i2 = -gm.L(8.0f);
                this.d0 = i2;
            }
            this.d0 = getPaddingLeft() + i2;
            if (this.n0) {
                if (this.x != null && !this.m0) {
                    i3 = (int) (drawable.getIntrinsicWidth() * this.I);
                } else {
                    i3 = 0;
                }
                if (this.y != null && !this.m0) {
                    i3 += (int) (drawable2.getIntrinsicWidth() * this.I);
                }
            } else {
                i3 = 0;
            }
            if (this.f0 + i3 <= i - this.s0) {
                z = false;
            }
            this.R = z;
            b();
            StaticLayout staticLayout6 = this.e;
            if (staticLayout6 != null && this.u0 > 0) {
                this.w0 = staticLayout6.getPrimaryHorizontal(0) - this.d.getPrimaryHorizontal(0);
            }
        }
        int i5 = this.G;
        if (i5 >= 0) {
            this.H = this.c.getPrimaryHorizontal(i5);
        } else {
            this.H = 0.0f;
        }
    }

    public final void b() {
        int i;
        if ((this.Q && (this.R || this.S != 0.0f)) || this.o0) {
            i = 2;
        } else {
            i = 0;
        }
        if (getLayerType() != i) {
            setLayerType(i, null);
            invalidate();
        }
    }

    public final void c(Canvas canvas) {
        ArrayList arrayList = this.z0;
        if (arrayList.isEmpty()) {
            return;
        }
        Path path = this.B0;
        path.rewind();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            Rect bounds = ((rna) obj).getBounds();
            path.addRect(bounds.left, bounds.top, bounds.right, bounds.bottom, Path.Direction.CW);
        }
        canvas.clipPath(path, Region.Op.DIFFERENCE);
    }

    public void d(int i) {
        int i2;
        int i3;
        int i4;
        CharSequence charSequence;
        int L;
        CharSequence charSequence2;
        int i5;
        int L2;
        CharSequence charSequence3;
        int L3;
        int L4;
        int L5;
        Drawable drawable;
        Drawable drawable2;
        Stack stack = this.A0;
        ArrayList arrayList = this.z0;
        CharSequence charSequence4 = this.s;
        this.G = -1;
        this.D0 = false;
        if (charSequence4 != null) {
            try {
                Drawable drawable3 = this.w;
                if (drawable3 != null && !this.l0) {
                    drawable3.getIntrinsicWidth();
                    i2 = (i - this.w.getIntrinsicWidth()) - this.J;
                } else {
                    i2 = i;
                }
                if (!this.n0) {
                    if (this.x != null && !this.m0) {
                        i3 = (int) (drawable.getIntrinsicWidth() * this.I);
                        i2 = (i2 - i3) - this.J;
                    } else {
                        i3 = 0;
                    }
                    if (this.y != null && !this.m0) {
                        i3 += (int) (drawable2.getIntrinsicWidth() * this.I);
                        i2 = (i2 - i3) - this.J;
                    }
                } else {
                    i3 = 0;
                }
                SpannableStringBuilder spannableStringBuilder = charSequence4;
                if (this.F != null) {
                    spannableStringBuilder = charSequence4;
                    if (this.E != null) {
                        int indexOf = charSequence4.toString().indexOf(this.F);
                        this.G = indexOf;
                        if (indexOf >= 0) {
                            SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(charSequence4);
                            fg3 fg3Var = new fg3(this.E.getIntrinsicWidth());
                            int i6 = this.G;
                            valueOf.setSpan(fg3Var, i6, this.F.length() + i6, 0);
                            spannableStringBuilder = valueOf;
                        } else {
                            i2 = (i2 - this.E.getIntrinsicWidth()) - this.J;
                            spannableStringBuilder = charSequence4;
                        }
                    }
                }
                CharSequence charSequence5 = spannableStringBuilder;
                boolean z = this.C0;
                TextPaint textPaint = this.h;
                if (z && i3 != 0 && !this.m0 && !charSequence5.equals(TextUtils.ellipsize(charSequence5, textPaint, i2, TextUtils.TruncateAt.END))) {
                    this.D0 = true;
                    i2 = i2 + i3 + this.J;
                }
                int i7 = i2;
                if (this.M) {
                    if (!this.o0) {
                        charSequence2 = TextUtils.ellipsize(charSequence5, textPaint, i7, TextUtils.TruncateAt.END);
                    } else {
                        charSequence2 = charSequence5;
                    }
                    if (!this.o0 && !charSequence2.equals(charSequence5)) {
                        Layout.Alignment alignment = getAlignment();
                        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                        StaticLayout c = oya.c(charSequence5, textPaint, i7, alignment, 0.0f, truncateAt, i7, this.y0, false);
                        i5 = i7;
                        this.e = c;
                        if (c != null) {
                            int lineEnd = c.getLineEnd(0);
                            int lineStart = this.e.getLineStart(1);
                            CharSequence subSequence = charSequence5.subSequence(0, lineEnd);
                            SpannableStringBuilder valueOf2 = SpannableStringBuilder.valueOf(charSequence5);
                            valueOf2.setSpan(new vy2((byte) 1), 0, lineStart, 0);
                            if (lineEnd < charSequence2.length()) {
                                charSequence3 = charSequence2.subSequence(lineEnd, charSequence2.length());
                            } else {
                                charSequence3 = "…";
                            }
                            int length = charSequence2.length();
                            if (this.Q) {
                                L3 = gm.L(2000.0f);
                            } else {
                                L3 = i5 + gm.L(8.0f);
                            }
                            this.d = new StaticLayout(charSequence2, 0, length, textPaint, L3, getAlignment(), 1.0f, 0.0f, false);
                            int length2 = subSequence.length();
                            if (this.Q) {
                                L4 = gm.L(2000.0f);
                            } else {
                                L4 = i5 + gm.L(8.0f);
                            }
                            StaticLayout staticLayout = new StaticLayout(subSequence, 0, length2, textPaint, L4, getAlignment(), 1.0f, 0.0f, false);
                            this.c = staticLayout;
                            String str = charSequence3;
                            if (staticLayout.getLineLeft(0) != 0.0f) {
                                str = "\u200f" + ((Object) charSequence3);
                            }
                            CharSequence charSequence6 = str;
                            int length3 = charSequence6.length();
                            if (this.Q) {
                                L5 = gm.L(2000.0f);
                            } else {
                                L5 = i5 + gm.L(8.0f);
                            }
                            this.f = new StaticLayout(charSequence6, 0, length3, textPaint, L5, getAlignment(), 1.0f, 0.0f, false);
                            this.e = oya.c(valueOf2, textPaint, i5 + gm.L(8.0f) + this.u0, getAlignment(), 0.0f, truncateAt, i5 + this.u0, this.y0, false);
                        }
                    } else {
                        i5 = i7;
                        CharSequence charSequence7 = charSequence2;
                        int length4 = charSequence7.length();
                        if (!this.Q && !this.o0) {
                            L2 = i5 + gm.L(8.0f);
                        } else {
                            L2 = gm.L(2000.0f);
                        }
                        this.c = new StaticLayout(charSequence7, 0, length4, textPaint, L2, getAlignment(), 1.0f, 0.0f, false);
                        this.e = null;
                        this.f = null;
                        this.d = null;
                    }
                    i4 = i5;
                } else if (this.r > 1) {
                    StaticLayout c2 = oya.c(charSequence5, textPaint, i7, getAlignment(), 0.0f, TextUtils.TruncateAt.END, i7, this.r, false);
                    i4 = i7;
                    this.c = c2;
                } else {
                    i4 = i7;
                    if (!this.Q && !this.o0) {
                        charSequence = TextUtils.ellipsize(charSequence5, textPaint, i4, TextUtils.TruncateAt.END);
                    } else {
                        charSequence = charSequence5;
                    }
                    int length5 = charSequence.length();
                    if (!this.Q && !this.o0) {
                        L = gm.L(8.0f) + i4;
                    } else {
                        L = gm.L(2000.0f);
                    }
                    this.c = new StaticLayout(charSequence, 0, length5, textPaint, L, getAlignment(), 1.0f, 0.0f, false);
                }
                stack.addAll(arrayList);
                arrayList.clear();
                StaticLayout staticLayout2 = this.c;
                if (staticLayout2 != null && (staticLayout2.getText() instanceof Spannable)) {
                    rna.b(this, this.c, -2, -2, stack, arrayList);
                }
                a(i4);
            } catch (Exception unused) {
            }
        } else {
            this.c = null;
            this.f0 = 0;
            this.h0 = 0;
        }
        gn.release(this, this.I0);
        if (this.L0) {
            this.I0 = gn.update(this.J0, this, this.I0, this.c);
        }
        invalidate();
    }

    public final void e(Canvas canvas) {
        int i = (this.N > 0.0f ? 1 : (this.N == 0.0f ? 0 : -1));
        int i2 = 0;
        ArrayList arrayList = this.z0;
        if (i > 0 && this.v0 != 0) {
            canvas.save();
            float f = this.N;
            canvas.translate((this.w0 * f) + ((-this.v0) * f), 0.0f);
            float f2 = this.a;
            float f3 = this.N;
            this.a = ts2.i(this.w0, f3, (-this.v0) * f3, f2);
            canvas.save();
            c(canvas);
            cn cnVar = this.I0;
            if (cnVar != null) {
                cnVar.a();
            }
            this.c.draw(canvas);
            canvas.restore();
            gn.drawAnimatedEmojis(canvas, this.c, this.I0, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f, this.K0);
            int size = arrayList.size();
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                ((rna) obj).draw(canvas);
            }
            canvas.restore();
            return;
        }
        canvas.save();
        c(canvas);
        cn cnVar2 = this.I0;
        if (cnVar2 != null) {
            cnVar2.a();
        }
        this.c.draw(canvas);
        canvas.restore();
        gn.drawAnimatedEmojis(canvas, this.c, this.I0, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f, this.K0);
        int size2 = arrayList.size();
        while (i2 < size2) {
            Object obj2 = arrayList.get(i2);
            i2++;
            ((rna) obj2).draw(canvas);
        }
    }

    public final boolean f() {
        if (this.k0 && getMeasuredHeight() != 0 && !this.M) {
            d(((getMaxTextWidth() - getPaddingLeft()) - getPaddingRight()) - this.x0);
            if ((this.n & 112) == 16) {
                this.e0 = (getMeasuredHeight() - this.h0) / 2;
                return true;
            }
            this.e0 = getPaddingTop();
            return true;
        }
        requestLayout();
        return true;
    }

    public final void g(e0b e0bVar, String str) {
        e0b e0bVar2 = this.E;
        if (e0bVar2 == e0bVar) {
            return;
        }
        if (e0bVar2 != null) {
            e0bVar2.setCallback(null);
        }
        this.E = e0bVar;
        if (e0bVar != null) {
            e0bVar.setCallback(this);
        }
        f();
        this.F = str;
    }

    @Override
    public Drawable getBackground() {
        Drawable drawable = this.P;
        if (drawable != null) {
            return drawable;
        }
        return super.getBackground();
    }

    public float getExactWidth() {
        int i;
        float measureText = getPaint().measureText(getText().toString()) + getSideDrawablesSize();
        if (this.w == null && this.x == null && this.y == null) {
            i = 0;
        } else {
            i = this.J;
        }
        return measureText - i;
    }

    public float getExactWidthIncludeDrawables() {
        int i;
        int i2;
        float exactWidth = getExactWidth();
        Drawable drawable = this.w;
        int i3 = 0;
        if (drawable != null) {
            i = drawable.getIntrinsicWidth();
        } else {
            i = 0;
        }
        float f = exactWidth + i;
        Drawable drawable2 = this.x;
        if (drawable2 != null) {
            i2 = drawable2.getIntrinsicWidth();
        } else {
            i2 = 0;
        }
        float f2 = f + i2;
        Drawable drawable3 = this.y;
        if (drawable3 != null) {
            i3 = drawable3.getIntrinsicWidth();
        }
        return f2 + i3;
    }

    public float getFullAlpha() {
        return this.N;
    }

    public Layout getLayout() {
        return this.c;
    }

    public float getLayoutX() {
        return this.a;
    }

    public float getLayoutY() {
        return this.b;
    }

    public Drawable getLeftDrawable() {
        return this.w;
    }

    public int getLineCount() {
        int i;
        StaticLayout staticLayout = this.c;
        if (staticLayout != null) {
            i = staticLayout.getLineCount();
        } else {
            i = 0;
        }
        StaticLayout staticLayout2 = this.e;
        if (staticLayout2 != null) {
            return staticLayout2.getLineCount() + i;
        }
        return i;
    }

    public int getMaxTextWidth() {
        int i;
        Drawable drawable;
        Drawable drawable2;
        int measuredWidth = getMeasuredWidth();
        int i2 = 0;
        if (this.m0 && (drawable2 = this.x) != null) {
            i = drawable2.getIntrinsicWidth() + this.J;
        } else {
            i = 0;
        }
        int i3 = measuredWidth - i;
        if (this.m0 && (drawable = this.y) != null) {
            i2 = drawable.getIntrinsicWidth() + this.J;
        }
        return i3 - i2;
    }

    public TextPaint getPaint() {
        return this.h;
    }

    public Drawable getRightDrawable() {
        return this.x;
    }

    public Drawable getRightDrawable2() {
        return this.y;
    }

    public boolean getRightDrawableOutside() {
        return this.m0;
    }

    public int getRightDrawableWidth() {
        Drawable drawable = this.x;
        if (drawable == null) {
            return 0;
        }
        return (int) ((drawable.getIntrinsicWidth() * this.I) + this.J);
    }

    public int getRightDrawableX() {
        return this.i0;
    }

    public int getRightDrawableY() {
        return this.j0;
    }

    public int getSideDrawablesSize() {
        int i;
        Drawable drawable = this.w;
        if (drawable != null) {
            i = drawable.getIntrinsicWidth() + this.J;
        } else {
            i = 0;
        }
        Drawable drawable2 = this.x;
        if (drawable2 != null) {
            i += ((int) (drawable2.getIntrinsicWidth() * this.I)) + this.J;
        }
        Drawable drawable3 = this.y;
        if (drawable3 != null) {
            return ((int) (drawable3.getIntrinsicWidth() * this.I)) + this.J + i;
        }
        return i;
    }

    public CharSequence getText() {
        CharSequence charSequence = this.s;
        if (charSequence == null) {
            return "";
        }
        return charSequence;
    }

    public int getTextColor() {
        return this.h.getColor();
    }

    public int getTextHeight() {
        return this.h0;
    }

    public TextPaint getTextPaint() {
        return this.h;
    }

    public int getTextStartX() {
        int i = 0;
        if (this.c == null) {
            return 0;
        }
        Drawable drawable = this.w;
        if (drawable != null && (this.n & 7) == 3) {
            i = this.J + drawable.getIntrinsicWidth();
        }
        e0b e0bVar = this.E;
        if (e0bVar != null && this.G < 0 && (this.n & 7) == 3) {
            i += e0bVar.getIntrinsicWidth() + this.J;
        }
        return ((int) getX()) + this.d0 + i;
    }

    public int getTextStartY() {
        if (this.c == null) {
            return 0;
        }
        return (int) getY();
    }

    public int getTextWidth() {
        Drawable drawable;
        int i;
        Drawable drawable2;
        int i2 = this.f0;
        int i3 = 0;
        if (this.n0) {
            if (this.x != null) {
                i = (int) (drawable.getIntrinsicWidth() * this.I);
            } else {
                i = 0;
            }
            if (this.y != null) {
                i3 = (int) (drawable2.getIntrinsicWidth() * this.I);
            }
            i3 += i;
        }
        return i2 + i3;
    }

    public final void h(int i, int i2) {
        if (this.u0 == i && this.v0 == i2) {
            return;
        }
        this.u0 = i;
        this.v0 = i2;
        d(((getMaxTextWidth() - getPaddingLeft()) - getPaddingRight()) - this.x0);
    }

    @Override
    public final boolean hasOverlappingRendering() {
        return false;
    }

    public final void i(Drawable drawable) {
        Drawable drawable2 = this.x;
        if (drawable2 == drawable) {
            return;
        }
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.x = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        f();
    }

    @Override
    public final void invalidateDrawable(Drawable drawable) {
        Drawable drawable2 = this.w;
        if (drawable == drawable2) {
            invalidate(drawable2.getBounds());
            return;
        }
        Drawable drawable3 = this.x;
        if (drawable == drawable3) {
            invalidate(drawable3.getBounds());
            return;
        }
        Drawable drawable4 = this.y;
        if (drawable == drawable4) {
            invalidate(drawable4.getBounds());
            return;
        }
        e0b e0bVar = this.E;
        if (drawable == e0bVar) {
            invalidate(e0bVar.getBounds());
        }
    }

    public final void j(Drawable drawable) {
        Drawable drawable2 = this.y;
        if (drawable2 == drawable) {
            return;
        }
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.y = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        f();
    }

    public boolean k(CharSequence charSequence) {
        return l(charSequence, false);
    }

    public boolean l(CharSequence charSequence, boolean z) {
        CharSequence charSequence2 = this.s;
        if (charSequence2 != null || charSequence != null) {
            if (!z && charSequence2 != null && charSequence2.equals(charSequence)) {
                return false;
            }
            this.s = charSequence;
            this.U = 500;
            f();
            return true;
        }
        return false;
    }

    public final void m() {
        boolean z;
        if ((this.V == null || this.W == null) && this.Q) {
            Paint paint = new Paint();
            this.V = paint;
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            paint.setShader(new LinearGradient(0.0f, 0.0f, gm.L(6.0f), 0.0f, new int[]{-1, 0}, new float[]{0.0f, 1.0f}, tileMode));
            Paint paint2 = this.V;
            PorterDuff.Mode mode = PorterDuff.Mode.DST_OUT;
            paint2.setXfermode(new PorterDuffXfermode(mode));
            Paint paint3 = new Paint();
            this.W = paint3;
            paint3.setShader(new LinearGradient(0.0f, 0.0f, gm.L(6.0f), 0.0f, new int[]{0, -1}, new float[]{0.0f, 1.0f}, tileMode));
            this.W.setXfermode(new PorterDuffXfermode(mode));
        }
        Boolean bool = this.q0;
        if (bool != null) {
            z = bool.booleanValue();
        } else {
            z = false;
        }
        if ((this.a0 == null || this.b0 != gm.L(this.r0) || this.p0 != z) && this.o0) {
            Paint paint4 = this.a0;
            if (paint4 == null) {
                paint4 = new Paint();
                this.a0 = paint4;
            }
            this.p0 = z;
            if (z) {
                int L = gm.L(this.r0);
                this.b0 = L;
                paint4.setShader(new LinearGradient(0.0f, 0.0f, L, 0.0f, new int[]{-1, 0}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
            } else {
                int L2 = gm.L(this.r0);
                this.b0 = L2;
                paint4.setShader(new LinearGradient(0.0f, 0.0f, L2, 0.0f, new int[]{0, -1}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
            }
            this.a0.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        }
    }

    @Override
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.L0 = true;
        this.I0 = gn.update(this.J0, this, this.I0, this.c);
    }

    @Override
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.L0 = false;
        gn.release(this, this.I0);
        this.k0 = false;
    }

    @Override
    public void onDraw(Canvas canvas) {
        boolean z;
        int i;
        Drawable drawable;
        float f;
        float f2;
        int i2;
        Drawable drawable2;
        int g;
        int i3;
        int i4;
        int g2;
        int i5;
        int g3;
        int i6;
        float f3;
        float f4;
        Drawable drawable3;
        float f5;
        boolean z2;
        float f6;
        Drawable drawable4;
        int g4;
        int i7;
        int g5;
        int i8;
        float f7;
        float f8;
        Drawable drawable5;
        Drawable drawable6;
        Drawable drawable7;
        int g6;
        int i9;
        int g7;
        int i10;
        int intrinsicHeight;
        Drawable drawable8;
        int g8;
        int i11;
        int g9;
        int i12;
        int intrinsicHeight2;
        int intrinsicHeight3;
        super.onDraw(canvas);
        this.a = 0.0f;
        this.b = 0.0f;
        if (this.Q && (this.R || this.S != 0.0f)) {
            z = true;
        } else {
            z = false;
        }
        this.g0 = this.f0;
        Drawable drawable9 = this.w;
        if (drawable9 != null && !this.l0) {
            int i13 = (int) (-this.S);
            int i14 = this.n;
            if ((i14 & 7) == 1) {
                i13 += this.d0;
            }
            if ((i14 & 112) == 16) {
                intrinsicHeight3 = ((getMeasuredHeight() - this.w.getIntrinsicHeight()) / 2) + this.K;
            } else {
                intrinsicHeight3 = this.K + ((this.h0 - this.w.getIntrinsicHeight()) / 2) + getPaddingTop();
            }
            Drawable drawable10 = this.w;
            drawable10.setBounds(i13, intrinsicHeight3, drawable10.getIntrinsicWidth() + i13, this.w.getIntrinsicHeight() + intrinsicHeight3);
            this.w.draw(canvas);
            int i15 = this.n & 7;
            if (i15 != 3 && i15 != 1) {
                i = 0;
            } else {
                i = this.w.getIntrinsicWidth() + this.J;
            }
            this.g0 = this.w.getIntrinsicWidth() + this.J + this.g0;
        } else if (this.l0 && drawable9 != null) {
            i = this.J + drawable9.getIntrinsicWidth();
        } else {
            i = 0;
        }
        e0b e0bVar = this.E;
        if (e0bVar != null && this.F != null) {
            int i16 = (int) ((-this.S) + this.H);
            int i17 = this.n;
            if ((i17 & 7) == 1) {
                i16 += this.d0;
            }
            if ((i17 & 112) == 16) {
                intrinsicHeight2 = ((getMeasuredHeight() - this.E.getIntrinsicHeight()) / 2) + this.K;
            } else {
                intrinsicHeight2 = this.K + ((this.h0 - e0bVar.getIntrinsicHeight()) / 2);
            }
            e0b e0bVar2 = this.E;
            e0bVar2.setBounds(i16, intrinsicHeight2, e0bVar2.getIntrinsicWidth() + i16, this.E.getIntrinsicHeight() + intrinsicHeight2);
            this.E.draw(canvas);
            if (this.G < 0) {
                int i18 = this.n & 7;
                if (i18 == 3 || i18 == 1) {
                    i += this.E.getIntrinsicWidth() + this.J;
                }
                this.g0 = this.E.getIntrinsicWidth() + this.J + this.g0;
            }
        }
        int i19 = i;
        if (this.x != null && !this.D0 && this.I > 0.0f && !this.m0 && !this.n0) {
            int i20 = this.f0 + i19 + this.J + ((int) (-this.S));
            int i21 = this.n & 7;
            if (i21 == 1 || i21 == 5) {
                i20 += this.d0;
            }
            int intrinsicWidth = (int) (drawable.getIntrinsicWidth() * this.I);
            int intrinsicHeight4 = (int) (this.x.getIntrinsicHeight() * this.I);
            if ((this.n & 112) == 16) {
                g9 = (getMeasuredHeight() - intrinsicHeight4) / 2;
                i12 = this.L;
            } else {
                g9 = wi8.g(this.h0, intrinsicHeight4, 2, getPaddingTop());
                i12 = this.L;
            }
            int i22 = g9 + i12;
            f = 0.0f;
            this.x.setBounds(i20, i22, i20 + intrinsicWidth, i22 + intrinsicHeight4);
            this.i0 = i20 + (intrinsicWidth >> 1);
            this.j0 = i22 + (intrinsicHeight4 >> 1);
            this.x.draw(canvas);
            this.g0 = this.J + intrinsicWidth + this.g0;
        } else {
            f = 0.0f;
        }
        if (this.y != null && !this.D0 && this.I > f && !this.m0 && !this.n0) {
            int i23 = this.f0 + i19 + this.J + ((int) (-this.S));
            if (this.x != null) {
                i23 += ((int) (drawable8.getIntrinsicWidth() * this.I)) + this.J;
            }
            int i24 = this.n & 7;
            if (i24 == 1 || i24 == 5) {
                i23 += this.d0;
            }
            int intrinsicWidth2 = (int) (this.y.getIntrinsicWidth() * this.I);
            int intrinsicHeight5 = (int) (this.y.getIntrinsicHeight() * this.I);
            if ((this.n & 112) == 16) {
                g8 = (getMeasuredHeight() - intrinsicHeight5) / 2;
                i11 = this.L;
            } else {
                g8 = wi8.g(this.h0, intrinsicHeight5, 2, getPaddingTop());
                i11 = this.L;
            }
            int i25 = g8 + i11;
            this.y.setBounds(i23, i25, i23 + intrinsicWidth2, intrinsicHeight5 + i25);
            this.y.draw(canvas);
            this.g0 = this.J + intrinsicWidth2 + this.g0;
        }
        int L = gm.L(16.0f) + this.g0;
        float f9 = this.S;
        if (f9 != f) {
            if (this.w != null && !this.l0) {
                int i26 = ((int) (-f9)) + L;
                if ((this.n & 112) == 16) {
                    intrinsicHeight = ((getMeasuredHeight() - this.w.getIntrinsicHeight()) / 2) + this.K;
                } else {
                    intrinsicHeight = this.K + ((this.h0 - this.w.getIntrinsicHeight()) / 2) + getPaddingTop();
                }
                Drawable drawable11 = this.w;
                drawable11.setBounds(i26, intrinsicHeight, drawable11.getIntrinsicWidth() + i26, this.w.getIntrinsicHeight() + intrinsicHeight);
                this.w.draw(canvas);
            }
            if (this.x != null && !this.m0) {
                int intrinsicWidth3 = (int) (drawable5.getIntrinsicWidth() * this.I);
                int intrinsicHeight6 = (int) (this.x.getIntrinsicHeight() * this.I);
                int i27 = this.f0 + i19 + this.J + ((int) (-this.S)) + L;
                if ((this.n & 112) == 16) {
                    g7 = (getMeasuredHeight() - intrinsicHeight6) / 2;
                    i10 = this.L;
                } else {
                    g7 = wi8.g(this.h0, intrinsicHeight6, 2, getPaddingTop());
                    i10 = this.L;
                }
                int i28 = g7 + i10;
                f2 = 16.0f;
                this.x.setBounds(i27, i28, i27 + intrinsicWidth3, i28 + intrinsicHeight6);
                this.i0 = i27 + (intrinsicWidth3 >> 1);
                this.j0 = i28 + (intrinsicHeight6 >> 1);
                this.x.draw(canvas);
            } else {
                f2 = 16.0f;
            }
            if (this.y != null && !this.m0) {
                int intrinsicWidth4 = (int) (drawable6.getIntrinsicWidth() * this.I);
                int intrinsicHeight7 = (int) (this.y.getIntrinsicHeight() * this.I);
                int i29 = this.f0 + i19 + this.J + ((int) (-this.S)) + L;
                if (this.x != null) {
                    i29 += ((int) (drawable7.getIntrinsicWidth() * this.I)) + this.J;
                }
                if ((this.n & 112) == 16) {
                    g6 = (getMeasuredHeight() - intrinsicHeight7) / 2;
                    i9 = this.L;
                } else {
                    g6 = wi8.g(this.h0, intrinsicHeight7, 2, getPaddingTop());
                    i9 = this.L;
                }
                int i30 = g6 + i9;
                this.y.setBounds(i29, i30, intrinsicWidth4 + i29, intrinsicHeight7 + i30);
                this.y.draw(canvas);
            }
        } else {
            f2 = 16.0f;
        }
        if (this.c != null) {
            if (this.l0 || this.m0 || this.o0 || this.s0 > 0) {
                canvas.save();
                int maxTextWidth = getMaxTextWidth() - this.s0;
                Drawable drawable12 = this.x;
                if (drawable12 != null && !(drawable12 instanceof tm) && this.m0) {
                    f3 = 2.0f;
                } else {
                    f3 = f;
                }
                canvas.clipRect(i19, 0, maxTextWidth - gm.L(f3), getMeasuredHeight());
            }
            gw3.n = false;
            if (this.P != null) {
                int i31 = this.f0;
                int i32 = (i31 / 2) + ((int) ((this.d0 + i19) - this.S));
                int max = Math.max(getPaddingRight() + getPaddingLeft() + i31, this.t0);
                int i33 = i32 - (max / 2);
                this.P.setBounds(i33, 0, max + i33, getMeasuredHeight());
                this.P.draw(canvas);
            }
            if (this.d0 + i19 != 0 || this.e0 != 0 || this.S != f) {
                canvas.save();
                canvas.translate((this.d0 + i19) - this.S, this.e0);
                this.a = ((this.d0 + i19) - this.S) + this.a;
                this.b += this.e0;
            }
            e(canvas);
            StaticLayout staticLayout = this.f;
            TextPaint textPaint = this.h;
            if (staticLayout != null && this.N < 1.0f) {
                int alpha = textPaint.getAlpha();
                textPaint.setAlpha((int) ((1.0f - this.N) * 255.0f));
                canvas.save();
                if (this.f.getText().length() == 1) {
                    if (this.y0 == 1) {
                        f8 = 0.5f;
                    } else {
                        f8 = 4.0f;
                    }
                    f7 = gm.L(f8);
                } else {
                    f7 = f;
                }
                int i34 = (this.c.getLineLeft(0) > f ? 1 : (this.c.getLineLeft(0) == f ? 0 : -1));
                StaticLayout staticLayout2 = this.c;
                if (i34 != 0) {
                    f4 = f;
                    canvas.translate((-staticLayout2.getLineWidth(0)) + f7, f4);
                } else {
                    f4 = f;
                    canvas.translate(staticLayout2.getLineWidth(0) - f7, f4);
                }
                float f10 = this.N;
                canvas.translate((this.w0 * f10) + ((-this.v0) * f10), f4);
                this.f.draw(canvas);
                canvas.restore();
                textPaint.setAlpha(alpha);
            } else {
                f4 = f;
            }
            if (this.e != null) {
                if (this.N > f4) {
                    int alpha2 = textPaint.getAlpha();
                    textPaint.setAlpha((int) (this.N * 255.0f));
                    float f11 = this.N;
                    float f12 = this.w0;
                    f4 = 0.0f;
                    canvas.translate(((f11 * f12) + ((-this.v0) * f11)) - f12, 0.0f);
                    this.e.draw(canvas);
                    textPaint.setAlpha(alpha2);
                } else {
                    f4 = 0.0f;
                }
            }
            if (this.S != f4) {
                canvas.translate(L, f4);
                e(canvas);
            }
            if (this.d0 + i19 != 0 || this.e0 != 0 || this.S != f4) {
                canvas.restore();
            }
            if (this.x != null && !this.D0 && this.I > 0.0f && !this.m0 && this.n0) {
                int i35 = this.f0 + i19 + this.J + ((int) (-this.S));
                int i36 = this.n & 7;
                if (i36 == 1 || i36 == 5) {
                    i35 += this.d0;
                }
                int intrinsicWidth5 = (int) (drawable3.getIntrinsicWidth() * this.I);
                int intrinsicHeight8 = (int) (this.x.getIntrinsicHeight() * this.I);
                if ((this.n & 112) == 16) {
                    g5 = (getMeasuredHeight() - intrinsicHeight8) / 2;
                    i8 = this.L;
                } else {
                    g5 = wi8.g(this.h0, intrinsicHeight8, 2, getPaddingTop());
                    i8 = this.L;
                }
                int i37 = g5 + i8;
                this.x.setBounds(i35, i37, i35 + intrinsicWidth5, i37 + intrinsicHeight8);
                this.i0 = i35 + (intrinsicWidth5 >> 1);
                this.j0 = i37 + (intrinsicHeight8 >> 1);
                this.x.draw(canvas);
                this.g0 = this.J + intrinsicWidth5 + this.g0;
            }
            if (this.y != null && !this.D0 && this.I > 0.0f && !this.m0 && this.n0) {
                int i38 = this.f0 + i19 + this.J + ((int) (-this.S));
                if (this.x != null) {
                    i38 += ((int) (drawable4.getIntrinsicWidth() * this.I)) + this.J;
                }
                int i39 = this.n & 7;
                if (i39 == 1 || i39 == 5) {
                    i38 += this.d0;
                }
                int intrinsicWidth6 = (int) (this.y.getIntrinsicWidth() * this.I);
                int intrinsicHeight9 = (int) (this.y.getIntrinsicHeight() * this.I);
                if ((this.n & 112) == 16) {
                    g4 = (getMeasuredHeight() - intrinsicHeight9) / 2;
                    i7 = this.L;
                } else {
                    g4 = wi8.g(this.h0, intrinsicHeight9, 2, getPaddingTop());
                    i7 = this.L;
                }
                int i40 = g4 + i7;
                this.y.setBounds(i38, i40, i38 + intrinsicWidth6, intrinsicHeight9 + i40);
                this.y.draw(canvas);
                this.g0 = this.J + intrinsicWidth6 + this.g0;
            }
            if (z) {
                if (this.S < gm.L(10.0f)) {
                    this.V.setAlpha((int) ((this.S / gm.L(10.0f)) * 255.0f));
                } else {
                    if (this.S > (gm.L(f2) + this.g0) - gm.L(10.0f)) {
                        this.V.setAlpha((int) hg9.e(this.S - ((gm.L(f2) + this.g0) - gm.L(10.0f)), gm.L(10.0f), 1.0f, 255.0f));
                    } else {
                        this.V.setAlpha(255);
                    }
                }
                canvas.drawRect(i19, 0.0f, gm.L(6.0f) + i19, getMeasuredHeight(), this.V);
                canvas.save();
                canvas.translate((getMaxTextWidth() - this.s0) - gm.L(6.0f), 0.0f);
                canvas.drawRect(0.0f, 0.0f, gm.L(6.0f), getMeasuredHeight(), this.W);
                canvas.restore();
            } else if (this.o0 && this.R && this.a0 != null) {
                canvas.save();
                m();
                if (!this.p0) {
                    int maxTextWidth2 = (getMaxTextWidth() - this.s0) - this.b0;
                    Drawable drawable13 = this.x;
                    if (drawable13 != null && !(drawable13 instanceof tm) && this.m0) {
                        f5 = 2.0f;
                    } else {
                        f5 = 0.0f;
                    }
                    canvas.translate(maxTextWidth2 - gm.L(f5), 0.0f);
                }
                canvas.drawRect(i19, 0.0f, this.b0, getMeasuredHeight(), this.a0);
                canvas.restore();
            }
            if (this.Q && (this.R || this.S != 0.0f)) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                long j = elapsedRealtime - this.T;
                if (j > 17) {
                    j = 17;
                }
                int i41 = this.U;
                if (i41 > 0) {
                    this.U = (int) (i41 - j);
                    z2 = true;
                } else {
                    int L2 = gm.L(f2) + this.g0;
                    int i42 = (this.S > gm.L(100.0f) ? 1 : (this.S == gm.L(100.0f) ? 0 : -1));
                    float f13 = this.S;
                    if (i42 < 0) {
                        f6 = b10.A(f13, gm.L(100.0f), 20.0f, 30.0f);
                        z2 = true;
                    } else if (f13 >= L2 - gm.L(100.0f)) {
                        z2 = true;
                        f6 = hg9.x(this.S - (L2 - gm.L(100.0f)), gm.L(100.0f), 20.0f, 50.0f);
                    } else {
                        z2 = true;
                        f6 = 50.0f;
                    }
                    float L3 = ((((float) j) / 1000.0f) * gm.L(f6)) + this.S;
                    this.S = L3;
                    this.T = elapsedRealtime;
                    if (L3 > L2) {
                        this.S = 0.0f;
                        this.U = 500;
                    }
                    b();
                }
                invalidate();
            } else {
                z2 = true;
            }
            gw3.n = z2;
            if (this.l0 || this.m0 || this.o0 || this.s0 > 0) {
                canvas.restore();
            }
        }
        Drawable drawable14 = this.w;
        if (drawable14 != null && this.l0) {
            int intrinsicWidth7 = drawable14.getIntrinsicWidth();
            int intrinsicHeight10 = this.w.getIntrinsicHeight();
            if ((this.n & 112) == 16) {
                g3 = (getMeasuredHeight() - intrinsicHeight10) / 2;
                i6 = this.K;
            } else {
                g3 = wi8.g(this.h0, intrinsicHeight10, 2, getPaddingTop());
                i6 = this.K;
            }
            int i43 = g3 + i6;
            this.w.setBounds(0, i43, intrinsicWidth7, intrinsicHeight10 + i43);
            this.w.draw(canvas);
        }
        if (this.x != null && this.m0) {
            int i44 = this.f0 + i19 + this.J;
            float f14 = this.S;
            if (f14 == 0.0f) {
                i4 = -L;
            } else {
                i4 = (int) (-f14);
            }
            int min = Math.min(i44 + i4 + L, (getMaxTextWidth() - this.s0) + this.J);
            int intrinsicWidth8 = (int) (this.x.getIntrinsicWidth() * this.I);
            int intrinsicHeight11 = (int) (this.x.getIntrinsicHeight() * this.I);
            if ((this.n & 112) == 16) {
                g2 = (getMeasuredHeight() - intrinsicHeight11) / 2;
                i5 = this.L;
            } else {
                g2 = wi8.g(this.h0, intrinsicHeight11, 2, getPaddingTop());
                i5 = this.L;
            }
            int i45 = g2 + i5;
            this.x.setBounds(min, i45, min + intrinsicWidth8, i45 + intrinsicHeight11);
            this.i0 = min + (intrinsicWidth8 >> 1);
            this.j0 = i45 + (intrinsicHeight11 >> 1);
            this.x.draw(canvas);
        }
        if (this.y != null && this.m0) {
            int i46 = i19 + this.f0 + this.J;
            float f15 = this.S;
            if (f15 == 0.0f) {
                i2 = -L;
            } else {
                i2 = (int) (-f15);
            }
            int min2 = Math.min(i46 + i2 + L, (getMaxTextWidth() - this.s0) + this.J);
            if (this.x != null) {
                min2 += ((int) (drawable2.getIntrinsicWidth() * this.I)) + this.J;
            }
            int intrinsicWidth9 = (int) (this.y.getIntrinsicWidth() * this.I);
            int intrinsicHeight12 = (int) (this.y.getIntrinsicHeight() * this.I);
            if ((this.n & 112) == 16) {
                g = (getMeasuredHeight() - intrinsicHeight12) / 2;
                i3 = this.L;
            } else {
                g = wi8.g(this.h0, intrinsicHeight12, 2, getPaddingTop());
                i3 = this.L;
            }
            int i47 = g + i3;
            this.y.setBounds(min2, i47, intrinsicWidth9 + min2, intrinsicHeight12 + i47);
            this.y.draw(canvas);
        }
    }

    @Override
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setVisibleToUser(true);
        accessibilityNodeInfo.setClassName("android.widget.TextView");
        accessibilityNodeInfo.setText(this.s);
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.k0 = true;
    }

    @Override
    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        Drawable drawable;
        Drawable drawable2;
        Drawable drawable3;
        Drawable drawable4;
        Drawable drawable5;
        Drawable drawable6;
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int i9 = this.c0;
        int i10 = gm.q.x;
        if (i9 != i10) {
            this.c0 = i10;
            this.S = 0.0f;
            this.U = 500;
            b();
        }
        int paddingLeft = ((size - getPaddingLeft()) - getPaddingRight()) - this.x0;
        if (this.l0 && (drawable6 = this.w) != null) {
            i3 = drawable6.getIntrinsicWidth() + this.J;
        } else {
            i3 = 0;
        }
        int i11 = paddingLeft - i3;
        if (this.m0 && (drawable5 = this.x) != null) {
            i4 = drawable5.getIntrinsicWidth() + this.J;
        } else {
            i4 = 0;
        }
        int i12 = i11 - i4;
        if (this.m0 && (drawable4 = this.y) != null) {
            i5 = drawable4.getIntrinsicWidth() + this.J;
        } else {
            i5 = 0;
        }
        d(i12 - i5);
        if (View.MeasureSpec.getMode(i2) != 1073741824) {
            size2 = getPaddingBottom() + getPaddingTop() + this.h0;
        }
        if (this.O) {
            int paddingRight = getPaddingRight() + getPaddingLeft() + this.f0 + this.x0;
            if (this.l0 && (drawable3 = this.w) != null) {
                i6 = drawable3.getIntrinsicWidth() + this.J;
            } else {
                i6 = 0;
            }
            int i13 = paddingRight + i6;
            if (this.m0 && (drawable2 = this.x) != null) {
                i7 = drawable2.getIntrinsicWidth() + this.J;
            } else {
                i7 = 0;
            }
            int i14 = i13 + i7;
            if (this.m0 && (drawable = this.y) != null) {
                i8 = drawable.getIntrinsicWidth() + this.J;
            } else {
                i8 = 0;
            }
            size = Math.max(Math.min(size, i14 + i8), 0);
        }
        setMeasuredDimension(size, size2);
        if ((this.n & 112) == 16) {
            this.e0 = wi8.g((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), this.h0, 2, getPaddingTop());
        } else {
            this.e0 = getPaddingTop();
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.E0 != null && this.x != null) {
            RectF rectF = gm.P;
            rectF.set(this.i0 - gm.L(16.0f), this.j0 - gm.L(16.0f), gm.L(16.0f) + this.i0, gm.L(16.0f) + this.j0);
            if (motionEvent.getAction() == 0 && rectF.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                this.F0 = true;
                this.G0 = motionEvent.getX();
                this.H0 = motionEvent.getY();
                getParent().requestDisallowInterceptTouchEvent(true);
                Drawable drawable = this.x;
                if (drawable instanceof vq8) {
                    ((vq8) drawable).f.c(true);
                }
            } else if (motionEvent.getAction() == 2 && this.F0) {
                if (Math.abs(motionEvent.getX() - this.G0) >= gm.e || Math.abs(motionEvent.getY() - this.H0) >= gm.e) {
                    this.F0 = false;
                    getParent().requestDisallowInterceptTouchEvent(false);
                    Drawable drawable2 = this.x;
                    if (drawable2 instanceof vq8) {
                        ((vq8) drawable2).f.c(false);
                    }
                }
            } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                if (this.F0 && motionEvent.getAction() == 1) {
                    this.E0.onClick(this);
                    Drawable drawable3 = this.x;
                    if (drawable3 instanceof vq8) {
                        ((vq8) drawable3).f.c(false);
                    }
                }
                this.F0 = false;
                getParent().requestDisallowInterceptTouchEvent(false);
            }
        }
        if (super.onTouchEvent(motionEvent) || this.F0) {
            return true;
        }
        return false;
    }

    public void setAlignment(Layout.Alignment alignment) {
        this.M0 = alignment;
        requestLayout();
    }

    @Override
    public void setBackgroundDrawable(Drawable drawable) {
        if (this.r > 1) {
            super.setBackgroundDrawable(drawable);
        } else {
            this.P = drawable;
        }
    }

    public void setBuildFullLayout(boolean z) {
        this.M = z;
    }

    public void setCanHideRightDrawable(boolean z) {
        this.C0 = z;
    }

    public void setDrawablePadding(int i) {
        if (this.J == i) {
            return;
        }
        this.J = i;
        f();
    }

    public void setEllipsizeByGradient(int i) {
        if (!this.Q) {
            this.o0 = true;
            this.q0 = null;
            m();
            b();
        }
        this.r0 = i;
        m();
    }

    public void setEmojiCacheType(int i) {
        if (i != this.J0) {
            gn.release(this, this.I0);
            this.J0 = i;
            if (this.L0) {
                this.I0 = gn.update(i, this, this.I0, this.c);
            }
        }
    }

    public void setEmojiColor(int i) {
        this.K0 = new PorterDuffColorFilter(i, PorterDuff.Mode.SRC_IN);
    }

    public void setFullAlpha(float f) {
        this.N = f;
        invalidate();
    }

    public void setFullTextMaxLines(int i) {
        this.y0 = i;
    }

    public void setGravity(int i) {
        this.n = i;
    }

    public void setLeftDrawable(Drawable drawable) {
        Drawable drawable2 = this.w;
        if (drawable2 == drawable) {
            return;
        }
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.w = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        f();
    }

    public void setLeftDrawableOutside(boolean z) {
        this.l0 = z;
    }

    public void setLeftDrawableTopPadding(int i) {
        this.K = i;
    }

    public void setLinkTextColor(int i) {
        this.h.linkColor = i;
        invalidate();
    }

    public void setMaxLines(int i) {
        this.r = i;
    }

    public void setMinWidth(int i) {
        this.t0 = i;
    }

    public void setMinusWidth(int i) {
        if (i == this.x0) {
            return;
        }
        this.x0 = i;
        f();
    }

    public void setRightDrawable(int i) {
        Drawable drawable;
        if (i == 0) {
            drawable = null;
        } else {
            drawable = getContext().getResources().getDrawable(i);
        }
        i(drawable);
    }

    public void setRightDrawableInside(boolean z) {
        this.n0 = z;
    }

    public void setRightDrawableOnClick(View.OnClickListener onClickListener) {
        this.E0 = onClickListener;
    }

    public void setRightDrawableOutside(boolean z) {
        this.m0 = z;
    }

    public void setRightDrawableScale(float f) {
        this.I = f;
    }

    public void setRightDrawableTopPadding(int i) {
        this.L = i;
    }

    public void setRightPadding(int i) {
        if (this.s0 != i) {
            this.s0 = i;
            int maxTextWidth = ((getMaxTextWidth() - getPaddingLeft()) - getPaddingRight()) - this.x0;
            Drawable drawable = this.w;
            if (drawable != null && !this.l0) {
                maxTextWidth = (maxTextWidth - drawable.getIntrinsicWidth()) - this.J;
            }
            int i2 = 0;
            if (!this.n0) {
                Drawable drawable2 = this.x;
                if (drawable2 != null && !this.m0) {
                    i2 = (int) (drawable2.getIntrinsicWidth() * this.I);
                    maxTextWidth = (maxTextWidth - i2) - this.J;
                }
                Drawable drawable3 = this.y;
                if (drawable3 != null && !this.m0) {
                    i2 = (int) (drawable3.getIntrinsicWidth() * this.I);
                    maxTextWidth = (maxTextWidth - i2) - this.J;
                }
            }
            if (this.F != null && this.E != null) {
                int indexOf = this.s.toString().indexOf(this.F);
                this.G = indexOf;
                if (indexOf < 0) {
                    maxTextWidth = (maxTextWidth - this.E.getIntrinsicWidth()) - this.J;
                }
            }
            if (this.C0 && i2 != 0 && !this.m0) {
                TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                if (!this.s.equals(TextUtils.ellipsize(this.s, this.h, maxTextWidth, truncateAt))) {
                    this.D0 = true;
                    maxTextWidth = maxTextWidth + i2 + this.J;
                }
            }
            a(maxTextWidth);
            invalidate();
        }
    }

    public void setScrollNonFitText(boolean z) {
        if (this.Q == z) {
            return;
        }
        this.Q = z;
        m();
        requestLayout();
        b();
    }

    public void setSideDrawablesColor(int i) {
        cmb.A1(i, this.x);
        cmb.A1(i, this.w);
    }

    public void setTextColor(int i) {
        this.h.setColor(i);
        invalidate();
    }

    public void setTextSize(int i) {
        setTextSizePx(gm.L(i));
    }

    public void setTextSizePx(int i) {
        float f = i;
        TextPaint textPaint = this.h;
        if (f == textPaint.getTextSize()) {
            return;
        }
        textPaint.setTextSize(f);
        f();
    }

    public void setTypeface(Typeface typeface) {
        this.h.setTypeface(typeface);
    }

    public void setWidthWrapContent(boolean z) {
        this.O = z;
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.x && drawable != this.y && drawable != this.w && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }

    public void setEllipsizeByGradient(boolean z) {
        if (this.Q == z) {
            return;
        }
        this.o0 = z;
        this.q0 = null;
        m();
        b();
    }

    public void setLeftDrawable(int i) {
        setLeftDrawable(i == 0 ? null : getContext().getResources().getDrawable(i));
    }
}
