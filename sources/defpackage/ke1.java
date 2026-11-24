package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.TextView;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.UndoView;
public final class ke1 extends l46 {
    public final byte M;
    public final Object N;

    public ke1(byte b, Context context, Object obj) {
        super(context, null);
        this.M = b;
        this.N = obj;
    }

    @Override
    public final int a() {
        switch (this.M) {
            case 4:
                return ((UndoView) this.N).a;
            default:
                return super.a();
        }
    }

    @Override
    public final int c() {
        switch (this.M) {
            case 3:
                Integer num = ((mhb) this.N).d;
                if (num != null) {
                    return num.intValue();
                }
                return super.c();
            default:
                return super.c();
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        byte b = this.M;
        Object obj = this.N;
        switch (b) {
            case 2:
                super.onDraw(canvas);
                ((ag2) obj).f();
                return;
            case 3:
                mhb mhbVar = (mhb) obj;
                mhbVar.b();
                super.onDraw(canvas);
                mhbVar.a();
                return;
            default:
                super.onDraw(canvas);
                return;
        }
    }

    @Override
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        String str;
        byte b = this.M;
        Object obj = this.N;
        int i = 0;
        switch (b) {
            case 0:
                if (charSequence != 0) {
                    charSequence = gl.T2(charSequence.toString());
                    int indexOf = charSequence.toString().indexOf(10);
                    if (indexOf >= 0) {
                        charSequence.replace(indexOf, indexOf + 1, " ");
                        charSequence.setSpan(new cm4(bkb.o7, ((le1) obj).e.getResourceProvider()), 0, indexOf, 33);
                    }
                    z3c[] z3cVarArr = (z3c[]) charSequence.getSpans(0, charSequence.length(), z3c.class);
                    while (i < z3cVarArr.length) {
                        charSequence.setSpan(new r21(this, (byte) 1), charSequence.getSpanStart(z3cVarArr[i]), charSequence.getSpanEnd(z3cVarArr[i]), 33);
                        charSequence.removeSpan(z3cVarArr[i]);
                        i++;
                    }
                }
                super.setText(charSequence, bufferType);
                return;
            case 1:
                yh1 yh1Var = (yh1) obj;
                if (charSequence != 0) {
                    charSequence = gl.T2(charSequence.toString());
                    int indexOf2 = charSequence.toString().indexOf(10);
                    if (indexOf2 >= 0) {
                        charSequence.replace(indexOf2, indexOf2 + 1, " ");
                        charSequence.setSpan(new cm4(bkb.o7, yh1Var.getResourceProvider()), 0, indexOf2, 33);
                    }
                    z3c[] z3cVarArr2 = (z3c[]) charSequence.getSpans(0, charSequence.length(), z3c.class);
                    EditTextBoldCursor editTextBoldCursor = yh1Var.y;
                    if (editTextBoldCursor != null && editTextBoldCursor.getText() != null) {
                        str = yh1Var.y.getText().toString();
                    } else {
                        str = "";
                    }
                    while (i < z3cVarArr2.length) {
                        charSequence.setSpan(new q1((Object) this, str, (byte) 2), charSequence.getSpanStart(z3cVarArr2[i]), charSequence.getSpanEnd(z3cVarArr2[i]), 33);
                        charSequence.removeSpan(z3cVarArr2[i]);
                        i++;
                    }
                }
                super.setText(charSequence, bufferType);
                return;
            case 2:
                super.setText(vu3.m(charSequence, getPaint().getFontMetricsInt(), false, null, 0), bufferType);
                return;
            default:
                super.setText(charSequence, bufferType);
                return;
        }
    }

    public ke1(mhb mhbVar, Context context, i46 i46Var, wjb wjbVar) {
        super(context, i46Var, wjbVar);
        this.M = (byte) 3;
        this.N = mhbVar;
    }

    public ke1(UndoView undoView, Context context, wjb wjbVar) {
        super(context, wjbVar);
        this.M = (byte) 4;
        this.N = undoView;
    }
}
