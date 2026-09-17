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
    public final RichMessageLayout.RichButton f13851a;
    public final int f13852b;
    public boolean f13853c;
    public boolean d;
    public final ah.g f13854e;
    public final g0 f13855f;

    public d0(g0 g0Var, Context context, TL_keyboard.PageButton pageButton, int i10) {
        super(context);
        this.f13855f = g0Var;
        this.f13852b = i10;
        RichMessageLayout.RichButton createEditorPageButton = RichMessageLayout.createEditorPageButton(g0Var.f13909n, i2.g.f(32.0f, AndroidUtilities.displaySize.x, AndroidUtilities.dp(240.0f)), g0Var.f13910r, pageButton, new ig.t0(this, 8));
        this.f13851a = createEditorPageButton;
        this.f13854e = new ah.g(this, i10, 11);
        createEditorPageButton.width = createEditorPageButton.getPreferredWidth();
        setContentDescription(i6.l(pageButton.text));
        setClickable(true);
        setLongClickable(true);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f13851a.attach(this);
    }

    @Override
    public final void onDetachedFromWindow() {
        AndroidUtilities.cancelRunOnUIThread(this.f13854e);
        this.f13851a.detach(this);
        super.onDetachedFromWindow();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.save();
        int height = getHeight();
        RichMessageLayout.RichButton richButton = this.f13851a;
        canvas.translate(0.0f, (height - richButton.getHeight()) / 2.0f);
        richButton.draw(canvas);
        canvas.restore();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        RichMessageLayout.RichButton richButton = this.f13851a;
        setMeasuredDimension(richButton.width, AndroidUtilities.dp(8.0f) + richButton.getHeight());
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        g0 g0Var;
        e0 e0Var;
        a aVar;
        char c10;
        boolean z11;
        boolean z12;
        boolean z13;
        int actionMasked = motionEvent.getActionMasked();
        ah.g gVar = this.f13854e;
        RichMessageLayout.RichButton richButton = this.f13851a;
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked != 3) {
                        return super.onTouchEvent(motionEvent);
                    }
                    this.f13853c = false;
                    richButton.setPressed(false);
                    AndroidUtilities.cancelRunOnUIThread(gVar);
                    return true;
                } else if (motionEvent.getX() < 0.0f || motionEvent.getY() < 0.0f || motionEvent.getX() > getWidth() || motionEvent.getY() > getHeight()) {
                    this.f13853c = false;
                    richButton.setPressed(false);
                    AndroidUtilities.cancelRunOnUIThread(gVar);
                    return true;
                }
            } else {
                if (this.f13853c && !this.d) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.f13853c = false;
                richButton.setPressed(false);
                AndroidUtilities.cancelRunOnUIThread(gVar);
                if (z10 && (e0Var = (g0Var = this.f13855f).E) != null && (aVar = g0Var.f13749a) != null) {
                    v3 v3Var = ((n3) e0Var).f14078a;
                    TL_iv.PageBlock pageBlock = aVar.f13732b;
                    if (pageBlock instanceof TL_iv.pageBlockButtonRow) {
                        TL_iv.pageBlockButtonRow pageblockbuttonrow = (TL_iv.pageBlockButtonRow) pageBlock;
                        int i10 = this.f13852b;
                        if (i10 >= 0 && i10 < pageblockbuttonrow.buttons.size()) {
                            g2 g2Var = v3Var.J3;
                            if (g2Var != null) {
                                g2Var.d();
                            }
                            TL_keyboard.PageButton pageButton = pageblockbuttonrow.buttons.get(i10);
                            if (pageButton != null) {
                                TL_keyboard.RichButtonStyle richButtonStyle = pageButton.style;
                                if (richButtonStyle != null && richButtonStyle.bg_primary) {
                                    c10 = 2;
                                } else if (richButtonStyle != null && richButtonStyle.bg_danger) {
                                    c10 = 3;
                                } else if (richButtonStyle != null && richButtonStyle.bg_success) {
                                    c10 = 0;
                                } else {
                                    c10 = 1;
                                }
                                if (richButtonStyle == null) {
                                    richButtonStyle = new TL_keyboard.RichButtonStyle();
                                }
                                richButtonStyle.flags = 0;
                                if (c10 == 1) {
                                    z11 = true;
                                } else {
                                    z11 = false;
                                }
                                richButtonStyle.bg_primary = z11;
                                if (c10 == 2) {
                                    z12 = true;
                                } else {
                                    z12 = false;
                                }
                                richButtonStyle.bg_danger = z12;
                                if (c10 == 3) {
                                    z13 = true;
                                } else {
                                    z13 = false;
                                }
                                richButtonStyle.bg_success = z13;
                                richButtonStyle.link = false;
                                pageButton.style = richButtonStyle;
                            }
                            v3Var.Y2.N(false);
                            g2 g2Var2 = v3Var.J3;
                            if (g2Var2 != null) {
                                g2Var2.h();
                            }
                            v3Var.f14249h3.onContentChanged();
                        }
                    }
                }
            }
            return true;
        }
        this.f13853c = true;
        this.d = false;
        richButton.setPressed(true);
        AndroidUtilities.runOnUIThread(gVar, ViewConfiguration.getLongPressTimeout());
        return true;
    }
}
