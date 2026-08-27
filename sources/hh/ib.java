package hh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.cq;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.pz0;

public final class ib extends View {

    public final boolean f9497a;

    public final ArrayList f9498b;

    public final ArrayList f9499c;
    public final Paint d;

    public final org.telegram.ui.Components.y5 f9500e;

    public float f9501f;
    public hb h;

    public Utilities.Callback f9502n;

    public final jb f9503r;

    public ib(jb jbVar, Context context, boolean z10) {
        super(context);
        this.f9503r = jbVar;
        this.f9498b = new ArrayList();
        this.f9499c = new ArrayList();
        Paint paint = new Paint(1);
        this.d = paint;
        this.f9500e = new org.telegram.ui.Components.y5(this, 0L, 320L, er.h);
        this.f9497a = z10;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setStrokeWidth(AndroidUtilities.dp(3.0f));
        paint.setColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23124h5, jbVar.f9556b));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        ArrayList arrayList = this.f9498b;
        this.f9501f = this.f9500e.d(arrayList.size(), false);
        int i10 = 0;
        while (true) {
            ArrayList arrayList2 = this.f9499c;
            if (i10 >= arrayList2.size()) {
                break;
            }
            ((hb) arrayList2.get(i10)).a(canvas);
            i10++;
        }
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            ((hb) arrayList.get(i11)).a(canvas);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f9498b;
            if (i10 >= arrayList.size()) {
                return;
            }
            ((hb) arrayList.get(i10)).f9415k.onAttachedToWindow();
            i10++;
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f9498b;
            if (i10 >= arrayList.size()) {
                return;
            }
            ((hb) arrayList.get(i10)).f9415k.onDetachedFromWindow();
            i10++;
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        hb hbVar;
        Utilities.Callback callback;
        if (motionEvent.getAction() == 0) {
            hb hbVar2 = this.h;
            if (hbVar2 != null) {
                hbVar2.f9421q.c(false);
            }
            this.h = null;
            int i10 = 0;
            while (true) {
                ArrayList arrayList = this.f9498b;
                if (i10 >= arrayList.size()) {
                    break;
                }
                if (((hb) arrayList.get(i10)).f9408b.contains(motionEvent.getX(), motionEvent.getY())) {
                    this.h = (hb) arrayList.get(i10);
                    break;
                }
                i10++;
            }
            hb hbVar3 = this.h;
            if (hbVar3 != null) {
                hbVar3.f9421q.c(true);
            }
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            if (motionEvent.getAction() == 1 && (hbVar = this.h) != null && !hbVar.f9420p && hbVar.f9408b.contains(motionEvent.getX(), motionEvent.getY()) && (callback = this.f9502n) != null) {
                callback.run(Long.valueOf(this.h.f9414j));
            }
            hb hbVar4 = this.h;
            if (hbVar4 != null) {
                hbVar4.f9421q.c(false);
            }
            this.h = null;
        }
        return this.h != null;
    }

    public void setMyPrivacy(long j10) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f9498b;
            if (i10 >= arrayList.size()) {
                return;
            }
            hb hbVar = (hb) arrayList.get(i10);
            if (hbVar.f9413i) {
                hbVar.b(j10);
                return;
            }
            i10++;
        }
    }

    public void setOnSenderClickListener(Utilities.Callback<Long> callback) {
        this.f9502n = callback;
    }

    public void setSenders(ArrayList<cb> arrayList) {
        ArrayList arrayList2;
        cq[] cqVarArr;
        ?? r10;
        ?? r11;
        ?? hbVar;
        ArrayList<cb> arrayList3 = arrayList;
        int i10 = 0;
        while (true) {
            arrayList2 = this.f9498b;
            int size = arrayList2.size();
            cqVarArr = null;
            cb cbVar = null;
            r10 = this.f9499c;
            r11 = 1;
            if (i10 >= size) {
                break;
            }
            hb hbVar2 = (hb) arrayList2.get(i10);
            for (int i11 = 0; i11 < arrayList3.size(); i11++) {
                cb cbVar2 = arrayList3.get(i11);
                boolean z10 = cbVar2.f9106b;
                if ((z10 && hbVar2.f9413i) || (!hbVar2.f9413i && !z10 && cbVar2.f9107c == hbVar2.f9414j)) {
                    cbVar = arrayList3.get(i11);
                    break;
                }
            }
            if (cbVar == null) {
                hbVar2.f9415k.onDetachedFromWindow();
                arrayList2.remove(i10);
                i10--;
                hbVar2.f9407a = -1;
                r10.add(hbVar2);
            }
            i10++;
        }
        int i12 = 0;
        while (i12 < arrayList3.size()) {
            cb cbVar3 = arrayList3.get(i12);
            int i13 = 0;
            while (true) {
                if (i13 >= arrayList2.size()) {
                    hbVar = cqVarArr;
                    break;
                }
                hb hbVar3 = (hb) arrayList2.get(i13);
                boolean z11 = hbVar3.f9413i;
                if ((z11 && cbVar3.f9106b) || (!z11 && !cbVar3.f9106b && hbVar3.f9414j == cbVar3.f9107c)) {
                    hbVar = (hb) arrayList2.get(i13);
                    break;
                }
                i13++;
            }
            if (hbVar == 0) {
                for (int i14 = 0; i14 < r10.size(); i14++) {
                    hb hbVar4 = (hb) r10.get(i14);
                    boolean z12 = hbVar4.f9413i;
                    if ((z12 && cbVar3.f9106b) || (!z12 && !cbVar3.f9106b && hbVar4.f9414j == cbVar3.f9107c)) {
                        hbVar = (hb) r10.get(i14);
                        break;
                    }
                }
                if (hbVar != 0) {
                    r10.remove(hbVar);
                    hbVar.f9415k.onAttachedToWindow();
                    arrayList2.add(hbVar);
                }
            }
            if (hbVar == 0) {
                hbVar = new hb(this, cbVar3.f9106b, cbVar3.f9107c);
                hbVar.d.d(0.0f, r11);
                arrayList2.add(hbVar);
                hbVar.f9409c.d((arrayList3.size() - r11) - i12, r11);
            }
            ib ibVar = hbVar.f9426w;
            jb jbVar = ibVar.f9503r;
            hbVar.f9407a = (arrayList3.size() - r11) - i12;
            long j10 = cbVar3.d;
            Paint paint = hbVar.h;
            hbVar.f9419o = new pz0(oa.R0(i0.a.m(j10, ',', new StringBuilder("⭐️")), 0.85f, cqVarArr), 12.0f, AndroidUtilities.getTypeface("fonts/num.otf"));
            boolean z13 = ibVar.f9497a;
            int i15 = jbVar.f9557c;
            if (z13) {
                int i16 = (int) j10;
                hbVar.f9411f = new LinearGradient(0.0f, 0.0f, 0.0f, AndroidUtilities.dp(16.0f), new int[]{jh.s.b(i15, i16, 4), jh.s.b(i15, i16, 3)}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                hbVar.f9422r = i0.b.d(0.5f, jh.s.b(i15, i16, 4), jh.s.b(i15, i16, 3));
                paint.setShader(hbVar.f9411f);
            } else {
                paint.setShader(null);
                hbVar.f9422r = -1002750;
                paint.setColor(-1002750);
            }
            Drawable drawable = hbVar.f9423s;
            if (drawable != null) {
                drawable.setColorFilter(new PorterDuffColorFilter(hbVar.f9422r, PorterDuff.Mode.SRC_IN));
            }
            if (this.f9497a) {
                int i17 = i12 + 1;
                hbVar.v = i17;
                hbVar.f9425u = new pz0(i0.a.k(i17, ""), 10.0f, AndroidUtilities.getTypeface("fonts/num.otf"));
                if (i17 > 0 && hbVar.f9423s == null) {
                    Drawable drawableMutate = ibVar.getContext().getResources().getDrawable(R.drawable.filled_stream_crown).mutate();
                    hbVar.f9423s = drawableMutate;
                    int i18 = hbVar.f9422r;
                    PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                    drawableMutate.setColorFilter(new PorterDuffColorFilter(i18, mode));
                    Drawable drawableMutate2 = ibVar.getContext().getResources().getDrawable(R.drawable.filled_stream_crown_outline).mutate();
                    hbVar.f9424t = drawableMutate2;
                    drawableMutate2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23124h5, jbVar.f9556b), mode));
                }
            }
            if (cbVar3.f9106b) {
                hbVar.b(this.f9503r.A);
            } else {
                boolean z14 = cbVar3.f9105a;
                if (!hbVar.f9413i && hbVar.f9420p != z14) {
                    hbVar.f9420p = z14;
                    cqVarArr = null;
                    hbVar.f9418n = new pz0(z14 ? LocaleController.getString(R.string.StarsReactionAnonymous) : DialogObject.getShortName(hbVar.f9414j), 12.0f, null);
                    ibVar.invalidate();
                }
                i12++;
                arrayList3 = arrayList;
                r11 = 1;
            }
            cqVarArr = null;
            i12++;
            arrayList3 = arrayList;
            r11 = 1;
        }
        invalidate();
    }
}
