package defpackage;

import android.animation.ValueAnimator;
import android.content.ClipData;
import android.content.ClipDescription;
import android.content.ClipboardManager;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.text.Layout;
import android.text.StaticLayout;
import android.view.MotionEvent;
import android.view.ViewGroup;
import org.telegram.ui.Components.EditTextBoldCursor;
public abstract class sj2 extends EditTextBoldCursor {
    public static final gia d2;
    public static final gia e2;
    public static final gia f2;
    public static final gia g2;
    public float M1;
    public float N1;
    public float O1;
    public float P1;
    public yla Q1;
    public yla R1;
    public yla S1;
    public yla T1;
    public boolean U1;
    public float V1;
    public float W1;
    public boolean X1;
    public Bitmap Y1;
    public Canvas Z1;
    public ValueAnimator a2;
    public ValueAnimator b2;
    public boolean c2;

    static {
        gia giaVar = new gia(new k32((byte) 10), new k32((byte) 11));
        giaVar.c = 100.0f;
        d2 = giaVar;
        gia giaVar2 = new gia(new k32((byte) 12), new k32((byte) 13));
        giaVar2.c = 100.0f;
        e2 = giaVar2;
        gia giaVar3 = new gia(new k32((byte) 14), new k32((byte) 15));
        giaVar3.c = 100.0f;
        f2 = giaVar3;
        gia giaVar4 = new gia(new k32((byte) 16), new k32((byte) 17));
        giaVar4.c = 100.0f;
        g2 = giaVar4;
    }

    public static void C(yla ylaVar, float f) {
        zla zlaVar = ylaVar.m;
        if (zlaVar != null && f == ((float) zlaVar.i)) {
            return;
        }
        ylaVar.d();
        zla zlaVar2 = new zla(f);
        zlaVar2.b(400.0f);
        zlaVar2.a(1.0f);
        zlaVar2.i = f;
        ylaVar.m = zlaVar2;
        ylaVar.h();
    }

    public final void A(float f) {
        C(this.R1, f * 100.0f);
    }

    public final void B(float f) {
        C(this.Q1, f * 100.0f);
    }

    public final void D(float f) {
        C(this.S1, f * 100.0f);
        yla ylaVar = this.T1;
        ylaVar.d();
        if (f != 0.0f) {
            zla j = oo1.j(1.0f, 500.0f, 0.75f);
            j.i = 100.0d;
            ylaVar.m = j;
            ylaVar.b = 100.0f;
            ylaVar.c = true;
            ylaVar.a = 4000.0f;
            ylaVar.h();
            return;
        }
        this.P1 = 1.0f;
    }

    public final void E() {
        if (getMeasuredHeight() != 0 && getMeasuredWidth() != 0 && getLayout() != null) {
            Bitmap bitmap = this.Y1;
            if (bitmap == null || bitmap.getHeight() != getMeasuredHeight() || this.Y1.getWidth() != getMeasuredWidth()) {
                Bitmap bitmap2 = this.Y1;
                if (bitmap2 != null) {
                    bitmap2.recycle();
                }
                this.Y1 = Bitmap.createBitmap(getMeasuredWidth(), getMeasuredHeight(), Bitmap.Config.ARGB_8888);
                this.Z1 = new Canvas(this.Y1);
            }
            this.Y1.eraseColor(0);
            CharSequence transformation = getTransformationMethod().getTransformation(getText(), this);
            StaticLayout staticLayout = new StaticLayout(transformation, getLayout().getPaint(), (int) Math.ceil(getLayout().getPaint().measureText(transformation, 0, transformation.length())), Layout.Alignment.ALIGN_NORMAL, getLineSpacingMultiplier(), getLineSpacingExtra(), getIncludeFontPadding());
            this.Z1.save();
            this.Z1.translate((getMeasuredWidth() - staticLayout.getWidth()) / 2.0f, (getMeasuredHeight() - staticLayout.getHeight()) / 2.0f);
            staticLayout.draw(this.Z1);
            this.Z1.restore();
            this.W1 = 0.0f;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.b2 = ofFloat;
            ofFloat.addUpdateListener(new uz1(this, (byte) 10));
            this.b2.setDuration(220L);
            this.b2.start();
        }
    }

    public float getErrorProgress() {
        return this.N1;
    }

    public float getFocusedProgress() {
        return this.M1;
    }

    public float getSuccessProgress() {
        return this.O1;
    }

    public float getSuccessScaleProgress() {
        return this.P1;
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.Q1.d();
        this.R1.d();
    }

    @Override
    public final void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        if (!isFocused()) {
            m();
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        fj2 fj2Var;
        ClipDescription primaryClipDescription;
        String str;
        int i;
        if (motionEvent.getAction() == 0) {
            this.c2 = true;
            motionEvent.getX();
            motionEvent.getY();
        }
        if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            if (getParent() instanceof fj2) {
                fj2Var = (fj2) getParent();
            } else {
                fj2Var = null;
            }
            if (motionEvent.getAction() == 1 && this.c2) {
                if (isFocused() && fj2Var != null) {
                    ClipboardManager clipboardManager = (ClipboardManager) getContext().getSystemService(ClipboardManager.class);
                    if (clipboardManager == null || clipboardManager.getPrimaryClipDescription() == null || (primaryClipDescription = clipboardManager.getPrimaryClipDescription()) == null) {
                        return false;
                    }
                    primaryClipDescription.hasMimeType("text/plain");
                    ClipData.Item itemAt = clipboardManager.getPrimaryClip().getItemAt(0);
                    if (itemAt != null && itemAt.getText() != null) {
                        str = itemAt.getText().toString();
                    } else {
                        str = "";
                    }
                    try {
                        i = Integer.parseInt(str);
                    } catch (Exception unused) {
                        i = -1;
                    }
                    if (i > 0) {
                        startActionMode(new rj2(this, (byte) 0));
                    }
                } else {
                    requestFocus();
                }
                setSelection(0);
                if (this.U1) {
                    gl.F3(this);
                }
            }
            this.c2 = false;
        }
        return this.c2;
    }

    @Override
    public final boolean requestFocus(int i, Rect rect) {
        ((ViewGroup) getParent()).invalidate();
        return super.requestFocus(i, rect);
    }

    public void setShowSoftInputOnFocusCompat(boolean z) {
        this.U1 = z;
        setShowSoftInputOnFocus(z);
    }
}
