package ii;

import ai.n8;
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
    public final RichMessageLayout.RichButton f11350a;
    public final int f11351b;
    public boolean f11352c;
    public boolean d;
    public final n8 e;
    public final h0 f11353f;

    public e0(h0 h0Var, Context context, TL_keyboard.PageButton pageButton, int i10) {
        super(context);
        this.f11353f = h0Var;
        this.f11351b = i10;
        RichMessageLayout.RichButton createEditorPageButton = RichMessageLayout.createEditorPageButton(h0Var.f11402n, org.telegram.messenger.l0.b(32.0f, AndroidUtilities.displaySize.x, AndroidUtilities.dp(240.0f)), h0Var.f11403r, pageButton, new i2.g0(this, 3));
        this.f11350a = createEditorPageButton;
        this.e = new n8(this, i10, 10);
        createEditorPageButton.width = createEditorPageButton.getPreferredWidth();
        setContentDescription(f6.l(pageButton.text));
        setClickable(true);
        setLongClickable(true);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f11350a.attach(this);
    }

    @Override
    public final void onDetachedFromWindow() {
        AndroidUtilities.cancelRunOnUIThread(this.e);
        this.f11350a.detach(this);
        super.onDetachedFromWindow();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.save();
        int height = getHeight();
        RichMessageLayout.RichButton richButton = this.f11350a;
        canvas.translate(0.0f, (height - richButton.getHeight()) / 2.0f);
        richButton.draw(canvas);
        canvas.restore();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        RichMessageLayout.RichButton richButton = this.f11350a;
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
        n8 n8Var = this.e;
        RichMessageLayout.RichButton richButton = this.f11350a;
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked != 3) {
                        return super.onTouchEvent(motionEvent);
                    }
                    this.f11352c = false;
                    richButton.setPressed(false);
                    AndroidUtilities.cancelRunOnUIThread(n8Var);
                    return true;
                } else if (motionEvent.getX() < 0.0f || motionEvent.getY() < 0.0f || motionEvent.getX() > getWidth() || motionEvent.getY() > getHeight()) {
                    this.f11352c = false;
                    richButton.setPressed(false);
                    AndroidUtilities.cancelRunOnUIThread(n8Var);
                    return true;
                }
            } else {
                if (this.f11352c && !this.d) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.f11352c = false;
                richButton.setPressed(false);
                AndroidUtilities.cancelRunOnUIThread(n8Var);
                if (z10 && (f0Var = (h0Var = this.f11353f).E) != null && (aVar = h0Var.f11221a) != null) {
                    w3 w3Var = ((o3) f0Var).f11536a;
                    TL_iv.PageBlock pageBlock = aVar.f11205b;
                    if (pageBlock instanceof TL_iv.pageBlockButtonRow) {
                        TL_iv.pageBlockButtonRow pageblockbuttonrow = (TL_iv.pageBlockButtonRow) pageBlock;
                        int i10 = this.f11351b;
                        if (i10 >= 0 && i10 < pageblockbuttonrow.buttons.size()) {
                            h2 h2Var = w3Var.J3;
                            if (h2Var != null) {
                                h2Var.d();
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
                            w3Var.Y2.N(false);
                            h2 h2Var2 = w3Var.J3;
                            if (h2Var2 != null) {
                                h2Var2.h();
                            }
                            w3Var.f11715h3.onContentChanged();
                        }
                    }
                }
            }
            return true;
        }
        this.f11352c = true;
        this.d = false;
        richButton.setPressed(true);
        AndroidUtilities.runOnUIThread(n8Var, ViewConfiguration.getLongPressTimeout());
        return true;
    }
}
