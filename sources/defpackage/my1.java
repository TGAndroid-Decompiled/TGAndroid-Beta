package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Typeface;
import android.os.SystemClock;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.View;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class my1 extends View {
    public StaticLayout E;
    public float F;
    public TextPaint G;
    public final float H;
    public float I;
    public final ChatActivityEnterView J;
    public boolean a;
    public boolean b;
    public String c;
    public long d;
    public long e;
    public long f;
    public long h;
    public long n;
    public boolean r;
    public final SpannableStringBuilder s;
    public final SpannableStringBuilder w;
    public SpannableStringBuilder x;
    public StaticLayout y;

    public my1(ChatActivityEnterView chatActivityEnterView, Context context) {
        super(context);
        this.J = chatActivityEnterView;
        this.s = new SpannableStringBuilder();
        this.w = new SpannableStringBuilder();
        this.x = new SpannableStringBuilder();
        this.H = gl.L(15.0f);
    }

    public final void a(long j) {
        this.a = true;
        long currentTimeMillis = System.currentTimeMillis() - j;
        this.d = currentTimeMillis;
        this.h = j;
        this.f = currentTimeMillis;
        invalidate();
    }

    public final void b() {
        if (this.a) {
            this.a = false;
            if (this.d > 0) {
                this.e = System.currentTimeMillis();
            }
            invalidate();
        }
        this.f = 0L;
    }

    public float getLeftProperty() {
        return this.I;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        long j;
        long j2;
        SpannableStringBuilder spannableStringBuilder;
        long min;
        String str;
        int threadMessageId;
        int i;
        int i2;
        TextPaint textPaint = this.G;
        ChatActivityEnterView chatActivityEnterView = this.J;
        if (textPaint == null) {
            TextPaint textPaint2 = new TextPaint(1);
            this.G = textPaint2;
            textPaint2.setTextSize(gl.L(14.0f));
            this.G.setTypeface(gl.o());
            this.G.setFontFeatureSettings("tnum");
            TextPaint textPaint3 = this.G;
            int i3 = bkb.F6;
            int i4 = ChatActivityEnterView.r7;
            textPaint3.setColor(chatActivityEnterView.F0(i3));
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (this.a) {
            if (this.r) {
                j = this.h;
            } else {
                j = currentTimeMillis - this.d;
            }
        } else {
            j = this.e - this.d;
        }
        long j3 = j / 1000;
        int i5 = ((int) (j % 1000)) / 10;
        long j4 = 0;
        if (chatActivityEnterView.d1 && j >= 59500 && !this.b) {
            chatActivityEnterView.t3 = -1.0f;
            hy1 hy1Var = chatActivityEnterView.P3;
            if (chatActivityEnterView.P) {
                i2 = Integer.MAX_VALUE;
            } else {
                i2 = 0;
            }
            hy1Var.k1(3, 0, i2, chatActivityEnterView.O6, 0L, true);
            ow1 ow1Var = chatActivityEnterView.K0;
            chatActivityEnterView.O6 = 0L;
            ow1Var.setEffect(0L);
            this.b = true;
        }
        if (this.a && currentTimeMillis > this.f + 5000) {
            this.f = currentTimeMillis;
            na7 q1 = na7.q1(chatActivityEnterView.R);
            long j5 = chatActivityEnterView.G3;
            threadMessageId = chatActivityEnterView.getThreadMessageId();
            long j6 = threadMessageId;
            if (chatActivityEnterView.d1) {
                i = 7;
            } else {
                i = 1;
            }
            q1.G4(i, 0, j5, j6, null);
        }
        long j7 = (int) j3;
        Typeface typeface = gl.a;
        StringBuilder sb = new StringBuilder();
        long j8 = j7 / 60;
        if (j8 >= 60) {
            sb.append(j8 / 60);
            sb.append(":");
            gl.o2(j8 % 60, sb);
            sb.append(":");
            gl.o2(j7 % 60, sb);
            sb.append(",");
            sb.append(i5 / 10);
        } else {
            sb.append(j8);
            sb.append(":");
            gl.o2(j7 % 60, sb);
            sb.append(",");
            sb.append(i5 / 10);
        }
        String sb2 = sb.toString();
        if (sb2.length() >= 3 && (str = this.c) != null && str.length() >= 3 && sb2.length() == this.c.length() && sb2.charAt(sb2.length() - 3) != this.c.charAt(sb2.length() - 3)) {
            int length = sb2.length();
            SpannableStringBuilder spannableStringBuilder2 = this.s;
            spannableStringBuilder2.clear();
            SpannableStringBuilder spannableStringBuilder3 = this.w;
            spannableStringBuilder3.clear();
            this.x.clear();
            spannableStringBuilder2.append((CharSequence) sb2);
            spannableStringBuilder3.append((CharSequence) this.c);
            this.x.append((CharSequence) sb2);
            int i6 = -1;
            int i7 = -1;
            int i8 = 0;
            int i9 = 0;
            int i10 = 0;
            while (true) {
                j2 = j4;
                if (i8 >= length - 1) {
                    break;
                }
                if (this.c.charAt(i8) != sb2.charAt(i8)) {
                    if (i10 == 0) {
                        i7 = i8;
                    }
                    i10++;
                    if (i9 != 0) {
                        lx2 lx2Var = new lx2((byte) 1);
                        if (i8 == length - 2) {
                            i9++;
                        }
                        int i11 = i9 + i6;
                        spannableStringBuilder2.setSpan(lx2Var, i6, i11, 33);
                        spannableStringBuilder3.setSpan(lx2Var, i6, i11, 33);
                        i9 = 0;
                    }
                } else {
                    if (i9 == 0) {
                        i6 = i8;
                    }
                    i9++;
                    if (i10 != 0) {
                        this.x.setSpan(new lx2((byte) 1), i7, i10 + i7, 33);
                        i10 = 0;
                    }
                }
                i8++;
                j4 = j2;
            }
            if (i9 != 0) {
                lx2 lx2Var2 = new lx2((byte) 1);
                int i12 = i9 + i6 + 1;
                spannableStringBuilder2.setSpan(lx2Var2, i6, i12, 33);
                spannableStringBuilder3.setSpan(lx2Var2, i6, i12, 33);
            }
            if (i10 != 0) {
                this.x.setSpan(new lx2((byte) 1), i7, i10 + i7, 33);
            }
            TextPaint textPaint4 = this.G;
            int measuredWidth = getMeasuredWidth();
            Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
            this.y = new StaticLayout(spannableStringBuilder2, textPaint4, measuredWidth, alignment, 1.0f, 0.0f, false);
            this.E = new StaticLayout(spannableStringBuilder3, this.G, getMeasuredWidth(), alignment, 1.0f, 0.0f, false);
            this.F = 1.0f;
        } else {
            j2 = 0;
            SpannableStringBuilder spannableStringBuilder4 = this.x;
            if (spannableStringBuilder4 == null) {
                spannableStringBuilder4 = new SpannableStringBuilder(sb2);
                this.x = spannableStringBuilder4;
            }
            if (spannableStringBuilder4.length() != 0 && this.x.length() == sb2.length()) {
                this.x.replace(spannableStringBuilder.length() - 1, this.x.length(), (CharSequence) sb2, (sb2.length() - 1) - (sb2.length() - this.x.length()), sb2.length());
            } else {
                this.x.clear();
                this.x.append((CharSequence) sb2);
            }
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j9 = this.n;
        if (j9 == j2) {
            min = 16;
        } else {
            min = Math.min(50L, elapsedRealtime - j9);
        }
        this.n = elapsedRealtime;
        float f = this.F;
        if (f != 0.0f) {
            float f2 = f - (((float) min) / 116.0f);
            this.F = f2;
            if (f2 < 0.0f) {
                this.F = 0.0f;
            }
        }
        float measuredHeight = getMeasuredHeight() / 2;
        if (this.F == 0.0f) {
            this.x.clearSpans();
            StaticLayout staticLayout = new StaticLayout(this.x, this.G, getMeasuredWidth(), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            canvas.save();
            de9.n(staticLayout.getHeight(), 2.0f, measuredHeight, 0.0f, canvas);
            staticLayout.draw(canvas);
            canvas.restore();
            this.I = staticLayout.getLineWidth(0) + 0.0f;
        } else {
            StaticLayout staticLayout2 = this.y;
            float f3 = this.H;
            if (staticLayout2 != null) {
                canvas.save();
                this.G.setAlpha((int) ((1.0f - this.F) * 255.0f));
                canvas.translate(0.0f, (measuredHeight - (this.y.getHeight() / 2.0f)) - (this.F * f3));
                this.y.draw(canvas);
                canvas.restore();
            }
            if (this.E != null) {
                canvas.save();
                this.G.setAlpha((int) (this.F * 255.0f));
                canvas.translate(0.0f, tb4.A(1.0f, this.F, f3, measuredHeight - (this.E.getHeight() / 2.0f)));
                this.E.draw(canvas);
                canvas.restore();
            }
            canvas.save();
            this.G.setAlpha(255);
            StaticLayout staticLayout3 = new StaticLayout(this.x, this.G, getMeasuredWidth(), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            de9.n(staticLayout3.getHeight(), 2.0f, measuredHeight, 0.0f, canvas);
            staticLayout3.draw(canvas);
            canvas.restore();
            this.I = staticLayout3.getLineWidth(0) + 0.0f;
        }
        this.c = sb2;
        if ((this.a || this.F != 0.0f) && !this.r) {
            invalidate();
        }
    }

    public void setExternalFrameClock(boolean z) {
        this.r = z;
        this.n = SystemClock.elapsedRealtime();
        invalidate();
    }
}
