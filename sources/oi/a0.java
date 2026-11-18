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
public final class a0 extends View {
    public final au f21927a;
    public final int f21928b;
    public boolean f21929c;
    public boolean d;
    public final ai.w0 f21930e;
    public final d0 f21931f;

    public a0(d0 d0Var, Context context, TL_keyboard.PageButton pageButton, int i7) {
        super(context);
        this.f21931f = d0Var;
        this.f21928b = i7;
        int i10 = d0Var.f21981n;
        int d = i5.c.d(32.0f, org.telegram.messenger.g0.f24121q.x, org.telegram.messenger.g0.L(240.0f));
        i6 i6Var = d0Var.f21982r;
        kg.j0 j0Var = new kg.j0(this, 27);
        ev evVar = new ev(i10, d, i6Var);
        SpannableStringBuilder l10 = evVar.l(pageButton.text, ev.R(16, 13));
        TL_keyboard.InlineButtonType inlineButtonType = pageButton.type;
        au auVar = new au(evVar, d, l10, pageButton, inlineButtonType, pageButton.style, inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeDisabled, false, false, false, false, Boolean.FALSE, j0Var);
        this.f21927a = auVar;
        this.f21930e = new ai.w0(this, i7, 19);
        auVar.f22952e = auVar.h();
        setContentDescription(b6.l(pageButton.text));
        setClickable(true);
        setLongClickable(true);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f21927a.f22949a.i(this);
    }

    @Override
    public final void onDetachedFromWindow() {
        org.telegram.messenger.g0.r(this.f21930e);
        this.f21927a.f22949a.f(this);
        super.onDetachedFromWindow();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.save();
        int height = getHeight();
        au auVar = this.f21927a;
        canvas.translate(0.0f, (height - auVar.c()) / 2.0f);
        auVar.a(canvas);
        canvas.restore();
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        au auVar = this.f21927a;
        setMeasuredDimension(auVar.f22952e, org.telegram.messenger.g0.L(8.0f) + auVar.c());
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
        ai.w0 w0Var = this.f21930e;
        au auVar = this.f21927a;
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked != 3) {
                        return super.onTouchEvent(motionEvent);
                    }
                    this.f21929c = false;
                    auVar.m(false);
                    org.telegram.messenger.g0.r(w0Var);
                    return true;
                } else if (motionEvent.getX() < 0.0f || motionEvent.getY() < 0.0f || motionEvent.getX() > getWidth() || motionEvent.getY() > getHeight()) {
                    this.f21929c = false;
                    auVar.m(false);
                    org.telegram.messenger.g0.r(w0Var);
                    return true;
                }
            } else {
                if (this.f21929c && !this.d) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.f21929c = false;
                auVar.m(false);
                org.telegram.messenger.g0.r(w0Var);
                if (z10 && (b0Var = (d0Var = this.f21931f).F) != null && (aVar = d0Var.f22442a) != null) {
                    s3 s3Var = ((k3) b0Var).f22137a;
                    TL_iv.PageBlock pageBlock = aVar.f21910b;
                    if (pageBlock instanceof TL_iv.pageBlockButtonRow) {
                        TL_iv.pageBlockButtonRow pageblockbuttonrow = (TL_iv.pageBlockButtonRow) pageBlock;
                        int i7 = this.f21928b;
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
                            s3Var.f34607g3.O(false);
                            e2 e2Var2 = s3Var.R3;
                            if (e2Var2 != null) {
                                e2Var2.h();
                            }
                            s3Var.f22337p3.onContentChanged();
                        }
                    }
                }
            }
            return true;
        }
        this.f21929c = true;
        this.d = false;
        auVar.m(true);
        org.telegram.messenger.g0.h3(w0Var, ViewConfiguration.getLongPressTimeout());
        return true;
    }
}
