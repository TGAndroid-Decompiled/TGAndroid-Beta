package ki;

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
    public final RichMessageLayout.RichButton f15249a;
    public final int f15250b;
    public boolean f15251c;
    public boolean d;
    public final ah.g e;
    public final g0 f15252f;

    public d0(g0 g0Var, Context context, TL_keyboard.PageButton pageButton, int i10) {
        super(context);
        this.f15252f = g0Var;
        this.f15250b = i10;
        RichMessageLayout.RichButton createEditorPageButton = RichMessageLayout.createEditorPageButton(g0Var.f15329n, i2.o1.g(32.0f, AndroidUtilities.displaySize.x, AndroidUtilities.dp(240.0f)), g0Var.f15330r, pageButton, new u(this, 1));
        this.f15249a = createEditorPageButton;
        this.e = new ah.g(this, i10, 15);
        createEditorPageButton.width = createEditorPageButton.getPreferredWidth();
        setContentDescription(e6.l(pageButton.text));
        setClickable(true);
        setLongClickable(true);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f15249a.attach(this);
    }

    @Override
    public final void onDetachedFromWindow() {
        AndroidUtilities.cancelRunOnUIThread(this.e);
        this.f15249a.detach(this);
        super.onDetachedFromWindow();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.save();
        int height = getHeight();
        RichMessageLayout.RichButton richButton = this.f15249a;
        canvas.translate(0.0f, (height - richButton.getHeight()) / 2.0f);
        richButton.draw(canvas);
        canvas.restore();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        RichMessageLayout.RichButton richButton = this.f15249a;
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
        RichMessageLayout.RichButton richButton = this.f15249a;
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked != 3) {
                        return super.onTouchEvent(motionEvent);
                    }
                    this.f15251c = false;
                    richButton.setPressed(false);
                    AndroidUtilities.cancelRunOnUIThread(gVar);
                    return true;
                } else if (motionEvent.getX() < 0.0f || motionEvent.getY() < 0.0f || motionEvent.getX() > getWidth() || motionEvent.getY() > getHeight()) {
                    this.f15251c = false;
                    richButton.setPressed(false);
                    AndroidUtilities.cancelRunOnUIThread(gVar);
                    return true;
                }
            } else {
                if (this.f15251c && !this.d) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.f15251c = false;
                richButton.setPressed(false);
                AndroidUtilities.cancelRunOnUIThread(gVar);
                if (z10 && (e0Var = (g0Var = this.f15252f).E) != null && (aVar = g0Var.f15157a) != null) {
                    w3 w3Var = ((o3) e0Var).f15483a;
                    TL_iv.PageBlock pageBlock = aVar.f15141b;
                    if (pageBlock instanceof TL_iv.pageBlockButtonRow) {
                        TL_iv.pageBlockButtonRow pageblockbuttonrow = (TL_iv.pageBlockButtonRow) pageBlock;
                        int i10 = this.f15250b;
                        if (i10 >= 0 && i10 < pageblockbuttonrow.buttons.size()) {
                            h2 h2Var = w3Var.K3;
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
                            w3Var.Z2.N(false);
                            h2 h2Var2 = w3Var.K3;
                            if (h2Var2 != null) {
                                h2Var2.h();
                            }
                            w3Var.f15656i3.onContentChanged();
                        }
                    }
                }
            }
            return true;
        }
        this.f15251c = true;
        this.d = false;
        richButton.setPressed(true);
        AndroidUtilities.runOnUIThread(gVar, ViewConfiguration.getLongPressTimeout());
        return true;
    }
}
