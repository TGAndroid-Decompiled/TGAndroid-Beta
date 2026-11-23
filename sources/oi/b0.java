package oi;

import android.content.Context;
import android.graphics.Canvas;
import android.text.SpannableStringBuilder;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import org.telegram.messenger.au;
import org.telegram.messenger.ev;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.ActionBar.i6;
public final class b0 extends View {
    public final au f22047a;
    public final int f22048b;
    public boolean f22049c;
    public boolean d;
    public final ai.u0 f22050e;
    public final e0 f22051f;

    public b0(e0 e0Var, Context context, TL_keyboard.PageButton pageButton, int i7) {
        super(context);
        this.f22051f = e0Var;
        this.f22048b = i7;
        int i10 = e0Var.f22130n;
        int d = i5.c.d(32.0f, org.telegram.messenger.g0.f24226q.x, org.telegram.messenger.g0.L(240.0f));
        i6 i6Var = e0Var.f22131r;
        kg.i0 i0Var = new kg.i0(this, 27);
        ev evVar = new ev(i10, d, i6Var);
        SpannableStringBuilder l10 = evVar.l(pageButton.text, ev.R(16, 13));
        TL_keyboard.InlineButtonType inlineButtonType = pageButton.type;
        au auVar = new au(evVar, d, l10, pageButton, inlineButtonType, pageButton.style, inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeDisabled, false, false, false, false, Boolean.FALSE, i0Var);
        this.f22047a = auVar;
        this.f22050e = new ai.u0(this, i7, 21);
        auVar.f23060e = auVar.i();
        setContentDescription(c6.l(pageButton.text));
        setClickable(true);
        setLongClickable(true);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f22047a.a(this);
    }

    @Override
    public final void onDetachedFromWindow() {
        org.telegram.messenger.g0.r(this.f22050e);
        this.f22047a.f23057a.f(this);
        super.onDetachedFromWindow();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.save();
        int height = getHeight();
        au auVar = this.f22047a;
        canvas.translate(0.0f, (height - auVar.d()) / 2.0f);
        auVar.b(canvas);
        canvas.restore();
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        au auVar = this.f22047a;
        setMeasuredDimension(auVar.f23060e, org.telegram.messenger.g0.L(8.0f) + auVar.d());
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
        ai.u0 u0Var = this.f22050e;
        au auVar = this.f22047a;
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked != 3) {
                        return super.onTouchEvent(motionEvent);
                    }
                    this.f22049c = false;
                    auVar.n(false);
                    org.telegram.messenger.g0.r(u0Var);
                    return true;
                } else if (motionEvent.getX() < 0.0f || motionEvent.getY() < 0.0f || motionEvent.getX() > getWidth() || motionEvent.getY() > getHeight()) {
                    this.f22049c = false;
                    auVar.n(false);
                    org.telegram.messenger.g0.r(u0Var);
                    return true;
                }
            } else {
                if (this.f22049c && !this.d) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.f22049c = false;
                auVar.n(false);
                org.telegram.messenger.g0.r(u0Var);
                if (z10 && (c0Var = (e0Var = this.f22051f).F) != null && (aVar = e0Var.f22598a) != null) {
                    t3 t3Var = ((l3) c0Var).f22292a;
                    TL_iv.PageBlock pageBlock = aVar.f22001b;
                    if (pageBlock instanceof TL_iv.pageBlockButtonRow) {
                        TL_iv.pageBlockButtonRow pageblockbuttonrow = (TL_iv.pageBlockButtonRow) pageBlock;
                        int i7 = this.f22048b;
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
                            t3Var.f35323g3.O(false);
                            g2 g2Var2 = t3Var.R3;
                            if (g2Var2 != null) {
                                g2Var2.h();
                            }
                            t3Var.f22495p3.onContentChanged();
                        }
                    }
                }
            }
            return true;
        }
        this.f22049c = true;
        this.d = false;
        auVar.n(true);
        org.telegram.messenger.g0.h3(u0Var, ViewConfiguration.getLongPressTimeout());
        return true;
    }
}
