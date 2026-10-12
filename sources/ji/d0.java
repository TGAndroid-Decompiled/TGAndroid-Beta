package ji;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.RichMessageLayout;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
public final class d0 extends View {
    public final RichMessageLayout.RichButton f13191a;
    public final int f13192b;
    public boolean f13193c;
    public boolean d;
    public final ah.g e;
    public final g0 f13194f;

    public d0(g0 g0Var, Context context, TL_keyboard.PageButton pageButton, int i10) {
        super(context);
        this.f13194f = g0Var;
        this.f13192b = i10;
        RichMessageLayout.RichButton createEditorPageButton = RichMessageLayout.createEditorPageButton(g0Var.f13272n, org.telegram.messenger.q.c(32.0f, AndroidUtilities.displaySize.x, AndroidUtilities.dp(240.0f)), g0Var.f13273r, pageButton, new ig.t0(this, 8));
        this.f13191a = createEditorPageButton;
        this.e = new ah.g(this, i10, 12);
        createEditorPageButton.width = createEditorPageButton.getPreferredWidth();
        setContentDescription(k6.l(pageButton.text));
        setClickable(true);
        setLongClickable(true);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f13191a.attach(this);
    }

    @Override
    public final void onDetachedFromWindow() {
        AndroidUtilities.cancelRunOnUIThread(this.e);
        this.f13191a.detach(this);
        super.onDetachedFromWindow();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.save();
        int height = getHeight();
        RichMessageLayout.RichButton richButton = this.f13191a;
        canvas.translate(0.0f, (height - richButton.getHeight()) / 2.0f);
        richButton.draw(canvas);
        canvas.restore();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        RichMessageLayout.RichButton richButton = this.f13191a;
        setMeasuredDimension(richButton.width, AndroidUtilities.dp(8.0f) + richButton.getHeight());
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        g0 g0Var;
        e0 e0Var;
        a aVar;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        int actionMasked = motionEvent.getActionMasked();
        ah.g gVar = this.e;
        RichMessageLayout.RichButton richButton = this.f13191a;
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked != 3) {
                        return super.onTouchEvent(motionEvent);
                    }
                    this.f13193c = false;
                    richButton.setPressed(false);
                    AndroidUtilities.cancelRunOnUIThread(gVar);
                    return true;
                } else if (motionEvent.getX() < 0.0f || motionEvent.getY() < 0.0f || motionEvent.getX() > getWidth() || motionEvent.getY() > getHeight()) {
                    this.f13193c = false;
                    richButton.setPressed(false);
                    AndroidUtilities.cancelRunOnUIThread(gVar);
                    return true;
                }
            } else {
                if (this.f13193c && !this.d) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.f13193c = false;
                richButton.setPressed(false);
                AndroidUtilities.cancelRunOnUIThread(gVar);
                if (z10 && (e0Var = (g0Var = this.f13194f).E) != null && (aVar = g0Var.f13119a) != null) {
                    x3 x3Var = ((p3) e0Var).f13464a;
                    TL_iv.PageBlock pageBlock = aVar.f13103b;
                    if (pageBlock instanceof TL_iv.pageBlockButtonRow) {
                        TL_iv.pageBlockButtonRow pageblockbuttonrow = (TL_iv.pageBlockButtonRow) pageBlock;
                        int i10 = this.f13192b;
                        if (i10 >= 0 && i10 < pageblockbuttonrow.buttons.size()) {
                            h2 h2Var = x3Var.H3;
                            if (h2Var != null) {
                                h2Var.d();
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
                            x3Var.W2.N(false);
                            h2 h2Var2 = x3Var.H3;
                            if (h2Var2 != null) {
                                h2Var2.h();
                            }
                            x3Var.f13627f3.onContentChanged();
                        }
                    }
                }
            }
            return true;
        }
        this.f13193c = true;
        this.d = false;
        richButton.setPressed(true);
        AndroidUtilities.runOnUIThread(gVar, ViewConfiguration.getLongPressTimeout());
        return true;
    }
}
