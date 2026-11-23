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
public final class b0 extends View {
    public final bu f21981a;
    public final int f21982b;
    public boolean f21983c;
    public boolean d;
    public final ai.c1 f21984e;
    public final e0 f21985f;

    public b0(e0 e0Var, Context context, TL_keyboard.PageButton pageButton, int i7) {
        super(context);
        this.f21985f = e0Var;
        this.f21982b = i7;
        int i10 = e0Var.f22064n;
        int d = i5.c.d(32.0f, org.telegram.messenger.g0.f24046q.x, org.telegram.messenger.g0.L(240.0f));
        h6 h6Var = e0Var.f22065r;
        kg.i0 i0Var = new kg.i0(this, 27);
        fv fvVar = new fv(i10, d, h6Var);
        SpannableStringBuilder l10 = fvVar.l(pageButton.text, fv.R(16, 13));
        TL_keyboard.InlineButtonType inlineButtonType = pageButton.type;
        bu buVar = new bu(fvVar, d, l10, pageButton, inlineButtonType, pageButton.style, inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeDisabled, false, false, false, false, Boolean.FALSE, i0Var);
        this.f21981a = buVar;
        this.f21984e = new ai.c1(this, i7, 19);
        buVar.f23164e = buVar.h();
        setContentDescription(c6.l(pageButton.text));
        setClickable(true);
        setLongClickable(true);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f21981a.f23161a.i(this);
    }

    @Override
    public final void onDetachedFromWindow() {
        org.telegram.messenger.g0.r(this.f21984e);
        this.f21981a.f23161a.f(this);
        super.onDetachedFromWindow();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.save();
        int height = getHeight();
        bu buVar = this.f21981a;
        canvas.translate(0.0f, (height - buVar.c()) / 2.0f);
        buVar.a(canvas);
        canvas.restore();
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        bu buVar = this.f21981a;
        setMeasuredDimension(buVar.f23164e, org.telegram.messenger.g0.L(8.0f) + buVar.c());
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        e0 e0Var;
        c0 c0Var;
        a aVar;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        int actionMasked = motionEvent.getActionMasked();
        ai.c1 c1Var = this.f21984e;
        bu buVar = this.f21981a;
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked != 3) {
                        return super.onTouchEvent(motionEvent);
                    }
                    this.f21983c = false;
                    buVar.m(false);
                    org.telegram.messenger.g0.r(c1Var);
                    return true;
                } else if (motionEvent.getX() < 0.0f || motionEvent.getY() < 0.0f || motionEvent.getX() > getWidth() || motionEvent.getY() > getHeight()) {
                    this.f21983c = false;
                    buVar.m(false);
                    org.telegram.messenger.g0.r(c1Var);
                    return true;
                }
            } else {
                if (this.f21983c && !this.d) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.f21983c = false;
                buVar.m(false);
                org.telegram.messenger.g0.r(c1Var);
                if (z10 && (c0Var = (e0Var = this.f21985f).F) != null && (aVar = e0Var.f22531a) != null) {
                    t3 t3Var = ((l3) c0Var).f22224a;
                    TL_iv.PageBlock pageBlock = aVar.f21935b;
                    if (pageBlock instanceof TL_iv.pageBlockButtonRow) {
                        TL_iv.pageBlockButtonRow pageblockbuttonrow = (TL_iv.pageBlockButtonRow) pageBlock;
                        int i7 = this.f21982b;
                        if (i7 >= 0 && i7 < pageblockbuttonrow.buttons.size()) {
                            g2 g2Var = t3Var.R3;
                            if (g2Var != null) {
                                g2Var.d();
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
                            t3Var.f35789g3.O(false);
                            g2 g2Var2 = t3Var.R3;
                            if (g2Var2 != null) {
                                g2Var2.h();
                            }
                            t3Var.f22428p3.onContentChanged();
                        }
                    }
                }
            }
            return true;
        }
        this.f21983c = true;
        this.d = false;
        buVar.m(true);
        org.telegram.messenger.g0.h3(c1Var, ViewConfiguration.getLongPressTimeout());
        return true;
    }
}
