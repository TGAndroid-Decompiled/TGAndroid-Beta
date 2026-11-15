package oi;

import android.content.Context;
import android.graphics.Canvas;
import android.text.SpannableStringBuilder;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import org.telegram.messenger.du;
import org.telegram.messenger.iv;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.ActionBar.e6;
public final class a0 extends View {
    public final du f21561a;
    public final int f21562b;
    public boolean f21563c;
    public boolean d;
    public final ai.w0 f21564e;
    public final d0 f21565f;

    public a0(d0 d0Var, Context context, TL_keyboard.PageButton pageButton, int i7) {
        super(context);
        this.f21565f = d0Var;
        this.f21562b = i7;
        int i10 = d0Var.f21626n;
        int d = i5.c.d(32.0f, org.telegram.messenger.g0.f23611q.x, org.telegram.messenger.g0.L(240.0f));
        e6 e6Var = d0Var.f21627r;
        kg.j1 j1Var = new kg.j1(this, 23);
        iv ivVar = new iv(i10, d, e6Var);
        SpannableStringBuilder l10 = ivVar.l(pageButton.text, iv.R(16, 13));
        TL_keyboard.InlineButtonType inlineButtonType = pageButton.type;
        du duVar = new du(ivVar, d, l10, pageButton, inlineButtonType, pageButton.style, inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeDisabled, false, false, false, false, Boolean.FALSE, j1Var);
        this.f21561a = duVar;
        this.f21564e = new ai.w0(this, i7, 16);
        duVar.f23144e = duVar.h();
        setContentDescription(a6.l(pageButton.text));
        setClickable(true);
        setLongClickable(true);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f21561a.f23141a.i(this);
    }

    @Override
    public final void onDetachedFromWindow() {
        org.telegram.messenger.g0.r(this.f21564e);
        this.f21561a.f23141a.f(this);
        super.onDetachedFromWindow();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.save();
        int height = getHeight();
        du duVar = this.f21561a;
        canvas.translate(0.0f, (height - duVar.c()) / 2.0f);
        duVar.a(canvas);
        canvas.restore();
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        du duVar = this.f21561a;
        setMeasuredDimension(duVar.f23144e, org.telegram.messenger.g0.L(8.0f) + duVar.c());
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        d0 d0Var;
        b0 b0Var;
        a aVar;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        int actionMasked = motionEvent.getActionMasked();
        ai.w0 w0Var = this.f21564e;
        du duVar = this.f21561a;
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked != 3) {
                        return super.onTouchEvent(motionEvent);
                    }
                    this.f21563c = false;
                    duVar.m(false);
                    org.telegram.messenger.g0.r(w0Var);
                    return true;
                } else if (motionEvent.getX() < 0.0f || motionEvent.getY() < 0.0f || motionEvent.getX() > getWidth() || motionEvent.getY() > getHeight()) {
                    this.f21563c = false;
                    duVar.m(false);
                    org.telegram.messenger.g0.r(w0Var);
                    return true;
                }
            } else {
                if (this.f21563c && !this.d) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.f21563c = false;
                duVar.m(false);
                org.telegram.messenger.g0.r(w0Var);
                if (z10 && (b0Var = (d0Var = this.f21565f).F) != null && (aVar = d0Var.f22106a) != null) {
                    q3 q3Var = ((i3) b0Var).f21739a;
                    TL_iv.PageBlock pageBlock = aVar.f21544b;
                    if (pageBlock instanceof TL_iv.pageBlockButtonRow) {
                        TL_iv.pageBlockButtonRow pageblockbuttonrow = (TL_iv.pageBlockButtonRow) pageBlock;
                        int i7 = this.f21562b;
                        if (i7 >= 0 && i7 < pageblockbuttonrow.buttons.size()) {
                            d2 d2Var = q3Var.R3;
                            if (d2Var != null) {
                                d2Var.d();
                            }
                            TL_keyboard.PageButton pageButton = pageblockbuttonrow.buttons.get(i7);
                            if (pageButton != null) {
                                TL_keyboard.RichButtonStyle richButtonStyle = pageButton.style;
                                if (richButtonStyle != null && richButtonStyle.bg_primary) {
                                    z11 = true;
                                } else if (richButtonStyle != null && richButtonStyle.bg_danger) {
                                    z11 = true;
                                } else if (richButtonStyle != null && richButtonStyle.bg_success) {
                                    z11 = false;
                                } else {
                                    z11 = true;
                                }
                                if (richButtonStyle == null) {
                                    richButtonStyle = new TL_keyboard.RichButtonStyle();
                                }
                                richButtonStyle.flags = 0;
                                if (z11) {
                                    z12 = true;
                                } else {
                                    z12 = false;
                                }
                                richButtonStyle.bg_primary = z12;
                                if (z11) {
                                    z13 = true;
                                } else {
                                    z13 = false;
                                }
                                richButtonStyle.bg_danger = z13;
                                if (z11) {
                                    z14 = true;
                                } else {
                                    z14 = false;
                                }
                                richButtonStyle.bg_success = z14;
                                richButtonStyle.link = false;
                                pageButton.style = richButtonStyle;
                            }
                            q3Var.f39892g3.O(false);
                            d2 d2Var2 = q3Var.R3;
                            if (d2Var2 != null) {
                                d2Var2.h();
                            }
                            q3Var.f21931p3.onContentChanged();
                        }
                    }
                }
            }
            return true;
        }
        this.f21563c = true;
        this.d = false;
        duVar.m(true);
        org.telegram.messenger.g0.i3(w0Var, ViewConfiguration.getLongPressTimeout());
        return true;
    }
}
