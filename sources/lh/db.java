package lh;

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
import org.telegram.ui.Components.k01;
import org.telegram.ui.Components.mq;
import org.telegram.ui.Components.nr;
public final class db extends View {
    public final boolean f12322a;
    public final ArrayList f12323b;
    public final ArrayList f12324c;
    public final Paint d;
    public final org.telegram.ui.Components.z5 e;
    public float f12325f;
    public cb h;
    public Utilities.Callback f12326n;
    public final eb f12327r;

    public db(eb ebVar, Context context, boolean z4) {
        super(context);
        this.f12327r = ebVar;
        this.f12323b = new ArrayList();
        this.f12324c = new ArrayList();
        Paint paint = new Paint(1);
        this.d = paint;
        this.e = new org.telegram.ui.Components.z5(this, 0L, 320L, nr.h);
        this.f12322a = z4;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setStrokeWidth(AndroidUtilities.dp(3.0f));
        paint.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19977h5, ebVar.f12380b));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        ArrayList arrayList = this.f12323b;
        this.f12325f = this.e.d(arrayList.size(), false);
        int i10 = 0;
        while (true) {
            ArrayList arrayList2 = this.f12324c;
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
            ArrayList arrayList = this.f12323b;
            if (i10 < arrayList.size()) {
                ((cb) arrayList.get(i10)).f12276k.onAttachedToWindow();
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
            ArrayList arrayList = this.f12323b;
            if (i10 < arrayList.size()) {
                ((cb) arrayList.get(i10)).f12276k.onDetachedFromWindow();
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
                cbVar2.f12282q.c(false);
            }
            this.h = null;
            int i10 = 0;
            while (true) {
                ArrayList arrayList = this.f12323b;
                if (i10 >= arrayList.size()) {
                    break;
                } else if (((cb) arrayList.get(i10)).f12270b.contains(motionEvent.getX(), motionEvent.getY())) {
                    this.h = (cb) arrayList.get(i10);
                    break;
                } else {
                    i10++;
                }
            }
            cb cbVar3 = this.h;
            if (cbVar3 != null) {
                cbVar3.f12282q.c(true);
            }
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            if (motionEvent.getAction() == 1 && (cbVar = this.h) != null && !cbVar.f12281p && cbVar.f12270b.contains(motionEvent.getX(), motionEvent.getY()) && (callback = this.f12326n) != null) {
                callback.run(Long.valueOf(this.h.f12275j));
            }
            cb cbVar4 = this.h;
            if (cbVar4 != null) {
                cbVar4.f12282q.c(false);
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
            ArrayList arrayList = this.f12323b;
            if (i10 < arrayList.size()) {
                cb cbVar = (cb) arrayList.get(i10);
                if (cbVar.f12274i) {
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
        this.f12326n = callback;
    }

    public void setSenders(ArrayList<xa> arrayList) {
        ArrayList arrayList2;
        mq[] mqVarArr;
        ArrayList arrayList3;
        ?? r82;
        cb cbVar;
        String shortName;
        ArrayList<xa> arrayList4 = arrayList;
        int i10 = 0;
        while (true) {
            arrayList2 = this.f12323b;
            int size = arrayList2.size();
            mqVarArr = null;
            xa xaVar = null;
            arrayList3 = this.f12324c;
            r82 = 1;
            if (i10 >= size) {
                break;
            }
            cb cbVar2 = (cb) arrayList2.get(i10);
            for (int i11 = 0; i11 < arrayList4.size(); i11++) {
                xa xaVar2 = arrayList4.get(i11);
                boolean z4 = xaVar2.f13365b;
                if ((z4 && cbVar2.f12274i) || (!cbVar2.f12274i && !z4 && xaVar2.f13366c == cbVar2.f12275j)) {
                    xaVar = arrayList4.get(i11);
                    break;
                }
            }
            if (xaVar == null) {
                cbVar2.f12276k.onDetachedFromWindow();
                arrayList2.remove(i10);
                i10--;
                cbVar2.f12269a = -1;
                arrayList3.add(cbVar2);
            }
            i10++;
        }
        int i12 = 0;
        while (i12 < arrayList4.size()) {
            xa xaVar3 = arrayList4.get(i12);
            for (int i13 = 0; i13 < arrayList2.size(); i13++) {
                cb cbVar3 = (cb) arrayList2.get(i13);
                boolean z10 = cbVar3.f12274i;
                if ((z10 && xaVar3.f13365b) || (!z10 && !xaVar3.f13365b && cbVar3.f12275j == xaVar3.f13366c)) {
                    cbVar = (cb) arrayList2.get(i13);
                    break;
                }
            }
            cbVar = mqVarArr;
            if (cbVar == null) {
                for (int i14 = 0; i14 < arrayList3.size(); i14++) {
                    cb cbVar4 = (cb) arrayList3.get(i14);
                    boolean z11 = cbVar4.f12274i;
                    if ((z11 && xaVar3.f13365b) || (!z11 && !xaVar3.f13365b && cbVar4.f12275j == xaVar3.f13366c)) {
                        cbVar = (cb) arrayList3.get(i14);
                        break;
                    }
                }
                if (cbVar != null) {
                    arrayList3.remove(cbVar);
                    cbVar.f12276k.onAttachedToWindow();
                    arrayList2.add(cbVar);
                }
            }
            if (cbVar == null) {
                cbVar = new cb(this, xaVar3.f13365b, xaVar3.f13366c);
                cbVar.d.d(0.0f, r82);
                arrayList2.add(cbVar);
                cbVar.f12271c.d((arrayList4.size() - r82) - i12, r82);
            }
            db dbVar = cbVar.f12287w;
            eb ebVar = dbVar.f12327r;
            cbVar.f12269a = (arrayList4.size() - r82) - i12;
            long j10 = xaVar3.d;
            Paint paint = cbVar.h;
            cbVar.f12280o = new k01(ja.R0(kh.a2.l(j10, ',', new StringBuilder("⭐️")), 0.85f, mqVarArr), 12.0f, AndroidUtilities.getTypeface("fonts/num.otf"));
            boolean z12 = dbVar.f12322a;
            int i15 = ebVar.f12381c;
            if (z12) {
                int i16 = (int) j10;
                cbVar.f12272f = new LinearGradient(0.0f, 0.0f, 0.0f, AndroidUtilities.dp(16.0f), new int[]{nh.t.b(i15, i16, 4), nh.t.b(i15, i16, 3)}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                cbVar.f12283r = i0.a.d(0.5f, nh.t.b(i15, i16, 4), nh.t.b(i15, i16, 3));
                paint.setShader(cbVar.f12272f);
            } else {
                paint.setShader(null);
                cbVar.f12283r = -1002750;
                paint.setColor(-1002750);
            }
            Drawable drawable = cbVar.f12284s;
            if (drawable != null) {
                drawable.setColorFilter(new PorterDuffColorFilter(cbVar.f12283r, PorterDuff.Mode.SRC_IN));
            }
            if (this.f12322a) {
                int i17 = i12 + 1;
                cbVar.v = i17;
                cbVar.f12286u = new k01(kh.a2.j(i17, ""), 10.0f, AndroidUtilities.getTypeface("fonts/num.otf"));
                if (i17 > 0 && cbVar.f12284s == null) {
                    Drawable mutate = dbVar.getContext().getResources().getDrawable(R.drawable.filled_stream_crown).mutate();
                    cbVar.f12284s = mutate;
                    int i18 = cbVar.f12283r;
                    PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                    mutate.setColorFilter(new PorterDuffColorFilter(i18, mode));
                    Drawable mutate2 = dbVar.getContext().getResources().getDrawable(R.drawable.filled_stream_crown_outline).mutate();
                    cbVar.f12285t = mutate2;
                    mutate2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19977h5, ebVar.f12380b), mode));
                }
            }
            if (xaVar3.f13365b) {
                cbVar.b(this.f12327r.B);
            } else {
                boolean z13 = xaVar3.f13364a;
                if (!cbVar.f12274i && cbVar.f12281p != z13) {
                    cbVar.f12281p = z13;
                    if (z13) {
                        shortName = LocaleController.getString(R.string.StarsReactionAnonymous);
                    } else {
                        shortName = DialogObject.getShortName(cbVar.f12275j);
                    }
                    mqVarArr = null;
                    cbVar.f12279n = new k01(shortName, 12.0f, null);
                    dbVar.invalidate();
                    i12++;
                    arrayList4 = arrayList;
                    r82 = 1;
                }
            }
            mqVarArr = null;
            i12++;
            arrayList4 = arrayList;
            r82 = 1;
        }
        invalidate();
    }
}
