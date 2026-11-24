package defpackage;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.os.SystemClock;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class ex1 extends gy1 {
    public boolean g2;
    public final Paint h2;
    public LinearGradient i2;
    public final Matrix j2;
    public float k2;
    public float l2;
    public boolean m2;
    public final ChatActivityEnterView n2;

    public ex1(ChatActivityEnterView chatActivityEnterView, Context context, wjb wjbVar) {
        super(chatActivityEnterView, context, wjbVar);
        this.n2 = chatActivityEnterView;
        this.g2 = true;
        this.h2 = new Paint();
        this.j2 = new Matrix();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ChatActivityEnterView chatActivityEnterView = this.n2;
        mu1 mu1Var = chatActivityEnterView.F3;
        View view = chatActivityEnterView.i6;
        if (view != null) {
            setWindowView(view);
        } else if (mu1Var != null && mu1Var.getParentLayout() != null && ((ActionBarLayout) mu1Var.getParentLayout()).b) {
            setWindowView(mu1Var.getParentLayout().getWindow().getDecorView());
        } else {
            setWindowView(chatActivityEnterView.E3.getWindow().getDecorView());
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        boolean z;
        int i;
        boolean z2;
        float f;
        float f2;
        bn3 bn3Var;
        float f3;
        Canvas canvas2;
        ChatActivityEnterView chatActivityEnterView;
        boolean z3;
        int i2;
        float f4;
        kra kraVar;
        LinearGradient linearGradient;
        float f5;
        float f6;
        float f7;
        float f8;
        kra kraVar2;
        float f9;
        LinearGradient linearGradient2;
        int max;
        ChatActivityEnterView chatActivityEnterView2 = this.n2;
        if (chatActivityEnterView2.F1 && getScrollY() > 0 && getLayout() != null) {
            z = true;
        } else {
            z = false;
        }
        int i3 = -1;
        if (z) {
            i = canvas.saveLayer(-gl.L(4.0f), getScrollY() - gl.L(48.0f), gl.L(4.0f) + getWidth(), gl.L(48.0f) + getHeight() + getScrollY(), null);
        } else {
            i = -1;
        }
        bn3 bn3Var2 = chatActivityEnterView2.n6;
        if (bn3Var2 == null || !bn3Var2.d) {
            jm3 jm3Var = chatActivityEnterView2.j1;
            if (jm3Var != null) {
                bn3Var2 = jm3Var.a;
            } else {
                bn3Var2 = null;
            }
        }
        if (bn3Var2 != null && bn3Var2.d && getLayout() != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        float totalPaddingLeft = getTotalPaddingLeft();
        float offsetY = getOffsetY() + getTotalPaddingTop();
        if (z2) {
            int width = getLayout().getWidth();
            int height = getLayout().getHeight();
            bn3Var2.getClass();
            f = 48.0f;
            f2 = 4.0f;
            f3 = offsetY;
            bn3Var = bn3Var2;
            canvas2 = canvas;
            i3 = canvas2.saveLayer(totalPaddingLeft - gl.L(8.0f), offsetY - gl.L(40.0f), width + totalPaddingLeft + gl.L(8.0f), height + offsetY + gl.L(40.0f), null);
            totalPaddingLeft = totalPaddingLeft;
        } else {
            f = 48.0f;
            f2 = 4.0f;
            bn3Var = bn3Var2;
            f3 = offsetY;
            canvas2 = canvas;
        }
        super.onDraw(canvas);
        if (z2) {
            int width2 = getLayout().getWidth();
            int height2 = getLayout().getHeight();
            LinearGradient linearGradient3 = bn3Var.r;
            ex1 ex1Var = bn3Var.b;
            int[] iArr = bn3Var.A;
            LinearGradient linearGradient4 = bn3Var.s;
            z3 = z;
            float f10 = bn3Var.B;
            Paint paint = bn3Var.q;
            LinearGradient linearGradient5 = bn3Var.t;
            Paint paint2 = bn3Var.p;
            chatActivityEnterView = chatActivityEnterView2;
            kra kraVar3 = bn3Var.c;
            if (!bn3Var.I) {
                bn3Var.I = true;
                kraVar = kraVar3;
                linearGradient = linearGradient3;
                if (bn3Var.D) {
                    bn3Var.e = SystemClock.uptimeMillis();
                }
                Runnable runnable = bn3Var.H;
                bn3Var.H = null;
                if (runnable != null) {
                    runnable.run();
                }
            } else {
                kraVar = kraVar3;
                linearGradient = linearGradient3;
            }
            float uptimeMillis = ((float) (SystemClock.uptimeMillis() - bn3Var.e)) / 1000.0f;
            float d = bn3Var.d(uptimeMillis);
            float d2 = bn3Var.d(uptimeMillis - bn3Var.F);
            float f11 = -gl.L(8.0f);
            float f12 = -gl.L(40.0f);
            float L = gl.L(8.0f) + width2;
            float L2 = gl.L(40.0f) + height2;
            canvas2.save();
            canvas2.translate(totalPaddingLeft, f3);
            if (bn3Var.C) {
                float d3 = bn3Var.d(uptimeMillis - 0.28f);
                f5 = totalPaddingLeft;
                f6 = L2;
                bn3Var.e(linearGradient5, d3, Math.max(d3 + 1.0f, bn3Var.d(uptimeMillis - 0.12f)));
                float f13 = uptimeMillis - (((float) bn3Var.a) / 1000.0f);
                if (f13 <= 0.0f) {
                    max = 255;
                } else {
                    max = (int) (Math.max(0.0f, 1.0f - (f13 / 0.18f)) * 255.0f);
                }
                paint.setAlpha(max);
            } else {
                f5 = totalPaddingLeft;
                f6 = L2;
                bn3Var.e(linearGradient5, d2 - gl.L(f), d2);
            }
            paint.setShader(linearGradient5);
            i2 = i;
            float f14 = f5;
            f4 = 1.0f;
            float f15 = f6;
            float f16 = f3;
            canvas.drawRect(f11, f12, L, f15, paint);
            if (bn3Var.C) {
                float f17 = bn3Var.E;
                bn3Var.e(linearGradient4, d - f17, f17 + d);
            } else {
                bn3Var.e(linearGradient4, d2 - f10, d2);
            }
            paint2.setShader(linearGradient4);
            canvas2 = canvas;
            canvas2.drawRect(f11, f12, L, f15, paint2);
            canvas2.restore();
            canvas2.restoreToCount(i3);
            ex1Var.getLocationInWindow(iArr);
            float f18 = bn3Var.y;
            float totalPaddingTop = (ex1Var.getTotalPaddingTop() + iArr[1]) - ex1Var.getScrollY();
            if (ug8.A(ex1Var)) {
                f7 = ex1Var.getOffsetY();
            } else {
                f7 = 0.0f;
            }
            bn3Var.z = f18 - (f7 + totalPaddingTop);
            canvas2.save();
            canvas2.translate(f14, f16 + bn3Var.z);
            if (bn3Var.h != null) {
                if (bn3Var.C) {
                    f9 = bn3Var.E;
                } else {
                    f9 = f10;
                }
                if (d - f9 < bn3Var.g) {
                    int saveLayer = canvas2.saveLayer(f11, bn3Var.w - gl.L(2.0f), Math.max(L, bn3Var.h.getWidth()), gl.L(2.0f) + bn3Var.w + bn3Var.x, null);
                    canvas2.drawBitmap(bn3Var.h, 0.0f, 0.0f, bn3Var.o);
                    if (bn3Var.C) {
                        float f19 = bn3Var.E;
                        linearGradient2 = linearGradient;
                        bn3Var.e(linearGradient2, d - f19, f19 + d);
                    } else {
                        linearGradient2 = linearGradient;
                        bn3Var.e(linearGradient2, d, d + f10);
                    }
                    paint2.setShader(linearGradient2);
                    canvas2.drawRect(f11, f12, Math.max(L, bn3Var.h.getWidth()), Math.max(f15, gl.L(40.0f) + bn3Var.h.getHeight()), paint2);
                    canvas2.restoreToCount(saveLayer);
                }
            }
            float f20 = gl.p;
            float max2 = Math.max(0.05f, ((float) (bn3Var.a - (SystemClock.uptimeMillis() - bn3Var.e))) / 1000.0f);
            while (true) {
                int i4 = bn3Var.m;
                if (i4 >= bn3Var.k) {
                    break;
                }
                float[] fArr = bn3Var.i;
                int i5 = i4 * 3;
                if (fArr[i5 + 2] > d) {
                    break;
                }
                bn3Var.m = i4 + 1;
                if (bn3Var.C) {
                    if (kraVar.d() >= 0.45f) {
                        float[] fArr2 = bn3Var.i;
                        kraVar2 = kraVar;
                        kraVar2.g(fArr2[i5], fArr2[i5 + 1], ((kraVar.d() * 60.0f) + 26.0f) * f20, (-((kraVar.d() * 44.0f) + 10.0f)) * f20, Math.min(max2, (kraVar.d() * 0.14f) + 0.12f), 0.0f);
                    }
                } else {
                    kraVar2 = kraVar;
                    kraVar2.g(fArr[i5], fArr[i5 + 1], ((kraVar2.d() * 34.0f) + 10.0f) * f20, (-((kraVar2.d() * 20.0f) + 6.0f)) * f20, Math.min(max2, (kraVar2.d() * 0.3f) + 0.26f), 0.0f);
                }
                kraVar = kraVar2;
            }
            kra kraVar4 = kraVar;
            while (true) {
                int i6 = bn3Var.n;
                if (i6 >= bn3Var.l) {
                    break;
                }
                float[] fArr3 = bn3Var.j;
                int i7 = i6 * 3;
                if (fArr3[i7 + 2] > d) {
                    break;
                }
                float f21 = fArr3[i7];
                int i8 = i7 + 1;
                float f22 = fArr3[i8] - bn3Var.z;
                bn3Var.n = i6 + 1;
                float scrollY = ex1Var.getScrollY();
                if (bn3Var.j[i8] >= scrollY - gl.L(2.0f) && bn3Var.j[i8] <= scrollY + bn3Var.x + gl.L(2.0f)) {
                    kraVar4.h((((kraVar4.d() * 16.0f) + 6.0f) * f20) + f21, ((kraVar4.d() - 0.5f) * 14.0f * f20) + f22, f21, f22, Math.min(max2, (kraVar4.d() * 0.08f) + bn3Var.F + 0.04f));
                }
            }
            kraVar4.b(canvas2, 1.0f);
            canvas2.restore();
            float f23 = uptimeMillis * 1000.0f;
            float f24 = (float) bn3Var.a;
            if (bn3Var.C) {
                f8 = 180.0f;
            } else {
                f8 = 0.0f;
            }
            if (f23 >= f24 + f8) {
                bn3Var.c();
            } else {
                ex1Var.invalidate();
            }
        } else {
            chatActivityEnterView = chatActivityEnterView2;
            z3 = z;
            i2 = i;
            f4 = 1.0f;
        }
        if (z3) {
            LinearGradient linearGradient6 = this.i2;
            Paint paint3 = this.h2;
            if (linearGradient6 == null) {
                LinearGradient linearGradient7 = new LinearGradient(0.0f, 0.0f, 0.0f, 1.0f, new int[]{-16777216, -1291845632, 0}, new float[]{0.0f, 0.45f, 1.0f}, Shader.TileMode.CLAMP);
                this.i2 = linearGradient7;
                paint3.setShader(linearGradient7);
                paint3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
            }
            float extendedPaddingTop = (getExtendedPaddingTop() + getScrollY()) - gl.L(2.0f);
            float lineHeight = getLineHeight() * 1.05f;
            Matrix matrix = this.j2;
            matrix.setScale(f4, lineHeight);
            matrix.postTranslate(0.0f, extendedPaddingTop);
            this.i2.setLocalMatrix(matrix);
            canvas2.drawRect(-gl.L(f2), getScrollY() - gl.L(f), gl.L(f2) + getWidth(), extendedPaddingTop + lineHeight, paint3);
            canvas2.restoreToCount(i2);
        }
        if (getLayout() != null && this.g2) {
            this.g2 = false;
            chatActivityEnterView.N(true);
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        boolean z;
        super.onMeasure(i, i2);
        ChatActivityEnterView chatActivityEnterView = this.n2;
        if (chatActivityEnterView.U != chatActivityEnterView.F0.getLineCount()) {
            boolean z2 = false;
            if (chatActivityEnterView.F0.getLineCount() > 2 && chatActivityEnterView.F0.getText() != null && !TextUtils.isEmpty(chatActivityEnterView.F0.getText().toString().trim())) {
                z = true;
            } else {
                z = false;
            }
            chatActivityEnterView.S1(z);
            if (chatActivityEnterView.F0.getLineCount() > 2 && chatActivityEnterView.F0.getText() != null && !TextUtils.isEmpty(chatActivityEnterView.F0.getText().toString().trim())) {
                z2 = true;
            }
            chatActivityEnterView.Y1(z2);
        }
    }

    @Override
    public final boolean onTextContextMenuItem(int i) {
        ClipData primaryClip;
        if (i == 16908322) {
            int i2 = ChatActivityEnterView.r7;
            ChatActivityEnterView chatActivityEnterView = this.n2;
            if (chatActivityEnterView.F0 != null) {
                try {
                    ClipboardManager clipboardManager = (ClipboardManager) chatActivityEnterView.getContext().getSystemService("clipboard");
                    if (clipboardManager == null) {
                        primaryClip = null;
                    } else {
                        primaryClip = clipboardManager.getPrimaryClip();
                    }
                    if (primaryClip != null && primaryClip.getItemCount() >= 1 && primaryClip.getDescription() != null && primaryClip.getDescription().hasMimeType("text/html")) {
                        String htmlText = primaryClip.getItemAt(0).getHtmlText();
                        if (!TextUtils.isEmpty(htmlText)) {
                            HashMap hashMap = new HashMap();
                            ArrayList z = ff9.z(htmlText, hashMap);
                            if (!z.isEmpty()) {
                                if (dg9.d(z, hashMap)) {
                                    na7.q1(chatActivityEnterView.R);
                                    boolean z2 = w01.a;
                                    int max = Math.max(0, chatActivityEnterView.F0.getSelectionStart());
                                    int min = Math.min(chatActivityEnterView.F0.getText().length(), chatActivityEnterView.F0.getSelectionEnd());
                                    chatActivityEnterView.k1(chatActivityEnterView.F0.getText().subSequence(0, Math.min(max, min)), chatActivityEnterView.F0.getText().subSequence(Math.max(max, min), chatActivityEnterView.F0.getText().length()), htmlText);
                                    return true;
                                }
                                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(dg9.f(z, false));
                                vu3.m(spannableStringBuilder, chatActivityEnterView.F0.getPaint().getFontMetricsInt(), false, null, 0);
                                gm[] gmVarArr = (gm[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), gm.class);
                                if (gmVarArr != null) {
                                    for (gm gmVar : gmVarArr) {
                                        gmVar.applyFontMetrics(chatActivityEnterView.F0.getPaint().getFontMetricsInt(), vl.f());
                                    }
                                }
                                int max2 = Math.max(0, chatActivityEnterView.F0.getSelectionStart());
                                int min2 = Math.min(chatActivityEnterView.F0.getText().length(), chatActivityEnterView.F0.getSelectionEnd());
                                dy8[] dy8VarArr = (dy8[]) chatActivityEnterView.F0.getText().getSpans(max2, min2, dy8.class);
                                if (dy8VarArr != null && dy8VarArr.length > 0) {
                                    dy8[] dy8VarArr2 = (dy8[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), dy8.class);
                                    for (int i3 = 0; i3 < dy8VarArr2.length; i3++) {
                                        spannableStringBuilder.removeSpan(dy8VarArr2[i3]);
                                        spannableStringBuilder.removeSpan(dy8VarArr2[i3].a);
                                    }
                                } else {
                                    ey8.a(spannableStringBuilder);
                                }
                                ex1 ex1Var = chatActivityEnterView.F0;
                                ex1Var.setText(ex1Var.getText().replace(max2, min2, spannableStringBuilder));
                                chatActivityEnterView.F0.setSelection(Math.min(max2 + spannableStringBuilder.length(), chatActivityEnterView.F0.getText().length()));
                                return true;
                            }
                        }
                    }
                } catch (Exception e) {
                    fa4.g(e, true);
                }
            }
        }
        return super.onTextContextMenuItem(i);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ChatActivityEnterView chatActivityEnterView = this.n2;
        if (chatActivityEnterView.z()) {
            if (motionEvent.getAction() == 0) {
                this.k2 = motionEvent.getX();
                this.l2 = motionEvent.getY();
                this.m2 = true;
            } else if (this.m2 && motionEvent.getAction() == 2) {
                if (Math.abs(motionEvent.getX() - this.k2) > gl.e || Math.abs(motionEvent.getY() - this.l2) > gl.e) {
                    this.m2 = false;
                }
            } else if (this.m2) {
                if (chatActivityEnterView.P3 != null) {
                    zkb.l(this, 36, bkb.lg, chatActivityEnterView.L4);
                    chatActivityEnterView.P3.K0();
                }
                ex1 ex1Var = chatActivityEnterView.F0;
                if (ex1Var != null && !gl.F3(ex1Var)) {
                    chatActivityEnterView.F0.clearFocus();
                    chatActivityEnterView.F0.requestFocus();
                }
            }
            return this.m2;
        }
        if (motionEvent.getAction() == 0 && chatActivityEnterView.P3 != null) {
            zkb.l(this, 36, bkb.lg, chatActivityEnterView.L4);
            chatActivityEnterView.P3.K0();
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override
    public final void setOffsetY(float f) {
        super.setOffsetY(f);
        this.n2.o2.invalidate();
    }
}
