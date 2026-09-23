package ii;

import ai.o8;
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
    public final RichMessageLayout.RichButton f11302a;
    public final int f11303b;
    public boolean f11304c;
    public boolean d;
    public final o8 e;
    public final h0 f11305f;

    public e0(h0 h0Var, Context context, TL_keyboard.PageButton pageButton, int i10) {
        super(context);
        this.f11305f = h0Var;
        this.f11303b = i10;
        RichMessageLayout.RichButton createEditorPageButton = RichMessageLayout.createEditorPageButton(h0Var.f11391n, hg.c.f(32.0f, AndroidUtilities.displaySize.x, AndroidUtilities.dp(240.0f)), h0Var.f11392r, pageButton, new i2.h0(this, 3));
        this.f11302a = createEditorPageButton;
        this.e = new o8(this, i10, 10);
        createEditorPageButton.width = createEditorPageButton.getPreferredWidth();
        setContentDescription(g6.l(pageButton.text));
        setClickable(true);
        setLongClickable(true);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f11302a.attach(this);
    }

    @Override
    public final void onDetachedFromWindow() {
        AndroidUtilities.cancelRunOnUIThread(this.e);
        this.f11302a.detach(this);
        super.onDetachedFromWindow();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.save();
        int height = getHeight();
        RichMessageLayout.RichButton richButton = this.f11302a;
        canvas.translate(0.0f, (height - richButton.getHeight()) / 2.0f);
        richButton.draw(canvas);
        canvas.restore();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        RichMessageLayout.RichButton richButton = this.f11302a;
        setMeasuredDimension(richButton.width, AndroidUtilities.dp(8.0f) + richButton.getHeight());
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        h0 h0Var;
        f0 f0Var;
        a aVar;
        char c10;
        boolean z11;
        boolean z12;
        boolean z13;
        int actionMasked = motionEvent.getActionMasked();
        o8 o8Var = this.e;
        RichMessageLayout.RichButton richButton = this.f11302a;
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked != 3) {
                        return super.onTouchEvent(motionEvent);
                    }
                    this.f11304c = false;
                    richButton.setPressed(false);
                    AndroidUtilities.cancelRunOnUIThread(o8Var);
                    return true;
                } else if (motionEvent.getX() < 0.0f || motionEvent.getY() < 0.0f || motionEvent.getX() > getWidth() || motionEvent.getY() > getHeight()) {
                    this.f11304c = false;
                    richButton.setPressed(false);
                    AndroidUtilities.cancelRunOnUIThread(o8Var);
                    return true;
                }
            } else {
                if (this.f11304c && !this.d) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.f11304c = false;
                richButton.setPressed(false);
                AndroidUtilities.cancelRunOnUIThread(o8Var);
                if (z10 && (f0Var = (h0Var = this.f11305f).E) != null && (aVar = h0Var.f11207a) != null) {
                    x3 x3Var = ((p3) f0Var).f11548a;
                    TL_iv.PageBlock pageBlock = aVar.f11191b;
                    if (pageBlock instanceof TL_iv.pageBlockButtonRow) {
                        TL_iv.pageBlockButtonRow pageblockbuttonrow = (TL_iv.pageBlockButtonRow) pageBlock;
                        int i10 = this.f11303b;
                        if (i10 >= 0 && i10 < pageblockbuttonrow.buttons.size()) {
                            i2 i2Var = x3Var.J3;
                            if (i2Var != null) {
                                i2Var.d();
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
                            x3Var.Y2.N(false);
                            i2 i2Var2 = x3Var.J3;
                            if (i2Var2 != null) {
                                i2Var2.h();
                            }
                            x3Var.f11728h3.onContentChanged();
                        }
                    }
                }
            }
            return true;
        }
        this.f11304c = true;
        this.d = false;
        richButton.setPressed(true);
        AndroidUtilities.runOnUIThread(o8Var, ViewConfiguration.getLongPressTimeout());
        return true;
    }
}
