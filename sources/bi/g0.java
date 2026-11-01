package bi;

import android.content.Context;
import android.graphics.Canvas;
import android.text.SpannableStringBuilder;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import org.telegram.messenger.su;
import org.telegram.messenger.wv;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
public final class g0 extends View {
    public final su f3023a;
    public final int f3024b;
    public boolean f3025c;
    public boolean d;
    public final ag.d3 e;
    public final j0 f3026f;

    public g0(j0 j0Var, Context context, TL_keyboard.PageButton pageButton, int i10) {
        super(context);
        this.f3026f = j0Var;
        this.f3024b = i10;
        int i11 = j0Var.f3107n;
        int d = i0.a.d(32.0f, org.telegram.messenger.i0.f16172q.x, org.telegram.messenger.i0.L(240.0f));
        org.telegram.ui.ActionBar.p6 p6Var = j0Var.f3108r;
        a3.d dVar = new a3.d(this, 20);
        wv wvVar = new wv(i11, d, p6Var);
        SpannableStringBuilder l4 = wvVar.l(pageButton.text, wv.R(16, 13));
        TL_keyboard.InlineButtonType inlineButtonType = pageButton.type;
        su suVar = new su(wvVar, d, l4, pageButton, inlineButtonType, pageButton.style, inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeDisabled, false, false, false, false, Boolean.FALSE, dVar);
        this.f3023a = suVar;
        this.e = new ag.d3(this, i10, 1);
        suVar.e = suVar.h();
        setContentDescription(s6.l(pageButton.text));
        setClickable(true);
        setLongClickable(true);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f3023a.f18144a.i(this);
    }

    @Override
    public final void onDetachedFromWindow() {
        org.telegram.messenger.i0.r(this.e);
        this.f3023a.f18144a.f(this);
        super.onDetachedFromWindow();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.save();
        int height = getHeight();
        su suVar = this.f3023a;
        canvas.translate(0.0f, (height - suVar.c()) / 2.0f);
        suVar.a(canvas);
        canvas.restore();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        su suVar = this.f3023a;
        setMeasuredDimension(suVar.e, org.telegram.messenger.i0.L(8.0f) + suVar.c());
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        j0 j0Var;
        h0 h0Var;
        a aVar;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        int actionMasked = motionEvent.getActionMasked();
        ag.d3 d3Var = this.e;
        su suVar = this.f3023a;
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked != 3) {
                        return super.onTouchEvent(motionEvent);
                    }
                    this.f3025c = false;
                    suVar.m(false);
                    org.telegram.messenger.i0.r(d3Var);
                    return true;
                } else if (motionEvent.getX() < 0.0f || motionEvent.getY() < 0.0f || motionEvent.getX() > getWidth() || motionEvent.getY() > getHeight()) {
                    this.f3025c = false;
                    suVar.m(false);
                    org.telegram.messenger.i0.r(d3Var);
                    return true;
                }
            } else {
                if (this.f3025c && !this.d) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.f3025c = false;
                suVar.m(false);
                org.telegram.messenger.i0.r(d3Var);
                if (z10 && (h0Var = (j0Var = this.f3026f).E) != null && (aVar = j0Var.f2881a) != null) {
                    d4 d4Var = ((v3) h0Var).f3410a;
                    TL_iv.PageBlock pageBlock = aVar.f2818b;
                    if (pageBlock instanceof TL_iv.pageBlockButtonRow) {
                        TL_iv.pageBlockButtonRow pageblockbuttonrow = (TL_iv.pageBlockButtonRow) pageBlock;
                        int i10 = this.f3024b;
                        if (i10 >= 0 && i10 < pageblockbuttonrow.buttons.size()) {
                            o2 o2Var = d4Var.Q3;
                            if (o2Var != null) {
                                o2Var.d();
                            }
                            TL_keyboard.PageButton pageButton = pageblockbuttonrow.buttons.get(i10);
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
                            d4Var.f31183f3.O(false);
                            o2 o2Var2 = d4Var.Q3;
                            if (o2Var2 != null) {
                                o2Var2.h();
                            }
                            d4Var.f2938o3.onContentChanged();
                        }
                    }
                }
            }
            return true;
        }
        this.f3025c = true;
        this.d = false;
        suVar.m(true);
        org.telegram.messenger.i0.h3(d3Var, ViewConfiguration.getLongPressTimeout());
        return true;
    }
}
