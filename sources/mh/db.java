package mh;

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
import org.telegram.ui.Components.l01;
import org.telegram.ui.Components.oq;
import org.telegram.ui.Components.pr;
public final class db extends View {
    public final boolean f13918a;
    public final ArrayList f13919b;
    public final ArrayList f13920c;
    public final Paint d;
    public final org.telegram.ui.Components.z5 f13921e;
    public float f13922f;
    public cb h;
    public Utilities.Callback f13923n;
    public final eb f13924r;

    public db(eb ebVar, Context context, boolean z4) {
        super(context);
        this.f13924r = ebVar;
        this.f13919b = new ArrayList();
        this.f13920c = new ArrayList();
        Paint paint = new Paint(1);
        this.d = paint;
        this.f13921e = new org.telegram.ui.Components.z5(this, 0L, 320L, pr.h);
        this.f13918a = z4;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setStrokeWidth(AndroidUtilities.dp(3.0f));
        paint.setColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21731h5, ebVar.f13988b));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        ArrayList arrayList = this.f13919b;
        this.f13922f = this.f13921e.d(arrayList.size(), false);
        int i10 = 0;
        while (true) {
            ArrayList arrayList2 = this.f13920c;
            if (i10 >= arrayList2.size()) {
                break;
            }
            ((cb) arrayList2.get(i10)).a(canvas);
            i10++;
        }
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            ((cb) arrayList.get(i11)).a(canvas);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f13919b;
            if (i10 < arrayList.size()) {
                ((cb) arrayList.get(i10)).f13862k.onAttachedToWindow();
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
            ArrayList arrayList = this.f13919b;
            if (i10 < arrayList.size()) {
                ((cb) arrayList.get(i10)).f13862k.onDetachedFromWindow();
                i10++;
            } else {
                return;
            }
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        cb cbVar;
        Utilities.Callback callback;
        if (motionEvent.getAction() == 0) {
            cb cbVar2 = this.h;
            if (cbVar2 != null) {
                cbVar2.f13868q.c(false);
            }
            this.h = null;
            int i10 = 0;
            while (true) {
                ArrayList arrayList = this.f13919b;
                if (i10 >= arrayList.size()) {
                    break;
                } else if (((cb) arrayList.get(i10)).f13855b.contains(motionEvent.getX(), motionEvent.getY())) {
                    this.h = (cb) arrayList.get(i10);
                    break;
                } else {
                    i10++;
                }
            }
            cb cbVar3 = this.h;
            if (cbVar3 != null) {
                cbVar3.f13868q.c(true);
            }
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            if (motionEvent.getAction() == 1 && (cbVar = this.h) != null && !cbVar.f13867p && cbVar.f13855b.contains(motionEvent.getX(), motionEvent.getY()) && (callback = this.f13923n) != null) {
                callback.run(Long.valueOf(this.h.f13861j));
            }
            cb cbVar4 = this.h;
            if (cbVar4 != null) {
                cbVar4.f13868q.c(false);
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
            ArrayList arrayList = this.f13919b;
            if (i10 < arrayList.size()) {
                cb cbVar = (cb) arrayList.get(i10);
                if (cbVar.f13860i) {
                    cbVar.b(j10);
                    return;
                }
                i10++;
            } else {
                return;
            }
        }
    }

    public void setOnSenderClickListener(Utilities.Callback<Long> callback) {
        this.f13923n = callback;
    }

    public void setSenders(ArrayList<xa> arrayList) {
        ArrayList arrayList2;
        oq[] oqVarArr;
        ArrayList arrayList3;
        ?? r82;
        cb cbVar;
        String shortName;
        ArrayList<xa> arrayList4 = arrayList;
        int i10 = 0;
        while (true) {
            arrayList2 = this.f13919b;
            int size = arrayList2.size();
            oqVarArr = null;
            xa xaVar = null;
            arrayList3 = this.f13920c;
            r82 = 1;
            if (i10 >= size) {
                break;
            }
            cb cbVar2 = (cb) arrayList2.get(i10);
            for (int i11 = 0; i11 < arrayList4.size(); i11++) {
                xa xaVar2 = arrayList4.get(i11);
                boolean z4 = xaVar2.f15066b;
                if ((z4 && cbVar2.f13860i) || (!cbVar2.f13860i && !z4 && xaVar2.f15067c == cbVar2.f13861j)) {
                    xaVar = arrayList4.get(i11);
                    break;
                }
            }
            if (xaVar == null) {
                cbVar2.f13862k.onDetachedFromWindow();
                arrayList2.remove(i10);
                i10--;
                cbVar2.f13854a = -1;
                arrayList3.add(cbVar2);
            }
            i10++;
        }
        int i12 = 0;
        while (i12 < arrayList4.size()) {
            xa xaVar3 = arrayList4.get(i12);
            for (int i13 = 0; i13 < arrayList2.size(); i13++) {
                cb cbVar3 = (cb) arrayList2.get(i13);
                boolean z10 = cbVar3.f13860i;
                if ((z10 && xaVar3.f15066b) || (!z10 && !xaVar3.f15066b && cbVar3.f13861j == xaVar3.f15067c)) {
                    cbVar = (cb) arrayList2.get(i13);
                    break;
                }
            }
            cbVar = oqVarArr;
            if (cbVar == null) {
                for (int i14 = 0; i14 < arrayList3.size(); i14++) {
                    cb cbVar4 = (cb) arrayList3.get(i14);
                    boolean z11 = cbVar4.f13860i;
                    if ((z11 && xaVar3.f15066b) || (!z11 && !xaVar3.f15066b && cbVar4.f13861j == xaVar3.f15067c)) {
                        cbVar = (cb) arrayList3.get(i14);
                        break;
                    }
                }
                if (cbVar != null) {
                    arrayList3.remove(cbVar);
                    cbVar.f13862k.onAttachedToWindow();
                    arrayList2.add(cbVar);
                }
            }
            if (cbVar == null) {
                cbVar = new cb(this, xaVar3.f15066b, xaVar3.f15067c);
                cbVar.d.d(0.0f, r82);
                arrayList2.add(cbVar);
                cbVar.f13856c.d((arrayList4.size() - r82) - i12, r82);
            }
            db dbVar = cbVar.f13873w;
            eb ebVar = dbVar.f13924r;
            cbVar.f13854a = (arrayList4.size() - r82) - i12;
            long j10 = xaVar3.d;
            Paint paint = cbVar.h;
            cbVar.f13866o = new l01(ja.R0(l.d.l(j10, ',', new StringBuilder("⭐️")), 0.85f, oqVarArr), 12.0f, AndroidUtilities.getTypeface("fonts/num.otf"));
            boolean z12 = dbVar.f13918a;
            int i15 = ebVar.f13989c;
            if (z12) {
                int i16 = (int) j10;
                cbVar.f13858f = new LinearGradient(0.0f, 0.0f, 0.0f, AndroidUtilities.dp(16.0f), new int[]{oh.s.b(i15, i16, 4), oh.s.b(i15, i16, 3)}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                cbVar.f13869r = i0.a.d(0.5f, oh.s.b(i15, i16, 4), oh.s.b(i15, i16, 3));
                paint.setShader(cbVar.f13858f);
            } else {
                paint.setShader(null);
                cbVar.f13869r = -1002750;
                paint.setColor(-1002750);
            }
            Drawable drawable = cbVar.f13870s;
            if (drawable != null) {
                drawable.setColorFilter(new PorterDuffColorFilter(cbVar.f13869r, PorterDuff.Mode.SRC_IN));
            }
            if (this.f13918a) {
                int i17 = i12 + 1;
                cbVar.v = i17;
                cbVar.f13872u = new l01(l.d.j(i17, ""), 10.0f, AndroidUtilities.getTypeface("fonts/num.otf"));
                if (i17 > 0 && cbVar.f13870s == null) {
                    Drawable mutate = dbVar.getContext().getResources().getDrawable(R.drawable.filled_stream_crown).mutate();
                    cbVar.f13870s = mutate;
                    int i18 = cbVar.f13869r;
                    PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                    mutate.setColorFilter(new PorterDuffColorFilter(i18, mode));
                    Drawable mutate2 = dbVar.getContext().getResources().getDrawable(R.drawable.filled_stream_crown_outline).mutate();
                    cbVar.f13871t = mutate2;
                    mutate2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21731h5, ebVar.f13988b), mode));
                }
            }
            if (xaVar3.f15066b) {
                cbVar.b(this.f13924r.B);
            } else {
                boolean z13 = xaVar3.f15065a;
                if (!cbVar.f13860i && cbVar.f13867p != z13) {
                    cbVar.f13867p = z13;
                    if (z13) {
                        shortName = LocaleController.getString(R.string.StarsReactionAnonymous);
                    } else {
                        shortName = DialogObject.getShortName(cbVar.f13861j);
                    }
                    oqVarArr = null;
                    cbVar.f13865n = new l01(shortName, 12.0f, null);
                    dbVar.invalidate();
                    i12++;
                    arrayList4 = arrayList;
                    r82 = 1;
                }
            }
            oqVarArr = null;
            i12++;
            arrayList4 = arrayList;
            r82 = 1;
        }
        invalidate();
    }
}
