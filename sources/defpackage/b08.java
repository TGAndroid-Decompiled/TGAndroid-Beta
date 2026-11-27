package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.text.StaticLayout;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class b08 extends FrameLayout {
    public final byte a;
    public Object b;
    public float c;
    public final KeyEvent.Callback d;

    public b08(ky8 ky8Var, Context context, d41 d41Var) {
        super(context);
        this.a = (byte) 3;
        this.d = ky8Var;
        this.b = d41Var;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        byte b = this.a;
        KeyEvent.Callback callback = this.d;
        switch (b) {
            case 0:
                if (((StaticLayout) this.b) != null) {
                    canvas.save();
                    canvas.translate(hl.L(21.0f) + this.c, ((EditTextBoldCursor) callback).getLineY() + hl.L(3.0f));
                    ((StaticLayout) this.b).draw(canvas);
                    canvas.restore();
                    return;
                }
                return;
            case 1:
                if (((StaticLayout) this.b) != null) {
                    canvas.save();
                    canvas.translate(hl.L(21.0f) + this.c, ((EditTextBoldCursor) callback).getLineY() + hl.L(3.0f));
                    ((StaticLayout) this.b).draw(canvas);
                    canvas.restore();
                    return;
                }
                return;
            case 2:
                if (((StaticLayout) this.b) != null) {
                    canvas.save();
                    canvas.translate(hl.L(21.0f) + this.c, ((EditTextBoldCursor) callback).getLineY() + hl.L(3.0f));
                    ((StaticLayout) this.b).draw(canvas);
                    canvas.restore();
                    return;
                }
                return;
            default:
                super.onDraw(canvas);
                return;
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        ky8 ky8Var;
        byte b = this.a;
        int i3 = 0;
        KeyEvent.Callback callback = this.d;
        switch (b) {
            case 0:
                int size = View.MeasureSpec.getSize(i) - hl.L(34.0f);
                StaticLayout p = ((EditTextBoldCursor) callback).p(size);
                this.b = p;
                if (p != null) {
                    int lineCount = p.getLineCount();
                    if (lineCount > 1) {
                        i2 = View.MeasureSpec.makeMeasureSpec((((StaticLayout) this.b).getLineBottom(lineCount - 1) - ((StaticLayout) this.b).getLineBottom(0)) + hl.L(64.0f), 1073741824);
                    }
                    if (ob6.a0) {
                        float f = 0.0f;
                        while (true) {
                            if (i3 < lineCount) {
                                if (((StaticLayout) this.b).getLineLeft(i3) != 0.0f) {
                                    this.c = 0.0f;
                                } else {
                                    f = Math.max(f, ((StaticLayout) this.b).getLineWidth(i3));
                                    if (i3 == lineCount - 1) {
                                        this.c = size - f;
                                    }
                                    i3++;
                                }
                            }
                        }
                    }
                }
                super.onMeasure(i, i2);
                return;
            case 1:
                int size2 = View.MeasureSpec.getSize(i) - hl.L(34.0f);
                StaticLayout p2 = ((EditTextBoldCursor) callback).p(size2);
                this.b = p2;
                if (p2 != null) {
                    int lineCount2 = p2.getLineCount();
                    if (lineCount2 > 1) {
                        i2 = View.MeasureSpec.makeMeasureSpec((((StaticLayout) this.b).getLineBottom(lineCount2 - 1) - ((StaticLayout) this.b).getLineBottom(0)) + hl.L(64.0f), 1073741824);
                    }
                    if (ob6.a0) {
                        float f2 = 0.0f;
                        while (true) {
                            if (i3 < lineCount2) {
                                if (((StaticLayout) this.b).getLineLeft(i3) != 0.0f) {
                                    this.c = 0.0f;
                                } else {
                                    f2 = Math.max(f2, ((StaticLayout) this.b).getLineWidth(i3));
                                    if (i3 == lineCount2 - 1) {
                                        this.c = size2 - f2;
                                    }
                                    i3++;
                                }
                            }
                        }
                    }
                }
                super.onMeasure(i, i2);
                return;
            case 2:
                int size3 = View.MeasureSpec.getSize(i) - hl.L(34.0f);
                StaticLayout p3 = ((EditTextBoldCursor) callback).p(size3);
                this.b = p3;
                if (p3 != null) {
                    int lineCount3 = p3.getLineCount();
                    if (lineCount3 > 1) {
                        i2 = View.MeasureSpec.makeMeasureSpec((((StaticLayout) this.b).getLineBottom(lineCount3 - 1) - ((StaticLayout) this.b).getLineBottom(0)) + hl.L(64.0f), 1073741824);
                    }
                    if (ob6.a0) {
                        float f3 = 0.0f;
                        while (true) {
                            if (i3 < lineCount3) {
                                if (((StaticLayout) this.b).getLineLeft(i3) != 0.0f) {
                                    this.c = 0.0f;
                                } else {
                                    f3 = Math.max(f3, ((StaticLayout) this.b).getLineWidth(i3));
                                    if (i3 == lineCount3 - 1) {
                                        this.c = size3 - f3;
                                    }
                                    i3++;
                                }
                            }
                        }
                    }
                }
                super.onMeasure(i, i2);
                return;
            default:
                super.onMeasure(i, i2);
                e29 e29Var = ((ky8) callback).q1;
                float measuredHeight = (ky8Var.p1 / 768.0f) * ((d41) this.b).getMeasuredHeight();
                if (this.c != measuredHeight) {
                    this.c = measuredHeight;
                    ViewGroup.LayoutParams layoutParams = e29Var.getLayoutParams();
                    int i4 = (int) measuredHeight;
                    e29Var.getLayoutParams().width = i4;
                    layoutParams.height = i4;
                    super.onMeasure(i, i2);
                    return;
                }
                return;
        }
    }

    public b08(Context context, EditTextBoldCursor editTextBoldCursor, byte b) {
        super(context);
        this.a = b;
        this.d = editTextBoldCursor;
    }
}
