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
public final class sy1 extends tz1 {
    public boolean g2;
    public final Paint h2;
    public LinearGradient i2;
    public final Matrix j2;
    public float k2;
    public float l2;
    public boolean m2;
    public final ChatActivityEnterView n2;

    public sy1(ChatActivityEnterView chatActivityEnterView, Context context, ylb ylbVar) {
        super(chatActivityEnterView, context, ylbVar);
        this.n2 = chatActivityEnterView;
        this.g2 = true;
        this.h2 = new Paint();
        this.j2 = new Matrix();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ChatActivityEnterView chatActivityEnterView = this.n2;
        yv1 yv1Var = chatActivityEnterView.F3;
        View view = chatActivityEnterView.i6;
        if (view != null) {
            setWindowView(view);
        } else if (yv1Var != null && yv1Var.getParentLayout() != null && ((ActionBarLayout) yv1Var.getParentLayout()).b) {
            setWindowView(yv1Var.getParentLayout().getWindow().getDecorView());
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
        lo3 lo3Var;
        float f3;
        Canvas canvas2;
        ChatActivityEnterView chatActivityEnterView;
        boolean z3;
        int i2;
        float f4;
        lta ltaVar;
        LinearGradient linearGradient;
        float f5;
        float f6;
        float f7;
        float f8;
        lta ltaVar2;
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
            i = canvas.saveLayer(-gm.L(4.0f), getScrollY() - gm.L(48.0f), gm.L(4.0f) + getWidth(), gm.L(48.0f) + getHeight() + getScrollY(), null);
        } else {
            i = -1;
        }
        lo3 lo3Var2 = chatActivityEnterView2.n6;
        if (lo3Var2 == null || !lo3Var2.d) {
            un3 un3Var = chatActivityEnterView2.j1;
            if (un3Var != null) {
                lo3Var2 = un3Var.a;
            } else {
                lo3Var2 = null;
            }
        }
        if (lo3Var2 != null && lo3Var2.d && getLayout() != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        float totalPaddingLeft = getTotalPaddingLeft();
        float offsetY = getOffsetY() + getTotalPaddingTop();
        if (z2) {
            int width = getLayout().getWidth();
            int height = getLayout().getHeight();
            lo3Var2.getClass();
            f = 48.0f;
            f2 = 4.0f;
            f3 = offsetY;
            lo3Var = lo3Var2;
            canvas2 = canvas;
            i3 = canvas2.saveLayer(totalPaddingLeft - gm.L(8.0f), offsetY - gm.L(40.0f), width + totalPaddingLeft + gm.L(8.0f), height + offsetY + gm.L(40.0f), null);
            totalPaddingLeft = totalPaddingLeft;
        } else {
            f = 48.0f;
            f2 = 4.0f;
            lo3Var = lo3Var2;
            f3 = offsetY;
            canvas2 = canvas;
        }
        super.onDraw(canvas);
        if (z2) {
            int width2 = getLayout().getWidth();
            int height2 = getLayout().getHeight();
            LinearGradient linearGradient3 = lo3Var.r;
            sy1 sy1Var = lo3Var.b;
            int[] iArr = lo3Var.A;
            LinearGradient linearGradient4 = lo3Var.s;
            z3 = z;
            float f10 = lo3Var.B;
            Paint paint = lo3Var.q;
            LinearGradient linearGradient5 = lo3Var.t;
            Paint paint2 = lo3Var.p;
            chatActivityEnterView = chatActivityEnterView2;
            lta ltaVar3 = lo3Var.c;
            if (!lo3Var.I) {
                lo3Var.I = true;
                ltaVar = ltaVar3;
                linearGradient = linearGradient3;
                if (lo3Var.D) {
                    lo3Var.e = SystemClock.uptimeMillis();
                }
                Runnable runnable = lo3Var.H;
                lo3Var.H = null;
                if (runnable != null) {
                    runnable.run();
                }
            } else {
                ltaVar = ltaVar3;
                linearGradient = linearGradient3;
            }
            float uptimeMillis = ((float) (SystemClock.uptimeMillis() - lo3Var.e)) / 1000.0f;
            float d = lo3Var.d(uptimeMillis);
            float d2 = lo3Var.d(uptimeMillis - lo3Var.F);
            float f11 = -gm.L(8.0f);
            float f12 = -gm.L(40.0f);
            float L = gm.L(8.0f) + width2;
            float L2 = gm.L(40.0f) + height2;
            canvas2.save();
            canvas2.translate(totalPaddingLeft, f3);
            if (lo3Var.C) {
                float d3 = lo3Var.d(uptimeMillis - 0.28f);
                f5 = totalPaddingLeft;
                f6 = L2;
                lo3Var.e(linearGradient5, d3, Math.max(d3 + 1.0f, lo3Var.d(uptimeMillis - 0.12f)));
                float f13 = uptimeMillis - (((float) lo3Var.a) / 1000.0f);
                if (f13 <= 0.0f) {
                    max = 255;
                } else {
                    max = (int) (Math.max(0.0f, 1.0f - (f13 / 0.18f)) * 255.0f);
                }
                paint.setAlpha(max);
            } else {
                f5 = totalPaddingLeft;
                f6 = L2;
                lo3Var.e(linearGradient5, d2 - gm.L(f), d2);
            }
            paint.setShader(linearGradient5);
            i2 = i;
            float f14 = f5;
            f4 = 1.0f;
            float f15 = f6;
            float f16 = f3;
            canvas.drawRect(f11, f12, L, f15, paint);
            if (lo3Var.C) {
                float f17 = lo3Var.E;
                lo3Var.e(linearGradient4, d - f17, f17 + d);
            } else {
                lo3Var.e(linearGradient4, d2 - f10, d2);
            }
            paint2.setShader(linearGradient4);
            canvas2 = canvas;
            canvas2.drawRect(f11, f12, L, f15, paint2);
            canvas2.restore();
            canvas2.restoreToCount(i3);
            sy1Var.getLocationInWindow(iArr);
            float f18 = lo3Var.y;
            float totalPaddingTop = (sy1Var.getTotalPaddingTop() + iArr[1]) - sy1Var.getScrollY();
            if (wi8.A(sy1Var)) {
                f7 = sy1Var.getOffsetY();
            } else {
                f7 = 0.0f;
            }
            lo3Var.z = f18 - (f7 + totalPaddingTop);
            canvas2.save();
            canvas2.translate(f14, f16 + lo3Var.z);
            if (lo3Var.h != null) {
                if (lo3Var.C) {
                    f9 = lo3Var.E;
                } else {
                    f9 = f10;
                }
                if (d - f9 < lo3Var.g) {
                    int saveLayer = canvas2.saveLayer(f11, lo3Var.w - gm.L(2.0f), Math.max(L, lo3Var.h.getWidth()), gm.L(2.0f) + lo3Var.w + lo3Var.x, null);
                    canvas2.drawBitmap(lo3Var.h, 0.0f, 0.0f, lo3Var.o);
                    if (lo3Var.C) {
                        float f19 = lo3Var.E;
                        linearGradient2 = linearGradient;
                        lo3Var.e(linearGradient2, d - f19, f19 + d);
                    } else {
                        linearGradient2 = linearGradient;
                        lo3Var.e(linearGradient2, d, d + f10);
                    }
                    paint2.setShader(linearGradient2);
                    canvas2.drawRect(f11, f12, Math.max(L, lo3Var.h.getWidth()), Math.max(f15, gm.L(40.0f) + lo3Var.h.getHeight()), paint2);
                    canvas2.restoreToCount(saveLayer);
                }
            }
            float f20 = gm.p;
            float max2 = Math.max(0.05f, ((float) (lo3Var.a - (SystemClock.uptimeMillis() - lo3Var.e))) / 1000.0f);
            while (true) {
                int i4 = lo3Var.m;
                if (i4 >= lo3Var.k) {
                    break;
                }
                float[] fArr = lo3Var.i;
                int i5 = i4 * 3;
                if (fArr[i5 + 2] > d) {
                    break;
                }
                lo3Var.m = i4 + 1;
                if (lo3Var.C) {
                    if (ltaVar.d() >= 0.45f) {
                        float[] fArr2 = lo3Var.i;
                        ltaVar2 = ltaVar;
                        ltaVar2.g(fArr2[i5], fArr2[i5 + 1], ((ltaVar.d() * 60.0f) + 26.0f) * f20, (-((ltaVar.d() * 44.0f) + 10.0f)) * f20, Math.min(max2, (ltaVar.d() * 0.14f) + 0.12f), 0.0f);
                    }
                } else {
                    ltaVar2 = ltaVar;
                    ltaVar2.g(fArr[i5], fArr[i5 + 1], ((ltaVar2.d() * 34.0f) + 10.0f) * f20, (-((ltaVar2.d() * 20.0f) + 6.0f)) * f20, Math.min(max2, (ltaVar2.d() * 0.3f) + 0.26f), 0.0f);
                }
                ltaVar = ltaVar2;
            }
            lta ltaVar4 = ltaVar;
            while (true) {
                int i6 = lo3Var.n;
                if (i6 >= lo3Var.l) {
                    break;
                }
                float[] fArr3 = lo3Var.j;
                int i7 = i6 * 3;
                if (fArr3[i7 + 2] > d) {
                    break;
                }
                float f21 = fArr3[i7];
                int i8 = i7 + 1;
                float f22 = fArr3[i8] - lo3Var.z;
                lo3Var.n = i6 + 1;
                float scrollY = sy1Var.getScrollY();
                if (lo3Var.j[i8] >= scrollY - gm.L(2.0f) && lo3Var.j[i8] <= scrollY + lo3Var.x + gm.L(2.0f)) {
                    ltaVar4.h((((ltaVar4.d() * 16.0f) + 6.0f) * f20) + f21, ((ltaVar4.d() - 0.5f) * 14.0f * f20) + f22, f21, f22, Math.min(max2, (ltaVar4.d() * 0.08f) + lo3Var.F + 0.04f));
                }
            }
            ltaVar4.b(canvas2, 1.0f);
            canvas2.restore();
            float f23 = uptimeMillis * 1000.0f;
            float f24 = (float) lo3Var.a;
            if (lo3Var.C) {
                f8 = 180.0f;
            } else {
                f8 = 0.0f;
            }
            if (f23 >= f24 + f8) {
                lo3Var.c();
            } else {
                sy1Var.invalidate();
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
            float extendedPaddingTop = (getExtendedPaddingTop() + getScrollY()) - gm.L(2.0f);
            float lineHeight = getLineHeight() * 1.05f;
            Matrix matrix = this.j2;
            matrix.setScale(f4, lineHeight);
            matrix.postTranslate(0.0f, extendedPaddingTop);
            this.i2.setLocalMatrix(matrix);
            canvas2.drawRect(-gm.L(f2), getScrollY() - gm.L(f), gm.L(f2) + getWidth(), extendedPaddingTop + lineHeight, paint3);
            canvas2.restoreToCount(i2);
        }
        if (getLayout() != null && this.g2) {
            this.g2 = false;
            chatActivityEnterView.M(true);
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
            chatActivityEnterView.V1(z);
            if (chatActivityEnterView.F0.getLineCount() > 2 && chatActivityEnterView.F0.getText() != null && !TextUtils.isEmpty(chatActivityEnterView.F0.getText().toString().trim())) {
                z2 = true;
            }
            chatActivityEnterView.b2(z2);
        }
    }

    @Override
    public final boolean onTextContextMenuItem(int i) {
        ClipData primaryClip;
        if (i == 16908322) {
            int i2 = ChatActivityEnterView.z7;
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
                            ArrayList z = jh9.z(htmlText, hashMap);
                            if (!z.isEmpty()) {
                                if (hi9.d(z, hashMap)) {
                                    oc7.r1(chatActivityEnterView.R);
                                    boolean z2 = e21.a;
                                    int max = Math.max(0, chatActivityEnterView.F0.getSelectionStart());
                                    int min = Math.min(chatActivityEnterView.F0.getText().length(), chatActivityEnterView.F0.getSelectionEnd());
                                    chatActivityEnterView.m1(chatActivityEnterView.F0.getText().subSequence(0, Math.min(max, min)), chatActivityEnterView.F0.getText().subSequence(Math.max(max, min), chatActivityEnterView.F0.getText().length()), htmlText);
                                    return true;
                                }
                                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(hi9.f(z, false));
                                gw3.m(spannableStringBuilder, chatActivityEnterView.F0.getPaint().getFontMetricsInt(), false, null, 0);
                                gn[] gnVarArr = (gn[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), gn.class);
                                if (gnVarArr != null) {
                                    for (gn gnVar : gnVarArr) {
                                        gnVar.applyFontMetrics(chatActivityEnterView.F0.getPaint().getFontMetricsInt(), vm.f());
                                    }
                                }
                                int max2 = Math.max(0, chatActivityEnterView.F0.getSelectionStart());
                                int min2 = Math.min(chatActivityEnterView.F0.getText().length(), chatActivityEnterView.F0.getSelectionEnd());
                                e09[] e09VarArr = (e09[]) chatActivityEnterView.F0.getText().getSpans(max2, min2, e09.class);
                                if (e09VarArr != null && e09VarArr.length > 0) {
                                    e09[] e09VarArr2 = (e09[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), e09.class);
                                    for (int i3 = 0; i3 < e09VarArr2.length; i3++) {
                                        spannableStringBuilder.removeSpan(e09VarArr2[i3]);
                                        spannableStringBuilder.removeSpan(e09VarArr2[i3].a);
                                    }
                                } else {
                                    f09.a(spannableStringBuilder);
                                }
                                sy1 sy1Var = chatActivityEnterView.F0;
                                sy1Var.setText(sy1Var.getText().replace(max2, min2, spannableStringBuilder));
                                chatActivityEnterView.F0.setSelection(Math.min(max2 + spannableStringBuilder.length(), chatActivityEnterView.F0.getText().length()));
                                return true;
                            }
                        }
                    }
                } catch (Exception e) {
                    fc4.g(e, true);
                }
            }
        }
        return super.onTextContextMenuItem(i);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ChatActivityEnterView chatActivityEnterView = this.n2;
        if (chatActivityEnterView.y()) {
            if (motionEvent.getAction() == 0) {
                this.k2 = motionEvent.getX();
                this.l2 = motionEvent.getY();
                this.m2 = true;
            } else if (this.m2 && motionEvent.getAction() == 2) {
                if (Math.abs(motionEvent.getX() - this.k2) > gm.e || Math.abs(motionEvent.getY() - this.l2) > gm.e) {
                    this.m2 = false;
                }
            } else if (this.m2) {
                if (chatActivityEnterView.P3 != null) {
                    anb.l(this, 36, cmb.lg, chatActivityEnterView.L4);
                    chatActivityEnterView.P3.W0();
                }
                sy1 sy1Var = chatActivityEnterView.F0;
                if (sy1Var != null && !gm.E3(sy1Var)) {
                    chatActivityEnterView.F0.clearFocus();
                    chatActivityEnterView.F0.requestFocus();
                }
            }
            return this.m2;
        }
        if (motionEvent.getAction() == 0 && chatActivityEnterView.P3 != null) {
            anb.l(this, 36, cmb.lg, chatActivityEnterView.L4);
            chatActivityEnterView.P3.W0();
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override
    public final void setOffsetY(float f) {
        super.setOffsetY(f);
        this.n2.o2.invalidate();
    }
}
