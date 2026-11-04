package mi;

import android.content.Context;
import android.graphics.Canvas;
import android.text.SpannableStringBuilder;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import org.telegram.messenger.cv;
import org.telegram.messenger.yt;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
public final class c0 extends View {
    public final yt f19500a;
    public final int f19501b;
    public boolean f19502c;
    public boolean d;
    public final cg.l0 f19503e;
    public final f0 f19504f;

    public c0(f0 f0Var, Context context, TL_keyboard.PageButton pageButton, int i3) {
        super(context);
        this.f19504f = f0Var;
        this.f19501b = i3;
        int i10 = f0Var.f19590n;
        int d = k2.p1.d(32.0f, org.telegram.messenger.g0.f22608q.x, org.telegram.messenger.g0.L(240.0f));
        org.telegram.ui.ActionBar.e6 e6Var = f0Var.f19591r;
        lg.n nVar = new lg.n(this, 12);
        cv cvVar = new cv(i10, d, e6Var);
        SpannableStringBuilder l10 = cvVar.l(pageButton.text, cv.R(16, 13));
        TL_keyboard.InlineButtonType inlineButtonType = pageButton.type;
        yt ytVar = new yt(cvVar, d, l10, pageButton, inlineButtonType, pageButton.style, inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeDisabled, false, false, false, false, Boolean.FALSE, nVar);
        this.f19500a = ytVar;
        this.f19503e = new cg.l0(this, i3, 15);
        ytVar.f26636e = ytVar.h();
        setContentDescription(d6.l(pageButton.text));
        setClickable(true);
        setLongClickable(true);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f19500a.f26633a.i(this);
    }

    @Override
    public final void onDetachedFromWindow() {
        org.telegram.messenger.g0.r(this.f19503e);
        this.f19500a.f26633a.f(this);
        super.onDetachedFromWindow();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.save();
        int height = getHeight();
        yt ytVar = this.f19500a;
        canvas.translate(0.0f, (height - ytVar.c()) / 2.0f);
        ytVar.a(canvas);
        canvas.restore();
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        yt ytVar = this.f19500a;
        setMeasuredDimension(ytVar.f26636e, org.telegram.messenger.g0.L(8.0f) + ytVar.c());
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        f0 f0Var;
        d0 d0Var;
        a aVar;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        int actionMasked = motionEvent.getActionMasked();
        cg.l0 l0Var = this.f19503e;
        yt ytVar = this.f19500a;
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked != 3) {
                        return super.onTouchEvent(motionEvent);
                    }
                    this.f19502c = false;
                    ytVar.m(false);
                    org.telegram.messenger.g0.r(l0Var);
                    return true;
                } else if (motionEvent.getX() < 0.0f || motionEvent.getY() < 0.0f || motionEvent.getX() > getWidth() || motionEvent.getY() > getHeight()) {
                    this.f19502c = false;
                    ytVar.m(false);
                    org.telegram.messenger.g0.r(l0Var);
                    return true;
                }
            } else {
                if (this.f19502c && !this.d) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.f19502c = false;
                ytVar.m(false);
                org.telegram.messenger.g0.r(l0Var);
                if (z10 && (d0Var = (f0Var = this.f19504f).F) != null && (aVar = f0Var.f20029a) != null) {
                    t3 t3Var = ((l3) d0Var).f19735a;
                    TL_iv.PageBlock pageBlock = aVar.f19431b;
                    if (pageBlock instanceof TL_iv.pageBlockButtonRow) {
                        TL_iv.pageBlockButtonRow pageblockbuttonrow = (TL_iv.pageBlockButtonRow) pageBlock;
                        int i3 = this.f19501b;
                        if (i3 >= 0 && i3 < pageblockbuttonrow.buttons.size()) {
                            g2 g2Var = t3Var.R3;
                            if (g2Var != null) {
                                g2Var.d();
                            }
                            TL_keyboard.PageButton pageButton = pageblockbuttonrow.buttons.get(i3);
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
                            t3Var.f35594g3.O(false);
                            g2 g2Var2 = t3Var.R3;
                            if (g2Var2 != null) {
                                g2Var2.h();
                            }
                            t3Var.f19916p3.onContentChanged();
                        }
                    }
                }
            }
            return true;
        }
        this.f19502c = true;
        this.d = false;
        ytVar.m(true);
        org.telegram.messenger.g0.i3(l0Var, ViewConfiguration.getLongPressTimeout());
        return true;
    }
}
