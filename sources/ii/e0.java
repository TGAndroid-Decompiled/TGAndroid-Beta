package ii;

import ai.p8;
import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.RichMessageLayout;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
public final class e0 extends View {
    public final RichMessageLayout.RichButton f12354a;
    public final int f12355b;
    public boolean f12356c;
    public boolean d;
    public final p8 f12357e;
    public final h0 f12358f;

    public e0(h0 h0Var, Context context, TL_keyboard.PageButton pageButton, int i10) {
        super(context);
        this.f12358f = h0Var;
        this.f12355b = i10;
        RichMessageLayout.RichButton createEditorPageButton = RichMessageLayout.createEditorPageButton(h0Var.f12449n, hg.c.f(32.0f, AndroidUtilities.displaySize.x, AndroidUtilities.dp(240.0f)), h0Var.f12450r, pageButton, new i2.h0(this, 3));
        this.f12354a = createEditorPageButton;
        this.f12357e = new p8(this, i10, 10);
        createEditorPageButton.width = createEditorPageButton.getPreferredWidth();
        setContentDescription(g6.l(pageButton.text));
        setClickable(true);
        setLongClickable(true);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f12354a.attach(this);
    }

    @Override
    public final void onDetachedFromWindow() {
        AndroidUtilities.cancelRunOnUIThread(this.f12357e);
        this.f12354a.detach(this);
        super.onDetachedFromWindow();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.save();
        int height = getHeight();
        RichMessageLayout.RichButton richButton = this.f12354a;
        canvas.translate(0.0f, (height - richButton.getHeight()) / 2.0f);
        richButton.draw(canvas);
        canvas.restore();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        RichMessageLayout.RichButton richButton = this.f12354a;
        setMeasuredDimension(richButton.width, AndroidUtilities.dp(8.0f) + richButton.getHeight());
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        h0 h0Var;
        f0 f0Var;
        a aVar;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        int actionMasked = motionEvent.getActionMasked();
        p8 p8Var = this.f12357e;
        RichMessageLayout.RichButton richButton = this.f12354a;
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked != 3) {
                        return super.onTouchEvent(motionEvent);
                    }
                    this.f12356c = false;
                    richButton.setPressed(false);
                    AndroidUtilities.cancelRunOnUIThread(p8Var);
                    return true;
                } else if (motionEvent.getX() < 0.0f || motionEvent.getY() < 0.0f || motionEvent.getX() > getWidth() || motionEvent.getY() > getHeight()) {
                    this.f12356c = false;
                    richButton.setPressed(false);
                    AndroidUtilities.cancelRunOnUIThread(p8Var);
                    return true;
                }
            } else {
                if (this.f12356c && !this.d) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.f12356c = false;
                richButton.setPressed(false);
                AndroidUtilities.cancelRunOnUIThread(p8Var);
                if (z10 && (f0Var = (h0Var = this.f12358f).E) != null && (aVar = h0Var.f12249a) != null) {
                    x3 x3Var = ((p3) f0Var).f12621a;
                    TL_iv.PageBlock pageBlock = aVar.f12232b;
                    if (pageBlock instanceof TL_iv.pageBlockButtonRow) {
                        TL_iv.pageBlockButtonRow pageblockbuttonrow = (TL_iv.pageBlockButtonRow) pageBlock;
                        int i10 = this.f12355b;
                        if (i10 >= 0 && i10 < pageblockbuttonrow.buttons.size()) {
                            i2 i2Var = x3Var.H3;
                            if (i2Var != null) {
                                i2Var.d();
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
                            i2 i2Var2 = x3Var.H3;
                            if (i2Var2 != null) {
                                i2Var2.h();
                            }
                            x3Var.f12807f3.onContentChanged();
                        }
                    }
                }
            }
            return true;
        }
        this.f12356c = true;
        this.d = false;
        richButton.setPressed(true);
        AndroidUtilities.runOnUIThread(p8Var, ViewConfiguration.getLongPressTimeout());
        return true;
    }
}
