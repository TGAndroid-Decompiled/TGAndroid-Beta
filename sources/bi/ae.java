package bi;

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
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.r11;
import org.telegram.ui.Components.zq;
public final class ae extends View implements org.telegram.ui.ActionBar.p6 {
    public PorterDuffColorFilter f4293a;
    public int f4294b;
    public final boolean f4295c;
    public final ArrayList d;
    public final ArrayList e;
    public final Paint f4296f;
    public final org.telegram.ui.Components.h6 h;
    public float f4297n;
    public zd f4298r;
    public Utilities.Callback f4299s;
    public final be v;

    public ae(be beVar, Context context, boolean z10) {
        super(context);
        this.v = beVar;
        this.d = new ArrayList();
        this.e = new ArrayList();
        Paint paint = new Paint(1);
        this.f4296f = paint;
        this.h = new org.telegram.ui.Components.h6(this, 0L, 320L, ds.h);
        this.f4295c = z10;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setStrokeWidth(AndroidUtilities.dp(3.0f));
        paint.setColor(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23428h5, beVar.f4399b));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        ArrayList arrayList = this.d;
        this.f4297n = this.h.d(arrayList.size(), false);
        int i10 = 0;
        while (true) {
            ArrayList arrayList2 = this.e;
            if (i10 >= arrayList2.size()) {
                break;
            }
            ((zd) arrayList2.get(i10)).a(canvas);
            i10++;
        }
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            ((zd) arrayList.get(i11)).a(canvas);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.d;
            if (i10 < arrayList.size()) {
                ((zd) arrayList.get(i10)).f5875k.onAttachedToWindow();
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
            ArrayList arrayList = this.d;
            if (i10 < arrayList.size()) {
                ((zd) arrayList.get(i10)).f5875k.onDetachedFromWindow();
                i10++;
            } else {
                return;
            }
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        zd zdVar;
        Utilities.Callback callback;
        if (motionEvent.getAction() == 0) {
            zd zdVar2 = this.f4298r;
            if (zdVar2 != null) {
                zdVar2.f5881q.c(false);
            }
            this.f4298r = null;
            int i10 = 0;
            while (true) {
                ArrayList arrayList = this.d;
                if (i10 >= arrayList.size()) {
                    break;
                } else if (((zd) arrayList.get(i10)).f5869b.contains(motionEvent.getX(), motionEvent.getY())) {
                    this.f4298r = (zd) arrayList.get(i10);
                    break;
                } else {
                    i10++;
                }
            }
            zd zdVar3 = this.f4298r;
            if (zdVar3 != null) {
                zdVar3.f5881q.c(true);
            }
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            if (motionEvent.getAction() == 1 && (zdVar = this.f4298r) != null && !zdVar.f5880p && zdVar.f5869b.contains(motionEvent.getX(), motionEvent.getY()) && (callback = this.f4299s) != null) {
                callback.run(Long.valueOf(this.f4298r.f5874j));
            }
            zd zdVar4 = this.f4298r;
            if (zdVar4 != null) {
                zdVar4.f5881q.c(false);
            }
            this.f4298r = null;
        }
        if (this.f4298r == null) {
            return false;
        }
        return true;
    }

    public void setMyPrivacy(long j10) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.d;
            if (i10 < arrayList.size()) {
                zd zdVar = (zd) arrayList.get(i10);
                if (zdVar.f5873i) {
                    zdVar.b(j10);
                    return;
                }
                i10++;
            } else {
                return;
            }
        }
    }

    public void setOnSenderClickListener(Utilities.Callback<Long> callback) {
        this.f4299s = callback;
    }

    public void setSenders(ArrayList<ud> arrayList) {
        ArrayList arrayList2;
        zq[] zqVarArr;
        ArrayList arrayList3;
        ?? r82;
        zd zdVar;
        String shortName;
        ArrayList<ud> arrayList4 = arrayList;
        int i10 = 0;
        while (true) {
            arrayList2 = this.d;
            int size = arrayList2.size();
            zqVarArr = null;
            ud udVar = null;
            arrayList3 = this.e;
            r82 = 1;
            if (i10 >= size) {
                break;
            }
            zd zdVar2 = (zd) arrayList2.get(i10);
            for (int i11 = 0; i11 < arrayList4.size(); i11++) {
                ud udVar2 = arrayList4.get(i11);
                boolean z10 = udVar2.f5532b;
                if ((z10 && zdVar2.f5873i) || (!zdVar2.f5873i && !z10 && udVar2.f5533c == zdVar2.f5874j)) {
                    udVar = arrayList4.get(i11);
                    break;
                }
            }
            if (udVar == null) {
                zdVar2.f5875k.onDetachedFromWindow();
                arrayList2.remove(i10);
                i10--;
                zdVar2.f5868a = -1;
                arrayList3.add(zdVar2);
            }
            i10++;
        }
        int i12 = 0;
        while (i12 < arrayList4.size()) {
            ud udVar3 = arrayList4.get(i12);
            for (int i13 = 0; i13 < arrayList2.size(); i13++) {
                zd zdVar3 = (zd) arrayList2.get(i13);
                boolean z11 = zdVar3.f5873i;
                if ((z11 && udVar3.f5532b) || (!z11 && !udVar3.f5532b && zdVar3.f5874j == udVar3.f5533c)) {
                    zdVar = (zd) arrayList2.get(i13);
                    break;
                }
            }
            zdVar = zqVarArr;
            if (zdVar == null) {
                for (int i14 = 0; i14 < arrayList3.size(); i14++) {
                    zd zdVar4 = (zd) arrayList3.get(i14);
                    boolean z12 = zdVar4.f5873i;
                    if ((z12 && udVar3.f5532b) || (!z12 && !udVar3.f5532b && zdVar4.f5874j == udVar3.f5533c)) {
                        zdVar = (zd) arrayList3.get(i14);
                        break;
                    }
                }
                if (zdVar != null) {
                    arrayList3.remove(zdVar);
                    zdVar.f5875k.onAttachedToWindow();
                    arrayList2.add(zdVar);
                }
            }
            if (zdVar == null) {
                zdVar = new zd(this, udVar3.f5532b, udVar3.f5533c);
                zdVar.d.d(0.0f, r82);
                arrayList2.add(zdVar);
                zdVar.f5870c.d((arrayList4.size() - r82) - i12, r82);
            }
            ae aeVar = zdVar.f5886w;
            be beVar = aeVar.v;
            zdVar.f5868a = (arrayList4.size() - r82) - i12;
            long j10 = udVar3.d;
            Paint paint = zdVar.h;
            zdVar.f5879o = new r11(dd.Q0(org.telegram.messenger.t.i(j10, ',', new StringBuilder("⭐️")), 0.85f, zqVarArr), 12.0f, AndroidUtilities.getTypeface("fonts/num.otf"));
            boolean z13 = aeVar.f4295c;
            int i15 = beVar.f4400c;
            if (z13) {
                int i16 = (int) j10;
                zdVar.f5871f = new LinearGradient(0.0f, 0.0f, 0.0f, AndroidUtilities.dp(16.0f), new int[]{di.u.b(i15, i16, 4), di.u.b(i15, i16, 3)}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                zdVar.f5882r = i0.a.f(0.5f, di.u.b(i15, i16, 4), di.u.b(i15, i16, 3));
                paint.setShader(zdVar.f5871f);
            } else {
                paint.setShader(null);
                zdVar.f5882r = -1002750;
                paint.setColor(-1002750);
            }
            Drawable drawable = zdVar.f5883s;
            if (drawable != null) {
                drawable.setColorFilter(new PorterDuffColorFilter(zdVar.f5882r, PorterDuff.Mode.SRC_IN));
            }
            if (this.f4295c) {
                int i17 = i12 + 1;
                zdVar.v = i17;
                zdVar.f5885u = new r11(ic.a.i(i17, ""), 10.0f, AndroidUtilities.getTypeface("fonts/num.otf"));
                if (i17 > 0 && zdVar.f5883s == null) {
                    Drawable mutate = aeVar.getContext().getResources().getDrawable(R.drawable.filled_stream_crown).mutate();
                    zdVar.f5883s = mutate;
                    int i18 = zdVar.f5882r;
                    PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                    mutate.setColorFilter(new PorterDuffColorFilter(i18, mode));
                    Drawable mutate2 = aeVar.getContext().getResources().getDrawable(R.drawable.filled_stream_crown_outline).mutate();
                    zdVar.f5884t = mutate2;
                    mutate2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23428h5, beVar.f4399b), mode));
                }
            }
            if (udVar3.f5532b) {
                zdVar.b(this.v.E);
            } else {
                boolean z14 = udVar3.f5531a;
                if (!zdVar.f5873i && zdVar.f5880p != z14) {
                    zdVar.f5880p = z14;
                    if (z14) {
                        shortName = LocaleController.getString(R.string.StarsReactionAnonymous);
                    } else {
                        shortName = DialogObject.getShortName(zdVar.f5874j);
                    }
                    zqVarArr = null;
                    zdVar.f5878n = new r11(shortName, 12.0f, null);
                    aeVar.invalidate();
                    i12++;
                    arrayList4 = arrayList;
                    r82 = 1;
                }
            }
            zqVarArr = null;
            i12++;
            arrayList4 = arrayList;
            r82 = 1;
        }
        invalidate();
    }

    @Override
    public final void updateColors() {
        throw new UnsupportedOperationException("Method not decompiled: bi.ae.updateColors():void");
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
