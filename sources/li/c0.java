package li;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.RichMessageLayout;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
public final class c0 extends View {
    public final RichMessageLayout.RichButton f17163a;
    public final int f17164b;
    public boolean f17165c;
    public boolean d;
    public final ag.r0 e;
    public final f0 f17166f;

    public c0(f0 f0Var, Context context, TL_keyboard.PageButton pageButton, int i10) {
        super(context);
        this.f17166f = f0Var;
        this.f17164b = i10;
        RichMessageLayout.RichButton createEditorPageButton = RichMessageLayout.createEditorPageButton(f0Var.f17219n, org.telegram.messenger.t.c(32.0f, AndroidUtilities.displaySize.x, AndroidUtilities.dp(240.0f)), f0Var.f17220r, pageButton, new k2.c(this, 5));
        this.f17163a = createEditorPageButton;
        this.e = new ag.r0(this, i10, 16);
        createEditorPageButton.width = createEditorPageButton.getPreferredWidth();
        setContentDescription(f6.l(pageButton.text));
        setClickable(true);
        setLongClickable(true);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f17163a.attach(this);
    }

    @Override
    public final void onDetachedFromWindow() {
        AndroidUtilities.cancelRunOnUIThread(this.e);
        this.f17163a.detach(this);
        super.onDetachedFromWindow();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.save();
        int height = getHeight();
        RichMessageLayout.RichButton richButton = this.f17163a;
        canvas.translate(0.0f, (height - richButton.getHeight()) / 2.0f);
        richButton.draw(canvas);
        canvas.restore();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        RichMessageLayout.RichButton richButton = this.f17163a;
        setMeasuredDimension(richButton.width, AndroidUtilities.dp(8.0f) + richButton.getHeight());
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
        ag.r0 r0Var = this.e;
        RichMessageLayout.RichButton richButton = this.f17163a;
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked != 3) {
                        return super.onTouchEvent(motionEvent);
                    }
                    this.f17165c = false;
                    richButton.setPressed(false);
                    AndroidUtilities.cancelRunOnUIThread(r0Var);
                    return true;
                } else if (motionEvent.getX() < 0.0f || motionEvent.getY() < 0.0f || motionEvent.getX() > getWidth() || motionEvent.getY() > getHeight()) {
                    this.f17165c = false;
                    richButton.setPressed(false);
                    AndroidUtilities.cancelRunOnUIThread(r0Var);
                    return true;
                }
            } else {
                if (this.f17165c && !this.d) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.f17165c = false;
                richButton.setPressed(false);
                AndroidUtilities.cancelRunOnUIThread(r0Var);
                if (z10 && (d0Var = (f0Var = this.f17166f).E) != null && (aVar = f0Var.f17652a) != null) {
                    v3 v3Var = ((n3) d0Var).f17379a;
                    TL_iv.PageBlock pageBlock = aVar.f17053b;
                    if (pageBlock instanceof TL_iv.pageBlockButtonRow) {
                        TL_iv.pageBlockButtonRow pageblockbuttonrow = (TL_iv.pageBlockButtonRow) pageBlock;
                        int i10 = this.f17164b;
                        if (i10 >= 0 && i10 < pageblockbuttonrow.buttons.size()) {
                            f2 f2Var = v3Var.R3;
                            if (f2Var != null) {
                                f2Var.d();
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
                            v3Var.f32504g3.O(false);
                            f2 f2Var2 = v3Var.R3;
                            if (f2Var2 != null) {
                                f2Var2.h();
                            }
                            v3Var.f17556p3.onContentChanged();
                        }
                    }
                }
            }
            return true;
        }
        this.f17165c = true;
        this.d = false;
        richButton.setPressed(true);
        AndroidUtilities.runOnUIThread(r0Var, ViewConfiguration.getLongPressTimeout());
        return true;
    }
}
