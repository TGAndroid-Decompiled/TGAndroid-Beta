package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.TextView;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.UndoView;
public final class sf1 extends l66 {
    public final byte M;
    public final Object N;

    public sf1(byte b, Context context, Object obj) {
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
                Integer num = ((njb) this.N).d;
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
                ((oh2) obj).f();
                return;
            case 3:
                njb njbVar = (njb) obj;
                njbVar.b();
                super.onDraw(canvas);
                njbVar.a();
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
                    charSequence = gm.S2(charSequence.toString());
                    int indexOf = charSequence.toString().indexOf(10);
                    if (indexOf >= 0) {
                        charSequence.replace(indexOf, indexOf + 1, " ");
                        charSequence.setSpan(new do4(cmb.o7, ((tf1) obj).e.getResourceProvider()), 0, indexOf, 33);
                    }
                    z5c[] z5cVarArr = (z5c[]) charSequence.getSpans(0, charSequence.length(), z5c.class);
                    while (i < z5cVarArr.length) {
                        charSequence.setSpan(new z31(this, (byte) 1), charSequence.getSpanStart(z5cVarArr[i]), charSequence.getSpanEnd(z5cVarArr[i]), 33);
                        charSequence.removeSpan(z5cVarArr[i]);
                        i++;
                    }
                }
                super.setText(charSequence, bufferType);
                return;
            case 1:
                fj1 fj1Var = (fj1) obj;
                if (charSequence != 0) {
                    charSequence = gm.S2(charSequence.toString());
                    int indexOf2 = charSequence.toString().indexOf(10);
                    if (indexOf2 >= 0) {
                        charSequence.replace(indexOf2, indexOf2 + 1, " ");
                        charSequence.setSpan(new do4(cmb.o7, fj1Var.getResourceProvider()), 0, indexOf2, 33);
                    }
                    z5c[] z5cVarArr2 = (z5c[]) charSequence.getSpans(0, charSequence.length(), z5c.class);
                    EditTextBoldCursor editTextBoldCursor = fj1Var.y;
                    if (editTextBoldCursor != null && editTextBoldCursor.getText() != null) {
                        str = fj1Var.y.getText().toString();
                    } else {
                        str = "";
                    }
                    while (i < z5cVarArr2.length) {
                        charSequence.setSpan(new q1((Object) this, str, (byte) 2), charSequence.getSpanStart(z5cVarArr2[i]), charSequence.getSpanEnd(z5cVarArr2[i]), 33);
                        charSequence.removeSpan(z5cVarArr2[i]);
                        i++;
                    }
                }
                super.setText(charSequence, bufferType);
                return;
            case 2:
                super.setText(gw3.m(charSequence, getPaint().getFontMetricsInt(), false, null, 0), bufferType);
                return;
            default:
                super.setText(charSequence, bufferType);
                return;
        }
    }

    public sf1(njb njbVar, Context context, i66 i66Var, ylb ylbVar) {
        super(context, i66Var, ylbVar);
        this.M = (byte) 3;
        this.N = njbVar;
    }

    public sf1(UndoView undoView, Context context, ylb ylbVar) {
        super(context, ylbVar);
        this.M = (byte) 4;
        this.N = undoView;
    }
}
