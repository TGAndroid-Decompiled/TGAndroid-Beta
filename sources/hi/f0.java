package hi;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.RichMessageLayout;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
public final class f0 extends View {
    public final RichMessageLayout.RichButton f9559a;
    public final int f9560b;
    public boolean f9561c;
    public boolean d;
    public final bi.s e;
    public final i0 f9562f;

    public f0(i0 i0Var, Context context, TL_keyboard.PageButton pageButton, int i10) {
        super(context);
        this.f9562f = i0Var;
        this.f9560b = i10;
        RichMessageLayout.RichButton createEditorPageButton = RichMessageLayout.createEditorPageButton(i0Var.f9645n, hc.b.g(32.0f, AndroidUtilities.displaySize.x, AndroidUtilities.dp(240.0f)), i0Var.f9646r, pageButton, new gg.v1(this, 5));
        this.f9559a = createEditorPageButton;
        this.e = new bi.s(this, i10, 9);
        createEditorPageButton.width = createEditorPageButton.getPreferredWidth();
        setContentDescription(i6.l(pageButton.text));
        setClickable(true);
        setLongClickable(true);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f9559a.attach(this);
    }

    @Override
    public final void onDetachedFromWindow() {
        AndroidUtilities.cancelRunOnUIThread(this.e);
        this.f9559a.detach(this);
        super.onDetachedFromWindow();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.save();
        int height = getHeight();
        RichMessageLayout.RichButton richButton = this.f9559a;
        canvas.translate(0.0f, (height - richButton.getHeight()) / 2.0f);
        richButton.draw(canvas);
        canvas.restore();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        RichMessageLayout.RichButton richButton = this.f9559a;
        setMeasuredDimension(richButton.width, AndroidUtilities.dp(8.0f) + richButton.getHeight());
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        i0 i0Var;
        g0 g0Var;
        a aVar;
        char c10;
        boolean z11;
        boolean z12;
        boolean z13;
        int actionMasked = motionEvent.getActionMasked();
        bi.s sVar = this.e;
        RichMessageLayout.RichButton richButton = this.f9559a;
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked != 3) {
                        return super.onTouchEvent(motionEvent);
                    }
                    this.f9561c = false;
                    richButton.setPressed(false);
                    AndroidUtilities.cancelRunOnUIThread(sVar);
                    return true;
                } else if (motionEvent.getX() < 0.0f || motionEvent.getY() < 0.0f || motionEvent.getX() > getWidth() || motionEvent.getY() > getHeight()) {
                    this.f9561c = false;
                    richButton.setPressed(false);
                    AndroidUtilities.cancelRunOnUIThread(sVar);
                    return true;
                }
            } else {
                if (this.f9561c && !this.d) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.f9561c = false;
                richButton.setPressed(false);
                AndroidUtilities.cancelRunOnUIThread(sVar);
                if (z10 && (g0Var = (i0Var = this.f9562f).E) != null && (aVar = i0Var.f9464a) != null) {
                    z3 z3Var = ((r3) g0Var).f9821a;
                    TL_iv.PageBlock pageBlock = aVar.f9421b;
                    if (pageBlock instanceof TL_iv.pageBlockButtonRow) {
                        TL_iv.pageBlockButtonRow pageblockbuttonrow = (TL_iv.pageBlockButtonRow) pageBlock;
                        int i10 = this.f9560b;
                        if (i10 >= 0 && i10 < pageblockbuttonrow.buttons.size()) {
                            k2 k2Var = z3Var.J3;
                            if (k2Var != null) {
                                k2Var.d();
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
                            z3Var.Y2.N(false);
                            k2 k2Var2 = z3Var.J3;
                            if (k2Var2 != null) {
                                k2Var2.h();
                            }
                            z3Var.f10001h3.onContentChanged();
                        }
                    }
                }
            }
            return true;
        }
        this.f9561c = true;
        this.d = false;
        richButton.setPressed(true);
        AndroidUtilities.runOnUIThread(sVar, ViewConfiguration.getLongPressTimeout());
        return true;
    }
}
