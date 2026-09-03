package dg;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.os.Build;
import android.text.SpannableStringBuilder;
import android.view.ContextThemeWrapper;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.ba;
import org.telegram.ui.Components.fa;
import org.telegram.ui.Components.lq;
public abstract class c3 extends ph.d {
    public final fa f4433e0;
    public final RectF f4434f0;
    public int f4435g0;
    public final q3 f4436h0;
    public final f6 f4437i0;
    public int f4438j0;
    public boolean f4439k0;

    public c3(q3 q3Var, ContextThemeWrapper contextThemeWrapper, f6 f6Var, ba baVar) {
        super(contextThemeWrapper, f6Var, false);
        this.f4434f0 = new RectF();
        this.f4438j0 = 8;
        this.f4437i0 = f6Var;
        this.f4436h0 = q3Var;
        this.f4433e0 = new fa(baVar, this, 0, true);
        setWillNotDraw(false);
        setTextColor(-1);
        setFlickeringLoading(true);
        this.d.u(AndroidUtilities.bold());
        removeView(this.f41460r);
        setForeground(j6.Y(j6.l1(0.08f, -1), 8, 8));
        setPadding(AndroidUtilities.dp(24.0f), 0, AndroidUtilities.dp(24.0f), 0);
    }

    @Override
    public void onDraw(Canvas canvas) {
        boolean z4 = this.f41452a0;
        RectF rectF = this.f4434f0;
        if (z4) {
            float d = this.d.d() + getPaddingLeft() + getPaddingRight();
            rectF.set((getMeasuredWidth() - d) / 2.0f, 0.0f, (getMeasuredWidth() + d) / 2.0f, getMeasuredHeight());
        } else {
            rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        }
        super.onDraw(canvas);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        if (this.f4439k0) {
            i10 = View.MeasureSpec.makeMeasureSpec(getPaddingRight() + getPaddingLeft() + ((int) this.d.d()), 1073741824);
        }
        super.onMeasure(i10, i11);
    }

    @Override
    public void setAlpha(float f10) {
        n3[] n3VarArr;
        q3 q3Var = this.f4436h0;
        super.setAlpha((!q3Var.f4766y || (n3VarArr = q3Var.E) == null || n3VarArr.length <= 0) ? 0.0f : 0.0f);
    }

    public void setCancelState(boolean z4) {
        this.f4435g0 = 2;
        g(LocaleController.getString(R.string.Cancel), z4, true);
    }

    public void setCutOutState(boolean z4) {
        this.f4435g0 = 0;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("d");
        lq lqVar = new lq(R.drawable.media_magic_cut, 0);
        lqVar.setSize(AndroidUtilities.dp(22.0f));
        lqVar.setTranslateX(AndroidUtilities.dp(1.0f));
        lqVar.setTranslateY(AndroidUtilities.dp(2.0f));
        lqVar.spaceScaleX = 1.2f;
        spannableStringBuilder.setSpan(lqVar, 0, 1, 0);
        spannableStringBuilder.append((CharSequence) " ").append((CharSequence) LocaleController.getString(R.string.SegmentationCutObject));
        g(spannableStringBuilder, z4, true);
    }

    public void setEraseState(boolean z4) {
        this.f4435g0 = 3;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("d");
        lq lqVar = new lq(R.drawable.media_button_erase, 0);
        lqVar.setSize(AndroidUtilities.dp(20.0f));
        lqVar.setTranslateX(AndroidUtilities.dp(-3.0f));
        spannableStringBuilder.setSpan(lqVar, 0, 1, 0);
        spannableStringBuilder.append((CharSequence) " ").append((CharSequence) LocaleController.getString(R.string.SegmentationErase));
        g(spannableStringBuilder, z4, true);
    }

    public void setOutlineState(boolean z4) {
        this.f4435g0 = 6;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("d");
        lq lqVar = new lq(R.drawable.media_sticker_stroke, 0);
        lqVar.setSize(AndroidUtilities.dp(20.0f));
        lqVar.setTranslateX(AndroidUtilities.dp(-3.0f));
        spannableStringBuilder.setSpan(lqVar, 0, 1, 0);
        spannableStringBuilder.append((CharSequence) " ").append((CharSequence) LocaleController.getString(R.string.SegmentationOutline));
        g(spannableStringBuilder, z4, true);
    }

    public void setRad(int i10) {
        this.f4438j0 = i10;
        setForeground(j6.Y(j6.v0(j6.f19971i6, this.f4437i0), i10, i10));
    }

    public void setRestoreState(boolean z4) {
        this.f4435g0 = 4;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("d");
        lq lqVar = new lq(R.drawable.media_button_restore, 0);
        lqVar.setSize(AndroidUtilities.dp(20.0f));
        lqVar.setTranslateX(AndroidUtilities.dp(-3.0f));
        spannableStringBuilder.setSpan(lqVar, 0, 1, 0);
        spannableStringBuilder.append((CharSequence) " ").append((CharSequence) LocaleController.getString(R.string.SegmentationRestore));
        g(spannableStringBuilder, z4, true);
    }

    public void setUndoCutState(boolean z4) {
        this.f4435g0 = 1;
    }

    public void setUndoState(boolean z4) {
        this.f4435g0 = 5;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("d");
        lq lqVar = new lq(R.drawable.photo_undo2, 0);
        lqVar.setSize(AndroidUtilities.dp(20.0f));
        lqVar.setTranslateX(AndroidUtilities.dp(-3.0f));
        spannableStringBuilder.setSpan(lqVar, 0, 1, 0);
        spannableStringBuilder.append((CharSequence) " ").append((CharSequence) LocaleController.getString(R.string.SegmentationUndo));
        g(spannableStringBuilder, z4, true);
    }

    @Override
    public void setVisibility(int i10) {
        if (Build.VERSION.SDK_INT < 24) {
            super.setVisibility(8);
        } else {
            super.setVisibility(i10);
        }
    }
}
