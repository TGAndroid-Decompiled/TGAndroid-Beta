package li;

import android.content.Context;
import android.graphics.Canvas;
import android.text.SpannableStringBuilder;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import org.telegram.messenger.gu;
import org.telegram.messenger.kv;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.ActionBar.f6;
public final class c0 extends View {
    public final gu f18491a;
    public final int f18492b;
    public boolean f18493c;
    public boolean d;
    public final bg.m0 f18494e;
    public final f0 f18495f;

    public c0(f0 f0Var, Context context, TL_keyboard.PageButton pageButton, int i7) {
        super(context);
        this.f18495f = f0Var;
        this.f18492b = i7;
        int i10 = f0Var.f18549n;
        int e10 = jg.g.e(32.0f, org.telegram.messenger.g0.f22537q.x, org.telegram.messenger.g0.L(240.0f));
        f6 f6Var = f0Var.f18550r;
        l2.w wVar = new l2.w(this, 5);
        kv kvVar = new kv(i10, e10, f6Var);
        SpannableStringBuilder l10 = kvVar.l(pageButton.text, kv.R(16, 13));
        TL_keyboard.InlineButtonType inlineButtonType = pageButton.type;
        gu guVar = new gu(kvVar, e10, l10, pageButton, inlineButtonType, pageButton.style, inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeDisabled, false, false, false, false, Boolean.FALSE, wVar);
        this.f18491a = guVar;
        this.f18494e = new bg.m0(this, i7, 14);
        guVar.f22701e = guVar.h();
        setContentDescription(c6.l(pageButton.text));
        setClickable(true);
        setLongClickable(true);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f18491a.f22698a.i(this);
    }

    @Override
    public final void onDetachedFromWindow() {
        org.telegram.messenger.g0.r(this.f18494e);
        this.f18491a.f22698a.f(this);
        super.onDetachedFromWindow();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.save();
        int height = getHeight();
        gu guVar = this.f18491a;
        canvas.translate(0.0f, (height - guVar.c()) / 2.0f);
        guVar.a(canvas);
        canvas.restore();
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        gu guVar = this.f18491a;
        setMeasuredDimension(guVar.f22701e, org.telegram.messenger.g0.L(8.0f) + guVar.c());
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z9;
        f0 f0Var;
        d0 d0Var;
        a aVar;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        int actionMasked = motionEvent.getActionMasked();
        bg.m0 m0Var = this.f18494e;
        gu guVar = this.f18491a;
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked != 3) {
                        return super.onTouchEvent(motionEvent);
                    }
                    this.f18493c = false;
                    guVar.m(false);
                    org.telegram.messenger.g0.r(m0Var);
                    return true;
                } else if (motionEvent.getX() < 0.0f || motionEvent.getY() < 0.0f || motionEvent.getX() > getWidth() || motionEvent.getY() > getHeight()) {
                    this.f18493c = false;
                    guVar.m(false);
                    org.telegram.messenger.g0.r(m0Var);
                    return true;
                }
            } else {
                if (this.f18493c && !this.d) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                this.f18493c = false;
                guVar.m(false);
                org.telegram.messenger.g0.r(m0Var);
                if (z9 && (d0Var = (f0Var = this.f18495f).E) != null && (aVar = f0Var.f18986a) != null) {
                    t3 t3Var = ((l3) d0Var).f18686a;
                    TL_iv.PageBlock pageBlock = aVar.f18389b;
                    if (pageBlock instanceof TL_iv.pageBlockButtonRow) {
                        TL_iv.pageBlockButtonRow pageblockbuttonrow = (TL_iv.pageBlockButtonRow) pageBlock;
                        int i7 = this.f18492b;
                        if (i7 >= 0 && i7 < pageblockbuttonrow.buttons.size()) {
                            f2 f2Var = t3Var.Q3;
                            if (f2Var != null) {
                                f2Var.d();
                            }
                            TL_keyboard.PageButton pageButton = pageblockbuttonrow.buttons.get(i7);
                            if (pageButton != null) {
                                TL_keyboard.RichButtonStyle richButtonStyle = pageButton.style;
                                if (richButtonStyle != null && richButtonStyle.bg_primary) {
                                    z10 = true;
                                } else if (richButtonStyle != null && richButtonStyle.bg_danger) {
                                    z10 = true;
                                } else if (richButtonStyle != null && richButtonStyle.bg_success) {
                                    z10 = false;
                                } else {
                                    z10 = true;
                                }
                                if (richButtonStyle == null) {
                                    richButtonStyle = new TL_keyboard.RichButtonStyle();
                                }
                                richButtonStyle.flags = 0;
                                if (z10) {
                                    z11 = true;
                                } else {
                                    z11 = false;
                                }
                                richButtonStyle.bg_primary = z11;
                                if (z10) {
                                    z12 = true;
                                } else {
                                    z12 = false;
                                }
                                richButtonStyle.bg_danger = z12;
                                if (z10) {
                                    z13 = true;
                                } else {
                                    z13 = false;
                                }
                                richButtonStyle.bg_success = z13;
                                richButtonStyle.link = false;
                                pageButton.style = richButtonStyle;
                            }
                            t3Var.f36781f3.O(false);
                            f2 f2Var2 = t3Var.Q3;
                            if (f2Var2 != null) {
                                f2Var2.h();
                            }
                            t3Var.f18887o3.onContentChanged();
                        }
                    }
                }
            }
            return true;
        }
        this.f18493c = true;
        this.d = false;
        guVar.m(true);
        org.telegram.messenger.g0.i3(m0Var, ViewConfiguration.getLongPressTimeout());
        return true;
    }
}
