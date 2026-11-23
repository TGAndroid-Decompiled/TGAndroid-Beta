package oi;

import android.content.Context;
import android.graphics.Canvas;
import android.text.SpannableStringBuilder;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import org.telegram.messenger.bu;
import org.telegram.messenger.fv;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.ActionBar.h6;
public final class a0 extends View {
    public final bu f21918a;
    public final int f21919b;
    public boolean f21920c;
    public boolean d;
    public final ai.t0 f21921e;
    public final d0 f21922f;

    public a0(d0 d0Var, Context context, TL_keyboard.PageButton pageButton, int i7) {
        super(context);
        this.f21922f = d0Var;
        this.f21919b = i7;
        int i10 = d0Var.f22007n;
        int d = i5.c.d(32.0f, org.telegram.messenger.g0.f24010q.x, org.telegram.messenger.g0.L(240.0f));
        h6 h6Var = d0Var.f22008r;
        kg.s0 s0Var = new kg.s0(this, 26);
        fv fvVar = new fv(i10, d, h6Var);
        SpannableStringBuilder l10 = fvVar.l(pageButton.text, fv.R(16, 13));
        TL_keyboard.InlineButtonType inlineButtonType = pageButton.type;
        bu buVar = new bu(fvVar, d, l10, pageButton, inlineButtonType, pageButton.style, inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeDisabled, false, false, false, false, Boolean.FALSE, s0Var);
        this.f21918a = buVar;
        this.f21921e = new ai.t0(this, i7, 21);
        buVar.f23128e = buVar.h();
        setContentDescription(b6.l(pageButton.text));
        setClickable(true);
        setLongClickable(true);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f21918a.f23125a.i(this);
    }

    @Override
    public final void onDetachedFromWindow() {
        org.telegram.messenger.g0.r(this.f21921e);
        this.f21918a.f23125a.f(this);
        super.onDetachedFromWindow();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.save();
        int height = getHeight();
        bu buVar = this.f21918a;
        canvas.translate(0.0f, (height - buVar.c()) / 2.0f);
        buVar.a(canvas);
        canvas.restore();
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        bu buVar = this.f21918a;
        setMeasuredDimension(buVar.f23128e, org.telegram.messenger.g0.L(8.0f) + buVar.c());
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
        ai.t0 t0Var = this.f21921e;
        bu buVar = this.f21918a;
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked != 3) {
                        return super.onTouchEvent(motionEvent);
                    }
                    this.f21920c = false;
                    buVar.m(false);
                    org.telegram.messenger.g0.r(t0Var);
                    return true;
                } else if (motionEvent.getX() < 0.0f || motionEvent.getY() < 0.0f || motionEvent.getX() > getWidth() || motionEvent.getY() > getHeight()) {
                    this.f21920c = false;
                    buVar.m(false);
                    org.telegram.messenger.g0.r(t0Var);
                    return true;
                }
            } else {
                if (this.f21920c && !this.d) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.f21920c = false;
                buVar.m(false);
                org.telegram.messenger.g0.r(t0Var);
                if (z10 && (b0Var = (d0Var = this.f21922f).F) != null && (aVar = d0Var.f22468a) != null) {
                    s3 s3Var = ((k3) b0Var).f22163a;
                    TL_iv.PageBlock pageBlock = aVar.f21901b;
                    if (pageBlock instanceof TL_iv.pageBlockButtonRow) {
                        TL_iv.pageBlockButtonRow pageblockbuttonrow = (TL_iv.pageBlockButtonRow) pageBlock;
                        int i7 = this.f21919b;
                        if (i7 >= 0 && i7 < pageblockbuttonrow.buttons.size()) {
                            e2 e2Var = s3Var.R3;
                            if (e2Var != null) {
                                e2Var.d();
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
                            s3Var.f35742g3.O(false);
                            e2 e2Var2 = s3Var.R3;
                            if (e2Var2 != null) {
                                e2Var2.h();
                            }
                            s3Var.f22365p3.onContentChanged();
                        }
                    }
                }
            }
            return true;
        }
        this.f21920c = true;
        this.d = false;
        buVar.m(true);
        org.telegram.messenger.g0.h3(t0Var, ViewConfiguration.getLongPressTimeout());
        return true;
    }
}
