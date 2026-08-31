package eg;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.os.Build;
import android.text.SpannableStringBuilder;
import android.view.ContextThemeWrapper;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.ba;
import org.telegram.ui.Components.fa;
import org.telegram.ui.Components.oq;
public abstract class a3 extends qh.d {
    public final fa f5065e0;
    public final RectF f5066f0;
    public int f5067g0;
    public final o3 f5068h0;
    public final g6 f5069i0;
    public int f5070j0;
    public boolean f5071k0;

    public a3(o3 o3Var, ContextThemeWrapper contextThemeWrapper, g6 g6Var, ba baVar) {
        super(contextThemeWrapper, g6Var, false);
        this.f5066f0 = new RectF();
        this.f5070j0 = 8;
        this.f5069i0 = g6Var;
        this.f5068h0 = o3Var;
        this.f5065e0 = new fa(baVar, this, 0, true);
        setWillNotDraw(false);
        setTextColor(-1);
        setFlickeringLoading(true);
        this.d.u(AndroidUtilities.bold());
        removeView(this.f45170r);
        setForeground(k6.Y(k6.l1(0.08f, -1), 8, 8));
        setPadding(AndroidUtilities.dp(24.0f), 0, AndroidUtilities.dp(24.0f), 0);
    }

    @Override
    public void onDraw(Canvas canvas) {
        boolean z4 = this.f45161a0;
        RectF rectF = this.f5066f0;
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
        if (this.f5071k0) {
            i10 = View.MeasureSpec.makeMeasureSpec(getPaddingRight() + getPaddingLeft() + ((int) this.d.d()), 1073741824);
        }
        super.onMeasure(i10, i11);
    }

    @Override
    public void setAlpha(float f10) {
        l3[] l3VarArr;
        o3 o3Var = this.f5068h0;
        super.setAlpha((!o3Var.f5423y || (l3VarArr = o3Var.E) == null || l3VarArr.length <= 0) ? 0.0f : 0.0f);
    }

    public void setCancelState(boolean z4) {
        this.f5067g0 = 2;
        g(LocaleController.getString(R.string.Cancel), z4, true);
    }

    public void setCutOutState(boolean z4) {
        this.f5067g0 = 0;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("d");
        oq oqVar = new oq(R.drawable.media_magic_cut, 0);
        oqVar.setSize(AndroidUtilities.dp(22.0f));
        oqVar.setTranslateX(AndroidUtilities.dp(1.0f));
        oqVar.setTranslateY(AndroidUtilities.dp(2.0f));
        oqVar.spaceScaleX = 1.2f;
        spannableStringBuilder.setSpan(oqVar, 0, 1, 0);
        spannableStringBuilder.append((CharSequence) " ").append((CharSequence) LocaleController.getString(R.string.SegmentationCutObject));
        g(spannableStringBuilder, z4, true);
    }

    public void setEraseState(boolean z4) {
        this.f5067g0 = 3;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("d");
        oq oqVar = new oq(R.drawable.media_button_erase, 0);
        oqVar.setSize(AndroidUtilities.dp(20.0f));
        oqVar.setTranslateX(AndroidUtilities.dp(-3.0f));
        spannableStringBuilder.setSpan(oqVar, 0, 1, 0);
        spannableStringBuilder.append((CharSequence) " ").append((CharSequence) LocaleController.getString(R.string.SegmentationErase));
        g(spannableStringBuilder, z4, true);
    }

    public void setOutlineState(boolean z4) {
        this.f5067g0 = 6;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("d");
        oq oqVar = new oq(R.drawable.media_sticker_stroke, 0);
        oqVar.setSize(AndroidUtilities.dp(20.0f));
        oqVar.setTranslateX(AndroidUtilities.dp(-3.0f));
        spannableStringBuilder.setSpan(oqVar, 0, 1, 0);
        spannableStringBuilder.append((CharSequence) " ").append((CharSequence) LocaleController.getString(R.string.SegmentationOutline));
        g(spannableStringBuilder, z4, true);
    }

    public void setRad(int i10) {
        this.f5070j0 = i10;
        setForeground(k6.Y(k6.v0(k6.f21750i6, this.f5069i0), i10, i10));
    }

    public void setRestoreState(boolean z4) {
        this.f5067g0 = 4;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("d");
        oq oqVar = new oq(R.drawable.media_button_restore, 0);
        oqVar.setSize(AndroidUtilities.dp(20.0f));
        oqVar.setTranslateX(AndroidUtilities.dp(-3.0f));
        spannableStringBuilder.setSpan(oqVar, 0, 1, 0);
        spannableStringBuilder.append((CharSequence) " ").append((CharSequence) LocaleController.getString(R.string.SegmentationRestore));
        g(spannableStringBuilder, z4, true);
    }

    public void setUndoCutState(boolean z4) {
        this.f5067g0 = 1;
    }

    public void setUndoState(boolean z4) {
        this.f5067g0 = 5;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("d");
        oq oqVar = new oq(R.drawable.photo_undo2, 0);
        oqVar.setSize(AndroidUtilities.dp(20.0f));
        oqVar.setTranslateX(AndroidUtilities.dp(-3.0f));
        spannableStringBuilder.setSpan(oqVar, 0, 1, 0);
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
