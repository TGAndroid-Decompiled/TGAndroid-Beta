package jh;

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
import org.telegram.ui.Components.iq;
import org.telegram.ui.Components.jr;
import org.telegram.ui.Components.zz0;
public final class cb extends View {
    public final boolean f11887a;
    public final ArrayList f11888b;
    public final ArrayList f11889c;
    public final Paint d;
    public final org.telegram.ui.Components.d6 f11890e;
    public float f11891f;
    public bb h;
    public Utilities.Callback f11892n;
    public final db f11893r;

    public cb(db dbVar, Context context, boolean z10) {
        super(context);
        this.f11893r = dbVar;
        this.f11888b = new ArrayList();
        this.f11889c = new ArrayList();
        Paint paint = new Paint(1);
        this.d = paint;
        this.f11890e = new org.telegram.ui.Components.d6(this, 0L, 320L, jr.h);
        this.f11887a = z10;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setStrokeWidth(AndroidUtilities.dp(3.0f));
        paint.setColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23133h5, dbVar.f11973b));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        ArrayList arrayList = this.f11888b;
        this.f11891f = this.f11890e.d(arrayList.size(), false);
        int i10 = 0;
        while (true) {
            ArrayList arrayList2 = this.f11889c;
            if (i10 >= arrayList2.size()) {
                break;
            }
            ((bb) arrayList2.get(i10)).a(canvas);
            i10++;
        }
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            ((bb) arrayList.get(i11)).a(canvas);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f11888b;
            if (i10 < arrayList.size()) {
                ((bb) arrayList.get(i10)).f11831k.onAttachedToWindow();
                i10++;
            } else {
                return;
            }
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f11888b;
            if (i10 < arrayList.size()) {
                ((bb) arrayList.get(i10)).f11831k.onDetachedFromWindow();
                i10++;
            } else {
                return;
            }
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        bb bbVar;
        Utilities.Callback callback;
        if (motionEvent.getAction() == 0) {
            bb bbVar2 = this.h;
            if (bbVar2 != null) {
                bbVar2.f11837q.c(false);
            }
            this.h = null;
            int i10 = 0;
            while (true) {
                ArrayList arrayList = this.f11888b;
                if (i10 >= arrayList.size()) {
                    break;
                } else if (((bb) arrayList.get(i10)).f11824b.contains(motionEvent.getX(), motionEvent.getY())) {
                    this.h = (bb) arrayList.get(i10);
                    break;
                } else {
                    i10++;
                }
            }
            bb bbVar3 = this.h;
            if (bbVar3 != null) {
                bbVar3.f11837q.c(true);
            }
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            if (motionEvent.getAction() == 1 && (bbVar = this.h) != null && !bbVar.f11836p && bbVar.f11824b.contains(motionEvent.getX(), motionEvent.getY()) && (callback = this.f11892n) != null) {
                callback.run(Long.valueOf(this.h.f11830j));
            }
            bb bbVar4 = this.h;
            if (bbVar4 != null) {
                bbVar4.f11837q.c(false);
            }
            this.h = null;
        }
        if (this.h == null) {
            return false;
        }
        return true;
    }

    public void setMyPrivacy(long j10) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f11888b;
            if (i10 < arrayList.size()) {
                bb bbVar = (bb) arrayList.get(i10);
                if (bbVar.f11829i) {
                    bbVar.b(j10);
                    return;
                }
                i10++;
            } else {
                return;
            }
        }
    }

    public void setOnSenderClickListener(Utilities.Callback<Long> callback) {
        this.f11892n = callback;
    }

    public void setSenders(ArrayList<wa> arrayList) {
        ArrayList arrayList2;
        iq[] iqVarArr;
        ArrayList arrayList3;
        ?? r82;
        bb bbVar;
        String shortName;
        ArrayList<wa> arrayList4 = arrayList;
        int i10 = 0;
        while (true) {
            arrayList2 = this.f11888b;
            int size = arrayList2.size();
            iqVarArr = null;
            wa waVar = null;
            arrayList3 = this.f11889c;
            r82 = 1;
            if (i10 >= size) {
                break;
            }
            bb bbVar2 = (bb) arrayList2.get(i10);
            for (int i11 = 0; i11 < arrayList4.size(); i11++) {
                wa waVar2 = arrayList4.get(i11);
                boolean z10 = waVar2.f13042b;
                if ((z10 && bbVar2.f11829i) || (!bbVar2.f11829i && !z10 && waVar2.f13043c == bbVar2.f11830j)) {
                    waVar = arrayList4.get(i11);
                    break;
                }
            }
            if (waVar == null) {
                bbVar2.f11831k.onDetachedFromWindow();
                arrayList2.remove(i10);
                i10--;
                bbVar2.f11823a = -1;
                arrayList3.add(bbVar2);
            }
            i10++;
        }
        int i12 = 0;
        while (i12 < arrayList4.size()) {
            wa waVar3 = arrayList4.get(i12);
            for (int i13 = 0; i13 < arrayList2.size(); i13++) {
                bb bbVar3 = (bb) arrayList2.get(i13);
                boolean z11 = bbVar3.f11829i;
                if ((z11 && waVar3.f13042b) || (!z11 && !waVar3.f13042b && bbVar3.f11830j == waVar3.f13043c)) {
                    bbVar = (bb) arrayList2.get(i13);
                    break;
                }
            }
            bbVar = iqVarArr;
            if (bbVar == null) {
                for (int i14 = 0; i14 < arrayList3.size(); i14++) {
                    bb bbVar4 = (bb) arrayList3.get(i14);
                    boolean z12 = bbVar4.f11829i;
                    if ((z12 && waVar3.f13042b) || (!z12 && !waVar3.f13042b && bbVar4.f11830j == waVar3.f13043c)) {
                        bbVar = (bb) arrayList3.get(i14);
                        break;
                    }
                }
                if (bbVar != null) {
                    arrayList3.remove(bbVar);
                    bbVar.f11831k.onAttachedToWindow();
                    arrayList2.add(bbVar);
                }
            }
            if (bbVar == null) {
                bbVar = new bb(this, waVar3.f13042b, waVar3.f13043c);
                bbVar.d.d(0.0f, r82);
                arrayList2.add(bbVar);
                bbVar.f11825c.d((arrayList4.size() - r82) - i12, r82);
            }
            cb cbVar = bbVar.f11842w;
            db dbVar = cbVar.f11893r;
            bbVar.f11823a = (arrayList4.size() - r82) - i12;
            long j10 = waVar3.d;
            Paint paint = bbVar.h;
            bbVar.f11835o = new zz0(ia.R0(j7.l1.m(j10, ',', new StringBuilder("⭐️")), 0.85f, iqVarArr), 12.0f, AndroidUtilities.getTypeface("fonts/num.otf"));
            boolean z13 = cbVar.f11887a;
            int i15 = dbVar.f11974c;
            if (z13) {
                int i16 = (int) j10;
                bbVar.f11827f = new LinearGradient(0.0f, 0.0f, 0.0f, AndroidUtilities.dp(16.0f), new int[]{lh.s.b(i15, i16, 4), lh.s.b(i15, i16, 3)}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                bbVar.f11838r = i0.a.d(0.5f, lh.s.b(i15, i16, 4), lh.s.b(i15, i16, 3));
                paint.setShader(bbVar.f11827f);
            } else {
                paint.setShader(null);
                bbVar.f11838r = -1002750;
                paint.setColor(-1002750);
            }
            Drawable drawable = bbVar.f11839s;
            if (drawable != null) {
                drawable.setColorFilter(new PorterDuffColorFilter(bbVar.f11838r, PorterDuff.Mode.SRC_IN));
            }
            if (this.f11887a) {
                int i17 = i12 + 1;
                bbVar.v = i17;
                bbVar.f11841u = new zz0(j7.l1.k(i17, ""), 10.0f, AndroidUtilities.getTypeface("fonts/num.otf"));
                if (i17 > 0 && bbVar.f11839s == null) {
                    Drawable mutate = cbVar.getContext().getResources().getDrawable(R.drawable.filled_stream_crown).mutate();
                    bbVar.f11839s = mutate;
                    int i18 = bbVar.f11838r;
                    PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                    mutate.setColorFilter(new PorterDuffColorFilter(i18, mode));
                    Drawable mutate2 = cbVar.getContext().getResources().getDrawable(R.drawable.filled_stream_crown_outline).mutate();
                    bbVar.f11840t = mutate2;
                    mutate2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23133h5, dbVar.f11973b), mode));
                }
            }
            if (waVar3.f13042b) {
                bbVar.b(this.f11893r.A);
            } else {
                boolean z14 = waVar3.f13041a;
                if (!bbVar.f11829i && bbVar.f11836p != z14) {
                    bbVar.f11836p = z14;
                    if (z14) {
                        shortName = LocaleController.getString(R.string.StarsReactionAnonymous);
                    } else {
                        shortName = DialogObject.getShortName(bbVar.f11830j);
                    }
                    iqVarArr = null;
                    bbVar.f11834n = new zz0(shortName, 12.0f, null);
                    cbVar.invalidate();
                    i12++;
                    arrayList4 = arrayList;
                    r82 = 1;
                }
            }
            iqVarArr = null;
            i12++;
            arrayList4 = arrayList;
            r82 = 1;
        }
        invalidate();
    }
}
