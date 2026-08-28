package gh;

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
import org.telegram.ui.Components.eq;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.nz0;
public final class ib extends View {
    public final boolean f8311a;
    public final ArrayList f8312b;
    public final ArrayList f8313c;
    public final Paint d;
    public final org.telegram.ui.Components.y5 f8314e;
    public float f8315f;
    public hb h;
    public Utilities.Callback f8316n;
    public final jb f8317r;

    public ib(jb jbVar, Context context, boolean z10) {
        super(context);
        this.f8317r = jbVar;
        this.f8312b = new ArrayList();
        this.f8313c = new ArrayList();
        Paint paint = new Paint(1);
        this.d = paint;
        this.f8314e = new org.telegram.ui.Components.y5(this, 0L, 320L, gr.h);
        this.f8311a = z10;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setStrokeWidth(AndroidUtilities.dp(3.0f));
        paint.setColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23072h5, jbVar.f8368b));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        ArrayList arrayList = this.f8312b;
        this.f8315f = this.f8314e.d(arrayList.size(), false);
        int i9 = 0;
        while (true) {
            ArrayList arrayList2 = this.f8313c;
            if (i9 >= arrayList2.size()) {
                break;
            }
            ((hb) arrayList2.get(i9)).a(canvas);
            i9++;
        }
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            ((hb) arrayList.get(i10)).a(canvas);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i9 = 0;
        while (true) {
            ArrayList arrayList = this.f8312b;
            if (i9 < arrayList.size()) {
                ((hb) arrayList.get(i9)).f8251k.onAttachedToWindow();
                i9++;
            } else {
                return;
            }
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i9 = 0;
        while (true) {
            ArrayList arrayList = this.f8312b;
            if (i9 < arrayList.size()) {
                ((hb) arrayList.get(i9)).f8251k.onDetachedFromWindow();
                i9++;
            } else {
                return;
            }
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        hb hbVar;
        Utilities.Callback callback;
        if (motionEvent.getAction() == 0) {
            hb hbVar2 = this.h;
            if (hbVar2 != null) {
                hbVar2.f8257q.c(false);
            }
            this.h = null;
            int i9 = 0;
            while (true) {
                ArrayList arrayList = this.f8312b;
                if (i9 >= arrayList.size()) {
                    break;
                } else if (((hb) arrayList.get(i9)).f8244b.contains(motionEvent.getX(), motionEvent.getY())) {
                    this.h = (hb) arrayList.get(i9);
                    break;
                } else {
                    i9++;
                }
            }
            hb hbVar3 = this.h;
            if (hbVar3 != null) {
                hbVar3.f8257q.c(true);
            }
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            if (motionEvent.getAction() == 1 && (hbVar = this.h) != null && !hbVar.f8256p && hbVar.f8244b.contains(motionEvent.getX(), motionEvent.getY()) && (callback = this.f8316n) != null) {
                callback.run(Long.valueOf(this.h.f8250j));
            }
            hb hbVar4 = this.h;
            if (hbVar4 != null) {
                hbVar4.f8257q.c(false);
            }
            this.h = null;
        }
        if (this.h == null) {
            return false;
        }
        return true;
    }

    public void setMyPrivacy(long j10) {
        int i9 = 0;
        while (true) {
            ArrayList arrayList = this.f8312b;
            if (i9 < arrayList.size()) {
                hb hbVar = (hb) arrayList.get(i9);
                if (hbVar.f8249i) {
                    hbVar.b(j10);
                    return;
                }
                i9++;
            } else {
                return;
            }
        }
    }

    public void setOnSenderClickListener(Utilities.Callback<Long> callback) {
        this.f8316n = callback;
    }

    public void setSenders(ArrayList<cb> arrayList) {
        ArrayList arrayList2;
        eq[] eqVarArr;
        ArrayList arrayList3;
        ?? r82;
        hb hbVar;
        String shortName;
        ArrayList<cb> arrayList4 = arrayList;
        int i9 = 0;
        while (true) {
            arrayList2 = this.f8312b;
            int size = arrayList2.size();
            eqVarArr = null;
            cb cbVar = null;
            arrayList3 = this.f8313c;
            r82 = 1;
            if (i9 >= size) {
                break;
            }
            hb hbVar2 = (hb) arrayList2.get(i9);
            for (int i10 = 0; i10 < arrayList4.size(); i10++) {
                cb cbVar2 = arrayList4.get(i10);
                boolean z10 = cbVar2.f7943b;
                if ((z10 && hbVar2.f8249i) || (!hbVar2.f8249i && !z10 && cbVar2.f7944c == hbVar2.f8250j)) {
                    cbVar = arrayList4.get(i10);
                    break;
                }
            }
            if (cbVar == null) {
                hbVar2.f8251k.onDetachedFromWindow();
                arrayList2.remove(i9);
                i9--;
                hbVar2.f8243a = -1;
                arrayList3.add(hbVar2);
            }
            i9++;
        }
        int i11 = 0;
        while (i11 < arrayList4.size()) {
            cb cbVar3 = arrayList4.get(i11);
            for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                hb hbVar3 = (hb) arrayList2.get(i12);
                boolean z11 = hbVar3.f8249i;
                if ((z11 && cbVar3.f7943b) || (!z11 && !cbVar3.f7943b && hbVar3.f8250j == cbVar3.f7944c)) {
                    hbVar = (hb) arrayList2.get(i12);
                    break;
                }
            }
            hbVar = eqVarArr;
            if (hbVar == null) {
                for (int i13 = 0; i13 < arrayList3.size(); i13++) {
                    hb hbVar4 = (hb) arrayList3.get(i13);
                    boolean z12 = hbVar4.f8249i;
                    if ((z12 && cbVar3.f7943b) || (!z12 && !cbVar3.f7943b && hbVar4.f8250j == cbVar3.f7944c)) {
                        hbVar = (hb) arrayList3.get(i13);
                        break;
                    }
                }
                if (hbVar != null) {
                    arrayList3.remove(hbVar);
                    hbVar.f8251k.onAttachedToWindow();
                    arrayList2.add(hbVar);
                }
            }
            if (hbVar == null) {
                hbVar = new hb(this, cbVar3.f7943b, cbVar3.f7944c);
                hbVar.d.d(0.0f, r82);
                arrayList2.add(hbVar);
                hbVar.f8245c.d((arrayList4.size() - r82) - i11, r82);
            }
            ib ibVar = hbVar.f8262w;
            jb jbVar = ibVar.f8317r;
            hbVar.f8243a = (arrayList4.size() - r82) - i11;
            long j10 = cbVar3.d;
            Paint paint = hbVar.h;
            hbVar.f8255o = new nz0(oa.R0(j3.r0.n(j10, ',', new StringBuilder("⭐️")), 0.85f, eqVarArr), 12.0f, AndroidUtilities.getTypeface("fonts/num.otf"));
            boolean z13 = ibVar.f8311a;
            int i14 = jbVar.f8369c;
            if (z13) {
                int i15 = (int) j10;
                hbVar.f8247f = new LinearGradient(0.0f, 0.0f, 0.0f, AndroidUtilities.dp(16.0f), new int[]{ih.u.b(i14, i15, 4), ih.u.b(i14, i15, 3)}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                hbVar.f8258r = i0.a.d(0.5f, ih.u.b(i14, i15, 4), ih.u.b(i14, i15, 3));
                paint.setShader(hbVar.f8247f);
            } else {
                paint.setShader(null);
                hbVar.f8258r = -1002750;
                paint.setColor(-1002750);
            }
            Drawable drawable = hbVar.f8259s;
            if (drawable != null) {
                drawable.setColorFilter(new PorterDuffColorFilter(hbVar.f8258r, PorterDuff.Mode.SRC_IN));
            }
            if (this.f8311a) {
                int i16 = i11 + 1;
                hbVar.v = i16;
                hbVar.f8261u = new nz0(j3.r0.l(i16, ""), 10.0f, AndroidUtilities.getTypeface("fonts/num.otf"));
                if (i16 > 0 && hbVar.f8259s == null) {
                    Drawable mutate = ibVar.getContext().getResources().getDrawable(R.drawable.filled_stream_crown).mutate();
                    hbVar.f8259s = mutate;
                    int i17 = hbVar.f8258r;
                    PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                    mutate.setColorFilter(new PorterDuffColorFilter(i17, mode));
                    Drawable mutate2 = ibVar.getContext().getResources().getDrawable(R.drawable.filled_stream_crown_outline).mutate();
                    hbVar.f8260t = mutate2;
                    mutate2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23072h5, jbVar.f8368b), mode));
                }
            }
            if (cbVar3.f7943b) {
                hbVar.b(this.f8317r.A);
            } else {
                boolean z14 = cbVar3.f7942a;
                if (!hbVar.f8249i && hbVar.f8256p != z14) {
                    hbVar.f8256p = z14;
                    if (z14) {
                        shortName = LocaleController.getString(R.string.StarsReactionAnonymous);
                    } else {
                        shortName = DialogObject.getShortName(hbVar.f8250j);
                    }
                    eqVarArr = null;
                    hbVar.f8254n = new nz0(shortName, 12.0f, null);
                    ibVar.invalidate();
                    i11++;
                    arrayList4 = arrayList;
                    r82 = 1;
                }
            }
            eqVarArr = null;
            i11++;
            arrayList4 = arrayList;
            r82 = 1;
        }
        invalidate();
    }
}
